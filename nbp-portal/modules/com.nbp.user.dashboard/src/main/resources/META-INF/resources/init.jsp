<%@page import="com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication"%>
<%@page import="io.swagger.v3.oas.annotations.enums.Explode"%>
<%@page import="com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.HsraApplication"%>
<%@page import="com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.WRAApplication"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCApplication"%>
<%@page import="com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration"%>
<%@page import="com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.JanaacApplication"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp"%>
<%@page import="com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JTBApplication"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjApplication"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningLeaseApplication"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtApplication"%>
<%@page import="com.nbp.quary.application.form.service.service.QuarryApplicationLocalServiceUtil"%>
<%@page import="com.nbp.quary.application.form.service.model.QuarryApplication"%>
<%@page import="com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil"%>
<%@page import="com.nbp.miic.application.form.services.model.MiicApplication"%>
<%@page import="com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraApplication"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesApplication"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.nbp.acquire.application.form.service.service.AcquireApplicationLocalServiceUtil"%>
<%@page import="com.nbp.acquire.stages.service.model.AcquireApplicationStages"%>
<%@page import="com.nbp.acquire.stages.service.service.AcquireApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.acquire.application.form.service.model.AcquireApplication"%>
<%@page import="com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages"%>
<%@page import="com.nbp.manufacturing.application.form.service.service.ManufacturingApplicationLocalServiceUtil"%>
<%@page import="com.nbp.manufacturing.application.form.service.model.ManufacturingApplication"%>
<%@page import="com.nbp.manufacturing.application.stages.services.service.ManufacturingApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.osi.insolvency.stage.services.service.OsiInsolvencyApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStages"%>
<%@page import="com.nbp.osi.insolvency.application.form.services.service.OsiInsolvencyApplicationLocalServiceUtil"%>
<%@page import="com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication"%>
<%@page import="com.nbp.osi.stages.services.service.OsiApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.osi.stages.services.service.OsiApplicationStagesLocalService"%>
<%@page import="com.nbp.osi.stages.services.model.OsiApplicationStages"%>
<%@page import="com.nbp.osi.application.form.services.model.OsiApplication"%>
<%@page import="com.nbp.osi.application.form.services.service.OsiApplicationLocalServiceUtil"%>
<%@page import="com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages"%>
<%@page import="com.nbp.pharmaceutical.application.form.service.service.PharmaApplicationLocalServiceUtil"%>
<%@page import="com.nbp.pharmaceutical.application.form.service.model.PharmaApplication"%>
<%@page import="com.nbp.pharmaceutical.stages.services.service.PharmaApplicationStagesLocalServiceUtil"%>
<%@page import="com.npm.cannabis.application.stages.services.model.CannabisApplicationStages"%>
<%@page import="com.nbp.cannabis.application.form.services.model.CannabisApplications"%>
<%@page import="com.nbp.cannabis.application.form.services.service.CannabisApplicationsLocalServiceUtil"%>
<%@page import="com.npm.cannabis.application.stages.services.service.CannabisApplicationStagesLocalServiceUtil"%>
<%@page import="com.agriculture.application.form.service.service.AgricultureApplicationLocalServiceUtil"%>
<%@page import="com.nbp.agriculture.stages.services.service.AgricultureApplicationStagesLocalServiceUtil"%>
<%@page import="com.agriculture.application.form.service.model.AgricultureApplication"%>
<%@page import="com.nbp.agriculture.stages.services.model.AgricultureApplicationStages"%>
<%@page import="com.nbp.farm.application.stages.service.model.FarmApplicationStages"%>
<%@page import="com.nbp.farm.application.form.service.model.FarmerApplication"%>
<%@page import="com.nbp.farm.application.form.service.service.FarmerApplicationLocalServiceUtil"%>
<%@page import="com.nbp.farm.application.stages.service.service.FarmApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.film.stages.services.model.FilmApplicationStages"%>
<%@page import="com.nbp.film.application.form.service.model.FilmApplication"%>
<%@page import="com.nbp.film.application.form.service.service.FilmApplicationLocalServiceUtil"%>
<%@page import="com.nbp.film.stages.services.service.FilmApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.healthcare.stage.service.service.HealthApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.healthcare.application.form.service.model.HealthCareApplication"%>
<%@page import="com.nbp.healthcare.application.form.service.service.HealthCareApplicationLocalServiceUtil"%>
<%@page import="com.nbp.healthcare.stage.service.model.HealthApplicationStages"%>
<%@page import="com.nbp.tourism.application.stages.services.model.TourismApplicationStages"%>
<%@page import="com.nbp.tourism.application.form.services.model.TourismApplication"%>
<%@page import="com.nbp.tourism.application.stages.services.service.TourismApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.tourism.application.form.services.service.TourismApplicationLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusApplication"%>
<%@page import="com.nbp.sez.status.application.stage.services.service.SezStatusApplicationStagesLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusApplication"%>

