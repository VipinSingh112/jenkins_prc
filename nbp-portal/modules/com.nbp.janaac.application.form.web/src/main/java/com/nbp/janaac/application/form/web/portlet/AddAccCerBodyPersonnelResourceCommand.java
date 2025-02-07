package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel;
import com.nbp.janaac.application.form.service.service.AccCerBodyPersonnelLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/cer/bodies/personnel/resource" }, service = MVCResourceCommand.class)
public class AddAccCerBodyPersonnelResourceCommand implements MVCResourceCommand{

	private static Log _log = LogFactoryUtil.getLog(AddAccCerBodyPersonnelResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation certification bodies personnel resource info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String internalStaffSize=ParamUtil.getString(resourceRequest, "internalStaffSize");
		String auditorsNum=ParamUtil.getString(resourceRequest, "auditorsNum");
		String contractedPerNum=ParamUtil.getString(resourceRequest, "contractedPerNum");
		String bodyOutsource=ParamUtil.getString(resourceRequest, "bodyOutsource");
		String descSecurity=ParamUtil.getString(resourceRequest, "descSecurity");
		AccCerBodyPersonnel application=null;
		try {
			application = AccCerBodyPersonnelLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccCerBodyPersonnelLocalServiceUtil.createAccCerBodyPersonnel(CounterLocalServiceUtil.increment(AddAccCerBodyPersonnelResourceCommand.class.getName()));
		}
		application.setInternalStaffSize(internalStaffSize);
		application.setAuditorsNum(auditorsNum);
		application.setContractedPerNum(contractedPerNum);
		application.setBodyOutsource(bodyOutsource);
		application.setDescSecurity(descSecurity);
		application.setJanaacApplicationId(janaacApplicationId);
		AccCerBodyPersonnelLocalServiceUtil.updateAccCerBodyPersonnel(application);
		return false;
	}

}
