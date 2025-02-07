/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeSocialMediaAddBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeSocialMediaAddBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeSocialMediaAddBoxCacheModel
	implements CacheModel<CreativeSocialMediaAddBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeSocialMediaAddBoxCacheModel)) {
			return false;
		}

		CreativeSocialMediaAddBoxCacheModel
			creativeSocialMediaAddBoxCacheModel =
				(CreativeSocialMediaAddBoxCacheModel)object;

		if (creativeSocialBoxId ==
				creativeSocialMediaAddBoxCacheModel.creativeSocialBoxId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeSocialBoxId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{creativeSocialBoxId=");
		sb.append(creativeSocialBoxId);
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
		sb.append(", socialMedia=");
		sb.append(socialMedia);
		sb.append(", profileName=");
		sb.append(profileName);
		sb.append(", counterSocislMedia=");
		sb.append(counterSocislMedia);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeSocialMediaAddBox toEntityModel() {
		CreativeSocialMediaAddBoxImpl creativeSocialMediaAddBoxImpl =
			new CreativeSocialMediaAddBoxImpl();

		creativeSocialMediaAddBoxImpl.setCreativeSocialBoxId(
			creativeSocialBoxId);
		creativeSocialMediaAddBoxImpl.setGroupId(groupId);
		creativeSocialMediaAddBoxImpl.setCompanyId(companyId);
		creativeSocialMediaAddBoxImpl.setUserId(userId);

		if (userName == null) {
			creativeSocialMediaAddBoxImpl.setUserName("");
		}
		else {
			creativeSocialMediaAddBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeSocialMediaAddBoxImpl.setCreateDate(null);
		}
		else {
			creativeSocialMediaAddBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeSocialMediaAddBoxImpl.setModifiedDate(null);
		}
		else {
			creativeSocialMediaAddBoxImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (socialMedia == null) {
			creativeSocialMediaAddBoxImpl.setSocialMedia("");
		}
		else {
			creativeSocialMediaAddBoxImpl.setSocialMedia(socialMedia);
		}

		if (profileName == null) {
			creativeSocialMediaAddBoxImpl.setProfileName("");
		}
		else {
			creativeSocialMediaAddBoxImpl.setProfileName(profileName);
		}

		if (counterSocislMedia == null) {
			creativeSocialMediaAddBoxImpl.setCounterSocislMedia("");
		}
		else {
			creativeSocialMediaAddBoxImpl.setCounterSocislMedia(
				counterSocislMedia);
		}

		creativeSocialMediaAddBoxImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeSocialMediaAddBoxImpl.resetOriginalValues();

		return creativeSocialMediaAddBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeSocialBoxId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		socialMedia = objectInput.readUTF();
		profileName = objectInput.readUTF();
		counterSocislMedia = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeSocialBoxId);

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

		if (socialMedia == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(socialMedia);
		}

		if (profileName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(profileName);
		}

		if (counterSocislMedia == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counterSocislMedia);
		}

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeSocialBoxId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String socialMedia;
	public String profileName;
	public String counterSocislMedia;
	public long CreativeApplicationId;

}