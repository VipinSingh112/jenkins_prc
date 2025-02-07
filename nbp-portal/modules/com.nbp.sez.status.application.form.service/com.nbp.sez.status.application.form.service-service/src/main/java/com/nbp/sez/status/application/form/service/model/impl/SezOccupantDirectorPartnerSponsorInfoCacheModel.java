/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantDirectorPartnerSponsorInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantDirectorPartnerSponsorInfoCacheModel
	implements CacheModel<SezOccupantDirectorPartnerSponsorInfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				SezOccupantDirectorPartnerSponsorInfoCacheModel)) {

			return false;
		}

		SezOccupantDirectorPartnerSponsorInfoCacheModel
			sezOccupantDirectorPartnerSponsorInfoCacheModel =
				(SezOccupantDirectorPartnerSponsorInfoCacheModel)object;

		if (sezOccDirectSpoId ==
				sezOccupantDirectorPartnerSponsorInfoCacheModel.
					sezOccDirectSpoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccDirectSpoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{sezOccDirectSpoId=");
		sb.append(sezOccDirectSpoId);
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
		sb.append(", occAppDate=");
		sb.append(occAppDate);
		sb.append(", occDirectorName=");
		sb.append(occDirectorName);
		sb.append(", occDirectorStreetAddress=");
		sb.append(occDirectorStreetAddress);
		sb.append(", occDirectorZipCode=");
		sb.append(occDirectorZipCode);
		sb.append(", occDirectorCountry=");
		sb.append(occDirectorCountry);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantDirectorPartnerSponsorInfo toEntityModel() {
		SezOccupantDirectorPartnerSponsorInfoImpl
			sezOccupantDirectorPartnerSponsorInfoImpl =
				new SezOccupantDirectorPartnerSponsorInfoImpl();

		sezOccupantDirectorPartnerSponsorInfoImpl.setSezOccDirectSpoId(
			sezOccDirectSpoId);
		sezOccupantDirectorPartnerSponsorInfoImpl.setGroupId(groupId);
		sezOccupantDirectorPartnerSponsorInfoImpl.setCompanyId(companyId);
		sezOccupantDirectorPartnerSponsorInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantDirectorPartnerSponsorInfoImpl.setUserName("");
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantDirectorPartnerSponsorInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantDirectorPartnerSponsorInfoImpl.setModifiedDate(null);
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occAppDate == Long.MIN_VALUE) {
			sezOccupantDirectorPartnerSponsorInfoImpl.setOccAppDate(null);
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.setOccAppDate(
				new Date(occAppDate));
		}

		if (occDirectorName == null) {
			sezOccupantDirectorPartnerSponsorInfoImpl.setOccDirectorName("");
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.setOccDirectorName(
				occDirectorName);
		}

		if (occDirectorStreetAddress == null) {
			sezOccupantDirectorPartnerSponsorInfoImpl.
				setOccDirectorStreetAddress("");
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.
				setOccDirectorStreetAddress(occDirectorStreetAddress);
		}

		if (occDirectorZipCode == null) {
			sezOccupantDirectorPartnerSponsorInfoImpl.setOccDirectorZipCode("");
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.setOccDirectorZipCode(
				occDirectorZipCode);
		}

		if (occDirectorCountry == null) {
			sezOccupantDirectorPartnerSponsorInfoImpl.setOccDirectorCountry("");
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.setOccDirectorCountry(
				occDirectorCountry);
		}

		if (counter == null) {
			sezOccupantDirectorPartnerSponsorInfoImpl.setCounter("");
		}
		else {
			sezOccupantDirectorPartnerSponsorInfoImpl.setCounter(counter);
		}

		sezOccupantDirectorPartnerSponsorInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantDirectorPartnerSponsorInfoImpl.resetOriginalValues();

		return sezOccupantDirectorPartnerSponsorInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccDirectSpoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occAppDate = objectInput.readLong();
		occDirectorName = objectInput.readUTF();
		occDirectorStreetAddress = objectInput.readUTF();
		occDirectorZipCode = objectInput.readUTF();
		occDirectorCountry = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccDirectSpoId);

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
		objectOutput.writeLong(occAppDate);

		if (occDirectorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDirectorName);
		}

		if (occDirectorStreetAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDirectorStreetAddress);
		}

		if (occDirectorZipCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDirectorZipCode);
		}

		if (occDirectorCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDirectorCountry);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccDirectSpoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long occAppDate;
	public String occDirectorName;
	public String occDirectorStreetAddress;
	public String occDirectorZipCode;
	public String occDirectorCountry;
	public String counter;
	public long sezStatusApplicationId;

}