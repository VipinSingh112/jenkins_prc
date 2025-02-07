/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.RadionuclideInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RadionuclideInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RadionuclideInfoCacheModel
	implements CacheModel<RadionuclideInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RadionuclideInfoCacheModel)) {
			return false;
		}

		RadionuclideInfoCacheModel radionuclideInfoCacheModel =
			(RadionuclideInfoCacheModel)object;

		if (radionuclideInfoId ==
				radionuclideInfoCacheModel.radionuclideInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, radionuclideInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{radionuclideInfoId=");
		sb.append(radionuclideInfoId);
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
		sb.append(", radionuclideDetails=");
		sb.append(radionuclideDetails);
		sb.append(", activityDetails=");
		sb.append(activityDetails);
		sb.append(", activityDetailBq=");
		sb.append(activityDetailBq);
		sb.append(", activityDate=");
		sb.append(activityDate);
		sb.append(", chemicalDetailsForm=");
		sb.append(chemicalDetailsForm);
		sb.append(", serialNo=");
		sb.append(serialNo);
		sb.append(", sealedSource=");
		sb.append(sealedSource);
		sb.append(", manufacturerDetails=");
		sb.append(manufacturerDetails);
		sb.append(", modelNo=");
		sb.append(modelNo);
		sb.append(", identificationNo=");
		sb.append(identificationNo);
		sb.append(", statusDetails=");
		sb.append(statusDetails);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RadionuclideInfo toEntityModel() {
		RadionuclideInfoImpl radionuclideInfoImpl = new RadionuclideInfoImpl();

		radionuclideInfoImpl.setRadionuclideInfoId(radionuclideInfoId);
		radionuclideInfoImpl.setGroupId(groupId);
		radionuclideInfoImpl.setCompanyId(companyId);
		radionuclideInfoImpl.setUserId(userId);

		if (userName == null) {
			radionuclideInfoImpl.setUserName("");
		}
		else {
			radionuclideInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			radionuclideInfoImpl.setCreateDate(null);
		}
		else {
			radionuclideInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			radionuclideInfoImpl.setModifiedDate(null);
		}
		else {
			radionuclideInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (radionuclideDetails == null) {
			radionuclideInfoImpl.setRadionuclideDetails("");
		}
		else {
			radionuclideInfoImpl.setRadionuclideDetails(radionuclideDetails);
		}

		if (activityDetails == null) {
			radionuclideInfoImpl.setActivityDetails("");
		}
		else {
			radionuclideInfoImpl.setActivityDetails(activityDetails);
		}

		if (activityDetailBq == null) {
			radionuclideInfoImpl.setActivityDetailBq("");
		}
		else {
			radionuclideInfoImpl.setActivityDetailBq(activityDetailBq);
		}

		if (activityDate == Long.MIN_VALUE) {
			radionuclideInfoImpl.setActivityDate(null);
		}
		else {
			radionuclideInfoImpl.setActivityDate(new Date(activityDate));
		}

		if (chemicalDetailsForm == null) {
			radionuclideInfoImpl.setChemicalDetailsForm("");
		}
		else {
			radionuclideInfoImpl.setChemicalDetailsForm(chemicalDetailsForm);
		}

		if (serialNo == null) {
			radionuclideInfoImpl.setSerialNo("");
		}
		else {
			radionuclideInfoImpl.setSerialNo(serialNo);
		}

		if (sealedSource == null) {
			radionuclideInfoImpl.setSealedSource("");
		}
		else {
			radionuclideInfoImpl.setSealedSource(sealedSource);
		}

		if (manufacturerDetails == null) {
			radionuclideInfoImpl.setManufacturerDetails("");
		}
		else {
			radionuclideInfoImpl.setManufacturerDetails(manufacturerDetails);
		}

		if (modelNo == null) {
			radionuclideInfoImpl.setModelNo("");
		}
		else {
			radionuclideInfoImpl.setModelNo(modelNo);
		}

		if (identificationNo == null) {
			radionuclideInfoImpl.setIdentificationNo("");
		}
		else {
			radionuclideInfoImpl.setIdentificationNo(identificationNo);
		}

		if (statusDetails == null) {
			radionuclideInfoImpl.setStatusDetails("");
		}
		else {
			radionuclideInfoImpl.setStatusDetails(statusDetails);
		}

		radionuclideInfoImpl.setHsraApplicationId(hsraApplicationId);

		radionuclideInfoImpl.resetOriginalValues();

		return radionuclideInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		radionuclideInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		radionuclideDetails = objectInput.readUTF();
		activityDetails = objectInput.readUTF();
		activityDetailBq = objectInput.readUTF();
		activityDate = objectInput.readLong();
		chemicalDetailsForm = objectInput.readUTF();
		serialNo = objectInput.readUTF();
		sealedSource = objectInput.readUTF();
		manufacturerDetails = objectInput.readUTF();
		modelNo = objectInput.readUTF();
		identificationNo = objectInput.readUTF();
		statusDetails = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(radionuclideInfoId);

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

		if (radionuclideDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radionuclideDetails);
		}

		if (activityDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activityDetails);
		}

		if (activityDetailBq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activityDetailBq);
		}

		objectOutput.writeLong(activityDate);

		if (chemicalDetailsForm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(chemicalDetailsForm);
		}

		if (serialNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serialNo);
		}

		if (sealedSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sealedSource);
		}

		if (manufacturerDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufacturerDetails);
		}

		if (modelNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modelNo);
		}

		if (identificationNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(identificationNo);
		}

		if (statusDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusDetails);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long radionuclideInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String radionuclideDetails;
	public String activityDetails;
	public String activityDetailBq;
	public long activityDate;
	public String chemicalDetailsForm;
	public String serialNo;
	public String sealedSource;
	public String manufacturerDetails;
	public String modelNo;
	public String identificationNo;
	public String statusDetails;
	public long hsraApplicationId;

}