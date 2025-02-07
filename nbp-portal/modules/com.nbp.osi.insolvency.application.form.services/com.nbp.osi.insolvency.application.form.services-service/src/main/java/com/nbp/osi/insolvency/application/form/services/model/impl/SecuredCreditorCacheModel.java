/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SecuredCreditor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SecuredCreditorCacheModel
	implements CacheModel<SecuredCreditor>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SecuredCreditorCacheModel)) {
			return false;
		}

		SecuredCreditorCacheModel securedCreditorCacheModel =
			(SecuredCreditorCacheModel)object;

		if (securedCreditorId == securedCreditorCacheModel.securedCreditorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, securedCreditorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{securedCreditorId=");
		sb.append(securedCreditorId);
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
		sb.append(", securedCreditorName=");
		sb.append(securedCreditorName);
		sb.append(", securedCreditorAsset=");
		sb.append(securedCreditorAsset);
		sb.append(", securedCreditorLiability=");
		sb.append(securedCreditorLiability);
		sb.append(", securedCreditorPayment=");
		sb.append(securedCreditorPayment);
		sb.append(", securedCreditorCounter=");
		sb.append(securedCreditorCounter);
		sb.append(", securedCreditorDate=");
		sb.append(securedCreditorDate);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SecuredCreditor toEntityModel() {
		SecuredCreditorImpl securedCreditorImpl = new SecuredCreditorImpl();

		securedCreditorImpl.setSecuredCreditorId(securedCreditorId);
		securedCreditorImpl.setGroupId(groupId);
		securedCreditorImpl.setCompanyId(companyId);
		securedCreditorImpl.setUserId(userId);

		if (userName == null) {
			securedCreditorImpl.setUserName("");
		}
		else {
			securedCreditorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			securedCreditorImpl.setCreateDate(null);
		}
		else {
			securedCreditorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			securedCreditorImpl.setModifiedDate(null);
		}
		else {
			securedCreditorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (securedCreditorName == null) {
			securedCreditorImpl.setSecuredCreditorName("");
		}
		else {
			securedCreditorImpl.setSecuredCreditorName(securedCreditorName);
		}

		if (securedCreditorAsset == null) {
			securedCreditorImpl.setSecuredCreditorAsset("");
		}
		else {
			securedCreditorImpl.setSecuredCreditorAsset(securedCreditorAsset);
		}

		if (securedCreditorLiability == null) {
			securedCreditorImpl.setSecuredCreditorLiability("");
		}
		else {
			securedCreditorImpl.setSecuredCreditorLiability(
				securedCreditorLiability);
		}

		if (securedCreditorPayment == null) {
			securedCreditorImpl.setSecuredCreditorPayment("");
		}
		else {
			securedCreditorImpl.setSecuredCreditorPayment(
				securedCreditorPayment);
		}

		if (securedCreditorCounter == null) {
			securedCreditorImpl.setSecuredCreditorCounter("");
		}
		else {
			securedCreditorImpl.setSecuredCreditorCounter(
				securedCreditorCounter);
		}

		if (securedCreditorDate == Long.MIN_VALUE) {
			securedCreditorImpl.setSecuredCreditorDate(null);
		}
		else {
			securedCreditorImpl.setSecuredCreditorDate(
				new Date(securedCreditorDate));
		}

		securedCreditorImpl.setOsiInsolvencyId(osiInsolvencyId);

		securedCreditorImpl.resetOriginalValues();

		return securedCreditorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		securedCreditorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		securedCreditorName = objectInput.readUTF();
		securedCreditorAsset = objectInput.readUTF();
		securedCreditorLiability = objectInput.readUTF();
		securedCreditorPayment = objectInput.readUTF();
		securedCreditorCounter = objectInput.readUTF();
		securedCreditorDate = objectInput.readLong();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(securedCreditorId);

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

		if (securedCreditorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedCreditorName);
		}

		if (securedCreditorAsset == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedCreditorAsset);
		}

		if (securedCreditorLiability == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedCreditorLiability);
		}

		if (securedCreditorPayment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedCreditorPayment);
		}

		if (securedCreditorCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedCreditorCounter);
		}

		objectOutput.writeLong(securedCreditorDate);

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long securedCreditorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String securedCreditorName;
	public String securedCreditorAsset;
	public String securedCreditorLiability;
	public String securedCreditorPayment;
	public String securedCreditorCounter;
	public long securedCreditorDate;
	public long osiInsolvencyId;

}