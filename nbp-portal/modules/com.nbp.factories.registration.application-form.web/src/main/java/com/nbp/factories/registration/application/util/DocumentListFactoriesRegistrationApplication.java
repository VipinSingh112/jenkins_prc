package com.nbp.factories.registration.application.util;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(

		property = {
				"javax.portlet.name="
						+ FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
				"mvc.command.name=getting/Document/List/Factories/Url" }, service = MVCResourceCommand.class)

public class DocumentListFactoriesRegistrationApplication  implements MVCResourceCommand {
private static Log _log=LogFactoryUtil.getLog(DocumentListFactoriesRegistrationApplication.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		_log.info("[Getting Document List of Factories Registration]");
		long factoriesApplicationId = ParamUtil.getLong(resourceRequest, "factoriesApplicationId");
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest, "Category Not Needed", "factoriessupportingdocuments");
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("factoriesApplicationId",String.valueOf(factoriesApplicationId));
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/factories-registration-supporting-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
		
	}
	@Reference
	private CommonsUtil commonsUtil;
}
