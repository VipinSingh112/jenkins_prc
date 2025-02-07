<%@page import="com.nbp.sez.status.upload.document.commands.GettingDocumentData"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevDisasterManagement"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevDisasterManagementLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevEmplomentInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.sezDeveloperUndertakingLocalService"%>
<%@page import="com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist"%>
<%@page import="com.nbp.sez.status.application.form.service.model.sezDeveloperUndertaking"%>
<%@page import="com.nbp.sez.status.application.form.service.service.sezSubmissionChecklistLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.sezDeveloperUndertakingLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevDisasterManagementAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevEmployeeDefineOccuAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevEmployeeSafetyInfoAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevProposedProjectAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevProposedProjectAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevSharePleaseStateAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevSharePleaseStateAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevShareCorporationBusAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevShareComDirectorShipAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevShareDirectorAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevSharePrincipalAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevGenBusinessInfoAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevInvestmentAndFinancialLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevInvestmentAndFinancial"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevPropDevelopmentPlanLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevProposedProjectLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevProposedProject"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevShareholdingInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezDevGeneralBusinessIfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo"%>
<%@ include file="../init.jsp" %>

<%
int devVentureComInfoVal=1;
int devShareholderDetailVal=1;
int devDirectorShareholderVal=1;
int devComDirectorVal=1;
int devCorporationVal=1;
int devDirectorBankruptInvolveVal=1;
int devOperatingZoneLocationVal=1;
int securityMeasuresTableVal=1;
int devOccuSafetySystemVal=1;
int disasterMitigationPlanVal = 1;
SezDevGeneralBusinessIfo genBusinessInfo=null;
SezDevShareholdingInfo shareholdingInfo=null;
SezDevProposedProject proposedProject=null;
SezDevPropDevelopmentPlan proDevelopmentPlan=null;
SezDevEmplomentInfo emploment=null;
SezDevInvestmentAndFinancial investmentAndFinance=null;
sezDeveloperUndertaking developerUndertaking=null;
sezSubmissionChecklist submissionChecklist = null;
SezDevDisasterManagement disasterManagement = null;
String signatureUrl="";
String signatureUrlPublicNotary="";
String signatureUrlSubmission="";
if(sezStatusApplicationId>0){
		try {
			genBusinessInfo = SezDevGeneralBusinessIfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		
		try {
			shareholdingInfo = SezDevShareholdingInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		try {
			proposedProject = SezDevProposedProjectLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		try {
			proDevelopmentPlan = SezDevPropDevelopmentPlanLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		try {
			investmentAndFinance = SezDevInvestmentAndFinancialLocalServiceUtil
					.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		try {
			developerUndertaking = sezDeveloperUndertakingLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		try {
			submissionChecklist = sezSubmissionChecklistLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		try {
			emploment = SezDevEmplomentInfoLocalServiceUtil.getgetSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		try {
			disasterManagement = SezDevDisasterManagementLocalServiceUtil.getSezById(sezStatusApplicationId);	
		} catch (Exception e) {
		}
		try{
		 signatureUrl=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Developer Undertaking Declarant", themeDisplay.getScopeGroupId(), sezStatusApplicationId);
		}catch(Exception e){}
		try{
			signatureUrlPublicNotary=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Developer Public Notary", themeDisplay.getScopeGroupId(), sezStatusApplicationId);
		}catch(Exception e){
		}
		try{
			signatureUrlSubmission=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Developer Submission Checklist", themeDisplay.getScopeGroupId(), sezStatusApplicationId);
		}catch(Exception e){}
		}
%>

<div class="hide" id="sezDevApplicationForm">
<div class="tab-content pl-lg-4">
<div class="tab-pane" role="tabpanel" id="childStep1">
	<div class="tab-form">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-md-12">
					 <p class="tab-form-title f2">General Business Information</p>
					<p class="tab-form-title-subtitle f2">In this section you will provide general information about yourself.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Application date</p>
						<input type="date" class="form-control" id="devAppDate" value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getApplicationDate())?new SimpleDateFormat("yyyy-MM-dd").format(genBusinessInfo.getApplicationDate()):"" %>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading" for="devAppName"><span class="tab-form-highlghtme-link pr-2">2.</span>Applicant Name*</p>
						<input type="text" class="form-control" id="devAppName"
							placeholder="" value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getApplicantName())?genBusinessInfo.getApplicantName():""%>">
						<p class="tab-form-sub-heading fieldAlert hide"
							id="devAppNameValidation" style="color: red;">Please Enter Name</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Company Name</p>
						<input type="text" class="form-control" id="devCompanyName"
							placeholder="" value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getCompanyName())?genBusinessInfo.getCompanyName():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Building No. and Street Address</p>
						<input type="text" class="form-control" id="devCompanyStreetAddress" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getBuildingNum())?genBusinessInfo.getBuildingNum():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Town/City</p>
						<input type="text" class="form-control" id="devCompanyTown" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getTownCity())?genBusinessInfo.getTownCity():"" %>">
					</div>
				</div>
				<%-- <div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Parish/Post /Zip Code</p>
						<input type="text" class="form-control" id="devCompanyZipCode" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getParish())?genBusinessInfo.getParish():"" %>">
					</div>
				</div> --%>
				<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="devCompanyZipCode">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=genBusinessInfo!=null?genBusinessInfo.getParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
				<%-- <div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Country</p>
						<input type="text" class="form-control" id="devCountry" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getCountry())?genBusinessInfo.getCountry():"" %>">
					</div>
				</div> --%>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Country</p>
						<input type="text" class="form-control" id="devCountry" placeholder="" disabled="" value="Jamaica">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Telephone No./s</p>
						<input type="text" class="form-control" id="devTelephone" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getTelephoneNum())?genBusinessInfo.getTelephoneNum():"" %>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Fax No./s</p>
						<input type="text" class="form-control " id="devFax" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getFaxNum())?genBusinessInfo.getFaxNum():"" %>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">E-mail Address/s*</p>
						<input type="text" class="form-control" id="devEmail" placeholder="user@example.com"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getEmailAddress())?genBusinessInfo.getEmailAddress():"" %>">
							<p class="tab-form-sub-heading fieldAlert hide" id="devEmailValidation" style="color: red;"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Website</p>
						<input type="text" class="form-control" id="devWebsite" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getWebsite())?genBusinessInfo.getWebsite():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
                 	<p class="tab-form-title-subtitle f2">3. Address Local Head Office</p> 
                </div>
                <div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Building No. and Street Address</p>
						<input type="text" class="form-control" id="devLocalStreetAddress" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getHeadOfficeBuildingNum())?genBusinessInfo.getHeadOfficeBuildingNum():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Town/City</p>
						<input type="text" class="form-control" id="devLocalTown" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getHeadOfficeTown())?genBusinessInfo.getHeadOfficeTown():""%>">
					</div>
				</div>
				<%-- <div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Parish/Post /Zip Code</p>
						<input type="text" class="form-control" id="devLocalZipCode" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getHeadOfficeParish())?genBusinessInfo.getHeadOfficeParish():""%>">
					</div>
				</div> --%>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Parish</p>
							<div class="select-wrapper position-relative">
								<select class="form-select form-control" name="pselect"
									id="devLocalZipCode">
									<option value="" disabled="" selected="">Please
										Select</option>
									<option value="Kingston" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
									<option value="St. Andrew" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
									<option value="Portland" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
									<option value="St. Thomas" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
									<option value="St. Catherine" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
									<option value="St. Mary" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
									<option value="St. Ann" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
									<option value="Manchester" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
									<option value="Clarendon" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
									<option value="Hanover" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
									<option value="Westmoreland" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
									<option value="St. James" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
									<option value="Trelawny" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
									<option value="St. Elizabeth" <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
								</select>
								</div>
							</div>
						</div>
				<div class="col-md-12"> 
                 	<p class="tab-form-title-subtitle f2">4. Authorised Representative</p> 
                </div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Name*</p>
						<input type="text" class="form-control" id="devRepName" placeholder=""
						value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getAuthRepName())?genBusinessInfo.getAuthRepName():""%>">
							<p class="tab-form-sub-heading fieldAlert hide"id="devRepNameValidation" style="color: red;">Please Enter Name</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Building No. and Street Address</p>
						<input type="text" class="form-control" id="devRepStreetAddress" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getAuthRepBuildingNum())?genBusinessInfo.getAuthRepBuildingNum():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Town/City</p>
						<input type="text" class="form-control" id="devRepTown" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getAuthRepTown())?genBusinessInfo.getAuthRepTown():""%>">
					</div>
				</div>
				<%-- <div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Parish/Post /Zip Code</p>
						<input type="text" class="form-control" id="devRepZipCode" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getAuthRepParish())?genBusinessInfo.getAuthRepParish():""%>">
					</div>
				</div> --%>
				<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Parish</p>
							<div class="select-wrapper position-relative">
								<select class="form-select form-control" name="pselect"
									id="devRepZipCode">
									<option value="" disabled="" selected="">Please
										Select</option>
									<option value="Kingston" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
									<option value="St. Andrew" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
									<option value="Portland" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
									<option value="St. Thomas" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
									<option value="St. Catherine" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
									<option value="St. Mary" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
									<option value="St. Ann" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
									<option value="Manchester" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
									<option value="Clarendon" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
									<option value="Hanover" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
									<option value="Westmoreland" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
									<option value="St. James" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
									<option value="Trelawny" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
									<option value="St. Elizabeth" <%=genBusinessInfo!=null?genBusinessInfo.getAuthRepParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
								</select>
								</div>
							</div>
						</div>
				<%-- <div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Country</p>
						<input type="text" class="form-control" id="devRepCountry" placeholder=""
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getAuthRepCountry())?genBusinessInfo.getAuthRepCountry():""%>">
					</div>
				</div> --%>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Country</p>
						<input type="text" class="form-control" id="devRepCountry" placeholder="" disabled="" value="Jamaica">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Telephone No./s</p>
						<input type="text" class="form-control " id="devRepTelephone" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getAuthReptelephoneNum())?genBusinessInfo.getAuthReptelephoneNum():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Fax No./s</p>
						<input type="text" class="form-control " id="devRepFax" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getAuthRepFaxNum())?genBusinessInfo.getAuthRepFaxNum():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">E-mail Address/s*</p>
						<input type="text" class="form-control " id="devRepEmail" placeholder="user@example.com"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getAutheEmailAddress())?genBusinessInfo.getAutheEmailAddress():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="devRepEmailValidation" style="color: red;"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>Is the applicant a part of a Joint Venture/Special Purpose Vehicle?</p>
						<div class="d-flex">
							<div class="wizard-form-radio d-block">
								<input value="Yes" type="radio"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getJoinVenture())&&genBusinessInfo.getJoinVenture().equals("Yes")?"checked":""%>
									name="devJointVenture"> <label for="">Yes</label>
							</div>
							<div class="wizard-form-radio d-block ml-3">
								<input value="No" type="radio"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getJoinVenture())&&genBusinessInfo.getJoinVenture().equals("No")?"checked":""%>
									name="devJointVenture"> <label for="">No</label>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row hide" id="devJointVentureBox">
				<input id="devVentureComInfoVal" type="hidden" name="devVentureComInfoVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="addVentureComInfoBox">
						<div class="accordion__header is-active" id="addVentureComInfo" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>Please state parent company name and address</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Company Name</p>
										<input type="text" class="form-control" id="devJointVenCompanyName"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Building No. and Street Address</p>
										<input type="text" class="form-control" id="devJointVenStreetAddress" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Town/City</p>
										<input type="text" class="form-control" id="devJointVenTown" placeholder=""
											value="">
									</div>
								</div>
								<!-- <div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Parish/Post /Zip Code</p>
										<input type="text" class="form-control" id="devJointVenZipCode" placeholder=""
											value="">
									</div>
								</div> -->
								<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Parish</p>
							<div class="select-wrapper position-relative">
								<select class="form-select form-control" name="pselect"
									id="devJointVenZipCode">
									<option value="" disabled="" selected="">Please
										Select</option>
									<option value="Kingston" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Kingston")?"selected":"":StringPool.BLANK%> --%>>Kingston</option>
									<option value="St. Andrew" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%> --%>>St. Andrew</option>
									<option value="Portland" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Portland")?"selected":"":StringPool.BLANK%> --%>>Portland</option>
									<option value="St. Thomas" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%> --%>>St. Thomas</option>
									<option value="St. Catherine" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%> --%>>St. Catherine</option>
									<option value="St. Mary" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Mary")?"selected":"":StringPool.BLANK%> --%>>St. Mary</option>
									<option value="St. Ann" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Ann")?"selected":"":StringPool.BLANK%> --%>>St. Ann</option>
									<option value="Manchester" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Manchester")?"selected":"":StringPool.BLANK%> --%>>Manchester</option>
									<option value="Clarendon" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Clarendon")?"selected":"":StringPool.BLANK%> --%>>Clarendon</option>
									<option value="Hanover" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Hanover")?"selected":"":StringPool.BLANK%> --%>>Hanover</option>
									<option value="Westmoreland" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%> --%>>Westmoreland</option>
									<option value="St. James" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. James")?"selected":"":StringPool.BLANK%> --%>>St. James</option>
									<option value="Trelawny" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("Trelawny")?"selected":"":StringPool.BLANK%> --%>>Trelawny</option>
									<option value="St. Elizabeth" <%-- <%=genBusinessInfo!=null?genBusinessInfo.getHeadOfficeParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%> --%>>St. Elizabeth</option>
								</select>
								</div>
							</div>
						</div>
								<!-- <div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Country</p>
										<input type="text" class="form-control" id="devJointVenCountry" placeholder=""
											value="">
									</div>
								</div> -->
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Country</p>
										<input type="text" class="form-control" id="devJointVenCountry" placeholder="" disabled="" value="Jamaica">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Telephone No./s</p>
										<input type="text" class="form-control" id="devJointVenTelephone" placeholder=""value=""
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Fax No./s</p>
										<input type="text" class="form-control" id="devJointVenFax" placeholder=""value=""
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
											
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">E-mail Address *</p>
										<input type="text" class="form-control" id="devJointVenEmail" placeholder="user@example.com"
											value="">
											<p class="tab-form-sub-heading fieldAlert hide" id="devJointVenEmailValidation" style="color: red;"></p>
									</div>
								</div>
							</div>
						</div>
					</div>			
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4"> 
				<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreVentureComInfo" onclick="addVentureComInfoBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12  table-responsive devJointVentureTableBox hide">
					<table class="table table-bordered mb-3">
						<tbody class="devJointVentureFormTable">
							<tr>
								<th class="sub_heading">Company Name</th>
								<th class="sub_heading text-nowrap">Building No. and Street Address</th>
								<th class="sub_heading">Town/City</th>
								<th class="sub_heading">Parish/Post /Zip Code</th>
								<th class="sub_heading">Country</th>
								<th class="sub_heading">Telephone No./s</th>
								<th class="sub_heading">Fax No./s</th>
								<th class="sub_heading">E-mail Address/s</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							<%if(Validator.isNotNull(genBusinessAdd)&&genBusinessAdd.size()>0){
								for(SezDevGenBusinessInfoAdd businessInfoAdd:genBusinessAdd){
							%>					
							<tr>
								<td class="sub_heading_content devJointVenCompanyName<%=devVentureComInfoVal%>">
								<%=Validator.isNotNull(businessInfoAdd)&&Validator.isNotNull(businessInfoAdd.getCompanyName())?businessInfoAdd.getCompanyName():""%>
								</td>
								<td class="sub_heading_content devJointVenStreetAddress<%=devVentureComInfoVal%>">
								<%=Validator.isNotNull(businessInfoAdd)&&Validator.isNotNull(businessInfoAdd.getBuildingNum())?businessInfoAdd.getBuildingNum():""%>
								</td>
								<td class="sub_heading_content devJointVenTown<%=devVentureComInfoVal%>">
								<%=Validator.isNotNull(businessInfoAdd)&&Validator.isNotNull(businessInfoAdd.getTownCity())?businessInfoAdd.getTownCity():""%>
								</td>
								<td class="sub_heading_content devJointVenZipCode<%=devVentureComInfoVal%>">
								<%=Validator.isNotNull(businessInfoAdd)&&Validator.isNotNull(businessInfoAdd.getParish())?businessInfoAdd.getParish():""%>
								</td>								
								<td class="sub_heading_content devJointVenCountry<%=devVentureComInfoVal%>">
								<%=Validator.isNotNull(businessInfoAdd)&&Validator.isNotNull(businessInfoAdd.getCountry())?businessInfoAdd.getCountry():""%>
								</td>
								<td class="sub_heading_content devJointVenTelephone<%=devVentureComInfoVal%>">
								<%=Validator.isNotNull(businessInfoAdd)&&Validator.isNotNull(businessInfoAdd.getTelephoneNum())?businessInfoAdd.getTelephoneNum():""%>
								</td>
								<td class="sub_heading_content devJointVenFax<%=devVentureComInfoVal%>">
								<%=Validator.isNotNull(businessInfoAdd)&&Validator.isNotNull(businessInfoAdd.getFaxNum())?businessInfoAdd.getFaxNum():""%>
								</td>
								<td class="sub_heading_content devJointVenEmail<%=devVentureComInfoVal%>">
								<%=Validator.isNotNull(businessInfoAdd)&&Validator.isNotNull(businessInfoAdd.getEmailAddress())?businessInfoAdd.getEmailAddress():""%>
								</td>
								<td> 
									<span> 
										<a href="javascript:void(0)" onclick="devVentureComEditTab('<%=devVentureComInfoVal%>');"> 
									        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
									         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
									        </svg> 
									      </a> 
									  </span>
							     </td>
							     <td> 
									<span> 
										<a href="javascript:void(0)" onclick="devVentureComDeleteData('<%=devVentureComInfoVal%>');"> 
									        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
									        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
									        </svg>
									      </a> 
									  </span>  
                                 </td>
							</tr>
							<input type="hidden" id="devVentureAppId<%=devVentureComInfoVal%>"  name="devVentureAppId<%=devVentureComInfoVal%>" value="<%=businessInfoAdd.getSezDevGenBusinessInfoAddId()%>">
							<%devVentureComInfoVal=devVentureComInfoVal+1;
							}}%>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Are you an existing Jamaican Company under the Companies Act, 2004 (Act 10 of 2004)?</p>
						<div class="d-flex">
							<div class="wizard-form-radio d-block">
								<input value="Yes" type="radio" <%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getExistingJamicanCom())&&genBusinessInfo.getExistingJamicanCom().contains("Yes")?"checked":""%>
									name="devExistingCom"> <label for="">Yes</label>
							</div>
							<div class="wizard-form-radio d-block ml-3">
								<input value="No" type="radio"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getExistingJamicanCom())&&genBusinessInfo.getExistingJamicanCom().contains("No")?"checked":""%>
									name="devExistingCom"> <label for="">No</label>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row hide" id="devExistingComBox">
				<div class="col-md-12 pt-3"> 
		               <p class="common-section-small-heading mb-0"><span class="tab-form-highlghtme-link pr-2">7.</span>Please select the form of the articles of incorporation</p> 
		        </div>
				<div class="col-lg-12">
					<div class="form-group">
						<div class="select-wrapper position-relative">
							<select class="form-select form-control" id="devFormArticle">
								<option value="" selected="" disabled="">Please select</option>
								<option value="A company limited by shares"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getArticleOfIncorporation())&&genBusinessInfo.getArticleOfIncorporation().equals("A company limited by shares")?"selected":""%>>A company limited by shares</option>
								<option value="A company limited by guarantee and not having a share capital"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getArticleOfIncorporation().equals("A company limited by guarantee and not having a share capital"))?"selected":""%>>
								A company limited by guarantee and not having a share capital</option>
								<option value="An unlimited company having a share capital"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getArticleOfIncorporation())&&genBusinessInfo.getArticleOfIncorporation().equals("An unlimited company having a share capital")?"selected":""%>>An unlimited company having a share capital</option>
								<option value="Partnership"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getArticleOfIncorporation().equals("Partnership"))?"selected":""%>>Partnership</option>
								<option value="Sole Proprietor"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getArticleOfIncorporation())&&genBusinessInfo.getArticleOfIncorporation().equals("Sole Proprietor")?"selected":""%>>Sole Proprietor</option>
								<option value="Other"<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getArticleOfIncorporation())&&genBusinessInfo.getArticleOfIncorporation().equals("Other")?"selected":""%>>Other (please specify)</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-md-12 hide" id="devFormArticleOtherBox">
					<div class="form-group">
						<p class="tab-form-main-heading">Please specify</p>
						<input type="text" class="form-control" id="devFormArticleOther" placeholder="Please specify Other form of the articles of incorporation"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getPleaseSpecify())?genBusinessInfo.getPleaseSpecify():""%>">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Is the company classified as a non-resident Jamaican Company</p>
						<div class="d-flex">
							<div class="wizard-form-radio d-block">
								<input value="Yes" type="radio" <%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getCompanyClassified())&&genBusinessInfo.getCompanyClassified().contains("Yes")?"checked":""%>
									name="devCompanyClassified"> <label for="">Yes</label>
							</div>
							<div class="wizard-form-radio d-block ml-3">
								<input value="No" type="radio" <%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getCompanyClassified())&&genBusinessInfo.getCompanyClassified().contains("No")?"checked":""%>
									name="devCompanyClassified"> <label for="">No</label>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>Taxpayer Registration Number (TRN)</p>
						<input type="text" class="form-control" id="devTRN" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getTaxRegisNum())?genBusinessInfo.getTaxRegisNum():""%>">
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>General Consumption Tax Number (GCT)</p>
						<input type="text" class="form-control" id="devGCT" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getGenConsumptionNum())?genBusinessInfo.getGenConsumptionNum():""%>">
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span>Tax Compliance Certificate Number (TCC)</p>
						<input type="text" class="form-control" id="devTCC" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(genBusinessInfo)&&Validator.isNotNull(genBusinessInfo.getTaxComplianceCertificateNum())?genBusinessInfo.getTaxComplianceCertificateNum():""%>">
					</div>
				</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="developerGeneralBusinessInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
