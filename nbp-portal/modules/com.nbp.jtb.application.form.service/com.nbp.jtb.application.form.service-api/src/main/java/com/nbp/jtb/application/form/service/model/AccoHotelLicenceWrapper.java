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
 * This class is a wrapper for {@link AccoHotelLicence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoHotelLicence
 * @generated
 */
public class AccoHotelLicenceWrapper
	extends BaseModelWrapper<AccoHotelLicence>
	implements AccoHotelLicence, ModelWrapper<AccoHotelLicence> {

	public AccoHotelLicenceWrapper(AccoHotelLicence accoHotelLicence) {
		super(accoHotelLicence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accoHotelLicenceId", getAccoHotelLicenceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfOwner", getNameOfOwner());
		attributes.put("nameOfHotel", getNameOfHotel());
		attributes.put("telephoneNo", getTelephoneNo());
		attributes.put("faxNo", getFaxNo());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("parish", getParish());
		attributes.put("address", getAddress());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accoHotelLicenceId = (Long)attributes.get("accoHotelLicenceId");

		if (accoHotelLicenceId != null) {
			setAccoHotelLicenceId(accoHotelLicenceId);
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

		String nameOfOwner = (String)attributes.get("nameOfOwner");

		if (nameOfOwner != null) {
			setNameOfOwner(nameOfOwner);
		}

		String nameOfHotel = (String)attributes.get("nameOfHotel");

		if (nameOfHotel != null) {
			setNameOfHotel(nameOfHotel);
		}

		String telephoneNo = (String)attributes.get("telephoneNo");

		if (telephoneNo != null) {
			setTelephoneNo(telephoneNo);
		}

		String faxNo = (String)attributes.get("faxNo");

		if (faxNo != null) {
			setFaxNo(faxNo);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AccoHotelLicence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acco hotel licence ID of this acco hotel licence.
	 *
	 * @return the acco hotel licence ID of this acco hotel licence
	 */
	@Override
	public long getAccoHotelLicenceId() {
		return model.getAccoHotelLicenceId();
	}

	/**
	 * Returns the address of this acco hotel licence.
	 *
	 * @return the address of this acco hotel licence
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the company ID of this acco hotel licence.
	 *
	 * @return the company ID of this acco hotel licence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acco hotel licence.
	 *
	 * @return the create date of this acco hotel licence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this acco hotel licence.
	 *
	 * @return the email address of this acco hotel licence
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the fax no of this acco hotel licence.
	 *
	 * @return the fax no of this acco hotel licence
	 */
	@Override
	public String getFaxNo() {
		return model.getFaxNo();
	}

	/**
	 * Returns the group ID of this acco hotel licence.
	 *
	 * @return the group ID of this acco hotel licence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this acco hotel licence.
	 *
	 * @return the jtb application ID of this acco hotel licence
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this acco hotel licence.
	 *
	 * @return the modified date of this acco hotel licence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of hotel of this acco hotel licence.
	 *
	 * @return the name of hotel of this acco hotel licence
	 */
	@Override
	public String getNameOfHotel() {
		return model.getNameOfHotel();
	}

	/**
	 * Returns the name of owner of this acco hotel licence.
	 *
	 * @return the name of owner of this acco hotel licence
	 */
	@Override
	public String getNameOfOwner() {
		return model.getNameOfOwner();
	}

	/**
	 * Returns the parish of this acco hotel licence.
	 *
	 * @return the parish of this acco hotel licence
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this acco hotel licence.
	 *
	 * @return the primary key of this acco hotel licence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone no of this acco hotel licence.
	 *
	 * @return the telephone no of this acco hotel licence
	 */
	@Override
	public String getTelephoneNo() {
		return model.getTelephoneNo();
	}

	/**
	 * Returns the user ID of this acco hotel licence.
	 *
	 * @return the user ID of this acco hotel licence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acco hotel licence.
	 *
	 * @return the user name of this acco hotel licence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acco hotel licence.
	 *
	 * @return the user uuid of this acco hotel licence
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acco hotel licence.
	 *
	 * @return the uuid of this acco hotel licence
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
	 * Sets the acco hotel licence ID of this acco hotel licence.
	 *
	 * @param accoHotelLicenceId the acco hotel licence ID of this acco hotel licence
	 */
	@Override
	public void setAccoHotelLicenceId(long accoHotelLicenceId) {
		model.setAccoHotelLicenceId(accoHotelLicenceId);
	}

	/**
	 * Sets the address of this acco hotel licence.
	 *
	 * @param address the address of this acco hotel licence
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the company ID of this acco hotel licence.
	 *
	 * @param companyId the company ID of this acco hotel licence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acco hotel licence.
	 *
	 * @param createDate the create date of this acco hotel licence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this acco hotel licence.
	 *
	 * @param emailAddress the email address of this acco hotel licence
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the fax no of this acco hotel licence.
	 *
	 * @param faxNo the fax no of this acco hotel licence
	 */
	@Override
	public void setFaxNo(String faxNo) {
		model.setFaxNo(faxNo);
	}

	/**
	 * Sets the group ID of this acco hotel licence.
	 *
	 * @param groupId the group ID of this acco hotel licence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this acco hotel licence.
	 *
	 * @param jtbApplicationId the jtb application ID of this acco hotel licence
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this acco hotel licence.
	 *
	 * @param modifiedDate the modified date of this acco hotel licence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of hotel of this acco hotel licence.
	 *
	 * @param nameOfHotel the name of hotel of this acco hotel licence
	 */
	@Override
	public void setNameOfHotel(String nameOfHotel) {
		model.setNameOfHotel(nameOfHotel);
	}

	/**
	 * Sets the name of owner of this acco hotel licence.
	 *
	 * @param nameOfOwner the name of owner of this acco hotel licence
	 */
	@Override
	public void setNameOfOwner(String nameOfOwner) {
		model.setNameOfOwner(nameOfOwner);
	}

	/**
	 * Sets the parish of this acco hotel licence.
	 *
	 * @param parish the parish of this acco hotel licence
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this acco hotel licence.
	 *
	 * @param primaryKey the primary key of this acco hotel licence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone no of this acco hotel licence.
	 *
	 * @param telephoneNo the telephone no of this acco hotel licence
	 */
	@Override
	public void setTelephoneNo(String telephoneNo) {
		model.setTelephoneNo(telephoneNo);
	}

	/**
	 * Sets the user ID of this acco hotel licence.
	 *
	 * @param userId the user ID of this acco hotel licence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acco hotel licence.
	 *
	 * @param userName the user name of this acco hotel licence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acco hotel licence.
	 *
	 * @param userUuid the user uuid of this acco hotel licence
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acco hotel licence.
	 *
	 * @param uuid the uuid of this acco hotel licence
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
	protected AccoHotelLicenceWrapper wrap(AccoHotelLicence accoHotelLicence) {
		return new AccoHotelLicenceWrapper(accoHotelLicence);
	}

}