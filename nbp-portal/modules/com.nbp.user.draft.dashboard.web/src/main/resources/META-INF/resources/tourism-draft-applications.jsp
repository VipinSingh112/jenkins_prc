<%@ include file="/init.jsp" %>
<% 
	for (TourismApplication applications : tourismDraftApplicationList) {
			tourismformRenderURL.setParameter("applicationId",String.valueOf(applications.getTourismApplicationId()));
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card" onclick="singleTourismApplicationOverview'<%=tourismDashboardProgressURL%>')">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									 <svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 48 48" fill="none">
										<path d="M40.9998 32.328V6.4H37.6798V5H24.7838V6.4H21.4639V12.72C21.7118 13.224 21.8479 13.784 21.8479 14.376C21.8479 14.968 21.7119 15.528 21.4639 16.032V18.136C22.1678 18.272 22.8078 18.552 23.3998 18.936V17.8H38.7998V20.2H24.8798C25.1118 20.456 25.3357 20.72 25.5438 21H38.7999V23.4H26.9999C27.1358 23.672 27.2559 23.936 27.3759 24.2H38.7999V26.6H28.2719C28.3678 26.904 28.4319 27.152 28.4798 27.32C28.5598 27.616 28.5758 27.9121 28.5438 28.2H38.7999V32.2H29.2879C29.4319 32.432 29.5199 32.704 29.5199 33H43.4959V32.328H40.9998ZM38.7998 16.832H23.3998V15.936H38.7998V16.832ZM38.9038 9.464H23.3998V8.664H38.9038V9.464Z" fill="#047247"/>
										<path d="M18.0686 17.354C19.7126 17.354 21.0454 16.0212 21.0454 14.3772C21.0454 12.7331 19.7126 11.4004 18.0686 11.4004C16.4246 11.4004 15.0918 12.7331 15.0918 14.3772C15.0918 16.0212 16.4246 17.354 18.0686 17.354Z" fill="#047247"/>
										<path d="M27.9167 32.2061H27.064V29.1636C27.5975 28.8234 27.8782 28.1714 27.705 27.5283C26.6694 23.6762 23.7943 18.2791 20.1787 18.8676C19.8886 18.8184 16.1306 18.8386 15.9595 18.8676C15.8173 18.8444 15.7979 18.8416 15.6674 18.8416C10.9089 18.8416 8.67352 26.6348 8.43336 27.5283C8.41144 27.6097 8.40128 27.691 8.39336 27.7722H6.69768V28.5164H7.04656V30.3768H5.8372C5.3748 30.3768 5 30.7516 5 31.214V40.6089C5 41.0258 5.31024 41.3563 5.70928 41.4202V41.981C5.70928 42.225 5.90712 42.4228 6.15112 42.4228C6.39512 42.4228 6.59296 42.225 6.59296 41.981V41.4461H11.4532V41.981C11.4532 42.225 11.651 42.4228 11.895 42.4228C12.139 42.4228 12.3369 42.225 12.3369 41.981V41.4202C12.7359 41.3564 13.0462 41.0258 13.0462 40.6089V31.2138C13.0462 30.7514 12.6714 30.3766 12.209 30.3766H10.9997V28.8588C11.0855 28.7566 11.1522 28.6418 11.209 28.5163H11.3486V28.1604C11.9534 26.0155 13.2942 23.1352 14.7204 22.1602V30.7488H14.7205V41.9109C14.7205 42.7328 15.3869 43.3992 16.2088 43.3992C17.0307 43.3992 17.6971 42.7328 17.6971 41.9109V30.7488H18.4413V41.9109C18.4413 42.7328 19.1077 43.3992 19.9296 43.3992C20.7515 43.3992 21.4179 42.7328 21.4179 41.9109V29.2604L21.4178 29.2595V22.1602C22.8753 23.1565 24.2469 26.1459 24.8313 28.303C24.9777 28.844 25.4085 29.2196 25.9169 29.345V32.2062H25.0642C24.619 32.2062 24.2581 32.567 24.2581 33.0122V41.7251C24.2581 42.1703 24.619 42.5312 25.0642 42.5312H27.9169C28.3621 42.5312 28.723 42.1703 28.723 41.7251V33.0122C28.7229 32.567 28.3619 32.2061 27.9167 32.2061ZM7.6744 30.3766V28.5162H8.51664C8.69264 28.9112 9.03256 29.2294 9.4828 29.3511C9.61248 29.386 9.74296 29.4027 9.8712 29.4027C10.0448 29.4027 10.2127 29.3683 10.3718 29.311V30.3765H7.6744V30.3766Z" fill="#047247"/>
										<path d="M39.7484 10.0996H22.7148V15.166H39.7484V10.0996Z" fill="#047247"/>
										<path d="M25.982 11.1346H26.6596V14.1712H25.982V12.9766H24.7744V14.1712H24.0967V11.1346H24.7744V12.4033H25.982V11.1346ZM29.9608 13.7519C29.654 14.0517 29.276 14.2016 28.8271 14.2016C28.3781 14.2016 28.0002 14.0517 27.6933 13.7519C27.3861 13.4523 27.2327 13.0793 27.2327 12.6333C27.2327 12.1873 27.3861 11.8146 27.6933 11.5148C28.0002 11.215 28.3781 11.0651 28.8271 11.0651C29.276 11.0651 29.654 11.215 29.9608 11.5148C30.2677 11.8145 30.4215 12.1873 30.4215 12.6333C30.4215 13.0793 30.2677 13.4523 29.9608 13.7519ZM29.7307 12.6355C29.7307 12.3649 29.6437 12.1338 29.4701 11.9428C29.2962 11.7515 29.0827 11.6559 28.8292 11.6559C28.5756 11.6559 28.3621 11.7515 28.1886 11.9428C28.0147 12.1338 27.9277 12.3649 27.9277 12.6355C27.9277 12.9065 28.0147 13.1366 28.1886 13.3263C28.3622 13.516 28.5757 13.6109 28.8292 13.6109C29.0826 13.6109 29.2962 13.5159 29.4701 13.3263C29.6437 13.1366 29.7307 12.9065 29.7307 12.6355ZM32.1983 11.7211V14.1712H31.5206V11.7211H30.6604V11.1346H33.0584V11.7211H32.1983ZM35.7431 11.1346V11.7385H34.2314V12.364H35.5911V12.9418H34.2314V13.5718H35.7908V14.1712H33.5536V11.1346H35.7431ZM36.3946 14.1712V11.1346H37.0723V13.5674H38.3669V14.1713H36.3946V14.1712Z" fill="#047247"/>
									</svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Tourism Licence</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> <%= applications.getApplicationNumber()%>
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
										<span class="one"> 
											<%=dateFormatter.format(applications.getCreateDate())%>
										</span>
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
								<div class="dash-action-box d-flex">
									<!-- <a href="javascript:void(0);" class="dash-action-btns mr-2 common-yellow-bg">
										<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
						                   <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
						                </svg>			
									</a> --> 
									<a href="<%=tourismformRenderURL.toString()%>" class="dash-action-btns common-yellow-bg" data-toggle="tooltip" title="Continue your Application"> 
										<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg">
						                   <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path>
						                </svg>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row pt-0 px-3 pb-3">
				<div class="col-md-12">
					<div class="lower  dash-lower-multiple-links-box d-flex justify-content-end">
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/tourism-application-form?tourismApplicationId=<%=String.valueOf(applications.getTourismApplicationId())%>"> 
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
