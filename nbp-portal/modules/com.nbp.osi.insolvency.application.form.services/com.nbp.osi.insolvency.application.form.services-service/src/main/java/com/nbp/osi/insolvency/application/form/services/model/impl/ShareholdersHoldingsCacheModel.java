/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldings;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ShareholdersHoldings in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ShareholdersHoldingsCacheModel
	implements CacheModel<ShareholdersHoldings>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ShareholdersHoldingsCacheModel)) {
			return false;
		}

		ShareholdersHoldingsCacheModel shareholdersHoldingsCacheModel =
			(ShareholdersHoldingsCacheModel)object;

		if (shareholdersHoldingsId ==
				shareholdersHoldingsCacheModel.shareholdersHoldingsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, shareholdersHoldingsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{shareholdersHoldingsId=");
		sb.append(shareholdersHoldingsId);
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
		sb.append(", shareholderName=");
		sb.append(shareholderName);
		sb.append(", shareholderDate=");
		sb.append(shareholderDate);
		sb.append(", shareholderOccupation=");
		sb.append(shareholderOccupation);
		sb.append(", shareholderShares=");
		sb.append(shareholderShares);
		sb.append(", shareholderAddress=");
		sb.append(shareholderAddress);
		sb.append(", shareholderCounter=");
		sb.append(shareholderCounter);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ShareholdersHoldings toEntityModel() {
		ShareholdersHoldingsImpl shareholdersHoldingsImpl =
			new ShareholdersHoldingsImpl();

		shareholdersHoldingsImpl.setShareholdersHoldingsId(
			shareholdersHoldingsId);
		shareholdersHoldingsImpl.setGroupId(groupId);
		shareholdersHoldingsImpl.setCompanyId(companyId);
		shareholdersHoldingsImpl.setUserId(userId);

		if (userName == null) {
			shareholdersHoldingsImpl.setUserName("");
		}
		else {
			shareholdersHoldingsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			shareholdersHoldingsImpl.setCreateDate(null);
		}
		else {
			shareholdersHoldingsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			shareholdersHoldingsImpl.setModifiedDate(null);
		}
		else {
			shareholdersHoldingsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (shareholderName == null) {
			shareholdersHoldingsImpl.setShareholderName("");
		}
		else {
			shareholdersHoldingsImpl.setShareholderName(shareholderName);
		}

		if (shareholderDate == Long.MIN_VALUE) {
			shareholdersHoldingsImpl.setShareholderDate(null);
		}
		else {
			shareholdersHoldingsImpl.setShareholderDate(
				new Date(shareholderDate));
		}

		if (shareholderOccupation == null) {
			shareholdersHoldingsImpl.setShareholderOccupation("");
		}
		else {
			shareholdersHoldingsImpl.setShareholderOccupation(
				shareholderOccupation);
		}

		if (shareholderShares == null) {
			shareholdersHoldingsImpl.setShareholderShares("");
		}
		else {
			shareholdersHoldingsImpl.setShareholderShares(shareholderShares);
		}

		if (shareholderAddress == null) {
			shareholdersHoldingsImpl.setShareholderAddress("");
		}
		else {
			shareholdersHoldingsImpl.setShareholderAddress(shareholderAddress);
		}

		if (shareholderCounter == null) {
			shareholdersHoldingsImpl.setShareholderCounter("");
		}
		else {
			shareholdersHoldingsImpl.setShareholderCounter(shareholderCounter);
		}

		shareholdersHoldingsImpl.setOsiInsolvencyId(osiInsolvencyId);

		shareholdersHoldingsImpl.resetOriginalValues();

		return shareholdersHoldingsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		shareholdersHoldingsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		shareholderName = objectInput.readUTF();
		shareholderDate = objectInput.readLong();
		shareholderOccupation = objectInput.readUTF();
		shareholderShares = objectInput.readUTF();
		shareholderAddress = objectInput.readUTF();
		shareholderCounter = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(shareholdersHoldingsId);

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

		if (shareholderName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareholderName);
		}

		objectOutput.writeLong(shareholderDate);

		if (shareholderOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareholderOccupation);
		}

		if (shareholderShares == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareholderShares);
		}

		if (shareholderAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareholderAddress);
		}

		if (shareholderCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareholderCounter);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long shareholdersHoldingsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String shareholderName;
	public long shareholderDate;
	public String shareholderOccupation;
	public String shareholderShares;
	public String shareholderAddress;
	public String shareholderCounter;
	public long osiInsolvencyId;

}