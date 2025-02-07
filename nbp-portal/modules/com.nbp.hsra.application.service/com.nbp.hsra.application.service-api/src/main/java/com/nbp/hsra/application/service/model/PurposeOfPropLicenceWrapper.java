/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PurposeOfPropLicence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurposeOfPropLicence
 * @generated
 */
public class PurposeOfPropLicenceWrapper
	extends BaseModelWrapper<PurposeOfPropLicence>
	implements ModelWrapper<PurposeOfPropLicence>, PurposeOfPropLicence {

	public PurposeOfPropLicenceWrapper(
		PurposeOfPropLicence purposeOfPropLicence) {

		super(purposeOfPropLicence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("purposeOfPropLicenceId", getPurposeOfPropLicenceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nuclearRegstLic", getNuclearRegstLic());
		attributes.put("nuclearBusinessPlace", getNuclearBusinessPlace());
		attributes.put("nuclearActivityMainAdd", getNuclearActivityMainAdd());
		attributes.put("applicationType", getApplicationType());
		attributes.put("nuclearAdditionalLoc", getNuclearAdditionalLoc());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long purposeOfPropLicenceId = (Long)attributes.get(
			"purposeOfPropLicenceId");

		if (purposeOfPropLicenceId != null) {
			setPurposeOfPropLicenceId(purposeOfPropLicenceId);
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

		String nuclearRegstLic = (String)attributes.get("nuclearRegstLic");

		if (nuclearRegstLic != null) {
			setNuclearRegstLic(nuclearRegstLic);
		}

		String nuclearBusinessPlace = (String)attributes.get(
			"nuclearBusinessPlace");

		if (nuclearBusinessPlace != null) {
			setNuclearBusinessPlace(nuclearBusinessPlace);
		}

		String nuclearActivityMainAdd = (String)attributes.get(
			"nuclearActivityMainAdd");

		if (nuclearActivityMainAdd != null) {
			setNuclearActivityMainAdd(nuclearActivityMainAdd);
		}

		String applicationType = (String)attributes.get("applicationType");

		if (applicationType != null) {
			setApplicationType(applicationType);
		}

		String nuclearAdditionalLoc = (String)attributes.get(
			"nuclearAdditionalLoc");

		if (nuclearAdditionalLoc != null) {
			setNuclearAdditionalLoc(nuclearAdditionalLoc);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public PurposeOfPropLicence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the application type of this purpose of prop licence.
	 *
	 * @return the application type of this purpose of prop licence
	 */
	@Override
	public String getApplicationType() {
		return model.getApplicationType();
	}

	/**
	 * Returns the company ID of this purpose of prop licence.
	 *
	 * @return the company ID of this purpose of prop licence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this purpose of prop licence.
	 *
	 * @return the create date of this purpose of prop licence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this purpose of prop licence.
	 *
	 * @return the group ID of this purpose of prop licence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this purpose of prop licence.
	 *
	 * @return the hsra application ID of this purpose of prop licence
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this purpose of prop licence.
	 *
	 * @return the modified date of this purpose of prop licence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nuclear activity main add of this purpose of prop licence.
	 *
	 * @return the nuclear activity main add of this purpose of prop licence
	 */
	@Override
	public String getNuclearActivityMainAdd() {
		return model.getNuclearActivityMainAdd();
	}

	/**
	 * Returns the nuclear additional loc of this purpose of prop licence.
	 *
	 * @return the nuclear additional loc of this purpose of prop licence
	 */
	@Override
	public String getNuclearAdditionalLoc() {
		return model.getNuclearAdditionalLoc();
	}

	/**
	 * Returns the nuclear business place of this purpose of prop licence.
	 *
	 * @return the nuclear business place of this purpose of prop licence
	 */
	@Override
	public String getNuclearBusinessPlace() {
		return model.getNuclearBusinessPlace();
	}

	/**
	 * Returns the nuclear regst lic of this purpose of prop licence.
	 *
	 * @return the nuclear regst lic of this purpose of prop licence
	 */
	@Override
	public String getNuclearRegstLic() {
		return model.getNuclearRegstLic();
	}

	/**
	 * Returns the primary key of this purpose of prop licence.
	 *
	 * @return the primary key of this purpose of prop licence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the purpose of prop licence ID of this purpose of prop licence.
	 *
	 * @return the purpose of prop licence ID of this purpose of prop licence
	 */
	@Override
	public long getPurposeOfPropLicenceId() {
		return model.getPurposeOfPropLicenceId();
	}

	/**
	 * Returns the user ID of this purpose of prop licence.
	 *
	 * @return the user ID of this purpose of prop licence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this purpose of prop licence.
	 *
	 * @return the user name of this purpose of prop licence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this purpose of prop licence.
	 *
	 * @return the user uuid of this purpose of prop licence
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
	 * Sets the application type of this purpose of prop licence.
	 *
	 * @param applicationType the application type of this purpose of prop licence
	 */
	@Override
	public void setApplicationType(String applicationType) {
		model.setApplicationType(applicationType);
	}

	/**
	 * Sets the company ID of this purpose of prop licence.
	 *
	 * @param companyId the company ID of this purpose of prop licence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this purpose of prop licence.
	 *
	 * @param createDate the create date of this purpose of prop licence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this purpose of prop licence.
	 *
	 * @param groupId the group ID of this purpose of prop licence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this purpose of prop licence.
	 *
	 * @param hsraApplicationId the hsra application ID of this purpose of prop licence
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this purpose of prop licence.
	 *
	 * @param modifiedDate the modified date of this purpose of prop licence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nuclear activity main add of this purpose of prop licence.
	 *
	 * @param nuclearActivityMainAdd the nuclear activity main add of this purpose of prop licence
	 */
	@Override
	public void setNuclearActivityMainAdd(String nuclearActivityMainAdd) {
		model.setNuclearActivityMainAdd(nuclearActivityMainAdd);
	}

	/**
	 * Sets the nuclear additional loc of this purpose of prop licence.
	 *
	 * @param nuclearAdditionalLoc the nuclear additional loc of this purpose of prop licence
	 */
	@Override
	public void setNuclearAdditionalLoc(String nuclearAdditionalLoc) {
		model.setNuclearAdditionalLoc(nuclearAdditionalLoc);
	}

	/**
	 * Sets the nuclear business place of this purpose of prop licence.
	 *
	 * @param nuclearBusinessPlace the nuclear business place of this purpose of prop licence
	 */
	@Override
	public void setNuclearBusinessPlace(String nuclearBusinessPlace) {
		model.setNuclearBusinessPlace(nuclearBusinessPlace);
	}

	/**
	 * Sets the nuclear regst lic of this purpose of prop licence.
	 *
	 * @param nuclearRegstLic the nuclear regst lic of this purpose of prop licence
	 */
	@Override
	public void setNuclearRegstLic(String nuclearRegstLic) {
		model.setNuclearRegstLic(nuclearRegstLic);
	}

	/**
	 * Sets the primary key of this purpose of prop licence.
	 *
	 * @param primaryKey the primary key of this purpose of prop licence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the purpose of prop licence ID of this purpose of prop licence.
	 *
	 * @param purposeOfPropLicenceId the purpose of prop licence ID of this purpose of prop licence
	 */
	@Override
	public void setPurposeOfPropLicenceId(long purposeOfPropLicenceId) {
		model.setPurposeOfPropLicenceId(purposeOfPropLicenceId);
	}

	/**
	 * Sets the user ID of this purpose of prop licence.
	 *
	 * @param userId the user ID of this purpose of prop licence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this purpose of prop licence.
	 *
	 * @param userName the user name of this purpose of prop licence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this purpose of prop licence.
	 *
	 * @param userUuid the user uuid of this purpose of prop licence
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
	protected PurposeOfPropLicenceWrapper wrap(
		PurposeOfPropLicence purposeOfPropLicence) {

		return new PurposeOfPropLicenceWrapper(purposeOfPropLicence);
	}

}