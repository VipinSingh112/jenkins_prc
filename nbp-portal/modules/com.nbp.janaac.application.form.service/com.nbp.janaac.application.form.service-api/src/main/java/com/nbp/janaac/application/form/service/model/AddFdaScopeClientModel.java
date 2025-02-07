/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AddFdaScopeClient service. Represents a row in the &quot;nbp_janaac_add_fda_scop_client&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AddFdaScopeClientModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AddFdaScopeClientImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaScopeClient
 * @generated
 */
@ProviderType
public interface AddFdaScopeClientModel
	extends BaseModel<AddFdaScopeClient>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a add fda scope client model instance should use the {@link AddFdaScopeClient} interface instead.
	 */

	/**
	 * Returns the primary key of this add fda scope client.
	 *
	 * @return the primary key of this add fda scope client
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this add fda scope client.
	 *
	 * @param primaryKey the primary key of this add fda scope client
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the add fda scope client ID of this add fda scope client.
	 *
	 * @return the add fda scope client ID of this add fda scope client
	 */
	public long getAddFdaScopeClientId();

	/**
	 * Sets the add fda scope client ID of this add fda scope client.
	 *
	 * @param addFdaScopeClientId the add fda scope client ID of this add fda scope client
	 */
	public void setAddFdaScopeClientId(long addFdaScopeClientId);

	/**
	 * Returns the group ID of this add fda scope client.
	 *
	 * @return the group ID of this add fda scope client
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this add fda scope client.
	 *
	 * @param groupId the group ID of this add fda scope client
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this add fda scope client.
	 *
	 * @return the company ID of this add fda scope client
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this add fda scope client.
	 *
	 * @param companyId the company ID of this add fda scope client
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this add fda scope client.
	 *
	 * @return the user ID of this add fda scope client
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this add fda scope client.
	 *
	 * @param userId the user ID of this add fda scope client
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this add fda scope client.
	 *
	 * @return the user uuid of this add fda scope client
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this add fda scope client.
	 *
	 * @param userUuid the user uuid of this add fda scope client
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this add fda scope client.
	 *
	 * @return the user name of this add fda scope client
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this add fda scope client.
	 *
	 * @param userName the user name of this add fda scope client
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this add fda scope client.
	 *
	 * @return the create date of this add fda scope client
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this add fda scope client.
	 *
	 * @param createDate the create date of this add fda scope client
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this add fda scope client.
	 *
	 * @return the modified date of this add fda scope client
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this add fda scope client.
	 *
	 * @param modifiedDate the modified date of this add fda scope client
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the client organization of this add fda scope client.
	 *
	 * @return the client organization of this add fda scope client
	 */
	@AutoEscape
	public String getClientOrganization();

	/**
	 * Sets the client organization of this add fda scope client.
	 *
	 * @param clientOrganization the client organization of this add fda scope client
	 */
	public void setClientOrganization(String clientOrganization);

	/**
	 * Returns the food products of this add fda scope client.
	 *
	 * @return the food products of this add fda scope client
	 */
	@AutoEscape
	public String getFoodProducts();

	/**
	 * Sets the food products of this add fda scope client.
	 *
	 * @param foodProducts the food products of this add fda scope client
	 */
	public void setFoodProducts(String foodProducts);

	/**
	 * Returns the fda regulations of this add fda scope client.
	 *
	 * @return the fda regulations of this add fda scope client
	 */
	@AutoEscape
	public String getFdaRegulations();

	/**
	 * Sets the fda regulations of this add fda scope client.
	 *
	 * @param fdaRegulations the fda regulations of this add fda scope client
	 */
	public void setFdaRegulations(String fdaRegulations);

	/**
	 * Returns the date granted of this add fda scope client.
	 *
	 * @return the date granted of this add fda scope client
	 */
	public Date getDateGranted();

	/**
	 * Sets the date granted of this add fda scope client.
	 *
	 * @param dateGranted the date granted of this add fda scope client
	 */
	public void setDateGranted(Date dateGranted);

	/**
	 * Returns the janaac application ID of this add fda scope client.
	 *
	 * @return the janaac application ID of this add fda scope client
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this add fda scope client.
	 *
	 * @param janaacApplicationId the janaac application ID of this add fda scope client
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	/**
	 * Returns the counter of this add fda scope client.
	 *
	 * @return the counter of this add fda scope client
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this add fda scope client.
	 *
	 * @param counter the counter of this add fda scope client
	 */
	public void setCounter(String counter);

	@Override
	public AddFdaScopeClient cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}