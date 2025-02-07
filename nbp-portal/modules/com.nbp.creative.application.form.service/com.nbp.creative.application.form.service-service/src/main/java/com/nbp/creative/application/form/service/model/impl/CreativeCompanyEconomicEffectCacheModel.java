/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeCompanyEconomicEffect;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeCompanyEconomicEffect in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeCompanyEconomicEffectCacheModel
	implements CacheModel<CreativeCompanyEconomicEffect>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeCompanyEconomicEffectCacheModel)) {
			return false;
		}

		CreativeCompanyEconomicEffectCacheModel
			creativeCompanyEconomicEffectCacheModel =
				(CreativeCompanyEconomicEffectCacheModel)object;

		if (creativeComEconomicEffectId ==
				creativeCompanyEconomicEffectCacheModel.
					creativeComEconomicEffectId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeComEconomicEffectId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(67);

		sb.append("{creativeComEconomicEffectId=");
		sb.append(creativeComEconomicEffectId);
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
		sb.append(", assessmentcountryOfOrigin=");
		sb.append(assessmentcountryOfOrigin);
		sb.append(", ssessmentjointVenture=");
		sb.append(ssessmentjointVenture);
		sb.append(", assessmentLocal=");
		sb.append(assessmentLocal);
		sb.append(", assessmentForeign=");
		sb.append(assessmentForeign);
		sb.append(", shareJmd=");
		sb.append(shareJmd);
		sb.append(", shareExchangeRate=");
		sb.append(shareExchangeRate);
		sb.append(", shareUsd=");
		sb.append(shareUsd);
		sb.append(", localJmd=");
		sb.append(localJmd);
		sb.append(", localExchangeRate=");
		sb.append(localExchangeRate);
		sb.append(", localUsd=");
		sb.append(localUsd);
		sb.append(", otherJmd=");
		sb.append(otherJmd);
		sb.append(", otherExchangeRate=");
		sb.append(otherExchangeRate);
		sb.append(", OtherUsd=");
		sb.append(OtherUsd);
		sb.append(", permanentLocalMale=");
		sb.append(permanentLocalMale);
		sb.append(", permanentLocalFemale=");
		sb.append(permanentLocalFemale);
		sb.append(", permanentForeignMale=");
		sb.append(permanentForeignMale);
		sb.append(", permanentForeignFemale=");
		sb.append(permanentForeignFemale);
		sb.append(", temporaryLocalMale=");
		sb.append(temporaryLocalMale);
		sb.append(", temporaryLocalFemale=");
		sb.append(temporaryLocalFemale);
		sb.append(", temporaryForeignMale=");
		sb.append(temporaryForeignMale);
		sb.append(", temporaryForgeignFemale=");
		sb.append(temporaryForgeignFemale);
		sb.append(", totalLocalMale=");
		sb.append(totalLocalMale);
		sb.append(", totalLocalFemale=");
		sb.append(totalLocalFemale);
		sb.append(", totalForeignMale=");
		sb.append(totalForeignMale);
		sb.append(", totalForeignFemale=");
		sb.append(totalForeignFemale);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeCompanyEconomicEffect toEntityModel() {
		CreativeCompanyEconomicEffectImpl creativeCompanyEconomicEffectImpl =
			new CreativeCompanyEconomicEffectImpl();

		creativeCompanyEconomicEffectImpl.setCreativeComEconomicEffectId(
			creativeComEconomicEffectId);
		creativeCompanyEconomicEffectImpl.setGroupId(groupId);
		creativeCompanyEconomicEffectImpl.setCompanyId(companyId);
		creativeCompanyEconomicEffectImpl.setUserId(userId);

		if (userName == null) {
			creativeCompanyEconomicEffectImpl.setUserName("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeCompanyEconomicEffectImpl.setCreateDate(null);
		}
		else {
			creativeCompanyEconomicEffectImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeCompanyEconomicEffectImpl.setModifiedDate(null);
		}
		else {
			creativeCompanyEconomicEffectImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (assessmentcountryOfOrigin == null) {
			creativeCompanyEconomicEffectImpl.setAssessmentcountryOfOrigin("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setAssessmentcountryOfOrigin(
				assessmentcountryOfOrigin);
		}

		if (ssessmentjointVenture == null) {
			creativeCompanyEconomicEffectImpl.setSsessmentjointVenture("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setSsessmentjointVenture(
				ssessmentjointVenture);
		}

		if (assessmentLocal == null) {
			creativeCompanyEconomicEffectImpl.setAssessmentLocal("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setAssessmentLocal(
				assessmentLocal);
		}

		if (assessmentForeign == null) {
			creativeCompanyEconomicEffectImpl.setAssessmentForeign("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setAssessmentForeign(
				assessmentForeign);
		}

		if (shareJmd == null) {
			creativeCompanyEconomicEffectImpl.setShareJmd("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setShareJmd(shareJmd);
		}

		if (shareExchangeRate == null) {
			creativeCompanyEconomicEffectImpl.setShareExchangeRate("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setShareExchangeRate(
				shareExchangeRate);
		}

		if (shareUsd == null) {
			creativeCompanyEconomicEffectImpl.setShareUsd("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setShareUsd(shareUsd);
		}

		if (localJmd == null) {
			creativeCompanyEconomicEffectImpl.setLocalJmd("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setLocalJmd(localJmd);
		}

		if (localExchangeRate == null) {
			creativeCompanyEconomicEffectImpl.setLocalExchangeRate("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setLocalExchangeRate(
				localExchangeRate);
		}

		if (localUsd == null) {
			creativeCompanyEconomicEffectImpl.setLocalUsd("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setLocalUsd(localUsd);
		}

		if (otherJmd == null) {
			creativeCompanyEconomicEffectImpl.setOtherJmd("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setOtherJmd(otherJmd);
		}

		if (otherExchangeRate == null) {
			creativeCompanyEconomicEffectImpl.setOtherExchangeRate("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setOtherExchangeRate(
				otherExchangeRate);
		}

		if (OtherUsd == null) {
			creativeCompanyEconomicEffectImpl.setOtherUsd("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setOtherUsd(OtherUsd);
		}

		if (permanentLocalMale == null) {
			creativeCompanyEconomicEffectImpl.setPermanentLocalMale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setPermanentLocalMale(
				permanentLocalMale);
		}

		if (permanentLocalFemale == null) {
			creativeCompanyEconomicEffectImpl.setPermanentLocalFemale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setPermanentLocalFemale(
				permanentLocalFemale);
		}

		if (permanentForeignMale == null) {
			creativeCompanyEconomicEffectImpl.setPermanentForeignMale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setPermanentForeignMale(
				permanentForeignMale);
		}

		if (permanentForeignFemale == null) {
			creativeCompanyEconomicEffectImpl.setPermanentForeignFemale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setPermanentForeignFemale(
				permanentForeignFemale);
		}

		if (temporaryLocalMale == null) {
			creativeCompanyEconomicEffectImpl.setTemporaryLocalMale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setTemporaryLocalMale(
				temporaryLocalMale);
		}

		if (temporaryLocalFemale == null) {
			creativeCompanyEconomicEffectImpl.setTemporaryLocalFemale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setTemporaryLocalFemale(
				temporaryLocalFemale);
		}

		if (temporaryForeignMale == null) {
			creativeCompanyEconomicEffectImpl.setTemporaryForeignMale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setTemporaryForeignMale(
				temporaryForeignMale);
		}

		if (temporaryForgeignFemale == null) {
			creativeCompanyEconomicEffectImpl.setTemporaryForgeignFemale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setTemporaryForgeignFemale(
				temporaryForgeignFemale);
		}

		if (totalLocalMale == null) {
			creativeCompanyEconomicEffectImpl.setTotalLocalMale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setTotalLocalMale(totalLocalMale);
		}

		if (totalLocalFemale == null) {
			creativeCompanyEconomicEffectImpl.setTotalLocalFemale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setTotalLocalFemale(
				totalLocalFemale);
		}

		if (totalForeignMale == null) {
			creativeCompanyEconomicEffectImpl.setTotalForeignMale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setTotalForeignMale(
				totalForeignMale);
		}

		if (totalForeignFemale == null) {
			creativeCompanyEconomicEffectImpl.setTotalForeignFemale("");
		}
		else {
			creativeCompanyEconomicEffectImpl.setTotalForeignFemale(
				totalForeignFemale);
		}

		creativeCompanyEconomicEffectImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeCompanyEconomicEffectImpl.resetOriginalValues();

		return creativeCompanyEconomicEffectImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeComEconomicEffectId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		assessmentcountryOfOrigin = objectInput.readUTF();
		ssessmentjointVenture = objectInput.readUTF();
		assessmentLocal = objectInput.readUTF();
		assessmentForeign = objectInput.readUTF();
		shareJmd = objectInput.readUTF();
		shareExchangeRate = objectInput.readUTF();
		shareUsd = objectInput.readUTF();
		localJmd = objectInput.readUTF();
		localExchangeRate = objectInput.readUTF();
		localUsd = objectInput.readUTF();
		otherJmd = objectInput.readUTF();
		otherExchangeRate = objectInput.readUTF();
		OtherUsd = objectInput.readUTF();
		permanentLocalMale = objectInput.readUTF();
		permanentLocalFemale = objectInput.readUTF();
		permanentForeignMale = objectInput.readUTF();
		permanentForeignFemale = objectInput.readUTF();
		temporaryLocalMale = objectInput.readUTF();
		temporaryLocalFemale = objectInput.readUTF();
		temporaryForeignMale = objectInput.readUTF();
		temporaryForgeignFemale = objectInput.readUTF();
		totalLocalMale = objectInput.readUTF();
		totalLocalFemale = objectInput.readUTF();
		totalForeignMale = objectInput.readUTF();
		totalForeignFemale = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeComEconomicEffectId);

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

		if (assessmentcountryOfOrigin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assessmentcountryOfOrigin);
		}

		if (ssessmentjointVenture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ssessmentjointVenture);
		}

		if (assessmentLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assessmentLocal);
		}

		if (assessmentForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assessmentForeign);
		}

		if (shareJmd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareJmd);
		}

		if (shareExchangeRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareExchangeRate);
		}

		if (shareUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shareUsd);
		}

		if (localJmd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localJmd);
		}

		if (localExchangeRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localExchangeRate);
		}

		if (localUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localUsd);
		}

		if (otherJmd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherJmd);
		}

		if (otherExchangeRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherExchangeRate);
		}

		if (OtherUsd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(OtherUsd);
		}

		if (permanentLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentLocalMale);
		}

		if (permanentLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentLocalFemale);
		}

		if (permanentForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentForeignMale);
		}

		if (permanentForeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permanentForeignFemale);
		}

		if (temporaryLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryLocalMale);
		}

		if (temporaryLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryLocalFemale);
		}

		if (temporaryForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryForeignMale);
		}

		if (temporaryForgeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryForgeignFemale);
		}

		if (totalLocalMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalLocalMale);
		}

		if (totalLocalFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalLocalFemale);
		}

		if (totalForeignMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalForeignMale);
		}

		if (totalForeignFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalForeignFemale);
		}

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeComEconomicEffectId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String assessmentcountryOfOrigin;
	public String ssessmentjointVenture;
	public String assessmentLocal;
	public String assessmentForeign;
	public String shareJmd;
	public String shareExchangeRate;
	public String shareUsd;
	public String localJmd;
	public String localExchangeRate;
	public String localUsd;
	public String otherJmd;
	public String otherExchangeRate;
	public String OtherUsd;
	public String permanentLocalMale;
	public String permanentLocalFemale;
	public String permanentForeignMale;
	public String permanentForeignFemale;
	public String temporaryLocalMale;
	public String temporaryLocalFemale;
	public String temporaryForeignMale;
	public String temporaryForgeignFemale;
	public String totalLocalMale;
	public String totalLocalFemale;
	public String totalForeignMale;
	public String totalForeignFemale;
	public long CreativeApplicationId;

}