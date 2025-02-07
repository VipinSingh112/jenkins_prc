/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.UsedSecurity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UsedSecurity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UsedSecurityCacheModel
	implements CacheModel<UsedSecurity>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UsedSecurityCacheModel)) {
			return false;
		}

		UsedSecurityCacheModel usedSecurityCacheModel =
			(UsedSecurityCacheModel)object;

		if (usedSecurityId == usedSecurityCacheModel.usedSecurityId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, usedSecurityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{usedSecurityId=");
		sb.append(usedSecurityId);
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
		sb.append(", assetType=");
		sb.append(assetType);
		sb.append(", securityHolder=");
		sb.append(securityHolder);
		sb.append(", securityDetail=");
		sb.append(securityDetail);
		sb.append(", securityValue=");
		sb.append(securityValue);
		sb.append(", securityLiability=");
		sb.append(securityLiability);
		sb.append(", securityNetValue=");
		sb.append(securityNetValue);
		sb.append(", securityCounter=");
		sb.append(securityCounter);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UsedSecurity toEntityModel() {
		UsedSecurityImpl usedSecurityImpl = new UsedSecurityImpl();

		usedSecurityImpl.setUsedSecurityId(usedSecurityId);
		usedSecurityImpl.setGroupId(groupId);
		usedSecurityImpl.setCompanyId(companyId);
		usedSecurityImpl.setUserId(userId);

		if (userName == null) {
			usedSecurityImpl.setUserName("");
		}
		else {
			usedSecurityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			usedSecurityImpl.setCreateDate(null);
		}
		else {
			usedSecurityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			usedSecurityImpl.setModifiedDate(null);
		}
		else {
			usedSecurityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (assetType == null) {
			usedSecurityImpl.setAssetType("");
		}
		else {
			usedSecurityImpl.setAssetType(assetType);
		}

		if (securityHolder == null) {
			usedSecurityImpl.setSecurityHolder("");
		}
		else {
			usedSecurityImpl.setSecurityHolder(securityHolder);
		}

		if (securityDetail == null) {
			usedSecurityImpl.setSecurityDetail("");
		}
		else {
			usedSecurityImpl.setSecurityDetail(securityDetail);
		}

		if (securityValue == null) {
			usedSecurityImpl.setSecurityValue("");
		}
		else {
			usedSecurityImpl.setSecurityValue(securityValue);
		}

		if (securityLiability == null) {
			usedSecurityImpl.setSecurityLiability("");
		}
		else {
			usedSecurityImpl.setSecurityLiability(securityLiability);
		}

		if (securityNetValue == null) {
			usedSecurityImpl.setSecurityNetValue("");
		}
		else {
			usedSecurityImpl.setSecurityNetValue(securityNetValue);
		}

		if (securityCounter == null) {
			usedSecurityImpl.setSecurityCounter("");
		}
		else {
			usedSecurityImpl.setSecurityCounter(securityCounter);
		}

		usedSecurityImpl.setOsiInsolvencyId(osiInsolvencyId);

		usedSecurityImpl.resetOriginalValues();

		return usedSecurityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		usedSecurityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		assetType = objectInput.readUTF();
		securityHolder = objectInput.readUTF();
		securityDetail = objectInput.readUTF();
		securityValue = objectInput.readUTF();
		securityLiability = objectInput.readUTF();
		securityNetValue = objectInput.readUTF();
		securityCounter = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(usedSecurityId);

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

		if (assetType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetType);
		}

		if (securityHolder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityHolder);
		}

		if (securityDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityDetail);
		}

		if (securityValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityValue);
		}

		if (securityLiability == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityLiability);
		}

		if (securityNetValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityNetValue);
		}

		if (securityCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityCounter);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long usedSecurityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String assetType;
	public String securityHolder;
	public String securityDetail;
	public String securityValue;
	public String securityLiability;
	public String securityNetValue;
	public String securityCounter;
	public long osiInsolvencyId;

}