<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="/ncbj-forms/attachDocument.jsp" %>
<%
int applicantDetailVal=1;
int quotationApplicantDetailVal=1;
%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<div class="tab-pane applicant-details iso9001CertificationForm hide"
	role="tabpanel" id="childStep1">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Site Details</p>
				<p class="tab-form-title-subtitle f2">In this section you will
					provide general information about the Site</p>
			</div>
		</div>
		<div class="row">
			<input id="applicantDetailVal" type="hidden"
				name="applicantDetailVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="applicantDetailBox">
					<div class="accordion__header is-active" id="applicantDetail"
						onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
								<div>
									<span class="accordion__toggle"></span>
								</div>
								<div>
									<h2>Business Detail</h2>
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
									<p class="tab-form-main-heading">Business Address and
										Physical Location of Premises</p>
									<textarea rows="3" id="applicantAddressOne"
										class="form-control" maxlength="255"
										placeholder="Enter Address"
										style="border-radius: 5px; width: 100%"></textarea>

								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number and time of Shifts</p>
									<input type="text" class="form-control" id="applicantShifts"
										placeholder=""
										value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Types of Products/Services</p>
									<input type="text" class="form-control"
										id="applicantProductTypes" placeholder="" value="" />
								</div>
							</div>
							<div class="col-md-12 pt-3">
								<p class="tab-form-main-heading"><b>Number of effective personnel</b></p>
								<p class="tab-form-main-heading">
									The effective number of personnel consists of all
										full time personnel involved within the scope of certification
										including those working on each shift.
								</p>
								<p class="tab-form-main-heading">
									Non-permanent (seasonal, temporary and contracted
										personnel) and part time personnel who will be present at the
										time of the audit (or currently employed) shall be included in
										this number.
								</p>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Head Office</p>
									<input type="text" class="form-control"
										id="headOffices" placeholder="" value="" />
								</div> 
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of full time
										employees</p>
									<input type="text" class="form-control"
										id="noOfFullTimeEmployees" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of part time
										employees</p>
									<input type="text" class="form-control"
										id="noOfPartTimeEmployees" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contractors</p>
									<input type="text" class="form-control" id="noOfContractors"
										placeholder="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
										value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contracted
										workers</p>
									<input type="text" class="form-control"
										id="noOfContractedWorkers" placeholder="" 
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4">
								<a href="javascript:void(0);" class="add-more-employee"
									id="addApplicantDetail" onclick="addApplicantDetail();"> <span>+
										1</span> Add More
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-12 table-responsive hide addApplicantDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addApplicantDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Business Address and
								Physical Location of Premises</th>
							<th class="sub_heading text-nowrap">Number and time of
								Shifts</th>
							<th class="sub_heading text-nowrap">Types of
								Products/Services</th>
							<th class="sub_heading text-nowrap">Head Office</th>
							<th class="sub_heading text-nowrap">Number of full time
								employees</th>
							<th class="sub_heading text-nowrap">Number of part time
								employees</th>
							<th class="sub_heading text-nowrap">Number of contractors</th>
							<th class="sub_heading text-nowrap">Number of contracted
								workers</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
						<%if(Validator.isNotNull(businessDetail)&&businessDetail.size()>0){
	for(NcbjBusinessDetailAdd addBusinessDetail:businessDetail){ %>
						<tr class="applicant-row<%=applicantDetailVal%>">
	<td class="sub_heading_content applicantAddressOne<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getBusinessAddress())?addBusinessDetail.getBusinessAddress():"" %></td>
	<td class="sub_heading_content applicantShifts<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNumberAndTimeOfShift())?addBusinessDetail.getNumberAndTimeOfShift():"" %></td>
	<td class="sub_heading_content applicantProductTypes<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getTypeOfProduct())?addBusinessDetail.getTypeOfProduct():"" %></td>
	<td class="sub_heading_content headOffices<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getHeadOffices())?addBusinessDetail.getHeadOffices():"" %></td>
	<td class="sub_heading_content noOfFullTimeEmployees<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNoOfFullTimeEmployees())?addBusinessDetail.getNoOfFullTimeEmployees():"" %></td>
	<td class="sub_heading_content noOfPartTimeEmployees<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNoOfPartTimeEmployees())?addBusinessDetail.getNoOfPartTimeEmployees():"" %></td>
	<td class="sub_heading_content noOfContractors<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNoOfContractors())?addBusinessDetail.getNoOfContractors():"" %></td>
	<td class="sub_heading_content noOfContractedWorkers<%=applicantDetailVal%>"><%=Validator.isNotNull(addBusinessDetail)&&Validator.isNotNull(addBusinessDetail.getNoOfContractedWorkers())?addBusinessDetail.getNoOfContractedWorkers():"" %></td>
	
	<td><span> <a href="javascript:void(0)"
			id="applicantDetailEditTab"
			onclick="applicantDetailEditTab('<%=applicantDetailVal%>');"> <svg
					width="19" height="19" viewBox="0 0 19 19" fill="none"
					xmlns="http://www.w3.org/2000/svg"> 
		         <path
						d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
						fill="#047247"></path> 
		        </svg>
		</a>
	</span></td>
	<td><span> <a href="javascript:void(0)"
			id="applicantDetailDeleteDataTab"
			onclick="applicantDetailDeleteData('<%=applicantDetailVal%>');">
				<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
					xmlns="http://www.w3.org/2000/svg">
		        <path
						d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
						fill="#047247"></path>
		        </svg>
		</a>
	</span></td>
	<input type="hidden" id="applicantDetailValId<%=applicantDetailVal%>"
		name="applicantDetailValId<%=applicantDetailVal%>" value="<%=addBusinessDetail.getNcbjBusinessDetailAddId()%>">
</tr>
<%applicantDetailVal=applicantDetailVal+1;
	}} %>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title-subtitle f2">Preferred Dates for Your
					Certification Activities</p>
			</div>
			<!-- <h2>Preferred Dates for Your Certification Activities</h2> -->
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Stage 1</p>
					<input type="date" class="form-control" id="stage1" placeholder=""
						value="<%=Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getStageOne())?new SimpleDateFormat("yyyy-MM-dd").format(preferredDate.getStageOne()):""%>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Stage 2</p>
					<input type="date" class="form-control" id="stage2" placeholder=""
						value="<%=Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getStageTwo())?new SimpleDateFormat("yyyy-MM-dd").format(preferredDate.getStageTwo()):""%>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Surveillance audit</p>
					<input type="date" class="form-control" id="surveillanceAudit"
						placeholder="" value="<%=Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getSurveillanceAudit())?new SimpleDateFormat("yyyy-MM-dd").format(preferredDate.getSurveillanceAudit()):""%>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Recertification audit</p>
					<input type="date" class="form-control" id="recertificationAudit"
						placeholder="" value="<%=Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getRecertificationAudit())?new SimpleDateFormat("yyyy-MM-dd").format(preferredDate.getRecertificationAudit()):""%>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Pre-assessment audit</p>
					<input type="date" class="form-control" id="preassessmentAudit"
						placeholder="" value="<%=Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getPreAassessmentAudit())?new SimpleDateFormat("yyyy-MM-dd").format(preferredDate.getPreAassessmentAudit()):""%>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Any other service (s)</p>
					<input type="date" class="form-control" id="otherServices"
						placeholder="" value="<%=Validator.isNotNull(preferredDate)&&Validator.isNotNull(preferredDate.getAnyOtherService())?new SimpleDateFormat("yyyy-MM-dd").format(preferredDate.getAnyOtherService()):""%>" />
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="addCertifiPrefDateInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg">
	          	<pathd
					="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016 11.17Z" fill="#1B1917" />
	         </svg>
		</span>
	</button>
