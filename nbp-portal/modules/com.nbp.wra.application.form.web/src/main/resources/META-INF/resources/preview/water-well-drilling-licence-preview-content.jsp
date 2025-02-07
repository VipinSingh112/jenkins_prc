<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.wra.upload.document.commands.GettingDocumentData"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@ include file="../init.jsp" %>
<div class="water-well-drilling-forms-preview hide">

	<section id="#wraPreviewStep5" class="final-preview-section">
		<div class="water-well-drilling-forms-preview">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form E(Regulation 19(1))</p>
						<span class="ml-3"> <a href="javascript:void(0)" class="preview-edit-button"
							id="waterResourceWellEdit"> <svg width="19" height="19"
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
				<div class="col-6">
					<div>
						<p class="sub_heading">Application No</p>
						<p class="sub_heading_content" id="wellDrillingApplicationNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">1. Name of Applicant</p>
						<p class="sub_heading_content" id="wellDrillingApplicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="wellDrillingAddressParishPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">2. Address of Applicant</p>
						<p class="sub_heading_content" id="wellDrillingApplicantAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">3. Date of Birth</p>
						<p class="sub_heading_content" id="wellDrillingDOBDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">4. Educational background</p>
						<p class="sub_heading_content" id="wellDrillingEducationalPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">5. Indicate specific training relevant to
							well-drilling</p>
						<p class="sub_heading_content" id="wellDrillingSpecificTrainingPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">6. Indicate specific experience in
							well-drilling</p>
						<p class="sub_heading_content" id="wellDrillingSpecificExperiencePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">7. Are you self-employed?</p>
						<p class="sub_heading_content" id="selfEmployedPreview"></p>
					</div>
				</div>
				<div class="col-6 notSelfEmployedPreview hide">
					<div>
						<p class="sub_heading">Name of Employer</p>
						<p class="sub_heading_content" id="wellDrillingNamePreview"></p>
					</div>
				</div>
				<div class="col-6 notSelfEmployedPreview hide">
					<div>
						<p class="sub_heading">How long employed by present Employer</p>
						<p class="sub_heading_content" id="wellDrillingPersentEmployerPreview"></p>
					</div>
				</div>
				<div class="col-12 notSelfEmployedPreview hide">
					<div>
						<p class="sub_heading">Address of Employer</p>
						<p class="sub_heading_content" id="wellDrillingAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading mb-0">9. State names and addresses of two
						references</p>
				</div>
				<div class="col-6">
					<div>
						<p class="tab-form-sub-heading mt-2">References 1</p>
						<p class="sub_heading_content" id="wellDrillingStateFirstPreview"></p>
						<p class="sub_heading_content" id="wellDrillingFirstAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="tab-form-sub-heading mt-2">References 2</p>
						<p class="sub_heading_content" id="wellDrillingStateSecPreview"></p>
						<p class="sub_heading_content" id="wellDrillingAddressSecPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">
							I <span class="giluio wellApplicantName"> </span> hereby apply
								for a well-driller's licence pursuant to the Water Resources Act
								and declare that to the best of my knowledge the above
								particulars are true and correct.
						</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="WellDrillingSignDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature</p>
					<div class="signature_texarea mb-2"
						id="applicantSignatureWellDrillingImgHolderPreview">
						<%if(Validator.isNotNull(wellDrillingSignUrl)){ %>
							<img src="<%=wellDrillingSignUrl%>"  width="100" height="100"/>
							<%} %>
						</div>
				</div>
			</div>
		</div>
	</section>
</div>

<section class="final-preview-section supporting-doc-preview" id="wraPreviewStep6">
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
				<!-- <p>Optional Documents</p> -->
				<div id="notRequireDocPreview"></div>
			</div>
			<!-- <div class="col-12" id="additionalDocPreviewSection">
				<p>Additional Supporting Documents</p>
				<p class="sub_heading noAdditionalSupportingDoc">No Additional Supporting Documents</p>
				<div id="additionalDocPreview"></div>
			</div> -->
			<div class="col-12" id="additionalDocPreviewSection">
				<p>Additional Supporting Documents</p>
				<!-- After save and cont -->
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
		supportingDocumentsParentFolderGenericPre=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), wraApplicationId);
		
		supportingDocumentsSubFolderGenericPre =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGenericPre.getFolderId(),
					"Generic Documents");
		}catch(Exception e){}
		try{
		if(wraApplicationId>0){
			 dlFileEntriesGenericPre=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGenericPre.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(wraApplicationId>0 && dlFileEntriesGenericPre!=null){
			for (DLFileEntry uploadedFile : dlFileEntriesGenericPre) {
				try{
					fileEntryForGenericPre = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlForPreview = DLURLHelperUtil.getDownloadURL(fileEntryForGenericPre, fileEntryForGenericPre.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				}catch(Exception e ){
				}
		%>
		<div class="additionalDocPreviewOne">
			<div class="document-container-preview<%=counterOfDocumentsPre%> mb-2">
			<a class="sub_heading_content" id="additionalDocNamePreview<%=counterOfDocumentsPre%>" href="<%=Validator.isNotNull(fileUrlForPreview)? fileUrlForPreview:""%>"><%=uploadedFile.getFileName() %></a></div>
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
<section class="final-preview-section" id="wraPreviewStep7">
	<div class="fee-payment-info-form">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Fee Payment</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="fee-payment-edit-tab">
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
					<p class="sub_heading">Method</p>
					<p class="sub_heading_content fee-method-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Proof of Payment</p>
					<p><a class="sub_heading_content" id="payment-upload-preview"href="<%=Validator.isNotNull(feeRecipetUrl)? feeRecipetUrl:""%>"><%=(Validator.isNotNull(feeRecipet))?feeRecipet:""%></a></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Amount</p>
					<p class="sub_heading_content fee-amount-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Currency</p>
					<p class="sub_heading_content fee-currency-preview"></p>
				</div>
			</div>	
		</div>
	</div>
</section>
