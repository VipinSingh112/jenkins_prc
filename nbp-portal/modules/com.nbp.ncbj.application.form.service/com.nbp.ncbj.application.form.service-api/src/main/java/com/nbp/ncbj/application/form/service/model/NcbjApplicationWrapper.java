/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplication
 * @generated
 */
public class NcbjApplicationWrapper
	extends BaseModelWrapper<NcbjApplication>
	implements ModelWrapper<NcbjApplication>, NcbjApplication {

	public NcbjApplicationWrapper(NcbjApplication ncbjApplication) {
		super(ncbjApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("typeOfCertification", getTypeOfCertification());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("typeOfServices", getTypeOfServices());
		attributes.put("subCategoryServices", getSubCategoryServices());
		attributes.put(
			"iso9001CertificationValue", getIso9001CertificationValue());
		attributes.put("numberOfSite", getNumberOfSite());
		attributes.put(
			"iso22000CertificationValue", getIso22000CertificationValue());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("transferReason", getTransferReason());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
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

		String typeOfCertification = (String)attributes.get(
			"typeOfCertification");

		if (typeOfCertification != null) {
			setTypeOfCertification(typeOfCertification);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String typeOfServices = (String)attributes.get("typeOfServices");

		if (typeOfServices != null) {
			setTypeOfServices(typeOfServices);
		}

		String subCategoryServices = (String)attributes.get(
			"subCategoryServices");

		if (subCategoryServices != null) {
			setSubCategoryServices(subCategoryServices);
		}

		String iso9001CertificationValue = (String)attributes.get(
			"iso9001CertificationValue");

		if (iso9001CertificationValue != null) {
			setIso9001CertificationValue(iso9001CertificationValue);
		}

		String numberOfSite = (String)attributes.get("numberOfSite");

		if (numberOfSite != null) {
			setNumberOfSite(numberOfSite);
		}

		String iso22000CertificationValue = (String)attributes.get(
			"iso22000CertificationValue");

		if (iso22000CertificationValue != null) {
			setIso22000CertificationValue(iso22000CertificationValue);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		String transferReason = (String)attributes.get("transferReason");

		if (transferReason != null) {
			setTransferReason(transferReason);
		}

		String expiredLicenseAppNumber = (String)attributes.get(
			"expiredLicenseAppNumber");

		if (expiredLicenseAppNumber != null) {
			setExpiredLicenseAppNumber(expiredLicenseAppNumber);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String icmDocumentsPath = (String)attributes.get("icmDocumentsPath");

		if (icmDocumentsPath != null) {
			setIcmDocumentsPath(icmDocumentsPath);
		}

		Long pdfFileEntryId = (Long)attributes.get("pdfFileEntryId");

		if (pdfFileEntryId != null) {
			setPdfFileEntryId(pdfFileEntryId);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		String appCurrentStageName = (String)attributes.get(
			"appCurrentStageName");

		if (appCurrentStageName != null) {
			setAppCurrentStageName(appCurrentStageName);
		}
	}

	@Override
	public NcbjApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this ncbj application.
	 *
	 * @return the app current stage name of this ncbj application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this ncbj application.
	 *
	 * @return the application number of this ncbj application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this ncbj application.
	 *
	 * @return the case ID of this ncbj application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this ncbj application.
	 *
	 * @return the company ID of this ncbj application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj application.
	 *
	 * @return the create date of this ncbj application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of expiration of this ncbj application.
	 *
	 * @return the date of expiration of this ncbj application
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the expired license app number of this ncbj application.
	 *
	 * @return the expired license app number of this ncbj application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this ncbj application.
	 *
	 * @return the group ID of this ncbj application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this ncbj application.
	 *
	 * @return the icm documents path of this ncbj application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the iso22000 certification value of this ncbj application.
	 *
	 * @return the iso22000 certification value of this ncbj application
	 */
	@Override
	public String getIso22000CertificationValue() {
		return model.getIso22000CertificationValue();
	}

	/**
	 * Returns the iso9001 certification value of this ncbj application.
	 *
	 * @return the iso9001 certification value of this ncbj application
	 */
	@Override
	public String getIso9001CertificationValue() {
		return model.getIso9001CertificationValue();
	}

	/**
	 * Returns the modified date of this ncbj application.
	 *
	 * @return the modified date of this ncbj application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj application.
	 *
	 * @return the ncbj application ID of this ncbj application
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the number of site of this ncbj application.
	 *
	 * @return the number of site of this ncbj application
	 */
	@Override
	public String getNumberOfSite() {
		return model.getNumberOfSite();
	}

	/**
	 * Returns the pdf file entry ID of this ncbj application.
	 *
	 * @return the pdf file entry ID of this ncbj application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this ncbj application.
	 *
	 * @return the primary key of this ncbj application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this ncbj application.
	 *
	 * @return the status of this ncbj application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the sub category services of this ncbj application.
	 *
	 * @return the sub category services of this ncbj application
	 */
	@Override
	public String getSubCategoryServices() {
		return model.getSubCategoryServices();
	}

	/**
	 * Returns the transfer reason of this ncbj application.
	 *
	 * @return the transfer reason of this ncbj application
	 */
	@Override
	public String getTransferReason() {
		return model.getTransferReason();
	}

	/**
	 * Returns the type of certification of this ncbj application.
	 *
	 * @return the type of certification of this ncbj application
	 */
	@Override
	public String getTypeOfCertification() {
		return model.getTypeOfCertification();
	}

	/**
	 * Returns the type of services of this ncbj application.
	 *
	 * @return the type of services of this ncbj application
	 */
	@Override
	public String getTypeOfServices() {
		return model.getTypeOfServices();
	}

	/**
	 * Returns the type of transaction of this ncbj application.
	 *
	 * @return the type of transaction of this ncbj application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this ncbj application.
	 *
	 * @return the user ID of this ncbj application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj application.
	 *
	 * @return the user name of this ncbj application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj application.
	 *
	 * @return the user uuid of this ncbj application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this ncbj application.
	 *
	 * @return the uuid of this ncbj application
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
	 * Sets the app current stage name of this ncbj application.
	 *
	 * @param appCurrentStageName the app current stage name of this ncbj application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this ncbj application.
	 *
	 * @param applicationNumber the application number of this ncbj application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this ncbj application.
	 *
	 * @param caseId the case ID of this ncbj application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this ncbj application.
	 *
	 * @param companyId the company ID of this ncbj application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj application.
	 *
	 * @param createDate the create date of this ncbj application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of expiration of this ncbj application.
	 *
	 * @param dateOfExpiration the date of expiration of this ncbj application
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the expired license app number of this ncbj application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this ncbj application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this ncbj application.
	 *
	 * @param groupId the group ID of this ncbj application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this ncbj application.
	 *
	 * @param icmDocumentsPath the icm documents path of this ncbj application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the iso22000 certification value of this ncbj application.
	 *
	 * @param iso22000CertificationValue the iso22000 certification value of this ncbj application
	 */
	@Override
	public void setIso22000CertificationValue(
		String iso22000CertificationValue) {

		model.setIso22000CertificationValue(iso22000CertificationValue);
	}

	/**
	 * Sets the iso9001 certification value of this ncbj application.
	 *
	 * @param iso9001CertificationValue the iso9001 certification value of this ncbj application
	 */
	@Override
	public void setIso9001CertificationValue(String iso9001CertificationValue) {
		model.setIso9001CertificationValue(iso9001CertificationValue);
	}

	/**
	 * Sets the modified date of this ncbj application.
	 *
	 * @param modifiedDate the modified date of this ncbj application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj application.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj application
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the number of site of this ncbj application.
	 *
	 * @param numberOfSite the number of site of this ncbj application
	 */
	@Override
	public void setNumberOfSite(String numberOfSite) {
		model.setNumberOfSite(numberOfSite);
	}

	/**
	 * Sets the pdf file entry ID of this ncbj application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this ncbj application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this ncbj application.
	 *
	 * @param primaryKey the primary key of this ncbj application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this ncbj application.
	 *
	 * @param status the status of this ncbj application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the sub category services of this ncbj application.
	 *
	 * @param subCategoryServices the sub category services of this ncbj application
	 */
	@Override
	public void setSubCategoryServices(String subCategoryServices) {
		model.setSubCategoryServices(subCategoryServices);
	}

	/**
	 * Sets the transfer reason of this ncbj application.
	 *
	 * @param transferReason the transfer reason of this ncbj application
	 */
	@Override
	public void setTransferReason(String transferReason) {
		model.setTransferReason(transferReason);
	}

	/**
	 * Sets the type of certification of this ncbj application.
	 *
	 * @param typeOfCertification the type of certification of this ncbj application
	 */
	@Override
	public void setTypeOfCertification(String typeOfCertification) {
		model.setTypeOfCertification(typeOfCertification);
	}

	/**
	 * Sets the type of services of this ncbj application.
	 *
	 * @param typeOfServices the type of services of this ncbj application
	 */
	@Override
	public void setTypeOfServices(String typeOfServices) {
		model.setTypeOfServices(typeOfServices);
	}

	/**
	 * Sets the type of transaction of this ncbj application.
	 *
	 * @param typeOfTransaction the type of transaction of this ncbj application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this ncbj application.
	 *
	 * @param userId the user ID of this ncbj application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj application.
	 *
	 * @param userName the user name of this ncbj application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj application.
	 *
	 * @param userUuid the user uuid of this ncbj application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this ncbj application.
	 *
	 * @param uuid the uuid of this ncbj application
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
	protected NcbjApplicationWrapper wrap(NcbjApplication ncbjApplication) {
		return new NcbjApplicationWrapper(ncbjApplication);
	}

}