/**
 * author fastw creatTime 2014-1-27
 */
// 聚效----推广js 核心代码
var _mvq = window._mvq || [];
window._mvq = _mvq;
_mvq.push([ '$setAccount', 'm-122918-0' ]);
_mvq.push([ '$setGeneral', '', '', /* 用户名 */'', /* 用户id */'' ]);
_mvq.push([ '$logConversion' ]);
(function() {
	var mvl = document.createElement('script');
	mvl.type = 'text/javascript';
	mvl.async = true;
	mvl.src = ('https:' == document.location.protocol ? 'https://static-ssl.mediav.com/mvl.js'
			: 'http://static.mediav.com/mvl.js');
	var s = document.getElementsByTagName('script')[0];
	s.parentNode.insertBefore(mvl, s);
})();
var tiaozhuan_all;
// 聚效----回调代码
function pushRegistered(userId, _url) {

	// var _mvq = window._mvq || [];window._mvq = _mvq;
	// _mvq.push(['$setAccount', 'm-122918-0']);
	// _mvq.push(['$setGeneral', 'registered', '', '',userId]);
	// _mvq.push(['$logConversion']);

	var mv_img=new Image();
	mv_img.src="https://secure.mediav.com/t?type=3&db=none&jzqv=3&qzjpt=registered&jzqs=m-122918-0&jzqt=tran&jzqo="+userId+"&jzqot=0&jzqo4=0";

	push_adwqRegistered(userId);
	// push_geoRegistered(userId);
	tiaozhuan_all = _url;
	setTimeout("exeLocathion()", 1800);
}
function exeLocathion() {
	location.href = tiaozhuan_all;
}
// 生成UUID
function guid() {
	return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
		var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);
		return v.toString(16);
	});
}
// 亿玛

var _adwq = _adwq || [];
_adwq.push([ '_setAccount', 'wqbnw' ]);
_adwq.push([ '_setDomainName', '.xyqb.com' ]);
_adwq.push([ '_trackPageview' ]);

(function() {
	var adw = document.createElement('script');
	adw.type = 'text/javascript';
	adw.async = true;
	adw.src = ('https:' == document.location.protocol ? 'https://ssl'
			: 'http://s')
			+ '.emarbox.com/js/adw.js';
	var s = document.getElementsByTagName('script')[0];
	s.parentNode.insertBefore(adw, s);
})();

// 聚效----回调代码
function push_adwqRegistered(userId) {
	// 注册ID(此处不需要修改),// 请输入注册用户名 或 注册用户ID (必填，后期核对数据),// 事件价值 (可选)
	_adwq.push([ '_setAction', '847vzv', userId, '' ]);

}
// geo----回调代码,不能用
function push_geoRegistered(userId) {
	var userid = userId;
	// geo_protocol = (location.protocol == "https:");
	document.write('<script type="text/javascript" async="async" src="'
			+ (geo_protocol ? "https://sslcdn.geotmt.com"
					: "http://ga.istreamsche.com")
			+ '/CPA/GEO_REGISTER.js"></scri' + 'pt>');

	// document.write('<script type="text/javascript" async="async" src="'+
	// (geo_protocol ? "https://sslcdn.geotmt.com" :
	// "http://ga.istreamsche.com") +'/CPA/GEO_REACH.js"></scri'+'pt>');
}

// <!--到达-->

var geo_protocol = (location.protocol == "https:");
document.write('<script type="text/javascript" async="async" src="'
		+ (geo_protocol ? "https://sslcdn.geotmt.com"
				: "http://ga.istreamsche.com") + '/CPA/GEO_REACH.js"></scri'
		+ 'pt>');
// document.write('<link rel="stylesheet" type="text/css"
// href="/css/guide.css">');

// <!--到达 END-->
// <!--注册成功后--> 在arc_all 页面中

// <!--百度统计-->
var _hmt = _hmt || [];
(function() {
	var hm = document.createElement("script");
	hm.src = "//hm.baidu.com/hm.js?63b244bf1e8afb73555599e2f859b985";
	var s = document.getElementsByTagName("script")[0];
	s.parentNode.insertBefore(hm, s);
})();

// <!--谷歌统计-->
(function(i, s, o, g, r, a, m) {
	i['GoogleAnalyticsObject'] = r;
	i[r] = i[r] || function() {
		(i[r].q = i[r].q || []).push(arguments)
	}, i[r].l = 1 * new Date();
	a = s.createElement(o), m = s.getElementsByTagName(o)[0];
	a.async = 1;
	a.src = g;
	m.parentNode.insertBefore(a, m)
})(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

ga('create', 'UA-58525863-1', 'auto');
ga('send', 'pageview');

// -------------------------------------------------
