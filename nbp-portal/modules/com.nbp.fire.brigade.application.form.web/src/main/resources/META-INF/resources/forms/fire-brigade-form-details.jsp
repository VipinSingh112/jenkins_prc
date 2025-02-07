<%@page import="com.nbp.fire.brigade.upload.document.commands.GettingDocumentData"%>
<%@ include file="../init.jsp" %>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeCerPurposeInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeHazardousSubInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeMultFloorInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeOperatorDetailLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadePremisesInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo"%>
<portlet:resourceURL var="addSignatureInfoUrl" id="/add/signature/info"></portlet:resourceURL>
<portlet:resourceURL var="addPermisesInfoUrl" id="/add/permises/info"></portlet:resourceURL>
<portlet:resourceURL var="addOperatorDetailInfoUrl" id="/add/operator/detail/info"></portlet:resourceURL>
<portlet:resourceURL var="addMultipleFloorStructureInfoUrl" id="/add/multiple/floor/structure/info"></portlet:resourceURL>
<portlet:resourceURL var="addFileProtectionEquipmentInfoUrl" id="/add/file/protection/equipment/info"></portlet:resourceURL>
<portlet:resourceURL var="addHazardousSubstanceInfoUrl" id="/add/hazardous/substance/info"></portlet:resourceURL>
<portlet:resourceURL var="addCertificatePurposeInfoUrl" id="/add/certificate/purpose/info"></portlet:resourceURL>
<% 
FireBrigadeSignatureInfo signatureInfo=null;
FireBrigadePremisesInfo fireBrigadePremisesInfo=null;
FireBrigadeOperatorDetail OperatorDetail=null;
FireBrigadeMultFloorInfo multFloorInfo=null;
FireBrigadeProEquipmentInfo ProtectionEquipmentInfo=null;
FireBrigadeHazardousSubInfo hazardousSubInfo=null;
FireBrigadeCerPurposeInfo certificatePurpose=null;
String signatureUrl=null;
if(fireBrigadeApplicationId>0){
try{
signatureUrl=GettingDocumentData.getSignaturePreviewUrl(themeDisplay, "Signature", themeDisplay.getScopeGroupId(), fireBrigadeApplicationId);
}catch(Exception e){}
try{
	 signatureInfo=	FireBrigadeSignatureInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
}catch(Exception e){
}
try{
fireBrigadePremisesInfo=FireBrigadePremisesInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
}catch(Exception e){
}
try{
	OperatorDetail=	FireBrigadeOperatorDetailLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
}catch(Exception e){
}
try{
	multFloorInfo=FireBrigadeMultFloorInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
}catch(Exception e){
}
try{
	ProtectionEquipmentInfo=FireBrigadeProEquipmentInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
}catch(Exception e){
}
try{
	hazardousSubInfo=FireBrigadeHazardousSubInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
}catch(Exception e){
}
try{
	certificatePurpose=FireBrigadeCerPurposeInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
}catch(Exception e){
}
}

