package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCInformationRequest;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCInformationRequestLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationWorkFlowConstants;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=set/Information/Request/INfo/Url" }, service = MVCResourceCommand.class)
public class JADSCApplicationInformationRequestInfoResourceCommand implements MVCResourceCommand {
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
	    String companyName = ParamUtil.getString(resourceRequest, "companyName");
	    String address = ParamUtil.getString(resourceRequest, "address");
	    String mainTelephone = ParamUtil.getString(resourceRequest, "mainTelephone");
	    String officeTelephone = ParamUtil.getString(resourceRequest, "officeTelephone");
	    String cellTelephone = ParamUtil.getString(resourceRequest, "cellTelephone");
	    String otherContact = ParamUtil.getString(resourceRequest, "otherContact");
	    String whatsappTelephone = ParamUtil.getString(resourceRequest, "whatsappTelephone");
	    String emailContact = ParamUtil.getString(resourceRequest, "emailContact");
	    String contactPerName = ParamUtil.getString(resourceRequest, "contactPerName");
	    String contactPerPosition = ParamUtil.getString(resourceRequest, "contactPerPosition");
	    String contactPerPhone = ParamUtil.getString(resourceRequest, "contactPerPhone");
	    String contactPerEmail = ParamUtil.getString(resourceRequest, "contactPerEmail");
	    String altContactPerName = ParamUtil.getString(resourceRequest, "altContactPerName");
	    String altContactPerPosition = ParamUtil.getString(resourceRequest, "altContactPerPosition");
	    String altContactPerPhone = ParamUtil.getString(resourceRequest, "altContactPerPhone");
	    String altContactPerEmail = ParamUtil.getString(resourceRequest, "altContactPerEmail");
	    String comOperationYear = ParamUtil.getString(resourceRequest, "comOperationYear");
	    String products = ParamUtil.getString(resourceRequest, "products");
	    String marketSharePer = ParamUtil.getString(resourceRequest, "marketSharePer");
	    String tradeRemedyMeasure = ParamUtil.getString(resourceRequest, "tradeRemedyMeasure");
	    String fiveYearsInvestment = ParamUtil.getString(resourceRequest, "fiveYearsInvestment");
	    String planCapacity = ParamUtil.getString(resourceRequest, "planCapacity");
	    String growthProjection = ParamUtil.getString(resourceRequest, "growthProjection");
	    long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
	    JADSCInformationRequest informationRequest=null;
	    try {
	    	informationRequest=JADSCInformationRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    if(informationRequest==null) {
	    	informationRequest=JADSCInformationRequestLocalServiceUtil.createJADSCInformationRequest(CounterLocalServiceUtil.increment());
	    }
	    informationRequest.setCompanyName(companyName);
	    informationRequest.setAddress(address);
	    informationRequest.setMainTelephone(mainTelephone);
	    informationRequest.setOfficeTelephone(officeTelephone);
	    informationRequest.setCellTelephone(cellTelephone);
	    informationRequest.setOtherContact(otherContact);
	    informationRequest.setWhatsappTelephone(whatsappTelephone);
	    informationRequest.setEmailContact(emailContact);
	    informationRequest.setContactPerName(contactPerName);
	    informationRequest.setContactPerPosition(contactPerPosition);
	    informationRequest.setContactPerPhone(contactPerPhone);
	    informationRequest.setContactPerEmail(contactPerEmail);
	    informationRequest.setAltContactPerName(altContactPerName);
	    informationRequest.setAltContactPerPosition(altContactPerPosition);
	    informationRequest.setAltContactPerPhone(altContactPerPhone);
	    informationRequest.setAltContactPerEmail(altContactPerEmail);
	    informationRequest.setComOperationYear(comOperationYear);
	    informationRequest.setProducts(products);
	    informationRequest.setMarketSharePer(marketSharePer);
	    informationRequest.setTradeRemedyMeasure(tradeRemedyMeasure);
	    informationRequest.setFiveYearsInvestment(fiveYearsInvestment);
	    informationRequest.setPlanCapacity(planCapacity);
	    informationRequest.setGrowthProjection(growthProjection);
	    informationRequest.setJadscApplicationId(jadscApplicationId);
	    JADSCInformationRequestLocalServiceUtil.updateJADSCInformationRequest(informationRequest);
		

		return false;
	}

}
