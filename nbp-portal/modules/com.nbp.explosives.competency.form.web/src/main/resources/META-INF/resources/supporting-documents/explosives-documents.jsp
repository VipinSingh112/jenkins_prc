<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.upload.document.commands.GettingDocumentData"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<fieldset class="wizard-fieldset" id="explosivesSupportingDocumentFieldset" name="SUPPORTING DOCUMENTS">
	<p class="supporting-document-title common-heading f1 mb-2">Supporting
		Documents</p>
	<p class="supporting-document-subtitle mandatory-doc-heading hide">Mandatory
		Documents (that may attract an expiry date)</p>
	<div id="documentList">
	</div>
	<input type="hidden" id="explosivesDocumentuploadCounter"
		name="explosivesDocumentuploadCounter">
	<div class="generic-document">
		<p class="generic-heading">Additional Supporting Documents</p>
		<p>Upload Additional Supporting Documents that you think would
			help in processing this application</p>
		<div class="right text-nowrap">
			<input type="file" id="explosivesGenericUpload" multiple="multiple"
				name="<portlet:namespace/>explosivesGenericUpload"
				hidden=""> <label class="custom-upload"
				for="explosivesGenericUpload"> <span class="mr-2"> <svg
						width="14" height="17" viewBox="0 0 14 17" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
                       <path
							d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
							fill="#047247"></path> 
                      </svg>
			</span>Upload
			</label>
			<span id="explosivesFileChosen">or drag and drop from your computer</span>
		</div>
		<div id="uploaded-documents-container">
		    <!-- Delete button initially hidden -->
		   <!-- <a class="uploaded-delete mr-2" href="#" style="display: none;">
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		            <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#184C48"></path>
		        </svg>
		    </a>-->
		</div>	
		
		<% String fileUrl="";
		FileEntry fileEntryForGeneric=null;
		DLFolder supportingDocumentsParentFolderGeneric = null;
		DLFolder supportingDocumentsSubFolderGeneric = null;
		List<DLFileEntry> dlFileEntriesGeneric =null;
		try{
		supportingDocumentsParentFolderGeneric=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), explosivesApplicationId);
		
		supportingDocumentsSubFolderGeneric =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGeneric.getFolderId(),
					"Generic Documents");
		}catch(Exception e){}
		try{
		if(explosivesApplicationId>0){
			 dlFileEntriesGeneric=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGeneric.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(explosivesApplicationId>0 && dlFileEntriesGeneric!=null){
			try{
				int docOfExplosiveAdditionalCounter=1001;
			for (DLFileEntry uploadedFile : dlFileEntriesGeneric) {
				try{
					fileEntryForGeneric = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrl = DLURLHelperUtil.getDownloadURL(fileEntryForGeneric, fileEntryForGeneric.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				}catch(Exception e ){
				}
		%><div class="supporting-document-card mb-2 generic-document-list" id="genericSupportingDocuments<%=docOfExplosiveAdditionalCounter%>">
			<div class="row">
					<div class="col-md-12" id="uploadedFormResult<%=docOfExplosiveAdditionalCounter%>">
						<%
						%>
						<%@ include file="/forms/uploadedFileRender.jsp"%>
					</div>
				</div>
			</div>	
			<%	
			docOfExplosiveAdditionalCounter++;
			}}catch(Exception e ){
			}
				}
			%> 
		<div class="modal fade commonsavepopup" id="commonuploadpopup"
			data-keyboard="false" tabindex="-1"
			aria-labelledby="staticBackdropLabel" aria-hidden="true"
			style="display: none;">
			<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
				<div class="modal-content">
					<div class="modal-header">
						 <button type="button" class="close" data-dismiss="modal" aria-label="Close">
					          <span aria-hidden="true">&times;</span>
					     </button>
					</div>
					<div class="modal-pic">
						<img src="http://localhost:8080/o/nbp-theme/images/popup.png"
							class="img-fluid">
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-12">
								<p class="modal-title f1 mb-4">Upload Supporting Document</p>
							</div>
							<input type="hidden"
								id="<portlet:namespace/>documentName"  value="">
							<div class="col-md-12">
								<div class="row">
									<div class="col-md-6 mb-3">
										<p class="tab-form-main-heading">Document Number</p>
										<input type="text" class="form-control"
											id="<portlet:namespace/>documentNumber"
											placeholder="#2345">
									</div>
									<div class="col-md-6 mb-3">
										<p class="tab-form-main-heading">Issue Date</p>
										<input type="date" class="form-control"
											id="<portlet:namespace/>issueDate"
											placeholder="#2345">
									</div>
									<div class="col-md-6 mb-3">
										<p class="tab-form-main-heading">Expiry Date</p>
										<input type="date" class="form-control"
											id="<portlet:namespace/>expiryDate"
											placeholder="#2345">
									</div>
									<div class="col-md-6 mb-3">
										<p class="tab-form-main-heading">Choose File</p>
										<div class="custom-file">
											<input type="file" class="custom-file-input" id="explosivesEnrollDocuments" onchange="attachDetailed(this.id)"
												name="<portlet:namespace/>explosivesEnrollDocuments">
											<label class="custom-file-label overflow-hidden" for="customFile">Choose
												file</label>
										</div>
									</div>
								</div>
							</div>
							<input type="hidden" id="explosivesDocumentuploadCounter"
								name="fireBrigadeDocumentuploadCounter">
							<div class="col-md-12">
								<div class="footer-above-border"></div>
							</div>
						</div>
					</div>
					<div class="modal-footer border-0 d-flex justify-content-end">
						<div>
							<a href="javascript:;"
								class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard"
								onclick="supportingDocumentUpload();"> Submit<span class="ml-2">
							</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="/explosives-wizard-buttons.jsp" %>
</fieldset>