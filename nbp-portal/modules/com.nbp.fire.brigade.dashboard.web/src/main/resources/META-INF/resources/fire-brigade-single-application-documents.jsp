<%@page import="com.liferay.expando.kernel.service.ExpandoValueLocalServiceUtil"%>
<%@page import="com.liferay.expando.kernel.service.ExpandoColumnLocalServiceUtil"%>
<%@page import="com.liferay.expando.kernel.model.ExpandoValue"%>
<%@page import="com.liferay.expando.kernel.model.ExpandoColumn"%>
<%@page import="com.liferay.expando.kernel.model.ExpandoTableConstants"%>
<%@page import="com.liferay.expando.kernel.service.ExpandoTableLocalServiceUtil"%>
<%@page import="com.liferay.expando.kernel.model.ExpandoTable"%>
<%@page import="com.liferay.portal.kernel.service.ClassNameLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<section class="wizard-section mt-5">
<portlet:resourceURL id="fire/expired/document" var="fireExpiredDocumentResourceUrl"></portlet:resourceURL>
<div class="container">
<p class="main-heading">Documents</p>
<%
// SezStatusApplication sezStatusApplication= SezStatusApplicationLocalServiceUtil.getSezStatusApplication();
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsParentFolder =null;
DLFolder supportingDocumentsFolder = null;
	try{
	 supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
			themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
			"Fire Brigade Supported Documents");
	 supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingDocumentsParentFolder.getFolderId(),
			String.valueOf(fireBrigadeApplicationId));
	 supportinfDocFileEntries = DLFileEntryLocalServiceUtil
			.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
	}
	catch(Exception e){
	}
	int counter = 1;
	//DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
		Date currentDate = new Date();
		FileEntry fileEntry = null;
		String fileUrl = "";
		String fileSize = "";
		String previewUrl = "";
		String expiryDate = "";
		String issueDate = "";
		String documentNumber = "";
		String fileName = "";
		fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
		fileUrl = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
				StringPool.BLANK, false, true);
		fileSize = HtmlUtil.escape(LanguageUtil.formatStorageSize(fileEntry.getSize(), themeDisplay.getLocale()));
		previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
				StringPool.BLANK, false, true);
		int result = 0;
		String expirationClass = "";
		String hideUploadbtn="hide";
		if(Validator.isNotNull(fileEntry.getExpirationDate())){
			expiryDate = dateFormatter.format(fileEntry.getExpirationDate());
			result = currentDate.compareTo(dlFileEntry.getExpirationDate());
			if (result > 0) {
				expirationClass = "expired-document-card";
				hideUploadbtn="";
			}
		}
		try{
			long classNameId = ClassNameLocalServiceUtil.getClassNameId(DLFileEntry.class.getName());
			ExpandoTable expandoTable = ExpandoTableLocalServiceUtil.getTable(themeDisplay.getCompanyId(),
					classNameId, ExpandoTableConstants.DEFAULT_TABLE_NAME);
			ExpandoColumn docNoExpandoColumn = ExpandoColumnLocalServiceUtil
					.getColumn(expandoTable.getTableId(), "Document Number");
			ExpandoValue expandoValue = ExpandoValueLocalServiceUtil.getValue(expandoTable.getTableId(),
					docNoExpandoColumn.getColumnId(), fileEntry.getFileEntryId());
			documentNumber = expandoValue.getData();
				expiryDate = dateFormatter.format(fileEntry.getExpirationDate());
				issueDate = dateFormatter.format(fileEntry.getLastPublishDate());
				fileName = dlFileEntry.getFileName();
			}catch(Exception e){}  

