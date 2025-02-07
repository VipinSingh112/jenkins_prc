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
		"mvc.command.name=/contract/carriage/general/declare/info" }, service = MVCResourceCommand.class)
public class JtbContractCarriageGeneralDeclareResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbContractCarriageGeneralDeclareResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction Contract Carriage General Declaration Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
	    String ownerSignDate = ParamUtil.getString(resourceRequest, "ownerSignDate");

	    AttractionConCarriageInfo contractCarriageGen =null;
		try {
			contractCarriageGen=AttractionConCarriageInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(contractCarriageGen)) {
			contractCarriageGen = AttractionConCarriageInfoLocalServiceUtil.createAttractionConCarriageInfo(CounterLocalServiceUtil.increment());
		}
		try {
			contractCarriageGen.setOwnerSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(ownerSignDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
	    contractCarriageGen.setJtbApplicationId(jtbApplicationId);
		AttractionConCarriageInfoLocalServiceUtil.updateAttractionConCarriageInfo(contractCarriageGen);
		
		return false;
	}

}
