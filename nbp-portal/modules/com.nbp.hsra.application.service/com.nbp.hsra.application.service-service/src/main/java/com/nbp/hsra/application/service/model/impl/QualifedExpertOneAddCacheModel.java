/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.QualifedExpertOneAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QualifedExpertOneAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QualifedExpertOneAddCacheModel
	implements CacheModel<QualifedExpertOneAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualifedExpertOneAddCacheModel)) {
			return false;
		}

		QualifedExpertOneAddCacheModel qualifedExpertOneAddCacheModel =
			(QualifedExpertOneAddCacheModel)object;

		if (qualifedExpertOneAddId ==
				qualifedExpertOneAddCacheModel.qualifedExpertOneAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, qualifedExpertOneAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{qualifedExpertOneAddId=");
		sb.append(qualifedExpertOneAddId);
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
		sb.append(", qualifedOneName=");
		sb.append(qualifedOneName);
		sb.append(", qualifedOneTitle=");
		sb.append(qualifedOneTitle);
		sb.append(", qualifedOneTelephone=");
		sb.append(qualifedOneTelephone);
		sb.append(", qualifedOneExt=");
		sb.append(qualifedOneExt);
		sb.append(", qualifedOneFax=");
		sb.append(qualifedOneFax);
		sb.append(", qualifedOneEmailAdd=");
		sb.append(qualifedOneEmailAdd);
		sb.append(", qualifedOneRegistrationNo=");
		sb.append(qualifedOneRegistrationNo);
		sb.append(", qualifedOneExpirationDate=");
		sb.append(qualifedOneExpirationDate);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QualifedExpertOneAdd toEntityModel() {
		QualifedExpertOneAddImpl qualifedExpertOneAddImpl =
			new QualifedExpertOneAddImpl();

		qualifedExpertOneAddImpl.setQualifedExpertOneAddId(
			qualifedExpertOneAddId);
		qualifedExpertOneAddImpl.setGroupId(groupId);
		qualifedExpertOneAddImpl.setCompanyId(companyId);
		qualifedExpertOneAddImpl.setUserId(userId);

		if (userName == null) {
			qualifedExpertOneAddImpl.setUserName("");
		}
		else {
			qualifedExpertOneAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			qualifedExpertOneAddImpl.setCreateDate(null);
		}
		else {
			qualifedExpertOneAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			qualifedExpertOneAddImpl.setModifiedDate(null);
		}
		else {
			qualifedExpertOneAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (qualifedOneName == null) {
			qualifedExpertOneAddImpl.setQualifedOneName("");
		}
		else {
			qualifedExpertOneAddImpl.setQualifedOneName(qualifedOneName);
		}

		if (qualifedOneTitle == null) {
			qualifedExpertOneAddImpl.setQualifedOneTitle("");
		}
		else {
			qualifedExpertOneAddImpl.setQualifedOneTitle(qualifedOneTitle);
		}

		if (qualifedOneTelephone == null) {
			qualifedExpertOneAddImpl.setQualifedOneTelephone("");
		}
		else {
			qualifedExpertOneAddImpl.setQualifedOneTelephone(
				qualifedOneTelephone);
		}

		if (qualifedOneExt == null) {
			qualifedExpertOneAddImpl.setQualifedOneExt("");
		}
		else {
			qualifedExpertOneAddImpl.setQualifedOneExt(qualifedOneExt);
		}

		if (qualifedOneFax == null) {
			qualifedExpertOneAddImpl.setQualifedOneFax("");
		}
		else {
			qualifedExpertOneAddImpl.setQualifedOneFax(qualifedOneFax);
		}

		if (qualifedOneEmailAdd == null) {
			qualifedExpertOneAddImpl.setQualifedOneEmailAdd("");
		}
		else {
			qualifedExpertOneAddImpl.setQualifedOneEmailAdd(
				qualifedOneEmailAdd);
		}

		if (qualifedOneRegistrationNo == null) {
			qualifedExpertOneAddImpl.setQualifedOneRegistrationNo("");
		}
		else {
			qualifedExpertOneAddImpl.setQualifedOneRegistrationNo(
				qualifedOneRegistrationNo);
		}

		if (qualifedOneExpirationDate == Long.MIN_VALUE) {
			qualifedExpertOneAddImpl.setQualifedOneExpirationDate(null);
		}
		else {
			qualifedExpertOneAddImpl.setQualifedOneExpirationDate(
				new Date(qualifedOneExpirationDate));
		}

		if (counter == null) {
			qualifedExpertOneAddImpl.setCounter("");
		}
		else {
			qualifedExpertOneAddImpl.setCounter(counter);
		}

		qualifedExpertOneAddImpl.setHsraApplicationId(hsraApplicationId);

		qualifedExpertOneAddImpl.resetOriginalValues();

		return qualifedExpertOneAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		qualifedExpertOneAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		qualifedOneName = objectInput.readUTF();
		qualifedOneTitle = objectInput.readUTF();
		qualifedOneTelephone = objectInput.readUTF();
		qualifedOneExt = objectInput.readUTF();
		qualifedOneFax = objectInput.readUTF();
		qualifedOneEmailAdd = objectInput.readUTF();
		qualifedOneRegistrationNo = objectInput.readUTF();
		qualifedOneExpirationDate = objectInput.readLong();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(qualifedExpertOneAddId);

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

		if (qualifedOneName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedOneName);
		}

		if (qualifedOneTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedOneTitle);
		}

		if (qualifedOneTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedOneTelephone);
		}

		if (qualifedOneExt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedOneExt);
		}

		if (qualifedOneFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedOneFax);
		}

		if (qualifedOneEmailAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedOneEmailAdd);
		}

		if (qualifedOneRegistrationNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifedOneRegistrationNo);
		}

		objectOutput.writeLong(qualifedOneExpirationDate);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long qualifedExpertOneAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String qualifedOneName;
	public String qualifedOneTitle;
	public String qualifedOneTelephone;
	public String qualifedOneExt;
	public String qualifedOneFax;
	public String qualifedOneEmailAdd;
	public String qualifedOneRegistrationNo;
	public long qualifedOneExpirationDate;
	public String counter;
	public long hsraApplicationId;

}