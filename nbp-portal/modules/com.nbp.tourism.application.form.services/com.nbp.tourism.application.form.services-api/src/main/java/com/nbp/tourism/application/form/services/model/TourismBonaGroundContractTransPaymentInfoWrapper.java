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
 * This class is a wrapper for {@link TourismBonaGroundContractTransPaymentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundContractTransPaymentInfo
 * @generated
 */
public class TourismBonaGroundContractTransPaymentInfoWrapper
	extends BaseModelWrapper<TourismBonaGroundContractTransPaymentInfo>
	implements ModelWrapper<TourismBonaGroundContractTransPaymentInfo>,
			   TourismBonaGroundContractTransPaymentInfo {

	public TourismBonaGroundContractTransPaymentInfoWrapper(
		TourismBonaGroundContractTransPaymentInfo
			tourismBonaGroundContractTransPaymentInfo) {

		super(tourismBonaGroundContractTransPaymentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismBonaGroTransPayId", getTourismBonaGroTransPayId());
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
		Long tourismBonaGroTransPayId = (Long)attributes.get(
			"tourismBonaGroTransPayId");

		if (tourismBonaGroTransPayId != null) {
			setTourismBonaGroTransPayId(tourismBonaGroTransPayId);
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
	public TourismBonaGroundContractTransPaymentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism bona ground contract trans payment info.
	 *
	 * @return the company ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contract type of this tourism bona ground contract trans payment info.
	 *
	 * @return the contract type of this tourism bona ground contract trans payment info
	 */
	@Override
	public String getContractType() {
		return model.getContractType();
	}

	/**
	 * Returns the create date of this tourism bona ground contract trans payment info.
	 *
	 * @return the create date of this tourism bona ground contract trans payment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona ground contract trans payment info.
	 *
	 * @return the group ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona ground contract trans payment info.
	 *
	 * @return the modified date of this tourism bona ground contract trans payment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona ground contract trans payment info.
	 *
	 * @return the primary key of this tourism bona ground contract trans payment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona ground contract trans payment info.
	 *
	 * @return the tourism application ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona gro trans pay ID of this tourism bona ground contract trans payment info.
	 *
	 * @return the tourism bona gro trans pay ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public long getTourismBonaGroTransPayId() {
		return model.getTourismBonaGroTransPayId();
	}

	/**
	 * Returns the user ID of this tourism bona ground contract trans payment info.
	 *
	 * @return the user ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona ground contract trans payment info.
	 *
	 * @return the user name of this tourism bona ground contract trans payment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona ground contract trans payment info.
	 *
	 * @return the user uuid of this tourism bona ground contract trans payment info
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
	 * Sets the company ID of this tourism bona ground contract trans payment info.
	 *
	 * @param companyId the company ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contract type of this tourism bona ground contract trans payment info.
	 *
	 * @param contractType the contract type of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setContractType(String contractType) {
		model.setContractType(contractType);
	}

	/**
	 * Sets the create date of this tourism bona ground contract trans payment info.
	 *
	 * @param createDate the create date of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona ground contract trans payment info.
	 *
	 * @param groupId the group ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona ground contract trans payment info.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona ground contract trans payment info.
	 *
	 * @param primaryKey the primary key of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona ground contract trans payment info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona gro trans pay ID of this tourism bona ground contract trans payment info.
	 *
	 * @param tourismBonaGroTransPayId the tourism bona gro trans pay ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setTourismBonaGroTransPayId(long tourismBonaGroTransPayId) {
		model.setTourismBonaGroTransPayId(tourismBonaGroTransPayId);
	}

	/**
	 * Sets the user ID of this tourism bona ground contract trans payment info.
	 *
	 * @param userId the user ID of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona ground contract trans payment info.
	 *
	 * @param userName the user name of this tourism bona ground contract trans payment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona ground contract trans payment info.
	 *
	 * @param userUuid the user uuid of this tourism bona ground contract trans payment info
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
	protected TourismBonaGroundContractTransPaymentInfoWrapper wrap(
		TourismBonaGroundContractTransPaymentInfo
			tourismBonaGroundContractTransPaymentInfo) {

		return new TourismBonaGroundContractTransPaymentInfoWrapper(
			tourismBonaGroundContractTransPaymentInfo);
	}

}