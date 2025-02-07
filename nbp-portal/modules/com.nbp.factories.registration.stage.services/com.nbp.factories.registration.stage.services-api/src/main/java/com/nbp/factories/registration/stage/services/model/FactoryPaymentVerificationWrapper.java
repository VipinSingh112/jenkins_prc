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
 * This class is a wrapper for {@link FactoryPaymentVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoryPaymentVerification
 * @generated
 */
public class FactoryPaymentVerificationWrapper
	extends BaseModelWrapper<FactoryPaymentVerification>
	implements FactoryPaymentVerification,
			   ModelWrapper<FactoryPaymentVerification> {

	public FactoryPaymentVerificationWrapper(
		FactoryPaymentVerification factoryPaymentVerification) {

		super(factoryPaymentVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"factoryPaymentVerificationId", getFactoryPaymentVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("dateReceived", getDateReceived());
		attributes.put("amountReceived", getAmountReceived());
		attributes.put("amountDue", getAmountDue());
		attributes.put("receiptNumber", getReceiptNumber());
		attributes.put("comment", getComment());
		attributes.put("amountOutstanding", getAmountOutstanding());
		attributes.put("dueDate", getDueDate());
		attributes.put("status", getStatus());
		attributes.put("docFileEntry", getDocFileEntry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long factoryPaymentVerificationId = (Long)attributes.get(
			"factoryPaymentVerificationId");

		if (factoryPaymentVerificationId != null) {
			setFactoryPaymentVerificationId(factoryPaymentVerificationId);
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

		Date dateReceived = (Date)attributes.get("dateReceived");

		if (dateReceived != null) {
			setDateReceived(dateReceived);
		}

		String amountReceived = (String)attributes.get("amountReceived");

		if (amountReceived != null) {
			setAmountReceived(amountReceived);
		}

		String amountDue = (String)attributes.get("amountDue");

		if (amountDue != null) {
			setAmountDue(amountDue);
		}

		String receiptNumber = (String)attributes.get("receiptNumber");

		if (receiptNumber != null) {
			setReceiptNumber(receiptNumber);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		String amountOutstanding = (String)attributes.get("amountOutstanding");

		if (amountOutstanding != null) {
			setAmountOutstanding(amountOutstanding);
		}

		Date dueDate = (Date)attributes.get("dueDate");

		if (dueDate != null) {
			setDueDate(dueDate);
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
	public FactoryPaymentVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount due of this factory payment verification.
	 *
	 * @return the amount due of this factory payment verification
	 */
	@Override
	public String getAmountDue() {
		return model.getAmountDue();
	}

	/**
	 * Returns the amount outstanding of this factory payment verification.
	 *
	 * @return the amount outstanding of this factory payment verification
	 */
	@Override
	public String getAmountOutstanding() {
		return model.getAmountOutstanding();
	}

	/**
	 * Returns the amount received of this factory payment verification.
	 *
	 * @return the amount received of this factory payment verification
	 */
	@Override
	public String getAmountReceived() {
		return model.getAmountReceived();
	}

	/**
	 * Returns the case ID of this factory payment verification.
	 *
	 * @return the case ID of this factory payment verification
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the comment of this factory payment verification.
	 *
	 * @return the comment of this factory payment verification
	 */
	@Override
	public String getComment() {
		return model.getComment();
	}

	/**
	 * Returns the company ID of this factory payment verification.
	 *
	 * @return the company ID of this factory payment verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this factory payment verification.
	 *
	 * @return the create date of this factory payment verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date received of this factory payment verification.
	 *
	 * @return the date received of this factory payment verification
	 */
	@Override
	public Date getDateReceived() {
		return model.getDateReceived();
	}

	/**
	 * Returns the doc file entry of this factory payment verification.
	 *
	 * @return the doc file entry of this factory payment verification
	 */
	@Override
	public long getDocFileEntry() {
		return model.getDocFileEntry();
	}

	/**
	 * Returns the due date of this factory payment verification.
	 *
	 * @return the due date of this factory payment verification
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the factory payment verification ID of this factory payment verification.
	 *
	 * @return the factory payment verification ID of this factory payment verification
	 */
	@Override
	public long getFactoryPaymentVerificationId() {
		return model.getFactoryPaymentVerificationId();
	}

	/**
	 * Returns the group ID of this factory payment verification.
	 *
	 * @return the group ID of this factory payment verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this factory payment verification.
	 *
	 * @return the modified date of this factory payment verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this factory payment verification.
	 *
	 * @return the primary key of this factory payment verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the receipt number of this factory payment verification.
	 *
	 * @return the receipt number of this factory payment verification
	 */
	@Override
	public String getReceiptNumber() {
		return model.getReceiptNumber();
	}

	/**
	 * Returns the status of this factory payment verification.
	 *
	 * @return the status of this factory payment verification
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this factory payment verification.
	 *
	 * @return the user ID of this factory payment verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this factory payment verification.
	 *
	 * @return the user name of this factory payment verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this factory payment verification.
	 *
	 * @return the user uuid of this factory payment verification
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
	 * Sets the amount due of this factory payment verification.
	 *
	 * @param amountDue the amount due of this factory payment verification
	 */
	@Override
	public void setAmountDue(String amountDue) {
		model.setAmountDue(amountDue);
	}

	/**
	 * Sets the amount outstanding of this factory payment verification.
	 *
	 * @param amountOutstanding the amount outstanding of this factory payment verification
	 */
	@Override
	public void setAmountOutstanding(String amountOutstanding) {
		model.setAmountOutstanding(amountOutstanding);
	}

	/**
	 * Sets the amount received of this factory payment verification.
	 *
	 * @param amountReceived the amount received of this factory payment verification
	 */
	@Override
	public void setAmountReceived(String amountReceived) {
		model.setAmountReceived(amountReceived);
	}

	/**
	 * Sets the case ID of this factory payment verification.
	 *
	 * @param caseId the case ID of this factory payment verification
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the comment of this factory payment verification.
	 *
	 * @param comment the comment of this factory payment verification
	 */
	@Override
	public void setComment(String comment) {
		model.setComment(comment);
	}

	/**
	 * Sets the company ID of this factory payment verification.
	 *
	 * @param companyId the company ID of this factory payment verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this factory payment verification.
	 *
	 * @param createDate the create date of this factory payment verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date received of this factory payment verification.
	 *
	 * @param dateReceived the date received of this factory payment verification
	 */
	@Override
	public void setDateReceived(Date dateReceived) {
		model.setDateReceived(dateReceived);
	}

	/**
	 * Sets the doc file entry of this factory payment verification.
	 *
	 * @param docFileEntry the doc file entry of this factory payment verification
	 */
	@Override
	public void setDocFileEntry(long docFileEntry) {
		model.setDocFileEntry(docFileEntry);
	}

	/**
	 * Sets the due date of this factory payment verification.
	 *
	 * @param dueDate the due date of this factory payment verification
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the factory payment verification ID of this factory payment verification.
	 *
	 * @param factoryPaymentVerificationId the factory payment verification ID of this factory payment verification
	 */
	@Override
	public void setFactoryPaymentVerificationId(
		long factoryPaymentVerificationId) {

		model.setFactoryPaymentVerificationId(factoryPaymentVerificationId);
	}

	/**
	 * Sets the group ID of this factory payment verification.
	 *
	 * @param groupId the group ID of this factory payment verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this factory payment verification.
	 *
	 * @param modifiedDate the modified date of this factory payment verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this factory payment verification.
	 *
	 * @param primaryKey the primary key of this factory payment verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the receipt number of this factory payment verification.
	 *
	 * @param receiptNumber the receipt number of this factory payment verification
	 */
	@Override
	public void setReceiptNumber(String receiptNumber) {
		model.setReceiptNumber(receiptNumber);
	}

	/**
	 * Sets the status of this factory payment verification.
	 *
	 * @param status the status of this factory payment verification
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this factory payment verification.
	 *
	 * @param userId the user ID of this factory payment verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this factory payment verification.
	 *
	 * @param userName the user name of this factory payment verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this factory payment verification.
	 *
	 * @param userUuid the user uuid of this factory payment verification
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
	protected FactoryPaymentVerificationWrapper wrap(
		FactoryPaymentVerification factoryPaymentVerification) {

		return new FactoryPaymentVerificationWrapper(
			factoryPaymentVerification);
	}

}