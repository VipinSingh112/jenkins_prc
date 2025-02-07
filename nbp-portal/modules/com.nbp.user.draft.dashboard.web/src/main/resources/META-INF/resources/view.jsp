<%@page import="com.nbp.user.draft.dashboard.web.constants.DraftDashboardPortletKeys"%>
<%@ include file="/init.jsp"%>
<link href="<%=themeDisplay.getPathThemeCss()%>/vendors/select2.min.css" rel="stylesheet" />
<script type="text/javascript" data-senna-track="permanent" src="<%=themeDisplay.getPathThemeJavaScript()%>/plugins/select2.min.js"></script>
<section class="wizard-section dashboard-progress">
		<div class="row">
			<!-- <div class="col-md-12">
				<p class="dash-common-card-heading my-3">Draft Applications</p>
			</div> -->
			<!-- Accordion For Progress Cases -->
			<div class="col-md-12">
				<div class="accordion secured-accordian" id="draftCasesBox">
					<div class="row accordion__header is-active" id="draftCasesHeader" onclick="expandDetails(this.id)" >
						<div class="col-md-12">
							<div class="d-flex align-items-center justify-content-between">
								<div>
									<p class="dash-common-card-heading my-3">Draft Applications</p>
								</div>
								<div>
									<span class="accordion__toggle"></span>
								</div>
							</div>
						</div>
						<div>
							<p class="accordian-employee mb-0 common-para"></p>
						</div>
					</div>
	
					<div class="accordion__body is-active">
						<div class="row">
							<div class="col-md-12">
								<%
									if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_AGRICULTURE)) {
								%>
									<jsp:include page="/agriculture-draft-applications.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_AQUIRELAND)) {
								%>
									<jsp:include page="/acquire-draft-applications.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_CANNABIS)) {
								%>
									<jsp:include page="/cannabis-draft-applications.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_CREATIVE)) {
								%>
									<jsp:include page="/creative-draft-application.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_FARM)) {
								%>
									<jsp:include page="/farm-draft-applications.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_FILM)) {
								%>
									<jsp:include page="/film-draft-applications.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_HEALTHCARE)) {
								%>
									<jsp:include page="/healthcare-draft-applications.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_MANUFACTURING)) {
								%>
									<jsp:include page="/manufacturing-draft-applications.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_OSI)) {
								%>
									<jsp:include page="/osi-draft-application.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_OSI_INSOLVENCY)) {
								%>
									<jsp:include page="/osi-insolvency-draft-dashboard.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_PHARMA)) {
								%>
									<jsp:include page="/pharmaceutical-draft-application.jsp"/>
								<%
									} else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_TOURISM)) {
								%>
									<jsp:include page="/tourism-draft-applications.jsp"/>
								<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_SEZ_STATUS)) {
									%>
									<jsp:include page="/sez-status-draft-applications.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_FIRE_BRIGADE)) {
									%>
									<jsp:include page="/fire-brigade-draft-applications.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_OSI_SERVICES)) {
									%>
									<jsp:include page="/osi-services-draft-dashboard.jsp"/>
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_NCRA)) {
									%>
									<jsp:include page="/ncra-draft-dashboard.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_MIIC)) {
									%>
									<jsp:include page="/miic-draft-application.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_QUARRY)) {
									%>
									<jsp:include page="/quarry-draft-applications.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_MINING)) {
									%>
									<jsp:include page="/mining-lease-draft-application.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_OGT)) {
									%>
									<jsp:include page="/ogt-draft-application.jsp"/>
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_MEDICAL)) {
									%>
									<jsp:include page="/medical-facilities-draft-application.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_FACTORIES)) {
									%>
									<jsp:include page="/factories-registration-draft-application.jsp"/>
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_JADSC)) {
									%>
									 <jsp:include page="/jadsc-draft-application.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_WRA)) {
									%>
									 <jsp:include page="/wra-draft-application.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_TPDCo)) {
									%>
									<jsp:include page="/jtb-acco-draft-application.jsp"/>
									
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_JANAAC)) {
									%>
									<jsp:include page="/janaac-draft-applications.jsp"/>
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_HSRA)) {
									%>
									<jsp:include page="/hsra-draft-application.jsp"/>
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_NCBJ)) {
									%>
									<jsp:include page="/ncbj-draft-application.jsp"/>
									<%
								}else if (selectedApplication.equals(DraftDashboardPortletKeys.COLLEBORATION_EXPLOSIVE)) {
									%>
									<jsp:include page="/explosive-draft-applications.jsp"/>
									<%
								}
								else {
								%>
								<jsp:include page="/cannabis-draft-applications.jsp"/>
								<jsp:include page="/agriculture-draft-applications.jsp"/>
								<jsp:include page="/farm-draft-applications.jsp"/>
								<jsp:include page="/pharmaceutical-draft-application.jsp"/>
								<jsp:include page="/tourism-draft-applications.jsp"/>
								<jsp:include page="/manufacturing-draft-applications.jsp"/>
								<jsp:include page="/healthcare-draft-applications.jsp"/>
								<jsp:include page="/creative-draft-application.jsp"/>
								<jsp:include page="/film-draft-applications.jsp"/>
								<jsp:include page="/acquire-draft-applications.jsp"/>
								<jsp:include page="/osi-draft-application.jsp"/>
								<jsp:include page="/osi-insolvency-draft-dashboard.jsp"/>
								<jsp:include page="/sez-status-draft-applications.jsp"/>
								<jsp:include page="/fire-brigade-draft-applications.jsp"/>
								<jsp:include page="/osi-services-draft-dashboard.jsp"/>
								<jsp:include page="/ncra-draft-dashboard.jsp"/>
								<jsp:include page="/miic-draft-application.jsp"/>
								<jsp:include page="/quarry-draft-applications.jsp"/>
								<jsp:include page="/mining-lease-draft-application.jsp"/>
								<jsp:include page="/ogt-draft-application.jsp"/>
								<jsp:include page="/medical-facilities-draft-application.jsp"/>
								<jsp:include page="/factories-registration-draft-application.jsp"/>
								<jsp:include page="/jadsc-draft-application.jsp"/>
								<jsp:include page="/wra-draft-application.jsp"/> 
								<jsp:include page="/jtb-acco-draft-application.jsp"/> 
								<jsp:include page="/hsra-draft-application.jsp"/> 
								<jsp:include page="/ncbj-draft-application.jsp"/> 
								<jsp:include page="/explosive-draft-applications.jsp"/>
								<jsp:include page="/janaac-draft-applications.jsp"/>
								<%
									}
								%>
							</div>
						</div>
					</div>
				</div>
			</div>			
			<%
				if (noRecordFoundDraftCases) {
			%>
			<div class="col-md-12">
				<div class="alert alert-primary" role="alert">No Draft
					Applications found.</div>
			</div>
			<%
				}
			%>
		</div>
