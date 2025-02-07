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
						<p class="modal-subtitle f2">Congratulations! Your application for <span class="verification-type"></span> has been submitted successfully.</p>
						<p class="modal-info f2">In the next months you will need to collaborate with the NCRA in order to move this application forward. You may be asked to provide additional or updated documentation.</p>
						<p class="modal-info f2">When this happens you will be able to track your application and collaborate with the NCRA in <a href="/group/guest/dashboard">your Dashboard:</a> </p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for <span class="verification-type"></span> has failed to be submitted to the NCRA.</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
						<!-- <p class="modal-info f2">When this happens you will be able to track your application and collaborate with the MOAF in <a href="/group/guest/dashboard">your Dashboard:</a> </p> -->
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper mb-3">
							<div class="row">
								<div class="col-lg-4 d-flex align-items-center">
									<div class="licence-box mr-2 ml-2">
										<div class="left">
											<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 220 220" fill="none">
												<path d="M164.667 157.737H55.3333C51.7087 157.737 48.2325 159.173 45.6695 161.729C43.1065 164.286 41.6667 167.753 41.6667 171.368C41.6667 174.984 43.1065 178.451 45.6695 181.007C48.2325 183.564 51.7087 185 55.3333 185H164.667C168.291 185 171.767 183.564 174.33 181.007C176.893 178.451 178.333 174.984 178.333 171.368C178.333 167.753 176.893 164.286 174.33 161.729C171.767 159.173 168.291 157.737 164.667 157.737ZM178.333 69.1311C174.709 69.1311 171.233 70.5673 168.67 73.1237C166.107 75.6802 164.667 79.1474 164.667 82.7628C164.668 83.6992 164.764 84.6332 164.954 85.5504L140.135 100.416L119.218 58.6893C121.251 56.8346 122.674 54.4106 123.301 51.735C123.928 49.0595 123.73 46.2574 122.733 43.6961C121.735 41.1348 119.985 38.934 117.712 37.3822C115.438 35.8304 112.748 35 109.993 35C107.238 35 104.548 35.8304 102.275 37.3822C100.001 38.934 98.2512 41.1348 97.2538 43.6961C96.2564 46.2574 96.0582 49.0595 96.6854 51.735C97.3125 54.4106 98.7357 56.8346 100.768 58.6893L79.865 100.416L55.0463 85.5504C55.2358 84.6332 55.332 83.6992 55.3333 82.7628C55.3333 80.0667 54.5318 77.4311 53.0301 75.1894C51.5284 72.9477 49.3939 71.2005 46.8967 70.1688C44.3994 69.137 41.6515 68.8671 39.0004 69.3931C36.3494 69.919 33.9142 71.2173 32.0029 73.1237C30.0916 75.0302 28.7899 77.4591 28.2626 80.1034C27.7353 82.7476 28.0059 85.4885 29.0403 87.9794C30.0747 90.4702 31.8264 92.5992 34.0739 94.097C36.3214 95.5949 38.9637 96.3944 41.6667 96.3944C41.9195 96.3944 42.1518 96.333 42.3978 96.3194L47.68 144.105H172.32L177.602 96.3194C177.848 96.3194 178.081 96.3944 178.333 96.3944C181.958 96.3944 185.434 94.9582 187.997 92.4018C190.56 89.8453 192 86.3781 192 82.7628C192 79.1474 190.56 75.6802 187.997 73.1237C185.434 70.5673 181.958 69.1311 178.333 69.1311Z" fill="#047247"></path>
											</svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">NCRA Services</p>
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
						<div class="full-width-btn-wrapper hide"  id="continueDashboardNCRAStatus" >
							<a href="javascript:void(0);" class="details-btn" 
							onclick="getSingleNcraDashboard();">Continue to your application
								details page <span class="ml-2"> <svg width="16"
										height="16" viewBox="0 0 16 16" fill="none"
										xmlns="http://www.w3.org/2000/svg">
										<path
											d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z"
											fill="#BA8207" />
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
function getSingleNcraDashboard() {
	ncraApplicationId=$("#ncraApplicationId").val();
	window.location.href = "/group/guest/ncra-dashboard?ncraApplicationId="
			+ ncraApplicationId;
}
</script>