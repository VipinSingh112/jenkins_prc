/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionDomesticService}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticService
 * @generated
 */
public class AttractionDomesticServiceWrapper
	extends BaseModelWrapper<AttractionDomesticService>
	implements AttractionDomesticService,
			   ModelWrapper<AttractionDomesticService> {

	public AttractionDomesticServiceWrapper(
		AttractionDomesticService attractionDomesticService) {

		super(attractionDomesticService);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionDomesticServId", getAttractionDomesticServId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("individualsApartment", getIndividualsApartment());
		attributes.put("airportAssistance", getAirportAssistance());
		attributes.put("entireTour", getEntireTour());
		attributes.put("transfersDeparture", getTransfersDeparture());
		attributes.put("individualGroups", getIndividualGroups());
		attributes.put("organizedconJunction", getOrganizedconJunction());
		attributes.put("dailyTransportation", getDailyTransportation());
		attributes.put("entertainment", getEntertainment());
		attributes.put("domesticTourSealDate", getDomesticTourSealDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionDomesticServId = (Long)attributes.get(
			"attractionDomesticServId");

		if (attractionDomesticServId != null) {
			setAttractionDomesticServId(attractionDomesticServId);
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

		String individualsApartment = (String)attributes.get(
			"individualsApartment");

		if (individualsApartment != null) {
			setIndividualsApartment(individualsApartment);
		}

		String airportAssistance = (String)attributes.get("airportAssistance");

		if (airportAssistance != null) {
			setAirportAssistance(airportAssistance);
		}

		String entireTour = (String)attributes.get("entireTour");

		if (entireTour != null) {
			setEntireTour(entireTour);
		}

		String transfersDeparture = (String)attributes.get(
			"transfersDeparture");

		if (transfersDeparture != null) {
			setTransfersDeparture(transfersDeparture);
		}

		String individualGroups = (String)attributes.get("individualGroups");

		if (individualGroups != null) {
			setIndividualGroups(individualGroups);
		}

		String organizedconJunction = (String)attributes.get(
			"organizedconJunction");

		if (organizedconJunction != null) {
			setOrganizedconJunction(organizedconJunction);
		}

		String dailyTransportation = (String)attributes.get(
			"dailyTransportation");

		if (dailyTransportation != null) {
			setDailyTransportation(dailyTransportation);
		}

		String entertainment = (String)attributes.get("entertainment");

		if (entertainment != null) {
			setEntertainment(entertainment);
		}

		Date domesticTourSealDate = (Date)attributes.get(
			"domesticTourSealDate");

		if (domesticTourSealDate != null) {
			setDomesticTourSealDate(domesticTourSealDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionDomesticService cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the airport assistance of this attraction domestic service.
	 *
	 * @return the airport assistance of this attraction domestic service
	 */
	@Override
	public String getAirportAssistance() {
		return model.getAirportAssistance();
	}

	/**
	 * Returns the attraction domestic serv ID of this attraction domestic service.
	 *
	 * @return the attraction domestic serv ID of this attraction domestic service
	 */
	@Override
	public long getAttractionDomesticServId() {
		return model.getAttractionDomesticServId();
	}

	/**
	 * Returns the company ID of this attraction domestic service.
	 *
	 * @return the company ID of this attraction domestic service
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction domestic service.
	 *
	 * @return the create date of this attraction domestic service
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the daily transportation of this attraction domestic service.
	 *
	 * @return the daily transportation of this attraction domestic service
	 */
	@Override
	public String getDailyTransportation() {
		return model.getDailyTransportation();
	}

	/**
	 * Returns the domestic tour seal date of this attraction domestic service.
	 *
	 * @return the domestic tour seal date of this attraction domestic service
	 */
	@Override
	public Date getDomesticTourSealDate() {
		return model.getDomesticTourSealDate();
	}

	/**
	 * Returns the entertainment of this attraction domestic service.
	 *
	 * @return the entertainment of this attraction domestic service
	 */
	@Override
	public String getEntertainment() {
		return model.getEntertainment();
	}

	/**
	 * Returns the entire tour of this attraction domestic service.
	 *
	 * @return the entire tour of this attraction domestic service
	 */
	@Override
	public String getEntireTour() {
		return model.getEntireTour();
	}

	/**
	 * Returns the group ID of this attraction domestic service.
	 *
	 * @return the group ID of this attraction domestic service
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the individual groups of this attraction domestic service.
	 *
	 * @return the individual groups of this attraction domestic service
	 */
	@Override
	public String getIndividualGroups() {
		return model.getIndividualGroups();
	}

	/**
	 * Returns the individuals apartment of this attraction domestic service.
	 *
	 * @return the individuals apartment of this attraction domestic service
	 */
	@Override
	public String getIndividualsApartment() {
		return model.getIndividualsApartment();
	}

	/**
	 * Returns the jtb application ID of this attraction domestic service.
	 *
	 * @return the jtb application ID of this attraction domestic service
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction domestic service.
	 *
	 * @return the modified date of this attraction domestic service
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the organizedcon junction of this attraction domestic service.
	 *
	 * @return the organizedcon junction of this attraction domestic service
	 */
	@Override
	public String getOrganizedconJunction() {
		return model.getOrganizedconJunction();
	}

	/**
	 * Returns the primary key of this attraction domestic service.
	 *
	 * @return the primary key of this attraction domestic service
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the transfers departure of this attraction domestic service.
	 *
	 * @return the transfers departure of this attraction domestic service
	 */
	@Override
	public String getTransfersDeparture() {
		return model.getTransfersDeparture();
	}

	/**
	 * Returns the user ID of this attraction domestic service.
	 *
	 * @return the user ID of this attraction domestic service
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction domestic service.
	 *
	 * @return the user name of this attraction domestic service
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction domestic service.
	 *
	 * @return the user uuid of this attraction domestic service
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
	 * Sets the airport assistance of this attraction domestic service.
	 *
	 * @param airportAssistance the airport assistance of this attraction domestic service
	 */
	@Override
	public void setAirportAssistance(String airportAssistance) {
		model.setAirportAssistance(airportAssistance);
	}

	/**
	 * Sets the attraction domestic serv ID of this attraction domestic service.
	 *
	 * @param attractionDomesticServId the attraction domestic serv ID of this attraction domestic service
	 */
	@Override
	public void setAttractionDomesticServId(long attractionDomesticServId) {
		model.setAttractionDomesticServId(attractionDomesticServId);
	}

	/**
	 * Sets the company ID of this attraction domestic service.
	 *
	 * @param companyId the company ID of this attraction domestic service
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction domestic service.
	 *
	 * @param createDate the create date of this attraction domestic service
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the daily transportation of this attraction domestic service.
	 *
	 * @param dailyTransportation the daily transportation of this attraction domestic service
	 */
	@Override
	public void setDailyTransportation(String dailyTransportation) {
		model.setDailyTransportation(dailyTransportation);
	}

	/**
	 * Sets the domestic tour seal date of this attraction domestic service.
	 *
	 * @param domesticTourSealDate the domestic tour seal date of this attraction domestic service
	 */
	@Override
	public void setDomesticTourSealDate(Date domesticTourSealDate) {
		model.setDomesticTourSealDate(domesticTourSealDate);
	}

	/**
	 * Sets the entertainment of this attraction domestic service.
	 *
	 * @param entertainment the entertainment of this attraction domestic service
	 */
	@Override
	public void setEntertainment(String entertainment) {
		model.setEntertainment(entertainment);
	}

	/**
	 * Sets the entire tour of this attraction domestic service.
	 *
	 * @param entireTour the entire tour of this attraction domestic service
	 */
	@Override
	public void setEntireTour(String entireTour) {
		model.setEntireTour(entireTour);
	}

	/**
	 * Sets the group ID of this attraction domestic service.
	 *
	 * @param groupId the group ID of this attraction domestic service
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the individual groups of this attraction domestic service.
	 *
	 * @param individualGroups the individual groups of this attraction domestic service
	 */
	@Override
	public void setIndividualGroups(String individualGroups) {
		model.setIndividualGroups(individualGroups);
	}

	/**
	 * Sets the individuals apartment of this attraction domestic service.
	 *
	 * @param individualsApartment the individuals apartment of this attraction domestic service
	 */
	@Override
	public void setIndividualsApartment(String individualsApartment) {
		model.setIndividualsApartment(individualsApartment);
	}

	/**
	 * Sets the jtb application ID of this attraction domestic service.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction domestic service
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction domestic service.
	 *
	 * @param modifiedDate the modified date of this attraction domestic service
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the organizedcon junction of this attraction domestic service.
	 *
	 * @param organizedconJunction the organizedcon junction of this attraction domestic service
	 */
	@Override
	public void setOrganizedconJunction(String organizedconJunction) {
		model.setOrganizedconJunction(organizedconJunction);
	}

	/**
	 * Sets the primary key of this attraction domestic service.
	 *
	 * @param primaryKey the primary key of this attraction domestic service
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the transfers departure of this attraction domestic service.
	 *
	 * @param transfersDeparture the transfers departure of this attraction domestic service
	 */
	@Override
	public void setTransfersDeparture(String transfersDeparture) {
		model.setTransfersDeparture(transfersDeparture);
	}

	/**
	 * Sets the user ID of this attraction domestic service.
	 *
	 * @param userId the user ID of this attraction domestic service
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction domestic service.
	 *
	 * @param userName the user name of this attraction domestic service
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction domestic service.
	 *
	 * @param userUuid the user uuid of this attraction domestic service
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
	protected AttractionDomesticServiceWrapper wrap(
		AttractionDomesticService attractionDomesticService) {

		return new AttractionDomesticServiceWrapper(attractionDomesticService);
	}

}