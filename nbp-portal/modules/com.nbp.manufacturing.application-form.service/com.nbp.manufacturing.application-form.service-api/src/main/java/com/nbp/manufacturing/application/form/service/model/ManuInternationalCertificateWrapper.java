/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManuInternationalCertificate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuInternationalCertificate
 * @generated
 */
public class ManuInternationalCertificateWrapper
	extends BaseModelWrapper<ManuInternationalCertificate>
	implements ManuInternationalCertificate,
			   ModelWrapper<ManuInternationalCertificate> {

	public ManuInternationalCertificateWrapper(
		ManuInternationalCertificate manuInternationalCertificate) {

		super(manuInternationalCertificate);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"manuInternationalCertificateId",
			getManuInternationalCertificateId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyCertified", getCompanyCertified());
		attributes.put("other", getOther());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manuInternationalCertificateId = (Long)attributes.get(
			"manuInternationalCertificateId");

		if (manuInternationalCertificateId != null) {
			setManuInternationalCertificateId(manuInternationalCertificateId);
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

		String companyCertified = (String)attributes.get("companyCertified");

		if (companyCertified != null) {
			setCompanyCertified(companyCertified);
		}

		String other = (String)attributes.get("other");

		if (other != null) {
			setOther(other);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}
	}

	@Override
	public ManuInternationalCertificate cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company certified of this manu international certificate.
	 *
	 * @return the company certified of this manu international certificate
	 */
	@Override
	public String getCompanyCertified() {
		return model.getCompanyCertified();
	}

	/**
	 * Returns the company ID of this manu international certificate.
	 *
	 * @return the company ID of this manu international certificate
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this manu international certificate.
	 *
	 * @return the create date of this manu international certificate
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this manu international certificate.
	 *
	 * @return the group ID of this manu international certificate
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manufacturing application ID of this manu international certificate.
	 *
	 * @return the manufacturing application ID of this manu international certificate
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the manu international certificate ID of this manu international certificate.
	 *
	 * @return the manu international certificate ID of this manu international certificate
	 */
	@Override
	public long getManuInternationalCertificateId() {
		return model.getManuInternationalCertificateId();
	}

	/**
	 * Returns the modified date of this manu international certificate.
	 *
	 * @return the modified date of this manu international certificate
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other of this manu international certificate.
	 *
	 * @return the other of this manu international certificate
	 */
	@Override
	public String getOther() {
		return model.getOther();
	}

	/**
	 * Returns the primary key of this manu international certificate.
	 *
	 * @return the primary key of this manu international certificate
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this manu international certificate.
	 *
	 * @return the user ID of this manu international certificate
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manu international certificate.
	 *
	 * @return the user name of this manu international certificate
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manu international certificate.
	 *
	 * @return the user uuid of this manu international certificate
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
	 * Sets the company certified of this manu international certificate.
	 *
	 * @param companyCertified the company certified of this manu international certificate
	 */
	@Override
	public void setCompanyCertified(String companyCertified) {
		model.setCompanyCertified(companyCertified);
	}

	/**
	 * Sets the company ID of this manu international certificate.
	 *
	 * @param companyId the company ID of this manu international certificate
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this manu international certificate.
	 *
	 * @param createDate the create date of this manu international certificate
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this manu international certificate.
	 *
	 * @param groupId the group ID of this manu international certificate
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manufacturing application ID of this manu international certificate.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu international certificate
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the manu international certificate ID of this manu international certificate.
	 *
	 * @param manuInternationalCertificateId the manu international certificate ID of this manu international certificate
	 */
	@Override
	public void setManuInternationalCertificateId(
		long manuInternationalCertificateId) {

		model.setManuInternationalCertificateId(manuInternationalCertificateId);
	}

	/**
	 * Sets the modified date of this manu international certificate.
	 *
	 * @param modifiedDate the modified date of this manu international certificate
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other of this manu international certificate.
	 *
	 * @param other the other of this manu international certificate
	 */
	@Override
	public void setOther(String other) {
		model.setOther(other);
	}

	/**
	 * Sets the primary key of this manu international certificate.
	 *
	 * @param primaryKey the primary key of this manu international certificate
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this manu international certificate.
	 *
	 * @param userId the user ID of this manu international certificate
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manu international certificate.
	 *
	 * @param userName the user name of this manu international certificate
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manu international certificate.
	 *
	 * @param userUuid the user uuid of this manu international certificate
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
	protected ManuInternationalCertificateWrapper wrap(
		ManuInternationalCertificate manuInternationalCertificate) {

		return new ManuInternationalCertificateWrapper(
			manuInternationalCertificate);
	}

}