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
 * This class is a wrapper for {@link TourismSummaryAddBox}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismSummaryAddBox
 * @generated
 */
public class TourismSummaryAddBoxWrapper
	extends BaseModelWrapper<TourismSummaryAddBox>
	implements ModelWrapper<TourismSummaryAddBox>, TourismSummaryAddBox {

	public TourismSummaryAddBoxWrapper(
		TourismSummaryAddBox tourismSummaryAddBox) {

		super(tourismSummaryAddBox);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismSummaryBoxId", getTourismSummaryBoxId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dealer", getDealer());
		attributes.put("numberOfvehicles", getNumberOfvehicles());
		attributes.put("year", getYear());
		attributes.put("type", getType());
		attributes.put("ccRating", getCcRating());
		attributes.put("counterSummary", getCounterSummary());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismSummaryBoxId = (Long)attributes.get("tourismSummaryBoxId");

		if (tourismSummaryBoxId != null) {
			setTourismSummaryBoxId(tourismSummaryBoxId);
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

		String dealer = (String)attributes.get("dealer");

		if (dealer != null) {
			setDealer(dealer);
		}

		String numberOfvehicles = (String)attributes.get("numberOfvehicles");

		if (numberOfvehicles != null) {
			setNumberOfvehicles(numberOfvehicles);
		}

		String year = (String)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String ccRating = (String)attributes.get("ccRating");

		if (ccRating != null) {
			setCcRating(ccRating);
		}

		String counterSummary = (String)attributes.get("counterSummary");

		if (counterSummary != null) {
			setCounterSummary(counterSummary);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismSummaryAddBox cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cc rating of this tourism summary add box.
	 *
	 * @return the cc rating of this tourism summary add box
	 */
	@Override
	public String getCcRating() {
		return model.getCcRating();
	}

	/**
	 * Returns the company ID of this tourism summary add box.
	 *
	 * @return the company ID of this tourism summary add box
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter summary of this tourism summary add box.
	 *
	 * @return the counter summary of this tourism summary add box
	 */
	@Override
	public String getCounterSummary() {
		return model.getCounterSummary();
	}

	/**
	 * Returns the create date of this tourism summary add box.
	 *
	 * @return the create date of this tourism summary add box
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dealer of this tourism summary add box.
	 *
	 * @return the dealer of this tourism summary add box
	 */
	@Override
	public String getDealer() {
		return model.getDealer();
	}

	/**
	 * Returns the group ID of this tourism summary add box.
	 *
	 * @return the group ID of this tourism summary add box
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism summary add box.
	 *
	 * @return the modified date of this tourism summary add box
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number ofvehicles of this tourism summary add box.
	 *
	 * @return the number ofvehicles of this tourism summary add box
	 */
	@Override
	public String getNumberOfvehicles() {
		return model.getNumberOfvehicles();
	}

	/**
	 * Returns the primary key of this tourism summary add box.
	 *
	 * @return the primary key of this tourism summary add box
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism summary add box.
	 *
	 * @return the tourism application ID of this tourism summary add box
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism summary box ID of this tourism summary add box.
	 *
	 * @return the tourism summary box ID of this tourism summary add box
	 */
	@Override
	public long getTourismSummaryBoxId() {
		return model.getTourismSummaryBoxId();
	}

	/**
	 * Returns the type of this tourism summary add box.
	 *
	 * @return the type of this tourism summary add box
	 */
	@Override
	public String getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this tourism summary add box.
	 *
	 * @return the user ID of this tourism summary add box
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism summary add box.
	 *
	 * @return the user name of this tourism summary add box
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism summary add box.
	 *
	 * @return the user uuid of this tourism summary add box
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the year of this tourism summary add box.
	 *
	 * @return the year of this tourism summary add box
	 */
	@Override
	public String getYear() {
		return model.getYear();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cc rating of this tourism summary add box.
	 *
	 * @param ccRating the cc rating of this tourism summary add box
	 */
	@Override
	public void setCcRating(String ccRating) {
		model.setCcRating(ccRating);
	}

	/**
	 * Sets the company ID of this tourism summary add box.
	 *
	 * @param companyId the company ID of this tourism summary add box
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter summary of this tourism summary add box.
	 *
	 * @param counterSummary the counter summary of this tourism summary add box
	 */
	@Override
	public void setCounterSummary(String counterSummary) {
		model.setCounterSummary(counterSummary);
	}

	/**
	 * Sets the create date of this tourism summary add box.
	 *
	 * @param createDate the create date of this tourism summary add box
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the dealer of this tourism summary add box.
	 *
	 * @param dealer the dealer of this tourism summary add box
	 */
	@Override
	public void setDealer(String dealer) {
		model.setDealer(dealer);
	}

	/**
	 * Sets the group ID of this tourism summary add box.
	 *
	 * @param groupId the group ID of this tourism summary add box
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism summary add box.
	 *
	 * @param modifiedDate the modified date of this tourism summary add box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number ofvehicles of this tourism summary add box.
	 *
	 * @param numberOfvehicles the number ofvehicles of this tourism summary add box
	 */
	@Override
	public void setNumberOfvehicles(String numberOfvehicles) {
		model.setNumberOfvehicles(numberOfvehicles);
	}

	/**
	 * Sets the primary key of this tourism summary add box.
	 *
	 * @param primaryKey the primary key of this tourism summary add box
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism summary add box.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism summary add box
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism summary box ID of this tourism summary add box.
	 *
	 * @param tourismSummaryBoxId the tourism summary box ID of this tourism summary add box
	 */
	@Override
	public void setTourismSummaryBoxId(long tourismSummaryBoxId) {
		model.setTourismSummaryBoxId(tourismSummaryBoxId);
	}

	/**
	 * Sets the type of this tourism summary add box.
	 *
	 * @param type the type of this tourism summary add box
	 */
	@Override
	public void setType(String type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this tourism summary add box.
	 *
	 * @param userId the user ID of this tourism summary add box
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism summary add box.
	 *
	 * @param userName the user name of this tourism summary add box
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism summary add box.
	 *
	 * @param userUuid the user uuid of this tourism summary add box
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the year of this tourism summary add box.
	 *
	 * @param year the year of this tourism summary add box
	 */
	@Override
	public void setYear(String year) {
		model.setYear(year);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected TourismSummaryAddBoxWrapper wrap(
		TourismSummaryAddBox tourismSummaryAddBox) {

		return new TourismSummaryAddBoxWrapper(tourismSummaryAddBox);
	}

}