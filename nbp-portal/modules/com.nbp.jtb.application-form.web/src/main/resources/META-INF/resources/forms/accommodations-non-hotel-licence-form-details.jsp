<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="non-hotel-accomadation-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep3">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application Licence For
								Resort Cottages Accommodation</p>
							<p class="tab-form-title-subtitle f2">Resort Cottages\Guest
								Houses\Apartment\Villas</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Accommodation</p>
								<input type="text" class="form-control mt-3"
									id="nonHotelAccommodationName" placeholder="" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getAccoName()) ? accoNonHotelLic.getAccoName() : "" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="nonHotelAccommodationValidation" style="color: red;">Please
									Enter Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="nonHotelAccomadationAddress" placeholder=""
									style="border-radius: 5px; width: 100%"><%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getAccoAddress()) ? accoNonHotelLic.getAccoAddress() : "" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone</p>
								<input type="text" class="form-control"
									id="nonHotelAccomadationTelephone" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getAccoTeleNo()) ? accoNonHotelLic.getAccoTeleNo() : "" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email address *</p>
								<input type="text" class="form-control"
									id="nonHotelAccomadationEmail" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getAccoEmail()) ? accoNonHotelLic.getAccoEmail() : "" %>"
									placeholder="info@companyname.jm" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="nonHotelAccomadationEmailValidation" style="color: red;">Enter a valid E-mail Address</p>	
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									id="nonHotelAccomadationEmployeesNum" placeholder="" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getAccoNoOfEmp()) ? accoNonHotelLic.getAccoNoOfEmp() : "" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading"
								for="new-accomadation-type-offered"
								id="nonHotelAccomadationTypeOffered">Type of accommodation
								to be offered</p>
								<div class="radioBox">
									<div class="wizard-form-radio d-block">
										<input value="Villa" id="radio1" type="radio"
											name="offeredAccomadation" <%=accoNonHotelLic!=null &&accoNonHotelLic.getAccoOfferedType().equals("Villa")?"checked":StringPool.BLANK%>> <label for="radio1"
											class="common-para">Villa</label>
									</div>
									<div class="wizard-form-radio d-block">
										<input value="Guest House" id="radio3" type="radio"
											name="offeredAccomadation" <%=accoNonHotelLic!=null &&accoNonHotelLic.getAccoOfferedType().equals("Guest House")?"checked":StringPool.BLANK%>> <label for="radio3"
											class="common-para">Guest House</label>
									</div>
									<div class="wizard-form-radio d-block">
										<input value="Apartment" id="radio4" type="radio"
											name="offeredAccomadation" <%=accoNonHotelLic!=null &&accoNonHotelLic.getAccoOfferedType().equals("Apartment")?"checked":StringPool.BLANK%>> <label for="radio4"
											class="common-para">Apartment</label>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Rooms</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									id="nonHotelAccomadationRoomNum" placeholder="Number of rooms"
									value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getNoOfRooms()) ? accoNonHotelLic.getNoOfRooms() : "" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner *</p>
								<input type="text" class="form-control"
									id="nonHotelAccomadationOwnerName" placeholder="" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getOwnerName()) ? accoNonHotelLic.getOwnerName() : "" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="nonHotelAccomadationOwnerNameValidation" style="color: red;">Please
									Enter Owner Name</p>	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address of Owner</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="nonHotelAccomadationAddressOwner" placeholder=""
									style="border-radius: 5px; width: 100%"><%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getOwnerAddress()) ? accoNonHotelLic.getOwnerAddress() : "" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone</p>
								<input type="text" class="form-control"
									id="nonHotelAccomadationTelNo" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getOwnerTeleNo()) ? accoNonHotelLic.getOwnerTeleNo() : "" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="nonHotelAccomadationFaxNumber" placeholder="22345678"
									value="" />
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Operating Company</p>
								<input type="text" class="form-control"
									id="nonHotelAccomadationCompanyName" placeholder="" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getOperCompName()) ? accoNonHotelLic.getOperCompName() : "" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="nonHotelAccomadationAddressCompany" placeholder=""
									style="border-radius: 5px; width: 100%"><%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getOperAddress()) ? accoNonHotelLic.getOperAddress() : "" %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Manager</p>
								<input type="text" class="form-control"
									id="nonHotelAccomadationManagerName" placeholder="" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getManagerName()) ? accoNonHotelLic.getManagerName() : "" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255" id="nonHotelAccomadationAddressManager" placeholder=""
									style="border-radius: 5px; width: 100%"><%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getManagerAddress()) ? accoNonHotelLic.getManagerAddress() : "" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone</p>
								<input type="text" class="form-control"
									id="nonHotelAccomadationManagerTel" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getManagerTeleNo()) ? accoNonHotelLic.getManagerTeleNo() : "" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<!-- <div class="col-md-4">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="nonHotelAccomadationManagerFax" placeholder="22345678"
									value="" />
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email address</p>
								<input type="text" class="form-control"
									id="nonHotelAccomadationManagerEmail" value="<%= Validator.isNotNull(accoNonHotelLic) && Validator.isNotNull(accoNonHotelLic.getManagerEmail()) ? accoNonHotelLic.getManagerEmail() : "" %>"
									placeholder="info@companyname.jm" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addAccoNonHotelLicence(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep4">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Requirements to Be Met for
								Licensing of Non Hotel Accommodation</p>
						</div>
					</div>
					<div class="row">
						<!-- <div class="col-md-12">
							<p class="tab-form-title-subtitle f2 pt-3">Requirement for Licence</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">Public Liability Insurance</li>
								<li class="list-group-item">Public Health Certificate</li>
								<li class="list-group-item">Food Handler's Permit (where
									applicable)</li>
								<li class="list-group-item">Fire Certificate</li>
								<li class="list-group-item">Swimming Pool Permit (where
									applicable)</li>
								<li class="list-group-item">Fire Extinguisher</li>
								<li class="list-group-item">First Aid/Doctor on call</li>
								<li class="list-group-item">Adequate security (for example
									proper lighting, grilled windows/door, security personnel)</li>
								<li class="list-group-item">Uniformed staff</li>
								<li class="list-group-item">Hot water</li>
								<li class="list-group-item">Garbage cans with covers</li>
							</ul>
						</div> -->
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Requirement for Licence</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement1"
										value="Public Liability Insurance" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Public Liability Insurance")?"checked":StringPool.BLANK%> name="claimDebtor" name="licenceRequirement"> <label
										for="licenceRequirement1">
										<p class="tab-form-main-heading mb-0">Public Liability Insurance</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Public Health Certificate")?"checked":StringPool.BLANK%> name="claimDebtor" id="licenceRequirement2"
										value="Public Health Certificate"
										name="licenceRequirement"> <label for="licenceRequirement2">
										<p class="tab-form-main-heading mb-0">Public Health Certificate</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement3"
										value="Food Handler's Permit (where applicable)" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Food Handler's Permit (where applicable)")?"checked":StringPool.BLANK%> name="claimDebtor" name="licenceRequirement"> <label
										for="licenceRequirement3">
										<p class="tab-form-main-heading mb-0">Food Handler's Permit (where applicable)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement4"
										value="Fire Certificate" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Fire Certificate")?"checked":StringPool.BLANK%> name="claimDebtor"
										name="licenceRequirement"> <label for="licenceRequirement4">
										<p class="tab-form-main-heading mb-0">Fire Certificate</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement5"
										value="Swimming Pool Permit (where applicable)" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Swimming Pool Permit (where applicable)")?"checked":StringPool.BLANK%> name="claimDebtor"
										name="licenceRequirement"> <label for="licenceRequirement5">
										<p class="tab-form-main-heading mb-0">Swimming Pool Permit (where applicable)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement6"
										value="Fire Extinguisher" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Fire Extinguisher")?"checked":StringPool.BLANK%> name="claimDebtor"
										name="licenceRequirement"> <label for="licenceRequirement6">
										<p class="tab-form-main-heading mb-0">Fire Extinguisher</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement7"
										value="First Aid/Doctor on call" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("First Aid/Doctor on call")?"checked":StringPool.BLANK%> name="claimDebtor"
										name="licenceRequirement"> <label for="licenceRequirement7">
										<p class="tab-form-main-heading mb-0">First Aid/Doctor on call</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement8"
										value="Adequate security (for example proper lighting, grilled windows/door, security personnel)" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Adequate security (for example proper lighting, grilled windows/door, security personnel)")?"checked":StringPool.BLANK%> name="claimDebtor"
										name="licenceRequirement"> <label for="licenceRequirement8">
										<p class="tab-form-main-heading mb-0">Adequate security (for example proper lighting, grilled windows/door, security personnel)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement9"
										value="Uniformed staff" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Uniformed staff")?"checked":StringPool.BLANK%> name="claimDebtor"
										name="licenceRequirement"> <label for="licenceRequirement9">
										<p class="tab-form-main-heading mb-0">Uniformed staff</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement10"
										value="Hot water" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Hot water")?"checked":StringPool.BLANK%> name="claimDebtor"
										name="licenceRequirement"> <label for="licenceRequirement10">
										<p class="tab-form-main-heading mb-0">Hot water</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="licenceRequirement11"
										value="Garbage cans with covers" <%=reqLicence!=null &&reqLicence.getRequiredLicence().contains("Garbage cans with covers")?"checked":StringPool.BLANK%> name="claimDebtor"
										name="licenceRequirement"> <label for="licenceRequirement11">
										<p class="tab-form-main-heading mb-0">Garbage cans with covers</p>
									</label>
								</div>
							</div>
						</div>
						<!-- <div class="col-md-12">
							<p class="tab-form-title-subtitle f2 pt-3">Bedrooms</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">Ensure that mattresses are firm
									with mattress pads</li>
								<li class="list-group-item">Use white linen, preferably</li>
								<li class="list-group-item">Ensure drapes are always
									properly hung</li>
								<li class="list-group-item">Use bedside and bathrooms mats
									that wash easily</li>
								<li class="list-group-item">Try to make bedspreads and
									drapes match or colour coordinate</li>
								<li class="list-group-item">Ceiling fans to be provided</li>
								<li class="list-group-item">Double lock (security locks) on
									doors</li>
								<li class="list-group-item">Adequate lighting, especially
									lamp and bright bulbs for reading</li>
							</ul>
						</div> -->
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Bedrooms</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bedrooms1"
										value="Ensure that mattresses are firm with mattress pads" <%=reqLicence!=null &&reqLicence.getRequiredBedroom().contains("Ensure that mattresses are firm with mattress pads")?"checked":StringPool.BLANK%> name="bedrooms"> <label
										for="bedrooms1">
										<p class="tab-form-main-heading mb-0">Ensure that mattresses are firm with mattress pads</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bedrooms2"
										value="Use white linen, preferably" <%=reqLicence!=null &&reqLicence.getRequiredBedroom().contains("Use white linen, preferably")?"checked":StringPool.BLANK%>
										name="bedrooms"> <label for="bedrooms2">
										<p class="tab-form-main-heading mb-0">Use white linen, preferably</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bedrooms3"
										value="Ensure drapes are always properly hung" <%=reqLicence!=null &&reqLicence.getRequiredBedroom().contains("Ensure drapes are always properly hung")?"checked":StringPool.BLANK%> name="bedrooms"> <label
										for="bedrooms3">
										<p class="tab-form-main-heading mb-0">Ensure drapes are always properly hung</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bedrooms4"
										value="Use bedside and bathrooms mats that wash easily" <%=reqLicence!=null &&reqLicence.getRequiredBedroom().contains("Use bedside and bathrooms mats that wash easily")?"checked":StringPool.BLANK%>
										name="bedrooms"> <label for="bedrooms4">
										<p class="tab-form-main-heading mb-0">Use bedside and bathrooms mats that wash easily</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bedrooms5"
										value="Try to make bedspreads and drapes match or colour coordinate" <%=reqLicence!=null &&reqLicence.getRequiredBedroom().contains("Try to make bedspreads and drapes match or colour coordinate")?"checked":StringPool.BLANK%>
										name="bedrooms"> <label for="bedrooms5">
										<p class="tab-form-main-heading mb-0">Try to make bedspreads and drapes match or colour coordinate</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bedrooms6"
										value="Ceiling fans to be provided" <%=reqLicence!=null &&reqLicence.getRequiredBedroom().contains("Ceiling fans to be provided")?"checked":StringPool.BLANK%>
										name="bedrooms"> <label for="bedrooms6">
										<p class="tab-form-main-heading mb-0">Ceiling fans to be provided</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bedrooms7"
										value="Double lock (security locks) on doors" <%=reqLicence!=null &&reqLicence.getRequiredBedroom().contains("Double lock (security locks) on doors")?"checked":StringPool.BLANK%>
										name="bedrooms"> <label for="bedrooms7">
										<p class="tab-form-main-heading mb-0">Double lock (security locks) on doors</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bedrooms8"
										value="Adequate lighting, especially lamp and bright bulbs for reading" <%=reqLicence!=null &&reqLicence.getRequiredBedroom().contains("Adequate lighting, especially lamp and bright bulbs for reading")?"checked":StringPool.BLANK%>
										name="bedrooms"> <label for="bedrooms8">
										<p class="tab-form-main-heading mb-0">Adequate lighting, especially lamp and bright bulbs for reading</p>
									</label>
								</div>
							</div>
						</div>
						<!-- <div class="col-md-12">
							<p class="tab-form-title-subtitle f2 pt-3">Bathrooms</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">Ensure that they are properly
									cleaned</li>
								<li class="list-group-item">Shower curtains washed
									regularly</li>
								<li class="list-group-item">Tub mats or strips provided to
									prevent slipping</li>
								<li class="list-group-item">Hot water</li>
								<li class="list-group-item">Waste paper basket</li>
								<li class="list-group-item">Adequate soap, toilet paper</li>
								<li class="list-group-item">Ironing board and iron
									available for guest's use</li>
								<li class="list-group-item">A clothesline should be put
									over bathtubs for hanging light clothes</li>
							</ul>
						</div> -->
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Bathrooms</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bathrooms1"
										value="Ensure that they are properly cleaned" <%=reqLicence!=null &&reqLicence.getRequiredBathroom().contains("Ensure that they are properly cleaned")?"checked":StringPool.BLANK%> name="bathrooms"> <label
										for="bathrooms1">
										<p class="tab-form-main-heading mb-0">Ensure that they are properly
									cleaned</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bathrooms2"
										value="Shower curtains washed regularly" <%=reqLicence!=null &&reqLicence.getRequiredBathroom().contains("Shower curtains washed regularly")?"checked":StringPool.BLANK%>
										name="bathrooms"> <label for="bathrooms2">
										<p class="tab-form-main-heading mb-0">Shower curtains washed
									regularly</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bathrooms3"
										value="Tub mats or strips provided to prevent slipping" <%=reqLicence!=null &&reqLicence.getRequiredBathroom().contains("Tub mats or strips provided to prevent slipping")?"checked":StringPool.BLANK%> name="bathrooms"> <label
										for="bathrooms3">
										<p class="tab-form-main-heading mb-0">Tub mats or strips provided to
									prevent slipping</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bathrooms4"
										value="Hot water" <%=reqLicence!=null &&reqLicence.getRequiredBathroom().contains("Hot water")?"checked":StringPool.BLANK%>
										name="bathrooms"> <label for="bathrooms4">
										<p class="tab-form-main-heading mb-0">Hot water</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bathrooms5"
										value="Waste paper basket" <%=reqLicence!=null &&reqLicence.getRequiredBathroom().contains("Waste paper basket")?"checked":StringPool.BLANK%>
										name="bathrooms"> <label for="bathrooms5">
										<p class="tab-form-main-heading mb-0">Waste paper basket</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bathrooms6"
										value="Adequate soap, toilet paper" <%=reqLicence!=null &&reqLicence.getRequiredBathroom().contains("Adequate soap, toilet paper")?"checked":StringPool.BLANK%>
										name="bathrooms"> <label for="bathrooms6">
										<p class="tab-form-main-heading mb-0">Adequate soap, toilet paper</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bathrooms7"
										value="Ironing board and iron available for guest's use" <%=reqLicence!=null &&reqLicence.getRequiredBathroom().contains("Ironing board and iron available for guest's use")?"checked":StringPool.BLANK%>
										name="bathrooms"> <label for="bathrooms7">
										<p class="tab-form-main-heading mb-0">Ironing board and iron available for guest's use</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bathrooms8"
										value="A clothesline should be put over bathtubs for hanging light clothes" <%=reqLicence!=null &&reqLicence.getRequiredBathroom().contains("A clothesline should be put over bathtubs for hanging light clothes")?"checked":StringPool.BLANK%>
										name="bathrooms"> <label for="bathrooms8">
										<p class="tab-form-main-heading mb-0">A clothesline should be put over bathtubs for hanging light clothes</p>
									</label>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo(); addAccoNonHotelRequiredLic(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep5">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">General Declarations</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading pt-3">I hereby apply for the grant
								of a licence in respect of the Non-Hotel Accommodation in
								accordance with the provision of Section 23 of the Tourist Board
								Act</p>
								<p class="tab-form-main-heading">The attached list show the
									names and addresses of all the Directors, of all or any
									companies connected with the Non-Hotel Accommodation as owner,
									manager or operator</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="nonHotelAddress"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="nonHotelAddress">
													<label class="custom-upload" for="nonHotelAddress">
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
											<span class="attach-detailed-overview"><%=(Validator.isNotNull(resortAttached))?resortAttached:""%></span>
										</div>
									</div>
								</div>
							</div>
						</div>	
								
						<div class="col-md-12">
						    <p class="tab-form-title-subtitle f2">The previous experience of the operator is as follows</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Non-Hotel Accommodation Operator</p>
								<input type="text" class="form-control"
									id="accommodationNonHotelOperater" placeholder="John Doe"
									value="<%=Validator.isNotNull(accoNonHotelGenDec)&&Validator.isNotNull(accoNonHotelGenDec.getNhAccoOperatorName())?accoNonHotelGenDec.getNhAccoOperatorName():"" %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">From</p>
								<input type="date" class="form-control"
									id="newHotelAccomadationFromDate" max="9999-12-31" placeholder=""
									value="<%=accoNonHotelGenDec!=null&&accoNonHotelGenDec.getDateFrom()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoNonHotelGenDec.getDateFrom()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">To</p>
								<input type="date" class="form-control"
									id="newHotelAccomadationToDate" max="9999-12-31" placeholder=""
									value="<%=accoNonHotelGenDec!=null&&accoNonHotelGenDec.getDateTo()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoNonHotelGenDec.getDateTo()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Non-Hotel Accommodation since</p>
								<input type="date" class="form-control"
									id="newAccomadationSince" max="9999-12-31" placeholder=""
									value="<%=accoNonHotelGenDec!=null&&accoNonHotelGenDec.getNhAccoSince()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoNonHotelGenDec.getNhAccoSince()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control"
									id="newHotelAccomadationSignDate" max="9999-12-31" placeholder=""
									value="<%=accoNonHotelGenDec!=null&&accoNonHotelGenDec.getNhAccoDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(accoNonHotelGenDec.getNhAccoDate()):StringPool.BLANK %>">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2" id="signatureNonHotelImageHolder">
							<%if(Validator.isNotNull(resortSignApp)){ %>
							<img src="<%=resortSignApp%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="signatureNonHotelBtn" hidden=""
								name="<portlet:namespace/>signatureNonHotelBtn"> <label
								for="signatureNonHotelBtn" class="choose-sign-btn">
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
</div>
</div>