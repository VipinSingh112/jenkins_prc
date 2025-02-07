<%@page import="com.nbp.ncra.stages.services.service.NcraApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.ncra.stages.services.model.NcraApplicationStages"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nbp.ncra.application.form.service.model.NcraApplication"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@ include file="/init.jsp" %>
<%String checkDateInOsiFc="";
/* List<NcraApplicationStage> ncraCurrentInProgressStages = null; */
	for(NcraApplication applications : ncraApplicationList){ 
		 String ncraboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/ncra-dashboard?ncraApplicationId=";
			if(Validator.isNotNull(selectedApplication)){
				ncraboardRenderURL = ncraboardRenderURL+String.valueOf(applications.getNcraApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				ncraboardRenderURL = ncraboardRenderURL+String.valueOf(applications.getNcraApplicationId());
			}
			List<NcraApplicationStages> ncraCurrentInProgressStages = null;
			String ncraDefaultActive = "current-active";
			String ncraStageStatus = "Submitted";
			 try{
				 ncraCurrentInProgressStages = NcraApplicationStagesLocalServiceUtil.getNCRA_By_CaseId(applications.getCaseId());
					 }catch(Exception e){
						}
			 if (Validator.isNotNull(ncraCurrentInProgressStages)) {
				 ncraDefaultActive = "unvisited";
				}
			 String pdfNcraFileUrl ="";
			  FileEntry pdfNcraFileEntry = null;
			  try{
				  pdfNcraFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
			  pdfNcraFileUrl = DLURLHelperUtil.getDownloadURL(pdfNcraFileEntry, pdfNcraFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			  }catch(Exception e){}
			  int expirationCount=0;
				try{
					expirationCount=	DashboardUtil.getExpirationDocCount(applications.getNcraApplicationId(),themeDisplay,"NCRA Supported Documents");
				}catch(Exception e){}
				String checkDate="";
				String notification="hide";
				try{
					checkDate=DashboardUtil.showMiicExpiredLiceseNotification(applications.getCaseId());
				 if(Validator.isNotNull(checkDate)){
					  notification="show";  
				 }
				}catch(Exception e){
				 } 	
	
		
%>
	<section class="wizard-section dashboard-progress">
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getNCRASingleApplicationOverview('<%=ncraboardRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 220 220" fill="none"> 
				                   <path d="M164.667 157.737H55.3333C51.7087 157.737 48.2325 159.173 45.6695 161.729C43.1065 164.286 41.6667 167.753 41.6667 171.368C41.6667 174.984 43.1065 178.451 45.6695 181.007C48.2325 183.564 51.7087 185 55.3333 185H164.667C168.291 185 171.767 183.564 174.33 181.007C176.893 178.451 178.333 174.984 178.333 171.368C178.333 167.753 176.893 164.286 174.33 161.729C171.767 159.173 168.291 157.737 164.667 157.737ZM178.333 69.1311C174.709 69.1311 171.233 70.5673 168.67 73.1237C166.107 75.6802 164.667 79.1474 164.667 82.7628C164.668 83.6992 164.764 84.6332 164.954 85.5504L140.135 100.416L119.218 58.6893C121.251 56.8346 122.674 54.4106 123.301 51.735C123.928 49.0595 123.73 46.2574 122.733 43.6961C121.735 41.1348 119.985 38.934 117.712 37.3822C115.438 35.8304 112.748 35 109.993 35C107.238 35 104.548 35.8304 102.275 37.3822C100.001 38.934 98.2512 41.1348 97.2538 43.6961C96.2564 46.2574 96.0582 49.0595 96.6854 51.735C97.3125 54.4106 98.7357 56.8346 100.768 58.6893L79.865 100.416L55.0463 85.5504C55.2358 84.6332 55.332 83.6992 55.3333 82.7628C55.3333 80.0667 54.5318 77.4311 53.0301 75.1894C51.5284 72.9477 49.3939 71.2005 46.8967 70.1688C44.3994 69.137 41.6515 68.8671 39.0004 69.3931C36.3494 69.919 33.9142 71.2173 32.0029 73.1237C30.0916 75.0302 28.7899 77.4591 28.2626 80.1034C27.7353 82.7476 28.0059 85.4885 29.0403 87.9794C30.0747 90.4702 31.8264 92.5992 34.0739 94.097C36.3214 95.5949 38.9637 96.3944 41.6667 96.3944C41.9195 96.3944 42.1518 96.333 42.3978 96.3194L47.68 144.105H172.32L177.602 96.3194C177.848 96.3194 178.081 96.3944 178.333 96.3944C181.958 96.3944 185.434 94.9582 187.997 92.4018C190.56 89.8453 192 86.3781 192 82.7628C192 79.1474 190.56 75.6802 187.997 73.1237C185.434 70.5673 181.958 69.1311 178.333 69.1311Z" fill="#047247"></path> 
				                </svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">NCRA(Verification of Scales And Petrol)<br/> Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"> <%=applications.getApplicationNumber() %> </span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Type of Application</p>
							<p class="lower-title"><span class="one"> <%=applications.getDoYouWant() %></span> </p>
						</div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title">	<span class="one"> </span> </p></div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title"><span class="one"> </span> </p></div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title"><span class="one"> </span> </p></div>
					</div>
					<div class="right-part d-flex col-lg-3 justify-content-end">
						<div class="dash-status-box">
							<p class="dash-status">Status</p>
							<p class="dash-status-type"><span class="circle"></span> <span class="dash-status-type-info">submitted</span></p>
						</div>
						 <div class="dash-action-box d-flex">
							<a href="<%=Validator.isNotNull(pdfNcraFileUrl)?pdfNcraFileUrl:"javascript:void(0);"%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
								<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path></svg>
							</a> 
							<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg" data-toggle="tooltip" title="<%=applications.getApplicationNumber() %> Details" > 
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
								<li class="start-active <%=ncraDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=ncraStageStatus %></div>
									</div>
								</li>
							<%try{
								String stageJson= NcraApplicationStagesLocalServiceUtil.getNCRACurrentStages(applications.getCaseId());
								if(Validator.isNotNull(stageJson)){
									JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
									for(int i=0 ;i<stagesArray.length();++i){
										JSONObject currentStage = stagesArray.getJSONObject(i);%>
										<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %>farm-progress'>
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
																<div class="dashboard-progress-card-status"><span></span>
																	<%=currentStage.getString("status") %></div>
																<%}%>
											</div>
										</li><%}}}catch(Exception e){}%>
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
						<a class="dash-yellow-repeated-link" onclick="getSingleNcraApplicationSpecificStage('<%=ncraboardRenderURL%>', 'overview', 'ncra-overview-tab') "> Overview </a> 
						<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> Discussion and Support
							<span class="ml-2"> 
								<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path></svg>
							</span>
						</a>
					</div>
				</div>
			</div>
		<%if (expirationCount > 0) {%>
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
							<p class="three">Your <%=expirationCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleNcraApplicationSpecificStage('<%=ncraboardRenderURL%>', 'ncra-document', 'ncra-document-tab')">Update document
								<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" /></svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%	}%>
	</div>
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
							<p class="three"><%=Validator.isNotNull(checkDateInOsiFc)?checkDateInOsiFc:"" %> <span> Renewal Required </span></p>
						</div>
					</div>
				</div>
			</div>
		</div> 
</section>
<% 	 }	 %>