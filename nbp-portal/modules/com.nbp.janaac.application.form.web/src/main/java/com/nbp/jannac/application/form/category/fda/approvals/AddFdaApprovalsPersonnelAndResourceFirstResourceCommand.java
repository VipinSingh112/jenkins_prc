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
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelFirstLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/fda/personnel/and/resources/first" }, service = MVCResourceCommand.class)
public class AddFdaApprovalsPersonnelAndResourceFirstResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddFdaApprovalsPersonnelAndResourceFirstResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------fda approvals personal and resource first---------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String nameOfStaffMember = ParamUtil.getString(resourceRequest, "nameOfStaffMember");
		String jobTitle = ParamUtil.getString(resourceRequest, "jobTitle");
		String majorResponsibility = ParamUtil.getString(resourceRequest, "majorResponsibility");
		String specificFunction = ParamUtil.getString(resourceRequest, "specificFunction");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfFdaPersonalFirst = ParamUtil.getString(resourceRequest,"counterOfFdaPersonalFirst");
		
		
		AddFdaPersonnelFirst fdaPersonnelFirst = null;
		try {
			fdaPersonnelFirst = AddFdaPersonnelFirstLocalServiceUtil.getAddFdaPersonnelFirst(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(fdaPersonnelFirst)) {
			fdaPersonnelFirst = AddFdaPersonnelFirstLocalServiceUtil.createAddFdaPersonnelFirst(CounterLocalServiceUtil.increment());
			fdaPersonnelFirst.setCounter(counterOfFdaPersonalFirst);
		}
		fdaPersonnelFirst.setNameOfStaff(nameOfStaffMember);
		fdaPersonnelFirst.setJobTitle(jobTitle);
		fdaPersonnelFirst.setMajorResponsibilites(majorResponsibility);
		fdaPersonnelFirst.setSpecificFunctions(specificFunction);
		fdaPersonnelFirst.setJanaacApplicationId(janaacApplicationId);
		AddFdaPersonnelFirstLocalServiceUtil.updateAddFdaPersonnelFirst(fdaPersonnelFirst);
		jsonOBJ.put("uniqueId", fdaPersonnelFirst.getAddFdaPersonnelFirstId());
		jsonOBJ.put("counter", fdaPersonnelFirst.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}