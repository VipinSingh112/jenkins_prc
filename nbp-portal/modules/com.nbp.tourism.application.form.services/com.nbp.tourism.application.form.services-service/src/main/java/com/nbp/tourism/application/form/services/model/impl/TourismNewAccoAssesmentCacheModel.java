/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAccoAssesment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAccoAssesmentCacheModel
	implements CacheModel<TourismNewAccoAssesment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAccoAssesmentCacheModel)) {
			return false;
		}

		TourismNewAccoAssesmentCacheModel tourismNewAccoAssesmentCacheModel =
			(TourismNewAccoAssesmentCacheModel)object;

		if (TourismNewAccoAssesmentInfoId ==
				tourismNewAccoAssesmentCacheModel.
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
	public TourismNewAccoAssesment toEntityModel() {
		TourismNewAccoAssesmentImpl tourismNewAccoAssesmentImpl =
			new TourismNewAccoAssesmentImpl();

		tourismNewAccoAssesmentImpl.setTourismNewAccoAssesmentInfoId(
			TourismNewAccoAssesmentInfoId);
		tourismNewAccoAssesmentImpl.setGroupId(groupId);
		tourismNewAccoAssesmentImpl.setCompanyId(companyId);
		tourismNewAccoAssesmentImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAccoAssesmentImpl.setUserName("");
		}
		else {
			tourismNewAccoAssesmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAccoAssesmentImpl.setCreateDate(null);
		}
		else {
			tourismNewAccoAssesmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAccoAssesmentImpl.setModifiedDate(null);
		}
		else {
			tourismNewAccoAssesmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (countryOrigin == null) {
			tourismNewAccoAssesmentImpl.setCountryOrigin("");
		}
		else {
			tourismNewAccoAssesmentImpl.setCountryOrigin(countryOrigin);
		}

		if (jointVenture == null) {
			tourismNewAccoAssesmentImpl.setJointVenture("");
		}
		else {
			tourismNewAccoAssesmentImpl.setJointVenture(jointVenture);
		}

		if (localPer == null) {
			tourismNewAccoAssesmentImpl.setLocalPer("");
		}
		else {
			tourismNewAccoAssesmentImpl.setLocalPer(localPer);
		}

		if (foreignPer == null) {
			tourismNewAccoAssesmentImpl.setForeignPer("");
		}
		else {
			tourismNewAccoAssesmentImpl.setForeignPer(foreignPer);
		}

		if (capitalInvest == null) {
			tourismNewAccoAssesmentImpl.setCapitalInvest("");
		}
		else {
			tourismNewAccoAssesmentImpl.setCapitalInvest(capitalInvest);
		}

		if (sourceAttach == null) {
			tourismNewAccoAssesmentImpl.setSourceAttach("");
		}
		else {
			tourismNewAccoAssesmentImpl.setSourceAttach(sourceAttach);
		}

		if (shareCapital == null) {
			tourismNewAccoAssesmentImpl.setShareCapital("");
		}
		else {
			tourismNewAccoAssesmentImpl.setShareCapital(shareCapital);
		}

		if (loanCapital == null) {
			tourismNewAccoAssesmentImpl.setLoanCapital("");
		}
		else {
			tourismNewAccoAssesmentImpl.setLoanCapital(loanCapital);
		}

		if (other == null) {
			tourismNewAccoAssesmentImpl.setOther("");
		}
		else {
			tourismNewAccoAssesmentImpl.setOther(other);
		}

		tourismNewAccoAssesmentImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAccoAssesmentImpl.resetOriginalValues();

		return tourismNewAccoAssesmentImpl;
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