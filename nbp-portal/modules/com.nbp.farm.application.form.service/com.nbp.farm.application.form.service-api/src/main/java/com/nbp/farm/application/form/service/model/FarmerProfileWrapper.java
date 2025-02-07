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

package com.nbp.farm.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmerProfile}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerProfile
 * @generated
 */
public class FarmerProfileWrapper
	extends BaseModelWrapper<FarmerProfile>
	implements FarmerProfile, ModelWrapper<FarmerProfile> {

	public FarmerProfileWrapper(FarmerProfile farmerProfile) {
		super(farmerProfile);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmerProfileId", getFarmerProfileId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("respondent", getRespondent());
		attributes.put("manager", getManager());
		attributes.put("liveOnFarm", getLiveOnFarm());
		attributes.put("livelihood", getLivelihood());
		attributes.put("educationLevel", getEducationLevel());
		attributes.put("mainOccupation", getMainOccupation());
		attributes.put("agriiInstitution", getAgriiInstitution());
		attributes.put("qualification", getQualification());
		attributes.put("agriTraining", getAgriTraining());
		attributes.put("trainingMethod", getTrainingMethod());
		attributes.put("mainAgriActivity", getMainAgriActivity());
		attributes.put("neareshPoliceStation", getNeareshPoliceStation());
		attributes.put("jasBranchGroup", getJasBranchGroup());
		attributes.put("holdingStartYear", getHoldingStartYear());
		attributes.put("farmerType", getFarmerType());
		attributes.put("remarks", getRemarks());
		attributes.put("mainInformationSources", getMainInformationSources());
		attributes.put("farmerApplicationId", getFarmerApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerProfileId = (Long)attributes.get("farmerProfileId");

		if (farmerProfileId != null) {
			setFarmerProfileId(farmerProfileId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String respondent = (String)attributes.get("respondent");

		if (respondent != null) {
			setRespondent(respondent);
		}

		String manager = (String)attributes.get("manager");

		if (manager != null) {
			setManager(manager);
		}

		String liveOnFarm = (String)attributes.get("liveOnFarm");

		if (liveOnFarm != null) {
			setLiveOnFarm(liveOnFarm);
		}

		String livelihood = (String)attributes.get("livelihood");

		if (livelihood != null) {
			setLivelihood(livelihood);
		}

		String educationLevel = (String)attributes.get("educationLevel");

		if (educationLevel != null) {
			setEducationLevel(educationLevel);
		}

		String mainOccupation = (String)attributes.get("mainOccupation");

		if (mainOccupation != null) {
			setMainOccupation(mainOccupation);
		}

		String agriiInstitution = (String)attributes.get("agriiInstitution");

		if (agriiInstitution != null) {
			setAgriiInstitution(agriiInstitution);
		}

		String qualification = (String)attributes.get("qualification");

		if (qualification != null) {
			setQualification(qualification);
		}

		String agriTraining = (String)attributes.get("agriTraining");

		if (agriTraining != null) {
			setAgriTraining(agriTraining);
		}

		String trainingMethod = (String)attributes.get("trainingMethod");

		if (trainingMethod != null) {
			setTrainingMethod(trainingMethod);
		}

		String mainAgriActivity = (String)attributes.get("mainAgriActivity");

		if (mainAgriActivity != null) {
			setMainAgriActivity(mainAgriActivity);
		}

		String neareshPoliceStation = (String)attributes.get(
			"neareshPoliceStation");

		if (neareshPoliceStation != null) {
			setNeareshPoliceStation(neareshPoliceStation);
		}

		String jasBranchGroup = (String)attributes.get("jasBranchGroup");

		if (jasBranchGroup != null) {
			setJasBranchGroup(jasBranchGroup);
		}

		String holdingStartYear = (String)attributes.get("holdingStartYear");

		if (holdingStartYear != null) {
			setHoldingStartYear(holdingStartYear);
		}

		String farmerType = (String)attributes.get("farmerType");

		if (farmerType != null) {
			setFarmerType(farmerType);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String mainInformationSources = (String)attributes.get(
			"mainInformationSources");

		if (mainInformationSources != null) {
			setMainInformationSources(mainInformationSources);
		}

		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
		}
	}

	@Override
	public FarmerProfile cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agrii institution of this farmer profile.
	 *
	 * @return the agrii institution of this farmer profile
	 */
	@Override
	public String getAgriiInstitution() {
		return model.getAgriiInstitution();
	}

	/**
	 * Returns the agri training of this farmer profile.
	 *
	 * @return the agri training of this farmer profile
	 */
	@Override
	public String getAgriTraining() {
		return model.getAgriTraining();
	}

	/**
	 * Returns the company ID of this farmer profile.
	 *
	 * @return the company ID of this farmer profile
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farmer profile.
	 *
	 * @return the create date of this farmer profile
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the education level of this farmer profile.
	 *
	 * @return the education level of this farmer profile
	 */
	@Override
	public String getEducationLevel() {
		return model.getEducationLevel();
	}

	/**
	 * Returns the farmer application ID of this farmer profile.
	 *
	 * @return the farmer application ID of this farmer profile
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farmer profile ID of this farmer profile.
	 *
	 * @return the farmer profile ID of this farmer profile
	 */
	@Override
	public long getFarmerProfileId() {
		return model.getFarmerProfileId();
	}

	/**
	 * Returns the farmer type of this farmer profile.
	 *
	 * @return the farmer type of this farmer profile
	 */
	@Override
	public String getFarmerType() {
		return model.getFarmerType();
	}

	/**
	 * Returns the group ID of this farmer profile.
	 *
	 * @return the group ID of this farmer profile
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the holding start year of this farmer profile.
	 *
	 * @return the holding start year of this farmer profile
	 */
	@Override
	public String getHoldingStartYear() {
		return model.getHoldingStartYear();
	}

	/**
	 * Returns the jas branch group of this farmer profile.
	 *
	 * @return the jas branch group of this farmer profile
	 */
	@Override
	public String getJasBranchGroup() {
		return model.getJasBranchGroup();
	}

	/**
	 * Returns the livelihood of this farmer profile.
	 *
	 * @return the livelihood of this farmer profile
	 */
	@Override
	public String getLivelihood() {
		return model.getLivelihood();
	}

	/**
	 * Returns the live on farm of this farmer profile.
	 *
	 * @return the live on farm of this farmer profile
	 */
	@Override
	public String getLiveOnFarm() {
		return model.getLiveOnFarm();
	}

	/**
	 * Returns the main agri activity of this farmer profile.
	 *
	 * @return the main agri activity of this farmer profile
	 */
	@Override
	public String getMainAgriActivity() {
		return model.getMainAgriActivity();
	}

	/**
	 * Returns the main information sources of this farmer profile.
	 *
	 * @return the main information sources of this farmer profile
	 */
	@Override
	public String getMainInformationSources() {
		return model.getMainInformationSources();
	}

	/**
	 * Returns the main occupation of this farmer profile.
	 *
	 * @return the main occupation of this farmer profile
	 */
	@Override
	public String getMainOccupation() {
		return model.getMainOccupation();
	}

	/**
	 * Returns the manager of this farmer profile.
	 *
	 * @return the manager of this farmer profile
	 */
	@Override
	public String getManager() {
		return model.getManager();
	}

	/**
	 * Returns the modified date of this farmer profile.
	 *
	 * @return the modified date of this farmer profile
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nearesh police station of this farmer profile.
	 *
	 * @return the nearesh police station of this farmer profile
	 */
	@Override
	public String getNeareshPoliceStation() {
		return model.getNeareshPoliceStation();
	}

	/**
	 * Returns the primary key of this farmer profile.
	 *
	 * @return the primary key of this farmer profile
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualification of this farmer profile.
	 *
	 * @return the qualification of this farmer profile
	 */
	@Override
	public String getQualification() {
		return model.getQualification();
	}

	/**
	 * Returns the remarks of this farmer profile.
	 *
	 * @return the remarks of this farmer profile
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the respondent of this farmer profile.
	 *
	 * @return the respondent of this farmer profile
	 */
	@Override
	public String getRespondent() {
		return model.getRespondent();
	}

	/**
	 * Returns the training method of this farmer profile.
	 *
	 * @return the training method of this farmer profile
	 */
	@Override
	public String getTrainingMethod() {
		return model.getTrainingMethod();
	}

	/**
	 * Returns the user ID of this farmer profile.
	 *
	 * @return the user ID of this farmer profile
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer profile.
	 *
	 * @return the user name of this farmer profile
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer profile.
	 *
	 * @return the user uuid of this farmer profile
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the agrii institution of this farmer profile.
	 *
	 * @param agriiInstitution the agrii institution of this farmer profile
	 */
	@Override
	public void setAgriiInstitution(String agriiInstitution) {
		model.setAgriiInstitution(agriiInstitution);
	}

	/**
	 * Sets the agri training of this farmer profile.
	 *
	 * @param agriTraining the agri training of this farmer profile
	 */
	@Override
	public void setAgriTraining(String agriTraining) {
		model.setAgriTraining(agriTraining);
	}

	/**
	 * Sets the company ID of this farmer profile.
	 *
	 * @param companyId the company ID of this farmer profile
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farmer profile.
	 *
	 * @param createDate the create date of this farmer profile
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the education level of this farmer profile.
	 *
	 * @param educationLevel the education level of this farmer profile
	 */
	@Override
	public void setEducationLevel(String educationLevel) {
		model.setEducationLevel(educationLevel);
	}

	/**
	 * Sets the farmer application ID of this farmer profile.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer profile
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farmer profile ID of this farmer profile.
	 *
	 * @param farmerProfileId the farmer profile ID of this farmer profile
	 */
	@Override
	public void setFarmerProfileId(long farmerProfileId) {
		model.setFarmerProfileId(farmerProfileId);
	}

	/**
	 * Sets the farmer type of this farmer profile.
	 *
	 * @param farmerType the farmer type of this farmer profile
	 */
	@Override
	public void setFarmerType(String farmerType) {
		model.setFarmerType(farmerType);
	}

	/**
	 * Sets the group ID of this farmer profile.
	 *
	 * @param groupId the group ID of this farmer profile
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the holding start year of this farmer profile.
	 *
	 * @param holdingStartYear the holding start year of this farmer profile
	 */
	@Override
	public void setHoldingStartYear(String holdingStartYear) {
		model.setHoldingStartYear(holdingStartYear);
	}

	/**
	 * Sets the jas branch group of this farmer profile.
	 *
	 * @param jasBranchGroup the jas branch group of this farmer profile
	 */
	@Override
	public void setJasBranchGroup(String jasBranchGroup) {
		model.setJasBranchGroup(jasBranchGroup);
	}

	/**
	 * Sets the livelihood of this farmer profile.
	 *
	 * @param livelihood the livelihood of this farmer profile
	 */
	@Override
	public void setLivelihood(String livelihood) {
		model.setLivelihood(livelihood);
	}

	/**
	 * Sets the live on farm of this farmer profile.
	 *
	 * @param liveOnFarm the live on farm of this farmer profile
	 */
	@Override
	public void setLiveOnFarm(String liveOnFarm) {
		model.setLiveOnFarm(liveOnFarm);
	}

	/**
	 * Sets the main agri activity of this farmer profile.
	 *
	 * @param mainAgriActivity the main agri activity of this farmer profile
	 */
	@Override
	public void setMainAgriActivity(String mainAgriActivity) {
		model.setMainAgriActivity(mainAgriActivity);
	}

	/**
	 * Sets the main information sources of this farmer profile.
	 *
	 * @param mainInformationSources the main information sources of this farmer profile
	 */
	@Override
	public void setMainInformationSources(String mainInformationSources) {
		model.setMainInformationSources(mainInformationSources);
	}

	/**
	 * Sets the main occupation of this farmer profile.
	 *
	 * @param mainOccupation the main occupation of this farmer profile
	 */
	@Override
	public void setMainOccupation(String mainOccupation) {
		model.setMainOccupation(mainOccupation);
	}

	/**
	 * Sets the manager of this farmer profile.
	 *
	 * @param manager the manager of this farmer profile
	 */
	@Override
	public void setManager(String manager) {
		model.setManager(manager);
	}

	/**
	 * Sets the modified date of this farmer profile.
	 *
	 * @param modifiedDate the modified date of this farmer profile
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nearesh police station of this farmer profile.
	 *
	 * @param neareshPoliceStation the nearesh police station of this farmer profile
	 */
	@Override
	public void setNeareshPoliceStation(String neareshPoliceStation) {
		model.setNeareshPoliceStation(neareshPoliceStation);
	}

	/**
	 * Sets the primary key of this farmer profile.
	 *
	 * @param primaryKey the primary key of this farmer profile
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualification of this farmer profile.
	 *
	 * @param qualification the qualification of this farmer profile
	 */
	@Override
	public void setQualification(String qualification) {
		model.setQualification(qualification);
	}

	/**
	 * Sets the remarks of this farmer profile.
	 *
	 * @param remarks the remarks of this farmer profile
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the respondent of this farmer profile.
	 *
	 * @param respondent the respondent of this farmer profile
	 */
	@Override
	public void setRespondent(String respondent) {
		model.setRespondent(respondent);
	}

	/**
	 * Sets the training method of this farmer profile.
	 *
	 * @param trainingMethod the training method of this farmer profile
	 */
	@Override
	public void setTrainingMethod(String trainingMethod) {
		model.setTrainingMethod(trainingMethod);
	}

	/**
	 * Sets the user ID of this farmer profile.
	 *
	 * @param userId the user ID of this farmer profile
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer profile.
	 *
	 * @param userName the user name of this farmer profile
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer profile.
	 *
	 * @param userUuid the user uuid of this farmer profile
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerProfileWrapper wrap(FarmerProfile farmerProfile) {
		return new FarmerProfileWrapper(farmerProfile);
	}

}