<%@page import="com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.stage.services.service.JTBLicenceCertificateLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JTBApplication"%>
<%@page import="com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@include file="/init.jsp"%>
<%
	List<JTBLicenceCertificate> jtbLicenceCerti=null;
	JTBApplication jtbAppli=null;
	try{
		
		if(superAdmin){
			jtbLicenceCerti=JTBLicenceCertificateLocalServiceUtil.getJTBLicenceCertificates(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}else{
			try{
				jtbApplicationData = JTBApplicationLocalServiceUtil.getJTBApplicationList_By_S_UId(themeDisplay.getUserId(), UserDashboardPortletKeys.SUBMITTED);
			}catch(Exception e){
				e.printStackTrace();
			}
			}
	}catch(Exception e){
	}
	if(superAdmin&&Validator.isNotNull(jtbLicenceCerti)){
	for(JTBLicenceCertificate jtbLicence:jtbLicenceCerti){
		if (jtbLicence.getExpirationDate() != null && 
				jtbLicence.getExpirationDate().compareTo(new Date()) <= 0) {
	try{
		jtbAppli=JTBApplicationLocalServiceUtil.getJTB_ByCaseId(jtbLicence.getCaseId());
	}catch(Exception e){
	}
	String jtbDashboardUrl =null;
	try{
		jtbDashboardUrl = PortalUtil.getPortalURL(request)+"/group/guest"+"/jtb-dashboard?jtbApplicationId="
				+jtbAppli.getJtbApplicationId()+"&_com_nbp_jtb_dashboard_web_jtbDashboardPortlet__stageTab=licence-issuance-tab"
						+"&_com_nbp_jtb_dashboard_web_jtbDashboardPortlet_stageName=licence-issuance";
	}catch(Exception e){
		e.printStackTrace();
	}
	if(jtbAppli!=null&&jtbAppli.getApplicationNumber()!=null){
	%>
			<div class="second-card dash-common-card">
			<div class="row p-3">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card row cursor-pointer" onclick="getJTBSingleApplicationOverview('<%=jtbDashboardUrl%>')">
						<div class="d-flex col-lg-3">
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
								<p class="dash-card-licence-heading mb-2">TPDCo<br/> Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> 
										<%=Validator.isNotNull(jtbAppli)&&Validator.isNotNull(jtbAppli.getApplicationNumber())?jtbAppli.getApplicationNumber():""%>
										</span>
									</div>
								</div>
							</div>
						</div>
						<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Category/Sub Category</p>
							<p class="lower-title"><span class="one"><%=jtbAppli.getTypeOfApplication()%></span>/
							<%if(jtbAppli.getTypeOfApplication().equals("Attractions")){%>
							<span class="one"><%=jtbAppli.getAttractionCategoryTypeVal() %></span><%}
							else if(jtbAppli.getTypeOfApplication().equals("Accommodations Licence")){ %>
							<span class="one"><%=jtbAppli.getCategoryTypeValAccomo() %></span><%}
							else if(jtbAppli.getTypeOfApplication().equals("Other Tourism Related Licences")){ %>
							<span class="one"><%=jtbAppli.getOtherCategories() %></span><%}%></p>
						</div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title">	<span class="one"> </span> </p></div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title"><span class="one"> </span> </p></div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title"><span class="one"> </span> </p></div>
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
	for(JTBApplication jtbCertificate:jtbApplicationData){
		JTBLicenceCertificate jtbLicenceCertificateData=null;
		try{
			jtbLicenceCertificateData=	JTBLicenceCertificateLocalServiceUtil.getJtbLicenceCertiBy_CI(jtbCertificate.getCaseId());
		}catch(Exception e){}
		if (jtbLicenceCertificateData!=null && jtbLicenceCertificateData.getExpirationDate() != null && 
				jtbLicenceCertificateData.getExpirationDate().compareTo(new Date()) <= 0) {
	
			String jtbDashboardUrl =null;
			try{
				jtbDashboardUrl = PortalUtil.getPortalURL(request)+"/group/guest"+"/jtb-dashboard?jtbApplicationId="
						+jtbCertificate.getJtbApplicationId()+"&_com_nbp_jtb_dashboard_web_jtbDashboardPortlet__stageTab=licence-issuance-tab"
								+"&_com_nbp_jtb_dashboard_web_jtbDashboardPortlet_stageName=licence-issuance";
			}catch(Exception e){
				e.printStackTrace();
			}
			%>
			<div class="second-card dash-common-card">
			<div class="row p-3">
				<div class="col-md-12">
					<div class="progress-plus-wizard-card row cursor-pointer" onclick="getJTBSingleApplicationOverview('<%=jtbDashboardUrl%>')">
						<div class="d-flex col-lg-3">
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
								<p class="dash-card-licence-heading mb-2">TPDCo<br/> Transaction Number</p>
								<div class="dash-conditional-box">
									<div class="dash-conditional-box-left">
										<span class="dash-card-number-heading"> 
										<%=jtbCertificate.getApplicationNumber()%>
										</span>
									</div>
								</div>
							</div>
						</div>
						<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Category/Sub Category</p>
							<p class="lower-title"><span class="one"><%=jtbCertificate.getTypeOfApplication()%></span>
							<%if(jtbCertificate.getTypeOfApplication().equals("Attractions")){%>
							<span class="one"><%=jtbCertificate.getAttractionCategoryTypeVal() %></span><%}
							else if(jtbCertificate.getTypeOfApplication().equals("Accommodations Licence")){ %>
							<span class="one"><%=jtbCertificate.getCategoryTypeValAccomo() %></span><%}
							else if(jtbCertificate.getTypeOfApplication().equals("Other Tourism Related Licences")){ %>
							<span class="one"><%=jtbCertificate.getOtherCategories() %></span><%}%></p>
						</div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title">	<span class="one"> </span> </p></div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title"><span class="one"> </span> </p></div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title"><span class="one"> </span> </p></div>
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
function getJTBSingleApplicationOverview(jtbRenderUrl) {
	window.location.href = jtbRenderUrl;
}
		
</Script>