package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionCraftTrader;
import com.nbp.jtb.application.form.service.service.AttractionCraftTraderLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/craft/trader/permit/info" }, service = MVCResourceCommand.class)
public class JtbCraftTraderPermitResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbCraftTraderPermitResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction CRAFTTRADER PERMIT Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String occupyLocation = ParamUtil.getString(resourceRequest, "occupyLocation");
		String craftTraderGoodsType = ParamUtil.getString(resourceRequest, "craftTraderGoodsType");
		String craftTraderName = ParamUtil.getString(resourceRequest, "craftTraderName");
		String craftTraderPosition = ParamUtil.getString(resourceRequest, "craftTraderPosition");
		String craftTraderNameMinisterAddress = ParamUtil.getString(resourceRequest, "craftTraderNameMinisterAddress");
		String craftTraderNameMinisterName = ParamUtil.getString(resourceRequest, "craftTraderNameMinisterName");
		String craftTraderMinisterNamePosition = ParamUtil.getString(resourceRequest, "craftTraderMinisterNamePosition");
		String craftTraderAddressOwner = ParamUtil.getString(resourceRequest, "craftTraderAddressOwner");
		String craftTraderSignDate = ParamUtil.getString(resourceRequest, "craftTraderSignDate");
		String craftTraderAssistantSignDate = ParamUtil.getString(resourceRequest, "craftTraderAssistantSignDate");
		
		String craftTradersApplicantOwner = ParamUtil.getString(resourceRequest, "craftTradersApplicantOwner");
		String craftTradersApplicantAddress = ParamUtil.getString(resourceRequest, "craftTradersApplicantAddress");
		String craftTradersApplicantPhoneNo = ParamUtil.getString(resourceRequest, "craftTradersApplicantPhoneNo");
		String craftTradersApplicantEmail = ParamUtil.getString(resourceRequest, "craftTradersApplicantEmail");

		AttractionCraftTrader craftTrader =null;
		try {
			craftTrader=AttractionCraftTraderLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(craftTrader)) {
			craftTrader = AttractionCraftTraderLocalServiceUtil.createAttractionCraftTrader(CounterLocalServiceUtil.increment());
		}
		craftTrader.setCraftTradersAppliOwner(craftTradersApplicantOwner);
		craftTrader.setCraftTradersAppliAddress(craftTradersApplicantAddress);
		craftTrader.setCraftTradersAppliPhoneNo(craftTradersApplicantPhoneNo);
		craftTrader.setCraftTradersAppliEmail(craftTradersApplicantEmail);
		craftTrader.setOccupyLocation(occupyLocation);
		craftTrader.setCraftTraderGoodsType(craftTraderGoodsType);
		craftTrader.setCraftTraderName(craftTraderName);
        craftTrader.setCraftTraderPosition(craftTraderPosition);
        craftTrader.setCraftTraderMinisterAddr(craftTraderNameMinisterAddress);
        craftTrader.setCraftTraderMinisterName(craftTraderNameMinisterName);
        craftTrader.setCraftTraderMinisterNamePos(craftTraderMinisterNamePosition);
        craftTrader.setCraftTraderAddressOwner(craftTraderAddressOwner);
        try {
        	craftTrader.setCraftTraderSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(craftTraderSignDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
        try {
        	craftTrader.setCraftTraderAssistSiDate(new SimpleDateFormat("yyyy-MM-dd").parse(craftTraderSignDate));
        } catch (Exception e) {
        	// TODO: handle exception
        }
	    craftTrader.setJtbApplicationId(jtbApplicationId);
	    AttractionCraftTraderLocalServiceUtil.updateAttractionCraftTrader(craftTrader);
		
		return false;
	}

}
