package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.exception.NoSuchQualityProficiencyDetailException;
import com.nbp.hsra.application.service.model.QualityProficiencyDetail;
import com.nbp.hsra.application.service.service.QualityProficiencyDetailLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/quality/proficiency/detail" }, service = MVCResourceCommand.class)

public class HsraQualityExpertsProficiencyDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraQualityExpertsProficiencyDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling QUALITY PROFICIENCY DETAILS*****");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String proficiencyDetails = ParamUtil.getString(resourceRequest, "proficiencyDetails");
		String workDurationOne = ParamUtil.getString(resourceRequest, "workDurationOne");
		String capacityOne = ParamUtil.getString(resourceRequest, "capacityOne");
		String workDurationTwo = ParamUtil.getString(resourceRequest, "workDurationTwo");
		String capacityTwo = ParamUtil.getString(resourceRequest, "capacityTwo");
		String workDurationThree = ParamUtil.getString(resourceRequest, "workDurationThree");
		String capacityThree = ParamUtil.getString(resourceRequest, "capacityThree");
		String workDurationFour = ParamUtil.getString(resourceRequest, "workDurationFour");
		String capacityFour = ParamUtil.getString(resourceRequest, "capacityFour");
		String workDurationFive = ParamUtil.getString(resourceRequest, "workDurationFive");
		String capacityFive = ParamUtil.getString(resourceRequest, "capacityFive");
		String workDurationSix = ParamUtil.getString(resourceRequest, "workDurationSix");
		String capacitySix = ParamUtil.getString(resourceRequest, "capacitySix");
		String workDurationSeven = ParamUtil.getString(resourceRequest, "workDurationSeven");
		String capacitySeven = ParamUtil.getString(resourceRequest, "capacitySeven");
		String workDurationEight = ParamUtil.getString(resourceRequest, "workDurationEight");
		String capacityEight = ParamUtil.getString(resourceRequest, "capacityEight");
		String workDurationNine = ParamUtil.getString(resourceRequest, "workDurationNine");
		String capacityNine = ParamUtil.getString(resourceRequest, "capacityNine");
		String workDurationTen = ParamUtil.getString(resourceRequest, "workDurationTen");
		String capacityTen = ParamUtil.getString(resourceRequest, "capacityTen");
		String workDurationEleven = ParamUtil.getString(resourceRequest, "workDurationEleven");
		String capacityEleven = ParamUtil.getString(resourceRequest, "capacityEleven");
		String workDurationTwelve = ParamUtil.getString(resourceRequest, "workDurationTwelve");
		String capacityTwelve = ParamUtil.getString(resourceRequest, "capacityTwelve");

		QualityProficiencyDetail proficiencyDetail = null;
		try {
			proficiencyDetail = QualityProficiencyDetailLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (NoSuchQualityProficiencyDetailException e) {
		}
		if (Validator.isNull(proficiencyDetail)) {
			proficiencyDetail = QualityProficiencyDetailLocalServiceUtil
					.createQualityProficiencyDetail(CounterLocalServiceUtil.increment());
		}
		proficiencyDetail.setProficiencyDetails(proficiencyDetails);
		proficiencyDetail.setWorkDurationOne(workDurationOne);
		proficiencyDetail.setCapacityOne(capacityOne);
		proficiencyDetail.setWorkDurationTwo(workDurationTwo);
		proficiencyDetail.setCapacityTwo(capacityTwo);
		proficiencyDetail.setWorkDurationThree(workDurationThree);
		proficiencyDetail.setCapacityThree(capacityThree);
		proficiencyDetail.setWorkDurationFour(workDurationFour);
		proficiencyDetail.setCapacityFour(capacityFour);
		proficiencyDetail.setWorkDurationFive(workDurationFive);
		proficiencyDetail.setCapacityFive(capacityFive);
		proficiencyDetail.setWorkDurationSix(workDurationSix);
		proficiencyDetail.setCapacitySix(capacitySix);
		proficiencyDetail.setWorkDurationSeven(workDurationSeven);
		proficiencyDetail.setCapacitySeven(capacitySeven);
		proficiencyDetail.setWorkDurationEight(workDurationEight);
		proficiencyDetail.setCapacityEight(capacityEight);
		proficiencyDetail.setWorkDurationNine(workDurationNine);
		proficiencyDetail.setCapacityNine(capacityNine);
		proficiencyDetail.setWorkDurationTen(workDurationTen);
		proficiencyDetail.setCapacityTen(capacityTen);
		proficiencyDetail.setWorkDurationEleven(workDurationEleven);
		proficiencyDetail.setCapacityEleven(capacityEleven);
		proficiencyDetail.setWorkDurationTwelve(workDurationTwelve);
		proficiencyDetail.setCapacityTwelve(capacityTwelve);
		proficiencyDetail.setHsraApplicationId(hsraApplicationId);
		QualityProficiencyDetailLocalServiceUtil.updateQualityProficiencyDetail(proficiencyDetail);
		return false;
	}

}
