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
 * This class is a wrapper for {@link SezZoneUserUnderInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfo
 * @generated
 */
public class SezZoneUserUnderInfoWrapper
	extends BaseModelWrapper<SezZoneUserUnderInfo>
	implements ModelWrapper<SezZoneUserUnderInfo>, SezZoneUserUnderInfo {

	public SezZoneUserUnderInfoWrapper(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		super(sezZoneUserUnderInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezZoneUserUnderInfoId", getSezZoneUserUnderInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("declarantTitle", getDeclarantTitle());
		attributes.put("declarantName", getDeclarantName());
		attributes.put("declarantTeleNum", getDeclarantTeleNum());
		attributes.put("declarantEmail", getDeclarantEmail());
		attributes.put("applicantSignatureDate", getApplicantSignatureDate());
		attributes.put("publicNotaryName", getPublicNotaryName());
		attributes.put(
			"publicNotarySignatureDate", getPublicNotarySignatureDate());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneUserUnderInfoId = (Long)attributes.get(
			"sezZoneUserUnderInfoId");

		if (sezZoneUserUnderInfoId != null) {
			setSezZoneUserUnderInfoId(sezZoneUserUnderInfoId);
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

		String declarantTitle = (String)attributes.get("declarantTitle");

		if (declarantTitle != null) {
			setDeclarantTitle(declarantTitle);
		}

		String declarantName = (String)attributes.get("declarantName");

		if (declarantName != null) {
			setDeclarantName(declarantName);
		}

		String declarantTeleNum = (String)attributes.get("declarantTeleNum");

		if (declarantTeleNum != null) {
			setDeclarantTeleNum(declarantTeleNum);
		}

		String declarantEmail = (String)attributes.get("declarantEmail");

		if (declarantEmail != null) {
			setDeclarantEmail(declarantEmail);
		}

		Date applicantSignatureDate = (Date)attributes.get(
			"applicantSignatureDate");

		if (applicantSignatureDate != null) {
			setApplicantSignatureDate(applicantSignatureDate);
		}

		String publicNotaryName = (String)attributes.get("publicNotaryName");

		if (publicNotaryName != null) {
			setPublicNotaryName(publicNotaryName);
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
	public SezZoneUserUnderInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant signature date of this sez zone user under info.
	 *
	 * @return the applicant signature date of this sez zone user under info
	 */
	@Override
	public Date getApplicantSignatureDate() {
		return model.getApplicantSignatureDate();
	}

	/**
	 * Returns the company ID of this sez zone user under info.
	 *
	 * @return the company ID of this sez zone user under info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez zone user under info.
	 *
	 * @return the create date of this sez zone user under info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the declarant email of this sez zone user under info.
	 *
	 * @return the declarant email of this sez zone user under info
	 */
	@Override
	public String getDeclarantEmail() {
		return model.getDeclarantEmail();
	}

	/**
	 * Returns the declarant name of this sez zone user under info.
	 *
	 * @return the declarant name of this sez zone user under info
	 */
	@Override
	public String getDeclarantName() {
		return model.getDeclarantName();
	}

	/**
	 * Returns the declarant tele num of this sez zone user under info.
	 *
	 * @return the declarant tele num of this sez zone user under info
	 */
	@Override
	public String getDeclarantTeleNum() {
		return model.getDeclarantTeleNum();
	}

	/**
	 * Returns the declarant title of this sez zone user under info.
	 *
	 * @return the declarant title of this sez zone user under info
	 */
	@Override
	public String getDeclarantTitle() {
		return model.getDeclarantTitle();
	}

	/**
	 * Returns the group ID of this sez zone user under info.
	 *
	 * @return the group ID of this sez zone user under info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez zone user under info.
	 *
	 * @return the modified date of this sez zone user under info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez zone user under info.
	 *
	 * @return the primary key of this sez zone user under info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the public notary name of this sez zone user under info.
	 *
	 * @return the public notary name of this sez zone user under info
	 */
	@Override
	public String getPublicNotaryName() {
		return model.getPublicNotaryName();
	}

	/**
	 * Returns the public notary signature date of this sez zone user under info.
	 *
	 * @return the public notary signature date of this sez zone user under info
	 */
	@Override
	public Date getPublicNotarySignatureDate() {
		return model.getPublicNotarySignatureDate();
	}

	/**
	 * Returns the sez status application ID of this sez zone user under info.
	 *
	 * @return the sez status application ID of this sez zone user under info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone user under info ID of this sez zone user under info.
	 *
	 * @return the sez zone user under info ID of this sez zone user under info
	 */
	@Override
	public long getSezZoneUserUnderInfoId() {
		return model.getSezZoneUserUnderInfoId();
	}

	/**
	 * Returns the user ID of this sez zone user under info.
	 *
	 * @return the user ID of this sez zone user under info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone user under info.
	 *
	 * @return the user name of this sez zone user under info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone user under info.
	 *
	 * @return the user uuid of this sez zone user under info
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
	 * Sets the applicant signature date of this sez zone user under info.
	 *
	 * @param applicantSignatureDate the applicant signature date of this sez zone user under info
	 */
	@Override
	public void setApplicantSignatureDate(Date applicantSignatureDate) {
		model.setApplicantSignatureDate(applicantSignatureDate);
	}

	/**
	 * Sets the company ID of this sez zone user under info.
	 *
	 * @param companyId the company ID of this sez zone user under info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez zone user under info.
	 *
	 * @param createDate the create date of this sez zone user under info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the declarant email of this sez zone user under info.
	 *
	 * @param declarantEmail the declarant email of this sez zone user under info
	 */
	@Override
	public void setDeclarantEmail(String declarantEmail) {
		model.setDeclarantEmail(declarantEmail);
	}

	/**
	 * Sets the declarant name of this sez zone user under info.
	 *
	 * @param declarantName the declarant name of this sez zone user under info
	 */
	@Override
	public void setDeclarantName(String declarantName) {
		model.setDeclarantName(declarantName);
	}

	/**
	 * Sets the declarant tele num of this sez zone user under info.
	 *
	 * @param declarantTeleNum the declarant tele num of this sez zone user under info
	 */
	@Override
	public void setDeclarantTeleNum(String declarantTeleNum) {
		model.setDeclarantTeleNum(declarantTeleNum);
	}

	/**
	 * Sets the declarant title of this sez zone user under info.
	 *
	 * @param declarantTitle the declarant title of this sez zone user under info
	 */
	@Override
	public void setDeclarantTitle(String declarantTitle) {
		model.setDeclarantTitle(declarantTitle);
	}

	/**
	 * Sets the group ID of this sez zone user under info.
	 *
	 * @param groupId the group ID of this sez zone user under info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez zone user under info.
	 *
	 * @param modifiedDate the modified date of this sez zone user under info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez zone user under info.
	 *
	 * @param primaryKey the primary key of this sez zone user under info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the public notary name of this sez zone user under info.
	 *
	 * @param publicNotaryName the public notary name of this sez zone user under info
	 */
	@Override
	public void setPublicNotaryName(String publicNotaryName) {
		model.setPublicNotaryName(publicNotaryName);
	}

	/**
	 * Sets the public notary signature date of this sez zone user under info.
	 *
	 * @param publicNotarySignatureDate the public notary signature date of this sez zone user under info
	 */
	@Override
	public void setPublicNotarySignatureDate(Date publicNotarySignatureDate) {
		model.setPublicNotarySignatureDate(publicNotarySignatureDate);
	}

	/**
	 * Sets the sez status application ID of this sez zone user under info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone user under info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone user under info ID of this sez zone user under info.
	 *
	 * @param sezZoneUserUnderInfoId the sez zone user under info ID of this sez zone user under info
	 */
	@Override
	public void setSezZoneUserUnderInfoId(long sezZoneUserUnderInfoId) {
		model.setSezZoneUserUnderInfoId(sezZoneUserUnderInfoId);
	}

	/**
	 * Sets the user ID of this sez zone user under info.
	 *
	 * @param userId the user ID of this sez zone user under info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone user under info.
	 *
	 * @param userName the user name of this sez zone user under info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone user under info.
	 *
	 * @param userUuid the user uuid of this sez zone user under info
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
	protected SezZoneUserUnderInfoWrapper wrap(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return new SezZoneUserUnderInfoWrapper(sezZoneUserUnderInfo);
	}

}