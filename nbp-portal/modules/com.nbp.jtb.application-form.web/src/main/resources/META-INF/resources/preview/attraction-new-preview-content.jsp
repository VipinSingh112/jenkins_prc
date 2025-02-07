<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<div class="attractionNewForm hide">
	<section id="jtbPreviewStep7" class="final-preview-section">
		<div class="accommodation-home-stay-preview-content">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Attraction Licence</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="attractionLicenceEditTab"> <svg width="19"
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
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Name of Owner/Director</p>
						<p class="sub_heading_content" id="newAttractionsTypeBox"></p>
					</div>
				</div> -->
				<div class="col-md-12">
					<p class="sub_heading">
						I <span class="giluio attractionsOwnerName"> </span> The Owner and <span class="giluio operatorName"> </span>
						the Operator/Manager of the Attraction <!-- <span
							class="giluio managerName"> </span> --> (hereinafter
						referred to as the Attraction) which is located at <span
							class="giluio locationAttraction"> </span> Mailing Address <span
							class="giluio mailingAddress"> </span> Tel. <span
							class="giluio telephoneAttractionNew"> </span> Email Address: <span
							class="giluio emailAddress"> </span> No. of Employees <span
							class="giluio employeesNo"> </span> In the Parish of <span
							class="giluio parishLoc"> </span> being the keeper of the
						Attraction, hereby apply for the grant of a licence to keep the
						Attraction in accordance with the provisions of Section 23 of the
						Tourist Board Act.

					</p>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="jtbPreviewStep8">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">General Declarations</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="attractionGeneralDeclarationEditTab"> <svg width="19"
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
                          <p class="sub_heading">I declare that - (indicate quantity where applicable) :-</p> 
                         </div>
				<div class="col-md-12">
					<p class="sub_heading">
						(a) the Attraction is owned by <span class="giluio ownerNameAttraction"> </span> 
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(b) <span class="giluio companyNameAttraction"> </span> a Company incorporated under the laws of on the <span class="giluio dateAttraction"> </span>
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(c) the <span class="giluio attractionName"> </span> has been operating since<span class="giluio datesinceAttraction"> </span>
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(d) the Attraction is situated on <span class="giluio attractionAcresLand"> </span> acres of land
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						(e) the Attraction offers the following activities <span class="giluio attractionOffers"> </span>
					</p>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading attraction-address-of-directors">The attached list shows the names and addresses of all the Directors of the operating company (if applicable)</p>
						<p><a class="sub_heading_content" id="attraction-address-of-directors-preview" href="<%=Validator.isNotNull(attarctionDirectUrl)? attarctionDirectUrl:""%>"><%=(Validator.isNotNull(attarctionDirect))?attarctionDirect:""%></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(attractionSignApp)) {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureAttractionImgHolderPreview">
						<img src="<%=attractionSignApp%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2"
						id="applicantSignatureAttractionImgHolderPreview"></div>
					<%
						}
					%>		
					
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="dateAttractionPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewAttractionLicenceDetailInfo() {
	attractionNewDate = $("#attractionNewDate").val();
	
	$("#dateAttractionPreview").html(attractionNewDate);
}
</script>

