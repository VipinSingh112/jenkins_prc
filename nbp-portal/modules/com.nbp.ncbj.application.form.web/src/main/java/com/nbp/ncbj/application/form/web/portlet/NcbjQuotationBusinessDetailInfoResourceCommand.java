package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/quotation/Business/Details" 
		},service = MVCResourceCommand.class)
public class NcbjQuotationBusinessDetailInfoResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(NcbjQuotationBusinessDetailInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String quotationApplicantAddressOne=ParamUtil.getString(resourceRequest, "quotationApplicantAddressOne");
		String quotationApplicantProductTypes=ParamUtil.getString(resourceRequest, "quotationApplicantProductTypes");
		String quotationApplicantShifts=ParamUtil.getString(resourceRequest, "quotationApplicantShifts");
		String quotationEmpNum=ParamUtil.getString(resourceRequest, "quotationEmpNum");
		String quotationHeadOffices=ParamUtil.getString(resourceRequest, "quotationHeadOffices");
		String quotationNoOfFullTimeEmployees=ParamUtil.getString(resourceRequest, "quotationNoOfFullTimeEmployees");
		String quotationNoOfPartTimeEmployees=ParamUtil.getString(resourceRequest, "quotationNoOfPartTimeEmployees");
		String quotationNoOfContractors=ParamUtil.getString(resourceRequest, "quotationNoOfContractors");
		String quotationNoOfContractedWorkers=ParamUtil.getString(resourceRequest, "quotationNoOfContractedWorkers");
		String counterquotationApplicantDetail=ParamUtil.getString(resourceRequest, "counterquotationApplicantDetail");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		
		long quotationApplicantDetailValId=ParamUtil.getLong(resourceRequest, "quotationApplicantDetailValId");
		
		NcbjBusinessDetail quotationBusinessDetail=null;
			try {
				quotationBusinessDetail=NcbjBusinessDetailLocalServiceUtil.getNcbjBusinessDetail(quotationApplicantDetailValId);
			} catch (PortalException e) {
			}
			 if(quotationBusinessDetail==null) {
			  quotationBusinessDetail= NcbjBusinessDetailLocalServiceUtil.createNcbjBusinessDetail(CounterLocalServiceUtil.increment());
			  quotationBusinessDetail.setCounter(counterquotationApplicantDetail);
			 }
			  
		  quotationBusinessDetail.setQuotationAddressOne(quotationApplicantAddressOne);
		  quotationBusinessDetail.setQuotationProductTypes(quotationApplicantProductTypes);
		  quotationBusinessDetail.setQuotationApplicantShifts(quotationApplicantShifts);
		  quotationBusinessDetail.setQuotationEmpNum(quotationEmpNum);
		  quotationBusinessDetail.setQuotationHeadOffices(quotationHeadOffices);
		  quotationBusinessDetail.setQuotationFullTimeEmploy(quotationNoOfFullTimeEmployees);
		  quotationBusinessDetail.setQuotationPartTimeEmploy(quotationNoOfPartTimeEmployees);
		  quotationBusinessDetail.setQuotationContractors(quotationNoOfContractors);
		  quotationBusinessDetail.setQuotationContractedWorker(quotationNoOfContractedWorkers);
		  quotationBusinessDetail.setNcbjApplicationId(ncbjApplicationId);
		  
		  NcbjBusinessDetailLocalServiceUtil.updateNcbjBusinessDetail(quotationBusinessDetail);
		  jsonOBJ.put("quotationApplicantDetailValId", quotationBusinessDetail.getNcbjBusinessDetailId());
			jsonOBJ.put("counter", quotationBusinessDetail.getCounter());
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