%>
<div>
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="general-info-form">
				   <div class="row"> 
                         <div class="col-md-12"> 
                          <p class="tab-form-title f2">Applicant's Details</p>
                         </div>
                      </div>
					<div class="row">
						<div class="col-md-12">
							<!-- <p class="tab-form-title f2">Stakeholder Information</p> -->
							<p class="tab-form-title-subtitle f2">Please Read the Form Carefully and upload all required supporting documentation</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-main-heading"> 
								I hereby apply for <span class="giluio declaration-by"></span> to cover the period, I make the application as, 
								or on behalf of the owner/occupier of the premises. I will conform to the 
								stipulated requirements as recommended and will allow subsequent inspections and tests to be carried
								out, with a view of being granted certification. 
							</p>
							<p class="pt-2 common-para">Signature</p>
							<%
								if (Validator.isNotNull(signatureAppli)) {
							%>
								<div class="signature_texarea mb-2"
								id="signatureHolder">
								<img src="<%=signatureAppli%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-2"
								id="signatureHolder"></div>
							<%
								}
							%>
							<input type="file" id="signatureUploadBtn" name="<portlet:namespace/>signatureUploadBtn" hidden="" > 
							<label for="signatureUploadBtn" class="choose-sign-btn">
								<span class="mr-2"> <svg width="14" height="17"
										viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
										<path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
									</svg>
							</span> Upload Signature
							</label>
						</div>
						<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading" for="s">Title</p>
									<div class="select-wrapper position-relative">
										<select class="form-select form-control" name="pselect"
											id="title">
											<option selected="" disabled="">Please Select</option>
											<option value="Mr"<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getTitle().contains("Mr"))?"selected":""%>>Mr</option>	
											<option value="Mrs"<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getTitle().contains("Mrs"))?"selected":""%>>Mrs</option>
											<option value="Ms"<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getTitle().contains("Ms"))?"selected":""%>>Ms</option>
										</select>
									</div>
								</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Applicant Name*</p>
								<input type="text" class="form-control" id="signName" placeholder="Applicant Name" value="<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getName())?signatureInfo.getName():""%>"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="signNameValidation" style="color: red;">
									Please Enter Name</p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control" id="signTelephone" value="<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getTelephone())?signatureInfo.getTelephone():""%>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax</p>
								<input type="text" class="form-control" id="signFax" value="<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getFax())?signatureInfo.getFax():""%>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Applicant's TRN</p>
								<input type="text" class="form-control" id="applicantTrn" value="<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getTrn())?signatureInfo.getTrn():""%>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email*</p>
								<input type="text" class="form-control" placeholder="user@example.com" id="signEmail" value="<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getEmail())?signatureInfo.getEmail():""%>"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="signEmailValidation" style="color: red;"></p>
							</div> 
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="signDate" value="<%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getDate())?new SimpleDateFormat("yyyy-MM-dd").format(signatureInfo.getDate()):""%>"/>
							</div> 
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Applicant Address</p>
<textarea rows="3" id="signAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(signatureInfo)&&Validator.isNotNull(signatureInfo.getAddress())?signatureInfo.getAddress():""%></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="addSignatureInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="general-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Premises's Detail</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Is the premises</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Owned"<%=fireBrigadePremisesInfo!=null &&fireBrigadePremisesInfo.getPremises().equals("Owned")?"checked":StringPool.BLANK%> type="radio" name="premisesStatus">
										<label for="">Owned</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="Leased"<%=fireBrigadePremisesInfo!=null &&fireBrigadePremisesInfo.getPremises().equals("Leased")?"checked":StringPool.BLANK%> type="radio" name="premisesStatus">
										<label for="">Leased</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Was the premises certified before</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"<%=fireBrigadePremisesInfo!=null &&fireBrigadePremisesInfo.getPremisesCertified().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="premisesCertified">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"<%=fireBrigadePremisesInfo!=null &&fireBrigadePremisesInfo.getPremisesCertified().equals("No")?"checked":StringPool.BLANK%> type="radio" name="premisesCertified">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6 premisesCertifiedOption hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Expiration Date</p>
								<input type="date" class="form-control" id="expirationDate" value="<%=Validator.isNotNull(fireBrigadePremisesInfo)&&Validator.isNotNull(fireBrigadePremisesInfo.getExpirationDate())?new SimpleDateFormat("YYYY-dd-MM").format(fireBrigadePremisesInfo.getExpirationDate()):"" %>"/>
							</div>
						</div>
						<div class="col-md-6 premisesCertifiedOption hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Certificate Number</p>
								<input type="text" class="form-control" id="certificateNumber" value="<%=Validator.isNotNull(fireBrigadePremisesInfo)&&Validator.isNotNull(fireBrigadePremisesInfo.getCertificateNumber())?fireBrigadePremisesInfo.getCertificateNumber():""%>"/>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Premises Name*</p>
								<input type="text" class="form-control" id="name" value="<%=Validator.isNotNull(fireBrigadePremisesInfo)&&Validator.isNotNull(fireBrigadePremisesInfo.getName())?fireBrigadePremisesInfo.getName():""%>"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="nameValidation" style="color: red;">
									Please Enter Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Premises Address</p>
<textarea rows="3" id="address" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(fireBrigadePremisesInfo)&&Validator.isNotNull(fireBrigadePremisesInfo.getAddress())?fireBrigadePremisesInfo.getAddress():""%></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="addPremisesInfo(false);"
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
				<div class="general-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Operator's Detail</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Operator's Name*</p>
								<input type="text" class="form-control" id="operatorName" value="<%=Validator.isNotNull(OperatorDetail)&&Validator.isNotNull(OperatorDetail.getOperatorName())?OperatorDetail.getOperatorName():""%>"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="operatorNameValidation" style="color: red;">
									Please Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Business Name</p>
								<input type="text" class="form-control" id="businessName" value="<%=Validator.isNotNull(OperatorDetail)&&Validator.isNotNull(OperatorDetail.getBusinessName())?OperatorDetail.getBusinessName():""%>"/>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