</div>
<div class="tab-pane" role="tabpanel" id="childStep2">
	<div class="tab-form">
		<div class="shareholder-info-form">
			<div class="row">
				<div class="col-md-12"> 
				<p class="tab-form-title f2">Shareholding / Partnership / Director Information</p>
					<p class="tab-form-title-subtitle f2">12. Equity/Share Capital of the registered Jamaican entity to include Foreign Direct Investment</p> 
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">I.</span>Authorised</p>
						
						<input type="text" class="form-control  numeric-field" id="devEquityAuthorised"
							aria-describedby="devEquityAuthorised" placeholder="US$"
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(shareholdingInfo)&&Validator.isNotNull(shareholdingInfo.getAuthorised())?shareholdingInfo.getAuthorised():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="devEquityAuthorisedValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">II.</span>Subscribed</p>
						<input type="text" class="form-control  numeric-field" id="devEquitySubscribed"
							aria-describedby="devEquitySubscribed" placeholder="US$"
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(shareholdingInfo)&&Validator.isNotNull(shareholdingInfo.getSubscribed())?shareholdingInfo.getSubscribed():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="devEquitySubscribedValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">III.</span>Paid up Share Capital</p>
						<input type="text" class="form-control  numeric-field" id="devEquityPaidCapital"
							aria-describedby="devEquityPaidCapital" placeholder="US$"
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(shareholdingInfo)&&Validator.isNotNull(shareholdingInfo.getPaidUpShareCapital())?shareholdingInfo.getPaidUpShareCapital():""%>">
								<p class="tab-form-sub-heading fieldAlert hide" id="devEquityPaidCapitalValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
			</div>
			<div class="row">
				<input id="devShareholderDetailVal" type="hidden" name="devShareholderDetailVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="addShareholderDetailBox ">
						<div class="accordion__header is-active"  id="addShareholderDetail" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>13. Details of each of the Principal Shareholders</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading" for="shareholderName">Name</p>
										<input type="text" class="form-control" id="shareholderName"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Building No. and Street Address</p>
										<input type="text" class="form-control" id="shareholderStreetAddress" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Parish/Post /Zip Code</p>
										<input type="text" class="form-control" id="shareholderZipCode" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Country</p>
										<input type="text" class="form-control" id="shareholderCountry" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Nationality</p>
										<input type="text" class="form-control" id="shareholderNationality" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Tax Registration Number/Social Security Number/Tax Number in the country of domicile</p>
										<input type="text" class="form-control" id="shareholderTRN" placeholder=""
										oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" value="">
									</div>
								</div>
							</div>
						</div>
					</div>			
					<div class="accordion secured-accordian" id="addShareholderDetailBox"></div>
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4"> 
				<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreDetail" onclick="addShareholderDetailBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 table-responsive devShareholderDetailTableBox hide">
					<table class="table table-bordered mb-3">
						<tbody class="devShareholderDetailFormTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Building No. and Street Address</th>
								<th class="sub_heading">Parish/Post /Zip Code</th>
								<th class="sub_heading">Country</th>
								<th class="sub_heading">Nationality</th>
								<th class="sub_heading">TRN/SSN/Tax Number in the country of domicile</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
										<%if(Validator.isNotNull(sharePrincipalAdd)&&sharePrincipalAdd.size()>0){
										for(SezDevSharePrincipalAdd principalAdd:sharePrincipalAdd){
										%>	
											<tr>
								<td class="sub_heading_content shareholderName<%=devShareholderDetailVal%>">
								<%=Validator.isNotNull(principalAdd)&&Validator.isNotNull(principalAdd.getName())?principalAdd.getName():""%>
								</td>
								<td class="sub_heading_content shareholderStreetAddress<%=devShareholderDetailVal%>">
								<%=Validator.isNotNull(principalAdd)&&Validator.isNotNull(principalAdd.getBuildingNum())?principalAdd.getBuildingNum():""%>
								</td>
								<td class="sub_heading_content shareholderZipCode<%=devShareholderDetailVal%>">
								<%=Validator.isNotNull(principalAdd)&&Validator.isNotNull(principalAdd.getParishPost())?principalAdd.getParishPost():""%>
								</td>
								<td class="sub_heading_content shareholderCountry<%=devShareholderDetailVal%>">
								<%=Validator.isNotNull(principalAdd)&&Validator.isNotNull(principalAdd.getCountry())?principalAdd.getCountry():""%>
								</td>
								<td class="sub_heading_content shareholderNationality<%=devShareholderDetailVal%>">
								<%=Validator.isNotNull(principalAdd)&&Validator.isNotNull(principalAdd.getNationality())?principalAdd.getNationality():""%>
								</td>
								<td class="sub_heading_content shareholderTRN<%=devShareholderDetailVal%>">
								<%=Validator.isNotNull(principalAdd)&&Validator.isNotNull(principalAdd.getTaxRegistrationNum())?principalAdd.getTaxRegistrationNum():""%>
								</td>
								<td> 
									<span> 
										<a href="javascript:void(0)" id="devShareholderDetailEditTab" onclick="devShareholderDetailEditTab('<%=devShareholderDetailVal%>');"> 
									        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
									         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
									        </svg> 
									      </a> 
									  </span>
							     </td>
							     <td> 
									<span> 
										<a href="javascript:void(0)" id="devShareholderDeleteDataTab" onclick="devShareholderDeleteData('<%=devShareholderDetailVal%>');"> 
									        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
									        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
									        </svg>
									      </a> 
									  </span>  
                                 </td>
							</tr>
							<input type="hidden" id="devShareholderDetailId<%=devShareholderDetailVal%>"  name="devShareholderDetailId<%=devShareholderDetailVal%>" value="<%=principalAdd.getSezDevSharePrincipalAddId()%>">
							<%devShareholderDetailVal=devShareholderDetailVal+1;}}%>			
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<input id="devDirectorShareholderVal" type="hidden" name="devDirectorShareholderVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="addDirectorShareholdersBox">
						<div class="accordion__header is-active"  id="addDirectorShareholders" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>14. Principal Shareholders/Directors shareholding</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Shareholder Name</p>
										<input type="text" class="form-control" id="principalShareholderName"
											aria-describedby="principalShareholderName" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">No. of Shares</p>
										<input type="text" class="form-control" id="principalShareholderShares"
											aria-describedby="principalShareholderShares" placeholder=""
											oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
											value="">
									</div>
								</div>
							</div>
						</div>
					</div>			
					<div class="accordion secured-accordian" id="addDirectorShareholdersBox"></div>
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4"> 
				<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreDirectorShareholder" onclick="addDirectorShareholdersBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 table-responsive hide devDirectorShareholderTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="devDirectorShareholderTable">
							<tr>
								<th class="sub_heading">Shareholder Name</th>
								<th class="sub_heading">No. of Shares</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
						 
						  <%if(Validator.isNotNull(shareDirectorAdd)&&shareDirectorAdd.size()>0){
										for(SezDevShareDirectorAdd directorAdd:shareDirectorAdd){
										%>
								 <tr>
								<td class="sub_heading_content principalShareholderName<%=devDirectorShareholderVal%>">
								<%=Validator.isNotNull(directorAdd)&&Validator.isNotNull(directorAdd.getShareholderName())?directorAdd.getShareholderName():""%>
								</td>
								<td class="sub_heading_content principalShareholderShares<%=devDirectorShareholderVal%>">
								<%=Validator.isNotNull(directorAdd)&&Validator.isNotNull(directorAdd.getNumOfShare())?directorAdd.getNumOfShare():""%>
								</td>
								<td> 
									<span> 
										<a href="javascript:void(0)" id="devDirectorShareholderDetailEditTab" onclick="devDirectorShareholderDetailEditTab('<%=devDirectorShareholderVal%>');"> 
									        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
									         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
									        </svg> 
									      </a> 
									  </span>
							     </td>
							     <td> 
									<span> 
										<a href="javascript:void(0)" id="devDirectorShareholderDeleteDataTab" onclick="devDirectorShareholderDeleteData('<%=devDirectorShareholderVal%>');"> 
									        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
									        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
									        </svg>
									      </a> 
									  </span>  
                                </td>
							</tr>
							<input type="hidden" id="devDirectorShareholderId<%=devDirectorShareholderVal%>"  name="devDirectorShareholderId<%=devDirectorShareholderVal%>" value="<%=directorAdd.getSezDevShareDirectorAddId()%>">
							<%devDirectorShareholderVal=devDirectorShareholderVal+1;}}%>	
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<input id="devComDirectorVal" type="hidden" name="devComDirectorVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="addComDirectorBox">
						<div class="accordion__header is-active" id="addComDirector" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>15. List of company directorship/trustees/fiduciary positions held by directors with any firms/corporations/associates/partnerships/business entity in the last 10 years</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<p class="tab-form-main-heading">Name</p>
										<input type="text" class="form-control" id="comDirectorName"
											aria-describedby="comDirectorName" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<p class="tab-form-main-heading">Company</p>
										<input type="text" class="form-control" id="comDirectorCompanyName"
											aria-describedby="comDirectorCompanyName" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<p class="tab-form-main-heading">Relationship</p>
										<input type="text" class="form-control" id="comDirectorRelationship"
											aria-describedby="comDirectorRelationship" placeholder=""
											value="">
									</div>
								</div>
							</div>
						</div>
					</div>			
					<div class="accordion secured-accordian" id="addComDirectorBox"></div>
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4"> 
				<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreCompanyDirector" onclick="addComDirectorBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 table-responsive hide addComDirectorTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addComDirectorTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Company</th>
								<th class="sub_heading">Relationship</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
								<%if(Validator.isNotNull(directorShip)&&directorShip.size()>0){
								for(SezDevShareComDirectorShipAdd directorShipAdd:directorShip){
								%>	
								<tr>
								<td class="sub_heading_content comDirectorName<%=devComDirectorVal%>">
								<%=Validator.isNotNull(directorShip)&&Validator.isNotNull(directorShipAdd.getName())?directorShipAdd.getName():""%>
								</td>
								<td class="sub_heading_content comDirectorCompanyName<%=devComDirectorVal%>">
								<%=Validator.isNotNull(directorShip)&&Validator.isNotNull(directorShipAdd.getCompany())?directorShipAdd.getCompany():""%>
								</td>
								<td class="sub_heading_content comDirectorRelationship<%=devComDirectorVal%>">
								<%=Validator.isNotNull(directorShip)&&Validator.isNotNull(directorShipAdd.getReplationship())?directorShipAdd.getReplationship():""%>
								</td>
								<td> 
									<span> 
										<a href="javascript:void(0)" id="devComDirectorEditTab" onclick="devComDirectorEditTab('<%=devComDirectorVal%>');"> 
									        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
									         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
									        </svg> 
									      </a> 
									  </span>
							     </td>
							     <td> 
									<span> 
										<a href="javascript:void(0)" id="devComDirectorDeleteDataTab" onclick="devComDirectorDeleteData('<%=devComDirectorVal%>');"> 
									        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
									        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
									        </svg>
									      </a> 
									  </span>  
							    </td>
							</tr>
							<input type="hidden" id="devComDirectorId<%=devComDirectorVal%>"  name="devComDirectorId<%=devComDirectorVal%>" value="<%=directorShipAdd.getSezDevSharComDirectorShipAddId()%>">			
													<%devComDirectorVal=devComDirectorVal+1;}}%>	
						</tbody>
					</table>
				</div>
			</div>		
			<div class="row">
				<input id="devCorporationVal" type="hidden" name="devCorporationVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="addCorporationBox">
						<div class="accordion__header is-active" id="addCorporation" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>16. Corporation/business and companies in which directors have held/holds ownership interest</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<p class="tab-form-main-heading">Name</p>
										<input type="text" class="form-control" id="comCorporationPersonName"
											aria-describedby="comCorporationPersonName" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<p class="tab-form-main-heading">Company</p>
										<input type="text" class="form-control" id="comCorporationName"
											aria-describedby="comCorporationName" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<p class="tab-form-main-heading">Relationship</p>
										<input type="text" class="form-control" id="comCorporationRelationship"
											aria-describedby="comCorporationRelationship" placeholder=""
											value="">
									</div>
								</div>
							</div>
						</div>
					</div>			
					<div class="accordion secured-accordian" id="addCorporationBox"></div>
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4"> 
				<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreCorporation" onclick="addCorporationBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 table-responsive hide addCorporationTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addCorporationTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Company</th>
								<th class="sub_heading">Relationship</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							<%if(Validator.isNotNull(directorShip)&&directorShip.size()>0){
			for(SezDevShareCorporationBusAdd corporateBusAdd:corporationBus){
			%><tr>
	<td class="sub_heading_content comCorporationPersonName<%=devCorporationVal%>">
	<%=Validator.isNotNull(directorShip)&&Validator.isNotNull(corporateBusAdd.getName())?corporateBusAdd.getName():""%>
	</td>
	<td class="sub_heading_content comCorporationName<%=devCorporationVal%>">
	<%=Validator.isNotNull(directorShip)&&Validator.isNotNull(corporateBusAdd.getCompany())?corporateBusAdd.getCompany():""%>
	</td>
	<td class="sub_heading_content comCorporationRelationship<%=devCorporationVal%>">
	<%=Validator.isNotNull(directorShip)&&Validator.isNotNull(corporateBusAdd.getRelationship())?corporateBusAdd.getRelationship():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="devCorporationEditTab" onclick="devCorporationEditTab('<%=devCorporationVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg> 
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="devCorporationDeleteDataTab" onclick="devCorporationDeleteData('<%=devCorporationVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="devCorporationBusinessId<%=devCorporationVal%>"  name="devCorporationBusinessId<%=devCorporationVal%>" value="<%=corporateBusAdd.getSezDevCorporationBusinessAddId()%>">
<%devCorporationVal=devCorporationVal+1;}}%>
						</tbody>
					</table>
				</div>
			</div>			
			<div class="row">
				<div class="col-md-12"> 
					<div class="form-group"> 
					 <p class="tab-form-main-heading">17. Are any of the company directors/shareholders currently involved in any bankruptcy proceedings or are undischarged bankrupts?</p> 
						 <div class="d-flex"> 
							  <div class="wizard-form-radio d-block"> 
								<input value="Yes" type="radio"<%=Validator.isNotNull(shareholdingInfo)&&Validator.isNotNull(shareholdingInfo.getDirectorBankrupts())&&shareholdingInfo.getDirectorBankrupts().equals("Yes")?"checked":""%>
								 name="comDirectorBankruptInvolve"> 
								   <label for="">Yes</label> 
							  </div> 
							  <div class="wizard-form-radio d-block ml-3"> 
								   <input value="No" type="radio"<%=Validator.isNotNull(shareholdingInfo)&&Validator.isNotNull(shareholdingInfo.getDirectorBankrupts().equals("No"))&&shareholdingInfo.getDirectorBankrupts().equals("No")?"checked":""%> name="comDirectorBankruptInvolve"> 
								   <label for="">No</label> 
							  </div> 
						 </div> 
					</div> 
				</div>
				<input id="devDirectorBankruptInvolveVal" type="hidden" name="devDirectorBankruptInvolveVal" value="1">
				<div class="col-md-12 comDirectorBankruptInvolveBox hide">
					<div class="accordion secured-accordian" id="addDirectorBankruptInvolveBox">
						<div class="accordion__header is-active" id="addDirectorBankruptInvolve" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>Please state name of director(s)/shareholder(s)</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Name</p>
										<input type="text" class="form-control" id="comDirectorBankruptName"
											aria-describedby="comDirectorBankruptName" placeholder=""
											value="">
									</div>
								</div>
							</div>
						</div>
					</div>			
					<div class="accordion secured-accordian" id="addDirectorBankruptInvolveBox"></div>
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4 comDirectorBankruptInvolveBox hide"> 
				<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreDirectorBankruptInvolve" onclick="addDirectorBankruptInvolveBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 directorBankruptInvolveTableBox hide table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="directorBankruptInvolveTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							<%if(Validator.isNotNull(sharePleaseState)&&sharePleaseState.size()>0){
	for(SezDevSharePleaseStateAdd sharePleaseAdd:sharePleaseState){
       %>	
							<tr>
	<td class="sub_heading_content comDirectorBankruptName<%=devDirectorBankruptInvolveVal%>">
	<%=Validator.isNotNull(sharePleaseAdd)&&Validator.isNotNull(sharePleaseAdd.getName())?sharePleaseAdd.getName():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="devDirectorBankruptEditTab" onclick="devDirectorBankruptEditTab('<%=devDirectorBankruptInvolveVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg> 
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="devDirectorBankruptDeleteDataTab" onclick="devDirectorBankruptDeleteData('<%=devDirectorBankruptInvolveVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="devDirectorBankruptInvolveId<%=devDirectorBankruptInvolveVal%>"  name="devDirectorBankruptInvolveId<%=devDirectorBankruptInvolveVal%>" value="<%=sharePleaseAdd.getSezDevPleaseStateAddId()%>">
<%devDirectorBankruptInvolveVal=devDirectorBankruptInvolveVal+1;}}%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="developerShareholdingInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep3">
	<div class="tab-form">
		<div class="project-brieg-info-form">
			<div class="row">
				<div class="col-md-12">
				    <p class="tab-form-title f2">Existing and Proposed Project Breif</p> 
					<p class="tab-form-title-subtitle f2"></p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">18.</span>Have you previously been granted Free Zone or SEZ status?</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getPreviouslyFreeZone())&&proposedProject.getPreviouslyFreeZone().equals("Yes")?"checked":""%> name="sezFreePreviousZone"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getPreviouslyFreeZone())&&proposedProject.getPreviouslyFreeZone().equals("No")?"checked":""%> name="sezFreePreviousZone"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<div class="col-md-12 hide" id="sezFreePreviousZoneBox">
					<div class="form-group">
						<p class="tab-form-main-heading">Are you currently operating a zone</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getCurentlyOperatingZone())&&proposedProject.getCurentlyOperatingZone().equals("Yes")?"checked":""%> name="sezFreeCurrentZone"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getCurentlyOperatingZone())&&proposedProject.getCurentlyOperatingZone().equals("No")?"checked":""%> name="sezFreeCurrentZone"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<input id="devOperatingZoneLocationVal" type="hidden" name="devOperatingZoneLocationVal" value="1">
				<div class="col-md-12 sezFreeCurrentZoneBox hide">
					<div class="accordion secured-accordian" id="addOperatingZoneLocationBox">
						<div class="accordion__header is-active"  id="addOperatingZoneLocation" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>19. Please state location/s</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Name of Zone</p>
										<input type="text" class="form-control" id="sezFreeCurrentZoneName"
											aria-describedby="sezFreeCurrentZoneName" placeholder=""
											value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Parish</p>
										<input type="text" class="form-control" id="sezFreeCurrentZoneParish"
											aria-describedby="sezFreeCurrentZoneParish" placeholder=""
											value="">
									</div>
								</div>
							</div>
						</div>
					</div>			
					<div class="accordion secured-accordian" id="addOperatingZoneLocationBox"></div>
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4 sezFreeCurrentZoneBox hide"> 
					<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreSOperatingZoneLocationInfo" onclick="addOperatingZoneLocationBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 table-responsive hide operatingZoneLocationTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="operatingZoneLocationTable">
								<tr>
									<th class="sub_heading">Name of Zone</th>
									<th class="sub_heading">Parish</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
								</tr>
								<%if(Validator.isNotNull(devProposedProjectAdd)&&devProposedProjectAdd.size()>0){
	for(SezDevProposedProjectAdd proposedAdd:devProposedProjectAdd){
%>	<tr>
	<td class="sub_heading_content sezFreeCurrentZoneName<%=devOperatingZoneLocationVal%>">
	<%=Validator.isNotNull(proposedAdd)&&Validator.isNotNull(proposedAdd.getNameOfZone())?proposedAdd.getNameOfZone():""%>
	</td>
	<td class="sub_heading_content sezFreeCurrentZoneParish<%=devOperatingZoneLocationVal%>">
	<%=Validator.isNotNull(proposedAdd)&&Validator.isNotNull(proposedAdd.getParish())?proposedAdd.getParish():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="devOperatingZoneLocationEditTab" onclick="devOperatingZoneLocationEditTab('<%=devOperatingZoneLocationVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg> 
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="devOperatingZoneLocationDeleteDataTab" onclick="devOperatingZoneLocationDeleteData('<%=devOperatingZoneLocationVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="devOperatingZoneLocationId<%=devOperatingZoneLocationVal%>"  name="devOperatingZoneLocationId<%=devOperatingZoneLocationVal%>" value="<%=proposedAdd.getSezDevProposedProjectAddId()%>">
							<%devOperatingZoneLocationVal=devOperatingZoneLocationVal+1;
							}
						}%>	
							</tbody>
						</table>
					</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">20.</span>Provide a description of the nature of the business being conducted in the Zone</p>
                 <textarea rows="3" id="businessZoneNature"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px;  width: 100%"><%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getBusinessConductedZone())?proposedProject.getBusinessConductedZone():""%></textarea>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2"><span class="tab-form-highlghtme-link pr-2">21.</span>What percentage of output is distributed</p>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Locally</p>
						<input type="text" class="form-control" id="distributedOutputPerLocal"
							aria-describedby="distributedOutputPerLocal" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getLocally())?proposedProject.getLocally():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Overseas</p>
						<input type="text" class="form-control" id="distributedOutputPerOverseas"
							aria-describedby="distributedOutputPerOverseas" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getOverseas())?proposedProject.getOverseas():""%>">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Proposed name of the SEZ</p>
						<input type="text" class="form-control" id="sezProposedName"
							aria-describedby="sezProposedName" placeholder=""
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getProposedName())?proposedProject.getProposedName():""%>">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">22.</span>What type of Special Economic Zone is the application for</p>
						<div class="select-wrapper position-relative">
							<select class="form-select form-control" id="applicationEconomicZone">
								<option value="" selected="" disabled="">Please select</option>
								<option value="Multi-Purpose Zone"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getSpecialEconomicZone())&&(proposedProject.getSpecialEconomicZone().equals("Multi-Purpose Zone"))?"selected":""%>>Multi-Purpose Zone</option>
								<option value="Single-Entity Zone"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getSpecialEconomicZone())&&(proposedProject.getSpecialEconomicZone().equals("Single-Entity Zone"))?"selected":""%>>Single-Entity Zone</option>
								<option value="Multi-Purpose Integrated Zone (Includes residential areas)"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getSpecialEconomicZone())&&(proposedProject.getSpecialEconomicZone().equals("Multi-Purpose Integrated Zone (Includes residential areas)"))?"selected":""%>>Multi-Purpose Integrated Zone (Includes residential areas)</option>
								<option value="Specialised Zone"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getSpecialEconomicZone())&&(proposedProject.getSpecialEconomicZone().equals("Specialised Zone"))?"selected":""%>>Specialised Zone</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-md-12 hide" id="applicationEconomicSpecialisedZoneBox">
					<div class="form-group">
						<p class="tab-form-main-heading">Please describe</p>
						<input type="text" class="form-control" id="applicationSpecialisedZoneDesc"
							aria-describedby="applicationSpecialisedZoneDesc" placeholder="Please describe Specialised Zone"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getPleaseDescribe())?proposedProject.getPleaseDescribe():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">23. Distance from the nearest</p> 
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Sea Port</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Km</p>
						<input type="text" class="form-control  numeric-field" id="seaPortDistanceKM"
							aria-describedby="seaPortDistanceKM" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getSeaPortKm())?proposedProject.getSeaPortKm():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="seaPortDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Mi</p>
						<input type="text" class="form-control  numeric-field" id="seaPortDistanceMI"
							aria-describedby="seaPortDistanceMI" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getSeaPortMi())?proposedProject.getSeaPortMi():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="seaPortDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Airport</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Km</p>
						<input type="text" class="form-control  numeric-field" id="airportDistanceKM"
							aria-describedby="airportDistanceKM" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getAirportKm())?proposedProject.getAirportKm():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="airportDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Mi</p>
						<input type="text" class="form-control  numeric-field" id="airportDistanceMI"
							aria-describedby="airportDistanceMI" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getAirportMi())?proposedProject.getAirportMi():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="airportDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Road</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Km</p>
						<input type="text" class="form-control  numeric-field" id="roadDistanceKM"
							aria-describedby="roadDistanceKM" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getRoadKm())?proposedProject.getRoadKm():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="roadDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Mi</p>
						<input type="text" class="form-control  numeric-field" id="roadDistanceMI"
							aria-describedby="roadDistanceMI" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getRoadMi())?proposedProject.getRoadMi():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="roadDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Rail</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Km</p>
						<input type="text" class="form-control  numeric-field" id="railDistanceKM"
							aria-describedby="railDistanceKM" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getRailKm())?proposedProject.getRailKm():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="railDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Mi</p>
						<input type="text" class="form-control numeric-field" id="railDistanceMI"
							aria-describedby="railDistanceMI" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getRailMi())?proposedProject.getRailMi():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="railDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Customs Processing Area</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Km</p>
						<input type="text" class="form-control  numeric-field" id="customDistanceKM"
							aria-describedby="customDistanceKM" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getCustomProcessingKm())?proposedProject.getCustomProcessingKm():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="customDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Mi</p>
						<input type="text" class="form-control  numeric-field" id="customDistanceMI"
							aria-describedby="customDistanceMI" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getCustomProcessingMi())?proposedProject.getCustomProcessingMi():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="customDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">24.</span>Indicate the land measurement of the proposed SEZ (in hectares)</p>
						<input type="text" class="form-control  numeric-field" id="proposedLandMeasurement"
							aria-describedby="proposedLandMeasurement" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getIndicateTheLandMeasurement())?proposedProject.getIndicateTheLandMeasurement():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="proposedLandMeasurementValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">25. What is the square footage (footprint) of the proposed SEZ space (buildings and land area?</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Buildings</p>
						<input type="text" class="form-control  numeric-field" id="buildingSquareFootage"
							aria-describedby="buildingSquareFootage" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getBuilding())?proposedProject.getBuilding():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="buildingSquareFootageValidation" style="color: red;">Only Numeric characters are allowed</p>
						<p class="tab-form-sub-heading">(square feet)</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Land area</p>
						<input type="text" class="form-control  numeric-field" id="landSquareFootage"
							aria-describedby="landSquareFootage" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getLandArea())?proposedProject.getLandArea():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="landSquareFootageValidation" style="color: red;">Only Numeric characters are allowed</p>
						<p class="tab-form-sub-heading">(square feet)</p>
					</div>
				</div>
				<!-- Add 26 ques here -->
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">26.</span>Ownership/Right of land use</p>
						<div class="select-wrapper position-relative">
							<select class="form-select form-control" id="landOwnership">
								<option value="" selected="" disabled="">Please select</option>
								<option value="Full Ownership"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getOwnerShip().equals("Full Ownership"))?"selected":""%>>Full Ownership</option>
								<option value="Ownership"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getOwnerShip().equals("Full"))?"selected":""%>>Ownership</option>
								<option value="Lease Contract"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getOwnerShip().equals("Lease Contract"))?"selected":""%>>Lease Contract</option>
								<option value="Joint Tenancy"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getOwnerShip().equals("Joint Tenancy"))?"selected":""%>>Joint Tenancy</option>
								<option value="Joint Venture"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getOwnerShip().equals("Joint Venture"))?"selected":""%>>Joint Venture</option>
								<option value="Other"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getOwnerShip().equals("Other"))?"selected":""%>>Other</option>
							</select>
						</div>
					</div>
				</div>
				 <div class="col-md-6 hide" id="otherLandOwnership">
					<div class="form-group">
						<p class="tab-form-main-heading">Please Specify</p>
						<input type="text" class="form-control" id="otherSpecifyLandOwnership" placeholder="" 
						value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getOtherPleaseSpecify())?proposedProject.getOtherPleaseSpecify():""%>">
					</div>
				</div>
			</div>
			<div class="row hide" id="landOwnershipBox">
				<div class="col-md-12 "> 
					 <div class="form-group">
	                   	<p class="tab-form-title-subtitle f2">II.Please state the name and address of land owner</p> 
	                 </div>
                 </div>
                 <div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Name</p>
						<input type="text" class="form-control" id="landOwnerName" placeholder="" 
						value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getLandOwnerName())?proposedProject.getLandOwnerName():""%>">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Address 1</p>
						<textarea rows="3" id="landOwnerAddrOne"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%">
						<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getLnadOwnerAddressOne())?proposedProject.getLnadOwnerAddressOne():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Address 2</p>
						<textarea rows="3" id="landOwnerAddrTwo"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getLnadOwnerAddressTwo())?proposedProject.getLnadOwnerAddressTwo():""%></textarea>
					</div>
				</div>
				 <div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">III.</span>What is the tenure of the lease agreement</p>
						<input type="text" class="form-control" id="leaseAgreeTenure" placeholder="" 
						value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getLnadOwnerTenure())?proposedProject.getLnadOwnerTenure():""%>">
						<p class="tab-form-sub-heading">Years</p>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">IV.</span>Is the applicant taking steps to acquire the lands?</p>
						<div class="d-flex">
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getStepToAcquireLand())&&proposedProject.getStepToAcquireLand().equals("Yes")?"checked":""%> name="stepToAcquireLand"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getStepToAcquireLand())&&proposedProject.getStepToAcquireLand().equals("No")?"checked":""%> name="stepToAcquireLand"> 
								 <label for="">No</label> 
							</div>
						</div> 
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">27.</span>State whether the proposed area is contiguous to or separated by any thoroughfare</p>
						<input type="text" class="form-control" id="proposedAreaDesc"
							aria-describedby="proposedAreaDesc" placeholder=""
							value="<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getStateWheatherTheProposedArea())?proposedProject.getStateWheatherTheProposedArea():"" %>">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">28.</span>Has the applicant previously been denied permission for development of a Free Zone or Special Economic Zone.</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getApplicantPreviously())&&proposedProject.getApplicantPreviously().equals("Yes")?"checked":""%> name="freeZonePrmissionDenied"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getApplicantPreviously())&&proposedProject.getApplicantPreviously().equals("No")?"checked":""%> name="freeZonePrmissionDenied"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<div class="col-md-12 hide" id="freeZonePrmissionDeniedBox">
					<div class="form-group">
						<p class="tab-form-main-heading">Please provide brief details of project</p>
						<textarea rows="3" id="deniedPermissionDetail"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(proposedProject)&&Validator.isNotNull(proposedProject.getPleaseProvideBrief())?proposedProject.getPleaseProvideBrief():"" %></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="developerProposedPorjectInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep4">
	<div class="tab-form">
		<div class="proposed-dev-info-form">
			<div class="row">
				<div class="col-md-12">
				    <p class="tab-form-title f2">Proposed Development Plan</p> 
					<p class="tab-form-title-subtitle f2"></p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">29. Project Development Plan / Site Plan</p> 
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">I.</span>If the application is for a Single Entity SEZ, will the Developer/Occupant 
						be using an existing building/s for its business</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getExistingBuilding())&&proDevelopmentPlan.getExistingBuilding().equals("Yes")?"checked":""%> name="existingBuildingForBusi"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getExistingBuilding())&&proDevelopmentPlan.getExistingBuilding().equals("No")?"checked":""%> name="existingBuildingForBusi"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<div class="col-md-12 hide" id="existingBuildingForBusiBox">
					<div class="form-group">
						<p class="tab-form-main-heading">Please provide Surveyors Identification Report detailing the existing building/s and parcel of land to include details of a specific floor, if such designation is required.</p>
						<textarea rows="3" id="existingBuildingForBusiDetailing"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getExistingBuildingForBusiDetail())?proDevelopmentPlan.getExistingBuildingForBusiDetail():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">II.</span>If applicant is proposing an Single Entity Development, please provide brief description of activities to be undertaken</p>
						<textarea rows="3" id="activitiesForSingleEntity"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getActivitiesForSingleEntity())?proDevelopmentPlan.getActivitiesForSingleEntity():""%></textarea>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">30. Green or Brownfield SEZ Development</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">I.</span>Volume</p>
						<input type="text" class="form-control" id="sezDevelopmentVolume"
							aria-describedby="sezDevelopmentVolume" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getVolume())?proDevelopmentPlan.getVolume():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Folio</p>
						<input type="text" class="form-control" id="sezDevelopmentFolio"
							aria-describedby="sezDevelopmentFolio" placeholder=""
							oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getFolio())?proDevelopmentPlan.getFolio():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">II.</span>Building No. and Street Address</p>
						<input type="text" class="form-control" id="sezDevelopmentStreetAddress" placeholder=""
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getBuildingNum())?proDevelopmentPlan.getBuildingNum():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Town/City</p>
						<input type="text" class="form-control" id="sezDevelopmentTown" placeholder=""
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTownCity())?proDevelopmentPlan.getTownCity():""%>">
					</div>
				</div>
			<%-- 	<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Parish/Post /Zip Code</p>
						<input type="text" class="form-control" id="sezDevelopmentZipCode" placeholder=""
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getZipCode())?proDevelopmentPlan.getZipCode():""%>">
					</div>
				</div> --%>
				<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="sezDevelopmentZipCode">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=proDevelopmentPlan!=null?proDevelopmentPlan.getZipCode().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">III.</span>Zoning Classification</p>
						<div class="select-wrapper position-relative">
							<select class="form-select form-control" id="zoningClassification">
								<option value="" selected="" disabled="">Please select</option>
								<option value="Industrial"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getZoningClassification().equals("Industrial"))?"selected":""%>>Industrial</option>
								<option value="Agricultural"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getZoningClassification().equals("Agricultural"))?"selected":""%>>Agricultural</option>
								<option value="Residential"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getZoningClassification().equals("Residential"))?"selected":""%>>Residential</option>
								<option value="Commercial"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getZoningClassification().equals("Commercial"))?"selected":""%>>Commercial</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">IV.</span>Existing Land Use</p>
						<input type="text" class="form-control" id="sezDevelopmentLandUse" placeholder=""
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getLandUse())?proDevelopmentPlan.getLandUse():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">V. Total hectares (acres) for the proposed SEZ Area development</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Hectares</p>
						<input type="text" class="form-control  numeric-field" id="sezAreaDevelopmentHectareArea" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getSezAreaHectares())?proDevelopmentPlan.getSezAreaHectares():""%>">
						<p class="tab-form-sub-heading fieldAlert hide" id="sezAreaDevelopmentHectareAreaValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Acres</p>
						<input type="text" class="form-control  numeric-field" id="sezAreaDevelopmentAcresArea" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getSezAreaAcres())?proDevelopmentPlan.getSezAreaAcres():""%>">
						<p class="tab-form-sub-heading fieldAlert hide" id="sezAreaDevelopmentAcresAreaValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">VI. Total hectares/acres for the proposed SEZ Customs Controlled Area</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Hectares</p>
						<input type="text" class="form-control  numeric-field" id="sezCustomsDevelopmentHectareArea" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getCustomsHectares())?proDevelopmentPlan.getCustomsHectares():""%>">
						<p class="tab-form-sub-heading fieldAlert hide" id="sezCustomsDevelopmentHectareAreaValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Acres</p>
						<input type="text" class="form-control  numeric-field" id="sezCustomsDevelopmentAcresArea" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getCustomsAcres())?proDevelopmentPlan.getCustomsAcres():""%>">
						<p class="tab-form-sub-heading fieldAlert hide" id="sezCustomsDevelopmentAcresAreaValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">VII.</span>Topography</p>
						<div class="select-wrapper position-relative">
							<select class="form-select form-control" id="topography">
								<option value="" selected="" disabled="">Please select</option>
								<option value="Flat"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTopography().equals("Flat"))?"selected":""%>>Flat</option>
								<option value="Hilly"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTopography().equals("Hilly"))?"selected":""%>>Hilly</option>
								<option value="Slightly sloping"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTopography().equals("Slightly sloping"))?"selected":""%>>Slightly sloping</option>
								<option value="Very Steep"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTopography().equals("Very Steep"))?"selected":""%>>Very Steep</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">VIII. Boundaries</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">North</p>
						<input type="text" class="form-control" id="northBoundaries" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getNorthBoundaries())?proDevelopmentPlan.getNorthBoundaries():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">East</p>
						<input type="text" class="form-control" id="eastBoundaries" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getEastBoundaries())?proDevelopmentPlan.getEastBoundaries():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">West</p>
						<input type="text" class="form-control" id="westBoundaries" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getWestBoundaries())?proDevelopmentPlan.getWestBoundaries():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">South</p>
						<input type="text" class="form-control" id="southBoundaries" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getSouthBoundaries())?proDevelopmentPlan.getSouthBoundaries():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">31. Infrastructure, Facilities and Utilities</p> 
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">I. Proposed/Existing Facilities</p> 
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Customs Controlled Area</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Land Measurement</p>
						<input type="text" class="form-control" id="customLandMeasurement" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getCustomLandMeasurement())?proDevelopmentPlan.getCustomLandMeasurement():""%>">
						<p class="tab-form-sub-heading">hectares</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Percent</p>
						<input type="text" class="form-control" id="customPercent" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getCustomPercent())?proDevelopmentPlan.getCustomPercent():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Common Area/F&B</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Land Measurement</p>
						<input type="text" class="form-control" id="commonLandMeasurement" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getCommonLandMeasurement())?proDevelopmentPlan.getCommonLandMeasurement():""%>">
						<p class="tab-form-sub-heading">hectares</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Percent</p>
						<input type="text" class="form-control" id="commonPercent" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getCommonPercent())?proDevelopmentPlan.getCommonPercent():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Buffer/Green Zone</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Land Measurement</p>
						<input type="text" class="form-control" id="bufferLandMeasurement" placeholder=""
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getBufferLandMeasurement())?proDevelopmentPlan.getBufferLandMeasurement():""%>">
						<p class="tab-form-sub-heading">hectares</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Percent</p>
						<input type="text" class="form-control" id="bufferPercent" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getBufferPercent())?proDevelopmentPlan.getBufferPercent():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Zone User Area</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Land Measurement</p>
						<input type="text" class="form-control" id="zoneLandMeasurement" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getZoneLandMeasurement())?proDevelopmentPlan.getZoneLandMeasurement():""%>">
						<p class="tab-form-sub-heading">hectares</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Percent</p>
						<input type="text" class="form-control" id="zonePercent" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getZonePercent())?proDevelopmentPlan.getZonePercent():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Residential (if any)</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Land Measurement</p>
						<input type="text" class="form-control" id="residentialLandMeasurement" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getResidentialLandMeasurement())?proDevelopmentPlan.getResidentialLandMeasurement():""%>">
						<p class="tab-form-sub-heading">hectares</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Percent</p>
						<input type="text" class="form-control" id="residentialPercent" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getResidentialPercent())?proDevelopmentPlan.getResidentialPercent():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Total</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Land Measurement</p>
						<input type="text" class="form-control" id="totalLandMeasurement" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTotalLandMeasurement())?proDevelopmentPlan.getTotalLandMeasurement():""%>">
						<p class="tab-form-sub-heading">hectares</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Percent</p>
						<input type="text" class="form-control" id="totalPercent" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTotalPercent())?proDevelopmentPlan.getTotalPercent():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">II. Estimated requirement for Water (in Kilo Liters)</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">For industrial (process) purposes</p>
						<input type="text" class="form-control" id="industrialWaterReq" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getIndustrialProcess())?proDevelopmentPlan.getIndustrialProcess():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">For drinking purposes</p>
						<input type="text" class="form-control" id="drinkingWaterReq" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getDrinkingPurpose())?proDevelopmentPlan.getDrinkingPurpose():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Others, specify</p>
						<input type="text" class="form-control" id="otherWaterReq" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getOtherSpecify())?proDevelopmentPlan.getOtherSpecify():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Total requirement</p>
						<input type="text" class="form-control" id="totalWaterReq" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTotalRequirement())?proDevelopmentPlan.getTotalRequirement():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">III. Sewage/Waste water Treatment</p> 
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Quantum and nature of effluents and mode of disposal</p>
						<textarea rows="3" id="disposalMode"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getQuantumAndNature())?proDevelopmentPlan.getQuantumAndNature():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Specify whether own Sewage/waste water Treatment Plant will be created</p>
						<textarea rows="3" id="wasteWaterTreatment"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getSpecifyWhetherOwn())?proDevelopmentPlan.getSpecifyWhetherOwn():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">IV.</span>Requirement of Power (in kilovolt-ampere kVA)</p>
						<input type="text" class="form-control" id="powerReqirement" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getReqOfPower())?proDevelopmentPlan.getReqOfPower():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">V. Internal Road Network</p> 
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Main Road</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">ROW Width (M)</p>
						<input type="text" class="form-control" id="mainRoadWidth" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getMainRoadRowWidth())?proDevelopmentPlan.getMainRoadRowWidth():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Type of Pavement</p>
						<input type="text" class="form-control" id="mainRoadPavement" placeholder=""
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getMainRoadTypeOfPavement())?proDevelopmentPlan.getMainRoadTypeOfPavement():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Secondary Road</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">ROW Width (M)</p>
						<input type="text" class="form-control" id="secondaryRoadWidth" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getSecondRowWidhth())?proDevelopmentPlan.getSecondRowWidhth():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Type of Pavement</p>
						<input type="text" class="form-control" id="secondaryRoadPavement" placeholder=""
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getSecondTypeOfPavement())?proDevelopmentPlan.getSecondTypeOfPavement():""%>">
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Tertiary Road</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">ROW Width (M)</p>
						<input type="text" class="form-control" id="tertiaryRoadWidth" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTertiaryRowWidhth())?proDevelopmentPlan.getTertiaryRowWidhth():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Type of Pavement</p>
						<input type="text" class="form-control" id="tertiaryRoadPavement" placeholder=""
							value="<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTertiaryTypeOfPavement())?proDevelopmentPlan.getTertiaryTypeOfPavement():""%>">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">VI.</span>Will the applicant require installation of water supply, sewage systems & waste water system?</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getWaterInstallationReq())&&proDevelopmentPlan.getWaterInstallationReq().equals("Yes")?"checked":""%> name="waterInstallationReq"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getWaterInstallationReq())&&proDevelopmentPlan.getWaterInstallationReq().equals("No")?"checked":""%> name="waterInstallationReq"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">VII.</span>Will the applicant require installation of power distribution system?</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getPowerInstallationReq())&&proDevelopmentPlan.getPowerInstallationReq().equals("Yes")?"checked":""%> name="powerInstallationReq"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getPowerInstallationReq())&&proDevelopmentPlan.getPowerInstallationReq().equals("No")?"checked":""%> name="powerInstallationReq"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">VIII.</span>Will the applicant require installation of telecommunication infrastructure?</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTeleComInstallationReq())&&proDevelopmentPlan.getTeleComInstallationReq().equals("Yes")?"checked":""%> name="teleComInstallationReq"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getTeleComInstallationReq())&&proDevelopmentPlan.getTeleComInstallationReq().equals("No")?"checked":""%> name="teleComInstallationReq"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">IX.</span>Will the application be installing Closed Circuit Television (CCTV) System</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getCctvInstallationReq())&&proDevelopmentPlan.getCctvInstallationReq().equals("Yes")?"checked":""%> name="cctvInstallationReq"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getCctvInstallationReq())&&proDevelopmentPlan.getCctvInstallationReq().equals("No")?"checked":""%> name="cctvInstallationReq"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">X.</span>Will the applicant CCTV system allow for interconnection with GoJ approved security and/or
