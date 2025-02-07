/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AccoNonHotelLicence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccoNonHotelLicence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccoNonHotelLicenceCacheModel
	implements CacheModel<AccoNonHotelLicence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccoNonHotelLicenceCacheModel)) {
			return false;
		}

		AccoNonHotelLicenceCacheModel accoNonHotelLicenceCacheModel =
			(AccoNonHotelLicenceCacheModel)object;

		if (accoNonHotelLicenceId ==
				accoNonHotelLicenceCacheModel.accoNonHotelLicenceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accoNonHotelLicenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accoNonHotelLicenceId=");
		sb.append(accoNonHotelLicenceId);
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
		sb.append(", accoName=");
		sb.append(accoName);
		sb.append(", accoAddress=");
		sb.append(accoAddress);
		sb.append(", accoTeleNo=");
		sb.append(accoTeleNo);
		sb.append(", accoFaxNo=");
		sb.append(accoFaxNo);
		sb.append(", accoEmail=");
		sb.append(accoEmail);
		sb.append(", accoNoOfEmp=");
		sb.append(accoNoOfEmp);
		sb.append(", accoOfferedType=");
		sb.append(accoOfferedType);
		sb.append(", noOfRooms=");
		sb.append(noOfRooms);
		sb.append(", ownerName=");
		sb.append(ownerName);
		sb.append(", ownerAddress=");
		sb.append(ownerAddress);
		sb.append(", ownerTeleNo=");
		sb.append(ownerTeleNo);
		sb.append(", ownerFaxNo=");
		sb.append(ownerFaxNo);
		sb.append(", operCompName=");
		sb.append(operCompName);
		sb.append(", operAddress=");
		sb.append(operAddress);
		sb.append(", managerName=");
		sb.append(managerName);
		sb.append(", managerAddress=");
		sb.append(managerAddress);
		sb.append(", managerTeleNo=");
		sb.append(managerTeleNo);
		sb.append(", managerFaxNo=");
		sb.append(managerFaxNo);
		sb.append(", managerEmail=");
		sb.append(managerEmail);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccoNonHotelLicence toEntityModel() {
		AccoNonHotelLicenceImpl accoNonHotelLicenceImpl =
			new AccoNonHotelLicenceImpl();

		if (uuid == null) {
			accoNonHotelLicenceImpl.setUuid("");
		}
		else {
			accoNonHotelLicenceImpl.setUuid(uuid);
		}

		accoNonHotelLicenceImpl.setAccoNonHotelLicenceId(accoNonHotelLicenceId);
		accoNonHotelLicenceImpl.setGroupId(groupId);
		accoNonHotelLicenceImpl.setCompanyId(companyId);
		accoNonHotelLicenceImpl.setUserId(userId);

		if (userName == null) {
			accoNonHotelLicenceImpl.setUserName("");
		}
		else {
			accoNonHotelLicenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accoNonHotelLicenceImpl.setCreateDate(null);
		}
		else {
			accoNonHotelLicenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accoNonHotelLicenceImpl.setModifiedDate(null);
		}
		else {
			accoNonHotelLicenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (accoName == null) {
			accoNonHotelLicenceImpl.setAccoName("");
		}
		else {
			accoNonHotelLicenceImpl.setAccoName(accoName);
		}

		if (accoAddress == null) {
			accoNonHotelLicenceImpl.setAccoAddress("");
		}
		else {
			accoNonHotelLicenceImpl.setAccoAddress(accoAddress);
		}

		if (accoTeleNo == null) {
			accoNonHotelLicenceImpl.setAccoTeleNo("");
		}
		else {
			accoNonHotelLicenceImpl.setAccoTeleNo(accoTeleNo);
		}

		if (accoFaxNo == null) {
			accoNonHotelLicenceImpl.setAccoFaxNo("");
		}
		else {
			accoNonHotelLicenceImpl.setAccoFaxNo(accoFaxNo);
		}

		if (accoEmail == null) {
			accoNonHotelLicenceImpl.setAccoEmail("");
		}
		else {
			accoNonHotelLicenceImpl.setAccoEmail(accoEmail);
		}

		if (accoNoOfEmp == null) {
			accoNonHotelLicenceImpl.setAccoNoOfEmp("");
		}
		else {
			accoNonHotelLicenceImpl.setAccoNoOfEmp(accoNoOfEmp);
		}

		if (accoOfferedType == null) {
			accoNonHotelLicenceImpl.setAccoOfferedType("");
		}
		else {
			accoNonHotelLicenceImpl.setAccoOfferedType(accoOfferedType);
		}

		if (noOfRooms == null) {
			accoNonHotelLicenceImpl.setNoOfRooms("");
		}
		else {
			accoNonHotelLicenceImpl.setNoOfRooms(noOfRooms);
		}

		if (ownerName == null) {
			accoNonHotelLicenceImpl.setOwnerName("");
		}
		else {
			accoNonHotelLicenceImpl.setOwnerName(ownerName);
		}

		if (ownerAddress == null) {
			accoNonHotelLicenceImpl.setOwnerAddress("");
		}
		else {
			accoNonHotelLicenceImpl.setOwnerAddress(ownerAddress);
		}

		if (ownerTeleNo == null) {
			accoNonHotelLicenceImpl.setOwnerTeleNo("");
		}
		else {
			accoNonHotelLicenceImpl.setOwnerTeleNo(ownerTeleNo);
		}

		if (ownerFaxNo == null) {
			accoNonHotelLicenceImpl.setOwnerFaxNo("");
		}
		else {
			accoNonHotelLicenceImpl.setOwnerFaxNo(ownerFaxNo);
		}

		if (operCompName == null) {
			accoNonHotelLicenceImpl.setOperCompName("");
		}
		else {
			accoNonHotelLicenceImpl.setOperCompName(operCompName);
		}

		if (operAddress == null) {
			accoNonHotelLicenceImpl.setOperAddress("");
		}
		else {
			accoNonHotelLicenceImpl.setOperAddress(operAddress);
		}

		if (managerName == null) {
			accoNonHotelLicenceImpl.setManagerName("");
		}
		else {
			accoNonHotelLicenceImpl.setManagerName(managerName);
		}

		if (managerAddress == null) {
			accoNonHotelLicenceImpl.setManagerAddress("");
		}
		else {
			accoNonHotelLicenceImpl.setManagerAddress(managerAddress);
		}

		if (managerTeleNo == null) {
			accoNonHotelLicenceImpl.setManagerTeleNo("");
		}
		else {
			accoNonHotelLicenceImpl.setManagerTeleNo(managerTeleNo);
		}

		if (managerFaxNo == null) {
			accoNonHotelLicenceImpl.setManagerFaxNo("");
		}
		else {
			accoNonHotelLicenceImpl.setManagerFaxNo(managerFaxNo);
		}

		if (managerEmail == null) {
			accoNonHotelLicenceImpl.setManagerEmail("");
		}
		else {
			accoNonHotelLicenceImpl.setManagerEmail(managerEmail);
		}

		accoNonHotelLicenceImpl.setJtbApplicationId(jtbApplicationId);

		accoNonHotelLicenceImpl.resetOriginalValues();

		return accoNonHotelLicenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accoNonHotelLicenceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		accoName = objectInput.readUTF();
		accoAddress = objectInput.readUTF();
		accoTeleNo = objectInput.readUTF();
		accoFaxNo = objectInput.readUTF();
		accoEmail = objectInput.readUTF();
		accoNoOfEmp = objectInput.readUTF();
		accoOfferedType = objectInput.readUTF();
		noOfRooms = objectInput.readUTF();
		ownerName = objectInput.readUTF();
		ownerAddress = objectInput.readUTF();
		ownerTeleNo = objectInput.readUTF();
		ownerFaxNo = objectInput.readUTF();
		operCompName = objectInput.readUTF();
		operAddress = objectInput.readUTF();
		managerName = objectInput.readUTF();
		managerAddress = objectInput.readUTF();
		managerTeleNo = objectInput.readUTF();
		managerFaxNo = objectInput.readUTF();
		managerEmail = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accoNonHotelLicenceId);

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

		if (accoName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoName);
		}

		if (accoAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoAddress);
		}

		if (accoTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoTeleNo);
		}

		if (accoFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoFaxNo);
		}

		if (accoEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoEmail);
		}

		if (accoNoOfEmp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoNoOfEmp);
		}

		if (accoOfferedType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accoOfferedType);
		}

		if (noOfRooms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noOfRooms);
		}

		if (ownerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerName);
		}

		if (ownerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerAddress);
		}

		if (ownerTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerTeleNo);
		}

		if (ownerFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerFaxNo);
		}

		if (operCompName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operCompName);
		}

		if (operAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operAddress);
		}

		if (managerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerName);
		}

		if (managerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerAddress);
		}

		if (managerTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerTeleNo);
		}

		if (managerFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerFaxNo);
		}

		if (managerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerEmail);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public String uuid;
	public long accoNonHotelLicenceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String accoName;
	public String accoAddress;
	public String accoTeleNo;
	public String accoFaxNo;
	public String accoEmail;
	public String accoNoOfEmp;
	public String accoOfferedType;
	public String noOfRooms;
	public String ownerName;
	public String ownerAddress;
	public String ownerTeleNo;
	public String ownerFaxNo;
	public String operCompName;
	public String operAddress;
	public String managerName;
	public String managerAddress;
	public String managerTeleNo;
	public String managerFaxNo;
	public String managerEmail;
	public long jtbApplicationId;

}