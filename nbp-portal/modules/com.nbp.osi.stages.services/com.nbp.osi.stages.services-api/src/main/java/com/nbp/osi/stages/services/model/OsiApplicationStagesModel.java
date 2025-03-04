/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the OsiApplicationStages service. Represents a row in the &quot;nbp_osi_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.stages.services.model.impl.OsiApplicationStagesModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.stages.services.model.impl.OsiApplicationStagesImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationStages
 * @generated
 */
@ProviderType
public interface OsiApplicationStagesModel
	extends BaseModel<OsiApplicationStages>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a osi application stages model instance should use the {@link OsiApplicationStages} interface instead.
	 */

	/**
	 * Returns the primary key of this osi application stages.
	 *
	 * @return the primary key of this osi application stages
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this osi application stages.
	 *
	 * @param primaryKey the primary key of this osi application stages
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this osi application stages.
	 *
	 * @return the uuid of this osi application stages
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this osi application stages.
	 *
	 * @param uuid the uuid of this osi application stages
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the osi application stages ID of this osi application stages.
	 *
	 * @return the osi application stages ID of this osi application stages
	 */
	public long getOsiApplicationStagesId();

	/**
	 * Sets the osi application stages ID of this osi application stages.
	 *
	 * @param OsiApplicationStagesId the osi application stages ID of this osi application stages
	 */
	public void setOsiApplicationStagesId(long OsiApplicationStagesId);

	/**
	 * Returns the group ID of this osi application stages.
	 *
	 * @return the group ID of this osi application stages
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this osi application stages.
	 *
	 * @param groupId the group ID of this osi application stages
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this osi application stages.
	 *
	 * @return the company ID of this osi application stages
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this osi application stages.
	 *
	 * @param companyId the company ID of this osi application stages
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this osi application stages.
	 *
	 * @return the user ID of this osi application stages
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this osi application stages.
	 *
	 * @param userId the user ID of this osi application stages
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this osi application stages.
	 *
	 * @return the user uuid of this osi application stages
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this osi application stages.
	 *
	 * @param userUuid the user uuid of this osi application stages
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this osi application stages.
	 *
	 * @return the user name of this osi application stages
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this osi application stages.
	 *
	 * @param userName the user name of this osi application stages
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this osi application stages.
	 *
	 * @return the create date of this osi application stages
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this osi application stages.
	 *
	 * @param createDate the create date of this osi application stages
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this osi application stages.
	 *
	 * @return the modified date of this osi application stages
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this osi application stages.
	 *
	 * @param modifiedDate the modified date of this osi application stages
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the stage name of this osi application stages.
	 *
	 * @return the stage name of this osi application stages
	 */
	@AutoEscape
	public String getStageName();

	/**
	 * Sets the stage name of this osi application stages.
	 *
	 * @param stageName the stage name of this osi application stages
	 */
	public void setStageName(String stageName);

	/**
	 * Returns the duration of this osi application stages.
	 *
	 * @return the duration of this osi application stages
	 */
	@AutoEscape
	public String getDuration();

	/**
	 * Sets the duration of this osi application stages.
	 *
	 * @param duration the duration of this osi application stages
	 */
	public void setDuration(String duration);

	/**
	 * Returns the stage status of this osi application stages.
	 *
	 * @return the stage status of this osi application stages
	 */
	@AutoEscape
	public String getStageStatus();

	/**
	 * Sets the stage status of this osi application stages.
	 *
	 * @param stageStatus the stage status of this osi application stages
	 */
	public void setStageStatus(String stageStatus);

	/**
	 * Returns the stage start date of this osi application stages.
	 *
	 * @return the stage start date of this osi application stages
	 */
	public Date getStageStartDate();

	/**
	 * Sets the stage start date of this osi application stages.
	 *
	 * @param stageStartDate the stage start date of this osi application stages
	 */
	public void setStageStartDate(Date stageStartDate);

	/**
	 * Returns the stage end date of this osi application stages.
	 *
	 * @return the stage end date of this osi application stages
	 */
	public Date getStageEndDate();

	/**
	 * Sets the stage end date of this osi application stages.
	 *
	 * @param stageEndDate the stage end date of this osi application stages
	 */
	public void setStageEndDate(Date stageEndDate);

	/**
	 * Returns the osi application ID of this osi application stages.
	 *
	 * @return the osi application ID of this osi application stages
	 */
	public long getOsiApplicationId();

	/**
	 * Sets the osi application ID of this osi application stages.
	 *
	 * @param osiApplicationId the osi application ID of this osi application stages
	 */
	public void setOsiApplicationId(long osiApplicationId);

	/**
	 * Returns the case ID of this osi application stages.
	 *
	 * @return the case ID of this osi application stages
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this osi application stages.
	 *
	 * @param caseId the case ID of this osi application stages
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the updated by source of this osi application stages.
	 *
	 * @return the updated by source of this osi application stages
	 */
	@AutoEscape
	public String getUpdatedBySource();

	/**
	 * Sets the updated by source of this osi application stages.
	 *
	 * @param updatedBySource the updated by source of this osi application stages
	 */
	public void setUpdatedBySource(String updatedBySource);

	@Override
	public OsiApplicationStages cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}