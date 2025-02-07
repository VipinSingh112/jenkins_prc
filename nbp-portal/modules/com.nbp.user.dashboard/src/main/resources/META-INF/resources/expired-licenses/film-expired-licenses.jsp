<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.nbp.film.application.form.service.service.FilmApplicationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.nbp.film.stages.services.service.FilmFullRegistrationLocalServiceUtil"%>
<%@page import="com.nbp.film.application.form.service.model.FilmApplication"%>
<%@page import="com.nbp.film.stages.services.model.FilmFullRegistration"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@include file="/init.jsp"%>
<%
	List<FilmFullRegistration> fullRegistrations=null;
	FilmApplication filmAppli=null;
	try{
		
		if(superAdmin){
			fullRegistrations=FilmFullRegistrationLocalServiceUtil.getFilmFullRegistrations(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}else{
			try{
				filmApplicationData = FilmApplicationLocalServiceUtil.getFilmByS_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
			}catch(Exception e){
				e.printStackTrace();
			}
			}
	}catch(Exception e){
	}
	if(superAdmin&&Validator.isNotNull(fullRegistrations)){
		try{
	for(FilmFullRegistration fullRegis:fullRegistrations){
		if (fullRegis.getProductionDateTo() != null && 
	            fullRegis.getProductionDateTo().compareTo(new Date()) <= 0) {
	try{
		filmAppli=FilmApplicationLocalServiceUtil.getFilmByCaseId(fullRegis.getCaseId());
	}catch(Exception e){
	}
	if(filmAppli!=null){
	String filmDashboardUrl =null;
	try{
		filmDashboardUrl = PortalUtil.getPortalURL(request)+"/group/guest"+"/film-dashboard?applicationId="
				+filmAppli.getFilmApplicationId()+"&_com_nbp_film_dashboard_web_FilmDashboardPortlet__stageTab=film-inspection-tab"
						+"&_com_nbp_film_dashboard_web_FilmDashboardPortlet_stageName=film-inspection";
	}catch(Exception e){
		e.printStackTrace();
	}
	if(filmAppli!=null&&filmAppli.getApplicationNumber()!=null){
	%>
			<div class="second-card dash-common-card">
			<div class="row p-3">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card row cursor-pointer" onclick="getFilmSingleApplicationOverview('<%=filmDashboardUrl%>')">
						<div class="d-flex col-lg-3">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="32" height="30" viewBox="0 0 32 30" fill="none"><path d="M30.3375 11.3741H4.70289L30.1288 6.23841C30.7623 6.11757 31.1721 5.50582 31.0529 4.87141L30.3897 1.44259C30.2704 0.808183 29.6594 0.40035 29.026 0.52119L1.44639 6.0798C0.812981 6.20064 0.403125 6.81239 0.522356 7.43925L1.18558 10.8681C1.23029 11.0795 1.34207 11.2608 1.4762 11.4118C0.92476 11.5025 0.5 11.9556 0.5 12.5372V28.3369C0.5 28.9789 1.02163 29.5 1.6625 29.5H30.3375C30.9784 29.5 31.5 28.9789 31.5 28.3369V12.5372C31.5 11.8952 30.9784 11.3741 30.3375 11.3741ZM19.6514 26.0561L15.8733 23.3145L12.0952 26.0561L13.5483 21.6454L9.76274 18.9265H14.4351L15.8659 14.5159L17.3041 18.9265H21.9764L18.1909 21.6454L19.6514 26.0561Z" fill="#047247"/></svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Film Application Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> 
										<%=Validator.isNotNull(filmAppli)&&Validator.isNotNull(filmAppli.getApplicationNumber())?filmAppli.getApplicationNumber():""%>
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
									<%=Validator.isNotNull(filmAppli)&&Validator.isNotNull(filmAppli.getProductionType())?filmAppli.getProductionType():""%>
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
		<%}}}}}catch(Exception e){}} else{
	for(FilmApplication fullRegis:filmApplicationData){
		FilmFullRegistration filmFullRegistrationData=null;
		try{
			filmFullRegistrationData=	FilmFullRegistrationLocalServiceUtil.getPharmaFullLIcense(fullRegis.getCaseId());
		}catch(Exception e){}
		if (filmFullRegistrationData!=null && filmFullRegistrationData.getProductionDateTo() != null && 
				filmFullRegistrationData.getProductionDateTo().compareTo(new Date()) <= 0) {
	
			String filmDashboardUrl =null;
			try{
				filmDashboardUrl = PortalUtil.getPortalURL(request)+"/group/guest"+"/film-dashboard?applicationId="
						+fullRegis.getFilmApplicationId()+"&_com_nbp_film_dashboard_web_FilmDashboardPortlet__stageTab=film-inspection-tab"
								+"&_com_nbp_film_dashboard_web_FilmDashboardPortlet_stageName=film-inspection";
			}catch(Exception e){
				e.printStackTrace();
			}
			%>
			<div class="second-card dash-common-card">
			<div class="row p-3">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card row cursor-pointer" onclick="getFilmSingleApplicationOverview('<%=filmDashboardUrl%>')">
						<div class="d-flex col-lg-3">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="32" height="30" viewBox="0 0 32 30" fill="none"><path d="M30.3375 11.3741H4.70289L30.1288 6.23841C30.7623 6.11757 31.1721 5.50582 31.0529 4.87141L30.3897 1.44259C30.2704 0.808183 29.6594 0.40035 29.026 0.52119L1.44639 6.0798C0.812981 6.20064 0.403125 6.81239 0.522356 7.43925L1.18558 10.8681C1.23029 11.0795 1.34207 11.2608 1.4762 11.4118C0.92476 11.5025 0.5 11.9556 0.5 12.5372V28.3369C0.5 28.9789 1.02163 29.5 1.6625 29.5H30.3375C30.9784 29.5 31.5 28.9789 31.5 28.3369V12.5372C31.5 11.8952 30.9784 11.3741 30.3375 11.3741ZM19.6514 26.0561L15.8733 23.3145L12.0952 26.0561L13.5483 21.6454L9.76274 18.9265H14.4351L15.8659 14.5159L17.3041 18.9265H21.9764L18.1909 21.6454L19.6514 26.0561Z" fill="#047247"/></svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Film Application Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> 
										<%=fullRegis.getApplicationNumber()%>
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
									<%=fullRegis.getProductionType()%>
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
	
	<% }}}%>
<Script>
		function getFilmSingleApplicationOverview(filmDashboardUrl) {
			window.location.href = filmDashboardUrl;
		}
		
</Script>