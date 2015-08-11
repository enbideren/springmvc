<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<style>
.lose{
float:right;margin-right:80px;margin-top: -10px
}
</style>
<script>
function addVariable(){
	
	var timestamp=(new Date()).valueOf();
	var addHtml = "<a id='label' class='btnAdd' href='javascript:void(0)' onclick='addVariable()'><span>添加</span></a>";
	var deleteHtml = "<a id='identify' class='btnDel' href='javascript:void(0)'  onclick='deleteVariable(this)'><span>删除</span></a>";
	var hiddenHtml = "<input type='hidden' id='variable' name='variable'>";
	var labelHtml = "<p><label>变量标签：</label><input id='label' type='text' size='30' alt='请输入变量标签' class='required' name='"+timestamp+"'/></p>";
	var identifyHtml = "<p><label>变量标识：</label><input id='identify' type='text' size='30' alt='请输入变量标识' class='lettersonly required' name='"+timestamp+"'/></p>";
	var spanHtml ="<span class='lose'>" + addHtml + deleteHtml + hiddenHtml + "</span>";
	var fieldDiv = labelHtml + identifyHtml + spanHtml;
    fieldDiv = "<fieldset>" + fieldDiv + "</fieldset>";
	$("#show").append(fieldDiv);
}
function deleteVariable(my){
	$(my).parent().parent().remove();
}
function saveActionMeta(){
	var arr = "";
	var flag = 1;
	$('fieldset').each(function(){
		var label = $(this).find('[id="label"]').val();
		var identify = $.trim($(this).find('[id="identify"]').val());
		$(this).find('[id="variable"]').val(label + "," + identify);
		if(arr.indexOf(identify) == -1){
			arr = arr + identify + ",";
		}else{
			flag = 2;
			return false;
		}
	});

	if(flag == 2){
		alertMsg.error("变量标识不能重复");
		return false;
	}
	$("#subForm").submit();
	return true;
}
</script>
<div class="pageContent">
	<form id="subForm" method="post" action="<%=request.getContextPath()%>/action/addActionMeta" class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
		<div class="pageFormContent" layoutH="56" id="show">
		<input type="hidden" name="rel" value="<%=request.getParameter("rel")%>">
			<p>
				<label>动作名称：</label>
				<input name="actionMeta.name" type="text" size="30" alt="请输入动作类型名称" class="required" />
			</p>			
			<p>
				<label>动作实现类：</label>
				<input name="actionMeta.methodC"  type="text" size="30"  alt="请输入动作类型包名称" class="required " />
			</p>
			<p>
				<label>描述：</label>
				<input name="actionMeta.description"  type="text" size="30"  alt="请输入动作类型描述" class=" " />
			</p>
			<fieldset id="fieldDiv">
				<p>
					<label>变量标签：</label>
					<input  type="text" size="30"  alt="请输入变量标签" class="required" id="label"/>
				</p>
				<p>
					<label>变量标识：</label>
					<input  type="text" size="30"  alt="请输入变量标识"  class="lettersonly required" id="identify"/>
				</p>
				<span class="lose">
					<a class='btnAdd' href='javascript:void(0)' onclick='addVariable()'><span>添加</span></a>
					<input type='hidden' id='variable' name='variable'>
				</span>
			</fieldset>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="button" onclick="saveActionMeta()">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>