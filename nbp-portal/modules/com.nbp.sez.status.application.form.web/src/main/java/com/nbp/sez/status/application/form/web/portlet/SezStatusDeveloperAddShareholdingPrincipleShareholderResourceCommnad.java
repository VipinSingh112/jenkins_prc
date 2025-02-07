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
import com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd;
import com.nbp.sez.status.application.form.service.service.SezDevShareDirectorAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/shareholding/principle/Shareholder" }, service = MVCResourceCommand.class)

public class SezStatusDeveloperAddShareholdingPrincipleShareholderResourceCommnad implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(SezStatusDeveloperAddShareholdingPrincipleShareholderResourceCommnad.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String principalShareholderName = ParamUtil.getString(resourceRequest, "principalShareholderName");
		String principalShareholderShares = ParamUtil.getString(resourceRequest, "principalShareholderShares");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String count = ParamUtil.getString(resourceRequest, "count");
//		this is hidden field primary key of the entity
		long devDirectorShareholderId = ParamUtil.getLong(resourceRequest, "devDirectorShareholderId");
		SezDevShareDirectorAdd shareDirectror = null;
		if(Validator.isNotNull(devDirectorShareholderId)) {
			try {
				shareDirectror=SezDevShareDirectorAddLocalServiceUtil.getSezDevShareDirectorAdd(devDirectorShareholderId);
			} catch (PortalException e) {
			}
		}else {
			shareDirectror = SezDevShareDirectorAddLocalServiceUtil
					.createSezDevShareDirectorAdd(CounterLocalServiceUtil.increment());
			shareDirectror.setCounter(count);
		}
		shareDirectror.setShareholderName(principalShareholderName);
		shareDirectror.setNumOfShare(principalShareholderShares);
		shareDirectror.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevShareDirectorAddLocalServiceUtil.updateSezDevShareDirectorAdd(shareDirectror);
		jsonOBJ.put("sezDevShareDirectorAddId", shareDirectror.getSezDevShareDirectorAddId());
		jsonOBJ.put("counter", count);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Occured", e);
		}
		return false;
	}

}
