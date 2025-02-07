package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=add/business/detail/info"
		},
		service = MVCResourceCommand.class
	)

public class NcbjAddBusinessDetailInfoResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(NcbjAddBusinessDetailInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling NCBJ Business Detail Resource command---");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String applicantShifts=ParamUtil.getString(resourceRequest, "applicantShifts");
		String applicantProductTypes=ParamUtil.getString(resourceRequest, "applicantProductTypes");
		String applicantAddressOne=ParamUtil.getString(resourceRequest, "applicantAddressOne");
		String headOffices=ParamUtil.getString(resourceRequest, "headOffices");
		String noOfFullTimeEmployees=ParamUtil.getString(resourceRequest, "noOfFullTimeEmployees");
		String noOfPartTimeEmployees=ParamUtil.getString(resourceRequest, "noOfPartTimeEmployees");
		String noOfContractors=ParamUtil.getString(resourceRequest, "noOfContractors");
		String noOfContractedWorkers=ParamUtil.getString(resourceRequest, "noOfContractedWorkers");
		String counterOfApplicantDetail=ParamUtil.getString(resourceRequest, "counterOfApplicantDetail");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		/* hidden */
		long ncbjBusinessDetailAddId=ParamUtil.getLong(resourceRequest, "applicantDetailValId");
		NcbjBusinessDetailAdd businessDetailAdd= null;
		  try {
			  businessDetailAdd= NcbjBusinessDetailAddLocalServiceUtil.getNcbjBusinessDetailAdd(ncbjBusinessDetailAddId);
		  } catch (Exception e) {}
		  
		  if(businessDetailAdd==null) {
			  businessDetailAdd= NcbjBusinessDetailAddLocalServiceUtil.createNcbjBusinessDetailAdd(CounterLocalServiceUtil.increment());
			  businessDetailAdd.setCounter(counterOfApplicantDetail);
		 }
		  businessDetailAdd.setNumberAndTimeOfShift(applicantShifts);
		  businessDetailAdd.setTypeOfProduct(applicantProductTypes);
		  businessDetailAdd.setBusinessAddress(applicantAddressOne);
		  businessDetailAdd.setHeadOffices(headOffices);
		  businessDetailAdd.setNoOfFullTimeEmployees(noOfFullTimeEmployees);
		  businessDetailAdd.setNoOfPartTimeEmployees(noOfPartTimeEmployees);
		  businessDetailAdd.setNoOfContractors(noOfContractors);
		  businessDetailAdd.setNoOfContractedWorkers(noOfContractedWorkers);
		  businessDetailAdd.setNcbjApplicationId(ncbjApplicationId);
		  NcbjBusinessDetailAddLocalServiceUtil.updateNcbjBusinessDetailAdd(businessDetailAdd);
		  jsonOBJ.put("ncbjBusinessDetailAddId", businessDetailAdd.getNcbjBusinessDetailAddId());
			jsonOBJ.put("counter", counterOfApplicantDetail);
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
				_log.error("An Error Occured", e);
			}
		
		// TODO Auto-generated method stub
		return false;
	}

}

