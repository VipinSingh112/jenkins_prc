/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FilmEquipmentList}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmEquipmentList
 * @generated
 */
public class FilmEquipmentListWrapper
	extends BaseModelWrapper<FilmEquipmentList>
	implements FilmEquipmentList, ModelWrapper<FilmEquipmentList> {

	public FilmEquipmentListWrapper(FilmEquipmentList filmEquipmentList) {
		super(filmEquipmentList);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("filmEquipmentListId", getFilmEquipmentListId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("item", getItem());
		attributes.put("serialNumber", getSerialNumber());
		attributes.put("weight", getWeight());
		attributes.put("quantity", getQuantity());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("description", getDescription());
		attributes.put("total", getTotal());
		attributes.put("counter", getCounter());
		attributes.put("equipmentList", getEquipmentList());
		attributes.put("flightNumber", getFlightNumber());
		attributes.put("filmApplicationId", getFilmApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long filmEquipmentListId = (Long)attributes.get("filmEquipmentListId");

		if (filmEquipmentListId != null) {
			setFilmEquipmentListId(filmEquipmentListId);
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

		String item = (String)attributes.get("item");

		if (item != null) {
			setItem(item);
		}

		String serialNumber = (String)attributes.get("serialNumber");

		if (serialNumber != null) {
			setSerialNumber(serialNumber);
		}

		String weight = (String)attributes.get("weight");

		if (weight != null) {
			setWeight(weight);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String unitPrice = (String)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String total = (String)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		String equipmentList = (String)attributes.get("equipmentList");

		if (equipmentList != null) {
			setEquipmentList(equipmentList);
		}

		String flightNumber = (String)attributes.get("flightNumber");

		if (flightNumber != null) {
			setFlightNumber(flightNumber);
		}

		Long filmApplicationId = (Long)attributes.get("filmApplicationId");

		if (filmApplicationId != null) {
			setFilmApplicationId(filmApplicationId);
		}
	}

	@Override
	public FilmEquipmentList cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this film equipment list.
	 *
	 * @return the company ID of this film equipment list
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this film equipment list.
	 *
	 * @return the counter of this film equipment list
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this film equipment list.
	 *
	 * @return the create date of this film equipment list
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this film equipment list.
	 *
	 * @return the description of this film equipment list
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the equipment list of this film equipment list.
	 *
	 * @return the equipment list of this film equipment list
	 */
	@Override
	public String getEquipmentList() {
		return model.getEquipmentList();
	}

	/**
	 * Returns the film application ID of this film equipment list.
	 *
	 * @return the film application ID of this film equipment list
	 */
	@Override
	public long getFilmApplicationId() {
		return model.getFilmApplicationId();
	}

	/**
	 * Returns the film equipment list ID of this film equipment list.
	 *
	 * @return the film equipment list ID of this film equipment list
	 */
	@Override
	public long getFilmEquipmentListId() {
		return model.getFilmEquipmentListId();
	}

	/**
	 * Returns the flight number of this film equipment list.
	 *
	 * @return the flight number of this film equipment list
	 */
	@Override
	public String getFlightNumber() {
		return model.getFlightNumber();
	}

	/**
	 * Returns the group ID of this film equipment list.
	 *
	 * @return the group ID of this film equipment list
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the item of this film equipment list.
	 *
	 * @return the item of this film equipment list
	 */
	@Override
	public String getItem() {
		return model.getItem();
	}

	/**
	 * Returns the modified date of this film equipment list.
	 *
	 * @return the modified date of this film equipment list
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this film equipment list.
	 *
	 * @return the primary key of this film equipment list
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this film equipment list.
	 *
	 * @return the quantity of this film equipment list
	 */
	@Override
	public String getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the serial number of this film equipment list.
	 *
	 * @return the serial number of this film equipment list
	 */
	@Override
	public String getSerialNumber() {
		return model.getSerialNumber();
	}

	/**
	 * Returns the total of this film equipment list.
	 *
	 * @return the total of this film equipment list
	 */
	@Override
	public String getTotal() {
		return model.getTotal();
	}

	/**
	 * Returns the unit price of this film equipment list.
	 *
	 * @return the unit price of this film equipment list
	 */
	@Override
	public String getUnitPrice() {
		return model.getUnitPrice();
	}

	/**
	 * Returns the user ID of this film equipment list.
	 *
	 * @return the user ID of this film equipment list
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this film equipment list.
	 *
	 * @return the user name of this film equipment list
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this film equipment list.
	 *
	 * @return the user uuid of this film equipment list
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the weight of this film equipment list.
	 *
	 * @return the weight of this film equipment list
	 */
	@Override
	public String getWeight() {
		return model.getWeight();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this film equipment list.
	 *
	 * @param companyId the company ID of this film equipment list
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this film equipment list.
	 *
	 * @param counter the counter of this film equipment list
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this film equipment list.
	 *
	 * @param createDate the create date of this film equipment list
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this film equipment list.
	 *
	 * @param description the description of this film equipment list
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the equipment list of this film equipment list.
	 *
	 * @param equipmentList the equipment list of this film equipment list
	 */
	@Override
	public void setEquipmentList(String equipmentList) {
		model.setEquipmentList(equipmentList);
	}

	/**
	 * Sets the film application ID of this film equipment list.
	 *
	 * @param filmApplicationId the film application ID of this film equipment list
	 */
	@Override
	public void setFilmApplicationId(long filmApplicationId) {
		model.setFilmApplicationId(filmApplicationId);
	}

	/**
	 * Sets the film equipment list ID of this film equipment list.
	 *
	 * @param filmEquipmentListId the film equipment list ID of this film equipment list
	 */
	@Override
	public void setFilmEquipmentListId(long filmEquipmentListId) {
		model.setFilmEquipmentListId(filmEquipmentListId);
	}

	/**
	 * Sets the flight number of this film equipment list.
	 *
	 * @param flightNumber the flight number of this film equipment list
	 */
	@Override
	public void setFlightNumber(String flightNumber) {
		model.setFlightNumber(flightNumber);
	}

	/**
	 * Sets the group ID of this film equipment list.
	 *
	 * @param groupId the group ID of this film equipment list
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the item of this film equipment list.
	 *
	 * @param item the item of this film equipment list
	 */
	@Override
	public void setItem(String item) {
		model.setItem(item);
	}

	/**
	 * Sets the modified date of this film equipment list.
	 *
	 * @param modifiedDate the modified date of this film equipment list
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this film equipment list.
	 *
	 * @param primaryKey the primary key of this film equipment list
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this film equipment list.
	 *
	 * @param quantity the quantity of this film equipment list
	 */
	@Override
	public void setQuantity(String quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the serial number of this film equipment list.
	 *
	 * @param serialNumber the serial number of this film equipment list
	 */
	@Override
	public void setSerialNumber(String serialNumber) {
		model.setSerialNumber(serialNumber);
	}

	/**
	 * Sets the total of this film equipment list.
	 *
	 * @param total the total of this film equipment list
	 */
	@Override
	public void setTotal(String total) {
		model.setTotal(total);
	}

	/**
	 * Sets the unit price of this film equipment list.
	 *
	 * @param unitPrice the unit price of this film equipment list
	 */
	@Override
	public void setUnitPrice(String unitPrice) {
		model.setUnitPrice(unitPrice);
	}

	/**
	 * Sets the user ID of this film equipment list.
	 *
	 * @param userId the user ID of this film equipment list
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this film equipment list.
	 *
	 * @param userName the user name of this film equipment list
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this film equipment list.
	 *
	 * @param userUuid the user uuid of this film equipment list
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the weight of this film equipment list.
	 *
	 * @param weight the weight of this film equipment list
	 */
	@Override
	public void setWeight(String weight) {
		model.setWeight(weight);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected FilmEquipmentListWrapper wrap(
		FilmEquipmentList filmEquipmentList) {

		return new FilmEquipmentListWrapper(filmEquipmentList);
	}

}