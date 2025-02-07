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
 * This class is a wrapper for {@link sezDeveloperUndertaking}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezDeveloperUndertaking
 * @generated
 */
public class sezDeveloperUndertakingWrapper
	extends BaseModelWrapper<sezDeveloperUndertaking>
	implements ModelWrapper<sezDeveloperUndertaking>, sezDeveloperUndertaking {

	public sezDeveloperUndertakingWrapper(
		sezDeveloperUndertaking sezDeveloperUndertaking) {

		super(sezDeveloperUndertaking);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDeveloperUndertakingId", getSezDeveloperUndertakingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("titleOfApplicant", getTitleOfApplicant());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("telephoneNum", getTelephoneNum());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("applicantSignatureDate", getApplicantSignatureDate());
		attributes.put("nameOfNotaryPublic", getNameOfNotaryPublic());
		attributes.put(
			"publicNotarySignatureDate", getPublicNotarySignatureDate());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDeveloperUndertakingId = (Long)attributes.get(
			"sezDeveloperUndertakingId");

		if (sezDeveloperUndertakingId != null) {
			setSezDeveloperUndertakingId(sezDeveloperUndertakingId);
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

		String titleOfApplicant = (String)attributes.get("titleOfApplicant");

		if (titleOfApplicant != null) {
			setTitleOfApplicant(titleOfApplicant);
		}

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String telephoneNum = (String)attributes.get("telephoneNum");

		if (telephoneNum != null) {
			setTelephoneNum(telephoneNum);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Date applicantSignatureDate = (Date)attributes.get(
			"applicantSignatureDate");

		if (applicantSignatureDate != null) {
			setApplicantSignatureDate(applicantSignatureDate);
		}

		String nameOfNotaryPublic = (String)attributes.get(
			"nameOfNotaryPublic");

		if (nameOfNotaryPublic != null) {
			setNameOfNotaryPublic(nameOfNotaryPublic);
		}

		Date publicNotarySignatureDate = (Date)attributes.get(
			"publicNotarySignatureDate");

		if (publicNotarySignatureDate != null) {
			setPublicNotarySignatureDate(publicNotarySignatureDate);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public sezDeveloperUndertaking cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant signature date of this sez developer undertaking.
	 *
	 * @return the applicant signature date of this sez developer undertaking
	 */
	@Override
	public Date getApplicantSignatureDate() {
		return model.getApplicantSignatureDate();
	}

	/**
	 * Returns the company ID of this sez developer undertaking.
	 *
	 * @return the company ID of this sez developer undertaking
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez developer undertaking.
	 *
	 * @return the create date of this sez developer undertaking
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this sez developer undertaking.
	 *
	 * @return the email address of this sez developer undertaking
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the group ID of this sez developer undertaking.
	 *
	 * @return the group ID of this sez developer undertaking
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez developer undertaking.
	 *
	 * @return the modified date of this sez developer undertaking
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this sez developer undertaking.
	 *
	 * @return the name of applicant of this sez developer undertaking
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the name of notary public of this sez developer undertaking.
	 *
	 * @return the name of notary public of this sez developer undertaking
	 */
	@Override
	public String getNameOfNotaryPublic() {
		return model.getNameOfNotaryPublic();
	}

	/**
	 * Returns the primary key of this sez developer undertaking.
	 *
	 * @return the primary key of this sez developer undertaking
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the public notary signature date of this sez developer undertaking.
	 *
	 * @return the public notary signature date of this sez developer undertaking
	 */
	@Override
	public Date getPublicNotarySignatureDate() {
		return model.getPublicNotarySignatureDate();
	}

	/**
	 * Returns the sez developer undertaking ID of this sez developer undertaking.
	 *
	 * @return the sez developer undertaking ID of this sez developer undertaking
	 */
	@Override
	public long getSezDeveloperUndertakingId() {
		return model.getSezDeveloperUndertakingId();
	}

	/**
	 * Returns the sez status application ID of this sez developer undertaking.
	 *
	 * @return the sez status application ID of this sez developer undertaking
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the telephone num of this sez developer undertaking.
	 *
	 * @return the telephone num of this sez developer undertaking
	 */
	@Override
	public String getTelephoneNum() {
		return model.getTelephoneNum();
	}

	/**
	 * Returns the title of applicant of this sez developer undertaking.
	 *
	 * @return the title of applicant of this sez developer undertaking
	 */
	@Override
	public String getTitleOfApplicant() {
		return model.getTitleOfApplicant();
	}

	/**
	 * Returns the user ID of this sez developer undertaking.
	 *
	 * @return the user ID of this sez developer undertaking
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez developer undertaking.
	 *
	 * @return the user name of this sez developer undertaking
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez developer undertaking.
	 *
	 * @return the user uuid of this sez developer undertaking
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
	 * Sets the applicant signature date of this sez developer undertaking.
	 *
	 * @param applicantSignatureDate the applicant signature date of this sez developer undertaking
	 */
	@Override
	public void setApplicantSignatureDate(Date applicantSignatureDate) {
		model.setApplicantSignatureDate(applicantSignatureDate);
	}

	/**
	 * Sets the company ID of this sez developer undertaking.
	 *
	 * @param companyId the company ID of this sez developer undertaking
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez developer undertaking.
	 *
	 * @param createDate the create date of this sez developer undertaking
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this sez developer undertaking.
	 *
	 * @param emailAddress the email address of this sez developer undertaking
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the group ID of this sez developer undertaking.
	 *
	 * @param groupId the group ID of this sez developer undertaking
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez developer undertaking.
	 *
	 * @param modifiedDate the modified date of this sez developer undertaking
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this sez developer undertaking.
	 *
	 * @param nameOfApplicant the name of applicant of this sez developer undertaking
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the name of notary public of this sez developer undertaking.
	 *
	 * @param nameOfNotaryPublic the name of notary public of this sez developer undertaking
	 */
	@Override
	public void setNameOfNotaryPublic(String nameOfNotaryPublic) {
		model.setNameOfNotaryPublic(nameOfNotaryPublic);
	}

	/**
	 * Sets the primary key of this sez developer undertaking.
	 *
	 * @param primaryKey the primary key of this sez developer undertaking
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the public notary signature date of this sez developer undertaking.
	 *
	 * @param publicNotarySignatureDate the public notary signature date of this sez developer undertaking
	 */
	@Override
	public void setPublicNotarySignatureDate(Date publicNotarySignatureDate) {
		model.setPublicNotarySignatureDate(publicNotarySignatureDate);
	}

	/**
	 * Sets the sez developer undertaking ID of this sez developer undertaking.
	 *
	 * @param sezDeveloperUndertakingId the sez developer undertaking ID of this sez developer undertaking
	 */
	@Override
	public void setSezDeveloperUndertakingId(long sezDeveloperUndertakingId) {
		model.setSezDeveloperUndertakingId(sezDeveloperUndertakingId);
	}

	/**
	 * Sets the sez status application ID of this sez developer undertaking.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez developer undertaking
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the telephone num of this sez developer undertaking.
	 *
	 * @param telephoneNum the telephone num of this sez developer undertaking
	 */
	@Override
	public void setTelephoneNum(String telephoneNum) {
		model.setTelephoneNum(telephoneNum);
	}

	/**
	 * Sets the title of applicant of this sez developer undertaking.
	 *
	 * @param titleOfApplicant the title of applicant of this sez developer undertaking
	 */
	@Override
	public void setTitleOfApplicant(String titleOfApplicant) {
		model.setTitleOfApplicant(titleOfApplicant);
	}

	/**
	 * Sets the user ID of this sez developer undertaking.
	 *
	 * @param userId the user ID of this sez developer undertaking
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez developer undertaking.
	 *
	 * @param userName the user name of this sez developer undertaking
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez developer undertaking.
	 *
	 * @param userUuid the user uuid of this sez developer undertaking
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
	protected sezDeveloperUndertakingWrapper wrap(
		sezDeveloperUndertaking sezDeveloperUndertaking) {

		return new sezDeveloperUndertakingWrapper(sezDeveloperUndertaking);
	}

}