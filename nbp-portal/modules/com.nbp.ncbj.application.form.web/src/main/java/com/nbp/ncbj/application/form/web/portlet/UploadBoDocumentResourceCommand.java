package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;
import com.nbp.ncbj.application.util.NCBjApplicationUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
"mvc.command.name=/add/upload/Bo/document" }, service = MVCResourceCommand.class)
public class UploadBoDocumentResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String haccpNumberDetailVal = ParamUtil.getString(resourceRequest, "haccpNumberDetailVal");
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		String fileID = ParamUtil.getString(resourceRequest, "fileID");
		// Doc Upload
		ServiceContext serviceContext = new ServiceContext();
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		String fileName = uploadPortletRequest.getFileName(fileID);
		// Adding folder
		DLFolder createSubFolder = null;
		try {
			createSubFolder = NCBjApplicationUtil.createSubFolder(themeDisplay.getUserId(), ncbjApplicationId,
					themeDisplay.getScopeGroupId(), "Number of HACCP study"+haccpNumberDetailVal, "");
		} catch (Exception e) {
		}
		String title = "";
		String mimeType = StringPool.BLANK;
		mimeType = MimeTypesUtil.getContentType(fileName);
		title = fileName;
		File files = null;
		files = uploadPortletRequest.getFile(fileID);
		InputStream inputStream = null;
		try {
			inputStream = uploadPortletRequest.getFileAsStream(fileID);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileEntry addFileEntry = null;
		try {
			addFileEntry = _dlAppLocalService.addFileEntry(
					String.valueOf(CounterLocalServiceUtil.increment(DLFileEntry.class.getName())),
					themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), createSubFolder.getFolderId(), fileName,
					mimeType, title, StringPool.BLANK, StringPool.BLANK, fileName, inputStream, files.length(), null,
					null, null, serviceContext);
		} catch (PortalException e1) {
		}
		long specificFileEntry=0;
		if(Validator.isNotNull(addFileEntry)) {
			specificFileEntry=addFileEntry.getFileEntryId();
		}
		
		jsonOBJ.put("fileEntryId",specificFileEntry);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		resourceResponse.setCharacterEncoding("UTF-8"); 
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		 }
		
		return false;
	}
	@Reference
	DLAppLocalService _dlAppLocalService;
}
