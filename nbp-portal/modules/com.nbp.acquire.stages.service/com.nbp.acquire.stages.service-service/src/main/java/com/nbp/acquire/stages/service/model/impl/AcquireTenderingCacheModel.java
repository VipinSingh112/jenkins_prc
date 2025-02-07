/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireTendering;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireTendering in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireTenderingCacheModel
	implements CacheModel<AcquireTendering>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireTenderingCacheModel)) {
			return false;
		}

		AcquireTenderingCacheModel acquireTenderingCacheModel =
			(AcquireTenderingCacheModel)object;

		if (acquireTenderingId ==
				acquireTenderingCacheModel.acquireTenderingId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireTenderingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{acquireTenderingId=");
		sb.append(acquireTenderingId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", nameOfEachBidders=");
		sb.append(nameOfEachBidders);
		sb.append(", bidPriceofeachBid=");
		sb.append(bidPriceofeachBid);
		sb.append(", minPriceOfTenderOffer=");
		sb.append(minPriceOfTenderOffer);
		sb.append(", meetsMinimum=");
		sb.append(meetsMinimum);
		sb.append(", highestOffer=");
		sb.append(highestOffer);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireTendering toEntityModel() {
		AcquireTenderingImpl acquireTenderingImpl = new AcquireTenderingImpl();

		acquireTenderingImpl.setAcquireTenderingId(acquireTenderingId);
		acquireTenderingImpl.setGroupId(groupId);
		acquireTenderingImpl.setCompanyId(companyId);
		acquireTenderingImpl.setUserId(userId);

		if (userName == null) {
			acquireTenderingImpl.setUserName("");
		}
		else {
			acquireTenderingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireTenderingImpl.setCreateDate(null);
		}
		else {
			acquireTenderingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireTenderingImpl.setModifiedDate(null);
		}
		else {
			acquireTenderingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			acquireTenderingImpl.setCaseId("");
		}
		else {
			acquireTenderingImpl.setCaseId(caseId);
		}

		if (nameOfEachBidders == null) {
			acquireTenderingImpl.setNameOfEachBidders("");
		}
		else {
			acquireTenderingImpl.setNameOfEachBidders(nameOfEachBidders);
		}

		if (bidPriceofeachBid == null) {
			acquireTenderingImpl.setBidPriceofeachBid("");
		}
		else {
			acquireTenderingImpl.setBidPriceofeachBid(bidPriceofeachBid);
		}

		if (minPriceOfTenderOffer == null) {
			acquireTenderingImpl.setMinPriceOfTenderOffer("");
		}
		else {
			acquireTenderingImpl.setMinPriceOfTenderOffer(
				minPriceOfTenderOffer);
		}

		if (meetsMinimum == null) {
			acquireTenderingImpl.setMeetsMinimum("");
		}
		else {
			acquireTenderingImpl.setMeetsMinimum(meetsMinimum);
		}

		if (highestOffer == null) {
			acquireTenderingImpl.setHighestOffer("");
		}
		else {
			acquireTenderingImpl.setHighestOffer(highestOffer);
		}

		if (status == null) {
			acquireTenderingImpl.setStatus("");
		}
		else {
			acquireTenderingImpl.setStatus(status);
		}

		acquireTenderingImpl.resetOriginalValues();

		return acquireTenderingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireTenderingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		nameOfEachBidders = objectInput.readUTF();
		bidPriceofeachBid = objectInput.readUTF();
		minPriceOfTenderOffer = objectInput.readUTF();
		meetsMinimum = objectInput.readUTF();
		highestOffer = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireTenderingId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (nameOfEachBidders == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfEachBidders);
		}

		if (bidPriceofeachBid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bidPriceofeachBid);
		}

		if (minPriceOfTenderOffer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(minPriceOfTenderOffer);
		}

		if (meetsMinimum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(meetsMinimum);
		}

		if (highestOffer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(highestOffer);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long acquireTenderingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String nameOfEachBidders;
	public String bidPriceofeachBid;
	public String minPriceOfTenderOffer;
	public String meetsMinimum;
	public String highestOffer;
	public String status;

}