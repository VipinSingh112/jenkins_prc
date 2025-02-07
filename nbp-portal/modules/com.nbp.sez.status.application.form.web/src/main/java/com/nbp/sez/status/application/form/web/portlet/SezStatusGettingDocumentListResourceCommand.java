package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/getting/document/list" }, service = MVCResourceCommand.class)
public class SezStatusGettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SezStatusGettingDocumentListResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfSezStatus");
		String doYouWantTo = ParamUtil.getString(resourceRequest, "doYouWantTo");
		long sezApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		if(doYouWantTo.contains("Submit an Application for A Work From Home Certificate")) {
			typeOfTransaction="WFH";
			_log.info("[Getting Document List Category Called---]"+typeOfTransaction);
		}
		 JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
				(resourceRequest, typeOfTransaction, "sezsupportingdocuments");
		 System.out.println("gettingSupportingDocumentArray---"+gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("sezApplicationId",String.valueOf(sezApplicationId));
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/sez-status-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
