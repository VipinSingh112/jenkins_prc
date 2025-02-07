/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.farm.application.form.service.model.FarmerProfile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FarmerProfile in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerProfileCacheModel
	implements CacheModel<FarmerProfile>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FarmerProfileCacheModel)) {
			return false;
		}

		FarmerProfileCacheModel farmerProfileCacheModel =
			(FarmerProfileCacheModel)object;

		if (farmerProfileId == farmerProfileCacheModel.farmerProfileId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, farmerProfileId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{farmerProfileId=");
		sb.append(farmerProfileId);
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
		sb.append(", respondent=");
		sb.append(respondent);
		sb.append(", manager=");
		sb.append(manager);
		sb.append(", liveOnFarm=");
		sb.append(liveOnFarm);
		sb.append(", livelihood=");
		sb.append(livelihood);
		sb.append(", educationLevel=");
		sb.append(educationLevel);
		sb.append(", mainOccupation=");
		sb.append(mainOccupation);
		sb.append(", agriiInstitution=");
		sb.append(agriiInstitution);
		sb.append(", qualification=");
		sb.append(qualification);
		sb.append(", agriTraining=");
		sb.append(agriTraining);
		sb.append(", trainingMethod=");
		sb.append(trainingMethod);
		sb.append(", mainAgriActivity=");
		sb.append(mainAgriActivity);
		sb.append(", neareshPoliceStation=");
		sb.append(neareshPoliceStation);
		sb.append(", jasBranchGroup=");
		sb.append(jasBranchGroup);
		sb.append(", holdingStartYear=");
		sb.append(holdingStartYear);
		sb.append(", farmerType=");
		sb.append(farmerType);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", mainInformationSources=");
		sb.append(mainInformationSources);
		sb.append(", farmerApplicationId=");
		sb.append(farmerApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FarmerProfile toEntityModel() {
		FarmerProfileImpl farmerProfileImpl = new FarmerProfileImpl();

		farmerProfileImpl.setFarmerProfileId(farmerProfileId);
		farmerProfileImpl.setGroupId(groupId);
		farmerProfileImpl.setCompanyId(companyId);
		farmerProfileImpl.setUserId(userId);

		if (userName == null) {
			farmerProfileImpl.setUserName("");
		}
		else {
			farmerProfileImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			farmerProfileImpl.setCreateDate(null);
		}
		else {
			farmerProfileImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			farmerProfileImpl.setModifiedDate(null);
		}
		else {
			farmerProfileImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (respondent == null) {
			farmerProfileImpl.setRespondent("");
		}
		else {
			farmerProfileImpl.setRespondent(respondent);
		}

		if (manager == null) {
			farmerProfileImpl.setManager("");
		}
		else {
			farmerProfileImpl.setManager(manager);
		}

		if (liveOnFarm == null) {
			farmerProfileImpl.setLiveOnFarm("");
		}
		else {
			farmerProfileImpl.setLiveOnFarm(liveOnFarm);
		}

		if (livelihood == null) {
			farmerProfileImpl.setLivelihood("");
		}
		else {
			farmerProfileImpl.setLivelihood(livelihood);
		}

		if (educationLevel == null) {
			farmerProfileImpl.setEducationLevel("");
		}
		else {
			farmerProfileImpl.setEducationLevel(educationLevel);
		}

		if (mainOccupation == null) {
			farmerProfileImpl.setMainOccupation("");
		}
		else {
			farmerProfileImpl.setMainOccupation(mainOccupation);
		}

		if (agriiInstitution == null) {
			farmerProfileImpl.setAgriiInstitution("");
		}
		else {
			farmerProfileImpl.setAgriiInstitution(agriiInstitution);
		}

		if (qualification == null) {
			farmerProfileImpl.setQualification("");
		}
		else {
			farmerProfileImpl.setQualification(qualification);
		}

		if (agriTraining == null) {
			farmerProfileImpl.setAgriTraining("");
		}
		else {
			farmerProfileImpl.setAgriTraining(agriTraining);
		}

		if (trainingMethod == null) {
			farmerProfileImpl.setTrainingMethod("");
		}
		else {
			farmerProfileImpl.setTrainingMethod(trainingMethod);
		}

		if (mainAgriActivity == null) {
			farmerProfileImpl.setMainAgriActivity("");
		}
		else {
			farmerProfileImpl.setMainAgriActivity(mainAgriActivity);
		}

		if (neareshPoliceStation == null) {
			farmerProfileImpl.setNeareshPoliceStation("");
		}
		else {
			farmerProfileImpl.setNeareshPoliceStation(neareshPoliceStation);
		}

		if (jasBranchGroup == null) {
			farmerProfileImpl.setJasBranchGroup("");
		}
		else {
			farmerProfileImpl.setJasBranchGroup(jasBranchGroup);
		}

		if (holdingStartYear == null) {
			farmerProfileImpl.setHoldingStartYear("");
		}
		else {
			farmerProfileImpl.setHoldingStartYear(holdingStartYear);
		}

		if (farmerType == null) {
			farmerProfileImpl.setFarmerType("");
		}
		else {
			farmerProfileImpl.setFarmerType(farmerType);
		}

		if (remarks == null) {
			farmerProfileImpl.setRemarks("");
		}
		else {
			farmerProfileImpl.setRemarks(remarks);
		}

		if (mainInformationSources == null) {
			farmerProfileImpl.setMainInformationSources("");
		}
		else {
			farmerProfileImpl.setMainInformationSources(mainInformationSources);
		}

		farmerProfileImpl.setFarmerApplicationId(farmerApplicationId);

		farmerProfileImpl.resetOriginalValues();

		return farmerProfileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		farmerProfileId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		respondent = objectInput.readUTF();
		manager = objectInput.readUTF();
		liveOnFarm = objectInput.readUTF();
		livelihood = objectInput.readUTF();
		educationLevel = objectInput.readUTF();
		mainOccupation = objectInput.readUTF();
		agriiInstitution = objectInput.readUTF();
		qualification = objectInput.readUTF();
		agriTraining = objectInput.readUTF();
		trainingMethod = objectInput.readUTF();
		mainAgriActivity = objectInput.readUTF();
		neareshPoliceStation = objectInput.readUTF();
		jasBranchGroup = objectInput.readUTF();
		holdingStartYear = objectInput.readUTF();
		farmerType = objectInput.readUTF();
		remarks = objectInput.readUTF();
		mainInformationSources = objectInput.readUTF();

		farmerApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(farmerProfileId);

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

		if (respondent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(respondent);
		}

		if (manager == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manager);
		}

		if (liveOnFarm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(liveOnFarm);
		}

		if (livelihood == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(livelihood);
		}

		if (educationLevel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(educationLevel);
		}

		if (mainOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mainOccupation);
		}

		if (agriiInstitution == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agriiInstitution);
		}

		if (qualification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualification);
		}

		if (agriTraining == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agriTraining);
		}

		if (trainingMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trainingMethod);
		}

		if (mainAgriActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mainAgriActivity);
		}

		if (neareshPoliceStation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(neareshPoliceStation);
		}

		if (jasBranchGroup == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jasBranchGroup);
		}

		if (holdingStartYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(holdingStartYear);
		}

		if (farmerType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(farmerType);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (mainInformationSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mainInformationSources);
		}

		objectOutput.writeLong(farmerApplicationId);
	}

	public long farmerProfileId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String respondent;
	public String manager;
	public String liveOnFarm;
	public String livelihood;
	public String educationLevel;
	public String mainOccupation;
	public String agriiInstitution;
	public String qualification;
	public String agriTraining;
	public String trainingMethod;
	public String mainAgriActivity;
	public String neareshPoliceStation;
	public String jasBranchGroup;
	public String holdingStartYear;
	public String farmerType;
	public String remarks;
	public String mainInformationSources;
	public long farmerApplicationId;

}