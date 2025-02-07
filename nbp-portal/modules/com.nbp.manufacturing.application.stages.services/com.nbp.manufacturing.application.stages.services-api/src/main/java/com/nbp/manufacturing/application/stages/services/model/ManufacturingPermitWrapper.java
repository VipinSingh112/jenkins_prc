/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManufacturingPermit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingPermit
 * @generated
 */
public class ManufacturingPermitWrapper
	extends BaseModelWrapper<ManufacturingPermit>
	implements ManufacturingPermit, ModelWrapper<ManufacturingPermit> {

	public ManufacturingPermitWrapper(ManufacturingPermit manufacturingPermit) {
		super(manufacturingPermit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("manufacturingPermitId", getManufacturingPermitId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("PIRPermtNumber", getPIRPermtNumber());
		attributes.put("dateOfIssue", getDateOfIssue());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("durationOfPermit", getDurationOfPermit());
		attributes.put("typeOfPermit", getTypeOfPermit());
		attributes.put("numberOfExtensions", getNumberOfExtensions());
		attributes.put("parish", getParish());
		attributes.put(
			"pirPermitCertificateNumber", getPirPermitCertificateNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manufacturingPermitId = (Long)attributes.get(
			"manufacturingPermitId");

		if (manufacturingPermitId != null) {
			setManufacturingPermitId(manufacturingPermitId);
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

		String PIRPermtNumber = (String)attributes.get("PIRPermtNumber");

		if (PIRPermtNumber != null) {
			setPIRPermtNumber(PIRPermtNumber);
		}

		Date dateOfIssue = (Date)attributes.get("dateOfIssue");

		if (dateOfIssue != null) {
			setDateOfIssue(dateOfIssue);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		String durationOfPermit = (String)attributes.get("durationOfPermit");

		if (durationOfPermit != null) {
			setDurationOfPermit(durationOfPermit);
		}

		String typeOfPermit = (String)attributes.get("typeOfPermit");

		if (typeOfPermit != null) {
			setTypeOfPermit(typeOfPermit);
		}

		String numberOfExtensions = (String)attributes.get(
			"numberOfExtensions");

		if (numberOfExtensions != null) {
			setNumberOfExtensions(numberOfExtensions);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		Long pirPermitCertificateNumber = (Long)attributes.get(
			"pirPermitCertificateNumber");

		if (pirPermitCertificateNumber != null) {
			setPirPermitCertificateNumber(pirPermitCertificateNumber);
		}
	}

	@Override
	public ManufacturingPermit cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this manufacturing permit.
	 *
	 * @return the case ID of this manufacturing permit
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this manufacturing permit.
	 *
	 * @return the company ID of this manufacturing permit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this manufacturing permit.
	 *
	 * @return the create date of this manufacturing permit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of expiration of this manufacturing permit.
	 *
	 * @return the date of expiration of this manufacturing permit
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the date of issue of this manufacturing permit.
	 *
	 * @return the date of issue of this manufacturing permit
	 */
	@Override
	public Date getDateOfIssue() {
		return model.getDateOfIssue();
	}

	/**
	 * Returns the duration of permit of this manufacturing permit.
	 *
	 * @return the duration of permit of this manufacturing permit
	 */
	@Override
	public String getDurationOfPermit() {
		return model.getDurationOfPermit();
	}

	/**
	 * Returns the group ID of this manufacturing permit.
	 *
	 * @return the group ID of this manufacturing permit
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manufacturing permit ID of this manufacturing permit.
	 *
	 * @return the manufacturing permit ID of this manufacturing permit
	 */
	@Override
	public long getManufacturingPermitId() {
		return model.getManufacturingPermitId();
	}

	/**
	 * Returns the modified date of this manufacturing permit.
	 *
	 * @return the modified date of this manufacturing permit
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of extensions of this manufacturing permit.
	 *
	 * @return the number of extensions of this manufacturing permit
	 */
	@Override
	public String getNumberOfExtensions() {
		return model.getNumberOfExtensions();
	}

	/**
	 * Returns the parish of this manufacturing permit.
	 *
	 * @return the parish of this manufacturing permit
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the pir permit certificate number of this manufacturing permit.
	 *
	 * @return the pir permit certificate number of this manufacturing permit
	 */
	@Override
	public long getPirPermitCertificateNumber() {
		return model.getPirPermitCertificateNumber();
	}

	/**
	 * Returns the pir permt number of this manufacturing permit.
	 *
	 * @return the pir permt number of this manufacturing permit
	 */
	@Override
	public String getPIRPermtNumber() {
		return model.getPIRPermtNumber();
	}

	/**
	 * Returns the primary key of this manufacturing permit.
	 *
	 * @return the primary key of this manufacturing permit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of permit of this manufacturing permit.
	 *
	 * @return the type of permit of this manufacturing permit
	 */
	@Override
	public String getTypeOfPermit() {
		return model.getTypeOfPermit();
	}

	/**
	 * Returns the user ID of this manufacturing permit.
	 *
	 * @return the user ID of this manufacturing permit
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manufacturing permit.
	 *
	 * @return the user name of this manufacturing permit
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manufacturing permit.
	 *
	 * @return the user uuid of this manufacturing permit
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
	 * Sets the case ID of this manufacturing permit.
	 *
	 * @param caseId the case ID of this manufacturing permit
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this manufacturing permit.
	 *
	 * @param companyId the company ID of this manufacturing permit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this manufacturing permit.
	 *
	 * @param createDate the create date of this manufacturing permit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of expiration of this manufacturing permit.
	 *
	 * @param dateOfExpiration the date of expiration of this manufacturing permit
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the date of issue of this manufacturing permit.
	 *
	 * @param dateOfIssue the date of issue of this manufacturing permit
	 */
	@Override
	public void setDateOfIssue(Date dateOfIssue) {
		model.setDateOfIssue(dateOfIssue);
	}

	/**
	 * Sets the duration of permit of this manufacturing permit.
	 *
	 * @param durationOfPermit the duration of permit of this manufacturing permit
	 */
	@Override
	public void setDurationOfPermit(String durationOfPermit) {
		model.setDurationOfPermit(durationOfPermit);
	}

	/**
	 * Sets the group ID of this manufacturing permit.
	 *
	 * @param groupId the group ID of this manufacturing permit
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manufacturing permit ID of this manufacturing permit.
	 *
	 * @param manufacturingPermitId the manufacturing permit ID of this manufacturing permit
	 */
	@Override
	public void setManufacturingPermitId(long manufacturingPermitId) {
		model.setManufacturingPermitId(manufacturingPermitId);
	}

	/**
	 * Sets the modified date of this manufacturing permit.
	 *
	 * @param modifiedDate the modified date of this manufacturing permit
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of extensions of this manufacturing permit.
	 *
	 * @param numberOfExtensions the number of extensions of this manufacturing permit
	 */
	@Override
	public void setNumberOfExtensions(String numberOfExtensions) {
		model.setNumberOfExtensions(numberOfExtensions);
	}

	/**
	 * Sets the parish of this manufacturing permit.
	 *
	 * @param parish the parish of this manufacturing permit
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the pir permit certificate number of this manufacturing permit.
	 *
	 * @param pirPermitCertificateNumber the pir permit certificate number of this manufacturing permit
	 */
	@Override
	public void setPirPermitCertificateNumber(long pirPermitCertificateNumber) {
		model.setPirPermitCertificateNumber(pirPermitCertificateNumber);
	}

	/**
	 * Sets the pir permt number of this manufacturing permit.
	 *
	 * @param PIRPermtNumber the pir permt number of this manufacturing permit
	 */
	@Override
	public void setPIRPermtNumber(String PIRPermtNumber) {
		model.setPIRPermtNumber(PIRPermtNumber);
	}

	/**
	 * Sets the primary key of this manufacturing permit.
	 *
	 * @param primaryKey the primary key of this manufacturing permit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of permit of this manufacturing permit.
	 *
	 * @param typeOfPermit the type of permit of this manufacturing permit
	 */
	@Override
	public void setTypeOfPermit(String typeOfPermit) {
		model.setTypeOfPermit(typeOfPermit);
	}

	/**
	 * Sets the user ID of this manufacturing permit.
	 *
	 * @param userId the user ID of this manufacturing permit
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manufacturing permit.
	 *
	 * @param userName the user name of this manufacturing permit
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manufacturing permit.
	 *
	 * @param userUuid the user uuid of this manufacturing permit
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
	protected ManufacturingPermitWrapper wrap(
		ManufacturingPermit manufacturingPermit) {

		return new ManufacturingPermitWrapper(manufacturingPermit);
	}

}