%>
<input type="hidden" id="documentuploadCounter" name="documentuploadCounter">
<div class="supporting-document-card <%=expirationClass%> mb-3">
		<div class="row">
			<div class="col-md-12">
				<div class="supporting-document-card-wrapper">
					<div class="left">
						<p class="supporting-document-card-upper-heading">
							<%=dlFileEntry.getTitle()%>
						</p>
					</div>
					<%-- <div class="right text-nowrap <%=hideUploadbtn%>">
						<a class="custom-upload reUploadBtn<%=counter%>" href="javascript:;"
							onclick="openDocumentUploadPopup('<%=counter%>','<%=dlFileEntry.getTitle()%>')">
							<span class="mr-2"><svg width="14" height="17"
									viewBox="0 0 14 17" fill="none"
									xmlns="http://www.w3.org/2000/svg">
		                       <path
										d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
										fill="#047247" />
		                       </svg> </span> Upload
						</a>
					</div> --%>
				</div>
			</div>
		</div>

		<div class="upload-progress progress hidden<%=counter%> hide" >
        	<div id="progress<%=counter%>" class="progress-bar h-100 upload-progress-bar" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0" ></div>
        </div>
		<div class="row">
			<div class="col-md-12">
				<div id="uploaded-info<%=counter %>" class="uploaded-info">
					<div class="left">
						<p class="uploaded-info-title" id="document-name"><%=fileName %></p>
						<p class="uploaded-info-size" id="document-size"><%=fileSize %></p>
					</div>
					<div class="right">
					<%if(Validator.isNotNull(documentNumber)){%>
						<span class="uploaded-info-detail" id="document-number"><%="No. "+documentNumber%></span>
						<%}if(Validator.isNotNull(issueDate)){%>
						<span class="uploaded-info-detail" id="document-issue-date">Issued on <%=issueDate%></span> 
						<%}if(Validator.isNotNull(expiryDate)){%>
						<span class="uploaded-info-detail expired-text" id="document-expiry-date"> Expired on <%=expiryDate%></span> 
						<%}%>
						<a class="uploaded-actionlink" href="<%=fileUrl%>" id="doc-download-btn" target="_blank"> 
							<span class="mr-2">
								<svg width="14" height="17" viewBox="0 0 14 17" fill="none"
									xmlns="http://www.w3.org/2000/svg">
					            	 <path
										d="M11.59 6H10V1C10 0.45 9.55 0 9 0H5C4.45 0 4 0.45 4 1V6H2.41C1.52 6 1.07 7.08 1.7 7.71L6.29 12.3C6.68 12.69 7.31 12.69 7.7 12.3L12.29 7.71C12.92 7.08 12.48 6 11.59 6ZM0 16C0 16.55 0.45 17 1 17H13C13.55 17 14 16.55 14 16C14 15.45 13.55 15 13 15H1C0.45 15 0 15.45 0 16Z"
										fill="#BA8207" />
					             </svg>
						</span>  Download
						</a> 
					</div>
				</div>
			</div>
		</div>
	</div>
	<% 
	counter = counter + 1;
	%>
	<div class="modal fade commonsavepopup"
		id="deletepopup<%=fileEntry.getFileEntryId()%>" data-keyboard="false"
		tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true"
		style="display: none;">
		<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
			<div class="modal-content">
				<div class="modal-pic">
					<img src="/failed-popup"
						class="img-fluid" />
				</div>
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
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
					<a href="javascript:;"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard" onClick="deleteDocument('<%=fileEntry.getFileEntryId()%>');">
						Yes<span class="ml-2"> </span>
					</a> <a href="javascript:;"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard"
						data-dismiss="modal" aria-label="Close"> No<span class="ml-2">
					</span>
					</a>
				</div>
			</div>
		</div>
	</div>
	 <%
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
					<img src="<%=themeDisplay.getPathThemeImages()%>/popup.png"
						class="img-fluid" />
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-12">
							<p class="modal-title f1 mb-4">Upload Supporting Document</p>

						</div>
						<input type="hidden" id="<portlet:namespace/>documentName"  />
						<div class="col-md-12">
							<div class="row">
								<div class="col-md-6 mb-3">
									<p class="tab-form-main-heading">Document Number</p>
									<input type="text" class="form-control"
										id="<portlet:namespace/>documentNumber"
										aria-describedby="emailHelp" placeholder="#2345">
								</div>
								<div class="col-md-6 mb-3">
									<p class="tab-form-main-heading">Issue Date</p>
									<input type="date" class="form-control"
										id="<portlet:namespace/>issueDate"
										aria-describedby="emailHelp" placeholder="#2345">
								</div>
								<div class="col-md-6 mb-3">
									<p class="tab-form-main-heading">Expiry Date</p>
									<input type="date" class="form-control"
										id="<portlet:namespace/>expiryDate"
										aria-describedby="emailHelp" placeholder="#2345">
								</div>
								<div class="col-md-6 mb-3">
									<p class="tab-form-main-heading">Choose File</p>
									<div class="custom-file">
										<input type="file" class="custom-file-input" id="enrollDocuments" name="<portlet:namespace/>enrollDocuments"> <label
											class="custom-file-label overflow-hidden" for="customFile">Choose
											file</label>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-12">
							<div class="footer-above-border"></div>
						</div>
					</div>
				</div>
				<div class="modal-footer border-0 d-flex justify-content-end">
					<div>
						<a href="javascript:;"
							class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard"
							onClick="fireBrigadeUploadDocument();"> Submit<span class="ml-2">
						</span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div> 
	
	<p class="main-heading">Additional Supporting Documents</p>
	<%  try{
		int counterDas = 1;
					DLFolder supportingDocumentsFolderGeneric = null;
					DLFolder supportingDocumentsParentFolderGeneric = null;
					DLFolder supportingDocumentsSubFolderGeneric = null;
					List<DLFileEntry> dlFileEntriesGeneric =null;
					String fileUrlForGeneric = "";
					FileEntry fileEntryForGenericInAdmin=null;

						try {
							supportingDocumentsParentFolderGeneric = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Fire Brigade Supported Documents");
							supportingDocumentsFolderGeneric = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									supportingDocumentsParentFolderGeneric.getFolderId(),
									String.valueOf(fireBrigadeApplicationId));
							supportingDocumentsSubFolderGeneric =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									supportingDocumentsFolderGeneric.getFolderId(),
										"Generic Documents");
							dlFileEntriesGeneric=DLFileEntryLocalServiceUtil
									.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGeneric.getFolderId());
						} catch (Exception e) {
						
						}
						if(dlFileEntriesGeneric!=null){
					for (DLFileEntry uploadedFile : dlFileEntriesGeneric) {
						try{
							fileEntryForGenericInAdmin = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
							fileUrlForGeneric = DLURLHelperUtil.getDownloadURL(fileEntryForGenericInAdmin, fileEntryForGenericInAdmin.getFileVersion(),
									themeDisplay, StringPool.BLANK, false, true);
							}catch(Exception e){
							}
						%>	
	<div class="supporting-document-card mb-2" id="genericSupportingDocuments">
				<div class="row">
					<div class="col-md-12" id="uploadedFormResult">
						<%@ include file="/uploadedFileRender.jsp" %>
					</div>
				</div>
			</div>					
			
		<%	counterDas=counterDas+1;}}
						else{
			%><p class="main-heading"><h3>There are no Additional Supporting Document for This Application</h3></p>
			<%}}catch(Exception e){ }%>
	</div>		
