<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.ncra.application.upload.documents.util.GettingDocumentData"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@ include file="../init.jsp" %>
<div class="hide imported-petrol-forms-pre">
	<section id="ncraServicesPreviewStep3" class="final-preview-section">
		<div class="applicant-details-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Applicant Details</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="imported-petrol-pre-edit-tab">
								<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
			                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
			                    </svg>
		                    </a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Business</p>
						<p class="sub_heading_content imported-business-name-preview"></p>
					</div>
				</div>
	            <div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content imported-address-preview"></p>
					</div>
				</div>
	            <div class="col-6">
					<div>
						<p class="sub_heading">Contact Person</p>
						<p class="sub_heading_content imported-contact-preview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone Number</p>
						<p class="sub_heading_content imported-tele-num-preview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax No</p>
						<p class="sub_heading_content imported-fax-no-preview"></p>
					</div>
				</div>
	            <div class="col-6">
					<div>
						<p class="sub_heading">E-mail Address</p>
						<p class="sub_heading_content imported-email-addr-preview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Location of scale(s) to be verified </p>
						<p class="sub_heading_content imported-location-preview"></p>
					</div>
				</div>
			</div>
			<hr/>
		</div>
	</section>
</div>
<div id="ncraCommonApplicationPreview">
	<section class="final-preview-section supporting-doc-preview" id="ncraServicesPreviewStep4">
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
		supportingDocumentsParentFolderGenericPre=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), ncraApplicationId);
		
		supportingDocumentsSubFolderGenericPre =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGenericPre.getFolderId(),
					"Generic Documents");
		}catch(Exception e){}
		try{
		if(ncraApplicationId>0){
			 dlFileEntriesGenericPre=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGenericPre.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(ncraApplicationId>0 && dlFileEntriesGenericPre!=null){
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
	<section class="final-preview-section hide fee-payment-preview" id="ncraServicesPreviewStep5">
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
						<p class="sub_heading">Credit Status</p>
						<p class="sub_heading_content fee-method-preview"></p>
					</div>
				</div>
				<!-- <div class="col-6">
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
				</div>	 -->
			</div>
		</div>
	</section>
</div>

<script>
function previewApplicantDetailInfo(){
	importedBusinessName = $("#importedbusinessname").val();
	importedAddress = $("#imported-address").val();
	importedApplicantContact = $("#imported-applicant-contact").val();
	importedTeleNum = $("#imported-applicant-tele-num").val();
	importedFaxNo = $("#imported-fax-no").val();
	importedApplicantEmailAddr = $("#imported-applicant-email-addr").val();
	importedApplicantLocation = $("#imported-applicant-location").val();
	
	$(".imported-business-name-preview").html(importedBusinessName);
	$(".imported-address-preview").html(importedAddress);
	$(".imported-contact-preview").html(importedApplicantContact);
	$(".imported-tele-num-preview").html(importedTeleNum);
	$(".imported-fax-no-preview").html(importedFaxNo);
	$(".imported-email-addr-preview").html(importedApplicantEmailAddr);
	$(".imported-location-preview").html(importedApplicantLocation);
}
</script>