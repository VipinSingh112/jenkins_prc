package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;
import com.nbp.jtb.application.form.service.service.JtbAddCraftApplicantInfoLocalServiceUtil;
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
	"mvc.command.name=/operator/manager/info/edit" }, 
service = MVCResourceCommand.class)

public class JTBAddOperatingManagerResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(JTBAddOperatingManagerResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String newAttractionsOperatorName=ParamUtil.getString(resourceRequest, "newAttractionsOperatorName");
		String newAttractionsLocation=ParamUtil.getString(resourceRequest, "newAttractionsLocation");
		String newAttractionsEmailAddress=ParamUtil.getString(resourceRequest, "newAttractionsEmailAddress");
		String newAttractionsTelephone=ParamUtil.getString(resourceRequest, "newAttractionsTelephone");

		String counterOperator=ParamUtil.getString(resourceRequest, "counterOperator");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		/* hidden */
		long operatorManagerDetailId=ParamUtil.getLong(resourceRequest, "operatorManagerDetailId");
		
		JtbAddCraftApplicantInfo operatinManager=null;
		  try {
			  operatinManager= JtbAddCraftApplicantInfoLocalServiceUtil.getJtbAddCraftApplicantInfo(operatorManagerDetailId);
		  } catch (Exception e) {}
		  if(operatinManager==null) {
			operatinManager= JtbAddCraftApplicantInfoLocalServiceUtil.createJtbAddCraftApplicantInfo(CounterLocalServiceUtil.increment());
			operatinManager.setCounter(counterOperator);
		  }
		  operatinManager.setOwnerName(newAttractionsOperatorName);
		  operatinManager.setOwnerAddress(newAttractionsLocation);
		  operatinManager.setOwnerPhoneNo(newAttractionsTelephone);
		  operatinManager.setOperatingEmail(newAttractionsEmailAddress);
		operatinManager.setJtbApplicationId(jtbApplicationId);
		JtbAddCraftApplicantInfoLocalServiceUtil.updateJtbAddCraftApplicantInfo(operatinManager);
		
		jsonOBJ.put("operatorManagerDetailId", operatinManager.getJtbAddCraftApplicantInfoId());
		jsonOBJ.put("counter", operatinManager.getCounter());
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
