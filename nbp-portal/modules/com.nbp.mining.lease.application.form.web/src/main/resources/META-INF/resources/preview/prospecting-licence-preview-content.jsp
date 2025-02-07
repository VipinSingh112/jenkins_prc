<%@page import="com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="../init.jsp" %>
<%
int directorDetailVal=1;
%>
<div class="mining-prospecting-licence-forms hide">
	<section id="miningPreviewStep2" class="final-preview-section">
		<div class="prospecting-Licence-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form No. 5</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="prospectingLicnecneEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
		                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
		                    </svg>
		                    </a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of applicant</p>
						<p class="sub_heading_content" id="applicantNameLicencePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">T.R.N./T.C.C. Number</p>
						<p class="sub_heading_content" id="trnNumberLicencePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Nationality of applicant</p>
						<p class="sub_heading_content" id="nationalityLicencePre"></p>
					</div>
				</div>
				<div class="col-12">
					<div class="row">
						<div class="col-12">
							<div>
								<p>Director Details</p>
							</div>
						</div>
						<div class="col-12 table-responsive">
							<table class="table table-bordered mb-3">
								<tbody class="adddirectorDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Name</th>
										<th class="sub_heading text-nowrap">Nationality</th>
										<th class="sub_heading text-nowrap">Body of persons or partnership</th>
									</tr>
									<%if(Validator.isNotNull(diretorDetailAdd)&&diretorDetailAdd.size()>0){
											for(MiningProspectingLicenseAdd directorDetails:diretorDetailAdd){ %>
											<tr class="director-detail-row<%=directorDetailVal%>">
											<td class="sub_heading_content text-nowrap companyDirectorName<%=directorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getName())?directorDetails.getName():""%></td>
											<td class="sub_heading_content text-nowrap companyDirectorNationality<%=directorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getNationality())?directorDetails.getNationality():""%></td>
											<td class="sub_heading_content text-nowrap companyDirectorPartnership<%=directorDetailVal%>">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getDirectorsOfCompany())?directorDetails.getDirectorsOfCompany():""%></td>
											<%-- <td> 
												<span> 
													<a href="javascript:void(0)" id="directorDetailEditTab" onclick="directorDetailEdit('<%=directorDetailVal%>');"> 
												        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
												         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
												        </svg>
												      </a> 
												  </span>
										     </td>
										     <td> 
												<span> 
													<a href="javascript:void(0)" id="directorDetailDeleteData" onclick="directorDetailDeleteData('<%=directorDetailVal%>');"> 
												        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
												        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
												        </svg>
												      </a> 
												  </span>
										     </td> --%>
										     <input type="hidden" id="directorDetailId<%=directorDetailVal%>" name="directorDetailId<%=directorDetailVal%>" value="<%=directorDetails.getMiningProspectingLicenseAddId()%>">
										</tr>
											<%directorDetailVal=directorDetailVal+1;
											}} %>
								</tbody>
							</table>
						</div>
					</div>
				</div>

				<div class="col-12">
					<div>
						<p class="sub_heading">Address in Jamaica at which notices,
							etc, may be served</p>
						<p class="sub_heading_content" id="applicantAddressLicencePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone No.(s)</p>
						<p class="sub_heading_content" id="telephoneLicencePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email address</p>
						<p class="sub_heading_content" id="emailLicencePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of applicant's Prospecting Right</p>
						<p class="sub_heading_content" id="applicantProspectingPre"></p>
					</div>
				</div>
				<div class="col-12 mx-3">
					<div class="row">
						<p class="sub_heading">If a Prospecting Right was held by an
							individual as agent for the applicant, name of that agent and
							number of this Prospecting Right</p>
						<div class="col-6 px-0">
							<p class="sub_heading_content" id="agentNamePre"></p>

						</div>
						<div class="col-6 px-0">
							<p class="sub_heading_content" id="prospectingRightNumberPre"></p>
						</div>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Name of that agent</p>
						<p class="sub_heading_content" id="agentNamePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of this Prospecting Right</p>
						<p class="sub_heading_content" id="prospectingRightNumberPre"></p>
					</div>
				</div> -->
				<div class="col-12">
					<div>
						<p class="sub_heading">If no Prospecting Right is held by the
							applicant or his agent, the special Circumstances in which he is
							asking for the grant of the</p>
						<p class="sub_heading_content" id="applicantCircumstancesPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Licence</p>
						<p class="sub_heading_content" id="applicantLicencePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="applicantParishLicPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">State the nearest Landmark</p>
						<p class="sub_heading_content" id="applicantLandmarkPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Approximate area (in square
							kilometres)</p>
						<p class="sub_heading_content" id="approximateAreaPre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mineral for which applicant desires to
							prospect</p>
						<p class="sub_heading_content" id="desiresProspectPre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading detail-operating"></p>
						<p><a class="sub_heading_content" id="detail-operating-preview"></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Is a copy of the Articles of
							Incorporation lodged with the Commissioner</p>
						<p class="sub_heading_content" id="incorporationlodgComPre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading copy-herewith"></p>
						<p><a class="sub_heading_content" id="copy-herewith-preview"></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading fee-attachment"></p>
						<p><a class="sub_heading_content" id="fee-attachment-preview"></a></p>
					</div>
				</div>
				<!-- <div class="row hide" id="otherCopyPre">
					<div class="col-6">
						<div>
							<p class="sub_heading">If not, a copy must be enclosed
								herewith</p>
							<p class="sub_heading_content" id="copyEnclosedPre"></p>
						</div>
					</div>
				</div> -->
				<div class="col-6">
					<div>
						<p class="sub_heading">The date upon which the location beacon
							was erected was</p>
						<p class="sub_heading_content" id="locationDatePre"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section id="miningPreviewStep3" class="final-preview-section">
		<div class="prospecting-Licence-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Delineation of Area</p>
						<span class="ml-3"> 
							<a href="javascript:void(0)" id="prospectingLicnecneDelineationEditTab">
							<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
		                       	<path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247" />
		                    </svg>
		                    </a>
						</span>
					</div>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						An area of approximately <span class="sub_heading_content locArea"> </span>
						square kilometres.
					</p>
					<p class="sub_heading">
						The location beacon consists of <span class="sub_heading_content locBeacon">
						</span> and is situated approximately at the intersection of false
						co-ordinates <span class="sub_heading_content co-ordinates"> </span> North <span
							class="sub_heading_content north"> </span> East on sheet <span
							class="sub_heading_content eastOn"> </span> of the topographical map of
						Jamaica.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						The first corner is situated approximately at the
						intersection of the false coordinate
					</p>
					<p class="sub_heading">
						<span class="sub_heading_content north1"> </span> North and <span
							class="sub_heading_content eastApproximate"> </span> East approximately <span
							class="sub_heading_content locGridbe"> </span> metres from the location beacon
						on an approximate grid bearing of <span
							class="sub_heading_content bearingDegrees"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						The <span>Second corner</span> is situated approximately at the
						intersection of the false co- ordinates
					</p>
					<p class="sub_heading">
						<span class="sub_heading_content northSecond"> </span> North and <span
							class="sub_heading_content eastSecond"> </span> East approximately <span
							class="sub_heading_content locationSecond"> </span> metres from the first
						corner on an approximate grid bearing of <span
							class="sub_heading_content degreesSec"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						The <span>Third corner</span> is situated approximately at the
						intersection of the false co-ordinates <span
							class="sub_heading_content thirdCorner"> </span>
					</p>
					<p class="sub_heading">
						North and <span class="sub_heading_content thirdNorth"> </span> East
						approximately <span class="sub_heading_content thirdEastApp"> </span> metres
						from the second corner on an approximate grid bearing of <span
							class="sub_heading_content degreesThird"> </span> degrees and is <span
							class="sub_heading_content locationThird"> </span> metres to the location
						beacon on an approximate grid bearing of <span
							class="sub_heading_content gridThird"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						The <span>fourth corner</span> is situated approximately at the
						intersection of the false co-ordinates <span
							class="sub_heading_content coordinatesFourth"> </span>
					</p>
					<p class="sub_heading">
						North and <span class="sub_heading_content northFourth"> </span> East
						approximately <span class="sub_heading_content eastFourth"> </span>  metres from the second corner on an
									approximate grid bearing of <span class="sub_heading_content approximateFourth"> </span> degrees and
									is <span class="sub_heading_content gridFourth"> </span> metres to the location beacon on an
									approximate grid bearing of <span class="sub_heading_content degreeFourth"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						The <span>fifth corner</span> is situated approximately at the
						intersection of the false co-ordinates <span
							class="sub_heading_content coordinatesFifth"> </span>
					</p>
					<p class="sub_heading">
						North and <span class="sub_heading_content northFifth"> </span> East
						approximately <span class="sub_heading_content eastFifth"> </span> metres from
						the second corner on an approximate grid bearing of <span
							class="sub_heading_content gridBeFifth"> </span> degrees and is <span
							class="sub_heading_content degreesFifth"> </span> metres to the location
						beacon on an approximate grid bearing of <span
							class="sub_heading_content cornerFifth"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<%
						if (Validator.isNotNull(signLicUrl)) {
					%>
					<div class="signature_texarea mb-2" id="applicantSignatureImageLicencePre">
					<img src="<%=signLicUrl%>" class="thumb-image"
							style="height: 100px; width: 100px;">
					</div>
					<%
						} else {
					%>
					<div class="signature_texarea mb-2" id="applicantSignatureImageLicencePre">
					</div>
					<%
						}
					%>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
