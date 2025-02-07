<%@page import="com.nbp.jadsc.application.form.service.model.JADSCApplication"%>
<%@ include file="/init.jsp" %>
<%
		for (JADSCApplication applications : jadscDraftApplicationsList) {
			/* jadscApplicationRenderUrl.setParameter("jadscApplicationId",String.valueOf(applications.getJadscApplicationId())); */
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									 <svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 220 239" fill="none"> 
			                             <path d="M101.241 3.97184C96.1479 6.31443 89.8331 13.4441 89.0183 18.0274C87.1849 27.7033 91.4627 37.0737 99.8146 41.5552C103.583 43.4904 105.518 43.8978 110.611 43.5922C118.861 43.0829 124.259 39.62 127.824 32.5922C136.685 15.1755 118.861 -3.97261 101.241 3.97184Z" fill="#047247"></path> 
			                             <path d="M71.5001 51.5359C65.6945 54.3877 62.3334 58.1562 59.176 65.184C57.3427 69.2581 57.0371 71.9062 57.0371 87.2859V104.906H66.2038H75.2686L75.5741 91.36L75.8797 77.9155H78.426H80.9723L81.2779 91.36L81.5834 104.906H109.491H137.5V92.3785C137.5 79.2396 138.111 76.9988 141.167 77.61C142.898 77.9155 143.102 79.1377 143.407 91.4618L143.713 104.906H152.778H161.945V88.3044C161.945 79.2396 161.435 70.0729 160.926 68.0359C159.093 61.6192 153.593 54.7951 147.685 51.7396L142.389 48.8877H109.593H76.7964L71.5001 51.5359Z" fill="#047247"></path> 
			                             <path d="M2.03711 122.223V134.445H12.7316H23.426V185.371V236.297H109.491H195.556V185.371V134.445H206.759H217.963V122.223V110.001H110H2.03711V122.223ZM120.898 136.991C146.056 144.426 158.482 172.028 147.074 195.352C143.306 202.991 135.769 210.325 127.62 214.195C121.204 217.251 119.982 217.454 109.898 217.454C99.3056 217.454 98.8982 217.352 91.0556 213.38C81.7871 208.695 74.7593 200.954 71.0927 191.482C68.2408 184.047 68.0371 170.806 70.6853 163.167C72.5186 157.769 78.8334 148.806 83.4167 145.139C94.1112 136.482 108.676 133.325 120.898 136.991Z" fill="#047247"></path> 
			                             <path d="M77.2618 186.277C77.3711 186.69 77.5613 187.077 77.8213 187.416C78.0813 187.755 78.4061 188.038 78.7766 188.25L84.9821 191.839V198.987C84.9821 199.849 85.3246 200.675 85.9342 201.285C86.5438 201.894 87.3706 202.237 88.2328 202.237H95.3809L98.9696 208.445C99.4019 209.19 100.112 209.734 100.944 209.957C101.776 210.18 102.663 210.064 103.41 209.635L109.616 206.05L115.824 209.638C116.571 210.067 117.458 210.183 118.29 209.96C119.122 209.737 119.832 209.194 120.265 208.448L123.85 202.243H130.998C131.86 202.243 132.687 201.901 133.297 201.291C133.906 200.682 134.249 199.855 134.249 198.993V191.845L140.454 188.257C140.824 188.044 141.149 187.76 141.409 187.421C141.669 187.083 141.86 186.696 141.97 186.284C142.081 185.871 142.109 185.441 142.053 185.018C141.997 184.595 141.858 184.186 141.644 183.817L138.059 177.609L141.647 171.404C142.078 170.657 142.195 169.77 141.972 168.937C141.749 168.105 141.204 167.395 140.458 166.964L134.252 163.375V156.228C134.252 155.366 133.91 154.539 133.3 153.929C132.69 153.32 131.864 152.977 131.002 152.977H123.853L120.268 146.772C119.836 146.027 119.127 145.482 118.295 145.257C117.882 145.146 117.452 145.117 117.029 145.173C116.605 145.229 116.197 145.368 115.828 145.583L109.616 149.168L103.41 145.579C103.041 145.365 102.633 145.225 102.21 145.169C101.786 145.113 101.356 145.14 100.943 145.251C100.531 145.361 100.144 145.551 99.8055 145.811C99.4668 146.071 99.1827 146.396 98.9696 146.766L95.3809 152.974H88.2328C87.3706 152.974 86.5438 153.316 85.9342 153.926C85.3246 154.536 84.9821 155.362 84.9821 156.224V163.372L78.7766 166.964C78.0312 167.396 77.4877 168.106 77.2653 168.938C77.0429 169.771 77.1597 170.657 77.5901 171.404L81.1756 177.609L77.5869 183.814C77.1575 184.56 77.0406 185.446 77.2618 186.277Z" fill="#047247"></path> 
			                             <path d="M98 179.282L105.115 186L121 171" stroke="white" stroke-width="5" stroke-linecap="round" stroke-linejoin="round"></path> 
			                             <path d="M109.5 197C120.27 197 129 188.27 129 177.5C129 166.73 120.27 158 109.5 158C98.7304 158 90 166.73 90 177.5C90 188.27 98.7304 197 109.5 197Z" stroke="white" stroke-width="5"></path> 
                                     </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">ADSC Application<br/>Transaction Number</p>
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
									<a href="/group/guest/adsc-application-from?jadscApplicationId=<%=String.valueOf(applications.getJadscApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/adsc-application-from?jadscApplicationId=<%=String.valueOf(applications.getJadscApplicationId())%>"> 
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
