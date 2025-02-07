package com.nbp.hsra.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true, 
		property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/application/getting/document/list" }, service = MVCResourceCommand.class)
public class HSRAApplicationDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HSRAApplicationDocumentListResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		String typeOfApplicant =HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfApplicant"));
		String typeOfActivities =HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfActivities"));
		
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String transactionType = "";
		 if (typeOfApplicant.equals("Users of Radiation Sources") || typeOfApplicant.equals("Service Providers")  ) {
				transactionType = "Users of Radiation Sources";
		} 
		 if (typeOfApplicant.equals("Brokers")) {
			transactionType = "Brokers";
		} 
		 if (typeOfApplicant.equals("Qualified Experts")) {
			transactionType = "Qualified Experts";
		} 
		 
		System.out.println("transaction--------------"+transactionType);
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest,
				transactionType, "hsrasupportingdocumentses");
		resourceRequest.setAttribute("documentListJsonArray", gettingSupportingDocumentArray);
		resourceRequest.setAttribute("hsraApplicationId", String.valueOf(hsraApplicationId));
		try {
			resourceRequest.getPortletContext()
					.getRequestDispatcher("/supporting-documents/hsra-supporting-documents-list.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}

		return false;

	}

	@Reference
	private CommonsUtil commonsUtil;
}