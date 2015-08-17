<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form id="pagerForm" method="post" action="<%=request.getContextPath()%>/entity/listEntityItem.do">
	<input type="hidden"  name="pageNum" value="${basePage.page}" />
	<input type="hidden"  name="numPerPage" value="${basePage.pageSize}" />
	<input type="hidden" name="orderField" value="${basePage.orderField}" />
	<input type="hidden" name="orderDirection" value="${basePage.orderField}" />
</form>
<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="<%=request.getContextPath()%>/entity/listEntityItem.do" method="post" rel="pagerForm">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					实体属性名称：<input type="text" name="entityItemName" value="${requestScope.entityItemName }"/>
				</td>
				<td>
					<input type="hidden" name="typeId" value="${typeId}"/>
					<input type="hidden" name="rel" value="${rel }"/>
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
			<li><a class="add" href="<%=request.getContextPath()%>/entity/showItem.do?typeId=${entity.id}&rel=${rel}" target="dialog" title="添加实体属性" mask="true"><span>添加</span></a></li>
			<li><a class="edit" href="<%=request.getContextPath()%>/entity/showEntityItem.do?id={sid_user}&rel=${rel}" target="dialog" title="修改实体属性" mask="true"><span>修改</span></a></li>
			<li><a class="delete" href="<%=request.getContextPath()%>/entity/deleteEntityItem.do?typeId=${requestScope.typeId}&id={sid_user}&rel=${rel}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="30">序号</th>			   
				<th width="240" align="left">属性字段</th>
				<th width="240" align="left">属性名称</th>
				<th width="240" align="left">属性描述</th>
				<th width="240" align="left">实体</th>									
			</tr>
		</thead>
		<tbody>	
		<c:forEach items="${basePage.list}"  var="item" varStatus="index">	
			<tr target="sid_user" rel="${item.id }">	
				<td align="center">${index.index+1}</td>		    
				<td align="left">${item.field}</td>
				<td align="left">${item.name}</td>
				<td align="left">${item.description}</td>
				<td align="left">${entity.name}</td>				
			</tr>
		</c:forEach>			
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pagination" targetType="navTab" totalCount="${basePage.recordNum}" numPerPage="${basePage.pageSize}" pageNumShown="10" currentPage="${basePage.page}"></div>
	</div>
</div>
