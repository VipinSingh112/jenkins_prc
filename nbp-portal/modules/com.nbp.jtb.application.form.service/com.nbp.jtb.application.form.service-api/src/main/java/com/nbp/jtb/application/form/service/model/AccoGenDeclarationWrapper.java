/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccoGenDeclaration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoGenDeclaration
 * @generated
 */
public class AccoGenDeclarationWrapper
	extends BaseModelWrapper<AccoGenDeclaration>
	implements AccoGenDeclaration, ModelWrapper<AccoGenDeclaration> {

	public AccoGenDeclarationWrapper(AccoGenDeclaration accoGenDeclaration) {
		super(accoGenDeclaration);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accoGenDeclarationId", getAccoGenDeclarationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("noOfBedroom", getNoOfBedroom());
		attributes.put("ownerOfHotel", getOwnerOfHotel());
		attributes.put("addressOne", getAddressOne());
		attributes.put("compIncorporatedOne", getCompIncorporatedOne());
		attributes.put("companyDate", getCompanyDate());
		attributes.put("hotelOperator", getHotelOperator());
		attributes.put("hotelOperatorDateSince", getHotelOperatorDateSince());
		attributes.put("addressTwo", getAddressTwo());
		attributes.put("compIncorporatedTwo", getCompIncorporatedTwo());
		attributes.put("hotelOperatorName", getHotelOperatorName());
		attributes.put("dateTwo", getDateTwo());
		attributes.put("hotelIncepDate", getHotelIncepDate());
		attributes.put("financeOfOper", getFinanceOfOper());
		attributes.put("noOfEmployee", getNoOfEmployee());
		attributes.put("signatureDate", getSignatureDate());
		attributes.put("nameOfManager", getNameOfManager());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accoGenDeclarationId = (Long)attributes.get(
			"accoGenDeclarationId");

		if (accoGenDeclarationId != null) {
			setAccoGenDeclarationId(accoGenDeclarationId);
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

		String noOfBedroom = (String)attributes.get("noOfBedroom");

		if (noOfBedroom != null) {
			setNoOfBedroom(noOfBedroom);
		}

		String ownerOfHotel = (String)attributes.get("ownerOfHotel");

		if (ownerOfHotel != null) {
			setOwnerOfHotel(ownerOfHotel);
		}

		String addressOne = (String)attributes.get("addressOne");

		if (addressOne != null) {
			setAddressOne(addressOne);
		}

		String compIncorporatedOne = (String)attributes.get(
			"compIncorporatedOne");

		if (compIncorporatedOne != null) {
			setCompIncorporatedOne(compIncorporatedOne);
		}

		Date companyDate = (Date)attributes.get("companyDate");

		if (companyDate != null) {
			setCompanyDate(companyDate);
		}

		String hotelOperator = (String)attributes.get("hotelOperator");

		if (hotelOperator != null) {
			setHotelOperator(hotelOperator);
		}

		Date hotelOperatorDateSince = (Date)attributes.get(
			"hotelOperatorDateSince");

		if (hotelOperatorDateSince != null) {
			setHotelOperatorDateSince(hotelOperatorDateSince);
		}

		String addressTwo = (String)attributes.get("addressTwo");

		if (addressTwo != null) {
			setAddressTwo(addressTwo);
		}

		String compIncorporatedTwo = (String)attributes.get(
			"compIncorporatedTwo");

		if (compIncorporatedTwo != null) {
			setCompIncorporatedTwo(compIncorporatedTwo);
		}

		String hotelOperatorName = (String)attributes.get("hotelOperatorName");

		if (hotelOperatorName != null) {
			setHotelOperatorName(hotelOperatorName);
		}

		Date dateTwo = (Date)attributes.get("dateTwo");

		if (dateTwo != null) {
			setDateTwo(dateTwo);
		}

		Date hotelIncepDate = (Date)attributes.get("hotelIncepDate");

		if (hotelIncepDate != null) {
			setHotelIncepDate(hotelIncepDate);
		}

		String financeOfOper = (String)attributes.get("financeOfOper");

		if (financeOfOper != null) {
			setFinanceOfOper(financeOfOper);
		}

		String noOfEmployee = (String)attributes.get("noOfEmployee");

		if (noOfEmployee != null) {
			setNoOfEmployee(noOfEmployee);
		}

		Date signatureDate = (Date)attributes.get("signatureDate");

		if (signatureDate != null) {
			setSignatureDate(signatureDate);
		}

		String nameOfManager = (String)attributes.get("nameOfManager");

		if (nameOfManager != null) {
			setNameOfManager(nameOfManager);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AccoGenDeclaration cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acco gen declaration ID of this acco gen declaration.
	 *
	 * @return the acco gen declaration ID of this acco gen declaration
	 */
	@Override
	public long getAccoGenDeclarationId() {
		return model.getAccoGenDeclarationId();
	}

	/**
	 * Returns the address one of this acco gen declaration.
	 *
	 * @return the address one of this acco gen declaration
	 */
	@Override
	public String getAddressOne() {
		return model.getAddressOne();
	}

	/**
	 * Returns the address two of this acco gen declaration.
	 *
	 * @return the address two of this acco gen declaration
	 */
	@Override
	public String getAddressTwo() {
		return model.getAddressTwo();
	}

	/**
	 * Returns the company date of this acco gen declaration.
	 *
	 * @return the company date of this acco gen declaration
	 */
	@Override
	public Date getCompanyDate() {
		return model.getCompanyDate();
	}

	/**
	 * Returns the company ID of this acco gen declaration.
	 *
	 * @return the company ID of this acco gen declaration
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the comp incorporated one of this acco gen declaration.
	 *
	 * @return the comp incorporated one of this acco gen declaration
	 */
	@Override
	public String getCompIncorporatedOne() {
		return model.getCompIncorporatedOne();
	}

	/**
	 * Returns the comp incorporated two of this acco gen declaration.
	 *
	 * @return the comp incorporated two of this acco gen declaration
	 */
	@Override
	public String getCompIncorporatedTwo() {
		return model.getCompIncorporatedTwo();
	}

	/**
	 * Returns the create date of this acco gen declaration.
	 *
	 * @return the create date of this acco gen declaration
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date two of this acco gen declaration.
	 *
	 * @return the date two of this acco gen declaration
	 */
	@Override
	public Date getDateTwo() {
		return model.getDateTwo();
	}

	/**
	 * Returns the finance of oper of this acco gen declaration.
	 *
	 * @return the finance of oper of this acco gen declaration
	 */
	@Override
	public String getFinanceOfOper() {
		return model.getFinanceOfOper();
	}

	/**
	 * Returns the group ID of this acco gen declaration.
	 *
	 * @return the group ID of this acco gen declaration
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hotel incep date of this acco gen declaration.
	 *
	 * @return the hotel incep date of this acco gen declaration
	 */
	@Override
	public Date getHotelIncepDate() {
		return model.getHotelIncepDate();
	}

	/**
	 * Returns the hotel operator of this acco gen declaration.
	 *
	 * @return the hotel operator of this acco gen declaration
	 */
	@Override
	public String getHotelOperator() {
		return model.getHotelOperator();
	}

	/**
	 * Returns the hotel operator date since of this acco gen declaration.
	 *
	 * @return the hotel operator date since of this acco gen declaration
	 */
	@Override
	public Date getHotelOperatorDateSince() {
		return model.getHotelOperatorDateSince();
	}

	/**
	 * Returns the hotel operator name of this acco gen declaration.
	 *
	 * @return the hotel operator name of this acco gen declaration
	 */
	@Override
	public String getHotelOperatorName() {
		return model.getHotelOperatorName();
	}

	/**
	 * Returns the jtb application ID of this acco gen declaration.
	 *
	 * @return the jtb application ID of this acco gen declaration
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this acco gen declaration.
	 *
	 * @return the modified date of this acco gen declaration
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of manager of this acco gen declaration.
	 *
	 * @return the name of manager of this acco gen declaration
	 */
	@Override
	public String getNameOfManager() {
		return model.getNameOfManager();
	}

	/**
	 * Returns the no of bedroom of this acco gen declaration.
	 *
	 * @return the no of bedroom of this acco gen declaration
	 */
	@Override
	public String getNoOfBedroom() {
		return model.getNoOfBedroom();
	}

	/**
	 * Returns the no of employee of this acco gen declaration.
	 *
	 * @return the no of employee of this acco gen declaration
	 */
	@Override
	public String getNoOfEmployee() {
		return model.getNoOfEmployee();
	}

	/**
	 * Returns the owner of hotel of this acco gen declaration.
	 *
	 * @return the owner of hotel of this acco gen declaration
	 */
	@Override
	public String getOwnerOfHotel() {
		return model.getOwnerOfHotel();
	}

	/**
	 * Returns the primary key of this acco gen declaration.
	 *
	 * @return the primary key of this acco gen declaration
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the signature date of this acco gen declaration.
	 *
	 * @return the signature date of this acco gen declaration
	 */
	@Override
	public Date getSignatureDate() {
		return model.getSignatureDate();
	}

	/**
	 * Returns the user ID of this acco gen declaration.
	 *
	 * @return the user ID of this acco gen declaration
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acco gen declaration.
	 *
	 * @return the user name of this acco gen declaration
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acco gen declaration.
	 *
	 * @return the user uuid of this acco gen declaration
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acco gen declaration.
	 *
	 * @return the uuid of this acco gen declaration
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acco gen declaration ID of this acco gen declaration.
	 *
	 * @param accoGenDeclarationId the acco gen declaration ID of this acco gen declaration
	 */
	@Override
	public void setAccoGenDeclarationId(long accoGenDeclarationId) {
		model.setAccoGenDeclarationId(accoGenDeclarationId);
	}

	/**
	 * Sets the address one of this acco gen declaration.
	 *
	 * @param addressOne the address one of this acco gen declaration
	 */
	@Override
	public void setAddressOne(String addressOne) {
		model.setAddressOne(addressOne);
	}

	/**
	 * Sets the address two of this acco gen declaration.
	 *
	 * @param addressTwo the address two of this acco gen declaration
	 */
	@Override
	public void setAddressTwo(String addressTwo) {
		model.setAddressTwo(addressTwo);
	}

	/**
	 * Sets the company date of this acco gen declaration.
	 *
	 * @param companyDate the company date of this acco gen declaration
	 */
	@Override
	public void setCompanyDate(Date companyDate) {
		model.setCompanyDate(companyDate);
	}

	/**
	 * Sets the company ID of this acco gen declaration.
	 *
	 * @param companyId the company ID of this acco gen declaration
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the comp incorporated one of this acco gen declaration.
	 *
	 * @param compIncorporatedOne the comp incorporated one of this acco gen declaration
	 */
	@Override
	public void setCompIncorporatedOne(String compIncorporatedOne) {
		model.setCompIncorporatedOne(compIncorporatedOne);
	}

	/**
	 * Sets the comp incorporated two of this acco gen declaration.
	 *
	 * @param compIncorporatedTwo the comp incorporated two of this acco gen declaration
	 */
	@Override
	public void setCompIncorporatedTwo(String compIncorporatedTwo) {
		model.setCompIncorporatedTwo(compIncorporatedTwo);
	}

	/**
	 * Sets the create date of this acco gen declaration.
	 *
	 * @param createDate the create date of this acco gen declaration
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date two of this acco gen declaration.
	 *
	 * @param dateTwo the date two of this acco gen declaration
	 */
	@Override
	public void setDateTwo(Date dateTwo) {
		model.setDateTwo(dateTwo);
	}

	/**
	 * Sets the finance of oper of this acco gen declaration.
	 *
	 * @param financeOfOper the finance of oper of this acco gen declaration
	 */
	@Override
	public void setFinanceOfOper(String financeOfOper) {
		model.setFinanceOfOper(financeOfOper);
	}

	/**
	 * Sets the group ID of this acco gen declaration.
	 *
	 * @param groupId the group ID of this acco gen declaration
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hotel incep date of this acco gen declaration.
	 *
	 * @param hotelIncepDate the hotel incep date of this acco gen declaration
	 */
	@Override
	public void setHotelIncepDate(Date hotelIncepDate) {
		model.setHotelIncepDate(hotelIncepDate);
	}

	/**
	 * Sets the hotel operator of this acco gen declaration.
	 *
	 * @param hotelOperator the hotel operator of this acco gen declaration
	 */
	@Override
	public void setHotelOperator(String hotelOperator) {
		model.setHotelOperator(hotelOperator);
	}

	/**
	 * Sets the hotel operator date since of this acco gen declaration.
	 *
	 * @param hotelOperatorDateSince the hotel operator date since of this acco gen declaration
	 */
	@Override
	public void setHotelOperatorDateSince(Date hotelOperatorDateSince) {
		model.setHotelOperatorDateSince(hotelOperatorDateSince);
	}

	/**
	 * Sets the hotel operator name of this acco gen declaration.
	 *
	 * @param hotelOperatorName the hotel operator name of this acco gen declaration
	 */
	@Override
	public void setHotelOperatorName(String hotelOperatorName) {
		model.setHotelOperatorName(hotelOperatorName);
	}

	/**
	 * Sets the jtb application ID of this acco gen declaration.
	 *
	 * @param jtbApplicationId the jtb application ID of this acco gen declaration
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this acco gen declaration.
	 *
	 * @param modifiedDate the modified date of this acco gen declaration
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of manager of this acco gen declaration.
	 *
	 * @param nameOfManager the name of manager of this acco gen declaration
	 */
	@Override
	public void setNameOfManager(String nameOfManager) {
		model.setNameOfManager(nameOfManager);
	}

	/**
	 * Sets the no of bedroom of this acco gen declaration.
	 *
	 * @param noOfBedroom the no of bedroom of this acco gen declaration
	 */
	@Override
	public void setNoOfBedroom(String noOfBedroom) {
		model.setNoOfBedroom(noOfBedroom);
	}

	/**
	 * Sets the no of employee of this acco gen declaration.
	 *
	 * @param noOfEmployee the no of employee of this acco gen declaration
	 */
	@Override
	public void setNoOfEmployee(String noOfEmployee) {
		model.setNoOfEmployee(noOfEmployee);
	}

	/**
	 * Sets the owner of hotel of this acco gen declaration.
	 *
	 * @param ownerOfHotel the owner of hotel of this acco gen declaration
	 */
	@Override
	public void setOwnerOfHotel(String ownerOfHotel) {
		model.setOwnerOfHotel(ownerOfHotel);
	}

	/**
	 * Sets the primary key of this acco gen declaration.
	 *
	 * @param primaryKey the primary key of this acco gen declaration
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the signature date of this acco gen declaration.
	 *
	 * @param signatureDate the signature date of this acco gen declaration
	 */
	@Override
	public void setSignatureDate(Date signatureDate) {
		model.setSignatureDate(signatureDate);
	}

	/**
	 * Sets the user ID of this acco gen declaration.
	 *
	 * @param userId the user ID of this acco gen declaration
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acco gen declaration.
	 *
	 * @param userName the user name of this acco gen declaration
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acco gen declaration.
	 *
	 * @param userUuid the user uuid of this acco gen declaration
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acco gen declaration.
	 *
	 * @param uuid the uuid of this acco gen declaration
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccoGenDeclarationWrapper wrap(
		AccoGenDeclaration accoGenDeclaration) {

		return new AccoGenDeclarationWrapper(accoGenDeclaration);
	}

}