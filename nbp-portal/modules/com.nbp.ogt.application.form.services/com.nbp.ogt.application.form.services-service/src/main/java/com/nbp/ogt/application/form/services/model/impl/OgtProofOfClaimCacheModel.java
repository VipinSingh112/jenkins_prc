/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.application.form.services.model.OgtProofOfClaim;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OgtProofOfClaim in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OgtProofOfClaimCacheModel
	implements CacheModel<OgtProofOfClaim>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OgtProofOfClaimCacheModel)) {
			return false;
		}

		OgtProofOfClaimCacheModel ogtProofOfClaimCacheModel =
			(OgtProofOfClaimCacheModel)object;

		if (ogtProofOfClaimId == ogtProofOfClaimCacheModel.ogtProofOfClaimId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtProofOfClaimId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(75);

		sb.append("{ogtProofOfClaimId=");
		sb.append(ogtProofOfClaimId);
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
		sb.append(", claimProofMatter=");
		sb.append(claimProofMatter);
		sb.append(", claimDebtorName=");
		sb.append(claimDebtorName);
		sb.append(", claimantName=");
		sb.append(claimantName);
		sb.append(", claimSentAddress=");
		sb.append(claimSentAddress);
		sb.append(", claimSentPhoneNum=");
		sb.append(claimSentPhoneNum);
		sb.append(", claimSentFaxNo=");
		sb.append(claimSentFaxNo);
		sb.append(", claimSentEmailAddr=");
		sb.append(claimSentEmailAddr);
		sb.append(", claimCompName=");
		sb.append(claimCompName);
		sb.append(", claimCertifyCheck=");
		sb.append(claimCertifyCheck);
		sb.append(", claimCompPosition=");
		sb.append(claimCompPosition);
		sb.append(", claimName=");
		sb.append(claimName);
		sb.append(", claimByCredDebtor=");
		sb.append(claimByCredDebtor);
		sb.append(", claimDateAppli=");
		sb.append(claimDateAppli);
		sb.append(", claimByDebtTotalVal=");
		sb.append(claimByDebtTotalVal);
		sb.append(", claimByDebtStatement=");
		sb.append(claimByDebtStatement);
		sb.append(", claimCategory=");
		sb.append(claimCategory);
		sb.append(", claimUnsecured=");
		sb.append(claimUnsecured);
		sb.append(", claimRegardingAmt=");
		sb.append(claimRegardingAmt);
		sb.append(", indicateCategoryOne=");
		sb.append(indicateCategoryOne);
		sb.append(", indicateCategoryTwo=");
		sb.append(indicateCategoryTwo);
		sb.append(", indicateCategoryThree=");
		sb.append(indicateCategoryThree);
		sb.append(", indicateCategoryFour=");
		sb.append(indicateCategoryFour);
		sb.append(", otherPleaseSpecify=");
		sb.append(otherPleaseSpecify);
		sb.append(", claimSecured=");
		sb.append(claimSecured);
		sb.append(", claimSecuredOne=");
		sb.append(claimSecuredOne);
		sb.append(", claimDesc=");
		sb.append(claimDesc);
		sb.append(", aboveNamedCreditor=");
		sb.append(aboveNamedCreditor);
		sb.append(", paymentDetailDesc=");
		sb.append(paymentDetailDesc);
		sb.append(", inCaseOfBankruptcy=");
		sb.append(inCaseOfBankruptcy);
		sb.append(", ogtApplicationId=");
		sb.append(ogtApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OgtProofOfClaim toEntityModel() {
		OgtProofOfClaimImpl ogtProofOfClaimImpl = new OgtProofOfClaimImpl();

		ogtProofOfClaimImpl.setOgtProofOfClaimId(ogtProofOfClaimId);
		ogtProofOfClaimImpl.setGroupId(groupId);
		ogtProofOfClaimImpl.setCompanyId(companyId);
		ogtProofOfClaimImpl.setUserId(userId);

		if (userName == null) {
			ogtProofOfClaimImpl.setUserName("");
		}
		else {
			ogtProofOfClaimImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtProofOfClaimImpl.setCreateDate(null);
		}
		else {
			ogtProofOfClaimImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtProofOfClaimImpl.setModifiedDate(null);
		}
		else {
			ogtProofOfClaimImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (claimProofMatter == null) {
			ogtProofOfClaimImpl.setClaimProofMatter("");
		}
		else {
			ogtProofOfClaimImpl.setClaimProofMatter(claimProofMatter);
		}

		if (claimDebtorName == null) {
			ogtProofOfClaimImpl.setClaimDebtorName("");
		}
		else {
			ogtProofOfClaimImpl.setClaimDebtorName(claimDebtorName);
		}

		if (claimantName == null) {
			ogtProofOfClaimImpl.setClaimantName("");
		}
		else {
			ogtProofOfClaimImpl.setClaimantName(claimantName);
		}

		if (claimSentAddress == null) {
			ogtProofOfClaimImpl.setClaimSentAddress("");
		}
		else {
			ogtProofOfClaimImpl.setClaimSentAddress(claimSentAddress);
		}

		if (claimSentPhoneNum == null) {
			ogtProofOfClaimImpl.setClaimSentPhoneNum("");
		}
		else {
			ogtProofOfClaimImpl.setClaimSentPhoneNum(claimSentPhoneNum);
		}

		if (claimSentFaxNo == null) {
			ogtProofOfClaimImpl.setClaimSentFaxNo("");
		}
		else {
			ogtProofOfClaimImpl.setClaimSentFaxNo(claimSentFaxNo);
		}

		if (claimSentEmailAddr == null) {
			ogtProofOfClaimImpl.setClaimSentEmailAddr("");
		}
		else {
			ogtProofOfClaimImpl.setClaimSentEmailAddr(claimSentEmailAddr);
		}

		if (claimCompName == null) {
			ogtProofOfClaimImpl.setClaimCompName("");
		}
		else {
			ogtProofOfClaimImpl.setClaimCompName(claimCompName);
		}

		if (claimCertifyCheck == null) {
			ogtProofOfClaimImpl.setClaimCertifyCheck("");
		}
		else {
			ogtProofOfClaimImpl.setClaimCertifyCheck(claimCertifyCheck);
		}

		if (claimCompPosition == null) {
			ogtProofOfClaimImpl.setClaimCompPosition("");
		}
		else {
			ogtProofOfClaimImpl.setClaimCompPosition(claimCompPosition);
		}

		if (claimName == null) {
			ogtProofOfClaimImpl.setClaimName("");
		}
		else {
			ogtProofOfClaimImpl.setClaimName(claimName);
		}

		if (claimByCredDebtor == null) {
			ogtProofOfClaimImpl.setClaimByCredDebtor("");
		}
		else {
			ogtProofOfClaimImpl.setClaimByCredDebtor(claimByCredDebtor);
		}

		if (claimDateAppli == Long.MIN_VALUE) {
			ogtProofOfClaimImpl.setClaimDateAppli(null);
		}
		else {
			ogtProofOfClaimImpl.setClaimDateAppli(new Date(claimDateAppli));
		}

		if (claimByDebtTotalVal == null) {
			ogtProofOfClaimImpl.setClaimByDebtTotalVal("");
		}
		else {
			ogtProofOfClaimImpl.setClaimByDebtTotalVal(claimByDebtTotalVal);
		}

		if (claimByDebtStatement == null) {
			ogtProofOfClaimImpl.setClaimByDebtStatement("");
		}
		else {
			ogtProofOfClaimImpl.setClaimByDebtStatement(claimByDebtStatement);
		}

		if (claimCategory == null) {
			ogtProofOfClaimImpl.setClaimCategory("");
		}
		else {
			ogtProofOfClaimImpl.setClaimCategory(claimCategory);
		}

		if (claimUnsecured == null) {
			ogtProofOfClaimImpl.setClaimUnsecured("");
		}
		else {
			ogtProofOfClaimImpl.setClaimUnsecured(claimUnsecured);
		}

		if (claimRegardingAmt == null) {
			ogtProofOfClaimImpl.setClaimRegardingAmt("");
		}
		else {
			ogtProofOfClaimImpl.setClaimRegardingAmt(claimRegardingAmt);
		}

		if (indicateCategoryOne == null) {
			ogtProofOfClaimImpl.setIndicateCategoryOne("");
		}
		else {
			ogtProofOfClaimImpl.setIndicateCategoryOne(indicateCategoryOne);
		}

		if (indicateCategoryTwo == null) {
			ogtProofOfClaimImpl.setIndicateCategoryTwo("");
		}
		else {
			ogtProofOfClaimImpl.setIndicateCategoryTwo(indicateCategoryTwo);
		}

		if (indicateCategoryThree == null) {
			ogtProofOfClaimImpl.setIndicateCategoryThree("");
		}
		else {
			ogtProofOfClaimImpl.setIndicateCategoryThree(indicateCategoryThree);
		}

		if (indicateCategoryFour == null) {
			ogtProofOfClaimImpl.setIndicateCategoryFour("");
		}
		else {
			ogtProofOfClaimImpl.setIndicateCategoryFour(indicateCategoryFour);
		}

		if (otherPleaseSpecify == null) {
			ogtProofOfClaimImpl.setOtherPleaseSpecify("");
		}
		else {
			ogtProofOfClaimImpl.setOtherPleaseSpecify(otherPleaseSpecify);
		}

		if (claimSecured == null) {
			ogtProofOfClaimImpl.setClaimSecured("");
		}
		else {
			ogtProofOfClaimImpl.setClaimSecured(claimSecured);
		}

		if (claimSecuredOne == null) {
			ogtProofOfClaimImpl.setClaimSecuredOne("");
		}
		else {
			ogtProofOfClaimImpl.setClaimSecuredOne(claimSecuredOne);
		}

		if (claimDesc == null) {
			ogtProofOfClaimImpl.setClaimDesc("");
		}
		else {
			ogtProofOfClaimImpl.setClaimDesc(claimDesc);
		}

		if (aboveNamedCreditor == null) {
			ogtProofOfClaimImpl.setAboveNamedCreditor("");
		}
		else {
			ogtProofOfClaimImpl.setAboveNamedCreditor(aboveNamedCreditor);
		}

		if (paymentDetailDesc == null) {
			ogtProofOfClaimImpl.setPaymentDetailDesc("");
		}
		else {
			ogtProofOfClaimImpl.setPaymentDetailDesc(paymentDetailDesc);
		}

		if (inCaseOfBankruptcy == null) {
			ogtProofOfClaimImpl.setInCaseOfBankruptcy("");
		}
		else {
			ogtProofOfClaimImpl.setInCaseOfBankruptcy(inCaseOfBankruptcy);
		}

		ogtProofOfClaimImpl.setOgtApplicationId(ogtApplicationId);

		ogtProofOfClaimImpl.resetOriginalValues();

		return ogtProofOfClaimImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ogtProofOfClaimId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		claimProofMatter = objectInput.readUTF();
		claimDebtorName = objectInput.readUTF();
		claimantName = objectInput.readUTF();
		claimSentAddress = objectInput.readUTF();
		claimSentPhoneNum = objectInput.readUTF();
		claimSentFaxNo = objectInput.readUTF();
		claimSentEmailAddr = objectInput.readUTF();
		claimCompName = objectInput.readUTF();
		claimCertifyCheck = objectInput.readUTF();
		claimCompPosition = objectInput.readUTF();
		claimName = objectInput.readUTF();
		claimByCredDebtor = objectInput.readUTF();
		claimDateAppli = objectInput.readLong();
		claimByDebtTotalVal = objectInput.readUTF();
		claimByDebtStatement = objectInput.readUTF();
		claimCategory = objectInput.readUTF();
		claimUnsecured = objectInput.readUTF();
		claimRegardingAmt = objectInput.readUTF();
		indicateCategoryOne = objectInput.readUTF();
		indicateCategoryTwo = objectInput.readUTF();
		indicateCategoryThree = objectInput.readUTF();
		indicateCategoryFour = objectInput.readUTF();
		otherPleaseSpecify = objectInput.readUTF();
		claimSecured = objectInput.readUTF();
		claimSecuredOne = objectInput.readUTF();
		claimDesc = objectInput.readUTF();
		aboveNamedCreditor = objectInput.readUTF();
		paymentDetailDesc = objectInput.readUTF();
		inCaseOfBankruptcy = objectInput.readUTF();

		ogtApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ogtProofOfClaimId);

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

		if (claimProofMatter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimProofMatter);
		}

		if (claimDebtorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimDebtorName);
		}

		if (claimantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantName);
		}

		if (claimSentAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimSentAddress);
		}

		if (claimSentPhoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimSentPhoneNum);
		}

		if (claimSentFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimSentFaxNo);
		}

		if (claimSentEmailAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimSentEmailAddr);
		}

		if (claimCompName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimCompName);
		}

		if (claimCertifyCheck == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimCertifyCheck);
		}

		if (claimCompPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimCompPosition);
		}

		if (claimName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimName);
		}

		if (claimByCredDebtor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimByCredDebtor);
		}

		objectOutput.writeLong(claimDateAppli);

		if (claimByDebtTotalVal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimByDebtTotalVal);
		}

		if (claimByDebtStatement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimByDebtStatement);
		}

		if (claimCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimCategory);
		}

		if (claimUnsecured == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimUnsecured);
		}

		if (claimRegardingAmt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimRegardingAmt);
		}

		if (indicateCategoryOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicateCategoryOne);
		}

		if (indicateCategoryTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicateCategoryTwo);
		}

		if (indicateCategoryThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicateCategoryThree);
		}

		if (indicateCategoryFour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicateCategoryFour);
		}

		if (otherPleaseSpecify == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherPleaseSpecify);
		}

		if (claimSecured == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimSecured);
		}

		if (claimSecuredOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimSecuredOne);
		}

		if (claimDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimDesc);
		}

		if (aboveNamedCreditor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(aboveNamedCreditor);
		}

		if (paymentDetailDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paymentDetailDesc);
		}

		if (inCaseOfBankruptcy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(inCaseOfBankruptcy);
		}

		objectOutput.writeLong(ogtApplicationId);
	}

	public long ogtProofOfClaimId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String claimProofMatter;
	public String claimDebtorName;
	public String claimantName;
	public String claimSentAddress;
	public String claimSentPhoneNum;
	public String claimSentFaxNo;
	public String claimSentEmailAddr;
	public String claimCompName;
	public String claimCertifyCheck;
	public String claimCompPosition;
	public String claimName;
	public String claimByCredDebtor;
	public long claimDateAppli;
	public String claimByDebtTotalVal;
	public String claimByDebtStatement;
	public String claimCategory;
	public String claimUnsecured;
	public String claimRegardingAmt;
	public String indicateCategoryOne;
	public String indicateCategoryTwo;
	public String indicateCategoryThree;
	public String indicateCategoryFour;
	public String otherPleaseSpecify;
	public String claimSecured;
	public String claimSecuredOne;
	public String claimDesc;
	public String aboveNamedCreditor;
	public String paymentDetailDesc;
	public String inCaseOfBankruptcy;
	public long ogtApplicationId;

}