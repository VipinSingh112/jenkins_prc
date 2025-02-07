package com.nbp.wra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;
import com.nbp.wra.application.form.service.service.LicenceToAbstractInfoLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/set/Licence/To/Abstract/And/Water/Info" }, service = MVCResourceCommand.class)
public class WRAApplicationLicenceAndAbstractInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		String abstractApplicationNo = ParamUtil.getString(resourceRequest, "abstractApplicationNo");
		String nameOfApplicant = ParamUtil.getString(resourceRequest, "nameOfApplicant");
		String abstractMailingAddParish = ParamUtil.getString(resourceRequest, "abstractMailingAddParish");
		String abstractMailingAddress = ParamUtil.getString(resourceRequest, "abstractMailingAddress");
		String abstractEmailAddress = ParamUtil.getString(resourceRequest, "abstractEmailAddress");
		String abstractOfficePhone = ParamUtil.getString(resourceRequest, "abstractOfficePhone");
		String abstractMobilePhone = ParamUtil.getString(resourceRequest, "abstractMobilePhone");
		String abstractHomePhone = ParamUtil.getString(resourceRequest, "abstractHomePhone");
		String abstractWorkLocation = ParamUtil.getString(resourceRequest, "abstractWorkLocation");
		String abstractLocation = ParamUtil.getString(resourceRequest, "abstractLocation");
		String abstractContractorName = ParamUtil.getString(resourceRequest, "abstractContractorName");
		String abstractContractorAddress = ParamUtil.getString(resourceRequest, "abstractContractorAddress");
		String abstractWaterContractorAdd = ParamUtil.getString(resourceRequest, "abstractWaterContractorAdd");
		String abstractWaterSource = ParamUtil.getString(resourceRequest, "abstractWaterSource");
		String abstractWaterPurpose = ParamUtil.getString(resourceRequest, "abstractWaterPurpose");
		//String abstractAreaIrrigated = ParamUtil.getString(resourceRequest, "abstractAreaIrrigated");
		//String abstractSystemIrrigation = ParamUtil.getString(resourceRequest, "abstractSystemIrrigation");
		String abstractWasteWater = ParamUtil.getString(resourceRequest, "abstractWasteWater");
		String abstractBoreholeDepth = ParamUtil.getString(resourceRequest, "abstractBoreholeDepth");
		String abstractDiameterBorehole = ParamUtil.getString(resourceRequest, "abstractDiameterBorehole");
		String abstractSuppliesLine = ParamUtil.getString(resourceRequest, "abstractSuppliesLine");
		String abstractLimestone = ParamUtil.getString(resourceRequest, "abstractLimestone");
		String abstractWaterMethod = ParamUtil.getString(resourceRequest, "abstractWaterMethod");
		String abstractWaterQuantity = ParamUtil.getString(resourceRequest, "abstractWaterQuantity");
		String abstractRecordingType = ParamUtil.getString(resourceRequest, "abstractRecordingType");
		String abstractTechnicalInformation = ParamUtil.getString(resourceRequest, "abstractTechnicalInformation");
		String abstractWaterCommission = ParamUtil.getString(resourceRequest, "abstractWaterCommission");
		String abstractInformation = ParamUtil.getString(resourceRequest, "abstractInformation");
		String abstractSignDate = ParamUtil.getString(resourceRequest, "abstractSignDate");
		long wraApplicationId=ParamUtil.getLong(resourceRequest,"wraApplicationId");

		LicenceToAbstractInfo abstractInfo = null;
		try {
			abstractInfo= LicenceToAbstractInfoLocalServiceUtil.getLicenceToAbstract_By_Id(wraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (abstractInfo == null) {
			abstractInfo=LicenceToAbstractInfoLocalServiceUtil.createLicenceToAbstractInfo(CounterLocalServiceUtil.increment());
		}
		abstractInfo.setApplicationNum(abstractApplicationNo);
		abstractInfo.setNameOfApplicant(nameOfApplicant);
		abstractInfo.setParishApplicant(abstractMailingAddParish);
		abstractInfo.setMailingAddOfApplicant(abstractMailingAddress);
		abstractInfo.setEmailOfApplicant(abstractEmailAddress);
		abstractInfo.setOfficePhone(abstractOfficePhone);
		abstractInfo.setMobilePhone(abstractMobilePhone);
		abstractInfo.setHomePhone(abstractHomePhone);
		abstractInfo.setLocationOfProposedParish(abstractWorkLocation);
		abstractInfo.setLocationOfProParishWork(abstractLocation);
		abstractInfo.setNameOfContractor(abstractContractorName);
		abstractInfo.setParishContractor(abstractContractorAddress);
		abstractInfo.setAddressOfContractor(abstractWaterContractorAdd);
		abstractInfo.setSourceOfWater(abstractWaterSource);
		abstractInfo.setPurposeWaterUse(abstractWaterPurpose);
		//abstractInfo.setAreaAndCropType(abstractAreaIrrigated);
		//abstractInfo.setSystemOfIrrigation(abstractSystemIrrigation);
		abstractInfo.setMeansOfDisposal(abstractWasteWater); 
		abstractInfo.setEstimateDepthOfBorewell(abstractBoreholeDepth);
		abstractInfo.setDiameterOfBorewell(abstractDiameterBorehole);
		abstractInfo.setArtesianSupply(abstractSuppliesLine);
		abstractInfo.setGeologicalStrait(abstractLimestone);
		abstractInfo.setMethodOfAbstractingWater(abstractWaterMethod);
		abstractInfo.setMaxDailyQuant(abstractWaterQuantity);
		abstractInfo.setTypeOfAppratusProposed(abstractRecordingType);
		abstractInfo.setOtherInformation(abstractTechnicalInformation);
		abstractInfo.setRequestToSupplyWater(abstractWaterCommission);
		abstractInfo.setAuthorityInformation(abstractInformation);
		try {
			abstractInfo.setDateOfSign(new SimpleDateFormat("yyyy-MM-dd").parse(abstractSignDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		abstractInfo.setWraApplicationId(wraApplicationId);
		LicenceToAbstractInfoLocalServiceUtil.updateLicenceToAbstractInfo(abstractInfo);
		
		return false;
	}

}
