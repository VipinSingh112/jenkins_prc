package com.nbp.ncra.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(

		property = { "javax.portlet.name="+ NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
				"mvc.command.name=/getting/document/list" }, service = MVCResourceCommand.class)
public class NCRAGettingSupportedDocumentsListResourceCommand implements MVCResourceCommand {
private static Log _log=LogFactoryUtil.getLog(NCRAGettingSupportedDocumentsListResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		String verificationOption = ParamUtil.getString(resourceRequest, "verificationOption");
		String transactionType = "";
		System.out.println("verification---"+verificationOption);
		long ncraApplicationId = ParamUtil.getLong(resourceRequest, "ncraApplicationId");
		
		if(verificationOption.contains("Imported Petrol Sample")) {
			transactionType="Imported Petrol Sample";
		}
		 JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
					(resourceRequest, transactionType, "ncrasupportingdocuments");
		 if(verificationOption.contains("Imported Petrol Sample")) {
			 _log.info("[verificationOption]");
			 resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
			 resourceRequest.setAttribute("ncraApplicationId",String.valueOf(ncraApplicationId));
				try {
					resourceRequest.getPortletContext().getRequestDispatcher
					("/supporting-documents/ncra-supporting-documents-list.jsp").include(resourceRequest, resourceResponse);
				} catch (IOException e) {
				}
		 }
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
