/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AddApplicantPractitioner}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddApplicantPractitioner
 * @generated
 */
public class AddApplicantPractitionerWrapper
	extends BaseModelWrapper<AddApplicantPractitioner>
	implements AddApplicantPractitioner,
			   ModelWrapper<AddApplicantPractitioner> {

	public AddApplicantPractitionerWrapper(
		AddApplicantPractitioner addApplicantPractitioner) {

		super(addApplicantPractitioner);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"addApplicantPractitionerId", getAddApplicantPractitionerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantDate", getApplicantDate());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long addApplicantPractitionerId = (Long)attributes.get(
			"addApplicantPractitionerId");

		if (addApplicantPractitionerId != null) {
			setAddApplicantPractitionerId(addApplicantPractitionerId);
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

		Date applicantDate = (Date)attributes.get("applicantDate");

		if (applicantDate != null) {
			setApplicantDate(applicantDate);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public AddApplicantPractitioner cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add applicant practitioner ID of this add applicant practitioner.
	 *
	 * @return the add applicant practitioner ID of this add applicant practitioner
	 */
	@Override
	public long getAddApplicantPractitionerId() {
		return model.getAddApplicantPractitionerId();
	}

	/**
	 * Returns the applicant date of this add applicant practitioner.
	 *
	 * @return the applicant date of this add applicant practitioner
	 */
	@Override
	public Date getApplicantDate() {
		return model.getApplicantDate();
	}

	/**
	 * Returns the company ID of this add applicant practitioner.
	 *
	 * @return the company ID of this add applicant practitioner
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add applicant practitioner.
	 *
	 * @return the counter of this add applicant practitioner
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add applicant practitioner.
	 *
	 * @return the create date of this add applicant practitioner
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add applicant practitioner.
	 *
	 * @return the group ID of this add applicant practitioner
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this add applicant practitioner.
	 *
	 * @return the hsra application ID of this add applicant practitioner
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this add applicant practitioner.
	 *
	 * @return the modified date of this add applicant practitioner
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add applicant practitioner.
	 *
	 * @return the primary key of this add applicant practitioner
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add applicant practitioner.
	 *
	 * @return the user ID of this add applicant practitioner
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add applicant practitioner.
	 *
	 * @return the user name of this add applicant practitioner
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add applicant practitioner.
	 *
	 * @return the user uuid of this add applicant practitioner
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this add applicant practitioner.
	 *
	 * @return the uuid of this add applicant practitioner
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the add applicant practitioner ID of this add applicant practitioner.
	 *
	 * @param addApplicantPractitionerId the add applicant practitioner ID of this add applicant practitioner
	 */
	@Override
	public void setAddApplicantPractitionerId(long addApplicantPractitionerId) {
		model.setAddApplicantPractitionerId(addApplicantPractitionerId);
	}

	/**
	 * Sets the applicant date of this add applicant practitioner.
	 *
	 * @param applicantDate the applicant date of this add applicant practitioner
	 */
	@Override
	public void setApplicantDate(Date applicantDate) {
		model.setApplicantDate(applicantDate);
	}

	/**
	 * Sets the company ID of this add applicant practitioner.
	 *
	 * @param companyId the company ID of this add applicant practitioner
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add applicant practitioner.
	 *
	 * @param counter the counter of this add applicant practitioner
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add applicant practitioner.
	 *
	 * @param createDate the create date of this add applicant practitioner
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add applicant practitioner.
	 *
	 * @param groupId the group ID of this add applicant practitioner
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this add applicant practitioner.
	 *
	 * @param hsraApplicationId the hsra application ID of this add applicant practitioner
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this add applicant practitioner.
	 *
	 * @param modifiedDate the modified date of this add applicant practitioner
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add applicant practitioner.
	 *
	 * @param primaryKey the primary key of this add applicant practitioner
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add applicant practitioner.
	 *
	 * @param userId the user ID of this add applicant practitioner
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add applicant practitioner.
	 *
	 * @param userName the user name of this add applicant practitioner
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add applicant practitioner.
	 *
	 * @param userUuid the user uuid of this add applicant practitioner
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this add applicant practitioner.
	 *
	 * @param uuid the uuid of this add applicant practitioner
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AddApplicantPractitionerWrapper wrap(
		AddApplicantPractitioner addApplicantPractitioner) {

		return new AddApplicantPractitionerWrapper(addApplicantPractitioner);
	}

}