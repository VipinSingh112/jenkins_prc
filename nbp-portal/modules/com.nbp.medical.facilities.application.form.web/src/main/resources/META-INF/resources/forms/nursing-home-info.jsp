<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<%
int applicantDetailVal=1;
/* int homeDetailVal=1; */
int companyDetailVal=1;
/* int patientCountVal=1; */
int nursingStaffDetailVal=1;
/* int medicalPractitionerDetailVal=1; */
int maternityHomeDetailVal=1;
%>
<div class="tab-pane" role="tabpanel" id="childStep1">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Applicant Instructions</p>
			</div>
		</div>
		<div class="row" id="applicantInstructionsForm">
			<div class="col-md-12">
				<p class="tab-form-title-subtitle f2 pt-3">I (or we) apply to the Chief Medical Officer in pursuance of the provisions 
				of the Nursing Home Registration law, Chapter 263, for Registration in respect of a Nursing Home, 
				and furnish below particulars in regard to the Home.</p>
				<p class="tab-form-main-heading">Before completing the form the applicant should carefully read the notes below</p>
				<ul class="list-group tab-form-sub-heading">
					<li class="list-group-item">A. The application must be signed by the responsible person or 
					persons carrying on the home. In case of a limited company, it must be signed by the Managing Director or Secretary. 
					An application from a non-incorporated society, association or body must be accompanied by a certified copy of the 
					resolution authorizing a matron, superintendent or other responsible person to act on its behalf.</li>
					<li class="list-group-item">B. The name, style or title specified in this application must not 
					be changed without the previous consent in writing of the Chief Medical Officer.</li>
					<li class="list-group-item">C. In the event of a change of address, application for registration in respect 
					of the new premises must at once be made to the Chief Medical Officer on the official form, accompanied by a fee of $5,000.00 or $10,000.00.</li>
					<li class="list-group-item">D. In the event of any other business being transacted at some future date on the same premises as the home, 
					the Chief Medical Officer should at once be notified of the fact.</li>
					<li class="list-group-item">E. In the case of any home carried on by a Company, association or body corporate, the Chief Medical Officer 
					should be notified at once of any change in regard to the person(s) responsible for the management of the home</li>
				</ul>
			</div>
			<div class="col-md-12">
				<p class="tab-form-title-subtitle f2 pt-3">Cases in which New Registration is required</p>
				<p class="tab-form-main-heading">New registration is necessary in cases in which:</p>
				<ul class="list-group tab-form-sub-heading">
					<li class="list-group-item">1. A home is transferred from one person, society, etc., to another.</li>
					<li class="list-group-item">2. Any change occurs in the constitution of the body carrying on a home.</li>
					<li class="list-group-item">3. A home is removed to other premises.</li>
				</ul>
				<p class="tab-form-main-heading pt-3">All cheques should be made payable to the Permanent Secretary, Ministry of Health & Wellness.</p>
				<p class="tab-form-main-heading">Submit the completed application form and receipt of fee payment of $5000.00 or $10,000.00 to 
				the Standards and Regulation Division, 52-60 Grenada Crescent, Kingston 5, Jamaica.</p>
				<p class="tab-form-main-heading"><b>All payments must be made at the MOHW Cashier, 10 A Chelsea Avenue, Kingston 5.</b></p>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="applicantInfo();" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section 
		<span class="ml-2"> 
			<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
	          	<pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
	         </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep2">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Applicant's Information</p>
				<p class="tab-form-title-subtitle f2">In this section you will provide general information about the Applicant</p>
			</div>
		</div>
		<div class="row">
			<input id="applicantDetailVal" type="hidden" name="applicantDetailVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="applicantDetailBox">
					<div class="accordion__header is-active"  id="applicantDetail" onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
							<div>
								<span class="accordion__toggle"></span>
							</div>
							<div>
								<h2>1. Applicant Detail</h2>
							</div>
							</div>
						</div>
						<div>
							<p class="accordian-employee mb-0 common-para"></p>
						</div>
					</div>		
					
					<div class="accordion__body is-active">
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">(a) Full name of the applicant or applicants(See note A)</p>
									<input type="text" class="form-control" id="applicantName" placeholder="John Doe" value=""/>
									<p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation" style="color: red;">Please Enter Name</p>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">(b) Telephone Number</p>
									<input type="text" class="form-control" id="applicantTelephone" placeholder="22345678" 
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									value=""/>
								</div>
							</div>
							<div class="col-md-6"> 
                              <div class="form-group"> 
                               <p class="tab-form-main-heading" for="emailAddress">Email Address</p> 
                               <input type="text" class="form-control" id="applicantEmailAddress" value="" mailto:placeholder="info@example.jm"> 
                               <!-- <p class="tab-form-sub-heading fieldAlert hide" id="emailAddressValidation" style="color: red;"></p> --> 
                              </div> 
                             </div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Address</p>
									<textarea rows="3" id="applicantAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">(c) Nationality of applicant</p>
									<input type="text" class="form-control" id="applicantNationality" placeholder="" value=""/>
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4"> 
								<a href="javascript:void(0);" class="add-more-employee" id="addApplicantDetail" onclick="addApplicantDetail();"> <span>+ 1</span> Add More</a> 
							</div>
						</div>
					</div>
				</div>			
			</div>
			
			<div class="col-12 table-responsive hide addApplicantDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addApplicantDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Applicant Name</th>
							<th class="sub_heading text-nowrap">Telephone Number</th>
							<th class="sub_heading text-nowrap">Address</th>
							<th class="sub_heading text-nowrap">Email Address</th>
							<th class="sub_heading text-nowrap">Nationality of applicant</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
	<%if(Validator.isNotNull(applicantDetailsAdd)&&applicantDetailsAdd.size()>0){
	for(MedicalFacilitiesAppliInfo applicantDetails:applicantDetailsAdd){ %>
						<tr class="applicant-row<%=applicantDetailVal%>">
	<td class="sub_heading_content applicantName<%=applicantDetailVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getApplicantName())?applicantDetails.getApplicantName():""%></td>
	<td class="sub_heading_content applicantTelephone<%=applicantDetailVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getAppliTelephoneNumber())?applicantDetails.getAppliTelephoneNumber():""%></td>
	<td class="sub_heading_content applicantAddress<%=applicantDetailVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getAppliAddress())?applicantDetails.getAppliAddress():""%></td>
	<td class="sub_heading_content applicantEmailAddress<%=applicantDetailVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getAppliEmailAddress())?applicantDetails.getAppliEmailAddress():""%></td>
	<td class="sub_heading_content applicantNationality<%=applicantDetailVal%>"><%=Validator.isNotNull(applicantDetails)&&Validator.isNotNull(applicantDetails.getAppliNationality())?applicantDetails.getAppliNationality():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="applicantDetailEditTab" onclick="applicantDetailEditTab('<%=applicantDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="applicantDetailDeleteDataTab" onclick="applicantDetailDeleteData('<%=applicantDetailVal%>');deleteApplicantINfo('<%=applicantDetails.getMedicalFacilitiesAppId() %>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
    </tr>
     <input type="hidden" id="medicalFacilitiesAppliId<%=applicantDetailVal%>" name="medicalFacilitiesAppliId<%=applicantDetailVal%>" value="<%=applicantDetails.getMedicalFacilitiesAppliId()%>">
      <%applicantDetailVal=applicantDetailVal+1;
	}} %>	
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="applicantdetail();" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section 
		<span class="ml-2"> 
			<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
	          	<pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
	         </svg>
		</span>
	</button>
</div>
<div class="tab-pane company-form" role="tabpanel" id="childStep3">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Company Details</p>
				<p class="tab-form-title-subtitle f2">In this section you will provide general information about the Company</p>
			</div>
		</div>
		<div class="row" id="companyDetailForm">
			<input id="companyDetailVal" type="hidden" name="companyDetailVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="companyDetailBox">
					<div class="accordion__header is-active"  id="companyDetail" onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
							<div>
								<span class="accordion__toggle"></span>
							</div>
							<div>
								<h2>2. Company Detail</h2>
							</div>
							</div>
						</div>
						<div>
							<p class="accordian-employee mb-0 common-para"></p>
						</div>
					</div>		
					
					<div class="accordion__body is-active">
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">(a) Full name of individual responsible for the management of the home (See Note E)</p>
									<input type="text" class="form-control" id="comFullName" placeholder="John Doe" value=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">(b) Private address of person</p>
									<textarea rows="3" id="comAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">(c) Registered or principal address of Company, society, association or body</p>
									<input type="text" class="form-control" id="comOffice" placeholder="" value=""/>
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4"> 
								<a href="javascript:void(0);" class="add-more-employee" id="addCompanyDetail" onclick="addCompanyDetail();"> <span>+ 1</span> Add More</a> 
							</div>
						</div>
					</div>
				</div>			
			</div>
			
			<div class="col-12 table-responsive hide addCompanyDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addCompanyDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Full Name</th>
							<th class="sub_heading text-nowrap">Private address of person</th>
							<th class="sub_heading text-nowrap">Registered or principal office</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
							<%if(Validator.isNotNull(companyDetailInfo)&&companyDetailInfo.size()>0){
	for(MedicalFacilitiesComDetail companyDetails:companyDetailInfo){ %>
						<tr class="company-row<%=companyDetailVal%>">
	<td class="sub_heading_content comFullName<%=companyDetailVal%>"><%=Validator.isNotNull(companyDetails)&&Validator.isNotNull(companyDetails.getFullName())?companyDetails.getFullName():""%></td>
	<td class="sub_heading_content comAddress<%=companyDetailVal%>"><%=Validator.isNotNull(companyDetails)&&Validator.isNotNull(companyDetails.getPrivateAddress())?companyDetails.getPrivateAddress():""%></td>
	<td class="sub_heading_content comOffice<%=companyDetailVal%>"><%=Validator.isNotNull(companyDetails)&&Validator.isNotNull(companyDetails.getRegisteredOffice())?companyDetails.getRegisteredOffice():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="companyDetailEditTab" onclick="companyDetailEditTab('<%=companyDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="companyDetailDeleteDataTab" onclick="companyDetailDeleteData('<%=companyDetailVal%>'); deleteApplicantINfo('<%=companyDetails.getMedicalFacilitiesComDetailId() %>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
</tr>
<input type="hidden" id="medicalFacilitiesComDetailId<%=companyDetailVal%>" name="medicalFacilitiesComDetailId<%=companyDetailVal%>" value="<%=companyDetails.getMedicalFacilitiesComDetailId()%>">
 <%companyDetailVal=companyDetailVal+1;
	}} %>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="applicantInfo();" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section 
		<span class="ml-2"> 
			<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
	          	<pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
	         </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep4">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Home Details</p>
				<p class="tab-form-title-subtitle f2">In this section you will provide general information about the Home</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">3.(a) Name, style or title under which the home is carried on(See Note B)</p>
					<input type="text" class="form-control" id="homeCarriedName" placeholder="John Doe" value="<%=Validator.isNotNull(homeDetailAdd)&&Validator.isNotNull(homeDetailAdd.getNameOfOwner())?homeDetailAdd.getNameOfOwner():""%>"/>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">(b) Address of the home(See Note C)</p>
					<textarea rows="3" id="homeAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(homeDetailAdd)&&Validator.isNotNull(homeDetailAdd.getHomeAddress())?homeDetailAdd.getHomeAddress():""%></textarea>
				</div>
			</div>
			<div class="col-md-7">
				<div class="form-group">
					<p class="tab-form-main-heading">Telephone Number of the home(See Note C)</p>
					<input type="text" class="form-control" id="homeTelephone" placeholder="22345678"  
					oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
					value="<%=Validator.isNotNull(homeDetailAdd)&&Validator.isNotNull(homeDetailAdd.getHomeTelephoneNumber())?homeDetailAdd.getHomeTelephoneNumber():""%>"/>
				</div>
			</div>
			<div class="col-md-5">
				<div class="form-group">
					<p class="tab-form-main-heading" for="homeEmailAddress">Email Address</p>
					<input type="text" class="form-control" id="homeEmailAddress"
						value="<%=Validator.isNotNull(homeDetailAdd)&&Validator.isNotNull(homeDetailAdd.getHomeEmailAddress())?homeDetailAdd.getHomeEmailAddress():""%>" mailto:placeholder="info@example.jm">
					<!-- <p class="tab-form-sub-heading fieldAlert hide" id="emailAddressValidation" style="color: red;"></p> -->
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">(c) Brief description of situation, construction, accommodation and equipment of premises</p>
					<textarea rows="3" id="homeSitutationDescription" class="form-control" maxlength="255" placeholder="Enter Description" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(homeDetailAdd)&&Validator.isNotNull(homeDetailAdd.getDescription())?homeDetailAdd.getDescription():""%></textarea>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">(d) What other business (if any) is transacted on the same premises as the home(See Note D)</p>
					<input type="text" class="form-control" id="homeOtherBusinessPremises" placeholder="" value="<%=Validator.isNotNull(homeDetailAdd)&&Validator.isNotNull(homeDetailAdd.getOtherBusinessDetails())?homeDetailAdd.getOtherBusinessDetails():""%>"/>
				</div>
			</div>
			
			
			<%-- 
			<input id="homeDetailVal" type="hidden" name="homeDetailVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="homeDetailBox">
					<div class="accordion__header is-active"  id="homeDetail" onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
							<div>
								<span class="accordion__toggle"></span>
							</div>
							<div>
								<h2>3. Home Detail</h2>
							</div>
							</div>
						</div>
						<div>
							<p class="accordian-employee mb-0 common-para"></p>
						</div>
					</div>		
					
					<div class="accordion__body is-active">
						<div class="row">
							
							<div class="col-md-12 d-flex justify-content-end py-4"> 
								<a href="javascript:void(0);" class="add-more-employee" id="addHomeDetail" onclick="addHomeDetail();"> <span>+ 1</span> Add More</a> 
							</div>
						</div>
					</div>
				</div>			
			</div>
			
			<div class="col-12 table-responsive hide addHomeDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addHomeDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Name, style or title</th>
							<th class="sub_heading text-nowrap">Address</th>
							<th class="sub_heading text-nowrap">Telephone Number</th>
							<th class="sub_heading text-nowrap">Email Address</th>
							<th class="sub_heading text-nowrap">Brief description</th>
							<th class="sub_heading text-nowrap">Other business</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
	<%if(Validator.isNotNull(homeDetailAdd)&&homeDetailAdd.size()>0){
	for(MedicalFacilitiesHomeInfo homeAddDetails:homeDetailAdd){ %>
					<tr class="home-row<%=homeDetailVal%>">
	<td class="sub_heading_content text-nowrap homeCarriedName<%=homeDetailVal%>"><%=Validator.isNotNull(homeAddDetails)&&Validator.isNotNull(homeAddDetails.getNameOfOwner())?homeAddDetails.getNameOfOwner():""%></td>
	<td class="sub_heading_content text-nowrap homeAddress<%=homeDetailVal%>"><%=Validator.isNotNull(homeAddDetails)&&Validator.isNotNull(homeAddDetails.getHomeAddress())?homeAddDetails.getHomeAddress():""%></td>
	<td class="sub_heading_content text-nowrap homeTelephone<%=homeDetailVal%>"><%=Validator.isNotNull(homeAddDetails)&&Validator.isNotNull(homeAddDetails.getHomeTelephoneNumber())?homeAddDetails.getHomeTelephoneNumber():""%></td>
	<td class="sub_heading_content text-nowrap homeEmailAddress<%=homeDetailVal%>"><%=Validator.isNotNull(homeAddDetails)&&Validator.isNotNull(homeAddDetails.getHomeEmailAddress())?homeAddDetails.getHomeEmailAddress():""%></td>
	<td class="sub_heading_content text-nowrap homeSitutationDescription<%=homeDetailVal%>"><%=Validator.isNotNull(homeAddDetails)&&Validator.isNotNull(homeAddDetails.getDescription())?homeAddDetails.getDescription():""%></td>
	<td class="sub_heading_content text-nowrap homeOtherBusinessPremises<%=homeDetailVal%>"><%=Validator.isNotNull(homeAddDetails)&&Validator.isNotNull(homeAddDetails.getOtherBusinessDetails())?homeAddDetails.getOtherBusinessDetails():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="applicantDetailEditTab" onclick="homeDetailEditTab('<%=homeDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td>
		<span> 
			<a href="javascript:void(0)" id="homeDetailDeleteDataTab"
				onclick="homeDetailDeleteData('<%=homeDetailVal%>'); deleteApplicantINfo('<%=homeAddDetails.getMedicalFacilitiesHomeInfoId() %>');">
					<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
						xmlns="http://www.w3.org/2000/svg">
			        <path
							d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
							fill="#047247"></path>
			        </svg>
			</a>
		</span>
	</td>
</tr>
<input type="hidden" id="medicalFacilitiesHomeInfoId<%=homeDetailVal%>" name="medicalFacilitiesHomeInfoId<%=homeDetailVal%>" value="<%=homeAddDetails.getMedicalFacilitiesHomeInfoId()%>">
		<%homeDetailVal=homeDetailVal+1;
			}} %>
					</tbody>
				</table>
			</div> --%>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">4. Number of patients provided for</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">(a) Maternity</p>
					<input type="text" class="form-control numeric-field" id="maternityPatientNum"
						value="<%=Validator.isNotNull(homeDetailAdd)&&Validator.isNotNull(homeDetailAdd.getMaternityPatients())?homeDetailAdd.getMaternityPatients():""%>" placeholder="" oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>	
					<p class="tab-form-sub-heading fieldAlert hide" id="maternityPatientNumValidation" style="color: red;">Only Numeric characters are allowed</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">(b) Other Patients</p>
					<input type="text" class="form-control numeric-field" id="otherPatientNum"
						value="<%=Validator.isNotNull(homeDetailAdd)&&Validator.isNotNull(homeDetailAdd.getOtherPatients())?homeDetailAdd.getOtherPatients():""%>" placeholder="" oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"/>	
					<p class="tab-form-sub-heading fieldAlert hide" id="otherPatientNumValidation" style="color: red;">Only Numeric characters are allowed</p>	
				</div>
			</div>
			<!-- <input id="patientCountVal" type="hidden" name="patientCountVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="patientCountBox">
					<div class="accordion__header is-active"  id="patientCount" onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
							<div>
								<span class="accordion__toggle"></span>
							</div>
							<div>
								<h2>4. Number of patients provided for</h2>
							</div>
							</div>
						</div>
						<div>
							<p class="accordian-employee mb-0 common-para"></p>
						</div>
					</div>		
					
					<div class="accordion__body is-active">
						<div class="row">
							
							<div class="col-md-12 d-flex justify-content-end py-4"> 
								<a href="javascript:void(0);" class="add-more-employee" id="addPatientCount" onclick="addPatientCount();"> <span>+ 1</span> Add More</a> 
							</div>
						</div>
					</div>
				</div>			
			</div> -->
			
			<%-- <div class="col-12 table-responsive hide addPatientCountTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addPatientCountTable">
						<tr>
							<th class="sub_heading text-nowrap">Maternity</th>
							<th class="sub_heading text-nowrap">Other Patients</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
						<%if(Validator.isNotNull(numOfPaitentInfo)&&numOfPaitentInfo.size()>0){
	for(MedicalFacilitiesHomeTwo patientCount:numOfPaitentInfo){ %>
						<tr class="patient-row<%=patientCountVal%>">
	<td class="sub_heading_content text-nowrap maternityPatientNum<%=patientCountVal%>"><%=Validator.isNotNull(patientCount)&&Validator.isNotNull(patientCount.getMaternityPatients())?patientCount.getMaternityPatients():""%></td>
	<td class="sub_heading_content text-nowrap otherPatientNum<%=patientCountVal%>"><%=Validator.isNotNull(patientCount)&&Validator.isNotNull(patientCount.getOtherPatients())?patientCount.getOtherPatients():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="patientCountEditTab" onclick="patientCountEditTab('<%=patientCountVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td>
		<span> <a href="javascript:void(0)" id="patientCountDeleteDataTab" onclick="patientCountDeleteData('<%=patientCountVal%>'); deleteApplicantINfo('<%=patientCount.getMedicalFacilitiesHomeTwoId()%>');">
				<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
					xmlns="http://www.w3.org/2000/svg">
		        <path
						d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
						fill="#047247"></path>
		        </svg>
		</a>
		</span>
	</td>
</tr>
<input type="hidden" id="patientCount<%=patientCountVal%>" name="patientCount<%=patientCountVal%>" value="<%=patientCount.getMedicalFacilitiesHomeTwoId()%>">
		<%patientCountVal=patientCountVal+1;
			}} %>
					</tbody>
				</table>
			</div> --%>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="addHomeDetailInfo(false);" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section 
		<span class="ml-2"> 
			<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
	          	<pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
	         </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep5">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Nursing Staff Details</p>
				<p class="tab-form-title-subtitle f2">In this section you will provide general information about the Nursing Staff</p>
			</div>
		</div>
		<div class="row">
			<input id="nursingStaffDetailVal" type="hidden" name="nursingStaffDetailVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="nursingStaffDetailBox">
					<div class="accordion__header is-active" id="nursingStaffDetail" onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
							<div>
								<span class="accordion__toggle"></span>
							</div>
							<div>
								<h2>5. Nursing Staff</h2>
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
									<p class="tab-form-main-heading">(a) Names of nursing staff</p>
									<input type="text" class="form-control" id="nursingStaffName" value="" placeholder=""/>	
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Qualifications of nursing staff</p>
									<input type="text" class="form-control" id="nursingStaffQualifications" value="" placeholder=""/>	
								</div>
							</div>
							
							<div class="col-md-12 d-flex justify-content-end py-4"> 
								<a href="javascript:void(0);" class="add-more-employee" id="addNursingStaffDetail" onclick="addNursingStaffDetail();"> <span>+ 1</span> Add More</a> 
							</div>
						</div>
					</div>
				</div>			
			</div>
			
			<div class="col-12 table-responsive hide addNursingStaffDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addNursingStaffDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Name</th>
							<th class="sub_heading text-nowrap">Qualifications</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
	<%if(Validator.isNotNull(nursingStaffInfo) && nursingStaffInfo.size()>0){
	for(MedicalFacilitiesNurseStaff nursingStaff:nursingStaffInfo){ %>
	       <tr class="nursing-row<%=nursingStaffDetailVal%>">
	<td class="sub_heading_content nursingStaffName<%=nursingStaffDetailVal%>"><%=Validator.isNotNull(nursingStaff)&&Validator.isNotNull(nursingStaff.getNStaffName())?nursingStaff.getNStaffName():""%></td>
	<td class="sub_heading_content nursingStaffQualifications<%=nursingStaffDetailVal%>"><%=Validator.isNotNull(nursingStaff)&&Validator.isNotNull(nursingStaff.getNStaffQualification())?nursingStaff.getNStaffQualification():""%></td>
	<%-- <td class="sub_heading_content nursingStaffCategory<%=nursingStaffDetailVal%>"><%=Validator.isNotNull(nursingStaff)&&Validator.isNotNull(nursingStaff.getNStaffState())?nursingStaff.getNStaffState():""%></td> --%>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="nursingStaffDetailEditTab" onclick="nursingStaffEditTab('<%=nursingStaffDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td>
		<span> <a href="javascript:void(0)"
			id="nursingStaffDetailDeleteDataTab"
			onclick="nursingStaffDetailDeleteData('<%=nursingStaffDetailVal%>');deleteApplicantINfo('<%=nursingStaff.getMedicalFacilitiesNurseStaffId()%>');">
				<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
					xmlns="http://www.w3.org/2000/svg">
		        <path
						d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
						fill="#047247"></path>
		        </svg>
		</a>
		</span>
	</td>
</tr>
<input type="hidden" id="medicalFacilitiesNurseDetailId<%=nursingStaffDetailVal%>" name="medicalFacilitiesNurseDetailId<%=nursingStaffDetailVal%>" value="<%=nursingStaff.getMedicalFacilitiesNurseStaffId()%>">
<%nursingStaffDetailVal=nursingStaffDetailVal+1;
			}} %>
					</tbody>
				</table>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">(b) State which category of staff live on premises</p>
					<input type="text" class="form-control" id="nursingStaffCategory" value="<%=Validator.isNotNull(medStaffPremises)&&Validator.isNotNull(medStaffPremises.getNursingStaffCategory())?medStaffPremises.getNursingStaffCategory():""%>" placeholder=""/>	
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="addNureStaffPremises();" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section 
		<span class="ml-2"> 
			<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
	          	<pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
	         </svg>
		</span>
	</button>
</div>
<div class="tab-pane not-maternity-home hide" role="tabpanel" id="childStep6">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Medical Practitioner/ Qualified Nurses Details</p>
				<p class="tab-form-title-subtitle f2">In this section you will provide general information about the Medical Practitioner/ Qualified Nurses</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">6.(a) Is the home under the
							charge of a duly qualified medical practitioner or a qualified
							nurse, resident in the Home?</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="qualifiedNurse"
								<%=qualifiedNurseInfo != null && qualifiedNurseInfo.getCheckQualifiedNurse().equals("Yes") ? "checked"
							: StringPool.BLANK%>>
							<label for="charged">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="qualifiedNurse"
								<%=qualifiedNurseInfo != null && qualifiedNurseInfo.getCheckQualifiedNurse().equals("No") ? "checked"
					: StringPool.BLANK%>>
							<label for="uncharged">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Name</p>
					<input type="text" class="form-control" id="medicalPractitionerName" value="<%=Validator.isNotNull(qualifiedNurseInfo)&&Validator.isNotNull(qualifiedNurseInfo.getQNurseName())?qualifiedNurseInfo.getQNurseName():""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Qualifications</p>
					<input type="text" class="form-control" id="medicalPractitionerQualifications" value="<%=Validator.isNotNull(qualifiedNurseInfo)&&Validator.isNotNull(qualifiedNurseInfo.getQNurseQualification())?qualifiedNurseInfo.getQNurseQualification():""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">(b) What is the ratio of qualified nurses to other employees employed in the care of the patients?</p>
					<input type="text" class="form-control" id="medicalPractitionerQualifiesNurseRatio" value="<%=Validator.isNotNull(qualifiedNurseInfo)&&Validator.isNotNull(qualifiedNurseInfo.getRatioOfQNurses())?qualifiedNurseInfo.getRatioOfQNurses():""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<p class="tab-form-sub-heading">
					Note: If the Home is a mixed Home (i.e. makes provision for maternity and non-maternity patients) 
					this question should be answered with reference to the provision made for non-maternity patient.
				</p>
			</div>
							
							
			<!-- <input id="medicalPractitionerDetailVal" type="hidden" name="medicalPractitionerDetailVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="medicalPractitionerDetailBox">
					<div class="accordion__header is-active"  id="medicalPractitionerDetail" onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
							<div>
								<span class="accordion__toggle"></span>
							</div>
							<div>
								<h2>6. Medical Practitioner/ Qualified Nurses</h2>
							</div>
							</div>
						</div>
						<div>
							<p class="accordian-employee mb-0 common-para"></p>
						</div>
					</div>		
					
					<div class="accordion__body is-active">
						<div class="row">
							
							<div class="col-md-12 d-flex justify-content-end py-4"> 
								<a href="javascript:void(0);" class="add-more-employee" id="addMedicalPractitionerDetail" onclick="addMedicalPractitionerDetail();"> <span>+ 1</span> Add More</a> 
							</div>
						</div>
					</div>
				</div>			
			</div> -->
			
			<%-- <div class="col-12 table-responsive hide addMedicalPractitionerDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addMedicalPractitionerDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Name</th>
							<th class="sub_heading text-nowrap">Qualifications</th>
							<th class="sub_heading text-nowrap">Ratio of qualified nurses</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
						<%if(Validator.isNotNull(practiceNurseInfo) && practiceNurseInfo.size()>0){
	for(MedicalFacilitiesNurseDetail practiceNurse:practiceNurseInfo){ %>
						<tr class="medical-row<%=medicalPractitionerDetailVal%>">
	<td class="sub_heading_content text-nowrap medicalPractitionerName<%=medicalPractitionerDetailVal%>"><%=Validator.isNotNull(practiceNurse)&&Validator.isNotNull(practiceNurse.getQNurseName())?practiceNurse.getQNurseName():""%></td>
	<td class="sub_heading_content text-nowrap medicalPractitionerQualifications<%=medicalPractitionerDetailVal%>"><%=Validator.isNotNull(practiceNurse)&&Validator.isNotNull(practiceNurse.getQNurseQualification())?practiceNurse.getQNurseQualification():""%></td>
	<td class="sub_heading_content text-nowrap medicalPractitionerQualifiesNurseRatio<%=medicalPractitionerDetailVal%>"><%=Validator.isNotNull(practiceNurse)&&Validator.isNotNull(practiceNurse.getRatioOfQNurses())?practiceNurse.getRatioOfQNurses():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="medicalPractitionerEditTab" onclick="medicalPractitionerDetailEditTab('<%=medicalPractitionerDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td>
		<span> <a href="javascript:void(0)"
				id="medicalPractitionerDetailDeleteDataTab"
				onclick="medicalPractitionerDetailDeleteData('<%=medicalPractitionerDetailVal%>'); deleteApplicantINfo('<%=practiceNurse.getMedicalFacilitiesNurseDetailId()%>');">
					<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
						xmlns="http://www.w3.org/2000/svg">
			        <path
							d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
							fill="#047247"></path>
			        </svg>
			</a>
		</span>
	</td>
</tr>ja
<input type="hidden" id="medicalPractitionerDetail<%=medicalPractitionerDetailVal%>" name="medicalPractitionerDetail<%=medicalPractitionerDetailVal%>" value="<%=practiceNurse.getMedicalFacilitiesNurseDetailId()%>">
	<%medicalPractitionerDetailVal=medicalPractitionerDetailVal+1;
			}} %>
					</tbody>
				</table>
			</div> --%>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">7. Is the care of the patients under the superintendence of a qualified nurse? 
					</p>
					 <div class="wizard-form-radio"> 
                        <input value="Yes" type="radio" name="patientCareUnderSuperintence" <%=qualifiedNurseInfo != null && qualifiedNurseInfo.getNursingStaffCategory().equals("Yes") ? "checked"
							: StringPool.BLANK%>> 
                        <label for="patientCareUnderSuperintence">Yes</label> 
                      </div> 
                      <div class="wizard-form-radio"> 
                        <input value="No" type="radio" name="patientCareUnderSuperintence" <%=qualifiedNurseInfo != null && qualifiedNurseInfo.getNursingStaffCategory().equals("No") ? "checked"
							: StringPool.BLANK%>> 
                        <label for="patientCareUnderSuperintence">No</label> 
                      </div> 
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Name</p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="<%=qualifiedNurseInfo!=null?qualifiedNurseInfo.getName():StringPool.BLANK %>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Qualifications</p>
					<input type="text" class="form-control" id="superintendenceNurseQualifications" name="" value="<%=qualifiedNurseInfo!=null?qualifiedNurseInfo.getQualification():StringPool.BLANK %>" placeholder=""/>	
					<!-- <p class="tab-form-sub-heading">Separate values with Enter</p> -->
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="medicalPractitionerQualifiedNurseData();" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section 
		<span class="ml-2"> 
			<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
	          	<pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
	         </svg>
		</span>
	</button>
</div>
<div class="tab-pane maternity-home hide" role="tabpanel" id="childStep7">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Maternity Home Details</p>
				<p class="tab-form-title-subtitle f2">In this section you will provide general information about the Maternity Home</p>
			</div>
		</div>
		<div class="row">
			<input id="maternityHomeDetailVal" type="hidden" name="maternityHomeDetailVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="maternityHomeDetailBox">
					<div class="accordion__header is-active"  id="maternityHomeDetail" onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
							<div>
								<span class="accordion__toggle"></span>
							</div>
							<div>
								<h2>8. Maternity Home</h2>
							</div>
							</div>
						</div>
						<div>
							<p class="accordian-employee mb-0 common-para"></p>
						</div>
					</div>		
					
					<div class="accordion__body is-active">
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Whether the person superintending the nursing of the patients is a certified nurse midwife 
									</p>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-sub-heading">(a) Name</p>
									<input type="text" class="form-control" id="maternityHomeName" value="" placeholder=""/>	
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-sub-heading">Qualifications</p>
									<input type="text" class="form-control" id="maternityHomeQualifications" value="" placeholder=""/>	
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">(b) Whether there is any person employed in attending any women in the home in child-birth 
									or in nursing any patient in the home, who is not either a duly qualified medical practitioner, 
									a certified midwife, a pupil midwife or a qualified nurse.
									</p>
									<input type="text" class="form-control" id="maternityHomeQualified" value="" placeholder=""/>
								</div>
							</div>
							<div class="col-md-12">
								<p class="tab-form-sub-heading">Note: If the Home is a mixed Home (i.e. makes provision for maternity and non-maternity patients) 
								this question should be answered with reference to the provision made for non-maternity patient
								</p>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4"> 
								<a href="javascript:void(0);" class="add-more-employee" id="addMaternityHomeDetail" onclick="addMaternityHomeDetail();"> <span>+ 1</span> Add More</a> 
							</div>
						</div>
					</div>
				</div>			
			</div>
			
			<div class="col-12 table-responsive hide addMaternityHomeDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addMaternityHomeDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Name</th>
							<th class="sub_heading text-nowrap">Qualifications</th>
							<th class="sub_heading text-nowrap">Attendant</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
						<%if(Validator.isNotNull(maternityInfo) && maternityInfo.size()>0){
	for(MedicalFacilitiesMaterHome maternityHome:maternityInfo){ %>
						<tr class="maternity-row<%=maternityHomeDetailVal%>">
	<td class="sub_heading_content maternityHomeName<%=maternityHomeDetailVal%>"><%=Validator.isNotNull(maternityHome)&&Validator.isNotNull(maternityHome.getNurseName())?maternityHome.getNurseName():""%></td>
	<td class="sub_heading_content maternityHomeQualifications<%=maternityHomeDetailVal%>"><%=Validator.isNotNull(maternityHome)&&Validator.isNotNull(maternityHome.getNurseQualification())?maternityHome.getNurseQualification():""%></td>
	<td class="sub_heading_content maternityHomeQualified<%=maternityHomeDetailVal%>"><%=Validator.isNotNull(maternityHome)&&Validator.isNotNull(maternityHome.getOtherPerson())?maternityHome.getOtherPerson():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="applicantDetailEditTab" onclick="maternityHomeEditTab('<%=maternityHomeDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="maternityDetailDeleteDataTab" onclick="maternityDetailDeleteData('<%=maternityHomeDetailVal%>'); deleteApplicantINfo('<%=maternityHome.getMedicalFacilitiesMaterHomeId()%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="medicalFacilitiesNurseStaffId<%=maternityHomeDetailVal%>" name="medicalFacilitiesNurseStaffId<%=maternityHomeDetailVal%>" value="<%=maternityHome.getMedicalFacilitiesMaterHomeId()%>">
      <%maternityHomeDetailVal=maternityHomeDetailVal+1;
			}} %>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="maternityhome();" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section 
		<span class="ml-2"> 
			<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg">
	          	<pathd="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
	         </svg>
		</span>
	</button>
</div>
<div class="tab-pane" role="tabpanel" id="childStep8">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Signature</p>
				<!-- <p class="tab-form-title-subtitle f2">In this section you will provide general information about the Maternity Home</p> -->
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">9. Does the applicant employ in connection with the home any persons of alien nationality? If so, give 
					</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Number</p>
					<input type="text" class="form-control numeric-field" id="empConnectionNum" value="<%=signatureInfo!=null?signatureInfo.getNumber():StringPool.BLANK %>" placeholder=""/>	
					<p class="tab-form-sub-heading fieldAlert hide" id="empConnectionNumValidation" style="color: red;">Only Numeric characters are allowed</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Particulars</p>
					<input type="text" class="form-control" id="empConnectionParticulars" value="<%=signatureInfo!=null?signatureInfo.getParticulars():StringPool.BLANK %>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">10. What fees are charged to patients?</p>
					<input type="text" class="form-control" id="patientFee" name="patientFee" value="<%=signatureInfo!=null?signatureInfo.getChargedFees():StringPool.BLANK %>" placeholder=""/>
					<p class="tab-form-sub-heading">Separate values with Enter</p>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">11. Address of any other Nursing Home or business in which applicant is interested,
					and the nature and extent of applicant's interest therein</p>
					<textarea rows="3" id="applicantInterestAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=signatureInfo!=null?signatureInfo.getAddressOfOtherNHome():StringPool.BLANK %></textarea>	
				</div>
			</div>
			<div class="col-md-12">
				<p class="tab-form-main-heading"> 
					I (or we) declare that the above particulars are true in every respect
				</p>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading" for="signatureDate">Date</p>
					<input type="date" class="form-control" id="signatureDate" value="<%=signatureInfo!=null&&signatureInfo.getEnteredDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(signatureInfo.getEnteredDate()):StringPool.BLANK %>"/>
				</div> 
			</div>
			<div class="col-md-12">
				<p class="pt-2 common-para">Signature</p>
				<div class="signature_texarea mb-2" id="signatureImageHolder">
				<%if(Validator.isNotNull(formNameDoc)){ %>
					<img src="<%=formNameDoc%>"  width="100" height="100"/>
				<%} %>
				</div>	
				<p class="tab-form-sub-heading mb-0">You can upload an image of your Signature</p>				
				<input type="file" id="signatureUploadBtn" hidden="" name="<portlet:namespace/>signatureUploadBtn" multiple>
				<label for="signatureUploadBtn" class="choose-sign-btn"> 
					<span class="mr-2">
						<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
							<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
						</svg>
				</span> Upload Signature
				</label>
			</div>
		</div>
	</div>
</div>