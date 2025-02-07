<%@page import="com.nbp.sez.status.application.stage.services.service.SezStatusApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.sez.status.application.stage.services.service.SezStatusWFHApplicationStagesLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="org.apache.commons.lang3.Validate"%>
<%@page import="javax.validation.Valid"%>
<%@ include file="/init.jsp" %>
<%
	if(sezStatusSubmittedApplicationList!=null){
	for(SezStatusApplication sezApplication : sezStatusSubmittedApplicationList){
		String notification="hide";
		String sezStatusDashboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/sez-status-dashboard?sezStatusApplicationId=";
		int expirationSezDocCount=DashboardUtil.getExpirationSezStatusDocCount(sezApplication.getSezStatusApplicationId(), themeDisplay);
		if(Validator.isNotNull(selectedApplication)){
			sezStatusDashboardRenderURL = sezStatusDashboardRenderURL+String.valueOf(sezApplication.getSezStatusApplicationId())+"&selectedApplication="+selectedApplication;
		}else{
			sezStatusDashboardRenderURL = sezStatusDashboardRenderURL+String.valueOf(sezApplication.getSezStatusApplicationId());
		}
		  String pdfFileUrl ="";
		  FileEntry pdffileEntry = null;
		  try{
		  pdffileEntry = DLAppLocalServiceUtil.getFileEntry(sezApplication.getPdfFileEntryId());
		  pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		  }catch(Exception e){}
%> 
<div class="second-card dash-common-card">
	<div class="container-fluid">
		<div class="row py-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer"
					onclick="getSezStatusSingleApplicationOverview('<%=sezStatusDashboardRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" viewBox="0 0 90 90" fill="none"> 
				                    <path opacity="0.3" d="M38 61.96V16.4L42.7458 13.68H63.0847L74.6102 13L78 19.8V42.24V50.4V55.84L74.6102 64H44.1017L38 61.96Z" fill="#0C8D5A"></path> 
				                    <path opacity="0.3" d="M12 74.3333V29.6667L16.7419 27H37.0645L39.0968 52.3333V59L41.129 62.3333H54V69.6667L49.2581 77.6667L16.7419 79L12 74.3333Z" fill="#0C8D5A"></path> 
				                    <path fill-rule="evenodd" clip-rule="evenodd" d="M42.5 10C38.358 10 35 13.3579 35 17.5V25H17.5C13.3579 25 10 28.3579 10 32.5V72.5C10 76.642 13.3579 80 17.5 80H47.5C51.642 80 55 76.642 55 72.5V65H72.5C76.642 65 80 61.642 80 57.5V17.5C80 13.3579 76.642 10 72.5 10H42.5ZM50 65H42.5C38.358 65 35 61.642 35 57.5V30H17.5C16.1193 30 15 31.1193 15 32.5V72.5C15 73.8805 16.1193 75 17.5 75H47.5C48.8805 75 50 73.8805 50 72.5V65ZM40 17.5C40 16.1193 41.1195 15 42.5 15H72.5C73.8805 15 75 16.1193 75 17.5V57.5C75 58.8805 73.8805 60 72.5 60H42.5C41.1195 60 40 58.8805 40 57.5V17.5Z" fill="#0C8D5A"></path> 
				                    <path fill-rule="evenodd" clip-rule="evenodd" d="M45 27.5C45 26.1193 46.1195 25 47.5 25H67.5C68.8805 25 70 26.1193 70 27.5C70 28.8807 68.8805 30 67.5 30H47.5C46.1195 30 45 28.8807 45 27.5Z" fill="#0C8D5A"></path> 
				                    <path fill-rule="evenodd" clip-rule="evenodd" d="M45 37.5C45 36.1195 46.1195 35 47.5 35H57.5C58.8805 35 60 36.1195 60 37.5C60 38.8805 58.8805 40 57.5 40H47.5C46.1195 40 45 38.8805 45 37.5Z" fill="#0C8D5A"></path> 
				                 </svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">SEZ Status Application Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"> 
									<%=sezApplication.getApplicationNumber()%>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Category</p>
							<p class="lower-title"><%=sezApplication.getDoYouWantTo()%><span class="one"> </span></p>
						</div>
					</div>
					<div class="right-part d-flex col-lg-3 justify-content-end">
						<div class="dash-status-box">
							<p class="dash-status">Status</p>
							<p class="dash-status-type">
								<span class="circle"></span> <span class="dash-status-type-info"><%=UserDashboardPortletKeys.getStatusLabel(sezApplication.getStatus())%></span>
							</p>
						</div>
						<div class="dash-action-box d-flex">
							<a href="<%=Validator.isNotNull(pdfFileUrl)?pdfFileUrl:"javascript:void(0)"%>" type="button" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
								<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path></svg>
							</a> 
							<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg" data-toggle="tooltip" title="<%=sezApplication.getApplicationNumber()%> Details"> 
								<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path></svg>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 col-md-12">
				<div class="form-wizard">
					<form action="" method="post" role="form">
						<div class="form-wizard-header">
									<ul class="list-unstyled form-wizard-steps clearfix">
									<li class="start-active <%=defaultActive%> film-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(sezApplication.getCreateDate())%></p>
										<div class="dashboard-progress-card-status">
											<span></span><%=stageStatus %>
										</div>
									</div>
								</li>
							<%try{
								String stageJson =null;
								if(sezApplication.getDoYouWantTo().contains("Submit an Application for A Work From Home Certificate")){
									 stageJson = SezStatusWFHApplicationStagesLocalServiceUtil.getSezStatusCurrentStages(sezApplication.getCaseId());
								}else{
									stageJson = SezStatusApplicationStagesLocalServiceUtil.getSezStatusCurrentStages(sezApplication.getCaseId());
								}
								if(Validator.isNotNull(stageJson)){
									JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
									for(int i=0 ;i<stagesArray.length();++i){
										JSONObject currentStage = stagesArray.getJSONObject(i);
										%>
										<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> film-progress'>
											<div class="dashboard-progress-card">
												<%if(Validator.isNotNull(currentStage.getString("duration"))){%>
													<p class="dashboard-progress-card-duration"><%=currentStage.getString("duration") %></p>
														<%}%>
												<div class="d-flex align-items-center">
													<p class="dashboard-progress-card-title"><%=currentStage.getString("startDate") %> </p>
													<%if(Validator.isNotNull(currentStage.getString("endDate"))){%>
															<div class="dashboard-progress-card-title px-1">-</div>
														<%}%>
													<p class="dashboard-progress-card-title"> <%=currentStage.getString("endDate") %></p>
												</div>
												<p class="dashboard-progress-card-title"><%=currentStage.getString("stageName") %></p>
												<%if(Validator.isNotNull(currentStage.getString("status"))){%>
												<div class="dashboard-progress-card-status">
													<span></span><%=currentStage.getString("status") %>
												</div><%}%>
											</div>
										</li>
										<%}}}catch(Exception e){}%>
									<li class="last">
										<div class="dashboard-progress-card">
											<span></span>
										</div>
									</li>
								</ul>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="row py-3">
			<div class="col-md-12">
				<div class="lower  dash-lower-multiple-links-box">
					<a class="dash-yellow-repeated-link" onclick="getSezStatusApplicationSpecificStage(' <%=sezStatusDashboardRenderURL%>', 'overview', 'sez-status-overview-tab')">Overview</a>
					<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> 
						Discussion and Support 
						<span class="ml-2"> 
							<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path></svg>
						</span>
					</a>
				</div>
			</div>
		</div>

		<%if (expirationSezDocCount > 0) {%>
		<div class="dash-light-cream-box common-dash-colored-boxes">
			<div class="row">
				<div class="col-md-1">
					<div class="icon">
						<span> 
							<svg width="25" height="24" viewBox="0 0 25 24" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M12.5 21C13.6046 21 14.5 20.1046 14.5 19C14.5 17.8954 13.6046 17 12.5 17C11.3954 17 10.5 17.8954 10.5 19C10.5 20.1046 11.3954 21 12.5 21Z" fill="#282524"></path><path d="M10.5 3H14.5V15H10.5V3Z" fill="#282524"></path></svg>
						</span>
					</div>
				</div>
				<div class="col-md-11">
					<div class="approval-wrapper">
						<div class="approval-box-left">
							<p class="two">Supporting Document required Expiration</p>
							<p class="three">Your <%=expirationSezDocCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSezStatusApplicationSpecificStage('<%=sezStatusDashboardRenderURL%>', 'sez-status-document', 'sez-status-document-tab')">Update document
								<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" /></svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div><% } %>
	</div>
</div><%}}%>