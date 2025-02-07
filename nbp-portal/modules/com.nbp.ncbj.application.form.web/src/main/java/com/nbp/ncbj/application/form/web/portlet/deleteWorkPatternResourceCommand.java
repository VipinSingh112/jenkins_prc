package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;
import com.nbp.ncbj.application.form.service.service.NcbjSectionDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=delete/WorkPattern"
		},
		service = MVCResourceCommand.class
	)


public class deleteWorkPatternResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long workPatternDetailId=ParamUtil.getLong(resourceRequest, "workPatternDetailId");
		NcbjSectionDetailAdd workPatternDetail=null;
		  try {
			  workPatternDetail=NcbjSectionDetailAddLocalServiceUtil.deleteNcbjSectionDetailAdd(workPatternDetailId);
		  } catch (Exception e) {
		  }
		return false;
	}

}
