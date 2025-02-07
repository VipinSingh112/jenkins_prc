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
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelFourLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/fda/personnel/and/resources/four" }, service = MVCResourceCommand.class)
public class AddFdaApprovalsPersonnelAndResourceFourResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil
			.getLog(AddFdaApprovalsPersonnelAndResourceThirdResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------fda approvals personal and resource four---------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String number = ParamUtil.getString(resourceRequest, "number");
		String locationAddress = ParamUtil.getString(resourceRequest, "locationAddress");
		String certificationActivities = ParamUtil.getString(resourceRequest, "certificationActivities");
		String contactDetails = ParamUtil.getString(resourceRequest, "contactDetails");
		long uniqueId = ParamUtil.getLong(resourceRequest, "uniqueId");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String counterOfFdaPersonalFour = ParamUtil.getString(resourceRequest, "counterOfFdaPersonalFour");

		AddFdaPersonnelFour fdaPersonnelFour = null;
		try {
			fdaPersonnelFour = AddFdaPersonnelFourLocalServiceUtil.getAddFdaPersonnelFour(uniqueId);
		} catch (PortalException e) {
		}

		if (Validator.isNull(fdaPersonnelFour)) {
			fdaPersonnelFour = AddFdaPersonnelFourLocalServiceUtil
					.createAddFdaPersonnelFour(CounterLocalServiceUtil.increment());
			fdaPersonnelFour.setCounter(counterOfFdaPersonalFour);
		}
		fdaPersonnelFour.setNumber(number);
		fdaPersonnelFour.setLocationAddress(locationAddress);
		fdaPersonnelFour.setCertificationActivities(certificationActivities);
		fdaPersonnelFour.setContactDetails(contactDetails);
		fdaPersonnelFour.setJanaacApplicationId(janaacApplicationId);
		AddFdaPersonnelFourLocalServiceUtil.updateAddFdaPersonnelFour(fdaPersonnelFour);
		jsonOBJ.put("uniqueId", fdaPersonnelFour.getAddFdaPersonnelFourId());
		jsonOBJ.put("counter", fdaPersonnelFour.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}
}