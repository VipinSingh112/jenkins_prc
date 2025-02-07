<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page
	import="com.nbp.ncbj.application.form.service.service.NcbjSectionOneLocalServiceUtil"%>
<%@page
	import="com.nbp.ncbj.application.form.service.model.NcbjSectionOne"%>
<%@ include file="/ncbj-forms/attachDocument.jsp" %>
<%
String numberOfHaccp="";
String docConsentLic="";
String hazardAnalysisDoc="";
int companyDetailVal=1; 
int sectionOneCompanyDetailVal=1; 
int productServicesDetailVal=1; 
int employeesNumberDetailVal=1; 
int workPatternDetailVal=1; 
int haccpNumberDetailVal=1; 
int hazardAnalysisDetailVal=1; 
int licenceListDetailVal=1; 

List<DLFileEntry> fileEntry = new ArrayList<DLFileEntry>();
DLFolder supportingDocumentsParentFolder = null;
DLFolder supportingDocumentSubFolderManagment = null;
 try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "NCBJ Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(ncbjApplicationId));
	} catch (Exception e) {
		e.printStackTrace();
	}

%>
<div class="tab-pane newForm22000 hide" role="tabpanel" id="childStep6">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Section I</p>
			</div>
		</div>
		<div class="row"></div>
		<div class="row">
			<input id="sectionOneCompanyDetailVal" type="hidden"
				name="sectionOneCompanyDetailVal" value="1">

			<div class="col-md-12">
				<div class="accordion secured-accordian" id="sectionOneCompanyDetailBox">
					<div class="accordion__header is-active" id="sectionOneCompanyDetail"
						onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
								<div>
									<span class="accordion__toggle"></span>
								</div>
								<div>
									<h2>Company Detail</h2>
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
									<p class="tab-form-main-heading">Company Name or Head
										Office</p>
									<input type="text" class="form-control" id="companyNameTwo"
										placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getCompanyName()) ? newCompany.getCompanyName() : "" %>"/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Company Address</p>
									<textarea rows="3" id="companyAddressTwo" class="form-control"
										maxlength="255" placeholder="Enter Address"
										style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getCompanyAddress()) ? newCompany.getCompanyAddress() : "" %></textarea>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Head of Company Name</p>
									<input type="text" class="form-control" id="sectionOneCompName"
										placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getHeadOfCompany()) ? newCompany.getHeadOfCompany() : "" %>"/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Job Title</p>
									<input type="text" class="form-control"
										id="sectionOneCompJobTitle" placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getJobTitleOne()) ? newCompany.getJobTitleOne() : "" %>"/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">E-Mail Address</p>
									<input type="text" class="form-control"
										id="sectionOneCompEmailAddr" placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getCompanyEmailOne()) ? newCompany.getCompanyEmailOne() : "" %>"/>
									<p class="tab-form-sub-heading fieldAlert hide"
										id="applicantNameValidation" style="color: red;">Please
										Enter Name</p>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Telephone Number</p>
									<input type="text" class="form-control"
										id="sectionOneCompTelNum" placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getCompanyNumOne()) ? newCompany.getCompanyNumOne() : "" %>"
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
									<p class="tab-form-sub-heading fieldAlert hide"
										id="applicantNameValidation" style="color: red;">Please
										Enter Name</p>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Contact Name</p>
									<input type="text" class="form-control"
										id="sectOneCompContactName" placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getContactName()) ? newCompany.getContactName() : "" %>"/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Job Title</p>
									<input type="text" class="form-control"
										id="sectOneCompJobTitle" placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getJobTitleTwo()) ? newCompany.getJobTitleTwo() : "" %>"/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">E-Mail Address</p>
									<input type="text" class="form-control" id="sectOneCompEmail"
										placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getCompanyEmailTwo()) ? newCompany.getCompanyEmailTwo() : "" %>"/>
									<p class="tab-form-sub-heading fieldAlert hide"
										id="applicantNameValidation" style="color: red;">Please
										Enter Name</p>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Telephone Number</p>
									<input type="text" class="form-control" id="sectOneCompTeleNumber"
										placeholder="" value="<%=Validator.isNotNull(newCompany) && Validator.isNotNull(newCompany.getCompanyNumTwo()) ? newCompany.getCompanyNumTwo() : "" %>" 
										oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4 additional-tab-form-two">
								<a href="javascript:void(0);" class="add-more-employee"
									id="addSectionOneCompanyDetail" onclick="addSectionOneCompanyDetail();"> <span>+
										1</span> Add for additional sites here
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div
				class="col-12 table-responsive additional-tab-form-two">
				<table class="table table-bordered mb-3 addSectionOneCompanyDetailTableBox hide">
					<tbody class="addSectionOneCompanyDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Company Name or Head
								Office</th>
							<th class="sub_heading text-nowrap">Company Address</th>
							<th class="sub_heading text-nowrap">Head of Company Name</th>
							<th class="sub_heading text-nowrap">Job Title</th>
							<th class="sub_heading text-nowrap">E-Mail Address</th>
							<th class="sub_heading text-nowrap">Telephone Number</th>
							<th class="sub_heading text-nowrap">Contact Name</th>
							<th class="sub_heading text-nowrap">Job Title</th>
							<th class="sub_heading text-nowrap">E-Mail Address</th>
							<th class="sub_heading text-nowrap">Telephone Number</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
	<%if(Validator.isNotNull(companyDetailTwo)&&companyDetailTwo.size()>0){
	for(NcbjCompanyDetailGen addCompanyTwo:companyDetailTwo){
		if(Validator.isNotNull(addCompanyTwo.getCompanyName())&&Validator.isNotNull(addCompanyTwo.getCompanyAddress())&&Validator.isNotNull(addCompanyTwo.getHeadOfCompany())&&Validator.isNotNull(addCompanyTwo.getJobTitleOne())&&Validator.isNotNull(addCompanyTwo.getCompanyEmailOne())&&Validator.isNotNull(addCompanyTwo.getCompanyNumOne())&&Validator.isNotNull(addCompanyTwo.getContactName())&&Validator.isNotNull(addCompanyTwo.getJobTitleTwo())&&Validator.isNotNull(addCompanyTwo.getCompanyEmailTwo())&&Validator.isNotNull(addCompanyTwo.getCompanyNumTwo())){%>
<tr class="section-one-company-detail-row<%=sectionOneCompanyDetailVal%>">
<td class="sub_heading_content companyNameTwo<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyName())?addCompanyTwo.getCompanyName():"" %></td>
	<td class="sub_heading_content companyAddressTwo<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyAddress())?addCompanyTwo.getCompanyAddress():"" %></td>
	<td class="sub_heading_content sectionOneCompName<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getHeadOfCompany())?addCompanyTwo.getHeadOfCompany():"" %></td>
	<td class="sub_heading_content sectionOneCompJobTitle<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getJobTitleOne())?addCompanyTwo.getJobTitleOne():"" %></td>
	<td class="sub_heading_content sectionOneCompEmailAddr<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyEmailOne())?addCompanyTwo.getCompanyEmailOne():"" %></td>
	<td class="sub_heading_content sectionOneCompTelNum<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyNumOne())?addCompanyTwo.getCompanyNumOne():"" %></td>
	<td class="sub_heading_content sectOneCompContactName<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getContactName())?addCompanyTwo.getContactName():"" %></td>
	<td class="sub_heading_content sectOneCompJobTitle<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getJobTitleTwo())?addCompanyTwo.getJobTitleTwo():"" %></td>
	<td class="sub_heading_content sectOneCompEmail<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyEmailTwo())?addCompanyTwo.getCompanyEmailTwo():"" %></td>
	<td class="sub_heading_content sectOneCompTeleNumber<%=sectionOneCompanyDetailVal%>"><%=Validator.isNotNull(addCompanyTwo)&&Validator.isNotNull(addCompanyTwo.getCompanyNumTwo())?addCompanyTwo.getCompanyNumTwo():"" %></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="sectionOneCompanyDetailEditTab" onclick="sectionOneCompanyEditTab('<%=sectionOneCompanyDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="sectionOneCompanyDetailDeleteDataTab" onclick="sectionOneCompanyDetailDeleteData('<%=sectionOneCompanyDetailVal%>'); deleteApplicantINfo(<%=addCompanyTwo.getNcbjCompanyDetailGenId()%>);"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="sectionOneCompanyDetailId<%=sectionOneCompanyDetailVal%>" name="sectionOneCompanyDetailId<%=sectionOneCompanyDetailVal%>" value="<%=addCompanyTwo.getNcbjApplicationId()%>">
</tr>
 <%sectionOneCompanyDetailVal=sectionOneCompanyDetailVal+1;
	}}} %>
					</tbody>
				</table>
			</div>
		</div>
		<!-- product and services  -->
		<div class="row">
				<input id="productServicesDetailVal" type="hidden"
					name="productServicesDetailVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian"
						id="productServicesDetailBox">
						<div class="accordion__header is-active"
							id="productServicesDetail" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>Products and Services</h2>
										<p class="tab-form-sub-heading">(please detail the
											products you produce and /or the services you provide)</p>
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
										<p class="tab-form-main-heading">Number of product types</p>
										<input type="text" class="form-control " id="productType"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Please List Products</p>
										<input type="text" class="form-control " id="productList"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">Number of Production
											Lines</p>
										<input type="text" class="form-control " id="productLines"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee"
										id="addProductServicesDetail"
										onclick="addProductServicesDetail();"> <span>+ 1</span>
										Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div
					class="col-12 table-responsive hide addProductServicesDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addProductServicesDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Number of product types</th>
								<th class="sub_heading text-nowrap">Please List Products</th>
								<th class="sub_heading text-nowrap">Number of Production
									Lines</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
	<%if(Validator.isNotNull(productDetail)&&productDetail.size()>0){
	for(NcbjProductServiceDetail productService:productDetail){ %>
	<tr class="product-services-detail-row<%=productServicesDetailVal%>">
	<td class="sub_heading_content productType<%=productServicesDetailVal%>"><%=Validator.isNotNull(productService)&&Validator.isNotNull(productService.getProductType())?productService.getProductType():"" %></td>
	<td class="sub_heading_content productList<%=productServicesDetailVal%>"><%=Validator.isNotNull(productService)&&Validator.isNotNull(productService.getProductList())?productService.getProductList():"" %></td>
	<td class="sub_heading_content productLines<%=productServicesDetailVal%>"><%=Validator.isNotNull(productService)&&Validator.isNotNull(productService.getProductLines())?productService.getProductLines():"" %></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="productServicesDetailEditTab" onclick="productServicesEditTab('<%=productServicesDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="productServicesDetailDeleteDataTab" onclick="productServicesDetailDeleteData('<%=productServicesDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="productServicesDetailId<%=productServicesDetailVal%>" name="productServicesDetails<%=productServicesDetailVal%>" value="<%=productService.getNcbjProductServiceDetailId()%>">
</tr>
<%productServicesDetailVal=productServicesDetailVal+1;
	}} %>
						</tbody>
					</table>
				</div>

		</div>
		<!-- end product and services -->
		<!-- upload document -->
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-main-heading" id="investmentAccQues">Draft
					Scope</p>
				<p class="tab-form-sub-heading">(Scope is a description of the
					activities, products, processes (including packaging) and/or
					services to be certified. Please note that this description will be
					the Certification scope shown on the Approved Certificate issued by
					NCBJ.)</p>
				<div class="">
					<div class="form-group">
						<textarea rows="3" id="transferReasonDraft" class="form-control"
							maxlength="255" placeholder="Description"
							style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getTransferReasonDraft())?premisesLocation.getTransferReasonDraft():""%></textarea>
					</div>
				</div>
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="detail-operating"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>detail-operating">
									<label class="custom-upload" for="detail-operating"> <span
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
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docDraftScope))?docDraftScope:""%></span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading" id="orgMember">
							<strong>Exclusions</strong> Are there exclusions to the
							activities to be certified compared to the activities you carry
							out in relation to food products?
						</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="activityExclusion"
								 <%=premisesLocation != null && premisesLocation.getActivityExclusion().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label for="activityExclusion">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="activityExclusion"
								 <%=premisesLocation != null && premisesLocation.getActivityExclusion().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label for="activityExclusion">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12 activityExclusionBox hide">
				<div class="form-group">
					<textarea rows="3" id="transferReasonAct" class="form-control"
						maxlength="255" placeholder="Describe"
						style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getTransferReasonAct())?premisesLocation.getTransferReasonAct():"" %></textarea>
				</div>
			</div>
		</div>

		<!-- NUMBER OF EMPLOYEES:  -->
		<div class="row">
				<input id="employeesNumberDetailVal" type="hidden"
					name="employeesNumberDetailVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian"
						id="employeesNumberDetailBox">
						<div class="accordion__header is-active"
							id="employeesNumberDetail" onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>Number of Employees</h2>
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
										<p class="tab-form-main-heading">Head Office/Site Name</p>
										<input type="text" class="form-control " id="headOffice"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">1.</span>Administration/Office</p>
										<input type="text" class="form-control "
											id="administrationOffice" placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Production/Processing</p>
										<input type="text" class="form-control "
											id="productionProcessing" placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Maintenance/Service</p>
										<input type="text" class="form-control "
											id="maintenanceService" placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>Logistics</p>
										<input type="text" class="form-control " id="logistics"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Total</p>
										<input type="text" class="form-control " id="total"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Seasonal</p>
										<input type="text" class="form-control " id="seasonal"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Temporary</p>
										<input type="text" class="form-control " id="temporary"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<p class="tab-form-main-heading">Subcontracted</p>
										<input type="text" class="form-control " id="subcontracted"
											placeholder="" value="">
									</div>
								</div>
								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee"
										id="addEmployeesNumberDetail"
										onclick="addEmployeesNumberDetail();"> <span>+ 1</span>
										Add for additional sites here
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div
					class="col-12 table-responsive hide addEmployeesNumberDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addEmployeesNumberDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Head Office/Site Name</th>
								<th class="sub_heading text-nowrap">Administration/Office</th>
								<th class="sub_heading text-nowrap">Production/Processing</th>
								<th class="sub_heading text-nowrap">Maintenance/Service</th>
								<th class="sub_heading text-nowrap">Logistics</th>
								<th class="sub_heading text-nowrap">Total</th>
								<th class="sub_heading text-nowrap">Seasonal</th>
								<th class="sub_heading text-nowrap">Temporary</th>
								<th class="sub_heading text-nowrap">Subcontracted</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
	<%if(Validator.isNotNull(numOfEmp)&&numOfEmp.size()>0){
	for(NcbjNumOfEmpAdd addNumOfEmp:numOfEmp){ %>
	<tr class="employees-number-detail-row<%=employeesNumberDetailVal%>">
	<td class="sub_heading_content headOffice<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getHeadOffice())?addNumOfEmp.getHeadOffice():"" %></td>
	<td class="sub_heading_content administrationOffice<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getAdministrationOffice())?addNumOfEmp.getAdministrationOffice():"" %></td>
	<td class="sub_heading_content productionProcessing<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getProductionProcessing())?addNumOfEmp.getProductionProcessing():"" %></td>
	<td class="sub_heading_content maintenanceService<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getMaintenanceService())?addNumOfEmp.getMaintenanceService():"" %></td>
	<td class="sub_heading_content logistics<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getLogistics())?addNumOfEmp.getLogistics():"" %></td>
	<td class="sub_heading_content total<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getTotal())?addNumOfEmp.getTotal():"" %></td>
	<td class="sub_heading_content seasonal<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getSeasonal())?addNumOfEmp.getSeasonal():"" %></td>
	<td class="sub_heading_content temporary<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getTemporary())?addNumOfEmp.getTemporary():"" %></td>
	<td class="sub_heading_content subcontracted<%=employeesNumberDetailVal%>"><%=Validator.isNotNull(addNumOfEmp)&&Validator.isNotNull(addNumOfEmp.getSubcontracted())?addNumOfEmp.getSubcontracted():"" %></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="employeesNumberDetailEditTab" onclick="employeesNumberEditTab('<%=employeesNumberDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="employeesNumberDetailDeleteDataTab" onclick="employeesNumberDetailDeleteData('<%=employeesNumberDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="employeesNumberDetailId<%=employeesNumberDetailVal%>" name="employeesNumberDetailId<%=employeesNumberDetailVal%>" value="<%=addNumOfEmp.getNcbjNumOfEmpAddId()%>">
</tr>
<%employeesNumberDetailVal=employeesNumberDetailVal+1;
	}} %>
						</tbody>
					</table>
				</div>
		</div>
		<!-- work pattern:-->
		<div class="row">
				<input id="workPatternDetailVal" type="hidden"
					name="workPatternDetailVal" value="1">
				<div class="col-md-12">
					<div class="accordion secured-accordian" id="workPatternDetailBox">
						<div class="accordion__header is-active" id="workPatternDetail"
							onclick="expandDetails(this.id)">
							<div class="d-flex align-items-center">
								<div class="d-flex align-items-center">
									<div>
										<span class="accordion__toggle"></span>
									</div>
									<div>
										<h2>Work Pattern</h2>
										<p class="tab-form-sub-heading">(for shift working please
											detail shift times and the number of employees per shift i.e
											days, nights, 6am-2pm , 2pm -10pm)</p>
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
										<p class="tab-form-main-heading">Employees Shift</p>
										<input type="text" class="form-control" id="employeesShift"
											placeholder="" value="" />
									</div>
								</div>

								<div class="col-md-12 d-flex justify-content-end py-4">
									<a href="javascript:void(0);" class="add-more-employee"
										id="addWorkPatternDetail" onclick="addWorkPatternDetail();">
										<span>+ 1</span> Add More
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div
					class="col-12 table-responsive hide addWorkPatternDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addWorkPatternDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Employees Shift</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							<%if(Validator.isNotNull(workPattern)&&workPattern.size()>0){
	for(NcbjSectionDetailAdd addWorkPattern:workPattern){
		if(Validator.isNotNull(addWorkPattern.getAddDetails())){
		%>
							<tr class="work-pattern-detail-row<%=workPatternDetailVal%>">
	<td class="sub_heading_content employeesShift<%=workPatternDetailVal%>"><%=Validator.isNotNull(addWorkPattern)&&Validator.isNotNull(addWorkPattern.getAddDetails())?addWorkPattern.getAddDetails():"" %></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="workPatternDetailEditTab" onclick="workPatternEditTab('<%=workPatternDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="workPatternDetailDeleteDataTab" onclick="workPatternDetailDeleteData('<%=workPatternDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="workPatternDetailId<%=workPatternDetailVal%>" name="workPatternDetailId<%=workPatternDetailVal%>" value="<%=addWorkPattern.getNcbjSectionDetailAddId()%>">
</tr>
<%workPatternDetailVal=workPatternDetailVal+1;
	}}} %>
						</tbody>
					</table>
				</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title-subtitle f2 drop-head">Premises &
					Location</p>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Please state the size of the
						production facilities</p>
					<input type="text" class="form-control" name="Newqty"
						id="producitonFacilitySize" value="<%=Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getProductionFacilitySize())?premisesLocation.getProductionFacilitySize():""%>"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						placeholder="">
					<p class="tab-form-sub-heading">(in sq metres)</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Please state the size of any
						warehouse facilities on site</p>
					<input type="text" class="form-control" name="Newqty"
						id="warehouseFacilitySize" value="<%=Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getWarehouseFacilitySize())?premisesLocation.getWarehouseFacilitySize():""%>"
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
						placeholder="">
					<p class="tab-form-sub-heading">(in sq metres)</p>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Please state location of
						facilities i.e. industrial estate</p>
					<textarea rows="3" id="facilitiesLocation" class="form-control"
						maxlength="255" placeholder="Enter Location"
						style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getFacilitiesLocation())?premisesLocation.getFacilitiesLocation():""%></textarea>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">If any part of the site is
						sublet or under different management, please give details</p>
					<textarea rows="3" id="detailForDiffManagement"
						class="form-control" maxlength="255" placeholder="Enter Details"
						style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(premisesLocation)&&Validator.isNotNull(premisesLocation.getDetailForDiffManagement())?premisesLocation.getDetailForDiffManagement():""%></textarea>
				</div>
			</div>
		</div>
		<button type="button" id="saveComName" onClick="addPremisesAndLocationInfo(false);"
			class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
			Continue to the next form section <span class="ml-2"> <svg
					width="18" height="14" viewBox="0 0 18 14" fill="none"
					xmlns="http://www.w3.org/2000/svg">
                <pathd
						="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902 0.589966L6.00016
                    11.17Z" fill="#1B1917" />
            </svg>
			</span>
		</button>
	</div>
