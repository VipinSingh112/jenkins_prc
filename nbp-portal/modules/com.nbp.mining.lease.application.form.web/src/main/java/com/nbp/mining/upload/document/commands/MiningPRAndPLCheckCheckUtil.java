package com.nbp.mining.upload.document.commands;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance;
import com.nbp.mining.stage.service.service.MiningApplicationCertificateIssuanceLocalServiceUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=check/Licence/Number/Mining/Lease/Url" }, service = MVCResourceCommand.class)
public class MiningPRAndPLCheckCheckUtil implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String prospectingRN = ParamUtil.getString(resourceRequest,"proRightNum");
		String prospectingLN = ParamUtil.getString(resourceRequest,"proLicenNumber");
		//Finding application by mining app number
		MiningLeaseApplication miningByAppNum =null;
		try {
			miningByAppNum = MiningLeaseApplicationLocalServiceUtil.getMiningBy_PRNum_PLNum(prospectingLN,prospectingRN);
		}catch (Exception e) {
		}
		//Finding application by mining certificate number
		MiningApplicationCertificateIssuance miningByCertificateNumberPR=null;
		MiningApplicationCertificateIssuance miningByCertificateNumberPL=null;
		try {
			miningByCertificateNumberPL=MiningApplicationCertificateIssuanceLocalServiceUtil.getMiningApplicationCertificateIssuanceByCN(prospectingRN);
		} catch (Exception e) {
		}
		try {
			miningByCertificateNumberPR=MiningApplicationCertificateIssuanceLocalServiceUtil.getMiningApplicationCertificateIssuanceByCN(prospectingLN);
		} catch (Exception e) {
		}
		if(Validator.isNotNull(miningByAppNum)||(Validator.isNotNull(miningByCertificateNumberPR)&&(Validator.isNotNull(miningByCertificateNumberPL)))) {
			jsonOBJ.put("response", "1");
		}else {
			jsonOBJ.put("response", "0");
		}
		
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	

}
