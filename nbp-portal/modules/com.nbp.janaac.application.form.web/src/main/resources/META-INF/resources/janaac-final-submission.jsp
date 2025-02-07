<%@ include file="/init.jsp" %>
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
						<p class="modal-subtitle f2">Congratulations! Your application for an <span id="janaac-submitted-status"></span> has been submitted successfully.</p>
						<p class="modal-info f2">In the next months you will need to collaborate with the JANAAC in order to move this application forward. You may be asked to provide additional or updated documentation.</p>
						<p class="modal-info f2">When this happens you will be able to track your application and collaborate with the JANAAC in <a href="/group/guest/dashboard">your Dashboard:</a> </p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for JANAAC has failed to be submitted to</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper mb-3">
							<div class="row">
								<div class="col-lg-5 d-flex justify-content-center">
									<div class="licence-box ml-2">
										<div class="left">
											<svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 220 220" fill="none">
												<g clip-path="url(#clip0_10050_318989)">
												<path d="M0.389771 139.379C0.759812 140.776 1.40288 142.086 2.28186 143.234C3.16084 144.381 4.25833 145.343 5.51102 146.064L26.5467 158.224V182.443C26.5467 185.364 27.707 188.165 29.7724 190.231C31.8378 192.296 34.6392 193.457 37.5601 193.457H61.7786L73.9375 214.493C74.91 216.162 76.3016 217.548 77.9744 218.514C79.6473 219.48 81.5434 219.992 83.4751 220C85.4121 220.002 87.3153 219.493 88.9928 218.524L110.006 206.365L131.042 218.524C133.572 219.982 136.577 220.376 139.398 219.62C142.218 218.864 144.624 217.02 146.086 214.493L158.234 193.468H182.453C185.374 193.468 188.175 192.307 190.24 190.242C192.306 188.176 193.466 185.375 193.466 182.454V158.235L214.502 146.075C217.029 144.613 218.873 142.207 219.627 139.385C220.381 136.564 219.983 133.559 218.522 131.031L206.363 110.005L218.522 88.9909C219.983 86.4626 220.381 83.4575 219.627 80.6362C218.873 77.8149 217.029 75.4085 214.502 73.9461L193.466 61.7869V37.5565C193.466 34.6355 192.306 31.8341 190.24 29.7686C188.175 27.7031 185.374 26.5427 182.453 26.5427H158.234L146.086 5.51741C144.623 2.99112 142.22 1.14614 139.401 0.384986C138.004 0.00628704 136.546 -0.0913623 135.111 0.0976981C133.676 0.286758 132.293 0.758769 131.042 1.48637L110.006 13.6456L88.9818 1.48637C87.7307 0.759847 86.3485 0.287474 84.9144 0.0963405C83.4803 -0.0947926 82.0227 -0.000925996 80.625 0.372558C79.2273 0.746042 77.917 1.3918 76.7694 2.27278C75.6218 3.15376 74.6594 4.25265 73.9375 5.5064L61.7786 26.5427H37.5601C34.6392 26.5427 31.8378 27.7031 29.7724 29.7686C27.707 31.8341 26.5467 34.6355 26.5467 37.5565V61.7759L5.51102 73.9351C4.25584 74.6571 3.15569 75.62 2.27378 76.7685C1.39187 77.917 0.745573 79.2285 0.372029 80.6275C-0.00151534 82.0266 -0.094947 83.4856 0.0971016 84.9209C0.28915 86.3562 0.762895 87.7393 1.49112 88.9909L13.6499 110.005L1.49112 131.02C0.765821 132.272 0.295141 133.655 0.106134 135.089C-0.0828724 136.524 0.0135197 137.982 0.389771 139.379ZM35.8971 104.487L26.0731 87.4931L43.0778 77.6578C44.75 76.6897 46.1381 75.2988 47.1027 73.6246C48.0673 71.9505 48.5746 70.052 48.5735 68.1198V48.5703H68.1334C72.0652 48.5703 75.7106 46.4777 77.671 43.0634L87.495 26.0692L104.5 35.8935C106.173 36.8623 108.073 37.3724 110.006 37.3724C111.94 37.3724 113.84 36.8623 115.513 35.8935L132.529 26.0692L142.342 43.0634C143.308 44.7377 144.699 46.128 146.373 47.0947C148.047 48.0613 149.946 48.5703 151.879 48.5703H171.439V68.1308C171.438 70.063 171.946 71.9615 172.91 73.6357C173.875 75.3098 175.263 76.7007 176.935 77.6688L193.94 87.5041L184.105 104.498C183.136 106.174 182.626 108.075 182.626 110.011C182.626 111.946 183.136 113.848 184.105 115.523L193.94 132.517L176.935 142.353C175.263 143.321 173.875 144.712 172.91 146.386C171.946 148.06 171.438 149.959 171.439 151.891V171.451H151.879C149.946 171.449 148.046 171.957 146.371 172.924C144.697 173.891 143.307 175.282 142.342 176.958L132.529 193.952L115.513 184.117C113.838 183.148 111.936 182.638 110.001 182.638C108.066 182.638 106.164 183.148 104.489 184.117L87.495 193.952L77.671 176.958C76.7027 175.285 75.3121 173.896 73.6382 172.93C71.9644 171.963 70.0661 171.453 68.1334 171.451H48.5735V151.891C48.5746 149.959 48.0673 148.06 47.1027 146.386C46.1381 144.712 44.75 143.321 43.0778 142.353L26.0731 132.517L35.9081 115.523C36.8771 113.845 37.3864 111.941 37.3845 110.004C37.3825 108.066 36.8695 106.163 35.8971 104.487Z" fill="#047247"></path>
												<path d="M50.72 98.1111H56.9386V118.859C56.9386 120.777 56.5075 122.443 55.6455 123.857C54.7931 125.271 53.6065 126.361 52.0858 127.126C50.565 127.891 48.7973 128.274 46.7826 128.274C44.9906 128.274 43.3633 127.959 41.9007 127.33C40.4478 126.69 39.2951 125.722 38.4427 124.424C37.5903 123.116 37.169 121.474 37.1787 119.498H43.4408C43.4602 120.283 43.62 120.956 43.9203 121.518C44.2302 122.07 44.6516 122.496 45.1843 122.796C45.7268 123.087 46.3661 123.232 47.1022 123.232C47.8771 123.232 48.5309 123.068 49.0637 122.738C49.6061 122.399 50.0178 121.905 50.2987 121.256C50.5796 120.607 50.72 119.808 50.72 118.859V98.1111ZM61.1317 127.867H54.3901L64.6624 98.1111H72.7697L83.0275 127.867H76.2858L68.8323 104.911H68.5998L61.1317 127.867ZM60.7104 116.171H76.6346V121.082H60.7104V116.171ZM105.361 98.1111V127.867H99.9265L86.9809 109.139H86.763V127.867H80.4718V98.1111H85.9929L98.8368 116.825H99.0984V98.1111H105.361ZM109.55 127.867H102.808L113.081 98.1111H121.188L131.446 127.867H124.704L117.251 104.911H117.018L109.55 127.867ZM109.129 116.171H125.053V121.082H109.129V116.171ZM134.019 127.867H127.277L137.55 98.1111H145.657L155.915 127.867H149.173L141.719 104.911H141.487L134.019 127.867ZM133.598 116.171H149.522V121.082H133.598V116.171ZM178.215 108.529H171.851C171.735 107.705 171.498 106.974 171.139 106.335C170.781 105.686 170.321 105.134 169.759 104.678C169.197 104.223 168.548 103.874 167.812 103.632C167.086 103.39 166.296 103.269 165.444 103.269C163.904 103.269 162.562 103.652 161.419 104.417C160.276 105.172 159.39 106.277 158.76 107.73C158.131 109.173 157.816 110.926 157.816 112.989C157.816 115.11 158.131 116.893 158.76 118.336C159.4 119.779 160.291 120.869 161.434 121.605C162.577 122.341 163.899 122.709 165.4 122.709C166.243 122.709 167.023 122.598 167.739 122.375C168.466 122.152 169.11 121.828 169.672 121.402C170.234 120.966 170.698 120.438 171.067 119.818C171.444 119.198 171.706 118.491 171.851 117.697L178.215 117.726C178.05 119.091 177.639 120.409 176.98 121.678C176.331 122.937 175.454 124.065 174.35 125.063C173.256 126.051 171.948 126.836 170.427 127.417C168.916 127.988 167.207 128.274 165.298 128.274C162.644 128.274 160.271 127.673 158.179 126.472C156.097 125.271 154.45 123.533 153.239 121.256C152.038 118.98 151.437 116.224 151.437 112.989C151.437 109.744 152.048 106.984 153.268 104.707C154.489 102.431 156.145 100.697 158.237 99.5059C160.329 98.3048 162.683 97.7043 165.298 97.7043C167.023 97.7043 168.621 97.9464 170.093 98.4307C171.575 98.915 172.888 99.6221 174.031 100.552C175.174 101.472 176.103 102.601 176.82 103.937C177.547 105.274 178.012 106.804 178.215 108.529Z" fill="#047247"></path>
												</g>
												<defs>
												<clipPath id="clip0_10050_318989">
												<rect width="220" height="220" fill="white"></rect>
												</clipPath>
												</defs>
												</svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">JANAAC Application Transaction Number</p>
											<p class="licence-number f2" id="submit_pop_app_no"></p>
										</div>
									</div>
								</div>
								<div class="col-lg-4 d-flex justify-content-center">
									<div class="tier-box">
										<p class="tier-box-upper f2">Type of Accreditation</p>
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
						<div class="full-width-btn-wrapper hide" id="continueDashboardJannac" onclick="getSingleJannacDashboard();">
							<a href="javascript:void(0);" class="details-btn">
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
			<div class="custom_loader hide">
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
function getSingleJannacDashboard() {
	jannacApplicationId=$("#janaacApplicationId").val();
	window.location.href = "/group/guest/janaac-dashboard?janaacApplicationId="
			+ jannacApplicationId;
} 
</script>