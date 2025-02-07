/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezZoneSubCheckInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneSubCheckInfo
 * @generated
 */
public class SezZoneSubCheckInfoWrapper
	extends BaseModelWrapper<SezZoneSubCheckInfo>
	implements ModelWrapper<SezZoneSubCheckInfo>, SezZoneSubCheckInfo {

	public SezZoneSubCheckInfoWrapper(SezZoneSubCheckInfo sezZoneSubCheckInfo) {
		super(sezZoneSubCheckInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezZoneSubCheckInfoId", getSezZoneSubCheckInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("generalRequirement", getGeneralRequirement());
		attributes.put("companyInformation", getCompanyInformation());
		attributes.put("swornState", getSwornState());
		attributes.put("occupancyRequirement", getOccupancyRequirement());
		attributes.put("approvals", getApprovals());
		attributes.put("signatureName", getSignatureName());
		attributes.put("signatureDate", getSignatureDate());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneSubCheckInfoId = (Long)attributes.get(
			"sezZoneSubCheckInfoId");

		if (sezZoneSubCheckInfoId != null) {
			setSezZoneSubCheckInfoId(sezZoneSubCheckInfoId);
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

		String generalRequirement = (String)attributes.get(
			"generalRequirement");

		if (generalRequirement != null) {
			setGeneralRequirement(generalRequirement);
		}

		String companyInformation = (String)attributes.get(
			"companyInformation");

		if (companyInformation != null) {
			setCompanyInformation(companyInformation);
		}

		String swornState = (String)attributes.get("swornState");

		if (swornState != null) {
			setSwornState(swornState);
		}

		String occupancyRequirement = (String)attributes.get(
			"occupancyRequirement");

		if (occupancyRequirement != null) {
			setOccupancyRequirement(occupancyRequirement);
		}

		String approvals = (String)attributes.get("approvals");

		if (approvals != null) {
			setApprovals(approvals);
		}

		String signatureName = (String)attributes.get("signatureName");

		if (signatureName != null) {
			setSignatureName(signatureName);
		}

		Date signatureDate = (Date)attributes.get("signatureDate");

		if (signatureDate != null) {
			setSignatureDate(signatureDate);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezZoneSubCheckInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the approvals of this sez zone sub check info.
	 *
	 * @return the approvals of this sez zone sub check info
	 */
	@Override
	public String getApprovals() {
		return model.getApprovals();
	}

	/**
	 * Returns the company ID of this sez zone sub check info.
	 *
	 * @return the company ID of this sez zone sub check info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company information of this sez zone sub check info.
	 *
	 * @return the company information of this sez zone sub check info
	 */
	@Override
	public String getCompanyInformation() {
		return model.getCompanyInformation();
	}

	/**
	 * Returns the create date of this sez zone sub check info.
	 *
	 * @return the create date of this sez zone sub check info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the general requirement of this sez zone sub check info.
	 *
	 * @return the general requirement of this sez zone sub check info
	 */
	@Override
	public String getGeneralRequirement() {
		return model.getGeneralRequirement();
	}

	/**
	 * Returns the group ID of this sez zone sub check info.
	 *
	 * @return the group ID of this sez zone sub check info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez zone sub check info.
	 *
	 * @return the modified date of this sez zone sub check info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occupancy requirement of this sez zone sub check info.
	 *
	 * @return the occupancy requirement of this sez zone sub check info
	 */
	@Override
	public String getOccupancyRequirement() {
		return model.getOccupancyRequirement();
	}

	/**
	 * Returns the primary key of this sez zone sub check info.
	 *
	 * @return the primary key of this sez zone sub check info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez zone sub check info.
	 *
	 * @return the sez status application ID of this sez zone sub check info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone sub check info ID of this sez zone sub check info.
	 *
	 * @return the sez zone sub check info ID of this sez zone sub check info
	 */
	@Override
	public long getSezZoneSubCheckInfoId() {
		return model.getSezZoneSubCheckInfoId();
	}

	/**
	 * Returns the signature date of this sez zone sub check info.
	 *
	 * @return the signature date of this sez zone sub check info
	 */
	@Override
	public Date getSignatureDate() {
		return model.getSignatureDate();
	}

	/**
	 * Returns the signature name of this sez zone sub check info.
	 *
	 * @return the signature name of this sez zone sub check info
	 */
	@Override
	public String getSignatureName() {
		return model.getSignatureName();
	}

	/**
	 * Returns the sworn state of this sez zone sub check info.
	 *
	 * @return the sworn state of this sez zone sub check info
	 */
	@Override
	public String getSwornState() {
		return model.getSwornState();
	}

	/**
	 * Returns the user ID of this sez zone sub check info.
	 *
	 * @return the user ID of this sez zone sub check info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone sub check info.
	 *
	 * @return the user name of this sez zone sub check info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone sub check info.
	 *
	 * @return the user uuid of this sez zone sub check info
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
	 * Sets the approvals of this sez zone sub check info.
	 *
	 * @param approvals the approvals of this sez zone sub check info
	 */
	@Override
	public void setApprovals(String approvals) {
		model.setApprovals(approvals);
	}

	/**
	 * Sets the company ID of this sez zone sub check info.
	 *
	 * @param companyId the company ID of this sez zone sub check info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company information of this sez zone sub check info.
	 *
	 * @param companyInformation the company information of this sez zone sub check info
	 */
	@Override
	public void setCompanyInformation(String companyInformation) {
		model.setCompanyInformation(companyInformation);
	}

	/**
	 * Sets the create date of this sez zone sub check info.
	 *
	 * @param createDate the create date of this sez zone sub check info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the general requirement of this sez zone sub check info.
	 *
	 * @param generalRequirement the general requirement of this sez zone sub check info
	 */
	@Override
	public void setGeneralRequirement(String generalRequirement) {
		model.setGeneralRequirement(generalRequirement);
	}

	/**
	 * Sets the group ID of this sez zone sub check info.
	 *
	 * @param groupId the group ID of this sez zone sub check info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez zone sub check info.
	 *
	 * @param modifiedDate the modified date of this sez zone sub check info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occupancy requirement of this sez zone sub check info.
	 *
	 * @param occupancyRequirement the occupancy requirement of this sez zone sub check info
	 */
	@Override
	public void setOccupancyRequirement(String occupancyRequirement) {
		model.setOccupancyRequirement(occupancyRequirement);
	}

	/**
	 * Sets the primary key of this sez zone sub check info.
	 *
	 * @param primaryKey the primary key of this sez zone sub check info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez zone sub check info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone sub check info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone sub check info ID of this sez zone sub check info.
	 *
	 * @param sezZoneSubCheckInfoId the sez zone sub check info ID of this sez zone sub check info
	 */
	@Override
	public void setSezZoneSubCheckInfoId(long sezZoneSubCheckInfoId) {
		model.setSezZoneSubCheckInfoId(sezZoneSubCheckInfoId);
	}

	/**
	 * Sets the signature date of this sez zone sub check info.
	 *
	 * @param signatureDate the signature date of this sez zone sub check info
	 */
	@Override
	public void setSignatureDate(Date signatureDate) {
		model.setSignatureDate(signatureDate);
	}

	/**
	 * Sets the signature name of this sez zone sub check info.
	 *
	 * @param signatureName the signature name of this sez zone sub check info
	 */
	@Override
	public void setSignatureName(String signatureName) {
		model.setSignatureName(signatureName);
	}

	/**
	 * Sets the sworn state of this sez zone sub check info.
	 *
	 * @param swornState the sworn state of this sez zone sub check info
	 */
	@Override
	public void setSwornState(String swornState) {
		model.setSwornState(swornState);
	}

	/**
	 * Sets the user ID of this sez zone sub check info.
	 *
	 * @param userId the user ID of this sez zone sub check info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone sub check info.
	 *
	 * @param userName the user name of this sez zone sub check info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone sub check info.
	 *
	 * @param userUuid the user uuid of this sez zone sub check info
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
	protected SezZoneSubCheckInfoWrapper wrap(
		SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		return new SezZoneSubCheckInfoWrapper(sezZoneSubCheckInfo);
	}

}