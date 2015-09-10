package cn.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.TActionMeta;
import cn.springmvc.model.TFlow;
import cn.springmvc.model.TFlowDetail;
import cn.springmvc.service.FlowDetailService;
import cn.springmvc.service.FlowService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.DroolsUtil;
import cn.springmvc.util.JsonUtil;
import cn.springmvc.util.Result;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Controller
@RequestMapping("/flow")
public class FlowController {
	@Resource
	private FlowService flowService;
	@Resource
	private FlowDetailService flowDetailService;
	@RequestMapping("listFlow.do")
	public String listFlow(HttpServletResponse response,HttpServletRequest request,Model model,String rel,BasePage basePage,TFlow flow)  throws Exception{
		System.out.println(request.getServletPath());
		System.out.println(request.getContextPath());
		basePage = flowService.getPageFlow(basePage,flow.getName());
		model.addAttribute("rel", rel);
		model.addAttribute(basePage);
		model.addAttribute("flow", flow);
		return "flow/flowList";
	}
	@RequestMapping("addFlow.do")
	public String addFlow(HttpServletResponse response,Model model,String rel,TFlow flow,HttpServletRequest request)  throws Exception{
		flowService.saveFlow(flow);
		Result result = new Result();
		result.setMessage("添加成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	@RequestMapping("updateFlow.do")
	public String updateFlow(HttpServletResponse response,Model model,String rel,TFlow flow,HttpServletRequest request)  throws Exception{
	    flowService.updateFlow(flow);
	    DroolsUtil.removeRuleMap();
		Result result = new Result();
		result.setMessage("修改成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}	
	@RequestMapping("showFlow.do")
	public String showFlow(HttpServletResponse response,Model model,String rel,TFlow flow) throws Exception{
		flow = flowService.getFlowById(flow.getId());
		model.addAttribute("flow",flow);
		model.addAttribute("rel", rel);
		return "flow/updateFlow";
	}	
	@RequestMapping("deleteFlow.do")
	public String deleteFlow(HttpServletResponse response,Model model,String rel,TFlow flow)  throws Exception{
		flowService.deleteFlow(flow.getId());
		Result result = new Result();
		result.setCallbackType("");
		result.setMessage("删除成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	@RequestMapping("listFlowDetail.do")
	public String listFlowDetail(HttpServletResponse response,HttpServletRequest request,Model model,String rel,BasePage basePage)  throws Exception{
		//springmvc的bug吧，这个地方的rel必须要request.getParameter("rel")这种方式，不然拿回来的是一个数组，晕调试半天，总之现在的这个前端框架有问题,束缚太多。
		TFlowDetail flowDetail = new TFlowDetail();
		flowDetail.setFlowId(Integer.parseInt(request.getParameter("flowId")));
		flowDetail.setSceneName(request.getParameter("sceneName"));
		basePage = flowDetailService.getPageFlowDetail(basePage, flowDetail);
		model.addAttribute("rel", request.getParameter("rel"));
		model.addAttribute(basePage);
		model.addAttribute("flowDetail", flowDetail);
		return "flow/flowDetailList";
	}
	@RequestMapping("deleteFlowDetail.do")
	public String deleteFlowDetail(HttpServletResponse response,Model model,String rel,TFlowDetail flowDetail)  throws Exception{
		flowDetailService.deleteFlowDetail(flowDetail.getId());
		Result result = new Result();
		result.setCallbackType("");
		result.setMessage("删除成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	@RequestMapping("addFlowDetail.do")
	public String addFlowDetail(HttpServletResponse response,Model model,String rel,TFlowDetail flowDetail,HttpServletRequest request)  throws Exception{
		flowDetailService.saveFlowDetail(flowDetail);
		Result result = new Result();
		result.setMessage("添加成功");
		result.setCallbackType("closeCurrent");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
}
