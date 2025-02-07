<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.factories.registration.application.util.GettingDocumentData"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="factories-registration-preview">
	<section id="factoriesPreviewStep1" class="final-preview-section">
		<div class="factories-registration-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Standards Act</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="standardsActEditTab"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
									   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
								</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Establishment</p>
						<p class="sub_heading_content"
							id="actStandEstablishmentNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="actStandParishPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="actStandAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone Number</p>
						<p class="sub_heading_content" id="actStandTelephoneNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">WhatsApp Number</p>
						<p class="sub_heading_content" id="actStandWhatsappNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="actStandEmailPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax Number</p>
						<p class="sub_heading_content" id="actStandFaxNumberPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Full Name of Operator of the
							Establishment</p>
						<p class="sub_heading_content" id="actStandOperatorNamePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="actStandOperatorAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="actStandOperatorParishPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone Number</p>
						<p class="sub_heading_content" id="actStandOperatorTeleNumPreview"></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addProductDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Brand</th>
								<th class="sub_heading text-nowrap">Product</th>
								<th class="sub_heading text-nowrap">Product Size</th>
								<th class="sub_heading text-nowrap">Measurement Value</th>
							</tr>
				<%if(Validator.isNotNull(productDetailAdd) && productDetailAdd.size()>0){
								int productDetailVal=1;
						for(FactoriesProductDetailsAdd productDetail:productDetailAdd){ %>
						<tr class="product-details-row<%=productDetailVal%>">
						<td class="sub_heading_content brand<%=productDetailVal%>"><%=Validator.isNotNull(productDetail)&&Validator.isNotNull(productDetail.getProductBrand())?productDetail.getProductBrand():""%></td>
						<td class="sub_heading_content product<%=productDetailVal%>"><%=Validator.isNotNull(productDetail)&&Validator.isNotNull(productDetail.getProduct())?productDetail.getProduct():""%></td>
						<td class="sub_heading_content productSize<%=productDetailVal%>"><%=Validator.isNotNull(productDetail)&&Validator.isNotNull(productDetail.getProductSize())?productDetail.getProductSize():""%></td>
						<td class="sub_heading_content measurementValue<%=productDetailVal%>"><%=Validator.isNotNull(productDetail)&&Validator.isNotNull(productDetail.getProductMeasurementVal())?productDetail.getProductMeasurementVal():""%></td>
						
					</tr>
					<input type="hidden" id="productDetail<%=productDetailVal%>" name="productDetail<%=productDetailVal%>" value="<%=productDetail.getFactoriesProductDetailsAddId()%>">
					 <%productDetailVal=productDetailVal+1;
								}} %>
						</tbody>
					</table>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">List of Product (s) Manufactured</p>
						<p class="sub_heading_content"
							id="actStandManufacturedListPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Brands of Product(s) Manufactured</p>
						<p class="sub_heading_content" id="actStandProductPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Product size(s)</p>
						<p class="sub_heading_content" id="actStandProductSizePreview"></p>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">The Establishment been operated before?</p>
						<p class="sub_heading_content"
							id="actStandEstablishmentOperatedPreview"></p>
					</div>
				</div>
				<div class="col-6 " id="otherCopyPre">
					<div>
						<p class="sub_heading">Last Date (or Period) of Operation</p>
						<p class="sub_heading_content" id="actStandLastDatePreview"></p>
					</div>
				</div>
				<div class="col-6 " id="otherCopyPre">
					<div>
						<p class="sub_heading">For What Purpose</p>
						<p class="sub_heading_content" id="actStandPurposePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="actStandDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Operator of Establishment</p>
					
						<%
						if (Validator.isNotNull(formNameDoc)) {
					%>
					<div class="signature_texarea mb-2"
						id="actStandOperatorEstablishmentSignPreview">
						<img src="<%=formNameDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="actStandOperatorEstablishmentSignPreview"></div>
					<%
						}
					%>		
						
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section second" id="factoriesPreviewStep2">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form A (Regulation 3)</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="processedFoodActEditTab"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Establishment</p>
						<p class="sub_heading_content"
							id="foodActEstablishmentNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="foodActParishPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="foodActAddresstPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Full Name of Operator of the
							Establishment</p>
						<p class="sub_heading_content" id="foodActOperatorNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="foodActOperatorAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="foodActOperatorParishPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Prescribed food(s) which it is proposed
							to manufacture in the establishment</p>
						<p class="sub_heading_content" id="foodActManufacturePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">The Establishment been operated before?</p>
						<p class="sub_heading_content" id="foodActOperatedBeforePreview"></p>
					</div>
				</div>
				<div class="col-6 " id="otherfieldPre">
					<div>
						<p class="sub_heading">(a) Last Date (or Period) of Operation</p>
						<p class="sub_heading_content" id="foodActLastDateOperationPreview"></p>
					</div>
				</div>
				<div class="col-6 " id="otherfieldPre">
					<div>
						<p class="sub_heading">(b) The Prescribed food(s) which was/ were
							Manufactured</p>
						<p class="sub_heading_content" id="foodActPrescribedFoodPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="foodActDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Operator of Establishment</p>
						<%
						if (Validator.isNotNull(formProcessedDoc)) {
					%>
					<div class="signature_texarea mb-2"
						id="foodActOperatorSignaturePreview">
						<img src="<%=formProcessedDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="foodActOperatorSignaturePreview"></div>
					<%
						}
					%>		
						
				</div>
			</div>
		</div>
	</section>
