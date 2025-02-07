/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PackagingProcess}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PackagingProcess
 * @generated
 */
public class PackagingProcessWrapper
	extends BaseModelWrapper<PackagingProcess>
	implements ModelWrapper<PackagingProcess>, PackagingProcess {

	public PackagingProcessWrapper(PackagingProcess packagingProcess) {
		super(packagingProcess);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("packagingProcessId", getPackagingProcessId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("packagingProcess", getPackagingProcess());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long packagingProcessId = (Long)attributes.get("packagingProcessId");

		if (packagingProcessId != null) {
			setPackagingProcessId(packagingProcessId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String packagingProcess = (String)attributes.get("packagingProcess");

		if (packagingProcess != null) {
			setPackagingProcess(packagingProcess);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}
	}

	@Override
	public PackagingProcess cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this packaging process.
	 *
	 * @return the company ID of this packaging process
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this packaging process.
	 *
	 * @return the create date of this packaging process
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this packaging process.
	 *
	 * @return the group ID of this packaging process
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manufacturing application ID of this packaging process.
	 *
	 * @return the manufacturing application ID of this packaging process
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this packaging process.
	 *
	 * @return the modified date of this packaging process
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the packaging process of this packaging process.
	 *
	 * @return the packaging process of this packaging process
	 */
	@Override
	public String getPackagingProcess() {
		return model.getPackagingProcess();
	}

	/**
	 * Returns the packaging process ID of this packaging process.
	 *
	 * @return the packaging process ID of this packaging process
	 */
	@Override
	public long getPackagingProcessId() {
		return model.getPackagingProcessId();
	}

	/**
	 * Returns the primary key of this packaging process.
	 *
	 * @return the primary key of this packaging process
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this packaging process.
	 *
	 * @return the user ID of this packaging process
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this packaging process.
	 *
	 * @return the user name of this packaging process
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this packaging process.
	 *
	 * @return the user uuid of this packaging process
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this packaging process.
	 *
	 * @param companyId the company ID of this packaging process
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this packaging process.
	 *
	 * @param createDate the create date of this packaging process
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this packaging process.
	 *
	 * @param groupId the group ID of this packaging process
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manufacturing application ID of this packaging process.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this packaging process
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this packaging process.
	 *
	 * @param modifiedDate the modified date of this packaging process
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the packaging process of this packaging process.
	 *
	 * @param packagingProcess the packaging process of this packaging process
	 */
	@Override
	public void setPackagingProcess(String packagingProcess) {
		model.setPackagingProcess(packagingProcess);
	}

	/**
	 * Sets the packaging process ID of this packaging process.
	 *
	 * @param packagingProcessId the packaging process ID of this packaging process
	 */
	@Override
	public void setPackagingProcessId(long packagingProcessId) {
		model.setPackagingProcessId(packagingProcessId);
	}

	/**
	 * Sets the primary key of this packaging process.
	 *
	 * @param primaryKey the primary key of this packaging process
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this packaging process.
	 *
	 * @param userId the user ID of this packaging process
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this packaging process.
	 *
	 * @param userName the user name of this packaging process
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this packaging process.
	 *
	 * @param userUuid the user uuid of this packaging process
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected PackagingProcessWrapper wrap(PackagingProcess packagingProcess) {
		return new PackagingProcessWrapper(packagingProcess);
	}

}