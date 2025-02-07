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
							<img src="<%=themeDisplay.getPathThemeImages()%>/popup.png" class="img-fluid" id="application_submitted-img" />
				            <img src="<%=themeDisplay.getPathThemeImages()%>/failed-popup.png" class="img-fluid hide" id="application_draft-img" /> 
			</div>
			<div class="final-submit-content commonsavepopup">
				<div class="row">
						<div class="col-md-12 hide" id="submitted-content">
						<p class="modal-title f1">Application Submitted</p>
						<p class="modal-subtitle f2">Congratulations! Your application for a <span id="submitted-status"></span> has been correctly submitted.</p>
						<p class="modal-info f2">
							In the next months you will need to collaborate with the JSEZA in order to move this application forward. You may be asked to provide additional or updated documentation.
						</p>
						<p class="modal-info f2">
							When this happens you will be able to track your application and collaborate with the SEZ Status in <a href="/group/guest/dashboard">your Dashboard:</a>
						</p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for SEZ Status has failed to be submitted to the JSEZA.</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper">
							<div class="row">
								<div class="col-lg-6 d-flex align-items-center">
									<div class="licence-box mr-2 ml-2">
										<div class="left">
												<svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" viewBox="0 0 90 90" fill="none">
												<path opacity="0.3" d="M38 61.96V16.4L42.7458 13.68H63.0847L74.6102 13L78 19.8V42.24V50.4V55.84L74.6102 64H44.1017L38 61.96Z" fill="#0C8D5A"></path>
												<path opacity="0.3" d="M12 74.3333V29.6667L16.7419 27H37.0645L39.0968 52.3333V59L41.129 62.3333H54V69.6667L49.2581 77.6667L16.7419 79L12 74.3333Z" fill="#0C8D5A"></path>
												<path fill-rule="evenodd" clip-rule="evenodd" d="M42.5 10C38.358 10 35 13.3579 35 17.5V25H17.5C13.3579 25 10 28.3579 10 32.5V72.5C10 76.642 13.3579 80 17.5 80H47.5C51.642 80 55 76.642 55 72.5V65H72.5C76.642 65 80 61.642 80 57.5V17.5C80 13.3579 76.642 10 72.5 10H42.5ZM50 65H42.5C38.358 65 35 61.642 35 57.5V30H17.5C16.1193 30 15 31.1193 15 32.5V72.5C15 73.8805 16.1193 75 17.5 75H47.5C48.8805 75 50 73.8805 50 72.5V65ZM40 17.5C40 16.1193 41.1195 15 42.5 15H72.5C73.8805 15 75 16.1193 75 17.5V57.5C75 58.8805 73.8805 60 72.5 60H42.5C41.1195 60 40 58.8805 40 57.5V17.5Z" fill="#0C8D5A"></path>
												<path fill-rule="evenodd" clip-rule="evenodd" d="M45 27.5C45 26.1193 46.1195 25 47.5 25H67.5C68.8805 25 70 26.1193 70 27.5C70 28.8807 68.8805 30 67.5 30H47.5C46.1195 30 45 28.8807 45 27.5Z" fill="#0C8D5A"></path>
												<path fill-rule="evenodd" clip-rule="evenodd" d="M45 37.5C45 36.1195 46.1195 35 47.5 35H57.5C58.8805 35 60 36.1195 60 37.5C60 38.8805 58.8805 40 57.5 40H47.5C46.1195 40 45 38.8805 45 37.5Z" fill="#0C8D5A"></path>
											</svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2" id="sez_woek_from_pop-app_no">Approval for SEZ Status</p>
										    <p class="licence-number f2" id="submit_pop_app_no"></p>
										</div>
									</div>
								</div>
								<div class="col-lg-6 d-flex justify-content-center">
									<div class="status-box">
										<p class="tier-box-upper f2">Status</p>
										<a href="javascript:void(0);" class="draftlink f2" id="submit_pop_status"></a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<div class="full-width-btn-wrapper hide"  id="continueDashboardSezStatus" >
							<a href="javascript:void(0);" class="details-btn" 
							onclick="getSingleSezApplicationDashboard();">Continue to your application
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
						<p class="modal-info f2">You will be notified at the
							following email address that you provided during your
							registration:</p>
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
									<a href="/home"
										class="text-dark common-nav-links text-white popup-home hidePopup">
										<span class="mr-2"><svg width="16" height="16"
												viewBox="0 0 16 16" fill="none"
												xmlns="http://www.w3.org/2000/svg">
				                                <path
													d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
													fill="#282524" />
				                            </svg> </span>Go back to the Homepage
									</a>
								</div>
								<div>
									<a href="/group/guest/dashboard"
										class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
										Continue to your dashboard<span class="ml-2"> <svg
												width="22" height="17" viewBox="0 0 22 17" fill="none"
												xmlns="http://www.w3.org/2000/svg">
				                                <path
													d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z"
													fill="#1B1917" />
				                                <path
													d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z"
													fill="#1B1917" />
				                                <path
													d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z"
													fill="#323232" />
				                            </svg>
									</span>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="custom_loader ">
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
function getSingleSezApplicationDashboard() {
	sezStatusApplicationId=$("#sezStatusApplicationId").val();
	window.location.href = "/group/guest/sez-status-dashboard?sezStatusApplicationId="
			+ sezStatusApplicationId;
}
</script>