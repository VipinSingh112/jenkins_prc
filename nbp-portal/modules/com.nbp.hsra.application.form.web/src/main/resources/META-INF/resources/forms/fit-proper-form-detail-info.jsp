<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@ include file="../init.jsp" %>
<%
String fileURL="";
DLFolder supportingDocumentsParentFolder =null;
DLFolder supportingDocumentsFolder =null;
List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
	try{
		supportingDocumentsParentFolder= DLFolderLocalServiceUtil.getFolder(
				themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
				"HSRA Supporting Documents");
		supportingDocumentsFolder	= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolder.getFolderId(),
				"Fit And Proper");
		supportinfDocFileEntries = DLFileEntryLocalServiceUtil
				.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
       }catch(Exception e){
	   }
	
	for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
		FileEntry fileEntry = null;
		fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
		fileURL = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
				StringPool.BLANK, false, true);
	}


%>
		<div class="tab-pane  fit-proper-declaration-forms" role="tabpanel" id="childStep14">
			<div class="tab-form">
				<div class=" -details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Fit and Proper Declaration Form</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Please download and fill out Fit and Proper Declaration Form 
							and upload in the Supporting Documents Section
							</p>
						</div>
						<div class="col-md-12 cannabis-licence-process-content">
							<a class="bordered-link f2" href="<%=fileURL%>" 
							target="_blank">
								Fit and Proper Declaration Form
								<span class="ml-2"> 
									<svg width="15" height="15" viewBox="0 0 15 15" fill="none" xmlns="http://www.w3.org/2000/svg"> 
                   						<path d="M5 0V2H11.59L0 13.59L1.41 15L13 3.41V10H15V0H5Z" fill="#047247"></path> 
                  					</svg>
								</span>
							</a>
						</div>
					</div>
					
				</div>
			</div>
			<!-- <button type="button" id="saveName"
				onclick="applicantInfo();addFitProperDetail();"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
			                        <pathd ="m6.00016 11.17l1.83016=""
							6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
							1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
			                       </svg>
				</span>
			</button> -->
		</div>
		