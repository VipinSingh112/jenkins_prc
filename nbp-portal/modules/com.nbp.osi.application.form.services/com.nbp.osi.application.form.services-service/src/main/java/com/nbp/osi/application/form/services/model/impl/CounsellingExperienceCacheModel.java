/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.application.form.services.model.CounsellingExperience;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CounsellingExperience in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CounsellingExperienceCacheModel
	implements CacheModel<CounsellingExperience>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CounsellingExperienceCacheModel)) {
			return false;
		}

		CounsellingExperienceCacheModel counsellingExperienceCacheModel =
			(CounsellingExperienceCacheModel)object;

		if (counsellingExperienceId ==
				counsellingExperienceCacheModel.counsellingExperienceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, counsellingExperienceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{counsellingExperienceId=");
		sb.append(counsellingExperienceId);
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
		sb.append(", company=");
		sb.append(company);
		sb.append(", position=");
		sb.append(position);
		sb.append(", counsellingType=");
		sb.append(counsellingType);
		sb.append(", serviceLength=");
		sb.append(serviceLength);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CounsellingExperience toEntityModel() {
		CounsellingExperienceImpl counsellingExperienceImpl =
			new CounsellingExperienceImpl();

		counsellingExperienceImpl.setCounsellingExperienceId(
			counsellingExperienceId);
		counsellingExperienceImpl.setGroupId(groupId);
		counsellingExperienceImpl.setCompanyId(companyId);
		counsellingExperienceImpl.setUserId(userId);

		if (userName == null) {
			counsellingExperienceImpl.setUserName("");
		}
		else {
			counsellingExperienceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			counsellingExperienceImpl.setCreateDate(null);
		}
		else {
			counsellingExperienceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			counsellingExperienceImpl.setModifiedDate(null);
		}
		else {
			counsellingExperienceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (company == null) {
			counsellingExperienceImpl.setCompany("");
		}
		else {
			counsellingExperienceImpl.setCompany(company);
		}

		if (position == null) {
			counsellingExperienceImpl.setPosition("");
		}
		else {
			counsellingExperienceImpl.setPosition(position);
		}

		if (counsellingType == null) {
			counsellingExperienceImpl.setCounsellingType("");
		}
		else {
			counsellingExperienceImpl.setCounsellingType(counsellingType);
		}

		if (serviceLength == null) {
			counsellingExperienceImpl.setServiceLength("");
		}
		else {
			counsellingExperienceImpl.setServiceLength(serviceLength);
		}

		if (counter == null) {
			counsellingExperienceImpl.setCounter("");
		}
		else {
			counsellingExperienceImpl.setCounter(counter);
		}

		counsellingExperienceImpl.setOsiApplicationId(osiApplicationId);

		counsellingExperienceImpl.resetOriginalValues();

		return counsellingExperienceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		counsellingExperienceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		company = objectInput.readUTF();
		position = objectInput.readUTF();
		counsellingType = objectInput.readUTF();
		serviceLength = objectInput.readUTF();
		counter = objectInput.readUTF();

		osiApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(counsellingExperienceId);

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

		if (company == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(company);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (counsellingType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counsellingType);
		}

		if (serviceLength == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serviceLength);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(osiApplicationId);
	}

	public long counsellingExperienceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String company;
	public String position;
	public String counsellingType;
	public String serviceLength;
	public String counter;
	public long osiApplicationId;

}