/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the MedicalCurrentStage service. Represents a row in the &quot;nbp_medical_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalCurrentStageModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalCurrentStageImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCurrentStage
 * @generated
 */
@ProviderType
public interface MedicalCurrentStageModel
	extends BaseModel<MedicalCurrentStage>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a medical current stage model instance should use the {@link MedicalCurrentStage} interface instead.
	 */

	/**
	 * Returns the primary key of this medical current stage.
	 *
	 * @return the primary key of this medical current stage
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this medical current stage.
	 *
	 * @param primaryKey the primary key of this medical current stage
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this medical current stage.
	 *
	 * @return the uuid of this medical current stage
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this medical current stage.
	 *
	 * @param uuid the uuid of this medical current stage
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the medical current stage ID of this medical current stage.
	 *
	 * @return the medical current stage ID of this medical current stage
	 */
	public long getMedicalCurrentStageId();

	/**
	 * Sets the medical current stage ID of this medical current stage.
	 *
	 * @param medicalCurrentStageId the medical current stage ID of this medical current stage
	 */
	public void setMedicalCurrentStageId(long medicalCurrentStageId);

	/**
	 * Returns the group ID of this medical current stage.
	 *
	 * @return the group ID of this medical current stage
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this medical current stage.
	 *
	 * @param groupId the group ID of this medical current stage
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this medical current stage.
	 *
	 * @return the company ID of this medical current stage
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this medical current stage.
	 *
	 * @param companyId the company ID of this medical current stage
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this medical current stage.
	 *
	 * @return the user ID of this medical current stage
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this medical current stage.
	 *
	 * @param userId the user ID of this medical current stage
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this medical current stage.
	 *
	 * @return the user uuid of this medical current stage
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this medical current stage.
	 *
	 * @param userUuid the user uuid of this medical current stage
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this medical current stage.
	 *
	 * @return the user name of this medical current stage
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this medical current stage.
	 *
	 * @param userName the user name of this medical current stage
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this medical current stage.
	 *
	 * @return the create date of this medical current stage
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this medical current stage.
	 *
	 * @param createDate the create date of this medical current stage
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this medical current stage.
	 *
	 * @return the modified date of this medical current stage
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this medical current stage.
	 *
	 * @param modifiedDate the modified date of this medical current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the current stage of this medical current stage.
	 *
	 * @return the current stage of this medical current stage
	 */
	@AutoEscape
	public String getCurrentStage();

	/**
	 * Sets the current stage of this medical current stage.
	 *
	 * @param currentStage the current stage of this medical current stage
	 */
	public void setCurrentStage(String currentStage);

	/**
	 * Returns the last form step of this medical current stage.
	 *
	 * @return the last form step of this medical current stage
	 */
	@AutoEscape
	public String getLastFormStep();

	/**
	 * Sets the last form step of this medical current stage.
	 *
	 * @param lastFormStep the last form step of this medical current stage
	 */
	public void setLastFormStep(String lastFormStep);

	/**
	 * Returns the medical facilities app ID of this medical current stage.
	 *
	 * @return the medical facilities app ID of this medical current stage
	 */
	public long getMedicalFacilitiesAppId();

	/**
	 * Sets the medical facilities app ID of this medical current stage.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical current stage
	 */
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId);

	@Override
	public MedicalCurrentStage cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}