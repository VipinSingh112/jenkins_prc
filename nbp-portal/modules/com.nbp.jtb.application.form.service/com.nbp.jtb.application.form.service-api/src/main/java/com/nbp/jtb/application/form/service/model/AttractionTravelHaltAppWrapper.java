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
 * This class is a wrapper for {@link AttractionTravelHaltApp}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelHaltApp
 * @generated
 */
public class AttractionTravelHaltAppWrapper
	extends BaseModelWrapper<AttractionTravelHaltApp>
	implements AttractionTravelHaltApp, ModelWrapper<AttractionTravelHaltApp> {

	public AttractionTravelHaltAppWrapper(
		AttractionTravelHaltApp attractionTravelHaltApp) {

		super(attractionTravelHaltApp);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionTravelHaltAppId", getAttractionTravelHaltAppId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("travelHaltApplicantName", getTravelHaltApplicantName());
		attributes.put("travelHaltAddress", getTravelHaltAddress());
		attributes.put("travelHaltTelephone", getTravelHaltTelephone());
		attributes.put("travelHaltEmail", getTravelHaltEmail());
		attributes.put("travelHaltName", getTravelHaltName());
		attributes.put("travelHaltLocation", getTravelHaltLocation());
		attributes.put("travelHaltTelephoneNum", getTravelHaltTelephoneNum());
		attributes.put("travelHaltEmployeesNo", getTravelHaltEmployeesNo());
		attributes.put("travelHaltSignDate", getTravelHaltSignDate());
		attributes.put("gasStation", getGasStation());
		attributes.put("refreshment", getRefreshment());
		attributes.put("drinks", getDrinks());
		attributes.put("restaurant", getRestaurant());
		attributes.put("wirelessinternet", getWirelessinternet());
		attributes.put("restrooms", getRestrooms());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionTravelHaltAppId = (Long)attributes.get(
			"attractionTravelHaltAppId");

		if (attractionTravelHaltAppId != null) {
			setAttractionTravelHaltAppId(attractionTravelHaltAppId);
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

		String travelHaltApplicantName = (String)attributes.get(
			"travelHaltApplicantName");

		if (travelHaltApplicantName != null) {
			setTravelHaltApplicantName(travelHaltApplicantName);
		}

		String travelHaltAddress = (String)attributes.get("travelHaltAddress");

		if (travelHaltAddress != null) {
			setTravelHaltAddress(travelHaltAddress);
		}

		String travelHaltTelephone = (String)attributes.get(
			"travelHaltTelephone");

		if (travelHaltTelephone != null) {
			setTravelHaltTelephone(travelHaltTelephone);
		}

		String travelHaltEmail = (String)attributes.get("travelHaltEmail");

		if (travelHaltEmail != null) {
			setTravelHaltEmail(travelHaltEmail);
		}

		String travelHaltName = (String)attributes.get("travelHaltName");

		if (travelHaltName != null) {
			setTravelHaltName(travelHaltName);
		}

		String travelHaltLocation = (String)attributes.get(
			"travelHaltLocation");

		if (travelHaltLocation != null) {
			setTravelHaltLocation(travelHaltLocation);
		}

		String travelHaltTelephoneNum = (String)attributes.get(
			"travelHaltTelephoneNum");

		if (travelHaltTelephoneNum != null) {
			setTravelHaltTelephoneNum(travelHaltTelephoneNum);
		}

		String travelHaltEmployeesNo = (String)attributes.get(
			"travelHaltEmployeesNo");

		if (travelHaltEmployeesNo != null) {
			setTravelHaltEmployeesNo(travelHaltEmployeesNo);
		}

		Date travelHaltSignDate = (Date)attributes.get("travelHaltSignDate");

		if (travelHaltSignDate != null) {
			setTravelHaltSignDate(travelHaltSignDate);
		}

		String gasStation = (String)attributes.get("gasStation");

		if (gasStation != null) {
			setGasStation(gasStation);
		}

		String refreshment = (String)attributes.get("refreshment");

		if (refreshment != null) {
			setRefreshment(refreshment);
		}

		String drinks = (String)attributes.get("drinks");

		if (drinks != null) {
			setDrinks(drinks);
		}

		String restaurant = (String)attributes.get("restaurant");

		if (restaurant != null) {
			setRestaurant(restaurant);
		}

		String wirelessinternet = (String)attributes.get("wirelessinternet");

		if (wirelessinternet != null) {
			setWirelessinternet(wirelessinternet);
		}

		String restrooms = (String)attributes.get("restrooms");

		if (restrooms != null) {
			setRestrooms(restrooms);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionTravelHaltApp cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction travel halt app ID of this attraction travel halt app.
	 *
	 * @return the attraction travel halt app ID of this attraction travel halt app
	 */
	@Override
	public long getAttractionTravelHaltAppId() {
		return model.getAttractionTravelHaltAppId();
	}

	/**
	 * Returns the company ID of this attraction travel halt app.
	 *
	 * @return the company ID of this attraction travel halt app
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction travel halt app.
	 *
	 * @return the create date of this attraction travel halt app
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the drinks of this attraction travel halt app.
	 *
	 * @return the drinks of this attraction travel halt app
	 */
	@Override
	public String getDrinks() {
		return model.getDrinks();
	}

	/**
	 * Returns the gas station of this attraction travel halt app.
	 *
	 * @return the gas station of this attraction travel halt app
	 */
	@Override
	public String getGasStation() {
		return model.getGasStation();
	}

	/**
	 * Returns the group ID of this attraction travel halt app.
	 *
	 * @return the group ID of this attraction travel halt app
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction travel halt app.
	 *
	 * @return the jtb application ID of this attraction travel halt app
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction travel halt app.
	 *
	 * @return the modified date of this attraction travel halt app
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this attraction travel halt app.
	 *
	 * @return the primary key of this attraction travel halt app
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the refreshment of this attraction travel halt app.
	 *
	 * @return the refreshment of this attraction travel halt app
	 */
	@Override
	public String getRefreshment() {
		return model.getRefreshment();
	}

	/**
	 * Returns the restaurant of this attraction travel halt app.
	 *
	 * @return the restaurant of this attraction travel halt app
	 */
	@Override
	public String getRestaurant() {
		return model.getRestaurant();
	}

	/**
	 * Returns the restrooms of this attraction travel halt app.
	 *
	 * @return the restrooms of this attraction travel halt app
	 */
	@Override
	public String getRestrooms() {
		return model.getRestrooms();
	}

	/**
	 * Returns the travel halt address of this attraction travel halt app.
	 *
	 * @return the travel halt address of this attraction travel halt app
	 */
	@Override
	public String getTravelHaltAddress() {
		return model.getTravelHaltAddress();
	}

	/**
	 * Returns the travel halt applicant name of this attraction travel halt app.
	 *
	 * @return the travel halt applicant name of this attraction travel halt app
	 */
	@Override
	public String getTravelHaltApplicantName() {
		return model.getTravelHaltApplicantName();
	}

	/**
	 * Returns the travel halt email of this attraction travel halt app.
	 *
	 * @return the travel halt email of this attraction travel halt app
	 */
	@Override
	public String getTravelHaltEmail() {
		return model.getTravelHaltEmail();
	}

	/**
	 * Returns the travel halt employees no of this attraction travel halt app.
	 *
	 * @return the travel halt employees no of this attraction travel halt app
	 */
	@Override
	public String getTravelHaltEmployeesNo() {
		return model.getTravelHaltEmployeesNo();
	}

	/**
	 * Returns the travel halt location of this attraction travel halt app.
	 *
	 * @return the travel halt location of this attraction travel halt app
	 */
	@Override
	public String getTravelHaltLocation() {
		return model.getTravelHaltLocation();
	}

	/**
	 * Returns the travel halt name of this attraction travel halt app.
	 *
	 * @return the travel halt name of this attraction travel halt app
	 */
	@Override
	public String getTravelHaltName() {
		return model.getTravelHaltName();
	}

	/**
	 * Returns the travel halt sign date of this attraction travel halt app.
	 *
	 * @return the travel halt sign date of this attraction travel halt app
	 */
	@Override
	public Date getTravelHaltSignDate() {
		return model.getTravelHaltSignDate();
	}

	/**
	 * Returns the travel halt telephone of this attraction travel halt app.
	 *
	 * @return the travel halt telephone of this attraction travel halt app
	 */
	@Override
	public String getTravelHaltTelephone() {
		return model.getTravelHaltTelephone();
	}

	/**
	 * Returns the travel halt telephone num of this attraction travel halt app.
	 *
	 * @return the travel halt telephone num of this attraction travel halt app
	 */
	@Override
	public String getTravelHaltTelephoneNum() {
		return model.getTravelHaltTelephoneNum();
	}

	/**
	 * Returns the user ID of this attraction travel halt app.
	 *
	 * @return the user ID of this attraction travel halt app
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction travel halt app.
	 *
	 * @return the user name of this attraction travel halt app
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction travel halt app.
	 *
	 * @return the user uuid of this attraction travel halt app
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the wirelessinternet of this attraction travel halt app.
	 *
	 * @return the wirelessinternet of this attraction travel halt app
	 */
	@Override
	public String getWirelessinternet() {
		return model.getWirelessinternet();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the attraction travel halt app ID of this attraction travel halt app.
	 *
	 * @param attractionTravelHaltAppId the attraction travel halt app ID of this attraction travel halt app
	 */
	@Override
	public void setAttractionTravelHaltAppId(long attractionTravelHaltAppId) {
		model.setAttractionTravelHaltAppId(attractionTravelHaltAppId);
	}

	/**
	 * Sets the company ID of this attraction travel halt app.
	 *
	 * @param companyId the company ID of this attraction travel halt app
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction travel halt app.
	 *
	 * @param createDate the create date of this attraction travel halt app
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the drinks of this attraction travel halt app.
	 *
	 * @param drinks the drinks of this attraction travel halt app
	 */
	@Override
	public void setDrinks(String drinks) {
		model.setDrinks(drinks);
	}

	/**
	 * Sets the gas station of this attraction travel halt app.
	 *
	 * @param gasStation the gas station of this attraction travel halt app
	 */
	@Override
	public void setGasStation(String gasStation) {
		model.setGasStation(gasStation);
	}

	/**
	 * Sets the group ID of this attraction travel halt app.
	 *
	 * @param groupId the group ID of this attraction travel halt app
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction travel halt app.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction travel halt app
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction travel halt app.
	 *
	 * @param modifiedDate the modified date of this attraction travel halt app
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this attraction travel halt app.
	 *
	 * @param primaryKey the primary key of this attraction travel halt app
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the refreshment of this attraction travel halt app.
	 *
	 * @param refreshment the refreshment of this attraction travel halt app
	 */
	@Override
	public void setRefreshment(String refreshment) {
		model.setRefreshment(refreshment);
	}

	/**
	 * Sets the restaurant of this attraction travel halt app.
	 *
	 * @param restaurant the restaurant of this attraction travel halt app
	 */
	@Override
	public void setRestaurant(String restaurant) {
		model.setRestaurant(restaurant);
	}

	/**
	 * Sets the restrooms of this attraction travel halt app.
	 *
	 * @param restrooms the restrooms of this attraction travel halt app
	 */
	@Override
	public void setRestrooms(String restrooms) {
		model.setRestrooms(restrooms);
	}

	/**
	 * Sets the travel halt address of this attraction travel halt app.
	 *
	 * @param travelHaltAddress the travel halt address of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltAddress(String travelHaltAddress) {
		model.setTravelHaltAddress(travelHaltAddress);
	}

	/**
	 * Sets the travel halt applicant name of this attraction travel halt app.
	 *
	 * @param travelHaltApplicantName the travel halt applicant name of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltApplicantName(String travelHaltApplicantName) {
		model.setTravelHaltApplicantName(travelHaltApplicantName);
	}

	/**
	 * Sets the travel halt email of this attraction travel halt app.
	 *
	 * @param travelHaltEmail the travel halt email of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltEmail(String travelHaltEmail) {
		model.setTravelHaltEmail(travelHaltEmail);
	}

	/**
	 * Sets the travel halt employees no of this attraction travel halt app.
	 *
	 * @param travelHaltEmployeesNo the travel halt employees no of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltEmployeesNo(String travelHaltEmployeesNo) {
		model.setTravelHaltEmployeesNo(travelHaltEmployeesNo);
	}

	/**
	 * Sets the travel halt location of this attraction travel halt app.
	 *
	 * @param travelHaltLocation the travel halt location of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltLocation(String travelHaltLocation) {
		model.setTravelHaltLocation(travelHaltLocation);
	}

	/**
	 * Sets the travel halt name of this attraction travel halt app.
	 *
	 * @param travelHaltName the travel halt name of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltName(String travelHaltName) {
		model.setTravelHaltName(travelHaltName);
	}

	/**
	 * Sets the travel halt sign date of this attraction travel halt app.
	 *
	 * @param travelHaltSignDate the travel halt sign date of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltSignDate(Date travelHaltSignDate) {
		model.setTravelHaltSignDate(travelHaltSignDate);
	}

	/**
	 * Sets the travel halt telephone of this attraction travel halt app.
	 *
	 * @param travelHaltTelephone the travel halt telephone of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltTelephone(String travelHaltTelephone) {
		model.setTravelHaltTelephone(travelHaltTelephone);
	}

	/**
	 * Sets the travel halt telephone num of this attraction travel halt app.
	 *
	 * @param travelHaltTelephoneNum the travel halt telephone num of this attraction travel halt app
	 */
	@Override
	public void setTravelHaltTelephoneNum(String travelHaltTelephoneNum) {
		model.setTravelHaltTelephoneNum(travelHaltTelephoneNum);
	}

	/**
	 * Sets the user ID of this attraction travel halt app.
	 *
	 * @param userId the user ID of this attraction travel halt app
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction travel halt app.
	 *
	 * @param userName the user name of this attraction travel halt app
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction travel halt app.
	 *
	 * @param userUuid the user uuid of this attraction travel halt app
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the wirelessinternet of this attraction travel halt app.
	 *
	 * @param wirelessinternet the wirelessinternet of this attraction travel halt app
	 */
	@Override
	public void setWirelessinternet(String wirelessinternet) {
		model.setWirelessinternet(wirelessinternet);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AttractionTravelHaltAppWrapper wrap(
		AttractionTravelHaltApp attractionTravelHaltApp) {

		return new AttractionTravelHaltAppWrapper(attractionTravelHaltApp);
	}

}