package com.nbp.osi.services.application.form.web.constants;

public class OSIServiceApplicationWorkflowConstant {
	public static final int DRAFT =-1;
	public static final String DRAFT_Label = "draft";
	public static final int SUBMITTED =0;
	public static final String SUBMITTED_Label = "submitted";
	
	public static final String RESIDENTIAL_ADDRESS = "Residential Address";
	public static final String BUSINESS_ADDRESS = "Business Address";
	public static final String RENEW_PROCESS="Renewal";
	public static final String ENTITY_ID="Entity Id";
	
	
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
