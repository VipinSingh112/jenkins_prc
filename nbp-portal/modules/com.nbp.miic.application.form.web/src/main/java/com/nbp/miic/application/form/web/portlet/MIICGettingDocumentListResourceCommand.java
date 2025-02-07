package com.nbp.miic.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
"mvc.command.name=/miic/getting/document/list" }, service = MVCResourceCommand.class)
public class MIICGettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MIICGettingDocumentListResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		String miicApplciation = ParamUtil.getString(resourceRequest, "miicApplciation");
		String typeOfManufacturer = ParamUtil.getString(resourceRequest, "typeOfManufacturer");
		System.out.println("typeOfManufacturrer-------"+typeOfManufacturer);
		long miicApplicationId = ParamUtil.getLong(resourceRequest, "miicApplicationId");
		String typeOfTransaction=null;
		if(miicApplciation.equals("Safeguard Certification")) {
			typeOfTransaction="Safeguard applications";
			System.out.println("inside safeqaurd mechanism");
		}else if(typeOfManufacturer.equals("Registered Manufacturer")){
			typeOfTransaction="Registered Manufacturer";
		}else if(typeOfManufacturer.equals("Unregistered Manufacturer")) {
			typeOfTransaction="UnRegistered Manufacturer";
		}
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
				(resourceRequest, typeOfTransaction, "miicsupportingdocuments");
		 System.out.println("gettingSupportingDocumentArray---"+gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("miicApplicationId",String.valueOf(miicApplicationId));
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/miic-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
