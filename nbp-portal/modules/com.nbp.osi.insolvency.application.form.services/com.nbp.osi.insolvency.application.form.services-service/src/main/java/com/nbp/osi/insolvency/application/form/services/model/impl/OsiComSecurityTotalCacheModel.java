/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiComSecurityTotal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiComSecurityTotal in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiComSecurityTotalCacheModel
	implements CacheModel<OsiComSecurityTotal>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiComSecurityTotalCacheModel)) {
			return false;
		}

		OsiComSecurityTotalCacheModel osiComSecurityTotalCacheModel =
			(OsiComSecurityTotalCacheModel)object;

		if (osiComSecurityTotalId ==
				osiComSecurityTotalCacheModel.osiComSecurityTotalId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiComSecurityTotalId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{osiComSecurityTotalId=");
		sb.append(osiComSecurityTotalId);
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
		sb.append(", comSecuritTotal=");
		sb.append(comSecuritTotal);
		sb.append(", comAssetTotal=");
		sb.append(comAssetTotal);
		sb.append(", comSecuritTotalValue=");
		sb.append(comSecuritTotalValue);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiComSecurityTotal toEntityModel() {
		OsiComSecurityTotalImpl osiComSecurityTotalImpl =
			new OsiComSecurityTotalImpl();

		osiComSecurityTotalImpl.setOsiComSecurityTotalId(osiComSecurityTotalId);
		osiComSecurityTotalImpl.setGroupId(groupId);
		osiComSecurityTotalImpl.setCompanyId(companyId);
		osiComSecurityTotalImpl.setUserId(userId);

		if (userName == null) {
			osiComSecurityTotalImpl.setUserName("");
		}
		else {
			osiComSecurityTotalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiComSecurityTotalImpl.setCreateDate(null);
		}
		else {
			osiComSecurityTotalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiComSecurityTotalImpl.setModifiedDate(null);
		}
		else {
			osiComSecurityTotalImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (comSecuritTotal == null) {
			osiComSecurityTotalImpl.setComSecuritTotal("");
		}
		else {
			osiComSecurityTotalImpl.setComSecuritTotal(comSecuritTotal);
		}

		if (comAssetTotal == null) {
			osiComSecurityTotalImpl.setComAssetTotal("");
		}
		else {
			osiComSecurityTotalImpl.setComAssetTotal(comAssetTotal);
		}

		if (comSecuritTotalValue == null) {
			osiComSecurityTotalImpl.setComSecuritTotalValue("");
		}
		else {
			osiComSecurityTotalImpl.setComSecuritTotalValue(
				comSecuritTotalValue);
		}

		osiComSecurityTotalImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiComSecurityTotalImpl.resetOriginalValues();

		return osiComSecurityTotalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiComSecurityTotalId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		comSecuritTotal = objectInput.readUTF();
		comAssetTotal = objectInput.readUTF();
		comSecuritTotalValue = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiComSecurityTotalId);

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

		if (comSecuritTotal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comSecuritTotal);
		}

		if (comAssetTotal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comAssetTotal);
		}

		if (comSecuritTotalValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comSecuritTotalValue);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiComSecurityTotalId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String comSecuritTotal;
	public String comAssetTotal;
	public String comSecuritTotalValue;
	public long osiInsolvencyId;

}