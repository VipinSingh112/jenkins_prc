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
 * This class is a wrapper for {@link TourismNewAccommodationForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationForm
 * @generated
 */
public class TourismNewAccommodationFormWrapper
	extends BaseModelWrapper<TourismNewAccommodationForm>
	implements ModelWrapper<TourismNewAccommodationForm>,
			   TourismNewAccommodationForm {

	public TourismNewAccommodationFormWrapper(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		super(tourismNewAccommodationForm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismNewAccoFormId", getTourismNewAccoFormId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("accoDateOfApplication", getAccoDateOfApplication());
		attributes.put("accoTypeOfAccommodation", getAccoTypeOfAccommodation());
		attributes.put("accoNameOfProperty", getAccoNameOfProperty());
		attributes.put("accoNameOfOwner", getAccoNameOfOwner());
		attributes.put("accoLocation", getAccoLocation());
		attributes.put("accoCompanyNumber", getAccoCompanyNumber());
		attributes.put(
			"accoBusinessRegistrationNumber",
			getAccoBusinessRegistrationNumber());
		attributes.put("accoDateOfRegistration", getAccoDateOfRegistration());
		attributes.put("accoOwnerTrnNumber", getAccoOwnerTrnNumber());
		attributes.put("accoTccNumber", getAccoTccNumber());
		attributes.put("accoExpiryDate", getAccoExpiryDate());
		attributes.put("accoNameOfOperator", getAccoNameOfOperator());
		attributes.put("accoOperatorTrnNumber", getAccoOperatorTrnNumber());
		attributes.put("accoOperatorTccNumber", getAccoOperatorTccNumber());
		attributes.put("accoOperatorExpiryDate", getAccoOperatorExpiryDate());
		attributes.put("accoContactPerson", getAccoContactPerson());
		attributes.put("accoPositionHeld", getAccoPositionHeld());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewAccoFormId = (Long)attributes.get(
			"tourismNewAccoFormId");

		if (tourismNewAccoFormId != null) {
			setTourismNewAccoFormId(tourismNewAccoFormId);
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

		Date accoDateOfApplication = (Date)attributes.get(
			"accoDateOfApplication");

		if (accoDateOfApplication != null) {
			setAccoDateOfApplication(accoDateOfApplication);
		}

		String accoTypeOfAccommodation = (String)attributes.get(
			"accoTypeOfAccommodation");

		if (accoTypeOfAccommodation != null) {
			setAccoTypeOfAccommodation(accoTypeOfAccommodation);
		}

		String accoNameOfProperty = (String)attributes.get(
			"accoNameOfProperty");

		if (accoNameOfProperty != null) {
			setAccoNameOfProperty(accoNameOfProperty);
		}

		String accoNameOfOwner = (String)attributes.get("accoNameOfOwner");

		if (accoNameOfOwner != null) {
			setAccoNameOfOwner(accoNameOfOwner);
		}

		String accoLocation = (String)attributes.get("accoLocation");

		if (accoLocation != null) {
			setAccoLocation(accoLocation);
		}

		String accoCompanyNumber = (String)attributes.get("accoCompanyNumber");

		if (accoCompanyNumber != null) {
			setAccoCompanyNumber(accoCompanyNumber);
		}

		String accoBusinessRegistrationNumber = (String)attributes.get(
			"accoBusinessRegistrationNumber");

		if (accoBusinessRegistrationNumber != null) {
			setAccoBusinessRegistrationNumber(accoBusinessRegistrationNumber);
		}

		Date accoDateOfRegistration = (Date)attributes.get(
			"accoDateOfRegistration");

		if (accoDateOfRegistration != null) {
			setAccoDateOfRegistration(accoDateOfRegistration);
		}

		String accoOwnerTrnNumber = (String)attributes.get(
			"accoOwnerTrnNumber");

		if (accoOwnerTrnNumber != null) {
			setAccoOwnerTrnNumber(accoOwnerTrnNumber);
		}

		String accoTccNumber = (String)attributes.get("accoTccNumber");

		if (accoTccNumber != null) {
			setAccoTccNumber(accoTccNumber);
		}

		Date accoExpiryDate = (Date)attributes.get("accoExpiryDate");

		if (accoExpiryDate != null) {
			setAccoExpiryDate(accoExpiryDate);
		}

		String accoNameOfOperator = (String)attributes.get(
			"accoNameOfOperator");

		if (accoNameOfOperator != null) {
			setAccoNameOfOperator(accoNameOfOperator);
		}

		String accoOperatorTrnNumber = (String)attributes.get(
			"accoOperatorTrnNumber");

		if (accoOperatorTrnNumber != null) {
			setAccoOperatorTrnNumber(accoOperatorTrnNumber);
		}

		String accoOperatorTccNumber = (String)attributes.get(
			"accoOperatorTccNumber");

		if (accoOperatorTccNumber != null) {
			setAccoOperatorTccNumber(accoOperatorTccNumber);
		}

		Date accoOperatorExpiryDate = (Date)attributes.get(
			"accoOperatorExpiryDate");

		if (accoOperatorExpiryDate != null) {
			setAccoOperatorExpiryDate(accoOperatorExpiryDate);
		}

		String accoContactPerson = (String)attributes.get("accoContactPerson");

		if (accoContactPerson != null) {
			setAccoContactPerson(accoContactPerson);
		}

		String accoPositionHeld = (String)attributes.get("accoPositionHeld");

		if (accoPositionHeld != null) {
			setAccoPositionHeld(accoPositionHeld);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewAccommodationForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acco business registration number of this tourism new accommodation form.
	 *
	 * @return the acco business registration number of this tourism new accommodation form
	 */
	@Override
	public String getAccoBusinessRegistrationNumber() {
		return model.getAccoBusinessRegistrationNumber();
	}

	/**
	 * Returns the acco company number of this tourism new accommodation form.
	 *
	 * @return the acco company number of this tourism new accommodation form
	 */
	@Override
	public String getAccoCompanyNumber() {
		return model.getAccoCompanyNumber();
	}

	/**
	 * Returns the acco contact person of this tourism new accommodation form.
	 *
	 * @return the acco contact person of this tourism new accommodation form
	 */
	@Override
	public String getAccoContactPerson() {
		return model.getAccoContactPerson();
	}

	/**
	 * Returns the acco date of application of this tourism new accommodation form.
	 *
	 * @return the acco date of application of this tourism new accommodation form
	 */
	@Override
	public Date getAccoDateOfApplication() {
		return model.getAccoDateOfApplication();
	}

	/**
	 * Returns the acco date of registration of this tourism new accommodation form.
	 *
	 * @return the acco date of registration of this tourism new accommodation form
	 */
	@Override
	public Date getAccoDateOfRegistration() {
		return model.getAccoDateOfRegistration();
	}

	/**
	 * Returns the acco expiry date of this tourism new accommodation form.
	 *
	 * @return the acco expiry date of this tourism new accommodation form
	 */
	@Override
	public Date getAccoExpiryDate() {
		return model.getAccoExpiryDate();
	}

	/**
	 * Returns the acco location of this tourism new accommodation form.
	 *
	 * @return the acco location of this tourism new accommodation form
	 */
	@Override
	public String getAccoLocation() {
		return model.getAccoLocation();
	}

	/**
	 * Returns the acco name of operator of this tourism new accommodation form.
	 *
	 * @return the acco name of operator of this tourism new accommodation form
	 */
	@Override
	public String getAccoNameOfOperator() {
		return model.getAccoNameOfOperator();
	}

	/**
	 * Returns the acco name of owner of this tourism new accommodation form.
	 *
	 * @return the acco name of owner of this tourism new accommodation form
	 */
	@Override
	public String getAccoNameOfOwner() {
		return model.getAccoNameOfOwner();
	}

	/**
	 * Returns the acco name of property of this tourism new accommodation form.
	 *
	 * @return the acco name of property of this tourism new accommodation form
	 */
	@Override
	public String getAccoNameOfProperty() {
		return model.getAccoNameOfProperty();
	}

	/**
	 * Returns the acco operator expiry date of this tourism new accommodation form.
	 *
	 * @return the acco operator expiry date of this tourism new accommodation form
	 */
	@Override
	public Date getAccoOperatorExpiryDate() {
		return model.getAccoOperatorExpiryDate();
	}

	/**
	 * Returns the acco operator tcc number of this tourism new accommodation form.
	 *
	 * @return the acco operator tcc number of this tourism new accommodation form
	 */
	@Override
	public String getAccoOperatorTccNumber() {
		return model.getAccoOperatorTccNumber();
	}

	/**
	 * Returns the acco operator trn number of this tourism new accommodation form.
	 *
	 * @return the acco operator trn number of this tourism new accommodation form
	 */
	@Override
	public String getAccoOperatorTrnNumber() {
		return model.getAccoOperatorTrnNumber();
	}

	/**
	 * Returns the acco owner trn number of this tourism new accommodation form.
	 *
	 * @return the acco owner trn number of this tourism new accommodation form
	 */
	@Override
	public String getAccoOwnerTrnNumber() {
		return model.getAccoOwnerTrnNumber();
	}

	/**
	 * Returns the acco position held of this tourism new accommodation form.
	 *
	 * @return the acco position held of this tourism new accommodation form
	 */
	@Override
	public String getAccoPositionHeld() {
		return model.getAccoPositionHeld();
	}

	/**
	 * Returns the acco tcc number of this tourism new accommodation form.
	 *
	 * @return the acco tcc number of this tourism new accommodation form
	 */
	@Override
	public String getAccoTccNumber() {
		return model.getAccoTccNumber();
	}

	/**
	 * Returns the acco type of accommodation of this tourism new accommodation form.
	 *
	 * @return the acco type of accommodation of this tourism new accommodation form
	 */
	@Override
	public String getAccoTypeOfAccommodation() {
		return model.getAccoTypeOfAccommodation();
	}

	/**
	 * Returns the company ID of this tourism new accommodation form.
	 *
	 * @return the company ID of this tourism new accommodation form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new accommodation form.
	 *
	 * @return the create date of this tourism new accommodation form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism new accommodation form.
	 *
	 * @return the group ID of this tourism new accommodation form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new accommodation form.
	 *
	 * @return the modified date of this tourism new accommodation form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism new accommodation form.
	 *
	 * @return the primary key of this tourism new accommodation form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism new accommodation form.
	 *
	 * @return the tourism application ID of this tourism new accommodation form
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new acco form ID of this tourism new accommodation form.
	 *
	 * @return the tourism new acco form ID of this tourism new accommodation form
	 */
	@Override
	public long getTourismNewAccoFormId() {
		return model.getTourismNewAccoFormId();
	}

	/**
	 * Returns the user ID of this tourism new accommodation form.
	 *
	 * @return the user ID of this tourism new accommodation form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new accommodation form.
	 *
	 * @return the user name of this tourism new accommodation form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new accommodation form.
	 *
	 * @return the user uuid of this tourism new accommodation form
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
	 * Sets the acco business registration number of this tourism new accommodation form.
	 *
	 * @param accoBusinessRegistrationNumber the acco business registration number of this tourism new accommodation form
	 */
	@Override
	public void setAccoBusinessRegistrationNumber(
		String accoBusinessRegistrationNumber) {

		model.setAccoBusinessRegistrationNumber(accoBusinessRegistrationNumber);
	}

	/**
	 * Sets the acco company number of this tourism new accommodation form.
	 *
	 * @param accoCompanyNumber the acco company number of this tourism new accommodation form
	 */
	@Override
	public void setAccoCompanyNumber(String accoCompanyNumber) {
		model.setAccoCompanyNumber(accoCompanyNumber);
	}

	/**
	 * Sets the acco contact person of this tourism new accommodation form.
	 *
	 * @param accoContactPerson the acco contact person of this tourism new accommodation form
	 */
	@Override
	public void setAccoContactPerson(String accoContactPerson) {
		model.setAccoContactPerson(accoContactPerson);
	}

	/**
	 * Sets the acco date of application of this tourism new accommodation form.
	 *
	 * @param accoDateOfApplication the acco date of application of this tourism new accommodation form
	 */
	@Override
	public void setAccoDateOfApplication(Date accoDateOfApplication) {
		model.setAccoDateOfApplication(accoDateOfApplication);
	}

	/**
	 * Sets the acco date of registration of this tourism new accommodation form.
	 *
	 * @param accoDateOfRegistration the acco date of registration of this tourism new accommodation form
	 */
	@Override
	public void setAccoDateOfRegistration(Date accoDateOfRegistration) {
		model.setAccoDateOfRegistration(accoDateOfRegistration);
	}

	/**
	 * Sets the acco expiry date of this tourism new accommodation form.
	 *
	 * @param accoExpiryDate the acco expiry date of this tourism new accommodation form
	 */
	@Override
	public void setAccoExpiryDate(Date accoExpiryDate) {
		model.setAccoExpiryDate(accoExpiryDate);
	}

	/**
	 * Sets the acco location of this tourism new accommodation form.
	 *
	 * @param accoLocation the acco location of this tourism new accommodation form
	 */
	@Override
	public void setAccoLocation(String accoLocation) {
		model.setAccoLocation(accoLocation);
	}

	/**
	 * Sets the acco name of operator of this tourism new accommodation form.
	 *
	 * @param accoNameOfOperator the acco name of operator of this tourism new accommodation form
	 */
	@Override
	public void setAccoNameOfOperator(String accoNameOfOperator) {
		model.setAccoNameOfOperator(accoNameOfOperator);
	}

	/**
	 * Sets the acco name of owner of this tourism new accommodation form.
	 *
	 * @param accoNameOfOwner the acco name of owner of this tourism new accommodation form
	 */
	@Override
	public void setAccoNameOfOwner(String accoNameOfOwner) {
		model.setAccoNameOfOwner(accoNameOfOwner);
	}

	/**
	 * Sets the acco name of property of this tourism new accommodation form.
	 *
	 * @param accoNameOfProperty the acco name of property of this tourism new accommodation form
	 */
	@Override
	public void setAccoNameOfProperty(String accoNameOfProperty) {
		model.setAccoNameOfProperty(accoNameOfProperty);
	}

	/**
	 * Sets the acco operator expiry date of this tourism new accommodation form.
	 *
	 * @param accoOperatorExpiryDate the acco operator expiry date of this tourism new accommodation form
	 */
	@Override
	public void setAccoOperatorExpiryDate(Date accoOperatorExpiryDate) {
		model.setAccoOperatorExpiryDate(accoOperatorExpiryDate);
	}

	/**
	 * Sets the acco operator tcc number of this tourism new accommodation form.
	 *
	 * @param accoOperatorTccNumber the acco operator tcc number of this tourism new accommodation form
	 */
	@Override
	public void setAccoOperatorTccNumber(String accoOperatorTccNumber) {
		model.setAccoOperatorTccNumber(accoOperatorTccNumber);
	}

	/**
	 * Sets the acco operator trn number of this tourism new accommodation form.
	 *
	 * @param accoOperatorTrnNumber the acco operator trn number of this tourism new accommodation form
	 */
	@Override
	public void setAccoOperatorTrnNumber(String accoOperatorTrnNumber) {
		model.setAccoOperatorTrnNumber(accoOperatorTrnNumber);
	}

	/**
	 * Sets the acco owner trn number of this tourism new accommodation form.
	 *
	 * @param accoOwnerTrnNumber the acco owner trn number of this tourism new accommodation form
	 */
	@Override
	public void setAccoOwnerTrnNumber(String accoOwnerTrnNumber) {
		model.setAccoOwnerTrnNumber(accoOwnerTrnNumber);
	}

	/**
	 * Sets the acco position held of this tourism new accommodation form.
	 *
	 * @param accoPositionHeld the acco position held of this tourism new accommodation form
	 */
	@Override
	public void setAccoPositionHeld(String accoPositionHeld) {
		model.setAccoPositionHeld(accoPositionHeld);
	}

	/**
	 * Sets the acco tcc number of this tourism new accommodation form.
	 *
	 * @param accoTccNumber the acco tcc number of this tourism new accommodation form
	 */
	@Override
	public void setAccoTccNumber(String accoTccNumber) {
		model.setAccoTccNumber(accoTccNumber);
	}

	/**
	 * Sets the acco type of accommodation of this tourism new accommodation form.
	 *
	 * @param accoTypeOfAccommodation the acco type of accommodation of this tourism new accommodation form
	 */
	@Override
	public void setAccoTypeOfAccommodation(String accoTypeOfAccommodation) {
		model.setAccoTypeOfAccommodation(accoTypeOfAccommodation);
	}

	/**
	 * Sets the company ID of this tourism new accommodation form.
	 *
	 * @param companyId the company ID of this tourism new accommodation form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new accommodation form.
	 *
	 * @param createDate the create date of this tourism new accommodation form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism new accommodation form.
	 *
	 * @param groupId the group ID of this tourism new accommodation form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new accommodation form.
	 *
	 * @param modifiedDate the modified date of this tourism new accommodation form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism new accommodation form.
	 *
	 * @param primaryKey the primary key of this tourism new accommodation form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism new accommodation form.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new accommodation form
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new acco form ID of this tourism new accommodation form.
	 *
	 * @param tourismNewAccoFormId the tourism new acco form ID of this tourism new accommodation form
	 */
	@Override
	public void setTourismNewAccoFormId(long tourismNewAccoFormId) {
		model.setTourismNewAccoFormId(tourismNewAccoFormId);
	}

	/**
	 * Sets the user ID of this tourism new accommodation form.
	 *
	 * @param userId the user ID of this tourism new accommodation form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new accommodation form.
	 *
	 * @param userName the user name of this tourism new accommodation form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new accommodation form.
	 *
	 * @param userUuid the user uuid of this tourism new accommodation form
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
	protected TourismNewAccommodationFormWrapper wrap(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		return new TourismNewAccommodationFormWrapper(
			tourismNewAccommodationForm);
	}

}