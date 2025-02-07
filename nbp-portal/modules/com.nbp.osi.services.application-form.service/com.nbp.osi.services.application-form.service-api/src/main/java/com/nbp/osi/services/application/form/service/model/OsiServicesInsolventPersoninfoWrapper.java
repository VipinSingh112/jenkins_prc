/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiServicesInsolventPersoninfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesInsolventPersoninfo
 * @generated
 */
public class OsiServicesInsolventPersoninfoWrapper
	extends BaseModelWrapper<OsiServicesInsolventPersoninfo>
	implements ModelWrapper<OsiServicesInsolventPersoninfo>,
			   OsiServicesInsolventPersoninfo {

	public OsiServicesInsolventPersoninfoWrapper(
		OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo) {

		super(osiServicesInsolventPersoninfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osiServicesInsoId", getOsiServicesInsoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("insolventPersonNature", getInsolventPersonNature());
		attributes.put("insolventIndiFirstName", getInsolventIndiFirstName());
		attributes.put("insolventIndiLastName", getInsolventIndiLastName());
		attributes.put("insolventCompanyName", getInsolventCompanyName());
		attributes.put("insolventAddress", getInsolventAddress());
		attributes.put("insolventParish", getInsolventParish());
		attributes.put("insolventEmailAddress", getInsolventEmailAddress());
		attributes.put("insolventTelephone", getInsolventTelephone());
		attributes.put(
			"insolventApplicationDate", getInsolventApplicationDate());
		attributes.put("insolventTrnNumber", getInsolventTrnNumber());
		attributes.put(
			"osiServicesApplicationId", getOsiServicesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long osiServicesInsoId = (Long)attributes.get("osiServicesInsoId");

		if (osiServicesInsoId != null) {
			setOsiServicesInsoId(osiServicesInsoId);
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

		String insolventPersonNature = (String)attributes.get(
			"insolventPersonNature");

		if (insolventPersonNature != null) {
			setInsolventPersonNature(insolventPersonNature);
		}

		String insolventIndiFirstName = (String)attributes.get(
			"insolventIndiFirstName");

		if (insolventIndiFirstName != null) {
			setInsolventIndiFirstName(insolventIndiFirstName);
		}

		String insolventIndiLastName = (String)attributes.get(
			"insolventIndiLastName");

		if (insolventIndiLastName != null) {
			setInsolventIndiLastName(insolventIndiLastName);
		}

		String insolventCompanyName = (String)attributes.get(
			"insolventCompanyName");

		if (insolventCompanyName != null) {
			setInsolventCompanyName(insolventCompanyName);
		}

		String insolventAddress = (String)attributes.get("insolventAddress");

		if (insolventAddress != null) {
			setInsolventAddress(insolventAddress);
		}

		String insolventParish = (String)attributes.get("insolventParish");

		if (insolventParish != null) {
			setInsolventParish(insolventParish);
		}

		String insolventEmailAddress = (String)attributes.get(
			"insolventEmailAddress");

		if (insolventEmailAddress != null) {
			setInsolventEmailAddress(insolventEmailAddress);
		}

		String insolventTelephone = (String)attributes.get(
			"insolventTelephone");

		if (insolventTelephone != null) {
			setInsolventTelephone(insolventTelephone);
		}

		Date insolventApplicationDate = (Date)attributes.get(
			"insolventApplicationDate");

		if (insolventApplicationDate != null) {
			setInsolventApplicationDate(insolventApplicationDate);
		}

		String insolventTrnNumber = (String)attributes.get(
			"insolventTrnNumber");

		if (insolventTrnNumber != null) {
			setInsolventTrnNumber(insolventTrnNumber);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesInsolventPersoninfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi services insolvent personinfo.
	 *
	 * @return the company ID of this osi services insolvent personinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services insolvent personinfo.
	 *
	 * @return the create date of this osi services insolvent personinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi services insolvent personinfo.
	 *
	 * @return the group ID of this osi services insolvent personinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the insolvent address of this osi services insolvent personinfo.
	 *
	 * @return the insolvent address of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventAddress() {
		return model.getInsolventAddress();
	}

	/**
	 * Returns the insolvent application date of this osi services insolvent personinfo.
	 *
	 * @return the insolvent application date of this osi services insolvent personinfo
	 */
	@Override
	public Date getInsolventApplicationDate() {
		return model.getInsolventApplicationDate();
	}

	/**
	 * Returns the insolvent company name of this osi services insolvent personinfo.
	 *
	 * @return the insolvent company name of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventCompanyName() {
		return model.getInsolventCompanyName();
	}

	/**
	 * Returns the insolvent email address of this osi services insolvent personinfo.
	 *
	 * @return the insolvent email address of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventEmailAddress() {
		return model.getInsolventEmailAddress();
	}

	/**
	 * Returns the insolvent indi first name of this osi services insolvent personinfo.
	 *
	 * @return the insolvent indi first name of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventIndiFirstName() {
		return model.getInsolventIndiFirstName();
	}

	/**
	 * Returns the insolvent indi last name of this osi services insolvent personinfo.
	 *
	 * @return the insolvent indi last name of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventIndiLastName() {
		return model.getInsolventIndiLastName();
	}

	/**
	 * Returns the insolvent parish of this osi services insolvent personinfo.
	 *
	 * @return the insolvent parish of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventParish() {
		return model.getInsolventParish();
	}

	/**
	 * Returns the insolvent person nature of this osi services insolvent personinfo.
	 *
	 * @return the insolvent person nature of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventPersonNature() {
		return model.getInsolventPersonNature();
	}

	/**
	 * Returns the insolvent telephone of this osi services insolvent personinfo.
	 *
	 * @return the insolvent telephone of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventTelephone() {
		return model.getInsolventTelephone();
	}

	/**
	 * Returns the insolvent trn number of this osi services insolvent personinfo.
	 *
	 * @return the insolvent trn number of this osi services insolvent personinfo
	 */
	@Override
	public String getInsolventTrnNumber() {
		return model.getInsolventTrnNumber();
	}

	/**
	 * Returns the modified date of this osi services insolvent personinfo.
	 *
	 * @return the modified date of this osi services insolvent personinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi services application ID of this osi services insolvent personinfo.
	 *
	 * @return the osi services application ID of this osi services insolvent personinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the osi services inso ID of this osi services insolvent personinfo.
	 *
	 * @return the osi services inso ID of this osi services insolvent personinfo
	 */
	@Override
	public long getOsiServicesInsoId() {
		return model.getOsiServicesInsoId();
	}

	/**
	 * Returns the primary key of this osi services insolvent personinfo.
	 *
	 * @return the primary key of this osi services insolvent personinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services insolvent personinfo.
	 *
	 * @return the user ID of this osi services insolvent personinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services insolvent personinfo.
	 *
	 * @return the user name of this osi services insolvent personinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services insolvent personinfo.
	 *
	 * @return the user uuid of this osi services insolvent personinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services insolvent personinfo.
	 *
	 * @return the uuid of this osi services insolvent personinfo
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
	 * Sets the company ID of this osi services insolvent personinfo.
	 *
	 * @param companyId the company ID of this osi services insolvent personinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services insolvent personinfo.
	 *
	 * @param createDate the create date of this osi services insolvent personinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi services insolvent personinfo.
	 *
	 * @param groupId the group ID of this osi services insolvent personinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the insolvent address of this osi services insolvent personinfo.
	 *
	 * @param insolventAddress the insolvent address of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventAddress(String insolventAddress) {
		model.setInsolventAddress(insolventAddress);
	}

	/**
	 * Sets the insolvent application date of this osi services insolvent personinfo.
	 *
	 * @param insolventApplicationDate the insolvent application date of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventApplicationDate(Date insolventApplicationDate) {
		model.setInsolventApplicationDate(insolventApplicationDate);
	}

	/**
	 * Sets the insolvent company name of this osi services insolvent personinfo.
	 *
	 * @param insolventCompanyName the insolvent company name of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventCompanyName(String insolventCompanyName) {
		model.setInsolventCompanyName(insolventCompanyName);
	}

	/**
	 * Sets the insolvent email address of this osi services insolvent personinfo.
	 *
	 * @param insolventEmailAddress the insolvent email address of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventEmailAddress(String insolventEmailAddress) {
		model.setInsolventEmailAddress(insolventEmailAddress);
	}

	/**
	 * Sets the insolvent indi first name of this osi services insolvent personinfo.
	 *
	 * @param insolventIndiFirstName the insolvent indi first name of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventIndiFirstName(String insolventIndiFirstName) {
		model.setInsolventIndiFirstName(insolventIndiFirstName);
	}

	/**
	 * Sets the insolvent indi last name of this osi services insolvent personinfo.
	 *
	 * @param insolventIndiLastName the insolvent indi last name of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventIndiLastName(String insolventIndiLastName) {
		model.setInsolventIndiLastName(insolventIndiLastName);
	}

	/**
	 * Sets the insolvent parish of this osi services insolvent personinfo.
	 *
	 * @param insolventParish the insolvent parish of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventParish(String insolventParish) {
		model.setInsolventParish(insolventParish);
	}

	/**
	 * Sets the insolvent person nature of this osi services insolvent personinfo.
	 *
	 * @param insolventPersonNature the insolvent person nature of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventPersonNature(String insolventPersonNature) {
		model.setInsolventPersonNature(insolventPersonNature);
	}

	/**
	 * Sets the insolvent telephone of this osi services insolvent personinfo.
	 *
	 * @param insolventTelephone the insolvent telephone of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventTelephone(String insolventTelephone) {
		model.setInsolventTelephone(insolventTelephone);
	}

	/**
	 * Sets the insolvent trn number of this osi services insolvent personinfo.
	 *
	 * @param insolventTrnNumber the insolvent trn number of this osi services insolvent personinfo
	 */
	@Override
	public void setInsolventTrnNumber(String insolventTrnNumber) {
		model.setInsolventTrnNumber(insolventTrnNumber);
	}

	/**
	 * Sets the modified date of this osi services insolvent personinfo.
	 *
	 * @param modifiedDate the modified date of this osi services insolvent personinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi services application ID of this osi services insolvent personinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services insolvent personinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the osi services inso ID of this osi services insolvent personinfo.
	 *
	 * @param osiServicesInsoId the osi services inso ID of this osi services insolvent personinfo
	 */
	@Override
	public void setOsiServicesInsoId(long osiServicesInsoId) {
		model.setOsiServicesInsoId(osiServicesInsoId);
	}

	/**
	 * Sets the primary key of this osi services insolvent personinfo.
	 *
	 * @param primaryKey the primary key of this osi services insolvent personinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services insolvent personinfo.
	 *
	 * @param userId the user ID of this osi services insolvent personinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services insolvent personinfo.
	 *
	 * @param userName the user name of this osi services insolvent personinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services insolvent personinfo.
	 *
	 * @param userUuid the user uuid of this osi services insolvent personinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services insolvent personinfo.
	 *
	 * @param uuid the uuid of this osi services insolvent personinfo
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
	protected OsiServicesInsolventPersoninfoWrapper wrap(
		OsiServicesInsolventPersoninfo osiServicesInsolventPersoninfo) {

		return new OsiServicesInsolventPersoninfoWrapper(
			osiServicesInsolventPersoninfo);
	}

}