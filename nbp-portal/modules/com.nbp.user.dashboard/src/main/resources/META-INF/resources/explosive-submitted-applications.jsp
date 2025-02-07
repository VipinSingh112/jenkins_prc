<%@page import="com.nbp.explosives.competency.stages.service.service.ExplosiveApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages"%>
<%@page import="com.nbp.explosives.competency.application.form.service.service.ExplosivesCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication"%>
<%@page import="com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage"%>
<%@page import="com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil"%>
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
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@ include file="/init.jsp" %>
<%
String checkDateInExp="";
List<ExplosiveApplicationStages> expCurrentInProgressStages = null;
	boolean expiredflag=false;
	/* 	for(ExplosivesApplication appData:explosiveSubmittedApplicationsList){
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
	} */
	for(ExplosivesApplication applications : explosiveSubmittedApplicationsList){ 
		 String expRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/explosives-competency-certification-dashboard?explosivesApplicationId=";
			if(Validator.isNotNull(selectedApplication)){
				expRenderURL = expRenderURL+String.valueOf(applications.getExplosivesApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				expRenderURL = expRenderURL+String.valueOf(applications.getExplosivesApplicationId());
			}
		String expDefaultActive = "current-active";
			String wraStageStatus = "Submitted";
			 try{
				  expCurrentInProgressStages = ExplosiveApplicationStagesLocalServiceUtil.getEXP_CaseId(applications.getCaseId()); 
					 }catch(Exception e){
						}
			 if (Validator.isNotNull(expCurrentInProgressStages)) {
				 expDefaultActive = "unvisited";
				}
			 String pdfExpFileUrl ="";
			 String notification ="hide";
				FileEntry expWraFileEntry = null;
				try{
					expWraFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
					pdfExpFileUrl = DLURLHelperUtil.getDownloadURL(expWraFileEntry, expWraFileEntry.getFileVersion(), themeDisplay,
							StringPool.BLANK, false, true);
				}catch(Exception e){}
				int expirationCount=0;
						try{
							expirationCount=	DashboardUtil.getExpirationDocCount(applications.getExplosivesApplicationId(),themeDisplay,"Explosive Supported Documents");
						}catch(Exception e){}
						 try{
							 checkDateInExp=DashboardUtil.showExplosiveExpiredLiceseNotification(applications.getCaseId());
						  if(Validator.isNotNull(checkDateInExp)){
							  notification="show";  
						  }
					  }catch(Exception e){
						  } 
	
		
%>
	<section class="wizard-section dashboard-progress">
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getExplosiveSingleApplicationOverview('<%=expRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
						<svg width="32" height="36" viewBox="0 0 512 430" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					                           <g clip-path="url(#clip0_16_3244)"> 
					                            <path d="M364.87 24.9501C370.34 27.7915 375.217 31.6505 379.24 36.3201C382.914 40.6866 386.062 45.4693 388.62 50.5701C391.58 56.2401 393.92 62.8101 396.42 69.8701C399.57 78.7601 403.03 88.4901 407.98 96.9901C412.09 104.04 421.05 109.66 430.46 115.57C441.47 122.48 453.02 129.74 460.65 140.68H493.24C495.702 140.683 498.14 141.172 500.413 142.117C502.687 143.062 504.752 144.446 506.49 146.19L506.84 146.57C510.146 150.04 511.993 154.647 512 159.44V269.74C511.984 274.712 510.003 279.475 506.489 282.992C502.974 286.508 498.212 288.492 493.24 288.51H451.1C451.34 300.62 450.18 310.88 447.44 319.7C442.91 334.22 434.31 344.61 420.97 352.53C411.38 358.21 400.67 360.21 391.22 361.96C384.32 363.24 378.21 364.38 375.3 366.55C367.61 372.26 363.36 379.36 359 386.66C353.05 396.63 346.88 406.93 332.54 416.28C323.995 422.031 314.36 425.968 304.233 427.848C294.106 429.728 283.7 429.511 273.66 427.21C264.33 425.2 257.24 420.4 250.5 415.84C245.05 412.15 239.88 408.64 234.81 408C224.12 406.65 212.54 408.42 201.65 410.09C189.54 411.94 178.19 413.68 167.88 411.34C164.156 410.503 160.499 409.39 156.94 408.01C150 405.25 143.502 401.49 137.65 396.85C134.678 394.46 131.887 391.852 129.3 389.05C122.12 381.29 117.94 370.57 113.48 359.14C109.5 348.91 105.26 338.04 98.71 329.42C95.65 325.39 90.02 322.65 84.09 319.77C76.8 316.23 69.12 312.5 62.67 305.38C58.0189 300.288 54.0429 294.618 50.84 288.51H18.76C13.7885 288.492 9.02596 286.508 5.51146 282.992C1.99697 279.475 0.0157416 274.712 0 269.74L0 159.44C0.0138722 154.469 1.99482 149.705 5.51 146.19C9.02518 142.675 13.7888 140.694 18.76 140.68H53.69V140.46C53.87 124.94 58.57 112.3 68.87 101.14C78.63 90.5601 93.4 81.5401 114.23 72.7401C125.43 68.0101 133.18 63.1301 139.11 57.9701C144.499 53.1297 149.196 47.571 153.07 41.4501L153.76 40.4301C161.95 28.1101 170.33 15.5501 191.38 5.25013C215.63 -6.59987 235.61 3.96013 254.14 13.7601C263.98 18.9701 273.34 23.9201 281.49 23.9601C291.29 24.0001 301.46 22.1201 310.76 20.4001C318.17 19.0301 325.08 17.7501 331.37 17.4901C337.056 17.1604 342.762 17.496 348.37 18.4901C354.22 19.6103 359.814 21.8003 364.87 24.9501ZM441.57 140.68C435.99 135.66 429.37 131.5 422.96 127.47C412.05 120.62 401.66 114.1 395.8 104.05C390.18 94.4201 386.5 84.0401 383.13 74.5501C380.77 67.8801 378.56 61.6701 376.16 57.0701C374.096 52.9431 371.559 49.0704 368.6 45.5301C365.733 42.2107 362.257 39.4713 358.36 37.4601L357.84 37.1301C354.144 34.777 350.034 33.148 345.73 32.3301C341.173 31.5351 336.538 31.2733 331.92 31.5501C326.64 31.7701 320.2 32.9601 313.29 34.2401C303.41 36.0601 292.59 38.0601 281.43 38.0201C269.78 37.9701 258.95 32.2401 247.57 26.2201C232.07 18.0201 215.35 9.18013 197.55 17.8801C179.96 26.4801 172.65 37.4501 165.49 48.2001L164.76 49.2801C160.17 56.1601 155.33 62.5401 148.37 68.6101C141.46 74.6301 132.5 80.2801 119.69 85.7001C100.76 93.6901 87.56 101.64 79.23 110.68C71.44 119.12 67.89 128.75 67.75 140.62V140.68H148.46C161.377 121.75 179.063 106.565 199.73 96.6601C201.411 95.8565 203.343 95.7538 205.101 96.3745C206.858 96.9953 208.296 98.2887 209.1 99.9701C209.904 101.652 210.006 103.583 209.386 105.341C208.765 107.098 207.471 108.537 205.79 109.34C190.381 116.726 176.797 127.428 166.01 140.68H345.96L345.85 140.54C332.981 124.879 316.261 112.835 297.33 105.59C295.584 104.926 294.173 103.595 293.407 101.89C292.642 100.185 292.586 98.2466 293.25 96.5001C293.914 94.7537 295.245 93.3427 296.95 92.5775C298.655 91.8124 300.594 91.7558 302.34 92.4201C323.56 100.543 342.299 114.053 356.71 131.62C359.1 134.53 361.363 137.55 363.5 140.68H441.57ZM437 288.51H362.8L362.08 289.53C349.972 306.538 333.955 320.387 315.376 329.91C296.798 339.434 276.202 344.353 255.325 344.253C234.449 344.153 213.901 339.037 195.415 329.336C176.928 319.635 161.044 305.633 149.1 288.51H67.21C68.9995 291.12 70.964 293.606 73.09 295.95C77.66 301 84.1 304.13 90.21 307.09C97.68 310.72 104.76 314.16 109.9 320.93C117.67 331.16 122.28 342.96 126.6 354.06C130.56 364.23 134.28 373.76 139.61 379.52C141.718 381.807 143.995 383.933 146.42 385.88C148.768 387.752 151.259 389.437 153.87 390.92L153.96 390.98C156.557 392.494 159.268 393.801 162.07 394.89C164.964 396.019 167.939 396.928 170.97 397.61C178.62 399.34 188.75 397.79 199.56 396.14C211.29 394.34 223.77 392.44 236.58 394.05C244.97 395.11 251.5 399.54 258.38 404.2C263.98 407.99 269.89 411.99 276.59 413.43C284.821 415.356 293.361 415.554 301.673 414.014C309.984 412.473 317.886 409.227 324.88 404.48C336.47 396.92 341.79 388.03 346.92 379.44C352.01 370.92 356.96 362.64 366.92 355.25C372.43 351.15 380.06 349.73 388.69 348.13C396.94 346.59 406.28 344.85 413.8 340.39C424.01 334.34 430.57 326.46 433.98 315.51C436.29 308.1 437.25 299.21 437 288.51ZM345.11 288.51H166.81C177.711 301.563 191.345 312.063 206.75 319.269C222.155 326.474 238.954 330.208 255.96 330.208C272.966 330.208 289.765 326.474 305.17 319.269C320.575 312.063 334.209 301.563 345.11 288.51ZM493.24 152.387H18.76C16.9062 152.396 15.1308 153.136 13.82 154.447C12.5092 155.758 11.7688 157.533 11.76 159.387V269.687C11.7688 271.541 12.5091 273.316 13.82 274.627C15.1308 275.938 16.9062 276.678 18.76 276.687H493.24C495.092 276.674 496.865 275.932 498.175 274.622C499.485 273.312 500.227 271.539 500.24 269.687V159.387C500.238 157.639 499.581 155.955 498.4 154.667L498.18 154.447C496.87 153.135 495.094 152.395 493.24 152.387ZM251.81 63.7501L258.3 78.9501L274.89 80.4401C275.441 80.5081 275.945 80.7834 276.3 81.2101C276.668 81.636 276.854 82.1886 276.82 82.7501V82.8501C276.791 83.125 276.713 83.3925 276.59 83.6401C276.476 83.8538 276.331 84.0493 276.16 84.2201L263.58 95.2101L267.28 111.41C267.395 111.974 267.291 112.56 266.99 113.05L266.96 113.1C266.643 113.568 266.161 113.9 265.61 114.03L265.54 114.05C265.272 114.1 264.998 114.1 264.73 114.05L264.65 114.04C264.384 113.981 264.13 113.876 263.9 113.73L249.74 105.26L235.51 113.77C235.2 113.957 234.849 114.064 234.487 114.083C234.126 114.102 233.765 114.032 233.438 113.879C233.11 113.725 232.824 113.494 232.607 113.205C232.389 112.916 232.246 112.578 232.19 112.22L232.18 112.17C232.153 111.941 232.157 111.709 232.19 111.48L235.91 95.2101L223.42 84.3001C223.201 84.1108 223.022 83.8798 222.893 83.6205C222.764 83.3613 222.689 83.079 222.67 82.7901C222.649 82.4994 222.687 82.2075 222.779 81.9312C222.872 81.6549 223.018 81.3996 223.21 81.1801C223.406 80.956 223.644 80.7725 223.91 80.6401L223.96 80.6201C224.214 80.5092 224.484 80.4416 224.76 80.4201L241.19 78.9501L247.73 63.6501C247.968 63.124 248.403 62.7121 248.942 62.5027C249.48 62.2934 250.079 62.3032 250.61 62.5301C250.873 62.6379 251.111 62.7977 251.31 63.0001C251.514 63.2035 251.677 63.4446 251.79 63.7101L251.81 63.7501Z" fill="#047247"></path> 
					                            <path d="M117.234 266.598H32.7641C32.1614 266.598 31.5834 266.358 31.1573 265.932C30.7311 265.506 30.4917 264.928 30.4917 264.325V164.749C30.4917 164.45 30.5504 164.155 30.6646 163.879C30.7788 163.603 30.9462 163.353 31.1572 163.142C31.3683 162.931 31.6188 162.763 31.8945 162.649C32.1702 162.535 32.4657 162.476 32.7641 162.476H117.234C117.532 162.476 117.827 162.535 118.103 162.649C118.379 162.763 118.629 162.931 118.84 163.142C119.051 163.353 119.219 163.603 119.333 163.879C119.447 164.155 119.506 164.45 119.506 164.749V264.325C119.506 264.928 119.267 265.506 118.84 265.932C118.414 266.358 117.836 266.598 117.234 266.598ZM35.0365 262.053H114.961V167.021H35.0365L35.0365 262.053Z" fill="#047247"></path> 
					                            <path d="M101.438 185.659H48.5589C48.2601 185.66 47.9641 185.601 47.6879 185.488C47.4116 185.374 47.1605 185.206 46.949 184.995C46.7375 184.784 46.5697 184.533 46.4552 184.257C46.3407 183.981 46.2817 183.685 46.2817 183.387C46.2817 183.088 46.3407 182.792 46.4552 182.516C46.5697 182.24 46.7375 181.989 46.949 181.778C47.1605 181.567 47.4116 181.4 47.6879 181.286C47.9641 181.172 48.2601 181.114 48.5589 181.114H101.438C101.737 181.114 102.033 181.172 102.309 181.286C102.586 181.4 102.837 181.567 103.048 181.778C103.26 181.989 103.428 182.24 103.542 182.516C103.657 182.792 103.715 183.088 103.715 183.387C103.715 183.685 103.657 183.981 103.542 184.257C103.428 184.533 103.26 184.784 103.048 184.995C102.837 185.206 102.586 185.374 102.309 185.488C102.033 185.601 101.737 185.66 101.438 185.659Z" fill="#047247"></path> 
					                            <path d="M101.438 197.503H48.5589C48.2601 197.504 47.9641 197.445 47.6879 197.331C47.4116 197.217 47.1605 197.05 46.949 196.839C46.7375 196.628 46.5697 196.377 46.4552 196.101C46.3407 195.825 46.2817 195.529 46.2817 195.23C46.2817 194.932 46.3407 194.636 46.4552 194.36C46.5697 194.084 46.7375 193.833 46.949 193.622C47.1605 193.411 47.4116 193.244 47.6879 193.13C47.9641 193.016 48.2601 192.957 48.5589 192.958H101.438C101.737 192.957 102.033 193.016 102.309 193.13C102.586 193.244 102.837 193.411 103.048 193.622C103.26 193.833 103.428 194.084 103.542 194.36C103.657 194.636 103.715 194.932 103.715 195.23C103.715 195.529 103.657 195.825 103.542 196.101C103.428 196.377 103.26 196.628 103.048 196.839C102.837 197.05 102.586 197.217 102.309 197.331C102.033 197.445 101.737 197.504 101.438 197.503Z" fill="#047247"></path> 
					                            <path d="M101.438 209.347H48.559C47.9564 209.347 47.3784 209.108 46.9522 208.682C46.526 208.255 46.2866 207.677 46.2866 207.075C46.2866 206.472 46.526 205.894 46.9522 205.468C47.3784 205.042 47.9564 204.802 48.559 204.802H101.438C102.041 204.802 102.619 205.042 103.045 205.468C103.471 205.894 103.711 206.472 103.711 207.075C103.711 207.677 103.471 208.255 103.045 208.682C102.619 209.108 102.041 209.347 101.438 209.347Z" fill="#047247"></path> 
					                            <path d="M101.438 221.192H86.0796C85.4769 221.192 84.8989 220.952 84.4727 220.526C84.0465 220.1 83.8071 219.522 83.8071 218.919C83.8071 218.317 84.0465 217.739 84.4727 217.313C84.8989 216.886 85.4769 216.647 86.0796 216.647H101.438C102.041 216.647 102.619 216.886 103.045 217.313C103.471 217.739 103.711 218.317 103.711 218.919C103.711 219.522 103.471 220.1 103.045 220.526C102.619 220.952 102.041 221.192 101.438 221.192Z" fill="#047247"></path> 
					                            <path d="M72.9042 256.411L67.8706 238.969C69.5819 237.327 70.7627 235.21 71.2612 232.891C71.7598 230.573 71.5532 228.158 70.6681 225.957C69.7831 223.757 68.2599 221.871 66.2946 220.544C64.3293 219.216 62.0118 218.506 59.64 218.506C57.2682 218.506 54.9506 219.216 52.9854 220.544C51.0201 221.872 49.497 223.757 48.612 225.958C47.727 228.158 47.5206 230.573 48.0192 232.892C48.5178 235.211 49.6987 237.327 51.4101 238.969L46.3762 256.411C46.252 256.842 46.2578 257.3 46.3929 257.727C46.528 258.154 46.7865 258.532 47.1357 258.813C47.4849 259.093 47.9094 259.265 48.3557 259.305C48.802 259.345 49.2502 259.252 49.644 259.039L59.6405 253.611L69.6371 259.039C70.0308 259.252 70.479 259.345 70.9253 259.305C71.3716 259.265 71.796 259.093 72.1452 258.813C72.4944 258.532 72.7528 258.154 72.8878 257.727C73.0229 257.3 73.0286 256.842 72.9042 256.411ZM59.6405 223.063C61.0925 223.063 62.512 223.494 63.7193 224.3C64.9267 225.107 65.8677 226.254 66.4234 227.595C66.979 228.937 67.1245 230.413 66.8412 231.837C66.5579 233.261 65.8587 234.569 64.832 235.596C63.8053 236.623 62.4971 237.322 61.073 237.606C59.6488 237.889 58.1727 237.743 56.8311 237.188C55.4896 236.632 54.343 235.691 53.5362 234.484C52.7294 233.277 52.2988 231.857 52.2987 230.405C52.301 228.459 53.0752 226.593 54.4515 225.216C55.8279 223.84 57.694 223.065 59.6405 223.063ZM60.7246 249.028C60.3943 248.849 60.0247 248.754 59.6489 248.753C59.273 248.752 58.9028 248.844 58.5712 249.021L58.5561 249.028L52.2493 252.452L55.4074 241.51C58.1332 242.552 61.1477 242.552 63.8736 241.51L67.0316 252.452L60.7246 249.028Z" fill="#047247"></path> 
					                            <path fill-rule="evenodd" clip-rule="evenodd" d="M84.7037 240.666L90.8518 246.666L102.333 234.222C103.263 233.272 103.795 231.222 104.955 232.412L106.996 234.496C108.226 235.716 108.166 236.436 106.996 237.576L93.1661 251.096C90.7161 253.506 91.1661 253.656 88.6561 251.186L79.9761 242.546C79.8564 242.437 79.7626 242.302 79.7016 242.152C79.6406 242.001 79.6139 241.839 79.6235 241.677C79.6331 241.515 79.6787 241.358 79.757 241.216C79.8353 241.074 79.9443 240.951 80.0761 240.856L82.6175 238.219C82.7568 238.407 82.7359 238.337 82.9259 238.592L84.7037 240.666Z" fill="#047247"></path> 
					                            <path d="M149.89 190.128V209.173H163.99V221.251H149.89V241.386H165.79V253.792H141.49V177.72H165.79V190.128H149.89Z" fill="#047247"></path> 
					                            <path d="M198.49 253.792L189.43 228.218L181.21 253.792H171.73L184.93 215.484L171.55 177.83H181.21L190.27 203.296L198.43 177.83H207.91L194.77 216.028L208.15 253.792L198.49 253.792Z" fill="#047247"></path> 
					                            <path d="M243.52 212.763C242.637 216.014 240.921 218.977 238.541 221.361C237.404 222.446 236.062 223.293 234.594 223.853C233.126 224.414 231.561 224.676 229.99 224.625H222.97V253.792H214.57V177.829H229.99C233.037 177.758 235.996 178.847 238.27 180.876C240.704 183.156 242.477 186.051 243.4 189.256C245.638 196.926 245.679 205.07 243.52 212.763ZM234.791 209.444C235.91 207.522 236.47 204.819 236.471 201.336C236.471 193.936 234.191 190.236 229.631 190.236H222.97V212.327H229.631C230.675 212.379 231.713 212.136 232.625 211.626C233.538 211.116 234.288 210.36 234.791 209.444Z" fill="#047247"></path> 
					                            <path d="M259.449 241.711H273.248V253.792H251.049V177.83H259.449V241.711Z" fill="#047247"></path> 
					                            <path d="M287.228 249.548C283.949 246.211 281.349 241.585 279.429 235.671C275.588 222.598 275.588 208.696 279.429 195.622C281.349 189.71 283.949 185.085 287.228 181.748C290.507 178.411 294.108 176.741 298.029 176.74C301.988 176.74 305.598 178.409 308.859 181.748C312.119 185.085 314.699 189.71 316.599 195.622C320.399 208.702 320.399 222.592 316.599 235.671C314.699 241.586 312.108 246.211 308.828 249.548C305.548 252.885 301.949 254.553 298.029 254.553C294.107 254.553 290.507 252.885 287.228 249.548ZM304.689 237.848C306.866 235.288 308.408 232.249 309.189 228.979C310.334 224.612 310.879 220.108 310.808 215.594C310.881 211.096 310.337 206.61 309.189 202.261C308.409 199.024 306.867 196.02 304.689 193.5C303.858 192.55 302.834 191.787 301.686 191.262C300.538 190.737 299.291 190.461 298.029 190.454C296.762 190.463 295.511 190.739 294.358 191.264C293.205 191.789 292.176 192.551 291.337 193.5C289.143 196.012 287.589 199.018 286.808 202.261C285.66 206.61 285.116 211.096 285.189 215.594C285.118 220.108 285.663 224.612 286.808 228.979C287.59 232.254 289.143 235.295 291.337 237.848C292.168 238.811 293.195 239.586 294.349 240.121C295.502 240.656 296.757 240.938 298.029 240.95C299.296 240.94 300.547 240.658 301.696 240.123C302.845 239.588 303.866 238.812 304.689 237.848Z" fill="#047247"></path> 
					                            <path d="M332.258 251.832C329.736 249.768 327.819 247.061 326.709 243.996C325.267 240.135 324.554 236.039 324.607 231.918H333.607C333.588 234.498 334.217 237.042 335.437 239.316C335.87 240.143 336.521 240.834 337.321 241.314C338.12 241.794 339.036 242.044 339.969 242.037C340.896 242.057 341.812 241.831 342.623 241.382C343.434 240.933 344.112 240.277 344.588 239.481C345.591 237.612 346.16 235.541 346.254 233.421C346.347 231.302 345.963 229.189 345.129 227.238C344.454 225.891 343.479 224.718 342.279 223.809C340.782 222.764 339.207 221.837 337.568 221.035C335.22 219.827 332.999 218.386 330.937 216.736C328.992 214.97 327.492 212.77 326.558 210.315C325.338 207.449 324.728 203.622 324.728 198.833C324.646 194.836 325.276 190.856 326.588 187.079C327.589 184.09 329.395 181.435 331.808 179.408C333.981 177.653 336.696 176.71 339.488 176.74C341.583 176.723 343.649 177.239 345.49 178.238C347.332 179.238 348.89 180.688 350.017 182.454C352.719 186.262 354.209 191.577 354.488 198.398H345.248C345.262 196.109 344.628 193.864 343.418 191.922C342.952 191.137 342.289 190.488 341.494 190.04C340.699 189.591 339.801 189.359 338.889 189.366C338.089 189.362 337.303 189.571 336.612 189.973C335.921 190.375 335.351 190.954 334.959 191.651C333.856 193.682 333.346 195.983 333.488 198.29C333.424 200.043 333.806 201.784 334.598 203.35C335.277 204.621 336.217 205.733 337.357 206.615C338.836 207.686 340.39 208.65 342.008 209.498C344.372 210.716 346.604 212.175 348.668 213.852C350.633 215.656 352.153 217.891 353.107 220.381C354.477 224.029 355.11 227.913 354.969 231.808C355.003 235.65 354.416 239.472 353.228 243.126C352.265 246.29 350.51 249.156 348.129 251.452C345.974 253.486 343.111 254.598 340.148 254.553C337.285 254.573 334.501 253.613 332.258 251.832Z" fill="#047247"></path> 
					                            <path d="M370.629 177.83V253.792H362.229V177.83H370.629Z" fill="#047247"></path> 
					                            <path d="M416.527 177.83L401.168 253.792H390.969L375.607 177.83H384.607L396.129 238.229L407.588 177.83H416.527Z" fill="#047247"></path> 
					                            <path d="M429.969 190.128V209.173H444.068V221.251H429.969V241.386H445.869V253.792H421.568V177.72H445.869V190.128H429.969Z" fill="#047247"></path> 
					                            <path d="M460.058 251.833C457.536 249.769 455.618 247.061 454.508 243.997C453.066 240.135 452.354 236.04 452.408 231.918H461.408C461.387 234.499 462.016 237.044 463.238 239.317C463.67 240.143 464.321 240.834 465.12 241.314C465.919 241.794 466.835 242.044 467.767 242.038C468.695 242.058 469.611 241.832 470.423 241.383C471.234 240.934 471.913 240.278 472.389 239.482C473.392 237.612 473.961 235.541 474.055 233.422C474.148 231.302 473.763 229.189 472.928 227.238C472.255 225.891 471.279 224.718 470.078 223.809C468.581 222.765 467.006 221.838 465.367 221.035C463.02 219.827 460.799 218.387 458.738 216.736C456.793 214.971 455.292 212.771 454.357 210.315C453.137 207.449 452.527 203.622 452.527 198.834C452.446 194.836 453.076 190.856 454.389 187.079C455.388 184.09 457.194 181.435 459.607 179.408C461.78 177.654 464.496 176.711 467.289 176.74C471.607 176.74 475.117 178.645 477.818 182.455C480.517 186.263 482.008 191.577 482.289 198.398H473.049C473.061 196.11 472.427 193.865 471.219 191.922C470.752 191.138 470.089 190.489 469.294 190.04C468.499 189.592 467.6 189.359 466.687 189.366C465.888 189.362 465.102 189.572 464.412 189.974C463.721 190.375 463.15 190.955 462.758 191.651C461.656 193.683 461.147 195.983 461.289 198.29C461.225 200.044 461.607 201.785 462.398 203.351C463.077 204.622 464.018 205.734 465.158 206.615C466.637 207.687 468.191 208.651 469.809 209.499C472.173 210.717 474.404 212.176 476.469 213.853C478.433 215.657 479.953 217.891 480.908 220.382C482.277 224.03 482.909 227.914 482.767 231.808C482.802 235.65 482.214 239.473 481.027 243.127C480.065 246.291 478.309 249.157 475.928 251.452C473.773 253.486 470.91 254.599 467.947 254.554C465.084 254.573 462.301 253.613 460.058 251.833Z" fill="#047247"></path> 
					                           </g> 
					                           <defs> 
					                            <clipPath id="clip0_16_3244"> 
					                             <rect width="512" height="429.08" fill="white"></rect> 
					                            </clipPath> 
					                           </defs> 
					                         </svg>
							 </span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Explosives Competency Certification<br/> Transaction Number</p>
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
							<p class="lower-title"><span class="one"> <%=applications.getTypeOfApplicant() %></span> </p>
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
							<a href="<%=Validator.isNotNull(pdfExpFileUrl)?pdfExpFileUrl:"javascript:void(0);"%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
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
								<ul class="list-unstyled form-wizard-steps clearfix pl-3">
								<li class="start-active <%=expDefaultActive%> film-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=wraStageStatus %></div>
									</div>
								</li>
							<%try{
									String stageJson = ExplosiveApplicationStagesLocalServiceUtil.getExplosiveCurrentStages(applications.getCaseId());
									if(Validator.isNotNull(stageJson)){
										JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
										for(int i=0 ;i<stagesArray.length();++i){
											JSONObject currentStage = stagesArray.getJSONObject(i);
											%>
											<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> film-progress'>
												<div class="dashboard-progress-card">
													<%
														if(Validator.isNotNull(currentStage.getString("duration"))){
															%><p class="dashboard-progress-card-duration"><%=currentStage.getString("duration") %></p><%}
													%>
													<div class="d-flex align-items-center">
														<p class="dashboard-progress-card-title"><%=currentStage.getString("startDate") %> </p>
														<%if(Validator.isNotNull(currentStage.getString("endDate"))){%>
															<div class="dashboard-progress-card-title px-1"></div>
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
						<a class="dash-yellow-repeated-link" onclick="getSingleJADSCApplicationSpecificStage('<%=expRenderURL%>', 'overview', 'ncra-overview-tab') "> Overview </a> 
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
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleExpExpirationApplicationSpecificStage('<%=expRenderURL%>', 'explosive-document', 'explosive-document-tab')">Update document
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
							<p class="three"><%=Validator.isNotNull(checkDateInExp)?checkDateInExp:"" %> <span> Renewal Required </span></p>
						</div>
					</div>
				</div>
			</div>
		</div> 
</section>
<% 	 }	 %>