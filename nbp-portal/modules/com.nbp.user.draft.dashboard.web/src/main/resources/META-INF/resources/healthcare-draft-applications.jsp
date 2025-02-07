<%@ include file="/init.jsp" %>
<%
      for (HealthCareApplication applications : healthCareDraftApplicationList) {
		healthCareApplicationFormRenderURL.setParameter("healthCareApplicationId",String.valueOf(applications.getHealthCareApplicationId()));
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									 <svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 38 38" fill="#047247"> 
			                            <g clip-path="url(#clip0_733_121171)"> 
			                             <path d="M37.5913 15.7411L20.3413 0.407812C19.5746 -0.167187 18.6163 -0.167187 17.8496 0.407812L0.599648 15.7411C-0.167018 16.5078 -0.358685 17.6578 0.407981 18.4245C1.17465 19.1911 2.32465 19.3828 3.09131 18.6161L3.66631 17.8495V36.2495C3.66631 37.3995 4.43298 38.1661 5.58298 38.1661H32.4163C33.5663 38.1661 34.333 37.3995 34.333 36.2495V17.8495L34.908 18.4245C35.6746 19.1911 36.8246 18.9995 37.5913 18.2328C38.358 17.6578 38.358 16.3161 37.5913 15.7411ZM22.833 24.7495H20.9163V26.6661C20.9163 27.8161 20.1496 28.5828 18.9996 28.5828C17.8496 28.5828 17.083 27.8161 17.083 26.6661V24.7495H15.1663C14.0163 24.7495 13.2496 23.9828 13.2496 22.8328C13.2496 21.6828 14.0163 20.9161 15.1663 20.9161H17.083V18.9995C17.083 17.8495 17.8496 17.0828 18.9996 17.0828C20.1496 17.0828 20.9163 17.8495 20.9163 18.9995V20.9161H22.833C23.983 20.9161 24.7496 21.6828 24.7496 22.8328C24.7496 23.9828 23.983 24.7495 22.833 24.7495Z" fill="#047247"></path> 
			                            </g> 
			                            <defs> 
			                             <clipPath id="clip0_733_121171"> 
			                              <rect width="38" height="38" fill="#047247"></rect> 
			                             </clipPath> 
			                            </defs> 
                                     </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">HealthCare Licence</p>
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
									<a href="<%=healthCareApplicationFormRenderURL.toString()%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/healthcare-application-form?healthcareApplicationId=<%=String.valueOf(applications.getHealthCareApplicationId())%>"> 
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
