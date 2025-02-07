/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AgriculturePermit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePermit
 * @generated
 */
public class AgriculturePermitWrapper
	extends BaseModelWrapper<AgriculturePermit>
	implements AgriculturePermit, ModelWrapper<AgriculturePermit> {

	public AgriculturePermitWrapper(AgriculturePermit agriculturePermit) {
		super(agriculturePermit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agriculturePermitId", getAgriculturePermitId());
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
		attributes.put("pirCertificateNUmber", getPirCertificateNUmber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agriculturePermitId = (Long)attributes.get("agriculturePermitId");

		if (agriculturePermitId != null) {
			setAgriculturePermitId(agriculturePermitId);
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

		Long pirCertificateNUmber = (Long)attributes.get(
			"pirCertificateNUmber");

		if (pirCertificateNUmber != null) {
			setPirCertificateNUmber(pirCertificateNUmber);
		}
	}

	@Override
	public AgriculturePermit cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agriculture permit ID of this agriculture permit.
	 *
	 * @return the agriculture permit ID of this agriculture permit
	 */
	@Override
	public long getAgriculturePermitId() {
		return model.getAgriculturePermitId();
	}

	/**
	 * Returns the case ID of this agriculture permit.
	 *
	 * @return the case ID of this agriculture permit
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this agriculture permit.
	 *
	 * @return the company ID of this agriculture permit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this agriculture permit.
	 *
	 * @return the create date of this agriculture permit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of expiration of this agriculture permit.
	 *
	 * @return the date of expiration of this agriculture permit
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the dateof issue of this agriculture permit.
	 *
	 * @return the dateof issue of this agriculture permit
	 */
	@Override
	public Date getDateofIssue() {
		return model.getDateofIssue();
	}

	/**
	 * Returns the duration of permit of this agriculture permit.
	 *
	 * @return the duration of permit of this agriculture permit
	 */
	@Override
	public String getDurationOfPermit() {
		return model.getDurationOfPermit();
	}

	/**
	 * Returns the group ID of this agriculture permit.
	 *
	 * @return the group ID of this agriculture permit
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this agriculture permit.
	 *
	 * @return the modified date of this agriculture permit
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pir certificate n umber of this agriculture permit.
	 *
	 * @return the pir certificate n umber of this agriculture permit
	 */
	@Override
	public long getPirCertificateNUmber() {
		return model.getPirCertificateNUmber();
	}

	/**
	 * Returns the pir permt number of this agriculture permit.
	 *
	 * @return the pir permt number of this agriculture permit
	 */
	@Override
	public String getPirPermtNumber() {
		return model.getPirPermtNumber();
	}

	/**
	 * Returns the primary key of this agriculture permit.
	 *
	 * @return the primary key of this agriculture permit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this agriculture permit.
	 *
	 * @return the user ID of this agriculture permit
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this agriculture permit.
	 *
	 * @return the user name of this agriculture permit
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this agriculture permit.
	 *
	 * @return the user uuid of this agriculture permit
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
	 * Sets the agriculture permit ID of this agriculture permit.
	 *
	 * @param agriculturePermitId the agriculture permit ID of this agriculture permit
	 */
	@Override
	public void setAgriculturePermitId(long agriculturePermitId) {
		model.setAgriculturePermitId(agriculturePermitId);
	}

	/**
	 * Sets the case ID of this agriculture permit.
	 *
	 * @param caseId the case ID of this agriculture permit
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this agriculture permit.
	 *
	 * @param companyId the company ID of this agriculture permit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this agriculture permit.
	 *
	 * @param createDate the create date of this agriculture permit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of expiration of this agriculture permit.
	 *
	 * @param dateOfExpiration the date of expiration of this agriculture permit
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the dateof issue of this agriculture permit.
	 *
	 * @param dateofIssue the dateof issue of this agriculture permit
	 */
	@Override
	public void setDateofIssue(Date dateofIssue) {
		model.setDateofIssue(dateofIssue);
	}

	/**
	 * Sets the duration of permit of this agriculture permit.
	 *
	 * @param durationOfPermit the duration of permit of this agriculture permit
	 */
	@Override
	public void setDurationOfPermit(String durationOfPermit) {
		model.setDurationOfPermit(durationOfPermit);
	}

	/**
	 * Sets the group ID of this agriculture permit.
	 *
	 * @param groupId the group ID of this agriculture permit
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this agriculture permit.
	 *
	 * @param modifiedDate the modified date of this agriculture permit
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pir certificate n umber of this agriculture permit.
	 *
	 * @param pirCertificateNUmber the pir certificate n umber of this agriculture permit
	 */
	@Override
	public void setPirCertificateNUmber(long pirCertificateNUmber) {
		model.setPirCertificateNUmber(pirCertificateNUmber);
	}

	/**
	 * Sets the pir permt number of this agriculture permit.
	 *
	 * @param pirPermtNumber the pir permt number of this agriculture permit
	 */
	@Override
	public void setPirPermtNumber(String pirPermtNumber) {
		model.setPirPermtNumber(pirPermtNumber);
	}

	/**
	 * Sets the primary key of this agriculture permit.
	 *
	 * @param primaryKey the primary key of this agriculture permit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this agriculture permit.
	 *
	 * @param userId the user ID of this agriculture permit
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this agriculture permit.
	 *
	 * @param userName the user name of this agriculture permit
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this agriculture permit.
	 *
	 * @param userUuid the user uuid of this agriculture permit
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
	protected AgriculturePermitWrapper wrap(
		AgriculturePermit agriculturePermit) {

		return new AgriculturePermitWrapper(agriculturePermit);
	}

}