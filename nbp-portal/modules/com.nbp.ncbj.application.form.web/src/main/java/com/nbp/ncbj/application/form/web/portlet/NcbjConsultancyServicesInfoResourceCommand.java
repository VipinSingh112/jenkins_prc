package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;
import com.nbp.ncbj.application.form.service.service.NcbjSectionFourLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/consultancy/Services/info"
		},
		service = MVCResourceCommand.class
	)

public class NcbjConsultancyServicesInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		Log _log=LogFactoryUtil.getLog(NcbjConsultancyServicesInfoResourceCommand.class.getName());
		String companyUsedFour = ParamUtil.getString(resourceRequest, "companyUsedFour");
	    String consultingFirmTelephone = ParamUtil.getString(resourceRequest, "consultingFirmTelephone");
	    String consultingEmail = ParamUtil.getString(resourceRequest, "consultingEmail");
	    String stageOne = ParamUtil.getString(resourceRequest, "stageOne");
	    String stageTwo = ParamUtil.getString(resourceRequest, "stageTwo");
	    String surveillanceAudit = ParamUtil.getString(resourceRequest, "surveillanceAudit");
	    String recertificationAudit = ParamUtil.getString(resourceRequest, "recertificationAudit");
	    String preAssessmentAudit = ParamUtil.getString(resourceRequest, "preAssessmentAudit");
	    String otherServices = ParamUtil.getString(resourceRequest, "otherServices");
	    String name = ParamUtil.getString(resourceRequest, "name");
	    String position = ParamUtil.getString(resourceRequest, "position");
	    String date = ParamUtil.getString(resourceRequest, "date");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		NcbjSectionFour consultService=null;
		try {
			consultService= NcbjSectionFourLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		if(consultService==null) {
			consultService=NcbjSectionFourLocalServiceUtil.createNcbjSectionFour(CounterLocalServiceUtil.increment());
		}
		consultService.setConsultService(companyUsedFour);
		consultService.setConsultTelephone(consultingFirmTelephone);
		consultService.setConsultEmail(consultingEmail);
		try {
			consultService.setConsultStageOne(new SimpleDateFormat("yyyy-MM-dd").parse(stageOne));
		} catch (java.text.ParseException e) {
		}
		try {
			consultService.setConsultStageTwo(new SimpleDateFormat("yyyy-MM-dd").parse(stageTwo));
		} catch (java.text.ParseException e) {
		}
		try {
			consultService.setConsultSurveillanceAudit(new SimpleDateFormat("yyyy-MM-dd").parse(surveillanceAudit));
		} catch (java.text.ParseException e) {
		}
		try {
			consultService.setConsultRecertificationAudit(new SimpleDateFormat("yyyy-MM-dd").parse(recertificationAudit));
		} catch (java.text.ParseException e) {
		}
		try {
			consultService.setConsultPreassessmentAudit(new SimpleDateFormat("yyyy-MM-dd").parse(preAssessmentAudit));
		} catch (java.text.ParseException e) {
		}
		try {
			consultService.setConsultOtherService(new SimpleDateFormat("yyyy-MM-dd").parse(otherServices));
		} catch (java.text.ParseException e) {
		}
		consultService.setConsultName(name);
		consultService.setConsultPosition(position);
		try {
			consultService.setConsultDate(new SimpleDateFormat("yyyy-MM-dd").parse(date));
		} catch (java.text.ParseException e) {
		}
		consultService.setNcbjApplicationId(ncbjApplicationId);
		NcbjSectionFourLocalServiceUtil.updateNcbjSectionFour(consultService);
		// TODO Auto-generated method stub
		return false;
	}

}
