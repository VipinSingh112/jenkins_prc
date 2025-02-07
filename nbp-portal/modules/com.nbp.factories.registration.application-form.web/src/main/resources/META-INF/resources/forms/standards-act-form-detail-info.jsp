<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp"%>
<%
int productDetailVal=1;
%>
<div class="factories-registration-forms">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane active" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="factories-registration-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">The Standards Act</p>
							<p class="tab-form-title-subtitle f2">Application for
								Registration of an Establishment</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Establishment *</p>
								<input type="text" class="form-control mt-3"
									id="standardsActEstablishmentName"
									placeholder="Name of Establishment" oninput="stansardActValidation();"
									value="<%=standardActInfo != null ? standardActInfo.getStandardsActEstablishmentName() : StringPool.BLANK%>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActEstablishmentNameValidation"
									style="color: red;">Please enter Name of Establishment</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish *</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="standardsActAddParish" oninput="stansardActValidation();">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("Kingston") ? "selected" : ""
					: StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("St. Andrew") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Andrew</option>
										<option value="Portland"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("Portland") ? "selected" : ""
					: StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("St. Thomas") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Thomas</option>
										<option value="St. Catherine"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("St. Catherine") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Catherine</option>
										<option value="St. Mary"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("St. Mary") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Mary</option>
										<option value="St. Ann"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("St. Ann") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Ann</option>
										<option value="Manchester"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("Manchester") ? "selected" : ""
					: StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("Clarendon") ? "selected" : ""
					: StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("Hanover") ? "selected" : ""
					: StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("Westmoreland") ? "selected" : ""
					: StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("St. James") ? "selected" : ""
					: StringPool.BLANK%>>St.
											James</option>
										<option value="Trelawny"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("Trelawny") ? "selected" : ""
					: StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActAddParish().equals("St. Elizabeth") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Elizabeth</option>

									</select>
								</div>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActAddParishValidation"
									style="color: red;">Please select Parish</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address *</p>
								<textarea rows="3" class="form-control" maxlength="255" oninput="stansardActValidation();"
									id="standardsActAddress" placeholder="" spellcheck="false"><%=standardActInfo != null ? standardActInfo.getStandardsActAddress() : StringPool.BLANK%></textarea>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActAddressValidation"
									style="color: red;">Please enter Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									Number *</p>
								<input type="text" class="form-control" id="standardsActTel" 
									value="<%=standardActInfo != null ? standardActInfo.getStandardsActTel() : StringPool.BLANK%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1'); stansardActValidation();">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActTelValidation"
									style="color: red;">Please enter Telephone Number</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">WhatsApp Number *</p>
								<input type="text" class="form-control"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1'); stansardActValidation();"
									id="standardsActWhatsAppNum" placeholder=""
									value="<%=standardActInfo != null ? standardActInfo.getStandardsActWhatsAppNum() : StringPool.BLANK%>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActWhatsAppNumValidation"
									style="color: red;">Please enter WhatsApp Number</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address *</p>
								<input type="text" class="form-control" id="standardsActEmail"
									value="<%=standardActInfo != null ? standardActInfo.getStandardsActEmail() : StringPool.BLANK%>"
									placeholder="info@companyname.jm" oninput="stansardActValidation();" />
									<p class="tab-form-sub-heading fieldAlert hide" id="standardsActEmailValidation" style="color: red;">Enter a valid E-mail Address</p>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActEmailValidation"
									style="color: red;">Please enter Email Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Fax Number *</p>
								<input type="text" class="form-control" id="standardsActFaxNum"
									value="<%=standardActInfo != null ? standardActInfo.getStandardsActFaxNum() : StringPool.BLANK%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1'); stansardActValidation();">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActFaxNumValidation"
									style="color: red;">Please enter Fax Number</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Full Name of Operator of
									the Establishment *</p>
								<input type="text" class="form-control mt-3"
									id="standardsActOperatorName" placeholder="Name of Operator" oninput="stansardActValidation();"
									value="<%=standardActInfo != null ? standardActInfo.getStandardsActOperatorName() : StringPool.BLANK%>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActOperatorNameValidation"
									style="color: red;">Please enter Full Name of Operator</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address *</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="standardsActOperatorAddress" placeholder="Operator Address" oninput="stansardActValidation();"
									spellcheck="false"><%=standardActInfo != null ? standardActInfo.getStandardsActOperatorAddress() : StringPool.BLANK%></textarea>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActOperatorAddressValidation"
									style="color: red;">Please enter Address</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish *</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="standardsActParish" oninput="stansardActValidation();">
										<option
											value="<%=standardActInfo != null ? standardActInfo.getStandardsActParish() : StringPool.BLANK%>"
											disabled="" selected="">Please Select</option>
										<option value="Kingston"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("Kingston") ? "selected" : ""
					: StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("St. Andrew") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Andrew</option>
										<option value="Portland"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("Portland") ? "selected" : ""
					: StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("St. Thomas") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Thomas</option>
										<option value="St. Catherine"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("St. Catherine") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Catherine</option>
										<option value="St. Mary"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("St. Mary") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Mary</option>
										<option value="St. Ann"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("St. Ann") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Ann</option>
										<option value="Manchester"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("Manchester") ? "selected" : ""
					: StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("Clarendon") ? "selected" : ""
					: StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("Hanover") ? "selected" : ""
					: StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("Westmoreland") ? "selected" : ""
					: StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("St. James") ? "selected" : ""
					: StringPool.BLANK%>>St.
											James</option>
										<option value="Trelawny"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("Trelawny") ? "selected" : ""
					: StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth"
											<%=standardActInfo != null
					? standardActInfo.getStandardsActParish().equals("St. Elizabeth") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Elizabeth</option>

									</select>
								</div>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActParishValidation"
									style="color: red;">Please enter Parish</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="telephone">Telephone
									Number *</p>
								<input type="text" class="form-control"
									id="standardsActOperatorTel"
									value="<%=standardActInfo != null ? standardActInfo.getStandardsActOperatorTel() : StringPool.BLANK%>"
									oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1'); stansardActValidation();">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActOperatorTelValidation"
									style="color: red;">Please enter Telephone Number</p>
							</div>
						</div>
						<%-- <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">List of Product(s) Manufactured</p>
								<input type="text" class="form-control mt-3"
									id="standardActProductManufactured" name="standardActProductManufactured"
									placeholder=""
									value="<%=standardActInfo != null ? standardActInfo.getStandardActProductManufactured() : StringPool.BLANK%>"
									style="display: none;">
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Brands of (s) Manufactured</p>
								<input type="text" class="form-control mt-3"
									id="standardActBrandManufactured"
									name="standardActBrandManufactured" placeholder=""
									value="<%=standardActInfo != null ? standardActInfo.getStandardActBrandManufactured() : StringPool.BLANK%>"
									style="display: none;">
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Product size(s)</p>
								<input type="text" class="form-control mt-3"
									id="standardsActProductSize" name="standardsActProductSize"
									placeholder=""
									value="<%=standardActInfo != null ? standardActInfo.getStandardsActProductSize() : StringPool.BLANK%>"
									style="display: none;">
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div> --%>
						
                        <div class="col-md-12">
							<input id="productDetailVal" type="hidden"
								name="productDetailVal" value="1">
							<div class="accordion secured-accordian"
								id="productDetailBox">
								<div class="accordion__header is-active"
									id="productDetail" onclick="expandDetails(this.id)">
									<div class="d-flex align-items-center">
										<div class="d-flex align-items-center">
											<div>
												<span class="accordion__toggle"></span>
											</div>
											<div>
												<h2>Product Details</h2>
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
												<p class="tab-form-main-heading">Brand *</p>
												<input type="text" class="form-control"
													id="brand" value="" placeholder="" oninput="stansardActValidation();">
												<p class="tab-form-sub-heading fieldAlert mb-0 hide" id="brandValidation" style="color: red;">Please enter Brand</p>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Product *</p>
												<input type="text" class="form-control"
													id="product" value="" placeholder="" oninput="stansardActValidation();">
												<p class="tab-form-sub-heading fieldAlert mb-0 hide" id="productValidation" style="color: red;">Please enter Product</p>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Product Size *</p>
												<input type="text" class="form-control"
													id="productSize" value="" placeholder="" oninput="stansardActValidation();">
												<p class="tab-form-sub-heading fieldAlert mb-0 hide" id="productSizeValidation" style="color: red;">Please enter Product Size</p>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<p class="tab-form-main-heading">Measurement Value *</p>
												<!-- <input type="text" class="form-control"
													id="measurementValue" value="" placeholder=""> -->
												<div class="select-wrapper position-relative">
													<select class="form-select form-control" name="pselect"
														id="measurementValue" onchange="stansardActValidation();">
														<option value="" disabled="" selected="">Please
															Select</option>
														<option value="Kilogram (kg)">Kilogram (kg)</option>
														<option value="Gram (g)">Gram (g)</option>
														<option value="Milligram (mg)">Milligram (mg)</option>
														<option value="Microgram (µg)">Microgram (µg)</option>
													</select>
												</div>
												<p class="tab-form-sub-heading fieldAlert mb-0 hide" id="measurementValueValidation" style="color: red;">Please enter Measurement Value</p>
											</div>
										</div>
										<div class="col-md-12 d-flex justify-content-end py-4">
											<a href="javascript:void(0);" class="add-more-employee"
												id="addProductDetail"
												onclick="addProductDetail(false);"> <span>+
													1</span> Add More
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div
							class="col-12 table-responsive hide addProductDetailTableBox">
							<table class="table table-bordered mb-3">
								<tbody class="addProductDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Brand</th>
										<th class="sub_heading text-nowrap">Product</th>
										<th class="sub_heading text-nowrap">Product Size</th>
										<th class="sub_heading text-nowrap">Measurement Value</th>
										<th class="sub_heading">Edit</th>
										<th class="sub_heading">Delete</th>
									</tr>
