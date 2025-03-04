/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ExplosiveReviewAndVerification service. Represents a row in the &quot;nbp_explosive_rev_ver&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerification
 * @generated
 */
@ProviderType
public interface ExplosiveReviewAndVerificationModel
	extends BaseModel<ExplosiveReviewAndVerification>, GroupedModel,
			ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a explosive review and verification model instance should use the {@link ExplosiveReviewAndVerification} interface instead.
	 */

	/**
	 * Returns the primary key of this explosive review and verification.
	 *
	 * @return the primary key of this explosive review and verification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this explosive review and verification.
	 *
	 * @param primaryKey the primary key of this explosive review and verification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this explosive review and verification.
	 *
	 * @return the uuid of this explosive review and verification
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this explosive review and verification.
	 *
	 * @param uuid the uuid of this explosive review and verification
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the issuance ID of this explosive review and verification.
	 *
	 * @return the issuance ID of this explosive review and verification
	 */
	public long getIssuanceId();

	/**
	 * Sets the issuance ID of this explosive review and verification.
	 *
	 * @param issuanceId the issuance ID of this explosive review and verification
	 */
	public void setIssuanceId(long issuanceId);

	/**
	 * Returns the group ID of this explosive review and verification.
	 *
	 * @return the group ID of this explosive review and verification
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this explosive review and verification.
	 *
	 * @param groupId the group ID of this explosive review and verification
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this explosive review and verification.
	 *
	 * @return the company ID of this explosive review and verification
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this explosive review and verification.
	 *
	 * @param companyId the company ID of this explosive review and verification
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this explosive review and verification.
	 *
	 * @return the user ID of this explosive review and verification
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this explosive review and verification.
	 *
	 * @param userId the user ID of this explosive review and verification
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this explosive review and verification.
	 *
	 * @return the user uuid of this explosive review and verification
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this explosive review and verification.
	 *
	 * @param userUuid the user uuid of this explosive review and verification
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this explosive review and verification.
	 *
	 * @return the user name of this explosive review and verification
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this explosive review and verification.
	 *
	 * @param userName the user name of this explosive review and verification
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this explosive review and verification.
	 *
	 * @return the create date of this explosive review and verification
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this explosive review and verification.
	 *
	 * @param createDate the create date of this explosive review and verification
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this explosive review and verification.
	 *
	 * @return the modified date of this explosive review and verification
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this explosive review and verification.
	 *
	 * @param modifiedDate the modified date of this explosive review and verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this explosive review and verification.
	 *
	 * @return the case ID of this explosive review and verification
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this explosive review and verification.
	 *
	 * @param caseId the case ID of this explosive review and verification
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the amount due of this explosive review and verification.
	 *
	 * @return the amount due of this explosive review and verification
	 */
	@AutoEscape
	public String getAmountDue();

	/**
	 * Sets the amount due of this explosive review and verification.
	 *
	 * @param amountDue the amount due of this explosive review and verification
	 */
	public void setAmountDue(String amountDue);

	/**
	 * Returns the date received of this explosive review and verification.
	 *
	 * @return the date received of this explosive review and verification
	 */
	public Date getDateReceived();

	/**
	 * Sets the date received of this explosive review and verification.
	 *
	 * @param dateReceived the date received of this explosive review and verification
	 */
	public void setDateReceived(Date dateReceived);

	/**
	 * Returns the amountreceived of this explosive review and verification.
	 *
	 * @return the amountreceived of this explosive review and verification
	 */
	@AutoEscape
	public String getAmountreceived();

	/**
	 * Sets the amountreceived of this explosive review and verification.
	 *
	 * @param amountreceived the amountreceived of this explosive review and verification
	 */
	public void setAmountreceived(String amountreceived);

	/**
	 * Returns the received number of this explosive review and verification.
	 *
	 * @return the received number of this explosive review and verification
	 */
	@AutoEscape
	public String getReceivedNumber();

	/**
	 * Sets the received number of this explosive review and verification.
	 *
	 * @param receivedNumber the received number of this explosive review and verification
	 */
	public void setReceivedNumber(String receivedNumber);

	/**
	 * Returns the comments of this explosive review and verification.
	 *
	 * @return the comments of this explosive review and verification
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this explosive review and verification.
	 *
	 * @param comments the comments of this explosive review and verification
	 */
	public void setComments(String comments);

	/**
	 * Returns the amount outstanding of this explosive review and verification.
	 *
	 * @return the amount outstanding of this explosive review and verification
	 */
	@AutoEscape
	public String getAmountOutstanding();

	/**
	 * Sets the amount outstanding of this explosive review and verification.
	 *
	 * @param amountOutstanding the amount outstanding of this explosive review and verification
	 */
	public void setAmountOutstanding(String amountOutstanding);

	/**
	 * Returns the due date of this explosive review and verification.
	 *
	 * @return the due date of this explosive review and verification
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this explosive review and verification.
	 *
	 * @param dueDate the due date of this explosive review and verification
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the status of this explosive review and verification.
	 *
	 * @return the status of this explosive review and verification
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this explosive review and verification.
	 *
	 * @param status the status of this explosive review and verification
	 */
	public void setStatus(String status);

	/**
	 * Returns the paymentreceipt file entry ID of this explosive review and verification.
	 *
	 * @return the paymentreceipt file entry ID of this explosive review and verification
	 */
	public long getPaymentreceiptFileEntryId();

	/**
	 * Sets the paymentreceipt file entry ID of this explosive review and verification.
	 *
	 * @param paymentreceiptFileEntryId the paymentreceipt file entry ID of this explosive review and verification
	 */
	public void setPaymentreceiptFileEntryId(long paymentreceiptFileEntryId);

	@Override
	public ExplosiveReviewAndVerification cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}