</div>
<section class="final-preview-section supporting-doc-preview" id="factoriesPreviewStep3">
	<div class="supporting-doc-info-form">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Supporting Documents</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="supporting-doc-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
							   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
						</svg>
						</a>
					</span>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-12 hide" id="requireDocPreviewSection">
				<p>Mandatory Documents</p>
				<div id="requireDocPreview"></div>
			</div>
			<div class="col-12 hide" id="notRequireDocPreviewSection">
				<p>Optional Documents</p>
				<div id="notRequireDocPreview"></div>
			</div>
				<div class="col-12" id="additionalDocPreviewSection">
				<p>Additional Supporting Documents</p>
				<p class="sub_heading noAdditionalSupportingDoc">No Additional Supporting Documents</p>
				<div id="additionalDocPreview"></div>
				
						<% 
		int counterOfDocumentsPre=1;
		String fileUrlForPreview="";
		FileEntry fileEntryForGenericPre=null;
		DLFolder supportingDocumentsParentFolderGenericPre = null;
		DLFolder supportingDocumentsSubFolderGenericPre = null;
		List<DLFileEntry> dlFileEntriesGenericPre =null;
		try{
		supportingDocumentsParentFolderGenericPre=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), factoriesApplicationId);
		
		supportingDocumentsSubFolderGenericPre =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGenericPre.getFolderId(),
					"Generic Document Upload");
		}catch(Exception e){}
		try{
		if(factoriesApplicationId>0){
			 dlFileEntriesGenericPre=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGenericPre.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(factoriesApplicationId>0 && dlFileEntriesGenericPre!=null){
			for (DLFileEntry uploadedFile : dlFileEntriesGenericPre) {
				try{
					fileEntryForGenericPre = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					fileUrlForPreview = DLURLHelperUtil.getDownloadURL(fileEntryForGenericPre, fileEntryForGenericPre.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				}catch(Exception e ){
				}
		%>
		<div class="additionalDocPreviewOne">
			<div class="document-container-preview<%=counterOfDocumentsPre%> mb-2">
			<a class="sub_heading_content" id="additionalDocNamePreview<%=counterOfDocumentsPre%>" href="<%=Validator.isNotNull(fileUrlForPreview)? fileUrlForPreview:""%>"><%=uploadedFile.getFileName() %></a></div>
		</div>
			<%	
			counterOfDocumentsPre=counterOfDocumentsPre+1;
			}
				}else{
			%> 
				
			<%}%>
			</div>
		</div>
	</div>
</section>
<section class="final-preview-section fee-details-preview" id="factoriesPreviewStep4">
	<div class="fee-payment-info-form">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Fee Payment</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="fee-payment-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
							   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
						</svg>
						</a>
					</span>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-6">
				<div>
					<p class="sub_heading">Method</p>
					<p class="sub_heading_content fee-method-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Proof of Payment</p>
				<p><a class="sub_heading_content" id="payment-upload-preview" href="<%=Validator.isNotNull(feeRecipetUrl)? feeRecipetUrl:""%>"><%=(Validator.isNotNull(feeRecipet))?feeRecipet:""%></a></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Amount</p>
					<p class="sub_heading_content fee-amount-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Currency</p>
					<p class="sub_heading_content fee-currency-preview"></p>
				</div>
			</div>	
		</div>
	</div>
</section>
<script>
	function previewStandardActDetailInfo() {
		standardsActEstablishmentName = $("#standardsActEstablishmentName").val();
		standardsActAddParish = $("#standardsActAddParish").val();
		standardsActAddress = $("#standardsActAddress").val();
		standardsActTel = $("#standardsActTel").val();
		standardsActWhatsAppNum = $("#standardsActWhatsAppNum").val();
		standardsActEmail = $("#standardsActEmail").val();
		standardsActFaxNum = $("#standardsActFaxNum").val();
		standardsActOperatorName = $("#standardsActOperatorName").val();
		standardsActOperatorAddress = $("#standardsActOperatorAddress").val();
		standardsActParish = $("#standardsActParish").val();
		standardsActOperatorTel = $("#standardsActOperatorTel").val();
		/* standardActProductManufactured = $("#standardActProductManufactured").val(); */
		/* standardActBrandManufactured = $("#standardActBrandManufactured").val(); */
		/* standardsActProductSize = $("#standardsActProductSize").val(); */
		establishmentBefore = $("input[name='establishmentBefore']:checked").val();
		standardsActLastDate = $("#standardsActLastDate").val();
		standardsActPurpose = $("#standardsActPurpose").val();
		standardsActDate = $("#standardsActDate").val();
		
		processedActEstablishmentName = $("#processedActEstablishmentName").val();
		processedActParishAddress = $("#processedActParishAddress").val();
		processedActAddress = $("#processedActAddress").val();
		processedActOperatorName = $("#processedActOperatorName").val();
		processedActOperatorAddress = $("#processedActOperatorAddress").val();
		processedActParish = $("#processedActParish").val();
		processedActDescription = $("#processedActDescription").val();
		establishmentOperated = $("input[name='establishmentOperated']:checked").val();
		processedActLastDate = $("#processedActLastDate").val();
		processedActManufactured = $("#processedActManufactured").val();
		processedActDate = $("#processedActDate").val();

		$("#actStandEstablishmentNamePreview").html(standardsActEstablishmentName);
		$("#actStandParishPreview").html(standardsActAddParish);
		$("#actStandAddressPreview").html(standardsActAddress);
		$("#actStandTelephoneNoPreview").html(standardsActTel);
		$("#actStandWhatsappNoPreview").html(standardsActWhatsAppNum);
		$("#actStandEmailPreview").html(standardsActEmail);
		$("#actStandFaxNumberPreview").html(standardsActFaxNum);
		$("#actStandOperatorNamePreview").html(standardsActOperatorName);
		$("#actStandOperatorAddressPreview").html(standardsActOperatorAddress);
		$("#actStandOperatorParishPreview").html(standardsActParish);
		$("#actStandOperatorTeleNumPreview").html(standardsActOperatorTel);
	/* 	$("#actStandManufacturedListPreview").html(standardActProductManufactured); */
		/* $("#actStandProductPreview").html(standardActBrandManufactured); */
		/* $("#actStandProductSizePreview").html(standardsActProductSize); */
		$("#actStandEstablishmentOperatedPreview").html(establishmentBefore);
		$("#actStandLastDatePreview").html(standardsActLastDate);
		$("#actStandPurposePreview").html(standardsActPurpose);
		$("#actStandDatePreview").html(standardsActDate);
		
		$("#foodActEstablishmentNamePreview").html(processedActEstablishmentName);
		$("#foodActParishPreview").html(processedActParishAddress);
		$("#foodActAddresstPreview").html(processedActAddress);
		$("#foodActOperatorNamePreview").html(processedActOperatorName);
		$("#foodActOperatorAddressPreview").html(processedActOperatorAddress);
		$("#foodActOperatorParishPreview").html(processedActParish);
		$("#foodActManufacturePreview").html(processedActDescription);
		$("#foodActOperatedBeforePreview").html(establishmentOperated);
		$("#foodActLastDateOperationPreview").html(processedActLastDate);
		$("#foodActPrescribedFoodPreview").html(processedActManufactured);
		$("#foodActDatePreview").html(processedActDate);
		
	}
</script>
