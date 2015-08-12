package cn.springmvc.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class JiangTextRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String read() throws Exception{
		StringBuffer text = new StringBuffer("");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\jiang\\Desktop\\test.txt"),"UTF-8"));
		String s = null;
		while ((s=buffer.readLine())!=null) {
			text.append(s+"\n");
		}
		buffer.close();
		return text.toString();
	}
	public static String read(String path) throws Exception{
		StringBuffer text = new StringBuffer("");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
		String s = null;
		while ((s=buffer.readLine())!=null) {
			text.append(s+"\n");
		}
		buffer.close();
		return text.toString();
	}
}
