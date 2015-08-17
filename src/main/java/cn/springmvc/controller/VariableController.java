package cn.springmvc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.TVariable;
import cn.springmvc.service.VariableService;

/**
 * 变量类action
 * 
 * @author guolei
 * @version 1.0
 * @created 2013-4-15
 */
@Controller
@Scope("prototype")
public class VariableController extends BaseController {

	private static final long serialVersionUID = 1L;
	
	@Resource
	private VariableService variableService;
	
	private List<TVariable> variableList;
	private String variableName;//变量名称
	private Integer type;//变量类型
	
	/**
	 * 
	 * 列出变量部分
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-15
	 */
	@RequestMapping("listVariable.do")
	public String listVariable()  throws Exception{
		variableList = variableService.listVariable(variableName,type);		
		return "dialog_variable";
	}

	public List<TVariable> getVariableList() {
		return variableList;
	}

	public void setVariableList(List<TVariable> variableList) {
		this.variableList = variableList;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}
