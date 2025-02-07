<%@ include file="/init.jsp" %>
<%String checkDateInPharma="";
List<PharmaApplication> pharamApplications = new ArrayList<PharmaApplication>();
pharamApplications = PharmaApplicationLocalServiceUtil.getPharmaByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
List<PharmaApplicationStages> pharmaCurrentInProgressStages=null;
		for(PharmaApplication applications :pharmaSubmittedApplicationsList){
			String notification="hide";
			String pharmaDashboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/pharmaceutical-dashboard?pharmaApplicationId=";
			int expirationPharmaDocumentCount=DashboardUtil.getExpirationPharmaDocCount(applications.getPharmaApplicationId(), themeDisplay);
			if(Validator.isNotNull(selectedApplication)){
				pharmaDashboardRenderURL = pharmaDashboardRenderURL+String.valueOf(applications.getPharmaApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				pharmaDashboardRenderURL = pharmaDashboardRenderURL+String.valueOf(applications.getPharmaApplicationId());
			}
			try{
				pharmaCurrentInProgressStages = PharmaApplicationStagesLocalServiceUtil.getPharmaApplicationStagesByCaseId(applications.getCaseld());
			}catch(Exception e){
				e.printStackTrace();
			}
			if(Validator.isNotNull(pharmaCurrentInProgressStages)){
				defaultActive="unvisited";
			}
			  String pdfFileUrl ="";
			  FileEntry pdffileEntry = null;
			  try{
			  pdffileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
			  pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			  }catch(Exception e){}
			  try{
				  checkDateInPharma=DashboardUtil.showPharmaExpiredLiceseNotification(applications.getCaseld());
				  if(Validator.isNotNull(checkDateInPharma)){
					  notification="show";  
				  }
			  }catch(Exception e){
				  e.printStackTrace(); }
		%>
		<div class="second-card dash-common-card">
			<div class="row p-3">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card row cursor-pointer"
						onclick="getPharmaSingleApplicationOverview('<%=pharmaDashboardRenderURL%>')">
						<div class="d-flex col-lg-3">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="23" height="40" viewBox="0 0 23 40" fill="none"> <path d="M2.7025 9.5H4.75V7.88C4.3153 7.73689 3.93658 7.46075 3.66741 7.09064C3.39823 6.72052 3.25221 6.27515 3.25 5.8175V2.6825C3.25198 2.10427 3.48255 1.55029 3.89142 1.14142C4.30029 0.732553 4.85427 0.501977 5.4325 0.5H17.5675C18.1457 0.501977 18.6997 0.732553 19.1086 1.14142C19.5174 1.55029 19.748 2.10427 19.75 2.6825V5.8175C19.7478 6.27515 19.6018 6.72052 19.3326 7.09064C19.0634 7.46075 18.6847 7.73689 18.25 7.88V9.5H20.2975C20.9473 9.50198 21.57 9.761 22.0295 10.2205C22.489 10.68 22.748 11.3027 22.75 11.9525V37.0475C22.748 37.6973 22.489 38.32 22.0295 38.7795C21.57 39.239 20.9473 39.498 20.2975 39.5H2.7025C2.05267 39.498 1.43001 39.239 0.970505 38.7795C0.511002 38.32 0.251978 37.6973 0.25 37.0475V11.9525C0.251978 11.3027 0.511002 10.68 0.970505 10.2205C1.43001 9.761 2.05267 9.50198 2.7025 9.5ZM21.25 15.5H1.75V33.5H21.25V15.5ZM4.75 2.6825V5.8175C4.75 5.99851 4.82191 6.17211 4.9499 6.3001C5.07789 6.42809 5.25149 6.5 5.4325 6.5H7V2H5.4325C5.25149 2 5.07789 2.07191 4.9499 2.1999C4.82191 2.32789 4.75 2.50149 4.75 2.6825ZM10.75 6.5V2H8.5V6.5H10.75ZM14.5 6.5V2H12.25V6.5H14.5ZM18.25 2.6825C18.25 2.50149 18.1781 2.32789 18.0501 2.1999C17.9221 2.07191 17.7485 2 17.5675 2H16V6.5H17.5675C17.7485 6.5 17.9221 6.42809 18.0501 6.3001C18.1781 6.17211 18.25 5.99851 18.25 5.8175V2.6825ZM16.75 8H6.25V9.5H16.75V8ZM20.2975 11H2.7025C2.44988 11 2.20761 11.1004 2.02898 11.279C1.85035 11.4576 1.75 11.6999 1.75 11.9525V14H21.25V11.9525C21.25 11.6999 21.1496 11.4576 20.971 11.279C20.7924 11.1004 20.5501 11 20.2975 11ZM2.7025 38H20.2975C20.5501 38 20.7924 37.8996 20.971 37.721C21.1496 37.5424 21.25 37.3001 21.25 37.0475V35H1.75V37.0475C1.75 37.3001 1.85035 37.5424 2.02898 37.721C2.20761 37.8996 2.44988 38 2.7025 38Z" fill="#047247"></path> </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Pharmaceutical Application Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"><%=applications.getApplicationNumber() %></span>
									</div>
								</div>
							</div>
						</div>
						<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
							<div class="single-box">
								<p class="upper-title">Type of Application / Choice of Application / Category / Sub Category / Child Category</p>
								<p class="lower-title">
									<span class="one"> <%=applications.getRequesttype()+" / "+applications.getTypeOfPharmaProduct()+" / "+applications.getSecondaryCategory()+" / "+applications.getSubCategoryFirstField()+" / "+applications.getSubCategorySecondField()%>								</span>
								</p>
							</div>
						</div>
						<div class="right-part d-flex col-lg-3 justify-content-end">
							<div class="dash-status-box">
								<p class="dash-status">Status</p>
								<p class="dash-status-type">
									<span class="circle"></span> <span class="dash-status-type-info"> <%=UserDashboardPortletKeys.getStatusLabel(applications.getStatus())%></span>
								</p>
							</div>
							<div class="dash-action-box d-flex">
								<a href="<%=pdfFileUrl%>" type="button" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
									<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path></svg>
								</a> 
								<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg" data-toggle="tooltip" title="<%=applications.getApplicationNumber() %> Details"> 
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
									<li class="start-active <%=defaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status">
											<span></span><%=stageStatus %>
										</div>
									</div>
								</li>
							<%try{
								String stageJson = PharmaApplicationStagesLocalServiceUtil.getPharmaCurrentStages(applications.getCaseld());
								if(Validator.isNotNull(stageJson)){
									JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
									for(int i=0 ;i<stagesArray.length();++i){
										JSONObject currentStage = stagesArray.getJSONObject(i);
										%>
										<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> farm-progress'>
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
			<div class="row p-3">
				<div class="col-md-12">
					<div class="lower  dash-lower-multiple-links-box">
						<a class="dash-yellow-repeated-link" onclick="getSinglePharmaApplicationSpecificStage('<%=pharmaDashboardRenderURL%>', 'overview', 'pharmaceutical-overview-tab')"> Overview 
						</a> 
						<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> Discussion and Support
							<span class="ml-2"> 
								<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path></svg>
							</span>
						</a>
					</div>
				</div>
			</div>
			<%if (expirationPharmaDocumentCount > 0) {%>
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
							<p class="three">Your <%=expirationPharmaDocumentCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSinglePharmaApplicationSpecificStage('<%=pharmaDashboardRenderURL%>', 'pharmaceutical-document', 'pharmaceutical-document-tab')">
								Update document<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" /></svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div><%}%>
		<div class="dash-light-cream-box common-dash-colored-boxes <%=notification%>">
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
							<p class="three"><%=Validator.isNotNull(checkDateInPharma)?checkDateInPharma:"" %> <span> Renewal Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSinglePharmaApplicationSpecificStage('<%=pharmaDashboardRenderURL%>', 'pharmaceutical-document', 'pharmaceutical-document-tab')">
								Apply for Licence extension
								<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" /></svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div> <%}%>