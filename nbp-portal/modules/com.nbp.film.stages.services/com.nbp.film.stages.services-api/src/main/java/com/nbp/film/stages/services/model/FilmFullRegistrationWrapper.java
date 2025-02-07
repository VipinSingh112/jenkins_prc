/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FilmFullRegistration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmFullRegistration
 * @generated
 */
public class FilmFullRegistrationWrapper
	extends BaseModelWrapper<FilmFullRegistration>
	implements FilmFullRegistration, ModelWrapper<FilmFullRegistration> {

	public FilmFullRegistrationWrapper(
		FilmFullRegistration filmFullRegistration) {

		super(filmFullRegistration);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("filmFullRegistrationId", getFilmFullRegistrationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("productionType", getProductionType());
		attributes.put("registrationNumber", getRegistrationNumber());
		attributes.put("duration", getDuration());
		attributes.put("dateOfIssued", getDateOfIssued());
		attributes.put("productionTitle", getProductionTitle());
		attributes.put("productionDateFrom", getProductionDateFrom());
		attributes.put("productionDateTo", getProductionDateTo());
		attributes.put("termsAndConditions", getTermsAndConditions());
		attributes.put("docFileEntrys", getDocFileEntrys());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long filmFullRegistrationId = (Long)attributes.get(
			"filmFullRegistrationId");

		if (filmFullRegistrationId != null) {
			setFilmFullRegistrationId(filmFullRegistrationId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String productionType = (String)attributes.get("productionType");

		if (productionType != null) {
			setProductionType(productionType);
		}

		String registrationNumber = (String)attributes.get(
			"registrationNumber");

		if (registrationNumber != null) {
			setRegistrationNumber(registrationNumber);
		}

		String duration = (String)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Date dateOfIssued = (Date)attributes.get("dateOfIssued");

		if (dateOfIssued != null) {
			setDateOfIssued(dateOfIssued);
		}

		String productionTitle = (String)attributes.get("productionTitle");

		if (productionTitle != null) {
			setProductionTitle(productionTitle);
		}

		Date productionDateFrom = (Date)attributes.get("productionDateFrom");

		if (productionDateFrom != null) {
			setProductionDateFrom(productionDateFrom);
		}

		Date productionDateTo = (Date)attributes.get("productionDateTo");

		if (productionDateTo != null) {
			setProductionDateTo(productionDateTo);
		}

		String termsAndConditions = (String)attributes.get(
			"termsAndConditions");

		if (termsAndConditions != null) {
			setTermsAndConditions(termsAndConditions);
		}

		Long docFileEntrys = (Long)attributes.get("docFileEntrys");

		if (docFileEntrys != null) {
			setDocFileEntrys(docFileEntrys);
		}
	}

	@Override
	public FilmFullRegistration cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this film full registration.
	 *
	 * @return the case ID of this film full registration
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this film full registration.
	 *
	 * @return the company ID of this film full registration
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this film full registration.
	 *
	 * @return the create date of this film full registration
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of issued of this film full registration.
	 *
	 * @return the date of issued of this film full registration
	 */
	@Override
	public Date getDateOfIssued() {
		return model.getDateOfIssued();
	}

	/**
	 * Returns the doc file entrys of this film full registration.
	 *
	 * @return the doc file entrys of this film full registration
	 */
	@Override
	public long getDocFileEntrys() {
		return model.getDocFileEntrys();
	}

	/**
	 * Returns the duration of this film full registration.
	 *
	 * @return the duration of this film full registration
	 */
	@Override
	public String getDuration() {
		return model.getDuration();
	}

	/**
	 * Returns the film full registration ID of this film full registration.
	 *
	 * @return the film full registration ID of this film full registration
	 */
	@Override
	public long getFilmFullRegistrationId() {
		return model.getFilmFullRegistrationId();
	}

	/**
	 * Returns the group ID of this film full registration.
	 *
	 * @return the group ID of this film full registration
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this film full registration.
	 *
	 * @return the modified date of this film full registration
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this film full registration.
	 *
	 * @return the name of applicant of this film full registration
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the primary key of this film full registration.
	 *
	 * @return the primary key of this film full registration
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the production date from of this film full registration.
	 *
	 * @return the production date from of this film full registration
	 */
	@Override
	public Date getProductionDateFrom() {
		return model.getProductionDateFrom();
	}

	/**
	 * Returns the production date to of this film full registration.
	 *
	 * @return the production date to of this film full registration
	 */
	@Override
	public Date getProductionDateTo() {
		return model.getProductionDateTo();
	}

	/**
	 * Returns the production title of this film full registration.
	 *
	 * @return the production title of this film full registration
	 */
	@Override
	public String getProductionTitle() {
		return model.getProductionTitle();
	}

	/**
	 * Returns the production type of this film full registration.
	 *
	 * @return the production type of this film full registration
	 */
	@Override
	public String getProductionType() {
		return model.getProductionType();
	}

	/**
	 * Returns the registration number of this film full registration.
	 *
	 * @return the registration number of this film full registration
	 */
	@Override
	public String getRegistrationNumber() {
		return model.getRegistrationNumber();
	}

	/**
	 * Returns the terms and conditions of this film full registration.
	 *
	 * @return the terms and conditions of this film full registration
	 */
	@Override
	public String getTermsAndConditions() {
		return model.getTermsAndConditions();
	}

	/**
	 * Returns the user ID of this film full registration.
	 *
	 * @return the user ID of this film full registration
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this film full registration.
	 *
	 * @return the user name of this film full registration
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this film full registration.
	 *
	 * @return the user uuid of this film full registration
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
	 * Sets the case ID of this film full registration.
	 *
	 * @param caseId the case ID of this film full registration
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this film full registration.
	 *
	 * @param companyId the company ID of this film full registration
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this film full registration.
	 *
	 * @param createDate the create date of this film full registration
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of issued of this film full registration.
	 *
	 * @param dateOfIssued the date of issued of this film full registration
	 */
	@Override
	public void setDateOfIssued(Date dateOfIssued) {
		model.setDateOfIssued(dateOfIssued);
	}

	/**
	 * Sets the doc file entrys of this film full registration.
	 *
	 * @param docFileEntrys the doc file entrys of this film full registration
	 */
	@Override
	public void setDocFileEntrys(long docFileEntrys) {
		model.setDocFileEntrys(docFileEntrys);
	}

	/**
	 * Sets the duration of this film full registration.
	 *
	 * @param duration the duration of this film full registration
	 */
	@Override
	public void setDuration(String duration) {
		model.setDuration(duration);
	}

	/**
	 * Sets the film full registration ID of this film full registration.
	 *
	 * @param filmFullRegistrationId the film full registration ID of this film full registration
	 */
	@Override
	public void setFilmFullRegistrationId(long filmFullRegistrationId) {
		model.setFilmFullRegistrationId(filmFullRegistrationId);
	}

	/**
	 * Sets the group ID of this film full registration.
	 *
	 * @param groupId the group ID of this film full registration
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this film full registration.
	 *
	 * @param modifiedDate the modified date of this film full registration
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this film full registration.
	 *
	 * @param nameOfApplicant the name of applicant of this film full registration
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the primary key of this film full registration.
	 *
	 * @param primaryKey the primary key of this film full registration
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the production date from of this film full registration.
	 *
	 * @param productionDateFrom the production date from of this film full registration
	 */
	@Override
	public void setProductionDateFrom(Date productionDateFrom) {
		model.setProductionDateFrom(productionDateFrom);
	}

	/**
	 * Sets the production date to of this film full registration.
	 *
	 * @param productionDateTo the production date to of this film full registration
	 */
	@Override
	public void setProductionDateTo(Date productionDateTo) {
		model.setProductionDateTo(productionDateTo);
	}

	/**
	 * Sets the production title of this film full registration.
	 *
	 * @param productionTitle the production title of this film full registration
	 */
	@Override
	public void setProductionTitle(String productionTitle) {
		model.setProductionTitle(productionTitle);
	}

	/**
	 * Sets the production type of this film full registration.
	 *
	 * @param productionType the production type of this film full registration
	 */
	@Override
	public void setProductionType(String productionType) {
		model.setProductionType(productionType);
	}

	/**
	 * Sets the registration number of this film full registration.
	 *
	 * @param registrationNumber the registration number of this film full registration
	 */
	@Override
	public void setRegistrationNumber(String registrationNumber) {
		model.setRegistrationNumber(registrationNumber);
	}

	/**
	 * Sets the terms and conditions of this film full registration.
	 *
	 * @param termsAndConditions the terms and conditions of this film full registration
	 */
	@Override
	public void setTermsAndConditions(String termsAndConditions) {
		model.setTermsAndConditions(termsAndConditions);
	}

	/**
	 * Sets the user ID of this film full registration.
	 *
	 * @param userId the user ID of this film full registration
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this film full registration.
	 *
	 * @param userName the user name of this film full registration
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this film full registration.
	 *
	 * @param userUuid the user uuid of this film full registration
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
	protected FilmFullRegistrationWrapper wrap(
		FilmFullRegistration filmFullRegistration) {

		return new FilmFullRegistrationWrapper(filmFullRegistration);
	}

}