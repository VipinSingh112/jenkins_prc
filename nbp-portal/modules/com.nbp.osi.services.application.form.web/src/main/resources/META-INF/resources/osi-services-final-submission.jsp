<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
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
						<p class="modal-subtitle f2">Congratulations! Your application for a <span  id="osiSerSubmitCategory"></span> has been submitted successfully.</p>
						<p class="modal-info f2">In the next months you will need to collaborate with the OSI in order to move this application forward. You may be asked to provide additional or updated documentation.</p>
						<p class="modal-info f2">When this happens you will be able to track your application and collaborate with the OSI in <a href="/group/guest/dashboard">your Dashboard:</a> </p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for Trustee Licence has failed to be submitted to the OSI.</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
						<!-- <p class="modal-info f2">When this happens you will be able to track your application and collaborate with the MOAF in <a href="/group/guest/dashboard">your Dashboard:</a> </p> -->
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper mb-3">
							<div class="row">
								<div class="col-lg-4 d-flex align-items-center">
									<div class="licence-box mr-2 ml-2">
										<div class="left">
											<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 122 122" fill="none">
												<path d="M109.246 26.6875H63.1445V14.8711C63.1454 13.888 62.9524 12.9143 62.5766 12.0058C62.2007 11.0973 61.6494 10.2719 60.9542 9.57669C60.259 8.88151 59.4335 8.33026 58.525 7.95448C57.6165 7.5787 56.6428 7.38576 55.6596 7.38672H14.8706C13.8875 7.38587 12.9139 7.57889 12.0055 7.95472C11.0971 8.33055 10.2717 8.88183 9.57661 9.577C8.88149 10.2722 8.33028 11.0976 7.95451 12.006C7.57874 12.9144 7.3858 13.8881 7.38672 14.8711V107.129C7.38848 109.113 8.17751 111.016 9.58061 112.419C10.9837 113.822 12.8862 114.611 14.8706 114.613H55.6596C57.6441 114.612 59.5469 113.823 60.9502 112.419C62.3535 111.016 63.1427 109.113 63.1445 107.129V69.5781H109.246C110.67 69.5781 112.035 69.0127 113.041 68.0062C114.048 66.9998 114.613 65.6347 114.613 64.2113V32.055C114.613 31.3501 114.474 30.6522 114.205 30.0009C113.935 29.3497 113.54 28.758 113.041 28.2596C112.543 27.7612 111.951 27.3658 111.3 27.0961C110.649 26.8263 109.951 26.6875 109.246 26.6875ZM29.9043 11.9331H40.627C41.3379 11.9331 42.0198 12.2156 42.5225 12.7183C43.0252 13.221 43.3076 13.9028 43.3076 14.6138C43.3076 15.3247 43.0252 16.0066 42.5225 16.5093C42.0198 17.012 41.3379 17.2945 40.627 17.2945H29.9043C29.1933 17.2945 28.5115 17.012 28.0088 16.5093C27.5061 16.0066 27.2236 15.3247 27.2236 14.6138C27.2236 13.9028 27.5061 13.221 28.0088 12.7183C28.5115 12.2156 29.1933 11.9331 29.9043 11.9331ZM40.6259 110.049H29.9033C29.1923 110.049 28.5105 109.767 28.0077 109.264C27.505 108.761 27.2226 108.079 27.2226 107.368C27.2226 106.657 27.505 105.976 28.0077 105.473C28.5105 104.97 29.1923 104.688 29.9033 104.688H40.6259C41.3369 104.688 42.0187 104.97 42.5214 105.473C43.0241 105.976 43.3066 106.657 43.3066 107.368C43.3066 108.079 43.0241 108.761 42.5214 109.264C42.0187 109.767 41.3369 110.049 40.6259 110.049ZM58.4261 100.138H12.1041V21.8623H58.4261V26.6875H29.8602C28.45 26.6875 27.0975 27.2477 26.1004 28.2449C25.1032 29.2421 24.543 30.5945 24.543 32.0047V64.2559C24.543 64.9548 24.6806 65.6469 24.9481 66.2926C25.2156 66.9384 25.6076 67.5251 26.1018 68.0193C26.596 68.5135 27.1827 68.9055 27.8285 69.173C28.4742 69.4405 29.1663 69.5781 29.8652 69.5781H39.5547V78.1917C39.5547 78.7159 39.7101 79.2283 40.0013 79.6641C40.2926 80.0999 40.7065 80.4396 41.1907 80.6402C41.675 80.8408 42.2079 80.8932 42.722 80.791C43.236 80.6887 43.7083 80.4363 44.0789 80.0656L54.5664 69.5781H58.4261V100.138ZM52.6145 50.0843C53.2297 50.4416 53.6787 51.0276 53.8635 51.7146C54.0483 52.4016 53.9539 53.1338 53.6009 53.7515C53.4266 54.0587 53.1929 54.3283 52.9136 54.5445C52.6342 54.7607 52.3147 54.9193 51.9735 55.0111C51.6324 55.1029 51.2764 55.126 50.9263 55.0791C50.5761 55.0322 50.2388 54.9163 49.9338 54.738L46.5244 52.765V56.7109C46.5244 57.4219 46.242 58.1037 45.7393 58.6065C45.2365 59.1092 44.5547 59.3916 43.8438 59.3916C43.1328 59.3916 42.451 59.1092 41.9482 58.6065C41.4455 58.1037 41.1631 57.4219 41.1631 56.7109V52.765L37.7526 54.738C37.4476 54.9163 37.1102 55.0322 36.7601 55.0791C36.41 55.126 36.054 55.1029 35.7128 55.0111C35.3717 54.9193 35.0522 54.7607 34.7728 54.5445C34.4934 54.3283 34.2598 54.0587 34.0854 53.7515C33.733 53.1337 33.6389 52.4017 33.8236 51.7148C34.0084 51.028 34.4571 50.4419 35.0719 50.0843L38.4824 48.1328L35.0719 46.1598C34.4548 45.8044 34.0042 45.2183 33.8192 44.5306C33.6342 43.8429 33.73 43.1099 34.0855 42.4928C34.441 41.8757 35.027 41.4251 35.7147 41.2401C36.4025 41.0551 37.1355 41.1509 37.7526 41.5064L41.1631 43.4792V39.5547C41.1631 38.8437 41.4455 38.1619 41.9482 37.6592C42.451 37.1565 43.1328 36.874 43.8438 36.874C44.5547 36.874 45.2365 37.1565 45.7393 37.6592C46.242 38.1619 46.5244 38.8437 46.5244 39.5547V43.4792L49.9339 41.5064C50.551 41.1509 51.284 41.0551 51.9717 41.2401C52.6594 41.4251 53.2455 41.8757 53.601 42.4928C53.9564 43.1099 54.0522 43.8429 53.8672 44.5306C53.6822 45.2183 53.2316 45.8044 52.6146 46.1598L49.2051 48.1328L52.6145 50.0843ZM78.3488 50.0843C78.964 50.4416 79.413 51.0276 79.5978 51.7146C79.7826 52.4016 79.6883 53.1338 79.3353 53.7515C79.1609 54.0587 78.9273 54.3283 78.6479 54.5445C78.3686 54.7607 78.049 54.9193 77.7079 55.0111C77.3668 55.1029 77.0108 55.126 76.6606 55.0791C76.3105 55.0322 75.9731 54.9163 75.6682 54.738L72.2588 52.765V56.7109C72.2588 57.4219 71.9764 58.1037 71.4736 58.6065C70.9709 59.1092 70.2891 59.3916 69.5781 59.3916C68.8672 59.3916 68.1853 59.1092 67.6826 58.6065C67.1799 58.1037 66.8975 57.4219 66.8975 56.7109V52.765L63.4869 54.738C63.182 54.9163 62.8446 55.0322 62.4945 55.0791C62.1443 55.126 61.7884 55.1029 61.4472 55.0111C61.1061 54.9193 60.7866 54.7607 60.5072 54.5445C60.2278 54.3283 59.9942 54.0587 59.8198 53.7515C59.4673 53.1337 59.3732 52.4017 59.558 51.7148C59.7428 51.028 60.1914 50.4419 60.8063 50.0843L64.2168 48.1328L60.8063 46.1598C60.1892 45.8044 59.7386 45.2183 59.5536 44.5306C59.3686 43.8429 59.4644 43.1099 59.8199 42.4928C60.1754 41.8757 60.7614 41.4251 61.4491 41.2401C62.1368 41.0551 62.8699 41.1509 63.4869 41.5064L66.8975 43.4792V39.5547C66.8975 38.8437 67.1799 38.1619 67.6826 37.6592C68.1853 37.1565 68.8672 36.874 69.5781 36.874C70.2891 36.874 70.9709 37.1565 71.4736 37.6592C71.9764 38.1619 72.2588 38.8437 72.2588 39.5547V43.4792L75.6683 41.5064C76.2853 41.1509 77.0184 41.0551 77.7061 41.2401C78.3938 41.4251 78.9798 41.8757 79.3353 42.4928C79.6908 43.1099 79.7866 43.8429 79.6016 44.5306C79.4166 45.2183 78.966 45.8044 78.3489 46.1598L74.9395 48.1328L78.3488 50.0843ZM104.083 50.0843C104.698 50.4416 105.147 51.0276 105.332 51.7146C105.517 52.4016 105.423 53.1338 105.07 53.7515C104.895 54.0587 104.662 54.3283 104.382 54.5445C104.103 54.7607 103.783 54.9193 103.442 55.0111C103.101 55.1029 102.745 55.126 102.395 55.0791C102.045 55.0322 101.708 54.9163 101.403 54.738L97.9932 52.765V56.7109C97.9932 57.4219 97.7107 58.1037 97.208 58.6065C96.7053 59.1092 96.0235 59.3916 95.3125 59.3916C94.6015 59.3916 93.9197 59.1092 93.417 58.6065C92.9143 58.1037 92.6318 57.4219 92.6318 56.7109V52.765L89.2213 54.738C88.9163 54.9163 88.579 55.0322 88.2288 55.0791C87.8787 55.126 87.5227 55.1029 87.1816 55.0111C86.8404 54.9193 86.5209 54.7607 86.2416 54.5445C85.9622 54.3283 85.7285 54.0587 85.5542 53.7515C85.2017 53.1337 85.1076 52.4017 85.2924 51.7148C85.4772 51.028 85.9258 50.4419 86.5407 50.0843L89.9512 48.1328L86.5407 46.1598C85.9236 45.8044 85.473 45.2183 85.288 44.5306C85.103 43.8429 85.1988 43.1099 85.5543 42.4928C85.9097 41.8757 86.4958 41.4251 87.1835 41.2401C87.8712 41.0551 88.6042 41.1509 89.2213 41.5064L92.6318 43.4792V39.5547C92.6318 38.8437 92.9143 38.1619 93.417 37.6592C93.9197 37.1565 94.6015 36.874 95.3125 36.874C96.0235 36.874 96.7053 37.1565 97.208 37.6592C97.7107 38.1619 97.9932 38.8437 97.9932 39.5547V43.4792L101.403 41.5064C101.708 41.3304 102.045 41.2163 102.395 41.1706C102.745 41.1249 103.1 41.1485 103.44 41.2401C103.781 41.3317 104.1 41.4895 104.38 41.7044C104.659 41.9193 104.894 42.1872 105.07 42.4928C105.246 42.7983 105.36 43.1356 105.406 43.4852C105.451 43.8349 105.428 44.1901 105.336 44.5306C105.244 44.8711 105.087 45.1903 104.872 45.4698C104.657 45.7494 104.389 45.9838 104.083 46.1598L100.674 48.1328L104.083 50.0843Z" fill="#047247"></path>
											</svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">OSI Services</p>
											<p class="licence-number f2" id="submit_pop_app_no"></p>
										</div>
									</div>
								</div>
								<div class="col-lg-4 d-flex justify-content-center">
									<div class="tier-box">
										<p class="tier-box-upper f2">Category</p>
										<p class="tier-box-upper f2" id="submit_pop_category"></p>
									</div>
								</div>
								<div class="col-lg-4 d-flex justify-content-center">
									<div class="status-box">
										<p class="tier-box-upper f2">Status</p>
										<a href="javascript:void(0);" class="draftlink f2" id="submit_pop_status"></a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<div class="full-width-btn-wrapper hide" id="continueDashboardOSIServices">
							<a href="javascript:void(0);" class="details-btn"onclick="getSingleOsiServiceApplicationDashboard();">
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
							<span><%=themeDisplay.getUser().getEmailAddress()%></span><!--  <a
								href="#">Change address</a> -->
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
									<a href="/group/guest/dashboard" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard">
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
function getSingleOsiServiceApplicationDashboard() {
	osiServiceApplicationId = $("#osiServicesApplicationId").val();
	window.location.href ="/group/guest/osi-service-dashboard?osiServiceApplicationId="
			+ osiServiceApplicationId;
}
</script>