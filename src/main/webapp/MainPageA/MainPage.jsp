<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="dao.BankDaoMock"%>
<%@page import="dao.BankDao"%>
<%@page import="entity.Bank"%>
<html lang="ru">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bank Info.</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="style_mainpage.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/fonts.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Lato:300&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
    <style>
            .background-image {
                   background-image: url(MainPageA/qwer.jpg);
                   width: 100%;
                   height: 100%;
                   -webkit-filter: blur(2px);
                   background-attachment: fixed;
               }
         </style>
  </head>

  <body>


   <form action="/bank/BankInfo">
   <%!
        BankDao banks=new BankDaoMock();
        ArrayList<Bank> list=banks.selectAll();;
   %>

    <div class="wrapper">

      <div class="background-image">
        <div class="dark-layer"></div>
      </div>

      <div class="block1 block1-rehight">
        <br>
        <div class="inputs">
          <div class="input">
            <p>Сумма, до</p>
            <input type="text"  name = "paramSum"  value="200000">
          </div>
          <div class="input">
            <p>Валюта</p>
            <select name = "paramCurrency">
              <option value = "hryvna">гривна</option>
              <option value = "dollar">доллар США</option>
              <option value = "euro">евро</option>
            </select>
          </div>
          <div class="input">
            <p>Срок</p>
             <select name = "paramTerm">
              <option value = "3">3 месяца</option>
              <option value = "6">6 месяца</option>
              <option value = "9">9 месяцев</option>
              <option value = "12">1 год</option>
              <option value = "18">1.5 года</option>
              <option value = "24">2 года</option>

            </select>
          </div>

        </div>
      <br>
      <hr>
      <div class="block2">
        <div class="group_with2_elem">
          <div class="myButton">
           <input type="submit" value="Найти" >
          </div>
          <div class="additional-conditions">
            <p>Дополнительные условия <span class="glyphicon glyphicon-chevron-down"></span></p>
          </div>
        </div>
        <br>  
        <div class="block3 block3-hidden">
          <hr>
          <div class="input">
            <p>Выплата процентов</p>
            <select name = "paramPayment">
              <option value = "none">Все равно</option>
              <option value = "В конце срока">в конце срока</option>
              <option value = "Ежемесячно">ежемесячно</option>
              <option value = "Капитализация">капитализация</option>
            </select>
          </div> 
          <div class="input">
            <p>Пополнение</p>
            <select name = "paramRefill">
              <option value = "none">Все равно</option>
              <option value = "true">Да</option>
              <option value = "false">Нет</option>
            </select>
          </div>
          <div class="input">
            <p>Частичное снятие</p>
            <select>
              <option>Все равно</option>
              <option>Да</option>
              <option>Нет</option>
            </select>
          </div> 
          <div class="input">
            <p>Досрочное снятие</p>
            <select name = "paramEarlyClose">
               <option value = "none">Все равно</option>
               <option value = "true">Да</option>
               <option value = "false">Нет</option>
            </select>
          </div> 
          <div class="input">
            <p>Банк</p>
            <select name = "paramBank">
              <option value = "none">Все равно</option>

                <% for (int i = 0; i <list.size() ; i++) {%>
                    <option value=<%=String.valueOf(list.get(i).getBank_id())%>> <%=list.get(i).getName()%></option>
                        <% } %>
              <option value = "6">Universal Bank</option>
            </select>
          </div>
        </div>
      </div>
      </div>
    </div>
    </form>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script type="text/javascript" src="jquery-2.2.0.js"></script>
    <script type="text/javascript" src="javascript_mainpage.js"></script>
  </body>
</html>