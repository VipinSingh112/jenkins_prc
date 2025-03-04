/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the HealthCareDescriptionOfService service. Represents a row in the &quot;nbp_healthcare_description&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfService
 * @generated
 */
@ProviderType
public interface HealthCareDescriptionOfServiceModel
	extends BaseModel<HealthCareDescriptionOfService>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a health care description of service model instance should use the {@link HealthCareDescriptionOfService} interface instead.
	 */

	/**
	 * Returns the primary key of this health care description of service.
	 *
	 * @return the primary key of this health care description of service
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this health care description of service.
	 *
	 * @param primaryKey the primary key of this health care description of service
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the health care description ID of this health care description of service.
	 *
	 * @return the health care description ID of this health care description of service
	 */
	public long getHealthCareDescriptionId();

	/**
	 * Sets the health care description ID of this health care description of service.
	 *
	 * @param healthCareDescriptionId the health care description ID of this health care description of service
	 */
	public void setHealthCareDescriptionId(long healthCareDescriptionId);

	/**
	 * Returns the group ID of this health care description of service.
	 *
	 * @return the group ID of this health care description of service
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this health care description of service.
	 *
	 * @param groupId the group ID of this health care description of service
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this health care description of service.
	 *
	 * @return the company ID of this health care description of service
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this health care description of service.
	 *
	 * @param companyId the company ID of this health care description of service
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this health care description of service.
	 *
	 * @return the user ID of this health care description of service
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this health care description of service.
	 *
	 * @param userId the user ID of this health care description of service
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this health care description of service.
	 *
	 * @return the user uuid of this health care description of service
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this health care description of service.
	 *
	 * @param userUuid the user uuid of this health care description of service
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this health care description of service.
	 *
	 * @return the user name of this health care description of service
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this health care description of service.
	 *
	 * @param userName the user name of this health care description of service
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this health care description of service.
	 *
	 * @return the create date of this health care description of service
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this health care description of service.
	 *
	 * @param createDate the create date of this health care description of service
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this health care description of service.
	 *
	 * @return the modified date of this health care description of service
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this health care description of service.
	 *
	 * @param modifiedDate the modified date of this health care description of service
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the description of service of this health care description of service.
	 *
	 * @return the description of service of this health care description of service
	 */
	@AutoEscape
	public String getDescriptionOfService();

	/**
	 * Sets the description of service of this health care description of service.
	 *
	 * @param descriptionOfService the description of service of this health care description of service
	 */
	public void setDescriptionOfService(String descriptionOfService);

	/**
	 * Returns the health care application ID of this health care description of service.
	 *
	 * @return the health care application ID of this health care description of service
	 */
	public long getHealthCareApplicationId();

	/**
	 * Sets the health care application ID of this health care description of service.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care description of service
	 */
	public void setHealthCareApplicationId(long healthCareApplicationId);

	@Override
	public HealthCareDescriptionOfService cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}