<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.creative.stages.services.service.CreativeApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.creative.application.form.service.service.CreativeApplicationLocalServiceUtil"%>
<%@page import="com.nbp.creative.application.form.service.model.CreativeApplication"%>
<%@page import="com.nbp.creative.stages.services.model.CreativeApplicationStages"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.film.stages.services.model.FilmFullRegistration"%>
<%@page import="com.nbp.film.stages.services.service.FilmFullRegistrationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.healthcare.application.form.service.service.HealthCareDescriptionOfServiceLocalServiceUtil"%>
<%@page import="com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfService"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.manufacturing.application.stages.services.service.ManufacturingPermitLocalServiceUtil"%>
<%@page import="com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.osi.insolvency.stage.services.service.OsiInsolvencyApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication"%>
<%

Format dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
String selectedApplication = ParamUtil.getString(request, "selectedApplication");
String activeTab = ParamUtil.getString(request, "active-Tab");
if(Validator.isNull(selectedApplication) && Validator.isNotNull(httpServletRequest.getParameter("selectedApplication"))){
	selectedApplication = httpServletRequest.getParameter("selectedApplication");
}
if(Validator.isNull(selectedApplication) && Validator.isNotNull(httpServletRequest.getParameter("activeTab"))){
	activeTab = httpServletRequest.getParameter("activeTab");
}
String defaultActive="current-active";
String stageStatus="Submitted";
boolean showCannbisApplications =(boolean)renderRequest.getAttribute("Cannabis");
boolean showCrownLandApplications =(boolean)renderRequest.getAttribute("Crown Lands");
boolean showTourismApplications =(boolean)renderRequest.getAttribute("Tourism");
boolean showPIRApplications =(boolean)renderRequest.getAttribute("PIR");
boolean showPharmaceuticalApplications =(boolean)renderRequest.getAttribute("Pharmaceutical");
boolean showFilmApplications =(boolean)renderRequest.getAttribute("Film");
boolean showManufacturingApplications =(boolean)renderRequest.getAttribute("Manufacturing");
boolean creativeEntertainment =(boolean)renderRequest.getAttribute("CreativeEntertainment");
boolean superAdmin =(boolean)renderRequest.getAttribute("SuperAdmin");
boolean showSezStatus = (boolean)renderRequest.getAttribute("SEZ Status");
int applicationIdCounter=1;
int cannabisApplicationIDCounter =1;
int acquireApplicationIDCounter =1;
boolean  noRecordFoundInProgressCases =true;
List<CannabisApplications> cannabisSubmittedApplicationsList = new ArrayList<CannabisApplications>();
List<CannabisApplications> cannabisApplicationData = new ArrayList<CannabisApplications>();
List<AgricultureApplication> agriApplicationData = new ArrayList<AgricultureApplication>();
List<FarmerApplication> farmerApplicationData = new ArrayList<FarmerApplication>();
List<FilmApplication> filmApplicationData = new ArrayList<FilmApplication>();
List<CreativeApplication> creativeApplicationData = new ArrayList<CreativeApplication>();
List<TourismApplication> tourismApplicationData = new ArrayList<TourismApplication>();
List<WRAApplication> WRAAApplicationData = new ArrayList<WRAApplication>();
List<ManufacturingApplication> manufacturingApplicationData = new ArrayList<ManufacturingApplication>();
List<QuarryApplication> quarryApplicationData = new ArrayList<QuarryApplication>();
List<MedicalFacilitiesApp> medicalApplicationData = new ArrayList<MedicalFacilitiesApp>();
List<JTBApplication> jtbApplicationData= new ArrayList<JTBApplication>();
List<OsiApplication> osiApplicationData = new ArrayList<OsiApplication>();
List<FactoriesApplicationRegistration> factoriesApplicationData = new ArrayList<FactoriesApplicationRegistration>();
List<NcbjApplication> ncbjApplicationData = new ArrayList<NcbjApplication>();
List<HsraApplication> hsraApplicationData = new ArrayList<HsraApplication>();
List<MiningLeaseApplication> miningApplicationData = new ArrayList<MiningLeaseApplication>();
if((showCannbisApplications || superAdmin)){
	 cannabisSubmittedApplicationsList = CannabisApplicationsLocalServiceUtil.getCannabisApplicationsByStatus(UserDashboardPortletKeys.SUBMITTED); 
}else{
	 cannabisSubmittedApplicationsList = CannabisApplicationsLocalServiceUtil
			.getCannabisApplicationsByS_U(themeDisplay.getUserId(), UserDashboardPortletKeys.SUBMITTED); 
}

