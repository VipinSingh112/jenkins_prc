/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AgricultureCrop service. Represents a row in the &quot;agriculture_crop&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.agriculture.application.form.service.model.impl.AgricultureCropModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.agriculture.application.form.service.model.impl.AgricultureCropImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureCrop
 * @generated
 */
@ProviderType
public interface AgricultureCropModel
	extends BaseModel<AgricultureCrop>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a agriculture crop model instance should use the {@link AgricultureCrop} interface instead.
	 */

	/**
	 * Returns the primary key of this agriculture crop.
	 *
	 * @return the primary key of this agriculture crop
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this agriculture crop.
	 *
	 * @param primaryKey the primary key of this agriculture crop
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the agriculture crop ID of this agriculture crop.
	 *
	 * @return the agriculture crop ID of this agriculture crop
	 */
	public long getAgricultureCropId();

	/**
	 * Sets the agriculture crop ID of this agriculture crop.
	 *
	 * @param agricultureCropId the agriculture crop ID of this agriculture crop
	 */
	public void setAgricultureCropId(long agricultureCropId);

	/**
	 * Returns the group ID of this agriculture crop.
	 *
	 * @return the group ID of this agriculture crop
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this agriculture crop.
	 *
	 * @param groupId the group ID of this agriculture crop
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this agriculture crop.
	 *
	 * @return the company ID of this agriculture crop
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this agriculture crop.
	 *
	 * @param companyId the company ID of this agriculture crop
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this agriculture crop.
	 *
	 * @return the user ID of this agriculture crop
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this agriculture crop.
	 *
	 * @param userId the user ID of this agriculture crop
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this agriculture crop.
	 *
	 * @return the user uuid of this agriculture crop
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this agriculture crop.
	 *
	 * @param userUuid the user uuid of this agriculture crop
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this agriculture crop.
	 *
	 * @return the user name of this agriculture crop
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this agriculture crop.
	 *
	 * @param userName the user name of this agriculture crop
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this agriculture crop.
	 *
	 * @return the create date of this agriculture crop
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this agriculture crop.
	 *
	 * @param createDate the create date of this agriculture crop
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this agriculture crop.
	 *
	 * @return the modified date of this agriculture crop
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this agriculture crop.
	 *
	 * @param modifiedDate the modified date of this agriculture crop
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the crop type of this agriculture crop.
	 *
	 * @return the crop type of this agriculture crop
	 */
	@AutoEscape
	public String getCropType();

	/**
	 * Sets the crop type of this agriculture crop.
	 *
	 * @param cropType the crop type of this agriculture crop
	 */
	public void setCropType(String cropType);

	/**
	 * Returns the crop hectare of this agriculture crop.
	 *
	 * @return the crop hectare of this agriculture crop
	 */
	@AutoEscape
	public String getCropHectare();

	/**
	 * Sets the crop hectare of this agriculture crop.
	 *
	 * @param cropHectare the crop hectare of this agriculture crop
	 */
	public void setCropHectare(String cropHectare);

	/**
	 * Returns the average annual production of this agriculture crop.
	 *
	 * @return the average annual production of this agriculture crop
	 */
	@AutoEscape
	public String getAverageAnnualProduction();

	/**
	 * Sets the average annual production of this agriculture crop.
	 *
	 * @param averageAnnualProduction the average annual production of this agriculture crop
	 */
	public void setAverageAnnualProduction(String averageAnnualProduction);

	/**
	 * Returns the crop market local of this agriculture crop.
	 *
	 * @return the crop market local of this agriculture crop
	 */
	@AutoEscape
	public String getCropMarketLocal();

	/**
	 * Sets the crop market local of this agriculture crop.
	 *
	 * @param cropMarketLocal the crop market local of this agriculture crop
	 */
	public void setCropMarketLocal(String cropMarketLocal);

	/**
	 * Returns the crop market foreign of this agriculture crop.
	 *
	 * @return the crop market foreign of this agriculture crop
	 */
	@AutoEscape
	public String getCropMarketForeign();

	/**
	 * Sets the crop market foreign of this agriculture crop.
	 *
	 * @param cropMarketForeign the crop market foreign of this agriculture crop
	 */
	public void setCropMarketForeign(String cropMarketForeign);

	/**
	 * Returns the value of sale of this agriculture crop.
	 *
	 * @return the value of sale of this agriculture crop
	 */
	@AutoEscape
	public String getValueOfSale();

	/**
	 * Sets the value of sale of this agriculture crop.
	 *
	 * @param valueOfSale the value of sale of this agriculture crop
	 */
	public void setValueOfSale(String valueOfSale);

	/**
	 * Returns the crop counter of this agriculture crop.
	 *
	 * @return the crop counter of this agriculture crop
	 */
	@AutoEscape
	public String getCropCounter();

	/**
	 * Sets the crop counter of this agriculture crop.
	 *
	 * @param cropCounter the crop counter of this agriculture crop
	 */
	public void setCropCounter(String cropCounter);

	/**
	 * Returns the agriculture application ID of this agriculture crop.
	 *
	 * @return the agriculture application ID of this agriculture crop
	 */
	public long getAgricultureApplicationId();

	/**
	 * Sets the agriculture application ID of this agriculture crop.
	 *
	 * @param agricultureApplicationId the agriculture application ID of this agriculture crop
	 */
	public void setAgricultureApplicationId(long agricultureApplicationId);

	@Override
	public AgricultureCrop cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}