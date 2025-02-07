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
 * This class is a wrapper for {@link AccInsBodiesPhyResource}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesPhyResource
 * @generated
 */
public class AccInsBodiesPhyResourceWrapper
	extends BaseModelWrapper<AccInsBodiesPhyResource>
	implements AccInsBodiesPhyResource, ModelWrapper<AccInsBodiesPhyResource> {

	public AccInsBodiesPhyResourceWrapper(
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		super(accInsBodiesPhyResource);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accInsBodiesPhyResourceId", getAccInsBodiesPhyResourceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("insBodiesfacilities", getInsBodiesfacilities());
		attributes.put("insSafetyFeatures", getInsSafetyFeatures());
		attributes.put("insSecurityArrangements", getInsSecurityArrangements());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accInsBodiesPhyResourceId = (Long)attributes.get(
			"accInsBodiesPhyResourceId");

		if (accInsBodiesPhyResourceId != null) {
			setAccInsBodiesPhyResourceId(accInsBodiesPhyResourceId);
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

		String insBodiesfacilities = (String)attributes.get(
			"insBodiesfacilities");

		if (insBodiesfacilities != null) {
			setInsBodiesfacilities(insBodiesfacilities);
		}

		String insSafetyFeatures = (String)attributes.get("insSafetyFeatures");

		if (insSafetyFeatures != null) {
			setInsSafetyFeatures(insSafetyFeatures);
		}

		String insSecurityArrangements = (String)attributes.get(
			"insSecurityArrangements");

		if (insSecurityArrangements != null) {
			setInsSecurityArrangements(insSecurityArrangements);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccInsBodiesPhyResource cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc ins bodies phy resource ID of this acc ins bodies phy resource.
	 *
	 * @return the acc ins bodies phy resource ID of this acc ins bodies phy resource
	 */
	@Override
	public long getAccInsBodiesPhyResourceId() {
		return model.getAccInsBodiesPhyResourceId();
	}

	/**
	 * Returns the company ID of this acc ins bodies phy resource.
	 *
	 * @return the company ID of this acc ins bodies phy resource
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc ins bodies phy resource.
	 *
	 * @return the create date of this acc ins bodies phy resource
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc ins bodies phy resource.
	 *
	 * @return the group ID of this acc ins bodies phy resource
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ins bodiesfacilities of this acc ins bodies phy resource.
	 *
	 * @return the ins bodiesfacilities of this acc ins bodies phy resource
	 */
	@Override
	public String getInsBodiesfacilities() {
		return model.getInsBodiesfacilities();
	}

	/**
	 * Returns the ins safety features of this acc ins bodies phy resource.
	 *
	 * @return the ins safety features of this acc ins bodies phy resource
	 */
	@Override
	public String getInsSafetyFeatures() {
		return model.getInsSafetyFeatures();
	}

	/**
	 * Returns the ins security arrangements of this acc ins bodies phy resource.
	 *
	 * @return the ins security arrangements of this acc ins bodies phy resource
	 */
	@Override
	public String getInsSecurityArrangements() {
		return model.getInsSecurityArrangements();
	}

	/**
	 * Returns the janaac application ID of this acc ins bodies phy resource.
	 *
	 * @return the janaac application ID of this acc ins bodies phy resource
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc ins bodies phy resource.
	 *
	 * @return the modified date of this acc ins bodies phy resource
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc ins bodies phy resource.
	 *
	 * @return the primary key of this acc ins bodies phy resource
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acc ins bodies phy resource.
	 *
	 * @return the user ID of this acc ins bodies phy resource
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc ins bodies phy resource.
	 *
	 * @return the user name of this acc ins bodies phy resource
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc ins bodies phy resource.
	 *
	 * @return the user uuid of this acc ins bodies phy resource
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc ins bodies phy resource.
	 *
	 * @return the uuid of this acc ins bodies phy resource
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
	 * Sets the acc ins bodies phy resource ID of this acc ins bodies phy resource.
	 *
	 * @param accInsBodiesPhyResourceId the acc ins bodies phy resource ID of this acc ins bodies phy resource
	 */
	@Override
	public void setAccInsBodiesPhyResourceId(long accInsBodiesPhyResourceId) {
		model.setAccInsBodiesPhyResourceId(accInsBodiesPhyResourceId);
	}

	/**
	 * Sets the company ID of this acc ins bodies phy resource.
	 *
	 * @param companyId the company ID of this acc ins bodies phy resource
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc ins bodies phy resource.
	 *
	 * @param createDate the create date of this acc ins bodies phy resource
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc ins bodies phy resource.
	 *
	 * @param groupId the group ID of this acc ins bodies phy resource
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ins bodiesfacilities of this acc ins bodies phy resource.
	 *
	 * @param insBodiesfacilities the ins bodiesfacilities of this acc ins bodies phy resource
	 */
	@Override
	public void setInsBodiesfacilities(String insBodiesfacilities) {
		model.setInsBodiesfacilities(insBodiesfacilities);
	}

	/**
	 * Sets the ins safety features of this acc ins bodies phy resource.
	 *
	 * @param insSafetyFeatures the ins safety features of this acc ins bodies phy resource
	 */
	@Override
	public void setInsSafetyFeatures(String insSafetyFeatures) {
		model.setInsSafetyFeatures(insSafetyFeatures);
	}

	/**
	 * Sets the ins security arrangements of this acc ins bodies phy resource.
	 *
	 * @param insSecurityArrangements the ins security arrangements of this acc ins bodies phy resource
	 */
	@Override
	public void setInsSecurityArrangements(String insSecurityArrangements) {
		model.setInsSecurityArrangements(insSecurityArrangements);
	}

	/**
	 * Sets the janaac application ID of this acc ins bodies phy resource.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc ins bodies phy resource
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc ins bodies phy resource.
	 *
	 * @param modifiedDate the modified date of this acc ins bodies phy resource
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc ins bodies phy resource.
	 *
	 * @param primaryKey the primary key of this acc ins bodies phy resource
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acc ins bodies phy resource.
	 *
	 * @param userId the user ID of this acc ins bodies phy resource
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc ins bodies phy resource.
	 *
	 * @param userName the user name of this acc ins bodies phy resource
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc ins bodies phy resource.
	 *
	 * @param userUuid the user uuid of this acc ins bodies phy resource
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc ins bodies phy resource.
	 *
	 * @param uuid the uuid of this acc ins bodies phy resource
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
	protected AccInsBodiesPhyResourceWrapper wrap(
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return new AccInsBodiesPhyResourceWrapper(accInsBodiesPhyResource);
	}

}