List<AcquireApplication> acquireApplication = new ArrayList<AcquireApplication>();
try{
acquireApplication = AcquireApplicationLocalServiceUtil.getAcquireByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
 }catch(Exception e){}

List<AgricultureApplication> agricultureSubmittedApplicationsList = new ArrayList<AgricultureApplication>();
if(showPIRApplications || superAdmin){
 	agricultureSubmittedApplicationsList = AgricultureApplicationLocalServiceUtil.getAgricultureByStatus(UserDashboardPortletKeys.SUBMITTED);
 }else{
	 agricultureSubmittedApplicationsList = AgricultureApplicationLocalServiceUtil.getAgricultureApplicationByS_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED); 
}
List<CreativeApplication> creativeSubmittedApplicationsList = new ArrayList<CreativeApplication>();
if(creativeEntertainment || superAdmin){
 	creativeSubmittedApplicationsList = CreativeApplicationLocalServiceUtil.getCreativeByStatus(UserDashboardPortletKeys.SUBMITTED);
 }else{
	 creativeSubmittedApplicationsList = CreativeApplicationLocalServiceUtil.getCreativeByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId()); 	
}
List<FarmerApplication> farmerSubmittedApplicationsList = new ArrayList<FarmerApplication>();
try{
 farmerSubmittedApplicationsList = FarmerApplicationLocalServiceUtil.getFarmerApplicationByS_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED);
 }catch(Exception e){}
List<FilmApplication> filmApplication =new ArrayList<FilmApplication>();
if (superAdmin) {
	try{
		 filmApplication = FilmApplicationLocalServiceUtil.getFilmByStatus(UserDashboardPortletKeys.SUBMITTED);
		 }catch(Exception e){}
}else{
	try{
		 filmApplication = FilmApplicationLocalServiceUtil.getFilmByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
		 }catch(Exception e){}
}

