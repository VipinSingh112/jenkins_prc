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
 * This class is a wrapper for {@link FireBrigadePremisesInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePremisesInfo
 * @generated
 */
public class FireBrigadePremisesInfoWrapper
	extends BaseModelWrapper<FireBrigadePremisesInfo>
	implements FireBrigadePremisesInfo, ModelWrapper<FireBrigadePremisesInfo> {

	public FireBrigadePremisesInfoWrapper(
		FireBrigadePremisesInfo fireBrigadePremisesInfo) {

		super(fireBrigadePremisesInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fireBrigadePremisesInfoId", getFireBrigadePremisesInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("premises", getPremises());
		attributes.put("premisesCertified", getPremisesCertified());
		attributes.put("expirationDate", getExpirationDate());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("name", getName());
		attributes.put("Address", getAddress());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadePremisesInfoId = (Long)attributes.get(
			"fireBrigadePremisesInfoId");

		if (fireBrigadePremisesInfoId != null) {
			setFireBrigadePremisesInfoId(fireBrigadePremisesInfoId);
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

		String premises = (String)attributes.get("premises");

		if (premises != null) {
			setPremises(premises);
		}

		String premisesCertified = (String)attributes.get("premisesCertified");

		if (premisesCertified != null) {
			setPremisesCertified(premisesCertified);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
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
	public FireBrigadePremisesInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this fire brigade premises info.
	 *
	 * @return the address of this fire brigade premises info
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the certificate number of this fire brigade premises info.
	 *
	 * @return the certificate number of this fire brigade premises info
	 */
	@Override
	public String getCertificateNumber() {
		return model.getCertificateNumber();
	}

	/**
	 * Returns the company ID of this fire brigade premises info.
	 *
	 * @return the company ID of this fire brigade premises info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade premises info.
	 *
	 * @return the create date of this fire brigade premises info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the expiration date of this fire brigade premises info.
	 *
	 * @return the expiration date of this fire brigade premises info
	 */
	@Override
	public Date getExpirationDate() {
		return model.getExpirationDate();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade premises info.
	 *
	 * @return the fire brigade application ID of this fire brigade premises info
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the fire brigade premises info ID of this fire brigade premises info.
	 *
	 * @return the fire brigade premises info ID of this fire brigade premises info
	 */
	@Override
	public long getFireBrigadePremisesInfoId() {
		return model.getFireBrigadePremisesInfoId();
	}

	/**
	 * Returns the group ID of this fire brigade premises info.
	 *
	 * @return the group ID of this fire brigade premises info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this fire brigade premises info.
	 *
	 * @return the modified date of this fire brigade premises info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this fire brigade premises info.
	 *
	 * @return the name of this fire brigade premises info
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the premises of this fire brigade premises info.
	 *
	 * @return the premises of this fire brigade premises info
	 */
	@Override
	public String getPremises() {
		return model.getPremises();
	}

	/**
	 * Returns the premises certified of this fire brigade premises info.
	 *
	 * @return the premises certified of this fire brigade premises info
	 */
	@Override
	public String getPremisesCertified() {
		return model.getPremisesCertified();
	}

	/**
	 * Returns the primary key of this fire brigade premises info.
	 *
	 * @return the primary key of this fire brigade premises info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fire brigade premises info.
	 *
	 * @return the user ID of this fire brigade premises info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade premises info.
	 *
	 * @return the user name of this fire brigade premises info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade premises info.
	 *
	 * @return the user uuid of this fire brigade premises info
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
	 * Sets the address of this fire brigade premises info.
	 *
	 * @param Address the address of this fire brigade premises info
	 */
	@Override
	public void setAddress(String Address) {
		model.setAddress(Address);
	}

	/**
	 * Sets the certificate number of this fire brigade premises info.
	 *
	 * @param certificateNumber the certificate number of this fire brigade premises info
	 */
	@Override
	public void setCertificateNumber(String certificateNumber) {
		model.setCertificateNumber(certificateNumber);
	}

	/**
	 * Sets the company ID of this fire brigade premises info.
	 *
	 * @param companyId the company ID of this fire brigade premises info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade premises info.
	 *
	 * @param createDate the create date of this fire brigade premises info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the expiration date of this fire brigade premises info.
	 *
	 * @param expirationDate the expiration date of this fire brigade premises info
	 */
	@Override
	public void setExpirationDate(Date expirationDate) {
		model.setExpirationDate(expirationDate);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade premises info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade premises info
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the fire brigade premises info ID of this fire brigade premises info.
	 *
	 * @param fireBrigadePremisesInfoId the fire brigade premises info ID of this fire brigade premises info
	 */
	@Override
	public void setFireBrigadePremisesInfoId(long fireBrigadePremisesInfoId) {
		model.setFireBrigadePremisesInfoId(fireBrigadePremisesInfoId);
	}

	/**
	 * Sets the group ID of this fire brigade premises info.
	 *
	 * @param groupId the group ID of this fire brigade premises info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this fire brigade premises info.
	 *
	 * @param modifiedDate the modified date of this fire brigade premises info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this fire brigade premises info.
	 *
	 * @param name the name of this fire brigade premises info
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the premises of this fire brigade premises info.
	 *
	 * @param premises the premises of this fire brigade premises info
	 */
	@Override
	public void setPremises(String premises) {
		model.setPremises(premises);
	}

	/**
	 * Sets the premises certified of this fire brigade premises info.
	 *
	 * @param premisesCertified the premises certified of this fire brigade premises info
	 */
	@Override
	public void setPremisesCertified(String premisesCertified) {
		model.setPremisesCertified(premisesCertified);
	}

	/**
	 * Sets the primary key of this fire brigade premises info.
	 *
	 * @param primaryKey the primary key of this fire brigade premises info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fire brigade premises info.
	 *
	 * @param userId the user ID of this fire brigade premises info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade premises info.
	 *
	 * @param userName the user name of this fire brigade premises info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade premises info.
	 *
	 * @param userUuid the user uuid of this fire brigade premises info
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
	protected FireBrigadePremisesInfoWrapper wrap(
		FireBrigadePremisesInfo fireBrigadePremisesInfo) {

		return new FireBrigadePremisesInfoWrapper(fireBrigadePremisesInfo);
	}

}