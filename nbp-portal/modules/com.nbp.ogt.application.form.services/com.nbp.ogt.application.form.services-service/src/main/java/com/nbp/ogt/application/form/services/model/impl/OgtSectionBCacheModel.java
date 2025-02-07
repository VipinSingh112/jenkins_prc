/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.application.form.services.model.OgtSectionB;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OgtSectionB in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OgtSectionBCacheModel
	implements CacheModel<OgtSectionB>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OgtSectionBCacheModel)) {
			return false;
		}

		OgtSectionBCacheModel ogtSectionBCacheModel =
			(OgtSectionBCacheModel)object;

		if (ogtSectionBId == ogtSectionBCacheModel.ogtSectionBId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtSectionBId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{ogtSectionBId=");
		sb.append(ogtSectionBId);
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
		sb.append(", theDebtor=");
		sb.append(theDebtor);
		sb.append(", name=");
		sb.append(name);
		sb.append(", dateOfInsolvencyOfDebtor=");
		sb.append(dateOfInsolvencyOfDebtor);
		sb.append(", totalValueOfClaim=");
		sb.append(totalValueOfClaim);
		sb.append(", statementOfAccount=");
		sb.append(statementOfAccount);
		sb.append(", unsecuredClaim=");
		sb.append(unsecuredClaim);
		sb.append(", unsecuredClaimOf=");
		sb.append(unsecuredClaimOf);
		sb.append(", regardingTheAmount=");
		sb.append(regardingTheAmount);
		sb.append(", categoryOne=");
		sb.append(categoryOne);
		sb.append(", categoryTwo=");
		sb.append(categoryTwo);
		sb.append(", categoryThree=");
		sb.append(categoryThree);
		sb.append(", categoryFour=");
		sb.append(categoryFour);
		sb.append(", otherPleaseSpecify=");
		sb.append(otherPleaseSpecify);
		sb.append(", securedClaim=");
		sb.append(securedClaim);
		sb.append(", securedClaimOf=");
		sb.append(securedClaimOf);
		sb.append(", description=");
		sb.append(description);
		sb.append(", relationWithDebtor=");
		sb.append(relationWithDebtor);
		sb.append(", bankruptcyEventDescription=");
		sb.append(bankruptcyEventDescription);
		sb.append(", bankruptcyOfAnIndividual=");
		sb.append(bankruptcyOfAnIndividual);
		sb.append(", ogtApplicationId=");
		sb.append(ogtApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OgtSectionB toEntityModel() {
		OgtSectionBImpl ogtSectionBImpl = new OgtSectionBImpl();

		ogtSectionBImpl.setOgtSectionBId(ogtSectionBId);
		ogtSectionBImpl.setGroupId(groupId);
		ogtSectionBImpl.setCompanyId(companyId);
		ogtSectionBImpl.setUserId(userId);

		if (userName == null) {
			ogtSectionBImpl.setUserName("");
		}
		else {
			ogtSectionBImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtSectionBImpl.setCreateDate(null);
		}
		else {
			ogtSectionBImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtSectionBImpl.setModifiedDate(null);
		}
		else {
			ogtSectionBImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (theDebtor == null) {
			ogtSectionBImpl.setTheDebtor("");
		}
		else {
			ogtSectionBImpl.setTheDebtor(theDebtor);
		}

		if (name == null) {
			ogtSectionBImpl.setName("");
		}
		else {
			ogtSectionBImpl.setName(name);
		}

		if (dateOfInsolvencyOfDebtor == Long.MIN_VALUE) {
			ogtSectionBImpl.setDateOfInsolvencyOfDebtor(null);
		}
		else {
			ogtSectionBImpl.setDateOfInsolvencyOfDebtor(
				new Date(dateOfInsolvencyOfDebtor));
		}

		if (totalValueOfClaim == null) {
			ogtSectionBImpl.setTotalValueOfClaim("");
		}
		else {
			ogtSectionBImpl.setTotalValueOfClaim(totalValueOfClaim);
		}

		if (statementOfAccount == null) {
			ogtSectionBImpl.setStatementOfAccount("");
		}
		else {
			ogtSectionBImpl.setStatementOfAccount(statementOfAccount);
		}

		if (unsecuredClaim == null) {
			ogtSectionBImpl.setUnsecuredClaim("");
		}
		else {
			ogtSectionBImpl.setUnsecuredClaim(unsecuredClaim);
		}

		if (unsecuredClaimOf == null) {
			ogtSectionBImpl.setUnsecuredClaimOf("");
		}
		else {
			ogtSectionBImpl.setUnsecuredClaimOf(unsecuredClaimOf);
		}

		if (regardingTheAmount == null) {
			ogtSectionBImpl.setRegardingTheAmount("");
		}
		else {
			ogtSectionBImpl.setRegardingTheAmount(regardingTheAmount);
		}

		if (categoryOne == null) {
			ogtSectionBImpl.setCategoryOne("");
		}
		else {
			ogtSectionBImpl.setCategoryOne(categoryOne);
		}

		if (categoryTwo == null) {
			ogtSectionBImpl.setCategoryTwo("");
		}
		else {
			ogtSectionBImpl.setCategoryTwo(categoryTwo);
		}

		if (categoryThree == null) {
			ogtSectionBImpl.setCategoryThree("");
		}
		else {
			ogtSectionBImpl.setCategoryThree(categoryThree);
		}

		if (categoryFour == null) {
			ogtSectionBImpl.setCategoryFour("");
		}
		else {
			ogtSectionBImpl.setCategoryFour(categoryFour);
		}

		if (otherPleaseSpecify == null) {
			ogtSectionBImpl.setOtherPleaseSpecify("");
		}
		else {
			ogtSectionBImpl.setOtherPleaseSpecify(otherPleaseSpecify);
		}

		if (securedClaim == null) {
			ogtSectionBImpl.setSecuredClaim("");
		}
		else {
			ogtSectionBImpl.setSecuredClaim(securedClaim);
		}

		if (securedClaimOf == null) {
			ogtSectionBImpl.setSecuredClaimOf("");
		}
		else {
			ogtSectionBImpl.setSecuredClaimOf(securedClaimOf);
		}

		if (description == null) {
			ogtSectionBImpl.setDescription("");
		}
		else {
			ogtSectionBImpl.setDescription(description);
		}

		if (relationWithDebtor == null) {
			ogtSectionBImpl.setRelationWithDebtor("");
		}
		else {
			ogtSectionBImpl.setRelationWithDebtor(relationWithDebtor);
		}

		if (bankruptcyEventDescription == null) {
			ogtSectionBImpl.setBankruptcyEventDescription("");
		}
		else {
			ogtSectionBImpl.setBankruptcyEventDescription(
				bankruptcyEventDescription);
		}

		if (bankruptcyOfAnIndividual == null) {
			ogtSectionBImpl.setBankruptcyOfAnIndividual("");
		}
		else {
			ogtSectionBImpl.setBankruptcyOfAnIndividual(
				bankruptcyOfAnIndividual);
		}

		ogtSectionBImpl.setOgtApplicationId(ogtApplicationId);

		ogtSectionBImpl.resetOriginalValues();

		return ogtSectionBImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ogtSectionBId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		theDebtor = objectInput.readUTF();
		name = objectInput.readUTF();
		dateOfInsolvencyOfDebtor = objectInput.readLong();
		totalValueOfClaim = objectInput.readUTF();
		statementOfAccount = objectInput.readUTF();
		unsecuredClaim = objectInput.readUTF();
		unsecuredClaimOf = objectInput.readUTF();
		regardingTheAmount = objectInput.readUTF();
		categoryOne = objectInput.readUTF();
		categoryTwo = objectInput.readUTF();
		categoryThree = objectInput.readUTF();
		categoryFour = objectInput.readUTF();
		otherPleaseSpecify = objectInput.readUTF();
		securedClaim = objectInput.readUTF();
		securedClaimOf = objectInput.readUTF();
		description = objectInput.readUTF();
		relationWithDebtor = objectInput.readUTF();
		bankruptcyEventDescription = objectInput.readUTF();
		bankruptcyOfAnIndividual = objectInput.readUTF();

		ogtApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ogtSectionBId);

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

		if (theDebtor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(theDebtor);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(dateOfInsolvencyOfDebtor);

		if (totalValueOfClaim == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalValueOfClaim);
		}

		if (statementOfAccount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statementOfAccount);
		}

		if (unsecuredClaim == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredClaim);
		}

		if (unsecuredClaimOf == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsecuredClaimOf);
		}

		if (regardingTheAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(regardingTheAmount);
		}

		if (categoryOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoryOne);
		}

		if (categoryTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoryTwo);
		}

		if (categoryThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoryThree);
		}

		if (categoryFour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoryFour);
		}

		if (otherPleaseSpecify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherPleaseSpecify);
		}

		if (securedClaim == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedClaim);
		}

		if (securedClaimOf == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securedClaimOf);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (relationWithDebtor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(relationWithDebtor);
		}

		if (bankruptcyEventDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bankruptcyEventDescription);
		}

		if (bankruptcyOfAnIndividual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bankruptcyOfAnIndividual);
		}

		objectOutput.writeLong(ogtApplicationId);
	}

	public long ogtSectionBId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String theDebtor;
	public String name;
	public long dateOfInsolvencyOfDebtor;
	public String totalValueOfClaim;
	public String statementOfAccount;
	public String unsecuredClaim;
	public String unsecuredClaimOf;
	public String regardingTheAmount;
	public String categoryOne;
	public String categoryTwo;
	public String categoryThree;
	public String categoryFour;
	public String otherPleaseSpecify;
	public String securedClaim;
	public String securedClaimOf;
	public String description;
	public String relationWithDebtor;
	public String bankruptcyEventDescription;
	public String bankruptcyOfAnIndividual;
	public long ogtApplicationId;

}