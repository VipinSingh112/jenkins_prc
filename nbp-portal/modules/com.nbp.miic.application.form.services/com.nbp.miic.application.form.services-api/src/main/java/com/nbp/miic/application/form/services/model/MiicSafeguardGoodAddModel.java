/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the MiicSafeguardGoodAdd service. Represents a row in the &quot;nbp_miic_safeguard_good&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAdd
 * @generated
 */
@ProviderType
public interface MiicSafeguardGoodAddModel
	extends BaseModel<MiicSafeguardGoodAdd>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a miic safeguard good add model instance should use the {@link MiicSafeguardGoodAdd} interface instead.
	 */

	/**
	 * Returns the primary key of this miic safeguard good add.
	 *
	 * @return the primary key of this miic safeguard good add
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this miic safeguard good add.
	 *
	 * @param primaryKey the primary key of this miic safeguard good add
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the miic safeguard good add ID of this miic safeguard good add.
	 *
	 * @return the miic safeguard good add ID of this miic safeguard good add
	 */
	public long getMiicSafeguardGoodAddId();

	/**
	 * Sets the miic safeguard good add ID of this miic safeguard good add.
	 *
	 * @param miicSafeguardGoodAddId the miic safeguard good add ID of this miic safeguard good add
	 */
	public void setMiicSafeguardGoodAddId(long miicSafeguardGoodAddId);

	/**
	 * Returns the group ID of this miic safeguard good add.
	 *
	 * @return the group ID of this miic safeguard good add
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this miic safeguard good add.
	 *
	 * @param groupId the group ID of this miic safeguard good add
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this miic safeguard good add.
	 *
	 * @return the company ID of this miic safeguard good add
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this miic safeguard good add.
	 *
	 * @param companyId the company ID of this miic safeguard good add
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this miic safeguard good add.
	 *
	 * @return the user ID of this miic safeguard good add
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this miic safeguard good add.
	 *
	 * @param userId the user ID of this miic safeguard good add
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this miic safeguard good add.
	 *
	 * @return the user uuid of this miic safeguard good add
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this miic safeguard good add.
	 *
	 * @param userUuid the user uuid of this miic safeguard good add
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this miic safeguard good add.
	 *
	 * @return the user name of this miic safeguard good add
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this miic safeguard good add.
	 *
	 * @param userName the user name of this miic safeguard good add
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this miic safeguard good add.
	 *
	 * @return the create date of this miic safeguard good add
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this miic safeguard good add.
	 *
	 * @param createDate the create date of this miic safeguard good add
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this miic safeguard good add.
	 *
	 * @return the modified date of this miic safeguard good add
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this miic safeguard good add.
	 *
	 * @param modifiedDate the modified date of this miic safeguard good add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the tariff heading num of this miic safeguard good add.
	 *
	 * @return the tariff heading num of this miic safeguard good add
	 */
	@AutoEscape
	public String getTariffHeadingNum();

	/**
	 * Sets the tariff heading num of this miic safeguard good add.
	 *
	 * @param tariffHeadingNum the tariff heading num of this miic safeguard good add
	 */
	public void setTariffHeadingNum(String tariffHeadingNum);

	/**
	 * Returns the description of this miic safeguard good add.
	 *
	 * @return the description of this miic safeguard good add
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this miic safeguard good add.
	 *
	 * @param description the description of this miic safeguard good add
	 */
	public void setDescription(String description);

	/**
	 * Returns the amount quantity of this miic safeguard good add.
	 *
	 * @return the amount quantity of this miic safeguard good add
	 */
	@AutoEscape
	public String getAmountQuantity();

	/**
	 * Sets the amount quantity of this miic safeguard good add.
	 *
	 * @param amountQuantity the amount quantity of this miic safeguard good add
	 */
	public void setAmountQuantity(String amountQuantity);

	/**
	 * Returns the amount estimate of this miic safeguard good add.
	 *
	 * @return the amount estimate of this miic safeguard good add
	 */
	@AutoEscape
	public String getAmountEstimate();

	/**
	 * Sets the amount estimate of this miic safeguard good add.
	 *
	 * @param amountEstimate the amount estimate of this miic safeguard good add
	 */
	public void setAmountEstimate(String amountEstimate);

	/**
	 * Returns the reson for request of this miic safeguard good add.
	 *
	 * @return the reson for request of this miic safeguard good add
	 */
	@AutoEscape
	public String getResonForRequest();

	/**
	 * Sets the reson for request of this miic safeguard good add.
	 *
	 * @param resonForRequest the reson for request of this miic safeguard good add
	 */
	public void setResonForRequest(String resonForRequest);

	/**
	 * Returns the counter of this miic safeguard good add.
	 *
	 * @return the counter of this miic safeguard good add
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this miic safeguard good add.
	 *
	 * @param counter the counter of this miic safeguard good add
	 */
	public void setCounter(String counter);

	/**
	 * Returns the miic application ID of this miic safeguard good add.
	 *
	 * @return the miic application ID of this miic safeguard good add
	 */
	public long getMiicApplicationId();

	/**
	 * Sets the miic application ID of this miic safeguard good add.
	 *
	 * @param miicApplicationId the miic application ID of this miic safeguard good add
	 */
	public void setMiicApplicationId(long miicApplicationId);

	@Override
	public MiicSafeguardGoodAdd cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}