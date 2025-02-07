package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.service.AttractionGenDeclareInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
	"mvc.command.name=/attraction/general/declaration/info" }, service = MVCResourceCommand.class)

public class AttractionGeneralDeclarationInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String newAttractionsGenOwnerName=ParamUtil.getString(resourceRequest, "newAttractionsGenOwnerName");
		String newAttractionsCompanyLaw=ParamUtil.getString(resourceRequest, "newAttractionsCompanyLaw");
		String newAttractionsDate=ParamUtil.getString(resourceRequest, "newAttractionsDate");
		String newAttractionsName=ParamUtil.getString(resourceRequest, "newAttractionsName");
		String newAttractionsStartDate=ParamUtil.getString(resourceRequest, "newAttractionsStartDate");
		String newAttractionsSituatedLand=ParamUtil.getString(resourceRequest, "newAttractionsSituatedLand");
		String newAttractionsActivities=ParamUtil.getString(resourceRequest, "newAttractionsActivities");
		String attractionNewDate=ParamUtil.getString(resourceRequest, "attractionNewDate");
		long jtbApplicationId=ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		AttractionGenDeclareInfo attractiongenDec=null;
		try {
			attractiongenDec=AttractionGenDeclareInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		}catch(Exception e) {}
		if(attractiongenDec==null) {
			attractiongenDec=AttractionGenDeclareInfoLocalServiceUtil.createAttractionGenDeclareInfo(CounterLocalServiceUtil.increment());
		}
		
		attractiongenDec.setNewAttractionsGenOwnerName(newAttractionsGenOwnerName);
		attractiongenDec.setNewAttractionsCompanyLaw(newAttractionsCompanyLaw);
		try {
			attractiongenDec.setNewAttractionsDate(new SimpleDateFormat("yyyy-MM-dd").parse(newAttractionsDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		attractiongenDec.setNewAttractionsName(newAttractionsName);
		try {
			attractiongenDec.setNewAttractionsStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(newAttractionsStartDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		attractiongenDec.setNewAttractionsSituatedLand(newAttractionsSituatedLand);
		attractiongenDec.setNewAttractionsActivities(newAttractionsActivities);
		try {
			attractiongenDec.setAttractionNewDate(new SimpleDateFormat("yyyy-MM-dd").parse(attractionNewDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		attractiongenDec.setJtbApplicationId(jtbApplicationId);
		AttractionGenDeclareInfoLocalServiceUtil.updateAttractionGenDeclareInfo(attractiongenDec);
		return false;
	}

}
