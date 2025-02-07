package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities;
import com.nbp.ncbj.application.form.service.service.NcbjSpecificActivitiesLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/specific/Activities/list/info" }, service = MVCResourceCommand.class)

public class NcbjSelectedSpecificActivitiesResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String specificActivity = ParamUtil.getString(resourceRequest, "specificActivity");
		String specificActivityNumber = ParamUtil.getString(resourceRequest, "specificActivityNumber");
		String specificActivityChecked = ParamUtil.getString(resourceRequest, "specificActivityChecked");
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");

		List<NcbjSpecificActivities> specificActivities = null;
		try {
			specificActivities = NcbjSpecificActivitiesLocalServiceUtil.getNcbjById(ncbjApplicationId);
		} catch (Exception e) {
		}
		if(specificActivities!=null&&specificActivities.size()>=10) {
			try {
				NcbjSpecificActivitiesLocalServiceUtil.deleteNcbjSpecificActivities(ncbjApplicationId);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		NcbjSpecificActivities information = null;
		information = NcbjSpecificActivitiesLocalServiceUtil
				.createNcbjSpecificActivities(CounterLocalServiceUtil.increment());
		information.setSpecificActivity(specificActivity);
		information.setSpecificActivityNumber(specificActivityNumber);
		information.setSpecificActivityChecked(specificActivityChecked);
		information.setNcbjApplicationId(ncbjApplicationId);
		NcbjSpecificActivitiesLocalServiceUtil.updateNcbjSpecificActivities(information);
		return false;
	}

}
