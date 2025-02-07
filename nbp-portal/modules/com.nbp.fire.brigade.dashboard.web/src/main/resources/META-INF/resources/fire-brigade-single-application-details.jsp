<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo"%>
<% 
FireBrigadeSignatureInfo signatureInfo=null;
try{
	signatureInfo=FireBrigadeSignatureInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
}catch(Exception e){
}
String pdfFileUrl ="";
FileEntry pdffileEntry = null;
try{
pdffileEntry = DLAppLocalServiceUtil.getFileEntry(fireBrigadeApp.getPdfFileEntryId());
pdfFileUrl = DLURLHelperUtil.getDownloadURL(pdffileEntry, pdffileEntry.getFileVersion(), themeDisplay,
			StringPool.BLANK, false, true);
}catch(Exception e){}
%>
<section class="wizard-section dashboard-progress">
	<div class="second-card dash-common-card">
	  <div class="container-fluid">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" viewBox="0 0 512 512" fill="none"> 
                                    <path d="M368 480H144C133.391 480 123.217 475.786 115.716 468.284C108.214 460.783 104 450.609 104 440V71.9999C104 61.3912 108.214 51.2171 115.716 43.7156C123.217 36.2142 133.391 31.9999 144 31.9999H290.72C295.976 31.9905 301.183 33.0172 306.042 35.0214C310.902 37.0255 315.318 39.9678 319.04 43.6799L396.32 120.96C400.032 124.682 402.974 129.098 404.979 133.958C406.983 138.817 408.009 144.024 408 149.28V440C408 450.609 403.786 460.783 396.284 468.284C388.783 475.786 378.609 480 368 480ZM144 47.9999C137.635 47.9999 131.53 50.5285 127.029 55.0293C122.529 59.5302 120 65.6347 120 71.9999V440C120 446.365 122.529 452.47 127.029 456.971C131.53 461.471 137.635 464 144 464H368C374.365 464 380.47 461.471 384.971 456.971C389.471 452.47 392 446.365 392 440V149.28C391.994 142.917 389.462 136.817 384.96 132.32L307.68 55.0399C303.183 50.5377 297.083 48.0055 290.72 47.9999H144Z" fill="#047247"></path> 
                                    <path d="M257.229 269.453C257.229 269.453 239.486 283.566 239.486 294.974C239.486 300.082 247.09 305.186 257.229 305.186C267.36 305.186 274.964 300.082 274.964 294.974C274.964 283.156 257.229 269.453 257.229 269.453ZM321.912 243.657C322.939 231.231 326.583 219.822 333 209.368L308.364 185C300.583 191.627 291.717 195.295 281.67 195.944C272.467 196.767 263.744 195.038 255.542 190.742C247.101 194.896 238.411 196.633 229.351 195.944C219.983 195.114 211.524 191.83 203.952 186.008L179.246 210.365C185.322 220.972 188.706 232.068 189.37 243.657C189.685 248.993 188.145 256.334 184.691 265.832C183.12 270.318 181.75 274.871 180.584 279.477C179.719 283.265 179.18 286.346 179.004 288.652C178.876 298.766 181.747 307.905 187.632 316.021C192.23 321.948 199.812 328.495 210.343 335.651C221.867 341.451 230.781 345.214 237.025 346.823L242.203 349.201C243.834 349.97 245.58 350.724 247.398 351.547C251.325 353.871 254.083 356.394 255.542 359C257.32 356.183 260.14 353.722 263.895 351.547C266.141 350.59 268.369 349.59 270.575 348.545L274.484 346.82C275.819 346.164 277.575 345.413 279.687 344.587C282.313 343.559 284.953 342.567 287.607 341.611C293.69 339.483 298.126 337.467 300.935 335.647C311.15 328.491 318.619 322.053 323.368 316.289C329.465 308.14 332.424 298.965 332.289 288.648C331.926 284.03 329.949 276.638 326.36 266.571C322.939 256.766 321.421 249.153 321.912 243.657ZM257.229 315.394C234.836 315.394 214.145 297.109 214.145 274.557C214.145 259.242 225.989 244.774 229.351 238.825L239.486 254.141L257.229 228.621L274.964 254.141L285.113 238.825C288.465 244.774 300.319 259.242 300.319 274.557C300.319 297.109 279.624 315.394 257.229 315.394Z" fill="#047247"></path> 
                                </svg>
							</span>
						</div>
						<input type="hidden" id="filmApplicationId" value="">
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">Fire/Occupancy Certificate <br/> 
								 Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"><%=fireBrigadeApp.getApplicationNumber()%>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-3 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Type of Certificate</p>
							<p class="lower-title">
								<span class="one"><%=fireBrigadeApp.getCertificateType()%>
								</span> 

							</p>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-3 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Transaction Type</p>
							<p class="lower-title">
								<span class="one"><%=fireBrigadeApp.getTypeOfTransaction() %>
								</span> 

							</p>
						</div>
					</div>
					<div class="right-part d-flex col-lg-3 justify-content-end">
						<div class="dash-status-box">
							<p class="dash-status">Status</p>
							<p class="dash-status-type">
								<span class="circle"></span>Submitted <span class="dash-status-type-info"><%-- ><%=applicationStatus%> --%></span>
									<%-- class="dash-status-type-info"> <%=UserDashboardPortletKeys.getStatusLabel(applications.getStatus())%> --%>
							</p>
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
								<li class="start-active<%=fireBrigadeDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(fireBrigadeApp.getCreateDate())%></p>
										<div class="dashboard-progress-card-status">
											<span></span><%=fireBrigadeStageStatus %>
										</div>
									</div>
								</li>
							<%try{
								String stageJson = FireBrigadeApplicationStageLocalServiceUtil.getFireBrigadeCurrentStages(fireBrigadeApp.getCaseId()) ;
								if(Validator.isNotNull(stageJson)){
									JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
									for(int i=0 ;i<stagesArray.length();++i){
										JSONObject currentStage = stagesArray.getJSONObject(i);
										%>
										<li class='<%=currentStage.getString("stageName").equals("In Progress")||currentStage.getString("stageStatus").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("stageStatus").equals("Closed")?"start-active":"" %> farm-progress'>
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
												<%if(Validator.isNotNull(currentStage.getString("stageStatus"))){%>
												<div class="dashboard-progress-card-status">
													<span></span><%=currentStage.getString("stageStatus") %>
												</div><%}%>
											</div>
										</li>
										<%}}}catch(Exception e){}%>
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
	</div>
