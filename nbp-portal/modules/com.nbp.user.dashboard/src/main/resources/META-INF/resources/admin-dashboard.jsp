
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="com.nbp.cannabis.application.form.services.service.CannabisApplicationsLocalServiceUtil"%>
<%@page import="com.nbp.cannabis.application.form.services.model.CannabisApplications"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%


%>
<section class="monitoring-Look">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="heading-f">
					<h1>Monitoring Quick Look</h1>
				</div>
			</div>
			<div class="col-md-4">
				<a class="edit-yellow"> Go to Business Process Managament <svg
						width="24" height="24" viewBox="0 0 24 24" fill="none"
						xmlns="http://www.w3.org/2000/svg">
                            <path
							d="M17 11H20C21.11 11 22 10.1 22 9V5C22 3.89 21.1 3 20 3H17C15.89 3 15 3.9 15 5V6H9.01V5C9.01 3.89 8.11 3 7.01 3H4C2.9 3 2 3.9 2 5V9C2 10.11 2.9 11 4 11H7C8.11 11 9 10.1 9 9V8H11V15.01C11 16.66 12.34 18 13.99 18H15V19C15 20.11 15.9 21 17 21H20C21.11 21 22 20.1 22 19V15C22 13.89 21.1 13 20 13H17C15.89 13 15 13.9 15 15V16H13.99C13.45 16 13 15.55 13 15.01V8H15V9C15 10.1 15.9 11 17 11Z"
							fill="#BA8207" />
                        </svg>
				</a>
			</div>
			<div class="col-md-2">
				<div class="heading-s">
					<a class="edit-yellow"> Monitoring <svg width="18" height="20"
							viewBox="0 0 18 20" fill="none"
							xmlns="http://www.w3.org/2000/svg">
                                <path
								d="M4 14H11V16H4V14ZM4 10H14V12H4V10ZM4 6H14V8H4V6ZM16 2H11.82C11.4 0.84 10.3 0 9 0C7.7 0 6.6 0.84 6.18 2H2C1.86 2 1.73 2.01 1.6 2.04C1.21 2.12 0.86 2.32 0.59 2.59C0.41 2.77 0.26 2.99 0.16 3.23C0.0600001 3.47 0 3.72 0 4V18C0 18.27 0.0600001 18.54 0.16 18.78C0.26 19.02 0.41 19.23 0.59 19.42C0.86 19.69 1.21 19.89 1.6 19.97C1.73 19.99 1.86 20 2 20H16C17.1 20 18 19.1 18 18V4C18 2.9 17.1 2 16 2ZM9 1.75C9.41 1.75 9.75 2.09 9.75 2.5C9.75 2.91 9.41 3.25 9 3.25C8.59 3.25 8.25 2.91 8.25 2.5C8.25 2.09 8.59 1.75 9 1.75ZM16 18H2V4H16V18Z"
								fill="#BA8207" />
                            </svg>
					</a>
				</div>
			</div>
		</div>
	</div>
