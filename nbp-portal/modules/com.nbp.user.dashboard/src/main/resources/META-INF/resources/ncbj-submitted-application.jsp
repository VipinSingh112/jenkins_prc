<%@page import="java.util.Date"%>
<%@page import="com.nbp.ncbj.stages.services.service.NcbjLicenceCertificateLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate"%>
<%@page import="com.nbp.ncbj.stages.services.service.NcbjApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.stages.services.model.NcbjApplicationStages"%>
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
List<NcbjApplicationStages> ncbjCurrentInProgressStages=null;
List<NcbjApplication> ncbjSubmitApp = new ArrayList<NcbjApplication>();

if (superAdmin) {
	ncbjApplicationData = NcbjApplicationLocalServiceUtil.getNCBJAppBy_Status(UserDashboardPortletKeys.SUBMITTED);	
}else{
	try{
		ncbjApplicationData = NcbjApplicationLocalServiceUtil.getNCBJAppBy_S_U(themeDisplay.getUserId(), UserDashboardPortletKeys.SUBMITTED);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
     
		NcbjLicenceCertificate fullRegis=null;
		boolean expiredflag=false;
		for(NcbjApplication appData:ncbjApplicationData){
			try{
			fullRegis=	NcbjLicenceCertificateLocalServiceUtil.getNcbjLicenceCertiBy_CI(appData.getCaseId());
			if (fullRegis != null && fullRegis.getExpirationDate() != null) {
	            if (fullRegis.getExpirationDate().compareTo(new Date()) <= 0) {
			
				expiredflag=true;
		}}}catch(Exception e){
		}
			if(!expiredflag){
				ncbjSubmitApp.add(appData);
			}
			expiredflag = false;
		}
	for(NcbjApplication applications : ncbjSubmitApp){ 
		 String ncbjRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/ncbj-dashboard?ncbjApplicationId=";
			if(Validator.isNotNull(selectedApplication)){
				ncbjRenderURL = ncbjRenderURL+String.valueOf(applications.getNcbjApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				ncbjRenderURL = ncbjRenderURL+String.valueOf(applications.getNcbjApplicationId());
			}
		 	String ncbjDefaultActive = "current-active";
			String ncbjStageStatus = "Submitted";
			 try{
				 ncbjCurrentInProgressStages = NcbjApplicationStagesLocalServiceUtil.getMiningByCI(applications.getCaseId());
					 }catch(Exception e){
						}
			 if (Validator.isNotNull(ncbjCurrentInProgressStages)) {
				 ncbjDefaultActive = "unvisited";
				} 
			 String pdfNcbjFileUrl ="";
			 FileEntry pdfNcbjFileEntry = null;
			 try{
			 pdfNcbjFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
			 pdfNcbjFileUrl = DLURLHelperUtil.getDownloadURL(pdfNcbjFileEntry, pdfNcbjFileEntry.getFileVersion(), themeDisplay,
			 			StringPool.BLANK, false, true);
			 }catch(Exception e){}
			  int expirationCount=0;
				try{
					expirationCount=	DashboardUtil.getExpirationDocCount(applications.getNcbjApplicationId(),themeDisplay,"NCBJ Supported Documents");
				}catch(Exception e){}
				
				String checkDate="";
				String notification="hide";
				try{
					checkDate=DashboardUtil.showNcbjExpiredLiceseNotification(applications.getCaseId());
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
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getNcbjSingleApplicationOverview('<%=ncbjRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg width="32" height="36" viewBox="0 0 220 180" fill="none" xmlns="http://www.w3.org/2000/svg">
<g clip-path="url(#clip0_9961_318326)">
<path d="M216.649 70.7992C214.555 65.2768 210.255 60.3465 205.021 56.7915C189.911 47.1535 166.884 46.4672 151.316 55.1804C142.824 59.5291 137.244 68.1349 135.507 76.9974C132.357 91.5579 133.17 108.882 144.337 119.796C157.358 131.262 176.309 133.796 193.16 129.085C193.961 128.931 196.498 128.289 198.248 127.356L198.741 127.144C203.975 124.959 208.966 121.402 212.693 116.584C221.293 103.952 221.883 85.0243 216.649 70.7992ZM189.212 103.496C188.618 106.257 186.769 109.118 183.853 110.155C179.211 112.207 172.932 111.638 168.631 109.238C165.025 106.705 164.561 102.464 164.096 98.4504C163.744 90.5388 163.176 82.1609 165.382 74.9279C167.111 70.4481 171.881 69.2955 176.194 68.9575C180.724 68.9575 185.134 69.6517 187.932 73.322C189.674 75.9548 189.567 79.3997 189.911 82.5015C189.789 89.0377 190.373 96.834 189.212 103.496ZM51.4495 110.622C47.6108 110.386 43.3105 110.724 39.5944 110.265L39.7091 69.9792L39.9438 69.6439L51.4495 69.5312C51.5694 62.9924 51.6842 55.9794 51.3295 50.0195L7.51049 49.8964L0.294685 50.0221C0.179941 56.0999 0.179941 63.2072 0.294685 69.4107C4.25073 69.5338 7.96425 69.4107 11.8029 69.7696V108.785L11.6908 110.388L0.179941 110.624C-0.0599805 116.934 -0.0599805 123.25 0.179941 129.56H51.4469L51.4495 110.622ZM180.484 138.158C175.607 145.165 169.445 151.935 162.717 157.2C162.472 157.559 161.775 157.423 161.554 157.093C158.638 155.262 155.501 153.763 152.705 151.935C156.429 147.463 160.036 142.988 162.826 138.034H159.209C156.32 142.297 153.29 146.769 149.456 150.544C144.337 148.482 139.69 146.648 134.459 145.26L133.877 144.822C134.691 142.504 136.198 140.327 136.66 138.029H133.522L130.385 144.23C123.535 142.739 115.974 141.927 108.999 141.474C108.647 140.445 109.108 138.951 108.647 138.029H105.624C105.384 139.41 105.974 140.45 105.275 141.595C98.0667 141.927 91.0934 142.739 84.3574 144.131L81.2072 138.029C80.0571 138.029 78.7637 137.809 77.9605 138.152L80.8603 144.924L80.5135 145.26C75.3033 146.774 70.1806 148.577 65.1692 150.661L64.7076 150.426C61.4452 146.868 58.3054 142.983 55.7445 139.08C55.1682 137.118 52.842 138.265 51.5616 138.034C54.3415 143.09 58.0733 147.56 61.7868 152.157C58.6496 153.999 55.5229 156.053 52.2527 157.559C45.1417 152.119 38.9428 145.571 33.8911 138.163C32.4933 137.937 31.5728 138.04 30.1671 138.163C38.5382 151.246 51.5616 162.717 65.1639 169.489C65.1639 169.489 65.1639 169.387 65.2891 169.387C65.3882 169.387 65.6203 169.599 65.3882 169.72C74.5781 174.197 84.3496 177.409 94.6869 178.792C130.38 183.492 164.446 168.237 184.197 138.163C182.963 138.035 181.719 138.033 180.484 138.158ZM132.018 148.484L132.359 148.254C137.372 149.401 142.128 151.01 146.548 153.184C142.824 157.42 138.057 161.101 133.645 164.198C130.975 165.798 128.291 167.538 125.498 168.905L120.509 166.726L120.851 165.932C125.044 160.313 128.766 154.567 132.018 148.484ZM109.108 145.04C115.74 145.165 122.369 145.852 128.521 147.337L128.643 147.685C125.394 153.876 121.315 159.857 116.905 165.468C114.918 165.704 113.067 164.91 111.093 164.787L109.106 164.551C108.879 157.779 108.756 151.812 109.108 145.04ZM86.681 147.104C92.7259 145.956 99.0003 145.04 105.507 145.04L105.627 164.454C103.181 165.01 100.508 165.01 98.1814 165.599C93.4143 159.962 89.4661 153.876 86.0994 147.56L86.681 147.104ZM67.9543 153.307C72.4997 151.12 77.259 149.504 82.1356 148.251L82.6076 148.372C85.969 154.685 90.1598 160.648 94.3427 166.616C92.7285 167.54 90.7413 168.093 89.1193 169.026C81.2576 165.124 74.104 159.924 67.9569 153.643V153.307H67.9543ZM82.957 172.929C73.1908 170.396 64.1156 166.037 55.7471 160.079V159.723C58.5375 158.018 61.3383 156.176 64.3503 154.9C70.982 161.46 77.8353 166.396 85.2754 171.09C84.6964 171.779 83.7681 172.471 82.957 172.929ZM126.082 174.412C113.763 177.068 100.038 177.17 87.7215 174.192C87.4868 173.621 88.303 173.498 88.6499 173.162C99.4618 166.155 116.311 166.155 126.901 173.72C127.245 174.412 126.317 174.192 126.082 174.412ZM137.246 171.211L131.783 172.927C130.849 172.468 130.041 171.779 129.22 171.087L129.454 170.736C136.897 166.393 143.636 161.098 150.032 154.788C153.172 156.048 156.197 157.779 158.996 159.72C152.479 164.91 144.919 168.337 137.246 171.211ZM33.6642 41.178C36.5397 37.1804 39.6852 33.3859 43.0784 29.8214C46.0904 26.9528 48.8912 24.1995 52.151 22.1247C55.176 24.0738 58.5427 25.698 61.4478 27.5266C57.8464 31.9801 54.1251 36.4755 51.4521 41.2827C52.2605 41.6416 53.7782 41.529 54.9439 41.2827C57.8464 37.044 60.9758 32.8001 64.7102 29.0093C69.6963 30.851 74.586 32.7948 79.7077 34.178L80.1588 34.6339L77.2642 41.2827C78.5472 41.529 79.3609 41.4085 80.6309 41.2827C81.674 39.3441 82.4824 37.1698 83.6455 35.2076C90.3971 36.7061 97.4903 37.5051 104.698 37.7278C105.621 38.5425 104.928 40.2558 105.277 41.2827H108.414C108.756 40.1563 108.297 38.8778 108.756 37.8561C115.505 37.4999 122.593 36.8109 129.126 35.2024L129.692 35.3229L132.831 41.2775C133.88 41.2775 135.272 41.5238 136.086 41.0417L133.173 34.4033L133.416 34.1728C138.754 32.7948 143.761 30.7305 148.875 28.6688C152.489 32.4543 155.851 36.9288 158.883 41.2749C160.156 41.2749 161.436 41.4006 162.367 41.0391C160.932 38.477 159.257 36.0578 157.366 33.8139C155.83 31.6161 154.117 29.5492 152.244 27.634V27.0393L160.383 22.3421L161.556 21.8837C168.634 27.2656 174.828 33.7293 179.913 41.0391C181.308 41.0391 182.474 41.5211 183.639 40.9422C168.045 17.5507 142.358 2.50034 114.587 0.333828L114.465 0.556504L114.227 0.333828C111.093 -0.00411693 107.241 -0.137723 103.874 0.200222C102.599 0.100672 101.092 0.200222 99.5766 0.333828C71.6809 2.50034 45.9913 16.8538 29.9403 41.288C31.1033 41.178 32.4985 41.6443 33.6642 41.178ZM81.9165 31.0946L81.4523 31.1942C76.68 29.9446 72.0251 28.4382 67.6075 26.4944L67.8317 25.8054C74.2261 19.725 80.9673 14.6716 88.4073 10.7787C90.1598 11.4677 91.9018 12.0361 93.6438 12.8509L93.3022 13.7468C88.8767 19.2692 85.3979 25.2238 81.9165 31.0946ZM105.043 34.1833C101.796 34.6417 98.8881 34.0811 95.6205 33.827C92.4964 33.3659 88.5351 33.0332 85.3979 31.9853C88.7698 25.7032 92.7285 19.6098 97.4903 14.0009L104.933 15.02C105.277 20.9773 105.043 27.8671 105.043 34.1833ZM108.644 34.3064C108.414 28.2051 108.534 21.4436 108.644 15.13C110.978 14.7947 113.523 14.4384 115.855 14.1005C120.387 19.8298 124.815 25.7032 127.84 31.9853C121.554 33.5131 115.111 34.2922 108.644 34.3064ZM145.74 26.2612C141.197 28.2025 136.542 30.0415 131.551 31.0946C127.95 25.0116 123.999 18.9313 119.568 13.0552C121.198 12.1566 123.185 11.4677 124.924 10.5534C132.495 14.3363 139.81 19.725 145.964 25.9023L145.74 26.2612ZM130.849 6.6395C140.616 9.17016 149.8 13.5241 158.171 19.4919L157.939 19.9503L149.926 24.4196H149.334C143.182 18.2449 135.976 12.8509 128.643 8.59382C128.875 7.78956 130.044 7.2106 130.849 6.6395ZM126.205 5.48683V5.73046C116.084 13.0552 99.6966 13.7468 89.0071 6.97483C88.4073 6.51638 87.2599 6.2937 87.1347 5.48945C99.4645 2.63395 113.987 2.40341 126.205 5.48683ZM55.2856 19.725C62.6161 14.3363 70.7499 10.3202 79.3556 7.56427C79.7077 7.20537 79.932 6.86742 80.3909 6.86742V7.1032C81.3193 7.32849 82.0208 6.28846 82.8318 6.96959C83.5333 7.56427 84.3548 8.01748 84.9285 8.58858C77.7258 13.0552 70.6299 18.3444 64.1182 24.7575C60.9784 23.631 58.0837 21.8994 55.283 19.9503L55.2856 19.725ZM105.163 111.518C94.2358 114.507 82.3703 112.228 74.4686 103.952C73.5428 102.804 72.9561 101.437 72.0225 100.295L56.3339 100.405C56.0862 109.697 55.9766 120.372 56.3339 129.557L73.7645 129.444L73.9966 123.932C75.9811 124.849 77.9605 125.994 79.932 127.024C92.0218 132.08 107.585 133.227 119.563 127.024C128.289 122.217 132.941 112.924 131.658 102.92C130.385 93.1769 121.081 84.3353 111.672 81.933L83.5307 73.7778L81.4497 72.7404C80.5187 71.944 79.9346 70.9171 80.1615 69.6439C82.3703 65.8662 87.492 67.0137 91.3281 67.1158C99.4645 68.2659 107.833 71.0192 112.603 78.4828C117.711 78.4828 123.639 78.5824 129.214 78.3623C129.452 68.9549 129.123 60.6975 128.985 51.1696C123.754 51.0491 117.357 51.0491 112.133 51.2901C111.898 52.655 112.357 54.5988 111.776 55.982L106.433 53.1108C93.6386 47.7194 75.7334 47.1562 64.113 55.534C56.553 61.0328 54.2346 70.9118 56.2113 79.6303C57.716 87.8798 65.6203 93.968 73.1804 96.8288C83.5255 100.496 94.3323 103.153 104.813 106.705C105.851 107.171 107.244 108.211 107.019 109.472C107.024 110.491 105.971 111.08 105.163 111.518Z" fill="#047247"/>
</g>
<defs>
<clipPath id="clip0_9961_318326">
<rect width="220" height="179.633" fill="white"/>
</clipPath>
</defs>
      </svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">NCBJ Application<br/> Transaction Number</p>
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
							<p class="lower-title"><span class="one"> <%=applications.getTypeOfCertification() %></span> </p>
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
							<a href="<%=Validator.isNotNull(pdfNcbjFileUrl)?pdfNcbjFileUrl:"javascript:void(0);"%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
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
								<li class="start-active <%=ncbjDefaultActive%> manufacturing-process">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=ncbjStageStatus %></div>
									</div>
								</li>
							<%try{
									String stageJson = NcbjApplicationStagesLocalServiceUtil.getNcbjApplicaitonCurrentStages(applications.getCaseId());
									if(Validator.isNotNull(stageJson)){
										JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
										for(int i=0 ;i<stagesArray.length();++i){
											JSONObject currentStage = stagesArray.getJSONObject(i);
											%>
											<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> manufacturing-process'>
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
							</ul>							</div>
						</form>
					</div>
				</div>
			</div>
		<div class="row p-3">
				<div class="col-md-12">
					<div class="lower  dash-lower-multiple-links-box">
						<a class="dash-yellow-repeated-link" onclick="getNcbjSingleApplicationOverview('<%=ncbjRenderURL%>')"> Overview </a> 
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
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleNcbjApplicationSpecificStage('<%=ncbjRenderURL%>', 'ncbj-document', 'ncbj-document-tab')">Update document
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
<script>
function getNcbjSingleApplicationOverview(ncbjRenderURL) {
	window.location.href = ncbjRenderURL;
}
</script>