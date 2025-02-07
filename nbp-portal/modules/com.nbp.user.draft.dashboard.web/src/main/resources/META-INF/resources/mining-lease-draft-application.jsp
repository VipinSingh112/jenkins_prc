<%@page import="com.nbp.mining.lease.application.service.model.MiningLeaseApplication"%>
<%@ include file="/init.jsp" %>
<%
		for (MiningLeaseApplication applications : miningDraftApplicationsList) {
			/* miningApplicationRenderUrl.setParameter("miningLeaseApplicationId",String.valueOf(applications.getMiningLeaseApplicationId())); */
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									 <svg width="33" height="40" viewBox="0 0 220 220" fill="none" xmlns="http://www.w3.org/2000/svg"> 
                                         <path d="M144.375 144.375H75.625C56.375 144.375 41.25 159.5 41.25 178.75V199.375C41.25 202.812 44.6875 206.25 48.125 206.25H171.875C175.312 206.25 178.75 202.812 178.75 199.375V178.75C178.75 159.5 163.625 144.375 144.375 144.375ZM108.625 178.75L99.6875 158.125H114.813L108.625 178.75ZM110 13.75C106.562 13.75 103.125 17.1875 103.125 20.625V28.1875C79.75 31.625 61.875 51.5625 61.875 75.625V82.5C58.4375 82.5 55 85.9375 55 89.375C55 92.8125 58.4375 96.25 61.875 96.25H69.4375C72.875 115.5 89.375 130.625 110 130.625C130.625 130.625 147.125 115.5 150.562 96.25H158.125C161.562 96.25 165 92.8125 165 89.375C165 85.9375 161.562 82.5 158.125 82.5V75.625C158.125 51.5625 140.25 31.625 116.875 28.1875V20.625C116.875 17.1875 113.438 13.75 110 13.75ZM105.188 57.0625C107.938 54.3125 112.063 54.3125 114.813 57.0625C116.188 58.4375 116.875 59.8125 116.875 61.875C116.875 63.9375 116.188 65.3125 114.813 66.6875C113.438 68.0625 112.063 68.75 110 68.75C107.937 68.75 106.563 68.0625 105.188 66.6875C103.813 65.3125 103.125 63.9375 103.125 61.875C103.125 59.8125 103.813 58.4375 105.188 57.0625ZM136.812 96.25C133.375 107.938 123.062 116.875 110 116.875C96.9375 116.875 86.625 107.938 83.1875 96.25H136.812Z"
									        fill="#047247">
									     </path> 
                                     </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Mining Lease Application</p>
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
									<a href="/group/guest/mining-application-form?miningLeaseApplicationId=<%=String.valueOf(applications.getMiningLeaseApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/mining-application-form?miningLeaseApplicationId=<%=String.valueOf(applications.getMiningLeaseApplicationId())%>"> 
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
