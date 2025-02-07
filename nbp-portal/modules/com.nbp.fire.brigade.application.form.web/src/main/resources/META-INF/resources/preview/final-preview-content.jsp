<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.upload.document.commands.GettingDocumentData"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@ include file="/init.jsp" %>
<section id="fire-brigade-preview-step1" class="final-preview-section ">
	<div class="signature-details-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Signature</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)"  id="signature-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-md-12">
				<p class="tab-form-main-heading">
					I hereby apply for <span class="giluio declaration-by"></span> to cover the period, I make the application as, 
					or on behalf of the owner/occupier of the premises. I will conform to the 
					stipulated requirements as recommended and will allow subsequent inspections and tests to be carried
					out, with a view of being granted certification.
				</p>
				<p class="pt-2 common-para">Signature</p>
				<%
								if (Validator.isNotNull(signatureAppli)) {
							%>
							<div class="signature_texarea mb-5" id="signatureHolderPre">
								<img src="<%=signatureAppli%>" class="thumb-image"
									style="height: 100px; width: 100px;">
									</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-5" id="signatureHolderPre"></div>
							<%
								}
							%>
			</div>
			 <div class="col-6">
				<div>
					<p class="sub_heading">Name</p>
					<p class="sub_heading_content sign-full-name-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Telephone</p>
					<p class="sub_heading_content sign-telephone-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Fax</p>
					<p class="sub_heading_content sign-fax-preview"></p>
				</div>
			</div>
            <div class="col-6">
				<div>
					<p class="sub_heading">Email</p>
					<p class="sub_heading_content sign-email-preview"></p>
				</div>
			</div>			
			<div class="col-6">
				<div>
					<p class="sub_heading">Date</p>
					<p class="sub_heading_content sign-date-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content sign-address-preview"></p>
				</div>
			</div>
		</div>
		<hr/>
	</div>
</section>
<section id="fire-brigade-preview-step2" class="final-preview-section ">
	<div class="premises-details-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Premises</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)"  id="premises-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			 <div class="col-6">
				<div>
					<p class="sub_heading">Is the premises</p>
					<p class="sub_heading_content premises-status-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Was the premises certified before</p>
					<p class="sub_heading_content premises-certified-preview"></p>
				</div>
			</div>
			<div class="col-6 premisesCertifiedOptionPre hide">
				<div>
					<p class="sub_heading">Expiration Date</p>
					<p class="sub_heading_content expiration-date-preview"></p>
				</div>
			</div>
            <div class="col-6 premisesCertifiedOptionPre hide">
				<div>
					<p class="sub_heading">Certificate Number</p>
					<p class="sub_heading_content certificate-number-preview"></p>
				</div>
			</div>			
			<div class="col-6">
				<div>
					<p class="sub_heading">Name</p>
					<p class="sub_heading_content name-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content address-preview"></p>
				</div>
			</div>
		</div>
		<hr/>
	</div>
</section>
<section id="fire-brigade-preview-step3" class="final-preview-section ">
	<div class="operator-details-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Operator's Detail</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="operator-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			 <div class="col-6">
				<div>
					<p class="sub_heading">Operator's Name</p>
					<p class="sub_heading_content operator-name-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Business Name</p>
					<p class="sub_heading_content business-name-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Address</p>
					<p class="sub_heading_content operator-address-preview"></p>
				</div>
			</div>
            <div class="col-6">
				<div>
					<p class="sub_heading">Uses to which premises is put</p>
					<p class="sub_heading_content premises-uses-preview"></p>
				</div>
			</div>			
			<div class="col-6">
				<div>
					<p class="sub_heading">Is the Premises a</p>
					<p class="sub_heading_content premises-occupancy-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Business/Activities that are conducted on the same premises</p>
					<p class="sub_heading_content premises-business-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Maximum number of persons to work on the premises</p>
					<p class="sub_heading_content max-working-persons-preview"></p>
				</div>
			</div>
			<div class="col-12">
				<div>
					<p class="sub_heading">Maximum number of persons other than workers 
								that are likely to be on the premises at any one time</p>
					<p class="sub_heading_content max-non-working-persons-preview"></p>
				</div>
			</div>
		</div>
		<hr/>
	</div>
