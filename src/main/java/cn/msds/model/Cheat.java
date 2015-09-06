package cn.msds.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 反欺诈记录表
 * @version V1.0
 */
public class Cheat implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	/** 进件号 */
	private Integer applyId;
	/** 客户号 */
	private String uuid;
	/**欺诈标志  A01、A02、B01、F01*/
	private String cheatType;
	/**欺诈备注*/
	private String cheatContent;
	/**创建时间*/
	private Date cheatTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getApplyId() {
		return applyId;
	}
	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCheatType() {
		return cheatType;
	}
	public void setCheatType(String cheatType) {
		this.cheatType = cheatType;
	}
	public String getCheatContent() {
		return cheatContent;
	}
	public void setCheatContent(String cheatContent) {
		this.cheatContent = cheatContent;
	}
	public Date getCheatTime() {
		return cheatTime;
	}
	public void setCheatTime(Date cheatTime) {
		this.cheatTime = cheatTime;
	}
	
}
