/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireFinalExecutedAgreement}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreement
 * @generated
 */
public class AcquireFinalExecutedAgreementWrapper
	extends BaseModelWrapper<AcquireFinalExecutedAgreement>
	implements AcquireFinalExecutedAgreement,
			   ModelWrapper<AcquireFinalExecutedAgreement> {

	public AcquireFinalExecutedAgreementWrapper(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		super(acquireFinalExecutedAgreement);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquirefinalId", getAcquirefinalId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("dateContractExecuted", getDateContractExecuted());
		attributes.put("docFileEntryId", getDocFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquirefinalId = (Long)attributes.get("acquirefinalId");

		if (acquirefinalId != null) {
			setAcquirefinalId(acquirefinalId);
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

		Date dateContractExecuted = (Date)attributes.get(
			"dateContractExecuted");

		if (dateContractExecuted != null) {
			setDateContractExecuted(dateContractExecuted);
		}

		Long docFileEntryId = (Long)attributes.get("docFileEntryId");

		if (docFileEntryId != null) {
			setDocFileEntryId(docFileEntryId);
		}
	}

	@Override
	public AcquireFinalExecutedAgreement cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquirefinal ID of this acquire final executed agreement.
	 *
	 * @return the acquirefinal ID of this acquire final executed agreement
	 */
	@Override
	public long getAcquirefinalId() {
		return model.getAcquirefinalId();
	}

	/**
	 * Returns the case ID of this acquire final executed agreement.
	 *
	 * @return the case ID of this acquire final executed agreement
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this acquire final executed agreement.
	 *
	 * @return the company ID of this acquire final executed agreement
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire final executed agreement.
	 *
	 * @return the create date of this acquire final executed agreement
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date contract executed of this acquire final executed agreement.
	 *
	 * @return the date contract executed of this acquire final executed agreement
	 */
	@Override
	public Date getDateContractExecuted() {
		return model.getDateContractExecuted();
	}

	/**
	 * Returns the doc file entry ID of this acquire final executed agreement.
	 *
	 * @return the doc file entry ID of this acquire final executed agreement
	 */
	@Override
	public long getDocFileEntryId() {
		return model.getDocFileEntryId();
	}

	/**
	 * Returns the group ID of this acquire final executed agreement.
	 *
	 * @return the group ID of this acquire final executed agreement
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire final executed agreement.
	 *
	 * @return the modified date of this acquire final executed agreement
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire final executed agreement.
	 *
	 * @return the primary key of this acquire final executed agreement
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire final executed agreement.
	 *
	 * @return the user ID of this acquire final executed agreement
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire final executed agreement.
	 *
	 * @return the user name of this acquire final executed agreement
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire final executed agreement.
	 *
	 * @return the user uuid of this acquire final executed agreement
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
	 * Sets the acquirefinal ID of this acquire final executed agreement.
	 *
	 * @param acquirefinalId the acquirefinal ID of this acquire final executed agreement
	 */
	@Override
	public void setAcquirefinalId(long acquirefinalId) {
		model.setAcquirefinalId(acquirefinalId);
	}

	/**
	 * Sets the case ID of this acquire final executed agreement.
	 *
	 * @param caseId the case ID of this acquire final executed agreement
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this acquire final executed agreement.
	 *
	 * @param companyId the company ID of this acquire final executed agreement
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire final executed agreement.
	 *
	 * @param createDate the create date of this acquire final executed agreement
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date contract executed of this acquire final executed agreement.
	 *
	 * @param dateContractExecuted the date contract executed of this acquire final executed agreement
	 */
	@Override
	public void setDateContractExecuted(Date dateContractExecuted) {
		model.setDateContractExecuted(dateContractExecuted);
	}

	/**
	 * Sets the doc file entry ID of this acquire final executed agreement.
	 *
	 * @param docFileEntryId the doc file entry ID of this acquire final executed agreement
	 */
	@Override
	public void setDocFileEntryId(long docFileEntryId) {
		model.setDocFileEntryId(docFileEntryId);
	}

	/**
	 * Sets the group ID of this acquire final executed agreement.
	 *
	 * @param groupId the group ID of this acquire final executed agreement
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire final executed agreement.
	 *
	 * @param modifiedDate the modified date of this acquire final executed agreement
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire final executed agreement.
	 *
	 * @param primaryKey the primary key of this acquire final executed agreement
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire final executed agreement.
	 *
	 * @param userId the user ID of this acquire final executed agreement
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire final executed agreement.
	 *
	 * @param userName the user name of this acquire final executed agreement
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire final executed agreement.
	 *
	 * @param userUuid the user uuid of this acquire final executed agreement
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
	protected AcquireFinalExecutedAgreementWrapper wrap(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		return new AcquireFinalExecutedAgreementWrapper(
			acquireFinalExecutedAgreement);
	}

}