<%@page import="java.util.Date"%>
<%@page import="com.nbp.mining.stage.service.service.MiningApplicationCertificateIssuanceLocalServiceUtil"%>
<%@page import="com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance"%>
<%@page import="com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil"%>
<%@page import="com.nbp.mining.stage.service.service.MiningApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.mining.stage.service.model.MiningApplicationStages"%>
<%@page import="com.nbp.mining.lease.application.service.model.MiningLeaseApplication"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjApplication"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@ include file="/init.jsp" %>
<%
List<MiningApplicationStages> miningCurrentInProgressStages=null;
List<MiningLeaseApplication> miningSubmitApp=new ArrayList<MiningLeaseApplication>();

if (superAdmin) {
	miningApplicationData = MiningLeaseApplicationLocalServiceUtil.getMiningByStatus(UserDashboardPortletKeys.SUBMITTED);	
}else{
	try{
		miningApplicationData = MiningLeaseApplicationLocalServiceUtil.getMiningByS_U(themeDisplay.getUserId(),UserDashboardPortletKeys.SUBMITTED);
	}catch(Exception e){
		e.printStackTrace();
	}
	}

	MiningApplicationCertificateIssuance fullRegis=null;
		boolean expiredflag=false;
		for(MiningLeaseApplication appData:miningApplicationData){
			try{
			fullRegis=	MiningApplicationCertificateIssuanceLocalServiceUtil.getMiningApplicationCertificateIssuanceByCI(appData.getCaseId());
			if (fullRegis != null && fullRegis.getDateOfExpiration() != null) {
	            if (fullRegis.getDateOfExpiration().compareTo(new Date()) <= 0) {
			
				expiredflag=true;
		}}}catch(Exception e){
		}
			if(!expiredflag){
				miningSubmitApp.add(appData);
			}
			expiredflag = false;
		}

	for(MiningLeaseApplication applications : miningSubmitApp){ 
		 String miningRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/mining-dashboard?miningApplicationId=";
			if(Validator.isNotNull(selectedApplication)){
				miningRenderURL = miningRenderURL+String.valueOf(applications.getMiningLeaseApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				miningRenderURL = miningRenderURL+String.valueOf(applications.getMiningLeaseApplicationId());
			}
		 	String miningDefaultActive = "current-active";
			String miningStageStatus = "Submitted";
			 try{
				 miningCurrentInProgressStages = MiningApplicationStagesLocalServiceUtil.getMiningByCI(applications.getCaseId());
					 }catch(Exception e){
						}
			 if (Validator.isNotNull(miningCurrentInProgressStages)) {
				 miningDefaultActive = "unvisited";
				} 
			 String pdfMiningFileUrl ="";
			 FileEntry pdfMiningFileEntry = null;
			 try{
			 pdfMiningFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
			 pdfMiningFileUrl = DLURLHelperUtil.getDownloadURL(pdfMiningFileEntry, pdfMiningFileEntry.getFileVersion(), themeDisplay,
			 			StringPool.BLANK, false, true);
			 }catch(Exception e){}
			  int expirationCount=0;
				try{
					expirationCount=	DashboardUtil.getExpirationDocCount(applications.getMiningLeaseApplicationId(),themeDisplay,"Mining Supported Documents");
				}catch(Exception e){}
				String checkDateInMining="";
				String notification="hide";
				try{
					checkDateInMining=DashboardUtil.showMiningExpiredLiceseNotification(applications.getCaseId());
				 if(Validator.isNotNull(checkDateInMining)){
					  notification="show";  
				 }
				}catch(Exception e){
				 } 
	
		
%>
	<section class="wizard-section dashboard-progress">
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getMiningSingleApplicationOverview('<%=miningRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg width="40" height="40" viewBox="0 0 220 220" fill="none" xmlns="http://www.w3.org/2000/svg">
<path d="M144.375 144.375H75.625C56.375 144.375 41.25 159.5 41.25 178.75V199.375C41.25 202.812 44.6875 206.25 48.125 206.25H171.875C175.312 206.25 178.75 202.812 178.75 199.375V178.75C178.75 159.5 163.625 144.375 144.375 144.375ZM108.625 178.75L99.6875 158.125H114.813L108.625 178.75ZM110 13.75C106.562 13.75 103.125 17.1875 103.125 20.625V28.1875C79.75 31.625 61.875 51.5625 61.875 75.625V82.5C58.4375 82.5 55 85.9375 55 89.375C55 92.8125 58.4375 96.25 61.875 96.25H69.4375C72.875 115.5 89.375 130.625 110 130.625C130.625 130.625 147.125 115.5 150.562 96.25H158.125C161.562 96.25 165 92.8125 165 89.375C165 85.9375 161.562 82.5 158.125 82.5V75.625C158.125 51.5625 140.25 31.625 116.875 28.1875V20.625C116.875 17.1875 113.438 13.75 110 13.75ZM105.188 57.0625C107.938 54.3125 112.063 54.3125 114.813 57.0625C116.188 58.4375 116.875 59.8125 116.875 61.875C116.875 63.9375 116.188 65.3125 114.813 66.6875C113.438 68.0625 112.063 68.75 110 68.75C107.937 68.75 106.563 68.0625 105.188 66.6875C103.813 65.3125 103.125 63.9375 103.125 61.875C103.125 59.8125 103.813 58.4375 105.188 57.0625ZM136.812 96.25C133.375 107.938 123.062 116.875 110 116.875C96.9375 116.875 86.625 107.938 83.1875 96.25H136.812Z" fill="#047247"/>
</svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Mining Application<br/> Transaction Number</p>
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
							<p class="lower-title"><span class="one"> <%=applications.getTypeOfApplicant() %></span> </p>
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
							<a href="<%=Validator.isNotNull(pdfMiningFileUrl)?pdfMiningFileUrl:"javascript:void(0);"%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
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
								<li class="start-active <%=miningDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=miningStageStatus %></div>
									</div>
								</li>
							<%try{
									String stageJson = MiningApplicationStagesLocalServiceUtil.getMiningApplicaitonCurrentStages(applications.getCaseId());
									if(Validator.isNotNull(stageJson)){
										JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
										for(int i=0 ;i<stagesArray.length();++i){
											JSONObject currentStage = stagesArray.getJSONObject(i);
											%>
											<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> farm-progress'>
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
						<a class="dash-yellow-repeated-link" onclick="getMiningSingleApplicationOverview('<%=miningRenderURL%>')"> Overview </a> 
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
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleMiningApplicationSpecificStage('<%=miningRenderURL%>', 'document', 'document-tab')">Update document
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
							<p class="three"><%=Validator.isNotNull(checkDateInMining)?checkDateInMining:"" %> <span> Renewal Required </span></p>
						</div>
					</div>
				</div>
			</div>
		</div> 
</section>
<% 	 }	 %>
<script>
function getMiningSingleApplicationOverview(miningRenderURL) {
	window.location.href = miningRenderURL;
}
</script>