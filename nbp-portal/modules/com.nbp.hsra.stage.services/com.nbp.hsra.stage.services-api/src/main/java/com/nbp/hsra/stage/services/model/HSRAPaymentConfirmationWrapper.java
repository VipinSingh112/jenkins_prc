/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HSRAPaymentConfirmation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HSRAPaymentConfirmation
 * @generated
 */
public class HSRAPaymentConfirmationWrapper
	extends BaseModelWrapper<HSRAPaymentConfirmation>
	implements HSRAPaymentConfirmation, ModelWrapper<HSRAPaymentConfirmation> {

	public HSRAPaymentConfirmationWrapper(
		HSRAPaymentConfirmation hsraPaymentConfirmation) {

		super(hsraPaymentConfirmation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("hsraPaymentId", getHsraPaymentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("amountDue", getAmountDue());
		attributes.put("dateReceived", getDateReceived());
		attributes.put("amountreceived", getAmountreceived());
		attributes.put("receivedNumber", getReceivedNumber());
		attributes.put("comments", getComments());
		attributes.put("amountOutstanding", getAmountOutstanding());
		attributes.put("dueDate", getDueDate());
		attributes.put("status", getStatus());
		attributes.put(
			"paymentreceiptFileEntryId", getPaymentreceiptFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long hsraPaymentId = (Long)attributes.get("hsraPaymentId");

		if (hsraPaymentId != null) {
			setHsraPaymentId(hsraPaymentId);
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

		String amountDue = (String)attributes.get("amountDue");

		if (amountDue != null) {
			setAmountDue(amountDue);
		}

		Date dateReceived = (Date)attributes.get("dateReceived");

		if (dateReceived != null) {
			setDateReceived(dateReceived);
		}

		String amountreceived = (String)attributes.get("amountreceived");

		if (amountreceived != null) {
			setAmountreceived(amountreceived);
		}

		String receivedNumber = (String)attributes.get("receivedNumber");

		if (receivedNumber != null) {
			setReceivedNumber(receivedNumber);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
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

		Long paymentreceiptFileEntryId = (Long)attributes.get(
			"paymentreceiptFileEntryId");

		if (paymentreceiptFileEntryId != null) {
			setPaymentreceiptFileEntryId(paymentreceiptFileEntryId);
		}
	}

	@Override
	public HSRAPaymentConfirmation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount due of this hsra payment confirmation.
	 *
	 * @return the amount due of this hsra payment confirmation
	 */
	@Override
	public String getAmountDue() {
		return model.getAmountDue();
	}

	/**
	 * Returns the amount outstanding of this hsra payment confirmation.
	 *
	 * @return the amount outstanding of this hsra payment confirmation
	 */
	@Override
	public String getAmountOutstanding() {
		return model.getAmountOutstanding();
	}

	/**
	 * Returns the amountreceived of this hsra payment confirmation.
	 *
	 * @return the amountreceived of this hsra payment confirmation
	 */
	@Override
	public String getAmountreceived() {
		return model.getAmountreceived();
	}

	/**
	 * Returns the case ID of this hsra payment confirmation.
	 *
	 * @return the case ID of this hsra payment confirmation
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the comments of this hsra payment confirmation.
	 *
	 * @return the comments of this hsra payment confirmation
	 */
	@Override
	public String getComments() {
		return model.getComments();
	}

	/**
	 * Returns the company ID of this hsra payment confirmation.
	 *
	 * @return the company ID of this hsra payment confirmation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this hsra payment confirmation.
	 *
	 * @return the create date of this hsra payment confirmation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date received of this hsra payment confirmation.
	 *
	 * @return the date received of this hsra payment confirmation
	 */
	@Override
	public Date getDateReceived() {
		return model.getDateReceived();
	}

	/**
	 * Returns the due date of this hsra payment confirmation.
	 *
	 * @return the due date of this hsra payment confirmation
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the group ID of this hsra payment confirmation.
	 *
	 * @return the group ID of this hsra payment confirmation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra payment ID of this hsra payment confirmation.
	 *
	 * @return the hsra payment ID of this hsra payment confirmation
	 */
	@Override
	public long getHsraPaymentId() {
		return model.getHsraPaymentId();
	}

	/**
	 * Returns the modified date of this hsra payment confirmation.
	 *
	 * @return the modified date of this hsra payment confirmation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the paymentreceipt file entry ID of this hsra payment confirmation.
	 *
	 * @return the paymentreceipt file entry ID of this hsra payment confirmation
	 */
	@Override
	public long getPaymentreceiptFileEntryId() {
		return model.getPaymentreceiptFileEntryId();
	}

	/**
	 * Returns the primary key of this hsra payment confirmation.
	 *
	 * @return the primary key of this hsra payment confirmation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the received number of this hsra payment confirmation.
	 *
	 * @return the received number of this hsra payment confirmation
	 */
	@Override
	public String getReceivedNumber() {
		return model.getReceivedNumber();
	}

	/**
	 * Returns the status of this hsra payment confirmation.
	 *
	 * @return the status of this hsra payment confirmation
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this hsra payment confirmation.
	 *
	 * @return the user ID of this hsra payment confirmation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this hsra payment confirmation.
	 *
	 * @return the user name of this hsra payment confirmation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this hsra payment confirmation.
	 *
	 * @return the user uuid of this hsra payment confirmation
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
	 * Sets the amount due of this hsra payment confirmation.
	 *
	 * @param amountDue the amount due of this hsra payment confirmation
	 */
	@Override
	public void setAmountDue(String amountDue) {
		model.setAmountDue(amountDue);
	}

	/**
	 * Sets the amount outstanding of this hsra payment confirmation.
	 *
	 * @param amountOutstanding the amount outstanding of this hsra payment confirmation
	 */
	@Override
	public void setAmountOutstanding(String amountOutstanding) {
		model.setAmountOutstanding(amountOutstanding);
	}

	/**
	 * Sets the amountreceived of this hsra payment confirmation.
	 *
	 * @param amountreceived the amountreceived of this hsra payment confirmation
	 */
	@Override
	public void setAmountreceived(String amountreceived) {
		model.setAmountreceived(amountreceived);
	}

	/**
	 * Sets the case ID of this hsra payment confirmation.
	 *
	 * @param caseId the case ID of this hsra payment confirmation
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the comments of this hsra payment confirmation.
	 *
	 * @param comments the comments of this hsra payment confirmation
	 */
	@Override
	public void setComments(String comments) {
		model.setComments(comments);
	}

	/**
	 * Sets the company ID of this hsra payment confirmation.
	 *
	 * @param companyId the company ID of this hsra payment confirmation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this hsra payment confirmation.
	 *
	 * @param createDate the create date of this hsra payment confirmation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date received of this hsra payment confirmation.
	 *
	 * @param dateReceived the date received of this hsra payment confirmation
	 */
	@Override
	public void setDateReceived(Date dateReceived) {
		model.setDateReceived(dateReceived);
	}

	/**
	 * Sets the due date of this hsra payment confirmation.
	 *
	 * @param dueDate the due date of this hsra payment confirmation
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the group ID of this hsra payment confirmation.
	 *
	 * @param groupId the group ID of this hsra payment confirmation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra payment ID of this hsra payment confirmation.
	 *
	 * @param hsraPaymentId the hsra payment ID of this hsra payment confirmation
	 */
	@Override
	public void setHsraPaymentId(long hsraPaymentId) {
		model.setHsraPaymentId(hsraPaymentId);
	}

	/**
	 * Sets the modified date of this hsra payment confirmation.
	 *
	 * @param modifiedDate the modified date of this hsra payment confirmation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the paymentreceipt file entry ID of this hsra payment confirmation.
	 *
	 * @param paymentreceiptFileEntryId the paymentreceipt file entry ID of this hsra payment confirmation
	 */
	@Override
	public void setPaymentreceiptFileEntryId(long paymentreceiptFileEntryId) {
		model.setPaymentreceiptFileEntryId(paymentreceiptFileEntryId);
	}

	/**
	 * Sets the primary key of this hsra payment confirmation.
	 *
	 * @param primaryKey the primary key of this hsra payment confirmation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the received number of this hsra payment confirmation.
	 *
	 * @param receivedNumber the received number of this hsra payment confirmation
	 */
	@Override
	public void setReceivedNumber(String receivedNumber) {
		model.setReceivedNumber(receivedNumber);
	}

	/**
	 * Sets the status of this hsra payment confirmation.
	 *
	 * @param status the status of this hsra payment confirmation
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this hsra payment confirmation.
	 *
	 * @param userId the user ID of this hsra payment confirmation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this hsra payment confirmation.
	 *
	 * @param userName the user name of this hsra payment confirmation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this hsra payment confirmation.
	 *
	 * @param userUuid the user uuid of this hsra payment confirmation
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
	protected HSRAPaymentConfirmationWrapper wrap(
		HSRAPaymentConfirmation hsraPaymentConfirmation) {

		return new HSRAPaymentConfirmationWrapper(hsraPaymentConfirmation);
	}

}