/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddCerPersonnelSecond in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddCerPersonnelSecondCacheModel
	implements CacheModel<AddCerPersonnelSecond>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddCerPersonnelSecondCacheModel)) {
			return false;
		}

		AddCerPersonnelSecondCacheModel addCerPersonnelSecondCacheModel =
			(AddCerPersonnelSecondCacheModel)object;

		if (addCerPersonnelSecondId ==
				addCerPersonnelSecondCacheModel.addCerPersonnelSecondId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addCerPersonnelSecondId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addCerPersonnelSecondId=");
		sb.append(addCerPersonnelSecondId);
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
		sb.append(", role=");
		sb.append(role);
		sb.append(", certificateStandard=");
		sb.append(certificateStandard);
		sb.append(", areaOfExpertise=");
		sb.append(areaOfExpertise);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddCerPersonnelSecond toEntityModel() {
		AddCerPersonnelSecondImpl addCerPersonnelSecondImpl =
			new AddCerPersonnelSecondImpl();

		addCerPersonnelSecondImpl.setAddCerPersonnelSecondId(
			addCerPersonnelSecondId);
		addCerPersonnelSecondImpl.setGroupId(groupId);
		addCerPersonnelSecondImpl.setCompanyId(companyId);
		addCerPersonnelSecondImpl.setUserId(userId);

		if (userName == null) {
			addCerPersonnelSecondImpl.setUserName("");
		}
		else {
			addCerPersonnelSecondImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addCerPersonnelSecondImpl.setCreateDate(null);
		}
		else {
			addCerPersonnelSecondImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addCerPersonnelSecondImpl.setModifiedDate(null);
		}
		else {
			addCerPersonnelSecondImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			addCerPersonnelSecondImpl.setName("");
		}
		else {
			addCerPersonnelSecondImpl.setName(name);
		}

		if (role == null) {
			addCerPersonnelSecondImpl.setRole("");
		}
		else {
			addCerPersonnelSecondImpl.setRole(role);
		}

		if (certificateStandard == null) {
			addCerPersonnelSecondImpl.setCertificateStandard("");
		}
		else {
			addCerPersonnelSecondImpl.setCertificateStandard(
				certificateStandard);
		}

		if (areaOfExpertise == null) {
			addCerPersonnelSecondImpl.setAreaOfExpertise("");
		}
		else {
			addCerPersonnelSecondImpl.setAreaOfExpertise(areaOfExpertise);
		}

		addCerPersonnelSecondImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addCerPersonnelSecondImpl.setCounter("");
		}
		else {
			addCerPersonnelSecondImpl.setCounter(counter);
		}

		addCerPersonnelSecondImpl.resetOriginalValues();

		return addCerPersonnelSecondImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addCerPersonnelSecondId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		role = objectInput.readUTF();
		certificateStandard = objectInput.readUTF();
		areaOfExpertise = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addCerPersonnelSecondId);

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

		if (role == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(role);
		}

		if (certificateStandard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateStandard);
		}

		if (areaOfExpertise == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areaOfExpertise);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addCerPersonnelSecondId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String role;
	public String certificateStandard;
	public String areaOfExpertise;
	public long janaacApplicationId;
	public String counter;

}