List<HealthCareApplication> healthCareSubmittedApplicationsList = new ArrayList<HealthCareApplication>();	
if (showPIRApplications || superAdmin) {
	try{
 	healthCareSubmittedApplicationsList = HealthCareApplicationLocalServiceUtil
			.getHealthCareByStatus(UserDashboardPortletKeys.SUBMITTED);
 	}catch(Exception e){}
} else {
	try{
	healthCareSubmittedApplicationsList = HealthCareApplicationLocalServiceUtil
			.getHealthCareByS_U(UserDashboardPortletKeys.SUBMITTED, themeDisplay.getUserId());
	 }catch(Exception e){}
}
List<ManufacturingApplication> manuSubmittedApplicationsList = new ArrayList<ManufacturingApplication>();
if(showManufacturingApplications || superAdmin){
 manuSubmittedApplicationsList = ManufacturingApplicationLocalServiceUtil.getManufacturingByStatus(UserDashboardPortletKeys.SUBMITTED); 
}else{
 	manuSubmittedApplicationsList = ManufacturingApplicationLocalServiceUtil.getManufacturingByS_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED); 
}
List<OsiInsolvencyApplication> osiInsolvencySubmittedApplicationsList = new ArrayList<OsiInsolvencyApplication>();
if(showPIRApplications || superAdmin){
	osiInsolvencySubmittedApplicationsList = OsiInsolvencyApplicationLocalServiceUtil.getOsiInsolvencyApplicationByStatus(UserDashboardPortletKeys.SUBMITTED); 
}else{
	 osiInsolvencySubmittedApplicationsList = OsiInsolvencyApplicationLocalServiceUtil.getOsiInsolvencyApplicationByS_UId(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED); 
}
List<OsiApplication> osiSubmittedApplicationsList = new ArrayList<OsiApplication>();
if(showPIRApplications || superAdmin){
	 osiSubmittedApplicationsList = OsiApplicationLocalServiceUtil.getOsiApplicationByStatus(UserDashboardPortletKeys.SUBMITTED); 
}else{
	osiSubmittedApplicationsList = OsiApplicationLocalServiceUtil.getOsiApplicationByS_UId(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED);
}
List<PharmaApplication> pharmaSubmittedApplicationsList = new ArrayList<PharmaApplication>();
if(showPharmaceuticalApplications || superAdmin){
	 pharmaSubmittedApplicationsList = PharmaApplicationLocalServiceUtil.getPharmaByStatus(UserDashboardPortletKeys.SUBMITTED); 
}else{
	pharmaSubmittedApplicationsList = PharmaApplicationLocalServiceUtil.getPharmaByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
}
List<TourismApplication> tourismSubmittedApplicationsList = new ArrayList<TourismApplication>();
if(showTourismApplications || superAdmin) {
	 tourismSubmittedApplicationsList = TourismApplicationLocalServiceUtil.getTourismByStatus(UserDashboardPortletKeys.SUBMITTED); 
}else{
	tourismSubmittedApplicationsList = TourismApplicationLocalServiceUtil.getTourismApplicationByS_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED);
}
List <OsiServicesApplication> osiServiceSubmittedApplicationList = new ArrayList <OsiServicesApplication>();
if (superAdmin) {
	try{
		 osiServiceSubmittedApplicationList = OsiServicesApplicationLocalServiceUtil.getOSIServicesByStatus(UserDashboardPortletKeys.SUBMITTED); 
	}catch(Exception e){
		}
}else{
	try{
		 osiServiceSubmittedApplicationList = OsiServicesApplicationLocalServiceUtil.getOsiServicesApplicationStatus(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId()); 
	}catch(Exception e){
		}
}
List<NcraApplication> ncraApplicationList = new ArrayList<NcraApplication>();
	if (superAdmin) {
		try{
			ncraApplicationList = NcraApplicationLocalServiceUtil.getNcraByStatus(UserDashboardPortletKeys.SUBMITTED);
			}catch(Exception e){}
	}else{
		try{
			ncraApplicationList = NcraApplicationLocalServiceUtil.getNcraByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
			}catch(Exception e){}
	}
