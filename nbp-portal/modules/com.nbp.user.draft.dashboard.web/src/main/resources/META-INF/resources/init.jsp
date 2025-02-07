<%@page import="com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjApplication"%>
<%@page import="com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.JanaacApplication"%>
<%@page import="com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.HsraApplication"%>
<%@page import="com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JTBApplication"%>
<%@page import="com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil"%>
<%@page import="com.nbp.wra.application.form.service.model.WRAApplication"%>
<%@page import="com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCApplication"%>
<%@page import="com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration"%>
<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtApplication"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningLeaseApplication"%>
<%@page import="com.nbp.quary.application.form.service.service.QuarryApplicationLocalServiceUtil"%>
<%@page import="com.nbp.quary.application.form.service.model.QuarryApplication"%>
<%@page import="com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraApplication"%>
<%@page import="com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil"%>
<%@page import="com.nbp.miic.application.form.services.model.MiicApplication"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil"%>
<%@page import="com.nbp.osi.services.application.form.service.model.OsiServicesApplication"%>
<%@page import="com.nbp.osi.services.application.form.service.service.OsiServicesApplicationService"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.user.draft.dashboard.web.constants.DraftDashboardPortletKeys"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%@page import="com.nbp.dashboard.util.DashboardUtil"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page
	import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page
	import="com.nbp.pharmaceutical.application.form.service.service.PharmaApplicationLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page
	import="com.nbp.pharmaceutical.application.form.service.model.PharmaApplication"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page
	import="com.agriculture.application.form.service.service.AgricultureApplicationLocalServiceUtil"%>
<%@page
	import="com.agriculture.application.form.service.model.AgricultureApplication"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>

<%@page
	import="com.agriculture.application.form.service.model.AgricultureApplication"%>
<%@page import="com.nbp.osi.application.form.services.service.OsiApplicationLocalServiceUtil"%>
<%@page import="com.nbp.osi.application.form.services.model.OsiApplication"%>
<%@page import="javax.swing.text.DateFormatter"%>
<%@page import="com.nbp.user.draft.dashboard.web.constants.DraftDashboardPortletKeys"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.osi.insolvency.application.form.services.service.OsiInsolvencyApplicationLocalServiceUtil"%>
<%@page import="com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication"%>
<%@page import="com.nbp.user.draft.dashboard.web.constants.DraftDashboardPortletKeys"%>
<%@page import="com.nbp.agriculture.stages.services.service.AgricultureApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.agriculture.stages.services.model.AgricultureApplicationStages"%>
<%@page import="com.nbp.agriculture.stages.services.constants.AgricultureStagesConstants"%>
<%@page import="com.nbp.cannabis.application.form.services.service.CannabisApplicationsLocalServiceUtil"%>
<%@page import="com.nbp.cannabis.application.form.services.model.CannabisApplications"%>
<%@page import="com.npm.cannabis.application.stages.services.model.CannabisApplicationStages"%>
<%@page import="com.npm.cannabis.application.stages.services.service.CannabisApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.creative.application.form.service.service.CreativeApplicationLocalServiceUtil"%>
<%@page import="com.nbp.creative.application.form.service.model.CreativeApplication"%>
<%@page import="com.nbp.creative.stages.services.service.CreativeApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.creative.stages.services.model.CreativeApplicationStages"%>
<%@page import="com.nbp.farm.application.form.service.service.FarmerApplicationLocalServiceUtil"%>
<%@page import="com.nbp.farm.application.form.service.model.FarmerApplication"%>
<%@page import="com.nbp.farm.application.stages.service.service.FarmApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.farm.application.stages.service.model.FarmApplicationStages"%>
<%@page import="com.nbp.film.application.form.service.service.FilmApplicationLocalServiceUtil"%>
<%@page import="com.nbp.film.application.form.service.model.FilmApplication"%>
<%@page import="com.nbp.healthcare.application.form.service.service.HealthCareApplicationLocalServiceUtil"%>
<%@page import="com.nbp.healthcare.application.form.service.model.HealthCareApplication"%>
<%@page import="com.nbp.healthcare.stage.service.service.HealthApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.healthcare.stage.service.model.HealthApplicationStages"%>
<%@page import="com.nbp.manufacturing.application.form.service.service.ManufacturingApplicationLocalServiceUtil"%>
<%@page import="com.nbp.manufacturing.application.form.service.model.ManufacturingApplication"%>
<%@page import="com.nbp.manufacturing.application.stages.services.service.ManufacturingApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages"%>
<%@page import="com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages"%>
<%@page import="com.nbp.pharmaceutical.stages.services.service.PharmaApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.tourism.application.form.services.service.TourismApplicationLocalServiceUtil"%>
<%@page import="com.nbp.tourism.application.form.services.model.TourismApplication"%>
<%@page import="com.nbp.tourism.application.stages.services.service.TourismApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.tourism.application.stages.services.model.TourismApplicationStages"%>
<%@page import="com.nbp.acquire.application.form.service.service.AcquireApplicationLocalServiceUtil"%>
<%@page import="com.nbp.acquire.application.form.service.model.AcquireApplication"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.nbp.acquire.stages.service.model.AcquireApplicationStages"%>
<%@page import="com.nbp.acquire.stages.service.service.AcquireApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.film.stages.services.service.FilmApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.film.stages.services.model.FilmApplicationStages"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.user.draft.dashboard.web.constants.DraftDashboardPortletKeys"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezStatusApplication"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.user.draft.dashboard.web.constants.DraftDashboardPortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<portlet:renderURL var="viewSingleApplicationUrl">
</portlet:renderURL>
<portlet:resourceURL var="tourismDashboardProgressURL"
	id="singleTourismApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="getSingleApplicationOverviewUrl"
	id="singleApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="getAgricultureApplicationOverviewUrl"
	id="agricultureApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="farmDashboardProgressURL"
	id="singleFarmerApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="manufactureDashboardProgressURL"
	id="singleManufactureApplicationOverview"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForPharma"
	id="/downlaod/pharma/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForCannabis"
	id="/downlaod/cannabis/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForAcquire"
	id="/downlaod/acquire/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForHealthCare"
	id="/downlaod/health/care/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForFilm"
	id="/downlaod/film/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForFarm"
	id="/downlaod/farm/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForManufacturing"
	id="/downlaod/manufacturing/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForCreative"
	id="/downlaod/creative/application-submitted-pdf"></portlet:resourceURL>
