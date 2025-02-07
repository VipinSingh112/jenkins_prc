<%@ include file="../init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.wra.application.form.service.model.WRAReqIrrigation"%>
<div class="water-resources-forms-preview hide">
	<section id="wraPreviewStep1" class="final-preview-section">
		<div class="water-resources-forms-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form A (Regulation 3(1))</p>
						<span class="ml-3"> <a href="javascript:void(0)" class="preview-edit-button"
							id="waterResourceEdit"> <svg width="19" height="19"
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
						<p class="sub_heading">Application No</p>
						<p class="sub_heading_content" id="abstractApplicationNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">1. Name of Applicant</p>
						<p class="sub_heading_content" id="waterUserApplicantNamePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="waterUserParishAddPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">2. Mailing Address of Applicant</p>
						<p class="sub_heading_content" id="waterUserMailingAddressPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="waterUserEmailPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Office Phone</p>
						<p class="sub_heading_content" id="waterUserOfficePhonePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mobile Phone</p>
						<p class="sub_heading_content" id="waterUserMobilePhonePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Home Phone</p>
						<p class="sub_heading_content" id="waterUserHomePhonePre"></p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="waterUserWorkParishPre"></p>
					</div>
				</div> -->
				<div class="col-12">
					<div>
						<p class="sub_heading">3. Location of proposed work or of
							existing work in respect of which alteration or extension is
							proposed</p>
						<p class="sub_heading_content" id="waterUserLocationPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">4. Name of Contractor</p>
						<p class="sub_heading_content" id="waterUserConstractorNamePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="waterUserConstractorParishAddPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">5. Address of Constractor</p>
						<p class="sub_heading_content" id="waterUserConstractorAddressPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">6. Source of water for which license is
							desired</p>
						<p class="sub_heading_content" id="waterUserWaterSourcePre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">7. Purpose for which water is to be used</p>
						<p class="sub_heading_content" id="waterUserPurposePre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>8. If water is required for irrigation, state</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addWaterIrrigationDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Area and crop type to be irrigated</th>
								<th class="sub_heading text-nowrap">System of irrigation</th>
							</tr>
							<%if(waterReqIrr!=null){
								long waterReqIrrAddCounter=1;
                           for(WRAReqIrrigation requiredIrrigation:waterReqIrr){ %>
							<tr>
								<td
									class="sub_heading_content abstractAreaIrrigated<%=waterReqIrrAddCounter%>">
									<%=Validator.isNotNull(requiredIrrigation)&&Validator.isNotNull(requiredIrrigation.getAbstractAreaIrrigated())?requiredIrrigation.getAbstractAreaIrrigated():""%></td>
								<td
									class="sub_heading_content abstractSystemIrrigation<%=waterReqIrrAddCounter%>">
									<%=Validator.isNotNull(requiredIrrigation)&&Validator.isNotNull(requiredIrrigation.getAbstractSystemIrrigated())?requiredIrrigation.getAbstractSystemIrrigated():""%></td>
						    </tr> 
						    <input type="hidden" id="waterIrrigationDetailId<%=waterReqIrrAddCounter%>" name="waterIrrigationDetailId<%=waterReqIrrAddCounter%>" value="<%=requiredIrrigation.getWraReqIrrigationId()%>">
	                         <%waterReqIrrAddCounter++;
		                    }} %>   
						</tbody>
					</table>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">9. Means of disposal of excess or waste
							water</p>
						<p class="sub_heading_content" id="waterUserWasteWaterePre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>10. Technical details</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">(i) Estimated depth of borehole or well
							metres</p>
						<p class="sub_heading_content" id="waterUserBoreholeDepthPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">(ii) Diameter of borehole or well
							centimetres</p>
						<p class="sub_heading_content" id="waterUserWellBoreholePre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">(iii) In the case of artesian supplies, the
							method proposed for controlling the flow from the borehole and
							for preventing leakage around the borehole lining</p>
						<p class="sub_heading_content" id="waterUserSuppliesPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">(iv) Geological strata from which water is
							to be drawn, e.g. limestone, gravel, etc.</p>
						<p class="sub_heading_content" id="waterUserGeologicalPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">(v) State the method of abstracting water</p>
						<p class="sub_heading_content" id="waterUserStateMethodPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">(vi) Maximum daily quantity of water to be
							abstracted in cubic metres</p>
						<p class="sub_heading_content" id="waterUserCubicMetresPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">(vii) Type of apparatus proposed for
							measuring and recording the rate of abstraction</p>
						<p class="sub_heading_content" id="waterUserRecordingPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">(viii) Other relevant technical information</p>
						<p class="sub_heading_content" id="waterUserTechnicalInfoPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">11. State whether any request for a supply
							of water has been made to the National Water Commission or
							National Irrigation Commission Limited and, if so, with what
							result</p>
						<p class="sub_heading_content" id="waterUserWaterSupplyPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">12. Any further information which the
							Authority may take into account in considering the application</p>
						<p class="sub_heading_content" id="waterUserAccountInfoPre"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">
							I <span class="giluio applicantName"> </span> hereby apply for a
							license under the Water Resources Act and declare that to the
							best of my knowledge and belief the particulars set out in this
							application are true and correct.
						</p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<div class="signature_texarea mb-2"
						id="waterUserApplicantSignPre">
						<%if(Validator.isNotNull(abstractSignUrl)){ %>
						<img src="<%=abstractSignUrl%>"  width="100" height="100"/>
						<%} %>
						</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="waterUserSignPre"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewAbstractWaterUserDetailInfo() {
	abstractApplicantName = $("#abstractApplicantName").val();
	abstractMailingAddParish = $("#abstractMailingAddParish").val();
	abstractMailingAddress = $("#abstractMailingAddress").val();
	abstractEmailAddress = $("#abstractEmailAddress").val();
	abstractOfficePhone = $("#abstractOfficePhone").val();
	abstractMobilePhone = $("#abstractMobilePhone").val();
	abstractHomePhone = $("#abstractHomePhone").val();
	abstractWorkLocation = $("#abstractWorkLocation").val();
	abstractLocation = $("#abstractLocation").val();
	abstractContractorName = $("#abstractContractorName").val();
	abstractContractorAddress = $("#abstractContractorAddress").val();
	abstractWaterContractorAdd = $("#abstractWaterContractorAdd").val();
	abstractWaterSource = $("#abstractWaterSource").val();
	abstractWaterPurpose = $("#abstractWaterPurpose").val();
	abstractAreaIrrigated = $("#abstractAreaIrrigated").val();
	abstractSystemIrrigation = $("#abstractSystemIrrigation").val();
	abstractWasteWater = $("#abstractWasteWater").val();
	abstractBoreholeDepth = $("#abstractBoreholeDepth").val();
	abstractDiameterBorehole = $("#abstractDiameterBorehole").val();
	abstractSuppliesLine = $("#abstractSuppliesLine").val();
	abstractLimestone = $("#abstractLimestone").val();
	abstractWaterMethod = $("#abstractWaterMethod").val();
	abstractWaterQuantity = $("#abstractWaterQuantity").val();
	abstractRecordingType = $("#abstractRecordingType").val();
	abstractTechnicalInformation = $("#abstractTechnicalInformation").val();
	abstractWaterCommission = $("#abstractWaterCommission").val();
	abstractInformation = $("#abstractInformation").val();
	abstractSignDate = $("#abstractSignDate").val();
	
	$("#waterUserApplicantNamePre").html(abstractApplicantName);
	$("#waterUserParishAddPre").html(abstractMailingAddParish);
	$("#waterUserMailingAddressPre").html(abstractMailingAddress);
	$("#waterUserEmailPre").html(abstractEmailAddress);
	$("#waterUserOfficePhonePre").html(abstractOfficePhone);
	$("#waterUserMobilePhonePre").html(abstractMobilePhone);
	$("#waterUserHomePhonePre").html(abstractHomePhone);
	$("#waterUserWorkParishPre").html(abstractWorkLocation);
	$("#waterUserLocationPre").html(abstractLocation);
	$("#waterUserConstractorNamePre").html(abstractContractorName);
	$("#waterUserConstractorParishAddPre").html(abstractContractorAddress);
	$("#waterUserConstractorAddressPre").html(abstractWaterContractorAdd);
	$("#waterUserWaterSourcePre").html(abstractWaterSource);
	$("#waterUserPurposePre").html(abstractWaterPurpose);
	$("#waterUserAreaIrrigatedPre").html(abstractAreaIrrigated);
	$("#waterUserSystemIrrigationPre").html(abstractSystemIrrigation);
	$("#waterUserWasteWaterePre").html(abstractWasteWater);
	$("#waterUserBoreholeDepthPre").html(abstractBoreholeDepth);
	$("#waterUserWellBoreholePre").html(abstractDiameterBorehole);
	$("#waterUserSuppliesPre").html(abstractSuppliesLine);
	$("#waterUserGeologicalPre").html(abstractLimestone);
	$("#waterUserStateMethodPre").html(abstractWaterMethod);
	$("#waterUserCubicMetresPre").html(abstractWaterQuantity);
	$("#waterUserRecordingPre").html(abstractRecordingType);
	$("#waterUserTechnicalInfoPre").html(abstractTechnicalInformation);
	$("#waterUserWaterSupplyPre").html(abstractWaterCommission);
	$("#waterUserAccountInfoPre").html(abstractInformation);
	$("#waterUserSignPre").html(abstractSignDate);
}
</script>

