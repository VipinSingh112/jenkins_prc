/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCInformationRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCInformationRequest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCInformationRequestCacheModel
	implements CacheModel<JADSCInformationRequest>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCInformationRequestCacheModel)) {
			return false;
		}

		JADSCInformationRequestCacheModel jadscInformationRequestCacheModel =
			(JADSCInformationRequestCacheModel)object;

		if (jadscInfoRequestId ==
				jadscInformationRequestCacheModel.jadscInfoRequestId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscInfoRequestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(67);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscInfoRequestId=");
		sb.append(jadscInfoRequestId);
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
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", mainTelephone=");
		sb.append(mainTelephone);
		sb.append(", officeTelephone=");
		sb.append(officeTelephone);
		sb.append(", cellTelephone=");
		sb.append(cellTelephone);
		sb.append(", otherContact=");
		sb.append(otherContact);
		sb.append(", whatsappTelephone=");
		sb.append(whatsappTelephone);
		sb.append(", emailContact=");
		sb.append(emailContact);
		sb.append(", contactPerName=");
		sb.append(contactPerName);
		sb.append(", contactPerPosition=");
		sb.append(contactPerPosition);
		sb.append(", contactPerPhone=");
		sb.append(contactPerPhone);
		sb.append(", contactPerEmail=");
		sb.append(contactPerEmail);
		sb.append(", altContactPerName=");
		sb.append(altContactPerName);
		sb.append(", altContactPerPosition=");
		sb.append(altContactPerPosition);
		sb.append(", altContactPerPhone=");
		sb.append(altContactPerPhone);
		sb.append(", altContactPerEmail=");
		sb.append(altContactPerEmail);
		sb.append(", comOperationYear=");
		sb.append(comOperationYear);
		sb.append(", products=");
		sb.append(products);
		sb.append(", marketSharePer=");
		sb.append(marketSharePer);
		sb.append(", tradeRemedyMeasure=");
		sb.append(tradeRemedyMeasure);
		sb.append(", fiveYearsInvestment=");
		sb.append(fiveYearsInvestment);
		sb.append(", planCapacity=");
		sb.append(planCapacity);
		sb.append(", growthProjection=");
		sb.append(growthProjection);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCInformationRequest toEntityModel() {
		JADSCInformationRequestImpl jadscInformationRequestImpl =
			new JADSCInformationRequestImpl();

		if (uuid == null) {
			jadscInformationRequestImpl.setUuid("");
		}
		else {
			jadscInformationRequestImpl.setUuid(uuid);
		}

		jadscInformationRequestImpl.setJadscInfoRequestId(jadscInfoRequestId);
		jadscInformationRequestImpl.setGroupId(groupId);
		jadscInformationRequestImpl.setCompanyId(companyId);
		jadscInformationRequestImpl.setUserId(userId);

		if (userName == null) {
			jadscInformationRequestImpl.setUserName("");
		}
		else {
			jadscInformationRequestImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscInformationRequestImpl.setCreateDate(null);
		}
		else {
			jadscInformationRequestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscInformationRequestImpl.setModifiedDate(null);
		}
		else {
			jadscInformationRequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			jadscInformationRequestImpl.setEntityId("");
		}
		else {
			jadscInformationRequestImpl.setEntityId(entityId);
		}

		if (companyName == null) {
			jadscInformationRequestImpl.setCompanyName("");
		}
		else {
			jadscInformationRequestImpl.setCompanyName(companyName);
		}

		if (address == null) {
			jadscInformationRequestImpl.setAddress("");
		}
		else {
			jadscInformationRequestImpl.setAddress(address);
		}

		if (mainTelephone == null) {
			jadscInformationRequestImpl.setMainTelephone("");
		}
		else {
			jadscInformationRequestImpl.setMainTelephone(mainTelephone);
		}

		if (officeTelephone == null) {
			jadscInformationRequestImpl.setOfficeTelephone("");
		}
		else {
			jadscInformationRequestImpl.setOfficeTelephone(officeTelephone);
		}

		if (cellTelephone == null) {
			jadscInformationRequestImpl.setCellTelephone("");
		}
		else {
			jadscInformationRequestImpl.setCellTelephone(cellTelephone);
		}

		if (otherContact == null) {
			jadscInformationRequestImpl.setOtherContact("");
		}
		else {
			jadscInformationRequestImpl.setOtherContact(otherContact);
		}

		if (whatsappTelephone == null) {
			jadscInformationRequestImpl.setWhatsappTelephone("");
		}
		else {
			jadscInformationRequestImpl.setWhatsappTelephone(whatsappTelephone);
		}

		if (emailContact == null) {
			jadscInformationRequestImpl.setEmailContact("");
		}
		else {
			jadscInformationRequestImpl.setEmailContact(emailContact);
		}

		if (contactPerName == null) {
			jadscInformationRequestImpl.setContactPerName("");
		}
		else {
			jadscInformationRequestImpl.setContactPerName(contactPerName);
		}

		if (contactPerPosition == null) {
			jadscInformationRequestImpl.setContactPerPosition("");
		}
		else {
			jadscInformationRequestImpl.setContactPerPosition(
				contactPerPosition);
		}

		if (contactPerPhone == null) {
			jadscInformationRequestImpl.setContactPerPhone("");
		}
		else {
			jadscInformationRequestImpl.setContactPerPhone(contactPerPhone);
		}

		if (contactPerEmail == null) {
			jadscInformationRequestImpl.setContactPerEmail("");
		}
		else {
			jadscInformationRequestImpl.setContactPerEmail(contactPerEmail);
		}

		if (altContactPerName == null) {
			jadscInformationRequestImpl.setAltContactPerName("");
		}
		else {
			jadscInformationRequestImpl.setAltContactPerName(altContactPerName);
		}

		if (altContactPerPosition == null) {
			jadscInformationRequestImpl.setAltContactPerPosition("");
		}
		else {
			jadscInformationRequestImpl.setAltContactPerPosition(
				altContactPerPosition);
		}

		if (altContactPerPhone == null) {
			jadscInformationRequestImpl.setAltContactPerPhone("");
		}
		else {
			jadscInformationRequestImpl.setAltContactPerPhone(
				altContactPerPhone);
		}

		if (altContactPerEmail == null) {
			jadscInformationRequestImpl.setAltContactPerEmail("");
		}
		else {
			jadscInformationRequestImpl.setAltContactPerEmail(
				altContactPerEmail);
		}

		if (comOperationYear == null) {
			jadscInformationRequestImpl.setComOperationYear("");
		}
		else {
			jadscInformationRequestImpl.setComOperationYear(comOperationYear);
		}

		if (products == null) {
			jadscInformationRequestImpl.setProducts("");
		}
		else {
			jadscInformationRequestImpl.setProducts(products);
		}

		if (marketSharePer == null) {
			jadscInformationRequestImpl.setMarketSharePer("");
		}
		else {
			jadscInformationRequestImpl.setMarketSharePer(marketSharePer);
		}

		if (tradeRemedyMeasure == null) {
			jadscInformationRequestImpl.setTradeRemedyMeasure("");
		}
		else {
			jadscInformationRequestImpl.setTradeRemedyMeasure(
				tradeRemedyMeasure);
		}

		if (fiveYearsInvestment == null) {
			jadscInformationRequestImpl.setFiveYearsInvestment("");
		}
		else {
			jadscInformationRequestImpl.setFiveYearsInvestment(
				fiveYearsInvestment);
		}

		if (planCapacity == null) {
			jadscInformationRequestImpl.setPlanCapacity("");
		}
		else {
			jadscInformationRequestImpl.setPlanCapacity(planCapacity);
		}

		if (growthProjection == null) {
			jadscInformationRequestImpl.setGrowthProjection("");
		}
		else {
			jadscInformationRequestImpl.setGrowthProjection(growthProjection);
		}

		jadscInformationRequestImpl.setJadscApplicationId(jadscApplicationId);

		jadscInformationRequestImpl.resetOriginalValues();

		return jadscInformationRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscInfoRequestId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		companyName = objectInput.readUTF();
		address = objectInput.readUTF();
		mainTelephone = objectInput.readUTF();
		officeTelephone = objectInput.readUTF();
		cellTelephone = objectInput.readUTF();
		otherContact = objectInput.readUTF();
		whatsappTelephone = objectInput.readUTF();
		emailContact = objectInput.readUTF();
		contactPerName = objectInput.readUTF();
		contactPerPosition = objectInput.readUTF();
		contactPerPhone = objectInput.readUTF();
		contactPerEmail = objectInput.readUTF();
		altContactPerName = objectInput.readUTF();
		altContactPerPosition = objectInput.readUTF();
		altContactPerPhone = objectInput.readUTF();
		altContactPerEmail = objectInput.readUTF();
		comOperationYear = objectInput.readUTF();
		products = objectInput.readUTF();
		marketSharePer = objectInput.readUTF();
		tradeRemedyMeasure = objectInput.readUTF();
		fiveYearsInvestment = objectInput.readUTF();
		planCapacity = objectInput.readUTF();
		growthProjection = objectInput.readUTF();

		jadscApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jadscInfoRequestId);

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

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (mainTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mainTelephone);
		}

		if (officeTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officeTelephone);
		}

		if (cellTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cellTelephone);
		}

		if (otherContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherContact);
		}

		if (whatsappTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(whatsappTelephone);
		}

		if (emailContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailContact);
		}

		if (contactPerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPerName);
		}

		if (contactPerPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPerPosition);
		}

		if (contactPerPhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPerPhone);
		}

		if (contactPerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPerEmail);
		}

		if (altContactPerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(altContactPerName);
		}

		if (altContactPerPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(altContactPerPosition);
		}

		if (altContactPerPhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(altContactPerPhone);
		}

		if (altContactPerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(altContactPerEmail);
		}

		if (comOperationYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comOperationYear);
		}

		if (products == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(products);
		}

		if (marketSharePer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(marketSharePer);
		}

		if (tradeRemedyMeasure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tradeRemedyMeasure);
		}

		if (fiveYearsInvestment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fiveYearsInvestment);
		}

		if (planCapacity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(planCapacity);
		}

		if (growthProjection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(growthProjection);
		}

		objectOutput.writeLong(jadscApplicationId);
	}

	public String uuid;
	public long jadscInfoRequestId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String companyName;
	public String address;
	public String mainTelephone;
	public String officeTelephone;
	public String cellTelephone;
	public String otherContact;
	public String whatsappTelephone;
	public String emailContact;
	public String contactPerName;
	public String contactPerPosition;
	public String contactPerPhone;
	public String contactPerEmail;
	public String altContactPerName;
	public String altContactPerPosition;
	public String altContactPerPhone;
	public String altContactPerEmail;
	public String comOperationYear;
	public String products;
	public String marketSharePer;
	public String tradeRemedyMeasure;
	public String fiveYearsInvestment;
	public String planCapacity;
	public String growthProjection;
	public long jadscApplicationId;

}