/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BrokerRegistrationInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrokerRegistrationInfo
 * @generated
 */
public class BrokerRegistrationInfoWrapper
	extends BaseModelWrapper<BrokerRegistrationInfo>
	implements BrokerRegistrationInfo, ModelWrapper<BrokerRegistrationInfo> {

	public BrokerRegistrationInfoWrapper(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		super(brokerRegistrationInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("brokerRegstInfoId", getBrokerRegstInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationTypes", getApplicationTypes());
		attributes.put("organizationNameD", getOrganizationNameD());
		attributes.put("businessPlace", getBusinessPlace());
		attributes.put("organizationTrn", getOrganizationTrn());
		attributes.put("organizationTeleNum", getOrganizationTeleNum());
		attributes.put("organizationFaxNum", getOrganizationFaxNum());
		attributes.put("organizationEmailAdd", getOrganizationEmailAdd());
		attributes.put("businessTypeBroker", getBusinessTypeBroker());
		attributes.put("businessNumberBroker", getBusinessNumberBroker());
		attributes.put("corporationNumberBroker", getCorporationNumberBroker());
		attributes.put("publicActBroker", getPublicActBroker());
		attributes.put("licenceNumberBroker", getLicenceNumberBroker());
		attributes.put("expirationDateBroker", getExpirationDateBroker());
		attributes.put("radioactiveMaterial", getRadioactiveMaterial());
		attributes.put("nuclearMaterial", getNuclearMaterial());
		attributes.put("nuclearTechnology", getNuclearTechnology());
		attributes.put("ionizingApparatus", getIonizingApparatus());
		attributes.put("radiationSource", getRadiationSource());
		attributes.put("organizationTransfer", getOrganizationTransfer());
		attributes.put("nuclearProtection", getNuclearProtection());
		attributes.put("storageFacility", getStorageFacility());
		attributes.put("additionalInformation", getAdditionalInformation());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long brokerRegstInfoId = (Long)attributes.get("brokerRegstInfoId");

		if (brokerRegstInfoId != null) {
			setBrokerRegstInfoId(brokerRegstInfoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String applicationTypes = (String)attributes.get("applicationTypes");

		if (applicationTypes != null) {
			setApplicationTypes(applicationTypes);
		}

		String organizationNameD = (String)attributes.get("organizationNameD");

		if (organizationNameD != null) {
			setOrganizationNameD(organizationNameD);
		}

		String businessPlace = (String)attributes.get("businessPlace");

		if (businessPlace != null) {
			setBusinessPlace(businessPlace);
		}

		String organizationTrn = (String)attributes.get("organizationTrn");

		if (organizationTrn != null) {
			setOrganizationTrn(organizationTrn);
		}

		String organizationTeleNum = (String)attributes.get(
			"organizationTeleNum");

		if (organizationTeleNum != null) {
			setOrganizationTeleNum(organizationTeleNum);
		}

		String organizationFaxNum = (String)attributes.get(
			"organizationFaxNum");

		if (organizationFaxNum != null) {
			setOrganizationFaxNum(organizationFaxNum);
		}

		String organizationEmailAdd = (String)attributes.get(
			"organizationEmailAdd");

		if (organizationEmailAdd != null) {
			setOrganizationEmailAdd(organizationEmailAdd);
		}

		String businessTypeBroker = (String)attributes.get(
			"businessTypeBroker");

		if (businessTypeBroker != null) {
			setBusinessTypeBroker(businessTypeBroker);
		}

		String businessNumberBroker = (String)attributes.get(
			"businessNumberBroker");

		if (businessNumberBroker != null) {
			setBusinessNumberBroker(businessNumberBroker);
		}

		String corporationNumberBroker = (String)attributes.get(
			"corporationNumberBroker");

		if (corporationNumberBroker != null) {
			setCorporationNumberBroker(corporationNumberBroker);
		}

		String publicActBroker = (String)attributes.get("publicActBroker");

		if (publicActBroker != null) {
			setPublicActBroker(publicActBroker);
		}

		String licenceNumberBroker = (String)attributes.get(
			"licenceNumberBroker");

		if (licenceNumberBroker != null) {
			setLicenceNumberBroker(licenceNumberBroker);
		}

		Date expirationDateBroker = (Date)attributes.get(
			"expirationDateBroker");

		if (expirationDateBroker != null) {
			setExpirationDateBroker(expirationDateBroker);
		}

		String radioactiveMaterial = (String)attributes.get(
			"radioactiveMaterial");

		if (radioactiveMaterial != null) {
			setRadioactiveMaterial(radioactiveMaterial);
		}

		String nuclearMaterial = (String)attributes.get("nuclearMaterial");

		if (nuclearMaterial != null) {
			setNuclearMaterial(nuclearMaterial);
		}

		String nuclearTechnology = (String)attributes.get("nuclearTechnology");

		if (nuclearTechnology != null) {
			setNuclearTechnology(nuclearTechnology);
		}

		String ionizingApparatus = (String)attributes.get("ionizingApparatus");

		if (ionizingApparatus != null) {
			setIonizingApparatus(ionizingApparatus);
		}

		String radiationSource = (String)attributes.get("radiationSource");

		if (radiationSource != null) {
			setRadiationSource(radiationSource);
		}

		String organizationTransfer = (String)attributes.get(
			"organizationTransfer");

		if (organizationTransfer != null) {
			setOrganizationTransfer(organizationTransfer);
		}

		String nuclearProtection = (String)attributes.get("nuclearProtection");

		if (nuclearProtection != null) {
			setNuclearProtection(nuclearProtection);
		}

		String storageFacility = (String)attributes.get("storageFacility");

		if (storageFacility != null) {
			setStorageFacility(storageFacility);
		}

		String additionalInformation = (String)attributes.get(
			"additionalInformation");

		if (additionalInformation != null) {
			setAdditionalInformation(additionalInformation);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public BrokerRegistrationInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the additional information of this broker registration info.
	 *
	 * @return the additional information of this broker registration info
	 */
	@Override
	public String getAdditionalInformation() {
		return model.getAdditionalInformation();
	}

	/**
	 * Returns the application types of this broker registration info.
	 *
	 * @return the application types of this broker registration info
	 */
	@Override
	public String getApplicationTypes() {
		return model.getApplicationTypes();
	}

	/**
	 * Returns the broker regst info ID of this broker registration info.
	 *
	 * @return the broker regst info ID of this broker registration info
	 */
	@Override
	public long getBrokerRegstInfoId() {
		return model.getBrokerRegstInfoId();
	}

	/**
	 * Returns the business number broker of this broker registration info.
	 *
	 * @return the business number broker of this broker registration info
	 */
	@Override
	public String getBusinessNumberBroker() {
		return model.getBusinessNumberBroker();
	}

	/**
	 * Returns the business place of this broker registration info.
	 *
	 * @return the business place of this broker registration info
	 */
	@Override
	public String getBusinessPlace() {
		return model.getBusinessPlace();
	}

	/**
	 * Returns the business type broker of this broker registration info.
	 *
	 * @return the business type broker of this broker registration info
	 */
	@Override
	public String getBusinessTypeBroker() {
		return model.getBusinessTypeBroker();
	}

	/**
	 * Returns the company ID of this broker registration info.
	 *
	 * @return the company ID of this broker registration info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the corporation number broker of this broker registration info.
	 *
	 * @return the corporation number broker of this broker registration info
	 */
	@Override
	public String getCorporationNumberBroker() {
		return model.getCorporationNumberBroker();
	}

	/**
	 * Returns the create date of this broker registration info.
	 *
	 * @return the create date of this broker registration info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the expiration date broker of this broker registration info.
	 *
	 * @return the expiration date broker of this broker registration info
	 */
	@Override
	public Date getExpirationDateBroker() {
		return model.getExpirationDateBroker();
	}

	/**
	 * Returns the group ID of this broker registration info.
	 *
	 * @return the group ID of this broker registration info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this broker registration info.
	 *
	 * @return the hsra application ID of this broker registration info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the ionizing apparatus of this broker registration info.
	 *
	 * @return the ionizing apparatus of this broker registration info
	 */
	@Override
	public String getIonizingApparatus() {
		return model.getIonizingApparatus();
	}

	/**
	 * Returns the licence number broker of this broker registration info.
	 *
	 * @return the licence number broker of this broker registration info
	 */
	@Override
	public String getLicenceNumberBroker() {
		return model.getLicenceNumberBroker();
	}

	/**
	 * Returns the modified date of this broker registration info.
	 *
	 * @return the modified date of this broker registration info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nuclear material of this broker registration info.
	 *
	 * @return the nuclear material of this broker registration info
	 */
	@Override
	public String getNuclearMaterial() {
		return model.getNuclearMaterial();
	}

	/**
	 * Returns the nuclear protection of this broker registration info.
	 *
	 * @return the nuclear protection of this broker registration info
	 */
	@Override
	public String getNuclearProtection() {
		return model.getNuclearProtection();
	}

	/**
	 * Returns the nuclear technology of this broker registration info.
	 *
	 * @return the nuclear technology of this broker registration info
	 */
	@Override
	public String getNuclearTechnology() {
		return model.getNuclearTechnology();
	}

	/**
	 * Returns the organization email add of this broker registration info.
	 *
	 * @return the organization email add of this broker registration info
	 */
	@Override
	public String getOrganizationEmailAdd() {
		return model.getOrganizationEmailAdd();
	}

	/**
	 * Returns the organization fax num of this broker registration info.
	 *
	 * @return the organization fax num of this broker registration info
	 */
	@Override
	public String getOrganizationFaxNum() {
		return model.getOrganizationFaxNum();
	}

	/**
	 * Returns the organization name d of this broker registration info.
	 *
	 * @return the organization name d of this broker registration info
	 */
	@Override
	public String getOrganizationNameD() {
		return model.getOrganizationNameD();
	}

	/**
	 * Returns the organization tele num of this broker registration info.
	 *
	 * @return the organization tele num of this broker registration info
	 */
	@Override
	public String getOrganizationTeleNum() {
		return model.getOrganizationTeleNum();
	}

	/**
	 * Returns the organization transfer of this broker registration info.
	 *
	 * @return the organization transfer of this broker registration info
	 */
	@Override
	public String getOrganizationTransfer() {
		return model.getOrganizationTransfer();
	}

	/**
	 * Returns the organization trn of this broker registration info.
	 *
	 * @return the organization trn of this broker registration info
	 */
	@Override
	public String getOrganizationTrn() {
		return model.getOrganizationTrn();
	}

	/**
	 * Returns the primary key of this broker registration info.
	 *
	 * @return the primary key of this broker registration info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the public act broker of this broker registration info.
	 *
	 * @return the public act broker of this broker registration info
	 */
	@Override
	public String getPublicActBroker() {
		return model.getPublicActBroker();
	}

	/**
	 * Returns the radiation source of this broker registration info.
	 *
	 * @return the radiation source of this broker registration info
	 */
	@Override
	public String getRadiationSource() {
		return model.getRadiationSource();
	}

	/**
	 * Returns the radioactive material of this broker registration info.
	 *
	 * @return the radioactive material of this broker registration info
	 */
	@Override
	public String getRadioactiveMaterial() {
		return model.getRadioactiveMaterial();
	}

	/**
	 * Returns the storage facility of this broker registration info.
	 *
	 * @return the storage facility of this broker registration info
	 */
	@Override
	public String getStorageFacility() {
		return model.getStorageFacility();
	}

	/**
	 * Returns the user ID of this broker registration info.
	 *
	 * @return the user ID of this broker registration info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this broker registration info.
	 *
	 * @return the user name of this broker registration info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this broker registration info.
	 *
	 * @return the user uuid of this broker registration info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the additional information of this broker registration info.
	 *
	 * @param additionalInformation the additional information of this broker registration info
	 */
	@Override
	public void setAdditionalInformation(String additionalInformation) {
		model.setAdditionalInformation(additionalInformation);
	}

	/**
	 * Sets the application types of this broker registration info.
	 *
	 * @param applicationTypes the application types of this broker registration info
	 */
	@Override
	public void setApplicationTypes(String applicationTypes) {
		model.setApplicationTypes(applicationTypes);
	}

	/**
	 * Sets the broker regst info ID of this broker registration info.
	 *
	 * @param brokerRegstInfoId the broker regst info ID of this broker registration info
	 */
	@Override
	public void setBrokerRegstInfoId(long brokerRegstInfoId) {
		model.setBrokerRegstInfoId(brokerRegstInfoId);
	}

	/**
	 * Sets the business number broker of this broker registration info.
	 *
	 * @param businessNumberBroker the business number broker of this broker registration info
	 */
	@Override
	public void setBusinessNumberBroker(String businessNumberBroker) {
		model.setBusinessNumberBroker(businessNumberBroker);
	}

	/**
	 * Sets the business place of this broker registration info.
	 *
	 * @param businessPlace the business place of this broker registration info
	 */
	@Override
	public void setBusinessPlace(String businessPlace) {
		model.setBusinessPlace(businessPlace);
	}

	/**
	 * Sets the business type broker of this broker registration info.
	 *
	 * @param businessTypeBroker the business type broker of this broker registration info
	 */
	@Override
	public void setBusinessTypeBroker(String businessTypeBroker) {
		model.setBusinessTypeBroker(businessTypeBroker);
	}

	/**
	 * Sets the company ID of this broker registration info.
	 *
	 * @param companyId the company ID of this broker registration info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the corporation number broker of this broker registration info.
	 *
	 * @param corporationNumberBroker the corporation number broker of this broker registration info
	 */
	@Override
	public void setCorporationNumberBroker(String corporationNumberBroker) {
		model.setCorporationNumberBroker(corporationNumberBroker);
	}

	/**
	 * Sets the create date of this broker registration info.
	 *
	 * @param createDate the create date of this broker registration info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the expiration date broker of this broker registration info.
	 *
	 * @param expirationDateBroker the expiration date broker of this broker registration info
	 */
	@Override
	public void setExpirationDateBroker(Date expirationDateBroker) {
		model.setExpirationDateBroker(expirationDateBroker);
	}

	/**
	 * Sets the group ID of this broker registration info.
	 *
	 * @param groupId the group ID of this broker registration info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this broker registration info.
	 *
	 * @param hsraApplicationId the hsra application ID of this broker registration info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the ionizing apparatus of this broker registration info.
	 *
	 * @param ionizingApparatus the ionizing apparatus of this broker registration info
	 */
	@Override
	public void setIonizingApparatus(String ionizingApparatus) {
		model.setIonizingApparatus(ionizingApparatus);
	}

	/**
	 * Sets the licence number broker of this broker registration info.
	 *
	 * @param licenceNumberBroker the licence number broker of this broker registration info
	 */
	@Override
	public void setLicenceNumberBroker(String licenceNumberBroker) {
		model.setLicenceNumberBroker(licenceNumberBroker);
	}

	/**
	 * Sets the modified date of this broker registration info.
	 *
	 * @param modifiedDate the modified date of this broker registration info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nuclear material of this broker registration info.
	 *
	 * @param nuclearMaterial the nuclear material of this broker registration info
	 */
	@Override
	public void setNuclearMaterial(String nuclearMaterial) {
		model.setNuclearMaterial(nuclearMaterial);
	}

	/**
	 * Sets the nuclear protection of this broker registration info.
	 *
	 * @param nuclearProtection the nuclear protection of this broker registration info
	 */
	@Override
	public void setNuclearProtection(String nuclearProtection) {
		model.setNuclearProtection(nuclearProtection);
	}

	/**
	 * Sets the nuclear technology of this broker registration info.
	 *
	 * @param nuclearTechnology the nuclear technology of this broker registration info
	 */
	@Override
	public void setNuclearTechnology(String nuclearTechnology) {
		model.setNuclearTechnology(nuclearTechnology);
	}

	/**
	 * Sets the organization email add of this broker registration info.
	 *
	 * @param organizationEmailAdd the organization email add of this broker registration info
	 */
	@Override
	public void setOrganizationEmailAdd(String organizationEmailAdd) {
		model.setOrganizationEmailAdd(organizationEmailAdd);
	}

	/**
	 * Sets the organization fax num of this broker registration info.
	 *
	 * @param organizationFaxNum the organization fax num of this broker registration info
	 */
	@Override
	public void setOrganizationFaxNum(String organizationFaxNum) {
		model.setOrganizationFaxNum(organizationFaxNum);
	}

	/**
	 * Sets the organization name d of this broker registration info.
	 *
	 * @param organizationNameD the organization name d of this broker registration info
	 */
	@Override
	public void setOrganizationNameD(String organizationNameD) {
		model.setOrganizationNameD(organizationNameD);
	}

	/**
	 * Sets the organization tele num of this broker registration info.
	 *
	 * @param organizationTeleNum the organization tele num of this broker registration info
	 */
	@Override
	public void setOrganizationTeleNum(String organizationTeleNum) {
		model.setOrganizationTeleNum(organizationTeleNum);
	}

	/**
	 * Sets the organization transfer of this broker registration info.
	 *
	 * @param organizationTransfer the organization transfer of this broker registration info
	 */
	@Override
	public void setOrganizationTransfer(String organizationTransfer) {
		model.setOrganizationTransfer(organizationTransfer);
	}

	/**
	 * Sets the organization trn of this broker registration info.
	 *
	 * @param organizationTrn the organization trn of this broker registration info
	 */
	@Override
	public void setOrganizationTrn(String organizationTrn) {
		model.setOrganizationTrn(organizationTrn);
	}

	/**
	 * Sets the primary key of this broker registration info.
	 *
	 * @param primaryKey the primary key of this broker registration info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the public act broker of this broker registration info.
	 *
	 * @param publicActBroker the public act broker of this broker registration info
	 */
	@Override
	public void setPublicActBroker(String publicActBroker) {
		model.setPublicActBroker(publicActBroker);
	}

	/**
	 * Sets the radiation source of this broker registration info.
	 *
	 * @param radiationSource the radiation source of this broker registration info
	 */
	@Override
	public void setRadiationSource(String radiationSource) {
		model.setRadiationSource(radiationSource);
	}

	/**
	 * Sets the radioactive material of this broker registration info.
	 *
	 * @param radioactiveMaterial the radioactive material of this broker registration info
	 */
	@Override
	public void setRadioactiveMaterial(String radioactiveMaterial) {
		model.setRadioactiveMaterial(radioactiveMaterial);
	}

	/**
	 * Sets the storage facility of this broker registration info.
	 *
	 * @param storageFacility the storage facility of this broker registration info
	 */
	@Override
	public void setStorageFacility(String storageFacility) {
		model.setStorageFacility(storageFacility);
	}

	/**
	 * Sets the user ID of this broker registration info.
	 *
	 * @param userId the user ID of this broker registration info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this broker registration info.
	 *
	 * @param userName the user name of this broker registration info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this broker registration info.
	 *
	 * @param userUuid the user uuid of this broker registration info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected BrokerRegistrationInfoWrapper wrap(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		return new BrokerRegistrationInfoWrapper(brokerRegistrationInfo);
	}

}