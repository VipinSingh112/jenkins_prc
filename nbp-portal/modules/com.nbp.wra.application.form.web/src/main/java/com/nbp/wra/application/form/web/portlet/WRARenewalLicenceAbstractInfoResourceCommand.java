package com.nbp.wra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;
import com.nbp.wra.application.form.service.service.RenewLicAbstractAndWaterLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/set/Renewal/To/Abstract/Water/Info" }, service = MVCResourceCommand.class)
public class WRARenewalLicenceAbstractInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		String renewName = ParamUtil.getString(resourceRequest, "renewName");
		String renewContact = ParamUtil.getString(resourceRequest, "renewContact");
		String renewJobTitle = ParamUtil.getString(resourceRequest, "renewJobTitle");
		String renewTelephoneNum = ParamUtil.getString(resourceRequest, "renewTelephoneNum");
		String renewFaxNum = ParamUtil.getString(resourceRequest, "renewFaxNum");
		String renewParishLocation = ParamUtil.getString(resourceRequest, "renewParishLocation");
		String renewAddress = ParamUtil.getString(resourceRequest, "renewAddress");
		String renewSourceName = ParamUtil.getString(resourceRequest, "renewSourceName");
		String renewDetailsParishAdd = ParamUtil.getString(resourceRequest, "renewDetailsParishAdd");
		String renewDetailsLocation = ParamUtil.getString(resourceRequest, "renewDetailsLocation");
		String renewAbstractionRate = ParamUtil.getString(resourceRequest, "renewAbstractionRate");
		String renewDetailsUse = ParamUtil.getString(resourceRequest, "renewDetailsUse");
		String renewAbstractionMethod = ParamUtil.getString(resourceRequest, "renewAbstractionMethod");
		String attachedDevice = ParamUtil.getString(resourceRequest, "attachedDevice");
		String renewStateDevice = ParamUtil.getString(resourceRequest, "renewStateDevice");
		String abstractionData = ParamUtil.getString(resourceRequest, "abstractionData");
		String renewSignName = ParamUtil.getString(resourceRequest, "renewSignName");
		String renewDate = ParamUtil.getString(resourceRequest, "renewDate");
		long wraApplicationId=ParamUtil.getLong(resourceRequest,"wraApplicationId");
		RenewLicAbstractAndWater renewAbstractInfo = null;
		try {
			renewAbstractInfo= RenewLicAbstractAndWaterLocalServiceUtil.getWRA_By_Id(wraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (renewAbstractInfo == null) {
			renewAbstractInfo=RenewLicAbstractAndWaterLocalServiceUtil.createRenewLicAbstractAndWater(CounterLocalServiceUtil.increment());
		}
		renewAbstractInfo.setRenewName(renewName);
		renewAbstractInfo.setRenewContact(renewContact);
		renewAbstractInfo.setRenewJobTitle(renewJobTitle);
		renewAbstractInfo.setRenewTelephoneNum(renewTelephoneNum);
		renewAbstractInfo.setRenewFaxNum(renewFaxNum);
		renewAbstractInfo.setRenewParishLocation(renewParishLocation);
		renewAbstractInfo.setRenewAddress(renewAddress);
		renewAbstractInfo.setRenewSourceName(renewSourceName);
		renewAbstractInfo.setRenewDetailsParishAdd(renewDetailsParishAdd);
		renewAbstractInfo.setRenewDetailsLocation(renewDetailsLocation);
		renewAbstractInfo.setRenewAbstractionRate(renewAbstractionRate);
		renewAbstractInfo.setRenewDetailsUse(renewDetailsUse);
		renewAbstractInfo.setRenewAbstractionMethod(renewAbstractionMethod);
		renewAbstractInfo.setAttachedDevice(attachedDevice);
		renewAbstractInfo.setRenewStateDevice(renewStateDevice);
		renewAbstractInfo.setAbstractionData(abstractionData);
		renewAbstractInfo.setRenewSignName(renewSignName);
		try {
			renewAbstractInfo.setRenewDate(new SimpleDateFormat("yyyy-MM-dd").parse(renewDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		renewAbstractInfo.setWraApplicationId(wraApplicationId);
		RenewLicAbstractAndWaterLocalServiceUtil.updateRenewLicAbstractAndWater(renewAbstractInfo);
		
		return false;
	}

}
