/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.application.form.services.model.OgtClaimToProperty;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OgtClaimToProperty in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OgtClaimToPropertyCacheModel
	implements CacheModel<OgtClaimToProperty>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OgtClaimToPropertyCacheModel)) {
			return false;
		}

		OgtClaimToPropertyCacheModel ogtClaimToPropertyCacheModel =
			(OgtClaimToPropertyCacheModel)object;

		if (ogtClaimToPropertyId ==
				ogtClaimToPropertyCacheModel.ogtClaimToPropertyId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtClaimToPropertyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{ogtClaimToPropertyId=");
		sb.append(ogtClaimToPropertyId);
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
		sb.append(", propertyDate=");
		sb.append(propertyDate);
		sb.append(", propClaimDesc=");
		sb.append(propClaimDesc);
		sb.append(", affidavitDesc=");
		sb.append(affidavitDesc);
		sb.append(", ogtApplicationId=");
		sb.append(ogtApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OgtClaimToProperty toEntityModel() {
		OgtClaimToPropertyImpl ogtClaimToPropertyImpl =
			new OgtClaimToPropertyImpl();

		ogtClaimToPropertyImpl.setOgtClaimToPropertyId(ogtClaimToPropertyId);
		ogtClaimToPropertyImpl.setGroupId(groupId);
		ogtClaimToPropertyImpl.setCompanyId(companyId);
		ogtClaimToPropertyImpl.setUserId(userId);

		if (userName == null) {
			ogtClaimToPropertyImpl.setUserName("");
		}
		else {
			ogtClaimToPropertyImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtClaimToPropertyImpl.setCreateDate(null);
		}
		else {
			ogtClaimToPropertyImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtClaimToPropertyImpl.setModifiedDate(null);
		}
		else {
			ogtClaimToPropertyImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (propertyDate == Long.MIN_VALUE) {
			ogtClaimToPropertyImpl.setPropertyDate(null);
		}
		else {
			ogtClaimToPropertyImpl.setPropertyDate(new Date(propertyDate));
		}

		if (propClaimDesc == null) {
			ogtClaimToPropertyImpl.setPropClaimDesc("");
		}
		else {
			ogtClaimToPropertyImpl.setPropClaimDesc(propClaimDesc);
		}

		if (affidavitDesc == null) {
			ogtClaimToPropertyImpl.setAffidavitDesc("");
		}
		else {
			ogtClaimToPropertyImpl.setAffidavitDesc(affidavitDesc);
		}

		ogtClaimToPropertyImpl.setOgtApplicationId(ogtApplicationId);

		ogtClaimToPropertyImpl.resetOriginalValues();

		return ogtClaimToPropertyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ogtClaimToPropertyId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		propertyDate = objectInput.readLong();
		propClaimDesc = objectInput.readUTF();
		affidavitDesc = objectInput.readUTF();

		ogtApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ogtClaimToPropertyId);

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
		objectOutput.writeLong(propertyDate);

		if (propClaimDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propClaimDesc);
		}

		if (affidavitDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(affidavitDesc);
		}

		objectOutput.writeLong(ogtApplicationId);
	}

	public long ogtClaimToPropertyId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long propertyDate;
	public String propClaimDesc;
	public String affidavitDesc;
	public long ogtApplicationId;

}