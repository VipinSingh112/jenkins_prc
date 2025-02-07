 <div class="uploaded-info generic-doc" id="unpload-info-card<%=uploadedFile.getFileEntryId()%>">
	<div class="left">
		<p class="uploaded-info-title" id="document-name"><%=uploadedFile.getFileName() %></p>
		<p class="uploaded-info-size" id="document-size"><%=uploadedFile.getSize() %></p>
	</div>
	<div class="right">
		<a class="uploaded-actionlink" href="<%=fileUrlInJannaac%>" id="doc-download-btn" target="_blank"> 
			<span class="mr-2">
				<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg">
	            	 <path d="M11.59 6H10V1C10 0.45 9.55 0 9 0H5C4.45 0 4 0.45 4 1V6H2.41C1.52 6 1.07 7.08 1.7 7.71L6.29 12.3C6.68 12.69 7.31 12.69 7.7 12.3L12.29 7.71C12.92 7.08 12.48 6 11.59 6ZM0 16C0 16.55 0.45 17 1 17H13C13.55 17 14 16.55 14 16C14 15.45 13.55 15 13 15H1C0.45 15 0 15.45 0 16Z" fill="#BA8207" />
	             </svg> 
             </span> Download
		</a> 
		<a class="uploaded-delete" href="javascript:;"  onclick="opendelDocPopup('<%=uploadedFile.getFileEntryId()%>','<%=genericJanaacCounter%>')">
			<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
				xmlns="http://www.w3.org/2000/svg"> <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#282524" />
            </svg>
		</a>
	</div>
</div>
<div class="modal fade commonsavepopup" id="janaacDeletepopup<%=uploadedFile.getFileEntryId()%>" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
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
                <a href="javascript:;" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard" onClick="janaacDeleteDocumentForGeneric('<%=uploadedFile.getFileEntryId()%>');">
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