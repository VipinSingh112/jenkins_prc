/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.collaboration.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.collaboration.services.model.Collobartion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Collobartion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CollobartionCacheModel
	implements CacheModel<Collobartion>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CollobartionCacheModel)) {
			return false;
		}

		CollobartionCacheModel collobartionCacheModel =
			(CollobartionCacheModel)object;

		if (collaborationId == collobartionCacheModel.collaborationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, collaborationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", collaborationId=");
		sb.append(collaborationId);
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
		sb.append(", stageName=");
		sb.append(stageName);
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
	public Collobartion toEntityModel() {
		CollobartionImpl collobartionImpl = new CollobartionImpl();

		if (uuid == null) {
			collobartionImpl.setUuid("");
		}
		else {
			collobartionImpl.setUuid(uuid);
		}

		collobartionImpl.setCollaborationId(collaborationId);
		collobartionImpl.setGroupId(groupId);
		collobartionImpl.setCompanyId(companyId);
		collobartionImpl.setUserId(userId);

		if (userName == null) {
			collobartionImpl.setUserName("");
		}
		else {
			collobartionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			collobartionImpl.setCreateDate(null);
		}
		else {
			collobartionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			collobartionImpl.setModifiedDate(null);
		}
		else {
			collobartionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			collobartionImpl.setStageName("");
		}
		else {
			collobartionImpl.setStageName(stageName);
		}

		if (userType == null) {
			collobartionImpl.setUserType("");
		}
		else {
			collobartionImpl.setUserType(userType);
		}

		if (comment == null) {
			collobartionImpl.setComment("");
		}
		else {
			collobartionImpl.setComment(comment);
		}

		if (status == null) {
			collobartionImpl.setStatus("");
		}
		else {
			collobartionImpl.setStatus(status);
		}

		if (uploadedDocId == null) {
			collobartionImpl.setUploadedDocId("");
		}
		else {
			collobartionImpl.setUploadedDocId(uploadedDocId);
		}

		if (caseId == null) {
			collobartionImpl.setCaseId("");
		}
		else {
			collobartionImpl.setCaseId(caseId);
		}

		if (applicationId == null) {
			collobartionImpl.setApplicationId("");
		}
		else {
			collobartionImpl.setApplicationId(applicationId);
		}

		collobartionImpl.setArchived(archived);

		collobartionImpl.resetOriginalValues();

		return collobartionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		collaborationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		stageName = objectInput.readUTF();
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

		objectOutput.writeLong(collaborationId);

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

		if (stageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stageName);
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
	public long collaborationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String stageName;
	public String userType;
	public String comment;
	public String status;
	public String uploadedDocId;
	public String caseId;
	public String applicationId;
	public int archived;

}