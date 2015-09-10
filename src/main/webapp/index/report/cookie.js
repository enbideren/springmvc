/**
*author fastw 
*creatTime 2014-1-1
*/

function getCookie(name) {    
	 var nameEQ = name + "=";    
	 var ca = document.cookie.split(';');    //把cookie分割成组    
	 for(var i=0;i < ca.length;i++) {    
		 var c = ca[i];                      //取得字符串    
		 while (c.charAt(0)==' ') {          //判断一下字符串有没有前导空格    
		 c = c.substring(1,c.length);      //有的话，从第二位开始取    
	 }    
		 if (c.indexOf(nameEQ) == 0) {       //如果含有我们要的name    
			 return unescape(c.substring(nameEQ.length,c.length));    //解码并截取我们要值    
		 }    
	 }    
	 return false;    
}    
	    
	//清除cookie    
	function clearCookie(name) {    
	 setCookie(name, "", -1);    
	}    
	var day = 90;
	//设置cookie    
	function addCookie(name, value) {    
		 var expires = "";    
		 if (day != 0 ) {      //设置cookie生存时间    
			 var date = new Date();    
			 date.setTime(date.getTime()+(day* 24 * 60 * 60 * 1000));    
			 expires = "; expires="+date.toGMTString();    
		 }    
		 document.cookie = name+"="+escape(value)+expires+"; path=/";   //转码并赋值    
	}    



function GetQueryString(name){
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}
function initGeneralizeParams(){
	var f = GetQueryString("f");
	var skey = "Generalize.First";
	var lkey = "Generalize.Last";
//	debugger
	if(f!=""&&f!=undefined){
		var first = getCookie(skey);
//		var last = getCookie(lkey);
		var value= '{"f":"'+f+'","d":"'+new Date().getTime()+'","url":"'+window.location.href+'","fromUrl":"'+document.referrer+'"}';
		if(first==null||first==""||first==undefined){
			addCookie(skey, value);
		}
		addCookie(lkey,value);
	}
}
initGeneralizeParams();
//$.cookie('username'); //获得cookie   
//$.cookie('username', '张三'); //设置cookie   
//$.cookie('username', '李四', { expires: 3 }); //设置带时间的cookie 3天   
//$.cookie('username', '', { expires: -1 }); //删除cookie  
//$.cookie('username', null); //删除 cookie  

