package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionWaterSport;
import com.nbp.jtb.application.form.service.service.AttractionWaterSportLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/water/sport/info" }, service = MVCResourceCommand.class)
public class JtbWaterSportDetailsResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbWaterSportDetailsResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction WATER SPORT DETAIL Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String waterSportBusinessName =  ParamUtil.getString(resourceRequest,"waterSportBusinessName");
        String waterSportMailingaAdd =  ParamUtil.getString(resourceRequest,"waterSportMailingaAdd");
        String waterSportOpLocationAddress =  ParamUtil.getString(resourceRequest,"waterSportOpLocationAddress");
        String waterSportOpPhone =  ParamUtil.getString(resourceRequest,"waterSportOpPhone");
        String waterSportOpEmail =  ParamUtil.getString(resourceRequest,"waterSportOpEmail");
        String waterSportOpOwnerName =  ParamUtil.getString(resourceRequest,"waterSportOpOwnerName");
        String waterSportOpAddressOwner =  ParamUtil.getString(resourceRequest,"waterSportOpAddressOwner");
        String waterSportOpManagerName =  ParamUtil.getString(resourceRequest,"waterSportOpManagerName");
        String waterSportOpApplicantName =  ParamUtil.getString(resourceRequest,"waterSportOpApplicantName");
        String waterSportOpNationality =  ParamUtil.getString(resourceRequest,"waterSportOpNationality");
        String waterSportOpEmployeesNo =  ParamUtil.getString(resourceRequest,"waterSportOpEmployeesNo");
        String waterSportOpActivitiesList =  ParamUtil.getString(resourceRequest,"waterSportOpActivitiesList");
        String occupyLocation =  ParamUtil.getString(resourceRequest,"occupyLocation");
        String proposalSubmitted =  ParamUtil.getString(resourceRequest,"proposalSubmitted");
        String foreignNationalsInvolved =  ParamUtil.getString(resourceRequest,"foreignNationalsInvolved");
        String workPermitApplied =  ParamUtil.getString(resourceRequest,"workPermitApplied");


		AttractionWaterSport waterSport =null;
		try {
			waterSport=AttractionWaterSportLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(waterSport)) {
			waterSport = AttractionWaterSportLocalServiceUtil.createAttractionWaterSport(CounterLocalServiceUtil.increment());
		}
		waterSport.setWaterSportBusinessName(waterSportBusinessName);
	    waterSport.setWaterSportMailingaAdd(waterSportMailingaAdd);
	    waterSport.setWaterSportOpLocationAddr(waterSportOpLocationAddress);
	    waterSport.setWaterSportOpPhone(waterSportOpPhone);
	    waterSport.setWaterSportOpEmail(waterSportOpEmail);
	    waterSport.setWaterSportOpOwnerName(waterSportOpOwnerName);
	    waterSport.setWaterSportOpAddressOwner(waterSportOpAddressOwner);
	    waterSport.setWaterSportOpManagerName(waterSportOpManagerName);
	    waterSport.setWaterSportOpApplicantName(waterSportOpApplicantName);
	    waterSport.setWaterSportOpNationality(waterSportOpNationality);
	    waterSport.setWaterSportOpEmployeesNo(waterSportOpEmployeesNo);
	    waterSport.setWaterSportOpActivityList(waterSportOpActivitiesList);
	    waterSport.setOccupyLocation(occupyLocation);
	    waterSport.setProposalSubmitted(proposalSubmitted);
	    waterSport.setForeignNationalsInvolved(foreignNationalsInvolved);
	    waterSport.setWorkPermitApplied(workPermitApplied);
		waterSport.setJtbApplicationId(jtbApplicationId);
		AttractionWaterSportLocalServiceUtil.updateAttractionWaterSport(waterSport);
		
		return false;
	}

}
