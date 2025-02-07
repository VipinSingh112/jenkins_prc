/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.AssetsUsedAsSecurity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetsUsedAsSecurity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssetsUsedAsSecurityCacheModel
	implements CacheModel<AssetsUsedAsSecurity>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AssetsUsedAsSecurityCacheModel)) {
			return false;
		}

		AssetsUsedAsSecurityCacheModel assetsUsedAsSecurityCacheModel =
			(AssetsUsedAsSecurityCacheModel)object;

		if (assetsUsedAsSecurityId ==
				assetsUsedAsSecurityCacheModel.assetsUsedAsSecurityId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, assetsUsedAsSecurityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{assetsUsedAsSecurityId=");
		sb.append(assetsUsedAsSecurityId);
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
		sb.append(", assetSecurity=");
		sb.append(assetSecurity);
		sb.append(", assetSecurityHolder=");
		sb.append(assetSecurityHolder);
		sb.append(", assetDetails=");
		sb.append(assetDetails);
		sb.append(", assetValue=");
		sb.append(assetValue);
		sb.append(", assetLiability=");
		sb.append(assetLiability);
		sb.append(", assetNetValue=");
		sb.append(assetNetValue);
		sb.append(", assetCounter=");
		sb.append(assetCounter);
		sb.append(", comTotalAssetUsedSecurity=");
		sb.append(comTotalAssetUsedSecurity);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetsUsedAsSecurity toEntityModel() {
		AssetsUsedAsSecurityImpl assetsUsedAsSecurityImpl =
			new AssetsUsedAsSecurityImpl();

		assetsUsedAsSecurityImpl.setAssetsUsedAsSecurityId(
			assetsUsedAsSecurityId);
		assetsUsedAsSecurityImpl.setGroupId(groupId);
		assetsUsedAsSecurityImpl.setCompanyId(companyId);
		assetsUsedAsSecurityImpl.setUserId(userId);

		if (userName == null) {
			assetsUsedAsSecurityImpl.setUserName("");
		}
		else {
			assetsUsedAsSecurityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			assetsUsedAsSecurityImpl.setCreateDate(null);
		}
		else {
			assetsUsedAsSecurityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assetsUsedAsSecurityImpl.setModifiedDate(null);
		}
		else {
			assetsUsedAsSecurityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (assetSecurity == null) {
			assetsUsedAsSecurityImpl.setAssetSecurity("");
		}
		else {
			assetsUsedAsSecurityImpl.setAssetSecurity(assetSecurity);
		}

		if (assetSecurityHolder == null) {
			assetsUsedAsSecurityImpl.setAssetSecurityHolder("");
		}
		else {
			assetsUsedAsSecurityImpl.setAssetSecurityHolder(
				assetSecurityHolder);
		}

		if (assetDetails == null) {
			assetsUsedAsSecurityImpl.setAssetDetails("");
		}
		else {
			assetsUsedAsSecurityImpl.setAssetDetails(assetDetails);
		}

		if (assetValue == null) {
			assetsUsedAsSecurityImpl.setAssetValue("");
		}
		else {
			assetsUsedAsSecurityImpl.setAssetValue(assetValue);
		}

		if (assetLiability == null) {
			assetsUsedAsSecurityImpl.setAssetLiability("");
		}
		else {
			assetsUsedAsSecurityImpl.setAssetLiability(assetLiability);
		}

		if (assetNetValue == null) {
			assetsUsedAsSecurityImpl.setAssetNetValue("");
		}
		else {
			assetsUsedAsSecurityImpl.setAssetNetValue(assetNetValue);
		}

		if (assetCounter == null) {
			assetsUsedAsSecurityImpl.setAssetCounter("");
		}
		else {
			assetsUsedAsSecurityImpl.setAssetCounter(assetCounter);
		}

		if (comTotalAssetUsedSecurity == null) {
			assetsUsedAsSecurityImpl.setComTotalAssetUsedSecurity("");
		}
		else {
			assetsUsedAsSecurityImpl.setComTotalAssetUsedSecurity(
				comTotalAssetUsedSecurity);
		}

		assetsUsedAsSecurityImpl.setOsiInsolvencyId(osiInsolvencyId);

		assetsUsedAsSecurityImpl.resetOriginalValues();

		return assetsUsedAsSecurityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assetsUsedAsSecurityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		assetSecurity = objectInput.readUTF();
		assetSecurityHolder = objectInput.readUTF();
		assetDetails = objectInput.readUTF();
		assetValue = objectInput.readUTF();
		assetLiability = objectInput.readUTF();
		assetNetValue = objectInput.readUTF();
		assetCounter = objectInput.readUTF();
		comTotalAssetUsedSecurity = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(assetsUsedAsSecurityId);

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

		if (assetSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetSecurity);
		}

		if (assetSecurityHolder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetSecurityHolder);
		}

		if (assetDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetDetails);
		}

		if (assetValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetValue);
		}

		if (assetLiability == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetLiability);
		}

		if (assetNetValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetNetValue);
		}

		if (assetCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assetCounter);
		}

		if (comTotalAssetUsedSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comTotalAssetUsedSecurity);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long assetsUsedAsSecurityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String assetSecurity;
	public String assetSecurityHolder;
	public String assetDetails;
	public String assetValue;
	public String assetLiability;
	public String assetNetValue;
	public String assetCounter;
	public String comTotalAssetUsedSecurity;
	public long osiInsolvencyId;

}