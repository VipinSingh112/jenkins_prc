/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismDeskVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismDeskVerification
 * @generated
 */
public class TourismDeskVerificationWrapper
	extends BaseModelWrapper<TourismDeskVerification>
	implements ModelWrapper<TourismDeskVerification>, TourismDeskVerification {

	public TourismDeskVerificationWrapper(
		TourismDeskVerification tourismDeskVerification) {

		super(tourismDeskVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismDeskVeriId", getTourismDeskVeriId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tourismApplicationId", getTourismApplicationId());
		attributes.put("documentStatus", getDocumentStatus());
		attributes.put("documentName", getDocumentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismDeskVeriId = (Long)attributes.get("tourismDeskVeriId");

		if (tourismDeskVeriId != null) {
			setTourismDeskVeriId(tourismDeskVeriId);
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

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}

		String documentStatus = (String)attributes.get("documentStatus");

		if (documentStatus != null) {
			setDocumentStatus(documentStatus);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}
	}

	@Override
	public TourismDeskVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism desk verification.
	 *
	 * @return the company ID of this tourism desk verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism desk verification.
	 *
	 * @return the create date of this tourism desk verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this tourism desk verification.
	 *
	 * @return the document name of this tourism desk verification
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document status of this tourism desk verification.
	 *
	 * @return the document status of this tourism desk verification
	 */
	@Override
	public String getDocumentStatus() {
		return model.getDocumentStatus();
	}

	/**
	 * Returns the group ID of this tourism desk verification.
	 *
	 * @return the group ID of this tourism desk verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism desk verification.
	 *
	 * @return the modified date of this tourism desk verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism desk verification.
	 *
	 * @return the primary key of this tourism desk verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism desk verification.
	 *
	 * @return the tourism application ID of this tourism desk verification
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism desk veri ID of this tourism desk verification.
	 *
	 * @return the tourism desk veri ID of this tourism desk verification
	 */
	@Override
	public long getTourismDeskVeriId() {
		return model.getTourismDeskVeriId();
	}

	/**
	 * Returns the user ID of this tourism desk verification.
	 *
	 * @return the user ID of this tourism desk verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism desk verification.
	 *
	 * @return the user name of this tourism desk verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism desk verification.
	 *
	 * @return the user uuid of this tourism desk verification
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
	 * Sets the company ID of this tourism desk verification.
	 *
	 * @param companyId the company ID of this tourism desk verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism desk verification.
	 *
	 * @param createDate the create date of this tourism desk verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this tourism desk verification.
	 *
	 * @param documentName the document name of this tourism desk verification
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document status of this tourism desk verification.
	 *
	 * @param documentStatus the document status of this tourism desk verification
	 */
	@Override
	public void setDocumentStatus(String documentStatus) {
		model.setDocumentStatus(documentStatus);
	}

	/**
	 * Sets the group ID of this tourism desk verification.
	 *
	 * @param groupId the group ID of this tourism desk verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism desk verification.
	 *
	 * @param modifiedDate the modified date of this tourism desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism desk verification.
	 *
	 * @param primaryKey the primary key of this tourism desk verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism desk verification.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism desk verification
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism desk veri ID of this tourism desk verification.
	 *
	 * @param tourismDeskVeriId the tourism desk veri ID of this tourism desk verification
	 */
	@Override
	public void setTourismDeskVeriId(long tourismDeskVeriId) {
		model.setTourismDeskVeriId(tourismDeskVeriId);
	}

	/**
	 * Sets the user ID of this tourism desk verification.
	 *
	 * @param userId the user ID of this tourism desk verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism desk verification.
	 *
	 * @param userName the user name of this tourism desk verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism desk verification.
	 *
	 * @param userUuid the user uuid of this tourism desk verification
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
	protected TourismDeskVerificationWrapper wrap(
		TourismDeskVerification tourismDeskVerification) {

		return new TourismDeskVerificationWrapper(tourismDeskVerification);
	}

}