function previewProspectingLicenceDetailInfo() {
	applicantNameLicence = $("#applicantNameLicence").val();
	trnNumberLicence = $("#trnNumberLicence").val();
	applicantNationalityLicence = $("#applicantNationalityLicence").val();
	
	applicantAddressLicence = $("#applicantAddressLicence").val();
	applicantTelephoneLicence = $("#applicantTelephoneLicence").val();
	applicantEmailLicence = $("#applicantEmailLicence").val();
	applicantNumberLicence = $("#applicantNumberLicence").val();
	agentNameLicence = $("#agentNameLicence").val();
	numProspectingLicence = $("#numProspectingLicence").val();
	agentNameLicenceGrant = $("#agentNameLicenceGrant").val();
	applicantLicence = $("#applicantLicence").val();
	justicePeaceParish = $("#justicePeaceParish").val();
	applicantLandmarkLicence = $("#applicantLandmarkLicence").val();
	applicantAreaLicence = $("#applicantAreaLicence").val();
	applicantDesires = $("#applicantDesires").val();
	incorporationLodged=$("input[name='incorporationLodged']:checked").val();
	licenceCopyEnclosed = $("#licenceCopyEnclosed").val();
	dateLocationLic = $("#dateLocationLic").val();
	
	
	$("#applicantNameLicencePre").html(applicantNameLicence);
	$("#trnNumberLicencePre").html(trnNumberLicence);
	$("#nationalityLicencePre").html(applicantNationalityLicence);
	
	$("#applicantAddressLicencePre").html(applicantAddressLicence);
	$("#telephoneLicencePre").html(applicantTelephoneLicence);
	$("#emailLicencePre").html(applicantEmailLicence);
	$("#applicantProspectingPre").html(applicantNumberLicence);
	$("#agentNamePre").html(agentNameLicence);
	$("#prospectingRightNumberPre").html(numProspectingLicence);
	$("#applicantCircumstancesPre").html(agentNameLicenceGrant);
	$("#applicantLicencePre").html(applicantLicence);
	$("#applicantParishLicPre").html(justicePeaceParish);
	$("#applicantLandmarkPre").html(applicantLandmarkLicence);
	$("#approximateAreaPre").html(applicantAreaLicence);
	$("#desiresProspectPre").html(applicantDesires);
	$("#incorporationlodgComPre").html(incorporationLodged);
	$("#copyEnclosedPre").html(licenceCopyEnclosed);
	$("#locationDatePre").html(dateLocationLic);
	
}
</script>