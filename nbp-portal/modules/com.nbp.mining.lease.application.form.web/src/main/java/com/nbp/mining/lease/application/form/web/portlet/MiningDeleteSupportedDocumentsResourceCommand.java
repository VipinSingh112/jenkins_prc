package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=mining/Delete/Document/Url" }, service = MVCResourceCommand.class)
public class MiningDeleteSupportedDocumentsResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MiningDeleteSupportedDocumentsResourceCommand.class.getName());

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