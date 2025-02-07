package com.nbp.janaac.application.form.web.portlet;

import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/delete/document/url" }, service = MVCResourceCommand.class)
public class DeleteSupportedDocumentsResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long fileEntryId = ParamUtil.getLong(resourceRequest, "fileEntryId");

		try {
			DLFileEntryLocalServiceUtil.deleteDLFileEntry(fileEntryId);
		} catch (PortalException e) {
		}
		return false;
	}

}
