package com.nbp.dashboard.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import javax.portlet.PortletRequest;

public class DashboardUtil {
	private static Log _log = LogFactoryUtil.getLog(DashboardUtil.class);
	
	public static LiferayPortletURL getCollaborationDashboardUrl(long groupId, String dashboardFriendlyUrl, PortletRequest request,
			String portletName) {
		// TODO Auto-generated method stub
		LiferayPortletURL dashboardRenderURL = null;
		try {
			Layout applicationFormLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(groupId, true,
					dashboardFriendlyUrl);
			dashboardRenderURL = PortletURLFactoryUtil.create(request, portletName, applicationFormLayout.getPlid(),
					PortletRequest.RENDER_PHASE);
			dashboardRenderURL.setParameter("mvcPath", "/view.jsp");
			// dashboardRenderURL.setParameter("cannabisApplicationId",String.valueOf(applicationId));
			return dashboardRenderURL;
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static int getExpiredDocumentCount(long cannabisApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expiredDocumentCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Cannabis Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(cannabisApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expiredDocumentCount =expiredDocumentCount+1;
					}
				}
			
		}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
		}
		
		return expiredDocumentCount;
	}
}
