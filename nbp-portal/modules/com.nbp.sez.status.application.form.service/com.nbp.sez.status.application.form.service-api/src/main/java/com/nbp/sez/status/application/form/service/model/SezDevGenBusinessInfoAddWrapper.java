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
 * This class is a wrapper for {@link SezDevGenBusinessInfoAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGenBusinessInfoAdd
 * @generated
 */
public class SezDevGenBusinessInfoAddWrapper
	extends BaseModelWrapper<SezDevGenBusinessInfoAdd>
	implements ModelWrapper<SezDevGenBusinessInfoAdd>,
			   SezDevGenBusinessInfoAdd {

	public SezDevGenBusinessInfoAddWrapper(
		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {

		super(sezDevGenBusinessInfoAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevGenBusinessInfoAddId", getSezDevGenBusinessInfoAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("buildingNum", getBuildingNum());
		attributes.put("townCity", getTownCity());
		attributes.put("parish", getParish());
		attributes.put("country", getCountry());
		attributes.put("telephoneNum", getTelephoneNum());
		attributes.put("faxNum", getFaxNum());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevGenBusinessInfoAddId = (Long)attributes.get(
			"sezDevGenBusinessInfoAddId");

		if (sezDevGenBusinessInfoAddId != null) {
			setSezDevGenBusinessInfoAddId(sezDevGenBusinessInfoAddId);
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

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String buildingNum = (String)attributes.get("buildingNum");

		if (buildingNum != null) {
			setBuildingNum(buildingNum);
		}

		String townCity = (String)attributes.get("townCity");

		if (townCity != null) {
			setTownCity(townCity);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String telephoneNum = (String)attributes.get("telephoneNum");

		if (telephoneNum != null) {
			setTelephoneNum(telephoneNum);
		}

		String faxNum = (String)attributes.get("faxNum");

		if (faxNum != null) {
			setFaxNum(faxNum);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevGenBusinessInfoAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the building num of this sez dev gen business info add.
	 *
	 * @return the building num of this sez dev gen business info add
	 */
	@Override
	public String getBuildingNum() {
		return model.getBuildingNum();
	}

	/**
	 * Returns the company ID of this sez dev gen business info add.
	 *
	 * @return the company ID of this sez dev gen business info add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this sez dev gen business info add.
	 *
	 * @return the company name of this sez dev gen business info add
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the counter of this sez dev gen business info add.
	 *
	 * @return the counter of this sez dev gen business info add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the country of this sez dev gen business info add.
	 *
	 * @return the country of this sez dev gen business info add
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this sez dev gen business info add.
	 *
	 * @return the create date of this sez dev gen business info add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this sez dev gen business info add.
	 *
	 * @return the email address of this sez dev gen business info add
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the fax num of this sez dev gen business info add.
	 *
	 * @return the fax num of this sez dev gen business info add
	 */
	@Override
	public String getFaxNum() {
		return model.getFaxNum();
	}

	/**
	 * Returns the group ID of this sez dev gen business info add.
	 *
	 * @return the group ID of this sez dev gen business info add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev gen business info add.
	 *
	 * @return the modified date of this sez dev gen business info add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this sez dev gen business info add.
	 *
	 * @return the parish of this sez dev gen business info add
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this sez dev gen business info add.
	 *
	 * @return the primary key of this sez dev gen business info add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez dev gen business info add ID of this sez dev gen business info add.
	 *
	 * @return the sez dev gen business info add ID of this sez dev gen business info add
	 */
	@Override
	public long getSezDevGenBusinessInfoAddId() {
		return model.getSezDevGenBusinessInfoAddId();
	}

	/**
	 * Returns the sez status application ID of this sez dev gen business info add.
	 *
	 * @return the sez status application ID of this sez dev gen business info add
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the telephone num of this sez dev gen business info add.
	 *
	 * @return the telephone num of this sez dev gen business info add
	 */
	@Override
	public String getTelephoneNum() {
		return model.getTelephoneNum();
	}

	/**
	 * Returns the town city of this sez dev gen business info add.
	 *
	 * @return the town city of this sez dev gen business info add
	 */
	@Override
	public String getTownCity() {
		return model.getTownCity();
	}

	/**
	 * Returns the user ID of this sez dev gen business info add.
	 *
	 * @return the user ID of this sez dev gen business info add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev gen business info add.
	 *
	 * @return the user name of this sez dev gen business info add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev gen business info add.
	 *
	 * @return the user uuid of this sez dev gen business info add
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
	 * Sets the building num of this sez dev gen business info add.
	 *
	 * @param buildingNum the building num of this sez dev gen business info add
	 */
	@Override
	public void setBuildingNum(String buildingNum) {
		model.setBuildingNum(buildingNum);
	}

	/**
	 * Sets the company ID of this sez dev gen business info add.
	 *
	 * @param companyId the company ID of this sez dev gen business info add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this sez dev gen business info add.
	 *
	 * @param companyName the company name of this sez dev gen business info add
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the counter of this sez dev gen business info add.
	 *
	 * @param counter the counter of this sez dev gen business info add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the country of this sez dev gen business info add.
	 *
	 * @param country the country of this sez dev gen business info add
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this sez dev gen business info add.
	 *
	 * @param createDate the create date of this sez dev gen business info add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this sez dev gen business info add.
	 *
	 * @param emailAddress the email address of this sez dev gen business info add
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the fax num of this sez dev gen business info add.
	 *
	 * @param faxNum the fax num of this sez dev gen business info add
	 */
	@Override
	public void setFaxNum(String faxNum) {
		model.setFaxNum(faxNum);
	}

	/**
	 * Sets the group ID of this sez dev gen business info add.
	 *
	 * @param groupId the group ID of this sez dev gen business info add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev gen business info add.
	 *
	 * @param modifiedDate the modified date of this sez dev gen business info add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this sez dev gen business info add.
	 *
	 * @param parish the parish of this sez dev gen business info add
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this sez dev gen business info add.
	 *
	 * @param primaryKey the primary key of this sez dev gen business info add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez dev gen business info add ID of this sez dev gen business info add.
	 *
	 * @param sezDevGenBusinessInfoAddId the sez dev gen business info add ID of this sez dev gen business info add
	 */
	@Override
	public void setSezDevGenBusinessInfoAddId(long sezDevGenBusinessInfoAddId) {
		model.setSezDevGenBusinessInfoAddId(sezDevGenBusinessInfoAddId);
	}

	/**
	 * Sets the sez status application ID of this sez dev gen business info add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev gen business info add
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the telephone num of this sez dev gen business info add.
	 *
	 * @param telephoneNum the telephone num of this sez dev gen business info add
	 */
	@Override
	public void setTelephoneNum(String telephoneNum) {
		model.setTelephoneNum(telephoneNum);
	}

	/**
	 * Sets the town city of this sez dev gen business info add.
	 *
	 * @param townCity the town city of this sez dev gen business info add
	 */
	@Override
	public void setTownCity(String townCity) {
		model.setTownCity(townCity);
	}

	/**
	 * Sets the user ID of this sez dev gen business info add.
	 *
	 * @param userId the user ID of this sez dev gen business info add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev gen business info add.
	 *
	 * @param userName the user name of this sez dev gen business info add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev gen business info add.
	 *
	 * @param userUuid the user uuid of this sez dev gen business info add
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
	protected SezDevGenBusinessInfoAddWrapper wrap(
		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {

		return new SezDevGenBusinessInfoAddWrapper(sezDevGenBusinessInfoAdd);
	}

}