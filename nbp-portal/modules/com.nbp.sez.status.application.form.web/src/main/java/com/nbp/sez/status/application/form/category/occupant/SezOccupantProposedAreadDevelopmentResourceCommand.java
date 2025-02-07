package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/proposed/development/info" }, service = MVCResourceCommand.class)
public class SezOccupantProposedAreadDevelopmentResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(SezOccupantProposedAreadDevelopmentResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String occProcessingArea = ParamUtil.getString(resourceRequest, "occProcessingArea");
		String occNonProcessingArea = ParamUtil.getString(resourceRequest, "occNonProcessingArea");
		String occOfficeRequirement = ParamUtil.getString(resourceRequest, "occOfficeRequirement");
		String occFactoryRequirement = ParamUtil.getString(resourceRequest, "occFactoryRequirement");
		String otherBuildUpRequirement = ParamUtil.getString(resourceRequest, "otherBuildUpRequirement");
		String occOtherAreaReqName = ParamUtil.getString(resourceRequest, "occOtherAreaReqName");
		String occOtherAreaRequirement = ParamUtil.getString(resourceRequest, "occOtherAreaRequirement");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezOccupantProposedAreaDevelopmentPlanInfo areaDevelopmentPlanInfo = null;
		try {
			areaDevelopmentPlanInfo=SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(areaDevelopmentPlanInfo)) {
			areaDevelopmentPlanInfo=SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.
					createSezOccupantProposedAreaDevelopmentPlanInfo(CounterLocalServiceUtil.increment());
		}
	    // Set all variables to their corresponding database values
	    areaDevelopmentPlanInfo.setOccProcessingArea(occProcessingArea);
	    areaDevelopmentPlanInfo.setOccNonProcessingArea(occNonProcessingArea);
	    areaDevelopmentPlanInfo.setOccOfficeRequirement(occOfficeRequirement);
	    areaDevelopmentPlanInfo.setOccFactoryRequirement(occFactoryRequirement);
	    areaDevelopmentPlanInfo.setOtherBuildUpRequirement(otherBuildUpRequirement);
	    areaDevelopmentPlanInfo.setOccOtherAreaReqName(occOtherAreaReqName);
	    areaDevelopmentPlanInfo.setOccOtherAreaRequirement(occOtherAreaRequirement);
	    areaDevelopmentPlanInfo.setSezStatusApplicationId(sezStatusApplicationId);

	    // Update the database with the modified entity
	    SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.updateSezOccupantProposedAreaDevelopmentPlanInfo(areaDevelopmentPlanInfo);
	    _log.info("[SAVE COMPLETE]");
		return false;
	}
}