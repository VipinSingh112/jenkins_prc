package com.nbp.fire.brigade.dashboard.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.fire.brigade.dashboard.web.constants.FireBrigadeDashbaordPortletKeys;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection;
import com.nbp.fire.brigade.stage.service.service.FireBrigadeInspectionLocalServiceUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true, 
		property = { "javax.portlet.name=" +  FireBrigadeDashbaordPortletKeys.FIREBRIGADEDASHBAORD,
		"mvc.command.name=/fireBrigade/inspection/timeslots" 
		}, service = MVCResourceCommand.class)

public class InspectionTimeSlotResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");
			List<FireBrigadeInspection> timeSlots =  FireBrigadeInspectionLocalServiceUtil.getFBI_StatusApplicationId(FireBrigadeDashbaordPortletKeys.PROPOSED_Label, fireBrigadeApplicationId);
			resourceRequest.setAttribute("inspectionList",timeSlots);
			FireBrigadeInspection fireBrigadeInspectionSlot=null;
			try {
				fireBrigadeInspectionSlot= FireBrigadeInspectionLocalServiceUtil.getInspectionByStatus_SlotBoooked_ApplicationId(FireBrigadeDashbaordPortletKeys.CONFRIMED_Label, themeDisplay.getUserId(), fireBrigadeApplicationId);
			}catch (Exception e) {
				e.printStackTrace();
			}
			if(Validator.isNotNull(fireBrigadeInspectionSlot)) {
				resourceRequest.setAttribute("fireBrigadeInspectionScheduled",fireBrigadeInspectionSlot);
				resourceRequest.getPortletContext().getRequestDispatcher("/inspection-confirmation.jsp").include(resourceRequest, resourceResponse);
			}else {
				resourceRequest.getPortletContext().getRequestDispatcher("/inspectionList.jsp").include(resourceRequest, resourceResponse);
		} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		}

}
