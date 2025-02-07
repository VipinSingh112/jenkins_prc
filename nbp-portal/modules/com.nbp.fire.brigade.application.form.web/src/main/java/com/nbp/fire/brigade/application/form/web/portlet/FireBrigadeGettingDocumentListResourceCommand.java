package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
			"mvc.command.name=/fire/brigade/getting/document/list"
		},
		service = MVCResourceCommand.class
	)
public class FireBrigadeGettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(FireBrigadeGettingDocumentListResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		_log.info("[Getting Document List of Fire Brigade]");
		long fireApplicationId = ParamUtil.getLong(resourceRequest, "fireApplicationId");
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest, "", "firebrigadesupportingdocuments");
		_log.info("gettingSupportingDocumentArray----"+gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("fireApplicationId",String.valueOf(fireApplicationId));
		_log.info("**********Fire Brigade Application Id"+fireApplicationId);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/fire-brigade-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
		
	}
	@Reference
	private CommonsUtil commonsUtil;
}
