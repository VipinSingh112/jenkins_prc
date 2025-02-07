package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo;
import com.nbp.sez.status.application.form.service.service.SezZoneProposedProjectInfoLocalService;
import com.nbp.sez.status.application.form.service.service.SezZoneProposedProjectInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/zone/proposed/project"
		},
		service = MVCResourceCommand.class
		)
public class SezStatusZoneProposedProjInfoResourceCommand implements MVCResourceCommand{
@Override
public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {
	// TODO Auto-generated method stub
	String entityDeniedApproval = ParamUtil.getString(resourceRequest, "zoneUserEntityDeniedAppr");
	String deniedApprovalDate = ParamUtil.getString(resourceRequest, "zoneUserDeniedApprDate");
	String deniedApprovalProjectType = ParamUtil.getString(resourceRequest, "zoneUserDeniedApprProjectType");
	String freeZoneLocation = ParamUtil.getString(resourceRequest, "zoneUserFreeZoneLocation");
	String leasedBuildingNum = ParamUtil.getString(resourceRequest, "zoneUserLeasedBuildingNum");
	String leasedTown = ParamUtil.getString(resourceRequest, "zoneUserLeasedTown");
	String leasedParish = ParamUtil.getString(resourceRequest, "zoneUserLeasedParish");
	String leaseYears = ParamUtil.getString(resourceRequest, "zoneUserLeaseYears");
	String volume = ParamUtil.getString(resourceRequest, "zoneUserVolume");
	String folio = ParamUtil.getString(resourceRequest, "zoneUserFolio");
	String floorNum = ParamUtil.getString(resourceRequest, "zoneUserFloorNum");
	long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
	SezZoneProposedProjectInfo sezZoneProposedProjectInfo = null;
	try {
		sezZoneProposedProjectInfo=SezZoneProposedProjectInfoLocalServiceUtil.getSezStatusById(sezStatusApplicationId);
	} catch (Exception e) {
	}
	if(sezZoneProposedProjectInfo==null) {
		sezZoneProposedProjectInfo = SezZoneProposedProjectInfoLocalServiceUtil.createSezZoneProposedProjectInfo(CounterLocalServiceUtil.increment());
	}
	 
	sezZoneProposedProjectInfo.setEntityDeniedApproval(entityDeniedApproval);
	try {
		if (Validator.isNotNull(deniedApprovalDate)) {
			sezZoneProposedProjectInfo.setDeniedApprovalDate(new SimpleDateFormat("yyyy-MM-dd").parse(deniedApprovalDate));
		}
	} catch (ParseException e) {
	}
	sezZoneProposedProjectInfo.setDeniedApprovalProjectType(deniedApprovalProjectType);
	sezZoneProposedProjectInfo.setFreeZoneLocation(freeZoneLocation);
	sezZoneProposedProjectInfo.setLeasedBuildingNum(leasedBuildingNum);
	sezZoneProposedProjectInfo.setLeasedTown(leasedTown);
	sezZoneProposedProjectInfo.setLeasedParish(leasedParish);
	sezZoneProposedProjectInfo.setLeaseYears(leaseYears);
	sezZoneProposedProjectInfo.setVolume(volume);
	sezZoneProposedProjectInfo.setFolio(folio);
	sezZoneProposedProjectInfo.setFloorNum(floorNum);
	sezZoneProposedProjectInfo.setSezStatusApplicationId(sezStatusApplicationId);
	
	SezZoneProposedProjectInfoLocalServiceUtil.updateSezZoneProposedProjectInfo(sezZoneProposedProjectInfo);
	return false;
}
}