</div>

<!-- Section II -->

<div class="tab-pane newForm22000 hide" role="tabpanel" id="childStep7">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Section II</p>

			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title-subtitle f2">Please Detail the
					processes/activities involved in manufacture/service</p>
			</div>
			<div class="col-md-12">
				<p class="tab-form-main-heading" id="investmentAccQues"><span class="tab-form-highlghtme-link pr-2">1.</span>Incoming Materials (please list the main materials/and or
					ingredients)</p>
				<textarea rows="3" id="transferReasonPro" class="form-control"
					maxlength="255"
					placeholder="list the main materials/and or ingredients"
					style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getIncomingMaterials()) ? processDetails.getIncomingMaterials() : ""%></textarea>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="incomingMaterial"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>incomingMaterial"> <label class="custom-upload"
										for="incomingMaterial"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docIncomingMate))?docIncomingMate:""%></span>
						</div>
					</div>
				</div>
				<p class="tab-form-main-heading" id="investmentAccQues"><span class="tab-form-highlghtme-link pr-2">2.</span>Product
					Storage - (please give details of on-site product storage including
					in process)</p>
				<textarea rows="3" id="transferReasonStorage" class="form-control"
					maxlength="255"
					placeholder="Details of on-site product storage including in process"
					style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getProductStorage()) ? processDetails.getProductStorage() : ""%></textarea>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="productStorage"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>productStorage"> <label class="custom-upload"
										for="productStorage"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docProdStorage))?docProdStorage:""%></span>
						</div>
					</div>
				</div>
				<p class="tab-form-main-heading" id="investmentAccQues"><span class="tab-form-highlghtme-link pr-2">3.</span>
					Building and Site Aspects ( Please give any significant details,
					e.g., Any neighbour whose activity may effect operation, etc)</p>
				<textarea rows="3" id="transferReasonInvest" class="form-control"
					maxlength="255" placeholder="Significant details"
					style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getBuildingSiteAspects()) ? processDetails.getBuildingSiteAspects() : ""%></textarea>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="buildingSite"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>buildingSite"> <label class="custom-upload"
										for="buildingSite"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docBuildingAspects))?docBuildingAspects:""%></span>
						</div>
					</div>
				</div>
				<p class="tab-form-main-heading" id="investmentAccQues"><span class="tab-form-highlghtme-link pr-2">4.</span>Waste
					and Discharges (Please list main wastes and effluents)</p>
				<textarea rows="3" id="transferReasonWaste" class="form-control"
					maxlength="255" placeholder="List main wastes and effluents"
					style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getWasteDischarges()) ? processDetails.getWasteDischarges() : ""%></textarea>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="wasteDischarge"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>wasteDischarge"> <label class="custom-upload"
										for="wasteDischarge"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docDischargeWaste))?docDischargeWaste:""%></span>
						</div>
					</div>
				</div>
				<p class="tab-form-main-heading" id="investmentAccQues">
				<span class="tab-form-highlghtme-link pr-2">5.</span>
					Transport (Please give details of transport and/or distribution
					etc.)</p>
				<textarea rows="3" id="transferReasonTransport" class="form-control"
					maxlength="255" placeholder="Details of transport"
					style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getTransportDetails()) ? processDetails.getTransportDetails() : ""%></textarea>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="transport"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>transport"> <label class="custom-upload"
										for="transport"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docTransportDetail))?docTransportDetail:""%></span>
						</div>
					</div>
				</div>
				<p class="tab-form-main-heading" id="investmentAccQues"><span class="tab-form-highlghtme-link pr-2">6.</span>Sub
					Contracted Activities (Please detail any subcontract activities
					i.e.: maintenance, calibration, delivery, transport etc.).</p>
				<textarea rows="3" id="transferReasonSub" class="form-control"
					maxlength="255" placeholder="Details of Activities"
					style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(processDetails) && Validator.isNotNull(processDetails.getSubcontractedActivities()) ? processDetails.getSubcontractedActivities() : ""%></textarea>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="contractedActivties"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>contractedActivties"> <label
										class="custom-upload" for="contractedActivties"> <span
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
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docSubContAct))?docSubContAct:""%></span>
						</div>
					</div>
				</div>
				<button type="button" id="saveComName" onClick="addProcessDetailsInManufacturing(false);"
					class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
					Continue to the next form section <span class="ml-2"> <svg
							width="18" height="14" viewBox="0 0 18 14" fill="none"
							xmlns="http://www.w3.org/2000/svg">
                            <pathd
								="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902
                                0.589966L6.00016 11.17Z" fill="#1B1917" />
                        </svg>
					</span>
				</button>
			</div>
		</div>
	</div>
