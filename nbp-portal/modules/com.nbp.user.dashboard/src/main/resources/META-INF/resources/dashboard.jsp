<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page
	import="com.nbp.cannabis.application.form.services.service.CannabisApplicationsLocalServiceUtil"%>
<%@page
	import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page
	import="com.nbp.cannabis.application.form.services.model.CannabisApplications"%>
<%@page import="java.util.List"%>
<portlet:resourceURL var="documentProgressUrl"></portlet:resourceURL>
<%
	Format dateFormatter = new SimpleDateFormat("dd/MM/yyy");
	List<CannabisApplications> cannabisApplicationsList = CannabisApplicationsLocalServiceUtil
			.getCannabisApplicationsByUser(themeDisplay.getUserId());
%>
<section class="dashboard-update-area section-padding"
	id="dashboardMain">
	<div class="container">
		<div class="row">
			<div class="col-lg-7">
				<div class="dashboard-update-wrapper">
					<div class="row">
						<div class="col-md-12">
							<div
								class="first-card- d-flex justify-content-between align-items-center">
								<div class="left">
									<h1 class="dashboard-heading common-heading">Dashboard
										Updates</h1>
								</div>
								<div class="right">
									<a class="dash-yellow-repeated-link"
										onclick="showDashboardProgress()" href="javascript:void(0);">
										See all your applications<span class="ml-2"> <svg
												width="25" height="24" viewBox="0 0 25 24" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                    <path
													d="M21.5 8C20.05 8 19.24 9.44 19.57 10.51L16.02 14.07C15.72 13.98 15.28 13.98 14.98 14.07L12.43 11.52C12.77 10.45 11.96 9 10.5 9C9.05 9 8.23 10.44 8.57 11.52L4.01 16.07C2.94 15.74 1.5 16.55 1.5 18C1.5 19.1 2.4 20 3.5 20C4.95 20 5.76 18.56 5.43 17.49L9.98 12.93C10.28 13.02 10.72 13.02 11.02 12.93L13.57 15.48C13.23 16.55 14.04 18 15.5 18C16.95 18 17.77 16.56 17.43 15.48L20.99 11.93C22.06 12.26 23.5 11.45 23.5 10C23.5 8.9 22.6 8 21.5 8Z"
													fill="#BA8207" />
                                                    <path
													d="M15.5 9L16.44 6.93L18.5 6L16.44 5.07L15.5 3L14.58 5.07L12.5 6L14.58 6.93L15.5 9Z"
													fill="#BA8207" />
                                                    <path
													d="M4 11L4.5 9L6.5 8.5L4.5 8L4 6L3.5 8L1.5 8.5L3.5 9L4 11Z"
													fill="#323232" />
                                                </svg>
									</span>
									</a>
								</div>
							</div>
						</div>
						<%
							for (CannabisApplications applications : cannabisApplicationsList) {
						%>
						<div class="col-md-12">
							<div class="second-card dash-common-card">
								<div class="row p-3">
									<div class="col-md-1">
										<div class="icon">
											<span> <svg width="33" height="40" viewBox="0 0 33 40"
													fill="none" xmlns="http://www.w3.org/2000/svg">
                                                        <path
														d="M17.5 40V30.7C18.5 32.26 20.5 34.18 24.44 35.62C24.44 35.62 23.44 32.2 20.62 29.9C23.22 30.46 27.14 30.38 32.5 28C32.5 28 27.56 25.18 21.94 25.94C25.12 24 29.1 20.16 32.16 12.22C32.16 12.22 23.16 14.68 18.68 22.28C22.74 12.48 16.5 0 16.5 0C11.64 10.94 12.68 18.2 14.26 22.2C9.76 14.66 0.84 12.22 0.84 12.22C3.9 20.16 7.88 24 11.06 25.94C5.44 25.18 0.5 28 0.5 28C5.86 30.38 9.78 30.46 12.38 29.9C9.56 32.2 8.56 35.62 8.56 35.62C12.5 34.18 14.5 32.26 15.5 30.7V40H17.5Z"
														fill="#047247" />
                                                    </svg>
											</span>
										</div>
									</div>
									<div class="col-md-11">
										<div class="row">
											<div class="col-md-12">
												<div class="upper d-flex justify-content-between">
													<div class="left-part">
														<p class="dash-card-licence-heading mb-2">Cannabis Application Transaction Number</p>
														<div class="dash-conditional-box">
															<div class="dash-conditional-box-left">
																<span class="dash-card-number-heading"> <%=applications.getApplicationNumber()%>
																</span>
															</div>
														</div>
													</div>
													<div class="right-part d-flex">
														<div class="dash-status-box">
															<p class="dash-status">Status</p>
															<p class="dash-status-type">
																<span class="circle"></span> <span
																	class="dash-status-type-info"> <%=UserDashboardPortletKeys.getStatusLabel(applications.getStatus())%>
																</span>
															</p>
														</div>
														<div class="dash-action-box d-flex">
															<a href="#" class="dash-action-btns mr-2"> <svg
																	width="15" height="17" viewBox="0 0 15 17" fill="none"
																	xmlns="http://www.w3.org/2000/svg">
                                                                        <path
																		d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z"
																		fill="#1B1917" />
                                                                        </svg>

															</a> <a href="javascript:void(0);" class="dash-action-btns"
																onclick="showDashboardProgress()"> <svg width="23"
																	height="16" viewBox="0 0 23 16" fill="none"
																	xmlns="http://www.w3.org/2000/svg">
                                                                        <path
																		d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z"
																		fill="#1B1917" />
                                                                        </svg>
															</a>
														</div>
													</div>
												</div>
											</div>
											<div class="col-md-12">
												<div
													class="lower d-flex justify-content-between dash-lower-multiple-links-box">
													<a class="dash-yellow-repeated-link"> Overview </a> <a
														class="dash-yellow-repeated-link"> Transaction History
													</a> <a class="dash-yellow-repeated-link"> Conditional
														Licence </a> <a class="dash-yellow-repeated-link light-grey">
														Discussion and Support<span class="ml-2"> <svg
																width="21" height="20" viewBox="0 0 21 20" fill="none"
																xmlns="http://www.w3.org/2000/svg">
                                                                    <path
																	d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z"
																	fill="#282524" />
                                                                    </svg>
													</span>
													</a>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<%
							}
						%>
					</div>
				</div>
			</div>
			<div class="col-lg-5">
				<div class="dashboard-community-update-wrapper">
					<div class="row">
						<div class="col-md-12">
							<div
								class="first-card- d-flex justify-content-between align-items-center">
								<div class="left">
									<h1 class="dashboard-heading common-heading">Community
										Updates</h1>
								</div>
								<div class="right">
									<a href="#" class="dash-community-link"> Community<span
										class="ml-2"> <svg width="25" height="24"
												viewBox="0 0 25 24" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M18.5 11C18.5 11.67 18.5 12.33 18.5 13C19.7 13 21.26 13 22.5 13C22.5 12.33 22.5 11.67 22.5 11C21.26 11 19.7 11 18.5 11Z"
													fill="#047247" />
                                                <path
													d="M16.5 17.61C17.46 18.32 18.71 19.26 19.7 20C20.1 19.47 20.5 18.93 20.9 18.4C19.91 17.66 18.66 16.72 17.7 16C17.3 16.54 16.9 17.08 16.5 17.61Z"
													fill="#047247" />
                                                <path
													d="M20.9 5.6C20.5 5.07 20.1 4.53 19.7 4C18.71 4.74 17.46 5.68 16.5 6.4C16.9 6.93 17.3 7.47 17.7 8C18.66 7.28 19.91 6.35 20.9 5.6Z"
													fill="#047247" />
                                                <path
													d="M8.5 9H2.5V15H5.5V19H7.5V15H8.5L13.5 18V6L8.5 9Z"
													fill="#047247" />
                                                <path
													d="M16 12C16 10.67 15.42 9.47002 14.5 8.65002V15.34C15.42 14.53 16 13.33 16 12Z"
													fill="#047247" />
                                                </svg>

									</span>
									</a>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="private-discussion-card">
								<p class="private-card-heading">Your private Discussions</p>
								<div class="private-discussion-questions-card">
									<div class="upper">
										<a href="#"> How can I create a new dashboard </a>
									</div>
									<div class="lower">
										<div class="row">
											<div class="col-md-12 pr-0">
												<ul>
													<li class="replies">12 replies</li>
													<li class="acitivity">Last activity 1 day ago</li>
													<li class="partner"><span> <svg width="15"
																height="14" viewBox="0 0 15 14" fill="none"
																xmlns="http://www.w3.org/2000/svg">
                                                                   <path
																	d="M14.8334 7L13.2067 5.14L13.4334 2.68L11.0267 2.13333L9.76669 0L7.50002 0.973333L5.23335 0L3.97335 2.12667L1.56669 2.66667L1.79335 5.13333L0.166687 7L1.79335 8.86L1.56669 11.3267L3.97335 11.8733L5.23335 14L7.50002 13.02L9.76669 13.9933L11.0267 11.8667L13.4334 11.32L13.2067 8.86L14.8334 7ZM6.22669 10.1467L3.69335 7.60667L4.68002 6.62L6.22669 8.17333L10.1267 4.26L11.1134 5.24667L6.22669 10.1467Z"
																	fill="#BA8207" />
                                                                   </svg>

													</span> <span> Business Facilitator Partner </span></li>
												</ul>
											</div>

										</div>
									</div>
								</div>
								<div class="private-discussion-questions-card">
									<div class="upper">
										<a href="#"> Good news:the new process is </a>
									</div>
									<div class="lower">
										<div class="row">
											<div class="col-md-12 pr-0">
												<ul>
													<li class="replies">12 replies</li>
													<li class="acitivity">Last activity 1 day ago</li>
													<li class="partner"><span> <svg width="15"
																height="14" viewBox="0 0 15 14" fill="none"
																xmlns="http://www.w3.org/2000/svg">
                                                                  <path
																	d="M14.8334 7L13.2067 5.14L13.4334 2.68L11.0267 2.13333L9.76669 0L7.50002 0.973333L5.23335 0L3.97335 2.12667L1.56669 2.66667L1.79335 5.13333L0.166687 7L1.79335 8.86L1.56669 11.3267L3.97335 11.8733L5.23335 14L7.50002 13.02L9.76669 13.9933L11.0267 11.8667L13.4334 11.32L13.2067 8.86L14.8334 7ZM6.22669 10.1467L3.69335 7.60667L4.68002 6.62L6.22669 8.17333L10.1267 4.26L11.1134 5.24667L6.22669 10.1467Z"
																	fill="#BA8207" />
                                                                  </svg>

													</span> <span> Business Facilitator Partner </span></li>
												</ul>
											</div>

										</div>
									</div>
								</div>
								<div class="private-discussion-questions-card border-0">
									<div class="upper">
										<a href="#"> 2022 CLA Mandate changes </a>
									</div>
									<div class="lower">
										<div class="row">
											<div class="col-md-12 pr-0">
												<ul>
													<li class="replies">12 replies</li>
													<li class="acitivity">Last activity 1 day ago</li>
													<li class="partner"><span> <svg width="15"
																height="14" viewBox="0 0 15 14" fill="none"
																xmlns="http://www.w3.org/2000/svg">
                                                                  <path
																	d="M14.8334 7L13.2067 5.14L13.4334 2.68L11.0267 2.13333L9.76669 0L7.50002 0.973333L5.23335 0L3.97335 2.12667L1.56669 2.66667L1.79335 5.13333L0.166687 7L1.79335 8.86L1.56669 11.3267L3.97335 11.8733L5.23335 14L7.50002 13.02L9.76669 13.9933L11.0267 11.8667L13.4334 11.32L13.2067 8.86L14.8334 7ZM6.22669 10.1467L3.69335 7.60667L4.68002 6.62L6.22669 8.17333L10.1267 4.26L11.1134 5.24667L6.22669 10.1467Z"
																	fill="#BA8207" />
                                                                  </svg>

													</span> <span> Business Facilitator Partner </span></li>
												</ul>
											</div>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<div id="dashboardProgress" style="display: none;"></div>
<script>
	function showDashboardProgress() {
		$.ajax({
			type : "POST",
			url : '${documentProgressUrl}',
			data : {
				"<portlet:namespace/>view" : 'dashboard-progress',
			},
			success : function(data) {
				$("#dashboardMain").hide();
				$("#dashboardProgress").html(data);
				$("#dashboardProgress").show();
			},
			error : function(data) {

			}
		});
	}
</script>