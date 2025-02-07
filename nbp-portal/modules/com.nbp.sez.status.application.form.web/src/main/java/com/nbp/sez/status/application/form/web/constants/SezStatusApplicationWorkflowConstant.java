package com.nbp.sez.status.application.form.web.constants;

public class SezStatusApplicationWorkflowConstant {
	public static final int DRAFT =-1;
	public static final String DRAFT_Label = "draft";
	public static final int SUBMITTED =0;
	public static final String SUBMITTED_Label = "submitted";
	public static final String Pendin_Label = "pending";
	public static final int PENDING_AND_DRAFT =-1;
	public static final String MAILING_ADDRESS = "Mailing Address";
	public static final String REGISTERED_ADDRESS = "Registered Address";
	public static final String RENEW_APPLICATION  = "Renew Application";
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
