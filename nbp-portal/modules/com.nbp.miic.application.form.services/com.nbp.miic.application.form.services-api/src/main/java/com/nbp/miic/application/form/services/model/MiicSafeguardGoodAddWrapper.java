/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiicSafeguardGoodAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAdd
 * @generated
 */
public class MiicSafeguardGoodAddWrapper
	extends BaseModelWrapper<MiicSafeguardGoodAdd>
	implements MiicSafeguardGoodAdd, ModelWrapper<MiicSafeguardGoodAdd> {

	public MiicSafeguardGoodAddWrapper(
		MiicSafeguardGoodAdd miicSafeguardGoodAdd) {

		super(miicSafeguardGoodAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("miicSafeguardGoodAddId", getMiicSafeguardGoodAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tariffHeadingNum", getTariffHeadingNum());
		attributes.put("description", getDescription());
		attributes.put("amountQuantity", getAmountQuantity());
		attributes.put("amountEstimate", getAmountEstimate());
		attributes.put("resonForRequest", getResonForRequest());
		attributes.put("counter", getCounter());
		attributes.put("miicApplicationId", getMiicApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miicSafeguardGoodAddId = (Long)attributes.get(
			"miicSafeguardGoodAddId");

		if (miicSafeguardGoodAddId != null) {
			setMiicSafeguardGoodAddId(miicSafeguardGoodAddId);
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

		String tariffHeadingNum = (String)attributes.get("tariffHeadingNum");

		if (tariffHeadingNum != null) {
			setTariffHeadingNum(tariffHeadingNum);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String amountQuantity = (String)attributes.get("amountQuantity");

		if (amountQuantity != null) {
			setAmountQuantity(amountQuantity);
		}

		String amountEstimate = (String)attributes.get("amountEstimate");

		if (amountEstimate != null) {
			setAmountEstimate(amountEstimate);
		}

		String resonForRequest = (String)attributes.get("resonForRequest");

		if (resonForRequest != null) {
			setResonForRequest(resonForRequest);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long miicApplicationId = (Long)attributes.get("miicApplicationId");

		if (miicApplicationId != null) {
			setMiicApplicationId(miicApplicationId);
		}
	}

	@Override
	public MiicSafeguardGoodAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount estimate of this miic safeguard good add.
	 *
	 * @return the amount estimate of this miic safeguard good add
	 */
	@Override
	public String getAmountEstimate() {
		return model.getAmountEstimate();
	}

	/**
	 * Returns the amount quantity of this miic safeguard good add.
	 *
	 * @return the amount quantity of this miic safeguard good add
	 */
	@Override
	public String getAmountQuantity() {
		return model.getAmountQuantity();
	}

	/**
	 * Returns the company ID of this miic safeguard good add.
	 *
	 * @return the company ID of this miic safeguard good add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this miic safeguard good add.
	 *
	 * @return the counter of this miic safeguard good add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this miic safeguard good add.
	 *
	 * @return the create date of this miic safeguard good add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this miic safeguard good add.
	 *
	 * @return the description of this miic safeguard good add
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this miic safeguard good add.
	 *
	 * @return the group ID of this miic safeguard good add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the miic application ID of this miic safeguard good add.
	 *
	 * @return the miic application ID of this miic safeguard good add
	 */
	@Override
	public long getMiicApplicationId() {
		return model.getMiicApplicationId();
	}

	/**
	 * Returns the miic safeguard good add ID of this miic safeguard good add.
	 *
	 * @return the miic safeguard good add ID of this miic safeguard good add
	 */
	@Override
	public long getMiicSafeguardGoodAddId() {
		return model.getMiicSafeguardGoodAddId();
	}

	/**
	 * Returns the modified date of this miic safeguard good add.
	 *
	 * @return the modified date of this miic safeguard good add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this miic safeguard good add.
	 *
	 * @return the primary key of this miic safeguard good add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the reson for request of this miic safeguard good add.
	 *
	 * @return the reson for request of this miic safeguard good add
	 */
	@Override
	public String getResonForRequest() {
		return model.getResonForRequest();
	}

	/**
	 * Returns the tariff heading num of this miic safeguard good add.
	 *
	 * @return the tariff heading num of this miic safeguard good add
	 */
	@Override
	public String getTariffHeadingNum() {
		return model.getTariffHeadingNum();
	}

	/**
	 * Returns the user ID of this miic safeguard good add.
	 *
	 * @return the user ID of this miic safeguard good add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this miic safeguard good add.
	 *
	 * @return the user name of this miic safeguard good add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this miic safeguard good add.
	 *
	 * @return the user uuid of this miic safeguard good add
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
	 * Sets the amount estimate of this miic safeguard good add.
	 *
	 * @param amountEstimate the amount estimate of this miic safeguard good add
	 */
	@Override
	public void setAmountEstimate(String amountEstimate) {
		model.setAmountEstimate(amountEstimate);
	}

	/**
	 * Sets the amount quantity of this miic safeguard good add.
	 *
	 * @param amountQuantity the amount quantity of this miic safeguard good add
	 */
	@Override
	public void setAmountQuantity(String amountQuantity) {
		model.setAmountQuantity(amountQuantity);
	}

	/**
	 * Sets the company ID of this miic safeguard good add.
	 *
	 * @param companyId the company ID of this miic safeguard good add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this miic safeguard good add.
	 *
	 * @param counter the counter of this miic safeguard good add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this miic safeguard good add.
	 *
	 * @param createDate the create date of this miic safeguard good add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this miic safeguard good add.
	 *
	 * @param description the description of this miic safeguard good add
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this miic safeguard good add.
	 *
	 * @param groupId the group ID of this miic safeguard good add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the miic application ID of this miic safeguard good add.
	 *
	 * @param miicApplicationId the miic application ID of this miic safeguard good add
	 */
	@Override
	public void setMiicApplicationId(long miicApplicationId) {
		model.setMiicApplicationId(miicApplicationId);
	}

	/**
	 * Sets the miic safeguard good add ID of this miic safeguard good add.
	 *
	 * @param miicSafeguardGoodAddId the miic safeguard good add ID of this miic safeguard good add
	 */
	@Override
	public void setMiicSafeguardGoodAddId(long miicSafeguardGoodAddId) {
		model.setMiicSafeguardGoodAddId(miicSafeguardGoodAddId);
	}

	/**
	 * Sets the modified date of this miic safeguard good add.
	 *
	 * @param modifiedDate the modified date of this miic safeguard good add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this miic safeguard good add.
	 *
	 * @param primaryKey the primary key of this miic safeguard good add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the reson for request of this miic safeguard good add.
	 *
	 * @param resonForRequest the reson for request of this miic safeguard good add
	 */
	@Override
	public void setResonForRequest(String resonForRequest) {
		model.setResonForRequest(resonForRequest);
	}

	/**
	 * Sets the tariff heading num of this miic safeguard good add.
	 *
	 * @param tariffHeadingNum the tariff heading num of this miic safeguard good add
	 */
	@Override
	public void setTariffHeadingNum(String tariffHeadingNum) {
		model.setTariffHeadingNum(tariffHeadingNum);
	}

	/**
	 * Sets the user ID of this miic safeguard good add.
	 *
	 * @param userId the user ID of this miic safeguard good add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this miic safeguard good add.
	 *
	 * @param userName the user name of this miic safeguard good add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this miic safeguard good add.
	 *
	 * @param userUuid the user uuid of this miic safeguard good add
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
	protected MiicSafeguardGoodAddWrapper wrap(
		MiicSafeguardGoodAdd miicSafeguardGoodAdd) {

		return new MiicSafeguardGoodAddWrapper(miicSafeguardGoodAdd);
	}

}