/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.entity.information.services.model.EntityInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntityInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntityInformationCacheModel
	implements CacheModel<EntityInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EntityInformationCacheModel)) {
			return false;
		}

		EntityInformationCacheModel entityInformationCacheModel =
			(EntityInformationCacheModel)object;

		if (entityInfoId == entityInformationCacheModel.entityInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, entityInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", entityInfoId=");
		sb.append(entityInfoId);
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
		sb.append(", entityName=");
		sb.append(entityName);
		sb.append(", entityAddressOne=");
		sb.append(entityAddressOne);
		sb.append(", entityAddressTwo=");
		sb.append(entityAddressTwo);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", mailingAdd=");
		sb.append(mailingAdd);
		sb.append(", permanentAdd=");
		sb.append(permanentAdd);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", website=");
		sb.append(website);
		sb.append(", postalCode=");
		sb.append(postalCode);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", officeEmail=");
		sb.append(officeEmail);
		sb.append(", country=");
		sb.append(country);
		sb.append(", incorporationDate=");
		sb.append(incorporationDate);
		sb.append(", incorporationPlace=");
		sb.append(incorporationPlace);
		sb.append(", isUserPrimaryUser=");
		sb.append(isUserPrimaryUser);
		sb.append(", entityNumber=");
		sb.append(entityNumber);
		sb.append(", userType=");
		sb.append(userType);
		sb.append(", trn=");
		sb.append(trn);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EntityInformation toEntityModel() {
		EntityInformationImpl entityInformationImpl =
			new EntityInformationImpl();

		if (uuid == null) {
			entityInformationImpl.setUuid("");
		}
		else {
			entityInformationImpl.setUuid(uuid);
		}

		entityInformationImpl.setEntityInfoId(entityInfoId);
		entityInformationImpl.setGroupId(groupId);
		entityInformationImpl.setCompanyId(companyId);
		entityInformationImpl.setUserId(userId);

		if (userName == null) {
			entityInformationImpl.setUserName("");
		}
		else {
			entityInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			entityInformationImpl.setCreateDate(null);
		}
		else {
			entityInformationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			entityInformationImpl.setModifiedDate(null);
		}
		else {
			entityInformationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityName == null) {
			entityInformationImpl.setEntityName("");
		}
		else {
			entityInformationImpl.setEntityName(entityName);
		}

		if (entityAddressOne == null) {
			entityInformationImpl.setEntityAddressOne("");
		}
		else {
			entityInformationImpl.setEntityAddressOne(entityAddressOne);
		}

		if (entityAddressTwo == null) {
			entityInformationImpl.setEntityAddressTwo("");
		}
		else {
			entityInformationImpl.setEntityAddressTwo(entityAddressTwo);
		}

		if (telephone == null) {
			entityInformationImpl.setTelephone("");
		}
		else {
			entityInformationImpl.setTelephone(telephone);
		}

		if (mailingAdd == null) {
			entityInformationImpl.setMailingAdd("");
		}
		else {
			entityInformationImpl.setMailingAdd(mailingAdd);
		}

		if (permanentAdd == null) {
			entityInformationImpl.setPermanentAdd("");
		}
		else {
			entityInformationImpl.setPermanentAdd(permanentAdd);
		}

		if (fax == null) {
			entityInformationImpl.setFax("");
		}
		else {
			entityInformationImpl.setFax(fax);
		}

		if (website == null) {
			entityInformationImpl.setWebsite("");
		}
		else {
			entityInformationImpl.setWebsite(website);
		}

		if (postalCode == null) {
			entityInformationImpl.setPostalCode("");
		}
		else {
			entityInformationImpl.setPostalCode(postalCode);
		}

		if (parish == null) {
			entityInformationImpl.setParish("");
		}
		else {
			entityInformationImpl.setParish(parish);
		}

		if (officeEmail == null) {
			entityInformationImpl.setOfficeEmail("");
		}
		else {
			entityInformationImpl.setOfficeEmail(officeEmail);
		}

		if (country == null) {
			entityInformationImpl.setCountry("");
		}
		else {
			entityInformationImpl.setCountry(country);
		}

		if (incorporationDate == Long.MIN_VALUE) {
			entityInformationImpl.setIncorporationDate(null);
		}
		else {
			entityInformationImpl.setIncorporationDate(
				new Date(incorporationDate));
		}

		if (incorporationPlace == null) {
			entityInformationImpl.setIncorporationPlace("");
		}
		else {
			entityInformationImpl.setIncorporationPlace(incorporationPlace);
		}

		if (isUserPrimaryUser == null) {
			entityInformationImpl.setIsUserPrimaryUser("");
		}
		else {
			entityInformationImpl.setIsUserPrimaryUser(isUserPrimaryUser);
		}

		if (entityNumber == null) {
			entityInformationImpl.setEntityNumber("");
		}
		else {
			entityInformationImpl.setEntityNumber(entityNumber);
		}

		if (userType == null) {
			entityInformationImpl.setUserType("");
		}
		else {
			entityInformationImpl.setUserType(userType);
		}

		if (trn == null) {
			entityInformationImpl.setTrn("");
		}
		else {
			entityInformationImpl.setTrn(trn);
		}

		entityInformationImpl.resetOriginalValues();

		return entityInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		entityInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityName = objectInput.readUTF();
		entityAddressOne = objectInput.readUTF();
		entityAddressTwo = objectInput.readUTF();
		telephone = objectInput.readUTF();
		mailingAdd = objectInput.readUTF();
		permanentAdd = objectInput.readUTF();
		fax = objectInput.readUTF();
		website = objectInput.readUTF();
		postalCode = objectInput.readUTF();
		parish = objectInput.readUTF();
		officeEmail = objectInput.readUTF();
		country = objectInput.readUTF();
		incorporationDate = objectInput.readLong();
		incorporationPlace = objectInput.readUTF();
		isUserPrimaryUser = objectInput.readUTF();
		entityNumber = objectInput.readUTF();
		userType = objectInput.readUTF();
		trn = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(entityInfoId);

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

		if (entityName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityName);
		}

		if (entityAddressOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityAddressOne);
		}

		if (entityAddressTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityAddressTwo);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		if (mailingAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mailingAdd);
		}

		if (permanentAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentAdd);
		}

		if (fax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (website == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(website);
		}

		if (postalCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postalCode);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (officeEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officeEmail);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		objectOutput.writeLong(incorporationDate);

		if (incorporationPlace == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(incorporationPlace);
		}

		if (isUserPrimaryUser == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isUserPrimaryUser);
		}

		if (entityNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityNumber);
		}

		if (userType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userType);
		}

		if (trn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trn);
		}
	}

	public String uuid;
	public long entityInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityName;
	public String entityAddressOne;
	public String entityAddressTwo;
	public String telephone;
	public String mailingAdd;
	public String permanentAdd;
	public String fax;
	public String website;
	public String postalCode;
	public String parish;
	public String officeEmail;
	public String country;
	public long incorporationDate;
	public String incorporationPlace;
	public String isUserPrimaryUser;
	public String entityNumber;
	public String userType;
	public String trn;

}