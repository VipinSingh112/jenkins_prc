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
 * The base model interface for the AddPhyResourceFirst service. Represents a row in the &quot;nbp_janaac_add_ins_phy_first&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceFirstModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceFirstImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceFirst
 * @generated
 */
@ProviderType
public interface AddPhyResourceFirstModel
	extends BaseModel<AddPhyResourceFirst>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a add phy resource first model instance should use the {@link AddPhyResourceFirst} interface instead.
	 */

	/**
	 * Returns the primary key of this add phy resource first.
	 *
	 * @return the primary key of this add phy resource first
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this add phy resource first.
	 *
	 * @param primaryKey the primary key of this add phy resource first
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the add phy resource first ID of this add phy resource first.
	 *
	 * @return the add phy resource first ID of this add phy resource first
	 */
	public long getAddPhyResourceFirstId();

	/**
	 * Sets the add phy resource first ID of this add phy resource first.
	 *
	 * @param addPhyResourceFirstId the add phy resource first ID of this add phy resource first
	 */
	public void setAddPhyResourceFirstId(long addPhyResourceFirstId);

	/**
	 * Returns the group ID of this add phy resource first.
	 *
	 * @return the group ID of this add phy resource first
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this add phy resource first.
	 *
	 * @param groupId the group ID of this add phy resource first
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this add phy resource first.
	 *
	 * @return the company ID of this add phy resource first
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this add phy resource first.
	 *
	 * @param companyId the company ID of this add phy resource first
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this add phy resource first.
	 *
	 * @return the user ID of this add phy resource first
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this add phy resource first.
	 *
	 * @param userId the user ID of this add phy resource first
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this add phy resource first.
	 *
	 * @return the user uuid of this add phy resource first
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this add phy resource first.
	 *
	 * @param userUuid the user uuid of this add phy resource first
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this add phy resource first.
	 *
	 * @return the user name of this add phy resource first
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this add phy resource first.
	 *
	 * @param userName the user name of this add phy resource first
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this add phy resource first.
	 *
	 * @return the create date of this add phy resource first
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this add phy resource first.
	 *
	 * @param createDate the create date of this add phy resource first
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this add phy resource first.
	 *
	 * @return the modified date of this add phy resource first
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this add phy resource first.
	 *
	 * @param modifiedDate the modified date of this add phy resource first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the inventory number of this add phy resource first.
	 *
	 * @return the inventory number of this add phy resource first
	 */
	@AutoEscape
	public String getInventoryNumber();

	/**
	 * Sets the inventory number of this add phy resource first.
	 *
	 * @param inventoryNumber the inventory number of this add phy resource first
	 */
	public void setInventoryNumber(String inventoryNumber);

	/**
	 * Returns the item of this add phy resource first.
	 *
	 * @return the item of this add phy resource first
	 */
	@AutoEscape
	public String getItem();

	/**
	 * Sets the item of this add phy resource first.
	 *
	 * @param item the item of this add phy resource first
	 */
	public void setItem(String item);

	/**
	 * Returns the manufacturer of this add phy resource first.
	 *
	 * @return the manufacturer of this add phy resource first
	 */
	@AutoEscape
	public String getManufacturer();

	/**
	 * Sets the manufacturer of this add phy resource first.
	 *
	 * @param manufacturer the manufacturer of this add phy resource first
	 */
	public void setManufacturer(String manufacturer);

	/**
	 * Returns the model number of this add phy resource first.
	 *
	 * @return the model number of this add phy resource first
	 */
	@AutoEscape
	public String getModelNumber();

	/**
	 * Sets the model number of this add phy resource first.
	 *
	 * @param modelNumber the model number of this add phy resource first
	 */
	public void setModelNumber(String modelNumber);

	/**
	 * Returns the calibration interval of this add phy resource first.
	 *
	 * @return the calibration interval of this add phy resource first
	 */
	@AutoEscape
	public String getCalibrationInterval();

	/**
	 * Sets the calibration interval of this add phy resource first.
	 *
	 * @param calibrationInterval the calibration interval of this add phy resource first
	 */
	public void setCalibrationInterval(String calibrationInterval);

	/**
	 * Returns the calibrated by of this add phy resource first.
	 *
	 * @return the calibrated by of this add phy resource first
	 */
	@AutoEscape
	public String getCalibratedBy();

	/**
	 * Sets the calibrated by of this add phy resource first.
	 *
	 * @param calibratedBy the calibrated by of this add phy resource first
	 */
	public void setCalibratedBy(String calibratedBy);

	/**
	 * Returns the janaac application ID of this add phy resource first.
	 *
	 * @return the janaac application ID of this add phy resource first
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this add phy resource first.
	 *
	 * @param janaacApplicationId the janaac application ID of this add phy resource first
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	/**
	 * Returns the counter of this add phy resource first.
	 *
	 * @return the counter of this add phy resource first
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this add phy resource first.
	 *
	 * @param counter the counter of this add phy resource first
	 */
	public void setCounter(String counter);

	@Override
	public AddPhyResourceFirst cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}