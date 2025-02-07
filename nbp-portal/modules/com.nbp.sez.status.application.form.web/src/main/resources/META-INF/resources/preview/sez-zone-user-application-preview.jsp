<%@page import="com.nbp.sez.status.upload.document.commands.GettingDocumentData"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo"%>
<%@ include file="/init.jsp" %>
<%
String zoneUndertakingSign="";
String zoneDeveloperSign="";
String zoneDEveloperNotarySign="";
String zoneUndertakingNotarySign="";
String zoneSubmissionSign="";

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
%> 
<div class="" id="sezZoneApplicationPreview">
	<section class="final-preview-section" id="sezPreview20">
		<div class="general-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Business Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="zone-general-list-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">1. Application date</p>
						<p class="sub_heading_content" id="zoneUserAppDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">2. Name of SEZ Developer</p>
						<p class="sub_heading_content" id="sezZoneUserDevNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">3. Name of the SEZ (location)</p>
						<p class="sub_heading_content" id="sezZoneUserLocNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">4. SEZ Developer's Control Number</p>
						<p class="sub_heading_content" id="sezZoneDevControlNumPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>5. Name and full address of applicant firm/ company</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="zoneUserCompanyNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="zoneUserCompanyStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="zoneUserCompanyTownPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="zoneUserCompanyParishPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>6. Name and address of Authorised Representative for the Zone User application</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="zoneUserAuthRepNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="zoneUserAuthRepStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="zoneUserAuthRepTownPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish/Post /Zip Code</p>
						<p class="sub_heading_content" id="zoneUserAuthRepZipCodePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Country</p>
						<p class="sub_heading_content" id="zoneUserAuthRepCountryPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>7. State the name of the Sponsor /Registered Head Office in case local company is part of Multi- National Corporation (MNC)</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="zoneUserSponsorComNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="zoneUserSponsorStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="zoneUserSponsorTownPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Post/Zip Code</p>
						<p class="sub_heading_content" id="zoneUserSponsorZipCodePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Country</p>
						<p class="sub_heading_content" id="zoneUserSponsorCountryPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">8. Are you an existing Jamaican Company under the Companies Act, 2004 (Act 10 of 2004)?</p>
						<p class="sub_heading_content" id="zoneUserExistingComPreview"></p>
					</div>
				</div>
			</div>
			<div class="row hide" id="zoneUserExistingComBoxPre">
				<div class="col-12"> 
					<div>
						<p class="sub_heading">Please select the form of the articles of incorporation</p> 
						<p class="sub_heading_content" id="zoneUserFormArticlePreview"></p>
					</div>
				</div>
				<div class="col-12 hide" id="zoneUserFormArticleOtherBoxPre">
					<div>
						<p class="sub_heading">Please specify</p>
						<p class="sub_heading_content" id="zoneUserFormArticleOtherPreview"></p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-6">
					<div>
						<p class="sub_heading">9. Non-Resident Jamaican Company</p>
						<p class="sub_heading_content" id="zoneUserNonResiComPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">10. Taxpayer Registration Number (TRN)</p>
						<p class="sub_heading_content" id="zoneUserTRNPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">11. General Consumption Tax Number (GCT)</p>
						<p class="sub_heading_content" id="zoneUserGCTPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">12. Tax Compliance Certificate Number (TCC)</p>
						<p class="sub_heading_content" id="zoneUserTCCPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview21">
		<div class="proposed-project-info-form">
			<div  class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Existing and/or Proposed Project Brief</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="zone-proposed-project-list-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">13. Has the applicant ever been denied approval to operate as a SEZ entity?</p>
						<p class="sub_heading_content" id="zoneUserEntityDeniedApprPreview"></p>
					</div>
				</div>
				<div class="col-6 zoneUserDeniedFreeZoneApprDataPre hide">
					<div>
						<p class="sub_heading">Date of application</p>
						<p class="sub_heading_content" id="zoneUserDeniedApprDatePreview"></p>
					</div>
				</div>
				<div class="col-6 zoneUserDeniedFreeZoneApprData hide">
					<div>
						<p class="sub_heading">Type of project proposed</p>
						<p class="sub_heading_content" id="zoneUserDeniedApprProjectTypePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">14. Does your company have any other location(s) with SEZ/Free Zone status?</p>
						<p class="sub_heading_content" id="zoneUserFreeZoneLocationPreview"></p>
					</div>
				</div>
			</div>
			<div class="row hide" id="zoneUserFreeZoneLocBoxPre">
				<div class="col-12">
					<div>
						<p>location(s)</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="zoneUserFreeZoneLocTable">
							<tr>
								<th class="sub_heading">SEZ Developers Code/Location</th>
								<th class="sub_heading">Description/Type of Activity</th>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col-12"> 
					<p>15. Address of Leased Premises</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Lot/Building No. and Street Address</p>
						<p class="sub_heading_content" id="zoneUserLeasedBuildingNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="zoneUserLeasedTownPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="zoneUserLeasedParishPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>15.b. State lease term</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Years</p>
						<p class="sub_heading_content" id="zoneUserLeaseYearsPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">15.c. Volume</p>
						<p class="sub_heading_content" id="zoneUserVolumePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Folio</p>
						<p class="sub_heading_content" id="zoneUserFolioPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">15.d. Floor Number/s</p>
						<p class="sub_heading_content" id="zoneUserFloorNumPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview22">
		<div class="investment-plan-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Investment and Financial Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="zone-investment-plan-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-12">
					<p>16. Estimated Level of Investment (USD):</p>
				</div>
				<div class="col-md-12">
					<p>i. Infrastructure</p>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">a. Building/facilities</p>
						<p class="sub_heading_content" id="zoneUserInfraBuildingPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">b. Equipment</p>
						<p class="sub_heading_content" id="zoneUserInfraEquipmentPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">c. Machines</p>
						<p class="sub_heading_content" id="zoneUserInfraMachinesPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">d. Total</p>
						<p class="sub_heading_content" id="zoneUserInfraTotalPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">ii. Source(s) of finance</p>
						<p class="sub_heading_content" id="selectedZoneUserFinanceSourcePreview"></p>
					</div>
				</div>
				<div class="col-md-12 hide" id="zoneUserOtherFinanceSourceBoxPre">
					<div>
						<p class="sub_heading">Please Specify Other Source(s) of finance</p>
						<p class="sub_heading_content" id="zoneUserOtherFinanceSourcePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview23">
		<div class="employment-plan-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Employment Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="zone-employment-plan-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>17. Projected labour requirement over a three year period</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="zoneUserLabourReqTable">
							<tr>
								<th class="sub_heading">Year</th>
								<th class="sub_heading">Direct</th>
								<th class="sub_heading">Male</th>
								<th class="sub_heading">Female</th>
								<th class="sub_heading">Local</th>
								<th class="sub_heading">Foreign</th>
							</tr>
							<% if(Validator.isNotNull(sezZoneEmpInfo)&&sezZoneEmpInfo.size()>0){
								int zoneUserLabourReqCounter = 1;
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
	</section>
	<section class="final-preview-section" id="sezPreview24">
		<div class="zone-undertaking-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Zone User's Undertaking</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="zone-undertaking-info-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title of declarant for Zone User application</p>
						<p class="sub_heading_content" id="zoneUserDeclarantTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of declarant for Zone User application</p>
						<p class="sub_heading_content" id="zoneUserDeclarantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="zoneUserDeclarantTeleNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">E-mail Address</p>
						<p class="sub_heading_content" id="zoneUserDeclarantEmailPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Official Seal/Stamp</p> 
				</div>
				<div class="col-12">
					<!-- <p class="sub_heading"> 
						I,<span class="giluio declaration-by"></span>, hereby authorise the MOT Authority, or its duly authorised representative, to validate the accuracy of the information provided in connection with this application for a License. I understand that the MOT Authority may utilise independent agencies to assist in checking such information, and I specifically authorize such an investigation by information services and outside entities of the MOT Authority's choice. I also understand that by not signing, I am withholding my permission and that in such a case, no investigation will be done, and my application for a License will not be processed. 
					</p> -->
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="zone-user-applicant-sign-image-holder-pre">
					<%if(Validator.isNotNull(zoneUndertakingSign)){ %>
							<img src="<%=zoneUndertakingSign%>"  width="100" height="100"/>
							<%} %>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="zoneUserApplicantSignatureDatePreview"></p> 
					</div> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Notary Public Name</p>
						<p class="sub_heading_content" id="zoneUserPublicNotaryNamePreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Official Seal/Stamp</p> 
				</div>
				<div class="col-12">
					<!-- <p class="sub_heading"> 
						I,<span class="giluio declaration-by"></span>, hereby authorise the MOT Authority, or its duly authorised representative, to validate the accuracy of the information provided in connection with this application for a License. I understand that the MOT Authority may utilise independent agencies to assist in checking such information, and I specifically authorize such an investigation by information services and outside entities of the MOT Authority's choice. I also understand that by not signing, I am withholding my permission and that in such a case, no investigation will be done, and my application for a License will not be processed. 
					</p> -->
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="zone-user-public-notary-sign-image-holder-pre">
					<%if(Validator.isNotNull(zoneUndertakingNotarySign)){ %>
							<img src="<%=zoneUndertakingNotarySign%>"  width="100" height="100"/>
							<% }%>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="zoneUserPublicNotarySignatureDatePreview"></p>
					</div> 
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview25">
		<div class="zone-dev-undertaking-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Developer's Undertaking</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="zone-dev-undertaking-info-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Developers Name</p>
						<p class="sub_heading_content" id="zoneDevUndertakingDevNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Letter of Approval No.</p>
						<p class="sub_heading_content" id="zoneDevUndertakingApprLetterPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="zoneDevUndertakingDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">SEZ Developer's Agreement No.</p>
						<p class="sub_heading_content" id="zoneDevUndertakingAgreeNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="zoneDevUndertakingAgreeDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">SEZ Developer's Control Number</p>
						<p class="sub_heading_content" id="zoneDevUndertakingControlNumPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Developer's signature and certification</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title of declarant for Developer</p>
						<p class="sub_heading_content" id="zoneDevApplicantTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of declarant for Developer</p>
						<p class="sub_heading_content" id="zoneDevApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="zoneDevApplicantTelePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">E-mail Address</p>
						<p class="sub_heading_content" id="zoneDevApplicantEmailPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Official Seal/Stamp</p> 
				</div>
				<div class="col-12">
					<!-- <p class="sub_heading"> 
						I,<span class="giluio declaration-by"></span>, hereby authorise the MOT Authority, or its duly authorised representative, to validate the accuracy of the information provided in connection with this application for a License. I understand that the MOT Authority may utilise independent agencies to assist in checking such information, and I specifically authorize such an investigation by information services and outside entities of the MOT Authority's choice. I also understand that by not signing, I am withholding my permission and that in such a case, no investigation will be done, and my application for a License will not be processed. 
					</p> -->
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="zone-user-dev-applicant-sign-image-holder-pre">
					<%if(Validator.isNotNull(zoneDeveloperSign)){ %>
							<img src="<%=zoneDeveloperSign%>"  width="100" height="100"/>
							<%} %>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="zoneDevApplicantSignatureDatePreview"></p>
					</div> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Notary Public/Justice of the Peace</p>
						<p class="sub_heading_content" id="zoneDevPublicNotaryNamePreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Official Seal/Stamp</p> 
				</div>
				<div class="col-12">
					<!-- <p class="sub_heading"> 
						I,<span class="giluio declaration-by"></span>, hereby authorise the MOT Authority, or its duly authorised representative, to validate the accuracy of the information provided in connection with this application for a License. I understand that the MOT Authority may utilise independent agencies to assist in checking such information, and I specifically authorize such an investigation by information services and outside entities of the MOT Authority's choice. I also understand that by not signing, I am withholding my permission and that in such a case, no investigation will be done, and my application for a License will not be processed. 
					</p> -->
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="zone-user-dev-public-notary-sign-image-holder-pre">
					<%if(Validator.isNotNull(zoneDEveloperNotarySign)){ %>
							<img src="<%=zoneDEveloperNotarySign%>"  width="100" height="100"/>
							<%} %>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="zone-dev-up-notary-signature-datePreview"></p>
					</div> 
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview26">
		<div class="zone-submission-checklist-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Submission Checklist</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="zone-submission-checklist-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">General</p> 
						<p class="sub_heading_content" id="selectedZoneUserGeneralReqPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Company Information</p> 
						<p class="sub_heading_content" id="selectedZoneUserComInfoReqPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Sworn Statements</p> 
						<p class="sub_heading_content" id="selectedZoneSwornStateReqPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Occupancy Requirement</p> 
						<p class="sub_heading_content" id="selectedZoneOccupancyReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Approvals</p> 
						<p class="sub_heading_content" id="selectedZoneUserApprovalsPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Name</p> 
						<p class="sub_heading_content" id="zoneUserNameReqPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="zoneUserDateReqPreview"></p>
					</div> 
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="zone-user-sign-req-image-holder-pre"><%if(Validator.isNotNull(zoneSubmissionSign)){ %>
							<img src="<%=zoneSubmissionSign%>"  width="100" height="100"/>
							<%} %></div>
				</div>
			</div>
		</div>
	</section>
</div>