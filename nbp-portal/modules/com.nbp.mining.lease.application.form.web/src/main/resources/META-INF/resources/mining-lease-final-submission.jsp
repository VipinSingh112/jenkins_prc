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
						<p class="modal-subtitle f2">Congratulations! Your application for a <span id="submitted-status"></span> has been submitted successfully.</p>
						<p class="modal-info f2">In the next months you will need to collaborate with the MGD in order to move this application forward. You may be asked to provide additional or updated documentation.</p>
						<p class="modal-info f2">When this happens you will be able to track your application and collaborate with the Mining Lease in <a href="/group/guest/dashboard">your Dashboard:</a> </p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for Mining Lease has failed to be submitted to</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper mb-3">
							<div class="row">
								<div class="col-lg-5 d-flex justify-content-center">
									<div class="licence-box mr-2">
										<div class="left">
											<svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 220 220" fill="none"> 
			                                     <path d="M144.375 144.375H75.625C56.375 144.375 41.25 159.5 41.25 178.75V199.375C41.25 202.812 44.6875 206.25 48.125 206.25H171.875C175.312 206.25 178.75 202.812 178.75 199.375V178.75C178.75 159.5 163.625 144.375 144.375 144.375ZM108.625 178.75L99.6875 158.125H114.813L108.625 178.75ZM110 13.75C106.562 13.75 103.125 17.1875 103.125 20.625V28.1875C79.75 31.625 61.875 51.5625 61.875 75.625V82.5C58.4375 82.5 55 85.9375 55 89.375C55 92.8125 58.4375 96.25 61.875 96.25H69.4375C72.875 115.5 89.375 130.625 110 130.625C130.625 130.625 147.125 115.5 150.562 96.25H158.125C161.562 96.25 165 92.8125 165 89.375C165 85.9375 161.562 82.5 158.125 82.5V75.625C158.125 51.5625 140.25 31.625 116.875 28.1875V20.625C116.875 17.1875 113.438 13.75 110 13.75ZM105.188 57.0625C107.938 54.3125 112.063 54.3125 114.813 57.0625C116.188 58.4375 116.875 59.8125 116.875 61.875C116.875 63.9375 116.188 65.3125 114.813 66.6875C113.438 68.0625 112.063 68.75 110 68.75C107.937 68.75 106.563 68.0625 105.188 66.6875C103.813 65.3125 103.125 63.9375 103.125 61.875C103.125 59.8125 103.813 58.4375 105.188 57.0625ZM136.812 96.25C133.375 107.938 123.062 116.875 110 116.875C96.9375 116.875 86.625 107.938 83.1875 96.25H136.812Z" fill="#047247"></path> 
			                                </svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">Mining Lease Application Transaction Number</p>
											<p class="licence-number f2" id="submit_pop_app_no"></p>
										</div>
									</div>
								</div>
								<div class="col-lg-4 d-flex justify-content-center">
									<div class="tier-box">
										<p class="tier-box-upper f2">Type of Application</p>
										<p class="tier-box-upper f2" id="submit_pop_category"></p>
									</div>
								</div>
								<div class="col-lg-3 d-flex justify-content-center">
									<div class="status-box">
										<p class="tier-box-upper f2">Status</p>
										<a href="javascript:void(0);" class="draftlink f2" id="submit_pop_status">submitted</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<div class="full-width-btn-wrapper hide" id="continueDashboardMiningLease">
							<a href="javascript:void(0);" class="details-btn"onclick="getSingleMiningApplicationDashboard();">
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
function getSingleMiningApplicationDashboard() {
	miningLeaseApplicationId=$("#miningLeaseApplicationId").val();
	window.location.href = "/group/guest/mining-dashboard?miningApplicationId="
			+ miningLeaseApplicationId;
}
</script>