<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<section id="jadscPreviewStep5" class="final-preview-section appearance-notice-form hide confidential-ver-forms">
    <div class="appearance-notice-preview-content">
        <div class="row">
            <div class="col-12">
                <div class="d-flex justify-content-start">
                    <p class="heading2 mt-2">Notice of Appearance</p>
                    <span class="ml-3"> 
                            <a href="javascript:void(0)" id="appearance-notice-edit-tab">
                            <svg width="19" height="19"
                            viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <path
                                d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
                                fill="#047247" />
                            </svg>
                            </a>
                    </span>
                </div>
            </div>
            <div class="col-md-12">
                <p class="sub_heading mb-3"><span class="tab-form-highlghtme-link">IN THE MATTER OF</span></p> 
                <p class="sub_heading mb-1"><span class="tab-form-highlghtme-link">The Executive Director
                </span></p> 
                <p class="sub_heading mb-1"><span class="tab-form-highlghtme-link">Anti-Dumping & Subsidies Commission</span></p>
                <p class="sub_heading"><span class="tab-form-highlghtme-link">The Roswind, 25 Windsor Avenue Kingston 5</span></p>
                <p class="sub_heading">Notice is hereby given that the undersigned appears as Counsel/Representative for <span class="appearance-notice-full-name"></span> a party before the Commission in the above matter.
                </p>
                <p class="sub_heading">
                The undersigned's address for service is <span class="appearance-notice-address-one"></span> Dated at <span class="appearance-notice-date"></span>.
                </p>
                <p class="pt-2 common-para">Signature</p>
                      <%
						if (Validator.isNotNull(noticeSignDoc)) {
					%>
                <div class="signature_texarea mb-2" id="appearanceNoticeSignatureImageHolderPre">
                        <img src="<%=noticeSignDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
                </div>
                 <%
						} else {
					%>
					<div class="signature_texarea mb-2" id="appearanceNoticeSignatureImageHolderPre"></div>
					<%
						}
					%>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Name</p>
                    <p class="sub_heading_content" id="appearanceNoticeNamePreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Firm</p>
                    <p class="sub_heading_content" id="appearanceNoticeFirmPreview"></p>
                </div>
            </div>
            <div class="col-12">
                <div>
                    <p class="sub_heading">Address</p>
                    <p class="sub_heading_content" id="appearanceNoticeAddressPreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Telephone No.</p>
                    <p class="sub_heading_content" id="appearanceNoticeTelephonePreview"></p>
                </div>
            </div>
        </div>
    </div>
</section>

<section id="jadscPreviewStep6" class="final-preview-section">
    <div class="checklist-details-preview-content">
        <div class="row">
            <div class="col-12">
                <div class="d-flex justify-content-start">
                    <p class="heading2 mt-2">Checklist</p>
                    <span class="ml-3"> 
                            <a href="javascript:void(0)" id="checklist-details-edit-tab">
                            <svg width="19" height="19"
                            viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <path
                                d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
                                fill="#047247" />
                            </svg>
                            </a>
                    </span>
                </div>
            </div>
            <div class="col-12">
                <div>
                    <p class="sub_heading">The Commission considers a complaint to be properly documented if it includes the following information, where it is available:</p>
                    <p class="sub_heading_content" id="informationRegComplaintPreview"></p>
                </div>
            </div>
            <div class="col-12 table-responsive">
                 <table class="table table-bordered mb-3">
                     <tbody class="addChecklistDetailTable">
                         <tr>
                             <th class="sub_heading text-nowrap">Item</th>
                         </tr>	
                          <%if(jadscChecklistadd!=null){
                               long jadscChecklistaddCounter=1;
                               for(JADSCChecklistAdd jadscCheck:jadscChecklistadd){
                       %>      <tr>
                               <td class="sub_heading_content jadscChecklistItem<%=jadscChecklistaddCounter%>">
                               <%=Validator.isNotNull(jadscCheck)&&Validator.isNotNull(jadscCheck.getAddItem())?jadscCheck.getAddItem():""%>
                               </td>
                       </tr>
                       <input type="hidden" id="jadsc-checklist-add-id<%=jadscChecklistaddCounter%>"  name="jadsc-checklist-add-id<%=jadscChecklistaddCounter%>" value="<%=jadscCheck.getJADSCChecklistAddId()%>">
                                                                               <%
                                               jadscChecklistaddCounter=jadscChecklistaddCounter+1;
                                                                               }
                        }
                                                                       %>             
                         
                     </tbody>
                 </table>
             </div>
        </div>
    </div>
</section>

<section class="final-preview-section supporting-doc-preview" id="jadscPreviewStep7">
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
			</div>
		</div>
	</div>
</section>