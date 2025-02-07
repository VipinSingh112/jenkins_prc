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
 * This class is a wrapper for {@link TourismBonaGroundPaymentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundPaymentInfo
 * @generated
 */
public class TourismBonaGroundPaymentInfoWrapper
	extends BaseModelWrapper<TourismBonaGroundPaymentInfo>
	implements ModelWrapper<TourismBonaGroundPaymentInfo>,
			   TourismBonaGroundPaymentInfo {

	public TourismBonaGroundPaymentInfoWrapper(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		super(tourismBonaGroundPaymentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismBonaGroundPayId", getTourismBonaGroundPayId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("paymentMethod", getPaymentMethod());
		attributes.put("paymentOtherMethod", getPaymentOtherMethod());
		attributes.put("paymentProof", getPaymentProof());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaGroundPayId = (Long)attributes.get(
			"tourismBonaGroundPayId");

		if (tourismBonaGroundPayId != null) {
			setTourismBonaGroundPayId(tourismBonaGroundPayId);
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

		String paymentMethod = (String)attributes.get("paymentMethod");

		if (paymentMethod != null) {
			setPaymentMethod(paymentMethod);
		}

		String paymentOtherMethod = (String)attributes.get(
			"paymentOtherMethod");

		if (paymentOtherMethod != null) {
			setPaymentOtherMethod(paymentOtherMethod);
		}

		String paymentProof = (String)attributes.get("paymentProof");

		if (paymentProof != null) {
			setPaymentProof(paymentProof);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaGroundPaymentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism bona ground payment info.
	 *
	 * @return the company ID of this tourism bona ground payment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona ground payment info.
	 *
	 * @return the create date of this tourism bona ground payment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona ground payment info.
	 *
	 * @return the group ID of this tourism bona ground payment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona ground payment info.
	 *
	 * @return the modified date of this tourism bona ground payment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment method of this tourism bona ground payment info.
	 *
	 * @return the payment method of this tourism bona ground payment info
	 */
	@Override
	public String getPaymentMethod() {
		return model.getPaymentMethod();
	}

	/**
	 * Returns the payment other method of this tourism bona ground payment info.
	 *
	 * @return the payment other method of this tourism bona ground payment info
	 */
	@Override
	public String getPaymentOtherMethod() {
		return model.getPaymentOtherMethod();
	}

	/**
	 * Returns the payment proof of this tourism bona ground payment info.
	 *
	 * @return the payment proof of this tourism bona ground payment info
	 */
	@Override
	public String getPaymentProof() {
		return model.getPaymentProof();
	}

	/**
	 * Returns the primary key of this tourism bona ground payment info.
	 *
	 * @return the primary key of this tourism bona ground payment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism bona ground payment info.
	 *
	 * @return the tourism application ID of this tourism bona ground payment info
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona ground pay ID of this tourism bona ground payment info.
	 *
	 * @return the tourism bona ground pay ID of this tourism bona ground payment info
	 */
	@Override
	public long getTourismBonaGroundPayId() {
		return model.getTourismBonaGroundPayId();
	}

	/**
	 * Returns the user ID of this tourism bona ground payment info.
	 *
	 * @return the user ID of this tourism bona ground payment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona ground payment info.
	 *
	 * @return the user name of this tourism bona ground payment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona ground payment info.
	 *
	 * @return the user uuid of this tourism bona ground payment info
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
	 * Sets the company ID of this tourism bona ground payment info.
	 *
	 * @param companyId the company ID of this tourism bona ground payment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona ground payment info.
	 *
	 * @param createDate the create date of this tourism bona ground payment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona ground payment info.
	 *
	 * @param groupId the group ID of this tourism bona ground payment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona ground payment info.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground payment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment method of this tourism bona ground payment info.
	 *
	 * @param paymentMethod the payment method of this tourism bona ground payment info
	 */
	@Override
	public void setPaymentMethod(String paymentMethod) {
		model.setPaymentMethod(paymentMethod);
	}

	/**
	 * Sets the payment other method of this tourism bona ground payment info.
	 *
	 * @param paymentOtherMethod the payment other method of this tourism bona ground payment info
	 */
	@Override
	public void setPaymentOtherMethod(String paymentOtherMethod) {
		model.setPaymentOtherMethod(paymentOtherMethod);
	}

	/**
	 * Sets the payment proof of this tourism bona ground payment info.
	 *
	 * @param paymentProof the payment proof of this tourism bona ground payment info
	 */
	@Override
	public void setPaymentProof(String paymentProof) {
		model.setPaymentProof(paymentProof);
	}

	/**
	 * Sets the primary key of this tourism bona ground payment info.
	 *
	 * @param primaryKey the primary key of this tourism bona ground payment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism bona ground payment info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground payment info
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona ground pay ID of this tourism bona ground payment info.
	 *
	 * @param tourismBonaGroundPayId the tourism bona ground pay ID of this tourism bona ground payment info
	 */
	@Override
	public void setTourismBonaGroundPayId(long tourismBonaGroundPayId) {
		model.setTourismBonaGroundPayId(tourismBonaGroundPayId);
	}

	/**
	 * Sets the user ID of this tourism bona ground payment info.
	 *
	 * @param userId the user ID of this tourism bona ground payment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona ground payment info.
	 *
	 * @param userName the user name of this tourism bona ground payment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona ground payment info.
	 *
	 * @param userUuid the user uuid of this tourism bona ground payment info
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
	protected TourismBonaGroundPaymentInfoWrapper wrap(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return new TourismBonaGroundPaymentInfoWrapper(
			tourismBonaGroundPaymentInfo);
	}

}