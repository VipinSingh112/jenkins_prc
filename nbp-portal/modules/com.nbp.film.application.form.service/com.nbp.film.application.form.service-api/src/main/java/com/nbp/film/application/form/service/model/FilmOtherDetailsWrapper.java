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
 * This class is a wrapper for {@link FilmOtherDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmOtherDetails
 * @generated
 */
public class FilmOtherDetailsWrapper
	extends BaseModelWrapper<FilmOtherDetails>
	implements FilmOtherDetails, ModelWrapper<FilmOtherDetails> {

	public FilmOtherDetailsWrapper(FilmOtherDetails filmOtherDetails) {
		super(filmOtherDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("filmOtherDetailsId", getFilmOtherDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("additionalPermits", getAdditionalPermits());
		attributes.put("additionalOtherPermits", getAdditionalOtherPermits());
		attributes.put("insurance", getInsurance());
		attributes.put("copyOfInsurance", getCopyOfInsurance());
		attributes.put(
			"temporaryImportEquipment", getTemporaryImportEquipment());
		attributes.put(
			"personnelTravellingEquipment", getPersonnelTravellingEquipment());
		attributes.put("portOfEntry", getPortOfEntry());
		attributes.put("arrivalDate", getArrivalDate());
		attributes.put("departureDate", getDepartureDate());
		attributes.put("flightDetails", getFlightDetails());
		attributes.put("shippingCompany", getShippingCompany());
		attributes.put("shippingVesselNo", getShippingVesselNo());
		attributes.put("customsBroker", getCustomsBroker());
		attributes.put("brokerEmail", getBrokerEmail());
		attributes.put("brokerMobile", getBrokerMobile());
		attributes.put("typeOfEquipmentJamaica", getTypeOfEquipmentJamaica());
		attributes.put("rentalArrangedThrough", getRentalArrangedThrough());
		attributes.put("filmApplicationId", getFilmApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long filmOtherDetailsId = (Long)attributes.get("filmOtherDetailsId");

		if (filmOtherDetailsId != null) {
			setFilmOtherDetailsId(filmOtherDetailsId);
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

		String additionalPermits = (String)attributes.get("additionalPermits");

		if (additionalPermits != null) {
			setAdditionalPermits(additionalPermits);
		}

		String additionalOtherPermits = (String)attributes.get(
			"additionalOtherPermits");

		if (additionalOtherPermits != null) {
			setAdditionalOtherPermits(additionalOtherPermits);
		}

		String insurance = (String)attributes.get("insurance");

		if (insurance != null) {
			setInsurance(insurance);
		}

		String copyOfInsurance = (String)attributes.get("copyOfInsurance");

		if (copyOfInsurance != null) {
			setCopyOfInsurance(copyOfInsurance);
		}

		String temporaryImportEquipment = (String)attributes.get(
			"temporaryImportEquipment");

		if (temporaryImportEquipment != null) {
			setTemporaryImportEquipment(temporaryImportEquipment);
		}

		String personnelTravellingEquipment = (String)attributes.get(
			"personnelTravellingEquipment");

		if (personnelTravellingEquipment != null) {
			setPersonnelTravellingEquipment(personnelTravellingEquipment);
		}

		String portOfEntry = (String)attributes.get("portOfEntry");

		if (portOfEntry != null) {
			setPortOfEntry(portOfEntry);
		}

		Date arrivalDate = (Date)attributes.get("arrivalDate");

		if (arrivalDate != null) {
			setArrivalDate(arrivalDate);
		}

		Date departureDate = (Date)attributes.get("departureDate");

		if (departureDate != null) {
			setDepartureDate(departureDate);
		}

		String flightDetails = (String)attributes.get("flightDetails");

		if (flightDetails != null) {
			setFlightDetails(flightDetails);
		}

		String shippingCompany = (String)attributes.get("shippingCompany");

		if (shippingCompany != null) {
			setShippingCompany(shippingCompany);
		}

		String shippingVesselNo = (String)attributes.get("shippingVesselNo");

		if (shippingVesselNo != null) {
			setShippingVesselNo(shippingVesselNo);
		}

		String customsBroker = (String)attributes.get("customsBroker");

		if (customsBroker != null) {
			setCustomsBroker(customsBroker);
		}

		String brokerEmail = (String)attributes.get("brokerEmail");

		if (brokerEmail != null) {
			setBrokerEmail(brokerEmail);
		}

		String brokerMobile = (String)attributes.get("brokerMobile");

		if (brokerMobile != null) {
			setBrokerMobile(brokerMobile);
		}

		String typeOfEquipmentJamaica = (String)attributes.get(
			"typeOfEquipmentJamaica");

		if (typeOfEquipmentJamaica != null) {
			setTypeOfEquipmentJamaica(typeOfEquipmentJamaica);
		}

		String rentalArrangedThrough = (String)attributes.get(
			"rentalArrangedThrough");

		if (rentalArrangedThrough != null) {
			setRentalArrangedThrough(rentalArrangedThrough);
		}

		Long filmApplicationId = (Long)attributes.get("filmApplicationId");

		if (filmApplicationId != null) {
			setFilmApplicationId(filmApplicationId);
		}
	}

	@Override
	public FilmOtherDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the additional other permits of this film other details.
	 *
	 * @return the additional other permits of this film other details
	 */
	@Override
	public String getAdditionalOtherPermits() {
		return model.getAdditionalOtherPermits();
	}

	/**
	 * Returns the additional permits of this film other details.
	 *
	 * @return the additional permits of this film other details
	 */
	@Override
	public String getAdditionalPermits() {
		return model.getAdditionalPermits();
	}

	/**
	 * Returns the arrival date of this film other details.
	 *
	 * @return the arrival date of this film other details
	 */
	@Override
	public Date getArrivalDate() {
		return model.getArrivalDate();
	}

	/**
	 * Returns the broker email of this film other details.
	 *
	 * @return the broker email of this film other details
	 */
	@Override
	public String getBrokerEmail() {
		return model.getBrokerEmail();
	}

	/**
	 * Returns the broker mobile of this film other details.
	 *
	 * @return the broker mobile of this film other details
	 */
	@Override
	public String getBrokerMobile() {
		return model.getBrokerMobile();
	}

	/**
	 * Returns the company ID of this film other details.
	 *
	 * @return the company ID of this film other details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the copy of insurance of this film other details.
	 *
	 * @return the copy of insurance of this film other details
	 */
	@Override
	public String getCopyOfInsurance() {
		return model.getCopyOfInsurance();
	}

	/**
	 * Returns the create date of this film other details.
	 *
	 * @return the create date of this film other details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the customs broker of this film other details.
	 *
	 * @return the customs broker of this film other details
	 */
	@Override
	public String getCustomsBroker() {
		return model.getCustomsBroker();
	}

	/**
	 * Returns the departure date of this film other details.
	 *
	 * @return the departure date of this film other details
	 */
	@Override
	public Date getDepartureDate() {
		return model.getDepartureDate();
	}

	/**
	 * Returns the film application ID of this film other details.
	 *
	 * @return the film application ID of this film other details
	 */
	@Override
	public long getFilmApplicationId() {
		return model.getFilmApplicationId();
	}

	/**
	 * Returns the film other details ID of this film other details.
	 *
	 * @return the film other details ID of this film other details
	 */
	@Override
	public long getFilmOtherDetailsId() {
		return model.getFilmOtherDetailsId();
	}

	/**
	 * Returns the flight details of this film other details.
	 *
	 * @return the flight details of this film other details
	 */
	@Override
	public String getFlightDetails() {
		return model.getFlightDetails();
	}

	/**
	 * Returns the group ID of this film other details.
	 *
	 * @return the group ID of this film other details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the insurance of this film other details.
	 *
	 * @return the insurance of this film other details
	 */
	@Override
	public String getInsurance() {
		return model.getInsurance();
	}

	/**
	 * Returns the modified date of this film other details.
	 *
	 * @return the modified date of this film other details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the personnel travelling equipment of this film other details.
	 *
	 * @return the personnel travelling equipment of this film other details
	 */
	@Override
	public String getPersonnelTravellingEquipment() {
		return model.getPersonnelTravellingEquipment();
	}

	/**
	 * Returns the port of entry of this film other details.
	 *
	 * @return the port of entry of this film other details
	 */
	@Override
	public String getPortOfEntry() {
		return model.getPortOfEntry();
	}

	/**
	 * Returns the primary key of this film other details.
	 *
	 * @return the primary key of this film other details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rental arranged through of this film other details.
	 *
	 * @return the rental arranged through of this film other details
	 */
	@Override
	public String getRentalArrangedThrough() {
		return model.getRentalArrangedThrough();
	}

	/**
	 * Returns the shipping company of this film other details.
	 *
	 * @return the shipping company of this film other details
	 */
	@Override
	public String getShippingCompany() {
		return model.getShippingCompany();
	}

	/**
	 * Returns the shipping vessel no of this film other details.
	 *
	 * @return the shipping vessel no of this film other details
	 */
	@Override
	public String getShippingVesselNo() {
		return model.getShippingVesselNo();
	}

	/**
	 * Returns the temporary import equipment of this film other details.
	 *
	 * @return the temporary import equipment of this film other details
	 */
	@Override
	public String getTemporaryImportEquipment() {
		return model.getTemporaryImportEquipment();
	}

	/**
	 * Returns the type of equipment jamaica of this film other details.
	 *
	 * @return the type of equipment jamaica of this film other details
	 */
	@Override
	public String getTypeOfEquipmentJamaica() {
		return model.getTypeOfEquipmentJamaica();
	}

	/**
	 * Returns the user ID of this film other details.
	 *
	 * @return the user ID of this film other details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this film other details.
	 *
	 * @return the user name of this film other details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this film other details.
	 *
	 * @return the user uuid of this film other details
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
	 * Sets the additional other permits of this film other details.
	 *
	 * @param additionalOtherPermits the additional other permits of this film other details
	 */
	@Override
	public void setAdditionalOtherPermits(String additionalOtherPermits) {
		model.setAdditionalOtherPermits(additionalOtherPermits);
	}

	/**
	 * Sets the additional permits of this film other details.
	 *
	 * @param additionalPermits the additional permits of this film other details
	 */
	@Override
	public void setAdditionalPermits(String additionalPermits) {
		model.setAdditionalPermits(additionalPermits);
	}

	/**
	 * Sets the arrival date of this film other details.
	 *
	 * @param arrivalDate the arrival date of this film other details
	 */
	@Override
	public void setArrivalDate(Date arrivalDate) {
		model.setArrivalDate(arrivalDate);
	}

	/**
	 * Sets the broker email of this film other details.
	 *
	 * @param brokerEmail the broker email of this film other details
	 */
	@Override
	public void setBrokerEmail(String brokerEmail) {
		model.setBrokerEmail(brokerEmail);
	}

	/**
	 * Sets the broker mobile of this film other details.
	 *
	 * @param brokerMobile the broker mobile of this film other details
	 */
	@Override
	public void setBrokerMobile(String brokerMobile) {
		model.setBrokerMobile(brokerMobile);
	}

	/**
	 * Sets the company ID of this film other details.
	 *
	 * @param companyId the company ID of this film other details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the copy of insurance of this film other details.
	 *
	 * @param copyOfInsurance the copy of insurance of this film other details
	 */
	@Override
	public void setCopyOfInsurance(String copyOfInsurance) {
		model.setCopyOfInsurance(copyOfInsurance);
	}

	/**
	 * Sets the create date of this film other details.
	 *
	 * @param createDate the create date of this film other details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the customs broker of this film other details.
	 *
	 * @param customsBroker the customs broker of this film other details
	 */
	@Override
	public void setCustomsBroker(String customsBroker) {
		model.setCustomsBroker(customsBroker);
	}

	/**
	 * Sets the departure date of this film other details.
	 *
	 * @param departureDate the departure date of this film other details
	 */
	@Override
	public void setDepartureDate(Date departureDate) {
		model.setDepartureDate(departureDate);
	}

	/**
	 * Sets the film application ID of this film other details.
	 *
	 * @param filmApplicationId the film application ID of this film other details
	 */
	@Override
	public void setFilmApplicationId(long filmApplicationId) {
		model.setFilmApplicationId(filmApplicationId);
	}

	/**
	 * Sets the film other details ID of this film other details.
	 *
	 * @param filmOtherDetailsId the film other details ID of this film other details
	 */
	@Override
	public void setFilmOtherDetailsId(long filmOtherDetailsId) {
		model.setFilmOtherDetailsId(filmOtherDetailsId);
	}

	/**
	 * Sets the flight details of this film other details.
	 *
	 * @param flightDetails the flight details of this film other details
	 */
	@Override
	public void setFlightDetails(String flightDetails) {
		model.setFlightDetails(flightDetails);
	}

	/**
	 * Sets the group ID of this film other details.
	 *
	 * @param groupId the group ID of this film other details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the insurance of this film other details.
	 *
	 * @param insurance the insurance of this film other details
	 */
	@Override
	public void setInsurance(String insurance) {
		model.setInsurance(insurance);
	}

	/**
	 * Sets the modified date of this film other details.
	 *
	 * @param modifiedDate the modified date of this film other details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the personnel travelling equipment of this film other details.
	 *
	 * @param personnelTravellingEquipment the personnel travelling equipment of this film other details
	 */
	@Override
	public void setPersonnelTravellingEquipment(
		String personnelTravellingEquipment) {

		model.setPersonnelTravellingEquipment(personnelTravellingEquipment);
	}

	/**
	 * Sets the port of entry of this film other details.
	 *
	 * @param portOfEntry the port of entry of this film other details
	 */
	@Override
	public void setPortOfEntry(String portOfEntry) {
		model.setPortOfEntry(portOfEntry);
	}

	/**
	 * Sets the primary key of this film other details.
	 *
	 * @param primaryKey the primary key of this film other details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rental arranged through of this film other details.
	 *
	 * @param rentalArrangedThrough the rental arranged through of this film other details
	 */
	@Override
	public void setRentalArrangedThrough(String rentalArrangedThrough) {
		model.setRentalArrangedThrough(rentalArrangedThrough);
	}

	/**
	 * Sets the shipping company of this film other details.
	 *
	 * @param shippingCompany the shipping company of this film other details
	 */
	@Override
	public void setShippingCompany(String shippingCompany) {
		model.setShippingCompany(shippingCompany);
	}

	/**
	 * Sets the shipping vessel no of this film other details.
	 *
	 * @param shippingVesselNo the shipping vessel no of this film other details
	 */
	@Override
	public void setShippingVesselNo(String shippingVesselNo) {
		model.setShippingVesselNo(shippingVesselNo);
	}

	/**
	 * Sets the temporary import equipment of this film other details.
	 *
	 * @param temporaryImportEquipment the temporary import equipment of this film other details
	 */
	@Override
	public void setTemporaryImportEquipment(String temporaryImportEquipment) {
		model.setTemporaryImportEquipment(temporaryImportEquipment);
	}

	/**
	 * Sets the type of equipment jamaica of this film other details.
	 *
	 * @param typeOfEquipmentJamaica the type of equipment jamaica of this film other details
	 */
	@Override
	public void setTypeOfEquipmentJamaica(String typeOfEquipmentJamaica) {
		model.setTypeOfEquipmentJamaica(typeOfEquipmentJamaica);
	}

	/**
	 * Sets the user ID of this film other details.
	 *
	 * @param userId the user ID of this film other details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this film other details.
	 *
	 * @param userName the user name of this film other details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this film other details.
	 *
	 * @param userUuid the user uuid of this film other details
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
	protected FilmOtherDetailsWrapper wrap(FilmOtherDetails filmOtherDetails) {
		return new FilmOtherDetailsWrapper(filmOtherDetails);
	}

}