/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ManuCompanyInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfo
 * @generated
 */
public class ManuCompanyInfoWrapper
	extends BaseModelWrapper<ManuCompanyInfo>
	implements ManuCompanyInfo, ModelWrapper<ManuCompanyInfo> {

	public ManuCompanyInfoWrapper(ManuCompanyInfo manuCompanyInfo) {
		super(manuCompanyInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("manuCompanyInfoId", getManuCompanyInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("directorName", getDirectorName());
		attributes.put("businessAddress", getBusinessAddress());
		attributes.put("tccNumber", getTccNumber());
		attributes.put("incorporationDate", getIncorporationDate());
		attributes.put("factoryAddress", getFactoryAddress());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("companyWebsite", getCompanyWebsite());
		attributes.put("applicantTRN", getApplicantTRN());
		attributes.put("beneficieryTRN", getBeneficieryTRN());
		attributes.put("parish", getParish());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manuCompanyInfoId = (Long)attributes.get("manuCompanyInfoId");

		if (manuCompanyInfoId != null) {
			setManuCompanyInfoId(manuCompanyInfoId);
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

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String directorName = (String)attributes.get("directorName");

		if (directorName != null) {
			setDirectorName(directorName);
		}

		String businessAddress = (String)attributes.get("businessAddress");

		if (businessAddress != null) {
			setBusinessAddress(businessAddress);
		}

		String tccNumber = (String)attributes.get("tccNumber");

		if (tccNumber != null) {
			setTccNumber(tccNumber);
		}

		Date incorporationDate = (Date)attributes.get("incorporationDate");

		if (incorporationDate != null) {
			setIncorporationDate(incorporationDate);
		}

		String factoryAddress = (String)attributes.get("factoryAddress");

		if (factoryAddress != null) {
			setFactoryAddress(factoryAddress);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String companyWebsite = (String)attributes.get("companyWebsite");

		if (companyWebsite != null) {
			setCompanyWebsite(companyWebsite);
		}

		String applicantTRN = (String)attributes.get("applicantTRN");

		if (applicantTRN != null) {
			setApplicantTRN(applicantTRN);
		}

		String beneficieryTRN = (String)attributes.get("beneficieryTRN");

		if (beneficieryTRN != null) {
			setBeneficieryTRN(beneficieryTRN);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}
	}

	@Override
	public ManuCompanyInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant trn of this manu company info.
	 *
	 * @return the applicant trn of this manu company info
	 */
	@Override
	public String getApplicantTRN() {
		return model.getApplicantTRN();
	}

	/**
	 * Returns the beneficiery trn of this manu company info.
	 *
	 * @return the beneficiery trn of this manu company info
	 */
	@Override
	public String getBeneficieryTRN() {
		return model.getBeneficieryTRN();
	}

	/**
	 * Returns the business address of this manu company info.
	 *
	 * @return the business address of this manu company info
	 */
	@Override
	public String getBusinessAddress() {
		return model.getBusinessAddress();
	}

	/**
	 * Returns the company ID of this manu company info.
	 *
	 * @return the company ID of this manu company info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this manu company info.
	 *
	 * @return the company name of this manu company info
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the company website of this manu company info.
	 *
	 * @return the company website of this manu company info
	 */
	@Override
	public String getCompanyWebsite() {
		return model.getCompanyWebsite();
	}

	/**
	 * Returns the create date of this manu company info.
	 *
	 * @return the create date of this manu company info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the director name of this manu company info.
	 *
	 * @return the director name of this manu company info
	 */
	@Override
	public String getDirectorName() {
		return model.getDirectorName();
	}

	/**
	 * Returns the email address of this manu company info.
	 *
	 * @return the email address of this manu company info
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the factory address of this manu company info.
	 *
	 * @return the factory address of this manu company info
	 */
	@Override
	public String getFactoryAddress() {
		return model.getFactoryAddress();
	}

	/**
	 * Returns the group ID of this manu company info.
	 *
	 * @return the group ID of this manu company info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the incorporation date of this manu company info.
	 *
	 * @return the incorporation date of this manu company info
	 */
	@Override
	public Date getIncorporationDate() {
		return model.getIncorporationDate();
	}

	/**
	 * Returns the manu company info ID of this manu company info.
	 *
	 * @return the manu company info ID of this manu company info
	 */
	@Override
	public long getManuCompanyInfoId() {
		return model.getManuCompanyInfoId();
	}

	/**
	 * Returns the manufacturing application ID of this manu company info.
	 *
	 * @return the manufacturing application ID of this manu company info
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this manu company info.
	 *
	 * @return the modified date of this manu company info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this manu company info.
	 *
	 * @return the parish of this manu company info
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this manu company info.
	 *
	 * @return the primary key of this manu company info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tcc number of this manu company info.
	 *
	 * @return the tcc number of this manu company info
	 */
	@Override
	public String getTccNumber() {
		return model.getTccNumber();
	}

	/**
	 * Returns the telephone number of this manu company info.
	 *
	 * @return the telephone number of this manu company info
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this manu company info.
	 *
	 * @return the user ID of this manu company info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manu company info.
	 *
	 * @return the user name of this manu company info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manu company info.
	 *
	 * @return the user uuid of this manu company info
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
	 * Sets the applicant trn of this manu company info.
	 *
	 * @param applicantTRN the applicant trn of this manu company info
	 */
	@Override
	public void setApplicantTRN(String applicantTRN) {
		model.setApplicantTRN(applicantTRN);
	}

	/**
	 * Sets the beneficiery trn of this manu company info.
	 *
	 * @param beneficieryTRN the beneficiery trn of this manu company info
	 */
	@Override
	public void setBeneficieryTRN(String beneficieryTRN) {
		model.setBeneficieryTRN(beneficieryTRN);
	}

	/**
	 * Sets the business address of this manu company info.
	 *
	 * @param businessAddress the business address of this manu company info
	 */
	@Override
	public void setBusinessAddress(String businessAddress) {
		model.setBusinessAddress(businessAddress);
	}

	/**
	 * Sets the company ID of this manu company info.
	 *
	 * @param companyId the company ID of this manu company info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this manu company info.
	 *
	 * @param companyName the company name of this manu company info
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the company website of this manu company info.
	 *
	 * @param companyWebsite the company website of this manu company info
	 */
	@Override
	public void setCompanyWebsite(String companyWebsite) {
		model.setCompanyWebsite(companyWebsite);
	}

	/**
	 * Sets the create date of this manu company info.
	 *
	 * @param createDate the create date of this manu company info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the director name of this manu company info.
	 *
	 * @param directorName the director name of this manu company info
	 */
	@Override
	public void setDirectorName(String directorName) {
		model.setDirectorName(directorName);
	}

	/**
	 * Sets the email address of this manu company info.
	 *
	 * @param emailAddress the email address of this manu company info
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the factory address of this manu company info.
	 *
	 * @param factoryAddress the factory address of this manu company info
	 */
	@Override
	public void setFactoryAddress(String factoryAddress) {
		model.setFactoryAddress(factoryAddress);
	}

	/**
	 * Sets the group ID of this manu company info.
	 *
	 * @param groupId the group ID of this manu company info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the incorporation date of this manu company info.
	 *
	 * @param incorporationDate the incorporation date of this manu company info
	 */
	@Override
	public void setIncorporationDate(Date incorporationDate) {
		model.setIncorporationDate(incorporationDate);
	}

	/**
	 * Sets the manu company info ID of this manu company info.
	 *
	 * @param manuCompanyInfoId the manu company info ID of this manu company info
	 */
	@Override
	public void setManuCompanyInfoId(long manuCompanyInfoId) {
		model.setManuCompanyInfoId(manuCompanyInfoId);
	}

	/**
	 * Sets the manufacturing application ID of this manu company info.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu company info
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this manu company info.
	 *
	 * @param modifiedDate the modified date of this manu company info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this manu company info.
	 *
	 * @param parish the parish of this manu company info
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this manu company info.
	 *
	 * @param primaryKey the primary key of this manu company info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tcc number of this manu company info.
	 *
	 * @param tccNumber the tcc number of this manu company info
	 */
	@Override
	public void setTccNumber(String tccNumber) {
		model.setTccNumber(tccNumber);
	}

	/**
	 * Sets the telephone number of this manu company info.
	 *
	 * @param telephoneNumber the telephone number of this manu company info
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this manu company info.
	 *
	 * @param userId the user ID of this manu company info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manu company info.
	 *
	 * @param userName the user name of this manu company info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manu company info.
	 *
	 * @param userUuid the user uuid of this manu company info
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
	protected ManuCompanyInfoWrapper wrap(ManuCompanyInfo manuCompanyInfo) {
		return new ManuCompanyInfoWrapper(manuCompanyInfo);
	}

}