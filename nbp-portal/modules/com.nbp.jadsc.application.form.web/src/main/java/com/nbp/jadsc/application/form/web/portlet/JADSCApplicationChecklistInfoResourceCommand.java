package com.nbp.jadsc.application.form.web.portlet;


import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jadsc.application.form.service.model.JADSCChecklist;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
	"mvc.command.name=set/Check/list/Info/Url" }, service = MVCResourceCommand.class)
   public class JADSCApplicationChecklistInfoResourceCommand implements MVCResourceCommand {
	private  static Log _log = LogFactoryUtil.getLog(JADSCApplicationChecklistInfoResourceCommand.class.getName());

	@Override
	public synchronized boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		String jadscCheckListOther = ParamUtil.getString(resourceRequest, "jadscCheckListOther");
		String informationRegComplaint = ParamUtil.getString(resourceRequest, "informationRegComplaint");
		String informationRegComplaintChecked = ParamUtil.getString(resourceRequest, "informationRegComplaintChecked");
		long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
		List<JADSCChecklist> checklist = null;
		try {
			checklist = JADSCChecklistLocalServiceUtil.getJADSC_ByAppId(jadscApplicationId);
		} catch (Exception e) {
		}
		if(checklist!=null&&checklist.size()>=15) {
			try {
				JADSCChecklistLocalServiceUtil.deleteJADSCChecklist(jadscApplicationId);
			} catch (PortalException e) {

			}
			
		}
		JADSCChecklist information = null;
		information = JADSCChecklistLocalServiceUtil.createJADSCChecklist(CounterLocalServiceUtil.increment());
		information.setInformationRegComplaint(informationRegComplaint);
		information.setDescription(jadscCheckListOther);
		information.setSelectedChecklistValues(informationRegComplaintChecked);
		
		information.setJadscApplicationId(jadscApplicationId);
		JADSCChecklistLocalServiceUtil.updateJADSCChecklist(information);
		return false;
	}

}

































