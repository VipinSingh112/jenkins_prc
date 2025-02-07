/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsolvencyCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsolvencyCurrentStageCacheModel
	implements CacheModel<OsiInsolvencyCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsolvencyCurrentStageCacheModel)) {
			return false;
		}

		OsiInsolvencyCurrentStageCacheModel
			osiInsolvencyCurrentStageCacheModel =
				(OsiInsolvencyCurrentStageCacheModel)object;

		if (osiInsolvencyCurrentStageId ==
				osiInsolvencyCurrentStageCacheModel.
					osiInsolvencyCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiInsolvencyCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{osiInsolvencyCurrentStageId=");
		sb.append(osiInsolvencyCurrentStageId);
		sb.append(", osiInsolvencyStageId=");
		sb.append(osiInsolvencyStageId);
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
		sb.append(", currentStage=");
		sb.append(currentStage);
		sb.append(", lastFormStage=");
		sb.append(lastFormStage);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInsolvencyCurrentStage toEntityModel() {
		OsiInsolvencyCurrentStageImpl osiInsolvencyCurrentStageImpl =
			new OsiInsolvencyCurrentStageImpl();

		osiInsolvencyCurrentStageImpl.setOsiInsolvencyCurrentStageId(
			osiInsolvencyCurrentStageId);
		osiInsolvencyCurrentStageImpl.setOsiInsolvencyStageId(
			osiInsolvencyStageId);
		osiInsolvencyCurrentStageImpl.setCompanyId(companyId);
		osiInsolvencyCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			osiInsolvencyCurrentStageImpl.setUserName("");
		}
		else {
			osiInsolvencyCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsolvencyCurrentStageImpl.setCreateDate(null);
		}
		else {
			osiInsolvencyCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsolvencyCurrentStageImpl.setModifiedDate(null);
		}
		else {
			osiInsolvencyCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			osiInsolvencyCurrentStageImpl.setCurrentStage("");
		}
		else {
			osiInsolvencyCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStage == null) {
			osiInsolvencyCurrentStageImpl.setLastFormStage("");
		}
		else {
			osiInsolvencyCurrentStageImpl.setLastFormStage(lastFormStage);
		}

		osiInsolvencyCurrentStageImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiInsolvencyCurrentStageImpl.resetOriginalValues();

		return osiInsolvencyCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiInsolvencyCurrentStageId = objectInput.readLong();

		osiInsolvencyStageId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStage = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiInsolvencyCurrentStageId);

		objectOutput.writeLong(osiInsolvencyStageId);

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

		if (currentStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentStage);
		}

		if (lastFormStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormStage);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiInsolvencyCurrentStageId;
	public long osiInsolvencyStageId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStage;
	public long osiInsolvencyId;

}