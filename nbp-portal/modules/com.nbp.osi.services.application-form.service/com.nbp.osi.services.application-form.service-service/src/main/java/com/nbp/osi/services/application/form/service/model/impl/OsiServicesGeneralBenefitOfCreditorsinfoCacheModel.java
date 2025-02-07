/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesGeneralBenefitOfCreditorsinfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesGeneralBenefitOfCreditorsinfoCacheModel
	implements CacheModel<OsiServicesGeneralBenefitOfCreditorsinfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				OsiServicesGeneralBenefitOfCreditorsinfoCacheModel)) {

			return false;
		}

		OsiServicesGeneralBenefitOfCreditorsinfoCacheModel
			osiServicesGeneralBenefitOfCreditorsinfoCacheModel =
				(OsiServicesGeneralBenefitOfCreditorsinfoCacheModel)object;

		if (osiBOCInsoId ==
				osiServicesGeneralBenefitOfCreditorsinfoCacheModel.
					osiBOCInsoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiBOCInsoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiBOCInsoId=");
		sb.append(osiBOCInsoId);
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
		sb.append(", creditorName=");
		sb.append(creditorName);
		sb.append(", creditorDate=");
		sb.append(creditorDate);
		sb.append(", creditorAddress=");
		sb.append(creditorAddress);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo toEntityModel() {
		OsiServicesGeneralBenefitOfCreditorsinfoImpl
			osiServicesGeneralBenefitOfCreditorsinfoImpl =
				new OsiServicesGeneralBenefitOfCreditorsinfoImpl();

		if (uuid == null) {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setUuid("");
		}
		else {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setUuid(uuid);
		}

		osiServicesGeneralBenefitOfCreditorsinfoImpl.setOsiBOCInsoId(
			osiBOCInsoId);
		osiServicesGeneralBenefitOfCreditorsinfoImpl.setGroupId(groupId);
		osiServicesGeneralBenefitOfCreditorsinfoImpl.setCompanyId(companyId);
		osiServicesGeneralBenefitOfCreditorsinfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setUserName("");
		}
		else {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setCreateDate(null);
		}
		else {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setModifiedDate(null);
		}
		else {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (creditorName == null) {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setCreditorName("");
		}
		else {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setCreditorName(
				creditorName);
		}

		if (creditorDate == Long.MIN_VALUE) {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setCreditorDate(null);
		}
		else {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setCreditorDate(
				new Date(creditorDate));
		}

		if (creditorAddress == null) {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setCreditorAddress("");
		}
		else {
			osiServicesGeneralBenefitOfCreditorsinfoImpl.setCreditorAddress(
				creditorAddress);
		}

		osiServicesGeneralBenefitOfCreditorsinfoImpl.
			setOsiServicesApplicationId(osiServicesApplicationId);

		osiServicesGeneralBenefitOfCreditorsinfoImpl.resetOriginalValues();

		return osiServicesGeneralBenefitOfCreditorsinfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiBOCInsoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		creditorName = objectInput.readUTF();
		creditorDate = objectInput.readLong();
		creditorAddress = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(osiBOCInsoId);

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

		if (creditorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(creditorName);
		}

		objectOutput.writeLong(creditorDate);

		if (creditorAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(creditorAddress);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osiBOCInsoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String creditorName;
	public long creditorDate;
	public String creditorAddress;
	public long osiServicesApplicationId;

}