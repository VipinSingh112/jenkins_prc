package com.nbp.medical.facilities.application.form.web.portlet;

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
import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment;
import com.nbp.medical.facilities.application.form.service.service.MedicalFaciltiesPaymentLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;
import com.nbp.medical.facilities.application.util.MedicalFacilitiesApplicationUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
	( immediate = true, 
	  property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=/fee/medical/payment/url" }, service = MVCResourceCommand.class)

public class MedicalFaciltiesFeeDetailsResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Medical Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "Medical Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(MedicalFaciltiesFeeDetailsResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		JSONArray jsonArray= JSONFactoryUtil.createJSONArray();
		JSONArray jsonArrayWithDownlaodData= JSONFactoryUtil.createJSONArray();

		JSONObject jsonObj= JSONFactoryUtil.createJSONObject();
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		_log.info("Payment File upload started-----------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String paymentMethod = ParamUtil.getString(resourceRequest, "paymentMethod");
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
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
		                dlFolder = MedicalFacilitiesApplicationUtil.createSubFolder((themeDisplay.getUserId()), medicalApplicationId, themeDisplay.getScopeGroupId(), "Fee Reciept", "Medical Application Fee Reciept");
		                List<DLFileEntry> fileEntries = _dlFileEntryLocalService.getFileEntries(themeDisplay.getScopeGroupId(),dlFolder.getFolderId());
		                for (DLFileEntry fileEntry : fileEntries) {
		                    _dlFileEntryLocalService.deleteDLFileEntry(fileEntry.getFileEntryId()); // Delete old files
		                }

		                // Step 2: Upload the new file
		                mimeType = MimeTypesUtil.getContentType(fileName);
		                title = fileName;
		                serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
		                
		                FileEntry fileEntry = _dlAppLocalService.addFileEntry(
		                        fileName + medicalApplicationId, themeDisplay.getUserId(),
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
		MedicalFaciltiesPayment medicalPayment = null;
		try {
			medicalPayment=MedicalFaciltiesPaymentLocalServiceUtil.getMedicalAppById(medicalApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(medicalPayment)) {
		medicalPayment = MedicalFaciltiesPaymentLocalServiceUtil.createMedicalFaciltiesPayment(CounterLocalServiceUtil.increment());
		}
		medicalPayment.setPaymentMethod(paymentMethod);
		medicalPayment.setPaymentFee(paymentFee);
		medicalPayment.setAmountPaid(amountPaid);
		medicalPayment.setAmountCurrency(amountCurrency);
		medicalPayment.setMedicalFacilitiesAppId(medicalApplicationId);
		MedicalFaciltiesPaymentLocalServiceUtil.updateMedicalFaciltiesPayment(medicalPayment);
		_log.info("Payment File upload end-----------------------");
		try {
			resourceResponse.getWriter().print(jsonArrayWithDownlaodData.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	private DLFolder createFolder(long userId, long medicalApplicationId, long groupId) {
		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
						String.valueOf(medicalApplicationId));
			} catch (Exception e) {
				_log.error("No folder exist with name " + userId);
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(medicalApplicationId), ROOT_FOLDER_DESCRIPTION,
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