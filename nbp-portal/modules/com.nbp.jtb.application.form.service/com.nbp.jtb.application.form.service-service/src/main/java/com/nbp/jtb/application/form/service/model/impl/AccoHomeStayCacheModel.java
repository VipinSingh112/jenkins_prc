/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AccoHomeStay;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccoHomeStay in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccoHomeStayCacheModel
	implements CacheModel<AccoHomeStay>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccoHomeStayCacheModel)) {
			return false;
		}

		AccoHomeStayCacheModel accoHomeStayCacheModel =
			(AccoHomeStayCacheModel)object;

		if (accoHomeStayId == accoHomeStayCacheModel.accoHomeStayId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accoHomeStayId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accoHomeStayId=");
		sb.append(accoHomeStayId);
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
		sb.append(", homeAccoName=");
		sb.append(homeAccoName);
		sb.append(", homeOwnerName=");
		sb.append(homeOwnerName);
		sb.append(", propertyAddress=");
		sb.append(propertyAddress);
		sb.append(", homeTeleNo=");
		sb.append(homeTeleNo);
		sb.append(", homeMobile=");
		sb.append(homeMobile);
		sb.append(", homeEmail=");
		sb.append(homeEmail);
		sb.append(", homeEmployeeNo=");
		sb.append(homeEmployeeNo);
		sb.append(", website=");
		sb.append(website);
		sb.append(", propDirection=");
		sb.append(propDirection);
		sb.append(", numOfBedrooms=");
		sb.append(numOfBedrooms);
		sb.append(", numOfGuestBedroom=");
		sb.append(numOfGuestBedroom);
		sb.append(", withBathroom=");
		sb.append(withBathroom);
		sb.append(", sharedBathroom=");
		sb.append(sharedBathroom);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", certifiedBy=");
		sb.append(certifiedBy);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccoHomeStay toEntityModel() {
		AccoHomeStayImpl accoHomeStayImpl = new AccoHomeStayImpl();

		if (uuid == null) {
			accoHomeStayImpl.setUuid("");
		}
		else {
			accoHomeStayImpl.setUuid(uuid);
		}

		accoHomeStayImpl.setAccoHomeStayId(accoHomeStayId);
		accoHomeStayImpl.setGroupId(groupId);
		accoHomeStayImpl.setCompanyId(companyId);
		accoHomeStayImpl.setUserId(userId);

		if (userName == null) {
			accoHomeStayImpl.setUserName("");
		}
		else {
			accoHomeStayImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accoHomeStayImpl.setCreateDate(null);
		}
		else {
			accoHomeStayImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accoHomeStayImpl.setModifiedDate(null);
		}
		else {
			accoHomeStayImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (homeAccoName == null) {
			accoHomeStayImpl.setHomeAccoName("");
		}
		else {
			accoHomeStayImpl.setHomeAccoName(homeAccoName);
		}

		if (homeOwnerName == null) {
			accoHomeStayImpl.setHomeOwnerName("");
		}
		else {
			accoHomeStayImpl.setHomeOwnerName(homeOwnerName);
		}

		if (propertyAddress == null) {
			accoHomeStayImpl.setPropertyAddress("");
		}
		else {
			accoHomeStayImpl.setPropertyAddress(propertyAddress);
		}

		if (homeTeleNo == null) {
			accoHomeStayImpl.setHomeTeleNo("");
		}
		else {
			accoHomeStayImpl.setHomeTeleNo(homeTeleNo);
		}

		if (homeMobile == null) {
			accoHomeStayImpl.setHomeMobile("");
		}
		else {
			accoHomeStayImpl.setHomeMobile(homeMobile);
		}

		if (homeEmail == null) {
			accoHomeStayImpl.setHomeEmail("");
		}
		else {
			accoHomeStayImpl.setHomeEmail(homeEmail);
		}

		if (homeEmployeeNo == null) {
			accoHomeStayImpl.setHomeEmployeeNo("");
		}
		else {
			accoHomeStayImpl.setHomeEmployeeNo(homeEmployeeNo);
		}

		if (website == null) {
			accoHomeStayImpl.setWebsite("");
		}
		else {
			accoHomeStayImpl.setWebsite(website);
		}

		if (propDirection == null) {
			accoHomeStayImpl.setPropDirection("");
		}
		else {
			accoHomeStayImpl.setPropDirection(propDirection);
		}

		if (numOfBedrooms == null) {
			accoHomeStayImpl.setNumOfBedrooms("");
		}
		else {
			accoHomeStayImpl.setNumOfBedrooms(numOfBedrooms);
		}

		if (numOfGuestBedroom == null) {
			accoHomeStayImpl.setNumOfGuestBedroom("");
		}
		else {
			accoHomeStayImpl.setNumOfGuestBedroom(numOfGuestBedroom);
		}

		if (withBathroom == null) {
			accoHomeStayImpl.setWithBathroom("");
		}
		else {
			accoHomeStayImpl.setWithBathroom(withBathroom);
		}

		if (sharedBathroom == null) {
			accoHomeStayImpl.setSharedBathroom("");
		}
		else {
			accoHomeStayImpl.setSharedBathroom(sharedBathroom);
		}

		if (signDate == Long.MIN_VALUE) {
			accoHomeStayImpl.setSignDate(null);
		}
		else {
			accoHomeStayImpl.setSignDate(new Date(signDate));
		}

		if (certifiedBy == null) {
			accoHomeStayImpl.setCertifiedBy("");
		}
		else {
			accoHomeStayImpl.setCertifiedBy(certifiedBy);
		}

		accoHomeStayImpl.setJtbApplicationId(jtbApplicationId);

		accoHomeStayImpl.resetOriginalValues();

		return accoHomeStayImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accoHomeStayId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		homeAccoName = objectInput.readUTF();
		homeOwnerName = objectInput.readUTF();
		propertyAddress = objectInput.readUTF();
		homeTeleNo = objectInput.readUTF();
		homeMobile = objectInput.readUTF();
		homeEmail = objectInput.readUTF();
		homeEmployeeNo = objectInput.readUTF();
		website = objectInput.readUTF();
		propDirection = objectInput.readUTF();
		numOfBedrooms = objectInput.readUTF();
		numOfGuestBedroom = objectInput.readUTF();
		withBathroom = objectInput.readUTF();
		sharedBathroom = objectInput.readUTF();
		signDate = objectInput.readLong();
		certifiedBy = objectInput.readUTF();

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

		objectOutput.writeLong(accoHomeStayId);

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

		if (homeAccoName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeAccoName);
		}

		if (homeOwnerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeOwnerName);
		}

		if (propertyAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyAddress);
		}

		if (homeTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeTeleNo);
		}

		if (homeMobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeMobile);
		}

		if (homeEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeEmail);
		}

		if (homeEmployeeNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeEmployeeNo);
		}

		if (website == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(website);
		}

		if (propDirection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propDirection);
		}

		if (numOfBedrooms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numOfBedrooms);
		}

		if (numOfGuestBedroom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numOfGuestBedroom);
		}

		if (withBathroom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(withBathroom);
		}

		if (sharedBathroom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sharedBathroom);
		}

		objectOutput.writeLong(signDate);

		if (certifiedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certifiedBy);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public String uuid;
	public long accoHomeStayId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String homeAccoName;
	public String homeOwnerName;
	public String propertyAddress;
	public String homeTeleNo;
	public String homeMobile;
	public String homeEmail;
	public String homeEmployeeNo;
	public String website;
	public String propDirection;
	public String numOfBedrooms;
	public String numOfGuestBedroom;
	public String withBathroom;
	public String sharedBathroom;
	public long signDate;
	public String certifiedBy;
	public long jtbApplicationId;

}