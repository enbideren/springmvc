package cn.msds.constant;

/**
 * @author JZR
 * @date 2015年9月10日
 * @Description 系统常量
 * @version V1.0
 */
public class ConstantRuleResult {
	/** 初审-不符合贷款条件，拒绝*/
	public static  int Rule_apply_refuse = 21;
	/** 初审-申请人重新提交*/
	public static  int Rule_apply_reSubmit = 22;
	/** 初审-贷款申请受理*/
	public static  int Rule_apply_success = 3;
	
	/** 初审-客户分类-A*/
	public static  String Rule_apply_ctypeA = "A";
	/** 初审-客户分类-B*/
	public static  String Rule_apply_ctypeB = "B";
	/** 初审-客户分类-C*/
	public static  String Rule_apply_ctypeC = "C";
	
	
	/** 反欺诈-申请表手机号与电商账户存的手机号不一致*/
	public static  String Rule_cheat_phnosame = "B01";
	/** 反欺诈-单一客户号关联手机号码大于等于3个*/
	public static  String Rule_cheat_mcontact = "A01";
	/** 反欺诈-同一手机号关联姓名大于等于6个*/
	public static  String Rule_cheat_muuid = "A02";
	/** 反欺诈-如申请人IP 24小时内申请次数大于等于3次 */
	public static  String Rule_cheat_mregister = "F01";
	
	/*1-待初审、2-初审通过、3-初审不通过、4-不需复审、5-待复审、6-待抽审、7-通过可放款、8-拒绝*/
	/** 信审-待初审*/
	public static  int Check_state_1 = 1;
	/** 信审-初审通过*/
	public static  int Check_state_2 = 2;
	/** 信审-初审不通过 */
	public static  int Check_state_3 = 3;
	/** 信审-不需复审 */
	public static  int Check_state_4 = 4;
	/** 信审-待复审 */
	public static  int Check_state_5 = 5;
	/** 信审-待抽审 */
	public static  int Check_state_6 = 6;
	/** 信审-通过可放款 */
	public static  int Check_state_7 = 7;
	/** 信审-拒绝 */
	public static  int Check_state_8 = 8;
}
