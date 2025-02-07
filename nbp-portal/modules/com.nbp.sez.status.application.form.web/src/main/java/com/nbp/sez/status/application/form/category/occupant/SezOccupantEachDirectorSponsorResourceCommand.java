package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/director/add/form" }, service = MVCResourceCommand.class)
public class SezOccupantEachDirectorSponsorResourceCommand implements MVCResourceCommand {
private static Log _log=LogFactoryUtil.getLog(SezOccupantEachDirectorSponsorResourceCommand.class.getName()); 
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String occAppDate = ParamUtil.getString(resourceRequest, "occAppDate");
        String occDirectorName = ParamUtil.getString(resourceRequest, "occDirectorName");
        String occDirectorStreetAddress = ParamUtil.getString(resourceRequest, "occDirectorStreetAddress");
        String occDirectorZipCode = ParamUtil.getString(resourceRequest, "occDirectorZipCode");
        String occDirectorCountry = ParamUtil.getString(resourceRequest, "occDirectorCountry");
        String counterOccDirector = ParamUtil.getString(resourceRequest, "counterOccDirector");
        long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
        long directorFormApplicationId = ParamUtil.getLong(resourceRequest, "directorFormApplicationId");
        SezOccupantDirectorPartnerSponsorInfo directorPartnerSponsorInfo=null;
        try {
			directorPartnerSponsorInfo=SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.getSezOccupantDirectorPartnerSponsorInfo(directorFormApplicationId);
        } catch (PortalException e1) {
		}
        if(directorPartnerSponsorInfo==null) {
        	 directorPartnerSponsorInfo=SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.createSezOccupantDirectorPartnerSponsorInfo(CounterLocalServiceUtil.increment());
        	 directorPartnerSponsorInfo.setCounter(counterOccDirector);
        }
        try {
			directorPartnerSponsorInfo.setOccAppDate(new SimpleDateFormat("yyyy-MM-dd").parse(occAppDate));
		} catch (ParseException e) {
		}
        directorPartnerSponsorInfo.setOccDirectorName(occDirectorName);
        directorPartnerSponsorInfo.setOccDirectorStreetAddress(occDirectorStreetAddress);
        directorPartnerSponsorInfo.setOccDirectorZipCode(occDirectorZipCode);
        directorPartnerSponsorInfo.setOccDirectorCountry(occDirectorCountry);
        directorPartnerSponsorInfo.setSezStatusApplicationId(sezStatusApplicationId);
      
        // Set the application ID
        directorPartnerSponsorInfo.setSezStatusApplicationId(sezStatusApplicationId);
        // Save the entity to the database
        SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.updateSezOccupantDirectorPartnerSponsorInfo(directorPartnerSponsorInfo);
        jsonOBJ.put("directorId",directorPartnerSponsorInfo.getSezOccDirectSpoId());
        jsonOBJ.put("counter",directorPartnerSponsorInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