regulatory agencies? (JSEZA, Jamaica Customs Agency, JCF)</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getSecurityInterconnection())&&proDevelopmentPlan.getSecurityInterconnection().equals("Yes")?"checked":""%> name="securityInterconnection"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getSecurityInterconnection())&&proDevelopmentPlan.getSecurityInterconnection().equals("No")?"checked":""%> name="securityInterconnection"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">XI.</span>Will the applicant install a Fire Fighting System and Equipment</p>
						<div class="d-flex"> 
							<div class="wizard-form-radio d-block"> 
							  <input value="Yes" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getFireFightingInstallationReq())&&proDevelopmentPlan.getFireFightingInstallationReq().equals("Yes")?"checked":""%> name="fireFightingInstallationReq"> 
								 <label for="">Yes</label> 
							</div> 
							<div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio"<%=Validator.isNotNull(proDevelopmentPlan)&&Validator.isNotNull(proDevelopmentPlan.getFireFightingInstallationReq())&&proDevelopmentPlan.getFireFightingInstallationReq().equals("No")?"checked":""%> name="fireFightingInstallationReq"> 
								 <label for="">No</label> 
							</div> 
					   </div> 
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="developerProposedDevelopmentInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep5">
	<div class="tab-form">
		<div class="safety-info-form">
			<div class="row">
				<div class="col-md-12">
				    <p class="tab-form-title f2">Employee Safety and Security</p> 
					<p class="tab-form-title-subtitle f2"></p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">32.</span>What are the security measures that the firm currently uses (to include physical security plan, access
						controls for employees and visitors, ID system for staff, Payment Card Data Security Standard
						(PCIDSS) compliance, where applicable, employee screening process).</p>
				</div>
				<input id="devSecurityMeasuresVal" type="hidden" name="devSecurityMeasuresVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="addSecurityMeasuresBox">
						<div class="accordion__header is-active"  id="addSecurityMeasures" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>Please include a detailed security plan with your application.</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<textarea rows="3" id="securityMeasures"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>			
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4"> 
					<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreSecurityMeasuresInfo" onclick="addSecurityMeasuresBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 table-responsive hide securityMeasuresTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="securityMeasuresTable">
							<tr>
								<th class="sub_heading">Detailed security plan with your application</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							<%if(Validator.isNotNull(employeeSafety)&&Validator.isNotNull(employeeSafety.size()>0)){
								for(SezDevEmployeeSafetyInfoAdd employeeSafetyValues:employeeSafety){
							 %>
							<tr>
								<td class="sub_heading_content securityMeasures<%=securityMeasuresTableVal%>">
								<%=Validator.isNotNull(employeeSafetyValues)&&Validator.isNotNull(employeeSafetyValues.getSecurityMeasures())?employeeSafetyValues.getSecurityMeasures():"" %>
								</td>
								<td> 
									<span> 
										<a href="javascript:void(0)" id="devSecurityMeasuresEditTab" onclick="devSecurityMeasuresEditTab('<%=securityMeasuresTableVal%>');"> 
									        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
									         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
									        </svg> 
									      </a> 
									  </span>
							     </td>
							     <td> 
									<span> 
										<a href="javascript:void(0)" id="devSecurityMeasuresDeleteDataTab" onclick="devSecurityMeasuresDeleteData('<%=securityMeasuresTableVal%>');"> 
									        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
									        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
									        </svg>
									      </a> 
									  </span>  
							     </td>
							</tr>
							<input type="hidden" id="devSecurityMeasuresId<%=securityMeasuresTableVal%>"  name="devSecurityMeasuresId<%=securityMeasuresTableVal%>" value="">
							<%securityMeasuresTableVal = securityMeasuresTableVal+1;
							}} %>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<input id="devOccuSafetySystemVal" type="hidden" name="devOccuSafetySystemVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="addOccuSafetySystemBox">
						<div class="accordion__header is-active" id="addOccuSafetySystem" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>33. Define your occupational safety and health management systems, policy and procedures:</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<textarea rows="3" id="occuSafetySystem"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>			
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4"> 
					<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreOccuSafetySystemInfo" onclick="addOccuSafetySystemBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 table-responsive hide occuSafetySystemTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="occuSafetySystemTable">
							<tr>
								<th class="sub_heading">Occupational safety and health management systems, policy and procedures</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
								<%if(Validator.isNotNull(employeeDefineOcuu)&&employeeDefineOcuu.size()>0){
									for(SezDevEmployeeDefineOccuAdd employeeDefineOcuuValues:employeeDefineOcuu){%>
								
								<tr>
									<td class="sub_heading_content occuSafetySystem<%=devOccuSafetySystemVal%>">
									<%=Validator.isNotNull(employeeDefineOcuuValues)&&Validator.isNotNull(employeeDefineOcuuValues.getOccuSafetySystem())?employeeDefineOcuuValues.getOccuSafetySystem():"" %>
									</td>
									<td> 
										<span> 
											<a href="javascript:void(0)" id="devOccuSafetySystemEditTab" onclick="devOccuSafetySystemEditTab('<%=devOccuSafetySystemVal%>');"> 
										        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
										         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
										        </svg> 
										      </a> 
										  </span>
								     </td>
								     <td> 
										<span> 
											<a href="javascript:void(0)" id="devOccuSafetySystemDeleteDataTab" onclick="devOccuSafetySystemDeleteData('<%=devOccuSafetySystemVal%>');"> 
										        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
										        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
										        </svg>
										      </a> 
										  </span>  
								     </td>
								</tr>
								<input type="hidden" id="devOccuSafetySystemId<%=devOccuSafetySystemVal%>"  name="devOccuSafetySystemId<%=devOccuSafetySystemVal%>" value="<%=employeeDefineOcuuValues.getSezDevEmployeeDefineOccuAddId()%>">
								<%devOccuSafetySystemVal = devOccuSafetySystemVal+1; }}%>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="developerEmployeeSafety(false); nextButtonCall();"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep6">
	<div class="tab-form">
		<div class="employment-info-form">
			<div class="row">
				<div class="col-md-12">
				    <p class="tab-form-title f2">Employment Information</p> 
					<p class="tab-form-title-subtitle f2">Indicate direct and indirect employment likely to be generated during the first three (3) years of the project</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">First Year</p> 
				</div>
				<div class="col-md-6">
				
					<div class="form-group">
						<p class="tab-form-main-heading">Direct</p>
						<input type="text" class="form-control  numeric-field" id="directFirstYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getFirstYearDirect())?emploment.getFirstYearDirect():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="directFirstYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Indirect</p>
						<input type="text" class="form-control numeric-field" id="indirectFirstYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getFirstYearInDirect())?emploment.getFirstYearInDirect():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="indirectFirstYrEmValidation" style="color: red;">Only Numeric characters are allowed numeric-field</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Male (direct)</p>
						<input type="text" class="form-control  numeric-field" id="maleDirectFirstYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getFirstYearMale())?emploment.getFirstYearMale():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="maleDirectFirstYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Female (direct)</p>
						<input type="text" class="form-control numeric-field" id="femaleDirectFirstYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getFirstYearFemale())?emploment.getFirstYearFemale():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="femaleDirectFirstYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Local</p>
						<input type="text" class="form-control  numeric-field" id="localFirstYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getFirstYearLocal())?emploment.getFirstYearLocal():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="localFirstYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Foreign</p>
						<input type="text" class="form-control  numeric-field" id="foreignFirstYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getFirstYearForeign())?emploment.getFirstYearForeign():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="foreignFirstYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>

				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Second Year</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Direct</p>
						<input type="text" class="form-control numeric-field" id="directSecondYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getSecondYearDirect())?emploment.getSecondYearDirect():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="directSecondYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Indirect</p>
						<input type="text" class="form-control  numeric-field" id="indirectSecondYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getSecondYearIndirect())?emploment.getSecondYearIndirect():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="indirectSecondYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Male (direct)</p>
						<input type="text" class="form-control numeric-field" id="maleDirectSecondYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getSecondYearMale())?emploment.getSecondYearMale():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="maleDirectSecondYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Female (direct)</p>
						<input type="text" class="form-control  numeric-field" id="femaleDirectSecondYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getSecondYearFemale())?emploment.getSecondYearFemale():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="femaleDirectSecondYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
							
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Local</p>
						<input type="text" class="form-control  numeric-field" id="localSecondYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getSecondYearLocal())?emploment.getSecondYearLocal():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="localSecondYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Foreign</p>
						<input type="text" class="form-control  numeric-field" id="foreignSecondYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getSecondYearForeign())?emploment.getSecondYearForeign():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="foreignSecondYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>

				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Third Year</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Direct</p>
						<input type="text" class="form-control  numeric-field" id="directThirdYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getThirdYearDirect())?emploment.getThirdYearDirect():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="directThirdYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Indirect</p>
						<input type="text" class="form-control  numeric-field" id="indirectThirdYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getThirdYearIndirect())?emploment.getThirdYearIndirect():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="indirectThirdYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Male (direct)</p>
						<input type="text" class="form-control  numeric-field" id="maleDirectThirdYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getThirdYearMale())?emploment.getThirdYearMale():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="maleDirectThirdYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Female (direct)</p>
						<input type="text" class="form-control numeric-field" id="femaleDirectThirdYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getThirdYearFemale())?emploment.getThirdYearFemale():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="femaleDirectThirdYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Local</p>
						<input type="text" class="form-control  numeric-field" id="localThirdYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getThirdYearLocal())?emploment.getThirdYearLocal():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="localThirdYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Foreign</p>
						<input type="text" class="form-control numeric-field" id="foreignThirdYrEm" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(emploment)&&Validator.isNotNull(emploment.getThirdYearForeign())?emploment.getThirdYearForeign():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="foreignThirdYrEmValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="developerEmployementInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep7">
	<div class="tab-form">
		<div class="management-info-form">
			<div class="row">
				<div class="col-md-12">
				    <p class="tab-form-title f2">Disaster Management And Emergency Plan</p> 
					<p class="tab-form-title-subtitle f2"></p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<div class="form-group"> 
					 <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">34.</span>Does the company have a disaster management and emergency plan in place?</p> 
						 <div class="d-flex"> 
							  <div class="wizard-form-radio d-block"> 
								<input value="Yes" type="radio" <%=Validator.isNotNull(disasterManagement)&&Validator.isNotNull(disasterManagement.getDisasterManagement())&&disasterManagement.getDisasterManagement().equals("Yes")?"checked":""%> name="comDisasterManagement"> 
								   <label for="">Yes</label> 
							  </div> 
							  <div class="wizard-form-radio d-block ml-3"> 
								 <input value="No" type="radio" 
						<%=Validator.isNotNull(disasterManagement)&&Validator.isNotNull(disasterManagement.getDisasterManagement())&&disasterManagement.getDisasterManagement().equals("No")?"checked":""%>		 name="comDisasterManagement"> 
								   <label for="">No</label> 
							  </div> 
						 </div> 
					</div> 
				</div>
			</div>
			<div class="row">
				<input id="disasterMitigationPlanVal" type="hidden" name="disasterMitigationPlanVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="adddisasterMitigationPlanBox">
						<div class="accordion__header is-active"  id="adddisasterMitigationPlan" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>35. Define your disaster mitigation plan, emergency response mechanisms and incident management procedures.</h2>
									</div>
								</div>
							</div>
							<div>
								<p class="accordian-employee mb-0 common-para"></p>
							</div>
						</div>		
						<div class="accordion__body is-active">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<textarea rows="3" id="disasterMitigationPlan"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>			
				</div>
				<div class="col-md-12 d-flex justify-content-end py-4"> 
					<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreDisasterMitigationPlan" onclick="adddisasterMitigationPlanBox();"> <span>+ 1</span> Add More</a> 
				</div>
				<div class="col-12 table-responsive hide disasterMitigationPlanTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="disasterMitigationPlanTable">
							<tr>
								<th class="sub_heading">Define your disaster mitigation plan, emergency response mechanisms and incident management procedures.</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							<%if(Validator.isNotNull(disManagementAdd)&&disManagementAdd.size()>0){
								for(SezDevDisasterManagementAdd disManagementValues:disManagementAdd){%>
							<tr>
							
								<td class="sub_heading_content disasterMitigationPlan<%=disasterMitigationPlanVal%>">
								<%=Validator.isNotNull(disManagementValues)&&Validator.isNotNull(disManagementValues.getDisasterMitigationPlan())?disManagementValues.getDisasterMitigationPlan():"" %>
								</td>
								<td> 
									<span> 
										<a href="javascript:void(0)" id="devDisasterMitigationPlanValEditTab" onclick="devDisasterMitigationPlanValEditTab('<%=disasterMitigationPlanVal%>');"> 
									        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
									         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
									        </svg> 
									      </a> 
									  </span>
							     </td>
							     <td> 
									<span> 
										<a href="javascript:void(0)" id="devDisasterMitigationPlanValDeleteDataTab" onclick="devDisasterMitigationPlanValDeleteData('<%=disasterMitigationPlanVal%>');"> 
									        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
									        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
									        </svg>
									      </a> 
									  </span>  
							     </td>
							</tr>
							<input type="hidden" id="disasterMitigationPlanId<%=disasterMitigationPlanVal%>"  name="disasterMitigationPlanId<%=disasterMitigationPlanVal%>" value="<%=disManagementValues.getSezDevDisasterManagementAddId()%>">
							<%disasterMitigationPlanVal = disasterMitigationPlanVal+1;
							}}%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="developerDisasterManagementInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep8">
	<div class="tab-form">
		<div class="investment-info-form">
			<div class="row">
				<div class="col-md-12"> 
					<p class="tab-form-title f2">Investment and Financial Information</p> 
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">36.</span>Proposed Financial/Investment Details</p>
					</div>
				</div>
				<div class="col-md-6">
				
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">I.</span>Value of Land</p>
						<input type="text" class="form-control  numeric-field " id="landValue" placeholder="US$"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getValueOfLand())?investmentAndFinance.getValueOfLand():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="landValueValidation" style="color: red;">Only Numeric characters are allowed</p>
							
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">II.</span>On-Site Infrastructure such as boundary walls, roads, drainage, water supply, electricity
							etc.</p>
						<input type="text" class="form-control  numeric-field" id="onSiteInfrastructure" placeholder="US$"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getOnSiteInfrastructure())?investmentAndFinance.getOnSiteInfrastructure():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="onSiteInfrastructureValidation" style="color: red;">Only Numeric characters are allowed</p>
							
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">III.</span>Building/Factory Development Cost</p>
						<input type="text" class="form-control  numeric-field " id="factoryDevCost" placeholder="US$"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getBuildingFactoryDevelop())?investmentAndFinance.getBuildingFactoryDevelop():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="factoryDevCostValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">IV.</span>Port</p>
						<input type="text" class="form-control  numeric-field" id="portInvestDetails" placeholder="US$"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getPort())?investmentAndFinance.getPort():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="portInvestDetailsValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">V.</span>Airport</p>
						<input type="text" class="form-control  numeric-field" id="airportInvestDetails" placeholder="US$"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getAirPort())?investmentAndFinance.getAirPort():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="airportInvestDetailsValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">VI.</span>Other</p>
						<input type="text" class="form-control  numeric-field" id="otherInvestDetails" placeholder="US$"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getOther())?investmentAndFinance.getOther():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="otherInvestDetailsValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">VII.</span>Total Investment</p>
						<input type="text" class="form-control  numeric-field" id="totalInvestDetails" placeholder="US$"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getTotal())?investmentAndFinance.getTotal():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="totalInvestDetailsValidation" style="color: red;">Only Numeric characters are allowed</p>

					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">37.</span>Total Local Direct Investment (LDI)</p>
						<input type="text" class="form-control  numeric-field" id="totalLDI" placeholder="US$" 
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getTotalLocalDirector())?investmentAndFinance.getTotalLocalDirector():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="totalLDIValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">38.</span>Total Foreign Direct Investment (FDI)</p>
						<input type="text" class="form-control numeric-field " id="totalFDI" placeholder="US$" 
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getTotalForeignDirector())?investmentAndFinance.getTotalForeignDirector():""%>">
							<p class="tab-form-sub-heading fieldAlert hide" id="totalFDIValidation" style="color: red;">Only Numeric characters are allowed</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">39. If any, source of FDI (Sponsors company and country details should be provided)</p> 
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Company Name</p>
						<input type="text" class="form-control" id="fdiComName" placeholder="" 
						value="<%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getCompanyName())?investmentAndFinance.getCompanyName():""%>">
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">Resident Address</p>
						<textarea rows="3" id="fdiResidentAddr"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getResisdentAddress())?investmentAndFinance.getResisdentAddress():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">40.</span>Source of Funds</p>
						<textarea rows="3" id="fundSources"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(investmentAndFinance)&&Validator.isNotNull(investmentAndFinance.getSourceOfFunds())?investmentAndFinance.getSourceOfFunds():""%></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="developerInvestmentInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep9">
	<div class="tab-form">
		<div class="dev-undertaking-info-form">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">Developer's Undertaking</p>
				</div>
			</div>
			<div class="row">
				<%-- <div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Title of Applicant</p>
						<input type="text" class="form-control" id="applicantTitle" placeholder=""
							value="<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getTitleOfApplicant())? developerUndertaking.getTitleOfApplicant():""%>">
					</div>
				</div> --%>
				<div class="col-md-6"> 
			      <div class="form-group "> 
				     <p class="tab-form-main-heading">Title of Applicant</p> 
				     <div class="select-wrapper position-relative">
				       	<select class="form-select form-control" id="applicantTitle" name=""> 
				       		<option value="" disabled="" selected="">Please Select</option> 
				       		<option value="Mr"<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getTitleOfApplicant().equals("Mr"))?"selected":""%>>Mr.</option> <option value="Ms.">Ms.</option> 
				       		<option value="Mrs."<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getTitleOfApplicant().equals("Mrs."))?"selected":""%>>Mrs.</option> 
				       	</select> 
				    </div>
                   </div> 
                </div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Name of Applicant*</p>
						<input type="text" class="form-control" id="applicantName" placeholder=""
							value="<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getNameOfApplicant())? developerUndertaking.getNameOfApplicant():""%>">
							<p class="tab-form-sub-heading fieldAlert hide"
							id="applicantNameValidation" style="color: red;">Please Enter
							 Name</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Telephone No.</p>
						<input type="text" class="form-control" id="applicantTeleNum" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
							value="<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getTelephoneNum())? developerUndertaking.getTelephoneNum():""%>">
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">E-mail Address*</p>
						<input type="text" class="form-control" id="applicantEmail" placeholder="user@example.com"
							value="<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getEmailAddress())?developerUndertaking.getEmailAddress():""%>">
							<p class="tab-form-sub-heading fieldAlert hide"
							id="applicantEmailValidation" style="color: red;"></p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Official Seal/Stamp</p> 
				</div>
				<div class="col-md-12">
					<!-- <p class="tab-form-main-heading"> 
						I,<span class="giluio declaration-by"></span>, hereby authorise the MOT Authority, or its duly authorised representative, to validate the accuracy of the information provided in connection with this application for a License. I understand that the MOT Authority may utilise independent agencies to assist in checking such information, and I specifically authorize such an investigation by information services and outside entities of the MOT Authority's choice. I also understand that by not signing, I am withholding my permission and that in such a case, no investigation will be done, and my application for a License will not be processed. 
					</p> -->
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="applicant-sign-image-holder" >
					<%if(Validator.isNotNull(signatureUrl)){ %>
					<img src="<%=signatureUrl%>"  width="100" height="100"/>
					<%} %>
					</div>
					<input type="file" id="applicant-signature-upload-btn" name="<portlet:namespace/>applicant-signature-upload-btn" hidden="">
					<label for="applicant-signature-upload-btn" class="choose-sign-btn"> 
						<span class="mr-2">
							<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
								<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
							</svg>
					</span> Upload Signature
					</label>
				</div>
				<div class="col-md-5"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading">Date</p> 
						<input type="date" max="9999-12-31" class="form-control" id="applicant-signature-date" 
						value="<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getApplicantSignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(developerUndertaking.getApplicantSignatureDate()):"" %>" placeholder=""> 
					</div> 
				</div>
				<div class="col-md-7">
					<div class="form-group">
						<p class="tab-form-main-heading">Name of Notary Public/Justice of the Peace*</p>
						<input type="text" class="form-control" id="publicNotaryName" placeholder=""
							value="<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getNameOfNotaryPublic())?developerUndertaking.getNameOfNotaryPublic():"" %>">
							<p class="tab-form-sub-heading fieldAlert hide"
							id="publicNotaryNameValidation" style="color: red;">Please Enter
							 Name</p>
					</div>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">Official Seal/Stamp</p> 
				</div>
				<div class="col-md-12">
					<!-- <p class="tab-form-main-heading"> 
						I,<span class="giluio declaration-by"></span>, hereby authorise the MOT Authority, or its duly authorised representative, to validate the accuracy of the information provided in connection with this application for a License. I understand that the MOT Authority may utilise independent agencies to assist in checking such information, and I specifically authorize such an investigation by information services and outside entities of the MOT Authority's choice. I also understand that by not signing, I am withholding my permission and that in such a case, no investigation will be done, and my application for a License will not be processed. 
					</p> -->
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="public-notary-sign-image-holder">
					<%if(Validator.isNotNull(signatureUrlPublicNotary)){ %>
					<img src="<%=signatureUrlPublicNotary%>"  width="100" height="100"/>
					<%} %>
					</div>
					<input type="file" id="public-notary-signature-upload-btn" name="<portlet:namespace/>public-notary-signature-upload-btn"   hidden="">
					<label for="public-notary-signature-upload-btn" class="choose-sign-btn"> 
						<span class="mr-2">
							<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
								<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
							</svg>
					</span> Upload Signature
					</label>
				</div>
				<div class="col-md-6"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading">Date</p> 
						<input type="date" max="9999-12-31" class="form-control" id="public-notary-signature-date" 
						value="<%=Validator.isNotNull(developerUndertaking)&&Validator.isNotNull(developerUndertaking.getPublicNotarySignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(developerUndertaking.getPublicNotarySignatureDate()):"" %>" placeholder=""> 
					</div> 
				</div>
			</div>
		</div>
	</div>
	<button type="button" onclick="developerUndertakingInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                            <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                           </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep10">
	<div class="tab-form">
		<div class="submission-checklist-info-form">
			<div class="row">
				<div class="col-md-12">
				    <p class="tab-form-title f2">Submission Checklist</p> 
					<p class="tab-form-title-subtitle f2">Basic Eligibility Requirement</p>
				</div>
				<div class="col-md-12">
						<p class="tab-form-main-heading">The applicant must be a new company</p>
						<p class="tab-form-main-heading">The applicant must be a company limited by shares and registered under the Companies Act of Jamaica</p>
						<p class="tab-form-main-heading">Investments by the applicant in the proposed zone shall be sufficient to accommodate at least
							three occupants, except single-entity zones</p>
						<p class="tab-form-main-heading">The applicant must have issued and paid-up share capital of US$1,500,000</p>
				</div>
				<div class="col-md-12">
					<p class="common-section-small-heading mb-3">Should you have any queries regarding the completion of the application 
					form feel free to contact us via email at <span>bdev@jseza.com</span> or via telephone at (876) 619-SEZA (7392).</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
					 	<p class="tab-form-title-subtitle f2">I. General</p> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="generalReq1" value="Proof of payment of Application Fee" name="generalReq"
							<%=Validator.isNotNull(submissionChecklist)&&submissionChecklist.getSelectedGeneral().contains("Proof of payment of Application Fee")?"checked":""%>> 
							<label for="generalReq1"> <p class="tab-form-main-heading mb-0">Proof of payment of Application Fee: US$3,000. Please request payment details when fulfilling the
								transaction.</p> </label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="generalReq2" value="Completed Data Capture Form" name="generalReq"
							<%=Validator.isNotNull(submissionChecklist)&&submissionChecklist.getSelectedGeneral().contains("Completed Data Capture Form")?"checked":""%>> 
							<label for="generalReq2"> <p class="tab-form-main-heading mb-0">Completed Data Capture Form</p> </label> 
						</div> 
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">II. Company Information</p> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="comInfoReq1" value="Certified copy of the company's Memorandum or Articles of Association" name="comInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&submissionChecklist.getSelectedComInfoReq().contains("Certified copy of the company's Memorandum or Articles of Association")?"checked":""%>> 
							<label for="comInfoReq1"> <p class="tab-form-main-heading mb-0">Certified copy of the company's Memorandum or Articles of Association</p> </label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="comInfoReq2" value="Certified copy of Certificate of Incorporation" name="comInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&submissionChecklist.getSelectedComInfoReq().contains("Certified copy of Certificate of Incorporation")?"checked":""%>> 
							<label for="comInfoReq2"> 
							<p class="tab-form-main-heading mb-0">Certified copy of Certificate of Incorporation</p> 
							</label> 
							<p class="tab-form-sub-heading pl-4 ml-3">This document is to be certified by the Companies Office of Jamaica (COJ).</p>
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="comInfoReq3" value="Certified copy of Tax Registration Number (TRN)" name="comInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&submissionChecklist.getSelectedComInfoReq().contains("Certified copy of Tax Registration Number (TRN)")?"checked":""%>> 
							<label for="comInfoReq3"> <p class="tab-form-main-heading mb-0">Certified copy of Tax Registration Number (TRN)</p> 
							</label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="comInfoReq4" value="Certified copy of the General Consumption Tax (GCT) number" name="comInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&submissionChecklist.getSelectedComInfoReq().contains("Certified copy of the General Consumption Tax (GCT) number")?"checked":""%>> 
							<label for="comInfoReq4"> <p class="tab-form-main-heading mb-0">Certified copy of the General Consumption Tax (GCT) number; if applicable</p> </label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="comInfoReq5" value="Certified copy of Tax Compliance Certificate (TCC)" name="comInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&submissionChecklist.getSelectedComInfoReq().contains("Certified copy of Tax Compliance Certificate (TCC)")?"checked":""%>> 
							<label for="comInfoReq5"> <p class="tab-form-main-heading mb-0">Certified copy of Tax Compliance Certificate (TCC)</p> </label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="comInfoReq6" value="Proof of issued and paid-up shared capital" name="comInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&submissionChecklist.getSelectedComInfoReq().contains("Proof of issued and paid-up shared capital")?"checked":""%>> 
							<label for="comInfoReq6"> <p class="tab-form-main-heading mb-0">Proof of issued and paid-up shared capital not less than US$1,500,000. This may be satisfied by
								submitting one of the following:</p> </label> 
						</div>
						<div class="form-group pl-5 ml-3"> 
							<div class="wizard-form-radio d-block"> 
								<input value="Form 9 from the Companies Office of Jamaica." type="radio" name="paidShareCapProof" id="paidShareCapProof1"
								<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getPaidShareCapProof())&&submissionChecklist.getPaidShareCapProof().contains("Form 9 from the Companies Office of Jamaica.")?"checked":""%>> 
								<label for="paidShareCapProof1">Form 9 from the Companies Office of Jamaica.</label> 
							</div> 
							<div class="wizard-form-radio d-block"> 
								<input value="Form of Declaration from a Chartered Accountant" id="paidShareCapProof2" type="radio" name="paidShareCapProof"
								<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getPaidShareCapProof())&&submissionChecklist.getPaidShareCapProof().contains("Form of Declaration from a Chartered Accountant")?"checked":""%>> 
								<label for="paidShareCapProof2">Form of Declaration from a Chartered Accountant.</label>
								<p class="tab-form-sub-heading pl-4 ml-2"> See template "Form of Declaration" provided.</p> 
							</div> 
							<div class="wizard-form-radio d-block"> 
								<input value="Financial Statement from an Independent Chartered Account" type="radio" id="paidShareCapProof3" name="paidShareCapProof"
								<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getPaidShareCapProof())&&submissionChecklist.getPaidShareCapProof().contains("Financial Statement from an Independent Chartered Account")?"checked":""%>> 
								<label for="paidShareCapProof3">Financial Statement from an Independent Chartered Account.</label> 
							</div> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="comInfoReq7" value="Contact information for Attorney that will be representing the company during the Developer’s
							Licence Agreement negotiations" name="comInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedComInfoReq())&&submissionChecklist.getSelectedComInfoReq().contains("Contact information for Attorney that will be representing the company during the Developer’s")?"checked":""%>> 
							<label for="comInfoReq7"> <p class="tab-form-main-heading mb-0">Contact information for Attorney that will be representing the company during the Developer's
								Licence Agreement negotiations</p> </label> 
						</div>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">III. Sworn Statements</p> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="swornStateReq1" value="Affidavit indicating that the actual or proposed occupancy of the land" name="swornStateReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSwornStateReq())&&submissionChecklist.getSelectedSwornStateReq().contains("Affidavit indicating that the actual or proposed occupancy of the land")?"checked":""%>
							> 
							<label for="swornStateReq1"> <p class="tab-form-main-heading mb-0">Affidavit indicating that the actual or proposed occupancy of the land comprising the proposed SEZ is not subject to any dispute or any actual or impending legal liability or contingency that could give rise to a legal claim relating to land occupancy.</p> </label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="swornStateReq2" value="If applicable an affidavit together with supporting documents" name="swornStateReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSwornStateReq())&&submissionChecklist.getSelectedSwornStateReq().contains("If applicable an affidavit together with supporting documents")?"checked":""%>
							> 
							<label for="swornStateReq2"> <p class="tab-form-main-heading mb-0">If applicable, an affidavit, together with supporting documents, that demonstrate that third party public or private landowners of the proposed land area have declared their written consent to the proposed SEZ.</p> </label> 
						</div>
					</div> 
					<p class="tab-form-main-heading mb-0">See "Affidavit of Landlord Form", "Affidavit of Owner Form" or "Affidavit of Vendor Form" provided by Developer Kit.</p> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">IV. Land Occupancy</p> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="landOccuReq1" value="Certified copy of the certificate of the legal right to land ownership i.e. Certificate of Title." name="landOccuReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedLandOccuReq())&&submissionChecklist.getSelectedLandOccuReq().contains("Certified copy of the certificate of the legal right to land ownership i.e. Certificate of Title.")?"checked":""%>> 
							<label for="landOccuReq1"> <p class="tab-form-main-heading mb-0">Certified copy of the certificate of the legal right to land ownership i.e. Certificate of Title.</p> </label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="landOccuReq2" value="Certified copy of a long-term lease agreement clearly stating the duration of the lease" name="landOccuReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedLandOccuReq())&&submissionChecklist.getSelectedLandOccuReq().contains("Certified copy of a long-term lease agreement clearly stating the duration of the lease")?"checked":""%>> 
							<label for="landOccuReq2"> <p class="tab-form-main-heading mb-0">Certified copy of a long-term lease agreement clearly stating the duration of the lease ( Duration of a minimum of 5 years with some indication of potential for renewal)</p> </label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="landOccuReq3" value="Document establishing that the Applicant is in the process of obtaining occupancy rights to the subject land area" name="landOccuReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedLandOccuReq())&&submissionChecklist.getSelectedLandOccuReq().contains("Document establishing that the Applicant is in the process of obtaining occupancy rights to the subject land area")?"checked":""%>> 
					<label for="landOccuReq3"> <p class="tab-form-main-heading mb-0">Document establishing that the Applicant is in the process of obtaining occupancy rights to the subject land area.</p></label> 
						</div>
					</div> 
					<p class="common-section-small-heading mb-3"> <span>Important note: </span>Please ensure that the Lease Agreement, Technical Description, and Surveyors ID Report are describing the same subject area. Use of the same descriptions/ jargons/ units ofmeasurements etc. in describing the area is preferred.</p>
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">V. Security, Occupational safety and health requirements</p> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="safetyHealthReq1" value="Detailed Security Plan addressing the physical security measures" name="safetyHealthReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSafetyHealthReq())&&submissionChecklist.getSelectedSafetyHealthReq().contains("Detailed Security Plan addressing the physical security measures")?"checked":""%>> 
							<label for="safetyHealthReq1"> <p class="tab-form-main-heading mb-0">Detailed Security Plan addressing the physical security measures to be employed pre- and post-
