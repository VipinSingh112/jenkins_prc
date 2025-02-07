package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupantEmploymentInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/employee/info" }, service = MVCResourceCommand.class)
public class SezOccupantEmploymentInfoResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(SezOccupantEmploymentInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			String occLabourYear = ParamUtil.getString(resourceRequest, "occLabourYear");
	        String occLabourDirect = ParamUtil.getString(resourceRequest, "occLabourDirect");
	        String occLabourMale = ParamUtil.getString(resourceRequest, "occLabourMale");
	        String occLabourFemale = ParamUtil.getString(resourceRequest, "occLabourFemale");
	        String occLabourLocal = ParamUtil.getString(resourceRequest, "occLabourLocal");
	        String occLabourForeign = ParamUtil.getString(resourceRequest, "occLabourForeign");
	        String occLabourCounter = ParamUtil.getString(resourceRequest, "occLabourCounter");
	        long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
	        long occLabourId = ParamUtil.getLong(resourceRequest, "occLabourId");
	        SezOccupantEmploymentInfo employmentInfo=null;
	        try {
	        	employmentInfo=SezOccupantEmploymentInfoLocalServiceUtil.getSezOccupantEmploymentInfo(occLabourId);
	        }catch (Exception e) {
			}
	        if (employmentInfo == null) {
	            // Create a new instance if not found in the database
	            employmentInfo = SezOccupantEmploymentInfoLocalServiceUtil.
	                    createSezOccupantEmploymentInfo(CounterLocalServiceUtil.increment());
	            employmentInfo.setOccEmpCounter(occLabourCounter);
	        }
	        employmentInfo.setOccLabourYear(occLabourYear);
	        employmentInfo.setOccLabourDirect(occLabourDirect);
	        employmentInfo.setOccLabourMale(occLabourMale);
	        employmentInfo.setOccLabourFemale(occLabourFemale);
	        employmentInfo.setOccLabourLocal(occLabourLocal);
	        employmentInfo.setOccLabourForeign(occLabourForeign);
	        employmentInfo.setSezStatusApplicationId(sezStatusApplicationId);

	        // Update the database with the modified entity
	        SezOccupantEmploymentInfoLocalServiceUtil.updateSezOccupantEmploymentInfo(employmentInfo);
	        jsonOBJ.put("employeeId", employmentInfo.getSezOccEmpId());
			jsonOBJ.put("employeeCounter", employmentInfo.getOccEmpCounter());
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
			}
	        return false;
	    }
	}