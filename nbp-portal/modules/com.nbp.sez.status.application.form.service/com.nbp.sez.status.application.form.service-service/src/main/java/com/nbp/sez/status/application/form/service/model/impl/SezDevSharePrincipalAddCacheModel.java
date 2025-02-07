/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevSharePrincipalAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevSharePrincipalAddCacheModel
	implements CacheModel<SezDevSharePrincipalAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevSharePrincipalAddCacheModel)) {
			return false;
		}

		SezDevSharePrincipalAddCacheModel sezDevSharePrincipalAddCacheModel =
			(SezDevSharePrincipalAddCacheModel)object;

		if (sezDevSharePrincipalAddId ==
				sezDevSharePrincipalAddCacheModel.sezDevSharePrincipalAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevSharePrincipalAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezDevSharePrincipalAddId=");
		sb.append(sezDevSharePrincipalAddId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", buildingNum=");
		sb.append(buildingNum);
		sb.append(", parishPost=");
		sb.append(parishPost);
		sb.append(", country=");
		sb.append(country);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", taxRegistrationNum=");
		sb.append(taxRegistrationNum);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevSharePrincipalAdd toEntityModel() {
		SezDevSharePrincipalAddImpl sezDevSharePrincipalAddImpl =
			new SezDevSharePrincipalAddImpl();

		sezDevSharePrincipalAddImpl.setSezDevSharePrincipalAddId(
			sezDevSharePrincipalAddId);
		sezDevSharePrincipalAddImpl.setGroupId(groupId);
		sezDevSharePrincipalAddImpl.setCompanyId(companyId);
		sezDevSharePrincipalAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevSharePrincipalAddImpl.setUserName("");
		}
		else {
			sezDevSharePrincipalAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevSharePrincipalAddImpl.setCreateDate(null);
		}
		else {
			sezDevSharePrincipalAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevSharePrincipalAddImpl.setModifiedDate(null);
		}
		else {
			sezDevSharePrincipalAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			sezDevSharePrincipalAddImpl.setName("");
		}
		else {
			sezDevSharePrincipalAddImpl.setName(name);
		}

		if (buildingNum == null) {
			sezDevSharePrincipalAddImpl.setBuildingNum("");
		}
		else {
			sezDevSharePrincipalAddImpl.setBuildingNum(buildingNum);
		}

		if (parishPost == null) {
			sezDevSharePrincipalAddImpl.setParishPost("");
		}
		else {
			sezDevSharePrincipalAddImpl.setParishPost(parishPost);
		}

		if (country == null) {
			sezDevSharePrincipalAddImpl.setCountry("");
		}
		else {
			sezDevSharePrincipalAddImpl.setCountry(country);
		}

		if (nationality == null) {
			sezDevSharePrincipalAddImpl.setNationality("");
		}
		else {
			sezDevSharePrincipalAddImpl.setNationality(nationality);
		}

		if (taxRegistrationNum == null) {
			sezDevSharePrincipalAddImpl.setTaxRegistrationNum("");
		}
		else {
			sezDevSharePrincipalAddImpl.setTaxRegistrationNum(
				taxRegistrationNum);
		}

		if (counter == null) {
			sezDevSharePrincipalAddImpl.setCounter("");
		}
		else {
			sezDevSharePrincipalAddImpl.setCounter(counter);
		}

		sezDevSharePrincipalAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevSharePrincipalAddImpl.resetOriginalValues();

		return sezDevSharePrincipalAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevSharePrincipalAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		buildingNum = objectInput.readUTF();
		parishPost = objectInput.readUTF();
		country = objectInput.readUTF();
		nationality = objectInput.readUTF();
		taxRegistrationNum = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevSharePrincipalAddId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (buildingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingNum);
		}

		if (parishPost == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parishPost);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (nationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		if (taxRegistrationNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taxRegistrationNum);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevSharePrincipalAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String buildingNum;
	public String parishPost;
	public String country;
	public String nationality;
	public String taxRegistrationNum;
	public String counter;
	public long sezStatusApplicationId;

}