</section>
<script>
	function previewDocument(fileEntryId) {
		$("#previewDocumentPop" + fileEntryId).modal("show");
	}
	function opendelDocPopup(fileEntryId) {
		$("#deletepopup" + fileEntryId).modal("show");
	}
	
	$(function() {
		$(document).on('change', '#enrollDocuments', function() {
			var fileName = $(this).val();
			fileName = fileName.replace("C:\\fakepath\\", "");
			$(this).next('.custom-file-label').html(fileName);
		})
	});
	function openDocumentUploadPopup(counterVal, documentName) {
		$("#<portlet:namespace/>documentName").val("");
		$("#<portlet:namespace/>documentNumber").val("");
		$("#<portlet:namespace/>issueDate").val("");
		$("#<portlet:namespace/>expiryDate").val("");
		$('.custom-file-label').html('Choose File');
		$("#documentuploadCounter").val(counterVal);
		$("#<portlet:namespace/>documentName").val(documentName);
		$("#commonuploadpopup").modal("show");
	}
	function fireBrigadeUploadDocument() {
		var documentNumber = $("#<portlet:namespace/>documentNumber").val();
		var issueDate = $("#<portlet:namespace/>issueDate").val();
		var expiryDate = $("#<portlet:namespace/>expiryDate").val();
		var documentuploadCounter = $("#documentuploadCounter").val();
		var documentName = $("#<portlet:namespace/>documentName").val();
		var fileID = 'enrollDocuments';
		$("#commonuploadpopup").modal("hide");
		$('.hidden'+documentuploadCounter).removeClass('hide');
		var progress = document.getElementById('progress'+documentuploadCounter);
		fireBrigadeApplicationId=$("#fireBrigadeApplicationId").val();
		var progress = document.getElementById('progress'+documentuploadCounter);
		progress.ariaValueNow = 50;
        progress.style.width ='50%';
		$
		.ajaxFileUpload({
			secureuri : false, 
			method : "POST",
			fileElementId : 'enrollDocuments',
			url : '${fireExpiredDocumentResourceUrl}',
			dataType: 'text',
			data : {
				"<portlet:namespace/>documentNumber" : documentNumber,
				"<portlet:namespace/>fileID" : fileID,
				"<portlet:namespace/>command" : "fileUpload",
				"<portlet:namespace/>issueDate" : issueDate,
				"<portlet:namespace/>expiryDate" : expiryDate,
				"<portlet:namespace/>documentName" : documentName,
				"<portlet:namespace/>fireBrigadeApplicationId" : fireBrigadeApplicationId,
				"<portlet:namespace/>documentuploadCounter": documentuploadCounter,
			},
			success : function(data, status) {
				var progress = document.getElementById('progress'+documentuploadCounter);
				progress.ariaValueNow = 100;
	            progress.style.width ='100%';
	            $('.hidden'+documentuploadCounter).addClass('hide');
	            $('.hidden'+documentuploadCounter).parents().removeClass("expired-document-card");
	            $('.reUploadBtn'+documentuploadCounter).addClass('hide');
	            $("#uploaded-info"+documentuploadCounter).html(data);
			},
			error : function(data, status, e) {
			}
		});
	}
</script>