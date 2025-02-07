<div class="row">
	<div class="col-md-8 mx-auto">
		<div class="final-submit-container hide">
			<div class="final-submit-img">
				<img src="<%=themeDisplay.getPathThemeImages()%>/popup.png" class="img-fluid hide" id="application_submitted-img" />
				<img src="<%=themeDisplay.getPathThemeImages()%>/failed-popup.png" class="img-fluid hide" id="application_draft-img" />
			</div>
			<div class="final-submit-content commonsavepopup">
				<div class="row">
					<div class="col-md-12 hide" id="submitted-content">
						<p class="modal-title f1">Application Submitted</p>
						<p class="modal-subtitle f2">Congratulations! Your application for the registration of an Institutional Healthcare Facility / Healthcare Facility has been submitted successfully.</p>
						<p class="modal-info f2">In the next months you will need to collaborate with the MOHW in order to move this application forward. You may be asked to provide additional or updated documentation.</p>
						<p class="modal-info f2">When this happens you will be able to track your application and collaborate with the MOHW in <a href="/group/guest/dashboard">your Dashboard:</a> </p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for the registration of an Institutional Healthcare Facility / Healthcare Facility has failed to be submitted to the MOHW.</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper mb-3">
							<div class="row">
								<div class="col-lg-5 d-flex justify-content-center">
									<div class="licence-box mr-2">
										<div class="left">
											<svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 220 220" fill="none">
												<path fill-rule="evenodd" clip-rule="evenodd" d="M110 107.707C113.797 107.707 116.875 110.785 116.875 114.582V121.457H123.75C127.547 121.457 130.625 124.535 130.625 128.332C130.625 132.129 127.547 135.207 123.75 135.207H116.875V142.082C116.875 145.879 113.797 148.957 110 148.957C106.203 148.957 103.125 145.879 103.125 142.082V135.207H96.25C92.4532 135.207 89.375 132.129 89.375 128.332C89.375 124.535 92.4532 121.457 96.25 121.457H103.125V114.582C103.125 110.785 106.203 107.707 110 107.707Z" fill="#047247"/>
												<path fill-rule="evenodd" clip-rule="evenodd" d="M109.523 11.457C101.287 11.4568 94.4191 11.4566 88.9669 12.1896C83.2122 12.9633 78.0165 14.6653 73.8414 18.8404C69.6662 23.0156 67.9643 28.2112 67.1905 33.966C66.4575 39.4181 66.4577 46.286 66.458 54.522V55.2345C47.9305 55.8407 36.8048 58.0056 29.0724 65.7382C18.333 76.4776 18.333 93.7627 18.333 128.332C18.333 162.901 18.333 180.187 29.0724 190.926C39.8118 201.665 57.0966 201.665 91.6662 201.665H128.333C162.902 201.665 180.188 201.665 190.927 190.926C201.666 180.187 201.666 162.901 201.666 128.332C201.666 93.7627 201.666 76.4776 190.927 65.7382C183.195 58.0056 172.069 55.8407 153.541 55.2345V54.5221C153.541 46.2862 153.542 39.4181 152.809 33.966C152.035 28.2112 150.333 23.0156 146.158 18.8404C141.983 14.6653 136.787 12.9633 131.033 12.1896C125.58 11.4566 118.713 11.4568 110.476 11.457H109.523ZM139.791 55.016V54.9987C139.791 46.1619 139.777 40.226 139.182 35.7982C138.613 31.5681 137.63 29.7577 136.435 28.5631C135.241 27.3685 133.431 26.3857 129.2 25.817C124.773 25.2217 118.836 25.207 110 25.207C101.163 25.207 95.2267 25.2217 90.7991 25.817C86.569 26.3857 84.7586 27.3685 83.5641 28.5631C82.3695 29.7577 81.3867 31.5681 80.818 35.7982C80.2226 40.226 80.208 46.1619 80.208 54.9987V55.016C83.8016 54.9987 87.6153 54.9987 91.6663 54.9987H128.333C132.384 54.9987 136.198 54.9987 139.791 55.016ZM146.666 128.332C146.666 148.582 130.25 164.999 110 164.999C89.7492 164.999 73.333 148.582 73.333 128.332C73.333 108.082 89.7492 91.6654 110 91.6654C130.25 91.6654 146.666 108.082 146.666 128.332Z" fill="#047247"/>
											</svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">Institutional Healthcare Facility / Healthcare Facility Application Transaction Number</p>
											<p class="licence-number f2" id="submit_pop_app_no"></p>
										</div>
									</div>
								</div>
								<div class="col-lg-4 d-flex justify-content-center">
									<div class="tier-box">
										<p class="tier-box-upper f2">Type/Category</p>
										<p class="tier-box-upper f2" id="submit_pop_category"><span ></span>/<span id="submit_pop_category_sub"></span></p>
									</div>
								</div>
								<div class="col-lg-3 d-flex justify-content-center">
									<div class="status-box">
										<p class="tier-box-upper f2">Status</p>
										<a href="javascript:void(0);" class="draftlink f2" id="submit_pop_status"></a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<div class="full-width-btn-wrapper hide" id="continueDashboardMedical">
							<a href="javascript:void(0);" class="details-btn"onclick="getSingleMedicalApplicationDashboard();">
								Continue to your application details page 
								<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
										<path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#BA8207" />
									</svg>
								</span>
							</a>
						</div>
					</div>

					<div class="col-md-12">
						<p class="modal-info f2">You will be notified at the following email address that you provided during your account registration:</p>
					</div>

					<div class="col-md-12">
						<div class="full-width-info-wrapper">
							<span><%=themeDisplay.getUser().getEmailAddress()%></span> 
						</div>
					</div>

					<div class="col-md-12">
						<div class="btn-group-wrapper mt-3">
							<div class="d-flex justify-content-between">
								<div>
									<a href="/home" class="text-dark common-nav-links text-white popup-home hidePopup">
										<span class="mr-2">
											<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
				                              <path d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z" fill="#282524" />
				                            </svg> 
				                       </span>Go back to the Homepage
									</a>
								</div>
								<div>
									<a href="/group/guest/dashboard" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
										Continue to your dashboard
										<span class="ml-2"> 
											<svg width="22" height="17" viewBox="0 0 22 17" fill="none" xmlns="http://www.w3.org/2000/svg">
			                                	<path d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z" fill="#1B1917" />
			                                	<path d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z" fill="#1B1917" />
			                                	<path d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z" fill="#323232" />
			                            	</svg>
										</span>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="custom_loader">
				<div class="loader">
					<div></div>
					<div></div>
					<div></div>
					<div></div>
					<div></div>
					<div></div>
					<div></div>
					<div></div>
					<div></div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
function getSingleMedicalApplicationDashboard(){
	medicalApplicationId=$("#medicalApplicationId").val();
	window.location.href = "/group/guest/medical-facilities-dashboard?medicalApplicationId="
			+ medicalApplicationId;
}
</script>

