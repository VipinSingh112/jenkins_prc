package com.nbp.jtb.application.form.web.constants;

/**
 * @author Ayush Rawat
 */
public class JTBApplicationFormWebPortletKeys {

	public static final String JTBAPPLICATIONFORMWEB =
		"com_nbp_jtb_application_form_web_JTBApplicationFormWebPortlet";
	public static final String ENTITY_ID="Entity Id";
	public static final String DOC_NO ="Document Number";
	public static final String ISSUE_DATE ="Issue Date";
	public static final String EXPIRY_DATE ="Expiry Date";
	
	public static final int DRAFT =-1;
	public static final String DRAFT_Label = "draft";
	public static final int SUBMITTED =0;
	public static final String SUBMITTED_Label = "submitted";
	public static final String Pendin_Label = "pending";
	public static final int PENDING_AND_DRAFT =-1;
	public static final String MAILING_ADDRESS = "Mailing Address";
	public static final String REGISTERED_ADDRESS = "Registered Address";
	public static String getStatusLabel(int status) {
		if(status==-1) {
			return DRAFT_Label;
		}
		if(status==0) {
			return SUBMITTED_Label;
		}
		return null;
	
	
}

}