<textarea rows="3" id="operatorAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(OperatorDetail)&&Validator.isNotNull(OperatorDetail.getAddress())?	OperatorDetail.getAddress():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Uses to which premises is put</p>
								<input type="text" class="form-control" id="premisesUses" value="<%=Validator.isNotNull(OperatorDetail)&&Validator.isNotNull(OperatorDetail.getPremisesUses())?OperatorDetail.getPremisesUses():"" %>"/>
							</div> 
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Is the Premises a</p>
								<div>
									<div class="wizard-form-radio d-block">
										<input value="Single floor structure occupancy"<%=OperatorDetail!=null &&OperatorDetail.getPremisesOccupancy().equals("Single floor structure occupancy")?"checked":StringPool.BLANK%> type="radio" name="premisesOccupancy">
										<label for="">Single floor structure occupancy</label>
									</div>
									<div class="wizard-form-radio d-block">
										<input value="Multiple floor structure occupancy"<%=OperatorDetail!=null &&OperatorDetail.getPremisesOccupancy().equals("Multiple floor structure occupancy")?"checked":StringPool.BLANK%> type="radio" name="premisesOccupancy">
										<label for="">Multiple floor structure occupancy</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Are there any other business/activities that are conducted on the same premises?</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"<%=OperatorDetail!=null &&OperatorDetail.getPremisesBusiness().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="premisesBusiness">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"<%=OperatorDetail!=null &&OperatorDetail.getPremisesBusiness().equals("No")?"checked":StringPool.BLANK%> type="radio" name="premisesBusiness">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Maximum number of persons to work on the premises</p>
								<input type="text" class="form-control" id="maxWorkingPersons" value="<%=Validator.isNotNull(OperatorDetail)&&Validator.isNotNull(OperatorDetail.getMaxWorkingPersons())?OperatorDetail.getMaxWorkingPersons():""%>"
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>
							</div> 
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Maximum number of persons other than workers 
								that are likely to be on the premises at any one time</p>
								<input type="text" class="form-control" id="maxNonWorkingPersons" value="<%=Validator.isNotNull(OperatorDetail)&&Validator.isNotNull(OperatorDetail.getMaxNumPersonsAtAnyOneTime())?OperatorDetail.getMaxNumPersonsAtAnyOneTime():""%>"
								oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>
							</div> 
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="addOperatorDetailInfo(false);"
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
				<p class="tab-form-title f2" id="floorStructureFormMessage"></p>
				<div class="floor-structure-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Multiple Floor Structure</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Are there alternate exits from each floors</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" <%=multFloorInfo!=null &&multFloorInfo.getFloorAlternateExist().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="floorAlternateExist">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"<%=multFloorInfo!=null &&multFloorInfo.getFloorAlternateExist().equals("No")?"checked":StringPool.BLANK%> type="radio"  name="floorAlternateExist">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Is there rising main throughout the building</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" <%=multFloorInfo!=null &&multFloorInfo.getBuildingRisingMain().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="buildingRisingMain">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" <%=multFloorInfo!=null &&multFloorInfo.getBuildingRisingMain().equals("No")?"checked":StringPool.BLANK%> type="radio"
											  name="buildingRisingMain">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Is there a connection for the Fire Brigade equipment</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"<%=multFloorInfo!=null &&multFloorInfo.getEquipmentConnection().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="equipmentConnection">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"<%=multFloorInfo!=null &&multFloorInfo.getEquipmentConnection().equals("No")?"checked":StringPool.BLANK%> type="radio" name="equipmentConnection">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Is there a parking garage on the building</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" <%=multFloorInfo!=null &&multFloorInfo.getBuildingParkingGarage().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="buildingParkingGarage">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" <%=multFloorInfo!=null &&multFloorInfo.getBuildingParkingGarage().equals("No")?"checked":StringPool.BLANK%> type="radio" name="buildingParkingGarage">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="nextForm();addMultipleFloorStructureInfo(false);"
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
				<div class="general-info-form">
					<div class="row">
						<div class="col-md-12">
						    <p class="tab-form-title f2">Fire Protection Equipment</p>
							<p class="tab-form-title-subtitle f2">Are there any of the following fire protection equipment on the premises?</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Check-off the equipment</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="equipmentProtection1" value="Hose Reels"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionPre().contains("Hose Reels")? "checked":StringPool.BLANK%> name="equipmentProtection" /> 
									<label for="equipmentProtection1">
										<p class="tab-form-main-heading mb-0">Hose Reels</p>
									</label>
								</div>
								<div class="form-group equipmentProtection1 hide">
									<p class="tab-form-main-heading">Is the equipment regularly maintained?</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionOne().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection1">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionOne().equals("No")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection1">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="equipmentProtection2" value="Portable Fire Extinguishers"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionPre().contains("Portable Fire Extinguishers")? "checked":StringPool.BLANK%> name="equipmentProtection" /> 
									<label for="equipmentProtection2">
										<p class="tab-form-main-heading mb-0">Portable Fire Extinguishers</p>
									</label>
								</div>
								<div class="form-group hide equipmentProtection2">
									<p class="tab-form-main-heading">Is the equipment regularly maintained?</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionTwo().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection2">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionTwo().equals("No")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection2">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="equipmentProtection3" value="Fire Alarm"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionPre().contains("Fire Alarm")? "checked":StringPool.BLANK%> name="equipmentProtection" /> 
									<label for="equipmentProtection3">
										<p class="tab-form-main-heading mb-0">Fire Alarm</p>
									</label>
								</div>
								<div class="form-group hide equipmentProtection3">
									<p class="tab-form-main-heading">Is the equipment regularly maintained?</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionThree().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection3">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionThree().equals("No")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection3">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="equipmentProtection4" value="Smoke/Heat detectors"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionPre().contains("Smoke/Heat detectors")? "checked":StringPool.BLANK%> name="equipmentProtection" /> 
									<label for="equipmentProtection4">
										<p class="tab-form-main-heading mb-0">Smoke/Heat detectors</p>
									</label>
								</div>
								<div class="form-group hide equipmentProtection4">
									<p class="tab-form-main-heading">Is the equipment regularly maintained?</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionFour().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection4">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionFour().equals("No")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection4">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="equipmentProtection5" value="Sprinkler System"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionPre().contains("Sprinkler System")? "checked":StringPool.BLANK%> name="equipmentProtection" /> 
									<label for="equipmentProtection5">
										<p class="tab-form-main-heading mb-0">Sprinkler System</p>
									</label>
								</div>
								<div class="form-group hide equipmentProtection5">
									<p class="tab-form-main-heading">Is the equipment regularly maintained?</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes" <%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionFive().equals("Yes")?"checked":StringPool.BLANK%>  type="radio" name="equipmentProtection5">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionFive().equals("No")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection5">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="equipmentProtection6" value="Hydrant"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionPre().contains("Hydrant")? "checked":StringPool.BLANK%> name="equipmentProtection" /> 
									<label for="equipmentProtection6">
										<p class="tab-form-main-heading mb-0">Hydrant</p>
									</label>
								</div>
								<div class="form-group hide equipmentProtection6">
									<p class="tab-form-main-heading">Is the equipment regularly maintained?</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionSix().equals("Yes")?"checked":StringPool.BLANK%>  type="radio" name="equipmentProtection6">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No" <%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionSix().equals("No")?"checked":StringPool.BLANK%> type="radio" name="equipmentProtection6">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="equipmentProtection7" value="Other"<%=ProtectionEquipmentInfo!=null &&ProtectionEquipmentInfo.getEquipmentProtectionPre().contains("Other")? "checked":StringPool.BLANK%> name="equipmentProtection" /> 
									<label for="equipmentProtection7">
										<p class="tab-form-main-heading mb-0">Other</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12 otherSpecify hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Please specify Other Equipment</p>
								<input type="text" class="form-control" id="otherEquipment" value="<%=Validator.isNotNull(ProtectionEquipmentInfo)&&Validator.isNotNull(ProtectionEquipmentInfo.getOtherEquipment())?ProtectionEquipmentInfo.getOtherEquipment():""%>"/>
							</div> 
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="nextForm();addFileProtectionEquipmentInfo(false);"
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
				<div class="general-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Hazardous Substances/Materials</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<div class="form-group">
									<p class="tab-form-main-heading">L.P.G. cylinder</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=hazardousSubInfo!=null &&hazardousSubInfo.getLpgCylinder().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="lpgCylinder">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=hazardousSubInfo!=null &&hazardousSubInfo.getLpgCylinder().equals("No")?"checked":StringPool.BLANK%> type="radio" name="lpgCylinder">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">Flammable Gases</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=hazardousSubInfo!=null &&hazardousSubInfo.getFlammableGases().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="flammableGases">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No" <%=hazardousSubInfo!=null &&hazardousSubInfo.getFlammableGases().equals("No")?"checked":StringPool.BLANK%> type="radio" name="flammableGases">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">Flammable & Combustible Liquid</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=hazardousSubInfo!=null &&hazardousSubInfo.getFlammableCombustibleLiquid().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="flammableCombustibleLiquid">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=hazardousSubInfo!=null &&hazardousSubInfo.getFlammableCombustibleLiquid().equals("No")?"checked":StringPool.BLANK%> type="radio" name="flammableCombustibleLiquid">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">Chemicals (liquid)</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=hazardousSubInfo!=null &&hazardousSubInfo.getChemicalsLiquid().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="chemicalsLiquid">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=hazardousSubInfo!=null &&hazardousSubInfo.getChemicalsLiquid().equals("No")?"checked":StringPool.BLANK%> type="radio" name="chemicalsLiquid">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">Chemicals (powder)</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=hazardousSubInfo!=null &&hazardousSubInfo.getChemicalsPowder().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="chemicalsPowder">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=hazardousSubInfo!=null &&hazardousSubInfo.getChemicalsPowder().equals("No")?"checked":StringPool.BLANK%> type="radio" name="chemicalsPowder">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">Explosives</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes"<%=hazardousSubInfo!=null &&hazardousSubInfo.getExplosives().equals("Yes")?"checked":StringPool.BLANK%> type="radio" name="explosives">
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No"<%=hazardousSubInfo!=null &&hazardousSubInfo.getExplosives().equals("No")?"checked":StringPool.BLANK%> type="radio" name="explosives">
											<label for="">No</label>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please specify Other hazardous substance/materials</p>
								<input type="text" class="form-control" id="otherHazardousSubstance" value="<%=Validator.isNotNull(hazardousSubInfo)&&Validator.isNotNull(hazardousSubInfo.getOtherHazardousSubstance())?hazardousSubInfo.getOtherHazardousSubstance():""%>"/>
							</div> 
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="nextForm();addHazardousSubstanceInfo(false);"
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
				<div class="general-info-form">
					<div class="row">
						<div class="col-md-12">
						    <p class="tab-form-title f2">Certificate Purpose</p>
							<p class="tab-form-title-subtitle f2">Please Read the Form Carefully and upload all required supporting documentation</p>
						</div>
					</div>
					<div class="row">
						<!-- E Section F Section -->
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Purpose for which certificate is being requested</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="certificatePurpose1" value="Event hosting"
									<%=certificatePurpose!=null &&certificatePurpose.getCertificatePurposePre().contains("Event hosting")? "checked":StringPool.BLANK%>
									 name="certificatePurpose" /> 
									<label for="certificatePurpose1">
										<p class="tab-form-main-heading mb-0">Event hosting</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="certificatePurpose2" value="Operation of premises"
									<%=certificatePurpose!=null &&certificatePurpose.getCertificatePurposePre().contains("Operation of premises")? "checked":StringPool.BLANK%>
									 name="certificatePurpose" /> 
									<label for="certificatePurpose2">
										<p class="tab-form-main-heading mb-0">Operation of premises</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="certificatePurpose3" value="General Building Certification"
									<%=certificatePurpose!=null &&certificatePurpose.getCertificatePurposePre().contains("General Building Certification")? "checked":StringPool.BLANK%>
									 name="certificatePurpose" /> 
									<label for="certificatePurpose3">
										<p class="tab-form-main-heading mb-0">General Building Certification</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="certificatePurpose4" value="Demolition"<%=certificatePurpose!=null &&certificatePurpose.getCertificatePurposePre().contains("Demolition")? "checked":StringPool.BLANK%>
									 name="certificatePurpose" /> 
									<label for="certificatePurpose4">
										<p class="tab-form-main-heading mb-0">Demolition</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="certificatePurpose5" value="Fire-works Display"
									<%=certificatePurpose!=null &&certificatePurpose.getCertificatePurposePre().contains("Fire-works Display")? "checked":StringPool.BLANK%> name="certificatePurpose" /> 
									<label for="certificatePurpose5">
										<p class="tab-form-main-heading mb-0">Fire-works Display</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="certificatePurpose6" value="Other"
									<%=certificatePurpose!=null &&certificatePurpose.getCertificatePurposePre().contains("Other")? "checked":StringPool.BLANK%> name="certificatePurpose" /> 
									<label for="certificatePurpose6">
										<p class="tab-form-main-heading mb-0">Other</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12 otherCertificatePurpose hide">
							<div class="form-group">
								<p class="tab-form-main-heading">Please Specify Other Purpose for which certificate is being requested</p>
								<input type="text" class="form-control" id="otherCertificatePurpose" value="<%=Validator.isNotNull(certificatePurpose)&&Validator.isNotNull(certificatePurpose.getOtherCertificatePurpose())?certificatePurpose.getOtherCertificatePurpose():""%>"/>
							</div> 
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$(document).on('change', '#signatureUploadBtn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#signatureHolder");
    var form1a_image_holder = $("#signatureHolderPre");
    image_holder.empty();
    form1a_image_holder.empty();
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
      if (typeof(FileReader) != "undefined") {
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image",
                "height":"100",
                "width":"100"
              }).appendTo(form1a_image_holder);
          }
          image_holder.show();
          reader.readAsDataURL($(this)[0].files[i]);
        }
      } else {
        alert("This browser does not support FileReader.");
      }
    } else {
      alert("Pls select only images");
    }
  });
