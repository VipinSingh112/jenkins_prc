/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismPaymentConfirmation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismPaymentConfirmation
 * @generated
 */
public class TourismPaymentConfirmationWrapper
	extends BaseModelWrapper<TourismPaymentConfirmation>
	implements ModelWrapper<TourismPaymentConfirmation>,
			   TourismPaymentConfirmation {

	public TourismPaymentConfirmationWrapper(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		super(tourismPaymentConfirmation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismPaymentId", getTourismPaymentId());
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
		Long tourismPaymentId = (Long)attributes.get("tourismPaymentId");

		if (tourismPaymentId != null) {
			setTourismPaymentId(tourismPaymentId);
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
	public TourismPaymentConfirmation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount due of this tourism payment confirmation.
	 *
	 * @return the amount due of this tourism payment confirmation
	 */
	@Override
	public String getAmountDue() {
		return model.getAmountDue();
	}

	/**
	 * Returns the amount outstanding of this tourism payment confirmation.
	 *
	 * @return the amount outstanding of this tourism payment confirmation
	 */
	@Override
	public String getAmountOutstanding() {
		return model.getAmountOutstanding();
	}

	/**
	 * Returns the amount received of this tourism payment confirmation.
	 *
	 * @return the amount received of this tourism payment confirmation
	 */
	@Override
	public String getAmountReceived() {
		return model.getAmountReceived();
	}

	/**
	 * Returns the case ID of this tourism payment confirmation.
	 *
	 * @return the case ID of this tourism payment confirmation
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the comment of this tourism payment confirmation.
	 *
	 * @return the comment of this tourism payment confirmation
	 */
	@Override
	public String getComment() {
		return model.getComment();
	}

	/**
	 * Returns the company ID of this tourism payment confirmation.
	 *
	 * @return the company ID of this tourism payment confirmation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism payment confirmation.
	 *
	 * @return the create date of this tourism payment confirmation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date received of this tourism payment confirmation.
	 *
	 * @return the date received of this tourism payment confirmation
	 */
	@Override
	public Date getDateReceived() {
		return model.getDateReceived();
	}

	/**
	 * Returns the doc file entry of this tourism payment confirmation.
	 *
	 * @return the doc file entry of this tourism payment confirmation
	 */
	@Override
	public long getDocFileEntry() {
		return model.getDocFileEntry();
	}

	/**
	 * Returns the due date of this tourism payment confirmation.
	 *
	 * @return the due date of this tourism payment confirmation
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the group ID of this tourism payment confirmation.
	 *
	 * @return the group ID of this tourism payment confirmation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism payment confirmation.
	 *
	 * @return the modified date of this tourism payment confirmation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism payment confirmation.
	 *
	 * @return the primary key of this tourism payment confirmation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the receipt number of this tourism payment confirmation.
	 *
	 * @return the receipt number of this tourism payment confirmation
	 */
	@Override
	public String getReceiptNumber() {
		return model.getReceiptNumber();
	}

	/**
	 * Returns the status of this tourism payment confirmation.
	 *
	 * @return the status of this tourism payment confirmation
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the tourism payment ID of this tourism payment confirmation.
	 *
	 * @return the tourism payment ID of this tourism payment confirmation
	 */
	@Override
	public long getTourismPaymentId() {
		return model.getTourismPaymentId();
	}

	/**
	 * Returns the user ID of this tourism payment confirmation.
	 *
	 * @return the user ID of this tourism payment confirmation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism payment confirmation.
	 *
	 * @return the user name of this tourism payment confirmation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism payment confirmation.
	 *
	 * @return the user uuid of this tourism payment confirmation
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
	 * Sets the amount due of this tourism payment confirmation.
	 *
	 * @param amountDue the amount due of this tourism payment confirmation
	 */
	@Override
	public void setAmountDue(String amountDue) {
		model.setAmountDue(amountDue);
	}

	/**
	 * Sets the amount outstanding of this tourism payment confirmation.
	 *
	 * @param amountOutstanding the amount outstanding of this tourism payment confirmation
	 */
	@Override
	public void setAmountOutstanding(String amountOutstanding) {
		model.setAmountOutstanding(amountOutstanding);
	}

	/**
	 * Sets the amount received of this tourism payment confirmation.
	 *
	 * @param amountReceived the amount received of this tourism payment confirmation
	 */
	@Override
	public void setAmountReceived(String amountReceived) {
		model.setAmountReceived(amountReceived);
	}

	/**
	 * Sets the case ID of this tourism payment confirmation.
	 *
	 * @param caseId the case ID of this tourism payment confirmation
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the comment of this tourism payment confirmation.
	 *
	 * @param comment the comment of this tourism payment confirmation
	 */
	@Override
	public void setComment(String comment) {
		model.setComment(comment);
	}

	/**
	 * Sets the company ID of this tourism payment confirmation.
	 *
	 * @param companyId the company ID of this tourism payment confirmation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism payment confirmation.
	 *
	 * @param createDate the create date of this tourism payment confirmation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date received of this tourism payment confirmation.
	 *
	 * @param dateReceived the date received of this tourism payment confirmation
	 */
	@Override
	public void setDateReceived(Date dateReceived) {
		model.setDateReceived(dateReceived);
	}

	/**
	 * Sets the doc file entry of this tourism payment confirmation.
	 *
	 * @param docFileEntry the doc file entry of this tourism payment confirmation
	 */
	@Override
	public void setDocFileEntry(long docFileEntry) {
		model.setDocFileEntry(docFileEntry);
	}

	/**
	 * Sets the due date of this tourism payment confirmation.
	 *
	 * @param dueDate the due date of this tourism payment confirmation
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the group ID of this tourism payment confirmation.
	 *
	 * @param groupId the group ID of this tourism payment confirmation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism payment confirmation.
	 *
	 * @param modifiedDate the modified date of this tourism payment confirmation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism payment confirmation.
	 *
	 * @param primaryKey the primary key of this tourism payment confirmation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the receipt number of this tourism payment confirmation.
	 *
	 * @param receiptNumber the receipt number of this tourism payment confirmation
	 */
	@Override
	public void setReceiptNumber(String receiptNumber) {
		model.setReceiptNumber(receiptNumber);
	}

	/**
	 * Sets the status of this tourism payment confirmation.
	 *
	 * @param status the status of this tourism payment confirmation
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the tourism payment ID of this tourism payment confirmation.
	 *
	 * @param tourismPaymentId the tourism payment ID of this tourism payment confirmation
	 */
	@Override
	public void setTourismPaymentId(long tourismPaymentId) {
		model.setTourismPaymentId(tourismPaymentId);
	}

	/**
	 * Sets the user ID of this tourism payment confirmation.
	 *
	 * @param userId the user ID of this tourism payment confirmation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism payment confirmation.
	 *
	 * @param userName the user name of this tourism payment confirmation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism payment confirmation.
	 *
	 * @param userUuid the user uuid of this tourism payment confirmation
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
	protected TourismPaymentConfirmationWrapper wrap(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		return new TourismPaymentConfirmationWrapper(
			tourismPaymentConfirmation);
	}

}