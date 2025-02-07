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
import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd;
import com.nbp.miic.application.form.services.service.MiicSafeguardGoodAddLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
		"mvc.command.name=/add/miic/safeguard/mechanism/to/be/produced" }, service = MVCResourceCommand.class)
public class MIICAddSafeguardMechanismGoodsToBeProducedResourceCommnad implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MIICAddSuspensionOfCetResourceCommnad.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling MIIC safeguard Mechanism Goods to Be Resource command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String tariffHeadingNum = ParamUtil.getString(resourceRequest, "tariffHeadingNum");
		String description = ParamUtil.getString(resourceRequest, "description");
		String amountQuantity = ParamUtil.getString(resourceRequest, "amountQuantity");
		String amountEstimate = ParamUtil.getString(resourceRequest, "amountEstimate");
		String safeguardMechanism = ParamUtil.getString(resourceRequest, "safeguardMechanism");
		String count = ParamUtil.getString(resourceRequest, "count");
		long miicApplicationId = ParamUtil.getLong(resourceRequest, "miicApplicationId");
		long miicSafeguardGoodAddId = ParamUtil.getLong(resourceRequest, "miicSafeguardGoodAddId");

		MiicSafeguardGoodAdd safeguardGood = null;
		if (Validator.isNotNull(miicSafeguardGoodAddId)) {
			try {
				safeguardGood = MiicSafeguardGoodAddLocalServiceUtil.getMiicSafeguardGoodAdd(miicSafeguardGoodAddId);
			} catch (PortalException e) {
			}
		} else {
			safeguardGood = MiicSafeguardGoodAddLocalServiceUtil
					.createMiicSafeguardGoodAdd(CounterLocalServiceUtil.increment());
			safeguardGood.setCounter(count);
		}
		safeguardGood.setTariffHeadingNum(tariffHeadingNum);
		safeguardGood.setDescription(description);
		safeguardGood.setAmountQuantity(amountQuantity);
		safeguardGood.setAmountEstimate(amountEstimate);
		safeguardGood.setResonForRequest(safeguardMechanism);
		safeguardGood.setMiicApplicationId(miicApplicationId);
		MiicSafeguardGoodAddLocalServiceUtil.updateMiicSafeguardGoodAdd(safeguardGood);
		jsonOBJ.put("miicSafeguardGoodAddId", safeguardGood.getMiicSafeguardGoodAddId());
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