List<MiicApplication> miicApplicationList = new ArrayList<MiicApplication>();
	if (superAdmin) {
		try{
			miicApplicationList = MiicApplicationLocalServiceUtil.getMIICByStatus(UserDashboardPortletKeys.SUBMITTED);
		}catch(Exception e){}
	}else{
		try{
			miicApplicationList = MiicApplicationLocalServiceUtil.getMIICByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
		}catch(Exception e){}
	}
List<QuarryApplication> applicationQuarry=new ArrayList<QuarryApplication>();
try{
	applicationQuarry = QuarryApplicationLocalServiceUtil.getQuarryApplicationByStatus_UId(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
}catch(Exception e){
}
 List<MiningLeaseApplication> applicationMining=new ArrayList<MiningLeaseApplication>();
	 if (superAdmin) {
		 try{
				applicationMining = MiningLeaseApplicationLocalServiceUtil.getMiningByStatus(UserDashboardPortletKeys.SUBMITTED);
			}catch(Exception e){
			}
	 }else{
		 try{
				applicationMining = MiningLeaseApplicationLocalServiceUtil.getMiningByS_U(themeDisplay.getUserId(), UserDashboardPortletKeys.SUBMITTED);
			}catch(Exception e){
			}
	 }
List<NcbjApplication> ncbjApplication= new ArrayList<NcbjApplication>();
	if (superAdmin) {
		try{
			ncbjApplication= NcbjApplicationLocalServiceUtil.getNCBJAppBy_Status(UserDashboardPortletKeys.SUBMITTED);
		}catch(Exception e){
		}
	}else{
		try{
			ncbjApplication= NcbjApplicationLocalServiceUtil.getNCBJAppBy_S_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED);
		}catch(Exception e){
		}
	}
List<JTBApplication> jtbApplication= new ArrayList<JTBApplication>();
try{
	jtbApplication= JTBApplicationLocalServiceUtil.getJTBApplicationList_By_S_UId(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED);
}catch(Exception e){
}
List <SezStatusApplication> sezStatusSubmittedApplicationList = new ArrayList <SezStatusApplication>();
if(showSezStatus || superAdmin){
	try{
	sezStatusSubmittedApplicationList = SezStatusApplicationLocalServiceUtil.getsezByStatus(UserDashboardPortletKeys.SUBMITTED);
	}catch(Exception e){}
}else{
	try{
	sezStatusSubmittedApplicationList = SezStatusApplicationLocalServiceUtil.getSezByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
	}catch(Exception e){}
}
List<MedicalFacilitiesApp> medicalFacilities= new ArrayList<MedicalFacilitiesApp>();
	if (superAdmin) {
		try{
			medicalFacilities= MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesAppBy_Status(UserDashboardPortletKeys.SUBMITTED);
		}catch(Exception e){}
	}else{
		try{
			medicalFacilities= MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesAppBy_S_U(UserDashboardPortletKeys.SUBMITTED, themeDisplay.getUserId());
		}catch(Exception e){}
	}
List<OgtApplication> ogtApplication= new ArrayList<OgtApplication>();
	if (superAdmin) {
		try{
			ogtApplication= OgtApplicationLocalServiceUtil.getOgtByStatus(UserDashboardPortletKeys.SUBMITTED);
		}catch(Exception e){}
	}else{
		ogtApplication= OgtApplicationLocalServiceUtil.getOgtByS_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED);
	}

List<FireBrigadeApplication> fireBrigadeApplication= new ArrayList<FireBrigadeApplication>();
	if (superAdmin) {
		try{
			fireBrigadeApplication= FireBrigadeApplicationLocalServiceUtil.getFireBrigadeByStatus(UserDashboardPortletKeys.SUBMITTED);
		}catch(Exception e){}
	}else{
		try{
			fireBrigadeApplication= FireBrigadeApplicationLocalServiceUtil.getFireBrigadeByS_U(UserDashboardPortletKeys.SUBMITTED, themeDisplay.getUserId());
		}catch(Exception e){}
	}
