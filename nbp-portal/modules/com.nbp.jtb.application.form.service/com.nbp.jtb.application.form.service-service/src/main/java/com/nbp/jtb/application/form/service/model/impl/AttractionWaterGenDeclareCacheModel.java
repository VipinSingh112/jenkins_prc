/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionWaterGenDeclare in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionWaterGenDeclareCacheModel
	implements CacheModel<AttractionWaterGenDeclare>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionWaterGenDeclareCacheModel)) {
			return false;
		}

		AttractionWaterGenDeclareCacheModel
			attractionWaterGenDeclareCacheModel =
				(AttractionWaterGenDeclareCacheModel)object;

		if (attractionWaterGenDeclareId ==
				attractionWaterGenDeclareCacheModel.
					attractionWaterGenDeclareId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionWaterGenDeclareId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{attractionWaterGenDeclareId=");
		sb.append(attractionWaterGenDeclareId);
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
		sb.append(", firstAid=");
		sb.append(firstAid);
		sb.append(", cpr=");
		sb.append(cpr);
		sb.append(", divingCertificate=");
		sb.append(divingCertificate);
		sb.append(", rlss=");
		sb.append(rlss);
		sb.append(", lifeguard=");
		sb.append(lifeguard);
		sb.append(", breathing=");
		sb.append(breathing);
		sb.append(", operationName=");
		sb.append(operationName);
		sb.append(", operationAddress=");
		sb.append(operationAddress);
		sb.append(", insuranceAmount=");
		sb.append(insuranceAmount);
		sb.append(", managerSignDate=");
		sb.append(managerSignDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionWaterGenDeclare toEntityModel() {
		AttractionWaterGenDeclareImpl attractionWaterGenDeclareImpl =
			new AttractionWaterGenDeclareImpl();

		attractionWaterGenDeclareImpl.setAttractionWaterGenDeclareId(
			attractionWaterGenDeclareId);
		attractionWaterGenDeclareImpl.setGroupId(groupId);
		attractionWaterGenDeclareImpl.setCompanyId(companyId);
		attractionWaterGenDeclareImpl.setUserId(userId);

		if (userName == null) {
			attractionWaterGenDeclareImpl.setUserName("");
		}
		else {
			attractionWaterGenDeclareImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionWaterGenDeclareImpl.setCreateDate(null);
		}
		else {
			attractionWaterGenDeclareImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionWaterGenDeclareImpl.setModifiedDate(null);
		}
		else {
			attractionWaterGenDeclareImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (firstAid == null) {
			attractionWaterGenDeclareImpl.setFirstAid("");
		}
		else {
			attractionWaterGenDeclareImpl.setFirstAid(firstAid);
		}

		if (cpr == null) {
			attractionWaterGenDeclareImpl.setCpr("");
		}
		else {
			attractionWaterGenDeclareImpl.setCpr(cpr);
		}

		if (divingCertificate == null) {
			attractionWaterGenDeclareImpl.setDivingCertificate("");
		}
		else {
			attractionWaterGenDeclareImpl.setDivingCertificate(
				divingCertificate);
		}

		if (rlss == null) {
			attractionWaterGenDeclareImpl.setRlss("");
		}
		else {
			attractionWaterGenDeclareImpl.setRlss(rlss);
		}

		if (lifeguard == null) {
			attractionWaterGenDeclareImpl.setLifeguard("");
		}
		else {
			attractionWaterGenDeclareImpl.setLifeguard(lifeguard);
		}

		if (breathing == null) {
			attractionWaterGenDeclareImpl.setBreathing("");
		}
		else {
			attractionWaterGenDeclareImpl.setBreathing(breathing);
		}

		if (operationName == null) {
			attractionWaterGenDeclareImpl.setOperationName("");
		}
		else {
			attractionWaterGenDeclareImpl.setOperationName(operationName);
		}

		if (operationAddress == null) {
			attractionWaterGenDeclareImpl.setOperationAddress("");
		}
		else {
			attractionWaterGenDeclareImpl.setOperationAddress(operationAddress);
		}

		if (insuranceAmount == null) {
			attractionWaterGenDeclareImpl.setInsuranceAmount("");
		}
		else {
			attractionWaterGenDeclareImpl.setInsuranceAmount(insuranceAmount);
		}

		if (managerSignDate == Long.MIN_VALUE) {
			attractionWaterGenDeclareImpl.setManagerSignDate(null);
		}
		else {
			attractionWaterGenDeclareImpl.setManagerSignDate(
				new Date(managerSignDate));
		}

		attractionWaterGenDeclareImpl.setJtbApplicationId(jtbApplicationId);

		attractionWaterGenDeclareImpl.resetOriginalValues();

		return attractionWaterGenDeclareImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionWaterGenDeclareId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstAid = objectInput.readUTF();
		cpr = objectInput.readUTF();
		divingCertificate = objectInput.readUTF();
		rlss = objectInput.readUTF();
		lifeguard = objectInput.readUTF();
		breathing = objectInput.readUTF();
		operationName = objectInput.readUTF();
		operationAddress = objectInput.readUTF();
		insuranceAmount = objectInput.readUTF();
		managerSignDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionWaterGenDeclareId);

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

		if (firstAid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstAid);
		}

		if (cpr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cpr);
		}

		if (divingCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(divingCertificate);
		}

		if (rlss == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rlss);
		}

		if (lifeguard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lifeguard);
		}

		if (breathing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(breathing);
		}

		if (operationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operationName);
		}

		if (operationAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operationAddress);
		}

		if (insuranceAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insuranceAmount);
		}

		objectOutput.writeLong(managerSignDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionWaterGenDeclareId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstAid;
	public String cpr;
	public String divingCertificate;
	public String rlss;
	public String lifeguard;
	public String breathing;
	public String operationName;
	public String operationAddress;
	public String insuranceAmount;
	public long managerSignDate;
	public long jtbApplicationId;

}