</div>	
	
<div class="container">
  <div class="row">
	<div class="col-md-12">	
	  <div class="overview-details" id="company_overview_details">
		<div class="d-flex align-items-center justify-content-between my-4">
			<h2 class="main-heading mb-0">Application Transcript</h2>
			<a href="<%=Validator.isNotNull(pdfFileUrl)?pdfFileUrl:"javascript:void(0)"%>" type="button" class="common-yellow-bg p-2 border-0">Download and Print 
			<span> 
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="25" viewBox="0 0 24 25" fill="none"> 
                   <g clip-path="url(#clip0_6612_20494)"> 
                    <path d="M19 9.5H15V3.5H9V9.5H5L12 16.5L19 9.5ZM5 18.5V20.5H19V18.5H5Z" fill="#1B1917"></path> 
                   </g> 
                   <defs> 
                    <clipPath id="clip0_6612_20494"> 
                     <rect width="24" height="24" fill="white" transform="translate(0 0.5)"></rect> 
                    </clipPath> 
                   </defs> 
                  </svg>
                </span> 
             </a>
		</div>
		<!-- Form Details -->
			<div class="row" id="sezDeveloperDetails">
				<div class="col-md-12">
					<div class="row">
						<div class="col-md-6">
							<p class="heading">Name</p>
							<p class="sub-heading"><%=Validator.isNotNull(signatureInfo) && Validator.isNotNull(signatureInfo.getName())?signatureInfo.getName():"Not Available" %></p>
							<p class="heading">Telephone</p>
							<p class="sub-heading"><%=Validator.isNotNull(signatureInfo) && Validator.isNotNull(signatureInfo.getTelephone())?signatureInfo.getTelephone():"Not Available" %></p>
							<p class="heading">Fax</p>
							<p class="sub-heading"><%=Validator.isNotNull(signatureInfo) && Validator.isNotNull(signatureInfo.getFax())?signatureInfo.getFax():"Not Available" %></p>
							<p class="heading">Email</p>
							<p class="sub-heading"><%=Validator.isNotNull(signatureInfo) && Validator.isNotNull(signatureInfo.getEmail())?signatureInfo.getEmail():"Not Available" %></p>
						</div>
						<div class="col-md-6">
						    <p class="heading">TRN</p>
							<p class="sub-heading"><%=Validator.isNotNull(signatureInfo) && Validator.isNotNull(signatureInfo.getTrn())?signatureInfo.getTrn():"Not Available" %></p>
							<p class="heading">Title</p>
							<p class="sub-heading"><%=Validator.isNotNull(signatureInfo) && Validator.isNotNull(signatureInfo.getTitle())?signatureInfo.getTitle():"Not Available" %></p>
							<p class="heading">Applicant Address</p>
							<p class="sub-heading"><%=Validator.isNotNull(signatureInfo) && Validator.isNotNull(signatureInfo.getAddress())?signatureInfo.getAddress():"Not Available" %></p>
						</div>
					</div>
				</div>
			</div>
		</div>
	 </div>
  </div>
</div>
</section>