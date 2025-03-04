/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the OSIServiceCurrentStage service. Represents a row in the &quot;nbp_osi_services_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceCurrentStage
 * @generated
 */
@ProviderType
public interface OSIServiceCurrentStageModel
	extends BaseModel<OSIServiceCurrentStage>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a osi service current stage model instance should use the {@link OSIServiceCurrentStage} interface instead.
	 */

	/**
	 * Returns the primary key of this osi service current stage.
	 *
	 * @return the primary key of this osi service current stage
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this osi service current stage.
	 *
	 * @param primaryKey the primary key of this osi service current stage
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the osi current stage ID of this osi service current stage.
	 *
	 * @return the osi current stage ID of this osi service current stage
	 */
	public long getOsiCurrentStageId();

	/**
	 * Sets the osi current stage ID of this osi service current stage.
	 *
	 * @param osiCurrentStageId the osi current stage ID of this osi service current stage
	 */
	public void setOsiCurrentStageId(long osiCurrentStageId);

	/**
	 * Returns the group ID of this osi service current stage.
	 *
	 * @return the group ID of this osi service current stage
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this osi service current stage.
	 *
	 * @param groupId the group ID of this osi service current stage
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this osi service current stage.
	 *
	 * @return the company ID of this osi service current stage
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this osi service current stage.
	 *
	 * @param companyId the company ID of this osi service current stage
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this osi service current stage.
	 *
	 * @return the user ID of this osi service current stage
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this osi service current stage.
	 *
	 * @param userId the user ID of this osi service current stage
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this osi service current stage.
	 *
	 * @return the user uuid of this osi service current stage
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this osi service current stage.
	 *
	 * @param userUuid the user uuid of this osi service current stage
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this osi service current stage.
	 *
	 * @return the user name of this osi service current stage
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this osi service current stage.
	 *
	 * @param userName the user name of this osi service current stage
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this osi service current stage.
	 *
	 * @return the create date of this osi service current stage
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this osi service current stage.
	 *
	 * @param createDate the create date of this osi service current stage
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this osi service current stage.
	 *
	 * @return the modified date of this osi service current stage
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this osi service current stage.
	 *
	 * @param modifiedDate the modified date of this osi service current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the current stage of this osi service current stage.
	 *
	 * @return the current stage of this osi service current stage
	 */
	@AutoEscape
	public String getCurrentStage();

	/**
	 * Sets the current stage of this osi service current stage.
	 *
	 * @param currentStage the current stage of this osi service current stage
	 */
	public void setCurrentStage(String currentStage);

	/**
	 * Returns the last form details step of this osi service current stage.
	 *
	 * @return the last form details step of this osi service current stage
	 */
	@AutoEscape
	public String getLastFormDetailsStep();

	/**
	 * Sets the last form details step of this osi service current stage.
	 *
	 * @param lastFormDetailsStep the last form details step of this osi service current stage
	 */
	public void setLastFormDetailsStep(String lastFormDetailsStep);

	/**
	 * Returns the osi services application ID of this osi service current stage.
	 *
	 * @return the osi services application ID of this osi service current stage
	 */
	public long getOsiServicesApplicationId();

	/**
	 * Sets the osi services application ID of this osi service current stage.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi service current stage
	 */
	public void setOsiServicesApplicationId(long osiServicesApplicationId);

	@Override
	public OSIServiceCurrentStage cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}