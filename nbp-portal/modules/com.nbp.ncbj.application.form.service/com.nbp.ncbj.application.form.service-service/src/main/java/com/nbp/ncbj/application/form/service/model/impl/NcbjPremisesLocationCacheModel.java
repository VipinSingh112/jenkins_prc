/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjPremisesLocation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjPremisesLocationCacheModel
	implements CacheModel<NcbjPremisesLocation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjPremisesLocationCacheModel)) {
			return false;
		}

		NcbjPremisesLocationCacheModel ncbjPremisesLocationCacheModel =
			(NcbjPremisesLocationCacheModel)object;

		if (ncbjPremisesLocationId ==
				ncbjPremisesLocationCacheModel.ncbjPremisesLocationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjPremisesLocationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{ncbjPremisesLocationId=");
		sb.append(ncbjPremisesLocationId);
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
		sb.append(", transferReasonDraft=");
		sb.append(transferReasonDraft);
		sb.append(", activityExclusion=");
		sb.append(activityExclusion);
		sb.append(", transferReasonAct=");
		sb.append(transferReasonAct);
		sb.append(", productionFacilitySize=");
		sb.append(productionFacilitySize);
		sb.append(", warehouseFacilitySize=");
		sb.append(warehouseFacilitySize);
		sb.append(", facilitiesLocation=");
		sb.append(facilitiesLocation);
		sb.append(", detailForDiffManagement=");
		sb.append(detailForDiffManagement);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjPremisesLocation toEntityModel() {
		NcbjPremisesLocationImpl ncbjPremisesLocationImpl =
			new NcbjPremisesLocationImpl();

		ncbjPremisesLocationImpl.setNcbjPremisesLocationId(
			ncbjPremisesLocationId);
		ncbjPremisesLocationImpl.setGroupId(groupId);
		ncbjPremisesLocationImpl.setCompanyId(companyId);
		ncbjPremisesLocationImpl.setUserId(userId);

		if (userName == null) {
			ncbjPremisesLocationImpl.setUserName("");
		}
		else {
			ncbjPremisesLocationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjPremisesLocationImpl.setCreateDate(null);
		}
		else {
			ncbjPremisesLocationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjPremisesLocationImpl.setModifiedDate(null);
		}
		else {
			ncbjPremisesLocationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (transferReasonDraft == null) {
			ncbjPremisesLocationImpl.setTransferReasonDraft("");
		}
		else {
			ncbjPremisesLocationImpl.setTransferReasonDraft(
				transferReasonDraft);
		}

		if (activityExclusion == null) {
			ncbjPremisesLocationImpl.setActivityExclusion("");
		}
		else {
			ncbjPremisesLocationImpl.setActivityExclusion(activityExclusion);
		}

		if (transferReasonAct == null) {
			ncbjPremisesLocationImpl.setTransferReasonAct("");
		}
		else {
			ncbjPremisesLocationImpl.setTransferReasonAct(transferReasonAct);
		}

		if (productionFacilitySize == null) {
			ncbjPremisesLocationImpl.setProductionFacilitySize("");
		}
		else {
			ncbjPremisesLocationImpl.setProductionFacilitySize(
				productionFacilitySize);
		}

		if (warehouseFacilitySize == null) {
			ncbjPremisesLocationImpl.setWarehouseFacilitySize("");
		}
		else {
			ncbjPremisesLocationImpl.setWarehouseFacilitySize(
				warehouseFacilitySize);
		}

		if (facilitiesLocation == null) {
			ncbjPremisesLocationImpl.setFacilitiesLocation("");
		}
		else {
			ncbjPremisesLocationImpl.setFacilitiesLocation(facilitiesLocation);
		}

		if (detailForDiffManagement == null) {
			ncbjPremisesLocationImpl.setDetailForDiffManagement("");
		}
		else {
			ncbjPremisesLocationImpl.setDetailForDiffManagement(
				detailForDiffManagement);
		}

		ncbjPremisesLocationImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjPremisesLocationImpl.resetOriginalValues();

		return ncbjPremisesLocationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjPremisesLocationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		transferReasonDraft = objectInput.readUTF();
		activityExclusion = objectInput.readUTF();
		transferReasonAct = objectInput.readUTF();
		productionFacilitySize = objectInput.readUTF();
		warehouseFacilitySize = objectInput.readUTF();
		facilitiesLocation = objectInput.readUTF();
		detailForDiffManagement = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjPremisesLocationId);

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

		if (transferReasonDraft == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferReasonDraft);
		}

		if (activityExclusion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activityExclusion);
		}

		if (transferReasonAct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferReasonAct);
		}

		if (productionFacilitySize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionFacilitySize);
		}

		if (warehouseFacilitySize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warehouseFacilitySize);
		}

		if (facilitiesLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(facilitiesLocation);
		}

		if (detailForDiffManagement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(detailForDiffManagement);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjPremisesLocationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String transferReasonDraft;
	public String activityExclusion;
	public String transferReasonAct;
	public String productionFacilitySize;
	public String warehouseFacilitySize;
	public String facilitiesLocation;
	public String detailForDiffManagement;
	public long ncbjApplicationId;

}