<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<%
String listDriverSign="";
int contractVehicleRegisterDetailVal=1;
int contractDriverListDetailVal=1;
%>

<div class="contract-carriage-preview hide">
	<section id="jtbPreviewStep25" class="final-preview-section">
		<div class="contract-carriage-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Contract Carriage Operator</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="contractCarriageEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Name of Owner</p>
						<p class="sub_heading_content" id="carriageOwnerNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Home Address</p>
						<p class="sub_heading_content" id="carriageHomeAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="carriageEmailAddPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No.</p>
						<p class="sub_heading_content" id="carriageTelephoneNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">TRN No.</p>
						<p class="sub_heading_content" id="newContractTrnPreview"></p>
					</div>
				</div> 
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="carriageParishPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="carriageDatePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of Vehicles in Fleet</p>
						<p class="sub_heading_content" id="carriageVehiclesNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Organization</p>
						<p class="sub_heading_content" id="carriageOrganizationPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div class="row">
						<div class="col-12">
							<div>
								<p>List Vehicle Registration Information Being Applied For</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addContractVehicleRegisterDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Year</th>
										<th class="sub_heading text-nowrap">Make/Model</th>
										<th class="sub_heading text-nowrap">Plate #</th>
										<th class="sub_heading text-nowrap">Regis.Exp.Date</th>
										<th class="sub_heading text-nowrap">Fitness Exp.Date</th>
										<th class="sub_heading text-nowrap">Chassis #</th>
										<th class="sub_heading text-nowrap">Vehicle based at</th>
										<th class="sub_heading text-nowrap">Insurance Company</th>
										<th class="sub_heading text-nowrap">Policy Number</th>
										<th class="sub_heading text-nowrap">Insurance Expiry Date</th>
										<!-- <th class="sub_heading text-nowrap">Plate Number</th> -->
									</tr>
									<%if(Validator.isNotNull(listVehicleRegstAdd)&&listVehicleRegstAdd.size()>0){
		for(JtbAddListVehicleRegst vehicleRegst:listVehicleRegstAdd){ %>
		<tr class="contract-Vehicle-detail-row<%=contractVehicleRegisterDetailVal%>">
	<td class="sub_heading_content text-nowrap contractVehicleRegisterYear<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstYear())?vehicleRegst.getVehicleRegstYear():""%></td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterModel<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstModel())?vehicleRegst.getVehicleRegstModel():""%></td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterPlate<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstPlate())?vehicleRegst.getVehicleRegstPlate():""%></td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterExpDate<%=contractVehicleRegisterDetailVal%>">
	<%=vehicleRegst!=null&&vehicleRegst.getVehicleRegstExpDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(vehicleRegst.getVehicleRegstExpDate()):"" %>
	</td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterFitnessDate<%=contractVehicleRegisterDetailVal%>">
	<%=vehicleRegst!=null&&vehicleRegst.getVehicleRegstFitnessDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(vehicleRegst.getVehicleRegstFitnessDate()):"" %>
	</td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterChassis<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstChassis())?vehicleRegst.getVehicleRegstChassis():""%></td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterBased<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstBased())?vehicleRegst.getVehicleRegstBased():""%></td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterInsuranceCom<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstInsuranceCom())?vehicleRegst.getVehicleRegstInsuranceCom():""%></td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterPolicyNum<%=contractVehicleRegisterDetailVal%>">
	<%=Validator.isNotNull(vehicleRegst)&&Validator.isNotNull(vehicleRegst.getVehicleRegstPolicyNum())?vehicleRegst.getVehicleRegstPolicyNum():""%></td>
	<td class="sub_heading_content text-nowrap contractVehicleRegisterExpiryDate<%=contractVehicleRegisterDetailVal%>">
	<%=vehicleRegst!=null&&vehicleRegst.getVehicleRegstExpiryDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(vehicleRegst.getVehicleRegstExpiryDate()):"" %>
	</td>
	
     <input type="hidden" id="contractVehicleRegisterDetailId<%=contractVehicleRegisterDetailVal%>" name="contractVehicleRegisterDetailId<%=contractVehicleRegisterDetailVal%>" value="<%=vehicleRegst.getJtbAddListVehicleRegstId()%>">
