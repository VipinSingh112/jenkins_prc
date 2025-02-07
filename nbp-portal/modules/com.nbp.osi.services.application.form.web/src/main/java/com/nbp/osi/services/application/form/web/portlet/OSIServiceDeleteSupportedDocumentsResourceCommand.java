package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		"mvc.command.name=/osi/service/delete/document/url" }, service = MVCResourceCommand.class)


public class OSIServiceDeleteSupportedDocumentsResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		long fileEntryId= ParamUtil.getLong(resourceRequest, "fileEntryId");
		try {
			DLFileEntryLocalServiceUtil.deleteDLFileEntry(fileEntryId);
		} catch (PortalException e) {
			e.getMessage();
			// TODO Auto-generated catch block
		}
		
		return false;
	}

}
