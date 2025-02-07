/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadePremisesInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadePremisesInfoCacheModel
	implements CacheModel<FireBrigadePremisesInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadePremisesInfoCacheModel)) {
			return false;
		}

		FireBrigadePremisesInfoCacheModel fireBrigadePremisesInfoCacheModel =
			(FireBrigadePremisesInfoCacheModel)object;

		if (fireBrigadePremisesInfoId ==
				fireBrigadePremisesInfoCacheModel.fireBrigadePremisesInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadePremisesInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{fireBrigadePremisesInfoId=");
		sb.append(fireBrigadePremisesInfoId);
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
		sb.append(", premises=");
		sb.append(premises);
		sb.append(", premisesCertified=");
		sb.append(premisesCertified);
		sb.append(", expirationDate=");
		sb.append(expirationDate);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", name=");
		sb.append(name);
		sb.append(", Address=");
		sb.append(Address);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadePremisesInfo toEntityModel() {
		FireBrigadePremisesInfoImpl fireBrigadePremisesInfoImpl =
			new FireBrigadePremisesInfoImpl();

		fireBrigadePremisesInfoImpl.setFireBrigadePremisesInfoId(
			fireBrigadePremisesInfoId);
		fireBrigadePremisesInfoImpl.setGroupId(groupId);
		fireBrigadePremisesInfoImpl.setCompanyId(companyId);
		fireBrigadePremisesInfoImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadePremisesInfoImpl.setUserName("");
		}
		else {
			fireBrigadePremisesInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadePremisesInfoImpl.setCreateDate(null);
		}
		else {
			fireBrigadePremisesInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadePremisesInfoImpl.setModifiedDate(null);
		}
		else {
			fireBrigadePremisesInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (premises == null) {
			fireBrigadePremisesInfoImpl.setPremises("");
		}
		else {
			fireBrigadePremisesInfoImpl.setPremises(premises);
		}

		if (premisesCertified == null) {
			fireBrigadePremisesInfoImpl.setPremisesCertified("");
		}
		else {
			fireBrigadePremisesInfoImpl.setPremisesCertified(premisesCertified);
		}

		if (expirationDate == Long.MIN_VALUE) {
			fireBrigadePremisesInfoImpl.setExpirationDate(null);
		}
		else {
			fireBrigadePremisesInfoImpl.setExpirationDate(
				new Date(expirationDate));
		}

		if (certificateNumber == null) {
			fireBrigadePremisesInfoImpl.setCertificateNumber("");
		}
		else {
			fireBrigadePremisesInfoImpl.setCertificateNumber(certificateNumber);
		}

		if (name == null) {
			fireBrigadePremisesInfoImpl.setName("");
		}
		else {
			fireBrigadePremisesInfoImpl.setName(name);
		}

		if (Address == null) {
			fireBrigadePremisesInfoImpl.setAddress("");
		}
		else {
			fireBrigadePremisesInfoImpl.setAddress(Address);
		}

		fireBrigadePremisesInfoImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadePremisesInfoImpl.resetOriginalValues();

		return fireBrigadePremisesInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadePremisesInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		premises = objectInput.readUTF();
		premisesCertified = objectInput.readUTF();
		expirationDate = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		name = objectInput.readUTF();
		Address = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadePremisesInfoId);

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

		if (premises == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(premises);
		}

		if (premisesCertified == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(premisesCertified);
		}

		objectOutput.writeLong(expirationDate);

		if (certificateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (Address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Address);
		}

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadePremisesInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String premises;
	public String premisesCertified;
	public long expirationDate;
	public String certificateNumber;
	public String name;
	public String Address;
	public long fireBrigadeApplicationId;

}