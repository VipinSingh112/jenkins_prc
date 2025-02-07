/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.stages.services.model.TourismDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismDeskVerificationCacheModel
	implements CacheModel<TourismDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismDeskVerificationCacheModel)) {
			return false;
		}

		TourismDeskVerificationCacheModel tourismDeskVerificationCacheModel =
			(TourismDeskVerificationCacheModel)object;

		if (tourismDeskVeriId ==
				tourismDeskVerificationCacheModel.tourismDeskVeriId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismDeskVeriId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{tourismDeskVeriId=");
		sb.append(tourismDeskVeriId);
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
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append(", documentStatus=");
		sb.append(documentStatus);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismDeskVerification toEntityModel() {
		TourismDeskVerificationImpl tourismDeskVerificationImpl =
			new TourismDeskVerificationImpl();

		tourismDeskVerificationImpl.setTourismDeskVeriId(tourismDeskVeriId);
		tourismDeskVerificationImpl.setGroupId(groupId);
		tourismDeskVerificationImpl.setCompanyId(companyId);
		tourismDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			tourismDeskVerificationImpl.setUserName("");
		}
		else {
			tourismDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismDeskVerificationImpl.setCreateDate(null);
		}
		else {
			tourismDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			tourismDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		tourismDeskVerificationImpl.setTourismApplicationId(
			tourismApplicationId);

		if (documentStatus == null) {
			tourismDeskVerificationImpl.setDocumentStatus("");
		}
		else {
			tourismDeskVerificationImpl.setDocumentStatus(documentStatus);
		}

		if (documentName == null) {
			tourismDeskVerificationImpl.setDocumentName("");
		}
		else {
			tourismDeskVerificationImpl.setDocumentName(documentName);
		}

		tourismDeskVerificationImpl.resetOriginalValues();

		return tourismDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismDeskVeriId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		tourismApplicationId = objectInput.readLong();
		documentStatus = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismDeskVeriId);

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

		objectOutput.writeLong(tourismApplicationId);

		if (documentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentStatus);
		}

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}
	}

	public long tourismDeskVeriId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long tourismApplicationId;
	public String documentStatus;
	public String documentName;

}