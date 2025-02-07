package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.AlternateRsoAdd;
import com.nbp.hsra.application.service.service.AlternateRsoAddLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/alternate/rso/data" }, service = MVCResourceCommand.class)
public class HSRAAlternateRsoAddDataResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HSRARadionuclideDetailDataResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra radionuclide sources Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String alternateRsoName = ParamUtil.getString(resourceRequest, "alternateRsoName");
		String alternateRsoTitle = ParamUtil.getString(resourceRequest, "alternateRsoTitle");
		String alternateRsoTelephone = ParamUtil.getString(resourceRequest, "alternateRsoTelephone");
		String alternateRsoExt = ParamUtil.getString(resourceRequest, "alternateRsoExt");
		String alternateRsoFax = ParamUtil.getString(resourceRequest, "alternateRsoFax");
		String alternateRsoEmailAdd = ParamUtil.getString(resourceRequest, "alternateRsoEmailAdd");
		String counterOfAlternateRsoDetail = ParamUtil.getString(resourceRequest, "counterOfAlternateRsoDetail");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long alternateRsoDetailId = ParamUtil.getLong(resourceRequest, "alternateRsoDetailId");

		AlternateRsoAdd rasoInfo = null;
		try {
			rasoInfo = AlternateRsoAddLocalServiceUtil.getAlternateRsoAdd(alternateRsoDetailId);
		} catch (PortalException e1) {
		}
		if (rasoInfo == null) {
			rasoInfo = AlternateRsoAddLocalServiceUtil.createAlternateRsoAdd(CounterLocalServiceUtil.increment());
			rasoInfo.setCounter(counterOfAlternateRsoDetail);
		}
		rasoInfo.setAlternateRsoName(alternateRsoName);
		rasoInfo.setAlternateRsoTitle(alternateRsoTitle);
		rasoInfo.setAlternateRsoTelephone(alternateRsoTelephone);
		rasoInfo.setAlternateRsoExt(alternateRsoExt);
		rasoInfo.setAlternateRsoFax(alternateRsoFax);
		rasoInfo.setAlternateRsoEmailAdd(alternateRsoEmailAdd);
		rasoInfo.setHsraApplicationId(hsraApplicationId);
		AlternateRsoAddLocalServiceUtil.updateAlternateRsoAdd(rasoInfo);
		jsonOBJ.put("alternateRsoId", rasoInfo.getAlternateRsoAddId());
		jsonOBJ.put("counter", rasoInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
