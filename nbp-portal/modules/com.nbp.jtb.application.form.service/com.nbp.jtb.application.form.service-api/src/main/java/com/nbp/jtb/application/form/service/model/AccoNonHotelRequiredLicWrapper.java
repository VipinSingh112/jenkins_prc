/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccoNonHotelRequiredLic}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelRequiredLic
 * @generated
 */
public class AccoNonHotelRequiredLicWrapper
	extends BaseModelWrapper<AccoNonHotelRequiredLic>
	implements AccoNonHotelRequiredLic, ModelWrapper<AccoNonHotelRequiredLic> {

	public AccoNonHotelRequiredLicWrapper(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		super(accoNonHotelRequiredLic);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"accoNonHotelRequiredLicId", getAccoNonHotelRequiredLicId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requiredLicence", getRequiredLicence());
		attributes.put("requiredBedroom", getRequiredBedroom());
		attributes.put("requiredBathroom", getRequiredBathroom());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long accoNonHotelRequiredLicId = (Long)attributes.get(
			"accoNonHotelRequiredLicId");

		if (accoNonHotelRequiredLicId != null) {
			setAccoNonHotelRequiredLicId(accoNonHotelRequiredLicId);
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

		String requiredLicence = (String)attributes.get("requiredLicence");

		if (requiredLicence != null) {
			setRequiredLicence(requiredLicence);
		}

		String requiredBedroom = (String)attributes.get("requiredBedroom");

		if (requiredBedroom != null) {
			setRequiredBedroom(requiredBedroom);
		}

		String requiredBathroom = (String)attributes.get("requiredBathroom");

		if (requiredBathroom != null) {
			setRequiredBathroom(requiredBathroom);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AccoNonHotelRequiredLic cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acco non hotel required lic ID of this acco non hotel required lic.
	 *
	 * @return the acco non hotel required lic ID of this acco non hotel required lic
	 */
	@Override
	public long getAccoNonHotelRequiredLicId() {
		return model.getAccoNonHotelRequiredLicId();
	}

	/**
	 * Returns the company ID of this acco non hotel required lic.
	 *
	 * @return the company ID of this acco non hotel required lic
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acco non hotel required lic.
	 *
	 * @return the create date of this acco non hotel required lic
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acco non hotel required lic.
	 *
	 * @return the group ID of this acco non hotel required lic
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this acco non hotel required lic.
	 *
	 * @return the jtb application ID of this acco non hotel required lic
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this acco non hotel required lic.
	 *
	 * @return the modified date of this acco non hotel required lic
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acco non hotel required lic.
	 *
	 * @return the primary key of this acco non hotel required lic
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the required bathroom of this acco non hotel required lic.
	 *
	 * @return the required bathroom of this acco non hotel required lic
	 */
	@Override
	public String getRequiredBathroom() {
		return model.getRequiredBathroom();
	}

	/**
	 * Returns the required bedroom of this acco non hotel required lic.
	 *
	 * @return the required bedroom of this acco non hotel required lic
	 */
	@Override
	public String getRequiredBedroom() {
		return model.getRequiredBedroom();
	}

	/**
	 * Returns the required licence of this acco non hotel required lic.
	 *
	 * @return the required licence of this acco non hotel required lic
	 */
	@Override
	public String getRequiredLicence() {
		return model.getRequiredLicence();
	}

	/**
	 * Returns the user ID of this acco non hotel required lic.
	 *
	 * @return the user ID of this acco non hotel required lic
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acco non hotel required lic.
	 *
	 * @return the user name of this acco non hotel required lic
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acco non hotel required lic.
	 *
	 * @return the user uuid of this acco non hotel required lic
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
	 * Sets the acco non hotel required lic ID of this acco non hotel required lic.
	 *
	 * @param accoNonHotelRequiredLicId the acco non hotel required lic ID of this acco non hotel required lic
	 */
	@Override
	public void setAccoNonHotelRequiredLicId(long accoNonHotelRequiredLicId) {
		model.setAccoNonHotelRequiredLicId(accoNonHotelRequiredLicId);
	}

	/**
	 * Sets the company ID of this acco non hotel required lic.
	 *
	 * @param companyId the company ID of this acco non hotel required lic
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acco non hotel required lic.
	 *
	 * @param createDate the create date of this acco non hotel required lic
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acco non hotel required lic.
	 *
	 * @param groupId the group ID of this acco non hotel required lic
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this acco non hotel required lic.
	 *
	 * @param jtbApplicationId the jtb application ID of this acco non hotel required lic
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this acco non hotel required lic.
	 *
	 * @param modifiedDate the modified date of this acco non hotel required lic
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acco non hotel required lic.
	 *
	 * @param primaryKey the primary key of this acco non hotel required lic
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the required bathroom of this acco non hotel required lic.
	 *
	 * @param requiredBathroom the required bathroom of this acco non hotel required lic
	 */
	@Override
	public void setRequiredBathroom(String requiredBathroom) {
		model.setRequiredBathroom(requiredBathroom);
	}

	/**
	 * Sets the required bedroom of this acco non hotel required lic.
	 *
	 * @param requiredBedroom the required bedroom of this acco non hotel required lic
	 */
	@Override
	public void setRequiredBedroom(String requiredBedroom) {
		model.setRequiredBedroom(requiredBedroom);
	}

	/**
	 * Sets the required licence of this acco non hotel required lic.
	 *
	 * @param requiredLicence the required licence of this acco non hotel required lic
	 */
	@Override
	public void setRequiredLicence(String requiredLicence) {
		model.setRequiredLicence(requiredLicence);
	}

	/**
	 * Sets the user ID of this acco non hotel required lic.
	 *
	 * @param userId the user ID of this acco non hotel required lic
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acco non hotel required lic.
	 *
	 * @param userName the user name of this acco non hotel required lic
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acco non hotel required lic.
	 *
	 * @param userUuid the user uuid of this acco non hotel required lic
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
	protected AccoNonHotelRequiredLicWrapper wrap(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		return new AccoNonHotelRequiredLicWrapper(accoNonHotelRequiredLic);
	}

}