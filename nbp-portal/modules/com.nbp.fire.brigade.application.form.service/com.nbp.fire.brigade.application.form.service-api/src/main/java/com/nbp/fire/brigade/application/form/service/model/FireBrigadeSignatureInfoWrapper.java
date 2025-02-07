/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FireBrigadeSignatureInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeSignatureInfo
 * @generated
 */
public class FireBrigadeSignatureInfoWrapper
	extends BaseModelWrapper<FireBrigadeSignatureInfo>
	implements FireBrigadeSignatureInfo,
			   ModelWrapper<FireBrigadeSignatureInfo> {

	public FireBrigadeSignatureInfoWrapper(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		super(fireBrigadeSignatureInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fireBrigadeSignatureInfoId", getFireBrigadeSignatureInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("name", getName());
		attributes.put("telephone", getTelephone());
		attributes.put("fax", getFax());
		attributes.put("trn", getTrn());
		attributes.put("email", getEmail());
		attributes.put("date", getDate());
		attributes.put("Address", getAddress());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadeSignatureInfoId = (Long)attributes.get(
			"fireBrigadeSignatureInfoId");

		if (fireBrigadeSignatureInfoId != null) {
			setFireBrigadeSignatureInfoId(fireBrigadeSignatureInfoId);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String Address = (String)attributes.get("Address");

		if (Address != null) {
			setAddress(Address);
		}

		Long fireBrigadeApplicationId = (Long)attributes.get(
			"fireBrigadeApplicationId");

		if (fireBrigadeApplicationId != null) {
			setFireBrigadeApplicationId(fireBrigadeApplicationId);
		}
	}

	@Override
	public FireBrigadeSignatureInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this fire brigade signature info.
	 *
	 * @return the address of this fire brigade signature info
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the company ID of this fire brigade signature info.
	 *
	 * @return the company ID of this fire brigade signature info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade signature info.
	 *
	 * @return the create date of this fire brigade signature info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of this fire brigade signature info.
	 *
	 * @return the date of this fire brigade signature info
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the email of this fire brigade signature info.
	 *
	 * @return the email of this fire brigade signature info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the fax of this fire brigade signature info.
	 *
	 * @return the fax of this fire brigade signature info
	 */
	@Override
	public String getFax() {
		return model.getFax();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade signature info.
	 *
	 * @return the fire brigade application ID of this fire brigade signature info
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the fire brigade signature info ID of this fire brigade signature info.
	 *
	 * @return the fire brigade signature info ID of this fire brigade signature info
	 */
	@Override
	public long getFireBrigadeSignatureInfoId() {
		return model.getFireBrigadeSignatureInfoId();
	}

	/**
	 * Returns the group ID of this fire brigade signature info.
	 *
	 * @return the group ID of this fire brigade signature info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this fire brigade signature info.
	 *
	 * @return the modified date of this fire brigade signature info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this fire brigade signature info.
	 *
	 * @return the name of this fire brigade signature info
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this fire brigade signature info.
	 *
	 * @return the primary key of this fire brigade signature info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone of this fire brigade signature info.
	 *
	 * @return the telephone of this fire brigade signature info
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the title of this fire brigade signature info.
	 *
	 * @return the title of this fire brigade signature info
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the trn of this fire brigade signature info.
	 *
	 * @return the trn of this fire brigade signature info
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the user ID of this fire brigade signature info.
	 *
	 * @return the user ID of this fire brigade signature info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade signature info.
	 *
	 * @return the user name of this fire brigade signature info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade signature info.
	 *
	 * @return the user uuid of this fire brigade signature info
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
	 * Sets the address of this fire brigade signature info.
	 *
	 * @param Address the address of this fire brigade signature info
	 */
	@Override
	public void setAddress(String Address) {
		model.setAddress(Address);
	}

	/**
	 * Sets the company ID of this fire brigade signature info.
	 *
	 * @param companyId the company ID of this fire brigade signature info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade signature info.
	 *
	 * @param createDate the create date of this fire brigade signature info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of this fire brigade signature info.
	 *
	 * @param date the date of this fire brigade signature info
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the email of this fire brigade signature info.
	 *
	 * @param email the email of this fire brigade signature info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the fax of this fire brigade signature info.
	 *
	 * @param fax the fax of this fire brigade signature info
	 */
	@Override
	public void setFax(String fax) {
		model.setFax(fax);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade signature info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade signature info
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the fire brigade signature info ID of this fire brigade signature info.
	 *
	 * @param fireBrigadeSignatureInfoId the fire brigade signature info ID of this fire brigade signature info
	 */
	@Override
	public void setFireBrigadeSignatureInfoId(long fireBrigadeSignatureInfoId) {
		model.setFireBrigadeSignatureInfoId(fireBrigadeSignatureInfoId);
	}

	/**
	 * Sets the group ID of this fire brigade signature info.
	 *
	 * @param groupId the group ID of this fire brigade signature info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this fire brigade signature info.
	 *
	 * @param modifiedDate the modified date of this fire brigade signature info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this fire brigade signature info.
	 *
	 * @param name the name of this fire brigade signature info
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this fire brigade signature info.
	 *
	 * @param primaryKey the primary key of this fire brigade signature info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone of this fire brigade signature info.
	 *
	 * @param telephone the telephone of this fire brigade signature info
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the title of this fire brigade signature info.
	 *
	 * @param title the title of this fire brigade signature info
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the trn of this fire brigade signature info.
	 *
	 * @param trn the trn of this fire brigade signature info
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the user ID of this fire brigade signature info.
	 *
	 * @param userId the user ID of this fire brigade signature info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade signature info.
	 *
	 * @param userName the user name of this fire brigade signature info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade signature info.
	 *
	 * @param userUuid the user uuid of this fire brigade signature info
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
	protected FireBrigadeSignatureInfoWrapper wrap(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		return new FireBrigadeSignatureInfoWrapper(fireBrigadeSignatureInfo);
	}

}