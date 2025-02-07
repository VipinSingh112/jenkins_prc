package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd;
import com.nbp.sez.status.application.form.service.service.SezDevSharePrincipalAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/shareholding/detail/of/principle" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperAddShareholdingDetailOfPrincipleResourceCommnad implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusDeveloperAddShareholdingDetailOfPrincipleResourceCommnad.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String shareholderName = ParamUtil.getString(resourceRequest, "shareholderName");
		String shareholderStreetAddress = ParamUtil.getString(resourceRequest, "shareholderStreetAddress");
		String shareholderZipCode = ParamUtil.getString(resourceRequest, "shareholderZipCode");
		String shareholderCountry = ParamUtil.getString(resourceRequest, "shareholderCountry");
		String shareholderNationality = ParamUtil.getString(resourceRequest, "shareholderNationality");
		String shareholderTRN = ParamUtil.getString(resourceRequest, "shareholderTRN");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String count = ParamUtil.getString(resourceRequest, "count");
		long devShareholderDetailId = ParamUtil.getLong(resourceRequest, "devShareholderDetailId");

		SezDevSharePrincipalAdd sharePricipalAdd = null;
		if (Validator.isNotNull(devShareholderDetailId)) {
			try {
				sharePricipalAdd=SezDevSharePrincipalAddLocalServiceUtil.getSezDevSharePrincipalAdd(devShareholderDetailId);
			} catch (PortalException e) {
			}
		}else {
		sharePricipalAdd = SezDevSharePrincipalAddLocalServiceUtil
				.createSezDevSharePrincipalAdd(CounterLocalServiceUtil.increment());
		sharePricipalAdd.setCounter(count);
		}
		
		sharePricipalAdd.setName(shareholderName);
		sharePricipalAdd.setBuildingNum(shareholderStreetAddress);
		sharePricipalAdd.setParishPost(shareholderZipCode);
		sharePricipalAdd.setCountry(shareholderCountry);
		sharePricipalAdd.setNationality(shareholderNationality);
		sharePricipalAdd.setTaxRegistrationNum(shareholderTRN);
		sharePricipalAdd.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevSharePrincipalAddLocalServiceUtil.updateSezDevSharePrincipalAdd(sharePricipalAdd);
		jsonOBJ.put("sezDevSharePrincipalAddId", sharePricipalAdd.getSezDevSharePrincipalAddId());
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
