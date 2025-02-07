/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.application.form.service.model.FilmCompanyDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmCompanyDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmCompanyDetailsCacheModel
	implements CacheModel<FilmCompanyDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmCompanyDetailsCacheModel)) {
			return false;
		}

		FilmCompanyDetailsCacheModel filmCompanyDetailsCacheModel =
			(FilmCompanyDetailsCacheModel)object;

		if (filmCompanyDetailsId ==
				filmCompanyDetailsCacheModel.filmCompanyDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmCompanyDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{filmCompanyDetailsId=");
		sb.append(filmCompanyDetailsId);
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
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", countryOrigin=");
		sb.append(countryOrigin);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", contactPerson=");
		sb.append(contactPerson);
		sb.append(", email=");
		sb.append(email);
		sb.append(", position=");
		sb.append(position);
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmCompanyDetails toEntityModel() {
		FilmCompanyDetailsImpl filmCompanyDetailsImpl =
			new FilmCompanyDetailsImpl();

		filmCompanyDetailsImpl.setFilmCompanyDetailsId(filmCompanyDetailsId);
		filmCompanyDetailsImpl.setGroupId(groupId);
		filmCompanyDetailsImpl.setCompanyId(companyId);
		filmCompanyDetailsImpl.setUserId(userId);

		if (userName == null) {
			filmCompanyDetailsImpl.setUserName("");
		}
		else {
			filmCompanyDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmCompanyDetailsImpl.setCreateDate(null);
		}
		else {
			filmCompanyDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmCompanyDetailsImpl.setModifiedDate(null);
		}
		else {
			filmCompanyDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyName == null) {
			filmCompanyDetailsImpl.setCompanyName("");
		}
		else {
			filmCompanyDetailsImpl.setCompanyName(companyName);
		}

		if (address == null) {
			filmCompanyDetailsImpl.setAddress("");
		}
		else {
			filmCompanyDetailsImpl.setAddress(address);
		}

		if (countryOrigin == null) {
			filmCompanyDetailsImpl.setCountryOrigin("");
		}
		else {
			filmCompanyDetailsImpl.setCountryOrigin(countryOrigin);
		}

		if (telephoneNumber == null) {
			filmCompanyDetailsImpl.setTelephoneNumber("");
		}
		else {
			filmCompanyDetailsImpl.setTelephoneNumber(telephoneNumber);
		}

		if (mobile == null) {
			filmCompanyDetailsImpl.setMobile("");
		}
		else {
			filmCompanyDetailsImpl.setMobile(mobile);
		}

		if (contactPerson == null) {
			filmCompanyDetailsImpl.setContactPerson("");
		}
		else {
			filmCompanyDetailsImpl.setContactPerson(contactPerson);
		}

		if (email == null) {
			filmCompanyDetailsImpl.setEmail("");
		}
		else {
			filmCompanyDetailsImpl.setEmail(email);
		}

		if (position == null) {
			filmCompanyDetailsImpl.setPosition("");
		}
		else {
			filmCompanyDetailsImpl.setPosition(position);
		}

		filmCompanyDetailsImpl.setFilmApplicationId(filmApplicationId);

		filmCompanyDetailsImpl.resetOriginalValues();

		return filmCompanyDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmCompanyDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		address = objectInput.readUTF();
		countryOrigin = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		mobile = objectInput.readUTF();
		contactPerson = objectInput.readUTF();
		email = objectInput.readUTF();
		position = objectInput.readUTF();

		filmApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmCompanyDetailsId);

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

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (countryOrigin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(countryOrigin);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (mobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (contactPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPerson);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		objectOutput.writeLong(filmApplicationId);
	}

	public long filmCompanyDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String address;
	public String countryOrigin;
	public String telephoneNumber;
	public String mobile;
	public String contactPerson;
	public String email;
	public String position;
	public long filmApplicationId;

}