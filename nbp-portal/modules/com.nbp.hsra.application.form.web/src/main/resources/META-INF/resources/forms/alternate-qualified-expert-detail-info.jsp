<%
String qualifedExpertDetailVal = "";
qualifedExpertDetailVal = (String)request.getAttribute("qualifedExpertDetailVal");
%>
<tr class="qualifed-expert-row<%=qualifedExpertDetailVal%>">
	<td class="sub_heading_content qualifedName<%=qualifedExpertDetailVal%>"></td>
	<td class="sub_heading_content qualifedTitle<%=qualifedExpertDetailVal%>"></td>
	<td class="sub_heading_content qualifedTelephone<%=qualifedExpertDetailVal%>"></td>
	<td class="sub_heading_content qualifedExt<%=qualifedExpertDetailVal%>"></td>
	<td class="sub_heading_content qualifedFax<%=qualifedExpertDetailVal%>"></td>
	<td class="sub_heading_content qualifedEmailAdd<%=qualifedExpertDetailVal%>"></td>
	<td class="sub_heading_content qualifedRegistrationNo<%=qualifedExpertDetailVal%>"></td>
	<td class="sub_heading_content qualifedExpirationDate<%=qualifedExpertDetailVal%>"></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="qualifedExpertEditTab" onclick="qualifedExpertEditTab('<%=qualifedExpertDetailVal%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="qualifedExpertDetailDeleteDataTab" onclick="qualifedExpertDetailDeleteData('<%=qualifedExpertDetailVal%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
     <input type="hidden" id="qualifedExpertDetailId<%=qualifedExpertDetailVal%>" name="qualifedExpertDetailId<%=qualifedExpertDetailVal%>" value="">
</tr>
