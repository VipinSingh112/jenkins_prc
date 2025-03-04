/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SezStatusBoardDecision service. Represents a row in the &quot;nbp_sez_status_board_deci&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecision
 * @generated
 */
@ProviderType
public interface SezStatusBoardDecisionModel
	extends BaseModel<SezStatusBoardDecision>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez status board decision model instance should use the {@link SezStatusBoardDecision} interface instead.
	 */

	/**
	 * Returns the primary key of this sez status board decision.
	 *
	 * @return the primary key of this sez status board decision
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez status board decision.
	 *
	 * @param primaryKey the primary key of this sez status board decision
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this sez status board decision.
	 *
	 * @return the uuid of this sez status board decision
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this sez status board decision.
	 *
	 * @param uuid the uuid of this sez status board decision
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the sez status board ID of this sez status board decision.
	 *
	 * @return the sez status board ID of this sez status board decision
	 */
	public long getSezStatusBoardId();

	/**
	 * Sets the sez status board ID of this sez status board decision.
	 *
	 * @param sezStatusBoardId the sez status board ID of this sez status board decision
	 */
	public void setSezStatusBoardId(long sezStatusBoardId);

	/**
	 * Returns the group ID of this sez status board decision.
	 *
	 * @return the group ID of this sez status board decision
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez status board decision.
	 *
	 * @param groupId the group ID of this sez status board decision
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez status board decision.
	 *
	 * @return the company ID of this sez status board decision
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez status board decision.
	 *
	 * @param companyId the company ID of this sez status board decision
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez status board decision.
	 *
	 * @return the user ID of this sez status board decision
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez status board decision.
	 *
	 * @param userId the user ID of this sez status board decision
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez status board decision.
	 *
	 * @return the user uuid of this sez status board decision
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez status board decision.
	 *
	 * @param userUuid the user uuid of this sez status board decision
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez status board decision.
	 *
	 * @return the user name of this sez status board decision
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez status board decision.
	 *
	 * @param userName the user name of this sez status board decision
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez status board decision.
	 *
	 * @return the create date of this sez status board decision
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez status board decision.
	 *
	 * @param createDate the create date of this sez status board decision
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez status board decision.
	 *
	 * @return the modified date of this sez status board decision
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez status board decision.
	 *
	 * @param modifiedDate the modified date of this sez status board decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this sez status board decision.
	 *
	 * @return the case ID of this sez status board decision
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this sez status board decision.
	 *
	 * @param caseId the case ID of this sez status board decision
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the board decision of this sez status board decision.
	 *
	 * @return the board decision of this sez status board decision
	 */
	@AutoEscape
	public String getBoardDecision();

	/**
	 * Sets the board decision of this sez status board decision.
	 *
	 * @param boardDecision the board decision of this sez status board decision
	 */
	public void setBoardDecision(String boardDecision);

	/**
	 * Returns the board decision date of this sez status board decision.
	 *
	 * @return the board decision date of this sez status board decision
	 */
	public Date getBoardDecisionDate();

	/**
	 * Sets the board decision date of this sez status board decision.
	 *
	 * @param boardDecisionDate the board decision date of this sez status board decision
	 */
	public void setBoardDecisionDate(Date boardDecisionDate);

	@Override
	public SezStatusBoardDecision cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}