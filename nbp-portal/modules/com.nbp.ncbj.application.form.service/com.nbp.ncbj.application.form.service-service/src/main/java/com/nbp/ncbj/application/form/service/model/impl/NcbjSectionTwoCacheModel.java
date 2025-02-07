/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjSectionTwo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjSectionTwo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjSectionTwoCacheModel
	implements CacheModel<NcbjSectionTwo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjSectionTwoCacheModel)) {
			return false;
		}

		NcbjSectionTwoCacheModel ncbjSectionTwoCacheModel =
			(NcbjSectionTwoCacheModel)object;

		if (ncbjSectionTwoId == ncbjSectionTwoCacheModel.ncbjSectionTwoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjSectionTwoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{ncbjSectionTwoId=");
		sb.append(ncbjSectionTwoId);
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
		sb.append(", incomingMaterials=");
		sb.append(incomingMaterials);
		sb.append(", productStorage=");
		sb.append(productStorage);
		sb.append(", buildingSiteAspects=");
		sb.append(buildingSiteAspects);
		sb.append(", wasteDischarges=");
		sb.append(wasteDischarges);
		sb.append(", transportDetails=");
		sb.append(transportDetails);
		sb.append(", subcontractedActivities=");
		sb.append(subcontractedActivities);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjSectionTwo toEntityModel() {
		NcbjSectionTwoImpl ncbjSectionTwoImpl = new NcbjSectionTwoImpl();

		ncbjSectionTwoImpl.setNcbjSectionTwoId(ncbjSectionTwoId);
		ncbjSectionTwoImpl.setGroupId(groupId);
		ncbjSectionTwoImpl.setCompanyId(companyId);
		ncbjSectionTwoImpl.setUserId(userId);

		if (userName == null) {
			ncbjSectionTwoImpl.setUserName("");
		}
		else {
			ncbjSectionTwoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjSectionTwoImpl.setCreateDate(null);
		}
		else {
			ncbjSectionTwoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjSectionTwoImpl.setModifiedDate(null);
		}
		else {
			ncbjSectionTwoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (incomingMaterials == null) {
			ncbjSectionTwoImpl.setIncomingMaterials("");
		}
		else {
			ncbjSectionTwoImpl.setIncomingMaterials(incomingMaterials);
		}

		if (productStorage == null) {
			ncbjSectionTwoImpl.setProductStorage("");
		}
		else {
			ncbjSectionTwoImpl.setProductStorage(productStorage);
		}

		if (buildingSiteAspects == null) {
			ncbjSectionTwoImpl.setBuildingSiteAspects("");
		}
		else {
			ncbjSectionTwoImpl.setBuildingSiteAspects(buildingSiteAspects);
		}

		if (wasteDischarges == null) {
			ncbjSectionTwoImpl.setWasteDischarges("");
		}
		else {
			ncbjSectionTwoImpl.setWasteDischarges(wasteDischarges);
		}

		if (transportDetails == null) {
			ncbjSectionTwoImpl.setTransportDetails("");
		}
		else {
			ncbjSectionTwoImpl.setTransportDetails(transportDetails);
		}

		if (subcontractedActivities == null) {
			ncbjSectionTwoImpl.setSubcontractedActivities("");
		}
		else {
			ncbjSectionTwoImpl.setSubcontractedActivities(
				subcontractedActivities);
		}

		ncbjSectionTwoImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjSectionTwoImpl.resetOriginalValues();

		return ncbjSectionTwoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjSectionTwoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		incomingMaterials = objectInput.readUTF();
		productStorage = objectInput.readUTF();
		buildingSiteAspects = objectInput.readUTF();
		wasteDischarges = objectInput.readUTF();
		transportDetails = objectInput.readUTF();
		subcontractedActivities = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjSectionTwoId);

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

		if (incomingMaterials == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(incomingMaterials);
		}

		if (productStorage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productStorage);
		}

		if (buildingSiteAspects == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingSiteAspects);
		}

		if (wasteDischarges == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(wasteDischarges);
		}

		if (transportDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transportDetails);
		}

		if (subcontractedActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subcontractedActivities);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjSectionTwoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String incomingMaterials;
	public String productStorage;
	public String buildingSiteAspects;
	public String wasteDischarges;
	public String transportDetails;
	public String subcontractedActivities;
	public long ncbjApplicationId;

}