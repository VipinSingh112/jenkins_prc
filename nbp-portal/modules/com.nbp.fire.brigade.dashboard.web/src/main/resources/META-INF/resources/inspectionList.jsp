<%@page import="com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<script type="text/javascript" data-senna-track="permanent" src="<%=themeDisplay.getPathThemeJavaScript()%>/plugins/datatables.min.js"></script>
<%@page import="java.util.List"%>
<%
List<FireBrigadeInspection> fireBrigadeInspections = (List<FireBrigadeInspection>)request.getAttribute("inspectionList");
%>
			<table id="invitees-table">
			    <thead>
			        <tr>
			        	<th></th>
			            <th>Date</th>
			            <th>Time</th>
			            <th>Location</th>
			        </tr>
			    </thead>
			    <tbody>
			        <%
			        for(FireBrigadeInspection fireBrigadeInspection:fireBrigadeInspections){
			        		%><tr>
			        			<td> <input value="<%=fireBrigadeInspection.getFireBrigadeInspectionId() %>" type="radio" name="timeForInspection" id="timeForInspection<%=fireBrigadeInspection.getFireBrigadeInspectionId()%>" ></td>
					        	<td id="inspection-date"><%=new SimpleDateFormat("yyyy-MM-dd").format(fireBrigadeInspection.getDateOfInspection()) %></td>
					            <td id="inspection-time"><%=fireBrigadeInspection.getTimeOfInspection() %></td>
					            <td id="inspection-location"><%=fireBrigadeInspection.getLocation() %></td>
			        		</tr>
			        		<%
			        	}
			        %>
			        
			    </tbody>
			</table>
			<%
				if(Validator.isNotNull(fireBrigadeInspections) && fireBrigadeInspections.size()>0){
					%>
						<a href="javascript:void(0);" class="btn common-green-bg float-right mt-3" onclick="userConfirmation();" id="confirm-btn" >Confirm</a>
					<%
				}
			%>
<script>
$('#invitees-table').DataTable({
    searching: false,
    paging: false,
    "bInfo": false,
});

</script>