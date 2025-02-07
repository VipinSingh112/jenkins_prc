/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundPaymentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaGroundPaymentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaGroundPaymentInfoCacheModel
	implements CacheModel<TourismBonaGroundPaymentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaGroundPaymentInfoCacheModel)) {
			return false;
		}

		TourismBonaGroundPaymentInfoCacheModel
			tourismBonaGroundPaymentInfoCacheModel =
				(TourismBonaGroundPaymentInfoCacheModel)object;

		if (tourismBonaGroundPayId ==
				tourismBonaGroundPaymentInfoCacheModel.tourismBonaGroundPayId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaGroundPayId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismBonaGroundPayId=");
		sb.append(tourismBonaGroundPayId);
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
		sb.append(", paymentOtherMethod=");
		sb.append(paymentOtherMethod);
		sb.append(", paymentProof=");
		sb.append(paymentProof);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaGroundPaymentInfo toEntityModel() {
		TourismBonaGroundPaymentInfoImpl tourismBonaGroundPaymentInfoImpl =
			new TourismBonaGroundPaymentInfoImpl();

		tourismBonaGroundPaymentInfoImpl.setTourismBonaGroundPayId(
			tourismBonaGroundPayId);
		tourismBonaGroundPaymentInfoImpl.setGroupId(groupId);
		tourismBonaGroundPaymentInfoImpl.setCompanyId(companyId);
		tourismBonaGroundPaymentInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaGroundPaymentInfoImpl.setUserName("");
		}
		else {
			tourismBonaGroundPaymentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaGroundPaymentInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaGroundPaymentInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaGroundPaymentInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaGroundPaymentInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (paymentMethod == null) {
			tourismBonaGroundPaymentInfoImpl.setPaymentMethod("");
		}
		else {
			tourismBonaGroundPaymentInfoImpl.setPaymentMethod(paymentMethod);
		}

		if (paymentOtherMethod == null) {
			tourismBonaGroundPaymentInfoImpl.setPaymentOtherMethod("");
		}
		else {
			tourismBonaGroundPaymentInfoImpl.setPaymentOtherMethod(
				paymentOtherMethod);
		}

		if (paymentProof == null) {
			tourismBonaGroundPaymentInfoImpl.setPaymentProof("");
		}
		else {
			tourismBonaGroundPaymentInfoImpl.setPaymentProof(paymentProof);
		}

		tourismBonaGroundPaymentInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaGroundPaymentInfoImpl.resetOriginalValues();

		return tourismBonaGroundPaymentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaGroundPayId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		paymentMethod = objectInput.readUTF();
		paymentOtherMethod = objectInput.readUTF();
		paymentProof = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaGroundPayId);

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

		if (paymentOtherMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentOtherMethod);
		}

		if (paymentProof == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentProof);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaGroundPayId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String paymentMethod;
	public String paymentOtherMethod;
	public String paymentProof;
	public long tourismApplicationId;

}