/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismSummaryAddBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismSummaryAddBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismSummaryAddBoxCacheModel
	implements CacheModel<TourismSummaryAddBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismSummaryAddBoxCacheModel)) {
			return false;
		}

		TourismSummaryAddBoxCacheModel tourismSummaryAddBoxCacheModel =
			(TourismSummaryAddBoxCacheModel)object;

		if (tourismSummaryBoxId ==
				tourismSummaryAddBoxCacheModel.tourismSummaryBoxId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismSummaryBoxId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{tourismSummaryBoxId=");
		sb.append(tourismSummaryBoxId);
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
		sb.append(", dealer=");
		sb.append(dealer);
		sb.append(", numberOfvehicles=");
		sb.append(numberOfvehicles);
		sb.append(", year=");
		sb.append(year);
		sb.append(", type=");
		sb.append(type);
		sb.append(", ccRating=");
		sb.append(ccRating);
		sb.append(", counterSummary=");
		sb.append(counterSummary);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismSummaryAddBox toEntityModel() {
		TourismSummaryAddBoxImpl tourismSummaryAddBoxImpl =
			new TourismSummaryAddBoxImpl();

		tourismSummaryAddBoxImpl.setTourismSummaryBoxId(tourismSummaryBoxId);
		tourismSummaryAddBoxImpl.setGroupId(groupId);
		tourismSummaryAddBoxImpl.setCompanyId(companyId);
		tourismSummaryAddBoxImpl.setUserId(userId);

		if (userName == null) {
			tourismSummaryAddBoxImpl.setUserName("");
		}
		else {
			tourismSummaryAddBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismSummaryAddBoxImpl.setCreateDate(null);
		}
		else {
			tourismSummaryAddBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismSummaryAddBoxImpl.setModifiedDate(null);
		}
		else {
			tourismSummaryAddBoxImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dealer == null) {
			tourismSummaryAddBoxImpl.setDealer("");
		}
		else {
			tourismSummaryAddBoxImpl.setDealer(dealer);
		}

		if (numberOfvehicles == null) {
			tourismSummaryAddBoxImpl.setNumberOfvehicles("");
		}
		else {
			tourismSummaryAddBoxImpl.setNumberOfvehicles(numberOfvehicles);
		}

		if (year == null) {
			tourismSummaryAddBoxImpl.setYear("");
		}
		else {
			tourismSummaryAddBoxImpl.setYear(year);
		}

		if (type == null) {
			tourismSummaryAddBoxImpl.setType("");
		}
		else {
			tourismSummaryAddBoxImpl.setType(type);
		}

		if (ccRating == null) {
			tourismSummaryAddBoxImpl.setCcRating("");
		}
		else {
			tourismSummaryAddBoxImpl.setCcRating(ccRating);
		}

		if (counterSummary == null) {
			tourismSummaryAddBoxImpl.setCounterSummary("");
		}
		else {
			tourismSummaryAddBoxImpl.setCounterSummary(counterSummary);
		}

		tourismSummaryAddBoxImpl.setTourismApplicationId(tourismApplicationId);

		tourismSummaryAddBoxImpl.resetOriginalValues();

		return tourismSummaryAddBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismSummaryBoxId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dealer = objectInput.readUTF();
		numberOfvehicles = objectInput.readUTF();
		year = objectInput.readUTF();
		type = objectInput.readUTF();
		ccRating = objectInput.readUTF();
		counterSummary = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismSummaryBoxId);

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

		if (dealer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dealer);
		}

		if (numberOfvehicles == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfvehicles);
		}

		if (year == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(year);
		}

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (ccRating == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ccRating);
		}

		if (counterSummary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counterSummary);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismSummaryBoxId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String dealer;
	public String numberOfvehicles;
	public String year;
	public String type;
	public String ccRating;
	public String counterSummary;
	public long tourismApplicationId;

}