</div>

<div class="tab-pane applicant-details iso9001CertificationForm hide" role="tabpanel" id="childStep2">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Organization  Information</p>
            </div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Company Name *</p>
					<input type="text" class="form-control" id="newCompanyName" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getNewCompanyName()) ? orgDetailInfo.getNewCompanyName() : "" %>" placeholder=""/>	
					<p class="tab-form-sub-heading fieldAlert hide" id="newCompanyNameValidation" style="color: red;">Enter a Name of Company</p>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Mailing Address</p>
					<textarea rows="3" id="newMailingAddress" class="form-control" maxlength="255" 
					placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getMailingAddress()) ? orgDetailInfo.getMailingAddress() : ""%></textarea>	
					<p class="tab-form-sub-heading fieldAlert hide" id="newMailingAddressValidation" style="color: red;">Enter a valid E-mail Address</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">City</p>
					<input type="text" class="form-control" id="newCity" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCity()) ? orgDetailInfo.getCity() : ""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Postal Code</p>
					<input type="text" class="form-control" id="newPostalCode" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPostalCode()) ? orgDetailInfo.getPostalCode() : ""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Country</p>
					<input type="text" class="form-control" id="newCountry" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCountry()) ? orgDetailInfo.getCountry() : ""%>" placeholder=""/>	
				</div>
			</div>
			<!-- <div class="col-md-12">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading mb-0">
						Physical Address</p>
				</div>
			</div> -->
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Physical Address</p>
					<textarea rows="3" id="physicalAddress" class="form-control" maxlength="255" 
					placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPhysicalAddress()) ? orgDetailInfo.getPhysicalAddress() : "" %></textarea>	
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<p class="tab-form-main-heading">City</p>
					<input type="text" class="form-control" id="physicalCity" aria-describedby="physicalCity" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPhysicalCity()) ? orgDetailInfo.getPhysicalCity() : "" %>">
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<p class="tab-form-main-heading">Postal Code</p>
					<input type="text" class="form-control" id="physicalPostalCode" aria-describedby="physicalPostalCode" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPhysicalPostalCode()) ? orgDetailInfo.getPhysicalPostalCode() : "" %>">
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<p class="tab-form-main-heading">Country</p>
					<input type="text" class="form-control" id="physicalCountry" aria-describedby="physicalCountry" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPhysicalCountry()) ? orgDetailInfo.getPhysicalCountry() : "" %>">
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Head of Company</p>
					<input type="text" class="form-control" id="companyHead" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyHead()) ? orgDetailInfo.getCompanyHead() : ""%>" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Title</p>
					<input type="text" class="form-control" id="companyTitle" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyTitle()) ? orgDetailInfo.getCompanyTitle() : ""%>" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Company Contact</p>
					<input type="text" class="form-control" id="companyContact" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyContact()) ? orgDetailInfo.getCompanyContact() : ""%>" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Title</p>
					<input type="text" class="form-control" id="companyContactTitle" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyContactTitle()) ? orgDetailInfo.getCompanyContactTitle() : ""%>" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Telephone Number </p>
					<input type="text" class="form-control" id="companyTelephone" placeholder="22345678" 
					value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyTelephone()) ? orgDetailInfo.getCompanyTelephone() : ""%>" 
					oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Fax Number </p>
					<input type="text" class="form-control" id="companyFax" placeholder="22345678" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyFax()) ? orgDetailInfo.getCompanyFax() : "" %>" 
					oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">E-mail Address *</p>
					<input type="text" class="form-control" id="companyEmail" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyEmail()) ? orgDetailInfo.getCompanyEmail() : ""%>" placeholder=""/>	
					<p class="tab-form-sub-heading fieldAlert hide" id="companyEmailValidation" style="color: red;">Enter a valid E-mail Address</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Website</p>
					<input type="text" class="form-control" id="companyWebsite" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCompanyWebsite()) ? orgDetailInfo.getCompanyWebsite() : "" %>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Scope of Certification (Please include reference to design if applicable)</p>
					<input type="text" class="form-control" id="companyCertificationScope" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCertificationScope()) ? orgDetailInfo.getCertificationScope() : ""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">
							Please list and justify any clause of non-applicability to the organization's scope of certification?
						</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="certificationScope" <%=orgDetailInfo != null && orgDetailInfo.getCertificationScopeRadio().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="certificationScope">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="certificationScope" <%=orgDetailInfo != null && orgDetailInfo.getCertificationScopeRadio().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="certificationScope">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12 hide certificationScopeBox">
				<div class="form-group">
					<p class="tab-form-main-heading">Please detail</p>
					<input type="text" class="form-control" id="managementAccessibleToAuditDetail" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getManageAccessToAuditDet()) ? orgDetailInfo.getManageAccessToAuditDet() : "" %>" placeholder=""/>	
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">
							Does your organization outsource any process that will affect conformity to requirements?
						</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="outsourceProcess" id="certificationScope" <%=orgDetailInfo != null && orgDetailInfo.getOutsourceProcess().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="outsourceProcess">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="outsourceProcess" id="certificationScope" <%=orgDetailInfo != null && orgDetailInfo.getOutsourceProcess().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="outsourceProcess">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">
							Relevant Legal and Regulatory Requirements?
						</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="relevantRequirement" id="relevantRequirement" <%=orgDetailInfo != null && orgDetailInfo.getRelevantRequirement().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="relevantRequirement">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="relevantRequirement" id="relevantRequirement" <%=orgDetailInfo != null && orgDetailInfo.getRelevantRequirement().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="relevantRequirement">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12 requirementList hide">
				<div class="form-group">
					<p class="tab-form-main-heading">Please list requirements</p>
					<input type="text" class="form-control" id="relevantRequirementList" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getRelevantRequirementList()) ? orgDetailInfo.getRelevantRequirementList() : "" %>" placeholder=""/>	
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">
							Are all areas and processes within the Management System accessible to the audit team? 
						</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="managementAccessibleToAudit" id="managementAccessibleToAudit" <%=orgDetailInfo != null && orgDetailInfo.getManagementAccessToAudit().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="managementAccessibleToAudit">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="managementAccessibleToAudit" id="managementAccessibleToAudit" <%=orgDetailInfo != null && orgDetailInfo.getManagementAccessToAudit().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="managementAccessibleToAudit">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12 hide managementAccessibleToAuditBox">
				<div class="form-group">
					<p class="tab-form-main-heading">Please detail</p>
					<input type="text" class="form-control" id="pleaseManageDetail" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getPleaseManageDetail()) ? orgDetailInfo.getPleaseManageDetail() : "" %>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Please list and submit key activities related to core processes /processes needed and their 
					interactions(i.e. sequence of interaction of processes)</p>
					<input type="text" class="form-control" id="keyActivity" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getKeyActivity()) ? orgDetailInfo.getKeyActivity() : "" %>" placeholder=""/>	
				</div>
			</div>
			
			<div class="col-md-12">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading mb-0">Certification(s) Desired</p>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<div class="wizard-form-radio">
							 <input value="ISO 9001" type="radio" name="desiredCertification"<%=orgDetailInfo != null && orgDetailInfo.getDesiredCertification().equals("ISO 9001") ? "checked"
							: StringPool.BLANK%>/> <label
								for="desiredCertification">ISO 9001</label>
						</div>
						<div class="wizard-form-radio">
							 <input value="Transfer to NCBJ" type="radio" name="desiredCertification"<%=orgDetailInfo != null && orgDetailInfo.getDesiredCertification().equals("Transfer to NCBJ") ? "checked"
							: StringPool.BLANK%>/> <label
								for="desiredCertification">Transfer to NCBJ</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12 transfer9001Reason hide mt-0">
				<div class="form-group">
					<p class="tab-form-sub-heading">Reason for transfer</p>
					<input type="text" class="form-control" id="transferReasonTwo" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getTransferReason()) ? orgDetailInfo.getTransferReason() : "" %>">
				</div>
			</div> 
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">
							Surveillance Schedule Desired 
						</p>
						<div class="wizard-form-radio">
							<input value="Annual" type="radio" name="surveillanceSchedule" <%=orgDetailInfo != null && orgDetailInfo.getSurveillanceSchedule().equals("Annual") ? "checked"
							: StringPool.BLANK%>/> <label
								for="surveillanceSchedule">Annual</label>
						</div>
						<div class="wizard-form-radio">
							<input value="Semi-Annual" type="radio" name="surveillanceSchedule" <%=orgDetailInfo != null && orgDetailInfo.getSurveillanceSchedule().equals("Semi-Annual") ? "checked"
							: StringPool.BLANK%>/> <label
								for="surveillanceSchedule">Semi-Annual</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading mb-0"><b>Existing management system information</b></p>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">
							Does the company have a certified Management System? 
						</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="certifiedManagement" <%=orgDetailInfo != null && orgDetailInfo.getCertifiedManagement().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="certifiedManagement">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="certifiedManagement" <%=orgDetailInfo != null && orgDetailInfo.getCertifiedManagement().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="certifiedManagement">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Indicate Standard</p>
					<input type="text" class="form-control" id="indicateStandard" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getIndicateStandard()) ? orgDetailInfo.getIndicateStandard() : "" %>">
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">
							Has it been certified by an accredited Certification Body? 
						</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="certifiedAccreditedCertification" <%=orgDetailInfo != null && orgDetailInfo.getCertifiedAccreditedCerti().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="certifiedAccreditedCertification">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="certifiedAccreditedCertification" <%=orgDetailInfo != null && orgDetailInfo.getCertifiedAccreditedCerti().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="certifiedAccreditedCertification">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Name of Certification Body</p>
					<input type="text" class="form-control" id="ceritificationBodyName" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getCeritificationBodyName()) ? orgDetailInfo.getCeritificationBodyName() : ""%>">
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading mb-0">Use of Consultancy Services Information</p>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-sub-heading">
							Has your company used any consulting services to assist in the development and/or implementation of your Management System? 
						</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="companyUsedConsultingService" <%=orgDetailInfo != null && orgDetailInfo.getCompanyUsedConsulting().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="companyUsedConsultingService">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="companyUsedConsultingService" <%=orgDetailInfo != null && orgDetailInfo.getCompanyUsedConsulting().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="companyUsedConsultingService">No</label>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row companyUsedConsultingServiceBox hide">
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-sub-heading">Consulting Firm</p>
					<input type="text" class="form-control" id="consultingFirm" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getConsultingFirm()) ? orgDetailInfo.getConsultingFirm() : "" %>">
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Consultant(s) email</p>
					<input type="text" class="form-control" id="consultant" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getConsultant()) ? orgDetailInfo.getConsultant() : ""%>">
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Telephone</p>
					<input type="text" class="form-control" id="telephone" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getTelephone()) ? orgDetailInfo.getTelephone() : ""%>" 
					oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
				</div>
			</div>
			<%-- <div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Email</p>
					<input type="text" class="form-control" id="email" placeholder="" value="<%=Validator.isNotNull(orgDetailInfo) && Validator.isNotNull(orgDetailInfo.getEmail()) ? orgDetailInfo.getEmail() : ""%>">
				</div>
			</div> --%>
		</div>
	</div>
	<button type="button" id="saveComName"
		onclick="organizationdetailInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                        <pathd ="m6.00016="" 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd> 
                       </svg>
		</span>
	</button>
