<%@ include file="/init.jsp" %>
<% 
for(PharmaApplication applications :pharmaDraftApplicationsList){ 
	pharmaAplicationFormRenderURL.setParameter("applicationId", String.valueOf(applications.getPharmaApplicationId()));
%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card" onclick="getPharmaApplicationPage('<%=pharmaAplicationFormRenderURL%>')">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									<svg xmlns="http://www.w3.org/2000/svg" width="23" height="40" viewBox="0 0 23 40" fill="none"> 
                             			<path d="M2.7025 9.5H4.75V7.88C4.3153 7.73689 3.93658 7.46075 3.66741 7.09064C3.39823 6.72052 3.25221 6.27515 3.25 5.8175V2.6825C3.25198 2.10427 3.48255 1.55029 3.89142 1.14142C4.30029 0.732553 4.85427 0.501977 5.4325 0.5H17.5675C18.1457 0.501977 18.6997 0.732553 19.1086 1.14142C19.5174 1.55029 19.748 2.10427 19.75 2.6825V5.8175C19.7478 6.27515 19.6018 6.72052 19.3326 7.09064C19.0634 7.46075 18.6847 7.73689 18.25 7.88V9.5H20.2975C20.9473 9.50198 21.57 9.761 22.0295 10.2205C22.489 10.68 22.748 11.3027 22.75 11.9525V37.0475C22.748 37.6973 22.489 38.32 22.0295 38.7795C21.57 39.239 20.9473 39.498 20.2975 39.5H2.7025C2.05267 39.498 1.43001 39.239 0.970505 38.7795C0.511002 38.32 0.251978 37.6973 0.25 37.0475V11.9525C0.251978 11.3027 0.511002 10.68 0.970505 10.2205C1.43001 9.761 2.05267 9.50198 2.7025 9.5ZM21.25 15.5H1.75V33.5H21.25V15.5ZM4.75 2.6825V5.8175C4.75 5.99851 4.82191 6.17211 4.9499 6.3001C5.07789 6.42809 5.25149 6.5 5.4325 6.5H7V2H5.4325C5.25149 2 5.07789 2.07191 4.9499 2.1999C4.82191 2.32789 4.75 2.50149 4.75 2.6825ZM10.75 6.5V2H8.5V6.5H10.75ZM14.5 6.5V2H12.25V6.5H14.5ZM18.25 2.6825C18.25 2.50149 18.1781 2.32789 18.0501 2.1999C17.9221 2.07191 17.7485 2 17.5675 2H16V6.5H17.5675C17.7485 6.5 17.9221 6.42809 18.0501 6.3001C18.1781 6.17211 18.25 5.99851 18.25 5.8175V2.6825ZM16.75 8H6.25V9.5H16.75V8ZM20.2975 11H2.7025C2.44988 11 2.20761 11.1004 2.02898 11.279C1.85035 11.4576 1.75 11.6999 1.75 11.9525V14H21.25V11.9525C21.25 11.6999 21.1496 11.4576 20.971 11.279C20.7924 11.1004 20.5501 11 20.2975 11ZM2.7025 38H20.2975C20.5501 38 20.7924 37.8996 20.971 37.721C21.1496 37.5424 21.25 37.3001 21.25 37.0475V35H1.75V37.0475C1.75 37.3001 1.85035 37.5424 2.02898 37.721C2.20761 37.8996 2.44988 38 2.7025 38Z" fill="#047247"></path> 
                           	 		</svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Pharmaceutical
									Licence</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> <%=applications.getApplicationNumber() %>
										</span>
									</div>
								</div>
							</div>
						</div>
						<div class="right-part d-flex  justify-content-end">
							<div class="tier-plus-issuedate-box  justify-content-between pr-lg-5">
								<div class="single-box px-lg-5">
									<p class="upper-title">Created Date</p>
									<p class="lower-title">
										<span class="one"> <%=dateFormatter.format(applications.getCreateDate()) %></span>
									</p>
								</div>
								<div class="single-box">
									<p class="upper-title">Last Modified Date</p>
									<p class="lower-title">
										<span class="one"><%=dateFormatter.format(applications.getModifiedDate())%> </span>
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
							<!-- 	<a href="javascript:void(0);" class="dash-action-btns mr-2 common-yellow-bg">
									<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
					                    <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
					                </svg>
								</a>  -->
								<a href="/group/guest/pharmaceutical-license-application-form?_com_nbp_pharmaceutical_application_form_web_PharmaceuticalApplicationFormPortlet_applicationId=<%=String.valueOf(applications.getPharmaApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
					<div class="lower  dash-lower-multiple-links-box d-flex justify-content-end">
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/pharmaceutical-license-application-form?_com_nbp_pharmaceutical_application_form_web_PharmaceuticalApplicationFormPortlet_applicationId=<%=String.valueOf(applications.getPharmaApplicationId())%>">
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
<% } %>
<div id="dashboard-progress-single-application" style="display: none;"></div>