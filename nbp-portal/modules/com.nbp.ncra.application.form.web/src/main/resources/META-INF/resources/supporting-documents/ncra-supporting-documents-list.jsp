<%@page import="com.nbp.ncra.application.upload.documents.util.GettingDocumentData"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.expando.kernel.service.ExpandoValueLocalServiceUtil"%>
<%@page import="com.liferay.expando.kernel.model.ExpandoValue"%>
<%@page import="com.liferay.expando.kernel.model.ExpandoTableConstants"%>
<%@page import="com.liferay.expando.kernel.model.ExpandoTable"%>
<%@page import="com.liferay.expando.kernel.service.ExpandoColumnLocalServiceUtil"%>
<%@page import="com.liferay.expando.kernel.model.ExpandoColumn"%>
<%@page import="com.liferay.expando.kernel.service.ExpandoTableLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.ClassNameLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.lar.FileEntryUtil"%>
<%@page import="com.liferay.document.library.kernel.exception.FileEntryLockException"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@ include file="../init.jsp"%>
<% 
System.out.println("jsp doc list");
DLFolder supportingDocumentsParentAndSubFolder=null;
List<DLFileEntry> supportingDocFileEntries = new ArrayList<DLFileEntry>();
String ncraAppId="";
int sizeOfRequiredDocsList=0;
int sizeOfNonRequiredDocsList=0;
JSONObject supportingDocumentArray=new JSONFactoryUtil().createJSONObject();
if(Validator.isNotNull((JSONObject)request.getAttribute("documentListJsonArray"))){
supportingDocumentArray=(JSONObject)request.getAttribute("documentListJsonArray");
}
if(Validator.isNotNull(request.getAttribute("ncraApplicationId"))){
	ncraAppId= String.valueOf(request.getAttribute("ncraApplicationId"));
}
//Getting Documents on Basis of Mandatory And Optional

//Mandatory
String requiredDocumentArrayList=supportingDocumentArray.getString("requiredSupportingDocuments");
System.out.println("required-------"+requiredDocumentArrayList);
String documentRequiredSubstring= requiredDocumentArrayList.substring(1, requiredDocumentArrayList.length() - 1); 
System.out.println("documentRequiredSubstring-------"+documentRequiredSubstring);
String[] documentNameArray=documentRequiredSubstring.split(",");
System.out.println("documentNameArray-------"+documentNameArray);
sizeOfRequiredDocsList = documentNameArray.length;

//Optional
String notRequiredDocumentArrayList=supportingDocumentArray.getString("notRequiredSupportingDocuments");
String documentNotRequiredSubstring = notRequiredDocumentArrayList.substring(1, notRequiredDocumentArrayList.length() - 1); 
String[] notRequireddocumentNameArray=documentNotRequiredSubstring.split(",");
sizeOfNonRequiredDocsList = notRequireddocumentNameArray.length;


DLFolder subFolder=null;
try{
supportingDocumentsParentAndSubFolder =GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(),
			Long.valueOf(ncraAppId));
}catch(Exception e){
}
FileEntry fileEntry = null;
fileUrl = "";
String fileSize = "";
String previewUrl = "";
String expiryDate = "";
String issueDate = "";
String title = "";
String fileName = "";
long fileEntryId = 0;
SimpleDateFormat dateFormatDoc = new SimpleDateFormat("yyyy-MM-dd");
for(String documentNames:documentNameArray){
	String isDocumentUploaded = "";
	fileEntry = null;
	fileUrl = "";
	fileSize = "";
	previewUrl = "";
	expiryDate = "";
	issueDate = "";
	fileName = "";
	fileEntryId = 0;
	title = "";
	String documentNumber = "";
	if(Long.valueOf(ncraAppId)>0){
	try {
		fileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentAndSubFolder.getFolderId(), documentNames.trim());
	} catch (Exception e) {
	}}
	try{
		fileName = fileEntry.getFileName();
		if (fileEntry!=null) {
			isDocumentUploaded = "disabled";
		}
		fileEntryId = fileEntry.getFileEntryId();
			fileUrl = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(),
					themeDisplay, StringPool.BLANK, false, true);
			fileSize = HtmlUtil.escape(
					LanguageUtil.formatStorageSize(fileEntry.getSize(), themeDisplay.getLocale()));
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(),
					themeDisplay, StringPool.BLANK, false, true);
			if(Validator.isNotNull(fileEntry.getExpirationDate())){
				expiryDate = dateFormatDoc.format(fileEntry.getExpirationDate());
				}
				if(Validator.isNotNull(fileEntry.getLastPublishDate())){
				issueDate = dateFormatDoc.format(fileEntry.getLastPublishDate());
				}
			long classNameId = ClassNameLocalServiceUtil.getClassNameId(DLFileEntry.class.getName());
			ExpandoTable expandoTable = ExpandoTableLocalServiceUtil.getTable(themeDisplay.getCompanyId(),
					classNameId, ExpandoTableConstants.DEFAULT_TABLE_NAME);
			ExpandoColumn docNoExpandoColumn = ExpandoColumnLocalServiceUtil
					.getColumn(expandoTable.getTableId(), "Document Number");
			ExpandoValue expandoValue = ExpandoValueLocalServiceUtil.getValue(expandoTable.getTableId(),
					docNoExpandoColumn.getColumnId(), fileEntry.getFileEntryId());
			documentNumber = expandoValue.getData();
	} catch (Exception e) {
	}
	
