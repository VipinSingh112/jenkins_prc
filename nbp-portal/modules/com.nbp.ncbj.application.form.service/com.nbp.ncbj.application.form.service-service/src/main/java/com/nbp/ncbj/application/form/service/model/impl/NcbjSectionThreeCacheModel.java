/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjSectionThree in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjSectionThreeCacheModel
	implements CacheModel<NcbjSectionThree>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjSectionThreeCacheModel)) {
			return false;
		}

		NcbjSectionThreeCacheModel ncbjSectionThreeCacheModel =
			(NcbjSectionThreeCacheModel)object;

		if (ncbjSectionThreeId ==
				ncbjSectionThreeCacheModel.ncbjSectionThreeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjSectionThreeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{ncbjSectionThreeId=");
		sb.append(ncbjSectionThreeId);
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
		sb.append(", processActivityDescription=");
		sb.append(processActivityDescription);
		sb.append(", incomingMaterialsDes=");
		sb.append(incomingMaterialsDes);
		sb.append(", processDescription=");
		sb.append(processDescription);
		sb.append(", processActivitiesList=");
		sb.append(processActivitiesList);
		sb.append(", specialActivities=");
		sb.append(specialActivities);
		sb.append(", explainationBox=");
		sb.append(explainationBox);
		sb.append(", categoryOne=");
		sb.append(categoryOne);
		sb.append(", categoryTwo=");
		sb.append(categoryTwo);
		sb.append(", categoryThree=");
		sb.append(categoryThree);
		sb.append(", categoryFour=");
		sb.append(categoryFour);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjSectionThree toEntityModel() {
		NcbjSectionThreeImpl ncbjSectionThreeImpl = new NcbjSectionThreeImpl();

		ncbjSectionThreeImpl.setNcbjSectionThreeId(ncbjSectionThreeId);
		ncbjSectionThreeImpl.setGroupId(groupId);
		ncbjSectionThreeImpl.setCompanyId(companyId);
		ncbjSectionThreeImpl.setUserId(userId);

		if (userName == null) {
			ncbjSectionThreeImpl.setUserName("");
		}
		else {
			ncbjSectionThreeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjSectionThreeImpl.setCreateDate(null);
		}
		else {
			ncbjSectionThreeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjSectionThreeImpl.setModifiedDate(null);
		}
		else {
			ncbjSectionThreeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (processActivityDescription == null) {
			ncbjSectionThreeImpl.setProcessActivityDescription("");
		}
		else {
			ncbjSectionThreeImpl.setProcessActivityDescription(
				processActivityDescription);
		}

		if (incomingMaterialsDes == null) {
			ncbjSectionThreeImpl.setIncomingMaterialsDes("");
		}
		else {
			ncbjSectionThreeImpl.setIncomingMaterialsDes(incomingMaterialsDes);
		}

		if (processDescription == null) {
			ncbjSectionThreeImpl.setProcessDescription("");
		}
		else {
			ncbjSectionThreeImpl.setProcessDescription(processDescription);
		}

		if (processActivitiesList == null) {
			ncbjSectionThreeImpl.setProcessActivitiesList("");
		}
		else {
			ncbjSectionThreeImpl.setProcessActivitiesList(
				processActivitiesList);
		}

		if (specialActivities == null) {
			ncbjSectionThreeImpl.setSpecialActivities("");
		}
		else {
			ncbjSectionThreeImpl.setSpecialActivities(specialActivities);
		}

		if (explainationBox == null) {
			ncbjSectionThreeImpl.setExplainationBox("");
		}
		else {
			ncbjSectionThreeImpl.setExplainationBox(explainationBox);
		}

		if (categoryOne == null) {
			ncbjSectionThreeImpl.setCategoryOne("");
		}
		else {
			ncbjSectionThreeImpl.setCategoryOne(categoryOne);
		}

		if (categoryTwo == null) {
			ncbjSectionThreeImpl.setCategoryTwo("");
		}
		else {
			ncbjSectionThreeImpl.setCategoryTwo(categoryTwo);
		}

		if (categoryThree == null) {
			ncbjSectionThreeImpl.setCategoryThree("");
		}
		else {
			ncbjSectionThreeImpl.setCategoryThree(categoryThree);
		}

		if (categoryFour == null) {
			ncbjSectionThreeImpl.setCategoryFour("");
		}
		else {
			ncbjSectionThreeImpl.setCategoryFour(categoryFour);
		}

		ncbjSectionThreeImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjSectionThreeImpl.resetOriginalValues();

		return ncbjSectionThreeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjSectionThreeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		processActivityDescription = objectInput.readUTF();
		incomingMaterialsDes = objectInput.readUTF();
		processDescription = objectInput.readUTF();
		processActivitiesList = objectInput.readUTF();
		specialActivities = objectInput.readUTF();
		explainationBox = objectInput.readUTF();
		categoryOne = objectInput.readUTF();
		categoryTwo = objectInput.readUTF();
		categoryThree = objectInput.readUTF();
		categoryFour = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjSectionThreeId);

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

		if (processActivityDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processActivityDescription);
		}

		if (incomingMaterialsDes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(incomingMaterialsDes);
		}

		if (processDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processDescription);
		}

		if (processActivitiesList == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processActivitiesList);
		}

		if (specialActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specialActivities);
		}

		if (explainationBox == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(explainationBox);
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

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjSectionThreeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String processActivityDescription;
	public String incomingMaterialsDes;
	public String processDescription;
	public String processActivitiesList;
	public String specialActivities;
	public String explainationBox;
	public String categoryOne;
	public String categoryTwo;
	public String categoryThree;
	public String categoryFour;
	public long ncbjApplicationId;

}