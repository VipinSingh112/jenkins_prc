<div class="tab-pane iso22000CertificationForm hide active" role="tabpanel" id="">
    <div class="tab-form"> 
        <div class="row">
            <div class="col-md-12">
                <p class="tab-form-title f2">COMPANY DETAILS</p>
                <p class="tab-form-title-subtitle f2">In this section you will provide general information about the
                    Applicant</p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">COMPANY DETAILS</p>
                    <input type="text" class="form-control" id="applicantTelephone" placeholder=""
                        oninput="formatPhoneNumber(this);" value="" />
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">Company Name or Head Office</p>
                    <input type="text" class="form-control" id="applicantTelephone" placeholder=""
                        oninput="formatPhoneNumber(this);" value="" />
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">Company Address: </p>
                    <input type="text" class="form-control" id="applicantTelephone" placeholder=""
                        oninput="formatPhoneNumber(this);" value="" /><textarea rows="3" id="applicantAddress"
                        class="form-control" maxlength="255" placeholder="Enter Address"
                        style="border-radius: 5px; width: 100%"></textarea>
                </div>
            </div>

        </div>
        <div class="row">
            <input id="applicantDetailVal" type="hidden" name="applicantDetailVal" value="1">

            <div class="col-md-12">
                <div class="accordion secured-accordian" id="applicantDetailBox">
                    <div class="accordion__header is-active" id="applicantDetail" onclick="expandDetails(this.id)">
                        <div class="d-flex align-items-center">
                            <div class="d-flex align-items-center">
                                <div>
                                    <span class="accordion__toggle"></span>
                                </div>
                                <div>
                                    <h2>Applicant Detail</h2>
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
                                    <p class="tab-form-main-heading">Head of Company Name:</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Job Title:</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">E Mail Address :</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="" oninput="formatPhoneNumber(this);" value="" />
                                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation"
                                        style="color: red;">Please Enter Name</p>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Telephone Number :</p>
                                    <input type="number" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation"
                                        style="color: red;">Please Enter Name</p>
                                </div>
                            </div>
                            
                        </div>

                        <!--  -->
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Contact Name: </p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Job Title:</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">E Mail Address :</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation"
                                        style="color: red;">Please Enter Name</p>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Telephone Number :</p>
                                    <input type="number" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation"
                                        style="color: red;">Please Enter Name</p>
                                </div>
                            </div>
                            <div class="col-md-12 d-flex justify-content-end py-4">
                                <a href="javascript:void(0);" class="add-more-employee" id="addApplicantDetail"
                                    onclick="addApplicantDetail();"> <span>+ 1</span> Add More</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-12 table-responsive hide addApplicantDetailTableBox">
                <table class="table table-bordered mb-3">
                    <tbody class="addApplicantDetailTable">
                        <tr>
                            <th class="sub_heading text-nowrap">Head of Company Name:</th>
                            <th class="sub_heading text-nowrap">Job Title:</th>
                            <th class="sub_heading text-nowrap">E Mail Address</th>
                            <th class="sub_heading text-nowrap">Telephone Number </th>
                            <th class="sub_heading text-nowrap">Contact Name:</th>
                            <th class="sub_heading text-nowrap">Job Title:</th>
                            <th class="sub_heading text-nowrap">E Mail Address</th>
                            <th class="sub_heading text-nowrap">Telephone Number </th>
                            <th class="sub_heading">Edit</th>
                            <th class="sub_heading">Delete</th>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Stage 1:</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Stage 2:</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Surveillance audit:</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Recertification audit:</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Pre-assessment audit: </p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Any other service (s):</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
    </div>
    <button type="button" id="saveComName" onClick="applicantInfo();"
        class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
        Continue to the next form section
        <span class="ml-2">
            <svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
                <pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902
                    0.589966L6.00016 11.17Z" fill="#1B1917" />
            </svg>
        </span>
    </button>
</div>


<!-- NCBJ’s ISO 22000 APPLICATION FORM -->


