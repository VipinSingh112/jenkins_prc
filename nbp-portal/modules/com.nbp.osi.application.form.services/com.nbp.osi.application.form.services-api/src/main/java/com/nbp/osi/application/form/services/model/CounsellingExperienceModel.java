/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CounsellingExperience service. Represents a row in the &quot;nbp_osi_counselling&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.application.form.services.model.impl.CounsellingExperienceModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.application.form.services.model.impl.CounsellingExperienceImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CounsellingExperience
 * @generated
 */
@ProviderType
public interface CounsellingExperienceModel
	extends BaseModel<CounsellingExperience>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a counselling experience model instance should use the {@link CounsellingExperience} interface instead.
	 */

	/**
	 * Returns the primary key of this counselling experience.
	 *
	 * @return the primary key of this counselling experience
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this counselling experience.
	 *
	 * @param primaryKey the primary key of this counselling experience
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the counselling experience ID of this counselling experience.
	 *
	 * @return the counselling experience ID of this counselling experience
	 */
	public long getCounsellingExperienceId();

	/**
	 * Sets the counselling experience ID of this counselling experience.
	 *
	 * @param counsellingExperienceId the counselling experience ID of this counselling experience
	 */
	public void setCounsellingExperienceId(long counsellingExperienceId);

	/**
	 * Returns the group ID of this counselling experience.
	 *
	 * @return the group ID of this counselling experience
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this counselling experience.
	 *
	 * @param groupId the group ID of this counselling experience
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this counselling experience.
	 *
	 * @return the company ID of this counselling experience
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this counselling experience.
	 *
	 * @param companyId the company ID of this counselling experience
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this counselling experience.
	 *
	 * @return the user ID of this counselling experience
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this counselling experience.
	 *
	 * @param userId the user ID of this counselling experience
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this counselling experience.
	 *
	 * @return the user uuid of this counselling experience
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this counselling experience.
	 *
	 * @param userUuid the user uuid of this counselling experience
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this counselling experience.
	 *
	 * @return the user name of this counselling experience
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this counselling experience.
	 *
	 * @param userName the user name of this counselling experience
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this counselling experience.
	 *
	 * @return the create date of this counselling experience
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this counselling experience.
	 *
	 * @param createDate the create date of this counselling experience
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this counselling experience.
	 *
	 * @return the modified date of this counselling experience
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this counselling experience.
	 *
	 * @param modifiedDate the modified date of this counselling experience
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the company of this counselling experience.
	 *
	 * @return the company of this counselling experience
	 */
	@AutoEscape
	public String getCompany();

	/**
	 * Sets the company of this counselling experience.
	 *
	 * @param company the company of this counselling experience
	 */
	public void setCompany(String company);

	/**
	 * Returns the position of this counselling experience.
	 *
	 * @return the position of this counselling experience
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this counselling experience.
	 *
	 * @param position the position of this counselling experience
	 */
	public void setPosition(String position);

	/**
	 * Returns the counselling type of this counselling experience.
	 *
	 * @return the counselling type of this counselling experience
	 */
	@AutoEscape
	public String getCounsellingType();

	/**
	 * Sets the counselling type of this counselling experience.
	 *
	 * @param counsellingType the counselling type of this counselling experience
	 */
	public void setCounsellingType(String counsellingType);

	/**
	 * Returns the service length of this counselling experience.
	 *
	 * @return the service length of this counselling experience
	 */
	@AutoEscape
	public String getServiceLength();

	/**
	 * Sets the service length of this counselling experience.
	 *
	 * @param serviceLength the service length of this counselling experience
	 */
	public void setServiceLength(String serviceLength);

	/**
	 * Returns the counter of this counselling experience.
	 *
	 * @return the counter of this counselling experience
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this counselling experience.
	 *
	 * @param counter the counter of this counselling experience
	 */
	public void setCounter(String counter);

	/**
	 * Returns the osi application ID of this counselling experience.
	 *
	 * @return the osi application ID of this counselling experience
	 */
	public long getOsiApplicationId();

	/**
	 * Sets the osi application ID of this counselling experience.
	 *
	 * @param osiApplicationId the osi application ID of this counselling experience
	 */
	public void setOsiApplicationId(long osiApplicationId);

	@Override
	public CounsellingExperience cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}