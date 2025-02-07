<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.nbp.creative.stages.services.service.CreativeApplicationStagesLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.nbp.creative.stages.services.service.CreativePermitLocalServiceUtil"%>
<%@page import="com.nbp.creative.stages.services.model.CreativePermit"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.nbp.creative.application.form.service.service.CreativeApplicationLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nbp.creative.application.form.service.model.CreativeApplication"%>
<%@page import="com.nbp.creative.stages.services.model.CreativeApplicationStages"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@ include file="/init.jsp" %>
<%String checkDateInCreative="";
try {
	Layout applicationFormLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(), true, "/creative-dashboard");
}catch (PortalException e) {} catch (SystemException e) {}
List<CreativeApplicationStages> creativeCurrentInProgressStages  =null;

List<CreativeApplication> creativeSubmitApp = new ArrayList<CreativeApplication>();
if(creativeEntertainment || superAdmin){
	creativeApplicationData = CreativeApplicationLocalServiceUtil.getCreativeByStatus(UserDashboardPortletKeys.SUBMITTED);	
}else{
	try{
		creativeApplicationData = CreativeApplicationLocalServiceUtil.getCreativeByS_U(UserDashboardPortletKeys.SUBMITTED, themeDisplay.getUserId());
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	CreativePermit fullRegis=null;
		boolean expiredflag=false;
		for(CreativeApplication appData:creativeApplicationData){
			try{
			fullRegis=	CreativePermitLocalServiceUtil.getCreativePermitBy_CI(appData.getCaseId());
			if (fullRegis != null && fullRegis.getDateOfExpiration() != null) {
	            if (fullRegis.getDateOfExpiration().compareTo(new Date()) <= 0) {
				expiredflag=true;
	            }}}catch(Exception e){
		}
			if(!expiredflag){
				creativeSubmitApp.add(appData);
			}
			expiredflag = false;
		}
for(CreativeApplication applications :creativeSubmitApp){ 
		 String notificationInCreative="hide";
		 String creativeDefaultActive="current-active";
		 String creativeStageStatus="Submitted";
		 String creativeDashboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/creative-dashboard?applicationId=";
		int expirationCreativeDocumentCount=DashboardUtil.getExpirationCreativeDocCount(applications.getCreativeApplicationId(), themeDisplay);
		 if(Validator.isNotNull(selectedApplication)){
			 creativeDashboardRenderURL = creativeDashboardRenderURL+String.valueOf(applications.getCreativeApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				 creativeDashboardRenderURL = creativeDashboardRenderURL+String.valueOf(applications.getCreativeApplicationId());
			}
		try{
		    creativeCurrentInProgressStages = CreativeApplicationStagesLocalServiceUtil.getCAS_CaseId(applications.getCaseId());
		}catch(Exception e){e.printStackTrace();}
		if(Validator.isNotNull(creativeCurrentInProgressStages))creativeDefaultActive="unvisited";
		  String pdfFileUrl ="";
		  FileEntry pdffileEntry = null;
		  try{
		  pdffileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
		  pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		  }catch(Exception e){ }
		  try{
			  checkDateInCreative=DashboardUtil.showCreativeExpiredPermitNotification(applications.getCaseId());
			  if(Validator.isNotNull(checkDateInCreative)){
				  notificationInCreative="show";  
			  }
		  }catch(Exception e){}
	%>
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getCreativeSingleApplicationOverview('<%=creativeDashboardRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="35" height="37" viewBox="0 0 35 37" fill="none"><path d="M21 7C21 5.06625 19.4338 3.5 17.5 3.5H15.75V1.75C15.75 0.7875 14.9625 0 14 0H7C6.0375 0 5.25 0.7875 5.25 1.75V3.5H3.5C1.56625 3.5 0 5.06625 0 7V33.25C0 35.1838 1.56625 36.75 3.5 36.75H17.5C19.4338 36.75 21 35.1838 21 33.25H35V7H21ZM17.5 29.75H14V26.25H17.5V29.75ZM17.5 14H14V10.5H17.5V14ZM24.5 29.75H21V26.25H24.5V29.75ZM24.5 14H21V10.5H24.5V14ZM31.5 29.75H28V26.25H31.5V29.75ZM31.5 14H28V10.5H31.5V14Z" fill="#047247"/></svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2"> Entertainment Application Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"> <%=applications.getApplicationNumber() %></span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Category / Sub Category</p>
							<p class="lower-title">
								<span class="one"> <%=applications.getPractitionerStatus() +" / "+ applications.getMainCategories()%></span>
							</p>
						</div>
					</div>
	
					<div class="right-part d-flex col-lg-3 justify-content-end">
						<div class="dash-status-box">
							<p class="dash-status">Status</p>
							<p class="dash-status-type">
								<span class="circle"></span> 
								<span class="dash-status-type-info"> <%=UserDashboardPortletKeys.getStatusLabel(applications.getStatus())%></span>
							</p>
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
		<div class="row mx-0">
			<div class="col-lg-12 col-md-12">
				<div class="form-wizard">
					<form action="" method="post" role="form">
						<div class="form-wizard-header">
						 	<ul class="list-unstyled form-wizard-steps clearfix">
									<li class="start-active <%=creativeDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=creativeStageStatus %></div>
									</div>
								</li>
							<%try{
								String stageJson = CreativeApplicationStagesLocalServiceUtil.getCretiveCurrentStages(applications.getCaseId());
								if(Validator.isNotNull(stageJson)){
									JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
									for(int i=0 ;i<stagesArray.length();++i){
										JSONObject currentStage = stagesArray.getJSONObject(i);%>
										<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> farm-progress'>
											<div class="dashboard-progress-card">
											<%if(Validator.isNotNull(currentStage.getString("duration"))){
													%><p class="dashboard-progress-card-duration"><%=currentStage.getString("duration") %></p>
													<%}%>
												<div class="d-flex align-items-center">
													<p class="dashboard-progress-card-title"><%=currentStage.getString("startDate") %> </p>
													<%if(Validator.isNotNull(currentStage.getString("endDate"))){%>
															<div class="dashboard-progress-card-title px-1">-</div><%
													}%>
													<p class="dashboard-progress-card-title"> <%=currentStage.getString("endDate") %></p>
												</div>
												<p class="dashboard-progress-card-title"><%=currentStage.getString("stageName") %></p>
													<%if(Validator.isNotNull(currentStage.getString("status"))){%>
														<div class="dashboard-progress-card-status">
															<span></span>
															<%=currentStage.getString("status") %>
														</div><%}%>
											</div>
										</li>
										<%}
								}
							}catch(Exception e){}%>
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
					<a class="dash-yellow-repeated-link"onclick="getCreativeApplicationSpecificStage('<%=creativeDashboardRenderURL%>', 'license', 'guest-licence-tab')"> Overview </a> 
					<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> Discussion and Support
						<span class="ml-2"> 
							<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg">
				                <path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path>			                                            
				            </svg>
						</span>
					</a>
				</div>
			</div>
		</div>
		<%if (expirationCreativeDocumentCount > 0) {%>
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
							<p class="three">Your <%=expirationCreativeDocumentCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getCreativeApplicationSpecificStage('<%=creativeDashboardRenderURL%>', 'creative-document', 'creative-document-tab')">Update document
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
	</div>
		<div class="dash-light-cream-box common-dash-colored-boxes <%=notificationInCreative%>">
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
							<p class="three"><%=Validator.isNotNull(checkDateInCreative)?checkDateInCreative:"" %> <span> Renewal Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getCreativeApplicationSpecificStage('<%=creativeDashboardRenderURL%>', 'creative-document', 'creative-document-tab')">
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
	<% } %>
<div id="dashboard-progress-single-application" style="display: none;"></div>
