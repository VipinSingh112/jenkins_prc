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
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelThirdLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/fda/personnel/and/resources/third" }, service = MVCResourceCommand.class)
public class AddFdaApprovalsPersonnelAndResourceThirdResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(AddFdaApprovalsPersonnelAndResourceThirdResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------fda approvals personal and resource third---------");

		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String outSourcedActivity = ParamUtil.getString(resourceRequest, "outSourcedActivity");
		String supplierServicePro = ParamUtil.getString(resourceRequest, "supplierServicePro");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfFdaPersonalThird = ParamUtil.getString(resourceRequest, "counterOfFdaPersonalThird");

		AddFdaPersonnelThird fdaPersonnelThird = null;
		try {
			fdaPersonnelThird = AddFdaPersonnelThirdLocalServiceUtil.getAddFdaPersonnelThird(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(fdaPersonnelThird)) {
			fdaPersonnelThird = AddFdaPersonnelThirdLocalServiceUtil
					.createAddFdaPersonnelThird(CounterLocalServiceUtil.increment());
			fdaPersonnelThird.setCounter(counterOfFdaPersonalThird);
		}
		fdaPersonnelThird.setOutsourcedActivity(outSourcedActivity);
		fdaPersonnelThird.setSupplierServiceProvider(supplierServicePro);
		fdaPersonnelThird.setJanaacApplicationId(janaacApplicationId);
		AddFdaPersonnelThirdLocalServiceUtil.updateAddFdaPersonnelThird(fdaPersonnelThird);
		jsonOBJ.put("uniqueId", fdaPersonnelThird.getAddFdaPersonnelThirdId());
		jsonOBJ.put("counter", fdaPersonnelThird.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}