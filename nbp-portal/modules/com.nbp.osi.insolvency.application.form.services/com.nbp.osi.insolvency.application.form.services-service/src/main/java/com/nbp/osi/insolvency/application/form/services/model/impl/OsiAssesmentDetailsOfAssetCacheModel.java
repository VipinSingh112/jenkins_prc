/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiAssesmentDetailsOfAsset;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiAssesmentDetailsOfAsset in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiAssesmentDetailsOfAssetCacheModel
	implements CacheModel<OsiAssesmentDetailsOfAsset>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiAssesmentDetailsOfAssetCacheModel)) {
			return false;
		}

		OsiAssesmentDetailsOfAssetCacheModel
			osiAssesmentDetailsOfAssetCacheModel =
				(OsiAssesmentDetailsOfAssetCacheModel)object;

		if (osiAssetDetailsId ==
				osiAssesmentDetailsOfAssetCacheModel.osiAssetDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiAssetDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{osiAssetDetailsId=");
		sb.append(osiAssetDetailsId);
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
		sb.append(", totalAssetUsedAsSecurity=");
		sb.append(totalAssetUsedAsSecurity);
		sb.append(", totalAssetNotUsedAsSec=");
		sb.append(totalAssetNotUsedAsSec);
		sb.append(", totalValuesOfAsset=");
		sb.append(totalValuesOfAsset);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiAssesmentDetailsOfAsset toEntityModel() {
		OsiAssesmentDetailsOfAssetImpl osiAssesmentDetailsOfAssetImpl =
			new OsiAssesmentDetailsOfAssetImpl();

		osiAssesmentDetailsOfAssetImpl.setOsiAssetDetailsId(osiAssetDetailsId);
		osiAssesmentDetailsOfAssetImpl.setGroupId(groupId);
		osiAssesmentDetailsOfAssetImpl.setCompanyId(companyId);
		osiAssesmentDetailsOfAssetImpl.setUserId(userId);

		if (userName == null) {
			osiAssesmentDetailsOfAssetImpl.setUserName("");
		}
		else {
			osiAssesmentDetailsOfAssetImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiAssesmentDetailsOfAssetImpl.setCreateDate(null);
		}
		else {
			osiAssesmentDetailsOfAssetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiAssesmentDetailsOfAssetImpl.setModifiedDate(null);
		}
		else {
			osiAssesmentDetailsOfAssetImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (totalAssetUsedAsSecurity == null) {
			osiAssesmentDetailsOfAssetImpl.setTotalAssetUsedAsSecurity("");
		}
		else {
			osiAssesmentDetailsOfAssetImpl.setTotalAssetUsedAsSecurity(
				totalAssetUsedAsSecurity);
		}

		if (totalAssetNotUsedAsSec == null) {
			osiAssesmentDetailsOfAssetImpl.setTotalAssetNotUsedAsSec("");
		}
		else {
			osiAssesmentDetailsOfAssetImpl.setTotalAssetNotUsedAsSec(
				totalAssetNotUsedAsSec);
		}

		if (totalValuesOfAsset == null) {
			osiAssesmentDetailsOfAssetImpl.setTotalValuesOfAsset("");
		}
		else {
			osiAssesmentDetailsOfAssetImpl.setTotalValuesOfAsset(
				totalValuesOfAsset);
		}

		osiAssesmentDetailsOfAssetImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiAssesmentDetailsOfAssetImpl.resetOriginalValues();

		return osiAssesmentDetailsOfAssetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiAssetDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		totalAssetUsedAsSecurity = objectInput.readUTF();
		totalAssetNotUsedAsSec = objectInput.readUTF();
		totalValuesOfAsset = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiAssetDetailsId);

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

		if (totalAssetUsedAsSecurity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalAssetUsedAsSecurity);
		}

		if (totalAssetNotUsedAsSec == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalAssetNotUsedAsSec);
		}

		if (totalValuesOfAsset == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalValuesOfAsset);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiAssetDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String totalAssetUsedAsSecurity;
	public String totalAssetNotUsedAsSec;
	public String totalValuesOfAsset;
	public long osiInsolvencyId;

}