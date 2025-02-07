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
 * This class is a wrapper for {@link QuarryApplicatntInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicatntInformation
 * @generated
 */
public class QuarryApplicatntInformationWrapper
	extends BaseModelWrapper<QuarryApplicatntInformation>
	implements ModelWrapper<QuarryApplicatntInformation>,
			   QuarryApplicatntInformation {

	public QuarryApplicatntInformationWrapper(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		super(quarryApplicatntInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("auarryApplicantId", getAuarryApplicantId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("addressOfApplicant", getAddressOfApplicant());
		attributes.put("telephoneOfApplicant", getTelephoneOfApplicant());
		attributes.put("emailOfApplicant", getEmailOfApplicant());
		attributes.put("trnAndTcc", getTrnAndTcc());
		attributes.put("quarryApplicationId", getQuarryApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long auarryApplicantId = (Long)attributes.get("auarryApplicantId");

		if (auarryApplicantId != null) {
			setAuarryApplicantId(auarryApplicantId);
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

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String addressOfApplicant = (String)attributes.get(
			"addressOfApplicant");

		if (addressOfApplicant != null) {
			setAddressOfApplicant(addressOfApplicant);
		}

		String telephoneOfApplicant = (String)attributes.get(
			"telephoneOfApplicant");

		if (telephoneOfApplicant != null) {
			setTelephoneOfApplicant(telephoneOfApplicant);
		}

		String emailOfApplicant = (String)attributes.get("emailOfApplicant");

		if (emailOfApplicant != null) {
			setEmailOfApplicant(emailOfApplicant);
		}

		String trnAndTcc = (String)attributes.get("trnAndTcc");

		if (trnAndTcc != null) {
			setTrnAndTcc(trnAndTcc);
		}

		Long quarryApplicationId = (Long)attributes.get("quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}
	}

	@Override
	public QuarryApplicatntInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of applicant of this quarry applicatnt information.
	 *
	 * @return the address of applicant of this quarry applicatnt information
	 */
	@Override
	public String getAddressOfApplicant() {
		return model.getAddressOfApplicant();
	}

	/**
	 * Returns the auarry applicant ID of this quarry applicatnt information.
	 *
	 * @return the auarry applicant ID of this quarry applicatnt information
	 */
	@Override
	public long getAuarryApplicantId() {
		return model.getAuarryApplicantId();
	}

	/**
	 * Returns the company ID of this quarry applicatnt information.
	 *
	 * @return the company ID of this quarry applicatnt information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quarry applicatnt information.
	 *
	 * @return the create date of this quarry applicatnt information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of applicant of this quarry applicatnt information.
	 *
	 * @return the email of applicant of this quarry applicatnt information
	 */
	@Override
	public String getEmailOfApplicant() {
		return model.getEmailOfApplicant();
	}

	/**
	 * Returns the group ID of this quarry applicatnt information.
	 *
	 * @return the group ID of this quarry applicatnt information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this quarry applicatnt information.
	 *
	 * @return the modified date of this quarry applicatnt information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this quarry applicatnt information.
	 *
	 * @return the name of applicant of this quarry applicatnt information
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the primary key of this quarry applicatnt information.
	 *
	 * @return the primary key of this quarry applicatnt information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quarry application ID of this quarry applicatnt information.
	 *
	 * @return the quarry application ID of this quarry applicatnt information
	 */
	@Override
	public long getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the telephone of applicant of this quarry applicatnt information.
	 *
	 * @return the telephone of applicant of this quarry applicatnt information
	 */
	@Override
	public String getTelephoneOfApplicant() {
		return model.getTelephoneOfApplicant();
	}

	/**
	 * Returns the trn and tcc of this quarry applicatnt information.
	 *
	 * @return the trn and tcc of this quarry applicatnt information
	 */
	@Override
	public String getTrnAndTcc() {
		return model.getTrnAndTcc();
	}

	/**
	 * Returns the user ID of this quarry applicatnt information.
	 *
	 * @return the user ID of this quarry applicatnt information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quarry applicatnt information.
	 *
	 * @return the user name of this quarry applicatnt information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quarry applicatnt information.
	 *
	 * @return the user uuid of this quarry applicatnt information
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
	 * Sets the address of applicant of this quarry applicatnt information.
	 *
	 * @param addressOfApplicant the address of applicant of this quarry applicatnt information
	 */
	@Override
	public void setAddressOfApplicant(String addressOfApplicant) {
		model.setAddressOfApplicant(addressOfApplicant);
	}

	/**
	 * Sets the auarry applicant ID of this quarry applicatnt information.
	 *
	 * @param auarryApplicantId the auarry applicant ID of this quarry applicatnt information
	 */
	@Override
	public void setAuarryApplicantId(long auarryApplicantId) {
		model.setAuarryApplicantId(auarryApplicantId);
	}

	/**
	 * Sets the company ID of this quarry applicatnt information.
	 *
	 * @param companyId the company ID of this quarry applicatnt information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quarry applicatnt information.
	 *
	 * @param createDate the create date of this quarry applicatnt information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of applicant of this quarry applicatnt information.
	 *
	 * @param emailOfApplicant the email of applicant of this quarry applicatnt information
	 */
	@Override
	public void setEmailOfApplicant(String emailOfApplicant) {
		model.setEmailOfApplicant(emailOfApplicant);
	}

	/**
	 * Sets the group ID of this quarry applicatnt information.
	 *
	 * @param groupId the group ID of this quarry applicatnt information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this quarry applicatnt information.
	 *
	 * @param modifiedDate the modified date of this quarry applicatnt information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this quarry applicatnt information.
	 *
	 * @param nameOfApplicant the name of applicant of this quarry applicatnt information
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the primary key of this quarry applicatnt information.
	 *
	 * @param primaryKey the primary key of this quarry applicatnt information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quarry application ID of this quarry applicatnt information.
	 *
	 * @param quarryApplicationId the quarry application ID of this quarry applicatnt information
	 */
	@Override
	public void setQuarryApplicationId(long quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the telephone of applicant of this quarry applicatnt information.
	 *
	 * @param telephoneOfApplicant the telephone of applicant of this quarry applicatnt information
	 */
	@Override
	public void setTelephoneOfApplicant(String telephoneOfApplicant) {
		model.setTelephoneOfApplicant(telephoneOfApplicant);
	}

	/**
	 * Sets the trn and tcc of this quarry applicatnt information.
	 *
	 * @param trnAndTcc the trn and tcc of this quarry applicatnt information
	 */
	@Override
	public void setTrnAndTcc(String trnAndTcc) {
		model.setTrnAndTcc(trnAndTcc);
	}

	/**
	 * Sets the user ID of this quarry applicatnt information.
	 *
	 * @param userId the user ID of this quarry applicatnt information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quarry applicatnt information.
	 *
	 * @param userName the user name of this quarry applicatnt information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quarry applicatnt information.
	 *
	 * @param userUuid the user uuid of this quarry applicatnt information
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
	protected QuarryApplicatntInformationWrapper wrap(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		return new QuarryApplicatntInformationWrapper(
			quarryApplicatntInformation);
	}

}