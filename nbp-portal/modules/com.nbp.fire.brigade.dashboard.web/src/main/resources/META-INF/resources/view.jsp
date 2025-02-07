<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication"%>
<%@ include file="/init.jsp" %>
<%
long fireBrigadeApplicationId = 0;
fireBrigadeApplicationId = ParamUtil.getLong(request, "fireBrigadeApplicationId");
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "fireBrigadeApplicationId"))){
	fireBrigadeApplicationId =ParamUtil.getLong(request, "fireBrigadeApplicationId");
}else if(Validator.isNotNull(httpServletRequest.getParameter("fireBrigadeApplicationId"))){
	fireBrigadeApplicationId = Long.valueOf(httpServletRequest.getParameter("fireBrigadeApplicationId"));
}
FireBrigadeApplication fireBrigadeApp=null;
try{
	fireBrigadeApp=FireBrigadeApplicationLocalServiceUtil.getFireBrigadeApplication(fireBrigadeApplicationId);
}catch(Exception e){
}
String stageTab ="";
if(Validator.isNotNull(ParamUtil.getString(request, "stageTab"))){
	 stageTab =ParamUtil.getString(request, "stageTab");
}
if(Validator.isNull(stageTab) && Validator.isNotNull(httpServletRequest.getParameter(renderResponse.getNamespace()+"stageTab"))){
	stageTab = httpServletRequest.getParameter(renderResponse.getNamespace()+"stageTab");
}
String stageName = "";
if(Validator.isNotNull(ParamUtil.getString(request, "stageName"))){
	stageName =ParamUtil.getString(request, "stageName");
}
if(Validator.isNull(stageName) && Validator.isNotNull(httpServletRequest.getParameter(renderResponse.getNamespace()+"stageName"))){
	stageName = httpServletRequest.getParameter(renderResponse.getNamespace()+"stageName");
}

