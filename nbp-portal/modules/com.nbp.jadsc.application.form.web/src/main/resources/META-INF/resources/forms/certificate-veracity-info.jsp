<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
<div class="tab-pane confidential-ver-forms" role="tabpanel" id="childStep4">
    <div class="tab-form">
        <div class="veracity-certificate-details-forms">
            <div class="row">
                <div class="col-md-12">
                    <p class="tab-form-title f2">Certificate of Veracity, Accuracy and Completeness</p>
                    <p class="tab-form-title-subtitle f2 mb-1">Please Read the Forms Carefully and upload all required supporting documentation.
                    </p>
                    <p class="tab-form-sub-heading">[<span class="tab-form-highlghtme-link">Note:</span> This certificate should be reproduced and signed on your company's letterhead]</p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group"> 
                        <p class="tab-form-main-heading">Name *</p>
                        <input type="text" class="form-control"
                            id="veracityComName" value="<%=ceritifiVeracity!=null?ceritifiVeracity.getVeracityComName():StringPool.BLANK %>" placeholder="">
                            <p class="tab-form-sub-heading fieldAlert hide" id="veracityComNameValidation" style="color: red;">
                                Please Enter Name</p>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Position</p>
                        <input type="text" class="form-control"
                            id="veracityComPosition" value="<%=ceritifiVeracity!=null?ceritifiVeracity.getVeracityComPosition():StringPool.BLANK %>" placeholder="">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Company</p>
                        <input type="text" class="form-control"
                            id="veracityComCompany" value="<%=ceritifiVeracity!=null?ceritifiVeracity.getVeracityComCompany():StringPool.BLANK %>" placeholder="">
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <p class="tab-form-main-heading">
                            I, <span class="veracity-com-name giluio"></span>, <span class="veracity-com-position giluio"></span> of <span class="veracity-com-company giluio"></span> certify that the information submitted to the Commission is response to the application of (Date) is TRUE, ACCURATE and COMPLETE, and understand that the information submitted is subject to audit and verification by the Commission.
                        </p>
                        <p class="pt-2 common-para">Signed</p>
                        <div class="signature_texarea mb-2" id="veracitySignedImageHolder">
                        <%if(Validator.isNotNull(cerVeracityDoc)){ %>
							<img src="<%=cerVeracityDoc%>"  width="100" height="100"/>
							<%} %>
                        </div>
                        <input type="file" id="veracitySignedBtn" hidden="" name="<portlet:namespace/>veracitySignedBtn">
                        <label for="veracitySignedBtn" class="choose-sign-btn">
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
                        <p class="tab-form-main-heading">Date</p>
                        <input type="date" class="form-control" id="veracitySignedDate" value="<%=ceritifiVeracity!=null&&ceritifiVeracity.getVeracitySignedDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(ceritifiVeracity.getVeracitySignedDate()):StringPool.BLANK %>" placeholder="" />
                    </div>
                </div>                
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Telephone No. of Signatory</p>
                        <input type="text" class="form-control" id="veracitySignedTelephone" value="<%=ceritifiVeracity!=null?ceritifiVeracity.getVeracitySignedTelephone():StringPool.BLANK %>" placeholder="" oninput="formatPhoneNumber(this);"/>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Fax No. of Signatory</p>
                        <input type="text" class="form-control" id="veracitySignedFax" value="<%=ceritifiVeracity!=null?ceritifiVeracity.getVeracitySignedFax():StringPool.BLANK %>" placeholder="" 
                        oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
                    </div>
                </div>
                <div class="col-md-12"> 
                    <div class="form-group"> 
                        <p class="tab-form-main-heading">Address of Signatory</p>
                        <textarea rows="3" class="mt-3 form-control" maxlength="255" id="veracitySignedAddress" placeholder="" style="border-radius: 5px; width: 100%"><%=ceritifiVeracity!=null?ceritifiVeracity.getVeracitySignedAddress():StringPool.BLANK %></textarea>
                    </div> 
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <p class="tab-form-main-heading mb-0">
                            Witnessed by
                        </p>
                        <p class="pt-2 common-para">Justice of the Peace</p>
                        <div class="signature_texarea mb-2" id="veracityPeaceJusticeImageHolder">
                        <%if(Validator.isNotNull(justiceVeracityDoc)){ %>
							<img src="<%=justiceVeracityDoc%>"  width="100" height="100"/>
							<%} %>
                        </div>
                        <input type="file" id="veracityPeaceJusticeBtn" hidden="" name="<portlet:namespace/>veracityPeaceJusticeBtn">
                        <label for="veracityPeaceJusticeBtn" class="choose-sign-btn">
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
            </div>
        </div>
    </div>
    <button type="button" id="saveName" onclick="setCertificationOfVeracityFormInfo(false);"
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