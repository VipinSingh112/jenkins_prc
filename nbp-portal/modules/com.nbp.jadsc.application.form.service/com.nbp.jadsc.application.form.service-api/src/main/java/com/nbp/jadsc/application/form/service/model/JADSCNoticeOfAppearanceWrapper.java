/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JADSCNoticeOfAppearance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCNoticeOfAppearance
 * @generated
 */
public class JADSCNoticeOfAppearanceWrapper
	extends BaseModelWrapper<JADSCNoticeOfAppearance>
	implements JADSCNoticeOfAppearance, ModelWrapper<JADSCNoticeOfAppearance> {

	public JADSCNoticeOfAppearanceWrapper(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		super(jadscNoticeOfAppearance);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jadscNOAId", getJadscNOAId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fullName", getFullName());
		attributes.put("addressOne", getAddressOne());
		attributes.put("date", getDate());
		attributes.put("name", getName());
		attributes.put("firm", getFirm());
		attributes.put("address", getAddress());
		attributes.put("telephone", getTelephone());
		attributes.put("jadscApplicationId", getJadscApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jadscNOAId = (Long)attributes.get("jadscNOAId");

		if (jadscNOAId != null) {
			setJadscNOAId(jadscNOAId);
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

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String addressOne = (String)attributes.get("addressOne");

		if (addressOne != null) {
			setAddressOne(addressOne);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String firm = (String)attributes.get("firm");

		if (firm != null) {
			setFirm(firm);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
		}
	}

	@Override
	public JADSCNoticeOfAppearance cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this jadsc notice of appearance.
	 *
	 * @return the address of this jadsc notice of appearance
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the address one of this jadsc notice of appearance.
	 *
	 * @return the address one of this jadsc notice of appearance
	 */
	@Override
	public String getAddressOne() {
		return model.getAddressOne();
	}

	/**
	 * Returns the company ID of this jadsc notice of appearance.
	 *
	 * @return the company ID of this jadsc notice of appearance
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc notice of appearance.
	 *
	 * @return the create date of this jadsc notice of appearance
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of this jadsc notice of appearance.
	 *
	 * @return the date of this jadsc notice of appearance
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the firm of this jadsc notice of appearance.
	 *
	 * @return the firm of this jadsc notice of appearance
	 */
	@Override
	public String getFirm() {
		return model.getFirm();
	}

	/**
	 * Returns the full name of this jadsc notice of appearance.
	 *
	 * @return the full name of this jadsc notice of appearance
	 */
	@Override
	public String getFullName() {
		return model.getFullName();
	}

	/**
	 * Returns the group ID of this jadsc notice of appearance.
	 *
	 * @return the group ID of this jadsc notice of appearance
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc application ID of this jadsc notice of appearance.
	 *
	 * @return the jadsc application ID of this jadsc notice of appearance
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the jadsc noa ID of this jadsc notice of appearance.
	 *
	 * @return the jadsc noa ID of this jadsc notice of appearance
	 */
	@Override
	public long getJadscNOAId() {
		return model.getJadscNOAId();
	}

	/**
	 * Returns the modified date of this jadsc notice of appearance.
	 *
	 * @return the modified date of this jadsc notice of appearance
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this jadsc notice of appearance.
	 *
	 * @return the name of this jadsc notice of appearance
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this jadsc notice of appearance.
	 *
	 * @return the primary key of this jadsc notice of appearance
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone of this jadsc notice of appearance.
	 *
	 * @return the telephone of this jadsc notice of appearance
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the user ID of this jadsc notice of appearance.
	 *
	 * @return the user ID of this jadsc notice of appearance
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc notice of appearance.
	 *
	 * @return the user name of this jadsc notice of appearance
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc notice of appearance.
	 *
	 * @return the user uuid of this jadsc notice of appearance
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc notice of appearance.
	 *
	 * @return the uuid of this jadsc notice of appearance
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
	 * Sets the address of this jadsc notice of appearance.
	 *
	 * @param address the address of this jadsc notice of appearance
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the address one of this jadsc notice of appearance.
	 *
	 * @param addressOne the address one of this jadsc notice of appearance
	 */
	@Override
	public void setAddressOne(String addressOne) {
		model.setAddressOne(addressOne);
	}

	/**
	 * Sets the company ID of this jadsc notice of appearance.
	 *
	 * @param companyId the company ID of this jadsc notice of appearance
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc notice of appearance.
	 *
	 * @param createDate the create date of this jadsc notice of appearance
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of this jadsc notice of appearance.
	 *
	 * @param date the date of this jadsc notice of appearance
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the firm of this jadsc notice of appearance.
	 *
	 * @param firm the firm of this jadsc notice of appearance
	 */
	@Override
	public void setFirm(String firm) {
		model.setFirm(firm);
	}

	/**
	 * Sets the full name of this jadsc notice of appearance.
	 *
	 * @param fullName the full name of this jadsc notice of appearance
	 */
	@Override
	public void setFullName(String fullName) {
		model.setFullName(fullName);
	}

	/**
	 * Sets the group ID of this jadsc notice of appearance.
	 *
	 * @param groupId the group ID of this jadsc notice of appearance
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc application ID of this jadsc notice of appearance.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc notice of appearance
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the jadsc noa ID of this jadsc notice of appearance.
	 *
	 * @param jadscNOAId the jadsc noa ID of this jadsc notice of appearance
	 */
	@Override
	public void setJadscNOAId(long jadscNOAId) {
		model.setJadscNOAId(jadscNOAId);
	}

	/**
	 * Sets the modified date of this jadsc notice of appearance.
	 *
	 * @param modifiedDate the modified date of this jadsc notice of appearance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this jadsc notice of appearance.
	 *
	 * @param name the name of this jadsc notice of appearance
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this jadsc notice of appearance.
	 *
	 * @param primaryKey the primary key of this jadsc notice of appearance
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone of this jadsc notice of appearance.
	 *
	 * @param telephone the telephone of this jadsc notice of appearance
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the user ID of this jadsc notice of appearance.
	 *
	 * @param userId the user ID of this jadsc notice of appearance
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc notice of appearance.
	 *
	 * @param userName the user name of this jadsc notice of appearance
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc notice of appearance.
	 *
	 * @param userUuid the user uuid of this jadsc notice of appearance
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc notice of appearance.
	 *
	 * @param uuid the uuid of this jadsc notice of appearance
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
	protected JADSCNoticeOfAppearanceWrapper wrap(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		return new JADSCNoticeOfAppearanceWrapper(jadscNoticeOfAppearance);
	}

}