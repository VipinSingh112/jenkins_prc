/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.FitPropDeclareApplicant;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FitPropDeclareApplicant in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FitPropDeclareApplicantCacheModel
	implements CacheModel<FitPropDeclareApplicant>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FitPropDeclareApplicantCacheModel)) {
			return false;
		}

		FitPropDeclareApplicantCacheModel fitPropDeclareApplicantCacheModel =
			(FitPropDeclareApplicantCacheModel)object;

		if (fitPropDeclareApplicantId ==
				fitPropDeclareApplicantCacheModel.fitPropDeclareApplicantId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fitPropDeclareApplicantId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{fitPropDeclareApplicantId=");
		sb.append(fitPropDeclareApplicantId);
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
		sb.append(", nameApplicant=");
		sb.append(nameApplicant);
		sb.append(", dateApplicant=");
		sb.append(dateApplicant);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FitPropDeclareApplicant toEntityModel() {
		FitPropDeclareApplicantImpl fitPropDeclareApplicantImpl =
			new FitPropDeclareApplicantImpl();

		fitPropDeclareApplicantImpl.setFitPropDeclareApplicantId(
			fitPropDeclareApplicantId);
		fitPropDeclareApplicantImpl.setGroupId(groupId);
		fitPropDeclareApplicantImpl.setCompanyId(companyId);
		fitPropDeclareApplicantImpl.setUserId(userId);

		if (userName == null) {
			fitPropDeclareApplicantImpl.setUserName("");
		}
		else {
			fitPropDeclareApplicantImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fitPropDeclareApplicantImpl.setCreateDate(null);
		}
		else {
			fitPropDeclareApplicantImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fitPropDeclareApplicantImpl.setModifiedDate(null);
		}
		else {
			fitPropDeclareApplicantImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameApplicant == null) {
			fitPropDeclareApplicantImpl.setNameApplicant("");
		}
		else {
			fitPropDeclareApplicantImpl.setNameApplicant(nameApplicant);
		}

		if (dateApplicant == Long.MIN_VALUE) {
			fitPropDeclareApplicantImpl.setDateApplicant(null);
		}
		else {
			fitPropDeclareApplicantImpl.setDateApplicant(
				new Date(dateApplicant));
		}

		fitPropDeclareApplicantImpl.setHsraApplicationId(hsraApplicationId);

		fitPropDeclareApplicantImpl.resetOriginalValues();

		return fitPropDeclareApplicantImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fitPropDeclareApplicantId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameApplicant = objectInput.readUTF();
		dateApplicant = objectInput.readLong();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fitPropDeclareApplicantId);

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

		if (nameApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameApplicant);
		}

		objectOutput.writeLong(dateApplicant);

		objectOutput.writeLong(hsraApplicationId);
	}

	public long fitPropDeclareApplicantId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameApplicant;
	public long dateApplicant;
	public long hsraApplicationId;

}