</section>
<section id="fire-brigade-preview-step4" class="final-preview-section ">
	<div class="floor-structure-details-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Multiple Floor Structure</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="floor-structure-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			<div class="col-12">
				<p class="sub_heading_content" id="floorStructureFormMessagePre"></p>
				<div class="floor-structure-info-form-pre">
					<div class="row">
						<div class="col-6">
							<div>
								<p class="sub_heading">Are there alternate exits from each floors</p>
								<p class="sub_heading_content floor-alternate-exist-preview"></p>
							</div>
						</div>
						<div class="col-6">
							<div>
								<p class="sub_heading">Is there rising main throughout the building</p>
								<p class="sub_heading_content building-rising-main-preview"></p>
							</div>
						</div>
						<div class="col-6">
							<div>
								<p class="sub_heading">Is there a connection for the Fire Brigade equipment</p>
								<p class="sub_heading_content equipment-connection-preview"></p>
							</div>
						</div>
			            <div class="col-6">
							<div>
								<p class="sub_heading">Is there a parking garage on the building</p>
								<p class="sub_heading_content building-parking-garage-preview"></p>
							</div>
						</div>	
					</div>
				</div>
			</div>
		</div>
		<hr/>
	</div>
</section>
<section id="fire-brigade-preview-step5" class="final-preview-section ">
	<div class="fire-protection-details-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Fire Protection Equipment</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="fire-protection-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			 <div class="col-6">
				<div>
					<p class="sub_heading">Equipment Type</p>
					<p class="sub_heading_content equipment-protection-preview"></p>
				</div>
			</div>	
			<div class="col-6 hide otherSpecify">
				<div>
					<p class="sub_heading">Other Equipment</p>
					<p class="sub_heading_content other-equipment-preview"></p>
				</div>
			</div>	
		</div>
		<hr/>
	</div>
</section>
<section id="fire-brigade-preview-step6" class="final-preview-section ">
	<div class="hazardous-substance-details-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Hazardous Substance/Materials</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="hazardous-substance-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			 <div class="col-6">
				<div>
					<p class="sub_heading">L.P.G. cylinder</p>
					<p class="sub_heading_content lpg-cylinder-preview"></p>
				</div>
			</div>	
			<div class="col-6">
				<div>
					<p class="sub_heading">Flammable Gases</p>
					<p class="sub_heading_content flammable-gases-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Flammable & Combustible Liquid</p>
					<p class="sub_heading_content flammable-combustible-liquid-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Chemicals (liquid)</p>
					<p class="sub_heading_content chemicals-liquid-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Chemicals (powder)</p>
					<p class="sub_heading_content chemicals-powder-preview"></p>
				</div>
			</div>
			<div class="col-6">
				<div>
					<p class="sub_heading">Explosives</p>
					<p class="sub_heading_content explosives-preview"></p>
				</div>
			</div>	
			<div class="col-6 otherSpecifyPre hide">
				<div>
					<p class="sub_heading">Other hazardous substance/materials</p>
					<p class="sub_heading_content other-hazardous-substance-preview"></p>
				</div>
			</div>	
		</div>
		<hr/>
	</div>
</section>
<section id="fire-brigade-preview-step7" class="final-preview-section ">
	<div class="certificate-purpose-details-preview-content ">
		<div class="row">
			<div class="col-12">
				<div class="d-flex">
					<p class="heading2">Certificate Purpose</p>
					<span class="ml-3"> 
						<a href="javascript:void(0)" id="certificate-purpose-edit-tab">
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
	                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
	                    </svg>
	                    </a>
					</span>
				</div>
			</div>
			 <div class="col-12">
				<div>
					<p class="sub_heading">Purpose for which certificate is being requested</p>
					<p class="sub_heading_content certificate-purpose-preview"></p>
				</div>
			</div>	
			<div class="col-12 otherCertificatePurposePre hide">
				<div>
					<p class="sub_heading">Other Purpose for which certificate is being requested</p>
					<p class="sub_heading_content other-certificate-purpose-preview"></p>
				</div>
			</div>
		</div>
		<hr/>
	</div>
