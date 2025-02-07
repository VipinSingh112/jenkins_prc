package com.nbp.explosives.competency.form.web.constants;

public class ExplosivesCompetencyApplicationWorkFlowConstant {
	public static final int DRAFT =-1;
	public static final String DRAFT_Label = "draft";
	public static final int SUBMITTED =0;
	public static final String SUBMITTED_Label = "submitted";
	public static final String Pendin_Label = "pending";
	public static final int PENDING_AND_DRAFT =-1;
	public static final String DOC_NO ="Document Number";
	public static final String 	RENEW="Renewal Competency Certificate";
	public static final String REGISTRATION_APPLICATION  = "REGISTRATION_APPLICATION";
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
