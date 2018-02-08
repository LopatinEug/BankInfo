package controller;


import dao.BankDaoMock;
import dao.DepositDao;
import entity.Bank;
import entity.Deposit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by Евгений on 15.11.2017.
 */

public class BankInfoController extends HttpServlet {
    BankDaoMock Bdao=new BankDaoMock();
    DepositDao Ddao =Bdao.getDepDao();

    public String selectByBank(List<Deposit> list, int bankid) throws Exception {
        String s="";
        s="<table border=\"1\" style='margin-left: 50px' ><tr><th class='th1'>Название депозита  </th><th class='th1'>Процентная ставка  </th><th class='th1'>Валюта  </th><th class='th1'>Срок</th></tr>";
        Bank b=Bdao.select(bankid);
        for (Deposit deposit:list) {
            if(deposit.getBank()==b) s+="<tr>"+"<td>"+deposit.getName()+"</td>"+"<td>"+deposit.getPercent()+ " % " +"</td>"+"<td>"+ deposit.getCurrency()+ "</td>"+"<td>"+ deposit.getTerm()+ "месяцев(а)"+"</td>"+"</tr>";
        }
        s=s+"</table>";
        return s;
    }


    @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  System.out.println("GetStarted!");
     Enumeration params = request.getParameterNames();
     System.out.println();
     while (params.hasMoreElements()){
         String a=params.nextElement().toString();
         System.out.print(a+": "+request.getParameter(a));
     } System.out.println();



     String Acurrency=request.getParameter("paramCurrency");
     Bank Abank=null;

     int Aterm= Integer.parseInt(request.getParameter("paramTerm"));

     String bid=request.getParameter("paramBank");
     if(bid.equals("none"))Abank=null;
     else {
         try {
             Abank=Bdao.select(Integer.parseInt(bid));
         } catch (Exception e) {
             e.printStackTrace();
         }
     }


     Boolean aEarlyClose;
     String pEaC=request.getParameter("paramEarlyClose");
     if(pEaC.equals("none"))aEarlyClose=null;
     else aEarlyClose= Boolean.valueOf(pEaC);


     Boolean aRefill;
     String pRef=request.getParameter("paramRefill");
     if(pRef.equals("none"))aRefill=null; else aRefill= Boolean.valueOf(pRef);

     String aPayment;
     String pPay=request.getParameter("paramPayment");
     if(pPay.equals("none")){aPayment=null;}
     else{ aPayment= pPay;}



     List <Deposit> result=Ddao.selectByParams(Acurrency,Aterm,aPayment,aRefill,aEarlyClose,Abank);

        for (Bank b:Bdao.selectAll()) {
            try {
                request.setAttribute("DepositsOf"+b.getBank_id(),selectByBank(result,b.getBank_id()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

  //  request.setAttribute("aaa","aaa");

        Enumeration attributes= request.getAttributeNames();

     while (attributes.hasMoreElements()){
         String str=attributes.nextElement().toString();
         System.out.println(str+": "+ request.getAttribute(str));
     } System.out.println();

     //System.out.println(request.getParameter("paramCurrency"));
     request.getRequestDispatcher("MainPage/MainPage.jsp").forward( request,response);

  System.out.println("GetFinished!");
 }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PostStarted!");
        req.getRequestDispatcher("MainPage.jsp").forward(req,resp);
        System.out.println("PostFinished!");
    }

}
