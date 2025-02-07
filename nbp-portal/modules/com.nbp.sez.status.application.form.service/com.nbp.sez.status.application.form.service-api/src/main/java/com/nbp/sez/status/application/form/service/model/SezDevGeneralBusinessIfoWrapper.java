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
 * This class is a wrapper for {@link SezDevGeneralBusinessIfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGeneralBusinessIfo
 * @generated
 */
public class SezDevGeneralBusinessIfoWrapper
	extends BaseModelWrapper<SezDevGeneralBusinessIfo>
	implements ModelWrapper<SezDevGeneralBusinessIfo>,
			   SezDevGeneralBusinessIfo {

	public SezDevGeneralBusinessIfoWrapper(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		super(sezDevGeneralBusinessIfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevGeneralBusinessIfoId", getSezDevGeneralBusinessIfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("applicationDate", getApplicationDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("companyName", getCompanyName());
		attributes.put("buildingNum", getBuildingNum());
		attributes.put("townCity", getTownCity());
		attributes.put("Parish", getParish());
		attributes.put("country", getCountry());
		attributes.put("telephoneNum", getTelephoneNum());
		attributes.put("faxNum", getFaxNum());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("website", getWebsite());
		attributes.put("headOfficeBuildingNum", getHeadOfficeBuildingNum());
		attributes.put("headOfficeTown", getHeadOfficeTown());
		attributes.put("headOfficeParish", getHeadOfficeParish());
		attributes.put("authRepName", getAuthRepName());
		attributes.put("authRepBuildingNum", getAuthRepBuildingNum());
		attributes.put("authRepTown", getAuthRepTown());
		attributes.put("authRepParish", getAuthRepParish());
		attributes.put("authRepCountry", getAuthRepCountry());
		attributes.put("authReptelephoneNum", getAuthReptelephoneNum());
		attributes.put("authRepFaxNum", getAuthRepFaxNum());
		attributes.put("autheEmailAddress", getAutheEmailAddress());
		attributes.put("joinVenture", getJoinVenture());
		attributes.put("existingJamicanCom", getExistingJamicanCom());
		attributes.put("articleOfIncorporation", getArticleOfIncorporation());
		attributes.put("pleaseSpecify", getPleaseSpecify());
		attributes.put("companyClassified", getCompanyClassified());
		attributes.put("taxRegisNum", getTaxRegisNum());
		attributes.put("genConsumptionNum", getGenConsumptionNum());
		attributes.put(
			"taxComplianceCertificateNum", getTaxComplianceCertificateNum());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevGeneralBusinessIfoId = (Long)attributes.get(
			"sezDevGeneralBusinessIfoId");

		if (sezDevGeneralBusinessIfoId != null) {
			setSezDevGeneralBusinessIfoId(sezDevGeneralBusinessIfoId);
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

		Date applicationDate = (Date)attributes.get("applicationDate");

		if (applicationDate != null) {
			setApplicationDate(applicationDate);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String buildingNum = (String)attributes.get("buildingNum");

		if (buildingNum != null) {
			setBuildingNum(buildingNum);
		}

		String townCity = (String)attributes.get("townCity");

		if (townCity != null) {
			setTownCity(townCity);
		}

		String Parish = (String)attributes.get("Parish");

		if (Parish != null) {
			setParish(Parish);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String telephoneNum = (String)attributes.get("telephoneNum");

		if (telephoneNum != null) {
			setTelephoneNum(telephoneNum);
		}

		String faxNum = (String)attributes.get("faxNum");

		if (faxNum != null) {
			setFaxNum(faxNum);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String headOfficeBuildingNum = (String)attributes.get(
			"headOfficeBuildingNum");

		if (headOfficeBuildingNum != null) {
			setHeadOfficeBuildingNum(headOfficeBuildingNum);
		}

		String headOfficeTown = (String)attributes.get("headOfficeTown");

		if (headOfficeTown != null) {
			setHeadOfficeTown(headOfficeTown);
		}

		String headOfficeParish = (String)attributes.get("headOfficeParish");

		if (headOfficeParish != null) {
			setHeadOfficeParish(headOfficeParish);
		}

		String authRepName = (String)attributes.get("authRepName");

		if (authRepName != null) {
			setAuthRepName(authRepName);
		}

		String authRepBuildingNum = (String)attributes.get(
			"authRepBuildingNum");

		if (authRepBuildingNum != null) {
			setAuthRepBuildingNum(authRepBuildingNum);
		}

		String authRepTown = (String)attributes.get("authRepTown");

		if (authRepTown != null) {
			setAuthRepTown(authRepTown);
		}

		String authRepParish = (String)attributes.get("authRepParish");

		if (authRepParish != null) {
			setAuthRepParish(authRepParish);
		}

		String authRepCountry = (String)attributes.get("authRepCountry");

		if (authRepCountry != null) {
			setAuthRepCountry(authRepCountry);
		}

		String authReptelephoneNum = (String)attributes.get(
			"authReptelephoneNum");

		if (authReptelephoneNum != null) {
			setAuthReptelephoneNum(authReptelephoneNum);
		}

		String authRepFaxNum = (String)attributes.get("authRepFaxNum");

		if (authRepFaxNum != null) {
			setAuthRepFaxNum(authRepFaxNum);
		}

		String autheEmailAddress = (String)attributes.get("autheEmailAddress");

		if (autheEmailAddress != null) {
			setAutheEmailAddress(autheEmailAddress);
		}

		String joinVenture = (String)attributes.get("joinVenture");

		if (joinVenture != null) {
			setJoinVenture(joinVenture);
		}

		String existingJamicanCom = (String)attributes.get(
			"existingJamicanCom");

		if (existingJamicanCom != null) {
			setExistingJamicanCom(existingJamicanCom);
		}

		String articleOfIncorporation = (String)attributes.get(
			"articleOfIncorporation");

		if (articleOfIncorporation != null) {
			setArticleOfIncorporation(articleOfIncorporation);
		}

		String pleaseSpecify = (String)attributes.get("pleaseSpecify");

		if (pleaseSpecify != null) {
			setPleaseSpecify(pleaseSpecify);
		}

		String companyClassified = (String)attributes.get("companyClassified");

		if (companyClassified != null) {
			setCompanyClassified(companyClassified);
		}

		String taxRegisNum = (String)attributes.get("taxRegisNum");

		if (taxRegisNum != null) {
			setTaxRegisNum(taxRegisNum);
		}

		String genConsumptionNum = (String)attributes.get("genConsumptionNum");

		if (genConsumptionNum != null) {
			setGenConsumptionNum(genConsumptionNum);
		}

		String taxComplianceCertificateNum = (String)attributes.get(
			"taxComplianceCertificateNum");

		if (taxComplianceCertificateNum != null) {
			setTaxComplianceCertificateNum(taxComplianceCertificateNum);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevGeneralBusinessIfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant name of this sez dev general business ifo.
	 *
	 * @return the applicant name of this sez dev general business ifo
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the application date of this sez dev general business ifo.
	 *
	 * @return the application date of this sez dev general business ifo
	 */
	@Override
	public Date getApplicationDate() {
		return model.getApplicationDate();
	}

	/**
	 * Returns the article of incorporation of this sez dev general business ifo.
	 *
	 * @return the article of incorporation of this sez dev general business ifo
	 */
	@Override
	public String getArticleOfIncorporation() {
		return model.getArticleOfIncorporation();
	}

	/**
	 * Returns the authe email address of this sez dev general business ifo.
	 *
	 * @return the authe email address of this sez dev general business ifo
	 */
	@Override
	public String getAutheEmailAddress() {
		return model.getAutheEmailAddress();
	}

	/**
	 * Returns the auth rep building num of this sez dev general business ifo.
	 *
	 * @return the auth rep building num of this sez dev general business ifo
	 */
	@Override
	public String getAuthRepBuildingNum() {
		return model.getAuthRepBuildingNum();
	}

	/**
	 * Returns the auth rep country of this sez dev general business ifo.
	 *
	 * @return the auth rep country of this sez dev general business ifo
	 */
	@Override
	public String getAuthRepCountry() {
		return model.getAuthRepCountry();
	}

	/**
	 * Returns the auth rep fax num of this sez dev general business ifo.
	 *
	 * @return the auth rep fax num of this sez dev general business ifo
	 */
	@Override
	public String getAuthRepFaxNum() {
		return model.getAuthRepFaxNum();
	}

	/**
	 * Returns the auth rep name of this sez dev general business ifo.
	 *
	 * @return the auth rep name of this sez dev general business ifo
	 */
	@Override
	public String getAuthRepName() {
		return model.getAuthRepName();
	}

	/**
	 * Returns the auth rep parish of this sez dev general business ifo.
	 *
	 * @return the auth rep parish of this sez dev general business ifo
	 */
	@Override
	public String getAuthRepParish() {
		return model.getAuthRepParish();
	}

	/**
	 * Returns the auth reptelephone num of this sez dev general business ifo.
	 *
	 * @return the auth reptelephone num of this sez dev general business ifo
	 */
	@Override
	public String getAuthReptelephoneNum() {
		return model.getAuthReptelephoneNum();
	}

	/**
	 * Returns the auth rep town of this sez dev general business ifo.
	 *
	 * @return the auth rep town of this sez dev general business ifo
	 */
	@Override
	public String getAuthRepTown() {
		return model.getAuthRepTown();
	}

	/**
	 * Returns the building num of this sez dev general business ifo.
	 *
	 * @return the building num of this sez dev general business ifo
	 */
	@Override
	public String getBuildingNum() {
		return model.getBuildingNum();
	}

	/**
	 * Returns the company classified of this sez dev general business ifo.
	 *
	 * @return the company classified of this sez dev general business ifo
	 */
	@Override
	public String getCompanyClassified() {
		return model.getCompanyClassified();
	}

	/**
	 * Returns the company ID of this sez dev general business ifo.
	 *
	 * @return the company ID of this sez dev general business ifo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this sez dev general business ifo.
	 *
	 * @return the company name of this sez dev general business ifo
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the country of this sez dev general business ifo.
	 *
	 * @return the country of this sez dev general business ifo
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this sez dev general business ifo.
	 *
	 * @return the create date of this sez dev general business ifo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this sez dev general business ifo.
	 *
	 * @return the email address of this sez dev general business ifo
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the existing jamican com of this sez dev general business ifo.
	 *
	 * @return the existing jamican com of this sez dev general business ifo
	 */
	@Override
	public String getExistingJamicanCom() {
		return model.getExistingJamicanCom();
	}

	/**
	 * Returns the fax num of this sez dev general business ifo.
	 *
	 * @return the fax num of this sez dev general business ifo
	 */
	@Override
	public String getFaxNum() {
		return model.getFaxNum();
	}

	/**
	 * Returns the gen consumption num of this sez dev general business ifo.
	 *
	 * @return the gen consumption num of this sez dev general business ifo
	 */
	@Override
	public String getGenConsumptionNum() {
		return model.getGenConsumptionNum();
	}

	/**
	 * Returns the group ID of this sez dev general business ifo.
	 *
	 * @return the group ID of this sez dev general business ifo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the head office building num of this sez dev general business ifo.
	 *
	 * @return the head office building num of this sez dev general business ifo
	 */
	@Override
	public String getHeadOfficeBuildingNum() {
		return model.getHeadOfficeBuildingNum();
	}

	/**
	 * Returns the head office parish of this sez dev general business ifo.
	 *
	 * @return the head office parish of this sez dev general business ifo
	 */
	@Override
	public String getHeadOfficeParish() {
		return model.getHeadOfficeParish();
	}

	/**
	 * Returns the head office town of this sez dev general business ifo.
	 *
	 * @return the head office town of this sez dev general business ifo
	 */
	@Override
	public String getHeadOfficeTown() {
		return model.getHeadOfficeTown();
	}

	/**
	 * Returns the join venture of this sez dev general business ifo.
	 *
	 * @return the join venture of this sez dev general business ifo
	 */
	@Override
	public String getJoinVenture() {
		return model.getJoinVenture();
	}

	/**
	 * Returns the parish of this sez dev general business ifo.
	 *
	 * @return the parish of this sez dev general business ifo
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the please specify of this sez dev general business ifo.
	 *
	 * @return the please specify of this sez dev general business ifo
	 */
	@Override
	public String getPleaseSpecify() {
		return model.getPleaseSpecify();
	}

	/**
	 * Returns the primary key of this sez dev general business ifo.
	 *
	 * @return the primary key of this sez dev general business ifo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez dev general business ifo ID of this sez dev general business ifo.
	 *
	 * @return the sez dev general business ifo ID of this sez dev general business ifo
	 */
	@Override
	public long getSezDevGeneralBusinessIfoId() {
		return model.getSezDevGeneralBusinessIfoId();
	}

	/**
	 * Returns the sez status application ID of this sez dev general business ifo.
	 *
	 * @return the sez status application ID of this sez dev general business ifo
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the tax compliance certificate num of this sez dev general business ifo.
	 *
	 * @return the tax compliance certificate num of this sez dev general business ifo
	 */
	@Override
	public String getTaxComplianceCertificateNum() {
		return model.getTaxComplianceCertificateNum();
	}

	/**
	 * Returns the tax regis num of this sez dev general business ifo.
	 *
	 * @return the tax regis num of this sez dev general business ifo
	 */
	@Override
	public String getTaxRegisNum() {
		return model.getTaxRegisNum();
	}

	/**
	 * Returns the telephone num of this sez dev general business ifo.
	 *
	 * @return the telephone num of this sez dev general business ifo
	 */
	@Override
	public String getTelephoneNum() {
		return model.getTelephoneNum();
	}

	/**
	 * Returns the town city of this sez dev general business ifo.
	 *
	 * @return the town city of this sez dev general business ifo
	 */
	@Override
	public String getTownCity() {
		return model.getTownCity();
	}

	/**
	 * Returns the user ID of this sez dev general business ifo.
	 *
	 * @return the user ID of this sez dev general business ifo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev general business ifo.
	 *
	 * @return the user name of this sez dev general business ifo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev general business ifo.
	 *
	 * @return the user uuid of this sez dev general business ifo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the website of this sez dev general business ifo.
	 *
	 * @return the website of this sez dev general business ifo
	 */
	@Override
	public String getWebsite() {
		return model.getWebsite();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the applicant name of this sez dev general business ifo.
	 *
	 * @param applicantName the applicant name of this sez dev general business ifo
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the application date of this sez dev general business ifo.
	 *
	 * @param applicationDate the application date of this sez dev general business ifo
	 */
	@Override
	public void setApplicationDate(Date applicationDate) {
		model.setApplicationDate(applicationDate);
	}

	/**
	 * Sets the article of incorporation of this sez dev general business ifo.
	 *
	 * @param articleOfIncorporation the article of incorporation of this sez dev general business ifo
	 */
	@Override
	public void setArticleOfIncorporation(String articleOfIncorporation) {
		model.setArticleOfIncorporation(articleOfIncorporation);
	}

	/**
	 * Sets the authe email address of this sez dev general business ifo.
	 *
	 * @param autheEmailAddress the authe email address of this sez dev general business ifo
	 */
	@Override
	public void setAutheEmailAddress(String autheEmailAddress) {
		model.setAutheEmailAddress(autheEmailAddress);
	}

	/**
	 * Sets the auth rep building num of this sez dev general business ifo.
	 *
	 * @param authRepBuildingNum the auth rep building num of this sez dev general business ifo
	 */
	@Override
	public void setAuthRepBuildingNum(String authRepBuildingNum) {
		model.setAuthRepBuildingNum(authRepBuildingNum);
	}

	/**
	 * Sets the auth rep country of this sez dev general business ifo.
	 *
	 * @param authRepCountry the auth rep country of this sez dev general business ifo
	 */
	@Override
	public void setAuthRepCountry(String authRepCountry) {
		model.setAuthRepCountry(authRepCountry);
	}

	/**
	 * Sets the auth rep fax num of this sez dev general business ifo.
	 *
	 * @param authRepFaxNum the auth rep fax num of this sez dev general business ifo
	 */
	@Override
	public void setAuthRepFaxNum(String authRepFaxNum) {
		model.setAuthRepFaxNum(authRepFaxNum);
	}

	/**
	 * Sets the auth rep name of this sez dev general business ifo.
	 *
	 * @param authRepName the auth rep name of this sez dev general business ifo
	 */
	@Override
	public void setAuthRepName(String authRepName) {
		model.setAuthRepName(authRepName);
	}

	/**
	 * Sets the auth rep parish of this sez dev general business ifo.
	 *
	 * @param authRepParish the auth rep parish of this sez dev general business ifo
	 */
	@Override
	public void setAuthRepParish(String authRepParish) {
		model.setAuthRepParish(authRepParish);
	}

	/**
	 * Sets the auth reptelephone num of this sez dev general business ifo.
	 *
	 * @param authReptelephoneNum the auth reptelephone num of this sez dev general business ifo
	 */
	@Override
	public void setAuthReptelephoneNum(String authReptelephoneNum) {
		model.setAuthReptelephoneNum(authReptelephoneNum);
	}

	/**
	 * Sets the auth rep town of this sez dev general business ifo.
	 *
	 * @param authRepTown the auth rep town of this sez dev general business ifo
	 */
	@Override
	public void setAuthRepTown(String authRepTown) {
		model.setAuthRepTown(authRepTown);
	}

	/**
	 * Sets the building num of this sez dev general business ifo.
	 *
	 * @param buildingNum the building num of this sez dev general business ifo
	 */
	@Override
	public void setBuildingNum(String buildingNum) {
		model.setBuildingNum(buildingNum);
	}

	/**
	 * Sets the company classified of this sez dev general business ifo.
	 *
	 * @param companyClassified the company classified of this sez dev general business ifo
	 */
	@Override
	public void setCompanyClassified(String companyClassified) {
		model.setCompanyClassified(companyClassified);
	}

	/**
	 * Sets the company ID of this sez dev general business ifo.
	 *
	 * @param companyId the company ID of this sez dev general business ifo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this sez dev general business ifo.
	 *
	 * @param companyName the company name of this sez dev general business ifo
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the country of this sez dev general business ifo.
	 *
	 * @param country the country of this sez dev general business ifo
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this sez dev general business ifo.
	 *
	 * @param createDate the create date of this sez dev general business ifo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this sez dev general business ifo.
	 *
	 * @param emailAddress the email address of this sez dev general business ifo
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the existing jamican com of this sez dev general business ifo.
	 *
	 * @param existingJamicanCom the existing jamican com of this sez dev general business ifo
	 */
	@Override
	public void setExistingJamicanCom(String existingJamicanCom) {
		model.setExistingJamicanCom(existingJamicanCom);
	}

	/**
	 * Sets the fax num of this sez dev general business ifo.
	 *
	 * @param faxNum the fax num of this sez dev general business ifo
	 */
	@Override
	public void setFaxNum(String faxNum) {
		model.setFaxNum(faxNum);
	}

	/**
	 * Sets the gen consumption num of this sez dev general business ifo.
	 *
	 * @param genConsumptionNum the gen consumption num of this sez dev general business ifo
	 */
	@Override
	public void setGenConsumptionNum(String genConsumptionNum) {
		model.setGenConsumptionNum(genConsumptionNum);
	}

	/**
	 * Sets the group ID of this sez dev general business ifo.
	 *
	 * @param groupId the group ID of this sez dev general business ifo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the head office building num of this sez dev general business ifo.
	 *
	 * @param headOfficeBuildingNum the head office building num of this sez dev general business ifo
	 */
	@Override
	public void setHeadOfficeBuildingNum(String headOfficeBuildingNum) {
		model.setHeadOfficeBuildingNum(headOfficeBuildingNum);
	}

	/**
	 * Sets the head office parish of this sez dev general business ifo.
	 *
	 * @param headOfficeParish the head office parish of this sez dev general business ifo
	 */
	@Override
	public void setHeadOfficeParish(String headOfficeParish) {
		model.setHeadOfficeParish(headOfficeParish);
	}

	/**
	 * Sets the head office town of this sez dev general business ifo.
	 *
	 * @param headOfficeTown the head office town of this sez dev general business ifo
	 */
	@Override
	public void setHeadOfficeTown(String headOfficeTown) {
		model.setHeadOfficeTown(headOfficeTown);
	}

	/**
	 * Sets the join venture of this sez dev general business ifo.
	 *
	 * @param joinVenture the join venture of this sez dev general business ifo
	 */
	@Override
	public void setJoinVenture(String joinVenture) {
		model.setJoinVenture(joinVenture);
	}

	/**
	 * Sets the parish of this sez dev general business ifo.
	 *
	 * @param Parish the parish of this sez dev general business ifo
	 */
	@Override
	public void setParish(String Parish) {
		model.setParish(Parish);
	}

	/**
	 * Sets the please specify of this sez dev general business ifo.
	 *
	 * @param pleaseSpecify the please specify of this sez dev general business ifo
	 */
	@Override
	public void setPleaseSpecify(String pleaseSpecify) {
		model.setPleaseSpecify(pleaseSpecify);
	}

	/**
	 * Sets the primary key of this sez dev general business ifo.
	 *
	 * @param primaryKey the primary key of this sez dev general business ifo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez dev general business ifo ID of this sez dev general business ifo.
	 *
	 * @param sezDevGeneralBusinessIfoId the sez dev general business ifo ID of this sez dev general business ifo
	 */
	@Override
	public void setSezDevGeneralBusinessIfoId(long sezDevGeneralBusinessIfoId) {
		model.setSezDevGeneralBusinessIfoId(sezDevGeneralBusinessIfoId);
	}

	/**
	 * Sets the sez status application ID of this sez dev general business ifo.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev general business ifo
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the tax compliance certificate num of this sez dev general business ifo.
	 *
	 * @param taxComplianceCertificateNum the tax compliance certificate num of this sez dev general business ifo
	 */
	@Override
	public void setTaxComplianceCertificateNum(
		String taxComplianceCertificateNum) {

		model.setTaxComplianceCertificateNum(taxComplianceCertificateNum);
	}

	/**
	 * Sets the tax regis num of this sez dev general business ifo.
	 *
	 * @param taxRegisNum the tax regis num of this sez dev general business ifo
	 */
	@Override
	public void setTaxRegisNum(String taxRegisNum) {
		model.setTaxRegisNum(taxRegisNum);
	}

	/**
	 * Sets the telephone num of this sez dev general business ifo.
	 *
	 * @param telephoneNum the telephone num of this sez dev general business ifo
	 */
	@Override
	public void setTelephoneNum(String telephoneNum) {
		model.setTelephoneNum(telephoneNum);
	}

	/**
	 * Sets the town city of this sez dev general business ifo.
	 *
	 * @param townCity the town city of this sez dev general business ifo
	 */
	@Override
	public void setTownCity(String townCity) {
		model.setTownCity(townCity);
	}

	/**
	 * Sets the user ID of this sez dev general business ifo.
	 *
	 * @param userId the user ID of this sez dev general business ifo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev general business ifo.
	 *
	 * @param userName the user name of this sez dev general business ifo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev general business ifo.
	 *
	 * @param userUuid the user uuid of this sez dev general business ifo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the website of this sez dev general business ifo.
	 *
	 * @param website the website of this sez dev general business ifo
	 */
	@Override
	public void setWebsite(String website) {
		model.setWebsite(website);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SezDevGeneralBusinessIfoWrapper wrap(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		return new SezDevGeneralBusinessIfoWrapper(sezDevGeneralBusinessIfo);
	}

}