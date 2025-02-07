<div class="tab-pane iso9001CertificationForm hide active" role="tabpanel" >
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
									<p class="tab-form-main-heading">Number and time of Shifts</p>
									<input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
									value=""/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Types of Products/Services</p>
									<input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
									value=""/>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Business Address and Physical Location of  Premises</p>
									<textarea rows="3" id="applicantAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
									<p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation" style="color: red;">Please Enter Name</p>
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
							<th class="sub_heading text-nowrap">Number and time of Shifts</th>
							<th class="sub_heading text-nowrap">Types of Products/Services</th>
							<th class="sub_heading text-nowrap">Business Address and Physical Location of  Premises</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
<!-- Number of effective personnel -->
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title-subtitle f2">The effective number of personnel consists of all full time personnel involved within the scope of certification including those working on each shift.</p>
                <p class="tab-form-title-subtitle f2">Non-permanent (seasonal, temporary and contracted personnel) and part time personnel who will be present at the time of the audit (or currently employed) shall be included in this number.</p>
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
								<h2>Number of effective personnel</h2>
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
									<p class="tab-form-main-heading">Numberof full time employees</p>
									<input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
									value=""/>
									<p class="tab-form-sub-heading fieldAlert hide" id="applicantNameValidation" style="color: red;">Please Enter Name</p>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of part time employees </p>
									<input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
									value=""/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contractors</p>
									<input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
									value=""/>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Number of contracted workers </p>
									<input type="text" class="form-control" id="applicantTelephone" placeholder="22345678"
									value=""/>
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
							<th class="sub_heading text-nowrap">Numberof full time employees</th>
							<th class="sub_heading text-nowrap">Number of part time employees</th>
							<th class="sub_heading text-nowrap">Number of contractors</th>
							<th class="sub_heading text-nowrap">Number of contracted workers</th>
							<th class="sub_heading">Edit</th>
							<th class="sub_heading">Delete</th>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Stage 1:</p>
					<input type="date" class="form-control" id="applicantTelephone"
					value=""/>
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Stage 2:</p>
					<input type="date" class="form-control" id="applicantTelephone"
					value=""/>
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Surveillance audit:</p>
					<input type="date" class="form-control" id="applicantTelephone"
					value=""/>
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Recertification audit:</p>
					<input type="date" class="form-control" id="applicantTelephone"
					value=""/>
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Pre-assessment audit: </p>
					<input type="date" class="form-control" id="applicantTelephone"
					value=""/>
				</div>
			</div>
			<div class="col-6">
				<div class="form-group">
					<p class="tab-form-main-heading">Any other service (s):</p>
					<input type="date" class="form-control" id="applicantTelephone"
					value=""/>
				</div>
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

<div class="tab-pane iso9001CertificationForm hide" role="tabpanel">
	<div class="tab-form">
		<div class="row">
			<div class="col-md-12">
				<p class="tab-form-title f2">Organization  Information</p>
            </div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading"> Name of organization: </p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Address</p>
					<textarea rows="3" id="applicantAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"></textarea>
					<p class="tab-form-sub-heading">Separate values with Enter</p>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading"> Telephone number: </p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Fax number: </p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">E-mail address:   </p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading"> Head of Organization:  </p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Position: </p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Contact person name and email address: </p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Position: </p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-sub-heading">Which management system(s) has your organization implemented or is in the process of implementing?</p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
				</div>
			</div>
			<div class="col-md-12">
				<div class="radiobox">
					<div class="form-group">
						<p class="tab-form-main-heading" id="orgMember"> Have you determined the scope of the certification which you are seeking?</p>
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
				<div class="form-group"> please state the scope along with a corporate brochure or relevant documents defining the nature and scope of your operations.</p>
					<input type="text" class="form-control" id="superintendenceNurseName" value="" placeholder=""/>	
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
</div>

