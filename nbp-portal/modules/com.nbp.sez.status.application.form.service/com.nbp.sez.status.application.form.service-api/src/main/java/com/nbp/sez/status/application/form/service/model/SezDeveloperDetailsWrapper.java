/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezDeveloperDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetails
 * @generated
 */
public class SezDeveloperDetailsWrapper
	extends BaseModelWrapper<SezDeveloperDetails>
	implements ModelWrapper<SezDeveloperDetails>, SezDeveloperDetails {

	public SezDeveloperDetailsWrapper(SezDeveloperDetails sezDeveloperDetails) {
		super(sezDeveloperDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezDeveloperDetailsId", getSezDeveloperDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("developerName", getDeveloperName());
		attributes.put("developerNumber", getDeveloperNumber());
		attributes.put("developerControl", getDeveloperControl());
		attributes.put("letterOfApprovalDate", getLetterOfApprovalDate());
		attributes.put("sezDeveloperDate", getSezDeveloperDate());
		attributes.put(
			"letterOfApprovalEntrtyId", getLetterOfApprovalEntrtyId());
		attributes.put(
			"sezDeveloperAgreementEntryId", getSezDeveloperAgreementEntryId());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDeveloperDetailsId = (Long)attributes.get(
			"sezDeveloperDetailsId");

		if (sezDeveloperDetailsId != null) {
			setSezDeveloperDetailsId(sezDeveloperDetailsId);
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

		String developerName = (String)attributes.get("developerName");

		if (developerName != null) {
			setDeveloperName(developerName);
		}

		String developerNumber = (String)attributes.get("developerNumber");

		if (developerNumber != null) {
			setDeveloperNumber(developerNumber);
		}

		String developerControl = (String)attributes.get("developerControl");

		if (developerControl != null) {
			setDeveloperControl(developerControl);
		}

		Date letterOfApprovalDate = (Date)attributes.get(
			"letterOfApprovalDate");

		if (letterOfApprovalDate != null) {
			setLetterOfApprovalDate(letterOfApprovalDate);
		}

		Date sezDeveloperDate = (Date)attributes.get("sezDeveloperDate");

		if (sezDeveloperDate != null) {
			setSezDeveloperDate(sezDeveloperDate);
		}

		Long letterOfApprovalEntrtyId = (Long)attributes.get(
			"letterOfApprovalEntrtyId");

		if (letterOfApprovalEntrtyId != null) {
			setLetterOfApprovalEntrtyId(letterOfApprovalEntrtyId);
		}

		Long sezDeveloperAgreementEntryId = (Long)attributes.get(
			"sezDeveloperAgreementEntryId");

		if (sezDeveloperAgreementEntryId != null) {
			setSezDeveloperAgreementEntryId(sezDeveloperAgreementEntryId);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDeveloperDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez developer details.
	 *
	 * @return the company ID of this sez developer details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez developer details.
	 *
	 * @return the create date of this sez developer details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the developer control of this sez developer details.
	 *
	 * @return the developer control of this sez developer details
	 */
	@Override
	public String getDeveloperControl() {
		return model.getDeveloperControl();
	}

	/**
	 * Returns the developer name of this sez developer details.
	 *
	 * @return the developer name of this sez developer details
	 */
	@Override
	public String getDeveloperName() {
		return model.getDeveloperName();
	}

	/**
	 * Returns the developer number of this sez developer details.
	 *
	 * @return the developer number of this sez developer details
	 */
	@Override
	public String getDeveloperNumber() {
		return model.getDeveloperNumber();
	}

	/**
	 * Returns the group ID of this sez developer details.
	 *
	 * @return the group ID of this sez developer details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the letter of approval date of this sez developer details.
	 *
	 * @return the letter of approval date of this sez developer details
	 */
	@Override
	public Date getLetterOfApprovalDate() {
		return model.getLetterOfApprovalDate();
	}

	/**
	 * Returns the letter of approval entrty ID of this sez developer details.
	 *
	 * @return the letter of approval entrty ID of this sez developer details
	 */
	@Override
	public long getLetterOfApprovalEntrtyId() {
		return model.getLetterOfApprovalEntrtyId();
	}

	/**
	 * Returns the modified date of this sez developer details.
	 *
	 * @return the modified date of this sez developer details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez developer details.
	 *
	 * @return the primary key of this sez developer details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez developer agreement entry ID of this sez developer details.
	 *
	 * @return the sez developer agreement entry ID of this sez developer details
	 */
	@Override
	public long getSezDeveloperAgreementEntryId() {
		return model.getSezDeveloperAgreementEntryId();
	}

	/**
	 * Returns the sez developer date of this sez developer details.
	 *
	 * @return the sez developer date of this sez developer details
	 */
	@Override
	public Date getSezDeveloperDate() {
		return model.getSezDeveloperDate();
	}

	/**
	 * Returns the sez developer details ID of this sez developer details.
	 *
	 * @return the sez developer details ID of this sez developer details
	 */
	@Override
	public long getSezDeveloperDetailsId() {
		return model.getSezDeveloperDetailsId();
	}

	/**
	 * Returns the sez status application ID of this sez developer details.
	 *
	 * @return the sez status application ID of this sez developer details
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez developer details.
	 *
	 * @return the user ID of this sez developer details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez developer details.
	 *
	 * @return the user name of this sez developer details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez developer details.
	 *
	 * @return the user uuid of this sez developer details
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
	 * Sets the company ID of this sez developer details.
	 *
	 * @param companyId the company ID of this sez developer details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez developer details.
	 *
	 * @param createDate the create date of this sez developer details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the developer control of this sez developer details.
	 *
	 * @param developerControl the developer control of this sez developer details
	 */
	@Override
	public void setDeveloperControl(String developerControl) {
		model.setDeveloperControl(developerControl);
	}

	/**
	 * Sets the developer name of this sez developer details.
	 *
	 * @param developerName the developer name of this sez developer details
	 */
	@Override
	public void setDeveloperName(String developerName) {
		model.setDeveloperName(developerName);
	}

	/**
	 * Sets the developer number of this sez developer details.
	 *
	 * @param developerNumber the developer number of this sez developer details
	 */
	@Override
	public void setDeveloperNumber(String developerNumber) {
		model.setDeveloperNumber(developerNumber);
	}

	/**
	 * Sets the group ID of this sez developer details.
	 *
	 * @param groupId the group ID of this sez developer details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the letter of approval date of this sez developer details.
	 *
	 * @param letterOfApprovalDate the letter of approval date of this sez developer details
	 */
	@Override
	public void setLetterOfApprovalDate(Date letterOfApprovalDate) {
		model.setLetterOfApprovalDate(letterOfApprovalDate);
	}

	/**
	 * Sets the letter of approval entrty ID of this sez developer details.
	 *
	 * @param letterOfApprovalEntrtyId the letter of approval entrty ID of this sez developer details
	 */
	@Override
	public void setLetterOfApprovalEntrtyId(long letterOfApprovalEntrtyId) {
		model.setLetterOfApprovalEntrtyId(letterOfApprovalEntrtyId);
	}

	/**
	 * Sets the modified date of this sez developer details.
	 *
	 * @param modifiedDate the modified date of this sez developer details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez developer details.
	 *
	 * @param primaryKey the primary key of this sez developer details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez developer agreement entry ID of this sez developer details.
	 *
	 * @param sezDeveloperAgreementEntryId the sez developer agreement entry ID of this sez developer details
	 */
	@Override
	public void setSezDeveloperAgreementEntryId(
		long sezDeveloperAgreementEntryId) {

		model.setSezDeveloperAgreementEntryId(sezDeveloperAgreementEntryId);
	}

	/**
	 * Sets the sez developer date of this sez developer details.
	 *
	 * @param sezDeveloperDate the sez developer date of this sez developer details
	 */
	@Override
	public void setSezDeveloperDate(Date sezDeveloperDate) {
		model.setSezDeveloperDate(sezDeveloperDate);
	}

	/**
	 * Sets the sez developer details ID of this sez developer details.
	 *
	 * @param sezDeveloperDetailsId the sez developer details ID of this sez developer details
	 */
	@Override
	public void setSezDeveloperDetailsId(long sezDeveloperDetailsId) {
		model.setSezDeveloperDetailsId(sezDeveloperDetailsId);
	}

	/**
	 * Sets the sez status application ID of this sez developer details.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez developer details
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez developer details.
	 *
	 * @param userId the user ID of this sez developer details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez developer details.
	 *
	 * @param userName the user name of this sez developer details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez developer details.
	 *
	 * @param userUuid the user uuid of this sez developer details
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
	protected SezDeveloperDetailsWrapper wrap(
		SezDeveloperDetails sezDeveloperDetails) {

		return new SezDeveloperDetailsWrapper(sezDeveloperDetails);
	}

}