<%@ include file="/init.jsp" %>
<%
      for (OsiInsolvencyApplication applications : osiInsolvencyApplicationList) {
	%>
<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									  <svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 198 198" fill="none"> 
						                      <path d="M99 8.67578L198 48.2758V61.4757H184.8C184.8 63.2632 184.095 64.8101 182.686 66.1163C181.277 67.4226 179.609 68.0758 177.684 68.0758H20.3157C18.3906 68.0758 16.7234 67.4226 15.3141 66.1163C13.9047 64.8101 13.2 63.2632 13.2 61.4757H0V48.2758L99 8.67578ZM26.4 74.6757H52.8V153.876H66V74.6757H92.4V153.876H105.6V74.6757H132V153.876H145.2V74.6757H171.6V153.876H177.684C179.609 153.876 181.277 154.529 182.686 155.835C184.095 157.141 184.8 158.688 184.8 160.476V167.076H13.2V160.476C13.2 158.688 13.9047 157.141 15.3141 155.835C16.7234 154.529 18.3906 153.876 20.3157 153.876H26.4V74.6757ZM190.884 173.676C192.809 173.676 194.477 174.329 195.886 175.635C197.295 176.941 198 178.488 198 180.276V193.476H0V180.276C0 178.488 0.704675 176.941 2.11403 175.635C3.52345 174.329 5.19065 173.676 7.11563 173.676H190.884Z" fill="#047247"></path> 
						                     </svg> 
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">OSI Insolvency Reports</p>
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
									<a href="" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" 
						href="/group/guest/osi-insolvency-reports-application-form?osiInsolvencyApplicationId=<%=String.valueOf(applications.getOsiInsolvencyId())%>"> 
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