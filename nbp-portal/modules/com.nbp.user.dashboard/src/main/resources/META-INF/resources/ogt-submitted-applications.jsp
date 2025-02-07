<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.nbp.ogt.stages.services.service.OgtApplicationStageLocalServiceUtil"%>
<%@page import="com.nbp.ogt.stages.services.model.OgtApplicationStage"%>
<%@page import="com.nbp.ogt.application.form.services.service.OgtApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtApplication"%>
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
	for(OgtApplication applications : ogtApplication){ 
		 String ogtRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/ogt-dashboard?ogtApplicationId=";
			if(Validator.isNotNull(selectedApplication)){
				ogtRenderURL = ogtRenderURL+String.valueOf(applications.getOgtApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				ogtRenderURL = ogtRenderURL+String.valueOf(applications.getOgtApplicationId());
			}
			String ogtDefaultActive = "current-active";
			String ogtStageStatus = "Submitted";
			List<OgtApplicationStage> currentInProgressStage =null;

			try{
				 currentInProgressStage = OgtApplicationStageLocalServiceUtil.getOgtByCI(applications.getCaseId());
				
			}catch(Exception e){	
			}
			if(Validator.isNotNull(currentInProgressStage)){
				ogtDefaultActive="unvisited";
			}
			String pdfOgtFileUrl ="";
			FileEntry pdfOgtFileEntry = null;
			try{
				pdfOgtFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
				pdfOgtFileUrl = DLURLHelperUtil.getDownloadURL(pdfOgtFileEntry, pdfOgtFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			}catch(Exception e){}
			 int expirationCount=0;
				try{
					expirationCount=DashboardUtil.getExpirationDocCount(applications.getOgtApplicationId(),themeDisplay,"OGT Supported Documents");
				}catch(Exception e){}
	
		
%>
	<section class="wizard-section dashboard-progress">
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getOgtSingleApplicationOverview('<%=ogtRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
							<svg width="50" height="50" viewBox="0 0 176 176" fill="none" xmlns="http://www.w3.org/2000/svg">
								<g clip-path="url(#clip0_9972_318326)">
								<path d="M44.9574 25.1289H35.3923C34.0724 25.1289 33.001 26.2003 33.001 27.5203V118.389C33.001 119.709 34.0724 120.781 35.3923 120.781H44.9576C46.2776 120.781 47.349 119.709 47.349 118.389V111.215H40.1751C38.8551 111.215 37.7837 110.144 37.7837 108.824C37.7837 107.504 38.8551 106.433 40.1751 106.433H47.349V96.8675H40.1751C38.8551 96.8675 37.7837 95.7961 37.7837 94.4761C37.7837 93.1561 38.8551 92.0847 40.1751 92.0847H47.349V82.5195H40.1751C38.8551 82.5195 37.7837 81.4481 37.7837 80.1281C37.7837 78.8081 38.8551 77.7368 40.1751 77.7368H47.349V68.1715H40.1751C38.8551 68.1715 37.7837 67.1001 37.7837 65.7801C37.7837 64.4601 38.8551 63.3888 40.1751 63.3888H47.349V53.8235H40.1751C38.8551 53.8235 37.7837 52.7521 37.7837 51.4322C37.7837 50.1122 38.8551 49.0408 40.1751 49.0408H47.349V39.4755H40.1751C38.8551 39.4755 37.7837 38.4042 37.7837 37.0842C37.7837 35.7642 38.8551 34.6928 40.1751 34.6928H47.349V27.5189C47.3487 26.2003 46.2774 25.1289 44.9574 25.1289Z" fill="#047247"/>
								<path d="M140.609 25.1289H131.044C129.724 25.1289 128.652 26.2003 128.652 27.5203V34.6942H135.826C137.146 34.6942 138.218 35.7655 138.218 37.0855C138.218 38.4055 137.146 39.4769 135.826 39.4769H128.652V49.0421H135.826C137.146 49.0421 138.218 50.1135 138.218 51.4335C138.218 52.7535 137.146 53.8249 135.826 53.8249H128.652V63.3901H135.826C137.146 63.3901 138.218 64.4615 138.218 65.7815C138.218 67.1015 137.146 68.1728 135.826 68.1728H128.652V77.7381H135.826C137.146 77.7381 138.218 78.8095 138.218 80.1295C138.218 81.4495 137.146 82.5208 135.826 82.5208H128.652V92.0861H135.826C137.146 92.0861 138.218 93.1574 138.218 94.4774C138.218 95.7974 137.146 96.8688 135.826 96.8688H128.652V106.434H135.826C137.146 106.434 138.218 107.505 138.218 108.825C138.218 110.145 137.146 111.217 135.826 111.217H128.652V118.391C128.652 119.711 129.724 120.782 131.044 120.782H140.609C141.929 120.782 143 119.711 143 118.391V27.5203C143 26.2003 141.929 25.1289 140.609 25.1289Z" fill="#047247"/>
								<path d="M122.135 15.6549L88.6565 6.08962C88.2261 5.97013 87.7717 5.97013 87.3462 6.08962L53.8679 15.6549C52.8396 15.9515 52.1318 16.8888 52.1318 17.9552V118.39C52.1318 119.71 53.2032 120.781 54.5232 120.781H71.2623V104.042C71.2623 102.722 72.3337 101.65 73.6537 101.65H102.349C103.669 101.65 104.741 102.722 104.741 104.042V120.781H121.48C122.8 120.781 123.871 119.71 123.871 118.39V17.9552C123.871 16.8888 123.163 15.9512 122.135 15.6549ZM76.0448 94.4765C76.0448 95.7965 74.9735 96.8679 73.6535 96.8679H64.0882C62.7682 96.8679 61.6969 95.7965 61.6969 94.4765V84.9113C61.6969 83.5913 62.7682 82.5199 64.0882 82.5199H73.6535C74.9735 82.5199 76.0448 83.5913 76.0448 84.9113V94.4765ZM76.0448 75.3462C76.0448 76.6662 74.9735 77.7376 73.6535 77.7376H64.0882C62.7682 77.7376 61.6969 76.6662 61.6969 75.3462V65.781C61.6969 64.461 62.7682 63.3896 64.0882 63.3896H73.6535C74.9735 63.3896 76.0448 64.461 76.0448 65.781V75.3462ZM76.0448 56.216C76.0448 57.536 74.9735 58.6073 73.6535 58.6073H64.0882C62.7682 58.6073 61.6969 57.536 61.6969 56.216V46.6507C61.6969 45.3307 62.7682 44.2594 64.0882 44.2594H73.6535C74.9735 44.2594 76.0448 45.3307 76.0448 46.6507V56.216ZM76.0448 37.0855C76.0448 38.4055 74.9735 39.4769 73.6535 39.4769H64.0882C62.7682 39.4769 61.6969 38.4055 61.6969 37.0855V27.5205C61.6969 26.2005 62.7682 25.1291 64.0882 25.1291H73.6535C74.9735 25.1291 76.0448 26.2005 76.0448 27.5205V37.0855ZM95.1751 94.4765C95.1751 95.7965 94.1037 96.8679 92.7837 96.8679H83.2185C81.8985 96.8679 80.8271 95.7965 80.8271 94.4765V84.9113C80.8271 83.5913 81.8985 82.5199 83.2185 82.5199H92.7837C94.1037 82.5199 95.1751 83.5913 95.1751 84.9113V94.4765ZM95.1751 75.3462C95.1751 76.6662 94.1037 77.7376 92.7837 77.7376H83.2185C81.8985 77.7376 80.8271 76.6662 80.8271 75.3462V65.781C80.8271 64.461 81.8985 63.3896 83.2185 63.3896H92.7837C94.1037 63.3896 95.1751 64.461 95.1751 65.781V75.3462ZM95.1751 56.216C95.1751 57.536 94.1037 58.6073 92.7837 58.6073H83.2185C81.8985 58.6073 80.8271 57.536 80.8271 56.216V46.6507C80.8271 45.3307 81.8985 44.2594 83.2185 44.2594H92.7837C94.1037 44.2594 95.1751 45.3307 95.1751 46.6507V56.216ZM95.1751 37.0855C95.1751 38.4055 94.1037 39.4769 92.7837 39.4769H83.2185C81.8985 39.4769 80.8271 38.4055 80.8271 37.0855V27.5205C80.8271 26.2005 81.8985 25.1291 83.2185 25.1291H92.7837C94.1037 25.1291 95.1751 26.2005 95.1751 27.5205V37.0855ZM114.306 94.4765C114.306 95.7965 113.234 96.8679 111.914 96.8679H102.349C101.029 96.8679 99.9576 95.7965 99.9576 94.4765V84.9113C99.9576 83.5913 101.029 82.5199 102.349 82.5199H111.914C113.234 82.5199 114.306 83.5913 114.306 84.9113V94.4765ZM114.306 75.3462C114.306 76.6662 113.234 77.7376 111.914 77.7376H102.349C101.029 77.7376 99.9576 76.6662 99.9576 75.3462V65.781C99.9576 64.461 101.029 63.3896 102.349 63.3896H111.914C113.234 63.3896 114.306 64.461 114.306 65.781V75.3462ZM114.306 56.216C114.306 57.536 113.234 58.6073 111.914 58.6073H102.349C101.029 58.6073 99.9576 57.536 99.9576 56.216V46.6507C99.9576 45.3307 101.029 44.2594 102.349 44.2594H111.914C113.234 44.2594 114.306 45.3307 114.306 46.6507V56.216ZM114.306 37.0855C114.306 38.4055 113.234 39.4769 111.914 39.4769H102.349C101.029 39.4769 99.9576 38.4055 99.9576 37.0855V27.5205C99.9576 26.2005 101.029 25.1291 102.349 25.1291H111.914C113.234 25.1291 114.306 26.2005 114.306 27.5205V37.0855Z" fill="#047247"/>
								<path d="M66.892 150.182C66.892 154.94 65.9901 158.989 64.1861 162.327C62.3963 165.665 59.9531 168.214 56.8565 169.976C53.7741 171.723 50.3082 172.597 46.4588 172.597C42.581 172.597 39.1009 171.716 36.0185 169.955C32.9361 168.193 30.5 165.643 28.7102 162.305C26.9205 158.967 26.0256 154.926 26.0256 150.182C26.0256 145.423 26.9205 141.375 28.7102 138.037C30.5 134.699 32.9361 132.156 36.0185 130.409C39.1009 128.648 42.581 127.767 46.4588 127.767C50.3082 127.767 53.7741 128.648 56.8565 130.409C59.9531 132.156 62.3963 134.699 64.1861 138.037C65.9901 141.375 66.892 145.423 66.892 150.182ZM57.5384 150.182C57.5384 147.099 57.0767 144.5 56.1534 142.384C55.2443 140.267 53.9588 138.662 52.2969 137.568C50.6349 136.474 48.6889 135.928 46.4588 135.928C44.2287 135.928 42.2827 136.474 40.6207 137.568C38.9588 138.662 37.6662 140.267 36.7429 142.384C35.8338 144.5 35.3793 147.099 35.3793 150.182C35.3793 153.264 35.8338 155.864 36.7429 157.98C37.6662 160.097 38.9588 161.702 40.6207 162.795C42.2827 163.889 44.2287 164.436 46.4588 164.436C48.6889 164.436 50.6349 163.889 52.2969 162.795C53.9588 161.702 55.2443 160.097 56.1534 157.98C57.0767 155.864 57.5384 153.264 57.5384 150.182ZM102.661 142.469C102.363 141.432 101.944 140.516 101.404 139.72C100.864 138.911 100.203 138.229 99.4222 137.675C98.6552 137.107 97.7745 136.673 96.7802 136.375C95.8001 136.077 94.7134 135.928 93.5202 135.928C91.2901 135.928 89.3299 136.482 87.6396 137.589C85.9634 138.697 84.6566 140.31 83.7191 142.426C82.7816 144.528 82.3129 147.099 82.3129 150.139C82.3129 153.179 82.7745 155.764 83.6978 157.895C84.6211 160.026 85.9279 161.652 87.6183 162.774C89.3086 163.882 91.3043 164.436 93.6055 164.436C95.6935 164.436 97.4762 164.067 98.9535 163.328C100.445 162.575 101.581 161.517 102.363 160.153C103.158 158.79 103.556 157.178 103.556 155.317L105.431 155.594H94.1808V148.648H112.441V154.145C112.441 157.98 111.631 161.276 110.012 164.031C108.392 166.773 106.162 168.889 103.321 170.381C100.48 171.858 97.2276 172.597 93.5629 172.597C89.4719 172.597 85.8782 171.695 82.7816 169.891C79.685 168.072 77.2702 165.494 75.5373 162.156C73.8185 158.804 72.9592 154.827 72.9592 150.224C72.9592 146.687 73.4705 143.534 74.4933 140.764C75.5302 137.98 76.979 135.622 78.8398 133.69C80.7006 131.759 82.8668 130.288 85.3384 129.28C87.81 128.271 90.4876 127.767 93.3711 127.767C95.8427 127.767 98.1438 128.129 100.275 128.854C102.405 129.564 104.294 130.572 105.942 131.879C107.604 133.186 108.961 134.741 110.012 136.545C111.063 138.335 111.738 140.31 112.036 142.469H102.661ZM115.834 135.97V128.364H151.672V135.97H138.312V172H129.193V135.97H115.834Z" fill="#047247"/>
								</g>
								<defs>
								<clipPath id="clip0_9972_318326">
								<rect width="176" height="176" fill="white"/>
								</clipPath>
								</defs>
							</svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">OGT<br/> Transaction Number</p>
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
							<p class="lower-title"><span class="one"><%=applications.getTypeOfMatter() %></span> </p>
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
							<a href="<%=Validator.isNotNull(pdfOgtFileUrl)?pdfOgtFileUrl:"javascript:void(0);"%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
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
								<li class="start-active <%=ogtDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=Validator.isNotNull(applications) && Validator.isNotNull(applications.getCreateDate())?new SimpleDateFormat("yyyy-MM-dd").format(applications.getCreateDate()):"Not Available"%></p>
										<div class="dashboard-progress-card-status">
											<span></span><%=ogtStageStatus %>
										</div>
									</div>
								</li>
							<%
							String stageJson = OgtApplicationStageLocalServiceUtil.getNcbjApplicaitonCurrentStages(applications.getCaseId());
							if(Validator.isNotNull(stageJson)){
								JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
								for(int i=0 ;i<stagesArray.length();++i){
									JSONObject currentStage = stagesArray.getJSONObject(i);
									%>
									<li class='<%=currentStage.getString("status").equals("In Progress")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> farm-progress'>
										<div class="dashboard-progress-card">
										<%
											if(Validator.isNotNull(currentStage.getString("duration"))){
												%>
													<p class="dashboard-progress-card-duration"><%=currentStage.getString("duration") %></p>
													
												<%
											}
										%>
										<div class="d-flex align-items-center">
											<p class="dashboard-progress-card-title"><%=currentStage.getString("startDate") %> </p>
											<div class="dashboard-progress-card-title px-1">-</div>
											<p class="dashboard-progress-card-title"> <%=currentStage.getString("endDate") %></p>
										</div>
											<p class="dashboard-progress-card-title"><%=currentStage.getString("stageName") %></p>
											<div class="dashboard-progress-card-status">
														<span></span>
												<%
												if(Validator.isNotNull(currentStage.getString("status"))){
													%>
														<%=currentStage.getString("status") %>
													<%
													}
												%>
											</div>
										</div>
									</li>
									<%
								}
								
							}
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
						<a class="dash-yellow-repeated-link" onclick="getOgtSingleApplicationOverview('<%=ogtRenderURL%>')"> Overview </a> 
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
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleOgtApplicationSpecificStage('<%=ogtRenderURL%>', 'ogt-document', 'ogt-document-tab')">Update document
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
	<%-- <div class="dash-light-cream-box common-dash-colored-boxes <%=notificationInOsiFc%>">
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
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleOsiApplicationSpecificStage('<%=osiDashboardRenderURL%>', 'osi-document', 'osi-document-tab')">
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
</section>
<% 	 }	 %>