</section>
<section class="five-card">
	<div class="container">
		<div class="row">
			<div class="col col1">
				<div class="one-card-one">
					<div class="plus-item">
						<svg width="40" height="32" viewBox="0 0 40 32" fill="none"
							xmlns="http://www.w3.org/2000/svg">
                                <path
								d="M36 4H20L16 0H4C1.78 0 0.02 1.78 0.02 4L0 28C0 30.22 1.78 32 4 32H36C38.22 32 40 30.22 40 28V8C40 5.78 38.22 4 36 4ZM34 20H28V26H24V20H18V16H24V10H28V16H34V20Z"
								fill="#047247" />
                            </svg>

					</div>
					<div class="some-heading-one">
						<h1>New applications</h1>
					</div>
					<div class="some-number-one">
						<h1><%= CannabisApplicationsLocalServiceUtil.getCannabisApplicationsesCount() %></h1>
					</div>
					<div class="final-line-one">
						<h1>LAST 24 HOURS</h1>
					</div>
				</div>
			</div>
			<div class="col col2">
				<div class="two-card-two">
					<div class="plus-item">
						<svg width="40" height="32" viewBox="0 0 45 42" fill="none"
							xmlns="http://www.w3.org/2000/svg">
                                <path
								d="M44.5996 21L39.7196 15.44L40.3996 8.08002L33.1796 6.44002L29.3996 0.0800171L22.5996 3.00002L15.7996 0.0800171L12.0196 6.44002L4.79961 8.06002L5.47961 15.42L0.599609 21L5.47961 26.56L4.79961 33.94L12.0196 35.58L15.7996 41.94L22.5996 39L29.3996 41.92L33.1796 35.56L40.3996 33.92L39.7196 26.56L44.5996 21ZM24.5996 31H20.5996V27H24.5996V31ZM24.5996 23H20.5996V11H24.5996V23Z"
								fill="#F6B21D" />
                            </svg>
					</div>
					<div class="some-heading">
						<h1>Pending applications</h1>
					</div>
					<div class="some-number">
						<h1><%=CannabisApplicationsLocalServiceUtil.getCannabisApplicationsByStatus(UserDashboardPortletKeys.SUBMITTED).size() %></h1>
					</div>
					<div class="final-line">
						<h1>TOTAL AMOUNT</h1>
					</div>
				</div>
			</div>
			<div class="col col3">
				<div class="three-card-three">
					<div class="plus-item">
						<svg width="40" height="32" viewBox="0 0 42 37" fill="none"
							xmlns="http://www.w3.org/2000/svg">
                                <path
								d="M2.66004 37H39.72C41.26 37 42.22 35.34 41.46 34L22.92 2C22.14 0.659995 20.22 0.659995 19.46 2L0.92004 34C0.16004 35.34 1.12004 37 2.66004 37ZM23.2 31H19.2V27H23.2V31ZM21.2 23C20.1 23 19.2 22.1 19.2 21V17C19.2 15.9 20.1 15 21.2 15C22.3 15 23.2 15.9 23.2 17V21C23.2 22.1 22.3 23 21.2 23Z"
								fill="#F6B21D" />
                            </svg>
					</div>
					<div class="some-heading">
						<h1>Blocked applications</h1>
					</div>
					<div class="some-number">
						<h1>42</h1>
					</div>
					<div class="final-line">
						<h1>TOTAL AMOUNT</h1>
					</div>
				</div>
			</div>
			<div class="col col4">
				<div class="four-card-four">
					<div class="plus-item">
						<svg width="40" height="32" viewBox="0 0 29 28" fill="none"
							xmlns="http://www.w3.org/2000/svg">
                                <path
								d="M28.8008 2.82L25.9808 0L14.8008 11.18L3.62078 0L0.800781 2.82L11.9808 14L0.800781 25.18L3.62078 28L14.8008 16.82L25.9808 28L28.8008 25.18L17.6208 14L28.8008 2.82Z"
								fill="#A7A29E" />
                            </svg>
					</div>
					<div class="some-heading">
						<h1>Failed applications</h1>
					</div>
					<div class="some-number">
						<h1>42</h1>
					</div>
					<div class="final-line">
						<h1>LAST 7 DAYS</h1>
					</div>
				</div>
			</div>
			<div class="col col5">
				<div class="five-card-five">
					<div class="plus-item">
						<svg width="40" height="32" viewBox="0 0 49 48" fill="none"
							xmlns="http://www.w3.org/2000/svg">
                                <path
								d="M30.6 38.74L32.6 42.22C30.68 43.1 28.58 43.68 26.4 43.9V39.86C27.88 39.68 29.28 39.3 30.6 38.74ZM8.54 26H4.5C4.72 28.2 5.3 30.28 6.18 32.2L9.66 30.2C9.1 28.88 8.72 27.48 8.54 26ZM30.6 9.25998L32.6 5.77998C30.68 4.89998 28.6 4.31998 26.4 4.09998V8.13998C27.88 8.31998 29.28 8.69998 30.6 9.25998ZM40.26 22H44.3C44.08 19.8 43.5 17.72 42.62 15.8L39.14 17.8C39.7 19.12 40.08 20.52 40.26 22ZM18.2 38.74L16.2 42.22C18.12 43.1 20.22 43.68 22.4 43.9V39.86C20.92 39.68 19.52 39.3 18.2 38.74ZM22.4 8.13998V4.09998C20.2 4.31998 18.12 4.89998 16.2 5.77998L18.2 9.25998C19.52 8.69998 20.92 8.31998 22.4 8.13998ZM37.12 14.34L40.6 12.32C39.34 10.58 37.8 9.03998 36.06 7.77998L34.04 11.26C35.22 12.16 36.24 13.18 37.12 14.34ZM9.66 17.8L6.18 15.8C5.3 17.72 4.72 19.8 4.5 22H8.54C8.72 20.52 9.1 19.12 9.66 17.8ZM40.26 26C40.08 27.48 39.7 28.88 39.14 30.2L42.62 32.2C43.5 30.28 44.08 28.18 44.3 26H40.26ZM34.06 36.72L36.08 40.2C37.82 38.94 39.36 37.4 40.62 35.66L37.14 33.64C36.24 34.82 35.22 35.84 34.06 36.72ZM14.74 11.28L12.74 7.77998C10.98 9.05998 9.46 10.58 8.2 12.34L11.68 14.36C12.56 13.18 13.58 12.16 14.74 11.28ZM11.68 33.66L8.2 35.66C9.46 37.4 11 38.94 12.74 40.2L14.76 36.72C13.58 35.84 12.56 34.82 11.68 33.66ZM24.4 14C23.3 14 22.4 14.9 22.4 16V23.18C22.4 24.24 22.82 25.26 23.58 26L29.58 32C30.36 32.78 31.62 32.78 32.4 32C33.18 31.22 33.18 29.96 32.4 29.18L26.4 23.18V16C26.4 14.9 25.5 14 24.4 14Z"
								fill="#A7A29E" />
                            </svg>
					</div>
					<div class="some-heading">
						<h1>Abandoned drafts</h1>
					</div>
					<div class="some-number">
						<h1>42</h1>
					</div>
					<div class="final-line">
						<h1>LAST 7 DAYS</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="private-discussion">
	<div class="container">
		<div class="row">
			<div class="col-md-9">
				<div class="heading-f">
					<h1>Private Discussions Quick Look</h1>
				</div>
			</div>
			<div class="col-md-3">
				<div class="heading-s">
					<a class="edit-yellow-two"> Private Discussions <svg width="24"
							height="24" viewBox="0 0 24 24" fill="none"
							xmlns="http://www.w3.org/2000/svg">
                                <path
								d="M18 11C18 11.67 18 12.33 18 13C19.2 13 20.76 13 22 13C22 12.33 22 11.67 22 11C20.76 11 19.2 11 18 11Z"
								fill="#BA8207" />
                                <path
								d="M16 17.61C16.96 18.32 18.21 19.26 19.2 20C19.6 19.47 20 18.93 20.4 18.4C19.41 17.66 18.16 16.72 17.2 16C16.8 16.54 16.4 17.08 16 17.61Z"
								fill="#BA8207" />
                                <path
								d="M20.4 5.6C20 5.07 19.6 4.53 19.2 4C18.21 4.74 16.96 5.68 16 6.4C16.4 6.93 16.8 7.47 17.2 8C18.16 7.28 19.41 6.35 20.4 5.6Z"
								fill="#BA8207" />
                                <path
								d="M8 9H2V15H5V19H7V15H8L13 18V6L8 9Z" fill="#BA8207" />
                                <path
								d="M15.5 12C15.5 10.67 14.92 9.47002 14 8.65002V15.34C14.92 14.53 15.5 13.33 15.5 12Z"
								fill="#BA8207" />
                            </svg>
					</a>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-9">
				<div class="private-discussion-card">
					<p class="private-card-heading">Latest Private Discussion</p>
					<div class="private-discussion-questions-card">
						<div class="upper">
							<a href="#"> 2022 Annual Reports Available 🎉 </a>
						</div>
						<div class="mid">
							<h2 class="common-para">After few weeks of refinement and
								data cleaning, we can finally announce that last year reports
								are...</h2>
						</div>
						<div class="lower">
							<div class="row">
								<div class="col-md-12 pr-0">
									<ul>
										<li class="heading-mid">Announcements › Reports</li>
										<li class="replies">12 replies</li>
										<li class="acitivity">Last activity 1 day ago</li>
										<li class="partner"><span> <svg width="15"
													height="14" viewBox="0 0 15 14" fill="none"
													xmlns="http://www.w3.org/2000/svg">
                                                        <path
														d="M14.8334 7L13.2067 5.14L13.4334 2.68L11.0267 2.13333L9.76669 0L7.50002 0.973333L5.23335 0L3.97335 2.12667L1.56669 2.66667L1.79335 5.13333L0.166687 7L1.79335 8.86L1.56669 11.3267L3.97335 11.8733L5.23335 14L7.50002 13.02L9.76669 13.9933L11.0267 11.8667L13.4334 11.32L13.2067 8.86L14.8334 7ZM6.22669 10.1467L3.69335 7.60667L4.68002 6.62L6.22669 8.17333L10.1267 4.26L11.1134 5.24667L6.22669 10.1467Z"
														fill="#BA8207"></path>
                                                    </svg>

										</span> <span> Business Facilitator Partner participating </span></li>
									</ul>
								</div>

							</div>
						</div>
					</div>
					<div class="private-discussion-questions-card">
						<div class="upper">
							<a href="#"> 2022 CLA Mandate updates: what will change </a>
						</div>
						<div class="mid">
							<h2 class="common-para">As you all now, since January 2023
								the CLA is now also responsible for the evaluation of
								economic...</h2>
						</div>
						<div class="lower">
							<div class="row">
								<div class="col-md-12 pr-0">
									<ul>
										<li class="heading-mid">Secure Approvals › Cannabis
											Licence</li>
										<li class="replies">12 replies</li>

										<li class="acitivity">Last activity 1 day ago</li>
										<li class="partner"><span> <svg width="15"
													height="14" viewBox="0 0 15 14" fill="none"
													xmlns="http://www.w3.org/2000/svg">
                                                        <path
														d="M14.8334 7L13.2067 5.14L13.4334 2.68L11.0267 2.13333L9.76669 0L7.50002 0.973333L5.23335 0L3.97335 2.12667L1.56669 2.66667L1.79335 5.13333L0.166687 7L1.79335 8.86L1.56669 11.3267L3.97335 11.8733L5.23335 14L7.50002 13.02L9.76669 13.9933L11.0267 11.8667L13.4334 11.32L13.2067 8.86L14.8334 7ZM6.22669 10.1467L3.69335 7.60667L4.68002 6.62L6.22669 8.17333L10.1267 4.26L11.1134 5.24667L6.22669 10.1467Z"
														fill="#BA8207"></path>
                                                    </svg>
										</span> <span> Business Facilitator Partner participating </span></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="private-discussion-card">
					<p class="private-card-heading">Your private Discussions</p>
					<div class="private-discussion-questions-card">
						<div class="upper">
							<a href="#"> How can I create a ne... </a>
						</div>
						<div class="lower">
							<div class="row">
								<div class="col-md-12 pr-0">
									<ul>
										<li class="replies">12 replies</li>
										<li class="acitivity">Last activity 1 day ago</li>
										<li class="partner"></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="private-discussion-questions-card">
						<div class="upper">
							<a href="#"> Good news:the new... </a>
						</div>
						<div class="lower">
							<div class="row">
								<div class="col-md-12 pr-0">
									<ul>
										<li class="replies">12 replies</li>
										<li class="acitivity">Last activity 1 day ago</li>
										<li class="partner"></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="private-discussion-questions-card border-0">
						<div class="upper">
							<a href="#"> 2022 CLA Mandate... </a>
						</div>
						<div class="lower">
							<div class="row">
								<div class="col-md-12 pr-0">
									<ul>
										<li class="replies">12 replies</li>
										<li class="acitivity">Last activity 1 day ago</li>
										<li class="partner"></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>