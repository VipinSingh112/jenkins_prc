/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeDirectorListinAddBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeDirectorListinAddBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeDirectorListinAddBoxCacheModel
	implements CacheModel<CreativeDirectorListinAddBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeDirectorListinAddBoxCacheModel)) {
			return false;
		}

		CreativeDirectorListinAddBoxCacheModel
			creativeDirectorListinAddBoxCacheModel =
				(CreativeDirectorListinAddBoxCacheModel)object;

		if (creativeDirectorBoxId ==
				creativeDirectorListinAddBoxCacheModel.creativeDirectorBoxId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeDirectorBoxId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{creativeDirectorBoxId=");
		sb.append(creativeDirectorBoxId);
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
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", title=");
		sb.append(title);
		sb.append(", trn=");
		sb.append(trn);
		sb.append(", directorCountre=");
		sb.append(directorCountre);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeDirectorListinAddBox toEntityModel() {
		CreativeDirectorListinAddBoxImpl creativeDirectorListinAddBoxImpl =
			new CreativeDirectorListinAddBoxImpl();

		creativeDirectorListinAddBoxImpl.setCreativeDirectorBoxId(
			creativeDirectorBoxId);
		creativeDirectorListinAddBoxImpl.setGroupId(groupId);
		creativeDirectorListinAddBoxImpl.setCompanyId(companyId);
		creativeDirectorListinAddBoxImpl.setUserId(userId);

		if (userName == null) {
			creativeDirectorListinAddBoxImpl.setUserName("");
		}
		else {
			creativeDirectorListinAddBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeDirectorListinAddBoxImpl.setCreateDate(null);
		}
		else {
			creativeDirectorListinAddBoxImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeDirectorListinAddBoxImpl.setModifiedDate(null);
		}
		else {
			creativeDirectorListinAddBoxImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (fullName == null) {
			creativeDirectorListinAddBoxImpl.setFullName("");
		}
		else {
			creativeDirectorListinAddBoxImpl.setFullName(fullName);
		}

		if (title == null) {
			creativeDirectorListinAddBoxImpl.setTitle("");
		}
		else {
			creativeDirectorListinAddBoxImpl.setTitle(title);
		}

		if (trn == null) {
			creativeDirectorListinAddBoxImpl.setTrn("");
		}
		else {
			creativeDirectorListinAddBoxImpl.setTrn(trn);
		}

		if (directorCountre == null) {
			creativeDirectorListinAddBoxImpl.setDirectorCountre("");
		}
		else {
			creativeDirectorListinAddBoxImpl.setDirectorCountre(
				directorCountre);
		}

		creativeDirectorListinAddBoxImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeDirectorListinAddBoxImpl.resetOriginalValues();

		return creativeDirectorListinAddBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeDirectorBoxId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		fullName = objectInput.readUTF();
		title = objectInput.readUTF();
		trn = objectInput.readUTF();
		directorCountre = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeDirectorBoxId);

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

		if (fullName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (trn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trn);
		}

		if (directorCountre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorCountre);
		}

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeDirectorBoxId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String fullName;
	public String title;
	public String trn;
	public String directorCountre;
	public long CreativeApplicationId;

}