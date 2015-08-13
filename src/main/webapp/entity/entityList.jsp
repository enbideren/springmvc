<%@ page language="java" import="java.util.*,cn.springmvc.util.BasePage" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form id="pagerForm" method="post" action="<%=request.getContextPath()%>/entity/listEntity.do">
	<input type="hidden"  name="pageNum" value="${basePage.page}" />
	<input type="hidden"  name="numPerPage" value="${basePage.pageSize}" />
	<input type="hidden" name="orderField" value="${basePage.orderField}" />
	<input type="hidden" name="orderDirection" value="${basePage.orderField}" />
</form>
<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="<%=request.getContextPath()%>/entity/listEntity.do" method="post" rel="pagerForm">
	
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					实体名称：<input type="text" name="entityName" value="${requestScope.entityName }"/>
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
			<li><a class="add" href="<%=request.getContextPath()%>/entity/addEntity.jsp?rel=${rel}" target="dialog"  title="添加实体" mask="true"><span>添加</span></a></li>
			<li><a class="edit" href="<%=request.getContextPath()%>/entity/showEntity.do?id={sid_user}&rel=${rel}" target="dialog" title="修改实体" mask="true"><span>修改</span></a></li>
			<li><a class="delete" href="<%=request.getContextPath()%>/entity/deleteEntity.do?id={sid_user}&rel=${rel}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>							    
				<th width="30">序号</th>
				<th width="240" orderfield="entityName"  align="left" >实体显示名称</th>
				<th width="240"  align="left">实体标识名</th>
				<th width="240" align="left" >实体包名</th>
				<th width="240" align="center">操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${basePage.list}"  var="entity" varStatus="index">
			<tr target="sid_user" rel="${entity.id}">							  
				<td align="center">${index.index+1}</td>
				<td align="left">${entity.name}</td>
				<td align="left">${entity.identify }</td>
				<td align="left">${entity.packageC }</td>
				<td align="center"><a  href="<%=request.getContextPath()%>/entity/listEntityItem.do?rel=entityItemList&typeId=${entity.id}" target="navTab" rel="entityItemList" title="实体[${entity.name}]属性">属性管理</a></td>
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
		<div class="pagination" targetType="navTab" totalCount="${basePage.recordNum}" numPerPage="${basePage.pageSize}" pageNumShown="${basePage.pageSize}" currentPage="${basePage.page}"></div>
	</div>
</div>
