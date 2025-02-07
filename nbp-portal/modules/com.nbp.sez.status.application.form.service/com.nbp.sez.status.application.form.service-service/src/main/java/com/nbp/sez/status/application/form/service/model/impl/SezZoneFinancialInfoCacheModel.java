/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneFinancialInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneFinancialInfoCacheModel
	implements CacheModel<SezZoneFinancialInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneFinancialInfoCacheModel)) {
			return false;
		}

		SezZoneFinancialInfoCacheModel sezZoneFinancialInfoCacheModel =
			(SezZoneFinancialInfoCacheModel)object;

		if (sezZoneFinancialnfoId ==
				sezZoneFinancialInfoCacheModel.sezZoneFinancialnfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneFinancialnfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{sezZoneFinancialnfoId=");
		sb.append(sezZoneFinancialnfoId);
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
		sb.append(", buildingInfrastructure=");
		sb.append(buildingInfrastructure);
		sb.append(", equipmentInfrastructure=");
		sb.append(equipmentInfrastructure);
		sb.append(", machinesInfrastructure=");
		sb.append(machinesInfrastructure);
		sb.append(", totalInfrastructure=");
		sb.append(totalInfrastructure);
		sb.append(", financeSource=");
		sb.append(financeSource);
		sb.append(", otherFinanceSource=");
		sb.append(otherFinanceSource);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezZoneFinancialInfo toEntityModel() {
		SezZoneFinancialInfoImpl sezZoneFinancialInfoImpl =
			new SezZoneFinancialInfoImpl();

		sezZoneFinancialInfoImpl.setSezZoneFinancialnfoId(
			sezZoneFinancialnfoId);
		sezZoneFinancialInfoImpl.setGroupId(groupId);
		sezZoneFinancialInfoImpl.setCompanyId(companyId);
		sezZoneFinancialInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneFinancialInfoImpl.setUserName("");
		}
		else {
			sezZoneFinancialInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneFinancialInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneFinancialInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneFinancialInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneFinancialInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (buildingInfrastructure == null) {
			sezZoneFinancialInfoImpl.setBuildingInfrastructure("");
		}
		else {
			sezZoneFinancialInfoImpl.setBuildingInfrastructure(
				buildingInfrastructure);
		}

		if (equipmentInfrastructure == null) {
			sezZoneFinancialInfoImpl.setEquipmentInfrastructure("");
		}
		else {
			sezZoneFinancialInfoImpl.setEquipmentInfrastructure(
				equipmentInfrastructure);
		}

		if (machinesInfrastructure == null) {
			sezZoneFinancialInfoImpl.setMachinesInfrastructure("");
		}
		else {
			sezZoneFinancialInfoImpl.setMachinesInfrastructure(
				machinesInfrastructure);
		}

		if (totalInfrastructure == null) {
			sezZoneFinancialInfoImpl.setTotalInfrastructure("");
		}
		else {
			sezZoneFinancialInfoImpl.setTotalInfrastructure(
				totalInfrastructure);
		}

		if (financeSource == null) {
			sezZoneFinancialInfoImpl.setFinanceSource("");
		}
		else {
			sezZoneFinancialInfoImpl.setFinanceSource(financeSource);
		}

		if (otherFinanceSource == null) {
			sezZoneFinancialInfoImpl.setOtherFinanceSource("");
		}
		else {
			sezZoneFinancialInfoImpl.setOtherFinanceSource(otherFinanceSource);
		}

		sezZoneFinancialInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezZoneFinancialInfoImpl.resetOriginalValues();

		return sezZoneFinancialInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneFinancialnfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		buildingInfrastructure = objectInput.readUTF();
		equipmentInfrastructure = objectInput.readUTF();
		machinesInfrastructure = objectInput.readUTF();
		totalInfrastructure = objectInput.readUTF();
		financeSource = objectInput.readUTF();
		otherFinanceSource = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneFinancialnfoId);

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

		if (buildingInfrastructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingInfrastructure);
		}

		if (equipmentInfrastructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentInfrastructure);
		}

		if (machinesInfrastructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(machinesInfrastructure);
		}

		if (totalInfrastructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalInfrastructure);
		}

		if (financeSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(financeSource);
		}

		if (otherFinanceSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherFinanceSource);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezZoneFinancialnfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String buildingInfrastructure;
	public String equipmentInfrastructure;
	public String machinesInfrastructure;
	public String totalInfrastructure;
	public String financeSource;
	public String otherFinanceSource;
	public long sezStatusApplicationId;

}