<%@ include file="/init.jsp" %>
<%
		for (CannabisApplications applications : cannabisDraftApplicationsList) {
		aplicationFormRenderURL.setParameter("applicationId",String.valueOf(applications.getCannabisApplicationId()));
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									 <svg width="33" height="40" viewBox="0 0 33 40" fill="none" xmlns="http://www.w3.org/2000/svg">
					                     <path d="M17.5 40V30.7C18.5 32.26 20.5 34.18 24.44 35.62C24.44 35.62 23.44 32.2 20.62 29.9C23.22 30.46 27.14 30.38 32.5 28C32.5 28 27.56 25.18 21.94 25.94C25.12 24 29.1 20.16 32.16 12.22C32.16 12.22 23.16 14.68 18.68 22.28C22.74 12.48 16.5 0 16.5 0C11.64 10.94 12.68 18.2 14.26 22.2C9.76 14.66 0.84 12.22 0.84 12.22C3.9 20.16 7.88 24 11.06 25.94C5.44 25.18 0.5 28 0.5 28C5.86 30.38 9.78 30.46 12.38 29.9C9.56 32.2 8.56 35.62 8.56 35.62C12.5 34.18 14.5 32.26 15.5 30.7V40H17.5Z" fill="#047247"></path>
					                  </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Cannabis Licence</p>
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
									</a>  -->
									<a href="/group/guest/application-form?applicationId=<%=String.valueOf(applications.getCannabisApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/application-form?applicationId=<%=String.valueOf(applications.getCannabisApplicationId())%>"> 
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
