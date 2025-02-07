/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesProcessedFoodAct in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesProcessedFoodActCacheModel
	implements CacheModel<FactoriesProcessedFoodAct>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesProcessedFoodActCacheModel)) {
			return false;
		}

		FactoriesProcessedFoodActCacheModel
			factoriesProcessedFoodActCacheModel =
				(FactoriesProcessedFoodActCacheModel)object;

		if (factoriesProcessedFoodActId ==
				factoriesProcessedFoodActCacheModel.
					factoriesProcessedFoodActId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesProcessedFoodActId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{factoriesProcessedFoodActId=");
		sb.append(factoriesProcessedFoodActId);
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
		sb.append(", processedActEstablishmentName=");
		sb.append(processedActEstablishmentName);
		sb.append(", processedActParishAddress=");
		sb.append(processedActParishAddress);
		sb.append(", processedActAddress=");
		sb.append(processedActAddress);
		sb.append(", processedActOperatorName=");
		sb.append(processedActOperatorName);
		sb.append(", processedActOperatorAddress=");
		sb.append(processedActOperatorAddress);
		sb.append(", processedActParish=");
		sb.append(processedActParish);
		sb.append(", processedActDescription=");
		sb.append(processedActDescription);
		sb.append(", establishmentOperated=");
		sb.append(establishmentOperated);
		sb.append(", processedActLastDate=");
		sb.append(processedActLastDate);
		sb.append(", processedActManufactured=");
		sb.append(processedActManufactured);
		sb.append(", processedActDate=");
		sb.append(processedActDate);
		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesProcessedFoodAct toEntityModel() {
		FactoriesProcessedFoodActImpl factoriesProcessedFoodActImpl =
			new FactoriesProcessedFoodActImpl();

		factoriesProcessedFoodActImpl.setFactoriesProcessedFoodActId(
			factoriesProcessedFoodActId);
		factoriesProcessedFoodActImpl.setGroupId(groupId);
		factoriesProcessedFoodActImpl.setCompanyId(companyId);
		factoriesProcessedFoodActImpl.setUserId(userId);

		if (userName == null) {
			factoriesProcessedFoodActImpl.setUserName("");
		}
		else {
			factoriesProcessedFoodActImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesProcessedFoodActImpl.setCreateDate(null);
		}
		else {
			factoriesProcessedFoodActImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesProcessedFoodActImpl.setModifiedDate(null);
		}
		else {
			factoriesProcessedFoodActImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (processedActEstablishmentName == null) {
			factoriesProcessedFoodActImpl.setProcessedActEstablishmentName("");
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActEstablishmentName(
				processedActEstablishmentName);
		}

		if (processedActParishAddress == null) {
			factoriesProcessedFoodActImpl.setProcessedActParishAddress("");
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActParishAddress(
				processedActParishAddress);
		}

		if (processedActAddress == null) {
			factoriesProcessedFoodActImpl.setProcessedActAddress("");
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActAddress(
				processedActAddress);
		}

		if (processedActOperatorName == null) {
			factoriesProcessedFoodActImpl.setProcessedActOperatorName("");
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActOperatorName(
				processedActOperatorName);
		}

		if (processedActOperatorAddress == null) {
			factoriesProcessedFoodActImpl.setProcessedActOperatorAddress("");
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActOperatorAddress(
				processedActOperatorAddress);
		}

		if (processedActParish == null) {
			factoriesProcessedFoodActImpl.setProcessedActParish("");
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActParish(
				processedActParish);
		}

		if (processedActDescription == null) {
			factoriesProcessedFoodActImpl.setProcessedActDescription("");
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActDescription(
				processedActDescription);
		}

		if (establishmentOperated == null) {
			factoriesProcessedFoodActImpl.setEstablishmentOperated("");
		}
		else {
			factoriesProcessedFoodActImpl.setEstablishmentOperated(
				establishmentOperated);
		}

		if (processedActLastDate == Long.MIN_VALUE) {
			factoriesProcessedFoodActImpl.setProcessedActLastDate(null);
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActLastDate(
				new Date(processedActLastDate));
		}

		if (processedActManufactured == null) {
			factoriesProcessedFoodActImpl.setProcessedActManufactured("");
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActManufactured(
				processedActManufactured);
		}

		if (processedActDate == Long.MIN_VALUE) {
			factoriesProcessedFoodActImpl.setProcessedActDate(null);
		}
		else {
			factoriesProcessedFoodActImpl.setProcessedActDate(
				new Date(processedActDate));
		}

		factoriesProcessedFoodActImpl.setFactoriesApplicationId(
			factoriesApplicationId);

		factoriesProcessedFoodActImpl.resetOriginalValues();

		return factoriesProcessedFoodActImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		factoriesProcessedFoodActId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		processedActEstablishmentName = objectInput.readUTF();
		processedActParishAddress = objectInput.readUTF();
		processedActAddress = objectInput.readUTF();
		processedActOperatorName = objectInput.readUTF();
		processedActOperatorAddress = objectInput.readUTF();
		processedActParish = objectInput.readUTF();
		processedActDescription = objectInput.readUTF();
		establishmentOperated = objectInput.readUTF();
		processedActLastDate = objectInput.readLong();
		processedActManufactured = objectInput.readUTF();
		processedActDate = objectInput.readLong();

		factoriesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(factoriesProcessedFoodActId);

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

		if (processedActEstablishmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedActEstablishmentName);
		}

		if (processedActParishAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedActParishAddress);
		}

		if (processedActAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedActAddress);
		}

		if (processedActOperatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedActOperatorName);
		}

		if (processedActOperatorAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedActOperatorAddress);
		}

		if (processedActParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedActParish);
		}

		if (processedActDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedActDescription);
		}

		if (establishmentOperated == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(establishmentOperated);
		}

		objectOutput.writeLong(processedActLastDate);

		if (processedActManufactured == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processedActManufactured);
		}

		objectOutput.writeLong(processedActDate);

		objectOutput.writeLong(factoriesApplicationId);
	}

	public long factoriesProcessedFoodActId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String processedActEstablishmentName;
	public String processedActParishAddress;
	public String processedActAddress;
	public String processedActOperatorName;
	public String processedActOperatorAddress;
	public String processedActParish;
	public String processedActDescription;
	public String establishmentOperated;
	public long processedActLastDate;
	public String processedActManufactured;
	public long processedActDate;
	public long factoriesApplicationId;

}