<div class="tab-pane iso22000CertificationForm hide" role="tabpanel" id="childStep4">
    <div class="tab-form">
        <div class="row">
            <div class="col-md-12">
                <p class="tab-form-title f2">Section I</p>
                <!-- <p class="tab-form-title-subtitle f2">In this section you will provide general information about the
                    Applicant</p> -->
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">COMPANY DETAILS</p>
                    <input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
                        oninput="formatPhoneNumber(this);" value="" />
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">Company Name or Head Office</p>
                    <input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
                        oninput="formatPhoneNumber(this);" value="" />
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">Company Address: </p>
                    <input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
                        oninput="formatPhoneNumber(this);" value="" /><textarea rows="3" id="applicantAddress"
                        class="form-control" maxlength="255" placeholder="Enter Address"
                        style="border-radius: 5px; width: 100%"></textarea>
                </div>
            </div>

        </div>
        <div class="row">
            <input id="applicantDetailVal" type="hidden" name="applicantDetailVal" value="1">

            <div class="col-md-12">
                <div class="accordion secured-accordian" id="applicantDetailBox">
                    <div class="accordion__header is-active" id="applicantDetail" onclick="expandDetails(this.id)">
                        <div class="d-flex align-items-center">
                            <div class="d-flex align-items-center">
                                <div>
                                    <span class="accordion__toggle"></span>
                                </div>
                                <div>
                                    <h2>company Detail</h2>
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
                                    <p class="tab-form-main-heading">Head of Company Name:</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Job Title:</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">E Mail Address :</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation"
                                        style="color: red;">Please Enter Name</p>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Telephone Number :</p>
                                    <input type="number" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation"
                                        style="color: red;">Please Enter Name</p>
                                </div>
                            </div>
                            
                        </div>
                        <!--  -->
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Contact Name: </p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Job Title:</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">E Mail Address :</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation"
                                        style="color: red;">Please Enter Name</p>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <p class="tab-form-main-heading">Telephone Number :</p>
                                    <input type="number" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation"
                                        style="color: red;">Please Enter Name</p>
                                </div>
                            </div>
                            <div class="col-md-12 d-flex justify-content-end py-4">
                                <a href="javascript:void(0);" class="add-more-employee" id="addApplicantDetail"
                                    onclick="addApplicantDetail();"> <span>+ 1</span> Add More</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-12 table-responsive hide addApplicantDetailTableBox">
                <table class="table table-bordered mb-3">
                    <tbody class="addApplicantDetailTable">
                        <tr>
                            <th class="sub_heading text-nowrap">Head of Company Name:</th>
                            <th class="sub_heading text-nowrap">Job Title:</th>
                            <th class="sub_heading text-nowrap">E Mail Address : </th>
                            <th class="sub_heading text-nowrap">Telephone Number :</th>
                            <th class="sub_heading text-nowrap">Contact Name:</th>
                            <th class="sub_heading text-nowrap">Job Title:</th>
                            <th class="sub_heading text-nowrap">E Mail Address : </th>
                            <th class="sub_heading text-nowrap">Telephone Number :</th>
                            <th class="sub_heading">Edit</th>
                            <th class="sub_heading">Delete</th>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <!-- product and services  -->
        <div class="row">
            <div class="d-flex">
                <h2 class="pl-1">PRODUCTS AND SERVICES</h2>
                <p>(please detail the products you produce and /or the services you provide)</p>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">Number of product types </p>
                    <input type="number" class="form-control" id="applicantTelephone" placeholder="22345678"
                        oninput="formatPhoneNumber(this);" value="" />
                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation" style="color: red;">
                        Please Enter Name</p>
                </div>
                <div class="form-group">
                    <p class="tab-form-main-heading"> please list products</p>
                    <input type="number" class="form-control" id="applicantTelephone" placeholder="22345678"
                        oninput="formatPhoneNumber(this);" value="" />
                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation" style="color: red;">
                        Please Enter Name</p>
                </div>
                <div class="form-group">
                    <p class="tab-form-main-heading">Number of Production Lines </p>
                    <input type="number" class="form-control" id="applicantTelephone" placeholder="22345678"
                        oninput="formatPhoneNumber(this);" value="" />
                    <p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation" style="color: red;">
                        Please Enter Name</p>
                </div>
            </div>
        </div>
        <!-- end product and services -->
        <!-- upload document -->
        <p class="tab-form-main-heading" id="investmentAccQues">Field heading</p>
        <div class="supporting-document-card my-3">
            <div class="row">
                <div class="col-md-12">
                    <div class="supporting-document-card-wrapper">
                        <div class="left">
                            <p class="supporting-document-card-upper-heading">Attach File</p>
                        </div>
                        <div class="right">
                            <input type="file" id="detail-operating" onchange="attachDetailed(this.id)" hidden=""
                                multiple=""
                                name="<portlet:namespace/>signatureUploadBtn">
                            <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                    <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                        xmlns="http://www.w3.org/2000/svg">
                                        <path
                                            d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                            fill="#047247"></path>
                                    </svg> </span>Upload </label>
                        </div>
                    </div>
                    <span class="attach-detailed-overview"></span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="radiobox">
                    <div class="form-group">
                        <p class="tab-form-main-heading" id="orgMember"><strong>Exclusions</strong> Are there
                            exclusions to the activities to be certified compared to the activities you carry out in
                            relation to food products? </p>
                        <div class="wizard-form-radio">
                            <input value="Yes" type="radio" name="orgMember" /> <label for="orgMember">Yes</label>
                        </div>
                        <div class="wizard-form-radio">
                            <input value="No" type="radio" name="orgMember" /> <label for="orgMember">No</label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <button type="button" id="saveComName" onClick="applicantInfo();"
        class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
        Continue to the next form section
        <span class="ml-2">
            <svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
                <pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016
                    11.17Z" fill="#1B1917" />
            </svg>
        </span>
    </button>
    </div>
