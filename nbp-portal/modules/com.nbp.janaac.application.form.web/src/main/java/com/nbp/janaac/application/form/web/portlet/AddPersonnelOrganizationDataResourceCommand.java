package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg;
import com.nbp.janaac.application.form.service.service.AddLaboratoryPartOfOrgLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=add/Key/Personnel/Details/Data" }, service = MVCResourceCommand.class)

public class AddPersonnelOrganizationDataResourceCommand implements MVCResourceCommand {
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
	
	JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
	JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
	
	String laboratoryPartOfOrgName = ParamUtil.getString(resourceRequest, "laboratoryPartOfOrgName");
	String laboratoryPartOfOrgPosition = ParamUtil.getString(resourceRequest, "laboratoryPartOfOrgPosition");
	long keyPersonnelId = ParamUtil.getLong(resourceRequest, "keyPersonnelId");
	long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
	String counterkeyPersonnelDetailsVal = ParamUtil.getString(resourceRequest, "counterkeyPersonnelDetailsVal");
	AddLaboratoryPartOfOrg laboratoryPartOfOrg=null; 
	
	try {
		laboratoryPartOfOrg = AddLaboratoryPartOfOrgLocalServiceUtil.getAddLaboratoryPartOfOrg(keyPersonnelId);
	} catch (PortalException e) {
	}
	
	if (Validator.isNull(laboratoryPartOfOrg)) {
		laboratoryPartOfOrg = AddLaboratoryPartOfOrgLocalServiceUtil.createAddLaboratoryPartOfOrg(CounterLocalServiceUtil.increment());
		laboratoryPartOfOrg.setCounter(counterkeyPersonnelDetailsVal);
	}
	
	laboratoryPartOfOrg.setLaboratoryPartOfOrgName(laboratoryPartOfOrgName);
	laboratoryPartOfOrg.setLaboratoryPartOfOrgPosition(laboratoryPartOfOrgPosition);
	laboratoryPartOfOrg.setJanaacApplicationId(janaacApplicationId);
	
	AddLaboratoryPartOfOrgLocalServiceUtil.updateAddLaboratoryPartOfOrg(laboratoryPartOfOrg);
	
	jsonOBJ.put("keyPersonnelId", laboratoryPartOfOrg.getAddLaboratoryPartOfOrgId());
	jsonOBJ.put("counter", laboratoryPartOfOrg.getCounter());
	jsonFeed.put("APP_DATA", jsonOBJ);
	resourceResponse.setContentType("application/json");
	
	try {
		resourceResponse.getWriter().write(jsonFeed.toString());
	} catch (IOException e) {
	}
	
	return false;
	
	}
}
