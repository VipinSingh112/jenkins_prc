/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesmentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAccoAssesmentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAccoAssesmentInfoCacheModel
	implements CacheModel<TourismNewAccoAssesmentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAccoAssesmentInfoCacheModel)) {
			return false;
		}

		TourismNewAccoAssesmentInfoCacheModel
			tourismNewAccoAssesmentInfoCacheModel =
				(TourismNewAccoAssesmentInfoCacheModel)object;

		if (TourismNewAccoAssesmentInfoId ==
				tourismNewAccoAssesmentInfoCacheModel.
					TourismNewAccoAssesmentInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, TourismNewAccoAssesmentInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{TourismNewAccoAssesmentInfoId=");
		sb.append(TourismNewAccoAssesmentInfoId);
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
		sb.append(", countryOrigin=");
		sb.append(countryOrigin);
		sb.append(", jointVenture=");
		sb.append(jointVenture);
		sb.append(", localPer=");
		sb.append(localPer);
		sb.append(", foreignPer=");
		sb.append(foreignPer);
		sb.append(", capitalInvest=");
		sb.append(capitalInvest);
		sb.append(", sourceAttach=");
		sb.append(sourceAttach);
		sb.append(", shareCapital=");
		sb.append(shareCapital);
		sb.append(", loanCapital=");
		sb.append(loanCapital);
		sb.append(", other=");
		sb.append(other);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAccoAssesmentInfo toEntityModel() {
		TourismNewAccoAssesmentInfoImpl tourismNewAccoAssesmentInfoImpl =
			new TourismNewAccoAssesmentInfoImpl();

		tourismNewAccoAssesmentInfoImpl.setTourismNewAccoAssesmentInfoId(
			TourismNewAccoAssesmentInfoId);
		tourismNewAccoAssesmentInfoImpl.setGroupId(groupId);
		tourismNewAccoAssesmentInfoImpl.setCompanyId(companyId);
		tourismNewAccoAssesmentInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAccoAssesmentInfoImpl.setUserName("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAccoAssesmentInfoImpl.setCreateDate(null);
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAccoAssesmentInfoImpl.setModifiedDate(null);
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (countryOrigin == null) {
			tourismNewAccoAssesmentInfoImpl.setCountryOrigin("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setCountryOrigin(countryOrigin);
		}

		if (jointVenture == null) {
			tourismNewAccoAssesmentInfoImpl.setJointVenture("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setJointVenture(jointVenture);
		}

		if (localPer == null) {
			tourismNewAccoAssesmentInfoImpl.setLocalPer("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setLocalPer(localPer);
		}

		if (foreignPer == null) {
			tourismNewAccoAssesmentInfoImpl.setForeignPer("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setForeignPer(foreignPer);
		}

		if (capitalInvest == null) {
			tourismNewAccoAssesmentInfoImpl.setCapitalInvest("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setCapitalInvest(capitalInvest);
		}

		if (sourceAttach == null) {
			tourismNewAccoAssesmentInfoImpl.setSourceAttach("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setSourceAttach(sourceAttach);
		}

		if (shareCapital == null) {
			tourismNewAccoAssesmentInfoImpl.setShareCapital("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setShareCapital(shareCapital);
		}

		if (loanCapital == null) {
			tourismNewAccoAssesmentInfoImpl.setLoanCapital("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setLoanCapital(loanCapital);
		}

		if (other == null) {
			tourismNewAccoAssesmentInfoImpl.setOther("");
		}
		else {
			tourismNewAccoAssesmentInfoImpl.setOther(other);
		}

		tourismNewAccoAssesmentInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAccoAssesmentInfoImpl.resetOriginalValues();

		return tourismNewAccoAssesmentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		TourismNewAccoAssesmentInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		countryOrigin = objectInput.readUTF();
		jointVenture = objectInput.readUTF();
		localPer = objectInput.readUTF();
		foreignPer = objectInput.readUTF();
		capitalInvest = objectInput.readUTF();
		sourceAttach = objectInput.readUTF();
		shareCapital = objectInput.readUTF();
		loanCapital = objectInput.readUTF();
		other = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(TourismNewAccoAssesmentInfoId);

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

		if (countryOrigin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(countryOrigin);
		}

		if (jointVenture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jointVenture);
		}

		if (localPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localPer);
		}

		if (foreignPer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foreignPer);
		}

		if (capitalInvest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capitalInvest);
		}

		if (sourceAttach == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceAttach);
		}

		if (shareCapital == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareCapital);
		}

		if (loanCapital == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(loanCapital);
		}

		if (other == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(other);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long TourismNewAccoAssesmentInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String countryOrigin;
	public String jointVenture;
	public String localPer;
	public String foreignPer;
	public String capitalInvest;
	public String sourceAttach;
	public String shareCapital;
	public String loanCapital;
	public String other;
	public long tourismApplicationId;

}