<%@ include file="../../init.jsp" %>
<!-- Other Requirements Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep61">
	<div class="tab-form">
		<div class="other-requirements-ifno-forms">
			<div class="row">
				<div class="col-md-12">           
					<p class="tab-form-title f2">Other Requirements</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">25.0</span> Application fees (non-refundable) submitted?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerOtherRequ!=null &&cerOtherRequ.getApplicationFees().equals("Yes")? "checked":StringPool.BLANK%> name="otherFeeReqThirdParty">
							<label for="otherFeeReqThirdParty">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerOtherRequ!=null &&cerOtherRequ.getApplicationFees().equals("No")? "checked":StringPool.BLANK%> name="otherFeeReqThirdParty">
							<label for="otherFeeReqThirdParty">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 otherFeeReqThirdPartyBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">26.0</span> State payment method</p>
						<input type="text" class="form-control" id="otherFeePayMethodThirdParty" value="<%=Validator.isNotNull(cerOtherRequ)&&Validator.isNotNull(cerOtherRequ.getInsPaymentMethod())?cerOtherRequ.getInsPaymentMethod():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading">
						<span class="tab-form-highlghtme-link pr-2">NB:</span> In the event that application documents are incomplete or not satisfactorily completed, the applicant will be informed of this, and is required to adequately address discrepancies in no more than twenty (20) working days after notification. Failure to comply with this delivery date will result in the application being returned for completion and re-submission.
					</p>
					<p class="tab-form-main-heading"><b>
						The application will not be registered until the requisite documents are received.
					</b></p>
				</div>
				<div class="col-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Applicant's representative name</p>
						<input type="text" class="form-control" id="applicantRepresentativeNameThirdParty" placeholder="" value="<%=Validator.isNotNull(cerOtherRequ)&&Validator.isNotNull(cerOtherRequ.getApplicantRepName())?cerOtherRequ.getApplicantRepName():""%>" />
					</div>
				</div>
				<div class="col-6">
					<div class="form-group">
						<p class="tab-form-main-heading">Applicant's representative position</p>
						<input type="text" class="form-control" id="applicantRepresentativePositionThirdParty" value="<%=Validator.isNotNull(cerOtherRequ)&&Validator.isNotNull(cerOtherRequ.getApplicantRepPosition())?cerOtherRequ.getApplicantRepPosition():""%>" />
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Applicant's representative signature</p>
					<div class="signature_texarea mb-2" id="applicantRepresentativeThirdPartySignature">
					<%if(Validator.isNotNull(fdaSign)){ %>
							<img src="<%=fdaSign%>"  width="100" height="100"/>
							<%} %>
					</div>
					<input type="file" id="applicantRepresentativeThirdPartySignatureBtn" hidden="" name="<portlet:namespace/>applicantRepresentativeThirdPartySignatureBtn"> 
						<label for="applicantRepresentativeThirdPartySignatureBtn" class="choose-sign-btn">
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
						<input type="date" class="form-control" id="applicantRepresentativeThirdPartyDate" value="<%=Validator.isNotNull(cerOtherRequ)&&Validator.isNotNull(cerOtherRequ.getSignatureDate())?new SimpleDateFormat("YYYY-dd-MM").format(cerOtherRequ.getSignatureDate()):""%>" />
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accThirdPartyOtherReq(false);"
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
<!-- Other Requirements Form End-->