</div>

<!-- Section II -->

<div class="tab-pane iso22000CertificationForm hide" role="tabpanel" id="childStep5">
    <div class="tab-form">
        <div class="row">
            <div class="col-md-12">
                <p class="tab-form-title f2">Section II</p>

            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <p class="tab-form-main-heading" id="investmentAccQues"> Incoming Materials (please list the
                    main materials/and or ingredients)</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <p class="tab-form-main-heading" id="investmentAccQues"> Product Storage - (please give details
                    of on-site product storage including in process)</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <p class="tab-form-main-heading" id="investmentAccQues"> Building and Site Aspects ( Please give
                    any significant details, e.g., Any neighbour whose activity may effect operation, etc)</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <p class="tab-form-main-heading" id="investmentAccQues"> Waste and Discharges (Please list main
                    wastes and effluents)</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <p class="tab-form-main-heading" id="investmentAccQues"> Transport (Please give details of
                    transport and/or distribution etc.)</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <p class="tab-form-main-heading" id="investmentAccQues"> Sub Contracted Activities (Please
                    detail any subcontract activities i.e.: maintenance, calibration, delivery, transport etc.).
                </p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <button type="button" id="saveComName" onClick="applicantInfo();"
                    class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
                    Continue to the next form section
                    <span class="ml-2">
                        <svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902
                                0.589966L6.00016 11.17Z" fill="#1B1917" />
                        </svg>
                    </span>
                </button>
            </div>
        </div>
    </div>
</div>    

<!-- section III -->

