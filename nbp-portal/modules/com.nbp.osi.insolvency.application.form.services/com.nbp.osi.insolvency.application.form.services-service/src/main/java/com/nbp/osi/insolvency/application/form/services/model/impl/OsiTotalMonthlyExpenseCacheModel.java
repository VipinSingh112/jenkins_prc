/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiTotalMonthlyExpense;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiTotalMonthlyExpense in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiTotalMonthlyExpenseCacheModel
	implements CacheModel<OsiTotalMonthlyExpense>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiTotalMonthlyExpenseCacheModel)) {
			return false;
		}

		OsiTotalMonthlyExpenseCacheModel osiTotalMonthlyExpenseCacheModel =
			(OsiTotalMonthlyExpenseCacheModel)object;

		if (osiTotalMonthlyExpenseId ==
				osiTotalMonthlyExpenseCacheModel.osiTotalMonthlyExpenseId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiTotalMonthlyExpenseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{osiTotalMonthlyExpenseId=");
		sb.append(osiTotalMonthlyExpenseId);
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
		sb.append(", totalExpense=");
		sb.append(totalExpense);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiTotalMonthlyExpense toEntityModel() {
		OsiTotalMonthlyExpenseImpl osiTotalMonthlyExpenseImpl =
			new OsiTotalMonthlyExpenseImpl();

		osiTotalMonthlyExpenseImpl.setOsiTotalMonthlyExpenseId(
			osiTotalMonthlyExpenseId);
		osiTotalMonthlyExpenseImpl.setGroupId(groupId);
		osiTotalMonthlyExpenseImpl.setCompanyId(companyId);
		osiTotalMonthlyExpenseImpl.setUserId(userId);

		if (userName == null) {
			osiTotalMonthlyExpenseImpl.setUserName("");
		}
		else {
			osiTotalMonthlyExpenseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiTotalMonthlyExpenseImpl.setCreateDate(null);
		}
		else {
			osiTotalMonthlyExpenseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiTotalMonthlyExpenseImpl.setModifiedDate(null);
		}
		else {
			osiTotalMonthlyExpenseImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (totalExpense == null) {
			osiTotalMonthlyExpenseImpl.setTotalExpense("");
		}
		else {
			osiTotalMonthlyExpenseImpl.setTotalExpense(totalExpense);
		}

		osiTotalMonthlyExpenseImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiTotalMonthlyExpenseImpl.resetOriginalValues();

		return osiTotalMonthlyExpenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiTotalMonthlyExpenseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		totalExpense = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiTotalMonthlyExpenseId);

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

		if (totalExpense == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalExpense);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiTotalMonthlyExpenseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String totalExpense;
	public long osiInsolvencyId;

}