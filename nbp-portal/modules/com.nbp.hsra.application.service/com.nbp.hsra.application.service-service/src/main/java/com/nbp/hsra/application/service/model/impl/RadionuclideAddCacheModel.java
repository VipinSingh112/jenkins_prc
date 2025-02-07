/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.RadionuclideAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RadionuclideAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RadionuclideAddCacheModel
	implements CacheModel<RadionuclideAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RadionuclideAddCacheModel)) {
			return false;
		}

		RadionuclideAddCacheModel radionuclideAddCacheModel =
			(RadionuclideAddCacheModel)object;

		if (radionuclideAddId == radionuclideAddCacheModel.radionuclideAddId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, radionuclideAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{radionuclideAddId=");
		sb.append(radionuclideAddId);
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
		sb.append(", activityDate=");
		sb.append(activityDate);
		sb.append(", chemicalDetailsForm=");
		sb.append(chemicalDetailsForm);
		sb.append(", serialNo=");
		sb.append(serialNo);
		sb.append(", radionuclideLocation=");
		sb.append(radionuclideLocation);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RadionuclideAdd toEntityModel() {
		RadionuclideAddImpl radionuclideAddImpl = new RadionuclideAddImpl();

		radionuclideAddImpl.setRadionuclideAddId(radionuclideAddId);
		radionuclideAddImpl.setGroupId(groupId);
		radionuclideAddImpl.setCompanyId(companyId);
		radionuclideAddImpl.setUserId(userId);

		if (userName == null) {
			radionuclideAddImpl.setUserName("");
		}
		else {
			radionuclideAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			radionuclideAddImpl.setCreateDate(null);
		}
		else {
			radionuclideAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			radionuclideAddImpl.setModifiedDate(null);
		}
		else {
			radionuclideAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (radionuclideDetails == null) {
			radionuclideAddImpl.setRadionuclideDetails("");
		}
		else {
			radionuclideAddImpl.setRadionuclideDetails(radionuclideDetails);
		}

		if (activityDetails == null) {
			radionuclideAddImpl.setActivityDetails("");
		}
		else {
			radionuclideAddImpl.setActivityDetails(activityDetails);
		}

		if (activityDate == Long.MIN_VALUE) {
			radionuclideAddImpl.setActivityDate(null);
		}
		else {
			radionuclideAddImpl.setActivityDate(new Date(activityDate));
		}

		if (chemicalDetailsForm == null) {
			radionuclideAddImpl.setChemicalDetailsForm("");
		}
		else {
			radionuclideAddImpl.setChemicalDetailsForm(chemicalDetailsForm);
		}

		if (serialNo == null) {
			radionuclideAddImpl.setSerialNo("");
		}
		else {
			radionuclideAddImpl.setSerialNo(serialNo);
		}

		if (radionuclideLocation == null) {
			radionuclideAddImpl.setRadionuclideLocation("");
		}
		else {
			radionuclideAddImpl.setRadionuclideLocation(radionuclideLocation);
		}

		if (counter == null) {
			radionuclideAddImpl.setCounter("");
		}
		else {
			radionuclideAddImpl.setCounter(counter);
		}

		radionuclideAddImpl.setHsraApplicationId(hsraApplicationId);

		radionuclideAddImpl.resetOriginalValues();

		return radionuclideAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		radionuclideAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		radionuclideDetails = objectInput.readUTF();
		activityDetails = objectInput.readUTF();
		activityDate = objectInput.readLong();
		chemicalDetailsForm = objectInput.readUTF();
		serialNo = objectInput.readUTF();
		radionuclideLocation = objectInput.readUTF();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(radionuclideAddId);

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

		if (radionuclideLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radionuclideLocation);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long radionuclideAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String radionuclideDetails;
	public String activityDetails;
	public long activityDate;
	public String chemicalDetailsForm;
	public String serialNo;
	public String radionuclideLocation;
	public String counter;
	public long hsraApplicationId;

}