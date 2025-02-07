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
 * This class is a wrapper for {@link TourismNewGroundSignature}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundSignature
 * @generated
 */
public class TourismNewGroundSignatureWrapper
	extends BaseModelWrapper<TourismNewGroundSignature>
	implements ModelWrapper<TourismNewGroundSignature>,
			   TourismNewGroundSignature {

	public TourismNewGroundSignatureWrapper(
		TourismNewGroundSignature tourismNewGroundSignature) {

		super(tourismNewGroundSignature);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"TourismNewGroundSignatureId", getTourismNewGroundSignatureId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"groundTransportationDate", getGroundTransportationDate());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long TourismNewGroundSignatureId = (Long)attributes.get(
			"TourismNewGroundSignatureId");

		if (TourismNewGroundSignatureId != null) {
			setTourismNewGroundSignatureId(TourismNewGroundSignatureId);
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

		Date groundTransportationDate = (Date)attributes.get(
			"groundTransportationDate");

		if (groundTransportationDate != null) {
			setGroundTransportationDate(groundTransportationDate);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewGroundSignature cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism new ground signature.
	 *
	 * @return the company ID of this tourism new ground signature
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new ground signature.
	 *
	 * @return the create date of this tourism new ground signature
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the ground transportation date of this tourism new ground signature.
	 *
	 * @return the ground transportation date of this tourism new ground signature
	 */
	@Override
	public Date getGroundTransportationDate() {
		return model.getGroundTransportationDate();
	}

	/**
	 * Returns the group ID of this tourism new ground signature.
	 *
	 * @return the group ID of this tourism new ground signature
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new ground signature.
	 *
	 * @return the modified date of this tourism new ground signature
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism new ground signature.
	 *
	 * @return the primary key of this tourism new ground signature
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism new ground signature.
	 *
	 * @return the tourism application ID of this tourism new ground signature
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new ground signature ID of this tourism new ground signature.
	 *
	 * @return the tourism new ground signature ID of this tourism new ground signature
	 */
	@Override
	public long getTourismNewGroundSignatureId() {
		return model.getTourismNewGroundSignatureId();
	}

	/**
	 * Returns the user ID of this tourism new ground signature.
	 *
	 * @return the user ID of this tourism new ground signature
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new ground signature.
	 *
	 * @return the user name of this tourism new ground signature
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new ground signature.
	 *
	 * @return the user uuid of this tourism new ground signature
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
	 * Sets the company ID of this tourism new ground signature.
	 *
	 * @param companyId the company ID of this tourism new ground signature
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new ground signature.
	 *
	 * @param createDate the create date of this tourism new ground signature
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the ground transportation date of this tourism new ground signature.
	 *
	 * @param groundTransportationDate the ground transportation date of this tourism new ground signature
	 */
	@Override
	public void setGroundTransportationDate(Date groundTransportationDate) {
		model.setGroundTransportationDate(groundTransportationDate);
	}

	/**
	 * Sets the group ID of this tourism new ground signature.
	 *
	 * @param groupId the group ID of this tourism new ground signature
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new ground signature.
	 *
	 * @param modifiedDate the modified date of this tourism new ground signature
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism new ground signature.
	 *
	 * @param primaryKey the primary key of this tourism new ground signature
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism new ground signature.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new ground signature
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new ground signature ID of this tourism new ground signature.
	 *
	 * @param TourismNewGroundSignatureId the tourism new ground signature ID of this tourism new ground signature
	 */
	@Override
	public void setTourismNewGroundSignatureId(
		long TourismNewGroundSignatureId) {

		model.setTourismNewGroundSignatureId(TourismNewGroundSignatureId);
	}

	/**
	 * Sets the user ID of this tourism new ground signature.
	 *
	 * @param userId the user ID of this tourism new ground signature
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new ground signature.
	 *
	 * @param userName the user name of this tourism new ground signature
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new ground signature.
	 *
	 * @param userUuid the user uuid of this tourism new ground signature
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
	protected TourismNewGroundSignatureWrapper wrap(
		TourismNewGroundSignature tourismNewGroundSignature) {

		return new TourismNewGroundSignatureWrapper(tourismNewGroundSignature);
	}

}