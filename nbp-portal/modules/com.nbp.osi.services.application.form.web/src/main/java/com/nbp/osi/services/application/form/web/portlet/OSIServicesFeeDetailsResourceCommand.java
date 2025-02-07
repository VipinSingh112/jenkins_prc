package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileVersionLocalService;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
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
import com.nbp.osi.service.document.upload.util.OSIServiceApplicationUtil;
import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;
import com.nbp.osi.services.application.form.service.service.OsiServicesAppPaymentLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.io.File;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		"mvc.command.name=/osi/Services/fee/Details/Url" }, service = MVCResourceCommand.class)
public class OSIServicesFeeDetailsResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "OSI Services Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "OSI Services Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(OSIServicesFeeDetailsResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		_log.info("Payment File upload started-----------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String paymentMethod = ParamUtil.getString(resourceRequest, "paymentMethod");
		long osiServiceApplicationId = ParamUtil.getLong(resourceRequest, "osiServiceApplicationId");
		JSONArray jsonArray= JSONFactoryUtil.createJSONArray();
		JSONArray jsonArrayWithDownlaodData= JSONFactoryUtil.createJSONArray();
		if (!paymentMethod.equals("Credit Card")) {
			String fileID = ParamUtil.getString(resourceRequest, "fileID");
			String mimeType = StringPool.BLANK;
			String title = StringPool.BLANK;
			ServiceContext serviceContext = new ServiceContext();
			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
			String fileName = uploadPortletRequest.getFileName(fileID);
			File fileItem = uploadPortletRequest.getFile(fileID);
			DLFolder dlFolder = null;
			
			
			 try {
		            if (Validator.isNotNull(fileName)) {
		                // Step 1: Delete all existing files in the folder
		                dlFolder = OSIServiceApplicationUtil.createSubFolder((themeDisplay.getUserId()), osiServiceApplicationId, themeDisplay.getScopeGroupId(), "Fee Reciept", "OSI Service Application Fee Reciept");
		                List<DLFileEntry> fileEntries = _dlFileEntryLocalService.getFileEntries(themeDisplay.getScopeGroupId(),dlFolder.getFolderId());
		                for (DLFileEntry fileEntry : fileEntries) {
		                    _dlFileEntryLocalService.deleteDLFileEntry(fileEntry.getFileEntryId()); // Delete old files
		                }

		                // Step 2: Upload the new file
		                mimeType = MimeTypesUtil.getContentType(fileName);
		                title = fileName;
		                serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
		                
		                FileEntry fileEntry = _dlAppLocalService.addFileEntry(
		                        fileName + osiServiceApplicationId, themeDisplay.getUserId(),
		                        themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName,
		                        mimeType, title, StringPool.BLANK, StringPool.BLANK, fileName,
		                        fileItem, null, null, null, serviceContext);
		                
		                // Step 3: Prepare download URL for the newly uploaded file
		                JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		                jsonArrayWithDownlaodData = commonsUtil.getDownloadUrlForPreview(fileEntry, jsonArray, themeDisplay, jsonObject);
		            }
		        } catch (Exception e) {
		            _log.error("Error uploading file", e);
		        }

		}
		String paymentFee = ParamUtil.getString(resourceRequest, "paymentFee");
		String amountPaid = ParamUtil.getString(resourceRequest, "amountPaid");
		String amountCurrency = ParamUtil.getString(resourceRequest, "amountCurrency");
		_log.info("paymentMethozd------" + paymentMethod);
		OsiServicesAppPayment osiServiceAppPayment = null;
		osiServiceAppPayment = OsiServicesAppPaymentLocalServiceUtil.createOsiServicesAppPayment(CounterLocalServiceUtil.increment());
		osiServiceAppPayment.setPaymentMethod(paymentMethod);
		osiServiceAppPayment.setPaymentFee(paymentFee);
		osiServiceAppPayment.setAmountPaid(amountPaid);
		osiServiceAppPayment.setAmountCurrency(amountCurrency);
		osiServiceAppPayment.setOsiServicesApplicationId(osiServiceApplicationId);
		OsiServicesAppPaymentLocalServiceUtil.updateOsiServicesAppPayment(osiServiceAppPayment);
		_log.info("Payment File upload end-----------------------");
		try {
			resourceResponse.getWriter().print(jsonArrayWithDownlaodData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	private DLFolder createFolder(long userId, long fireBrigadeApplicationId, long groupId) {
		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
						String.valueOf(fireBrigadeApplicationId));
			} catch (Exception e) {
				_log.error("No folder exist with name " + userId);
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(fireBrigadeApplicationId), ROOT_FOLDER_DESCRIPTION,
						false, serviceContext);
			}
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (SystemException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dlFolder;
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