/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningProspectingLicenseAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningProspectingLicenseAddCacheModel
	implements CacheModel<MiningProspectingLicenseAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningProspectingLicenseAddCacheModel)) {
			return false;
		}

		MiningProspectingLicenseAddCacheModel
			miningProspectingLicenseAddCacheModel =
				(MiningProspectingLicenseAddCacheModel)object;

		if (miningProspectingLicenseAddId ==
				miningProspectingLicenseAddCacheModel.
					miningProspectingLicenseAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningProspectingLicenseAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{miningProspectingLicenseAddId=");
		sb.append(miningProspectingLicenseAddId);
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
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", directorsOfCompany=");
		sb.append(directorsOfCompany);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningProspectingLicenseAdd toEntityModel() {
		MiningProspectingLicenseAddImpl miningProspectingLicenseAddImpl =
			new MiningProspectingLicenseAddImpl();

		miningProspectingLicenseAddImpl.setMiningProspectingLicenseAddId(
			miningProspectingLicenseAddId);
		miningProspectingLicenseAddImpl.setGroupId(groupId);
		miningProspectingLicenseAddImpl.setCompanyId(companyId);
		miningProspectingLicenseAddImpl.setUserId(userId);

		if (userName == null) {
			miningProspectingLicenseAddImpl.setUserName("");
		}
		else {
			miningProspectingLicenseAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningProspectingLicenseAddImpl.setCreateDate(null);
		}
		else {
			miningProspectingLicenseAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningProspectingLicenseAddImpl.setModifiedDate(null);
		}
		else {
			miningProspectingLicenseAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (name == null) {
			miningProspectingLicenseAddImpl.setName("");
		}
		else {
			miningProspectingLicenseAddImpl.setName(name);
		}

		if (nationality == null) {
			miningProspectingLicenseAddImpl.setNationality("");
		}
		else {
			miningProspectingLicenseAddImpl.setNationality(nationality);
		}

		if (directorsOfCompany == null) {
			miningProspectingLicenseAddImpl.setDirectorsOfCompany("");
		}
		else {
			miningProspectingLicenseAddImpl.setDirectorsOfCompany(
				directorsOfCompany);
		}

		if (counter == null) {
			miningProspectingLicenseAddImpl.setCounter("");
		}
		else {
			miningProspectingLicenseAddImpl.setCounter(counter);
		}

		miningProspectingLicenseAddImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);

		miningProspectingLicenseAddImpl.resetOriginalValues();

		return miningProspectingLicenseAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miningProspectingLicenseAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		nationality = objectInput.readUTF();
		directorsOfCompany = objectInput.readUTF();
		counter = objectInput.readUTF();

		miningLeaseApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miningProspectingLicenseAddId);

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

		if (nationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		if (directorsOfCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorsOfCompany);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(miningLeaseApplicationId);
	}

	public long miningProspectingLicenseAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String nationality;
	public String directorsOfCompany;
	public String counter;
	public long miningLeaseApplicationId;

}