<div class="tab-pane iso22000CertificationForm hide" role="tabpanel" id="childStep6">
    <div class="tab-form">
        <div class="row">
            <div class="col-md-12">
                <p class="tab-form-title f2">Section III</p>

            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <p class="tab-form-main-heading" id="investmentAccQues">ACTIVITIES AND PROCESSES ON SITE:</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <p class="tab-form-main-heading" id="investmentAccQues">PLEASE LIST HERE (OR ATTACH) INFORMATION RELATING TO ALL SITE ACTIVITIES INCLUDING NUMBER OF PERSONNEL INVOLVED AND THE EXTENT OF ACTIVITY:</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <p class="tab-form-main-heading" id="investmentAccQues">INCOMING MATERIALS</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                <p class="tab-form-main-heading" id="investmentAccQues">process</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
                
            </div>
            <!--  SPECIFIC ACTIVITIES (tick off please) -->
            <div class="col-md-12">
				<div class="form-group">
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">Number of product types</p>
						</label>
					</div>
					<div class="row machinesQuantityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"> Please state the number of</p>
								<input type="text" class="form-control"
									id="quantity1" placeholder="" value=""
									autocomplete="off">
							</div>
						</div>
					</div>
				</div>
			</div>
            <div class="col-md-12">
				<div class="form-group">
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">Number of products</p>
						</label>
					</div>
					<div class="row machinesQuantityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number of products</p>
								<input type="text" class="form-control"
									id="quantity1" placeholder="" value=""
									autocomplete="off">
							</div>
						</div>
					</div>
				</div>
			</div>
            <div class="col-md-12">
				<div class="form-group">
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">Number of production lines</p>
						</label>
					</div>
					<div class="row machinesQuantityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number of products lines</p>
								<input type="text" class="form-control"
									id="quantity1" placeholder="" value=""
									autocomplete="off">
							</div>
						</div>
					</div>
				</div>
			</div>
            <div class="col-md-12">
				<div class="form-group">
					
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">Number of buildings</p>
						</label>
					</div>
					<div class="row machinesQuantityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number of buildings</p>
								<input type="text" class="form-control"
									id="quantity1" placeholder="" value=""
									autocomplete="off">
							</div>
						</div>
					</div>
				</div>
			</div>
            <div class="col-md-12">
				<div class="form-group">
					
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">Number of warehouses</p>
						</label>
					</div>
					<div class="row machinesQuantityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number of warehouses</p>
								<input type="text" class="form-control"
									id="quantity1" placeholder="" value=""
									autocomplete="off">
							</div>
						</div>
					</div>
				</div>
			</div>

            <div class="col-md-12">
				<div class="form-group">
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">In house laboratory</p>
						</label>
					</div>
				</div>
			</div>
            <div class="col-md-12">
				<div class="form-group">
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">Logistic & transport (not outsourced)</p>
						</label>
					</div>
				</div>
			</div>
            <div class="col-md-12">
				<div class="form-group">
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">External warehouse (under direct responsibility of your factory)</p>
						</label>
					</div>
				</div>
			</div>
            <div class="col-md-12">
				<div class="form-group">
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0">Product development</p>
						</label>
					</div>
				</div>
			</div>
            <div class="col-md-12">
				<div class="form-group">
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0 text-lowercase">Staff speaking in more than on language (if requiring interpreter for this audit)</p>
						</label>
					</div>
				</div>
			</div>


            <div class="col-md-12">
                <div class="form-group">
                    <p class="tab-form-main-heading">Please explain if needed:</p>
                    <textarea type="text" class="form-control"
                        id="quantity1" placeholder="" value=""
                        autocomplete="off"></textarea>
                </div>
            </div>
            <div class="col-md-12">
                <p class="tab-form-main-heading text-lowercase" id="investmentAccQues">LIST OF SUB CONTRACTED ACTIVITIES (i.e.: Machining, calibration, delivery, etc.).</p>
                <!-- Field Upload button -->
                <div class="supporting-document-card my-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="supporting-document-card-wrapper">
                                <div class="left">
                                    <p class="supporting-document-card-upper-heading">Attach File</p>
                                </div>
                                <div class="right">
                                    <input type="file" id="detail-operating" onchange="attachDetailed(this.id)"
                                        hidden="" multiple=""
                                        name="<portlet:namespace/>signatureUploadBtn">
                                    <label class="custom-upload" for="detail-operating"> <span class="mr-2">
                                            <svg width="14" height="17" viewBox="0 0 14 17" fill="none"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path
                                                    d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                                    fill="#047247"></path>
                                            </svg> </span>Upload </label>
                                </div>
                            </div>
                            <span class="attach-detailed-overview"></span>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-md-12">
                <div class="accordion secured-accordian" id="applicantDetailBox">
                    <div class="accordion__header is-active" id="applicantDetail" onclick="expandDetails(this.id)">
                        <div class="d-flex align-items-center">
                            <div class="d-flex align-items-center text-lowercase">
                                <div>
                                    <span class="accordion__toggle"></span>
                                </div>
                                <div>
                                    <h2>The number and type of HACCP study</h2>
                                    <p>
                                        A HACCP study corresponds to a hazard analysis for a family of products/services with similar hazards and similar production technology and, where relevant, similar storage technology.
                                        Example; if a factory is producing liquid food (pasteurized and packed aseptic) and solid food (other process type), the factory has two HACCP studies. Another example is production of two not-related products (e.g. ice cream and cheese).
                                    </p>
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
                                    <p class="tab-form-main-heading">Number of HACCP study </p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>    
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-md-12">
                <div class="accordion secured-accordian" id="applicantDetailBox">
                    <div class="accordion__header is-active" id="applicantDetail" onclick="expandDetails(this.id)">
                        <div class="d-flex align-items-center">
                            <div class="d-flex align-items-center">
                                <div>
                                    <span class="accordion__toggle"></span>
                                </div>
                                <div>
                                    <h2> HAZARD ANALYSIS AND CRITICAL CONTROL POINT ASPECTS (CCP's ) & Prerequisite programme (PRP's)</h2>
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
                                    <p class="tab-form-main-heading">CCP's & PRP's) </p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>    
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-12">
                <div class="accordion secured-accordian" id="applicantDetailBox">
                    <div class="accordion__header is-active" id="applicantDetail" onclick="expandDetails(this.id)">
                        <div class="d-flex align-items-center">
                            <div class="d-flex align-items-center">
                                <div>
                                    <span class="accordion__toggle"></span>
                                </div>
                                <div>
                                    <h2> CONSENTS, LICENCES, PERMITS, AUTHORISATIONS, AGREEMENTS, CODES OF PRACTICE, ETC. (please list)</h2>
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
                                    <p class="tab-form-main-heading">CONSENTS & LICENCES</p>
                                    <input type="text" class="form-control" id="applicantTelephone"
                                        placeholder="22345678" oninput="formatPhoneNumber(this);" value="" />
                                </div>
                            </div>    
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-12">
				<div class="form-group">
                    <p class="tab-form-main-heading">ISO 22000 / FSSC 22000 Categories (C- Food Manufacturing, CI- CIV: Subcategories):</p>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0 text-lowercase">CII - Processing of perishable animal products. Example: production of animal products including fish and seafood, meat, eggs, dairy and fish products.</p>
						</label>
					</div>
                    <div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0 text-lowercase">CII - Processing of perishable plant products. Example: Production of plant products including fruits and fresh juices, vegetables, grains, nuts, and pulses</p>
						</label>
					</div>
                    <div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0 text-lowercase"> CIII - Processing of perishable animal and plant products (mixed products). Example: Production of mixed animal and plant products including pizza, patty, sandwich, ready-to-eat meals</p>
						</label>
					</div>
                    <div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="landLegalAccess1" value="Ownership" name="landLegalAccess"> 
						<label for="landLegalAccess1">
							<p class="tab-form-main-heading mb-0 ">CIV - Processing of ambient stable products. Example:  Production of food products from any source that are stored and sold at ambient temperature, including canned foods, biscuits, snacks, oil, drinking water, beverages, pasta, flour, sugar, food-grade salt
                            </p>
						</label>
					</div>
				</div>
			</div>
        </div>
        <button type="button" id="saveComName" onClick="applicantInfo();"
            class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
            Continue to the next form section
            <span class="ml-2">
                <svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902
                        0.589966L6.00016 11.17Z" fill="#1B1917" />
                </svg>
            </span>
        </button>
    </div>
