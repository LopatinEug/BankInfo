

$(document).ready(function($) {
	
	//Нажимаем на кнопку "Ещё"
	/*var flag=0;
	$(".more").click(function() {
		if(flag==0){
			$(".more_description").text("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cum consequuntur libero perferendis quisquam vero dicta asperiores aperiam similique assumenda quas repellendus atque ipsum, earum aut consequatur saepe modi, dolores fugiat.");
			$(".more").text("Свернуть");
			$(".more_description").append('<button type="button" class="btn btn-primary">Третий</button>');
			flag = 1;
		} else {
			$(".more_description").text("");
			$(".more").text("Ещё");
			flag = 0;
		}
	})*/

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


/*
<table>
      <tr>
        <th>Название депозита</th>
        <th>Процентная ставка</th>
        <th>Валюта</th>
        <th>Срок</th>
      </tr>
      <tr>
        <td>Depos 1</td>
        <td>Depo fhdsjk4</td>
        <td>Depo 4</td>
        <td>Depo 5</td>
      </tr>
      <tr>
        <td>Depos 1</td>
        <td>Depo fhdsjk4</td>
        <td>Depo 4</td>
        <td>Depo 5</td>
      </tr>
      <tr>
        <td>Depos 1</td>
        <td>Depo fhdsjk4</td>
        <td>Depo 4</td>
        <td>Depo 5</td>
      </tr>
    </table>
*/


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


	/*var kolvodepositov = 0;
	for(int i = 0; i < nameDep.lenght; i++){
		for(int j = 0; j < 4; j++){
			
		}		
	}*/

	var countDepositsOfBank = "<tr>"+nameDeposit+percent+currency+term+"</tr>";
	var bankDeposits = "<table style='margin-left: 50px'><tr><th>Название депозита</th><th>Процентная ставка</th><th>Валюта</th><th>Срок</th></tr>"+countDepositsOfBank+"</table>";
	//var firstDeposit = "";
	var myDeposits = "<table><tr><td>Депозит 1</td><td>4%</td></tr></table>";


	var flag2 = 0;
	$(".buttonOne").click(function(){
		if(flag2 == 0){
			$(".depBlockOne").append(bankDeposits);
/*			$(".depBlockOne").append(myDeposits);
			$(".depBlockOne").append(myDeposits);
			$(".depBlockOne").append(myDeposits);*/
			$(".buttonOne").text("Свернуть депозиты");
			$(".buttonOne").removeClass("btn-primary");
			$(".buttonOne").addClass("btn-warning");
			flag2 = 1;
		} else {
			$(".depBlockOne").empty();
			$(".buttonOne").text("Список депозитов");
			$(".buttonOne").removeClass("btn-warning");
			$(".buttonOne").addClass("btn-primary");
			flag2 = 0;
		}
	})


	var flag3 = 0;
	$(".buttonTwo").click(function(){
		if(flag3 == 0){
			$(".depBlockTwo").append(bankDeposits);
			$(".buttonTwo").text("Свернуть депозиты");
			$(".buttonTwo").removeClass("btn-primary");
			$(".buttonTwo").addClass("btn-warning");
			flag3 = 1;
		} else {
			$(".depBlockTwo").empty();
			$(".buttonTwo").text("Список депозитов");
			$(".buttonTwo").removeClass("btn-warning");
			$(".buttonTwo").addClass("btn-primary");
			flag3 = 0;
		}
	})


	var flag4 = 0;
	$(".buttonThree").click(function(){
		if(flag4 == 0){
			$(".depBlockThree").append(bankDeposits);
			$(".buttonThree").text("Свернуть депозиты");
			$(".buttonThree").removeClass("btn-primary");
			$(".buttonThree").addClass("btn-warning");
			flag4 = 1;
		} else {
			$(".depBlockThree").empty();
			$(".buttonThree").text("Список депозитов");
			$(".buttonThree").removeClass("btn-warning");
			$(".buttonThree").addClass("btn-primary");
			flag4 = 0;
		}
	})



	var flag5 = 0;
	$(".buttonFour").click(function(){
		if(flag5 == 0){
			$(".depBlockFour").append(bankDeposits);
			$(".buttonFour").text("Свернуть депозиты");
			$(".buttonFour").removeClass("btn-primary");
			$(".buttonFour").addClass("btn-warning");
			flag5 = 1;
		} else {
			$(".depBlockFour").empty();
			$(".buttonFour").text("Список депозитов");
			$(".buttonFour").removeClass("btn-warning");
			$(".buttonFour").addClass("btn-primary");
			flag5 = 0;
		}
	})


});