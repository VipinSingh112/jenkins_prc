/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireApplicationDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationDetails
 * @generated
 */
public class AcquireApplicationDetailsWrapper
	extends BaseModelWrapper<AcquireApplicationDetails>
	implements AcquireApplicationDetails,
			   ModelWrapper<AcquireApplicationDetails> {

	public AcquireApplicationDetailsWrapper(
		AcquireApplicationDetails acquireApplicationDetails) {

		super(acquireApplicationDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"acquireApplicationDetailsId", getAcquireApplicationDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantOrganisation", getApplicantOrganisation());
		attributes.put("applicantPostalAddr", getApplicantPostalAddr());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantTeleNum", getApplicantTeleNum());
		attributes.put("acquireApplicationId", getAcquireApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireApplicationDetailsId = (Long)attributes.get(
			"acquireApplicationDetailsId");

		if (acquireApplicationDetailsId != null) {
			setAcquireApplicationDetailsId(acquireApplicationDetailsId);
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

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantOrganisation = (String)attributes.get(
			"applicantOrganisation");

		if (applicantOrganisation != null) {
			setApplicantOrganisation(applicantOrganisation);
		}

		String applicantPostalAddr = (String)attributes.get(
			"applicantPostalAddr");

		if (applicantPostalAddr != null) {
			setApplicantPostalAddr(applicantPostalAddr);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
		}

		String applicantTeleNum = (String)attributes.get("applicantTeleNum");

		if (applicantTeleNum != null) {
			setApplicantTeleNum(applicantTeleNum);
		}

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
		}
	}

	@Override
	public AcquireApplicationDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application details ID of this acquire application details.
	 *
	 * @return the acquire application details ID of this acquire application details
	 */
	@Override
	public long getAcquireApplicationDetailsId() {
		return model.getAcquireApplicationDetailsId();
	}

	/**
	 * Returns the acquire application ID of this acquire application details.
	 *
	 * @return the acquire application ID of this acquire application details
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the applicant email of this acquire application details.
	 *
	 * @return the applicant email of this acquire application details
	 */
	@Override
	public String getApplicantEmail() {
		return model.getApplicantEmail();
	}

	/**
	 * Returns the applicant name of this acquire application details.
	 *
	 * @return the applicant name of this acquire application details
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the applicant organisation of this acquire application details.
	 *
	 * @return the applicant organisation of this acquire application details
	 */
	@Override
	public String getApplicantOrganisation() {
		return model.getApplicantOrganisation();
	}

	/**
	 * Returns the applicant postal addr of this acquire application details.
	 *
	 * @return the applicant postal addr of this acquire application details
	 */
	@Override
	public String getApplicantPostalAddr() {
		return model.getApplicantPostalAddr();
	}

	/**
	 * Returns the applicant tele num of this acquire application details.
	 *
	 * @return the applicant tele num of this acquire application details
	 */
	@Override
	public String getApplicantTeleNum() {
		return model.getApplicantTeleNum();
	}

	/**
	 * Returns the company ID of this acquire application details.
	 *
	 * @return the company ID of this acquire application details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire application details.
	 *
	 * @return the create date of this acquire application details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acquire application details.
	 *
	 * @return the group ID of this acquire application details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire application details.
	 *
	 * @return the modified date of this acquire application details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire application details.
	 *
	 * @return the primary key of this acquire application details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire application details.
	 *
	 * @return the user ID of this acquire application details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire application details.
	 *
	 * @return the user name of this acquire application details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire application details.
	 *
	 * @return the user uuid of this acquire application details
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
	 * Sets the acquire application details ID of this acquire application details.
	 *
	 * @param acquireApplicationDetailsId the acquire application details ID of this acquire application details
	 */
	@Override
	public void setAcquireApplicationDetailsId(
		long acquireApplicationDetailsId) {

		model.setAcquireApplicationDetailsId(acquireApplicationDetailsId);
	}

	/**
	 * Sets the acquire application ID of this acquire application details.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire application details
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the applicant email of this acquire application details.
	 *
	 * @param applicantEmail the applicant email of this acquire application details
	 */
	@Override
	public void setApplicantEmail(String applicantEmail) {
		model.setApplicantEmail(applicantEmail);
	}

	/**
	 * Sets the applicant name of this acquire application details.
	 *
	 * @param applicantName the applicant name of this acquire application details
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the applicant organisation of this acquire application details.
	 *
	 * @param applicantOrganisation the applicant organisation of this acquire application details
	 */
	@Override
	public void setApplicantOrganisation(String applicantOrganisation) {
		model.setApplicantOrganisation(applicantOrganisation);
	}

	/**
	 * Sets the applicant postal addr of this acquire application details.
	 *
	 * @param applicantPostalAddr the applicant postal addr of this acquire application details
	 */
	@Override
	public void setApplicantPostalAddr(String applicantPostalAddr) {
		model.setApplicantPostalAddr(applicantPostalAddr);
	}

	/**
	 * Sets the applicant tele num of this acquire application details.
	 *
	 * @param applicantTeleNum the applicant tele num of this acquire application details
	 */
	@Override
	public void setApplicantTeleNum(String applicantTeleNum) {
		model.setApplicantTeleNum(applicantTeleNum);
	}

	/**
	 * Sets the company ID of this acquire application details.
	 *
	 * @param companyId the company ID of this acquire application details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire application details.
	 *
	 * @param createDate the create date of this acquire application details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acquire application details.
	 *
	 * @param groupId the group ID of this acquire application details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire application details.
	 *
	 * @param modifiedDate the modified date of this acquire application details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire application details.
	 *
	 * @param primaryKey the primary key of this acquire application details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire application details.
	 *
	 * @param userId the user ID of this acquire application details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire application details.
	 *
	 * @param userName the user name of this acquire application details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire application details.
	 *
	 * @param userUuid the user uuid of this acquire application details
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
	protected AcquireApplicationDetailsWrapper wrap(
		AcquireApplicationDetails acquireApplicationDetails) {

		return new AcquireApplicationDetailsWrapper(acquireApplicationDetails);
	}

}