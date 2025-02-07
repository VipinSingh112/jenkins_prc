<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<section id="jadscPreviewStep3" class="final-preview-section confidential-ver-forms">
    <div class="service-certificate-preview-content">
        <div class="row">
            <div class="col-12">
                <div class="d-flex justify-content-start">
                    <p class="heading2 mt-2">Certificate of Service Form</p>
                    <span class="ml-3"> 
                            <a href="javascript:void(0)" id="service-certificate-edit-tab">
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
                <p class="sub_heading">This is to certify that, on <span class="doc-submit-date"></span>, I served a copy of the enclosed document upon the following parties via hand/courier delivery at the following addresses.</p>
            </div>
            <div class="col-12">
                <div>
                    <p class="sub_heading">Address</p>
                </div>
            </div>
            <div class="col-12 table-responsive">
                <table class="table table-bordered mb-3">
                    <tbody class="addDocServedAddressDetailTable">
                        <tr>
                            <th class="sub_heading">Name</th>
                            <th class="sub_heading">Company</th>
                            <th class="sub_heading">Address</th>
                        </tr>
                         <%if(Validator.isNotNull(certiOfServiceAdd)&&certiOfServiceAdd.size()>0){
                       int docServedAddressVal=1;
               for(JADSCCertificateOfServiceAddForm applicantDetails:certiOfServiceAdd){ %>
<tr class="doc-served-address-row<%=docServedAddressVal%>">
       <td class="sub_heading_content docServeName<%=docServedAddressVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getDocServeName())?applicantDetails.getDocServeName():""%></td>
       <td class="sub_heading_content docServeCom<%=docServedAddressVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getDocServeCom())?applicantDetails.getDocServeCom():""%></td>
       <td class="sub_heading_content docServeAddress<%=docServedAddressVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getDocServeAddress())?applicantDetails.getDocServeAddress():""%></td>
</tr>
<input type="hidden" id="docServedAddress<%=docServedAddressVal%>" name="docServedAddress<%=docServedAddressVal%>" value="<%=applicantDetails.getJadscCOSId()%>">
 <%docServedAddressVal=docServedAddressVal+1;
}} %>
                        
                    </tbody>
                </table>
            </div>
            <div class="col-12">
                <div>
                    <p class="pt-2 common-para">Signed</p>
                         <%
						if (Validator.isNotNull(serviceDoc)) {
					%>
                    <div class="signature_texarea mb-2" id="signedImageHolderPre">
                       <img src="<%=serviceDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
                    </div>
                          <%
						} else {
					%>
					<div class="signature_texarea mb-2" id="signedImageHolderPre">
					</div>
					<%
						}
					%>	
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Name of Signatory</p>
                    <p class="sub_heading_content" id="signatoryNamePreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Date</p>
                    <p class="sub_heading_content" id="signatoryDatePreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Telephone No. of Signatory</p>
                    <p class="sub_heading_content" id="signatoryTelephonePreview"></p>
                </div>
            </div>
            <div class="col-6">
                <div>
                    <p class="sub_heading">Fax No. of Signatory</p>
                    <p class="sub_heading_content" id="signatoryFaxPreview"></p>
                </div>
            </div>
        </div>
    </div>
</section>