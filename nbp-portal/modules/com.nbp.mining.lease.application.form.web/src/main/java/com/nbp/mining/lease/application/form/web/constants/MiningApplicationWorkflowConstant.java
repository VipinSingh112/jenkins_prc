package com.nbp.mining.lease.application.form.web.constants;

public class MiningApplicationWorkflowConstant {
	public static final int DRAFT =-1;
	public static final String DRAFT_Label = "draft";
	public static final int SUBMITTED =0;
	public static final String SUBMITTED_Label = "submitted";
	public static final String Pendin_Label = "pending";
	public static final int PENDING_AND_DRAFT =-1;
	
	public static final String 	RENEW="Renewal";
	public static final String 	ADDITIONAL_MINERAL="Additional Minerals";
	public static final String 	TEMPORARY_PERMISSION="Temporary Permission";
	public static final String 	SURRENDER="Surrender";
	public static String getStatusLabel(int status) {
		if(status==-1) {
			return DRAFT_Label;
		}
		if(status==0) {
			return SUBMITTED_Label;
		}
		return "";
	}
}