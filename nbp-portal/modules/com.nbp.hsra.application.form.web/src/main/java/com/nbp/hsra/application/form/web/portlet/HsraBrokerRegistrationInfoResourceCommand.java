package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;
import com.nbp.hsra.application.service.service.BrokerRegistrationInfoLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/brokers/registration" }, service = MVCResourceCommand.class)
public class HsraBrokerRegistrationInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraBrokerRegistrationInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("hsra brokers registrarion form start**************");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String organizationNameD = ParamUtil.getString(resourceRequest, "organizationNameD");
		String businessPlace = ParamUtil.getString(resourceRequest, "businessPlace");
		String organizationTrn = ParamUtil.getString(resourceRequest, "organizationTrn");
		String organizationTeleNum = ParamUtil.getString(resourceRequest, "organizationTeleNum");
		String organizationFaxNum = ParamUtil.getString(resourceRequest, "organizationFaxNum");
		String organizationEmailAdd = ParamUtil.getString(resourceRequest, "organizationEmailAdd");
		String businessTypeBroker = ParamUtil.getString(resourceRequest, "businessTypeBroker");
		String businessNumberBroker = ParamUtil.getString(resourceRequest, "businessNumberBroker");
		String corporationNumberBroker = ParamUtil.getString(resourceRequest, "corporationNumberBroker");
		String publicActBroker = ParamUtil.getString(resourceRequest, "publicActBroker");
		String licenceNumberBroker = ParamUtil.getString(resourceRequest, "licenceNumberBroker");
		String expirationDateBroker = ParamUtil.getString(resourceRequest, "expirationDateBroker");
		String radioactiveMaterial = ParamUtil.getString(resourceRequest, "radioactiveMaterial");
		String nuclearMaterial = ParamUtil.getString(resourceRequest, "nuclearMaterial");
		String nuclearTechnology = ParamUtil.getString(resourceRequest, "nuclearTechnology");
		String ionizingApparatus = ParamUtil.getString(resourceRequest, "ionizingApparatus");
		String radiationSource = ParamUtil.getString(resourceRequest, "radiationSource");
		String organizationTransfer = ParamUtil.getString(resourceRequest, "organizationTransfer");
		String nuclearProtection = ParamUtil.getString(resourceRequest, "nuclearProtection");
		String storageFacility = ParamUtil.getString(resourceRequest, "storageFacility");
		String additionalInformation = ParamUtil.getString(resourceRequest, "additionalInformation");
		String applicationTypes = ParamUtil.getString(resourceRequest, "applicationTypes");

		BrokerRegistrationInfo brokerRegst = null;
		try {
			brokerRegst = BrokerRegistrationInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(brokerRegst)) {
			brokerRegst = BrokerRegistrationInfoLocalServiceUtil
					.createBrokerRegistrationInfo(CounterLocalServiceUtil.increment());
		}
		brokerRegst.setOrganizationNameD(organizationNameD);
		brokerRegst.setBusinessPlace(businessPlace);
		brokerRegst.setOrganizationTrn(organizationTrn);
		brokerRegst.setOrganizationTeleNum(organizationTeleNum);
		brokerRegst.setOrganizationFaxNum(organizationFaxNum);
		brokerRegst.setOrganizationEmailAdd(organizationEmailAdd);
		brokerRegst.setBusinessTypeBroker(businessTypeBroker);
		brokerRegst.setBusinessNumberBroker(businessNumberBroker);
		brokerRegst.setCorporationNumberBroker(corporationNumberBroker);
		brokerRegst.setPublicActBroker(publicActBroker);
		brokerRegst.setLicenceNumberBroker(licenceNumberBroker);
		try {
			if (Validator.isNotNull(expirationDateBroker)) {
				brokerRegst.setExpirationDateBroker(new SimpleDateFormat("yyyy-MM-dd").parse(expirationDateBroker));
			}
		} catch (Exception e) {
		}
		brokerRegst.setRadioactiveMaterial(radioactiveMaterial);
		brokerRegst.setNuclearMaterial(nuclearMaterial);
		brokerRegst.setNuclearTechnology(nuclearTechnology);
		brokerRegst.setIonizingApparatus(ionizingApparatus);
		brokerRegst.setRadiationSource(radiationSource);
		brokerRegst.setOrganizationTransfer(organizationTransfer);
		brokerRegst.setNuclearProtection(nuclearProtection);
		brokerRegst.setStorageFacility(storageFacility);
		brokerRegst.setAdditionalInformation(additionalInformation);
		brokerRegst.setApplicationTypes(applicationTypes);
		brokerRegst.setHsraApplicationId(hsraApplicationId);
		BrokerRegistrationInfoLocalServiceUtil.updateBrokerRegistrationInfo(brokerRegst);
		jsonOBJ.put("hsraApplicationId", brokerRegst.getHsraApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