</section>
<section id="fire-brigade-preview-step8" class="final-preview-section">
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
				<p class="mb-2">Additional Supporting Documents</p>
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
		supportingDocumentsParentFolderGenericPre=GettingDocumentData.getDocumentLibraryParentAndSubFolder(themeDisplay.getScopeGroupId(), fireBrigadeApplicationId);
		
		supportingDocumentsSubFolderGenericPre =  DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolderGenericPre.getFolderId(),
					"Generic Documents");
		}catch(Exception e){}
		try{
		if(fireBrigadeApplicationId>0){
			 dlFileEntriesGenericPre=DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsSubFolderGenericPre.getFolderId()); 
			}
		} catch (Exception e) {
		}
		if(fireBrigadeApplicationId>0 && dlFileEntriesGenericPre!=null){
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
<section id="fire-brigade-preview-step9" class="final-preview-section">
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
					<p class="sub_heading">Proof of payment</p>
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
function previewSignatureInfo(){
	title = $("#title").val();
	signName = $("#signName").val();
	fullName = title+" "+signName;
	signTelephone = $("#signTelephone").val();
	signFax = $("#signFax").val();
	signEmail = $("#signEmail").val();
	signDate = $("#signDate").val();
	signAddress = $("#signAddress").val();
	
	$(".sign-full-name-preview").html(fullName);
	$(".sign-telephone-preview").html(signTelephone);
	$(".sign-fax-preview").html(signFax);
	$(".sign-email-preview").html(signEmail);
	$(".sign-date-preview").html(signDate);
	$(".sign-address-preview").html(signAddress);
}
function previewPremisesInfo(){
	premisesStatus = $("input[name='premisesStatus']:checked").val();
	premisesCertified = $("input[name='premisesCertified']:checked").val();
	expirationDate = $("#expirationDate").val();
	certificateNumber = $("#certificateNumber").val();
	name = $("#name").val();
	address = $("#address").val();
	
	$(".premises-status-preview").html(premisesStatus);
	$(".premises-certified-preview").html(premisesCertified);
	$(".expiration-date-preview").html(expirationDate);
	$(".certificate-number-preview").html(certificateNumber);
	$(".name-preview").html(name);
	$(".address-preview").html(address);
}
function previewOperatorInfo(){
	operatorName = $("#operatorName").val();
	businessName = $("#businessName").val();
	operatorAddress = $("#operatorAddress").val();
	premisesUses = $("#premisesUses").val();
	premisesOccupancy = $("input[name='premisesOccupancy']:checked").val();
	premisesBusiness = $("input[name='premisesBusiness']:checked").val();
	maxWorkingPersons = $("#maxWorkingPersons").val();
	maxNonWorkingPersons = $("#maxNonWorkingPersons").val();
	
	$(".operator-name-preview").html(operatorName);
	$(".business-name-preview").html(businessName);
	$(".operator-address-preview").html(operatorAddress);
	$(".premises-uses-preview").html(premisesUses);
	$(".premises-occupancy-preview").html(premisesOccupancy);
	$(".premises-business-preview").html(premisesBusiness);
	$(".max-working-persons-preview").html(maxWorkingPersons);
	$(".max-non-working-persons-preview").html(maxNonWorkingPersons);
}
function previewFloorStructureInfo(){
	floorAlternateExist = $("input[name='floorAlternateExist']:checked").val();
	buildingRisingMain = $("input[name='buildingRisingMain']:checked").val();
	equipmentConnection = $("input[name='equipmentConnection']:checked").val();
	buildingParkingGarage = $("input[name='buildingParkingGarage']:checked").val();	
	$(".floor-alternate-exist-preview").html(floorAlternateExist);
	$(".building-rising-main-preview").html(buildingRisingMain);
	$(".equipment-connection-preview").html(equipmentConnection);
	$(".building-parking-garage-preview").html(buildingParkingGarage);
}
function previewFireProtectionInfo(){
	var equipmentProtection = new Array();
	$("input:checkbox[name=equipmentProtection]:checked").each(function(){
		equipmentProtection.push($(this).val());
	});
	equipmentProtectionPre = equipmentProtection.toString(); 
	otherEquipment = $("#otherEquipment").val();
	$(".equipment-protection-preview").html(equipmentProtectionPre);
	$(".other-equipment-preview").html(otherEquipment);
}
function previewHazardousSubstanceInfo(){
	lpgCylinder = $("input[name='lpgCylinder']:checked").val();
	flammableGases = $("input[name='flammableGases']:checked").val();
	flammableCombustibleLiquid = $("input[name='flammableCombustibleLiquid']:checked").val();
	chemicalsLiquid = $("input[name='chemicalsLiquid']:checked").val();	
	chemicalsPowder = $("input[name='chemicalsPowder']:checked").val();
	explosives = $("input[name='explosives']:checked").val();
	otherHazardousSubstance = $("#otherHazardousSubstance").val();
	$(".lpg-cylinder-preview").html(lpgCylinder);
	$(".flammable-gases-preview").html(flammableGases);
	$(".flammable-combustible-liquid-preview").html(flammableCombustibleLiquid);
	$(".chemicals-liquid-preview").html(chemicalsLiquid);
	$(".chemicals-powder-preview").html(chemicalsPowder);
	$(".explosives-preview").html(explosives);
	$(".other-hazardous-substance-preview").html(otherHazardousSubstance);
}
function previewCertificatePurposeInfo(){
	var certificatePurpose = new Array();
	$("input:checkbox[name=certificatePurpose]:checked").each(function(){
		certificatePurpose.push($(this).val());
	});
	certificatePurposePre = certificatePurpose.toString();
	otherCertificatePurpose = $("#otherCertificatePurpose").val();
	$(".certificate-purpose-preview").html(certificatePurposePre);
	$(".other-certificate-purpose-preview").html(otherCertificatePurpose);
}
</script>