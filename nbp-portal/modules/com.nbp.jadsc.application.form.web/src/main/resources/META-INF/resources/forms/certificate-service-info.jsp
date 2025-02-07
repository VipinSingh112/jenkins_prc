<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<%
int docServedAddressVal=1;
%>
<div class="tab-pane confidential-ver-forms" role="tabpanel" id="childStep3">
    <div class="tab-form">
        <div class="service-certificate-details-forms">
            <div class="row">
                <div class="col-md-12">
                    <p class="tab-form-title f2">Certificate of Service</p>
                    <p class="tab-form-title-subtitle f2 mb-1">Please Read the Forms Carefully and upload all required supporting documentation.
                    </p>
                    <p class="tab-form-sub-heading">(<span class="tab-form-highlghtme-link">Note:</span> This certificate should be reproduced and signed on your company's letter)</p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Date</p>
                        <input type="date" class="form-control" id="docSubmitDate" value="<%=certificateService!=null&&certificateService.getDocSubmitDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(certificateService.getDocSubmitDate()):StringPool.BLANK %>" placeholder="" />
                    </div>
                </div>
                <div class="col-md-12"> 
                    <div class="form-group"> 
                    <p class="tab-form-main-heading">This is to certify that, on <span class="doc-submit-date"></span>, I served a copy of the enclosed document upon the following parties via hand/courier delivery at the following addresses.</p>
                    </div> 
                </div>

                <div class="col-md-12">
                <input id="docServedAddressVal" type="hidden" name="docServedAddressVal" value="1">
                    <div class="">
                        <div class="accordion secured-accordian"
                            id="docServedAddressDetailBox">
                            <div class="accordion__header is-active"
                                id="docServedAddressDetail" onclick="expandDetails(this.id)">
                                <div class="d-flex align-items-center">
                                    <div class="d-flex align-items-center">
                                        <div>
                                            <span class="accordion__toggle"></span>
                                        </div>
                                        <div>
                                            <h2>Address</h2>
                                        </div>
                                    </div>
                                </div>
                                <div>
                                    <p class="accordian-employee mb-0 common-para"></p>
                                </div>
                            </div>
                            <div class="accordion__body is-active">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <p class="tab-form-main-heading">Name</p>
                                            <input type="text" class="form-control"
                                                id="docServeName" value="" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <p class="tab-form-main-heading">Company</p>
                                            <input type="text" class="form-control"
                                                id="docServeCom" value="" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <p class="tab-form-main-heading">Address</p>
                                            <textarea rows="3" class="mt-3 form-control" maxlength="255" id="docServeAddress" placeholder="" style="border-radius: 5px; width: 100%"></textarea>
                                            <p class="tab-form-sub-heading">(please replicate the names and addresses as many times as applicable)</p>
                                        </div>
                                    </div>

                                    <div class="col-md-12 d-flex justify-content-end py-4">
                                        <a href="javascript:void(0);" class="add-more-employee" id="addDocServedAddressDetail" onclick="addDocServedAddressDetail();"> 
                                            <span>+ 1</span>
                                            Add More
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 table-responsive hide addDocServedAddressDetailTableBox">
                        <table class="table table-bordered mb-3">
                            <tbody class="addDocServedAddressDetailTable">
                                <tr>
                                    <th class="sub_heading text-nowrap">Name</th>
                                    <th class="sub_heading text-nowrap">Company</th>
                                    <th class="sub_heading text-nowrap">Address</th>
                                    <th class="sub_heading">Edit</th>
                                    <th class="sub_heading">Delete</th>
                                </tr>
    <%if(Validator.isNotNull(certiOfServiceAdd)&&certiOfServiceAdd.size()>0){
		for(JADSCCertificateOfServiceAddForm applicantDetails:certiOfServiceAdd){ %>
    <tr class="doc-served-address-row<%=docServedAddressVal%>">
	<td class="sub_heading_content docServeName<%=docServedAddressVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getDocServeName())?applicantDetails.getDocServeName():""%></td>
	<td class="sub_heading_content docServeCom<%=docServedAddressVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getDocServeCom())?applicantDetails.getDocServeCom():""%></td>
	<td class="sub_heading_content docServeAddress<%=docServedAddressVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getDocServeAddress())?applicantDetails.getDocServeAddress():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="docServedAddressEditTab" onclick="docServedAddressEditTab('<%=docServedAddressVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="docServedAddressDeleteDataTab" onclick="docServedAddressDeleteData('<%=docServedAddressVal%>'); deleteApplicantInfo('<%=applicantDetails.getJadscCOSId()%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
     <input type="hidden" id="docServedAddress<%=docServedAddressVal%>" name="docServedAddress<%=docServedAddressVal%>" value="<%=applicantDetails.getJadscCOSId()%>">
</tr>
 <%docServedAddressVal=docServedAddressVal+1;
	}} %>	
                            </tbody>
                        </table>
                    </div>
                </div>
                
                <div class="col-md-12">
                    <div class="form-group">
                        <p class="pt-2 common-para">Signed</p>
                        <div class="signature_texarea mb-2" id="signedImageHolder">
                        <%if(Validator.isNotNull(serviceDoc)){ %>
							<img src="<%=serviceDoc%>"  width="100" height="100"/>
							<%} %>
                        </div>
                        <input type="file" id="signedBtn" hidden="" name="<portlet:namespace/>signedBtn">
                        <label for="signedBtn" class="choose-sign-btn">
                            <span class="mr-2"> <svg width="14" height="17"
                                    viewBox="0 0 14 17" fill="none"
                                    xmlns="http://www.w3.org/2000/svg"> 
                                    <path
                                        d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                        fill="#ffffff"></path> 
                                </svg>
                        </span> Upload Signature
                        </label>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Name of Signatory *</p>
                        <input type="text" class="form-control" id="signatoryName" value="<%=certificateService!=null?certificateService.getSignatoryName():StringPool.BLANK %>" placeholder="" />
                        <p class="tab-form-sub-heading fieldAlert hide" id="signatoryNameValidation" style="color: red;">
                            Please Enter Signatory Name</p>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Date</p>
                        <input type="date" class="form-control" id="signatoryDate" value="<%=certificateService!=null&&certificateService.getSignatoryDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(certificateService.getSignatoryDate()):StringPool.BLANK %>" placeholder="" />
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Telephone No. of Signatory</p>
                        <input type="text" class="form-control" id="signatoryTelephone" value="<%=certificateService!=null?certificateService.getSignatoryTelephone():StringPool.BLANK %>" placeholder="" oninput="formatPhoneNumber(this);"/>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Fax No. of Signatory</p>
                        <input type="text" class="form-control" id="signatoryFax" value="<%=certificateService!=null?certificateService.getSignatoryFax():StringPool.BLANK %>" placeholder="" 
                        oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <button type="button" id="saveName" onclick="setCertificationOfServiceInfo(false);"
      class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
      Continue to the next form section <span class="ml-2"> <svg
              width="18" height="14" viewBox="0 0 18 14" fill="none"
              xmlns="http://www.w3.org/2000/svg"> 
                          <pathd ="m6.00016 11.17l1.83016=""
                  6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
                  1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
                         </svg>
      </span>
  </button>
</div>