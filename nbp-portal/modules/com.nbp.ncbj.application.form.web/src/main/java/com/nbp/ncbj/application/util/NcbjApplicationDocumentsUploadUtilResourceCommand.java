package com.nbp.ncbj.application.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileVersionLocalService;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.File;
import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/upload/document/ncbj"
		},
		service = MVCResourceCommand.class
		)
public class NcbjApplicationDocumentsUploadUtilResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(NcbjApplicationDocumentsUploadUtilResourceCommand.class);
@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {
		_log.info("File upload started-----------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String fileID = ParamUtil.getString(resourceRequest, "fileID");
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		String folderName = ParamUtil.getString(resourceRequest, "folderName");
		String mimeType = StringPool.BLANK;
		String title = StringPool.BLANK;
		ServiceContext serviceContext = new ServiceContext();
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		String[] fileNames = uploadPortletRequest.getFileNames(fileID);
		String fileName = StringPool.BLANK;
		File[] fileList = uploadPortletRequest.getFiles(fileID);
		DLFolder dlFolder = null;
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		JSONArray jsonArrayWithUrl = JSONFactoryUtil.createJSONArray();
		int counter = 0;
		if (Validator.isNotNull(fileList) && fileList.length > 0) {
			dlFolder = NCBjApplicationUtil.createSubFolder(
					themeDisplay.getUserId(), ncbjApplicationId, themeDisplay.getScopeGroupId(), folderName,
					"NCBJ Supported Documents");
				
			if(folderName.equals("Signature of Applicant Employee")) { 
				  try {
					  commonsUtil.updateFolderPermissionGuest(dlFolder); 
					  } catch (Exception e1) { }
			  }
			
			for (File fileItem : fileList) {
				try {
					fileName = fileNames[counter];
					if (Validator.isNotNull(fileItem) && Validator.isNotNull(fileName)) {
						mimeType = MimeTypesUtil.getContentType(fileNames[counter]);
						title = fileNames[counter];
						serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(),
								resourceRequest);
						FileEntry fileEntry = _dlAppLocalService.addFileEntry
						(fileName + dlFolder.getFolderId(), themeDisplay.getUserId(),
								themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName, mimeType, title,
								StringPool.BLANK, StringPool.BLANK, fileName, fileItem, null, null, null, serviceContext);
						JSONObject propertiesObj= JSONFactoryUtil.createJSONObject();
						jsonArrayWithUrl=	commonsUtil.getDownloadUrlForPreview(fileEntry,jsonArray,themeDisplay,propertiesObj);
					}
				} catch (Exception e) {
				}
				counter = counter + 1;
			}
		}
		try {

			resourceResponse.getWriter().print(jsonArrayWithUrl.toString());
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		_log.info("File upload end-----------------------");
		// TODO Auto-generated method stub
		return false;
	}
@Reference
DLFileEntryLocalService _dlFileEntryLocalService;

@Reference
DLFileVersionLocalService _dlFileVersionLocalService;

@Reference
DLAppLocalService _dlAppLocalService;

@Reference
private CommonsUtil commonsUtil;
}
