<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="init.jsp" %>

<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>

<%


String fileUrl = StringPool.BLANK;
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

<%-- <div class="uploaded-info" id="unpload-info-card<%=fileEntryId%>"> --%>
	<div class="left">
		<p class="uploaded-info-title" id="document-name"><%=fileName %></p>
		<p class="uploaded-info-size" id="document-size"><%=fileSize %></p>
	</div>
	<div class="right">
		<span class="uploaded-info-detail" id="document-number"> <%=documentNumber %></span> 
		<span class="uploaded-info-detail" id="document-issue-date">Issued on <%=issueDate %> </span> 
		<span class="uploaded-info-detail" id="document-expiry-date">Expired on <%=expiryDate %></span>
		<a class="uploaded-actionlink" href="<%=fileUrl %>" id="doc-download-btn" target="_blank"> 
			<span class="mr-2">
				<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg">
	            	 <path d="M11.59 6H10V1C10 0.45 9.55 0 9 0H5C4.45 0 4 0.45 4 1V6H2.41C1.52 6 1.07 7.08 1.7 7.71L6.29 12.3C6.68 12.69 7.31 12.69 7.7 12.3L12.29 7.71C12.92 7.08 12.48 6 11.59 6ZM0 16C0 16.55 0.45 17 1 17H13C13.55 17 14 16.55 14 16C14 15.45 13.55 15 13 15H1C0.45 15 0 15.45 0 16Z" fill="#BA8207" />
	             </svg> 
             </span> Download
		</a> 
	</div>
<!-- </div> -->