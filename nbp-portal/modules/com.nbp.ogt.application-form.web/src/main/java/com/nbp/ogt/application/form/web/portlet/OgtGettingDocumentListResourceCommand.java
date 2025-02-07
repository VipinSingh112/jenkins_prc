package com.nbp.ogt.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
	"mvc.command.name=/ogt/getting/document/list" }, service = MVCResourceCommand.class)

public class OgtGettingDocumentListResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(OgtGettingDocumentListResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		long ogtApplicationId = ParamUtil.getLong(resourceRequest, "ogtApplicationId");
		String doYouWant = ParamUtil.getString(resourceRequest, "doYouWant");
		String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String natureOfApplicant = ParamUtil.getString(resourceRequest, "natureOfApplicant");
		String typeOfMatter = ParamUtil.getString(resourceRequest, "typeOfMatter");
		String typeOfDebt = ParamUtil.getString(resourceRequest, "typeOfDebt");
		/*
		 * if(doYouWantTo.
		 * contains("Submit an Application for A Work From Home Certificate")) {
		 * typeOfTransaction="WFH";
		 * _log.info("[Getting Document List Category Called---]"+typeOfTransaction); }
		 */
		 JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
				(resourceRequest, "Individual", "ogtsupportingdocuments");
		 System.out.println("gettingSupportingDocumentArray---"+gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("ogtApplicationId",String.valueOf(ogtApplicationId));
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/ogt-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
