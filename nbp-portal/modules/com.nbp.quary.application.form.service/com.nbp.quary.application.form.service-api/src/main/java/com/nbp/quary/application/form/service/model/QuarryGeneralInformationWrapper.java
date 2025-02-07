/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QuarryGeneralInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryGeneralInformation
 * @generated
 */
public class QuarryGeneralInformationWrapper
	extends BaseModelWrapper<QuarryGeneralInformation>
	implements ModelWrapper<QuarryGeneralInformation>,
			   QuarryGeneralInformation {

	public QuarryGeneralInformationWrapper(
		QuarryGeneralInformation quarryGeneralInformation) {

		super(quarryGeneralInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("generalInfoId", getGeneralInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("proposedNumberOfEmploy", getProposedNumberOfEmploy());
		attributes.put("nonRefundableFee", getNonRefundableFee());
		attributes.put("convictedUnderQuarryLaw", getConvictedUnderQuarryLaw());
		attributes.put("giveDetails", getGiveDetails());
		attributes.put("licenseRefused", getLicenseRefused());
		attributes.put("dateOfSignature", getDateOfSignature());
		attributes.put("quarryApplicationId", getQuarryApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long generalInfoId = (Long)attributes.get("generalInfoId");

		if (generalInfoId != null) {
			setGeneralInfoId(generalInfoId);
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

		String proposedNumberOfEmploy = (String)attributes.get(
			"proposedNumberOfEmploy");

		if (proposedNumberOfEmploy != null) {
			setProposedNumberOfEmploy(proposedNumberOfEmploy);
		}

		String nonRefundableFee = (String)attributes.get("nonRefundableFee");

		if (nonRefundableFee != null) {
			setNonRefundableFee(nonRefundableFee);
		}

		String convictedUnderQuarryLaw = (String)attributes.get(
			"convictedUnderQuarryLaw");

		if (convictedUnderQuarryLaw != null) {
			setConvictedUnderQuarryLaw(convictedUnderQuarryLaw);
		}

		String giveDetails = (String)attributes.get("giveDetails");

		if (giveDetails != null) {
			setGiveDetails(giveDetails);
		}

		String licenseRefused = (String)attributes.get("licenseRefused");

		if (licenseRefused != null) {
			setLicenseRefused(licenseRefused);
		}

		Date dateOfSignature = (Date)attributes.get("dateOfSignature");

		if (dateOfSignature != null) {
			setDateOfSignature(dateOfSignature);
		}

		Long quarryApplicationId = (Long)attributes.get("quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}
	}

	@Override
	public QuarryGeneralInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this quarry general information.
	 *
	 * @return the company ID of this quarry general information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the convicted under quarry law of this quarry general information.
	 *
	 * @return the convicted under quarry law of this quarry general information
	 */
	@Override
	public String getConvictedUnderQuarryLaw() {
		return model.getConvictedUnderQuarryLaw();
	}

	/**
	 * Returns the create date of this quarry general information.
	 *
	 * @return the create date of this quarry general information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of signature of this quarry general information.
	 *
	 * @return the date of signature of this quarry general information
	 */
	@Override
	public Date getDateOfSignature() {
		return model.getDateOfSignature();
	}

	/**
	 * Returns the general info ID of this quarry general information.
	 *
	 * @return the general info ID of this quarry general information
	 */
	@Override
	public long getGeneralInfoId() {
		return model.getGeneralInfoId();
	}

	/**
	 * Returns the give details of this quarry general information.
	 *
	 * @return the give details of this quarry general information
	 */
	@Override
	public String getGiveDetails() {
		return model.getGiveDetails();
	}

	/**
	 * Returns the group ID of this quarry general information.
	 *
	 * @return the group ID of this quarry general information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the license refused of this quarry general information.
	 *
	 * @return the license refused of this quarry general information
	 */
	@Override
	public String getLicenseRefused() {
		return model.getLicenseRefused();
	}

	/**
	 * Returns the modified date of this quarry general information.
	 *
	 * @return the modified date of this quarry general information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the non refundable fee of this quarry general information.
	 *
	 * @return the non refundable fee of this quarry general information
	 */
	@Override
	public String getNonRefundableFee() {
		return model.getNonRefundableFee();
	}

	/**
	 * Returns the primary key of this quarry general information.
	 *
	 * @return the primary key of this quarry general information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposed number of employ of this quarry general information.
	 *
	 * @return the proposed number of employ of this quarry general information
	 */
	@Override
	public String getProposedNumberOfEmploy() {
		return model.getProposedNumberOfEmploy();
	}

	/**
	 * Returns the quarry application ID of this quarry general information.
	 *
	 * @return the quarry application ID of this quarry general information
	 */
	@Override
	public long getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the user ID of this quarry general information.
	 *
	 * @return the user ID of this quarry general information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quarry general information.
	 *
	 * @return the user name of this quarry general information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quarry general information.
	 *
	 * @return the user uuid of this quarry general information
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
	 * Sets the company ID of this quarry general information.
	 *
	 * @param companyId the company ID of this quarry general information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the convicted under quarry law of this quarry general information.
	 *
	 * @param convictedUnderQuarryLaw the convicted under quarry law of this quarry general information
	 */
	@Override
	public void setConvictedUnderQuarryLaw(String convictedUnderQuarryLaw) {
		model.setConvictedUnderQuarryLaw(convictedUnderQuarryLaw);
	}

	/**
	 * Sets the create date of this quarry general information.
	 *
	 * @param createDate the create date of this quarry general information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of signature of this quarry general information.
	 *
	 * @param dateOfSignature the date of signature of this quarry general information
	 */
	@Override
	public void setDateOfSignature(Date dateOfSignature) {
		model.setDateOfSignature(dateOfSignature);
	}

	/**
	 * Sets the general info ID of this quarry general information.
	 *
	 * @param generalInfoId the general info ID of this quarry general information
	 */
	@Override
	public void setGeneralInfoId(long generalInfoId) {
		model.setGeneralInfoId(generalInfoId);
	}

	/**
	 * Sets the give details of this quarry general information.
	 *
	 * @param giveDetails the give details of this quarry general information
	 */
	@Override
	public void setGiveDetails(String giveDetails) {
		model.setGiveDetails(giveDetails);
	}

	/**
	 * Sets the group ID of this quarry general information.
	 *
	 * @param groupId the group ID of this quarry general information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the license refused of this quarry general information.
	 *
	 * @param licenseRefused the license refused of this quarry general information
	 */
	@Override
	public void setLicenseRefused(String licenseRefused) {
		model.setLicenseRefused(licenseRefused);
	}

	/**
	 * Sets the modified date of this quarry general information.
	 *
	 * @param modifiedDate the modified date of this quarry general information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the non refundable fee of this quarry general information.
	 *
	 * @param nonRefundableFee the non refundable fee of this quarry general information
	 */
	@Override
	public void setNonRefundableFee(String nonRefundableFee) {
		model.setNonRefundableFee(nonRefundableFee);
	}

	/**
	 * Sets the primary key of this quarry general information.
	 *
	 * @param primaryKey the primary key of this quarry general information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposed number of employ of this quarry general information.
	 *
	 * @param proposedNumberOfEmploy the proposed number of employ of this quarry general information
	 */
	@Override
	public void setProposedNumberOfEmploy(String proposedNumberOfEmploy) {
		model.setProposedNumberOfEmploy(proposedNumberOfEmploy);
	}

	/**
	 * Sets the quarry application ID of this quarry general information.
	 *
	 * @param quarryApplicationId the quarry application ID of this quarry general information
	 */
	@Override
	public void setQuarryApplicationId(long quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the user ID of this quarry general information.
	 *
	 * @param userId the user ID of this quarry general information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quarry general information.
	 *
	 * @param userName the user name of this quarry general information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quarry general information.
	 *
	 * @param userUuid the user uuid of this quarry general information
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
	protected QuarryGeneralInformationWrapper wrap(
		QuarryGeneralInformation quarryGeneralInformation) {

		return new QuarryGeneralInformationWrapper(quarryGeneralInformation);
	}

}