<%@page import="com.nbp.janaac.stages.services.service.JanaacApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.janaac.stages.services.model.JanaacApplicationStages"%>
<%@page import="com.nbp.janaac.application.form.service.model.JanaacApplication"%>
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
List<JanaacApplicationStages> janaacCurrentInProgressStages = null; 
	for(JanaacApplication applications : jannacApplication){ 
		 String janaacRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/janaac-dashboard?janaacApplicationId=";
			if(Validator.isNotNull(selectedApplication)){
				janaacRenderURL = janaacRenderURL+String.valueOf(applications.getJanaacApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				janaacRenderURL = janaacRenderURL+String.valueOf(applications.getJanaacApplicationId());
			}
			String janaacDefaultActive = "current-active";
			String janaacStageStatus = "Submitted";
			 try{
				 janaacCurrentInProgressStages = JanaacApplicationStagesLocalServiceUtil.getJanaacByCI(applications.getCaseId());
					 }catch(Exception e){
						}
			 if (Validator.isNotNull(janaacCurrentInProgressStages)) {
				 janaacDefaultActive = "unvisited";
				} 
		   String pdfJanaacFileUrl ="";
			FileEntry pdfJanaacFileEntry = null;
			try{
				pdfJanaacFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
				pdfJanaacFileUrl = DLURLHelperUtil.getDownloadURL(pdfJanaacFileEntry, pdfJanaacFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			}catch(Exception e){}
			int expirationCount=0;
			try{
				expirationCount=	DashboardUtil.getExpirationDocCount(applications.getJanaacApplicationId(),themeDisplay,"JANAAC Supported Documents");
			}catch(Exception e){}
			String checkDateInJannac="";
			String notification="hide";
			try{
				 checkDateInJannac=DashboardUtil.showExplosiveExpiredLiceseNotification(applications.getCaseId());
			 if(Validator.isNotNull(checkDateInJannac)){
				  notification="show";  
			 }
			}catch(Exception e){
			 } 
			
%>
	<section class="wizard-section dashboard-progress">
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getJanaacSingleApplicationOverview('<%=janaacRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
							<svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 220 220" fill="none">
								<g clip-path="url(#clip0_10050_318989)">
								<path d="M0.389771 139.379C0.759812 140.776 1.40288 142.086 2.28186 143.234C3.16084 144.381 4.25833 145.343 5.51102 146.064L26.5467 158.224V182.443C26.5467 185.364 27.707 188.165 29.7724 190.231C31.8378 192.296 34.6392 193.457 37.5601 193.457H61.7786L73.9375 214.493C74.91 216.162 76.3016 217.548 77.9744 218.514C79.6473 219.48 81.5434 219.992 83.4751 220C85.4121 220.002 87.3153 219.493 88.9928 218.524L110.006 206.365L131.042 218.524C133.572 219.982 136.577 220.376 139.398 219.62C142.218 218.864 144.624 217.02 146.086 214.493L158.234 193.468H182.453C185.374 193.468 188.175 192.307 190.24 190.242C192.306 188.176 193.466 185.375 193.466 182.454V158.235L214.502 146.075C217.029 144.613 218.873 142.207 219.627 139.385C220.381 136.564 219.983 133.559 218.522 131.031L206.363 110.005L218.522 88.9909C219.983 86.4626 220.381 83.4575 219.627 80.6362C218.873 77.8149 217.029 75.4085 214.502 73.9461L193.466 61.7869V37.5565C193.466 34.6355 192.306 31.8341 190.24 29.7686C188.175 27.7031 185.374 26.5427 182.453 26.5427H158.234L146.086 5.51741C144.623 2.99112 142.22 1.14614 139.401 0.384986C138.004 0.00628704 136.546 -0.0913623 135.111 0.0976981C133.676 0.286758 132.293 0.758769 131.042 1.48637L110.006 13.6456L88.9818 1.48637C87.7307 0.759847 86.3485 0.287474 84.9144 0.0963405C83.4803 -0.0947926 82.0227 -0.000925996 80.625 0.372558C79.2273 0.746042 77.917 1.3918 76.7694 2.27278C75.6218 3.15376 74.6594 4.25265 73.9375 5.5064L61.7786 26.5427H37.5601C34.6392 26.5427 31.8378 27.7031 29.7724 29.7686C27.707 31.8341 26.5467 34.6355 26.5467 37.5565V61.7759L5.51102 73.9351C4.25584 74.6571 3.15569 75.62 2.27378 76.7685C1.39187 77.917 0.745573 79.2285 0.372029 80.6275C-0.00151534 82.0266 -0.094947 83.4856 0.0971016 84.9209C0.28915 86.3562 0.762895 87.7393 1.49112 88.9909L13.6499 110.005L1.49112 131.02C0.765821 132.272 0.295141 133.655 0.106134 135.089C-0.0828724 136.524 0.0135197 137.982 0.389771 139.379ZM35.8971 104.487L26.0731 87.4931L43.0778 77.6578C44.75 76.6897 46.1381 75.2988 47.1027 73.6246C48.0673 71.9505 48.5746 70.052 48.5735 68.1198V48.5703H68.1334C72.0652 48.5703 75.7106 46.4777 77.671 43.0634L87.495 26.0692L104.5 35.8935C106.173 36.8623 108.073 37.3724 110.006 37.3724C111.94 37.3724 113.84 36.8623 115.513 35.8935L132.529 26.0692L142.342 43.0634C143.308 44.7377 144.699 46.128 146.373 47.0947C148.047 48.0613 149.946 48.5703 151.879 48.5703H171.439V68.1308C171.438 70.063 171.946 71.9615 172.91 73.6357C173.875 75.3098 175.263 76.7007 176.935 77.6688L193.94 87.5041L184.105 104.498C183.136 106.174 182.626 108.075 182.626 110.011C182.626 111.946 183.136 113.848 184.105 115.523L193.94 132.517L176.935 142.353C175.263 143.321 173.875 144.712 172.91 146.386C171.946 148.06 171.438 149.959 171.439 151.891V171.451H151.879C149.946 171.449 148.046 171.957 146.371 172.924C144.697 173.891 143.307 175.282 142.342 176.958L132.529 193.952L115.513 184.117C113.838 183.148 111.936 182.638 110.001 182.638C108.066 182.638 106.164 183.148 104.489 184.117L87.495 193.952L77.671 176.958C76.7027 175.285 75.3121 173.896 73.6382 172.93C71.9644 171.963 70.0661 171.453 68.1334 171.451H48.5735V151.891C48.5746 149.959 48.0673 148.06 47.1027 146.386C46.1381 144.712 44.75 143.321 43.0778 142.353L26.0731 132.517L35.9081 115.523C36.8771 113.845 37.3864 111.941 37.3845 110.004C37.3825 108.066 36.8695 106.163 35.8971 104.487Z" fill="#047247"></path>
								<path d="M50.72 98.1111H56.9386V118.859C56.9386 120.777 56.5075 122.443 55.6455 123.857C54.7931 125.271 53.6065 126.361 52.0858 127.126C50.565 127.891 48.7973 128.274 46.7826 128.274C44.9906 128.274 43.3633 127.959 41.9007 127.33C40.4478 126.69 39.2951 125.722 38.4427 124.424C37.5903 123.116 37.169 121.474 37.1787 119.498H43.4408C43.4602 120.283 43.62 120.956 43.9203 121.518C44.2302 122.07 44.6516 122.496 45.1843 122.796C45.7268 123.087 46.3661 123.232 47.1022 123.232C47.8771 123.232 48.5309 123.068 49.0637 122.738C49.6061 122.399 50.0178 121.905 50.2987 121.256C50.5796 120.607 50.72 119.808 50.72 118.859V98.1111ZM61.1317 127.867H54.3901L64.6624 98.1111H72.7697L83.0275 127.867H76.2858L68.8323 104.911H68.5998L61.1317 127.867ZM60.7104 116.171H76.6346V121.082H60.7104V116.171ZM105.361 98.1111V127.867H99.9265L86.9809 109.139H86.763V127.867H80.4718V98.1111H85.9929L98.8368 116.825H99.0984V98.1111H105.361ZM109.55 127.867H102.808L113.081 98.1111H121.188L131.446 127.867H124.704L117.251 104.911H117.018L109.55 127.867ZM109.129 116.171H125.053V121.082H109.129V116.171ZM134.019 127.867H127.277L137.55 98.1111H145.657L155.915 127.867H149.173L141.719 104.911H141.487L134.019 127.867ZM133.598 116.171H149.522V121.082H133.598V116.171ZM178.215 108.529H171.851C171.735 107.705 171.498 106.974 171.139 106.335C170.781 105.686 170.321 105.134 169.759 104.678C169.197 104.223 168.548 103.874 167.812 103.632C167.086 103.39 166.296 103.269 165.444 103.269C163.904 103.269 162.562 103.652 161.419 104.417C160.276 105.172 159.39 106.277 158.76 107.73C158.131 109.173 157.816 110.926 157.816 112.989C157.816 115.11 158.131 116.893 158.76 118.336C159.4 119.779 160.291 120.869 161.434 121.605C162.577 122.341 163.899 122.709 165.4 122.709C166.243 122.709 167.023 122.598 167.739 122.375C168.466 122.152 169.11 121.828 169.672 121.402C170.234 120.966 170.698 120.438 171.067 119.818C171.444 119.198 171.706 118.491 171.851 117.697L178.215 117.726C178.05 119.091 177.639 120.409 176.98 121.678C176.331 122.937 175.454 124.065 174.35 125.063C173.256 126.051 171.948 126.836 170.427 127.417C168.916 127.988 167.207 128.274 165.298 128.274C162.644 128.274 160.271 127.673 158.179 126.472C156.097 125.271 154.45 123.533 153.239 121.256C152.038 118.98 151.437 116.224 151.437 112.989C151.437 109.744 152.048 106.984 153.268 104.707C154.489 102.431 156.145 100.697 158.237 99.5059C160.329 98.3048 162.683 97.7043 165.298 97.7043C167.023 97.7043 168.621 97.9464 170.093 98.4307C171.575 98.915 172.888 99.6221 174.031 100.552C175.174 101.472 176.103 102.601 176.82 103.937C177.547 105.274 178.012 106.804 178.215 108.529Z" fill="#047247"></path>
								</g>
								<defs>
								<clipPath id="clip0_10050_318989">
								<rect width="220" height="220" fill="white"></rect>
								</clipPath>
								</defs>
								</svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Janaac<br/> Transaction Number</p>
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
							<p class="lower-title"><span class="one"><%=applications.getAccreditationType() %></span> </p>
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
							<a href="javascript:void(0);" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
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
								<li class="start-active <%=janaacDefaultActive%>">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=janaacStageStatus %></div>
									</div>
								</li>
							<%try{
								String stageJson= JanaacApplicationStagesLocalServiceUtil.getJanaacApplicationCurrentStages(applications.getCaseId());
								if(Validator.isNotNull(stageJson)){
									JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
									for(int i=0 ;i<stagesArray.length();++i){
										JSONObject currentStage = stagesArray.getJSONObject(i);%>
										<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %>'>
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
						<a class="dash-yellow-repeated-link" onclick="getSingleOgtApplicationSpecificStage('<%=janaacRenderURL%>', 'overview', 'ogt-overview-tab') "> Overview </a> 
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
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleJannacApplicationSpecificStage('<%=janaacRenderURL%>', 'document', 'document-tab')">Update document
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
<%-- 	<div class="dash-light-cream-box common-dash-colored-boxes <%=notification%>">
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
							<p class="three"><%=Validator.isNotNull(checkDateInJannac)?checkDateInJannac:"" %> <span> Extension or Transfer Required </span></p>
						</div>
					</div>
				</div>
			</div>
		</div>   --%>
</section>
<% 	 }	 %>