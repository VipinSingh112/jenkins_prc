/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WRAReqIrrigation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAReqIrrigation
 * @generated
 */
public class WRAReqIrrigationWrapper
	extends BaseModelWrapper<WRAReqIrrigation>
	implements ModelWrapper<WRAReqIrrigation>, WRAReqIrrigation {

	public WRAReqIrrigationWrapper(WRAReqIrrigation wraReqIrrigation) {
		super(wraReqIrrigation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wraReqIrrigationId", getWraReqIrrigationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("abstractAreaIrrigated", getAbstractAreaIrrigated());
		attributes.put("abstractSystemIrrigated", getAbstractSystemIrrigated());
		attributes.put("counter", getCounter());
		attributes.put("wraApplicationId", getWraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wraReqIrrigationId = (Long)attributes.get("wraReqIrrigationId");

		if (wraReqIrrigationId != null) {
			setWraReqIrrigationId(wraReqIrrigationId);
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

		String abstractAreaIrrigated = (String)attributes.get(
			"abstractAreaIrrigated");

		if (abstractAreaIrrigated != null) {
			setAbstractAreaIrrigated(abstractAreaIrrigated);
		}

		String abstractSystemIrrigated = (String)attributes.get(
			"abstractSystemIrrigated");

		if (abstractSystemIrrigated != null) {
			setAbstractSystemIrrigated(abstractSystemIrrigated);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
		}
	}

	@Override
	public WRAReqIrrigation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the abstract area irrigated of this wra req irrigation.
	 *
	 * @return the abstract area irrigated of this wra req irrigation
	 */
	@Override
	public String getAbstractAreaIrrigated() {
		return model.getAbstractAreaIrrigated();
	}

	/**
	 * Returns the abstract system irrigated of this wra req irrigation.
	 *
	 * @return the abstract system irrigated of this wra req irrigation
	 */
	@Override
	public String getAbstractSystemIrrigated() {
		return model.getAbstractSystemIrrigated();
	}

	/**
	 * Returns the company ID of this wra req irrigation.
	 *
	 * @return the company ID of this wra req irrigation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this wra req irrigation.
	 *
	 * @return the counter of this wra req irrigation
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this wra req irrigation.
	 *
	 * @return the create date of this wra req irrigation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this wra req irrigation.
	 *
	 * @return the group ID of this wra req irrigation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this wra req irrigation.
	 *
	 * @return the modified date of this wra req irrigation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this wra req irrigation.
	 *
	 * @return the primary key of this wra req irrigation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this wra req irrigation.
	 *
	 * @return the user ID of this wra req irrigation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this wra req irrigation.
	 *
	 * @return the user name of this wra req irrigation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this wra req irrigation.
	 *
	 * @return the user uuid of this wra req irrigation
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the wra application ID of this wra req irrigation.
	 *
	 * @return the wra application ID of this wra req irrigation
	 */
	@Override
	public long getWraApplicationId() {
		return model.getWraApplicationId();
	}

	/**
	 * Returns the wra req irrigation ID of this wra req irrigation.
	 *
	 * @return the wra req irrigation ID of this wra req irrigation
	 */
	@Override
	public long getWraReqIrrigationId() {
		return model.getWraReqIrrigationId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the abstract area irrigated of this wra req irrigation.
	 *
	 * @param abstractAreaIrrigated the abstract area irrigated of this wra req irrigation
	 */
	@Override
	public void setAbstractAreaIrrigated(String abstractAreaIrrigated) {
		model.setAbstractAreaIrrigated(abstractAreaIrrigated);
	}

	/**
	 * Sets the abstract system irrigated of this wra req irrigation.
	 *
	 * @param abstractSystemIrrigated the abstract system irrigated of this wra req irrigation
	 */
	@Override
	public void setAbstractSystemIrrigated(String abstractSystemIrrigated) {
		model.setAbstractSystemIrrigated(abstractSystemIrrigated);
	}

	/**
	 * Sets the company ID of this wra req irrigation.
	 *
	 * @param companyId the company ID of this wra req irrigation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this wra req irrigation.
	 *
	 * @param counter the counter of this wra req irrigation
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this wra req irrigation.
	 *
	 * @param createDate the create date of this wra req irrigation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this wra req irrigation.
	 *
	 * @param groupId the group ID of this wra req irrigation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this wra req irrigation.
	 *
	 * @param modifiedDate the modified date of this wra req irrigation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this wra req irrigation.
	 *
	 * @param primaryKey the primary key of this wra req irrigation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this wra req irrigation.
	 *
	 * @param userId the user ID of this wra req irrigation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this wra req irrigation.
	 *
	 * @param userName the user name of this wra req irrigation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this wra req irrigation.
	 *
	 * @param userUuid the user uuid of this wra req irrigation
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the wra application ID of this wra req irrigation.
	 *
	 * @param wraApplicationId the wra application ID of this wra req irrigation
	 */
	@Override
	public void setWraApplicationId(long wraApplicationId) {
		model.setWraApplicationId(wraApplicationId);
	}

	/**
	 * Sets the wra req irrigation ID of this wra req irrigation.
	 *
	 * @param wraReqIrrigationId the wra req irrigation ID of this wra req irrigation
	 */
	@Override
	public void setWraReqIrrigationId(long wraReqIrrigationId) {
		model.setWraReqIrrigationId(wraReqIrrigationId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected WRAReqIrrigationWrapper wrap(WRAReqIrrigation wraReqIrrigation) {
		return new WRAReqIrrigationWrapper(wraReqIrrigation);
	}

}