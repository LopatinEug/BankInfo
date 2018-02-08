

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
			flag = 1;
		} else {
			$(".block3").addClass("block3-hidden");
			$(".block1").addClass("block1-rehight");
			$(".glyphicon").removeClass("glyphicon-chevron-up");
			$(".glyphicon").addClass("glyphicon-chevron-down");
			flag = 0;
		}
	})

});