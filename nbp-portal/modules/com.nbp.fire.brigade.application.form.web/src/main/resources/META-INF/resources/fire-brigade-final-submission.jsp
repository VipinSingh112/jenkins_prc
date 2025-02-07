<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletURL"%>
<%
	String	fireBrigadeDashboardRenderURL = "/group/guest/fire-brigade-dashboard";
%>
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
						<p class="modal-subtitle f2">Congratulations! Your Application for a Fire/Occupancy Certificate has been successful.</p>
						<p class="modal-info f2">
							In the next months you will need to collaborate with the Jamaica Fire/Occupancy Certificate in order to move this application forward. You may be asked to provide additional or updated documentation.
						</p>
						<p class="modal-info f2">
							When this happens you will be able to track your application and collaborate with the Fire/Occupancy Certificate in <a href="/group/guest/dashboard">your Dashboard:</a>
						</p>
					</div>
					<div class="col-md-12 hide" id="draft-content">
						<p class="modal-title f1">Submission failed</p>
						<p class="modal-subtitle f2">Your application for Fire/Occupancy Certificate has failed to be submitted to the JFB.</p>
						<p class="modal-info f2">Please submit the Application after sometime from <a href="/group/guest/dashboard">your Dashboard.</a> </p>
					</div>
			<div class="col-md-12">
				<div class="cards-wrapper"> 
	              <div class="row"> 
		               <div class="col-lg-5 d-flex justify-content-center"> 
			                <div class="licence-box ml-2"> 
			                 <div class="left"> 
			                  <svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" viewBox="0 0 512 512" fill="none"> 
			                   <path d="M368 480H144C133.391 480 123.217 475.786 115.716 468.284C108.214 460.783 104 450.609 104 440V71.9999C104 61.3912 108.214 51.2171 115.716 43.7156C123.217 36.2142 133.391 31.9999 144 31.9999H290.72C295.976 31.9905 301.183 33.0172 306.042 35.0214C310.902 37.0255 315.318 39.9678 319.04 43.6799L396.32 120.96C400.032 124.682 402.974 129.098 404.979 133.958C406.983 138.817 408.009 144.024 408 149.28V440C408 450.609 403.786 460.783 396.284 468.284C388.783 475.786 378.609 480 368 480ZM144 47.9999C137.635 47.9999 131.53 50.5285 127.029 55.0293C122.529 59.5302 120 65.6347 120 71.9999V440C120 446.365 122.529 452.47 127.029 456.971C131.53 461.471 137.635 464 144 464H368C374.365 464 380.47 461.471 384.971 456.971C389.471 452.47 392 446.365 392 440V149.28C391.994 142.917 389.462 136.817 384.96 132.32L307.68 55.0399C303.183 50.5377 297.083 48.0055 290.72 47.9999H144Z" fill="#047247"></path> 
			                   <path d="M257.229 269.453C257.229 269.453 239.486 283.566 239.486 294.974C239.486 300.082 247.09 305.186 257.229 305.186C267.36 305.186 274.964 300.082 274.964 294.974C274.964 283.156 257.229 269.453 257.229 269.453ZM321.912 243.657C322.939 231.231 326.583 219.822 333 209.368L308.364 185C300.583 191.627 291.717 195.295 281.67 195.944C272.467 196.767 263.744 195.038 255.542 190.742C247.101 194.896 238.411 196.633 229.351 195.944C219.983 195.114 211.524 191.83 203.952 186.008L179.246 210.365C185.322 220.972 188.706 232.068 189.37 243.657C189.685 248.993 188.145 256.334 184.691 265.832C183.12 270.318 181.75 274.871 180.584 279.477C179.719 283.265 179.18 286.346 179.004 288.652C178.876 298.766 181.747 307.905 187.632 316.021C192.23 321.948 199.812 328.495 210.343 335.651C221.867 341.451 230.781 345.214 237.025 346.823L242.203 349.201C243.834 349.97 245.58 350.724 247.398 351.547C251.325 353.871 254.083 356.394 255.542 359C257.32 356.183 260.14 353.722 263.895 351.547C266.141 350.59 268.369 349.59 270.575 348.545L274.484 346.82C275.819 346.164 277.575 345.413 279.687 344.587C282.313 343.559 284.953 342.567 287.607 341.611C293.69 339.483 298.126 337.467 300.935 335.647C311.15 328.491 318.619 322.053 323.368 316.289C329.465 308.14 332.424 298.965 332.289 288.648C331.926 284.03 329.949 276.638 326.36 266.571C322.939 256.766 321.421 249.153 321.912 243.657ZM257.229 315.394C234.836 315.394 214.145 297.109 214.145 274.557C214.145 259.242 225.989 244.774 229.351 238.825L239.486 254.141L257.229 228.621L274.964 254.141L285.113 238.825C288.465 244.774 300.319 259.242 300.319 274.557C300.319 297.109 279.624 315.394 257.229 315.394Z" fill="#047247"></path> 
			                  </svg> 
			                 </div> 
			                 <div class="right pl-2"> 
			                  <p class="licence-title f2">Fire/Occupancy Certificate Transaction Number</p> 
			                  <p class="licence-number f2" id="submit_pop_app_no"></p> 
			                 </div> 
			                </div> 
			               </div> 
			               <div class="col-lg-4 d-flex justify-content-center"> 
			                <div class="tier-box"> 
			                 <p class="tier-box-upper f2">Category/ Sub Category</p> 
			                 <p class="tier-box-upper f2" id="submit_pop_category"></p> 
			                </div> 
			               </div> 
			               <div class="col-lg-3 d-flex justify-content-center"> 
			                <div class="status-box"> 
			                 <p class="tier-box-upper f2">Status</p> 
			                 <a href="" class="draftlink f2" id="submit_pop_status"></a> 
			                </div> 
		               </div> 
	              </div> 
            	 </div>	
             </div>	
					<div class="col-md-12">
						<div class="full-width-btn-wrapper hide"  id="continueDashboardFireBrigadeStatus" >
							<a href="javascript:void(0);" class="details-btn" onclick="getSingleFireBrigadeApplicationDashboard('<%=fireBrigadeDashboardRenderURL%>')">
							Continue to your application details page <span class="ml-2"> <svg width="16"
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

function getSingleFireBrigadeApplicationDashboard(fireBrigadeDashboardRenderURL) {
	fireBrigadeApplicationId = $("#fireBrigadeApplicationId").val();
	window.location.href = fireBrigadeDashboardRenderURL
			+ "?fireBrigadeApplicationId="
			+ fireBrigadeApplicationId;
}
</script>