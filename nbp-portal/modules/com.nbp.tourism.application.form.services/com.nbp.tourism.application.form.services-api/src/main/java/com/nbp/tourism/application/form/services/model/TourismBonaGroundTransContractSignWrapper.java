/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismBonaGroundTransContractSign}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransContractSign
 * @generated
 */
public class TourismBonaGroundTransContractSignWrapper
	extends BaseModelWrapper<TourismBonaGroundTransContractSign>
	implements ModelWrapper<TourismBonaGroundTransContractSign>,
			   TourismBonaGroundTransContractSign {

	public TourismBonaGroundTransContractSignWrapper(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		super(tourismBonaGroundTransContractSign);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaGroTraCoSignId", getTourismBonaGroTraCoSignId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("contractType", getContractType());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaGroTraCoSignId = (Long)attributes.get(
			"tourismBonaGroTraCoSignId");

		if (tourismBonaGroTraCoSignId != null) {
			setTourismBonaGroTraCoSignId(tourismBonaGroTraCoSignId);
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

		String contractType = (String)attributes.get("contractType");

		if (contractType != null) {
			setContractType(contractType);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaGroundTransContractSign cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism bona ground trans contract sign.
	 *
	 * @return the company ID of this tourism bona ground trans contract sign
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contract type of this tourism bona ground trans contract sign.
	 *
	 * @return the contract type of this tourism bona ground trans contract sign
	 */
	@Override
	public String getContractType() {
		return model.getContractType();
	}

	/**
	 * Returns the create date of this tourism bona ground trans contract sign.
	 *
	 * @return the create date of this tourism bona ground trans contract sign
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona ground trans contract sign.
	 *
	 * @return the group ID of this tourism bona ground trans contract sign
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona ground trans contract sign.
	 *
	 * @return the modified date of this tourism bona ground trans contract sign
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona ground trans contract sign.
	 *
	 * @return the primary key of this tourism bona ground trans contract sign
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona ground trans contract sign.
	 *
	 * @return the tourism application ID of this tourism bona ground trans contract sign
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona gro tra co sign ID of this tourism bona ground trans contract sign.
	 *
	 * @return the tourism bona gro tra co sign ID of this tourism bona ground trans contract sign
	 */
	@Override
	public long getTourismBonaGroTraCoSignId() {
		return model.getTourismBonaGroTraCoSignId();
	}

	/**
	 * Returns the user ID of this tourism bona ground trans contract sign.
	 *
	 * @return the user ID of this tourism bona ground trans contract sign
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona ground trans contract sign.
	 *
	 * @return the user name of this tourism bona ground trans contract sign
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona ground trans contract sign.
	 *
	 * @return the user uuid of this tourism bona ground trans contract sign
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
	 * Sets the company ID of this tourism bona ground trans contract sign.
	 *
	 * @param companyId the company ID of this tourism bona ground trans contract sign
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contract type of this tourism bona ground trans contract sign.
	 *
	 * @param contractType the contract type of this tourism bona ground trans contract sign
	 */
	@Override
	public void setContractType(String contractType) {
		model.setContractType(contractType);
	}

	/**
	 * Sets the create date of this tourism bona ground trans contract sign.
	 *
	 * @param createDate the create date of this tourism bona ground trans contract sign
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona ground trans contract sign.
	 *
	 * @param groupId the group ID of this tourism bona ground trans contract sign
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona ground trans contract sign.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground trans contract sign
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona ground trans contract sign.
	 *
	 * @param primaryKey the primary key of this tourism bona ground trans contract sign
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona ground trans contract sign.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground trans contract sign
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona gro tra co sign ID of this tourism bona ground trans contract sign.
	 *
	 * @param tourismBonaGroTraCoSignId the tourism bona gro tra co sign ID of this tourism bona ground trans contract sign
	 */
	@Override
	public void setTourismBonaGroTraCoSignId(long tourismBonaGroTraCoSignId) {
		model.setTourismBonaGroTraCoSignId(tourismBonaGroTraCoSignId);
	}

	/**
	 * Sets the user ID of this tourism bona ground trans contract sign.
	 *
	 * @param userId the user ID of this tourism bona ground trans contract sign
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona ground trans contract sign.
	 *
	 * @param userName the user name of this tourism bona ground trans contract sign
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona ground trans contract sign.
	 *
	 * @param userUuid the user uuid of this tourism bona ground trans contract sign
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected TourismBonaGroundTransContractSignWrapper wrap(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign) {

		return new TourismBonaGroundTransContractSignWrapper(
			tourismBonaGroundTransContractSign);
	}

}