</div>    

<div class="tab-pane iso22000CertificationForm hide" role="tabpanel" id="childStep7">
    <div class="tab-form">
        <div class="row">
            <div class="col-md-12">
                <p class="tab-form-title f2">Section IV</p>
            </div>
        </div>
        <div class="row">
            
            <div class="col-md-12">
                <div class="radiobox">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Has your company used any consulting services to assist in the development and/or implementation of your Management System?</p>
                        <div class="wizard-form-radio">
                            <input value="Yes" type="radio" name="orgMember" /> <label for="orgMember">Yes</label>
                        </div>
                        <div class="wizard-form-radio">
                            <input value="No" type="radio" name="orgMember" /> <label for="orgMember">No</label>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">Consulting Firm Telephone</p>
                    <input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
                        oninput="formatPhoneNumber(this);" value="" />
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <p class="tab-form-main-heading">Consultant(s)  Email</p>
                    <input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
                        oninput="formatPhoneNumber(this);" value="" />
                </div>
            </div>

        </div>
       
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Preferred Dates for Your Certification Activities</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Stage 1</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Stage 2</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Surveillance audit</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Recertification audit</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Pre-assessment audit</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Any other service (s)</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Name</p>
                <input type="text" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Position</p>
                <input type="text" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
        <div class="col-md-12">
            <p class="pt-2 common-para">Signature of Applicant</p>
            <div class="signature_texarea mb-2" id="transferApplicantSignatureImageHolder">
            </div>					
            <input type="file" id="transferApplicantSignatureBtn" hidden="" name="<portlet:namespace/>transferApplicantSignatureBtn">
            <label for="transferApplicantSignatureBtn" class="choose-sign-btn"> 
                <span class="mr-2">
                    <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
                        <path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
                    </svg>
            </span> Upload Signature
            </label>
        </div>
        <div class="col-6">
            <div class="form-group">
                <p class="tab-form-main-heading">Date</p>
                <input type="date" class="form-control" id="applicantTelephone" placeholder="22345678" oninput="formatPhoneNumber(this);"
                value=""/>
            </div>
        </div>
    </div>
    <button type="button" id="saveComName" onClick="applicantInfo();"
        class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
        Continue to the next form section
        <span class="ml-2">
            <svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
                <pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902
                    0.589966L6.00016 11.17Z" fill="#1B1917" />
            </svg>
        </span>
    </button>
</div>
