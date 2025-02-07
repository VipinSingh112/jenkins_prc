<%@page import="com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil"%>
<%@page import="com.nbp.medical.stages.service.service.MedicalCertificateIssuanceLocalServiceUtil"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp"%>
<%@page import="com.nbp.medical.stages.service.model.MedicalCertificateIssuance"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@include file="/init.jsp"%>
<%
	List<MedicalCertificateIssuance> medicalIssuance=null;
	MedicalFacilitiesApp medicalAppli=null;
	try{
		
		if(superAdmin){
			medicalIssuance=MedicalCertificateIssuanceLocalServiceUtil.getMedicalCertificateIssuances(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}else{
			try{
				medicalApplicationData = MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesAppBy_S_U(UserDashboardPortletKeys.SUBMITTED,themeDisplay.getUserId());
			}catch(Exception e){
				e.printStackTrace();
			}
			}
	}catch(Exception e){
	}
	if(superAdmin&&Validator.isNotNull(medicalIssuance)){
	for(MedicalCertificateIssuance fullRegis:medicalIssuance){
		if (fullRegis.getDateOfLicenseExpiration() != null && 
	            fullRegis.getDateOfLicenseExpiration().compareTo(new Date()) <= 0) {
	try{
		medicalAppli=MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesByCaseId(fullRegis.getCaseId());
	}catch(Exception e){
	}
	String medicalDashboardUrl =null;
	try{
		medicalDashboardUrl = PortalUtil.getPortalURL(request)+"/group/guest"+"/institutional-healthcare-facilities-dashboard?medicalApplicationId="
				+medicalAppli.getMedicalFacilitiesAppId()+"&_com_nbp_medical_dashboard_web_medicalDashboardPortlet__stageTab=medical-certificate-tab"
						+"&_com_nbp_medical_dashboard_web_medicalDashboardPortlet_stageName=medical-certificate";
	}catch(Exception e){
		e.printStackTrace();
	}
	if(medicalAppli!=null&&medicalAppli.getApplicationNumber()!=null){
	%>
			<div class="second-card dash-common-card">
			<div class="row p-3">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card row cursor-pointer" onclick="getMedicalSingleApplicationOverview('<%=medicalDashboardUrl%>')">
						<div class="d-flex col-lg-3">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 220 220" fill="none"> 
				                   <path fill-rule="evenodd" clip-rule="evenodd" d="M110 107.707C113.797 107.707 116.875 110.785 116.875 114.582V121.457H123.75C127.547 121.457 130.625 124.535 130.625 128.332C130.625 132.129 127.547 135.207 123.75 135.207H116.875V142.082C116.875 145.879 113.797 148.957 110 148.957C106.203 148.957 103.125 145.879 103.125 142.082V135.207H96.25C92.4532 135.207 89.375 132.129 89.375 128.332C89.375 124.535 92.4532 121.457 96.25 121.457H103.125V114.582C103.125 110.785 106.203 107.707 110 107.707Z" fill="#047247"></path> 
				                   <path fill-rule="evenodd" clip-rule="evenodd" d="M109.523 11.457C101.287 11.4568 94.4191 11.4566 88.9669 12.1896C83.2122 12.9633 78.0165 14.6653 73.8414 18.8404C69.6662 23.0156 67.9643 28.2112 67.1905 33.966C66.4575 39.4181 66.4577 46.286 66.458 54.522V55.2345C47.9305 55.8407 36.8048 58.0056 29.0724 65.7382C18.333 76.4776 18.333 93.7627 18.333 128.332C18.333 162.901 18.333 180.187 29.0724 190.926C39.8118 201.665 57.0966 201.665 91.6662 201.665H128.333C162.902 201.665 180.188 201.665 190.927 190.926C201.666 180.187 201.666 162.901 201.666 128.332C201.666 93.7627 201.666 76.4776 190.927 65.7382C183.195 58.0056 172.069 55.8407 153.541 55.2345V54.5221C153.541 46.2862 153.542 39.4181 152.809 33.966C152.035 28.2112 150.333 23.0156 146.158 18.8404C141.983 14.6653 136.787 12.9633 131.033 12.1896C125.58 11.4566 118.713 11.4568 110.476 11.457H109.523ZM139.791 55.016V54.9987C139.791 46.1619 139.777 40.226 139.182 35.7982C138.613 31.5681 137.63 29.7577 136.435 28.5631C135.241 27.3685 133.431 26.3857 129.2 25.817C124.773 25.2217 118.836 25.207 110 25.207C101.163 25.207 95.2267 25.2217 90.7991 25.817C86.569 26.3857 84.7586 27.3685 83.5641 28.5631C82.3695 29.7577 81.3867 31.5681 80.818 35.7982C80.2226 40.226 80.208 46.1619 80.208 54.9987V55.016C83.8016 54.9987 87.6153 54.9987 91.6663 54.9987H128.333C132.384 54.9987 136.198 54.9987 139.791 55.016ZM146.666 128.332C146.666 148.582 130.25 164.999 110 164.999C89.7492 164.999 73.333 148.582 73.333 128.332C73.333 108.082 89.7492 91.6654 110 91.6654C130.25 91.6654 146.666 108.082 146.666 128.332Z" fill="#047247"></path> 
				                 </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Institutional Healthcare Facilities / Healthcare Facilities Application<br/> Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> 
										<%=Validator.isNotNull(medicalAppli)&&Validator.isNotNull(medicalAppli.getApplicationNumber())?medicalAppli.getApplicationNumber():""%>
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
									<%=Validator.isNotNull(medicalAppli)&&Validator.isNotNull(medicalAppli.getNatureOfApplicant())?medicalAppli.getNatureOfApplicant():""%>
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
	for(MedicalFacilitiesApp medicalApp:medicalApplicationData){
		MedicalCertificateIssuance medicalCertificateData=null;
		try{
			medicalCertificateData=	MedicalCertificateIssuanceLocalServiceUtil.getCertificateIssuance(medicalApp.getCaseId());
		}catch(Exception e){}
		if (medicalCertificateData!=null && medicalCertificateData.getDateOfLicenseExpiration() != null && 
				medicalCertificateData.getDateOfLicenseExpiration().compareTo(new Date()) <= 0) {
	
			String medicalDashboardUrl =null;
			try{
				medicalDashboardUrl = PortalUtil.getPortalURL(request)+"/group/guest"+"/institutional-healthcare-facilities-dashboard?medicalApplicationId="
						+medicalApp.getMedicalFacilitiesAppId()+"&_com_nbp_medical_dashboard_web_medicalDashboardPortlet__stageTab=medical-certificate-tab"
								+"&_com_nbp_medical_dashboard_web_medicalDashboardPortlet_stageName=medical-certificate";
			}catch(Exception e){
			}
			%>
			<div class="second-card dash-common-card">
			<div class="row p-3">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card row cursor-pointer" onclick="getMedicalSingleApplicationOverview('<%=medicalDashboardUrl%>')">
						<div class="d-flex col-lg-3">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 220 220" fill="none"> 
				                   <path fill-rule="evenodd" clip-rule="evenodd" d="M110 107.707C113.797 107.707 116.875 110.785 116.875 114.582V121.457H123.75C127.547 121.457 130.625 124.535 130.625 128.332C130.625 132.129 127.547 135.207 123.75 135.207H116.875V142.082C116.875 145.879 113.797 148.957 110 148.957C106.203 148.957 103.125 145.879 103.125 142.082V135.207H96.25C92.4532 135.207 89.375 132.129 89.375 128.332C89.375 124.535 92.4532 121.457 96.25 121.457H103.125V114.582C103.125 110.785 106.203 107.707 110 107.707Z" fill="#047247"></path> 
				                   <path fill-rule="evenodd" clip-rule="evenodd" d="M109.523 11.457C101.287 11.4568 94.4191 11.4566 88.9669 12.1896C83.2122 12.9633 78.0165 14.6653 73.8414 18.8404C69.6662 23.0156 67.9643 28.2112 67.1905 33.966C66.4575 39.4181 66.4577 46.286 66.458 54.522V55.2345C47.9305 55.8407 36.8048 58.0056 29.0724 65.7382C18.333 76.4776 18.333 93.7627 18.333 128.332C18.333 162.901 18.333 180.187 29.0724 190.926C39.8118 201.665 57.0966 201.665 91.6662 201.665H128.333C162.902 201.665 180.188 201.665 190.927 190.926C201.666 180.187 201.666 162.901 201.666 128.332C201.666 93.7627 201.666 76.4776 190.927 65.7382C183.195 58.0056 172.069 55.8407 153.541 55.2345V54.5221C153.541 46.2862 153.542 39.4181 152.809 33.966C152.035 28.2112 150.333 23.0156 146.158 18.8404C141.983 14.6653 136.787 12.9633 131.033 12.1896C125.58 11.4566 118.713 11.4568 110.476 11.457H109.523ZM139.791 55.016V54.9987C139.791 46.1619 139.777 40.226 139.182 35.7982C138.613 31.5681 137.63 29.7577 136.435 28.5631C135.241 27.3685 133.431 26.3857 129.2 25.817C124.773 25.2217 118.836 25.207 110 25.207C101.163 25.207 95.2267 25.2217 90.7991 25.817C86.569 26.3857 84.7586 27.3685 83.5641 28.5631C82.3695 29.7577 81.3867 31.5681 80.818 35.7982C80.2226 40.226 80.208 46.1619 80.208 54.9987V55.016C83.8016 54.9987 87.6153 54.9987 91.6663 54.9987H128.333C132.384 54.9987 136.198 54.9987 139.791 55.016ZM146.666 128.332C146.666 148.582 130.25 164.999 110 164.999C89.7492 164.999 73.333 148.582 73.333 128.332C73.333 108.082 89.7492 91.6654 110 91.6654C130.25 91.6654 146.666 108.082 146.666 128.332Z" fill="#047247"></path> 
				                 </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Institutional Healthcare Facilities / Healthcare Facilities Application<br/> Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> 
										<%=medicalApp.getApplicationNumber()%>
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
									<%=medicalApp.getNatureOfApplicant()%>
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
function getMedicalSingleApplicationOverview(medicalRenderURL) {
	window.location.href = medicalRenderURL;
}
</Script>