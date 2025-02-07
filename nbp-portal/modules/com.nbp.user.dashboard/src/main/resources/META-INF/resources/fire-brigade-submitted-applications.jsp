<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication"%>
<%@page import="com.nbp.fire.brigade.stage.service.service.FireBrigadeApplicationStageLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage"%>
<%@ include file="/init.jsp" %>
<%
String notification="hide";
List<FireBrigadeApplicationStage> fireBrigadeCurrentInProgressStage= null;
for(FireBrigadeApplication fireBrigadeApp: fireBrigadeApplication){
	String fireBrigadeDashboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/fire-brigade-dashboard?fireBrigadeApplicationId=";
	//int expirationOsiInsolvDocCount= DashboardUtil.getExpirationOsiInsolvencyDocCount(fireBrigadeApp.getFireBrigadeApplicationId(), themeDisplay);
	if(Validator.isNotNull(selectedApplication)){
		fireBrigadeDashboardRenderURL = fireBrigadeDashboardRenderURL+String.valueOf(fireBrigadeApp.getFireBrigadeApplicationId())+"&selectedApplication="+selectedApplication;
	}else{
		fireBrigadeDashboardRenderURL = fireBrigadeDashboardRenderURL+String.valueOf(fireBrigadeApp.getFireBrigadeApplicationId());
	}
	  String fireBrigadeDefaultActive = "current-active";
		 String fireBrigadeStageStatus = "Submitted";
try{
	fireBrigadeCurrentInProgressStage=FireBrigadeApplicationStageLocalServiceUtil.getFireBrigadeByCaseId(fireBrigadeApp.getCaseId());
}catch(Exception e){}
if(Validator.isNotNull(fireBrigadeCurrentInProgressStage))
	fireBrigadeDefaultActive="unvisited";
String applicationStatus = "";
List<FireBrigadeApplicationStage> fireBrigadeStatus=null;
try{
	fireBrigadeStatus= FireBrigadeApplicationStageLocalServiceUtil.getFireBrigadeByCaseId(fireBrigadeApp.getCaseId());
}catch(Exception e){
}
String pdfFileUrl ="";
FileEntry pdffileEntry = null;
try{
pdffileEntry = DLAppLocalServiceUtil.getFileEntry(fireBrigadeApp.getPdfFileEntryId());
pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(), themeDisplay,
			StringPool.BLANK, false, true);
}catch(Exception e){}
int expirationCount=0;
try{
	expirationCount=	DashboardUtil.getExpirationDocCount(fireBrigadeApp.getFireBrigadeApplicationId(),themeDisplay,"Fire Brigade Supported Documents");
}catch(Exception e){}
String checkDateInExp="";
try{
	 checkDateInExp=DashboardUtil.showExplosiveExpiredLiceseNotification(fireBrigadeApp.getCaseId());
 if(Validator.isNotNull(checkDateInExp)){
	  notification="show";  
 }
}catch(Exception e){
 } 

