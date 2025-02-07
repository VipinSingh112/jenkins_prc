<%@page import="com.nbp.quary.application.form.service.model.QuarryApplication"%>
<%@ include file="/init.jsp" %>
<%
    for(QuarryApplication applications :applicationQuarry){ 
    	quarryApplicationRenderUrl.setParameter("quarryApplicationId",String.valueOf(applications.getQuarryApplicationId()));
%>
	<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2"> 
									<svg xmlns="http://www.w3.org/2000/svg" width="32" height="40" viewBox="0 0 220 220" fill="none">
												<path d="M98.9252 58.5217L120.308 37.1387L115.422 32.291L110.535 27.4433L94.117 43.823L77.6986 60.2027L69.7236 52.2277C65.3451 47.8491 61.5922 44.2527 61.4358 44.2527C61.2794 44.2527 58.9341 46.481 56.1979 49.1786L51.2333 54.1432L64.0947 67.0046C71.1699 74.0798 77.073 79.866 77.2294 79.866C77.464 79.9047 87.1973 70.2883 98.9252 58.5217ZM193.072 88.6823V110C193.072 112.199 191.38 113.891 189.181 113.891C186.982 113.891 185.29 112.199 185.29 110V79.0384C185.29 77.6849 185.12 76.5007 184.444 75.3165C183.26 72.4402 180.553 70.241 177.507 69.5638C176.999 69.3945 176.154 69.3945 175.646 69.3945V106.109C175.646 108.308 173.954 110 171.755 110C169.555 110 167.863 108.308 167.863 106.109V59.7506C167.863 58.7357 167.694 58.0585 167.525 57.2129C167.355 56.198 166.679 55.3515 166.171 54.3366C165.326 53.3216 164.648 52.4752 163.464 51.6295C162.619 51.1216 161.603 50.6146 160.588 50.276C160.08 50.276 159.234 50.1067 158.219 50.1067C157.712 50.1067 156.866 50.1067 156.358 50.276V1.71875H17.1152V164.141H123.535C127.088 173.954 134.871 181.736 144.853 185.458V218.281H202.885V98.3262C202.716 92.9122 198.486 88.6823 193.072 88.6823ZM144.683 131.318C142.484 131.318 140.792 129.626 140.792 127.426V92.5736C140.792 87.1595 136.562 82.9297 131.148 82.9297C125.146 82.9297 121.504 87.4087 121.504 92.6355V106.278H44.1855V114.061H121.505V125.734H44.1855V133.517H121.505V152.805C121.505 154.158 121.675 155.342 121.675 156.696H24.7284V9.50125H148.406V59.7506V127.426H148.576C148.576 129.626 146.883 131.318 144.683 131.318Z" fill="#047247"></path>
											</svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">Quarry
									Licence</p>
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
										<span class="one"> <%=dateFormatter.format(applications.getCreateDate())%></span>
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
								<!-- <a href="javascript:void(0);" class="dash-action-btns mr-2 common-yellow-bg">
									<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
					                   <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
					                </svg>
								</a> --> 
								<a href="/group/guest/quarry-application-form?quarryApplicationId=<%=String.valueOf(applications.getQuarryApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/quarry-application-form?quarryApplicationId=<%=String.valueOf(applications.getQuarryApplicationId())%>">
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