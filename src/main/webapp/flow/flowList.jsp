<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form id="pagerForm" method="post" action="<%=request.getContextPath()%>/flow/listFlow.do">
	<input type="hidden" name="basePage.page" value="${basePage.page}" />
	<input type="hidden"  name="numPerPage" value="${basePage.pageSize}" />
	<input type="hidden" name="orderField" value="${basePage.orderField}" />
	<input type="hidden" name="orderDirection" value="${basePage.orderField}" />
</form>
<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="<%=request.getContextPath()%>/flow/listFlow.do" method="post" rel="pagerForm">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					规则流名称：<input type="text" name="name" value="${name}"/>
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">检索</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="<%=request.getContextPath()%>/flow/addFlow.jsp?rel=${rel}" target="dialog" rel="addActionMeta" title="添加规则流" mask="true"><span>添加</span></a></li>
			<li><a class="edit" href="<%=request.getContextPath()%>/flow/showFlow.do?id={sid_user}&rel=${rel}" target="dialog" title="修改规则流" mask="true"><span>修改</span></a></li>
			<li><a class="delete" href="<%=request.getContextPath()%>/flow/deleteFlow.do?id={sid_user}&rel=${rel}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="20">序号</th>
				<th width="150" align="left">规则流名称</th>
				<th width="150" align="left">规则流接口地址</th>
				<th width="50" align="center">操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${basePage.list}"  var="flow" varStatus="index">
			<tr target="sid_user" rel="${flow.id }">
				<td align="center">${index.index+1}</td>
				<td align="left"><a href="<%=request.getContextPath()%>/flow/viewFlow.do?id=${flow.id}" target="dialog">${flow.name}</a></td>
				<td align="left">${flow.url}</td>	
				<td align="center"><a  href="<%=request.getContextPath()%>/flow/listFlowDetail.do?rel=flowDetailList&flowId=${flow.id}" target="navTab" rel="flowDetailList" title="规则流[${flow.name}]属性">属性管理</a></td>	
			</tr>
		</c:forEach>			
		</tbody>
	</table>
<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name='numPerPage' onchange="navTabPageBreak({numPerPage:this.value})">
				<%
					int[] nums={10,15,20,30,40};
					for(int n:nums){
						 out.println("<option value='"+n+"' ");
						 cn.springmvc.util.BasePage bp=(cn.springmvc.util.BasePage)request.getAttribute("basePage");
						 if(bp.getPageSize()==n){
							 out.println(" selected");
						 }
						 out.println(">"+n+"</option>");
						
					}
				%>

				
				
			</select>
			<span>条，共${basePage.recordNum}条</span>
		</div>
		<div class="pagination" targetType="navTab" totalCount="${basePage.recordNum}" numPerPage="${basePage.pageSize}" pageNumShown="${basePage.pageSize }" currentPage="${basePage.page}"></div>
	</div>
</div>
