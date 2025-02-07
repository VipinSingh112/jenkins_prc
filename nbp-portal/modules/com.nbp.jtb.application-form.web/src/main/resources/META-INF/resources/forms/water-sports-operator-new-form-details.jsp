<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<div class="water-sports-operator-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep14">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Tourist Board Act (1985)</p>
							<p class="tab-form-title-subtitle f2">Application for
								Watersports Operator's Licence</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Business</p>
								<input type="text" class="form-control mt-3"
									id="waterSportBusinessName" placeholder="" value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportBusinessName())?waterSport.getWaterSportBusinessName():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Mailing Address</p>
								<textarea rows="3" class="form-control" maxlength="255" id="waterSportMailingaAdd" value="" placeholder="Mailing address" 
								style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportMailingaAdd())?waterSport.getWaterSportMailingaAdd():"" %></textarea>
								<!-- <p class="tab-form-sub-heading fieldAlert hide"
									id="newAccommodationEmailValidation" style="color: red;"></p> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Exact Location of Business</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="waterSportOpLocationAddress" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpLocationAddr())?waterSport.getWaterSportOpLocationAddr():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Phone No.</p>
								<input type="text" class="form-control" id="waterSportOpPhone"
									value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpPhone())?waterSport.getWaterSportOpPhone():"" %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="waterSportOpFaxNum" placeholder="22345678" value="" />
							</div>
						</div> -->
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control" id="waterSportOpEmail"
									placeholder="info@example.jm" value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpEmail())?waterSport.getWaterSportOpEmail():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="waterSportOpEmailValidation" style="color: red;">Please Enter E-mail Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Owner *</p>
								<input type="text" class="form-control mt-3"
									id="waterSportOpOwnerName" placeholder="John Doe" value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpOwnerName())?waterSport.getWaterSportOpOwnerName():"" %>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="waterSportOpOwnerNameValidation" style="color: red;">Please Enter Owner Name</p>	
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address of Owner</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="waterSportOpAddressOwner" placeholder=""
									style="border-radius: 5px; width: 100%" spellcheck="false"><%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpAddressOwner())?waterSport.getWaterSportOpAddressOwner():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Manager/Director</p>
								<input type="text" class="form-control mt-3"
									id="waterSportOpManagerName" placeholder="" value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpManagerName())?waterSport.getWaterSportOpManagerName():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant</p>
								<input type="text" class="form-control mt-3"
									id="waterSportOpApplicantName" placeholder="" value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpApplicantName())?waterSport.getWaterSportOpApplicantName():"" %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Nationality</p>
								<%-- <input type="text" class="form-control mt-3"
									id="waterSportOpNationality" placeholder="" value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpNationality())?waterSport.getWaterSportOpNationality():"" %>" /> --%>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control nationality-list" name="pselect" id="waterSportOpNationality">
										<option value="" disabled="" selected="">Please
											Select</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Number of Employees</p>
								<input type="text" class="form-control mt-3" oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"
									id="waterSportOpEmployeesNo" placeholder="" value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpEmployeesNo())?waterSport.getWaterSportOpEmployeesNo():"" %>" />
							</div>
						</div>

