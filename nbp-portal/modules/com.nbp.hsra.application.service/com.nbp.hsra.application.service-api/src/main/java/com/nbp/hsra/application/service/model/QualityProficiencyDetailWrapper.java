/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QualityProficiencyDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityProficiencyDetail
 * @generated
 */
public class QualityProficiencyDetailWrapper
	extends BaseModelWrapper<QualityProficiencyDetail>
	implements ModelWrapper<QualityProficiencyDetail>,
			   QualityProficiencyDetail {

	public QualityProficiencyDetailWrapper(
		QualityProficiencyDetail qualityProficiencyDetail) {

		super(qualityProficiencyDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("qualityProficiDetailId", getQualityProficiDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("proficiencyDetails", getProficiencyDetails());
		attributes.put("workDurationOne", getWorkDurationOne());
		attributes.put("capacityOne", getCapacityOne());
		attributes.put("workDurationTwo", getWorkDurationTwo());
		attributes.put("capacityTwo", getCapacityTwo());
		attributes.put("workDurationThree", getWorkDurationThree());
		attributes.put("capacityThree", getCapacityThree());
		attributes.put("workDurationFour", getWorkDurationFour());
		attributes.put("capacityFour", getCapacityFour());
		attributes.put("workDurationFive", getWorkDurationFive());
		attributes.put("capacityFive", getCapacityFive());
		attributes.put("workDurationSix", getWorkDurationSix());
		attributes.put("capacitySix", getCapacitySix());
		attributes.put("workDurationSeven", getWorkDurationSeven());
		attributes.put("capacitySeven", getCapacitySeven());
		attributes.put("workDurationEight", getWorkDurationEight());
		attributes.put("capacityEight", getCapacityEight());
		attributes.put("workDurationNine", getWorkDurationNine());
		attributes.put("capacityNine", getCapacityNine());
		attributes.put("workDurationTen", getWorkDurationTen());
		attributes.put("capacityTen", getCapacityTen());
		attributes.put("workDurationEleven", getWorkDurationEleven());
		attributes.put("capacityEleven", getCapacityEleven());
		attributes.put("workDurationTwelve", getWorkDurationTwelve());
		attributes.put("capacityTwelve", getCapacityTwelve());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long qualityProficiDetailId = (Long)attributes.get(
			"qualityProficiDetailId");

		if (qualityProficiDetailId != null) {
			setQualityProficiDetailId(qualityProficiDetailId);
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

		String proficiencyDetails = (String)attributes.get(
			"proficiencyDetails");

		if (proficiencyDetails != null) {
			setProficiencyDetails(proficiencyDetails);
		}

		String workDurationOne = (String)attributes.get("workDurationOne");

		if (workDurationOne != null) {
			setWorkDurationOne(workDurationOne);
		}

		String capacityOne = (String)attributes.get("capacityOne");

		if (capacityOne != null) {
			setCapacityOne(capacityOne);
		}

		String workDurationTwo = (String)attributes.get("workDurationTwo");

		if (workDurationTwo != null) {
			setWorkDurationTwo(workDurationTwo);
		}

		String capacityTwo = (String)attributes.get("capacityTwo");

		if (capacityTwo != null) {
			setCapacityTwo(capacityTwo);
		}

		String workDurationThree = (String)attributes.get("workDurationThree");

		if (workDurationThree != null) {
			setWorkDurationThree(workDurationThree);
		}

		String capacityThree = (String)attributes.get("capacityThree");

		if (capacityThree != null) {
			setCapacityThree(capacityThree);
		}

		String workDurationFour = (String)attributes.get("workDurationFour");

		if (workDurationFour != null) {
			setWorkDurationFour(workDurationFour);
		}

		String capacityFour = (String)attributes.get("capacityFour");

		if (capacityFour != null) {
			setCapacityFour(capacityFour);
		}

		String workDurationFive = (String)attributes.get("workDurationFive");

		if (workDurationFive != null) {
			setWorkDurationFive(workDurationFive);
		}

		String capacityFive = (String)attributes.get("capacityFive");

		if (capacityFive != null) {
			setCapacityFive(capacityFive);
		}

		String workDurationSix = (String)attributes.get("workDurationSix");

		if (workDurationSix != null) {
			setWorkDurationSix(workDurationSix);
		}

		String capacitySix = (String)attributes.get("capacitySix");

		if (capacitySix != null) {
			setCapacitySix(capacitySix);
		}

		String workDurationSeven = (String)attributes.get("workDurationSeven");

		if (workDurationSeven != null) {
			setWorkDurationSeven(workDurationSeven);
		}

		String capacitySeven = (String)attributes.get("capacitySeven");

		if (capacitySeven != null) {
			setCapacitySeven(capacitySeven);
		}

		String workDurationEight = (String)attributes.get("workDurationEight");

		if (workDurationEight != null) {
			setWorkDurationEight(workDurationEight);
		}

		String capacityEight = (String)attributes.get("capacityEight");

		if (capacityEight != null) {
			setCapacityEight(capacityEight);
		}

		String workDurationNine = (String)attributes.get("workDurationNine");

		if (workDurationNine != null) {
			setWorkDurationNine(workDurationNine);
		}

		String capacityNine = (String)attributes.get("capacityNine");

		if (capacityNine != null) {
			setCapacityNine(capacityNine);
		}

		String workDurationTen = (String)attributes.get("workDurationTen");

		if (workDurationTen != null) {
			setWorkDurationTen(workDurationTen);
		}

		String capacityTen = (String)attributes.get("capacityTen");

		if (capacityTen != null) {
			setCapacityTen(capacityTen);
		}

		String workDurationEleven = (String)attributes.get(
			"workDurationEleven");

		if (workDurationEleven != null) {
			setWorkDurationEleven(workDurationEleven);
		}

		String capacityEleven = (String)attributes.get("capacityEleven");

		if (capacityEleven != null) {
			setCapacityEleven(capacityEleven);
		}

		String workDurationTwelve = (String)attributes.get(
			"workDurationTwelve");

		if (workDurationTwelve != null) {
			setWorkDurationTwelve(workDurationTwelve);
		}

		String capacityTwelve = (String)attributes.get("capacityTwelve");

		if (capacityTwelve != null) {
			setCapacityTwelve(capacityTwelve);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public QualityProficiencyDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the capacity eight of this quality proficiency detail.
	 *
	 * @return the capacity eight of this quality proficiency detail
	 */
	@Override
	public String getCapacityEight() {
		return model.getCapacityEight();
	}

	/**
	 * Returns the capacity eleven of this quality proficiency detail.
	 *
	 * @return the capacity eleven of this quality proficiency detail
	 */
	@Override
	public String getCapacityEleven() {
		return model.getCapacityEleven();
	}

	/**
	 * Returns the capacity five of this quality proficiency detail.
	 *
	 * @return the capacity five of this quality proficiency detail
	 */
	@Override
	public String getCapacityFive() {
		return model.getCapacityFive();
	}

	/**
	 * Returns the capacity four of this quality proficiency detail.
	 *
	 * @return the capacity four of this quality proficiency detail
	 */
	@Override
	public String getCapacityFour() {
		return model.getCapacityFour();
	}

	/**
	 * Returns the capacity nine of this quality proficiency detail.
	 *
	 * @return the capacity nine of this quality proficiency detail
	 */
	@Override
	public String getCapacityNine() {
		return model.getCapacityNine();
	}

	/**
	 * Returns the capacity one of this quality proficiency detail.
	 *
	 * @return the capacity one of this quality proficiency detail
	 */
	@Override
	public String getCapacityOne() {
		return model.getCapacityOne();
	}

	/**
	 * Returns the capacity seven of this quality proficiency detail.
	 *
	 * @return the capacity seven of this quality proficiency detail
	 */
	@Override
	public String getCapacitySeven() {
		return model.getCapacitySeven();
	}

	/**
	 * Returns the capacity six of this quality proficiency detail.
	 *
	 * @return the capacity six of this quality proficiency detail
	 */
	@Override
	public String getCapacitySix() {
		return model.getCapacitySix();
	}

	/**
	 * Returns the capacity ten of this quality proficiency detail.
	 *
	 * @return the capacity ten of this quality proficiency detail
	 */
	@Override
	public String getCapacityTen() {
		return model.getCapacityTen();
	}

	/**
	 * Returns the capacity three of this quality proficiency detail.
	 *
	 * @return the capacity three of this quality proficiency detail
	 */
	@Override
	public String getCapacityThree() {
		return model.getCapacityThree();
	}

	/**
	 * Returns the capacity twelve of this quality proficiency detail.
	 *
	 * @return the capacity twelve of this quality proficiency detail
	 */
	@Override
	public String getCapacityTwelve() {
		return model.getCapacityTwelve();
	}

	/**
	 * Returns the capacity two of this quality proficiency detail.
	 *
	 * @return the capacity two of this quality proficiency detail
	 */
	@Override
	public String getCapacityTwo() {
		return model.getCapacityTwo();
	}

	/**
	 * Returns the company ID of this quality proficiency detail.
	 *
	 * @return the company ID of this quality proficiency detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quality proficiency detail.
	 *
	 * @return the create date of this quality proficiency detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this quality proficiency detail.
	 *
	 * @return the group ID of this quality proficiency detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this quality proficiency detail.
	 *
	 * @return the hsra application ID of this quality proficiency detail
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this quality proficiency detail.
	 *
	 * @return the modified date of this quality proficiency detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this quality proficiency detail.
	 *
	 * @return the primary key of this quality proficiency detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proficiency details of this quality proficiency detail.
	 *
	 * @return the proficiency details of this quality proficiency detail
	 */
	@Override
	public String getProficiencyDetails() {
		return model.getProficiencyDetails();
	}

	/**
	 * Returns the quality profici detail ID of this quality proficiency detail.
	 *
	 * @return the quality profici detail ID of this quality proficiency detail
	 */
	@Override
	public long getQualityProficiDetailId() {
		return model.getQualityProficiDetailId();
	}

	/**
	 * Returns the user ID of this quality proficiency detail.
	 *
	 * @return the user ID of this quality proficiency detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quality proficiency detail.
	 *
	 * @return the user name of this quality proficiency detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quality proficiency detail.
	 *
	 * @return the user uuid of this quality proficiency detail
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the work duration eight of this quality proficiency detail.
	 *
	 * @return the work duration eight of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationEight() {
		return model.getWorkDurationEight();
	}

	/**
	 * Returns the work duration eleven of this quality proficiency detail.
	 *
	 * @return the work duration eleven of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationEleven() {
		return model.getWorkDurationEleven();
	}

	/**
	 * Returns the work duration five of this quality proficiency detail.
	 *
	 * @return the work duration five of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationFive() {
		return model.getWorkDurationFive();
	}

	/**
	 * Returns the work duration four of this quality proficiency detail.
	 *
	 * @return the work duration four of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationFour() {
		return model.getWorkDurationFour();
	}

	/**
	 * Returns the work duration nine of this quality proficiency detail.
	 *
	 * @return the work duration nine of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationNine() {
		return model.getWorkDurationNine();
	}

	/**
	 * Returns the work duration one of this quality proficiency detail.
	 *
	 * @return the work duration one of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationOne() {
		return model.getWorkDurationOne();
	}

	/**
	 * Returns the work duration seven of this quality proficiency detail.
	 *
	 * @return the work duration seven of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationSeven() {
		return model.getWorkDurationSeven();
	}

	/**
	 * Returns the work duration six of this quality proficiency detail.
	 *
	 * @return the work duration six of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationSix() {
		return model.getWorkDurationSix();
	}

	/**
	 * Returns the work duration ten of this quality proficiency detail.
	 *
	 * @return the work duration ten of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationTen() {
		return model.getWorkDurationTen();
	}

	/**
	 * Returns the work duration three of this quality proficiency detail.
	 *
	 * @return the work duration three of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationThree() {
		return model.getWorkDurationThree();
	}

	/**
	 * Returns the work duration twelve of this quality proficiency detail.
	 *
	 * @return the work duration twelve of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationTwelve() {
		return model.getWorkDurationTwelve();
	}

	/**
	 * Returns the work duration two of this quality proficiency detail.
	 *
	 * @return the work duration two of this quality proficiency detail
	 */
	@Override
	public String getWorkDurationTwo() {
		return model.getWorkDurationTwo();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the capacity eight of this quality proficiency detail.
	 *
	 * @param capacityEight the capacity eight of this quality proficiency detail
	 */
	@Override
	public void setCapacityEight(String capacityEight) {
		model.setCapacityEight(capacityEight);
	}

	/**
	 * Sets the capacity eleven of this quality proficiency detail.
	 *
	 * @param capacityEleven the capacity eleven of this quality proficiency detail
	 */
	@Override
	public void setCapacityEleven(String capacityEleven) {
		model.setCapacityEleven(capacityEleven);
	}

	/**
	 * Sets the capacity five of this quality proficiency detail.
	 *
	 * @param capacityFive the capacity five of this quality proficiency detail
	 */
	@Override
	public void setCapacityFive(String capacityFive) {
		model.setCapacityFive(capacityFive);
	}

	/**
	 * Sets the capacity four of this quality proficiency detail.
	 *
	 * @param capacityFour the capacity four of this quality proficiency detail
	 */
	@Override
	public void setCapacityFour(String capacityFour) {
		model.setCapacityFour(capacityFour);
	}

	/**
	 * Sets the capacity nine of this quality proficiency detail.
	 *
	 * @param capacityNine the capacity nine of this quality proficiency detail
	 */
	@Override
	public void setCapacityNine(String capacityNine) {
		model.setCapacityNine(capacityNine);
	}

	/**
	 * Sets the capacity one of this quality proficiency detail.
	 *
	 * @param capacityOne the capacity one of this quality proficiency detail
	 */
	@Override
	public void setCapacityOne(String capacityOne) {
		model.setCapacityOne(capacityOne);
	}

	/**
	 * Sets the capacity seven of this quality proficiency detail.
	 *
	 * @param capacitySeven the capacity seven of this quality proficiency detail
	 */
	@Override
	public void setCapacitySeven(String capacitySeven) {
		model.setCapacitySeven(capacitySeven);
	}

	/**
	 * Sets the capacity six of this quality proficiency detail.
	 *
	 * @param capacitySix the capacity six of this quality proficiency detail
	 */
	@Override
	public void setCapacitySix(String capacitySix) {
		model.setCapacitySix(capacitySix);
	}

	/**
	 * Sets the capacity ten of this quality proficiency detail.
	 *
	 * @param capacityTen the capacity ten of this quality proficiency detail
	 */
	@Override
	public void setCapacityTen(String capacityTen) {
		model.setCapacityTen(capacityTen);
	}

	/**
	 * Sets the capacity three of this quality proficiency detail.
	 *
	 * @param capacityThree the capacity three of this quality proficiency detail
	 */
	@Override
	public void setCapacityThree(String capacityThree) {
		model.setCapacityThree(capacityThree);
	}

	/**
	 * Sets the capacity twelve of this quality proficiency detail.
	 *
	 * @param capacityTwelve the capacity twelve of this quality proficiency detail
	 */
	@Override
	public void setCapacityTwelve(String capacityTwelve) {
		model.setCapacityTwelve(capacityTwelve);
	}

	/**
	 * Sets the capacity two of this quality proficiency detail.
	 *
	 * @param capacityTwo the capacity two of this quality proficiency detail
	 */
	@Override
	public void setCapacityTwo(String capacityTwo) {
		model.setCapacityTwo(capacityTwo);
	}

	/**
	 * Sets the company ID of this quality proficiency detail.
	 *
	 * @param companyId the company ID of this quality proficiency detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quality proficiency detail.
	 *
	 * @param createDate the create date of this quality proficiency detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this quality proficiency detail.
	 *
	 * @param groupId the group ID of this quality proficiency detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this quality proficiency detail.
	 *
	 * @param hsraApplicationId the hsra application ID of this quality proficiency detail
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this quality proficiency detail.
	 *
	 * @param modifiedDate the modified date of this quality proficiency detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this quality proficiency detail.
	 *
	 * @param primaryKey the primary key of this quality proficiency detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proficiency details of this quality proficiency detail.
	 *
	 * @param proficiencyDetails the proficiency details of this quality proficiency detail
	 */
	@Override
	public void setProficiencyDetails(String proficiencyDetails) {
		model.setProficiencyDetails(proficiencyDetails);
	}

	/**
	 * Sets the quality profici detail ID of this quality proficiency detail.
	 *
	 * @param qualityProficiDetailId the quality profici detail ID of this quality proficiency detail
	 */
	@Override
	public void setQualityProficiDetailId(long qualityProficiDetailId) {
		model.setQualityProficiDetailId(qualityProficiDetailId);
	}

	/**
	 * Sets the user ID of this quality proficiency detail.
	 *
	 * @param userId the user ID of this quality proficiency detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quality proficiency detail.
	 *
	 * @param userName the user name of this quality proficiency detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quality proficiency detail.
	 *
	 * @param userUuid the user uuid of this quality proficiency detail
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the work duration eight of this quality proficiency detail.
	 *
	 * @param workDurationEight the work duration eight of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationEight(String workDurationEight) {
		model.setWorkDurationEight(workDurationEight);
	}

	/**
	 * Sets the work duration eleven of this quality proficiency detail.
	 *
	 * @param workDurationEleven the work duration eleven of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationEleven(String workDurationEleven) {
		model.setWorkDurationEleven(workDurationEleven);
	}

	/**
	 * Sets the work duration five of this quality proficiency detail.
	 *
	 * @param workDurationFive the work duration five of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationFive(String workDurationFive) {
		model.setWorkDurationFive(workDurationFive);
	}

	/**
	 * Sets the work duration four of this quality proficiency detail.
	 *
	 * @param workDurationFour the work duration four of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationFour(String workDurationFour) {
		model.setWorkDurationFour(workDurationFour);
	}

	/**
	 * Sets the work duration nine of this quality proficiency detail.
	 *
	 * @param workDurationNine the work duration nine of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationNine(String workDurationNine) {
		model.setWorkDurationNine(workDurationNine);
	}

	/**
	 * Sets the work duration one of this quality proficiency detail.
	 *
	 * @param workDurationOne the work duration one of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationOne(String workDurationOne) {
		model.setWorkDurationOne(workDurationOne);
	}

	/**
	 * Sets the work duration seven of this quality proficiency detail.
	 *
	 * @param workDurationSeven the work duration seven of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationSeven(String workDurationSeven) {
		model.setWorkDurationSeven(workDurationSeven);
	}

	/**
	 * Sets the work duration six of this quality proficiency detail.
	 *
	 * @param workDurationSix the work duration six of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationSix(String workDurationSix) {
		model.setWorkDurationSix(workDurationSix);
	}

	/**
	 * Sets the work duration ten of this quality proficiency detail.
	 *
	 * @param workDurationTen the work duration ten of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationTen(String workDurationTen) {
		model.setWorkDurationTen(workDurationTen);
	}

	/**
	 * Sets the work duration three of this quality proficiency detail.
	 *
	 * @param workDurationThree the work duration three of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationThree(String workDurationThree) {
		model.setWorkDurationThree(workDurationThree);
	}

	/**
	 * Sets the work duration twelve of this quality proficiency detail.
	 *
	 * @param workDurationTwelve the work duration twelve of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationTwelve(String workDurationTwelve) {
		model.setWorkDurationTwelve(workDurationTwelve);
	}

	/**
	 * Sets the work duration two of this quality proficiency detail.
	 *
	 * @param workDurationTwo the work duration two of this quality proficiency detail
	 */
	@Override
	public void setWorkDurationTwo(String workDurationTwo) {
		model.setWorkDurationTwo(workDurationTwo);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected QualityProficiencyDetailWrapper wrap(
		QualityProficiencyDetail qualityProficiencyDetail) {

		return new QualityProficiencyDetailWrapper(qualityProficiencyDetail);
	}

}