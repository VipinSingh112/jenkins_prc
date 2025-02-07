/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BrokerRegistrationInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BrokerRegistrationInfoCacheModel
	implements CacheModel<BrokerRegistrationInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BrokerRegistrationInfoCacheModel)) {
			return false;
		}

		BrokerRegistrationInfoCacheModel brokerRegistrationInfoCacheModel =
			(BrokerRegistrationInfoCacheModel)object;

		if (brokerRegstInfoId ==
				brokerRegistrationInfoCacheModel.brokerRegstInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, brokerRegstInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{brokerRegstInfoId=");
		sb.append(brokerRegstInfoId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", applicationTypes=");
		sb.append(applicationTypes);
		sb.append(", organizationNameD=");
		sb.append(organizationNameD);
		sb.append(", businessPlace=");
		sb.append(businessPlace);
		sb.append(", organizationTrn=");
		sb.append(organizationTrn);
		sb.append(", organizationTeleNum=");
		sb.append(organizationTeleNum);
		sb.append(", organizationFaxNum=");
		sb.append(organizationFaxNum);
		sb.append(", organizationEmailAdd=");
		sb.append(organizationEmailAdd);
		sb.append(", businessTypeBroker=");
		sb.append(businessTypeBroker);
		sb.append(", businessNumberBroker=");
		sb.append(businessNumberBroker);
		sb.append(", corporationNumberBroker=");
		sb.append(corporationNumberBroker);
		sb.append(", publicActBroker=");
		sb.append(publicActBroker);
		sb.append(", licenceNumberBroker=");
		sb.append(licenceNumberBroker);
		sb.append(", expirationDateBroker=");
		sb.append(expirationDateBroker);
		sb.append(", radioactiveMaterial=");
		sb.append(radioactiveMaterial);
		sb.append(", nuclearMaterial=");
		sb.append(nuclearMaterial);
		sb.append(", nuclearTechnology=");
		sb.append(nuclearTechnology);
		sb.append(", ionizingApparatus=");
		sb.append(ionizingApparatus);
		sb.append(", radiationSource=");
		sb.append(radiationSource);
		sb.append(", organizationTransfer=");
		sb.append(organizationTransfer);
		sb.append(", nuclearProtection=");
		sb.append(nuclearProtection);
		sb.append(", storageFacility=");
		sb.append(storageFacility);
		sb.append(", additionalInformation=");
		sb.append(additionalInformation);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BrokerRegistrationInfo toEntityModel() {
		BrokerRegistrationInfoImpl brokerRegistrationInfoImpl =
			new BrokerRegistrationInfoImpl();

		brokerRegistrationInfoImpl.setBrokerRegstInfoId(brokerRegstInfoId);
		brokerRegistrationInfoImpl.setGroupId(groupId);
		brokerRegistrationInfoImpl.setCompanyId(companyId);
		brokerRegistrationInfoImpl.setUserId(userId);

		if (userName == null) {
			brokerRegistrationInfoImpl.setUserName("");
		}
		else {
			brokerRegistrationInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			brokerRegistrationInfoImpl.setCreateDate(null);
		}
		else {
			brokerRegistrationInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			brokerRegistrationInfoImpl.setModifiedDate(null);
		}
		else {
			brokerRegistrationInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicationTypes == null) {
			brokerRegistrationInfoImpl.setApplicationTypes("");
		}
		else {
			brokerRegistrationInfoImpl.setApplicationTypes(applicationTypes);
		}

		if (organizationNameD == null) {
			brokerRegistrationInfoImpl.setOrganizationNameD("");
		}
		else {
			brokerRegistrationInfoImpl.setOrganizationNameD(organizationNameD);
		}

		if (businessPlace == null) {
			brokerRegistrationInfoImpl.setBusinessPlace("");
		}
		else {
			brokerRegistrationInfoImpl.setBusinessPlace(businessPlace);
		}

		if (organizationTrn == null) {
			brokerRegistrationInfoImpl.setOrganizationTrn("");
		}
		else {
			brokerRegistrationInfoImpl.setOrganizationTrn(organizationTrn);
		}

		if (organizationTeleNum == null) {
			brokerRegistrationInfoImpl.setOrganizationTeleNum("");
		}
		else {
			brokerRegistrationInfoImpl.setOrganizationTeleNum(
				organizationTeleNum);
		}

		if (organizationFaxNum == null) {
			brokerRegistrationInfoImpl.setOrganizationFaxNum("");
		}
		else {
			brokerRegistrationInfoImpl.setOrganizationFaxNum(
				organizationFaxNum);
		}

		if (organizationEmailAdd == null) {
			brokerRegistrationInfoImpl.setOrganizationEmailAdd("");
		}
		else {
			brokerRegistrationInfoImpl.setOrganizationEmailAdd(
				organizationEmailAdd);
		}

		if (businessTypeBroker == null) {
			brokerRegistrationInfoImpl.setBusinessTypeBroker("");
		}
		else {
			brokerRegistrationInfoImpl.setBusinessTypeBroker(
				businessTypeBroker);
		}

		if (businessNumberBroker == null) {
			brokerRegistrationInfoImpl.setBusinessNumberBroker("");
		}
		else {
			brokerRegistrationInfoImpl.setBusinessNumberBroker(
				businessNumberBroker);
		}

		if (corporationNumberBroker == null) {
			brokerRegistrationInfoImpl.setCorporationNumberBroker("");
		}
		else {
			brokerRegistrationInfoImpl.setCorporationNumberBroker(
				corporationNumberBroker);
		}

		if (publicActBroker == null) {
			brokerRegistrationInfoImpl.setPublicActBroker("");
		}
		else {
			brokerRegistrationInfoImpl.setPublicActBroker(publicActBroker);
		}

		if (licenceNumberBroker == null) {
			brokerRegistrationInfoImpl.setLicenceNumberBroker("");
		}
		else {
			brokerRegistrationInfoImpl.setLicenceNumberBroker(
				licenceNumberBroker);
		}

		if (expirationDateBroker == Long.MIN_VALUE) {
			brokerRegistrationInfoImpl.setExpirationDateBroker(null);
		}
		else {
			brokerRegistrationInfoImpl.setExpirationDateBroker(
				new Date(expirationDateBroker));
		}

		if (radioactiveMaterial == null) {
			brokerRegistrationInfoImpl.setRadioactiveMaterial("");
		}
		else {
			brokerRegistrationInfoImpl.setRadioactiveMaterial(
				radioactiveMaterial);
		}

		if (nuclearMaterial == null) {
			brokerRegistrationInfoImpl.setNuclearMaterial("");
		}
		else {
			brokerRegistrationInfoImpl.setNuclearMaterial(nuclearMaterial);
		}

		if (nuclearTechnology == null) {
			brokerRegistrationInfoImpl.setNuclearTechnology("");
		}
		else {
			brokerRegistrationInfoImpl.setNuclearTechnology(nuclearTechnology);
		}

		if (ionizingApparatus == null) {
			brokerRegistrationInfoImpl.setIonizingApparatus("");
		}
		else {
			brokerRegistrationInfoImpl.setIonizingApparatus(ionizingApparatus);
		}

		if (radiationSource == null) {
			brokerRegistrationInfoImpl.setRadiationSource("");
		}
		else {
			brokerRegistrationInfoImpl.setRadiationSource(radiationSource);
		}

		if (organizationTransfer == null) {
			brokerRegistrationInfoImpl.setOrganizationTransfer("");
		}
		else {
			brokerRegistrationInfoImpl.setOrganizationTransfer(
				organizationTransfer);
		}

		if (nuclearProtection == null) {
			brokerRegistrationInfoImpl.setNuclearProtection("");
		}
		else {
			brokerRegistrationInfoImpl.setNuclearProtection(nuclearProtection);
		}

		if (storageFacility == null) {
			brokerRegistrationInfoImpl.setStorageFacility("");
		}
		else {
			brokerRegistrationInfoImpl.setStorageFacility(storageFacility);
		}

		if (additionalInformation == null) {
			brokerRegistrationInfoImpl.setAdditionalInformation("");
		}
		else {
			brokerRegistrationInfoImpl.setAdditionalInformation(
				additionalInformation);
		}

		brokerRegistrationInfoImpl.setHsraApplicationId(hsraApplicationId);

		brokerRegistrationInfoImpl.resetOriginalValues();

		return brokerRegistrationInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		brokerRegstInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicationTypes = objectInput.readUTF();
		organizationNameD = objectInput.readUTF();
		businessPlace = objectInput.readUTF();
		organizationTrn = objectInput.readUTF();
		organizationTeleNum = objectInput.readUTF();
		organizationFaxNum = objectInput.readUTF();
		organizationEmailAdd = objectInput.readUTF();
		businessTypeBroker = objectInput.readUTF();
		businessNumberBroker = objectInput.readUTF();
		corporationNumberBroker = objectInput.readUTF();
		publicActBroker = objectInput.readUTF();
		licenceNumberBroker = objectInput.readUTF();
		expirationDateBroker = objectInput.readLong();
		radioactiveMaterial = objectInput.readUTF();
		nuclearMaterial = objectInput.readUTF();
		nuclearTechnology = objectInput.readUTF();
		ionizingApparatus = objectInput.readUTF();
		radiationSource = objectInput.readUTF();
		organizationTransfer = objectInput.readUTF();
		nuclearProtection = objectInput.readUTF();
		storageFacility = objectInput.readUTF();
		additionalInformation = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(brokerRegstInfoId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (applicationTypes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationTypes);
		}

		if (organizationNameD == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationNameD);
		}

		if (businessPlace == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessPlace);
		}

		if (organizationTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationTrn);
		}

		if (organizationTeleNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationTeleNum);
		}

		if (organizationFaxNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationFaxNum);
		}

		if (organizationEmailAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationEmailAdd);
		}

		if (businessTypeBroker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessTypeBroker);
		}

		if (businessNumberBroker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessNumberBroker);
		}

		if (corporationNumberBroker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(corporationNumberBroker);
		}

		if (publicActBroker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(publicActBroker);
		}

		if (licenceNumberBroker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenceNumberBroker);
		}

		objectOutput.writeLong(expirationDateBroker);

		if (radioactiveMaterial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radioactiveMaterial);
		}

		if (nuclearMaterial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearMaterial);
		}

		if (nuclearTechnology == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearTechnology);
		}

		if (ionizingApparatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ionizingApparatus);
		}

		if (radiationSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationSource);
		}

		if (organizationTransfer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationTransfer);
		}

		if (nuclearProtection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearProtection);
		}

		if (storageFacility == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(storageFacility);
		}

		if (additionalInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalInformation);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long brokerRegstInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicationTypes;
	public String organizationNameD;
	public String businessPlace;
	public String organizationTrn;
	public String organizationTeleNum;
	public String organizationFaxNum;
	public String organizationEmailAdd;
	public String businessTypeBroker;
	public String businessNumberBroker;
	public String corporationNumberBroker;
	public String publicActBroker;
	public String licenceNumberBroker;
	public long expirationDateBroker;
	public String radioactiveMaterial;
	public String nuclearMaterial;
	public String nuclearTechnology;
	public String ionizingApparatus;
	public String radiationSource;
	public String organizationTransfer;
	public String nuclearProtection;
	public String storageFacility;
	public String additionalInformation;
	public long hsraApplicationId;

}