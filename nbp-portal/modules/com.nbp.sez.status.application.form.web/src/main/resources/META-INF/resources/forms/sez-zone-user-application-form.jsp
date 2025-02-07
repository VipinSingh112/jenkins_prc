<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress"%>
<%@page import="java.util.Date"%>
<%@page import="com.nbp.sez.status.upload.document.commands.GettingDocumentData"%>
<%@ include file="../init.jsp" %>
<%@page import="java.util.List"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneEmployInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneLocationAddLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneSubCheckInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneDevUnderInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneUserUnderInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneEmpInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneFinancialInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneProposedProjectInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneGeneralBusinessInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezZoneGeneralBussinessAddressLocalServiceUtil"%>
<%
int zoneUserFreeZoneLocCounter = 1;
int zoneUserLabourReqCounter = 1;
SezZoneUserUnderInfo sezZoneUserUnderInfo = null;
SezZoneDevUnderInfo sezZoneDevUnderInfo = null;
SezZoneSubCheckInfo sezZoneSubCheckInfo = null;
SezZoneGeneralBussinessAddress addressOfCompany = null;
SezZoneGeneralBussinessAddress addressOfAuthorisedRepresentative = null;
SezZoneGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice = null;
String zoneUndertakingSign="";
String zoneDeveloperSign="";
String zoneDEveloperNotarySign="";
String zoneUndertakingNotarySign="";
String zoneSubmissionSign="";
Date approvalDate= null;
	if(sezStatusApplicationId > 0){
	try{
	sezZoneUserUnderInfo = SezZoneUserUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
	sezZoneDevUnderInfo = SezZoneDevUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
	sezZoneSubCheckInfo = SezZoneSubCheckInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
	}catch(Exception e){}
	try {
		zoneUndertakingSign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Zone User Undertaking Declarant", themeDisplay.getScopeGroupId(), sezStatusApplicationId);
	} catch (Exception e) {}
	try {
		zoneUndertakingNotarySign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature Of Zone User Undertaking Notary", themeDisplay.getScopeGroupId(), sezStatusApplicationId);
	} catch (Exception e) {}
	try {
		zoneDEveloperNotarySign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature Of Zone User Developer Notary", themeDisplay.getScopeGroupId(), sezStatusApplicationId);
	} catch (Exception e) {}
	try {
		zoneDeveloperSign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Zone User Developer Declarant", themeDisplay.getScopeGroupId(), sezStatusApplicationId);
	} catch (Exception e) {}
	try {
		zoneSubmissionSign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Zone User Submission", themeDisplay.getScopeGroupId(), sezStatusApplicationId);
	} catch (Exception e) {}
	try {
		addressOfCompany = SezZoneGeneralBussinessAddressLocalServiceUtil
				.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Applicant Firm/Company");
	} catch (Exception e) {}
	try {
		addressOfAuthorisedRepresentative = SezZoneGeneralBussinessAddressLocalServiceUtil
				.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Authorised Representative");
	} catch (Exception e) {}
	try {
		adddressSponsorOrRegisteredHeadOffice = SezZoneGeneralBussinessAddressLocalServiceUtil
				.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Sponsor/Registered Head Office");
	} catch (Exception e) {}
}
%>
<div class="hide" id="sezZoneApplicationForm">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep20">
			<div class="tab-form">
				<div class="general-info-form">
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
			                    <input type="date" class="form-control" id="zoneUserAppDate" value="<%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&Validator.isNotNull(sezZoneGeneralBusinessInfo.getApplicationDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneGeneralBusinessInfo.getApplicationDate()):""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading" for="sezZoneUserDevName"><span class="tab-form-highlghtme-link pr-2">2.</span>Name of SEZ Developer*</p>
			                    <input type="text" class="form-control" id="sezZoneUserDevName"
			                        placeholder="" value="<%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&Validator.isNotNull(sezZoneGeneralBusinessInfo.getDeveloperName())?sezZoneGeneralBusinessInfo.getDeveloperName():""%>">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="sezZoneUserDevNameValidation" style="color: red;">
			                    Please Enter Name</p>
			                </div>
			            </div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>State the name of the SEZ (location)</p>
								<textarea rows="3" id="sezZoneUserLocName"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"
								value=""><%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&Validator.isNotNull(sezZoneGeneralBusinessInfo.getLocationName())?sezZoneGeneralBusinessInfo.getLocationName():""%></textarea>
							</div>
						</div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>SEZ Developer's Control Number</p>
			                    <input type="text" class="form-control" id="sezZoneDevControlNum"
			                    oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
			                    placeholder="" value="<%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&Validator.isNotNull(sezZoneGeneralBusinessInfo.getControlNum())?sezZoneGeneralBusinessInfo.getControlNum():""%>">
			                </div>
			            </div>
			            <div class="col-md-12"> 
			                <p class="tab-form-title-subtitle f2">5. Name and full address of applicant firm/ company</p> 
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Company Name*</p>
			                    <input type="text" class="form-control" id="zoneUserCompanyName"
			                        placeholder="" value="<%=Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getZoneName())?addressOfCompany.getZoneName():""%>">
			                     <p class="tab-form-sub-heading fieldAlert hide" id="zoneUserCompanyNameValidation" style="color: red;">
			                    Please Enter Company Name</p>
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Building No. and Street Address</p>
			                    <input type="text" class="form-control" id="zoneUserCompanyStreetAddress" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getZoneStreetAddress())?addressOfCompany.getZoneStreetAddress():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Town/City</p>
			                    <input type="text" class="form-control" id="zoneUserCompanyTown" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getZoneTown())?addressOfCompany.getZoneTown():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			               <%--  <div class="form-group">
			                    <p class="tab-form-main-heading">Parish</p>
			                    <input type="text" class="form-control" id="zoneUserCompanyParish" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getZoneParish())?addressOfCompany.getZoneParish():""%>">
			                </div> --%>
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="zoneUserCompanyParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=addressOfCompany!=null?addressOfCompany.getZoneParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
			            </div>
			            <div class="col-md-12"> 
			                <p class="tab-form-title-subtitle f2">6. Name and address of Authorised Representative for the Zone User application</p> 
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Name*</p>
			                    <input type="text" class="form-control" id="zoneUserAuthRepName"
			                        placeholder="" value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getZoneName())?addressOfAuthorisedRepresentative.getZoneName():""%>">
			                     <p class="tab-form-sub-heading fieldAlert hide" id="zoneUserAuthRepNameValidation" style="color: red;">
			                    Please Enter Name</p>
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Building No. and Street Address</p>
			                    <input type="text" class="form-control" id="zoneUserAuthRepStreetAddress" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getZoneStreetAddress())?addressOfAuthorisedRepresentative.getZoneStreetAddress():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Town/City</p>
			                    <input type="text" class="form-control" id="zoneUserAuthRepTown" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getZoneTown())?addressOfAuthorisedRepresentative.getZoneTown():""%>">
			                </div>
			            </div>
			           <%--  <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Parish/Post /Zip Code</p>
			                    <input type="text" class="form-control" id="zoneUserAuthRepZipCode" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getZoneParish())?addressOfAuthorisedRepresentative.getZoneParish():""%>">
			                </div>
			            </div> --%>
			              <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="zoneUserAuthRepZipCode">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getZoneParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Country</p>
			                    <input type="text" class="form-control" id="zoneUserAuthRepCountry" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getZoneCountry())?addressOfAuthorisedRepresentative.getZoneCountry():""%>">
			                </div>
			            </div>
			            <div class="col-md-12"> 
			                <p class="tab-form-title-subtitle f2">7. State the name of the Sponsor /Registered Head Office in case local company is part of Multi- National Corporation (MNC)</p> 
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Company Name*</p>
			                    <input type="text" class="form-control" id="zoneUserSponsorComName"
			                        placeholder="" value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getZoneName())?adddressSponsorOrRegisteredHeadOffice.getZoneName():""%>">
			                     <p class="tab-form-sub-heading fieldAlert hide" id="zoneUserSponsorComNameValidation" style="color: red;">
			                    Please Enter Company Name</p>
			                </div>
			            </div> 
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Building No. and Street Address</p>
			                    <input type="text" class="form-control" id="zoneUserSponsorStreetAddress" placeholder=""
			                        value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getZoneStreetAddress())?adddressSponsorOrRegisteredHeadOffice.getZoneStreetAddress():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Town/City</p>
			                    <input type="text" class="form-control" id="zoneUserSponsorTown" placeholder=""
			                        value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getZoneTown())?adddressSponsorOrRegisteredHeadOffice.getZoneTown():""%>">
			                </div>
			            </div>
			         <%--    <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Post/Zip Code</p>
			                    <input type="text" class="form-control" id="zoneUserSponsorZipCode" placeholder=""
			                        value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getZoneParish())?adddressSponsorOrRegisteredHeadOffice.getZoneParish():""%>">
			                </div>
			            </div> --%>
			            <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="zoneUserSponsorZipCode">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getZoneTown().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Country</p>
			                    <input type="text" class="form-control" id="zoneUserSponsorCountry" placeholder=""
			                        value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getZoneCountry())?adddressSponsorOrRegisteredHeadOffice.getZoneCountry():""%>">
			                </div>
			            </div>
			            <div class="col-md-12">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Are you an existing Jamaican Company under the Companies Act, 2004 (Act 10 of 2004)?</p>
			                    <div class="d-flex">
			                        <div class="wizard-form-radio d-block">
			                            <input value="Yes" 
			                            type="radio" name="zoneUserExistingCom" 
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getExistingCompany().equals("Yes")?"checked":""%>> 
			                            <label for="">Yes</label>
			                        </div>
			                        <div class="wizard-form-radio d-block ml-3">
			                            <input value="No" type="radio" name="zoneUserExistingCom"
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getExistingCompany().equals("No")?"checked":""%>> 
			                            <label for="">No</label>
			                        </div>
			                    </div>
			                </div>
			            </div>
			        </div>
			        <div class="row hide" id="zoneUserExistingComBox">
			            <div class="col-md-12 pt-3"> 
			                   <p class="common-section-small-heading mb-0">Please select the form of the articles of incorporation</p> 
			            </div>
			            <div class="col-lg-12">
			                <div class="form-group">
			                    <div class="select-wrapper position-relative">
			                        <select class="form-select form-control" id="zoneUserFormArticle">
			                            <option value="" selected="" disabled="">Please select</option>
			                            <option value="A company limited by shares"
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getArticleForm().equals("A company limited by shares")?"selected":""%>>
			                            A company limited by shares</option>
			                            <option value="A company limited by guarantee and not having a share capital"
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getArticleForm().equals("A company limited by guarantee and not having a share capital")?"selected":""%>>
			                            A company limited by guarantee and not having a share capital</option>
			                            <option value="An unlimited company having a share capital"
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getArticleForm().equals("An unlimited company having a share capital")?"selected":""%>>
			                            An unlimited company having a share capital</option>
			                            <option value="Partnership"
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getArticleForm().equals("Partnership")?"selected":""%>>
			                            Partnership</option>
			                            <option value="Sole Proprietor"
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getArticleForm().equals("Sole Proprietor")?"selected":""%>>
			                            Sole Proprietor</option>
			                            <option value="Other"
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getArticleForm().equals("Other")?"selected":""%>>
			                            Other (please specify)</option>
			                        </select>
			                    </div>
			                </div>
			            </div>
			            <div class="col-md-12 hide" id="zoneUserFormArticleOtherBox">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Please specify</p>
			                    <input type="text" class="form-control" id="zoneUserFormArticleOther" placeholder="Please specify Other form of the articles of incorporation"
			                        value="<%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&Validator.isNotNull(sezZoneGeneralBusinessInfo.getOtherArticleForm())?sezZoneGeneralBusinessInfo.getOtherArticleForm():""%>">
			                </div>
			            </div>
			        </div>
			        <div class="row">
						<div class="col-md-12">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>Non-Resident Jamaican Company?</p>
			                    <div class="d-flex">
			                        <div class="wizard-form-radio d-block">
			                            <input value="Yes" type="radio" name="zoneUserNonResiCom"
			                                <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getNonResidentCom().equals("Yes")?"checked":""%>> 
			                                <label for="">Yes</label>
			                        </div>
			                        <div class="wizard-form-radio d-block ml-3">
			                            <input value="No" type="radio" name="zoneUserNonResiCom"
			                            <%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&sezZoneGeneralBusinessInfo.getNonResidentCom().equals("No")?"checked":""%>> 
			                            <label for="">No</label>
			                        </div>
			                    </div>
			                </div>
			            </div>
			            <div class="col-md-4">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>Taxpayer Registration Number (TRN)</p>
			                    <input type="text" class="form-control" id="zoneUserTRN" placeholder=""
			                        value="<%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&Validator.isNotNull(sezZoneGeneralBusinessInfo.getTaxRegisNum())?sezZoneGeneralBusinessInfo.getTaxRegisNum():""%>" 
			                        oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
			                </div>
			            </div>
			            <div class="col-md-4">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span>General Consumption Tax Number (GCT)</p>
			                    <input type="text" class="form-control" id="zoneUserGCT" placeholder=""
			                        value="<%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&Validator.isNotNull(sezZoneGeneralBusinessInfo.getGenConsumptionNum())?sezZoneGeneralBusinessInfo.getGenConsumptionNum():""%>" 
			                        oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
			                </div>
			            </div>
			            <div class="col-md-4">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.</span>Tax Compliance Certificate Number (TCC)</p>
			                    <input type="text" class="form-control" id="zoneUserTCC" placeholder=""
			                        value="<%=Validator.isNotNull(sezZoneGeneralBusinessInfo)&&Validator.isNotNull(sezZoneGeneralBusinessInfo.getTaxComplianceCertificateNum())?sezZoneGeneralBusinessInfo.getTaxComplianceCertificateNum():""%>" 
			                        oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
			                </div>
			            </div>
			        </div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="zoneGeneralBusinessInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep21">
			<div class="tab-form">
				<div class="proposed-project-info-form">
					<div  class="row">
					<div class="col-md-12"> 
                          <p class="tab-form-title f2">Existing and / or Proposed Project Brief</p> 
                          </div> 
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.</span>Has the applicant ever been denied approval to operate as a SEZ entity?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio"<%=Validator.isNotNull(sezZoneProposedProjectInfo)&&sezZoneProposedProjectInfo.getEntityDeniedApproval().equals("Yes")?"checked":""%>
											name="zoneUserEntityDeniedAppr"> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio"<%=Validator.isNotNull(sezZoneProposedProjectInfo)&&sezZoneProposedProjectInfo.getEntityDeniedApproval().equals("No")?"checked":""%>
											name="zoneUserEntityDeniedAppr"> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6 zoneUserDeniedFreeZoneApprData hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of application</p>
								<input type="date" class="form-control" id="zoneUserDeniedApprDate" aria-describedby="zoneUserDeniedApprDate" placeholder=""
								 value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getDeniedApprovalDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneProposedProjectInfo.getDeniedApprovalDate()):""%>">
							</div>
						</div>
						<div class="col-md-6 zoneUserDeniedFreeZoneApprData hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Type of project proposed</p>
								<input type="text" class="form-control" id="zoneUserDeniedApprProjectType" aria-describedby="zoneUserDeniedApprProjectType" placeholder="" 
								value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getDeniedApprovalProjectType())?sezZoneProposedProjectInfo.getDeniedApprovalProjectType():""%>">
							</div>
						</div>
						<div class="col-md-12">
					<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.</span>Does your company have any other location(s) with SEZ/Free Zone status?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block"> 
									  <input value="Yes" type="radio"<%=Validator.isNotNull(sezZoneProposedProjectInfo)&&sezZoneProposedProjectInfo.getEntityDeniedApproval().equals("Yes")?"checked":""%> name="zoneUserFreeZoneLocation"> 
										 <label for="">Yes</label> 
									</div> 
									<div class="wizard-form-radio d-block ml-3"> 
										 <input value="No" type="radio"<%=Validator.isNotNull(sezZoneProposedProjectInfo)&&sezZoneProposedProjectInfo.getEntityDeniedApproval().equals("No")?"checked":""%> name="zoneUserFreeZoneLocation"> 
										 <label for="">No</label> 
									</div>
								</div> 
							</div> 
						</div>
					</div>
					<div class="row hide" id="zoneUserFreeZoneLocBox">
						<input id="zoneUserFreeZoneLocVal" type="hidden" name="zoneUserFreeZoneLocVal" value="1">
						<div class="col-md-12">
							<div class="accordion secured-accordian" id="addZoneUserFreeZoneLocBox">
								<div class="accordion__header is-active"  id="addZoneUserFreeZoneLoc" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>location(s)</h2>
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
												<p class="tab-form-main-heading">SEZ Developers Code/Location</p>
												<input type="text" class="form-control" id="zoneUserSezDevLoc"
													aria-describedby="zoneUserSezDevLoc" placeholder=""
													value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Description/Type of Activity</p>
												<input type="text" class="form-control" id="zoneUserSezDevLocDesc"
													aria-describedby="zoneUserSezDevLocDesc" placeholder=""
													value="">
											</div>
										</div>
									</div>
								</div>
							</div>			
						</div>
						<div class="col-md-12 d-flex justify-content-end py-4"> 
						<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreZoneUserFreeZoneLocBox" onclick="addZoneUserFreeZoneLocBox();"> <span>+ 1</span> Add More</a> 
						</div>
						<div class="col-12 table-responsive hide zoneUserFreeZoneLocTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="zoneUserFreeZoneLocTable">
									<tr>
										<th class="sub_heading">SEZ Developers Code/Location</th>
										<th class="sub_heading">Description/Type of Activity</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
							<%
							if(Validator.isNotNull(zoneLocationAdd)&&zoneLocationAdd.size()>0){
							for(SezZoneLocationAdd sezZoneLocationValues:zoneLocationAdd){
										%> 
									<tr>
										<td class="sub_heading_content zoneUserSezDevLoc<%=zoneUserFreeZoneLocCounter%>">
									  <%=Validator.isNotNull(sezZoneLocationValues)&&Validator.isNotNull(sezZoneLocationValues.getDeveloperLocation())?sezZoneLocationValues.getDeveloperLocation():""%> 
										</td>
										<td class="sub_heading_content zoneUserSezDevLocDesc<%=zoneUserFreeZoneLocCounter%>">
										<%=Validator.isNotNull(sezZoneLocationValues)&&Validator.isNotNull(sezZoneLocationValues.getDeveloperLocationDescription())?sezZoneLocationValues.getDeveloperLocationDescription():""%>
										
										</td>
										<td> 
											<span> 
												<a href="javascript:void(0)" onclick="zoneUserSezDevLocEditTab('<%=zoneUserFreeZoneLocCounter%>');"> 
											        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
											         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
											        </svg> 
											      </a> 
											  </span>
									     </td>
									     <td> 
											<span> 
												<a href="javascript:void(0)" onclick="zoneUserSezDevLocDeleteData('<%=zoneUserFreeZoneLocCounter%>');"> 
											        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
											        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
											        </svg>
											      </a> 
											  </span>  
                                         </td>
									</tr>
									<input id="zoneProposedFreeLocAppId<%=zoneUserFreeZoneLocCounter%>" name="zoneProposedFreeLocAppId<%=zoneUserFreeZoneLocCounter%>" val="<%=sezZoneLocationValues.getSezZoneLocationAddId()%>" type="hidden"/>
									<%zoneUserFreeZoneLocCounter =  zoneUserFreeZoneLocCounter+1; 
									}
							}%> 
								</tbody>
							</table>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">15. Address of Leased Premises</p> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Lot/Building No. and Street Address</p>
								<input type="text" class="form-control" id="zoneUserLeasedBuildingNum" placeholder=""
									value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getLeasedBuildingNum())?sezZoneProposedProjectInfo.getLeasedBuildingNum():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Town/City</p>
								<input type="text" class="form-control" id="zoneUserLeasedTown" placeholder=""
									value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getLeasedTown())?sezZoneProposedProjectInfo.getLeasedTown():""%>">
							</div>
						</div>
						<%-- <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<input type="text" class="form-control" id="zoneUserLeasedParish" placeholder=""
									value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getLeasedParish())?sezZoneProposedProjectInfo.getLeasedParish():""%>">
							</div>
						</div> --%>
						 <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="zoneUserLeasedParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=sezZoneProposedProjectInfo!=null?sezZoneProposedProjectInfo.getLeasedParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
			            </div>
						
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">15.b. State lease term</p> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Years</p>
								<input type="text" class="form-control" id="zoneUserLeaseYears" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getLeaseYears())?sezZoneProposedProjectInfo.getLeaseYears():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">15.c</span> Volume</p>
								<input type="text" class="form-control" id="zoneUserVolume" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getVolume())?sezZoneProposedProjectInfo.getVolume():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Folio</p>
								<input type="text" class="form-control" id="zoneUserFolio" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getFolio())?sezZoneProposedProjectInfo.getFolio():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">15.d</span>Floor Number/s</p>
								<input type="text" class="form-control" id="zoneUserFloorNum" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(sezZoneProposedProjectInfo) &&Validator.isNotNull(sezZoneProposedProjectInfo.getFloorNum())?sezZoneProposedProjectInfo.getFloorNum():""%>">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="zoneProposedProjInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep22">
			<div class="tab-form">
				<div class="investment-plan-info-form">
					<div class="row">
						<div class="col-md-12">
							<!-- <p class="tab-form-title f2">Stakeholder Information</p> -->
							<p class="tab-form-title f2">Investment and Financial Information</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">16. Estimated Level of Investment (USD):</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">i. Infrastructure</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">a.</span>Building/facilities</p>
								<input type="text" class="form-control numeric-field" id="zoneUserInfraBuilding" aria-describedby="zoneUserInfraBuilding" placeholder="US$"
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
								 value="<%=Validator.isNotNull(sezZoneFinancialInfo) &&Validator.isNotNull(sezZoneFinancialInfo.getBuildingInfrastructure())?sezZoneFinancialInfo.getBuildingInfrastructure():""%>">
								 <p class="tab-form-sub-heading fieldAlert hide" id="zoneUserInfraBuildingValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">b.</span>Equipment</p>
								<input type="text" class="form-control numeric-field" id="zoneUserInfraEquipment" aria-describedby="zoneUserInfraEquipment" placeholder="US$"
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" 
								value="<%=Validator.isNotNull(sezZoneFinancialInfo) &&Validator.isNotNull(sezZoneFinancialInfo.getEquipmentInfrastructure())?sezZoneFinancialInfo.getEquipmentInfrastructure():""%>">
								<p class="tab-form-sub-heading fieldAlert hide" id="devEquityAuthorisedValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">c.</span>Machines</p>
								<input type="text" class="form-control numeric-field" id="zoneUserInfraMachines" aria-describedby="zoneUserInfraMachines" placeholder="US$"
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" 
								value="<%=Validator.isNotNull(sezZoneFinancialInfo) &&Validator.isNotNull(sezZoneFinancialInfo.getMachinesInfrastructure())?sezZoneFinancialInfo.getMachinesInfrastructure():""%>">
								<p class="tab-form-sub-heading fieldAlert hide" id="devEquityAuthorisedValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">d.</span>Total</p>
								<input type="text" class="form-control numeric-field" id="zoneUserInfraTotal" aria-describedby="zoneUserInfraTotal" placeholder="US$"
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" 
								value="<%=Validator.isNotNull(sezZoneFinancialInfo) &&Validator.isNotNull(sezZoneFinancialInfo.getTotalInfrastructure())?sezZoneFinancialInfo.getTotalInfrastructure():""%>">
								<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserInfraTotalValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">ii. Source(s) of finance</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserFinanceSource1" value="Loan (Bank, Government, Private Institution)"<%=sezZoneFinancialInfo!=null &&sezZoneFinancialInfo.getFinanceSource().contains("Loan (Bank, Government, Private Institution)")? "checked":StringPool.BLANK%> name="zoneUserFinanceSource"> 
									<label for="zoneUserFinanceSource1"> <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">a.</span>Loan (Bank, Government, Private Institution)</p> </label> 
								</div> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserFinanceSource2" value="Personal Funds"<%=sezZoneFinancialInfo!=null &&sezZoneFinancialInfo.getFinanceSource().contains("Personal Funds")? "checked":StringPool.BLANK%> name="zoneUserFinanceSource"> 
									<label for="zoneUserFinanceSource2"> <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">b.</span>Personal Funds</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserFinanceSource3" value="Shareholders"<%=sezZoneFinancialInfo!=null &&sezZoneFinancialInfo.getFinanceSource().contains("Shareholders")? "checked":StringPool.BLANK%> name="zoneUserFinanceSource"> 
									<label for="zoneUserFinanceSource3"> <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">c.</span>Shareholders</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserFinanceSource4" value="Other"<%=sezZoneFinancialInfo!=null &&sezZoneFinancialInfo.getFinanceSource().contains("Other")? "checked":StringPool.BLANK%> name="zoneUserFinanceSource"> 
									<label for="zoneUserFinanceSource4"> <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">d.</span>Other</p> </label> 
								</div> 
							</div> 
						</div>
						<div class="col-md-12 hide" id="zoneUserOtherFinanceSourceBox">
							<div class="form-group">
								<p class="tab-form-main-heading">Please Specify</p>
								<input type="text" class="form-control" id="zoneUserOtherFinanceSource" placeholder="Please Specify Other Source(s) of finance" 
								value="<%=Validator.isNotNull(sezZoneFinancialInfo) &&Validator.isNotNull(sezZoneFinancialInfo.getOtherFinanceSource())?sezZoneFinancialInfo.getOtherFinanceSource():""%>">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="zoneInvestmentInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep23">
			<input id="zoneUserLabourReqCounter" type="hidden" name="zoneUserLabourReqCounter" value="1">
			<div class="tab-form">
				<div class="employment-plan-info-form">
					<div class="row">
					<div class="col-md-12"> 
                          <p class="tab-form-title f2">Employment Information</p> 
                          </div>
						<div class="col-md-12">
							<div class="accordion secured-accordian" id="addZoneUserLabourReqBox">
								<div class="accordion__header is-active"  id="addZoneUserLabourReq" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>17. Projected labour requirement over a three year period</h2>
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
												<p class="tab-form-main-heading">Year</p>
												<input type="text" class="form-control numeric-field" id="zoneUserLabourYear"
													aria-describedby="zoneUserLabourYear" placeholder=""
													oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
													value="">
													<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserLabourYearValidation" style="color: red;">Only Numeric characters are allowed</p>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<p class="tab-form-main-heading">Direct</p>
												<input type="text" class="form-control numeric-field" id="zoneUserLabourDirect"
													aria-describedby="zoneUserLabourDirect" placeholder=""
													oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
													value="">
													<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserLabourDirectValidation" style="color: red;">Only Numeric characters are allowed</p>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<p class="tab-form-main-heading">Male</p>
												<input type="text" class="form-control numeric-field" id="zoneUserLabourMale"
													aria-describedby="zoneUserLabourMale" placeholder=""
													oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
													value="">
													<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserLabourMaleValidation" style="color: red;">Only Numeric characters are allowed</p>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<p class="tab-form-main-heading">Female</p>
												<input type="text" class="form-control numeric-field " id="zoneUserLabourFemale"
													aria-describedby="zoneUserLabourFemale" placeholder=""
													oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
													value="">
													<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserLabourFemaleValidation" style="color: red;">Only Numeric characters are allowed</p>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<p class="tab-form-main-heading">Local</p>
												<input type="text" class="form-control numeric-field" id="zoneUserLabourLocal"
													aria-describedby="zoneUserLabourLocal" placeholder=""
													oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
													value="">
													<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserLabourLocalValidation" style="color: red;">Only Numeric characters are allowed</p>
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<p class="tab-form-main-heading">Foreign</p>
												<input type="text" class="form-control numeric-field" id="zoneUserLabourForeign"
													aria-describedby="zoneUserLabourForeign" placeholder=""
													oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
													value="">
													<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserLabourForeignValidation" style="color: red;">Only Numeric characters are allowed</p>
											</div>
										</div>
									</div>
								</div>
							</div>			
						</div>
						<div class="col-md-12 d-flex justify-content-end py-4"> 
						<a href="javascript:void(0);" class="add-more-employee" id="addOneMorZoneUserLabourReqBox" onclick="addZoneUserLabourReqBox();"> <span>+ 1</span> Add More</a> 
						</div>
						<div class="col-12 table-responsive hide zoneUserLabourReqTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="zoneUserLabourReqTable">
									<tr>
										<th class="sub_heading">Year</th>
										<th class="sub_heading">Direct</th>
										<th class="sub_heading">Male</th>
										<th class="sub_heading">Female</th>
										<th class="sub_heading">Local</th>
										<th class="sub_heading">Foreign</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
									<% if(Validator.isNotNull(sezZoneEmpInfo)&&sezZoneEmpInfo.size()>0){
									for(SezZoneEmployInfo sezZoneEmpValues:sezZoneEmpInfo){
									%>
									<tr>
										<td class="sub_heading_content zoneUserLabourYear<%=zoneUserLabourReqCounter%>">
										<%=Validator.isNotNull(sezZoneEmpValues)&&Validator.isNotNull(sezZoneEmpValues.getLabourRequirementYear())?sezZoneEmpValues.getLabourRequirementYear():"" %>
										</td>
										<td class="sub_heading_content zoneUserLabourDirect<%=zoneUserLabourReqCounter%>">
										<%=Validator.isNotNull(sezZoneEmpValues)&&Validator.isNotNull(sezZoneEmpValues.getLabourRequirementDirect())?sezZoneEmpValues.getLabourRequirementDirect():"" %>
										</td>
										<td class="sub_heading_content zoneUserLabourMale<%=zoneUserLabourReqCounter%>">
										<%=Validator.isNotNull(sezZoneEmpValues)&&Validator.isNotNull(sezZoneEmpValues.getLabourRequirementMale())?sezZoneEmpValues.getLabourRequirementMale():"" %>
										</td>
										<td class="sub_heading_content zoneUserLabourFemale<%=zoneUserLabourReqCounter%>">
										<%=Validator.isNotNull(sezZoneEmpValues)&&Validator.isNotNull(sezZoneEmpValues.getLabourRequirementFemale())?sezZoneEmpValues.getLabourRequirementFemale():"" %>
										</td>
										<td class="sub_heading_content zoneUserLabourLocal<%=zoneUserLabourReqCounter%>">
										<%=Validator.isNotNull(sezZoneEmpValues)&&Validator.isNotNull(sezZoneEmpValues.getLabourRequirementLocal())?sezZoneEmpValues.getLabourRequirementLocal():"" %>
										</td>
										<td class="sub_heading_content zoneUserLabourForeign<%=zoneUserLabourReqCounter%>">
										<%=Validator.isNotNull(sezZoneEmpValues)&&Validator.isNotNull(sezZoneEmpValues.getLabourRequirementForeign())?sezZoneEmpValues.getLabourRequirementForeign():"" %>
										</td>
										<td> 
											<span> 
												<a href="javascript:void(0)" onclick="zoneUserLabourReqEditTab('<%=zoneUserLabourReqCounter%>');"> 
											        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
											         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
											        </svg> 
											      </a> 
											  </span>
									     </td>
									     <td> 
											  <span> 
													<a href="javascript:void(0)" onclick="zoneUserLabourReqDeleteData('<%=zoneUserLabourReqCounter%>');"> 
												        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
												        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
												        </svg>
												      </a> 
											  </span>  
                                         </td>
									</tr>
									<input id="sezZoneEmpInfoId<%=zoneUserLabourReqCounter%>" name="sezZoneEmpInfoId<%=zoneUserLabourReqCounter%>" val="<%=sezZoneEmpValues.getSezZoneEmpInfoId()%>" type="hidden"/>
									<%zoneUserLabourReqCounter  = zoneUserLabourReqCounter+1;
									}
									}%>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="zoneEmploymentInfo(false); nextButtonCall();"
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
		<div class="tab-pane" role="tabpanel" id="childStep24">
			<div class="tab-form">
				<div class="zone-undertaking-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Zone User's Undertaking</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6"> 
								<div class="form-group "> 
								     <p class="tab-form-main-heading">Title of declarant for Zone User application</p> 
								     <div class="select-wrapper position-relative">
								       	<select class="form-select form-control" id="zoneUserDeclarantTitle" name=""> 
								       		<option value="" disabled="" selected="">Please Select</option> 
								       		<option value="Mr."
								       		<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantTitle().equals("Mr."))?"selected":"" %>>
								       		Mr.</option> 
								       		<option value="Ms."
								       		<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantTitle().equals("Ms."))?"selected":"" %>>
								       		Ms.</option> 
								       		<option value="Mrs."
								       		<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantTitle().equals("Mrs."))?"selected":"" %>>
								       		Mrs.</option> 
								       	</select> 
								    </div>
	                          </div> 
                         </div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of declarant for Zone User application*</p>
								<input type="text" class="form-control" id="zoneUserDeclarantName" placeholder=""
									value="<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantName())?sezZoneUserUnderInfo.getDeclarantName():"" %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserDeclarantNameValidation" style="color: red;">
			                    Please Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone No.</p>
								<input type="text" class="form-control" id="zoneUserDeclarantTeleNum" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantTeleNum())?sezZoneUserUnderInfo.getDeclarantTeleNum():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">E-mail Address*</p>
								<input type="text" class="form-control" id="zoneUserDeclarantEmail" placeholder=""
									value="<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getDeclarantEmail())?sezZoneUserUnderInfo.getDeclarantEmail():"" %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserDeclarantEmailValidation" style="color: red;"></p>
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
							<div class="signature_texarea mb-2" id="zone-user-applicant-sign-image-holder">
							<%if(Validator.isNotNull(zoneUndertakingSign)){ %>
							<img src="<%=zoneUndertakingSign%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="zone-user-applicant-signature-upload-btn" hidden="" name="<portlet:namespace/>zone-user-applicant-signature-upload-btn">
							<label for="zone-user-applicant-signature-upload-btn" class="choose-sign-btn"> 
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
								<input type="date" max="9999-12-31" class="form-control" id="zone-user-applicant-signature-date" 
								value="<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getApplicantSignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneUserUnderInfo.getApplicantSignatureDate()):"" %>" placeholder=""> 
							</div> 
						</div>
						<div class="col-md-7">
							<div class="form-group">
								<p class="tab-form-main-heading">Notary Public Name*</p>
								<input type="text" class="form-control" id="zoneUserPublicNotaryName" placeholder=""
									value="<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getPublicNotaryName())?sezZoneUserUnderInfo.getPublicNotaryName():"" %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="zoneUserPublicNotaryNameValidation" style="color: red;">
			                    Please Enter Name</p>
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
							<div class="signature_texarea mb-2" id="zone-user-public-notary-sign-image-holder">
							<%if(Validator.isNotNull(zoneUndertakingNotarySign)){ %>
							<img src="<%=zoneUndertakingNotarySign%>"  width="100" height="100"/>
							<% }%>
							</div>
							<input type="file" id="zone-user-public-notary-signature-upload-btn" hidden="" name="<portlet:namespace/>zone-user-public-notary-signature-upload-btn">
							<label for="zone-user-public-notary-signature-upload-btn" class="choose-sign-btn"> 
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
								<input type="date" max="9999-12-31" class="form-control" id="zone-user-public-notary-signature-date"
								 value="<%=Validator.isNotNull(sezZoneUserUnderInfo)&&Validator.isNotNull(sezZoneUserUnderInfo.getPublicNotarySignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneUserUnderInfo.getPublicNotarySignatureDate()):"" %>" placeholder=""> 
							</div> 
						</div>
					</div>
				</div>
			</div>
			<button type="button" onclick="zoneZoneUserUndertakingInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep25">
			<div class="tab-form">
				<div class="zone-dev-undertaking-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Developer's Undertaking</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Developers Name*</p>
								<input type="text" class="form-control" id="zoneDevUndertakingDevName" placeholder=""
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeveloperName())?sezZoneDevUnderInfo.getDeveloperName():""%>">
								<p class="tab-form-sub-heading fieldAlert hide" id="zoneDevUndertakingDevNameValidation" style="color: red;">
			                    Please Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Letter of Approval No.</p>
								<input type="text" class="form-control" id="zoneDevUndertakingApprLetter" placeholder=""
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getApprovalLetterNum())?sezZoneDevUnderInfo.getApprovalLetterNum():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="zoneDevUndertakingDate" placeholder=""
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getApprovalLetterDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneDevUnderInfo.getApprovalLetterDate()):""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">SEZ Developer's Agreement No.</p>
								<input type="text" class="form-control" id="zoneDevUndertakingAgreeNum" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeveloperAgreeNum())?sezZoneDevUnderInfo.getDeveloperAgreeNum():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="zoneDevUndertakingAgreeDate" placeholder=""
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeveloperAgreeDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneDevUnderInfo.getDeveloperAgreeDate()):""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">SEZ Developer's Control Number</p>
								<input type="text" class="form-control" id="zoneDevUndertakingControlNum" placeholder=""
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeveloperControlNum())?sezZoneDevUnderInfo.getDeveloperControlNum():""%>" 
									oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">Developer's signature and certification</p> 
						</div>
						<div class="col-md-6"> 
								<div class="form-group "> 
								     <p class="tab-form-main-heading">Title of declarant for Developer</p> 
								     <div class="select-wrapper position-relative">
								       	<select class="form-select form-control" id="zoneDevApplicantTitle" name=""> 
								       		<option value="" disabled="" selected="">Please Select</option> 
								       		<option value="Mr."
								       		<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeclarantTitle().equals("Mr."))?"selected":""%>>
								       		Mr.</option> 
								       		<option value="Ms."
								       		<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeclarantTitle().equals("Ms."))?"selected":""%>>
								       		Ms.</option> 
								       		<option value="Mrs."
								       		<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeclarantTitle().equals("Mrs."))?"selected":""%>>
								       		Mrs.</option> 
								       	</select> 
								    </div>
	                          </div> 
                         </div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of declarant for Developer*</p>
								<input type="text" class="form-control" id="zoneDevApplicantName" placeholder=""
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeclarantName())?sezZoneDevUnderInfo.getDeclarantName():""%>">
								<p class="tab-form-sub-heading fieldAlert hide" id="zoneDevApplicantNameValidation" style="color: red;">
			                    Please Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone No.</p>
								<input type="text" class="form-control" id="zoneDevApplicantTele" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeclarantTelephoneNum())?sezZoneDevUnderInfo.getDeclarantTelephoneNum():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">E-mail Address*</p>
								<input type="text" class="form-control" id="zoneDevApplicantEmail" placeholder=""
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getDeclarantEmail())?sezZoneDevUnderInfo.getDeclarantEmail():""%>">
								<p class="tab-form-sub-heading fieldAlert hide" id="zoneDevApplicantEmailValidation" style="color: red;"></p>
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
							<div class="signature_texarea mb-2" id="zone-user-dev-applicant-sign-image-holder">
							<%if(Validator.isNotNull(zoneDeveloperSign)){ %>
							<img src="<%=zoneDeveloperSign%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="zone-user-dev-applicant-signature-upload-btn" hidden="" name="<portlet:namespace/>zone-user-dev-applicant-signature-upload-btn">
							<label for="zone-user-dev-applicant-signature-upload-btn" class="choose-sign-btn"> 
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
								<input type="date" max="9999-12-31" class="form-control" id="zone-dev-applicant-signature-date" 
								value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getSignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneDevUnderInfo.getSignatureDate()):""%>" placeholder=""> 
							</div> 
						</div>
						<div class="col-md-7">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Notary Public/Justice of the Peace*</p>
								<input type="text" class="form-control" id="zoneDevPublicNotaryName" placeholder=""
									value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getPublicNotaryName())?sezZoneDevUnderInfo.getPublicNotaryName():""%>">
								<p class="tab-form-sub-heading fieldAlert hide" id="zoneDevPublicNotaryNameValidation" style="color: red;">
			                    Please Enter Name</p>
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
							<div class="signature_texarea mb-2" id="zone-user-dev-public-notary-sign-image-holder">
							<%if(Validator.isNotNull(zoneDEveloperNotarySign)){ %>
							<img src="<%=zoneDEveloperNotarySign%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="zone-user-dev-public-notary-signature-upload-btn" hidden="" name="<portlet:namespace/>zone-user-dev-public-notary-signature-upload-btn">
							<label for="zone-user-dev-public-notary-signature-upload-btn" class="choose-sign-btn"> 
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
								<input type="date" max="9999-12-31" class="form-control" id="zone-dev-public-notary-signature-date" 
								value="<%=Validator.isNotNull(sezZoneDevUnderInfo)&&Validator.isNotNull(sezZoneDevUnderInfo.getPublicNotarySignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneDevUnderInfo.getPublicNotarySignatureDate()):""%>" placeholder=""> 
							</div> 
						</div>
					</div>
				</div>
			</div>
			<button type="button" onclick="zoneDeveloperUndertakingInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep26">
			<div class="tab-form">
				<div class="submission-checklist-info-form">
					<div class="row">
					<div class="col-md-12"> 
                          <p class="tab-form-title f2">Submission checklist</p> 
                          </div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">General</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserGeneralReq1" value="Application Fee (non-refundable): US$100" name="zoneUserGeneralReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getGeneralRequirement())&&(sezZoneSubCheckInfo.getGeneralRequirement().equals("Application Fee (non-refundable): US$100"))?"checked":""%>> 
									<label for="zoneUserGeneralReq1"> <p class="tab-form-main-heading mb-0">Application Fee (non-refundable): US$100</p> </label> 
									<p class="tab-form-sub-heading pl-4 ml-3">Zone User Authorization is generally provided for a specific period. No annual fees will be required. However, should the Zone User require continued authorization for operation with the Special Economic Zone, a new application and payment of the non-refundable application fee will be required.</p>
								</div> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserGeneralReq2" value="Completed Data Capture Form" name="zoneUserGeneralReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getGeneralRequirement())&&(sezZoneSubCheckInfo.getGeneralRequirement().equals("Completed Data Capture Form"))?"checked":""%>> 
									<label for="zoneUserGeneralReq2"> <p class="tab-form-main-heading mb-0">Completed Data Capture Form</p> </label> 
								</div> 
							</div> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">Company Information</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserComInfoReq1" value="Certified copy of the company's Memorandum or Articles of Association" name="zoneUserComInfoReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getCompanyInformation())&&(sezZoneSubCheckInfo.getCompanyInformation().contains("Certified copy of the company's Memorandum or Articles of Association"))?"checked":""%>> 
									<label for="zoneUserComInfoReq1"> <p class="tab-form-main-heading mb-0">Certified copy of the company's Memorandum or Articles of Association</p> </label> 
								</div> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserComInfoReq2" value="Certified copy of Certificate of Incorporation" name="zoneUserComInfoReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getCompanyInformation())&&(sezZoneSubCheckInfo.getCompanyInformation().contains("Certified copy of Certificate of Incorporation"))?"checked":""%>> 
									<label for="zoneUserComInfoReq2"> 
									<p class="tab-form-main-heading mb-0">Certified copy of Certificate of Incorporation</p> 
									</label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserComInfoReq3" value="Certified copy of Business registration if the applicant is not incorporated" name="zoneUserComInfoReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getCompanyInformation())&&(sezZoneSubCheckInfo.getCompanyInformation().contains("Certified copy of Business registration if the applicant is not incorporated"))?"checked":""%>> 
									<label for="zoneUserComInfoReq3"> 
									<p class="tab-form-main-heading mb-0">Certified copy of Business' registration; if the applicant is not incorporated</p> 
									</label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserComInfoReq4" value="Certified copy of Tax Registration Number (TRN)" name="zoneUserComInfoReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getCompanyInformation())&&(sezZoneSubCheckInfo.getCompanyInformation().contains("Certified copy of Tax Registration Number (TRN)"))?"checked":""%>> 
									<label for="zoneUserComInfoReq4"> <p class="tab-form-main-heading mb-0">Certified copy of Tax Registration Number (TRN)</p> 
									</label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserComInfoReq5" value="Certified copy of the General Consumption Tax (GCT) number" name="zoneUserComInfoReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getCompanyInformation())&&(sezZoneSubCheckInfo.getCompanyInformation().contains("Certified copy of the General Consumption Tax (GCT) number"))?"checked":""%>> 
									<label for="zoneUserComInfoReq5"> <p class="tab-form-main-heading mb-0">Certified copy of the General Consumption Tax (GCT) number; if applicable</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserComInfoReq6" value="Brief of business activities" name="zoneUserComInfoReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getCompanyInformation())&&(sezZoneSubCheckInfo.getCompanyInformation().contains("Brief of business activities"))?"checked":""%>> 
									<label for="zoneUserComInfoReq6"> <p class="tab-form-main-heading mb-0">Brief of business activities.</p> </label> 
									<p class="tab-form-sub-heading pl-4 ml-3">See "Zone User Business Proposal Template" provided.</p>
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserComInfoReq7" value="Plan of logistics and security arrangements; if retail activities will be undertaken by the Zone User within the Special Economic Zone" name="zoneUserComInfoReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getCompanyInformation())&&(sezZoneSubCheckInfo.getCompanyInformation().contains("Plan of logistics and security arrangements; if retail activities will be undertaken by the Zone User within the Special Economic Zone"))?"checked":""%>> 
									<label for="zoneUserComInfoReq7"> <p class="tab-form-main-heading mb-0">Plan of logistics and security arrangements; if retail activities will be undertaken by the Zone User within the Special Economic Zone. </p> </label> 
									<p class="tab-form-sub-heading pl-4 ml-3">See "General Security Guidelines" provided.</p>
								</div>
							</div> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">Sworn Statements</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserSwornStateReq1" value="An affidavit setting out all relevant commercial information of the Zone User applicant, including its name, address, nationality, owners, board of directors (or equivalent management committee), auditors, bankers, as well as the capital ownership shares of the applicant" name="zoneSwornStateReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getSwornState())&&(sezZoneSubCheckInfo.getSwornState().contains("An affidavit setting out all relevant commercial information of the Zone User applicant, including its name, address, nationality, owners, board of directors (or equivalent management committee), auditors, bankers, as well as the capital ownership shares of the applicant"))?"checked":""%>> 
									<label for="zoneUserSwornStateReq1"> <p class="tab-form-main-heading mb-0">An affidavit setting out all relevant commercial information of the Zone User applicant, including its name, address, nationality, owners, board of directors (or equivalent management committee), auditors, bankers, as well as the capital ownership shares of the applicant.</p> </label> 
								</div> 
							</div> 
							<p class="tab-form-main-heading mb-0">See "Company Affidavit" or "Sole Proprietorship Affidavit" provided by Developer Kit.</p> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">Occupancy Requirement</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserOccupancyReq1" value="Copy of lease agreement" name="zoneOccupancyReq"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getOccupancyRequirement())&&(sezZoneSubCheckInfo.getOccupancyRequirement().contains("Copy of lease agreement"))?"checked":""%>> 
									<label for="zoneUserOccupancyReq1"> <p class="tab-form-main-heading mb-0">Copy of lease agreement</p> </label> 
								</div> 
							</div> 
							<p class="tab-form-main-heading mb-0">See "Company Affidavit" or "Sole Proprietorship Affidavit" provided by Developer Kit.</p> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">Approvals</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserApprovals1" value="Certified copy of the Fire Safety Certificate" name="zoneUserApprovals"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getApprovals())&&(sezZoneSubCheckInfo.getApprovals().contains("Certified copy of the Fire Safety Certificate"))?"checked":""%>> 
									<label for="zoneUserApprovals1"> <p class="tab-form-main-heading mb-0">Certified copy of the Fire Safety Certificate</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="zoneUserApprovals2" value="Certified copy of the relevant environment permit" name="zoneUserApprovals"
									<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getApprovals())&&(sezZoneSubCheckInfo.getApprovals().contains("Certified copy of the relevant environment permit"))?"checked":""%>> 
									<label for="zoneUserApprovals2"> <p class="tab-form-main-heading mb-0">Certified copy of the relevant environment permit; if applicable</p> </label> 
								</div>
							</div> 
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">I have reviewed and submitted the documents highlighted in the checklist as a part of an application for Special Economic Zone designation.</p> 
						</div>
						<div class="col-md-6"> 
							<div class="form-group"> 
								<p class="tab-form-main-heading">Name</p> 
								<input type="text" class="form-control" id="zoneUserNameReq" placeholder="" 
								value="<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getSignatureName())?sezZoneSubCheckInfo.getSignatureName():""%>"> 
							</div> 
						</div>
						<div class="col-md-6"> 
							<div class="form-group"> 
								<p class="tab-form-main-heading">Date</p> 
								<input type="date" max="9999-12-31" class="form-control" id="zoneUserDateReq" 
								value="<%=Validator.isNotNull(sezZoneSubCheckInfo)&&Validator.isNotNull(sezZoneSubCheckInfo.getSignatureDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezZoneSubCheckInfo.getSignatureDate()):""%>" placeholder=""> 
							</div> 
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>			
							<div class="signature_texarea mb-2" id="zone-user-sign-req-image-holder">
							<%if(Validator.isNotNull(zoneSubmissionSign)){ %>
							<img src="<%=zoneSubmissionSign%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="zone-user-sign-req-upload-btn" hidden="" name="<portlet:namespace/>zone-user-sign-req-upload-btn">
							<label for="zone-user-sign-req-upload-btn" class="choose-sign-btn"> 
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