/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FitPropBusinessInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropBusinessInfo
 * @generated
 */
public class FitPropBusinessInfoWrapper
	extends BaseModelWrapper<FitPropBusinessInfo>
	implements FitPropBusinessInfo, ModelWrapper<FitPropBusinessInfo> {

	public FitPropBusinessInfoWrapper(FitPropBusinessInfo fitPropBusinessInfo) {
		super(fitPropBusinessInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fitPropBusinessInfoId", getFitPropBusinessInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyType", getCompanyType());
		attributes.put("applicantBusinessName", getApplicantBusinessName());
		attributes.put("applicantcomName", getApplicantcomName());
		attributes.put("applicantComAddress", getApplicantComAddress());
		attributes.put(
			"applicantComAddressParish", getApplicantComAddressParish());
		attributes.put("applicantComNo", getApplicantComNo());
		attributes.put("applicantComEmail", getApplicantComEmail());
		attributes.put("applicantComTelephone", getApplicantComTelephone());
		attributes.put("applicantComTitle", getApplicantComTitle());
		attributes.put("materialTechnology", getMaterialTechnology());
		attributes.put("relevantBox", getRelevantBox());
		attributes.put("corporateDirector", getCorporateDirector());
		attributes.put("facilitySources", getFacilitySources());
		attributes.put("criminalFraud", getCriminalFraud());
		attributes.put("professionalSubject", getProfessionalSubject());
		attributes.put("employmentResign", getEmploymentResign());
		attributes.put("mentallyIll", getMentallyIll());
		attributes.put("bankruptAuthority", getBankruptAuthority());
		attributes.put("circumstancesEvent", getCircumstancesEvent());
		attributes.put("partnershipHsra", getPartnershipHsra());
		attributes.put("facilityAssociated", getFacilityAssociated());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fitPropBusinessInfoId = (Long)attributes.get(
			"fitPropBusinessInfoId");

		if (fitPropBusinessInfoId != null) {
			setFitPropBusinessInfoId(fitPropBusinessInfoId);
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

		String companyType = (String)attributes.get("companyType");

		if (companyType != null) {
			setCompanyType(companyType);
		}

		String applicantBusinessName = (String)attributes.get(
			"applicantBusinessName");

		if (applicantBusinessName != null) {
			setApplicantBusinessName(applicantBusinessName);
		}

		String applicantcomName = (String)attributes.get("applicantcomName");

		if (applicantcomName != null) {
			setApplicantcomName(applicantcomName);
		}

		String applicantComAddress = (String)attributes.get(
			"applicantComAddress");

		if (applicantComAddress != null) {
			setApplicantComAddress(applicantComAddress);
		}

		String applicantComAddressParish = (String)attributes.get(
			"applicantComAddressParish");

		if (applicantComAddressParish != null) {
			setApplicantComAddressParish(applicantComAddressParish);
		}

		String applicantComNo = (String)attributes.get("applicantComNo");

		if (applicantComNo != null) {
			setApplicantComNo(applicantComNo);
		}

		String applicantComEmail = (String)attributes.get("applicantComEmail");

		if (applicantComEmail != null) {
			setApplicantComEmail(applicantComEmail);
		}

		String applicantComTelephone = (String)attributes.get(
			"applicantComTelephone");

		if (applicantComTelephone != null) {
			setApplicantComTelephone(applicantComTelephone);
		}

		String applicantComTitle = (String)attributes.get("applicantComTitle");

		if (applicantComTitle != null) {
			setApplicantComTitle(applicantComTitle);
		}

		String materialTechnology = (String)attributes.get(
			"materialTechnology");

		if (materialTechnology != null) {
			setMaterialTechnology(materialTechnology);
		}

		String relevantBox = (String)attributes.get("relevantBox");

		if (relevantBox != null) {
			setRelevantBox(relevantBox);
		}

		String corporateDirector = (String)attributes.get("corporateDirector");

		if (corporateDirector != null) {
			setCorporateDirector(corporateDirector);
		}

		String facilitySources = (String)attributes.get("facilitySources");

		if (facilitySources != null) {
			setFacilitySources(facilitySources);
		}

		String criminalFraud = (String)attributes.get("criminalFraud");

		if (criminalFraud != null) {
			setCriminalFraud(criminalFraud);
		}

		String professionalSubject = (String)attributes.get(
			"professionalSubject");

		if (professionalSubject != null) {
			setProfessionalSubject(professionalSubject);
		}

		String employmentResign = (String)attributes.get("employmentResign");

		if (employmentResign != null) {
			setEmploymentResign(employmentResign);
		}

		String mentallyIll = (String)attributes.get("mentallyIll");

		if (mentallyIll != null) {
			setMentallyIll(mentallyIll);
		}

		String bankruptAuthority = (String)attributes.get("bankruptAuthority");

		if (bankruptAuthority != null) {
			setBankruptAuthority(bankruptAuthority);
		}

		String circumstancesEvent = (String)attributes.get(
			"circumstancesEvent");

		if (circumstancesEvent != null) {
			setCircumstancesEvent(circumstancesEvent);
		}

		String partnershipHsra = (String)attributes.get("partnershipHsra");

		if (partnershipHsra != null) {
			setPartnershipHsra(partnershipHsra);
		}

		String facilityAssociated = (String)attributes.get(
			"facilityAssociated");

		if (facilityAssociated != null) {
			setFacilityAssociated(facilityAssociated);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public FitPropBusinessInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant business name of this fit prop business info.
	 *
	 * @return the applicant business name of this fit prop business info
	 */
	@Override
	public String getApplicantBusinessName() {
		return model.getApplicantBusinessName();
	}

	/**
	 * Returns the applicant com address of this fit prop business info.
	 *
	 * @return the applicant com address of this fit prop business info
	 */
	@Override
	public String getApplicantComAddress() {
		return model.getApplicantComAddress();
	}

	/**
	 * Returns the applicant com address parish of this fit prop business info.
	 *
	 * @return the applicant com address parish of this fit prop business info
	 */
	@Override
	public String getApplicantComAddressParish() {
		return model.getApplicantComAddressParish();
	}

	/**
	 * Returns the applicant com email of this fit prop business info.
	 *
	 * @return the applicant com email of this fit prop business info
	 */
	@Override
	public String getApplicantComEmail() {
		return model.getApplicantComEmail();
	}

	/**
	 * Returns the applicantcom name of this fit prop business info.
	 *
	 * @return the applicantcom name of this fit prop business info
	 */
	@Override
	public String getApplicantcomName() {
		return model.getApplicantcomName();
	}

	/**
	 * Returns the applicant com no of this fit prop business info.
	 *
	 * @return the applicant com no of this fit prop business info
	 */
	@Override
	public String getApplicantComNo() {
		return model.getApplicantComNo();
	}

	/**
	 * Returns the applicant com telephone of this fit prop business info.
	 *
	 * @return the applicant com telephone of this fit prop business info
	 */
	@Override
	public String getApplicantComTelephone() {
		return model.getApplicantComTelephone();
	}

	/**
	 * Returns the applicant com title of this fit prop business info.
	 *
	 * @return the applicant com title of this fit prop business info
	 */
	@Override
	public String getApplicantComTitle() {
		return model.getApplicantComTitle();
	}

	/**
	 * Returns the bankrupt authority of this fit prop business info.
	 *
	 * @return the bankrupt authority of this fit prop business info
	 */
	@Override
	public String getBankruptAuthority() {
		return model.getBankruptAuthority();
	}

	/**
	 * Returns the circumstances event of this fit prop business info.
	 *
	 * @return the circumstances event of this fit prop business info
	 */
	@Override
	public String getCircumstancesEvent() {
		return model.getCircumstancesEvent();
	}

	/**
	 * Returns the company ID of this fit prop business info.
	 *
	 * @return the company ID of this fit prop business info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company type of this fit prop business info.
	 *
	 * @return the company type of this fit prop business info
	 */
	@Override
	public String getCompanyType() {
		return model.getCompanyType();
	}

	/**
	 * Returns the corporate director of this fit prop business info.
	 *
	 * @return the corporate director of this fit prop business info
	 */
	@Override
	public String getCorporateDirector() {
		return model.getCorporateDirector();
	}

	/**
	 * Returns the create date of this fit prop business info.
	 *
	 * @return the create date of this fit prop business info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the criminal fraud of this fit prop business info.
	 *
	 * @return the criminal fraud of this fit prop business info
	 */
	@Override
	public String getCriminalFraud() {
		return model.getCriminalFraud();
	}

	/**
	 * Returns the employment resign of this fit prop business info.
	 *
	 * @return the employment resign of this fit prop business info
	 */
	@Override
	public String getEmploymentResign() {
		return model.getEmploymentResign();
	}

	/**
	 * Returns the facility associated of this fit prop business info.
	 *
	 * @return the facility associated of this fit prop business info
	 */
	@Override
	public String getFacilityAssociated() {
		return model.getFacilityAssociated();
	}

	/**
	 * Returns the facility sources of this fit prop business info.
	 *
	 * @return the facility sources of this fit prop business info
	 */
	@Override
	public String getFacilitySources() {
		return model.getFacilitySources();
	}

	/**
	 * Returns the fit prop business info ID of this fit prop business info.
	 *
	 * @return the fit prop business info ID of this fit prop business info
	 */
	@Override
	public long getFitPropBusinessInfoId() {
		return model.getFitPropBusinessInfoId();
	}

	/**
	 * Returns the group ID of this fit prop business info.
	 *
	 * @return the group ID of this fit prop business info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this fit prop business info.
	 *
	 * @return the hsra application ID of this fit prop business info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the material technology of this fit prop business info.
	 *
	 * @return the material technology of this fit prop business info
	 */
	@Override
	public String getMaterialTechnology() {
		return model.getMaterialTechnology();
	}

	/**
	 * Returns the mentally ill of this fit prop business info.
	 *
	 * @return the mentally ill of this fit prop business info
	 */
	@Override
	public String getMentallyIll() {
		return model.getMentallyIll();
	}

	/**
	 * Returns the modified date of this fit prop business info.
	 *
	 * @return the modified date of this fit prop business info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the partnership hsra of this fit prop business info.
	 *
	 * @return the partnership hsra of this fit prop business info
	 */
	@Override
	public String getPartnershipHsra() {
		return model.getPartnershipHsra();
	}

	/**
	 * Returns the primary key of this fit prop business info.
	 *
	 * @return the primary key of this fit prop business info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the professional subject of this fit prop business info.
	 *
	 * @return the professional subject of this fit prop business info
	 */
	@Override
	public String getProfessionalSubject() {
		return model.getProfessionalSubject();
	}

	/**
	 * Returns the relevant box of this fit prop business info.
	 *
	 * @return the relevant box of this fit prop business info
	 */
	@Override
	public String getRelevantBox() {
		return model.getRelevantBox();
	}

	/**
	 * Returns the user ID of this fit prop business info.
	 *
	 * @return the user ID of this fit prop business info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fit prop business info.
	 *
	 * @return the user name of this fit prop business info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fit prop business info.
	 *
	 * @return the user uuid of this fit prop business info
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
	 * Sets the applicant business name of this fit prop business info.
	 *
	 * @param applicantBusinessName the applicant business name of this fit prop business info
	 */
	@Override
	public void setApplicantBusinessName(String applicantBusinessName) {
		model.setApplicantBusinessName(applicantBusinessName);
	}

	/**
	 * Sets the applicant com address of this fit prop business info.
	 *
	 * @param applicantComAddress the applicant com address of this fit prop business info
	 */
	@Override
	public void setApplicantComAddress(String applicantComAddress) {
		model.setApplicantComAddress(applicantComAddress);
	}

	/**
	 * Sets the applicant com address parish of this fit prop business info.
	 *
	 * @param applicantComAddressParish the applicant com address parish of this fit prop business info
	 */
	@Override
	public void setApplicantComAddressParish(String applicantComAddressParish) {
		model.setApplicantComAddressParish(applicantComAddressParish);
	}

	/**
	 * Sets the applicant com email of this fit prop business info.
	 *
	 * @param applicantComEmail the applicant com email of this fit prop business info
	 */
	@Override
	public void setApplicantComEmail(String applicantComEmail) {
		model.setApplicantComEmail(applicantComEmail);
	}

	/**
	 * Sets the applicantcom name of this fit prop business info.
	 *
	 * @param applicantcomName the applicantcom name of this fit prop business info
	 */
	@Override
	public void setApplicantcomName(String applicantcomName) {
		model.setApplicantcomName(applicantcomName);
	}

	/**
	 * Sets the applicant com no of this fit prop business info.
	 *
	 * @param applicantComNo the applicant com no of this fit prop business info
	 */
	@Override
	public void setApplicantComNo(String applicantComNo) {
		model.setApplicantComNo(applicantComNo);
	}

	/**
	 * Sets the applicant com telephone of this fit prop business info.
	 *
	 * @param applicantComTelephone the applicant com telephone of this fit prop business info
	 */
	@Override
	public void setApplicantComTelephone(String applicantComTelephone) {
		model.setApplicantComTelephone(applicantComTelephone);
	}

	/**
	 * Sets the applicant com title of this fit prop business info.
	 *
	 * @param applicantComTitle the applicant com title of this fit prop business info
	 */
	@Override
	public void setApplicantComTitle(String applicantComTitle) {
		model.setApplicantComTitle(applicantComTitle);
	}

	/**
	 * Sets the bankrupt authority of this fit prop business info.
	 *
	 * @param bankruptAuthority the bankrupt authority of this fit prop business info
	 */
	@Override
	public void setBankruptAuthority(String bankruptAuthority) {
		model.setBankruptAuthority(bankruptAuthority);
	}

	/**
	 * Sets the circumstances event of this fit prop business info.
	 *
	 * @param circumstancesEvent the circumstances event of this fit prop business info
	 */
	@Override
	public void setCircumstancesEvent(String circumstancesEvent) {
		model.setCircumstancesEvent(circumstancesEvent);
	}

	/**
	 * Sets the company ID of this fit prop business info.
	 *
	 * @param companyId the company ID of this fit prop business info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company type of this fit prop business info.
	 *
	 * @param companyType the company type of this fit prop business info
	 */
	@Override
	public void setCompanyType(String companyType) {
		model.setCompanyType(companyType);
	}

	/**
	 * Sets the corporate director of this fit prop business info.
	 *
	 * @param corporateDirector the corporate director of this fit prop business info
	 */
	@Override
	public void setCorporateDirector(String corporateDirector) {
		model.setCorporateDirector(corporateDirector);
	}

	/**
	 * Sets the create date of this fit prop business info.
	 *
	 * @param createDate the create date of this fit prop business info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the criminal fraud of this fit prop business info.
	 *
	 * @param criminalFraud the criminal fraud of this fit prop business info
	 */
	@Override
	public void setCriminalFraud(String criminalFraud) {
		model.setCriminalFraud(criminalFraud);
	}

	/**
	 * Sets the employment resign of this fit prop business info.
	 *
	 * @param employmentResign the employment resign of this fit prop business info
	 */
	@Override
	public void setEmploymentResign(String employmentResign) {
		model.setEmploymentResign(employmentResign);
	}

	/**
	 * Sets the facility associated of this fit prop business info.
	 *
	 * @param facilityAssociated the facility associated of this fit prop business info
	 */
	@Override
	public void setFacilityAssociated(String facilityAssociated) {
		model.setFacilityAssociated(facilityAssociated);
	}

	/**
	 * Sets the facility sources of this fit prop business info.
	 *
	 * @param facilitySources the facility sources of this fit prop business info
	 */
	@Override
	public void setFacilitySources(String facilitySources) {
		model.setFacilitySources(facilitySources);
	}

	/**
	 * Sets the fit prop business info ID of this fit prop business info.
	 *
	 * @param fitPropBusinessInfoId the fit prop business info ID of this fit prop business info
	 */
	@Override
	public void setFitPropBusinessInfoId(long fitPropBusinessInfoId) {
		model.setFitPropBusinessInfoId(fitPropBusinessInfoId);
	}

	/**
	 * Sets the group ID of this fit prop business info.
	 *
	 * @param groupId the group ID of this fit prop business info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this fit prop business info.
	 *
	 * @param hsraApplicationId the hsra application ID of this fit prop business info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the material technology of this fit prop business info.
	 *
	 * @param materialTechnology the material technology of this fit prop business info
	 */
	@Override
	public void setMaterialTechnology(String materialTechnology) {
		model.setMaterialTechnology(materialTechnology);
	}

	/**
	 * Sets the mentally ill of this fit prop business info.
	 *
	 * @param mentallyIll the mentally ill of this fit prop business info
	 */
	@Override
	public void setMentallyIll(String mentallyIll) {
		model.setMentallyIll(mentallyIll);
	}

	/**
	 * Sets the modified date of this fit prop business info.
	 *
	 * @param modifiedDate the modified date of this fit prop business info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the partnership hsra of this fit prop business info.
	 *
	 * @param partnershipHsra the partnership hsra of this fit prop business info
	 */
	@Override
	public void setPartnershipHsra(String partnershipHsra) {
		model.setPartnershipHsra(partnershipHsra);
	}

	/**
	 * Sets the primary key of this fit prop business info.
	 *
	 * @param primaryKey the primary key of this fit prop business info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the professional subject of this fit prop business info.
	 *
	 * @param professionalSubject the professional subject of this fit prop business info
	 */
	@Override
	public void setProfessionalSubject(String professionalSubject) {
		model.setProfessionalSubject(professionalSubject);
	}

	/**
	 * Sets the relevant box of this fit prop business info.
	 *
	 * @param relevantBox the relevant box of this fit prop business info
	 */
	@Override
	public void setRelevantBox(String relevantBox) {
		model.setRelevantBox(relevantBox);
	}

	/**
	 * Sets the user ID of this fit prop business info.
	 *
	 * @param userId the user ID of this fit prop business info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fit prop business info.
	 *
	 * @param userName the user name of this fit prop business info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fit prop business info.
	 *
	 * @param userUuid the user uuid of this fit prop business info
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
	protected FitPropBusinessInfoWrapper wrap(
		FitPropBusinessInfo fitPropBusinessInfo) {

		return new FitPropBusinessInfoWrapper(fitPropBusinessInfo);
	}

}