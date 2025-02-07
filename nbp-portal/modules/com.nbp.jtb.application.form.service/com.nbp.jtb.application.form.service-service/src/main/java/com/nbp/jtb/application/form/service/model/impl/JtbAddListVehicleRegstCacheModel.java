/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbAddListVehicleRegst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbAddListVehicleRegstCacheModel
	implements CacheModel<JtbAddListVehicleRegst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbAddListVehicleRegstCacheModel)) {
			return false;
		}

		JtbAddListVehicleRegstCacheModel jtbAddListVehicleRegstCacheModel =
			(JtbAddListVehicleRegstCacheModel)object;

		if (jtbAddListVehicleRegstId ==
				jtbAddListVehicleRegstCacheModel.jtbAddListVehicleRegstId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbAddListVehicleRegstId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{jtbAddListVehicleRegstId=");
		sb.append(jtbAddListVehicleRegstId);
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
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", vehicleRegstYear=");
		sb.append(vehicleRegstYear);
		sb.append(", vehicleRegstModel=");
		sb.append(vehicleRegstModel);
		sb.append(", vehicleRegstPlate=");
		sb.append(vehicleRegstPlate);
		sb.append(", vehicleRegstExpDate=");
		sb.append(vehicleRegstExpDate);
		sb.append(", vehicleRegstFitnessDate=");
		sb.append(vehicleRegstFitnessDate);
		sb.append(", vehicleRegstChassis=");
		sb.append(vehicleRegstChassis);
		sb.append(", vehicleRegstBased=");
		sb.append(vehicleRegstBased);
		sb.append(", vehicleRegstInsuranceCom=");
		sb.append(vehicleRegstInsuranceCom);
		sb.append(", vehicleRegstPolicyNum=");
		sb.append(vehicleRegstPolicyNum);
		sb.append(", vehicleRegstExpiryDate=");
		sb.append(vehicleRegstExpiryDate);
		sb.append(", vehicleRegstPlateNum=");
		sb.append(vehicleRegstPlateNum);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbAddListVehicleRegst toEntityModel() {
		JtbAddListVehicleRegstImpl jtbAddListVehicleRegstImpl =
			new JtbAddListVehicleRegstImpl();

		jtbAddListVehicleRegstImpl.setJtbAddListVehicleRegstId(
			jtbAddListVehicleRegstId);
		jtbAddListVehicleRegstImpl.setGroupId(groupId);
		jtbAddListVehicleRegstImpl.setCompanyId(companyId);
		jtbAddListVehicleRegstImpl.setUserId(userId);

		if (userName == null) {
			jtbAddListVehicleRegstImpl.setUserName("");
		}
		else {
			jtbAddListVehicleRegstImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbAddListVehicleRegstImpl.setCreateDate(null);
		}
		else {
			jtbAddListVehicleRegstImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbAddListVehicleRegstImpl.setModifiedDate(null);
		}
		else {
			jtbAddListVehicleRegstImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (counter == null) {
			jtbAddListVehicleRegstImpl.setCounter("");
		}
		else {
			jtbAddListVehicleRegstImpl.setCounter(counter);
		}

		if (vehicleRegstYear == null) {
			jtbAddListVehicleRegstImpl.setVehicleRegstYear("");
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstYear(vehicleRegstYear);
		}

		if (vehicleRegstModel == null) {
			jtbAddListVehicleRegstImpl.setVehicleRegstModel("");
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstModel(vehicleRegstModel);
		}

		if (vehicleRegstPlate == null) {
			jtbAddListVehicleRegstImpl.setVehicleRegstPlate("");
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstPlate(vehicleRegstPlate);
		}

		if (vehicleRegstExpDate == Long.MIN_VALUE) {
			jtbAddListVehicleRegstImpl.setVehicleRegstExpDate(null);
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstExpDate(
				new Date(vehicleRegstExpDate));
		}

		if (vehicleRegstFitnessDate == Long.MIN_VALUE) {
			jtbAddListVehicleRegstImpl.setVehicleRegstFitnessDate(null);
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstFitnessDate(
				new Date(vehicleRegstFitnessDate));
		}

		if (vehicleRegstChassis == null) {
			jtbAddListVehicleRegstImpl.setVehicleRegstChassis("");
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstChassis(
				vehicleRegstChassis);
		}

		if (vehicleRegstBased == null) {
			jtbAddListVehicleRegstImpl.setVehicleRegstBased("");
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstBased(vehicleRegstBased);
		}

		if (vehicleRegstInsuranceCom == null) {
			jtbAddListVehicleRegstImpl.setVehicleRegstInsuranceCom("");
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstInsuranceCom(
				vehicleRegstInsuranceCom);
		}

		if (vehicleRegstPolicyNum == null) {
			jtbAddListVehicleRegstImpl.setVehicleRegstPolicyNum("");
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstPolicyNum(
				vehicleRegstPolicyNum);
		}

		if (vehicleRegstExpiryDate == Long.MIN_VALUE) {
			jtbAddListVehicleRegstImpl.setVehicleRegstExpiryDate(null);
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstExpiryDate(
				new Date(vehicleRegstExpiryDate));
		}

		if (vehicleRegstPlateNum == null) {
			jtbAddListVehicleRegstImpl.setVehicleRegstPlateNum("");
		}
		else {
			jtbAddListVehicleRegstImpl.setVehicleRegstPlateNum(
				vehicleRegstPlateNum);
		}

		jtbAddListVehicleRegstImpl.setJtbApplicationId(jtbApplicationId);

		jtbAddListVehicleRegstImpl.resetOriginalValues();

		return jtbAddListVehicleRegstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jtbAddListVehicleRegstId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		counter = objectInput.readUTF();
		vehicleRegstYear = objectInput.readUTF();
		vehicleRegstModel = objectInput.readUTF();
		vehicleRegstPlate = objectInput.readUTF();
		vehicleRegstExpDate = objectInput.readLong();
		vehicleRegstFitnessDate = objectInput.readLong();
		vehicleRegstChassis = objectInput.readUTF();
		vehicleRegstBased = objectInput.readUTF();
		vehicleRegstInsuranceCom = objectInput.readUTF();
		vehicleRegstPolicyNum = objectInput.readUTF();
		vehicleRegstExpiryDate = objectInput.readLong();
		vehicleRegstPlateNum = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jtbAddListVehicleRegstId);

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

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		if (vehicleRegstYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleRegstYear);
		}

		if (vehicleRegstModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleRegstModel);
		}

		if (vehicleRegstPlate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleRegstPlate);
		}

		objectOutput.writeLong(vehicleRegstExpDate);
		objectOutput.writeLong(vehicleRegstFitnessDate);

		if (vehicleRegstChassis == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleRegstChassis);
		}

		if (vehicleRegstBased == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleRegstBased);
		}

		if (vehicleRegstInsuranceCom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleRegstInsuranceCom);
		}

		if (vehicleRegstPolicyNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleRegstPolicyNum);
		}

		objectOutput.writeLong(vehicleRegstExpiryDate);

		if (vehicleRegstPlateNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicleRegstPlateNum);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long jtbAddListVehicleRegstId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String counter;
	public String vehicleRegstYear;
	public String vehicleRegstModel;
	public String vehicleRegstPlate;
	public long vehicleRegstExpDate;
	public long vehicleRegstFitnessDate;
	public String vehicleRegstChassis;
	public String vehicleRegstBased;
	public String vehicleRegstInsuranceCom;
	public String vehicleRegstPolicyNum;
	public long vehicleRegstExpiryDate;
	public String vehicleRegstPlateNum;
	public long jtbApplicationId;

}