$("input[name='premisesCertified']").change(function(){
	if($(this).val() == "Yes"){
		$(".premisesCertifiedOption, .premisesCertifiedOptionPre").removeClass("hide");
	}else{
		$(".premisesCertifiedOption, .premisesCertifiedOptionPre").addClass("hide");
	}
});
$("input[name='premisesOccupancy']").change(function(){
	if($(this).val() == "Single floor structure occupancy"){
		$(".floor-structure-info-form, .floor-structure-info-form-pre").addClass("hide");
		$("#floorStructureFormMessage").html("You have Single floor structure occupancy , so no need to fill out this form, Please move forward.");
		$("#floorStructureFormMessagePre").html("You have Single floor structure occupancy");
	}else{
		$(".floor-structure-info-form, .floor-structure-info-form-pre").removeClass("hide");
		$("#floorStructureFormMessage, #floorStructureFormMessagePre").html("");
	}
});
$("input[name='equipmentProtection']").change(function(){
    var targetData = $(this).attr('id');
    $("." + targetData).toggleClass("hide");
    if($(this).val() == 'Other'){
        $(".otherSpecify, .otherSpecifyPre").toggleClass("hide");
    }
});
$("input[name='certificatePurpose']").change(function(){
    var targetData = $(this).attr('id');
    $("." + targetData).toggleClass("hide");
    if($(this).val() == 'Other'){
        $(".otherCertificatePurpose, .otherCertificatePurposePre").toggleClass("hide");
    }
});

