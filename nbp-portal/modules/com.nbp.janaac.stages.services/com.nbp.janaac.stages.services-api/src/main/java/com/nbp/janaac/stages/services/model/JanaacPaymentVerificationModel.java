/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the JanaacPaymentVerification service. Represents a row in the &quot;nbp_janaac_payment_verifi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacPaymentVerification
 * @generated
 */
@ProviderType
public interface JanaacPaymentVerificationModel
	extends BaseModel<JanaacPaymentVerification>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a janaac payment verification model instance should use the {@link JanaacPaymentVerification} interface instead.
	 */

	/**
	 * Returns the primary key of this janaac payment verification.
	 *
	 * @return the primary key of this janaac payment verification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this janaac payment verification.
	 *
	 * @param primaryKey the primary key of this janaac payment verification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the janaac payment verification ID of this janaac payment verification.
	 *
	 * @return the janaac payment verification ID of this janaac payment verification
	 */
	public long getJanaacPaymentVerificationId();

	/**
	 * Sets the janaac payment verification ID of this janaac payment verification.
	 *
	 * @param janaacPaymentVerificationId the janaac payment verification ID of this janaac payment verification
	 */
	public void setJanaacPaymentVerificationId(
		long janaacPaymentVerificationId);

	/**
	 * Returns the group ID of this janaac payment verification.
	 *
	 * @return the group ID of this janaac payment verification
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this janaac payment verification.
	 *
	 * @param groupId the group ID of this janaac payment verification
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this janaac payment verification.
	 *
	 * @return the company ID of this janaac payment verification
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this janaac payment verification.
	 *
	 * @param companyId the company ID of this janaac payment verification
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this janaac payment verification.
	 *
	 * @return the user ID of this janaac payment verification
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this janaac payment verification.
	 *
	 * @param userId the user ID of this janaac payment verification
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this janaac payment verification.
	 *
	 * @return the user uuid of this janaac payment verification
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this janaac payment verification.
	 *
	 * @param userUuid the user uuid of this janaac payment verification
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this janaac payment verification.
	 *
	 * @return the user name of this janaac payment verification
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this janaac payment verification.
	 *
	 * @param userName the user name of this janaac payment verification
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this janaac payment verification.
	 *
	 * @return the create date of this janaac payment verification
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this janaac payment verification.
	 *
	 * @param createDate the create date of this janaac payment verification
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this janaac payment verification.
	 *
	 * @return the modified date of this janaac payment verification
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this janaac payment verification.
	 *
	 * @param modifiedDate the modified date of this janaac payment verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this janaac payment verification.
	 *
	 * @return the case ID of this janaac payment verification
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this janaac payment verification.
	 *
	 * @param caseId the case ID of this janaac payment verification
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the date received of this janaac payment verification.
	 *
	 * @return the date received of this janaac payment verification
	 */
	public Date getDateReceived();

	/**
	 * Sets the date received of this janaac payment verification.
	 *
	 * @param dateReceived the date received of this janaac payment verification
	 */
	public void setDateReceived(Date dateReceived);

	/**
	 * Returns the amount received of this janaac payment verification.
	 *
	 * @return the amount received of this janaac payment verification
	 */
	@AutoEscape
	public String getAmountReceived();

	/**
	 * Sets the amount received of this janaac payment verification.
	 *
	 * @param amountReceived the amount received of this janaac payment verification
	 */
	public void setAmountReceived(String amountReceived);

	/**
	 * Returns the amount due of this janaac payment verification.
	 *
	 * @return the amount due of this janaac payment verification
	 */
	@AutoEscape
	public String getAmountDue();

	/**
	 * Sets the amount due of this janaac payment verification.
	 *
	 * @param amountDue the amount due of this janaac payment verification
	 */
	public void setAmountDue(String amountDue);

	/**
	 * Returns the receipt number of this janaac payment verification.
	 *
	 * @return the receipt number of this janaac payment verification
	 */
	@AutoEscape
	public String getReceiptNumber();

	/**
	 * Sets the receipt number of this janaac payment verification.
	 *
	 * @param receiptNumber the receipt number of this janaac payment verification
	 */
	public void setReceiptNumber(String receiptNumber);

	/**
	 * Returns the comment of this janaac payment verification.
	 *
	 * @return the comment of this janaac payment verification
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this janaac payment verification.
	 *
	 * @param comment the comment of this janaac payment verification
	 */
	public void setComment(String comment);

	/**
	 * Returns the amount outstanding of this janaac payment verification.
	 *
	 * @return the amount outstanding of this janaac payment verification
	 */
	@AutoEscape
	public String getAmountOutstanding();

	/**
	 * Sets the amount outstanding of this janaac payment verification.
	 *
	 * @param amountOutstanding the amount outstanding of this janaac payment verification
	 */
	public void setAmountOutstanding(String amountOutstanding);

	/**
	 * Returns the due date of this janaac payment verification.
	 *
	 * @return the due date of this janaac payment verification
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this janaac payment verification.
	 *
	 * @param dueDate the due date of this janaac payment verification
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the status of this janaac payment verification.
	 *
	 * @return the status of this janaac payment verification
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this janaac payment verification.
	 *
	 * @param status the status of this janaac payment verification
	 */
	public void setStatus(String status);

	/**
	 * Returns the doc file entry of this janaac payment verification.
	 *
	 * @return the doc file entry of this janaac payment verification
	 */
	public long getDocFileEntry();

	/**
	 * Sets the doc file entry of this janaac payment verification.
	 *
	 * @param docFileEntry the doc file entry of this janaac payment verification
	 */
	public void setDocFileEntry(long docFileEntry);

	@Override
	public JanaacPaymentVerification cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}