</div>
<div class="tab-pane applicant-details iso9001CertificationForm hide" role="tabpanel" id="childStep3">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2 additional-location hide">(Section II) Additional Locations or Multi-Site</p>
				<p class="tab-form-title f2 section-two-signature hide">Singnature</p>
            </div>
		</div>
		<div class="row additional-location hide">
			<div class="col-md-12">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading mb-0">Please tick appropriate
						box</p>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">Sites have a contractual or
							legal link with central office</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="centralOfficeLink" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getCentralOfficeLink().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="centralOfficeLink">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="centralOfficeLink" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getCentralOfficeLink().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="centralOfficeLink">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">Sites are subject to a common
							management system</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="commonManagementSystem" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getCommonManagementSystem().equals("Yes") ? "checked"
							: StringPool.BLANK%>/>
							<label for="commonManagementSystem">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="commonManagementSystem" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getCommonManagementSystem().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="commonManagementSystem">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">Processes at the sites are
							substantially of the same kind</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="substantiallySameProcess" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getSubstantiallySameProcess().equals("Yes") ? "checked"
							: StringPool.BLANK%>/>
							<label for="substantiallySameProcess">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="substantiallySameProcess" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getSubstantiallySameProcess().equals("No") ? "checked"
							: StringPool.BLANK%>/>
							<label for="substantiallySameProcess">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">Sites operate to similar
							methods and procedure</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="siteSimilarMethod" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getSiteSimilarMethod().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="siteSimilarMethod">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="siteSimilarMethod" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getSiteSimilarMethod().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="siteSimilarMethod">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">Sites are under surveillance
							and internal audit by the central office</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="siteUnderAudit" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getSiteUnderAudit().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="siteUnderAudit">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="siteUnderAudit" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getSiteUnderAudit().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="siteUnderAudit">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">Central office has the right
							to require site corrective actions</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="siteCorrectiveRight" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getSiteCorrectiveRight().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="siteCorrectiveRight">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="siteCorrectiveRight" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getSiteCorrectiveRight().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="siteCorrectiveRight">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading">Central office has authority
							to initiate organizational changes</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="changesAuthority" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getChangesAuthority().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="changesAuthority">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="changesAuthority" <%=ncbjAdditionalLocation != null && ncbjAdditionalLocation.getChangesAuthority().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="changesAuthority">No</label>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Name *</p>
					<input type="text" class="form-control" id="signatureName" placeholder="" value="<%=Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getSignatureName())?ncbjAdditionalLocation.getSignatureName():"" %>" />
					<p class="tab-form-sub-heading fieldAlert hide" id="signatureNameValidation" style="color: red;">Enter a Name </p>
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Position</p>
					<input type="text" class="form-control" id="position" value="<%=Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getPosition())?ncbjAdditionalLocation.getPosition():""%>" />
				</div>
			</div>
			<div class="col-md-12">
				<p class="pt-2 common-para">Signature of Applicant</p>
				<div class="signature_texarea mb-2" id="newSignature">
				<%if(Validator.isNotNull(signUrl)){ %>
				<img src="<%=signUrl%>"  width="100" height="100"/>
				<%} %>
				</div>
				<input type="file" id="newSignatureBtn" hidden="" name="<portlet:namespace/>newSignatureBtn"> 
					<label for="newSignatureBtn" class="choose-sign-btn">
					<span class="mr-2"> <svg width="14" height="17"
							viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
	                        <path
								d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
								fill="#ffffff"></path> 
	                    </svg>
				</span> Upload Signature
				</label>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Date</p>
					<input type="date" class="form-control" id="date" value="<%=Validator.isNotNull(ncbjAdditionalLocation)&&Validator.isNotNull(ncbjAdditionalLocation.getDate())?new SimpleDateFormat("yyyy-MM-dd").format(ncbjAdditionalLocation.getDate()):"" %>" />
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName"
		onclick="signaturedetailInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
                        <pathd ="m6.00016="" 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd> 
                       </svg>
		</span>
	</button>
