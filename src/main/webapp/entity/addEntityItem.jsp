<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<div class="pageContent">
	<form method="post" action="<%=request.getContextPath()%>/entity/addEntityItem.do" class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
		<input type="hidden" name="rel" value="${rel}"/>
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>属性字段：</label>
				<input name="field" type="text" size="30" alt="请输入属性字段" class="required alphanumeric" />
			</p>			
			<p>
				<label>属性名称：</label>
				<input name="name"  type="text" size="30"  alt="请输入属性名称" class="required" />
			</p>
			<p>
				<label>属性描述：</label>
				 <input name="description"  type="text" size="30"  alt="请输入属性描述" class="required" />
			</p>
			<p>
				<input name="typeId"  type="hidden" value="${typeId}"/>
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