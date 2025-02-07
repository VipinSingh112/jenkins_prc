/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeCerPurposeInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeCerPurposeInfoCacheModel
	implements CacheModel<FireBrigadeCerPurposeInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeCerPurposeInfoCacheModel)) {
			return false;
		}

		FireBrigadeCerPurposeInfoCacheModel
			fireBrigadeCerPurposeInfoCacheModel =
				(FireBrigadeCerPurposeInfoCacheModel)object;

		if (fireBrigadeCerPurposeInfoId ==
				fireBrigadeCerPurposeInfoCacheModel.
					fireBrigadeCerPurposeInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeCerPurposeInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{fireBrigadeCerPurposeInfoId=");
		sb.append(fireBrigadeCerPurposeInfoId);
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
		sb.append(", certificatePurposePre=");
		sb.append(certificatePurposePre);
		sb.append(", otherCertificatePurpose=");
		sb.append(otherCertificatePurpose);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeCerPurposeInfo toEntityModel() {
		FireBrigadeCerPurposeInfoImpl fireBrigadeCerPurposeInfoImpl =
			new FireBrigadeCerPurposeInfoImpl();

		fireBrigadeCerPurposeInfoImpl.setFireBrigadeCerPurposeInfoId(
			fireBrigadeCerPurposeInfoId);
		fireBrigadeCerPurposeInfoImpl.setGroupId(groupId);
		fireBrigadeCerPurposeInfoImpl.setCompanyId(companyId);
		fireBrigadeCerPurposeInfoImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeCerPurposeInfoImpl.setUserName("");
		}
		else {
			fireBrigadeCerPurposeInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeCerPurposeInfoImpl.setCreateDate(null);
		}
		else {
			fireBrigadeCerPurposeInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeCerPurposeInfoImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeCerPurposeInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (certificatePurposePre == null) {
			fireBrigadeCerPurposeInfoImpl.setCertificatePurposePre("");
		}
		else {
			fireBrigadeCerPurposeInfoImpl.setCertificatePurposePre(
				certificatePurposePre);
		}

		if (otherCertificatePurpose == null) {
			fireBrigadeCerPurposeInfoImpl.setOtherCertificatePurpose("");
		}
		else {
			fireBrigadeCerPurposeInfoImpl.setOtherCertificatePurpose(
				otherCertificatePurpose);
		}

		fireBrigadeCerPurposeInfoImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadeCerPurposeInfoImpl.resetOriginalValues();

		return fireBrigadeCerPurposeInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeCerPurposeInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		certificatePurposePre = objectInput.readUTF();
		otherCertificatePurpose = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeCerPurposeInfoId);

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

		if (certificatePurposePre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificatePurposePre);
		}

		if (otherCertificatePurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherCertificatePurpose);
		}

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadeCerPurposeInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String certificatePurposePre;
	public String otherCertificatePurpose;
	public long fireBrigadeApplicationId;

}