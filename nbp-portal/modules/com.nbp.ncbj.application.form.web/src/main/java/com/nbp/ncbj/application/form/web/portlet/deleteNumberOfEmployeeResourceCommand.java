package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;
import com.nbp.ncbj.application.form.service.service.NcbjNumOfEmpAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=delete/Employee"
		},
		service = MVCResourceCommand.class
	)

public class deleteNumberOfEmployeeResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long employeesNumberDetailId=ParamUtil.getLong(resourceRequest, "employeesNumberDetailId");
		NcbjNumOfEmpAdd employeeDetail=null;
		  try {
			  employeeDetail=NcbjNumOfEmpAddLocalServiceUtil.deleteNcbjNumOfEmpAdd(employeesNumberDetailId);
		  } catch (Exception e) {
		  }
		return false;
	}

}
