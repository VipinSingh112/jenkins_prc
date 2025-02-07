package com.nbp.explosives.competency.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.explosives.application.util.ExplosiveApplicationDataCreationUtil;
import com.nbp.explosives.application.util.ExplosiveApplicationDocumentsCopyUtil;
import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage;
import com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormLocalServiceUtil;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesCurrentStageLocalServiceUtil;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationFormPortletKeys;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationWorkFlowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + ExplosivesCompetencyApplicationFormPortletKeys.EXPLOSIVESCOMPETENCYAPPLICATIONFORM,
		"mvc.command.name=renew/licence/url" 
},
service = MVCResourceCommand.class)

public class RenewExplosiveResourceCommand implements MVCResourceCommand{
	static Log _log = LogFactoryUtil.getLog(RenewExplosiveResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Explosive Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("-------------------inside resource command renew---------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		String explosivesApplicationType = ParamUtil.getString(resourceRequest, "explosivesApplicationType");
		String dateOfIssue = ParamUtil.getString(resourceRequest, "dateOfIssue");
		String dateOfExpiration = ParamUtil.getString(resourceRequest, "dateOfExpiration");
		System.out.println("--------------licence no. "+licenseNumber);
		ExplosivesApplication explosivesApplication = null;
		ExplosivesApplication explosiveApplicationRenewalProcess = null;
		
		long explosivesApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(licenseNumber)) {
					System.out.println("-------------if licence no is not null-----------------");
					explosivesApplication =ExplosivesApplicationLocalServiceUtil.getExplosiveByAppNo(licenseNumber);
				}
	
				explosivesApplicationId=explosivesApplication.getExplosivesApplicationId();
			}catch (Exception e) {
			}
			if(Validator.isNull(explosivesApplication)) {
				System.out.println("--------------inside explosive application if it is  null -----------------");
				if (Validator.isNull(licenseNumber)){
					System.out.println("---------------------if licence no. not written-----------------");
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
				    resourceResponse.getWriter().write(jsonFeed.toString());
				}else {
				String renewUrl = ExplosiveApplicationDataCreationUtil.getApplicationData(themeDisplay, licenseNumber,explosivesApplicationType,dateOfIssue,dateOfExpiration);
				jsonOBJ.put("renewLicenseUrl", renewUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().print(jsonFeed.toString());
				}
			}else {
				if(explosivesApplication.getStatus()==ExplosivesCompetencyApplicationWorkFlowConstant.SUBMITTED) {
					System.out.println("---------------------------after successfully submitted-----------------------");
					if (Validator.isNotNull(licenseNumber)) {  
						try {
							explosiveApplicationRenewalProcess = ExplosivesApplicationLocalServiceUtil.getExplosiveRegstByAT_AppNo(ExplosivesCompetencyApplicationWorkFlowConstant.RENEW,licenseNumber);			
						} catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					}if(explosiveApplicationRenewalProcess==null) {
						ExplosivesCurrentStage renewCurrentStage=null;
						renewCurrentStage= ExplosivesCurrentStageLocalServiceUtil.createExplosivesCurrentStage(CounterLocalServiceUtil.increment());
						renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
						renewCurrentStage.setLastFormDetailsStep("childStep1");
						
		
						System.out.println("---------------------after application form detail----------------");
						
						explosiveApplicationRenewalProcess =ExplosivesApplicationLocalServiceUtil.createExplosivesApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						explosiveApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
						explosiveApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
						explosiveApplicationRenewalProcess.setCreateDate(new Date());
						explosiveApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
						explosiveApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
						explosiveApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
						explosiveApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						explosiveApplicationRenewalProcess.setTypeOfTransaction(ExplosivesCompetencyApplicationWorkFlowConstant.RENEW);
						explosiveApplicationRenewalProcess.setStatus(ExplosivesCompetencyApplicationWorkFlowConstant.DRAFT);
						explosiveApplicationRenewalProcess.setTypeOfApplicant(explosivesApplication.getTypeOfApplicant());
						explosiveApplicationRenewalProcess.setCompetencyCertificateNumber(licenseNumber);
						try {
							if (Validator.isNotNull(explosiveApplicationRenewalProcess)) {
								explosiveApplicationRenewalProcess.setDateOfIssue(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfIssue));
							}
						} catch (Exception e) {
						}
						try {
							if (Validator.isNotNull(explosiveApplicationRenewalProcess)) {
								explosiveApplicationRenewalProcess.setDateOfExpiration(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfExpiration));
							}
						} catch (Exception e) {
						}
						ExplosivesApplicationLocalServiceUtil.updateExplosivesApplication(explosiveApplicationRenewalProcess);
						renewCurrentStage.setExplosivesApplicationId(explosiveApplicationRenewalProcess.getExplosivesApplicationId());
						ExplosivesCurrentStageLocalServiceUtil.updateExplosivesCurrentStage(renewCurrentStage);
						copyingDataFromOriginalApplication(explosivesApplication.getExplosivesApplicationId(), explosiveApplicationRenewalProcess.getExplosivesApplicationId());
						ServiceContext serviceContext = new ServiceContext();
						DLFolder originalRootDlFolder = null;
						DLFolder supportingDocsMainFolder = null;
						
						serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);
						try {
							originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
							System.out.println("-------------------originalRootDlFolder------------------------"+originalRootDlFolder);

						} catch (PortalException e) {
							_log.error("Error---->>" + e.getMessage());
						}
						try {
							supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
									String.valueOf(explosivesApplicationId));
                     System.out.println("----------supportingDocsMainFolder--------------"+supportingDocsMainFolder);
							

						} catch (PortalException e) {
							_log.error("Error----->>" + e.getMessage());
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											explosiveApplicationRenewalProcess.getExplosivesApplicationId()));
							System.out.println("-----------copiedDlFolder--------------"+copiedDlFolder);
						} catch (Exception e) {
							_log.error("Error----->>" + e.getMessage());
						}
						if (copiedDlFolder == null) {
							System.out.println("-------------inside ---copiedDlFolder------------");
							ExplosiveApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
									supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
									String.valueOf(
											explosiveApplicationRenewalProcess.getExplosivesApplicationId()),
									     supportingDocsMainFolder.getDescription(), serviceContext,
									     supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
									     explosiveApplicationRenewalProcess.getExplosivesApplicationId());

						}
					}
					
					String renewLicenseUrl = 
							 "/group/guest/explosives-competency-certification-application-form?explosivesApplicationId="+explosiveApplicationRenewalProcess.getExplosivesApplicationId();
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
					
				} else {
					System.out.println("-------------------form not submitted----------------going in else-------------------");
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}
				}
			
		}
			
		  catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
			_log.error("Error****************" + e.getCause());
		}
		return false;
	}

