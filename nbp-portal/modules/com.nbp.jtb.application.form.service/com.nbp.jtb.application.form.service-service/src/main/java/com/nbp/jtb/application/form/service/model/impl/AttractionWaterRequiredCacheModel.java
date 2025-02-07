/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionWaterRequired;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionWaterRequired in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionWaterRequiredCacheModel
	implements CacheModel<AttractionWaterRequired>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionWaterRequiredCacheModel)) {
			return false;
		}

		AttractionWaterRequiredCacheModel attractionWaterRequiredCacheModel =
			(AttractionWaterRequiredCacheModel)object;

		if (attractionWaterRequiredId ==
				attractionWaterRequiredCacheModel.attractionWaterRequiredId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionWaterRequiredId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{attractionWaterRequiredId=");
		sb.append(attractionWaterRequiredId);
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
		sb.append(", generalOperator=");
		sb.append(generalOperator);
		sb.append(", waterCraft=");
		sb.append(waterCraft);
		sb.append(", waterSki=");
		sb.append(waterSki);
		sb.append(", sunfishSail=");
		sb.append(sunfishSail);
		sb.append(", parasail=");
		sb.append(parasail);
		sb.append(", scubaDiving=");
		sb.append(scubaDiving);
		sb.append(", glassBoat=");
		sb.append(glassBoat);
		sb.append(", bananaBoat=");
		sb.append(bananaBoat);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionWaterRequired toEntityModel() {
		AttractionWaterRequiredImpl attractionWaterRequiredImpl =
			new AttractionWaterRequiredImpl();

		attractionWaterRequiredImpl.setAttractionWaterRequiredId(
			attractionWaterRequiredId);
		attractionWaterRequiredImpl.setGroupId(groupId);
		attractionWaterRequiredImpl.setCompanyId(companyId);
		attractionWaterRequiredImpl.setUserId(userId);

		if (userName == null) {
			attractionWaterRequiredImpl.setUserName("");
		}
		else {
			attractionWaterRequiredImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionWaterRequiredImpl.setCreateDate(null);
		}
		else {
			attractionWaterRequiredImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionWaterRequiredImpl.setModifiedDate(null);
		}
		else {
			attractionWaterRequiredImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (generalOperator == null) {
			attractionWaterRequiredImpl.setGeneralOperator("");
		}
		else {
			attractionWaterRequiredImpl.setGeneralOperator(generalOperator);
		}

		if (waterCraft == null) {
			attractionWaterRequiredImpl.setWaterCraft("");
		}
		else {
			attractionWaterRequiredImpl.setWaterCraft(waterCraft);
		}

		if (waterSki == null) {
			attractionWaterRequiredImpl.setWaterSki("");
		}
		else {
			attractionWaterRequiredImpl.setWaterSki(waterSki);
		}

		if (sunfishSail == null) {
			attractionWaterRequiredImpl.setSunfishSail("");
		}
		else {
			attractionWaterRequiredImpl.setSunfishSail(sunfishSail);
		}

		if (parasail == null) {
			attractionWaterRequiredImpl.setParasail("");
		}
		else {
			attractionWaterRequiredImpl.setParasail(parasail);
		}

		if (scubaDiving == null) {
			attractionWaterRequiredImpl.setScubaDiving("");
		}
		else {
			attractionWaterRequiredImpl.setScubaDiving(scubaDiving);
		}

		if (glassBoat == null) {
			attractionWaterRequiredImpl.setGlassBoat("");
		}
		else {
			attractionWaterRequiredImpl.setGlassBoat(glassBoat);
		}

		if (bananaBoat == null) {
			attractionWaterRequiredImpl.setBananaBoat("");
		}
		else {
			attractionWaterRequiredImpl.setBananaBoat(bananaBoat);
		}

		attractionWaterRequiredImpl.setJtbApplicationId(jtbApplicationId);

		attractionWaterRequiredImpl.resetOriginalValues();

		return attractionWaterRequiredImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionWaterRequiredId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		generalOperator = objectInput.readUTF();
		waterCraft = objectInput.readUTF();
		waterSki = objectInput.readUTF();
		sunfishSail = objectInput.readUTF();
		parasail = objectInput.readUTF();
		scubaDiving = objectInput.readUTF();
		glassBoat = objectInput.readUTF();
		bananaBoat = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionWaterRequiredId);

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

		if (generalOperator == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(generalOperator);
		}

		if (waterCraft == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterCraft);
		}

		if (waterSki == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSki);
		}

		if (sunfishSail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sunfishSail);
		}

		if (parasail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parasail);
		}

		if (scubaDiving == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(scubaDiving);
		}

		if (glassBoat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(glassBoat);
		}

		if (bananaBoat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bananaBoat);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionWaterRequiredId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String generalOperator;
	public String waterCraft;
	public String waterSki;
	public String sunfishSail;
	public String parasail;
	public String scubaDiving;
	public String glassBoat;
	public String bananaBoat;
	public long jtbApplicationId;

}