construction. See "General Security Guidelines" provided.</p></label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="safetyHealthReq2" value="Business Continuity Emergency and Disaster Management Plan" name="safetyHealthReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSafetyHealthReq())&&submissionChecklist.getSelectedSafetyHealthReq().contains("Business Continuity Emergency and Disaster Management Plan")?"checked":""%>> 
							<label for="safetyHealthReq2"> <p class="tab-form-main-heading mb-0">Business Continuity, Emergency and Disaster Management Plan. See "Emergency and Disaster Action
								Plan Guide" provided.</p></label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="safetyHealthReq3" value="Occupational Health and Safety Plan covering all phases of the development" name="safetyHealthReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSafetyHealthReq())&&submissionChecklist.getSelectedSafetyHealthReq().contains("Occupational Health and Safety Plan covering all phases of the development")?"checked":""%>> 
							<label for="safetyHealthReq3"> <p class="tab-form-main-heading mb-0">Occupational Health and Safety Plan covering all phases of the development. See "Occupational
								Health and Safety Guidelines" provided.</p> </label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="safetyHealthReq4" value="Security and Logistical Plan Requirements for the handling of excise goods" name="safetyHealthReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSafetyHealthReq())&&submissionChecklist.getSelectedSafetyHealthReq().contains("Security and Logistical Plan Requirements for the handling of excise goods")?"checked":""%>> 
							<label for="safetyHealthReq4"> <p class="tab-form-main-heading mb-0">Security and Logistical Plan Requirements for the handling of excise goods, if applicable. This is required if the proposed activities in the zone include the handling of excise items.</p> </label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="safetyHealthReq5" value="Proposed facility to accommodate the Jamaica Customs Agency and the Special Economic Zone Authority" name="safetyHealthReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSafetyHealthReq())&&submissionChecklist.getSelectedSafetyHealthReq().contains("Proposed facility to accommodate the Jamaica Customs Agency and the Special Economic Zone Authority")?"checked":""%>> 
							<label for="safetyHealthReq5"> <p class="tab-form-main-heading mb-0">Proposed facility to accommodate the Jamaica Customs Agency and the Special Economic Zone Authority, where applicable.</p> </label> 
						</div>
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">VI. Land Development Construction requirements</p> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="landDevlopmentReq1" value="Surveyor's Identification Report with Sketch plan prepared by a Commissioned Land Surveyor" name="landDevlopmentReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedLandDevlopmentReq())&&submissionChecklist.getSelectedLandDevlopmentReq().contains("Surveyor's Identification Report with Sketch plan prepared by a Commissioned Land Surveyor")?"checked":""%>> 
							<label for="landDevlopmentReq1"> <p class="tab-form-main-heading mb-0">Surveyor's Identification Report, with Sketch plan prepared by a Commissioned Land Surveyor</p> </label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="landDevlopmentReq2" value="Surveyor's Technical Description" name="landDevlopmentReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedLandDevlopmentReq())&&submissionChecklist.getSelectedLandDevlopmentReq().contains("Surveyor's Technical Description")?"checked":""%>> 
							<label for="landDevlopmentReq2"> <p class="tab-form-main-heading mb-0">Surveyor's Technical Description - a written description of the distance and direction of the
								boundaries of the proposed SEZ area.</p> </label> 
						</div>
					</div> 
					<p class="tab-form-main-heading mb-0">See "TSI Technical Document Guide" provided by Developer Kit.</p> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">VII. Other Technical Information required</p> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="techInfoReq" value="Profile of Project Team" name="techInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedTechInfoReq())&&submissionChecklist.getSelectedTechInfoReq().contains("Profile of Project Team")?"checked":""%>> 
							<label for="techInfoReq"> <p class="tab-form-main-heading mb-0">Profile of Project Team to include technical capacity and previous experience in the construction of projects of a similar nature or large scale developments.</p> </label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="techInfoReq2" value="Project Implementation Schedule" name="techInfoReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedTechInfoReq())&&submissionChecklist.getSelectedTechInfoReq().contains("Project Implementation Schedule")?"checked":""%>> 
							<label for="techInfoReq2"> <p class="tab-form-main-heading mb-0">Project Implementation Schedule.</p> </label> 
						</div>
					</div> 
					<p class="tab-form-main-heading mb-0">See "TSI Technical Document Guide" provided by Developer Kit.</p> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">VIII. Preliminary Sez Development Plan</p> 
						 <p class="common-section-small-heading mb-3"> <span>(This is only to be submitted by applicants where the proposed SEZ site is currently a greenfield and are at the conceptual stage of development. A detailed development plan will be required once preapproval is received.)</span></p>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="sezPreliminaryReq1" value="Preliminary Business Plan" name="sezPreliminaryReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSezPreliminaryReq())&&submissionChecklist.getSelectedSezPreliminaryReq().contains("Preliminary Business Plan")?"checked":""%>> 
							<label for="sezPreliminaryReq1"> <p class="tab-form-main-heading mb-0">Preliminary Business Plan. See "Business Plan Guidelines" provided.</p> </label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="sezPreliminaryReq2" value="Concept Master Plan" name="sezPreliminaryReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSezDevDetailReq())&&submissionChecklist.getSelectedSezPreliminaryReq().contains("Concept Master Plan")?"checked":""%>> 
							<label for="sezPreliminaryReq2"> <p class="tab-form-main-heading mb-0">Concept Master Plan this is a project plan that identifies the following areas</p> </label> 
							<ul class="list-group pl-5 ml-3">
								<li class="tab-form-main-heading list-group-item">Description of the number of hectares or acres of land</li>
								<li class="tab-form-main-heading list-group-item">Preliminary land-use plan</li>
								<li class="tab-form-main-heading list-group-item">Full plot and land area layout</li>
								<li class="tab-form-main-heading list-group-item">Zoning</li>
								<li class="tab-form-main-heading list-group-item">Sketch plans and designs of a proposed SEZ. This includes renderings (i.e., drawings, paintings or computer rendering) of what the SEZ will look like when completed</li>
								<li class="tab-form-main-heading list-group-item">The location of planned Infrastructure</li>
								<li class="tab-form-main-heading list-group-item">All infrastructure and building construction drawings, including proposed height limits, setback requirements and density parameters in each proposed land-use designation or area</li>
								<li class="tab-form-main-heading list-group-item">Maps or drawings of the SEZ area showing transportation and road networks</li>
								<li class="tab-form-main-heading list-group-item">Preliminary description of the quality, condition, and the size of existing infrastructure at or near the proposed SEZ site together with any on site</li>
							</ul>
						</div>
					</div> 
					<p class="tab-form-main-heading mb-0">See "TSI Technical Document Guide" provided by Developer Kit.</p> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">IX. Detailed Sez Development Plan</p> 
						 <p class="common-section-small-heading mb-3"><span>Detailed Master Plan together with the detailed technical economic study, to include:</span></p>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="sezDevDetailReq1" value="Business plan and financial analysis" name="sezDevDetailReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSezDevDetailReq())&&submissionChecklist.getSelectedSezDevDetailReq().contains("Business plan and financial analysis")?"checked":""%>> 
							<label for="sezDevDetailReq1"> <p class="tab-form-main-heading mb-0">Business plan and financial analysis that sets out, among other technical, economic, business and financial evaluations (3 year projections), all social mitigation measures and phased development and zoning plans</p> </label> 
							<ul class="list-group pl-5 ml-3">
								<li class="tab-form-main-heading list-group-item">Plan should describe the nature and projected value of the investments, including estimated investments relating to SEZ design, financing, construction, development, services, operations, maintenance and promotion activities and projected development costs to be incurred by the applicant during the different development phases of the proposed SEZ</li>
								<li class="tab-form-main-heading list-group-item">Schedule of Fees to be charged for any goods, services, infrastructure, or other structures provided by the developer (multi-purpose developers only).</li>
							</ul>
							<p class="tab-form-main-heading mb-0 pl-5 ml-3 pt-2">See "Business Plan Guidelines" provided by Developer Kit.</p> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="sezDevDetailReq2" value="Master Plan" name="sezDevDetailReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedSezDevDetailReq())&&submissionChecklist.getSelectedSezDevDetailReq().contains("Master Plan")?"checked":""%>> 
							<label for="sezDevDetailReq2"> <p class="tab-form-main-heading mb-0">Master Plan</p></label> 
							<ul class="list-group pl-5 ml-3">
								<li class="tab-form-main-heading list-group-item">Written statement on any plans for phasing or expansion</li>
								<li class="tab-form-main-heading list-group-item">Strategic Environmental Assessment and/or Environmental Impact Assessment with mitigation measures</li>
								<li class="tab-form-main-heading list-group-item">Land use plan</li>
								<li class="tab-form-main-heading list-group-item">Written statement on any resettlement plans or mitigation measures</li>
								<li class="tab-form-main-heading list-group-item">Written statement on the construction technique and the applicable planning guidelines being used in the construction of this SEZ development</li>
								<li class="tab-form-main-heading list-group-item">Set of Municipal approved construction drawings (Digital)and/ 'As Built' drawings of the facility</li>
							</ul>
							<p class="tab-form-main-heading mb-0 pl-5 ml-3 pt-2">See "TSI Technical Document Guide" provided by Developer Kit.</p> 
						</div> 
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
						 <p class="tab-form-title-subtitle f2">X. Approvals</p> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="approvalReq1" value="Building permit (addition/alteration) from the relevant Parish/Municipal Council" name="approvalReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedApprovalReq())&&submissionChecklist.getSelectedApprovalReq().contains("Building permit (addition/alteration) from the relevant Parish/Municipal Council")?"checked":""%>> 
							<label for="approvalReq1"> <p class="tab-form-main-heading mb-0">Building permit (addition/alteration) from the relevant Parish/Municipal Council</p></label> 
						</div> 
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="approvalReq2" value="Fire Approval Letter or Fire Safety Certificate" name="approvalReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedApprovalReq())&&submissionChecklist.getSelectedApprovalReq().contains("Fire Approval Letter or Fire Safety Certificate")?"checked":""%>> 
							<label for="approvalReq2"> <p class="tab-form-main-heading mb-0">Fire Approval Letter or Fire Safety Certificate from the Jamaica Brigade Fire Service</p></label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="approvalReq3" value="Proof of Application" name="approvalReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedApprovalReq())&&submissionChecklist.getSelectedApprovalReq().contains("Proof of Application")?"checked":""%>> 
							<label for="approvalReq3"> <p class="tab-form-main-heading mb-0">Proof of Application</p></label> 
						</div>
						<div class="checkbox-form-group second-custom-checkbox"> 
							<input type="checkbox" id="approvalReq4" value="Any other relevant approvals e.g. NEPA Local Authorities" name="approvalReq"
							<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getSelectedApprovalReq())&&submissionChecklist.getSelectedApprovalReq().contains("Any other relevant approvals e.g. NEPA Local Authorities")?"checked":""%>> 
							<label for="approvalReq4"> <p class="tab-form-main-heading mb-0">Any other relevant approvals, e.g. NEPA, Local Authorities, etc.</p></label> 
						</div>
					</div> 
					<p class="common-section-small-heading mb-3"> <span>Important note: </span>The Authority's Business Acceleration Center (BAC) is available to assist stakeholders in acquiring the relevant permit. To access the BAC services, please send a letter addressed to the CEO of the Authority requesting the relevant permit assistance needed.</p>
				</div>
				<div class="col-md-12"> 
					<p class="tab-form-title-subtitle f2">I have reviewed and submitted the documents highlighted in the checklist as a part of an application for Special Economic Zone designation.</p> 
				</div>
				<div class="col-md-6"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading">Name</p> 
						<input type="text" class="form-control" id="nameReq" placeholder="" value="<%=Validator.isNotNull(submissionChecklist)&& Validator.isNotNull(submissionChecklist.getNameReq())?submissionChecklist.getNameReq():"" %>"> 
					</div> 
				</div>
				<div class="col-md-6"> 
					<div class="form-group"> 
						<p class="tab-form-main-heading">Date</p> 
						<input type="date" max="9999-12-31" class="form-control" id="dateReq" value="<%=Validator.isNotNull(submissionChecklist)&&Validator.isNotNull(submissionChecklist.getDateReq())?new SimpleDateFormat("yyyy-MM-dd").format(submissionChecklist.getDateReq()):""%>" placeholder=""> 
					</div> 
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="sign-req-image-holder">
					<%if(Validator.isNotNull(signatureUrlSubmission)){ %>
					<img src="<%=signatureUrlSubmission%>"  width="100" height="100"/>
					<%} %>
					</div>
					<input type="file" id="sign-req-upload-btn" hidden="" name="<portlet:namespace/>sign-req-upload-btn"   >
					<label for="sign-req-upload-btn" class="choose-sign-btn"> 
						<span class="mr-2">
							<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
								<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
							</svg>
					</span> Upload Signature
					</label>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
</div>


