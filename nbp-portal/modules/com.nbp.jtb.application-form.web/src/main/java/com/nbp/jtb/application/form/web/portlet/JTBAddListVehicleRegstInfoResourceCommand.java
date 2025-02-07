package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst;
import com.nbp.jtb.application.form.service.service.JtbAddListVehicleRegstLocalServiceUtil;
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
	"mvc.command.name=/list/vehicle/regst/info/edit" }, 
service = MVCResourceCommand.class)

public class JTBAddListVehicleRegstInfoResourceCommand implements MVCResourceCommand{
	private static Log _log=LogFactoryUtil.getLog(JTBAddListVehicleRegstInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String contractVehicleRegisterYear=ParamUtil.getString(resourceRequest, "contractVehicleRegisterYear");
		String contractVehicleRegisterModel=ParamUtil.getString(resourceRequest, "contractVehicleRegisterModel");
		String contractVehicleRegisterPlate=ParamUtil.getString(resourceRequest, "contractVehicleRegisterPlate");
		String contractVehicleRegisterExpDate=ParamUtil.getString(resourceRequest, "contractVehicleRegisterExpDate");
		String contractVehicleRegisterFitnessDate=ParamUtil.getString(resourceRequest, "contractVehicleRegisterFitnessDate");
		String contractVehicleRegisterChassis=ParamUtil.getString(resourceRequest, "contractVehicleRegisterChassis");
		String contractVehicleRegisterBased=ParamUtil.getString(resourceRequest, "contractVehicleRegisterBased");
		String contractVehicleRegisterInsuranceCom=ParamUtil.getString(resourceRequest, "contractVehicleRegisterInsuranceCom");
		String contractVehicleRegisterPolicyNum=ParamUtil.getString(resourceRequest, "contractVehicleRegisterPolicyNum");
		String contractVehicleRegisterExpiryDate=ParamUtil.getString(resourceRequest, "contractVehicleRegisterExpiryDate");
		String counterListVehicleRegst=ParamUtil.getString(resourceRequest, "counterListVehicleRegst");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		/* hidden */
		long contractVehicleRegisterDetailId=ParamUtil.getLong(resourceRequest, "contractVehicleRegisterDetailId");
		
		JtbAddListVehicleRegst vehicleRegistration=null;
		  try {
			  vehicleRegistration= JtbAddListVehicleRegstLocalServiceUtil.getJtbAddListVehicleRegst(contractVehicleRegisterDetailId);
		  } catch (Exception e) {}
		  if(vehicleRegistration==null) {
			vehicleRegistration= JtbAddListVehicleRegstLocalServiceUtil.createJtbAddListVehicleRegst(CounterLocalServiceUtil.increment());
			vehicleRegistration.setCounter(counterListVehicleRegst);
		  }
		  vehicleRegistration.setVehicleRegstYear(contractVehicleRegisterYear);
		  vehicleRegistration.setVehicleRegstModel(contractVehicleRegisterModel);
		  vehicleRegistration.setVehicleRegstPlate(contractVehicleRegisterPlate);
		  try {
			  vehicleRegistration.setVehicleRegstExpDate(new SimpleDateFormat("yyyy-MM-dd").parse(contractVehicleRegisterExpDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		  try {
			  vehicleRegistration.setVehicleRegstFitnessDate(new SimpleDateFormat("yyyy-MM-dd").parse(contractVehicleRegisterFitnessDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		  vehicleRegistration.setVehicleRegstChassis(contractVehicleRegisterChassis);
		  vehicleRegistration.setVehicleRegstBased(contractVehicleRegisterBased);
		  vehicleRegistration.setVehicleRegstInsuranceCom(contractVehicleRegisterInsuranceCom);
		  vehicleRegistration.setVehicleRegstPolicyNum(contractVehicleRegisterPolicyNum);
		  try {
			  vehicleRegistration.setVehicleRegstExpiryDate(new SimpleDateFormat("yyyy-MM-dd").parse(contractVehicleRegisterExpiryDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		vehicleRegistration.setJtbApplicationId(jtbApplicationId);
		JtbAddListVehicleRegstLocalServiceUtil.updateJtbAddListVehicleRegst(vehicleRegistration);
		
		jsonOBJ.put("contractVehicleRegisterDetailId", vehicleRegistration.getJtbAddListVehicleRegstId());
		jsonOBJ.put("counter", vehicleRegistration.getCounter());
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
