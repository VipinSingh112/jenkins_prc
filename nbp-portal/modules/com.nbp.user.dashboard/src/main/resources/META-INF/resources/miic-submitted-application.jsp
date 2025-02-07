<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.nbp.miic.stages.service.service.MiicApplicationStagesLocalServiceUtil"%>
<%@page import="com.nbp.miic.stages.service.model.MiicApplicationStages"%>
<%@page import="com.nbp.miic.application.form.services.model.MiicApplication"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.user.dashboard.constants.UserDashboardPortletKeys"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.user.dashboard.util.DashboardUtil"%>
<%@ include file="/init.jsp" %>
<%
List<MiicApplicationStages> miicCurrentInProgressStages=null;
	for(MiicApplication applications : miicApplicationList){ 
		 String miicboardRenderURL = PortalUtil.getPortalURL(request)+"/group/guest"+"/miic-dashboard?miicApplicationId=";
			if(Validator.isNotNull(selectedApplication)){
				miicboardRenderURL = miicboardRenderURL+String.valueOf(applications.getMiicApplicationId())+"&selectedApplication="+selectedApplication;
			}else{
				miicboardRenderURL = miicboardRenderURL+String.valueOf(applications.getMiicApplicationId());
			}
			 String miicDefaultActive="current-active";
			 String miicStageStatus="Submitted";
			 try{
				 miicCurrentInProgressStages=MiicApplicationStagesLocalServiceUtil.findBygetMIIC_CaseId(applications.getCaseId());
				 if(Validator.isNotNull(miicCurrentInProgressStages)){ miicDefaultActive="unvisited";}
				 }catch(Exception e){e.printStackTrace();} 
			 String pdfMiicFileUrl ="";
			  FileEntry pdfMiicFileEntry = null;
			  try{
				  pdfMiicFileEntry = DLAppLocalServiceUtil.getFileEntry(applications.getPdfFileEntryId());
			  pdfMiicFileUrl = DLURLHelperUtil.getDownloadURL(pdfMiicFileEntry, pdfMiicFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			  }catch(Exception e){}
			  int expirationCount=0;
				try{
					expirationCount=	DashboardUtil.getExpirationDocCount(applications.getMiicApplicationId(),themeDisplay,"Miic Supported Documents");
				}catch(Exception e){}
				String checkDateInMiic="";
				String notification="hide";
				try{
					checkDateInMiic=DashboardUtil.showMiicExpiredLiceseNotification(applications.getCaseId());
				 if(Validator.isNotNull(checkDateInMiic)){
					  notification="show";  
				 }
				}catch(Exception e){
				 } 

%>
	<section class="wizard-section dashboard-progress">
	<div class="second-card dash-common-card">
		<div class="row p-3">
			<div class="col-md-12">
				<div class="progress-plus-wizard-card row cursor-pointer" onclick="getMiicSingleApplicationOverview('<%=miicboardRenderURL%>')">
					<div class="d-flex col-lg-3">
						<div class="icon">
							<span class="mr-2"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 220 220" fill="none">
									<path d="M202.812 195.938H17.1875V202.812H202.812V195.938Z" fill="#047247"></path>
									<path d="M178.75 165H171.875V171.875H178.75V165Z" fill="#047247"></path>
									<path d="M171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM127.188 127.188V189.063H147.812V127.188H127.188ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM99.6875 127.188V189.063H120.312V127.188H99.6875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM72.1875 127.188V189.063H92.8125V127.188H72.1875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM58.4375 127.188C57.5258 127.188 56.6515 126.826 56.0068 126.181C55.3622 125.536 55 124.662 55 123.75V120.313H24.0625V189.063H65.3125V127.188H58.4375ZM55 175.313C55 176.225 54.6378 177.099 53.9932 177.744C53.3485 178.388 52.4742 178.75 51.5625 178.75H37.8125C36.9008 178.75 36.0265 178.388 35.3818 177.744C34.7372 177.099 34.375 176.225 34.375 175.313V161.563C34.375 160.651 34.7372 159.777 35.3818 159.132C36.0265 158.488 36.9008 158.125 37.8125 158.125H51.5625C52.4742 158.125 53.3485 158.488 53.9932 159.132C54.6378 159.777 55 160.651 55 161.563V175.313ZM55 147.813C55 148.725 54.6378 149.599 53.9932 150.244C53.3485 150.888 52.4742 151.25 51.5625 151.25H37.8125C36.9008 151.25 36.0265 150.888 35.3818 150.244C34.7372 149.599 34.375 148.725 34.375 147.813V134.063C34.375 133.151 34.7372 132.277 35.3818 131.632C36.0265 130.988 36.9008 130.625 37.8125 130.625H51.5625C52.4742 130.625 53.3485 130.988 53.9932 131.632C54.6378 132.277 55 133.151 55 134.063V147.813ZM41.25 171.875H48.125V165H41.25V171.875ZM41.25 144.375H48.125V137.5H41.25V144.375ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM165 120.313V123.75C165 124.662 164.638 125.536 163.993 126.181C163.349 126.826 162.474 127.188 161.562 127.188H154.688V189.063H195.938V120.313H165ZM185.625 175.313C185.625 176.225 185.263 177.099 184.618 177.744C183.974 178.388 183.099 178.75 182.188 178.75H168.438C167.526 178.75 166.651 178.388 166.007 177.744C165.362 177.099 165 176.225 165 175.313V161.563C165 160.651 165.362 159.777 166.007 159.132C166.651 158.488 167.526 158.125 168.438 158.125H182.188C183.099 158.125 183.974 158.488 184.618 159.132C185.263 159.777 185.625 160.651 185.625 161.563V175.313ZM185.625 147.813C185.625 148.725 185.263 149.599 184.618 150.244C183.974 150.888 183.099 151.25 182.188 151.25H168.438C167.526 151.25 166.651 150.888 166.007 150.244C165.362 149.599 165 148.725 165 147.813V134.063C165 133.151 165.362 132.277 166.007 131.632C166.651 130.988 167.526 130.625 168.438 130.625H182.188C183.099 130.625 183.974 130.988 184.618 131.632C185.263 132.277 185.625 133.151 185.625 134.063V147.813ZM171.875 144.375H178.75V137.5H171.875V144.375ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM72.1875 55.0004V75.6254H147.812V55.0004H72.1875ZM85.9375 68.7504C85.9375 69.6621 85.5753 70.5365 84.9307 71.1811C84.286 71.8258 83.4117 72.1879 82.5 72.1879C81.5883 72.1879 80.714 71.8258 80.0693 71.1811C79.4247 70.5365 79.0625 69.6621 79.0625 68.7504V61.8754C79.0625 60.9638 79.4247 60.0894 80.0693 59.4448C80.714 58.8001 81.5883 58.4379 82.5 58.4379C83.4117 58.4379 84.286 58.8001 84.9307 59.4448C85.5753 60.0894 85.9375 60.9638 85.9375 61.8754V68.7504ZM99.6875 68.7504C99.6875 69.6621 99.3253 70.5365 98.6807 71.1811C98.036 71.8258 97.1617 72.1879 96.25 72.1879C95.3383 72.1879 94.464 71.8258 93.8193 71.1811C93.1747 70.5365 92.8125 69.6621 92.8125 68.7504V61.8754C92.8125 60.9638 93.1747 60.0894 93.8193 59.4448C94.464 58.8001 95.3383 58.4379 96.25 58.4379C97.1617 58.4379 98.036 58.8001 98.6807 59.4448C99.3253 60.0894 99.6875 60.9638 99.6875 61.8754V68.7504ZM113.438 68.7504C113.438 69.6621 113.075 70.5365 112.431 71.1811C111.786 71.8258 110.912 72.1879 110 72.1879C109.088 72.1879 108.214 71.8258 107.569 71.1811C106.925 70.5365 106.562 69.6621 106.562 68.7504V61.8754C106.562 60.9638 106.925 60.0894 107.569 59.4448C108.214 58.8001 109.088 58.4379 110 58.4379C110.912 58.4379 111.786 58.8001 112.431 59.4448C113.075 60.0894 113.438 60.9638 113.438 61.8754V68.7504ZM127.188 68.7504C127.188 69.6621 126.825 70.5365 126.181 71.1811C125.536 71.8258 124.662 72.1879 123.75 72.1879C122.838 72.1879 121.964 71.8258 121.319 71.1811C120.675 70.5365 120.312 69.6621 120.312 68.7504V61.8754C120.312 60.9638 120.675 60.0894 121.319 59.4448C121.964 58.8001 122.838 58.4379 123.75 58.4379C124.662 58.4379 125.536 58.8001 126.181 59.4448C126.825 60.0894 127.188 60.9638 127.188 61.8754V68.7504ZM140.938 68.7504C140.938 69.6621 140.575 70.5365 139.931 71.1811C139.286 71.8258 138.412 72.1879 137.5 72.1879C136.588 72.1879 135.714 71.8258 135.069 71.1811C134.425 70.5365 134.062 69.6621 134.062 68.7504V61.8754C134.062 60.9638 134.425 60.0894 135.069 59.4448C135.714 58.8001 136.588 58.4379 137.5 58.4379C138.412 58.4379 139.286 58.8001 139.931 59.4448C140.575 60.0894 140.938 60.9638 140.938 61.8754V68.7504ZM120.312 17.1879H99.6875C91.1657 17.1878 82.9477 20.3531 76.6278 26.0696C70.3078 31.7861 66.3365 39.6464 65.4844 48.1254H154.688C153.832 39.6168 149.837 31.7324 143.48 26.0118C137.124 20.2911 128.864 17.1451 120.312 17.1879ZM164.312 82.5004H55.6875L17.1875 98.5536V113.438H55V110C54.9734 109.224 55.2104 108.462 55.6723 107.838C56.1342 107.214 56.7938 106.764 57.5437 106.563L109.106 92.8129C109.694 92.6752 110.306 92.6752 110.894 92.8129L162.456 106.563C163.206 106.764 163.866 107.214 164.328 107.838C164.79 108.462 165.027 109.224 165 110V113.438H202.812V98.5536L164.312 82.5004ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM110 99.6879L61.875 112.647V120.313H158.125V112.647L110 99.6879ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875Z" fill="#047247"></path>
								</svg>
							</span>
						</div>
						<div class="left-part">
							<p class="dash-card-licence-heading mb-2">MIIC(CET and Safeguard Mechanism)<br/> Transaction Number</p>
							<div class="dash-conditional-box">
								<div class="dash-conditional-box-left">
									<span class="dash-card-number-heading"><%=applications.getApplicationNumber() %> </span>
								</div>
							</div>
						</div>
					</div>
					<div class="tier-plus-issuedate-box col-lg-6 justify-content-between">
						<div class="single-box">
							<p class="upper-title">Type of Application</p>
							<p class="lower-title"><span class="one"> <%=applications.getMiicApplication() %></span> </p>
						</div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title">	<span class="one"> </span> </p></div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title"><span class="one"> </span> </p></div>
						<div class="single-box"><p class="upper-title"></p><p class="lower-title"><span class="one"> </span> </p></div>
					</div>
					<div class="right-part d-flex col-lg-3 justify-content-end">
						<div class="dash-status-box">
							<p class="dash-status">Status</p>
							<p class="dash-status-type"><span class="circle"></span> <span class="dash-status-type-info">submitted</span></p>
						</div>
						 <div class="dash-action-box d-flex">
							<a href="<%=Validator.isNotNull(pdfMiicFileUrl)?pdfMiicFileUrl:"javascript:void(0)"%>" class="dash-action-btns mr-2 common-yellow-bg" data-toggle="tooltip" title="Download Application Transcript">
								<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path></svg>
							</a> 
							<a href="javascript:void(0);" class="dash-action-btns common-yellow-bg" data-toggle="tooltip" title="<%=applications.getApplicationNumber() %> Details" > 
								<svg width="23" height="16" viewBox="0 0 23 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M11.5 0.5C6.5 0.5 2.23 3.61 0.5 8C2.23 12.39 6.5 15.5 11.5 15.5C16.5 15.5 20.77 12.39 22.5 8C20.77 3.61 16.5 0.5 11.5 0.5ZM11.5 13C8.74 13 6.5 10.76 6.5 8C6.5 5.24 8.74 3 11.5 3C14.26 3 16.5 5.24 16.5 8C16.5 10.76 14.26 13 11.5 13ZM11.5 5C9.84 5 8.5 6.34 8.5 8C8.5 9.66 9.84 11 11.5 11C13.16 11 14.5 9.66 14.5 8C14.5 6.34 13.16 5 11.5 5Z" fill="#1B1917"></path></svg>
							</a>
						</div> 
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 col-md-12">
				<div class="form-wizard">
					<form action="" method="post" role="form">
						<div class="form-wizard-header">
						<ul class="list-unstyled form-wizard-steps clearfix">
								<li class="start-active <%=miicDefaultActive%> farm-progress">
									<div class="dashboard-progress-card">
										<p class="dashboard-progress-card-title">Application Submission</p>
										<p class="dashboard-progress-card-date"><%=dateFormatter.format(applications.getCreateDate())%></p>
										<div class="dashboard-progress-card-status"><span></span><%=miicStageStatus %></div>
									</div>
								</li>
							<%try{
									String stageJson = MiicApplicationStagesLocalServiceUtil.getMIICApplicaitonCurrentStages(applications.getCaseId());
									if(Validator.isNotNull(stageJson)){
										JSONArray stagesArray = JSONFactoryUtil.createJSONArray(stageJson);
										for(int i=0 ;i<stagesArray.length();++i){
											JSONObject currentStage = stagesArray.getJSONObject(i);
											%>
											<li class='<%=currentStage.getString("status").equals("In Progress")||currentStage.getString("status").equals("Open")?"current-active":"unvisited" %> <%=currentStage.getString("status").equals("Closed")?"start-active":"" %> farm-progress'>
												<div class="dashboard-progress-card">
													<%
														if(Validator.isNotNull(currentStage.getString("duration"))){
															%><p class="dashboard-progress-card-duration"><%=currentStage.getString("duration") %></p><%}
													%>
													<div class="d-flex align-items-center">
														<p class="dashboard-progress-card-title"><%=currentStage.getString("startDate") %> </p>
														<%if(Validator.isNotNull(currentStage.getString("endDate"))){%>
															<div class="dashboard-progress-card-title px-1">-</div>
														<%}%>
														<p class="dashboard-progress-card-title"> <%=currentStage.getString("endDate") %></p>
													</div>
													<p class="dashboard-progress-card-title"><%=currentStage.getString("stageName") %></p>
													<%
													if(Validator.isNotNull(currentStage.getString("status"))){
														%>
															<div class="dashboard-progress-card-status">
																<span></span><%=currentStage.getString("status") %>
															</div>
														<%
													}%>
												</div>
											</li>
											<%
										}
									}
								}catch(Exception e){}
							%>
								<li class="last">
									<div class="dashboard-progress-card">
										<span></span>
									</div>
								</li>
							</ul>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="row p-3">
				<div class="col-md-12">
					<div class="lower  dash-lower-multiple-links-box">
						<a class="dash-yellow-repeated-link" <%-- onclick="getSingleOsiApplicationSpecificStage('<%=osiDashboardRenderURL%>', 'overview', 'osi-overview-tab')"> --%>> Overview </a> 
						<a href="/discussion-boards" class="dash-yellow-repeated-link light-grey"> Discussion and Support
							<span class="ml-2"> 
								<svg width="21" height="20" viewBox="0 0 21 20" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M10.5 0C4.98 0 0.5 4.48 0.5 10C0.5 15.52 4.98 20 10.5 20C16.02 20 20.5 15.52 20.5 10C20.5 4.48 16.02 0 10.5 0ZM17.96 7.12L15.18 8.27C14.67 6.91 13.6 5.83 12.23 5.33L13.38 2.55C15.48 3.35 17.15 5.02 17.96 7.12ZM10.5 13C8.84 13 7.5 11.66 7.5 10C7.5 8.34 8.84 7 10.5 7C12.16 7 13.5 8.34 13.5 10C13.5 11.66 12.16 13 10.5 13ZM7.63 2.54L8.8 5.32C7.42 5.82 6.33 6.91 5.82 8.29L3.04 7.13C3.85 5.02 5.52 3.35 7.63 2.54ZM3.04 12.87L5.82 11.72C6.33 13.1 7.41 14.18 8.79 14.68L7.62 17.46C5.52 16.65 3.85 14.98 3.04 12.87ZM13.38 17.46L12.23 14.68C13.6 14.17 14.68 13.09 15.18 11.71L17.96 12.88C17.15 14.98 15.48 16.65 13.38 17.46Z" fill="#282524"></path></svg>
							</span>
						</a>
					</div>
				</div>
			</div>
			 <%if (expirationCount > 0) {%>
		<div class="dash-light-cream-box common-dash-colored-boxes">
			<div class="row">
				<div class="col-md-1">
					<div class="icon">
						<span> 
							<svg width="25" height="24" viewBox="0 0 25 24" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M12.5 21C13.6046 21 14.5 20.1046 14.5 19C14.5 17.8954 13.6046 17 12.5 17C11.3954 17 10.5 17.8954 10.5 19C10.5 20.1046 11.3954 21 12.5 21Z" fill="#282524"></path><path d="M10.5 3H14.5V15H10.5V3Z" fill="#282524"></path></svg>
						</span>
					</div>
				</div>
				<div class="col-md-11">
					<div class="approval-wrapper">
						<div class="approval-box-left">
							<p class="two">Supporting Document required Expiration</p>
							<p class="three">Your <%=expirationCount%> documents have expired.<span> Update Required </span></p>
						</div>
						<div class="approval-box-right">
							<a href="javascript:void(0);" class="common-green-bg btn" onclick="getSingleMiicApplicationSpecificStage('<%=miicboardRenderURL%>', 'miic-document', 'miic-document-tab')">Update document
								<span class="ml-2"> 
									<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" /></svg>
								</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%	}%> 
	</div>
 <div class="dash-light-cream-box common-dash-colored-boxes <%=notification%>">
			<div class="row">
				<div class="col-md-1">
					<div class="icon">
						<span> 
							<svg width="25" height="24" viewBox="0 0 25 24" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M12.5 21C13.6046 21 14.5 20.1046 14.5 19C14.5 17.8954 13.6046 17 12.5 17C11.3954 17 10.5 17.8954 10.5 19C10.5 20.1046 11.3954 21 12.5 21Z" fill="#282524"></path><path d="M10.5 3H14.5V15H10.5V3Z" fill="#282524"></path></svg>
						</span>
					</div>
				</div>
				<div class="col-md-11">
					<div class="approval-wrapper">
						<div class="approval-box-left">
							<p class="two">Licence Expiration</p>
							<p class="three"><%=Validator.isNotNull(checkDateInMiic)?checkDateInMiic:"" %> <span> Renewal Required </span></p>
						</div>
					</div>
				</div>
			</div>
		</div> 
</section>
<% 	 }	 %>