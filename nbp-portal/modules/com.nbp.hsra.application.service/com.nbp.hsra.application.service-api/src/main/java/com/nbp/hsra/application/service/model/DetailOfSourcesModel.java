/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the DetailOfSources service. Represents a row in the &quot;nbp_hsra_noti_detail_source&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.hsra.application.service.model.impl.DetailOfSourcesModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.hsra.application.service.model.impl.DetailOfSourcesImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfSources
 * @generated
 */
@ProviderType
public interface DetailOfSourcesModel
	extends BaseModel<DetailOfSources>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a detail of sources model instance should use the {@link DetailOfSources} interface instead.
	 */

	/**
	 * Returns the primary key of this detail of sources.
	 *
	 * @return the primary key of this detail of sources
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this detail of sources.
	 *
	 * @param primaryKey the primary key of this detail of sources
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the detail of sources ID of this detail of sources.
	 *
	 * @return the detail of sources ID of this detail of sources
	 */
	public long getDetailOfSourcesId();

	/**
	 * Sets the detail of sources ID of this detail of sources.
	 *
	 * @param detailOfSourcesId the detail of sources ID of this detail of sources
	 */
	public void setDetailOfSourcesId(long detailOfSourcesId);

	/**
	 * Returns the group ID of this detail of sources.
	 *
	 * @return the group ID of this detail of sources
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this detail of sources.
	 *
	 * @param groupId the group ID of this detail of sources
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this detail of sources.
	 *
	 * @return the company ID of this detail of sources
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this detail of sources.
	 *
	 * @param companyId the company ID of this detail of sources
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this detail of sources.
	 *
	 * @return the user ID of this detail of sources
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this detail of sources.
	 *
	 * @param userId the user ID of this detail of sources
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this detail of sources.
	 *
	 * @return the user uuid of this detail of sources
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this detail of sources.
	 *
	 * @param userUuid the user uuid of this detail of sources
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this detail of sources.
	 *
	 * @return the user name of this detail of sources
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this detail of sources.
	 *
	 * @param userName the user name of this detail of sources
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this detail of sources.
	 *
	 * @return the create date of this detail of sources
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this detail of sources.
	 *
	 * @param createDate the create date of this detail of sources
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this detail of sources.
	 *
	 * @return the modified date of this detail of sources
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this detail of sources.
	 *
	 * @param modifiedDate the modified date of this detail of sources
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the source identification of this detail of sources.
	 *
	 * @return the source identification of this detail of sources
	 */
	@AutoEscape
	public String getSourceIdentification();

	/**
	 * Sets the source identification of this detail of sources.
	 *
	 * @param sourceIdentification the source identification of this detail of sources
	 */
	public void setSourceIdentification(String sourceIdentification);

	/**
	 * Returns the source location of this detail of sources.
	 *
	 * @return the source location of this detail of sources
	 */
	@AutoEscape
	public String getSourceLocation();

	/**
	 * Sets the source location of this detail of sources.
	 *
	 * @param sourceLocation the source location of this detail of sources
	 */
	public void setSourceLocation(String sourceLocation);

	/**
	 * Returns the state activity of this detail of sources.
	 *
	 * @return the state activity of this detail of sources
	 */
	@AutoEscape
	public String getStateActivity();

	/**
	 * Sets the state activity of this detail of sources.
	 *
	 * @param stateActivity the state activity of this detail of sources
	 */
	public void setStateActivity(String stateActivity);

	/**
	 * Returns the hsra application ID of this detail of sources.
	 *
	 * @return the hsra application ID of this detail of sources
	 */
	public long getHsraApplicationId();

	/**
	 * Sets the hsra application ID of this detail of sources.
	 *
	 * @param hsraApplicationId the hsra application ID of this detail of sources
	 */
	public void setHsraApplicationId(long hsraApplicationId);

	@Override
	public DetailOfSources cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}