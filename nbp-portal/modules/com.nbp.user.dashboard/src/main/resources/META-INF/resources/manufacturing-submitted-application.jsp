<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.nbp.manufacturing.application.stages.services.service.ManufacturingApplicationStagesLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.nbp.manufacturing.application.stages.services.service.ManufacturingPermitLocalServiceUtil"%>
<%@page import="com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.nbp.manufacturing.application.form.service.service.ManufacturingApplicationLocalServiceUtil"%>
<%@page import="com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nbp.manufacturing.application.form.service.model.ManufacturingApplication"%>
<%@ include file="/init.jsp" %>
<%String checkDateInManufacturing="";
List<ManufacturingApplicationStages> manufacturingCurrentInProgressStages=null;

List<ManufacturingApplication> manuSubmitApp = new ArrayList<ManufacturingApplication>();
if(showManufacturingApplications || superAdmin){
	manufacturingApplicationData = ManufacturingApplicationLocalServiceUtil.getManufacturingByStatus(UserDashboardPortletKeys.SUBMITTED);	
}else{
	try{
		manufacturingApplicationData = ManufacturingApplicationLocalServiceUtil.getManufacturingByS_U(themeDisplay.getUserId(), UserDashboardPortletKeys.SUBMITTED);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	ManufacturingPermit fullRegis=null;
		boolean expiredflag=false;
		for(ManufacturingApplication appData:manufacturingApplicationData){
			try{
			fullRegis=	ManufacturingPermitLocalServiceUtil.getManufacturingPermitBY_CI(appData.getCaseId());
			if (fullRegis != null && fullRegis.getDateOfExpiration() != null) {
	            if (fullRegis.getDateOfExpiration().compareTo(new Date()) <= 0) {
				expiredflag=true;
		}}}catch(Exception e){
		}
			if(!expiredflag){
				manuSubmitApp.add(appData);
			}
			expiredflag = false;
		}
 for(ManufacturingApplication applications :manuSubmitApp){ 
	 		 String notificationInManu="hide";
			 String manuDefaultActive="current-active";
			 String manuStageStatus="Submitted";
			 String manufacturingDashboardRenderURL= PortalUtil.getPortalURL(request) + "/group/guest"+"/manufacturing-dashboard?manufacturingApplicationId=";
			 int expiredManufactureDocumentCount=DashboardUtil.getExpirationManufacturingDocCount(applications.getManufacturingApplicationId(), themeDisplay);
			 if(Validator.isNotNull(selectedApplication)){
				 manufacturingDashboardRenderURL = manufacturingDashboardRenderURL+ String.valueOf(applications.getManufacturingApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				 manufacturingDashboardRenderURL = manufacturingDashboardRenderURL+ String.valueOf(applications.getManufacturingApplicationId());
			}
			 try{
			 manufacturingCurrentInProgressStages=ManufacturingApplicationStagesLocalServiceUtil.getManufacturingByCI(applications.getCaseId());
			 }catch(Exception e){e.printStackTrace();} 
			 if(Validator.isNotNull(manufacturingCurrentInProgressStages)) manuDefaultActive="unvisited";
			  String pdfFileUrl ="";
			  FileEntry pdffileEntry = null;
			  try{
			  pdffileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
			  pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			  }catch(Exception e){}
			  
			  String applicationStatus = "";
			  ManufacturingPermit manufacturingPermit=null;
			try{
				manufacturingPermit=ManufacturingPermitLocalServiceUtil.getManufacturingPermitBY_CI(applications.getCaseId());
			}catch(Exception e){
			}
			if(Validator.isNotNull(manufacturingPermit)&& manufacturingPermit.getPirPermitCertificateNumber() > 0 ){
				applicationStatus = "License Issued";
			}else{
				applicationStatus = UserDashboardPortletKeys.getStatusLabel(applications.getStatus());
			}
			  try{
				  checkDateInManufacturing=DashboardUtil.showManufacturingExpiredPermitNotification(applications.getCaseId());
				  if(Validator.isNotNull(checkDateInManufacturing)){
					  notificationInManu="show";  
				  }
			  }catch(Exception e){} %>
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer"
						onclick="getManufactureSingleApplicationOverview('<%=manufacturingDashboardRenderURL%>')">
						<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2">
								<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 48 48" fill="none"> <path d="M26.88 32.57C25.0065 33.1456 23.0035 33.1456 21.13 32.57L24 35.93L26.88 32.57ZM11 34.47L7.67 35.65C5.71939 36.3389 4.03043 37.6157 2.83584 39.3046C1.64126 40.9935 0.999849 43.0113 1 45.08V47H9V42C9.00072 41.2985 9.18589 40.6096 9.53692 40.0023C9.88796 39.395 10.3925 38.8907 11 38.54V34.47ZM15 38V33.06L12.94 33.79C13 34 13 33.81 13 38H15ZM23.14 38L18 32L16.94 32.38C17.04 32.63 17 32.6 17 38H23.14ZM35 40C10.1 40 13 39.93 12.22 40.16C11.8585 40.3131 11.5501 40.5692 11.3331 40.8964C11.1162 41.2236 11.0003 41.6074 11 42V47H37V42C37 41.4696 36.7893 40.9609 36.4142 40.5858C36.0391 40.2107 35.5304 40 35 40ZM31 32.71C31 32.24 31.38 32.49 30 32L24.86 38H31V32.71ZM33 38H35V34.12C35 33.64 35.54 33.96 33 33.06V38ZM32 20H16V23C16.0003 24.6248 16.4954 26.2111 17.4193 27.5476C18.3433 28.8842 19.6523 29.9078 21.1723 30.4821C22.6922 31.0564 24.351 31.1543 25.928 30.7627C27.5049 30.3711 28.9253 29.5086 30 28.29C32.31 25.66 32 23.21 32 20ZM36 20H34V22C34.5304 22 35.0391 21.7893 35.4142 21.4142C35.7893 21.0391 36 20.5304 36 20ZM14 22V20H12C12 20.5304 12.2107 21.0391 12.5858 21.4142C12.9609 21.7893 13.4696 22 14 22Z" fill="#047247"/><path d="M34 14H14C13.4477 14 13 14.4477 13 15V17C13 17.5523 13.4477 18 14 18H34C34.5523 18 35 17.5523 35 17V15C35 14.4477 34.5523 14 34 14Z" fill="#047247"/><path d="M19 12H28C28 11.7348 28.1054 11.4804 28.2929 11.2929C28.4804 11.1054 28.7348 11 29 11C29.2652 11 29.5196 11.1054 29.7071 11.2929C29.8946 11.4804 30 11.7348 30 12H34C34.0009 10.2257 33.4119 8.50153 32.3258 7.09858C31.2396 5.69563 29.7179 4.69356 28 4.25V9C28 9.26522 27.8946 9.51957 27.7071 9.70711C27.5196 9.89464 27.2652 10 27 10H21C20.7348 10 20.4804 9.89464 20.2929 9.70711C20.1054 9.51957 20 9.26522 20 9V4.25C18.2821 4.69356 16.7604 5.69563 15.6742 7.09858C14.5881 8.50153 13.9991 10.2257 14 12H17C17 11.7348 17.1054 11.4804 17.2929 11.2929C17.4804 11.1054 17.7348 11 18 11C18.2652 11 18.5196 11.1054 18.7071 11.2929C18.8946 11.4804 19 11.7348 19 12V12Z" fill="#047247"/><path d="M26 1H22V8H26V1Z" fill="#047247"/><path d="M45 15H41L39 19C40.2561 19.5714 41.62 19.8671 43 19.8671C44.38 19.8671 45.7439 19.5714 47 19L45 15Z" fill="#047247"/><path d="M43 11L42 13H44L43 11Z" fill="#047247"/><path d="M39 47.0002H42V21.8302C40.976 21.7323 39.9683 21.5073 39 21.1602V47.0002ZM44 47.0002H47V21.1802C46.0389 21.5531 45.028 21.7823 44 21.8602V47.0002Z" fill="#047247"/></svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Manufacturer Application Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"><%=applications.getApplicationNumber() %></span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Type of Application</p>
							<p class="lower-title">
								<span class="one"> <%=applications.getLicenseRequest()%></span> <span class="two"> </span>
							</p>
						</div>
					</div>
					<div class="right-part d-flex col-lg-3 justify-content-end">
						<div class="dash-status-box">
							<p class="dash-status">Status</p>
							<p class="dash-status-type"><span class="circle"></span> <span class="dash-status-type-info"><%=applicationStatus%> </span></p>
						</div>
						<div class="dash-action-box d-flex">
							<a href="<%=pdfFileUrl%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
								<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path></svg>
							</a> 
							<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="<%=applications.getApplicationNumber() %> Details"> 
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
								<li class="start-active <%=manuDefaultActive%> manufacturing-process">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=manuStageStatus %></div>
									</div>
								</li>
							<%try{
									String stageJson = ManufacturingApplicationStagesLocalServiceUtil.getManufacturingApplicaitonCurrentStages(applications.getCaseId());
									if(Validator.isNotNull(stageJson)){
										JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
										for(int i=0 ;i<stagesArray.length();++i){
											JSONObject currentStage = stagesArray.getJSONObject(i);
											%>
											<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> manufacturing-process'>
												<div class="dashboard-progress-card">
													<%
														if(Validator.isNotNull(currentStage.getString("duration"))){
															%><p class="dashboard-progress-card-duration"><%=currentStage.getString("duration") %></p><%}
													%>
													<div class="d-flex align-items-center">
														<p class="dashboard-progress-card-title"><%=currentStage.getString("startDate") %> </p>
														<%if(Validator.isNotNull(currentStage.getString("endDate"))){%>
															<div class="dashboard-progress-card-title px-1">-</div>
														<%}%>
														<p class="dashboard-progress-card-title"> <%=currentStage.getString("endDate") %></p>
													</div>
													<p class="dashboard-progress-card-title"><%=currentStage.getString("stageName") %></p>
													<%
													if(Validator.isNotNull(currentStage.getString("status"))){
														%>
															<div class="dashboard-progress-card-status">
																<span></span><%=currentStage.getString("status") %>
															</div>
														<%
													}%>
												</div>
											</li>
											<%
										}
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
					<a class="dash-yellow-repeated-link" onclick="getSingleManufacturingApplicationSpecificStage('<%=manufacturingDashboardRenderURL%>', 'overview', 'guest-overview-tab')"> Overview </a> 
					<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> Discussion and Support
						<span class="ml-2"> 
							<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path></svg>
						</span>
					</a>
				</div>
			</div>
		</div>
		<%if (expiredManufactureDocumentCount > 0) {%>
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
							<p class="three">Your <%=expiredManufactureDocumentCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleManufacturingApplicationSpecificStage('<%=manufacturingDashboardRenderURL%>', 'document', 'guest-document-tab')">Update document
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
	<div class="dash-light-cream-box common-dash-colored-boxes <%=notificationInManu%>">
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
							<p class="three"><%=Validator.isNotNull(checkDateInManufacturing)?checkDateInManufacturing:"" %> <span> Renewal Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleManufacturingApplicationSpecificStage('<%=manufacturingDashboardRenderURL%>', 'document', 'guest-document-tab')">
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
	<%} %>