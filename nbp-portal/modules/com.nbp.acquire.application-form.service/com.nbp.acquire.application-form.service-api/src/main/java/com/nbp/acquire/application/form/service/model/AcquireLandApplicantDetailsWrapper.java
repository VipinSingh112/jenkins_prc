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
 * This class is a wrapper for {@link AcquireLandApplicantDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandApplicantDetails
 * @generated
 */
public class AcquireLandApplicantDetailsWrapper
	extends BaseModelWrapper<AcquireLandApplicantDetails>
	implements AcquireLandApplicantDetails,
			   ModelWrapper<AcquireLandApplicantDetails> {

	public AcquireLandApplicantDetailsWrapper(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		super(acquireLandApplicantDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"acquireLandApplicantDetailsId",
			getAcquireLandApplicantDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("landApplicantName", getLandApplicantName());
		attributes.put("landApplicantGender", getLandApplicantGender());
		attributes.put("landApplicantDob", getLandApplicantDob());
		attributes.put("landApplicantTrnNum", getLandApplicantTrnNum());
		attributes.put("landApplicantHomeAddr", getLandApplicantHomeAddr());
		attributes.put(
			"landApplicantMailingAddr", getLandApplicantMailingAddr());
		attributes.put("landApplicantPhoneNum", getLandApplicantPhoneNum());
		attributes.put("landApplicantEmail", getLandApplicantEmail());
		attributes.put("acquireApplicationId", getAcquireApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireLandApplicantDetailsId = (Long)attributes.get(
			"acquireLandApplicantDetailsId");

		if (acquireLandApplicantDetailsId != null) {
			setAcquireLandApplicantDetailsId(acquireLandApplicantDetailsId);
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

		String landApplicantName = (String)attributes.get("landApplicantName");

		if (landApplicantName != null) {
			setLandApplicantName(landApplicantName);
		}

		String landApplicantGender = (String)attributes.get(
			"landApplicantGender");

		if (landApplicantGender != null) {
			setLandApplicantGender(landApplicantGender);
		}

		Date landApplicantDob = (Date)attributes.get("landApplicantDob");

		if (landApplicantDob != null) {
			setLandApplicantDob(landApplicantDob);
		}

		String landApplicantTrnNum = (String)attributes.get(
			"landApplicantTrnNum");

		if (landApplicantTrnNum != null) {
			setLandApplicantTrnNum(landApplicantTrnNum);
		}

		String landApplicantHomeAddr = (String)attributes.get(
			"landApplicantHomeAddr");

		if (landApplicantHomeAddr != null) {
			setLandApplicantHomeAddr(landApplicantHomeAddr);
		}

		String landApplicantMailingAddr = (String)attributes.get(
			"landApplicantMailingAddr");

		if (landApplicantMailingAddr != null) {
			setLandApplicantMailingAddr(landApplicantMailingAddr);
		}

		String landApplicantPhoneNum = (String)attributes.get(
			"landApplicantPhoneNum");

		if (landApplicantPhoneNum != null) {
			setLandApplicantPhoneNum(landApplicantPhoneNum);
		}

		String landApplicantEmail = (String)attributes.get(
			"landApplicantEmail");

		if (landApplicantEmail != null) {
			setLandApplicantEmail(landApplicantEmail);
		}

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
		}
	}

	@Override
	public AcquireLandApplicantDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application ID of this acquire land applicant details.
	 *
	 * @return the acquire application ID of this acquire land applicant details
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the acquire land applicant details ID of this acquire land applicant details.
	 *
	 * @return the acquire land applicant details ID of this acquire land applicant details
	 */
	@Override
	public long getAcquireLandApplicantDetailsId() {
		return model.getAcquireLandApplicantDetailsId();
	}

	/**
	 * Returns the company ID of this acquire land applicant details.
	 *
	 * @return the company ID of this acquire land applicant details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire land applicant details.
	 *
	 * @return the create date of this acquire land applicant details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acquire land applicant details.
	 *
	 * @return the group ID of this acquire land applicant details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the land applicant dob of this acquire land applicant details.
	 *
	 * @return the land applicant dob of this acquire land applicant details
	 */
	@Override
	public Date getLandApplicantDob() {
		return model.getLandApplicantDob();
	}

	/**
	 * Returns the land applicant email of this acquire land applicant details.
	 *
	 * @return the land applicant email of this acquire land applicant details
	 */
	@Override
	public String getLandApplicantEmail() {
		return model.getLandApplicantEmail();
	}

	/**
	 * Returns the land applicant gender of this acquire land applicant details.
	 *
	 * @return the land applicant gender of this acquire land applicant details
	 */
	@Override
	public String getLandApplicantGender() {
		return model.getLandApplicantGender();
	}

	/**
	 * Returns the land applicant home addr of this acquire land applicant details.
	 *
	 * @return the land applicant home addr of this acquire land applicant details
	 */
	@Override
	public String getLandApplicantHomeAddr() {
		return model.getLandApplicantHomeAddr();
	}

	/**
	 * Returns the land applicant mailing addr of this acquire land applicant details.
	 *
	 * @return the land applicant mailing addr of this acquire land applicant details
	 */
	@Override
	public String getLandApplicantMailingAddr() {
		return model.getLandApplicantMailingAddr();
	}

	/**
	 * Returns the land applicant name of this acquire land applicant details.
	 *
	 * @return the land applicant name of this acquire land applicant details
	 */
	@Override
	public String getLandApplicantName() {
		return model.getLandApplicantName();
	}

	/**
	 * Returns the land applicant phone num of this acquire land applicant details.
	 *
	 * @return the land applicant phone num of this acquire land applicant details
	 */
	@Override
	public String getLandApplicantPhoneNum() {
		return model.getLandApplicantPhoneNum();
	}

	/**
	 * Returns the land applicant trn num of this acquire land applicant details.
	 *
	 * @return the land applicant trn num of this acquire land applicant details
	 */
	@Override
	public String getLandApplicantTrnNum() {
		return model.getLandApplicantTrnNum();
	}

	/**
	 * Returns the modified date of this acquire land applicant details.
	 *
	 * @return the modified date of this acquire land applicant details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire land applicant details.
	 *
	 * @return the primary key of this acquire land applicant details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire land applicant details.
	 *
	 * @return the user ID of this acquire land applicant details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire land applicant details.
	 *
	 * @return the user name of this acquire land applicant details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire land applicant details.
	 *
	 * @return the user uuid of this acquire land applicant details
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
	 * Sets the acquire application ID of this acquire land applicant details.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire land applicant details
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the acquire land applicant details ID of this acquire land applicant details.
	 *
	 * @param acquireLandApplicantDetailsId the acquire land applicant details ID of this acquire land applicant details
	 */
	@Override
	public void setAcquireLandApplicantDetailsId(
		long acquireLandApplicantDetailsId) {

		model.setAcquireLandApplicantDetailsId(acquireLandApplicantDetailsId);
	}

	/**
	 * Sets the company ID of this acquire land applicant details.
	 *
	 * @param companyId the company ID of this acquire land applicant details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire land applicant details.
	 *
	 * @param createDate the create date of this acquire land applicant details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acquire land applicant details.
	 *
	 * @param groupId the group ID of this acquire land applicant details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the land applicant dob of this acquire land applicant details.
	 *
	 * @param landApplicantDob the land applicant dob of this acquire land applicant details
	 */
	@Override
	public void setLandApplicantDob(Date landApplicantDob) {
		model.setLandApplicantDob(landApplicantDob);
	}

	/**
	 * Sets the land applicant email of this acquire land applicant details.
	 *
	 * @param landApplicantEmail the land applicant email of this acquire land applicant details
	 */
	@Override
	public void setLandApplicantEmail(String landApplicantEmail) {
		model.setLandApplicantEmail(landApplicantEmail);
	}

	/**
	 * Sets the land applicant gender of this acquire land applicant details.
	 *
	 * @param landApplicantGender the land applicant gender of this acquire land applicant details
	 */
	@Override
	public void setLandApplicantGender(String landApplicantGender) {
		model.setLandApplicantGender(landApplicantGender);
	}

	/**
	 * Sets the land applicant home addr of this acquire land applicant details.
	 *
	 * @param landApplicantHomeAddr the land applicant home addr of this acquire land applicant details
	 */
	@Override
	public void setLandApplicantHomeAddr(String landApplicantHomeAddr) {
		model.setLandApplicantHomeAddr(landApplicantHomeAddr);
	}

	/**
	 * Sets the land applicant mailing addr of this acquire land applicant details.
	 *
	 * @param landApplicantMailingAddr the land applicant mailing addr of this acquire land applicant details
	 */
	@Override
	public void setLandApplicantMailingAddr(String landApplicantMailingAddr) {
		model.setLandApplicantMailingAddr(landApplicantMailingAddr);
	}

	/**
	 * Sets the land applicant name of this acquire land applicant details.
	 *
	 * @param landApplicantName the land applicant name of this acquire land applicant details
	 */
	@Override
	public void setLandApplicantName(String landApplicantName) {
		model.setLandApplicantName(landApplicantName);
	}

	/**
	 * Sets the land applicant phone num of this acquire land applicant details.
	 *
	 * @param landApplicantPhoneNum the land applicant phone num of this acquire land applicant details
	 */
	@Override
	public void setLandApplicantPhoneNum(String landApplicantPhoneNum) {
		model.setLandApplicantPhoneNum(landApplicantPhoneNum);
	}

	/**
	 * Sets the land applicant trn num of this acquire land applicant details.
	 *
	 * @param landApplicantTrnNum the land applicant trn num of this acquire land applicant details
	 */
	@Override
	public void setLandApplicantTrnNum(String landApplicantTrnNum) {
		model.setLandApplicantTrnNum(landApplicantTrnNum);
	}

	/**
	 * Sets the modified date of this acquire land applicant details.
	 *
	 * @param modifiedDate the modified date of this acquire land applicant details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire land applicant details.
	 *
	 * @param primaryKey the primary key of this acquire land applicant details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire land applicant details.
	 *
	 * @param userId the user ID of this acquire land applicant details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire land applicant details.
	 *
	 * @param userName the user name of this acquire land applicant details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire land applicant details.
	 *
	 * @param userUuid the user uuid of this acquire land applicant details
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
	protected AcquireLandApplicantDetailsWrapper wrap(
		AcquireLandApplicantDetails acquireLandApplicantDetails) {

		return new AcquireLandApplicantDetailsWrapper(
			acquireLandApplicantDetails);
	}

}