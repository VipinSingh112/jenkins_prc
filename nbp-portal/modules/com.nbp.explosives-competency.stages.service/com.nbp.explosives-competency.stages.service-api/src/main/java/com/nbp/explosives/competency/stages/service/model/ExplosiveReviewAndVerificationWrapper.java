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
 * This class is a wrapper for {@link ExplosiveReviewAndVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerification
 * @generated
 */
public class ExplosiveReviewAndVerificationWrapper
	extends BaseModelWrapper<ExplosiveReviewAndVerification>
	implements ExplosiveReviewAndVerification,
			   ModelWrapper<ExplosiveReviewAndVerification> {

	public ExplosiveReviewAndVerificationWrapper(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		super(explosiveReviewAndVerification);
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
	public ExplosiveReviewAndVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount due of this explosive review and verification.
	 *
	 * @return the amount due of this explosive review and verification
	 */
	@Override
	public String getAmountDue() {
		return model.getAmountDue();
	}

	/**
	 * Returns the amount outstanding of this explosive review and verification.
	 *
	 * @return the amount outstanding of this explosive review and verification
	 */
	@Override
	public String getAmountOutstanding() {
		return model.getAmountOutstanding();
	}

	/**
	 * Returns the amountreceived of this explosive review and verification.
	 *
	 * @return the amountreceived of this explosive review and verification
	 */
	@Override
	public String getAmountreceived() {
		return model.getAmountreceived();
	}

	/**
	 * Returns the case ID of this explosive review and verification.
	 *
	 * @return the case ID of this explosive review and verification
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the comments of this explosive review and verification.
	 *
	 * @return the comments of this explosive review and verification
	 */
	@Override
	public String getComments() {
		return model.getComments();
	}

	/**
	 * Returns the company ID of this explosive review and verification.
	 *
	 * @return the company ID of this explosive review and verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this explosive review and verification.
	 *
	 * @return the create date of this explosive review and verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date received of this explosive review and verification.
	 *
	 * @return the date received of this explosive review and verification
	 */
	@Override
	public Date getDateReceived() {
		return model.getDateReceived();
	}

	/**
	 * Returns the due date of this explosive review and verification.
	 *
	 * @return the due date of this explosive review and verification
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the group ID of this explosive review and verification.
	 *
	 * @return the group ID of this explosive review and verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issuance ID of this explosive review and verification.
	 *
	 * @return the issuance ID of this explosive review and verification
	 */
	@Override
	public long getIssuanceId() {
		return model.getIssuanceId();
	}

	/**
	 * Returns the modified date of this explosive review and verification.
	 *
	 * @return the modified date of this explosive review and verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the paymentreceipt file entry ID of this explosive review and verification.
	 *
	 * @return the paymentreceipt file entry ID of this explosive review and verification
	 */
	@Override
	public long getPaymentreceiptFileEntryId() {
		return model.getPaymentreceiptFileEntryId();
	}

	/**
	 * Returns the primary key of this explosive review and verification.
	 *
	 * @return the primary key of this explosive review and verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the received number of this explosive review and verification.
	 *
	 * @return the received number of this explosive review and verification
	 */
	@Override
	public String getReceivedNumber() {
		return model.getReceivedNumber();
	}

	/**
	 * Returns the status of this explosive review and verification.
	 *
	 * @return the status of this explosive review and verification
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this explosive review and verification.
	 *
	 * @return the user ID of this explosive review and verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this explosive review and verification.
	 *
	 * @return the user name of this explosive review and verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this explosive review and verification.
	 *
	 * @return the user uuid of this explosive review and verification
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this explosive review and verification.
	 *
	 * @return the uuid of this explosive review and verification
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
	 * Sets the amount due of this explosive review and verification.
	 *
	 * @param amountDue the amount due of this explosive review and verification
	 */
	@Override
	public void setAmountDue(String amountDue) {
		model.setAmountDue(amountDue);
	}

	/**
	 * Sets the amount outstanding of this explosive review and verification.
	 *
	 * @param amountOutstanding the amount outstanding of this explosive review and verification
	 */
	@Override
	public void setAmountOutstanding(String amountOutstanding) {
		model.setAmountOutstanding(amountOutstanding);
	}

	/**
	 * Sets the amountreceived of this explosive review and verification.
	 *
	 * @param amountreceived the amountreceived of this explosive review and verification
	 */
	@Override
	public void setAmountreceived(String amountreceived) {
		model.setAmountreceived(amountreceived);
	}

	/**
	 * Sets the case ID of this explosive review and verification.
	 *
	 * @param caseId the case ID of this explosive review and verification
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the comments of this explosive review and verification.
	 *
	 * @param comments the comments of this explosive review and verification
	 */
	@Override
	public void setComments(String comments) {
		model.setComments(comments);
	}

	/**
	 * Sets the company ID of this explosive review and verification.
	 *
	 * @param companyId the company ID of this explosive review and verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this explosive review and verification.
	 *
	 * @param createDate the create date of this explosive review and verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date received of this explosive review and verification.
	 *
	 * @param dateReceived the date received of this explosive review and verification
	 */
	@Override
	public void setDateReceived(Date dateReceived) {
		model.setDateReceived(dateReceived);
	}

	/**
	 * Sets the due date of this explosive review and verification.
	 *
	 * @param dueDate the due date of this explosive review and verification
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the group ID of this explosive review and verification.
	 *
	 * @param groupId the group ID of this explosive review and verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issuance ID of this explosive review and verification.
	 *
	 * @param issuanceId the issuance ID of this explosive review and verification
	 */
	@Override
	public void setIssuanceId(long issuanceId) {
		model.setIssuanceId(issuanceId);
	}

	/**
	 * Sets the modified date of this explosive review and verification.
	 *
	 * @param modifiedDate the modified date of this explosive review and verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the paymentreceipt file entry ID of this explosive review and verification.
	 *
	 * @param paymentreceiptFileEntryId the paymentreceipt file entry ID of this explosive review and verification
	 */
	@Override
	public void setPaymentreceiptFileEntryId(long paymentreceiptFileEntryId) {
		model.setPaymentreceiptFileEntryId(paymentreceiptFileEntryId);
	}

	/**
	 * Sets the primary key of this explosive review and verification.
	 *
	 * @param primaryKey the primary key of this explosive review and verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the received number of this explosive review and verification.
	 *
	 * @param receivedNumber the received number of this explosive review and verification
	 */
	@Override
	public void setReceivedNumber(String receivedNumber) {
		model.setReceivedNumber(receivedNumber);
	}

	/**
	 * Sets the status of this explosive review and verification.
	 *
	 * @param status the status of this explosive review and verification
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this explosive review and verification.
	 *
	 * @param userId the user ID of this explosive review and verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this explosive review and verification.
	 *
	 * @param userName the user name of this explosive review and verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this explosive review and verification.
	 *
	 * @param userUuid the user uuid of this explosive review and verification
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this explosive review and verification.
	 *
	 * @param uuid the uuid of this explosive review and verification
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
	protected ExplosiveReviewAndVerificationWrapper wrap(
		ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return new ExplosiveReviewAndVerificationWrapper(
			explosiveReviewAndVerification);
	}

}