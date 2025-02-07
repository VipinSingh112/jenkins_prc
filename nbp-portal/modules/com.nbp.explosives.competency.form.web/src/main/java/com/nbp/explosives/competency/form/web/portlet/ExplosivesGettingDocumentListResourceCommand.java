package com.nbp.explosives.competency.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + ExplosivesCompetencyApplicationFormPortletKeys.EXPLOSIVESCOMPETENCYAPPLICATIONFORM,
		"mvc.command.name=explosives/getting/document/list" 
		}, 
service = MVCResourceCommand.class)
public class ExplosivesGettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(ExplosivesGettingDocumentListResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List]");
		long explosivesApplicationId = ParamUtil.getLong(resourceRequest, "explosivesApplicationId");
		String explosivesTransactionType = ParamUtil.getString(resourceRequest, "explosivesTransactionType");
		
		String typeOfTransaction=null;
		if(explosivesTransactionType.equals("New Competency Certificate")) {
			typeOfTransaction="Explosive";
		}else if(explosivesTransactionType.equals("Renewal Competency Certificate")) {
		 typeOfTransaction="Renewal";
		}
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
				(resourceRequest, typeOfTransaction, "explosivessupportingdocuments");
		 System.out.println("gettingSupportingDocumentArray---"+gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("explosivesApplicationId",String.valueOf(explosivesApplicationId));
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/explosives-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
