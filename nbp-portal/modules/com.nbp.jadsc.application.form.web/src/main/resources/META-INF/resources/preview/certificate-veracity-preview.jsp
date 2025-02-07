<%@ include file="/init.jsp" %>
<section id="jadscPreviewStep4" class="final-preview-section confidential-ver-forms">
    <div class="veracity-certificate-preview-content">
        <div class="row">
            <div class="col-12">
                <div class="d-flex justify-content-start">
                    <p class="heading2 mt-2">Certificate of Veracity Form</p>
                    <span class="ml-3"> 
                            <a href="javascript:void(0)" id="veracity-certificate-edit-tab">
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
                <p class="sub_heading">
                    I, <span class="veracity-com-name"></span>, <span class="veracity-com-position"></span> of <span class="veracity-com-company"></span> certify that the information submitted to the Commission is response to the application of (Date) is TRUE, ACCURATE and COMPLETE, and understand that the information submitted is subject to audit and verification by the Commission.
                </p>
                <p class="pt-2 common-para">Signed</p>
                 <%
						if (Validator.isNotNull(cerVeracityDoc)) {
					%>
                <div class="signature_texarea mb-2" id="veracitySignedImageHolderPre">
                 <img src="<%=cerVeracityDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
                
                </div>
                  <%
						} else {
					%>
                <div class="signature_texarea mb-2" id="veracitySignedImageHolderPre"></div>
                <%
						}
					%>	
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Date</p>
                    <p class="sub_heading_content" id="veracitySignedDatePreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Telephone No. of Signatory</p>
                    <p class="sub_heading_content" id="veracitySignedTelephonePreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Fax No. of Signatory</p>
                    <p class="sub_heading_content" id="veracitySignedFaxPreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Address of Signatory</p>
                    <p class="sub_heading_content" id="veracitySignedAddressPreview"></p>
                </div>
            </div>
            <div class="col-12">
                <div>
                    <p class="pt-2 common-para">Justice of the Peace</p>
                     <%
						if (Validator.isNotNull(justiceVeracityDoc)) {
					%>
                    <div class="signature_texarea mb-2" id="veracityPeaceJusticeImageHolderPre">
                    <img src="<%=justiceVeracityDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
                    </div>
                     <%
						} else {
					%>
					<div class="signature_texarea mb-2" id="veracityPeaceJusticeImageHolderPre"></div>
					<%
						}
					%>	
                </div>
            </div>
        </div>
    </div>
</section>