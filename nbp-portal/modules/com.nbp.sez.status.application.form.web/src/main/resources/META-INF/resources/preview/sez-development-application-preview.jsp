<%@page import="com.nbp.sez.status.upload.document.commands.GettingDocumentData"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd"%>
<%@page import="com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<%
String signatureUrl="";
String signatureUrlPublicNotary="";
String signatureUrlSubmission="";
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
%>
<div class="hide" id="sezDevApplicationPreview">
	<section class="final-preview-section" id="sezPreview1">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Business Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-general-list-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">1. Application date</p>
						<p class="sub_heading_content" id="devAppDatePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">2. Applicant Name</p>
						<p class="sub_heading_content" id="devAppNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="devCompanyNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="devCompanyStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="devCompanyTownPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Parish/Post /Zip Code</p>
						<p class="sub_heading_content" id="devCompanyZipCodePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Country</p>
						<p class="sub_heading_content" id="devCountryPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Telephone No./s</p>
						<p class="sub_heading_content" id="devTelephonePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Fax No./s</p>
						<p class="sub_heading_content" id="devFaxPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">E-Mail Address/s</p>
						<p class="sub_heading_content" id="devEmailPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Website</p>
						<p class="sub_heading_content" id="devWebsitePreview"></p>
					</div>
				</div>
				<div class="col-md-12"> 
                 	<p>3. Address Local Head Office</p> 
                </div>
                <div class="col-md-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="devLocalStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="devLocalTownPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Parish/Post /Zip Code</p>
						<p class="sub_heading_content" id="devLocalZipCodePreview"></p>
					</div>
				</div>
				<div class="col-md-12"> 
                 	<p>4. Authorised Representative</p> 
                </div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="devRepNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="devRepStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="devRepTownPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Parish/Post /Zip Code</p>
						<p class="sub_heading_content" id="devRepZipCodePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Country</p>
						<p class="sub_heading_content" id="devRepCountryPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Telephone No./s</p>
						<p class="sub_heading_content" id="devRepTelephonePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Fax No./s</p>
						<p class="sub_heading_content" id="devRepFaxPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">E-Mail Address/s</p>
						<p class="sub_heading_content" id="devRepEmailPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">5. Is the applicant a part of a Joint Venture/Special Purpose Vehicle?</p>
						<p class="sub_heading_content" id="devJointVenturePreview"></p>
					</div>
				</div>
			</div>
			<div class="row hide" id="devJointVentureBoxPre">
				<div class="col-12">
					<div>
						<p>Please state parent company name and address</p>
					</div>
				</div>
				<div class="col-12  table-responsive">
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
								<th class="sub_heading">E-Mail Address/s</th>
							</tr>
							<%if(Validator.isNotNull(genBusinessAdd)&&genBusinessAdd.size()>0){
								int devVentureComInfoVal=1;
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
					<div>
						<p class="sub_heading">6. Are you an existing Jamaican Company under the Companies Act, 2004 (Act 10 of 2004)?</p>
						<p class="sub_heading_content" id="devExistingComPreview"></p>
					</div>
				</div>
			</div>
			<div class="row hide" id="devExistingComBoxPre">
				<div class="col-md-12"> 
		               <p class="common-section-small-heading mb-0">7. Form of the articles of incorporation</p> 
					   <p class="sub_heading_content" id="devFormArticlePreview"></p>
		        </div>
				<div class="col-md-12 hide" id="devFormArticleOtherBoxPre">
					<div>
						<p class="sub_heading">Please specify</p>
						<p class="sub_heading_content" id="devFormArticleOtherPreview"></p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div>
						<p class="sub_heading">8. Is the company classified as a non-resident Jamaican Company</p>
						<p class="sub_heading_content" id="devCompanyClassifiedPreview"></p>
					</div>
				</div>
				<div class="col-md-4">
					<div>
						<p class="sub_heading">9. Taxpayer Registration Number (TRN)</p>
						<p class="sub_heading_content" id="devTRNPreview"></p>
					</div>
				</div>
				<div class="col-md-4">
					<div>
						<p class="sub_heading">10. General Consumption Tax Number (GCT)</p>
						<p class="sub_heading_content" id="devGCTPreview"></p>
					</div>
				</div>
				<div class="col-md-4">
					<div>
						<p class="sub_heading">11. Tax Compliance Certificate Number (TCC)</p>
						<p class="sub_heading_content" id="devTCCPreview"></p>
					</div>
				</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview2">
		<div class="shareholder-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Shareholding/Partnership/Director Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-director-list-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12"> 
					<p>Equity/Share Capital of the registered Jamaican entity to include Foreign Direct Investment</p> 
				</div>
				<div class="col-4">
					<div>
						<p class="sub_heading">I. Authorised</p>
						<p class="sub_heading_content" id="devEquityAuthorisedPreview"></p>
					</div>
				</div>
				<div class="col-4">
					<div>
						<p class="sub_heading">II. Subscribed</p>
						<p class="sub_heading_content" id="devEquitySubscribedPreview"></p>
					</div>
				</div>
				<div class="col-4">
					<div>
						<p class="sub_heading">III. Paid up Share Capital</p>
						<p class="sub_heading_content" id="devEquityPaidCapitalPreview"></p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<div>
						<p>13. Details of each of the Principal Shareholders</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="devShareholderDetailFormTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Building No. and Street Address</th>
								<th class="sub_heading">Parish/Post /Zip Code</th>
								<th class="sub_heading">Country</th>
								<th class="sub_heading">Nationality</th>
								<th class="sub_heading">TRN/SSN/Tax Number in the country of domicile</th>
							</tr>
							<%if(Validator.isNotNull(sharePrincipalAdd)&&sharePrincipalAdd.size()>0){
								int devShareholderDetailVal=1;
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
</tr>
<input type="hidden" id="devShareholderDetailId<%=devShareholderDetailVal%>"  name="devShareholderDetailId<%=devShareholderDetailVal%>" value="<%=principalAdd.getSezDevSharePrincipalAddId()%>">
<%devShareholderDetailVal=devShareholderDetailVal+1;}}%>	
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
						<tbody class="devDirectorShareholderTable">
							<tr>
								<th class="sub_heading">Shareholder Name</th>
								<th class="sub_heading">No. of Shares</th>
							</tr>
						  <%if(Validator.isNotNull(shareDirectorAdd)&&shareDirectorAdd.size()>0){
							  int devDirectorShareholderVal=1;
			for(SezDevShareDirectorAdd directorAdd:shareDirectorAdd){
			%>
			 <tr>
	<td class="sub_heading_content principalShareholderName<%=devDirectorShareholderVal%>">
	<%=Validator.isNotNull(directorAdd)&&Validator.isNotNull(directorAdd.getShareholderName())?directorAdd.getShareholderName():""%>
	</td>
	<td class="sub_heading_content principalShareholderShares<%=devDirectorShareholderVal%>">
	<%=Validator.isNotNull(directorAdd)&&Validator.isNotNull(directorAdd.getNumOfShare())?directorAdd.getNumOfShare():""%>
	</td>
</tr>
<input type="hidden" id="devDirectorShareholderId<%=devDirectorShareholderVal%>"  name="devDirectorShareholderId<%=devDirectorShareholderVal%>" value="<%=directorAdd.getSezDevShareDirectorAddId()%>">
<%devDirectorShareholderVal=devDirectorShareholderVal+1;}}%>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<div>
						<p>List of company directorship/trustees/fiduciary positions held by directors with any firms/corporations/associates/partnerships/business entity in the last 10 years</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addComDirectorTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Company</th>
								<th class="sub_heading">Relationship</th>
							</tr>
							<%if(Validator.isNotNull(directorShip)&&directorShip.size()>0){
								 int devComDirectorVal=1;
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
			<a href="javascript:void(0)" id="dev-shareholder-list-edit-tab" onclick="devComDirectorEditTab('<%=devComDirectorVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
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
				<div class="col-12">
					<div>
						<p>Corporation/business and companies in which directors have held/holds ownership interest</p>
					</div>
				</div>
				<div class="col-12 table-responsive addCorporationTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addCorporationTable">
							<tr>
								<th class="sub_heading">Name</th>
								<th class="sub_heading">Company</th>
								<th class="sub_heading">Relationship</th>
							</tr>
							<%if(Validator.isNotNull(corporationBus)&&corporationBus.size()>0){
								int devCorporationVal=1;
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
			<a href="javascript:void(0)" id="dev-shareholder-list-edit-tab" onclick="devCorporationEditTab('<%=devCorporationVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
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
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Are any of the company directors/shareholders currently involved in any bankruptcy proceedings or are undischarged bankrupts?</p> 
						<p class="sub_heading_content" id="comDirectorBankruptInvolvePreview"></p>
					</div> 
				</div>
				<div class="col-12 comDirectorBankruptInvolveBoxPre hide">
					<div>
						<p>Please state name of director(s)/shareholder(s)</p>
					</div>
				</div>
				<div class="col-12 comDirectorBankruptInvolveBoxPre hide table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="directorBankruptInvolveTable">
							<tr>
								<th class="sub_heading">Name</th>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview3">
		<div class="project-brief-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Existing and Proposed Project Brief</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-project-brief-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Have you previously been granted Free Zone or SEZ status?</p>
						<p class="sub_heading_content" id="sezFreePreviousZonePreview"></p>
					</div>
				</div>
				<div class="col-12 hide" id="sezFreePreviousZoneBoxPre">
					<div>
						<p class="sub_heading">Are you currently operating a zone</p>
						<p class="sub_heading_content" id="sezFreeCurrentZonePreview"></p>
					</div>
				</div>
				<div class="col-12 hide" id="sezFreeCurrentZoneBoxPre">
					<div class="col-12">
						<div>
							<p>State location/s</p>
						</div>
					</div>
					<div class="col-12 table-responsive">
						<table class="table table-bordered mb-3">
							<tbody class="ventureComInfoBoxPreBox">
								<tr>
									<th class="sub_heading">Name of Zone</th>
									<th class="sub_heading">Parish</th>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Provide a description of the nature of the business being conducted in the Zone</p>
						<p class="sub_heading_content" id="businessZoneNaturePreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>What percentage of output is distributed</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Locally</p>
						<p class="sub_heading_content" id="distributedOutputPerLocalPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Overseas</p>
						<p class="sub_heading_content" id="distributedOutputPerOverseasPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Proposed name of the SEZ</p>
						<p class="sub_heading_content" id="sezProposedNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">What type of Special Economic Zone is the application for</p>
						<p class="sub_heading_content" id="applicationEconomicZonePreview"></p>
					</div>
				</div>
				<div class="col-12 hide" id="applicationEconomicSpecialisedZoneBoxPre">
					<div>
						<p class="sub_heading">Please describe</p>
						<p class="sub_heading_content" id="applicationSpecialisedZoneDescPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Distance from the nearest</p> 
				</div>
				<div class="col-12"> 
					<p>Sea Port</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="seaPortDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="seaPortDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Airport</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="airportDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="airportDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Road</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="roadDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="roadDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Rail</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="railDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="railDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Customs Processing Area</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Km</p>
						<p class="sub_heading_content" id="customDistanceKMPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mi</p>
						<p class="sub_heading_content" id="customDistanceMIPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Indicate the land measurement of the proposed SEZ (in hectares)</p>
						<p class="sub_heading_content" id="proposedLandMeasurementPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Square footage (footprint) of the proposed SEZ space (buildings and land area</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Buildings</p>
						<p class="sub_heading_content" id="buildingSquareFootagePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Land area</p>
						<p class="sub_heading_content" id="landSquareFootagePreview"></p>
					</div>
				</div>
				<!-- Add 26 ques here -->
				<div class="col-12">
					<div>
						<p class="sub_heading">Ownership/Right of land use</p>
						<p class="sub_heading_content" id="landOwnershipPreview"></p>
					</div>
				</div>
					<div class="col-6 hide" id="otherLandOwnershipPre">
					<div>
						<p class="sub_heading">Please Specify</p>
						<p class="sub_heading_content" id="otherSpecifyLandOwnershipPreview"></p>
					</div>
				</div>
			</div>
			<div class="row hide" id="landOwnershipBoxPre">
				<div class="col-12 "> 
					<p>Please state the name and address of land owner</p> 
					</div>
					<div class="col-12">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="landOwnerNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address 1</p>
						<p class="sub_heading_content" id="landOwnerAddrOnePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address 2</p>
						<p class="sub_heading_content" id="landOwnerAddrTwoPreview"></p>
					</div>
				</div>
					<div class="col-6">
					<div>
						<p class="sub_heading">What is the tenure of the lease agreement</p>
						<p class="sub_heading_content" id="leaseAgreeTenurePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Is the applicant taking steps to acquire the lands?</p>
						<p class="sub_heading_content" id="stepToAcquireLandPreview"></p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<div>
						<p class="sub_heading">State whether the proposed area is contiguous to or separated by any thoroughfare</p>
						<p class="sub_heading_content" id="proposedAreaDescPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Has the applicant previously been denied permission for development of a Free Zone or Special Economic Zone.</p>
						<p class="sub_heading_content" id="freeZonePrmissionDeniedPreview"></p>
					</div>
				</div>
				<div class="col-12 hide" id="freeZonePrmissionDeniedBoxPre">
					<div>
						<p class="sub_heading">Please provide brief details of project</p>
						<p class="sub_heading_content" id="deniedPermissionDetailPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview4">
		<div class="proposed-dev-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Proposed Development Plan</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-proposed-dev-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12"> 
					<p>Project Development Plan / Site Plan</p> 
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">If the application is for a Single Entity SEZ, will the Developer/Occupant be using an existing building/s for its business</p>
						<p class="sub_heading_content" id="existingBuildingForBusiPreview"></p>
					</div>
				</div>
				<div class="col-12 hide" id="existingBuildingForBusiBoxPre">
					<div>
						<p class="sub_heading">Please provide Surveyors Identification Report detailing the existing building/s and parcel of land to include details of a specific floor, if such designation is required.</p>
						<p class="sub_heading_content" id="existingBuildingForBusiDetailingPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">If applicant is proposing an Single Entity Development, please provide brief description of activities to be undertaken</p>
						<p class="sub_heading_content" id="activitiesForSingleEntityPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Green or Brownfield SEZ Development</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Volume</p>
						<p class="sub_heading_content" id="sezDevelopmentVolumePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Folio</p>
						<p class="sub_heading_content" id="sezDevelopmentFolioPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Building No. and Street Address</p>
						<p class="sub_heading_content" id="sezDevelopmentStreetAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Town/City</p>
						<p class="sub_heading_content" id="sezDevelopmentTownPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish/Post /Zip Code</p>
						<p class="sub_heading_content" id="sezDevelopmentZipCodePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Zoning Classification</p>
						<p class="sub_heading_content" id="zoningClassificationPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Existing Land Use</p>
						<p class="sub_heading_content" id="sezDevelopmentLandUsePreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Total hectares (acres) for the proposed SEZ Area development</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Hectares</p>
						<p class="sub_heading_content" id="sezAreaDevelopmentHectareAreaPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Acres</p>
						<p class="sub_heading_content" id="sezAreaDevelopmentAcresAreaPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Total hectares/acres for the proposed SEZ Customs Controlled Area</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Hectares</p>
						<p class="sub_heading_content" id="sezCustomsDevelopmentHectareAreaPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Acres</p>
						<p class="sub_heading_content" id="sezCustomsDevelopmentAcresAreaPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Topography</p>
						<p class="sub_heading_content" id="topographyPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Boundaries</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">North</p>
						<p class="sub_heading_content" id="northBoundariesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">East</p>
						<p class="sub_heading_content" id="eastBoundariesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">West</p>
						<p class="sub_heading_content" id="westBoundariesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">South</p>
						<p class="sub_heading_content" id="southBoundariesPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Infrastructure, Facilities and Utilities</p> 
				</div>
				<div class="col-12"> 
					<p>Proposed/Existing Facilities</p> 
				</div>
				<div class="col-12"> 
					<p>Customs Controlled Area</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Land Measurement</p>
						<p class="sub_heading_content" id="customLandMeasurementPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Percent</p>
						<p class="sub_heading_content" id="customPercentPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Common Area/F&B</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Land Measurement</p>
						<p class="sub_heading_content" id="commonLandMeasurementPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Percent</p>
						<p class="sub_heading_content" id="commonPercentPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Buffer/Green Zone</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Land Measurement</p>
						<p class="sub_heading_content" id="bufferLandMeasurementPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Percent</p>
						<p class="sub_heading_content" id="bufferPercentPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Zone User Area</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Land Measurement</p>
						<p class="sub_heading_content" id="zoneLandMeasurementPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Percent</p>
						<p class="sub_heading_content" id="zonePercentPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Residential (if any)</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Land Measurement</p>
						<p class="sub_heading_content" id="residentialLandMeasurementPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Percent</p>
						<p class="sub_heading_content" id="residentialPercentPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Total</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Land Measurement</p>
						<p class="sub_heading_content" id="totalLandMeasurementPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Percent</p>
						<p class="sub_heading_content" id="totalPercentPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Estimated requirement for Water (in Kilo Liters)</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">For industrial (process) purposes</p>
						<p class="sub_heading_content" id="industrialWaterReqPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">For drinking purposes</p>
						<p class="sub_heading_content" id="drinkingWaterReqPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Others, specify</p>
						<p class="sub_heading_content" id="otherWaterReqPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Total requirement</p>
						<p class="sub_heading_content" id="totalWaterReqPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Sewage/Waste water Treatment</p> 
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Quantum and nature of effluents and mode of disposal</p>
						<p class="sub_heading_content" id="disposalModePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Specify whether own Sewage/waste water Treatment Plant will be created</p>
						<p class="sub_heading_content" id="wasteWaterTreatmentPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Requirement of Power (in kilovolt-ampere kVA)</p>
						<p class="sub_heading_content" id="powerReqirementPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Internal Road Network</p> 
				</div>
				<div class="col-12"> 
					<p>Main Road</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">ROW Width (M)</p>
						<p class="sub_heading_content" id="mainRoadWidthPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Type of Pavement</p>
						<p class="sub_heading_content" id="mainRoadPavementPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Secondary Road</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">ROW Width (M)</p>
						<p class="sub_heading_content" id="secondaryRoadWidthPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Type of Pavement</p>
						<p class="sub_heading_content" id="secondaryRoadPavementPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>Tertiary Road</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">ROW Width (M)</p>
						<p class="sub_heading_content" id="tertiaryRoadWidthPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Type of Pavement</p>
						<p class="sub_heading_content" id="tertiaryRoadPavementPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Will the applicant require installation of water supply, sewage systems & waste water system?</p>
						<p class="sub_heading_content" id="waterInstallationReqPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Will the applicant require installation of power distribution system?</p>
						<p class="sub_heading_content" id="powerInstallationReqPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Will the applicant require installation of telecommunication infrastructure?</p>
						<p class="sub_heading_content" id="teleComInstallationReqPreview"></p> 
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Will the application be installing Closed Circuit Television (CCTV) System</p>
						<p class="sub_heading_content" id="cctvInstallationReqPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Will the applicant CCTV system allow for interconnection with GoJ approved security and/or
	regulatory agencies? (JSEZA, Jamaica Customs Agency, JCF)</p>
						<p class="sub_heading_content" id="securityInterconnectionPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Will the applicant install a Fire Fighting System and Equipment</p>
						<p class="sub_heading_content" id="fireFightingInstallationReqPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview5">
		<div class="safety-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Employee Safety and Security</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-safety-list-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="securityMeasuresTable">
							<tr>
								<th class="sub_heading">Detailed security plan with your application</th>
							</tr>
							<%if(Validator.isNotNull(employeeSafety)&&Validator.isNotNull(employeeSafety.size()>0)){
								int securityMeasuresTableVal=1;
								for(SezDevEmployeeSafetyInfoAdd employeeSafetyValues:employeeSafety){
							 %>
							<tr>
								<td class="sub_heading_content securityMeasures<%=securityMeasuresTableVal%>">
								<%=Validator.isNotNull(employeeSafetyValues)&&Validator.isNotNull(employeeSafetyValues.getSecurityMeasures())?employeeSafetyValues.getSecurityMeasures():"" %>
								</td>
							</tr>
							<input type="hidden" id="devSecurityMeasuresId<%=securityMeasuresTableVal%>"  name="devSecurityMeasuresId<%=securityMeasuresTableVal%>" value="">
							<%securityMeasuresTableVal = securityMeasuresTableVal+1;
							}} %>
						</tbody>
					</table>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody id="occuSafetySystemBoxPre">
							<tr>
								<th class="sub_heading">Occupational safety and health management systems, policy and procedures</th>
							</tr>
							<%if(Validator.isNotNull(employeeDefineOcuu)&&employeeDefineOcuu.size()>0){
								int devOccuSafetySystemVal=1;
									for(SezDevEmployeeDefineOccuAdd employeeDefineOcuuValues:employeeDefineOcuu){%>
								
								<tr>
									<td class="sub_heading_content occuSafetySystem<%=devOccuSafetySystemVal%>">
									<%=Validator.isNotNull(employeeDefineOcuuValues)&&Validator.isNotNull(employeeDefineOcuuValues.getOccuSafetySystem())?employeeDefineOcuuValues.getOccuSafetySystem():"" %>
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
	</section>
	<section class="final-preview-section" id="sezPreview6">
		<div class="employment-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Employment Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-employment-list-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12"> 
					<p>First Year</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Direct</p>
						<p class="sub_heading_content" id="directFirstYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Indirect</p>
						<p class="sub_heading_content" id="indirectFirstYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Male (direct)</p>
						<p class="sub_heading_content" id="maleDirectFirstYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Female (direct)</p>
						<p class="sub_heading_content" id="femaleDirectFirstYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Local</p>
						<p class="sub_heading_content" id="localFirstYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Foreign</p>
						<p class="sub_heading_content" id="foreignFirstYrEmPreview"></p>
					</div>
				</div>
	
				<div class="col-12"> 
					<p>Second Year</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Direct</p>
						<p class="sub_heading_content" id="directSecondYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Indirect</p>
						<p class="sub_heading_content" id="indirectSecondYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Male (direct)</p>
						<p class="sub_heading_content" id="maleDirectSecondYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Female (direct)</p>
						<p class="sub_heading_content" id="femaleDirectSecondYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Local</p>
						<p class="sub_heading_content" id="localSecondYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Foreign</p>
						<p class="sub_heading_content" id="foreignSecondYrEmPreview"></p>
					</div>
				</div>
	
				<div class="col-12"> 
					<p>Third Year</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Direct</p>
						<p class="sub_heading_content" id="directThirdYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Indirect</p>
						<p class="sub_heading_content" id="indirectThirdYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Male (direct)</p>
						<p class="sub_heading_content" id="maleDirectThirdYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Female (direct)</p>
						<p class="sub_heading_content" id="femaleDirectThirdYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Local</p>
						<p class="sub_heading_content" id="localThirdYrEmPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Foreign</p>
						<p class="sub_heading_content" id="foreignThirdYrEmPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class=final-preview-section" id="sezPreview7">
		<div class="management-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Disaster Management and Emergency Plan</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-disaster-management-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12"> 
					<div> 
						<p class="sub_heading">Does the company have a disaster management and emergency plan in place?</p> 
						<p class="sub_heading_content" id="comDisasterManagementPreview"></p>
					</div> 
				</div>
			</div>
			<div class="row">
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="disasterMitigationPlanTable">
							<tr>
								<th class="sub_heading">Define your disaster mitigation plan, emergency response mechanisms and incident management procedures.</th>
							</tr>
							<%if(Validator.isNotNull(disManagementAdd)&&disManagementAdd.size()>0){
								int disasterMitigationPlanVal = 1;
								for(SezDevDisasterManagementAdd disManagementValues:disManagementAdd){%>
							<tr>
							
								<td class="sub_heading_content disasterMitigationPlan<%=disasterMitigationPlanVal%>">
								<%=Validator.isNotNull(disManagementValues)&&Validator.isNotNull(disManagementValues.getDisasterMitigationPlan())?disManagementValues.getDisasterMitigationPlan():"" %>
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
	</section>
	<section class="final-preview-section" id="sezPreview8">
		<div class="investment-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Investment and Financial Information</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-investment-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-12"> 
					<p>Proposed Financial/Investment Details</p> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Value of Land</p>
						<p class="sub_heading_content" id="landValuePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Building/Factory Development Cost</p>
						<p class="sub_heading_content" id="factoryDevCostPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">On-Site Infrastructure such as boundary walls, roads, drainage, water supply, electricity
							etc.</p>
						<p class="sub_heading_content" id="onSiteInfrastructurePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Port</p>
						<p class="sub_heading_content" id="portInvestDetailsPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Airport</p>
						<p class="sub_heading_content" id="airportInvestDetailsPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Other</p>
						<p class="sub_heading_content" id="otherInvestDetailsPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Total</p>
						<p class="sub_heading_content" id="totalInvestDetailsPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Total Local Direct Investment (LDI)</p>
						<p class="sub_heading_content" id="totalLDIPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Total Foreign Direct Investment (FDI)</p>
						<p class="sub_heading_content" id="totalFDIPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<p>If any, source of FDI (Sponsors company and country details should be provided)</p> 
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="fdiComNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Resident Address</p>
						<p class="sub_heading_content" id="fdiResidentAddrPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Source of Funds</p>
						<p class="sub_heading_content" id="fundSourcesPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview9">
		<div class="dev-undertaking-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Developer's Undertaking</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-dev-undertaking-edit-tab">
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
						<p class="sub_heading_content" id="applicantTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Applicant</p>
						<p class="sub_heading_content" id="applicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="applicantTeleNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">E-mail Address</p>
						<p class="sub_heading_content" id="applicantEmailPreview"></p>
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
					<div class="signature_texarea mb-2" id="applicant-sign-image-holder-pre">
					<%if(Validator.isNotNull(signatureUrl)){ %>
					<img src="<%=signatureUrl%>"  width="100" height="100"/>
					<%} %>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="applicantSignatureDatePreview"></p> 
					</div> 
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Notary Public/Justice of the Peace</p>
						<p class="sub_heading_content" id="publicNotaryNamePreview"></p>
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
					<div class="signature_texarea mb-2" id="public-notary-sign-image-holder-pre">
					<%if(Validator.isNotNull(signatureUrlPublicNotary)){ %>
					<img src="<%=signatureUrlPublicNotary%>"  width="100" height="100"/>
					<%} %>
					</div>
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="publicNotarySignatureDatePreview"></p> 
					</div> 
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="sezPreview10">
		<div class="submission-checklist-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Submission Checklist</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="dev-submission-check-edit-tab">
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
						<p class="sub_heading_content" id="selectedGeneralPreview"></p>
					</div>
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Company Information</p> 
						 <p class="sub_heading_content" id="selectedComInfoReqPreview"></p>
						 <p class="sub_heading_content" id="paidShareCapProofPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Sworn Statements</p> 
						 <p class="sub_heading_content" id="selectedSwornStateReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Land Occupancy</p> 
						 <p class="sub_heading_content" id="selectedLandOccuReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Security, Occupational safety and health requirements</p> 
						 <p class="sub_heading_content" id="selectedSafetyHealthReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Land Development Construction requirements</p> 
						 <p class="sub_heading_content" id="selectedLandDevlopmentReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Other Technical Information required</p> 
						 <p class="sub_heading_content" id="selectedTechInfoReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Preliminary Sez Development Plan</p> 
						 <p class="sub_heading_content" id="selectedSezPreliminaryReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Detailed Sez Development Plan</p> 
						 <p class="sub_heading_content" id="selectedSezDevDetailReqPreview"></p>
					</div> 
				</div>
				<div class="col-12"> 
					<div> 
						 <p class="sub_heading">Approvals</p> 
						 <p class="sub_heading_content" id="selectedApprovalReqPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Name</p> 
						<p class="sub_heading_content" id="nameReqPreview"></p>
					</div> 
				</div>
				<div class="col-6"> 
					<div> 
						<p class="sub_heading">Date</p> 
						<p class="sub_heading_content" id="dateReqPreview"></p>
					</div> 
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Signature</p>			
					<div class="signature_texarea mb-2" id="sign-req-image-holder-pre">
					<%if(Validator.isNotNull(signatureUrlSubmission)){ %>
					<img src="<%=signatureUrlSubmission%>"  width="100" height="100"/>
					<%} %>
					</div>
				</div>
			</div>
		</div>
	</section>	
</div>