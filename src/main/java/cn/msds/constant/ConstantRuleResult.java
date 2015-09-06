package cn.msds.constant;

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
	
	
}
