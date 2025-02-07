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
 * This class is a wrapper for {@link AccCerBodyGeneral}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyGeneral
 * @generated
 */
public class AccCerBodyGeneralWrapper
	extends BaseModelWrapper<AccCerBodyGeneral>
	implements AccCerBodyGeneral, ModelWrapper<AccCerBodyGeneral> {

	public AccCerBodyGeneralWrapper(AccCerBodyGeneral accCerBodyGeneral) {
		super(accCerBodyGeneral);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accCerBodyGeneralId", getAccCerBodyGeneralId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cerLegalEntity", getCerLegalEntity());
		attributes.put("cerLegalStatusEntity", getCerLegalStatusEntity());
		attributes.put("cerMajorIncomeSources", getCerMajorIncomeSources());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accCerBodyGeneralId = (Long)attributes.get("accCerBodyGeneralId");

		if (accCerBodyGeneralId != null) {
			setAccCerBodyGeneralId(accCerBodyGeneralId);
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

		String cerLegalEntity = (String)attributes.get("cerLegalEntity");

		if (cerLegalEntity != null) {
			setCerLegalEntity(cerLegalEntity);
		}

		String cerLegalStatusEntity = (String)attributes.get(
			"cerLegalStatusEntity");

		if (cerLegalStatusEntity != null) {
			setCerLegalStatusEntity(cerLegalStatusEntity);
		}

		String cerMajorIncomeSources = (String)attributes.get(
			"cerMajorIncomeSources");

		if (cerMajorIncomeSources != null) {
			setCerMajorIncomeSources(cerMajorIncomeSources);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccCerBodyGeneral cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc cer body general ID of this acc cer body general.
	 *
	 * @return the acc cer body general ID of this acc cer body general
	 */
	@Override
	public long getAccCerBodyGeneralId() {
		return model.getAccCerBodyGeneralId();
	}

	/**
	 * Returns the cer legal entity of this acc cer body general.
	 *
	 * @return the cer legal entity of this acc cer body general
	 */
	@Override
	public String getCerLegalEntity() {
		return model.getCerLegalEntity();
	}

	/**
	 * Returns the cer legal status entity of this acc cer body general.
	 *
	 * @return the cer legal status entity of this acc cer body general
	 */
	@Override
	public String getCerLegalStatusEntity() {
		return model.getCerLegalStatusEntity();
	}

	/**
	 * Returns the cer major income sources of this acc cer body general.
	 *
	 * @return the cer major income sources of this acc cer body general
	 */
	@Override
	public String getCerMajorIncomeSources() {
		return model.getCerMajorIncomeSources();
	}

	/**
	 * Returns the company ID of this acc cer body general.
	 *
	 * @return the company ID of this acc cer body general
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc cer body general.
	 *
	 * @return the create date of this acc cer body general
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc cer body general.
	 *
	 * @return the group ID of this acc cer body general
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc cer body general.
	 *
	 * @return the janaac application ID of this acc cer body general
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc cer body general.
	 *
	 * @return the modified date of this acc cer body general
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc cer body general.
	 *
	 * @return the primary key of this acc cer body general
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acc cer body general.
	 *
	 * @return the user ID of this acc cer body general
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc cer body general.
	 *
	 * @return the user name of this acc cer body general
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc cer body general.
	 *
	 * @return the user uuid of this acc cer body general
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc cer body general.
	 *
	 * @return the uuid of this acc cer body general
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
	 * Sets the acc cer body general ID of this acc cer body general.
	 *
	 * @param accCerBodyGeneralId the acc cer body general ID of this acc cer body general
	 */
	@Override
	public void setAccCerBodyGeneralId(long accCerBodyGeneralId) {
		model.setAccCerBodyGeneralId(accCerBodyGeneralId);
	}

	/**
	 * Sets the cer legal entity of this acc cer body general.
	 *
	 * @param cerLegalEntity the cer legal entity of this acc cer body general
	 */
	@Override
	public void setCerLegalEntity(String cerLegalEntity) {
		model.setCerLegalEntity(cerLegalEntity);
	}

	/**
	 * Sets the cer legal status entity of this acc cer body general.
	 *
	 * @param cerLegalStatusEntity the cer legal status entity of this acc cer body general
	 */
	@Override
	public void setCerLegalStatusEntity(String cerLegalStatusEntity) {
		model.setCerLegalStatusEntity(cerLegalStatusEntity);
	}

	/**
	 * Sets the cer major income sources of this acc cer body general.
	 *
	 * @param cerMajorIncomeSources the cer major income sources of this acc cer body general
	 */
	@Override
	public void setCerMajorIncomeSources(String cerMajorIncomeSources) {
		model.setCerMajorIncomeSources(cerMajorIncomeSources);
	}

	/**
	 * Sets the company ID of this acc cer body general.
	 *
	 * @param companyId the company ID of this acc cer body general
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc cer body general.
	 *
	 * @param createDate the create date of this acc cer body general
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc cer body general.
	 *
	 * @param groupId the group ID of this acc cer body general
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc cer body general.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc cer body general
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc cer body general.
	 *
	 * @param modifiedDate the modified date of this acc cer body general
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc cer body general.
	 *
	 * @param primaryKey the primary key of this acc cer body general
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acc cer body general.
	 *
	 * @param userId the user ID of this acc cer body general
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc cer body general.
	 *
	 * @param userName the user name of this acc cer body general
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc cer body general.
	 *
	 * @param userUuid the user uuid of this acc cer body general
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc cer body general.
	 *
	 * @param uuid the uuid of this acc cer body general
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
	protected AccCerBodyGeneralWrapper wrap(
		AccCerBodyGeneral accCerBodyGeneral) {

		return new AccCerBodyGeneralWrapper(accCerBodyGeneral);
	}

}