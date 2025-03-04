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
 * The base model interface for the PharmaApplicationCommitteeDecision service. Represents a row in the &quot;nbp_pharma_comm_decision&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationCommitteeDecision
 * @generated
 */
@ProviderType
public interface PharmaApplicationCommitteeDecisionModel
	extends BaseModel<PharmaApplicationCommitteeDecision>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a pharma application committee decision model instance should use the {@link PharmaApplicationCommitteeDecision} interface instead.
	 */

	/**
	 * Returns the primary key of this pharma application committee decision.
	 *
	 * @return the primary key of this pharma application committee decision
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this pharma application committee decision.
	 *
	 * @param primaryKey the primary key of this pharma application committee decision
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the pharma committee decision ID of this pharma application committee decision.
	 *
	 * @return the pharma committee decision ID of this pharma application committee decision
	 */
	public long getPharmaCommitteeDecisionId();

	/**
	 * Sets the pharma committee decision ID of this pharma application committee decision.
	 *
	 * @param pharmaCommitteeDecisionId the pharma committee decision ID of this pharma application committee decision
	 */
	public void setPharmaCommitteeDecisionId(long pharmaCommitteeDecisionId);

	/**
	 * Returns the group ID of this pharma application committee decision.
	 *
	 * @return the group ID of this pharma application committee decision
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this pharma application committee decision.
	 *
	 * @param groupId the group ID of this pharma application committee decision
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this pharma application committee decision.
	 *
	 * @return the company ID of this pharma application committee decision
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this pharma application committee decision.
	 *
	 * @param companyId the company ID of this pharma application committee decision
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this pharma application committee decision.
	 *
	 * @return the user ID of this pharma application committee decision
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this pharma application committee decision.
	 *
	 * @param userId the user ID of this pharma application committee decision
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this pharma application committee decision.
	 *
	 * @return the user uuid of this pharma application committee decision
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this pharma application committee decision.
	 *
	 * @param userUuid the user uuid of this pharma application committee decision
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this pharma application committee decision.
	 *
	 * @return the user name of this pharma application committee decision
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this pharma application committee decision.
	 *
	 * @param userName the user name of this pharma application committee decision
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this pharma application committee decision.
	 *
	 * @return the create date of this pharma application committee decision
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this pharma application committee decision.
	 *
	 * @param createDate the create date of this pharma application committee decision
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this pharma application committee decision.
	 *
	 * @return the modified date of this pharma application committee decision
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this pharma application committee decision.
	 *
	 * @param modifiedDate the modified date of this pharma application committee decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the date of committee decision of this pharma application committee decision.
	 *
	 * @return the date of committee decision of this pharma application committee decision
	 */
	public Date getDateOfCommitteeDecision();

	/**
	 * Sets the date of committee decision of this pharma application committee decision.
	 *
	 * @param dateOfCommitteeDecision the date of committee decision of this pharma application committee decision
	 */
	public void setDateOfCommitteeDecision(Date dateOfCommitteeDecision);

	/**
	 * Returns the committee decision of this pharma application committee decision.
	 *
	 * @return the committee decision of this pharma application committee decision
	 */
	@AutoEscape
	public String getCommitteeDecision();

	/**
	 * Sets the committee decision of this pharma application committee decision.
	 *
	 * @param committeeDecision the committee decision of this pharma application committee decision
	 */
	public void setCommitteeDecision(String committeeDecision);

	/**
	 * Returns the case ID of this pharma application committee decision.
	 *
	 * @return the case ID of this pharma application committee decision
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this pharma application committee decision.
	 *
	 * @param caseId the case ID of this pharma application committee decision
	 */
	public void setCaseId(String caseId);

	@Override
	public PharmaApplicationCommitteeDecision cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}