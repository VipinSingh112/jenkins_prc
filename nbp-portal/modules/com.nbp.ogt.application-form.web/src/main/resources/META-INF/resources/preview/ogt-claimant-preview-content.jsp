<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.ogt.upload.document.commands.GettingDocumentData"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@ include file="/init.jsp" %>
<%@page import="java.text.SimpleDateFormat"%>
<div class="" id="ogtClaimantPre">
	<section class="final-preview-section" id="ogtPreviewStep1">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Claimant Details</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="claimantDetailsEdit"> <svg
									width="19" height="19" viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Claimant Name</p>
						<p class="sub_heading_content" id="claimantNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide indi-detail">
					<div>
						<p class="sub_heading">First Name</p>
						<p class="sub_heading_content" id="indiFirstNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide indi-detail">
					<div>
						<p class="sub_heading">Last Name</p>
						<p class="sub_heading_content" id="indiLastNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide com-detail">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="companyNamePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="addressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="emailAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="telephonePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="faxNoPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Date of Application</p>
						<p class="sub_heading_content" id="applicationDatePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">TRN</p>
						<p class="sub_heading_content" id="trnNumberPreview"></p>
					</div>
				</div>
				<!-- <div class="col-md-6">
					<div>
						<p class="sub_heading">Is the claimant a relative of the bankrupt</p>
						<p class="sub_heading_content" id="claimantRelativeBankruptPreview"></p>
					</div>
				</div> -->
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="ogtPreviewStep2">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Insolvent Person Details</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="assignmentInsolvenctEdit"> <svg
									width="19" height="19" viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Nature of Insolvent Person</p>
						<p class="sub_heading_content" id="insolventPersonNaturePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide insolvent-indi-detail">
					<div>
						<p class="sub_heading">First Name</p>
						<p class="sub_heading_content" id="insolventIndiFirstNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide insolvent-indi-detail">
					<div>
						<p class="sub_heading">Last Name</p>
						<p class="sub_heading_content" id="insolventIndiLastNamePreview"></p>
					</div>
				</div>
				<div class="col-md-6 hide insolvent-com-detail">
					<div>
						<p class="sub_heading">Company Name</p>
						<p class="sub_heading_content" id="insolventCompanyNamePreview"></p>
					</div>
				</div>
				<!-- <div class="col-md-6">
					<div>
						<p class="sub_heading">Is the Debt Statute Barred</p>
						<p class="sub_heading_content" id="debtStatutePreview"></p>
					</div>
				</div> -->
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="ogtPreviewStep3">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Proof Of Claim(Form 38)</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="proofClaimEdit"> <svg
									width="19" height="19" viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Type Of Matter</p>
						<p class="sub_heading_content"
							id="selectedClaimantAttachedPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading"> In the matter of the <span class="giluio matterType"></span> of <span class="giluio debtorName"><%=creditorClaim!=null?creditorClaim.getClaimDebtorName():StringPool.BLANK %></span> and the claim of 
					<span class="giluio claimantName"><%=creditorClaim!=null?creditorClaim.getClaimantName():StringPool.BLANK %></span>
					</p>
				</div>
				<div class="col-12">
					<p class="">Notice To The Claimant Should Be Sent To:</p>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="claimAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Phone</p>
						<p class="sub_heading_content" id="claimPhonePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content" id="claimFaxNoPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="claimEmailAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="">Claim</p>
						<!-- <p class="sub_heading_content" id="claimantAttachedPreview"></p> -->
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading">
						I <span class="giluio completingForm"><%=creditorClaim!=null?creditorClaim.getClaimCompName():StringPool.BLANK %></span> do hereby certify
					</p>
					<p class="sub_heading pl-3">1. That I am <span class="giluio incorporationLodged"><%=creditorClaim!=null?creditorClaim.getClaimCertifyCheck():StringPool.BLANK%></span>.</p>
					<p class="sub_heading pl-3">2. That I have knowledge of all the circumstances connected with the claim referred to below.</p>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section  bankrupcy-form hide" id="ogtPreviewStep4">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="claim-heading heading2"></p>
					<span class="ml-3"> <a href="javascript:void(0)"  class="preview-edit-button"
						id="sectionBEdit"> <svg width="19" height="19"
								viewBox="0 0 19 19" fill="none"
								xmlns="http://www.w3.org/2000/svg">
							   <path
									d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
									fill="#047247" />
						</svg>
					</a>
					</span>
				</div>
			</div>
		</div>
		<div class="claim-by-creditor-form hide">
			<div class="row">
				<div class="col-md-12">
					<div>
						<p class="sub_heading">1. That the debtor was at the:</p>
						<p class="sub_heading_content" id="claimDebtorPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading">
						namely the <span class="giluio claimNamePerson"><%=creditorClaim!=null?creditorClaim.getClaimName():StringPool.BLANK %></span> day of <span
							class="giluio applicationDateCa"><%=creditorClaim!=null&&creditorClaim.getClaimDateAppli()!=null?new SimpleDateFormat("yyyy-MM-dd").format(creditorClaim.getClaimDateAppli()):StringPool.BLANK %></span>, and still is, indebted
						to the claimant in the sum of $<span class="giluio valueOfClaim"><%=creditorClaim!=null?creditorClaim.getClaimByDebtTotalVal():StringPool.BLANK %></span>,
						as specified in the statement of account
					</p>
					<p class="sub_heading_content" id="statementOfAccountPreview"></p>
