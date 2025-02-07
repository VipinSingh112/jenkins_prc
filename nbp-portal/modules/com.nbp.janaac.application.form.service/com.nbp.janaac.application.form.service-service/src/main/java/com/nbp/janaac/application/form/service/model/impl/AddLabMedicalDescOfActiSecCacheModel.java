/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabMedicalDescOfActiSec in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabMedicalDescOfActiSecCacheModel
	implements CacheModel<AddLabMedicalDescOfActiSec>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabMedicalDescOfActiSecCacheModel)) {
			return false;
		}

		AddLabMedicalDescOfActiSecCacheModel
			addLabMedicalDescOfActiSecCacheModel =
				(AddLabMedicalDescOfActiSecCacheModel)object;

		if (addLabMedicalDescOfActiSecId ==
				addLabMedicalDescOfActiSecCacheModel.
					addLabMedicalDescOfActiSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabMedicalDescOfActiSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{addLabMedicalDescOfActiSecId=");
		sb.append(addLabMedicalDescOfActiSecId);
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
		sb.append(", requestedPoct=");
		sb.append(requestedPoct);
		sb.append(", location=");
		sb.append(location);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabMedicalDescOfActiSec toEntityModel() {
		AddLabMedicalDescOfActiSecImpl addLabMedicalDescOfActiSecImpl =
			new AddLabMedicalDescOfActiSecImpl();

		addLabMedicalDescOfActiSecImpl.setAddLabMedicalDescOfActiSecId(
			addLabMedicalDescOfActiSecId);
		addLabMedicalDescOfActiSecImpl.setGroupId(groupId);
		addLabMedicalDescOfActiSecImpl.setCompanyId(companyId);
		addLabMedicalDescOfActiSecImpl.setUserId(userId);

		if (userName == null) {
			addLabMedicalDescOfActiSecImpl.setUserName("");
		}
		else {
			addLabMedicalDescOfActiSecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabMedicalDescOfActiSecImpl.setCreateDate(null);
		}
		else {
			addLabMedicalDescOfActiSecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabMedicalDescOfActiSecImpl.setModifiedDate(null);
		}
		else {
			addLabMedicalDescOfActiSecImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (requestedPoct == null) {
			addLabMedicalDescOfActiSecImpl.setRequestedPoct("");
		}
		else {
			addLabMedicalDescOfActiSecImpl.setRequestedPoct(requestedPoct);
		}

		if (location == null) {
			addLabMedicalDescOfActiSecImpl.setLocation("");
		}
		else {
			addLabMedicalDescOfActiSecImpl.setLocation(location);
		}

		addLabMedicalDescOfActiSecImpl.setJanaacApplicationId(
			janaacApplicationId);

		if (counter == null) {
			addLabMedicalDescOfActiSecImpl.setCounter("");
		}
		else {
			addLabMedicalDescOfActiSecImpl.setCounter(counter);
		}

		addLabMedicalDescOfActiSecImpl.resetOriginalValues();

		return addLabMedicalDescOfActiSecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabMedicalDescOfActiSecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		requestedPoct = objectInput.readUTF();
		location = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabMedicalDescOfActiSecId);

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

		if (requestedPoct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestedPoct);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabMedicalDescOfActiSecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String requestedPoct;
	public String location;
	public long janaacApplicationId;
	public String counter;

}