%>	
<div id="requiredDoc">
	<div class="supporting-document-card mb-3">
		<div class="row">
			<div class="col-md-12">
				<div class="supporting-document-card-wrapper">
					<div class="left">
						<p class="supporting-document-card-upper-heading" id="requiredDoc<%=counterOfDocuments%>"><%=documentNames%></p>
					</div>
					<div class="right text-nowrap">
						<a id="documentUpload<%=counterOfDocuments%>" class="custom-upload <%=isDocumentUploaded%>" href="javascript:;" onclick="openDocumentUploadPopup('<%=counterOfDocuments%>','<%=documentNames%>')"> 
							<span class="mr-2">
								<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg">
		                       		<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247" />
		                       </svg> 
		                   </span> Upload
						</a>
					</div>
				</div>
			</div>
		</div>
		<div class="upload-progress progress hidden<%=counterOfDocuments%> hide" >
        	<div id="progress<%=counterOfDocuments%>" class="progress-bar h-100 upload-progress-bar" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0" ></div>
        </div>
		<div class="row">
			<div class="col-md-12" id="uploadedFormResult<%=counterOfDocuments%>">
			 <%if(fileEntry!=null && fileEntryId!=0){ %> 
			<div class="uploaded-info" id="unpload-info-card<%=fileEntryId%>">
				<div class="left">
					<p class="uploaded-info-title" id="document-name<%=counterOfDocuments%>"><%=fileName %></p>
					<p class="uploaded-info-size" id="document-size"><%=fileSize %></p>
				</div>
				<div class="right">
					<%if(Validator.isNotNull(documentNumber)){ %>
					<span class="uploaded-info-detail" id="document-number"><%=documentNumber %></span> 
					<%}%>
					<%if(Validator.isNotNull(issueDate)){ %>
					<span class="uploaded-info-detail" id="document-issue-date"><%=issueDate %> </span>
					<%}if(Validator.isNotNull(expiryDate)){ %> 
					<span class="uploaded-info-detail" id="document-expiry-date"> <%=expiryDate %></span>
					<%} %>
					<%-- <a class="uploaded-actionlink" href="javascript:;"  onclick="previewPharmaDocument('<%=fileEntryId%>')">
						<span class="mr-2"> 
							<svg width="18" height="18" viewBox="0 0 18 18" fill="none" xmlns="http://www.w3.org/2000/svg">
			               		<path d="M16 0H2C0.89 0 0 0.9 0 2V16C0 17.1 0.89 18 2 18H16C17.1 18 18 17.1 18 16V2C18 0.9 17.11 0 16 0ZM16 16H2V4H16V16ZM9 7.5C10.84 7.5 12.48 8.46 13.34 10C12.48 11.54 10.84 12.5 9 12.5C7.16 12.5 5.52 11.54 4.66 10C5.52 8.46 7.16 7.5 9 7.5ZM9 6C6.27 6 3.94 7.66 3 10C3.94 12.34 6.27 14 9 14C11.73 14 14.06 12.34 15 10C14.06 7.66 11.73 6 9 6ZM9 11.5C8.17 11.5 7.5 10.83 7.5 10C7.5 9.17 8.17 8.5 9 8.5C9.83 8.5 10.5 9.17 10.5 10C10.5 10.83 9.83 11.5 9 11.5Z" fill="#BA8207" />
			            	</svg>
						</span> 
						Preview
					</a> --%>
					<a class="uploaded-actionlink" href="<%=fileUrl %>" id="doc-download-btn" target="_blank"> 
						<span class="mr-2">
							<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg">
				            	 <path d="M11.59 6H10V1C10 0.45 9.55 0 9 0H5C4.45 0 4 0.45 4 1V6H2.41C1.52 6 1.07 7.08 1.7 7.71L6.29 12.3C6.68 12.69 7.31 12.69 7.7 12.3L12.29 7.71C12.92 7.08 12.48 6 11.59 6ZM0 16C0 16.55 0.45 17 1 17H13C13.55 17 14 16.55 14 16C14 15.45 13.55 15 13 15H1C0.45 15 0 15.45 0 16Z" fill="#BA8207" />
				             </svg> 
			             </span> Download
					</a> 
					<a class="uploaded-delete" href="javascript:;"  onclick="opendelNcraDocPopup('<%=fileEntryId%>','<%=counterOfDocuments%>')">
						<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
							xmlns="http://www.w3.org/2000/svg"> <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524" />
			            </svg>
					</a>
				</div>
			</div>
			<%}%>
		<div class="modal fade commonsavepopup" id="deletepopup<%=fileEntryId%>" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
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
                <a href="javascript:;" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard" onClick="deleteDocument('<%=fileEntryId%>');">
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
	</div>
