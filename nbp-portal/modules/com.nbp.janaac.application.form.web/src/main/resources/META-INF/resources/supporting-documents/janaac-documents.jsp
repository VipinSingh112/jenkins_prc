<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<fieldset class="wizard-fieldset" id="janaacSupportingDocumentFieldset" name="SUPPORTING DOCUMENTS">
	<p class="supporting-document-title common-heading f1 mb-2">Supporting Documents</p>
	<p class="supporting-document-subtitle mandatory-doc-heading hide">Mandatory
		Documents (that may attract an expiry date)</p>
	<div id="documentList" class="">
	</div>
	<div class="generic-document">
		<p class="generic-heading">Additional Supporting Documents</p>
		<p>Upload Additional Supporting Documents that you think would
			help in processing this application</p>
		<div class="right text-nowrap">
			<input type="file" id="janaacGenericUpload" multiple="multiple"
				name="<portlet:namespace/>janaacGenericUpload"
				hidden="" onchange="attachDetailed(this.id)"/> <label class="custom-upload"
				for="janaacGenericUpload"> <span class="mr-2"> <svg
						width="14" height="17" viewBox="0 0 14 17" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
                       <path
							d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
							fill="#047247"></path> 
                      </svg>
			</span>Upload
			</label>
			<span id="janaacGenericFileChosen"></span>
		</div>
		<div id="uploaded-documents-container">
		</div>
		<%
					DLFolder supportingDocumentsFolderGeneric = null;
					DLFolder supportingDocumentsParentFolderGeneric = null;
					DLFolder supportingDocumentsSubFolderGeneric = null;
					List<DLFileEntry> dlFileEntriesGeneric =null;
					String fileUrlInJannaac = "";
					FileEntry fileEntryForGeneric=null;
						try {
							supportingDocumentsParentFolderGeneric = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JANAAC Supported Documents");
							supportingDocumentsFolderGeneric = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									supportingDocumentsParentFolderGeneric.getFolderId(),
									String.valueOf(janaacApplicationId));
							supportingDocumentsSubFolderGeneric =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									supportingDocumentsFolderGeneric.getFolderId(),
										"Generic Documents");
							dlFileEntriesGeneric=DLFileEntryLocalServiceUtil
									.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGeneric.getFolderId());
							
						} catch (Exception e) {
						}
				if(janaacApplicationId>0 && dlFileEntriesGeneric!=null){
					int genericJanaacCounter=1001;
					for (DLFileEntry uploadedFile : dlFileEntriesGeneric) {
						try{
							fileEntryForGeneric = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
							fileUrlInJannaac = DLURLHelperUtil.getDownloadURL(fileEntryForGeneric, fileEntryForGeneric.getFileVersion(), themeDisplay,
									StringPool.BLANK, false, true);
						}catch(Exception e ){
						}
						%>	
						<div class="supporting-document-card mb-2 generic-document-list" id="genericSupportingDocuments<%=genericJanaacCounter%>">
				<div class="row">
					<div class="col-md-12" id="uploadedFormResult<%=genericJanaacCounter%>">
						<%@ include file="/forms/uploadedFileRender.jsp"%>
					</div>
				</div>
			</div>					<%	
		genericJanaacCounter++;}
				}
			%>   
		
		<div class="modal fade commonsavepopup" id="commonuploadpopup"
			data-keyboard="false" tabindex="-1"
			aria-labelledby="staticBackdropLabel" aria-hidden="true"
			style="display: none;">
			<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
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
											<input type="file" class="custom-file-input" id="janaacEnrollDocuments"
												name="<portlet:namespace/>janaacEnrollDocuments" onchange="attachDetailed(this.id)"/>
											<label class="custom-file-label overflow-hidden" for="customFile">Choose
												file</label>
										</div>
									</div>
								</div>
							</div>
							<input type="hidden" id="documentuploadCounter"
								name="documentuploadCounter">
							<div class="col-md-12">
								<div class="footer-above-border"></div>
							</div>
						</div>
					</div>
					<div class="modal-footer border-0 d-flex justify-content-end">
						<div>
							<a href="javascript:;"
								class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard"
								onclick="uploadDocumentInJanaac();"> Submit<span class="ml-2">
							</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/janaac-wizard-buttons.jsp"%>
</fieldset>