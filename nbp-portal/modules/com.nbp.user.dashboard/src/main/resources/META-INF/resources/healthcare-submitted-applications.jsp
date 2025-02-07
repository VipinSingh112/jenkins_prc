<%@ include file="/init.jsp" %>
<%
	List<HealthApplicationStages> healthcareCurrentInProgressStages = null;
	HealthCareDescriptionOfService healthApplicationDOServices=null;
%>
<%
	for (HealthCareApplication applications : healthCareSubmittedApplicationsList) {
		String notificationInHealthCare="hide";
		String healthcareDefaultActive = "current-active";
		String healthStageStatus = "Submitted";
		 try{
		healthcareCurrentInProgressStages = HealthApplicationStagesLocalServiceUtil
				.getHealthcareStageBy_CI(applications.getCaseId());
		 }catch(Exception e){
			} 
		 
		 try{
			 healthApplicationDOServices=HealthCareDescriptionOfServiceLocalServiceUtil.getHealthCareById(applications.getHealthCareApplicationId());
		 }catch(Exception e){
			 
		 }
		String healthCareDashboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/healthcare-dashboard?healthcareApplicationId=";
		int expirationHealthDocumentCount=DashboardUtil.getExpirationHealthDocCount(applications.getHealthCareApplicationId(), themeDisplay);
		if(Validator.isNotNull(selectedApplication)){
			healthCareDashboardRenderURL = healthCareDashboardRenderURL+String.valueOf(applications.getHealthCareApplicationId())+"&selectedApplication="+selectedApplication;
		}else{
			healthCareDashboardRenderURL = healthCareDashboardRenderURL+String.valueOf(applications.getHealthCareApplicationId());
		}
		if (Validator.isNotNull(healthcareCurrentInProgressStages)) {
			healthcareDefaultActive = "unvisited";
		}
		  String pdfFileUrl ="";
		  FileEntry pdffileEntry = null;
		  try{
		  pdffileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
		  pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		  }catch(Exception e){
		  }
		  /* try{
			  checkDateInHealthCare=DashboardUtil.showHealthCareExpiredPermitNotification(applications.getCaseId());
			  if(Validator.isNotNull(checkDateInHealthCare)){
				  notificationInHealthCare="show";  
			  }
		  }catch(Exception e){} */
%>
<div class="second-card dash-common-card">
	<div class="row p-3">
		<div class="col-md-12">
			<div class="progress-plus-wizard-card row cursor-pointer"
				onclick="getHealthcareSingleApplicationOverview('<%=healthCareDashboardRenderURL%>')">
				<div class="d-flex col-lg-3">
					<div class="icon">
						<span class="mr-2"> 
							<svg xmlns="http://www.w3.org/2000/svg" width="38" height="38" viewBox="0 0 38 38" fill="#047247"><g clip-path="url(#clip0_733_121171)"><path d="M37.5913 15.7411L20.3413 0.407812C19.5746 -0.167187 18.6163 -0.167187 17.8496 0.407812L0.599648 15.7411C-0.167018 16.5078 -0.358685 17.6578 0.407981 18.4245C1.17465 19.1911 2.32465 19.3828 3.09131 18.6161L3.66631 17.8495V36.2495C3.66631 37.3995 4.43298 38.1661 5.58298 38.1661H32.4163C33.5663 38.1661 34.333 37.3995 34.333 36.2495V17.8495L34.908 18.4245C35.6746 19.1911 36.8246 18.9995 37.5913 18.2328C38.358 17.6578 38.358 16.3161 37.5913 15.7411ZM22.833 24.7495H20.9163V26.6661C20.9163 27.8161 20.1496 28.5828 18.9996 28.5828C17.8496 28.5828 17.083 27.8161 17.083 26.6661V24.7495H15.1663C14.0163 24.7495 13.2496 23.9828 13.2496 22.8328C13.2496 21.6828 14.0163 20.9161 15.1663 20.9161H17.083V18.9995C17.083 17.8495 17.8496 17.0828 18.9996 17.0828C20.1496 17.0828 20.9163 17.8495 20.9163 18.9995V20.9161H22.833C23.983 20.9161 24.7496 21.6828 24.7496 22.8328C24.7496 23.9828 23.983 24.7495 22.833 24.7495Z" fill="#047247" /></g><defs><clipPath id="clip0_733_121171"><rect width="38" height="38" fill="#047247" /></clipPath> </defs></svg>
						</span>
					</div>
					<div class="left-part">
						<p class="dash-card-licence-heading mb-2">HealthCare Application Transaction Number</p>
						<div class="dash-conditional-box">
							<div class="dash-conditional-box-left">
								<span class="dash-card-number-heading"> <%=applications.getApplicationNumber()%></span>
							</div>
						</div>
					</div>
				</div>
				<div class="tier-plus-issuedate-box justify-content-between">
					<div class="single-box">
						<p class="upper-title">Category</p>
						<p class="lower-title">
							<span class="one"><%=Validator.isNotNull(healthApplicationDOServices)?healthApplicationDOServices.getDescriptionOfService():"" %></span>
						</p>
					</div>
				</div>
				<div class="right-part d-flex col-lg-3 justify-content-end">
					<div class="dash-status-box">
						<p class="dash-status">Status</p>
						<p class="dash-status-type">
							<span class="circle"></span> <span class="dash-status-type-info"><%=UserDashboardPortletKeys.getStatusLabel(applications.getStatus())%></span>
						</p>
					</div>
					<div class="dash-action-box d-flex">
						<a href="<%=pdfFileUrl%>" type="button" class="dash-action-btns mr-2 common-yellow-bg"  data-toggle="tooltip" title="Download Application Transcript"> 
							<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path></svg>
						</a>
						<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="<%=applications.getApplicationNumber() %> Details"> 
							<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path></svg>
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
							<li class="start-active <%=healthcareDefaultActive%> manufacturing-process">
								<div class="dashboard-progress-card">
									<p class="dashboard-progress-card-title">Application Submission</p>
									<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
									<div class="dashboard-progress-card-status"><span></span><%=healthStageStatus%></div>
								</div>
							</li>
							<%
								try{
									String stageJson = HealthApplicationStagesLocalServiceUtil
											.getHealthCurrentStages(applications.getCaseId());
									if (Validator.isNotNull(stageJson)) {
										JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
										for (int i = 0; i < stagesArray.length(); ++i) {
											JSONObject currentStage = stagesArray.getJSONObject(i);
							%>
							<li
								class='<%=currentStage.getString("status").equals("In Progress")
								|| currentStage.getString("status").equals("Open") ? "current-active" : "unvisited"%> <%=currentStage.getString("status").equals("Closed") ? "start-active" : ""%> manufacturing-process'>
								<div class="dashboard-progress-card">
									<%
										if (Validator.isNotNull(currentStage.getString("duration"))) {
									%>
									<p class="dashboard-progress-card-duration"><%=currentStage.getString("duration")%></p>
									<%
										}
									%>
									<div class="d-flex align-items-center">
										<p class="dashboard-progress-card-title"><%=currentStage.getString("startDate")%>
										</p>
										<%
											if (Validator.isNotNull(currentStage.getString("endDate"))) {
										%>
										<div class="dashboard-progress-card-title px-1">-</div>
										<%
											}
										%>
										<p class="dashboard-progress-card-title">
											<%=currentStage.getString("endDate")%></p>
									</div>
									<p class="dashboard-progress-card-title"><%=currentStage.getString("stageName")%></p>
									
										<%
											if (Validator.isNotNull(currentStage.getString("status"))) {
										%>
											<div class="dashboard-progress-card-status">
												<span></span>
												<%=currentStage.getString("status")%>
											</div>
										<%
											}
										%>
								</div>
							</li>
							<%
								}
									}
								}catch(Exception e){
									
								}
							%>
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
	<div class="row p-3">
		<div class="col-md-12">
			<div class="lower  dash-lower-multiple-links-box">
				<a class="dash-yellow-repeated-link" onclick="getSingleHealthcareApplicationSpecificStage('<%=healthCareDashboardRenderURL%>', 'overview', 'guest-overview-tab')">Overview</a> 
				<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> Discussion and Support 
				<span class="ml-2">
					<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path> </svg>
				</span>
				</a>
			</div>
		</div>
	</div>
	<%
			if (expirationHealthDocumentCount > 0) {
		%>
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
							<p class="three">Your <%=expirationHealthDocumentCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleHealthcareApplicationSpecificStage('<%=healthCareDashboardRenderURL%>', 'healthcare-document', 'healthcare-document-tab')"> Update document
								<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" /></svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%
			}
		%>
</div>
<%-- <div class="dash-light-cream-box common-dash-colored-boxes <%=notificationInHealthCare%>">
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
							<p class="two">Licence Expiration</p>
							<p class="three"><%=Validator.isNotNull(checkDateInHealthCare)?checkDateInHealthCare:"" %> <span> Renewal Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingletourismApplicationSpecificStage('<%=healthCareDashboardRenderURL%>', 'healthcare-document', 'healthcare-document-tab')">
								Apply for Licence extension
								<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" /></svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div> --%>
<%}%>