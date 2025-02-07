package com.nbp.explosives.competency.form.web.portlet;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileVersionLocalService;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
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
import com.nbp.explosives.application.util.ExplosiveApplicationUtil;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationFormPortletKeys;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + ExplosivesCompetencyApplicationFormPortletKeys.EXPLOSIVESCOMPETENCYAPPLICATIONFORM,
		"mvc.command.name=explosives/generic/supporting/doc" 
		}, 
service = MVCResourceCommand.class)
public class ExplosivesDocumentsResourceCommand implements MVCResourceCommand{
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Explosive Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(ExplosivesDocumentsResourceCommand.class);
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("File upload started-----------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String fileID = ParamUtil.getString(resourceRequest, "fileID");
		_log.info("fileID-----------------------"+fileID);
		String saveAndConCheck = ParamUtil.getString(resourceRequest, "saveAndConCheck");
		long parseLongCheck= Integer.parseInt(saveAndConCheck);
		_log.info("parseLongCheck-----------------------"+parseLongCheck);
		long explosivesApplicationId = ParamUtil.getLong(resourceRequest, "explosivesApplicationId");
		_log.info("explosivesApplicationId-----------------------"+explosivesApplicationId);
		String folderName = ParamUtil.getString(resourceRequest, "folderName");
		_log.info("folderName-----------------------"+folderName);
		String mimeType = StringPool.BLANK;
		String title = StringPool.BLANK;
		ServiceContext serviceContext = new ServiceContext();
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		String[] fileNames = uploadPortletRequest.getFileNames(fileID);
		_log.info("fileNames-----------------------"+fileNames);
		String fileName = StringPool.BLANK;
		_log.info("fileName-----------------------"+fileName);
		File[] fileList = uploadPortletRequest.getFiles(fileID);
		_log.info("fileList-----------------------"+fileList);
		DLFolder dlFolder = null;
		int counter = 0;
		String downloadfileUrl="";
		String fileNameOfDocument="";
		FileEntry addFileEntry=null;
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		
	if (folderName.equals("Generic Documents")) {
		_log.info("under if condition-----------------------");
		    try {
		        // Get the root folder using the parent folder ID and root folder name.
		        DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(
		                themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		        
		        try {
		            dlFolder = DLFolderLocalServiceUtil.getFolder(
		                    themeDisplay.getScopeGroupId(), rootFolder.getFolderId(),
		                    String.valueOf(explosivesApplicationId));
		        } catch (Exception e) {
		            System.out.println("Application folder exist  nhi krta");
		        }

		        // Try to get the "Generic Documents" folder inside the root folder.
		        DLFolder subDlFolder = null;
		        try {
		            subDlFolder = DLFolderLocalServiceUtil.getFolder(
		                    themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), "Generic Documents");
		        } catch (Exception e) {
		            System.out.println("The folder 'Generic Document Upload' does not exist.");
		        }
		        // Delete the "Generic Documents" folder if parseLongCheck is 0
		        if (Validator.isNotNull(subDlFolder) && (Validator.isNull(parseLongCheck))) {
		            DLFolderLocalServiceUtil.deleteDLFolder(subDlFolder);
		            System.out.println("Deleted 'Generic Document Upload' folder successfully.");
		        } else {
		            System.out.println("'Generic Document Upload' folder not found or not deleted.");
		        }
		        // Fetch and add file details from "Generic Documents" to JSON array
		        if (Validator.isNotNull(subDlFolder)) {
		            List<FileEntry> fileEntries = DLAppServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(), subDlFolder.getFolderId());
		            for (FileEntry fileEntry : fileEntries) {
		            	String downloadfileUrl1="";
		            	try {
		        			downloadfileUrl1=	DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
		        					StringPool.BLANK, false, true);
		        			JSONObject fileObj = JSONFactoryUtil.createJSONObject();
		        			fileObj.put("fileName", fileEntry.getFileName());
		                    fileObj.put("downloadFileUrl", downloadfileUrl1);
		                    fileObj.put("title", fileEntry.getTitle());

		                    // Add fileObj to jsonArray
		                    jsonArray.put(fileObj);

		            	}catch (Exception e){}
		            	System.out.println("catch+++++{{{{{{{{{{{}");
		            }
		        }


		    } catch (PortalException e) {
		        // Handle any exceptions that might occur while interacting with Liferay's service
		        System.err.println("Error occurred while trying to access folders: " + e.getMessage());
		    }
		}
		if (Validator.isNotNull(fileList) && fileList.length > 0) {
			 System.out.println("under Validation --------------------");
			dlFolder = ExplosiveApplicationUtil.createSubFolder(
					themeDisplay.getUserId(), explosivesApplicationId, themeDisplay.getScopeGroupId(), folderName,
					"Explosive Supported Documents");
			
			if(folderName.equals("Generic Documents")) {
				 try {
					  commonsUtil.updateFolderPermissionGuest(dlFolder); 
					  } catch (Exception e1) {}
			}
			for (File fileItem : fileList) {
				try {
					fileName = fileNames[counter];
					if (Validator.isNotNull(fileItem) && Validator.isNotNull(fileName)) {
						mimeType = MimeTypesUtil.getContentType(fileNames[counter]);
						title = fileNames[counter];
						serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(),
								resourceRequest);
						addFileEntry = _dlAppLocalService.addFileEntry(fileName + dlFolder.getFolderId(), themeDisplay.getUserId(),
								themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName, mimeType, title,
								StringPool.BLANK, StringPool.BLANK, fileName, fileItem, null, null, null, serviceContext);
						downloadfileUrl = DLURLHelperUtil.getDownloadURL(addFileEntry, addFileEntry.getFileVersion(), themeDisplay,
								StringPool.BLANK, false, true);
						fileNameOfDocument=addFileEntry.getFileName();
						System.out.println("DownloadfileUrl for Explosive*****"+downloadfileUrl);
						System.out.println("file name of the document *****"+fileNameOfDocument);
						
						JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			            jsonObject.put("downloadFileUrl", downloadfileUrl);
			            jsonObject.put("fileName", fileNameOfDocument);
			            jsonArray.put(jsonObject);
                    }
					_log.info("JSON Array: " + jsonArray.toString());
                } catch (Exception e) {
                    _log.error("Error uploading file", e);
                }
                counter++;
            }
            
        }
		try {
			
			JSONObject responseObject = JSONFactoryUtil.createJSONObject();
			responseObject.put("fileData", jsonArray); // The array of files
			responseObject.put("JSON_LENGTH", jsonArray.length()); // The length of the file data

			// Send the combined response as a single JSON object
			resourceResponse.getWriter().print(responseObject.toString());

		_log.info("adding application to draft end--------------------------------");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        _log.info("File upload end-----------------------");
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
