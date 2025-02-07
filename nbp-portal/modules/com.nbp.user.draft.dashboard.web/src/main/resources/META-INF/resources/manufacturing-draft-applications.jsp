<%@ include file="/init.jsp" %>
<%
Format manudateFormatter = new SimpleDateFormat("dd/MM/yyyy");
 for(ManufacturingApplication applications :manufacturingDraftApplicationsList){ 
	manufacturingAplicationFormRenderURL.setParameter("manufacturingApplicationId", String.valueOf(applications.getManufacturingApplicationId()));
%>
	<div class="second-card dash-common-card draft-card">
		<div class="row pt-3 px-3 pb-0">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card">
					<div class="d-flex ">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 48 48" fill="none">
									<path d="M26.88 32.57C25.0065 33.1456 23.0035 33.1456 21.13 32.57L24 35.93L26.88 32.57ZM11 34.47L7.67 35.65C5.71939 36.3389 4.03043 37.6157 2.83584 39.3046C1.64126 40.9935 0.999849 43.0113 1 45.08V47H9V42C9.00072 41.2985 9.18589 40.6096 9.53692 40.0023C9.88796 39.395 10.3925 38.8907 11 38.54V34.47ZM15 38V33.06L12.94 33.79C13 34 13 33.81 13 38H15ZM23.14 38L18 32L16.94 32.38C17.04 32.63 17 32.6 17 38H23.14ZM35 40C10.1 40 13 39.93 12.22 40.16C11.8585 40.3131 11.5501 40.5692 11.3331 40.8964C11.1162 41.2236 11.0003 41.6074 11 42V47H37V42C37 41.4696 36.7893 40.9609 36.4142 40.5858C36.0391 40.2107 35.5304 40 35 40ZM31 32.71C31 32.24 31.38 32.49 30 32L24.86 38H31V32.71ZM33 38H35V34.12C35 33.64 35.54 33.96 33 33.06V38ZM32 20H16V23C16.0003 24.6248 16.4954 26.2111 17.4193 27.5476C18.3433 28.8842 19.6523 29.9078 21.1723 30.4821C22.6922 31.0564 24.351 31.1543 25.928 30.7627C27.5049 30.3711 28.9253 29.5086 30 28.29C32.31 25.66 32 23.21 32 20ZM36 20H34V22C34.5304 22 35.0391 21.7893 35.4142 21.4142C35.7893 21.0391 36 20.5304 36 20ZM14 22V20H12C12 20.5304 12.2107 21.0391 12.5858 21.4142C12.9609 21.7893 13.4696 22 14 22Z" fill="#047247"/>
									<path d="M34 14H14C13.4477 14 13 14.4477 13 15V17C13 17.5523 13.4477 18 14 18H34C34.5523 18 35 17.5523 35 17V15C35 14.4477 34.5523 14 34 14Z" fill="#047247"/>
									<path d="M19 12H28C28 11.7348 28.1054 11.4804 28.2929 11.2929C28.4804 11.1054 28.7348 11 29 11C29.2652 11 29.5196 11.1054 29.7071 11.2929C29.8946 11.4804 30 11.7348 30 12H34C34.0009 10.2257 33.4119 8.50153 32.3258 7.09858C31.2396 5.69563 29.7179 4.69356 28 4.25V9C28 9.26522 27.8946 9.51957 27.7071 9.70711C27.5196 9.89464 27.2652 10 27 10H21C20.7348 10 20.4804 9.89464 20.2929 9.70711C20.1054 9.51957 20 9.26522 20 9V4.25C18.2821 4.69356 16.7604 5.69563 15.6742 7.09858C14.5881 8.50153 13.9991 10.2257 14 12H17C17 11.7348 17.1054 11.4804 17.2929 11.2929C17.4804 11.1054 17.7348 11 18 11C18.2652 11 18.5196 11.1054 18.7071 11.2929C18.8946 11.4804 19 11.7348 19 12V12Z" fill="#047247"/>
									<path d="M26 1H22V8H26V1Z" fill="#047247"/>
									<path d="M45 15H41L39 19C40.2561 19.5714 41.62 19.8671 43 19.8671C44.38 19.8671 45.7439 19.5714 47 19L45 15Z" fill="#047247"/>
									<path d="M43 11L42 13H44L43 11Z" fill="#047247"/>
									<path d="M39 47.0002H42V21.8302C40.976 21.7323 39.9683 21.5073 39 21.1602V47.0002ZM44 47.0002H47V21.1802C46.0389 21.5531 45.028 21.7823 44 21.8602V47.0002Z" fill="#047247"/>
								</svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Manufacturing Licence</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"> <%=applications.getApplicationNumber() %>
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
									<span class="one"> <%=manudateFormatter.format(applications.getCreateDate()) %></span>
								</p>
							</div>
							<div class="single-box">
								<p class="upper-title">Last Modified Date</p>
								<p class="lower-title">
									<span class="one"> <%=manudateFormatter.format(applications.getModifiedDate())%></span>
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
							<!-- <a href="#" class="dash-action-btns mr-2 common-yellow-bg"> 
								<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
										<path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
				               </svg>
							</a>  -->
							<a href="/group/guest/manufacturing-application-form?manufacturingApplicationId=<%=String.valueOf(applications.getManufacturingApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
				<div
					class="lower  dash-lower-multiple-links-box d-flex justify-content-end">
					<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/manufacturing-application-form?manufacturingApplicationId=<%=String.valueOf(applications.getManufacturingApplicationId())%>">
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
