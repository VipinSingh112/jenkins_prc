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
import com.nbp.hsra.application.service.model.AlternateRsoOneAdd;
import com.nbp.hsra.application.service.service.AlternateRsoOneAddLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
"mvc.command.name=/alternate/rso/one/data" }, service = MVCResourceCommand.class) 
public class HSRAAlternateRsoOneAddDataResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(HSRAAlternateRsoOneAddDataResourceCommand.class.getName());  
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("******calling hsra radionuclide sources Resource Command*******");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String alternateRsoOneName = ParamUtil.getString(resourceRequest, "alternateRsoOneName");
		String alternateRsoOneTitle = ParamUtil.getString(resourceRequest, "alternateRsoOneTitle");
		String alternateRsoOneTelephone = ParamUtil.getString(resourceRequest, "alternateRsoOneTelephone");
		String alternateRsoOneExt = ParamUtil.getString(resourceRequest, "alternateRsoOneExt");
		String alternateRsoOneFax = ParamUtil.getString(resourceRequest, "alternateRsoOneFax");
		String alternateRsoOneEmailAdd = ParamUtil.getString(resourceRequest, "alternateRsoOneEmailAdd");
		String counterOfAlternateRsoOne = ParamUtil.getString(resourceRequest, "counterOfAlternateRsoOne");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		long alternateRsoOneDetailId = ParamUtil.getLong(resourceRequest, "alternateRsoOneDetailId");
		
		AlternateRsoOneAdd rsoOneAddInfo = null;
		try {
			rsoOneAddInfo = AlternateRsoOneAddLocalServiceUtil.getAlternateRsoOneAdd(alternateRsoOneDetailId);
		} catch (PortalException e1) {
		}
		if (rsoOneAddInfo == null) {
			rsoOneAddInfo = AlternateRsoOneAddLocalServiceUtil.createAlternateRsoOneAdd(CounterLocalServiceUtil.increment());
			rsoOneAddInfo.setCounter(counterOfAlternateRsoOne);
		}
		rsoOneAddInfo.setAlternateRsoOneName(alternateRsoOneName);
		rsoOneAddInfo.setAlternateRsoOneTitle(alternateRsoOneTitle);
		rsoOneAddInfo.setAlternateRsoOneTelephone(alternateRsoOneTelephone);
		rsoOneAddInfo.setAlternateRsoOneExt(alternateRsoOneExt);
		rsoOneAddInfo.setAlternateRsoOneFax(alternateRsoOneFax);
		rsoOneAddInfo.setAlternateRsoOneEmailAdd(alternateRsoOneEmailAdd);
		rsoOneAddInfo.setHsraApplicationId(hsraApplicationId);
		AlternateRsoOneAddLocalServiceUtil.updateAlternateRsoOneAdd(rsoOneAddInfo);
		jsonOBJ.put("alternateRsoOneId", rsoOneAddInfo.getAlternateRsoOneAddId());
		jsonOBJ.put("counter", rsoOneAddInfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
