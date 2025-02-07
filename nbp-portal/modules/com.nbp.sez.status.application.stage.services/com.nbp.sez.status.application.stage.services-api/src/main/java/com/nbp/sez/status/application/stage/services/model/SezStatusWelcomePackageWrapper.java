/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezStatusWelcomePackage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWelcomePackage
 * @generated
 */
public class SezStatusWelcomePackageWrapper
	extends BaseModelWrapper<SezStatusWelcomePackage>
	implements ModelWrapper<SezStatusWelcomePackage>, SezStatusWelcomePackage {

	public SezStatusWelcomePackageWrapper(
		SezStatusWelcomePackage sezStatusWelcomePackage) {

		super(sezStatusWelcomePackage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sezStatusWelcomeId", getSezStatusWelcomeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put(
			"dateWelcomePackageSigned", getDateWelcomePackageSigned());
		attributes.put(
			"welcomePackageSubmitToAppli", getWelcomePackageSubmitToAppli());
		attributes.put("docLicFileEntryId", getDocLicFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sezStatusWelcomeId = (Long)attributes.get("sezStatusWelcomeId");

		if (sezStatusWelcomeId != null) {
			setSezStatusWelcomeId(sezStatusWelcomeId);
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

		Date dateWelcomePackageSigned = (Date)attributes.get(
			"dateWelcomePackageSigned");

		if (dateWelcomePackageSigned != null) {
			setDateWelcomePackageSigned(dateWelcomePackageSigned);
		}

		Date welcomePackageSubmitToAppli = (Date)attributes.get(
			"welcomePackageSubmitToAppli");

		if (welcomePackageSubmitToAppli != null) {
			setWelcomePackageSubmitToAppli(welcomePackageSubmitToAppli);
		}

		Long docLicFileEntryId = (Long)attributes.get("docLicFileEntryId");

		if (docLicFileEntryId != null) {
			setDocLicFileEntryId(docLicFileEntryId);
		}
	}

	@Override
	public SezStatusWelcomePackage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this sez status welcome package.
	 *
	 * @return the case ID of this sez status welcome package
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this sez status welcome package.
	 *
	 * @return the company ID of this sez status welcome package
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez status welcome package.
	 *
	 * @return the create date of this sez status welcome package
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date welcome package signed of this sez status welcome package.
	 *
	 * @return the date welcome package signed of this sez status welcome package
	 */
	@Override
	public Date getDateWelcomePackageSigned() {
		return model.getDateWelcomePackageSigned();
	}

	/**
	 * Returns the doc lic file entry ID of this sez status welcome package.
	 *
	 * @return the doc lic file entry ID of this sez status welcome package
	 */
	@Override
	public long getDocLicFileEntryId() {
		return model.getDocLicFileEntryId();
	}

	/**
	 * Returns the group ID of this sez status welcome package.
	 *
	 * @return the group ID of this sez status welcome package
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez status welcome package.
	 *
	 * @return the modified date of this sez status welcome package
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez status welcome package.
	 *
	 * @return the primary key of this sez status welcome package
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status welcome ID of this sez status welcome package.
	 *
	 * @return the sez status welcome ID of this sez status welcome package
	 */
	@Override
	public long getSezStatusWelcomeId() {
		return model.getSezStatusWelcomeId();
	}

	/**
	 * Returns the user ID of this sez status welcome package.
	 *
	 * @return the user ID of this sez status welcome package
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez status welcome package.
	 *
	 * @return the user name of this sez status welcome package
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez status welcome package.
	 *
	 * @return the user uuid of this sez status welcome package
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this sez status welcome package.
	 *
	 * @return the uuid of this sez status welcome package
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the welcome package submit to appli of this sez status welcome package.
	 *
	 * @return the welcome package submit to appli of this sez status welcome package
	 */
	@Override
	public Date getWelcomePackageSubmitToAppli() {
		return model.getWelcomePackageSubmitToAppli();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this sez status welcome package.
	 *
	 * @param caseId the case ID of this sez status welcome package
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this sez status welcome package.
	 *
	 * @param companyId the company ID of this sez status welcome package
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez status welcome package.
	 *
	 * @param createDate the create date of this sez status welcome package
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date welcome package signed of this sez status welcome package.
	 *
	 * @param dateWelcomePackageSigned the date welcome package signed of this sez status welcome package
	 */
	@Override
	public void setDateWelcomePackageSigned(Date dateWelcomePackageSigned) {
		model.setDateWelcomePackageSigned(dateWelcomePackageSigned);
	}

	/**
	 * Sets the doc lic file entry ID of this sez status welcome package.
	 *
	 * @param docLicFileEntryId the doc lic file entry ID of this sez status welcome package
	 */
	@Override
	public void setDocLicFileEntryId(long docLicFileEntryId) {
		model.setDocLicFileEntryId(docLicFileEntryId);
	}

	/**
	 * Sets the group ID of this sez status welcome package.
	 *
	 * @param groupId the group ID of this sez status welcome package
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez status welcome package.
	 *
	 * @param modifiedDate the modified date of this sez status welcome package
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez status welcome package.
	 *
	 * @param primaryKey the primary key of this sez status welcome package
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status welcome ID of this sez status welcome package.
	 *
	 * @param sezStatusWelcomeId the sez status welcome ID of this sez status welcome package
	 */
	@Override
	public void setSezStatusWelcomeId(long sezStatusWelcomeId) {
		model.setSezStatusWelcomeId(sezStatusWelcomeId);
	}

	/**
	 * Sets the user ID of this sez status welcome package.
	 *
	 * @param userId the user ID of this sez status welcome package
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez status welcome package.
	 *
	 * @param userName the user name of this sez status welcome package
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez status welcome package.
	 *
	 * @param userUuid the user uuid of this sez status welcome package
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this sez status welcome package.
	 *
	 * @param uuid the uuid of this sez status welcome package
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the welcome package submit to appli of this sez status welcome package.
	 *
	 * @param welcomePackageSubmitToAppli the welcome package submit to appli of this sez status welcome package
	 */
	@Override
	public void setWelcomePackageSubmitToAppli(
		Date welcomePackageSubmitToAppli) {

		model.setWelcomePackageSubmitToAppli(welcomePackageSubmitToAppli);
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
	protected SezStatusWelcomePackageWrapper wrap(
		SezStatusWelcomePackage sezStatusWelcomePackage) {

		return new SezStatusWelcomePackageWrapper(sezStatusWelcomePackage);
	}

}