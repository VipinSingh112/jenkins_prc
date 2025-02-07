package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest;
import com.nbp.jtb.application.form.service.service.AttractionPlaceOfInterestLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/place/of/interest/general/declare/info" }, service = MVCResourceCommand.class)
public class JtbPlaceOfInterestGeneralDeclareResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbPlaceOfInterestGeneralDeclareResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction PLACE OF INTEREST GENERAL DECALRATION Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
        String placeOfInterestOwnerName = ParamUtil.getString(resourceRequest,"placeOfInterestOwnerName");
        String placeOfInterestGenHotelLaws = ParamUtil.getString(resourceRequest,"placeOfInterestGenHotelLaws");
        String placeOfInterestGenDate = ParamUtil.getString(resourceRequest,"placeOfInterestGenDate");
        String placeOfInterestGenName = ParamUtil.getString(resourceRequest,"placeOfInterestGenName");
        String placeOfInterestGenOperatingSince = ParamUtil.getString(resourceRequest,"placeOfInterestGenOperatingSince");
        String placeOfInterestGenAcresLand = ParamUtil.getString(resourceRequest,"placeOfInterestGenAcresLand");
        String walkingTour = ParamUtil.getString(resourceRequest,"walkingtour");
        String cemeteryTour = ParamUtil.getString(resourceRequest,"cemeterytour");
        String gardenTour = ParamUtil.getString(resourceRequest,"gardentour");
        String placeOfInterestGenRooms = ParamUtil.getString(resourceRequest,"placeOfInterestGenRooms");
        String placeOfInterestGenTentSpace = ParamUtil.getString(resourceRequest,"placeOfInterestGenTentSpace");
        String placeOfInterestGenShowers = ParamUtil.getString(resourceRequest,"placeOfInterestGenShowers");
        String placeOfInterestGenSanitaryConveniences = ParamUtil.getString(resourceRequest,"placeOfInterestGenSanitaryConveniences");
        String placeOfInterestSignDate = ParamUtil.getString(resourceRequest,"placeOfInterestSignDate");

	    AttractionPlaceOfInterest placeOfInterestGen =null;
		try {
			placeOfInterestGen=AttractionPlaceOfInterestLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(placeOfInterestGen)) {
			placeOfInterestGen = AttractionPlaceOfInterestLocalServiceUtil.createAttractionPlaceOfInterest(CounterLocalServiceUtil.increment());
		}
		placeOfInterestGen.setPlaceOfInterestHotelLaws(placeOfInterestGenHotelLaws);
		try {
			placeOfInterestGen.setPlaceOfInterestDate(new SimpleDateFormat("yyyy-MM-dd").parse(placeOfInterestGenDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		placeOfInterestGen.setPlaceOfInterestName(placeOfInterestGenName);
		try {
			placeOfInterestGen.setPlaceOfInterestOperating(new SimpleDateFormat("yyyy-MM-dd").parse(placeOfInterestGenOperatingSince));
		} catch (Exception e) {
			// TODO: handle exception
		}
		placeOfInterestGen.setPlaceOfInterestOwnerGenDec(placeOfInterestOwnerName);
		placeOfInterestGen.setPlaceOfInterestAcresLand(placeOfInterestGenAcresLand);
		placeOfInterestGen.setWalkingTour(walkingTour);
		placeOfInterestGen.setCemeteryTour(cemeteryTour);
		placeOfInterestGen.setGardenTour(gardenTour);
		placeOfInterestGen.setPlaceOfInterestRooms(placeOfInterestGenRooms);
		placeOfInterestGen.setPlaceOfInterestTentSpace(placeOfInterestGenTentSpace);
		placeOfInterestGen.setPlaceOfInterestShowers(placeOfInterestGenShowers);
		placeOfInterestGen.setPlaceOfInterestSanitary(placeOfInterestGenSanitaryConveniences);
		try {
			placeOfInterestGen.setPlaceOfInterestSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(placeOfInterestSignDate));
		}catch(Exception e) {}
	    placeOfInterestGen.setJtbApplicationId(jtbApplicationId);
	    AttractionPlaceOfInterestLocalServiceUtil.updateAttractionPlaceOfInterest(placeOfInterestGen);
		
		return false;
	}

}
