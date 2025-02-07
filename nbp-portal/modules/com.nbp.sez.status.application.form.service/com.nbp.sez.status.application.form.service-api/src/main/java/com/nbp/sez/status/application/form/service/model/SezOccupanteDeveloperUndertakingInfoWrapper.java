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
 * This class is a wrapper for {@link SezOccupanteDeveloperUndertakingInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteDeveloperUndertakingInfo
 * @generated
 */
public class SezOccupanteDeveloperUndertakingInfoWrapper
	extends BaseModelWrapper<SezOccupanteDeveloperUndertakingInfo>
	implements ModelWrapper<SezOccupanteDeveloperUndertakingInfo>,
			   SezOccupanteDeveloperUndertakingInfo {

	public SezOccupanteDeveloperUndertakingInfoWrapper(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		super(sezOccupanteDeveloperUndertakingInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccDevUnderId", getSezOccDevUnderId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occUndertakingDevName", getOccUndertakingDevName());
		attributes.put(
			"occUndertakingApprLetter", getOccUndertakingApprLetter());
		attributes.put("occUndertakingDate", getOccUndertakingDate());
		attributes.put("occUndertakingAgreeNum", getOccUndertakingAgreeNum());
		attributes.put("occUndertakingAgreeDate", getOccUndertakingAgreeDate());
		attributes.put(
			"occUndertakingControlNum", getOccUndertakingControlNum());
		attributes.put("occDevApplicantTitle", getOccDevApplicantTitle());
		attributes.put("occDevApplicantName", getOccDevApplicantName());
		attributes.put("occDevApplicantTele", getOccDevApplicantTele());
		attributes.put("occDevApplicantEmail", getOccDevApplicantEmail());
		attributes.put("occDevApplicantSignDate", getOccDevApplicantSignDate());
		attributes.put("occDevPublicNotaryName", getOccDevPublicNotaryName());
		attributes.put(
			"occDevPublicNotarySignDate", getOccDevPublicNotarySignDate());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccDevUnderId = (Long)attributes.get("sezOccDevUnderId");

		if (sezOccDevUnderId != null) {
			setSezOccDevUnderId(sezOccDevUnderId);
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

		String occUndertakingDevName = (String)attributes.get(
			"occUndertakingDevName");

		if (occUndertakingDevName != null) {
			setOccUndertakingDevName(occUndertakingDevName);
		}

		String occUndertakingApprLetter = (String)attributes.get(
			"occUndertakingApprLetter");

		if (occUndertakingApprLetter != null) {
			setOccUndertakingApprLetter(occUndertakingApprLetter);
		}

		Date occUndertakingDate = (Date)attributes.get("occUndertakingDate");

		if (occUndertakingDate != null) {
			setOccUndertakingDate(occUndertakingDate);
		}

		String occUndertakingAgreeNum = (String)attributes.get(
			"occUndertakingAgreeNum");

		if (occUndertakingAgreeNum != null) {
			setOccUndertakingAgreeNum(occUndertakingAgreeNum);
		}

		Date occUndertakingAgreeDate = (Date)attributes.get(
			"occUndertakingAgreeDate");

		if (occUndertakingAgreeDate != null) {
			setOccUndertakingAgreeDate(occUndertakingAgreeDate);
		}

		String occUndertakingControlNum = (String)attributes.get(
			"occUndertakingControlNum");

		if (occUndertakingControlNum != null) {
			setOccUndertakingControlNum(occUndertakingControlNum);
		}

		String occDevApplicantTitle = (String)attributes.get(
			"occDevApplicantTitle");

		if (occDevApplicantTitle != null) {
			setOccDevApplicantTitle(occDevApplicantTitle);
		}

		String occDevApplicantName = (String)attributes.get(
			"occDevApplicantName");

		if (occDevApplicantName != null) {
			setOccDevApplicantName(occDevApplicantName);
		}

		String occDevApplicantTele = (String)attributes.get(
			"occDevApplicantTele");

		if (occDevApplicantTele != null) {
			setOccDevApplicantTele(occDevApplicantTele);
		}

		String occDevApplicantEmail = (String)attributes.get(
			"occDevApplicantEmail");

		if (occDevApplicantEmail != null) {
			setOccDevApplicantEmail(occDevApplicantEmail);
		}

		Date occDevApplicantSignDate = (Date)attributes.get(
			"occDevApplicantSignDate");

		if (occDevApplicantSignDate != null) {
			setOccDevApplicantSignDate(occDevApplicantSignDate);
		}

		String occDevPublicNotaryName = (String)attributes.get(
			"occDevPublicNotaryName");

		if (occDevPublicNotaryName != null) {
			setOccDevPublicNotaryName(occDevPublicNotaryName);
		}

		Date occDevPublicNotarySignDate = (Date)attributes.get(
			"occDevPublicNotarySignDate");

		if (occDevPublicNotarySignDate != null) {
			setOccDevPublicNotarySignDate(occDevPublicNotarySignDate);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupanteDeveloperUndertakingInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupante developer undertaking info.
	 *
	 * @return the company ID of this sez occupante developer undertaking info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupante developer undertaking info.
	 *
	 * @return the create date of this sez occupante developer undertaking info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupante developer undertaking info.
	 *
	 * @return the group ID of this sez occupante developer undertaking info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupante developer undertaking info.
	 *
	 * @return the modified date of this sez occupante developer undertaking info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ dev applicant email of this sez occupante developer undertaking info.
	 *
	 * @return the occ dev applicant email of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccDevApplicantEmail() {
		return model.getOccDevApplicantEmail();
	}

	/**
	 * Returns the occ dev applicant name of this sez occupante developer undertaking info.
	 *
	 * @return the occ dev applicant name of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccDevApplicantName() {
		return model.getOccDevApplicantName();
	}

	/**
	 * Returns the occ dev applicant sign date of this sez occupante developer undertaking info.
	 *
	 * @return the occ dev applicant sign date of this sez occupante developer undertaking info
	 */
	@Override
	public Date getOccDevApplicantSignDate() {
		return model.getOccDevApplicantSignDate();
	}

	/**
	 * Returns the occ dev applicant tele of this sez occupante developer undertaking info.
	 *
	 * @return the occ dev applicant tele of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccDevApplicantTele() {
		return model.getOccDevApplicantTele();
	}

	/**
	 * Returns the occ dev applicant title of this sez occupante developer undertaking info.
	 *
	 * @return the occ dev applicant title of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccDevApplicantTitle() {
		return model.getOccDevApplicantTitle();
	}

	/**
	 * Returns the occ dev public notary name of this sez occupante developer undertaking info.
	 *
	 * @return the occ dev public notary name of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccDevPublicNotaryName() {
		return model.getOccDevPublicNotaryName();
	}

	/**
	 * Returns the occ dev public notary sign date of this sez occupante developer undertaking info.
	 *
	 * @return the occ dev public notary sign date of this sez occupante developer undertaking info
	 */
	@Override
	public Date getOccDevPublicNotarySignDate() {
		return model.getOccDevPublicNotarySignDate();
	}

	/**
	 * Returns the occ undertaking agree date of this sez occupante developer undertaking info.
	 *
	 * @return the occ undertaking agree date of this sez occupante developer undertaking info
	 */
	@Override
	public Date getOccUndertakingAgreeDate() {
		return model.getOccUndertakingAgreeDate();
	}

	/**
	 * Returns the occ undertaking agree num of this sez occupante developer undertaking info.
	 *
	 * @return the occ undertaking agree num of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccUndertakingAgreeNum() {
		return model.getOccUndertakingAgreeNum();
	}

	/**
	 * Returns the occ undertaking appr letter of this sez occupante developer undertaking info.
	 *
	 * @return the occ undertaking appr letter of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccUndertakingApprLetter() {
		return model.getOccUndertakingApprLetter();
	}

	/**
	 * Returns the occ undertaking control num of this sez occupante developer undertaking info.
	 *
	 * @return the occ undertaking control num of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccUndertakingControlNum() {
		return model.getOccUndertakingControlNum();
	}

	/**
	 * Returns the occ undertaking date of this sez occupante developer undertaking info.
	 *
	 * @return the occ undertaking date of this sez occupante developer undertaking info
	 */
	@Override
	public Date getOccUndertakingDate() {
		return model.getOccUndertakingDate();
	}

	/**
	 * Returns the occ undertaking dev name of this sez occupante developer undertaking info.
	 *
	 * @return the occ undertaking dev name of this sez occupante developer undertaking info
	 */
	@Override
	public String getOccUndertakingDevName() {
		return model.getOccUndertakingDevName();
	}

	/**
	 * Returns the primary key of this sez occupante developer undertaking info.
	 *
	 * @return the primary key of this sez occupante developer undertaking info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ dev under ID of this sez occupante developer undertaking info.
	 *
	 * @return the sez occ dev under ID of this sez occupante developer undertaking info
	 */
	@Override
	public long getSezOccDevUnderId() {
		return model.getSezOccDevUnderId();
	}

	/**
	 * Returns the sez status application ID of this sez occupante developer undertaking info.
	 *
	 * @return the sez status application ID of this sez occupante developer undertaking info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupante developer undertaking info.
	 *
	 * @return the user ID of this sez occupante developer undertaking info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupante developer undertaking info.
	 *
	 * @return the user name of this sez occupante developer undertaking info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupante developer undertaking info.
	 *
	 * @return the user uuid of this sez occupante developer undertaking info
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
	 * Sets the company ID of this sez occupante developer undertaking info.
	 *
	 * @param companyId the company ID of this sez occupante developer undertaking info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupante developer undertaking info.
	 *
	 * @param createDate the create date of this sez occupante developer undertaking info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupante developer undertaking info.
	 *
	 * @param groupId the group ID of this sez occupante developer undertaking info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupante developer undertaking info.
	 *
	 * @param modifiedDate the modified date of this sez occupante developer undertaking info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ dev applicant email of this sez occupante developer undertaking info.
	 *
	 * @param occDevApplicantEmail the occ dev applicant email of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccDevApplicantEmail(String occDevApplicantEmail) {
		model.setOccDevApplicantEmail(occDevApplicantEmail);
	}

	/**
	 * Sets the occ dev applicant name of this sez occupante developer undertaking info.
	 *
	 * @param occDevApplicantName the occ dev applicant name of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccDevApplicantName(String occDevApplicantName) {
		model.setOccDevApplicantName(occDevApplicantName);
	}

	/**
	 * Sets the occ dev applicant sign date of this sez occupante developer undertaking info.
	 *
	 * @param occDevApplicantSignDate the occ dev applicant sign date of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccDevApplicantSignDate(Date occDevApplicantSignDate) {
		model.setOccDevApplicantSignDate(occDevApplicantSignDate);
	}

	/**
	 * Sets the occ dev applicant tele of this sez occupante developer undertaking info.
	 *
	 * @param occDevApplicantTele the occ dev applicant tele of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccDevApplicantTele(String occDevApplicantTele) {
		model.setOccDevApplicantTele(occDevApplicantTele);
	}

	/**
	 * Sets the occ dev applicant title of this sez occupante developer undertaking info.
	 *
	 * @param occDevApplicantTitle the occ dev applicant title of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccDevApplicantTitle(String occDevApplicantTitle) {
		model.setOccDevApplicantTitle(occDevApplicantTitle);
	}

	/**
	 * Sets the occ dev public notary name of this sez occupante developer undertaking info.
	 *
	 * @param occDevPublicNotaryName the occ dev public notary name of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccDevPublicNotaryName(String occDevPublicNotaryName) {
		model.setOccDevPublicNotaryName(occDevPublicNotaryName);
	}

	/**
	 * Sets the occ dev public notary sign date of this sez occupante developer undertaking info.
	 *
	 * @param occDevPublicNotarySignDate the occ dev public notary sign date of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccDevPublicNotarySignDate(Date occDevPublicNotarySignDate) {
		model.setOccDevPublicNotarySignDate(occDevPublicNotarySignDate);
	}

	/**
	 * Sets the occ undertaking agree date of this sez occupante developer undertaking info.
	 *
	 * @param occUndertakingAgreeDate the occ undertaking agree date of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccUndertakingAgreeDate(Date occUndertakingAgreeDate) {
		model.setOccUndertakingAgreeDate(occUndertakingAgreeDate);
	}

	/**
	 * Sets the occ undertaking agree num of this sez occupante developer undertaking info.
	 *
	 * @param occUndertakingAgreeNum the occ undertaking agree num of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccUndertakingAgreeNum(String occUndertakingAgreeNum) {
		model.setOccUndertakingAgreeNum(occUndertakingAgreeNum);
	}

	/**
	 * Sets the occ undertaking appr letter of this sez occupante developer undertaking info.
	 *
	 * @param occUndertakingApprLetter the occ undertaking appr letter of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccUndertakingApprLetter(String occUndertakingApprLetter) {
		model.setOccUndertakingApprLetter(occUndertakingApprLetter);
	}

	/**
	 * Sets the occ undertaking control num of this sez occupante developer undertaking info.
	 *
	 * @param occUndertakingControlNum the occ undertaking control num of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccUndertakingControlNum(String occUndertakingControlNum) {
		model.setOccUndertakingControlNum(occUndertakingControlNum);
	}

	/**
	 * Sets the occ undertaking date of this sez occupante developer undertaking info.
	 *
	 * @param occUndertakingDate the occ undertaking date of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccUndertakingDate(Date occUndertakingDate) {
		model.setOccUndertakingDate(occUndertakingDate);
	}

	/**
	 * Sets the occ undertaking dev name of this sez occupante developer undertaking info.
	 *
	 * @param occUndertakingDevName the occ undertaking dev name of this sez occupante developer undertaking info
	 */
	@Override
	public void setOccUndertakingDevName(String occUndertakingDevName) {
		model.setOccUndertakingDevName(occUndertakingDevName);
	}

	/**
	 * Sets the primary key of this sez occupante developer undertaking info.
	 *
	 * @param primaryKey the primary key of this sez occupante developer undertaking info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ dev under ID of this sez occupante developer undertaking info.
	 *
	 * @param sezOccDevUnderId the sez occ dev under ID of this sez occupante developer undertaking info
	 */
	@Override
	public void setSezOccDevUnderId(long sezOccDevUnderId) {
		model.setSezOccDevUnderId(sezOccDevUnderId);
	}

	/**
	 * Sets the sez status application ID of this sez occupante developer undertaking info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupante developer undertaking info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupante developer undertaking info.
	 *
	 * @param userId the user ID of this sez occupante developer undertaking info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupante developer undertaking info.
	 *
	 * @param userName the user name of this sez occupante developer undertaking info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupante developer undertaking info.
	 *
	 * @param userUuid the user uuid of this sez occupante developer undertaking info
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
	protected SezOccupanteDeveloperUndertakingInfoWrapper wrap(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		return new SezOccupanteDeveloperUndertakingInfoWrapper(
			sezOccupanteDeveloperUndertakingInfo);
	}

}