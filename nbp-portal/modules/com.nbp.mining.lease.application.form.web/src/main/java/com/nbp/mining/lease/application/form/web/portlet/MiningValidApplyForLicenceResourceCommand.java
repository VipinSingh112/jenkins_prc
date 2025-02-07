package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
	"mvc.command.name=/mining/apply/valid/license" }, 
service = MVCResourceCommand.class)

public class MiningValidApplyForLicenceResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MiningValidApplyForLicenceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		_log.info("Mining VALIDATING Resource Command Start");
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		MiningLeaseApplication miningApplication=null;
		if(licenseNumber!="") {
			try {
				miningApplication= MiningLeaseApplicationLocalServiceUtil.getMiningByAppNum(licenseNumber);
				_log.info("Application Num Validation Wala"+miningApplication);
			} catch (PortalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(miningApplication.getApplicationNumber().contains(licenseNumber)) {
			//miningApplication= MiningLeaseApplicationLocalServiceUtil.createMiningLeaseApplication(CounterLocalServiceUtil.increment());
			miningApplication.setProspRightsNum(licenseNumber);
		}
		_log.info("SET HO GYA--->>"+miningApplication.getProspRightsNum());
	
		MiningLeaseApplicationLocalServiceUtil.updateMiningLeaseApplication(miningApplication);
			_log.info("VALID-->>LICENCE NUMBER is*******"+licenseNumber);
			if (licenseNumber=="") { 
				_log.info("inside-when no license num NA");
				jsonOBJ.put("rightsNumberCheck", "0");
			}else {
				_log.info("inside-when license num is AVAILABLE");
				jsonOBJ.put("rightsNumberCheck", "1");
			}
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (Exception e) {}
			_log.info("ENDED____VALIDATION");
		return false;
	}

}
