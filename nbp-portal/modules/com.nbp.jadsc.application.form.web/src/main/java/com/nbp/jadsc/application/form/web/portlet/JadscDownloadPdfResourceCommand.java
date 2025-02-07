package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.jadsc.application.documents.util.JADSCApplicationFormDocumentUploadUtil;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.io.File;
import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
			"mvc.command.name=jadsc/Download/PDF",
		},
		service = MVCResourceCommand.class
	)
			public class JadscDownloadPdfResourceCommand implements MVCResourceCommand{
				private static Log _log = LogFactoryUtil.getLog(JadscDownloadPdfResourceCommand.class);
				private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
				private static String ROOT_FOLDER_NAME = "JADSC Supported Documents";
				private static String ROOT_FOLDER_DESCRIPTION = "JADSC Supported Documents";

				@Override
				public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
						throws PortletException {
					JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
					JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
					ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
					long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
					String checkPdfDownloadWithoutDocument = ParamUtil.getString(resourceRequest, "checkPdfDownloadWithoutDocument");
					DLFileEntry dlFileEntry = null;
					String mimeType = StringPool.BLANK;
					String title = StringPool.BLANK;
					JADSCApplication jadscApplication=null;
					try {
						jadscApplication =JADSCApplicationLocalServiceUtil.getJADSCApplication(jadscApplicationId);
					}catch (Exception e) {
					}
					System.out.println("----------before replace jadsc pdf var--------------------");
					try {
						String pdfTemplate = commonsUtil.replaceJadscApplicationPdfVar(jadscApplication.getTypeOfApplicant(),jadscApplication.getBreachOfConfidentiality(), jadscApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
//					 it converted template into file
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"other-crafttrader", pdfTemplate);
						String fileNameContentDisp = "JadscApplicationPDF.pdf";
						mimeType = MimeTypesUtil.getContentType(file);
						title = fileNameContentDisp;
						ServiceContext serviceContext = new ServiceContext();
						serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
						  DLFolder dlFolder = createFolder(themeDisplay.getUserId(), jadscApplicationId, themeDisplay.getScopeGroupId()); 
						  DLFolder JADSCAppDlFolder=null;
						  JADSCAppDlFolder= JADSCApplicationFormDocumentUploadUtil.createSubFolder(themeDisplay.getUserId(), jadscApplicationId, themeDisplay.getScopeGroupId(),   "JADSC Application Form PDF", "JADSC Application Form PDF");
						commonsUtil.updateFolderPermission(JADSCAppDlFolder);
						FileEntry docFileEntry = null;
						FileEntry entry=null;
						long fileEntryId=0;
						String pdfDownloadURL = "";
						try {
						entry=DLAppLocalServiceUtil.getFileEntryByFileName(themeDisplay.getScopeGroupId(), JADSCAppDlFolder.getFolderId(), fileNameContentDisp);
						fileEntryId=entry.getFileEntryId();
						} catch (Exception e) {
							e.printStackTrace();
						}
						if(entry==null) {
						try {
							docFileEntry=	_dlAppService.addFileEntry("JadscApplicationPDF" + jadscApplicationId, JADSCAppDlFolder.getRepositoryId(),
									JADSCAppDlFolder.getFolderId(), fileNameContentDisp, mimeType, title, null, StringPool.BLANK,
									StringPool.BLANK, file, null, null, null, serviceContext);
							commonsUtil.filePermissionForDownload(docFileEntry);
							pdfDownloadURL = DLURLHelperUtil.getDownloadURL(docFileEntry, docFileEntry.getFileVersion(), themeDisplay,
									StringPool.BLANK, false, true);
							dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntryByExternalReferenceCode("JadscApplicationPDF" + jadscApplicationId,
									jadscApplication.getGroupId());
							docFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
							jadscApplication.setPdfFileEntryId(dlFileEntry.getFileEntryId());
							JADSCApplicationLocalServiceUtil.updateJADSCApplication(jadscApplication);
							jsonOBJ.put("fileUrl", pdfDownloadURL);
						} catch (Exception e) {
						}
						}else {
							_dlAppService.deleteFileEntry(fileEntryId);
							docFileEntry=	_dlAppService.addFileEntry("JadscApplicationPDF" + jadscApplicationId, JADSCAppDlFolder.getRepositoryId(),
									JADSCAppDlFolder.getFolderId(), fileNameContentDisp, mimeType, title, null, StringPool.BLANK,
									StringPool.BLANK, file, null, null, null, serviceContext);
							pdfDownloadURL = DLURLHelperUtil.getDownloadURL(docFileEntry, docFileEntry.getFileVersion(), themeDisplay,
									StringPool.BLANK, false, true);
							commonsUtil.filePermissionForDownload(docFileEntry);
							dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntryByExternalReferenceCode("JadscApplicationPDF" + jadscApplicationId,
									jadscApplication.getGroupId());
							docFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
							jadscApplication.setPdfFileEntryId(dlFileEntry.getFileEntryId());
							JADSCApplicationLocalServiceUtil.updateJADSCApplication(jadscApplication);
							jsonOBJ.put("fileUrl", pdfDownloadURL);
						}
						_log.info("************Download Pdf URL New File Added*************" + pdfDownloadURL);
						jadscApplication = JADSCApplicationLocalServiceUtil.getJADSCApplication(jadscApplicationId);
			            
						jsonFeed.put("APP_DATA", jsonOBJ);
						resourceResponse.setContentType("application/json");
						try {
							resourceResponse.getWriter().write(jsonFeed.toString());
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (PortalException e1) {
						e1.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
						e.getCause();
						e.getMessage();
					}
					return false;
				}
				private DLFolder createFolder(long userId, long jadscApplicationId, long groupId) {

					DLFolder dlFolder = null;
					long repositoryId = groupId;
					try {
						ServiceContext serviceContext = new ServiceContext();
						DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
						try {
							dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
									String.valueOf(jadscApplicationId));
						} catch (Exception e) {
							e.printStackTrace();
						}
						if (Validator.isNull(dlFolder)) {
							dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
									rootFolder.getFolderId(), String.valueOf(jadscApplicationId), ROOT_FOLDER_DESCRIPTION, false,
									serviceContext);
						}else {
							 dlFolder=DLFolderLocalServiceUtil.getDLFolder(jadscApplicationId);
						}
					} catch (PortalException e1) {
					} catch (SystemException e1) {
					} catch (Exception e) {
						e.printStackTrace();
					}

					return dlFolder;
				}
				@Reference
				private CommonsUtil commonsUtil;
				@Reference
				private Portal _portal;
				@Reference
				DLAppService _dlAppService;

				@Reference
				DLAppLocalService _dlAppLocalService;
			}
