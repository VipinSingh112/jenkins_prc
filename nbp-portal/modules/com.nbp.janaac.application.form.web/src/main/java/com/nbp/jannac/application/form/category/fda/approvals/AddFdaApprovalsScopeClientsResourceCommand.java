package com.nbp.jannac.application.form.category.fda.approvals;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddFdaScopeClient;
import com.nbp.janaac.application.form.service.service.AddFdaScopeClientLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;
import com.nbp.jannac.application.form.category.certification.bodies.AddCerticationBodiesScopeServiceResourceCommand;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/fda/approvals/scope/client/and/intrest" }, service = MVCResourceCommand.class)
public class AddFdaApprovalsScopeClientsResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddCerticationBodiesScopeServiceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------fda approvals application information---------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String clientOrganization = ParamUtil.getString(resourceRequest, "clientOrganization");
		String foodProduct = ParamUtil.getString(resourceRequest, "foodProduct");
		String fdaRegulations = ParamUtil.getString(resourceRequest, "fdaRegulations");
		String dateGranted = ParamUtil.getString(resourceRequest, "dateGranted");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfFdaScopeclientAndIntrested = ParamUtil.getString(resourceRequest,
				"counterOfFdaScopeclientAndIntrested");

		AddFdaScopeClient fdaScopeClient = null;
		try {
			fdaScopeClient = AddFdaScopeClientLocalServiceUtil.getAddFdaScopeClient(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(fdaScopeClient)) {
			fdaScopeClient = AddFdaScopeClientLocalServiceUtil
					.createAddFdaScopeClient(CounterLocalServiceUtil.increment());
			fdaScopeClient.setCounter(counterOfFdaScopeclientAndIntrested);
		}
		fdaScopeClient.setClientOrganization(clientOrganization);
		fdaScopeClient.setFoodProducts(foodProduct);
		fdaScopeClient.setFdaRegulations(fdaRegulations);
		try {
			if (Validator.isNotNull(dateGranted)) {
				fdaScopeClient.setDateGranted(new SimpleDateFormat("yyyy-MM-dd").parse(dateGranted));
			}
		} catch (ParseException e1) {
			_log.error("an error occured" + e1);
		}

		fdaScopeClient.setJanaacApplicationId(janaacApplicationId);
		AddFdaScopeClientLocalServiceUtil.updateAddFdaScopeClient(fdaScopeClient);
		jsonOBJ.put("uniqueId", fdaScopeClient.getAddFdaScopeClientId());
		jsonOBJ.put("counter", fdaScopeClient.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}