<p><a class="sub_heading_content" id="detail-operating-preview" href="<%=Validator.isNotNull(fileUrlStatemnetOfAccount)? fileUrlStatemnetOfAccount:""%>"><%=(Validator.isNotNull(formNameDoc))?formNameDoc:""%></a></p>
<p><a class="sub_heading_content" id="detail-operating-two-preview" href="<%=Validator.isNotNull(fileUrlStatemnetOfAccountTwo)? fileUrlStatemnetOfAccountTwo:""%>"><%=(Validator.isNotNull(formNameDocTwo))?formNameDocTwo:""%></a></p>					
					
				</div>
				<div class="col-12">
					<p>Unsecured Claim of $<span class="giluio unsecuredClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getUnsecuredClaim():StringPool.BLANK %></span> (Section 202)</p>
				</div>

				<div class="col-12">
					<!-- <p class="sub_heading">
							Of $ <span class="giluio unsecuredClaim1"></span>,(Section 202)
						</p> -->
					<p class="sub_heading">
						Regarding the amount of $<span class="giluio unsecuredClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getUnsecuredClaim():StringPool.BLANK %></span>,
						<span id="unsecuredClaimPriorityPreview"></span>
					</p>
				</div>
				<div class="col-12">
					<p>Indicate whether claim is for:</p>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Category 1</p>
						<p class="sub_heading_content" id="reasonablePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Category 2</p>
						<p class="sub_heading_content" id="nationalHousingPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Category 3</p>
						<p class="sub_heading_content" id="securedCreditorsPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Category 4</p>
						<p class="sub_heading_content" id="OtherPreview"></p>
					</div>
				</div>
				<div class="col-md-6 pleaseSpecify hide">
					<div>
						<p class="sub_heading">Please Specify</p>
						<p class="sub_heading_content" id="name-other-purposePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p>Secured Claim of $<span class="giluio securedClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getSecuredClaim():StringPool.BLANK %></span> (Sections 192-194)</p>
				</div>
				<div class="col-md-12">
					<!--  <p class="sub_heading">
							Of $ <span class="giluio securedClaim1"></span>(Sections 192-194)
						</p> -->
					<p class="sub_heading">
						As security for this claim, I hold the following property of the
						debtor valued at $ <span class="giluio securedClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getSecuredClaim():StringPool.BLANK %></span>
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">Description</p>
					<p class="sub_heading_content" id="descriptionsClaimPreview"></p>
