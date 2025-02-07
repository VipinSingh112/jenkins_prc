/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.GrandTotal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing GrandTotal in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GrandTotalCacheModel
	implements CacheModel<GrandTotal>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GrandTotalCacheModel)) {
			return false;
		}

		GrandTotalCacheModel grandTotalCacheModel =
			(GrandTotalCacheModel)object;

		if (grandTotalId == grandTotalCacheModel.grandTotalId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, grandTotalId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{grandTotalId=");
		sb.append(grandTotalId);
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
		sb.append(", totalSecuredLiabilities=");
		sb.append(totalSecuredLiabilities);
		sb.append(", securedTotalMonthlyPayments=");
		sb.append(securedTotalMonthlyPayments);
		sb.append(", totalPreferredLiabilities=");
		sb.append(totalPreferredLiabilities);
		sb.append(", preferredTotalMonthlyPayments=");
		sb.append(preferredTotalMonthlyPayments);
		sb.append(", totalUnsecuredLiabilities=");
		sb.append(totalUnsecuredLiabilities);
		sb.append(", unsecuredTotalMonthlyPayments=");
		sb.append(unsecuredTotalMonthlyPayments);
		sb.append(", grandTotal=");
		sb.append(grandTotal);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GrandTotal toEntityModel() {
		GrandTotalImpl grandTotalImpl = new GrandTotalImpl();

		grandTotalImpl.setGrandTotalId(grandTotalId);
		grandTotalImpl.setGroupId(groupId);
		grandTotalImpl.setCompanyId(companyId);
		grandTotalImpl.setUserId(userId);

		if (userName == null) {
			grandTotalImpl.setUserName("");
		}
		else {
			grandTotalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			grandTotalImpl.setCreateDate(null);
		}
		else {
			grandTotalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			grandTotalImpl.setModifiedDate(null);
		}
		else {
			grandTotalImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (totalSecuredLiabilities == null) {
			grandTotalImpl.setTotalSecuredLiabilities("");
		}
		else {
			grandTotalImpl.setTotalSecuredLiabilities(totalSecuredLiabilities);
		}

		if (securedTotalMonthlyPayments == null) {
			grandTotalImpl.setSecuredTotalMonthlyPayments("");
		}
		else {
			grandTotalImpl.setSecuredTotalMonthlyPayments(
				securedTotalMonthlyPayments);
		}

		if (totalPreferredLiabilities == null) {
			grandTotalImpl.setTotalPreferredLiabilities("");
		}
		else {
			grandTotalImpl.setTotalPreferredLiabilities(
				totalPreferredLiabilities);
		}

		if (preferredTotalMonthlyPayments == null) {
			grandTotalImpl.setPreferredTotalMonthlyPayments("");
		}
		else {
			grandTotalImpl.setPreferredTotalMonthlyPayments(
				preferredTotalMonthlyPayments);
		}

		if (totalUnsecuredLiabilities == null) {
			grandTotalImpl.setTotalUnsecuredLiabilities("");
		}
		else {
			grandTotalImpl.setTotalUnsecuredLiabilities(
				totalUnsecuredLiabilities);
		}

		if (unsecuredTotalMonthlyPayments == null) {
			grandTotalImpl.setUnsecuredTotalMonthlyPayments("");
		}
		else {
			grandTotalImpl.setUnsecuredTotalMonthlyPayments(
				unsecuredTotalMonthlyPayments);
		}

		if (grandTotal == null) {
			grandTotalImpl.setGrandTotal("");
		}
		else {
			grandTotalImpl.setGrandTotal(grandTotal);
		}

		grandTotalImpl.setOsiInsolvencyId(osiInsolvencyId);

		grandTotalImpl.resetOriginalValues();

		return grandTotalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		grandTotalId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		totalSecuredLiabilities = objectInput.readUTF();
		securedTotalMonthlyPayments = objectInput.readUTF();
		totalPreferredLiabilities = objectInput.readUTF();
		preferredTotalMonthlyPayments = objectInput.readUTF();
		totalUnsecuredLiabilities = objectInput.readUTF();
		unsecuredTotalMonthlyPayments = objectInput.readUTF();
		grandTotal = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(grandTotalId);

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

		if (totalSecuredLiabilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalSecuredLiabilities);
		}

		if (securedTotalMonthlyPayments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedTotalMonthlyPayments);
		}

		if (totalPreferredLiabilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalPreferredLiabilities);
		}

		if (preferredTotalMonthlyPayments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(preferredTotalMonthlyPayments);
		}

		if (totalUnsecuredLiabilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalUnsecuredLiabilities);
		}

		if (unsecuredTotalMonthlyPayments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredTotalMonthlyPayments);
		}

		if (grandTotal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(grandTotal);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long grandTotalId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String totalSecuredLiabilities;
	public String securedTotalMonthlyPayments;
	public String totalPreferredLiabilities;
	public String preferredTotalMonthlyPayments;
	public String totalUnsecuredLiabilities;
	public String unsecuredTotalMonthlyPayments;
	public String grandTotal;
	public long osiInsolvencyId;

}