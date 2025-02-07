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
 * This class is a wrapper for {@link FitPropPersonalDetailInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropPersonalDetailInfo
 * @generated
 */
public class FitPropPersonalDetailInfoWrapper
	extends BaseModelWrapper<FitPropPersonalDetailInfo>
	implements FitPropPersonalDetailInfo,
			   ModelWrapper<FitPropPersonalDetailInfo> {

	public FitPropPersonalDetailInfoWrapper(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		super(fitPropPersonalDetailInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fitPropPersonalDetailInfoId", getFitPropPersonalDetailInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantFirstName", getApplicantFirstName());
		attributes.put("applicantMiddleName", getApplicantMiddleName());
		attributes.put("applicantSurname", getApplicantSurname());
		attributes.put("applicantFormerName", getApplicantFormerName());
		attributes.put("applicantAlias", getApplicantAlias());
		attributes.put("applicantStreetName", getApplicantStreetName());
		attributes.put("applicantStreetNo", getApplicantStreetNo());
		attributes.put("applicantPostalCode", getApplicantPostalCode());
		attributes.put("applicantCountry", getApplicantCountry());
		attributes.put("applicantTownName", getApplicantTownName());
		attributes.put("applicantCity", getApplicantCity());
		attributes.put("applicantParish", getApplicantParish());
		attributes.put("applicantTelephoneNum", getApplicantTelephoneNum());
		attributes.put("applicantEmailAdd", getApplicantEmailAdd());
		attributes.put("applicantDateBirth", getApplicantDateBirth());
		attributes.put(
			"applicantPlaceOfBirthTown", getApplicantPlaceOfBirthTown());
		attributes.put(
			"applicantPlaceOfBirthParish", getApplicantPlaceOfBirthParish());
		attributes.put(
			"applicantPlaceOfBirthCountry", getApplicantPlaceOfBirthCountry());
		attributes.put("applicantNationality", getApplicantNationality());
		attributes.put("applicantNisNum", getApplicantNisNum());
		attributes.put("applicantSocialNum", getApplicantSocialNum());
		attributes.put("applicantNationalNum", getApplicantNationalNum());
		attributes.put(
			"applicantRegistrationNum", getApplicantRegistrationNum());
		attributes.put("maritalStatusDetails", getMaritalStatusDetails());
		attributes.put("applicantRelationship", getApplicantRelationship());
		attributes.put("applicantSecTelephone", getApplicantSecTelephone());
		attributes.put("applicantSecMail", getApplicantSecMail());
		attributes.put("applicantSecAddress", getApplicantSecAddress());
		attributes.put(
			"applicantSecAddressParish", getApplicantSecAddressParish());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fitPropPersonalDetailInfoId = (Long)attributes.get(
			"fitPropPersonalDetailInfoId");

		if (fitPropPersonalDetailInfoId != null) {
			setFitPropPersonalDetailInfoId(fitPropPersonalDetailInfoId);
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

		String applicantFirstName = (String)attributes.get(
			"applicantFirstName");

		if (applicantFirstName != null) {
			setApplicantFirstName(applicantFirstName);
		}

		String applicantMiddleName = (String)attributes.get(
			"applicantMiddleName");

		if (applicantMiddleName != null) {
			setApplicantMiddleName(applicantMiddleName);
		}

		String applicantSurname = (String)attributes.get("applicantSurname");

		if (applicantSurname != null) {
			setApplicantSurname(applicantSurname);
		}

		String applicantFormerName = (String)attributes.get(
			"applicantFormerName");

		if (applicantFormerName != null) {
			setApplicantFormerName(applicantFormerName);
		}

		String applicantAlias = (String)attributes.get("applicantAlias");

		if (applicantAlias != null) {
			setApplicantAlias(applicantAlias);
		}

		String applicantStreetName = (String)attributes.get(
			"applicantStreetName");

		if (applicantStreetName != null) {
			setApplicantStreetName(applicantStreetName);
		}

		String applicantStreetNo = (String)attributes.get("applicantStreetNo");

		if (applicantStreetNo != null) {
			setApplicantStreetNo(applicantStreetNo);
		}

		String applicantPostalCode = (String)attributes.get(
			"applicantPostalCode");

		if (applicantPostalCode != null) {
			setApplicantPostalCode(applicantPostalCode);
		}

		String applicantCountry = (String)attributes.get("applicantCountry");

		if (applicantCountry != null) {
			setApplicantCountry(applicantCountry);
		}

		String applicantTownName = (String)attributes.get("applicantTownName");

		if (applicantTownName != null) {
			setApplicantTownName(applicantTownName);
		}

		String applicantCity = (String)attributes.get("applicantCity");

		if (applicantCity != null) {
			setApplicantCity(applicantCity);
		}

		String applicantParish = (String)attributes.get("applicantParish");

		if (applicantParish != null) {
			setApplicantParish(applicantParish);
		}

		String applicantTelephoneNum = (String)attributes.get(
			"applicantTelephoneNum");

		if (applicantTelephoneNum != null) {
			setApplicantTelephoneNum(applicantTelephoneNum);
		}

		String applicantEmailAdd = (String)attributes.get("applicantEmailAdd");

		if (applicantEmailAdd != null) {
			setApplicantEmailAdd(applicantEmailAdd);
		}

		Date applicantDateBirth = (Date)attributes.get("applicantDateBirth");

		if (applicantDateBirth != null) {
			setApplicantDateBirth(applicantDateBirth);
		}

		String applicantPlaceOfBirthTown = (String)attributes.get(
			"applicantPlaceOfBirthTown");

		if (applicantPlaceOfBirthTown != null) {
			setApplicantPlaceOfBirthTown(applicantPlaceOfBirthTown);
		}

		String applicantPlaceOfBirthParish = (String)attributes.get(
			"applicantPlaceOfBirthParish");

		if (applicantPlaceOfBirthParish != null) {
			setApplicantPlaceOfBirthParish(applicantPlaceOfBirthParish);
		}

		String applicantPlaceOfBirthCountry = (String)attributes.get(
			"applicantPlaceOfBirthCountry");

		if (applicantPlaceOfBirthCountry != null) {
			setApplicantPlaceOfBirthCountry(applicantPlaceOfBirthCountry);
		}

		String applicantNationality = (String)attributes.get(
			"applicantNationality");

		if (applicantNationality != null) {
			setApplicantNationality(applicantNationality);
		}

		String applicantNisNum = (String)attributes.get("applicantNisNum");

		if (applicantNisNum != null) {
			setApplicantNisNum(applicantNisNum);
		}

		String applicantSocialNum = (String)attributes.get(
			"applicantSocialNum");

		if (applicantSocialNum != null) {
			setApplicantSocialNum(applicantSocialNum);
		}

		String applicantNationalNum = (String)attributes.get(
			"applicantNationalNum");

		if (applicantNationalNum != null) {
			setApplicantNationalNum(applicantNationalNum);
		}

		String applicantRegistrationNum = (String)attributes.get(
			"applicantRegistrationNum");

		if (applicantRegistrationNum != null) {
			setApplicantRegistrationNum(applicantRegistrationNum);
		}

		String maritalStatusDetails = (String)attributes.get(
			"maritalStatusDetails");

		if (maritalStatusDetails != null) {
			setMaritalStatusDetails(maritalStatusDetails);
		}

		String applicantRelationship = (String)attributes.get(
			"applicantRelationship");

		if (applicantRelationship != null) {
			setApplicantRelationship(applicantRelationship);
		}

		String applicantSecTelephone = (String)attributes.get(
			"applicantSecTelephone");

		if (applicantSecTelephone != null) {
			setApplicantSecTelephone(applicantSecTelephone);
		}

		String applicantSecMail = (String)attributes.get("applicantSecMail");

		if (applicantSecMail != null) {
			setApplicantSecMail(applicantSecMail);
		}

		String applicantSecAddress = (String)attributes.get(
			"applicantSecAddress");

		if (applicantSecAddress != null) {
			setApplicantSecAddress(applicantSecAddress);
		}

		String applicantSecAddressParish = (String)attributes.get(
			"applicantSecAddressParish");

		if (applicantSecAddressParish != null) {
			setApplicantSecAddressParish(applicantSecAddressParish);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public FitPropPersonalDetailInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant alias of this fit prop personal detail info.
	 *
	 * @return the applicant alias of this fit prop personal detail info
	 */
	@Override
	public String getApplicantAlias() {
		return model.getApplicantAlias();
	}

	/**
	 * Returns the applicant city of this fit prop personal detail info.
	 *
	 * @return the applicant city of this fit prop personal detail info
	 */
	@Override
	public String getApplicantCity() {
		return model.getApplicantCity();
	}

	/**
	 * Returns the applicant country of this fit prop personal detail info.
	 *
	 * @return the applicant country of this fit prop personal detail info
	 */
	@Override
	public String getApplicantCountry() {
		return model.getApplicantCountry();
	}

	/**
	 * Returns the applicant date birth of this fit prop personal detail info.
	 *
	 * @return the applicant date birth of this fit prop personal detail info
	 */
	@Override
	public Date getApplicantDateBirth() {
		return model.getApplicantDateBirth();
	}

	/**
	 * Returns the applicant email add of this fit prop personal detail info.
	 *
	 * @return the applicant email add of this fit prop personal detail info
	 */
	@Override
	public String getApplicantEmailAdd() {
		return model.getApplicantEmailAdd();
	}

	/**
	 * Returns the applicant first name of this fit prop personal detail info.
	 *
	 * @return the applicant first name of this fit prop personal detail info
	 */
	@Override
	public String getApplicantFirstName() {
		return model.getApplicantFirstName();
	}

	/**
	 * Returns the applicant former name of this fit prop personal detail info.
	 *
	 * @return the applicant former name of this fit prop personal detail info
	 */
	@Override
	public String getApplicantFormerName() {
		return model.getApplicantFormerName();
	}

	/**
	 * Returns the applicant middle name of this fit prop personal detail info.
	 *
	 * @return the applicant middle name of this fit prop personal detail info
	 */
	@Override
	public String getApplicantMiddleName() {
		return model.getApplicantMiddleName();
	}

	/**
	 * Returns the applicant nationality of this fit prop personal detail info.
	 *
	 * @return the applicant nationality of this fit prop personal detail info
	 */
	@Override
	public String getApplicantNationality() {
		return model.getApplicantNationality();
	}

	/**
	 * Returns the applicant national num of this fit prop personal detail info.
	 *
	 * @return the applicant national num of this fit prop personal detail info
	 */
	@Override
	public String getApplicantNationalNum() {
		return model.getApplicantNationalNum();
	}

	/**
	 * Returns the applicant nis num of this fit prop personal detail info.
	 *
	 * @return the applicant nis num of this fit prop personal detail info
	 */
	@Override
	public String getApplicantNisNum() {
		return model.getApplicantNisNum();
	}

	/**
	 * Returns the applicant parish of this fit prop personal detail info.
	 *
	 * @return the applicant parish of this fit prop personal detail info
	 */
	@Override
	public String getApplicantParish() {
		return model.getApplicantParish();
	}

	/**
	 * Returns the applicant place of birth country of this fit prop personal detail info.
	 *
	 * @return the applicant place of birth country of this fit prop personal detail info
	 */
	@Override
	public String getApplicantPlaceOfBirthCountry() {
		return model.getApplicantPlaceOfBirthCountry();
	}

	/**
	 * Returns the applicant place of birth parish of this fit prop personal detail info.
	 *
	 * @return the applicant place of birth parish of this fit prop personal detail info
	 */
	@Override
	public String getApplicantPlaceOfBirthParish() {
		return model.getApplicantPlaceOfBirthParish();
	}

	/**
	 * Returns the applicant place of birth town of this fit prop personal detail info.
	 *
	 * @return the applicant place of birth town of this fit prop personal detail info
	 */
	@Override
	public String getApplicantPlaceOfBirthTown() {
		return model.getApplicantPlaceOfBirthTown();
	}

	/**
	 * Returns the applicant postal code of this fit prop personal detail info.
	 *
	 * @return the applicant postal code of this fit prop personal detail info
	 */
	@Override
	public String getApplicantPostalCode() {
		return model.getApplicantPostalCode();
	}

	/**
	 * Returns the applicant registration num of this fit prop personal detail info.
	 *
	 * @return the applicant registration num of this fit prop personal detail info
	 */
	@Override
	public String getApplicantRegistrationNum() {
		return model.getApplicantRegistrationNum();
	}

	/**
	 * Returns the applicant relationship of this fit prop personal detail info.
	 *
	 * @return the applicant relationship of this fit prop personal detail info
	 */
	@Override
	public String getApplicantRelationship() {
		return model.getApplicantRelationship();
	}

	/**
	 * Returns the applicant sec address of this fit prop personal detail info.
	 *
	 * @return the applicant sec address of this fit prop personal detail info
	 */
	@Override
	public String getApplicantSecAddress() {
		return model.getApplicantSecAddress();
	}

	/**
	 * Returns the applicant sec address parish of this fit prop personal detail info.
	 *
	 * @return the applicant sec address parish of this fit prop personal detail info
	 */
	@Override
	public String getApplicantSecAddressParish() {
		return model.getApplicantSecAddressParish();
	}

	/**
	 * Returns the applicant sec mail of this fit prop personal detail info.
	 *
	 * @return the applicant sec mail of this fit prop personal detail info
	 */
	@Override
	public String getApplicantSecMail() {
		return model.getApplicantSecMail();
	}

	/**
	 * Returns the applicant sec telephone of this fit prop personal detail info.
	 *
	 * @return the applicant sec telephone of this fit prop personal detail info
	 */
	@Override
	public String getApplicantSecTelephone() {
		return model.getApplicantSecTelephone();
	}

	/**
	 * Returns the applicant social num of this fit prop personal detail info.
	 *
	 * @return the applicant social num of this fit prop personal detail info
	 */
	@Override
	public String getApplicantSocialNum() {
		return model.getApplicantSocialNum();
	}

	/**
	 * Returns the applicant street name of this fit prop personal detail info.
	 *
	 * @return the applicant street name of this fit prop personal detail info
	 */
	@Override
	public String getApplicantStreetName() {
		return model.getApplicantStreetName();
	}

	/**
	 * Returns the applicant street no of this fit prop personal detail info.
	 *
	 * @return the applicant street no of this fit prop personal detail info
	 */
	@Override
	public String getApplicantStreetNo() {
		return model.getApplicantStreetNo();
	}

	/**
	 * Returns the applicant surname of this fit prop personal detail info.
	 *
	 * @return the applicant surname of this fit prop personal detail info
	 */
	@Override
	public String getApplicantSurname() {
		return model.getApplicantSurname();
	}

	/**
	 * Returns the applicant telephone num of this fit prop personal detail info.
	 *
	 * @return the applicant telephone num of this fit prop personal detail info
	 */
	@Override
	public String getApplicantTelephoneNum() {
		return model.getApplicantTelephoneNum();
	}

	/**
	 * Returns the applicant town name of this fit prop personal detail info.
	 *
	 * @return the applicant town name of this fit prop personal detail info
	 */
	@Override
	public String getApplicantTownName() {
		return model.getApplicantTownName();
	}

	/**
	 * Returns the company ID of this fit prop personal detail info.
	 *
	 * @return the company ID of this fit prop personal detail info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fit prop personal detail info.
	 *
	 * @return the create date of this fit prop personal detail info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the fit prop personal detail info ID of this fit prop personal detail info.
	 *
	 * @return the fit prop personal detail info ID of this fit prop personal detail info
	 */
	@Override
	public long getFitPropPersonalDetailInfoId() {
		return model.getFitPropPersonalDetailInfoId();
	}

	/**
	 * Returns the group ID of this fit prop personal detail info.
	 *
	 * @return the group ID of this fit prop personal detail info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this fit prop personal detail info.
	 *
	 * @return the hsra application ID of this fit prop personal detail info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the marital status details of this fit prop personal detail info.
	 *
	 * @return the marital status details of this fit prop personal detail info
	 */
	@Override
	public String getMaritalStatusDetails() {
		return model.getMaritalStatusDetails();
	}

	/**
	 * Returns the modified date of this fit prop personal detail info.
	 *
	 * @return the modified date of this fit prop personal detail info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this fit prop personal detail info.
	 *
	 * @return the primary key of this fit prop personal detail info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fit prop personal detail info.
	 *
	 * @return the user ID of this fit prop personal detail info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fit prop personal detail info.
	 *
	 * @return the user name of this fit prop personal detail info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fit prop personal detail info.
	 *
	 * @return the user uuid of this fit prop personal detail info
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
	 * Sets the applicant alias of this fit prop personal detail info.
	 *
	 * @param applicantAlias the applicant alias of this fit prop personal detail info
	 */
	@Override
	public void setApplicantAlias(String applicantAlias) {
		model.setApplicantAlias(applicantAlias);
	}

	/**
	 * Sets the applicant city of this fit prop personal detail info.
	 *
	 * @param applicantCity the applicant city of this fit prop personal detail info
	 */
	@Override
	public void setApplicantCity(String applicantCity) {
		model.setApplicantCity(applicantCity);
	}

	/**
	 * Sets the applicant country of this fit prop personal detail info.
	 *
	 * @param applicantCountry the applicant country of this fit prop personal detail info
	 */
	@Override
	public void setApplicantCountry(String applicantCountry) {
		model.setApplicantCountry(applicantCountry);
	}

	/**
	 * Sets the applicant date birth of this fit prop personal detail info.
	 *
	 * @param applicantDateBirth the applicant date birth of this fit prop personal detail info
	 */
	@Override
	public void setApplicantDateBirth(Date applicantDateBirth) {
		model.setApplicantDateBirth(applicantDateBirth);
	}

	/**
	 * Sets the applicant email add of this fit prop personal detail info.
	 *
	 * @param applicantEmailAdd the applicant email add of this fit prop personal detail info
	 */
	@Override
	public void setApplicantEmailAdd(String applicantEmailAdd) {
		model.setApplicantEmailAdd(applicantEmailAdd);
	}

	/**
	 * Sets the applicant first name of this fit prop personal detail info.
	 *
	 * @param applicantFirstName the applicant first name of this fit prop personal detail info
	 */
	@Override
	public void setApplicantFirstName(String applicantFirstName) {
		model.setApplicantFirstName(applicantFirstName);
	}

	/**
	 * Sets the applicant former name of this fit prop personal detail info.
	 *
	 * @param applicantFormerName the applicant former name of this fit prop personal detail info
	 */
	@Override
	public void setApplicantFormerName(String applicantFormerName) {
		model.setApplicantFormerName(applicantFormerName);
	}

	/**
	 * Sets the applicant middle name of this fit prop personal detail info.
	 *
	 * @param applicantMiddleName the applicant middle name of this fit prop personal detail info
	 */
	@Override
	public void setApplicantMiddleName(String applicantMiddleName) {
		model.setApplicantMiddleName(applicantMiddleName);
	}

	/**
	 * Sets the applicant nationality of this fit prop personal detail info.
	 *
	 * @param applicantNationality the applicant nationality of this fit prop personal detail info
	 */
	@Override
	public void setApplicantNationality(String applicantNationality) {
		model.setApplicantNationality(applicantNationality);
	}

	/**
	 * Sets the applicant national num of this fit prop personal detail info.
	 *
	 * @param applicantNationalNum the applicant national num of this fit prop personal detail info
	 */
	@Override
	public void setApplicantNationalNum(String applicantNationalNum) {
		model.setApplicantNationalNum(applicantNationalNum);
	}

	/**
	 * Sets the applicant nis num of this fit prop personal detail info.
	 *
	 * @param applicantNisNum the applicant nis num of this fit prop personal detail info
	 */
	@Override
	public void setApplicantNisNum(String applicantNisNum) {
		model.setApplicantNisNum(applicantNisNum);
	}

	/**
	 * Sets the applicant parish of this fit prop personal detail info.
	 *
	 * @param applicantParish the applicant parish of this fit prop personal detail info
	 */
	@Override
	public void setApplicantParish(String applicantParish) {
		model.setApplicantParish(applicantParish);
	}

	/**
	 * Sets the applicant place of birth country of this fit prop personal detail info.
	 *
	 * @param applicantPlaceOfBirthCountry the applicant place of birth country of this fit prop personal detail info
	 */
	@Override
	public void setApplicantPlaceOfBirthCountry(
		String applicantPlaceOfBirthCountry) {

		model.setApplicantPlaceOfBirthCountry(applicantPlaceOfBirthCountry);
	}

	/**
	 * Sets the applicant place of birth parish of this fit prop personal detail info.
	 *
	 * @param applicantPlaceOfBirthParish the applicant place of birth parish of this fit prop personal detail info
	 */
	@Override
	public void setApplicantPlaceOfBirthParish(
		String applicantPlaceOfBirthParish) {

		model.setApplicantPlaceOfBirthParish(applicantPlaceOfBirthParish);
	}

	/**
	 * Sets the applicant place of birth town of this fit prop personal detail info.
	 *
	 * @param applicantPlaceOfBirthTown the applicant place of birth town of this fit prop personal detail info
	 */
	@Override
	public void setApplicantPlaceOfBirthTown(String applicantPlaceOfBirthTown) {
		model.setApplicantPlaceOfBirthTown(applicantPlaceOfBirthTown);
	}

	/**
	 * Sets the applicant postal code of this fit prop personal detail info.
	 *
	 * @param applicantPostalCode the applicant postal code of this fit prop personal detail info
	 */
	@Override
	public void setApplicantPostalCode(String applicantPostalCode) {
		model.setApplicantPostalCode(applicantPostalCode);
	}

	/**
	 * Sets the applicant registration num of this fit prop personal detail info.
	 *
	 * @param applicantRegistrationNum the applicant registration num of this fit prop personal detail info
	 */
	@Override
	public void setApplicantRegistrationNum(String applicantRegistrationNum) {
		model.setApplicantRegistrationNum(applicantRegistrationNum);
	}

	/**
	 * Sets the applicant relationship of this fit prop personal detail info.
	 *
	 * @param applicantRelationship the applicant relationship of this fit prop personal detail info
	 */
	@Override
	public void setApplicantRelationship(String applicantRelationship) {
		model.setApplicantRelationship(applicantRelationship);
	}

	/**
	 * Sets the applicant sec address of this fit prop personal detail info.
	 *
	 * @param applicantSecAddress the applicant sec address of this fit prop personal detail info
	 */
	@Override
	public void setApplicantSecAddress(String applicantSecAddress) {
		model.setApplicantSecAddress(applicantSecAddress);
	}

	/**
	 * Sets the applicant sec address parish of this fit prop personal detail info.
	 *
	 * @param applicantSecAddressParish the applicant sec address parish of this fit prop personal detail info
	 */
	@Override
	public void setApplicantSecAddressParish(String applicantSecAddressParish) {
		model.setApplicantSecAddressParish(applicantSecAddressParish);
	}

	/**
	 * Sets the applicant sec mail of this fit prop personal detail info.
	 *
	 * @param applicantSecMail the applicant sec mail of this fit prop personal detail info
	 */
	@Override
	public void setApplicantSecMail(String applicantSecMail) {
		model.setApplicantSecMail(applicantSecMail);
	}

	/**
	 * Sets the applicant sec telephone of this fit prop personal detail info.
	 *
	 * @param applicantSecTelephone the applicant sec telephone of this fit prop personal detail info
	 */
	@Override
	public void setApplicantSecTelephone(String applicantSecTelephone) {
		model.setApplicantSecTelephone(applicantSecTelephone);
	}

	/**
	 * Sets the applicant social num of this fit prop personal detail info.
	 *
	 * @param applicantSocialNum the applicant social num of this fit prop personal detail info
	 */
	@Override
	public void setApplicantSocialNum(String applicantSocialNum) {
		model.setApplicantSocialNum(applicantSocialNum);
	}

	/**
	 * Sets the applicant street name of this fit prop personal detail info.
	 *
	 * @param applicantStreetName the applicant street name of this fit prop personal detail info
	 */
	@Override
	public void setApplicantStreetName(String applicantStreetName) {
		model.setApplicantStreetName(applicantStreetName);
	}

	/**
	 * Sets the applicant street no of this fit prop personal detail info.
	 *
	 * @param applicantStreetNo the applicant street no of this fit prop personal detail info
	 */
	@Override
	public void setApplicantStreetNo(String applicantStreetNo) {
		model.setApplicantStreetNo(applicantStreetNo);
	}

	/**
	 * Sets the applicant surname of this fit prop personal detail info.
	 *
	 * @param applicantSurname the applicant surname of this fit prop personal detail info
	 */
	@Override
	public void setApplicantSurname(String applicantSurname) {
		model.setApplicantSurname(applicantSurname);
	}

	/**
	 * Sets the applicant telephone num of this fit prop personal detail info.
	 *
	 * @param applicantTelephoneNum the applicant telephone num of this fit prop personal detail info
	 */
	@Override
	public void setApplicantTelephoneNum(String applicantTelephoneNum) {
		model.setApplicantTelephoneNum(applicantTelephoneNum);
	}

	/**
	 * Sets the applicant town name of this fit prop personal detail info.
	 *
	 * @param applicantTownName the applicant town name of this fit prop personal detail info
	 */
	@Override
	public void setApplicantTownName(String applicantTownName) {
		model.setApplicantTownName(applicantTownName);
	}

	/**
	 * Sets the company ID of this fit prop personal detail info.
	 *
	 * @param companyId the company ID of this fit prop personal detail info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fit prop personal detail info.
	 *
	 * @param createDate the create date of this fit prop personal detail info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the fit prop personal detail info ID of this fit prop personal detail info.
	 *
	 * @param fitPropPersonalDetailInfoId the fit prop personal detail info ID of this fit prop personal detail info
	 */
	@Override
	public void setFitPropPersonalDetailInfoId(
		long fitPropPersonalDetailInfoId) {

		model.setFitPropPersonalDetailInfoId(fitPropPersonalDetailInfoId);
	}

	/**
	 * Sets the group ID of this fit prop personal detail info.
	 *
	 * @param groupId the group ID of this fit prop personal detail info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this fit prop personal detail info.
	 *
	 * @param hsraApplicationId the hsra application ID of this fit prop personal detail info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the marital status details of this fit prop personal detail info.
	 *
	 * @param maritalStatusDetails the marital status details of this fit prop personal detail info
	 */
	@Override
	public void setMaritalStatusDetails(String maritalStatusDetails) {
		model.setMaritalStatusDetails(maritalStatusDetails);
	}

	/**
	 * Sets the modified date of this fit prop personal detail info.
	 *
	 * @param modifiedDate the modified date of this fit prop personal detail info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this fit prop personal detail info.
	 *
	 * @param primaryKey the primary key of this fit prop personal detail info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fit prop personal detail info.
	 *
	 * @param userId the user ID of this fit prop personal detail info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fit prop personal detail info.
	 *
	 * @param userName the user name of this fit prop personal detail info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fit prop personal detail info.
	 *
	 * @param userUuid the user uuid of this fit prop personal detail info
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
	protected FitPropPersonalDetailInfoWrapper wrap(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		return new FitPropPersonalDetailInfoWrapper(fitPropPersonalDetailInfo);
	}

}