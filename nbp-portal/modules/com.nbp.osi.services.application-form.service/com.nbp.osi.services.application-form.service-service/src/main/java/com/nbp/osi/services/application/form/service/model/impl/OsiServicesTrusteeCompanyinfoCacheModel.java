/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesTrusteeCompanyinfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesTrusteeCompanyinfoCacheModel
	implements CacheModel<OsiServicesTrusteeCompanyinfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiServicesTrusteeCompanyinfoCacheModel)) {
			return false;
		}

		OsiServicesTrusteeCompanyinfoCacheModel
			osiServicesTrusteeCompanyinfoCacheModel =
				(OsiServicesTrusteeCompanyinfoCacheModel)object;

		if (osiTrusId == osiServicesTrusteeCompanyinfoCacheModel.osiTrusId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiTrusId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiTrusId=");
		sb.append(osiTrusId);
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
		sb.append(", comCorporationName=");
		sb.append(comCorporationName);
		sb.append(", comHeadOfficeAddress=");
		sb.append(comHeadOfficeAddress);
		sb.append(", comTeleNo=");
		sb.append(comTeleNo);
		sb.append(", comFaxNo=");
		sb.append(comFaxNo);
		sb.append(", comEmail=");
		sb.append(comEmail);
		sb.append(", otherCountry=");
		sb.append(otherCountry);
		sb.append(", comIncorporationDate=");
		sb.append(comIncorporationDate);
		sb.append(", comLicenceRequest=");
		sb.append(comLicenceRequest);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesTrusteeCompanyinfo toEntityModel() {
		OsiServicesTrusteeCompanyinfoImpl osiServicesTrusteeCompanyinfoImpl =
			new OsiServicesTrusteeCompanyinfoImpl();

		if (uuid == null) {
			osiServicesTrusteeCompanyinfoImpl.setUuid("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setUuid(uuid);
		}

		osiServicesTrusteeCompanyinfoImpl.setOsiTrusId(osiTrusId);
		osiServicesTrusteeCompanyinfoImpl.setGroupId(groupId);
		osiServicesTrusteeCompanyinfoImpl.setCompanyId(companyId);
		osiServicesTrusteeCompanyinfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesTrusteeCompanyinfoImpl.setUserName("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesTrusteeCompanyinfoImpl.setCreateDate(null);
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesTrusteeCompanyinfoImpl.setModifiedDate(null);
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (comCorporationName == null) {
			osiServicesTrusteeCompanyinfoImpl.setComCorporationName("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setComCorporationName(
				comCorporationName);
		}

		if (comHeadOfficeAddress == null) {
			osiServicesTrusteeCompanyinfoImpl.setComHeadOfficeAddress("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setComHeadOfficeAddress(
				comHeadOfficeAddress);
		}

		if (comTeleNo == null) {
			osiServicesTrusteeCompanyinfoImpl.setComTeleNo("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setComTeleNo(comTeleNo);
		}

		if (comFaxNo == null) {
			osiServicesTrusteeCompanyinfoImpl.setComFaxNo("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setComFaxNo(comFaxNo);
		}

		if (comEmail == null) {
			osiServicesTrusteeCompanyinfoImpl.setComEmail("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setComEmail(comEmail);
		}

		if (otherCountry == null) {
			osiServicesTrusteeCompanyinfoImpl.setOtherCountry("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setOtherCountry(otherCountry);
		}

		if (comIncorporationDate == Long.MIN_VALUE) {
			osiServicesTrusteeCompanyinfoImpl.setComIncorporationDate(null);
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setComIncorporationDate(
				new Date(comIncorporationDate));
		}

		if (comLicenceRequest == null) {
			osiServicesTrusteeCompanyinfoImpl.setComLicenceRequest("");
		}
		else {
			osiServicesTrusteeCompanyinfoImpl.setComLicenceRequest(
				comLicenceRequest);
		}

		osiServicesTrusteeCompanyinfoImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServicesTrusteeCompanyinfoImpl.resetOriginalValues();

		return osiServicesTrusteeCompanyinfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiTrusId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		comCorporationName = objectInput.readUTF();
		comHeadOfficeAddress = objectInput.readUTF();
		comTeleNo = objectInput.readUTF();
		comFaxNo = objectInput.readUTF();
		comEmail = objectInput.readUTF();
		otherCountry = objectInput.readUTF();
		comIncorporationDate = objectInput.readLong();
		comLicenceRequest = objectInput.readUTF();

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

		objectOutput.writeLong(osiTrusId);

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

		if (comCorporationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comCorporationName);
		}

		if (comHeadOfficeAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comHeadOfficeAddress);
		}

		if (comTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comTeleNo);
		}

		if (comFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comFaxNo);
		}

		if (comEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comEmail);
		}

		if (otherCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherCountry);
		}

		objectOutput.writeLong(comIncorporationDate);

		if (comLicenceRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comLicenceRequest);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osiTrusId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String comCorporationName;
	public String comHeadOfficeAddress;
	public String comTeleNo;
	public String comFaxNo;
	public String comEmail;
	public String otherCountry;
	public long comIncorporationDate;
	public String comLicenceRequest;
	public long osiServicesApplicationId;

}