<!-- INDIVIDUAL FORM -->
<%@page
	import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeCompanyinfoLocalServiceUtil"%>
<%@page
	import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo"%>
<%@page
	import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeLicenseBreakdowninfoLocalServiceUtil"%>
<%@page
	import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page
	import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil"%>
<%@page
	import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo"%>
<%@page
	import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeDeclerationAndSignatureinfoLocalServiceUtil"%>
<%@page
	import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeDeclerationAndSignatureinfo"%>
<%@page
	import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualQualificationinfoLocalServiceUtil"%>
<%@page
	import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo"%>
<%@page
	import="com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil"%>
<%@page
	import="com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo"%>
<%@ include file="../init.jsp"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar"%>
<%
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, -1);
	Date oneDayBefore = cal.getTime();
	SimpleDateFormat minDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String minDate = minDateFormat.format(oneDayBefore);
	Date currentDate = new Date();
	SimpleDateFormat currentDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String currentDateStr = currentDateFormat.format(currentDate);
%>
<div class="hide" id="osiTrusteeIndiLicenceForm">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep6">
			<div class="tab-form">
				<div class="general-info-form">
					<div class="row">
						 <div class="col-md-12"> 
	                          <p class="tab-form-title f2">General Information(Form 54)</p> 
	                          <p class="tab-form-title-subtitle f2">In this section you will provide general information about yourself.</p> 
                         </div> 
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Family Name *</p>
								<input type="text" class="form-control" id="indiFamilyName" aria-describedby="indiFamilyName"
									value="<%=detailinfo != null && detailinfo.getIndiFamilyName() != null ? detailinfo.getIndiFamilyName() : ""%>">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="indiFamilyNameValidation" style="color: red;">Please
									Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Birth</p>
								<input type="date" class="form-control" id="indiDateOfBirth" aria-describedby="indiDateOfBirth"
									value="<%=detailinfo != null && detailinfo.getIndiDateOfBirth() != null
					? new SimpleDateFormat("yyyy-MM-dd").format(detailinfo.getIndiDateOfBirth())
					: ""%>"
									min='1899-01-01' max='<%=minDate%>'>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Given Name(s)</p>
								<input type="text" class="form-control" id="indiGivenName" aria-describedby="indiGivenName" name="indiGivenName"
									value="<%=detailinfo != null && detailinfo.getIndiGivenName() != null ? detailinfo.getIndiGivenName() : ""%>">
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Other Previous Legal Names
									or Aliases</p>
								<input type="text" class="form-control" id="indiOtherLegalNames" aria-describedby="indiOtherLegalNames" name="indiOtherLegalNames"
									value="<%=detailinfo != null && detailinfo.getIndiOtherLegalNames() != null
					? detailinfo.getIndiOtherLegalNames()
					: ""%>">
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Business Address</p>
								<textarea rows="3" id="indiBusinessAddress" class="form-control"
									maxlength="255" placeholder="Enter Address"
									style="border-radius: 5px; width: 100%"><%=detailinfo != null && detailinfo.getIndiBusinessAddress() != null
					? detailinfo.getIndiBusinessAddress()
					: ""%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone No.</p>
								<input type="text" class="form-control" placeholder="+1 876-876-1234" id="indiBusinessTeleNo"
									value="<%=detailinfo != null && detailinfo.getIndiBusinessTeleNo() != null
					? detailinfo.getIndiBusinessTeleNo()
					: ""%>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No.</p>
								<input type="text" class="form-control" id="indiBusinessFaxNo"
									value="<%=detailinfo != null && detailinfo.getIndiBusinessFaxNo() != null ? detailinfo.getIndiBusinessFaxNo()
							: ""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email *</p>
								<input type="text" class="form-control" id="indiBusinessEmail"
									value="<%=detailinfo != null && detailinfo.getIndiBusinessEmail() != null ? detailinfo.getIndiBusinessEmail()
							: ""%>"
									placeholder="info@example.jm">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="indiBusinessEmailValidation" style="color: red;"></p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Home Address</p>
								<textarea rows="3" id="indiHomeAddress" class="form-control"
									maxlength="255" placeholder="Enter Address"
									style="border-radius: 5px; width: 100%"><%=detailinfo != null && detailinfo.getIndiHomeAddress() != null ? detailinfo.getIndiHomeAddress()
					: ""%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone No.</p>
								<input type="text" class="form-control" placeholder="+1 876-876-1234" id="indiHomeTeleNo"
									value="<%=detailinfo != null && detailinfo.getIndiHomeTeleNo() != null ? detailinfo.getIndiHomeTeleNo() : ""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax No.</p>
								<input type="text" class="form-control" id="indiHomeFaxNo"
									value="<%=detailinfo != null && detailinfo.getIndiHomeFaxNo() != null ? detailinfo.getIndiHomeFaxNo() : ""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email *</p>
								<input type="text" class="form-control" id="indiHomeEmail"
									value="<%=detailinfo != null && detailinfo.getIndiHomeEmail() != null ? detailinfo.getIndiHomeEmail() : ""%>"
									placeholder="info@example.jm">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="indiHomeEmailValidation" style="color: red;"></p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Current Employer</p>
								<input type="text" class="form-control" id="indiCurrentEmployer"
									value="<%=detailinfo != null && detailinfo.getIndiCurrentEmployer() != null
					? detailinfo.getIndiCurrentEmployer()
					: ""%>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date of Employment</p>
								<input type="date" class="form-control"
									id="indiDateOfEmployment"
									value="<%=detailinfo != null && detailinfo.getIndiDateOfEmployment() != null
					? new SimpleDateFormat("yyyy-MM-dd").format(detailinfo.getIndiDateOfEmployment())
					: ""%>">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Professional
									Organization(s) of which I am currently a member (if any)</p>
								<textarea rows="3" id="indiProfessionalOrg" class="form-control"
									maxlength="255" placeholder=""
									style="border-radius: 5px; width: 100%"><%=detailinfo != null && detailinfo.getIndiProfessionalOrg() != null
					? detailinfo.getIndiProfessionalOrg()
					: ""%></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button"
				onclick="truteeIndiDetailInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep7">
			<div class="tab-form">
				<div class="qualification-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Qualifications(Form 54)</p>
							<p class="tab-form-title-subtitle f2">Prerequisite
								Qualifications</p> 
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Formal education (degrees,
								professional designations, year of conferment, post-secondary
								institutions) and relevant work experience. Please provide
								curriculum vitae</p>

							<div class="supporting-document-card my-3">
								<div class="row">
									<div class="col-md-12">
										<div class="supporting-document-card-wrapper">
											<div class="left">
												<p class="supporting-document-card-upper-heading">Attach
													File</p>
											</div>
											<div class="right">
												<input type="file" id="qualificationsForm"
													onchange="attachDetailed(this.id)" hidden="" multiple=""
													name="<portlet:namespace/>qualificationsForm"> <label
													class="custom-upload" for="qualificationsForm"> <span
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
										<%if(Validator.isNotNull(qualificationForm)){%>
													<span class="attach-detailed-overview"><%=qualificationForm%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2 pt-3">Declaration
								Regarding Prerequisite Qualifications</p>
							<p class="tab-form-main-heading">I hereby declare that:</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">I am not
									an insolvent person, nor have I at any time within the five
									year preceding the date of this application, personally been in
									a state of insolvency</li>
								<li class="list-group-item">As a
									member or former member of a professional organization, I am in
									good standing with, and am not subject to any current
									disciplinary action by that organization.</li>
							</ul>
						</div>
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2 pt-3">Specific
								Qualification</p>
						</div>
						<div class="col-md-12">
							<div class="radiobox">
								<div class="form-group">
									<p class="tab-form-main-heading" id="orgMember">If you are
										a member of a professional organization, do you intend to
										retain your membership in that organization when you begin to
										practise as a trustee:</p>
									<div class="wizard-form-radio">
										<input value="Yes"
											<%=individualQualificationinfo != null && individualQualificationinfo.getOrgMember() != null
					&& individualQualificationinfo.getOrgMember().equals("Yes") ? "checked" : ""%>
											type="radio" name="orgMember" /> <label for="orgMember">Yes</label>
									</div>
									<div class="wizard-form-radio">
										<input value="No"
											<%=individualQualificationinfo != null && individualQualificationinfo.getOrgMember() != null
					&& individualQualificationinfo.getOrgMember().equals("No") ? "checked" : ""%>
											type="radio" name="orgMember" /> <label for="orgMember">No</label>
									</div>
									<p class="tab-form-sub-heading">(If yes, and if such membership entitles you to practice a profession that is an incompatible 
									occupation you are required to satisfy the Supervisor of Insolvency that you will be a non-practicing member of the organization.)</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button"
				onclick="indiQualificationDetailInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep8">
			<div class="tab-form">
				<div class="qualification-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Reputation Declaration(Form 54)</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Declaration Relating
								to the Applicant's Reputation</p>
							<p class="tab-form-main-heading">I hereby declare that:</p>
							<ul class="list-group tab-form-sub-heading pb-3">
								<li class="list-group-item">I have no
									criminal record.</li>
								<li class="list-group-item">I have
									never been a bankrupt.</li>
								<li class="list-group-item">I have
									never been a principal shareholder, or director or an officer
									of a bankrupt corporation.</li>
								<li class="list-group-item">As a
									member or former member of a professional organization, I have
									not previously been found guilty of professional misconduct of
									an ethical, commercial or economic nature, except as indicated
									hereafter (please provide documentation)</li>
							</ul>
							<p class="tab-form-sub-heading">"State of insolvency" means being bankrupt, having filed a notice of intention or a proposal under the Insolvency Act, or
							being subject to any similar proceedings under Jamaican or foreign legislation. "Incompatible occupation" includes any
							activity that would or may be perceived to create a conflict of duty, compromise the applicant's ability to perform any
							professional engagement, or jeopardize his integrity, independence or competence, including, but not limited to, the
							activities of a collection agent, a bailiff, an employee of the Office of the Supervisor of Insolvency (except when acting
							pursuant to Sections 240 and 269 of the Act), an attorney-at-law, a notary public or a Justice of the Peace), as well as any
							other occupation, business or profession which may be in conflict with the duties and responsibilities of a trustee.</p>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="nextWithoutSave(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
									<pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156=""
							8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902=""
							0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
								   </svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep9">
			<div class="tab-form">
				<div class="qualification-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Applicant Undertaking(Form 54)</p>
						</div> 
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Undertaking of
								Applicant regarding conditions imposed on new licences</p>
							<p class="tab-form-main-heading">If a trustee licence is
								granted by the Supervisor of Insolvency, I accept that it be
								subject to the following conditions</p>
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">That I
									will, for a period of twenty-four months, practice with and in
									the same physical location as, an active established trustee
									who is acceptable to the Supervisor of Insolvency.</li>
								<li class="list-group-item">That
									where, at any time during those twenty-four months, I do not
									meet the requirement set forth in paragraph (a), I will be
									authorised to act only in the following cases.
									<ul class="list-group list-group-flush">
										<li class="list-group-item">Insolvent proposals.</li>
										<li class="list-group-item">Estates under the summary administration
											provisions of the Act.</li>
										<li class="list-group-item">Estate, known as ordinary administration
											estates, for which the unsecured liabilities, as per the
											Statement of Affairs, do not exceed [$ ] and for which the
											realizable assets as per the Statement of Affairs, after
											deducting the value of all security interests, do not exceed
											[$ ]</li>
										<li class="list-group-item">All other cases (notice of intention,
											Interim Receiver, estates not covered by case (iii) above,
											etc), subject to the approval of the Supervisor and on such
											terms as the Supervisor shall determine, considering my
											performance.</li>
									</ul>
								</li>
							</ul>
							<p class="tab-form-sub-heading">These conditions
								will not necessarily restrict me to any specific employer and
								any transfer or change of employment assuring similar or better
								circumstances would be acceptable. I will inform you in advance
								of any such change.</p>
							<p class="tab-form-sub-heading">I also accept
								that these conditions may, upon written request, be reviewed
								after the period of twenty-four months. They will thus either be
								removed, modified or maintained. If other conditions are to
								apply, I will be so notified by the Supervisor of Insolvency,
								prior to the granting of the licence, formally approved.</p>
							<p class="tab-form-title-subtitle f2">Authorization</p>
							<p class="tab-form-sub-heading">I understand
								that my application for a trustee licence is subject to an
								investigation, and that verification by the Jamaica Constabulary
								Force (JCF) will be conducted with regard to criminal records,
								ongoing or completed investigations and arrest warrants, as well
								as with regard to my background. I hereby authorize and give
								consent to the JCF to release personal information and make full
								disclosure to teh Supervisor of Insolvency, as provided by the
								Insolvency Act.</p>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="nextWithoutSave(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
									<pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156=""
							8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902=""
							0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
								   </svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep10">
			<div class="tab-form">
				<div class="assignment-info-form">
					<div class="row">
					  <div class="col-md-12"> 
                          <p class="tab-form-title f2">Declaration and Signature(Form 54)</p> 
                          </div>
					 	<div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Applicant's Name in block letters *</p>
			                    <input type="text" class="form-control" id="indiUndersignedApplicantName" value="<%=declerationAndSignatureinfo!=null&&declerationAndSignatureinfo.getIndiUndersignedApplicantName()!=null?declerationAndSignatureinfo.getIndiUndersignedApplicantName():"" %>">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="indiUndersignedApplicantNameValidation" style="color: red;"></p>
			                </div>
			             </div>    
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control"
									id="indiUndersignedDated"
									value="<%=declerationAndSignatureinfo != null && declerationAndSignatureinfo.getIndiUndersignedDated() != null
							? new SimpleDateFormat("yyyy-MM-dd")
									.format(declerationAndSignatureinfo.getIndiUndersignedDated())
							: ""%>">
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I,<span class="giluio indiUndersignedApplicantName"></span>, the
								undersigned, do solemnly declare that I am the applicant named
								in this application and that the information set out in this
								application and in the attached documents is, to the best of my
								knowledge and belief, true, correct and complete in all
								respects, and that I agree to respect the conditions contained
								in this form, if the Supervisor of Insolvency issues me a
								licence.
							</p>
							<p class="pt-2 common-para">Signature of Applicant</p>
							
							<div class="signature_texarea mb-2"
								id="indi-undersigned-image-holder">
								<%if (Validator.isNotNull(fileUrlTrustUnderSign)) {
								%>
								<img src="<%=fileUrlTrustUnderSign%>" width="100" height="100" />
								<%
									}
								%>
							</div>
							<input type="file" id="indi-undersigned-signature-upload-btn"
								hidden=""
								name="<portlet:namespace/>indi-undersigned-signature-upload-btn">
							<label for="indi-undersigned-signature-upload-btn"
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
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="indiUndersignedDetailInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep11">
			<div class="tab-form">
				<div class="qualification-info-form">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Trustee Licence
								Breakdown of Area of Experience in Insolvency(Form 54)</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Applicant *</p>
								<input type="text" class="form-control"
									id="indiBreakdownApplicantName"
									value="<%=breakdowninfo != null && breakdowninfo.getIndiBreakdownApplicantName() != null
					? breakdowninfo.getIndiBreakdownApplicantName()
					: ""%>">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="indiBreakdownApplicantNameValidation" style="color: red;">
									Please Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Firm</p>
								<input type="text" class="form-control" id="indiBreakdownFirm"
									value="<%=breakdowninfo != null && breakdowninfo.getIndiBreakdownFirm() != null
					? breakdowninfo.getIndiBreakdownFirm()
					: ""%>">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">The applicant for a
								trustee licence here under indicates an estimate of the amount
								of time worked during the periods indicated, in the various
								fields indicated. The breakdown is to be shown as a percentage
								(%) of the overall time during the year</p>
						</div>
						<input id="yearlyWorkingTimeDetailVal" type="hidden"
							name="yearlyWorkingTimeDetailVal" value="1">
						<div class="col-md-12">
							<div class="accordion secured-accordian"
								id="addYearlyWorkingTimeDetailBox ">
								<div class="accordion__header is-active"
									id="addYearlyWorkingTimeDetail"
									onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>Amount of time worked by the Applicant for a
													trustee licence</h2>
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
												<p class="tab-form-main-heading" for="breakdownWorkingYear">During(Year)</p>
												<input type="text" class="form-control"
													id="breakdownWorkingYear" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading"
													for="breakdownWorkingBankrupties">Individual
													Bankruptcies</p>
												<input type="text" class="form-control"
													id="breakdownWorkingBankrupties" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Individual Proposals</p>
												<input type="text" class="form-control"
													id="breakdownWorkingProposal" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Commercial Bankruptcies</p>
												<input type="text" class="form-control"
													id="breakdownWorkingComBankrupts" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Commercial Proposals</p>
												<input type="text" class="form-control"
													id="breakdownWorkingComProposal" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Interim Receiverships</p>
												<input type="text" class="form-control"
													id="breakdownWorkingInterimReceive" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group">
												<p class="tab-form-main-heading">Receiverships, Agency,
													Look-see, Secured Creditors</p>
												<input type="text" class="form-control"
													id="breakdownWorkingCreditors" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group">
												<p class="tab-form-main-heading">Other work not directly
													related to insolvency work (audit, tax, accounting,
													forensic)</p>
												<input type="text" class="form-control"
													id="breakdownWorkingOther" placeholder="" value="">
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee"
												id="addOneMoreYearlyWorkingTimeDetail"
												onclick="addYearlyWorkingTimeDetailBox();"> <span>+ 1</span>
												Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<div
							class="col-12 table-responsive hide addYearlyWorkingTimeTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addYearlyWorkingTimeTable">
									<tr>
										<th class="sub_heading text-nowrap">During(Year)</th>
										<th class="sub_heading text-nowrap">Individual Bankruptcies</th>
										<th class="sub_heading text-nowrap">Individual Proposals</th>
										<th class="sub_heading text-nowrap">Commercial Bankruptcies</th>
										<th class="sub_heading text-nowrap">Commercial Proposals</th>
										<th class="sub_heading text-nowrap">Interim Receiverships</th>
										<th class="sub_heading text-nowrap">Receiverships, Agency, Look-see,
											Secured Creditors</th>
										<th class="sub_heading text-nowrap">Other work not directly related
											to insolvency work</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
									<tr>
										<%
											if (addinfo != null) {
												int counterYear = 1;
												for (OsiServicesTrusteeBreadDownAddinfo addInfos : addinfo) {
										%>
										<td
											class="sub_heading_content breakdownWorkingYear<%=counterYear%> ">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getBreakdownWorkingYear())
							? addInfos.getBreakdownWorkingYear()
							: ""%>

										</td>
										<td
											class="sub_heading_content breakdownWorkingBankrupties<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingBankrupties())
							? addInfos.getWorkingBankrupties()
							: ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingProposal<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingProposal())
							? addInfos.getWorkingProposal()
							: ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingComBankrupts<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingComBankrupts())
							? addInfos.getWorkingComBankrupts()
							: ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingComProposal<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingComProposal())
							? addInfos.getWorkingComProposal()
							: ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingInterimReceive<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getWorkingInterimReceive())
							? addInfos.getWorkingInterimReceive()
							: ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingCreditors<%=counterYear%>">
											<%=Validator.isNotNull(addInfos)
							&& Validator.isNotNull(addInfos.getBreakdownWorkingCreditors())
									? addInfos.getBreakdownWorkingCreditors()
									: ""%>
										</td>
										<td
											class="sub_heading_content breakdownWorkingOther<%=counterYear%>">
											<%=Validator.isNotNull(addInfos) && Validator.isNotNull(addInfos.getBreakdownWorkingOther())
							? addInfos.getBreakdownWorkingOther()
							: ""%>
										</td>
										<td><span> <a href="javascript:void(0)"
												onclick="yearlyWorkingTimeDetailEditTab('<%=counterYear%>');">
													<svg width="19" height="19" viewBox="0 0 19 19" fill="none"
														xmlns="http://www.w3.org/2000/svg"> 
				         <path
															d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
															fill="#047247"></path> 
				        </svg>
											</a>
										</span></td>
										<td><span> <a href="javascript:void(0)"
												onclick="yearlyWorkingTimeDeleteData('<%=counterYear%>');">
													<svg width="14" height="18" viewBox="0 0 14 18" fill="none"
														xmlns="http://www.w3.org/2000/svg">
		        <path
															d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z"
															fill="#047247"></path>
		        </svg>
											</a>
										</span></td>
									</tr>
									<input type="hidden" id="yearlyWorkingTime<%=counterYear%>"
										name="yearlyWorkingTime<%=counterYear%>"
										value="<%=Validator.isNotNull(addInfos) ? addInfos.getOsiTrusId() : ""%>">
									<%
										counterYear++;
											}
										}
									%>
								</tbody>
							</table>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I, <span class="giluio indiBreakdownApplicantName"></span>, the
								undersigned applicant for a trustee licence, hereby attest that
								the above information faithfully reflects my experience in
								insolvency and other fields during the periods shown above.
							</p>
							<p class="pt-2 common-para">Signature of Applicant</p>
							<div class="signature_texarea mb-2"
								id="breakdown-applicant-image-holder">
								<%
									if (Validator.isNotNull(fileUrlBreakDownSign)) {
								%>
								<img src="<%=fileUrlBreakDownSign%>" width="100" height="100" />
								<%
									}
								%>
							</div>
							<input type="file" id="breakdown-applicant-signature-upload-btn"
								hidden=""
								name="<portlet:namespace/>breakdown-applicant-signature-upload-btn">
							<label for="breakdown-applicant-signature-upload-btn"
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
								<input type="date" class="form-control" id="indiBreakdownDated"
									value="<%=breakdowninfo != null && breakdowninfo.getIndiBreakdownDated() != null
					? new SimpleDateFormat("yyyy-MM-dd").format(breakdowninfo.getIndiBreakdownDated())
					: ""%>">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Trustee's Name in block
									letters *</p>
								<input type="text" class="form-control"
									id="indiBreakdownTrusteeName"
									value="<%=breakdowninfo != null && breakdowninfo.getIndiBreakdownTrusteeName() != null
					? breakdowninfo.getIndiBreakdownTrusteeName()
					: ""%>">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="indiBreakdownTrusteeNameValidation" style="color: red;">
									Please Enter Name</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control"
									id="indiBreakdownTrusteeDate"
									value="<%=breakdowninfo != null && breakdowninfo.getIndiBreakdownDated() != null
					? new SimpleDateFormat("yyyy-MM-dd").format(breakdowninfo.getIndiBreakdownDated())
					: ""%>">
							</div>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I,<span class="giluio indiBreakdownTrusteeName"></span>, the
								undersigned, a trustee of the firm where the above applicant
								trustee is presently employed or associated, hereby attest that
								the information provided by the applicant trustee, for the
								period of time with this firm, faithfully reflects the extend of
								his/her experience in the insolvency and other fields.
							</p>
							<p class="pt-2 common-para">Signature of Trustee</p>
							<div class="signature_texarea mb-2"
								id="breakdown-trustee-image-holder">
								<%
									if (Validator.isNotNull(fileUrlBreakTrusteeDownSign)) {
								%>
								<img src="<%=fileUrlBreakTrusteeDownSign%>" width="100"
									height="100" />
								<%
									}
								%>
							</div>
							<input type="file" id="breakdown-trustee-signature-upload-btn"
								hidden=""
								name="<portlet:namespace/>breakdown-trustee-signature-upload-btn">
							<label for="breakdown-trustee-signature-upload-btn"
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
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="indiLicenceBreakdownInfo(false);"
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

		<!-- INDI SUPPORITNG DOC -->
		<div class="tab-pane" role="tabpanel" id="childStep12">
			<div class="tab-form">
				<div class="supporting-doc-info-form">
					<div class="row">
						<div class="col-md-12">
						<p class="tab-form-title-subtitle f2">The following must also be provided with this application(Form 54)</p>
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="indSupportingDoc1"
										value="A curriculum vitae containing the applicant's academic background and a list of employment positions held during the last ten (10) years with a brief description of duties" <%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A curriculum vitae containing the applicant's academic background and a list of employment positions held during the last ten (10) years with a brief description of duties")?"checked":StringPool.BLANK%>
										name="indSupportingDoc"> <label
										for="indSupportingDoc1">
										<p class="tab-form-main-heading mb-0">A curriculum vitae
											containing the applicant's academic background and a list of
											employment positions held during the last ten (10) years with
											a brief description of duties</p>
									</label>
								</div>
								<!-- <div class="row documentChecklist">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Reason for Non-Provision</p>
											<input type="text" class="form-control"
												id="nonProvisionReasonIndReq1" placeholder="" value=""
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date expected to be
												Provided</p>
											<input type="date" class="form-control"
												id="expectedDateIndReq1" placeholder="" value="">
										</div>
									</div>
								</div> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="indSupportingDoc2"
										value="A detailed description of experience in bankruptcy administration" <%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A detailed description of experience in bankruptcy administration")?"checked":StringPool.BLANK%>
										name="indSupportingDoc"> <label
										for="indSupportingDoc2">
										<p class="tab-form-main-heading mb-0">A detailed
											description of experience in bankruptcy administration</p>
									</label>
								</div>
								<!-- <div class="row documentChecklist">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Reason for Non-Provision</p>
											<input type="text" class="form-control"
												id="nonProvisionReasonIndReq2" placeholder="" value=""
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date expected to be
												Provided</p>
											<input type="date" class="form-control"
												id="expectedDateIndReq2" placeholder="" value="">
										</div>
									</div>
								</div> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="indSupportingDoc3"
										value="A recent photograph of the applicant" <%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A recent photograph of the applicant")?"checked":StringPool.BLANK%>
										name="indSupportingDoc"> <label
										for="indSupportingDoc3">
										<p class="tab-form-main-heading mb-0">A recent photograph
											of the applicant(approx 5cmx3.5cm)</p>
									</label>
								</div>
								<!-- <div class="row documentChecklist">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Reason for Non-Provision</p>
											<input type="text" class="form-control"
												id="nonProvisionReasonIndReq3" placeholder="" value=""
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date expected to be
												Provided</p>
											<input type="date" class="form-control"
												id="expectedDateIndReq3" placeholder="" value="">
										</div>
									</div>
								</div> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="indSupportingDoc4"
										value="A cheque for [$] payable to the Supervisor of Insolvency of Jamaica" <%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A cheque for [$] payable to the Supervisor of Insolvency of Jamaica")?"checked":StringPool.BLANK%>
										name="indSupportingDoc"> <label
										for="indSupportingDoc4">
										<p class="tab-form-main-heading mb-0">A cheque for [$]
											payable to the Supervisor of Insolvency of Jamaica</p>
									</label>
								</div>
								<!-- <div class="row documentChecklist">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Reason for Non-Provision</p>
											<input type="text" class="form-control"
												id="nonProvisionReasonIndReq4" placeholder="" value=""
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date expected to be
												Provided</p>
											<input type="date" class="form-control"
												id="expectedDateIndReq4" placeholder="" value="">
										</div>
									</div>
								</div> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">Where the applicant
									intends to practice therewith a trustee firm (i.e. partnership
									or corporate licence), or as an employee of another trustee</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="indSupportingDoc5"
										value="A supporting letter in which the employer or a partner undertakes to provide the necessary resources (work facilities, equipment and personnel) that will be required by the applicant for the execution of his/her duties as a trustee, as well as insurance coverage (professional liability insurance and employed is honesty (fidelity) insurance)" <%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A supporting letter in which the employer or a partner undertakes to provide the necessary resources (work facilities, equipment and personnel) that will be required by the applicant for the execution of his/her duties as a trustee, as well as insurance coverage (professional liability insurance and employed is honesty (fidelity) insurance)")?"checked":StringPool.BLANK%>
										name="indSupportingDoc"> <label
										for="indSupportingDoc5">
										<p class="tab-form-main-heading mb-0">A supporting letter
											in which the employer or a partner undertakes to provide the
											necessary resources (work facilities, equipment and
											personnel) that will be required by the applicant for the
											execution of his/her duties as a trustee, as well as
											insurance coverage (professional liability insurance and
											employed is honesty (fidelity) insurance)</p>
									</label>
								</div>
								<!-- <div class="row documentChecklist">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Reason for Non-Provision</p>
											<input type="text" class="form-control"
												id="nonProvisionReasonIndReq5" placeholder="" value=""
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date expected to be
												Provided</p>
											<input type="date" class="form-control"
												id="expectedDateIndReq5" placeholder="" value="">
										</div>
									</div>
								</div> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-title-subtitle f2">In all other cases (in
									order to obtain authorization to begin accepting professional
									engagement)</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="indSupportingDoc6"
										value="A personal balance sheet" <%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A personal balance sheet")?"checked":StringPool.BLANK%> name="indSupportingDoc">
									<label for="indSupportingDoc6">
										<p class="tab-form-main-heading mb-0">A personal balance
											sheet</p>
									</label>
								</div>
								<!-- <div class="row documentChecklist">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Reason for Non-Provision</p>
											<input type="text" class="form-control"
												id="nonProvisionReasonIndReq6" placeholder="" value=""
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date expected to be
												Provided</p>
											<input type="date" class="form-control"
												id="expectedDateIndReq6" placeholder="" value="">
										</div>
									</div>
								</div> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="indSupportingDoc7"
										value="A Details of necessary resources (work facilities, equipment and personnel) that will be at the applicant's disposal in the execution of his/her duties as a trustee, and of banking" <%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A Details of necessary resources (work facilities, equipment and personnel) that will be at the applicant's disposal in the execution of his/her duties as a trustee, and of banking")?"checked":StringPool.BLANK%>
										name="indSupportingDoc"> <label
										for="indSupportingDoc7">
										<p class="tab-form-main-heading mb-0">A Details of
											necessary resources (work facilities, equipment and
											personnel) that will be at the applicant's disposal in the
											execution of his/her duties as a trustee, and of banking</p>
									</label>
								</div>
								<!-- <div class="row documentChecklist">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Reason for Non-Provision</p>
											<input type="text" class="form-control"
												id="nonProvisionReasonIndReq7" placeholder="" value=""
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date expected to be
												Provided</p>
											<input type="date" class="form-control"
												id="expectedDateIndReq7" placeholder="" value="">
										</div>
									</div>
								</div> -->
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="indSupportingDoc8"
										value="Evidence of insurance coverage for the applicant (professional liability insurance)" <%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("Evidence of insurance coverage for the applicant (professional liability insurance)")?"checked":StringPool.BLANK%> 
										name="indSupportingDoc"> <label
										for="indSupportingDoc8">
										<p class="tab-form-main-heading mb-0">Evidence of
											insurance coverage for the applicant (professional liability
											insurance)</p>
									</label>
								</div>
								<!-- <div class="row documentChecklist">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Reason for Non-Provision</p>
											<input type="text" class="form-control"
												id="nonProvisionReasonIndReq8" placeholder="" value=""
												autocomplete="off">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date expected to be
												Provided</p>
											<input type="date" class="form-control"
												id="expectedDateIndReq8" placeholder="" value="">
										</div>
									</div>
								</div> -->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- COMPANY FORM -->
