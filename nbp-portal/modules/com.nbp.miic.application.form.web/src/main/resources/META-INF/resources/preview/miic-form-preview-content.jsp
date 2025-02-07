<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.miic.upload.document.commands.GettingDocumentData"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@ include file="../init.jsp" %>
<section id="miic-preview-step1" class="final-preview-section">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex justify-content-start">
					<p class="heading2 mt-2">Applicant Details</p>
					<span class="ml-3"> 
							<a href="javascript:void(0)" id="applicant-details-edit-tab">
							<svg width="19" height="19"
							viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
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
					<p class="sub_heading">Nature of Applicant</p>
					<p class="sub_heading_content nature-of-applicant-preview" ></p>
				</div>
			</div>
			<div class="col-6 hide cet-option">
				<div>
					<p class="sub_heading">(a) Applicant Name/ Requester Name</p>
					<p class="sub_heading_content requester-name-preview" ></p>
				</div>
			</div>
			<div class="col-6 hide safeguard-option">
				<div>
					<p class="sub_heading">(a) Name of Producer/Manufacturer of Goods</p>
					<p class="sub_heading_content manufacturer-of-goods-preview" ></p>
				</div>
			</div>
			<div class="col-6 hide indiApplication">
				<div>
					<p class="sub_heading">First Name</p>
					<p class="sub_heading_content first-name-preview" ></p>
				</div>
			</div>
			<div class="col-6 hide indiApplication">
				<div>
					<p class="sub_heading">Last Name</p>
					<p class="sub_heading_content last-name-preview" ></p>
				</div>
			</div>
			<div class="col-6 hide comApplication">
				<div>
					<p class="sub_heading">Company Name</p>
					<p class="sub_heading_content company-name-preview" ></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content address-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Email</p>
					<p class="sub_heading_content email-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Telephone</p>
					<p class="sub_heading_content telephone-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Date of Application</p>
					<p class="sub_heading_content date-of-application-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">TRN Number</p>
					<p class="sub_heading_content trn-number-preview" ></p>
				</div>
			</div>
		</div>
		<hr />
	</div>
