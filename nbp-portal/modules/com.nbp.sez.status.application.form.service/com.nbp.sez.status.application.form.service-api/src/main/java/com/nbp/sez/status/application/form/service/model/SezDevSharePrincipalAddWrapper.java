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
 * This class is a wrapper for {@link SezDevSharePrincipalAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePrincipalAdd
 * @generated
 */
public class SezDevSharePrincipalAddWrapper
	extends BaseModelWrapper<SezDevSharePrincipalAdd>
	implements ModelWrapper<SezDevSharePrincipalAdd>, SezDevSharePrincipalAdd {

	public SezDevSharePrincipalAddWrapper(
		SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {

		super(sezDevSharePrincipalAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevSharePrincipalAddId", getSezDevSharePrincipalAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("buildingNum", getBuildingNum());
		attributes.put("parishPost", getParishPost());
		attributes.put("country", getCountry());
		attributes.put("nationality", getNationality());
		attributes.put("taxRegistrationNum", getTaxRegistrationNum());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevSharePrincipalAddId = (Long)attributes.get(
			"sezDevSharePrincipalAddId");

		if (sezDevSharePrincipalAddId != null) {
			setSezDevSharePrincipalAddId(sezDevSharePrincipalAddId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String buildingNum = (String)attributes.get("buildingNum");

		if (buildingNum != null) {
			setBuildingNum(buildingNum);
		}

		String parishPost = (String)attributes.get("parishPost");

		if (parishPost != null) {
			setParishPost(parishPost);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		String taxRegistrationNum = (String)attributes.get(
			"taxRegistrationNum");

		if (taxRegistrationNum != null) {
			setTaxRegistrationNum(taxRegistrationNum);
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
	public SezDevSharePrincipalAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the building num of this sez dev share principal add.
	 *
	 * @return the building num of this sez dev share principal add
	 */
	@Override
	public String getBuildingNum() {
		return model.getBuildingNum();
	}

	/**
	 * Returns the company ID of this sez dev share principal add.
	 *
	 * @return the company ID of this sez dev share principal add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sez dev share principal add.
	 *
	 * @return the counter of this sez dev share principal add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the country of this sez dev share principal add.
	 *
	 * @return the country of this sez dev share principal add
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this sez dev share principal add.
	 *
	 * @return the create date of this sez dev share principal add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez dev share principal add.
	 *
	 * @return the group ID of this sez dev share principal add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev share principal add.
	 *
	 * @return the modified date of this sez dev share principal add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this sez dev share principal add.
	 *
	 * @return the name of this sez dev share principal add
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the nationality of this sez dev share principal add.
	 *
	 * @return the nationality of this sez dev share principal add
	 */
	@Override
	public String getNationality() {
		return model.getNationality();
	}

	/**
	 * Returns the parish post of this sez dev share principal add.
	 *
	 * @return the parish post of this sez dev share principal add
	 */
	@Override
	public String getParishPost() {
		return model.getParishPost();
	}

	/**
	 * Returns the primary key of this sez dev share principal add.
	 *
	 * @return the primary key of this sez dev share principal add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez dev share principal add ID of this sez dev share principal add.
	 *
	 * @return the sez dev share principal add ID of this sez dev share principal add
	 */
	@Override
	public long getSezDevSharePrincipalAddId() {
		return model.getSezDevSharePrincipalAddId();
	}

	/**
	 * Returns the sez status application ID of this sez dev share principal add.
	 *
	 * @return the sez status application ID of this sez dev share principal add
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the tax registration num of this sez dev share principal add.
	 *
	 * @return the tax registration num of this sez dev share principal add
	 */
	@Override
	public String getTaxRegistrationNum() {
		return model.getTaxRegistrationNum();
	}

	/**
	 * Returns the user ID of this sez dev share principal add.
	 *
	 * @return the user ID of this sez dev share principal add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev share principal add.
	 *
	 * @return the user name of this sez dev share principal add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev share principal add.
	 *
	 * @return the user uuid of this sez dev share principal add
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
	 * Sets the building num of this sez dev share principal add.
	 *
	 * @param buildingNum the building num of this sez dev share principal add
	 */
	@Override
	public void setBuildingNum(String buildingNum) {
		model.setBuildingNum(buildingNum);
	}

	/**
	 * Sets the company ID of this sez dev share principal add.
	 *
	 * @param companyId the company ID of this sez dev share principal add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sez dev share principal add.
	 *
	 * @param counter the counter of this sez dev share principal add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the country of this sez dev share principal add.
	 *
	 * @param country the country of this sez dev share principal add
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this sez dev share principal add.
	 *
	 * @param createDate the create date of this sez dev share principal add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez dev share principal add.
	 *
	 * @param groupId the group ID of this sez dev share principal add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev share principal add.
	 *
	 * @param modifiedDate the modified date of this sez dev share principal add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this sez dev share principal add.
	 *
	 * @param name the name of this sez dev share principal add
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the nationality of this sez dev share principal add.
	 *
	 * @param nationality the nationality of this sez dev share principal add
	 */
	@Override
	public void setNationality(String nationality) {
		model.setNationality(nationality);
	}

	/**
	 * Sets the parish post of this sez dev share principal add.
	 *
	 * @param parishPost the parish post of this sez dev share principal add
	 */
	@Override
	public void setParishPost(String parishPost) {
		model.setParishPost(parishPost);
	}

	/**
	 * Sets the primary key of this sez dev share principal add.
	 *
	 * @param primaryKey the primary key of this sez dev share principal add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez dev share principal add ID of this sez dev share principal add.
	 *
	 * @param sezDevSharePrincipalAddId the sez dev share principal add ID of this sez dev share principal add
	 */
	@Override
	public void setSezDevSharePrincipalAddId(long sezDevSharePrincipalAddId) {
		model.setSezDevSharePrincipalAddId(sezDevSharePrincipalAddId);
	}

	/**
	 * Sets the sez status application ID of this sez dev share principal add.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev share principal add
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the tax registration num of this sez dev share principal add.
	 *
	 * @param taxRegistrationNum the tax registration num of this sez dev share principal add
	 */
	@Override
	public void setTaxRegistrationNum(String taxRegistrationNum) {
		model.setTaxRegistrationNum(taxRegistrationNum);
	}

	/**
	 * Sets the user ID of this sez dev share principal add.
	 *
	 * @param userId the user ID of this sez dev share principal add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev share principal add.
	 *
	 * @param userName the user name of this sez dev share principal add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev share principal add.
	 *
	 * @param userUuid the user uuid of this sez dev share principal add
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
	protected SezDevSharePrincipalAddWrapper wrap(
		SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {

		return new SezDevSharePrincipalAddWrapper(sezDevSharePrincipalAdd);
	}

}