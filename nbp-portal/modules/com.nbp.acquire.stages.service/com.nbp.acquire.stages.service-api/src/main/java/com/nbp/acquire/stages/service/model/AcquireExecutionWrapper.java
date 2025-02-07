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
 * This class is a wrapper for {@link AcquireExecution}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireExecution
 * @generated
 */
public class AcquireExecutionWrapper
	extends BaseModelWrapper<AcquireExecution>
	implements AcquireExecution, ModelWrapper<AcquireExecution> {

	public AcquireExecutionWrapper(AcquireExecution acquireExecution) {
		super(acquireExecution);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireExecutionId", getAcquireExecutionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("paymentSection", getPaymentSection());
		attributes.put("paymentAmountDue", getPaymentAmountDue());
		attributes.put("contractSection", getContractSection());
		attributes.put("dateContractExecuted", getDateContractExecuted());
		attributes.put("docFileEntryId", getDocFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireExecutionId = (Long)attributes.get("acquireExecutionId");

		if (acquireExecutionId != null) {
			setAcquireExecutionId(acquireExecutionId);
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

		String paymentSection = (String)attributes.get("paymentSection");

		if (paymentSection != null) {
			setPaymentSection(paymentSection);
		}

		String paymentAmountDue = (String)attributes.get("paymentAmountDue");

		if (paymentAmountDue != null) {
			setPaymentAmountDue(paymentAmountDue);
		}

		String contractSection = (String)attributes.get("contractSection");

		if (contractSection != null) {
			setContractSection(contractSection);
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
	public AcquireExecution cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire execution ID of this acquire execution.
	 *
	 * @return the acquire execution ID of this acquire execution
	 */
	@Override
	public long getAcquireExecutionId() {
		return model.getAcquireExecutionId();
	}

	/**
	 * Returns the case ID of this acquire execution.
	 *
	 * @return the case ID of this acquire execution
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this acquire execution.
	 *
	 * @return the company ID of this acquire execution
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contract section of this acquire execution.
	 *
	 * @return the contract section of this acquire execution
	 */
	@Override
	public String getContractSection() {
		return model.getContractSection();
	}

	/**
	 * Returns the create date of this acquire execution.
	 *
	 * @return the create date of this acquire execution
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date contract executed of this acquire execution.
	 *
	 * @return the date contract executed of this acquire execution
	 */
	@Override
	public Date getDateContractExecuted() {
		return model.getDateContractExecuted();
	}

	/**
	 * Returns the doc file entry ID of this acquire execution.
	 *
	 * @return the doc file entry ID of this acquire execution
	 */
	@Override
	public long getDocFileEntryId() {
		return model.getDocFileEntryId();
	}

	/**
	 * Returns the group ID of this acquire execution.
	 *
	 * @return the group ID of this acquire execution
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire execution.
	 *
	 * @return the modified date of this acquire execution
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment amount due of this acquire execution.
	 *
	 * @return the payment amount due of this acquire execution
	 */
	@Override
	public String getPaymentAmountDue() {
		return model.getPaymentAmountDue();
	}

	/**
	 * Returns the payment section of this acquire execution.
	 *
	 * @return the payment section of this acquire execution
	 */
	@Override
	public String getPaymentSection() {
		return model.getPaymentSection();
	}

	/**
	 * Returns the primary key of this acquire execution.
	 *
	 * @return the primary key of this acquire execution
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire execution.
	 *
	 * @return the user ID of this acquire execution
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire execution.
	 *
	 * @return the user name of this acquire execution
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire execution.
	 *
	 * @return the user uuid of this acquire execution
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
	 * Sets the acquire execution ID of this acquire execution.
	 *
	 * @param acquireExecutionId the acquire execution ID of this acquire execution
	 */
	@Override
	public void setAcquireExecutionId(long acquireExecutionId) {
		model.setAcquireExecutionId(acquireExecutionId);
	}

	/**
	 * Sets the case ID of this acquire execution.
	 *
	 * @param caseId the case ID of this acquire execution
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this acquire execution.
	 *
	 * @param companyId the company ID of this acquire execution
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contract section of this acquire execution.
	 *
	 * @param contractSection the contract section of this acquire execution
	 */
	@Override
	public void setContractSection(String contractSection) {
		model.setContractSection(contractSection);
	}

	/**
	 * Sets the create date of this acquire execution.
	 *
	 * @param createDate the create date of this acquire execution
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date contract executed of this acquire execution.
	 *
	 * @param dateContractExecuted the date contract executed of this acquire execution
	 */
	@Override
	public void setDateContractExecuted(Date dateContractExecuted) {
		model.setDateContractExecuted(dateContractExecuted);
	}

	/**
	 * Sets the doc file entry ID of this acquire execution.
	 *
	 * @param docFileEntryId the doc file entry ID of this acquire execution
	 */
	@Override
	public void setDocFileEntryId(long docFileEntryId) {
		model.setDocFileEntryId(docFileEntryId);
	}

	/**
	 * Sets the group ID of this acquire execution.
	 *
	 * @param groupId the group ID of this acquire execution
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire execution.
	 *
	 * @param modifiedDate the modified date of this acquire execution
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment amount due of this acquire execution.
	 *
	 * @param paymentAmountDue the payment amount due of this acquire execution
	 */
	@Override
	public void setPaymentAmountDue(String paymentAmountDue) {
		model.setPaymentAmountDue(paymentAmountDue);
	}

	/**
	 * Sets the payment section of this acquire execution.
	 *
	 * @param paymentSection the payment section of this acquire execution
	 */
	@Override
	public void setPaymentSection(String paymentSection) {
		model.setPaymentSection(paymentSection);
	}

	/**
	 * Sets the primary key of this acquire execution.
	 *
	 * @param primaryKey the primary key of this acquire execution
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire execution.
	 *
	 * @param userId the user ID of this acquire execution
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire execution.
	 *
	 * @param userName the user name of this acquire execution
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire execution.
	 *
	 * @param userUuid the user uuid of this acquire execution
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
	protected AcquireExecutionWrapper wrap(AcquireExecution acquireExecution) {
		return new AcquireExecutionWrapper(acquireExecution);
	}

}