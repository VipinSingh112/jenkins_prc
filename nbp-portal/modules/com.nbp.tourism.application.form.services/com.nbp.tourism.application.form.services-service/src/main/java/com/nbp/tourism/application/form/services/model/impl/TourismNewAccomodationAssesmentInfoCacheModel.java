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

import com.nbp.tourism.application.form.services.model.TourismNewAccomodationAssesmentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAccomodationAssesmentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAccomodationAssesmentInfoCacheModel
	implements CacheModel<TourismNewAccomodationAssesmentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				TourismNewAccomodationAssesmentInfoCacheModel)) {

			return false;
		}

		TourismNewAccomodationAssesmentInfoCacheModel
			tourismNewAccomodationAssesmentInfoCacheModel =
				(TourismNewAccomodationAssesmentInfoCacheModel)object;

		if (tourismNewAccomodationAssesId ==
				tourismNewAccomodationAssesmentInfoCacheModel.
					tourismNewAccomodationAssesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAccomodationAssesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{tourismNewAccomodationAssesId=");
		sb.append(tourismNewAccomodationAssesId);
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
	public TourismNewAccomodationAssesmentInfo toEntityModel() {
		TourismNewAccomodationAssesmentInfoImpl
			tourismNewAccomodationAssesmentInfoImpl =
				new TourismNewAccomodationAssesmentInfoImpl();

		tourismNewAccomodationAssesmentInfoImpl.
			setTourismNewAccomodationAssesId(tourismNewAccomodationAssesId);
		tourismNewAccomodationAssesmentInfoImpl.setGroupId(groupId);
		tourismNewAccomodationAssesmentInfoImpl.setCompanyId(companyId);
		tourismNewAccomodationAssesmentInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAccomodationAssesmentInfoImpl.setUserName("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAccomodationAssesmentInfoImpl.setCreateDate(null);
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAccomodationAssesmentInfoImpl.setModifiedDate(null);
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (countryOrigin == null) {
			tourismNewAccomodationAssesmentInfoImpl.setCountryOrigin("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setCountryOrigin(
				countryOrigin);
		}

		if (jointVenture == null) {
			tourismNewAccomodationAssesmentInfoImpl.setJointVenture("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setJointVenture(
				jointVenture);
		}

		if (localPer == null) {
			tourismNewAccomodationAssesmentInfoImpl.setLocalPer("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setLocalPer(localPer);
		}

		if (foreignPer == null) {
			tourismNewAccomodationAssesmentInfoImpl.setForeignPer("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setForeignPer(foreignPer);
		}

		if (capitalInvest == null) {
			tourismNewAccomodationAssesmentInfoImpl.setCapitalInvest("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setCapitalInvest(
				capitalInvest);
		}

		if (sourceAttach == null) {
			tourismNewAccomodationAssesmentInfoImpl.setSourceAttach("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setSourceAttach(
				sourceAttach);
		}

		if (shareCapital == null) {
			tourismNewAccomodationAssesmentInfoImpl.setShareCapital("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setShareCapital(
				shareCapital);
		}

		if (loanCapital == null) {
			tourismNewAccomodationAssesmentInfoImpl.setLoanCapital("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setLoanCapital(loanCapital);
		}

		if (other == null) {
			tourismNewAccomodationAssesmentInfoImpl.setOther("");
		}
		else {
			tourismNewAccomodationAssesmentInfoImpl.setOther(other);
		}

		tourismNewAccomodationAssesmentInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAccomodationAssesmentInfoImpl.resetOriginalValues();

		return tourismNewAccomodationAssesmentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAccomodationAssesId = objectInput.readLong();

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
		objectOutput.writeLong(tourismNewAccomodationAssesId);

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

	public long tourismNewAccomodationAssesId;
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