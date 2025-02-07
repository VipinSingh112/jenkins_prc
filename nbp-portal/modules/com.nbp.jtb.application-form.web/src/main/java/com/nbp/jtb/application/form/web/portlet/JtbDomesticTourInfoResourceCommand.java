package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionDomesticTour;
import com.nbp.jtb.application.form.service.service.AttractionDomesticTourLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/domestic/tour/info" }, service = MVCResourceCommand.class)
public class JtbDomesticTourInfoResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbDomesticTourInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction DOMESTIC TOUR Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String domesticTourApplicantName = ParamUtil.getString(resourceRequest, "domesticTourApplicantName");
        String domesticTourAddress = ParamUtil.getString(resourceRequest, "domesticTourAddress");
        String domesticTourCompanyName = ParamUtil.getString(resourceRequest, "domesticTourCompanyName");
        String domesticTourExactLocation = ParamUtil.getString(resourceRequest, "domesticTourExactLocation");
        String domesticTourTelephone = ParamUtil.getString(resourceRequest, "domesticTourTelephone");
        String domesticTourEmail = ParamUtil.getString(resourceRequest, "domesticTourEmail");
        String domesticTourDate = ParamUtil.getString(resourceRequest, "domesticTourDate");
        String domesticTourManagerName = ParamUtil.getString(resourceRequest, "domesticTourManagerName");
        String domesticTourVehiclesNumber = ParamUtil.getString(resourceRequest, "domesticTourVehiclesNumber");
        String domesticTourEmployeesNo = ParamUtil.getString(resourceRequest, "domesticTourEmployeesNo");
        String domesticTourOfficeLocation = ParamUtil.getString(resourceRequest, "domesticTourOfficeLocation");
        String domesticTourSignDate = ParamUtil.getString(resourceRequest, "domesticTourSignDate");


		AttractionDomesticTour domesticTour =null;
		try {
			domesticTour=AttractionDomesticTourLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(domesticTour)) {
			domesticTour = AttractionDomesticTourLocalServiceUtil.createAttractionDomesticTour(CounterLocalServiceUtil.increment());
		}
		 domesticTour.setDomesticTourApplicantName(domesticTourApplicantName);
		    domesticTour.setDomesticTourAddress(domesticTourAddress);
		    domesticTour.setDomesticTourCompanyName(domesticTourCompanyName);
		    domesticTour.setDomesticTourExactLocation(domesticTourExactLocation);
		    domesticTour.setDomesticTourTelephone(domesticTourTelephone);
		    domesticTour.setDomesticTourEmail(domesticTourEmail);
		    try {
		    	domesticTour.setDomesticTourDate(new SimpleDateFormat("yyyy-MM-dd").parse(domesticTourDate));
			} catch (Exception e) {
				// TODO: handle exception
			}
		    domesticTour.setDomesticTourManagerName(domesticTourManagerName);
		    domesticTour.setDomesticTourVehiclesNum(domesticTourVehiclesNumber);
		    domesticTour.setDomesticTourEmployeesNo(domesticTourEmployeesNo);
		    domesticTour.setDomesticTourOfficeLocation(domesticTourOfficeLocation);
		    try {
		    	domesticTour.setDomesticTourSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(domesticTourSignDate));
			} catch (Exception e) {
				// TODO: handle exception
			}
		domesticTour.setJtbApplicationId(jtbApplicationId);
		AttractionDomesticTourLocalServiceUtil.updateAttractionDomesticTour(domesticTour);
		
		return false;
	}

}
