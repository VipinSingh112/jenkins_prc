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
						<p class="modal-subtitle f2">Congratulations! Your application for an  <span  id="tpdcoSubmitCategory"></span> was submitted successfully.</p>
						<p class="modal-info f2">In the next months you will need to collaborate with the TPDCo in order to move this application forward. You may be asked to provide additional or updated documentation.</p>
						<p class="modal-info f2">When this happens you will be able to track your application and collaborate with the TPDCo in <a href="/group/guest/dashboard">your Dashboard:</a> </p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for Jamaica Tourist Board has failed to be submitted to the TPDCo.</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper mb-3">
							<div class="row">
								<div class="col-lg-5 d-flex justify-content-center">
									<div class="licence-box mr-2">
										<div class="left">
											<svg width="32" height="40" viewBox="0 0 220 220"
												fill="none" xmlns="http://www.w3.org/2000/svg">
                                                  <path
													d="M16.3281 55.9883V66.2148C21.0117 66.2148 24.793 69.9961 24.793 74.6797C24.793 79.3633 21.0117 83.1445 16.3281 83.1445V89.8047C21.0117 89.8047 24.793 93.5859 24.793 98.2695C24.793 102.953 21.0117 106.734 16.3281 106.734V113.395C21.0117 113.395 24.793 117.176 24.793 121.859C24.793 126.543 21.0117 130.324 16.3281 130.324V136.984C21.0117 136.984 24.793 140.766 24.793 145.449C24.793 150.133 21.0117 153.914 16.3281 153.914V164.141H203.672V55.9883H16.3281ZM78.2031 147.812H46.2773C44.6016 147.812 43.2695 146.48 43.2695 144.805C43.2695 143.129 44.6016 141.797 46.2773 141.797H78.2031C79.8789 141.797 81.2109 143.129 81.2109 144.805C81.2109 146.48 79.8789 147.812 78.2031 147.812ZM78.2031 124.609H46.2773C44.6016 124.609 43.2695 123.277 43.2695 121.602C43.2695 119.926 44.6016 118.594 46.2773 118.594H78.2031C79.8789 118.594 81.2109 119.926 81.2109 121.602C81.2109 123.277 79.8789 124.609 78.2031 124.609ZM78.2031 101.406H46.2773C44.6016 101.406 43.2695 100.074 43.2695 98.3984C43.2695 96.7227 44.6016 95.3906 46.2773 95.3906H78.2031C79.8789 95.3906 81.2109 96.7227 81.2109 98.3984C81.2109 100.074 79.8789 101.406 78.2031 101.406ZM78.2031 78.2031H46.2773C44.6016 78.2031 43.2695 76.8711 43.2695 75.1953C43.2695 73.5195 44.6016 72.1875 46.2773 72.1875H78.2031C79.8789 72.1875 81.2109 73.5195 81.2109 75.1953C81.2109 76.8711 79.8789 78.2031 78.2031 78.2031ZM101.836 152.109C101.836 153.785 100.504 155.117 98.8281 155.117C97.1523 155.117 95.8203 153.785 95.8203 152.109V137.543C95.8203 135.867 97.1523 134.535 98.8281 134.535C100.504 134.535 101.836 135.867 101.836 137.543V152.109ZM101.836 128.906C101.836 130.582 100.504 131.914 98.8281 131.914C97.1523 131.914 95.8203 130.582 95.8203 128.906V114.34C95.8203 112.664 97.1523 111.332 98.8281 111.332C100.504 111.332 101.836 112.664 101.836 114.34V128.906ZM101.836 105.66C101.836 107.336 100.504 108.668 98.8281 108.668C97.1523 108.668 95.8203 107.336 95.8203 105.66V91.0937C95.8203 89.418 97.1523 88.0859 98.8281 88.0859C100.504 88.0859 101.836 89.418 101.836 91.0937V105.66ZM101.836 82.457C101.836 84.1328 100.504 85.4648 98.8281 85.4648C97.1523 85.4648 95.8203 84.1328 95.8203 82.457V67.8906C95.8203 66.2148 97.1523 64.8828 98.8281 64.8828C100.504 64.8828 101.836 66.2148 101.836 67.8906V82.457ZM187.387 80.6523L186.57 89.2461C186.398 90.9219 185.582 92.5117 184.25 93.5859L175.613 100.719L187.215 130.496L181.113 136.598L158.984 114.469L147.898 123.621L153.527 143.344L150.477 146.395L136.082 132C134.191 132.215 132.215 131.613 130.797 130.152C129.336 128.734 128.734 126.758 128.949 124.867L114.555 110.473L117.605 107.422L137.328 113.051L146.48 101.965L124.352 79.8359L130.453 73.7344L160.23 85.3359L167.363 76.7422C168.438 75.4102 170.027 74.5938 171.703 74.4648L180.297 73.6484C184.379 73.2617 187.73 76.6133 187.387 80.6523Z"
													fill="#047247" />
                                            </svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">TPDCo Application Transaction Number</p>
											<p class="licence-number f2" id="submit_pop_app_no"></p>
										</div>
									</div>
								</div>
								<div class="col-lg-4 d-flex justify-content-center">
									<div class="tier-box">
										<p class="tier-box-upper f2">Sub Category</p>
										<p class="tier-box-upper f2" id="submit_pop_category"></p>
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
						<div class="full-width-btn-wrapper hide" id="continueDashboardJtb">
							<a href="javascript:void(0);" class="details-btn"onclick="getSingleJTBApplicationDashboard();">
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
function getSingleJTBApplicationDashboard() {
	jtbApplicationId=$("#jtbApplicationId").val();
	window.location.href = "/group/guest/jtb-dashboard?jtbApplicationId="
			+ jtbApplicationId;
}
</script>