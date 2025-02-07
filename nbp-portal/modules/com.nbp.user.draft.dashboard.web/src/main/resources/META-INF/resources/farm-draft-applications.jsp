<%@ include file="/init.jsp" %>
	<%
		for (FarmerApplication applications : farmerDraftApplicationsList) {
			farmAplicationFormRenderURL.setParameter("applicationId",String.valueOf(applications.getFarmerApplicationId()));
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="44" height="35" viewBox="0 0 44 35" fill="none">
										<path d="M6.99937 19C5.13937 19 3.43937 19.56 1.99937 20.52V11C1.99937 8.80002 3.79937 7.00001 5.99937 7.00001H18.5794L20.6994 4.88001L17.8794 2.06001L19.2994 0.640015L26.3594 7.70001L24.9394 9.12001L22.1194 6.30001L19.9994 8.42001V13C19.9994 15.2 21.7994 17 23.9994 17H25.0794C23.1794 19.12 21.9994 21.92 21.9994 25C21.9994 25.68 22.0794 26.34 22.1794 27H15.8994C15.3994 22.5 11.6194 19 6.99937 19Z" fill="#047247"/>
										<path d="M7 21C10.86 21 14 24.14 14 28C14 31.86 10.86 35 7 35C3.14 35 0 31.86 0 28C0 24.14 3.14 21 7 21ZM7 31C8.66 31 10 29.66 10 28C10 26.34 8.66 25 7 25C5.34 25 4 26.34 4 28C4 29.66 5.34 31 7 31Z" fill="#047247"/>
										<path d="M38 13H28C28 10.8 29.8 9 32 9H38C39.1 9 40 9.9 40 11C40 12.1 39.1 13 38 13Z" fill="#047247"/>
										<path d="M26.34 22.64L26.7 21.7L24.84 21C25.76 18.88 27.4 17.18 29.46 16.14L30.26 17.92L31.18 17.5L30.38 15.7C31.48 15.26 32.72 15 34 15C35.06 15 36.08 15.22 37.04 15.52L36.36 17.34L37.3 17.7L38 15.84C40.12 16.76 41.82 18.4 42.86 20.46L41.08 21.26L41.5 22.18L43.3 21.38C43.74 22.48 44 23.72 44 25C44 26.06 43.78 27.08 43.48 28.04L41.66 27.36L41.3 28.3L43.16 29C42.24 31.12 40.6 32.82 38.54 33.86L37.74 32.08L36.82 32.5L37.62 34.3C36.52 34.74 35.28 35 34 35C32.94 35 31.92 34.78 30.96 34.48L31.64 32.66L30.7 32.3L30 34.16C27.88 33.24 26.18 31.6 25.14 29.54L26.92 28.74L26.5 27.82L24.7 28.62C24.26 27.52 24 26.28 24 25C24 23.94 24.22 22.92 24.52 21.96L26.34 22.64ZM31.7 30.54C34.76 31.8 38.28 30.36 39.54 27.3C40.8 24.24 39.36 20.72 36.3 19.46C33.24 18.2 29.72 19.64 28.46 22.7C27.18 25.76 28.64 29.28 31.7 30.54Z" fill="#047247"/>
									</svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Farmer Licence</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> <%=applications.getApplicationNumber()%>
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
								<!-- <a href="javascript:void(0);" class="dash-action-btns mr-2 common-yellow-bg">
									<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
					                   <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
					                </svg>	
								</a> --> 
								<a href="/group/guest/farm-application-form?farmApplicationId=<%=String.valueOf(applications.getFarmerApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/farm-application-form?farmApplicationId=<%=String.valueOf(applications.getFarmerApplicationId())%>">
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
