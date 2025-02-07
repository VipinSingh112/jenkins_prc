/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativePermit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativePermit
 * @generated
 */
public class CreativePermitWrapper
	extends BaseModelWrapper<CreativePermit>
	implements CreativePermit, ModelWrapper<CreativePermit> {

	public CreativePermitWrapper(CreativePermit creativePermit) {
		super(creativePermit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("creativePermitId", getCreativePermitId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("pirPermtNumber", getPirPermtNumber());
		attributes.put("dateofIssue", getDateofIssue());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("durationOfPermit", getDurationOfPermit());
		attributes.put("pirCertificateNumber", getPirCertificateNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativePermitId = (Long)attributes.get("creativePermitId");

		if (creativePermitId != null) {
			setCreativePermitId(creativePermitId);
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

		String pirPermtNumber = (String)attributes.get("pirPermtNumber");

		if (pirPermtNumber != null) {
			setPirPermtNumber(pirPermtNumber);
		}

		Date dateofIssue = (Date)attributes.get("dateofIssue");

		if (dateofIssue != null) {
			setDateofIssue(dateofIssue);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		String durationOfPermit = (String)attributes.get("durationOfPermit");

		if (durationOfPermit != null) {
			setDurationOfPermit(durationOfPermit);
		}

		Long pirCertificateNumber = (Long)attributes.get(
			"pirCertificateNumber");

		if (pirCertificateNumber != null) {
			setPirCertificateNumber(pirCertificateNumber);
		}
	}

	@Override
	public CreativePermit cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this creative permit.
	 *
	 * @return the case ID of this creative permit
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this creative permit.
	 *
	 * @return the company ID of this creative permit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative permit.
	 *
	 * @return the create date of this creative permit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative permit ID of this creative permit.
	 *
	 * @return the creative permit ID of this creative permit
	 */
	@Override
	public long getCreativePermitId() {
		return model.getCreativePermitId();
	}

	/**
	 * Returns the date of expiration of this creative permit.
	 *
	 * @return the date of expiration of this creative permit
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the dateof issue of this creative permit.
	 *
	 * @return the dateof issue of this creative permit
	 */
	@Override
	public Date getDateofIssue() {
		return model.getDateofIssue();
	}

	/**
	 * Returns the duration of permit of this creative permit.
	 *
	 * @return the duration of permit of this creative permit
	 */
	@Override
	public String getDurationOfPermit() {
		return model.getDurationOfPermit();
	}

	/**
	 * Returns the group ID of this creative permit.
	 *
	 * @return the group ID of this creative permit
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative permit.
	 *
	 * @return the modified date of this creative permit
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pir certificate number of this creative permit.
	 *
	 * @return the pir certificate number of this creative permit
	 */
	@Override
	public long getPirCertificateNumber() {
		return model.getPirCertificateNumber();
	}

	/**
	 * Returns the pir permt number of this creative permit.
	 *
	 * @return the pir permt number of this creative permit
	 */
	@Override
	public String getPirPermtNumber() {
		return model.getPirPermtNumber();
	}

	/**
	 * Returns the primary key of this creative permit.
	 *
	 * @return the primary key of this creative permit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this creative permit.
	 *
	 * @return the user ID of this creative permit
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative permit.
	 *
	 * @return the user name of this creative permit
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative permit.
	 *
	 * @return the user uuid of this creative permit
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
	 * Sets the case ID of this creative permit.
	 *
	 * @param caseId the case ID of this creative permit
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this creative permit.
	 *
	 * @param companyId the company ID of this creative permit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative permit.
	 *
	 * @param createDate the create date of this creative permit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative permit ID of this creative permit.
	 *
	 * @param creativePermitId the creative permit ID of this creative permit
	 */
	@Override
	public void setCreativePermitId(long creativePermitId) {
		model.setCreativePermitId(creativePermitId);
	}

	/**
	 * Sets the date of expiration of this creative permit.
	 *
	 * @param dateOfExpiration the date of expiration of this creative permit
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the dateof issue of this creative permit.
	 *
	 * @param dateofIssue the dateof issue of this creative permit
	 */
	@Override
	public void setDateofIssue(Date dateofIssue) {
		model.setDateofIssue(dateofIssue);
	}

	/**
	 * Sets the duration of permit of this creative permit.
	 *
	 * @param durationOfPermit the duration of permit of this creative permit
	 */
	@Override
	public void setDurationOfPermit(String durationOfPermit) {
		model.setDurationOfPermit(durationOfPermit);
	}

	/**
	 * Sets the group ID of this creative permit.
	 *
	 * @param groupId the group ID of this creative permit
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative permit.
	 *
	 * @param modifiedDate the modified date of this creative permit
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pir certificate number of this creative permit.
	 *
	 * @param pirCertificateNumber the pir certificate number of this creative permit
	 */
	@Override
	public void setPirCertificateNumber(long pirCertificateNumber) {
		model.setPirCertificateNumber(pirCertificateNumber);
	}

	/**
	 * Sets the pir permt number of this creative permit.
	 *
	 * @param pirPermtNumber the pir permt number of this creative permit
	 */
	@Override
	public void setPirPermtNumber(String pirPermtNumber) {
		model.setPirPermtNumber(pirPermtNumber);
	}

	/**
	 * Sets the primary key of this creative permit.
	 *
	 * @param primaryKey the primary key of this creative permit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this creative permit.
	 *
	 * @param userId the user ID of this creative permit
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative permit.
	 *
	 * @param userName the user name of this creative permit
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative permit.
	 *
	 * @param userUuid the user uuid of this creative permit
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
	protected CreativePermitWrapper wrap(CreativePermit creativePermit) {
		return new CreativePermitWrapper(creativePermit);
	}

}