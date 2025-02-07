/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCChecklist;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCChecklist in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCChecklistCacheModel
	implements CacheModel<JADSCChecklist>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCChecklistCacheModel)) {
			return false;
		}

		JADSCChecklistCacheModel jadscChecklistCacheModel =
			(JADSCChecklistCacheModel)object;

		if (jadscChecklistId == jadscChecklistCacheModel.jadscChecklistId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscChecklistId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscChecklistId=");
		sb.append(jadscChecklistId);
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
		sb.append(", informationRegComplaint=");
		sb.append(informationRegComplaint);
		sb.append(", selectedChecklistValues=");
		sb.append(selectedChecklistValues);
		sb.append(", description=");
		sb.append(description);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCChecklist toEntityModel() {
		JADSCChecklistImpl jadscChecklistImpl = new JADSCChecklistImpl();

		if (uuid == null) {
			jadscChecklistImpl.setUuid("");
		}
		else {
			jadscChecklistImpl.setUuid(uuid);
		}

		jadscChecklistImpl.setJadscChecklistId(jadscChecklistId);
		jadscChecklistImpl.setGroupId(groupId);
		jadscChecklistImpl.setCompanyId(companyId);
		jadscChecklistImpl.setUserId(userId);

		if (userName == null) {
			jadscChecklistImpl.setUserName("");
		}
		else {
			jadscChecklistImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscChecklistImpl.setCreateDate(null);
		}
		else {
			jadscChecklistImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscChecklistImpl.setModifiedDate(null);
		}
		else {
			jadscChecklistImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (informationRegComplaint == null) {
			jadscChecklistImpl.setInformationRegComplaint("");
		}
		else {
			jadscChecklistImpl.setInformationRegComplaint(
				informationRegComplaint);
		}

		if (selectedChecklistValues == null) {
			jadscChecklistImpl.setSelectedChecklistValues("");
		}
		else {
			jadscChecklistImpl.setSelectedChecklistValues(
				selectedChecklistValues);
		}

		if (description == null) {
			jadscChecklistImpl.setDescription("");
		}
		else {
			jadscChecklistImpl.setDescription(description);
		}

		jadscChecklistImpl.setJadscApplicationId(jadscApplicationId);

		jadscChecklistImpl.resetOriginalValues();

		return jadscChecklistImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscChecklistId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		informationRegComplaint = objectInput.readUTF();
		selectedChecklistValues = objectInput.readUTF();
		description = objectInput.readUTF();

		jadscApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jadscChecklistId);

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

		if (informationRegComplaint == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(informationRegComplaint);
		}

		if (selectedChecklistValues == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedChecklistValues);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(jadscApplicationId);
	}

	public String uuid;
	public long jadscChecklistId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String informationRegComplaint;
	public String selectedChecklistValues;
	public String description;
	public long jadscApplicationId;

}