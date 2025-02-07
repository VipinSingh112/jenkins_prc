/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FactoriesProcessedFoodAct}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProcessedFoodAct
 * @generated
 */
public class FactoriesProcessedFoodActWrapper
	extends BaseModelWrapper<FactoriesProcessedFoodAct>
	implements FactoriesProcessedFoodAct,
			   ModelWrapper<FactoriesProcessedFoodAct> {

	public FactoriesProcessedFoodActWrapper(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		super(factoriesProcessedFoodAct);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"factoriesProcessedFoodActId", getFactoriesProcessedFoodActId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"processedActEstablishmentName",
			getProcessedActEstablishmentName());
		attributes.put(
			"processedActParishAddress", getProcessedActParishAddress());
		attributes.put("processedActAddress", getProcessedActAddress());
		attributes.put(
			"processedActOperatorName", getProcessedActOperatorName());
		attributes.put(
			"processedActOperatorAddress", getProcessedActOperatorAddress());
		attributes.put("processedActParish", getProcessedActParish());
		attributes.put("processedActDescription", getProcessedActDescription());
		attributes.put("establishmentOperated", getEstablishmentOperated());
		attributes.put("processedActLastDate", getProcessedActLastDate());
		attributes.put(
			"processedActManufactured", getProcessedActManufactured());
		attributes.put("processedActDate", getProcessedActDate());
		attributes.put("factoriesApplicationId", getFactoriesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long factoriesProcessedFoodActId = (Long)attributes.get(
			"factoriesProcessedFoodActId");

		if (factoriesProcessedFoodActId != null) {
			setFactoriesProcessedFoodActId(factoriesProcessedFoodActId);
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

		String processedActEstablishmentName = (String)attributes.get(
			"processedActEstablishmentName");

		if (processedActEstablishmentName != null) {
			setProcessedActEstablishmentName(processedActEstablishmentName);
		}

		String processedActParishAddress = (String)attributes.get(
			"processedActParishAddress");

		if (processedActParishAddress != null) {
			setProcessedActParishAddress(processedActParishAddress);
		}

		String processedActAddress = (String)attributes.get(
			"processedActAddress");

		if (processedActAddress != null) {
			setProcessedActAddress(processedActAddress);
		}

		String processedActOperatorName = (String)attributes.get(
			"processedActOperatorName");

		if (processedActOperatorName != null) {
			setProcessedActOperatorName(processedActOperatorName);
		}

		String processedActOperatorAddress = (String)attributes.get(
			"processedActOperatorAddress");

		if (processedActOperatorAddress != null) {
			setProcessedActOperatorAddress(processedActOperatorAddress);
		}

		String processedActParish = (String)attributes.get(
			"processedActParish");

		if (processedActParish != null) {
			setProcessedActParish(processedActParish);
		}

		String processedActDescription = (String)attributes.get(
			"processedActDescription");

		if (processedActDescription != null) {
			setProcessedActDescription(processedActDescription);
		}

		String establishmentOperated = (String)attributes.get(
			"establishmentOperated");

		if (establishmentOperated != null) {
			setEstablishmentOperated(establishmentOperated);
		}

		Date processedActLastDate = (Date)attributes.get(
			"processedActLastDate");

		if (processedActLastDate != null) {
			setProcessedActLastDate(processedActLastDate);
		}

		String processedActManufactured = (String)attributes.get(
			"processedActManufactured");

		if (processedActManufactured != null) {
			setProcessedActManufactured(processedActManufactured);
		}

		Date processedActDate = (Date)attributes.get("processedActDate");

		if (processedActDate != null) {
			setProcessedActDate(processedActDate);
		}

		Long factoriesApplicationId = (Long)attributes.get(
			"factoriesApplicationId");

		if (factoriesApplicationId != null) {
			setFactoriesApplicationId(factoriesApplicationId);
		}
	}

	@Override
	public FactoriesProcessedFoodAct cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this factories processed food act.
	 *
	 * @return the company ID of this factories processed food act
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this factories processed food act.
	 *
	 * @return the create date of this factories processed food act
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the establishment operated of this factories processed food act.
	 *
	 * @return the establishment operated of this factories processed food act
	 */
	@Override
	public String getEstablishmentOperated() {
		return model.getEstablishmentOperated();
	}

	/**
	 * Returns the factories application ID of this factories processed food act.
	 *
	 * @return the factories application ID of this factories processed food act
	 */
	@Override
	public long getFactoriesApplicationId() {
		return model.getFactoriesApplicationId();
	}

	/**
	 * Returns the factories processed food act ID of this factories processed food act.
	 *
	 * @return the factories processed food act ID of this factories processed food act
	 */
	@Override
	public long getFactoriesProcessedFoodActId() {
		return model.getFactoriesProcessedFoodActId();
	}

	/**
	 * Returns the group ID of this factories processed food act.
	 *
	 * @return the group ID of this factories processed food act
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this factories processed food act.
	 *
	 * @return the modified date of this factories processed food act
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this factories processed food act.
	 *
	 * @return the primary key of this factories processed food act
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the processed act address of this factories processed food act.
	 *
	 * @return the processed act address of this factories processed food act
	 */
	@Override
	public String getProcessedActAddress() {
		return model.getProcessedActAddress();
	}

	/**
	 * Returns the processed act date of this factories processed food act.
	 *
	 * @return the processed act date of this factories processed food act
	 */
	@Override
	public Date getProcessedActDate() {
		return model.getProcessedActDate();
	}

	/**
	 * Returns the processed act description of this factories processed food act.
	 *
	 * @return the processed act description of this factories processed food act
	 */
	@Override
	public String getProcessedActDescription() {
		return model.getProcessedActDescription();
	}

	/**
	 * Returns the processed act establishment name of this factories processed food act.
	 *
	 * @return the processed act establishment name of this factories processed food act
	 */
	@Override
	public String getProcessedActEstablishmentName() {
		return model.getProcessedActEstablishmentName();
	}

	/**
	 * Returns the processed act last date of this factories processed food act.
	 *
	 * @return the processed act last date of this factories processed food act
	 */
	@Override
	public Date getProcessedActLastDate() {
		return model.getProcessedActLastDate();
	}

	/**
	 * Returns the processed act manufactured of this factories processed food act.
	 *
	 * @return the processed act manufactured of this factories processed food act
	 */
	@Override
	public String getProcessedActManufactured() {
		return model.getProcessedActManufactured();
	}

	/**
	 * Returns the processed act operator address of this factories processed food act.
	 *
	 * @return the processed act operator address of this factories processed food act
	 */
	@Override
	public String getProcessedActOperatorAddress() {
		return model.getProcessedActOperatorAddress();
	}

	/**
	 * Returns the processed act operator name of this factories processed food act.
	 *
	 * @return the processed act operator name of this factories processed food act
	 */
	@Override
	public String getProcessedActOperatorName() {
		return model.getProcessedActOperatorName();
	}

	/**
	 * Returns the processed act parish of this factories processed food act.
	 *
	 * @return the processed act parish of this factories processed food act
	 */
	@Override
	public String getProcessedActParish() {
		return model.getProcessedActParish();
	}

	/**
	 * Returns the processed act parish address of this factories processed food act.
	 *
	 * @return the processed act parish address of this factories processed food act
	 */
	@Override
	public String getProcessedActParishAddress() {
		return model.getProcessedActParishAddress();
	}

	/**
	 * Returns the user ID of this factories processed food act.
	 *
	 * @return the user ID of this factories processed food act
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this factories processed food act.
	 *
	 * @return the user name of this factories processed food act
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this factories processed food act.
	 *
	 * @return the user uuid of this factories processed food act
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
	 * Sets the company ID of this factories processed food act.
	 *
	 * @param companyId the company ID of this factories processed food act
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this factories processed food act.
	 *
	 * @param createDate the create date of this factories processed food act
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the establishment operated of this factories processed food act.
	 *
	 * @param establishmentOperated the establishment operated of this factories processed food act
	 */
	@Override
	public void setEstablishmentOperated(String establishmentOperated) {
		model.setEstablishmentOperated(establishmentOperated);
	}

	/**
	 * Sets the factories application ID of this factories processed food act.
	 *
	 * @param factoriesApplicationId the factories application ID of this factories processed food act
	 */
	@Override
	public void setFactoriesApplicationId(long factoriesApplicationId) {
		model.setFactoriesApplicationId(factoriesApplicationId);
	}

	/**
	 * Sets the factories processed food act ID of this factories processed food act.
	 *
	 * @param factoriesProcessedFoodActId the factories processed food act ID of this factories processed food act
	 */
	@Override
	public void setFactoriesProcessedFoodActId(
		long factoriesProcessedFoodActId) {

		model.setFactoriesProcessedFoodActId(factoriesProcessedFoodActId);
	}

	/**
	 * Sets the group ID of this factories processed food act.
	 *
	 * @param groupId the group ID of this factories processed food act
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this factories processed food act.
	 *
	 * @param modifiedDate the modified date of this factories processed food act
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this factories processed food act.
	 *
	 * @param primaryKey the primary key of this factories processed food act
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the processed act address of this factories processed food act.
	 *
	 * @param processedActAddress the processed act address of this factories processed food act
	 */
	@Override
	public void setProcessedActAddress(String processedActAddress) {
		model.setProcessedActAddress(processedActAddress);
	}

	/**
	 * Sets the processed act date of this factories processed food act.
	 *
	 * @param processedActDate the processed act date of this factories processed food act
	 */
	@Override
	public void setProcessedActDate(Date processedActDate) {
		model.setProcessedActDate(processedActDate);
	}

	/**
	 * Sets the processed act description of this factories processed food act.
	 *
	 * @param processedActDescription the processed act description of this factories processed food act
	 */
	@Override
	public void setProcessedActDescription(String processedActDescription) {
		model.setProcessedActDescription(processedActDescription);
	}

	/**
	 * Sets the processed act establishment name of this factories processed food act.
	 *
	 * @param processedActEstablishmentName the processed act establishment name of this factories processed food act
	 */
	@Override
	public void setProcessedActEstablishmentName(
		String processedActEstablishmentName) {

		model.setProcessedActEstablishmentName(processedActEstablishmentName);
	}

	/**
	 * Sets the processed act last date of this factories processed food act.
	 *
	 * @param processedActLastDate the processed act last date of this factories processed food act
	 */
	@Override
	public void setProcessedActLastDate(Date processedActLastDate) {
		model.setProcessedActLastDate(processedActLastDate);
	}

	/**
	 * Sets the processed act manufactured of this factories processed food act.
	 *
	 * @param processedActManufactured the processed act manufactured of this factories processed food act
	 */
	@Override
	public void setProcessedActManufactured(String processedActManufactured) {
		model.setProcessedActManufactured(processedActManufactured);
	}

	/**
	 * Sets the processed act operator address of this factories processed food act.
	 *
	 * @param processedActOperatorAddress the processed act operator address of this factories processed food act
	 */
	@Override
	public void setProcessedActOperatorAddress(
		String processedActOperatorAddress) {

		model.setProcessedActOperatorAddress(processedActOperatorAddress);
	}

	/**
	 * Sets the processed act operator name of this factories processed food act.
	 *
	 * @param processedActOperatorName the processed act operator name of this factories processed food act
	 */
	@Override
	public void setProcessedActOperatorName(String processedActOperatorName) {
		model.setProcessedActOperatorName(processedActOperatorName);
	}

	/**
	 * Sets the processed act parish of this factories processed food act.
	 *
	 * @param processedActParish the processed act parish of this factories processed food act
	 */
	@Override
	public void setProcessedActParish(String processedActParish) {
		model.setProcessedActParish(processedActParish);
	}

	/**
	 * Sets the processed act parish address of this factories processed food act.
	 *
	 * @param processedActParishAddress the processed act parish address of this factories processed food act
	 */
	@Override
	public void setProcessedActParishAddress(String processedActParishAddress) {
		model.setProcessedActParishAddress(processedActParishAddress);
	}

	/**
	 * Sets the user ID of this factories processed food act.
	 *
	 * @param userId the user ID of this factories processed food act
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this factories processed food act.
	 *
	 * @param userName the user name of this factories processed food act
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this factories processed food act.
	 *
	 * @param userUuid the user uuid of this factories processed food act
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
	protected FactoriesProcessedFoodActWrapper wrap(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return new FactoriesProcessedFoodActWrapper(factoriesProcessedFoodAct);
	}

}