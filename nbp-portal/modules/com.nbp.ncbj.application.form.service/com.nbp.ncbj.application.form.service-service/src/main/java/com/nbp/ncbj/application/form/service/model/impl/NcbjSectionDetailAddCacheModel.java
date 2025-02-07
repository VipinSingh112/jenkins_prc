/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjSectionDetailAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjSectionDetailAddCacheModel
	implements CacheModel<NcbjSectionDetailAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjSectionDetailAddCacheModel)) {
			return false;
		}

		NcbjSectionDetailAddCacheModel ncbjSectionDetailAddCacheModel =
			(NcbjSectionDetailAddCacheModel)object;

		if (ncbjSectionDetailAddId ==
				ncbjSectionDetailAddCacheModel.ncbjSectionDetailAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjSectionDetailAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{ncbjSectionDetailAddId=");
		sb.append(ncbjSectionDetailAddId);
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
		sb.append(", addDetails=");
		sb.append(addDetails);
		sb.append(", addNumHaccp=");
		sb.append(addNumHaccp);
		sb.append(", addTypeHaccp=");
		sb.append(addTypeHaccp);
		sb.append(", addHazard=");
		sb.append(addHazard);
		sb.append(", addConsentLic=");
		sb.append(addConsentLic);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjSectionDetailAdd toEntityModel() {
		NcbjSectionDetailAddImpl ncbjSectionDetailAddImpl =
			new NcbjSectionDetailAddImpl();

		ncbjSectionDetailAddImpl.setNcbjSectionDetailAddId(
			ncbjSectionDetailAddId);
		ncbjSectionDetailAddImpl.setGroupId(groupId);
		ncbjSectionDetailAddImpl.setCompanyId(companyId);
		ncbjSectionDetailAddImpl.setUserId(userId);

		if (userName == null) {
			ncbjSectionDetailAddImpl.setUserName("");
		}
		else {
			ncbjSectionDetailAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjSectionDetailAddImpl.setCreateDate(null);
		}
		else {
			ncbjSectionDetailAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjSectionDetailAddImpl.setModifiedDate(null);
		}
		else {
			ncbjSectionDetailAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (addDetails == null) {
			ncbjSectionDetailAddImpl.setAddDetails("");
		}
		else {
			ncbjSectionDetailAddImpl.setAddDetails(addDetails);
		}

		if (addNumHaccp == null) {
			ncbjSectionDetailAddImpl.setAddNumHaccp("");
		}
		else {
			ncbjSectionDetailAddImpl.setAddNumHaccp(addNumHaccp);
		}

		if (addTypeHaccp == null) {
			ncbjSectionDetailAddImpl.setAddTypeHaccp("");
		}
		else {
			ncbjSectionDetailAddImpl.setAddTypeHaccp(addTypeHaccp);
		}

		if (addHazard == null) {
			ncbjSectionDetailAddImpl.setAddHazard("");
		}
		else {
			ncbjSectionDetailAddImpl.setAddHazard(addHazard);
		}

		if (addConsentLic == null) {
			ncbjSectionDetailAddImpl.setAddConsentLic("");
		}
		else {
			ncbjSectionDetailAddImpl.setAddConsentLic(addConsentLic);
		}

		if (counter == null) {
			ncbjSectionDetailAddImpl.setCounter("");
		}
		else {
			ncbjSectionDetailAddImpl.setCounter(counter);
		}

		ncbjSectionDetailAddImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjSectionDetailAddImpl.resetOriginalValues();

		return ncbjSectionDetailAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjSectionDetailAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		addDetails = objectInput.readUTF();
		addNumHaccp = objectInput.readUTF();
		addTypeHaccp = objectInput.readUTF();
		addHazard = objectInput.readUTF();
		addConsentLic = objectInput.readUTF();
		counter = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjSectionDetailAddId);

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

		if (addDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addDetails);
		}

		if (addNumHaccp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addNumHaccp);
		}

		if (addTypeHaccp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addTypeHaccp);
		}

		if (addHazard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addHazard);
		}

		if (addConsentLic == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addConsentLic);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjSectionDetailAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String addDetails;
	public String addNumHaccp;
	public String addTypeHaccp;
	public String addHazard;
	public String addConsentLic;
	public String counter;
	public long ncbjApplicationId;

}