/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DetailOfApplicantSecTwo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DetailOfApplicantSecTwoCacheModel
	implements CacheModel<DetailOfApplicantSecTwo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DetailOfApplicantSecTwoCacheModel)) {
			return false;
		}

		DetailOfApplicantSecTwoCacheModel detailOfApplicantSecTwoCacheModel =
			(DetailOfApplicantSecTwoCacheModel)object;

		if (detailOfAppliSecTwoId ==
				detailOfApplicantSecTwoCacheModel.detailOfAppliSecTwoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, detailOfAppliSecTwoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{detailOfAppliSecTwoId=");
		sb.append(detailOfAppliSecTwoId);
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
		sb.append(", organizationName=");
		sb.append(organizationName);
		sb.append(", nuclearMailingAddr=");
		sb.append(nuclearMailingAddr);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", nuclearTrnNumber=");
		sb.append(nuclearTrnNumber);
		sb.append(", nuclearTelephoneNo=");
		sb.append(nuclearTelephoneNo);
		sb.append(", nuclearFaxNo=");
		sb.append(nuclearFaxNo);
		sb.append(", nuclearEmailAddr=");
		sb.append(nuclearEmailAddr);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DetailOfApplicantSecTwo toEntityModel() {
		DetailOfApplicantSecTwoImpl detailOfApplicantSecTwoImpl =
			new DetailOfApplicantSecTwoImpl();

		detailOfApplicantSecTwoImpl.setDetailOfAppliSecTwoId(
			detailOfAppliSecTwoId);
		detailOfApplicantSecTwoImpl.setGroupId(groupId);
		detailOfApplicantSecTwoImpl.setCompanyId(companyId);
		detailOfApplicantSecTwoImpl.setUserId(userId);

		if (userName == null) {
			detailOfApplicantSecTwoImpl.setUserName("");
		}
		else {
			detailOfApplicantSecTwoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			detailOfApplicantSecTwoImpl.setCreateDate(null);
		}
		else {
			detailOfApplicantSecTwoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			detailOfApplicantSecTwoImpl.setModifiedDate(null);
		}
		else {
			detailOfApplicantSecTwoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (organizationName == null) {
			detailOfApplicantSecTwoImpl.setOrganizationName("");
		}
		else {
			detailOfApplicantSecTwoImpl.setOrganizationName(organizationName);
		}

		if (nuclearMailingAddr == null) {
			detailOfApplicantSecTwoImpl.setNuclearMailingAddr("");
		}
		else {
			detailOfApplicantSecTwoImpl.setNuclearMailingAddr(
				nuclearMailingAddr);
		}

		if (parish == null) {
			detailOfApplicantSecTwoImpl.setParish("");
		}
		else {
			detailOfApplicantSecTwoImpl.setParish(parish);
		}

		if (nuclearTrnNumber == null) {
			detailOfApplicantSecTwoImpl.setNuclearTrnNumber("");
		}
		else {
			detailOfApplicantSecTwoImpl.setNuclearTrnNumber(nuclearTrnNumber);
		}

		if (nuclearTelephoneNo == null) {
			detailOfApplicantSecTwoImpl.setNuclearTelephoneNo("");
		}
		else {
			detailOfApplicantSecTwoImpl.setNuclearTelephoneNo(
				nuclearTelephoneNo);
		}

		if (nuclearFaxNo == null) {
			detailOfApplicantSecTwoImpl.setNuclearFaxNo("");
		}
		else {
			detailOfApplicantSecTwoImpl.setNuclearFaxNo(nuclearFaxNo);
		}

		if (nuclearEmailAddr == null) {
			detailOfApplicantSecTwoImpl.setNuclearEmailAddr("");
		}
		else {
			detailOfApplicantSecTwoImpl.setNuclearEmailAddr(nuclearEmailAddr);
		}

		detailOfApplicantSecTwoImpl.setHsraApplicationId(hsraApplicationId);

		detailOfApplicantSecTwoImpl.resetOriginalValues();

		return detailOfApplicantSecTwoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		detailOfAppliSecTwoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationName = objectInput.readUTF();
		nuclearMailingAddr = objectInput.readUTF();
		parish = objectInput.readUTF();
		nuclearTrnNumber = objectInput.readUTF();
		nuclearTelephoneNo = objectInput.readUTF();
		nuclearFaxNo = objectInput.readUTF();
		nuclearEmailAddr = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(detailOfAppliSecTwoId);

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

		if (organizationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationName);
		}

		if (nuclearMailingAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearMailingAddr);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (nuclearTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearTrnNumber);
		}

		if (nuclearTelephoneNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearTelephoneNo);
		}

		if (nuclearFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearFaxNo);
		}

		if (nuclearEmailAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearEmailAddr);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long detailOfAppliSecTwoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String organizationName;
	public String nuclearMailingAddr;
	public String parish;
	public String nuclearTrnNumber;
	public String nuclearTelephoneNo;
	public String nuclearFaxNo;
	public String nuclearEmailAddr;
	public long hsraApplicationId;

}