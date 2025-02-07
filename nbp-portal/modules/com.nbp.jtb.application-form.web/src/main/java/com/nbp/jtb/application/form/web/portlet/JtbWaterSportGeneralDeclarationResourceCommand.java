package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare;
import com.nbp.jtb.application.form.service.service.AttractionWaterGenDeclareLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/water/sport/general/declare/info" }, service = MVCResourceCommand.class)
public class JtbWaterSportGeneralDeclarationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbWaterSportGeneralDeclarationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction GENERAL DECLARATION Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String firstAid = ParamUtil.getString(resourceRequest,"firstAid");
        String cpr = ParamUtil.getString(resourceRequest,"cpr");
        String divingCertificate = ParamUtil.getString(resourceRequest,"divingCertificate");
        String rlss = ParamUtil.getString(resourceRequest,"rlss");
        String lifeguard = ParamUtil.getString(resourceRequest,"lifeguard");
        String breathing = ParamUtil.getString(resourceRequest,"breathing");
        String waterSportOpName = ParamUtil.getString(resourceRequest,"waterSportOpName");
        String waterSportOpAddress = ParamUtil.getString(resourceRequest,"waterSportOpAddress");
        String waterSportOpinsuranceAmount = ParamUtil.getString(resourceRequest,"waterSportOpinsuranceAmount");
        String waterSportOpManagerSignDate = ParamUtil.getString(resourceRequest,"waterSportOpManagerSignDate");

		AttractionWaterGenDeclare generalDeclare =null;
		try {
			generalDeclare=AttractionWaterGenDeclareLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(generalDeclare)) {
			generalDeclare = AttractionWaterGenDeclareLocalServiceUtil.createAttractionWaterGenDeclare(CounterLocalServiceUtil.increment());
		}
		 generalDeclare.setFirstAid(firstAid);
	        generalDeclare.setCpr(cpr);
	        generalDeclare.setDivingCertificate(divingCertificate);
	        generalDeclare.setRlss(rlss);
	        generalDeclare.setLifeguard(lifeguard);
	        generalDeclare.setBreathing(breathing);
	        generalDeclare.setOperationName(waterSportOpName);
	        generalDeclare.setOperationAddress(waterSportOpAddress);
	        generalDeclare.setInsuranceAmount(waterSportOpinsuranceAmount);
	        try {
	        	generalDeclare.setManagerSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(waterSportOpManagerSignDate));
			} catch (Exception e) {
				// TODO: handle exception
			}
	        generalDeclare.setJtbApplicationId(jtbApplicationId);
		AttractionWaterGenDeclareLocalServiceUtil.updateAttractionWaterGenDeclare(generalDeclare);
		
		return false;
	}

}
