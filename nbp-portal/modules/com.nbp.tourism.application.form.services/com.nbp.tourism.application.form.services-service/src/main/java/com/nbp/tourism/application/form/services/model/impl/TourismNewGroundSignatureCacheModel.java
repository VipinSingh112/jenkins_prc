/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewGroundSignature;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewGroundSignature in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewGroundSignatureCacheModel
	implements CacheModel<TourismNewGroundSignature>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewGroundSignatureCacheModel)) {
			return false;
		}

		TourismNewGroundSignatureCacheModel
			tourismNewGroundSignatureCacheModel =
				(TourismNewGroundSignatureCacheModel)object;

		if (TourismNewGroundSignatureId ==
				tourismNewGroundSignatureCacheModel.
					TourismNewGroundSignatureId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, TourismNewGroundSignatureId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{TourismNewGroundSignatureId=");
		sb.append(TourismNewGroundSignatureId);
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
		sb.append(", groundTransportationDate=");
		sb.append(groundTransportationDate);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewGroundSignature toEntityModel() {
		TourismNewGroundSignatureImpl tourismNewGroundSignatureImpl =
			new TourismNewGroundSignatureImpl();

		tourismNewGroundSignatureImpl.setTourismNewGroundSignatureId(
			TourismNewGroundSignatureId);
		tourismNewGroundSignatureImpl.setGroupId(groupId);
		tourismNewGroundSignatureImpl.setCompanyId(companyId);
		tourismNewGroundSignatureImpl.setUserId(userId);

		if (userName == null) {
			tourismNewGroundSignatureImpl.setUserName("");
		}
		else {
			tourismNewGroundSignatureImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewGroundSignatureImpl.setCreateDate(null);
		}
		else {
			tourismNewGroundSignatureImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewGroundSignatureImpl.setModifiedDate(null);
		}
		else {
			tourismNewGroundSignatureImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (groundTransportationDate == Long.MIN_VALUE) {
			tourismNewGroundSignatureImpl.setGroundTransportationDate(null);
		}
		else {
			tourismNewGroundSignatureImpl.setGroundTransportationDate(
				new Date(groundTransportationDate));
		}

		tourismNewGroundSignatureImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewGroundSignatureImpl.resetOriginalValues();

		return tourismNewGroundSignatureImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		TourismNewGroundSignatureId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		groundTransportationDate = objectInput.readLong();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(TourismNewGroundSignatureId);

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
		objectOutput.writeLong(groundTransportationDate);

		objectOutput.writeLong(tourismApplicationId);
	}

	public long TourismNewGroundSignatureId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long groundTransportationDate;
	public long tourismApplicationId;

}