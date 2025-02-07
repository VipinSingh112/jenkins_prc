package com.nbp.wra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.wra.application.form.service.model.LicenceToWellDriller;
import com.nbp.wra.application.form.service.service.LicenceToWellDrillerLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/set/Well/Drilling/Licence/Form/Data/Info" }, service = MVCResourceCommand.class)
public class WRAApplicationToWellDrillerLicenceInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("well drilling ---------");
		String wellDrillingApplicationNo = ParamUtil.getString(resourceRequest, "wellDrillingApplicationNo");
		String wellDrillingApplicantName = ParamUtil.getString(resourceRequest, "wellDrillingApplicantName");
		String wellDrillingAddressParish = ParamUtil.getString(resourceRequest, "wellDrillingAddressParish");
		String wellDrillingApplicantAddress = ParamUtil.getString(resourceRequest, "wellDrillingApplicantAddress");
		String wellDrillingDOBDate = ParamUtil.getString(resourceRequest, "wellDrillingDOBDate");
		String wellDrillingEducational = ParamUtil.getString(resourceRequest, "wellDrillingEducational");
		String wellDrillingSpecificTraining = ParamUtil.getString(resourceRequest, "wellDrillingSpecificTraining");
		String wellDrillingSpecificExperience = ParamUtil.getString(resourceRequest, "wellDrillingSpecificExperience");
		String selfEmployed = ParamUtil.getString(resourceRequest, "selfEmployed");
		String wellDrillingName = ParamUtil.getString(resourceRequest, "wellDrillingName");
		String wellDrillingPersentEmployer = ParamUtil.getString(resourceRequest, "wellDrillingPersentEmployer");
		String wellDrillingAddress = ParamUtil.getString(resourceRequest, "wellDrillingAddress");
		String wellDrillingStateFirst = ParamUtil.getString(resourceRequest, "wellDrillingStateFirst");
		String wellDrillingFirstAddress = ParamUtil.getString(resourceRequest, "wellDrillingFirstAddress");
		String wellDrillingStateSec = ParamUtil.getString(resourceRequest, "wellDrillingStateSec");
		String wellDrillingAddressSec = ParamUtil.getString(resourceRequest, "wellDrillingAddressSec");
		String wellDrillingSignDate = ParamUtil.getString(resourceRequest, "wellDrillingSignDate");
		long wraApplicationId = ParamUtil.getLong(resourceRequest, "wraApplicationId");
		LicenceToWellDriller permitToDrillAWell = null;
		try {
			permitToDrillAWell= LicenceToWellDrillerLocalServiceUtil.getLicenceToWellDriller_By_Id(wraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (permitToDrillAWell == null) {
			permitToDrillAWell = LicenceToWellDrillerLocalServiceUtil
					.createLicenceToWellDriller(CounterLocalServiceUtil.increment());
		}
		permitToDrillAWell.setWellDrillingApplicationNo(wellDrillingApplicationNo);
		permitToDrillAWell.setPermitDrillingApplicantName(wellDrillingApplicantName);
		permitToDrillAWell.setPermitDrillingAddressParish(wellDrillingAddressParish);
		permitToDrillAWell.setPermitDrillingApplicantAddress(wellDrillingApplicantAddress);
		try {
			 permitToDrillAWell.setPermitDrillingDOBDate(new SimpleDateFormat("yyyy-MM-dd").parse(wellDrillingDOBDate));
		} catch (Exception e) {
			// TODO: handle exception
		} 
		permitToDrillAWell.setPermitDrillingEducational(wellDrillingEducational);
		permitToDrillAWell.setPermitDrillingSpecificTraining(wellDrillingSpecificTraining);
		permitToDrillAWell.setPermitDrillingSpecificExp(wellDrillingSpecificExperience);
		permitToDrillAWell.setPermitDrillingSelfEmployed(selfEmployed);
		permitToDrillAWell.setPermitDrillingName(wellDrillingName);
		permitToDrillAWell.setPermitDrillingPresentEmployer(wellDrillingPersentEmployer);
		permitToDrillAWell.setPermitDrillingEmployerAddress(wellDrillingAddress);
		permitToDrillAWell.setPermitDrillingFirstRefName(wellDrillingStateFirst);
		permitToDrillAWell.setPermitDrillingFirstRefAdd(wellDrillingFirstAddress);
		permitToDrillAWell.setPermitDrillingSecondRefName(wellDrillingStateSec);
		permitToDrillAWell.setPermitDrillingSecondRefAdd(wellDrillingAddressSec);
		 try {
			 permitToDrillAWell.setPermitDrillingSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(wellDrillingSignDate));
		} catch (Exception e) {
			// TODO: handle exception
		} 
		permitToDrillAWell.setWraApplicationId(wraApplicationId);
		LicenceToWellDrillerLocalServiceUtil.updateLicenceToWellDriller(permitToDrillAWell);
		System.out.println("well drilling ---------completed");
		return false;
	}

}
