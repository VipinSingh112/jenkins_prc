/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantInvestAndFinanceInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantInvestAndFinanceInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantInvestAndFinanceInfoCacheModel
	implements CacheModel<SezOccupantInvestAndFinanceInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantInvestAndFinanceInfoCacheModel)) {
			return false;
		}

		SezOccupantInvestAndFinanceInfoCacheModel
			sezOccupantInvestAndFinanceInfoCacheModel =
				(SezOccupantInvestAndFinanceInfoCacheModel)object;

		if (sezOccInvestFinancId ==
				sezOccupantInvestAndFinanceInfoCacheModel.
					sezOccInvestFinancId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccInvestFinancId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{sezOccInvestFinancId=");
		sb.append(sezOccInvestFinancId);
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
		sb.append(", occInfraBuilding=");
		sb.append(occInfraBuilding);
		sb.append(", occInfraEquipment=");
		sb.append(occInfraEquipment);
		sb.append(", occInfraMachines=");
		sb.append(occInfraMachines);
		sb.append(", occInfraTotal=");
		sb.append(occInfraTotal);
		sb.append(", occInfraFinanceSource=");
		sb.append(occInfraFinanceSource);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantInvestAndFinanceInfo toEntityModel() {
		SezOccupantInvestAndFinanceInfoImpl
			sezOccupantInvestAndFinanceInfoImpl =
				new SezOccupantInvestAndFinanceInfoImpl();

		sezOccupantInvestAndFinanceInfoImpl.setSezOccInvestFinancId(
			sezOccInvestFinancId);
		sezOccupantInvestAndFinanceInfoImpl.setGroupId(groupId);
		sezOccupantInvestAndFinanceInfoImpl.setCompanyId(companyId);
		sezOccupantInvestAndFinanceInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantInvestAndFinanceInfoImpl.setUserName("");
		}
		else {
			sezOccupantInvestAndFinanceInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantInvestAndFinanceInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupantInvestAndFinanceInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantInvestAndFinanceInfoImpl.setModifiedDate(null);
		}
		else {
			sezOccupantInvestAndFinanceInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occInfraBuilding == null) {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraBuilding("");
		}
		else {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraBuilding(
				occInfraBuilding);
		}

		if (occInfraEquipment == null) {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraEquipment("");
		}
		else {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraEquipment(
				occInfraEquipment);
		}

		if (occInfraMachines == null) {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraMachines("");
		}
		else {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraMachines(
				occInfraMachines);
		}

		if (occInfraTotal == null) {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraTotal("");
		}
		else {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraTotal(occInfraTotal);
		}

		if (occInfraFinanceSource == null) {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraFinanceSource("");
		}
		else {
			sezOccupantInvestAndFinanceInfoImpl.setOccInfraFinanceSource(
				occInfraFinanceSource);
		}

		sezOccupantInvestAndFinanceInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantInvestAndFinanceInfoImpl.resetOriginalValues();

		return sezOccupantInvestAndFinanceInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccInvestFinancId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occInfraBuilding = objectInput.readUTF();
		occInfraEquipment = objectInput.readUTF();
		occInfraMachines = objectInput.readUTF();
		occInfraTotal = objectInput.readUTF();
		occInfraFinanceSource = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccInvestFinancId);

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

		if (occInfraBuilding == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occInfraBuilding);
		}

		if (occInfraEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occInfraEquipment);
		}

		if (occInfraMachines == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occInfraMachines);
		}

		if (occInfraTotal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occInfraTotal);
		}

		if (occInfraFinanceSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occInfraFinanceSource);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccInvestFinancId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occInfraBuilding;
	public String occInfraEquipment;
	public String occInfraMachines;
	public String occInfraTotal;
	public String occInfraFinanceSource;
	public long sezStatusApplicationId;

}