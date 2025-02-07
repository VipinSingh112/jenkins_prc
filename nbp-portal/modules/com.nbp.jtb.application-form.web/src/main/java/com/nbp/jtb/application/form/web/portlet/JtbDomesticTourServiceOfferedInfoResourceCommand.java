package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionDomesticService;
import com.nbp.jtb.application.form.service.service.AttractionDomesticServiceLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/domestic/tour/service/info" }, service = MVCResourceCommand.class)
public class JtbDomesticTourServiceOfferedInfoResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbDomesticTourServiceOfferedInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction DOMESTIC TOUR SERVICE Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		  String individualsapartment = ParamUtil.getString(resourceRequest, "individualsapartment");
	        String airportassistance = ParamUtil.getString(resourceRequest, "airportassistance");
	        String entiretour = ParamUtil.getString(resourceRequest, "entiretour");
	        String transfersdeparture = ParamUtil.getString(resourceRequest, "transfersdeparture");
	        String individualgroups = ParamUtil.getString(resourceRequest, "individualgroups");
	        String organizedconjunction = ParamUtil.getString(resourceRequest, "organizedconjunction");
	        String dailytransportation = ParamUtil.getString(resourceRequest, "dailytransportation");
	        String entertainment = ParamUtil.getString(resourceRequest, "entertainment");
	        String domesticTourSealDate = ParamUtil.getString(resourceRequest, "domesticTourSealDate");

		AttractionDomesticService domesticService =null;
		try {
			domesticService=AttractionDomesticServiceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(domesticService)) {
			domesticService = AttractionDomesticServiceLocalServiceUtil.createAttractionDomesticService(CounterLocalServiceUtil.increment());
		}
		 domesticService.setIndividualsApartment(individualsapartment);
	        domesticService.setAirportAssistance(airportassistance);
	        domesticService.setEntireTour(entiretour);
	        domesticService.setTransfersDeparture(transfersdeparture);
	        domesticService.setIndividualGroups(individualgroups);
	        domesticService.setOrganizedconJunction(organizedconjunction);
	        domesticService.setDailyTransportation(dailytransportation);
	        domesticService.setEntertainment(entertainment);
		    try {
		    	domesticService.setDomesticTourSealDate(new SimpleDateFormat("yyyy-MM-dd").parse(domesticTourSealDate));
			} catch (Exception e) {
				// TODO: handle exception
			}
		domesticService.setJtbApplicationId(jtbApplicationId);
		AttractionDomesticServiceLocalServiceUtil.updateAttractionDomesticService(domesticService);
		
		return false;
	}

}
