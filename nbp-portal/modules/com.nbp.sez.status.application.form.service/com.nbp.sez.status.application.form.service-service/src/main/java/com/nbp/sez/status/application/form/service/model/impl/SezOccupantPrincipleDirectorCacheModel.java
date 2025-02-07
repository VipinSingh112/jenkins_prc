/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantPrincipleDirector in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantPrincipleDirectorCacheModel
	implements CacheModel<SezOccupantPrincipleDirector>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantPrincipleDirectorCacheModel)) {
			return false;
		}

		SezOccupantPrincipleDirectorCacheModel
			sezOccupantPrincipleDirectorCacheModel =
				(SezOccupantPrincipleDirectorCacheModel)object;

		if (sezOccPrincDirectId ==
				sezOccupantPrincipleDirectorCacheModel.sezOccPrincDirectId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccPrincDirectId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{sezOccPrincDirectId=");
		sb.append(sezOccPrincDirectId);
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
		sb.append(", occShareholderName=");
		sb.append(occShareholderName);
		sb.append(", occShareholderNation=");
		sb.append(occShareholderNation);
		sb.append(", occShareholderShares=");
		sb.append(occShareholderShares);
		sb.append(", occShareholderCounter=");
		sb.append(occShareholderCounter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantPrincipleDirector toEntityModel() {
		SezOccupantPrincipleDirectorImpl sezOccupantPrincipleDirectorImpl =
			new SezOccupantPrincipleDirectorImpl();

		sezOccupantPrincipleDirectorImpl.setSezOccPrincDirectId(
			sezOccPrincDirectId);
		sezOccupantPrincipleDirectorImpl.setGroupId(groupId);
		sezOccupantPrincipleDirectorImpl.setCompanyId(companyId);
		sezOccupantPrincipleDirectorImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantPrincipleDirectorImpl.setUserName("");
		}
		else {
			sezOccupantPrincipleDirectorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantPrincipleDirectorImpl.setCreateDate(null);
		}
		else {
			sezOccupantPrincipleDirectorImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantPrincipleDirectorImpl.setModifiedDate(null);
		}
		else {
			sezOccupantPrincipleDirectorImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occShareholderName == null) {
			sezOccupantPrincipleDirectorImpl.setOccShareholderName("");
		}
		else {
			sezOccupantPrincipleDirectorImpl.setOccShareholderName(
				occShareholderName);
		}

		if (occShareholderNation == null) {
			sezOccupantPrincipleDirectorImpl.setOccShareholderNation("");
		}
		else {
			sezOccupantPrincipleDirectorImpl.setOccShareholderNation(
				occShareholderNation);
		}

		if (occShareholderShares == null) {
			sezOccupantPrincipleDirectorImpl.setOccShareholderShares("");
		}
		else {
			sezOccupantPrincipleDirectorImpl.setOccShareholderShares(
				occShareholderShares);
		}

		if (occShareholderCounter == null) {
			sezOccupantPrincipleDirectorImpl.setOccShareholderCounter("");
		}
		else {
			sezOccupantPrincipleDirectorImpl.setOccShareholderCounter(
				occShareholderCounter);
		}

		sezOccupantPrincipleDirectorImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantPrincipleDirectorImpl.resetOriginalValues();

		return sezOccupantPrincipleDirectorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccPrincDirectId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occShareholderName = objectInput.readUTF();
		occShareholderNation = objectInput.readUTF();
		occShareholderShares = objectInput.readUTF();
		occShareholderCounter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccPrincDirectId);

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

		if (occShareholderName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occShareholderName);
		}

		if (occShareholderNation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occShareholderNation);
		}

		if (occShareholderShares == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occShareholderShares);
		}

		if (occShareholderCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occShareholderCounter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccPrincDirectId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occShareholderName;
	public String occShareholderNation;
	public String occShareholderShares;
	public String occShareholderCounter;
	public long sezStatusApplicationId;

}