<%-- <div class="col-md-6">
	<div class="form-group">
		<p class="tab-form-main-heading">List of Activities</p>
		<input type="text" class="form-control mt-3"
			id="waterSportOpActivitiesList" name="waterSportOpActivitiesList" placeholder="" value="<%=Validator.isNotNull(waterSport)&&Validator.isNotNull(waterSport.getWaterSportOpActivityList())?waterSport.getWaterSportOpActivityList():"" %>" />
			<p class="tab-form-sub-heading">Separate values with Enter</p> 
		<div class="select-wrapper position-relative">
			<select class="form-select form-control" name="pselect"
				id="waterSportOpActivitiesList">
				<option value="" disabled="" selected="">Please
					Select</option>
				<option value="Personal Water Craft" <%=waterSport!=null?waterSport.getWaterSportOpActivityList().equals
						("Personal Water Craft")?"selected":"":StringPool.BLANK%>>Personal Water Craft (Jet Ski/Wave Runner)</option>
				<option value="Water Ski" <%=waterSport!=null?waterSport.getWaterSportOpActivityList().equals("Water Ski")?
						"selected":"":StringPool.BLANK%>>Water Ski</option>
				<option value="Sunfish Sail" <%=waterSport!=null?waterSport
						.getWaterSportOpActivityList().equals("Sunfish Sail")?"selected":"":StringPool.BLANK%>>Sunfish Sail</option>
				<option value="Parasail" <%=waterSport!=null?waterSport.getWaterSportOpActivityList().equals("Parasail")
						?"selected":"":StringPool.BLANK%>>Parasail</option>
				<option value="Scuba Diving" <%=waterSport!=null?w
						aterSport.getWaterSportOpActivityList().equals("Scuba Diving")?"selected":"":StringPool.BLANK%>>Scuba Diving</option>
				<option value="Glass Bottom Boat/Cruise" <%=waterSport!=null?waterSport.getWaterSportOpActivityList()
						.equals("Glass Bottom Boat/Cruise")?"selected":"":StringPool.BLANK%>>Glass Bottom Boat/Cruise</option>
				<option value="Banana Boat Ride" <%=waterSport!=null?waterSport.getWaterSportOpActivityList().equals(
						"Banana Boat Ride")?"selected":"":StringPool.BLANK%>>Banana Boat Ride</option>
			</select>
		</div>
	</div>
</div> --%>
<div class="col-md-12">
    <div class="form-group MB-0">
    <p class="tab-form-title-subtitle f2">List of Activities</p>
        <div class="checkbox-form-group second-custom-checkbox"> 
            <input type="checkbox" id="listOfActivity1" value="Personal Water Craft"<%=waterSport!=null &&waterSport.getWaterSportOpActivityList().contains("Personal Water Craft")?"checked":StringPool.BLANK%> name="listOfActivity"> 
            <label for="listOfActivity1"> <p class="tab-form-main-heading mb-0">Personal Water Craft (Jet Ski/Wave Runner)</p> </label> 
        </div>
        <div class="checkbox-form-group second-custom-checkbox"> 
            <input type="checkbox" id="listOfActivity2" value="Water Ski"<%=waterSport!=null &&waterSport.getWaterSportOpActivityList().contains("Water Ski")?"checked":StringPool.BLANK%> name="listOfActivity"> 
            <label for="listOfActivity2"> <p class="tab-form-main-heading mb-0">Water Ski</p> </label> 
        </div>
        <div class="checkbox-form-group second-custom-checkbox"> 
            <input type="checkbox" id="listOfActivity3" value="Sunfish Sail"<%=waterSport!=null &&waterSport.getWaterSportOpActivityList().contains("Sunfish Sail")?"checked":StringPool.BLANK%> name="listOfActivity"> 
            <label for="listOfActivity3"> <p class="tab-form-main-heading mb-0">Sunfish Sail</p> </label> 
        </div>
        <div class="checkbox-form-group second-custom-checkbox"> 
            <input type="checkbox" id="listOfActivity4" value="Parasail"<%=waterSport!=null &&waterSport.getWaterSportOpActivityList().contains("Parasail")?"checked":StringPool.BLANK%> name="listOfActivity"> 
            <label for="listOfActivity4"> <p class="tab-form-main-heading mb-0">Parasail</p> </label> 
        </div>
        <div class="checkbox-form-group second-custom-checkbox"> 
            <input type="checkbox" id="listOfActivity5" value="Scuba Diving"<%=waterSport!=null &&waterSport.getWaterSportOpActivityList().contains("Scuba Diving")?"checked":StringPool.BLANK%> name="listOfActivity"> 
            <label for="listOfActivity5"> <p class="tab-form-main-heading mb-0">Scuba Diving</p> </label> 
        </div>
        <div class="checkbox-form-group second-custom-checkbox"> 
            <input type="checkbox" id="listOfActivity6" value="Glass Bottom Boat/Cruise"<%=waterSport!=null &&waterSport.getWaterSportOpActivityList().contains("Glass Bottom Boat/Cruise")?"checked":StringPool.BLANK%> name="listOfActivity"> 
            <label for="listOfActivity6"> <p class="tab-form-main-heading mb-0">Glass Bottom Boat/Cruise</p> </label> 
        </div>
         <div class="checkbox-form-group second-custom-checkbox"> 
            <input type="checkbox" id="listOfActivity7" value="Banana Boat Ride"<%=waterSport!=null &&waterSport.getWaterSportOpActivityList().contains("Banana Boat Ride")?"checked":StringPool.BLANK%> name="listOfActivity"> 
            <label for="listOfActivity7"> <p class="tab-form-main-heading mb-0">Banana Boat Ride</p> </label> 
        </div>
     
    </div>
