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
						<p class="modal-subtitle f2">Congratulations! Your application to "Register a Food Processing Establishment" has been submitted successfully.</p>
						<p class="modal-info f2">In the next months you will need to collaborate with the NCRA in order to move this application forward. You may be asked to provide additional or updated documentation.</p>
						<p class="modal-info f2">When this happens you will be able to track your application and collaborate with the NCRA in <a href="/group/guest/dashboard">your Dashboard:</a> </p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for Jamaica Tourist Board has failed to be submitted to the NCRA.</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
					</div>
					<div class="col-md-12">
						<div class="cards-wrapper mb-3">
							<div class="row">
								<div class="col-lg-5 d-flex justify-content-center">
									<div class="licence-box mr-2">
										<div class="left">
											<svg width="37" height="30" viewBox="0 0 205 220" fill="none" xmlns="http://www.w3.org/2000/svg"> 
						                        <g clip-path="url(#clip0_10057_319000)"> 
						                        <path d="M6.37408 1.54194C-0.308162 4.42045 0.000249375 -0.308525 0.000249375 110.514C0.000249375 197.486 0.205857 211.262 1.54231 213.832C4.83203 220.103 3.70118 220 48.5236 220H89.4395V213.832V207.663H50.8881H12.3367L12.5423 110.206L12.8507 12.8504L58.3928 12.5419L103.832 12.3363V38.7569C103.832 58.084 104.243 65.9999 105.168 67.8504L106.505 70.4205L135.187 70.9345L163.972 71.4485L164.486 92.5233L165 113.598H170.963H176.823V87.6915V61.7849L166.337 51.7102C160.477 46.1588 147.626 33.7195 137.757 24.056C127.888 14.4952 118.019 5.03727 115.86 3.28961L111.954 -0.000113358H60.8601C18.9161 0.10269 9.14978 0.308298 6.37408 1.54194ZM153.178 56.2335L155.748 58.598H136.421H117.197V40.5046V22.4111L133.954 38.1401C143.103 46.7756 151.739 54.8971 153.178 56.2335Z" fill="#047247"></path> 
						                        <path d="M38.2434 44.4107C37.5238 45.1304 37.0098 46.4668 37.0098 47.392C37.0098 50.8874 39.4771 51.5042 54.0752 51.1958C68.1593 50.8874 68.3649 50.8874 68.6733 48.5229C69.3929 43.7939 67.6453 43.1771 53.0471 43.1771C43.8976 43.1771 39.0658 43.5883 38.2434 44.4107Z" fill="#047247"></path> 
						                        <path d="M38.038 75.4573C37.4212 76.2797 37.01 78.0274 37.2156 79.3639L37.524 81.7283L62.0941 82.0367C86.767 82.2424 89.4399 81.9339 89.4399 78.5414C89.4399 77.8218 88.7203 76.4853 87.795 75.6629C85.5334 73.2984 39.9913 73.1956 38.038 75.4573Z" fill="#047247"></path> 
						                        <path d="M37.7288 106.609C36.598 107.739 36.9064 111.543 38.2429 112.88C39.1681 113.805 49.4485 114.113 78.1307 114.113C120.383 114.113 121.205 114.01 119.869 108.665L119.252 105.889H78.7475C56.5419 105.889 38.0373 106.197 37.7288 106.609Z" fill="#047247"></path> 
						                        <path d="M203.643 162.88C203.216 162.562 202.721 162.348 202.197 162.253C201.673 162.159 201.135 162.187 200.623 162.336L171.073 171.244V165.6C171.073 165.072 170.951 164.552 170.715 164.079C170.48 163.607 170.138 163.197 169.716 162.88C169.289 162.562 168.794 162.348 168.27 162.253C167.746 162.159 167.208 162.187 166.697 162.336L134.67 171.958L133.754 155.196C133.703 154.33 133.323 153.516 132.692 152.921C132.061 152.327 131.227 151.997 130.361 152H116.79C115.924 151.997 115.09 152.327 114.459 152.921C113.828 153.516 113.448 154.33 113.398 155.196L110.005 216.396C109.98 216.861 110.048 217.326 110.205 217.764C110.363 218.202 110.606 218.604 110.921 218.946C111.242 219.279 111.627 219.545 112.052 219.726C112.478 219.907 112.935 220 113.398 220H201.607C202.506 219.997 203.368 219.638 204.003 219.001C204.639 218.364 204.997 217.501 205 216.6V165.6C205 165.072 204.878 164.552 204.642 164.079C204.407 163.607 204.064 163.197 203.643 162.88ZM164.288 213.2H136.977L135.077 178.962L164.288 170.156V213.2ZM198.215 213.2H171.073V178.316L198.215 170.156V213.2Z" fill="#047247"></path> 
						                        <path d="M158 187H143V193H158V187Z" fill="#047247"></path> 
						                        <path d="M158 199H143V206H158V199Z" fill="#047247"></path> 
						                        <path d="M191 187H178V193H191V187Z" fill="#047247"></path> 
						                        <path d="M191 199H178V206H191V199Z" fill="#047247"></path> 
						                        <path d="M119.9 146.429C119.902 144.535 120.63 142.719 121.923 141.38C123.217 140.041 124.971 139.288 126.8 139.286H128.719C127.476 141.447 126.814 143.913 126.8 146.429V150H133.7V146.429C133.702 144.535 134.43 142.719 135.723 141.38C137.017 140.041 138.771 139.288 140.6 139.286H168.2C171.859 139.282 175.367 137.775 177.954 135.097C180.541 132.419 181.996 128.788 182 125H175.1C175.098 126.894 174.37 128.709 173.077 130.048C171.783 131.387 170.029 132.141 168.2 132.143H166.281C167.524 129.981 168.186 127.515 168.2 125H161.3C161.298 126.894 160.57 128.709 159.277 130.048C157.983 131.387 156.229 132.141 154.4 132.143H126.8C123.141 132.147 119.633 133.653 117.046 136.332C114.459 139.01 113.004 142.641 113 146.429V150H119.9V146.429Z" fill="#047247"></path> 
						                        <path d="M25.1095 169.137C25.2187 169.55 25.4089 169.937 25.669 170.275C25.929 170.614 26.2537 170.898 26.6243 171.11L32.8298 174.698V181.846C32.8298 182.708 33.1722 183.535 33.7819 184.144C34.3915 184.754 35.2183 185.096 36.0804 185.096H43.2286L46.8173 191.305C47.2496 192.05 47.9596 192.593 48.7918 192.816C49.624 193.039 50.5107 192.923 51.2577 192.494L57.4632 188.909L63.6719 192.497C64.4189 192.927 65.3056 193.043 66.1378 192.82C66.97 192.597 67.68 192.053 68.1123 191.308L71.6978 185.103H78.8459C79.7081 185.103 80.5349 184.76 81.1445 184.151C81.7541 183.541 82.0966 182.714 82.0966 181.852V174.705L88.3021 171.116C88.6721 170.903 88.9964 170.619 89.2565 170.281C89.5166 169.942 89.7073 169.555 89.8179 169.143C89.9284 168.731 89.9564 168.3 89.9005 167.877C89.8445 167.454 89.7057 167.046 89.4918 166.676L85.9063 160.468L89.4951 154.263C89.9261 153.517 90.0429 152.629 89.8198 151.797C89.5967 150.964 89.0519 150.254 88.3053 149.823L82.0998 146.235V139.087C82.0998 138.225 81.7574 137.398 81.1477 136.789C80.5381 136.179 79.7113 135.837 78.8492 135.837H71.701L68.1156 129.632C67.6836 128.886 66.9743 128.342 66.1424 128.117C65.7301 128.005 65.2997 127.977 64.8762 128.032C64.4527 128.088 64.0445 128.227 63.6752 128.442L57.4632 132.027L51.2577 128.439C50.8884 128.224 50.4805 128.085 50.0572 128.028C49.6339 127.972 49.2037 128 48.7911 128.11C48.3786 128.22 47.9919 128.411 47.6532 128.671C47.3145 128.931 47.0304 129.255 46.8173 129.625L43.2286 135.833H36.0804C35.2183 135.833 34.3915 136.176 33.7819 136.785C33.1722 137.395 32.8298 138.222 32.8298 139.084V146.231L26.6243 149.823C25.8789 150.255 25.3354 150.965 25.113 151.798C24.8905 152.63 25.0074 153.517 25.4378 154.263L29.0233 160.468L25.4345 166.673C25.0051 167.419 24.8883 168.305 25.1095 169.137Z" fill="#047247"></path> 
						                        <path d="M45.8477 162.141L52.9626 168.859L68.8477 153.859" stroke="white" stroke-width="5" stroke-linecap="round" stroke-linejoin="round"></path> 
						                        <path d="M57.3477 179.859C68.1172 179.859 76.8477 171.129 76.8477 160.359C76.8477 149.59 68.1172 140.859 57.3477 140.859C46.5781 140.859 37.8477 149.59 37.8477 160.359C37.8477 171.129 46.5781 179.859 57.3477 179.859Z" stroke="white" stroke-width="5"></path> 
						                        </g> 
                      					 		<defs> 
						                        <clipPath id="clip0_10057_319000"> 
						                        <rect width="205" height="220" fill="white"></rect> 
						                        </clipPath> 
						                       </defs> 
						                      </svg>
										</div>
										<div class="right pl-2">
											<p class="licence-title f2">The Food Establishment Application Transaction Number</p>
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
										<a href="javascript:void(0);" class="draftlink f2" id="submit_pop_status"></a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<div class="full-width-btn-wrapper hide" id="continueDashboardfactories">
							<a href="javascript:void(0);" class="details-btn"  onclick="getSingleFactoriesDashboard();">
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
