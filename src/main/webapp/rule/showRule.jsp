<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<h2 class="contentTitle">规则详情</h2>
<div class="pageContent">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>规则名称：</dt>
				<dd>
					${rule.name }
				</dd>
			</dl>
			<dl>
				<dt>创建时间：</dt>
				<dd>
					<fmt:formatDate value="${rule.dateEntered}" pattern="yyyy-MM-dd"/>
				</dd>
			</dl>
			<dl>
				<dt>修改时间：</dt>
				<dd>
					<fmt:formatDate value="${rule.dateModified}" pattern="yyyy-MM-dd"/>
				</dd>
			</dl>
			<dl>
				<dt>开始时间：</dt>
				<dd>
					<fmt:formatDate value="${rule.begin}" pattern="yyyy-MM-dd"/>
				</dd>
			</dl>
			<dl>
				<dt>结束时间：</dt>
				<dd>
					<fmt:formatDate value="${rule.end}" pattern="yyyy-MM-dd"/>
				</dd>
			</dl>
			<dl>
				<dt>规则条件：</dt>
				<dd>
					${rule.conditionC }
				</dd>
			</dl>
			<dl>
			
				<dt>规则动作：</dt>
				<dd>
				<div>
					<div id="actionShowUpdate" class="pageContent" layouth="30" style="height: 394px; overflow: auto; ">
					 <c:forEach items="${actionMap}"  var="test" varStatus="index">
					 	<div style="border:1px solid #B8D0D6;padding:5px;margin:1px">${test.key }</div>
					 </c:forEach>
					<c:if test="${actionMap.size==0}"> 
						<div style="border:1px solid #B8D0D6;padding:5px;margin:1px" id="showAddActionUpdate">暂无动作
						</div>
					</c:if>
					</div>
				</div>
				</dd>
			</dl>
		</div>
</div>