<%if(Validator.isNotNull(productDetailAdd) && productDetailAdd.size()>0){
	for(FactoriesProductDetailsAdd productDetail:productDetailAdd){ %>
	<tr class="product-details-row<%=productDetailVal%>">
	<td class="sub_heading_content brand<%=productDetailVal%>"><%=Validator.isNotNull(productDetail)&&Validator.isNotNull(productDetail.getProductBrand())?productDetail.getProductBrand():""%></td>
	<td class="sub_heading_content product<%=productDetailVal%>"><%=Validator.isNotNull(productDetail)&&Validator.isNotNull(productDetail.getProduct())?productDetail.getProduct():""%></td>
	<td class="sub_heading_content productSize<%=productDetailVal%>"><%=Validator.isNotNull(productDetail)&&Validator.isNotNull(productDetail.getProductSize())?productDetail.getProductSize():""%></td>
	<td class="sub_heading_content measurementValue<%=productDetailVal%>"><%=Validator.isNotNull(productDetail)&&Validator.isNotNull(productDetail.getProductMeasurementVal())?productDetail.getProductMeasurementVal():""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="productDetailEditTab" onclick="productDetailEditTab('<%=productDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="productDetailDeleteDataTab" onclick="productDetailDeleteData('<%=productDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
     <input type="hidden" id="productDetail<%=productDetailVal%>" name="productDetail<%=productDetailVal%>" value="<%=productDetail.getFactoriesProductDetailsAddId()%>">
</tr>
 <%productDetailVal=productDetailVal+1;
			}} %>
	
								</tbody>
							</table>
						</div>

						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Has the Establishment been
									operated before? *</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio"
											<%=standardActInfo != null && standardActInfo.getEstablishmentBefore().equals("Yes") ? "checked"
					: StringPool.BLANK%>
											name="establishmentBefore" placeholder="" onchange="stansardActValidation();"> <label
											for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio"
											<%=standardActInfo != null && standardActInfo.getEstablishmentBefore().equals("No") ? "checked"
					: StringPool.BLANK%>
											name="establishmentBefore" placeholder="" onchange="stansardActValidation();"> <label
											for="">No</label>
									</div>
								</div>
								<p class="tab-form-sub-heading fieldAlert hide"
									id="establishmentBeforeValidation"
									style="color: red;">Please select Establishment</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="hide" id="other-copy">
								<div class="form-group">
									<p class="tab-form-main-heading">Last Date (or Period) of
										Operation *</p>
									<input type="date" class="form-control mt-3"
										id="standardsActLastDate" placeholder="" oninput="stansardActValidation();"
										value="<%=standardActInfo != null && standardActInfo.getStandardsActLastDate() != null
					? new SimpleDateFormat("yyyy-MM-dd").format(standardActInfo.getStandardsActLastDate())
					: StringPool.BLANK%>">
									<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActLastDateValidation"
									style="color: red;">Please select Last Date</p>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="hide" id="other-copy1">
								<div class="form-group">
									<p class="tab-form-main-heading">For what purpose *</p>
									<textarea rows="3" class="form-control" maxlength="255" oninput="stansardActValidation();"
										id="standardsActPurpose" placeholder="" spellcheck="false"><%=standardActInfo != null ? standardActInfo.getStandardsActPurpose() : StringPool.BLANK%></textarea>
									<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActPurposeValidation"
									style="color: red;">Please enter Purpose</p>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Operator of
								Establishment *</p>
							<div class="signature_texarea mb-2"
								id="establishmentSignaturefactoriesImgHolder">
								<%if(Validator.isNotNull(formNameDoc)){ %>
							<img src="<%=formNameDoc%>"  width="100" height="100"/>
							<%} %></div>
							<input type="file" id="establishmentSignaturefactoriesBtn"
								hidden="" 
								name="<portlet:namespace/>establishmentSignaturefactoriesBtn">
							<label for="establishmentSignaturefactoriesBtn"
								class="choose-sign-btn"> <span class="mr-2"> <svg
										width="14" height="17" viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
										<path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
									</svg>
							</span> Upload Signature
							</label>
							<p class="tab-form-sub-heading fieldAlert hide"
									id="establishmentSignaturefactoriesImgHolderValidation"
									style="color: red;">Please upload Signature</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date *</p>
								<input type="date" class="form-control" id="standardsActDate"
									max="9999-12-31" placeholder="" oninput="stansardActValidation();"
									value="<%=standardActInfo != null && standardActInfo.getStandardsActDate() != null
					? new SimpleDateFormat("yyyy-MM-dd").format(standardActInfo.getStandardsActDate())
					: StringPool.BLANK%>">
								<p class="tab-form-sub-heading fieldAlert hide"
									id="standardsActDateValidation"
									style="color: red;">Please enter Date</p>
							</div>
						</div>

					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="addStandardsActDetail(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right second">
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
		<div class="tab-pane second" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="hotel-info-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Form A (Regulation 3)</p>
							<p class="tab-form-title f2">The Processed Food Act</p>
							<p class="tab-form-title-subtitle f2">Application for
								Registration of an Establishment</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name of Establishment *</p>
								<input type="text" class="form-control mt-3"
									id="processedActEstablishmentName"
									placeholder="Name of Establishment" oninput="regulationdetailInfo();"
									value="<%=processedFoodAct != null ? processedFoodAct.getProcessedActEstablishmentName() : StringPool.BLANK%>" />
								<p class="tab-form-sub-heading fieldAlert hide"
									id="processedActEstablishmentNameValidation" style="color: red;">Enter a Name of Establishment</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish *</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="processedActParishAddress" oninput="regulationdetailInfo();">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("Kingston") ? "selected" : ""
					: StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("St. Andrew") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Andrew</option>
										<option value="Portland"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("Portland") ? "selected" : ""
					: StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("St. Thomas") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Thomas</option>
										<option value="St. Catherine"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("St. Catherine") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Catherine</option>
										<option value="St. Mary"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("St. Mary") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Mary</option>
										<option value="St. Ann"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("St. Ann") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Ann</option>
										<option value="Manchester"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("Manchester") ? "selected" : ""
					: StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("Clarendon") ? "selected" : ""
					: StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("Hanover") ? "selected" : ""
					: StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("Westmoreland") ? "selected" : ""
					: StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("St. James") ? "selected" : ""
					: StringPool.BLANK%>>St.
											James</option>
										<option value="Trelawny"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("Trelawny") ? "selected" : ""
					: StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParishAddress().equals("St. Elizabeth") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Elizabeth</option>

									</select>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address *</p>
								<textarea rows="3" class="form-control" maxlength="255" oninput="regulationdetailInfo();"
									id="processedActAddress" placeholder="" spellcheck="false"><%=processedFoodAct != null ? processedFoodAct.getProcessedActAddress() : StringPool.BLANK%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Full Name of Operator of
									the Establishment *</p>
								<input type="text" class="form-control mt-3"
									id="processedActOperatorName" placeholder="Name of Operator" oninput="regulationdetailInfo();"
									value="<%=processedFoodAct != null ? processedFoodAct.getProcessedActOperatorName() : StringPool.BLANK%>" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address *</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="processedActOperatorAddress" placeholder="Operator Address" oninput="regulationdetailInfo();"
									spellcheck="false"><%=processedFoodAct != null ? processedFoodAct.getProcessedActOperatorAddress() : StringPool.BLANK%></textarea>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish *</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" name="pselect"
										id="processedActParish" oninput="regulationdetailInfo();">
										<option value="" disabled="" selected="">Please
											Select</option>
										<option value="Kingston"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("Kingston") ? "selected" : ""
					: StringPool.BLANK%>>Kingston</option>
										<option value="St. Andrew"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("St. Andrew") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Andrew</option>
										<option value="Portland"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("Portland") ? "selected" : ""
					: StringPool.BLANK%>>Portland</option>
										<option value="St. Thomas"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("St. Thomas") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Thomas</option>
										<option value="St. Catherine"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("St. Catherine") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Catherine</option>
										<option value="St. Mary"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("St. Mary") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Mary</option>
										<option value="St. Ann"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("St. Ann") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Ann</option>
										<option value="Manchester"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("Manchester") ? "selected" : ""
					: StringPool.BLANK%>>Manchester</option>
										<option value="Clarendon"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("Clarendon") ? "selected" : ""
					: StringPool.BLANK%>>Clarendon</option>
										<option value="Hanover"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("Hanover") ? "selected" : ""
					: StringPool.BLANK%>>Hanover</option>
										<option value="Westmoreland"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("Westmoreland") ? "selected" : ""
					: StringPool.BLANK%>>Westmoreland</option>
										<option value="St. James"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("St. James") ? "selected" : ""
					: StringPool.BLANK%>>St.
											James</option>
										<option value="Trelawny"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("Trelawny") ? "selected" : ""
					: StringPool.BLANK%>>Trelawny</option>
										<option value="St. Elizabeth"
											<%=processedFoodAct != null
					? processedFoodAct.getProcessedActParish().equals("St. Elizabeth") ? "selected" : ""
					: StringPool.BLANK%>>St.
											Elizabeth</option>

									</select>
								</div>
							</div>
						</div>
						<%-- <div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Prescribed food(s) which it
									is proposed to manufacture in the establishment</p>
								<textarea rows="3" id="processedActDescription"
									class="form-control" maxlength="255" placeholder="Description"
									style="border-radius: 5px; width: 100%"><%=processedFoodAct != null ? processedFoodAct.getProcessedActDescription() : StringPool.BLANK%></textarea>
							</div>
						</div> --%>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Prescribed food(s) which it
									is proposed to manufacture in the establishment *</p>
								<input type="text" class="form-control" id="processedActDescription" name="processedActDescription" oninput="regulationdetailInfo();"
								placeholder="" value="<%=processedFoodAct != null ? processedFoodAct.getProcessedActDescription() : StringPool.BLANK%>" disabled>
								<!-- <p class="tab-form-sub-heading">Separate values with Enter</p> -->
							</div>
						</div>
						
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Has the Establishment been
									operated before? *</p>
								<div class="d-flex">
									<div class="wizard-form-radio d-block">
										<input value="Yes" type="radio"
											<%=processedFoodAct != null && processedFoodAct.getEstablishmentOperated().equals("Yes") ? "checked"
					: StringPool.BLANK%>
											name="establishmentOperated" placeholder="" onchange="regulationdetailInfo();"> <label
											for="">Yes</label>
									</div>
									<div class="wizard-form-radio d-block ml-3">
										<input value="No" type="radio"
											<%=processedFoodAct != null && processedFoodAct.getEstablishmentOperated().equals("No") ? "checked"
					: StringPool.BLANK%>
											name="establishmentOperated" placeholder="" onchange="regulationdetailInfo();"> <label
											for="">No</label>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="hide" id="other-field">
								<div class="form-group">
									<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(a)</span>Last Date (or Period) of
										Operation *</p>
									<input type="date" class="form-control mt-3"
										id="processedActLastDate" placeholder="" oninput="regulationdetailInfo();"
										value="<%=processedFoodAct != null && processedFoodAct.getProcessedActLastDate() != null
					? new SimpleDateFormat("yyyy-MM-dd").format(processedFoodAct.getProcessedActLastDate())
					: StringPool.BLANK%>">
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="hide" id="other-field1">
								<div class="form-group">
									<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">(b)</span>The Prescribed food(s)
										which was/ were Manufactured *</p>
									<textarea rows="3" class="form-control" maxlength="255"
										id="processedActManufactured" placeholder="" oninput="regulationdetailInfo();"
										spellcheck="false"><%=processedFoodAct != null ? processedFoodAct.getProcessedActManufactured() : StringPool.BLANK%></textarea>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Operator of
								Establishment *</p>
							<div class="signature_texarea mb-2"
								id="processedFoodSignaturefactoriesImgHolder">
								<%if(Validator.isNotNull(formProcessedDoc)){ %>
							<img src="<%=formProcessedDoc%>"  width="100" height="100"/>
							<%} %></div>
							<input type="file" id="processedFoodSignaturefactoriesBtn"
								hidden=""
								name="<portlet:namespace/>processedFoodSignaturefactoriesBtn">
							<label for="processedFoodSignaturefactoriesBtn"
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
								<p class="tab-form-main-heading">Date *</p>
								<input type="date" class="form-control" id="processedActDate"
									max="9999-12-31" placeholder="" oninput="regulationdetailInfo();"
									value="<%=processedFoodAct!=null&&processedFoodAct.getProcessedActDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(processedFoodAct.getProcessedActDate()):StringPool.BLANK %>">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script>
function regulationdetailInfo() {
    var processedActEstablishmentName = $("#processedActEstablishmentName").val() ? $("#processedActEstablishmentName").val().trim() : "";
    var processedActParishAddress = $("#processedActParishAddress").val() ? $("#processedActParishAddress").val().trim() : "";
    var processedActAddress = $("#processedActAddress").val() ? $("#processedActAddress").val().trim() : "";
    var processedActOperatorName = $("#processedActOperatorName").val() ? $("#processedActOperatorName").val().trim() : "";
    var processedActOperatorAddress = $("#processedActOperatorAddress").val() ? $("#processedActOperatorAddress").val().trim() : "";
    var processedActParish = $("#processedActParish").val() ? $("#processedActParish").val().trim() : "";
    /* var processedActDescription = $("#processedActDescription").val() ? $("#processedActDescription").val().trim() : ""; */
    var establishmentOperated = $('input[name="establishmentOperated"]:checked').val() ? $('input[name="establishmentOperated"]:checked').val().trim() : "";
    
    var processedActLastDate = $("#processedActLastDate").val() ? $("#processedActLastDate").val().trim() : "";
    var processedActManufactured = $("#processedActManufactured").val() ? $("#processedActManufactured").val().trim() : "";
    var processedActDate = $("#processedActDate").val() ? $("#processedActDate").val().trim() : "";
    
    /* var processedFoodSignaturefactoriesImgHolder = $("#processedFoodSignaturefactoriesImgHolder").find("img").length > 0 ? "1" : ""; */
    
    // Check if all required fields are filled
    if (
        processedActEstablishmentName !== "" &&
        processedActParishAddress !== "" &&
        processedActAddress !== "" &&
        processedActOperatorName !== "" &&
        processedActOperatorAddress !== "" &&
        processedActParish !== "" &&
        establishmentOperated !== "" &&
        processedFoodSignaturefactoriesImgStatus !== "" &&
        processedActDate !== ""
    ) {

        if (establishmentOperated === "Yes") {

            if (processedActLastDate !== "" && processedActManufactured !== "") {
                $("#factoriesFormsFieldset #save-continue").css({
                    "opacity": "1",
                    "pointer-events": "auto",
                    "cursor": "pointer"
                });
            } else {
                $("#factoriesFormsFieldset #save-continue").css({
                    "opacity": "0.4",
                    "pointer-events": "none",
                    "cursor": "default"
                });
            }
        } else {
            $("#factoriesFormsFieldset #save-continue").css({
                "opacity": "1",
                "pointer-events": "auto",
                "cursor": "pointer"
            });
        }
    } else {
        $("#factoriesFormsFieldset #save-continue").css({
            "opacity": "0.4",
            "pointer-events": "none",
            "cursor": "default"
        });
    }
}

function stansardActValidation() {
    var factoriesApplicationTypeVal = $("#factoriesApplicationTypeVal").val();

    if (factoriesApplicationTypeVal === "Non-Prescribed Foods") {
        var standardsActEstablishmentName = $("#standardsActEstablishmentName").val() ? $("#standardsActEstablishmentName").val().trim() : "";
        var standardsActAddParish = $("#standardsActAddParish").val() ? $("#standardsActAddParish").val().trim() : "";
        var standardsActAddress = $("#standardsActAddress").val() ? $("#standardsActAddress").val().trim() : "";
        var standardsActTel = $("#standardsActTel").val() ? $("#standardsActTel").val().trim() : "";
        var standardsActWhatsAppNum = $("#standardsActWhatsAppNum").val() ? $("#standardsActWhatsAppNum").val().trim() : "";
        var standardsActEmail = $("#standardsActEmail").val() ? $("#standardsActEmail").val().trim() : "";
        var standardsActFaxNum = $("#standardsActFaxNum").val() ? $("#standardsActFaxNum").val().trim() : "";
        var standardsActOperatorName = $("#standardsActOperatorName").val() ? $("#standardsActOperatorName").val().trim() : "";
        var standardsActOperatorAddress = $("#standardsActOperatorAddress").val() ? $("#standardsActOperatorAddress").val().trim() : "";
        var standardsActParish = $("#standardsActParish").val() ? $("#standardsActParish").val().trim() : "";
        var standardsActOperatorTel = $("#standardsActOperatorTel").val() ? $("#standardsActOperatorTel").val().trim() : "";
        var establishmentBefore = $('input[name="establishmentBefore"]:checked').val() ? $('input[name="establishmentBefore"]:checked').val().trim() : "";
        var standardsActLastDate = $("#standardsActLastDate").val() ? $("#standardsActLastDate").val().trim() : "";
        var standardsActPurpose = $("#standardsActPurpose").val() ? $("#standardsActPurpose").val().trim() : "";
        var standardsActDate = $("#standardsActDate").val() ? $("#standardsActDate").val().trim() : "";
        
        var productDetailVal = $("#productDetailVal").val();
        // Check if all mandatory fields are filled
        /* BO VALIDATION FOR ONCE */
		if(productDetailVal == 1){
			brand = $("#brand").val() ? $("#brand").val().trim() : "";
			product = $("#product").val() ? $("#product").val().trim() : "";
			productSize = $("#productSize").val() ? $("#productSize").val().trim() : "";
			measurementValue = $("#measurementValue").val() ? $("#measurementValue").val().trim() : "";
			
			if (standardsActEstablishmentName !== "" &&
	            standardsActAddParish !== "" &&
	            standardsActAddress !== "" &&
	            standardsActTel !== "" &&
	            standardsActWhatsAppNum !== "" &&
	            standardsActEmail !== "" &&
	            standardsActFaxNum !== "" &&
	            standardsActOperatorName !== "" &&
	            standardsActOperatorAddress !== "" &&
	            standardsActParish !== "" &&
	            standardsActOperatorTel !== "" &&
	            brand !== "" &&
	            product !== "" &&
	            productSize !== "" &&
	            measurementValue !== "" &&
	            establishmentBefore !== "" &&
	            standardsActDate !== "" &&
	            establishmentSignaturefactoriesImgStatus !== ""
	        ) {
	            var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

	            // Validate email format
	            if (standardsActEmail.match(mailformat)) {
	                $("#standardsActEmailValidation").addClass("hide");

	                // Check if "establishmentBefore" is "Yes"
	                if (establishmentBefore === "Yes") {

	                    // Check if "standardsActPurpose" and "standardsActLastDate" are also filled
	                    if (standardsActPurpose !== "" && standardsActLastDate !== "") {
	                        $("#factoriesFormsFieldset #save-continue").css({
	                            "opacity": "1",
	                            "pointer-events": "auto",
	                            "cursor": "pointer"
	                        });
	                    } else {
	                        $("#factoriesFormsFieldset #save-continue").css({
	                            "opacity": "0.4",
	                            "pointer-events": "none",
	                            "cursor": "default"
	                        });
	                    }
	                } else {
	                    // If "establishmentBefore" is not "Yes", enable save-continue
	                    $("#factoriesFormsFieldset #save-continue").css({
	                        "opacity": "1",
	                        "pointer-events": "auto",
	                        "cursor": "pointer"
	                    });
	                }
	            } else {
	                $("#standardsActEmailValidation").removeClass("hide");
	                $("#standardsActEmail").focus();
	                $("#factoriesFormsFieldset #save-continue").css({
	                    "opacity": "0.4",
	                    "pointer-events": "none",
	                    "cursor": "default"
	                });
	            }
	        } else {
	            $("#factoriesFormsFieldset #save-continue").css({
	                "opacity": "0.4",
	                "pointer-events": "none",
	                "cursor": "default"
	            });
	        }
		}
		if(productDetailVal > 1){
			if (
	            standardsActEstablishmentName !== "" &&
	            standardsActAddParish !== "" &&
	            standardsActAddress !== "" &&
	            standardsActTel !== "" &&
	            standardsActWhatsAppNum !== "" &&
	            standardsActEmail !== "" &&
	            standardsActFaxNum !== "" &&
	            standardsActOperatorName !== "" &&
	            standardsActOperatorAddress !== "" &&
	            standardsActParish !== "" &&
	            standardsActOperatorTel !== "" &&
	            establishmentBefore !== "" &&
	            standardsActDate !== "" &&
	            establishmentSignaturefactoriesImgStatus !== ""
	        ) {
	            var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

	            // Validate email format
	            if (standardsActEmail.match(mailformat)) {
	                $("#standardsActEmailValidation").addClass("hide");

	                // Check if "establishmentBefore" is "Yes"
	                if (establishmentBefore === "Yes") {

	                    // Check if "standardsActPurpose" and "standardsActLastDate" are also filled
	                    if (standardsActPurpose !== "" && standardsActLastDate !== "") {
	                        $("#factoriesFormsFieldset #save-continue").css({
	                            "opacity": "1",
	                            "pointer-events": "auto",
	                            "cursor": "pointer"
	                        });
	                    } else {
	                        $("#factoriesFormsFieldset #save-continue").css({
	                            "opacity": "0.4",
	                            "pointer-events": "none",
	                            "cursor": "default"
	                        });
	                    }
	                } else {
	                    // If "establishmentBefore" is not "Yes", enable save-continue
	                    $("#factoriesFormsFieldset #save-continue").css({
	                        "opacity": "1",
	                        "pointer-events": "auto",
	                        "cursor": "pointer"
	                    });
	                }
	            } else {
	                $("#standardsActEmailValidation").removeClass("hide");
	                $("#standardsActEmail").focus();
	                $("#factoriesFormsFieldset #save-continue").css({
	                    "opacity": "0.4",
	                    "pointer-events": "none",
	                    "cursor": "default"
	                });
	            }
	        } else {
	            $("#factoriesFormsFieldset #save-continue").css({
	                "opacity": "0.4",
	                "pointer-events": "none",
	                "cursor": "default"
	            });
	        }
		}
        
    }
}

</script>