<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="copyright" content="2014 CreditWallet, Inc.">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0,user-scalable=no">
<meta name="format-detection" content="telephone=no,email=no,adress=no">
<link href="./report/ke.css" rel="stylesheet" type="text/css">
<title>个人分析报告</title>
</head>
<body>
	<script type="text/javascript" src="./report/jquery-1.11.0.min.js"></script>
	<script type="text/javascript" src="./report/dataFormat.js"></script>
	<script type="text/javascript"
		src="./report/jquery-migrate-1.2.1.min.js"></script>
	<div class="main">
		<h1 align="center">个人分析报告</h1>
		<div class="info">
			<dl>
				<dd>报告编号：</dd>
				<dt>2014112024009217232031</dt>
				<dd>报告时间：</dd>
				<dt><fmt:formatDate value="${apply.applyTime}" pattern="yyyy年MM月dd日 HH:mm:ss" /></dt>
				<div class="clear"></div>
			</dl>
			<dl>
				<dd>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</dd>
				<dt>${apply.userName}</dt>
				<dd>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</dd>
				<dt>
					<c:if test="${apply.gender==1}">男</c:if>
					<c:if test="${apply.gender==0}">女</c:if>
				</dt>
				<div class="clear"></div>
			</dl>
			<dl>
				<dd>证件类型：</dd>
				<dt>身份证</dt>
				<dd>证件号码：</dd>
				<dt id="idCard">${apply.idCard}</dt>
				<dd style="width: 130px">是否实名认证：</dd>
				<dt>是</dt>
				<div class="clear"></div>
			</dl>
			<dl>
				<dd>常用手机：</dd>
				<dt>${apply.phoneNum}</dt>
				<div class="clear"></div>
			</dl>
		</div>
		<br>
			<div align="center">
				<a href="#business"><font size="6">电商信息</font></a>&nbsp;&nbsp;
				<a href="#loan"><font size="6">贷款申请信息</font></a>&nbsp;&nbsp;
				<a href="#apply"><font size="6">进件结果</font></a>&nbsp;&nbsp;
				<a href="#cheat"><font size="6">反欺诈结果</font></a>&nbsp;&nbsp;
				<a href="#credit"><font size="6">信用管理结果</font></a>&nbsp;&nbsp;
				<a href="#check"><font size="6">人工审核</font></a>		
			</div>
		<a name="baseInfo"></a>
		<div class="box">
			<div class="tit">基本信息</div>
			<div class="com">
				<dl class="bas_in">
					<dd>出生年月</dd>
					<dt id="birthday"></dt>
					<dd>年龄</dd>
					<dt id ="year"></dt>
					<dd>户籍</dd>
					<dt>${apply.address }</dt>


					<div class="clear"></div>
				</dl>
				<dl class="bas_in">
					<dd>学历</dd>
					<dt>本科</dt>
					<dd>职业</dd>
					<dt>
						<c:if test="${apply.industry ==0}">制造业</c:if>
						<c:if test="${apply.industry ==1}">服务业</c:if>
						<c:if test="${apply.industry ==2}">其他</c:if>
					</dt>
					<dd>企业类型</dd>
					<dt>
						<c:if test="${apply.companyType ==2}">国企</c:if>
						<c:if test="${apply.companyType ==1}">外资</c:if>
						<c:if test="${apply.companyType ==0}">私企</c:if>
					</dt>

					<div class="clear"></div>
				</dl>
				<dl class="bas_in">

					<dd>职位</dd>
					<dt>
						<c:if test="${apply.position ==2}">企业法人、CEO</c:if>
						<c:if test="${apply.position ==1}">经理及主管</c:if>
						<c:if test="${apply.position ==0}">普通员工</c:if>
					</dt>
					<dd>总工龄</dd>
					<dt>
						<c:if test="${apply.workTime ==2}">7年及以上</c:if>
						<c:if test="${apply.workTime ==1}">3到7年</c:if>
						<c:if test="${apply.workTime ==0}">3年及以下</c:if>
					</dt>
					<dd>年收入</dd>
					<dt>${apply.salary }元</dt>


					<div class="clear"></div>
				</dl>
				<dl class="bas_in">
					<dd>邮箱</dd>
					<dt>${apply.email }</dt>
					<dd>紧急联系人姓名</dd>
					<dt>${apply.contactName }</dt>
					<dd>紧急联系人号码</dd>
					<dt>${apply.contactPhoneNum }</dt>

					<div class="clear"></div>
				</dl>

			</div>
		</div>
		<a name="business"></a>
		<div class="box">
			<div class="tit">电商信息</div>
			<div class="com">
				<table width="100%" border="0" cellspacing="1" cellpadding="0"
					class="tab">
					<tbody>
						<!-- <tr>
							<th>账户名称</th>
							<th>账户类型</th>
							<th>匹配结果</th>
						</tr> -->
						<tr>
							<td width="50%">电商开户日期</td>
							<td><fmt:formatDate value="${apply.bnRegisterTime }" pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
						</tr>
						<tr>
							<td>电商订单号</td>
							<td>${apply.bnOrderNum }</td>
						</tr>
						<tr>
							<td>电商收货手机号</td>
							<td>${apply.bnRecivePhone }</td>
						</tr>
						<tr>
							<td>近1年成功交易订单数</td>
							<td>${apply.bnAllTimes }</td>
						</tr>
						<tr>
							<td>近1年成功交易订总金额</td>
							<td>${apply.bnAllMoney }&nbsp;元</td>
						</tr>
						<tr>
							<td>近1年客户金额退拒收率</td>
							<td>${apply.bnBackRate }</td>
						</tr>
						<tr>
							<td>近1年月均交易金额</td>
							<td>${apply.bnMonthMoney }&nbsp;元</td>
						</tr>
						<tr>
							<td>近1年客单价</td>
							<td>${apply.price }&nbsp;元</td>
						</tr>
						<tr>
							<td>近1年件单价</td>
							<td>${apply.bnAvgPrice }&nbsp;元</td>
						</tr>
						<tr>
							<td>近1年最常用收货地址的城市等级</td>
							<td>
								<c:if test="${apply.reciveAddr ==2}">一线城市</c:if>
								<c:if test="${apply.reciveAddr ==1}">二线城市</c:if>
								<c:if test="${apply.reciveAddr ==0}">三线城市</c:if>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

		<a name="loan"></a>
		<div class="box">
			<div class="tit">贷款申请信息</div>
			<div class="com">
				<table width="100%" border="0" cellspacing="1" cellpadding="0"
					class="tab">
					<tbody>
						<tr>
							<td width="50%">申请金额</td>
							<td>${apply.applyMoney }&nbsp;元</td>
						</tr>
						<tr>
							<td>申请期数</td>
							<td>${apply.applyRepayTime }&nbsp;个月</td>
						</tr>
						<tr>
							<td>申请利率</td>
							<td>${apply.applyRate }</td>
						</tr>
						<tr>
							<td>申请期限</td>
							<td>${apply.applyDeadline }</td>
						</tr>
						<tr>
							<td>适用产品编号</td>
							<td>${apply.fitProduct }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	
		<a name="apply"></a>
		<div class="box">
			<div class="tit">进件结果</div>
			<div class="com">
				<table width="100%" border="0" cellspacing="1" cellpadding="0" class="tab">
					<tbody>
						<tr>
							<td width="50%">进件时间</td>
							<td><fmt:formatDate value="${apply.applyTime }" pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
						</tr>
						<tr>
							<td>进件预审结果</td>
							<td>
								<c:if test="${apply.preResult ==3}">贷款申请受理</c:if>
								<c:if test="${apply.preResult ==22}">申请人重新提交</c:if>
								<c:if test="${apply.preResult ==21}">不符合贷款条件，拒绝</c:if>
							</td>
						</tr>
						<tr>
							<td>进件预审时间</td>
							<td><fmt:formatDate value="${apply.preDate }" pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
						</tr>
						<tr>
							<td>客户预分类</td>
							<td>
								<c:if test="${apply.userType =='A'}">企业高管，高级技术人员</c:if>
								<c:if test="${apply.userType =='B'}">高学历</c:if>
								<c:if test="${apply.userType =='C'}">其他客户</c:if>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

		<a name="cheat"></a>
		<div class="box">
			<div class="tit">反欺诈结果</div>
			<div class="com">
				<table width="100%" border="0" cellspacing="1" cellpadding="0" class="tab">
					<tbody>
						<tr>
							<td width="50%">反欺诈结果标示</td>
							<td>
								<c:if test="${apply.cheatType==null }">尚不存在</c:if>
								<c:if test="${apply.cheatType!=null }">${apply.cheatType}</c:if>
							</td>
						</tr>
						<tr>
							<td>欺诈备注</td>
							<td>
								<c:if test="${apply.cheatContent==null }">无</c:if>
								<c:if test="${apply.cheatContent!=null }">${apply.cheatContent}</c:if>
							</td>
						</tr>
						<tr>
							<td>创建时间</td>
							<td><fmt:formatDate value="${apply.cheatTime }" pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
		<a name="credit"></a>
		<div class="box">
			<div class="tit">信用管理结果</div>
			<div class="com">
				<table width="100%" border="0" cellspacing="1" cellpadding="0" class="tab">
					<tbody>
						<tr>
							<td width="50%">评分</td>
							<td>${apply.score }</td>
						</tr>
						<tr>
							<td>评分审批结果</td>
							<td>
								<c:if test="${apply.creditCheckRst ==0}">拒绝</c:if>
								<c:if test="${apply.creditCheckRst ==1}">通过</c:if>
							</td>
						</tr>
						<tr>
							<td>评分等级</td>
							<td>${apply.grade }</td>
						</tr>
						<tr>
							<td>消费类基本额度</td>
							<td>${apply.baseQuota }</td>
						</tr>
						<tr>
							<td>消费类可用额度</td>
							<td>${apply.enableQuota }</td>
						</tr>
						<tr>
							<td>评分时间</td>
							<td><fmt:formatDate value="${apply.creditCheckTime }" pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
						</tr>
						<tr>
							<td>评分理论利率</td>
							<td>${apply.creditCheckRate }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
		<a name="check"></a>
		<div class="box">
			<div class="tit">人工审核</div>
			<div class="com">
			<form action="" method="post">
				审批阶段：<input type="radio" value="1" name="verifyStep">初审
						 <input type="radio" value="2" name="verifyStep">抽审
						 <input type="radio" value="3" name="verifyStep">复审<br><br>
				审批结果：
					<input type="radio" value="1" name="verifyResult">通过<br><br>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="0" name="verifyResult">不通过&nbsp;&nbsp;
					拒绝原因：
		            <select name="verifyMark">
			          <option value="A">1.信用风险</option>
			          <option value="Q">2.欺诈风险</option>
			          <option value="T">3.主动取消</option>
			          <option value="C">4.无法联系</option>
			        </select><br><br>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="-1" name="verifyResult">未初审<br><br>
				备注：<br><br>
	            <center>
	            	<textarea name="verifyContent" rows="5" cols="150"></textarea><br><br>
	            	<input type="submit" value="提交" style="width: 100px;height:50px;font-size:medium;font-weight: bold;">
	            </center>
	            <br><br>
			</form>
			</div>
		</div>
		
		<div></div>
	</div>
</body>
</html>