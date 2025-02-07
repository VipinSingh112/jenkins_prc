/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FactoriesCerticateOfRegis}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesCerticateOfRegis
 * @generated
 */
public class FactoriesCerticateOfRegisWrapper
	extends BaseModelWrapper<FactoriesCerticateOfRegis>
	implements FactoriesCerticateOfRegis,
			   ModelWrapper<FactoriesCerticateOfRegis> {

	public FactoriesCerticateOfRegisWrapper(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		super(factoriesCerticateOfRegis);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"factoriesCerticateOfRegisId", getFactoriesCerticateOfRegisId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("nameOfEstablishment", getNameOfEstablishment());
		attributes.put("parish", getParish());
		attributes.put("procuctCatAndName", getProcuctCatAndName());
		attributes.put("certificateIssueDate", getCertificateIssueDate());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("registration", getRegistration());
		attributes.put("status", getStatus());
		attributes.put("docFileEntry", getDocFileEntry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long factoriesCerticateOfRegisId = (Long)attributes.get(
			"factoriesCerticateOfRegisId");

		if (factoriesCerticateOfRegisId != null) {
			setFactoriesCerticateOfRegisId(factoriesCerticateOfRegisId);
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

		String nameOfEstablishment = (String)attributes.get(
			"nameOfEstablishment");

		if (nameOfEstablishment != null) {
			setNameOfEstablishment(nameOfEstablishment);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String procuctCatAndName = (String)attributes.get("procuctCatAndName");

		if (procuctCatAndName != null) {
			setProcuctCatAndName(procuctCatAndName);
		}

		Date certificateIssueDate = (Date)attributes.get(
			"certificateIssueDate");

		if (certificateIssueDate != null) {
			setCertificateIssueDate(certificateIssueDate);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		String registration = (String)attributes.get("registration");

		if (registration != null) {
			setRegistration(registration);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long docFileEntry = (Long)attributes.get("docFileEntry");

		if (docFileEntry != null) {
			setDocFileEntry(docFileEntry);
		}
	}

	@Override
	public FactoriesCerticateOfRegis cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this factories certicate of regis.
	 *
	 * @return the case ID of this factories certicate of regis
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the certificate issue date of this factories certicate of regis.
	 *
	 * @return the certificate issue date of this factories certicate of regis
	 */
	@Override
	public Date getCertificateIssueDate() {
		return model.getCertificateIssueDate();
	}

	/**
	 * Returns the company ID of this factories certicate of regis.
	 *
	 * @return the company ID of this factories certicate of regis
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this factories certicate of regis.
	 *
	 * @return the create date of this factories certicate of regis
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of expiration of this factories certicate of regis.
	 *
	 * @return the date of expiration of this factories certicate of regis
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the doc file entry of this factories certicate of regis.
	 *
	 * @return the doc file entry of this factories certicate of regis
	 */
	@Override
	public long getDocFileEntry() {
		return model.getDocFileEntry();
	}

	/**
	 * Returns the factories certicate of regis ID of this factories certicate of regis.
	 *
	 * @return the factories certicate of regis ID of this factories certicate of regis
	 */
	@Override
	public long getFactoriesCerticateOfRegisId() {
		return model.getFactoriesCerticateOfRegisId();
	}

	/**
	 * Returns the group ID of this factories certicate of regis.
	 *
	 * @return the group ID of this factories certicate of regis
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this factories certicate of regis.
	 *
	 * @return the modified date of this factories certicate of regis
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of establishment of this factories certicate of regis.
	 *
	 * @return the name of establishment of this factories certicate of regis
	 */
	@Override
	public String getNameOfEstablishment() {
		return model.getNameOfEstablishment();
	}

	/**
	 * Returns the parish of this factories certicate of regis.
	 *
	 * @return the parish of this factories certicate of regis
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this factories certicate of regis.
	 *
	 * @return the primary key of this factories certicate of regis
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the procuct cat and name of this factories certicate of regis.
	 *
	 * @return the procuct cat and name of this factories certicate of regis
	 */
	@Override
	public String getProcuctCatAndName() {
		return model.getProcuctCatAndName();
	}

	/**
	 * Returns the registration of this factories certicate of regis.
	 *
	 * @return the registration of this factories certicate of regis
	 */
	@Override
	public String getRegistration() {
		return model.getRegistration();
	}

	/**
	 * Returns the status of this factories certicate of regis.
	 *
	 * @return the status of this factories certicate of regis
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this factories certicate of regis.
	 *
	 * @return the user ID of this factories certicate of regis
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this factories certicate of regis.
	 *
	 * @return the user name of this factories certicate of regis
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this factories certicate of regis.
	 *
	 * @return the user uuid of this factories certicate of regis
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
	 * Sets the case ID of this factories certicate of regis.
	 *
	 * @param caseId the case ID of this factories certicate of regis
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the certificate issue date of this factories certicate of regis.
	 *
	 * @param certificateIssueDate the certificate issue date of this factories certicate of regis
	 */
	@Override
	public void setCertificateIssueDate(Date certificateIssueDate) {
		model.setCertificateIssueDate(certificateIssueDate);
	}

	/**
	 * Sets the company ID of this factories certicate of regis.
	 *
	 * @param companyId the company ID of this factories certicate of regis
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this factories certicate of regis.
	 *
	 * @param createDate the create date of this factories certicate of regis
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of expiration of this factories certicate of regis.
	 *
	 * @param dateOfExpiration the date of expiration of this factories certicate of regis
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the doc file entry of this factories certicate of regis.
	 *
	 * @param docFileEntry the doc file entry of this factories certicate of regis
	 */
	@Override
	public void setDocFileEntry(long docFileEntry) {
		model.setDocFileEntry(docFileEntry);
	}

	/**
	 * Sets the factories certicate of regis ID of this factories certicate of regis.
	 *
	 * @param factoriesCerticateOfRegisId the factories certicate of regis ID of this factories certicate of regis
	 */
	@Override
	public void setFactoriesCerticateOfRegisId(
		long factoriesCerticateOfRegisId) {

		model.setFactoriesCerticateOfRegisId(factoriesCerticateOfRegisId);
	}

	/**
	 * Sets the group ID of this factories certicate of regis.
	 *
	 * @param groupId the group ID of this factories certicate of regis
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this factories certicate of regis.
	 *
	 * @param modifiedDate the modified date of this factories certicate of regis
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of establishment of this factories certicate of regis.
	 *
	 * @param nameOfEstablishment the name of establishment of this factories certicate of regis
	 */
	@Override
	public void setNameOfEstablishment(String nameOfEstablishment) {
		model.setNameOfEstablishment(nameOfEstablishment);
	}

	/**
	 * Sets the parish of this factories certicate of regis.
	 *
	 * @param parish the parish of this factories certicate of regis
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this factories certicate of regis.
	 *
	 * @param primaryKey the primary key of this factories certicate of regis
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the procuct cat and name of this factories certicate of regis.
	 *
	 * @param procuctCatAndName the procuct cat and name of this factories certicate of regis
	 */
	@Override
	public void setProcuctCatAndName(String procuctCatAndName) {
		model.setProcuctCatAndName(procuctCatAndName);
	}

	/**
	 * Sets the registration of this factories certicate of regis.
	 *
	 * @param registration the registration of this factories certicate of regis
	 */
	@Override
	public void setRegistration(String registration) {
		model.setRegistration(registration);
	}

	/**
	 * Sets the status of this factories certicate of regis.
	 *
	 * @param status the status of this factories certicate of regis
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this factories certicate of regis.
	 *
	 * @param userId the user ID of this factories certicate of regis
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this factories certicate of regis.
	 *
	 * @param userName the user name of this factories certicate of regis
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this factories certicate of regis.
	 *
	 * @param userUuid the user uuid of this factories certicate of regis
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
	protected FactoriesCerticateOfRegisWrapper wrap(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		return new FactoriesCerticateOfRegisWrapper(factoriesCerticateOfRegis);
	}

}