function addSignatureInfo(isSaveAndContinue){
	title = $("#title").val();
	signName = $("#signName").val();
	signTelephone = $("#signTelephone").val();
	signFax = $("#signFax").val();
	applicantTrn = $("#applicantTrn").val();
	signEmail = $("#signEmail").val();
	signDate = $("#signDate").val();
	signAddress = $("#signAddress").val();
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
	submitForm= true;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!isSaveAndContinue){
		if(!signEmail){
			  $("#signEmailValidation").removeClass("hide");
			  $("#signEmailValidation").text("Please Enter E-mail address");
			  $("#signEmail").focus();
			  submitForm= false;
		  }else if(signEmail.match(mailformat)){ 
				$("#signEmailValidation").addClass("hide");
			}else
				{
					$("#signEmailValidation").removeClass("hide");
					$("#signEmailValidation").text("You have entered an invalid email address");
					$("#signEmail").focus();
					submitForm= false;
				}
		if(!signName){
			$("#signName").focus();
			$("#signNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#signNameValidation").addClass("hide");
		}
	}
	if(submitForm){
	 $.ajax({
		    type: "POST",
		    url: "${addSignatureInfoUrl}",
		    data: {
		    	  "<portlet:namespace/>title": title,
		    	  "<portlet:namespace/>signName": signName,
		    	  "<portlet:namespace/>signTelephone": signTelephone,
		    	  "<portlet:namespace/>signFax": signFax,
		    	  "<portlet:namespace/>applicantTrn": applicantTrn,
		    	  "<portlet:namespace/>signEmail": signEmail,
		    	  "<portlet:namespace/>signDate": signDate,
		    	  "<portlet:namespace/>signAddress": signAddress,
		    	  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
		      		    },
		    success: function (data) { 
		    	uploadDocuments('signatureUploadBtn','Signature','signatureUploadInFireBrigadeUrl');
		    	if(!isSaveAndContinue){
		    		 nextForm(); 
		    	}
				/* pendingFireBrigadeApplication(); */
	    	},
		    error: function (data) {
		    },
		  });
	}
}

