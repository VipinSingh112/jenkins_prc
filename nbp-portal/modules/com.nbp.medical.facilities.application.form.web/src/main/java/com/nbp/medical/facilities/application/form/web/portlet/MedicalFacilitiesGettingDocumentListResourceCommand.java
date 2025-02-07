package com.nbp.medical.facilities.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(immediate = true, property = {
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=medical/facilities/getting/document/list" }, service = MVCResourceCommand.class)
public class MedicalFacilitiesGettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MedicalFacilitiesGettingDocumentListResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		String typeOfTransaction="Category Not Needed";
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
				(resourceRequest, typeOfTransaction, "medicalfacilitiessupportingdocuments");
		 System.out.println("gettingSupportingDocumentArray---"+gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("medicalApplicationId",String.valueOf(medicalApplicationId));
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/medical-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
