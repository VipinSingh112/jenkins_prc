package com.nbp.miic.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetAddLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
"mvc.command.name=/add/miic/suspension/of/cet" }, service = MVCResourceCommand.class)
public class MIICAddSuspensionOfCetResourceCommnad implements MVCResourceCommand{
private static Log _log=LogFactoryUtil.getLog(MIICAddSuspensionOfCetResourceCommnad.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling miic suspension of cet resource command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String cetTariffHeadingNum=ParamUtil.getString(resourceRequest, "cetTariffHeadingNum");
		String cetDescription=ParamUtil.getString(resourceRequest, "cetDescription");
		String amountQuantity=ParamUtil.getString(resourceRequest, "amountQuantity");
		String amountEstimate=ParamUtil.getString(resourceRequest, "amountEstimate");
		String technologySpecification=ParamUtil.getString(resourceRequest, "technologySpecification");
		String cetRate=ParamUtil.getString(resourceRequest, "cetRate");
		String rateProposed=ParamUtil.getString(resourceRequest, "rateProposed");
		String periodOfRateChangeFrom=ParamUtil.getString(resourceRequest, "periodOfRateChangeFrom");
		String periodOfRateChangeTo=ParamUtil.getString(resourceRequest, "periodOfRateChangeTo");
		String count=ParamUtil.getString(resourceRequest, "count");
		long miicApplicationId=ParamUtil.getLong(resourceRequest, "miicApplicationId");
		long miicSuspensionOfCetAddId=ParamUtil.getLong(resourceRequest, "miicSuspensionOfCetAddId");
		
		MiicSuspensionOfCetAdd suspensionOfCet=null;
		if (Validator.isNotNull(miicSuspensionOfCetAddId)) {
			try {
		suspensionOfCet=MiicSuspensionOfCetAddLocalServiceUtil.getMiicSuspensionOfCetAdd(miicSuspensionOfCetAddId);
			} catch (PortalException e) {
			}
		}else {
		suspensionOfCet=MiicSuspensionOfCetAddLocalServiceUtil.createMiicSuspensionOfCetAdd(CounterLocalServiceUtil.increment());
		suspensionOfCet.setCounter(count);
		}
		suspensionOfCet.setTariffHeadingNum(cetTariffHeadingNum);
		suspensionOfCet.setDescription(cetDescription);
		suspensionOfCet.setAmountQuantity(amountQuantity);
		suspensionOfCet.setAmountEstimateInUs(amountEstimate);
		suspensionOfCet.setTechnologySpecification(technologySpecification);
		suspensionOfCet.setCetRate(cetRate);
		suspensionOfCet.setRateProposed(rateProposed);
		try {
			suspensionOfCet.setPeriodOfRateChangeFrom(new SimpleDateFormat("yyyy-MM-dd").parse(periodOfRateChangeFrom));
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			suspensionOfCet.setPeriodOfRateChangeTo(new SimpleDateFormat("yyyy-MM-dd").parse(periodOfRateChangeTo));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		suspensionOfCet.setMiicApplicationId(miicApplicationId);
		MiicSuspensionOfCetAddLocalServiceUtil.updateMiicSuspensionOfCetAdd(suspensionOfCet);
		jsonOBJ.put("miicSuspensionOfCetAddId", suspensionOfCet.getMiicSuspensionOfCetAddId());
		jsonOBJ.put("counter", count);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		}
		return false;
	}
}