</div>
<%counterOfDocuments++;	  
}%>
<% if(sizeOfNonRequiredDocsList>1){%>
<p class="supporting-document-subtitle">Optional Documents (that may attract an expiry date)</p>

<%

FileEntry fileEntryNR = null;
String fileUrlNR = "";
String fileSizeNR = "";
String previewUrlNR = "";
String expiryDateNR = "";
String issueDateNR = "";
String titleNR = "";
String fileNameNR = "";
long fileEntryIdNR = 0;
for(String documentNamesNR:notRequireddocumentNameArray){
	String isDocumentUploaded = "";
	fileEntryNR = null;
	fileUrlNR = "";
	fileSizeNR = "";
	previewUrlNR = "";
	expiryDateNR = "";
	issueDateNR = "";
	fileNameNR = "";
	fileEntryIdNR = 0;
	titleNR = "";
	String documentNumberNR = "";
	String isDocumentUploadedNR="";
	try {
		fileEntryNR = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentAndSubFolder.getFolderId(), documentNamesNR.trim());
		fileNameNR = fileEntryNR.getFileName();
		if (Validator.isNotNull(fileEntryNR)) {
			isDocumentUploadedNR = "disabled";
		}
		fileEntryIdNR = fileEntryNR.getFileEntryId();
		fileUrlNR = DLURLHelperUtil.getDownloadURL(fileEntryNR, fileEntryNR.getFileVersion(),
					themeDisplay, StringPool.BLANK, false, true);
		fileSizeNR = HtmlUtil.escape(
					LanguageUtil.formatStorageSize(fileEntryNR.getSize(), themeDisplay.getLocale()));
		previewUrlNR = DLURLHelperUtil.getPreviewURL(fileEntryNR, fileEntryNR.getFileVersion(),
					themeDisplay, StringPool.BLANK, false, true);
			if(Validator.isNotNull(fileEntryNR.getExpirationDate())){
				expiryDateNR = dateFormatDoc.format(fileEntryNR.getExpirationDate());
				}
				if(Validator.isNotNull(fileEntryNR.getLastPublishDate())){
					issueDateNR = dateFormatDoc.format(fileEntryNR.getLastPublishDate());
				}
			long classNameId = ClassNameLocalServiceUtil.getClassNameId(DLFileEntry.class.getName());
			ExpandoTable expandoTable = ExpandoTableLocalServiceUtil.getTable(themeDisplay.getCompanyId(),
					classNameId, ExpandoTableConstants.DEFAULT_TABLE_NAME);
			ExpandoColumn docNoExpandoColumn = ExpandoColumnLocalServiceUtil
					.getColumn(expandoTable.getTableId(), "Document Number");
			ExpandoValue expandoValue = ExpandoValueLocalServiceUtil.getValue(expandoTable.getTableId(),
					docNoExpandoColumn.getColumnId(), fileEntryNR.getFileEntryId());
			documentNumberNR = expandoValue.getData();
	} catch (Exception e) {
	}
%>	
<div id="notRequiredDoc">
	<div class="supporting-document-card mb-3">
		<div class="row">
			<div class="col-md-12">
				<div class="supporting-document-card-wrapper">
					<div class="left">
						<p class="supporting-document-card-upper-heading" id="notRequiredDoc<%=counterOfDocuments%>"><%=documentNamesNR%></p>
					</div>
					<div class="right text-nowrap">
						<a id="documentUpload<%=counterOfDocuments%>" class="custom-upload <%=isDocumentUploadedNR%>" href="javascript:;" onclick="openDocumentUploadPopup('<%=counterOfDocuments%>','<%=documentNamesNR%>')"> 
							<span class="mr-2">
								<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg">
		                       		<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247" />
		                       </svg> 
		                   </span> Upload
						</a>
					</div>
				</div>
			</div>
		</div>
		<div class="upload-progress progress hidden<%=counterOfDocuments%> hide" >
        	<div id="progress<%=counterOfDocuments%>" class="progress-bar h-100 upload-progress-bar" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0" ></div>
        </div>
		<div class="row">
			<div class="col-md-12" id="uploadedFormResult<%=counterOfDocuments%>">
			<%if(fileEntryNR!=null && fileEntryIdNR!=0){ %>
				<div class="uploaded-info" id="unpload-info-card<%=fileEntryIdNR%>">
				<div class="left">
					<p class="uploaded-info-title" id="document-name<%=counterOfDocuments%>"><%=fileNameNR %></p>
					<p class="uploaded-info-size" id="document-size<%=counterOfDocuments%>"><%=fileSizeNR %></p>
				</div>
				<div class="right">
					<%if(Validator.isNotNull(documentNumberNR)){ %>
					<span class="uploaded-info-detail" id="document-number"><%=documentNumberNR %></span> 
					<%}%>
					<%if(Validator.isNotNull(issueDateNR)){ %>
					<span class="uploaded-info-detail" id="document-issue-date"><%=issueDateNR %> </span>
					<%}if(Validator.isNotNull(expiryDateNR)){ %> 
					<span class="uploaded-info-detail" id="document-expiry-date"> <%=expiryDateNR %></span>
					<%} %>
					<%-- <a class="uploaded-actionlink" href="javascript:;"  onclick="previewPharmaDocument('<%=fileEntryId%>')">
						<span class="mr-2"> 
							<svg width="18" height="18" viewBox="0 0 18 18" fill="none" xmlns="http://www.w3.org/2000/svg">
			               		<path d="M16 0H2C0.89 0 0 0.9 0 2V16C0 17.1 0.89 18 2 18H16C17.1 18 18 17.1 18 16V2C18 0.9 17.11 0 16 0ZM16 16H2V4H16V16ZM9 7.5C10.84 7.5 12.48 8.46 13.34 10C12.48 11.54 10.84 12.5 9 12.5C7.16 12.5 5.52 11.54 4.66 10C5.52 8.46 7.16 7.5 9 7.5ZM9 6C6.27 6 3.94 7.66 3 10C3.94 12.34 6.27 14 9 14C11.73 14 14.06 12.34 15 10C14.06 7.66 11.73 6 9 6ZM9 11.5C8.17 11.5 7.5 10.83 7.5 10C7.5 9.17 8.17 8.5 9 8.5C9.83 8.5 10.5 9.17 10.5 10C10.5 10.83 9.83 11.5 9 11.5Z" fill="#BA8207" />
			            	</svg>
						</span> 
						Preview
					</a> --%>
					<a class="uploaded-actionlink" href="<%=fileUrlNR %>" id="doc-download-btn" target="_blank"> 
						<span class="mr-2">
							<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg">
				            	 <path d="M11.59 6H10V1C10 0.45 9.55 0 9 0H5C4.45 0 4 0.45 4 1V6H2.41C1.52 6 1.07 7.08 1.7 7.71L6.29 12.3C6.68 12.69 7.31 12.69 7.7 12.3L12.29 7.71C12.92 7.08 12.48 6 11.59 6ZM0 16C0 16.55 0.45 17 1 17H13C13.55 17 14 16.55 14 16C14 15.45 13.55 15 13 15H1C0.45 15 0 15.45 0 16Z" fill="#BA8207" />
				             </svg> 
			             </span> Download
					</a> 
					<a class="uploaded-delete" href="javascript:;"  onclick="opendelNcraDocPopup('<%=fileEntryIdNR%>','<%=counterOfDocuments%>')">
						<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
							xmlns="http://www.w3.org/2000/svg"> <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524" />
			            </svg>
					</a>
				</div>
			</div>
			<%}%>
		<div class="modal fade commonsavepopup" id="deletepopup<%=fileEntryIdNR%>" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
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
                <a href="javascript:;" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard" onClick="deleteDocument('<%=fileEntryIdNR%>');">
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
	</div>
</div>
<% counterOfDocuments++;
}
}%>
<input type="hidden" id="requiredCounter"  name="requiredCounter" value="<%=sizeOfRequiredDocsList %>">
<input type="hidden" id="notRequiredCounter"  name="notRequiredCounter" value="<%=sizeOfNonRequiredDocsList %>">