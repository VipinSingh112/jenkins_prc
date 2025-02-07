package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=jadsc/Delete/Document/Url" }, service = MVCResourceCommand.class)
public class JADSCApplicationDeleteSupportedDocumentsResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(JADSCApplicationDeleteSupportedDocumentsResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long fileEntryId = ParamUtil.getLong(resourceRequest, "fileEntryId");
		try {
			DLFileEntryLocalServiceUtil.deleteDLFileEntry(fileEntryId);
		} catch (PortalException e) {
			_log.error(e.getMessage());
		}
		return false;
	}
}