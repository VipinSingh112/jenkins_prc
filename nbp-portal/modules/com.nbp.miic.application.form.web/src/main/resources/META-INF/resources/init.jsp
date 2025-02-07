<%@page import="com.nbp.miic.application.form.services.service.MiicSuspensionOfCetLocalServiceUtil"%>
<%@page import="com.nbp.miic.application.form.services.model.MiicSuspensionOfCet"%>
<%@page import="com.nbp.miic.application.form.services.service.MiicSafeguardGoodAddLocalServiceUtil"%>
<%@page import="com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd"%>
<%@page import="com.nbp.miic.application.form.services.service.MiicSafeguardMaterialAddLocalServiceUtil"%>
<%@page import="com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd"%>
<%@page import="com.nbp.miic.application.form.services.service.MiicSuspensionOfCetAddLocalServiceUtil"%>
<%@page import="com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.miic.application.form.services.service.MiicApplicantDetailsLocalServiceUtil"%>
<%@page import="com.nbp.miic.application.form.services.model.MiicApplicantDetails"%>
<%@page
	import="com.nbp.miic.application.form.services.service.MiicApplicationCurrentStageLocalServiceUtil"%>
<%@page
	import="com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil"%>
<%@page
	import="com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage"%>
<%@page
	import="com.nbp.miic.application.form.services.model.MiicApplication"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
	

<liferay-theme:defineObjects />

<portlet:defineObjects />
<%@page import="java.util.List"%>
<%
	MiicApplication applicationData = null;
	MiicApplicationCurrentStage miicApplicationCurrentStage = null;
	MiicApplicantDetails applicantDetail=null;
	MiicSuspensionOfCet susOfCet=null;
	MiicSuspensionOfCet suspensionOfCet=null;
	int cetSuspensionDetailVal=1;
	int materialRequiredDetailVal=1;
	int goodsProducedDetailVal=1;
	long miicApplicationId = 0;
	String currentStage = "";
	String lastFormStep = "";
	String miicApplication = null;
	String typeOfManufacturer = null;
	String typeOfTransaction = null;
	List<MiicSuspensionOfCetAdd> suspensionOfCetAdd=null;
	List<MiicSafeguardGoodAdd> safeguardAdd=null;
	int susOfSezSize=0;
	int safeguardMaterialSize=0;
	int safeguardAddSize=0;
	int counterOfDocuments=1;
	List<MiicSafeguardMaterialAdd> safeguardMaterial=null;
	String natureOfApplicant = "";
	HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
	if (Validator.isNotNull(httpServletRequest.getParameter("miicApplicationId"))) {
		miicApplicationId = Long.valueOf(httpServletRequest.getParameter("miicApplicationId"));
	}
	if (miicApplicationId > 0) {
		try {
			applicationData = MiicApplicationLocalServiceUtil.getMiicApplication(miicApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(applicationData)) {
			if (Validator.isNotNull(applicationData.getMiicApplication())) {
				miicApplication = applicationData.getMiicApplication();
			}
			if (Validator.isNotNull(applicationData.getTypeOfManufacturer())) {
				typeOfManufacturer = applicationData.getTypeOfManufacturer();
			}
			if (Validator.isNotNull(applicationData.getTypeOfTransaction())) {
				typeOfTransaction = applicationData.getTypeOfTransaction();
			}
		}
		try {
			miicApplicationCurrentStage = MiicApplicationCurrentStageLocalServiceUtil
					.getMIIC_Stage_MIIC_AI(miicApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(miicApplicationCurrentStage)
				&& Validator.isNotNull(miicApplicationCurrentStage.getCurrentStage())) {
			currentStage = miicApplicationCurrentStage.getCurrentStage();
			System.out.println("currentStage in init jsp is---------------------"+currentStage);
		}
		if (Validator.isNotNull(miicApplicationCurrentStage)
				&& Validator.isNotNull(miicApplicationCurrentStage.getLastFormStep())) {
			lastFormStep = miicApplicationCurrentStage.getLastFormStep();
			System.out.println("lastFormStep in init jsp is---------------------"+lastFormStep);
		}
			try{
				applicantDetail=MiicApplicantDetailsLocalServiceUtil.getMiicById(miicApplicationId);
				if (Validator.isNotNull(applicantDetail) && Validator.isNotNull(applicantDetail.getNatureOfApplicant())) {
					natureOfApplicant = applicantDetail.getNatureOfApplicant();
				}
			}catch(Exception e){
			}
			try{
				susOfCet=MiicSuspensionOfCetLocalServiceUtil.getMiicById(miicApplicationId);
			}catch(Exception e){
			}
		try{
			suspensionOfCetAdd=MiicSuspensionOfCetAddLocalServiceUtil.getMiicById(miicApplicationId);
			susOfSezSize=suspensionOfCetAdd.size();
		}catch(Exception e){
		}
		
		try{
			safeguardMaterial=MiicSafeguardMaterialAddLocalServiceUtil.getMiicById(miicApplicationId);
			safeguardMaterialSize=safeguardMaterial.size();
		}catch(Exception e){
		}
		try{
			safeguardAdd=MiicSafeguardGoodAddLocalServiceUtil.getMiicById(miicApplicationId);
			safeguardAddSize=safeguardAdd.size();
		}catch(Exception e){
		}
	}
%>