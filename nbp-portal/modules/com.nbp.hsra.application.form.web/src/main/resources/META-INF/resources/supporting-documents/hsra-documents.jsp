<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<fieldset class="wizard-fieldset" id="hsraSupportingDocumentFieldset" name="SUPPORTING DOCUMENTS">
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
			<input type="file" id="hsraGenericUpload" multiple="multiple"
				name="<portlet:namespace/>hsraGenericUpload"
				hidden=""> <label class="custom-upload"
				for="hsraGenericUpload"> <span class="mr-2"> <svg
						width="14" height="17" viewBox="0 0 14 17" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
                       <path
							d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
							fill="#047247"></path> 
                      </svg>
			</span>Upload
			</label>
			<span id="hsraGenericFileChosen"></span>
		</div>
		<div id="uploaded-documents-container">
		    <!-- Delete button initially hidden -->
		    <!--<a class="uploaded-delete mr-2" href="#" style="display: none;">
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		            <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#184C48"></path>
		        </svg>
		    </a>-->
		</div>
		<% int hsraCounter =counterOfDocuments+ 1;
					DLFolder supportingDocumentsFolderGeneric = null;
					DLFolder supportingDocumentsParentFolderGeneric = null;
					DLFolder supportingDocumentsSubFolderGeneric = null;
					List<DLFileEntry> dlFileEntriesGeneric =null;
					String fileUrlInHsraApplication = "";
					FileEntry fileEntryForGeneric=null;
						try {
							supportingDocumentsParentFolderGeneric = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
							supportingDocumentsFolderGeneric = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									supportingDocumentsParentFolderGeneric.getFolderId(),
									String.valueOf(hsraApplicationId));
							supportingDocumentsSubFolderGeneric =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									supportingDocumentsFolderGeneric.getFolderId(),
										"Generic Documents");
							dlFileEntriesGeneric=DLFileEntryLocalServiceUtil
									.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGeneric.getFolderId());
							
						} catch (Exception e) {
						}
				if(hsraApplicationId>0 && dlFileEntriesGeneric!=null){
					try{
						int genericHsraCounter=1001;
					for (DLFileEntry uploadedFile : dlFileEntriesGeneric) {
						try{
							fileEntryForGeneric = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
							fileUrlInHsraApplication = DLURLHelperUtil.getDownloadURL(fileEntryForGeneric, fileEntryForGeneric.getFileVersion(), themeDisplay,
									StringPool.BLANK, false, true);
						}catch(Exception e ){
						}
						%>	
			<div class="supporting-document-card mb-2 generic-document-list" id="genericSupportingDocuments<%=genericHsraCounter%>">
				<div class="row">
					<div class="col-md-12" id="uploadedFormResult<%=genericHsraCounter%>">
						<%
						%>
						<div class="uploaded-info generic-doc" id="unpload-info-card<%=uploadedFile.getFileEntryId()%>">
							<div class="left">
								<p class="uploaded-info-title" id="document-name"><%=uploadedFile.getFileName() %></p>
								<p class="uploaded-info-size" id="document-size"><%=uploadedFile.getSize() %></p>
							</div>
							<div class="right">
								<a class="uploaded-actionlink" href="<%=fileUrlInHsraApplication%>" id="doc-download-btn" target="_blank"> 
									<span class="mr-2">
										<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg">
							            	 <path d="M11.59 6H10V1C10 0.45 9.55 0 9 0H5C4.45 0 4 0.45 4 1V6H2.41C1.52 6 1.07 7.08 1.7 7.71L6.29 12.3C6.68 12.69 7.31 12.69 7.7 12.3L12.29 7.71C12.92 7.08 12.48 6 11.59 6ZM0 16C0 16.55 0.45 17 1 17H13C13.55 17 14 16.55 14 16C14 15.45 13.55 15 13 15H1C0.45 15 0 15.45 0 16Z" fill="#BA8207" />
							             </svg> 
						             </span> Download
								</a> 
								<a class="uploaded-delete" href="javascript:;"  onclick="opendelDocPopup('<%=uploadedFile.getFileEntryId()%>','<%=genericHsraCounter%>')">
									<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
										xmlns="http://www.w3.org/2000/svg"> <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524" />
						            </svg>
								</a>
							</div>
						</div>
						<div class="modal fade commonsavepopup" id="deletepopup<%=uploadedFile.getFileEntryId()%>" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
						    <div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
						        <div class="modal-content">
						      		<div class="modal-pic">
						                <img src="/failed-popup" class="img-fluid" />
						            </div>
						            <div class="modal-header"> 
						                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
								          <span aria-hidden="true">&times;</span>
								        </button>
						            </div>
						            <div class="modal-body">
						                <div class="row">
						                    <div class="col-md-12">
						                        <p class="modal-title f1 mb-4">Are you sure you want to Delete?</p>
						                    </div>
						                </div>   
						            </div>
						            <div class="modal-footer border-0 d-flex justify-content-end">
						                <a href="javascript:;" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard" onClick="deleteDocument('<%=uploadedFile.getFileEntryId()%>');">
						                    Yes<span class="ml-2">
						                    </span>
						                </a>
						                <a href="javascript:;" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard" data-dismiss="modal" aria-label="Close">
						                    No<span class="ml-2">
						                    </span>
						                </a>
						            </div>
						        </div>
						    </div>
						</div>
					</div>
				</div>
			</div>					<%	
			genericHsraCounter++;}
				}catch(Exception e){}}
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
											<input type="file" class="custom-file-input" id="hsraEnrollDocuments"
												name="<portlet:namespace/>hsraEnrollDocuments">
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
								onclick="supportingDocumentUpload();"> Submit<span class="ml-2">
							</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/hsra-wizard-buttons.jsp" %>
</fieldset>