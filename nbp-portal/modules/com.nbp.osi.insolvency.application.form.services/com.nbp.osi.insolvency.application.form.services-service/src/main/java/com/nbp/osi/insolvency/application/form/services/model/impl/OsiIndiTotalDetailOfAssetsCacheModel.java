/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiIndiTotalDetailOfAssets;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiIndiTotalDetailOfAssets in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiIndiTotalDetailOfAssetsCacheModel
	implements CacheModel<OsiIndiTotalDetailOfAssets>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiIndiTotalDetailOfAssetsCacheModel)) {
			return false;
		}

		OsiIndiTotalDetailOfAssetsCacheModel
			osiIndiTotalDetailOfAssetsCacheModel =
				(OsiIndiTotalDetailOfAssetsCacheModel)object;

		if (osiIndiTotalDetailOfAssetsId ==
				osiIndiTotalDetailOfAssetsCacheModel.
					osiIndiTotalDetailOfAssetsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiIndiTotalDetailOfAssetsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{osiIndiTotalDetailOfAssetsId=");
		sb.append(osiIndiTotalDetailOfAssetsId);
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
		sb.append(", totalValueOfAssetUsedSecu=");
		sb.append(totalValueOfAssetUsedSecu);
		sb.append(", totalValueOfAssetNotUsedSecu=");
		sb.append(totalValueOfAssetNotUsedSecu);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiIndiTotalDetailOfAssets toEntityModel() {
		OsiIndiTotalDetailOfAssetsImpl osiIndiTotalDetailOfAssetsImpl =
			new OsiIndiTotalDetailOfAssetsImpl();

		osiIndiTotalDetailOfAssetsImpl.setOsiIndiTotalDetailOfAssetsId(
			osiIndiTotalDetailOfAssetsId);
		osiIndiTotalDetailOfAssetsImpl.setGroupId(groupId);
		osiIndiTotalDetailOfAssetsImpl.setCompanyId(companyId);
		osiIndiTotalDetailOfAssetsImpl.setUserId(userId);

		if (userName == null) {
			osiIndiTotalDetailOfAssetsImpl.setUserName("");
		}
		else {
			osiIndiTotalDetailOfAssetsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiIndiTotalDetailOfAssetsImpl.setCreateDate(null);
		}
		else {
			osiIndiTotalDetailOfAssetsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiIndiTotalDetailOfAssetsImpl.setModifiedDate(null);
		}
		else {
			osiIndiTotalDetailOfAssetsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (totalValueOfAssetUsedSecu == null) {
			osiIndiTotalDetailOfAssetsImpl.setTotalValueOfAssetUsedSecu("");
		}
		else {
			osiIndiTotalDetailOfAssetsImpl.setTotalValueOfAssetUsedSecu(
				totalValueOfAssetUsedSecu);
		}

		if (totalValueOfAssetNotUsedSecu == null) {
			osiIndiTotalDetailOfAssetsImpl.setTotalValueOfAssetNotUsedSecu("");
		}
		else {
			osiIndiTotalDetailOfAssetsImpl.setTotalValueOfAssetNotUsedSecu(
				totalValueOfAssetNotUsedSecu);
		}

		osiIndiTotalDetailOfAssetsImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiIndiTotalDetailOfAssetsImpl.resetOriginalValues();

		return osiIndiTotalDetailOfAssetsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiIndiTotalDetailOfAssetsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		totalValueOfAssetUsedSecu = objectInput.readUTF();
		totalValueOfAssetNotUsedSecu = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiIndiTotalDetailOfAssetsId);

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

		if (totalValueOfAssetUsedSecu == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalValueOfAssetUsedSecu);
		}

		if (totalValueOfAssetNotUsedSecu == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalValueOfAssetNotUsedSecu);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiIndiTotalDetailOfAssetsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String totalValueOfAssetUsedSecu;
	public String totalValueOfAssetNotUsedSecu;
	public long osiInsolvencyId;

}