<div class="hide" id="osiTrusteeComLicenceForm">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep13">
			<div class="tab-form">
				<div class="general-info-form">
					<div class="row">
						 <div class="col-md-12"> 
                          <p class="tab-form-title f2">General Information(Form 54A)</p> 
                          <p class="tab-form-title-subtitle f2">In this section you will provide general information about yourself.</p> 
                         </div> 
					</div>
					<div class="row">
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Name of Corporation *</p>
			                    <input type="text" class="form-control" id="comCorporationName" value="<%=companyinfo!=null&&companyinfo.getComCorporationName()!=null?companyinfo.getComCorporationName():"" %>">
								<p class="tab-form-sub-heading">(pre-approved by the Registrar)</p>
								<p class="tab-form-sub-heading fieldAlert hide" id="comCorporationNameValidation" style="color: red;">
									Please Enter Name</p>
			                </div>
			            </div>
			             <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Email *</p>
			                    <input type="text" class="form-control" id="comEmail" value="<%=companyinfo!=null&&companyinfo.getComEmail()!=null?companyinfo.getComEmail():"" %>" placeholder="info@example.jm">
			                    <p class="tab-form-sub-heading fieldAlert hide" id="comEmailValidation" style="color: red;"></p>
			                </div>
			            </div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address of Head Office</p>
								<textarea rows="3" id="comHeadOfficeAddress" class="form-control" maxlength="255" placeholder="Enter Address" style="border-radius: 5px; width: 100%"><%=companyinfo!=null&&companyinfo.getComHeadOfficeAddress()!=null?companyinfo.getComHeadOfficeAddress():"" %></textarea>
							</div>
						</div>
						<div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Telephone No.</p>
			                    <input type="text" class="form-control" id="comTeleNo" placeholder="+1 876-876-1234" value="<%=companyinfo!=null&&companyinfo.getComTeleNo()!=null?companyinfo.getComTeleNo():"" %>"
			                    oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" />
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Fax No.</p>
			                    <input type="text" class="form-control" id="comFaxNo" value="<%=companyinfo!=null&&companyinfo.getComFaxNo()!=null?companyinfo.getComFaxNo():"" %>"
			                    oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
			                </div>
			            </div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading mb-0" for="">
									Incorporated</p>
								<div class="checkbox-form-group">
									<input <%=companyinfo!=null&&companyinfo.getOtherCountry()!=null&&companyinfo.getOtherCountry().equals("on")?"checked":"" %> type="checkbox" id="otherCountry""/> 
									<label for="otherCountry">
										<p class="tab-form-main-heading mb-0">Other countries in which the corporation registered</p>
									</label>
								</div>
							</div>
						</div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Date of Incorporation</p>
			                   <input type="date" class="form-control" id="comIncorporationDate" value="<%=companyinfo!=null&&companyinfo.getComIncorporationDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(companyinfo.getComIncorporationDate()):"" %>">
			                </div>
			            </div>
			            <div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">For which Licence is requested</p>
			                    <input type="text" class="form-control" id="comIncorporationLicenceReq" value="<%=companyinfo!=null&&companyinfo.getComLicenceRequest()!=null?companyinfo.getComLicenceRequest():"" %>">
			                </div>
			            </div>
			        </div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="truteeComDetailInfo(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep14">
			<div class="tab-form">
				<div class="assignment-info-form">
					<div class="row">
					  <div class="col-md-12"> 
                          <p class="tab-form-title f2">Signature(Form 54A)</p> 
                          </div>
						<div class="col-md-12">
							<p class="tab-form-main-heading"> 
								I, <span class="giluio comCorporationName"></span>, the undersigned, do solemnly declare that I am authorized to submit the present application on behalf
								of the corporation named herein and that the information set out in this application and in the attached
								documents is, to the best of my knowledge and belief, true, correct and complete in all respects.
							</p>
							<p class="pt-2 common-para">Signature of Applicant, on behalf of the Corporation</p>
							<div class="signature_texarea mb-2" id="undersigned-com-image-holder">
							<%if(Validator.isNotNull(fileUrlBreakTrusteeDownComSign)){ %>
							<img src="<%=fileUrlBreakTrusteeDownComSign%>"  width="100" height="100"/>
							<%} %>
							
							</div>					
							<input type="file" id="undersigned-com-signature-upload-btn" hidden="" name="<portlet:namespace/>undersigned-com-signature-upload-btn">
							<label for="undersigned-com-signature-upload-btn" class="choose-sign-btn">  
								<span class="mr-2">
									<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"> 
										<path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path> 
									</svg>
							</span> Upload Signature
							</label>
						</div>
						<div class="col-md-6">
			                <div class="form-group">
			                    <p class="tab-form-main-heading">Date of Incorporation</p>
			                   <input type="date" class="form-control" id="comUndersignedIncorporationDate" value="<%=comSign!=null&&comSign.getComSignDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(comSign.getComSignDate()):"" %>">
			                </div>
			            </div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="comTrusteeSign(false);"
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
		
		<!-- COM SUPPORITNG DOC -->
	<div class="tab-pane" role="tabpanel" id="childStep15">
	   <div class="tab-form">
		<div class="supporting-doc-info-form">
			<div class="row">
				<div class="col-md-12">
				<p class="tab-form-title-subtitle f2">Please fill out this page and return with your qualification. If any items are not checked off, 
				please indicate the reason for such information being excluded and the date at which it will be provided.(Form 54A)</p>
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc1" value="The original or a certified true copy of the constituting documents(letters patent, certificate of incorporation, memorandum or articles of association and other pertinent documentation)" 
							<%=indiDocList!=null&&indiDocList.getSupportingDocCheckboxes()!=null&&indiDocList.getSupportingDocCheckboxes().contains("The original or a certified true copy of the constituting documents(letters patent, certificate of incorporation, memorandum or articles of association and other pertinent documentation)")?"checked":""%>  name="comSupportingDoc">
							<label for="comSupportingDoc1">
								<p class="tab-form-main-heading mb-0">The original or a certified true copy of the
									constituting documents(letters patent, certificate of incorporation, memorandum or articles of association and other pertinent documentation)</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq1" placeholder=""
										value="<%=indiDocList!=null&&indiDocList.getNonProvisionReasonReq1()!=null?indiDocList.getNonProvisionReasonReq1():"" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq1" placeholder=""
										value="<%=indiDocList!=null&&indiDocList.getExpectedDateReq1()!=null?new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq1()):"" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc2"
								value="The address of the head office and of every other office or place of business from which the corporation intends to provide bankruptcy services"