</div>

             <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-title-subtitle f2">Evidence of Authority to Occupy Location</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="occupyLocationWater1"
										value="Evidence of Ownership" 
										<%=waterSport!=null &&waterSport.getOccupyLocation().contains("Evidence of Ownership")?"checked":StringPool.BLANK%> name="occupyLocationWater"> <label
										for="occupyLocationWater1">
										<p class="tab-form-main-heading mb-0">Evidence of Ownership</p>
									</label>
								</div>
								<div class="form-group occupyLocationWater1 hide">
									<p class="tab-form-main-heading">Please Attach Copy</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="evidenceOwnershipWater"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="evidenceOwnershipWater">
														<label class="custom-upload" for="evidenceOwnershipWater">
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
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(waterEvidenceSign))?waterEvidenceSign:""%></span>
											</div>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="occupyLocationWater2"
										value="Rent Receipt" <%=waterSport!=null &&waterSport.getOccupyLocation().contains("Rent Receipt")?"checked":StringPool.BLANK%> name="occupyLocationWater">
									<label for="occupyLocationWater2">
										<p class="tab-form-main-heading mb-0">Rent Receipt</p>
									</label>
								</div>
								<div class="form-group occupyLocationWater2 hide">
									<p class="tab-form-main-heading">Please Attach Copy</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="rentReceiptWater"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="rentReceiptWater">
														<label class="custom-upload" for="rentReceiptWater">
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
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(waterRentSign))?waterRentSign:""%></span>
											</div>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="occupyLocationWater3"
										value="Letter from Owner" <%=waterSport!=null &&waterSport.getOccupyLocation().contains("Letter from Owner")?"checked":StringPool.BLANK%> name="occupyLocationWater"> <label
										for="occupyLocationWater3">
										<p class="tab-form-main-heading mb-0">Letter from Owner</p>
									</label>
								</div>
								<div class="form-group occupyLocationWater3 hide">
									<p class="tab-form-main-heading">Please Attach Copy</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="letterOwnerWater"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="letterOwnerWater">
														<label class="custom-upload" for="letterOwnerWater">
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
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(waterLetterOwnerSign))?waterLetterOwnerSign:""%></span>
											</div>
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="occupyLocationWater4"
										value="Contract of Lease" <%=waterSport!=null &&waterSport.getOccupyLocation().contains("Contract of Lease")?"checked":StringPool.BLANK%> name="occupyLocationWater">
									<label for="occupyLocationWater4">
										<p class="tab-form-main-heading mb-0">Contract of Lease</p>
									</label>
								</div>
								<div class="form-group occupyLocationWater4 hide">
									<p class="tab-form-main-heading">Please Attach Copy</p>
									<div class="supporting-document-card my-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="contractLeaseWater"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="contractLeaseWater">
														<label class="custom-upload" for="contractLeaseWater">
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
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(waterContractLeaseSign))?waterContractLeaseSign:""%></span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<%-- <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Evidence of Authority to
									Occupy Location</p>
								<div class="wizard-form-radio d-block">
									<input value="Evidence of Ownership" type="radio"
										name="occupyLocation" <%=waterSport!=null &&waterSport.getOccupyLocation().equals("Evidence of Ownership")?"checked":StringPool.BLANK%>> <label
										for="incorporationLodged">Evidence of Ownership</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="Rent Receipt" type="radio" name="occupyLocation" <%=waterSport!=null &&waterSport.getOccupyLocation().equals("Rent Receipt")?"checked":StringPool.BLANK%>>
									<label for="incorporationLodged">Rent Receipt</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="Letter from Owner" type="radio"
										name="occupyLocation" <%=waterSport!=null &&waterSport.getOccupyLocation().equals("Letter from Owner")?"checked":StringPool.BLANK%>> <label
										for="incorporationLodged">Letter from Owner</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="Contract of Lease" type="radio"
										name="occupyLocation" <%=waterSport!=null &&waterSport.getOccupyLocation().equals("Contract of Lease")?"checked":StringPool.BLANK%>> <label
										for="incorporationLodged">Contract of Lease</label>
								</div>
							</div>
						</div> --%>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Has Proposal Been Submitted</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="proposal" <%=waterSport!=null &&waterSport.getProposalSubmitted().equals("Yes")?"checked":StringPool.BLANK%> placeholder="">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="proposal" <%=waterSport!=null &&waterSport.getProposalSubmitted().equals("No")?"checked":StringPool.BLANK%> placeholder="">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Are Foreign Nationals
									Involved in the Operation</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="nationalsOperation" <%=waterSport!=null &&waterSport.getForeignNationalsInvolved().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="nationalsOperation" <%=waterSport!=null &&waterSport.getForeignNationalsInvolved().equals("No")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="hide" id="other-copy">
								<div class="form-group">
									<p class="tab-form-main-heading">Has Work Permit Been
										Applied for</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes" type="radio" name="permitApplied" <%=waterSport!=null &&waterSport.getWorkPermitApplied().equals("Yes")?"checked":StringPool.BLANK%>
												placeholder=""> <label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No" type="radio" name="permitApplied" <%=waterSport!=null &&waterSport.getWorkPermitApplied().equals("No")?"checked":StringPool.BLANK%>
												placeholder=""> <label for="">No</label>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addWaterSportsFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep15">
			<div class="tab-form">
				<div class="hotel-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">General Declarations</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">I Declare That</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">1. I am qualified in</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<div class="form-group">
									<p class="tab-form-main-heading">First Aid</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes" type="radio" name="firstAid" <%=waterGeneralDec!=null &&waterGeneralDec.getFirstAid().equals("Yes")?"checked":StringPool.BLANK%> placeholder=""> 
											<label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No" type="radio" name="firstAid" <%=waterGeneralDec!=null &&waterGeneralDec.getFirstAid().equals("No")?"checked":StringPool.BLANK%> placeholder="">
											<label for="">No</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">CPR</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes" type="radio" name="cpr" <%=waterGeneralDec!=null &&waterGeneralDec.getCpr().equals("Yes")?"checked":StringPool.BLANK%> placeholder=""> <label
												for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No" type="radio" name="cpr" <%=waterGeneralDec!=null &&waterGeneralDec.getCpr().equals("No")?"checked":StringPool.BLANK%> placeholder=""> <label
												for="">No</label>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">Rescue and Lifesaving -
								Level of Qualification</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<div class="form-group">
									<p class="tab-form-main-heading">a. Diving Certificate</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes" type="radio" name="divingCertificate" <%=waterGeneralDec!=null &&waterGeneralDec.getDivingCertificate().equals("Yes")?"checked":StringPool.BLANK%>
												placeholder=""> <label for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No" type="radio" name="divingCertificate" <%=waterGeneralDec!=null &&waterGeneralDec.getDivingCertificate().equals("No")?"checked":StringPool.BLANK%>
												placeholder=""> <label for="">No</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">b. RLSS</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes" type="radio" name="RLSS" <%=waterGeneralDec!=null &&waterGeneralDec.getRlss().equals("Yes")?"checked":StringPool.BLANK%> placeholder=""> <label
												for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No" type="radio" name="RLSS" <%=waterGeneralDec!=null &&waterGeneralDec.getRlss().equals("No")?"checked":StringPool.BLANK%> placeholder=""> <label
												for="">No</label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<p class="tab-form-main-heading">c. Lifeguard</p>
									<div class="d-flex">
										<div class="wizard-form-radio d-block">
											<input value="Yes" type="radio" name="lifeguard" <%=waterGeneralDec!=null &&waterGeneralDec.getLifeguard().equals("Yes")?"checked":StringPool.BLANK%> placeholder=""> <label
												for="">Yes</label>
										</div>
										<div class="wizard-form-radio d-block ml-3">
											<input value="No" type="radio" name="lifeguard" <%=waterGeneralDec!=null &&waterGeneralDec.getLifeguard().equals("No")?"checked":StringPool.BLANK%> placeholder=""> <label
												for="">No</label>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">2. My staff complement is
								(Attach detailed list along with application for each employee
								with all relevant documents/certificates including designated
								dive instructor(s) [where applicable])</p>
							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="employees-document" onchange="attachDetailed(this.id)" hidden="" multiple="" name="employees-document">
												<label class="custom-upload" for="employees-document">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(waterSportDoc))?waterSportDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">3. My business involves the
									use of compressed air for breathing</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio" name="breathing" <%=waterGeneralDec!=null &&waterGeneralDec.getBreathing().equals("Yes")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio" name="breathing" <%=waterGeneralDec!=null &&waterGeneralDec.getBreathing().equals("No")?"checked":StringPool.BLANK%> placeholder="">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="hide" id="name-details">
								<div class="form-group">
									<p class="tab-form-main-heading">Compressed air is supplied by</p>
									<input type="text" class="form-control"
										id="waterSportOpName" value="<%=Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getOperationName())?waterGeneralDec.getOperationName():"" %>" placeholder="Name">
									<textarea rows="3" class="mt-3 form-control" maxlength="255"
										id="waterSportOpAddress" placeholder="Address"
										style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getOperationAddress())?waterGeneralDec.getOperationAddress():"" %></textarea>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading"> Insurance Coverage
									Amount</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									id="waterSportOpinsuranceAmount" placeholder="22345678" value="<%=Validator.isNotNull(waterGeneralDec)&&Validator.isNotNull(waterGeneralDec.getInsuranceAmount())?waterGeneralDec.getInsuranceAmount():"" %>" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading f2">
								4. My operation has $ <span class="giluio sportInsuranceAmount"> </span>
								Public Liability Insurance Coverage
							</p>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Owner</p>
							<div class="signature_texarea mb-2"
								id="applicantSignatureWaterSportImageHolder">
								<%if(Validator.isNotNull(waterSportOwner)){ %>
							<img src="<%=waterSportOwner%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="applicantSignatureWaterSportBtn" hidden=""
								name="<portlet:namespace/>applicantSignatureWaterSportBtn">
							<label for="applicantSignatureWaterSportBtn"
								class="choose-sign-btn"> <span class="mr-2"> <svg
										width="14" height="17" viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
										<path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
									</svg>
							</span> Upload Signature
							</label>
						</div>
						<!-- <div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="WaterSportSignDate"
									max="9999-12-31" placeholder="" value="">
							</div>
						</div> -->
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Manager</p>
							<div class="signature_texarea mb-2"
								id="managerSignatureWaterSportImageHolder">
								<%if(Validator.isNotNull(waterSportManager)){ %>
							<img src="<%=waterSportManager%>"  width="100" height="100"/>
							<%} %>
								</div>
							<input type="file" id="managerSignatureWaterSportBtn" hidden=""
								name="<portlet:namespace/>managerSignatureWaterSportBtn">
							<label for="managerSignatureWaterSportBtn"
								class="choose-sign-btn"> <span class="mr-2"> <svg
										width="14" height="17" viewBox="0 0 14 17" fill="none"
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
									id="waterSportOpManagerSignDate" max="9999-12-31" placeholder=""
									value="<%=waterGeneralDec!=null&&waterGeneralDec.getManagerSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(waterGeneralDec.getManagerSignDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo(); addWaterSportsSecondFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep16">
			<div class="tab-form">
				<div class="company-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Watersports Requirements</p>
						</div>
					</div>
					<div class="row">
						<!-- <div class="col-md-12">
							<p class="tab-form-title-subtitle f2 pt-3">General for all
								Operators</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">First Aid Station</li>
								<li class="list-group-item">Life Saving Equipment
									(Including Oxygen Tank (s) and Mask (s)</li>
								<li class="list-group-item">Life Jackets</li>
								<li class="list-group-item">Vessels to be equipped with
									first Aid and Life Saving Equipment</li>
								<li class="list-group-item">Staff certified in Lifeguard,
									CPR and First Aid</li>
								<li class="list-group-item">Public Liability Insurance
									(minimum coverage of One Million dollars)</li>
								<li class="list-group-item">Maritime Authority of Jamaica
									licence for vessel (s) and Boat Driver (s)</li>
								<li class="list-group-item">Permission to operate from
									location</li>
							</ul>
						</div> -->

						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">General for all
									Operators</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="generalOperator1"
										value="First Aid Station" <%=waterRequirement!=null &&waterRequirement.getGeneralOperator().contains("First Aid Station")?"checked":StringPool.BLANK%> name="generalOperator"> <label
										for="generalOperator1">
										<p class="tab-form-main-heading mb-0">First Aid Station</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="generalOperator2"
										value="Life Saving Equipment Including Oxygen Tank (s) and Mask (s)" <%=waterRequirement!=null &&waterRequirement.getGeneralOperator().contains("Life Saving Equipment Including Oxygen Tank (s) and Mask (s)")?"checked":StringPool.BLANK%>
										name="generalOperator"> <label for="generalOperator2">
										<p class="tab-form-main-heading mb-0">Life Saving
											Equipment Including Oxygen Tank (s) and Mask (s)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="generalOperator3"
										value="Life Jackets" <%=waterRequirement!=null &&waterRequirement.getGeneralOperator().contains("Life Jackets")?"checked":StringPool.BLANK%> name="generalOperator"> <label
										for="generalOperator3">
										<p class="tab-form-main-heading mb-0">Life Jackets</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="generalOperator4"
										value="Vessels to be equipped with first Aid and Life Saving Equipment" <%=waterRequirement!=null &&waterRequirement.getGeneralOperator().contains("Vessels to be equipped with first Aid and Life Saving Equipment")?"checked":StringPool.BLANK%>
										name="generalOperator"> <label for="generalOperator4">
										<p class="tab-form-main-heading mb-0">Vessels to be
											equipped with first Aid and Life Saving Equipment</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="generalOperator5"
										value="Staff certified in Lifeguard, CPR and First Aid" <%=waterRequirement!=null &&waterRequirement.getGeneralOperator().contains("Staff certified in Lifeguard, CPR and First Aid")?"checked":StringPool.BLANK%>
										name="generalOperator"> <label for="generalOperator5">
										<p class="tab-form-main-heading mb-0">Staff certified in
											Lifeguard, CPR and First Aid</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="generalOperator6"
										value="Public Liability Insurance (minimum coverage of One Million dollars)" <%=waterRequirement!=null &&waterRequirement.getGeneralOperator().contains("Public Liability Insurance (minimum coverage of One Million dollars)")?"checked":StringPool.BLANK%>
										name="generalOperator"> <label for="generalOperator6">
										<p class="tab-form-main-heading mb-0">Public Liability
											Insurance (minimum coverage of One Million dollars)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="generalOperator7"
										value="Maritime Authority of Jamaica licence for vessel (s) and Boat Driver (s)" <%=waterRequirement!=null &&waterRequirement.getGeneralOperator().contains("Maritime Authority of Jamaica licence for vessel (s) and Boat Driver (s)")?"checked":StringPool.BLANK%>
										name="generalOperator"> <label for="generalOperator7">
										<p class="tab-form-main-heading mb-0">Maritime Authority
											of Jamaica licence for vessel (s) and Boat Driver (s)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="generalOperator8"
										value="Permission to operate from location" <%=waterRequirement!=null &&waterRequirement.getGeneralOperator().contains("Permission to operate from location")?"checked":StringPool.BLANK%>
										name="generalOperator"> <label for="generalOperator8">
										<p class="tab-form-main-heading mb-0">Permission to
											operate from location</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12 personal-water-craft hide">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Personal Water Craft
									(Jet Ski/wave Runner)</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="waterCraft1"
										value="Rescue Boat" <%=waterRequirement!=null &&waterRequirement.getWaterCraft().contains("Rescue Boat")?"checked":StringPool.BLANK%> name="waterCraft"> <label
										for="waterCraft1">
										<p class="tab-form-main-heading mb-0">Rescue Boat</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="waterCraft2"
										value="Life Jacket and Equipment to be numbered" <%=waterRequirement!=null &&waterRequirement.getWaterCraft().contains("Life Jacket and Equipment to be numbered")?"checked":StringPool.BLANK%>
										name="waterCraft"> <label for="waterCraft2">
										<p class="tab-form-main-heading mb-0">Life Jacket and
											Equipment to be numbered</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="waterCraft3"
										value="Marked channel to be in place from shore (i.e. Marker Buoy are to be put in place by the operators)" <%=waterRequirement!=null &&waterRequirement.getWaterCraft().contains("Marked channel to be in place from shore (i.e. Marker Buoy are to be put in place by the operators)")?"checked":StringPool.BLANK%>
										name="waterCraft"> <label for="waterCraft3">
										<p class="tab-form-main-heading mb-0">Marked channel to be
											in place from shore (i.e. Marker Buoy are to be put in place
											by the operators)</p>
									</label>
								</div>
							</div>
						</div>
                        <div class="col-md-12 hide water-ski">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Water Ski</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="waterSki1"
										value="Spotter on Board vessel during operation" <%=waterRequirement!=null &&waterRequirement.getWaterSki().contains("Spotter on Board vessel during operation")?"checked":StringPool.BLANK%> name="waterSki"> <label
										for="waterSki1">
										<p class="tab-form-main-heading mb-0">Spotter on Board vessel during operation</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12 hide sunfish-sail">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Sunfish Sail</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="sunfishSail1"
										value="Rescue Boat" <%=waterRequirement!=null &&waterRequirement.getSunfishSail().contains("Rescue Boat")?"checked":StringPool.BLANK%> name="sunfishSail"> <label
										for="sunfishSail1">
										<p class="tab-form-main-heading mb-0">Rescue Boat</p>
									</label>
								</div>
							</div>
						</div>				
                        <div class="col-md-12 hide parasail">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Parasail</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="parasail1"
										value="Platform to be approved by Harbour Master" <%=waterRequirement!=null &&waterRequirement.getParasail().contains("Platform to be approved by Harbour Master")?"checked":StringPool.BLANK%> name="parasail"> <label
										for="parasail1">
										<p class="tab-form-main-heading mb-0">Platform to be approved by Harbour Master</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="parasail2"
										value="Certificate in Parasail Operation" <%=waterRequirement!=null &&waterRequirement.getParasail().contains("Certificate in Parasail Operation")?"checked":StringPool.BLANK%>
										name="parasail"> <label for="parasail2">
										<p class="tab-form-main-heading mb-0">Certificate in Parasail Operation</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="parasail3"
										value="Civil Aviation application where applicable" <%=waterRequirement!=null &&waterRequirement.getParasail().contains("Civil Aviation application where applicable")?"checked":StringPool.BLANK%>
										name="parasail"> <label for="parasail3">
										<p class="tab-form-main-heading mb-0">Civil Aviation application where applicable</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="parasail4"
										value="Spotter on board during operation" <%=waterRequirement!=null &&waterRequirement.getParasail().contains("Spotter on board during operation")?"checked":StringPool.BLANK%>
										name="parasail"> <label for="parasail4">
										<p class="tab-form-main-heading mb-0">Spotter on board during operation</p>
									</label>
								</div>
							</div>
						</div>
                        <div class="col-md-12 hide scuba-diving">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Scuba Diving</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="scubaDiving1"
										value="Certified Dive Instructor(s)" <%=waterRequirement!=null &&waterRequirement.getScubaDiving().contains("Certified Dive Instructor (s)")?"checked":StringPool.BLANK%> name="scubaDiving"> <label
										for="scubaDiving1">
										<p class="tab-form-main-heading mb-0">Certified Dive Instructor (s)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="scubaDiving2"
										value="Certified Dive Master(s)" <%=waterRequirement!=null &&waterRequirement.getScubaDiving().contains("Certified Dive Master (s)")?"checked":StringPool.BLANK%>
										name="scubaDiving"> <label for="scubaDiving2">
										<p class="tab-form-main-heading mb-0">Certified Dive Master (s)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="scubaDiving3"
										value="Certified Dive Guide(s)" <%=waterRequirement!=null &&waterRequirement.getScubaDiving().contains("Certified Dive Guide (s)")?"checked":StringPool.BLANK%>
										name="scubaDiving"> <label for="scubaDiving3">
										<p class="tab-form-main-heading mb-0">Certified Dive Guide (s)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="scubaDiving4"
										value="'Log' on Hydro Tanks re: Tests and Services" <%=waterRequirement!=null &&waterRequirement.getScubaDiving().contains("'Log' on Hydro Tanks re: Tests and Services")?"checked":StringPool.BLANK%>
										name="scubaDiving"> <label for="scubaDiving4">
										<p class="tab-form-main-heading mb-0">'Log' on Hydro Tanks re: Tests and Services</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12 hide glass-bottom-boat">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Glass Bottom Boat/cruise</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="glassBoat1"
										value="Certified Boat Driver" <%=waterRequirement!=null &&waterRequirement.getGlassBoat().contains("Certified Boat Driver")?"checked":StringPool.BLANK%> name="glassBoat"> <label
										for="glassBoat1">
										<p class="tab-form-main-heading mb-0">Certified Boat Driver</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="glassBoat2"
										value="Crew Certified in CPR, First Aid, Life Guard" <%=waterRequirement!=null &&waterRequirement.getGlassBoat().contains("Crew Certified in CPR, First Aid, Life Guard")?"checked":StringPool.BLANK%>
										name="glassBoat"> <label for="glassBoat2">
										<p class="tab-form-main-heading mb-0">Crew Certified in CPR, First Aid, Life Guard</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12 hide banana-boat-ride">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Banana Boat Ride</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bananaBoat1"
										value="Spotter on Board vessel during operation" <%=waterRequirement!=null &&waterRequirement.getBananaBoat().contains("Spotter on Board vessel during operation")?"checked":StringPool.BLANK%> name="bananaBoat"> <label
										for="bananaBoat1">
										<p class="tab-form-main-heading mb-0">Spotter on Board vessel during operation</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bananaBoat2"
										value="Life Jacket to be worn by participants" <%=waterRequirement!=null &&waterRequirement.getBananaBoat().contains("Life Jacket to be worn by participants")?"checked":StringPool.BLANK%>
										name="bananaBoat"> <label for="bananaBoat2">
										<p class="tab-form-main-heading mb-0">Life Jacket to be worn by participants</p>
									</label>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$("input[name='occupyLocationWater']").change(function(){
    var targetData = $(this).attr('id');
    $("." + targetData).toggleClass("hide");
    /* if($(this).val() == 'Other'){
        $(".otherSpecify, .otherSpecifyPre").toggleClass("hide");
    } */
});
</script>