</section>

<script>
	function getSingleApplicationOverview(cannabisDashboardUrl) {
		window.location.href = cannabisDashboardUrl;
	}
	function getFarmSingleApplicationOverview(farmDashboardUrl) {
		window.location.href = farmDashboardUrl;
	}
	function getAgricultureSingleApplicationOverview(agricultureDashboardUrl) {
		window.location.href = agricultureDashboardUrl;
	}
	function getPharmaSingleApplicationOverview(pharmaDashboardUrl) {
		window.location.href = pharmaDashboardUrl;
	}
	function getPharmaApplicationPage(pharmaAplicationFormRenderURL) {
		window.location.href = pharmaAplicationFormRenderURL;
	}

	function getManufactureSingleApplicationOverview(manufactureDashboardUrl) {
		window.location.href = manufactureDashboardUrl;
	}
	function getTourismSingleApplicationOverview(tourismDashboardUrl) {
		window.location.href = tourismDashboardUrl;
	}
	function getHealthcareSingleApplicationOverview(healthcareDashboardUrl) {
		window.location.href = healthcareDashboardUrl;
	}
	function getCreativeSingleApplicationOverview(creativeDashboardUrl) {
		window.location.href = creativeDashboardUrl;
	}
	function getFilmSingleApplicationOverview(filmDashboardUrl) {
		window.location.href = filmDashboardUrl;
	}

	function getFilmSingleApplicationOverview(filmDashboardUrl) {
		window.location.href = filmDashboardUrl;
	}
	function getAcquireSingleApplicationOverview(acquireDashboardUrl) {
		window.location.href = acquireDashboardUrl;
	}
	function getOsiSingleApplicationOverview(osiDashboardURL) {
		window.location.href = osiDashboardURL;
	}
	function getOsiInsolvencySingleApplicationOverview(osiInsolvencyDashboardRenderURL) {
		window.location.href = osiInsolvencyDashboardRenderURL;
	}
	function getSezStatusSingleApplicationOverview(sezStatusDashboardRenderURL) {
		window.location.href = sezStatusDashboardRenderURL;
	}
	function getFireBrigadeSingleApplicationOverview(fireBrigadeDashboardRenderURL) {
		window.location.href = fireBrigadeDashboardRenderURL;
	}
	function getOsiServiceSingleApplicationOverview(osiServicesDashboardRenderURL) {
		window.location.href = osiServicesDashboardRenderURL;
	}
	function getNCRASingleApplicationOverview(ncraDashboardRenderURL) {
		window.location.href = ncraDashboardRenderURL;
	}
	function getMiicSingleApplicationOverview(miicboardRenderURL) {
		window.location.href = miicboardRenderURL;
	}
	function getQuarrySingleApplicationOverview(quarryRenderURL) {
		window.location.href = quarryRenderURL;
	}
	function getMedicalSingleApplicationOverview(medicalRenderURL) {
		window.location.href = medicalRenderURL;
	}
	function getOgtSingleApplicationOverview(ogtRenderURL) {
		window.location.href = ogtRenderURL;
	}
	function getMiningSingleApplicationOverview(miningRenderURL) {
		window.location.href = miningRenderURL;
	}
	function getNcbjSingleApplicationOverview(ncbjRenderURL) {
		window.location.href = ncbjRenderURL;
	}
	function getOSIServicesApplicationOverview(osiServicesRenderURL) {
		window.location.href = osiServicesRenderURL;
	}
	function getJanaacSingleApplicationOverview(janaacRenderURL) {
		window.location.href = janaacRenderURL;
	}
	function getFactoriesSingleApplicationOverview(factoriesRenderURL) {
		window.location.href = factoriesRenderURL;
	}
	function getJADSCSingleApplicationOverview(jadscRenderURL) {
		window.location.href = jadscRenderURL;
	}
	function getWRASingleApplicationOverview(wraRenderURL) {
		window.location.href = wraRenderURL;
	}
	function getHSRASingleApplicationOverview(hsraRenderUrl) {
		window.location.href = hsraRenderUrl;
	}
	function getJTBSingleApplicationOverview(jtbRenderUrl) {
		window.location.href = jtbRenderUrl;
	}
	function getExplosiveSingleApplicationOverview(explosiveRenderUrl) {
		window.location.href = explosiveRenderUrl;
	}
	function expandDetails(id){
	    var currentIsActive = $("#"+id).hasClass('is-active');
	    $("#"+id).removeClass('is-active');
	    $("#"+id).next('.accordion__body').removeClass('is-active');
	    if (currentIsActive != 1) {
	        $("#"+id).addClass('is-active');
	        $("#"+id).next('.accordion__body').addClass('is-active');
	    }
	}
</script>