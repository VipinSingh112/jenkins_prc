package com.nbp.wra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.wra.application.form.service.model.PermitToDrillAWell;
import com.nbp.wra.application.form.service.service.PermitToDrillAWellLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/set/Permit/Drill/Form/Data/Info" }, service = MVCResourceCommand.class)
public class WRAApplicationToDrillAWellInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("Called------P D WEll ");
	    String permitDrillingApplicationNo = ParamUtil.getString(resourceRequest, "permitDrillingApplicationNo");
	    String permitDrillingApplicantName = ParamUtil.getString(resourceRequest, "permitDrillingApplicantName");
	    String permitDrillingMailingAddParish = ParamUtil.getString(resourceRequest, "permitDrillingMailingAddParish");
	    String permitDrillingMailingAddress = ParamUtil.getString(resourceRequest, "permitDrillingMailingAddress");
	    String permitDrillingEmailAddress = ParamUtil.getString(resourceRequest, "permitDrillingEmailAddress");
	    String permitDrillingOfficePhone = ParamUtil.getString(resourceRequest, "permitDrillingOfficePhone");
	    String permitDrillingMobilePhone = ParamUtil.getString(resourceRequest, "permitDrillingMobilePhone");
	    String permitDrillingHomePhone = ParamUtil.getString(resourceRequest, "permitDrillingHomePhone");
	    String permitDrillingWorkLocation = ParamUtil.getString(resourceRequest, "permitDrillingWorkLocation");
	    String permitDrillingLocation = ParamUtil.getString(resourceRequest, "permitDrillingLocation");
	    String permitDrillingNature = ParamUtil.getString(resourceRequest, "permitDrillingNature");
	    String permitDrillingContractorName = ParamUtil.getString(resourceRequest, "permitDrillingContractorName");
	    String permitDrillingContractorAddress = ParamUtil.getString(resourceRequest, "permitDrillingContractorAddress");
	    String permitDrillingContractorAdd = ParamUtil.getString(resourceRequest, "permitDrillingContractorAdd");
	    String permitDrillingPurpose = ParamUtil.getString(resourceRequest, "permitDrillingPurpose");
	    String permitDrillingBoreholeDepth = ParamUtil.getString(resourceRequest, "permitDrillingBoreholeDepth");
	    String permitDrillingDiameterBorehole = ParamUtil.getString(resourceRequest, "permitDrillingDiameterBorehole");
	    String permitDrillingMethod = ParamUtil.getString(resourceRequest, "permitDrillingMethod");
	    String permitDrillingConstMethod = ParamUtil.getString(resourceRequest, "permitDrillingConstMethod");
	    String permitDrillingSupplies = ParamUtil.getString(resourceRequest, "permitDrillingSupplies");
	    String permitDrillingTechnicalInfo = ParamUtil.getString(resourceRequest, "permitDrillingTechnicalInfo");
	    String permitDrillingCubic = ParamUtil.getString(resourceRequest, "permitDrillingCubic");
	    String permitDrillingAuthority = ParamUtil.getString(resourceRequest, "permitDrillingAuthority");
	    String permitDrillingSignDate = ParamUtil.getString(resourceRequest, "permitDrillingSignDate");
	    long wraApplicationId=ParamUtil.getLong(resourceRequest,"wraApplicationId");
	    PermitToDrillAWell permitToDrillAWell =null;
	    		try {
	    			permitToDrillAWell=PermitToDrillAWellLocalServiceUtil.getPermitToDrillAWell_By_WRAAppId(wraApplicationId);
				} catch (Exception e) {
					// TODO: handle exception
				}
	    		if(permitToDrillAWell==null) {
	    			permitToDrillAWell=PermitToDrillAWellLocalServiceUtil.createPermitToDrillAWell(CounterLocalServiceUtil.increment());
	    		}
	    permitToDrillAWell.setPermitDrillApplicationNum(permitDrillingApplicationNo);
	    permitToDrillAWell.setPermitDrillingApplicantName(permitDrillingApplicantName);
	    permitToDrillAWell.setPermitDrillingMailingAddParish(permitDrillingMailingAddParish);
	    permitToDrillAWell.setPermitDrillingMailingAddress(permitDrillingMailingAddress);
	    permitToDrillAWell.setPermitDrillingEmailAddress(permitDrillingEmailAddress);
	    permitToDrillAWell.setPermitDrillingOfficePhone(permitDrillingOfficePhone);
	    permitToDrillAWell.setPermitDrillingMobilePhone(permitDrillingMobilePhone);
	    permitToDrillAWell.setWellDrillingHomePhone(permitDrillingHomePhone);
	    permitToDrillAWell.setPermitDrillingWorkLocation(permitDrillingWorkLocation);
	    permitToDrillAWell.setPermitDrillingLocation(permitDrillingLocation);
	    permitToDrillAWell.setPermitDrillingNature(permitDrillingNature);
	    permitToDrillAWell.setPermitDrillingContractorName(permitDrillingContractorName);
	    permitToDrillAWell.setPermitDrillContractAddress(permitDrillingContractorAddress);
	    permitToDrillAWell.setPermitDrillingContractorAdd(permitDrillingContractorAdd);
	    permitToDrillAWell.setPermitDrillingPurpose(permitDrillingPurpose);
	    permitToDrillAWell.setPermitDrillingBoreholeDepth(permitDrillingBoreholeDepth);
	    permitToDrillAWell.setPermitDrillingDiameterBorehole(permitDrillingDiameterBorehole);
	    permitToDrillAWell.setPermitDrillingMethod(permitDrillingMethod);
	    permitToDrillAWell.setPermitDrillingConstMethod(permitDrillingConstMethod);
	    permitToDrillAWell.setPermitDrillingSupplies(permitDrillingSupplies);
	    permitToDrillAWell.setPermitDrillingTechnicalInfo(permitDrillingTechnicalInfo);
	    permitToDrillAWell.setPermitDrillingCubic(permitDrillingCubic);
	    permitToDrillAWell.setPermitDrillingAuthority(permitDrillingAuthority);
	    try {
	    	 permitToDrillAWell.setPermitDrillingSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(permitDrillingSignDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
	   
	    permitToDrillAWell.setWraApplicationId(wraApplicationId);
	    PermitToDrillAWellLocalServiceUtil.updatePermitToDrillAWell(permitToDrillAWell);
	    System.out.println("Called------L T ABS Completed Done");

		return false;
	}

}
