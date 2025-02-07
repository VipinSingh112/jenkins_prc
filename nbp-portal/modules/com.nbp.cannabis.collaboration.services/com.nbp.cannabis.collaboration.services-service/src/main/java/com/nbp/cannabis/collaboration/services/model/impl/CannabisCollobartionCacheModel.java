/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.collaboration.services.model.CannabisCollobartion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisCollobartion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisCollobartionCacheModel
	implements CacheModel<CannabisCollobartion>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisCollobartionCacheModel)) {
			return false;
		}

		CannabisCollobartionCacheModel cannabisCollobartionCacheModel =
			(CannabisCollobartionCacheModel)object;

		if (cannabisCollaborationId ==
				cannabisCollobartionCacheModel.cannabisCollaborationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisCollaborationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cannabisCollaborationId=");
		sb.append(cannabisCollaborationId);
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
		sb.append(", cannabisStage=");
		sb.append(cannabisStage);
		sb.append(", userType=");
		sb.append(userType);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", status=");
		sb.append(status);
		sb.append(", uploadedDocId=");
		sb.append(uploadedDocId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", applicationId=");
		sb.append(applicationId);
		sb.append(", archived=");
		sb.append(archived);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisCollobartion toEntityModel() {
		CannabisCollobartionImpl cannabisCollobartionImpl =
			new CannabisCollobartionImpl();

		if (uuid == null) {
			cannabisCollobartionImpl.setUuid("");
		}
		else {
			cannabisCollobartionImpl.setUuid(uuid);
		}

		cannabisCollobartionImpl.setCannabisCollaborationId(
			cannabisCollaborationId);
		cannabisCollobartionImpl.setGroupId(groupId);
		cannabisCollobartionImpl.setCompanyId(companyId);
		cannabisCollobartionImpl.setUserId(userId);

		if (userName == null) {
			cannabisCollobartionImpl.setUserName("");
		}
		else {
			cannabisCollobartionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisCollobartionImpl.setCreateDate(null);
		}
		else {
			cannabisCollobartionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisCollobartionImpl.setModifiedDate(null);
		}
		else {
			cannabisCollobartionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (cannabisStage == null) {
			cannabisCollobartionImpl.setCannabisStage("");
		}
		else {
			cannabisCollobartionImpl.setCannabisStage(cannabisStage);
		}

		if (userType == null) {
			cannabisCollobartionImpl.setUserType("");
		}
		else {
			cannabisCollobartionImpl.setUserType(userType);
		}

		if (comment == null) {
			cannabisCollobartionImpl.setComment("");
		}
		else {
			cannabisCollobartionImpl.setComment(comment);
		}

		if (status == null) {
			cannabisCollobartionImpl.setStatus("");
		}
		else {
			cannabisCollobartionImpl.setStatus(status);
		}

		if (uploadedDocId == null) {
			cannabisCollobartionImpl.setUploadedDocId("");
		}
		else {
			cannabisCollobartionImpl.setUploadedDocId(uploadedDocId);
		}

		if (caseId == null) {
			cannabisCollobartionImpl.setCaseId("");
		}
		else {
			cannabisCollobartionImpl.setCaseId(caseId);
		}

		if (applicationId == null) {
			cannabisCollobartionImpl.setApplicationId("");
		}
		else {
			cannabisCollobartionImpl.setApplicationId(applicationId);
		}

		cannabisCollobartionImpl.setArchived(archived);

		cannabisCollobartionImpl.resetOriginalValues();

		return cannabisCollobartionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cannabisCollaborationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		cannabisStage = objectInput.readUTF();
		userType = objectInput.readUTF();
		comment = objectInput.readUTF();
		status = objectInput.readUTF();
		uploadedDocId = objectInput.readUTF();
		caseId = objectInput.readUTF();
		applicationId = objectInput.readUTF();

		archived = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(cannabisCollaborationId);

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

		if (cannabisStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cannabisStage);
		}

		if (userType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userType);
		}

		if (comment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comment);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (uploadedDocId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uploadedDocId);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (applicationId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationId);
		}

		objectOutput.writeInt(archived);
	}

	public String uuid;
	public long cannabisCollaborationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String cannabisStage;
	public String userType;
	public String comment;
	public String status;
	public String uploadedDocId;
	public String caseId;
	public String applicationId;
	public int archived;

}