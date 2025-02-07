/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabActivitiesDesc in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabActivitiesDescCacheModel
	implements CacheModel<AccMediLabActivitiesDesc>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabActivitiesDescCacheModel)) {
			return false;
		}

		AccMediLabActivitiesDescCacheModel accMediLabActivitiesDescCacheModel =
			(AccMediLabActivitiesDescCacheModel)object;

		if (accMediLabActivitiesDescId ==
				accMediLabActivitiesDescCacheModel.accMediLabActivitiesDescId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabActivitiesDescId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabActivitiesDescId=");
		sb.append(accMediLabActivitiesDescId);
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
		sb.append(", activitiesDescription=");
		sb.append(activitiesDescription);
		sb.append(", shiftWork=");
		sb.append(shiftWork);
		sb.append(", specimenNo=");
		sb.append(specimenNo);
		sb.append(", specimenLocation=");
		sb.append(specimenLocation);
		sb.append(", requestedPOCT=");
		sb.append(requestedPOCT);
		sb.append(", requestedPOCTLocation=");
		sb.append(requestedPOCTLocation);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabActivitiesDesc toEntityModel() {
		AccMediLabActivitiesDescImpl accMediLabActivitiesDescImpl =
			new AccMediLabActivitiesDescImpl();

		if (uuid == null) {
			accMediLabActivitiesDescImpl.setUuid("");
		}
		else {
			accMediLabActivitiesDescImpl.setUuid(uuid);
		}

		accMediLabActivitiesDescImpl.setAccMediLabActivitiesDescId(
			accMediLabActivitiesDescId);
		accMediLabActivitiesDescImpl.setGroupId(groupId);
		accMediLabActivitiesDescImpl.setCompanyId(companyId);
		accMediLabActivitiesDescImpl.setUserId(userId);

		if (userName == null) {
			accMediLabActivitiesDescImpl.setUserName("");
		}
		else {
			accMediLabActivitiesDescImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabActivitiesDescImpl.setCreateDate(null);
		}
		else {
			accMediLabActivitiesDescImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabActivitiesDescImpl.setModifiedDate(null);
		}
		else {
			accMediLabActivitiesDescImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (activitiesDescription == null) {
			accMediLabActivitiesDescImpl.setActivitiesDescription("");
		}
		else {
			accMediLabActivitiesDescImpl.setActivitiesDescription(
				activitiesDescription);
		}

		if (shiftWork == null) {
			accMediLabActivitiesDescImpl.setShiftWork("");
		}
		else {
			accMediLabActivitiesDescImpl.setShiftWork(shiftWork);
		}

		if (specimenNo == null) {
			accMediLabActivitiesDescImpl.setSpecimenNo("");
		}
		else {
			accMediLabActivitiesDescImpl.setSpecimenNo(specimenNo);
		}

		if (specimenLocation == null) {
			accMediLabActivitiesDescImpl.setSpecimenLocation("");
		}
		else {
			accMediLabActivitiesDescImpl.setSpecimenLocation(specimenLocation);
		}

		if (requestedPOCT == null) {
			accMediLabActivitiesDescImpl.setRequestedPOCT("");
		}
		else {
			accMediLabActivitiesDescImpl.setRequestedPOCT(requestedPOCT);
		}

		if (requestedPOCTLocation == null) {
			accMediLabActivitiesDescImpl.setRequestedPOCTLocation("");
		}
		else {
			accMediLabActivitiesDescImpl.setRequestedPOCTLocation(
				requestedPOCTLocation);
		}

		accMediLabActivitiesDescImpl.setJanaacApplicationId(
			janaacApplicationId);

		accMediLabActivitiesDescImpl.resetOriginalValues();

		return accMediLabActivitiesDescImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabActivitiesDescId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		activitiesDescription = objectInput.readUTF();
		shiftWork = objectInput.readUTF();
		specimenNo = objectInput.readUTF();
		specimenLocation = objectInput.readUTF();
		requestedPOCT = objectInput.readUTF();
		requestedPOCTLocation = objectInput.readUTF();

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

		objectOutput.writeLong(accMediLabActivitiesDescId);

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

		if (activitiesDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activitiesDescription);
		}

		if (shiftWork == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shiftWork);
		}

		if (specimenNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specimenNo);
		}

		if (specimenLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specimenLocation);
		}

		if (requestedPOCT == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestedPOCT);
		}

		if (requestedPOCTLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestedPOCTLocation);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabActivitiesDescId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String activitiesDescription;
	public String shiftWork;
	public String specimenNo;
	public String specimenLocation;
	public String requestedPOCT;
	public String requestedPOCTLocation;
	public long janaacApplicationId;

}