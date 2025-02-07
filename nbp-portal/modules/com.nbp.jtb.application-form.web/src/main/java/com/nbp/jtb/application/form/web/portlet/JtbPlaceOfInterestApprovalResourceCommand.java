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

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/place/of/interest/info" }, service = MVCResourceCommand.class)
public class JtbPlaceOfInterestApprovalResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbPlaceOfInterestApprovalResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction PLACE OF INTEREST APPROVAL Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String placeOfInterest = ParamUtil.getString(resourceRequest,"placeOfInterest");
		String typeOfRole = ParamUtil.getString(resourceRequest,"typeOfRole");
        String placeInterestOwnerName = ParamUtil.getString(resourceRequest,"placeInterestOwnerName");
        String nameOfInterestLocation = ParamUtil.getString(resourceRequest,"nameOfInterestLocation");
        String placeOfInterestLocation = ParamUtil.getString(resourceRequest,"placeOfInterestLocation");
        String placeOfInterestMailing = ParamUtil.getString(resourceRequest,"placeOfInterestMailing");
        String placeOfInterestTelephone = ParamUtil.getString(resourceRequest,"placeOfInterestTelephone");
        String placeOfInterestEmail = ParamUtil.getString(resourceRequest,"placeOfInterestEmail");
        String placeOfInterestEmployeesNo = ParamUtil.getString(resourceRequest,"placeOfInterestEmployeesNo");
        String placeOfInterestParish = ParamUtil.getString(resourceRequest,"placeOfInterestParish");

	    AttractionPlaceOfInterest placeOfIntApp =null;
		try {
			placeOfIntApp=AttractionPlaceOfInterestLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(placeOfIntApp)) {
			placeOfIntApp = AttractionPlaceOfInterestLocalServiceUtil.createAttractionPlaceOfInterest(CounterLocalServiceUtil.increment());
		}
		placeOfIntApp.setPlaceOfInterest(placeOfInterest);
		placeOfIntApp.setTypeOfRole(typeOfRole);
		placeOfIntApp.setPlaceInterestOwnerName(placeInterestOwnerName);
		placeOfIntApp.setNameOfInterestLocation(nameOfInterestLocation);
		placeOfIntApp.setPlaceOfInterestLocation(placeOfInterestLocation);
		placeOfIntApp.setPlaceOfInterestMailing(placeOfInterestMailing);
		placeOfIntApp.setPlaceOfInterestTelephone(placeOfInterestTelephone);
		placeOfIntApp.setPlaceOfInterestEmail(placeOfInterestEmail);
		placeOfIntApp.setPlaceOfInterestEmployeesNo(placeOfInterestEmployeesNo);
		placeOfIntApp.setPlaceOfInterestParish(placeOfInterestParish);
	    placeOfIntApp.setJtbApplicationId(jtbApplicationId);
	    AttractionPlaceOfInterestLocalServiceUtil.updateAttractionPlaceOfInterest(placeOfIntApp);
		
		return false;
	}

}
