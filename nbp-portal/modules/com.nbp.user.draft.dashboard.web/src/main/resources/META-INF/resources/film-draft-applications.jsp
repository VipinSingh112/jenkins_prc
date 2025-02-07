<%@ include file="/init.jsp" %>
	<%
		for (FilmApplication applications : filmDraftApplicationsList) {
		filmAplicationFormRenderURL.setParameter("applicationId",String.valueOf(applications.getFilmApplicationId()));
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="32" height="30" viewBox="0 0 32 30" fill="none">
												<path d="M30.3375 11.3741H4.70289L30.1288 6.23841C30.7623 6.11757 31.1721 5.50582 31.0529 4.87141L30.3897 1.44259C30.2704 0.808183 29.6594 0.40035 29.026 0.52119L1.44639 6.0798C0.812981 6.20064 0.403125 6.81239 0.522356 7.43925L1.18558 10.8681C1.23029 11.0795 1.34207 11.2608 1.4762 11.4118C0.92476 11.5025 0.5 11.9556 0.5 12.5372V28.3369C0.5 28.9789 1.02163 29.5 1.6625 29.5H30.3375C30.9784 29.5 31.5 28.9789 31.5 28.3369V12.5372C31.5 11.8952 30.9784 11.3741 30.3375 11.3741ZM19.6514 26.0561L15.8733 23.3145L12.0952 26.0561L13.5483 21.6454L9.76274 18.9265H14.4351L15.8659 14.5159L17.3041 18.9265H21.9764L18.1909 21.6454L19.6514 26.0561Z" fill="#047247"/>
											</svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Film Licence</p>
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
								<a href="/group/guest/film-application-form?applicationId=<%=String.valueOf(applications.getFilmApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/film-application-form?applicationId=<%=String.valueOf(applications.getFilmApplicationId())%>"> 
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
