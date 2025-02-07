<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<%@ include file="../init.jsp" %>
<%
//String fileUrl = StringPool.BLANK;
String fileSize = StringPool.BLANK;
String previewUrl = StringPool.BLANK;
long fileEntryId =0;
String issueDate = StringPool.BLANK;
String expiryDate = StringPool.BLANK;
String documentNumber = StringPool.BLANK;
String fileName = StringPool.BLANK;
String documentuploadCounter = StringPool.BLANK;
if(Validator.isNotNull(request.getAttribute("fileUrl"))){
	fileUrl  =(String)request.getAttribute("fileUrl");
}
if(Validator.isNotNull(request.getAttribute("fileSize"))){
	fileSize  =(String)request.getAttribute("fileSize");
}
if(Validator.isNotNull(request.getAttribute("previewUrl"))){
	previewUrl  =(String)request.getAttribute("previewUrl");
}
if(Validator.isNotNull(request.getAttribute("issueDate"))){
	issueDate  =(String)request.getAttribute("issueDate");
}
if(Validator.isNotNull(request.getAttribute("expiryDate"))){
	expiryDate  =(String)request.getAttribute("expiryDate");
}
if(Validator.isNotNull(request.getAttribute("documentNumber"))){
	documentNumber  =(String)request.getAttribute("documentNumber");
}
if(Validator.isNotNull(request.getAttribute("fileName"))){
	fileName  =(String)request.getAttribute("fileName");
}
if(Validator.isNotNull(request.getAttribute("fileEntryId"))){
	fileEntryId  =(long)request.getAttribute("fileEntryId");
}
if(Validator.isNotNull(request.getAttribute("documentuploadCounter"))){
	documentuploadCounter  =(String)request.getAttribute("documentuploadCounter");
}
%>

<div class="uploaded-info" id="unpload-info-card<%=fileEntryId%>">
	<div class="left">
		<p class="uploaded-info-title" id="document-name<%=documentuploadCounter%>"><%=fileName %></p>
		<p class="uploaded-info-size" id="document-size"><%=fileSize %></p>
	</div>
	<div class="right">
		<span class="uploaded-info-detail" id="document-number"> <%= "N " +documentNumber %></span> 
		<span class="uploaded-info-detail" id="document-issue-date"><%=issueDate %> </span> 
		<span class="uploaded-info-detail" id="document-expiry-date"> <%=expiryDate %></span>
		<%-- <a class="uploaded-actionlink" href="javascript:;"  onclick="previewDocument('<%=fileEntryId%>')">
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
		<a class="uploaded-delete" href="javascript:;"  onclick="opendelDocPopup('<%=fileEntryId%>', '<%=documentuploadCounter%>')">
			<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
				xmlns="http://www.w3.org/2000/svg"> <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524" />
            </svg>
		</a>
	</div>
</div>

<div class="modal fade commonsavepopup" id="previewDocumentPop<%=fileEntryId%>" data-keyboard="false" tabindex="-1"
    aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
    <div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
        <div class="modal-content">
          <%--  <iframe src="<%=previewUrl %>" title="preview Document" height="550" width="100%"></iframe> --%>
        </div>
    </div>
</div>

<div class="modal fade commonsavepopup" id="deletepopup<%=fileEntryId%>" data-keyboard="false" tabindex="-1"
    aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
    <div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
        <div class="modal-content">
      		<div class="modal-pic">
                <img src="<%=themeDisplay.getPathThemeImages()%>/failed-popup" class="img-fluid" />
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
<input type="text" hidden id="fileUrl<%=documentuploadCounter%>" value="<%=fileUrl %>">