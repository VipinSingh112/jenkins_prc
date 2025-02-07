package com.nbp.jtb.upload.document.commands;

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
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;
import com.nbp.jtb.application.util.JTBApplicationUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/upload/multiple/documents" }, service = MVCResourceCommand.class)
public class JTBDocumentsResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "JTB Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "JTB Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(JTBDocumentsResourceCommand.class);

	@Override 
	public synchronized boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("File upload started JTB--------->>>>>APPLICATION");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String fileID = ParamUtil.getString(resourceRequest, "fileID");
		String saveAndConCheck = ParamUtil.getString(resourceRequest, "saveAndConCheck");
		long parseLongCheck=0;
		try {
			parseLongCheck=Integer.parseInt(saveAndConCheck);
		}catch (Exception e) {
		}
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String folderName = ParamUtil.getString(resourceRequest, "folderName");
		System.out.println("folder name is -------"+folderName);
		String mimeType = StringPool.BLANK;
		String title = StringPool.BLANK;
		ServiceContext serviceContext = new ServiceContext();
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		String[] fileNames = uploadPortletRequest.getFileNames(fileID);
		String fileName = StringPool.BLANK;
		File[] fileList = uploadPortletRequest.getFiles(fileID);
		DLFolder dlFolder = null;
		int counter = 0;
		JSONArray jsonArray=JSONFactoryUtil.createJSONArray();
		JSONArray jsonArrayWithUrl=JSONFactoryUtil.createJSONArray();
	if (folderName.equals("Generic Documents")) {
			
		    try {
		        // Get the root folder using the parent folder ID and root folder name.
		        DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(
		                themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		        try {
		            dlFolder = DLFolderLocalServiceUtil.getFolder(
		                    themeDisplay.getScopeGroupId(), rootFolder.getFolderId(),
		                    String.valueOf(jtbApplicationId));
		        } catch (Exception e) {
		            System.out.println("Application folder does not exist.");
		        }

		        // Try to get the "Generic Documents" folder inside the root folder.
		        DLFolder subDlFolder = null;
		        try {
		            subDlFolder = DLFolderLocalServiceUtil.getFolder(
		                    themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), "Generic Documents");
		        } catch (Exception e) {
		            System.out.println("The folder 'Generic Documents' does not exist.");
		        }
		        // Delete the "Generic Documents" folder if parseLongCheck is 0
		        if (Validator.isNotNull(subDlFolder) && (Validator.isNull(parseLongCheck))) {
		            DLFolderLocalServiceUtil.deleteDLFolder(subDlFolder);
		            System.out.println("Deleted 'Generic Documents' folder successfully.");
		        } else {
		            System.out.println("'Generic Documents' folder not found or not deleted.");
		        }
		        // Fetch and add file details from "Generic Documents" to JSON array
		        if (Validator.isNotNull(subDlFolder)) {
		            List<FileEntry> fileEntries = DLAppServiceUtil.getFileEntries(
		                    themeDisplay.getScopeGroupId(), subDlFolder.getFolderId());
		            for (FileEntry fileEntry : fileEntries) {
		            	
		            	String downloadfileUrl="";
		            	try {
		        			downloadfileUrl=	DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
		        					StringPool.BLANK, false, true);
		        			JSONObject fileObj = JSONFactoryUtil.createJSONObject();
		        			fileObj.put("fileName", fileEntry.getFileName());
		                    fileObj.put("downloadFileUrl", downloadfileUrl);
		                    fileObj.put("title", fileEntry.getTitle());

		                    // Add fileObj to jsonArray
		                    jsonArray.put(fileObj);

		            	}catch (Exception e){}
  
		                // Add fileObj to jsonArray
		            }
		        }


		    } catch (PortalException e) {
		        // Handle any exceptions that might occur while interacting with Liferay's service
		        System.err.println("Error occurred while trying to access folders: " + e.getMessage());
		    }
		}

	System.out.println("after generic code -------------");
		if (Validator.isNotNull(fileList) && fileList.length > 0) {
			System.out.println("Inside file list ----");
			dlFolder = JTBApplicationUtil.createSubFolder(themeDisplay.getUserId(), jtbApplicationId,
					themeDisplay.getScopeGroupId(), folderName, "JTB Supported Documents");

			if (folderName.equals("Hotel Signature Of Applicant") || folderName.equals("Hotel Signature Of Manager")
					|| folderName.equals("Resort Signature of Applicant")
					|| folderName.equals("Home Stay Signature Of Applicant")
					|| folderName.equals("Home Stay Applicant Seal")
					||folderName.equals("Attraction Signature of Applicant")
					||folderName.equals("Car Rental Signature of Applicant")
					||folderName.equals("Domestic Signature of Applicant")
					||folderName.equals("Domestic Signature Service")
					||folderName.equals("Domestic Company Seal")
					||folderName.equals("Travel Agency Applicant Sign")
					||folderName.equals("Watersports Signature of Owner")
					||folderName.equals("Watersports Signature of Manager")
					||folderName.equals("Carriage Signature of Owner Operator")
					||folderName.equals("Travel Halt Signature of Applicant")
					||folderName.equals("Water Sport Signature of Employee")
					||folderName.equals("Superintendent of Police")
					||folderName.equals("Bike Rental Signature of Applicant")
					||folderName.equals("Place Signature of Applicant")
					||folderName.equals("Craft Vendor's Signature")
					||folderName.equals("Craft Vendor's Assistant Signature")

			) {
				try {
					commonsUtil.updateFolderPermissionGuest(dlFolder);
				} catch (Exception e1) {
				}
			}

			for (File fileItem : fileList) {
				try {
					fileName = fileNames[counter];
					if (Validator.isNotNull(fileItem) && Validator.isNotNull(fileName)) {
						mimeType = MimeTypesUtil.getContentType(fileNames[counter]);
						title = fileNames[counter];
						serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(),
								resourceRequest);
						FileEntry fileEntry = _dlAppLocalService.addFileEntry(fileName + dlFolder.getFolderId(), themeDisplay.getUserId(),
								themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName, mimeType, title,
								StringPool.BLANK, StringPool.BLANK, fileName, fileItem, null, null, null, serviceContext);
						JSONObject propertiesObj= JSONFactoryUtil.createJSONObject();
						jsonArrayWithUrl=	commonsUtil.getDownloadUrlForPreview(fileEntry,jsonArray,themeDisplay,propertiesObj);
						System.out.println("json array with url is --- "+jsonArrayWithUrl);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				counter = counter + 1;
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
