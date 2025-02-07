<%@page import="com.nbp.ncra.application.form.service.model.NcraApplication"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="org.jsoup.helper.Validate"%>
<%@ include file="/init.jsp" %>
<% 
for(NcraApplication ncraApplications : ncraApplication){ 
	ncraApplicationFormRenderUrl.setParameter("ncraApplicationId", String.valueOf(ncraApplications.getNcraApplicationId())); 
	
%>
	<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 220 220" fill="none"> 
					                   <path d="M164.667 157.737H55.3333C51.7087 157.737 48.2325 159.173 45.6695 161.729C43.1065 164.286 41.6667 167.753 41.6667 171.368C41.6667 174.984 43.1065 178.451 45.6695 181.007C48.2325 183.564 51.7087 185 55.3333 185H164.667C168.291 185 171.767 183.564 174.33 181.007C176.893 178.451 178.333 174.984 178.333 171.368C178.333 167.753 176.893 164.286 174.33 161.729C171.767 159.173 168.291 157.737 164.667 157.737ZM178.333 69.1311C174.709 69.1311 171.233 70.5673 168.67 73.1237C166.107 75.6802 164.667 79.1474 164.667 82.7628C164.668 83.6992 164.764 84.6332 164.954 85.5504L140.135 100.416L119.218 58.6893C121.251 56.8346 122.674 54.4106 123.301 51.735C123.928 49.0595 123.73 46.2574 122.733 43.6961C121.735 41.1348 119.985 38.934 117.712 37.3822C115.438 35.8304 112.748 35 109.993 35C107.238 35 104.548 35.8304 102.275 37.3822C100.001 38.934 98.2512 41.1348 97.2538 43.6961C96.2564 46.2574 96.0582 49.0595 96.6854 51.735C97.3125 54.4106 98.7357 56.8346 100.768 58.6893L79.865 100.416L55.0463 85.5504C55.2358 84.6332 55.332 83.6992 55.3333 82.7628C55.3333 80.0667 54.5318 77.4311 53.0301 75.1894C51.5284 72.9477 49.3939 71.2005 46.8967 70.1688C44.3994 69.137 41.6515 68.8671 39.0004 69.3931C36.3494 69.919 33.9142 71.2173 32.0029 73.1237C30.0916 75.0302 28.7899 77.4591 28.2626 80.1034C27.7353 82.7476 28.0059 85.4885 29.0403 87.9794C30.0747 90.4702 31.8264 92.5992 34.0739 94.097C36.3214 95.5949 38.9637 96.3944 41.6667 96.3944C41.9195 96.3944 42.1518 96.333 42.3978 96.3194L47.68 144.105H172.32L177.602 96.3194C177.848 96.3194 178.081 96.3944 178.333 96.3944C181.958 96.3944 185.434 94.9582 187.997 92.4018C190.56 89.8453 192 86.3781 192 82.7628C192 79.1474 190.56 75.6802 187.997 73.1237C185.434 70.5673 181.958 69.1311 178.333 69.1311Z" fill="#047247"></path> 
					                </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">NCRA(VERIFICATION OF SCALES AND PETROL)</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> <%=Validator.isNotNull(ncraApplications)&&Validator.isNotNull(ncraApplications.getApplicationNumber())?ncraApplications.getApplicationNumber():""%>
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
										<span class="one"> <%=Validator.isNotNull(ncraApplications)&&Validator.isNotNull(ncraApplications.getCreateDate())?dateFormatter.format(ncraApplications.getCreateDate()):""%></span>
									</p>
								</div>
								<div class="single-box">
									<p class="upper-title">Last Modified Date</p>
									<p class="lower-title">
										<span class="one"> <%=Validator.isNotNull(ncraApplications)&&Validator.isNotNull(ncraApplications.getModifiedDate())?dateFormatter.format(ncraApplications.getModifiedDate()):""%></span>
									</p>
								</div>

							</div>
							<div class="dash-status-box">
								<p class="dash-status">Status</p>
								<p class="dash-status-type">
									<span class="circle"></span> <span
										class="dash-status-type-info">Draft
									</span>
								</p>
							</div>
							<div class="dash-action-box d-flex">
								<a href="/group/guest/ncra-application-form?ncraApplicationId=<%=String.valueOf(ncraApplications.getNcraApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
									<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg">
					                   <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path>
					                </svg>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row pt-0 px-3 pb-3">
				<div class="col-md-12">
					<div class="lower dash-lower-multiple-links-box d-flex justify-content-end">
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/ncra-application-form?ncraApplicationId=<%=String.valueOf(ncraApplications.getNcraApplicationId())%>">
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