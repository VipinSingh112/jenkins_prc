package com.nbp.mining.lease.application.form.web.portlet;

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
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningAppPayment;
import com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil;
import com.nbp.mining.lease.application.service.model.MiningAppPayment;
import com.nbp.mining.lease.application.service.service.MiningAppPaymentLocalServiceUtil;
import com.nbp.mining.upload.document.commands.MiningApplicationUtil;

import java.io.File;
import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
	( immediate = true, 
	  property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=/mining/fee/payment" }, service = MVCResourceCommand.class)

public class MiningFeeDetailsResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Mining Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "Mining Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(MiningFeeDetailsResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		_log.info("Payment File upload started-----------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String paymentMethod = ParamUtil.getString(resourceRequest, "paymentMethod");
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
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
					mimeType = MimeTypesUtil.getContentType(fileName);
					title = fileName;
					serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
					dlFolder =MiningApplicationUtil.createSubFolder(
							(themeDisplay.getUserId()), miningLeaseApplicationId, themeDisplay.getScopeGroupId(),
						"Fee Reciept", "Mining Application Fee Reciept");
					FileEntry fileEntry = _dlAppLocalService.addFileEntry(fileName + miningLeaseApplicationId, themeDisplay.getUserId(),
							themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName, mimeType, title,
							StringPool.BLANK, StringPool.BLANK, fileName, fileItem, null, null, null, serviceContext);
					JSONObject jsonObject= JSONFactoryUtil.createJSONObject();
					jsonArrayWithDownlaodData=commonsUtil.getDownloadUrlForPreview(fileEntry,jsonArray,themeDisplay,jsonObject);
					System.out.println("jsonArrayWithDownlaodData in fee section******"+jsonArrayWithDownlaodData);
				}
			} catch (Exception e) {
			}
		}
		String paymentFee = ParamUtil.getString(resourceRequest, "paymentFee");
		String amountPaid = ParamUtil.getString(resourceRequest, "amountPaid");
		String amountCurrency = ParamUtil.getString(resourceRequest, "amountCurrency");
		_log.info("paymentMethozd------" + paymentMethod);
		MiningAppPayment miningPayment = null;
		miningPayment = MiningAppPaymentLocalServiceUtil.createMiningAppPayment(CounterLocalServiceUtil.increment());
		miningPayment.setPaymentMethod(paymentMethod);
		miningPayment.setPaymentFee(paymentFee);
		miningPayment.setAmountPaid(amountPaid);
		miningPayment.setAmountCurrency(amountCurrency);
		miningPayment.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningAppPaymentLocalServiceUtil.updateMiningAppPayment(miningPayment);
		_log.info("Payment File upload end-----------------------");
		try {
			resourceResponse.getWriter().print(jsonArrayWithDownlaodData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	private DLFolder createFolder(long userId, long miningLeaseApplicationId, long groupId) {
		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
						String.valueOf(miningLeaseApplicationId));
			} catch (Exception e) {
				_log.error("No folder exist with name " + userId);
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(miningLeaseApplicationId), ROOT_FOLDER_DESCRIPTION,
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