/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FarmerApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplication
 * @generated
 */
public class FarmerApplicationWrapper
	extends BaseModelWrapper<FarmerApplication>
	implements FarmerApplication, ModelWrapper<FarmerApplication> {

	public FarmerApplicationWrapper(FarmerApplication farmerApplication) {
		super(farmerApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("farmerApplicationId", getFarmerApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestType", getRequestType());
		attributes.put("perishLocal", getPerishLocal());
		attributes.put("farmType", getFarmType());
		attributes.put("farmParishLocal", getFarmParishLocal());
		attributes.put("entityId", getEntityId());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("expiredLicenseappNumber", getExpiredLicenseappNumber());
		attributes.put("caseld", getCaseld());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("PdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long farmerApplicationId = (Long)attributes.get("farmerApplicationId");

		if (farmerApplicationId != null) {
			setFarmerApplicationId(farmerApplicationId);
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

		String requestType = (String)attributes.get("requestType");

		if (requestType != null) {
			setRequestType(requestType);
		}

		String perishLocal = (String)attributes.get("perishLocal");

		if (perishLocal != null) {
			setPerishLocal(perishLocal);
		}

		String farmType = (String)attributes.get("farmType");

		if (farmType != null) {
			setFarmType(farmType);
		}

		String farmParishLocal = (String)attributes.get("farmParishLocal");

		if (farmParishLocal != null) {
			setFarmParishLocal(farmParishLocal);
		}

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		String expiredLicenseappNumber = (String)attributes.get(
			"expiredLicenseappNumber");

		if (expiredLicenseappNumber != null) {
			setExpiredLicenseappNumber(expiredLicenseappNumber);
		}

		String caseld = (String)attributes.get("caseld");

		if (caseld != null) {
			setCaseld(caseld);
		}

		String icmDocumentsPath = (String)attributes.get("icmDocumentsPath");

		if (icmDocumentsPath != null) {
			setIcmDocumentsPath(icmDocumentsPath);
		}

		Long PdfFileEntryId = (Long)attributes.get("PdfFileEntryId");

		if (PdfFileEntryId != null) {
			setPdfFileEntryId(PdfFileEntryId);
		}

		String appCurrentStageName = (String)attributes.get(
			"appCurrentStageName");

		if (appCurrentStageName != null) {
			setAppCurrentStageName(appCurrentStageName);
		}
	}

	@Override
	public FarmerApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this farmer application.
	 *
	 * @return the app current stage name of this farmer application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this farmer application.
	 *
	 * @return the application number of this farmer application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the caseld of this farmer application.
	 *
	 * @return the caseld of this farmer application
	 */
	@Override
	public String getCaseld() {
		return model.getCaseld();
	}

	/**
	 * Returns the company ID of this farmer application.
	 *
	 * @return the company ID of this farmer application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this farmer application.
	 *
	 * @return the create date of this farmer application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this farmer application.
	 *
	 * @return the entity ID of this farmer application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired licenseapp number of this farmer application.
	 *
	 * @return the expired licenseapp number of this farmer application
	 */
	@Override
	public String getExpiredLicenseappNumber() {
		return model.getExpiredLicenseappNumber();
	}

	/**
	 * Returns the farmer application ID of this farmer application.
	 *
	 * @return the farmer application ID of this farmer application
	 */
	@Override
	public long getFarmerApplicationId() {
		return model.getFarmerApplicationId();
	}

	/**
	 * Returns the farm parish local of this farmer application.
	 *
	 * @return the farm parish local of this farmer application
	 */
	@Override
	public String getFarmParishLocal() {
		return model.getFarmParishLocal();
	}

	/**
	 * Returns the farm type of this farmer application.
	 *
	 * @return the farm type of this farmer application
	 */
	@Override
	public String getFarmType() {
		return model.getFarmType();
	}

	/**
	 * Returns the group ID of this farmer application.
	 *
	 * @return the group ID of this farmer application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this farmer application.
	 *
	 * @return the icm documents path of this farmer application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the modified date of this farmer application.
	 *
	 * @return the modified date of this farmer application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this farmer application.
	 *
	 * @return the pdf file entry ID of this farmer application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the perish local of this farmer application.
	 *
	 * @return the perish local of this farmer application
	 */
	@Override
	public String getPerishLocal() {
		return model.getPerishLocal();
	}

	/**
	 * Returns the primary key of this farmer application.
	 *
	 * @return the primary key of this farmer application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the request type of this farmer application.
	 *
	 * @return the request type of this farmer application
	 */
	@Override
	public String getRequestType() {
		return model.getRequestType();
	}

	/**
	 * Returns the status of this farmer application.
	 *
	 * @return the status of this farmer application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this farmer application.
	 *
	 * @return the user ID of this farmer application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this farmer application.
	 *
	 * @return the user name of this farmer application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this farmer application.
	 *
	 * @return the user uuid of this farmer application
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
	 * Sets the app current stage name of this farmer application.
	 *
	 * @param appCurrentStageName the app current stage name of this farmer application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this farmer application.
	 *
	 * @param applicationNumber the application number of this farmer application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the caseld of this farmer application.
	 *
	 * @param caseld the caseld of this farmer application
	 */
	@Override
	public void setCaseld(String caseld) {
		model.setCaseld(caseld);
	}

	/**
	 * Sets the company ID of this farmer application.
	 *
	 * @param companyId the company ID of this farmer application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this farmer application.
	 *
	 * @param createDate the create date of this farmer application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this farmer application.
	 *
	 * @param entityId the entity ID of this farmer application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired licenseapp number of this farmer application.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number of this farmer application
	 */
	@Override
	public void setExpiredLicenseappNumber(String expiredLicenseappNumber) {
		model.setExpiredLicenseappNumber(expiredLicenseappNumber);
	}

	/**
	 * Sets the farmer application ID of this farmer application.
	 *
	 * @param farmerApplicationId the farmer application ID of this farmer application
	 */
	@Override
	public void setFarmerApplicationId(long farmerApplicationId) {
		model.setFarmerApplicationId(farmerApplicationId);
	}

	/**
	 * Sets the farm parish local of this farmer application.
	 *
	 * @param farmParishLocal the farm parish local of this farmer application
	 */
	@Override
	public void setFarmParishLocal(String farmParishLocal) {
		model.setFarmParishLocal(farmParishLocal);
	}

	/**
	 * Sets the farm type of this farmer application.
	 *
	 * @param farmType the farm type of this farmer application
	 */
	@Override
	public void setFarmType(String farmType) {
		model.setFarmType(farmType);
	}

	/**
	 * Sets the group ID of this farmer application.
	 *
	 * @param groupId the group ID of this farmer application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this farmer application.
	 *
	 * @param icmDocumentsPath the icm documents path of this farmer application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the modified date of this farmer application.
	 *
	 * @param modifiedDate the modified date of this farmer application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this farmer application.
	 *
	 * @param PdfFileEntryId the pdf file entry ID of this farmer application
	 */
	@Override
	public void setPdfFileEntryId(long PdfFileEntryId) {
		model.setPdfFileEntryId(PdfFileEntryId);
	}

	/**
	 * Sets the perish local of this farmer application.
	 *
	 * @param perishLocal the perish local of this farmer application
	 */
	@Override
	public void setPerishLocal(String perishLocal) {
		model.setPerishLocal(perishLocal);
	}

	/**
	 * Sets the primary key of this farmer application.
	 *
	 * @param primaryKey the primary key of this farmer application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the request type of this farmer application.
	 *
	 * @param requestType the request type of this farmer application
	 */
	@Override
	public void setRequestType(String requestType) {
		model.setRequestType(requestType);
	}

	/**
	 * Sets the status of this farmer application.
	 *
	 * @param status the status of this farmer application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this farmer application.
	 *
	 * @param userId the user ID of this farmer application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this farmer application.
	 *
	 * @param userName the user name of this farmer application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this farmer application.
	 *
	 * @param userUuid the user uuid of this farmer application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected FarmerApplicationWrapper wrap(
		FarmerApplication farmerApplication) {

		return new FarmerApplicationWrapper(farmerApplication);
	}

}