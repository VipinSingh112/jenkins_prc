package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileVersionLocalService;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
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
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;
import com.nbp.janaac.upload.document.commands.JanaacApplicationUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/submit/fee/detail/in/janaac" 
			}, 
		service = MVCResourceCommand.class)
public class JanaacFeeDetailsResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(JanaacFeeDetailsResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "JANAAC Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "JANAAC Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		JSONArray jsonArrayWithDownlaodData = JSONFactoryUtil.createJSONArray();
		_log.info("Payment File upload started-----------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String paymentMethod = ParamUtil.getString(resourceRequest, "paymentMethod");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
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
	                dlFolder = JanaacApplicationUtil.createSubFolder((themeDisplay.getUserId()), janaacApplicationId, themeDisplay.getScopeGroupId(), "Fee Reciept", "Janaac Application Fee Reciept");
	                List<DLFileEntry> fileEntries = _dlFileEntryLocalService.getFileEntries(themeDisplay.getScopeGroupId(),dlFolder.getFolderId());
	                for (DLFileEntry fileEntry : fileEntries) {
	                    _dlFileEntryLocalService.deleteDLFileEntry(fileEntry.getFileEntryId()); // Delete old files
	                }

	                // Step 2: Upload the new file
	                mimeType = MimeTypesUtil.getContentType(fileName);
	                title = fileName;
	                serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
	                
	                FileEntry fileEntry = _dlAppLocalService.addFileEntry(
	                        fileName + janaacApplicationId, themeDisplay.getUserId(),
	                        themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName,
	                        mimeType, title, StringPool.BLANK, StringPool.BLANK, fileName,
	                        fileItem, null, null, null, serviceContext);
	                _log.info("-----------------fileEntry-----------------"+fileEntry);
	                // Step 3: Prepare download URL for the newly uploaded file
	                JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
	                jsonArrayWithDownlaodData = commonsUtil.getDownloadUrlForPreview(fileEntry, jsonArray, themeDisplay, jsonObject);
	                _log.info("--------------jsonArrayWithDownlaodData-------------"+jsonArrayWithDownlaodData);
	                
	            }
	        } catch (Exception e) {
	            _log.error("Error uploading file", e);
	        }
		}
		String paymentFee = ParamUtil.getString(resourceRequest, "paymentFee");
		String amountPaid = ParamUtil.getString(resourceRequest, "amountPaid");
		String amountCurrency = ParamUtil.getString(resourceRequest, "amountCurrency");
		_log.info("paymentMethod------" + paymentMethod);
       	JanaacApplicationPayment janaacAppPayment = null;
       	janaacAppPayment = JanaacApplicationPaymentLocalServiceUtil.createJanaacApplicationPayment(janaacApplicationId);
       	janaacAppPayment.setPaymentMethod(paymentMethod);
       	janaacAppPayment.setPaymentFee(paymentFee);
       	janaacAppPayment.setAmountPaid(amountPaid);
       	janaacAppPayment.setAmountCurrency(amountCurrency);
       	janaacAppPayment.setJanaacApplicationId(janaacApplicationId);
       	JanaacApplicationPaymentLocalServiceUtil.updateJanaacApplicationPayment(janaacAppPayment);
		_log.info("Payment File upload end-----------------------");
		try {
			resourceResponse.getWriter().print(jsonArrayWithDownlaodData.toString());
		} catch (IOException e) {
		}
		return false;
	}

	private DLFolder createFolder(long userId, long janaacApplicationId, long groupId) {
		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
						String.valueOf(janaacApplicationId));
			} catch (Exception e) {
				_log.error("No folder exist with name " + userId);
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(janaacApplicationId), ROOT_FOLDER_DESCRIPTION, false,
						serviceContext);
			}
		} catch (PortalException e1) {
		} catch (SystemException e1) {
		} catch (Exception e) {
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