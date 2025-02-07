/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismAnnualEntertainBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismAnnualEntertainBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismAnnualEntertainBoxCacheModel
	implements CacheModel<TourismAnnualEntertainBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismAnnualEntertainBoxCacheModel)) {
			return false;
		}

		TourismAnnualEntertainBoxCacheModel
			tourismAnnualEntertainBoxCacheModel =
				(TourismAnnualEntertainBoxCacheModel)object;

		if (tourismAnnualEntertainBoxId ==
				tourismAnnualEntertainBoxCacheModel.
					tourismAnnualEntertainBoxId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismAnnualEntertainBoxId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{tourismAnnualEntertainBoxId=");
		sb.append(tourismAnnualEntertainBoxId);
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
		sb.append(", service=");
		sb.append(service);
		sb.append(", local=");
		sb.append(local);
		sb.append(", foreign=");
		sb.append(foreign);
		sb.append(", enterCounter=");
		sb.append(enterCounter);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismAnnualEntertainBox toEntityModel() {
		TourismAnnualEntertainBoxImpl tourismAnnualEntertainBoxImpl =
			new TourismAnnualEntertainBoxImpl();

		tourismAnnualEntertainBoxImpl.setTourismAnnualEntertainBoxId(
			tourismAnnualEntertainBoxId);
		tourismAnnualEntertainBoxImpl.setGroupId(groupId);
		tourismAnnualEntertainBoxImpl.setCompanyId(companyId);
		tourismAnnualEntertainBoxImpl.setUserId(userId);

		if (userName == null) {
			tourismAnnualEntertainBoxImpl.setUserName("");
		}
		else {
			tourismAnnualEntertainBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismAnnualEntertainBoxImpl.setCreateDate(null);
		}
		else {
			tourismAnnualEntertainBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismAnnualEntertainBoxImpl.setModifiedDate(null);
		}
		else {
			tourismAnnualEntertainBoxImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (service == null) {
			tourismAnnualEntertainBoxImpl.setService("");
		}
		else {
			tourismAnnualEntertainBoxImpl.setService(service);
		}

		if (local == null) {
			tourismAnnualEntertainBoxImpl.setLocal("");
		}
		else {
			tourismAnnualEntertainBoxImpl.setLocal(local);
		}

		if (foreign == null) {
			tourismAnnualEntertainBoxImpl.setForeign("");
		}
		else {
			tourismAnnualEntertainBoxImpl.setForeign(foreign);
		}

		if (enterCounter == null) {
			tourismAnnualEntertainBoxImpl.setEnterCounter("");
		}
		else {
			tourismAnnualEntertainBoxImpl.setEnterCounter(enterCounter);
		}

		tourismAnnualEntertainBoxImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismAnnualEntertainBoxImpl.resetOriginalValues();

		return tourismAnnualEntertainBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismAnnualEntertainBoxId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		service = objectInput.readUTF();
		local = objectInput.readUTF();
		foreign = objectInput.readUTF();
		enterCounter = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismAnnualEntertainBoxId);

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

		if (service == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(service);
		}

		if (local == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(local);
		}

		if (foreign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foreign);
		}

		if (enterCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(enterCounter);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismAnnualEntertainBoxId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String service;
	public String local;
	public String foreign;
	public String enterCounter;
	public long tourismApplicationId;

}