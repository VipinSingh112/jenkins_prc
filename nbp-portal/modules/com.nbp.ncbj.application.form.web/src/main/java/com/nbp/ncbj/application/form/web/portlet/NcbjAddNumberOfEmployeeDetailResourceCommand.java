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
import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;
import com.nbp.ncbj.application.form.service.service.NcbjNumOfEmpAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/number/employee/detail/info" 
		},service = MVCResourceCommand.class)

public class NcbjAddNumberOfEmployeeDetailResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NcbjAddNumberOfEmployeeDetailResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling NUMBER OF EMPLOYEE Detail Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long employeesNumberDetailId = ParamUtil.getLong(resourceRequest, "employeesNumberDetailId");
		String headOffice = ParamUtil.getString(resourceRequest, "headOffice");
	    String administrationOffice = ParamUtil.getString(resourceRequest, "administrationOffice");
	    String productionProcessing = ParamUtil.getString(resourceRequest, "productionProcessing");
	    String maintenanceService = ParamUtil.getString(resourceRequest, "maintenanceService");
	    String logistics = ParamUtil.getString(resourceRequest, "logistics");
	    String total = ParamUtil.getString(resourceRequest, "total");
	    String seasonal = ParamUtil.getString(resourceRequest, "seasonal");
	    String temporary = ParamUtil.getString(resourceRequest, "temporary");
	    String subcontracted = ParamUtil.getString(resourceRequest, "subcontracted");

		String counter = ParamUtil.getString(resourceRequest, "counter");
		
		NcbjNumOfEmpAdd productDetail = null;
			try {
				productDetail = NcbjNumOfEmpAddLocalServiceUtil.getNcbjNumOfEmpAdd(employeesNumberDetailId);
			} catch (PortalException e) {}
			
			if(productDetail==null) {
			productDetail = NcbjNumOfEmpAddLocalServiceUtil.createNcbjNumOfEmpAdd(
					CounterLocalServiceUtil.increment());
			productDetail.setCounter(counter);
		}
		productDetail.setHeadOffice(headOffice);
        productDetail.setAdministrationOffice(administrationOffice);
        productDetail.setProductionProcessing(productionProcessing);
        productDetail.setMaintenanceService(maintenanceService);
        productDetail.setLogistics(logistics);
        productDetail.setTotal(total);
        productDetail.setSeasonal(seasonal);
        productDetail.setTemporary(temporary);
        productDetail.setSubcontracted(subcontracted);
		productDetail.setNcbjApplicationId(ncbjApplicationId);
		NcbjNumOfEmpAddLocalServiceUtil.updateNcbjNumOfEmpAdd(productDetail);
		jsonOBJ.put("employeesNumberDetailId", productDetail.getNcbjNumOfEmpAddId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		 }
		
		return false;
	}

}
