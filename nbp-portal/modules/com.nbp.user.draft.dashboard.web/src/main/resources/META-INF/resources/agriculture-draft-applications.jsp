<%@ include file="/init.jsp" %>
	<%
		for (AgricultureApplication applications : agricultureDraftApplicationsList) {
			agricultureAplicationFormRenderURL.setParameter("applicationId",String.valueOf(applications.getAgricultureApplicationId()));
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="36" height="36" viewBox="0 0 36 36" fill="none">
										<path d="M35.1959 0.187967C35.0421 0.192859 34.8963 0.257277 34.7891 0.367638L32.4918 2.66511C32.2211 2.69607 31.4738 2.78947 30.4241 3.07081C29.1613 3.40925 27.6377 3.968 26.5829 5.02285C25.6027 6.00309 25.0578 6.97014 24.9173 7.89758C24.8097 8.60852 24.9678 9.28525 25.3207 9.83687L24.0399 11.1177C24.2448 9.82532 23.9962 8.45798 23.6992 7.3493C23.4649 6.47484 23.239 5.8906 23.0906 5.5294L25.2303 3.38611C25.6138 3.00893 25.338 2.35695 24.8003 2.36952C24.6465 2.37441 24.5006 2.43883 24.3934 2.54919L22.0116 4.93244C21.958 4.971 21.1757 5.53649 20.2822 6.43008C19.3578 7.3546 18.3166 8.6034 17.9305 10.0444C17.5717 11.3834 17.5791 12.4954 17.9212 13.3688C18.2633 14.2423 18.9693 14.8375 19.8001 15.0601C19.8817 15.082 19.964 15.0967 20.0469 15.1111L17.4877 17.6705C17.6933 16.3774 17.4453 15.0091 17.1481 13.8997C16.8098 12.6369 16.382 11.6927 16.382 11.6927C16.2805 11.4699 16.0526 11.3322 15.8082 11.3461C15.6961 11.3522 15.588 11.39 15.4964 11.4551C15.4964 11.4551 14.6556 12.056 13.7312 12.9805C12.8068 13.905 11.7655 15.1539 11.3794 16.5948C11.0207 17.9338 11.0281 19.0459 11.3701 19.9193C11.7122 20.7927 12.4182 21.3879 13.249 21.6105C13.3307 21.6325 13.414 21.6471 13.497 21.6615L11.034 24.1248C11.2396 22.8316 10.9916 21.4634 10.6944 20.354C10.3561 19.0911 9.92828 18.1469 9.92828 18.1469C9.82681 17.9241 9.59896 17.7865 9.35454 17.8003C9.24239 17.8064 9.13428 17.8442 9.04275 17.9093C9.04275 17.9093 8.20189 18.5102 7.27749 19.4348C6.35309 20.3593 5.31183 21.6081 4.92575 23.049C4.56696 24.3881 4.57441 25.5001 4.91648 26.3735C5.25854 27.2469 5.96457 27.8422 6.79532 28.0648C6.87739 28.0868 6.96113 28.1013 7.04452 28.1158L0.382214 34.7775C-0.202642 35.3384 0.663633 36.2036 1.2237 35.6179L7.88369 28.9573C7.89805 29.04 7.9129 29.1229 7.93469 29.2042C8.15729 30.035 8.75241 30.7411 9.62576 31.0832C10.4991 31.4253 11.6122 31.4338 12.9511 31.0751C14.392 30.689 15.6406 29.6464 16.5651 28.722C17.4896 27.7976 18.0893 26.9566 18.0893 26.9566C18.3058 26.6529 18.192 26.2272 17.8528 26.0721C17.8528 26.0721 16.9076 25.6431 15.6448 25.3048C14.8555 25.0933 13.9354 24.9072 13.0044 24.891C12.6257 24.8844 12.2461 24.9089 11.872 24.9686L14.3374 22.5031C14.3517 22.5857 14.3666 22.6687 14.3884 22.75C14.611 23.5808 15.2061 24.2869 16.0794 24.629C16.9528 24.9711 18.0658 24.9796 19.4048 24.6209C20.8457 24.2348 22.0943 23.1922 23.0188 22.2678C23.9433 21.3434 24.543 20.5024 24.543 20.5024C24.7595 20.1987 24.6457 19.773 24.3065 19.6179C24.3065 19.6179 23.3613 19.1889 22.0985 18.8505C21.3092 18.6391 20.3891 18.4529 19.4581 18.4367C19.0794 18.4301 18.6998 18.4547 18.3257 18.5144L20.8873 15.9526C20.9016 16.0353 20.9176 16.1182 20.9394 16.1995C21.162 17.0303 21.7571 17.7365 22.6305 18.0785C23.5039 18.4206 24.6169 18.4292 25.9559 18.0704C27.3967 17.6843 28.6453 16.6417 29.5698 15.7173C30.4453 14.8419 30.9905 14.0911 31.05 14.0087L33.4527 11.6057C33.8376 11.2274 33.5587 10.5733 33.0192 10.5892C32.865 10.5938 32.7187 10.6582 32.6112 10.7688L30.4704 12.9098C30.1093 12.7612 29.5248 12.5346 28.6495 12.3001C27.8603 12.0886 26.9402 11.9025 26.0092 11.8863C25.6304 11.8797 25.2497 11.9042 24.8756 11.9639L26.161 10.6784C26.7138 11.0328 27.3936 11.193 28.1048 11.0853C29.0321 10.9448 29.9956 10.3963 30.9758 9.41609C32.0306 8.36124 32.5881 6.8363 32.9265 5.57345C33.2104 4.51422 33.3063 3.75969 33.3368 3.49855L35.6294 1.20919C36.0229 0.831308 35.741 0.167392 35.1959 0.187967ZM28.9126 0.599471C28.9104 0.599843 28.9079 0.600229 28.9057 0.600629C28.7517 0.604915 28.6054 0.668931 28.4977 0.77914L27.2401 2.03684C26.6781 2.59787 27.5196 3.43943 28.0816 2.87839L29.3392 1.62069C29.7297 1.24515 29.4542 0.585599 28.9126 0.599469L28.9126 0.599471ZM34.3638 6.64107L33.1027 7.90338C32.496 8.46322 33.3858 9.34941 33.9431 8.7403L35.2006 7.4826C35.5911 7.10706 35.3157 6.44751 34.7729 6.46197C34.6178 6.46686 34.4715 6.53087 34.3638 6.64107V6.64107Z" fill="#047247"/>
									</svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Agriculture
									Licence</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> <%=applications.getApplicationNumber()%>
										</span>
									</div>
								</div>
							</div>
						</div>
						<div class="right-part d-flex  justify-content-end">
							<div
								class="tier-plus-issuedate-box  justify-content-between pr-lg-5">
								<div class="single-box px-lg-5">
									<p class="upper-title">Created Date</p>
									<p class="lower-title">
										<span class="one"> <%=dateFormatter.format(applications.getCreateDate())%></span>
									</p>
								</div>
								<div class="single-box">
									<p class="upper-title">Last Modified Date</p>
									<p class="lower-title">
										<span class="one"> <%=dateFormatter.format(applications.getModifiedDate())%></span>
									</p>
								</div>

							</div>
							<div class="dash-status-box">
								<p class="dash-status">Status</p>
								<p class="dash-status-type">
									<span class="circle"></span> <span
										class="dash-status-type-info"> <%=DraftDashboardPortletKeys.getStatusLabel(applications.getStatus())%>
									</span>
								</p>
							</div>
							<div class="dash-action-box d-flex">
								<!-- <a href="javascript:void(0);" class="dash-action-btns mr-2 common-yellow-bg">
									<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
					                   <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
					                </svg>		
								</a>  -->
								<a href="/group/guest/application-form-for-agriculture?agricultureApplicationId=<%=String.valueOf(applications.getAgricultureApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
									<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg">
					                   <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path>
					                </svg>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row pt-0 px-3 pb-3">
				<div class="col-md-12">
					<div class="lower dash-lower-multiple-links-box d-flex justify-content-end">
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/application-form-for-agriculture?agricultureApplicationId=<%=String.valueOf(applications.getAgricultureApplicationId())%>">
							Continue your Application
							<span class="ml-2"> 
								<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"> 
                           			<path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9"></path> 
                          		</svg>
							</span>
						</a>
					</div>
				</div>
			</div>
		</div>
	<%
		}
	%>
