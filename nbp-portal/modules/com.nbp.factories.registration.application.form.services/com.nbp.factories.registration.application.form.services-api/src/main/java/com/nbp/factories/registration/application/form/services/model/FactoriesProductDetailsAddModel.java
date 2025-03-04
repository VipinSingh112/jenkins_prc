/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FactoriesProductDetailsAdd service. Represents a row in the &quot;nbp_factories_product_det&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProductDetailsAdd
 * @generated
 */
@ProviderType
public interface FactoriesProductDetailsAddModel
	extends BaseModel<FactoriesProductDetailsAdd>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a factories product details add model instance should use the {@link FactoriesProductDetailsAdd} interface instead.
	 */

	/**
	 * Returns the primary key of this factories product details add.
	 *
	 * @return the primary key of this factories product details add
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this factories product details add.
	 *
	 * @param primaryKey the primary key of this factories product details add
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the factories product details add ID of this factories product details add.
	 *
	 * @return the factories product details add ID of this factories product details add
	 */
	public long getFactoriesProductDetailsAddId();

	/**
	 * Sets the factories product details add ID of this factories product details add.
	 *
	 * @param factoriesProductDetailsAddId the factories product details add ID of this factories product details add
	 */
	public void setFactoriesProductDetailsAddId(
		long factoriesProductDetailsAddId);

	/**
	 * Returns the group ID of this factories product details add.
	 *
	 * @return the group ID of this factories product details add
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this factories product details add.
	 *
	 * @param groupId the group ID of this factories product details add
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this factories product details add.
	 *
	 * @return the company ID of this factories product details add
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this factories product details add.
	 *
	 * @param companyId the company ID of this factories product details add
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this factories product details add.
	 *
	 * @return the user ID of this factories product details add
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this factories product details add.
	 *
	 * @param userId the user ID of this factories product details add
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this factories product details add.
	 *
	 * @return the user uuid of this factories product details add
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this factories product details add.
	 *
	 * @param userUuid the user uuid of this factories product details add
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this factories product details add.
	 *
	 * @return the user name of this factories product details add
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this factories product details add.
	 *
	 * @param userName the user name of this factories product details add
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this factories product details add.
	 *
	 * @return the create date of this factories product details add
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this factories product details add.
	 *
	 * @param createDate the create date of this factories product details add
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this factories product details add.
	 *
	 * @return the modified date of this factories product details add
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this factories product details add.
	 *
	 * @param modifiedDate the modified date of this factories product details add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the product brand of this factories product details add.
	 *
	 * @return the product brand of this factories product details add
	 */
	@AutoEscape
	public String getProductBrand();

	/**
	 * Sets the product brand of this factories product details add.
	 *
	 * @param productBrand the product brand of this factories product details add
	 */
	public void setProductBrand(String productBrand);

	/**
	 * Returns the product of this factories product details add.
	 *
	 * @return the product of this factories product details add
	 */
	@AutoEscape
	public String getProduct();

	/**
	 * Sets the product of this factories product details add.
	 *
	 * @param product the product of this factories product details add
	 */
	public void setProduct(String product);

	/**
	 * Returns the product size of this factories product details add.
	 *
	 * @return the product size of this factories product details add
	 */
	@AutoEscape
	public String getProductSize();

	/**
	 * Sets the product size of this factories product details add.
	 *
	 * @param productSize the product size of this factories product details add
	 */
	public void setProductSize(String productSize);

	/**
	 * Returns the product measurement val of this factories product details add.
	 *
	 * @return the product measurement val of this factories product details add
	 */
	@AutoEscape
	public String getProductMeasurementVal();

	/**
	 * Sets the product measurement val of this factories product details add.
	 *
	 * @param productMeasurementVal the product measurement val of this factories product details add
	 */
	public void setProductMeasurementVal(String productMeasurementVal);

	/**
	 * Returns the counter of this factories product details add.
	 *
	 * @return the counter of this factories product details add
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this factories product details add.
	 *
	 * @param counter the counter of this factories product details add
	 */
	public void setCounter(String counter);

	/**
	 * Returns the factories application ID of this factories product details add.
	 *
	 * @return the factories application ID of this factories product details add
	 */
	public long getFactoriesApplicationId();

	/**
	 * Sets the factories application ID of this factories product details add.
	 *
	 * @param factoriesApplicationId the factories application ID of this factories product details add
	 */
	public void setFactoriesApplicationId(long factoriesApplicationId);

	@Override
	public FactoriesProductDetailsAdd cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}