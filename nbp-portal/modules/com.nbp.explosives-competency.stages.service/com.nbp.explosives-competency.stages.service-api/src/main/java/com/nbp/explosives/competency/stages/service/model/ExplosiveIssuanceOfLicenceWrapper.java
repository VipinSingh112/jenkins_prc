/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ExplosiveIssuanceOfLicence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveIssuanceOfLicence
 * @generated
 */
public class ExplosiveIssuanceOfLicenceWrapper
	extends BaseModelWrapper<ExplosiveIssuanceOfLicence>
	implements ExplosiveIssuanceOfLicence,
			   ModelWrapper<ExplosiveIssuanceOfLicence> {

	public ExplosiveIssuanceOfLicenceWrapper(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		super(explosiveIssuanceOfLicence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("issuanceId", getIssuanceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dateOfIssuance", getDateOfIssuance());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("certificateNumberId", getCertificateNumberId());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long issuanceId = (Long)attributes.get("issuanceId");

		if (issuanceId != null) {
			setIssuanceId(issuanceId);
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

		Date dateOfIssuance = (Date)attributes.get("dateOfIssuance");

		if (dateOfIssuance != null) {
			setDateOfIssuance(dateOfIssuance);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		Long certificateNumberId = (Long)attributes.get("certificateNumberId");

		if (certificateNumberId != null) {
			setCertificateNumberId(certificateNumberId);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public ExplosiveIssuanceOfLicence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this explosive issuance of licence.
	 *
	 * @return the case ID of this explosive issuance of licence
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the certificate number of this explosive issuance of licence.
	 *
	 * @return the certificate number of this explosive issuance of licence
	 */
	@Override
	public String getCertificateNumber() {
		return model.getCertificateNumber();
	}

	/**
	 * Returns the certificate number ID of this explosive issuance of licence.
	 *
	 * @return the certificate number ID of this explosive issuance of licence
	 */
	@Override
	public long getCertificateNumberId() {
		return model.getCertificateNumberId();
	}

	/**
	 * Returns the company ID of this explosive issuance of licence.
	 *
	 * @return the company ID of this explosive issuance of licence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this explosive issuance of licence.
	 *
	 * @return the create date of this explosive issuance of licence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of expiration of this explosive issuance of licence.
	 *
	 * @return the date of expiration of this explosive issuance of licence
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the date of issuance of this explosive issuance of licence.
	 *
	 * @return the date of issuance of this explosive issuance of licence
	 */
	@Override
	public Date getDateOfIssuance() {
		return model.getDateOfIssuance();
	}

	/**
	 * Returns the group ID of this explosive issuance of licence.
	 *
	 * @return the group ID of this explosive issuance of licence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issuance ID of this explosive issuance of licence.
	 *
	 * @return the issuance ID of this explosive issuance of licence
	 */
	@Override
	public long getIssuanceId() {
		return model.getIssuanceId();
	}

	/**
	 * Returns the modified date of this explosive issuance of licence.
	 *
	 * @return the modified date of this explosive issuance of licence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this explosive issuance of licence.
	 *
	 * @return the primary key of this explosive issuance of licence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this explosive issuance of licence.
	 *
	 * @return the user ID of this explosive issuance of licence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this explosive issuance of licence.
	 *
	 * @return the user name of this explosive issuance of licence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this explosive issuance of licence.
	 *
	 * @return the user uuid of this explosive issuance of licence
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this explosive issuance of licence.
	 *
	 * @return the uuid of this explosive issuance of licence
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this explosive issuance of licence.
	 *
	 * @param caseId the case ID of this explosive issuance of licence
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the certificate number of this explosive issuance of licence.
	 *
	 * @param certificateNumber the certificate number of this explosive issuance of licence
	 */
	@Override
	public void setCertificateNumber(String certificateNumber) {
		model.setCertificateNumber(certificateNumber);
	}

	/**
	 * Sets the certificate number ID of this explosive issuance of licence.
	 *
	 * @param certificateNumberId the certificate number ID of this explosive issuance of licence
	 */
	@Override
	public void setCertificateNumberId(long certificateNumberId) {
		model.setCertificateNumberId(certificateNumberId);
	}

	/**
	 * Sets the company ID of this explosive issuance of licence.
	 *
	 * @param companyId the company ID of this explosive issuance of licence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this explosive issuance of licence.
	 *
	 * @param createDate the create date of this explosive issuance of licence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of expiration of this explosive issuance of licence.
	 *
	 * @param dateOfExpiration the date of expiration of this explosive issuance of licence
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the date of issuance of this explosive issuance of licence.
	 *
	 * @param dateOfIssuance the date of issuance of this explosive issuance of licence
	 */
	@Override
	public void setDateOfIssuance(Date dateOfIssuance) {
		model.setDateOfIssuance(dateOfIssuance);
	}

	/**
	 * Sets the group ID of this explosive issuance of licence.
	 *
	 * @param groupId the group ID of this explosive issuance of licence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issuance ID of this explosive issuance of licence.
	 *
	 * @param issuanceId the issuance ID of this explosive issuance of licence
	 */
	@Override
	public void setIssuanceId(long issuanceId) {
		model.setIssuanceId(issuanceId);
	}

	/**
	 * Sets the modified date of this explosive issuance of licence.
	 *
	 * @param modifiedDate the modified date of this explosive issuance of licence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this explosive issuance of licence.
	 *
	 * @param primaryKey the primary key of this explosive issuance of licence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this explosive issuance of licence.
	 *
	 * @param userId the user ID of this explosive issuance of licence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this explosive issuance of licence.
	 *
	 * @param userName the user name of this explosive issuance of licence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this explosive issuance of licence.
	 *
	 * @param userUuid the user uuid of this explosive issuance of licence
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this explosive issuance of licence.
	 *
	 * @param uuid the uuid of this explosive issuance of licence
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
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
	protected ExplosiveIssuanceOfLicenceWrapper wrap(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

		return new ExplosiveIssuanceOfLicenceWrapper(
			explosiveIssuanceOfLicence);
	}

}