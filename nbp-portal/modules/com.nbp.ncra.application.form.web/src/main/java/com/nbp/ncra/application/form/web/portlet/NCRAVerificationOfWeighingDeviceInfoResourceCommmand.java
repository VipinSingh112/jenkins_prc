package com.nbp.ncra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
			"mvc.command.name=/weight/in/device/form/info"
		},
		service = MVCResourceCommand.class
	)
public class NCRAVerificationOfWeighingDeviceInfoResourceCommmand implements MVCResourceCommand{
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			String typeofDevice = ParamUtil.getString(resourceRequest, "typeofDevice");
		    String manufacturer = ParamUtil.getString(resourceRequest, "manufacturer");
		    String serialNumber = ParamUtil.getString(resourceRequest, "serialNumber");
		    String quantity = ParamUtil.getString(resourceRequest, "quantity");
		    String maximumCapacity = ParamUtil.getString(resourceRequest, "maximumCapacity");
		    long ncraApplicationId = ParamUtil.getLong(resourceRequest, "ncraApplicationId");
		    long wieghDeviceAppId= ParamUtil.getLong(resourceRequest, "weighDeviceApplicationId");
		    String counter = ParamUtil.getString(resourceRequest, "weighingDeviceDetailVal");
		    String deleteKey = ParamUtil.getString(resourceRequest, "deleteKey");
			if(deleteKey.contains("deleteApplicant")) {
				try {
					NcraVerifyWeighingDeviceInfoLocalServiceUtil.deleteNcraVerifyWeighingDeviceInfo(wieghDeviceAppId);
					System.out.println("---in delete section-----");
				} catch (PortalException e) {
				}
			}else {
		    NcraVerifyWeighingDeviceInfo weighingDeviceInfo=null;
			try {
				weighingDeviceInfo= NcraVerifyWeighingDeviceInfoLocalServiceUtil.getNcraVerifyWeighingDeviceInfo(wieghDeviceAppId); 
			 }catch (Exception e) { }
		
			
		    if (weighingDeviceInfo==null) {
		    	weighingDeviceInfo=	NcraVerifyWeighingDeviceInfoLocalServiceUtil.createNcraVerifyWeighingDeviceInfo(CounterLocalServiceUtil.increment());
		    	weighingDeviceInfo.setCounter(counter);
			}
		    weighingDeviceInfo.setTypeofDevice(typeofDevice);
		    weighingDeviceInfo.setManufacturer(manufacturer);
		    weighingDeviceInfo.setSerialNumber(serialNumber);
		    weighingDeviceInfo.setQuantity(quantity);
		    weighingDeviceInfo.setMaximumCapacity(maximumCapacity);
		    weighingDeviceInfo.setNcraApplicationId(ncraApplicationId);
		    NcraVerifyWeighingDeviceInfoLocalServiceUtil.updateNcraVerifyWeighingDeviceInfo(weighingDeviceInfo);
		    jsonOBJ.put("weighDeviceId",weighingDeviceInfo.getNcraVerifyWeighingDeviceInfoId());
	        jsonOBJ.put("weighDeviceCounter",weighingDeviceInfo.getCounter());
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
			}}
		return false;
	}
}