</div>
<!-- QUAOTATION FORM -->
<div class="tab-pane iso9001CertificationForm hide quotation-details" role="tabpanel" id="childStep4">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Quotation Form</p>
            </div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Name of organization *</p>
					<input type="text" class="form-control" id="nameOfOrganization" value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getNameOfOrganization())?ncbjOrganizationDetail.getNameOfOrganization():""%>" placeholder=""  oninput="quotationdetailInfo();"/>	
					<p class="tab-form-sub-heading fieldAlert hide" id="nameOfOrganizationValidation" style="color: red;">Enter a Name of organization</p>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Address</p>
					<textarea rows="3" id="address" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getAddress())?ncbjOrganizationDetail.getAddress():"" %></textarea>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Telephone number</p>
					<input type="text" class="form-control" id="telephoneNumber" value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getTelephoneNumber())?ncbjOrganizationDetail.getTelephoneNumber():""%>" placeholder="" 
					oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>Fax number</p>
					<input type="text" class="form-control" id="faxNumber" 
					value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getFaxNumber())?ncbjOrganizationDetail.getFaxNumber():""%>" placeholder=""
					oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>E-mail address *</p>
					<input type="text" class="form-control" id="emailAddress" value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getEmailAddress())?ncbjOrganizationDetail.getEmailAddress():""%>" placeholder=""  oninput="quotationdetailInfo();" />
					<p class="tab-form-sub-heading fieldAlert hide" id="emailAddressValidation" style="color: red;">Enter a valid E-mail Address</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Head of Organization</p>
					<input type="text" class="form-control" id="headOfOrganization" value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getHeadOfOrganization())?ncbjOrganizationDetail.getHeadOfOrganization():""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.</span>Position</p>
					<input type="text" class="form-control" id="positionFirst" value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getPosition())?ncbjOrganizationDetail.getPosition():""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Contact Person</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Name</p>
					<input type="text" class="form-control" id="contactPersonName" value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonName())?ncbjOrganizationDetail.getContactPersonName():""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Email address</p>
					<input type="text" class="form-control" id="contactPersonEmail" value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonEmailAddress())?ncbjOrganizationDetail.getContactPersonEmailAddress():""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.</span>Position</p>
					<input type="text" class="form-control" id="positionSecond" value="<%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonPosition())?ncbjOrganizationDetail.getContactPersonPosition():""%>" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>Which management system(s) has your organization implemented or is in the process of implementing?</p>
					<textarea rows="3" id="managementSystem" class="form-control" maxlength="255" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getManagementSystem())?ncbjOrganizationDetail.getManagementSystem():""%></textarea>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10a.</span>Have you determined the scope of the certification which you are seeking?</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="orgDeterminedTheScope" <%=ncbjOrganizationDetail != null && ncbjOrganizationDetail.getDeterminedTheScope().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label for="">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="orgDeterminedTheScope" <%=ncbjOrganizationDetail != null && ncbjOrganizationDetail.getDeterminedTheScope().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label for="">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group hide pleaseStateTheScope"><p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10b.</span>Please state the scope along with a corporate brochure or relevant documents defining the nature and scope of your operations.</p>
					<textarea rows="3" id="pleaseStateTheScope" class="form-control" maxlength="255" style="border-radius: 5px; width: 100%" placeholder="State the scope"><%=Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getPleaseStageTheScope())?ncbjOrganizationDetail.getPleaseStageTheScope():""%></textarea> 
					<div class="supporting-document-card my-3">
						<div class="row">
							<div class="col-md-12">
								<div class="supporting-document-card-wrapper">
									<div class="left">
										<p class="supporting-document-card-upper-heading">Attach
											File</p>
									</div>
									<div class="right">
										<input type="file" id="operationScope" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>operationScope">
										<label class="custom-upload" for="operationScope"> <span
											class="mr-2"> <svg width="14" height="17"
													viewBox="0 0 14 17" fill="none"
													xmlns="http://www.w3.org/2000/svg">
                                        <path
														d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
														fill="#047247"></path>
                                    </svg>
										</span>Upload
										</label>
									</div>
								</div>
								<span class="attach-detailed-overview"><%=(Validator.isNotNull(docBrochure))?docBrochure:""%></span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span>Please indicate the size of Organization in terms of </p>
					<p class="tab-form-main-heading"><b>Note: All sites must have a contractual or legal link with the central Office</b></p>
				</div>
			</div>
		</div>
		<div class="row">
			<input id="quotationApplicantDetailVal" type="hidden"
				name="quotationApplicantDetailVal" value="1">
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="quotationApplicantDetailBox">
					<div class="accordion__header is-active" id="quotationApplicantDetail"
						onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
								<div>
									<span class="accordion__toggle"></span>
								</div>
								<div>
									<h2>Business Detail</h2>
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
									<p class="tab-form-main-heading">Business Address and
										Physical Location of Premises</p>
									<textarea rows="3" id="quotationApplicantAddressOne"
										class="form-control" maxlength="255"
										placeholder="Enter Address"
										style="border-radius: 5px; width: 100%"></textarea>

								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Types of Products/Services</p>
									<input type="text" class="form-control"
										id="quotationApplicantProductTypes" placeholder="" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number and time of Shifts</p>
									<input type="text" class="form-control" id="quotationApplicantShifts"
										placeholder=""
										value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Employee Numbers</p>
									<input type="text" class="form-control" id="quotationEmpNum"
										placeholder=""
										value="" />
								</div>
							</div>
							
							<div class="col-md-12 pt-3">
								<p class="tab-form-main-heading"><b>Number of effective personnel</b></p>
								<p class="tab-form-main-heading">
									The effective number of personnel consists of all
										full time personnel involved within the scope of certification
										including those working on each shift.
								</p>
								<p class="tab-form-main-heading">
									Non-permanent (seasonal, temporary and contracted
										personnel) and part time personnel who will be present at the
										time of the audit (or currently employed) shall be included in
										this number.
								</p>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Head Office</p>
									<input type="text" class="form-control"
										id="quotationHeadOffices" placeholder="" value="" />
								</div> 
							</div> 
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of full time
										employees</p>
									<input type="text" class="form-control"
										id="quotationNoOfFullTimeEmployees" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of part time
										employees</p>
									<input type="text" class="form-control"
										id="quotationNoOfPartTimeEmployees" placeholder="" 
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contractors</p>
									<input type="text" class="form-control" id="quotationNoOfContractors"
										placeholder="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
										value="" />
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contracted
										workers</p>
									<input type="text" class="form-control"
										id="quotationNoOfContractedWorkers" placeholder="" 
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" />
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4">
								<a href="javascript:void(0);" class="add-more-employee"
									id="addQuotationApplicantDetail" onclick="addQuotationApplicantDetail();"> <span>+
										1</span> Add More
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-12 table-responsive hide addQuotationApplicantDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addQuotationApplicantDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Business Address and
								Physical Location of Premises</th>
							<th class="sub_heading text-nowrap">Types of
								Products/Services</th>
							<th class="sub_heading text-nowrap">Number and time of
								Shifts</th>
							<th class="sub_heading text-nowrap">Employee Numbers</th>
							<th class="sub_heading text-nowrap">Head Office</th>
							<th class="sub_heading text-nowrap">Number of full time
								employees</th>
							<th class="sub_heading text-nowrap">Number of part time
								employees</th>
							<th class="sub_heading text-nowrap">Number of contractors</th>
							<th class="sub_heading text-nowrap">Number of contracted
								workers</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
						
					<%if(Validator.isNotNull(quotationBusinessDetail)&&quotationBusinessDetail.size()>0){
		for(NcbjBusinessDetail quotationbusiness:quotationBusinessDetail){ %>
		<tr class="quotation-applicant-row<%=quotationApplicantDetailVal%>">
	<td class="sub_heading_content quotationApplicantAddressOne<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationAddressOne())?quotationbusiness.getQuotationAddressOne():""%></td>
	<td class="sub_heading_content quotationApplicantShifts<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationApplicantShifts())?quotationbusiness.getQuotationApplicantShifts():""%></td>
	<td class="sub_heading_content quotationApplicantProductTypes<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationProductTypes())?quotationbusiness.getQuotationProductTypes():""%></td>
	<td class="sub_heading_content quotationEmpNum<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationEmpNum())?quotationbusiness.getQuotationEmpNum():""%></td>
	<td class="sub_heading_content quotationHeadOffices<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationHeadOffices())?quotationbusiness.getQuotationHeadOffices():""%></td>
	<td class="sub_heading_content quotationNoOfFullTimeEmployees<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationFullTimeEmploy())?quotationbusiness.getQuotationFullTimeEmploy():""%></td>
	<td class="sub_heading_content quotationNoOfPartTimeEmployees<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationPartTimeEmploy())?quotationbusiness.getQuotationPartTimeEmploy():""%></td>
	<td class="sub_heading_content quotationNoOfContractors<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationContractors())?quotationbusiness.getQuotationContractors():""%></td>
	<td class="sub_heading_content quotationNoOfContractedWorkers<%=quotationApplicantDetailVal%>">
	<%=Validator.isNotNull(quotationbusiness)&&Validator.isNotNull(quotationbusiness.getQuotationContractedWorker())?quotationbusiness.getQuotationContractedWorker():""%></td>
	
	<td><span> <a href="javascript:void(0)"
			id="quotationApplicantDetailEditTab"
			onclick="quotationApplicantDetailEditTab('<%=quotationApplicantDetailVal%>');"> <svg
					width="19" height="19" viewBox="0 0 19 19" fill="none"
					xmlns="http://www.w3.org/2000/svg"> 
		         <path
						d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
						fill="#047247"></path> 
		        </svg>
		</a>
	</span></td>
	<td><span> <a href="javascript:void(0)"
			id="quotationApplicantDetailDeleteDataTab"
			onclick="quotationApplicantDetailDeleteDataTab('<%=quotationApplicantDetailVal%>');">
				<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
					xmlns="http://www.w3.org/2000/svg">
		        <path
						d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
						fill="#047247"></path>
		        </svg>
		</a>
	</span></td>
	<input type="hidden" id="quotationApplicantDetailValId<%=quotationApplicantDetailVal%>"name="quotationApplicantDetailValId<%=quotationApplicantDetailVal%>" value="<%=quotationbusiness.getNcbjBusinessDetailId()%>">
</tr>
<%quotationApplicantDetailVal=quotationApplicantDetailVal+1;
	}} %>						
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-main-heading"><b>This information will allow the NCBJ to provide a quotation 
				for certification based on the information provided. In order to satisfy accreditation body requirements 
				and ensure a successful audit, the NCBJ is required to confirm the organization's status, preparation for 
				certification and the time required for the certification audits.</b></p>
			</div>
		</div>
	</div>
