<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
.lose{
float:right;margin-right:80px;margin-top: -10px
}
</style>
<div class="pageContent">
		<div id="show" class="pageFormContent" layoutH="56">
		    <input type="hidden" name="rel" value="${rel}"/>
			<p>
				<label>动作类型名称：</label>
				${actionMeta.name }
			</p>
			<p>
				<label>动作类型实现类：</label>
				${actionMeta.methodC }
			</p>
			<p>
				<label>描述：</label>
				${actionMeta.description}
			</p>
			<c:forEach items="${variableList}"  var="variable_show" varStatus="st">
			<fieldset>
				<p>
					<label>变量标签：</label>
					${variable_show.name }
				</p>
				<p>
					<label>变量标识：</label>
					${variable_show.identify }
				</p>
			</fieldset>
			</c:forEach>
		</div>
</div>