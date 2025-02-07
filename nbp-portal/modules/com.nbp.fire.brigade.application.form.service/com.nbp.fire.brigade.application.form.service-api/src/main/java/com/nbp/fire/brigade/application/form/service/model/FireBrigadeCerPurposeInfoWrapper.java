/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FireBrigadeCerPurposeInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCerPurposeInfo
 * @generated
 */
public class FireBrigadeCerPurposeInfoWrapper
	extends BaseModelWrapper<FireBrigadeCerPurposeInfo>
	implements FireBrigadeCerPurposeInfo,
			   ModelWrapper<FireBrigadeCerPurposeInfo> {

	public FireBrigadeCerPurposeInfoWrapper(
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		super(fireBrigadeCerPurposeInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fireBrigadeCerPurposeInfoId", getFireBrigadeCerPurposeInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("certificatePurposePre", getCertificatePurposePre());
		attributes.put("otherCertificatePurpose", getOtherCertificatePurpose());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadeCerPurposeInfoId = (Long)attributes.get(
			"fireBrigadeCerPurposeInfoId");

		if (fireBrigadeCerPurposeInfoId != null) {
			setFireBrigadeCerPurposeInfoId(fireBrigadeCerPurposeInfoId);
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

		String certificatePurposePre = (String)attributes.get(
			"certificatePurposePre");

		if (certificatePurposePre != null) {
			setCertificatePurposePre(certificatePurposePre);
		}

		String otherCertificatePurpose = (String)attributes.get(
			"otherCertificatePurpose");

		if (otherCertificatePurpose != null) {
			setOtherCertificatePurpose(otherCertificatePurpose);
		}

		Long fireBrigadeApplicationId = (Long)attributes.get(
			"fireBrigadeApplicationId");

		if (fireBrigadeApplicationId != null) {
			setFireBrigadeApplicationId(fireBrigadeApplicationId);
		}
	}

	@Override
	public FireBrigadeCerPurposeInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the certificate purpose pre of this fire brigade cer purpose info.
	 *
	 * @return the certificate purpose pre of this fire brigade cer purpose info
	 */
	@Override
	public String getCertificatePurposePre() {
		return model.getCertificatePurposePre();
	}

	/**
	 * Returns the company ID of this fire brigade cer purpose info.
	 *
	 * @return the company ID of this fire brigade cer purpose info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade cer purpose info.
	 *
	 * @return the create date of this fire brigade cer purpose info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade cer purpose info.
	 *
	 * @return the fire brigade application ID of this fire brigade cer purpose info
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the fire brigade cer purpose info ID of this fire brigade cer purpose info.
	 *
	 * @return the fire brigade cer purpose info ID of this fire brigade cer purpose info
	 */
	@Override
	public long getFireBrigadeCerPurposeInfoId() {
		return model.getFireBrigadeCerPurposeInfoId();
	}

	/**
	 * Returns the group ID of this fire brigade cer purpose info.
	 *
	 * @return the group ID of this fire brigade cer purpose info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this fire brigade cer purpose info.
	 *
	 * @return the modified date of this fire brigade cer purpose info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other certificate purpose of this fire brigade cer purpose info.
	 *
	 * @return the other certificate purpose of this fire brigade cer purpose info
	 */
	@Override
	public String getOtherCertificatePurpose() {
		return model.getOtherCertificatePurpose();
	}

	/**
	 * Returns the primary key of this fire brigade cer purpose info.
	 *
	 * @return the primary key of this fire brigade cer purpose info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fire brigade cer purpose info.
	 *
	 * @return the user ID of this fire brigade cer purpose info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade cer purpose info.
	 *
	 * @return the user name of this fire brigade cer purpose info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade cer purpose info.
	 *
	 * @return the user uuid of this fire brigade cer purpose info
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
	 * Sets the certificate purpose pre of this fire brigade cer purpose info.
	 *
	 * @param certificatePurposePre the certificate purpose pre of this fire brigade cer purpose info
	 */
	@Override
	public void setCertificatePurposePre(String certificatePurposePre) {
		model.setCertificatePurposePre(certificatePurposePre);
	}

	/**
	 * Sets the company ID of this fire brigade cer purpose info.
	 *
	 * @param companyId the company ID of this fire brigade cer purpose info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade cer purpose info.
	 *
	 * @param createDate the create date of this fire brigade cer purpose info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade cer purpose info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade cer purpose info
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the fire brigade cer purpose info ID of this fire brigade cer purpose info.
	 *
	 * @param fireBrigadeCerPurposeInfoId the fire brigade cer purpose info ID of this fire brigade cer purpose info
	 */
	@Override
	public void setFireBrigadeCerPurposeInfoId(
		long fireBrigadeCerPurposeInfoId) {

		model.setFireBrigadeCerPurposeInfoId(fireBrigadeCerPurposeInfoId);
	}

	/**
	 * Sets the group ID of this fire brigade cer purpose info.
	 *
	 * @param groupId the group ID of this fire brigade cer purpose info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this fire brigade cer purpose info.
	 *
	 * @param modifiedDate the modified date of this fire brigade cer purpose info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other certificate purpose of this fire brigade cer purpose info.
	 *
	 * @param otherCertificatePurpose the other certificate purpose of this fire brigade cer purpose info
	 */
	@Override
	public void setOtherCertificatePurpose(String otherCertificatePurpose) {
		model.setOtherCertificatePurpose(otherCertificatePurpose);
	}

	/**
	 * Sets the primary key of this fire brigade cer purpose info.
	 *
	 * @param primaryKey the primary key of this fire brigade cer purpose info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fire brigade cer purpose info.
	 *
	 * @param userId the user ID of this fire brigade cer purpose info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade cer purpose info.
	 *
	 * @param userName the user name of this fire brigade cer purpose info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade cer purpose info.
	 *
	 * @param userUuid the user uuid of this fire brigade cer purpose info
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
	protected FireBrigadeCerPurposeInfoWrapper wrap(
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		return new FireBrigadeCerPurposeInfoWrapper(fireBrigadeCerPurposeInfo);
	}

}