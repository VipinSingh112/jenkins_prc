<%@ include file="/init.jsp" %>
<% // String checkDateInAcquire="";
	try {Layout applicationFormLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(), true, "/acquire-dashboard");
	} catch (PortalException e) {} catch (SystemException e) {}
	List<AcquireApplication> acquireSubmittedApplicationList = new ArrayList<AcquireApplication>();
	if (showCrownLandApplications || superAdmin) {
		acquireApplication = AcquireApplicationLocalServiceUtil.getAcquireByStatus(UserDashboardPortletKeys.SUBMITTED);
		} else {
		acquireApplication = AcquireApplicationLocalServiceUtil.getAcquireByS_U(UserDashboardPortletKeys.SUBMITTED, themeDisplay.getUserId());
	}
	List<AcquireApplicationStages> acquireCurrentInProgressStages = null;
	for (AcquireApplication applications : acquireApplication) {
		String acquireDefaultActive = "current-active";
		String acquireStageStatus = "Submitted";
		String notification="hide";
		String acquireDashboardRenderURL = PortalUtil.getPortalURL(request) + "/group/guest"
				+ "/acquire-dashboard?applicationId=";
		int expiredAcquiredDocumentCount=DashboardUtil.getExpirationAcquireDocCount(applications.getAcquireApplicationId(), themeDisplay);
		if(Validator.isNotNull(selectedApplication)){
			acquireDashboardRenderURL = acquireDashboardRenderURL+ String.valueOf(applications.getAcquireApplicationId())+"&selectedApplication="+selectedApplication;
		}else{
			acquireDashboardRenderURL = acquireDashboardRenderURL+ String.valueOf(applications.getAcquireApplicationId());
		}
		try {
			acquireCurrentInProgressStages = AcquireApplicationStagesLocalServiceUtil.getAcquireApplicationByCaseId(applications.getCaseId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Validator.isNotNull(acquireCurrentInProgressStages)) {
			acquireDefaultActive = "unvisited";
		}
		String pdfFileUrl = "";
		FileEntry pdffileEntry = null;
		try {
			pdffileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
			pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(),
					themeDisplay, StringPool.BLANK, false, true);
		} catch (Exception e) {}
		/* try{
			checkDateInAcquire=DashboardUtil.showAcquireExpiredLiceseNotification(applications.getCaseld());
			  if(Validator.isNotNull(checkDateInAcquire)){
				  notification="show";  
			  }
		  }catch(Exception e){
			  e.printStackTrace(); } */
%>
<div class="second-card dash-common-card">
	<div class="container-fluid">
		<div class="row py-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer"
					onclick="getAcquireSingleApplicationOverview('<%=acquireDashboardRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="44" height="44" viewBox="0 0 44 44" fill="none"><g clip-path="url(#clip0_272_36222)"><path d="M21.9951 3.44884C24.708 3.44117 27.3169 4.49276 29.2664 6.37979H44V3.42292C44 2.97169 43.9108 2.52492 43.7375 2.10829C43.5643 1.69167 43.3104 1.31342 42.9904 0.995305C42.6704 0.677193 42.2908 0.425496 41.8732 0.254694C41.4556 0.0838911 41.0084 -0.00264576 40.5572 6.16172e-05H3.43298C2.98279 -0.00090252 2.53682 0.0868962 2.12058 0.258437C1.70434 0.429979 1.32598 0.681898 1.00715 0.999792C0.688317 1.31769 0.435259 1.69532 0.262444 2.1111C0.0896299 2.52688 0.00044871 2.97265 0 3.42292V6.37979H14.7327C16.6788 4.49316 19.2848 3.44145 21.9951 3.44884ZM39.1023 2.83175C39.2207 2.71252 39.3718 2.63103 39.5365 2.59753C39.7011 2.56404 39.872 2.58004 40.0276 2.64352C40.1832 2.70699 40.3165 2.81511 40.4108 2.95425C40.505 3.09339 40.556 3.25731 40.5572 3.42537C40.5623 3.59614 40.5157 3.76447 40.4234 3.90823C40.3311 4.052 40.1975 4.16448 40.0401 4.23091C39.8827 4.29735 39.709 4.31462 39.5416 4.28046C39.3742 4.2463 39.2211 4.16232 39.1023 4.03953C39.0194 3.96046 38.9536 3.86508 38.9093 3.75939C38.865 3.6537 38.843 3.53998 38.8447 3.42537C38.845 3.31411 38.8681 3.20409 38.9124 3.10203C38.9567 2.99997 39.0213 2.908 39.1023 2.83175ZM35.0372 2.57405C35.1496 2.57322 35.261 2.59461 35.3651 2.637C35.4692 2.67939 35.5639 2.74194 35.6437 2.82105C35.7235 2.90017 35.7869 2.99429 35.8302 3.098C35.8736 3.20171 35.896 3.31297 35.8962 3.42537C35.8989 3.54008 35.8787 3.65418 35.8367 3.76096C35.7947 3.86773 35.7318 3.96503 35.6516 4.04713C35.5715 4.12922 35.4757 4.19446 35.37 4.239C35.2643 4.28354 35.1507 4.30649 35.036 4.30649C34.9213 4.30649 34.8077 4.28354 34.702 4.239C34.5962 4.19446 34.5005 4.12922 34.4203 4.04713C34.3402 3.96503 34.2773 3.86773 34.2353 3.76096C34.1933 3.65418 34.173 3.54008 34.1758 3.42537C34.1758 3.31259 34.1981 3.20093 34.2415 3.09683C34.2849 2.99274 34.3485 2.89827 34.4285 2.81889C34.5086 2.73951 34.6037 2.67678 34.7081 2.63434C34.8126 2.5919 34.9244 2.57058 35.0372 2.57161V2.57405ZM29.7523 2.83175C29.8725 2.71294 30.0248 2.63189 30.1905 2.59857C30.3561 2.56524 30.5279 2.5811 30.6847 2.64419C30.8414 2.70728 30.9763 2.81485 31.0727 2.95365C31.1691 3.09245 31.2229 3.25642 31.2273 3.42537C31.2262 3.65607 31.1338 3.87693 30.9701 4.03953C30.8093 4.19959 30.5932 4.29183 30.3664 4.29722C30.1364 4.29212 29.917 4.20003 29.7523 4.03953C29.6726 3.95857 29.6097 3.86261 29.5672 3.7572C29.5247 3.65179 29.5036 3.53901 29.5049 3.42537C29.5101 3.20348 29.5984 2.99162 29.7523 2.83175ZM26.6048 14.0333C26.6034 14.9437 26.3322 15.8333 25.8256 16.5896C25.3189 17.3459 24.5995 17.9351 23.7582 18.2827C22.917 18.6303 21.9916 18.7208 21.0989 18.5426C20.2063 18.3645 19.3865 17.9258 18.743 17.2818C18.0996 16.6379 17.6613 15.8177 17.4837 14.9248C17.3061 14.0319 17.397 13.1064 17.745 12.2651C18.093 11.4239 18.6824 10.7047 19.4389 10.1983C20.1954 9.692 21.0849 9.42124 21.9951 9.42027C22.6012 9.4184 23.2017 9.53645 23.762 9.76765C24.3222 9.99884 24.8313 10.3386 25.2597 10.7674C25.6882 11.1961 26.0276 11.7054 26.2585 12.2659C26.4893 12.8265 26.607 13.4271 26.6048 14.0333ZM43.8724 41.446L27.9351 37.2951C26.0248 37.9506 24.0143 38.2659 21.9951 38.2266C20.8103 38.2308 19.6274 38.1327 18.4595 37.9332L10.3693 44H40.5572C41.4643 44.0018 42.3353 43.6449 42.9802 43.007C43.6252 42.369 43.9917 41.5019 44 40.5947C43.9887 40.8823 43.9459 41.1678 43.8724 41.446Z" fill="#047247" /><path d="M24.005 31.7778C23.6359 32.2939 23.3066 32.7434 23.0354 33.1071C22.914 33.271 22.757 33.4039 22.5766 33.4952C22.3963 33.5866 22.1976 33.6339 21.9962 33.6333C21.7946 33.6341 21.5955 33.5869 21.4148 33.4955C21.2342 33.404 21.0769 33.2709 20.9555 33.1065C20.6283 32.667 20.3054 32.224 19.987 31.7778C16.2471 32.1132 13.4443 33.3977 13.4443 34.7899C13.4443 36.2866 16.88 37.8889 21.9947 37.8889C27.1093 37.8889 30.5554 36.2893 30.5554 34.7899C30.5565 33.3742 27.8102 32.1158 24.005 31.7778Z" fill="#047247" /><path d="M13.509 35.0096C13.5266 34.5552 13.7229 34.1254 14.056 33.8116L0 30.1998V40.5992C-4.05148e-06 41.4994 0.361356 42.3629 1.00487 43.0004C1.64839 43.6378 2.52155 43.9973 3.43298 44H7.50982L16.3206 37.4703C14.5894 36.872 13.509 35.9995 13.509 35.0096ZM26.332 32.1612C28.8933 32.7261 30.491 33.7744 30.491 35.0101C30.4719 35.44 30.2881 35.8467 29.9767 36.1477L44 39.7585V19.0597L26.332 32.1612ZM12.0105 14.3102C12.0105 11.5849 12.4965 9.11896 14.3015 7.33334H0V28.4407L16.1544 32.5904C17.3131 32.1996 18.5153 31.948 19.735 31.841C16.7894 27.7367 12.3097 20.4349 12.0105 14.809V14.3102ZM33.6913 7.33334H29.5049C31.3109 9.11993 31.9895 11.5849 31.9895 14.3102C31.9895 14.415 31.9841 14.5227 31.9802 14.6294C31.9802 14.6898 31.9895 14.7482 31.9895 14.809C31.9895 20.1514 27.3709 27.4779 24.4117 31.6233L44 16.9481V7.33334H33.6913Z" fill="#047247" /><circle cx="30.5552" cy="3.66667" r="1.22222" fill="#047247" /><circle cx="34.8333" cy="3.05555" r="1.83333" fill="#047247" /><circle cx="39.722" cy="3.05555" r="1.83333" fill="#047247" /></g>
									<defs><clipPath id="clip0_272_36222"><rect width="44" height="44" fill="#047247" /></clipPath></defs>
								</svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Acquire Land Application Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"> <%=applications.getApplicationNumber()%>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Divestment Option</p>
							<p class="lower-title"><%=applications.getDivestmentOptions()%><span class="one"> </span></p>
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
							<a href="<%=pdfFileUrl%>" type="button" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
								<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path></svg>
							</a> 
							<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg" data-toggle="tooltip" title="<%=applications.getApplicationNumber()%> Details"> 
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
								<li class="start-active <%=acquireDefaultActive%> acquire-land-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status">
											<span></span><%=acquireStageStatus%>
										</div>
									</div>
								</li>
								<%
								try {
									String stageJson = AcquireApplicationStagesLocalServiceUtil
											.getAcquireCurrentStages(applications.getCaseId());
									if (Validator.isNotNull(stageJson)) {
										JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
										for (int i = 0; i < stagesArray.length(); ++i) {
											JSONObject currentStage = stagesArray.getJSONObject(i);
								%>
								<li class='<%=currentStage.getString("status").equals("In Progress") || currentStage.getString("status").equals("Open") ? "current-active" : "unvisited"%> <%=currentStage.getString("status").equals("Closed") ? "start-active" : ""%> acquire-land-progress'>
									<div class="dashboard-progress-card">
										<%if (Validator.isNotNull(currentStage.getString("duration"))) {%>
										<p class="dashboard-progress-card-duration"><%=currentStage.getString("duration")%></p>
										<%
											}
										%>
										<div class="d-flex align-items-center">
											<p class="dashboard-progress-card-title"><%=currentStage.getString("startDate")%></p>
											<%
												if (Validator.isNotNull(currentStage.getString("endDate"))) {
											%>
											<div class="dashboard-progress-card-title px-1">-</div>
											<%}%>
											<p class="dashboard-progress-card-title">
												<%=currentStage.getString("endDate")%>
											</p>
										</div>
										<p class="dashboard-progress-card-title"><%=currentStage.getString("stageName")%></p>
										<%
											if (Validator.isNotNull(currentStage.getString("status"))) {
										%>
										<div class="dashboard-progress-card-status">
											<span></span>
											<%=currentStage.getString("status")%>
										</div>
										<%}%>
									</div>
								</li>
								<%}}} catch (Exception e) {}
								%>
								<li class="last acquire-land-progress">
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
					<a class="dash-yellow-repeated-link" onclick="getAcquireApplicationSpecificStage('<%=acquireDashboardRenderURL%>', 'overview', 'guest-overview-tab')">Overview</a>
					<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> 
						Discussion and Support 
						<span class="ml-2"> 
							<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path></svg>
						</span>
					</a>
				</div>
			</div>
		</div>
		<%if (expiredAcquiredDocumentCount > 0) {%>
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
							<p class="three">Your <%=expiredAcquiredDocumentCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getAcquireApplicationSpecificStage('<%=acquireDashboardRenderURL%>', 'acquire-document', 'acquire-document-tab')">Update document
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
	<%-- <div class="dash-light-cream-box common-dash-colored-boxes <%=notification%>">
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
		</div> --%>
</div><%}%>