<%@page import="java.util.Date"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantUserUndertakingInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBox"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.sez.status.application.form.service.service.SezOccupanteSubmissionChecklistInfoLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo"%>
<%@page import="com.nbp.sez.status.application.form.category.occupant.SezOccupantSubmissionCheckListResourceCommand"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.sez.status.upload.document.commands.GettingDocumentData"%>
<%@ include file="/init.jsp" %>
<%
SezOccupantGeneralBussinessAddress addressOfCompany=null;
SezOccupantGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice=null;
SezOccupantGeneralBussinessAddress addressOfAuthorisedRepresentative=null;
SezOccupantShareHoldingInfo shareHoldingInfo = null;
SezOccupantUserUndertakingInfo occupantUserUndertakingInfo=null;
SezOccupantInvestAndFinanceInfo investAndFinanceInfo =null;
SezOccupanteDeveloperUndertakingInfo developerUndertakingInfo=null;
SezOccupanteSubmissionChecklistInfo occSubmissionChecklistInfo=null;
String occuUnderTakingSign="";
String occuUnderTakingNotarySign="";
String occDeveloperTakingSign="";
String occDeveloperTakingNotary="";
String occChecklistsign="";
Date dateOccChecklist=null;
if(sezStatusApplicationId>0){
try {
	 developerUndertakingInfo= SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId); 
} catch (Exception e) {
}
try {
	 investAndFinanceInfo =	SezOccupantInvestAndFinanceInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId); 
} catch (Exception e) {
}
try {
	 occupantUserUndertakingInfo=SezOccupantUserUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId); 
}catch (Exception e) {
}
try {
	 addressOfCompany=SezOccupantGeneralBussinessAddressLocalServiceUtil.
			 getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Applicant Firm/Company"); 
} catch (Exception e) {
			
}
try {
	adddressSponsorOrRegisteredHeadOffice=SezOccupantGeneralBussinessAddressLocalServiceUtil.
			getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Sponsor/Registered Head Office"); 
} catch (Exception e) {
}
try {
	 addressOfAuthorisedRepresentative=SezOccupantGeneralBussinessAddressLocalServiceUtil.
			getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Authorised Representative"); 
} catch (Exception e) {
}
try {
 shareHoldingInfo = SezOccupantShareHoldingInfoLocalServiceUtil.getSezStatusBy_App_Id(sezStatusApplicationId); 
}catch (Exception e) {
}
try {
	occSubmissionChecklistInfo = SezOccupanteSubmissionChecklistInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
	dateOccChecklist=new SimpleDateFormat("yyyy-MM-dd").parse(occSubmissionChecklistInfo.getOccDateReq());
}catch (Exception e) {
}
try{
	occuUnderTakingSign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Occupant Zone Undertaking", themeDisplay.getScopeGroupId(), sezStatusApplicationId);	
}catch(Exception e){}
try{
	occuUnderTakingNotarySign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Occupant Zone Undertaking Notary", themeDisplay.getScopeGroupId(), sezStatusApplicationId);	
}catch(Exception e){}
try{
	occDeveloperTakingSign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Occupant Developer Undertaking Stamp", themeDisplay.getScopeGroupId(), sezStatusApplicationId);	
}catch(Exception e){}
try{
	occDeveloperTakingNotary=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Occupant Developer Undertaking Notary", themeDisplay.getScopeGroupId(), sezStatusApplicationId);	
}catch(Exception e){}
try{
	occChecklistsign=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature of Occupant Submission Checklist Stamp", themeDisplay.getScopeGroupId(), sezStatusApplicationId);	
}catch(Exception e){}
}
%>
<div class="hide" id="sezOccApplicationForm">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep11">
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
			                    <input type="date" class="form-control" id="occAppDate" value="<%=Validator.isNotNull(bussinessInfo)&&Validator.isNotNull(bussinessInfo.getOccAppDate())?new SimpleDateFormat("yyyy-MM-dd").format(bussinessInfo.getOccAppDate()):""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading" for="occSezDevName"><span class="tab-form-highlghtme-link pr-2">2.</span>Name of SEZ Developer*</p>
			                    <input type="text" class="form-control" id="occSezDevName"
			                        placeholder="" value="<%=Validator.isNotNull(bussinessInfo)&&Validator.isNotNull(bussinessInfo.getOccSezDevName())?bussinessInfo.getOccSezDevName():""%>">
			                    <p class="tab-form-sub-heading fieldAlert hide"
			                        id="occSezDevNameValidation" style="color: red;">Please Enter
			                         Name</p>
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>SEZ Developer's Control Number</p>
			                    <input type="text" class="form-control" id="occSezDevControlNum"
			                    oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
			                    placeholder="" value="<%=Validator.isNotNull(bussinessInfo)&&Validator.isNotNull(bussinessInfo.getOccSezDevControlNum())?bussinessInfo.getOccSezDevControlNum():""%>">
			                </div>
			            </div>
			            <div class="col-md-12"> 
			                <p class="tab-form-title-subtitle f2">4. Name and full address of applicant firm/ company</p> 
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Company Name</p>
			                    <input type="text" class="form-control" id="occCompanyName"
			                        placeholder="" value="<%=Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getOccName())?addressOfCompany.getOccName():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Building No. and Street Address</p>
			                    <input type="text" class="form-control" id="occCompanyStreetAddress" placeholder=""
                        value="<%=Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getOccStreetAddress())?addressOfCompany.getOccStreetAddress():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Town/City</p>
			                    <input type="text" class="form-control" id="occCompanyTown" placeholder=""
                        value="<%=Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getOccTown())?addressOfCompany.getOccTown():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			               <%--  <div class="form-group">
			                    <p class="tab-form-main-heading">Parish</p>
			                    <input type="text" class="form-control" id="occCompanyParish" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfCompany)&&Validator.isNotNull(addressOfCompany.getOccParish())?addressOfCompany.getOccParish():""%>">
			                </div> --%>
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="occCompanyParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=addressOfCompany!=null?addressOfCompany.getOccParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
			            </div>
			            <div class="col-md-12"> 
			                <p class="tab-form-title-subtitle f2">5. Name and address of Authorised Representative applying on applicant's behalf</p> 
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Name*</p>
			                    <input type="text" class="form-control" id="occAuthRepName"
			                        placeholder="" value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccName())?addressOfAuthorisedRepresentative.getOccName():""%>">
			                        <p class="tab-form-sub-heading fieldAlert hide"
			                        id="occAuthRepNameValidation" style="color: red;">Please Enter
			                         Name</p>
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Building No. and Street Address</p>
			                    <input type="text" class="form-control" id="occAuthRepStreetAddress" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccStreetAddress())?addressOfAuthorisedRepresentative.getOccStreetAddress():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Town/City</p>
			                    <input type="text" class="form-control" id="occAuthRepTown" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccTown())?addressOfAuthorisedRepresentative.getOccTown():""%>">
			                </div>
			            </div>
			           <%--  <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Parish/Post /Zip Code</p>
			                    <input type="text" class="form-control" id="occAuthRepZipCode" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccParish())?addressOfAuthorisedRepresentative.getOccParish():""%>">
			                </div>
			            </div> --%>
			             <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="occAuthRepZipCode">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=addressOfAuthorisedRepresentative!=null?addressOfAuthorisedRepresentative.getOccParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Country</p>
			                    <input type="text" class="form-control" id="occAuthRepCountry" placeholder=""
			                        value="<%=Validator.isNotNull(addressOfAuthorisedRepresentative)&&Validator.isNotNull(addressOfAuthorisedRepresentative.getOccCountry())?addressOfAuthorisedRepresentative.getOccCountry():""%>">
			                </div>
			            </div>
			            <div class="col-md-12"> 
			                <p class="tab-form-title-subtitle f2">6. State the name of the Sponsor /Registered Head Office in case local company is part of Multi-National Corporation (MNC)</p> 
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Company Name</p>
			                    <input type="text" class="form-control" id="occSponsorComName"
			                        placeholder="" value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccName())?adddressSponsorOrRegisteredHeadOffice.getOccName():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Building No. and Street Address</p>
			                    <input type="text" class="form-control" id="occSponsorStreetAddress" placeholder=""
                       value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccStreetAddress())?adddressSponsorOrRegisteredHeadOffice.getOccStreetAddress():""%>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Town/City</p>
			                    <input type="text" class="form-control" id="occSponsorTown" placeholder=""
			                        value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccTown())?adddressSponsorOrRegisteredHeadOffice.getOccTown():""%>">
			                </div>
			            </div>
			          <%--   <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Post/Zip Code</p>
			                    <input type="text" class="form-control" id="occSponsorZipCode" placeholder=""
			                        value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccParish())?adddressSponsorOrRegisteredHeadOffice.getOccName():""%>">
			                </div>
			            </div> --%>
			             <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="occSponsorZipCode">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=adddressSponsorOrRegisteredHeadOffice!=null?adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Country</p>
			                    <input type="text" class="form-control" id="occSponsorCountry" placeholder=""
			                        value="<%=Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice)&&Validator.isNotNull(adddressSponsorOrRegisteredHeadOffice.getOccCountry())?adddressSponsorOrRegisteredHeadOffice.getOccCountry():""%>">
			                </div>
			            </div>
			            <div class="col-md-12">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.</span>Are you an existing Jamaican Company under the Companies Act, 2004 (Act 10 of 2004)?</p>
			                    <div class="d-flex">
			                        <div class="wizard-form-radio d-block">
			                            <input value="Yes" type="radio"
			                              <%=Validator.isNotNull(bussinessInfo)
			                    &&Validator.isNotNull(bussinessInfo.getOccExistingCom())&&bussinessInfo.getOccExistingCom().equals("Yes")?"checked":""%>  name="occExistingCom"> <label for="">Yes</label>
			                        </div>
			                        <div class="wizard-form-radio d-block ml-3">
			                            <input value="No" type="radio"  <%=Validator.isNotNull(bussinessInfo)
			                    &&Validator.isNotNull(bussinessInfo.getOccExistingCom())&&bussinessInfo.getOccExistingCom().equals("No")?"checked":""%>
			                                name="occExistingCom"> <label for="">No</label>
			                        </div>
			                    </div>
			                </div>
			            </div>
			        </div>
			        <div class="row hide" id="occExistingComBox">
			            <div class="col-md-12 pt-3"> 
			                   <p class="common-section-small-heading mb-0"><span class="tab-form-highlghtme-link pr-2">8.</span>Please select the form of the articles of incorporation</p> 
			            </div>
			            <div class="col-lg-12">
			                <div class="form-group">
			                    <div class="select-wrapper position-relative">
			                        <select class="form-select form-control" id="occFormArticle">
			                            <option value="" selected="" disabled="">Please select</option>
			                            <option value="A company limited by shares" <%=Validator.isNotNull(bussinessInfo)
			                    &&Validator.isNotNull(bussinessInfo.getOccFormArticle().contains("A company limited by shares"))?"selected":""%>>A company limited by shares</option>
			                            <option value="A company limited by guarantee and not having a share capital" <%=Validator.isNotNull(bussinessInfo)
			                    &&Validator.isNotNull(bussinessInfo.getOccFormArticle().contains("A company limited by guarantee and not having a share capital"))?"selected":""%>>
			                            A company limited by guarantee and not having a share capital</option>
			                            <option value="An unlimited company having a share capital" <%=Validator.isNotNull(bussinessInfo)
			                    &&Validator.isNotNull(bussinessInfo.getOccFormArticle().contains("An unlimited company having a share capital"))?"selected":""%>
			                            >An unlimited company having a share capital</option>
			                            <option value="Partnership" <%=Validator.isNotNull(bussinessInfo)
			                    &&Validator.isNotNull(bussinessInfo.getOccFormArticle().contains("Partnership"))?"selected":""%>
			                            >Partnership</option>
			                            <option value="Sole Proprietor" <%=Validator.isNotNull(bussinessInfo)
			                    &&Validator.isNotNull(bussinessInfo.getOccFormArticle().contains("Sole Proprietor"))?"selected":""%>
			                            >Sole Proprietor</option>
			                            <option value="Other" <%=Validator.isNotNull(bussinessInfo)
			                    &&Validator.isNotNull(bussinessInfo.getOccFormArticle().contains("Other"))?"selected":""%>
			                            >Other (please specify)</option>
			                        </select>
			                    </div>
			                </div>
			            </div>
			            <div class="col-md-12 hide" id="occFormArticleOtherBox">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Please specify</p>
			                    <input type="text" class="form-control" id="occFormArticleOther" placeholder="Please specify Other form of the articles of incorporation"
			                        value="<%=Validator.isNotNull(bussinessInfo)&&Validator.isNotNull(bussinessInfo.getOccFormArticleOther())?bussinessInfo.getOccFormArticleOther():""%>">
			                </div>
			            </div>
			        </div>
			        <div class="row">
			            <div class="col-md-4">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>Taxpayer Registration Number (TRN)</p>
			                    <input type="text" class="form-control" id="occTRN" placeholder=""
			                    oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
			                        value="<%=Validator.isNotNull(bussinessInfo)&&Validator.isNotNull(bussinessInfo.getOccTRN())?bussinessInfo.getOccTRN():""%>">
			                </div>
			            </div>
			            <div class="col-md-4">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>General Consumption Tax Number (GCT)</p>
			                    <input type="text" class="form-control" id="occGCT" placeholder=""
			                    oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
			                        value="<%=Validator.isNotNull(bussinessInfo)&&Validator.isNotNull(bussinessInfo.getOccGCT())?bussinessInfo.getOccGCT():""%>">
			                </div>
			            </div>
			            <div class="col-md-4">
			                <div class="form-group">
			                    <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span>Tax Compliance Certificate Number (TCC)</p>
			                    <input type="text" class="form-control" id="occTCC" placeholder=""
			                    oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
			                        value="<%=Validator.isNotNull(bussinessInfo)&&Validator.isNotNull(bussinessInfo.getOccTCC())?bussinessInfo.getOccTCC():""%>">
			                </div>
			            </div>
			        </div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="occupantGeneralBusinessInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep12">
		    <div class="tab-form">
		        <div class="shareholder-info-form">
		            <div class="row">
		                <div class="col-md-12"> 
		                    <p class="tab-form-title f2">Shareholding / Partnership / Director Information</p>
		                    <p class="tab-form-title-subtitle f2">12. Equity/Share Capital participation including Foreign Investment (in US$)</p> 
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-4">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">a.</span>Authorised</p>
		                        <input type="text" class="form-control numeric-field" id="occAuthorised"
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                            placeholder="US$" value="<%=Validator.isNotNull(shareHoldingInfo)&&Validator.isNotNull(shareHoldingInfo.getOccAuthorised())?shareHoldingInfo.getOccAuthorised():""%>">
		                            <p class="tab-form-sub-heading fieldAlert hide" id="occAuthorisedValidation" style="color: red;">Only Numeric characters are allowed</p>
		                    </div>
		                </div>
		                <div class="col-md-4">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">b.</span>Subscribed</p>
		                        <input type="text" class="form-control numeric-field" id="occSubscribed"
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                            placeholder="US$" value="<%=Validator.isNotNull(shareHoldingInfo)&&Validator.isNotNull(shareHoldingInfo.getOccSubscribed())?shareHoldingInfo.getOccSubscribed():""%>">
		                            <p class="tab-form-sub-heading fieldAlert hide" id="occSubscribedValidation" style="color: red;">Only Numeric characters are allowed</p>
		                    </div>
		                </div>
		                <div class="col-md-4">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">c.</span>Paid up capital</p>
		                        <input type="text" class="form-control numeric-field" id="occPaidCapital"
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                            placeholder="US$" value="<%=Validator.isNotNull(shareHoldingInfo)&&Validator.isNotNull(shareHoldingInfo.getOccPaidCapital())?shareHoldingInfo.getOccPaidCapital():""%>">
		                            <p class="tab-form-sub-heading fieldAlert hide" id="occPaidCapitalValidation" style="color: red;">Only Numeric characters are allowed</p>
		                    </div>
		                </div>
		            </div>
		            <div class="row">
		            	<input id="occDirectorDetailVal" type="hidden" name="occDirectorDetailVal" value="1">
						<div class="col-md-12">
							<div class="accordion secured-accordian" id="addOccDirectorDetailBox ">
								<div class="accordion__header is-active"  id="addOccDirectorDetail" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>13. Details of each Director/Partner/Sponsor</h2>
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
												<p class="tab-form-main-heading" for="directorName">Name</p>
												<input type="text" class="form-control" id="directorName"
													placeholder="" value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Building No. and Street Address</p>
												<input type="text" class="form-control" id="directorStreetAddress" placeholder=""
													value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Zip/Postal Code</p>
												<input type="text" class="form-control" id="directorZipCode" placeholder=""
													value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Country</p>
												<input type="text" class="form-control" id="directorCountry" placeholder=""
													value="">
											</div>
										</div>
									</div>
								</div>
							</div>			
						</div>
						<div class="col-md-12 d-flex justify-content-end py-4"> 
						<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreOccDirectorDetail" onclick="addOccDirectorDetailBox();"> <span>+ 1</span> Add More</a> 
						</div>
						<div class="col-12 table-responsive hide occDirectorDetailTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="occDirectorDetailTable">
									<tr>
										<th class="sub_heading">Name</th>
										<th class="sub_heading">Building No. and Street Address</th>
										<th class="sub_heading">Zip/Postal Code</th>
										<th class="sub_heading">Country</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(sezDirectorOccSponsor!=null){
	long directorSponsorCounter=1;
	for(SezOccupantDirectorPartnerSponsorInfo sezDirectorSponsor:sezDirectorOccSponsor){
%>	<tr>
	<td class="sub_heading_content occDirectorName<%=directorSponsorCounter%>">
	<%=Validator.isNotNull(sezDirectorSponsor)&&Validator.isNotNull(sezDirectorSponsor.getOccDirectorName())?sezDirectorSponsor.getOccDirectorName():""%>
	</td>
	<td class="sub_heading_content occDirectorStreetAddress<%=directorSponsorCounter%>">
	<%=Validator.isNotNull(sezDirectorSponsor)&&Validator.isNotNull(sezDirectorSponsor.getOccDirectorStreetAddress())?sezDirectorSponsor.getOccDirectorStreetAddress():""%>
	</td>
	<td class="sub_heading_content occDirectorZipCode<%=directorSponsorCounter%>">
	<%=Validator.isNotNull(sezDirectorSponsor)&&Validator.isNotNull(sezDirectorSponsor.getOccDirectorZipCode())?sezDirectorSponsor.getOccDirectorZipCode():""%>
	</td>
	<td class="sub_heading_content occDirectorCountry<%=directorSponsorCounter%>">
	<%=Validator.isNotNull(sezDirectorSponsor)&&Validator.isNotNull(sezDirectorSponsor.getOccDirectorCountry())?sezDirectorSponsor.getOccDirectorCountry():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" onclick="occDirectorDetailEditTab('<%=directorSponsorCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg> 
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" onclick="occDirectorDeleteData('<%=directorSponsorCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="sez-app-director-id<%=directorSponsorCounter%>"  name="sez-app-director-id<%=directorSponsorCounter%>" value="<%=sezDirectorSponsor.getSezOccDirectSpoId()%>">
							<%
							directorSponsorCounter++;
							}
 }
						%>	
								</tbody>
							</table>
						</div>
					</div>
		            <div class="row">
		            	<input id="occDirectorShareholdersVal" type="hidden" name="occDirectorShareholdersVal" value="1">
						<div class="col-md-12">
							<div class="accordion secured-accordian" id="addOccDirectorShareholdersBox">
								<div class="accordion__header is-active"  id="addOccDirectorShareholders" onclick="expandDetails(this.id)">
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
										<div class="col-md-4">
											<div class="form-group">
												<p class="tab-form-main-heading">Shareholder Name</p>
												<input type="text" class="form-control" id="occShareholderName"
													aria-describedby="occShareholderName" placeholder=""
													value="">
											</div>
										</div>
		                                <div class="col-md-4">
											<div class="form-group">
												<p class="tab-form-main-heading">Nationality</p>
												<input type="text" class="form-control" id="occShareholderNationality"
													aria-describedby="occShareholderNationality" placeholder=""
													value="">
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<p class="tab-form-main-heading">No. of Shares</p>
												<input type="text" class="form-control" id="occShareholderShares"
													aria-describedby="occShareholderShares" placeholder=""
													oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
													value="">
											</div>
										</div>
									</div>
								</div>
							</div>			
						</div>
						<div class="col-md-12 d-flex justify-content-end py-4"> 
						<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreDirectorShareholder" onclick="addOccDirectorShareholdersBox();"> <span>+ 1</span> Add More</a> 
						</div>
						<div class="col-12 table-responsive hide occDirectorShareholderTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="occDirectorShareholderTable">
									<tr>
										<th class="sub_heading">Shareholder Name</th>
										<th class="sub_heading">Nationality</th>
										<th class="sub_heading">No. of Shares</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(sezOccupantShareHoldingInfos!=null){
	long occShareHolderCounter=1;
	for(SezOccupantPrincipleDirector sezShareHolderinfo:sezOccupantShareHoldingInfos){
%>	<tr>
	<td class="sub_heading_content occShareholderName<%=occShareHolderCounter%>">
	<%=Validator.isNotNull(sezShareHolderinfo)&&Validator.isNotNull(sezShareHolderinfo.getOccShareholderName())?sezShareHolderinfo.getOccShareholderName():""%>
	</td>
	<td class="sub_heading_content occShareholderNationality<%=occShareHolderCounter%>">
	<%=Validator.isNotNull(sezShareHolderinfo)&&Validator.isNotNull(sezShareHolderinfo.getOccShareholderNation())?sezShareHolderinfo.getOccShareholderNation():""%>
	</td>
	<td class="sub_heading_content occShareholderShares<%=occShareHolderCounter%>">
	<%=Validator.isNotNull(sezShareHolderinfo)&&Validator.isNotNull(sezShareHolderinfo.getOccShareholderShares())?sezShareHolderinfo.getOccShareholderShares():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" onclick="occDirectorShareholderEditTab('<%=occShareHolderCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg> 
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" onclick="occDirectorShareholderDeleteData('<%=occShareHolderCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="sez-app-shareholder-id<%=occShareHolderCounter%>"  name="sez-app-shareholder-id<%=occShareHolderCounter%>" value="<%=sezShareHolderinfo.getSezOccPrincDirectId()%>">
							<%
							occShareHolderCounter++;
							}
 }
						%>					
								</tbody>
							</table>
						</div>
					</div>
		            <div class="row">
		            	<input id="occPrincipalOfficersVal" type="hidden" name="occPrincipalOfficersVal" value="1">
						<div class="col-md-12">
							<div class="accordion secured-accordian" id="addOccPrincipalOfficersBox">
								<div class="accordion__header is-active"  id="addOccPrincipalOfficers" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>15. Principal officers</h2>
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
												<p class="tab-form-main-heading">Name</p>
												<input type="text" class="form-control" id="occPrincipalName"
													aria-describedby="occPrincipalName" placeholder=""
													value="">
											</div>
										</div>
		                                <div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Position</p>
												<input type="text" class="form-control" id="occPrincipalPosition"
													aria-describedby="occPrincipalPosition" placeholder=""
													value="">
											</div>
										</div>
									</div>
								</div>
							</div>			
							<div class="accordion secured-accordian" id="addOccPrincipalOfficersBox"></div>
						</div>
						<div class="col-md-12 d-flex justify-content-end py-4"> 
						<a href="javascript:void(0);" class="add-more-employee" id="addOneMoreDirectorShareholder" onclick="addOccPrincipalOfficersBox();"> <span>+ 1</span> Add More</a> 
						</div>
						<div class="col-12 table-responsive hide occPrincipalOfficersTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="occPrincipalOfficersTable">
									<tr>
										<th class="sub_heading">Name</th>
										<th class="sub_heading">Position</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(sezOccupantPrincipleOfficer!=null){
	long principleOccuOfficerCounter=1;
	for(SezOccupantPrincipleOfficer sezPrincipleOfficer:sezOccupantPrincipleOfficer){
%>	<tr>
	<td class="sub_heading_content occPrincipalName<%=principleOccuOfficerCounter%>">
	<%=Validator.isNotNull(sezPrincipleOfficer)&&Validator.isNotNull(sezPrincipleOfficer.getName())?sezPrincipleOfficer.getName():""%>
	</td>
	<td class="sub_heading_content occPrincipalPosition<%=principleOccuOfficerCounter%>">
	<%=Validator.isNotNull(sezPrincipleOfficer)&&Validator.isNotNull(sezPrincipleOfficer.getPosition())?sezPrincipleOfficer.getPosition():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" onclick="occPrincipalOfficersEditTab('<%=principleOccuOfficerCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg> 
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" onclick="occPrincipalOfficersDeleteData('<%=principleOccuOfficerCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="sez-app-principle-officer-id<%=principleOccuOfficerCounter%>"  name="sez-app-principle-officer-id<%=principleOccuOfficerCounter%>" value="<%=sezPrincipleOfficer.getSezOccPrincOffId()%>">
							<%
							principleOccuOfficerCounter++;
							}
 }
						%>		
								</tbody>
							</table>
						</div>
					</div>
		        </div>
		    </div>
		    <button type="button" id="saveName" onclick="occupantShareholdingInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep13">
		    <div class="tab-form">
		        <div class="business-plan-info-form">
		            <div class="row">
		                <div class="col-md-12">
		                    <p class="tab-form-title f2">Existing and /or Proposed Project Brief</p> 
		                    <p class="tab-form-title-subtitle f2"></p>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">16.</span>Brief description of business</p>
								<textarea rows="3" id="occBusinessDesc"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccBusinessDesc())?briefInfo.getOccBusinessDesc():""%></textarea>
							</div>
						</div>
		                <div class="col-md-12">
		                    <p class="tab-form-title-subtitle f2">Applicant is required to submit a Business Plan, including:</p>
		                    <ul class="list-group pl-5 ml-3"> 
		                        <li class="tab-form-main-heading list-group-item">A marketing plan detailing the markets into which the company proposes to sell its finished products or render its services.</li> 
		                        <li class="tab-form-main-heading list-group-item">Financial plan that establishes that the company has issued or paid up share capital at the effective date of either a master-concession or licence-agreement which is not less than US$25,000.</li>
		                        <li class="tab-form-main-heading list-group-item">Financial plan that establishes that the company has a minimum of US$50,000 invested in SEZ-related buildings, machines, equipment, facilities, and other necessary assets during the first year of operations.</li>
		                        <li class="tab-form-main-heading list-group-item">Estimated time schedule for the design, construction, and activation of the SEZ MSME Occupant's facilities.</li>
		                        <li class="tab-form-main-heading list-group-item">Estimated number and nationality of the workers, together with their skill levels, to be employed.</li>
		                        <li class="tab-form-main-heading list-group-item">Evidence that the proposed installations, activities, goods, materials, and waste will conform to all environmental, health, safety, and security laws in Jamaica.</li>
		                    </ul>
		                </div>
		                <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">17.</span>Has the applicant ever been denied approval to operate as a Free Zone or SEZ entity?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block"> 
									  <input value="Yes" 
									  <%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccDeniedFreeZoneAppr())&&(briefInfo.getOccDeniedFreeZoneAppr().equals("Yes"))?"checked":""%>
									  type="radio" name="occDeniedFreeZoneAppr"> 
										 <label for="">Yes</label> 
									</div> 
									<div class="wizard-form-radio d-block ml-3"> 
										 <input value="No"
										 <%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccDeniedFreeZoneAppr())&&(briefInfo.getOccDeniedFreeZoneAppr().equals("No"))?"checked":""%>
										 type="radio" name="occDeniedFreeZoneAppr"> 
										 <label for="">No</label> 
									</div>
								</div> 
							</div>
						</div>
		                <div class="col-md-6 occDeniedFreeZoneApprData hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of application</p>
								  <input type="date" max="9999-12-31" class="form-control" id="occDeniedFreeZoneApprDate" value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccDeniedFreeZoneApprDate())?new SimpleDateFormat("yyyy-MM-dd").format(briefInfo.getOccDeniedFreeZoneApprDate()):""%>" placeholder="">
							</div>
						</div>
		                <div class="col-md-6 occDeniedFreeZoneApprData hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Type of project proposed</p>
								<input type="text" class="form-control" id="occDeniedFreeZoneApprType" aria-describedby="occDeniedFreeZoneApprType" placeholder="" value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccDeniedFreeZoneApprType())?briefInfo.getOccDeniedFreeZoneApprType():""%>">
							</div>
						</div>
		                <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">18.</span>Does your company have any other location(s) with SEZ/Free Zone status?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block"> 
									  <input value="Yes" type="radio" 
									  	<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccFreeZoneLocation())&&
									  			briefInfo.getOccFreeZoneLocation().contains("Yes")
									  	?"checked":""%>
									  name="occFreeZoneLocation"> 
										 <label for="">Yes</label> 
									</div> 
									<div class="wizard-form-radio d-block ml-3"> 
										 <input value="No" type="radio" 
										 <%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccFreeZoneLocation())&&
									  			briefInfo.getOccFreeZoneLocation().contains("No")
									  	?"checked":""%>
										 name="occFreeZoneLocation"> 
										 <label for="">No</label> 
									</div>
								</div> 
							</div>
						</div>
		            </div>
		            <div class="row hide" id="occFreeZoneLocBox">
		            	<input id="occFreeZoneLocVal" type="hidden" name="occFreeZoneLocVal" value="1">
		                <div class="col-md-12">
		                    <div class="accordion secured-accordian" id="addOccFreeZoneLocBox">
		                        <div class="accordion__header is-active"  id="addOccFreeZoneLoc" onclick="expandDetails(this.id)">
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
		                                        <input type="text" class="form-control" id="occSezDevLoc"
		                                            aria-describedby="occSezDevLoc" placeholder=""
		                                            value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccSezDevLoc())?briefInfo.getOccSezDevLoc():""%>">
		                                    </div>
		                                </div>
		                                <div class="col-md-6">
		                                    <div class="form-group">
		                                        <p class="tab-form-main-heading">Description/Type of Activity</p>
		                                        <input type="text" class="form-control" id="occSezDevLocDesc"
		                                            aria-describedby="occSezDevLocDesc" placeholder=""
		                                            value=" <%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccSezDevLocDesc())?briefInfo.getOccSezDevLocDesc():""%>">
		                                    </div>
		                                </div>
		                            </div>
		                        </div>
		                    </div>			
		                    <div class="accordion secured-accordian" id="addOccFreeZoneLocBox"></div>
		                </div>
		                <div class="col-md-12 d-flex justify-content-end py-4"> 
		                <a href="javascript:void(0);" class="add-more-employee" id="addOneMoreOccFreeZoneLocBox" onclick="addOccFreeZoneLocBox();"> <span>+ 1</span> Add More</a> 
		                </div>
		                <div class="col-12 table-responsive hide occFreeZoneLocTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="occFreeZoneLocTable">
									<tr>
										<th class="sub_heading">SEZ Developers Code/Location</th>
										<th class="sub_heading">Description/Type of Activity</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(sezOccupantLocationAdd!=null){
	long locationAddBoxCouner=1;
	for(SezOccLocationAdd sezLocationAddBox:sezOccupantLocationAdd){
%>	<tr>
	<td class="sub_heading_content occSezDevLoc<%=locationAddBoxCouner%>">
	<%=Validator.isNotNull(sezLocationAddBox)&&Validator.isNotNull(sezLocationAddBox.getDeveloperLocation())?sezLocationAddBox.getDeveloperLocation():""%>
	</td>
	<td class="sub_heading_content occSezDevLocDesc<%=locationAddBoxCouner%>">
	<%=Validator.isNotNull(sezLocationAddBox)&&Validator.isNotNull(sezLocationAddBox.getDeveloperLocationDescription())?sezLocationAddBox.getDeveloperLocationDescription():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" onclick="occFreeZoneLocEditTab('<%=locationAddBoxCouner%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg> 
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" onclick="occFreeZoneLocDeleteData('<%=locationAddBoxCouner%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="sez-app-location-id<%=locationAddBoxCouner%>"  name="sez-app-location-id<%=locationAddBoxCouner%>" value="<%=sezLocationAddBox.getSezOccLocationAddId()%>">
							<%
							locationAddBoxCouner++;
							}
 }
						%>										
								</tbody>
							</table>
						</div>
		            </div>
		            <div class="row">
		                <div class="col-md-12"> 
		                    <p class="tab-form-title-subtitle f2">19. Location of Occupant Sub-Concession Lease</p> 
		                </div>
		                <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Lot/Building No. and Street Address</p>
								<input type="text" class="form-control" id="occSubConcessionBuilding" placeholder=""
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccSubConcessionBuilding())?briefInfo.getOccSubConcessionBuilding():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Town/City</p>
								<input type="text" class="form-control" id="occSubConcessionTown" placeholder=""
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccSubConcessionTown())?briefInfo.getOccSubConcessionTown():""%>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<input type="text" class="form-control" id="occSubConcessionParish" placeholder=""
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccSubConcessionTown())?briefInfo.getOccSubConcessionTown():""%>">
							</div>
						</div>
		                <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">20.</span>Has a surveyor's technical description been completed?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block"> 
									  <input value="Yes"<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccCompleteSurveyTechDesc())&&(briefInfo.getOccCompleteSurveyTechDesc().contains("Yes"))?"checked":""%>
									  type="radio" name="occCompleteSurveyTechDesc"> 
										 <label for="">Yes</label> 
									</div> 
									<div class="wizard-form-radio d-block ml-3"> 
										 <input value="No"<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccCompleteSurveyTechDesc())&&(briefInfo.getOccCompleteSurveyTechDesc().contains("No"))?"checked":""%>
										 type="radio" name="occCompleteSurveyTechDesc"> 
										 <label for="">No</label> 
									</div>
								</div> 
							</div>
						</div>
		                <div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">Boundaries</p> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">North</p>
								<input type="text" class="form-control" id="occNorthBoundaries" placeholder=""
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccNorthBoundaries())?briefInfo.getOccNorthBoundaries():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">East</p>
								<input type="text" class="form-control" id="occEastBoundaries" placeholder=""
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccEastBoundaries())?briefInfo.getOccEastBoundaries():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">West</p>
								<input type="text" class="form-control" id="occWestBoundaries" placeholder=""
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccWestBoundaries())?briefInfo.getOccWestBoundaries():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">South</p>
								<input type="text" class="form-control" id="occSouthBoundaries" placeholder=""
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccSouthBoundaries())?briefInfo.getOccSouthBoundaries():""%>">
							</div>
						</div>
		                <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">21.</span>Ownership/Right of Use</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block"> 
									  <input value="Owner" type="radio"
									  <%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccOwnership())&&briefInfo.getOccOwnership().contains("Owner")?"checked":""%>
									   name="occOwnership"> 
										 <label for="">Owner</label> 
									</div> 
									<div class="wizard-form-radio d-block ml-3"> 
										 <input value="Lease" type="radio"
										  <%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccOwnership())&&briefInfo.getOccOwnership().contains("Lease")?"checked":""%>
										  name="occOwnership"> 
										 <label for="">Lease</label> 
									</div>
								</div> 
							</div>
						</div>
						<div class="col-md-12 hide" id="occLeaseYearsBox">
							<div class="form-group">
								<p class="tab-form-main-heading">Years</p>
								<input type="text" class="form-control" id="occLeaseYears" placeholder="" value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccLeaseYears())?briefInfo.getOccLeaseYears():""%>">
							</div>
						</div>
		                <div class="col-md-4">
							<div class="form-group">
								<p class="tab-form-main-heading">Volume</p>
								<input type="text" class="form-control" id="occVolume" placeholder="" 
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
								value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccVolume())?briefInfo.getOccVolume():""%>">
							</div>
						</div>
		                <div class="col-md-4">
							<div class="form-group">
								<p class="tab-form-main-heading">Folio</p>
								<input type="text" class="form-control" id="occFolio" placeholder="" 
								oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
								value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccFolio())?briefInfo.getOccFolio():""%>">
							</div>
						</div>
		                <div class="col-md-4">
							<div class="form-group">
								<p class="tab-form-main-heading">Floor Number/s</p>
								<input type="text" class="form-control" id="occFloorNum" placeholder="" 
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
								value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccFloorNum())?briefInfo.getOccFloorNum():""%>">
							</div>
						</div>
		                
		                <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">22.</span>Please provide a description of proposed Service Activities to be undertaken</p>
								<textarea rows="3" id="occUndertakenService"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccUndertakenService())?briefInfo.getOccUndertakenService():""%></textarea>
							</div>
						</div>
		                <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">23.</span>Please provide a description of proposed Manufacturing Activities to be undertaken</p>
								<textarea rows="3" id="occUndertakenManufacturing"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccUndertakenManufacturing())?briefInfo.getOccUndertakenManufacturing():""%></textarea>
							</div>
						</div>
		                <div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">24. Distance from the nearest</p> 
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">a. Sea Port</p> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Km</p>
								<input type="text" class="form-control numeric-field" id="occSeaPortDistanceKM"
									aria-describedby="occSeaPortDistanceKM" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccSeaPortDistanceKM())?briefInfo.getOccSeaPortDistanceKM():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occSeaPortDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Mi</p>
								<input type="text" class="form-control numeric-field" id="occSeaPortDistanceMI"
									aria-describedby="occSeaPortDistanceMI" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccSeaPortDistanceMI())?briefInfo.getOccSeaPortDistanceMI():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occSeaPortDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">b. Airport</p> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Km</p>
								<input type="text" class="form-control numeric-field" id="occAirportDistanceKM"
									aria-describedby="occAirportDistanceKM" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccAirportDistanceKM())?briefInfo.getOccAirportDistanceKM():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occAirportDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Mi</p>
								<input type="text" class="form-control numeric-field" id="occAirportDistanceMI"
									aria-describedby="occAirportDistanceMI" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccAirportDistanceMI())?briefInfo.getOccAirportDistanceMI():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occAirportDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">c. Road</p> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Km</p>
								<input type="text" class="form-control numeric-field" id="occRoadDistanceKM"
									aria-describedby="occRoadDistanceKM" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccRoadDistanceKM())?briefInfo.getOccRoadDistanceKM():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occRoadDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Mi</p>
								<input type="text" class="form-control numeric-field" id="occRoadDistanceMI"
									aria-describedby="occRoadDistanceMI" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccRoadDistanceMI())?briefInfo.getOccRoadDistanceMI():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occRoadDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">d. Rail</p> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Km</p>
								<input type="text" class="form-control numeric-field" id="occRailDistanceKM"
									aria-describedby="occRailDistanceKM" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccRailDistanceKM())?briefInfo.getOccRailDistanceKM():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occRailDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Mi</p>
								<input type="text" class="form-control numeric-field" id="occRailDistanceMI"
									aria-describedby="occRailDistanceMI" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccRailDistanceMI())?briefInfo.getOccRailDistanceMI():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occRailDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">e. Customs Processing Area</p> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Km</p>
								<input type="text" class="form-control numeric-field" id="occCustomDistanceKM"
									aria-describedby="occCustomDistanceKM" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccCustomDistanceKM())?briefInfo.getOccCustomDistanceKM():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occCustomDistanceKMValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Mi</p>
								<input type="text" class="form-control numeric-field" id="occCustomDistanceMI"
									aria-describedby="occCustomDistanceMI" placeholder=""
									oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(briefInfo)&&Validator.isNotNull(briefInfo.getOccCustomDistanceMI())?briefInfo.getOccCustomDistanceMI():""%>">
									<p class="tab-form-sub-heading fieldAlert hide" id="occCustomDistanceMIValidation" style="color: red;">Only Numeric characters are allowed</p>
							</div>
						</div>
		            </div>
		        </div>
		    </div>
		    <button type="button" id="saveName" onclick="occupantProposedProjInfo();"
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
		<div class="tab-pane" role="tabpanel" id="childStep14">
		    <div class="tab-form">
		        <div class="development-plan-info-form">
		            <div class="row">
		                <div class="col-md-12">
		                    <!-- <p class="tab-form-title f2">Stakeholder Information</p> -->
		                    <p class="tab-form-title f2">Proposed Area Development Plan</p>
		                </div>
		            </div>
		            <div class="row">
						<div class="col-md-12">
		                    <p class="tab-form-title-subtitle f2">25. Infrastructure requirements</p>
		                </div>
		                <div class="col-md-12">
		                    <p class="tab-form-title-subtitle f2">i. Provide land measurement in square metres /hectares</p>
		                </div>
		                <div class="col-md-6">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">a.</span>Processing area</p>
		                        <input type="text" class="form-control" id="occProcessingArea" aria-describedby="occProcessingArea" 
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                        placeholder="" value="<%=Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccProcessingArea())?areaDevelopmentPlanInfo.getOccProcessingArea():""%>">
		                    </div>
		                </div>
		                <div class="col-md-6">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">b.</span>Non-processing area (parking etc.)</p>
		                        <input type="text" class="form-control" id="occNonProcessingArea" aria-describedby="occNonProcessingArea" 
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                        placeholder="" value="<%=Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccNonProcessingArea())?areaDevelopmentPlanInfo.getOccNonProcessingArea():""%>">
		                    </div>
		                </div>
		                <div class="col-md-12">
		                    <p class="tab-form-title-subtitle f2">ii. Requirement of built-up area in square metres</p>
		                </div>
		                <div class="col-md-6">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">a.</span>Offices</p>
		                        <input type="text" class="form-control" id="occOfficeRequirement" aria-describedby="occOfficeRequirement"
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                        placeholder="" value="<%=Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccOfficeRequirement())?areaDevelopmentPlanInfo.getOccOfficeRequirement():""%>">
		                    </div>
		                </div>
		                <div class="col-md-6">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">b.</span>Factory/Warehousing/storage</p>
		                        <input type="text" class="form-control" id="occFactoryRequirement" aria-describedby="occFactoryRequirement" 
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                        placeholder="" value="<%=Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccFactoryRequirement())?areaDevelopmentPlanInfo.getOccFactoryRequirement():""%>">
		                    </div>
		                </div>
		                <div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group">
									<input type="checkbox"  name="otherBuildUpRequirement" id="otherBuildUpRequirement"<%=Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOtherBuildUpRequirement())&&areaDevelopmentPlanInfo.getOtherBuildUpRequirement().contains("Yes")?"checked":""%> value="Yes"/> <label
										for="otherBuildUpRequirement">
										<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">c.</span>Other</p>
									</label>
								</div>
							</div>
						</div>
		                <div class="col-md-6 otherBuildUpRequirementBox hide">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading">Other Area</p>
		                        <input type="text" class="form-control" id="occOtherAreaReqName" aria-describedby="occOtherAreaReqName" placeholder="Please Specify Other Area" value="<%=Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccOtherAreaReqName())?areaDevelopmentPlanInfo.getOccOtherAreaReqName():""%>">
		                    </div>
		                </div>
		                <div class="col-md-6 otherBuildUpRequirementBox hide">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading">Built-up area in square metres</p>
		                        <input type="text" class="form-control" id="occOtherAreaRequirement" aria-describedby="occOtherAreaRequirement" placeholder="Please Specify Other built-up area in square metres" value="<%=Validator.isNotNull(areaDevelopmentPlanInfo)&&Validator.isNotNull(areaDevelopmentPlanInfo.getOccOtherAreaRequirement())?areaDevelopmentPlanInfo.getOccOtherAreaRequirement():""%>">
		                    </div>
		                </div>
		            </div>
		        </div>
		    </div>
		    <button type="button" id="saveName" onclick="occupantProposedDevelopmentInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep15">
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
		                    <p class="tab-form-title-subtitle f2">26. Investment (USD):</p>
		                </div>
		                <div class="col-md-12">
		                    <p class="tab-form-title-subtitle f2">i. Infrastructure</p>
		                </div>
		                <div class="col-md-6">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">a.</span>Building/facilities</p>
		                        <input type="text" class="form-control numeric-field" id="occInfraBuilding" aria-describedby="occInfraBuilding" placeholder="US$"
		                         oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" 
		                        value="<%=Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraBuilding())?investAndFinanceInfo.getOccInfraBuilding():""%> ">
		                        <p class="tab-form-sub-heading fieldAlert hide" id="occInfraBuildingValidation" style="color: red;">Only Numeric characters are allowed</p>
		                    </div>
		                </div>
		                <div class="col-md-6">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">b.</span>Equipment</p>
		                        <input type="text" class="form-control numeric-field" id="occInfraEquipment" aria-describedby="occInfraEquipment" 
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                        placeholder="US$" value="<%=Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraEquipment())?investAndFinanceInfo.getOccInfraEquipment():""%>">
		                        <p class="tab-form-sub-heading fieldAlert hide" id="occInfraEquipmentValidation" style="color: red;">Only Numeric characters are allowed</p>
		                    </div>
		                </div>
		                <div class="col-md-6">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">c.</span>Machines</p>
		                        <input type="text" class="form-control numeric-field" id="occInfraMachines" aria-describedby="occInfraMachines" 
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                        placeholder="US$" value="<%=Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraBuilding())?investAndFinanceInfo.getOccInfraBuilding():""%>">
		                        <p class="tab-form-sub-heading fieldAlert hide" id="occInfraMachinesValidation" style="color: red;">Only Numeric characters are allowed</p>
		                    </div>
		                </div>
		                <div class="col-md-6">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">d.</span>Total</p>
		                        <input type="text" class="form-control numeric-field" id="occInfraTotal" aria-describedby="occInfraTotal" 
		                        oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
		                        placeholder="US$" value="<%=Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraTotal())?investAndFinanceInfo.getOccInfraTotal():""%>">
		                        <p class="tab-form-sub-heading fieldAlert hide" id="occInfraTotalValidation" style="color: red;">Only Numeric characters are allowed</p>
		                    </div>
		                </div>
		                <div class="col-md-12">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">ii.</span>Source(s) of finance</p>
		                        <textarea rows="3" id="occInfraFinanceSource"  maxlength="255" class="form-control" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(investAndFinanceInfo)&&Validator.isNotNull(investAndFinanceInfo.getOccInfraFinanceSource())?investAndFinanceInfo.getOccInfraFinanceSource():""%></textarea>
		                    </div>
		                </div>
		            </div>
		        </div>
		    </div>
		    <button type="button" id="saveName" onclick="occupantInvestmentInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep16">
		    <div class="tab-form">
		        <div class="employment-plan-info-form">
		            <div class="row">
		                <div class="col-md-12"> 
                          <p class="tab-form-title f2">Employment Information</p>  
                         </div>
		            	<input id="occLabourReqVal" type="hidden" name="occLabourReqVal" value="1">
		                <div class="col-md-12">
		                    <div class="accordion secured-accordian" id="addOccLabourReqBox">
		                        <div class="accordion__header is-active"  id="addOccLabourReq" onclick="expandDetails(this.id)">
		                            <div class="d-flex align-items-center">
		                                <div class="d-flex align-items-center">
		                                    <div>
		                                        <span class="accordion__toggle"></span>
		                                    </div>
		                                    <div>
		                                        <h2>27. Projected labour requirement over a three year period</h2>
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
		                                        <input type="text" class="form-control numeric-field" id="occLabourYear"
		                                            aria-describedby="occLabourYear" placeholder=""
		                                            oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
		                                            value="">
		                                            <p class="tab-form-sub-heading fieldAlert hide" id="occLabourYearValidation" style="color: red;">Only Numeric characters are allowed</p>
		                                    </div>
		                                </div>
		                                <div class="col-md-4">
		                                    <div class="form-group">
		                                        <p class="tab-form-main-heading">Direct</p>
		                                        <input type="text" class="form-control numeric-field" id="occLabourDirect"
		                                            aria-describedby="occLabourDirect" placeholder=""
		                                            oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
		                                            value="">
		                                            <p class="tab-form-sub-heading fieldAlert hide" id="occLabourDirectValidation" style="color: red;">Only Numeric characters are allowed</p>
		                                    </div>
		                                </div>
		                                <div class="col-md-4">
		                                    <div class="form-group">
		                                        <p class="tab-form-main-heading">Male</p>
		                                        <input type="text" class="form-control numeric-field" id="occLabourMale"
		                                            aria-describedby="occLabourMale" placeholder=""
		                                            oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
		                                            value="">
		                                            <p class="tab-form-sub-heading fieldAlert hide" id="occLabourMaleValidation" style="color: red;">Only Numeric characters are allowed</p>
		                                    </div>
		                                </div>
		                                <div class="col-md-4">
		                                    <div class="form-group">
		                                        <p class="tab-form-main-heading">Female</p>
		                                        <input type="text" class="form-control numeric-field" id="occLabourFemale"
		                                            aria-describedby="occLabourFemale" placeholder=""
		                                            oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
		                                            value="">
		                                            <p class="tab-form-sub-heading fieldAlert hide" id="occLabourFemaleValidation" style="color: red;">Only Numeric characters are allowed</p>
		                                    </div>
		                                </div>
		                                <div class="col-md-4">
		                                    <div class="form-group">
		                                        <p class="tab-form-main-heading">Local</p>
		                                        <input type="text" class="form-control numeric-field" id="occLabourLocal"
		                                            aria-describedby="occLabourLocal" placeholder=""
		                                            oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
		                                            value="">
		                                            <p class="tab-form-sub-heading fieldAlert hide" id="occLabourLocalValidation" style="color: red;">Only Numeric characters are allowed</p>
		                                    </div>
		                                </div>
		                                <div class="col-md-4">
		                                    <div class="form-group">
		                                        <p class="tab-form-main-heading">Foreign</p>
		                                        <input type="text" class="form-control numeric-field" id="occLabourForeign"
		                                            aria-describedby="occLabourForeign" placeholder=""
		                                            oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
		                                            value="">
		                                            <p class="tab-form-sub-heading fieldAlert hide" id="occLabourForeignValidation" style="color: red;">Only Numeric characters are allowed</p>
		                                    </div>
		                                </div>
		                            </div>
		                        </div>
		                    </div>			
		                </div>
		                <div class="col-md-12 d-flex justify-content-end py-4"> 
		                <a href="javascript:void(0);" class="add-more-employee" id="addOneMorOccLabourReqBox" onclick="addOccLabourReqBox();"> <span>+ 1</span> Add More</a> 
		                </div>
		                <div class="col-12 table-responsive hide occLabourReqTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="occLabourReqTable">
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
<%if(sezOccupantEmploymentInfos!=null){
	long employeeCounter=1;
	for(SezOccupantEmploymentInfo sezLabourAddBox:sezOccupantEmploymentInfos){
		
%>	<tr>
	<td class="sub_heading_content occLabourYear<%=employeeCounter%>">
	<%=Validator.isNotNull(sezLabourAddBox)&&Validator.isNotNull(sezLabourAddBox.getOccLabourYear())?sezLabourAddBox.getOccLabourYear():""%>
	</td>
	<td class="sub_heading_content occLabourDirect<%=employeeCounter%>">
	<%=Validator.isNotNull(sezLabourAddBox)&&Validator.isNotNull(sezLabourAddBox.getOccLabourDirect())?sezLabourAddBox.getOccLabourDirect():""%>
	</td>
	<td class="sub_heading_content occLabourMale<%=employeeCounter%>">
	<%=Validator.isNotNull(sezLabourAddBox)&&Validator.isNotNull(sezLabourAddBox.getOccLabourMale())?sezLabourAddBox.getOccLabourMale():""%>
	</td>
	<td class="sub_heading_content occLabourFemale<%=employeeCounter%>">
	<%=Validator.isNotNull(sezLabourAddBox)&&Validator.isNotNull(sezLabourAddBox.getOccLabourFemale())?sezLabourAddBox.getOccLabourFemale():""%>
	</td>
	<td class="sub_heading_content occLabourLocal<%=employeeCounter%>">
	<%=Validator.isNotNull(sezLabourAddBox)&&Validator.isNotNull(sezLabourAddBox.getOccLabourLocal())?sezLabourAddBox.getOccLabourLocal():""%>
	</td>
	<td class="sub_heading_content occLabourForeign<%=employeeCounter%>">
	<%=Validator.isNotNull(sezLabourAddBox)&&Validator.isNotNull(sezLabourAddBox.getOccLabourForeign())?sezLabourAddBox.getOccLabourForeign():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" onclick="occLabourReqEditTab('<%=employeeCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg> 
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" onclick="occLabourReqDeleteData('<%=employeeCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="sez-app-labour-id<%=employeeCounter%>"  name="sez-app-labour-id<%=employeeCounter%>" value="<%=sezLabourAddBox.getSezOccEmpId()%>">
							<%
							employeeCounter++;
							}
 }
						%>									
								</tbody>
							</table>
						</div>
		            </div>
		        </div>
		    </div>
		    <button type="button" id="saveName" onclick="occupantEmploymentInfo(false); nextButtonCall();"
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
		<div class="tab-pane" role="tabpanel" id="childStep17">
			<div class="tab-form">
				<div class="zone-undertaking-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Occupant/ Zone User Undertaking</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group "> 
							     <p class="tab-form-main-heading">Title of Applicant</p> 
							     <div class="select-wrapper position-relative">
							       	<select class="form-select form-control" id="occApplicantTitle" name=""> 
							       		<option value="" disabled="" selected="">Please Select</option> 
							       		<option value="Mr."
							       		<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantTitle().equals("Mr."))?"selected":"" %>>
							       		Mr.</option> 
							       		<option value="Ms."
							       		<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantTitle().equals("Ms."))?"selected":"" %>>
							       		Ms.</option> 
							       		<option value="Mrs."
							       		<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantTitle().equals("Mrs."))?"selected":"" %>>
							       		Mrs.</option> 
							       	</select> 
							    </div>
                          </div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant*</p>
								<input type="text" class="form-control" id="occApplicantName" placeholder=""
									value="<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantName())?occupantUserUndertakingInfo.getOccApplicantName():""%>">
									<p class="tab-form-sub-heading fieldAlert hide"
			                        id="occApplicantNameValidation" style="color: red;">Please Enter
			                         Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone No.</p>
								<input type="text" class="form-control" id="occApplicantTeleNum" placeholder="" 
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
								value="<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantTeleNum())?occupantUserUndertakingInfo.getOccApplicantTeleNum():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">E-mail Address*</p>
								<input type="text" class="form-control" id="occApplicantEmail" placeholder="" value="<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantTeleNum())?occupantUserUndertakingInfo.getOccApplicantEmail():""%>">
								<p class="tab-form-sub-heading fieldAlert hide"
			                        id="occApplicantEmailValidation" style="color: red;"></p>
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
							<div class="signature_texarea mb-2" id="occ-applicant-sign-image-holder">
							<%if(Validator.isNotNull(occuUnderTakingSign)){ %>
							<img src="<%=occuUnderTakingSign%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="occ-applicant-signature-upload-btn"   name="<portlet:namespace/>occ-applicant-signature-upload-btn" hidden="">
							<label for="occ-applicant-signature-upload-btn" class="choose-sign-btn"> 
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
								<input type="date" max="9999-12-31" class="form-control" id="occ-applicant-signature-date" 
							value="<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccApplicantSignDate())?new SimpleDateFormat("yyyy-MM-dd").format(occupantUserUndertakingInfo.getOccApplicantSignDate()):""%>" placeholder=""> 
							</div> 
						</div>
						<div class="col-md-7">
							<div class="form-group">
								<p class="tab-form-main-heading">Notary Public Name*</p>
								<input type="text" class="form-control" id="occPublicNotaryName" placeholder="" value="<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccPublicNotaryName())?occupantUserUndertakingInfo.getOccPublicNotaryName():""%>">
								<p class="tab-form-sub-heading fieldAlert hide"
			                        id="occPublicNotaryNameValidation" style="color: red;">Please Enter
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
							<div class="signature_texarea mb-2" id="occ-public-notary-sign-image-holder">
							<%if(Validator.isNotNull(occuUnderTakingNotarySign)){ %>
							<img src="<%=occuUnderTakingNotarySign%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="occ-public-notary-signature-upload-btn"  name="<portlet:namespace/>occ-public-notary-signature-upload-btn" hidden="">
							<label for="occ-public-notary-signature-upload-btn" class="choose-sign-btn"> 
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
								<input type="date" max="9999-12-31" class="form-control" id="occ-public-notary-signature-date" value="<%=Validator.isNotNull(occupantUserUndertakingInfo)&&Validator.isNotNull(occupantUserUndertakingInfo.getOccPublicNotarySignDate())?new SimpleDateFormat("yyyy-MM-dd").format(occupantUserUndertakingInfo.getOccPublicNotarySignDate()):""%>" placeholder=""> 
							</div> 
						</div>
					</div>
				</div>
			</div>
			<button type="button" onclick="occupantZoneUndertakingInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep18">
			<div class="tab-form">
				<div class="deve-undertaking-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Developer's Undertaking</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Developers Name</p>
								<input type="text" class="form-control" id="occUndertakingDevName" placeholder=""
									value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantName())?developerUndertakingInfo.getOccDevApplicantName():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Letter of Approval No.</p>
								<input type="text" class="form-control" id="occUndertakingApprLetter" placeholder=""
									value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantName())?developerUndertakingInfo.getOccDevApplicantName():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="occUndertakingDate" placeholder=""
									value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingDate())?new SimpleDateFormat("yyyy-MM-dd").format(developerUndertakingInfo.getOccUndertakingDate()):""%>">
							</div>
						</div>
		                <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">SEZ Developer's Agreement No.</p>
								<input type="text" class="form-control" id="occUndertakingAgreeNum" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
								value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingAgreeNum())?developerUndertakingInfo.getOccUndertakingAgreeNum():""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="occUndertakingAgreeDate" placeholder=""
									value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingAgreeDate())?new SimpleDateFormat("yyyy-MM-dd").format(developerUndertakingInfo.getOccUndertakingAgreeDate()):""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">SEZ Developer's Control Number</p>
								<input type="text" class="form-control" id="occUndertakingControlNum" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
								value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingControlNum())?developerUndertakingInfo.getOccUndertakingControlNum():""%>">
							</div>
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">Developer's signature and certification</p> 
						</div>
		                <div class="col-md-6">
							<div class="form-group "> 
							     <p class="tab-form-main-heading">Title of Applicant</p> 
							     <div class="select-wrapper position-relative">
							       	<select class="form-select form-control" id="occDevApplicantTitle" name=""> 
							       		<option value="" disabled="" selected="">Please Select</option> 
							       		<option value="Mr."
							       		<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantTitle().equals("Mr."))?"selected":"" %>>
							       		Mr.</option> 
							       		<option value="Ms."
							       		<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantTitle().equals("Ms."))?"selected":"" %>>
							       		Ms.</option> 
							       		<option value="Mrs."
							       		<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantTitle().equals("Mrs."))?"selected":"" %>>
							       		Mrs.</option> 
							       	</select> 
							    </div>
                          </div> 
						</div>
		                <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant</p>
								<input type="text" class="form-control" id="occDevApplicantName" placeholder=""
									value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccUndertakingDevName())?developerUndertakingInfo.getOccUndertakingDevName():""%>">
							</div>
						</div>
		                <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone No.</p>
								<input type="text" class="form-control" id="occDevApplicantTele" placeholder=""
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
								value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantTele())?developerUndertakingInfo.getOccDevApplicantTele():""%>">
							</div>
						</div>
		                <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">E-mail Address</p>
								<input type="text" class="form-control" id="occDevApplicantEmail" placeholder=""
									value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantEmail())?developerUndertakingInfo.getOccDevApplicantEmail():""%>">
							</div>
						</div>
						<div class="col-md-12"> 
		                    <p class="tab-form-title-subtitle f2">Official Seal/Stamp</p> 
		                </div>
		                <div class="col-md-12">
		                    <p class="pt-2 common-para">Signature</p>			
		                    <div class="signature_texarea mb-2" id="occ-dev-applicant-sign-image-holder">
		                    <%if(Validator.isNotNull(occDeveloperTakingSign)){ %>
							<img src="<%=occDeveloperTakingSign%>"  width="100" height="100"/>
							<%} %>
		                    </div>
		                    <input type="file" id="occ-dev-applicant-signature-upload-btn" 
		                    name="<portlet:namespace/>occ-dev-applicant-signature-upload-btn"  hidden="">
		                    <label for="occ-dev-applicant-signature-upload-btn" class="choose-sign-btn"> 
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
		                        <input type="date" max="9999-12-31" class="form-control" id="occ-dev-applicant-signature-date" value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevApplicantSignDate())?new SimpleDateFormat("yyyy-MM-dd").format(developerUndertakingInfo.getOccDevApplicantSignDate()):""%>" placeholder=""> 
		                    </div> 
		                </div>
		                <div class="col-md-7">
		                    <div class="form-group">
		                        <p class="tab-form-main-heading">Name of Notary Public/Justice of the Peace</p>
		                        <input type="text" class="form-control" id="occDevPublicNotaryName" placeholder=""
		                            value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevPublicNotaryName())?developerUndertakingInfo.getOccDevPublicNotaryName():""%>">
		                    </div>
		                </div>
		                <div class="col-md-12"> 
		                    <p class="tab-form-title-subtitle f2">Official Seal/Stamp</p> 
		                </div>
		                <div class="col-md-12">
		                    <p class="pt-2 common-para">Signature</p>			
		                    <div class="signature_texarea mb-2" id="occ-dev-public-notary-sign-image-holder">
		                    <%if(Validator.isNotNull(occDeveloperTakingNotary)){ %>
							<img src="<%=occDeveloperTakingNotary%>"  width="100" height="100"/>
							<%} %>
		                    </div>
		                    <input type="file" id="occ-dev-public-notary-signature-upload-btn" 
		                    name="<portlet:namespace/>occ-dev-public-notary-signature-upload-btn" hidden="">
		                    <label for="occ-dev-public-notary-signature-upload-btn" class="choose-sign-btn"> 
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
		                        <input type="date" max="9999-12-31" class="form-control" id="occ-dev-public-notary-signature-date" value="<%=Validator.isNotNull(developerUndertakingInfo)&&Validator.isNotNull(developerUndertakingInfo.getOccDevPublicNotarySignDate())?new SimpleDateFormat("yyyy-MM-dd").format(developerUndertakingInfo.getOccDevPublicNotarySignDate()):""%>" placeholder=""> 
		                    </div> 
		                </div>
					</div>
				</div>
			</div>
			<button type="button" onclick="occupantDeveloperUndertakingInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep19">
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
								<p class="tab-form-main-heading">Investments by the applicant in zone-related buildings, machines, equipment, facilities and other necessary assets during the first year of the occupant's subconcession shall not be less than US$50,000.00</p>
								<p class="tab-form-main-heading">The applicant must have issued and paid-up share capital of US$25,000</p>
						</div>
						<div class="col-md-12">
							<p class="common-section-small-heading mb-3">Should you have any queries regarding the completion of the application form feel free to contact us via
								email at <span>bdev@jseza.com</span> or via telephone at (876) 619-SEZA (7392).</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
							 	<p class="tab-form-title-subtitle f2">I. General</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccGeneral())&&occSubmissionChecklistInfo.getOccGeneral().contains("Proof of payment of Application Fee")?"checked":""%> id="occGeneralReq1" value="Proof of payment of Application Fee" name="occGeneralReq"> 
									<label for="occGeneralReq1"> <p class="tab-form-main-heading mb-0">Proof of payment of Application Fee: US$1,500. Please request payment details when fulfilling the transaction.</p> </label> 
								</div> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occGeneralReq2" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccGeneral())&&occSubmissionChecklistInfo.getOccGeneral().contains("Completed Data Capture Form")?"checked":""%> value="Completed Data Capture Form" name="occGeneralReq"> 
									<label for="occGeneralReq2"> <p class="tab-form-main-heading mb-0">Completed Data Capture Form</p> </label> 
								</div> 
							</div> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">II. Company Information</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occComInfoReq1" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccComInfoRequest())&&occSubmissionChecklistInfo.getOccComInfoRequest().contains("Certified copy of the companys Memorandum or Articles of Association")?"checked":""%> value="Certified copy of the companys Memorandum or Articles of Association" name="occComInfoReq"> 
									<label for="occComInfoReq1"> <p class="tab-form-main-heading mb-0">Certified copy of the company's Memorandum or Articles of Association</p> </label> 
								</div> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occComInfoReq2" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccComInfoRequest())&&occSubmissionChecklistInfo.getOccComInfoRequest().contains("Certified copy of Certificate of Incorporation")?"checked":""%>	value="Certified copy of Certificate of Incorporation" name="occComInfoReq"> 
									<label for="occComInfoReq2"> 
									<p class="tab-form-main-heading mb-0">Certified copy of Certificate of Incorporation</p> 
									</label> 
									<p class="tab-form-sub-heading pl-4 ml-3">This document is to be certified by the Companies Office of Jamaica (COJ).</p>
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occComInfoReq3" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccComInfoRequest())&&occSubmissionChecklistInfo.getOccComInfoRequest().contains("Certified copy of Tax Registration Number")?"checked":""%> value="Certified copy of Tax Registration Number" name="occComInfoReq"> 
									<label for="occComInfoReq3"> <p class="tab-form-main-heading mb-0">Certified copy of Tax Registration Number (TRN)</p> 
									</label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occComInfoReq4" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccComInfoRequest())&&occSubmissionChecklistInfo.getOccComInfoRequest().contains("Certified copy of the General Consumption Tax")?"checked":""%> value="Certified copy of the General Consumption Tax" name="occComInfoReq"> 
									<label for="occComInfoReq4"> <p class="tab-form-main-heading mb-0">Certified copy of the General Consumption Tax (GCT) number</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occComInfoReq5" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccComInfoRequest())&&occSubmissionChecklistInfo.getOccComInfoRequest().contains("Certified copy of Tax Compliance Certificate")?"checked":""%> value="Certified copy of Tax Compliance Certificate" name="occComInfoReq"> 
									<label for="occComInfoReq5"> <p class="tab-form-main-heading mb-0">Certified copy of Tax Compliance Certificate (TCC)</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occComInfoReq6" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccComInfoRequest())&&occSubmissionChecklistInfo.getOccComInfoRequest().contains("Proof of issued and paid-up shared capital")?"checked":""%> value="Proof of issued and paid-up shared capital" name="occComInfoReq"> 
									<label for="occComInfoReq6"> <p class="tab-form-main-heading mb-0">Proof of issued and paid-up shared capital not less than US$25,000. This may be satisfied by
										submitting one of the following:</p> </label> 
								</div>
								<div class="form-group pl-5 ml-3"> 
									<div class="wizard-form-radio d-block"> 
										<input value="Form 9 from the Companies Office of Jamaica" type="radio" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccPaidShareCapProof())&&occSubmissionChecklistInfo.getOccPaidShareCapProof().contains("Form 9 from the Companies Office of Jamaica")?"checked":""%> name="occPaidShareCapProof" id="occPaidShareCapProof1"> 
										<label for="occPaidShareCapProof1">Form 9 from the Companies Office of Jamaica.</label> 
									</div> 
									<div class="wizard-form-radio d-block"> 
										<input value="Form of Declaration from a Chartered Accountant" type="radio" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccPaidShareCapProof())&&occSubmissionChecklistInfo.getOccPaidShareCapProof().contains("Form of Declaration from a Chartered Accountant")?"checked":""%> name="occPaidShareCapProof"> 
										<label for="occPaidShareCapProof2">Form of Declaration from a Chartered Accountant.</label>
										<p class="tab-form-sub-heading pl-4 ml-2"> See template "Form of Declaration" provided.</p> 
									</div> 
									<div class="wizard-form-radio d-block"> 
										<input value="Signed and stamped Financial Statement" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccPaidShareCapProof())&&occSubmissionChecklistInfo.getOccPaidShareCapProof().contains("Signed and stamped Financial Statement")?"checked":""%> type="radio" id="occPaidShareCapProof3" name="occPaidShareCapProof"> 
										<label for="occPaidShareCapProof3">Signed and stamped Financial Statement from an Independent <br>Chartered Account.</label> 
									</div> 
								</div> 
							</div> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">III. Sworn Statements</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occSwornStateReq1"
							<%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSwanStateRequest())&&occSubmissionChecklistInfo.getOccSwanStateRequest().contains("Affidavit outlining Company name Company address Nationality of parent company")?"checked":""%>		
									 value="Affidavit outlining Company name Company address Nationality of parent company" name="occSwornStateReq"> 
									<label for="occSwornStateReq1"> <p class="tab-form-main-heading mb-0">Affidavit outlining: Company name, Company address, Nationality of parent company, Owners, Board of Directors (or equivalent management committee), Auditor, Bankers (as well as the capital ownership shares of the applicant).</p> </label> 
								</div> 
							</div> 
							<p class="tab-form-main-heading mb-0">See template: "Company Affidavit" provided by Developer Kit.</p> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">IV. Supporting Documents</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occSupportingDoc1" 
									<%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedRequest())&&occSubmissionChecklistInfo.getOccSelectedRequest().contains("Copy of proposed sub-concession agreement")?"checked":""%>
									value="Copy of proposed sub-concession agreement" name="occSupportingDoc"> 
									<label for="occSupportingDoc1"> <p class="tab-form-main-heading mb-0">Copy of proposed sub-concession agreement (Microsoft Word version)</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occSupportingDoc2" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedRequest())&&occSubmissionChecklistInfo.getOccSelectedRequest().contains("Letter indicating proposed terms of tenancy")?"checked":""%> value="Letter indicating proposed terms of tenancy" name="occSupportingDoc"> 
									<label for="occSupportingDoc2"> <p class="tab-form-main-heading mb-0">Letter indicating proposed terms of tenancy within the approved SEZ</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occSupportingDoc3" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedRequest())&&occSubmissionChecklistInfo.getOccSelectedRequest().contains("Copy of lease agreement")?"checked":""%> value="Copy of lease agreement" name="occSupportingDoc"> 
									<label for="occSupportingDoc3"> <p class="tab-form-main-heading mb-0">Copy of lease agreement.</p> </label> 
								</div> 
							</div> 
							<p class="tab-form-main-heading mb-0">See "Sub concession Agreement Template and Guidelines" provided by Developer Kit.</p> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">V. Facilities Requirments</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occFacilitiesReq1" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedFacilityRequest())&&occSubmissionChecklistInfo.getOccSelectedFacilityRequest().contains("Labelled Floor Plans")?"checked":""%> value="Labelled Floor Plans" name="occFacilitiesReq"> 
									<label for="occFacilitiesReq1"> <p class="tab-form-main-heading mb-0">Labelled Floor Plans</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occFacilitiesReq2" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedFacilityRequest())&&occSubmissionChecklistInfo.getOccSelectedFacilityRequest().contains("Project Implementation Schedule for the activation of the occupant facilities")?"checked":""%>	value="Project Implementation Schedule for the activation of the occupant facilities" name="occFacilitiesReq"> 
									<label for="occFacilitiesReq2"> <p class="tab-form-main-heading mb-0">Project Implementation Schedule for the activation of the occupant facilities</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occFacilitiesReq3" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedFacilityRequest())&&occSubmissionChecklistInfo.getOccSelectedFacilityRequest().contains("Written statement or profile of the Project Team")?"checked":""%>	value="Written statement or profile of the Project Team" name="occFacilitiesReq"> 
									<label for="occFacilitiesReq3"> <p class="tab-form-main-heading mb-0">Written statement/profile of the Project Team outlining their technical capacity/experience in doing retrofitting/ renovation of this nature; if applicable.</p> </label> 
								</div>
							</div> 
							<p class="tab-form-main-heading mb-0">See "Techinical Document Samples" provided by Developer Kit.</p> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">VI. Approvals</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occApprovals1" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedApprovals())&&occSubmissionChecklistInfo.getOccSelectedApprovals().contains("Fire Approval Letter or Fire Safety Certificate")?"checked":""%> value="Fire Approval Letter or Fire Safety Certificate" name="occApprovals"> 
									<label for="occApprovals1"> <p class="tab-form-main-heading mb-0">Fire Approval Letter or Fire Safety Certificate from the Jamaica Brigade Fire Service</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occApprovals2" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedApprovals())&&occSubmissionChecklistInfo.getOccSelectedApprovals().contains("Proof of Application")?"checked":""%> value="Proof of Application" name="occApprovals"> 
									<label for="occApprovals2"> <p class="tab-form-main-heading mb-0">Proof of Application</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occApprovals3" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedApprovals())&&occSubmissionChecklistInfo.getOccSelectedApprovals().contains("Any other relevant approvals")?"checked":""%>	value="Any other relevant approvals" name="occApprovals"> 
									<label for="occApprovals3"> <p class="tab-form-main-heading mb-0">Any other relevant approvals, e.g. NEPA, Local Authorities</p> </label> 
								</div>
							</div> 
							<p class="common-section-small-heading mb-3"> <span>Important note: </span>The Authority's Business Acceleration Center (BAC) is available to assist in acquiring the relevant permit. To access the BAC services, please send a letter addressed to the CEO of the Authority requesting the relevant permit assistance needed.</p>
						</div> 
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">VII. Security, Occupational Safety and Health Requirements</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occSecurityReq1" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSecurityRequest().contains("Detailed Security Plan addressing the physical security measures")?"checked":""%>	value="Detailed Security Plan addressing the physical security measures" name="occSecurityReq"> 
									<label for="occSecurityReq1"> <p class="tab-form-main-heading mb-0">Detailed Security Plan addressing the physical security measures to be employed pre and post-construction.</p> </label> 
									<p class="tab-form-sub-heading pl-4 ml-2">See "General Security Guidelines" provided.</p> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occSecurityReq2" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSecurityRequest().contains("Business Continuity Emergency and Disaster Management Plan")?"checked":""%>	value="Business Continuity Emergency and Disaster Management Plan" name="occSecurityReq"> 
									<label for="occSecurityReq2"> <p class="tab-form-main-heading mb-0">Business Continuity, Emergency and Disaster Management Plan.</p> </label> 
									<p class="tab-form-sub-heading pl-4 ml-2">See template: "Emergency and
										Disaster Action Plan Guide" provided.</p> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occSecurityReq3" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSecurityRequest().contains("Occupational Health and Safety Plan")?"checked":""%> value="Occupational Health and Safety Plan" name="occSecurityReq"> 
									<label for="occSecurityReq3"> <p class="tab-form-main-heading mb-0">Occupational Health and Safety Plan covering all phases of the development.</p> </label> 
									<p class="tab-form-sub-heading pl-4 ml-2">See "Occupational Health
										and Safety Guidelines" provided</p> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occSecurityReq4" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSecurityRequest().contains("Security and Logistical Plan Requirements")?"checked":""%> value="Security and Logistical Plan Requirements" name="occSecurityReq"> 
									<label for="occSecurityReq4"> <p class="tab-form-main-heading mb-0">Security and Logistical Plan Requirements for the handling of excise goods, if applicable. Please request payment details when fulfilling the transaction.</p> </label> 
								</div>
							</div> 
						</div>
						<div class="col-md-12"> 
							<div class="form-group mb-0"> 
								 <p class="tab-form-title-subtitle f2">VIII. Detailed Business Plan</p> 
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occDetailedBusiPlan1" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness().contains("Business plan together with a description of the relevant markets")?"checked":""%>	value="Business plan together with a description of the relevant markets" name="occDetailedBusiPlan"> 
									<label for="occDetailedBusiPlan1"> <p class="tab-form-main-heading mb-0">Business plan together with a description of the relevant markets, whether foreign or domestic, or both, into which the applicant proposes to sell its finished products or render its services. The business plan should also entail.</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occDetailedBusiPlan2" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness().contains("Written statement that describes the proposed activities")?"checked":""%>	value="Written statement that describes the proposed activities" name="occDetailedBusiPlan"> 
									<label for="occDetailedBusiPlan2"> <p class="tab-form-main-heading mb-0">Written statement that describes the proposed activities to be carried out by the Occupant.</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occDetailedBusiPlan3" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness().contains("Written statement on whether the proposed activities are in keeping with the Developers approved detailed master plan")?"checked":""%>	value="Written statement on whether the proposed activities are in keeping with the Developers approved detailed master plan" name="occDetailedBusiPlan"> 
									<label for="occDetailedBusiPlan3"> <p class="tab-form-main-heading mb-0">Written statement on whether the proposed activities are in keeping with the Developer's approved detailed master plan.</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occDetailedBusiPlan4" value="Estimated number and nationalities of the worrkers" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness().contains("Estimated number and nationalities of the worrkers")?"checked":""%>	name="occDetailedBusiPlan"> 
									<label for="occDetailedBusiPlan4"> <p class="tab-form-main-heading mb-0">Estimated number and nationalities of the workers, together with their skill levels, to be employed by the Occupant.</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occDetailedBusiPlan5" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness().contains("At least 3 years financial projections")?"checked":""%> value="At least 3 years financial projections" name="occDetailedBusiPlan"> 
									<label for="occDetailedBusiPlan5"> <p class="tab-form-main-heading mb-0">At least 3 years financial projections.</p> </label> 
								</div>
								<div class="checkbox-form-group second-custom-checkbox"> 
									<input type="checkbox" id="occDetailedBusiPlan6" <%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness())&&occSubmissionChecklistInfo.getOccSelectedSDetailedBussiness().contains("Projected value of investment of no less than US$50000 during the first year of operations")?"checked":""%> value="Projected value of investment of no less than US$50000 during the first year of operations" name="occDetailedBusiPlan"> 
									<label for="occDetailedBusiPlan6"> <p class="tab-form-main-heading mb-0">Projected value of investment of no less than US$50,000 during the first year of operations; or an indication of whether the company is desirous of obtaining MSME Occupant status based on the relevant criteria test.</p> </label> 
								</div>
								<p class="tab-form-sub-heading">See "Business Plan Guidelines" provided.</p> 
							</div> 
						</div>
						<div class="col-md-12"> 
							<p class="tab-form-title-subtitle f2">I have reviewed and submitted the documents highlighted in the checklist as a part of an application for Special Economic Zone designation.</p> 
						</div>
						<div class="col-md-6"> 
							<div class="form-group"> 
								<p class="tab-form-main-heading">Name</p> 
								<input type="text" class="form-control" id="occNameReq" placeholder="" value="<%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(occSubmissionChecklistInfo.getOccNameReq())?occSubmissionChecklistInfo.getOccNameReq():"" %>"> 
							</div> 
						</div>
						<div class="col-md-6"> 
							<div class="form-group"> 
								<p class="tab-form-main-heading">Date</p> 
								<input type="date" max="9999-12-31" class="form-control" id="occDateReq" value="<%=Validator.isNotNull(occSubmissionChecklistInfo)&&Validator.isNotNull(dateOccChecklist)?new SimpleDateFormat("yyyy-MM-dd").format(dateOccChecklist):"" %>" placeholder=""> 
							</div> 
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>			
							<div class="signature_texarea mb-2" id="occ-sign-req-image-holder">
							<%if(Validator.isNotNull(occChecklistsign)){ %>
							<img src="<%=occChecklistsign%>"  width="100" height="100"/>
							<%}%>
							</div>
							<input type="file" id="occ-sign-req-upload-btn" 
							name="<portlet:namespace/>occ-sign-req-upload-btn"
							hidden="">
							<label for="occ-sign-req-upload-btn" class="choose-sign-btn"> 
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