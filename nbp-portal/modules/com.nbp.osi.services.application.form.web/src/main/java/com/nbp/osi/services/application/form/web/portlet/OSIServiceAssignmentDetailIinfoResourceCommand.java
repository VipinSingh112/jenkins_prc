package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesAssignmentDetailinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesAssignmentDetailinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
			"mvc.command.name=/assignment/detail/info"
		},
		service = MVCResourceCommand.class
	)
public class OSIServiceAssignmentDetailIinfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		    long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
			String assignmentName = ParamUtil.getString(resourceRequest, "assignmentName");
		    String assignmentDated = ParamUtil.getString(resourceRequest, "assignmentDated");
		    String selectedAssignmentAttached = ParamUtil.getString(resourceRequest, "selectedAssignmentAttached");
		    String assignmentAddress = ParamUtil.getString(resourceRequest, "assignmentAddress");
		    String trusteeActInfo = ParamUtil.getString(resourceRequest, "trusteeActInfo");
		    
		    OsiServicesAssignmentDetailinfo assignmentDetailinfo=null;
		    try {
		    	assignmentDetailinfo=	OsiServicesAssignmentDetailinfoLocalServiceUtil.getOsiServiceAssignmentInfoById(osiServicesApplicationId);
			} catch (NoSuchOsiServicesAssignmentDetailinfoException e) {
			}
		    if (assignmentDetailinfo==null) {
		    	assignmentDetailinfo=	OsiServicesAssignmentDetailinfoLocalServiceUtil.createOsiServicesAssignmentDetailinfo(CounterLocalServiceUtil.increment());
			}
		    assignmentDetailinfo.setTrusteeAct(trusteeActInfo);
		    assignmentDetailinfo.setAssignmentName(assignmentName);
		    try {
				assignmentDetailinfo.setAssignmentDated(new SimpleDateFormat("yyyy-MM-dd").parse(assignmentDated));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    assignmentDetailinfo.setSelectedAssignmentAttached(selectedAssignmentAttached);
		    assignmentDetailinfo.setAssignmentAddress(assignmentAddress);
		    assignmentDetailinfo.setOsiServicesApplicationId(osiServicesApplicationId);
		    OsiServicesAssignmentDetailinfoLocalServiceUtil.updateOsiServicesAssignmentDetailinfo(assignmentDetailinfo);
		return false;
	}

}
