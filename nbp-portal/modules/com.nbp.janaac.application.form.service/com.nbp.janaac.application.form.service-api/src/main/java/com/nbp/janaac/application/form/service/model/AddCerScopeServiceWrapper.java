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
 * This class is a wrapper for {@link AddCerScopeService}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeService
 * @generated
 */
public class AddCerScopeServiceWrapper
	extends BaseModelWrapper<AddCerScopeService>
	implements AddCerScopeService, ModelWrapper<AddCerScopeService> {

	public AddCerScopeServiceWrapper(AddCerScopeService addCerScopeService) {
		super(addCerScopeService);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addCerScopeServiceId", getAddCerScopeServiceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("clientOrganization", getClientOrganization());
		attributes.put("certificationStandards", getCertificationStandards());
		attributes.put("currentCertification", getCurrentCertification());
		attributes.put("dateFirstGranted", getDateFirstGranted());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addCerScopeServiceId = (Long)attributes.get(
			"addCerScopeServiceId");

		if (addCerScopeServiceId != null) {
			setAddCerScopeServiceId(addCerScopeServiceId);
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

		String clientOrganization = (String)attributes.get(
			"clientOrganization");

		if (clientOrganization != null) {
			setClientOrganization(clientOrganization);
		}

		String certificationStandards = (String)attributes.get(
			"certificationStandards");

		if (certificationStandards != null) {
			setCertificationStandards(certificationStandards);
		}

		String currentCertification = (String)attributes.get(
			"currentCertification");

		if (currentCertification != null) {
			setCurrentCertification(currentCertification);
		}

		Date dateFirstGranted = (Date)attributes.get("dateFirstGranted");

		if (dateFirstGranted != null) {
			setDateFirstGranted(dateFirstGranted);
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
	public AddCerScopeService cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add cer scope service ID of this add cer scope service.
	 *
	 * @return the add cer scope service ID of this add cer scope service
	 */
	@Override
	public long getAddCerScopeServiceId() {
		return model.getAddCerScopeServiceId();
	}

	/**
	 * Returns the certification standards of this add cer scope service.
	 *
	 * @return the certification standards of this add cer scope service
	 */
	@Override
	public String getCertificationStandards() {
		return model.getCertificationStandards();
	}

	/**
	 * Returns the client organization of this add cer scope service.
	 *
	 * @return the client organization of this add cer scope service
	 */
	@Override
	public String getClientOrganization() {
		return model.getClientOrganization();
	}

	/**
	 * Returns the company ID of this add cer scope service.
	 *
	 * @return the company ID of this add cer scope service
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add cer scope service.
	 *
	 * @return the counter of this add cer scope service
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add cer scope service.
	 *
	 * @return the create date of this add cer scope service
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current certification of this add cer scope service.
	 *
	 * @return the current certification of this add cer scope service
	 */
	@Override
	public String getCurrentCertification() {
		return model.getCurrentCertification();
	}

	/**
	 * Returns the date first granted of this add cer scope service.
	 *
	 * @return the date first granted of this add cer scope service
	 */
	@Override
	public Date getDateFirstGranted() {
		return model.getDateFirstGranted();
	}

	/**
	 * Returns the group ID of this add cer scope service.
	 *
	 * @return the group ID of this add cer scope service
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add cer scope service.
	 *
	 * @return the janaac application ID of this add cer scope service
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this add cer scope service.
	 *
	 * @return the modified date of this add cer scope service
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add cer scope service.
	 *
	 * @return the primary key of this add cer scope service
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this add cer scope service.
	 *
	 * @return the user ID of this add cer scope service
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add cer scope service.
	 *
	 * @return the user name of this add cer scope service
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add cer scope service.
	 *
	 * @return the user uuid of this add cer scope service
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
	 * Sets the add cer scope service ID of this add cer scope service.
	 *
	 * @param addCerScopeServiceId the add cer scope service ID of this add cer scope service
	 */
	@Override
	public void setAddCerScopeServiceId(long addCerScopeServiceId) {
		model.setAddCerScopeServiceId(addCerScopeServiceId);
	}

	/**
	 * Sets the certification standards of this add cer scope service.
	 *
	 * @param certificationStandards the certification standards of this add cer scope service
	 */
	@Override
	public void setCertificationStandards(String certificationStandards) {
		model.setCertificationStandards(certificationStandards);
	}

	/**
	 * Sets the client organization of this add cer scope service.
	 *
	 * @param clientOrganization the client organization of this add cer scope service
	 */
	@Override
	public void setClientOrganization(String clientOrganization) {
		model.setClientOrganization(clientOrganization);
	}

	/**
	 * Sets the company ID of this add cer scope service.
	 *
	 * @param companyId the company ID of this add cer scope service
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add cer scope service.
	 *
	 * @param counter the counter of this add cer scope service
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add cer scope service.
	 *
	 * @param createDate the create date of this add cer scope service
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current certification of this add cer scope service.
	 *
	 * @param currentCertification the current certification of this add cer scope service
	 */
	@Override
	public void setCurrentCertification(String currentCertification) {
		model.setCurrentCertification(currentCertification);
	}

	/**
	 * Sets the date first granted of this add cer scope service.
	 *
	 * @param dateFirstGranted the date first granted of this add cer scope service
	 */
	@Override
	public void setDateFirstGranted(Date dateFirstGranted) {
		model.setDateFirstGranted(dateFirstGranted);
	}

	/**
	 * Sets the group ID of this add cer scope service.
	 *
	 * @param groupId the group ID of this add cer scope service
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add cer scope service.
	 *
	 * @param janaacApplicationId the janaac application ID of this add cer scope service
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this add cer scope service.
	 *
	 * @param modifiedDate the modified date of this add cer scope service
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add cer scope service.
	 *
	 * @param primaryKey the primary key of this add cer scope service
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this add cer scope service.
	 *
	 * @param userId the user ID of this add cer scope service
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add cer scope service.
	 *
	 * @param userName the user name of this add cer scope service
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add cer scope service.
	 *
	 * @param userUuid the user uuid of this add cer scope service
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
	protected AddCerScopeServiceWrapper wrap(
		AddCerScopeService addCerScopeService) {

		return new AddCerScopeServiceWrapper(addCerScopeService);
	}

}