<p><a class="sub_heading_content" id="secured-claim-preview" href="<%=Validator.isNotNull(fileUrlSecureClaim)? fileUrlSecureClaim:""%>"><%=(Validator.isNotNull(formSecuredNameDoc))?formSecuredNameDoc:""%></a></p>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">
							That, to the best of my knowledge, <span class="giluio knowledge"><%=ogtSectionBData!=null?ogtSectionBData.getRelationWithDebtor():StringPool.BLANK %></span> related to the debtor within the meaning 
							of section 2 of the Act.
						</p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">4. That the following are the payments
							that I have received from, and the credits that I have allowed
							to, the debtor within the three months</p>
						<p class="sub_heading_content"
							id="paymentDetailDescriptionPreview"></p>
				<p><a class="sub_heading_content" id="details-payments-preview" href="<%=Validator.isNotNull(fileUrlFormDetailNameDoc)? fileUrlFormDetailNameDoc:""%>"><%=(Validator.isNotNull(formDetailPayNameDoc))?formDetailPayNameDoc:""%></a></p>
						<p><a class="sub_heading_content" id="details-payments-preview"></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Bankruptcy of an individual</p>
						<p class="sub_heading_content" id="bankruptcyIndiPreview"></p>
					</div>
				</div>
			</div>
		</div>
		<div class="claim-to-property-form hide">
			<div class="row">
				<div class="col-md-12">
					<p class="sub_heading">
						1. That, as at the date of the bankruptcy, namely, the day of <span
							class="giluio bankruptcyDatePro"><%=propertyClaim!=null&&propertyClaim.getPropertyDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(propertyClaim.getPropertyDate()):StringPool.BLANK %></span> the following property
						was in the possession of the bankrupt, and still remains in the
						possession of the bankrupt or the trustee: (Here identify the
						property being claimed)
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">Description</p>
					<p class="sub_heading_content" id="propClaimDescriptionPreview"></p>
					<p><a class="sub_heading_content" id="bankrupt-possession-preview" href="<%=Validator.isNotNull(fileUrlForProssessionOfBan)? fileUrlForProssessionOfBan:""%>"><%=(Validator.isNotNull(formBankruptcyNameDoc))?formBankruptcyNameDoc:""%></a></p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						2. I hereby claim that property, or interest or right in it, by
						virtue of the document(s) exhibited to the Affidavit attached
						as <b>Schedule 'A',</b> namely:
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">Description</p>
					<p class="sub_heading_content" id="affidavitDescriptionPreview"></p>
					<p><a class="sub_heading_content" id="affidavit-attached-preview" href="<%=Validator.isNotNull(fileUrlForAffidavitAttached)? fileUrlForAffidavitAttached:""%>"><%=(Validator.isNotNull(formAffidavitNameDoc))?formAffidavitNameDoc:""%></a></p>
				</div>
			</div>
		</div>
		<div class="claim-by-spouse-form hide">
			<div class="row">
				<div class="col-md-12">
					<p class="sub_heading">
						<b>3.</b> That, as at the date of the bankruptcy, namely, the day of 
						<span class="giluio bankruptcyDateSpouse"><%=spouseClaim!=null&&spouseClaim.getSpouseDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(spouseClaim.getSpouseDate()):StringPool.BLANK %></span>, I was married
						to the bankrupt and claim one half of the net proceeds, if any,
						realized from the sale of the following real property registered
						in the name of the bankrupt, after the satisfaction of any valid
						and enforceable charges registered in the appropriate registry:
						(Here identify the property being claimed. Note that the claim is
						restricted to the matrimonial home and any immediately related
						real property not exceeding one acre.)
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">Description</p>
					<p class="sub_heading_content" id="claimSpouseDescriptionPreview"></p>
					<p><a class="sub_heading_content" id="claim-by-spouse-preview" href="<%=Validator.isNotNull(fileUrlForClaimBySpouse)? fileUrlForClaimBySpouse:""%>"><%=(Validator.isNotNull(formClaimBySpouseNameDoc))?formClaimBySpouseNameDoc:""%></a></p>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="ogtPreviewStep5">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Signature</p>
						<span class="ml-3"> <a href="javascript:void(0)"  class="preview-edit-button"
							id="sectionCEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<p class="sub_heading">Name of the person completing Form</p>
					<p class="sub_heading_content" id="completingFormActPreview"></p>
				</div>
				<div class="col-md-6">
					<p class="sub_heading">Date</p>
					<p class="sub_heading_content" id="datePersonPreview"></p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content" id="completingPersonAddressPreview"></p>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of the person completing Form</p>
					<%
						if (Validator.isNotNull(formSignOfPersonNameDoc)) {
					%>
					<div class="signature_texarea mb-2" id="sign-req-image-holderPreview">
					<img src="<%=formSignOfPersonNameDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
						<%
						} else {
					%>
					<div class="signature_texarea mb-2" id="sign-req-image-holderPreview">
					</div>
					<%
						}
					%>		
				</div>
				
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Name of Justice of the Peace</p>
						<p class="sub_heading_content" id="justicePeacePreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="justicePeaceParishPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Justice of the Peace</p>
					<%
						if (Validator.isNotNull(formSignOfJusticeNameDoc)) {
					%>
					<div class="signature_texarea mb-2" id="sign-req-image-holder-justicePre">
					<img src="<%=formSignOfJusticeNameDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2" id="sign-req-image-holder-justicePre">
					<%
						}
					%>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section supporting-doc-preview" id="ogtPreviewStep6">
		<div class="supporting-doc-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Supporting Documents</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="supporting-doc-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12 hide" id="requireDocPreviewSection">
					<p>Mandatory Documents</p>
					<div id="requireDocPreview"></div>
				</div>
				<div class="col-12 hide" id="notRequireDocPreviewSection">
					<p>Optional Documents</p>
					<div id="notRequireDocPreview"></div>
				</div>
				<div class="col-12" id="additionalDocPreviewSection">
					<p>Additional Supporting Documents</p>
					<p class="sub_heading noAdditionalSupportingDoc">No Additional Supporting Documents</p>
					<div id="additionalDocPreview"></div>
					<% 
		int counterOfDocumentsPre=1;
		String fileUrlForPreview="";
		FileEntry fileEntryForGenericPre=null;
		DLFolder supportingDocumentsParentFolderGenericPre = null;
		DLFolder supportingDocumentsSubFolderGenericPre = null;
		List<DLFileEntry> dlFileEntriesGenericPre =null;
		try{
		supportingDocumentsParentFolderGenericPre=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), ogtApplicationId);
		
		supportingDocumentsSubFolderGenericPre =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGenericPre.getFolderId(),
					"Generic Documents");
		}catch(Exception e){}
		try{
		if(ogtApplicationId>0){
			 dlFileEntriesGenericPre=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGenericPre.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(ogtApplicationId>0 && dlFileEntriesGenericPre!=null){
			for (DLFileEntry uploadedFile : dlFileEntriesGenericPre) {
				try{
					fileEntryForGenericPre = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrl = DLURLHelperUtil.getDownloadURL(fileEntryForGenericPre, fileEntryForGenericPre.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				}catch(Exception e ){
				}
		%>
		<div class="additionalDocPreviewOne">
			<div class="document-container-preview<%=counterOfDocumentsPre%> mb-2">
			<a class="sub_heading_content" id="additionalDocNamePreview<%=counterOfDocumentsPre%>" href="<%=Validator.isNotNull(fileUrl)? fileUrl:""%>"><%=uploadedFile.getFileName() %></a></div>
		</div>
			<%	
			counterOfDocumentsPre=counterOfDocumentsPre+1;
			}
				}else{
			%> 
				
			<%}%> 
				</div>
			</div>
		</div>
	</section>
</div>


<script>
	function previewClaimantDetailInfo() {
		applicantClaimant = $("#applicantClaimant").val();
		indiFirstName = $("#indiFirstName").val();
		indiLastName = $("#indiLastName").val();
		indiName = indiFirstName+" "+indiLastName;
		$(".indiName").text(indiName);
		companyName = $("#companyName").val();
		address = $("#address").val();
		emailAddress = $("#emailAddress").val();
		telephone = $("#telephone").val();
		faxNo = $("#fax-no").val();
		applicationDate = $("#applicationDate").val();
		trnNumber = $("#trnNumber").val();
		claimBankrupt = $("input[name='claimBankrupt']:checked").val();
		$("#claimantNamePreview").html(applicantClaimant);
		$("#indiFirstNamePreview").html(indiFirstName);
		$("#indiLastNamePreview").html(indiLastName);
		$("#companyNamePreview").html(companyName);
		$("#addressPreview").html(address);
		$("#emailAddressPreview").html(emailAddress);
		$("#telephonePreview").html(telephone);
		$("#faxNoPreview").html(faxNo);
		$("#applicationDatePreview").html(applicationDate);
		$("#trnNumberPreview").html(trnNumber);
		$("#claimantRelativeBankruptPreview").html(claimBankrupt);
	}
	function previewInsolventDetailInfo() {
		insolventPersonNature = $("#insolventPersonNature").val();
		insolventIndiFirstName = $("#insolventIndiFirstName").val();
		insolventIndiLastName = $("#insolventIndiLastName").val();
		insolventCompanyName = $("#insolventCompanyName").val();
		Debtstatute = $("input[name='Debtstatute']:checked").val();
		$("#insolventPersonNaturePreview").html(insolventPersonNature);
		$("#insolventIndiFirstNamePreview").html(insolventIndiFirstName);
		$("#insolventIndiLastNamePreview").html(insolventIndiLastName);
		$("#insolventCompanyNamePreview").html(insolventCompanyName);
		$("#debtStatutePreview").html(Debtstatute);
	}
	function previewProofClaimInfo() {
		/* var selectedAssignmentAttached = new Array();
		$("input:checkbox[name=claimantAttached]:checked").each(function() {
			selectedClaimantAttached.push($(this).val()); */
		
		claimAddress = $("#claimAddress").val();
		claimPhone = $("#claimPhone").val();
		faxClaim = $("#faxClaim").val();
		emailAddressClaim = $("#emailAddressClaim").val();
		indiFirstName = $("#indiFirstName").val();
		insolventIndiFirstName = $("#insolventIndiFirstName").val();
		completingForm = $("#completingForm").val();
		positionCompletingForm = $("#positionCompletingForm").val();
		unsecuredClaim1 = $("#unsecuredClaim1").val();
		regardingAmount1 = $("#regardingAmount1").val();
		securedClaim1 = $("#securedClaim1").val();
		descriptionsClaim = $("#descriptionsClaim").val();
		bankruptcyDatePro = $("#bankruptcyDatePro").val();
		bankruptcyDateSpouse = $("#bankruptcyDateSpouse").val();
		completingFormAct = $("#completingFormAct").val();
		datePerson = $("#datePerson").val();
		justicePeace = $("#justicePeace").val();
		amountClaim = $("#amountClaim").val();
		/* amountAdmitted = $("#amountAdmitted").val();
		amountPayment = $("#amountPayment").val(); */
		dateVoting = $("#dateVoting").val();
		dateAdmitted = $("#dateAdmitted").val();
		applicationDateCa = $("#applicationDateCa").val();
		valueOfClaim = $("#valueOfClaim").val();
		
		
		var selectedClaimantAttached = new Array();
		$("input:checkbox[name=claimantAttached]:checked").each(function() {
			selectedClaimantAttached.push($(this).val());
		});
		$("#selectedClaimantAttachedPreview, .matterType").html(selectedClaimantAttached.join(", "));
		
		var selectedclaimantA = new Array();
		$("input:checkbox[name=claimantA]:checked").each(function() {
			selectedclaimantA.push($(this).val());
		});
		$("#claimantAttachedPreview").html(selectedclaimantA.join(", "));
		
		var selectedclaimDebtor = new Array();
		$("input:checkbox[name=claimDebtor]:checked").each(function() {
			selectedclaimDebtor.push($(this).val()); 
		});
		$("#claimDebtorPreview").html(selectedclaimDebtor.join(", "));
		
		var selectedspecificClaim = new Array();
		$("input:checkbox[name=specificClaim]:checked").each(function() {
			selectedspecificClaim.push($(this).val());
		});
		$("#unsecuredClaimPreview").html(selectedspecificClaim.join(", "));
		$("#unsecuredClaimPriorityPreview").html($("input[name='regardingAmount']:checked").val());
		
		
		var selectedcategory1 = new Array();
		$("input:checkbox[name=category1]:checked").each(function() {
			selectedcategory1.push($(this).val());
		});
		$("#reasonablePreview").html(selectedcategory1.join(",<br/>"));
		
		var selectedcategory2 = new Array();
		$("input:checkbox[name=category2]:checked").each(function() {
			selectedcategory2.push($(this).val());
		});
		$("#nationalHousingPreview").html(selectedcategory2.join("<br/>"));
		
		var selectedcategory3 = new Array();
		$("input:checkbox[name=category3]:checked").each(function() {
			selectedcategory3.push($(this).val());
		});
		$("#securedCreditorsPreview").html(selectedcategory3.join("<br/>"));
		
		var selectedcategory4 = new Array();
		$("input:checkbox[name=category4]:checked").each(function() {
			selectedcategory4.push($(this).val());
		});
		$("#OtherPreview").html(selectedcategory4.join("<br/>"));
		
		var selectedknowledge = new Array();
		$("input:checkbox[name=knowledge]:checked").each(function() {
			selectedknowledge.push($(this).val());
		});
		$("#knowledgePreview").html(selectedknowledge.join(", "));
		
		var selectedbankruptcyIndi = new Array();
		$("input:checkbox[name=bankruptcyIndi]:checked").each(function() {
			selectedbankruptcyIndi.push($(this).val());
		});
		$("#bankruptcyIndiPreview").html(selectedbankruptcyIndi.join(",<br/>"));
		
		var selectedamountClaimed = new Array();
		$("input:checkbox[name=amountClaimed]:checked").each(function() {
			selectedamountClaimed.push($(this).val());
		});
		$("#amountClaimedPreview").html(selectedamountClaimed.join(", "));
		
		/* $("#selectedClaimantAttachedPreview").html(selectedClaimantAttached); */ 
		
		$("#indiFirstNamePreview").html(indiFirstName);
		$("#insolventPersonNaturePreview").html(insolventPersonNature);
		$("#claimAddressPreview").html(claimAddress);
		$("#claimPhonePreview").html(claimPhone);
		$("#claimFaxNoPreview").html(faxClaim);
		$("#claimEmailAddressPreview").html(emailAddressClaim);
		$("#claimDescriptionPreview").html(descriptionsClaim);
		/* $("#amountAdmittedPreview").html(amountAdmitted);
		$("#amountPaymentPreview").html(amountPayment); */
		$("#dateVotingPreview").html(dateVoting);
		$("#dateAdmittedPreview").html(dateAdmitted);
		
		var statementAccount = new Array();
		$("input:checkbox[name=statementAccount]:checked").each(function(){
			statementAccount.push($(this).val());
		});
		/* $("#statementOfAccountPreview").html(statementOfAccount.replace(/,/g, "<br/>")); */
		$("#statementOfAccountPreview").html(statementAccount.join(",<br/>"));
	}
</script>