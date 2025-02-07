package com.nbp.user.draft.dashboard.web.constants;

/**
 * @author hp
 */
public class DraftDashboardPortletKeys {

	public static final String DRAFTDASHBOARD =
			"com_nbp_user_draft_dashboard_DraftDashboardPortlet";
		public static final int DRAFT =-1;
		public static final String DRAFT_Label = "draft";
		public static final int SUBMITTED =0;
		public static final String SUBMITTED_Label = "submitted";
		public static final String MAILING_ADDRESS = "Mailing Address";
		public static final String REGISTERED_ADDRESS = "Registered Address";
		public static final String COLLEBORATION_CANNABIS = "Cannabis Application";
		public static final String COLLEBORATION_PHARMA = "Pharmaceutical Application";
		public static final String COLLEBORATION_AGRICULTURE = "Agriculture Application";
		public static final String COLLEBORATION_FARM = "Farm Application";
		public static final String COLLEBORATION_FILM = "Film Application";
		public static final String COLLEBORATION_CREATIVE = "Creative Application";
		public static final String COLLEBORATION_MANUFACTURING = "Manufacturing Application";
		public static final String COLLEBORATION_HEALTHCARE = "Healthcare Application";
		public static final String COLLEBORATION_AQUIRELAND = "Aquire Land Application";
		public static final String COLLEBORATION_TOURISM = "Tourism Application";
		public static final String COLLEBORATION_OSI = "Osi Application";
		public static final String COLLEBORATION_OSI_INSOLVENCY = "Osi Insolvency Application";
		public static final String COLLEBORATION_SEZ_STATUS = "Sez Status Application";
		public static final String COLLEBORATION_FIRE_BRIGADE = "Fire Brigade Application";
		public static final String COLLEBORATION_OSI_SERVICES = "OSI Services Application";
		public static final String COLLEBORATION_NCRA = "Ncra Application";
		public static final String COLLEBORATION_MIIC = "Miic";
		public static final String COLLEBORATION_QUARRY = "Quarry";
		public static final String COLLEBORATION_NCBJ = "Ncbj";
		public static final String COLLEBORATION_MINING = "Mining";
		public static final String COLLEBORATION_OGT = "Ogt Application";
		public static final String COLLEBORATION_MEDICAL = "Medical Facility";
		public static final String COLLEBORATION_FACTORIES = "Factories Registration";
		public static final String COLLEBORATION_JADSC = "Jadsc";
		public static final String COLLEBORATION_WRA = "WRA";
		public static final String COLLEBORATION_TPDCo = "TPDCo";
		public static final String COLLEBORATION_JTB_ATTRACTION= "TPDCo";
		public static final String COLLEBORATION_JANAAC = "Janaac";
		public static final String COLLEBORATION_HSRA = "HSRA";
		public static final String COLLEBORATION_EXPLOSIVE = "Explosives Competency Certification";
		
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