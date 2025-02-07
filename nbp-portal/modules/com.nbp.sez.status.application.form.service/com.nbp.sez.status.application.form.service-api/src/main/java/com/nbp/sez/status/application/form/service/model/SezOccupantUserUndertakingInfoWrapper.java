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
 * This class is a wrapper for {@link SezOccupantUserUndertakingInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantUserUndertakingInfo
 * @generated
 */
public class SezOccupantUserUndertakingInfoWrapper
	extends BaseModelWrapper<SezOccupantUserUndertakingInfo>
	implements ModelWrapper<SezOccupantUserUndertakingInfo>,
			   SezOccupantUserUndertakingInfo {

	public SezOccupantUserUndertakingInfoWrapper(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		super(sezOccupantUserUndertakingInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccUserunderId", getSezOccUserunderId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occApplicantTitle", getOccApplicantTitle());
		attributes.put("occApplicantName", getOccApplicantName());
		attributes.put("occApplicantTeleNum", getOccApplicantTeleNum());
		attributes.put("occApplicantEmail", getOccApplicantEmail());
		attributes.put("occApplicantSignDate", getOccApplicantSignDate());
		attributes.put("occPublicNotaryName", getOccPublicNotaryName());
		attributes.put("occPublicNotarySignDate", getOccPublicNotarySignDate());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccUserunderId = (Long)attributes.get("sezOccUserunderId");

		if (sezOccUserunderId != null) {
			setSezOccUserunderId(sezOccUserunderId);
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

		String occApplicantTitle = (String)attributes.get("occApplicantTitle");

		if (occApplicantTitle != null) {
			setOccApplicantTitle(occApplicantTitle);
		}

		String occApplicantName = (String)attributes.get("occApplicantName");

		if (occApplicantName != null) {
			setOccApplicantName(occApplicantName);
		}

		String occApplicantTeleNum = (String)attributes.get(
			"occApplicantTeleNum");

		if (occApplicantTeleNum != null) {
			setOccApplicantTeleNum(occApplicantTeleNum);
		}

		String occApplicantEmail = (String)attributes.get("occApplicantEmail");

		if (occApplicantEmail != null) {
			setOccApplicantEmail(occApplicantEmail);
		}

		Date occApplicantSignDate = (Date)attributes.get(
			"occApplicantSignDate");

		if (occApplicantSignDate != null) {
			setOccApplicantSignDate(occApplicantSignDate);
		}

		String occPublicNotaryName = (String)attributes.get(
			"occPublicNotaryName");

		if (occPublicNotaryName != null) {
			setOccPublicNotaryName(occPublicNotaryName);
		}

		Date occPublicNotarySignDate = (Date)attributes.get(
			"occPublicNotarySignDate");

		if (occPublicNotarySignDate != null) {
			setOccPublicNotarySignDate(occPublicNotarySignDate);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantUserUndertakingInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant user undertaking info.
	 *
	 * @return the company ID of this sez occupant user undertaking info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant user undertaking info.
	 *
	 * @return the create date of this sez occupant user undertaking info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant user undertaking info.
	 *
	 * @return the group ID of this sez occupant user undertaking info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant user undertaking info.
	 *
	 * @return the modified date of this sez occupant user undertaking info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ applicant email of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant email of this sez occupant user undertaking info
	 */
	@Override
	public String getOccApplicantEmail() {
		return model.getOccApplicantEmail();
	}

	/**
	 * Returns the occ applicant name of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant name of this sez occupant user undertaking info
	 */
	@Override
	public String getOccApplicantName() {
		return model.getOccApplicantName();
	}

	/**
	 * Returns the occ applicant sign date of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant sign date of this sez occupant user undertaking info
	 */
	@Override
	public Date getOccApplicantSignDate() {
		return model.getOccApplicantSignDate();
	}

	/**
	 * Returns the occ applicant tele num of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant tele num of this sez occupant user undertaking info
	 */
	@Override
	public String getOccApplicantTeleNum() {
		return model.getOccApplicantTeleNum();
	}

	/**
	 * Returns the occ applicant title of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant title of this sez occupant user undertaking info
	 */
	@Override
	public String getOccApplicantTitle() {
		return model.getOccApplicantTitle();
	}

	/**
	 * Returns the occ public notary name of this sez occupant user undertaking info.
	 *
	 * @return the occ public notary name of this sez occupant user undertaking info
	 */
	@Override
	public String getOccPublicNotaryName() {
		return model.getOccPublicNotaryName();
	}

	/**
	 * Returns the occ public notary sign date of this sez occupant user undertaking info.
	 *
	 * @return the occ public notary sign date of this sez occupant user undertaking info
	 */
	@Override
	public Date getOccPublicNotarySignDate() {
		return model.getOccPublicNotarySignDate();
	}

	/**
	 * Returns the primary key of this sez occupant user undertaking info.
	 *
	 * @return the primary key of this sez occupant user undertaking info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ userunder ID of this sez occupant user undertaking info.
	 *
	 * @return the sez occ userunder ID of this sez occupant user undertaking info
	 */
	@Override
	public long getSezOccUserunderId() {
		return model.getSezOccUserunderId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant user undertaking info.
	 *
	 * @return the sez status application ID of this sez occupant user undertaking info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant user undertaking info.
	 *
	 * @return the user ID of this sez occupant user undertaking info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant user undertaking info.
	 *
	 * @return the user name of this sez occupant user undertaking info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant user undertaking info.
	 *
	 * @return the user uuid of this sez occupant user undertaking info
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
	 * Sets the company ID of this sez occupant user undertaking info.
	 *
	 * @param companyId the company ID of this sez occupant user undertaking info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant user undertaking info.
	 *
	 * @param createDate the create date of this sez occupant user undertaking info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant user undertaking info.
	 *
	 * @param groupId the group ID of this sez occupant user undertaking info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant user undertaking info.
	 *
	 * @param modifiedDate the modified date of this sez occupant user undertaking info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ applicant email of this sez occupant user undertaking info.
	 *
	 * @param occApplicantEmail the occ applicant email of this sez occupant user undertaking info
	 */
	@Override
	public void setOccApplicantEmail(String occApplicantEmail) {
		model.setOccApplicantEmail(occApplicantEmail);
	}

	/**
	 * Sets the occ applicant name of this sez occupant user undertaking info.
	 *
	 * @param occApplicantName the occ applicant name of this sez occupant user undertaking info
	 */
	@Override
	public void setOccApplicantName(String occApplicantName) {
		model.setOccApplicantName(occApplicantName);
	}

	/**
	 * Sets the occ applicant sign date of this sez occupant user undertaking info.
	 *
	 * @param occApplicantSignDate the occ applicant sign date of this sez occupant user undertaking info
	 */
	@Override
	public void setOccApplicantSignDate(Date occApplicantSignDate) {
		model.setOccApplicantSignDate(occApplicantSignDate);
	}

	/**
	 * Sets the occ applicant tele num of this sez occupant user undertaking info.
	 *
	 * @param occApplicantTeleNum the occ applicant tele num of this sez occupant user undertaking info
	 */
	@Override
	public void setOccApplicantTeleNum(String occApplicantTeleNum) {
		model.setOccApplicantTeleNum(occApplicantTeleNum);
	}

	/**
	 * Sets the occ applicant title of this sez occupant user undertaking info.
	 *
	 * @param occApplicantTitle the occ applicant title of this sez occupant user undertaking info
	 */
	@Override
	public void setOccApplicantTitle(String occApplicantTitle) {
		model.setOccApplicantTitle(occApplicantTitle);
	}

	/**
	 * Sets the occ public notary name of this sez occupant user undertaking info.
	 *
	 * @param occPublicNotaryName the occ public notary name of this sez occupant user undertaking info
	 */
	@Override
	public void setOccPublicNotaryName(String occPublicNotaryName) {
		model.setOccPublicNotaryName(occPublicNotaryName);
	}

	/**
	 * Sets the occ public notary sign date of this sez occupant user undertaking info.
	 *
	 * @param occPublicNotarySignDate the occ public notary sign date of this sez occupant user undertaking info
	 */
	@Override
	public void setOccPublicNotarySignDate(Date occPublicNotarySignDate) {
		model.setOccPublicNotarySignDate(occPublicNotarySignDate);
	}

	/**
	 * Sets the primary key of this sez occupant user undertaking info.
	 *
	 * @param primaryKey the primary key of this sez occupant user undertaking info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ userunder ID of this sez occupant user undertaking info.
	 *
	 * @param sezOccUserunderId the sez occ userunder ID of this sez occupant user undertaking info
	 */
	@Override
	public void setSezOccUserunderId(long sezOccUserunderId) {
		model.setSezOccUserunderId(sezOccUserunderId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant user undertaking info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant user undertaking info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant user undertaking info.
	 *
	 * @param userId the user ID of this sez occupant user undertaking info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant user undertaking info.
	 *
	 * @param userName the user name of this sez occupant user undertaking info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant user undertaking info.
	 *
	 * @param userUuid the user uuid of this sez occupant user undertaking info
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
	protected SezOccupantUserUndertakingInfoWrapper wrap(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		return new SezOccupantUserUndertakingInfoWrapper(
			sezOccupantUserUndertakingInfo);
	}

}