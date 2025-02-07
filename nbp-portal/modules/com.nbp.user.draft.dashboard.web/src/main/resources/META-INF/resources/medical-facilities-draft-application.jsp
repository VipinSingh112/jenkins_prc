<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp"%>
<%@page import="com.nbp.ogt.application.form.services.model.OgtApplication"%>
<%@ include file="/init.jsp" %>
<%
		for (MedicalFacilitiesApp applications : medicalApplicationsList) {
			/* medicalApplicationRenderUrl.setParameter("medicalApplicationId",String.valueOf(Validator.isNotNull(applications)&&Validator.isNotNull(applications.getMedicalFacilitiesAppId())?applications.getMedicalFacilitiesAppId():"")); */
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									<svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 220 220" fill="none"> 
			                           <path fill-rule="evenodd" clip-rule="evenodd" d="M110 107.707C113.797 107.707 116.875 110.785 116.875 114.582V121.457H123.75C127.547 121.457 130.625 124.535 130.625 128.332C130.625 132.129 127.547 135.207 123.75 135.207H116.875V142.082C116.875 145.879 113.797 148.957 110 148.957C106.203 148.957 103.125 145.879 103.125 142.082V135.207H96.25C92.4532 135.207 89.375 132.129 89.375 128.332C89.375 124.535 92.4532 121.457 96.25 121.457H103.125V114.582C103.125 110.785 106.203 107.707 110 107.707Z" fill="#047247"></path> 
			                           <path fill-rule="evenodd" clip-rule="evenodd" d="M109.523 11.457C101.287 11.4568 94.4191 11.4566 88.9669 12.1896C83.2122 12.9633 78.0165 14.6653 73.8414 18.8404C69.6662 23.0156 67.9643 28.2112 67.1905 33.966C66.4575 39.4181 66.4577 46.286 66.458 54.522V55.2345C47.9305 55.8407 36.8048 58.0056 29.0724 65.7382C18.333 76.4776 18.333 93.7627 18.333 128.332C18.333 162.901 18.333 180.187 29.0724 190.926C39.8118 201.665 57.0966 201.665 91.6662 201.665H128.333C162.902 201.665 180.188 201.665 190.927 190.926C201.666 180.187 201.666 162.901 201.666 128.332C201.666 93.7627 201.666 76.4776 190.927 65.7382C183.195 58.0056 172.069 55.8407 153.541 55.2345V54.5221C153.541 46.2862 153.542 39.4181 152.809 33.966C152.035 28.2112 150.333 23.0156 146.158 18.8404C141.983 14.6653 136.787 12.9633 131.033 12.1896C125.58 11.4566 118.713 11.4568 110.476 11.457H109.523ZM139.791 55.016V54.9987C139.791 46.1619 139.777 40.226 139.182 35.7982C138.613 31.5681 137.63 29.7577 136.435 28.5631C135.241 27.3685 133.431 26.3857 129.2 25.817C124.773 25.2217 118.836 25.207 110 25.207C101.163 25.207 95.2267 25.2217 90.7991 25.817C86.569 26.3857 84.7586 27.3685 83.5641 28.5631C82.3695 29.7577 81.3867 31.5681 80.818 35.7982C80.2226 40.226 80.208 46.1619 80.208 54.9987V55.016C83.8016 54.9987 87.6153 54.9987 91.6663 54.9987H128.333C132.384 54.9987 136.198 54.9987 139.791 55.016ZM146.666 128.332C146.666 148.582 130.25 164.999 110 164.999C89.7492 164.999 73.333 148.582 73.333 128.332C73.333 108.082 89.7492 91.6654 110 91.6654C130.25 91.6654 146.666 108.082 146.666 128.332Z" fill="#047247"></path> 
			                         </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Institutional Healthcare Facilities / Healthcare Facilities Application<br/>Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> <%=applications.getApplicationNumber()%>
										</span>
									</div>
								</div>
							</div>
						</div>
						<div class="right-part d-flex  justify-content-end">
							<div
								class="tier-plus-issuedate-box  justify-content-between pr-lg-5">
								<div class="single-box px-lg-5">
									<p class="upper-title">Created Date</p>
									<p class="lower-title">
										<span class="one"> 
											<%=dateFormatter.format(applications.getCreateDate())%>
										</span>
									</p>
								</div>
								<div class="single-box">
									<p class="upper-title">Last Modified Date</p>
									<p class="lower-title">
										<span class="one"> <%=dateFormatter.format(applications.getModifiedDate())%></span>
									</p>
								</div>

							</div>
							<div class="dash-status-box">
								<p class="dash-status">Status</p>
								<p class="dash-status-type">
									<span class="circle"></span> <span
										class="dash-status-type-info"> <%=DraftDashboardPortletKeys.getStatusLabel(applications.getStatus())%>
									</span>
								</p>
							</div>
							<div class="dash-action-box d-flex">
								<div class="dash-action-box d-flex">
									<!-- <a href="javascript:void(0);" class="dash-action-btns mr-2 common-yellow-bg">
										<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
						                   <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
						                </svg>
									</a>  -->
									<a href="/group/guest/medical-facilities-application-form?medicalApplicationId=<%=String.valueOf(applications.getMedicalFacilitiesAppId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
										<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg">
						                   <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path>
						                </svg>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row pt-0 px-3 pb-3">
				<div class="col-md-12">
					<div class="lower  dash-lower-multiple-links-box d-flex justify-content-end">
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/medical-facilities-application-form?medicalApplicationId=<%=String.valueOf(applications.getMedicalFacilitiesAppId())%>"> 
							Continue your Application
							<span class="ml-2"> 
								<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
				                    <path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9"></path>
				                </svg>
							</span>
						</a>
					</div>
				</div>
			</div>
		</div>
	<%
		}
	%>
