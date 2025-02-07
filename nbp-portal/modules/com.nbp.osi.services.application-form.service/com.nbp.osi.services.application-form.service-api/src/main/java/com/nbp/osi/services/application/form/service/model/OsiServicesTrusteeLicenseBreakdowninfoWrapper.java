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
 * This class is a wrapper for {@link OsiServicesTrusteeLicenseBreakdowninfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeLicenseBreakdowninfo
 * @generated
 */
public class OsiServicesTrusteeLicenseBreakdowninfoWrapper
	extends BaseModelWrapper<OsiServicesTrusteeLicenseBreakdowninfo>
	implements ModelWrapper<OsiServicesTrusteeLicenseBreakdowninfo>,
			   OsiServicesTrusteeLicenseBreakdowninfo {

	public OsiServicesTrusteeLicenseBreakdowninfoWrapper(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		super(osiServicesTrusteeLicenseBreakdowninfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osiLicBreakId", getOsiLicBreakId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"indiBreakdownApplicantName", getIndiBreakdownApplicantName());
		attributes.put("indiBreakdownFirm", getIndiBreakdownFirm());
		attributes.put("indiBreakdownDated", getIndiBreakdownDated());
		attributes.put(
			"indiBreakdownTrusteeName", getIndiBreakdownTrusteeName());
		attributes.put(
			"indiBreakdownTrusteeDate", getIndiBreakdownTrusteeDate());
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

		Long osiLicBreakId = (Long)attributes.get("osiLicBreakId");

		if (osiLicBreakId != null) {
			setOsiLicBreakId(osiLicBreakId);
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

		String indiBreakdownApplicantName = (String)attributes.get(
			"indiBreakdownApplicantName");

		if (indiBreakdownApplicantName != null) {
			setIndiBreakdownApplicantName(indiBreakdownApplicantName);
		}

		String indiBreakdownFirm = (String)attributes.get("indiBreakdownFirm");

		if (indiBreakdownFirm != null) {
			setIndiBreakdownFirm(indiBreakdownFirm);
		}

		Date indiBreakdownDated = (Date)attributes.get("indiBreakdownDated");

		if (indiBreakdownDated != null) {
			setIndiBreakdownDated(indiBreakdownDated);
		}

		String indiBreakdownTrusteeName = (String)attributes.get(
			"indiBreakdownTrusteeName");

		if (indiBreakdownTrusteeName != null) {
			setIndiBreakdownTrusteeName(indiBreakdownTrusteeName);
		}

		Date indiBreakdownTrusteeDate = (Date)attributes.get(
			"indiBreakdownTrusteeDate");

		if (indiBreakdownTrusteeDate != null) {
			setIndiBreakdownTrusteeDate(indiBreakdownTrusteeDate);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi services trustee license breakdowninfo.
	 *
	 * @return the company ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services trustee license breakdowninfo.
	 *
	 * @return the create date of this osi services trustee license breakdowninfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi services trustee license breakdowninfo.
	 *
	 * @return the group ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indi breakdown applicant name of this osi services trustee license breakdowninfo.
	 *
	 * @return the indi breakdown applicant name of this osi services trustee license breakdowninfo
	 */
	@Override
	public String getIndiBreakdownApplicantName() {
		return model.getIndiBreakdownApplicantName();
	}

	/**
	 * Returns the indi breakdown dated of this osi services trustee license breakdowninfo.
	 *
	 * @return the indi breakdown dated of this osi services trustee license breakdowninfo
	 */
	@Override
	public Date getIndiBreakdownDated() {
		return model.getIndiBreakdownDated();
	}

	/**
	 * Returns the indi breakdown firm of this osi services trustee license breakdowninfo.
	 *
	 * @return the indi breakdown firm of this osi services trustee license breakdowninfo
	 */
	@Override
	public String getIndiBreakdownFirm() {
		return model.getIndiBreakdownFirm();
	}

	/**
	 * Returns the indi breakdown trustee date of this osi services trustee license breakdowninfo.
	 *
	 * @return the indi breakdown trustee date of this osi services trustee license breakdowninfo
	 */
	@Override
	public Date getIndiBreakdownTrusteeDate() {
		return model.getIndiBreakdownTrusteeDate();
	}

	/**
	 * Returns the indi breakdown trustee name of this osi services trustee license breakdowninfo.
	 *
	 * @return the indi breakdown trustee name of this osi services trustee license breakdowninfo
	 */
	@Override
	public String getIndiBreakdownTrusteeName() {
		return model.getIndiBreakdownTrusteeName();
	}

	/**
	 * Returns the modified date of this osi services trustee license breakdowninfo.
	 *
	 * @return the modified date of this osi services trustee license breakdowninfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi lic break ID of this osi services trustee license breakdowninfo.
	 *
	 * @return the osi lic break ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public long getOsiLicBreakId() {
		return model.getOsiLicBreakId();
	}

	/**
	 * Returns the osi services application ID of this osi services trustee license breakdowninfo.
	 *
	 * @return the osi services application ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the primary key of this osi services trustee license breakdowninfo.
	 *
	 * @return the primary key of this osi services trustee license breakdowninfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services trustee license breakdowninfo.
	 *
	 * @return the user ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services trustee license breakdowninfo.
	 *
	 * @return the user name of this osi services trustee license breakdowninfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services trustee license breakdowninfo.
	 *
	 * @return the user uuid of this osi services trustee license breakdowninfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services trustee license breakdowninfo.
	 *
	 * @return the uuid of this osi services trustee license breakdowninfo
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
	 * Sets the company ID of this osi services trustee license breakdowninfo.
	 *
	 * @param companyId the company ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services trustee license breakdowninfo.
	 *
	 * @param createDate the create date of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi services trustee license breakdowninfo.
	 *
	 * @param groupId the group ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indi breakdown applicant name of this osi services trustee license breakdowninfo.
	 *
	 * @param indiBreakdownApplicantName the indi breakdown applicant name of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setIndiBreakdownApplicantName(
		String indiBreakdownApplicantName) {

		model.setIndiBreakdownApplicantName(indiBreakdownApplicantName);
	}

	/**
	 * Sets the indi breakdown dated of this osi services trustee license breakdowninfo.
	 *
	 * @param indiBreakdownDated the indi breakdown dated of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setIndiBreakdownDated(Date indiBreakdownDated) {
		model.setIndiBreakdownDated(indiBreakdownDated);
	}

	/**
	 * Sets the indi breakdown firm of this osi services trustee license breakdowninfo.
	 *
	 * @param indiBreakdownFirm the indi breakdown firm of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setIndiBreakdownFirm(String indiBreakdownFirm) {
		model.setIndiBreakdownFirm(indiBreakdownFirm);
	}

	/**
	 * Sets the indi breakdown trustee date of this osi services trustee license breakdowninfo.
	 *
	 * @param indiBreakdownTrusteeDate the indi breakdown trustee date of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setIndiBreakdownTrusteeDate(Date indiBreakdownTrusteeDate) {
		model.setIndiBreakdownTrusteeDate(indiBreakdownTrusteeDate);
	}

	/**
	 * Sets the indi breakdown trustee name of this osi services trustee license breakdowninfo.
	 *
	 * @param indiBreakdownTrusteeName the indi breakdown trustee name of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setIndiBreakdownTrusteeName(String indiBreakdownTrusteeName) {
		model.setIndiBreakdownTrusteeName(indiBreakdownTrusteeName);
	}

	/**
	 * Sets the modified date of this osi services trustee license breakdowninfo.
	 *
	 * @param modifiedDate the modified date of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi lic break ID of this osi services trustee license breakdowninfo.
	 *
	 * @param osiLicBreakId the osi lic break ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setOsiLicBreakId(long osiLicBreakId) {
		model.setOsiLicBreakId(osiLicBreakId);
	}

	/**
	 * Sets the osi services application ID of this osi services trustee license breakdowninfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the primary key of this osi services trustee license breakdowninfo.
	 *
	 * @param primaryKey the primary key of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services trustee license breakdowninfo.
	 *
	 * @param userId the user ID of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services trustee license breakdowninfo.
	 *
	 * @param userName the user name of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services trustee license breakdowninfo.
	 *
	 * @param userUuid the user uuid of this osi services trustee license breakdowninfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services trustee license breakdowninfo.
	 *
	 * @param uuid the uuid of this osi services trustee license breakdowninfo
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
	protected OsiServicesTrusteeLicenseBreakdowninfoWrapper wrap(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		return new OsiServicesTrusteeLicenseBreakdowninfoWrapper(
			osiServicesTrusteeLicenseBreakdowninfo);
	}

}