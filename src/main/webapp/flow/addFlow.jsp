<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="pageContent">
	<form method="post" action="<%=request.getContextPath()%>/flow/addFlow.do" class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
		<input type="hidden" name="rel" value="<%=request.getParameter("rel")%>">
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>规则流名称：</label>
				<input name="name" type="text" size="30" alt="请输入规则流名称" class="required" />
			</p>
			<p>
				<label>规则流接口地址：</label>
				<input name="url"  type="text" size="30"  alt="请输入规则流接口地址" class="required" />
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>