function addPremisesInfo(isSaveAndContinue){
	premisesStatus = $("input[name='premisesStatus']:checked").val();
	premisesCertified = $("input[name='premisesCertified']:checked").val();
	expirationDate = $("#expirationDate").val();
	certificateNumber = $("#certificateNumber").val();
	name = $("#name").val();
	address = $("#address").val();
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
	submitForm= true;
	
	if(!isSaveAndContinue){
		if(!name){
			$("#name").focus();
			$("#nameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#nameValidation").addClass("hide");
		}
	}
	if(submitForm){
	 $.ajax({
		    type: "POST",
		    url: "${addPermisesInfoUrl}",
		    data: {
		    	  "<portlet:namespace/>premisesStatus": premisesStatus,
		    	  "<portlet:namespace/>premisesCertified": premisesCertified,
		    	  "<portlet:namespace/>expirationDate": expirationDate,
		    	  "<portlet:namespace/>certificateNumber": certificateNumber,
		    	  "<portlet:namespace/>name": name,
		    	  "<portlet:namespace/>address": address,
		    	  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
		      		    },
		    success: function (data) { 
		    	if(!isSaveAndContinue){
		    		nextForm();
		    	}
				pendingFireBrigadeApplication();
	    	},
		    error: function (data) {
		    },
		  });
	}
}

