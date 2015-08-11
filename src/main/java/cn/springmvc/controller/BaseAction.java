package cn.springmvc.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import cn.springmvc.util.BasePage;

public abstract class BaseAction  {


	private static final long serialVersionUID = 1L;
	
	protected BasePage basePage = new BasePage();
	
	protected String rel;
	
	public void set_(String _){
		
	}
	
	public void setPageNum(int pageNum){
		basePage.setPage(pageNum);
	}
	
	public void setNumPerPage(int pageSize){
		basePage.setPageSize(pageSize);
	}
	
	public void setOrderField(String of){
		basePage.setOrderField(of);
	}
	
	public void setOrderDirection(String ofd){
		 basePage.setOrderDirection(ofd);
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}
	
	/*public String json(Object obj) throws Exception{
		ObjectMapper om = new ObjectMapper();

		String result = om.writeValueAsString(obj);

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json; charset=utf-8");

		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		out.write(result);
		out.flush();
		out.close();
		return null;
	}*/
}
