/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.QualifedExpertAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QualifedExpertAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QualifedExpertAddCacheModel
	implements CacheModel<QualifedExpertAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualifedExpertAddCacheModel)) {
			return false;
		}

		QualifedExpertAddCacheModel qualifedExpertAddCacheModel =
			(QualifedExpertAddCacheModel)object;

		if (qualifedExpertAddId ==
				qualifedExpertAddCacheModel.qualifedExpertAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, qualifedExpertAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{qualifedExpertAddId=");
		sb.append(qualifedExpertAddId);
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
		sb.append(", qualifedName=");
		sb.append(qualifedName);
		sb.append(", qualifedTitle=");
		sb.append(qualifedTitle);
		sb.append(", qualifedTelephone=");
		sb.append(qualifedTelephone);
		sb.append(", qualifedExt=");
		sb.append(qualifedExt);
		sb.append(", qualifedFax=");
		sb.append(qualifedFax);
		sb.append(", qualifedEmailAdd=");
		sb.append(qualifedEmailAdd);
		sb.append(", qualifedRegistrationNo=");
		sb.append(qualifedRegistrationNo);
		sb.append(", qualifedExpirationDate=");
		sb.append(qualifedExpirationDate);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QualifedExpertAdd toEntityModel() {
		QualifedExpertAddImpl qualifedExpertAddImpl =
			new QualifedExpertAddImpl();

		qualifedExpertAddImpl.setQualifedExpertAddId(qualifedExpertAddId);
		qualifedExpertAddImpl.setGroupId(groupId);
		qualifedExpertAddImpl.setCompanyId(companyId);
		qualifedExpertAddImpl.setUserId(userId);

		if (userName == null) {
			qualifedExpertAddImpl.setUserName("");
		}
		else {
			qualifedExpertAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			qualifedExpertAddImpl.setCreateDate(null);
		}
		else {
			qualifedExpertAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			qualifedExpertAddImpl.setModifiedDate(null);
		}
		else {
			qualifedExpertAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (qualifedName == null) {
			qualifedExpertAddImpl.setQualifedName("");
		}
		else {
			qualifedExpertAddImpl.setQualifedName(qualifedName);
		}

		if (qualifedTitle == null) {
			qualifedExpertAddImpl.setQualifedTitle("");
		}
		else {
			qualifedExpertAddImpl.setQualifedTitle(qualifedTitle);
		}

		if (qualifedTelephone == null) {
			qualifedExpertAddImpl.setQualifedTelephone("");
		}
		else {
			qualifedExpertAddImpl.setQualifedTelephone(qualifedTelephone);
		}

		if (qualifedExt == null) {
			qualifedExpertAddImpl.setQualifedExt("");
		}
		else {
			qualifedExpertAddImpl.setQualifedExt(qualifedExt);
		}

		if (qualifedFax == null) {
			qualifedExpertAddImpl.setQualifedFax("");
		}
		else {
			qualifedExpertAddImpl.setQualifedFax(qualifedFax);
		}

		if (qualifedEmailAdd == null) {
			qualifedExpertAddImpl.setQualifedEmailAdd("");
		}
		else {
			qualifedExpertAddImpl.setQualifedEmailAdd(qualifedEmailAdd);
		}

		if (qualifedRegistrationNo == null) {
			qualifedExpertAddImpl.setQualifedRegistrationNo("");
		}
		else {
			qualifedExpertAddImpl.setQualifedRegistrationNo(
				qualifedRegistrationNo);
		}

		if (qualifedExpirationDate == Long.MIN_VALUE) {
			qualifedExpertAddImpl.setQualifedExpirationDate(null);
		}
		else {
			qualifedExpertAddImpl.setQualifedExpirationDate(
				new Date(qualifedExpirationDate));
		}

		if (counter == null) {
			qualifedExpertAddImpl.setCounter("");
		}
		else {
			qualifedExpertAddImpl.setCounter(counter);
		}

		qualifedExpertAddImpl.setHsraApplicationId(hsraApplicationId);

		qualifedExpertAddImpl.resetOriginalValues();

		return qualifedExpertAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		qualifedExpertAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		qualifedName = objectInput.readUTF();
		qualifedTitle = objectInput.readUTF();
		qualifedTelephone = objectInput.readUTF();
		qualifedExt = objectInput.readUTF();
		qualifedFax = objectInput.readUTF();
		qualifedEmailAdd = objectInput.readUTF();
		qualifedRegistrationNo = objectInput.readUTF();
		qualifedExpirationDate = objectInput.readLong();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(qualifedExpertAddId);

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

		if (qualifedName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedName);
		}

		if (qualifedTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedTitle);
		}

		if (qualifedTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedTelephone);
		}

		if (qualifedExt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedExt);
		}

		if (qualifedFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedFax);
		}

		if (qualifedEmailAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedEmailAdd);
		}

		if (qualifedRegistrationNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedRegistrationNo);
		}

		objectOutput.writeLong(qualifedExpirationDate);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long qualifedExpertAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String qualifedName;
	public String qualifedTitle;
	public String qualifedTelephone;
	public String qualifedExt;
	public String qualifedFax;
	public String qualifedEmailAdd;
	public String qualifedRegistrationNo;
	public long qualifedExpirationDate;
	public String counter;
	public long hsraApplicationId;

}