<portlet:resourceURL var="downloadPdfURlForAgriculture"
	id="/downlaod/agriculture/application-submitted-pdf"></portlet:resourceURL>
<%
	List<QuarryApplication> applicationQuarry=null;
	List<MiicApplication> miicDraftApplicationsList=new ArrayList<MiicApplication>();
	Format dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
	HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
	String selectedApplication = "";
	if(Validator.isNotNull(httpServletRequest.getParameter("selectedApplication"))){
		selectedApplication = (String) httpServletRequest.getParameter("selectedApplication");
	}else if(Validator.isNotNull(httpServletRequest.getParameter("_com_nbp_user_dashboard_UserDashboardPortlet_selectedApplication"))){
		selectedApplication = (String) httpServletRequest.getParameter("_com_nbp_user_dashboard_UserDashboardPortlet_selectedApplication");
	}
	String defaultActive = "current-active";
	String stageStatus = "Submitted";
	boolean showCannbisApplications = (boolean) renderRequest.getAttribute("Cannabis");
	boolean showCrownLandApplications = (boolean) renderRequest.getAttribute("Crown Lands");
	boolean showTourismApplications = (boolean) renderRequest.getAttribute("Tourism");
	boolean showPIRApplications = (boolean) renderRequest.getAttribute("PIR");
	boolean showPharmaceuticalApplications = (boolean) renderRequest.getAttribute("Pharmaceutical");
	boolean showFilmApplications = (boolean) renderRequest.getAttribute("Film");
	boolean showManufacturingApplications = (boolean) renderRequest.getAttribute("Manufacturing");
	boolean creativeEntertainment = (boolean) renderRequest.getAttribute("CreativeEntertainment");
	boolean superAdmin = (boolean) renderRequest.getAttribute("SuperAdmin");
	int applicationIdCounter = 1;
	int cannabisApplicationIDCounter = 1;
	int acquireApplicationIDCounter = 1;
	boolean noRecordFoundDraftCases = true;
	 List<AcquireApplication> acquireApplicationDraftList = new ArrayList<AcquireApplication>();
	 	try{
	 acquireApplicationDraftList = AcquireApplicationLocalServiceUtil.getAcquireByS_U(DraftDashboardPortletKeys.DRAFT,themeDisplay.getUserId()); 
	}catch(Exception e){}
	if(acquireApplicationDraftList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<AgricultureApplication> agricultureDraftApplicationsList = new ArrayList<AgricultureApplication>();
	try{
	 	agricultureDraftApplicationsList = AgricultureApplicationLocalServiceUtil.getAgricultureApplicationByS_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT); 
	}catch(Exception e){}
	if(agricultureDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<CannabisApplications> cannabisDraftApplicationsList = new ArrayList<CannabisApplications>();
	try{
		 cannabisDraftApplicationsList = CannabisApplicationsLocalServiceUtil.getCannabisApplicationsByS_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT); 
	}catch(Exception e){}
	if(cannabisDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<ManufacturingApplication> manufacturingDraftApplicationsList = new ArrayList<ManufacturingApplication>();
	try{
		 manufacturingDraftApplicationsList = ManufacturingApplicationLocalServiceUtil.getManufacturingByS_U(themeDisplay.getUserId(),DraftDashboardPortletKeys.DRAFT); 
	}catch(Exception e){}
	if(manufacturingDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<OsiApplication> osiApplicationList = new ArrayList<OsiApplication>();
	try{
		 osiApplicationList = OsiApplicationLocalServiceUtil.getOsiApplicationByS_UId(themeDisplay.getUserId(),DraftDashboardPortletKeys.DRAFT); 
	}catch(Exception e){}
	if(osiApplicationList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<CreativeApplication> creativeDraftApplicationsList = new ArrayList<CreativeApplication>();
	try{
		    creativeDraftApplicationsList = CreativeApplicationLocalServiceUtil.getCreativeByS_U(DraftDashboardPortletKeys.DRAFT,themeDisplay.getUserId()); 

	}catch(Exception e){}
	if(creativeDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<FarmerApplication> farmerDraftApplicationsList = new ArrayList<FarmerApplication>();
	try{
		 farmerDraftApplicationsList = FarmerApplicationLocalServiceUtil.getFarmerApplicationByS_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT); 

	}catch(Exception e){}
	if(farmerDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<FilmApplication> filmDraftApplicationsList = new ArrayList<FilmApplication>();
	try{
		 filmDraftApplicationsList = FilmApplicationLocalServiceUtil.getFilmByS_U( DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId()); 

	}catch(Exception e){}
	if(filmDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<HealthCareApplication> healthCareDraftApplicationList = new ArrayList<HealthCareApplication>();
	try{
		 healthCareDraftApplicationList = HealthCareApplicationLocalServiceUtil.getHealthCareByS_U(DraftDashboardPortletKeys.DRAFT,themeDisplay.getUserId()); 

	}catch(Exception e){}
	if(healthCareDraftApplicationList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<OsiInsolvencyApplication> osiInsolvencyApplicationList = new ArrayList<OsiInsolvencyApplication>();
	try{
		 osiInsolvencyApplicationList = OsiInsolvencyApplicationLocalServiceUtil.getOsiInsolvencyApplicationByS_U(DraftDashboardPortletKeys.DRAFT,themeDisplay.getUserId()); 

	}catch(Exception e){}
	if(osiInsolvencyApplicationList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<PharmaApplication> pharmaDraftApplicationsList = new ArrayList<PharmaApplication>();
	try{
		 pharmaDraftApplicationsList = PharmaApplicationLocalServiceUtil.getPharmaByS_U(DraftDashboardPortletKeys.DRAFT,themeDisplay.getUserId()); 
	}catch(Exception e){}
	if(pharmaDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<TourismApplication> tourismDraftApplicationList = new ArrayList<TourismApplication>();
	try{
		 tourismDraftApplicationList = TourismApplicationLocalServiceUtil.getTourismApplicationByS_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT); 
	}catch(Exception e){}
	if(tourismDraftApplicationList.size()>0){
		noRecordFoundDraftCases=false;
	}
	
	List<FireBrigadeApplication> fireBrigadeDraftAppliationList=new ArrayList<FireBrigadeApplication>();
	try{
		fireBrigadeDraftAppliationList=FireBrigadeApplicationLocalServiceUtil.getFireBrigadeByS_U(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){}
	if(fireBrigadeDraftAppliationList.size()>0){
		noRecordFoundDraftCases=false;	
	}
	List<OsiServicesApplication> osiServicesApplications=new ArrayList<OsiServicesApplication>();
	try{
		osiServicesApplications=OsiServicesApplicationLocalServiceUtil.getOsiServicesApplicationStatus(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){}
	if(osiServicesApplications.size()>0){
		noRecordFoundDraftCases=false;	
	}
	
	List<NcraApplication> ncraApplication=new ArrayList<NcraApplication>();
	try{
		ncraApplication=NcraApplicationLocalServiceUtil.getNcraByS_U(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){}
	if(ncraApplication.size()>0){
		noRecordFoundDraftCases=false;	
	}
	try{
		miicDraftApplicationsList=MiicApplicationLocalServiceUtil.getMIICByS_U(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){
		noRecordFoundDraftCases=false;	
	}
	
	try{
		applicationQuarry=QuarryApplicationLocalServiceUtil.getQuarryApplicationByStatus_UId(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){
	}
	if(applicationQuarry.size()>0){
		noRecordFoundDraftCases=false;	
	}
	List<MiningLeaseApplication> miningDraftApplicationsList = new ArrayList<MiningLeaseApplication>();
	try{
		miningDraftApplicationsList = MiningLeaseApplicationLocalServiceUtil.getMiningByS_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT);
	}catch(Exception e){}
	if(miningDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<OgtApplication> ogtDraftApplicationsList = new ArrayList<OgtApplication>();
	try{
		ogtDraftApplicationsList = OgtApplicationLocalServiceUtil.getOgtByS_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT);
	}catch(Exception e){}
	if(ogtDraftApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<MedicalFacilitiesApp> medicalApplicationsList = new ArrayList<MedicalFacilitiesApp>();
	try{
		medicalApplicationsList = MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesAppBy_S_U(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){}
	if(medicalApplicationsList.size()>0){
		noRecordFoundDraftCases=false;
	}
	List<FactoriesApplicationRegistration> factoriesDraftApplicationsList = new ArrayList<FactoriesApplicationRegistration>();
	try{
		factoriesDraftApplicationsList = FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesApplicationRegistrationByStatus_UserId(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){}
	List<JADSCApplication> jadscDraftApplicationsList = new ArrayList<JADSCApplication>();
	try{
		jadscDraftApplicationsList = JADSCApplicationLocalServiceUtil.getJADSCByS_U(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){}
	List<WRAApplication> wraDraftApplicationsList = new ArrayList<WRAApplication>();
	try{
		wraDraftApplicationsList = WRAApplicationLocalServiceUtil.getWraApplicationBy_S_UI(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
	}catch(Exception e){}
	List<JTBApplication> jtbDraftApplicationsList = new ArrayList<JTBApplication>();
	try{
		jtbDraftApplicationsList = JTBApplicationLocalServiceUtil.getJTBApplicationList_By_S_UId(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT);
	}catch(Exception e){}
	List<HsraApplication> hsraDraftApplicationsList = new ArrayList<HsraApplication>();
	try{
		hsraDraftApplicationsList = HsraApplicationLocalServiceUtil.getHsraByS_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT);
	}catch(Exception e){}
	List<NcbjApplication> ncbjDraftApplicationsList = new ArrayList<NcbjApplication>();
	try{
		ncbjDraftApplicationsList = NcbjApplicationLocalServiceUtil.getNCBJAppBy_S_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT);
	}catch(Exception e){}
	
	List<JanaacApplication> janaacDraftApplicationsList = new ArrayList<JanaacApplication>();
	try{
		janaacDraftApplicationsList = JanaacApplicationLocalServiceUtil.getJANAAC_ByS_U(themeDisplay.getUserId(), DraftDashboardPortletKeys.DRAFT);
	}catch(Exception e){}
	List<ExplosivesApplication> explosiveDraftApplicationsList = new ArrayList<ExplosivesApplication>();	
		try{
			explosiveDraftApplicationsList = ExplosivesApplicationLocalServiceUtil
				.getExplosiveAppByStatusUser(DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
		 }catch(Exception e){}
	
%>
<%
LiferayPortletURL acquireDashboardRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/acquire-application-form", renderRequest, "com_nbp_acquire_application_form_web_AcquireApplicationFormPortlet");
LiferayPortletURL pharmaAplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/pharmaceutical-license-application-form", renderRequest, "com_nbp_pharmaceutical_application_form_web_PharmaceuticalApplicationFormPortlet");
LiferayPortletURL agricultureAplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/application-form-for-agriculture", renderRequest, "com_nbp_agriculture_application_form_web_AgricultureApplicationFormPortlet");
LiferayPortletURL aplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/application-form", renderRequest, "com_nbp_cannabis_application_form_web_ApplicationFormPortlet");
LiferayPortletURL creativeFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/creative-application-form", renderRequest, "com_nbp_creative_application_form_web_CreativeApplicationFormPortlet");
LiferayPortletURL farmAplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/farm-application-form", renderRequest, "com_nbp_farm_application_form_web_FarmApplicationFormPortlet");
LiferayPortletURL filmAplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/film-application-form", renderRequest, "com_nbp_film_application_form_web_FilmApplicationFormPortlet");
LiferayPortletURL healthCareApplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/healthcare-application-form", renderRequest, "com_nbp_healthcare_application_form_web_HealthcareApplicationFormPortlet");
LiferayPortletURL manufacturingAplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/manufacturing-application-form", renderRequest, "com_nbp_manufacturing_application_form_web_ManufacturingApplicationFormPortlet");
LiferayPortletURL tourismformRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/tourism-application-form", renderRequest, "com_nbp_tourism_application_form_web_TourismApplicationFormPortlet");
LiferayPortletURL osiApplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/osi-application-form", renderRequest, "com_nbp_osi_application_form_web_OsiApplicationFormPortlet");
LiferayPortletURL osiInsolvencyApplicationFormRenderURL = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/osi-insolvency-reports-application-form", renderRequest, "com_nbp_osi_insolvency_application_form_web_OsiInsolvencyApplicationFormPortlet");
LiferayPortletURL sezStatusApplicationFormRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/sez-status-application-form", renderRequest, "com_nbp_sez_status_application_form_web_SezStatusApplicationFormPortlet");
String entityId = (String)themeDisplay.getUser().getExpandoBridge().getAttribute(DraftDashboardPortletKeys.ENTITY_ID);
LiferayPortletURL fireBrigadeApplicationFormRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/fire-brigade-application-form", renderRequest, "com_nbp_fire_brigade_application_form_web_FireBrigadeApplicationFormPortlet");
LiferayPortletURL osiServicesApplicationFormRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/osi-service-application", renderRequest, "com_nbp_osi_services_application_form_web_OSIServicesApplicationFormPortlet");
LiferayPortletURL ncraApplicationFormRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/ncra-application-form", renderRequest, "com_nbp_ncra_application_form_web_NCRAApplicationFormPortlet");
LiferayPortletURL miicApplicationFormRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/miic-application-form", renderRequest, "com_nbp_miic_application_form_web_MIICApplicationFormPortlet");
LiferayPortletURL quarryApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/quarry-application-form", renderRequest, "com_nbp_quarry_application_form_web_QuarryApplicationFormPortlet");
LiferayPortletURL miningApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/mining-application-form", renderRequest, "com_nbp_mining_lease_application_form_web_MiningLeaseApplicationFormPortlet");
LiferayPortletURL ogtApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/ogt-application-form", renderRequest, "com_nbp_ogt_application_form_web_ComNbpOgtApplicationFormWebPortlet");
LiferayPortletURL medicalApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/medical-facilities-application-form", renderRequest, "com_nbp_medical_facilities_application_form_web_MedicalFacilitiesApplicationFormPortlet");
LiferayPortletURL factoriesApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/factories-registration-application-form", renderRequest, "com_nbp_factories_registration_application_form_web_FactoriesRegistrationApplicationFormWebPortlet");
LiferayPortletURL jadscApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/adsc-application-from", renderRequest, "com_nbp_jadsc_application_form_web_JADSCApplicationFormPortlet");
LiferayPortletURL wraApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/wra-application-form", renderRequest, "com_nbp_wra_application_form_web_WRAApplicationFormPortlet");
LiferayPortletURL hsraApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/hsra-application-form", renderRequest, "com_nbp_hsra_application_form_web_HSRAApplicationFormPortlet");
LiferayPortletURL ncbjApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(), "/ncbj-application-form", renderRequest, "com_nbp_ncbj_application_form_web_NCBJApplicationFormPortlet");
 LiferayPortletURL jtbApplicationRenderUrl =null;
for (JTBApplication jtbApplication : jtbDraftApplicationsList) {
	if (jtbApplication.getTypeOfApplication().equals("Accommodations Licence")) {
		jtbApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(),"/tpdco-accommodation-application-form",renderRequest,"com_nbp_jtb_application_form_web_JTBApplicationFormWebPortlet");
	} else if (jtbApplication.getTypeOfApplication().equals("Attractions") || jtbApplication.getTypeOfApplication().equals("Other Tourism Related Licences")) {
		jtbApplicationRenderUrl = DashboardUtil.getCollaborationDashboardUrl(themeDisplay.getScopeGroupId(),"/tpdco-attraction-application-form",renderRequest,"com_nbp_jtb_application_form_web_JTBApplicationFormWebPortlet");
	} 
}
%>
