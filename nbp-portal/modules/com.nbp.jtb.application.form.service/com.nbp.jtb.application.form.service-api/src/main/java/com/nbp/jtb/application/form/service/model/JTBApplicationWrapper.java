/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JTBApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplication
 * @generated
 */
public class JTBApplicationWrapper
	extends BaseModelWrapper<JTBApplication>
	implements JTBApplication, ModelWrapper<JTBApplication> {

	public JTBApplicationWrapper(JTBApplication jtbApplication) {
		super(jtbApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jtbApplicationId", getJtbApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("typeOfApplication", getTypeOfApplication());
		attributes.put("categoryTypeValAccomo", getCategoryTypeValAccomo());
		attributes.put("nonHotelSubCategory", getNonHotelSubCategory());
		attributes.put("jtbTransactionTypeVal", getJtbTransactionTypeVal());
		attributes.put(
			"attractionCategoryTypeVal", getAttractionCategoryTypeVal());
		attributes.put("domesticToursType", getDomesticToursType());
		attributes.put("otherCategories", getOtherCategories());
		attributes.put("operatorName", getOperatorName());
		attributes.put("dateOfIssue", getDateOfIssue());
		attributes.put("dateOfExp", getDateOfExp());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
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

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
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

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		String typeOfApplication = (String)attributes.get("typeOfApplication");

		if (typeOfApplication != null) {
			setTypeOfApplication(typeOfApplication);
		}

		String categoryTypeValAccomo = (String)attributes.get(
			"categoryTypeValAccomo");

		if (categoryTypeValAccomo != null) {
			setCategoryTypeValAccomo(categoryTypeValAccomo);
		}

		String nonHotelSubCategory = (String)attributes.get(
			"nonHotelSubCategory");

		if (nonHotelSubCategory != null) {
			setNonHotelSubCategory(nonHotelSubCategory);
		}

		String jtbTransactionTypeVal = (String)attributes.get(
			"jtbTransactionTypeVal");

		if (jtbTransactionTypeVal != null) {
			setJtbTransactionTypeVal(jtbTransactionTypeVal);
		}

		String attractionCategoryTypeVal = (String)attributes.get(
			"attractionCategoryTypeVal");

		if (attractionCategoryTypeVal != null) {
			setAttractionCategoryTypeVal(attractionCategoryTypeVal);
		}

		String domesticToursType = (String)attributes.get("domesticToursType");

		if (domesticToursType != null) {
			setDomesticToursType(domesticToursType);
		}

		String otherCategories = (String)attributes.get("otherCategories");

		if (otherCategories != null) {
			setOtherCategories(otherCategories);
		}

		String operatorName = (String)attributes.get("operatorName");

		if (operatorName != null) {
			setOperatorName(operatorName);
		}

		Date dateOfIssue = (Date)attributes.get("dateOfIssue");

		if (dateOfIssue != null) {
			setDateOfIssue(dateOfIssue);
		}

		Date dateOfExp = (Date)attributes.get("dateOfExp");

		if (dateOfExp != null) {
			setDateOfExp(dateOfExp);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
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
	public JTBApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this jtb application.
	 *
	 * @return the app current stage name of this jtb application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this jtb application.
	 *
	 * @return the application number of this jtb application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the attraction category type val of this jtb application.
	 *
	 * @return the attraction category type val of this jtb application
	 */
	@Override
	public String getAttractionCategoryTypeVal() {
		return model.getAttractionCategoryTypeVal();
	}

	/**
	 * Returns the case ID of this jtb application.
	 *
	 * @return the case ID of this jtb application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the category type val accomo of this jtb application.
	 *
	 * @return the category type val accomo of this jtb application
	 */
	@Override
	public String getCategoryTypeValAccomo() {
		return model.getCategoryTypeValAccomo();
	}

	/**
	 * Returns the company ID of this jtb application.
	 *
	 * @return the company ID of this jtb application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jtb application.
	 *
	 * @return the create date of this jtb application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of exp of this jtb application.
	 *
	 * @return the date of exp of this jtb application
	 */
	@Override
	public Date getDateOfExp() {
		return model.getDateOfExp();
	}

	/**
	 * Returns the date of expiration of this jtb application.
	 *
	 * @return the date of expiration of this jtb application
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the date of issue of this jtb application.
	 *
	 * @return the date of issue of this jtb application
	 */
	@Override
	public Date getDateOfIssue() {
		return model.getDateOfIssue();
	}

	/**
	 * Returns the domestic tours type of this jtb application.
	 *
	 * @return the domestic tours type of this jtb application
	 */
	@Override
	public String getDomesticToursType() {
		return model.getDomesticToursType();
	}

	/**
	 * Returns the entity ID of this jtb application.
	 *
	 * @return the entity ID of this jtb application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this jtb application.
	 *
	 * @return the expired license app number of this jtb application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this jtb application.
	 *
	 * @return the group ID of this jtb application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this jtb application.
	 *
	 * @return the icm documents path of this jtb application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the jtb application ID of this jtb application.
	 *
	 * @return the jtb application ID of this jtb application
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the jtb transaction type val of this jtb application.
	 *
	 * @return the jtb transaction type val of this jtb application
	 */
	@Override
	public String getJtbTransactionTypeVal() {
		return model.getJtbTransactionTypeVal();
	}

	/**
	 * Returns the modified date of this jtb application.
	 *
	 * @return the modified date of this jtb application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the non hotel sub category of this jtb application.
	 *
	 * @return the non hotel sub category of this jtb application
	 */
	@Override
	public String getNonHotelSubCategory() {
		return model.getNonHotelSubCategory();
	}

	/**
	 * Returns the operator name of this jtb application.
	 *
	 * @return the operator name of this jtb application
	 */
	@Override
	public String getOperatorName() {
		return model.getOperatorName();
	}

	/**
	 * Returns the other categories of this jtb application.
	 *
	 * @return the other categories of this jtb application
	 */
	@Override
	public String getOtherCategories() {
		return model.getOtherCategories();
	}

	/**
	 * Returns the pdf file entry ID of this jtb application.
	 *
	 * @return the pdf file entry ID of this jtb application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this jtb application.
	 *
	 * @return the primary key of this jtb application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this jtb application.
	 *
	 * @return the status of this jtb application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of application of this jtb application.
	 *
	 * @return the type of application of this jtb application
	 */
	@Override
	public String getTypeOfApplication() {
		return model.getTypeOfApplication();
	}

	/**
	 * Returns the user ID of this jtb application.
	 *
	 * @return the user ID of this jtb application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jtb application.
	 *
	 * @return the user name of this jtb application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jtb application.
	 *
	 * @return the user uuid of this jtb application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jtb application.
	 *
	 * @return the uuid of this jtb application
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
	 * Sets the app current stage name of this jtb application.
	 *
	 * @param appCurrentStageName the app current stage name of this jtb application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this jtb application.
	 *
	 * @param applicationNumber the application number of this jtb application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the attraction category type val of this jtb application.
	 *
	 * @param attractionCategoryTypeVal the attraction category type val of this jtb application
	 */
	@Override
	public void setAttractionCategoryTypeVal(String attractionCategoryTypeVal) {
		model.setAttractionCategoryTypeVal(attractionCategoryTypeVal);
	}

	/**
	 * Sets the case ID of this jtb application.
	 *
	 * @param caseId the case ID of this jtb application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the category type val accomo of this jtb application.
	 *
	 * @param categoryTypeValAccomo the category type val accomo of this jtb application
	 */
	@Override
	public void setCategoryTypeValAccomo(String categoryTypeValAccomo) {
		model.setCategoryTypeValAccomo(categoryTypeValAccomo);
	}

	/**
	 * Sets the company ID of this jtb application.
	 *
	 * @param companyId the company ID of this jtb application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jtb application.
	 *
	 * @param createDate the create date of this jtb application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of exp of this jtb application.
	 *
	 * @param dateOfExp the date of exp of this jtb application
	 */
	@Override
	public void setDateOfExp(Date dateOfExp) {
		model.setDateOfExp(dateOfExp);
	}

	/**
	 * Sets the date of expiration of this jtb application.
	 *
	 * @param dateOfExpiration the date of expiration of this jtb application
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the date of issue of this jtb application.
	 *
	 * @param dateOfIssue the date of issue of this jtb application
	 */
	@Override
	public void setDateOfIssue(Date dateOfIssue) {
		model.setDateOfIssue(dateOfIssue);
	}

	/**
	 * Sets the domestic tours type of this jtb application.
	 *
	 * @param domesticToursType the domestic tours type of this jtb application
	 */
	@Override
	public void setDomesticToursType(String domesticToursType) {
		model.setDomesticToursType(domesticToursType);
	}

	/**
	 * Sets the entity ID of this jtb application.
	 *
	 * @param entityId the entity ID of this jtb application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this jtb application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this jtb application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this jtb application.
	 *
	 * @param groupId the group ID of this jtb application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this jtb application.
	 *
	 * @param icmDocumentsPath the icm documents path of this jtb application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the jtb application ID of this jtb application.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb application
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the jtb transaction type val of this jtb application.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val of this jtb application
	 */
	@Override
	public void setJtbTransactionTypeVal(String jtbTransactionTypeVal) {
		model.setJtbTransactionTypeVal(jtbTransactionTypeVal);
	}

	/**
	 * Sets the modified date of this jtb application.
	 *
	 * @param modifiedDate the modified date of this jtb application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the non hotel sub category of this jtb application.
	 *
	 * @param nonHotelSubCategory the non hotel sub category of this jtb application
	 */
	@Override
	public void setNonHotelSubCategory(String nonHotelSubCategory) {
		model.setNonHotelSubCategory(nonHotelSubCategory);
	}

	/**
	 * Sets the operator name of this jtb application.
	 *
	 * @param operatorName the operator name of this jtb application
	 */
	@Override
	public void setOperatorName(String operatorName) {
		model.setOperatorName(operatorName);
	}

	/**
	 * Sets the other categories of this jtb application.
	 *
	 * @param otherCategories the other categories of this jtb application
	 */
	@Override
	public void setOtherCategories(String otherCategories) {
		model.setOtherCategories(otherCategories);
	}

	/**
	 * Sets the pdf file entry ID of this jtb application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this jtb application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this jtb application.
	 *
	 * @param primaryKey the primary key of this jtb application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this jtb application.
	 *
	 * @param status the status of this jtb application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of application of this jtb application.
	 *
	 * @param typeOfApplication the type of application of this jtb application
	 */
	@Override
	public void setTypeOfApplication(String typeOfApplication) {
		model.setTypeOfApplication(typeOfApplication);
	}

	/**
	 * Sets the user ID of this jtb application.
	 *
	 * @param userId the user ID of this jtb application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jtb application.
	 *
	 * @param userName the user name of this jtb application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jtb application.
	 *
	 * @param userUuid the user uuid of this jtb application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jtb application.
	 *
	 * @param uuid the uuid of this jtb application
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
	protected JTBApplicationWrapper wrap(JTBApplication jtbApplication) {
		return new JTBApplicationWrapper(jtbApplication);
	}

}