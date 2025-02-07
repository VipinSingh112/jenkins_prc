/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the NcraVerifyWeighingDeviceInfo service. Represents a row in the &quot;nbp_ncra_verify_weigh_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDeviceInfo
 * @generated
 */
@ProviderType
public interface NcraVerifyWeighingDeviceInfoModel
	extends BaseModel<NcraVerifyWeighingDeviceInfo>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ncra verify weighing device info model instance should use the {@link NcraVerifyWeighingDeviceInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this ncra verify weighing device info.
	 *
	 * @return the primary key of this ncra verify weighing device info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ncra verify weighing device info.
	 *
	 * @param primaryKey the primary key of this ncra verify weighing device info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ncra verify weighing device info ID of this ncra verify weighing device info.
	 *
	 * @return the ncra verify weighing device info ID of this ncra verify weighing device info
	 */
	public long getNcraVerifyWeighingDeviceInfoId();

	/**
	 * Sets the ncra verify weighing device info ID of this ncra verify weighing device info.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the ncra verify weighing device info ID of this ncra verify weighing device info
	 */
	public void setNcraVerifyWeighingDeviceInfoId(
		long ncraVerifyWeighingDeviceInfoId);

	/**
	 * Returns the group ID of this ncra verify weighing device info.
	 *
	 * @return the group ID of this ncra verify weighing device info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this ncra verify weighing device info.
	 *
	 * @param groupId the group ID of this ncra verify weighing device info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ncra verify weighing device info.
	 *
	 * @return the company ID of this ncra verify weighing device info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ncra verify weighing device info.
	 *
	 * @param companyId the company ID of this ncra verify weighing device info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ncra verify weighing device info.
	 *
	 * @return the user ID of this ncra verify weighing device info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ncra verify weighing device info.
	 *
	 * @param userId the user ID of this ncra verify weighing device info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ncra verify weighing device info.
	 *
	 * @return the user uuid of this ncra verify weighing device info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ncra verify weighing device info.
	 *
	 * @param userUuid the user uuid of this ncra verify weighing device info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ncra verify weighing device info.
	 *
	 * @return the user name of this ncra verify weighing device info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ncra verify weighing device info.
	 *
	 * @param userName the user name of this ncra verify weighing device info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ncra verify weighing device info.
	 *
	 * @return the create date of this ncra verify weighing device info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ncra verify weighing device info.
	 *
	 * @param createDate the create date of this ncra verify weighing device info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ncra verify weighing device info.
	 *
	 * @return the modified date of this ncra verify weighing device info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ncra verify weighing device info.
	 *
	 * @param modifiedDate the modified date of this ncra verify weighing device info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the typeof device of this ncra verify weighing device info.
	 *
	 * @return the typeof device of this ncra verify weighing device info
	 */
	@AutoEscape
	public String getTypeofDevice();

	/**
	 * Sets the typeof device of this ncra verify weighing device info.
	 *
	 * @param typeofDevice the typeof device of this ncra verify weighing device info
	 */
	public void setTypeofDevice(String typeofDevice);

	/**
	 * Returns the manufacturer of this ncra verify weighing device info.
	 *
	 * @return the manufacturer of this ncra verify weighing device info
	 */
	@AutoEscape
	public String getManufacturer();

	/**
	 * Sets the manufacturer of this ncra verify weighing device info.
	 *
	 * @param manufacturer the manufacturer of this ncra verify weighing device info
	 */
	public void setManufacturer(String manufacturer);

	/**
	 * Returns the serial number of this ncra verify weighing device info.
	 *
	 * @return the serial number of this ncra verify weighing device info
	 */
	@AutoEscape
	public String getSerialNumber();

	/**
	 * Sets the serial number of this ncra verify weighing device info.
	 *
	 * @param serialNumber the serial number of this ncra verify weighing device info
	 */
	public void setSerialNumber(String serialNumber);

	/**
	 * Returns the quantity of this ncra verify weighing device info.
	 *
	 * @return the quantity of this ncra verify weighing device info
	 */
	@AutoEscape
	public String getQuantity();

	/**
	 * Sets the quantity of this ncra verify weighing device info.
	 *
	 * @param quantity the quantity of this ncra verify weighing device info
	 */
	public void setQuantity(String quantity);

	/**
	 * Returns the maximum capacity of this ncra verify weighing device info.
	 *
	 * @return the maximum capacity of this ncra verify weighing device info
	 */
	@AutoEscape
	public String getMaximumCapacity();

	/**
	 * Sets the maximum capacity of this ncra verify weighing device info.
	 *
	 * @param maximumCapacity the maximum capacity of this ncra verify weighing device info
	 */
	public void setMaximumCapacity(String maximumCapacity);

	/**
	 * Returns the counter of this ncra verify weighing device info.
	 *
	 * @return the counter of this ncra verify weighing device info
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this ncra verify weighing device info.
	 *
	 * @param counter the counter of this ncra verify weighing device info
	 */
	public void setCounter(String counter);

	/**
	 * Returns the ncra application ID of this ncra verify weighing device info.
	 *
	 * @return the ncra application ID of this ncra verify weighing device info
	 */
	public long getNcraApplicationId();

	/**
	 * Sets the ncra application ID of this ncra verify weighing device info.
	 *
	 * @param ncraApplicationId the ncra application ID of this ncra verify weighing device info
	 */
	public void setNcraApplicationId(long ncraApplicationId);

	@Override
	public NcraVerifyWeighingDeviceInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}