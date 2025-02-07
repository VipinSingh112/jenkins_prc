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
 * This class is a wrapper for {@link AccInsBodiesOrganization}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOrganization
 * @generated
 */
public class AccInsBodiesOrganizationWrapper
	extends BaseModelWrapper<AccInsBodiesOrganization>
	implements AccInsBodiesOrganization,
			   ModelWrapper<AccInsBodiesOrganization> {

	public AccInsBodiesOrganizationWrapper(
		AccInsBodiesOrganization accInsBodiesOrganization) {

		super(accInsBodiesOrganization);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accInsBodiesOrganizationId", getAccInsBodiesOrganizationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("insLegalEntity", getInsLegalEntity());
		attributes.put("insLegalStatusEntity", getInsLegalStatusEntity());
		attributes.put("insBodyOrgPart", getInsBodyOrgPart());
		attributes.put("insPersonnelName", getInsPersonnelName());
		attributes.put("insPersonnelPosition", getInsPersonnelPosition());
		attributes.put("insStaffSize", getInsStaffSize());
		attributes.put("insStaffComplement", getInsStaffComplement());
		attributes.put("insIncomeSource", getInsIncomeSource());
		attributes.put("insOrgBodyType", getInsOrgBodyType());
		attributes.put("insBodyOwnOrgClient", getInsBodyOwnOrgClient());
		attributes.put("insBodyOtherOrgClient", getInsBodyOtherOrgClient());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accInsBodiesOrganizationId = (Long)attributes.get(
			"accInsBodiesOrganizationId");

		if (accInsBodiesOrganizationId != null) {
			setAccInsBodiesOrganizationId(accInsBodiesOrganizationId);
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

		String insLegalEntity = (String)attributes.get("insLegalEntity");

		if (insLegalEntity != null) {
			setInsLegalEntity(insLegalEntity);
		}

		String insLegalStatusEntity = (String)attributes.get(
			"insLegalStatusEntity");

		if (insLegalStatusEntity != null) {
			setInsLegalStatusEntity(insLegalStatusEntity);
		}

		String insBodyOrgPart = (String)attributes.get("insBodyOrgPart");

		if (insBodyOrgPart != null) {
			setInsBodyOrgPart(insBodyOrgPart);
		}

		String insPersonnelName = (String)attributes.get("insPersonnelName");

		if (insPersonnelName != null) {
			setInsPersonnelName(insPersonnelName);
		}

		String insPersonnelPosition = (String)attributes.get(
			"insPersonnelPosition");

		if (insPersonnelPosition != null) {
			setInsPersonnelPosition(insPersonnelPosition);
		}

		String insStaffSize = (String)attributes.get("insStaffSize");

		if (insStaffSize != null) {
			setInsStaffSize(insStaffSize);
		}

		String insStaffComplement = (String)attributes.get(
			"insStaffComplement");

		if (insStaffComplement != null) {
			setInsStaffComplement(insStaffComplement);
		}

		String insIncomeSource = (String)attributes.get("insIncomeSource");

		if (insIncomeSource != null) {
			setInsIncomeSource(insIncomeSource);
		}

		String insOrgBodyType = (String)attributes.get("insOrgBodyType");

		if (insOrgBodyType != null) {
			setInsOrgBodyType(insOrgBodyType);
		}

		String insBodyOwnOrgClient = (String)attributes.get(
			"insBodyOwnOrgClient");

		if (insBodyOwnOrgClient != null) {
			setInsBodyOwnOrgClient(insBodyOwnOrgClient);
		}

		String insBodyOtherOrgClient = (String)attributes.get(
			"insBodyOtherOrgClient");

		if (insBodyOtherOrgClient != null) {
			setInsBodyOtherOrgClient(insBodyOtherOrgClient);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccInsBodiesOrganization cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc ins bodies organization ID of this acc ins bodies organization.
	 *
	 * @return the acc ins bodies organization ID of this acc ins bodies organization
	 */
	@Override
	public long getAccInsBodiesOrganizationId() {
		return model.getAccInsBodiesOrganizationId();
	}

	/**
	 * Returns the company ID of this acc ins bodies organization.
	 *
	 * @return the company ID of this acc ins bodies organization
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc ins bodies organization.
	 *
	 * @return the create date of this acc ins bodies organization
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc ins bodies organization.
	 *
	 * @return the group ID of this acc ins bodies organization
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ins body org part of this acc ins bodies organization.
	 *
	 * @return the ins body org part of this acc ins bodies organization
	 */
	@Override
	public String getInsBodyOrgPart() {
		return model.getInsBodyOrgPart();
	}

	/**
	 * Returns the ins body other org client of this acc ins bodies organization.
	 *
	 * @return the ins body other org client of this acc ins bodies organization
	 */
	@Override
	public String getInsBodyOtherOrgClient() {
		return model.getInsBodyOtherOrgClient();
	}

	/**
	 * Returns the ins body own org client of this acc ins bodies organization.
	 *
	 * @return the ins body own org client of this acc ins bodies organization
	 */
	@Override
	public String getInsBodyOwnOrgClient() {
		return model.getInsBodyOwnOrgClient();
	}

	/**
	 * Returns the ins income source of this acc ins bodies organization.
	 *
	 * @return the ins income source of this acc ins bodies organization
	 */
	@Override
	public String getInsIncomeSource() {
		return model.getInsIncomeSource();
	}

	/**
	 * Returns the ins legal entity of this acc ins bodies organization.
	 *
	 * @return the ins legal entity of this acc ins bodies organization
	 */
	@Override
	public String getInsLegalEntity() {
		return model.getInsLegalEntity();
	}

	/**
	 * Returns the ins legal status entity of this acc ins bodies organization.
	 *
	 * @return the ins legal status entity of this acc ins bodies organization
	 */
	@Override
	public String getInsLegalStatusEntity() {
		return model.getInsLegalStatusEntity();
	}

	/**
	 * Returns the ins org body type of this acc ins bodies organization.
	 *
	 * @return the ins org body type of this acc ins bodies organization
	 */
	@Override
	public String getInsOrgBodyType() {
		return model.getInsOrgBodyType();
	}

	/**
	 * Returns the ins personnel name of this acc ins bodies organization.
	 *
	 * @return the ins personnel name of this acc ins bodies organization
	 */
	@Override
	public String getInsPersonnelName() {
		return model.getInsPersonnelName();
	}

	/**
	 * Returns the ins personnel position of this acc ins bodies organization.
	 *
	 * @return the ins personnel position of this acc ins bodies organization
	 */
	@Override
	public String getInsPersonnelPosition() {
		return model.getInsPersonnelPosition();
	}

	/**
	 * Returns the ins staff complement of this acc ins bodies organization.
	 *
	 * @return the ins staff complement of this acc ins bodies organization
	 */
	@Override
	public String getInsStaffComplement() {
		return model.getInsStaffComplement();
	}

	/**
	 * Returns the ins staff size of this acc ins bodies organization.
	 *
	 * @return the ins staff size of this acc ins bodies organization
	 */
	@Override
	public String getInsStaffSize() {
		return model.getInsStaffSize();
	}

	/**
	 * Returns the janaac application ID of this acc ins bodies organization.
	 *
	 * @return the janaac application ID of this acc ins bodies organization
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc ins bodies organization.
	 *
	 * @return the modified date of this acc ins bodies organization
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc ins bodies organization.
	 *
	 * @return the primary key of this acc ins bodies organization
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acc ins bodies organization.
	 *
	 * @return the user ID of this acc ins bodies organization
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc ins bodies organization.
	 *
	 * @return the user name of this acc ins bodies organization
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc ins bodies organization.
	 *
	 * @return the user uuid of this acc ins bodies organization
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc ins bodies organization.
	 *
	 * @return the uuid of this acc ins bodies organization
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
	 * Sets the acc ins bodies organization ID of this acc ins bodies organization.
	 *
	 * @param accInsBodiesOrganizationId the acc ins bodies organization ID of this acc ins bodies organization
	 */
	@Override
	public void setAccInsBodiesOrganizationId(long accInsBodiesOrganizationId) {
		model.setAccInsBodiesOrganizationId(accInsBodiesOrganizationId);
	}

	/**
	 * Sets the company ID of this acc ins bodies organization.
	 *
	 * @param companyId the company ID of this acc ins bodies organization
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc ins bodies organization.
	 *
	 * @param createDate the create date of this acc ins bodies organization
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc ins bodies organization.
	 *
	 * @param groupId the group ID of this acc ins bodies organization
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ins body org part of this acc ins bodies organization.
	 *
	 * @param insBodyOrgPart the ins body org part of this acc ins bodies organization
	 */
	@Override
	public void setInsBodyOrgPart(String insBodyOrgPart) {
		model.setInsBodyOrgPart(insBodyOrgPart);
	}

	/**
	 * Sets the ins body other org client of this acc ins bodies organization.
	 *
	 * @param insBodyOtherOrgClient the ins body other org client of this acc ins bodies organization
	 */
	@Override
	public void setInsBodyOtherOrgClient(String insBodyOtherOrgClient) {
		model.setInsBodyOtherOrgClient(insBodyOtherOrgClient);
	}

	/**
	 * Sets the ins body own org client of this acc ins bodies organization.
	 *
	 * @param insBodyOwnOrgClient the ins body own org client of this acc ins bodies organization
	 */
	@Override
	public void setInsBodyOwnOrgClient(String insBodyOwnOrgClient) {
		model.setInsBodyOwnOrgClient(insBodyOwnOrgClient);
	}

	/**
	 * Sets the ins income source of this acc ins bodies organization.
	 *
	 * @param insIncomeSource the ins income source of this acc ins bodies organization
	 */
	@Override
	public void setInsIncomeSource(String insIncomeSource) {
		model.setInsIncomeSource(insIncomeSource);
	}

	/**
	 * Sets the ins legal entity of this acc ins bodies organization.
	 *
	 * @param insLegalEntity the ins legal entity of this acc ins bodies organization
	 */
	@Override
	public void setInsLegalEntity(String insLegalEntity) {
		model.setInsLegalEntity(insLegalEntity);
	}

	/**
	 * Sets the ins legal status entity of this acc ins bodies organization.
	 *
	 * @param insLegalStatusEntity the ins legal status entity of this acc ins bodies organization
	 */
	@Override
	public void setInsLegalStatusEntity(String insLegalStatusEntity) {
		model.setInsLegalStatusEntity(insLegalStatusEntity);
	}

	/**
	 * Sets the ins org body type of this acc ins bodies organization.
	 *
	 * @param insOrgBodyType the ins org body type of this acc ins bodies organization
	 */
	@Override
	public void setInsOrgBodyType(String insOrgBodyType) {
		model.setInsOrgBodyType(insOrgBodyType);
	}

	/**
	 * Sets the ins personnel name of this acc ins bodies organization.
	 *
	 * @param insPersonnelName the ins personnel name of this acc ins bodies organization
	 */
	@Override
	public void setInsPersonnelName(String insPersonnelName) {
		model.setInsPersonnelName(insPersonnelName);
	}

	/**
	 * Sets the ins personnel position of this acc ins bodies organization.
	 *
	 * @param insPersonnelPosition the ins personnel position of this acc ins bodies organization
	 */
	@Override
	public void setInsPersonnelPosition(String insPersonnelPosition) {
		model.setInsPersonnelPosition(insPersonnelPosition);
	}

	/**
	 * Sets the ins staff complement of this acc ins bodies organization.
	 *
	 * @param insStaffComplement the ins staff complement of this acc ins bodies organization
	 */
	@Override
	public void setInsStaffComplement(String insStaffComplement) {
		model.setInsStaffComplement(insStaffComplement);
	}

	/**
	 * Sets the ins staff size of this acc ins bodies organization.
	 *
	 * @param insStaffSize the ins staff size of this acc ins bodies organization
	 */
	@Override
	public void setInsStaffSize(String insStaffSize) {
		model.setInsStaffSize(insStaffSize);
	}

	/**
	 * Sets the janaac application ID of this acc ins bodies organization.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc ins bodies organization
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc ins bodies organization.
	 *
	 * @param modifiedDate the modified date of this acc ins bodies organization
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc ins bodies organization.
	 *
	 * @param primaryKey the primary key of this acc ins bodies organization
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acc ins bodies organization.
	 *
	 * @param userId the user ID of this acc ins bodies organization
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc ins bodies organization.
	 *
	 * @param userName the user name of this acc ins bodies organization
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc ins bodies organization.
	 *
	 * @param userUuid the user uuid of this acc ins bodies organization
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc ins bodies organization.
	 *
	 * @param uuid the uuid of this acc ins bodies organization
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
	protected AccInsBodiesOrganizationWrapper wrap(
		AccInsBodiesOrganization accInsBodiesOrganization) {

		return new AccInsBodiesOrganizationWrapper(accInsBodiesOrganization);
	}

}