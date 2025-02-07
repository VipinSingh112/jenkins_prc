package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" +JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
			"mvc.command.name=getting/Document/List"
		},
		service = MVCResourceCommand.class
	)
public class JADSCApplicationGettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(JADSCApplicationGettingDocumentListResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		_log.info("[Getting Document List of Fire Brigade]");
		long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest, "Category Not Needed", "jadscsupportingdocuments");
		_log.info("gettingSupportingDocumentArray----"+gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("jadscApplicationId",String.valueOf(jadscApplicationId));
		_log.info("**********jadscApplicationId Id"+jadscApplicationId);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/jadsc-supporting-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
		
	}
	@Reference
	private CommonsUtil commonsUtil;
}
