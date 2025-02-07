/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PreferredCreditor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PreferredCreditorCacheModel
	implements CacheModel<PreferredCreditor>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PreferredCreditorCacheModel)) {
			return false;
		}

		PreferredCreditorCacheModel preferredCreditorCacheModel =
			(PreferredCreditorCacheModel)object;

		if (preferredCreditorId ==
				preferredCreditorCacheModel.preferredCreditorId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, preferredCreditorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{preferredCreditorId=");
		sb.append(preferredCreditorId);
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
		sb.append(", preferredCreditorName=");
		sb.append(preferredCreditorName);
		sb.append(", preferredCreditorLiability=");
		sb.append(preferredCreditorLiability);
		sb.append(", preferredCreditorAmount=");
		sb.append(preferredCreditorAmount);
		sb.append(", preferredCreditorPayment=");
		sb.append(preferredCreditorPayment);
		sb.append(", preferredCreditorCounter=");
		sb.append(preferredCreditorCounter);
		sb.append(", preferredCreditorDate=");
		sb.append(preferredCreditorDate);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PreferredCreditor toEntityModel() {
		PreferredCreditorImpl preferredCreditorImpl =
			new PreferredCreditorImpl();

		preferredCreditorImpl.setPreferredCreditorId(preferredCreditorId);
		preferredCreditorImpl.setGroupId(groupId);
		preferredCreditorImpl.setCompanyId(companyId);
		preferredCreditorImpl.setUserId(userId);

		if (userName == null) {
			preferredCreditorImpl.setUserName("");
		}
		else {
			preferredCreditorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			preferredCreditorImpl.setCreateDate(null);
		}
		else {
			preferredCreditorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			preferredCreditorImpl.setModifiedDate(null);
		}
		else {
			preferredCreditorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (preferredCreditorName == null) {
			preferredCreditorImpl.setPreferredCreditorName("");
		}
		else {
			preferredCreditorImpl.setPreferredCreditorName(
				preferredCreditorName);
		}

		if (preferredCreditorLiability == null) {
			preferredCreditorImpl.setPreferredCreditorLiability("");
		}
		else {
			preferredCreditorImpl.setPreferredCreditorLiability(
				preferredCreditorLiability);
		}

		if (preferredCreditorAmount == null) {
			preferredCreditorImpl.setPreferredCreditorAmount("");
		}
		else {
			preferredCreditorImpl.setPreferredCreditorAmount(
				preferredCreditorAmount);
		}

		if (preferredCreditorPayment == null) {
			preferredCreditorImpl.setPreferredCreditorPayment("");
		}
		else {
			preferredCreditorImpl.setPreferredCreditorPayment(
				preferredCreditorPayment);
		}

		if (preferredCreditorCounter == null) {
			preferredCreditorImpl.setPreferredCreditorCounter("");
		}
		else {
			preferredCreditorImpl.setPreferredCreditorCounter(
				preferredCreditorCounter);
		}

		if (preferredCreditorDate == Long.MIN_VALUE) {
			preferredCreditorImpl.setPreferredCreditorDate(null);
		}
		else {
			preferredCreditorImpl.setPreferredCreditorDate(
				new Date(preferredCreditorDate));
		}

		preferredCreditorImpl.setOsiInsolvencyId(osiInsolvencyId);

		preferredCreditorImpl.resetOriginalValues();

		return preferredCreditorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		preferredCreditorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		preferredCreditorName = objectInput.readUTF();
		preferredCreditorLiability = objectInput.readUTF();
		preferredCreditorAmount = objectInput.readUTF();
		preferredCreditorPayment = objectInput.readUTF();
		preferredCreditorCounter = objectInput.readUTF();
		preferredCreditorDate = objectInput.readLong();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(preferredCreditorId);

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

		if (preferredCreditorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preferredCreditorName);
		}

		if (preferredCreditorLiability == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preferredCreditorLiability);
		}

		if (preferredCreditorAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preferredCreditorAmount);
		}

		if (preferredCreditorPayment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preferredCreditorPayment);
		}

		if (preferredCreditorCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preferredCreditorCounter);
		}

		objectOutput.writeLong(preferredCreditorDate);

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long preferredCreditorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String preferredCreditorName;
	public String preferredCreditorLiability;
	public String preferredCreditorAmount;
	public String preferredCreditorPayment;
	public String preferredCreditorCounter;
	public long preferredCreditorDate;
	public long osiInsolvencyId;

}