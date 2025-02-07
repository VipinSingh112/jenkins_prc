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
 * This class is a wrapper for {@link OsiServicesTrusteeDeclerationAndSignatureinfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeDeclerationAndSignatureinfo
 * @generated
 */
public class OsiServicesTrusteeDeclerationAndSignatureinfoWrapper
	extends BaseModelWrapper<OsiServicesTrusteeDeclerationAndSignatureinfo>
	implements ModelWrapper<OsiServicesTrusteeDeclerationAndSignatureinfo>,
			   OsiServicesTrusteeDeclerationAndSignatureinfo {

	public OsiServicesTrusteeDeclerationAndSignatureinfoWrapper(
		OsiServicesTrusteeDeclerationAndSignatureinfo
			osiServicesTrusteeDeclerationAndSignatureinfo) {

		super(osiServicesTrusteeDeclerationAndSignatureinfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osiDeclerationId", getOsiDeclerationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"indiUndersignedApplicantName", getIndiUndersignedApplicantName());
		attributes.put("indiUndersignedDated", getIndiUndersignedDated());
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

		Long osiDeclerationId = (Long)attributes.get("osiDeclerationId");

		if (osiDeclerationId != null) {
			setOsiDeclerationId(osiDeclerationId);
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

		String indiUndersignedApplicantName = (String)attributes.get(
			"indiUndersignedApplicantName");

		if (indiUndersignedApplicantName != null) {
			setIndiUndersignedApplicantName(indiUndersignedApplicantName);
		}

		Date indiUndersignedDated = (Date)attributes.get(
			"indiUndersignedDated");

		if (indiUndersignedDated != null) {
			setIndiUndersignedDated(indiUndersignedDated);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesTrusteeDeclerationAndSignatureinfo
		cloneWithOriginalValues() {

		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the company ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the create date of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the group ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indi undersigned applicant name of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the indi undersigned applicant name of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public String getIndiUndersignedApplicantName() {
		return model.getIndiUndersignedApplicantName();
	}

	/**
	 * Returns the indi undersigned dated of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the indi undersigned dated of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public Date getIndiUndersignedDated() {
		return model.getIndiUndersignedDated();
	}

	/**
	 * Returns the modified date of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the modified date of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi decleration ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the osi decleration ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getOsiDeclerationId() {
		return model.getOsiDeclerationId();
	}

	/**
	 * Returns the osi services application ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the osi services application ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the primary key of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the primary key of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the user ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the user name of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the user uuid of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the uuid of this osi services trustee decleration and signatureinfo
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
	 * Sets the company ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param companyId the company ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services trustee decleration and signatureinfo.
	 *
	 * @param createDate the create date of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param groupId the group ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indi undersigned applicant name of this osi services trustee decleration and signatureinfo.
	 *
	 * @param indiUndersignedApplicantName the indi undersigned applicant name of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setIndiUndersignedApplicantName(
		String indiUndersignedApplicantName) {

		model.setIndiUndersignedApplicantName(indiUndersignedApplicantName);
	}

	/**
	 * Sets the indi undersigned dated of this osi services trustee decleration and signatureinfo.
	 *
	 * @param indiUndersignedDated the indi undersigned dated of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setIndiUndersignedDated(Date indiUndersignedDated) {
		model.setIndiUndersignedDated(indiUndersignedDated);
	}

	/**
	 * Sets the modified date of this osi services trustee decleration and signatureinfo.
	 *
	 * @param modifiedDate the modified date of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi decleration ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param osiDeclerationId the osi decleration ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setOsiDeclerationId(long osiDeclerationId) {
		model.setOsiDeclerationId(osiDeclerationId);
	}

	/**
	 * Sets the osi services application ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the primary key of this osi services trustee decleration and signatureinfo.
	 *
	 * @param primaryKey the primary key of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param userId the user ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services trustee decleration and signatureinfo.
	 *
	 * @param userName the user name of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services trustee decleration and signatureinfo.
	 *
	 * @param userUuid the user uuid of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services trustee decleration and signatureinfo.
	 *
	 * @param uuid the uuid of this osi services trustee decleration and signatureinfo
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
	protected OsiServicesTrusteeDeclerationAndSignatureinfoWrapper wrap(
		OsiServicesTrusteeDeclerationAndSignatureinfo
			osiServicesTrusteeDeclerationAndSignatureinfo) {

		return new OsiServicesTrusteeDeclerationAndSignatureinfoWrapper(
			osiServicesTrusteeDeclerationAndSignatureinfo);
	}

}