public static void copyingDataFromOriginalApplication(long explosivesApplicationId,
		long explosiveRenewalApplicationId) {
	
	 System.out.println("explosive renew app id*****"+explosiveRenewalApplicationId);
		 
	 BlasterCompetencyForm blaster=null;
	 BlasterCompetencyForm renewBlaster=null;
	 
	 
    try {
     blaster = BlasterCompetencyFormLocalServiceUtil.getExplosiveById(explosivesApplicationId);
	}catch (Exception e) {}
	 try {
	 renewBlaster =BlasterCompetencyFormLocalServiceUtil.getExplosiveById(explosivesApplicationId);
	}catch (Exception e) {}			 

	 if(blaster!=null) {
		    renewBlaster.setSurName(blaster.getSurName());
			renewBlaster.setFirstName(blaster.getFirstName());
			renewBlaster.setMiddleName(blaster.getMiddleName());
			renewBlaster.setGender(blaster.getGender());
			renewBlaster.setOfficeNumber(blaster.getOfficeNumber());
			renewBlaster.setCellNum(blaster.getCellNum());
			renewBlaster.setTrnNum(blaster.getTrnNum());
			renewBlaster.setDateOfBirth(blaster.getDateOfBirth());
			renewBlaster.setAddress(blaster.getAddress());
			renewBlaster.setEducationalBack(blaster.getEducationalBack());
			renewBlaster.setBlastingCourse(blaster.getBlastingCourse());
			renewBlaster.setNameOfCourse(blaster.getNameOfCourse());
			renewBlaster.setCourseOrganiser(blaster.getCourseOrganiser());
			renewBlaster.setDateAppli(blaster.getDateAppli());
			renewBlaster.setExplosivesApplicationId(explosiveRenewalApplicationId);
			BlasterCompetencyFormLocalServiceUtil.updateBlasterCompetencyForm(renewBlaster);
	 }
	}
	 
	    
}       	
