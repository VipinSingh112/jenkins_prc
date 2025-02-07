<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ include file="/init.jsp"%>
<link  href="<%= themeDisplay.getPathThemeCss()%>/vendors/select2.min.css" rel="stylesheet" />
<script type="text/javascript" data-senna-track="permanent" src="<%= themeDisplay.getPathThemeJavaScript()%>/plugins/select2.min.js"></script>
<section class="wizard-section dashboard-progress" id="dashboard-progress-all-application">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 px-0">
				<div class="inner-common-banner single-application-banner">
					<h1 class="text-white px-3">Your Dashboard</h1>
				</div>
			</div>
		</div>
			<div class="row">
				<div class="col-md-12 px-0">
					<div class="all-application-tabs">
						<div class="tabs-header px-3 d-flex justify-content-between flex-wrap">
							<ul class="nav nav-tabs justify-content-start" id="myTab"
								role="tablist">
								<li class="nav-item mr-3">
									<a class="nav-link active" id="#all-application-overview-tab" data-toggle="tab" href="#all-application-overview" role="tab" aria-controls="#all-application-overview" aria-selected="true">
										<span class="mr-1"> 
											<svg width="19" height="18" viewBox="0 0 19 18" fill="none" xmlns="http://www.w3.org/2000/svg">
												<path d="M17 0H2C0.9 0 0 0.9 0 2V16C0 17.1 0.9 18 2 18H17C18.1 18 19 17.1 19 16V2C19 0.9 18.1 0 17 0ZM5 16H2V7H5V16ZM12 16H7V7H12V16ZM17 16H14V7H17V16ZM17 5H2V2H17V5Z" fill="#FAFAF9" />
											</svg>
										</span> 
										Overview
									</a>
								</li>
								<li class="nav-item">
									<a class="nav-link" id="all-past-cases-tab" data-toggle="tab" href="#all-past-cases" role="tab" aria-controls="all-past-cases" aria-selected="false">
										<span class="mr-1"> 
											<svg width="18" height="18" viewBox="0 0 18 18" fill="none" xmlns="http://www.w3.org/2000/svg">
												<path d="M0 10H8V0H0V10ZM2 2H6V8H2V2ZM10 18H18V8H10V18ZM12 10H16V16H12V10ZM10 0V6H18V0H10ZM16 4H12V2H16V4ZM0 18H8V12H0V18ZM2 14H6V16H2V14Z" fill="#FAFAF9" />
											</svg>
										</span>
										Expired Licences
									</a>
								</li>
							</ul>
							<div class="form-group mb-0">
								<select class="form-control w-100" name="applicationType" onchange="viewSelectedApplication('<%=viewSingleApplicationUrl%>')" id="applicationType" style="width: 50%">
									<option>
										Please Select Application Type
									</option>
									<option label="Agriculture" value="<%=UserDashboardPortletKeys.COLLEBORATION_AGRICULTURE%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_AGRICULTURE)?"selected":"" %>>
										Agriculture
									</option>
									<option label="Acquire Land" value="<%=UserDashboardPortletKeys.COLLEBORATION_AQUIRELAND%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_AQUIRELAND)?"selected":"" %>>
										Acquire Land
									</option>
									<option label="Cannabis" value="<%=UserDashboardPortletKeys.COLLEBORATION_CANNABIS%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_CANNABIS)?"selected":"" %>>
										Cannabis
									</option>
									<option label="Creative" value="<%=UserDashboardPortletKeys.COLLEBORATION_CREATIVE%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_CREATIVE)?"selected":"" %>>
										Entertainment
									</option>
									<option label="Farm" value="<%=UserDashboardPortletKeys.COLLEBORATION_FARM%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FARM)?"selected":"" %>>
										Farm
									</option>
									<option label="Film" value="<%=UserDashboardPortletKeys.COLLEBORATION_FILM%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FILM)?"selected":"" %>>
										Film
									</option>
									<option label="Healthcare" value="<%=UserDashboardPortletKeys.COLLEBORATION_HEALTHCARE%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_HEALTHCARE)?"selected":"" %>>
										Healthcare
									</option>
									<option label="Manufacturing" value="<%=UserDashboardPortletKeys.COLLEBORATION_MANUFACTURING%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MANUFACTURING)?"selected":"" %>>
										Manufacturing
									</option>
									<option label="OSI Financial Counsellor" value="<%=UserDashboardPortletKeys.COLLEBORATION_OSI%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI)?"selected":"" %>>
										OSI Financial Counsellor
									</option>
									<option label="OSI Insolvency Report" value="<%=UserDashboardPortletKeys.COLLEBORATION_OSI_INSOLVENCY%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI_INSOLVENCY)?"selected":"" %>>
										OSI Insolvency Report
									</option>
									<option label="Pharmaceutical" value="<%=UserDashboardPortletKeys.COLLEBORATION_PHARMA%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_PHARMA)?"selected":"" %>>
										Pharmaceutical
									</option>
									<option label="Tourism" value="<%=UserDashboardPortletKeys.COLLEBORATION_TOURISM%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_TOURISM)?"selected":"" %>>
										Tourism
									</option>
									<option label="SEZ Status" value="<%=UserDashboardPortletKeys.COLLEBORATION_SEZ_STATUS%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_SEZ_STATUS)?"selected":"" %>>
										SEZ Status
									</option>
								 	<option label="Fire Brigade" value="<%=UserDashboardPortletKeys.COLLEBORATION_FIRE_BRIGADE%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FIRE_BRIGADE)?"selected":"" %>>
										Fire Brigade
									</option>
									<option label="OSI Services" value="<%=UserDashboardPortletKeys.COLLEBORATION_OSI_SERVICES%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI_SERVICES)?"selected":"" %>>
										OSI Services
									</option> 
									<option label="NCRA" value="<%=UserDashboardPortletKeys.COLLEBORATION_NCRA%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_NCRA)?"selected":"" %>>
										NCRA
									</option> 
									<option label="MIIC" value="<%=UserDashboardPortletKeys.COLLEBORATION_MIIC%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MIIC)?"selected":"" %>>
										MIIC
									</option> 
									<option label="Quarry" value="<%=UserDashboardPortletKeys.COLLEBORATION_QUARRY%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_QUARRY)?"selected":"" %>>
										Quarry
									</option> 
									<option label="Institutional Healthcare Facilities / Healthcare Facilities" value="<%=UserDashboardPortletKeys.COLLEBORATION_MEDICAL%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MEDICAL)?"selected":"" %>>
										Institutional Healthcare Facilities / Healthcare Facilities
									</option> 
									<option label="OGT Application" value="<%=UserDashboardPortletKeys.COLLEBORATION_OGT%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OGT)?"selected":"" %>>
										OGT Application
									<option label="NCBJ" value="<%=UserDashboardPortletKeys.COLLEBORATION_NCBJ%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_NCBJ)?"selected":"" %>>
										NCBJ
									</option> 
									<option label="Mining" value="<%=UserDashboardPortletKeys.COLLEBORATION_MINING%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MINING)?"selected":"" %>>
										Mining
									</option> 
									<option label="TPDCo" value="<%=UserDashboardPortletKeys.COLLEBORATION_TPDCo%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_TPDCo)?"selected":"" %>>
										TPDCo
									</option> 
									<option label="JANAAC" value="<%=UserDashboardPortletKeys.COLLEBORATION_JANAAC%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_JANAAC)?"selected":"" %>>
										JANAAC
									</option> 
									<option label="NCRA- Reg of Food Processing" value="<%=UserDashboardPortletKeys.COLLEBORATION_FACTORIES_REGISTRATION%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FACTORIES_REGISTRATION)?"selected":"" %>>
										NCRA- Reg of Food Processing
									</option> 
									<option label="ADSC" value="<%=UserDashboardPortletKeys.COLLEBORATION_JADSC%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_JADSC)?"selected":"" %>>
										ADSC
									</option> 
									<option label="WRA" value="<%=UserDashboardPortletKeys.COLLEBORATION_WRA%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_WRA)?"selected":"" %>>
										WRA
									</option> 
									<option label="HSRA" value="<%=UserDashboardPortletKeys.COLLEBORATION_HSRA%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_HSRA)?"selected":"" %>>
										HSRA
									</option> 
									<option label="Explosives Competency Certification" value="<%=UserDashboardPortletKeys.COLLEBORATION_EXPLOSIVE%>" <%=selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_EXPLOSIVE)?"selected":"" %>>
										Explosives Competency Certification
									</option> 
								</select>
							</div>
						</div>
						<div class="tab-content px-3" id="myTabContent">
						<div class="tab-pane fade" id="all-past-cases" role="tabpanel" aria-labelledby="all-past-cases-tab">
								<% 
												 if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FILM) ){
														%>
															<jsp:include page="/expired-licenses/film-expired-licenses.jsp" />
															
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_CANNABIS)){
													%>
															<jsp:include page="/expired-licenses/cannabis-expired-licenses.jsp" />
													<% 
														}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_AGRICULTURE)){
													%>
															<jsp:include page="/expired-licenses/agriculture-expired-licenses.jsp" />
													<% 
														}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FARM)){
													%>
															<jsp:include page="/expired-licenses/farm-expired-licenses.jsp" />
													<% 
														}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MANUFACTURING)){
													%>
															<jsp:include page="/expired-licenses/manufacturing-expired-licenses.jsp" />
													<%
														}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_CREATIVE)){
													%>
															<jsp:include page="/expired-licenses/creative-expired-licenses.jsp" />
														
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_TOURISM)){
													%>
															<jsp:include page="/expired-licenses/tourism-expired-licenses.jsp" />
													
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_WRA)){
													%>
															<jsp:include page="/expired-licenses/wra-expired-licenses.jsp" />
												
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_QUARRY)){
													%>
															<jsp:include page="/expired-licenses/quarry-expired-licenses.jsp" />
											
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MEDICAL)){
													%>
															<jsp:include page="/expired-licenses/medical-facilities-expired-licenses.jsp" />
													
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_TPDCo)){
													%>
															<jsp:include page="/expired-licenses/jtb-expired-licenses.jsp" />
													
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI)){
													%>
															<jsp:include page="/expired-licenses/osi-expired-licenses.jsp" />
													
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FACTORIES_REGISTRATION)){
													%>
															<jsp:include page="/expired-licenses/factories-expired-licenses.jsp" />
													
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_NCBJ)){
													%>
															<jsp:include page="/expired-licenses/ncbj-expired-licenses.jsp" />
													
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_HSRA)){
													%>
															<jsp:include page="/expired-licenses/hsra-expired-licenses.jsp" />
													
														<%}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MINING)){
													%>
															<jsp:include page="/expired-licenses/mining-expired-licenses.jsp" />
													
														<%}else if((selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_HEALTHCARE))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FIRE_BRIGADE))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_PHARMA))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_AQUIRELAND))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI_INSOLVENCY))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_NCRA))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MIIC))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OGT))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_SEZ_STATUS))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI_SERVICES))
																||(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_JADSC))){
													%>
															<div class="col-md-12">
															<p class="dash-common-card-heading mb-0 my-3">Not Required</p>
															</div>
													
														<%}else{%>
															<jsp:include page="/expired-licenses/film-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/cannabis-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/agriculture-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/farm-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/manufacturing-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/creative-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/tourism-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/wra-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/quarry-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/medical-facilities-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/jtb-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/osi-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/factories-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/ncbj-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/hsra-expired-licenses.jsp" />
															<jsp:include page="/expired-licenses/mining-expired-licenses.jsp" />
															
														<%}%>
							
						</div>
							<div class="tab-pane fade show active" id="all-application-overview" role="tabpanel" aria-labelledby="all-application-overview-tab">
								<div class="row">
									<!-- <div class="col-md-12">
										<p class="dash-common-card-heading mb-0 my-3">In progress Cases</p>
									</div>
									Accordion For Progress Cases -->
									<div class="col-md-12">
										<div class="accordion secured-accordian"
											id="progressCasesBox">
											<div class="row accordion__header is-active" id="progressCasesHeader"
											onclick="expandDetails(this.id)" >
												<div class="col-md-12">
													<div class="d-flex align-items-center justify-content-between">
														<div>
															<p class="dash-common-card-heading mb-0 my-3">In progress Cases</p>
														</div>
														<div>
															<span class="accordion__toggle"></span>
														</div>
													</div>
												</div>
												<div>
													<p class="accordian-employee mb-0 common-para"></p>
												</div>
											</div>
		
											<div class="accordion__body is-active">
												<div class="row">
													<div class="col-md-12">
														<%if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_AGRICULTURE) ){
															if(agricultureSubmittedApplicationsList.size()>0){
																noRecordFoundInProgressCases =false;
															}
														%>
															<jsp:include page="/agriculture-submitted-applications.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_AQUIRELAND) ){
																if(acquireApplication.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/acquire-submitted-applications.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_CANNABIS)){
														if(cannabisSubmittedApplicationsList.size()>0){
																	 noRecordFoundInProgressCases =false;	
														}
														%>
															<jsp:include page="/cannabis-submitted-applications.jsp"/>
															
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_CREATIVE)){
																if(creativeSubmittedApplicationsList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/creative-submitted-application.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FARM)){
																if(farmerSubmittedApplicationsList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/farm-submitted-applications.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FILM) ){
																if(filmApplication.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/film-submitted-applications.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_HEALTHCARE)){
																if(healthCareSubmittedApplicationsList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/healthcare-submitted-applications.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MANUFACTURING)){
																if(manuSubmittedApplicationsList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/manufacturing-submitted-application.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI) ){
																if(osiSubmittedApplicationsList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/osi-submitted-application.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI_INSOLVENCY) ){
																if(osiInsolvencySubmittedApplicationsList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															 <jsp:include page="/osi-insolvency-submitted-application.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_PHARMA)){
																if(pharmaSubmittedApplicationsList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/pharmaceutical-submitted-application.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_TOURISM) ){
																if(tourismSubmittedApplicationsList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/tourism-submitted-applications.jsp"/>
														<%
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_SEZ_STATUS) ){
																if(sezStatusSubmittedApplicationList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
																
														%>
															<jsp:include page="/sez-status-submitted-applications.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FIRE_BRIGADE) ){
																if(fireBrigadeApplication.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
															<jsp:include page="/fire-brigade-submitted-applications.jsp"/>
														<% 
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OSI_SERVICES) ){
																if(osiServiceSubmittedApplicationList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
																%>
																<jsp:include page="/osi-services-submitted-applications.jsp"/>
														<%  } else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_NCRA) ){
															if(ncraApplicationList.size()>0){
																noRecordFoundInProgressCases =false;
															}
				
														%>
																<jsp:include page="/ncra-submitted-application.jsp"/>
														<%
															}else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MIIC) ){
																if(miicApplicationList.size()>0){
																	noRecordFoundInProgressCases =false;
																}
														%>
																<jsp:include page="/miic-submitted-application.jsp"/>
														<%
															}
															else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_QUARRY) ){
																if(applicationQuarry.size()>0){
																	noRecordFoundInProgressCases =false;
																}
																%>
																		<jsp:include page="/quarry-submitted-application.jsp"/>
																<%
																	}
															else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MEDICAL) ){
																if(medicalFacilities.size()>0){
																	noRecordFoundInProgressCases =false;
																}
																%>
																		<jsp:include page="/medical-facilities-submitted-application.jsp"/>
																
																<%
																	}
															else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_OGT) ){
																if(ogtApplication.size()>0){
																	noRecordFoundInProgressCases =false;
																}
																%>
																		<jsp:include page="/ogt-submitted-applications.jsp"/>
																<%
																	}
															else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_MINING) ){
																if(applicationMining.size()>0){
																	noRecordFoundInProgressCases =false;
																}
																%>
																		<jsp:include page="/mining-submitted-application.jsp"/>
																<%
																	}
															else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_NCBJ) ){
																if(ncbjApplication.size()>0){
																	noRecordFoundInProgressCases =false;
																} 
																%>
																		<jsp:include page="/ncbj-submitted-application.jsp"/>
																<%
																	} else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_TPDCo) ){
																		if(jtbApplication.size()>0){
																			noRecordFoundInProgressCases =false;
																		}
																%>
																		<jsp:include page="/jtb-submitted-applications.jsp"/>
																<%
																	} 
																	 else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_JANAAC) ){
																		if(jannacApplication.size()>0){
																			noRecordFoundInProgressCases =false;
																		}
																%>
																		<jsp:include page="/janaac-submitted-applications.jsp"/>
																<%
																	} 
																	 else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_FACTORIES_REGISTRATION) ){
																		if(applicationFactoriesRegistration.size()>0){
																			noRecordFoundInProgressCases =false;
																		}
																%>
																	 <jsp:include page="/factories-submitted-application.jsp"/>
																<%
																	} else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_JADSC) ){
																		if(jadscApplication.size()>0){
																			noRecordFoundInProgressCases =false;
																		}
																%>
																		 <jsp:include page="/jadsc-submitted-applications.jsp"/> 
																<%
																	 } else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_WRA) ){
																		if(wraApplications.size()>0){
																			noRecordFoundInProgressCases =false;
																		}
																%>
																		 <jsp:include page="/wra-submitted-applications.jsp"/> 
																<%
																	 } else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_HSRA) ){
																		if(hsraApplications.size()>0){
																			noRecordFoundInProgressCases =false;
																		}
																%>
																	 <jsp:include page="/hsra-submitted-application.jsp"/>
																<%
																	} else if(selectedApplication.equals(UserDashboardPortletKeys.COLLEBORATION_EXPLOSIVE) ){
																		if(explosiveSubmittedApplicationsList.size()>0){
																			noRecordFoundInProgressCases =false;
																		}
																%>
																	 <jsp:include page="/explosive-submitted-applications.jsp"/>
																<%
																	}  
															
															else {
													if(agricultureSubmittedApplicationsList.size()>0||
															acquireApplication.size()>0||cannabisSubmittedApplicationsList.size()>0||creativeSubmittedApplicationsList.size()>0
															||farmerSubmittedApplicationsList.size()>0||filmApplication.size()>0||healthCareSubmittedApplicationsList.size()>0||
															manuSubmittedApplicationsList.size()>0||jtbApplication.size()>0||ncbjApplication.size()>0||applicationMining.size()>0||
															applicationQuarry.size()>0||miicApplicationList.size()>0||ncraApplicationList.size()>0||osiServiceSubmittedApplicationList.size()>0
															||tourismSubmittedApplicationsList.size()>0||
															pharmaSubmittedApplicationsList.size()>0||osiInsolvencySubmittedApplicationsList.size()>0
															||osiSubmittedApplicationsList.size()>0||applicationFactoriesRegistration.size()>0||jadscApplication.size()>0
															||wraApplications.size()>0||hsraApplications.size()>0||explosiveSubmittedApplicationsList.size()>0
															){
														noRecordFoundInProgressCases =false;
													}			
														%>
												                <jsp:include page="/cannabis-submitted-applications.jsp"/>
																<jsp:include page="/agriculture-submitted-applications.jsp"/>
																<jsp:include page="/farm-submitted-applications.jsp"/>
																<jsp:include page="/pharmaceutical-submitted-application.jsp"/> 
																<jsp:include page="/tourism-submitted-applications.jsp"/>
				 												<jsp:include page="/manufacturing-submitted-application.jsp"/> 
																<jsp:include page="/healthcare-submitted-applications.jsp"/>
																<jsp:include page="/creative-submitted-application.jsp"/>
																<jsp:include page="/film-submitted-applications.jsp"/>
																<jsp:include page="/osi-submitted-application.jsp"/>
																<jsp:include page="/acquire-submitted-applications.jsp"/>
				 												<jsp:include page="/osi-insolvency-submitted-application.jsp"/>
				 											    <jsp:include page="/sez-status-submitted-applications.jsp"/>
				 											    <jsp:include page="/fire-brigade-submitted-applications.jsp"/> 
				 											    <jsp:include page="/osi-services-submitted-applications.jsp"/>
				 											    <jsp:include page="/ncra-submitted-application.jsp"/>
				 											    <jsp:include page="/miic-submitted-application.jsp"/>
				 											    <jsp:include page="/quarry-submitted-application.jsp"/>
				 											    <jsp:include page="/medical-facilities-submitted-application.jsp"/>
				 											    <jsp:include page="/ogt-submitted-applications.jsp"/>
				 											    <jsp:include page="/mining-submitted-application.jsp"/>
				 											    <jsp:include page="/ncbj-submitted-application.jsp"/>
				 											    <jsp:include page="/jtb-submitted-applications.jsp"/>
				 											    <jsp:include page="/janaac-submitted-applications.jsp"/>
				 											    <jsp:include page="/factories-submitted-application.jsp"/>
				 											    <jsp:include page="/jadsc-submitted-applications.jsp"/>
				 											    <jsp:include page="/wra-submitted-applications.jsp"/>
				 											    <jsp:include page="/hsra-submitted-application.jsp"/>
				 											    <jsp:include page="/explosive-submitted-applications.jsp"/>
					 											<% 
																}
														%>
													</div>
												</div>
											</div>
										</div>
									</div>
										<% 
										  	if(noRecordFoundInProgressCases){
										%>
											<div class="col-md-12">
												<div class="alert alert-primary" role="alert">No In Progress Applications found.</div>
											</div>
										<%
											}
										%>
										<div class="col-md-12">
											<liferay-portlet:runtime portletName="com_nbp_user_draft_dashboard_DraftDashboardPortlet"></liferay-portlet:runtime>
										</div>
							</div>
							<div class="row">
							    <div class="col-md-12">
							        <div class="custom_loader hide" style="z-index: 9999; position: fixed; top: 0; left: 0; width: 100%; height: 100%; display: flex; justify-content: center; align-items: center;">
							            <div class="loader">
							                <div></div>
							                <div></div>
							                <div></div>
							                <div></div>
							                <div></div>
							                <div></div>
							                <div></div>
							                <div></div>
							                <div></div>
							            </div>
							        </div>
							    </div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<script>
	function getSingleApplicationSpecificStage(cannabisDashboardUrl, stageName,stageTab) {
		window.location.href = cannabisDashboardUrl+ "&_com_nbp_cannabis_dashboard_web_CannabisDashboardPortlet_stageName="+ stageName+ "&_com_nbp_cannabis_dashboard_web_CannabisDashboardPortlet_stageTab="+ stageTab;
	}
	function getSinglePharmaApplicationSpecificStage(pharmaDashboardUrl,stageName, stageTab) {
		window.location.href = pharmaDashboardUrl+ "&_com_nbp_pharmaceutical_dashboard_web_PharmaceuticalDashboardPortlet_stageName="+ stageName+ "&_com_nbp_pharmaceutical_dashboard_web_PharmaceuticalDashboardPortlet__stageTab="+ stageTab;
	}
	function getSingletourismApplicationSpecificStage(tourismDashboardUrl,stageName, stageTab) {
		window.location.href = tourismDashboardUrl+ "&_com_nbp_tourism_dashboard_web_ToursimDashboardPortlet_stageName="+ stageName+ "&_com_nbp_tourism_dashboard_web_ToursimDashboardPortlet__stageTab="+ stageTab;
	}
	function getSingleManufacturingApplicationSpecificStage(manufacturingDashboardUrl,stageName, stageTab) {
		window.location.href = manufacturingDashboardUrl+ "&_com_nbp_manufacturing_dashboard_web_ManufacturingDashboardPortlet_stageName="+ stageName+ "&_com_nbp_manufacturing_dashboard_web_ManufacturingDashboardPortlet__stageTab="+ stageTab;
	}
	function getSingleHealthcareApplicationSpecificStage(healthcareDashboardUrl,stageName, stageTab) {
		window.location.href = healthcareDashboardUrl+ "&_com_nbp_healthcare_dashboard_web_HealthcareDashbaordPortlet_stageName="+ stageName+ "&_com_nbp_healthcare_dashboard_web_HealthcareDashbaordPortlet__stageTab="+ stageTab;
	}
	function getSingleAgricultureApplicationSpecificStage(agricultureDashboardUrl,stageName, stageTab) {
		window.location.href = agricultureDashboardUrl+ "&_com_nbp_agriculture_dashboard_web_AgricultureDashboardWebPortlet_stageName="+ stageName+ "&_com_nbp_agriculture_dashboard_web_AgricultureDashboardWebPortlet__stageTab="+ stageTab;
	}
	function getFarmApplicationSpecificStage(farmDashboardUrl,stageName, stageTab) {
		window.location.href = farmDashboardUrl+ "&_com_nbp_farm_dashboard_web_FarmDashboardPortlet_stageName="+ stageName+ "&_com_nbp_farm_dashboard_web_FarmDashboardPortlet__stageTab="+ stageTab;
	}
	function getFilmApplicationSpecificStage(filmDashboardUrl,stageName, stageTab) {
		window.location.href = filmDashboardUrl+ "&_com_nbp_film_dashboard_web_FilmDashboardPortlet_stageName="+ stageName+ "&_com_nbp_film_dashboard_web_FilmDashboardPortlet__stageTab="+ stageTab;
	}
	function getCreativeApplicationSpecificStage(creativeDashboardUrl,stageName, stageTab) {
	window.location.href = creativeDashboardUrl+ "&_com_nbp_creative_dashboard_web_CreativeDashboardPortlet_stageName="+ stageName+ "&_com_nbp_creative_dashboard_web_CreativeDashboardPortlet__stageTab="+ stageTab;
	}
	function getAcquireApplicationSpecificStage(acquireDashboardUrl,stageName, stageTab) {
	window.location.href = acquireDashboardUrl+ "&_com_nbp_acquire_dashboard_web_AcquireDashboardPortlet_stageName="+ stageName+ "&_com_nbp_acquire_dashboard_web_AcquireDashboardPortlet__stageTab="+ stageTab;
	}
	function getSingleOsiApplicationSpecificStage(osiDashboardUrl,stageName, stageTab) {
	window.location.href = osiDashboardUrl+ "&_com_nbp_osi_dashboard_web_OsiDashbaordPortlet_stageName="+ stageName+ "&_com_nbp_osi_dashboard_web_OsiDashbaordPortlet__stageTab="+ stageTab;
	}
	function getOsiInsolvencyApplicationSpecificStage(osiInsolvencyDashboardRenderURL,stageName, stageTab) {
	window.location.href = osiInsolvencyDashboardRenderURL+ "&_com_nbp_osi_insolvency_dashboard_web_OsiInsolvencyDashboardPortlet_stageName="+ stageName+ "&_com_nbp_osi_insolvency_dashboard_web_OsiInsolvencyDashboardPortlet__stageTab="+ stageTab;
	}
	function getSezStatusApplicationSpecificStage(sezStatusDashboardRenderURL,stageName, stageTab) {
		window.location.href = sezStatusDashboardRenderURL+ "&_com_nbp_sez-status_dashboard_web_SezStatusDashboardPortlet_stageName="+ stageName+ "&_com_nbp_sez_status_dashboard_web_SezStatusDashboardPortlet__stageTab="+ stageTab;
	}
	function getFireBrigadeApplicationSpecificStage(fireBrigadeDashboardRenderURL,stageName, stageTab) {
		window.location.href = fireBrigadeDashboardRenderURL+ "&_com_nbp_fire_brigade_dashboard_web_FireBrigadeDashboardPortlet_stageName="+ stageName+ "&_com_nbp_fire_brigade_dashboard_web_FireBrigadeDashboardPortlet__stageTab="+ stageTab;
	}
	function getSingleQuarryApplicationSpecificStage(quarryDashboardRenderURL,stageName, stageTab) {
		window.location.href = quarryDashboardRenderURL+ "&_com_nbp_quarry_dashboard_web_QuarryDashboardWebPortlet_stageName="+ stageName+ "&_com_nbp_quarry_dashboard_web_QuarryDashboardWebPortlet__stageTab="+ stageTab;
	}
	function getSingleMedicalFacilitiesApplicationSpecificStage(medicalFacilitiesDashboardRenderURL,stageName, stageTab) {
		window.location.href = medicalFacilitiesDashboardRenderURL+ "&_com_nbp_medical_Facilities_dashboard_web_MedicalFacilitiesDashboardWebPortlet_stageName="+ stageName+ "&_com_nbp_medical_Facilities_dashboard_web_MedicalFacilitiesDashboardWebPortlet__stageTab="+ stageTab;
	}
	function getSingleOgtApplicationSpecificStage(ogtDashboardRenderURL,stageName, stageTab) {
		window.location.href = ogtDashboardRenderURL+ "&_com_nbp_ogt_dashboard_web_OgtDashboardWebPortlet_stageName="+ stageName+ "&_com_nbp_ogt_dashboard_web_OgtDashboardWebPortlet__stageTab="+ stageTab;
	}
	 function getMiningSingleApplicationOverview(miningDashboardRenderURL,stageName, stageTab) {
		window.location.href = miningDashboardRenderURL+ "&_com_nbp_mining_dashboard_web_MiningDashboardPortlet_stageName="+ stageName+ "&_com_nbp_mining_dashboard_web_MiningDashboardPortlet__stageTab="+ stageTab;
	}  
	 function getSingleOgtApplicationSpecificStage(ogtDashboardRenderURL,stageName, stageTab) {
		window.location.href = ogtDashboardRenderURL+ "&_com_nbp_mining_dashboard_web_MiningDashboardPortlet_stageName="+ stageName+ "&_com_nbp_mining_dashboard_web_MiningDashboardPortlet__stageTab="+ stageTab;
	}  
	 let activeTabContent = "";
	 $.fn.extend({
		    val: function() {
		        if (this.is("#myTab")) {
		            return this.find(".active").text().trim();
		        } else {
		            return this[0] && this[0].value;
		        }
		    }
		});

		Liferay.on('allPortletsReady', function() {
		    activeTabContent = $("#myTab").val();
		    console.log("Active Tab Content:", activeTabContent);
		});
		
	function viewSelectedApplication(viewSingleApplicationUrl) {
		var applicationType = $("#applicationType").val();
		$(".custom_loader").removeClass("hide");
		$("body").css({"pointer-events":"none","overflow":"hidden","opacity":"0.6"});
		activetab=	$("#myTab").val();
		if(activetab=="Expired Licences"){
		window.location.href = viewSingleApplicationUrl+ "&_com_nbp_user_dashboard_UserDashboardPortlet_selectedApplication="+ applicationType+"&_com_nbp_user_dashboard_UserDashboardPortlet_active-Tab=1"
		}
		else{
			window.location.href = viewSingleApplicationUrl+ "&_com_nbp_user_dashboard_UserDashboardPortlet_selectedApplication="+ applicationType
		}
	}
	function getSingleNcraApplicationSpecificStage(ncraDashboardUrl,stageName, stageTab) {
		window.location.href = ncraDashboardUrl+ "&_com_nbp_ncra_dashboard_web_ComNbpNcraDashboardWebPortlet_stageName="+ stageName+ "&_com_nbp_ncra_dashboard_web_ComNbpNcraDashboardWebPortlet__stageTab="+ stageTab;
	}
	function getSingleFactoriesApplicationSpecificStage(factoriesDashboardUrl,stageName, stageTab) {
		window.location.href = factoriesDashboardUrl+ "&com_nbp_factories_registration_dashboard_web_FactoriesRegistrationDashboardWebPortlet_stageName="+ stageName+ "&_com_nbp_factories_registration_dashboard_web_FactoriesRegistrationDashboardWebPortlet__stageTab="+ stageTab;
	}
	function getHSRASingleApplicationSpecificStage(hsraDashboardRenderURL,stageName, stageTab) {
		window.location.href = hsraDashboardRenderURL+ "&HSRADashboard_HSRADashboardPortlet_stageName="+ stageName+ "&HSRADashboard_HSRADashboardPortlet__stageTab="+ stageTab;
	} 
	function getSingleJTBApplicationSpecificStage(jtbDashboardRenderURL,stageName, stageTab) {
		window.location.href = jtbDashboardRenderURL+ "&com_nbp_jtb_dashboard_web_JtbDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_jtb_dashboard_web_JtbDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleExpExpirationApplicationSpecificStage(expRenderUrl,stageName, stageTab) {
		window.location.href = expRenderUrl+ "&com_nbp_explosives_competency_dashboard_web_ComNbpExplosivesCompetencyDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_explosives_competency_dashboard_web_ComNbpExplosivesCompetencyDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleFactoriesApplicationSpecificStage(factRenderUrl,stageName, stageTab) {
		window.location.href = factRenderUrl+ "&com_nbp_factories_registration_dashboard_web_FactoriesRegistrationDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_factories_registration_dashboard_web_FactoriesRegistrationDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleFactoriesApplicationSpecificStage(factRenderUrl,stageName, stageTab) {
		window.location.href = factRenderUrl+ "&com_nbp_factories_registration_dashboard_web_FactoriesRegistrationDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_factories_registration_dashboard_web_FactoriesRegistrationDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getFireApplicationSpecificStage(fireRenderUrl,stageName, stageTab) {
		window.location.href = fireRenderUrl+ "&com_nbp_fire_brigade_dashboard_web_FireBrigadeDashbaordPortlet_stageName="+ stageName+ "&com_nbp_fire_brigade_dashboard_web_FireBrigadeDashbaordPortlet__stageTab="+ stageTab;
	} 
	function getHsraApplicationSpecificStage(hsraRenderUrl,stageName, stageTab) {
		window.location.href = hsraRenderUrl+ "&HSRADashboard_HSRADashboardPortlet_stageName="+ stageName+ "&HSRADashboard_HSRADashboardPortlet__stageTab="+ stageTab;
	} 
	function getSingleJadscApplicationSpecificStage(jadscRenderUrl,stageName, stageTab) {
		window.location.href = jadscRenderUrl+ "&com_nbp_jadsc_dashboard_web_JadscApplicationDashboardPortlet_stageName="+ stageName+ "&com_nbp_jadsc_dashboard_web_JadscApplicationDashboardPortlet__stageTab="+ stageTab;
	} 
	function getSingleJannacApplicationSpecificStage(jannacRenderUrl,stageName, stageTab) {
		window.location.href = jannacRenderUrl+ "&com_nbp_janaac_dashboard_web_JanaacDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_janaac_dashboard_web_JanaacDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleJtbApplicationSpecificStage(jtbRenderUrl,stageName, stageTab) {
		window.location.href = jtbRenderUrl+ "&com_nbp_jtb_dashboard_web_JtbDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_jtb_dashboard_web_JtbDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleMedicalApplicationSpecificStage(medicalRenderUrl,stageName, stageTab) {
		window.location.href = medicalRenderUrl+ "&com_nbp_medical_facilities_dashboard_web_MedicalFacilitiesDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_medical_facilities_dashboard_web_MedicalFacilitiesDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleMiicApplicationSpecificStage(miicRenderUrl,stageName, stageTab) {
		window.location.href = miicRenderUrl+ "&com_nbp_miic_dashboard_web_ComNbpMiicDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_miic_dashboard_web_ComNbpMiicDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleMiningApplicationSpecificStage(miningRenderUrl,stageName, stageTab) {
		window.location.href = miningRenderUrl+ "&com_nbp_mining_dashboard_web_MiningDashboardPortlet_stageName="+ stageName+ "&com_nbp_mining_dashboard_web_MiningDashboardPortlet__stageTab="+ stageTab;
	} 
	function getSingleNcbjApplicationSpecificStage(ncbjRenderUrl,stageName, stageTab) {
		window.location.href = ncbjRenderUrl+ "&com_nbp_ncbj_dashboard_web_NcbjDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_ncbj_dashboard_web_NcbjDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleNcraApplicationSpecificStage(ncraRenderUrl,stageName, stageTab) {
		window.location.href = ncraRenderUrl+ "&com_nbp_ncra_dashboard_web_ComNbpNcraDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_ncra_dashboard_web_ComNbpNcraDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleOgtApplicationSpecificStage(ogtRenderUrl,stageName, stageTab) {
		window.location.href = ogtRenderUrl+ "&com_nbp_ogt_dashboard_web_OgtDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_ogt_dashboard_web_OgtDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleQuarryApplicationSpecificStage(quarryRenderUrl,stageName, stageTab) {
		window.location.href = quarryRenderUrl+ "&com_nbp_quarry_dashboard_web_QuarryDashboardWebPortlet_stageName="+ stageName+ "&com_nbp_quarry_dashboard_web_QuarryDashboardWebPortlet__stageTab="+ stageTab;
	} 
	function getSingleWraApplicationSpecificStage(wraRenderUrl,stageName, stageTab) {
		window.location.href = wraRenderUrl+ "&com_nbp_wra_dashboard_web_WRADashboardPortlet"+ stageName+ "&com_nbp_wra_dashboard_web_WRADashboardPortlet__stageTab="+ stageTab;
	} 
	$(".select2").select2({
        placeholder: "Select Application Type",
        allowClear: true,
    });
	function expandDetails(id){
	    var currentIsActive = $("#"+id).hasClass('is-active');
	    $("#"+id).removeClass('is-active');
	    $("#"+id).next('.accordion__body').removeClass('is-active');
	    if (currentIsActive != 1) {
	        $("#"+id).addClass('is-active');
	        $("#"+id).next('.accordion__body').addClass('is-active');
	    }
	}
	$(document).ready(function() {
	activeTab='<%=activeTab%>';
	if(activeTab=='1'){
		$("#all-past-cases-tab").click();
	 }
	});
</script>