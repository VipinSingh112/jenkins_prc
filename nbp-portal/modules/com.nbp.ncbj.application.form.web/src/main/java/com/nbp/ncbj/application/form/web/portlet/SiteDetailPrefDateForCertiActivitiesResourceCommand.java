package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;
import com.nbp.ncbj.application.form.service.service.NcbjApplicantDetailLocalServiceUtil;
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
			"mvc.command.name=add/certification/preferred/date/info"
		},
		service = MVCResourceCommand.class
	)

public class SiteDetailPrefDateForCertiActivitiesResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(SiteDetailPrefDateForCertiActivitiesResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String stageOne=ParamUtil.getString(resourceRequest, "stageOne");
		String stageTwo=ParamUtil.getString(resourceRequest, "stageTwo");
		String surveillanceAudit=ParamUtil.getString(resourceRequest, "surveillanceAudit");
		String recertificationAudit=ParamUtil.getString(resourceRequest, "recertificationAudit");
		String preassessmentAudit=ParamUtil.getString(resourceRequest, "preassessmentAudit");
		String otherServices=ParamUtil.getString(resourceRequest, "otherServices");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		NcbjApplicantDetail preferredDate=null;
		try {
			preferredDate=NcbjApplicantDetailLocalServiceUtil.getNCBJById(ncbjApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(preferredDate)) {
			preferredDate = NcbjApplicantDetailLocalServiceUtil.createNcbjApplicantDetail(CounterLocalServiceUtil.increment());
		}
		if(Validator.isNotNull(stageOne)) {
			try {
				preferredDate.setStageOne(new SimpleDateFormat("yyyy-MM-dd").parse(stageOne));
			} catch (Exception e) {}
			
		}
		if(Validator.isNotNull(stageTwo)) {
			try {
				preferredDate.setStageTwo(new SimpleDateFormat("yyyy-MM-dd").parse(stageTwo));
			} catch (Exception e) {}
		}
		if(Validator.isNotNull(surveillanceAudit)) {
			try {
				preferredDate.setSurveillanceAudit(new SimpleDateFormat("yyyy-MM-dd").parse(surveillanceAudit));
			} catch (Exception e) {}
		}	
		if(Validator.isNotNull(recertificationAudit)) {
			try {
				preferredDate.setRecertificationAudit(new SimpleDateFormat("yyyy-MM-dd").parse(recertificationAudit));
			} catch (Exception e) {}
		}
		if(Validator.isNotNull(preassessmentAudit)) {
			try {
				preferredDate.setPreAassessmentAudit(new SimpleDateFormat("yyyy-MM-dd").parse(preassessmentAudit));
			} catch (Exception e) {}
		}
		if(Validator.isNotNull(otherServices)) {
			try {
				preferredDate.setAnyOtherService(new SimpleDateFormat("yyyy-MM-dd").parse(otherServices));
			} catch (Exception e) {}
		}
		preferredDate.setNcbjApplicationId(ncbjApplicationId);
		NcbjApplicantDetailLocalServiceUtil.updateNcbjApplicantDetail(preferredDate);
		return false;
	}

}
