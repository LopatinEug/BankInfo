<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@page import="java.util.*"%>
<%@page import="java.lang.*"%>
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
    <link href="MainPage/css/bootstrap.css" rel="stylesheet">
    <link href="MainPage/style_mainpage.css" rel="stylesheet">
    <link href="MainPage/css/font-awesome.css" rel="stylesheet">
    <link href="MainPage/css/fonts.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Lato:300&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
    <style>
        .background-image {
               background-image: url(MainPage/qwer.jpg);
               width: 100%;
               height: 100%;
               -webkit-filter: blur(2px);
               background-attachment: fixed;
           }
     </style>
  </head>

  <body>


   <form action="/bank-1.0/BankInfo">
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
              <option value = "dollar">доллар</option>
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
      <div class="block-info prokrutka">

        <div class="banks-block">
         <% for (int i = 0; i <list.size() ; i++) {%>
          <div class="row">
            <div class="bank-img col-md-2">
              <img src=<%=list.get(i).getImagePath()%> alt="net kartionki" class="round">
            </div>
            <div class="bank-info col-md-10">
              <p><%=list.get(i).getInfo()%></p>
              <!--Button deposits-->
  <button type="button" class="btn btn-depos btn-primary button" id=<%='b'+String.valueOf(list.get(i).getBank_id())%>>Список депозитов</button>
              <br>
              <!--Block Deposits-->
                  <div id=<%="dd"+String.valueOf(list.get(i).getBank_id())%> style="display: none;">
                     <p><%=request.getAttribute("DepositsOf"+list.get(i).getBank_id())%>
                  </div>
                    <%!
                         String s="";
                     %>
                     <%s="depblock"+String.valueOf(list.get(i).getBank_id());
                      System.out.println(s);
                      %>
              <div class=<%=s %>  >
              </div>
            </div>
          </div>
          <hr class="bank-line">
           <% }%>
         </div>
      </div>
    </div>
    </form>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="MainPage/js/bootstrap.js"></script>
    <script type="text/javascript" src="MainPage/jquery-2.2.0.js"></script>

<script type="text/javascript">

$(document).ready(function($) {
  var flag = 0;
  $(".additional-conditions").click(function(){
    if(flag == 0){
      $(".block3").removeClass("block3-hidden");
      $(".block1").removeClass("block1-rehight");
      $(".glyphicon").removeClass("glyphicon-chevron-down");
      $(".glyphicon").addClass("glyphicon-chevron-up");
      $(".block-info").css({height:"310px"});
      flag = 1;
    } else {
      $(".block3").addClass("block3-hidden");
      $(".block1").addClass("block1-rehight");
      $(".glyphicon").removeClass("glyphicon-chevron-up");
      $(".glyphicon").addClass("glyphicon-chevron-down");
      $(".block-info").css({height:"460px"});
      flag = 0;
    }
  })



  class Deposit {
    constructor(nameDep, currency, term, percent){
      this.nameDep = nameDep;
      this.currency = currency;
      this.term = term;
      this.percent = percent;
    }
  }

  class Bank {
    constructor(name, info, link, depos){
      this.name = name;
      this.info = info;
      this.link = link;
      this.depos = class Deposit {
        constructor(nameDep, currency, term, percent){
          this.nameDep = nameDep;
          this.currency = currency;
          this.term = term;
          this.percent = percent;
        }
      }

    }
  }

  var myBank = new Bank("HJK", "info", "link", new Deposit("namedep","curr","term", "perc"));
  console.log(myBank);

  var nameDep = ["Депозит 1", "Депозит 2", "Депозит 3", "Депозит 4"];
  var nadraPercent = ["4.7%", "2.5%", "1.6%", "3.4%"];
  var nadraCurr = ["UAH", "EUR", "RUB", "USD"];
  var nadraTerm =["3 года", "1 год", "2 года", "1,5 года"];


  var nameDep1 = "dpos my";
  var nadraPercent1 = "3.4%";
  var nadraCurr1 = "USD";
  var nadraTerm1 ="1 god";

  var nameDeposit = "<td>"+nameDep1+"</td>";
  var percent = "<td>"+nadraPercent1+"</td>";
  var currency = "<td>"+nadraCurr1+"</td>";
  var term = "<td>"+nadraTerm1+"</td>";


  var countDepositsOfBank = "<tr>"+nameDeposit+percent+currency+term+"</tr>";
  var bankDeposits = document.getElementById("dd1").innerHTML;
  //var firstDeposit = "";
  //var myDeposits = "<table><tr><td>Депозит 1</td><td>4%</td></tr></table>";


  var flag2 = 0;
  $("#b1").click(function(){
    if(flag2 == 0){
      $(".depblock1").append(document.getElementById("dd1").innerHTML);
      $("#b1").text("Свернуть депозиты");
      $("#b1").removeClass("btn-primary");
      $("#b1").addClass("btn-warning");
      flag2 = 1;
    } else {
      $(".depblock1").empty();
      $("#b1").text("Список депозитов");
      $("#b1").removeClass("btn-warning");
      $("#b1").addClass("btn-primary");
      flag2 = 0;
    }
  })
  var flag3 = 0;
    $("#b2").click(function(){
      if(flag3 == 0){
        $(".depblock2").append(document.getElementById("dd2").innerHTML);
        $("#b2").text("Свернуть депозиты");
        $("#b2").removeClass("btn-primary");
        $("#b2").addClass("btn-warning");
        flag3 = 1;
      } else {
        $(".depblock2").empty();
        $("#b2").text("Список депозитов");
        $("#b2").removeClass("btn-warning");
        $("#b2").addClass("btn-primary");
        flag3 = 0;
      }
    })

var flag4 = 0;
  $("#b3").click(function(){
    if(flag4 == 0){
      $(".depblock3").append(document.getElementById("dd3").innerHTML);
      $("#b3").text("Свернуть депозиты");
      $("#b3").removeClass("btn-primary");
      $("#b3").addClass("btn-warning");
      flag4= 1;
    } else {
      $(".depblock3").empty();
      $("#b3").text("Список депозитов");
      $("#b3").removeClass("btn-warning");
      $("#b3").addClass("btn-primary");
      flag4= 0;
    }
  })

var flag5 = 0;
  $("#b4").click(function(){
    if(flag5 == 0){
      $(".depblock4").append(document.getElementById("dd4").innerHTML);
      $("#b4").text("Свернуть депозиты");
      $("#b4").removeClass("btn-primary");
      $("#b4").addClass("btn-warning");
      flag5 = 1;
    } else {
      $(".depblock4").empty();
      $("#b4").text("Список депозитов");
      $("#b4").removeClass("btn-warning");
      $("#b4").addClass("btn-primary");
      flag5 = 0;
    }
  })

var flag6 = 0;
  $("#b5").click(function(){
    if(flag6 == 0){
      $(".depblock5").append(document.getElementById("dd5").innerHTML);
      $("#b5").text("Свернуть депозиты");
      $("#b5").removeClass("btn-primary");
      $("#b5").addClass("btn-warning");
      flag6 = 1;
    } else {
      $(".depblock5").empty();
      $("#b5").text("Список депозитов");
      $("#b5").removeClass("btn-warning");
      $("#b5").addClass("btn-primary");
      flag6 = 0;
    }
  })





});
    </script>
</body>
</html>