%>
<div class="second-card dash-common-card">
	<div class="container-fluid">
		<div class="row py-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer"
					onclick="getFireBrigadeSingleApplicationOverview('<%=fireBrigadeDashboardRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" viewBox="0 0 512 512" fill="none"> 
                                    <path d="M368 480H144C133.391 480 123.217 475.786 115.716 468.284C108.214 460.783 104 450.609 104 440V71.9999C104 61.3912 108.214 51.2171 115.716 43.7156C123.217 36.2142 133.391 31.9999 144 31.9999H290.72C295.976 31.9905 301.183 33.0172 306.042 35.0214C310.902 37.0255 315.318 39.9678 319.04 43.6799L396.32 120.96C400.032 124.682 402.974 129.098 404.979 133.958C406.983 138.817 408.009 144.024 408 149.28V440C408 450.609 403.786 460.783 396.284 468.284C388.783 475.786 378.609 480 368 480ZM144 47.9999C137.635 47.9999 131.53 50.5285 127.029 55.0293C122.529 59.5302 120 65.6347 120 71.9999V440C120 446.365 122.529 452.47 127.029 456.971C131.53 461.471 137.635 464 144 464H368C374.365 464 380.47 461.471 384.971 456.971C389.471 452.47 392 446.365 392 440V149.28C391.994 142.917 389.462 136.817 384.96 132.32L307.68 55.0399C303.183 50.5377 297.083 48.0055 290.72 47.9999H144Z" fill="#047247"></path> 
                                    <path d="M257.229 269.453C257.229 269.453 239.486 283.566 239.486 294.974C239.486 300.082 247.09 305.186 257.229 305.186C267.36 305.186 274.964 300.082 274.964 294.974C274.964 283.156 257.229 269.453 257.229 269.453ZM321.912 243.657C322.939 231.231 326.583 219.822 333 209.368L308.364 185C300.583 191.627 291.717 195.295 281.67 195.944C272.467 196.767 263.744 195.038 255.542 190.742C247.101 194.896 238.411 196.633 229.351 195.944C219.983 195.114 211.524 191.83 203.952 186.008L179.246 210.365C185.322 220.972 188.706 232.068 189.37 243.657C189.685 248.993 188.145 256.334 184.691 265.832C183.12 270.318 181.75 274.871 180.584 279.477C179.719 283.265 179.18 286.346 179.004 288.652C178.876 298.766 181.747 307.905 187.632 316.021C192.23 321.948 199.812 328.495 210.343 335.651C221.867 341.451 230.781 345.214 237.025 346.823L242.203 349.201C243.834 349.97 245.58 350.724 247.398 351.547C251.325 353.871 254.083 356.394 255.542 359C257.32 356.183 260.14 353.722 263.895 351.547C266.141 350.59 268.369 349.59 270.575 348.545L274.484 346.82C275.819 346.164 277.575 345.413 279.687 344.587C282.313 343.559 284.953 342.567 287.607 341.611C293.69 339.483 298.126 337.467 300.935 335.647C311.15 328.491 318.619 322.053 323.368 316.289C329.465 308.14 332.424 298.965 332.289 288.648C331.926 284.03 329.949 276.638 326.36 266.571C322.939 256.766 321.421 249.153 321.912 243.657ZM257.229 315.394C234.836 315.394 214.145 297.109 214.145 274.557C214.145 259.242 225.989 244.774 229.351 238.825L239.486 254.141L257.229 228.621L274.964 254.141L285.113 238.825C288.465 244.774 300.319 259.242 300.319 274.557C300.319 297.109 279.624 315.394 257.229 315.394Z" fill="#047247"></path> 
                                </svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Fire/Occupancy Certificate Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"> 
									<%=fireBrigadeApp.getApplicationNumber()%>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-3 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Type of Certificate</p>
							<p class="lower-title"><%=fireBrigadeApp.getCertificateType()%><span class="one"> </span></p>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-3 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Transaction Type</p>
							<p class="lower-title"><%=fireBrigadeApp.getTypeOfTransaction()%><span class="one"> </span></p>
						</div>
					</div>
					<div class="right-part d-flex col-lg-3 justify-content-end">
						<div class="dash-status-box">
							<p class="dash-status">Status</p>
							<p class="dash-status-type">
								<span class="circle"></span>Submitted <span class="dash-status-type-info"></span>
							</p>
						</div>
						<div class="dash-action-box d-flex">
							<a href="<%=Validator.isNotNull(pdfFileUrl)?pdfFileUrl:"javascript:void(0)"%>" type="button" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
								<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path></svg>
							</a> 
							<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg" data-toggle="tooltip" title="<%-- <%=sezApplication.getApplicationNumber()%> --%> Details"> 
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
								<li class="start-active <%=fireBrigadeDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(fireBrigadeApp.getCreateDate())%></p>
										<div class="dashboard-progress-card-status">
											<span></span><%=fireBrigadeStageStatus %>
										</div>
									</div>
								</li>
							<%try{
								String stageJson = FireBrigadeApplicationStageLocalServiceUtil.getFireBrigadeCurrentStages(fireBrigadeApp.getCaseId()) ;
								if(Validator.isNotNull(stageJson)){
									JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
									for(int i=0 ;i<stagesArray.length();++i){
										JSONObject currentStage = stagesArray.getJSONObject(i);
										%>
										<li class='<%=currentStage.getString("stageName").equals("In Progress")||currentStage.getString("stageStatus").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("stageStatus").equals("Closed")?"start-active":"" %> farm-progress'>
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
												<%if(Validator.isNotNull(currentStage.getString("stageStatus"))){%>
												<div class="dashboard-progress-card-status">
													<span></span><%=currentStage.getString("stageStatus") %>
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
					<a class="dash-yellow-repeated-link" onclick="getFireBrigadeApplicationSpecificStage('<%=fireBrigadeDashboardRenderURL%>', 'overview', 'fire-brigade-overview-tab')">Overview</a>
					<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> 
						Discussion and Support 
						<span class="ml-2"> 
							<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path></svg>
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
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getFireApplicationSpecificStage('<%=fireBrigadeDashboardRenderURL%>', 'fire-brigade-document', 'fire-brigade-document-tab')">Update document
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
							<p class="three"><%=Validator.isNotNull(checkDateInExp)?checkDateInExp:"" %> <span> Renewal Required </span></p>
						</div>
					</div>
				</div>
			</div>
		</div> 
</div>
<%}%>