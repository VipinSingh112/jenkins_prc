<%@ include file="../init.jsp" %>
<div class="miningLeaseFormPre hide">
	<section id="miningPreviewStep6" class="final-preview-section">
		<div class="mining-lease-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Form No.12</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="miningLeaseEditTab"> <svg width="19" height="19"
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
						<p class="sub_heading">Name of applicant</p>
						<p class="sub_heading_content" id="applicantNameLeasePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Nationality of applicant</p>
						<p class="sub_heading_content" id="nationalityLeasePre"></p>
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
								<tbody class="addMiningDirectorDetailTable">
									<tr>
										<th class="sub_heading text-nowrap">Name</th>
										<th class="sub_heading text-nowrap">Nationality</th>
										<th class="sub_heading text-nowrap">Body of persons or partnership</th>
									</tr>
									<%if(Validator.isNotNull(diretorDetailAdd)&&diretorDetailAdd.size()>0){
											for(MiningProspectingLicenseAdd directorDetails:diretorDetailAdd){ %>
											<tr class="mining-director-detail-row">
											<td class="sub_heading_content text-nowrap miningCompanyDirectorName">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getName())?directorDetails.getName():""%></td>
											<td class="sub_heading_content text-nowrap miningCompanyDirectorNationality">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getNationality())?directorDetails.getNationality():""%></td>
											<td class="sub_heading_content text-nowrap miningCompanyDirectorPartnership">
											<%=Validator.isNotNull(directorDetails)&&Validator.isNotNull(directorDetails.getDirectorsOfCompany())?directorDetails.getDirectorsOfCompany():""%></td>
								<%}
											}%></tbody>
							</table>
						</div>
					</div>
				</div>

				<div class="col-12">
					<div>
						<p class="sub_heading">Address in Jamaica at which notices,
							etc., may be served</p>
						<p class="sub_heading_content" id="applicantAddressLeasePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Number of applicant's prospecting right
							or licence</p>
						<p class="sub_heading_content" id="applicantNumberLeasePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="peaceParishLeasePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Area(in square kilometres)
							of the area applied for</p>
						<p class="sub_heading_content" id="appliedAreaLeasePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mineral for which the applicant desires
							to mine</p>
						<p class="sub_heading_content" id="desiresMineLeasePre"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Length of term desired</p>
						<p class="sub_heading_content" id="desiredTermLeasePre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading financial-statement"></p>
						<p><a class="sub_heading_content" id="financial-statement-preview"></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading commissionerCopy"></p>
						<p><a class="sub_heading_content" id="commissionerCopy-preview"></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">The date on which location beacon was
							erected was</p>
						<p class="sub_heading_content" id="dateLocationLeasePre"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading sketchPlan"></p>
						<p><a class="sub_heading_content" id="sketchPlan-preview"></a></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section id="miningPreviewStep7" class="final-preview-section">
		<div class="prospecting-Licence-preview-content ">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Delineation of Area</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							id="miningLeaseDelineationEditTab"> <svg width="19" height="19"
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
				<div class="col-md-12">
					<p class="sub_heading">
						An area of approximately <span class="sub_heading_content squareArea"> </span>
						square kilometres.
					</p>
					<p class="sub_heading">
						The location beacon consists of <span
							class="sub_heading_content beaconLocation"> </span> and is situated
						approximately at the intersection of false co-ordinates <span
							class="sub_heading_content coordinatesLease"> </span> North <span
							class="sub_heading_content northLease"> </span> East on sheet <span
							class="sub_heading_content eastLease"> </span> of the topographical map of
						Jamaica.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">The first corner is situated
						approximately at the intersection of the false coordinate</p>
					<p class="sub_heading">
						<span class="sub_heading_content northLea"> </span> North and <span
							class="sub_heading_content approximateEast"> </span> East approximately <span
							class="sub_heading_content locationGridAn"> </span> metres from the location
						beacon on an approximate grid bearing of <span
							class="sub_heading_content leaseDegreesFirst"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">The Second corner is situated
						approximately at the intersection of the false co- ordinates</p>
					<p class="sub_heading">
						<span class="sub_heading_content northSecondLease"> </span> North and <span
							class="sub_heading_content eastSecondLease"> </span> East approximately <span
							class="sub_heading_content locationSecondLease"> </span> metres from the first
						corner on an approximate grid bearing of <span
							class="sub_heading_content degreesSecLease"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">The Third corner is situated
						approximately at the intersection of the false co-ordinates</p>
					<p class="sub_heading">
						<span class="sub_heading_content thirdNorthLe"> </span> North and <span
							class="sub_heading_content thirdEastLe"> </span> East approximately <span
							class="sub_heading_content thirdGridLe"> </span> metres from the second corner
						on an approximate grid bearing of <span
							class="sub_heading_content degreesThirdLease"> </span> degrees and is <span
							class="sub_heading_content locationThirdIs"> </span> metres to the location
						beacon on an approximate grid bearing of <span
							class="sub_heading_content ThirdDeLease"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">The fourth corner is situated
						approximately at the intersection of the false co-ordinates</p>
					<p class="sub_heading">
						<span class="sub_heading_content coordinatesFourthLe"> </span> North and <span
							class="sub_heading_content northFourthLea"> </span> East approximately <span
							class="sub_heading_content eastFourthLea"> </span> metres from the third
						corner on an approximate grid bearing of <span
							class="sub_heading_content approximateFourthLea"> </span> degrees and is <span
							class="sub_heading_content gridLocFourth"> </span> metres to the location
						beacon on an approximate grid bearing of <span
							class="sub_heading_content degreeFourthLea"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="sub_heading">
						The <span>fifth corner</span> is situated approximately at the
						intersection of the false co-ordinates
					</p>
					<p class="sub_heading">
						<span class="sub_heading_content coordinatFifthAt"> </span> North and <span
							class="sub_heading_content northLeaseFifth"> </span> East approximately <span
							class="sub_heading_content eastFifthCon"> </span> metres from the forth corner
						on an approximate grid bearing of<span
							class="sub_heading_content gridBearingFifth"> </span> degrees and is <span
							class="sub_heading_content degreesIsFifth"> </span> metres to the location
						beacon on an approximate grid bearing of <span
							class="sub_heading_content cornerAppFifth"> </span> degrees.
					</p>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Applicant</p>
					<div class="signature_texarea mb-2"
						id="applicantSignatureImageLeasePre">
					<%if(Validator.isNotNull(signLeaseUrl)){ %>
							<img src="<%=signLeaseUrl%>"  width="100" height="100"/>
							<%} %>	
						
						</div>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
	function previewMiningLeaseDetailInfo() {
		applicantNameLease = $("#applicantNameLease").val();
		applicantNationalityLease = $("#applicantNationalityLease").val();

		applicantAddressLease = $("#applicantAddressLease").val();
		applicantNumberLease = $("#applicantNumberLease").val();
		justicePeaceParishLease = $("#justicePeaceParishLease").val();
		applicantLeaseArea = $("#applicantLeaseArea").val();
		applicantLeaseDesires = $("#applicantLeaseDesires").val();
		applicantLenghtLease = $("#applicantLenghtLease").val();
		applicantDateLocation = $("#applicantDateLocation").val();

		$("#applicantNameLeasePre").html(applicantNameLease);
		$("#nationalityLeasePre").html(applicantNationalityLease);

		$("#applicantAddressLeasePre").html(applicantAddressLease);
		$("#applicantNumberLeasePre").html(applicantNumberLease);
		$("#appliedAreaLeasePre").html(applicantLeaseArea);
		$("#peaceParishLeasePre").html(justicePeaceParishLease);
		$("#desiresMineLeasePre").html(applicantLeaseDesires);
		$("#desiredTermLeasePre").html(applicantLenghtLease);
		$("#dateLocationLeasePre").html(applicantDateLocation);
	}
</script>