%>
<portlet:resourceURL var="updateFbInspectionUrl" id="/fireBrigade/inspection/update"></portlet:resourceURL>
<portlet:resourceURL var="getFbInspectionTimeSlotUrl" id="/fireBrigade/inspection/timeslots"></portlet:resourceURL>
<div class="inner-common-banner single-application-banner">
	<div class="container">
		<div class="row align-items-center">
			<div class="col-md-12">
				<div class="d-flex align-items-center justify-content-between">
					<div class="d-flex align-items-center">
						<div class="icon">
							<span class="mr-2">
								<svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" viewBox="0 0 512 512" fill="none"> 
                                   <path d="M368 480H144C133.391 480 123.217 475.786 115.716 468.284C108.214 460.783 104 450.609 104 440V71.9999C104 61.3912 108.214 51.2171 115.716 43.7156C123.217 36.2142 133.391 31.9999 144 31.9999H290.72C295.976 31.9905 301.183 33.0172 306.042 35.0214C310.902 37.0255 315.318 39.9678 319.04 43.6799L396.32 120.96C400.032 124.682 402.974 129.098 404.979 133.958C406.983 138.817 408.009 144.024 408 149.28V440C408 450.609 403.786 460.783 396.284 468.284C388.783 475.786 378.609 480 368 480ZM144 47.9999C137.635 47.9999 131.53 50.5285 127.029 55.0293C122.529 59.5302 120 65.6347 120 71.9999V440C120 446.365 122.529 452.47 127.029 456.971C131.53 461.471 137.635 464 144 464H368C374.365 464 380.47 461.471 384.971 456.971C389.471 452.47 392 446.365 392 440V149.28C391.994 142.917 389.462 136.817 384.96 132.32L307.68 55.0399C303.183 50.5377 297.083 48.0055 290.72 47.9999H144Z" fill="#fff"></path> 
                                   <path d="M257.229 269.453C257.229 269.453 239.486 283.566 239.486 294.974C239.486 300.082 247.09 305.186 257.229 305.186C267.36 305.186 274.964 300.082 274.964 294.974C274.964 283.156 257.229 269.453 257.229 269.453ZM321.912 243.657C322.939 231.231 326.583 219.822 333 209.368L308.364 185C300.583 191.627 291.717 195.295 281.67 195.944C272.467 196.767 263.744 195.038 255.542 190.742C247.101 194.896 238.411 196.633 229.351 195.944C219.983 195.114 211.524 191.83 203.952 186.008L179.246 210.365C185.322 220.972 188.706 232.068 189.37 243.657C189.685 248.993 188.145 256.334 184.691 265.832C183.12 270.318 181.75 274.871 180.584 279.477C179.719 283.265 179.18 286.346 179.004 288.652C178.876 298.766 181.747 307.905 187.632 316.021C192.23 321.948 199.812 328.495 210.343 335.651C221.867 341.451 230.781 345.214 237.025 346.823L242.203 349.201C243.834 349.97 245.58 350.724 247.398 351.547C251.325 353.871 254.083 356.394 255.542 359C257.32 356.183 260.14 353.722 263.895 351.547C266.141 350.59 268.369 349.59 270.575 348.545L274.484 346.82C275.819 346.164 277.575 345.413 279.687 344.587C282.313 343.559 284.953 342.567 287.607 341.611C293.69 339.483 298.126 337.467 300.935 335.647C311.15 328.491 318.619 322.053 323.368 316.289C329.465 308.14 332.424 298.965 332.289 288.648C331.926 284.03 329.949 276.638 326.36 266.571C322.939 256.766 321.421 249.153 321.912 243.657ZM257.229 315.394C234.836 315.394 214.145 297.109 214.145 274.557C214.145 259.242 225.989 244.774 229.351 238.825L239.486 254.141L257.229 228.621L274.964 254.141L285.113 238.825C288.465 244.774 300.319 259.242 300.319 274.557C300.319 297.109 279.624 315.394 257.229 315.394Z" fill="#fff"></path> 
                                </svg>
							</span>
						</div>
						<div class="right d-flex">
							<div>
								<p class="common-banner-upper-title f2 mb-0">Fire/Occupancy Certificate </p>
								<h2 class="cannabis-number text-white">
								<%=Validator.isNotNull(fireBrigadeApp)&& Validator.isNotNull(fireBrigadeApp.getApplicationNumber())?fireBrigadeApp.getApplicationNumber():"Not Available"%> </h2>
							</div>
							<div class="ml-4 status-date-wrapper">
								<div class="expiry-date">
									<h5 class="text-white"></h5>
								</div>
							</div>
						</div>
					</div>
					<div class="">
						<a class="common-banner-filled-link f2 common-yellow-bg" data-senna-off="true" href="/group/guest/dashboard?selectedApplication=Fire Brigade Application"> 
							<span class="mr-2"> 
		                      <svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		                       <path d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z" fill="#282524"></path> 
		                      </svg> 
		                     </span>
							Back to Dashboard
		                </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="all-application-tabs" id="single-application-tabs">	
	<div class="tabs-header">
		<div class="container-fluid px-5">
			<div class="row">
				<div class="col-md-12">
					<ul class="nav nav-tabs" id="myTab" role="tablist">
					  <li class="nav-item">
					    <a class="nav-link active" id="fire-brigade-overview-tab" data-toggle="tab" href="#fire-brigade-overview" role="tab" aria-controls="fire-brigade-overview" aria-selected="true">
					    	<span class="mr-1">
					    		<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 20 20" fill="none">
									<path d="M14 11C14.55 11 15 10.55 15 10V1C15 0.45 14.55 0 14 0H1C0.45 0 0 0.45 0 1V15L4 11H14ZM2 10.17V2H13V9H3.17L2 10.17ZM20 5C20 4.45 19.55 4 19 4H17V13H4V15C4 15.55 4.45 16 5 16H16L20 20V5Z" fill="#FAFAF9"/>
								</svg>
					    	</span>
					    	Overview
					    </a>
					  </li>
					  <li class="nav-item">
					    <a class="nav-link" id="fire-brigade-details-tab" data-toggle="tab" href="#fire-brigade-details" role="tab" aria-controls="fire-brigade-details" aria-selected="false">
					    	<span class="mr-1">
					    		<svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" viewBox="0 0 18 18" fill="none">
									<path d="M11.17 2L16 6.83V16H2V2H11.17ZM11.17 0H2C0.9 0 0 0.9 0 2V16C0 17.1 0.9 18 2 18H16C17.1 18 18 17.1 18 16V6.83C18 6.3 17.79 5.79 17.41 5.42L12.58 0.59C12.21 0.21 11.7 0 11.17 0ZM4 12H14V14H4V12ZM4 8H14V10H4V8ZM4 4H11V6H4V4Z" fill="#FAFAF9"/>
								</svg>
					    	</span>
					    	Details
					    </a>
					  </li>
					  <li class="nav-item">
					    <a class="nav-link" id="fire-brigade-document-tab" data-toggle="tab" href="#fire-brigade-document" role="tab" aria-controls="fire-brigade-document" aria-selected="false">
					    	<span class="mr-1">
					    		<svg xmlns="http://www.w3.org/2000/svg" width="17" height="20" viewBox="0 0 17 20" fill="none">
									<path d="M4.5 14H12.5V16H4.5V14ZM4.5 10H12.5V12H4.5V10ZM10.5 0H2.5C1.4 0 0.5 0.9 0.5 2V18C0.5 19.1 1.39 20 2.49 20H14.5C15.6 20 16.5 19.1 16.5 18V6L10.5 0ZM14.5 18H2.5V2H9.5V7H14.5V18Z" fill="#FAFAF9"/>
								</svg>
					    	</span>
					    	Documents
					    </a>
					  </li>
					  <li class="nav-item">
					    <a class="nav-link" id="fire-brigade-payment-verification-tab" data-toggle="tab" href="#fire-brigade-payment-verification" role="tab" aria-controls="fire-brigade-payment-verification" aria-selected="false">
					    	<span class="mr-1">
					    		<svg xmlns="http://www.w3.org/2000/svg" width="17" height="20" viewBox="0 0 17 20" fill="none">
									<path d="M4.5 14H12.5V16H4.5V14ZM4.5 10H12.5V12H4.5V10ZM10.5 0H2.5C1.4 0 0.5 0.9 0.5 2V18C0.5 19.1 1.39 20 2.49 20H14.5C15.6 20 16.5 19.1 16.5 18V6L10.5 0ZM14.5 18H2.5V2H9.5V7H14.5V18Z" fill="#FAFAF9"/>
								</svg>
					    	</span>
					    	Payment Verification
					    </a>
					  </li>
					  <li class="nav-item">
					    <a class="nav-link" id="fire-brigade-inspection-tab" data-toggle="tab" href="#fire-brigade-inspection" role="tab" aria-controls="fire-brigade-inspection" aria-selected="false">
					    	<span class="mr-1">
						    	<svg width="20" height="18" viewBox="0 0 20 18" fill="none" xmlns="http://www.w3.org/2000/svg">
									<path opacity="0.3" d="M2 16H18V2H2V16ZM11.41 7.75L12.82 9.17L15.99 6L17.41 7.42L12.82 12L10 9.16L11.41 7.75ZM3 4H8V6H3V4ZM3 8H8V10H3V8ZM3 12H8V14H3V12Z" fill="#FAFAF9"/>
									<path d="M18 0H2C0.9 0 0 0.9 0 2V16C0 17.1 0.9 18 2 18H18C19.1 18 20 17.1 20 16V2C20 0.9 19.1 0 18 0ZM18 16H2V2H18V16Z" fill="#FAFAF9"/>
									<path d="M17.41 7.42L15.99 6L12.82 9.17L11.41 7.75L10 9.16L12.82 12L17.41 7.42Z" fill="#FAFAF9"/>
									<path d="M8 4H3V6H8V4Z" fill="#FAFAF9"/>
									<path d="M8 8H3V10H8V8Z" fill="#FAFAF9"/>
									<path d="M8 12H3V14H8V12Z" fill="#FAFAF9"/>
								</svg>
					    	</span>
					    	Inspection
					    </a>
					  </li>
					  <li class="nav-item">
					    <a class="nav-link" id="fire-brigade-issued-certificate-tab" data-toggle="tab" href="#fire-brigade-issued-certificate" role="tab" aria-controls="fire-brigade-issued-certificate" aria-selected="false">
					    	<span class="mr-1">
						    	<svg width="20" height="18" viewBox="0 0 20 18" fill="none" xmlns="http://www.w3.org/2000/svg">
									<path opacity="0.3" d="M2 16H18V2H2V16ZM11.41 7.75L12.82 9.17L15.99 6L17.41 7.42L12.82 12L10 9.16L11.41 7.75ZM3 4H8V6H3V4ZM3 8H8V10H3V8ZM3 12H8V14H3V12Z" fill="#FAFAF9"/>
									<path d="M18 0H2C0.9 0 0 0.9 0 2V16C0 17.1 0.9 18 2 18H18C19.1 18 20 17.1 20 16V2C20 0.9 19.1 0 18 0ZM18 16H2V2H18V16Z" fill="#FAFAF9"/>
									<path d="M17.41 7.42L15.99 6L12.82 9.17L11.41 7.75L10 9.16L12.82 12L17.41 7.42Z" fill="#FAFAF9"/>
									<path d="M8 4H3V6H8V4Z" fill="#FAFAF9"/>
									<path d="M8 8H3V10H8V8Z" fill="#FAFAF9"/>
									<path d="M8 12H3V14H8V12Z" fill="#FAFAF9"/>
								</svg>
					    	</span>
					    	Issued Certificates
					    </a>
					  </li>
					</ul>
				</div>
			</div>
		</div>		
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
	 			<div class="tab-content" id="myTabContent">
	 				  <div class="tab-pane fade show active" id="fire-brigade-overview" role="tabpanel" aria-labelledby="fire-brigade-overview-tab">
	 				 	<%@ include file="/fire-brigade-single-application-overview.jsp" %>
					  </div>
					   <div class="tab-pane fade" id="fire-brigade-details" role="tabpanel" aria-labelledby="fire-brigade-details-tab">
					  	<%@ include file="/fire-brigade-single-application-details.jsp" %>
					  </div>
					  <div class="tab-pane fade" id="fire-brigade-document" role="tabpanel" aria-labelledby="fire-brigade-document-tab">
					  	<%@ include file="/fire-brigade-single-application-documents.jsp" %>
					  </div>
					  <div class="tab-pane fade" id="fire-brigade-payment-verification" role="tabpanel" aria-labelledby="fire-brigade-payment-verification-tab">
					  	<%@ include file="/fire-brigade-single-application-data-verification.jsp" %>
					  </div>
					  <div class="tab-pane fade" id="fire-brigade-inspection" role="tabpanel" aria-labelledby="fire-brigade-inspection-tab">
					  	<%@ include file="/fire-brigade-single-application-inspection.jsp" %>
					  </div> 
					  <div class="tab-pane fade" id="fire-brigade-issued-certificate" role="tabpanel" aria-labelledby="fire-brigade-issued-certificate-tab">
					  	<%@ include file="/fire-brigade-single-application-issued-certificate.jsp" %>
					  </div> 
	 			</div>
	 		</div>
	 	</div>
	</div>
