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
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelSecondLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/fda/personnel/and/resources/second" }, service = MVCResourceCommand.class)
public class AddFdaApprovalsPersonnelAndResourceSecondResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddFdaApprovalsPersonnelAndResourceSecondResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------fda approvals personal and resource second---------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String name = ParamUtil.getString(resourceRequest, "name");
		String role = ParamUtil.getString(resourceRequest, "role");
		String fdaRegulation = ParamUtil.getString(resourceRequest, "fdaRegulation");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfFdaPersonalSecond = ParamUtil.getString(resourceRequest,"counterOfFdaPersonalSecond");
		AddFdaPersonnelSecond 	fdaPersonnelSecond = null;	
		
		try {
			fdaPersonnelSecond = AddFdaPersonnelSecondLocalServiceUtil.getAddFdaPersonnelSecond(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(fdaPersonnelSecond)) {
			fdaPersonnelSecond = AddFdaPersonnelSecondLocalServiceUtil.createAddFdaPersonnelSecond(CounterLocalServiceUtil.increment());
			fdaPersonnelSecond.setCounter(counterOfFdaPersonalSecond);
		}
		fdaPersonnelSecond.setName(name);
		fdaPersonnelSecond.setRole(role);
		fdaPersonnelSecond.setFdaRegulation(fdaRegulation);
		fdaPersonnelSecond.setJanaacApplicationId(janaacApplicationId);
		AddFdaPersonnelSecondLocalServiceUtil.updateAddFdaPersonnelSecond(fdaPersonnelSecond);
		jsonOBJ.put("uniqueId", fdaPersonnelSecond.getAddFdaPersonnelSecondId());
		jsonOBJ.put("counter", fdaPersonnelSecond.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}