package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo;
import com.nbp.jtb.application.form.service.service.AttractionConCarriageInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/contract/carriage/detail/info" }, service = MVCResourceCommand.class)
public class JtbContractCarriageOperatorResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbContractCarriageOperatorResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction Contract Carriage Operator Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String newContractOwnerName = ParamUtil.getString(resourceRequest, "newContractOwnerName");
	    String newContractHomeAddress = ParamUtil.getString(resourceRequest, "newContractHomeAddress");
	    String newContractEmail = ParamUtil.getString(resourceRequest, "newContractEmail");
	    String newContractTelephone = ParamUtil.getString(resourceRequest, "newContractTelephone");
	    String newContractTrn = ParamUtil.getString(resourceRequest, "newContractTrn");
	    String newContractParish = ParamUtil.getString(resourceRequest, "newContractParish");
	    String newContractDate = ParamUtil.getString(resourceRequest, "newContractDate");
	    String newContractVehiclesNo = ParamUtil.getString(resourceRequest, "newContractVehiclesNo");
	    String contractOrganization = ParamUtil.getString(resourceRequest, "contractOrganization");

	    AttractionConCarriageInfo contractCarriage =null;
		try {
			contractCarriage=AttractionConCarriageInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(contractCarriage)) {
			contractCarriage = AttractionConCarriageInfoLocalServiceUtil.createAttractionConCarriageInfo(CounterLocalServiceUtil.increment());
		}
		 contractCarriage.setOwnerName(newContractOwnerName);
	    contractCarriage.setHomeAddress(newContractHomeAddress);
	    contractCarriage.setEmail(newContractEmail);
	    contractCarriage.setTelephone(newContractTelephone);
	    contractCarriage.setParish(newContractParish);
	    try {
	    	contractCarriage.setNewContractDate(new SimpleDateFormat("yyyy-MM-dd").parse(newContractDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
	    contractCarriage.setNewContarctVehiclesNo(newContractVehiclesNo);
	    contractCarriage.setNewContractTrn(newContractTrn);
	    contractCarriage.setContractOrganization(contractOrganization);
	    contractCarriage.setJtbApplicationId(jtbApplicationId);
		AttractionConCarriageInfoLocalServiceUtil.updateAttractionConCarriageInfo(contractCarriage);
		
		return false;
	}

}
