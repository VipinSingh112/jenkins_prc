<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@ include file="../init.jsp"%>
<div class="hide broker-registration-forms">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep20">
			<div class="tab-form">
				<div class="broker-registration-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Broker Registration Form for
								Radiation Sources</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">1.</span> Type of
									Application
								</p>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="applicationType1" value="New"
										name="applicationTypes" /> <label for="applicationType1">
										<p class="tab-form-main-heading mb-0">New</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="applicationType2" value="Renewal"
										name="applicationTypes" /> <label for="applicationType2">
										<p class="tab-form-main-heading mb-0">Renewal</p>
									</label>
								</div>
								<div class="col-md-6 otherSpecifyValue hide ">
									<div class="form-group">
										<p class="tab-form-main-heading">valid or previous
											Registration Number</p>
										<input type="text" class="form-control" id="otherEquipmentOne"
											value="">
									</div>
								</div>
								<div class="col-md-6 otherSpecifyValue hide">
									<div class="form-group">
										<p class="tab-form-main-heading">Registration Expiration
											Date</p>
										<input type="text" class="form-control" id="otherEquipmentTwo"
											value="">
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="applicationType3" value="Variation "
										name="applicationTypes" /> <label for="applicationType3">
										<p class="tab-form-main-heading mb-0">Variation</p>
									</label>
								</div>
								<div class="col-md-6 otherVariation hide ">
									<div class="form-group">
										<p class="tab-form-main-heading">valid or previous
											Registration Number</p>
										<input type="text" class="form-control" id="otherEquipmentVar"
											value="">
									</div>
								</div>
								<div class="col-md-6 otherVariation hide">
									<div class="form-group">
										<p class="tab-form-main-heading">Registration Expiration
											Date</p>
										<input type="text" class="form-control" id="otherEquipmentReg"
											value="">
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading mb-0">
									<span class="tab-form-highlghtme-link pr-2">2.</span> Applicant
									Details
								</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Name of Organization*</p>
								<input type="text" class="form-control" id="organizationNameD"
									placeholder=""
									value="<%=Validator.isNotNull(brokerRegisInfo) && Validator.isNotNull(brokerRegisInfo.getOrganizationNameD())
							? brokerRegisInfo.getOrganizationNameD()
							: ""%>"
									oninput="">
								<p class="tab-form-sub-heading fieldAlert hide" id="organizationNameDValidation" style="color: red;">Enter a Name of Organization</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Principal place of business:</p>
								<input type="text" class="form-control" id="businessPlace"
									placeholder=""
									value="<%=Validator.isNotNull(brokerRegisInfo) && Validator.isNotNull(brokerRegisInfo.getBusinessPlace())
					? brokerRegisInfo.getBusinessPlace()
					: ""%>"
									oninput="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Organization T.R.N.</p>
								<input type="text" class="form-control" id="organizationTrn"
									placeholder=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(brokerRegisInfo) && Validator.isNotNull(brokerRegisInfo.getOrganizationTrn())
					? brokerRegisInfo.getOrganizationTrn()
					: ""%>"
									oninput="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Telephone</p>
								<input type="text" class="form-control" id="organizationTeleNum"
									placeholder=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(brokerRegisInfo)
					&& Validator.isNotNull(brokerRegisInfo.getOrganizationTeleNum())
							? brokerRegisInfo.getOrganizationTeleNum()
							: ""%>"
									oninput="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Fax Number</p>
								<input type="text" class="form-control" id="organizationFaxNum"
									placeholder=""
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									value="<%=Validator.isNotNull(brokerRegisInfo) && Validator.isNotNull(brokerRegisInfo.getOrganizationFaxNum())
							? brokerRegisInfo.getOrganizationFaxNum()
							: ""%>"
									oninput="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mt-2">
								<p class="tab-form-sub-heading">Email address*</p>
								<input type="text" class="form-control"
									id="organizationEmailAdd" placeholder=""
									value="<%=Validator.isNotNull(brokerRegisInfo)
					&& Validator.isNotNull(brokerRegisInfo.getOrganizationEmailAdd())
							? brokerRegisInfo.getOrganizationEmailAdd()
							: ""%>"
							oninput="">
							<p class="tab-form-sub-heading fieldAlert hide" id="organizationEmailAddValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mb-0">
								<p class="tab-form-main-heading mb-0">
									<span class="tab-form-highlghtme-link pr-2">3.</span> Business
									Details
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(a) </span>Type of
									Business
								</p>
								<input type="text" class="form-control mt-3"
									id="businessTypeBroker" name="businessTypeBroker"
									placeholder=""
									value="<%=Validator.isNotNull(brokerRegisInfo) && Validator.isNotNull(brokerRegisInfo.getBusinessTypeBroker())
							? brokerRegisInfo.getBusinessTypeBroker()
							: ""%>">
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(b) </span>Proof of
									Legal Status
								</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Business Number</p>
								<input type="text" class="form-control"
									id="businessNumberBroker"
									value="<%=Validator.isNotNull(brokerRegisInfo)
					&& Validator.isNotNull(brokerRegisInfo.getBusinessNumberBroker())
							? brokerRegisInfo.getBusinessNumberBroker()
							: ""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Corporation Number</p>
								<input type="text" class="form-control"
									id="corporationNumberBroker"
									value="<%=Validator.isNotNull(brokerRegisInfo)
					&& Validator.isNotNull(brokerRegisInfo.getCorporationNumberBroker())
							? brokerRegisInfo.getCorporationNumberBroker()
							: ""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">For Public Institutions,
									specify the enabling legislation (Act)</p>
								<input type="text" class="form-control" id="publicActBroker"
									value="<%=Validator.isNotNull(brokerRegisInfo) && Validator.isNotNull(brokerRegisInfo.getPublicActBroker())
					? brokerRegisInfo.getPublicActBroker()
					: ""%>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-sub-heading">This section is optional.</p>
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2 mb-0">(c) </span>License
									Customs Brokers Information
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="proof-copy"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="proof-copy"> <label class="custom-upload"
														for="proof-copy"> <span class="mr-2"> <svg
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
											<%
												if (Validator.isNotNull(licenceCusBrokerInfo)) {
											%>
											<span class="attach-detailed-overview"><%=licenceCusBrokerInfo%>
											</span>
											<%
												} else {
											%>
											<span class="attach-detailed-overview"></span>
											<%
												}
											%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-0 pl-2">(Append a
									certified copy of Customs Broker Licence)</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">License Number</p>
								<input type="text" class="form-control" id="licenceNumberBroker"
									value="<%=Validator.isNotNull(brokerRegisInfo)
					&& Validator.isNotNull(brokerRegisInfo.getLicenceNumberBroker())
							? brokerRegisInfo.getLicenceNumberBroker()
							: ""%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Expiration Date</p>
								<input type="date" class="form-control"
									id="expirationDateBroker"
									value="<%=Validator.isNotNull(brokerRegisInfo)
					&& Validator.isNotNull(brokerRegisInfo.getExpirationDateBroker())
							? new SimpleDateFormat("YYYY-dd-MM").format(brokerRegisInfo.getExpirationDateBroker())
							: ""%>"
									oninput="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">4 </span>Knowledge
									of the Nuclear Safety and Radiation Protection Act, 2015 and
									associated Regulations
								</p>
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(a)</span> Does the
									applicant understand the meaning of the following terms?
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(i) </span>"Radioactive
									material"
								</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"
											<%=brokerRegisInfo != null && brokerRegisInfo.getRadioactiveMaterial().equals("Yes") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="radioactiveMaterial" placeholder="">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"
											<%=brokerRegisInfo != null && brokerRegisInfo.getRadioactiveMaterial().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="radioactiveMaterial" placeholder="">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(ii) </span>"Nuclear
									material"
								</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"
											<%=brokerRegisInfo != null && brokerRegisInfo.getNuclearMaterial().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="nuclearMaterial" placeholder=""> <label
											for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"
											<%=brokerRegisInfo != null && brokerRegisInfo.getNuclearMaterial().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="nuclearMaterial" placeholder=""> <label
											for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(iii) </span>"Nuclear
									technology"
								</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"
											<%=brokerRegisInfo != null && brokerRegisInfo.getNuclearTechnology().equals("Yes") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="nuclearTechnology" placeholder="">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"
											<%=brokerRegisInfo != null && brokerRegisInfo.getNuclearTechnology().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="nuclearTechnology" placeholder="">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(iv) </span>"Ionizing
									Radiation Apparatus"
								</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"
											<%=brokerRegisInfo != null && brokerRegisInfo.getIonizingApparatus().equals("Yes") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="ionizingApparatus" placeholder="">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"
											<%=brokerRegisInfo != null && brokerRegisInfo.getIonizingApparatus().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="ionizingApparatus" placeholder="">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(v) </span>"Radiation
									source"
								</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"
											<%=brokerRegisInfo != null && brokerRegisInfo.getRadiationSource().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="radiationSource" placeholder=""> <label
											for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"
											<%=brokerRegisInfo != null && brokerRegisInfo.getRadiationSource().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="radiationSource" placeholder=""> <label
											for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(b) </span>Does the
									applicant understand that the organization (person/
									corporation) that wants to obtain or transfer a Radiation
									Source MUST be authorized by HSRA to possess/use radiation
									source?
								</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"
											<%=brokerRegisInfo != null && brokerRegisInfo.getOrganizationTransfer().equals("Yes") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="organizationTransfer" placeholder="">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"
											<%=brokerRegisInfo != null && brokerRegisInfo.getOrganizationTransfer().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="organizationTransfer" placeholder="">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(c) </span>Does the
									applicant understand its responsibilities under the Nuclear
									Safety and Radiation Protection Act, 2015 and the Nuclear
									Safety and Radiation Protection Regulations, 2019?
								</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes"
											<%=brokerRegisInfo != null && brokerRegisInfo.getNuclearProtection().equals("Yes") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="nuclearProtection" placeholder="">
										<label for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No"
											<%=brokerRegisInfo != null && brokerRegisInfo.getNuclearProtection().equals("No") ? "checked"
					: StringPool.BLANK%>
											type="radio" name="nuclearProtection" placeholder="">
										<label for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(5) </span>Storage
									Facility Details
								</p>
								<p class="tab-form-sub-heading mb-2 pl-2">Provide a detailed
									description of the storage location, preparations made and
									security measures put in place during the storage of radiation
									sources.</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="storageFacility" placeholder="" spellcheck="false"><%=Validator.isNotNull(brokerRegisInfo) && Validator.isNotNull(brokerRegisInfo.getStorageFacility())
					? brokerRegisInfo.getStorageFacility()
					: ""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading mb-2">
									<span class="tab-form-highlghtme-link pr-2">(6) </span>Additional
									Information, (if applicable)
								</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="additionalInformation" placeholder="" spellcheck="false"><%=Validator.isNotNull(brokerRegisInfo)
					&& Validator.isNotNull(brokerRegisInfo.getAdditionalInformation())
							? brokerRegisInfo.getAdditionalInformation()
							: ""%>    </textarea>
							</div>
						</div>

					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addBrokerDetail(false);"
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
		<div class="tab-pane" role="tabpanel" id="childStep21">
			<div class="tab-form">
				<div class="declaration-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Declaration</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-main-heading">
								I <span class="giluio appliName"> </span> hereby declare that
								the information contained herein, and any supplemental pages
								appended to this application, are correct to the best of my
								knowledge and belief
							</p>
						</div>
						<div class="col-md-6">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">Legal Operator Name</p>
								<input type="text" class="form-control" id="brokerOperatorName"
									value="<%=Validator.isNotNull(brokerDeclarationInfo)
					&& Validator.isNotNull(brokerDeclarationInfo.getBrokerOperatorName())
							? brokerDeclarationInfo.getBrokerOperatorName()
							: ""%>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">Title</p>
								<input type="text" class="form-control" id="brokerTitle"
									value="<%=Validator.isNotNull(brokerDeclarationInfo)
					&& Validator.isNotNull(brokerDeclarationInfo.getBrokerTitle())
							? brokerDeclarationInfo.getBrokerTitle()
							: ""%>"
									placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>
							<%
								if (Validator.isNotNull(fileUrlOfBrokerRegistration)) {
							%>
							<div class="signature_texarea mb-2" id="signatureBrokerImageHolder">
								<img src="<%=fileUrlOfBrokerRegistration%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-2" id="signatureBrokerImageHolder"></div>
							<%
								}
							%>
							<input type="file" id="signatureBrokerBtn" hidden=""
								name="<portlet:namespace/>signatureBrokerBtn"> <label
								for="signatureBrokerBtn" class="choose-sign-btn"> <span
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
							<div class="form-group mt-2">
								<p class="tab-form-main-heading mb-2">Date</p>
								<input type="date" class="form-control" id="signDate"
									value="<%=Validator.isNotNull(brokerDeclarationInfo)&&Validator.isNotNull(brokerDeclarationInfo.getSignDate())?new SimpleDateFormat("yyyy-MM-dd").format(brokerDeclarationInfo.getSignDate()):"" %>"
									placeholder="">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>