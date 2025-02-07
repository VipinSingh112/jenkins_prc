<%@ include file="/init.jsp" %>
<%
      for (OsiApplication applications : osiApplicationList) {
		/* osiApplicationFormRenderURL.setParameter("osiApplicationId",String.valueOf(applications.getOsiApplicationId())); */
	%>

	<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									  <svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 48 48" fill="none">
												<path d="M15.706 16.0216C16.2341 16.0216 16.666 15.5896 16.666 15.0616C16.666 14.5336 16.2341 14.1016 15.706 14.1016H8.57328C8.04523 14.1016 7.61328 14.5336 7.61328 15.0616V24.1623C7.61328 24.6904 8.04523 25.1223 8.57328 25.1223H16.4164C16.3972 25.084 16.3684 25.0456 16.3396 25.0071L15.7925 24.2392C15.5717 23.9128 15.3987 23.5671 15.2741 23.2023H9.53328V16.0216H15.706Z" fill="#047247"/>
												<path d="M18.6822 17.7394L19.5269 16.9138C19.9109 16.5394 19.9205 15.9346 19.5461 15.5506C19.1813 15.1762 18.5669 15.1666 18.1926 15.5314L14.0645 19.5346L12.3653 17.8738C11.9909 17.4994 11.3765 17.509 11.0022 17.893C10.6373 18.2674 10.6469 18.8722 11.0213 19.2466L13.3926 21.5602C14.1618 22.3296 14.9971 21.2944 15.1109 21.205C15.1109 21.1666 15.1109 21.1282 15.1205 21.0898C15.3318 19.9954 15.9653 19.0354 16.9061 18.4018C17.4534 18.037 18.058 17.8162 18.6822 17.7394Z" fill="#047247"/>
												<path d="M6.34503 31.8523C5.81699 31.8523 5.38503 31.4299 5.38503 30.8923V8.32264C5.38503 7.79465 5.81699 7.36264 6.34503 7.36264H21.0811C21.6187 7.36264 22.0411 7.79465 22.0411 8.32264V18.7099C22.3098 18.9307 22.5595 19.1995 22.7707 19.4971L25.4778 23.3755C25.6315 23.2507 25.8043 23.1355 25.977 23.0299L25.9866 5.39465C25.9866 3.21549 24.2107 1.43945 22.0315 1.43945H5.40425C3.21542 1.43945 1.43945 3.21549 1.43945 5.39465V33.8395C1.43945 36.0187 3.21543 37.7947 5.40425 37.7947H19.8907C19.8331 37.6026 19.785 37.4107 19.7466 37.2091C19.3435 35.4426 19.7083 33.465 20.6587 31.8523H6.34503ZM15.0907 35.7499H12.345C11.8074 35.7499 11.385 35.3178 11.385 34.7899C11.385 34.2523 11.8074 33.8299 12.345 33.8299H15.0907C15.6187 33.8299 16.0507 34.2523 16.0507 34.7899C16.0507 35.3178 15.6187 35.7499 15.0907 35.7499Z" fill="#047247"/>
												<path d="M45.9835 36.9293L45.4843 36.1997C45.4843 36.1997 46.0891 32.2253 42.6043 27.4349L38.2651 21.2141C37.5451 20.1869 36.1435 19.8988 35.1259 20.5708C34.137 21.2429 33.8778 22.6156 34.6074 23.6332C34.3578 23.4605 33.0043 21.0701 30.8923 22.4717C29.7978 23.1917 29.5962 24.6317 30.2778 25.5917L30.0859 25.3325C28.8283 23.4988 25.8716 24.3917 25.8716 26.5901C25.8716 27.0317 26.0059 27.4732 26.2747 27.8573L25.0266 26.0812L21.1963 20.5997C20.4763 19.5725 19.0362 19.2941 17.9803 19.9949C16.9531 20.686 16.6362 22.0684 17.3659 23.1341L17.9131 23.9117C23.5843 32.0425 22.2669 30.0581 23.2699 31.6301C21.8328 32.9515 21.2363 35.1046 21.6283 36.8333C21.7531 37.4669 22.0027 38.0909 22.3867 38.6381C22.3867 38.6381 26.8891 46.6925 33.062 44.4364L33.5803 45.166C34.5978 46.6253 36.6331 46.9997 38.1308 46.0012L45.1291 41.3741C46.6266 40.3853 47.0108 38.398 45.9835 36.9293Z" fill="#047247"/>
											</svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">OSI Licence</p>
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
										class="dash-status-type-info"> <%=DraftDashboardPortletKeys.getStatusLabel(applications.getApplicationStatus())%>
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
									<a href="" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
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
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" 
						href="/group/guest/osi-application-form?osiApplicationId=<%=String.valueOf(applications.getOsiApplicationId())%>"> 
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
	