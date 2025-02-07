package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.service.OSIServiceSupportingDocIndLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		"mvc.command.name=/individual/supporting/doc/form/info" }, service = MVCResourceCommand.class)
public class OSIServicesIndiSupportingDocumentInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String indSupportingDoc = ParamUtil.getString(resourceRequest, "indSupportingDoc");
	    String natureOfApplicant = ParamUtil.getString(resourceRequest, "trusteeLicenceTypeVal");
	    long osiServiceApplicationId = ParamUtil.getLong(resourceRequest, "osiServiceApplicationId");
	    OSIServiceSupportingDocInd supportingDocInd=null;
	    //OsiServicesApplication osiServicesApplication = null;
	    try {
	    	supportingDocInd= OSIServiceSupportingDocIndLocalServiceUtil.getOSIService_ById(osiServiceApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    if(supportingDocInd==null){
	    	supportingDocInd= OSIServiceSupportingDocIndLocalServiceUtil.createOSIServiceSupportingDocInd(CounterLocalServiceUtil.increment());
	    } 
	    supportingDocInd.setSupportingDocCheckboxes(indSupportingDoc);
	    supportingDocInd.setOsiServicesApplicationId(osiServiceApplicationId);
	    supportingDocInd.setCategory(natureOfApplicant);
	    OSIServiceSupportingDocIndLocalServiceUtil.updateOSIServiceSupportingDocInd(supportingDocInd);
		return false;
	}

}
