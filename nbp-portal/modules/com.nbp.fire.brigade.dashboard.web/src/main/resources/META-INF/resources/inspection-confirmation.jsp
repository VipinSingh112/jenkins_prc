<%@page import="com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ include file="init.jsp"%>
<%
FireBrigadeInspection fbInspection= (FireBrigadeInspection)request.getAttribute("fireBrigadeInspectionScheduled");
%>

<div class="row">
	<div class="col-md-8 mx-auto mt-5">
		<div class="final-submit-container">
			<div class="final-submit-img">
				<img src="<%=themeDisplay.getPathThemeImages()%>/popup.png" class="img-fluid"  />
			</div>
			<div class="final-submit-content commonsavepopup">
				<div class="row">
					<div class="col-md-12">
						<p class="modal-title f1">Meeting Scheduled</p>
						<p class="modal-subtitle f2">Your Inspection Meeting has been scheduled successfully.</p>
						<p class="modal-info f2">You will receive the inspector in the requested date:</p>
						<p class="font-weight-bold"><%=new SimpleDateFormat("yyyy-MM-dd").format(fbInspection.getDateOfInspection())%> - <%=fbInspection.getTimeOfInspection()%></p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>