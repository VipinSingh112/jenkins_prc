/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeOperatorDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeOperatorDetailCacheModel
	implements CacheModel<FireBrigadeOperatorDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeOperatorDetailCacheModel)) {
			return false;
		}

		FireBrigadeOperatorDetailCacheModel
			fireBrigadeOperatorDetailCacheModel =
				(FireBrigadeOperatorDetailCacheModel)object;

		if (fireBrigadeOperatorDetailId ==
				fireBrigadeOperatorDetailCacheModel.
					fireBrigadeOperatorDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeOperatorDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{fireBrigadeOperatorDetailId=");
		sb.append(fireBrigadeOperatorDetailId);
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
		sb.append(", operatorName=");
		sb.append(operatorName);
		sb.append(", businessName=");
		sb.append(businessName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", premisesUses=");
		sb.append(premisesUses);
		sb.append(", premisesOccupancy=");
		sb.append(premisesOccupancy);
		sb.append(", premisesBusiness=");
		sb.append(premisesBusiness);
		sb.append(", maxWorkingPersons=");
		sb.append(maxWorkingPersons);
		sb.append(", maxNumPersonsAtAnyOneTime=");
		sb.append(maxNumPersonsAtAnyOneTime);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeOperatorDetail toEntityModel() {
		FireBrigadeOperatorDetailImpl fireBrigadeOperatorDetailImpl =
			new FireBrigadeOperatorDetailImpl();

		fireBrigadeOperatorDetailImpl.setFireBrigadeOperatorDetailId(
			fireBrigadeOperatorDetailId);
		fireBrigadeOperatorDetailImpl.setGroupId(groupId);
		fireBrigadeOperatorDetailImpl.setCompanyId(companyId);
		fireBrigadeOperatorDetailImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeOperatorDetailImpl.setUserName("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeOperatorDetailImpl.setCreateDate(null);
		}
		else {
			fireBrigadeOperatorDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeOperatorDetailImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeOperatorDetailImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (operatorName == null) {
			fireBrigadeOperatorDetailImpl.setOperatorName("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setOperatorName(operatorName);
		}

		if (businessName == null) {
			fireBrigadeOperatorDetailImpl.setBusinessName("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setBusinessName(businessName);
		}

		if (address == null) {
			fireBrigadeOperatorDetailImpl.setAddress("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setAddress(address);
		}

		if (premisesUses == null) {
			fireBrigadeOperatorDetailImpl.setPremisesUses("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setPremisesUses(premisesUses);
		}

		if (premisesOccupancy == null) {
			fireBrigadeOperatorDetailImpl.setPremisesOccupancy("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setPremisesOccupancy(
				premisesOccupancy);
		}

		if (premisesBusiness == null) {
			fireBrigadeOperatorDetailImpl.setPremisesBusiness("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setPremisesBusiness(premisesBusiness);
		}

		if (maxWorkingPersons == null) {
			fireBrigadeOperatorDetailImpl.setMaxWorkingPersons("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setMaxWorkingPersons(
				maxWorkingPersons);
		}

		if (maxNumPersonsAtAnyOneTime == null) {
			fireBrigadeOperatorDetailImpl.setMaxNumPersonsAtAnyOneTime("");
		}
		else {
			fireBrigadeOperatorDetailImpl.setMaxNumPersonsAtAnyOneTime(
				maxNumPersonsAtAnyOneTime);
		}

		fireBrigadeOperatorDetailImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadeOperatorDetailImpl.resetOriginalValues();

		return fireBrigadeOperatorDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeOperatorDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		operatorName = objectInput.readUTF();
		businessName = objectInput.readUTF();
		address = objectInput.readUTF();
		premisesUses = objectInput.readUTF();
		premisesOccupancy = objectInput.readUTF();
		premisesBusiness = objectInput.readUTF();
		maxWorkingPersons = objectInput.readUTF();
		maxNumPersonsAtAnyOneTime = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeOperatorDetailId);

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

		if (operatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatorName);
		}

		if (businessName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessName);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (premisesUses == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(premisesUses);
		}

		if (premisesOccupancy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(premisesOccupancy);
		}

		if (premisesBusiness == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(premisesBusiness);
		}

		if (maxWorkingPersons == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maxWorkingPersons);
		}

		if (maxNumPersonsAtAnyOneTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maxNumPersonsAtAnyOneTime);
		}

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadeOperatorDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String operatorName;
	public String businessName;
	public String address;
	public String premisesUses;
	public String premisesOccupancy;
	public String premisesBusiness;
	public String maxWorkingPersons;
	public String maxNumPersonsAtAnyOneTime;
	public long fireBrigadeApplicationId;

}