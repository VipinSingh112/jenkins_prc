/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WRAApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplication
 * @generated
 */
public class WRAApplicationWrapper
	extends BaseModelWrapper<WRAApplication>
	implements ModelWrapper<WRAApplication>, WRAApplication {

	public WRAApplicationWrapper(WRAApplication wraApplication) {
		super(wraApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wraApplicationId", getWraApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("typeOfApplication", getTypeOfApplication());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put("typeOfPermit", getTypeOfPermit());
		attributes.put("typeOfTransacPermit", getTypeOfTransacPermit());
		attributes.put("userWaterTypeCat", getUserWaterTypeCat());
		attributes.put("consumptiveSubCat", getConsumptiveSubCat());
		attributes.put("nonConsumptiveSubCat", getNonConsumptiveSubCat());
		attributes.put("industrialTypeSubCat", getIndustrialTypeSubCat());
		attributes.put("icmDocumentPath", getIcmDocumentPath());
		attributes.put("status", getStatus());
		attributes.put("caseId", getCaseId());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
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

		Date entityId = (Date)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		String typeOfApplication = (String)attributes.get("typeOfApplication");

		if (typeOfApplication != null) {
			setTypeOfApplication(typeOfApplication);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String typeOfPermit = (String)attributes.get("typeOfPermit");

		if (typeOfPermit != null) {
			setTypeOfPermit(typeOfPermit);
		}

		String typeOfTransacPermit = (String)attributes.get(
			"typeOfTransacPermit");

		if (typeOfTransacPermit != null) {
			setTypeOfTransacPermit(typeOfTransacPermit);
		}

		String userWaterTypeCat = (String)attributes.get("userWaterTypeCat");

		if (userWaterTypeCat != null) {
			setUserWaterTypeCat(userWaterTypeCat);
		}

		String consumptiveSubCat = (String)attributes.get("consumptiveSubCat");

		if (consumptiveSubCat != null) {
			setConsumptiveSubCat(consumptiveSubCat);
		}

		String nonConsumptiveSubCat = (String)attributes.get(
			"nonConsumptiveSubCat");

		if (nonConsumptiveSubCat != null) {
			setNonConsumptiveSubCat(nonConsumptiveSubCat);
		}

		String industrialTypeSubCat = (String)attributes.get(
			"industrialTypeSubCat");

		if (industrialTypeSubCat != null) {
			setIndustrialTypeSubCat(industrialTypeSubCat);
		}

		String icmDocumentPath = (String)attributes.get("icmDocumentPath");

		if (icmDocumentPath != null) {
			setIcmDocumentPath(icmDocumentPath);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
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
	public WRAApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this wra application.
	 *
	 * @return the app current stage name of this wra application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this wra application.
	 *
	 * @return the application number of this wra application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this wra application.
	 *
	 * @return the case ID of this wra application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this wra application.
	 *
	 * @return the company ID of this wra application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the consumptive sub cat of this wra application.
	 *
	 * @return the consumptive sub cat of this wra application
	 */
	@Override
	public String getConsumptiveSubCat() {
		return model.getConsumptiveSubCat();
	}

	/**
	 * Returns the create date of this wra application.
	 *
	 * @return the create date of this wra application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this wra application.
	 *
	 * @return the entity ID of this wra application
	 */
	@Override
	public Date getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this wra application.
	 *
	 * @return the expired license app number of this wra application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this wra application.
	 *
	 * @return the group ID of this wra application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this wra application.
	 *
	 * @return the icm document path of this wra application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the industrial type sub cat of this wra application.
	 *
	 * @return the industrial type sub cat of this wra application
	 */
	@Override
	public String getIndustrialTypeSubCat() {
		return model.getIndustrialTypeSubCat();
	}

	/**
	 * Returns the modified date of this wra application.
	 *
	 * @return the modified date of this wra application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the non consumptive sub cat of this wra application.
	 *
	 * @return the non consumptive sub cat of this wra application
	 */
	@Override
	public String getNonConsumptiveSubCat() {
		return model.getNonConsumptiveSubCat();
	}

	/**
	 * Returns the pdf file entry ID of this wra application.
	 *
	 * @return the pdf file entry ID of this wra application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this wra application.
	 *
	 * @return the primary key of this wra application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this wra application.
	 *
	 * @return the status of this wra application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of application of this wra application.
	 *
	 * @return the type of application of this wra application
	 */
	@Override
	public String getTypeOfApplication() {
		return model.getTypeOfApplication();
	}

	/**
	 * Returns the type of permit of this wra application.
	 *
	 * @return the type of permit of this wra application
	 */
	@Override
	public String getTypeOfPermit() {
		return model.getTypeOfPermit();
	}

	/**
	 * Returns the type of transac permit of this wra application.
	 *
	 * @return the type of transac permit of this wra application
	 */
	@Override
	public String getTypeOfTransacPermit() {
		return model.getTypeOfTransacPermit();
	}

	/**
	 * Returns the type of transaction of this wra application.
	 *
	 * @return the type of transaction of this wra application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this wra application.
	 *
	 * @return the user ID of this wra application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this wra application.
	 *
	 * @return the user name of this wra application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this wra application.
	 *
	 * @return the user uuid of this wra application
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the user water type cat of this wra application.
	 *
	 * @return the user water type cat of this wra application
	 */
	@Override
	public String getUserWaterTypeCat() {
		return model.getUserWaterTypeCat();
	}

	/**
	 * Returns the wra application ID of this wra application.
	 *
	 * @return the wra application ID of this wra application
	 */
	@Override
	public long getWraApplicationId() {
		return model.getWraApplicationId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the app current stage name of this wra application.
	 *
	 * @param appCurrentStageName the app current stage name of this wra application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this wra application.
	 *
	 * @param applicationNumber the application number of this wra application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this wra application.
	 *
	 * @param caseId the case ID of this wra application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this wra application.
	 *
	 * @param companyId the company ID of this wra application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the consumptive sub cat of this wra application.
	 *
	 * @param consumptiveSubCat the consumptive sub cat of this wra application
	 */
	@Override
	public void setConsumptiveSubCat(String consumptiveSubCat) {
		model.setConsumptiveSubCat(consumptiveSubCat);
	}

	/**
	 * Sets the create date of this wra application.
	 *
	 * @param createDate the create date of this wra application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this wra application.
	 *
	 * @param entityId the entity ID of this wra application
	 */
	@Override
	public void setEntityId(Date entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this wra application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this wra application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this wra application.
	 *
	 * @param groupId the group ID of this wra application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this wra application.
	 *
	 * @param icmDocumentPath the icm document path of this wra application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the industrial type sub cat of this wra application.
	 *
	 * @param industrialTypeSubCat the industrial type sub cat of this wra application
	 */
	@Override
	public void setIndustrialTypeSubCat(String industrialTypeSubCat) {
		model.setIndustrialTypeSubCat(industrialTypeSubCat);
	}

	/**
	 * Sets the modified date of this wra application.
	 *
	 * @param modifiedDate the modified date of this wra application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the non consumptive sub cat of this wra application.
	 *
	 * @param nonConsumptiveSubCat the non consumptive sub cat of this wra application
	 */
	@Override
	public void setNonConsumptiveSubCat(String nonConsumptiveSubCat) {
		model.setNonConsumptiveSubCat(nonConsumptiveSubCat);
	}

	/**
	 * Sets the pdf file entry ID of this wra application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this wra application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this wra application.
	 *
	 * @param primaryKey the primary key of this wra application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this wra application.
	 *
	 * @param status the status of this wra application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of application of this wra application.
	 *
	 * @param typeOfApplication the type of application of this wra application
	 */
	@Override
	public void setTypeOfApplication(String typeOfApplication) {
		model.setTypeOfApplication(typeOfApplication);
	}

	/**
	 * Sets the type of permit of this wra application.
	 *
	 * @param typeOfPermit the type of permit of this wra application
	 */
	@Override
	public void setTypeOfPermit(String typeOfPermit) {
		model.setTypeOfPermit(typeOfPermit);
	}

	/**
	 * Sets the type of transac permit of this wra application.
	 *
	 * @param typeOfTransacPermit the type of transac permit of this wra application
	 */
	@Override
	public void setTypeOfTransacPermit(String typeOfTransacPermit) {
		model.setTypeOfTransacPermit(typeOfTransacPermit);
	}

	/**
	 * Sets the type of transaction of this wra application.
	 *
	 * @param typeOfTransaction the type of transaction of this wra application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this wra application.
	 *
	 * @param userId the user ID of this wra application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this wra application.
	 *
	 * @param userName the user name of this wra application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this wra application.
	 *
	 * @param userUuid the user uuid of this wra application
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the user water type cat of this wra application.
	 *
	 * @param userWaterTypeCat the user water type cat of this wra application
	 */
	@Override
	public void setUserWaterTypeCat(String userWaterTypeCat) {
		model.setUserWaterTypeCat(userWaterTypeCat);
	}

	/**
	 * Sets the wra application ID of this wra application.
	 *
	 * @param wraApplicationId the wra application ID of this wra application
	 */
	@Override
	public void setWraApplicationId(long wraApplicationId) {
		model.setWraApplicationId(wraApplicationId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected WRAApplicationWrapper wrap(WRAApplication wraApplication) {
		return new WRAApplicationWrapper(wraApplication);
	}

}