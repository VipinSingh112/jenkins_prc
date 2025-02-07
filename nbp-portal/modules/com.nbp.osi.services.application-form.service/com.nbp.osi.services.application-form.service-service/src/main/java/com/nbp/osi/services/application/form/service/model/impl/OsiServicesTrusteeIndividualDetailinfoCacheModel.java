/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesTrusteeIndividualDetailinfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesTrusteeIndividualDetailinfoCacheModel
	implements CacheModel<OsiServicesTrusteeIndividualDetailinfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				OsiServicesTrusteeIndividualDetailinfoCacheModel)) {

			return false;
		}

		OsiServicesTrusteeIndividualDetailinfoCacheModel
			osiServicesTrusteeIndividualDetailinfoCacheModel =
				(OsiServicesTrusteeIndividualDetailinfoCacheModel)object;

		if (osTIId == osiServicesTrusteeIndividualDetailinfoCacheModel.osTIId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osTIId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osTIId=");
		sb.append(osTIId);
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
		sb.append(", indiFamilyName=");
		sb.append(indiFamilyName);
		sb.append(", indiGivenName=");
		sb.append(indiGivenName);
		sb.append(", indiDateOfBirth=");
		sb.append(indiDateOfBirth);
		sb.append(", indiOtherLegalNames=");
		sb.append(indiOtherLegalNames);
		sb.append(", indiBusinessAddress=");
		sb.append(indiBusinessAddress);
		sb.append(", indiBusinessTeleNo=");
		sb.append(indiBusinessTeleNo);
		sb.append(", indiBusinessFaxNo=");
		sb.append(indiBusinessFaxNo);
		sb.append(", indiBusinessEmail=");
		sb.append(indiBusinessEmail);
		sb.append(", indiHomeAddress=");
		sb.append(indiHomeAddress);
		sb.append(", indiHomeTeleNo=");
		sb.append(indiHomeTeleNo);
		sb.append(", indiHomeFaxNo=");
		sb.append(indiHomeFaxNo);
		sb.append(", indiHomeEmail=");
		sb.append(indiHomeEmail);
		sb.append(", indiCurrentEmployer=");
		sb.append(indiCurrentEmployer);
		sb.append(", indiDateOfEmployment=");
		sb.append(indiDateOfEmployment);
		sb.append(", indiProfessionalOrg=");
		sb.append(indiProfessionalOrg);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesTrusteeIndividualDetailinfo toEntityModel() {
		OsiServicesTrusteeIndividualDetailinfoImpl
			osiServicesTrusteeIndividualDetailinfoImpl =
				new OsiServicesTrusteeIndividualDetailinfoImpl();

		if (uuid == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setUuid("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setUuid(uuid);
		}

		osiServicesTrusteeIndividualDetailinfoImpl.setOsTIId(osTIId);
		osiServicesTrusteeIndividualDetailinfoImpl.setGroupId(groupId);
		osiServicesTrusteeIndividualDetailinfoImpl.setCompanyId(companyId);
		osiServicesTrusteeIndividualDetailinfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setUserName("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesTrusteeIndividualDetailinfoImpl.setCreateDate(null);
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesTrusteeIndividualDetailinfoImpl.setModifiedDate(null);
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (indiFamilyName == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiFamilyName("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiFamilyName(
				indiFamilyName);
		}

		if (indiGivenName == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiGivenName("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiGivenName(
				indiGivenName);
		}

		if (indiDateOfBirth == Long.MIN_VALUE) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiDateOfBirth(null);
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiDateOfBirth(
				new Date(indiDateOfBirth));
		}

		if (indiOtherLegalNames == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiOtherLegalNames(
				"");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiOtherLegalNames(
				indiOtherLegalNames);
		}

		if (indiBusinessAddress == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiBusinessAddress(
				"");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiBusinessAddress(
				indiBusinessAddress);
		}

		if (indiBusinessTeleNo == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiBusinessTeleNo(
				"");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiBusinessTeleNo(
				indiBusinessTeleNo);
		}

		if (indiBusinessFaxNo == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiBusinessFaxNo("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiBusinessFaxNo(
				indiBusinessFaxNo);
		}

		if (indiBusinessEmail == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiBusinessEmail("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiBusinessEmail(
				indiBusinessEmail);
		}

		if (indiHomeAddress == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiHomeAddress("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiHomeAddress(
				indiHomeAddress);
		}

		if (indiHomeTeleNo == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiHomeTeleNo("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiHomeTeleNo(
				indiHomeTeleNo);
		}

		if (indiHomeFaxNo == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiHomeFaxNo("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiHomeFaxNo(
				indiHomeFaxNo);
		}

		if (indiHomeEmail == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiHomeEmail("");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiHomeEmail(
				indiHomeEmail);
		}

		if (indiCurrentEmployer == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiCurrentEmployer(
				"");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiCurrentEmployer(
				indiCurrentEmployer);
		}

		if (indiDateOfEmployment == Long.MIN_VALUE) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiDateOfEmployment(
				null);
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiDateOfEmployment(
				new Date(indiDateOfEmployment));
		}

		if (indiProfessionalOrg == null) {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiProfessionalOrg(
				"");
		}
		else {
			osiServicesTrusteeIndividualDetailinfoImpl.setIndiProfessionalOrg(
				indiProfessionalOrg);
		}

		osiServicesTrusteeIndividualDetailinfoImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServicesTrusteeIndividualDetailinfoImpl.resetOriginalValues();

		return osiServicesTrusteeIndividualDetailinfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osTIId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		indiFamilyName = objectInput.readUTF();
		indiGivenName = objectInput.readUTF();
		indiDateOfBirth = objectInput.readLong();
		indiOtherLegalNames = objectInput.readUTF();
		indiBusinessAddress = objectInput.readUTF();
		indiBusinessTeleNo = objectInput.readUTF();
		indiBusinessFaxNo = objectInput.readUTF();
		indiBusinessEmail = objectInput.readUTF();
		indiHomeAddress = objectInput.readUTF();
		indiHomeTeleNo = objectInput.readUTF();
		indiHomeFaxNo = objectInput.readUTF();
		indiHomeEmail = objectInput.readUTF();
		indiCurrentEmployer = objectInput.readUTF();
		indiDateOfEmployment = objectInput.readLong();
		indiProfessionalOrg = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(osTIId);

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

		if (indiFamilyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiFamilyName);
		}

		if (indiGivenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiGivenName);
		}

		objectOutput.writeLong(indiDateOfBirth);

		if (indiOtherLegalNames == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiOtherLegalNames);
		}

		if (indiBusinessAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiBusinessAddress);
		}

		if (indiBusinessTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiBusinessTeleNo);
		}

		if (indiBusinessFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiBusinessFaxNo);
		}

		if (indiBusinessEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiBusinessEmail);
		}

		if (indiHomeAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiHomeAddress);
		}

		if (indiHomeTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiHomeTeleNo);
		}

		if (indiHomeFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiHomeFaxNo);
		}

		if (indiHomeEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiHomeEmail);
		}

		if (indiCurrentEmployer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiCurrentEmployer);
		}

		objectOutput.writeLong(indiDateOfEmployment);

		if (indiProfessionalOrg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiProfessionalOrg);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osTIId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String indiFamilyName;
	public String indiGivenName;
	public long indiDateOfBirth;
	public String indiOtherLegalNames;
	public String indiBusinessAddress;
	public String indiBusinessTeleNo;
	public String indiBusinessFaxNo;
	public String indiBusinessEmail;
	public String indiHomeAddress;
	public String indiHomeTeleNo;
	public String indiHomeFaxNo;
	public String indiHomeEmail;
	public String indiCurrentEmployer;
	public long indiDateOfEmployment;
	public String indiProfessionalOrg;
	public long osiServicesApplicationId;

}