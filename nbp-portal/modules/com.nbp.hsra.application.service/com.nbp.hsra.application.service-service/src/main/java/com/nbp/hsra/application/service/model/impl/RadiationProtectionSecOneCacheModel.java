/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RadiationProtectionSecOne in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RadiationProtectionSecOneCacheModel
	implements CacheModel<RadiationProtectionSecOne>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RadiationProtectionSecOneCacheModel)) {
			return false;
		}

		RadiationProtectionSecOneCacheModel
			radiationProtectionSecOneCacheModel =
				(RadiationProtectionSecOneCacheModel)object;

		if (radiationProtectSecOneId ==
				radiationProtectionSecOneCacheModel.radiationProtectSecOneId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, radiationProtectSecOneId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{radiationProtectSecOneId=");
		sb.append(radiationProtectSecOneId);
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
		sb.append(", currentAuthNum=");
		sb.append(currentAuthNum);
		sb.append(", reasonForAmendment=");
		sb.append(reasonForAmendment);
		sb.append(", typeOfApplication=");
		sb.append(typeOfApplication);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RadiationProtectionSecOne toEntityModel() {
		RadiationProtectionSecOneImpl radiationProtectionSecOneImpl =
			new RadiationProtectionSecOneImpl();

		radiationProtectionSecOneImpl.setRadiationProtectSecOneId(
			radiationProtectSecOneId);
		radiationProtectionSecOneImpl.setGroupId(groupId);
		radiationProtectionSecOneImpl.setCompanyId(companyId);
		radiationProtectionSecOneImpl.setUserId(userId);

		if (userName == null) {
			radiationProtectionSecOneImpl.setUserName("");
		}
		else {
			radiationProtectionSecOneImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			radiationProtectionSecOneImpl.setCreateDate(null);
		}
		else {
			radiationProtectionSecOneImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			radiationProtectionSecOneImpl.setModifiedDate(null);
		}
		else {
			radiationProtectionSecOneImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentAuthNum == null) {
			radiationProtectionSecOneImpl.setCurrentAuthNum("");
		}
		else {
			radiationProtectionSecOneImpl.setCurrentAuthNum(currentAuthNum);
		}

		if (reasonForAmendment == null) {
			radiationProtectionSecOneImpl.setReasonForAmendment("");
		}
		else {
			radiationProtectionSecOneImpl.setReasonForAmendment(
				reasonForAmendment);
		}

		if (typeOfApplication == null) {
			radiationProtectionSecOneImpl.setTypeOfApplication("");
		}
		else {
			radiationProtectionSecOneImpl.setTypeOfApplication(
				typeOfApplication);
		}

		radiationProtectionSecOneImpl.setHsraApplicationId(hsraApplicationId);

		radiationProtectionSecOneImpl.resetOriginalValues();

		return radiationProtectionSecOneImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		radiationProtectSecOneId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentAuthNum = objectInput.readUTF();
		reasonForAmendment = objectInput.readUTF();
		typeOfApplication = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(radiationProtectSecOneId);

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

		if (currentAuthNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentAuthNum);
		}

		if (reasonForAmendment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reasonForAmendment);
		}

		if (typeOfApplication == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplication);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long radiationProtectSecOneId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentAuthNum;
	public String reasonForAmendment;
	public String typeOfApplication;
	public long hsraApplicationId;

}