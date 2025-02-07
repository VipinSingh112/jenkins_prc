/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProfessionalAffiliation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfessionalAffiliation
 * @generated
 */
public class ProfessionalAffiliationWrapper
	extends BaseModelWrapper<ProfessionalAffiliation>
	implements ModelWrapper<ProfessionalAffiliation>, ProfessionalAffiliation {

	public ProfessionalAffiliationWrapper(
		ProfessionalAffiliation professionalAffiliation) {

		super(professionalAffiliation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"professionalAffiliationId", getProfessionalAffiliationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"professionalAffiliationsDate", getProfessionalAffiliationsDate());
		attributes.put("affiliationMultivalue", getAffiliationMultivalue());
		attributes.put("osiApplicationId", getOsiApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long professionalAffiliationId = (Long)attributes.get(
			"professionalAffiliationId");

		if (professionalAffiliationId != null) {
			setProfessionalAffiliationId(professionalAffiliationId);
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

		Date professionalAffiliationsDate = (Date)attributes.get(
			"professionalAffiliationsDate");

		if (professionalAffiliationsDate != null) {
			setProfessionalAffiliationsDate(professionalAffiliationsDate);
		}

		String affiliationMultivalue = (String)attributes.get(
			"affiliationMultivalue");

		if (affiliationMultivalue != null) {
			setAffiliationMultivalue(affiliationMultivalue);
		}

		Long osiApplicationId = (Long)attributes.get("osiApplicationId");

		if (osiApplicationId != null) {
			setOsiApplicationId(osiApplicationId);
		}
	}

	@Override
	public ProfessionalAffiliation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the affiliation multivalue of this professional affiliation.
	 *
	 * @return the affiliation multivalue of this professional affiliation
	 */
	@Override
	public String getAffiliationMultivalue() {
		return model.getAffiliationMultivalue();
	}

	/**
	 * Returns the company ID of this professional affiliation.
	 *
	 * @return the company ID of this professional affiliation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this professional affiliation.
	 *
	 * @return the create date of this professional affiliation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this professional affiliation.
	 *
	 * @return the group ID of this professional affiliation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this professional affiliation.
	 *
	 * @return the modified date of this professional affiliation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi application ID of this professional affiliation.
	 *
	 * @return the osi application ID of this professional affiliation
	 */
	@Override
	public long getOsiApplicationId() {
		return model.getOsiApplicationId();
	}

	/**
	 * Returns the primary key of this professional affiliation.
	 *
	 * @return the primary key of this professional affiliation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the professional affiliation ID of this professional affiliation.
	 *
	 * @return the professional affiliation ID of this professional affiliation
	 */
	@Override
	public long getProfessionalAffiliationId() {
		return model.getProfessionalAffiliationId();
	}

	/**
	 * Returns the professional affiliations date of this professional affiliation.
	 *
	 * @return the professional affiliations date of this professional affiliation
	 */
	@Override
	public Date getProfessionalAffiliationsDate() {
		return model.getProfessionalAffiliationsDate();
	}

	/**
	 * Returns the user ID of this professional affiliation.
	 *
	 * @return the user ID of this professional affiliation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this professional affiliation.
	 *
	 * @return the user name of this professional affiliation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this professional affiliation.
	 *
	 * @return the user uuid of this professional affiliation
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
	 * Sets the affiliation multivalue of this professional affiliation.
	 *
	 * @param affiliationMultivalue the affiliation multivalue of this professional affiliation
	 */
	@Override
	public void setAffiliationMultivalue(String affiliationMultivalue) {
		model.setAffiliationMultivalue(affiliationMultivalue);
	}

	/**
	 * Sets the company ID of this professional affiliation.
	 *
	 * @param companyId the company ID of this professional affiliation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this professional affiliation.
	 *
	 * @param createDate the create date of this professional affiliation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this professional affiliation.
	 *
	 * @param groupId the group ID of this professional affiliation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this professional affiliation.
	 *
	 * @param modifiedDate the modified date of this professional affiliation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi application ID of this professional affiliation.
	 *
	 * @param osiApplicationId the osi application ID of this professional affiliation
	 */
	@Override
	public void setOsiApplicationId(long osiApplicationId) {
		model.setOsiApplicationId(osiApplicationId);
	}

	/**
	 * Sets the primary key of this professional affiliation.
	 *
	 * @param primaryKey the primary key of this professional affiliation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the professional affiliation ID of this professional affiliation.
	 *
	 * @param professionalAffiliationId the professional affiliation ID of this professional affiliation
	 */
	@Override
	public void setProfessionalAffiliationId(long professionalAffiliationId) {
		model.setProfessionalAffiliationId(professionalAffiliationId);
	}

	/**
	 * Sets the professional affiliations date of this professional affiliation.
	 *
	 * @param professionalAffiliationsDate the professional affiliations date of this professional affiliation
	 */
	@Override
	public void setProfessionalAffiliationsDate(
		Date professionalAffiliationsDate) {

		model.setProfessionalAffiliationsDate(professionalAffiliationsDate);
	}

	/**
	 * Sets the user ID of this professional affiliation.
	 *
	 * @param userId the user ID of this professional affiliation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this professional affiliation.
	 *
	 * @param userName the user name of this professional affiliation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this professional affiliation.
	 *
	 * @param userUuid the user uuid of this professional affiliation
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
	protected ProfessionalAffiliationWrapper wrap(
		ProfessionalAffiliation professionalAffiliation) {

		return new ProfessionalAffiliationWrapper(professionalAffiliation);
	}

}