<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("The address of the head office and of every other office or place of business from which the corporation intends to provide bankruptcy services")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc2">
								<p class="tab-form-main-heading mb-0">The address of the head office and of every other
									office or place of business from which the corporation intends to provide bankruptcy
									services</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq2" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq2() != null ? indiDocList.getNonProvisionReasonReq2() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq2" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq2() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq2()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc3"
								value="The personal balance sheet of the firm's managing trustee (as of the date of the application)"
								<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("The personal balance sheet of the firm's managing trustee (as of the date of the application)")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc3">
								<p class="tab-form-main-heading mb-0">The personal balance sheet of the firm's managing
									trustee (as of the date of the application)</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq3" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq3() != null ? indiDocList.getNonProvisionReasonReq3() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq3" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq3() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq3()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc4"
								value="The name, residential address and occupation of each shareholder and each person having an indirect proprietary interest in the corporation (including beneficial owner, where applicable)"
							<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("The name, residential address and occupation of each shareholder and each person having an indirect proprietary interest in the corporation (including beneficial owner, where applicable)")?"checked":StringPool.BLANK%>	
								name="comSupportingDoc">
							<label for="comSupportingDoc4">
								<p class="tab-form-main-heading mb-0">The name, residential address and occupation of
									each shareholder and each person having an indirect proprietary interest in the
									corporation (including beneficial owner, where applicable)</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq4" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq4() != null ? indiDocList.getNonProvisionReasonReq4() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq4" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq4() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq4()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc5"
								value="The number of share (or proportion of total shares)and the  classes of shares held by each of the corporation"
								<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("The number of share (or proportion of total shares)and the  classes of shares held by each of the corporation")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc5">
								<p class="tab-form-main-heading mb-0">The number of share (or proportion of total
									shares) and the classes of shares held by each of the corporation</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq5" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq5() != null ? indiDocList.getNonProvisionReasonReq5() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq5" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq5() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq5()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc6"
								value="A list indicating every trustee who is simultaneously a shareholder (or financial backer) of this corporation and the district(s) in which they operate"
								<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A list indicating every trustee who is simultaneously a shareholder (or financial backer) of this corporation and the district(s) in which they operate")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc6">
								<p class="tab-form-main-heading mb-0">A list indicating every trustee who is
									simultaneously a shareholder (or financial backer) of this corporation and the
									district(s) in which they operate</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq6" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq6() != null ? indiDocList.getNonProvisionReasonReq6() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq6" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq6() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq6()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc7"
								value="The name, residential address and the occupation of each director and of each officer of the corporation"
								<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("The name, residential address and the occupation of each director and of each officer of the corporation")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc7">
								<p class="tab-form-main-heading mb-0">The name, residential address and the occupation
									of each director and of each officer of the corporation</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq7" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq7() != null ? indiDocList.getNonProvisionReasonReq7() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq7" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq7() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq7()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc8"
								value="The name and business address of every licensed trustee who will practice in an office or place of business of the corporate trustee"
								<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("The name and business address of every licensed trustee who will practice in an office or place of business of the corporate trustee")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc8">
								<p class="tab-form-main-heading mb-0">The name and business address of every licensed
									trustee who will practice in an office or place of business of the corporate trustee
								</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq8" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq8() != null ? indiDocList.getNonProvisionReasonReq8() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq8" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq8() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq8()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc9"
								value="Evidence of insurance coverage (professional liability insurance)"
								<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("Evidence of insurance coverage (professional liability insurance)")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc9">
								<p class="tab-form-main-heading mb-0">Evidence of insurance coverage (professional
									liability insurance)</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq9" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq9() != null ? indiDocList.getNonProvisionReasonReq9() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq9" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq9() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq9()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc10"
								value="A cheque for [$] made out to the order of the Supervisor of Insolvency of Jamaica. – This must be uploaded at the next page- payment page"
								<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("A cheque for [$] made out to the order of the Supervisor of Insolvency of Jamaica. – This must be uploaded at the next page- payment page")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc10">
								<p class="tab-form-main-heading mb-0">A cheque for [$] made out to the order of the
									Supervisor of Insolvency of Jamaica. - This must be uploaded at the next page-
									payment page</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq10" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq10() != null ? indiDocList.getNonProvisionReasonReq10() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq10" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq10() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq10()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc11"
								value="Details of necessary resources (work facilities, equipment and personnel) available for each office at which the corporate trustee intends to provide bankruptcy services, as well as details of banking arrangements"
								<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("Details of necessary resources (work facilities, equipment and personnel) available for each office at which the corporate trustee intends to provide bankruptcy services, as well as details of banking arrangements")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc11">
								<p class="tab-form-main-heading mb-0">Details of necessary resources (work facilities,
									equipment and personnel) available for each office at which the corporate trustee
									intends to provide bankruptcy services, as well as details of banking arrangements
								</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq11" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq11() != null ? indiDocList.getNonProvisionReasonReq11() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq11" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq11() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq11()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group mb-0">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="comSupportingDoc12"
								value="Where the trustee responsible for the administration of estates is being replaced, a letter indicating which trustees assuming responsibility for these estates, and the signature of that trustee confirming his/her acceptance of the transfer"
							<%=indiDocList!=null &&indiDocList.getSupportingDocCheckboxes().contains("Where the trustee responsible for the administration of estates is being replaced, a letter indicating which trustees assuming responsibility for these estates, and the signature of that trustee confirming his/her acceptance of the transfer")?"checked":StringPool.BLANK%>
								name="comSupportingDoc">
							<label for="comSupportingDoc12">
								<p class="tab-form-main-heading mb-0">Where the trustee responsible for the
									administration of estates is being replaced, a letter indicating which trustees
									assuming responsibility for these estates, and the signature of that trustee
									confirming his/her acceptance of the transfer</p>
							</label>
						</div>
						<div class="row documentChecklist px-4 mx-1">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Reason for Non-Provision</p>
									<input type="text" class="form-control" id="nonProvisionReasonReq12" placeholder=""
										value="<%= indiDocList != null && indiDocList.getNonProvisionReasonReq12() != null ? indiDocList.getNonProvisionReasonReq12() : "" %>" autocomplete="off">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Date expected to be Provided</p>
									<input type="date" class="form-control" id="expectedDateReq12" placeholder=""
										value="<%= indiDocList != null && indiDocList.getExpectedDateReq12() != null ? new SimpleDateFormat("yyyy-MM-dd").format(indiDocList.getExpectedDateReq12()) : "" %>">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
