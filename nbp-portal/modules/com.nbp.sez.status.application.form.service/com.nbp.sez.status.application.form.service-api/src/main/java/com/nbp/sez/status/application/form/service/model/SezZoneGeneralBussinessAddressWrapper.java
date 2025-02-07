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
 * This class is a wrapper for {@link SezZoneGeneralBussinessAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBussinessAddress
 * @generated
 */
public class SezZoneGeneralBussinessAddressWrapper
	extends BaseModelWrapper<SezZoneGeneralBussinessAddress>
	implements ModelWrapper<SezZoneGeneralBussinessAddress>,
			   SezZoneGeneralBussinessAddress {

	public SezZoneGeneralBussinessAddressWrapper(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		super(sezZoneGeneralBussinessAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezZoneGenBussAddressId", getSezZoneGenBussAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("zoneName", getZoneName());
		attributes.put("zoneStreetAddress", getZoneStreetAddress());
		attributes.put("zoneTown", getZoneTown());
		attributes.put("zoneParish", getZoneParish());
		attributes.put("zoneCountry", getZoneCountry());
		attributes.put("addresstype", getAddresstype());
		attributes.put(
			"sezZoneGeneralBusinessInfoId", getSezZoneGeneralBusinessInfoId());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneGenBussAddressId = (Long)attributes.get(
			"sezZoneGenBussAddressId");

		if (sezZoneGenBussAddressId != null) {
			setSezZoneGenBussAddressId(sezZoneGenBussAddressId);
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

		String zoneName = (String)attributes.get("zoneName");

		if (zoneName != null) {
			setZoneName(zoneName);
		}

		String zoneStreetAddress = (String)attributes.get("zoneStreetAddress");

		if (zoneStreetAddress != null) {
			setZoneStreetAddress(zoneStreetAddress);
		}

		String zoneTown = (String)attributes.get("zoneTown");

		if (zoneTown != null) {
			setZoneTown(zoneTown);
		}

		String zoneParish = (String)attributes.get("zoneParish");

		if (zoneParish != null) {
			setZoneParish(zoneParish);
		}

		String zoneCountry = (String)attributes.get("zoneCountry");

		if (zoneCountry != null) {
			setZoneCountry(zoneCountry);
		}

		String addresstype = (String)attributes.get("addresstype");

		if (addresstype != null) {
			setAddresstype(addresstype);
		}

		Long sezZoneGeneralBusinessInfoId = (Long)attributes.get(
			"sezZoneGeneralBusinessInfoId");

		if (sezZoneGeneralBusinessInfoId != null) {
			setSezZoneGeneralBusinessInfoId(sezZoneGeneralBusinessInfoId);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezZoneGeneralBussinessAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the addresstype of this sez zone general bussiness address.
	 *
	 * @return the addresstype of this sez zone general bussiness address
	 */
	@Override
	public String getAddresstype() {
		return model.getAddresstype();
	}

	/**
	 * Returns the company ID of this sez zone general bussiness address.
	 *
	 * @return the company ID of this sez zone general bussiness address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez zone general bussiness address.
	 *
	 * @return the create date of this sez zone general bussiness address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez zone general bussiness address.
	 *
	 * @return the group ID of this sez zone general bussiness address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez zone general bussiness address.
	 *
	 * @return the modified date of this sez zone general bussiness address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez zone general bussiness address.
	 *
	 * @return the primary key of this sez zone general bussiness address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez zone general bussiness address.
	 *
	 * @return the sez status application ID of this sez zone general bussiness address
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone gen buss address ID of this sez zone general bussiness address.
	 *
	 * @return the sez zone gen buss address ID of this sez zone general bussiness address
	 */
	@Override
	public long getSezZoneGenBussAddressId() {
		return model.getSezZoneGenBussAddressId();
	}

	/**
	 * Returns the sez zone general business info ID of this sez zone general bussiness address.
	 *
	 * @return the sez zone general business info ID of this sez zone general bussiness address
	 */
	@Override
	public long getSezZoneGeneralBusinessInfoId() {
		return model.getSezZoneGeneralBusinessInfoId();
	}

	/**
	 * Returns the user ID of this sez zone general bussiness address.
	 *
	 * @return the user ID of this sez zone general bussiness address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone general bussiness address.
	 *
	 * @return the user name of this sez zone general bussiness address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone general bussiness address.
	 *
	 * @return the user uuid of this sez zone general bussiness address
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the zone country of this sez zone general bussiness address.
	 *
	 * @return the zone country of this sez zone general bussiness address
	 */
	@Override
	public String getZoneCountry() {
		return model.getZoneCountry();
	}

	/**
	 * Returns the zone name of this sez zone general bussiness address.
	 *
	 * @return the zone name of this sez zone general bussiness address
	 */
	@Override
	public String getZoneName() {
		return model.getZoneName();
	}

	/**
	 * Returns the zone parish of this sez zone general bussiness address.
	 *
	 * @return the zone parish of this sez zone general bussiness address
	 */
	@Override
	public String getZoneParish() {
		return model.getZoneParish();
	}

	/**
	 * Returns the zone street address of this sez zone general bussiness address.
	 *
	 * @return the zone street address of this sez zone general bussiness address
	 */
	@Override
	public String getZoneStreetAddress() {
		return model.getZoneStreetAddress();
	}

	/**
	 * Returns the zone town of this sez zone general bussiness address.
	 *
	 * @return the zone town of this sez zone general bussiness address
	 */
	@Override
	public String getZoneTown() {
		return model.getZoneTown();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the addresstype of this sez zone general bussiness address.
	 *
	 * @param addresstype the addresstype of this sez zone general bussiness address
	 */
	@Override
	public void setAddresstype(String addresstype) {
		model.setAddresstype(addresstype);
	}

	/**
	 * Sets the company ID of this sez zone general bussiness address.
	 *
	 * @param companyId the company ID of this sez zone general bussiness address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez zone general bussiness address.
	 *
	 * @param createDate the create date of this sez zone general bussiness address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez zone general bussiness address.
	 *
	 * @param groupId the group ID of this sez zone general bussiness address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez zone general bussiness address.
	 *
	 * @param modifiedDate the modified date of this sez zone general bussiness address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez zone general bussiness address.
	 *
	 * @param primaryKey the primary key of this sez zone general bussiness address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez zone general bussiness address.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone general bussiness address
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone gen buss address ID of this sez zone general bussiness address.
	 *
	 * @param sezZoneGenBussAddressId the sez zone gen buss address ID of this sez zone general bussiness address
	 */
	@Override
	public void setSezZoneGenBussAddressId(long sezZoneGenBussAddressId) {
		model.setSezZoneGenBussAddressId(sezZoneGenBussAddressId);
	}

	/**
	 * Sets the sez zone general business info ID of this sez zone general bussiness address.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID of this sez zone general bussiness address
	 */
	@Override
	public void setSezZoneGeneralBusinessInfoId(
		long sezZoneGeneralBusinessInfoId) {

		model.setSezZoneGeneralBusinessInfoId(sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Sets the user ID of this sez zone general bussiness address.
	 *
	 * @param userId the user ID of this sez zone general bussiness address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone general bussiness address.
	 *
	 * @param userName the user name of this sez zone general bussiness address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone general bussiness address.
	 *
	 * @param userUuid the user uuid of this sez zone general bussiness address
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the zone country of this sez zone general bussiness address.
	 *
	 * @param zoneCountry the zone country of this sez zone general bussiness address
	 */
	@Override
	public void setZoneCountry(String zoneCountry) {
		model.setZoneCountry(zoneCountry);
	}

	/**
	 * Sets the zone name of this sez zone general bussiness address.
	 *
	 * @param zoneName the zone name of this sez zone general bussiness address
	 */
	@Override
	public void setZoneName(String zoneName) {
		model.setZoneName(zoneName);
	}

	/**
	 * Sets the zone parish of this sez zone general bussiness address.
	 *
	 * @param zoneParish the zone parish of this sez zone general bussiness address
	 */
	@Override
	public void setZoneParish(String zoneParish) {
		model.setZoneParish(zoneParish);
	}

	/**
	 * Sets the zone street address of this sez zone general bussiness address.
	 *
	 * @param zoneStreetAddress the zone street address of this sez zone general bussiness address
	 */
	@Override
	public void setZoneStreetAddress(String zoneStreetAddress) {
		model.setZoneStreetAddress(zoneStreetAddress);
	}

	/**
	 * Sets the zone town of this sez zone general bussiness address.
	 *
	 * @param zoneTown the zone town of this sez zone general bussiness address
	 */
	@Override
	public void setZoneTown(String zoneTown) {
		model.setZoneTown(zoneTown);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SezZoneGeneralBussinessAddressWrapper wrap(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		return new SezZoneGeneralBussinessAddressWrapper(
			sezZoneGeneralBussinessAddress);
	}

}