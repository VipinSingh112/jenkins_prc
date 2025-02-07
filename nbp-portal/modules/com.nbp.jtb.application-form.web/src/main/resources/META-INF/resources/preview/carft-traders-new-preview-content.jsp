<%@page import="com.nbp.jtb.upload.document.commands.GettingDocumentData"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<%
int craftTradersApplicantDetailVal=1;
int craftTradersEmployeeDetailVal=1;
%>
<div class="carft-traders-preview hide">
	<section id="jtbPreviewStep27" class="final-preview-section">
		<div class="carft-traders-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2"> Craft Traders Permit</p>
						<span class="ml-3">
							<a href="javascript:void(0)" id="carftTradersEditTab"> 
								<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
									   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
								</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Name of Owner</p>
						<p class="sub_heading_content" id="craftTradersApplicantOwnerPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Home Address</p>
						<p class="sub_heading_content" id="craftTradersApplicantAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Phone No.</p>
						<p class="sub_heading_content" id="craftTradersApplicantPhoneNoPreview"></p>
					</div>
				</div>
				<div class="col-md-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="craftTradersApplicantEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div class="row">
						<div class="col-12">
							<div>
								<p>Selling Location Details</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addCraftTradersApplicantDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Selling Location</th>
									</tr><%if(Validator.isNotNull(attarctionManagerAdd)&&attarctionManagerAdd.size()>0){
	for(JtbAddCraftApplicantInfo craftApplicant:attarctionManagerAdd){ %>
	<tr class="craft-applicant-detail-row<%=craftTradersApplicantDetailVal%>">
	<td class="sub_heading_content text-nowrap craftTradersApplicantLocation<%=craftTradersApplicantDetailVal%>">
	<%=Validator.isNotNull(craftApplicant)&&Validator.isNotNull(craftApplicant.getSellingLocation())?craftApplicant.getSellingLocation():""%></td>
	
     
</tr>
<input type="hidden" id="craftTradersApplicantDetailId<%=craftTradersApplicantDetailVal%>" name="craftTradersApplicantDetailId<%=craftTradersApplicantDetailVal%>" value="<%=craftApplicant.getJtbAddCraftApplicantInfoId() %>">
<%craftTradersApplicantDetailVal=craftTradersApplicantDetailVal+1;
	}} %>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="col-12">
					<div class="row">
						<div class="col-12">
							<div>
								<p>Employee Details</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addCraftTradersEmployeeDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Name of Employee</th>
										<th class="sub_heading text-nowrap">Address</th>
										<th class="sub_heading text-nowrap">Phone No.</th>
									</tr>
									<%if(Validator.isNotNull(craftEmp)&&craftEmp.size()>0){
	for(JtbAddCraftEmployeeInfo craftEmployee:craftEmp){ %>
	<tr class="carft-employee-detail-row<%=craftTradersEmployeeDetailVal%>">
	<td class="sub_heading_content text-nowrap craftTradersEmployeeName<%=craftTradersEmployeeDetailVal%>">
	<%=Validator.isNotNull(craftEmp)&&Validator.isNotNull(craftEmployee.getEmpName())?craftEmployee.getEmpName():""%></td>
	<td class="sub_heading_content text-nowrap craftTradersEmployeeAddress<%=craftTradersEmployeeDetailVal%>">
	<%=Validator.isNotNull(craftEmp)&&Validator.isNotNull(craftEmployee.getEmpAddress())?craftEmployee.getEmpAddress():""%></td>
	<td class="sub_heading_content text-nowrap craftTradersEmployeePhoneNo<%=craftTradersEmployeeDetailVal%>">
	<%=Validator.isNotNull(craftEmp)&&Validator.isNotNull(craftEmployee.getEmpPhoneNo())?craftEmployee.getEmpPhoneNo():""%></td>
	
    
</tr>
 <input type="hidden" id="craftTradersEmployeeDetailId<%=craftTradersEmployeeDetailVal%>" name="craftTradersEmployeeDetailId<%=craftTradersEmployeeDetailVal%>" value="<%=craftEmployee.getJtbAddCraftEmployeeInfoId()%>">
<%craftTradersEmployeeDetailVal=craftTradersEmployeeDetailVal+1;
	}} %>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Permission to Occupy Location</p>
						<p class="sub_heading_content" id="carftTradersLocationPreview"></p>
						
					    <p class="sub_heading_content occupyLocation1" id="evidenceOwnership-pre"></p>
					    <p><a class="sub_heading_content" id="evidenceOwnership-pre" href="<%=Validator.isNotNull(evidenceSignUrl)? evidenceSignUrl:""%>"><%=(Validator.isNotNull(evidenceSign))?evidenceSign:""%></a></p>
					    
						<p class="sub_heading_content occupyLocation2" id="rentReceipt-pre"></p>
						<p><a class="sub_heading_content" id="rentReceipt-pre" href="<%=Validator.isNotNull(rentSignUrl)? rentSignUrl:""%>"><%=(Validator.isNotNull(rentSign))?rentSign:""%></a></p>
						
						<p class="sub_heading_content occupyLocation3" id="letterOwner-pre"></p>
						<p><a class="sub_heading_content" id="letterOwner-pre" href="<%=Validator.isNotNull(letterOwnerSignUrl)? letterOwnerSignUrl:""%>"><%=(Validator.isNotNull(letterOwnerSign))?letterOwnerSign:""%></a></p>
						
						<p class="sub_heading_content occupyLocation4" id="contractLease-pre"></p>
						<p><a class="sub_heading_content" id="contractLease-pre" href="<%=Validator.isNotNull(contractLeaseSignUrl)? contractLeaseSignUrl:""%>"><%=(Validator.isNotNull(contractLeaseSign))?contractLeaseSign:""%></a></p>
						
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading">Type of Goods Sold</p>
						<p class="sub_heading_content" id="carftTradersGoodsSoldPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="common-para">References for Owner and Employee</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="carftTradersOwnerNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="carftTradersOwnerPositionPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="carftTradersOwnerAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="carftTradersEmpNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Position</p>
						<p class="sub_heading_content" id="carftTradersEmpPositionPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="carftTradersEmpAddressPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Craft Vendor's Signature</p>
							<%
						if (Validator.isNotNull(craftVendorSign)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignatureCraftImageHolderPreview">
						<img src="<%=craftVendorSign%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureCraftImageHolderPreview"></div>
					<%
						}
					%>		
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="carftTradersVendorSignPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Craft Vendor's Assistant Signature</p>
				
							<%
						if (Validator.isNotNull(craftAssistantSign)) {
					%>
						<div class="signature_texarea mb-2"
						id="applicantSignatureCraftAssistantImageHolderPreview">
						<img src="<%=craftAssistantSign%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureCraftAssistantImageHolderPreview"></div>
					<%
						}
					%>		
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="carftTradersAssistantSignPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>		
<section class="final-preview-section supporting-doc-preview" id="jtbPreviewStep28">
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
		supportingDocumentsParentFolderGenericPre=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), jtbApplicationId);
		
		supportingDocumentsSubFolderGenericPre =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGenericPre.getFolderId(),
					"Generic Documents");
		}catch(Exception e){}
		try{
		if(jtbApplicationId>0){
			 dlFileEntriesGenericPre=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGenericPre.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(jtbApplicationId>0 && dlFileEntriesGenericPre!=null){
			for (DLFileEntry uploadedFile : dlFileEntriesGenericPre) {
				try{
					fileEntryForGenericPre = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrl = DLURLHelperUtil.getDownloadURL(fileEntryForGenericPre, fileEntryForGenericPre.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				}catch(Exception e ){
				}
		%>
		<div class="additionalDocPreviewOne">
			<div class="document-container-preview<%=counterOfDocumentsPre%> mb-2">
			<a class="sub_heading_content" id="additionalDocNamePreview<%=counterOfDocumentsPre%>" href="<%=Validator.isNotNull(fileUrl)? fileUrl:""%>"><%=uploadedFile.getFileName() %></a></div>
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
<section class="final-preview-section fee-details-preview pt-3" id="jtbPreviewStep29">
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
function previewCarftTradersDetailInfo() {
	craftTradersApplicantOwner = $("#craftTradersApplicantOwner").val();
	craftTradersApplicantAddress = $("#craftTradersApplicantAddress").val();
	craftTradersApplicantPhoneNo = $("#craftTradersApplicantPhoneNo").val();
	craftTradersApplicantEmail = $("#craftTradersApplicantEmail").val();
	
	craftTraderGoodsType = $("#craftTraderGoodsType").val();
	craftTraderName = $("#craftTraderName").val();
	craftTraderPosition = $("#craftTraderPosition").val();
	craftTraderNameMinisterAddress = $("#craftTraderNameMinisterAddress").val();
	craftTraderNameMinisterName = $("#craftTraderNameMinisterName").val();
	craftTraderMinisterNamePosition = $("#craftTraderMinisterNamePosition").val();
	craftTraderAddressOwner = $("#craftTraderAddressOwner").val();
	craftTraderSignDate = $("#craftTraderSignDate").val();
	craftTraderAssistantSignDate = $("#craftTraderAssistantSignDate").val();
	
	
	$("#craftTradersApplicantOwnerPreview").html(craftTradersApplicantOwner);
	$("#craftTradersApplicantAddressPreview").html(craftTradersApplicantAddress);
	$("#craftTradersApplicantPhoneNoPreview").html(craftTradersApplicantPhoneNo);
	$("#craftTradersApplicantEmailPreview").html(craftTradersApplicantEmail);
	
	$("#carftTradersGoodsSoldPreview").html(craftTraderGoodsType);
	$("#carftTradersOwnerNamePreview").html(craftTraderName);
	$("#carftTradersOwnerPositionPreview").html(craftTraderPosition);
	$("#carftTradersOwnerAddressPreview").html(craftTraderNameMinisterAddress);
	$("#carftTradersEmpNamePreview").html(craftTraderNameMinisterName);
	$("#carftTradersEmpPositionPreview").html(craftTraderMinisterNamePosition);
	$("#carftTradersEmpAddressPreview").html(craftTraderAddressOwner);
	$("#carftTradersVendorSignPreview").html(craftTraderSignDate);
	$("#carftTradersAssistantSignPreview").html(craftTraderAssistantSignDate);
	
	var selectedoccupyLocation = new Array();
	$("input:checkbox[name=occupyLocation]:checked").each(function() {
		selectedoccupyLocation.push($(this).val()); 
	});
	$("#carftTradersLocationPreview").html(selectedoccupyLocation.join(", "));
	
}
</script>