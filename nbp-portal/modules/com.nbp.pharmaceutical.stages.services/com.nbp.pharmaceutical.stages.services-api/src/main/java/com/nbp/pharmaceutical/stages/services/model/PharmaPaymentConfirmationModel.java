/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PharmaPaymentConfirmation service. Represents a row in the &quot;nbp_pharma_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaPaymentConfirmationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaPaymentConfirmationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaPaymentConfirmation
 * @generated
 */
@ProviderType
public interface PharmaPaymentConfirmationModel
	extends BaseModel<PharmaPaymentConfirmation>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a pharma payment confirmation model instance should use the {@link PharmaPaymentConfirmation} interface instead.
	 */

	/**
	 * Returns the primary key of this pharma payment confirmation.
	 *
	 * @return the primary key of this pharma payment confirmation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this pharma payment confirmation.
	 *
	 * @param primaryKey the primary key of this pharma payment confirmation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the pharma payment ID of this pharma payment confirmation.
	 *
	 * @return the pharma payment ID of this pharma payment confirmation
	 */
	public long getPharmaPaymentId();

	/**
	 * Sets the pharma payment ID of this pharma payment confirmation.
	 *
	 * @param pharmaPaymentId the pharma payment ID of this pharma payment confirmation
	 */
	public void setPharmaPaymentId(long pharmaPaymentId);

	/**
	 * Returns the group ID of this pharma payment confirmation.
	 *
	 * @return the group ID of this pharma payment confirmation
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this pharma payment confirmation.
	 *
	 * @param groupId the group ID of this pharma payment confirmation
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this pharma payment confirmation.
	 *
	 * @return the company ID of this pharma payment confirmation
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this pharma payment confirmation.
	 *
	 * @param companyId the company ID of this pharma payment confirmation
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this pharma payment confirmation.
	 *
	 * @return the user ID of this pharma payment confirmation
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this pharma payment confirmation.
	 *
	 * @param userId the user ID of this pharma payment confirmation
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this pharma payment confirmation.
	 *
	 * @return the user uuid of this pharma payment confirmation
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this pharma payment confirmation.
	 *
	 * @param userUuid the user uuid of this pharma payment confirmation
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this pharma payment confirmation.
	 *
	 * @return the user name of this pharma payment confirmation
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this pharma payment confirmation.
	 *
	 * @param userName the user name of this pharma payment confirmation
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this pharma payment confirmation.
	 *
	 * @return the create date of this pharma payment confirmation
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this pharma payment confirmation.
	 *
	 * @param createDate the create date of this pharma payment confirmation
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this pharma payment confirmation.
	 *
	 * @return the modified date of this pharma payment confirmation
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this pharma payment confirmation.
	 *
	 * @param modifiedDate the modified date of this pharma payment confirmation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this pharma payment confirmation.
	 *
	 * @return the case ID of this pharma payment confirmation
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this pharma payment confirmation.
	 *
	 * @param caseId the case ID of this pharma payment confirmation
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the amount due of this pharma payment confirmation.
	 *
	 * @return the amount due of this pharma payment confirmation
	 */
	@AutoEscape
	public String getAmountDue();

	/**
	 * Sets the amount due of this pharma payment confirmation.
	 *
	 * @param amountDue the amount due of this pharma payment confirmation
	 */
	public void setAmountDue(String amountDue);

	/**
	 * Returns the date received of this pharma payment confirmation.
	 *
	 * @return the date received of this pharma payment confirmation
	 */
	public Date getDateReceived();

	/**
	 * Sets the date received of this pharma payment confirmation.
	 *
	 * @param dateReceived the date received of this pharma payment confirmation
	 */
	public void setDateReceived(Date dateReceived);

	/**
	 * Returns the amountreceived of this pharma payment confirmation.
	 *
	 * @return the amountreceived of this pharma payment confirmation
	 */
	@AutoEscape
	public String getAmountreceived();

	/**
	 * Sets the amountreceived of this pharma payment confirmation.
	 *
	 * @param amountreceived the amountreceived of this pharma payment confirmation
	 */
	public void setAmountreceived(String amountreceived);

	/**
	 * Returns the received number of this pharma payment confirmation.
	 *
	 * @return the received number of this pharma payment confirmation
	 */
	@AutoEscape
	public String getReceivedNumber();

	/**
	 * Sets the received number of this pharma payment confirmation.
	 *
	 * @param receivedNumber the received number of this pharma payment confirmation
	 */
	public void setReceivedNumber(String receivedNumber);

	/**
	 * Returns the comments of this pharma payment confirmation.
	 *
	 * @return the comments of this pharma payment confirmation
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this pharma payment confirmation.
	 *
	 * @param comments the comments of this pharma payment confirmation
	 */
	public void setComments(String comments);

	/**
	 * Returns the amount outstanding of this pharma payment confirmation.
	 *
	 * @return the amount outstanding of this pharma payment confirmation
	 */
	@AutoEscape
	public String getAmountOutstanding();

	/**
	 * Sets the amount outstanding of this pharma payment confirmation.
	 *
	 * @param amountOutstanding the amount outstanding of this pharma payment confirmation
	 */
	public void setAmountOutstanding(String amountOutstanding);

	/**
	 * Returns the due date of this pharma payment confirmation.
	 *
	 * @return the due date of this pharma payment confirmation
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this pharma payment confirmation.
	 *
	 * @param dueDate the due date of this pharma payment confirmation
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the status of this pharma payment confirmation.
	 *
	 * @return the status of this pharma payment confirmation
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this pharma payment confirmation.
	 *
	 * @param status the status of this pharma payment confirmation
	 */
	public void setStatus(String status);

	/**
	 * Returns the paymentreceipt file entry ID of this pharma payment confirmation.
	 *
	 * @return the paymentreceipt file entry ID of this pharma payment confirmation
	 */
	public long getPaymentreceiptFileEntryId();

	/**
	 * Sets the paymentreceipt file entry ID of this pharma payment confirmation.
	 *
	 * @param paymentreceiptFileEntryId the paymentreceipt file entry ID of this pharma payment confirmation
	 */
	public void setPaymentreceiptFileEntryId(long paymentreceiptFileEntryId);

	@Override
	public PharmaPaymentConfirmation cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}