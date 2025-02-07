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
import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd;
import com.nbp.miic.application.form.services.service.MiicSafeguardMaterialAddLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
"mvc.command.name=/add/miic/safeguard/mechanism/material/required" }, service = MVCResourceCommand.class)
public class MIICAddSafeguardMechanismMaterialRequiredResourceCommnad  implements MVCResourceCommand{
private static Log _log=LogFactoryUtil.getLog(MIICAddSuspensionOfCetResourceCommnad.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling MIIC safeguard Mechanism Material Required Resource command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String nameOfProducer=ParamUtil.getString(resourceRequest, "nameOfProducer");
		String addressOfProducer=ParamUtil.getString(resourceRequest, "addressOfProducer");
		String description=ParamUtil.getString(resourceRequest, "description");
		String tariffHeadingNum=ParamUtil.getString(resourceRequest, "tariffHeadingNum");
		String amount=ParamUtil.getString(resourceRequest, "amount");
		String quantity=ParamUtil.getString(resourceRequest, "quantity");
		String technologySpecification=ParamUtil.getString(resourceRequest, "technologySpecification");
		String materialImportationFrom=ParamUtil.getString(resourceRequest, "materialImportationFrom");
		String materialImportationTo=ParamUtil.getString(resourceRequest, "materialImportationTo");
		String count=ParamUtil.getString(resourceRequest, "count");
		long miicApplicationId=ParamUtil.getLong(resourceRequest, "miicApplicationId");
		long miicSafeguardMaterialAddId=ParamUtil.getLong(resourceRequest, "miicSafeguardMaterialAddId");
		
		MiicSafeguardMaterialAdd materialRequired=null;
		if (Validator.isNotNull(miicSafeguardMaterialAddId)) {
			try {
		materialRequired=MiicSafeguardMaterialAddLocalServiceUtil.getMiicSafeguardMaterialAdd(miicSafeguardMaterialAddId);
			} catch (PortalException e) {
			}
		}else {
		materialRequired=MiicSafeguardMaterialAddLocalServiceUtil.createMiicSafeguardMaterialAdd(CounterLocalServiceUtil.increment());
		materialRequired.setCounter(count);
		}
		materialRequired.setNameOfProducer(nameOfProducer);
		materialRequired.setAddressOfProducer(addressOfProducer);
		materialRequired.setDescription(description);
		materialRequired.setTariffHeadingNum(tariffHeadingNum);
		materialRequired.setAmount(amount);
		materialRequired.setQuantity(quantity);
		materialRequired.setTechnologySpecification(technologySpecification);
		if (Validator.isNotNull(materialImportationFrom)) {
		    try {
				materialRequired.setPeriodOfImportationFrom(new SimpleDateFormat("yyyy-MM-dd").parse(materialImportationFrom));
			} catch (Exception e) {
			}
		}
		if (Validator.isNotNull(materialImportationTo)) {
			try {
				materialRequired.setPeriodOfImportationTo(new SimpleDateFormat("yyyy-MM-dd").parse(materialImportationTo));
			} catch (Exception e) {
			}
		}
		
		materialRequired.setMiicApplicationId(miicApplicationId);
		MiicSafeguardMaterialAddLocalServiceUtil.updateMiicSafeguardMaterialAdd(materialRequired);
		jsonOBJ.put("miicSafeguardMaterialAddId", materialRequired.getMiicSafeguardMaterialAddId());
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