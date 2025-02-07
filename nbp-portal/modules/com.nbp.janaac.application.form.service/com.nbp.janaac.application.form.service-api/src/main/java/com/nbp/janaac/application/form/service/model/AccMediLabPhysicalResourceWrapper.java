/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccMediLabPhysicalResource}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabPhysicalResource
 * @generated
 */
public class AccMediLabPhysicalResourceWrapper
	extends BaseModelWrapper<AccMediLabPhysicalResource>
	implements AccMediLabPhysicalResource,
			   ModelWrapper<AccMediLabPhysicalResource> {

	public AccMediLabPhysicalResourceWrapper(
		AccMediLabPhysicalResource accMediLabPhysicalResource) {

		super(accMediLabPhysicalResource);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabPhysicalResourceId", getAccMediLabPhysicalResourceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("laboratoryfacilities", getLaboratoryfacilities());
		attributes.put("safetyFeatures", getSafetyFeatures());
		attributes.put("specialEnvironment", getSpecialEnvironment());
		attributes.put("monitoringActivities", getMonitoringActivities());
		attributes.put("securityArrangements", getSecurityArrangements());
		attributes.put("laboratoryDocumented", getLaboratoryDocumented());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabPhysicalResourceId = (Long)attributes.get(
			"accMediLabPhysicalResourceId");

		if (accMediLabPhysicalResourceId != null) {
			setAccMediLabPhysicalResourceId(accMediLabPhysicalResourceId);
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

		String laboratoryfacilities = (String)attributes.get(
			"laboratoryfacilities");

		if (laboratoryfacilities != null) {
			setLaboratoryfacilities(laboratoryfacilities);
		}

		String safetyFeatures = (String)attributes.get("safetyFeatures");

		if (safetyFeatures != null) {
			setSafetyFeatures(safetyFeatures);
		}

		String specialEnvironment = (String)attributes.get(
			"specialEnvironment");

		if (specialEnvironment != null) {
			setSpecialEnvironment(specialEnvironment);
		}

		String monitoringActivities = (String)attributes.get(
			"monitoringActivities");

		if (monitoringActivities != null) {
			setMonitoringActivities(monitoringActivities);
		}

		String securityArrangements = (String)attributes.get(
			"securityArrangements");

		if (securityArrangements != null) {
			setSecurityArrangements(securityArrangements);
		}

		String laboratoryDocumented = (String)attributes.get(
			"laboratoryDocumented");

		if (laboratoryDocumented != null) {
			setLaboratoryDocumented(laboratoryDocumented);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabPhysicalResource cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab physical resource ID of this acc medi lab physical resource.
	 *
	 * @return the acc medi lab physical resource ID of this acc medi lab physical resource
	 */
	@Override
	public long getAccMediLabPhysicalResourceId() {
		return model.getAccMediLabPhysicalResourceId();
	}

	/**
	 * Returns the company ID of this acc medi lab physical resource.
	 *
	 * @return the company ID of this acc medi lab physical resource
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc medi lab physical resource.
	 *
	 * @return the create date of this acc medi lab physical resource
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc medi lab physical resource.
	 *
	 * @return the group ID of this acc medi lab physical resource
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab physical resource.
	 *
	 * @return the janaac application ID of this acc medi lab physical resource
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the laboratory documented of this acc medi lab physical resource.
	 *
	 * @return the laboratory documented of this acc medi lab physical resource
	 */
	@Override
	public String getLaboratoryDocumented() {
		return model.getLaboratoryDocumented();
	}

	/**
	 * Returns the laboratoryfacilities of this acc medi lab physical resource.
	 *
	 * @return the laboratoryfacilities of this acc medi lab physical resource
	 */
	@Override
	public String getLaboratoryfacilities() {
		return model.getLaboratoryfacilities();
	}

	/**
	 * Returns the modified date of this acc medi lab physical resource.
	 *
	 * @return the modified date of this acc medi lab physical resource
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monitoring activities of this acc medi lab physical resource.
	 *
	 * @return the monitoring activities of this acc medi lab physical resource
	 */
	@Override
	public String getMonitoringActivities() {
		return model.getMonitoringActivities();
	}

	/**
	 * Returns the primary key of this acc medi lab physical resource.
	 *
	 * @return the primary key of this acc medi lab physical resource
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the safety features of this acc medi lab physical resource.
	 *
	 * @return the safety features of this acc medi lab physical resource
	 */
	@Override
	public String getSafetyFeatures() {
		return model.getSafetyFeatures();
	}

	/**
	 * Returns the security arrangements of this acc medi lab physical resource.
	 *
	 * @return the security arrangements of this acc medi lab physical resource
	 */
	@Override
	public String getSecurityArrangements() {
		return model.getSecurityArrangements();
	}

	/**
	 * Returns the special environment of this acc medi lab physical resource.
	 *
	 * @return the special environment of this acc medi lab physical resource
	 */
	@Override
	public String getSpecialEnvironment() {
		return model.getSpecialEnvironment();
	}

	/**
	 * Returns the user ID of this acc medi lab physical resource.
	 *
	 * @return the user ID of this acc medi lab physical resource
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab physical resource.
	 *
	 * @return the user name of this acc medi lab physical resource
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab physical resource.
	 *
	 * @return the user uuid of this acc medi lab physical resource
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab physical resource.
	 *
	 * @return the uuid of this acc medi lab physical resource
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
	 * Sets the acc medi lab physical resource ID of this acc medi lab physical resource.
	 *
	 * @param accMediLabPhysicalResourceId the acc medi lab physical resource ID of this acc medi lab physical resource
	 */
	@Override
	public void setAccMediLabPhysicalResourceId(
		long accMediLabPhysicalResourceId) {

		model.setAccMediLabPhysicalResourceId(accMediLabPhysicalResourceId);
	}

	/**
	 * Sets the company ID of this acc medi lab physical resource.
	 *
	 * @param companyId the company ID of this acc medi lab physical resource
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc medi lab physical resource.
	 *
	 * @param createDate the create date of this acc medi lab physical resource
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc medi lab physical resource.
	 *
	 * @param groupId the group ID of this acc medi lab physical resource
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab physical resource.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab physical resource
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the laboratory documented of this acc medi lab physical resource.
	 *
	 * @param laboratoryDocumented the laboratory documented of this acc medi lab physical resource
	 */
	@Override
	public void setLaboratoryDocumented(String laboratoryDocumented) {
		model.setLaboratoryDocumented(laboratoryDocumented);
	}

	/**
	 * Sets the laboratoryfacilities of this acc medi lab physical resource.
	 *
	 * @param laboratoryfacilities the laboratoryfacilities of this acc medi lab physical resource
	 */
	@Override
	public void setLaboratoryfacilities(String laboratoryfacilities) {
		model.setLaboratoryfacilities(laboratoryfacilities);
	}

	/**
	 * Sets the modified date of this acc medi lab physical resource.
	 *
	 * @param modifiedDate the modified date of this acc medi lab physical resource
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monitoring activities of this acc medi lab physical resource.
	 *
	 * @param monitoringActivities the monitoring activities of this acc medi lab physical resource
	 */
	@Override
	public void setMonitoringActivities(String monitoringActivities) {
		model.setMonitoringActivities(monitoringActivities);
	}

	/**
	 * Sets the primary key of this acc medi lab physical resource.
	 *
	 * @param primaryKey the primary key of this acc medi lab physical resource
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the safety features of this acc medi lab physical resource.
	 *
	 * @param safetyFeatures the safety features of this acc medi lab physical resource
	 */
	@Override
	public void setSafetyFeatures(String safetyFeatures) {
		model.setSafetyFeatures(safetyFeatures);
	}

	/**
	 * Sets the security arrangements of this acc medi lab physical resource.
	 *
	 * @param securityArrangements the security arrangements of this acc medi lab physical resource
	 */
	@Override
	public void setSecurityArrangements(String securityArrangements) {
		model.setSecurityArrangements(securityArrangements);
	}

	/**
	 * Sets the special environment of this acc medi lab physical resource.
	 *
	 * @param specialEnvironment the special environment of this acc medi lab physical resource
	 */
	@Override
	public void setSpecialEnvironment(String specialEnvironment) {
		model.setSpecialEnvironment(specialEnvironment);
	}

	/**
	 * Sets the user ID of this acc medi lab physical resource.
	 *
	 * @param userId the user ID of this acc medi lab physical resource
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab physical resource.
	 *
	 * @param userName the user name of this acc medi lab physical resource
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab physical resource.
	 *
	 * @param userUuid the user uuid of this acc medi lab physical resource
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab physical resource.
	 *
	 * @param uuid the uuid of this acc medi lab physical resource
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
	protected AccMediLabPhysicalResourceWrapper wrap(
		AccMediLabPhysicalResource accMediLabPhysicalResource) {

		return new AccMediLabPhysicalResourceWrapper(
			accMediLabPhysicalResource);
	}

}