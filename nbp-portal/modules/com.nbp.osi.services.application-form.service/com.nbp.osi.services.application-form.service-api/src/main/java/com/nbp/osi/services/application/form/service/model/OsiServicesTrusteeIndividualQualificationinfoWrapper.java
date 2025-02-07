/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiServicesTrusteeIndividualQualificationinfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualQualificationinfo
 * @generated
 */
public class OsiServicesTrusteeIndividualQualificationinfoWrapper
	extends BaseModelWrapper<OsiServicesTrusteeIndividualQualificationinfo>
	implements ModelWrapper<OsiServicesTrusteeIndividualQualificationinfo>,
			   OsiServicesTrusteeIndividualQualificationinfo {

	public OsiServicesTrusteeIndividualQualificationinfoWrapper(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		super(osiServicesTrusteeIndividualQualificationinfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osQualificationId", getOsQualificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("orgMember", getOrgMember());
		attributes.put(
			"osiServicesApplicationId", getOsiServicesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long osQualificationId = (Long)attributes.get("osQualificationId");

		if (osQualificationId != null) {
			setOsQualificationId(osQualificationId);
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

		String orgMember = (String)attributes.get("orgMember");

		if (orgMember != null) {
			setOrgMember(orgMember);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesTrusteeIndividualQualificationinfo
		cloneWithOriginalValues() {

		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi services trustee individual qualificationinfo.
	 *
	 * @return the company ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services trustee individual qualificationinfo.
	 *
	 * @return the create date of this osi services trustee individual qualificationinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi services trustee individual qualificationinfo.
	 *
	 * @return the group ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi services trustee individual qualificationinfo.
	 *
	 * @return the modified date of this osi services trustee individual qualificationinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the org member of this osi services trustee individual qualificationinfo.
	 *
	 * @return the org member of this osi services trustee individual qualificationinfo
	 */
	@Override
	public String getOrgMember() {
		return model.getOrgMember();
	}

	/**
	 * Returns the osi services application ID of this osi services trustee individual qualificationinfo.
	 *
	 * @return the osi services application ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the os qualification ID of this osi services trustee individual qualificationinfo.
	 *
	 * @return the os qualification ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public long getOsQualificationId() {
		return model.getOsQualificationId();
	}

	/**
	 * Returns the primary key of this osi services trustee individual qualificationinfo.
	 *
	 * @return the primary key of this osi services trustee individual qualificationinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services trustee individual qualificationinfo.
	 *
	 * @return the user ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services trustee individual qualificationinfo.
	 *
	 * @return the user name of this osi services trustee individual qualificationinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services trustee individual qualificationinfo.
	 *
	 * @return the user uuid of this osi services trustee individual qualificationinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services trustee individual qualificationinfo.
	 *
	 * @return the uuid of this osi services trustee individual qualificationinfo
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
	 * Sets the company ID of this osi services trustee individual qualificationinfo.
	 *
	 * @param companyId the company ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services trustee individual qualificationinfo.
	 *
	 * @param createDate the create date of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi services trustee individual qualificationinfo.
	 *
	 * @param groupId the group ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi services trustee individual qualificationinfo.
	 *
	 * @param modifiedDate the modified date of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the org member of this osi services trustee individual qualificationinfo.
	 *
	 * @param orgMember the org member of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setOrgMember(String orgMember) {
		model.setOrgMember(orgMember);
	}

	/**
	 * Sets the osi services application ID of this osi services trustee individual qualificationinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the os qualification ID of this osi services trustee individual qualificationinfo.
	 *
	 * @param osQualificationId the os qualification ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setOsQualificationId(long osQualificationId) {
		model.setOsQualificationId(osQualificationId);
	}

	/**
	 * Sets the primary key of this osi services trustee individual qualificationinfo.
	 *
	 * @param primaryKey the primary key of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services trustee individual qualificationinfo.
	 *
	 * @param userId the user ID of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services trustee individual qualificationinfo.
	 *
	 * @param userName the user name of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services trustee individual qualificationinfo.
	 *
	 * @param userUuid the user uuid of this osi services trustee individual qualificationinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services trustee individual qualificationinfo.
	 *
	 * @param uuid the uuid of this osi services trustee individual qualificationinfo
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
	protected OsiServicesTrusteeIndividualQualificationinfoWrapper wrap(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		return new OsiServicesTrusteeIndividualQualificationinfoWrapper(
			osiServicesTrusteeIndividualQualificationinfo);
	}

}