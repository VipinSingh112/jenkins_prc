package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezDeveloperDetails;
import com.nbp.sez.status.application.form.service.service.SezDeveloperDetailsLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/developer/details" }, service = MVCResourceCommand.class)
public class SezDeveleporDetailsData implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(SezDeveleporDetailsData.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String sezDevdate = ParamUtil.getString(resourceRequest, "sezDevdate");
		String approvalLetterDate = ParamUtil.getString(resourceRequest, "approvalLetterDate");
		String sezDevControl = ParamUtil.getString(resourceRequest, "sezDevControl");
		String sezDevName = ParamUtil.getString(resourceRequest, "sezDevName");
		String sezDevNumber = ParamUtil.getString(resourceRequest, "sezDevNumber");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");

		SezDeveloperDetails data=null;
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

		try {
			data=SezDeveloperDetailsLocalServiceUtil.getDeveloperDetailsBy_Id(sezStatusApplicationId);
		} catch (Exception e) {
		_log.error("No Developer Details Exist With App Id"+e.getMessage());
		}
		if(Validator.isNull(data)) {
			data=SezDeveloperDetailsLocalServiceUtil.createSezDeveloperDetails(CounterLocalServiceUtil.increment(SezDeveleporDetailsData.class.getName()));
		}
		data.setDeveloperName(sezDevName);
		data.setDeveloperNumber(sezDevNumber);
		try {
			data.setLetterOfApprovalDate(dateFormat.parse(approvalLetterDate));
		} catch (ParseException e) {
		}
		try {
			data.setSezDeveloperDate(dateFormat.parse(sezDevdate));
		} catch (ParseException e) {
		}
		data.setDeveloperControl(sezDevControl);
		data.setSezStatusApplicationId(sezStatusApplicationId);
		SezDeveloperDetailsLocalServiceUtil.updateSezDeveloperDetails(data);
		return false;
	}

}