</tr>
<%contractVehicleRegisterDetailVal=contractVehicleRegisterDetailVal+1;
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
								<p>List of Driver(s)</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addContractDriverListDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Name of Driver(s)</th>
										<th class="sub_heading text-nowrap">Driver's Licence / Trn</th>
										<th class="sub_heading text-nowrap">Expiry Date</th>
										<th class="sub_heading text-nowrap">Signature</th>
									</tr>
									<%
	List<DLFileEntry> fileEntry = new ArrayList<DLFileEntry>();
	DLFolder supportingDocumentsParentFolder = null;
	DLFolder supportingDocumentSubFolderManagment = null;
	 try {
			supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JTB Supported Documents");
			supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentFolder.getFolderId(), String.valueOf(jtbApplicationId));
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	if(Validator.isNotNull(listDriverAdd)&&listDriverAdd.size()>0){
	for(JtbAddListDriverInfo driverInfo:listDriverAdd){ 
		FileEntry attachDocFE1=null;
		listDriverSign="";      
	                         
            try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingSubDocumentFolder.getFolderId(),
					"Driver's Signature"+contractDriverListDetailVal);
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			System.out.println("--------------------------fileEntry-------------"+fileEntry);		
			for (DLFileEntry dlFileEntry : fileEntry) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				listDriverSign=DLURLHelperUtil.getPreviewURL(attachDocFE1,
						attachDocFE1.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		%>

	<tr class="contract-driver-list-detail-row<%=contractDriverListDetailVal%>">
	<td class="sub_heading_content text-nowrap contractDriverListName<%=contractDriverListDetailVal%>">
	<%=Validator.isNotNull(driverInfo)&&Validator.isNotNull(driverInfo.getDriverName())?driverInfo.getDriverName():""%></td>
	<td class="sub_heading_content text-nowrap contractDriverListLicence<%=contractDriverListDetailVal%>">
	<%=Validator.isNotNull(driverInfo)&&Validator.isNotNull(driverInfo.getDriverLicence())?driverInfo.getDriverLicence():""%></td>
	<td class="sub_heading_content text-nowrap contractDriverListExpiryDate<%=contractDriverListDetailVal%>">
	<%=driverInfo!=null&&driverInfo.getDriverExpiryDate()!=null?new SimpleDateFormat("yyyy-MM-dd").format(driverInfo.getDriverExpiryDate()):"" %></td>
	<td class="sub_heading_content text-nowrap driverSignature<%=contractDriverListDetailVal%>">
    <div class="signature_texarea mb-2" id="driverSignature">
	<img src="<%=listDriverSign%>" class="thumb-image"
	  style="height: 100px; width: 100px;">
    </div>
	</td>
	
     <input type="hidden" id="contractDriverListDetailId<%=contractDriverListDetailVal%>" name="contractDriverListDetailId<%=contractDriverListDetailVal%>" value="<%=driverInfo.getJtbAddListDriverInfoId() %>">
</tr>
<%contractDriverListDetailVal=contractDriverListDetailVal+1;
	}} %>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
   <section class="final-preview-section" id="jtbPreviewStep26">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Declarations</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="contractCarriageDeclarationEditTab"> <svg width="19"
									height="19" viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<p class="sub_heading">
						I <span class="giluio contractOwnerName"> </span> hereby apply
						for a permit to operate in the Tourism Industry in accordance with
						the provisions of the Tourist Board Act.
					</p>
				</div>
				<div class="col-12">
					<p class="pt-2 common-para">Signature of Owner/Operator</p>
				
						<%
						if (Validator.isNotNull(carriageDoc)) {
					%>
						<div class="signature_texarea mb-2"
						id="ownerSignatureHotelImageHolderPreview">
						<img src="<%=carriageDoc%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="ownerSignatureHotelImageHolderPreview"></div>
					<%
						}
					%>	
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="carriageSignDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>				
</div>			
<script>
function previewContractCarriageOperatorDetailInfo() {
	newContractOwnerName = $("#newContractOwnerName").val();
	newContractHomeAddress = $("#newContractHomeAddress").val();
	newContractEmail = $("#newContractEmail").val();
	newContractTelephone = $("#newContractTelephone").val();
	newContractTrn = $("#newContractTrn").val();
	newContractParish = $("#newContractParish").val();
	newContractDate = $("#newContractDate").val();
	newContractVehiclesNo = $("#newContractVehiclesNo").val();
	contractOrganization = $("#contractOrganization").val();
	OwnerSignDate = $("#OwnerSignDate").val();

	$("#carriageOwnerNamePreview").html(newContractOwnerName);
	$("#carriageHomeAddressPreview").html(newContractHomeAddress);
	$("#carriageEmailAddPreview").html(newContractEmail);
	$("#carriageTelephoneNoPreview").html(newContractTelephone);
	$("#newContractTrnPreview").html(newContractTrn);
	$("#carriageParishPreview").html(newContractParish);
	$("#carriageDatePreview").html(newContractDate);
	$("#carriageVehiclesNumPreview").html(newContractVehiclesNo);
	$("#carriageOrganizationPreview").html(contractOrganization);
	$("#carriageSignDatePreview").html(OwnerSignDate);
}
</script>