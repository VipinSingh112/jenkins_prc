/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusWorkFromHome in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusWorkFromHomeCacheModel
	implements CacheModel<SezStatusWorkFromHome>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusWorkFromHomeCacheModel)) {
			return false;
		}

		SezStatusWorkFromHomeCacheModel sezStatusWorkFromHomeCacheModel =
			(SezStatusWorkFromHomeCacheModel)object;

		if (sezStatusWorkFromHomeId ==
				sezStatusWorkFromHomeCacheModel.sezStatusWorkFromHomeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStatusWorkFromHomeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{sezStatusWorkFromHomeId=");
		sb.append(sezStatusWorkFromHomeId);
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
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", contactPersonName=");
		sb.append(contactPersonName);
		sb.append(", contactPersonEmail=");
		sb.append(contactPersonEmail);
		sb.append(", controlNumber=");
		sb.append(controlNumber);
		sb.append(", workerUtilizingIncentive=");
		sb.append(workerUtilizingIncentive);
		sb.append(", workerUtilizingIncentiveMonth=");
		sb.append(workerUtilizingIncentiveMonth);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusWorkFromHome toEntityModel() {
		SezStatusWorkFromHomeImpl sezStatusWorkFromHomeImpl =
			new SezStatusWorkFromHomeImpl();

		sezStatusWorkFromHomeImpl.setSezStatusWorkFromHomeId(
			sezStatusWorkFromHomeId);
		sezStatusWorkFromHomeImpl.setGroupId(groupId);
		sezStatusWorkFromHomeImpl.setCompanyId(companyId);
		sezStatusWorkFromHomeImpl.setUserId(userId);

		if (userName == null) {
			sezStatusWorkFromHomeImpl.setUserName("");
		}
		else {
			sezStatusWorkFromHomeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusWorkFromHomeImpl.setCreateDate(null);
		}
		else {
			sezStatusWorkFromHomeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusWorkFromHomeImpl.setModifiedDate(null);
		}
		else {
			sezStatusWorkFromHomeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyName == null) {
			sezStatusWorkFromHomeImpl.setCompanyName("");
		}
		else {
			sezStatusWorkFromHomeImpl.setCompanyName(companyName);
		}

		if (contactPersonName == null) {
			sezStatusWorkFromHomeImpl.setContactPersonName("");
		}
		else {
			sezStatusWorkFromHomeImpl.setContactPersonName(contactPersonName);
		}

		if (contactPersonEmail == null) {
			sezStatusWorkFromHomeImpl.setContactPersonEmail("");
		}
		else {
			sezStatusWorkFromHomeImpl.setContactPersonEmail(contactPersonEmail);
		}

		if (controlNumber == null) {
			sezStatusWorkFromHomeImpl.setControlNumber("");
		}
		else {
			sezStatusWorkFromHomeImpl.setControlNumber(controlNumber);
		}

		if (workerUtilizingIncentive == null) {
			sezStatusWorkFromHomeImpl.setWorkerUtilizingIncentive("");
		}
		else {
			sezStatusWorkFromHomeImpl.setWorkerUtilizingIncentive(
				workerUtilizingIncentive);
		}

		if (workerUtilizingIncentiveMonth == null) {
			sezStatusWorkFromHomeImpl.setWorkerUtilizingIncentiveMonth("");
		}
		else {
			sezStatusWorkFromHomeImpl.setWorkerUtilizingIncentiveMonth(
				workerUtilizingIncentiveMonth);
		}

		sezStatusWorkFromHomeImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezStatusWorkFromHomeImpl.resetOriginalValues();

		return sezStatusWorkFromHomeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezStatusWorkFromHomeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		contactPersonName = objectInput.readUTF();
		contactPersonEmail = objectInput.readUTF();
		controlNumber = objectInput.readUTF();
		workerUtilizingIncentive = objectInput.readUTF();
		workerUtilizingIncentiveMonth = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezStatusWorkFromHomeId);

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

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (contactPersonName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPersonName);
		}

		if (contactPersonEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPersonEmail);
		}

		if (controlNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(controlNumber);
		}

		if (workerUtilizingIncentive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workerUtilizingIncentive);
		}

		if (workerUtilizingIncentiveMonth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workerUtilizingIncentiveMonth);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezStatusWorkFromHomeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String contactPersonName;
	public String contactPersonEmail;
	public String controlNumber;
	public String workerUtilizingIncentive;
	public String workerUtilizingIncentiveMonth;
	public long sezStatusApplicationId;

}