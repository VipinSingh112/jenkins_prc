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
			"mvc.command.name=delete/HaccpNumber"
		},
		service = MVCResourceCommand.class
	)

public class DeleteHaccpNumberResourceCommand  implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long haccpNumberDetailId=ParamUtil.getLong(resourceRequest, "haccpNumberDetailId");
		NcbjSectionDetailAdd haccpDetail=null;
		  try {
			  haccpDetail=NcbjSectionDetailAddLocalServiceUtil.deleteNcbjSectionDetailAdd(haccpNumberDetailId);
		  } catch (Exception e) {
		  }
		return false;
	}

}
