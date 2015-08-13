package cn.springmvc.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	public static void toJson(String result,HttpServletResponse response) throws Exception {
		response.setContentType("application/json; charset=utf-8");

		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		out.write(result);
		out.flush();
		out.close();
	}

	public static void toJson(Object r,HttpServletResponse response) throws Exception {
		ObjectMapper om = new ObjectMapper();
		String result = om.writeValueAsString(r);
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		out.write(result);
		out.flush();
		out.close();
	}
}