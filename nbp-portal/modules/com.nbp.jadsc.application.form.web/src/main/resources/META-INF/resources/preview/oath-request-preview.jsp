<%@ include file="/init.jsp" %>
<section id="jadscPreviewStep2" class="final-preview-section confidential-ver-forms">
    <div class="oath-request-preview-content">
        <div class="row">
            <div class="col-12">
                <div class="d-flex justify-content-start">
                    <p class="heading2 mt-2">Oath for Request Form</p>
                    <span class="ml-3"> 
                            <a href="javascript:void(0)" id="oath-request-edit-tab">
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
                    <p class="sub_heading mb-1"><span class="tab-form-highlghtme-link">Executive Director</span></p> 
                    <p class="sub_heading mb-1"><span class="tab-form-highlghtme-link">Anti Dumping & Subsidies Commission 24 Trafalgar Road
                    </span></p> 
                    <p class="sub_heading mb-1"><span class="tab-form-highlghtme-link">Kingston 10</span></p>
                    <p class="sub_heading"><span class="tab-form-highlghtme-link">Dear Executive Director:
                    </span></p>
                    <p class="sub_heading">Pursuant to Sections 8 and 9 of the Customs Duties (Dumping & Subsidies) Act, 1999, this is a request for confidential treatment of information being submitted to you in investigation <span class="investigation-type"></span>. The nature of the information for which confidential treatment is requested relates to the designations set out in the exhibit summary attached hereto.
                    </p>
                    <p class="sub_heading">
                        The disclosure of this information would cause substantial harm to <span class="party-name"></span> because	<span class="request-reason"></span>.
                    </p>
                    <p class="sub_heading">
                        Moreover, if the material were not granted confidential treatment by the Anti-dumping and Subsidies Commission, 	<span class="party-name"></span> would not voluntarily submit the information.
                    </p>
                    <p class="sub_heading">
                        I, <span class="company-official"></span>, having been duly sworn on this day of, do hereby certify that information substantially identical to that contained in the attached document is not available to the general public.
                    </p>
                </div>
            </div>
                    <div class="col-12">
                <div>
                    <p class="sub_heading">
                        I further certify (1) that I have read the attached submission, and (2) that to the best of my knowledge and belief, the statements contained in the enclosed submission are true and accurate.
                    </p>
                    <p class="pt-2 common-para">Submitter's Signature</p>
                    <%
						if (Validator.isNotNull(formNameDoc)) {
					%>
                    <div class="signature_texarea mb-2"
                    id="submitterSignatureImageHolderPre">
                    	<img src="<%=formNameDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
						<%
						} else {
					%>
                     <div class="signature_texarea mb-2"  id="submitterSignatureImageHolderPre">
                    </div>
					<%
						}
					%>		
                </div>
            </div>
           <div class="col-12">
                <div>
                    <p class="sub_heading">
                        Sworn and subscribed before me this day of <span class="signature-date"></span>.
                    </p>
                    <p class="pt-2 common-para">Justice of the Peace</p>
                    <%
						if (Validator.isNotNull(oathJusticeDoc)) {
					%>
                    <div class="signature_texarea mb-2" id="justicePeaceImageHolderPre">
                    <img src="<%=oathJusticeDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
                    </div>
                    <%
						} else {
					%>
					<div class="signature_texarea mb-2" id="justicePeaceImageHolderPre">
					</div>
					<%
						}
					%>	
                </div>
            </div>
        </div>
        <hr />
    </div>
</section>