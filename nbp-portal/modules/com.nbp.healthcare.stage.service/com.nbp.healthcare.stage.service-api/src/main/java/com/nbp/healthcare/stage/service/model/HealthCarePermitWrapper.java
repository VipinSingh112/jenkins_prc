/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HealthCarePermit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCarePermit
 * @generated
 */
public class HealthCarePermitWrapper
	extends BaseModelWrapper<HealthCarePermit>
	implements HealthCarePermit, ModelWrapper<HealthCarePermit> {

	public HealthCarePermitWrapper(HealthCarePermit healthCarePermit) {
		super(healthCarePermit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("healthPermitId", getHealthPermitId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("permitTransaction", getPermitTransaction());
		attributes.put("nameofApplicant", getNameofApplicant());
		attributes.put("category", getCategory());
		attributes.put("pirPermt", getPirPermt());
		attributes.put("bonafideHC", getBonafideHC());
		attributes.put("tariffCode", getTariffCode());
		attributes.put("dateofIssue", getDateofIssue());
		attributes.put("pirPermitFileEntryId", getPirPermitFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthPermitId = (Long)attributes.get("healthPermitId");

		if (healthPermitId != null) {
			setHealthPermitId(healthPermitId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String permitTransaction = (String)attributes.get("permitTransaction");

		if (permitTransaction != null) {
			setPermitTransaction(permitTransaction);
		}

		String nameofApplicant = (String)attributes.get("nameofApplicant");

		if (nameofApplicant != null) {
			setNameofApplicant(nameofApplicant);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String pirPermt = (String)attributes.get("pirPermt");

		if (pirPermt != null) {
			setPirPermt(pirPermt);
		}

		String bonafideHC = (String)attributes.get("bonafideHC");

		if (bonafideHC != null) {
			setBonafideHC(bonafideHC);
		}

		String tariffCode = (String)attributes.get("tariffCode");

		if (tariffCode != null) {
			setTariffCode(tariffCode);
		}

		Date dateofIssue = (Date)attributes.get("dateofIssue");

		if (dateofIssue != null) {
			setDateofIssue(dateofIssue);
		}

		Long pirPermitFileEntryId = (Long)attributes.get(
			"pirPermitFileEntryId");

		if (pirPermitFileEntryId != null) {
			setPirPermitFileEntryId(pirPermitFileEntryId);
		}
	}

	@Override
	public HealthCarePermit cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bonafide hc of this health care permit.
	 *
	 * @return the bonafide hc of this health care permit
	 */
	@Override
	public String getBonafideHC() {
		return model.getBonafideHC();
	}

	/**
	 * Returns the case ID of this health care permit.
	 *
	 * @return the case ID of this health care permit
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the category of this health care permit.
	 *
	 * @return the category of this health care permit
	 */
	@Override
	public String getCategory() {
		return model.getCategory();
	}

	/**
	 * Returns the company ID of this health care permit.
	 *
	 * @return the company ID of this health care permit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this health care permit.
	 *
	 * @return the create date of this health care permit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dateof issue of this health care permit.
	 *
	 * @return the dateof issue of this health care permit
	 */
	@Override
	public Date getDateofIssue() {
		return model.getDateofIssue();
	}

	/**
	 * Returns the group ID of this health care permit.
	 *
	 * @return the group ID of this health care permit
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health permit ID of this health care permit.
	 *
	 * @return the health permit ID of this health care permit
	 */
	@Override
	public long getHealthPermitId() {
		return model.getHealthPermitId();
	}

	/**
	 * Returns the modified date of this health care permit.
	 *
	 * @return the modified date of this health care permit
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nameof applicant of this health care permit.
	 *
	 * @return the nameof applicant of this health care permit
	 */
	@Override
	public String getNameofApplicant() {
		return model.getNameofApplicant();
	}

	/**
	 * Returns the permit transaction of this health care permit.
	 *
	 * @return the permit transaction of this health care permit
	 */
	@Override
	public String getPermitTransaction() {
		return model.getPermitTransaction();
	}

	/**
	 * Returns the pir permit file entry ID of this health care permit.
	 *
	 * @return the pir permit file entry ID of this health care permit
	 */
	@Override
	public long getPirPermitFileEntryId() {
		return model.getPirPermitFileEntryId();
	}

	/**
	 * Returns the pir permt of this health care permit.
	 *
	 * @return the pir permt of this health care permit
	 */
	@Override
	public String getPirPermt() {
		return model.getPirPermt();
	}

	/**
	 * Returns the primary key of this health care permit.
	 *
	 * @return the primary key of this health care permit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tariff code of this health care permit.
	 *
	 * @return the tariff code of this health care permit
	 */
	@Override
	public String getTariffCode() {
		return model.getTariffCode();
	}

	/**
	 * Returns the user ID of this health care permit.
	 *
	 * @return the user ID of this health care permit
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care permit.
	 *
	 * @return the user name of this health care permit
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care permit.
	 *
	 * @return the user uuid of this health care permit
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
	 * Sets the bonafide hc of this health care permit.
	 *
	 * @param bonafideHC the bonafide hc of this health care permit
	 */
	@Override
	public void setBonafideHC(String bonafideHC) {
		model.setBonafideHC(bonafideHC);
	}

	/**
	 * Sets the case ID of this health care permit.
	 *
	 * @param caseId the case ID of this health care permit
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the category of this health care permit.
	 *
	 * @param category the category of this health care permit
	 */
	@Override
	public void setCategory(String category) {
		model.setCategory(category);
	}

	/**
	 * Sets the company ID of this health care permit.
	 *
	 * @param companyId the company ID of this health care permit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this health care permit.
	 *
	 * @param createDate the create date of this health care permit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the dateof issue of this health care permit.
	 *
	 * @param dateofIssue the dateof issue of this health care permit
	 */
	@Override
	public void setDateofIssue(Date dateofIssue) {
		model.setDateofIssue(dateofIssue);
	}

	/**
	 * Sets the group ID of this health care permit.
	 *
	 * @param groupId the group ID of this health care permit
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health permit ID of this health care permit.
	 *
	 * @param healthPermitId the health permit ID of this health care permit
	 */
	@Override
	public void setHealthPermitId(long healthPermitId) {
		model.setHealthPermitId(healthPermitId);
	}

	/**
	 * Sets the modified date of this health care permit.
	 *
	 * @param modifiedDate the modified date of this health care permit
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nameof applicant of this health care permit.
	 *
	 * @param nameofApplicant the nameof applicant of this health care permit
	 */
	@Override
	public void setNameofApplicant(String nameofApplicant) {
		model.setNameofApplicant(nameofApplicant);
	}

	/**
	 * Sets the permit transaction of this health care permit.
	 *
	 * @param permitTransaction the permit transaction of this health care permit
	 */
	@Override
	public void setPermitTransaction(String permitTransaction) {
		model.setPermitTransaction(permitTransaction);
	}

	/**
	 * Sets the pir permit file entry ID of this health care permit.
	 *
	 * @param pirPermitFileEntryId the pir permit file entry ID of this health care permit
	 */
	@Override
	public void setPirPermitFileEntryId(long pirPermitFileEntryId) {
		model.setPirPermitFileEntryId(pirPermitFileEntryId);
	}

	/**
	 * Sets the pir permt of this health care permit.
	 *
	 * @param pirPermt the pir permt of this health care permit
	 */
	@Override
	public void setPirPermt(String pirPermt) {
		model.setPirPermt(pirPermt);
	}

	/**
	 * Sets the primary key of this health care permit.
	 *
	 * @param primaryKey the primary key of this health care permit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tariff code of this health care permit.
	 *
	 * @param tariffCode the tariff code of this health care permit
	 */
	@Override
	public void setTariffCode(String tariffCode) {
		model.setTariffCode(tariffCode);
	}

	/**
	 * Sets the user ID of this health care permit.
	 *
	 * @param userId the user ID of this health care permit
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care permit.
	 *
	 * @param userName the user name of this health care permit
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care permit.
	 *
	 * @param userUuid the user uuid of this health care permit
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
	protected HealthCarePermitWrapper wrap(HealthCarePermit healthCarePermit) {
		return new HealthCarePermitWrapper(healthCarePermit);
	}

}