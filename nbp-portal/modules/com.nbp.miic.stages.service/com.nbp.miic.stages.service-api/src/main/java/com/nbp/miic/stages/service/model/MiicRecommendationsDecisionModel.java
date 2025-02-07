/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the MiicRecommendationsDecision service. Represents a row in the &quot;nbp_miic_recommen_decision&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicRecommendationsDecision
 * @generated
 */
@ProviderType
public interface MiicRecommendationsDecisionModel
	extends BaseModel<MiicRecommendationsDecision>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a miic recommendations decision model instance should use the {@link MiicRecommendationsDecision} interface instead.
	 */

	/**
	 * Returns the primary key of this miic recommendations decision.
	 *
	 * @return the primary key of this miic recommendations decision
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this miic recommendations decision.
	 *
	 * @param primaryKey the primary key of this miic recommendations decision
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the miic recommendations decision ID of this miic recommendations decision.
	 *
	 * @return the miic recommendations decision ID of this miic recommendations decision
	 */
	public long getMiicRecommendationsDecisionId();

	/**
	 * Sets the miic recommendations decision ID of this miic recommendations decision.
	 *
	 * @param miicRecommendationsDecisionId the miic recommendations decision ID of this miic recommendations decision
	 */
	public void setMiicRecommendationsDecisionId(
		long miicRecommendationsDecisionId);

	/**
	 * Returns the group ID of this miic recommendations decision.
	 *
	 * @return the group ID of this miic recommendations decision
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this miic recommendations decision.
	 *
	 * @param groupId the group ID of this miic recommendations decision
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this miic recommendations decision.
	 *
	 * @return the company ID of this miic recommendations decision
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this miic recommendations decision.
	 *
	 * @param companyId the company ID of this miic recommendations decision
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this miic recommendations decision.
	 *
	 * @return the user ID of this miic recommendations decision
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this miic recommendations decision.
	 *
	 * @param userId the user ID of this miic recommendations decision
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this miic recommendations decision.
	 *
	 * @return the user uuid of this miic recommendations decision
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this miic recommendations decision.
	 *
	 * @param userUuid the user uuid of this miic recommendations decision
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this miic recommendations decision.
	 *
	 * @return the user name of this miic recommendations decision
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this miic recommendations decision.
	 *
	 * @param userName the user name of this miic recommendations decision
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this miic recommendations decision.
	 *
	 * @return the create date of this miic recommendations decision
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this miic recommendations decision.
	 *
	 * @param createDate the create date of this miic recommendations decision
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this miic recommendations decision.
	 *
	 * @return the modified date of this miic recommendations decision
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this miic recommendations decision.
	 *
	 * @param modifiedDate the modified date of this miic recommendations decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the date of recommendations decision of this miic recommendations decision.
	 *
	 * @return the date of recommendations decision of this miic recommendations decision
	 */
	public Date getDateOfRecommendationsDecision();

	/**
	 * Sets the date of recommendations decision of this miic recommendations decision.
	 *
	 * @param dateOfRecommendationsDecision the date of recommendations decision of this miic recommendations decision
	 */
	public void setDateOfRecommendationsDecision(
		Date dateOfRecommendationsDecision);

	/**
	 * Returns the recommendations decision of this miic recommendations decision.
	 *
	 * @return the recommendations decision of this miic recommendations decision
	 */
	@AutoEscape
	public String getRecommendationsDecision();

	/**
	 * Sets the recommendations decision of this miic recommendations decision.
	 *
	 * @param recommendationsDecision the recommendations decision of this miic recommendations decision
	 */
	public void setRecommendationsDecision(String recommendationsDecision);

	/**
	 * Returns the case ID of this miic recommendations decision.
	 *
	 * @return the case ID of this miic recommendations decision
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this miic recommendations decision.
	 *
	 * @param caseId the case ID of this miic recommendations decision
	 */
	public void setCaseId(String caseId);

	@Override
	public MiicRecommendationsDecision cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}