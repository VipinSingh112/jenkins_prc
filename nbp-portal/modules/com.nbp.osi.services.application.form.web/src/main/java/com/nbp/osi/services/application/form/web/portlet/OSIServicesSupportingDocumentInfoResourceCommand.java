package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.service.OSIServiceSupportingDocIndLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		"mvc.command.name=/supporting/doc/form/info" }, service = MVCResourceCommand.class)
public class OSIServicesSupportingDocumentInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String supportingDocCheckboxes = ParamUtil.getString(resourceRequest, "supportingDocCheckboxes");
	    String nonProvisionReasonReq1 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq1");
	    String expectedDateReq1 = ParamUtil.getString(resourceRequest, "expectedDateReq1");
	    String nonProvisionReasonReq2 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq2");
	    String expectedDateReq2 = ParamUtil.getString(resourceRequest, "expectedDateReq2");
	    String nonProvisionReasonReq3 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq3");
	    String expectedDateReq3 = ParamUtil.getString(resourceRequest, "expectedDateReq3");
	    String nonProvisionReasonReq4 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq4");
	    String expectedDateReq4 = ParamUtil.getString(resourceRequest, "expectedDateReq4");
	    String nonProvisionReasonReq5 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq5");
	    String expectedDateReq5 = ParamUtil.getString(resourceRequest, "expectedDateReq5");
	    String nonProvisionReasonReq6 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq6");
	    String expectedDateReq6 = ParamUtil.getString(resourceRequest, "expectedDateReq6");
	    String nonProvisionReasonReq7 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq7");
	    String expectedDateReq7 = ParamUtil.getString(resourceRequest, "expectedDateReq7");
	    String nonProvisionReasonReq8 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq8");
	    String expectedDateReq8 = ParamUtil.getString(resourceRequest, "expectedDateReq8");
	    String nonProvisionReasonReq9 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq9");
	    String expectedDateReq9 = ParamUtil.getString(resourceRequest, "expectedDateReq9");
	    String nonProvisionReasonReq10 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq10");
	    String expectedDateReq10 = ParamUtil.getString(resourceRequest, "expectedDateReq10");
	    String nonProvisionReasonReq11 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq11");
	    String expectedDateReq11 = ParamUtil.getString(resourceRequest, "expectedDateReq11");
	    String nonProvisionReasonReq12 = ParamUtil.getString(resourceRequest, "nonProvisionReasonReq12");
	    String expectedDateReq12 = ParamUtil.getString(resourceRequest, "expectedDateReq12");
	    String natureOfApplicant = ParamUtil.getString(resourceRequest, "trusteeLicenceTypeVal");
	    long osiServiceApplicationId = ParamUtil.getLong(resourceRequest, "osiServiceApplicationId");
	    OSIServiceSupportingDocInd supportingDocInd=null;
	    try {
	    	supportingDocInd= OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServiceApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    if(supportingDocInd==null){
	    	supportingDocInd= OSIServiceSupportingDocIndLocalServiceUtil.createOSIServiceSupportingDocInd(CounterLocalServiceUtil.increment());
	    } 
	    	supportingDocInd.setSupportingDocCheckboxes(supportingDocCheckboxes);
	    supportingDocInd.setNonProvisionReasonReq1(nonProvisionReasonReq1);
	    try {
	    	supportingDocInd.setExpectedDateReq1(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq1));
			} catch (ParseException e) {
			}
	    
	    
	    supportingDocInd.setNonProvisionReasonReq1(nonProvisionReasonReq1);
	    try {
	    	supportingDocInd.setExpectedDateReq1(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq1));
			} catch (ParseException e) {
			}
	    
	    
	    supportingDocInd.setNonProvisionReasonReq2(nonProvisionReasonReq2);
	    try {
	    	supportingDocInd.setExpectedDateReq2(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq2));
			} catch (ParseException e) {
			}
	    
	    supportingDocInd.setNonProvisionReasonReq3(nonProvisionReasonReq3);
	    try {
	    	supportingDocInd.setExpectedDateReq3(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq3));
			} catch (ParseException e) {
			}
	    
	    supportingDocInd.setNonProvisionReasonReq4(nonProvisionReasonReq4);
	    try {
	    	supportingDocInd.setExpectedDateReq4(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq4));
			} catch (ParseException e) {
			}
	    
	    supportingDocInd.setNonProvisionReasonReq5(nonProvisionReasonReq5);
	    try {
	    	supportingDocInd.setExpectedDateReq5(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq5));
			} catch (ParseException e) {
			}
	    
	    supportingDocInd.setNonProvisionReasonReq6(nonProvisionReasonReq6);
	    try {
	    	supportingDocInd.setExpectedDateReq6(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq6));
			} catch (ParseException e) {
			}
	    
	    supportingDocInd.setNonProvisionReasonReq7(nonProvisionReasonReq7);
	    try {
	    	supportingDocInd.setExpectedDateReq7(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq7));
			} catch (ParseException e) {
			}
	    
	    supportingDocInd.setNonProvisionReasonReq8(nonProvisionReasonReq8);
	    try {
	    	supportingDocInd.setExpectedDateReq8(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq8));
			} catch (ParseException e) {
			}
	    supportingDocInd.setNonProvisionReasonReq9(nonProvisionReasonReq9);
	    try {
	    	supportingDocInd.setExpectedDateReq9(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq9));
	    } catch (ParseException e) {
	    }
	    supportingDocInd.setNonProvisionReasonReq10(nonProvisionReasonReq10);
	    try {
	    	supportingDocInd.setExpectedDateReq10(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq10));
	    } catch (ParseException e) {
	    }
	    supportingDocInd.setNonProvisionReasonReq11(nonProvisionReasonReq11);
	    try {
	    	supportingDocInd.setExpectedDateReq11(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq11));
	    } catch (ParseException e) {
	    }
	    supportingDocInd.setNonProvisionReasonReq12(nonProvisionReasonReq12);
	    try {
	    	supportingDocInd.setExpectedDateReq12(new SimpleDateFormat("yyyy-MM-dd").parse(expectedDateReq12));
	    } catch (ParseException e) {
	    }
	    supportingDocInd.setOsiServicesApplicationId(osiServiceApplicationId);
	    supportingDocInd.setCategory(natureOfApplicant);
	    OSIServiceSupportingDocIndLocalServiceUtil.updateOSIServiceSupportingDocInd(supportingDocInd);
		return false;
	}

}
