/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmPermit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmPermit
 * @generated
 */
public class FarmPermitWrapper
	extends BaseModelWrapper<FarmPermit>
	implements FarmPermit, ModelWrapper<FarmPermit> {

	public FarmPermitWrapper(FarmPermit farmPermit) {
		super(farmPermit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmPermitId", getFarmPermitId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("pirPermtNumber", getPirPermtNumber());
		attributes.put("duration", getDuration());
		attributes.put("dateofIssue", getDateofIssue());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("pirCertificateNUmber", getPirCertificateNUmber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmPermitId = (Long)attributes.get("farmPermitId");

		if (farmPermitId != null) {
			setFarmPermitId(farmPermitId);
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

		String duration = (String)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Date dateofIssue = (Date)attributes.get("dateofIssue");

		if (dateofIssue != null) {
			setDateofIssue(dateofIssue);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		Long pirCertificateNUmber = (Long)attributes.get(
			"pirCertificateNUmber");

		if (pirCertificateNUmber != null) {
			setPirCertificateNUmber(pirCertificateNUmber);
		}
	}

	@Override
	public FarmPermit cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this farm permit.
	 *
	 * @return the case ID of this farm permit
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this farm permit.
	 *
	 * @return the company ID of this farm permit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farm permit.
	 *
	 * @return the create date of this farm permit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of expiration of this farm permit.
	 *
	 * @return the date of expiration of this farm permit
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the dateof issue of this farm permit.
	 *
	 * @return the dateof issue of this farm permit
	 */
	@Override
	public Date getDateofIssue() {
		return model.getDateofIssue();
	}

	/**
	 * Returns the duration of this farm permit.
	 *
	 * @return the duration of this farm permit
	 */
	@Override
	public String getDuration() {
		return model.getDuration();
	}

	/**
	 * Returns the farm permit ID of this farm permit.
	 *
	 * @return the farm permit ID of this farm permit
	 */
	@Override
	public long getFarmPermitId() {
		return model.getFarmPermitId();
	}

	/**
	 * Returns the group ID of this farm permit.
	 *
	 * @return the group ID of this farm permit
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this farm permit.
	 *
	 * @return the modified date of this farm permit
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pir certificate n umber of this farm permit.
	 *
	 * @return the pir certificate n umber of this farm permit
	 */
	@Override
	public long getPirCertificateNUmber() {
		return model.getPirCertificateNUmber();
	}

	/**
	 * Returns the pir permt number of this farm permit.
	 *
	 * @return the pir permt number of this farm permit
	 */
	@Override
	public String getPirPermtNumber() {
		return model.getPirPermtNumber();
	}

	/**
	 * Returns the primary key of this farm permit.
	 *
	 * @return the primary key of this farm permit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this farm permit.
	 *
	 * @return the user ID of this farm permit
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farm permit.
	 *
	 * @return the user name of this farm permit
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farm permit.
	 *
	 * @return the user uuid of this farm permit
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
	 * Sets the case ID of this farm permit.
	 *
	 * @param caseId the case ID of this farm permit
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this farm permit.
	 *
	 * @param companyId the company ID of this farm permit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farm permit.
	 *
	 * @param createDate the create date of this farm permit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of expiration of this farm permit.
	 *
	 * @param dateOfExpiration the date of expiration of this farm permit
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the dateof issue of this farm permit.
	 *
	 * @param dateofIssue the dateof issue of this farm permit
	 */
	@Override
	public void setDateofIssue(Date dateofIssue) {
		model.setDateofIssue(dateofIssue);
	}

	/**
	 * Sets the duration of this farm permit.
	 *
	 * @param duration the duration of this farm permit
	 */
	@Override
	public void setDuration(String duration) {
		model.setDuration(duration);
	}

	/**
	 * Sets the farm permit ID of this farm permit.
	 *
	 * @param farmPermitId the farm permit ID of this farm permit
	 */
	@Override
	public void setFarmPermitId(long farmPermitId) {
		model.setFarmPermitId(farmPermitId);
	}

	/**
	 * Sets the group ID of this farm permit.
	 *
	 * @param groupId the group ID of this farm permit
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this farm permit.
	 *
	 * @param modifiedDate the modified date of this farm permit
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pir certificate n umber of this farm permit.
	 *
	 * @param pirCertificateNUmber the pir certificate n umber of this farm permit
	 */
	@Override
	public void setPirCertificateNUmber(long pirCertificateNUmber) {
		model.setPirCertificateNUmber(pirCertificateNUmber);
	}

	/**
	 * Sets the pir permt number of this farm permit.
	 *
	 * @param pirPermtNumber the pir permt number of this farm permit
	 */
	@Override
	public void setPirPermtNumber(String pirPermtNumber) {
		model.setPirPermtNumber(pirPermtNumber);
	}

	/**
	 * Sets the primary key of this farm permit.
	 *
	 * @param primaryKey the primary key of this farm permit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this farm permit.
	 *
	 * @param userId the user ID of this farm permit
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farm permit.
	 *
	 * @param userName the user name of this farm permit
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farm permit.
	 *
	 * @param userUuid the user uuid of this farm permit
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmPermitWrapper wrap(FarmPermit farmPermit) {
		return new FarmPermitWrapper(farmPermit);
	}

}