</section>
<section id="miic-preview-step2" class="final-preview-section">
	<div class="applicant-details-preview-content">
		<div class="row">
			<div class="col-12">
				<div class="d-flex justify-content-start">
					<p class="heading2 mt-2 miicProcessTypeFormTab"></p>
					<span class="ml-3"> 
							<a href="javascript:void(0)" id="process-details-edit-tab">
							<svg width="19" height="19"
							viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
							<path
								d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
								fill="#047247" />
							</svg>
							</a>
					</span>
				</div>
			</div>
		</div>
	</div>
	<div class="hide" id="miicProcessCetPreview">
		<div class="row">
			<div class="col-12">
				<div>
					<p>Suspension of CET</p>
				</div>
			</div>
			<div class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addCetSuspensionDetailTable">
						<tr>
				          <!-- <th class="sub_heading">Name</th>
				          <th class="sub_heading">Address</th> -->
				          <th class="sub_heading text-nowrap">Tariff Heading no.</th>
				          <th class="sub_heading">Description</th>
				          <th class="sub_heading text-nowrap">Amount Quantity</th>
				          <th class="sub_heading text-nowrap">Amount Estimate in US $</th>
				          <th class="sub_heading text-nowrap">Technology Specification</th>
				          <th class="sub_heading text-nowrap">CET Rate</th>
				          <th class="sub_heading text-nowrap">Rate Proposed</th>
				          <th class="sub_heading text-nowrap">Period of Rate Change From</th>
					      <th class="sub_heading text-nowrap">Period of Rate Change To</th>
				        </tr>
				        			        <%if(Validator.isNotNull(suspensionOfCetAdd)&&suspensionOfCetAdd.size()>0){
								for(MiicSuspensionOfCetAdd suspensionOfCets:suspensionOfCetAdd){
							%>	
					        <tr>
				<%-- 	<td class="sub_heading_content cetName<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getNatureOfApplicant())?applicantDetail.getNatureOfApplicant():""%>
					</td>
					<td class="sub_heading_content cetAddress<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getAddress())?applicantDetail.getAddress():""%>
					</td> --%>
					<td class="sub_heading_content cetTariffHeading<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getTariffHeadingNum())?suspensionOfCets.getTariffHeadingNum():""%>
					</td>
					<td class="sub_heading_content cetDescription<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getDescription())?suspensionOfCets.getDescription():""%>
					</td>
					<td class="sub_heading_content suspensionQuantity<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getAmountQuantity())?suspensionOfCets.getAmountQuantity():""%>
					</td>
					<td class="sub_heading_content suspensionEstimate<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getAmountEstimateInUs())?suspensionOfCets.getAmountEstimateInUs():""%>
					</td>
					<td class="sub_heading_content suspensionSpecification<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getTechnologySpecification())?suspensionOfCets.getTechnologySpecification():""%>
					</td>
					<td class="sub_heading_content suspensionCetRate<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getCetRate())?suspensionOfCets.getCetRate():""%>
					</td>
					<td class="sub_heading_content suspensionRateProposed<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getRateProposed())?suspensionOfCets.getRateProposed():""%>
					</td>
					<td class="sub_heading_content suspensionPeriodOfRateChangeFrom<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getPeriodOfRateChangeFrom())?new SimpleDateFormat("YYYY-dd-MM").format(suspensionOfCets.getPeriodOfRateChangeFrom()):""%>
					</td>
					<td class="sub_heading_content suspensionPeriodOfRateChangeTo<%=cetSuspensionDetailVal%>">
					<%=Validator.isNotNull(suspensionOfCets)&&Validator.isNotNull(suspensionOfCets.getPeriodOfRateChangeTo())?new SimpleDateFormat("YYYY-dd-MM").format(suspensionOfCets.getPeriodOfRateChangeTo()):""%>
					</td>
				       </tr>
				<input type="hidden" id="miicSuspensionOfCetAddId<%=cetSuspensionDetailVal%>" name="miicSuspensionOfCetAddId<%=cetSuspensionDetailVal%>" value="">
					<%cetSuspensionDetailVal=cetSuspensionDetailVal+1;
							}}%> 
					</tbody>
				</table>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Indication of Urgency</p>
					<p class="sub_heading_content suspension-indication-urgency-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Reason for Request for Suspension of Rate</p>
					<p class="sub_heading_content suspension-of-rate-preview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Evidence of Inability to Supply</p>
					<p class="sub_heading_content suspension-evidence-inability-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p>Evidence of Consultation</p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Local</p>
					<p class="sub_heading_content suspensionConsultationLocal-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Foreign</p>
					<p class="sub_heading_content suspensionConsultationForeign-preview"></p>
				</div>
			</div>
		</div>
	</div>
	<div class="hide" id="miicProcessSafeguardPreview">
		<div class="row">
			<div class="col-12">
				<div>
					<p>Material Required</p>
				</div>
			</div>
			<div class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addMaterialRequiredDetailTable">
						<tr>
				         <!--  <th class="sub_heading">Name</th>
				          <th class="sub_heading">Address</th> -->
						  <th class="sub_heading text-nowrap">Tariff Heading no.</th>
				          <th class="sub_heading">Description</th>
				          <th class="sub_heading">Amount Quantity</th>
				          <th class="sub_heading text-nowrap">Period of importation From</th>
					      <th class="sub_heading text-nowrap">Period of importation To</th>
				          <th class="sub_heading text-nowrap">Technical Specification</th>
				        </tr>
				           <%if(Validator.isNotNull(safeguardMaterial)&&safeguardMaterial.size()>0){
								for(MiicSafeguardMaterialAdd safeguardMaterials:safeguardMaterial){
							%>	
					        <tr>
	<%-- 		<td class="sub_heading_content breakdownWorkingYear<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getNameOfProducer())?safeguardMaterials.getNameOfProducer():""%></td>
			<td class="sub_heading_content suspensionTechnologySpecification<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getAddressOfProducer())?safeguardMaterials.getAddressOfProducer():""%></td> --%>
			<td class="sub_heading_content materialDiscription<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getDescription())?safeguardMaterials.getDescription():""%></td>
			<td class="sub_heading_content materialTariff<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getTariffHeadingNum())?safeguardMaterials.getTariffHeadingNum():""%></td>
			<td class="sub_heading_content materialAmount<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getAmount())?safeguardMaterials.getAmount():""%></td>
			<td class="sub_heading_content materialQuantity<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getQuantity())?safeguardMaterials.getQuantity():""%></td>
			<td class="sub_heading_content materialImportationTo<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getPeriodOfImportationTo())?new SimpleDateFormat("YYYY-dd-MM").format(safeguardMaterials.getPeriodOfImportationTo()):""%></td>
			<td class="sub_heading_content materialSpecification<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getPeriodOfImportationFrom())?new SimpleDateFormat("YYYY-dd-MM").format(safeguardMaterials.getPeriodOfImportationFrom()):""%></td>
			<td class="sub_heading_content materialImportationFrom<%=materialRequiredDetailVal%>">
			<%=Validator.isNotNull(safeguardMaterials)&&Validator.isNotNull(safeguardMaterials.getTechnologySpecification())?safeguardMaterials.getTechnologySpecification():""%></td>
				</tr>
				<input type="hidden" id="miicSafeguardMaterialAddId<%=materialRequiredDetailVal%>" name="miicSafeguardMaterialAddId<%=materialRequiredDetailVal%>" value="">
				<%materialRequiredDetailVal=materialRequiredDetailVal+1;
							}}%>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<div>
					<p>Goods To Be Produced</p>
				</div>
			</div>
			<div class="col-12 table-responsive">
				<table class="table table-bordered mb-3">
					<tbody class="addGoodsProducedTable">
						<tr>
				          <th class="sub_heading text-nowrap">Tariff Heading no.</th>
					          <th class="sub_heading">Description</th>
					          <th class="sub_heading text-nowrap">Amount Quantity</th>
					          <th class="sub_heading text-nowrap">Amount Estimate Value in $JM</th>
					          <th class="sub_heading text-nowrap">Reason for Request for the invoking of the Safeguard Mechanism</th>
				        </tr>
				          <%if(Validator.isNotNull(safeguardAdd)&&safeguardAdd.size()>0){
								for(MiicSafeguardGoodAdd safeguardGoods:safeguardAdd){
							%>	
					        <tr>
			<td class="sub_heading_content goodsTariff<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getTariffHeadingNum())?safeguardGoods.getTariffHeadingNum():""%></td>
			<td class="sub_heading_content goodsDescription<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getDescription())?safeguardGoods.getDescription():""%></td>
			<td class="sub_heading_content goodsQuantity<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getAmountQuantity())?safeguardGoods.getAmountQuantity():""%></td>
			<td class="sub_heading_content goodsEstimate<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getAmountEstimate())?safeguardGoods.getAmountEstimate():""%></td>
			<td class="sub_heading_content goodsMechanism<%=goodsProducedDetailVal%>">
			<%=Validator.isNotNull(safeguardGoods)&&Validator.isNotNull(safeguardGoods.getResonForRequest())?safeguardGoods.getResonForRequest():""%></td>
				</tr>
		<input type="hidden" id="miicSafeguardGoodAddId<%=goodsProducedDetailVal%>" name="miicSafeguardGoodAddId<%=goodsProducedDetailVal%>" value="">
		<%goodsProducedDetailVal=goodsProducedDetailVal+1;
							}}%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</section>
