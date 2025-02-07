<%@page import="com.nbp.ogt.application.form.services.service.OgtProofOfClaimLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtProofOfClaim"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtClaimToSpouseLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtClaimToSpouse"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtClaimToPropertyLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtClaimToProperty"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtInsolventPersonDetailLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtClaimantDetailLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtClaimantDetail"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
<portlet:resourceURL var="claimantDetailInfoUrl" id="add/claimant/detail/info"/>
<portlet:resourceURL var="insolventPersonDetailInfoUrl" id="add/insolvent/detail/info"/>
<portlet:resourceURL var="claimToCreditorInfoUrl" id="add/creditor/toClaim/formA"/>
<portlet:resourceURL var="claimToPropertyInfoUrl" id="add/property/toClaim/formB"/>
<portlet:resourceURL var="claimToSpouseInfoUrl" id="add/spouse/toClaim/formC"/>
<% 
if(ogtApplicationId>0){
	try{
System.out.println("creditorClaim.getClaimCertifyCheck()*************"+creditorClaim.getClaimCertifyCheck());
	}catch(Exception e){
	}
}
%>
<div class="" id="ogtAdmissionClaimForm">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="applicant-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Claimant Details</p>
							<p class="tab-form-title-subtitle f2">Please Read the Forms
								Carefully and upload all required supporting documentation.</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="applicantClaimant">Claimant
									Name *</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="applicantClaimant">
										<option selected="" disabled="">Please Select</option>
										<option value="Individual" <%=claimantDetail!=null?claimantDetail.getClaimantName().equals("Individual")?"selected":"":StringPool.BLANK%>>Individual</option>
										<option value="Company" <%=claimantDetail!=null?claimantDetail.getClaimantName().equals("Company")?"selected":"":StringPool.BLANK%>>Company</option>
									</select>
									 <p class="tab-form-sub-heading fieldAlert hide" id="applicantClaimantValidation" style="color: red;">
									Please Select </p>
								</div>
							</div>
						</div>
						<div class="col-md-6 hide com-detail">
							<div class="form-group">
								<p class="tab-form-main-heading" for="companyName">Company
									Name *</p>
								<input type="text" class="form-control" id="companyName"
									placeholder="" value="<%=claimantDetail!=null?claimantDetail.getClaimantCompanyName():StringPool.BLANK %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="companyNameValidation" style="color: red;">
									Please Enter Company Name</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6 hide indi-detail">
							<div class="form-group">
								<p class="tab-form-main-heading" for="indiFirstName">First
									Name *</p>
								<input type="text" class="form-control" id="indiFirstName"
									placeholder="" value="<%=claimantDetail!=null?claimantDetail.getClaimantFirstName():StringPool.BLANK %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="indiFirstNameValidation" style="color: red;">
									Please Enter First Name</p> 
							</div>
						</div>
						<div class="col-md-6 hide indi-detail">
							<div class="form-group">
								<p class="tab-form-main-heading" for="indiLastName">Last
									Name *</p>
								<input type="text" class="form-control" id="indiLastName"
									placeholder="" value="<%=claimantDetail!=null?claimantDetail.getClaimantLastName():StringPool.BLANK %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="indiLastNameValidation" style="color: red;">
									Please Enter Last Name</p> 
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" id="address" class="form-control"
									maxlength="255" placeholder="Enter Address"
									style="border-radius: 5px; width: 100%" ><%=claimantDetail!=null?claimantDetail.getClaimantAddress():StringPool.BLANK %></textarea>
								<p class="tab-form-sub-heading fieldAlert hide" id="addressValidation" style="color: red;">
									Please Enter Address</p> 
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="emailAddress">Email
									Address *</p>
								<input type="text" class="form-control" id="emailAddress"
									value="<%=claimantDetail!=null?claimantDetail.getClaimantEmailAddr():StringPool.BLANK %>" placeholder="info@example.jm" />
								<p class="tab-form-sub-heading fieldAlert hide" id="emailAddressValidation" style="color: red;"></p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone</p>
								<input type="text" class="form-control" id="telephone" value="<%=claimantDetail!=null?claimantDetail.getClaimantTeleNum():StringPool.BLANK %>"
								oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
								 />
								<!-- <p class="tab-form-sub-heading fieldAlert hide" id="telephoneValidation" style="color: red;">
								Please Enter Telephone
								</p> -->
							</div>
						</div>
						<div class="col-md-6"> 
                          <div class="form-group"> 
                           <p class="tab-form-main-heading" for="fax-no">Fax No</p> 
                           <input type="text" class="form-control" id="fax-no" value="<%=claimantDetail!=null?claimantDetail.getClaimantFaxNo():StringPool.BLANK %>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder=""> 
                          </div> 
                         </div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="applicationDate">Date
									of Application</p>
								<input type="date" class="form-control" id="applicationDate"
									value="<%=claimantDetail!=null&&claimantDetail.getClaimantDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(claimantDetail.getClaimantDate()):StringPool.BLANK %>" />
								<!-- <p class="tab-form-sub-heading fieldAlert hide" id="applicationDateValidation" style="color: red;">
								Please Enter Date of Application
								</p> -->
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="trnNumber">TRN</p>
								<input type="text" class="form-control" id="trnNumber" value="<%=claimantDetail!=null?claimantDetail.getClaimantTrn():StringPool.BLANK %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
								<!-- <p class="tab-form-sub-heading fieldAlert hide" id="trnNumberValidation" style="color: red;">
								Please Enter TRN Number
								</p> -->
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="addClaimantDetailsFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="insolvent-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Insolvent Person Details</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="insolventPersonNature">Nature
									of Insolvent Person(Debtor)</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="insolventPersonNature">
										<option selected="" disabled="">Please Select</option>
										<option value="Individual" <%=insolventDetail!=null?insolventDetail.getNatureOfInsolvent().equals("Individual")?"selected":"":StringPool.BLANK%>>Individual</option>
										<option value="Company" <%=insolventDetail!=null?insolventDetail.getNatureOfInsolvent().equals("Company")?"selected":"":StringPool.BLANK%>>Company</option>
									</select>
									<!-- <p class="tab-form-sub-heading fieldAlert hide" id="insolventPersonNatureValidation" style="color: red;">
									Please Select</p> -->
								</div>
							</div>
						</div>
						<div class="col-md-6 hide insolvent-com-detail">
							<div class="form-group">
								<p class="tab-form-main-heading" for="insolventCompanyName">Company
									Name</p>
								<input type="text" class="form-control"
									id="insolventCompanyName" placeholder="" value="<%=insolventDetail!=null?insolventDetail.getInsolventCompanyName():StringPool.BLANK %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="insolventCompanyNameValidation" style="color: red;">
									Please Enter Company Name</p> 
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6 hide insolvent-indi-detail">
							<div class="form-group">
								<p class="tab-form-main-heading" for="insolventIndiFirstName">First
									Name *</p>
								<input type="text" class="form-control"
									id="insolventIndiFirstName" placeholder="" value="<%=insolventDetail!=null?insolventDetail.getInsolventFirstName():StringPool.BLANK %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="insolventIndiFirstNameValidation" style="color: red;">
									Please Enter First Name</p> 
							</div>
						</div>
						<div class="col-md-6 hide insolvent-indi-detail">
							<div class="form-group">
								<p class="tab-form-main-heading" for="insolventIndiLastName">Last
									Name *</p>
								<input type="text" class="form-control"
									id="insolventIndiLastName" placeholder="" value="<%=insolventDetail!=null?insolventDetail.getInsolventLastName():StringPool.BLANK %>">
								 <p class="tab-form-sub-heading fieldAlert hide" id="insolventIndiLastNameValidation" style="color: red;">
									Please Enter Last Name</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addInsolventDetailFormInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep3">
			<div class="tab-form">
				<div class="undersigned-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Proof Of Claim(Form 38)</p>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading">Type Of Matter</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group my-0 d-flex">
								<div class="checkbox-form-group second-custom-checkbox pr-4">
									<input type="checkbox" id="claimantAttached1"
										value="Bankruptcy" name="claimantAttached"> <label
										for="claimantAttached1">
										<p class="tab-form-main-heading mb-0">Bankruptcy</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox pr-4">
									<input type="checkbox" id="claimantAttached2" value="Proposal"
										name="claimantAttached"> <label
										for="claimantAttached2">
										<p class="tab-form-main-heading mb-0">Proposal</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="claimantAttached3"
										value="Receivership" name="claimantAttached"> <label
										for="claimantAttached3">
										<p class="tab-form-main-heading mb-0">Receivership </p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="debtorName">Name of Debtor</p>
								<input type="text" class="form-control" id="debtorName" placeholder="" 
								value="<%=creditorClaim!=null?creditorClaim.getClaimDebtorName():StringPool.BLANK %>" disabled>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="claimantName">Name of the Claimant</p>
								<input type="text" class="form-control" id="claimantName" placeholder="" 
								value="<%=creditorClaim!=null?creditorClaim.getClaimantName():StringPool.BLANK %>" disabled>
							</div>
						</div>
 						<div class="col-md-12">
 							<div class="form-group">
								<p class="tab-form-main-heading">
									In the matter of the <span class="giluio matterType"></span> of <span class="giluio debtorName"><%=creditorClaim!=null?creditorClaim.getClaimDebtorName():StringPool.BLANK %></span> and the claim of <span
										class="giluio claimantName"><%=creditorClaim!=null?creditorClaim.getClaimantName():StringPool.BLANK %></span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="common-section-small-heading mb-3">
									<span>
										Notices to the Claimant should be sent to
									</span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" id="claimAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=creditorClaim!=null?creditorClaim.getClaimSentAddress():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="claimPhone">Phone</p>
								<input type="text" class="form-control" id="claimPhone" value="<%=creditorClaim!=null?creditorClaim.getClaimSentPhoneNum():StringPool.BLANK %>"
									 oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="faxClaim">Fax No</p>
								<input type="text" class="form-control" id="faxClaim" value="<%=creditorClaim!=null?creditorClaim.getClaimSentFaxNo():StringPool.BLANK %>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="emailAddressClaim">Email
									Address</p>
								<input type="text" class="form-control" id="emailAddressClaim"
									value="<%=creditorClaim!=null?creditorClaim.getClaimSentEmailAddr():StringPool.BLANK %>" placeholder="info@example.jm" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="common-section-small-heading mb-3">
									<span>
									Claim
									</span>	
								</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name Of Person Completing
									Form</p>
								<input type="text" class="form-control" id="completingForm"
									value="<%=creditorClaim!=null?creditorClaim.getClaimCompName():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Position Of Person
									Completing Form</p>
								<input type="text" class="form-control"
									id="positionCompletingForm" value="<%=creditorClaim!=null?creditorClaim.getClaimCompPosition():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<!-- <div class=""> -->
									<p class="tab-form-main-heading">That I am</p>
									<div class="wizard-form-radio d-block">
										<input value="The Claimant" type="radio" name="incorporationLodged"<%=creditorClaim!=null &&creditorClaim.getClaimCertifyCheck().equals("The Claimant")?"checked":StringPool.BLANK%>> <label for="" class="mb-0">The Claimant</label>
									</div>
									<div class="row">
									    <div class="col-md-4 d-flex justify-content-center">
									        <span class=""> or</span>
									    </div>
									</div>
									<div class="wizard-form-radio d-block">
										<input value="claimantPosition" id="claimantCheck" type="radio" name="incorporationLodged"<%=creditorClaim!=null &&creditorClaim.getClaimCertifyCheck().equals("claimantPosition")?"checked":StringPool.BLANK%>>
										<label for=""><span class="giluio positionCompletingForm"><%=creditorClaim!=null?creditorClaim.getClaimCompPosition():StringPool.BLANK %></span> of
										the claimant</label>
									</div>
								<!-- </div> -->
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I <span class="giluio completingForm"><%=creditorClaim!=null?creditorClaim.getClaimCompName():StringPool.BLANK %></span>, do hereby certify
							</p>
							<p class="tab-form-main-heading pl-3">1. That I am <span class="giluio incorporationLodged"><%=creditorClaim!=null?creditorClaim.getClaimCertifyCheck():StringPool.BLANK%></span>.</p>
							<p class="tab-form-main-heading pl-3">2. That I have knowledge of
								all the circumstances connected with the claim referred to
								below.</p>
						</div>
						
					</div>
				</div>
			</div>
			<button type="button" id=""
				onclick=" addProofOfClaimFormA(false);"
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
		<div class="tab-pane bankrupcy-form hide" role="tabpanel" id="childStep4">
			<div class="tab-form">
				<div class="claim-by-creditor-form hide">
					<div class="row">
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">
									<span>
									Claim by Creditor (Section 188(2))
									</span>
								</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading">1. That the debtor was at
									the:</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
									
										id="claimDebtor">
										<option selected="" disabled="">Please Select</option>
										<option value="Date of Bankruptcy" <%=ogtSectionBData!=null?ogtSectionBData.getTheDebtor().equals("Date of Bankruptcy")?"selected":"":StringPool.BLANK%>>Date of Bankruptcy</option>
										<option value="Date of the Receivership" <%=ogtSectionBData!=null?ogtSectionBData.getTheDebtor().equals("Date of the Receivership")?"selected":"":StringPool.BLANK%>>Date of the Receivership</option>
										<option value="Date of the notice of intention" <%=ogtSectionBData!=null?ogtSectionBData.getTheDebtor().equals("Date of the notice of intention")?"selected":"":StringPool.BLANK%>>Date of the notice of intention</option>
										<option value="Date of the Proposal" <%=ogtSectionBData!=null?ogtSectionBData.getTheDebtor().equals("Date of the Proposal")?"selected":"":StringPool.BLANK%>>Date of the Proposal</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name</p>
								<input type="text" class="form-control" id="claimName" value="<%=ogtSectionBData!=null?ogtSectionBData.getName():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-6"> 
                              <div class="form-group"> 
                               <p class="tab-form-main-heading" for="applicationDateCa">Date of Insolvency of Debtor</p> 
                               <input type="date" class="form-control" id="applicationDateCa" value="<%=ogtSectionBData!=null&&ogtSectionBData.getDateOfInsolvencyOfDebtor()!=null?new SimpleDateFormat("yyyy-MM-dd").format(ogtSectionBData.getDateOfInsolvencyOfDebtor()):StringPool.BLANK %>" placeholder="">  
                              </div> 
                        </div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Total Value of Claim</p>
								<input type="text" class="form-control" id="valueOfClaim" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"
									value="<%=ogtSectionBData!=null?ogtSectionBData.getTotalValueOfClaim():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								namely the <span class="giluio claimNamePerson"><%=ogtSectionBData!=null?ogtSectionBData.getName():StringPool.BLANK %></span> day of <span class="giluio applicationDateCa"><%=ogtSectionBData!=null&&ogtSectionBData.getDateOfInsolvencyOfDebtor()!=null?new SimpleDateFormat("yyyy-MM-dd").format(ogtSectionBData.getDateOfInsolvencyOfDebtor()):StringPool.BLANK %></span>, and still is, indebted to
								the claimant in the sum of $<span class="giluio valueOfClaim"><%=ogtSectionBData!=null?ogtSectionBData.getTotalValueOfClaim():StringPool.BLANK %></span>, as
								specified in the statement of account.
							</p>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="statementAccount"
										value="Statement of account" <%=ogtSectionBData!=null &&ogtSectionBData.getStatementOfAccount().contains("Statement of account")?"checked":StringPool.BLANK%>
										name="statementAccount"> <label for="statementAccount">
										<p class="tab-form-main-heading mb-0">Statement of account</p>
									</label>
								</div>
								<div class="detail-operating-box hide pl-4 ml-3" id="statement-of-doc">
									<div class="supporting-document-card mt-3">
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
															
														<label class="custom-upload" for="detail-operating">
														
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
												
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(formNameDoc))?formNameDoc:""%></span>
											</div>
										</div>
									</div>
									<p class="tab-form-sub-heading">(NOTE: The attached
													statement of account or affidavit must specify the vouchers
													or other evidence in support of the claim)</p>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="statementAccount1"
										value="Affidavit attached and marked Schedule 'A', after deducting any counterclaims to which the debtor is entitled." <%=ogtSectionBData!=null &&ogtSectionBData.getStatementOfAccount().contains("Affidavit attached and marked Schedule 'A', after deducting any counterclaims to which the debtor is entitled.")?"checked":StringPool.BLANK%>
										name="statementAccount"> <label for="statementAccount1">
										<p class="tab-form-main-heading mb-0">Affidavit attached
											and marked Schedule 'A', after deducting any counterclaims to
											which the debtor is entitled.</p>
									</label>
								</div>
								<div class="detail-operating-box hide pl-4 ml-3" id="affidavit-attached-doc">
									<div class="supporting-document-card mt-3">
										<div class="row">
											<div class="col-md-12">
												<div class="supporting-document-card-wrapper">
													<div class="left">
														<p class="supporting-document-card-upper-heading">Attach
															File</p>
													</div>
													<div class="right">
														<input type="file" id="detail-operating-two"
															onchange="attachDetailed(this.id)" hidden="" multiple=""
															name="<portlet:namespace/>detail-operating-two">
															
														<label class="custom-upload" for="detail-operating-two">
														
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
												
												<span class="attach-detailed-overview"><%=(Validator.isNotNull(formNameDocTwo))?formNameDocTwo:""%></span>
											</div>
										</div>
									</div>
									<p class="tab-form-sub-heading">(NOTE: The attached
													statement of account or affidavit must specify the vouchers
													or other evidence in support of the claim)</p>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="common-section-small-heading mb-0">
									<span>2. Check and complete appropriate category:
									</span>
								</p>
								<p class="tab-form-sub-heading pl-3 ml-1">(Indicate the specific components of the claims)</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Unsecured Claim</p>
								<input type="text" class="form-control" id="unsecuredClaim1" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');"
									value="<%=ogtSectionBData!=null?ogtSectionBData.getUnsecuredClaim():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="unsecuredClaim"
									value="UNSECURED CLAIM" <%=ogtSectionBData!=null &&ogtSectionBData.getUnsecuredClaimOf().contains("UNSECURED CLAIM")?"checked":StringPool.BLANK%> name="specificClaim"> <label
									for="unsecuredClaim">
									<p class="common-section-small-heading mb-3">
										<span>
											Unsecured Claim of $<span class="giluio unsecuredClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getUnsecuredClaim():StringPool.BLANK %></span> (Section 202)
										</span>
									</p>
								</label>
							</div>
							<div class="form-group mb-0">
							<div class="">
									<div class="wizard-form-radio d-block d-flex align-items-center">
										<input value="I do not claim a right to a priority" type="radio" name="regardingAmount" <%=ogtSectionBData!=null &&ogtSectionBData.getRegardingTheAmount().contains("I do not claim a right to a priority")?"checked":StringPool.BLANK%>
											placeholder=""> <label for="" class="mb-0">Regarding the amount of $<span class="giluio unsecuredClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getUnsecuredClaim():StringPool.BLANK %></span>, I do not claim a right to a priority.</label>
									</div>
									<div class="wizard-form-radio d-block d-flex align-items-center">
										<input value="I claim a right to a priority under Section 202 of the Act" id="" type="radio" name="regardingAmount" <%=ogtSectionBData!=null &&ogtSectionBData.getRegardingTheAmount().contains("I claim a right to a priority under Section 202 of the Act")?"checked":StringPool.BLANK%>>
										<label for="" class="mb-0">Regarding the amount of $<span class="giluio unsecuredClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getUnsecuredClaim():StringPool.BLANK %></span>, I claim a right to a priority under Section 202 of the Act</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="common-section-small-heading mb-3">
									<span>Indicate whether claim is for:
									</span>
								</p>
								<p class="tab-form-main-heading"><b>Category 1</b></p>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="reasonableFuneral1"
										value="Reasonable funeral and testamentary expenses" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryOne().contains("Reasonable funeral and testamentary expenses")?"checked":StringPool.BLANK%>
										name="category1"> <label
										for="reasonableFuneral1">
										<p class="tab-form-main-heading mb-0">Reasonable funeral
											and testamentary expenses</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="costsAdministration2"
										value="Costs of Administration" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryOne().contains("Costs of Administration")?"checked":StringPool.BLANK%>
										name="category1"> <label
										for="costsAdministration2">
										<p class="tab-form-main-heading mb-0">Costs of
											Administration</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="prescribedFees3"
										value="Prescribed fees payable to the Supervisor of Insolvency" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryOne().contains("Prescribed fees payable to the Supervisor of Insolvency")?"checked":StringPool.BLANK%>
										name="category1"> <label for="prescribedFees3">
										<p class="tab-form-main-heading mb-0">Prescribed fees
											payable to the Supervisor of Insolvency</p>
									</label>
								</div>
								<p class="tab-form-main-heading"><b>Category 2</b></p>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="nationalHousing1"
										value="Contributions payable by the debtor pursuant to the: National Housing Trust Act, National Insurance Act; Pensions (Superannuation Funds and Retirement Schemes" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryTwo().contains("Contributions payable by the debtor pursuant to the: National Housing Trust Act, National Insurance Act; Pensions (Superannuation Funds and Retirement Schemes")?"checked":StringPool.BLANK%>
										name="category2"> <label for="nationalHousing1">
										<p class="tab-form-main-heading mb-0">Contributions
											payable by the debtor pursuant to the: National Housing Trust
											Act, National Insurance Act; Pensions (Superannuation Funds
											and Retirement Schemes) Act</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="salariesWages2"
										value="Wages and Salaries" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryTwo().contains("Wages and Salaries")?"checked":StringPool.BLANK%> name="category2"> <label
										for="salariesWages2">
										<p class="tab-form-main-heading mb-0">Wages and Salaries</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="redundancies3" value="Redundancies" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryTwo().contains("Redundancies")?"checked":StringPool.BLANK%>
										name="category2"> <label for="redundancies3">
										<p class="tab-form-main-heading mb-0">Redundancies</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="taxes4" value="Taxes" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryTwo().contains("Taxes")?"checked":StringPool.BLANK%> name="category2">
									<label for="taxes4">
										<p class="tab-form-main-heading mb-0">Taxes</p>
									</label>
								</div>
								<p class="tab-form-main-heading"><b>Category 3</b></p>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="securedCreditors1"
										value="Secured creditors" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryThree().contains("Secured creditors")?"checked":StringPool.BLANK%> name="category3"> <label
										for="securedCreditors1">
										<p class="tab-form-main-heading mb-0">Secured creditors</p>
									</label>
								</div>
								<p class="tab-form-main-heading"><b>Category 4</b></p>
								<div class="checkbox-form-group second-custom-checkbox ml-4">
									<input type="checkbox" id="Other1" value="Other" <%=ogtSectionBData!=null &&ogtSectionBData.getCategoryFour().contains("Other")?"checked":StringPool.BLANK%> name="category4" />
									<label for="Other1">
										<p class="tab-form-main-heading mb-0">Other</p>
									</label>
								</div>
							</div>
							<div class="ml-4">
								<div class="form-group mt-2 hide pleaseSpecify">
									<p class="tab-form-heading">Please Specify</p>
									<input type="text" class="form-control" id="name-other-purpose"
										placeholder="" value="<%=ogtSectionBData!=null?ogtSectionBData.getOtherPleaseSpecify():StringPool.BLANK %>"/>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Secured Claim</p>
								<input type="text" class="form-control" id="securedClaim1" oninput="this.value = this.value.replace(/[^\d.$]|^\.|(\..*)\./g, '$1');" 
									value="<%=ogtSectionBData!=null?ogtSectionBData.getSecuredClaim():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="securedClaim" value="SECURED CLAIM" <%=ogtSectionBData!=null &&ogtSectionBData.getSecuredClaimOf().contains("SECURED CLAIM")?"checked":StringPool.BLANK%>
										name="securedClaim"> <label for="securedClaim">
										<p class="common-section-small-heading mb-3">
											<span>
											Secured Claim of $<span class="giluio securedClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getSecuredClaim():StringPool.BLANK %></span> (Sections 192-194)
											</span>
										</p>
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading mb-0">
								As security for this claim, I hold the following property of the
								debtor valued at $<span class="giluio securedClaim1"><%=ogtSectionBData!=null?ogtSectionBData.getSecuredClaim():StringPool.BLANK %></span>
							</p>
							<p class="tab-form-sub-heading">(Provide a description of the property over which security is held, including the date and nature of the security and details of any assessment of its value)</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Description</p>
								<textarea rows="3" id="descriptionsClaim" class="form-control"
									maxlength="255" placeholder="Description"
									style="border-radius: 5px; width: 100%"><%=ogtSectionBData!=null?ogtSectionBData.getDescription():StringPool.BLANK %></textarea>
							</div>
						</div>
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
												<input type="file" id="secured-claim"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>secured-claim">
												<label class="custom-upload" for="secured-claim">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formSecuredNameDoc))?formSecuredNameDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading">Relation with Debtor</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="knowledge">
										<option selected="" disabled="">Please Select</option>
										<option value="I am" <%=ogtSectionBData!=null?ogtSectionBData.getRelationWithDebtor().equals("I am")?"selected":"":StringPool.BLANK%>>I am</option>
										<option value="I am not" <%=ogtSectionBData!=null?ogtSectionBData.getRelationWithDebtor().equals("I am not")?"selected":"":StringPool.BLANK%>>I am not</option>
										<option value="the above-named creditor is" <%=ogtSectionBData!=null?ogtSectionBData.getRelationWithDebtor().equals("the above-named creditor is")?"selected":"":StringPool.BLANK%>>the above-named creditor is</option>
										<option value="the above-named creditor is not" <%=ogtSectionBData!=null?ogtSectionBData.getRelationWithDebtor().equals("the above-named creditor is not")?"selected":"":StringPool.BLANK%>>the above-named creditor is not</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="common-section-small-heading mb-3">
									<span>
									That, to the best of my knowledge, <span class="giluio knowledge"><%=ogtSectionBData!=null?ogtSectionBData.getRelationWithDebtor():StringPool.BLANK %></span> related to the debtor within the meaning 
									of section 2 of the Act.
									</span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="common-section-small-heading mb-3">
									<span>4. That the following are the payments that I have
										received from, and the credits that I have allowed to, the
										debtor within the three months (or, if the creditor and the
										debtor are related within the meaning of Section 2 of the Act,
										within the 12 months) immediately before the date of the
										initial bankruptcy event within the meaning of Section 2 of
										the Act: (Provide details of payments and credits)</span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<textarea rows="3" id="paymentDetailDescription"  maxlength="255" class="form-control" placeholder="Enter Description" style="border-radius: 5px; width: 100%"><%=ogtSectionBData!=null?ogtSectionBData.getBankruptcyEventDescription():StringPool.BLANK %></textarea>
							</div>
						</div>
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
												<input type="file" id="details-payments"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>details-payments">
												<label class="custom-upload" for="details-payments">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formDetailPayNameDoc))?formDetailPayNameDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="common-section-small-heading mb-3">
									<span>
										Bankruptcy of an Individual:
									</span>
								</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bankruptcyIndi1"
										value="I request to be advised of the amount that the bankrupt is required to pay, pursuant to section 94 of the Act, or any amendment of that amount" <%=ogtSectionBData!=null &&ogtSectionBData.getBankruptcyOfAnIndividual().contains("I request to be advised of the amount that the bankrupt is required to pay, pursuant to section 94 of the Act, or any amendment of that amount")?"checked":StringPool.BLANK%>
										name="bankruptcyIndi"> <label for="bankruptcyIndi1">
										<p class="tab-form-main-heading mb-0">I request to be
											advised of the amount that the bankrupt is required to pay,
											pursuant to section 94 of the Act, or any amendment of that
											amount</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="bankruptcyIndi2"
										value="I request that a copy of the Report filed by the trustee regarding the bankrupt's application for discharge pursuant to section 141 of the Act, be sent to the above address" 
										<%=ogtSectionBData!=null &&ogtSectionBData.getBankruptcyOfAnIndividual().contains("I request that a copy of the Report filed by the trustee regarding the bankrupt's application for discharge pursuant to section 141 of the Act, be sent to the above address")?"checked":StringPool.BLANK%>
										name="bankruptcyIndi">
										<label for="bankruptcyIndi2">
										<p class="tab-form-main-heading mb-0">I request that a
											copy of the Report filed by the trustee regarding the
											bankrupt's application for discharge pursuant to section 141
											of the Act, be sent to the above address</p>
									</label>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="claim-to-property-form hide">
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-title-subtitle f2 mb-0">
									Claim to Property (Section 105)</p>
								<p class="tab-form-sub-heading">(To be completed by
									persons claiming an interest other than pursuant to a security
									agreement or as a spouse)</p>
							</div>
						</div>
						<div class="col-md-6"> 
                          <div class="form-group"> 
                           <p class="tab-form-main-heading" for="bankruptcyDatePro">Date of the Bankruptcy</p> 
                           <input type="date" class="form-control" id="bankruptcyDatePro" value="<%=propertyClaim!=null&&propertyClaim.getPropertyDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(propertyClaim.getPropertyDate()):StringPool.BLANK %>" placeholder=""> 
                          </div> 
                        </div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									1. That, as at the date of the bankruptcy, namely, the day of <span
										class="giluio bankruptcyDatePro"><%=propertyClaim!=null&&propertyClaim.getPropertyDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(propertyClaim.getPropertyDate()):StringPool.BLANK %></span> the following property
									was in the possession of the bankrupt, and still remains in the
									possession of the bankrupt or the trustee: (Here identify the
									property being claimed)
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<!-- <p class="tab-form-main-heading">Address</p> -->
								<textarea rows="3" id="propClaimDescription"  maxlength="255" class="form-control" placeholder="Enter Description" style="border-radius: 5px; width: 100%"><%=propertyClaim!=null?propertyClaim.getPropClaimDesc():StringPool.BLANK %></textarea>
							</div>
						</div>
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
												<input type="file" id="bankrupt-possession"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>bankrupt-possession">
												<label class="custom-upload" for="bankrupt-possession">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formBankruptcyNameDoc))?formBankruptcyNameDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading">
									2. I hereby claim that property, or interest or right in it, by
									virtue of the document(s) exhibited to the Affidavit attached
									as <b>Schedule 'A',</b> namely:
								</p>
								<p class="tab-form-sub-heading ">(List all the documents
									exhibited to the Affidavit as proof of the claim.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<!-- <p class="tab-form-main-heading">Address</p> -->
								<textarea rows="3" id="affidavitDescription"  maxlength="255" class="form-control" placeholder="Enter Description" style="border-radius: 5px; width: 100%"><%=propertyClaim!=null?propertyClaim.getAffidavitDesc():StringPool.BLANK %></textarea>
							</div>
						</div>
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
												<input type="file" id="affidavit-attached"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>affidavit-attached">
												<label class="custom-upload" for="affidavit-attached">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formAffidavitNameDoc))?formAffidavitNameDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-sub-heading">
								<b>NOTE:</b> A claim to property must be supported by an
								Affidavit:
							</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">a. Verifying the grounds on
									which the claim is based,</li>
								<li class="list-group-item">b. Providing sufficient
									particulars to enable the property to be identified, and</li>
								<li class="list-group-item mb-4">c. If the particulars do not
									appear on the face of the documents exhibited, include any
									additional statement setting forth the particulars.</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="claim-by-spouse-form hide">
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-title-subtitle f2 mb-0">
									Claim by Spouse (Section 99)
								</p>
								<p class="tab-form-sub-heading">To be completed by
									persons fitting within the definition of "spouse" in Section 2
									of the Act)</p>
							</div>
						</div>
						<div class="col-md-6"> 
                          <div class="form-group"> 
                           <p class="tab-form-main-heading" for="bankruptcyDateSpouse">Date of the Bankruptcy</p> 
                           <input type="date" class="form-control" id="bankruptcyDateSpouse" value="<%=spouseClaim!=null&&spouseClaim.getSpouseDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(spouseClaim.getSpouseDate()):StringPool.BLANK %>" placeholder=""> 
                          </div> 
                         </div>
						<div class="col-md-12">
							<div class="form-group">
							<p class="tab-form-main-heading">
								<b>3.</b> That, as at the date of the bankruptcy, namely, the day of <span
									class="giluio bankruptcyDateSpouse"><%=spouseClaim!=null&&spouseClaim.getSpouseDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(spouseClaim.getSpouseDate()):StringPool.BLANK %></span>, I was
								married to the bankrupt and claim one half of the net proceeds,
								if any, realized from the sale of the following real property
								registered in the name of the bankrupt, after the satisfaction
								of any valid and enforceable charges registered in the
								appropriate registry: (Here identify the property being claimed.
								Note that the claim is restricted to the matrimonial home and
								any immediately related real property not exceeding one acre.)
							</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<!-- <p class="tab-form-main-heading">Address</p> -->
								<textarea rows="3" id="claimSpouseDescription"  maxlength="255" class="form-control" placeholder="Enter Description" style="border-radius: 5px; width: 100%"><%=spouseClaim!=null?spouseClaim.getClaimSpouseDesc():StringPool.BLANK %></textarea>
							</div>
						</div>
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
												<input type="file" id="claim-by-spouse"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>claim-by-spouse">
												<label class="custom-upload" for="claim-by-spouse">
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
										<span class="attach-detailed-overview"><%=(Validator.isNotNull(formClaimBySpouseNameDoc))?formClaimBySpouseNameDoc:""%></span>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-sub-heading">
								<span>NOTE:</span> A claim under section 99 must be made within
								10 days of the date of the bankruptcy.
							</p>
							<p class="tab-form-sub-heading">
								<b>WARNINGS: A trustee, may pursuant to the Act,
									redeem a security on payment to the secured creditor of the
									debt or the value of the security as assessed, in a proof of
									claim, by the secured creditor. (Section 194(3)) <br /> The
									Act provides severe penalties for making any false claim,
									proof, declaration or statement of account. (Section 291)
								</b>
							</p>
						</div>
					</div>
				</div>
			</div>
			
			<button type="button" id="saveName" onclick="addSectionBForm(false);addProofOfClaimFormB(false);"
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
				<div class="signature-info-form">
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of the person
									completing Form</p>
								<input type="text" class="form-control" id="completingFormAct"
									value="<%=spouseClaim!=null?spouseClaim.getNameCompletionForm():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-6"> 
                          <div class="form-group"> 
                           <p class="tab-form-main-heading" for="datePerson">Date</p> 
                           <input type="date" class="form-control" id="datePerson" value="<%=spouseClaim!=null&&spouseClaim.getNameCompletionDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(spouseClaim.getNameCompletionDate()):StringPool.BLANK %>" placeholder=""> 
                          </div> 
                        </div>
                        <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" id="completingPersonAddress"  maxlength="255" class="form-control" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=spouseClaim!=null?spouseClaim.getCompPersonAddress():StringPool.BLANK %></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of the person completing Form</p>
							<div class="signature_texarea mb-2" id="sign-req-image-holder">
							<%if(Validator.isNotNull(formSignOfPersonNameDoc)){ %>
							<img src="<%=formSignOfPersonNameDoc%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="sign-req-upload-btn" hidden=""
								name="<portlet:namespace/>sign-req-upload-btn"> 
								<label
								for="sign-req-upload-btn" class="choose-sign-btn"> <span
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
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Justice of the
									Peace</p>
								<input type="text" class="form-control" id="justicePeace"
									value="<%=spouseClaim!=null?spouseClaim.getNameJusticeOfPeace():StringPool.BLANK %>" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="justicePeaceParish">
										<option value="" disabled="" selected="">Please Select</option>
										<option value="Kingston" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>	
								<option value="St. Andrew" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>	
								<option value="Portland" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>	
								<option value="St. Thomas" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>	
								<option value="St. Catherine" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>	
								<option value="St. Mary" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>	
								<option value="St. Ann" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>	
								<option value="Manchester" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>	
								<option value="Clarendon" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>	
								<option value="Hanover" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>	
								<option value="Westmoreland" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>	
								<option value="St. James" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>	
								<option value="Trelawny" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>	
								<option value="St. Elizabeth" <%=spouseClaim!=null?spouseClaim.getJusticePeaceParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Justice of the Peace</p>
							<div class="signature_texarea mb-2" id="sign-req-image-holder-justice">
							<%if(Validator.isNotNull(formSignOfJusticeNameDoc)){ %>
							<img src="<%=formSignOfJusticeNameDoc%>"  width="100" height="100"/>
							<%} %>
							</div>
							<input type="file" id="sign-req-justice-upload-btn" hidden=""
								name="<portlet:namespace/>sign-req-justice-upload-btn"> <label
								for="sign-req-justice-upload-btn" class="choose-sign-btn"> <span
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
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
		<script>
	$("#applicantClaimant").change(function(){
		applicantClaimant = $(this).val();
	    if(applicantClaimant == "Individual"){
	    	$(".indi-detail").removeClass("hide");
	    	$(".com-detail").addClass("hide");
	    }else{
	    	$(".com-detail").removeClass("hide");
	    	$(".indi-detail").addClass("hide");
	    }
	});
	$("#insolventPersonNature").change(function(){
		insolventPersonNature = $(this).val();
	    if(insolventPersonNature == "Individual"){
	    	$(".insolvent-indi-detail").removeClass("hide");
	    	$(".insolvent-com-detail").addClass("hide");
	    }else{
	    	$(".insolvent-com-detail").removeClass("hide");
	    	$(".insolvent-indi-detail").addClass("hide");
	    }
	});
	$("#knowledge").change(function(){
		$(".knowledge").html($(this).val());
	});
	function addClaimantDetailsFormInfo(theSaveandContinue){
		ogtApplicationId=$("#ogtApplicationId").val();
		applicantClaimant=$("#applicantClaimant").val();
		indiFirstName=$("#indiFirstName").val();
		indiLastName=$("#indiLastName").val();
		companyName=$("#companyName").val();
		address=$("#address").val();
		emailAddress=$("#emailAddress").val();
		telephone=$("#telephone").val();
		faxNo=$("#fax-no").val();
		applicationDate=$("#applicationDate").val();
		trnNumber=$("#trnNumber").val();
		submitForm= true;
		if(!theSaveandContinue){
			claimBankrupt=$("input[name='claimBankrupt']:checked").val();
			var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if(!emailAddress){
				$("#emailAddressValidation").removeClass("hide");
				$("#emailAddressValidation").text("Please Enter Email Address");
				$("#emailAddress").focus();
				submitForm= false;
			}else if(emailAddress.match(mailformat)){ 
				$("#emailAddressValidation").addClass("hide");
			}else{
				$("#emailAddressValidation").removeClass("hide");
				$("#emailAddressValidation").text("You have Entered an In-valid email address");
				$("#emailAddress").focus();
				submitForm= false;
			}
			if(applicantClaimant == "Individual"){
				if(!indiFirstName){
					$("#indiFirstNameValidation").removeClass("hide");
					$("#indiFirstName").focus();
					submitForm= false;
				}else{
					$("#indiFirstNameValidation").addClass("hide");
				}
				if(!indiLastName){
					$("#indiLastNameValidation").removeClass("hide");
					$("#indiLastName").focus();
					submitForm= false;
				}else{
					$("#indiLastNameValidation").addClass("hide");
				}
			}
			if(applicantClaimant == "Company"){
				if(!companyName){
					$("#companyNameValidation").removeClass("hide");
					$("#companyName").focus();
					submitForm= false;
				}else{
					$("#companyNameValidation").addClass("hide");
				}
			}
			if(!applicantClaimant){
				$("#applicantClaimantValidation").removeClass("hide");
				$("#applicantClaimant").focus();
				submitForm= false;
			}else{
				$("#indiFirstNameValidation").addClass("hide");
			}
		}
/* 		if(applicantClaimant == "Company"){
			if(!companyName){
				$("#companyNameValidation").removeClass("hide");
				$("#companyName").focus();
				submitForm= false;
			}else{
				$("#companyNameValidation").addClass("hide");
			}
		}
		if(!applicantClaimant){
			$("#applicantClaimantValidation").removeClass("hide");
			$("#applicantClaimant").focus();
			submitForm= false;
		}else{
			$("#applicantClaimantValidation").addClass("hide");
		}	 */
	if(submitForm){
		$.ajax({
		    type: "POST",
		    url: "${claimantDetailInfoUrl}",
		    data: {
		         "<portlet:namespace/>applicantClaimant":applicantClaimant,
		         "<portlet:namespace/>indiFirstName":indiFirstName,
		         "<portlet:namespace/>indiLastName":indiLastName,
		         "<portlet:namespace/>companyName":companyName,
		         "<portlet:namespace/>address":address,
		         "<portlet:namespace/>emailAddress":emailAddress,
		         "<portlet:namespace/>telephone":telephone,
		         "<portlet:namespace/>faxNo":faxNo,
		         "<portlet:namespace/>applicationDate":applicationDate,
		         "<portlet:namespace/>trnNumber":trnNumber,
		         /* "<portlet:namespace/>claimBankrupt":claimBankrupt, */
			     "<portlet:namespace/>ogtApplicationId": ogtApplicationId,

			    },
		    success: function (data) {
				if(!theSaveandContinue){
					applicantInfo();
				}
			},					
			error: function (data) {},	
			});
		}	
		if(applicantClaimant == "Individual"){
			indiFirstName=$("#indiFirstName").val();
			indiLastName=$("#indiLastName").val();
			indiName = indiFirstName+" "+indiLastName;
			$("#claimantName").val(indiName);
			$(".claimantName").html(indiName);
		}else{
			$("#claimantName").val(companyName);
			$(".claimantName").html(companyName);
		}
	}
	function addInsolventDetailFormInfo(theSaveandContinue){
		ogtApplicationId=$("#ogtApplicationId").val();
		insolventPersonNature=$("#insolventPersonNature").val();
		insolventIndiFirstName=$("#insolventIndiFirstName").val();
		insolventIndiLastName=$("#insolventIndiLastName").val();
		insolventCompanyName=$("#insolventCompanyName").val();
		debtstatute=$("input[name='Debtstatute']:checked").val();
		submitForm= true;
		if(!theSaveandContinue){
			if(insolventPersonNature == "Individual"){
				if(!insolventIndiFirstName){
					$("#insolventIndiFirstNameValidation").removeClass("hide");
					$("#insolventIndiFirstName").focus();
					submitForm= false;
				}else{
					$("#insolventIndiFirstNameValidation").addClass("hide");
				}
				if(!insolventIndiLastName){
					$("#insolventIndiLastNameValidation").removeClass("hide");
					$("#insolventIndiLastName").focus();
					submitForm= false;
				}else{
					$("#insolventIndiLastNameValidation").addClass("hide");
				}
			}
		
			if(insolventPersonNature == "Company"){
				if(!insolventCompanyName){
					$("#insolventCompanyNameValidation").removeClass("hide");
					$("#insolventCompanyName").focus();
					submitForm= false;
				}else{
					$("#companyNameValidation").addClass("hide");
				}
			}
		}
		if(submitForm){
			$.ajax({
			    type: "POST",
			    url: "${insolventPersonDetailInfoUrl}",
			    data: {
			         "<portlet:namespace/>insolventPersonNature":insolventPersonNature,
			         "<portlet:namespace/>insolventIndiFirstName":insolventIndiFirstName,
			         "<portlet:namespace/>insolventIndiLastName":insolventIndiLastName,
			         "<portlet:namespace/>insolventCompanyName":insolventCompanyName,
			         "<portlet:namespace/>debtstatute":debtstatute,
				     "<portlet:namespace/>ogtApplicationId": ogtApplicationId,
	
				    },
			    success: function (data) {
			    	$("#ogtformsFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					if(!theSaveandContinue){
						applicantInfo();
					}
			    },
			    error: function (data) {},
			  });
		}
		if(insolventPersonNature == "Individual"){
			insolventIndiName = insolventIndiFirstName+" "+insolventIndiLastName;
			$("#debtorName").val(insolventIndiName);
			$(".debtorName").html(insolventIndiName);
		}else{
			$("#debtorName").val(insolventCompanyName);
			$(".debtorName").html(insolventCompanyName);
		}
	}
	function addProofOfClaimFormA(theSaveandContinue){
		ogtApplicationId=$("#ogtApplicationId").val();
		claimProofMatter=$("#claimantAttachment").val();
		var proofMatter = new Array();
		$("input:checkbox[name=claimantAttached]:checked").each(function(){
			proofMatter.push($(this).val());
		});
		var claimProofMatter = proofMatter.toString();
		
		debtorName=$("#debtorName").val();
		claimantName=$("#claimantName").val();
		claimAddress=$("#claimAddress").val();
		claimPhone=$("#claimPhone").val();
		faxClaim=$("#faxClaim").val();
		emailAddressClaim=$("#emailAddressClaim").val();
		completingForm=$("#completingForm").val();
		claimCertifyCheck=$("input[name='incorporationLodged']:checked").val();
		positionCompletingForm=$("#positionCompletingForm").val();
		claimDebtor=$("#claimDebtor").val();
		claimName=$("#claimName").val();
		applicationDateCa=$("#applicationDateCa").val();
		valueOfClaim=$("#valueOfClaim").val();
		
		var statementAccount = new Array();
		$("input:checkbox[name=statementAccount]:checked").each(function(){
			statementAccount.push($(this).val());
		});
		var statementOfAccount =  statementAccount.toString();
		
		var specificClaim = new Array();
		$("input:checkbox[name=specificClaim]:checked").each(function(){
			specificClaim.push($(this).val());
		});
		var specificClaimed = specificClaim.toString();
		
		unsecuredClaimOne=$("#unsecuredClaim1").val();
		regardingAmountOne=$("input[name='regardingAmount']:checked").val();
		var categoryOne = new Array();
		$("input:checkbox[name=category1]:checked").each(function(){
			categoryOne.push($(this).val());
		});
		var categoryOneClaimed = categoryOne.toString();
		
		var categoryTwo = new Array();
		$("input:checkbox[name=category2]:checked").each(function(){
			categoryTwo.push($(this).val());
		});
		var categoryTwoClaimed = categoryTwo.toString();
		
		var categoryThree = new Array();
		$("input:checkbox[name=category3]:checked").each(function(){
			categoryThree.push($(this).val());
		});
		var categoryThreeClaimed = categoryThree.toString();
		
		var categoryFour = new Array();
		$("input:checkbox[name=category4]:checked").each(function(){
			categoryFour.push($(this).val());
		});
		var categoryFourClaimed = categoryFour.toString();
		
		otherPleaseSpecify=$("#name-other-purpose").val();
		
		var securedClaimed = new Array();
		$("input:checkbox[name=securedClaim]:checked").each(function(){
			securedClaimed.push($(this).val());
		});
		var securedClaim = securedClaimed.toString();
		
		securedClaimOne=$("#securedClaim1").val();
		descriptionsClaim=$("#descriptionsClaim").val();
		knowledgeCred=$("#knowledge").val();
		paymentDetailDescription=$("#paymentDetailDescription").val();
		var bankruptcyIndi = new Array();
		$("input:checkbox[name=bankruptcyIndi]:checked").each(function(){
			bankruptcyIndi.push($(this).val());
		});
		var bankruptIndividual = bankruptcyIndi.toString();
		$.ajax({
		    type: "POST",
		    url: "${claimToCreditorInfoUrl}",
		    data: {
		         "<portlet:namespace/>claimProofMatter":claimProofMatter,
		         "<portlet:namespace/>debtorName":debtorName,
		         "<portlet:namespace/>claimantName":claimantName,
		         "<portlet:namespace/>claimAddress":claimAddress,
		         "<portlet:namespace/>claimPhone":claimPhone,
		         "<portlet:namespace/>faxClaim":faxClaim,
		         "<portlet:namespace/>emailAddressClaim":emailAddressClaim,
		         "<portlet:namespace/>completingForm":completingForm,
		         "<portlet:namespace/>claimCertifyCheck":claimCertifyCheck,
		         "<portlet:namespace/>positionCompletingForm":positionCompletingForm,
		         "<portlet:namespace/>claimedDebtor":claimDebtor,
		         "<portlet:namespace/>claimName":claimName,
		         "<portlet:namespace/>applicationDateCa":applicationDateCa,
		         "<portlet:namespace/>valueOfClaim":valueOfClaim,
		         "<portlet:namespace/>specificClaimed":specificClaimed,
		         "<portlet:namespace/>statementOfAccount":statementOfAccount,
		         "<portlet:namespace/>unsecuredClaimOne":unsecuredClaimOne,
		         "<portlet:namespace/>regardingAmountOne":regardingAmountOne,
		         "<portlet:namespace/>categoryOneClaimed":categoryOneClaimed,
		         "<portlet:namespace/>categoryTwoClaimed":categoryTwoClaimed,
		         "<portlet:namespace/>categoryThreeClaimed":categoryThreeClaimed,
		         "<portlet:namespace/>categoryFourClaimed":categoryFourClaimed,
		         "<portlet:namespace/>otherPleaseSpecify":otherPleaseSpecify,
		         "<portlet:namespace/>securedClaim":securedClaim,
		         "<portlet:namespace/>securedClaimOne":securedClaimOne,
		         "<portlet:namespace/>descriptionsClaim":descriptionsClaim,
		         "<portlet:namespace/>knowledgeCred":knowledgeCred,
		         "<portlet:namespace/>paymentDetailDescription":paymentDetailDescription,
		         "<portlet:namespace/>bankruptIndividual":bankruptIndividual,
			     "<portlet:namespace/>ogtApplicationId": ogtApplicationId,
			    },
		    success: function (data) {
		    	uploadDocuments('detail-operating',"Attached Statement of Account",'');
		    	uploadDocuments('detail-operating-two',"Attached Statement of Account two",'');
		    	uploadDocuments('secured-claim',"Secured Claim",'');
		    	uploadDocuments('details-payments',"Details of Payments",'');
				if(!theSaveandContinue){
					applicantInfo();
				}
		    },
		    error: function (data) {},
		  });
	}
	function addProofOfClaimFormB(theSaveandContinue){
		ogtApplicationId=$("#ogtApplicationId").val();
		bankruptcyDatePro=$("#bankruptcyDatePro").val();
		propClaimDescription=$("#propClaimDescription").val();
		affidavitDescription=$("#affidavitDescription").val();
		$.ajax({
		    type: "POST",
		    url: "${claimToPropertyInfoUrl}",
		    data: {
		         "<portlet:namespace/>bankruptcyDatePro":bankruptcyDatePro,
		         "<portlet:namespace/>propClaimDescription":propClaimDescription,
		         "<portlet:namespace/>affidavitDescription":affidavitDescription,
			     "<portlet:namespace/>ogtApplicationId": ogtApplicationId,

			    },
		    success: function (data) {
		    	uploadDocuments('bankrupt-possession',"Possession Of Bankruptcy",'');
		    	uploadDocuments('affidavit-attached',"Affidavit Attached",'');
				if(!theSaveandContinue){
					applicantInfo();
				}
		    },
		    error: function (data) {},
		  });
	}
	
	
	function addSectionBForm(theSaveandContinue){
		theDebtor=$("#claimDebtor").val();
		name=$("#claimName").val();
		dateOfInsolvency=$("#applicationDateCa").val();
		valueOfClaim=$("#valueOfClaim").val();
		var statementAccount = new Array();
		$("input:checkbox[name=statementAccount]:checked").each(function(){
			statementAccount.push($(this).val());
		});
		var statementOfAccount =  statementAccount.toString();
		unsecuredClaim=$("#unsecuredClaim1").val();
		var specificClaim = new Array();
		$("input:checkbox[name=specificClaim]:checked").each(function(){
			specificClaim.push($(this).val());
		});
		var unsecuredClaimOf  = specificClaim.toString();
		regardingAmount=$("input[name='regardingAmount']:checked").val();
		var categoryOne = new Array();
		$("input:checkbox[name=category1]:checked").each(function(){
			categoryOne.push($(this).val());
		});
		var categoryOneValue = categoryOne.toString();
		
		var categoryTwo = new Array();
		$("input:checkbox[name=category2]:checked").each(function(){
			categoryTwo.push($(this).val());
		});
		var categoryTwoValue = categoryTwo.toString();
		
		var categoryThree = new Array();
		$("input:checkbox[name=category3]:checked").each(function(){
			categoryThree.push($(this).val());
		});
		var categoryThreeValue = categoryThree.toString();
		
		var categoryFour = new Array();
		$("input:checkbox[name=category4]:checked").each(function(){
			categoryFour.push($(this).val());
		});
		var categoryFourValue = categoryFour.toString();
		otherPleaseSpecify=$("#name-other-purpose").val();
		securedClaim=$("#securedClaim1").val();
		var securedClaimed = new Array();
		$("input:checkbox[name=securedClaim]:checked").each(function(){
			securedClaimed.push($(this).val());
		});
		var securedClaimOf = securedClaimed.toString();
		description=$("#descriptionsClaim").val();
		relationWithDebtor=$("#knowledge").val();
		paymentDetailDescription=$("#paymentDetailDescription").val();
		var bankruptcyIndi = new Array();
		$("input:checkbox[name=bankruptcyIndi]:checked").each(function(){
			bankruptcyIndi.push($(this).val());
		});
		var bankruptIndividual = bankruptcyIndi.toString();
		ogtApplicationId=$("#ogtApplicationId").val();
		$.ajax({
		    type: "POST",
		    url: "${sectionBForm}",
		    data: {
		         "<portlet:namespace/>theDebtor":theDebtor,
		         "<portlet:namespace/>name":name,
		         "<portlet:namespace/>dateOfInsolvency":dateOfInsolvency,
		         "<portlet:namespace/>valueOfClaim":valueOfClaim,
		         "<portlet:namespace/>statementOfAccount":statementOfAccount,
		         "<portlet:namespace/>unsecuredClaim":unsecuredClaim,
		         "<portlet:namespace/>unsecuredClaimOf":unsecuredClaimOf,
		         "<portlet:namespace/>regardingAmount":regardingAmount,
		         "<portlet:namespace/>categoryOneValue":categoryOneValue,
		         "<portlet:namespace/>categoryTwoValue":categoryTwoValue,
		         "<portlet:namespace/>categoryThreeValue":categoryThreeValue,
		         "<portlet:namespace/>categoryFourValue":categoryFourValue,
		         "<portlet:namespace/>otherPleaseSpecify":otherPleaseSpecify,
		         "<portlet:namespace/>securedClaim":securedClaim,
		         "<portlet:namespace/>securedClaimOf":securedClaimOf,
		         "<portlet:namespace/>description":description,
		         "<portlet:namespace/>relationWithDebtor":relationWithDebtor,
		         "<portlet:namespace/>paymentDetailDescription":paymentDetailDescription,
		         "<portlet:namespace/>bankruptIndividual":bankruptIndividual,
			     "<portlet:namespace/>ogtApplicationId": ogtApplicationId,
			    },
		    success: function (data) {
		    	uploadDocuments('detail-operating',"Attached Statement of Account",'');
		    	uploadDocuments('detail-operating-two',"Attached Statement of Account two",'');
		    	uploadDocuments('secured-claim',"Secured Claim",'');
		    	uploadDocuments('details-payments',"Details of Payments",'');
		    	if(!theSaveandContinue){
					console.log("inside false");
					applicantInfo();
				}
		    },
		    error: function (data) {},
		});
	}
	
	function addProofOfClaimFormC(){
		ogtApplicationId=$("#ogtApplicationId").val();
		bankruptcyDateSpouse=$("#bankruptcyDateSpouse").val();
		claimSpouseDescription=$("#claimSpouseDescription").val();
		completingFormAct=$("#completingFormAct").val();
		datePerson=$("#datePerson").val();
		completingPersonAddress=$("#completingPersonAddress").val();
		justicePeace=$("#justicePeace").val();
		justicePeaceParish=$("#justicePeaceParish").val();
		var voting = new Array();
		$("input:checkbox[name=amountClaimed]:checked").each(function(){
			voting.push($(this).val());
		});
		var votingClaimed = voting.toString();
		amountAdmitted=$("#amountAdmitted").val();
		dateVoting=$("#dateVoting").val();
		amountPayment=$("#amountPayment").val();
		dateAdmitted=$("#dateAdmitted").val();
		$.ajax({
		    type: "POST",
		    url: "${claimToSpouseInfoUrl}",
		    data: {
		         "<portlet:namespace/>bankruptcyDateSpouse":bankruptcyDateSpouse,
		         "<portlet:namespace/>claimSpouseDescription":claimSpouseDescription,
		         "<portlet:namespace/>completingFormAct":completingFormAct,
		         "<portlet:namespace/>datePerson":datePerson,
		         "<portlet:namespace/>completingPersonAddress":completingPersonAddress,
		         "<portlet:namespace/>justicePeace":justicePeace,
		         "<portlet:namespace/>justicePeaceParish":justicePeaceParish,
		         "<portlet:namespace/>votingClaimed":votingClaimed,
		         "<portlet:namespace/>amountAdmitted":amountAdmitted,
		         "<portlet:namespace/>dateVoting":dateVoting,
		         "<portlet:namespace/>amountPayment":amountPayment,
		         "<portlet:namespace/>dateAdmitted":dateAdmitted,
			     "<portlet:namespace/>ogtApplicationId": ogtApplicationId,
			    },
		    success: function (data) {
		    	uploadDocuments('sign-req-upload-btn','Signature of Person Completing Form','');
		    	uploadDocuments('sign-req-justice-upload-btn','Signature of Justice Peace','');
		    	uploadDocuments('sign-trustee-upload-btn-first','Signature of Voting Trustee','');
		    	uploadDocuments('sign-trustee-upload-btn-last','Signature of Payment Trustee','');
		    	uploadDocuments('claim-by-spouse',"Claim By Spouse",'');
		    },
		    error: function (data) {},
		  });
	}
	
</script>