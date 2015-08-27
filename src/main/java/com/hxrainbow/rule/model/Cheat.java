package com.hxrainbow.rule.model;

import java.io.Serializable;
import java.util.Date;

public class Cheat implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 客户号 */
	private Integer uuid;
	/**欺诈标志  A01、A02、B01、F01*/
	private String cheatType;
	/**欺诈备注*/
	private String content;
	/**创建时间*/
	private Date time;
	public Integer getUuid() {
		return uuid;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	public String getCheatType() {
		return cheatType;
	}
	public void setCheatType(String cheatType) {
		this.cheatType = cheatType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
