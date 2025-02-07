<%@page import="com.nbp.jtb.application.form.service.model.JTBApplication"%>
<%@ include file="/init.jsp" %>
<%
		for (JTBApplication applications : jtbDraftApplicationsList) {
			 jtbApplicationRenderUrl.setParameter("jtbApplicationId",String.valueOf(applications.getJtbApplicationId()));
	%>
		<div class="second-card dash-common-card draft-card">
			<div class="row pt-3 px-3 pb-0">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card">
						<div class="d-flex ">
							<div class="icon">
								<span class="mr-2">
									 <svg width="32" height="40" viewBox="0 0 220 220"
										fill="none" xmlns="http://www.w3.org/2000/svg">
		                                             <path
										d="M16.3281 55.9883V66.2148C21.0117 66.2148 24.793 69.9961 24.793 74.6797C24.793 79.3633 21.0117 83.1445 16.3281 83.1445V89.8047C21.0117 89.8047 24.793 93.5859 24.793 98.2695C24.793 102.953 21.0117 106.734 16.3281 106.734V113.395C21.0117 113.395 24.793 117.176 24.793 121.859C24.793 126.543 21.0117 130.324 16.3281 130.324V136.984C21.0117 136.984 24.793 140.766 24.793 145.449C24.793 150.133 21.0117 153.914 16.3281 153.914V164.141H203.672V55.9883H16.3281ZM78.2031 147.812H46.2773C44.6016 147.812 43.2695 146.48 43.2695 144.805C43.2695 143.129 44.6016 141.797 46.2773 141.797H78.2031C79.8789 141.797 81.2109 143.129 81.2109 144.805C81.2109 146.48 79.8789 147.812 78.2031 147.812ZM78.2031 124.609H46.2773C44.6016 124.609 43.2695 123.277 43.2695 121.602C43.2695 119.926 44.6016 118.594 46.2773 118.594H78.2031C79.8789 118.594 81.2109 119.926 81.2109 121.602C81.2109 123.277 79.8789 124.609 78.2031 124.609ZM78.2031 101.406H46.2773C44.6016 101.406 43.2695 100.074 43.2695 98.3984C43.2695 96.7227 44.6016 95.3906 46.2773 95.3906H78.2031C79.8789 95.3906 81.2109 96.7227 81.2109 98.3984C81.2109 100.074 79.8789 101.406 78.2031 101.406ZM78.2031 78.2031H46.2773C44.6016 78.2031 43.2695 76.8711 43.2695 75.1953C43.2695 73.5195 44.6016 72.1875 46.2773 72.1875H78.2031C79.8789 72.1875 81.2109 73.5195 81.2109 75.1953C81.2109 76.8711 79.8789 78.2031 78.2031 78.2031ZM101.836 152.109C101.836 153.785 100.504 155.117 98.8281 155.117C97.1523 155.117 95.8203 153.785 95.8203 152.109V137.543C95.8203 135.867 97.1523 134.535 98.8281 134.535C100.504 134.535 101.836 135.867 101.836 137.543V152.109ZM101.836 128.906C101.836 130.582 100.504 131.914 98.8281 131.914C97.1523 131.914 95.8203 130.582 95.8203 128.906V114.34C95.8203 112.664 97.1523 111.332 98.8281 111.332C100.504 111.332 101.836 112.664 101.836 114.34V128.906ZM101.836 105.66C101.836 107.336 100.504 108.668 98.8281 108.668C97.1523 108.668 95.8203 107.336 95.8203 105.66V91.0937C95.8203 89.418 97.1523 88.0859 98.8281 88.0859C100.504 88.0859 101.836 89.418 101.836 91.0937V105.66ZM101.836 82.457C101.836 84.1328 100.504 85.4648 98.8281 85.4648C97.1523 85.4648 95.8203 84.1328 95.8203 82.457V67.8906C95.8203 66.2148 97.1523 64.8828 98.8281 64.8828C100.504 64.8828 101.836 66.2148 101.836 67.8906V82.457ZM187.387 80.6523L186.57 89.2461C186.398 90.9219 185.582 92.5117 184.25 93.5859L175.613 100.719L187.215 130.496L181.113 136.598L158.984 114.469L147.898 123.621L153.527 143.344L150.477 146.395L136.082 132C134.191 132.215 132.215 131.613 130.797 130.152C129.336 128.734 128.734 126.758 128.949 124.867L114.555 110.473L117.605 107.422L137.328 113.051L146.48 101.965L124.352 79.8359L130.453 73.7344L160.23 85.3359L167.363 76.7422C168.438 75.4102 170.027 74.5938 171.703 74.4648L180.297 73.6484C184.379 73.2617 187.73 76.6133 187.387 80.6523Z"
										fill="#047247" />
	                                </svg>
								</span>
							</div>
							<div class="left-part">
								<p class="dash-card-licence-heading mb-2">TPDCo<br/>Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"><%=applications.getApplicationNumber()%>
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
									<%if(applications.getTypeOfApplication().equals("Accommodations Licence")){%>
									<a href="/group/guest/tpdco-accommodation-application-form?jtbApplicationId=<%=String.valueOf(applications.getJtbApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
										<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg">
						                   <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path>
						                </svg>
									</a>
									<%}else if(applications.getTypeOfApplication().equals("Attractions")||applications.getTypeOfApplication().equals("Other Tourism Related Licences")){ %>
									<a href="/group/guest/tpdco-attraction-application-form?jtbApplicationId=<%=String.valueOf(applications.getJtbApplicationId())%>" class="dash-action-btns common-yellow-bg"  data-toggle="tooltip" title="Continue your Application"> 
										<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg">
						                   <path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path>
						                </svg>
									</a><%}%>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row pt-0 px-3 pb-3">
				<div class="col-md-12">
					<div class="lower  dash-lower-multiple-links-box d-flex justify-content-end">
					<%if(applications.getTypeOfApplication().equals("Accommodations Licence")){%>
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/tpdco-accommodation-application-form?jtbApplicationId=<%=String.valueOf(applications.getJtbApplicationId())%>"> 
							Continue your Application
							<span class="ml-2"> 
								<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
				                    <path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9"></path>
				                </svg>
							</span>
						</a>
						<%}else if(applications.getTypeOfApplication().equals("Attractions")||applications.getTypeOfApplication().equals("Other Tourism Related Licences")){ %>
						<a class="dash-yellow-repeated-link light-grey dashboard-progress-repeated-grey-btn with-greeb-bg" data-senna-off="true" href="/group/guest/tpdco-attraction-application-form?jtbApplicationId=<%=String.valueOf(applications.getJtbApplicationId())%>"> 
							Continue your Application
							<span class="ml-2"> 
								<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
				                    <path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9"></path>
				                </svg>
							</span>
						</a>
						<%}%>
					</div>
				</div>
			</div>
		</div>
	<%
		}
	%>
