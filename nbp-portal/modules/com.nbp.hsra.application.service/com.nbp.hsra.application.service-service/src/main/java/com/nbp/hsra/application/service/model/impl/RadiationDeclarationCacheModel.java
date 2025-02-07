/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.RadiationDeclaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RadiationDeclaration in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RadiationDeclarationCacheModel
	implements CacheModel<RadiationDeclaration>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RadiationDeclarationCacheModel)) {
			return false;
		}

		RadiationDeclarationCacheModel radiationDeclarationCacheModel =
			(RadiationDeclarationCacheModel)object;

		if (radiationDeclarationId ==
				radiationDeclarationCacheModel.radiationDeclarationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, radiationDeclarationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{radiationDeclarationId=");
		sb.append(radiationDeclarationId);
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
		sb.append(", legalOperatorName=");
		sb.append(legalOperatorName);
		sb.append(", operatorTitle=");
		sb.append(operatorTitle);
		sb.append(", operatorDate=");
		sb.append(operatorDate);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RadiationDeclaration toEntityModel() {
		RadiationDeclarationImpl radiationDeclarationImpl =
			new RadiationDeclarationImpl();

		radiationDeclarationImpl.setRadiationDeclarationId(
			radiationDeclarationId);
		radiationDeclarationImpl.setGroupId(groupId);
		radiationDeclarationImpl.setCompanyId(companyId);
		radiationDeclarationImpl.setUserId(userId);

		if (userName == null) {
			radiationDeclarationImpl.setUserName("");
		}
		else {
			radiationDeclarationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			radiationDeclarationImpl.setCreateDate(null);
		}
		else {
			radiationDeclarationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			radiationDeclarationImpl.setModifiedDate(null);
		}
		else {
			radiationDeclarationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (legalOperatorName == null) {
			radiationDeclarationImpl.setLegalOperatorName("");
		}
		else {
			radiationDeclarationImpl.setLegalOperatorName(legalOperatorName);
		}

		if (operatorTitle == null) {
			radiationDeclarationImpl.setOperatorTitle("");
		}
		else {
			radiationDeclarationImpl.setOperatorTitle(operatorTitle);
		}

		if (operatorDate == Long.MIN_VALUE) {
			radiationDeclarationImpl.setOperatorDate(null);
		}
		else {
			radiationDeclarationImpl.setOperatorDate(new Date(operatorDate));
		}

		radiationDeclarationImpl.setHsraApplicationId(hsraApplicationId);

		radiationDeclarationImpl.resetOriginalValues();

		return radiationDeclarationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		radiationDeclarationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		legalOperatorName = objectInput.readUTF();
		operatorTitle = objectInput.readUTF();
		operatorDate = objectInput.readLong();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(radiationDeclarationId);

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

		if (legalOperatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(legalOperatorName);
		}

		if (operatorTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatorTitle);
		}

		objectOutput.writeLong(operatorDate);

		objectOutput.writeLong(hsraApplicationId);
	}

	public long radiationDeclarationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String legalOperatorName;
	public String operatorTitle;
	public long operatorDate;
	public long hsraApplicationId;

}