</div>

<script>
$(document).on('change', '#newSignatureBtn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#newSignature");
    var form1a_image_holder = $("#newSignaturePreview");
    image_holder.empty();
    form1a_image_holder.empty();
    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
      if (typeof(FileReader) != "undefined") {
        //loop for each file selected for uploaded.
        for (var i = 0; i < countFiles; i++) 
        {
          var reader = new FileReader();
          reader.onload = function(e) {
            $("<img />", {
              "src": e.target.result,
              "class": "thumb-image",
              "height":"100",
              "width":"100"
            }).appendTo(image_holder);
            $("<img />", {
                "src": e.target.result,
                "class": "thumb-image",
                "height":"100",
                "width":"100"
              }).appendTo(form1a_image_holder);
          }
          image_holder.show();
          reader.readAsDataURL($(this)[0].files[i]);
        }
      } else {
        alert("This browser does not support FileReader.");
      }
    } else {
      alert("Pls select only images");
    }
  });

$("input[name='certificationScope']").change(function() {
   if($(this).val() == "Yes"){
      $(".certificationScopeBox, .certificationScopeBoxPreview").removeClass("hide");
   }else{
	   $(".certificationScopeBox, .certificationScopeBoxPreview").addClass("hide");
   }
});
$("input[name='relevantRequirement']").change(function() {
	   if($(this).val() == "Yes"){
	      $(".requirementList, .requirementListPreview").removeClass("hide");
	   }else{
		   $(".requirementList, .requirementListPreview").addClass("hide");
	   }
	});
