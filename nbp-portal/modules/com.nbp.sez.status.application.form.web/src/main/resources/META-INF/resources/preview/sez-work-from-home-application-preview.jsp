<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<div class="hide sezWorkFromHomeApplicationPreview">
	<section class="final-preview-section" id="sezPreview27">
		<div class="Work-from-home-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Work From Home</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="work-from-home-list-edit-tab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
								   <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
							</svg>
							</a>
						</span>
					</div>
				</div>
				<div class="col-6">
							<div>
								<p class="sub_heading">1. Company Name</p>
								<p class="sub_heading_content" id="companyNameWfhPreview"></p>
							</div>
						</div>
						<div class="col-6">
							<div>
								<p class="sub_heading">2. Contact Person's Name</p>
								<p class="sub_heading_content" id="contactPersonNameWfhPreview"></p>
							</div>
						</div>
						<div class="col-6">
							<div>
								<p class="sub_heading">3. Contact Person's Email</p>
								<p class="sub_heading_content" id="contactPersonEmailWfhPreview"></p>
							</div>
						</div>
						<div class="col-12">
							<div>
								<p class="sub_heading">4. Location</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="addWfhLocationDetailTable">
									<tr>
										<th class="sub_heading">Control Number</th>
										<th class="sub_heading">Location</th>
										<th class="sub_heading">Parish</th>
									</tr>
									<%if(wfhLocationAddData!=null){
	long workFromHomeCounter=1;
	for(SezStatusWFMLocationAdd wfhData:wfhLocationAddData){
%>							
<tr class="wfh-location-detail-row<%=workFromHomeCounter%>">
	<td class="sub_heading_content controlNumberWfh<%=workFromHomeCounter%>">
	<%=Validator.isNotNull(wfhData)&&Validator.isNotNull(wfhData.getControlNumber())?wfhData.getControlNumber():""%>
	</td>
	<td class="sub_heading_content controlNumberLocationWfh<%=workFromHomeCounter%>">
	<%=Validator.isNotNull(wfhData)&&Validator.isNotNull(wfhData.getLocation())?wfhData.getLocation():""%>
	</td>
	<td class="sub_heading_content controlNumberParishWfh<%=workFromHomeCounter%>">
	<%=Validator.isNotNull(wfhData)&&Validator.isNotNull(wfhData.getParish())?wfhData.getParish():""%>
	</td>
     <input type="hidden" id="wfhLocationDetailId<%=workFromHomeCounter%>" name="wfhLocationDetailId<%=workFromHomeCounter%>" value="<%=wfhData.getSezStatusWFHLocId()%>">
</tr>
	<%
	workFromHomeCounter++;
							}
 }
						%>										
									
								</tbody>
							</table>
						</div>
						<div class="col-12">
							<div>
								<p class="sub_heading">5. How many workers will be utillizing WFH incentive?</p>
							</div>
						</div>
			           	<div class="col-6">
							<div>
								<p class="sub_heading">Workers</p>
								<p class="sub_heading_content" id="workerUtillizingWFHPreview"></p>
							</div>
						</div>
						<div class="col-6">
							<div>
								<p class="sub_heading">Months</p>
								<p class="sub_heading_content" id="workerMonthsUtillizingWFHPreview"></p>
							</div>
						</div>
		</div>
		</div>
	</section>
</div>
<div id="sezCommonApplicationPreview">
	<section class="final-preview-section" id="sezPreview28">
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
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section fee-preview" id="sezPreview29">
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
</div>