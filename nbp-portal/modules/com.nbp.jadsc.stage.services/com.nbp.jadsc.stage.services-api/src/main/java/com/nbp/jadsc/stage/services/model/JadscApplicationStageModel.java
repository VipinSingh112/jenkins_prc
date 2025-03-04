/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the JadscApplicationStage service. Represents a row in the &quot;nbp_jadsc_application_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationStage
 * @generated
 */
@ProviderType
public interface JadscApplicationStageModel
	extends BaseModel<JadscApplicationStage>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a jadsc application stage model instance should use the {@link JadscApplicationStage} interface instead.
	 */

	/**
	 * Returns the primary key of this jadsc application stage.
	 *
	 * @return the primary key of this jadsc application stage
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this jadsc application stage.
	 *
	 * @param primaryKey the primary key of this jadsc application stage
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this jadsc application stage.
	 *
	 * @return the uuid of this jadsc application stage
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this jadsc application stage.
	 *
	 * @param uuid the uuid of this jadsc application stage
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the jadsc app stage ID of this jadsc application stage.
	 *
	 * @return the jadsc app stage ID of this jadsc application stage
	 */
	public long getJadscAppStageId();

	/**
	 * Sets the jadsc app stage ID of this jadsc application stage.
	 *
	 * @param jadscAppStageId the jadsc app stage ID of this jadsc application stage
	 */
	public void setJadscAppStageId(long jadscAppStageId);

	/**
	 * Returns the group ID of this jadsc application stage.
	 *
	 * @return the group ID of this jadsc application stage
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this jadsc application stage.
	 *
	 * @param groupId the group ID of this jadsc application stage
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this jadsc application stage.
	 *
	 * @return the company ID of this jadsc application stage
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this jadsc application stage.
	 *
	 * @param companyId the company ID of this jadsc application stage
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this jadsc application stage.
	 *
	 * @return the user ID of this jadsc application stage
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this jadsc application stage.
	 *
	 * @param userId the user ID of this jadsc application stage
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this jadsc application stage.
	 *
	 * @return the user uuid of this jadsc application stage
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this jadsc application stage.
	 *
	 * @param userUuid the user uuid of this jadsc application stage
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this jadsc application stage.
	 *
	 * @return the user name of this jadsc application stage
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this jadsc application stage.
	 *
	 * @param userName the user name of this jadsc application stage
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this jadsc application stage.
	 *
	 * @return the create date of this jadsc application stage
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this jadsc application stage.
	 *
	 * @param createDate the create date of this jadsc application stage
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this jadsc application stage.
	 *
	 * @return the modified date of this jadsc application stage
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this jadsc application stage.
	 *
	 * @param modifiedDate the modified date of this jadsc application stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the stage name of this jadsc application stage.
	 *
	 * @return the stage name of this jadsc application stage
	 */
	@AutoEscape
	public String getStageName();

	/**
	 * Sets the stage name of this jadsc application stage.
	 *
	 * @param stageName the stage name of this jadsc application stage
	 */
	public void setStageName(String stageName);

	/**
	 * Returns the duration of this jadsc application stage.
	 *
	 * @return the duration of this jadsc application stage
	 */
	@AutoEscape
	public String getDuration();

	/**
	 * Sets the duration of this jadsc application stage.
	 *
	 * @param duration the duration of this jadsc application stage
	 */
	public void setDuration(String duration);

	/**
	 * Returns the stage status of this jadsc application stage.
	 *
	 * @return the stage status of this jadsc application stage
	 */
	@AutoEscape
	public String getStageStatus();

	/**
	 * Sets the stage status of this jadsc application stage.
	 *
	 * @param stageStatus the stage status of this jadsc application stage
	 */
	public void setStageStatus(String stageStatus);

	/**
	 * Returns the stage start date of this jadsc application stage.
	 *
	 * @return the stage start date of this jadsc application stage
	 */
	public Date getStageStartDate();

	/**
	 * Sets the stage start date of this jadsc application stage.
	 *
	 * @param stageStartDate the stage start date of this jadsc application stage
	 */
	public void setStageStartDate(Date stageStartDate);

	/**
	 * Returns the stage end date of this jadsc application stage.
	 *
	 * @return the stage end date of this jadsc application stage
	 */
	public Date getStageEndDate();

	/**
	 * Sets the stage end date of this jadsc application stage.
	 *
	 * @param stageEndDate the stage end date of this jadsc application stage
	 */
	public void setStageEndDate(Date stageEndDate);

	/**
	 * Returns the jadsc application ID of this jadsc application stage.
	 *
	 * @return the jadsc application ID of this jadsc application stage
	 */
	public long getJadscApplicationId();

	/**
	 * Sets the jadsc application ID of this jadsc application stage.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc application stage
	 */
	public void setJadscApplicationId(long jadscApplicationId);

	/**
	 * Returns the case ID of this jadsc application stage.
	 *
	 * @return the case ID of this jadsc application stage
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this jadsc application stage.
	 *
	 * @param caseId the case ID of this jadsc application stage
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the update by source of this jadsc application stage.
	 *
	 * @return the update by source of this jadsc application stage
	 */
	@AutoEscape
	public String getUpdateBySource();

	/**
	 * Sets the update by source of this jadsc application stage.
	 *
	 * @param updateBySource the update by source of this jadsc application stage
	 */
	public void setUpdateBySource(String updateBySource);

	@Override
	public JadscApplicationStage cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}