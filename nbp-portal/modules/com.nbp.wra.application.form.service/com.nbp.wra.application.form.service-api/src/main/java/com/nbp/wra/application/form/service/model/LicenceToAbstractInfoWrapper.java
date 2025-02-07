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
 * This class is a wrapper for {@link LicenceToAbstractInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToAbstractInfo
 * @generated
 */
public class LicenceToAbstractInfoWrapper
	extends BaseModelWrapper<LicenceToAbstractInfo>
	implements LicenceToAbstractInfo, ModelWrapper<LicenceToAbstractInfo> {

	public LicenceToAbstractInfoWrapper(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		super(licenceToAbstractInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("abstractLicenceId", getAbstractLicenceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicationNum", getApplicationNum());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("parishApplicant", getParishApplicant());
		attributes.put("mailingAddOfApplicant", getMailingAddOfApplicant());
		attributes.put("emailOfApplicant", getEmailOfApplicant());
		attributes.put("officePhone", getOfficePhone());
		attributes.put("mobilePhone", getMobilePhone());
		attributes.put("homePhone", getHomePhone());
		attributes.put(
			"locationOfProposedParish", getLocationOfProposedParish());
		attributes.put("locationOfProParishWork", getLocationOfProParishWork());
		attributes.put("nameOfContractor", getNameOfContractor());
		attributes.put("parishContractor", getParishContractor());
		attributes.put("addressOfContractor", getAddressOfContractor());
		attributes.put("sourceOfWater", getSourceOfWater());
		attributes.put("purposeWaterUse", getPurposeWaterUse());
		attributes.put("areaAndCropType", getAreaAndCropType());
		attributes.put("systemOfIrrigation", getSystemOfIrrigation());
		attributes.put("meansOfDisposal", getMeansOfDisposal());
		attributes.put("estimateDepthOfBorewell", getEstimateDepthOfBorewell());
		attributes.put("diameterOfBorewell", getDiameterOfBorewell());
		attributes.put("artesianSupply", getArtesianSupply());
		attributes.put("geologicalStrait", getGeologicalStrait());
		attributes.put(
			"methodOfAbstractingWater", getMethodOfAbstractingWater());
		attributes.put("maxDailyQuant", getMaxDailyQuant());
		attributes.put("typeOfAppratusProposed", getTypeOfAppratusProposed());
		attributes.put("otherInformation", getOtherInformation());
		attributes.put("requestToSupplyWater", getRequestToSupplyWater());
		attributes.put("authorityInformation", getAuthorityInformation());
		attributes.put("dateOfSign", getDateOfSign());
		attributes.put("wraApplicationId", getWraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long abstractLicenceId = (Long)attributes.get("abstractLicenceId");

		if (abstractLicenceId != null) {
			setAbstractLicenceId(abstractLicenceId);
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

		String applicationNum = (String)attributes.get("applicationNum");

		if (applicationNum != null) {
			setApplicationNum(applicationNum);
		}

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String parishApplicant = (String)attributes.get("parishApplicant");

		if (parishApplicant != null) {
			setParishApplicant(parishApplicant);
		}

		String mailingAddOfApplicant = (String)attributes.get(
			"mailingAddOfApplicant");

		if (mailingAddOfApplicant != null) {
			setMailingAddOfApplicant(mailingAddOfApplicant);
		}

		String emailOfApplicant = (String)attributes.get("emailOfApplicant");

		if (emailOfApplicant != null) {
			setEmailOfApplicant(emailOfApplicant);
		}

		String officePhone = (String)attributes.get("officePhone");

		if (officePhone != null) {
			setOfficePhone(officePhone);
		}

		String mobilePhone = (String)attributes.get("mobilePhone");

		if (mobilePhone != null) {
			setMobilePhone(mobilePhone);
		}

		String homePhone = (String)attributes.get("homePhone");

		if (homePhone != null) {
			setHomePhone(homePhone);
		}

		String locationOfProposedParish = (String)attributes.get(
			"locationOfProposedParish");

		if (locationOfProposedParish != null) {
			setLocationOfProposedParish(locationOfProposedParish);
		}

		String locationOfProParishWork = (String)attributes.get(
			"locationOfProParishWork");

		if (locationOfProParishWork != null) {
			setLocationOfProParishWork(locationOfProParishWork);
		}

		String nameOfContractor = (String)attributes.get("nameOfContractor");

		if (nameOfContractor != null) {
			setNameOfContractor(nameOfContractor);
		}

		String parishContractor = (String)attributes.get("parishContractor");

		if (parishContractor != null) {
			setParishContractor(parishContractor);
		}

		String addressOfContractor = (String)attributes.get(
			"addressOfContractor");

		if (addressOfContractor != null) {
			setAddressOfContractor(addressOfContractor);
		}

		String sourceOfWater = (String)attributes.get("sourceOfWater");

		if (sourceOfWater != null) {
			setSourceOfWater(sourceOfWater);
		}

		String purposeWaterUse = (String)attributes.get("purposeWaterUse");

		if (purposeWaterUse != null) {
			setPurposeWaterUse(purposeWaterUse);
		}

		String areaAndCropType = (String)attributes.get("areaAndCropType");

		if (areaAndCropType != null) {
			setAreaAndCropType(areaAndCropType);
		}

		String systemOfIrrigation = (String)attributes.get(
			"systemOfIrrigation");

		if (systemOfIrrigation != null) {
			setSystemOfIrrigation(systemOfIrrigation);
		}

		String meansOfDisposal = (String)attributes.get("meansOfDisposal");

		if (meansOfDisposal != null) {
			setMeansOfDisposal(meansOfDisposal);
		}

		String estimateDepthOfBorewell = (String)attributes.get(
			"estimateDepthOfBorewell");

		if (estimateDepthOfBorewell != null) {
			setEstimateDepthOfBorewell(estimateDepthOfBorewell);
		}

		String diameterOfBorewell = (String)attributes.get(
			"diameterOfBorewell");

		if (diameterOfBorewell != null) {
			setDiameterOfBorewell(diameterOfBorewell);
		}

		String artesianSupply = (String)attributes.get("artesianSupply");

		if (artesianSupply != null) {
			setArtesianSupply(artesianSupply);
		}

		String geologicalStrait = (String)attributes.get("geologicalStrait");

		if (geologicalStrait != null) {
			setGeologicalStrait(geologicalStrait);
		}

		String methodOfAbstractingWater = (String)attributes.get(
			"methodOfAbstractingWater");

		if (methodOfAbstractingWater != null) {
			setMethodOfAbstractingWater(methodOfAbstractingWater);
		}

		String maxDailyQuant = (String)attributes.get("maxDailyQuant");

		if (maxDailyQuant != null) {
			setMaxDailyQuant(maxDailyQuant);
		}

		String typeOfAppratusProposed = (String)attributes.get(
			"typeOfAppratusProposed");

		if (typeOfAppratusProposed != null) {
			setTypeOfAppratusProposed(typeOfAppratusProposed);
		}

		String otherInformation = (String)attributes.get("otherInformation");

		if (otherInformation != null) {
			setOtherInformation(otherInformation);
		}

		String requestToSupplyWater = (String)attributes.get(
			"requestToSupplyWater");

		if (requestToSupplyWater != null) {
			setRequestToSupplyWater(requestToSupplyWater);
		}

		String authorityInformation = (String)attributes.get(
			"authorityInformation");

		if (authorityInformation != null) {
			setAuthorityInformation(authorityInformation);
		}

		Date dateOfSign = (Date)attributes.get("dateOfSign");

		if (dateOfSign != null) {
			setDateOfSign(dateOfSign);
		}

		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
		}
	}

	@Override
	public LicenceToAbstractInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the abstract licence ID of this licence to abstract info.
	 *
	 * @return the abstract licence ID of this licence to abstract info
	 */
	@Override
	public long getAbstractLicenceId() {
		return model.getAbstractLicenceId();
	}

	/**
	 * Returns the address of contractor of this licence to abstract info.
	 *
	 * @return the address of contractor of this licence to abstract info
	 */
	@Override
	public String getAddressOfContractor() {
		return model.getAddressOfContractor();
	}

	/**
	 * Returns the application num of this licence to abstract info.
	 *
	 * @return the application num of this licence to abstract info
	 */
	@Override
	public String getApplicationNum() {
		return model.getApplicationNum();
	}

	/**
	 * Returns the area and crop type of this licence to abstract info.
	 *
	 * @return the area and crop type of this licence to abstract info
	 */
	@Override
	public String getAreaAndCropType() {
		return model.getAreaAndCropType();
	}

	/**
	 * Returns the artesian supply of this licence to abstract info.
	 *
	 * @return the artesian supply of this licence to abstract info
	 */
	@Override
	public String getArtesianSupply() {
		return model.getArtesianSupply();
	}

	/**
	 * Returns the authority information of this licence to abstract info.
	 *
	 * @return the authority information of this licence to abstract info
	 */
	@Override
	public String getAuthorityInformation() {
		return model.getAuthorityInformation();
	}

	/**
	 * Returns the company ID of this licence to abstract info.
	 *
	 * @return the company ID of this licence to abstract info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this licence to abstract info.
	 *
	 * @return the create date of this licence to abstract info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of sign of this licence to abstract info.
	 *
	 * @return the date of sign of this licence to abstract info
	 */
	@Override
	public Date getDateOfSign() {
		return model.getDateOfSign();
	}

	/**
	 * Returns the diameter of borewell of this licence to abstract info.
	 *
	 * @return the diameter of borewell of this licence to abstract info
	 */
	@Override
	public String getDiameterOfBorewell() {
		return model.getDiameterOfBorewell();
	}

	/**
	 * Returns the email of applicant of this licence to abstract info.
	 *
	 * @return the email of applicant of this licence to abstract info
	 */
	@Override
	public String getEmailOfApplicant() {
		return model.getEmailOfApplicant();
	}

	/**
	 * Returns the estimate depth of borewell of this licence to abstract info.
	 *
	 * @return the estimate depth of borewell of this licence to abstract info
	 */
	@Override
	public String getEstimateDepthOfBorewell() {
		return model.getEstimateDepthOfBorewell();
	}

	/**
	 * Returns the geological strait of this licence to abstract info.
	 *
	 * @return the geological strait of this licence to abstract info
	 */
	@Override
	public String getGeologicalStrait() {
		return model.getGeologicalStrait();
	}

	/**
	 * Returns the group ID of this licence to abstract info.
	 *
	 * @return the group ID of this licence to abstract info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home phone of this licence to abstract info.
	 *
	 * @return the home phone of this licence to abstract info
	 */
	@Override
	public String getHomePhone() {
		return model.getHomePhone();
	}

	/**
	 * Returns the location of pro parish work of this licence to abstract info.
	 *
	 * @return the location of pro parish work of this licence to abstract info
	 */
	@Override
	public String getLocationOfProParishWork() {
		return model.getLocationOfProParishWork();
	}

	/**
	 * Returns the location of proposed parish of this licence to abstract info.
	 *
	 * @return the location of proposed parish of this licence to abstract info
	 */
	@Override
	public String getLocationOfProposedParish() {
		return model.getLocationOfProposedParish();
	}

	/**
	 * Returns the mailing add of applicant of this licence to abstract info.
	 *
	 * @return the mailing add of applicant of this licence to abstract info
	 */
	@Override
	public String getMailingAddOfApplicant() {
		return model.getMailingAddOfApplicant();
	}

	/**
	 * Returns the max daily quant of this licence to abstract info.
	 *
	 * @return the max daily quant of this licence to abstract info
	 */
	@Override
	public String getMaxDailyQuant() {
		return model.getMaxDailyQuant();
	}

	/**
	 * Returns the means of disposal of this licence to abstract info.
	 *
	 * @return the means of disposal of this licence to abstract info
	 */
	@Override
	public String getMeansOfDisposal() {
		return model.getMeansOfDisposal();
	}

	/**
	 * Returns the method of abstracting water of this licence to abstract info.
	 *
	 * @return the method of abstracting water of this licence to abstract info
	 */
	@Override
	public String getMethodOfAbstractingWater() {
		return model.getMethodOfAbstractingWater();
	}

	/**
	 * Returns the mobile phone of this licence to abstract info.
	 *
	 * @return the mobile phone of this licence to abstract info
	 */
	@Override
	public String getMobilePhone() {
		return model.getMobilePhone();
	}

	/**
	 * Returns the modified date of this licence to abstract info.
	 *
	 * @return the modified date of this licence to abstract info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this licence to abstract info.
	 *
	 * @return the name of applicant of this licence to abstract info
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the name of contractor of this licence to abstract info.
	 *
	 * @return the name of contractor of this licence to abstract info
	 */
	@Override
	public String getNameOfContractor() {
		return model.getNameOfContractor();
	}

	/**
	 * Returns the office phone of this licence to abstract info.
	 *
	 * @return the office phone of this licence to abstract info
	 */
	@Override
	public String getOfficePhone() {
		return model.getOfficePhone();
	}

	/**
	 * Returns the other information of this licence to abstract info.
	 *
	 * @return the other information of this licence to abstract info
	 */
	@Override
	public String getOtherInformation() {
		return model.getOtherInformation();
	}

	/**
	 * Returns the parish applicant of this licence to abstract info.
	 *
	 * @return the parish applicant of this licence to abstract info
	 */
	@Override
	public String getParishApplicant() {
		return model.getParishApplicant();
	}

	/**
	 * Returns the parish contractor of this licence to abstract info.
	 *
	 * @return the parish contractor of this licence to abstract info
	 */
	@Override
	public String getParishContractor() {
		return model.getParishContractor();
	}

	/**
	 * Returns the primary key of this licence to abstract info.
	 *
	 * @return the primary key of this licence to abstract info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the purpose water use of this licence to abstract info.
	 *
	 * @return the purpose water use of this licence to abstract info
	 */
	@Override
	public String getPurposeWaterUse() {
		return model.getPurposeWaterUse();
	}

	/**
	 * Returns the request to supply water of this licence to abstract info.
	 *
	 * @return the request to supply water of this licence to abstract info
	 */
	@Override
	public String getRequestToSupplyWater() {
		return model.getRequestToSupplyWater();
	}

	/**
	 * Returns the source of water of this licence to abstract info.
	 *
	 * @return the source of water of this licence to abstract info
	 */
	@Override
	public String getSourceOfWater() {
		return model.getSourceOfWater();
	}

	/**
	 * Returns the system of irrigation of this licence to abstract info.
	 *
	 * @return the system of irrigation of this licence to abstract info
	 */
	@Override
	public String getSystemOfIrrigation() {
		return model.getSystemOfIrrigation();
	}

	/**
	 * Returns the type of appratus proposed of this licence to abstract info.
	 *
	 * @return the type of appratus proposed of this licence to abstract info
	 */
	@Override
	public String getTypeOfAppratusProposed() {
		return model.getTypeOfAppratusProposed();
	}

	/**
	 * Returns the user ID of this licence to abstract info.
	 *
	 * @return the user ID of this licence to abstract info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this licence to abstract info.
	 *
	 * @return the user name of this licence to abstract info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this licence to abstract info.
	 *
	 * @return the user uuid of this licence to abstract info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the wra application ID of this licence to abstract info.
	 *
	 * @return the wra application ID of this licence to abstract info
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
	 * Sets the abstract licence ID of this licence to abstract info.
	 *
	 * @param abstractLicenceId the abstract licence ID of this licence to abstract info
	 */
	@Override
	public void setAbstractLicenceId(long abstractLicenceId) {
		model.setAbstractLicenceId(abstractLicenceId);
	}

	/**
	 * Sets the address of contractor of this licence to abstract info.
	 *
	 * @param addressOfContractor the address of contractor of this licence to abstract info
	 */
	@Override
	public void setAddressOfContractor(String addressOfContractor) {
		model.setAddressOfContractor(addressOfContractor);
	}

	/**
	 * Sets the application num of this licence to abstract info.
	 *
	 * @param applicationNum the application num of this licence to abstract info
	 */
	@Override
	public void setApplicationNum(String applicationNum) {
		model.setApplicationNum(applicationNum);
	}

	/**
	 * Sets the area and crop type of this licence to abstract info.
	 *
	 * @param areaAndCropType the area and crop type of this licence to abstract info
	 */
	@Override
	public void setAreaAndCropType(String areaAndCropType) {
		model.setAreaAndCropType(areaAndCropType);
	}

	/**
	 * Sets the artesian supply of this licence to abstract info.
	 *
	 * @param artesianSupply the artesian supply of this licence to abstract info
	 */
	@Override
	public void setArtesianSupply(String artesianSupply) {
		model.setArtesianSupply(artesianSupply);
	}

	/**
	 * Sets the authority information of this licence to abstract info.
	 *
	 * @param authorityInformation the authority information of this licence to abstract info
	 */
	@Override
	public void setAuthorityInformation(String authorityInformation) {
		model.setAuthorityInformation(authorityInformation);
	}

	/**
	 * Sets the company ID of this licence to abstract info.
	 *
	 * @param companyId the company ID of this licence to abstract info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this licence to abstract info.
	 *
	 * @param createDate the create date of this licence to abstract info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of sign of this licence to abstract info.
	 *
	 * @param dateOfSign the date of sign of this licence to abstract info
	 */
	@Override
	public void setDateOfSign(Date dateOfSign) {
		model.setDateOfSign(dateOfSign);
	}

	/**
	 * Sets the diameter of borewell of this licence to abstract info.
	 *
	 * @param diameterOfBorewell the diameter of borewell of this licence to abstract info
	 */
	@Override
	public void setDiameterOfBorewell(String diameterOfBorewell) {
		model.setDiameterOfBorewell(diameterOfBorewell);
	}

	/**
	 * Sets the email of applicant of this licence to abstract info.
	 *
	 * @param emailOfApplicant the email of applicant of this licence to abstract info
	 */
	@Override
	public void setEmailOfApplicant(String emailOfApplicant) {
		model.setEmailOfApplicant(emailOfApplicant);
	}

	/**
	 * Sets the estimate depth of borewell of this licence to abstract info.
	 *
	 * @param estimateDepthOfBorewell the estimate depth of borewell of this licence to abstract info
	 */
	@Override
	public void setEstimateDepthOfBorewell(String estimateDepthOfBorewell) {
		model.setEstimateDepthOfBorewell(estimateDepthOfBorewell);
	}

	/**
	 * Sets the geological strait of this licence to abstract info.
	 *
	 * @param geologicalStrait the geological strait of this licence to abstract info
	 */
	@Override
	public void setGeologicalStrait(String geologicalStrait) {
		model.setGeologicalStrait(geologicalStrait);
	}

	/**
	 * Sets the group ID of this licence to abstract info.
	 *
	 * @param groupId the group ID of this licence to abstract info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home phone of this licence to abstract info.
	 *
	 * @param homePhone the home phone of this licence to abstract info
	 */
	@Override
	public void setHomePhone(String homePhone) {
		model.setHomePhone(homePhone);
	}

	/**
	 * Sets the location of pro parish work of this licence to abstract info.
	 *
	 * @param locationOfProParishWork the location of pro parish work of this licence to abstract info
	 */
	@Override
	public void setLocationOfProParishWork(String locationOfProParishWork) {
		model.setLocationOfProParishWork(locationOfProParishWork);
	}

	/**
	 * Sets the location of proposed parish of this licence to abstract info.
	 *
	 * @param locationOfProposedParish the location of proposed parish of this licence to abstract info
	 */
	@Override
	public void setLocationOfProposedParish(String locationOfProposedParish) {
		model.setLocationOfProposedParish(locationOfProposedParish);
	}

	/**
	 * Sets the mailing add of applicant of this licence to abstract info.
	 *
	 * @param mailingAddOfApplicant the mailing add of applicant of this licence to abstract info
	 */
	@Override
	public void setMailingAddOfApplicant(String mailingAddOfApplicant) {
		model.setMailingAddOfApplicant(mailingAddOfApplicant);
	}

	/**
	 * Sets the max daily quant of this licence to abstract info.
	 *
	 * @param maxDailyQuant the max daily quant of this licence to abstract info
	 */
	@Override
	public void setMaxDailyQuant(String maxDailyQuant) {
		model.setMaxDailyQuant(maxDailyQuant);
	}

	/**
	 * Sets the means of disposal of this licence to abstract info.
	 *
	 * @param meansOfDisposal the means of disposal of this licence to abstract info
	 */
	@Override
	public void setMeansOfDisposal(String meansOfDisposal) {
		model.setMeansOfDisposal(meansOfDisposal);
	}

	/**
	 * Sets the method of abstracting water of this licence to abstract info.
	 *
	 * @param methodOfAbstractingWater the method of abstracting water of this licence to abstract info
	 */
	@Override
	public void setMethodOfAbstractingWater(String methodOfAbstractingWater) {
		model.setMethodOfAbstractingWater(methodOfAbstractingWater);
	}

	/**
	 * Sets the mobile phone of this licence to abstract info.
	 *
	 * @param mobilePhone the mobile phone of this licence to abstract info
	 */
	@Override
	public void setMobilePhone(String mobilePhone) {
		model.setMobilePhone(mobilePhone);
	}

	/**
	 * Sets the modified date of this licence to abstract info.
	 *
	 * @param modifiedDate the modified date of this licence to abstract info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this licence to abstract info.
	 *
	 * @param nameOfApplicant the name of applicant of this licence to abstract info
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the name of contractor of this licence to abstract info.
	 *
	 * @param nameOfContractor the name of contractor of this licence to abstract info
	 */
	@Override
	public void setNameOfContractor(String nameOfContractor) {
		model.setNameOfContractor(nameOfContractor);
	}

	/**
	 * Sets the office phone of this licence to abstract info.
	 *
	 * @param officePhone the office phone of this licence to abstract info
	 */
	@Override
	public void setOfficePhone(String officePhone) {
		model.setOfficePhone(officePhone);
	}

	/**
	 * Sets the other information of this licence to abstract info.
	 *
	 * @param otherInformation the other information of this licence to abstract info
	 */
	@Override
	public void setOtherInformation(String otherInformation) {
		model.setOtherInformation(otherInformation);
	}

	/**
	 * Sets the parish applicant of this licence to abstract info.
	 *
	 * @param parishApplicant the parish applicant of this licence to abstract info
	 */
	@Override
	public void setParishApplicant(String parishApplicant) {
		model.setParishApplicant(parishApplicant);
	}

	/**
	 * Sets the parish contractor of this licence to abstract info.
	 *
	 * @param parishContractor the parish contractor of this licence to abstract info
	 */
	@Override
	public void setParishContractor(String parishContractor) {
		model.setParishContractor(parishContractor);
	}

	/**
	 * Sets the primary key of this licence to abstract info.
	 *
	 * @param primaryKey the primary key of this licence to abstract info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the purpose water use of this licence to abstract info.
	 *
	 * @param purposeWaterUse the purpose water use of this licence to abstract info
	 */
	@Override
	public void setPurposeWaterUse(String purposeWaterUse) {
		model.setPurposeWaterUse(purposeWaterUse);
	}

	/**
	 * Sets the request to supply water of this licence to abstract info.
	 *
	 * @param requestToSupplyWater the request to supply water of this licence to abstract info
	 */
	@Override
	public void setRequestToSupplyWater(String requestToSupplyWater) {
		model.setRequestToSupplyWater(requestToSupplyWater);
	}

	/**
	 * Sets the source of water of this licence to abstract info.
	 *
	 * @param sourceOfWater the source of water of this licence to abstract info
	 */
	@Override
	public void setSourceOfWater(String sourceOfWater) {
		model.setSourceOfWater(sourceOfWater);
	}

	/**
	 * Sets the system of irrigation of this licence to abstract info.
	 *
	 * @param systemOfIrrigation the system of irrigation of this licence to abstract info
	 */
	@Override
	public void setSystemOfIrrigation(String systemOfIrrigation) {
		model.setSystemOfIrrigation(systemOfIrrigation);
	}

	/**
	 * Sets the type of appratus proposed of this licence to abstract info.
	 *
	 * @param typeOfAppratusProposed the type of appratus proposed of this licence to abstract info
	 */
	@Override
	public void setTypeOfAppratusProposed(String typeOfAppratusProposed) {
		model.setTypeOfAppratusProposed(typeOfAppratusProposed);
	}

	/**
	 * Sets the user ID of this licence to abstract info.
	 *
	 * @param userId the user ID of this licence to abstract info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this licence to abstract info.
	 *
	 * @param userName the user name of this licence to abstract info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this licence to abstract info.
	 *
	 * @param userUuid the user uuid of this licence to abstract info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the wra application ID of this licence to abstract info.
	 *
	 * @param wraApplicationId the wra application ID of this licence to abstract info
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
	protected LicenceToAbstractInfoWrapper wrap(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		return new LicenceToAbstractInfoWrapper(licenceToAbstractInfo);
	}

}