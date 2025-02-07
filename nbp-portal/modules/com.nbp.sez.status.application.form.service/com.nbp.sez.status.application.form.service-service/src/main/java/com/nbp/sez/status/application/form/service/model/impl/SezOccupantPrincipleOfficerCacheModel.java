/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleOfficer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantPrincipleOfficer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantPrincipleOfficerCacheModel
	implements CacheModel<SezOccupantPrincipleOfficer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantPrincipleOfficerCacheModel)) {
			return false;
		}

		SezOccupantPrincipleOfficerCacheModel
			sezOccupantPrincipleOfficerCacheModel =
				(SezOccupantPrincipleOfficerCacheModel)object;

		if (sezOccPrincOffId ==
				sezOccupantPrincipleOfficerCacheModel.sezOccPrincOffId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccPrincOffId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{sezOccPrincOffId=");
		sb.append(sezOccPrincOffId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", position=");
		sb.append(position);
		sb.append(", principlOfficerCounter=");
		sb.append(principlOfficerCounter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantPrincipleOfficer toEntityModel() {
		SezOccupantPrincipleOfficerImpl sezOccupantPrincipleOfficerImpl =
			new SezOccupantPrincipleOfficerImpl();

		sezOccupantPrincipleOfficerImpl.setSezOccPrincOffId(sezOccPrincOffId);
		sezOccupantPrincipleOfficerImpl.setGroupId(groupId);
		sezOccupantPrincipleOfficerImpl.setCompanyId(companyId);
		sezOccupantPrincipleOfficerImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantPrincipleOfficerImpl.setUserName("");
		}
		else {
			sezOccupantPrincipleOfficerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantPrincipleOfficerImpl.setCreateDate(null);
		}
		else {
			sezOccupantPrincipleOfficerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantPrincipleOfficerImpl.setModifiedDate(null);
		}
		else {
			sezOccupantPrincipleOfficerImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (name == null) {
			sezOccupantPrincipleOfficerImpl.setName("");
		}
		else {
			sezOccupantPrincipleOfficerImpl.setName(name);
		}

		if (position == null) {
			sezOccupantPrincipleOfficerImpl.setPosition("");
		}
		else {
			sezOccupantPrincipleOfficerImpl.setPosition(position);
		}

		if (principlOfficerCounter == null) {
			sezOccupantPrincipleOfficerImpl.setPrinciplOfficerCounter("");
		}
		else {
			sezOccupantPrincipleOfficerImpl.setPrinciplOfficerCounter(
				principlOfficerCounter);
		}

		sezOccupantPrincipleOfficerImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantPrincipleOfficerImpl.resetOriginalValues();

		return sezOccupantPrincipleOfficerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccPrincOffId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		position = objectInput.readUTF();
		principlOfficerCounter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccPrincOffId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (principlOfficerCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(principlOfficerCounter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccPrincOffId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String position;
	public String principlOfficerCounter;
	public long sezStatusApplicationId;

}