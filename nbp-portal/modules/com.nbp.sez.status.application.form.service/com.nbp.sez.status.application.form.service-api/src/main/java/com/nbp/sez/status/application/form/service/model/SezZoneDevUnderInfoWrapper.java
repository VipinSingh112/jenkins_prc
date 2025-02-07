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
 * This class is a wrapper for {@link SezZoneDevUnderInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneDevUnderInfo
 * @generated
 */
public class SezZoneDevUnderInfoWrapper
	extends BaseModelWrapper<SezZoneDevUnderInfo>
	implements ModelWrapper<SezZoneDevUnderInfo>, SezZoneDevUnderInfo {

	public SezZoneDevUnderInfoWrapper(SezZoneDevUnderInfo sezZoneDevUnderInfo) {
		super(sezZoneDevUnderInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezZoneDevUnderInfoId", getSezZoneDevUnderInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("developerName", getDeveloperName());
		attributes.put("approvalLetterNum", getApprovalLetterNum());
		attributes.put("approvalLetterDate", getApprovalLetterDate());
		attributes.put("developerAgreeNum", getDeveloperAgreeNum());
		attributes.put("developerAgreeDate", getDeveloperAgreeDate());
		attributes.put("developerControlNum", getDeveloperControlNum());
		attributes.put("declarantTitle", getDeclarantTitle());
		attributes.put("declarantName", getDeclarantName());
		attributes.put("declarantTelephoneNum", getDeclarantTelephoneNum());
		attributes.put("declarantEmail", getDeclarantEmail());
		attributes.put("signatureDate", getSignatureDate());
		attributes.put("publicNotaryName", getPublicNotaryName());
		attributes.put(
			"publicNotarySignatureDate", getPublicNotarySignatureDate());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneDevUnderInfoId = (Long)attributes.get(
			"sezZoneDevUnderInfoId");

		if (sezZoneDevUnderInfoId != null) {
			setSezZoneDevUnderInfoId(sezZoneDevUnderInfoId);
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

		String approvalLetterNum = (String)attributes.get("approvalLetterNum");

		if (approvalLetterNum != null) {
			setApprovalLetterNum(approvalLetterNum);
		}

		Date approvalLetterDate = (Date)attributes.get("approvalLetterDate");

		if (approvalLetterDate != null) {
			setApprovalLetterDate(approvalLetterDate);
		}

		String developerAgreeNum = (String)attributes.get("developerAgreeNum");

		if (developerAgreeNum != null) {
			setDeveloperAgreeNum(developerAgreeNum);
		}

		Date developerAgreeDate = (Date)attributes.get("developerAgreeDate");

		if (developerAgreeDate != null) {
			setDeveloperAgreeDate(developerAgreeDate);
		}

		String developerControlNum = (String)attributes.get(
			"developerControlNum");

		if (developerControlNum != null) {
			setDeveloperControlNum(developerControlNum);
		}

		String declarantTitle = (String)attributes.get("declarantTitle");

		if (declarantTitle != null) {
			setDeclarantTitle(declarantTitle);
		}

		String declarantName = (String)attributes.get("declarantName");

		if (declarantName != null) {
			setDeclarantName(declarantName);
		}

		String declarantTelephoneNum = (String)attributes.get(
			"declarantTelephoneNum");

		if (declarantTelephoneNum != null) {
			setDeclarantTelephoneNum(declarantTelephoneNum);
		}

		String declarantEmail = (String)attributes.get("declarantEmail");

		if (declarantEmail != null) {
			setDeclarantEmail(declarantEmail);
		}

		Date signatureDate = (Date)attributes.get("signatureDate");

		if (signatureDate != null) {
			setSignatureDate(signatureDate);
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
	public SezZoneDevUnderInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the approval letter date of this sez zone dev under info.
	 *
	 * @return the approval letter date of this sez zone dev under info
	 */
	@Override
	public Date getApprovalLetterDate() {
		return model.getApprovalLetterDate();
	}

	/**
	 * Returns the approval letter num of this sez zone dev under info.
	 *
	 * @return the approval letter num of this sez zone dev under info
	 */
	@Override
	public String getApprovalLetterNum() {
		return model.getApprovalLetterNum();
	}

	/**
	 * Returns the company ID of this sez zone dev under info.
	 *
	 * @return the company ID of this sez zone dev under info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez zone dev under info.
	 *
	 * @return the create date of this sez zone dev under info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the declarant email of this sez zone dev under info.
	 *
	 * @return the declarant email of this sez zone dev under info
	 */
	@Override
	public String getDeclarantEmail() {
		return model.getDeclarantEmail();
	}

	/**
	 * Returns the declarant name of this sez zone dev under info.
	 *
	 * @return the declarant name of this sez zone dev under info
	 */
	@Override
	public String getDeclarantName() {
		return model.getDeclarantName();
	}

	/**
	 * Returns the declarant telephone num of this sez zone dev under info.
	 *
	 * @return the declarant telephone num of this sez zone dev under info
	 */
	@Override
	public String getDeclarantTelephoneNum() {
		return model.getDeclarantTelephoneNum();
	}

	/**
	 * Returns the declarant title of this sez zone dev under info.
	 *
	 * @return the declarant title of this sez zone dev under info
	 */
	@Override
	public String getDeclarantTitle() {
		return model.getDeclarantTitle();
	}

	/**
	 * Returns the developer agree date of this sez zone dev under info.
	 *
	 * @return the developer agree date of this sez zone dev under info
	 */
	@Override
	public Date getDeveloperAgreeDate() {
		return model.getDeveloperAgreeDate();
	}

	/**
	 * Returns the developer agree num of this sez zone dev under info.
	 *
	 * @return the developer agree num of this sez zone dev under info
	 */
	@Override
	public String getDeveloperAgreeNum() {
		return model.getDeveloperAgreeNum();
	}

	/**
	 * Returns the developer control num of this sez zone dev under info.
	 *
	 * @return the developer control num of this sez zone dev under info
	 */
	@Override
	public String getDeveloperControlNum() {
		return model.getDeveloperControlNum();
	}

	/**
	 * Returns the developer name of this sez zone dev under info.
	 *
	 * @return the developer name of this sez zone dev under info
	 */
	@Override
	public String getDeveloperName() {
		return model.getDeveloperName();
	}

	/**
	 * Returns the group ID of this sez zone dev under info.
	 *
	 * @return the group ID of this sez zone dev under info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez zone dev under info.
	 *
	 * @return the modified date of this sez zone dev under info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez zone dev under info.
	 *
	 * @return the primary key of this sez zone dev under info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the public notary name of this sez zone dev under info.
	 *
	 * @return the public notary name of this sez zone dev under info
	 */
	@Override
	public String getPublicNotaryName() {
		return model.getPublicNotaryName();
	}

	/**
	 * Returns the public notary signature date of this sez zone dev under info.
	 *
	 * @return the public notary signature date of this sez zone dev under info
	 */
	@Override
	public Date getPublicNotarySignatureDate() {
		return model.getPublicNotarySignatureDate();
	}

	/**
	 * Returns the sez status application ID of this sez zone dev under info.
	 *
	 * @return the sez status application ID of this sez zone dev under info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone dev under info ID of this sez zone dev under info.
	 *
	 * @return the sez zone dev under info ID of this sez zone dev under info
	 */
	@Override
	public long getSezZoneDevUnderInfoId() {
		return model.getSezZoneDevUnderInfoId();
	}

	/**
	 * Returns the signature date of this sez zone dev under info.
	 *
	 * @return the signature date of this sez zone dev under info
	 */
	@Override
	public Date getSignatureDate() {
		return model.getSignatureDate();
	}

	/**
	 * Returns the user ID of this sez zone dev under info.
	 *
	 * @return the user ID of this sez zone dev under info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone dev under info.
	 *
	 * @return the user name of this sez zone dev under info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone dev under info.
	 *
	 * @return the user uuid of this sez zone dev under info
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
	 * Sets the approval letter date of this sez zone dev under info.
	 *
	 * @param approvalLetterDate the approval letter date of this sez zone dev under info
	 */
	@Override
	public void setApprovalLetterDate(Date approvalLetterDate) {
		model.setApprovalLetterDate(approvalLetterDate);
	}

	/**
	 * Sets the approval letter num of this sez zone dev under info.
	 *
	 * @param approvalLetterNum the approval letter num of this sez zone dev under info
	 */
	@Override
	public void setApprovalLetterNum(String approvalLetterNum) {
		model.setApprovalLetterNum(approvalLetterNum);
	}

	/**
	 * Sets the company ID of this sez zone dev under info.
	 *
	 * @param companyId the company ID of this sez zone dev under info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez zone dev under info.
	 *
	 * @param createDate the create date of this sez zone dev under info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the declarant email of this sez zone dev under info.
	 *
	 * @param declarantEmail the declarant email of this sez zone dev under info
	 */
	@Override
	public void setDeclarantEmail(String declarantEmail) {
		model.setDeclarantEmail(declarantEmail);
	}

	/**
	 * Sets the declarant name of this sez zone dev under info.
	 *
	 * @param declarantName the declarant name of this sez zone dev under info
	 */
	@Override
	public void setDeclarantName(String declarantName) {
		model.setDeclarantName(declarantName);
	}

	/**
	 * Sets the declarant telephone num of this sez zone dev under info.
	 *
	 * @param declarantTelephoneNum the declarant telephone num of this sez zone dev under info
	 */
	@Override
	public void setDeclarantTelephoneNum(String declarantTelephoneNum) {
		model.setDeclarantTelephoneNum(declarantTelephoneNum);
	}

	/**
	 * Sets the declarant title of this sez zone dev under info.
	 *
	 * @param declarantTitle the declarant title of this sez zone dev under info
	 */
	@Override
	public void setDeclarantTitle(String declarantTitle) {
		model.setDeclarantTitle(declarantTitle);
	}

	/**
	 * Sets the developer agree date of this sez zone dev under info.
	 *
	 * @param developerAgreeDate the developer agree date of this sez zone dev under info
	 */
	@Override
	public void setDeveloperAgreeDate(Date developerAgreeDate) {
		model.setDeveloperAgreeDate(developerAgreeDate);
	}

	/**
	 * Sets the developer agree num of this sez zone dev under info.
	 *
	 * @param developerAgreeNum the developer agree num of this sez zone dev under info
	 */
	@Override
	public void setDeveloperAgreeNum(String developerAgreeNum) {
		model.setDeveloperAgreeNum(developerAgreeNum);
	}

	/**
	 * Sets the developer control num of this sez zone dev under info.
	 *
	 * @param developerControlNum the developer control num of this sez zone dev under info
	 */
	@Override
	public void setDeveloperControlNum(String developerControlNum) {
		model.setDeveloperControlNum(developerControlNum);
	}

	/**
	 * Sets the developer name of this sez zone dev under info.
	 *
	 * @param developerName the developer name of this sez zone dev under info
	 */
	@Override
	public void setDeveloperName(String developerName) {
		model.setDeveloperName(developerName);
	}

	/**
	 * Sets the group ID of this sez zone dev under info.
	 *
	 * @param groupId the group ID of this sez zone dev under info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez zone dev under info.
	 *
	 * @param modifiedDate the modified date of this sez zone dev under info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez zone dev under info.
	 *
	 * @param primaryKey the primary key of this sez zone dev under info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the public notary name of this sez zone dev under info.
	 *
	 * @param publicNotaryName the public notary name of this sez zone dev under info
	 */
	@Override
	public void setPublicNotaryName(String publicNotaryName) {
		model.setPublicNotaryName(publicNotaryName);
	}

	/**
	 * Sets the public notary signature date of this sez zone dev under info.
	 *
	 * @param publicNotarySignatureDate the public notary signature date of this sez zone dev under info
	 */
	@Override
	public void setPublicNotarySignatureDate(Date publicNotarySignatureDate) {
		model.setPublicNotarySignatureDate(publicNotarySignatureDate);
	}

	/**
	 * Sets the sez status application ID of this sez zone dev under info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone dev under info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone dev under info ID of this sez zone dev under info.
	 *
	 * @param sezZoneDevUnderInfoId the sez zone dev under info ID of this sez zone dev under info
	 */
	@Override
	public void setSezZoneDevUnderInfoId(long sezZoneDevUnderInfoId) {
		model.setSezZoneDevUnderInfoId(sezZoneDevUnderInfoId);
	}

	/**
	 * Sets the signature date of this sez zone dev under info.
	 *
	 * @param signatureDate the signature date of this sez zone dev under info
	 */
	@Override
	public void setSignatureDate(Date signatureDate) {
		model.setSignatureDate(signatureDate);
	}

	/**
	 * Sets the user ID of this sez zone dev under info.
	 *
	 * @param userId the user ID of this sez zone dev under info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone dev under info.
	 *
	 * @param userName the user name of this sez zone dev under info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone dev under info.
	 *
	 * @param userUuid the user uuid of this sez zone dev under info
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
	protected SezZoneDevUnderInfoWrapper wrap(
		SezZoneDevUnderInfo sezZoneDevUnderInfo) {

		return new SezZoneDevUnderInfoWrapper(sezZoneDevUnderInfo);
	}

}