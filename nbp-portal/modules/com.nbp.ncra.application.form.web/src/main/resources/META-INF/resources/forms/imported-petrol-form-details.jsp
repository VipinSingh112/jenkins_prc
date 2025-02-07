<%@ include file="/init.jsp" %>
<div class="hide imported-petrol-forms">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep3">
			<div class="tab-form">
				<div class="imported-petrol-applicant-details-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Imported Petrol Verification</p>
							<p class="tab-form-title-subtitle f2">In this section you
								will provide general information about yourself.</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Business *</p>
								<input type="text" class="form-control" id="importedbusinessname" value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantBusinessName())?ncraApplicantDetailInfo.getApplicantBusinessName():""%>"
									placeholder="" oninput="importedDetailValidation();"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="importedBusinessNameValidation" style="color: red;">Enter  Name of Business</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" id="imported-address" maxlength="255"  placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantAddress())?ncraApplicantDetailInfo.getApplicantAddress():""%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Contact Person</p>
								<input type="text" class="form-control" id="imported-applicant-contact" 
								 oninput="this.value = this.value.replace(/[^a-zA-Z]/g, '');"
								value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantContact())?ncraApplicantDetailInfo.getApplicantContact():""%>"
									placeholder=""/>
							</div>
						</div>												
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone No.</p>
								<input type="text" class="form-control" id="imported-applicant-tele-num" value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantTeleNum())?ncraApplicantDetailInfo.getApplicantTeleNum():""%>"
									placeholder="+1 876-876-1234" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No.</p>
								<input type="text" class="form-control" id="imported-fax-no" value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantFaxNo())?ncraApplicantDetailInfo.getApplicantFaxNo():""%>"
									placeholder="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">E-mail *</p>
								<input type="text" class="form-control" id="imported-applicant-email-addr" value="<%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantEmailAddr())?ncraApplicantDetailInfo.getApplicantEmailAddr():""%>" placeholder="user@gmail.com"
								oninput="importedDetailValidation();"/>
								<p class="tab-form-sub-heading fieldAlert hide" id="importedApplicantEmailAddrValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-12" id="prop-addr-box">
							<div class="form-group">
								<p class="tab-form-main-heading">Location of scale(s) to be verified (if different from above)</p>
							   <textarea rows="3" class="form-control" id="imported-applicant-location"  maxlength="255" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(ncraApplicantDetailInfo)&&Validator.isNotNull(ncraApplicantDetailInfo.getApplicantLocation())?ncraApplicantDetailInfo.getApplicantLocation():"" %></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>