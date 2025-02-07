package com.nbp.wra.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/wra/application/getting/document/list" }, service = MVCResourceCommand.class)
public class WRAApplicationDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(WRAApplicationDocumentListResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		String typeOfApplication =HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfApplication"));
		String typeOfTransaction =HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
		
		long wraApplicationId = ParamUtil.getLong(resourceRequest, "wraApplicationId");
		String transactionType = "";
		 if (typeOfApplication.equals("Application for a Licence to Abstract & User Water")) {
				transactionType = "Licence To Abstract";
		} 
		 if (typeOfApplication.contains("Application for a Licence to Abstract & User Water") && typeOfTransaction.contains("Licence Renewal")) {
			transactionType = "Licence To Abstract Renew";
		} 
		 if (typeOfApplication
				.equals("Application for a Permit to Drill a Well")) {
			transactionType = "Permit To Drill Well";
		} 
		 if (typeOfApplication
				.equals("Application for a Well Drillers Licence")) {
			transactionType = "Well Driller Licence";
		} 
		System.out.println("transaction--------------"+transactionType);
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest,
				transactionType, "wrasupportingdocuments");
		resourceRequest.setAttribute("documentListJsonArray", gettingSupportingDocumentArray);
		resourceRequest.setAttribute("wraApplicationId", String.valueOf(wraApplicationId));
		try {
			resourceRequest.getPortletContext()
					.getRequestDispatcher("/supporting-documents/wra-supporting-documents-list.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}

		return false;

	}

	@Reference
	private CommonsUtil commonsUtil;
}