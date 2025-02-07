<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<%
	List<SezStatusApplication> sezStatusApplicationDraftList = new ArrayList<SezStatusApplication>();
try{
		sezStatusApplicationDraftList = SezStatusApplicationLocalServiceUtil.getSezByS_U(
				DraftDashboardPortletKeys.DRAFT, themeDisplay.getUserId());
}catch(Exception e){}
	for(SezStatusApplication applications :sezStatusApplicationDraftList){ 
    	/* sezStatusApplicationFormRenderUrl.setParameter("sezStatusApplicationId",Validator.isNotNull(applications.getSezStatusApplicationId())?String.valueOf(applications.getSezStatusApplicationId()):""); */ 
    noRecordFoundDraftCases=false;
%>
	<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 90 90" fill="none"> 
			                             <path opacity="0.3" d="M38 61.96V16.4L42.7458 13.68H63.0847L74.6102 13L78 19.8V42.24V50.4V55.84L74.6102 64H44.1017L38 61.96Z" fill="#0C8D5A"></path> 
			                             <path opacity="0.3" d="M12 74.3333V29.6667L16.7419 27H37.0645L39.0968 52.3333V59L41.129 62.3333H54V69.6667L49.2581 77.6667L16.7419 79L12 74.3333Z" fill="#0C8D5A"></path> 
			                             <path fill-rule="evenodd" clip-rule="evenodd" d="M42.5 10C38.358 10 35 13.3579 35 17.5V25H17.5C13.3579 25 10 28.3579 10 32.5V72.5C10 76.642 13.3579 80 17.5 80H47.5C51.642 80 55 76.642 55 72.5V65H72.5C76.642 65 80 61.642 80 57.5V17.5C80 13.3579 76.642 10 72.5 10H42.5ZM50 65H42.5C38.358 65 35 61.642 35 57.5V30H17.5C16.1193 30 15 31.1193 15 32.5V72.5C15 73.8805 16.1193 75 17.5 75H47.5C48.8805 75 50 73.8805 50 72.5V65ZM40 17.5C40 16.1193 41.1195 15 42.5 15H72.5C73.8805 15 75 16.1193 75 17.5V57.5C75 58.8805 73.8805 60 72.5 60H42.5C41.1195 60 40 58.8805 40 57.5V17.5Z" fill="#0C8D5A"></path> 
			                             <path fill-rule="evenodd" clip-rule="evenodd" d="M45 27.5C45 26.1193 46.1195 25 47.5 25H67.5C68.8805 25 70 26.1193 70 27.5C70 28.8807 68.8805 30 67.5 30H47.5C46.1195 30 45 28.8807 45 27.5Z" fill="#0C8D5A"></path> 
			                             <path fill-rule="evenodd" clip-rule="evenodd" d="M45 37.5C45 36.1195 46.1195 35 47.5 35H57.5C58.8805 35 60 36.1195 60 37.5C60 38.8805 58.8805 40 57.5 40H47.5C46.1195 40 45 38.8805 45 37.5Z" fill="#0C8D5A"></path> 
                                    </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">SEZ Status</p>
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
								</a> --> 
								<a href="/group/guest/sez-status-application-form?sezStatusApplicationId=<%=String.valueOf(applications.getSezStatusApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/sez-status-application-form?sezStatusApplicationId=<%=String.valueOf(applications.getSezStatusApplicationId())%>">
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