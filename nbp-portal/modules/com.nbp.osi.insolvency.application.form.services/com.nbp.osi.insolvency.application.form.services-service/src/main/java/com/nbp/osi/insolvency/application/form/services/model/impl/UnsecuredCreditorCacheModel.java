/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UnsecuredCreditor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UnsecuredCreditorCacheModel
	implements CacheModel<UnsecuredCreditor>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UnsecuredCreditorCacheModel)) {
			return false;
		}

		UnsecuredCreditorCacheModel unsecuredCreditorCacheModel =
			(UnsecuredCreditorCacheModel)object;

		if (unsecuredCreditorId ==
				unsecuredCreditorCacheModel.unsecuredCreditorId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, unsecuredCreditorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{unsecuredCreditorId=");
		sb.append(unsecuredCreditorId);
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
		sb.append(", unsecuredCreditorName=");
		sb.append(unsecuredCreditorName);
		sb.append(", unsecuredCreditorDebt=");
		sb.append(unsecuredCreditorDebt);
		sb.append(", unsecuredCreditorAmount=");
		sb.append(unsecuredCreditorAmount);
		sb.append(", unsecuredCreditorPayment=");
		sb.append(unsecuredCreditorPayment);
		sb.append(", unsecuredCreditorCounter=");
		sb.append(unsecuredCreditorCounter);
		sb.append(", unsecuredCreditorDate=");
		sb.append(unsecuredCreditorDate);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UnsecuredCreditor toEntityModel() {
		UnsecuredCreditorImpl unsecuredCreditorImpl =
			new UnsecuredCreditorImpl();

		unsecuredCreditorImpl.setUnsecuredCreditorId(unsecuredCreditorId);
		unsecuredCreditorImpl.setGroupId(groupId);
		unsecuredCreditorImpl.setCompanyId(companyId);
		unsecuredCreditorImpl.setUserId(userId);

		if (userName == null) {
			unsecuredCreditorImpl.setUserName("");
		}
		else {
			unsecuredCreditorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			unsecuredCreditorImpl.setCreateDate(null);
		}
		else {
			unsecuredCreditorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			unsecuredCreditorImpl.setModifiedDate(null);
		}
		else {
			unsecuredCreditorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (unsecuredCreditorName == null) {
			unsecuredCreditorImpl.setUnsecuredCreditorName("");
		}
		else {
			unsecuredCreditorImpl.setUnsecuredCreditorName(
				unsecuredCreditorName);
		}

		if (unsecuredCreditorDebt == null) {
			unsecuredCreditorImpl.setUnsecuredCreditorDebt("");
		}
		else {
			unsecuredCreditorImpl.setUnsecuredCreditorDebt(
				unsecuredCreditorDebt);
		}

		if (unsecuredCreditorAmount == null) {
			unsecuredCreditorImpl.setUnsecuredCreditorAmount("");
		}
		else {
			unsecuredCreditorImpl.setUnsecuredCreditorAmount(
				unsecuredCreditorAmount);
		}

		if (unsecuredCreditorPayment == null) {
			unsecuredCreditorImpl.setUnsecuredCreditorPayment("");
		}
		else {
			unsecuredCreditorImpl.setUnsecuredCreditorPayment(
				unsecuredCreditorPayment);
		}

		if (unsecuredCreditorCounter == null) {
			unsecuredCreditorImpl.setUnsecuredCreditorCounter("");
		}
		else {
			unsecuredCreditorImpl.setUnsecuredCreditorCounter(
				unsecuredCreditorCounter);
		}

		if (unsecuredCreditorDate == Long.MIN_VALUE) {
			unsecuredCreditorImpl.setUnsecuredCreditorDate(null);
		}
		else {
			unsecuredCreditorImpl.setUnsecuredCreditorDate(
				new Date(unsecuredCreditorDate));
		}

		unsecuredCreditorImpl.setOsiInsolvencyId(osiInsolvencyId);

		unsecuredCreditorImpl.resetOriginalValues();

		return unsecuredCreditorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		unsecuredCreditorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		unsecuredCreditorName = objectInput.readUTF();
		unsecuredCreditorDebt = objectInput.readUTF();
		unsecuredCreditorAmount = objectInput.readUTF();
		unsecuredCreditorPayment = objectInput.readUTF();
		unsecuredCreditorCounter = objectInput.readUTF();
		unsecuredCreditorDate = objectInput.readLong();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(unsecuredCreditorId);

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

		if (unsecuredCreditorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredCreditorName);
		}

		if (unsecuredCreditorDebt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredCreditorDebt);
		}

		if (unsecuredCreditorAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredCreditorAmount);
		}

		if (unsecuredCreditorPayment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredCreditorPayment);
		}

		if (unsecuredCreditorCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredCreditorCounter);
		}

		objectOutput.writeLong(unsecuredCreditorDate);

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long unsecuredCreditorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String unsecuredCreditorName;
	public String unsecuredCreditorDebt;
	public String unsecuredCreditorAmount;
	public String unsecuredCreditorPayment;
	public String unsecuredCreditorCounter;
	public long unsecuredCreditorDate;
	public long osiInsolvencyId;

}