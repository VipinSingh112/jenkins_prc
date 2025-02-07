<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.farm.application.form.service.service.FarmerApplicationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.nbp.farm.application.stages.service.service.FarmPermitLocalServiceUtil"%>
<%@page import="com.nbp.farm.application.form.service.model.FarmerApplication"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.nbp.farm.application.stages.service.model.FarmPermit"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%
	List<FarmPermit> fullRegistrations=null;
	FarmerApplication farmerAppli=null;
	
	try{
		if(superAdmin){
			fullRegistrations=FarmPermitLocalServiceUtil.getFarmPermits(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}else{
			try{
				farmerApplicationData = FarmerApplicationLocalServiceUtil.getFarmerApplicationByS_U(themeDisplay.getUserId(), UserDashboardPortletKeys.SUBMITTED);
			}catch(Exception e){
				e.printStackTrace();
			}
			}
	}catch(Exception e){
	}
	
	if(superAdmin&&Validator.isNotNull(fullRegistrations)){	
	for(FarmPermit fullRegis:fullRegistrations){
		if (fullRegis.getDateOfExpiration() != null && 
	            fullRegis.getDateOfExpiration().compareTo(new Date()) <= 0) {
	try{
		farmerAppli=FarmerApplicationLocalServiceUtil.getFarmerApplicationByCaseId(fullRegis.getCaseId()); 
	}catch(Exception e){
	}
	
	String farmDashboardRenderURL=null;
	try{
	 farmDashboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/farm-dashboard?farmerApplicationId="+farmerAppli.getFarmerApplicationId()+"&_com_nbp_farm_dashboard_web_FarmDashboardPortlet__stageTab=farm-license-certificate-tab"
			+"&_com_nbp_farm_dashboard_web_FarmDashboardPortlet_stageName=farm-license-certificate";
	}catch(Exception e){
	}
	if(farmerAppli!=null&&farmerAppli.getApplicationNumber()!=null){
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
										<span class="dash-card-number-heading"> 
										<%=Validator.isNotNull(farmerAppli)&&Validator.isNotNull(farmerAppli.getApplicationNumber())?farmerAppli.getApplicationNumber():""%>
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
									<%=Validator.isNotNull(farmerAppli)&&Validator.isNotNull(farmerAppli.getRequestType())?farmerAppli.getRequestType():""%>
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
		<%}}}}else{
			for(FarmerApplication fullRegis:farmerApplicationData){
				FarmPermit fullRegistrationsData=null;
				
				try{
					fullRegistrationsData=FarmPermitLocalServiceUtil.getFarmBY_CI(fullRegis.getCaseld()); 
				}catch(Exception e){
				}
				if (fullRegistrationsData!=null&&fullRegistrationsData.getDateOfExpiration() != null && 
						fullRegistrationsData.getDateOfExpiration().compareTo(new Date()) <= 0) {
			
			
			String farmDashboardRenderURL=null;
			try{
			 farmDashboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/farm-dashboard?farmerApplicationId="+fullRegis.getFarmerApplicationId()+"&_com_nbp_farm_dashboard_web_FarmDashboardPortlet__stageTab=farm-license-certificate-tab"
					+"&_com_nbp_farm_dashboard_web_FarmDashboardPortlet_stageName=farm-license-certificate";
			}catch(Exception e){
			}
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
											<%=Validator.isNotNull(fullRegis)&&Validator.isNotNull(fullRegis.getRequestType())?fullRegis.getRequestType():""%>
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
		<script>
		function getFarmSingleApplicationOverview(farmDashboardUrl) {
			window.location.href = farmDashboardUrl;
		}
		</script>