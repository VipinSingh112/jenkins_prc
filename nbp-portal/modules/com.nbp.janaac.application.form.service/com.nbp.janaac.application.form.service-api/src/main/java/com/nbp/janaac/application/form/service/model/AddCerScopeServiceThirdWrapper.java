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
 * This class is a wrapper for {@link AddCerScopeServiceThird}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceThird
 * @generated
 */
public class AddCerScopeServiceThirdWrapper
	extends BaseModelWrapper<AddCerScopeServiceThird>
	implements AddCerScopeServiceThird, ModelWrapper<AddCerScopeServiceThird> {

	public AddCerScopeServiceThirdWrapper(
		AddCerScopeServiceThird addCerScopeServiceThird) {

		super(addCerScopeServiceThird);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"addCerScopeServiceThirdId", getAddCerScopeServiceThirdId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationName", getOrganizationName());
		attributes.put("organizationAddress", getOrganizationAddress());
		attributes.put("certificationScheme", getCertificationScheme());
		attributes.put("currentStatus", getCurrentStatus());
		attributes.put("dateFirstGranted", getDateFirstGranted());
		attributes.put("DateOfNextExamination", getDateOfNextExamination());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addCerScopeServiceThirdId = (Long)attributes.get(
			"addCerScopeServiceThirdId");

		if (addCerScopeServiceThirdId != null) {
			setAddCerScopeServiceThirdId(addCerScopeServiceThirdId);
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

		String organizationName = (String)attributes.get("organizationName");

		if (organizationName != null) {
			setOrganizationName(organizationName);
		}

		String organizationAddress = (String)attributes.get(
			"organizationAddress");

		if (organizationAddress != null) {
			setOrganizationAddress(organizationAddress);
		}

		String certificationScheme = (String)attributes.get(
			"certificationScheme");

		if (certificationScheme != null) {
			setCertificationScheme(certificationScheme);
		}

		String currentStatus = (String)attributes.get("currentStatus");

		if (currentStatus != null) {
			setCurrentStatus(currentStatus);
		}

		Date dateFirstGranted = (Date)attributes.get("dateFirstGranted");

		if (dateFirstGranted != null) {
			setDateFirstGranted(dateFirstGranted);
		}

		Date DateOfNextExamination = (Date)attributes.get(
			"DateOfNextExamination");

		if (DateOfNextExamination != null) {
			setDateOfNextExamination(DateOfNextExamination);
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
	public AddCerScopeServiceThird cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add cer scope service third ID of this add cer scope service third.
	 *
	 * @return the add cer scope service third ID of this add cer scope service third
	 */
	@Override
	public long getAddCerScopeServiceThirdId() {
		return model.getAddCerScopeServiceThirdId();
	}

	/**
	 * Returns the certification scheme of this add cer scope service third.
	 *
	 * @return the certification scheme of this add cer scope service third
	 */
	@Override
	public String getCertificationScheme() {
		return model.getCertificationScheme();
	}

	/**
	 * Returns the company ID of this add cer scope service third.
	 *
	 * @return the company ID of this add cer scope service third
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add cer scope service third.
	 *
	 * @return the counter of this add cer scope service third
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add cer scope service third.
	 *
	 * @return the create date of this add cer scope service third
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current status of this add cer scope service third.
	 *
	 * @return the current status of this add cer scope service third
	 */
	@Override
	public String getCurrentStatus() {
		return model.getCurrentStatus();
	}

	/**
	 * Returns the date first granted of this add cer scope service third.
	 *
	 * @return the date first granted of this add cer scope service third
	 */
	@Override
	public Date getDateFirstGranted() {
		return model.getDateFirstGranted();
	}

	/**
	 * Returns the date of next examination of this add cer scope service third.
	 *
	 * @return the date of next examination of this add cer scope service third
	 */
	@Override
	public Date getDateOfNextExamination() {
		return model.getDateOfNextExamination();
	}

	/**
	 * Returns the group ID of this add cer scope service third.
	 *
	 * @return the group ID of this add cer scope service third
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add cer scope service third.
	 *
	 * @return the janaac application ID of this add cer scope service third
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this add cer scope service third.
	 *
	 * @return the modified date of this add cer scope service third
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the organization address of this add cer scope service third.
	 *
	 * @return the organization address of this add cer scope service third
	 */
	@Override
	public String getOrganizationAddress() {
		return model.getOrganizationAddress();
	}

	/**
	 * Returns the organization name of this add cer scope service third.
	 *
	 * @return the organization name of this add cer scope service third
	 */
	@Override
	public String getOrganizationName() {
		return model.getOrganizationName();
	}

	/**
	 * Returns the primary key of this add cer scope service third.
	 *
	 * @return the primary key of this add cer scope service third
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add cer scope service third.
	 *
	 * @return the user ID of this add cer scope service third
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add cer scope service third.
	 *
	 * @return the user name of this add cer scope service third
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add cer scope service third.
	 *
	 * @return the user uuid of this add cer scope service third
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
	 * Sets the add cer scope service third ID of this add cer scope service third.
	 *
	 * @param addCerScopeServiceThirdId the add cer scope service third ID of this add cer scope service third
	 */
	@Override
	public void setAddCerScopeServiceThirdId(long addCerScopeServiceThirdId) {
		model.setAddCerScopeServiceThirdId(addCerScopeServiceThirdId);
	}

	/**
	 * Sets the certification scheme of this add cer scope service third.
	 *
	 * @param certificationScheme the certification scheme of this add cer scope service third
	 */
	@Override
	public void setCertificationScheme(String certificationScheme) {
		model.setCertificationScheme(certificationScheme);
	}

	/**
	 * Sets the company ID of this add cer scope service third.
	 *
	 * @param companyId the company ID of this add cer scope service third
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add cer scope service third.
	 *
	 * @param counter the counter of this add cer scope service third
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add cer scope service third.
	 *
	 * @param createDate the create date of this add cer scope service third
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current status of this add cer scope service third.
	 *
	 * @param currentStatus the current status of this add cer scope service third
	 */
	@Override
	public void setCurrentStatus(String currentStatus) {
		model.setCurrentStatus(currentStatus);
	}

	/**
	 * Sets the date first granted of this add cer scope service third.
	 *
	 * @param dateFirstGranted the date first granted of this add cer scope service third
	 */
	@Override
	public void setDateFirstGranted(Date dateFirstGranted) {
		model.setDateFirstGranted(dateFirstGranted);
	}

	/**
	 * Sets the date of next examination of this add cer scope service third.
	 *
	 * @param DateOfNextExamination the date of next examination of this add cer scope service third
	 */
	@Override
	public void setDateOfNextExamination(Date DateOfNextExamination) {
		model.setDateOfNextExamination(DateOfNextExamination);
	}

	/**
	 * Sets the group ID of this add cer scope service third.
	 *
	 * @param groupId the group ID of this add cer scope service third
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add cer scope service third.
	 *
	 * @param janaacApplicationId the janaac application ID of this add cer scope service third
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this add cer scope service third.
	 *
	 * @param modifiedDate the modified date of this add cer scope service third
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the organization address of this add cer scope service third.
	 *
	 * @param organizationAddress the organization address of this add cer scope service third
	 */
	@Override
	public void setOrganizationAddress(String organizationAddress) {
		model.setOrganizationAddress(organizationAddress);
	}

	/**
	 * Sets the organization name of this add cer scope service third.
	 *
	 * @param organizationName the organization name of this add cer scope service third
	 */
	@Override
	public void setOrganizationName(String organizationName) {
		model.setOrganizationName(organizationName);
	}

	/**
	 * Sets the primary key of this add cer scope service third.
	 *
	 * @param primaryKey the primary key of this add cer scope service third
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add cer scope service third.
	 *
	 * @param userId the user ID of this add cer scope service third
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add cer scope service third.
	 *
	 * @param userName the user name of this add cer scope service third
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add cer scope service third.
	 *
	 * @param userUuid the user uuid of this add cer scope service third
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
	protected AddCerScopeServiceThirdWrapper wrap(
		AddCerScopeServiceThird addCerScopeServiceThird) {

		return new AddCerScopeServiceThirdWrapper(addCerScopeServiceThird);
	}

}