</div>
<script>
function userConfirmation(){
	selectedChoice = $('input[type=radio][name=timeForInspection]').val();
	 $.ajax({
		    type: "POST",
		    url: "${updateFbInspectionUrl}",
		    data: {
		      "<portlet:namespace/>selectedslot": selectedChoice,
		    },
		    success: function (data) {
		    	$("#view-time-slots").addClass("hide");
			     $("#confirmation-msg").html(data);   
		    },
		    error: function (data) {
		    	
		    },
		  });
}
$('#fire-brigade-inspection-tab').click(function(){
	  $('#view-time-slots').empty();
	 var fireBrigadeApplicationId = "<%=fireBrigadeApplicationId%>";
	 $.ajax({
		    type: "POST",
		    url: "${getFbInspectionTimeSlotUrl}",
		    data: {
		      "<portlet:namespace/>fireBrigadeApplicationId": fireBrigadeApplicationId,
		    },
		    success: function (data) {
		        $('#view-time-slots').html(data);
			      $('#view-time-slots').children('div[class=inner-common-banner]').remove();
			      $('#view-time-slots').children('div[class=all-application-tabs]').remove();
			     $('#view-time-slots').show();
		    },
		    error: function (data) {
		    },
		  });
	});

 $(document).ready(function() {
	var stageName = "<%=stageName%>";
    var stageTab = "<%=stageTab%>";
    if(stageName != ""){
    	$("#single-application-tabs").find(".nav-link").removeClass("active");
    	$("#single-application-tabs").find(".tab-pane").removeClass("active show");
    }
    $("#"+stageTab).addClass("active");
    $("#"+stageName).addClass("active show");
}); 
</script>