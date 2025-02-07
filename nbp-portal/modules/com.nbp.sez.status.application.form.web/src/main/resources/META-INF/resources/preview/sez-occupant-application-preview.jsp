<%@page import="com.nbp.sez.status.upload.document.commands.GettingDocumentData"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo"%>
<%@ include file="/init.jsp" %> 
<%
String occuUnderTakingSign="";
String occuUnderTakingNotarySign="";
String occDeveloperTakingSign="";
String occDeveloperTakingNotary="";
String occChecklistsign="";
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
%>
<div class="hide" id="sezOccApplicationPreview">
	<section class="final-preview-section" id="sezPreview11">
		<div class="general-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Business Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-general-list-edit-tab">
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
						<p class="sub_heading_content" id="occAppDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading" for="occSezDevName">2. Name of SEZ Developer</p>
						<p class="sub_heading_content" id="occSezDevNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">3. SEZ Developer's Control Number</p>
						<p class="sub_heading_content" id="occSezDevControlNumPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>4. Name and full address of applicant firm/ company</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="occCompanyNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="occCompanyStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="occCompanyTownPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="occCompanyParishPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>5. Name and address of Authorised Representative applying on applicant's behalf</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="occAuthRepNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="occAuthRepStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="occAuthRepTownPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish/Post /Zip Code</p>
						<p class="sub_heading_content" id="occAuthRepZipCodePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Country</p>
						<p class="sub_heading_content" id="occAuthRepCountryPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>6. Name of the Sponsor /Registered Head Office in case local company is part of Multi-National Corporation (MNC)</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="occSponsorComNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="occSponsorStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="occSponsorTownPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Post/Zip Code</p>
						<p class="sub_heading_content" id="occSponsorZipCodePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Country</p>
						<p class="sub_heading_content" id="occSponsorCountryPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">7. Are you an existing Jamaican Company under the Companies Act, 2004 (Act 10 of 2004)?</p>
						<p class="sub_heading_content" id="occExistingComPreview"></p>
					</div>
				</div>
			</div>
			<div class="row hide" id="occExistingComBoxPre">
				<div class="col-12 pt-3"> 
					<div>
						<p class="sub_heading">8. Please select the form of the articles of incorporation</p> 
						<p class="sub_heading_content" id="occFormArticlePreview"></p>
					</div>
				</div>
				<div class="col-12 hide" id="occFormArticleOtherBoxPre">
					<div>
						<p class="sub_heading">Please specify</p>
						<p class="sub_heading_content" id="occFormArticleOtherPreview"></p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<div>
						<p class="sub_heading">9. Taxpayer Registration Number (TRN)</p>
						<p class="sub_heading_content" id="occTRNPreview"></p>
					</div>
				</div>
				<div class="col-4">
					<div>
						<p class="sub_heading">10. General Consumption Tax Number (GCT)</p>
						<p class="sub_heading_content" id="occGCTPreview"></p>
					</div>
				</div>
				<div class="col-4">
					<div>
						<p class="sub_heading">11. Tax Compliance Certificate Number (TCC)</p>
						<p class="sub_heading_content" id="occTCCPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview12">
		<div class="shareholder-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Shareholding/Partnership/Director Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-director-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>12. Equity/Share Capital participation including Foreign Investment (in US$)</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">a. Authorised</p>
						<p class="sub_heading_content" id="occAuthorisedPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">b. Subscribed</p>
						<p class="sub_heading_content" id="occSubscribedPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">c. Paid up capital</p>
						<p class="sub_heading_content" id="occPaidCapitalPreview"></p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<div>
						<p>13. Details of each Director/Partner/Sponsor</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="occDirectorDetailTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Building No. and Street Address</th>
								<th class="sub_heading">Zip/Postal Code</th>
								<th class="sub_heading">Country</th>
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
				<div class="col-12">
					<div>
						<p>14. Principal Shareholders/Directors shareholding</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="occDirectorShareholderTable">
							<tr>
								<th class="sub_heading">Shareholder Name</th>
								<th class="sub_heading">Nationality</th>
								<th class="sub_heading">No. of Shares</th>
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
				<div class="col-12">
					<div>
						<p>15. Principal officers</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="occPrincipalOfficersTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Position</th>
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
	</section>
	<section class="final-preview-section" id="sezPreview13">
		<div class="business-plan-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Existing and/or Proposed Project Brief</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-proposed-project-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">16. Brief description of business</p>
						<p class="sub_heading_content" id="occBusinessDescPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">17. Has the applicant ever been denied approval to operate as a Free Zone or SEZ entity?</p>
						<p class="sub_heading_content" id="occDeniedFreeZoneApprPreview"></p>
					</div>
				</div>
				<div class="col-6 occDeniedFreeZoneApprDataPre hide">
					<div>
						<p class="sub_heading">Date of application</p>
						<p class="sub_heading_content" id="occDeniedFreeZoneApprDatePreview"></p>
					</div>
				</div>
				<div class="col-6 occDeniedFreeZoneApprDataPre hide">
					<div>
						<p class="sub_heading">Type of project proposed</p>
						<p class="sub_heading_content" id="occDeniedFreeZoneApprTypePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">18. Does your company have any other location(s) with SEZ/Free Zone status?</p>
						<p class="sub_heading_content" id="occFreeZoneLocationPreview"></p>
					</div>
				</div>
			</div>
			<div class="row hide" id="occFreeZoneLocBoxPre">
				<div class="col-12">
					<div>
						<p>location(s)</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="occFreeZoneLocTable">
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
					<p>19. Location of Occupant Sub-Concession Lease</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Lot/Building No. and Street Address</p>
						<p class="sub_heading_content" id="occSubConcessionBuildingPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="occSubConcessionTownPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="occSubConcessionParishPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">20. Has a surveyor's technical description been completed?</p>
						<p class="sub_heading_content" id="occCompleteSurveyTechDescPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Boundaries</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">North</p>
						<p class="sub_heading_content" id="occNorthBoundariesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">East</p>
						<p class="sub_heading_content" id="occEastBoundariesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">West</p>
						<p class="sub_heading_content" id="occWestBoundariesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">South</p>
						<p class="sub_heading_content" id="occSouthBoundariesPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">21. Ownership/Right of Use</p>
						<p class="sub_heading_content" id="occOwnershipPreview"></p>
					</div>
				</div>
				<div class="col-12 hide" id="occLeaseYearsBoxPre">
					<div>
						<p class="sub_heading">Years</p>
						<p class="sub_heading_content" id="occLeaseYearsPreview"></p>
					</div>
				</div>
				<div class="col-4">
					<div>
						<p class="sub_heading">Volume</p>
						<p class="sub_heading_content" id="occVolumePreview"></p>
					</div>
				</div>
				<div class="col-4">
					<div>
						<p class="sub_heading">Folio</p>
						<p class="sub_heading_content" id="occFolioPreview"></p>
					</div>
				</div>
				<div class="col-4">
					<div>
						<p class="sub_heading">Floor Number/s</p>
						<p class="sub_heading_content" id="occFloorNumPreview"></p>
					</div>
				</div>
				
				<div class="col-12">
					<div>
						<p class="sub_heading">22. Please provide a description of proposed Service Activities to be undertaken</p>
						<p class="sub_heading_content" id="occUndertakenServicePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">23. Please provide a description of proposed Manufacturing Activities to be undertaken</p>
						<p class="sub_heading_content" id="occUndertakenManufacturingPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>24. Distance from the nearest</p> 
				</div>
				<div class="col-12"> 
					<p>a. Sea Port</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="occSeaPortDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="occSeaPortDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>b. Airport</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="occAirportDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="occAirportDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>c. Road</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="occRoadDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="occRoadDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>d. Rail</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="occRailDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="occRailDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>e. Customs Processing Area</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="occCustomDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="occCustomDistanceMIPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview14">
		<div class="development-plan-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Proposed Area Development Plan</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-dev-plan-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<p>25. Infrastructure requirements</p>
				</div>
				<div class="col-12">
					<p>i. Provide land measurement in square metres /hectares</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">a. Processing area</p>
						<p class="sub_heading_content" id="occProcessingAreaPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">b. Non-processing area (parking etc.)</p>
						<p class="sub_heading_content" id="occNonProcessingAreaPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p>ii. Requirement of built-up area in square metres</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">a. Offices</p>
						<p class="sub_heading_content" id="occOfficeRequirementPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">b. Factory/Warehousing/storage</p>
						<p class="sub_heading_content" id="occFactoryRequirementPreview"></p>
					</div>
				</div>
				<div class="col-6 otherBuildUpRequirementBoxPre hide">
					<div>
						<p class="sub_heading">c. Other Area</p>
						<p class="sub_heading_content" id="occOtherAreaReqNamePreview"></p>
					</div>
				</div>
				<div class="col-6 otherBuildUpRequirementBoxPre hide">
					<div>
						<p class="sub_heading">Built-up area in square metres</p>
						<p class="sub_heading_content" id="occOtherAreaRequirementPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview15">
		<div class="investment-plan-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Investment and Financial Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-investment-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-12">
					<p>26. Investment (USD):</p>
				</div>
				<div class="col-md-12">
					<p>i. Infrastructure</p>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">a. Building/facilities</p>
						<p class="sub_heading_content" id="occInfraBuildingPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">b. Equipment</p>
						<p class="sub_heading_content" id="occInfraEquipmentPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">c. Machines</p>
						<p class="sub_heading_content" id="occInfraMachinesPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">d. Total</p>
						<p class="sub_heading_content" id="occInfraTotalPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">ii. Source(s) of finance</p>
						<p class="sub_heading_content" id="occInfraFinanceSourcePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview16">
		<div class="employment-plan-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Employment Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-employment-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>27. Projected labour requirement over a three year period</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="occLabourReqTable">
							<tr>
								<th class="sub_heading">Year</th>
								<th class="sub_heading">Direct</th>
								<th class="sub_heading">Male</th>
								<th class="sub_heading">Female</th>
								<th class="sub_heading">Local</th>
								<th class="sub_heading">Foreign</th>
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
	</section>
	<section class="final-preview-section" id="sezPreview17">
		<div class="zone-undertaking-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Occupant/Zone User Undertaking</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-user-undertaking-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title of Applicant</p>
						<p class="sub_heading_content" id="occApplicantTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Applicant</p>
						<p class="sub_heading_content" id="occApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="occApplicantTeleNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">E-mail Address</p>
						<p class="sub_heading_content" id="occApplicantEmailPreview"></p>
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
					<div class="signature_texarea mb-2" id="occ-applicant-sign-image-holder-pre">
					<%if(Validator.isNotNull(occuUnderTakingSign)){ %>
					<img src="<%=occuUnderTakingSign%>"  width="100" height="100"/>
					<%} %>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="occApplicantSignatureDatePreview"></p> 
					</div> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Notary Public Name</p>
						<p class="sub_heading_content" id="occPublicNotaryNamePreview"></p>
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
					<div class="signature_texarea mb-2" id="occ-public-notary-sign-image-holder-pre">
					<%if(Validator.isNotNull(occuUnderTakingNotarySign)){ %>
							<img src="<%=occuUnderTakingNotarySign%>"  width="100" height="100"/>
					<%} %>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="occPublicNotarySignatureDatePreview"></p>
					</div> 
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview18">
		<div class="deve-undertaking-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Developer's Undertaking</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-dev-undertaking-edit-tab">
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
						<p class="sub_heading_content" id="occUndertakingDevNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Letter of Approval No.</p>
						<p class="sub_heading_content" id="occUndertakingApprLetterPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="occUndertakingDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">SEZ Developer's Agreement No.</p>
						<p class="sub_heading_content" id="occUndertakingAgreeNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="occUndertakingAgreeDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">SEZ Developer's Control Number</p>
						<p class="sub_heading_content" id="occUndertakingControlNumPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Developer's signature and certification</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title of Applicant</p>
						<p class="sub_heading_content" id="occDevApplicantTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Applicant</p>
						<p class="sub_heading_content" id="occDevApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="occDevApplicantTelePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">E-mail Address</p>
						<p class="sub_heading_content" id="occDevApplicantEmailPreview"></p>
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
					<div class="signature_texarea mb-2" id="occ-dev-applicant-sign-image-holder-pre">
					 <%if(Validator.isNotNull(occDeveloperTakingSign)){ %>
						<img src="<%=occDeveloperTakingSign%>"  width="100" height="100"/>
						<%} %>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="occDevApplicantSignatureDatePreview"></p>
					</div> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Notary Public/Justice of the Peace</p>
						<p class="sub_heading_content" id="occDevPublicNotaryNamePreview"></p>
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
					<div class="signature_texarea mb-2" id="occ-dev-public-notary-sign-image-holder-pre">
					 <%if(Validator.isNotNull(occDeveloperTakingNotary)){ %>
						<img src="<%=occDeveloperTakingNotary%>"  width="100" height="100"/>
						<%}%>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="occDevPublicNotarySignatureDatePreview"></p>
					</div> 
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview19">
		<div class="submission-checklist-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex"> 
						<p class="heading2">Submission Checklist</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="occ-submission-list-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">General</p> 
						<p class="sub_heading_content" id="selectedOccGeneralPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Company Information</p> 
						<p class="sub_heading_content" id="selectedOccComInfoReqPreview"></p>
						<p class="sub_heading_content" id="occPaidShareCapProofPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Sworn Statements</p> 
						<p class="sub_heading_content" id="selectedOccSwornStateReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Supporting Documents</p> 
						<p class="sub_heading_content" id="selectedOccSupportingDocPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Facilities Requirments</p> 
						<p class="sub_heading_content" id="selectedOccFacilitiesReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Approvals</p> 
						<p class="sub_heading_content" id="selectedOccApprovalsPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Security, Occupational Safety and Health Requirements</p> 
						<p class="sub_heading_content" id="selectedOccSecurityReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Detailed Business Plan</p> 
						<p class="sub_heading_content" id="selectedOccDetailedBusiPlanPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Name</p> 
						<p class="sub_heading_content" id="occNameReqPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="occDateReqPreview"></p>
					</div> 
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="occ-sign-req-image-holder-pre">
					<%if(Validator.isNotNull(occChecklistsign)){ %>
					<img src="<%=occChecklistsign%>"  width="100" height="100"/>
					<%}%>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>