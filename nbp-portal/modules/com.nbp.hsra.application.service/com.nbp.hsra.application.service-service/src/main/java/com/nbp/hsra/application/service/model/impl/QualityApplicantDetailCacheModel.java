/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.QualityApplicantDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QualityApplicantDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QualityApplicantDetailCacheModel
	implements CacheModel<QualityApplicantDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualityApplicantDetailCacheModel)) {
			return false;
		}

		QualityApplicantDetailCacheModel qualityApplicantDetailCacheModel =
			(QualityApplicantDetailCacheModel)object;

		if (qualityApplicantDetailId ==
				qualityApplicantDetailCacheModel.qualityApplicantDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, qualityApplicantDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{qualityApplicantDetailId=");
		sb.append(qualityApplicantDetailId);
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
		sb.append(", expertSurname=");
		sb.append(expertSurname);
		sb.append(", expertFirstName=");
		sb.append(expertFirstName);
		sb.append(", expertId=");
		sb.append(expertId);
		sb.append(", expertPosition=");
		sb.append(expertPosition);
		sb.append(", expertTelephone=");
		sb.append(expertTelephone);
		sb.append(", expertMobile=");
		sb.append(expertMobile);
		sb.append(", expertEmail=");
		sb.append(expertEmail);
		sb.append(", expertDate=");
		sb.append(expertDate);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QualityApplicantDetail toEntityModel() {
		QualityApplicantDetailImpl qualityApplicantDetailImpl =
			new QualityApplicantDetailImpl();

		qualityApplicantDetailImpl.setQualityApplicantDetailId(
			qualityApplicantDetailId);
		qualityApplicantDetailImpl.setGroupId(groupId);
		qualityApplicantDetailImpl.setCompanyId(companyId);
		qualityApplicantDetailImpl.setUserId(userId);

		if (userName == null) {
			qualityApplicantDetailImpl.setUserName("");
		}
		else {
			qualityApplicantDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			qualityApplicantDetailImpl.setCreateDate(null);
		}
		else {
			qualityApplicantDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			qualityApplicantDetailImpl.setModifiedDate(null);
		}
		else {
			qualityApplicantDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (expertSurname == null) {
			qualityApplicantDetailImpl.setExpertSurname("");
		}
		else {
			qualityApplicantDetailImpl.setExpertSurname(expertSurname);
		}

		if (expertFirstName == null) {
			qualityApplicantDetailImpl.setExpertFirstName("");
		}
		else {
			qualityApplicantDetailImpl.setExpertFirstName(expertFirstName);
		}

		if (expertId == null) {
			qualityApplicantDetailImpl.setExpertId("");
		}
		else {
			qualityApplicantDetailImpl.setExpertId(expertId);
		}

		if (expertPosition == null) {
			qualityApplicantDetailImpl.setExpertPosition("");
		}
		else {
			qualityApplicantDetailImpl.setExpertPosition(expertPosition);
		}

		if (expertTelephone == null) {
			qualityApplicantDetailImpl.setExpertTelephone("");
		}
		else {
			qualityApplicantDetailImpl.setExpertTelephone(expertTelephone);
		}

		if (expertMobile == null) {
			qualityApplicantDetailImpl.setExpertMobile("");
		}
		else {
			qualityApplicantDetailImpl.setExpertMobile(expertMobile);
		}

		if (expertEmail == null) {
			qualityApplicantDetailImpl.setExpertEmail("");
		}
		else {
			qualityApplicantDetailImpl.setExpertEmail(expertEmail);
		}

		if (expertDate == Long.MIN_VALUE) {
			qualityApplicantDetailImpl.setExpertDate(null);
		}
		else {
			qualityApplicantDetailImpl.setExpertDate(new Date(expertDate));
		}

		qualityApplicantDetailImpl.setHsraApplicationId(hsraApplicationId);

		qualityApplicantDetailImpl.resetOriginalValues();

		return qualityApplicantDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		qualityApplicantDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		expertSurname = objectInput.readUTF();
		expertFirstName = objectInput.readUTF();
		expertId = objectInput.readUTF();
		expertPosition = objectInput.readUTF();
		expertTelephone = objectInput.readUTF();
		expertMobile = objectInput.readUTF();
		expertEmail = objectInput.readUTF();
		expertDate = objectInput.readLong();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(qualityApplicantDetailId);

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

		if (expertSurname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertSurname);
		}

		if (expertFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertFirstName);
		}

		if (expertId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertId);
		}

		if (expertPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertPosition);
		}

		if (expertTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertTelephone);
		}

		if (expertMobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertMobile);
		}

		if (expertEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertEmail);
		}

		objectOutput.writeLong(expertDate);

		objectOutput.writeLong(hsraApplicationId);
	}

	public long qualityApplicantDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String expertSurname;
	public String expertFirstName;
	public String expertId;
	public String expertPosition;
	public String expertTelephone;
	public String expertMobile;
	public String expertEmail;
	public long expertDate;
	public long hsraApplicationId;

}