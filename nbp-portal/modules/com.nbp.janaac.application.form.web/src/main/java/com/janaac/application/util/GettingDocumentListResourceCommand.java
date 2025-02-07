package com.janaac.application.util;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/janaac/document/list" }, service = MVCResourceCommand.class)

public class GettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(GettingDocumentListResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		String typeOfAccreditation = ParamUtil.getString(resourceRequest, "typeOfAccreditation");
		String typeOFAccreditationService = ParamUtil.getString(resourceRequest, "typeOFAccreditationService");
		long jannacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String transactionType = "";
		if (typeOFAccreditationService.equals("Accreditation of Medical Labs to the ISO 15189 Standard")) {
			transactionType = "Laboratories-Medical";
		} else if (typeOFAccreditationService
				.equals("Accreditation of Testing Labs to the ISO/IEC 17025 Standard")) {
			transactionType = "Laboratories-Testing";
		} else if (typeOFAccreditationService
				.equals("Accreditation of Calibration Labs to the ISO/IEC 17025 Standard")) {
			transactionType = "Laboratories-Testing";
		}else if (typeOFAccreditationService
				.equals("Accreditation of Certification Bodies to the ISO/IEC 17021-1 Standard")) {
			transactionType = "Certification-ISO17021";
		}else if (typeOFAccreditationService
				.equals("Accreditation of Certification Bodies to the ISO/IEC 17024 Standard")) {
			transactionType = "Certification-ISO17024";
		}else if (typeOFAccreditationService
				.equals("Accreditation of Certification Bodies to the ISO/IEC 17065 Standard")) {
			transactionType = "Certification-ISO17065";
		}else if (typeOFAccreditationService
				.equals("Accreditation of Inspection Bodies to the ISO/IEC 17020 Standard")) {
			transactionType = "Inspection Bodies ISO 17020";
		}else if (typeOFAccreditationService
				.contains("FDA TPP Accreditation of 3rd Party Certification Bodies Under the FDA-Food Safety Modernisation Act (FSMA)")) {
			transactionType = "Fda Fsma";
		}
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest,
				transactionType, "janaacsupportingdocuments");
		resourceRequest.setAttribute("documentListJsonArray", gettingSupportingDocumentArray);
		resourceRequest.setAttribute("janaacApplicationId", String.valueOf(jannacApplicationId));
		resourceRequest.setAttribute("typeOFAccreditationService", typeOFAccreditationService);
		try {
			resourceRequest.getPortletContext()
					.getRequestDispatcher("/supporting-documents/janaac-supporting-documents-list.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}

		return false;

	}

	@Reference
	private CommonsUtil commonsUtil;
}
