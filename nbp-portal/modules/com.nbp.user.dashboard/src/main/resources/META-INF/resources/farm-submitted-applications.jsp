<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.nbp.farm.application.stages.service.service.FarmApplicationStagesLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.nbp.farm.application.stages.service.service.FarmPermitLocalServiceUtil"%>
<%@page import="com.nbp.farm.application.stages.service.model.FarmPermit"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nbp.farm.application.stages.service.model.FarmApplicationStages"%>
<%@page import="com.nbp.farm.application.form.service.model.FarmerApplication"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.farm.application.form.service.service.FarmerApplicationLocalServiceUtil"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@ include file="/init.jsp" %>
<%String checkDate="";
List<FarmerApplication> farmerSubmitApp = new ArrayList<FarmerApplication>();

	List<FarmApplicationStages> farmCurrentInProgressStages  =null;
	if(superAdmin){
		farmerApplicationData = FarmerApplicationLocalServiceUtil.getFarmerApplicationByStatus(UserDashboardPortletKeys.SUBMITTED);
	}else{
		try{
			farmerApplicationData = FarmerApplicationLocalServiceUtil.getFarmerApplicationByS_U(themeDisplay.getUserId(), UserDashboardPortletKeys.SUBMITTED); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	FarmPermit fullRegis=null;
	boolean expiredflag=false;
	for(FarmerApplication appData:farmerApplicationData){
		try{
		fullRegis=	FarmPermitLocalServiceUtil.getFarmBY_CI(appData.getCaseld());
		if (fullRegis != null && fullRegis.getDateOfExpiration() != null) {
            if (fullRegis.getDateOfExpiration().compareTo(new Date()) <= 0) {
			expiredflag=true;
	}}}catch(Exception e){
	}
		if(!expiredflag){
			farmerSubmitApp.add(appData);
		}
		expiredflag = false;
	}
	for(FarmerApplication applications :farmerSubmitApp){ 
		String farmDefaultActive="current-active";
		String farmStageStatus="Submitted";
		String notificationInFarm="hide";
		String farmDashboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/farm-dashboard?farmerApplicationId=";
		int expirationFarmDocumentCount=DashboardUtil.getExpirationFarmDocCount(applications.getFarmerApplicationId(), themeDisplay);
		farmDashboardRenderURL = farmDashboardRenderURL+String.valueOf(applications.getFarmerApplicationId())+"&selectedApplication="+selectedApplication;
		try{
		farmCurrentInProgressStages= FarmApplicationStagesLocalServiceUtil.getFarmByCI(applications.getCaseld());
		}catch(Exception e){e.printStackTrace();}
		if(Validator.isNotNull(farmCurrentInProgressStages))farmDefaultActive="unvisited";
		  String pdfFileUrl ="";
		  FileEntry pdffileEntry = null;
		  try{
		  pdffileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
		  pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		  }catch(Exception e){}
		  try{
			  checkDate= DashboardUtil.showFarmExpiredPermitNotification(applications.getCaseld());
			  if(Validator.isNotNull(checkDate)){
				  notificationInFarm="show";  
			  }
		  }catch(Exception e){}
	%>
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getFarmSingleApplicationOverview('<%=farmDashboardRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="44" height="35" viewBox="0 0 44 35" fill="none"><path d="M6.99937 19C5.13937 19 3.43937 19.56 1.99937 20.52V11C1.99937 8.80002 3.79937 7.00001 5.99937 7.00001H18.5794L20.6994 4.88001L17.8794 2.06001L19.2994 0.640015L26.3594 7.70001L24.9394 9.12001L22.1194 6.30001L19.9994 8.42001V13C19.9994 15.2 21.7994 17 23.9994 17H25.0794C23.1794 19.12 21.9994 21.92 21.9994 25C21.9994 25.68 22.0794 26.34 22.1794 27H15.8994C15.3994 22.5 11.6194 19 6.99937 19Z" fill="#047247"/><path d="M7 21C10.86 21 14 24.14 14 28C14 31.86 10.86 35 7 35C3.14 35 0 31.86 0 28C0 24.14 3.14 21 7 21ZM7 31C8.66 31 10 29.66 10 28C10 26.34 8.66 25 7 25C5.34 25 4 26.34 4 28C4 29.66 5.34 31 7 31Z" fill="#047247"/><path d="M38 13H28C28 10.8 29.8 9 32 9H38C39.1 9 40 9.9 40 11C40 12.1 39.1 13 38 13Z" fill="#047247"/><path d="M26.34 22.64L26.7 21.7L24.84 21C25.76 18.88 27.4 17.18 29.46 16.14L30.26 17.92L31.18 17.5L30.38 15.7C31.48 15.26 32.72 15 34 15C35.06 15 36.08 15.22 37.04 15.52L36.36 17.34L37.3 17.7L38 15.84C40.12 16.76 41.82 18.4 42.86 20.46L41.08 21.26L41.5 22.18L43.3 21.38C43.74 22.48 44 23.72 44 25C44 26.06 43.78 27.08 43.48 28.04L41.66 27.36L41.3 28.3L43.16 29C42.24 31.12 40.6 32.82 38.54 33.86L37.74 32.08L36.82 32.5L37.62 34.3C36.52 34.74 35.28 35 34 35C32.94 35 31.92 34.78 30.96 34.48L31.64 32.66L30.7 32.3L30 34.16C27.88 33.24 26.18 31.6 25.14 29.54L26.92 28.74L26.5 27.82L24.7 28.62C24.26 27.52 24 26.28 24 25C24 23.94 24.22 22.92 24.52 21.96L26.34 22.64ZM31.7 30.54C34.76 31.8 38.28 30.36 39.54 27.3C40.8 24.24 39.36 20.72 36.3 19.46C33.24 18.2 29.72 19.64 28.46 22.7C27.18 25.76 28.64 29.28 31.7 30.54Z" fill="#047247"/></svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Farm Application Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"> <%=applications.getApplicationNumber() %></span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Farmer Type</p>
							<p class="lower-title"><span class="one"> <%=applications.getFarmType()%></span></p>
						</div>
					</div>
					<div class="right-part d-flex col-lg-3 justify-content-end">
						<div class="dash-status-box">
							<p class="dash-status">Status</p>
							<p class="dash-status-type"><span class="circle"></span> <span class="dash-status-type-info"><%=UserDashboardPortletKeys.getStatusLabel(applications.getStatus())%></span></p>
						</div>
						<div class="dash-action-box d-flex">
                            <a href="<%=pdfFileUrl%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
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
								<li class="start-active <%=farmDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=farmStageStatus %></div>
									</div>
								</li>
							<%try{
								String stageJson = FarmApplicationStagesLocalServiceUtil.getfarmCurrentStage(applications.getCaseld());
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
																	<span></span>
																	<%=currentStage.getString("status") %>
																</div>
													<%}%>
											</div>
										</li>
										<%}
								}
							}catch(Exception e){}
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
					<a class="dash-yellow-repeated-link" onclick="getFarmApplicationSpecificStage('<%=farmDashboardRenderURL%>', 'farm-overview', 'farm-overview-tab')">Overview</a> 
					<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> Discussion and Support 
						<span class="ml-2">
							 <svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path></svg>
						</span>
					</a>
				</div>
			</div>
		</div>
		<%if (expirationFarmDocumentCount > 0) {%>
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
							<p class="three">Your <%=expirationFarmDocumentCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getFarmApplicationSpecificStage('<%=farmDashboardRenderURL%>', 'farm-document', 'farm-document-tab')">Update document
								<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" /></svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%}%>
		<div class="dash-light-cream-box common-dash-colored-boxes <%=notificationInFarm%>">
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
							<p class="three"><%=Validator.isNotNull(checkDate)?checkDate:"" %> <span> Renewal Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getFarmApplicationSpecificStage('<%=farmDashboardRenderURL%>', 'farm-document', 'farm-document-tab')">
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
	</div>
	<% } %>