<!-- Appendix Table Start-->
<div class="tab-pane" role="tabpanel" id="childStep62">
	<div class="tab-form">
		<div class="appendix-table-info">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">Appendix 1</p>
					<p class="tab-form-title-subtitle f2">Accreditation Scopes</p>
					<p class="tab-form-main-heading">The table below outlines the
						possible scope characterizations for applicant certification
						bodies. NB: This does NOT represent an exhaustive list.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<table class="table table-bordered table-responsive">
						<tr>
							<th class="text-nowrap">Type of food</th>
							<th>Category Title</th>
							<th>Food products/processes included</th>
							<th>Scopes mapped to FDA regulations (As applicable)*</th>
						</tr>
						<tr>
							<td rowspan="15" class="align-top">A.) Food for Humans</td>
							<td class="align-top">
								Low acid and Acidified foods [As applicable: LACF, AF, PCHF, Seafood HACCP, Juice HACCP]*</td>
							</td>
							<td class="align-top">
								a) Thermally processed low-acid foods packaged in hermetically sealed containers<br/>
								b) Acidified foods
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 108, 113, 114, 117, 121, 123, 145, 155, 172, 174
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Baby (Infant and Junior) Food Products Including Infant Formula Baby Food ([As applicable: PCHF, LACF, AF, Juice HACCP, Seafood HACCP]
							</td>
							<td class="align-top">
								a) Infant Formula requirements pertaining to current GMP, QC procedures, quality factors, records and reports, and notifications
								b) Infant Formula
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 105, 106, 107, 108, 113, 114, 117, 120, 123
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Dairy products ([As applicable: PCHF, LACF, AF]*)
							</td>
							<td class="align-top">
								a) Milk and cream  <br/>
								b) Cheeses and related  cheese products  <br/>
								c) Frozen desserts (except  water ices)  <br/>
								d) Irradiation in the production,  processing and handling of food <br/>
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 131, 133, 135, 179, 117, 108,  113, 114, 172, 174 
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Dietary supplements and  food for special dietary  use
							</td>
							<td class="align-top">
								a) Foods for special Dietary Use<br/>
								b) Dietary supplements that  present a significant or  
								unreasonable risk <br/>
								c) Dietary supplements - new  dietary ingredients<br/> 
								d) Irradiation in  the production, processing and  handling of food<br/>
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 105, 119, 179, 190, 111, 117,  172, 174 

							</td>
						</tr>
						<tr>
							<td class="align-top">
								Fisheries/Seafood products ([As applicable:  Seafood HACCP, LACF, AF]*)

							</td>
							<td class="align-top">
								a) Fish and Fishery products<br/> 
								b) Fish and shellfish
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114,  117, 172, 174

							</td>
						</tr>
						<tr>
							<td class="align-top">
								Fresh produce or Fresh  fruits and vegetable [As  applicable, (Produce Safety; most fresh cut produce under PCHF]*) 
							</td>
							<td class="align-top">
								a) Fresh Fruits<br/>   
								b) Fresh vegetables
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 112, Standards for the Growing, Harvesting, Packing, and Holding of  Produce for Human Consumption (Produce Safety Rules) for covered  produce under this rule.  CFR 21 Chapter I, Subchapter B Parts 112, 117, 172, 174, 175, 178 
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Processed Fruit and Fruit  products [As applicable:  PCHF, LACF, AF]* 
							</td>
							<td class="align-top">
								a) Canned fruits<br/>  
								b) Fruit pies<br/>  
								c) Fruit butters, jellies,<br/>  
								preserves, and related products<br/> 
								d) Irradiation in the production,  processing and handling of food

							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 117, 145, 150, 152, 172, 174,  179, 108, 113, 114, 117, 120.
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Fruit or Vegetable juices,  other beverages including  water [As applicable, PCHF, Juice HACCP, LACF, AF]*
							</td>
							<td class="align-top">
								a) Canned fruit juices<br/>  
								b) Vegetable juices<br/>  
								c) Beverages<br/>  
								d) Processing and bottling of  bottled drinking water<br/> 
								e) Irradiation  in the production, processing and  handling of food
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 146, 156, 165, 170, 172, 174,  179, 129, 108, 113, 114, 117,  120.
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Vegetable and Vegetable products [As applicable, PCHF, LACF, AF]* 

							</td>
							<td class="align-top">
								a) Canned vegetables<br/>  
								b) Frozen vegetables<br/>  
								c) Irradiation in the production,  processing and handling of food<br/>
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 155, 158, 108, 113, 114, 117,  170, 172, 174,179
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Shell Egg and egg products [As applicable,  PCHF, LACF, AF]* 

							</td>
							<td class="align-top">
								a) Shell eggs<br/>   
								b) Eggs and egg products<br/>  
								c) Irradiation in the production,  processing and handling of food
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 115, 118 , 108, 113, 114,  160, 117, 65 FR 76092 (shell  eggs), 172, 174, 179
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Starch products[As applicable, PCHF, LACF,  AF]*
							</td>
							<td class="align-top">
								a) Bakery products<br/>  
								b) Cereal flours and related products<br/>  
								c) Macaroni and noodle  products
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 136, 137, 139, 108, 113, 114,  117, 172, 174
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Food Additives (Direct and Indirect) [As  applicable: PCHF, Seafood HACCP, Juice HACCP, LACF, AF, Produce Safety]*
							</td>
							<td class="align-top">
								a) Food additives<br/>  
								b) Food additives permitted  for direct addition to food for human  consumption<br/>  
								c) Secondary direct food  additives permitted in food for  human consumption<br/>  
								d) Indirect food additives:  General<br/>  
								e) Indirect food additives:  Adhesives and components of  coatings<br/>
								f) Indirect food additives:  Paper and paperboard components<br/>
								g) Indirect food additives:  Polymers<br/>  
								h) Indirect food additives:  Adjuvants, production aids, and  sanitizers<br/>
								i) Food additives permitted in  food or in contact with food on an  interim basis pending additional  study<br/>
								j) Sweeteners and table  syrups<br/>
								k) Food dressing and flavorings<br/>  
								l) Irradiation in the production, processing and handling of food m)  Unavoidable contaminants in food  for human consumption and food packaging material
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 109, 117, 170, 172, 173, 174,  175, 176, 177, 178, 179, 180,  168, 169, 109, 117
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Nuts and Edible Seed  Products [As applicable:  Produce Safety; PCHF]* 
							</td>
							<td class="align-top">
								a) Cacao products<br/>  
								b) Tree nut and peanut products									
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 112, 163, 164, 117, 172, 174 
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Food Ingredients and (food) substances [As  applicable: PCHF, Seafood HACCP, Juice HACCP, LACF, AF, Produce Safety] *
							</td>
							<td class="align-top">
								a) Prior-sanctioned food ingredients<br/>  
								b) Substances generally recognized as safe<br/>  
								c) Direct food substances affirmed as generally recognized as safe<br/>  
								d) Indirect food substances affirmed as generally recognized as safe<br/>  
								e) Substances prohibited from use in human foods<br/>
								f) Irradiation in the production, processing and handling of food<br/>  
								g) Unavoidable contaminants in food for human consumption and food-packaging material
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 181, 182, 184, 186, 189, 109, 117, 172, 174, 179
							</td>
						</tr>
						<tr>
							<td class="align-top">
								Fats and Oils [As applicable: PCHF, LACF, AF]*
							</td>
							<td class="align-top">
								Margarine 
							</td>
							<td class="align-top">
								CFR 21, Chapter I, Subchapter B, parts 166, 117, 172, 174 
							</td>
						</tr>
						<tr>
							<td rowspan="3" class="align-top">
								B.)Animal Food
							</td>
							<td class="align-top">
								Low Acid Canned Food [LACF + PCAF]*
							</td>
							<td class="align-top">
								Thermally processed low acid foods packaged in hermetically sealed containers
									</td>
									<td class="align-top">
										CFR 21, Chapter I, Subchapter E, part 108, 113, 507, 509, 556, 570, 573, 579, 582, 584, 589.
									</td>
								</tr>
								<tr>
									<td class="align-top">
										Animal Food [As applicable: PCAF, LACF]*
									</td>
									<td class="align-top">
										Animal food means food for animals other than man and includes pet food, animal feed, and raw materials and ingredients
									</td>
									<td class="align-top">
										CFR 21, Chapter I, Subchapter E, part 507, 509, 556, 570, 573, 579, 582, 584, 589, 113, 108
									</td>
								</tr>
								<tr>
									<td class="align-top">
										Medicated Feed
									</td>
									<td class="align-top">
										A medicated feed, in addition to providing nutrients, is a vehicle for the administration of a drug, or drugs, to animals.
									</td>
									<td class="align-top">
										CFR 21, Chapter I, Subchapter E, 225, 507, 556, 509, 570, 573, 579, 582, 584, 589
									</td>
								</tr>
							</table>
						</div>
						<div class="col-md-12">
							<p class="tab-form-main-heading mt-3"><span class="tab-form-highlghtme-link pr-2">
								Adapted from: International Accreditation Service (IAS) - Application for Third Party Certification Body Accreditation Under the Food & Drug Administration (FDA) Food Safety Modernization Act (FSMA) - IAS/FSMA/006; March 6, 2019
							</span></p>
						</div>
					</div>
				</div>
			</div>
		</div>