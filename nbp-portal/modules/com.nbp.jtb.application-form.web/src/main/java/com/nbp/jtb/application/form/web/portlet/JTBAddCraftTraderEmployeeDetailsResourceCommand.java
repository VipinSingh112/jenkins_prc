package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo;
import com.nbp.jtb.application.form.service.service.JtbAddCraftEmployeeInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
	"mvc.command.name=/craft/trader/employee/info/edit" }, 
service = MVCResourceCommand.class)

public class JTBAddCraftTraderEmployeeDetailsResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(JTBAddCraftTraderEmployeeDetailsResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String craftTradersEmployeeName = ParamUtil.getString(resourceRequest, "craftTradersEmployeeName");
		String craftTradersEmployeeAddress = ParamUtil.getString(resourceRequest, "craftTradersEmployeeAddress");
		String craftTradersEmployeePhoneNo = ParamUtil.getString(resourceRequest, "craftTradersEmployeePhoneNo");
		String counterCraftEmployee=ParamUtil.getString(resourceRequest, "counterCraftEmployee");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		/* hidden */
		long craftTradersEmployeeDetailId=ParamUtil.getLong(resourceRequest, "craftTradersEmployeeDetailId");
		
		JtbAddCraftEmployeeInfo employee=null;
		  try {
			  employee= JtbAddCraftEmployeeInfoLocalServiceUtil.getJtbAddCraftEmployeeInfo(craftTradersEmployeeDetailId);
		  } catch (Exception e) {}
		  if(employee==null) {
			employee= JtbAddCraftEmployeeInfoLocalServiceUtil.createJtbAddCraftEmployeeInfo(CounterLocalServiceUtil.increment());
			employee.setCounter(counterCraftEmployee);
		  }
		  employee.setEmpName(craftTradersEmployeeName);
		    employee.setEmpAddress(craftTradersEmployeeAddress);
		    employee.setEmpPhoneNo(craftTradersEmployeePhoneNo);
		employee.setJtbApplicationId(jtbApplicationId);
		JtbAddCraftEmployeeInfoLocalServiceUtil.updateJtbAddCraftEmployeeInfo(employee);
		
		jsonOBJ.put("craftTradersEmployeeDetailId", employee.getJtbAddCraftEmployeeInfoId());
		jsonOBJ.put("counter", employee.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Occured", e);
		}
		return false;
	}

}
