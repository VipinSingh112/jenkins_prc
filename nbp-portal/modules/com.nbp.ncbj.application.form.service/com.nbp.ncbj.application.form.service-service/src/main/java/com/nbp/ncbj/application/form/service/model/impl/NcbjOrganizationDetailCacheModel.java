/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjOrganizationDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjOrganizationDetailCacheModel
	implements CacheModel<NcbjOrganizationDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjOrganizationDetailCacheModel)) {
			return false;
		}

		NcbjOrganizationDetailCacheModel ncbjOrganizationDetailCacheModel =
			(NcbjOrganizationDetailCacheModel)object;

		if (ncbjOrganizationDetailId ==
				ncbjOrganizationDetailCacheModel.ncbjOrganizationDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjOrganizationDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{ncbjOrganizationDetailId=");
		sb.append(ncbjOrganizationDetailId);
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
		sb.append(", nameOfOrganization=");
		sb.append(nameOfOrganization);
		sb.append(", address=");
		sb.append(address);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", faxNumber=");
		sb.append(faxNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", headOfOrganization =");
		sb.append(headOfOrganization);
		sb.append(", position=");
		sb.append(position);
		sb.append(", contactPersonName=");
		sb.append(contactPersonName);
		sb.append(", contactPersonEmailAddress =");
		sb.append(contactPersonEmailAddress);
		sb.append(", contactPersonPosition =");
		sb.append(contactPersonPosition);
		sb.append(", managementSystem=");
		sb.append(managementSystem);
		sb.append(", determinedTheScope=");
		sb.append(determinedTheScope);
		sb.append(", pleaseStageTheScope=");
		sb.append(pleaseStageTheScope);
		sb.append(", positionSecondFo=");
		sb.append(positionSecondFo);
		sb.append(", managementSystemFo=");
		sb.append(managementSystemFo);
		sb.append(", productTypes=");
		sb.append(productTypes);
		sb.append(", productLine=");
		sb.append(productLine);
		sb.append(", haccpStudies=");
		sb.append(haccpStudies);
		sb.append(", criticalControlPoints=");
		sb.append(criticalControlPoints);
		sb.append(", operationalNumber=");
		sb.append(operationalNumber);
		sb.append(", productionSize=");
		sb.append(productionSize);
		sb.append(", warehouseSize=");
		sb.append(warehouseSize);
		sb.append(", warehouseDetailSize=");
		sb.append(warehouseDetailSize);
		sb.append(", seasonalProcess=");
		sb.append(seasonalProcess);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjOrganizationDetail toEntityModel() {
		NcbjOrganizationDetailImpl ncbjOrganizationDetailImpl =
			new NcbjOrganizationDetailImpl();

		ncbjOrganizationDetailImpl.setNcbjOrganizationDetailId(
			ncbjOrganizationDetailId);
		ncbjOrganizationDetailImpl.setGroupId(groupId);
		ncbjOrganizationDetailImpl.setCompanyId(companyId);
		ncbjOrganizationDetailImpl.setUserId(userId);

		if (userName == null) {
			ncbjOrganizationDetailImpl.setUserName("");
		}
		else {
			ncbjOrganizationDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjOrganizationDetailImpl.setCreateDate(null);
		}
		else {
			ncbjOrganizationDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjOrganizationDetailImpl.setModifiedDate(null);
		}
		else {
			ncbjOrganizationDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfOrganization == null) {
			ncbjOrganizationDetailImpl.setNameOfOrganization("");
		}
		else {
			ncbjOrganizationDetailImpl.setNameOfOrganization(
				nameOfOrganization);
		}

		if (address == null) {
			ncbjOrganizationDetailImpl.setAddress("");
		}
		else {
			ncbjOrganizationDetailImpl.setAddress(address);
		}

		if (telephoneNumber == null) {
			ncbjOrganizationDetailImpl.setTelephoneNumber("");
		}
		else {
			ncbjOrganizationDetailImpl.setTelephoneNumber(telephoneNumber);
		}

		if (faxNumber == null) {
			ncbjOrganizationDetailImpl.setFaxNumber("");
		}
		else {
			ncbjOrganizationDetailImpl.setFaxNumber(faxNumber);
		}

		if (emailAddress == null) {
			ncbjOrganizationDetailImpl.setEmailAddress("");
		}
		else {
			ncbjOrganizationDetailImpl.setEmailAddress(emailAddress);
		}

		if (headOfOrganization == null) {
			ncbjOrganizationDetailImpl.setHeadOfOrganization("");
		}
		else {
			ncbjOrganizationDetailImpl.setHeadOfOrganization(
				headOfOrganization);
		}

		if (position == null) {
			ncbjOrganizationDetailImpl.setPosition("");
		}
		else {
			ncbjOrganizationDetailImpl.setPosition(position);
		}

		if (contactPersonName == null) {
			ncbjOrganizationDetailImpl.setContactPersonName("");
		}
		else {
			ncbjOrganizationDetailImpl.setContactPersonName(contactPersonName);
		}

		if (contactPersonEmailAddress == null) {
			ncbjOrganizationDetailImpl.setContactPersonEmailAddress("");
		}
		else {
			ncbjOrganizationDetailImpl.setContactPersonEmailAddress(
				contactPersonEmailAddress);
		}

		if (contactPersonPosition == null) {
			ncbjOrganizationDetailImpl.setContactPersonPosition("");
		}
		else {
			ncbjOrganizationDetailImpl.setContactPersonPosition(
				contactPersonPosition);
		}

		if (managementSystem == null) {
			ncbjOrganizationDetailImpl.setManagementSystem("");
		}
		else {
			ncbjOrganizationDetailImpl.setManagementSystem(managementSystem);
		}

		if (determinedTheScope == null) {
			ncbjOrganizationDetailImpl.setDeterminedTheScope("");
		}
		else {
			ncbjOrganizationDetailImpl.setDeterminedTheScope(
				determinedTheScope);
		}

		if (pleaseStageTheScope == null) {
			ncbjOrganizationDetailImpl.setPleaseStageTheScope("");
		}
		else {
			ncbjOrganizationDetailImpl.setPleaseStageTheScope(
				pleaseStageTheScope);
		}

		if (positionSecondFo == null) {
			ncbjOrganizationDetailImpl.setPositionSecondFo("");
		}
		else {
			ncbjOrganizationDetailImpl.setPositionSecondFo(positionSecondFo);
		}

		if (managementSystemFo == null) {
			ncbjOrganizationDetailImpl.setManagementSystemFo("");
		}
		else {
			ncbjOrganizationDetailImpl.setManagementSystemFo(
				managementSystemFo);
		}

		if (productTypes == null) {
			ncbjOrganizationDetailImpl.setProductTypes("");
		}
		else {
			ncbjOrganizationDetailImpl.setProductTypes(productTypes);
		}

		if (productLine == null) {
			ncbjOrganizationDetailImpl.setProductLine("");
		}
		else {
			ncbjOrganizationDetailImpl.setProductLine(productLine);
		}

		if (haccpStudies == null) {
			ncbjOrganizationDetailImpl.setHaccpStudies("");
		}
		else {
			ncbjOrganizationDetailImpl.setHaccpStudies(haccpStudies);
		}

		if (criticalControlPoints == null) {
			ncbjOrganizationDetailImpl.setCriticalControlPoints("");
		}
		else {
			ncbjOrganizationDetailImpl.setCriticalControlPoints(
				criticalControlPoints);
		}

		if (operationalNumber == null) {
			ncbjOrganizationDetailImpl.setOperationalNumber("");
		}
		else {
			ncbjOrganizationDetailImpl.setOperationalNumber(operationalNumber);
		}

		if (productionSize == null) {
			ncbjOrganizationDetailImpl.setProductionSize("");
		}
		else {
			ncbjOrganizationDetailImpl.setProductionSize(productionSize);
		}

		if (warehouseSize == null) {
			ncbjOrganizationDetailImpl.setWarehouseSize("");
		}
		else {
			ncbjOrganizationDetailImpl.setWarehouseSize(warehouseSize);
		}

		if (warehouseDetailSize == null) {
			ncbjOrganizationDetailImpl.setWarehouseDetailSize("");
		}
		else {
			ncbjOrganizationDetailImpl.setWarehouseDetailSize(
				warehouseDetailSize);
		}

		if (seasonalProcess == null) {
			ncbjOrganizationDetailImpl.setSeasonalProcess("");
		}
		else {
			ncbjOrganizationDetailImpl.setSeasonalProcess(seasonalProcess);
		}

		ncbjOrganizationDetailImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjOrganizationDetailImpl.resetOriginalValues();

		return ncbjOrganizationDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjOrganizationDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfOrganization = objectInput.readUTF();
		address = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		faxNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		headOfOrganization = objectInput.readUTF();
		position = objectInput.readUTF();
		contactPersonName = objectInput.readUTF();
		contactPersonEmailAddress = objectInput.readUTF();
		contactPersonPosition = objectInput.readUTF();
		managementSystem = objectInput.readUTF();
		determinedTheScope = objectInput.readUTF();
		pleaseStageTheScope = objectInput.readUTF();
		positionSecondFo = objectInput.readUTF();
		managementSystemFo = objectInput.readUTF();
		productTypes = objectInput.readUTF();
		productLine = objectInput.readUTF();
		haccpStudies = objectInput.readUTF();
		criticalControlPoints = objectInput.readUTF();
		operationalNumber = objectInput.readUTF();
		productionSize = objectInput.readUTF();
		warehouseSize = objectInput.readUTF();
		warehouseDetailSize = objectInput.readUTF();
		seasonalProcess = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjOrganizationDetailId);

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

		if (nameOfOrganization == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfOrganization);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (faxNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(faxNumber);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (headOfOrganization == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headOfOrganization);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (contactPersonName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPersonName);
		}

		if (contactPersonEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPersonEmailAddress);
		}

		if (contactPersonPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPersonPosition);
		}

		if (managementSystem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementSystem);
		}

		if (determinedTheScope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(determinedTheScope);
		}

		if (pleaseStageTheScope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pleaseStageTheScope);
		}

		if (positionSecondFo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(positionSecondFo);
		}

		if (managementSystemFo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementSystemFo);
		}

		if (productTypes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productTypes);
		}

		if (productLine == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productLine);
		}

		if (haccpStudies == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(haccpStudies);
		}

		if (criticalControlPoints == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(criticalControlPoints);
		}

		if (operationalNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operationalNumber);
		}

		if (productionSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionSize);
		}

		if (warehouseSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warehouseSize);
		}

		if (warehouseDetailSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warehouseDetailSize);
		}

		if (seasonalProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seasonalProcess);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjOrganizationDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfOrganization;
	public String address;
	public String telephoneNumber;
	public String faxNumber;
	public String emailAddress;
	public String headOfOrganization;
	public String position;
	public String contactPersonName;
	public String contactPersonEmailAddress;
	public String contactPersonPosition;
	public String managementSystem;
	public String determinedTheScope;
	public String pleaseStageTheScope;
	public String positionSecondFo;
	public String managementSystemFo;
	public String productTypes;
	public String productLine;
	public String haccpStudies;
	public String criticalControlPoints;
	public String operationalNumber;
	public String productionSize;
	public String warehouseSize;
	public String warehouseDetailSize;
	public String seasonalProcess;
	public long ncbjApplicationId;

}