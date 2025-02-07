/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.DirectorsForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DirectorsForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DirectorsFormCacheModel
	implements CacheModel<DirectorsForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DirectorsFormCacheModel)) {
			return false;
		}

		DirectorsFormCacheModel directorsFormCacheModel =
			(DirectorsFormCacheModel)object;

		if (directorsFormId == directorsFormCacheModel.directorsFormId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, directorsFormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{directorsFormId=");
		sb.append(directorsFormId);
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
		sb.append(", directorsName=");
		sb.append(directorsName);
		sb.append(", directorsDateAppointed=");
		sb.append(directorsDateAppointed);
		sb.append(", directorsOccupation=");
		sb.append(directorsOccupation);
		sb.append(", directorsContactNum=");
		sb.append(directorsContactNum);
		sb.append(", directorsAddress=");
		sb.append(directorsAddress);
		sb.append(", directorsCounter=");
		sb.append(directorsCounter);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DirectorsForm toEntityModel() {
		DirectorsFormImpl directorsFormImpl = new DirectorsFormImpl();

		directorsFormImpl.setDirectorsFormId(directorsFormId);
		directorsFormImpl.setGroupId(groupId);
		directorsFormImpl.setCompanyId(companyId);
		directorsFormImpl.setUserId(userId);

		if (userName == null) {
			directorsFormImpl.setUserName("");
		}
		else {
			directorsFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			directorsFormImpl.setCreateDate(null);
		}
		else {
			directorsFormImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			directorsFormImpl.setModifiedDate(null);
		}
		else {
			directorsFormImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (directorsName == null) {
			directorsFormImpl.setDirectorsName("");
		}
		else {
			directorsFormImpl.setDirectorsName(directorsName);
		}

		if (directorsDateAppointed == Long.MIN_VALUE) {
			directorsFormImpl.setDirectorsDateAppointed(null);
		}
		else {
			directorsFormImpl.setDirectorsDateAppointed(
				new Date(directorsDateAppointed));
		}

		if (directorsOccupation == null) {
			directorsFormImpl.setDirectorsOccupation("");
		}
		else {
			directorsFormImpl.setDirectorsOccupation(directorsOccupation);
		}

		if (directorsContactNum == null) {
			directorsFormImpl.setDirectorsContactNum("");
		}
		else {
			directorsFormImpl.setDirectorsContactNum(directorsContactNum);
		}

		if (directorsAddress == null) {
			directorsFormImpl.setDirectorsAddress("");
		}
		else {
			directorsFormImpl.setDirectorsAddress(directorsAddress);
		}

		if (directorsCounter == null) {
			directorsFormImpl.setDirectorsCounter("");
		}
		else {
			directorsFormImpl.setDirectorsCounter(directorsCounter);
		}

		directorsFormImpl.setOsiInsolvencyId(osiInsolvencyId);

		directorsFormImpl.resetOriginalValues();

		return directorsFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		directorsFormId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		directorsName = objectInput.readUTF();
		directorsDateAppointed = objectInput.readLong();
		directorsOccupation = objectInput.readUTF();
		directorsContactNum = objectInput.readUTF();
		directorsAddress = objectInput.readUTF();
		directorsCounter = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(directorsFormId);

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

		if (directorsName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorsName);
		}

		objectOutput.writeLong(directorsDateAppointed);

		if (directorsOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorsOccupation);
		}

		if (directorsContactNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorsContactNum);
		}

		if (directorsAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorsAddress);
		}

		if (directorsCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(directorsCounter);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long directorsFormId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String directorsName;
	public long directorsDateAppointed;
	public String directorsOccupation;
	public String directorsContactNum;
	public String directorsAddress;
	public String directorsCounter;
	public long osiInsolvencyId;

}