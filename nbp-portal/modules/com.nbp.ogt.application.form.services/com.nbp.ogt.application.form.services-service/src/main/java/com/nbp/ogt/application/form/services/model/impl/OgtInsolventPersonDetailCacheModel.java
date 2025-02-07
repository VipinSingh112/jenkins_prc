/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OgtInsolventPersonDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OgtInsolventPersonDetailCacheModel
	implements CacheModel<OgtInsolventPersonDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OgtInsolventPersonDetailCacheModel)) {
			return false;
		}

		OgtInsolventPersonDetailCacheModel ogtInsolventPersonDetailCacheModel =
			(OgtInsolventPersonDetailCacheModel)object;

		if (ogtInsolventPersonDetailId ==
				ogtInsolventPersonDetailCacheModel.ogtInsolventPersonDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtInsolventPersonDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{ogtInsolventPersonDetailId=");
		sb.append(ogtInsolventPersonDetailId);
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
		sb.append(", natureOfInsolvent=");
		sb.append(natureOfInsolvent);
		sb.append(", insolventFirstName=");
		sb.append(insolventFirstName);
		sb.append(", insolventLastName=");
		sb.append(insolventLastName);
		sb.append(", insolventCompanyName=");
		sb.append(insolventCompanyName);
		sb.append(", insolventDebtStatute=");
		sb.append(insolventDebtStatute);
		sb.append(", ogtApplicationId=");
		sb.append(ogtApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OgtInsolventPersonDetail toEntityModel() {
		OgtInsolventPersonDetailImpl ogtInsolventPersonDetailImpl =
			new OgtInsolventPersonDetailImpl();

		ogtInsolventPersonDetailImpl.setOgtInsolventPersonDetailId(
			ogtInsolventPersonDetailId);
		ogtInsolventPersonDetailImpl.setGroupId(groupId);
		ogtInsolventPersonDetailImpl.setCompanyId(companyId);
		ogtInsolventPersonDetailImpl.setUserId(userId);

		if (userName == null) {
			ogtInsolventPersonDetailImpl.setUserName("");
		}
		else {
			ogtInsolventPersonDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtInsolventPersonDetailImpl.setCreateDate(null);
		}
		else {
			ogtInsolventPersonDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtInsolventPersonDetailImpl.setModifiedDate(null);
		}
		else {
			ogtInsolventPersonDetailImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (natureOfInsolvent == null) {
			ogtInsolventPersonDetailImpl.setNatureOfInsolvent("");
		}
		else {
			ogtInsolventPersonDetailImpl.setNatureOfInsolvent(
				natureOfInsolvent);
		}

		if (insolventFirstName == null) {
			ogtInsolventPersonDetailImpl.setInsolventFirstName("");
		}
		else {
			ogtInsolventPersonDetailImpl.setInsolventFirstName(
				insolventFirstName);
		}

		if (insolventLastName == null) {
			ogtInsolventPersonDetailImpl.setInsolventLastName("");
		}
		else {
			ogtInsolventPersonDetailImpl.setInsolventLastName(
				insolventLastName);
		}

		if (insolventCompanyName == null) {
			ogtInsolventPersonDetailImpl.setInsolventCompanyName("");
		}
		else {
			ogtInsolventPersonDetailImpl.setInsolventCompanyName(
				insolventCompanyName);
		}

		if (insolventDebtStatute == null) {
			ogtInsolventPersonDetailImpl.setInsolventDebtStatute("");
		}
		else {
			ogtInsolventPersonDetailImpl.setInsolventDebtStatute(
				insolventDebtStatute);
		}

		ogtInsolventPersonDetailImpl.setOgtApplicationId(ogtApplicationId);

		ogtInsolventPersonDetailImpl.resetOriginalValues();

		return ogtInsolventPersonDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ogtInsolventPersonDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		natureOfInsolvent = objectInput.readUTF();
		insolventFirstName = objectInput.readUTF();
		insolventLastName = objectInput.readUTF();
		insolventCompanyName = objectInput.readUTF();
		insolventDebtStatute = objectInput.readUTF();

		ogtApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ogtInsolventPersonDetailId);

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

		if (natureOfInsolvent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(natureOfInsolvent);
		}

		if (insolventFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventFirstName);
		}

		if (insolventLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventLastName);
		}

		if (insolventCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventCompanyName);
		}

		if (insolventDebtStatute == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventDebtStatute);
		}

		objectOutput.writeLong(ogtApplicationId);
	}

	public long ogtInsolventPersonDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String natureOfInsolvent;
	public String insolventFirstName;
	public String insolventLastName;
	public String insolventCompanyName;
	public String insolventDebtStatute;
	public long ogtApplicationId;

}