/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DetailOfApplicant}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicant
 * @generated
 */
public class DetailOfApplicantWrapper
	extends BaseModelWrapper<DetailOfApplicant>
	implements DetailOfApplicant, ModelWrapper<DetailOfApplicant> {

	public DetailOfApplicantWrapper(DetailOfApplicant detailOfApplicant) {
		super(detailOfApplicant);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("detailOfApplicantId", getDetailOfApplicantId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantMiddleName", getApplicantMiddleName());
		attributes.put("applicantLastName", getApplicantLastName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantEmail", getApplicantEmail());
		attributes.put("applicantTeleNum", getApplicantTeleNum());
		attributes.put("applicantTrn", getApplicantTrn());
		attributes.put("applicantIdNumber", getApplicantIdNumber());
		attributes.put("applicantDob", getApplicantDob());
		attributes.put("applicantOccupation", getApplicantOccupation());
		attributes.put("osiApplicationId", getOsiApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long detailOfApplicantId = (Long)attributes.get("detailOfApplicantId");

		if (detailOfApplicantId != null) {
			setDetailOfApplicantId(detailOfApplicantId);
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

		String applicantMiddleName = (String)attributes.get(
			"applicantMiddleName");

		if (applicantMiddleName != null) {
			setApplicantMiddleName(applicantMiddleName);
		}

		String applicantLastName = (String)attributes.get("applicantLastName");

		if (applicantLastName != null) {
			setApplicantLastName(applicantLastName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantEmail = (String)attributes.get("applicantEmail");

		if (applicantEmail != null) {
			setApplicantEmail(applicantEmail);
		}

		String applicantTeleNum = (String)attributes.get("applicantTeleNum");

		if (applicantTeleNum != null) {
			setApplicantTeleNum(applicantTeleNum);
		}

		String applicantTrn = (String)attributes.get("applicantTrn");

		if (applicantTrn != null) {
			setApplicantTrn(applicantTrn);
		}

		String applicantIdNumber = (String)attributes.get("applicantIdNumber");

		if (applicantIdNumber != null) {
			setApplicantIdNumber(applicantIdNumber);
		}

		Date applicantDob = (Date)attributes.get("applicantDob");

		if (applicantDob != null) {
			setApplicantDob(applicantDob);
		}

		String applicantOccupation = (String)attributes.get(
			"applicantOccupation");

		if (applicantOccupation != null) {
			setApplicantOccupation(applicantOccupation);
		}

		Long osiApplicationId = (Long)attributes.get("osiApplicationId");

		if (osiApplicationId != null) {
			setOsiApplicationId(osiApplicationId);
		}
	}

	@Override
	public DetailOfApplicant cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant address of this detail of applicant.
	 *
	 * @return the applicant address of this detail of applicant
	 */
	@Override
	public String getApplicantAddress() {
		return model.getApplicantAddress();
	}

	/**
	 * Returns the applicant dob of this detail of applicant.
	 *
	 * @return the applicant dob of this detail of applicant
	 */
	@Override
	public Date getApplicantDob() {
		return model.getApplicantDob();
	}

	/**
	 * Returns the applicant email of this detail of applicant.
	 *
	 * @return the applicant email of this detail of applicant
	 */
	@Override
	public String getApplicantEmail() {
		return model.getApplicantEmail();
	}

	/**
	 * Returns the applicant ID number of this detail of applicant.
	 *
	 * @return the applicant ID number of this detail of applicant
	 */
	@Override
	public String getApplicantIdNumber() {
		return model.getApplicantIdNumber();
	}

	/**
	 * Returns the applicant last name of this detail of applicant.
	 *
	 * @return the applicant last name of this detail of applicant
	 */
	@Override
	public String getApplicantLastName() {
		return model.getApplicantLastName();
	}

	/**
	 * Returns the applicant middle name of this detail of applicant.
	 *
	 * @return the applicant middle name of this detail of applicant
	 */
	@Override
	public String getApplicantMiddleName() {
		return model.getApplicantMiddleName();
	}

	/**
	 * Returns the applicant name of this detail of applicant.
	 *
	 * @return the applicant name of this detail of applicant
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the applicant occupation of this detail of applicant.
	 *
	 * @return the applicant occupation of this detail of applicant
	 */
	@Override
	public String getApplicantOccupation() {
		return model.getApplicantOccupation();
	}

	/**
	 * Returns the applicant tele num of this detail of applicant.
	 *
	 * @return the applicant tele num of this detail of applicant
	 */
	@Override
	public String getApplicantTeleNum() {
		return model.getApplicantTeleNum();
	}

	/**
	 * Returns the applicant trn of this detail of applicant.
	 *
	 * @return the applicant trn of this detail of applicant
	 */
	@Override
	public String getApplicantTrn() {
		return model.getApplicantTrn();
	}

	/**
	 * Returns the company ID of this detail of applicant.
	 *
	 * @return the company ID of this detail of applicant
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this detail of applicant.
	 *
	 * @return the create date of this detail of applicant
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the detail of applicant ID of this detail of applicant.
	 *
	 * @return the detail of applicant ID of this detail of applicant
	 */
	@Override
	public long getDetailOfApplicantId() {
		return model.getDetailOfApplicantId();
	}

	/**
	 * Returns the group ID of this detail of applicant.
	 *
	 * @return the group ID of this detail of applicant
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this detail of applicant.
	 *
	 * @return the modified date of this detail of applicant
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi application ID of this detail of applicant.
	 *
	 * @return the osi application ID of this detail of applicant
	 */
	@Override
	public long getOsiApplicationId() {
		return model.getOsiApplicationId();
	}

	/**
	 * Returns the primary key of this detail of applicant.
	 *
	 * @return the primary key of this detail of applicant
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this detail of applicant.
	 *
	 * @return the user ID of this detail of applicant
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this detail of applicant.
	 *
	 * @return the user name of this detail of applicant
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this detail of applicant.
	 *
	 * @return the user uuid of this detail of applicant
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this detail of applicant.
	 *
	 * @return the uuid of this detail of applicant
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
	 * Sets the applicant address of this detail of applicant.
	 *
	 * @param applicantAddress the applicant address of this detail of applicant
	 */
	@Override
	public void setApplicantAddress(String applicantAddress) {
		model.setApplicantAddress(applicantAddress);
	}

	/**
	 * Sets the applicant dob of this detail of applicant.
	 *
	 * @param applicantDob the applicant dob of this detail of applicant
	 */
	@Override
	public void setApplicantDob(Date applicantDob) {
		model.setApplicantDob(applicantDob);
	}

	/**
	 * Sets the applicant email of this detail of applicant.
	 *
	 * @param applicantEmail the applicant email of this detail of applicant
	 */
	@Override
	public void setApplicantEmail(String applicantEmail) {
		model.setApplicantEmail(applicantEmail);
	}

	/**
	 * Sets the applicant ID number of this detail of applicant.
	 *
	 * @param applicantIdNumber the applicant ID number of this detail of applicant
	 */
	@Override
	public void setApplicantIdNumber(String applicantIdNumber) {
		model.setApplicantIdNumber(applicantIdNumber);
	}

	/**
	 * Sets the applicant last name of this detail of applicant.
	 *
	 * @param applicantLastName the applicant last name of this detail of applicant
	 */
	@Override
	public void setApplicantLastName(String applicantLastName) {
		model.setApplicantLastName(applicantLastName);
	}

	/**
	 * Sets the applicant middle name of this detail of applicant.
	 *
	 * @param applicantMiddleName the applicant middle name of this detail of applicant
	 */
	@Override
	public void setApplicantMiddleName(String applicantMiddleName) {
		model.setApplicantMiddleName(applicantMiddleName);
	}

	/**
	 * Sets the applicant name of this detail of applicant.
	 *
	 * @param applicantName the applicant name of this detail of applicant
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the applicant occupation of this detail of applicant.
	 *
	 * @param applicantOccupation the applicant occupation of this detail of applicant
	 */
	@Override
	public void setApplicantOccupation(String applicantOccupation) {
		model.setApplicantOccupation(applicantOccupation);
	}

	/**
	 * Sets the applicant tele num of this detail of applicant.
	 *
	 * @param applicantTeleNum the applicant tele num of this detail of applicant
	 */
	@Override
	public void setApplicantTeleNum(String applicantTeleNum) {
		model.setApplicantTeleNum(applicantTeleNum);
	}

	/**
	 * Sets the applicant trn of this detail of applicant.
	 *
	 * @param applicantTrn the applicant trn of this detail of applicant
	 */
	@Override
	public void setApplicantTrn(String applicantTrn) {
		model.setApplicantTrn(applicantTrn);
	}

	/**
	 * Sets the company ID of this detail of applicant.
	 *
	 * @param companyId the company ID of this detail of applicant
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this detail of applicant.
	 *
	 * @param createDate the create date of this detail of applicant
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the detail of applicant ID of this detail of applicant.
	 *
	 * @param detailOfApplicantId the detail of applicant ID of this detail of applicant
	 */
	@Override
	public void setDetailOfApplicantId(long detailOfApplicantId) {
		model.setDetailOfApplicantId(detailOfApplicantId);
	}

	/**
	 * Sets the group ID of this detail of applicant.
	 *
	 * @param groupId the group ID of this detail of applicant
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this detail of applicant.
	 *
	 * @param modifiedDate the modified date of this detail of applicant
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi application ID of this detail of applicant.
	 *
	 * @param osiApplicationId the osi application ID of this detail of applicant
	 */
	@Override
	public void setOsiApplicationId(long osiApplicationId) {
		model.setOsiApplicationId(osiApplicationId);
	}

	/**
	 * Sets the primary key of this detail of applicant.
	 *
	 * @param primaryKey the primary key of this detail of applicant
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this detail of applicant.
	 *
	 * @param userId the user ID of this detail of applicant
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this detail of applicant.
	 *
	 * @param userName the user name of this detail of applicant
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this detail of applicant.
	 *
	 * @param userUuid the user uuid of this detail of applicant
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this detail of applicant.
	 *
	 * @param uuid the uuid of this detail of applicant
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
	protected DetailOfApplicantWrapper wrap(
		DetailOfApplicant detailOfApplicant) {

		return new DetailOfApplicantWrapper(detailOfApplicant);
	}

}