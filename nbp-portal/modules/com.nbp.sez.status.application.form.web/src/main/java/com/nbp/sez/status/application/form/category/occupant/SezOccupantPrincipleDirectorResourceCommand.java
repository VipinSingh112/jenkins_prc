package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector;
import com.nbp.sez.status.application.form.service.service.SezOccupantPrincipleDirectorLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/principle/add/form" }, service = MVCResourceCommand.class)
public class SezOccupantPrincipleDirectorResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(SezOccupantPrincipleDirectorResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String occShareholderName = ParamUtil.getString(resourceRequest, "occShareholderName");
		String occShareholderNationality = ParamUtil.getString(resourceRequest, "occShareholderNationality");
		String occShareholderShares = ParamUtil.getString(resourceRequest, "occShareholderShares");
		String occDirectorShareholderCounter = ParamUtil.getString(resourceRequest, "occDirectorShareholderCounter");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		long shareholderApplicationId = ParamUtil.getLong(resourceRequest, "shareholderApplicationId");
		SezOccupantPrincipleDirector principleDirector = null;
		
		try {
			principleDirector=SezOccupantPrincipleDirectorLocalServiceUtil.getSezOccupantPrincipleDirector(shareholderApplicationId);
		} catch (PortalException e) {
		}
		if(principleDirector==null) {
			principleDirector = SezOccupantPrincipleDirectorLocalServiceUtil
					.createSezOccupantPrincipleDirector(CounterLocalServiceUtil.increment());
			principleDirector.setOccShareholderCounter(occDirectorShareholderCounter);
		}
		// Set all variables to their corresponding values
		principleDirector.setOccShareholderName(occShareholderName);
		principleDirector.setOccShareholderNation(occShareholderNationality);
		principleDirector.setOccShareholderShares(occShareholderShares);
		// Set the application ID
		principleDirector.setSezStatusApplicationId(sezStatusApplicationId);
		// Save the entity to the database
		SezOccupantPrincipleDirectorLocalServiceUtil.updateSezOccupantPrincipleDirector(principleDirector);
		jsonOBJ.put("shareHolderId",principleDirector.getSezOccPrincDirectId());
        jsonOBJ.put("shareHolderCounter",principleDirector.getOccShareholderCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
