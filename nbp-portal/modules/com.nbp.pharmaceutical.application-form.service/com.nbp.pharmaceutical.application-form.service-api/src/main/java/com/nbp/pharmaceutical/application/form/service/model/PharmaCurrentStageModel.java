/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PharmaCurrentStage service. Represents a row in the &quot;nbp_pharma_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCurrentStageModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCurrentStageImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCurrentStage
 * @generated
 */
@ProviderType
public interface PharmaCurrentStageModel
	extends BaseModel<PharmaCurrentStage>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a pharma current stage model instance should use the {@link PharmaCurrentStage} interface instead.
	 */

	/**
	 * Returns the primary key of this pharma current stage.
	 *
	 * @return the primary key of this pharma current stage
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this pharma current stage.
	 *
	 * @param primaryKey the primary key of this pharma current stage
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the pharma current stage ID of this pharma current stage.
	 *
	 * @return the pharma current stage ID of this pharma current stage
	 */
	public long getPharmaCurrentStageId();

	/**
	 * Sets the pharma current stage ID of this pharma current stage.
	 *
	 * @param pharmaCurrentStageId the pharma current stage ID of this pharma current stage
	 */
	public void setPharmaCurrentStageId(long pharmaCurrentStageId);

	/**
	 * Returns the group ID of this pharma current stage.
	 *
	 * @return the group ID of this pharma current stage
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this pharma current stage.
	 *
	 * @param groupId the group ID of this pharma current stage
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this pharma current stage.
	 *
	 * @return the company ID of this pharma current stage
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this pharma current stage.
	 *
	 * @param companyId the company ID of this pharma current stage
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this pharma current stage.
	 *
	 * @return the user ID of this pharma current stage
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this pharma current stage.
	 *
	 * @param userId the user ID of this pharma current stage
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this pharma current stage.
	 *
	 * @return the user uuid of this pharma current stage
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this pharma current stage.
	 *
	 * @param userUuid the user uuid of this pharma current stage
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this pharma current stage.
	 *
	 * @return the user name of this pharma current stage
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this pharma current stage.
	 *
	 * @param userName the user name of this pharma current stage
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this pharma current stage.
	 *
	 * @return the create date of this pharma current stage
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this pharma current stage.
	 *
	 * @param createDate the create date of this pharma current stage
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this pharma current stage.
	 *
	 * @return the modified date of this pharma current stage
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this pharma current stage.
	 *
	 * @param modifiedDate the modified date of this pharma current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the current stage of this pharma current stage.
	 *
	 * @return the current stage of this pharma current stage
	 */
	@AutoEscape
	public String getCurrentStage();

	/**
	 * Sets the current stage of this pharma current stage.
	 *
	 * @param currentStage the current stage of this pharma current stage
	 */
	public void setCurrentStage(String currentStage);

	/**
	 * Returns the last form stage of this pharma current stage.
	 *
	 * @return the last form stage of this pharma current stage
	 */
	@AutoEscape
	public String getLastFormStage();

	/**
	 * Sets the last form stage of this pharma current stage.
	 *
	 * @param lastFormStage the last form stage of this pharma current stage
	 */
	public void setLastFormStage(String lastFormStage);

	/**
	 * Returns the pharma application ID of this pharma current stage.
	 *
	 * @return the pharma application ID of this pharma current stage
	 */
	public long getPharmaApplicationId();

	/**
	 * Sets the pharma application ID of this pharma current stage.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma current stage
	 */
	public void setPharmaApplicationId(long pharmaApplicationId);

	@Override
	public PharmaCurrentStage cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}