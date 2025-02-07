/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismAnnualEntertainBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismAnnualEntertainBox
 * @generated
 */
public class TourismAnnualEntertainBoxWrapper
	extends BaseModelWrapper<TourismAnnualEntertainBox>
	implements ModelWrapper<TourismAnnualEntertainBox>,
			   TourismAnnualEntertainBox {

	public TourismAnnualEntertainBoxWrapper(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		super(tourismAnnualEntertainBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismAnnualEntertainBoxId", getTourismAnnualEntertainBoxId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("service", getService());
		attributes.put("local", getLocal());
		attributes.put("foreign", getForeign());
		attributes.put("enterCounter", getEnterCounter());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismAnnualEntertainBoxId = (Long)attributes.get(
			"tourismAnnualEntertainBoxId");

		if (tourismAnnualEntertainBoxId != null) {
			setTourismAnnualEntertainBoxId(tourismAnnualEntertainBoxId);
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

		String service = (String)attributes.get("service");

		if (service != null) {
			setService(service);
		}

		String local = (String)attributes.get("local");

		if (local != null) {
			setLocal(local);
		}

		String foreign = (String)attributes.get("foreign");

		if (foreign != null) {
			setForeign(foreign);
		}

		String enterCounter = (String)attributes.get("enterCounter");

		if (enterCounter != null) {
			setEnterCounter(enterCounter);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismAnnualEntertainBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism annual entertain box.
	 *
	 * @return the company ID of this tourism annual entertain box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism annual entertain box.
	 *
	 * @return the create date of this tourism annual entertain box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the enter counter of this tourism annual entertain box.
	 *
	 * @return the enter counter of this tourism annual entertain box
	 */
	@Override
	public String getEnterCounter() {
		return model.getEnterCounter();
	}

	/**
	 * Returns the foreign of this tourism annual entertain box.
	 *
	 * @return the foreign of this tourism annual entertain box
	 */
	@Override
	public String getForeign() {
		return model.getForeign();
	}

	/**
	 * Returns the group ID of this tourism annual entertain box.
	 *
	 * @return the group ID of this tourism annual entertain box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the local of this tourism annual entertain box.
	 *
	 * @return the local of this tourism annual entertain box
	 */
	@Override
	public String getLocal() {
		return model.getLocal();
	}

	/**
	 * Returns the modified date of this tourism annual entertain box.
	 *
	 * @return the modified date of this tourism annual entertain box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism annual entertain box.
	 *
	 * @return the primary key of this tourism annual entertain box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the service of this tourism annual entertain box.
	 *
	 * @return the service of this tourism annual entertain box
	 */
	@Override
	public String getService() {
		return model.getService();
	}

	/**
	 * Returns the tourism annual entertain box ID of this tourism annual entertain box.
	 *
	 * @return the tourism annual entertain box ID of this tourism annual entertain box
	 */
	@Override
	public long getTourismAnnualEntertainBoxId() {
		return model.getTourismAnnualEntertainBoxId();
	}

	/**
	 * Returns the tourism application ID of this tourism annual entertain box.
	 *
	 * @return the tourism application ID of this tourism annual entertain box
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the user ID of this tourism annual entertain box.
	 *
	 * @return the user ID of this tourism annual entertain box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism annual entertain box.
	 *
	 * @return the user name of this tourism annual entertain box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism annual entertain box.
	 *
	 * @return the user uuid of this tourism annual entertain box
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
	 * Sets the company ID of this tourism annual entertain box.
	 *
	 * @param companyId the company ID of this tourism annual entertain box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism annual entertain box.
	 *
	 * @param createDate the create date of this tourism annual entertain box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the enter counter of this tourism annual entertain box.
	 *
	 * @param enterCounter the enter counter of this tourism annual entertain box
	 */
	@Override
	public void setEnterCounter(String enterCounter) {
		model.setEnterCounter(enterCounter);
	}

	/**
	 * Sets the foreign of this tourism annual entertain box.
	 *
	 * @param foreign the foreign of this tourism annual entertain box
	 */
	@Override
	public void setForeign(String foreign) {
		model.setForeign(foreign);
	}

	/**
	 * Sets the group ID of this tourism annual entertain box.
	 *
	 * @param groupId the group ID of this tourism annual entertain box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the local of this tourism annual entertain box.
	 *
	 * @param local the local of this tourism annual entertain box
	 */
	@Override
	public void setLocal(String local) {
		model.setLocal(local);
	}

	/**
	 * Sets the modified date of this tourism annual entertain box.
	 *
	 * @param modifiedDate the modified date of this tourism annual entertain box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism annual entertain box.
	 *
	 * @param primaryKey the primary key of this tourism annual entertain box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the service of this tourism annual entertain box.
	 *
	 * @param service the service of this tourism annual entertain box
	 */
	@Override
	public void setService(String service) {
		model.setService(service);
	}

	/**
	 * Sets the tourism annual entertain box ID of this tourism annual entertain box.
	 *
	 * @param tourismAnnualEntertainBoxId the tourism annual entertain box ID of this tourism annual entertain box
	 */
	@Override
	public void setTourismAnnualEntertainBoxId(
		long tourismAnnualEntertainBoxId) {

		model.setTourismAnnualEntertainBoxId(tourismAnnualEntertainBoxId);
	}

	/**
	 * Sets the tourism application ID of this tourism annual entertain box.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism annual entertain box
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the user ID of this tourism annual entertain box.
	 *
	 * @param userId the user ID of this tourism annual entertain box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism annual entertain box.
	 *
	 * @param userName the user name of this tourism annual entertain box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism annual entertain box.
	 *
	 * @param userUuid the user uuid of this tourism annual entertain box
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
	protected TourismAnnualEntertainBoxWrapper wrap(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		return new TourismAnnualEntertainBoxWrapper(tourismAnnualEntertainBox);
	}

}