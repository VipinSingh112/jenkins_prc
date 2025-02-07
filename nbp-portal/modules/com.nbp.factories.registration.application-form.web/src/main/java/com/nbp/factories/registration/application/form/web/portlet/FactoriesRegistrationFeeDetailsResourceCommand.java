package com.nbp.factories.registration.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
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
import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;
import com.nbp.factories.registration.application.form.services.service.FactoriesAppPaymentLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;
import com.nbp.factories.registration.application.util.FactoriesRegistrationApplicationUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
		"mvc.command.name=factories/fee/Details/Url"
}, service = MVCResourceCommand.class)
public class FactoriesRegistrationFeeDetailsResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Factories Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "Factories Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(FactoriesRegistrationFeeDetailsResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Payment File upload started-----------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String paymentMethod = ParamUtil.getString(resourceRequest, "paymentMethod");
		long factoriesApplicationId = ParamUtil.getLong(resourceRequest, "factoriesApplicationId");
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		JSONArray jsonArrayWithDownloadData = JSONFactoryUtil.createJSONArray();

		if (!paymentMethod.equals("Credit Card")) {
			String fileID = ParamUtil.getString(resourceRequest, "fileID");
			String mimeType = StringPool.BLANK;
			String title = StringPool.BLANK;
			ServiceContext serviceContext;
			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
			String fileName = uploadPortletRequest.getFileName(fileID);
			File fileItem = uploadPortletRequest.getFile(fileID);
			DLFolder dlFolder;

			try {
				if (Validator.isNotNull(fileName)) {
					// Step 1: Delete existing files in the folder
					dlFolder = FactoriesRegistrationApplicationUtil.createSubFolder(
							themeDisplay.getUserId(), factoriesApplicationId, themeDisplay.getScopeGroupId(),
							"Fee Reciept", "Factory Registration Fee Reciept");

					List<DLFileEntry> fileEntries = _dlFileEntryLocalService.getFileEntries(
							themeDisplay.getScopeGroupId(), dlFolder.getFolderId());
					for (DLFileEntry fileEntry : fileEntries) {
						_dlFileEntryLocalService.deleteDLFileEntry(fileEntry.getFileEntryId());
					}

					// Step 2: Upload the new file
					mimeType = MimeTypesUtil.getContentType(fileName);
					title = fileName;
					serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
					FileEntry fileEntry = _dlAppLocalService.addFileEntry(
							fileName + factoriesApplicationId, themeDisplay.getUserId(),
							themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName, mimeType, title,
							StringPool.BLANK, StringPool.BLANK, fileName, fileItem, null, null, null, serviceContext);

					// Step 3: Prepare download URL for the uploaded file
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonArrayWithDownloadData = commonsUtil.getDownloadUrlForPreview(fileEntry, jsonArray, themeDisplay, jsonObject);
				}
			} catch (Exception e) {
				_log.error("Error uploading file", e);
			}
		}

		// Save payment details
		String paymentFee = ParamUtil.getString(resourceRequest, "paymentFee");
		String amountPaid = ParamUtil.getString(resourceRequest, "amountPaid");
		String amountCurrency = ParamUtil.getString(resourceRequest, "amountCurrency");
		FactoriesAppPayment factoriesAppPayment = FactoriesAppPaymentLocalServiceUtil.createFactoriesAppPayment(
				CounterLocalServiceUtil.increment());
		factoriesAppPayment.setPaymentMethod(paymentMethod);
		factoriesAppPayment.setPaymentFee(paymentFee);
		factoriesAppPayment.setAmountPaid(amountPaid);
		factoriesAppPayment.setAmountCurrency(amountCurrency);
		factoriesAppPayment.setFactoriesApplicationId(factoriesApplicationId);
		FactoriesAppPaymentLocalServiceUtil.updateFactoriesAppPayment(factoriesAppPayment);

		_log.info("Payment File upload end-----------------------");
		try {
			resourceResponse.getWriter().print(jsonArrayWithDownloadData);
		} catch (IOException e) {
			_log.error("Error writing response", e);
		}
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
