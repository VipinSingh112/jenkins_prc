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
 * This class is a wrapper for {@link OsiServicesGeneralBenefitOfCreditorsinfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesGeneralBenefitOfCreditorsinfo
 * @generated
 */
public class OsiServicesGeneralBenefitOfCreditorsinfoWrapper
	extends BaseModelWrapper<OsiServicesGeneralBenefitOfCreditorsinfo>
	implements ModelWrapper<OsiServicesGeneralBenefitOfCreditorsinfo>,
			   OsiServicesGeneralBenefitOfCreditorsinfo {

	public OsiServicesGeneralBenefitOfCreditorsinfoWrapper(
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo) {

		super(osiServicesGeneralBenefitOfCreditorsinfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osiBOCInsoId", getOsiBOCInsoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("creditorName", getCreditorName());
		attributes.put("creditorDate", getCreditorDate());
		attributes.put("creditorAddress", getCreditorAddress());
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

		Long osiBOCInsoId = (Long)attributes.get("osiBOCInsoId");

		if (osiBOCInsoId != null) {
			setOsiBOCInsoId(osiBOCInsoId);
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

		String creditorName = (String)attributes.get("creditorName");

		if (creditorName != null) {
			setCreditorName(creditorName);
		}

		Date creditorDate = (Date)attributes.get("creditorDate");

		if (creditorDate != null) {
			setCreditorDate(creditorDate);
		}

		String creditorAddress = (String)attributes.get("creditorAddress");

		if (creditorAddress != null) {
			setCreditorAddress(creditorAddress);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi services general benefit of creditorsinfo.
	 *
	 * @return the company ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services general benefit of creditorsinfo.
	 *
	 * @return the create date of this osi services general benefit of creditorsinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creditor address of this osi services general benefit of creditorsinfo.
	 *
	 * @return the creditor address of this osi services general benefit of creditorsinfo
	 */
	@Override
	public String getCreditorAddress() {
		return model.getCreditorAddress();
	}

	/**
	 * Returns the creditor date of this osi services general benefit of creditorsinfo.
	 *
	 * @return the creditor date of this osi services general benefit of creditorsinfo
	 */
	@Override
	public Date getCreditorDate() {
		return model.getCreditorDate();
	}

	/**
	 * Returns the creditor name of this osi services general benefit of creditorsinfo.
	 *
	 * @return the creditor name of this osi services general benefit of creditorsinfo
	 */
	@Override
	public String getCreditorName() {
		return model.getCreditorName();
	}

	/**
	 * Returns the group ID of this osi services general benefit of creditorsinfo.
	 *
	 * @return the group ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi services general benefit of creditorsinfo.
	 *
	 * @return the modified date of this osi services general benefit of creditorsinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi boc inso ID of this osi services general benefit of creditorsinfo.
	 *
	 * @return the osi boc inso ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public long getOsiBOCInsoId() {
		return model.getOsiBOCInsoId();
	}

	/**
	 * Returns the osi services application ID of this osi services general benefit of creditorsinfo.
	 *
	 * @return the osi services application ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the primary key of this osi services general benefit of creditorsinfo.
	 *
	 * @return the primary key of this osi services general benefit of creditorsinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services general benefit of creditorsinfo.
	 *
	 * @return the user ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services general benefit of creditorsinfo.
	 *
	 * @return the user name of this osi services general benefit of creditorsinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services general benefit of creditorsinfo.
	 *
	 * @return the user uuid of this osi services general benefit of creditorsinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services general benefit of creditorsinfo.
	 *
	 * @return the uuid of this osi services general benefit of creditorsinfo
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
	 * Sets the company ID of this osi services general benefit of creditorsinfo.
	 *
	 * @param companyId the company ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services general benefit of creditorsinfo.
	 *
	 * @param createDate the create date of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creditor address of this osi services general benefit of creditorsinfo.
	 *
	 * @param creditorAddress the creditor address of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setCreditorAddress(String creditorAddress) {
		model.setCreditorAddress(creditorAddress);
	}

	/**
	 * Sets the creditor date of this osi services general benefit of creditorsinfo.
	 *
	 * @param creditorDate the creditor date of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setCreditorDate(Date creditorDate) {
		model.setCreditorDate(creditorDate);
	}

	/**
	 * Sets the creditor name of this osi services general benefit of creditorsinfo.
	 *
	 * @param creditorName the creditor name of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setCreditorName(String creditorName) {
		model.setCreditorName(creditorName);
	}

	/**
	 * Sets the group ID of this osi services general benefit of creditorsinfo.
	 *
	 * @param groupId the group ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi services general benefit of creditorsinfo.
	 *
	 * @param modifiedDate the modified date of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi boc inso ID of this osi services general benefit of creditorsinfo.
	 *
	 * @param osiBOCInsoId the osi boc inso ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setOsiBOCInsoId(long osiBOCInsoId) {
		model.setOsiBOCInsoId(osiBOCInsoId);
	}

	/**
	 * Sets the osi services application ID of this osi services general benefit of creditorsinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the primary key of this osi services general benefit of creditorsinfo.
	 *
	 * @param primaryKey the primary key of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services general benefit of creditorsinfo.
	 *
	 * @param userId the user ID of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services general benefit of creditorsinfo.
	 *
	 * @param userName the user name of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services general benefit of creditorsinfo.
	 *
	 * @param userUuid the user uuid of this osi services general benefit of creditorsinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services general benefit of creditorsinfo.
	 *
	 * @param uuid the uuid of this osi services general benefit of creditorsinfo
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
	protected OsiServicesGeneralBenefitOfCreditorsinfoWrapper wrap(
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo) {

		return new OsiServicesGeneralBenefitOfCreditorsinfoWrapper(
			osiServicesGeneralBenefitOfCreditorsinfo);
	}

}