/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.QualityDeclarationInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QualityDeclarationInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QualityDeclarationInfoCacheModel
	implements CacheModel<QualityDeclarationInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualityDeclarationInfoCacheModel)) {
			return false;
		}

		QualityDeclarationInfoCacheModel qualityDeclarationInfoCacheModel =
			(QualityDeclarationInfoCacheModel)object;

		if (qualityDeclarationInfoId ==
				qualityDeclarationInfoCacheModel.qualityDeclarationInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, qualityDeclarationInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{qualityDeclarationInfoId=");
		sb.append(qualityDeclarationInfoId);
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
		sb.append(", declarationSignDate=");
		sb.append(declarationSignDate);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QualityDeclarationInfo toEntityModel() {
		QualityDeclarationInfoImpl qualityDeclarationInfoImpl =
			new QualityDeclarationInfoImpl();

		qualityDeclarationInfoImpl.setQualityDeclarationInfoId(
			qualityDeclarationInfoId);
		qualityDeclarationInfoImpl.setGroupId(groupId);
		qualityDeclarationInfoImpl.setCompanyId(companyId);
		qualityDeclarationInfoImpl.setUserId(userId);

		if (userName == null) {
			qualityDeclarationInfoImpl.setUserName("");
		}
		else {
			qualityDeclarationInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			qualityDeclarationInfoImpl.setCreateDate(null);
		}
		else {
			qualityDeclarationInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			qualityDeclarationInfoImpl.setModifiedDate(null);
		}
		else {
			qualityDeclarationInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (declarationSignDate == Long.MIN_VALUE) {
			qualityDeclarationInfoImpl.setDeclarationSignDate(null);
		}
		else {
			qualityDeclarationInfoImpl.setDeclarationSignDate(
				new Date(declarationSignDate));
		}

		qualityDeclarationInfoImpl.setHsraApplicationId(hsraApplicationId);

		qualityDeclarationInfoImpl.resetOriginalValues();

		return qualityDeclarationInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		qualityDeclarationInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		declarationSignDate = objectInput.readLong();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(qualityDeclarationInfoId);

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
		objectOutput.writeLong(declarationSignDate);

		objectOutput.writeLong(hsraApplicationId);
	}

	public long qualityDeclarationInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long declarationSignDate;
	public long hsraApplicationId;

}