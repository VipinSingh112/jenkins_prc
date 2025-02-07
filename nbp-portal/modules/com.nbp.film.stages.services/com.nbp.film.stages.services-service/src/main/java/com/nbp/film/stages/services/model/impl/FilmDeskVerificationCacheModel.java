/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.stages.services.model.FilmDeskVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmDeskVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmDeskVerificationCacheModel
	implements CacheModel<FilmDeskVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmDeskVerificationCacheModel)) {
			return false;
		}

		FilmDeskVerificationCacheModel filmDeskVerificationCacheModel =
			(FilmDeskVerificationCacheModel)object;

		if (filmDeskVerificaId ==
				filmDeskVerificationCacheModel.filmDeskVerificaId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmDeskVerificaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{filmDeskVerificaId=");
		sb.append(filmDeskVerificaId);
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
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmDeskVerification toEntityModel() {
		FilmDeskVerificationImpl filmDeskVerificationImpl =
			new FilmDeskVerificationImpl();

		filmDeskVerificationImpl.setFilmDeskVerificaId(filmDeskVerificaId);
		filmDeskVerificationImpl.setGroupId(groupId);
		filmDeskVerificationImpl.setCompanyId(companyId);
		filmDeskVerificationImpl.setUserId(userId);

		if (userName == null) {
			filmDeskVerificationImpl.setUserName("");
		}
		else {
			filmDeskVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmDeskVerificationImpl.setCreateDate(null);
		}
		else {
			filmDeskVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmDeskVerificationImpl.setModifiedDate(null);
		}
		else {
			filmDeskVerificationImpl.setModifiedDate(new Date(modifiedDate));
		}

		filmDeskVerificationImpl.setFilmApplicationId(filmApplicationId);

		if (documentName == null) {
			filmDeskVerificationImpl.setDocumentName("");
		}
		else {
			filmDeskVerificationImpl.setDocumentName(documentName);
		}

		if (status == null) {
			filmDeskVerificationImpl.setStatus("");
		}
		else {
			filmDeskVerificationImpl.setStatus(status);
		}

		filmDeskVerificationImpl.resetOriginalValues();

		return filmDeskVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmDeskVerificaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		filmApplicationId = objectInput.readLong();
		documentName = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmDeskVerificaId);

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

		objectOutput.writeLong(filmApplicationId);

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long filmDeskVerificaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long filmApplicationId;
	public String documentName;
	public String status;

}