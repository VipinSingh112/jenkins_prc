/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccThirdPartyScope;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccThirdPartyScope in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccThirdPartyScopeCacheModel
	implements CacheModel<AccThirdPartyScope>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccThirdPartyScopeCacheModel)) {
			return false;
		}

		AccThirdPartyScopeCacheModel accThirdPartyScopeCacheModel =
			(AccThirdPartyScopeCacheModel)object;

		if (accThirdPartyScopeId ==
				accThirdPartyScopeCacheModel.accThirdPartyScopeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accThirdPartyScopeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(95);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accThirdPartyScopeId=");
		sb.append(accThirdPartyScopeId);
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
		sb.append(", accreditationCategory=");
		sb.append(accreditationCategory);
		sb.append(", foodProduct1=");
		sb.append(foodProduct1);
		sb.append(", foodRegulation1=");
		sb.append(foodRegulation1);
		sb.append(", foodProduct2=");
		sb.append(foodProduct2);
		sb.append(", foodRegulation2=");
		sb.append(foodRegulation2);
		sb.append(", foodProduct3=");
		sb.append(foodProduct3);
		sb.append(", foodRegulation3=");
		sb.append(foodRegulation3);
		sb.append(", foodProduct4=");
		sb.append(foodProduct4);
		sb.append(", foodRegulation4=");
		sb.append(foodRegulation4);
		sb.append(", foodProduct5=");
		sb.append(foodProduct5);
		sb.append(", foodRegulation5=");
		sb.append(foodRegulation5);
		sb.append(", foodProduct6=");
		sb.append(foodProduct6);
		sb.append(", foodRegulation6=");
		sb.append(foodRegulation6);
		sb.append(", foodProduct7=");
		sb.append(foodProduct7);
		sb.append(", foodRegulation7=");
		sb.append(foodRegulation7);
		sb.append(", foodProduct8=");
		sb.append(foodProduct8);
		sb.append(", foodRegulation8=");
		sb.append(foodRegulation8);
		sb.append(", foodProduct9=");
		sb.append(foodProduct9);
		sb.append(", foodRegulation9=");
		sb.append(foodRegulation9);
		sb.append(", foodProduct10=");
		sb.append(foodProduct10);
		sb.append(", foodRegulation10=");
		sb.append(foodRegulation10);
		sb.append(", accCategoryOther=");
		sb.append(accCategoryOther);
		sb.append(", foodProduct11=");
		sb.append(foodProduct11);
		sb.append(", foodRegulation11=");
		sb.append(foodRegulation11);
		sb.append(", accCategoryOther12=");
		sb.append(accCategoryOther12);
		sb.append(", foodProduct12=");
		sb.append(foodProduct12);
		sb.append(", foodRegulation12=");
		sb.append(foodRegulation12);
		sb.append(", cerIntrestedParties=");
		sb.append(cerIntrestedParties);
		sb.append(", otherServices=");
		sb.append(otherServices);
		sb.append(", otherServicesDescribe=");
		sb.append(otherServicesDescribe);
		sb.append(", establishedRelation=");
		sb.append(establishedRelation);
		sb.append(", establishedRelDesc=");
		sb.append(establishedRelDesc);
		sb.append(", clientService=");
		sb.append(clientService);
		sb.append(", certificationCerBody=");
		sb.append(certificationCerBody);
		sb.append(", orgAccredited=");
		sb.append(orgAccredited);
		sb.append(", responsibleBody=");
		sb.append(responsibleBody);
		sb.append(", accExpDate=");
		sb.append(accExpDate);
		sb.append(", certBodyScope=");
		sb.append(certBodyScope);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccThirdPartyScope toEntityModel() {
		AccThirdPartyScopeImpl accThirdPartyScopeImpl =
			new AccThirdPartyScopeImpl();

		if (uuid == null) {
			accThirdPartyScopeImpl.setUuid("");
		}
		else {
			accThirdPartyScopeImpl.setUuid(uuid);
		}

		accThirdPartyScopeImpl.setAccThirdPartyScopeId(accThirdPartyScopeId);
		accThirdPartyScopeImpl.setGroupId(groupId);
		accThirdPartyScopeImpl.setCompanyId(companyId);
		accThirdPartyScopeImpl.setUserId(userId);

		if (userName == null) {
			accThirdPartyScopeImpl.setUserName("");
		}
		else {
			accThirdPartyScopeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accThirdPartyScopeImpl.setCreateDate(null);
		}
		else {
			accThirdPartyScopeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accThirdPartyScopeImpl.setModifiedDate(null);
		}
		else {
			accThirdPartyScopeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (accreditationCategory == null) {
			accThirdPartyScopeImpl.setAccreditationCategory("");
		}
		else {
			accThirdPartyScopeImpl.setAccreditationCategory(
				accreditationCategory);
		}

		if (foodProduct1 == null) {
			accThirdPartyScopeImpl.setFoodProduct1("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct1(foodProduct1);
		}

		if (foodRegulation1 == null) {
			accThirdPartyScopeImpl.setFoodRegulation1("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation1(foodRegulation1);
		}

		if (foodProduct2 == null) {
			accThirdPartyScopeImpl.setFoodProduct2("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct2(foodProduct2);
		}

		if (foodRegulation2 == null) {
			accThirdPartyScopeImpl.setFoodRegulation2("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation2(foodRegulation2);
		}

		if (foodProduct3 == null) {
			accThirdPartyScopeImpl.setFoodProduct3("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct3(foodProduct3);
		}

		if (foodRegulation3 == null) {
			accThirdPartyScopeImpl.setFoodRegulation3("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation3(foodRegulation3);
		}

		if (foodProduct4 == null) {
			accThirdPartyScopeImpl.setFoodProduct4("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct4(foodProduct4);
		}

		if (foodRegulation4 == null) {
			accThirdPartyScopeImpl.setFoodRegulation4("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation4(foodRegulation4);
		}

		if (foodProduct5 == null) {
			accThirdPartyScopeImpl.setFoodProduct5("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct5(foodProduct5);
		}

		if (foodRegulation5 == null) {
			accThirdPartyScopeImpl.setFoodRegulation5("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation5(foodRegulation5);
		}

		if (foodProduct6 == null) {
			accThirdPartyScopeImpl.setFoodProduct6("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct6(foodProduct6);
		}

		if (foodRegulation6 == null) {
			accThirdPartyScopeImpl.setFoodRegulation6("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation6(foodRegulation6);
		}

		if (foodProduct7 == null) {
			accThirdPartyScopeImpl.setFoodProduct7("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct7(foodProduct7);
		}

		if (foodRegulation7 == null) {
			accThirdPartyScopeImpl.setFoodRegulation7("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation7(foodRegulation7);
		}

		if (foodProduct8 == null) {
			accThirdPartyScopeImpl.setFoodProduct8("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct8(foodProduct8);
		}

		if (foodRegulation8 == null) {
			accThirdPartyScopeImpl.setFoodRegulation8("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation8(foodRegulation8);
		}

		if (foodProduct9 == null) {
			accThirdPartyScopeImpl.setFoodProduct9("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct9(foodProduct9);
		}

		if (foodRegulation9 == null) {
			accThirdPartyScopeImpl.setFoodRegulation9("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation9(foodRegulation9);
		}

		if (foodProduct10 == null) {
			accThirdPartyScopeImpl.setFoodProduct10("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct10(foodProduct10);
		}

		if (foodRegulation10 == null) {
			accThirdPartyScopeImpl.setFoodRegulation10("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation10(foodRegulation10);
		}

		if (accCategoryOther == null) {
			accThirdPartyScopeImpl.setAccCategoryOther("");
		}
		else {
			accThirdPartyScopeImpl.setAccCategoryOther(accCategoryOther);
		}

		if (foodProduct11 == null) {
			accThirdPartyScopeImpl.setFoodProduct11("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct11(foodProduct11);
		}

		if (foodRegulation11 == null) {
			accThirdPartyScopeImpl.setFoodRegulation11("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation11(foodRegulation11);
		}

		if (accCategoryOther12 == null) {
			accThirdPartyScopeImpl.setAccCategoryOther12("");
		}
		else {
			accThirdPartyScopeImpl.setAccCategoryOther12(accCategoryOther12);
		}

		if (foodProduct12 == null) {
			accThirdPartyScopeImpl.setFoodProduct12("");
		}
		else {
			accThirdPartyScopeImpl.setFoodProduct12(foodProduct12);
		}

		if (foodRegulation12 == null) {
			accThirdPartyScopeImpl.setFoodRegulation12("");
		}
		else {
			accThirdPartyScopeImpl.setFoodRegulation12(foodRegulation12);
		}

		if (cerIntrestedParties == null) {
			accThirdPartyScopeImpl.setCerIntrestedParties("");
		}
		else {
			accThirdPartyScopeImpl.setCerIntrestedParties(cerIntrestedParties);
		}

		if (otherServices == null) {
			accThirdPartyScopeImpl.setOtherServices("");
		}
		else {
			accThirdPartyScopeImpl.setOtherServices(otherServices);
		}

		if (otherServicesDescribe == null) {
			accThirdPartyScopeImpl.setOtherServicesDescribe("");
		}
		else {
			accThirdPartyScopeImpl.setOtherServicesDescribe(
				otherServicesDescribe);
		}

		if (establishedRelation == null) {
			accThirdPartyScopeImpl.setEstablishedRelation("");
		}
		else {
			accThirdPartyScopeImpl.setEstablishedRelation(establishedRelation);
		}

		if (establishedRelDesc == null) {
			accThirdPartyScopeImpl.setEstablishedRelDesc("");
		}
		else {
			accThirdPartyScopeImpl.setEstablishedRelDesc(establishedRelDesc);
		}

		if (clientService == null) {
			accThirdPartyScopeImpl.setClientService("");
		}
		else {
			accThirdPartyScopeImpl.setClientService(clientService);
		}

		if (certificationCerBody == null) {
			accThirdPartyScopeImpl.setCertificationCerBody("");
		}
		else {
			accThirdPartyScopeImpl.setCertificationCerBody(
				certificationCerBody);
		}

		if (orgAccredited == null) {
			accThirdPartyScopeImpl.setOrgAccredited("");
		}
		else {
			accThirdPartyScopeImpl.setOrgAccredited(orgAccredited);
		}

		if (responsibleBody == null) {
			accThirdPartyScopeImpl.setResponsibleBody("");
		}
		else {
			accThirdPartyScopeImpl.setResponsibleBody(responsibleBody);
		}

		if (accExpDate == Long.MIN_VALUE) {
			accThirdPartyScopeImpl.setAccExpDate(null);
		}
		else {
			accThirdPartyScopeImpl.setAccExpDate(new Date(accExpDate));
		}

		if (certBodyScope == null) {
			accThirdPartyScopeImpl.setCertBodyScope("");
		}
		else {
			accThirdPartyScopeImpl.setCertBodyScope(certBodyScope);
		}

		accThirdPartyScopeImpl.setJanaacApplicationId(janaacApplicationId);

		accThirdPartyScopeImpl.resetOriginalValues();

		return accThirdPartyScopeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accThirdPartyScopeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		accreditationCategory = objectInput.readUTF();
		foodProduct1 = objectInput.readUTF();
		foodRegulation1 = objectInput.readUTF();
		foodProduct2 = objectInput.readUTF();
		foodRegulation2 = objectInput.readUTF();
		foodProduct3 = objectInput.readUTF();
		foodRegulation3 = objectInput.readUTF();
		foodProduct4 = objectInput.readUTF();
		foodRegulation4 = objectInput.readUTF();
		foodProduct5 = objectInput.readUTF();
		foodRegulation5 = objectInput.readUTF();
		foodProduct6 = objectInput.readUTF();
		foodRegulation6 = objectInput.readUTF();
		foodProduct7 = objectInput.readUTF();
		foodRegulation7 = objectInput.readUTF();
		foodProduct8 = objectInput.readUTF();
		foodRegulation8 = objectInput.readUTF();
		foodProduct9 = objectInput.readUTF();
		foodRegulation9 = objectInput.readUTF();
		foodProduct10 = objectInput.readUTF();
		foodRegulation10 = objectInput.readUTF();
		accCategoryOther = objectInput.readUTF();
		foodProduct11 = objectInput.readUTF();
		foodRegulation11 = objectInput.readUTF();
		accCategoryOther12 = objectInput.readUTF();
		foodProduct12 = objectInput.readUTF();
		foodRegulation12 = objectInput.readUTF();
		cerIntrestedParties = objectInput.readUTF();
		otherServices = objectInput.readUTF();
		otherServicesDescribe = objectInput.readUTF();
		establishedRelation = objectInput.readUTF();
		establishedRelDesc = objectInput.readUTF();
		clientService = objectInput.readUTF();
		certificationCerBody = objectInput.readUTF();
		orgAccredited = objectInput.readUTF();
		responsibleBody = objectInput.readUTF();
		accExpDate = objectInput.readLong();
		certBodyScope = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accThirdPartyScopeId);

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

		if (accreditationCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accreditationCategory);
		}

		if (foodProduct1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct1);
		}

		if (foodRegulation1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation1);
		}

		if (foodProduct2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct2);
		}

		if (foodRegulation2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation2);
		}

		if (foodProduct3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct3);
		}

		if (foodRegulation3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation3);
		}

		if (foodProduct4 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct4);
		}

		if (foodRegulation4 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation4);
		}

		if (foodProduct5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct5);
		}

		if (foodRegulation5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation5);
		}

		if (foodProduct6 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct6);
		}

		if (foodRegulation6 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation6);
		}

		if (foodProduct7 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct7);
		}

		if (foodRegulation7 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation7);
		}

		if (foodProduct8 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct8);
		}

		if (foodRegulation8 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation8);
		}

		if (foodProduct9 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct9);
		}

		if (foodRegulation9 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation9);
		}

		if (foodProduct10 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct10);
		}

		if (foodRegulation10 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation10);
		}

		if (accCategoryOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accCategoryOther);
		}

		if (foodProduct11 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct11);
		}

		if (foodRegulation11 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation11);
		}

		if (accCategoryOther12 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accCategoryOther12);
		}

		if (foodProduct12 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProduct12);
		}

		if (foodRegulation12 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodRegulation12);
		}

		if (cerIntrestedParties == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cerIntrestedParties);
		}

		if (otherServices == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherServices);
		}

		if (otherServicesDescribe == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherServicesDescribe);
		}

		if (establishedRelation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(establishedRelation);
		}

		if (establishedRelDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(establishedRelDesc);
		}

		if (clientService == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(clientService);
		}

		if (certificationCerBody == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationCerBody);
		}

		if (orgAccredited == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgAccredited);
		}

		if (responsibleBody == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(responsibleBody);
		}

		objectOutput.writeLong(accExpDate);

		if (certBodyScope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certBodyScope);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accThirdPartyScopeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String accreditationCategory;
	public String foodProduct1;
	public String foodRegulation1;
	public String foodProduct2;
	public String foodRegulation2;
	public String foodProduct3;
	public String foodRegulation3;
	public String foodProduct4;
	public String foodRegulation4;
	public String foodProduct5;
	public String foodRegulation5;
	public String foodProduct6;
	public String foodRegulation6;
	public String foodProduct7;
	public String foodRegulation7;
	public String foodProduct8;
	public String foodRegulation8;
	public String foodProduct9;
	public String foodRegulation9;
	public String foodProduct10;
	public String foodRegulation10;
	public String accCategoryOther;
	public String foodProduct11;
	public String foodRegulation11;
	public String accCategoryOther12;
	public String foodProduct12;
	public String foodRegulation12;
	public String cerIntrestedParties;
	public String otherServices;
	public String otherServicesDescribe;
	public String establishedRelation;
	public String establishedRelDesc;
	public String clientService;
	public String certificationCerBody;
	public String orgAccredited;
	public String responsibleBody;
	public long accExpDate;
	public String certBodyScope;
	public long janaacApplicationId;

}