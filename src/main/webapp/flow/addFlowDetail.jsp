<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="pageContent">
	<form method="post" action="<%=request.getContextPath()%>/flow/addFlowDetail.do" class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
		<input type="hidden" name="rel" value="<%=request.getParameter("rel")%>">
		<input type="hidden" name="flowId" value="<%=request.getParameter("flowId")%>">
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>规则组名称：</label>
				<input name="sceneName" type="text" size="30" alt="请输入规则组名称" class="required" />
			</p>
			<p>
				<label>规则组Id：</label>
				<input name="sceneId"  type="text" size="30"  alt="请输入规则组Id" class="required" />
			</p>
			<p>
				<label>顺序编号：</label>
				<input name="num"  type="text" size="30"  alt="请输入顺序编号" class="required" />
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