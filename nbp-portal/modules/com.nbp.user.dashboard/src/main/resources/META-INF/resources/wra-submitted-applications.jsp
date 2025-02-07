<%@page import="java.util.Date"%>
<%@page import="com.nbp.wra.stage.service.service.WraCertificateIssuanceLocalServiceUtil"%>
<%@page import="com.nbp.wra.stage.service.model.WraCertificateIssuance"%>
<%@page import="com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil"%>
<%@page import="com.nbp.wra.stage.service.service.WraApplicationStageLocalServiceUtil"%>
<%@page import="com.nbp.wra.stage.service.model.WraApplicationStage"%>
<%@page import="com.nbp.wra.application.form.service.model.WRAApplication"%>
<%@page import="com.nbp.jadsc.application.form.service.model.JADSCApplication"%>
<%@page import="com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration"%>
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
<%String checkDateInOsiFc="";
List<WraApplicationStage> wraCurrentInProgressStages = null;

List<WRAApplication> WRAASubmitApp = new ArrayList<WRAApplication>();

if(superAdmin){
	WRAAApplicationData = WRAApplicationLocalServiceUtil.getWraApplicationBy_Status(UserDashboardPortletKeys.SUBMITTED); 
}else{
	try{
		WRAAApplicationData = WRAApplicationLocalServiceUtil.getWraApplicationBy_S_UI(UserDashboardPortletKeys.SUBMITTED, themeDisplay.getUserId()); 
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	WraCertificateIssuance fullRegis=null;
	boolean expiredflag=false;
	for(WRAApplication appData:WRAAApplicationData){
		try{
		fullRegis=	WraCertificateIssuanceLocalServiceUtil.getCertificateIssuance(appData.getCaseId());
		
		if (fullRegis != null && fullRegis.getDateOfLicenseExpiration() != null) {
            if (fullRegis.getDateOfLicenseExpiration().compareTo(new Date()) <= 0) {
			expiredflag=true;
	}}}catch(Exception e){
	}
		if(!expiredflag){
			WRAASubmitApp.add(appData);
		}
		expiredflag=false;
	}
	for(WRAApplication applications : WRAASubmitApp){ 
		 String wraRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/wra-dashboard?wraApplicationId=";
			if(Validator.isNotNull(selectedApplication)){
				wraRenderURL = wraRenderURL+String.valueOf(applications.getWraApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				wraRenderURL = wraRenderURL+String.valueOf(applications.getWraApplicationId());
			}
		String wraDefaultActive = "current-active";
			String wraStageStatus = "Submitted";
			 try{
				 wraCurrentInProgressStages = WraApplicationStageLocalServiceUtil.getWraByCI(applications.getCaseId());
					 }catch(Exception e){
						}
			 if (Validator.isNotNull(wraCurrentInProgressStages)) {
				 wraDefaultActive = "unvisited";
				}
			 String pdfWraFileUrl ="";
				FileEntry pdfWraFileEntry = null;
				try{
					  pdfWraFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
				pdfWraFileUrl = DLURLHelperUtil.getDownloadURL(pdfWraFileEntry, pdfWraFileEntry.getFileVersion(), themeDisplay,
							StringPool.BLANK, false, true);
				}catch(Exception e){}
				int expirationCount=0;
				try{
					expirationCount=	DashboardUtil.getExpirationDocCount(applications.getWraApplicationId(),themeDisplay,"WRA Supported Documents");
				}catch(Exception e){}
				String checkDate="";
				String notification="hide";
				try{
					checkDate=DashboardUtil.showMiicExpiredLiceseNotification(applications.getCaseId());
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
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getWRASingleApplicationOverview('<%=wraRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								 <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 220 220" fill="none">
									<path d="M18.3312 63.6101C18.9969 63.6095 18.9969 63.6095 19.676 63.609C21.1283 63.6107 22.5799 63.6295 24.0321 63.6486C25.0447 63.6531 26.0573 63.6566 27.0699 63.659C29.7241 63.6682 32.378 63.692 35.0321 63.7189C37.7448 63.7438 40.4576 63.7548 43.1704 63.767C48.4851 63.793 53.7995 63.8343 59.114 63.8855C59.4628 64.7468 59.4628 64.7468 59.8186 65.6256C60.1357 66.3913 60.453 67.157 60.7705 67.9225C60.9982 68.488 60.9982 68.488 61.2305 69.065C63.7782 75.1577 68.3498 79.3227 74.259 82.0804C80.7689 84.522 87.6033 84.1654 94.4397 84.1416C95.6886 84.1428 96.9376 84.1446 98.1865 84.1468C100.793 84.1495 103.4 84.1457 106.007 84.1371C109.331 84.1268 112.655 84.1327 115.979 84.1436C118.555 84.1502 121.131 84.1481 123.707 84.1434C124.932 84.1422 126.156 84.1436 127.381 84.1479C137.496 84.1754 146.183 83.6331 154.073 76.5461C157.393 73.0262 159.129 68.3244 160.888 63.8855C166.739 63.8292 172.59 63.7861 178.441 63.7598C181.158 63.7472 183.875 63.73 186.592 63.7025C189.215 63.676 191.839 63.6616 194.463 63.6553C195.462 63.6508 196.462 63.6421 197.461 63.629C198.864 63.6113 200.267 63.609 201.671 63.6101C202.469 63.6047 203.267 63.5993 204.089 63.5938C207.192 63.9988 209.424 64.9278 211.41 67.3393C213.42 70.395 214.031 72.6521 213.969 76.2814C213.973 76.7734 213.977 77.2653 213.981 77.7722C213.99 79.4085 213.978 81.0439 213.966 82.6801C213.968 83.858 213.971 85.0359 213.976 86.2139C213.984 89.4042 213.974 92.5942 213.96 95.7846C213.948 99.1258 213.951 102.467 213.953 105.808C213.953 111.418 213.941 117.027 213.921 122.636C213.899 129.12 213.894 135.604 213.898 142.087C213.902 148.328 213.895 154.569 213.883 160.81C213.878 163.465 213.877 166.119 213.878 168.774C213.878 171.899 213.87 175.025 213.854 178.15C213.85 179.296 213.848 180.443 213.85 181.59C213.853 183.155 213.844 184.721 213.832 186.286C213.835 186.739 213.838 187.193 213.842 187.66C213.792 191.493 212.804 193.859 210.11 196.557C205.776 199.56 201.402 199.309 196.297 199.293C195.531 199.295 194.764 199.297 193.974 199.3C191.853 199.306 189.732 199.305 187.611 199.302C185.321 199.3 183.03 199.306 180.74 199.31C176.256 199.318 171.772 199.319 167.287 199.318C163.642 199.317 159.996 199.318 156.351 199.32C155.572 199.321 155.572 199.321 154.778 199.322C153.723 199.322 152.669 199.323 151.614 199.324C141.727 199.33 131.841 199.329 121.954 199.325C112.912 199.322 103.871 199.329 94.8294 199.341C85.5418 199.352 76.2542 199.357 66.9666 199.355C61.7539 199.354 56.5412 199.355 51.3285 199.364C46.8908 199.371 42.4531 199.372 38.0154 199.365C35.7522 199.361 33.4892 199.36 31.226 199.368C28.7702 199.376 26.3147 199.369 23.8589 199.361C23.1469 199.366 22.435 199.37 21.7015 199.375C17.298 199.346 12.9121 199.12 9.34378 196.273C9.07514 195.916 8.80651 195.56 8.52974 195.192C8.24861 194.836 7.96748 194.479 7.67783 194.112C6.14502 191.7 6.31801 189.253 6.3162 186.505C6.31355 186.016 6.31089 185.528 6.30816 185.025C6.30005 183.382 6.2963 181.739 6.29259 180.097C6.28781 178.921 6.2828 177.746 6.27758 176.57C6.2617 172.705 6.25243 168.839 6.24379 164.974C6.24054 163.644 6.23728 162.313 6.23401 160.983C6.22091 155.448 6.20956 149.914 6.20274 144.38C6.1929 136.448 6.17281 128.516 6.13828 120.583C6.11484 115.007 6.10301 109.43 6.0998 103.853C6.09759 100.522 6.09031 97.1914 6.07066 93.8604C6.05244 90.7256 6.04862 87.5912 6.05575 84.4564C6.05588 83.3073 6.05085 82.1581 6.04021 81.0091C6.02644 79.4369 6.0315 77.8658 6.04111 76.2936C6.0327 75.8418 6.02429 75.3899 6.01562 74.9243C6.06785 71.4435 7.22813 68.9932 9.43844 66.3115C12.1435 64.0035 14.8393 63.5865 18.3312 63.6101ZM28.2182 108.16C27.6637 110.063 27.4478 111.26 28.0289 113.163C29.026 114.494 29.6907 114.837 31.2472 115.438C33.259 115.634 33.259 115.634 35.5338 115.624C36.1741 115.631 36.1741 115.631 36.8272 115.639C38.2353 115.654 39.6431 115.659 41.0513 115.663C42.032 115.668 43.0128 115.674 43.9936 115.679C46.0484 115.689 48.1031 115.694 50.1579 115.696C52.7886 115.699 55.4188 115.722 58.0494 115.75C60.0747 115.768 62.0999 115.772 64.1252 115.773C65.095 115.775 66.0648 115.783 67.0344 115.795C68.3919 115.812 69.7481 115.809 71.1056 115.801C72.263 115.806 72.263 115.806 73.4438 115.811C76.0109 115.338 76.904 114.432 78.4996 112.405C79.0045 110.586 79.0045 110.586 78.4996 108.766C76.8972 106.727 76.0004 105.832 73.4208 105.353C72.6384 105.352 71.8561 105.352 71.05 105.351C70.3993 105.345 70.3993 105.345 69.7355 105.338C68.3078 105.328 66.8813 105.339 65.4536 105.352C64.4587 105.352 63.4637 105.35 62.4688 105.348C60.3864 105.346 58.3044 105.355 56.2221 105.372C53.554 105.392 50.8866 105.389 48.2185 105.377C46.1651 105.371 44.1119 105.376 42.0585 105.386C41.0748 105.389 40.091 105.388 39.1072 105.385C37.7323 105.381 36.3584 105.394 34.9836 105.41C33.8108 105.416 33.8108 105.416 32.6143 105.422C30.3077 105.787 29.5979 106.308 28.2182 108.16ZM172.701 125.386C172.043 126.046 171.384 126.706 170.726 127.366C169.007 129.089 167.291 130.813 165.575 132.538C163.817 134.304 162.058 136.068 160.299 137.832C156.859 141.283 153.421 144.735 149.984 148.189C148.259 147.407 147.041 146.597 145.731 145.233C145.391 144.883 145.051 144.533 144.701 144.172C144.341 143.796 143.98 143.419 143.609 143.031C142.833 142.236 142.057 141.441 141.28 140.647C140.064 139.394 138.849 138.14 137.64 136.881C136.468 135.664 135.288 134.457 134.105 133.251C133.747 132.874 133.39 132.496 133.021 132.106C131.356 130.419 130.328 129.49 128.025 128.786C126.281 128.649 126.281 128.649 124.654 129.69C122.868 131.734 122.542 132.731 122.723 135.452C123.499 136.618 123.499 136.618 124.565 137.727C124.952 138.151 125.34 138.575 125.739 139.012C127.658 141.037 129.602 143.032 131.576 145.002C131.997 145.425 132.419 145.847 132.853 146.282C133.734 147.165 134.616 148.047 135.499 148.929C136.855 150.283 138.207 151.64 139.559 152.997C140.419 153.857 141.279 154.718 142.139 155.578C142.544 155.984 142.948 156.39 143.365 156.809C143.739 157.182 144.114 157.555 144.499 157.939C144.828 158.267 145.157 158.596 145.496 158.935C146.851 160.169 147.649 160.33 149.505 160.576C152.602 160.229 153.723 158.989 155.832 156.813C156.21 156.44 156.588 156.068 156.977 155.684C158.221 154.451 159.448 153.204 160.675 151.956C161.536 151.093 162.398 150.232 163.261 149.371C165.065 147.565 166.861 145.753 168.653 143.935C170.949 141.605 173.26 139.292 175.577 136.985C177.358 135.208 179.132 133.423 180.903 131.637C181.752 130.781 182.604 129.927 183.458 129.076C184.65 127.884 185.832 126.683 187.012 125.479C187.366 125.129 187.719 124.779 188.084 124.419C190.095 122.341 191.136 120.893 191.178 117.864C189.998 115.648 189.128 114.975 186.786 114.073C181.256 114.442 176.489 121.574 172.701 125.386ZM27.6124 134.846C27.6124 137.046 27.7385 138.436 29.0512 140.228C31.4616 141.899 34.1137 141.607 36.9146 141.605C37.6891 141.608 37.6891 141.608 38.4793 141.611C40.1885 141.617 41.8977 141.618 43.607 141.619C44.7938 141.621 45.9806 141.623 47.1675 141.625C49.6562 141.629 52.1449 141.63 54.6337 141.63C57.8245 141.63 61.0153 141.638 64.2061 141.648C66.6575 141.655 69.1089 141.656 71.5604 141.656C72.7369 141.657 73.9134 141.659 75.0899 141.664C76.7345 141.67 78.3789 141.668 80.0234 141.665C80.7538 141.67 80.7538 141.67 81.499 141.675C84.7437 141.681 84.7437 141.681 87.5866 140.304C89.0892 138.048 89.0789 136.909 88.7982 134.239C87.9477 132.806 87.9477 132.806 86.375 131.813C84.5215 131.571 82.8855 131.475 81.0318 131.49C80.4927 131.484 79.9536 131.479 79.3982 131.474C77.6163 131.46 75.8351 131.464 74.0531 131.47C72.8143 131.467 71.5755 131.463 70.3366 131.458C67.7399 131.452 65.1434 131.455 62.5466 131.464C59.2192 131.474 55.8923 131.46 52.5649 131.438C50.0064 131.425 47.448 131.426 44.8895 131.431C43.6627 131.432 42.436 131.427 41.2093 131.418C39.4934 131.408 37.7788 131.417 36.063 131.43C35.3033 131.42 35.3033 131.42 34.5283 131.409C31.2328 131.463 29.6452 132.028 27.6124 134.846ZM28.824 159.106C27.4033 160.855 27.4033 160.855 27.6882 163.048C28.0152 165.158 28.0152 165.158 29.2891 166.198C30.82 167.095 31.6637 167.22 33.4234 167.225C34.2565 167.234 34.2565 167.234 35.1065 167.243C36.0139 167.239 36.0139 167.239 36.9396 167.235C37.9004 167.241 37.9004 167.241 38.8806 167.248C40.9996 167.259 43.1184 167.257 45.2374 167.253C46.7086 167.256 48.1798 167.259 49.651 167.263C52.7351 167.268 55.819 167.267 58.9031 167.261C62.8594 167.254 66.8153 167.266 70.7716 167.284C73.8097 167.295 76.8478 167.295 79.8859 167.291C81.3448 167.291 82.8037 167.295 84.2626 167.302C86.3004 167.311 88.3376 167.305 90.3754 167.294C90.9804 167.3 91.5853 167.306 92.2086 167.312C95.4384 167.309 95.4384 167.309 98.2599 165.891C99.497 163.93 99.4204 162.586 99.0968 160.319C97.9657 158.884 97.0852 158.099 95.462 157.286C94.6169 157.227 93.769 157.204 92.9219 157.201C92.3894 157.198 91.8568 157.194 91.3082 157.19C90.4297 157.189 90.4297 157.189 89.5334 157.188C88.9177 157.185 88.302 157.182 87.6676 157.179C85.6236 157.17 83.5797 157.166 81.5357 157.163C80.1186 157.159 78.7014 157.156 77.2843 157.152C74.3096 157.146 71.335 157.143 68.3603 157.14C64.5467 157.137 60.7333 157.123 56.9198 157.105C53.9913 157.094 51.0628 157.091 48.1343 157.09C46.7283 157.088 45.3223 157.083 43.9164 157.075C41.9497 157.065 39.9834 157.066 38.0168 157.07C37.4348 157.064 36.8528 157.059 36.2532 157.053C33.2952 157.072 31.1924 157.121 28.824 159.106Z" fill="#047247"></path>
									<path d="M122.338 20.9627C127.147 24.881 130.424 29.3678 131.147 35.6284C131.197 36.4122 131.247 37.196 131.299 38.0036C132.05 38.0285 132.802 38.0534 133.577 38.079C139.425 38.7557 144.262 41.733 147.931 46.2248C149.968 49.1834 151.591 52.5 151.954 56.1001C152.011 56.6506 152.011 56.6506 152.07 57.2123C152.394 62.9497 150.725 68.3353 146.942 72.6885C142.661 76.9878 138.212 79.7259 131.972 79.8024C131.524 79.8019 131.076 79.8013 130.615 79.8008C130.133 79.8048 129.651 79.8089 129.155 79.8131C127.57 79.8245 125.985 79.8269 124.4 79.8282C123.291 79.8321 122.182 79.8361 121.072 79.8403C118.748 79.8476 116.424 79.8498 114.1 79.8491C111.137 79.849 108.174 79.8654 105.211 79.8862C102.92 79.8997 100.628 79.9021 98.3362 79.9014C97.2447 79.9028 96.1531 79.9081 95.0616 79.9175C86.4666 79.9845 80.0776 79.3497 73.6429 73.1221C69.8055 69.0843 68.1085 64.3218 67.8906 58.7769C68.1632 52.45 70.9379 46.9248 75.5983 42.6408C79.6284 39.4747 83.7071 38.323 88.7735 38.0036C88.8189 37.551 88.8643 37.0985 88.9111 36.6322C89.7958 29.7939 92.4103 25.2999 97.7412 20.8873C104.738 15.8434 115.341 16.0418 122.338 20.9627ZM102.29 31.7452C100.553 34.0076 99.8295 36.3786 99.7085 39.21C100.221 42.7452 102.001 44.7859 104.739 46.9741C107.131 48.534 109.704 48.5398 112.466 48.2583C115.469 47.2058 117.501 45.5269 119.149 42.8293C120.38 40.1954 120.558 38.0188 119.794 35.2137C118.684 32.3572 116.867 30.5846 114.289 28.9553C109.508 27.3732 105.889 28.3341 102.29 31.7452Z" fill="#047247"></path>
								</svg>
							 </span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">WRA<br/> Transaction Number</p>
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
							<p class="lower-title"><span class="one"> <%=applications.getTypeOfApplication() %></span> </p>
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
							<a href="<%=Validator.isNotNull(pdfWraFileUrl)?pdfWraFileUrl:"javascript:void(0);"%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
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
								<li class="start-active <%=wraDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=wraStageStatus %></div>
									</div>
								</li>
							<%try{
									String stageJson = WraApplicationStageLocalServiceUtil.getWraApplicationCurrentStages(applications.getCaseId());
									if(Validator.isNotNull(stageJson)){
										JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
										for(int i=0 ;i<stagesArray.length();++i){
											JSONObject currentStage = stagesArray.getJSONObject(i);
											%>
											<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> farm-progress'>
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
							</ul>
								</div>
						</form>
					</div>
				</div>
			</div>
		<div class="row p-3">
				<div class="col-md-12">
					<div class="lower  dash-lower-multiple-links-box">
						<a class="dash-yellow-repeated-link" onclick="getWRASingleApplicationOverview('<%=wraRenderURL%>')"> Overview </a> 
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
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleWraApplicationSpecificStage('<%=wraRenderURL%>', 'osi-document', 'osi-document-tab')">Update document
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