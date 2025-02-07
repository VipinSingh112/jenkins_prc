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
 * This class is a wrapper for {@link AccMediLabOrganization}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOrganization
 * @generated
 */
public class AccMediLabOrganizationWrapper
	extends BaseModelWrapper<AccMediLabOrganization>
	implements AccMediLabOrganization, ModelWrapper<AccMediLabOrganization> {

	public AccMediLabOrganizationWrapper(
		AccMediLabOrganization accMediLabOrganization) {

		super(accMediLabOrganization);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabOrganizationId", getAccMediLabOrganizationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("laboratoryLegalEntity", getLaboratoryLegalEntity());
		attributes.put("legalStatus", getLegalStatus());
		attributes.put("laboratoryPartOfOrg", getLaboratoryPartOfOrg());
		attributes.put("laboratoryPartOfOrgName", getLaboratoryPartOfOrgName());
		attributes.put("laboratoryPartOfOrgPos", getLaboratoryPartOfOrgPos());
		attributes.put("nameOfAnalysts", getNameOfAnalysts());
		attributes.put("majorIncomeSource", getMajorIncomeSource());
		attributes.put("laboratoryClients", getLaboratoryClients());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accMediLabOrganizationId = (Long)attributes.get(
			"accMediLabOrganizationId");

		if (accMediLabOrganizationId != null) {
			setAccMediLabOrganizationId(accMediLabOrganizationId);
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

		String laboratoryLegalEntity = (String)attributes.get(
			"laboratoryLegalEntity");

		if (laboratoryLegalEntity != null) {
			setLaboratoryLegalEntity(laboratoryLegalEntity);
		}

		String legalStatus = (String)attributes.get("legalStatus");

		if (legalStatus != null) {
			setLegalStatus(legalStatus);
		}

		String laboratoryPartOfOrg = (String)attributes.get(
			"laboratoryPartOfOrg");

		if (laboratoryPartOfOrg != null) {
			setLaboratoryPartOfOrg(laboratoryPartOfOrg);
		}

		String laboratoryPartOfOrgName = (String)attributes.get(
			"laboratoryPartOfOrgName");

		if (laboratoryPartOfOrgName != null) {
			setLaboratoryPartOfOrgName(laboratoryPartOfOrgName);
		}

		String laboratoryPartOfOrgPos = (String)attributes.get(
			"laboratoryPartOfOrgPos");

		if (laboratoryPartOfOrgPos != null) {
			setLaboratoryPartOfOrgPos(laboratoryPartOfOrgPos);
		}

		String nameOfAnalysts = (String)attributes.get("nameOfAnalysts");

		if (nameOfAnalysts != null) {
			setNameOfAnalysts(nameOfAnalysts);
		}

		String majorIncomeSource = (String)attributes.get("majorIncomeSource");

		if (majorIncomeSource != null) {
			setMajorIncomeSource(majorIncomeSource);
		}

		String laboratoryClients = (String)attributes.get("laboratoryClients");

		if (laboratoryClients != null) {
			setLaboratoryClients(laboratoryClients);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccMediLabOrganization cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab organization ID of this acc medi lab organization.
	 *
	 * @return the acc medi lab organization ID of this acc medi lab organization
	 */
	@Override
	public long getAccMediLabOrganizationId() {
		return model.getAccMediLabOrganizationId();
	}

	/**
	 * Returns the company ID of this acc medi lab organization.
	 *
	 * @return the company ID of this acc medi lab organization
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc medi lab organization.
	 *
	 * @return the create date of this acc medi lab organization
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc medi lab organization.
	 *
	 * @return the group ID of this acc medi lab organization
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab organization.
	 *
	 * @return the janaac application ID of this acc medi lab organization
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the laboratory clients of this acc medi lab organization.
	 *
	 * @return the laboratory clients of this acc medi lab organization
	 */
	@Override
	public String getLaboratoryClients() {
		return model.getLaboratoryClients();
	}

	/**
	 * Returns the laboratory legal entity of this acc medi lab organization.
	 *
	 * @return the laboratory legal entity of this acc medi lab organization
	 */
	@Override
	public String getLaboratoryLegalEntity() {
		return model.getLaboratoryLegalEntity();
	}

	/**
	 * Returns the laboratory part of org of this acc medi lab organization.
	 *
	 * @return the laboratory part of org of this acc medi lab organization
	 */
	@Override
	public String getLaboratoryPartOfOrg() {
		return model.getLaboratoryPartOfOrg();
	}

	/**
	 * Returns the laboratory part of org name of this acc medi lab organization.
	 *
	 * @return the laboratory part of org name of this acc medi lab organization
	 */
	@Override
	public String getLaboratoryPartOfOrgName() {
		return model.getLaboratoryPartOfOrgName();
	}

	/**
	 * Returns the laboratory part of org pos of this acc medi lab organization.
	 *
	 * @return the laboratory part of org pos of this acc medi lab organization
	 */
	@Override
	public String getLaboratoryPartOfOrgPos() {
		return model.getLaboratoryPartOfOrgPos();
	}

	/**
	 * Returns the legal status of this acc medi lab organization.
	 *
	 * @return the legal status of this acc medi lab organization
	 */
	@Override
	public String getLegalStatus() {
		return model.getLegalStatus();
	}

	/**
	 * Returns the major income source of this acc medi lab organization.
	 *
	 * @return the major income source of this acc medi lab organization
	 */
	@Override
	public String getMajorIncomeSource() {
		return model.getMajorIncomeSource();
	}

	/**
	 * Returns the modified date of this acc medi lab organization.
	 *
	 * @return the modified date of this acc medi lab organization
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of analysts of this acc medi lab organization.
	 *
	 * @return the name of analysts of this acc medi lab organization
	 */
	@Override
	public String getNameOfAnalysts() {
		return model.getNameOfAnalysts();
	}

	/**
	 * Returns the primary key of this acc medi lab organization.
	 *
	 * @return the primary key of this acc medi lab organization
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acc medi lab organization.
	 *
	 * @return the user ID of this acc medi lab organization
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab organization.
	 *
	 * @return the user name of this acc medi lab organization
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab organization.
	 *
	 * @return the user uuid of this acc medi lab organization
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab organization.
	 *
	 * @return the uuid of this acc medi lab organization
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
	 * Sets the acc medi lab organization ID of this acc medi lab organization.
	 *
	 * @param accMediLabOrganizationId the acc medi lab organization ID of this acc medi lab organization
	 */
	@Override
	public void setAccMediLabOrganizationId(long accMediLabOrganizationId) {
		model.setAccMediLabOrganizationId(accMediLabOrganizationId);
	}

	/**
	 * Sets the company ID of this acc medi lab organization.
	 *
	 * @param companyId the company ID of this acc medi lab organization
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc medi lab organization.
	 *
	 * @param createDate the create date of this acc medi lab organization
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc medi lab organization.
	 *
	 * @param groupId the group ID of this acc medi lab organization
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab organization.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab organization
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the laboratory clients of this acc medi lab organization.
	 *
	 * @param laboratoryClients the laboratory clients of this acc medi lab organization
	 */
	@Override
	public void setLaboratoryClients(String laboratoryClients) {
		model.setLaboratoryClients(laboratoryClients);
	}

	/**
	 * Sets the laboratory legal entity of this acc medi lab organization.
	 *
	 * @param laboratoryLegalEntity the laboratory legal entity of this acc medi lab organization
	 */
	@Override
	public void setLaboratoryLegalEntity(String laboratoryLegalEntity) {
		model.setLaboratoryLegalEntity(laboratoryLegalEntity);
	}

	/**
	 * Sets the laboratory part of org of this acc medi lab organization.
	 *
	 * @param laboratoryPartOfOrg the laboratory part of org of this acc medi lab organization
	 */
	@Override
	public void setLaboratoryPartOfOrg(String laboratoryPartOfOrg) {
		model.setLaboratoryPartOfOrg(laboratoryPartOfOrg);
	}

	/**
	 * Sets the laboratory part of org name of this acc medi lab organization.
	 *
	 * @param laboratoryPartOfOrgName the laboratory part of org name of this acc medi lab organization
	 */
	@Override
	public void setLaboratoryPartOfOrgName(String laboratoryPartOfOrgName) {
		model.setLaboratoryPartOfOrgName(laboratoryPartOfOrgName);
	}

	/**
	 * Sets the laboratory part of org pos of this acc medi lab organization.
	 *
	 * @param laboratoryPartOfOrgPos the laboratory part of org pos of this acc medi lab organization
	 */
	@Override
	public void setLaboratoryPartOfOrgPos(String laboratoryPartOfOrgPos) {
		model.setLaboratoryPartOfOrgPos(laboratoryPartOfOrgPos);
	}

	/**
	 * Sets the legal status of this acc medi lab organization.
	 *
	 * @param legalStatus the legal status of this acc medi lab organization
	 */
	@Override
	public void setLegalStatus(String legalStatus) {
		model.setLegalStatus(legalStatus);
	}

	/**
	 * Sets the major income source of this acc medi lab organization.
	 *
	 * @param majorIncomeSource the major income source of this acc medi lab organization
	 */
	@Override
	public void setMajorIncomeSource(String majorIncomeSource) {
		model.setMajorIncomeSource(majorIncomeSource);
	}

	/**
	 * Sets the modified date of this acc medi lab organization.
	 *
	 * @param modifiedDate the modified date of this acc medi lab organization
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of analysts of this acc medi lab organization.
	 *
	 * @param nameOfAnalysts the name of analysts of this acc medi lab organization
	 */
	@Override
	public void setNameOfAnalysts(String nameOfAnalysts) {
		model.setNameOfAnalysts(nameOfAnalysts);
	}

	/**
	 * Sets the primary key of this acc medi lab organization.
	 *
	 * @param primaryKey the primary key of this acc medi lab organization
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acc medi lab organization.
	 *
	 * @param userId the user ID of this acc medi lab organization
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab organization.
	 *
	 * @param userName the user name of this acc medi lab organization
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab organization.
	 *
	 * @param userUuid the user uuid of this acc medi lab organization
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab organization.
	 *
	 * @param uuid the uuid of this acc medi lab organization
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
	protected AccMediLabOrganizationWrapper wrap(
		AccMediLabOrganization accMediLabOrganization) {

		return new AccMediLabOrganizationWrapper(accMediLabOrganization);
	}

}