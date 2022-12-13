
$(document).ready(function(){
  $(window).scroll(function(){
  	var scroll = $(window).scrollTop();
	  if (scroll > 300) {
	    $("#36488a").css("background" , "blue");
	  }

	  else{
		  $("#36488a").css("background" , "#333");  	
	  }
  })
})