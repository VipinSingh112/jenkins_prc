package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo;
import com.nbp.jtb.application.form.service.service.JtbAddListDriverInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
	"mvc.command.name=/list/driver/info/edit" }, 
service = MVCResourceCommand.class)

public class JTBAddListDriverInfoResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(JTBAddListDriverInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String contractDriverListName = ParamUtil.getString(resourceRequest, "contractDriverListName");
		String contractDriverListLicence = ParamUtil.getString(resourceRequest, "contractDriverListLicence");
		String contractDriverListExpiryDate = ParamUtil.getString(resourceRequest, "contractDriverListExpiryDate");
		String driverSignature = ParamUtil.getString(resourceRequest, "driverSignature");
		String counterDriverList = ParamUtil.getString(resourceRequest, "counterDriverList");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		/* hidden */
		long contractDriverListDetailId=ParamUtil.getLong(resourceRequest, "contractDriverListDetailId");
		
		JtbAddListDriverInfo driverList=null;
		  try {
			  driverList= JtbAddListDriverInfoLocalServiceUtil.getJtbAddListDriverInfo(contractDriverListDetailId);
		  } catch (Exception e) {}
		  if(driverList==null) {
			driverList= JtbAddListDriverInfoLocalServiceUtil.createJtbAddListDriverInfo(CounterLocalServiceUtil.increment());
			driverList.setCounter(counterDriverList);
		  }
		  driverList.setDriverName(contractDriverListName);
		  driverList.setDriverLicence(contractDriverListLicence);
		  try {
			  driverList.setDriverExpiryDate(new SimpleDateFormat("yyyy-MM-dd").parse(contractDriverListExpiryDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		driverList.setJtbApplicationId(jtbApplicationId);
		JtbAddListDriverInfoLocalServiceUtil.updateJtbAddListDriverInfo(driverList);
		
		jsonOBJ.put("contractDriverListDetailId", driverList.getJtbAddListDriverInfoId());
		jsonOBJ.put("counter", driverList.getCounter());
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
