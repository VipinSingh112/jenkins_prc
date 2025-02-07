/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiningLeaseApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplication
 * @generated
 */
public class MiningLeaseApplicationWrapper
	extends BaseModelWrapper<MiningLeaseApplication>
	implements MiningLeaseApplication, ModelWrapper<MiningLeaseApplication> {

	public MiningLeaseApplicationWrapper(
		MiningLeaseApplication miningLeaseApplication) {

		super(miningLeaseApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"miningLeaseApplicationId", getMiningLeaseApplicationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("typeOfApplicant", getTypeOfApplicant());
		attributes.put("prospectingRightNumber", getProspectingRightNumber());
		attributes.put(
			"typeOfProspectingLicence", getTypeOfProspectingLicence());
		attributes.put("typeOfTransaction", getTypeOfTransaction());
		attributes.put(
			"areaDelinationTotalApprox", getAreaDelinationTotalApprox());
		attributes.put("licenceExclusiveSpecial", getLicenceExclusiveSpecial());
		attributes.put("miningMineralsTypeVal", getMiningMineralsTypeVal());
		attributes.put("otherMineralBox", getOtherMineralBox());
		attributes.put("areaDelination", getAreaDelination());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("prospRightsNum", getProspRightsNum());
		attributes.put("prospLicenseNum", getProspLicenseNum());
		attributes.put("expiredLicenseAppNumber", getExpiredLicenseAppNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("icmDocumentsPath", getIcmDocumentsPath());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miningLeaseApplicationId = (Long)attributes.get(
			"miningLeaseApplicationId");

		if (miningLeaseApplicationId != null) {
			setMiningLeaseApplicationId(miningLeaseApplicationId);
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

		String typeOfApplicant = (String)attributes.get("typeOfApplicant");

		if (typeOfApplicant != null) {
			setTypeOfApplicant(typeOfApplicant);
		}

		String prospectingRightNumber = (String)attributes.get(
			"prospectingRightNumber");

		if (prospectingRightNumber != null) {
			setProspectingRightNumber(prospectingRightNumber);
		}

		String typeOfProspectingLicence = (String)attributes.get(
			"typeOfProspectingLicence");

		if (typeOfProspectingLicence != null) {
			setTypeOfProspectingLicence(typeOfProspectingLicence);
		}

		String typeOfTransaction = (String)attributes.get("typeOfTransaction");

		if (typeOfTransaction != null) {
			setTypeOfTransaction(typeOfTransaction);
		}

		String areaDelinationTotalApprox = (String)attributes.get(
			"areaDelinationTotalApprox");

		if (areaDelinationTotalApprox != null) {
			setAreaDelinationTotalApprox(areaDelinationTotalApprox);
		}

		String licenceExclusiveSpecial = (String)attributes.get(
			"licenceExclusiveSpecial");

		if (licenceExclusiveSpecial != null) {
			setLicenceExclusiveSpecial(licenceExclusiveSpecial);
		}

		String miningMineralsTypeVal = (String)attributes.get(
			"miningMineralsTypeVal");

		if (miningMineralsTypeVal != null) {
			setMiningMineralsTypeVal(miningMineralsTypeVal);
		}

		String otherMineralBox = (String)attributes.get("otherMineralBox");

		if (otherMineralBox != null) {
			setOtherMineralBox(otherMineralBox);
		}

		String areaDelination = (String)attributes.get("areaDelination");

		if (areaDelination != null) {
			setAreaDelination(areaDelination);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		String prospRightsNum = (String)attributes.get("prospRightsNum");

		if (prospRightsNum != null) {
			setProspRightsNum(prospRightsNum);
		}

		String prospLicenseNum = (String)attributes.get("prospLicenseNum");

		if (prospLicenseNum != null) {
			setProspLicenseNum(prospLicenseNum);
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

		String appCurrentStageName = (String)attributes.get(
			"appCurrentStageName");

		if (appCurrentStageName != null) {
			setAppCurrentStageName(appCurrentStageName);
		}
	}

	@Override
	public MiningLeaseApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this mining lease application.
	 *
	 * @return the app current stage name of this mining lease application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the application number of this mining lease application.
	 *
	 * @return the application number of this mining lease application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the area delination of this mining lease application.
	 *
	 * @return the area delination of this mining lease application
	 */
	@Override
	public String getAreaDelination() {
		return model.getAreaDelination();
	}

	/**
	 * Returns the area delination total approx of this mining lease application.
	 *
	 * @return the area delination total approx of this mining lease application
	 */
	@Override
	public String getAreaDelinationTotalApprox() {
		return model.getAreaDelinationTotalApprox();
	}

	/**
	 * Returns the case ID of this mining lease application.
	 *
	 * @return the case ID of this mining lease application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this mining lease application.
	 *
	 * @return the company ID of this mining lease application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this mining lease application.
	 *
	 * @return the create date of this mining lease application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this mining lease application.
	 *
	 * @return the entity ID of this mining lease application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the expired license app number of this mining lease application.
	 *
	 * @return the expired license app number of this mining lease application
	 */
	@Override
	public String getExpiredLicenseAppNumber() {
		return model.getExpiredLicenseAppNumber();
	}

	/**
	 * Returns the group ID of this mining lease application.
	 *
	 * @return the group ID of this mining lease application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm documents path of this mining lease application.
	 *
	 * @return the icm documents path of this mining lease application
	 */
	@Override
	public String getIcmDocumentsPath() {
		return model.getIcmDocumentsPath();
	}

	/**
	 * Returns the licence exclusive special of this mining lease application.
	 *
	 * @return the licence exclusive special of this mining lease application
	 */
	@Override
	public String getLicenceExclusiveSpecial() {
		return model.getLicenceExclusiveSpecial();
	}

	/**
	 * Returns the mining lease application ID of this mining lease application.
	 *
	 * @return the mining lease application ID of this mining lease application
	 */
	@Override
	public long getMiningLeaseApplicationId() {
		return model.getMiningLeaseApplicationId();
	}

	/**
	 * Returns the mining minerals type val of this mining lease application.
	 *
	 * @return the mining minerals type val of this mining lease application
	 */
	@Override
	public String getMiningMineralsTypeVal() {
		return model.getMiningMineralsTypeVal();
	}

	/**
	 * Returns the modified date of this mining lease application.
	 *
	 * @return the modified date of this mining lease application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other mineral box of this mining lease application.
	 *
	 * @return the other mineral box of this mining lease application
	 */
	@Override
	public String getOtherMineralBox() {
		return model.getOtherMineralBox();
	}

	/**
	 * Returns the pdf file entry ID of this mining lease application.
	 *
	 * @return the pdf file entry ID of this mining lease application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this mining lease application.
	 *
	 * @return the primary key of this mining lease application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the prospecting right number of this mining lease application.
	 *
	 * @return the prospecting right number of this mining lease application
	 */
	@Override
	public String getProspectingRightNumber() {
		return model.getProspectingRightNumber();
	}

	/**
	 * Returns the prosp license num of this mining lease application.
	 *
	 * @return the prosp license num of this mining lease application
	 */
	@Override
	public String getProspLicenseNum() {
		return model.getProspLicenseNum();
	}

	/**
	 * Returns the prosp rights num of this mining lease application.
	 *
	 * @return the prosp rights num of this mining lease application
	 */
	@Override
	public String getProspRightsNum() {
		return model.getProspRightsNum();
	}

	/**
	 * Returns the status of this mining lease application.
	 *
	 * @return the status of this mining lease application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of applicant of this mining lease application.
	 *
	 * @return the type of applicant of this mining lease application
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the type of prospecting licence of this mining lease application.
	 *
	 * @return the type of prospecting licence of this mining lease application
	 */
	@Override
	public String getTypeOfProspectingLicence() {
		return model.getTypeOfProspectingLicence();
	}

	/**
	 * Returns the type of transaction of this mining lease application.
	 *
	 * @return the type of transaction of this mining lease application
	 */
	@Override
	public String getTypeOfTransaction() {
		return model.getTypeOfTransaction();
	}

	/**
	 * Returns the user ID of this mining lease application.
	 *
	 * @return the user ID of this mining lease application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining lease application.
	 *
	 * @return the user name of this mining lease application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining lease application.
	 *
	 * @return the user uuid of this mining lease application
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
	 * Sets the app current stage name of this mining lease application.
	 *
	 * @param appCurrentStageName the app current stage name of this mining lease application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the application number of this mining lease application.
	 *
	 * @param applicationNumber the application number of this mining lease application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the area delination of this mining lease application.
	 *
	 * @param areaDelination the area delination of this mining lease application
	 */
	@Override
	public void setAreaDelination(String areaDelination) {
		model.setAreaDelination(areaDelination);
	}

	/**
	 * Sets the area delination total approx of this mining lease application.
	 *
	 * @param areaDelinationTotalApprox the area delination total approx of this mining lease application
	 */
	@Override
	public void setAreaDelinationTotalApprox(String areaDelinationTotalApprox) {
		model.setAreaDelinationTotalApprox(areaDelinationTotalApprox);
	}

	/**
	 * Sets the case ID of this mining lease application.
	 *
	 * @param caseId the case ID of this mining lease application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this mining lease application.
	 *
	 * @param companyId the company ID of this mining lease application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this mining lease application.
	 *
	 * @param createDate the create date of this mining lease application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this mining lease application.
	 *
	 * @param entityId the entity ID of this mining lease application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the expired license app number of this mining lease application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this mining lease application
	 */
	@Override
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber) {
		model.setExpiredLicenseAppNumber(expiredLicenseAppNumber);
	}

	/**
	 * Sets the group ID of this mining lease application.
	 *
	 * @param groupId the group ID of this mining lease application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm documents path of this mining lease application.
	 *
	 * @param icmDocumentsPath the icm documents path of this mining lease application
	 */
	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		model.setIcmDocumentsPath(icmDocumentsPath);
	}

	/**
	 * Sets the licence exclusive special of this mining lease application.
	 *
	 * @param licenceExclusiveSpecial the licence exclusive special of this mining lease application
	 */
	@Override
	public void setLicenceExclusiveSpecial(String licenceExclusiveSpecial) {
		model.setLicenceExclusiveSpecial(licenceExclusiveSpecial);
	}

	/**
	 * Sets the mining lease application ID of this mining lease application.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID of this mining lease application
	 */
	@Override
	public void setMiningLeaseApplicationId(long miningLeaseApplicationId) {
		model.setMiningLeaseApplicationId(miningLeaseApplicationId);
	}

	/**
	 * Sets the mining minerals type val of this mining lease application.
	 *
	 * @param miningMineralsTypeVal the mining minerals type val of this mining lease application
	 */
	@Override
	public void setMiningMineralsTypeVal(String miningMineralsTypeVal) {
		model.setMiningMineralsTypeVal(miningMineralsTypeVal);
	}

	/**
	 * Sets the modified date of this mining lease application.
	 *
	 * @param modifiedDate the modified date of this mining lease application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other mineral box of this mining lease application.
	 *
	 * @param otherMineralBox the other mineral box of this mining lease application
	 */
	@Override
	public void setOtherMineralBox(String otherMineralBox) {
		model.setOtherMineralBox(otherMineralBox);
	}

	/**
	 * Sets the pdf file entry ID of this mining lease application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this mining lease application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this mining lease application.
	 *
	 * @param primaryKey the primary key of this mining lease application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the prospecting right number of this mining lease application.
	 *
	 * @param prospectingRightNumber the prospecting right number of this mining lease application
	 */
	@Override
	public void setProspectingRightNumber(String prospectingRightNumber) {
		model.setProspectingRightNumber(prospectingRightNumber);
	}

	/**
	 * Sets the prosp license num of this mining lease application.
	 *
	 * @param prospLicenseNum the prosp license num of this mining lease application
	 */
	@Override
	public void setProspLicenseNum(String prospLicenseNum) {
		model.setProspLicenseNum(prospLicenseNum);
	}

	/**
	 * Sets the prosp rights num of this mining lease application.
	 *
	 * @param prospRightsNum the prosp rights num of this mining lease application
	 */
	@Override
	public void setProspRightsNum(String prospRightsNum) {
		model.setProspRightsNum(prospRightsNum);
	}

	/**
	 * Sets the status of this mining lease application.
	 *
	 * @param status the status of this mining lease application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of applicant of this mining lease application.
	 *
	 * @param typeOfApplicant the type of applicant of this mining lease application
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the type of prospecting licence of this mining lease application.
	 *
	 * @param typeOfProspectingLicence the type of prospecting licence of this mining lease application
	 */
	@Override
	public void setTypeOfProspectingLicence(String typeOfProspectingLicence) {
		model.setTypeOfProspectingLicence(typeOfProspectingLicence);
	}

	/**
	 * Sets the type of transaction of this mining lease application.
	 *
	 * @param typeOfTransaction the type of transaction of this mining lease application
	 */
	@Override
	public void setTypeOfTransaction(String typeOfTransaction) {
		model.setTypeOfTransaction(typeOfTransaction);
	}

	/**
	 * Sets the user ID of this mining lease application.
	 *
	 * @param userId the user ID of this mining lease application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining lease application.
	 *
	 * @param userName the user name of this mining lease application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining lease application.
	 *
	 * @param userUuid the user uuid of this mining lease application
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
	protected MiningLeaseApplicationWrapper wrap(
		MiningLeaseApplication miningLeaseApplication) {

		return new MiningLeaseApplicationWrapper(miningLeaseApplication);
	}

}