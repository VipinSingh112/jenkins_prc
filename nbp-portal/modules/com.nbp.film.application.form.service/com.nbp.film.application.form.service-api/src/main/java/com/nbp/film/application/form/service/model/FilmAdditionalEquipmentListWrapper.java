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
 * This class is a wrapper for {@link FilmAdditionalEquipmentList}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentList
 * @generated
 */
public class FilmAdditionalEquipmentListWrapper
	extends BaseModelWrapper<FilmAdditionalEquipmentList>
	implements FilmAdditionalEquipmentList,
			   ModelWrapper<FilmAdditionalEquipmentList> {

	public FilmAdditionalEquipmentListWrapper(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		super(filmAdditionalEquipmentList);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"FilmAdditionalEquipmentListId",
			getFilmAdditionalEquipmentListId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("arrivalDate", getArrivalDate());
		attributes.put("airlineShipper", getAirlineShipper());
		attributes.put("flightVesselNum", getFlightVesselNum());
		attributes.put("passengerName", getPassengerName());
		attributes.put("entryPort", getEntryPort());
		attributes.put("customsBroker", getCustomsBroker());
		attributes.put("flightNumber", getFlightNumber());
		attributes.put("counter", getCounter());
		attributes.put("filmApplicationId", getFilmApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long FilmAdditionalEquipmentListId = (Long)attributes.get(
			"FilmAdditionalEquipmentListId");

		if (FilmAdditionalEquipmentListId != null) {
			setFilmAdditionalEquipmentListId(FilmAdditionalEquipmentListId);
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

		Date arrivalDate = (Date)attributes.get("arrivalDate");

		if (arrivalDate != null) {
			setArrivalDate(arrivalDate);
		}

		String airlineShipper = (String)attributes.get("airlineShipper");

		if (airlineShipper != null) {
			setAirlineShipper(airlineShipper);
		}

		String flightVesselNum = (String)attributes.get("flightVesselNum");

		if (flightVesselNum != null) {
			setFlightVesselNum(flightVesselNum);
		}

		String passengerName = (String)attributes.get("passengerName");

		if (passengerName != null) {
			setPassengerName(passengerName);
		}

		String entryPort = (String)attributes.get("entryPort");

		if (entryPort != null) {
			setEntryPort(entryPort);
		}

		String customsBroker = (String)attributes.get("customsBroker");

		if (customsBroker != null) {
			setCustomsBroker(customsBroker);
		}

		String flightNumber = (String)attributes.get("flightNumber");

		if (flightNumber != null) {
			setFlightNumber(flightNumber);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long filmApplicationId = (Long)attributes.get("filmApplicationId");

		if (filmApplicationId != null) {
			setFilmApplicationId(filmApplicationId);
		}
	}

	@Override
	public FilmAdditionalEquipmentList cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the airline shipper of this film additional equipment list.
	 *
	 * @return the airline shipper of this film additional equipment list
	 */
	@Override
	public String getAirlineShipper() {
		return model.getAirlineShipper();
	}

	/**
	 * Returns the arrival date of this film additional equipment list.
	 *
	 * @return the arrival date of this film additional equipment list
	 */
	@Override
	public Date getArrivalDate() {
		return model.getArrivalDate();
	}

	/**
	 * Returns the company ID of this film additional equipment list.
	 *
	 * @return the company ID of this film additional equipment list
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this film additional equipment list.
	 *
	 * @return the counter of this film additional equipment list
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this film additional equipment list.
	 *
	 * @return the create date of this film additional equipment list
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the customs broker of this film additional equipment list.
	 *
	 * @return the customs broker of this film additional equipment list
	 */
	@Override
	public String getCustomsBroker() {
		return model.getCustomsBroker();
	}

	/**
	 * Returns the entry port of this film additional equipment list.
	 *
	 * @return the entry port of this film additional equipment list
	 */
	@Override
	public String getEntryPort() {
		return model.getEntryPort();
	}

	/**
	 * Returns the film additional equipment list ID of this film additional equipment list.
	 *
	 * @return the film additional equipment list ID of this film additional equipment list
	 */
	@Override
	public long getFilmAdditionalEquipmentListId() {
		return model.getFilmAdditionalEquipmentListId();
	}

	/**
	 * Returns the film application ID of this film additional equipment list.
	 *
	 * @return the film application ID of this film additional equipment list
	 */
	@Override
	public long getFilmApplicationId() {
		return model.getFilmApplicationId();
	}

	/**
	 * Returns the flight number of this film additional equipment list.
	 *
	 * @return the flight number of this film additional equipment list
	 */
	@Override
	public String getFlightNumber() {
		return model.getFlightNumber();
	}

	/**
	 * Returns the flight vessel num of this film additional equipment list.
	 *
	 * @return the flight vessel num of this film additional equipment list
	 */
	@Override
	public String getFlightVesselNum() {
		return model.getFlightVesselNum();
	}

	/**
	 * Returns the group ID of this film additional equipment list.
	 *
	 * @return the group ID of this film additional equipment list
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this film additional equipment list.
	 *
	 * @return the modified date of this film additional equipment list
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the passenger name of this film additional equipment list.
	 *
	 * @return the passenger name of this film additional equipment list
	 */
	@Override
	public String getPassengerName() {
		return model.getPassengerName();
	}

	/**
	 * Returns the primary key of this film additional equipment list.
	 *
	 * @return the primary key of this film additional equipment list
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this film additional equipment list.
	 *
	 * @return the user ID of this film additional equipment list
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this film additional equipment list.
	 *
	 * @return the user name of this film additional equipment list
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this film additional equipment list.
	 *
	 * @return the user uuid of this film additional equipment list
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
	 * Sets the airline shipper of this film additional equipment list.
	 *
	 * @param airlineShipper the airline shipper of this film additional equipment list
	 */
	@Override
	public void setAirlineShipper(String airlineShipper) {
		model.setAirlineShipper(airlineShipper);
	}

	/**
	 * Sets the arrival date of this film additional equipment list.
	 *
	 * @param arrivalDate the arrival date of this film additional equipment list
	 */
	@Override
	public void setArrivalDate(Date arrivalDate) {
		model.setArrivalDate(arrivalDate);
	}

	/**
	 * Sets the company ID of this film additional equipment list.
	 *
	 * @param companyId the company ID of this film additional equipment list
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this film additional equipment list.
	 *
	 * @param counter the counter of this film additional equipment list
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this film additional equipment list.
	 *
	 * @param createDate the create date of this film additional equipment list
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the customs broker of this film additional equipment list.
	 *
	 * @param customsBroker the customs broker of this film additional equipment list
	 */
	@Override
	public void setCustomsBroker(String customsBroker) {
		model.setCustomsBroker(customsBroker);
	}

	/**
	 * Sets the entry port of this film additional equipment list.
	 *
	 * @param entryPort the entry port of this film additional equipment list
	 */
	@Override
	public void setEntryPort(String entryPort) {
		model.setEntryPort(entryPort);
	}

	/**
	 * Sets the film additional equipment list ID of this film additional equipment list.
	 *
	 * @param FilmAdditionalEquipmentListId the film additional equipment list ID of this film additional equipment list
	 */
	@Override
	public void setFilmAdditionalEquipmentListId(
		long FilmAdditionalEquipmentListId) {

		model.setFilmAdditionalEquipmentListId(FilmAdditionalEquipmentListId);
	}

	/**
	 * Sets the film application ID of this film additional equipment list.
	 *
	 * @param filmApplicationId the film application ID of this film additional equipment list
	 */
	@Override
	public void setFilmApplicationId(long filmApplicationId) {
		model.setFilmApplicationId(filmApplicationId);
	}

	/**
	 * Sets the flight number of this film additional equipment list.
	 *
	 * @param flightNumber the flight number of this film additional equipment list
	 */
	@Override
	public void setFlightNumber(String flightNumber) {
		model.setFlightNumber(flightNumber);
	}

	/**
	 * Sets the flight vessel num of this film additional equipment list.
	 *
	 * @param flightVesselNum the flight vessel num of this film additional equipment list
	 */
	@Override
	public void setFlightVesselNum(String flightVesselNum) {
		model.setFlightVesselNum(flightVesselNum);
	}

	/**
	 * Sets the group ID of this film additional equipment list.
	 *
	 * @param groupId the group ID of this film additional equipment list
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this film additional equipment list.
	 *
	 * @param modifiedDate the modified date of this film additional equipment list
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the passenger name of this film additional equipment list.
	 *
	 * @param passengerName the passenger name of this film additional equipment list
	 */
	@Override
	public void setPassengerName(String passengerName) {
		model.setPassengerName(passengerName);
	}

	/**
	 * Sets the primary key of this film additional equipment list.
	 *
	 * @param primaryKey the primary key of this film additional equipment list
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this film additional equipment list.
	 *
	 * @param userId the user ID of this film additional equipment list
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this film additional equipment list.
	 *
	 * @param userName the user name of this film additional equipment list
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this film additional equipment list.
	 *
	 * @param userUuid the user uuid of this film additional equipment list
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
	protected FilmAdditionalEquipmentListWrapper wrap(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		return new FilmAdditionalEquipmentListWrapper(
			filmAdditionalEquipmentList);
	}

}