$("input[name='managementAccessibleToAudit']").change(function() {
	   if($(this).val() == "Yes"){
	      $(".managementAccessibleToAuditBox, .managementAccessibleToAuditBoxPreview").addClass("hide");
	   }else{
		   $(".managementAccessibleToAuditBox, .managementAccessibleToAuditBoxPreview").removeClass("hide");
	   }
	});
$("input[name='desiredCertification']").change(function() {
	   if($(this).val() == "Transfer to NCBJ"){
	      $(".transfer9001Reason, .transfer9001ReasonPreview").addClass("hide");
	   }else{
		   $(".transfer9001Reason, .transfer9001ReasonPreview").removeClass("hide");
	   }
	});	
$("input[name='companyUsedConsultingService']").change(function() {
   if($(this).val() == "Yes"){
      $(".companyUsedConsultingServiceBox, .companyUsedConsultingServiceBoxPreview").removeClass("hide");
   }else{
	   $(".companyUsedConsultingServiceBox, .companyUsedConsultingServiceBoxPreview").addClass("hide");
   }
});

	function addNumOfEffectedPersonalInfo(){
		noOfFullTimeEmployees =$("#noOfFullTimeEmployees").val();
		noOfPartTimeEmployees = $("#noOfPartTimeEmployees").val();
		department = $("#headOffice").val();
		noOfContractors = $("#noOfContractors").val();
		noOfContractedWorkers = $("#noOfContractedWorkers").val();
		ncbjApplicationId=$("#ncbjApplicationId").val();
		effectiveApplicantDetailVal = $("#effectiveApplicantDetailVal").val();
		$.ajax({
			type : "POST",
			url : "${numOfEffectedPersonalInfoUrl}",
			data : {
				"<portlet:namespace/>noOfFullTimeEmployees" : noOfFullTimeEmployees,
				"<portlet:namespace/>noOfPartTimeEmployees" : noOfPartTimeEmployees,
				"<portlet:namespace/>department" : department,
				"<portlet:namespace/>noOfContractors" : noOfContractors,
				"<portlet:namespace/>noOfContractedWorkers" : noOfContractedWorkers,
				"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				"<portlet:namespace/>count" : effectiveApplicantDetailVal,
			},
			async : false,
			success : function(data) {
			var result=data.APP_DATA;
			$("#effectiveApplicantDetailVal"+result["count"]).val(result["effectiveApplicantDetailVal"]);
			},
			error : function(data) {
			},
		});
	}
	function addCertifiPrefDateInfo(theSaveandContinue){
		stageOne =$("#stage1").val();
		stageTwo = $("#stage2").val();
		surveillanceAudit = $("#surveillanceAudit").val();
		recertificationAudit = $("#recertificationAudit").val();
		preassessmentAudit = $("#preassessmentAudit").val();
		otherServices = $("#otherServices").val();
		ncbjApplicationId=$("#ncbjApplicationId").val();
		/* effectiveApplicantDetailVal = $("#effectiveApplicantDetailVal").val(); */
		$.ajax({
			type : "POST",
			url : "${certificationPreferredDateInfoUrl}",
			data : {
				"<portlet:namespace/>stageOne" : stageOne,
				"<portlet:namespace/>stageTwo" : stageTwo,
				"<portlet:namespace/>surveillanceAudit" : surveillanceAudit,
				"<portlet:namespace/>recertificationAudit" : recertificationAudit,
				"<portlet:namespace/>preassessmentAudit" : preassessmentAudit,
				"<portlet:namespace/>otherServices" : otherServices,
				"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				
			},
			success : function(data) {
				if(!theSaveandContinue){
					nextForm();
					addApplicantDetail();
				}	
			},
			error : function(data) {
			},
		});
	}
	function addOrganizationInfo(){
		nameOfOrganization =$("#nameOfOrganization").val();
		address = $("#address").val();
		telephoneNumber = $("#telephoneNumber").val();
		faxNumber = $("#faxNumber").val();
		emailAddress = $("#emailAddress").val();
		headOfOrganization = $("#headOfOrganization").val();
		positionFirst = $("#positionFirst").val();
		contactPersonName = $("#contactPersonName").val();
		contactPersonEmail = $("#contactPersonEmail").val();
		positionSecond = $("#positionSecond").val();
		managementSystem = $("#managementSystem").val();
		orgDeterminedTheScope=$("input[name='orgDeterminedTheScope']:checked").val();
		pleaseStateTheScope=$("#pleaseStateTheScope").val();
		ncbjApplicationId=$("#ncbjApplicationId").val();
		/* cetSuspensionDetailVal = $("#cetSuspensionDetailVal").val(); */
		$.ajax({
			type : "POST",
			url : "${orgInformationUrl}",
			data : {
				"<portlet:namespace/>nameOfOrganization" : nameOfOrganization,
				"<portlet:namespace/>address" : address,
				"<portlet:namespace/>telephoneNumber" : telephoneNumber,
				"<portlet:namespace/>faxNumber" : faxNumber,
				"<portlet:namespace/>emailAddress" : emailAddress,
				"<portlet:namespace/>headOfOrganization" : headOfOrganization,
				"<portlet:namespace/>positionFirst" : positionFirst,
				"<portlet:namespace/>contactPersonName" : contactPersonName,
				"<portlet:namespace/>contactPersonEmail" : contactPersonEmail,
				"<portlet:namespace/>positionSecond" : positionSecond,
				"<portlet:namespace/>managementSystem" : managementSystem,
				"<portlet:namespace/>orgDeterminedTheScope" : orgDeterminedTheScope,
				"<portlet:namespace/>pleaseStateTheScope" : pleaseStateTheScope,
				"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
				/* "<portlet:namespace/>count" : cetSuspensionDetailVal, */
			},
			success : function(data) {
				uploadDocuments('operationScope','Scope of the Certification','','The scope along with a corporate brochure or relevant documents defining the nature and scope of your operations');
			},
			error : function(data) {
			},
		});
	}

	function quotationdetailInfo(){
		nameOfOrganization = $("#nameOfOrganization").val();
		emailAddress = $("#emailAddress").val();
		iso9001Certification = $("#iso9001CertificationValue").val();
    	if(iso9001Certification == "Transfer to NCBJ"){
    		$("#ncbjFormsFieldset #save-continue").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
    	}else{
    		if (nameOfOrganization.trim() !== "" && emailAddress.trim() !== "") {
  			  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  			 if(emailAddress.match(mailformat)){ 
  				  $("#ncbjFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
  				  $("#emailAddressValidation").addClass("hide");
  				}else{
  					$("#ncbjFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
  					$("#emailAddressValidation").removeClass("hide");
  					$("#emailAddressValidation").text("Please enter valid E-mail address");
  				}
  		  } else {
  			  $("#ncbjFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
  		  }
    	}
	}

	function addBusinessDetail(){
		businessDetailVal = $("#businessDetailVal").val();
		
		applicantAddressOne = $("#applicantAddressOne").val();
		applicantShifts = $("#applicantShifts").val();
		applicantProductTypes = $("#applicantProductTypes").val();
		headOffices = $("#headOffices").val();
		noOfFullTimeEmployees = $("#noOfFullTimeEmployees").val();
		noOfPartTimeEmployees = $("#noOfPartTimeEmployees").val();
		noOfContractors = $("#noOfContractors").val();
		noOfContractedWorkers =$("#noOfContractedWorkers").val();

		if(applicantAddressOne != "" || applicantShifts != "" || applicantProductTypes !="" || headOffices !="" || noOfFullTimeEmployees !="" || noOfPartTimeEmployees !="" || noOfContractors !="" || noOfContractedWorkers !=""){
			$(".addBusinessDetailTableBox").removeClass("hide");

			$.ajax({
				type : "POST",
				url : "${addBusinessDetailInfoUrl}",
				data : {
					"<portlet:namespace/>businessDetailVal" : businessDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addBusinessDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */	
					$(".applicantAddressOne" + businessDetailVal).append(applicantAddressOne);
					$(".applicantShifts" + businessDetailVal).append(applicantShifts);
					$(".applicantProductTypes" + businessDetailVal).append(applicantProductTypes);
					$(".headOffices" + businessDetailVal).append(headOffices);
					$(".noOfFullTimeEmployees" + businessDetailVal).append(noOfFullTimeEmployees);
					$(".noOfPartTimeEmployees" + businessDetailVal).append(noOfPartTimeEmployees);
					$(".noOfContractors" + businessDetailVal).append(noOfContractors);
					$(".noOfContractedWorkers" + businessDetailVal).append(noOfContractedWorkers);
					
					/* VALUE INCREAMENT */
					/* addLicBranchDetailCarRentalFormNine(); */
					businessDetailVal++;
					$("#businessDetailVal").val(businessDetailVal);
					
					/* RESET FORM FIELDS */
					$("#applicantAddressOne").val("");
					$("#applicantShifts").val("");
					$("#applicantProductTypes").val("");
					$("#headOffices").val("");
					$("#noOfFullTimeEmployees").val("");
					$("#noOfPartTimeEmployees").val("");
					$("#noOfContractors").val("");
					$("#noOfContractedWorkers").val("");
				}
			});
		}else{
			$("#applicantAddressOne").focus();
		}
	}
	</script>