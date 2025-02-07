/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuEquipment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuEquipment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuEquipmentCacheModel
	implements CacheModel<ManuEquipment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuEquipmentCacheModel)) {
			return false;
		}

		ManuEquipmentCacheModel manuEquipmentCacheModel =
			(ManuEquipmentCacheModel)object;

		if (manuEquipmentId == manuEquipmentCacheModel.manuEquipmentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuEquipmentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{manuEquipmentId=");
		sb.append(manuEquipmentId);
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
		sb.append(", equipmentImported=");
		sb.append(equipmentImported);
		sb.append(", land=");
		sb.append(land);
		sb.append(", equipment=");
		sb.append(equipment);
		sb.append(", building=");
		sb.append(building);
		sb.append(", Other=");
		sb.append(Other);
		sb.append(", equipmentName=");
		sb.append(equipmentName);
		sb.append(", jamaicanDollor=");
		sb.append(jamaicanDollor);
		sb.append(", capitalExpenditure=");
		sb.append(capitalExpenditure);
		sb.append(", nameOFPurpose=");
		sb.append(nameOFPurpose);
		sb.append(", equipmentMaintained=");
		sb.append(equipmentMaintained);
		sb.append(", equipmentCreated=");
		sb.append(equipmentCreated);
		sb.append(", skilledEmp=");
		sb.append(skilledEmp);
		sb.append(", clericalEmp=");
		sb.append(clericalEmp);
		sb.append(", otherEmp=");
		sb.append(otherEmp);
		sb.append(", totalEmp=");
		sb.append(totalEmp);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuEquipment toEntityModel() {
		ManuEquipmentImpl manuEquipmentImpl = new ManuEquipmentImpl();

		manuEquipmentImpl.setManuEquipmentId(manuEquipmentId);
		manuEquipmentImpl.setGroupId(groupId);
		manuEquipmentImpl.setCompanyId(companyId);
		manuEquipmentImpl.setUserId(userId);

		if (userName == null) {
			manuEquipmentImpl.setUserName("");
		}
		else {
			manuEquipmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuEquipmentImpl.setCreateDate(null);
		}
		else {
			manuEquipmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuEquipmentImpl.setModifiedDate(null);
		}
		else {
			manuEquipmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (equipmentImported == null) {
			manuEquipmentImpl.setEquipmentImported("");
		}
		else {
			manuEquipmentImpl.setEquipmentImported(equipmentImported);
		}

		if (land == null) {
			manuEquipmentImpl.setLand("");
		}
		else {
			manuEquipmentImpl.setLand(land);
		}

		if (equipment == null) {
			manuEquipmentImpl.setEquipment("");
		}
		else {
			manuEquipmentImpl.setEquipment(equipment);
		}

		if (building == null) {
			manuEquipmentImpl.setBuilding("");
		}
		else {
			manuEquipmentImpl.setBuilding(building);
		}

		if (Other == null) {
			manuEquipmentImpl.setOther("");
		}
		else {
			manuEquipmentImpl.setOther(Other);
		}

		if (equipmentName == null) {
			manuEquipmentImpl.setEquipmentName("");
		}
		else {
			manuEquipmentImpl.setEquipmentName(equipmentName);
		}

		if (jamaicanDollor == null) {
			manuEquipmentImpl.setJamaicanDollor("");
		}
		else {
			manuEquipmentImpl.setJamaicanDollor(jamaicanDollor);
		}

		if (capitalExpenditure == null) {
			manuEquipmentImpl.setCapitalExpenditure("");
		}
		else {
			manuEquipmentImpl.setCapitalExpenditure(capitalExpenditure);
		}

		if (nameOFPurpose == null) {
			manuEquipmentImpl.setNameOFPurpose("");
		}
		else {
			manuEquipmentImpl.setNameOFPurpose(nameOFPurpose);
		}

		if (equipmentMaintained == null) {
			manuEquipmentImpl.setEquipmentMaintained("");
		}
		else {
			manuEquipmentImpl.setEquipmentMaintained(equipmentMaintained);
		}

		if (equipmentCreated == null) {
			manuEquipmentImpl.setEquipmentCreated("");
		}
		else {
			manuEquipmentImpl.setEquipmentCreated(equipmentCreated);
		}

		if (skilledEmp == null) {
			manuEquipmentImpl.setSkilledEmp("");
		}
		else {
			manuEquipmentImpl.setSkilledEmp(skilledEmp);
		}

		if (clericalEmp == null) {
			manuEquipmentImpl.setClericalEmp("");
		}
		else {
			manuEquipmentImpl.setClericalEmp(clericalEmp);
		}

		if (otherEmp == null) {
			manuEquipmentImpl.setOtherEmp("");
		}
		else {
			manuEquipmentImpl.setOtherEmp(otherEmp);
		}

		if (totalEmp == null) {
			manuEquipmentImpl.setTotalEmp("");
		}
		else {
			manuEquipmentImpl.setTotalEmp(totalEmp);
		}

		manuEquipmentImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		manuEquipmentImpl.resetOriginalValues();

		return manuEquipmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuEquipmentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		equipmentImported = objectInput.readUTF();
		land = objectInput.readUTF();
		equipment = objectInput.readUTF();
		building = objectInput.readUTF();
		Other = objectInput.readUTF();
		equipmentName = objectInput.readUTF();
		jamaicanDollor = objectInput.readUTF();
		capitalExpenditure = objectInput.readUTF();
		nameOFPurpose = objectInput.readUTF();
		equipmentMaintained = objectInput.readUTF();
		equipmentCreated = objectInput.readUTF();
		skilledEmp = objectInput.readUTF();
		clericalEmp = objectInput.readUTF();
		otherEmp = objectInput.readUTF();
		totalEmp = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuEquipmentId);

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

		if (equipmentImported == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentImported);
		}

		if (land == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(land);
		}

		if (equipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipment);
		}

		if (building == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(building);
		}

		if (Other == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Other);
		}

		if (equipmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentName);
		}

		if (jamaicanDollor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jamaicanDollor);
		}

		if (capitalExpenditure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capitalExpenditure);
		}

		if (nameOFPurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOFPurpose);
		}

		if (equipmentMaintained == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentMaintained);
		}

		if (equipmentCreated == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentCreated);
		}

		if (skilledEmp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(skilledEmp);
		}

		if (clericalEmp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(clericalEmp);
		}

		if (otherEmp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherEmp);
		}

		if (totalEmp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalEmp);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long manuEquipmentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String equipmentImported;
	public String land;
	public String equipment;
	public String building;
	public String Other;
	public String equipmentName;
	public String jamaicanDollor;
	public String capitalExpenditure;
	public String nameOFPurpose;
	public String equipmentMaintained;
	public String equipmentCreated;
	public String skilledEmp;
	public String clericalEmp;
	public String otherEmp;
	public String totalEmp;
	public long manufacturingApplicationId;

}