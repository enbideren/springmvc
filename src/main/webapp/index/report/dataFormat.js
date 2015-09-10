//init method one 
$(document).ready(function(){ 
var idCard = document.getElementById("idCard").innerHTML;
getBithday(idCard); 
getAge(idCard); 
}); 
//getBithday
function getBithday(idCard){
	var age = idCard.substring( 6, 10)+"."+idCard.substring( 10, 12)+"."+idCard.substring( 12, 14);
	document.getElementById("birthday").innerHTML = age;
}
//getAge
function getAge(idCard){
	var date = new Date();
	var year = date.getFullYear()-parseInt(idCard.substring( 6, 10),10);
	document.getElementById("year").innerHTML = year;
}
