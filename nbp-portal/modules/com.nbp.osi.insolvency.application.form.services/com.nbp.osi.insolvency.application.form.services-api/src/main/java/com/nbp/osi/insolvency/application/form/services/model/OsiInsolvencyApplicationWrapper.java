/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiInsolvencyApplication}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplication
 * @generated
 */
public class OsiInsolvencyApplicationWrapper
	extends BaseModelWrapper<OsiInsolvencyApplication>
	implements ModelWrapper<OsiInsolvencyApplication>,
			   OsiInsolvencyApplication {

	public OsiInsolvencyApplicationWrapper(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		super(osiInsolvencyApplication);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiInsolvencyId", getOsiInsolvencyId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("applicantStatus", getApplicantStatus());
		attributes.put("typeOfApplicant", getTypeOfApplicant());
		attributes.put("subjectData", getSubjectData());
		attributes.put("applicantIndividual", getApplicantIndividual());
		attributes.put("applicantCompany", getApplicantCompany());
		attributes.put("realEstateBoard", getRealEstateBoard());
		attributes.put("caseId", getCaseId());
		attributes.put("status", getStatus());
		attributes.put("icmDocumentPath", getIcmDocumentPath());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("pdfFileEntryId", getPdfFileEntryId());
		attributes.put("appCurrentStageName", getAppCurrentStageName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
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

		String applicantStatus = (String)attributes.get("applicantStatus");

		if (applicantStatus != null) {
			setApplicantStatus(applicantStatus);
		}

		String typeOfApplicant = (String)attributes.get("typeOfApplicant");

		if (typeOfApplicant != null) {
			setTypeOfApplicant(typeOfApplicant);
		}

		String subjectData = (String)attributes.get("subjectData");

		if (subjectData != null) {
			setSubjectData(subjectData);
		}

		String applicantIndividual = (String)attributes.get(
			"applicantIndividual");

		if (applicantIndividual != null) {
			setApplicantIndividual(applicantIndividual);
		}

		String applicantCompany = (String)attributes.get("applicantCompany");

		if (applicantCompany != null) {
			setApplicantCompany(applicantCompany);
		}

		String realEstateBoard = (String)attributes.get("realEstateBoard");

		if (realEstateBoard != null) {
			setRealEstateBoard(realEstateBoard);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String icmDocumentPath = (String)attributes.get("icmDocumentPath");

		if (icmDocumentPath != null) {
			setIcmDocumentPath(icmDocumentPath);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
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
	public OsiInsolvencyApplication cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app current stage name of this osi insolvency application.
	 *
	 * @return the app current stage name of this osi insolvency application
	 */
	@Override
	public String getAppCurrentStageName() {
		return model.getAppCurrentStageName();
	}

	/**
	 * Returns the applicant company of this osi insolvency application.
	 *
	 * @return the applicant company of this osi insolvency application
	 */
	@Override
	public String getApplicantCompany() {
		return model.getApplicantCompany();
	}

	/**
	 * Returns the applicant individual of this osi insolvency application.
	 *
	 * @return the applicant individual of this osi insolvency application
	 */
	@Override
	public String getApplicantIndividual() {
		return model.getApplicantIndividual();
	}

	/**
	 * Returns the applicant status of this osi insolvency application.
	 *
	 * @return the applicant status of this osi insolvency application
	 */
	@Override
	public String getApplicantStatus() {
		return model.getApplicantStatus();
	}

	/**
	 * Returns the application number of this osi insolvency application.
	 *
	 * @return the application number of this osi insolvency application
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the case ID of this osi insolvency application.
	 *
	 * @return the case ID of this osi insolvency application
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this osi insolvency application.
	 *
	 * @return the company ID of this osi insolvency application
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi insolvency application.
	 *
	 * @return the create date of this osi insolvency application
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity ID of this osi insolvency application.
	 *
	 * @return the entity ID of this osi insolvency application
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the group ID of this osi insolvency application.
	 *
	 * @return the group ID of this osi insolvency application
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the icm document path of this osi insolvency application.
	 *
	 * @return the icm document path of this osi insolvency application
	 */
	@Override
	public String getIcmDocumentPath() {
		return model.getIcmDocumentPath();
	}

	/**
	 * Returns the modified date of this osi insolvency application.
	 *
	 * @return the modified date of this osi insolvency application
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this osi insolvency application.
	 *
	 * @return the osi insolvency ID of this osi insolvency application
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the pdf file entry ID of this osi insolvency application.
	 *
	 * @return the pdf file entry ID of this osi insolvency application
	 */
	@Override
	public long getPdfFileEntryId() {
		return model.getPdfFileEntryId();
	}

	/**
	 * Returns the primary key of this osi insolvency application.
	 *
	 * @return the primary key of this osi insolvency application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the real estate board of this osi insolvency application.
	 *
	 * @return the real estate board of this osi insolvency application
	 */
	@Override
	public String getRealEstateBoard() {
		return model.getRealEstateBoard();
	}

	/**
	 * Returns the status of this osi insolvency application.
	 *
	 * @return the status of this osi insolvency application
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the subject data of this osi insolvency application.
	 *
	 * @return the subject data of this osi insolvency application
	 */
	@Override
	public String getSubjectData() {
		return model.getSubjectData();
	}

	/**
	 * Returns the type of applicant of this osi insolvency application.
	 *
	 * @return the type of applicant of this osi insolvency application
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the user ID of this osi insolvency application.
	 *
	 * @return the user ID of this osi insolvency application
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi insolvency application.
	 *
	 * @return the user name of this osi insolvency application
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi insolvency application.
	 *
	 * @return the user uuid of this osi insolvency application
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
	 * Sets the app current stage name of this osi insolvency application.
	 *
	 * @param appCurrentStageName the app current stage name of this osi insolvency application
	 */
	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		model.setAppCurrentStageName(appCurrentStageName);
	}

	/**
	 * Sets the applicant company of this osi insolvency application.
	 *
	 * @param applicantCompany the applicant company of this osi insolvency application
	 */
	@Override
	public void setApplicantCompany(String applicantCompany) {
		model.setApplicantCompany(applicantCompany);
	}

	/**
	 * Sets the applicant individual of this osi insolvency application.
	 *
	 * @param applicantIndividual the applicant individual of this osi insolvency application
	 */
	@Override
	public void setApplicantIndividual(String applicantIndividual) {
		model.setApplicantIndividual(applicantIndividual);
	}

	/**
	 * Sets the applicant status of this osi insolvency application.
	 *
	 * @param applicantStatus the applicant status of this osi insolvency application
	 */
	@Override
	public void setApplicantStatus(String applicantStatus) {
		model.setApplicantStatus(applicantStatus);
	}

	/**
	 * Sets the application number of this osi insolvency application.
	 *
	 * @param applicationNumber the application number of this osi insolvency application
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the case ID of this osi insolvency application.
	 *
	 * @param caseId the case ID of this osi insolvency application
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this osi insolvency application.
	 *
	 * @param companyId the company ID of this osi insolvency application
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi insolvency application.
	 *
	 * @param createDate the create date of this osi insolvency application
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity ID of this osi insolvency application.
	 *
	 * @param entityId the entity ID of this osi insolvency application
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the group ID of this osi insolvency application.
	 *
	 * @param groupId the group ID of this osi insolvency application
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the icm document path of this osi insolvency application.
	 *
	 * @param icmDocumentPath the icm document path of this osi insolvency application
	 */
	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		model.setIcmDocumentPath(icmDocumentPath);
	}

	/**
	 * Sets the modified date of this osi insolvency application.
	 *
	 * @param modifiedDate the modified date of this osi insolvency application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this osi insolvency application.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi insolvency application
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the pdf file entry ID of this osi insolvency application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this osi insolvency application
	 */
	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		model.setPdfFileEntryId(pdfFileEntryId);
	}

	/**
	 * Sets the primary key of this osi insolvency application.
	 *
	 * @param primaryKey the primary key of this osi insolvency application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the real estate board of this osi insolvency application.
	 *
	 * @param realEstateBoard the real estate board of this osi insolvency application
	 */
	@Override
	public void setRealEstateBoard(String realEstateBoard) {
		model.setRealEstateBoard(realEstateBoard);
	}

	/**
	 * Sets the status of this osi insolvency application.
	 *
	 * @param status the status of this osi insolvency application
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the subject data of this osi insolvency application.
	 *
	 * @param subjectData the subject data of this osi insolvency application
	 */
	@Override
	public void setSubjectData(String subjectData) {
		model.setSubjectData(subjectData);
	}

	/**
	 * Sets the type of applicant of this osi insolvency application.
	 *
	 * @param typeOfApplicant the type of applicant of this osi insolvency application
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the user ID of this osi insolvency application.
	 *
	 * @param userId the user ID of this osi insolvency application
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi insolvency application.
	 *
	 * @param userName the user name of this osi insolvency application
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi insolvency application.
	 *
	 * @param userUuid the user uuid of this osi insolvency application
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
	protected OsiInsolvencyApplicationWrapper wrap(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		return new OsiInsolvencyApplicationWrapper(osiInsolvencyApplication);
	}

}