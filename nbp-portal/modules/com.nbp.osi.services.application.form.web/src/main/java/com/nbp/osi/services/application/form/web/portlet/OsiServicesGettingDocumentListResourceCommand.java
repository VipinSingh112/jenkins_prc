package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		"mvc.command.name=/osi/services/getting/document/list" }, service = MVCResourceCommand.class)
public class OsiServicesGettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(OsiServicesGettingDocumentListResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		String certificateTypeVal = ParamUtil.getString(resourceRequest, "certificateTypeVal");
		String natureOfApplicant = ParamUtil.getString(resourceRequest, "natureOfApplicant");
		long osiServiceApplicationId = ParamUtil.getLong(resourceRequest, "osiServiceApplicationId");
		String typeOfTransaction=null;
		if(certificateTypeVal.equals("Certificate of Assignment")) {
			typeOfTransaction="Certificate of Assignment";
		}else if(certificateTypeVal.equals("Trustee Licence") && natureOfApplicant.equals("Individual")) {
			typeOfTransaction="Trustee Licence Individual";
		}else if(certificateTypeVal.equals("Trustee Licence")&& natureOfApplicant.equals("Company")) {
			typeOfTransaction="Trustee Licence Company";
		}
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest,
				typeOfTransaction, "osiservicessupportingdocuments");
		_log.info("gettingSupportingDocumentArray---" + gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray", gettingSupportingDocumentArray);
		resourceRequest.setAttribute("osiServiceApplicationId", String.valueOf(osiServiceApplicationId));
		try {
			resourceRequest.getPortletContext()
					.getRequestDispatcher("/supporting-documents/osi-services-documents-list.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
	}

	@Reference
	private CommonsUtil commonsUtil;
}