</div>

<!-- section III -->

<div class="tab-pane newForm22000 hide" role="tabpanel" id="childStep8">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Section III</p>
				<!-- <p class="tab-form-title-subtitle f2"></p> -->
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-main-heading">Activities and Processes on
					site</p>
				<div class="form-group">
					 <textarea rows="3" id="processActivityDescription" class="form-control" maxlength="255" placeholder="Activities and Processes on site" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getProcessActivityDescription()) ? sectionThree.getProcessActivityDescription() : "" %></textarea>  
				</div>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="processActivity"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>processActivity"> <label class="custom-upload"
										for="processActivity"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docProcessActivities))?docProcessActivities:""%></span>
						</div>
					</div>
				</div>
				<p class="tab-form-main-heading" id="investmentAccQues">Please
					list here (or attach) information relating to all site activities
					including number of personnel involved and the extent of activity</p>
				<textarea rows="3" id="transferReasonList" class="form-control"
					maxlength="255" placeholder="List here"
					style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getProcessActivitiesList()) ? sectionThree.getProcessActivitiesList() : ""%></textarea>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="siteActivity"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>siteActivity"> <label class="custom-upload"
										for="siteActivity"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(siteActivitiesDoc))?siteActivitiesDoc:""%></span>
						</div>
					</div>
				</div>
				<p class="tab-form-main-heading " id="investmentAccQues"><span class="tab-form-highlghtme-link pr-2">1.</span>Incoming
					materials</p>
				<div class="form-group">
					 <textarea rows="3" id="incomingMaterialsDescription" class="form-control" maxlength="255" placeholder="Incoming materials" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getIncomingMaterialsDes()) ? sectionThree.getIncomingMaterialsDes() : "" %></textarea> 
				</div>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="incomingMaterials"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>incomingMaterials"> <label class="custom-upload"
										for="incomingMaterials"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(incoMatDoc))?incoMatDoc:""%></span>
						</div>
					</div>
				</div>
				<p class="tab-form-main-heading" id="investmentAccQues"><span class="tab-form-highlghtme-link pr-2">2.</span>Processes</p>
				<div class="form-group">
					 <textarea rows="3" id="processesDescription" class="form-control" maxlength="255" placeholder="Processes" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getProcessDescription()) ? sectionThree.getProcessDescription() : ""  %></textarea> 
				</div>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="processes"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>processes"> <label class="custom-upload"
										for="processes"> <span class="mr-2"> <svg
												width="14" height="17" viewBox="0 0 14 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
													fill="#047247"></path>
                                            </svg>
									</span>Upload
									</label>
								</div>
							</div>
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(processDocument))?processDocument:""%></span>
						</div>
					</div>
				</div>

			</div>
			<!--  SPECIFIC ACTIVITIES (tick off please) -->
			<div class="col-md-12">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Specific Activities</p>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity1"
							value="Number of product types" <%=(specificActivities != null && specificActivities.size() > 9 && specificActivities.get(9) != null && specificActivities.get(9).getSpecificActivityChecked() != null && specificActivities.get(9).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity">
						<label for="specificActivity1">
							<p class="tab-form-main-heading mb-0">Number of product types</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber1" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 9 &&specificActivities.get(8)!=null&&specificActivities.get(9).getSpecificActivityNumber()!=null?specificActivities.get(9).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity2"
							value="Number of products" <%=(specificActivities != null && specificActivities.size() > 8 && specificActivities.get(8) != null && specificActivities.get(8).getSpecificActivityChecked() != null && specificActivities.get(8).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity"> <label
							for="specificActivity2">
							<p class="tab-form-main-heading mb-0">Number of products</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber2" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 8 &&specificActivities.get(8)!=null&&specificActivities.get(8).getSpecificActivityNumber()!=null?specificActivities.get(8).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity3"
							value="Number of production lines" <%=(specificActivities != null && specificActivities.size() > 7 && specificActivities.get(7) != null && specificActivities.get(7).getSpecificActivityChecked() != null && specificActivities.get(7).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity">
						<label for="specificActivity3">
							<p class="tab-form-main-heading mb-0">Number of production
								lines</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber3" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 7 &&specificActivities.get(7)!=null&&specificActivities.get(7).getSpecificActivityNumber()!=null?specificActivities.get(7).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity4"
							value="Number of buildings" <%=(specificActivities != null && specificActivities.size() > 6 && specificActivities.get(6) != null && specificActivities.get(6).getSpecificActivityChecked() != null && specificActivities.get(6).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity"> <label
							for="specificActivity4">
							<p class="tab-form-main-heading mb-0">Number of buildings</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber4" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 6 &&specificActivities.get(6)!=null&&specificActivities.get(6).getSpecificActivityNumber()!=null?specificActivities.get(6).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity5"
							value="Number of warehouses" <%=(specificActivities != null && specificActivities.size() > 5 && specificActivities.get(5) != null && specificActivities.get(5).getSpecificActivityChecked() != null && specificActivities.get(5).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity"> <label
							for="specificActivity5">
							<p class="tab-form-main-heading mb-0">Number of warehouses</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber5" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 5 &&specificActivities.get(5)!=null&&specificActivities.get(5).getSpecificActivityNumber()!=null?specificActivities.get(5).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity6"
							value="In house laboratory" <%=(specificActivities != null && specificActivities.size() > 4 && specificActivities.get(4) != null && specificActivities.get(4).getSpecificActivityChecked() != null && specificActivities.get(4).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity"> <label
							for="specificActivity6">
							<p class="tab-form-main-heading mb-0">In house laboratory</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber6" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 4 &&specificActivities.get(4)!=null&&specificActivities.get(4).getSpecificActivityNumber()!=null?specificActivities.get(4).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity7"
							value="Logistic & transport" <%=(specificActivities != null && specificActivities.size() > 3 && specificActivities.get(3) != null && specificActivities.get(3).getSpecificActivityChecked() != null && specificActivities.get(3).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity"> <label
							for="specificActivity7">
							<p class="tab-form-main-heading mb-0">Logistic & transport
								(not outsourced)</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber7" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 3 &&specificActivities.get(3)!=null&&specificActivities.get(3).getSpecificActivityNumber()!=null?specificActivities.get(3).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity8"
							value="External warehouse" <%=(specificActivities != null && specificActivities.size() > 2 && specificActivities.get(2) != null && specificActivities.get(2).getSpecificActivityChecked() != null && specificActivities.get(2).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity"> <label
							for="specificActivity8">
							<p class="tab-form-main-heading mb-0">External warehouse
								(under direct responsibility of your factory)</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber8" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 2 &&specificActivities.get(2)!=null&&specificActivities.get(2).getSpecificActivityNumber()!=null?specificActivities.get(2).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="specificActivity9"
							value="Product development" <%=(specificActivities != null && specificActivities.size() > 1 && specificActivities.get(1) != null && specificActivities.get(1).getSpecificActivityChecked() != null && specificActivities.get(1).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> name="specificActivity"> <label
							for="specificActivity9">
							<p class="tab-form-main-heading mb-0">Product development</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber9" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 1 &&specificActivities.get(1)!=null&&specificActivities.get(1).getSpecificActivityNumber()!=null?specificActivities.get(1).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" <%=(specificActivities != null && specificActivities.size() > 0 && specificActivities.get(0) != null && specificActivities.get(0).getSpecificActivityChecked() != null && specificActivities.get(0).getSpecificActivityChecked().contains("true")) ? "checked" : StringPool.BLANK %> id="specificActivity10"
							value="Staff speaking in more than on language"
							name="specificActivity"> <label for="specificActivity10">
							<p class="tab-form-main-heading mb-0">Staff speaking in more
								than on language (if requiring interpreter for this audit)</p>
						</label>
					</div>
					<div class="row specificActivityInfo px-4 mx-1 hide">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Please state the number</p>
								<input type="text" class="form-control"
									id="specificActivityNumber10" placeholder="" value="<%=specificActivities!=null&& specificActivities.size() > 0 &&specificActivities.get(0)!=null&&specificActivities.get(0).getSpecificActivityNumber()!=null?specificActivities.get(0).getSpecificActivityNumber():"" %>">
							</div>
						</div>
					</div>

				</div>
			</div>

			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">Please explain if needed:</p>
					<textarea type="text" class="form-control" id="quantity1"
						placeholder="" value="" autocomplete="off"><%=Validator.isNotNull(sectionThree) && Validator.isNotNull(sectionThree.getExplainationBox()) ? sectionThree.getExplainationBox() : "" %></textarea>
				</div>
			</div>
			<div class="col-md-12">
				<p class="tab-form-main-heading" id="investmentAccQues"><span class="tab-form-highlghtme-link pr-2">4.</span>List of
					sub contracted activities (i.e.: Machining, calibration, delivery,
					etc.).</p>
				<!-- Field Upload button -->
				<div class="supporting-document-card my-3">
					<div class="row">
						<div class="col-md-12">
							<div class="supporting-document-card-wrapper">
								<div class="left">
									<p class="supporting-document-card-upper-heading">Attach
										File</p>
								</div>
								<div class="right">
									<input type="file" id="subContractedActivity"
										onchange="attachDetailed(this.id)" hidden="" multiple=""
										name="<portlet:namespace/>subContractedActivity"> <label
										class="custom-upload" for="subContractedActivity"> <span
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
							<span class="attach-detailed-overview"><%=(Validator.isNotNull(docSubContractList))?docSubContractList:""%></span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>The number and type of HACCP
					study</p>
				<p class="tab-form-sub-heading">A HACCP study corresponds to a
					hazard analysis for a family of products/services with similar
					hazards and similar production technology and, where relevant,
					similar storage technology. Example; if a factory is producing
					liquid food (pasteurized and packed aseptic) and solid food (other
					process type), the factory has two HACCP studies. Another example
					is production of two not-related products (e.g. ice cream and
					cheese).</p>
			</div>
			<div class="col-md-12">
				<input id="haccpNumberDetailVal" type="hidden" name="haccpNumberDetailVal"
					value="1">
				<div class="accordion secured-accordian" id="haccpNumberDetailBox">
					<div class="accordion__header is-active" id="haccpNumberDetail"
						onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
								<div>
									<span class="accordion__toggle"></span>
								</div>
								<div>
									<h2>Number and type of HACCP study</h2>
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
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="haccpStudyNumber"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>haccpStudyNumber"> <label
														class="custom-upload" for="haccpStudyNumber">
														<span class="mr-2"> <svg width="14" height="17"
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
											<span class="attach-detailed-overview"><%=(Validator.isNotNull(numberOfHaccp))?numberOfHaccp:""%></span>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<!-- <p class="tab-form-main-heading"></p> -->
									<input type="text" class="form-control" id="haccpNumber"
										placeholder="Number of HACCP study" value="" />
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<!-- <p class="tab-form-main-heading"></p> -->
									<input type="text" class="form-control" id="haccpType"
										placeholder="Type of HACCP study" value="" />
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4">
								<a href="javascript:void(0);" class="add-more-employee"
									id="addHaccpNumberDetail" onclick="addHaccpNumberDetail();">
									<span>+ 1</span> Add More
								</a>
							</div>
						</div>
					</div>
				</div>
			<div class="col-12 table-responsive hide addHaccpNumberDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addHaccpNumberDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Number of HACCP study</th>
								<th class="sub_heading text-nowrap">Type of HACCP study</th>
								<th class="sub_heading text-nowrap">Attach File Details</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
								<%
	
	 if(Validator.isNotNull(haccpNum)&&haccpNum.size()>0){
			for(NcbjSectionDetailAdd addHaccp:haccpNum){ 
				if(Validator.isNotNull(addHaccp.getAddNumHaccp())){
		FileEntry attachDocFE1=null;
		numberOfHaccp="";  
		long fileEntryId = 0;
	                         
            try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Number of HACCP study"+haccpNumberDetailVal);
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				numberOfHaccp=attachDocFE1.getFileName();
				fileEntryId=dlFileEntry.getFileEntryId();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		%>
	<tr class="haccp-number-detail-row<%=haccpNumberDetailVal%>">
	<td class="sub_heading_content haccpNumber<%=haccpNumberDetailVal%>"><%=Validator.isNotNull(addHaccp)&&Validator.isNotNull(addHaccp.getAddNumHaccp())?addHaccp.getAddNumHaccp():"" %></td>
	<td class="sub_heading_content haccpType<%=haccpNumberDetailVal%>"><%=Validator.isNotNull(addHaccp)&&Validator.isNotNull(addHaccp.getAddTypeHaccp())?addHaccp.getAddTypeHaccp():"" %></td>
	<td class="sub_heading_content">
		<div id="haccpStudyNumber<%=haccpNumberDetailVal%>">
			<a class="file-info sub_heading_content haccpStudyNumber<%=haccpNumberDetailVal%>" href="javascript:void(0)"><%=(Validator.isNotNull(numberOfHaccp))?numberOfHaccp:""%></a>
		</div>
	</td>
		<td> 
		<span>   
			<a href="javascript:void(0)" id="haccpNumberDetailEditTab" onclick="haccpNumberEditTab('<%=haccpNumberDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="haccpNumberDetailDeleteDataTab" onclick="haccpNumberDetailDeleteData('<%=haccpNumberDetailVal%>'); deleteDocument('<%=fileEntryId%>')"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
    
</tr>
 <input type="hidden" id="haccpNumberDetailId<%=haccpNumberDetailVal%>" name="haccpNumberDetailId<%=haccpNumberDetailVal%>" value="<%=addHaccp.getNcbjSectionDetailAddId()%>">
<%haccpNumberDetailVal=haccpNumberDetailVal+1;
	}}} %>
						</tbody>
					</table>
				</div>
			</div>	

			<div class="col-md-12">
				<input id="hazardAnalysisDetailVal" type="hidden" name="hazardAnalysisDetailVal"
					value="1">
				<div class="accordion secured-accordian" id="hazardAnalysisDetailBox">
					<div class="accordion__header is-active" id="hazardAnalysisDetail"
						onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
								<div>
									<span class="accordion__toggle"></span>
								</div>
								<div>
									<h2>6. Hazard analysis and critical control point aspects
										(ccp's ) & prerequisite programme (prp's)</h2>
								</div>
						</div>
						<div>
							<p class="accordian-employee mb-0 common-para"></p>
						</div>
					</div>

					<div class="accordion__body is-active">
						<div class="row">
							<div class="col-md-12">
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="hazardControlPoint"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>hazardControlPoint"> <label
														class="custom-upload" for="hazardControlPoint"> <span
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
											<span class="attach-detailed-overview"><%=(Validator.isNotNull(hazardAnalysisDoc))?hazardAnalysisDoc:""%></span>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<input type="text" class="form-control" id="hazardAnalysis"
										placeholder="" value="" />
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4">
								<a href="javascript:void(0);" class="add-more-employee"
									id="addHazardAnalysisDetail"
									onclick="addHazardAnalysisDetail();"> <span>+ 1</span> Add
									More
								</a>
							</div>
						</div>
					</div>
				</div>
			<div class="col-12 table-responsive hide addHazardAnalysisDetailTableBox">
				<table class="table table-bordered mb-3">
					<tbody class="addHazardAnalysisDetailTable">
						<tr>
							<th class="sub_heading text-nowrap">Hazard analysis and
								critical control point aspects (ccp's ) & prerequisite programme
								(prp's)</th>
								<th class="sub_heading">Attach File Details</th>
							    <th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>	
						</tr>
						
								<%
	
		if(Validator.isNotNull(hazardAnalysis)&&hazardAnalysis.size()>0){
			for(NcbjSectionDetailAdd addHazard:hazardAnalysis){
				if(Validator.isNotNull(addHazard.getAddHazard())){
		FileEntry attachDocFE1=null;
		hazardAnalysisDoc="";    
		long fileEntryId = 0;
	                         
            try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Hazard Analysis"+hazardAnalysisDetailVal);
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				hazardAnalysisDoc=attachDocFE1.getFileName();
				fileEntryId=dlFileEntry.getFileEntryId();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		%>
	<tr class="hazard-analysis-detail-row<%=hazardAnalysisDetailVal%>">
	<td class="sub_heading_content hazardAnalysis<%=hazardAnalysisDetailVal%>"><%=Validator.isNotNull(addHazard)&&Validator.isNotNull(addHazard.getAddHazard())?addHazard.getAddHazard():"" %></td>
	<td class="sub_heading_content">
		<div id="hazardControlPoint<%=hazardAnalysisDetailVal%>">
			<a class="file-info sub_heading_content hazardControlPoint<%=hazardAnalysisDetailVal%>" href="javascript:void(0)"><%=(Validator.isNotNull(hazardAnalysisDoc))?hazardAnalysisDoc:""%></a>
		</div>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="hazardAnalysisDetailEditTab" onclick="hazardAnalysisEditTab('<%=hazardAnalysisDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="hazardAnalysisDetailDeleteDataTab" onclick="hazardAnalysisDetailDeleteData('<%=hazardAnalysisDetailVal%>'); deleteDocument('<%=fileEntryId%>')"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
    
</tr>
<input type="hidden" id="hazardAnalysisDetailId<%=hazardAnalysisDetailVal%>" name="hazardAnalysisDetailId<%=hazardAnalysisDetailVal%>" value="<%=addHazard.getNcbjSectionDetailAddId()%>">
<%hazardAnalysisDetailVal=hazardAnalysisDetailVal+1;
	}}} %>
					</tbody>
				</table>
			</div>
			</div>

            <div class="col-md-12">
				<input id="licenceListDetailVal" type="hidden" name="licenceListDetailVal"
					value="1">
				<div class="accordion secured-accordian" id="licenceListDetailBox">
					<div class="accordion__header is-active" id="licenceListDetail"
						onclick="expandDetails(this.id)">
						<div class="d-flex align-items-center">
							<div class="d-flex align-items-center">
								<div>
									<span class="accordion__toggle"></span>
								</div>
								<div>
									<h2>7. Consents, licences, permits, authorisations, agreements, codes of practice, etc. (please list)</h2>
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
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="consentsListUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>consentsListUpload"> <label
														class="custom-upload" for="consentsListUpload"> <span
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
											<span class="attach-detailed-overview"><%=(Validator.isNotNull(docConsentLic))?docConsentLic:""%></span>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<!-- <p class="tab-form-main-heading"></p> -->
									<input type="text" class="form-control" id="consentsList"
										placeholder="" value="" />
								</div>
							</div>
							<div class="col-md-12 d-flex justify-content-end py-4">
								<a href="javascript:void(0);" class="add-more-employee"
									id="addLicenceListDetail" onclick="addLicenceListDetail();">
									<span>+ 1</span> Add More
								</a>
							</div>
						</div>
					</div>
				</div>
			<div class="col-12 table-responsive hide addLicenceListDetailTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addLicenceListDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Consents, licences, permits, authorisations, agreements, codes of practice, etc. (please list)</th>
								<th class="sub_heading">Attach File Details</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
							
				<%
	
	 if(Validator.isNotNull(consentList)&&consentList.size()>0){
			for(NcbjSectionDetailAdd addConsentList:consentList){
				if(Validator.isNotNull(addConsentList.getAddConsentLic())){
		FileEntry attachDocFE1=null;
		docConsentLic="";
		long fileEntryId = 0;
	                         
            try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Consents Licences"+licenceListDetailVal);
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				docConsentLic=attachDocFE1.getFileName();
				fileEntryId=dlFileEntry.getFileEntryId();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		%>			
	<tr class="licence-list-detail-row<%=licenceListDetailVal%>">
	<td class="sub_heading_content text-nowrap consentsList<%=licenceListDetailVal%>"><%=Validator.isNotNull(addConsentList)&&Validator.isNotNull(addConsentList.getAddConsentLic())?addConsentList.getAddConsentLic():"" %></td>
	<td class="sub_heading_content">
		<div id="consentsListUpload<%=licenceListDetailVal%>">
			<a class="file-info sub_heading_content consentsListUpload<%=licenceListDetailVal%>" href="javascript:void(0)"><%=(Validator.isNotNull(docConsentLic))?docConsentLic:""%></a>
		</div>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="licenceListDetailEditTab" onclick="licenceListEditTab('<%=licenceListDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="licenceListDetailDeleteDataTab" onclick="licenceListDetailDeleteData('<%=licenceListDetailVal%>'); deleteDocument('<%=fileEntryId%>')"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
</tr>
<input type="hidden" id="licenceListDetailId<%=licenceListDetailVal%>" name="licenceListDetailId<%=licenceListDetailVal%>" value="<%=addConsentList.getNcbjSectionDetailAddId()%>">
<%licenceListDetailVal=licenceListDetailVal+1;
	}}}%>

						</tbody>
					</table>
				</div>
			</div>

			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading">ISO 22000 / FSSC 22000
						Categories (C- Food Manufacturing, CI- CIV: Subcategories):</p>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="iso22000Cate1" value="CII - Processing of perishable animal products. Example: production of animal products including fish and seafood, meat, eggs, dairy and fish products" <%= sectionThree != null && sectionThree.getCategoryOne().contains("CII - Processing of perishable animal products. Example: production of animal products including fish and seafood, meat, eggs, dairy and fish products") ? "checked" : StringPool.BLANK %> name="iso22000Cate"> <label for="iso22000Cate1"><p class="tab-form-main-heading mb-0">CII - Processing of perishable animal products. Example: production of animal products including fish and seafood, meat, eggs, dairy and fish products.</p></label>

					</div>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="iso22000Cate2" value="CII - Processing of perishable plant products. Example: Production of plant products including fruits and fresh juices, vegetables, grains, nuts, and pulses" <%= sectionThree != null && sectionThree.getCategoryOne().contains("CII - Processing of perishable plant products. Example: Production of plant products including fruits and fresh juices, vegetables, grains, nuts, and pulses") ? "checked" : StringPool.BLANK %> name="iso22000Cate"> <label for="iso22000Cate2"><p class="tab-form-main-heading mb-0">CII - Processing of perishable plant products. Example: Production of plant products including fruits and fresh juices, vegetables, grains, nuts, and pulses</p></label>

					</div>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="iso22000Cate3" value="CIII - Processing of perishable animal and plant products (mixed products). Example: Production of mixed animal and plant products including pizza, patty, sandwich, ready-to-eat meals" <%= sectionThree != null && sectionThree.getCategoryOne().contains("CIII - Processing of perishable animal and plant products (mixed products). Example: Production of mixed animal and plant products including pizza, patty, sandwich, ready-to-eat meals") ? "checked" : StringPool.BLANK %> name="iso22000Cate"> <label for="iso22000Cate3"><p class="tab-form-main-heading mb-0">CIII - Processing of perishable animal and plant products (mixed products). Example: Production of mixed animal and plant products including pizza, patty, sandwich, ready-to-eat meals</p></label>

					</div>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="iso22000Cate4" value="CIV - Processing of ambient stable products. Example: Production of food products from any source that are stored and sold at ambient temperature, including canned foods, biscuits, snacks, oil, drinking water, beverages, pasta, flour, sugar, food-grade salt" <%= sectionThree != null && sectionThree.getCategoryOne().contains("CIV - Processing of ambient stable products. Example: Production of food products from any source that are stored and sold at ambient temperature, including canned foods, biscuits, snacks, oil, drinking water, beverages, pasta, flour, sugar, food-grade salt") ? "checked" : StringPool.BLANK %> name="iso22000Cate"> <label for="iso22000Cate4"><p class="tab-form-main-heading mb-0">CIV - Processing of ambient stable products. Example: Production of food products from any source that are stored and sold at ambient temperature, including canned foods, biscuits, snacks, oil, drinking water, beverages, pasta, flour, sugar, food-grade salt</p></label>

					</div>
				</div>
			</div>
		</div>
		<button type="button" id="saveComName" onClick="addActivitiesProcessesList(false);addSpecificActivitiesList();"
			class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
			Continue to the next form section <span class="ml-2"> <svg
					width="18" height="14" viewBox="0 0 18 14" fill="none"
					xmlns="http://www.w3.org/2000/svg">
                    <pathd
						="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902
                        0.589966L6.00016 11.17Z" fill="#1B1917" />
                </svg>
			</span>
		</button>
	</div>
</div>

<div class="tab-pane newForm22000 hide" role="tabpanel" id="childStep9">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Section IV</p>
				<p class="tab-form-title-subtitle f2">Use of consultancy
					services information</p>
			</div>
		</div>
		<div class="row">

			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading" id="orgMember">Has your
							company used any consulting services to assist in the development
							and/or implementation of your Management System?</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="companyUsedFour" <%=consultService != null && consultService.getConsultService().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="orgMember">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="companyUsedFour" <%=consultService != null && consultService.getConsultService().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="orgMember">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-6 hide companyUsedFourBox" id="condultingFirmTelephone">
				<div class="form-group">
					<p class="tab-form-main-heading">Consulting Firm Telephone</p>
					<input type="text" class="form-control"
						id="sfConsultingFirmTelephone" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" 
						value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultTelephone()) ? consultService.getConsultTelephone() : "" %>" />
				</div>
			</div>
			<div class="col-md-6 hide companyUsedFourBox" id="cosultantEmail">
				<div class="form-group">
					<p class="tab-form-main-heading" id="condultingFirmTelephone">Consultant(s)
						Email</p>
					<input type="text" class="form-control" id="sfConsultingEmail"
						placeholder="" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultEmail()) ? consultService.getConsultEmail() : "" %>" />
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title-subtitle f2">Preferred Dates for Your
					Certification Activities</p>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Stage 1</p>
					<input type="date" class="form-control" id="sfStage1"
						placeholder="22345678" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultStageOne()) ? new SimpleDateFormat("yyyy-MM-dd").format(consultService.getConsultStageOne()) : "" %>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Stage 2</p>
					<input type="date" class="form-control" id="sfStage2"
						placeholder="22345678" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultStageTwo()) ? new SimpleDateFormat("yyyy-MM-dd").format(consultService.getConsultStageTwo()) : "" %>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Surveillance audit</p>
					<input type="date" class="form-control" id="sfSurveillanceAudit"
						placeholder="22345678" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultSurveillanceAudit()) ? new SimpleDateFormat("yyyy-MM-dd").format(consultService.getConsultSurveillanceAudit()) : "" %>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Recertification audit</p>
					<input type="date" class="form-control" id="sfRecertificationAudit"
						placeholder="22345678" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultRecertificationAudit()) ? new SimpleDateFormat("yyyy-MM-dd").format(consultService.getConsultRecertificationAudit()) : "" %>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Pre-assessment audit</p>
					<input type="date" class="form-control" id="sfPreAssessmentAudit"
						placeholder="" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultPreassessmentAudit()) ? new SimpleDateFormat("yyyy-MM-dd").format(consultService.getConsultPreassessmentAudit()) : "" %>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Any other service (s)</p>
					<input type="date" class="form-control" id="sfOtherServices"
						placeholder="" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultOtherService()) ? new SimpleDateFormat("yyyy-MM-dd").format(consultService.getConsultOtherService()) : "" %>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Name</p>
					<input type="text" class="form-control" id="sfName"
						placeholder="John" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultName()) ? consultService.getConsultName() : "" %>" />
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Position</p>
					<input type="text" class="form-control" id="sfPosition"
						placeholder="" value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultPosition()) ? consultService.getConsultPosition() : "" %>" />
				</div>
			</div>
			<div class="col-md-12">
				<p class="pt-2 common-para">Signature</p>
				<div class="signature_texarea mb-2"
					id="sectionFourSignatureImageHolder">
					<%if(Validator.isNotNull(serviceSignUrl)){ %>
						<img src="<%=serviceSignUrl%>"  width="100" height="100"/>
					<%} %>
					</div>
				<input type="file" id="sectionFourSignatureBtn" hidden=""
					name="<portlet:namespace/>sectionFourSignatureBtn"> <label
					for="sectionFourSignatureBtn" class="choose-sign-btn"> <span
					class="mr-2"> <svg width="14" height="17"
							viewBox="0 0 14 17" fill="none"
							xmlns="http://www.w3.org/2000/svg"> 
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
					<input type="date" class="form-control" id="sfDate" placeholder=""
						value="<%=Validator.isNotNull(consultService) && Validator.isNotNull(consultService.getConsultDate()) ? new SimpleDateFormat("yyyy-MM-dd").format(consultService.getConsultDate()) : "" %>" />
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveComName" onClick="addConsultancyServicesInfo(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg">
                <pathd
					="M6.00016 11.17L1.83016 6.99997L0.410156 8.40997L6.00016 14L18.0002 1.99997L16.5902
                    0.589966L6.00016 11.17Z" fill="#1B1917" />
            </svg>
		</span>
	</button>
</div>
<div class="tab-pane newForm22000 hide" role="tabpanel" id="childStep10">
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
					<input type="text" class="form-control" id="nameOfOrganizationFo"
						value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getNameOfOrganization()) ? quotationFormTwo.getNameOfOrganization() : "" %>" placeholder=""  oninput="quotationdetailSecondCatInfo();"/>
						<p class="tab-form-sub-heading fieldAlert hide" id="nameOfOrganizationFoValidation" style="color: red;">Enter a Name of organization</p>
										</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">2.</span>Address</p>
					<textarea rows="3" id="addressFo" class="form-control"
						maxlength="255" placeholder="Enter Address"
						style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getAddress()) ? quotationFormTwo.getAddress() : "" %></textarea>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">3.</span>Telephone number</p>
					<input type="text" class="form-control" id="telephoneNumberFo"
						value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getTelephoneNumber()) ? quotationFormTwo.getTelephoneNumber() : ""%>" placeholder="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.</span>Fax number</p>
					<input type="text" class="form-control" id="faxNumberFo" value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getFaxNumber()) ? quotationFormTwo.getFaxNumber() : ""%>"
						placeholder="" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">5.</span>E-mail address *</p>
					<input type="text" class="form-control" id="emailAddressFo" value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getEmailAddress()) ? quotationFormTwo.getEmailAddress() : ""%>"
						placeholder="" oninput="quotationdetailSecondCatInfo();"/>
						<p class="tab-form-sub-heading fieldAlert hide" id="emailAddressFoValidation" style="color: red;">Enter a valid E-mail Address</p>
				</div>
			</div>
			<%-- <div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Position</p>
					<input type="text" class="form-control" id="positionFirstFo" value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getHeadOfOrganization()) ? quotationFormTwo.getHeadOfOrganization() : ""%>"
						placeholder="" />
				</div>
			</div> --%>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.</span>Contact person</p>
					<input type="text" class="form-control" id="contactPersonNameFo"
						value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getContactPersonName()) ? quotationFormTwo.getContactPersonName() : ""%>" placeholder="" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.</span>Position</p>
					<input type="text" class="form-control" id="positionSecondFo"
						value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getPositionSecondFo()) ? quotationFormTwo.getPositionSecondFo() : "" %>" placeholder="" />
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.</span>Which management system(s) has
						your organization implemented or is in the process of
						implementing?</p>
					<textarea rows="3" id="managementSystemFo" class="form-control"
						maxlength="255" placeholder=""
						style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getManagementSystemFo()) ? quotationFormTwo.getManagementSystemFo() : ""%></textarea>
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9a.</span>Have you determined the scope
							of the certification which you are seeking?</p>
						<div class="wizard-form-radio">
							<input value="Yes" type="radio" name="orgDeterminedTheScopeFo" <%=quotationFormTwo != null && quotationFormTwo.getDeterminedTheScope().equals("Yes") ? "checked"
							: StringPool.BLANK%>/> <label
								for="">Yes</label>
						</div>
						<div class="wizard-form-radio">
							<input value="No" type="radio" name="orgDeterminedTheScopeFo" <%=quotationFormTwo != null && quotationFormTwo.getDeterminedTheScope().equals("No") ? "checked"
							: StringPool.BLANK%>/> <label
								for="">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group hide pleaseStateTheScopeFo">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9b.</span>Please state the scope along with a corporate brochure or relevant
					documents defining the nature and scope of your operations.
					</p>
					<!-- <textarea rows="3" id="scope" class="form-control" maxlength="255" placeholder="" style="border-radius: 5px; width: 100%"></textarea> -->
					<div class="supporting-document-card my-3">
						<div class="row">
							<div class="col-md-12">
								<div class="supporting-document-card-wrapper">
									<div class="left">
										<p class="supporting-document-card-upper-heading">Attach
											File</p>
									</div>
									<div class="right">
										<input type="file" id="operationScopeBroch"
											onchange="attachDetailed(this.id)" hidden="" multiple=""
											name="<portlet:namespace/>operationScopeBroch"> <label class="custom-upload"
											for="operationScopeBroch"> <span class="mr-2"> <svg
													width="14" height="17" viewBox="0 0 14 17" fill="none"
													xmlns="http://www.w3.org/2000/svg">
                                        <path
														d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
														fill="#047247"></path>
                                    </svg>
										</span>Upload
										</label>
									</div>
								</div>
								<span class="attach-detailed-overview"><%=(Validator.isNotNull(operationScope))?operationScope:""%></span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.</span>Number of product types</p>
					<input type="text" class="form-control" id="productTypes" value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getProductTypes()) ? quotationFormTwo.getProductTypes() : "" %>"
						placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.</span>Number of product lines</p>
					<input type="text" class="form-control" id="productLine" value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getProductLine()) ? quotationFormTwo.getProductLine() : "" %>"
						placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.</span>Number of HACCP Studies</p>
					<input type="text" class="form-control" id="haccpStudies" value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getHaccpStudies()) ? quotationFormTwo.getHaccpStudies() : "" %>"
						placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.</span>Number of critical control
						points</p>
					<input type="text" class="form-control" id="criticalControlPoints"
						value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getCriticalControlPoints()) ? quotationFormTwo.getCriticalControlPoints() : ""%>" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.</span>Number of operational
						prerequisites programmes</p>
					<input type="text" class="form-control" id="operationalNumber"
						value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getOperationalNumber()) ? quotationFormTwo.getOperationalNumber() : "" %>" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">15.</span>Size of the production
						facilities (in sq metres)</p>
					<input type="text" class="form-control" id="productionSize"
						value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getProductionSize()) ? quotationFormTwo.getProductionSize() : ""%>" placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">16.</span>Size of any warehouse
						facilities on site (in sq metres)</p>
					<input type="text" class="form-control" id="warehouseSize" value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getWarehouseSize()) ? quotationFormTwo.getWarehouseSize() : ""%>"
						placeholder=""
						oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');" />
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">17.</span>Please Detail the
						processes/activities involved in manufacture/service?</p>
					<input type="text" class="form-control" id="warehouseDetailSize" value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getWarehouseDetailSize()) ? quotationFormTwo.getWarehouseDetailSize() : "" %>"
						placeholder="" />
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">18.</span>Is your process seasonal?</p>
					<input type="text" class="form-control" id="seasonalProcess"
						value="<%=Validator.isNotNull(quotationFormTwo) && Validator.isNotNull(quotationFormTwo.getSeasonalProcess()) ? quotationFormTwo.getSeasonalProcess() : "" %>" placeholder="" />
				</div>
			</div>
			<div class="col-md-12">
				<p class="tab-form-main-heading">
					<b>This information will allow the NCBJ to provide a quotation
						for certification based on the information provided. In order to
						satisfy accreditation body requirements and ensure a successful
						audit, the NCBJ is required to confirm the organization's status,
						preparation for certification and the time required for the
						certification audits. </b>
				</p>
			</div>


		</div>
	</div>
</div>

<script>
$("input[name='companyUsedFour']").change(function() {
	   if($(this).val() == "Yes"){
	      $(".companyUsedFourBox, .companyUsedFourBoxPreview").addClass("hide");
	   }else{
		   $(".companyUsedFourBox, .companyUsedFourBoxPreview").removeClass("hide");
	   }
	});
	
function quotationdetailSecondCatInfo(){
	nameOfOrganizationFo = $("#nameOfOrganizationFo").val();
	emailAddressFo = $("#emailAddressFo").val();
		  if (nameOfOrganizationFo.trim() !== "" && emailAddressFo.trim() !== "") {
			  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			 if(emailAddressFo.match(mailformat)){ 
				  $("#ncbjFormsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
				  $("#emailAddressFoValidation").addClass("hide");
				}else{
					$("#ncbjFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					$("#emailAddressFoValidation").removeClass("hide");
					$("#emailAddressFoValidation").text("Please enter valid E-mail address");
				}
		  } else {
			  $("#ncbjFormsFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		  }
	}
</script>
