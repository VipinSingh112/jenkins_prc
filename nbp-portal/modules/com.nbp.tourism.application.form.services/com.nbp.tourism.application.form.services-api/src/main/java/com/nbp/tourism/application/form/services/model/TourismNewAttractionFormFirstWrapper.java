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
 * This class is a wrapper for {@link TourismNewAttractionFormFirst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirst
 * @generated
 */
public class TourismNewAttractionFormFirstWrapper
	extends BaseModelWrapper<TourismNewAttractionFormFirst>
	implements ModelWrapper<TourismNewAttractionFormFirst>,
			   TourismNewAttractionFormFirst {

	public TourismNewAttractionFormFirstWrapper(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		super(tourismNewAttractionFormFirst);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismNewAttractFormFirstId", getTourismNewAttractFormFirstId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"attractionDateOfApplication", getAttractionDateOfApplication());
		attributes.put("typeOfAttrcation", getTypeOfAttrcation());
		attributes.put(
			"attractionNameOfProperty", getAttractionNameOfProperty());
		attributes.put("attractionNameOfOwner", getAttractionNameOfOwner());
		attributes.put("attractionLocation", getAttractionLocation());
		attributes.put("attractionCompanyNumber", getAttractionCompanyNumber());
		attributes.put(
			"attractionBusinessRegisNo", getAttractionBusinessRegisNo());
		attributes.put(
			"attractionDateOfRegistration", getAttractionDateOfRegistration());
		attributes.put(
			"attractionOwnerTrnNumber", getAttractionOwnerTrnNumber());
		attributes.put("attractionTccNumber", getAttractionTccNumber());
		attributes.put("attractionExpiryDate", getAttractionExpiryDate());
		attributes.put(
			"attractionNameOfOperator", getAttractionNameOfOperator());
		attributes.put(
			"attractionoperatorTrnNumber", getAttractionoperatorTrnNumber());
		attributes.put(
			"attractionOperatorTccNumber", getAttractionOperatorTccNumber());
		attributes.put(
			"attractOperatorExpiryDate", getAttractOperatorExpiryDate());
		attributes.put("attractionContactPerson", getAttractionContactPerson());
		attributes.put("attractionPositionHeld", getAttractionPositionHeld());
		attributes.put("attractionEntityId", getAttractionEntityId());
		attributes.put(
			"attractionBriefdescription", getAttractionBriefdescription());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewAttractFormFirstId = (Long)attributes.get(
			"tourismNewAttractFormFirstId");

		if (tourismNewAttractFormFirstId != null) {
			setTourismNewAttractFormFirstId(tourismNewAttractFormFirstId);
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

		Date attractionDateOfApplication = (Date)attributes.get(
			"attractionDateOfApplication");

		if (attractionDateOfApplication != null) {
			setAttractionDateOfApplication(attractionDateOfApplication);
		}

		String typeOfAttrcation = (String)attributes.get("typeOfAttrcation");

		if (typeOfAttrcation != null) {
			setTypeOfAttrcation(typeOfAttrcation);
		}

		String attractionNameOfProperty = (String)attributes.get(
			"attractionNameOfProperty");

		if (attractionNameOfProperty != null) {
			setAttractionNameOfProperty(attractionNameOfProperty);
		}

		String attractionNameOfOwner = (String)attributes.get(
			"attractionNameOfOwner");

		if (attractionNameOfOwner != null) {
			setAttractionNameOfOwner(attractionNameOfOwner);
		}

		String attractionLocation = (String)attributes.get(
			"attractionLocation");

		if (attractionLocation != null) {
			setAttractionLocation(attractionLocation);
		}

		String attractionCompanyNumber = (String)attributes.get(
			"attractionCompanyNumber");

		if (attractionCompanyNumber != null) {
			setAttractionCompanyNumber(attractionCompanyNumber);
		}

		String attractionBusinessRegisNo = (String)attributes.get(
			"attractionBusinessRegisNo");

		if (attractionBusinessRegisNo != null) {
			setAttractionBusinessRegisNo(attractionBusinessRegisNo);
		}

		Date attractionDateOfRegistration = (Date)attributes.get(
			"attractionDateOfRegistration");

		if (attractionDateOfRegistration != null) {
			setAttractionDateOfRegistration(attractionDateOfRegistration);
		}

		String attractionOwnerTrnNumber = (String)attributes.get(
			"attractionOwnerTrnNumber");

		if (attractionOwnerTrnNumber != null) {
			setAttractionOwnerTrnNumber(attractionOwnerTrnNumber);
		}

		String attractionTccNumber = (String)attributes.get(
			"attractionTccNumber");

		if (attractionTccNumber != null) {
			setAttractionTccNumber(attractionTccNumber);
		}

		Date attractionExpiryDate = (Date)attributes.get(
			"attractionExpiryDate");

		if (attractionExpiryDate != null) {
			setAttractionExpiryDate(attractionExpiryDate);
		}

		String attractionNameOfOperator = (String)attributes.get(
			"attractionNameOfOperator");

		if (attractionNameOfOperator != null) {
			setAttractionNameOfOperator(attractionNameOfOperator);
		}

		String attractionoperatorTrnNumber = (String)attributes.get(
			"attractionoperatorTrnNumber");

		if (attractionoperatorTrnNumber != null) {
			setAttractionoperatorTrnNumber(attractionoperatorTrnNumber);
		}

		String attractionOperatorTccNumber = (String)attributes.get(
			"attractionOperatorTccNumber");

		if (attractionOperatorTccNumber != null) {
			setAttractionOperatorTccNumber(attractionOperatorTccNumber);
		}

		Date attractOperatorExpiryDate = (Date)attributes.get(
			"attractOperatorExpiryDate");

		if (attractOperatorExpiryDate != null) {
			setAttractOperatorExpiryDate(attractOperatorExpiryDate);
		}

		String attractionContactPerson = (String)attributes.get(
			"attractionContactPerson");

		if (attractionContactPerson != null) {
			setAttractionContactPerson(attractionContactPerson);
		}

		String attractionPositionHeld = (String)attributes.get(
			"attractionPositionHeld");

		if (attractionPositionHeld != null) {
			setAttractionPositionHeld(attractionPositionHeld);
		}

		String attractionEntityId = (String)attributes.get(
			"attractionEntityId");

		if (attractionEntityId != null) {
			setAttractionEntityId(attractionEntityId);
		}

		String attractionBriefdescription = (String)attributes.get(
			"attractionBriefdescription");

		if (attractionBriefdescription != null) {
			setAttractionBriefdescription(attractionBriefdescription);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewAttractionFormFirst cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction briefdescription of this tourism new attraction form first.
	 *
	 * @return the attraction briefdescription of this tourism new attraction form first
	 */
	@Override
	public String getAttractionBriefdescription() {
		return model.getAttractionBriefdescription();
	}

	/**
	 * Returns the attraction business regis no of this tourism new attraction form first.
	 *
	 * @return the attraction business regis no of this tourism new attraction form first
	 */
	@Override
	public String getAttractionBusinessRegisNo() {
		return model.getAttractionBusinessRegisNo();
	}

	/**
	 * Returns the attraction company number of this tourism new attraction form first.
	 *
	 * @return the attraction company number of this tourism new attraction form first
	 */
	@Override
	public String getAttractionCompanyNumber() {
		return model.getAttractionCompanyNumber();
	}

	/**
	 * Returns the attraction contact person of this tourism new attraction form first.
	 *
	 * @return the attraction contact person of this tourism new attraction form first
	 */
	@Override
	public String getAttractionContactPerson() {
		return model.getAttractionContactPerson();
	}

	/**
	 * Returns the attraction date of application of this tourism new attraction form first.
	 *
	 * @return the attraction date of application of this tourism new attraction form first
	 */
	@Override
	public Date getAttractionDateOfApplication() {
		return model.getAttractionDateOfApplication();
	}

	/**
	 * Returns the attraction date of registration of this tourism new attraction form first.
	 *
	 * @return the attraction date of registration of this tourism new attraction form first
	 */
	@Override
	public Date getAttractionDateOfRegistration() {
		return model.getAttractionDateOfRegistration();
	}

	/**
	 * Returns the attraction entity ID of this tourism new attraction form first.
	 *
	 * @return the attraction entity ID of this tourism new attraction form first
	 */
	@Override
	public String getAttractionEntityId() {
		return model.getAttractionEntityId();
	}

	/**
	 * Returns the attraction expiry date of this tourism new attraction form first.
	 *
	 * @return the attraction expiry date of this tourism new attraction form first
	 */
	@Override
	public Date getAttractionExpiryDate() {
		return model.getAttractionExpiryDate();
	}

	/**
	 * Returns the attraction location of this tourism new attraction form first.
	 *
	 * @return the attraction location of this tourism new attraction form first
	 */
	@Override
	public String getAttractionLocation() {
		return model.getAttractionLocation();
	}

	/**
	 * Returns the attraction name of operator of this tourism new attraction form first.
	 *
	 * @return the attraction name of operator of this tourism new attraction form first
	 */
	@Override
	public String getAttractionNameOfOperator() {
		return model.getAttractionNameOfOperator();
	}

	/**
	 * Returns the attraction name of owner of this tourism new attraction form first.
	 *
	 * @return the attraction name of owner of this tourism new attraction form first
	 */
	@Override
	public String getAttractionNameOfOwner() {
		return model.getAttractionNameOfOwner();
	}

	/**
	 * Returns the attraction name of property of this tourism new attraction form first.
	 *
	 * @return the attraction name of property of this tourism new attraction form first
	 */
	@Override
	public String getAttractionNameOfProperty() {
		return model.getAttractionNameOfProperty();
	}

	/**
	 * Returns the attraction operator tcc number of this tourism new attraction form first.
	 *
	 * @return the attraction operator tcc number of this tourism new attraction form first
	 */
	@Override
	public String getAttractionOperatorTccNumber() {
		return model.getAttractionOperatorTccNumber();
	}

	/**
	 * Returns the attractionoperator trn number of this tourism new attraction form first.
	 *
	 * @return the attractionoperator trn number of this tourism new attraction form first
	 */
	@Override
	public String getAttractionoperatorTrnNumber() {
		return model.getAttractionoperatorTrnNumber();
	}

	/**
	 * Returns the attraction owner trn number of this tourism new attraction form first.
	 *
	 * @return the attraction owner trn number of this tourism new attraction form first
	 */
	@Override
	public String getAttractionOwnerTrnNumber() {
		return model.getAttractionOwnerTrnNumber();
	}

	/**
	 * Returns the attraction position held of this tourism new attraction form first.
	 *
	 * @return the attraction position held of this tourism new attraction form first
	 */
	@Override
	public String getAttractionPositionHeld() {
		return model.getAttractionPositionHeld();
	}

	/**
	 * Returns the attraction tcc number of this tourism new attraction form first.
	 *
	 * @return the attraction tcc number of this tourism new attraction form first
	 */
	@Override
	public String getAttractionTccNumber() {
		return model.getAttractionTccNumber();
	}

	/**
	 * Returns the attract operator expiry date of this tourism new attraction form first.
	 *
	 * @return the attract operator expiry date of this tourism new attraction form first
	 */
	@Override
	public Date getAttractOperatorExpiryDate() {
		return model.getAttractOperatorExpiryDate();
	}

	/**
	 * Returns the company ID of this tourism new attraction form first.
	 *
	 * @return the company ID of this tourism new attraction form first
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new attraction form first.
	 *
	 * @return the create date of this tourism new attraction form first
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism new attraction form first.
	 *
	 * @return the group ID of this tourism new attraction form first
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism new attraction form first.
	 *
	 * @return the modified date of this tourism new attraction form first
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism new attraction form first.
	 *
	 * @return the primary key of this tourism new attraction form first
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism new attraction form first.
	 *
	 * @return the tourism application ID of this tourism new attraction form first
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new attract form first ID of this tourism new attraction form first.
	 *
	 * @return the tourism new attract form first ID of this tourism new attraction form first
	 */
	@Override
	public long getTourismNewAttractFormFirstId() {
		return model.getTourismNewAttractFormFirstId();
	}

	/**
	 * Returns the type of attrcation of this tourism new attraction form first.
	 *
	 * @return the type of attrcation of this tourism new attraction form first
	 */
	@Override
	public String getTypeOfAttrcation() {
		return model.getTypeOfAttrcation();
	}

	/**
	 * Returns the user ID of this tourism new attraction form first.
	 *
	 * @return the user ID of this tourism new attraction form first
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new attraction form first.
	 *
	 * @return the user name of this tourism new attraction form first
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new attraction form first.
	 *
	 * @return the user uuid of this tourism new attraction form first
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
	 * Sets the attraction briefdescription of this tourism new attraction form first.
	 *
	 * @param attractionBriefdescription the attraction briefdescription of this tourism new attraction form first
	 */
	@Override
	public void setAttractionBriefdescription(
		String attractionBriefdescription) {

		model.setAttractionBriefdescription(attractionBriefdescription);
	}

	/**
	 * Sets the attraction business regis no of this tourism new attraction form first.
	 *
	 * @param attractionBusinessRegisNo the attraction business regis no of this tourism new attraction form first
	 */
	@Override
	public void setAttractionBusinessRegisNo(String attractionBusinessRegisNo) {
		model.setAttractionBusinessRegisNo(attractionBusinessRegisNo);
	}

	/**
	 * Sets the attraction company number of this tourism new attraction form first.
	 *
	 * @param attractionCompanyNumber the attraction company number of this tourism new attraction form first
	 */
	@Override
	public void setAttractionCompanyNumber(String attractionCompanyNumber) {
		model.setAttractionCompanyNumber(attractionCompanyNumber);
	}

	/**
	 * Sets the attraction contact person of this tourism new attraction form first.
	 *
	 * @param attractionContactPerson the attraction contact person of this tourism new attraction form first
	 */
	@Override
	public void setAttractionContactPerson(String attractionContactPerson) {
		model.setAttractionContactPerson(attractionContactPerson);
	}

	/**
	 * Sets the attraction date of application of this tourism new attraction form first.
	 *
	 * @param attractionDateOfApplication the attraction date of application of this tourism new attraction form first
	 */
	@Override
	public void setAttractionDateOfApplication(
		Date attractionDateOfApplication) {

		model.setAttractionDateOfApplication(attractionDateOfApplication);
	}

	/**
	 * Sets the attraction date of registration of this tourism new attraction form first.
	 *
	 * @param attractionDateOfRegistration the attraction date of registration of this tourism new attraction form first
	 */
	@Override
	public void setAttractionDateOfRegistration(
		Date attractionDateOfRegistration) {

		model.setAttractionDateOfRegistration(attractionDateOfRegistration);
	}

	/**
	 * Sets the attraction entity ID of this tourism new attraction form first.
	 *
	 * @param attractionEntityId the attraction entity ID of this tourism new attraction form first
	 */
	@Override
	public void setAttractionEntityId(String attractionEntityId) {
		model.setAttractionEntityId(attractionEntityId);
	}

	/**
	 * Sets the attraction expiry date of this tourism new attraction form first.
	 *
	 * @param attractionExpiryDate the attraction expiry date of this tourism new attraction form first
	 */
	@Override
	public void setAttractionExpiryDate(Date attractionExpiryDate) {
		model.setAttractionExpiryDate(attractionExpiryDate);
	}

	/**
	 * Sets the attraction location of this tourism new attraction form first.
	 *
	 * @param attractionLocation the attraction location of this tourism new attraction form first
	 */
	@Override
	public void setAttractionLocation(String attractionLocation) {
		model.setAttractionLocation(attractionLocation);
	}

	/**
	 * Sets the attraction name of operator of this tourism new attraction form first.
	 *
	 * @param attractionNameOfOperator the attraction name of operator of this tourism new attraction form first
	 */
	@Override
	public void setAttractionNameOfOperator(String attractionNameOfOperator) {
		model.setAttractionNameOfOperator(attractionNameOfOperator);
	}

	/**
	 * Sets the attraction name of owner of this tourism new attraction form first.
	 *
	 * @param attractionNameOfOwner the attraction name of owner of this tourism new attraction form first
	 */
	@Override
	public void setAttractionNameOfOwner(String attractionNameOfOwner) {
		model.setAttractionNameOfOwner(attractionNameOfOwner);
	}

	/**
	 * Sets the attraction name of property of this tourism new attraction form first.
	 *
	 * @param attractionNameOfProperty the attraction name of property of this tourism new attraction form first
	 */
	@Override
	public void setAttractionNameOfProperty(String attractionNameOfProperty) {
		model.setAttractionNameOfProperty(attractionNameOfProperty);
	}

	/**
	 * Sets the attraction operator tcc number of this tourism new attraction form first.
	 *
	 * @param attractionOperatorTccNumber the attraction operator tcc number of this tourism new attraction form first
	 */
	@Override
	public void setAttractionOperatorTccNumber(
		String attractionOperatorTccNumber) {

		model.setAttractionOperatorTccNumber(attractionOperatorTccNumber);
	}

	/**
	 * Sets the attractionoperator trn number of this tourism new attraction form first.
	 *
	 * @param attractionoperatorTrnNumber the attractionoperator trn number of this tourism new attraction form first
	 */
	@Override
	public void setAttractionoperatorTrnNumber(
		String attractionoperatorTrnNumber) {

		model.setAttractionoperatorTrnNumber(attractionoperatorTrnNumber);
	}

	/**
	 * Sets the attraction owner trn number of this tourism new attraction form first.
	 *
	 * @param attractionOwnerTrnNumber the attraction owner trn number of this tourism new attraction form first
	 */
	@Override
	public void setAttractionOwnerTrnNumber(String attractionOwnerTrnNumber) {
		model.setAttractionOwnerTrnNumber(attractionOwnerTrnNumber);
	}

	/**
	 * Sets the attraction position held of this tourism new attraction form first.
	 *
	 * @param attractionPositionHeld the attraction position held of this tourism new attraction form first
	 */
	@Override
	public void setAttractionPositionHeld(String attractionPositionHeld) {
		model.setAttractionPositionHeld(attractionPositionHeld);
	}

	/**
	 * Sets the attraction tcc number of this tourism new attraction form first.
	 *
	 * @param attractionTccNumber the attraction tcc number of this tourism new attraction form first
	 */
	@Override
	public void setAttractionTccNumber(String attractionTccNumber) {
		model.setAttractionTccNumber(attractionTccNumber);
	}

	/**
	 * Sets the attract operator expiry date of this tourism new attraction form first.
	 *
	 * @param attractOperatorExpiryDate the attract operator expiry date of this tourism new attraction form first
	 */
	@Override
	public void setAttractOperatorExpiryDate(Date attractOperatorExpiryDate) {
		model.setAttractOperatorExpiryDate(attractOperatorExpiryDate);
	}

	/**
	 * Sets the company ID of this tourism new attraction form first.
	 *
	 * @param companyId the company ID of this tourism new attraction form first
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new attraction form first.
	 *
	 * @param createDate the create date of this tourism new attraction form first
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism new attraction form first.
	 *
	 * @param groupId the group ID of this tourism new attraction form first
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism new attraction form first.
	 *
	 * @param modifiedDate the modified date of this tourism new attraction form first
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism new attraction form first.
	 *
	 * @param primaryKey the primary key of this tourism new attraction form first
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism new attraction form first.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new attraction form first
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new attract form first ID of this tourism new attraction form first.
	 *
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID of this tourism new attraction form first
	 */
	@Override
	public void setTourismNewAttractFormFirstId(
		long tourismNewAttractFormFirstId) {

		model.setTourismNewAttractFormFirstId(tourismNewAttractFormFirstId);
	}

	/**
	 * Sets the type of attrcation of this tourism new attraction form first.
	 *
	 * @param typeOfAttrcation the type of attrcation of this tourism new attraction form first
	 */
	@Override
	public void setTypeOfAttrcation(String typeOfAttrcation) {
		model.setTypeOfAttrcation(typeOfAttrcation);
	}

	/**
	 * Sets the user ID of this tourism new attraction form first.
	 *
	 * @param userId the user ID of this tourism new attraction form first
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new attraction form first.
	 *
	 * @param userName the user name of this tourism new attraction form first
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new attraction form first.
	 *
	 * @param userUuid the user uuid of this tourism new attraction form first
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
	protected TourismNewAttractionFormFirstWrapper wrap(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return new TourismNewAttractionFormFirstWrapper(
			tourismNewAttractionFormFirst);
	}

}