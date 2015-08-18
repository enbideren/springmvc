<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form id="pagerForm" action="demo/database/dwzOrgLookup.html">
	<input type="hidden" name="numPerPage" value="${model.numPerPage}" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
</form>
<div class="pageHeader">
	<form rel="pagerForm" method="post" action="rule/showItemRule.do?sceneId=${sceneId}&flag=${flag}" onsubmit="return dwzSearch(this, 'dialog');">
	<div class="searchBar">
		<ul class="searchContent">
			<li>
				<label>属性名称:</label>
				<input class="textInput" name="name" value="" type="text">
			</li>	  
			<li>
				<label>所属实体:</label>
					<div id="combox_entityId" class="select">
						<select name="typeId" id="entityId" >
								<option value="0">请选择</option>
								<c:forEach items="${entityList}"  var="entityList" varStatus="index">
									<option value="${entityList.id }">${entityList.name }</option>
								</c:forEach>
						</select>
					</div>
			</li>
		</ul>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">查询</button></div></div></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">

	<table class="table" layoutH="118" targetType="dialog" width="100%">
		<thead>
			<tr>
				<th width="200">属性名称</th>
				<th width="100">实体名称</th>
				<th  width="200">描述</th>
				<th width="100">选择</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${itemList}"  var="item_entity" varStatus="index">
		<tr>
				<td>${item_entity.itemName }</td>
				<td>${item_entity.entityName }</td>
				<td>${item_entity.description }</td>
				<td>
					<a class="btnSelect" href="javascript:$.bringBack({id:'${item_entity.itemId }', orgName:'${item_entity.entityName}${'的' }${item_entity.itemName }',type:'${'condition'}${flag}${itemInput}',variableId:'${variableId}'})" title="查找带回">选择</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>