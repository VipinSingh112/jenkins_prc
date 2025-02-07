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
 * This class is a wrapper for {@link SezZoneGeneralBusinessInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBusinessInfo
 * @generated
 */
public class SezZoneGeneralBusinessInfoWrapper
	extends BaseModelWrapper<SezZoneGeneralBusinessInfo>
	implements ModelWrapper<SezZoneGeneralBusinessInfo>,
			   SezZoneGeneralBusinessInfo {

	public SezZoneGeneralBusinessInfoWrapper(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		super(sezZoneGeneralBusinessInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezZoneGeneralBusinessInfoId", getSezZoneGeneralBusinessInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationDate", getApplicationDate());
		attributes.put("developerName", getDeveloperName());
		attributes.put("LocationName", getLocationName());
		attributes.put("controlNum", getControlNum());
		attributes.put("existingCompany", getExistingCompany());
		attributes.put("articleForm", getArticleForm());
		attributes.put("otherArticleForm", getOtherArticleForm());
		attributes.put("nonResidentCom", getNonResidentCom());
		attributes.put("taxRegisNum", getTaxRegisNum());
		attributes.put("genConsumptionNum", getGenConsumptionNum());
		attributes.put(
			"taxComplianceCertificateNum", getTaxComplianceCertificateNum());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneGeneralBusinessInfoId = (Long)attributes.get(
			"sezZoneGeneralBusinessInfoId");

		if (sezZoneGeneralBusinessInfoId != null) {
			setSezZoneGeneralBusinessInfoId(sezZoneGeneralBusinessInfoId);
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

		Date applicationDate = (Date)attributes.get("applicationDate");

		if (applicationDate != null) {
			setApplicationDate(applicationDate);
		}

		String developerName = (String)attributes.get("developerName");

		if (developerName != null) {
			setDeveloperName(developerName);
		}

		String LocationName = (String)attributes.get("LocationName");

		if (LocationName != null) {
			setLocationName(LocationName);
		}

		String controlNum = (String)attributes.get("controlNum");

		if (controlNum != null) {
			setControlNum(controlNum);
		}

		String existingCompany = (String)attributes.get("existingCompany");

		if (existingCompany != null) {
			setExistingCompany(existingCompany);
		}

		String articleForm = (String)attributes.get("articleForm");

		if (articleForm != null) {
			setArticleForm(articleForm);
		}

		String otherArticleForm = (String)attributes.get("otherArticleForm");

		if (otherArticleForm != null) {
			setOtherArticleForm(otherArticleForm);
		}

		String nonResidentCom = (String)attributes.get("nonResidentCom");

		if (nonResidentCom != null) {
			setNonResidentCom(nonResidentCom);
		}

		String taxRegisNum = (String)attributes.get("taxRegisNum");

		if (taxRegisNum != null) {
			setTaxRegisNum(taxRegisNum);
		}

		String genConsumptionNum = (String)attributes.get("genConsumptionNum");

		if (genConsumptionNum != null) {
			setGenConsumptionNum(genConsumptionNum);
		}

		String taxComplianceCertificateNum = (String)attributes.get(
			"taxComplianceCertificateNum");

		if (taxComplianceCertificateNum != null) {
			setTaxComplianceCertificateNum(taxComplianceCertificateNum);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezZoneGeneralBusinessInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the application date of this sez zone general business info.
	 *
	 * @return the application date of this sez zone general business info
	 */
	@Override
	public Date getApplicationDate() {
		return model.getApplicationDate();
	}

	/**
	 * Returns the article form of this sez zone general business info.
	 *
	 * @return the article form of this sez zone general business info
	 */
	@Override
	public String getArticleForm() {
		return model.getArticleForm();
	}

	/**
	 * Returns the company ID of this sez zone general business info.
	 *
	 * @return the company ID of this sez zone general business info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the control num of this sez zone general business info.
	 *
	 * @return the control num of this sez zone general business info
	 */
	@Override
	public String getControlNum() {
		return model.getControlNum();
	}

	/**
	 * Returns the create date of this sez zone general business info.
	 *
	 * @return the create date of this sez zone general business info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the developer name of this sez zone general business info.
	 *
	 * @return the developer name of this sez zone general business info
	 */
	@Override
	public String getDeveloperName() {
		return model.getDeveloperName();
	}

	/**
	 * Returns the existing company of this sez zone general business info.
	 *
	 * @return the existing company of this sez zone general business info
	 */
	@Override
	public String getExistingCompany() {
		return model.getExistingCompany();
	}

	/**
	 * Returns the gen consumption num of this sez zone general business info.
	 *
	 * @return the gen consumption num of this sez zone general business info
	 */
	@Override
	public String getGenConsumptionNum() {
		return model.getGenConsumptionNum();
	}

	/**
	 * Returns the group ID of this sez zone general business info.
	 *
	 * @return the group ID of this sez zone general business info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location name of this sez zone general business info.
	 *
	 * @return the location name of this sez zone general business info
	 */
	@Override
	public String getLocationName() {
		return model.getLocationName();
	}

	/**
	 * Returns the modified date of this sez zone general business info.
	 *
	 * @return the modified date of this sez zone general business info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the non resident com of this sez zone general business info.
	 *
	 * @return the non resident com of this sez zone general business info
	 */
	@Override
	public String getNonResidentCom() {
		return model.getNonResidentCom();
	}

	/**
	 * Returns the other article form of this sez zone general business info.
	 *
	 * @return the other article form of this sez zone general business info
	 */
	@Override
	public String getOtherArticleForm() {
		return model.getOtherArticleForm();
	}

	/**
	 * Returns the primary key of this sez zone general business info.
	 *
	 * @return the primary key of this sez zone general business info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez zone general business info.
	 *
	 * @return the sez status application ID of this sez zone general business info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone general business info ID of this sez zone general business info.
	 *
	 * @return the sez zone general business info ID of this sez zone general business info
	 */
	@Override
	public long getSezZoneGeneralBusinessInfoId() {
		return model.getSezZoneGeneralBusinessInfoId();
	}

	/**
	 * Returns the tax compliance certificate num of this sez zone general business info.
	 *
	 * @return the tax compliance certificate num of this sez zone general business info
	 */
	@Override
	public String getTaxComplianceCertificateNum() {
		return model.getTaxComplianceCertificateNum();
	}

	/**
	 * Returns the tax regis num of this sez zone general business info.
	 *
	 * @return the tax regis num of this sez zone general business info
	 */
	@Override
	public String getTaxRegisNum() {
		return model.getTaxRegisNum();
	}

	/**
	 * Returns the user ID of this sez zone general business info.
	 *
	 * @return the user ID of this sez zone general business info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone general business info.
	 *
	 * @return the user name of this sez zone general business info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone general business info.
	 *
	 * @return the user uuid of this sez zone general business info
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
	 * Sets the application date of this sez zone general business info.
	 *
	 * @param applicationDate the application date of this sez zone general business info
	 */
	@Override
	public void setApplicationDate(Date applicationDate) {
		model.setApplicationDate(applicationDate);
	}

	/**
	 * Sets the article form of this sez zone general business info.
	 *
	 * @param articleForm the article form of this sez zone general business info
	 */
	@Override
	public void setArticleForm(String articleForm) {
		model.setArticleForm(articleForm);
	}

	/**
	 * Sets the company ID of this sez zone general business info.
	 *
	 * @param companyId the company ID of this sez zone general business info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the control num of this sez zone general business info.
	 *
	 * @param controlNum the control num of this sez zone general business info
	 */
	@Override
	public void setControlNum(String controlNum) {
		model.setControlNum(controlNum);
	}

	/**
	 * Sets the create date of this sez zone general business info.
	 *
	 * @param createDate the create date of this sez zone general business info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the developer name of this sez zone general business info.
	 *
	 * @param developerName the developer name of this sez zone general business info
	 */
	@Override
	public void setDeveloperName(String developerName) {
		model.setDeveloperName(developerName);
	}

	/**
	 * Sets the existing company of this sez zone general business info.
	 *
	 * @param existingCompany the existing company of this sez zone general business info
	 */
	@Override
	public void setExistingCompany(String existingCompany) {
		model.setExistingCompany(existingCompany);
	}

	/**
	 * Sets the gen consumption num of this sez zone general business info.
	 *
	 * @param genConsumptionNum the gen consumption num of this sez zone general business info
	 */
	@Override
	public void setGenConsumptionNum(String genConsumptionNum) {
		model.setGenConsumptionNum(genConsumptionNum);
	}

	/**
	 * Sets the group ID of this sez zone general business info.
	 *
	 * @param groupId the group ID of this sez zone general business info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location name of this sez zone general business info.
	 *
	 * @param LocationName the location name of this sez zone general business info
	 */
	@Override
	public void setLocationName(String LocationName) {
		model.setLocationName(LocationName);
	}

	/**
	 * Sets the modified date of this sez zone general business info.
	 *
	 * @param modifiedDate the modified date of this sez zone general business info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the non resident com of this sez zone general business info.
	 *
	 * @param nonResidentCom the non resident com of this sez zone general business info
	 */
	@Override
	public void setNonResidentCom(String nonResidentCom) {
		model.setNonResidentCom(nonResidentCom);
	}

	/**
	 * Sets the other article form of this sez zone general business info.
	 *
	 * @param otherArticleForm the other article form of this sez zone general business info
	 */
	@Override
	public void setOtherArticleForm(String otherArticleForm) {
		model.setOtherArticleForm(otherArticleForm);
	}

	/**
	 * Sets the primary key of this sez zone general business info.
	 *
	 * @param primaryKey the primary key of this sez zone general business info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez zone general business info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone general business info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone general business info ID of this sez zone general business info.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID of this sez zone general business info
	 */
	@Override
	public void setSezZoneGeneralBusinessInfoId(
		long sezZoneGeneralBusinessInfoId) {

		model.setSezZoneGeneralBusinessInfoId(sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Sets the tax compliance certificate num of this sez zone general business info.
	 *
	 * @param taxComplianceCertificateNum the tax compliance certificate num of this sez zone general business info
	 */
	@Override
	public void setTaxComplianceCertificateNum(
		String taxComplianceCertificateNum) {

		model.setTaxComplianceCertificateNum(taxComplianceCertificateNum);
	}

	/**
	 * Sets the tax regis num of this sez zone general business info.
	 *
	 * @param taxRegisNum the tax regis num of this sez zone general business info
	 */
	@Override
	public void setTaxRegisNum(String taxRegisNum) {
		model.setTaxRegisNum(taxRegisNum);
	}

	/**
	 * Sets the user ID of this sez zone general business info.
	 *
	 * @param userId the user ID of this sez zone general business info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone general business info.
	 *
	 * @param userName the user name of this sez zone general business info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone general business info.
	 *
	 * @param userUuid the user uuid of this sez zone general business info
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
	protected SezZoneGeneralBusinessInfoWrapper wrap(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		return new SezZoneGeneralBusinessInfoWrapper(
			sezZoneGeneralBusinessInfo);
	}

}