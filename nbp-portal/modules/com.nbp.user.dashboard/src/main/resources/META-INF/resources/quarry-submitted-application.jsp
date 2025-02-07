<%@page import="java.util.Date"%>
<%@page import="com.nbp.quarry.stage.service.service.QueryLicenceCertificateLocalServiceUtil"%>
<%@page import="com.nbp.quarry.stage.service.model.QueryLicenceCertificate"%>
<%@page import="com.nbp.quary.application.form.service.service.QuarryApplicationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.nbp.quarry.stage.service.service.QuarryApplicationStageLocalServiceUtil"%>
<%@page import="com.nbp.quarry.stage.service.model.QuarryApplicationStage"%>
<%@page import="com.nbp.quary.application.form.service.model.QuarryApplication"%>
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
<%
List<QuarryApplication> quarrysubmitApp = new ArrayList<QuarryApplication>();

if(superAdmin){
	quarryApplicationData=QuarryApplicationLocalServiceUtil.getQuarryApplicationByStatus(UserDashboardPortletKeys.SUBMITTED);
}else{
	try{
		quarryApplicationData=QuarryApplicationLocalServiceUtil.getQuarryApplicationByStatus_UId(UserDashboardPortletKeys.SUBMITTED, themeDisplay.getUserId());
	}catch(Exception e){
		
	}
}

QueryLicenceCertificate licenceCertificate= null;
boolean expiredflag=false;
for(QuarryApplication appData:quarryApplicationData){
	try{
		
		licenceCertificate=QueryLicenceCertificateLocalServiceUtil.getQueryLicenceCertificateBy_CI(appData.getCaseId());
		if (licenceCertificate != null && licenceCertificate.getExpirationDate() != null) {
            if (licenceCertificate.getExpirationDate().compareTo(new Date()) <= 0) {
			expiredflag=true;
		}}}catch(Exception e){}
	if(!expiredflag){
		quarrysubmitApp.add(appData);
	}
	expiredflag=false;
}

 for(QuarryApplication applications : quarrysubmitApp){ 
		 String quarryRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/quarry-dashboard?applicationsId=";
			if(Validator.isNotNull(selectedApplication)){
				quarryRenderURL = quarryRenderURL+String.valueOf(applications.getQuarryApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				quarryRenderURL = quarryRenderURL+String.valueOf(applications.getQuarryApplicationId());
			}
			String pdfQuarryFileUrl ="";
			FileEntry pdfQuarryFileEntry = null;
			try{
				  pdfQuarryFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
			pdfQuarryFileUrl = DLURLHelperUtil.getDownloadURL(pdfQuarryFileEntry, pdfQuarryFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			}catch(Exception e){}
			List<QuarryApplicationStage> quarryCurrentInProgressStages = null;
			String quarryDefaultActive = "current-active";
			String quarryStageStatus = "Submitted";
			 try{
				 quarryCurrentInProgressStages = QuarryApplicationStageLocalServiceUtil.getQuarryByCI(applications.getCaseId());
					 }catch(Exception e){
						}
			 if (Validator.isNotNull(quarryCurrentInProgressStages)) {
				 quarryDefaultActive = "unvisited";
				}
			 int expirationCount=0;
			 try{
			 	expirationCount=	DashboardUtil.getExpirationDocCount(applications.getQuarryApplicationId(),themeDisplay,"Quarry Supported Documents");
			 }catch(Exception e){}
				String checkDate="";
				String notification="hide";
				try{
					checkDate=DashboardUtil.showQuarryExpiredLiceseNotification(applications.getCaseId());
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
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getQuarrySingleApplicationOverview('<%=quarryRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 220 220" fill="none">
									<path d="M98.9252 58.5217L120.308 37.1387L115.422 32.291L110.535 27.4433L94.117 43.823L77.6986 60.2027L69.7236 52.2277C65.3451 47.8491 61.5922 44.2527 61.4358 44.2527C61.2794 44.2527 58.9341 46.481 56.1979 49.1786L51.2333 54.1432L64.0947 67.0046C71.1699 74.0798 77.073 79.866 77.2294 79.866C77.464 79.9047 87.1973 70.2883 98.9252 58.5217ZM193.072 88.6823V110C193.072 112.199 191.38 113.891 189.181 113.891C186.982 113.891 185.29 112.199 185.29 110V79.0384C185.29 77.6849 185.12 76.5007 184.444 75.3165C183.26 72.4402 180.553 70.241 177.507 69.5638C176.999 69.3945 176.154 69.3945 175.646 69.3945V106.109C175.646 108.308 173.954 110 171.755 110C169.555 110 167.863 108.308 167.863 106.109V59.7506C167.863 58.7357 167.694 58.0585 167.525 57.2129C167.355 56.198 166.679 55.3515 166.171 54.3366C165.326 53.3216 164.648 52.4752 163.464 51.6295C162.619 51.1216 161.603 50.6146 160.588 50.276C160.08 50.276 159.234 50.1067 158.219 50.1067C157.712 50.1067 156.866 50.1067 156.358 50.276V1.71875H17.1152V164.141H123.535C127.088 173.954 134.871 181.736 144.853 185.458V218.281H202.885V98.3262C202.716 92.9122 198.486 88.6823 193.072 88.6823ZM144.683 131.318C142.484 131.318 140.792 129.626 140.792 127.426V92.5736C140.792 87.1595 136.562 82.9297 131.148 82.9297C125.146 82.9297 121.504 87.4087 121.504 92.6355V106.278H44.1855V114.061H121.505V125.734H44.1855V133.517H121.505V152.805C121.505 154.158 121.675 155.342 121.675 156.696H24.7284V9.50125H148.406V59.7506V127.426H148.576C148.576 129.626 146.883 131.318 144.683 131.318Z" fill="#047247"></path>
								</svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Quarry Licence Application<br/> Transaction Number</p>
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
							<p class="lower-title"><span class="one"> <%=applications.getNatureOfApplicant() %></span> </p>
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
							<a href="<%=Validator.isNotNull(pdfQuarryFileUrl)?pdfQuarryFileUrl:"javascript:void(0);"%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
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
								<li class="start-active <%=quarryDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=quarryStageStatus %></div>
									</div>
								</li>
							<%try{
								String stageJson= QuarryApplicationStageLocalServiceUtil.getManufacturingApplicaitonCurrentStages(applications.getCaseId());
								if(Validator.isNotNull(stageJson)){
									JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
									for(int i=0 ;i<stagesArray.length();++i){
										JSONObject currentStage = stagesArray.getJSONObject(i);%>
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
						<a class="dash-yellow-repeated-link" onclick="getQuarrySingleApplicationOverview('<%=quarryRenderURL%>')"> Overview </a> 
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
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleQuarryApplicationSpecificStage('<%=quarryRenderURL%>', 'quarry-document', 'quarry-document-tab')">Update document
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
							<p class="three"><%=Validator.isNotNull(checkDate)?checkDate:"" %> <span> Renewal Required </span></p>
						</div>
					</div>
				</div>
			</div>
		</div> 
</section>
<% 	 }	 %>