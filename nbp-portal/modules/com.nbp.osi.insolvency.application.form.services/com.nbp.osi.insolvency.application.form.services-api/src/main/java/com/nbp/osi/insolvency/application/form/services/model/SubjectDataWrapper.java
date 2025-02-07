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
 * This class is a wrapper for {@link SubjectData}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubjectData
 * @generated
 */
public class SubjectDataWrapper
	extends BaseModelWrapper<SubjectData>
	implements ModelWrapper<SubjectData>, SubjectData {

	public SubjectDataWrapper(SubjectData subjectData) {
		super(subjectData);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subjectDataId", getSubjectDataId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("verSubjectNameTitle", getVerSubjectNameTitle());
		attributes.put("verSubjectFirstName", getVerSubjectFirstName());
		attributes.put("verSubjectMiddleName", getVerSubjectMiddleName());
		attributes.put("verSubjectSurname", getVerSubjectSurname());
		attributes.put("verSubjectDob", getVerSubjectDob());
		attributes.put("verPresentAddress", getVerPresentAddress());
		attributes.put("verPlaceOfBirth", getVerPlaceOfBirth());
		attributes.put("verSubjectTrn", getVerSubjectTrn());
		attributes.put("verSubjectTelNum", getVerSubjectTelNum());
		attributes.put("verSubjectEmail", getVerSubjectEmail());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subjectDataId = (Long)attributes.get("subjectDataId");

		if (subjectDataId != null) {
			setSubjectDataId(subjectDataId);
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

		String verSubjectNameTitle = (String)attributes.get(
			"verSubjectNameTitle");

		if (verSubjectNameTitle != null) {
			setVerSubjectNameTitle(verSubjectNameTitle);
		}

		String verSubjectFirstName = (String)attributes.get(
			"verSubjectFirstName");

		if (verSubjectFirstName != null) {
			setVerSubjectFirstName(verSubjectFirstName);
		}

		String verSubjectMiddleName = (String)attributes.get(
			"verSubjectMiddleName");

		if (verSubjectMiddleName != null) {
			setVerSubjectMiddleName(verSubjectMiddleName);
		}

		String verSubjectSurname = (String)attributes.get("verSubjectSurname");

		if (verSubjectSurname != null) {
			setVerSubjectSurname(verSubjectSurname);
		}

		Date verSubjectDob = (Date)attributes.get("verSubjectDob");

		if (verSubjectDob != null) {
			setVerSubjectDob(verSubjectDob);
		}

		String verPresentAddress = (String)attributes.get("verPresentAddress");

		if (verPresentAddress != null) {
			setVerPresentAddress(verPresentAddress);
		}

		String verPlaceOfBirth = (String)attributes.get("verPlaceOfBirth");

		if (verPlaceOfBirth != null) {
			setVerPlaceOfBirth(verPlaceOfBirth);
		}

		String verSubjectTrn = (String)attributes.get("verSubjectTrn");

		if (verSubjectTrn != null) {
			setVerSubjectTrn(verSubjectTrn);
		}

		String verSubjectTelNum = (String)attributes.get("verSubjectTelNum");

		if (verSubjectTelNum != null) {
			setVerSubjectTelNum(verSubjectTelNum);
		}

		String verSubjectEmail = (String)attributes.get("verSubjectEmail");

		if (verSubjectEmail != null) {
			setVerSubjectEmail(verSubjectEmail);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public SubjectData cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this subject data.
	 *
	 * @return the company ID of this subject data
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this subject data.
	 *
	 * @return the create date of this subject data
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this subject data.
	 *
	 * @return the group ID of this subject data
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this subject data.
	 *
	 * @return the modified date of this subject data
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this subject data.
	 *
	 * @return the osi insolvency ID of this subject data
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this subject data.
	 *
	 * @return the primary key of this subject data
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the subject data ID of this subject data.
	 *
	 * @return the subject data ID of this subject data
	 */
	@Override
	public long getSubjectDataId() {
		return model.getSubjectDataId();
	}

	/**
	 * Returns the user ID of this subject data.
	 *
	 * @return the user ID of this subject data
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this subject data.
	 *
	 * @return the user name of this subject data
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this subject data.
	 *
	 * @return the user uuid of this subject data
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the ver place of birth of this subject data.
	 *
	 * @return the ver place of birth of this subject data
	 */
	@Override
	public String getVerPlaceOfBirth() {
		return model.getVerPlaceOfBirth();
	}

	/**
	 * Returns the ver present address of this subject data.
	 *
	 * @return the ver present address of this subject data
	 */
	@Override
	public String getVerPresentAddress() {
		return model.getVerPresentAddress();
	}

	/**
	 * Returns the ver subject dob of this subject data.
	 *
	 * @return the ver subject dob of this subject data
	 */
	@Override
	public Date getVerSubjectDob() {
		return model.getVerSubjectDob();
	}

	/**
	 * Returns the ver subject email of this subject data.
	 *
	 * @return the ver subject email of this subject data
	 */
	@Override
	public String getVerSubjectEmail() {
		return model.getVerSubjectEmail();
	}

	/**
	 * Returns the ver subject first name of this subject data.
	 *
	 * @return the ver subject first name of this subject data
	 */
	@Override
	public String getVerSubjectFirstName() {
		return model.getVerSubjectFirstName();
	}

	/**
	 * Returns the ver subject middle name of this subject data.
	 *
	 * @return the ver subject middle name of this subject data
	 */
	@Override
	public String getVerSubjectMiddleName() {
		return model.getVerSubjectMiddleName();
	}

	/**
	 * Returns the ver subject name title of this subject data.
	 *
	 * @return the ver subject name title of this subject data
	 */
	@Override
	public String getVerSubjectNameTitle() {
		return model.getVerSubjectNameTitle();
	}

	/**
	 * Returns the ver subject surname of this subject data.
	 *
	 * @return the ver subject surname of this subject data
	 */
	@Override
	public String getVerSubjectSurname() {
		return model.getVerSubjectSurname();
	}

	/**
	 * Returns the ver subject tel num of this subject data.
	 *
	 * @return the ver subject tel num of this subject data
	 */
	@Override
	public String getVerSubjectTelNum() {
		return model.getVerSubjectTelNum();
	}

	/**
	 * Returns the ver subject trn of this subject data.
	 *
	 * @return the ver subject trn of this subject data
	 */
	@Override
	public String getVerSubjectTrn() {
		return model.getVerSubjectTrn();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this subject data.
	 *
	 * @param companyId the company ID of this subject data
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this subject data.
	 *
	 * @param createDate the create date of this subject data
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this subject data.
	 *
	 * @param groupId the group ID of this subject data
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this subject data.
	 *
	 * @param modifiedDate the modified date of this subject data
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this subject data.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this subject data
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this subject data.
	 *
	 * @param primaryKey the primary key of this subject data
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the subject data ID of this subject data.
	 *
	 * @param subjectDataId the subject data ID of this subject data
	 */
	@Override
	public void setSubjectDataId(long subjectDataId) {
		model.setSubjectDataId(subjectDataId);
	}

	/**
	 * Sets the user ID of this subject data.
	 *
	 * @param userId the user ID of this subject data
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this subject data.
	 *
	 * @param userName the user name of this subject data
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this subject data.
	 *
	 * @param userUuid the user uuid of this subject data
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the ver place of birth of this subject data.
	 *
	 * @param verPlaceOfBirth the ver place of birth of this subject data
	 */
	@Override
	public void setVerPlaceOfBirth(String verPlaceOfBirth) {
		model.setVerPlaceOfBirth(verPlaceOfBirth);
	}

	/**
	 * Sets the ver present address of this subject data.
	 *
	 * @param verPresentAddress the ver present address of this subject data
	 */
	@Override
	public void setVerPresentAddress(String verPresentAddress) {
		model.setVerPresentAddress(verPresentAddress);
	}

	/**
	 * Sets the ver subject dob of this subject data.
	 *
	 * @param verSubjectDob the ver subject dob of this subject data
	 */
	@Override
	public void setVerSubjectDob(Date verSubjectDob) {
		model.setVerSubjectDob(verSubjectDob);
	}

	/**
	 * Sets the ver subject email of this subject data.
	 *
	 * @param verSubjectEmail the ver subject email of this subject data
	 */
	@Override
	public void setVerSubjectEmail(String verSubjectEmail) {
		model.setVerSubjectEmail(verSubjectEmail);
	}

	/**
	 * Sets the ver subject first name of this subject data.
	 *
	 * @param verSubjectFirstName the ver subject first name of this subject data
	 */
	@Override
	public void setVerSubjectFirstName(String verSubjectFirstName) {
		model.setVerSubjectFirstName(verSubjectFirstName);
	}

	/**
	 * Sets the ver subject middle name of this subject data.
	 *
	 * @param verSubjectMiddleName the ver subject middle name of this subject data
	 */
	@Override
	public void setVerSubjectMiddleName(String verSubjectMiddleName) {
		model.setVerSubjectMiddleName(verSubjectMiddleName);
	}

	/**
	 * Sets the ver subject name title of this subject data.
	 *
	 * @param verSubjectNameTitle the ver subject name title of this subject data
	 */
	@Override
	public void setVerSubjectNameTitle(String verSubjectNameTitle) {
		model.setVerSubjectNameTitle(verSubjectNameTitle);
	}

	/**
	 * Sets the ver subject surname of this subject data.
	 *
	 * @param verSubjectSurname the ver subject surname of this subject data
	 */
	@Override
	public void setVerSubjectSurname(String verSubjectSurname) {
		model.setVerSubjectSurname(verSubjectSurname);
	}

	/**
	 * Sets the ver subject tel num of this subject data.
	 *
	 * @param verSubjectTelNum the ver subject tel num of this subject data
	 */
	@Override
	public void setVerSubjectTelNum(String verSubjectTelNum) {
		model.setVerSubjectTelNum(verSubjectTelNum);
	}

	/**
	 * Sets the ver subject trn of this subject data.
	 *
	 * @param verSubjectTrn the ver subject trn of this subject data
	 */
	@Override
	public void setVerSubjectTrn(String verSubjectTrn) {
		model.setVerSubjectTrn(verSubjectTrn);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SubjectDataWrapper wrap(SubjectData subjectData) {
		return new SubjectDataWrapper(subjectData);
	}

}