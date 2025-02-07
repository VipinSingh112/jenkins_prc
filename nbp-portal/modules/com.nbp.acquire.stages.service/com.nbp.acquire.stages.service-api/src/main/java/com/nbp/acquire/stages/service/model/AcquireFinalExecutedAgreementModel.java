/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AcquireFinalExecutedAgreement service. Represents a row in the &quot;nbp_acquire_executed_agree&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreement
 * @generated
 */
@ProviderType
public interface AcquireFinalExecutedAgreementModel
	extends BaseModel<AcquireFinalExecutedAgreement>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a acquire final executed agreement model instance should use the {@link AcquireFinalExecutedAgreement} interface instead.
	 */

	/**
	 * Returns the primary key of this acquire final executed agreement.
	 *
	 * @return the primary key of this acquire final executed agreement
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this acquire final executed agreement.
	 *
	 * @param primaryKey the primary key of this acquire final executed agreement
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the acquirefinal ID of this acquire final executed agreement.
	 *
	 * @return the acquirefinal ID of this acquire final executed agreement
	 */
	public long getAcquirefinalId();

	/**
	 * Sets the acquirefinal ID of this acquire final executed agreement.
	 *
	 * @param acquirefinalId the acquirefinal ID of this acquire final executed agreement
	 */
	public void setAcquirefinalId(long acquirefinalId);

	/**
	 * Returns the group ID of this acquire final executed agreement.
	 *
	 * @return the group ID of this acquire final executed agreement
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this acquire final executed agreement.
	 *
	 * @param groupId the group ID of this acquire final executed agreement
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this acquire final executed agreement.
	 *
	 * @return the company ID of this acquire final executed agreement
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this acquire final executed agreement.
	 *
	 * @param companyId the company ID of this acquire final executed agreement
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this acquire final executed agreement.
	 *
	 * @return the user ID of this acquire final executed agreement
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this acquire final executed agreement.
	 *
	 * @param userId the user ID of this acquire final executed agreement
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this acquire final executed agreement.
	 *
	 * @return the user uuid of this acquire final executed agreement
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this acquire final executed agreement.
	 *
	 * @param userUuid the user uuid of this acquire final executed agreement
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this acquire final executed agreement.
	 *
	 * @return the user name of this acquire final executed agreement
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this acquire final executed agreement.
	 *
	 * @param userName the user name of this acquire final executed agreement
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this acquire final executed agreement.
	 *
	 * @return the create date of this acquire final executed agreement
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this acquire final executed agreement.
	 *
	 * @param createDate the create date of this acquire final executed agreement
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this acquire final executed agreement.
	 *
	 * @return the modified date of this acquire final executed agreement
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this acquire final executed agreement.
	 *
	 * @param modifiedDate the modified date of this acquire final executed agreement
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this acquire final executed agreement.
	 *
	 * @return the case ID of this acquire final executed agreement
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this acquire final executed agreement.
	 *
	 * @param caseId the case ID of this acquire final executed agreement
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the date contract executed of this acquire final executed agreement.
	 *
	 * @return the date contract executed of this acquire final executed agreement
	 */
	public Date getDateContractExecuted();

	/**
	 * Sets the date contract executed of this acquire final executed agreement.
	 *
	 * @param dateContractExecuted the date contract executed of this acquire final executed agreement
	 */
	public void setDateContractExecuted(Date dateContractExecuted);

	/**
	 * Returns the doc file entry ID of this acquire final executed agreement.
	 *
	 * @return the doc file entry ID of this acquire final executed agreement
	 */
	public long getDocFileEntryId();

	/**
	 * Sets the doc file entry ID of this acquire final executed agreement.
	 *
	 * @param docFileEntryId the doc file entry ID of this acquire final executed agreement
	 */
	public void setDocFileEntryId(long docFileEntryId);

	@Override
	public AcquireFinalExecutedAgreement cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}