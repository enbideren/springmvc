(function(){
	var G = function(){
		this.f = document;
		this.n = navigator.userAgent;
		this.l = this.f.location;
		this.dm = this.f.domain;
		this.w = window.screen;
		this.e = encodeURIComponent;
		this.d = decodeURIComponent;
		this.ref = this.e(this.f.referrer) || "";
		this.h = (location.protocol == "https:");
		this.t = (this.h ? "https://ssllg.geotmt.com" : "http://lg.istreamsche.com") + "/cpa.gif?"    
		this.g = "";
		this.p = "";
	};
	
	G.prototype = {
		init : function(){
			this.D();
			this.s();
		},
		
		D : function(){
			if(self != top){
				var r = document.referrer.split("?")[1];
				this.R(r);
			}else{
				var r = window.location.search.substring(1);
				this.R(r);
			};
		},
		
		R : function(search){
			var o = {};
			var params = search.split("&");
			for(var i = 0; i < params.length; i++){
				var param = params[i].split("=");
				if(2 == param.length){
					o[param[0]] = param[1];
				};
			};
			if(o.executeid != "undefined"){
				this.g = o.executeid || "";
				this.p = o.pid || "";
			};
		},
		
		s : function(){
			if(this.g != ""){
				this.c();
				this.j();
			};
		},
		
		c : function(){
			this._d = this.dm.split('.')[0];
			this._d = this.dm.replace(this._d+'.', '');
			this.objHours = 744;
			this.date = new Date();
			this.ms = this.objHours * 3600 * 1000;
			this.date.setTime(this.date.getTime() + this.ms);
			this.str = "GEOTMT=" + escape('ref=' + this.ref + '&executeid=' + this.g + '&pid=' + this.p) + ";path=/;domain=" + this._d;
			document.cookie = this.str + "; expires=" +  this.date.toGMTString();
		},
		
		j : function(){
			this.url = this.t + "ref=" + this.e(this.ref) + "&executeid=" + this.g + "&pid=" + this.p + "&r=" + Math.random()*99999;
			this.n = "t_" + (new Date()).getTime() + Math.random()*9999;
			this.img = window[this.n] = new Image(1,1);
			this.img.onload = (this.img.onerror = function(){window[this.n] = null});			
			this.img.src = this.url;
			this.url = null;
			this.n = null;
			this.img = null;
		}
	};

	var f = new G();
	f.init();
})();



