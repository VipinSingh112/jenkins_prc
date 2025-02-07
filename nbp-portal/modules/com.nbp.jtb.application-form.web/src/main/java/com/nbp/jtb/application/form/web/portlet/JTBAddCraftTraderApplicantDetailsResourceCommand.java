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
	"mvc.command.name=/craft/trader/applicant/info/edit" }, 
service = MVCResourceCommand.class)

public class JTBAddCraftTraderApplicantDetailsResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(JTBAddCraftTraderApplicantDetailsResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		/*String craftTradersApplicantOwner = ParamUtil.getString(resourceRequest, "craftTradersApplicantOwner");
		String craftTradersApplicantAddress = ParamUtil.getString(resourceRequest, "craftTradersApplicantAddress");
		String craftTradersApplicantPhoneNo = ParamUtil.getString(resourceRequest, "craftTradersApplicantPhoneNo");
		String craftTradersApplicantEmail = ParamUtil.getString(resourceRequest, "craftTradersApplicantEmail");*/
		String craftTradersApplicantLocation = ParamUtil.getString(resourceRequest, "craftTradersApplicantLocation");

		String counterCraftApplicant=ParamUtil.getString(resourceRequest, "counterCraftApplicant");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		/* hidden */
		long craftTradersApplicantDetailId=ParamUtil.getLong(resourceRequest, "craftTradersApplicantDetailId");
		
		JtbAddCraftApplicantInfo applicant=null;
		  try {
			  applicant= JtbAddCraftApplicantInfoLocalServiceUtil.getJtbAddCraftApplicantInfo(craftTradersApplicantDetailId);
		  } catch (Exception e) {}
		  if(applicant==null) {
			applicant= JtbAddCraftApplicantInfoLocalServiceUtil.createJtbAddCraftApplicantInfo(CounterLocalServiceUtil.increment());
			applicant.setCounter(counterCraftApplicant);
		  }
		  /*applicant.setOwnerName(craftTradersApplicantOwner);
		  applicant.setOwnerAddress(craftTradersApplicantAddress);
		  applicant.setOwnerPhoneNo(craftTradersApplicantPhoneNo);
		  applicant.setOperatingEmail(craftTradersApplicantEmail);*/
		  applicant.setSellingLocation(craftTradersApplicantLocation);
		applicant.setJtbApplicationId(jtbApplicationId);
		JtbAddCraftApplicantInfoLocalServiceUtil.updateJtbAddCraftApplicantInfo(applicant);
		
		jsonOBJ.put("craftTradersApplicantDetailId", applicant.getJtbAddCraftApplicantInfoId());
		jsonOBJ.put("counter", applicant.getCounter());
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