</div>
<!-- Yearly Working Time MODAL -->
<div class="modal fade commonsavepopup editYearlyWorkingTimeDetailPopup"
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="modal-body">
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">During(Year)</p>
							<input type="text" class="form-control editBreakdownWorkingYear"
								placeholder="" value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Individual Bankruptcies</p>
							<input type="text" class="form-control editBreakdownWorkingBankrupties"
								placeholder="" value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Individual Proposals</p>
							<input type="text" class="form-control editBreakdownWorkingProposal" placeholder=""
								value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Commercial Bankruptcies</p>
							<input type="text" class="form-control editBreakdownWorkingComBankrupts" placeholder=""
								value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Commercial Proposals</p>
							<input type="text" class="form-control editBreakdownWorkingComProposal" placeholder=""
								value="">
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<p class="tab-form-main-heading">Interim Receiverships</p>
							<input type="text" class="form-control editBreakdownWorkingInterimReceive" placeholder=""
								value="">
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Receiverships, Agency, Look-see, Secured Creditors</p>
							<input type="text" class="form-control editBreakdownWorkingCreditors" placeholder=""
								value="">
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading">Other work not directly related to insolvency work (audit, tax, accounting, forensic)</p>
							<input type="text" class="form-control editBreakdownWorkingOther" placeholder=""
								value="">
						</div>
					</div>
					<div class="col-md-12">
						<div class="footer-above-border"></div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditYearlyWorkingTimeDetailPopupDataBtn">
						Save<span class="ml-2">
					</span>
					</a>
					<span class="ml-3"> 
						<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
							<path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$("input:checkbox[name=comSupportingDoc]").on("change", function() {
    toggleDocumentChecklist();
  });
function toggleDocumentChecklist() {
  $("input:checkbox[name=comSupportingDoc]").each(function() {
    if ($(this).prop("checked")) {
      $(this).parent().next('.documentChecklist').addClass("hide");
    } else {
      $(this).parent().next('.documentChecklist').removeClass("hide");
    }
  });
}

$("input:checkbox[name=indSupportingDoc]").on("change", function() {
    toggleIndiDocumentChecklist();
  });
function toggleIndiDocumentChecklist() {
  $("input:checkbox[name=indSupportingDoc]").each(function() {
    if ($(this).prop("checked")) {
      $(this).parent().next('.documentChecklist').addClass("hide");
    } else {
      $(this).parent().next('.documentChecklist').removeClass("hide");
    }
  });
}

</script>