<section class="final-preview-section supporting-doc-preview" id="miic-preview-step3">
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
		String fileUrlInPreview="";
		try{
		supportingDocumentsParentFolderGenericPre=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), miicApplicationId);
		
		supportingDocumentsSubFolderGenericPre =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGenericPre.getFolderId(),
					"Generic Documents");
		}catch(Exception e){}
		try{
		if(miicApplicationId>0){
			 dlFileEntriesGenericPre=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGenericPre.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(miicApplicationId>0 && dlFileEntriesGenericPre!=null){
			for (DLFileEntry uploadedFile : dlFileEntriesGenericPre) {
				try{
					fileEntryForGenericPre = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fileUrlInPreview = DLURLHelperUtil.getDownloadURL(fileEntryForGenericPre, fileEntryForGenericPre.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				}catch(Exception e ){
				}
		%>
		<div class="additionalDocPreviewOne">
			<div class="document-container-preview<%=counterOfDocumentsPre%> mb-2">
			<a class="sub_heading_content" id="additionalDocNamePreview<%=counterOfDocumentsPre%>" href="<%=Validator.isNotNull(fileUrlInPreview)? fileUrlInPreview:""%>"><%=uploadedFile.getFileName() %></a></div>
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

<script>
  function previewApplicantDetailInfo(){
	natureOfApplicant = $("#applicantNature").val();
	requesterName = $("#mainFirstName").val();
	manufacturerOfGoods = $("#mainFirstName").val();
	firstName = $("#mainFirstName").val();
	lastName = $("#mainLastName").val();
	companyName = $("#maincompanyName").val();
	address = $("#mainAddress").val();
	email = $("#mainEmail").val();
	telephone = $("#mainTelephone").val();
	dateOfApplication = $("#mainApplicationDate").val();
	trnNumber = $("#mainTrnNumber").val();
	
	$(".nature-of-applicant-preview").html(natureOfApplicant);
	$(".requester-name-preview").html(requesterName);
	$(".manufacturer-of-goods-preview").html(manufacturerOfGoods);
	$(".first-name-preview").html(firstName);
	$(".last-name-preview").html(lastName);
	$(".company-name-preview").html(companyName);
	$(".address-preview").html(address);
	$(".email-preview").html(email);
	$(".telephone-preview").html(telephone);
	$(".date-of-application-preview").html(dateOfApplication);
	$(".trn-number-preview").html(trnNumber);
	 
}
  
	function previewMiicSuspensionOfCetForm() {
		indicationOfUrgency = $("#suspensionIndicationUrgency").val();
		suspensionConsultationLocal = $("#suspensionConsultationLocal").val();
		suspensionConsultationForeign = $("#suspensionConsultationForeign").val();
		suspensionOfRate = $("#suspensionOfRate").val();
		var selectedEvidenceOfInability = new Array();
		$("input:checkbox[name=suspensionEvidenceInability]:checked").each(function(){
			selectedEvidenceOfInability.push($(this).val());
		});
		var suspensionEvidenceInability = selectedEvidenceOfInability.toString();
		var selectedEvidenceOfConsultation = new Array();
		$("input:checkbox[name=suspensionConsultation]:checked").each(function(){
			selectedEvidenceOfConsultation.push($(this).val());
		});
		var suspensionConsultation = selectedEvidenceOfConsultation.toString();
		$(".suspension-indication-urgency-preview").html(indicationOfUrgency);
		$(".suspension-of-rate-preview").html(suspensionOfRate);
		$(".suspension-evidence-inability-preview").html(suspensionEvidenceInability);
		$(".suspensionConsultationLocal-preview").html(suspensionConsultationLocal);
		$(".suspensionConsultationForeign-preview").html(suspensionConsultationForeign);
	}
</script>