List<JanaacApplication> jannacApplication=new ArrayList<JanaacApplication>();
if (superAdmin) {
	try{
		 jannacApplication= JanaacApplicationLocalServiceUtil.getJANAAC_By_status(UserDashboardPortletKeys.SUBMITTED); 
	}catch(Exception e){}
}else{
	try{
		 jannacApplication= JanaacApplicationLocalServiceUtil.getJANAAC_ByS_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED); 
	}catch(Exception e){}
}

List<FactoriesApplicationRegistration> applicationFactoriesRegistration=new ArrayList<FactoriesApplicationRegistration>();
if (superAdmin) {
	try{
		applicationFactoriesRegistration= FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesRegstByStatus(UserDashboardPortletKeys.SUBMITTED);	
	}catch(Exception e){}
	
}else{
	try{
	applicationFactoriesRegistration= FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesApplicationRegistrationByStatus_UserId(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
	}catch(Exception e){}
}
List<JADSCApplication> jadscApplication=null;
if (superAdmin) {
try{
	jadscApplication= JADSCApplicationLocalServiceUtil.getJadscByStatus(UserDashboardPortletKeys.SUBMITTED); 
}catch(Exception e){}
}else{
try{
	jadscApplication= JADSCApplicationLocalServiceUtil.getJADSCByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId()); 
}catch(Exception e){}
}
List<WRAApplication> wraApplications=null;
if (superAdmin) {
	try{
		wraApplications= WRAApplicationLocalServiceUtil.getWraApplicationBy_S_UI(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
 	}catch(Exception e){}
} else {
	try{
	 	wraApplications= WRAApplicationLocalServiceUtil.getWraApplicationBy_Status(UserDashboardPortletKeys.SUBMITTED);
	 }catch(Exception e){}
}
List<HsraApplication> hsraApplications=null;
if (superAdmin) {
	try{
		hsraApplications= HsraApplicationLocalServiceUtil.getHsraByStatus(UserDashboardPortletKeys.SUBMITTED);
 	}catch(Exception e){}
} else {
	try{
		hsraApplications= HsraApplicationLocalServiceUtil.getHsraByS_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED);
	 }catch(Exception e){}
}
List<ExplosivesApplication> explosiveSubmittedApplicationsList = new ArrayList<ExplosivesApplication>();	
if (showPIRApplications || superAdmin) {
	try{
		explosiveSubmittedApplicationsList = ExplosivesApplicationLocalServiceUtil
			.getExplosiveByStatus(UserDashboardPortletKeys.SUBMITTED);
		
 	}catch(Exception e){}
} else {
	try{
		explosiveSubmittedApplicationsList = ExplosivesApplicationLocalServiceUtil
			.getExplosiveAppByStatusUser(UserDashboardPortletKeys.SUBMITTED, themeDisplay.getUserId());
	 }catch(Exception e){}
}

%>

<portlet:renderURL var="viewSingleApplicationUrl">
</portlet:renderURL>
<portlet:resourceURL var="tourismDashboardProgressURL" id="singleTourismApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="getSingleApplicationOverviewUrl"
	id="singleApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="getAgricultureApplicationOverviewUrl" id="agricultureApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="farmDashboardProgressURL" id="singleFarmerApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="manufactureDashboardProgressURL" id="singleManufactureApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForPharma" id="/downlaod/pharma/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForCannabis" id="/downlaod/cannabis/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForAcquire" id="/downlaod/acquire/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForHealthCare" id="/downlaod/health/care/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForFilm" id="/downlaod/film/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForFarm" id="/downlaod/farm/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForManufacturing" id="/downlaod/manufacturing/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForCreative" id="/downlaod/creative/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForAgriculture" id="/downlaod/agriculture/application-submitted-pdf"></portlet:resourceURL>