/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NotUsedSecurity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NotUsedSecurityCacheModel
	implements CacheModel<NotUsedSecurity>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NotUsedSecurityCacheModel)) {
			return false;
		}

		NotUsedSecurityCacheModel notUsedSecurityCacheModel =
			(NotUsedSecurityCacheModel)object;

		if (notUsedSecurityId == notUsedSecurityCacheModel.notUsedSecurityId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, notUsedSecurityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{notUsedSecurityId=");
		sb.append(notUsedSecurityId);
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
		sb.append(", realProperty=");
		sb.append(realProperty);
		sb.append(", notUsedLocation=");
		sb.append(notUsedLocation);
		sb.append(", notUsedDescription=");
		sb.append(notUsedDescription);
		sb.append(", notUsedCounter=");
		sb.append(notUsedCounter);
		sb.append(", notUsedValue=");
		sb.append(notUsedValue);
		sb.append(", notNetValue=");
		sb.append(notNetValue);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NotUsedSecurity toEntityModel() {
		NotUsedSecurityImpl notUsedSecurityImpl = new NotUsedSecurityImpl();

		notUsedSecurityImpl.setNotUsedSecurityId(notUsedSecurityId);
		notUsedSecurityImpl.setGroupId(groupId);
		notUsedSecurityImpl.setCompanyId(companyId);
		notUsedSecurityImpl.setUserId(userId);

		if (userName == null) {
			notUsedSecurityImpl.setUserName("");
		}
		else {
			notUsedSecurityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			notUsedSecurityImpl.setCreateDate(null);
		}
		else {
			notUsedSecurityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			notUsedSecurityImpl.setModifiedDate(null);
		}
		else {
			notUsedSecurityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (realProperty == null) {
			notUsedSecurityImpl.setRealProperty("");
		}
		else {
			notUsedSecurityImpl.setRealProperty(realProperty);
		}

		if (notUsedLocation == null) {
			notUsedSecurityImpl.setNotUsedLocation("");
		}
		else {
			notUsedSecurityImpl.setNotUsedLocation(notUsedLocation);
		}

		if (notUsedDescription == null) {
			notUsedSecurityImpl.setNotUsedDescription("");
		}
		else {
			notUsedSecurityImpl.setNotUsedDescription(notUsedDescription);
		}

		if (notUsedCounter == null) {
			notUsedSecurityImpl.setNotUsedCounter("");
		}
		else {
			notUsedSecurityImpl.setNotUsedCounter(notUsedCounter);
		}

		if (notUsedValue == null) {
			notUsedSecurityImpl.setNotUsedValue("");
		}
		else {
			notUsedSecurityImpl.setNotUsedValue(notUsedValue);
		}

		if (notNetValue == null) {
			notUsedSecurityImpl.setNotNetValue("");
		}
		else {
			notUsedSecurityImpl.setNotNetValue(notNetValue);
		}

		notUsedSecurityImpl.setOsiInsolvencyId(osiInsolvencyId);

		notUsedSecurityImpl.resetOriginalValues();

		return notUsedSecurityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		notUsedSecurityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		realProperty = objectInput.readUTF();
		notUsedLocation = objectInput.readUTF();
		notUsedDescription = objectInput.readUTF();
		notUsedCounter = objectInput.readUTF();
		notUsedValue = objectInput.readUTF();
		notNetValue = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(notUsedSecurityId);

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

		if (realProperty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(realProperty);
		}

		if (notUsedLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(notUsedLocation);
		}

		if (notUsedDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(notUsedDescription);
		}

		if (notUsedCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(notUsedCounter);
		}

		if (notUsedValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(notUsedValue);
		}

		if (notNetValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(notNetValue);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long notUsedSecurityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String realProperty;
	public String notUsedLocation;
	public String notUsedDescription;
	public String notUsedCounter;
	public String notUsedValue;
	public String notNetValue;
	public long osiInsolvencyId;

}