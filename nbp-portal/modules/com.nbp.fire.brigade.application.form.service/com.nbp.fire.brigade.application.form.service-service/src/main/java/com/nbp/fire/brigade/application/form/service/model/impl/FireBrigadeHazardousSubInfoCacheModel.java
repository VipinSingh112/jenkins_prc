/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FireBrigadeHazardousSubInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FireBrigadeHazardousSubInfoCacheModel
	implements CacheModel<FireBrigadeHazardousSubInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FireBrigadeHazardousSubInfoCacheModel)) {
			return false;
		}

		FireBrigadeHazardousSubInfoCacheModel
			fireBrigadeHazardousSubInfoCacheModel =
				(FireBrigadeHazardousSubInfoCacheModel)object;

		if (fireBrigadeHazardousSubInfoId ==
				fireBrigadeHazardousSubInfoCacheModel.
					fireBrigadeHazardousSubInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fireBrigadeHazardousSubInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{fireBrigadeHazardousSubInfoId=");
		sb.append(fireBrigadeHazardousSubInfoId);
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
		sb.append(", lpgCylinder=");
		sb.append(lpgCylinder);
		sb.append(", flammableGases=");
		sb.append(flammableGases);
		sb.append(", flammableCombustibleLiquid=");
		sb.append(flammableCombustibleLiquid);
		sb.append(", chemicalsLiquid=");
		sb.append(chemicalsLiquid);
		sb.append(", chemicalsPowder=");
		sb.append(chemicalsPowder);
		sb.append(", explosives=");
		sb.append(explosives);
		sb.append(", otherHazardousSubstance=");
		sb.append(otherHazardousSubstance);
		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FireBrigadeHazardousSubInfo toEntityModel() {
		FireBrigadeHazardousSubInfoImpl fireBrigadeHazardousSubInfoImpl =
			new FireBrigadeHazardousSubInfoImpl();

		fireBrigadeHazardousSubInfoImpl.setFireBrigadeHazardousSubInfoId(
			fireBrigadeHazardousSubInfoId);
		fireBrigadeHazardousSubInfoImpl.setGroupId(groupId);
		fireBrigadeHazardousSubInfoImpl.setCompanyId(companyId);
		fireBrigadeHazardousSubInfoImpl.setUserId(userId);

		if (userName == null) {
			fireBrigadeHazardousSubInfoImpl.setUserName("");
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fireBrigadeHazardousSubInfoImpl.setCreateDate(null);
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fireBrigadeHazardousSubInfoImpl.setModifiedDate(null);
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (lpgCylinder == null) {
			fireBrigadeHazardousSubInfoImpl.setLpgCylinder("");
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setLpgCylinder(lpgCylinder);
		}

		if (flammableGases == null) {
			fireBrigadeHazardousSubInfoImpl.setFlammableGases("");
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setFlammableGases(flammableGases);
		}

		if (flammableCombustibleLiquid == null) {
			fireBrigadeHazardousSubInfoImpl.setFlammableCombustibleLiquid("");
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setFlammableCombustibleLiquid(
				flammableCombustibleLiquid);
		}

		if (chemicalsLiquid == null) {
			fireBrigadeHazardousSubInfoImpl.setChemicalsLiquid("");
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setChemicalsLiquid(chemicalsLiquid);
		}

		if (chemicalsPowder == null) {
			fireBrigadeHazardousSubInfoImpl.setChemicalsPowder("");
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setChemicalsPowder(chemicalsPowder);
		}

		if (explosives == null) {
			fireBrigadeHazardousSubInfoImpl.setExplosives("");
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setExplosives(explosives);
		}

		if (otherHazardousSubstance == null) {
			fireBrigadeHazardousSubInfoImpl.setOtherHazardousSubstance("");
		}
		else {
			fireBrigadeHazardousSubInfoImpl.setOtherHazardousSubstance(
				otherHazardousSubstance);
		}

		fireBrigadeHazardousSubInfoImpl.setFireBrigadeApplicationId(
			fireBrigadeApplicationId);

		fireBrigadeHazardousSubInfoImpl.resetOriginalValues();

		return fireBrigadeHazardousSubInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fireBrigadeHazardousSubInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		lpgCylinder = objectInput.readUTF();
		flammableGases = objectInput.readUTF();
		flammableCombustibleLiquid = objectInput.readUTF();
		chemicalsLiquid = objectInput.readUTF();
		chemicalsPowder = objectInput.readUTF();
		explosives = objectInput.readUTF();
		otherHazardousSubstance = objectInput.readUTF();

		fireBrigadeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fireBrigadeHazardousSubInfoId);

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

		if (lpgCylinder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lpgCylinder);
		}

		if (flammableGases == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(flammableGases);
		}

		if (flammableCombustibleLiquid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(flammableCombustibleLiquid);
		}

		if (chemicalsLiquid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(chemicalsLiquid);
		}

		if (chemicalsPowder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(chemicalsPowder);
		}

		if (explosives == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(explosives);
		}

		if (otherHazardousSubstance == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherHazardousSubstance);
		}

		objectOutput.writeLong(fireBrigadeApplicationId);
	}

	public long fireBrigadeHazardousSubInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String lpgCylinder;
	public String flammableGases;
	public String flammableCombustibleLiquid;
	public String chemicalsLiquid;
	public String chemicalsPowder;
	public String explosives;
	public String otherHazardousSubstance;
	public long fireBrigadeApplicationId;

}