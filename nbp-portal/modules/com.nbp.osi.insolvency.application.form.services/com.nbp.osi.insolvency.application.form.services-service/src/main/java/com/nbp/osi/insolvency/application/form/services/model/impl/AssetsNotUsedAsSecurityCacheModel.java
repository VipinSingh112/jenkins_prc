/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetsNotUsedAsSecurity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssetsNotUsedAsSecurityCacheModel
	implements CacheModel<AssetsNotUsedAsSecurity>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AssetsNotUsedAsSecurityCacheModel)) {
			return false;
		}

		AssetsNotUsedAsSecurityCacheModel assetsNotUsedAsSecurityCacheModel =
			(AssetsNotUsedAsSecurityCacheModel)object;

		if (assetsNotUsedAsSecurityId ==
				assetsNotUsedAsSecurityCacheModel.assetsNotUsedAsSecurityId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, assetsNotUsedAsSecurityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{assetsNotUsedAsSecurityId=");
		sb.append(assetsNotUsedAsSecurityId);
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
		sb.append(", assetRealProp=");
		sb.append(assetRealProp);
		sb.append(", assetNoValue=");
		sb.append(assetNoValue);
		sb.append(", assetDescription=");
		sb.append(assetDescription);
		sb.append(", assetNoCounter=");
		sb.append(assetNoCounter);
		sb.append(", comTotalAssetNotUsedSecurity=");
		sb.append(comTotalAssetNotUsedSecurity);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetsNotUsedAsSecurity toEntityModel() {
		AssetsNotUsedAsSecurityImpl assetsNotUsedAsSecurityImpl =
			new AssetsNotUsedAsSecurityImpl();

		assetsNotUsedAsSecurityImpl.setAssetsNotUsedAsSecurityId(
			assetsNotUsedAsSecurityId);
		assetsNotUsedAsSecurityImpl.setGroupId(groupId);
		assetsNotUsedAsSecurityImpl.setCompanyId(companyId);
		assetsNotUsedAsSecurityImpl.setUserId(userId);

		if (userName == null) {
			assetsNotUsedAsSecurityImpl.setUserName("");
		}
		else {
			assetsNotUsedAsSecurityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			assetsNotUsedAsSecurityImpl.setCreateDate(null);
		}
		else {
			assetsNotUsedAsSecurityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assetsNotUsedAsSecurityImpl.setModifiedDate(null);
		}
		else {
			assetsNotUsedAsSecurityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (assetRealProp == null) {
			assetsNotUsedAsSecurityImpl.setAssetRealProp("");
		}
		else {
			assetsNotUsedAsSecurityImpl.setAssetRealProp(assetRealProp);
		}

		if (assetNoValue == null) {
			assetsNotUsedAsSecurityImpl.setAssetNoValue("");
		}
		else {
			assetsNotUsedAsSecurityImpl.setAssetNoValue(assetNoValue);
		}

		if (assetDescription == null) {
			assetsNotUsedAsSecurityImpl.setAssetDescription("");
		}
		else {
			assetsNotUsedAsSecurityImpl.setAssetDescription(assetDescription);
		}

		if (assetNoCounter == null) {
			assetsNotUsedAsSecurityImpl.setAssetNoCounter("");
		}
		else {
			assetsNotUsedAsSecurityImpl.setAssetNoCounter(assetNoCounter);
		}

		if (comTotalAssetNotUsedSecurity == null) {
			assetsNotUsedAsSecurityImpl.setComTotalAssetNotUsedSecurity("");
		}
		else {
			assetsNotUsedAsSecurityImpl.setComTotalAssetNotUsedSecurity(
				comTotalAssetNotUsedSecurity);
		}

		assetsNotUsedAsSecurityImpl.setOsiInsolvencyId(osiInsolvencyId);

		assetsNotUsedAsSecurityImpl.resetOriginalValues();

		return assetsNotUsedAsSecurityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assetsNotUsedAsSecurityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		assetRealProp = objectInput.readUTF();
		assetNoValue = objectInput.readUTF();
		assetDescription = objectInput.readUTF();
		assetNoCounter = objectInput.readUTF();
		comTotalAssetNotUsedSecurity = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(assetsNotUsedAsSecurityId);

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

		if (assetRealProp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetRealProp);
		}

		if (assetNoValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetNoValue);
		}

		if (assetDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetDescription);
		}

		if (assetNoCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetNoCounter);
		}

		if (comTotalAssetNotUsedSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comTotalAssetNotUsedSecurity);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long assetsNotUsedAsSecurityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String assetRealProp;
	public String assetNoValue;
	public String assetDescription;
	public String assetNoCounter;
	public String comTotalAssetNotUsedSecurity;
	public long osiInsolvencyId;

}