function addOperatorDetailInfo(isSaveAndContinue){
	operatorName = $("#operatorName").val();
	businessName = $("#businessName").val();
	operatorAddress = $("#operatorAddress").val();
	premisesUses = $("#premisesUses").val();
	premisesOccupancy = $("input[name='premisesOccupancy']:checked").val();
	premisesBusiness = $("input[name='premisesBusiness']:checked").val();
	maxWorkingPersons = $("#maxWorkingPersons").val();
	maxNonWorkingPersons = $("#maxNonWorkingPersons").val();
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
	submitForm= true;
	if(!isSaveAndContinue){
		if(!operatorName){
			$("#operatorName").focus();
			$("#operatorNameValidation").removeClass("hide");
			submitForm = false;
		}else{
			$("#operatorNameValidation").addClass("hide");
		}
	}
	if(submitForm){
	 $.ajax({
		    type: "POST",
		    url: "${addOperatorDetailInfoUrl}",
		    data: {
		    	  "<portlet:namespace/>operatorName": operatorName,
		    	  "<portlet:namespace/>businessName": businessName,
		    	  "<portlet:namespace/>operatorAddress": operatorAddress,
		    	  "<portlet:namespace/>premisesUses": premisesUses,
		    	  "<portlet:namespace/>premisesOccupancy": premisesOccupancy,
		    	  "<portlet:namespace/>premisesBusiness": premisesBusiness,
		    	  "<portlet:namespace/>maxWorkingPersons": maxWorkingPersons,
		    	  "<portlet:namespace/>maxNonWorkingPersons": maxNonWorkingPersons,
		    	  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
		      		    },
		    success: function (data) {
		    	if(!isSaveAndContinue){
		    	   nextForm();
		    	}
		    	$("#fireBrigadeFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				pendingFireBrigadeApplication();
	    	},
		    error: function (data) {
		    },
		  });
	}
}

function addMultipleFloorStructureInfo(isSaveAndContinue){
	floorAlternateExist = $("input[name='floorAlternateExist']:checked").val();
	buildingRisingMain = $("input[name='buildingRisingMain']:checked").val();
	equipmentConnection = $("input[name='equipmentConnection']:checked").val();
	buildingParkingGarage = $("input[name='buildingParkingGarage']:checked").val();	
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
	 $.ajax({
		    type: "POST",
		    url: "${addMultipleFloorStructureInfoUrl}",
		    data: {
		    	  "<portlet:namespace/>floorAlternateExist": floorAlternateExist,
		    	  "<portlet:namespace/>buildingRisingMain": buildingRisingMain,
		    	  "<portlet:namespace/>equipmentConnection": equipmentConnection,
		    	  "<portlet:namespace/>buildingParkingGarage": buildingParkingGarage,
		    	  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
		      		    },
		    success: function (data) { 
			pendingFireBrigadeApplication();
	    	},
		    error: function (data) {
		    },
		  });
}

function addFileProtectionEquipmentInfo(isSaveAndContinue){
	var equipmentProtection=new Array();
    $("input:checkbox[name=equipmentProtection]:checked").each(function(){
	equipmentProtection.push($(this).val());
        });
    equipmentProtectionPre = equipmentProtection.toString(); 
    equipmentProtectionOne = $("input[name='equipmentProtection1']:checked").val();
    equipmentProtectionTwo = $("input[name='equipmentProtection2']:checked").val();
    equipmentProtectionThree = $("input[name='equipmentProtection3']:checked").val();
    equipmentProtectionFour = $("input[name='equipmentProtection4']:checked").val();
    equipmentProtectionFive = $("input[name='equipmentProtection5']:checked").val();
    equipmentProtectionSix = $("input[name='equipmentProtection6']:checked").val();
    otherEquipment = $("#otherEquipment").val();
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
	 $.ajax({
		    type: "POST",
		    url: "${addFileProtectionEquipmentInfoUrl}",
		    data: {
		    	  "<portlet:namespace/>equipmentProtectionPre": equipmentProtectionPre,
		    	  "<portlet:namespace/>equipmentProtectionOne": equipmentProtectionOne,
		    	  "<portlet:namespace/>equipmentProtectionTwo": equipmentProtectionTwo,
		    	  "<portlet:namespace/>equipmentProtectionThree": equipmentProtectionThree,
		    	  "<portlet:namespace/>equipmentProtectionFour": equipmentProtectionFour,
		    	  "<portlet:namespace/>equipmentProtectionFive": equipmentProtectionFive,
		    	  "<portlet:namespace/>equipmentProtectionSix": equipmentProtectionSix,
		    	  "<portlet:namespace/>otherEquipment": otherEquipment,
		    	  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
		      		    },
		    success: function (data) { 
			pendingFireBrigadeApplication();
	    	},
		    error: function (data) {
		    },
		  });
}

function addHazardousSubstanceInfo(isSaveAndContinue){
	lpgCylinder = $("input[name='lpgCylinder']:checked").val();
	flammableGases = $("input[name='flammableGases']:checked").val();
	flammableCombustibleLiquid = $("input[name='flammableCombustibleLiquid']:checked").val();
	chemicalsLiquid = $("input[name='chemicalsLiquid']:checked").val();	
	chemicalsPowder = $("input[name='chemicalsPowder']:checked").val();
	explosives = $("input[name='explosives']:checked").val();
	otherHazardousSubstance = $("#otherHazardousSubstance").val();
	fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
	 $.ajax({
		    type: "POST",
		    url: "${addHazardousSubstanceInfoUrl}", 
		    data: {
		    	  "<portlet:namespace/>lpgCylinder": lpgCylinder,
		    	  "<portlet:namespace/>flammableGases": flammableGases,
		    	  "<portlet:namespace/>flammableCombustibleLiquid": flammableCombustibleLiquid,
		    	  "<portlet:namespace/>chemicalsLiquid": chemicalsLiquid,
		    	  "<portlet:namespace/>chemicalsPowder": chemicalsPowder,
		    	  "<portlet:namespace/>explosives": explosives,
		    	  "<portlet:namespace/>otherHazardousSubstance": otherHazardousSubstance,
		    	  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
		      		    },
		    success: function (data) { 
			pendingFireBrigadeApplication();
	    	},
		    error: function (data) {
		    },
		  });
	}
	function addCertificatePurposeInfo(isSaveAndContinue){
		var certificatePurpose = new Array();
		$("input:checkbox[name=certificatePurpose]:checked").each(function(){
			certificatePurpose.push($(this).val());
		});
		certificatePurposePre = certificatePurpose.toString();
		otherCertificatePurpose = $("#otherCertificatePurpose").val();
		fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
		 $.ajax({
			    type: "POST",
			    url: "${addCertificatePurposeInfoUrl}",
			    data: {
			    	  "<portlet:namespace/>certificatePurposePre": certificatePurposePre,
			    	  "<portlet:namespace/>otherCertificatePurpose": otherCertificatePurpose,
			    	  "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
			      		    },
			    success: function (data) { 
		    	},
			    error: function (data) {
			    },
			  });
		}

</script>