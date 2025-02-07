/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PharmaApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplication
 * @generated
 */
public class PharmaApplicationWrapper
	extends BaseModelWrapper<PharmaApplication>
	implements ModelWrapper<PharmaApplication>, PharmaApplication {

	public PharmaApplicationWrapper(PharmaApplication pharmaApplication) {
		super(pharmaApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pharmaApplicationId", getPharmaApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("entityId", getEntityId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requesttype", getRequesttype());
		attributes.put("typeOfPharmaProduct", getTypeOfPharmaProduct());
		attributes.put("typeOfPharmaDrug", getTypeOfPharmaDrug());
		attributes.put("secondaryCategory", getSecondaryCategory());
		attributes.put("typeOfProduct", getTypeOfProduct());
		attributes.put("subCategoryFirstField", getSubCategoryFirstField());
		attributes.put("subCategorySecondField", getSubCategorySecondField());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("caseld", getCaseld());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaApplicationId = (Long)attributes.get("pharmaApplicationId");

		if (pharmaApplicationId != null) {
			setPharmaApplicationId(pharmaApplicationId);
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

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String requesttype = (String)attributes.get("requesttype");

		if (requesttype != null) {
			setRequesttype(requesttype);
		}

		String typeOfPharmaProduct = (String)attributes.get(
			"typeOfPharmaProduct");

		if (typeOfPharmaProduct != null) {
			setTypeOfPharmaProduct(typeOfPharmaProduct);
		}

		String typeOfPharmaDrug = (String)attributes.get("typeOfPharmaDrug");

		if (typeOfPharmaDrug != null) {
			setTypeOfPharmaDrug(typeOfPharmaDrug);
		}

		String secondaryCategory = (String)attributes.get("secondaryCategory");

		if (secondaryCategory != null) {
			setSecondaryCategory(secondaryCategory);
		}

		String typeOfProduct = (String)attributes.get("typeOfProduct");

		if (typeOfProduct != null) {
			setTypeOfProduct(typeOfProduct);
		}

		String subCategoryFirstField = (String)attributes.get(
			"subCategoryFirstField");

		if (subCategoryFirstField != null) {
			setSubCategoryFirstField(subCategoryFirstField);
		}

		String subCategorySecondField = (String)attributes.get(
			"subCategorySecondField");

		if (subCategorySecondField != null) {
			setSubCategorySecondField(subCategorySecondField);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		String caseld = (String)attributes.get("caseld");

		if (caseld != null) {
			setCaseld(caseld);
		}

		String icmDocumentsPath = (String)attributes.get("icmDocumentsPath");

		if (icmDocumentsPath != null) {
			setIcmDocumentsPath(icmDocumentsPath);
		}

		Long pdfFileEntryId = (Long)attributes.get("pdfFileEntryId");

		if (pdfFileEntryId != null) {
			setPdfFileEntryId(pdfFileEntryId);
		}

		String expiredLicenseAppNumber = (String)attributes.get(
			"expiredLicenseAppNumber");

		if (expiredLicenseAppNumber != null) {
			setExpiredLicenseAppNumber(expiredLicenseAppNumber);
		}

		String appCurrentStageName = (String)attributes.get(
			"appCurrentStageName");

		if (appCurrentStageName != null) {
			setAppCurrentStageName(appCurrentStageName);
		}
	}

	@Override
	public PharmaApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this pharma application.
	 *
	 * @return the app current stage name of this pharma application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this pharma application.
	 *
	 * @return the application number of this pharma application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the caseld of this pharma application.
	 *
	 * @return the caseld of this pharma application
	 */
	@Override
	public String getCaseld() {
		return model.getCaseld();
	}

	/**
	 * Returns the company ID of this pharma application.
	 *
	 * @return the company ID of this pharma application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this pharma application.
	 *
	 * @return the create date of this pharma application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this pharma application.
	 *
	 * @return the entity ID of this pharma application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this pharma application.
	 *
	 * @return the expired license app number of this pharma application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this pharma application.
	 *
	 * @return the group ID of this pharma application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this pharma application.
	 *
	 * @return the icm documents path of this pharma application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the modified date of this pharma application.
	 *
	 * @return the modified date of this pharma application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pdf file entry ID of this pharma application.
	 *
	 * @return the pdf file entry ID of this pharma application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the pharma application ID of this pharma application.
	 *
	 * @return the pharma application ID of this pharma application
	 */
	@Override
	public long getPharmaApplicationId() {
		return model.getPharmaApplicationId();
	}

	/**
	 * Returns the primary key of this pharma application.
	 *
	 * @return the primary key of this pharma application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the requesttype of this pharma application.
	 *
	 * @return the requesttype of this pharma application
	 */
	@Override
	public String getRequesttype() {
		return model.getRequesttype();
	}

	/**
	 * Returns the secondary category of this pharma application.
	 *
	 * @return the secondary category of this pharma application
	 */
	@Override
	public String getSecondaryCategory() {
		return model.getSecondaryCategory();
	}

	/**
	 * Returns the status of this pharma application.
	 *
	 * @return the status of this pharma application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the sub category first field of this pharma application.
	 *
	 * @return the sub category first field of this pharma application
	 */
	@Override
	public String getSubCategoryFirstField() {
		return model.getSubCategoryFirstField();
	}

	/**
	 * Returns the sub category second field of this pharma application.
	 *
	 * @return the sub category second field of this pharma application
	 */
	@Override
	public String getSubCategorySecondField() {
		return model.getSubCategorySecondField();
	}

	/**
	 * Returns the type of pharma drug of this pharma application.
	 *
	 * @return the type of pharma drug of this pharma application
	 */
	@Override
	public String getTypeOfPharmaDrug() {
		return model.getTypeOfPharmaDrug();
	}

	/**
	 * Returns the type of pharma product of this pharma application.
	 *
	 * @return the type of pharma product of this pharma application
	 */
	@Override
	public String getTypeOfPharmaProduct() {
		return model.getTypeOfPharmaProduct();
	}

	/**
	 * Returns the type of product of this pharma application.
	 *
	 * @return the type of product of this pharma application
	 */
	@Override
	public String getTypeOfProduct() {
		return model.getTypeOfProduct();
	}

	/**
	 * Returns the user ID of this pharma application.
	 *
	 * @return the user ID of this pharma application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pharma application.
	 *
	 * @return the user name of this pharma application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pharma application.
	 *
	 * @return the user uuid of this pharma application
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
	 * Sets the app current stage name of this pharma application.
	 *
	 * @param appCurrentStageName the app current stage name of this pharma application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this pharma application.
	 *
	 * @param applicationNumber the application number of this pharma application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the caseld of this pharma application.
	 *
	 * @param caseld the caseld of this pharma application
	 */
	@Override
	public void setCaseld(String caseld) {
		model.setCaseld(caseld);
	}

	/**
	 * Sets the company ID of this pharma application.
	 *
	 * @param companyId the company ID of this pharma application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this pharma application.
	 *
	 * @param createDate the create date of this pharma application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this pharma application.
	 *
	 * @param entityId the entity ID of this pharma application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this pharma application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this pharma application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this pharma application.
	 *
	 * @param groupId the group ID of this pharma application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this pharma application.
	 *
	 * @param icmDocumentsPath the icm documents path of this pharma application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the modified date of this pharma application.
	 *
	 * @param modifiedDate the modified date of this pharma application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pdf file entry ID of this pharma application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this pharma application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the pharma application ID of this pharma application.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma application
	 */
	@Override
	public void setPharmaApplicationId(long pharmaApplicationId) {
		model.setPharmaApplicationId(pharmaApplicationId);
	}

	/**
	 * Sets the primary key of this pharma application.
	 *
	 * @param primaryKey the primary key of this pharma application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the requesttype of this pharma application.
	 *
	 * @param requesttype the requesttype of this pharma application
	 */
	@Override
	public void setRequesttype(String requesttype) {
		model.setRequesttype(requesttype);
	}

	/**
	 * Sets the secondary category of this pharma application.
	 *
	 * @param secondaryCategory the secondary category of this pharma application
	 */
	@Override
	public void setSecondaryCategory(String secondaryCategory) {
		model.setSecondaryCategory(secondaryCategory);
	}

	/**
	 * Sets the status of this pharma application.
	 *
	 * @param status the status of this pharma application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the sub category first field of this pharma application.
	 *
	 * @param subCategoryFirstField the sub category first field of this pharma application
	 */
	@Override
	public void setSubCategoryFirstField(String subCategoryFirstField) {
		model.setSubCategoryFirstField(subCategoryFirstField);
	}

	/**
	 * Sets the sub category second field of this pharma application.
	 *
	 * @param subCategorySecondField the sub category second field of this pharma application
	 */
	@Override
	public void setSubCategorySecondField(String subCategorySecondField) {
		model.setSubCategorySecondField(subCategorySecondField);
	}

	/**
	 * Sets the type of pharma drug of this pharma application.
	 *
	 * @param typeOfPharmaDrug the type of pharma drug of this pharma application
	 */
	@Override
	public void setTypeOfPharmaDrug(String typeOfPharmaDrug) {
		model.setTypeOfPharmaDrug(typeOfPharmaDrug);
	}

	/**
	 * Sets the type of pharma product of this pharma application.
	 *
	 * @param typeOfPharmaProduct the type of pharma product of this pharma application
	 */
	@Override
	public void setTypeOfPharmaProduct(String typeOfPharmaProduct) {
		model.setTypeOfPharmaProduct(typeOfPharmaProduct);
	}

	/**
	 * Sets the type of product of this pharma application.
	 *
	 * @param typeOfProduct the type of product of this pharma application
	 */
	@Override
	public void setTypeOfProduct(String typeOfProduct) {
		model.setTypeOfProduct(typeOfProduct);
	}

	/**
	 * Sets the user ID of this pharma application.
	 *
	 * @param userId the user ID of this pharma application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pharma application.
	 *
	 * @param userName the user name of this pharma application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pharma application.
	 *
	 * @param userUuid the user uuid of this pharma application
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
	protected PharmaApplicationWrapper wrap(
		PharmaApplication pharmaApplication) {

		return new PharmaApplicationWrapper(pharmaApplication);
	}

}