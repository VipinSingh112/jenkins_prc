/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezOccupantGeneralBussinessAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessAddress
 * @generated
 */
public class SezOccupantGeneralBussinessAddressWrapper
	extends BaseModelWrapper<SezOccupantGeneralBussinessAddress>
	implements ModelWrapper<SezOccupantGeneralBussinessAddress>,
			   SezOccupantGeneralBussinessAddress {

	public SezOccupantGeneralBussinessAddressWrapper(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		super(sezOccupantGeneralBussinessAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccGenBussAddressId", getSezOccGenBussAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occName", getOccName());
		attributes.put("occStreetAddress", getOccStreetAddress());
		attributes.put("occTown", getOccTown());
		attributes.put("occParish", getOccParish());
		attributes.put("occCountry", getOccCountry());
		attributes.put("addresstype", getAddresstype());
		attributes.put("sezOccGenBussId", getSezOccGenBussId());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccGenBussAddressId = (Long)attributes.get(
			"sezOccGenBussAddressId");

		if (sezOccGenBussAddressId != null) {
			setSezOccGenBussAddressId(sezOccGenBussAddressId);
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

		String occName = (String)attributes.get("occName");

		if (occName != null) {
			setOccName(occName);
		}

		String occStreetAddress = (String)attributes.get("occStreetAddress");

		if (occStreetAddress != null) {
			setOccStreetAddress(occStreetAddress);
		}

		String occTown = (String)attributes.get("occTown");

		if (occTown != null) {
			setOccTown(occTown);
		}

		String occParish = (String)attributes.get("occParish");

		if (occParish != null) {
			setOccParish(occParish);
		}

		String occCountry = (String)attributes.get("occCountry");

		if (occCountry != null) {
			setOccCountry(occCountry);
		}

		String addresstype = (String)attributes.get("addresstype");

		if (addresstype != null) {
			setAddresstype(addresstype);
		}

		Long sezOccGenBussId = (Long)attributes.get("sezOccGenBussId");

		if (sezOccGenBussId != null) {
			setSezOccGenBussId(sezOccGenBussId);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantGeneralBussinessAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the addresstype of this sez occupant general bussiness address.
	 *
	 * @return the addresstype of this sez occupant general bussiness address
	 */
	@Override
	public String getAddresstype() {
		return model.getAddresstype();
	}

	/**
	 * Returns the company ID of this sez occupant general bussiness address.
	 *
	 * @return the company ID of this sez occupant general bussiness address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant general bussiness address.
	 *
	 * @return the create date of this sez occupant general bussiness address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant general bussiness address.
	 *
	 * @return the group ID of this sez occupant general bussiness address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant general bussiness address.
	 *
	 * @return the modified date of this sez occupant general bussiness address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ country of this sez occupant general bussiness address.
	 *
	 * @return the occ country of this sez occupant general bussiness address
	 */
	@Override
	public String getOccCountry() {
		return model.getOccCountry();
	}

	/**
	 * Returns the occ name of this sez occupant general bussiness address.
	 *
	 * @return the occ name of this sez occupant general bussiness address
	 */
	@Override
	public String getOccName() {
		return model.getOccName();
	}

	/**
	 * Returns the occ parish of this sez occupant general bussiness address.
	 *
	 * @return the occ parish of this sez occupant general bussiness address
	 */
	@Override
	public String getOccParish() {
		return model.getOccParish();
	}

	/**
	 * Returns the occ street address of this sez occupant general bussiness address.
	 *
	 * @return the occ street address of this sez occupant general bussiness address
	 */
	@Override
	public String getOccStreetAddress() {
		return model.getOccStreetAddress();
	}

	/**
	 * Returns the occ town of this sez occupant general bussiness address.
	 *
	 * @return the occ town of this sez occupant general bussiness address
	 */
	@Override
	public String getOccTown() {
		return model.getOccTown();
	}

	/**
	 * Returns the primary key of this sez occupant general bussiness address.
	 *
	 * @return the primary key of this sez occupant general bussiness address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ gen buss address ID of this sez occupant general bussiness address.
	 *
	 * @return the sez occ gen buss address ID of this sez occupant general bussiness address
	 */
	@Override
	public long getSezOccGenBussAddressId() {
		return model.getSezOccGenBussAddressId();
	}

	/**
	 * Returns the sez occ gen buss ID of this sez occupant general bussiness address.
	 *
	 * @return the sez occ gen buss ID of this sez occupant general bussiness address
	 */
	@Override
	public long getSezOccGenBussId() {
		return model.getSezOccGenBussId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant general bussiness address.
	 *
	 * @return the sez status application ID of this sez occupant general bussiness address
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant general bussiness address.
	 *
	 * @return the user ID of this sez occupant general bussiness address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant general bussiness address.
	 *
	 * @return the user name of this sez occupant general bussiness address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant general bussiness address.
	 *
	 * @return the user uuid of this sez occupant general bussiness address
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
	 * Sets the addresstype of this sez occupant general bussiness address.
	 *
	 * @param addresstype the addresstype of this sez occupant general bussiness address
	 */
	@Override
	public void setAddresstype(String addresstype) {
		model.setAddresstype(addresstype);
	}

	/**
	 * Sets the company ID of this sez occupant general bussiness address.
	 *
	 * @param companyId the company ID of this sez occupant general bussiness address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant general bussiness address.
	 *
	 * @param createDate the create date of this sez occupant general bussiness address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant general bussiness address.
	 *
	 * @param groupId the group ID of this sez occupant general bussiness address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant general bussiness address.
	 *
	 * @param modifiedDate the modified date of this sez occupant general bussiness address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ country of this sez occupant general bussiness address.
	 *
	 * @param occCountry the occ country of this sez occupant general bussiness address
	 */
	@Override
	public void setOccCountry(String occCountry) {
		model.setOccCountry(occCountry);
	}

	/**
	 * Sets the occ name of this sez occupant general bussiness address.
	 *
	 * @param occName the occ name of this sez occupant general bussiness address
	 */
	@Override
	public void setOccName(String occName) {
		model.setOccName(occName);
	}

	/**
	 * Sets the occ parish of this sez occupant general bussiness address.
	 *
	 * @param occParish the occ parish of this sez occupant general bussiness address
	 */
	@Override
	public void setOccParish(String occParish) {
		model.setOccParish(occParish);
	}

	/**
	 * Sets the occ street address of this sez occupant general bussiness address.
	 *
	 * @param occStreetAddress the occ street address of this sez occupant general bussiness address
	 */
	@Override
	public void setOccStreetAddress(String occStreetAddress) {
		model.setOccStreetAddress(occStreetAddress);
	}

	/**
	 * Sets the occ town of this sez occupant general bussiness address.
	 *
	 * @param occTown the occ town of this sez occupant general bussiness address
	 */
	@Override
	public void setOccTown(String occTown) {
		model.setOccTown(occTown);
	}

	/**
	 * Sets the primary key of this sez occupant general bussiness address.
	 *
	 * @param primaryKey the primary key of this sez occupant general bussiness address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ gen buss address ID of this sez occupant general bussiness address.
	 *
	 * @param sezOccGenBussAddressId the sez occ gen buss address ID of this sez occupant general bussiness address
	 */
	@Override
	public void setSezOccGenBussAddressId(long sezOccGenBussAddressId) {
		model.setSezOccGenBussAddressId(sezOccGenBussAddressId);
	}

	/**
	 * Sets the sez occ gen buss ID of this sez occupant general bussiness address.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID of this sez occupant general bussiness address
	 */
	@Override
	public void setSezOccGenBussId(long sezOccGenBussId) {
		model.setSezOccGenBussId(sezOccGenBussId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant general bussiness address.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant general bussiness address
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant general bussiness address.
	 *
	 * @param userId the user ID of this sez occupant general bussiness address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant general bussiness address.
	 *
	 * @param userName the user name of this sez occupant general bussiness address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant general bussiness address.
	 *
	 * @param userUuid the user uuid of this sez occupant general bussiness address
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
	protected SezOccupantGeneralBussinessAddressWrapper wrap(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		return new SezOccupantGeneralBussinessAddressWrapper(
			sezOccupantGeneralBussinessAddress);
	}

}