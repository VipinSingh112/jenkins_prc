/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the OsiInsolvencyPaymentConfirmation service. Represents a row in the &quot;nbp_osi_inso_payment_con&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmation
 * @generated
 */
@ProviderType
public interface OsiInsolvencyPaymentConfirmationModel
	extends BaseModel<OsiInsolvencyPaymentConfirmation>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a osi insolvency payment confirmation model instance should use the {@link OsiInsolvencyPaymentConfirmation} interface instead.
	 */

	/**
	 * Returns the primary key of this osi insolvency payment confirmation.
	 *
	 * @return the primary key of this osi insolvency payment confirmation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this osi insolvency payment confirmation.
	 *
	 * @param primaryKey the primary key of this osi insolvency payment confirmation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the osi ir payment ID of this osi insolvency payment confirmation.
	 *
	 * @return the osi ir payment ID of this osi insolvency payment confirmation
	 */
	public long getOsiIRPaymentId();

	/**
	 * Sets the osi ir payment ID of this osi insolvency payment confirmation.
	 *
	 * @param osiIRPaymentId the osi ir payment ID of this osi insolvency payment confirmation
	 */
	public void setOsiIRPaymentId(long osiIRPaymentId);

	/**
	 * Returns the group ID of this osi insolvency payment confirmation.
	 *
	 * @return the group ID of this osi insolvency payment confirmation
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this osi insolvency payment confirmation.
	 *
	 * @param groupId the group ID of this osi insolvency payment confirmation
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this osi insolvency payment confirmation.
	 *
	 * @return the company ID of this osi insolvency payment confirmation
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this osi insolvency payment confirmation.
	 *
	 * @param companyId the company ID of this osi insolvency payment confirmation
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this osi insolvency payment confirmation.
	 *
	 * @return the user ID of this osi insolvency payment confirmation
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this osi insolvency payment confirmation.
	 *
	 * @param userId the user ID of this osi insolvency payment confirmation
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this osi insolvency payment confirmation.
	 *
	 * @return the user uuid of this osi insolvency payment confirmation
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this osi insolvency payment confirmation.
	 *
	 * @param userUuid the user uuid of this osi insolvency payment confirmation
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this osi insolvency payment confirmation.
	 *
	 * @return the user name of this osi insolvency payment confirmation
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this osi insolvency payment confirmation.
	 *
	 * @param userName the user name of this osi insolvency payment confirmation
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this osi insolvency payment confirmation.
	 *
	 * @return the create date of this osi insolvency payment confirmation
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this osi insolvency payment confirmation.
	 *
	 * @param createDate the create date of this osi insolvency payment confirmation
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this osi insolvency payment confirmation.
	 *
	 * @return the modified date of this osi insolvency payment confirmation
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this osi insolvency payment confirmation.
	 *
	 * @param modifiedDate the modified date of this osi insolvency payment confirmation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this osi insolvency payment confirmation.
	 *
	 * @return the case ID of this osi insolvency payment confirmation
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this osi insolvency payment confirmation.
	 *
	 * @param caseId the case ID of this osi insolvency payment confirmation
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the date received of this osi insolvency payment confirmation.
	 *
	 * @return the date received of this osi insolvency payment confirmation
	 */
	public Date getDateReceived();

	/**
	 * Sets the date received of this osi insolvency payment confirmation.
	 *
	 * @param dateReceived the date received of this osi insolvency payment confirmation
	 */
	public void setDateReceived(Date dateReceived);

	/**
	 * Returns the amount received of this osi insolvency payment confirmation.
	 *
	 * @return the amount received of this osi insolvency payment confirmation
	 */
	@AutoEscape
	public String getAmountReceived();

	/**
	 * Sets the amount received of this osi insolvency payment confirmation.
	 *
	 * @param amountReceived the amount received of this osi insolvency payment confirmation
	 */
	public void setAmountReceived(String amountReceived);

	/**
	 * Returns the amount due of this osi insolvency payment confirmation.
	 *
	 * @return the amount due of this osi insolvency payment confirmation
	 */
	@AutoEscape
	public String getAmountDue();

	/**
	 * Sets the amount due of this osi insolvency payment confirmation.
	 *
	 * @param amountDue the amount due of this osi insolvency payment confirmation
	 */
	public void setAmountDue(String amountDue);

	/**
	 * Returns the receipt number of this osi insolvency payment confirmation.
	 *
	 * @return the receipt number of this osi insolvency payment confirmation
	 */
	@AutoEscape
	public String getReceiptNumber();

	/**
	 * Sets the receipt number of this osi insolvency payment confirmation.
	 *
	 * @param receiptNumber the receipt number of this osi insolvency payment confirmation
	 */
	public void setReceiptNumber(String receiptNumber);

	/**
	 * Returns the comment of this osi insolvency payment confirmation.
	 *
	 * @return the comment of this osi insolvency payment confirmation
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this osi insolvency payment confirmation.
	 *
	 * @param comment the comment of this osi insolvency payment confirmation
	 */
	public void setComment(String comment);

	/**
	 * Returns the amount outstanding of this osi insolvency payment confirmation.
	 *
	 * @return the amount outstanding of this osi insolvency payment confirmation
	 */
	@AutoEscape
	public String getAmountOutstanding();

	/**
	 * Sets the amount outstanding of this osi insolvency payment confirmation.
	 *
	 * @param amountOutstanding the amount outstanding of this osi insolvency payment confirmation
	 */
	public void setAmountOutstanding(String amountOutstanding);

	/**
	 * Returns the due date of this osi insolvency payment confirmation.
	 *
	 * @return the due date of this osi insolvency payment confirmation
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this osi insolvency payment confirmation.
	 *
	 * @param dueDate the due date of this osi insolvency payment confirmation
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the status of this osi insolvency payment confirmation.
	 *
	 * @return the status of this osi insolvency payment confirmation
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this osi insolvency payment confirmation.
	 *
	 * @param status the status of this osi insolvency payment confirmation
	 */
	public void setStatus(String status);

	/**
	 * Returns the doc file entry of this osi insolvency payment confirmation.
	 *
	 * @return the doc file entry of this osi insolvency payment confirmation
	 */
	public long getDocFileEntry();

	/**
	 * Sets the doc file entry of this osi insolvency payment confirmation.
	 *
	 * @param docFileEntry the doc file entry of this osi insolvency payment confirmation
	 */
	public void setDocFileEntry(long docFileEntry);

	@Override
	public OsiInsolvencyPaymentConfirmation cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}