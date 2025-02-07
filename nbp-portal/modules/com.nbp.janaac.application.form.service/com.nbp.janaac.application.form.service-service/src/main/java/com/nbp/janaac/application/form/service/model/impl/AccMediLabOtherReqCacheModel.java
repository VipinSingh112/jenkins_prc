/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabOtherReq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabOtherReq in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabOtherReqCacheModel
	implements CacheModel<AccMediLabOtherReq>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabOtherReqCacheModel)) {
			return false;
		}

		AccMediLabOtherReqCacheModel accMediLabOtherReqCacheModel =
			(AccMediLabOtherReqCacheModel)object;

		if (accMediLabOtherReqId ==
				accMediLabOtherReqCacheModel.accMediLabOtherReqId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabOtherReqId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabOtherReqId=");
		sb.append(accMediLabOtherReqId);
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
		sb.append(", paymentMethod=");
		sb.append(paymentMethod);
		sb.append(", representativeName=");
		sb.append(representativeName);
		sb.append(", representativePos=");
		sb.append(representativePos);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabOtherReq toEntityModel() {
		AccMediLabOtherReqImpl accMediLabOtherReqImpl =
			new AccMediLabOtherReqImpl();

		if (uuid == null) {
			accMediLabOtherReqImpl.setUuid("");
		}
		else {
			accMediLabOtherReqImpl.setUuid(uuid);
		}

		accMediLabOtherReqImpl.setAccMediLabOtherReqId(accMediLabOtherReqId);
		accMediLabOtherReqImpl.setGroupId(groupId);
		accMediLabOtherReqImpl.setCompanyId(companyId);
		accMediLabOtherReqImpl.setUserId(userId);

		if (userName == null) {
			accMediLabOtherReqImpl.setUserName("");
		}
		else {
			accMediLabOtherReqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabOtherReqImpl.setCreateDate(null);
		}
		else {
			accMediLabOtherReqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabOtherReqImpl.setModifiedDate(null);
		}
		else {
			accMediLabOtherReqImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			accMediLabOtherReqImpl.setPaymentMethod("");
		}
		else {
			accMediLabOtherReqImpl.setPaymentMethod(paymentMethod);
		}

		if (representativeName == null) {
			accMediLabOtherReqImpl.setRepresentativeName("");
		}
		else {
			accMediLabOtherReqImpl.setRepresentativeName(representativeName);
		}

		if (representativePos == null) {
			accMediLabOtherReqImpl.setRepresentativePos("");
		}
		else {
			accMediLabOtherReqImpl.setRepresentativePos(representativePos);
		}

		if (signDate == Long.MIN_VALUE) {
			accMediLabOtherReqImpl.setSignDate(null);
		}
		else {
			accMediLabOtherReqImpl.setSignDate(new Date(signDate));
		}

		accMediLabOtherReqImpl.setJanaacApplicationId(janaacApplicationId);

		accMediLabOtherReqImpl.resetOriginalValues();

		return accMediLabOtherReqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabOtherReqId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		paymentMethod = objectInput.readUTF();
		representativeName = objectInput.readUTF();
		representativePos = objectInput.readUTF();
		signDate = objectInput.readLong();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accMediLabOtherReqId);

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

		if (paymentMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentMethod);
		}

		if (representativeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(representativeName);
		}

		if (representativePos == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(representativePos);
		}

		objectOutput.writeLong(signDate);

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabOtherReqId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String paymentMethod;
	public String representativeName;
	public String representativePos;
	public long signDate;
	public long janaacApplicationId;

}