/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AddCerPersonnelSecond}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelSecond
 * @generated
 */
public class AddCerPersonnelSecondWrapper
	extends BaseModelWrapper<AddCerPersonnelSecond>
	implements AddCerPersonnelSecond, ModelWrapper<AddCerPersonnelSecond> {

	public AddCerPersonnelSecondWrapper(
		AddCerPersonnelSecond addCerPersonnelSecond) {

		super(addCerPersonnelSecond);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addCerPersonnelSecondId", getAddCerPersonnelSecondId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("role", getRole());
		attributes.put("certificateStandard", getCertificateStandard());
		attributes.put("areaOfExpertise", getAreaOfExpertise());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addCerPersonnelSecondId = (Long)attributes.get(
			"addCerPersonnelSecondId");

		if (addCerPersonnelSecondId != null) {
			setAddCerPersonnelSecondId(addCerPersonnelSecondId);
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

		String role = (String)attributes.get("role");

		if (role != null) {
			setRole(role);
		}

		String certificateStandard = (String)attributes.get(
			"certificateStandard");

		if (certificateStandard != null) {
			setCertificateStandard(certificateStandard);
		}

		String areaOfExpertise = (String)attributes.get("areaOfExpertise");

		if (areaOfExpertise != null) {
			setAreaOfExpertise(areaOfExpertise);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}
	}

	@Override
	public AddCerPersonnelSecond cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add cer personnel second ID of this add cer personnel second.
	 *
	 * @return the add cer personnel second ID of this add cer personnel second
	 */
	@Override
	public long getAddCerPersonnelSecondId() {
		return model.getAddCerPersonnelSecondId();
	}

	/**
	 * Returns the area of expertise of this add cer personnel second.
	 *
	 * @return the area of expertise of this add cer personnel second
	 */
	@Override
	public String getAreaOfExpertise() {
		return model.getAreaOfExpertise();
	}

	/**
	 * Returns the certificate standard of this add cer personnel second.
	 *
	 * @return the certificate standard of this add cer personnel second
	 */
	@Override
	public String getCertificateStandard() {
		return model.getCertificateStandard();
	}

	/**
	 * Returns the company ID of this add cer personnel second.
	 *
	 * @return the company ID of this add cer personnel second
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add cer personnel second.
	 *
	 * @return the counter of this add cer personnel second
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add cer personnel second.
	 *
	 * @return the create date of this add cer personnel second
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add cer personnel second.
	 *
	 * @return the group ID of this add cer personnel second
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add cer personnel second.
	 *
	 * @return the janaac application ID of this add cer personnel second
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this add cer personnel second.
	 *
	 * @return the modified date of this add cer personnel second
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this add cer personnel second.
	 *
	 * @return the name of this add cer personnel second
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this add cer personnel second.
	 *
	 * @return the primary key of this add cer personnel second
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the role of this add cer personnel second.
	 *
	 * @return the role of this add cer personnel second
	 */
	@Override
	public String getRole() {
		return model.getRole();
	}

	/**
	 * Returns the user ID of this add cer personnel second.
	 *
	 * @return the user ID of this add cer personnel second
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add cer personnel second.
	 *
	 * @return the user name of this add cer personnel second
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add cer personnel second.
	 *
	 * @return the user uuid of this add cer personnel second
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
	 * Sets the add cer personnel second ID of this add cer personnel second.
	 *
	 * @param addCerPersonnelSecondId the add cer personnel second ID of this add cer personnel second
	 */
	@Override
	public void setAddCerPersonnelSecondId(long addCerPersonnelSecondId) {
		model.setAddCerPersonnelSecondId(addCerPersonnelSecondId);
	}

	/**
	 * Sets the area of expertise of this add cer personnel second.
	 *
	 * @param areaOfExpertise the area of expertise of this add cer personnel second
	 */
	@Override
	public void setAreaOfExpertise(String areaOfExpertise) {
		model.setAreaOfExpertise(areaOfExpertise);
	}

	/**
	 * Sets the certificate standard of this add cer personnel second.
	 *
	 * @param certificateStandard the certificate standard of this add cer personnel second
	 */
	@Override
	public void setCertificateStandard(String certificateStandard) {
		model.setCertificateStandard(certificateStandard);
	}

	/**
	 * Sets the company ID of this add cer personnel second.
	 *
	 * @param companyId the company ID of this add cer personnel second
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add cer personnel second.
	 *
	 * @param counter the counter of this add cer personnel second
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add cer personnel second.
	 *
	 * @param createDate the create date of this add cer personnel second
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add cer personnel second.
	 *
	 * @param groupId the group ID of this add cer personnel second
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add cer personnel second.
	 *
	 * @param janaacApplicationId the janaac application ID of this add cer personnel second
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this add cer personnel second.
	 *
	 * @param modifiedDate the modified date of this add cer personnel second
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this add cer personnel second.
	 *
	 * @param name the name of this add cer personnel second
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this add cer personnel second.
	 *
	 * @param primaryKey the primary key of this add cer personnel second
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the role of this add cer personnel second.
	 *
	 * @param role the role of this add cer personnel second
	 */
	@Override
	public void setRole(String role) {
		model.setRole(role);
	}

	/**
	 * Sets the user ID of this add cer personnel second.
	 *
	 * @param userId the user ID of this add cer personnel second
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add cer personnel second.
	 *
	 * @param userName the user name of this add cer personnel second
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add cer personnel second.
	 *
	 * @param userUuid the user uuid of this add cer personnel second
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
	protected AddCerPersonnelSecondWrapper wrap(
		AddCerPersonnelSecond addCerPersonnelSecond) {

		return new AddCerPersonnelSecondWrapper(addCerPersonnelSecond);
	}

}