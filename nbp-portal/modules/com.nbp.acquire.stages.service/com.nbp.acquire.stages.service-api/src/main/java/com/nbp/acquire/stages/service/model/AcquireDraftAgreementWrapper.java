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
 * This class is a wrapper for {@link AcquireDraftAgreement}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDraftAgreement
 * @generated
 */
public class AcquireDraftAgreementWrapper
	extends BaseModelWrapper<AcquireDraftAgreement>
	implements AcquireDraftAgreement, ModelWrapper<AcquireDraftAgreement> {

	public AcquireDraftAgreementWrapper(
		AcquireDraftAgreement acquireDraftAgreement) {

		super(acquireDraftAgreement);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireDraftId", getAcquireDraftId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("paymentAmountDue", getPaymentAmountDue());
		attributes.put("docFileEntryId", getDocFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireDraftId = (Long)attributes.get("acquireDraftId");

		if (acquireDraftId != null) {
			setAcquireDraftId(acquireDraftId);
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

		String paymentAmountDue = (String)attributes.get("paymentAmountDue");

		if (paymentAmountDue != null) {
			setPaymentAmountDue(paymentAmountDue);
		}

		Long docFileEntryId = (Long)attributes.get("docFileEntryId");

		if (docFileEntryId != null) {
			setDocFileEntryId(docFileEntryId);
		}
	}

	@Override
	public AcquireDraftAgreement cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire draft ID of this acquire draft agreement.
	 *
	 * @return the acquire draft ID of this acquire draft agreement
	 */
	@Override
	public long getAcquireDraftId() {
		return model.getAcquireDraftId();
	}

	/**
	 * Returns the case ID of this acquire draft agreement.
	 *
	 * @return the case ID of this acquire draft agreement
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this acquire draft agreement.
	 *
	 * @return the company ID of this acquire draft agreement
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire draft agreement.
	 *
	 * @return the create date of this acquire draft agreement
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc file entry ID of this acquire draft agreement.
	 *
	 * @return the doc file entry ID of this acquire draft agreement
	 */
	@Override
	public long getDocFileEntryId() {
		return model.getDocFileEntryId();
	}

	/**
	 * Returns the group ID of this acquire draft agreement.
	 *
	 * @return the group ID of this acquire draft agreement
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire draft agreement.
	 *
	 * @return the modified date of this acquire draft agreement
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment amount due of this acquire draft agreement.
	 *
	 * @return the payment amount due of this acquire draft agreement
	 */
	@Override
	public String getPaymentAmountDue() {
		return model.getPaymentAmountDue();
	}

	/**
	 * Returns the primary key of this acquire draft agreement.
	 *
	 * @return the primary key of this acquire draft agreement
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire draft agreement.
	 *
	 * @return the user ID of this acquire draft agreement
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire draft agreement.
	 *
	 * @return the user name of this acquire draft agreement
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire draft agreement.
	 *
	 * @return the user uuid of this acquire draft agreement
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
	 * Sets the acquire draft ID of this acquire draft agreement.
	 *
	 * @param acquireDraftId the acquire draft ID of this acquire draft agreement
	 */
	@Override
	public void setAcquireDraftId(long acquireDraftId) {
		model.setAcquireDraftId(acquireDraftId);
	}

	/**
	 * Sets the case ID of this acquire draft agreement.
	 *
	 * @param caseId the case ID of this acquire draft agreement
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this acquire draft agreement.
	 *
	 * @param companyId the company ID of this acquire draft agreement
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire draft agreement.
	 *
	 * @param createDate the create date of this acquire draft agreement
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc file entry ID of this acquire draft agreement.
	 *
	 * @param docFileEntryId the doc file entry ID of this acquire draft agreement
	 */
	@Override
	public void setDocFileEntryId(long docFileEntryId) {
		model.setDocFileEntryId(docFileEntryId);
	}

	/**
	 * Sets the group ID of this acquire draft agreement.
	 *
	 * @param groupId the group ID of this acquire draft agreement
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire draft agreement.
	 *
	 * @param modifiedDate the modified date of this acquire draft agreement
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment amount due of this acquire draft agreement.
	 *
	 * @param paymentAmountDue the payment amount due of this acquire draft agreement
	 */
	@Override
	public void setPaymentAmountDue(String paymentAmountDue) {
		model.setPaymentAmountDue(paymentAmountDue);
	}

	/**
	 * Sets the primary key of this acquire draft agreement.
	 *
	 * @param primaryKey the primary key of this acquire draft agreement
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire draft agreement.
	 *
	 * @param userId the user ID of this acquire draft agreement
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire draft agreement.
	 *
	 * @param userName the user name of this acquire draft agreement
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire draft agreement.
	 *
	 * @param userUuid the user uuid of this acquire draft agreement
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
	protected AcquireDraftAgreementWrapper wrap(
		AcquireDraftAgreement acquireDraftAgreement) {

		return new AcquireDraftAgreementWrapper(acquireDraftAgreement);
	}

}