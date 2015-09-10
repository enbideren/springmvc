<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="pageContent">
	<form method="post" action="<%=request.getContextPath()%>/flow/updateFlow.do" class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
		<input type="hidden" name="rel" value="${rel}"/>
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>规则流名称：</label>
				<input name="id" type="hidden" size="30" value="${flow.id }"/>
				<input name="name" type="text" size="30" alt="请输入规则流名称" class="required" value="${flow.name }"/>
			</p>
			<p>
				<label>规则流接口地址：</label>
				<input name="url"  readonly="readonly" type="text" size="30"  alt="请输入规则流接口地址" class="required" value="${flow.url }"/>
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">修改</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>