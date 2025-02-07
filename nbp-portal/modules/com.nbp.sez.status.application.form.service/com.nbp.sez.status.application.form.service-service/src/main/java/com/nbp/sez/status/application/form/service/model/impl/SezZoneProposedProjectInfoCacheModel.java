/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneProposedProjectInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneProposedProjectInfoCacheModel
	implements CacheModel<SezZoneProposedProjectInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneProposedProjectInfoCacheModel)) {
			return false;
		}

		SezZoneProposedProjectInfoCacheModel
			sezZoneProposedProjectInfoCacheModel =
				(SezZoneProposedProjectInfoCacheModel)object;

		if (sezZoneProposedProjectInfoId ==
				sezZoneProposedProjectInfoCacheModel.
					sezZoneProposedProjectInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneProposedProjectInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{sezZoneProposedProjectInfoId=");
		sb.append(sezZoneProposedProjectInfoId);
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
		sb.append(", entityDeniedApproval=");
		sb.append(entityDeniedApproval);
		sb.append(", deniedApprovalDate=");
		sb.append(deniedApprovalDate);
		sb.append(", deniedApprovalProjectType=");
		sb.append(deniedApprovalProjectType);
		sb.append(", freeZoneLocation=");
		sb.append(freeZoneLocation);
		sb.append(", leasedBuildingNum=");
		sb.append(leasedBuildingNum);
		sb.append(", leasedTown=");
		sb.append(leasedTown);
		sb.append(", leasedParish=");
		sb.append(leasedParish);
		sb.append(", leaseYears=");
		sb.append(leaseYears);
		sb.append(", volume=");
		sb.append(volume);
		sb.append(", folio=");
		sb.append(folio);
		sb.append(", floorNum=");
		sb.append(floorNum);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezZoneProposedProjectInfo toEntityModel() {
		SezZoneProposedProjectInfoImpl sezZoneProposedProjectInfoImpl =
			new SezZoneProposedProjectInfoImpl();

		sezZoneProposedProjectInfoImpl.setSezZoneProposedProjectInfoId(
			sezZoneProposedProjectInfoId);
		sezZoneProposedProjectInfoImpl.setGroupId(groupId);
		sezZoneProposedProjectInfoImpl.setCompanyId(companyId);
		sezZoneProposedProjectInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneProposedProjectInfoImpl.setUserName("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneProposedProjectInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneProposedProjectInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneProposedProjectInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneProposedProjectInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (entityDeniedApproval == null) {
			sezZoneProposedProjectInfoImpl.setEntityDeniedApproval("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setEntityDeniedApproval(
				entityDeniedApproval);
		}

		if (deniedApprovalDate == Long.MIN_VALUE) {
			sezZoneProposedProjectInfoImpl.setDeniedApprovalDate(null);
		}
		else {
			sezZoneProposedProjectInfoImpl.setDeniedApprovalDate(
				new Date(deniedApprovalDate));
		}

		if (deniedApprovalProjectType == null) {
			sezZoneProposedProjectInfoImpl.setDeniedApprovalProjectType("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setDeniedApprovalProjectType(
				deniedApprovalProjectType);
		}

		if (freeZoneLocation == null) {
			sezZoneProposedProjectInfoImpl.setFreeZoneLocation("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setFreeZoneLocation(
				freeZoneLocation);
		}

		if (leasedBuildingNum == null) {
			sezZoneProposedProjectInfoImpl.setLeasedBuildingNum("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setLeasedBuildingNum(
				leasedBuildingNum);
		}

		if (leasedTown == null) {
			sezZoneProposedProjectInfoImpl.setLeasedTown("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setLeasedTown(leasedTown);
		}

		if (leasedParish == null) {
			sezZoneProposedProjectInfoImpl.setLeasedParish("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setLeasedParish(leasedParish);
		}

		if (leaseYears == null) {
			sezZoneProposedProjectInfoImpl.setLeaseYears("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setLeaseYears(leaseYears);
		}

		if (volume == null) {
			sezZoneProposedProjectInfoImpl.setVolume("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setVolume(volume);
		}

		if (folio == null) {
			sezZoneProposedProjectInfoImpl.setFolio("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setFolio(folio);
		}

		if (floorNum == null) {
			sezZoneProposedProjectInfoImpl.setFloorNum("");
		}
		else {
			sezZoneProposedProjectInfoImpl.setFloorNum(floorNum);
		}

		sezZoneProposedProjectInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezZoneProposedProjectInfoImpl.resetOriginalValues();

		return sezZoneProposedProjectInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneProposedProjectInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityDeniedApproval = objectInput.readUTF();
		deniedApprovalDate = objectInput.readLong();
		deniedApprovalProjectType = objectInput.readUTF();
		freeZoneLocation = objectInput.readUTF();
		leasedBuildingNum = objectInput.readUTF();
		leasedTown = objectInput.readUTF();
		leasedParish = objectInput.readUTF();
		leaseYears = objectInput.readUTF();
		volume = objectInput.readUTF();
		folio = objectInput.readUTF();
		floorNum = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneProposedProjectInfoId);

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

		if (entityDeniedApproval == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityDeniedApproval);
		}

		objectOutput.writeLong(deniedApprovalDate);

		if (deniedApprovalProjectType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deniedApprovalProjectType);
		}

		if (freeZoneLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(freeZoneLocation);
		}

		if (leasedBuildingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leasedBuildingNum);
		}

		if (leasedTown == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leasedTown);
		}

		if (leasedParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leasedParish);
		}

		if (leaseYears == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leaseYears);
		}

		if (volume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(volume);
		}

		if (folio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(folio);
		}

		if (floorNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(floorNum);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezZoneProposedProjectInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityDeniedApproval;
	public long deniedApprovalDate;
	public String deniedApprovalProjectType;
	public String freeZoneLocation;
	public String leasedBuildingNum;
	public String leasedTown;
	public String leasedParish;
	public String leaseYears;
	public String volume;
	public String folio;
	public String floorNum;
	public long sezStatusApplicationId;

}