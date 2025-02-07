<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.npm.cannabis.application.stages.services.service.CannabisLicenseLocalServiceUtil"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.nbp.cannabis.application.form.services.service.CannabisApplicationsLocalServiceUtil"%>
<%@page import="com.nbp.cannabis.application.form.services.model.CannabisApplications"%>
<%@page import="com.npm.cannabis.application.stages.services.model.CannabisLicense"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp"%>
<%
List<CannabisLicense> cannabisLicenses =null;
CannabisApplications applications=null;

try{
	
	if(superAdmin){
		cannabisLicenses=CannabisLicenseLocalServiceUtil.getCannabisLicenses(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}else{
		try{
			cannabisApplicationData = CannabisApplicationsLocalServiceUtil.getCannabisApplicationsByS_U(themeDisplay.getUserId(), UserDashboardPortletKeys.SUBMITTED);       
		}catch(Exception e){
			e.printStackTrace();
		}
		}
}catch(Exception e){
}
	if(superAdmin&&Validator.isNotNull(cannabisLicenses)){
	for(CannabisLicense cannabisLicense:cannabisLicenses){
		if(cannabisLicense.getExpirationDate()!=null && cannabisLicense.getExpirationDate().compareTo(new Date())<0 ){
			
			try{
			applications = CannabisApplicationsLocalServiceUtil.getCannabisApplicationsByCaseId(cannabisLicense.getCaseId());
			}catch(Exception e){
			}
			String cannabisDashboardUrl =null;
				 try{
					 cannabisDashboardUrl= PortalUtil.getPortalURL(request)+"/group/guest"+"/cannabis-dashboard?cannabisApplicationId="+applications.getCannabisApplicationId()+"&_com_nbp_cannabis_dashboard_web_CannabisDashboardPortlet_stageTab=guest-licence-issuance-tab"
						+"&_com_nbp_cannabis_dashboard_web_CannabisDashboardPortlet_stageName=license-issuance";
				 }catch(Exception e){}
			if(applications!=null&&applications.getApplicationNumber()!=null){
			%>
		<div class="second-card dash-common-card">
			<div class="row p-3">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card row cursor-pointer"  onclick="getSingleApplicationOverview('<%=cannabisDashboardUrl%>')"> 
						<div class="d-flex col-lg-3">
							<div class="icon">
								<span class="mr-2"> 
									<svg width="33" height="40" viewBox="0 0 33 40" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M17.5 40V30.7C18.5 32.26 20.5 34.18 24.44 35.62C24.44 35.62 23.44 32.2 20.62 29.9C23.22 30.46 27.14 30.38 32.5 28C32.5 28 27.56 25.18 21.94 25.94C25.12 24 29.1 20.16 32.16 12.22C32.16 12.22 23.16 14.68 18.68 22.28C22.74 12.48 16.5 0 16.5 0C11.64 10.94 12.68 18.2 14.26 22.2C9.76 14.66 0.84 12.22 0.84 12.22C3.9 20.16 7.88 24 11.06 25.94C5.44 25.18 0.5 28 0.5 28C5.86 30.38 9.78 30.46 12.38 29.9C9.56 32.2 8.56 35.62 8.56 35.62C12.5 34.18 14.5 32.26 15.5 30.7V40H17.5Z" fill="#047247"></path></svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Cannabis Application Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> 
										<%=Validator.isNotNull(applications)&&Validator.isNotNull(applications.getApplicationNumber())?applications.getApplicationNumber():""%>
										</span>
									</div>
								</div>
							</div>
						</div>
						<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
							<div class="single-box">
								<p class="upper-title">Category / Tier</p>
								<p class="lower-title">
									<span class="one"> 
									</span> <span class="two">
									<%=Validator.isNotNull(applications)&&Validator.isNotNull(applications.getLicenseCategory())?applications.getLicenseCategory():""%>
									</span>
								</p>
							</div>
						</div>
						<div class="right-part d-flex col-lg-3 justify-content-end">
							<div class="dash-status-box">
								<p class="dash-status">Status</p>
								<p class="dash-status-type">
									<span class="circle"></span> <span class="dash-status-type-info">
										Expired
									</span>
								</p>
							</div>
							<div class="dash-action-box d-flex">
								<a href="" type="button" class="dash-action-btns mr-2 common-yellow-bg">
										<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
						                    <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
						                </svg>
								</a>
								<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg"> 
									<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg">
						                 <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path>
						            </svg>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row p-3">
				<div class="col-md-12">
					<div class="lower  dash-lower-multiple-links-box">
						<a href="javascript:void(0);" class="dash-yellow-repeated-link" onclick="">Overview 
						</a> 
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
		</div>
			<% }}}}else{
				for(CannabisApplications fullRegis:cannabisApplicationData){
					CannabisLicense CannabisLicenseData =null;
						try{
							CannabisLicenseData = CannabisLicenseLocalServiceUtil.getCannabisLicenseByCaseId(fullRegis.getCaseId());
						}catch(Exception e){}
						if (CannabisLicenseData!=null && CannabisLicenseData.getExpirationDate() != null && 
								CannabisLicenseData.getExpirationDate().compareTo(new Date()) <= 0) {
							String cannabisDashboardUrl =null;
							 try{
								 cannabisDashboardUrl= PortalUtil.getPortalURL(request)+"/group/guest"+"/cannabis-dashboard?cannabisApplicationId="+fullRegis.getCannabisApplicationId()+"&_com_nbp_cannabis_dashboard_web_CannabisDashboardPortlet_stageTab=guest-licence-issuance-tab"
									+"&_com_nbp_cannabis_dashboard_web_CannabisDashboardPortlet_stageName=license-issuance";
							 }catch(Exception e){}
						%>
					<div class="second-card dash-common-card">
						<div class="row p-3">
							<div class="col-md-12">
								<div class="progress-plus-wizard-card row cursor-pointer"  onclick="getSingleApplicationOverview('<%=cannabisDashboardUrl%>')"> 
									<div class="d-flex col-lg-3">
										<div class="icon">
											<span class="mr-2"> 
												<svg width="33" height="40" viewBox="0 0 33 40" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M17.5 40V30.7C18.5 32.26 20.5 34.18 24.44 35.62C24.44 35.62 23.44 32.2 20.62 29.9C23.22 30.46 27.14 30.38 32.5 28C32.5 28 27.56 25.18 21.94 25.94C25.12 24 29.1 20.16 32.16 12.22C32.16 12.22 23.16 14.68 18.68 22.28C22.74 12.48 16.5 0 16.5 0C11.64 10.94 12.68 18.2 14.26 22.2C9.76 14.66 0.84 12.22 0.84 12.22C3.9 20.16 7.88 24 11.06 25.94C5.44 25.18 0.5 28 0.5 28C5.86 30.38 9.78 30.46 12.38 29.9C9.56 32.2 8.56 35.62 8.56 35.62C12.5 34.18 14.5 32.26 15.5 30.7V40H17.5Z" fill="#047247"></path></svg>
											</span>
										</div>
										<div class="left-part">
											<p class="dash-card-licence-heading mb-2">Cannabis Application Transaction Number</p>
											<div class="dash-conditional-box">
												<div class="dash-conditional-box-left">
													<span class="dash-card-number-heading"> 
													<%=Validator.isNotNull(fullRegis)&&Validator.isNotNull(fullRegis.getApplicationNumber())?fullRegis.getApplicationNumber():""%>
													</span>
												</div>
											</div>
										</div>
									</div>
									<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
										<div class="single-box">
											<p class="upper-title">Category / Tier</p>
											<p class="lower-title">
												<span class="one"> 
												</span> <span class="two">
												<%=Validator.isNotNull(fullRegis)&&Validator.isNotNull(fullRegis.getLicenseCategory())?fullRegis.getLicenseCategory():""%>
												</span>
											</p>
										</div>
									</div>
									<div class="right-part d-flex col-lg-3 justify-content-end">
										<div class="dash-status-box">
											<p class="dash-status">Status</p>
											<p class="dash-status-type">
												<span class="circle"></span> <span class="dash-status-type-info">
													Expired
												</span>
											</p>
										</div>
										<div class="dash-action-box d-flex">
											<a href="" type="button" class="dash-action-btns mr-2 common-yellow-bg">
													<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
									                    <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
									                </svg>
											</a>
											<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg"> 
												<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg">
									                 <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path>
									            </svg>
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="row p-3">
							<div class="col-md-12">
								<div class="lower  dash-lower-multiple-links-box">
									<a href="javascript:void(0);" class="dash-yellow-repeated-link" onclick="">Overview 
									</a> 
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
					</div>
						<%}}}%>
	
<Script>
		function getSingleApplicationOverview(cannabisDashboardUrl) {
			window.location.href = cannabisDashboardUrl;
		}
</Script>