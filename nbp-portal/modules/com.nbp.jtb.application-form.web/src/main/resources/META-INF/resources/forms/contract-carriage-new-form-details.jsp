<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<%
String listDriverSign="";
int contractVehicleRegisterDetailVal=1;
int contractDriverListDetailVal=1;
%>
<div class="contract-carriage-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep17">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application For Permit
								To Operate In The Tourism Industry</p>
							<p class="tab-form-title-subtitle f2">Contract Carriage
								Operator</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner *</p>
								<input type="text" class="form-control"
									id="newContractOwnerName" placeholder="" value="<%=Validator.isNotNull(contractCarriage)&&Validator.isNotNull(contractCarriage.getOwnerName())?contractCarriage.getOwnerName():"" %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="newContractOwnerNameValidation" style="color: red;">Enter Name of Owner</p>	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Home Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="newContractHomeAddress" placeholder=""
									style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(contractCarriage)&&Validator.isNotNull(contractCarriage.getHomeAddress())?contractCarriage.getHomeAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control" id="newContractEmail"
									placeholder="info@example.jm" value="<%=Validator.isNotNull(contractCarriage)&&Validator.isNotNull(contractCarriage.getEmail())?contractCarriage.getEmail():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="newContractEmailValidation" style="color: red;">Please Enter E-mail address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									No.</p>
								<input type="text" class="form-control"
									id="newContractTelephone" value="<%=Validator.isNotNull(contractCarriage)&&Validator.isNotNull(contractCarriage.getTelephone())?contractCarriage.getTelephone():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">TRN No.</p>
								<input type="text" class="form-control"
									id="newContractTrn" value="<%=Validator.isNotNull(contractCarriage)&&Validator.isNotNull(contractCarriage.getNewContractTrn())?contractCarriage.getNewContractTrn():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="newContractParish">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston" <%=contractCarriage!=null?contractCarriage.getParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew" <%=contractCarriage!=null?contractCarriage.getParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
										<option value="Portland" <%=contractCarriage!=null?contractCarriage.getParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas" <%=contractCarriage!=null?contractCarriage.getParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
										<option value="St. Catherine" <%=contractCarriage!=null?contractCarriage.getParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
										<option value="St. Mary" <%=contractCarriage!=null?contractCarriage.getParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
										<option value="St. Ann" <%=contractCarriage!=null?contractCarriage.getParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
										<option value="Manchester" <%=contractCarriage!=null?contractCarriage.getParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon" <%=contractCarriage!=null?contractCarriage.getParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover" <%=contractCarriage!=null?contractCarriage.getParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland" <%=contractCarriage!=null?contractCarriage.getParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James" <%=contractCarriage!=null?contractCarriage.getParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
										<option value="Trelawny" <%=contractCarriage!=null?contractCarriage.getParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth" <%=contractCarriage!=null?contractCarriage.getParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="newContractDate"
									max="9999-12-31" placeholder="" value="<%=contractCarriage!=null&&contractCarriage.getNewContractDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(contractCarriage.getNewContractDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Vehicles in Fleet</p>
								<input type="text" class="form-control"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="newContractVehiclesNo" value="<%=Validator.isNotNull(contractCarriage)&&Validator.isNotNull(contractCarriage.getNewContarctVehiclesNo())?contractCarriage.getNewContarctVehiclesNo():"" %>" placeholder="">
							</div>
						</div>
						<!-- <div class="col-md-12">
							<p class="tab-form-main-heading"
								for="new-accomadation-type-offered"
								id="nonHotelAccomadationTypeOffered">Organization</p>
							<div class="radioBox">
								<div class="form-group">
									<div class="wizard-form-radio d-block">
										<input value="Juta" id="radio1" type="radio"
											name="offeredOrganization"> <label for="radio1"
											class="common-para">Juta</label>
									</div>
									<div class="wizard-form-radio d-block">
										<input value="Jcal" id="radio2" type="radio"
											name="offeredOrganization"> <label for="radio2"
											class="common-para">Jcal</label>
									</div>
									<div class="wizard-form-radio d-block">
										<input value="Maxi" id="radio3" type="radio"
											name="offeredOrganization"> <label for="radio3"
											class="common-para">Maxi</label>
									</div>
									<div class="wizard-form-radio d-block">
										<input value="Ind" id="radio4" type="radio"
											name="offeredOrganization"> <label for="radio4"
											class="common-para">Ind</label>
									</div>
									<div class="wizard-form-radio d-block">
										<input value="Tour" id="radio5" type="radio"
											name="offeredOrganization"> <label for="radio5"
											class="common-para">Tour</label>
									</div>
								</div>
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Organization</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" id="contractOrganization">
										<option value="" selected="" disabled="">Please
											Select</option>
										<option value="Juta" <%=contractCarriage!=null?contractCarriage.getContractOrganization().equals("Juta")?"selected":"":StringPool.BLANK%>>Juta</option>
										<option value="Jcal" <%=contractCarriage!=null?contractCarriage.getContractOrganization().equals("Jcal")?"selected":"":StringPool.BLANK%>>Jcal</option>
										<option value="Maxi" <%=contractCarriage!=null?contractCarriage.getContractOrganization().equals("Maxi")?"selected":"":StringPool.BLANK%>>Maxi</option>
										<option value="Independent" <%=contractCarriage!=null?contractCarriage.getContractOrganization().equals("Independent")?"selected":"":StringPool.BLANK%>>Independent</option>
										<option value="Tour Operator" <%=contractCarriage!=null?contractCarriage.getContractOrganization().equals("Tour Operator")?"selected":"":StringPool.BLANK%>>Tour Operator</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-title mb-0 mt-3 f2">Section I</p>
							<input id="contractVehicleRegisterDetailVal" type="hidden"
								name="contractVehicleRegisterDetailVal" value="1">
							
								<div class="accordion secured-accordian"
									id="contractVehicleRegisterDetailBox">
									<div class="accordion__header is-active"
										id="contractVehicleRegisterDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>List Vehicle Registration Information Being Applied For</h2>
												</div>
											</div>
										</div>
										<div>
											<p class="accordian-employee mb-0 common-para"></p>
										</div>
									</div>
									<div class="accordion__body is-active">
										<div class="row">
											<div class="col-md-4">
												<div class="form-group">
													<p class="tab-form-main-heading">Year</p>
													<input type="text" class="form-control "
														id="contractVehicleRegisterYear" placeholder=""
														oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
														value="">
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<p class="tab-form-main-heading">Make/Model</p>
													<input type="text" class="form-control"
														id="contractVehicleRegisterModel" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<p class="tab-form-main-heading">Plate #</p>
													<input type="text" class="form-control"
														id="contractVehicleRegisterPlate" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Regis.Exp.Date</p>
													<input type="date" class="form-control"
														id="contractVehicleRegisterExpDate" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Fitness Exp.Date</p>
													<input type="date" class="form-control"
														id="contractVehicleRegisterFitnessDate" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<p class="tab-form-main-heading">Chassis #</p>
													<input type="text" class="form-control"
														id="contractVehicleRegisterChassis" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<p class="tab-form-main-heading">Vehicle based at</p>
													<input type="text" class="form-control"
														id="contractVehicleRegisterBased" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-4">
												<div class="form-group">
													<p class="tab-form-main-heading">Insurance Company</p>
													<input type="text" class="form-control"
														id="contractVehicleRegisterInsuranceCom" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Policy Number</p>
													<input type="text" class="form-control "
														id="contractVehicleRegisterPolicyNum" placeholder=""
														oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
														value="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Insurance Expiry Date</p>
													<input type="date" class="form-control"
														id="contractVehicleRegisterExpiryDate" value="" placeholder="">
												</div>
											</div>
											<!-- <div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Plate Number</p>
													<input type="text" class="form-control "
														id="contractVehicleRegisterPlateNum" placeholder=""
														oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
														value="">
												</div>
											</div> -->
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addContractVehicleRegisterDetail" onclick="addContractVehicleRegisterDetail();">
													<span>+ 1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							
							<div
								class="col-12 table-responsive hide addContractVehicleRegisterDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addContractVehicleRegisterDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Year</th>
											<th class="sub_heading text-nowrap">Make/Model</th>
											<th class="sub_heading text-nowrap">Plate #</th>
											<th class="sub_heading text-nowrap">Regis.Exp.Date</th>
											<th class="sub_heading text-nowrap">Fitness Exp.Date</th>
											<th class="sub_heading text-nowrap">Chassis #</th>
											<th class="sub_heading text-nowrap">Vehicle Based at</th>
											<th class="sub_heading text-nowrap">Insurance Company</th>
											<th class="sub_heading text-nowrap">Policy Number</th>
											<th class="sub_heading text-nowrap">Insurance Expiry Date</th>
											<!-- <th class="sub_heading text-nowrap">Plate Number</th> -->
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
		<%if(Validator.isNotNull(listVehicleRegstAdd)&&listVehicleRegstAdd.size()>0){
		for(JtbAddListVehicleRegst vehicleRegst:listVehicleRegstAdd){ %>
		<tr class="contract-Vehicle-detail-row<%=contractVehicleRegisterDetailVal%>">
	<td class="sub_heading_content contractVehicleRegisterYear<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstYear())?vehicleRegst.getVehicleRegstYear():""%></td>
	<td class="sub_heading_content contractVehicleRegisterModel<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstModel())?vehicleRegst.getVehicleRegstModel():""%></td>
	<td class="sub_heading_content contractVehicleRegisterPlate<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstPlate())?vehicleRegst.getVehicleRegstPlate():""%></td>
	<td class="sub_heading_content contractVehicleRegisterExpDate<%=contractVehicleRegisterDetailVal%>">
	<%=vehicleRegst!=null&&vehicleRegst.getVehicleRegstExpDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(vehicleRegst.getVehicleRegstExpDate()):"" %>
	</td>
	<td class="sub_heading_content contractVehicleRegisterFitnessDate<%=contractVehicleRegisterDetailVal%>">
	<%=vehicleRegst!=null&&vehicleRegst.getVehicleRegstFitnessDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(vehicleRegst.getVehicleRegstFitnessDate()):"" %>
	</td>
	<td class="sub_heading_content contractVehicleRegisterChassis<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstChassis())?vehicleRegst.getVehicleRegstChassis():""%></td>
	<td class="sub_heading_content contractVehicleRegisterBased<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstBased())?vehicleRegst.getVehicleRegstBased():""%></td>
	<td class="sub_heading_content contractVehicleRegisterInsuranceCom<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstInsuranceCom())?vehicleRegst.getVehicleRegstInsuranceCom():""%></td>
	<td class="sub_heading_content contractVehicleRegisterPolicyNum<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstPolicyNum())?vehicleRegst.getVehicleRegstPolicyNum():""%></td>
	<td class="sub_heading_content contractVehicleRegisterExpiryDate<%=contractVehicleRegisterDetailVal%>">
	<%=vehicleRegst!=null&&vehicleRegst.getVehicleRegstExpiryDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(vehicleRegst.getVehicleRegstExpiryDate()):"" %>
	</td>
	 <td> 
		<span> 
			<a href="javascript:void(0)" id="contractVehicleRegisterDetailEditTab" onclick="contractVehicleRegisterDetailEditTab('<%=contractVehicleRegisterDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="contractVehicleRegisterDetailDeleteData" onclick="contractVehicleRegisterDetailDeleteData('<%=contractVehicleRegisterDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="contractVehicleRegisterDetailId<%=contractVehicleRegisterDetailVal%>" name="contractVehicleRegisterDetailId<%=contractVehicleRegisterDetailVal%>" value="<%=vehicleRegst.getJtbAddListVehicleRegstId()%>">
</tr>
<%contractVehicleRegisterDetailVal=contractVehicleRegisterDetailVal+1;
	}} %>
									</tbody>
								</table>
							</div>
						</div>

						
							<input id="contractDriverListDetailVal" type="hidden"
								name="contractDriverListDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian"
									id="contractDriverListDetailBox">
									<div class="accordion__header is-active"
										id="contractDriverListDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>List of Driver(s)</h2>
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
													<p class="tab-form-main-heading">Name of Driver(s)</p>
													<input type="text" class="form-control"
														id="contractDriverListName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Driver's Licence / Trn</p>
													<input type="text" class="form-control "
														id="contractDriverListLicence" placeholder=""
														oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
														value="">	
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Expiry Date</p>
													<input type="date" class="form-control"
														id="contractDriverListExpiryDate" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<p class="pt-2 common-para">Signature</p>
												
										        <%
													if (Validator.isNotNull(listDriverSign)) {
												%>
													<div class="signature_texarea mb-2" id="driverSignature">
													<img src="<%=listDriverSign%>" class="thumb-image"
														style="height: 100px; width: 100px;">
												</div>
												<%
													} else {
												%>
												<div class="signature_texarea mb-2" id="driverSignature"></div>
												<%
													}
												%>
												<input type="file" id="contractDriverListSignatureUpload"
													name="contractDriverListSignatureUpload"
													onchange="contractDriverListSignatureUpload" hidden=""> <label
													for="contractDriverListSignatureUpload" class="choose-sign-btn"> <span
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
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addContractDriverListDetail" onclick="addContractDriverListDetail();">
													<span>+ 1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div
								class="col-12 table-responsive hide addContractDriverListDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addContractDriverListDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Name of Driver(s)</th>
											<th class="sub_heading text-nowrap">Driver's Licence/Trn</th>
											<th class="sub_heading text-nowrap">Expiry Date</th>
											<th class="sub_heading text-nowrap">Signature</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
	<%
	List<DLFileEntry> fileEntry = new ArrayList<DLFileEntry>();
	DLFolder supportingDocumentsParentFolder = null;
	DLFolder supportingDocumentSubFolderManagment = null;
	 try {
			supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JTB Supported Documents");
			supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentFolder.getFolderId(), String.valueOf(jtbApplicationId));
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	if(Validator.isNotNull(listDriverAdd)&&listDriverAdd.size()>0){
	for(JtbAddListDriverInfo driverInfo:listDriverAdd){ 
		FileEntry attachDocFE1=null;
		listDriverSign="";      
	                         
            try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Driver's Signature"+contractDriverListDetailVal);
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			System.out.println("--------------------------fileEntry-------------"+fileEntry);		
			for (DLFileEntry dlFileEntry : fileEntry) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				listDriverSign=DLURLHelperUtil.getPreviewURL(attachDocFE1,
						attachDocFE1.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		%>

	<tr class="contract-driver-list-detail-row<%=contractDriverListDetailVal%>">
	<td class="sub_heading_content contractDriverListName<%=contractDriverListDetailVal%>">
	<%=Validator.isNotNull(driverInfo)&&Validator.isNotNull(driverInfo.getDriverName())?driverInfo.getDriverName():""%></td>
	<td class="sub_heading_content contractDriverListLicence<%=contractDriverListDetailVal%>">
	<%=Validator.isNotNull(driverInfo)&&Validator.isNotNull(driverInfo.getDriverLicence())?driverInfo.getDriverLicence():""%></td>
	<td class="sub_heading_content contractDriverListExpiryDate<%=contractDriverListDetailVal%>">
	<%=driverInfo!=null&&driverInfo.getDriverExpiryDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(driverInfo.getDriverExpiryDate()):"" %></td>
	<td class="sub_heading_content driverSignature<%=contractDriverListDetailVal%>">
    <div class="signature_texarea mb-2" id="driverSignature">
	<img src="<%=listDriverSign%>" class="thumb-image"
	  style="height: 100px; width: 100px;">
    </div>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="contractDriverListDetailEditTab" onclick="contractDriverListDetailEditTab('<%=contractDriverListDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="contractDriverListDetailDeleteData" onclick="contractDriverListDetailDeleteData('<%=contractDriverListDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>
     </td>
     <input type="hidden" id="contractDriverListDetailId<%=contractDriverListDetailVal%>" name="contractDriverListDetailId<%=contractDriverListDetailVal%>" value="<%=driverInfo.getJtbAddListDriverInfoId() %>">
</tr>
<%contractDriverListDetailVal=contractDriverListDetailVal+1;
	}} %>
									</tbody>
								</table>
							</div>
						

					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="contractCarriageDetailFormInfo(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right mt-3">
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
		<div class="tab-pane" role="tabpanel" id="childStep18">
			<div class="tab-form">
				<div class="hotel-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">General Declarations</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">1. I hereby apply for a
								permit to operate in the Tourism Industry in accordance with the
								provisions of the Tourist Board Act.</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2 pt-3">2. I Declare that</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">(a) The driver assigned to the
									operation of this vehicle will be in possession of relevant
									documents as to his/her authority and qualification to perform
									the service of Driver/Guide in the Tourism Industry</li>
								<li class="list-group-item">(b) Current Road Map will be
									available in the vehicle for reference/checking
									routes/distances etc. and that while on duty, the driver will
									be properly attired/uniformed</li>
								<li class="list-group-item">(c) The vehicle will be
									equipped at all times with jack/spare tyre/basic tools</li>
								<li class="list-group-item">(d) The vehicle will at all
									times be presented for service in a clean and tidy condition</li>
							</ul>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para"> Signature of Owner/Operator</p>
							<div class="signature_texarea mb-2"
								id="ownerSignatureHotelImageHolder">
								<%if(Validator.isNotNull(carriageDoc)){ %>
								<img src="<%=carriageDoc%>"  width="100" height="100"/>
								<%} %>
								</div>
							<input type="file" id="ownerSignatureHotelBtn" hidden=""
								name="<portlet:namespace/>ownerSignatureHotelBtn"> <label
								for="ownerSignatureHotelBtn" class="choose-sign-btn">
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
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control"
									id="OwnerSignDate" max="9999-12-31" placeholder=""
									value="<%=contractCarriage!=null&&contractCarriage.getOwnerSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(contractCarriage.getOwnerSignDate()):StringPool.BLANK %>">
							</div>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
