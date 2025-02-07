/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccCerBodyApplicantInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyApplicantInfo
 * @generated
 */
public class AccCerBodyApplicantInfoWrapper
	extends BaseModelWrapper<AccCerBodyApplicantInfo>
	implements AccCerBodyApplicantInfo, ModelWrapper<AccCerBodyApplicantInfo> {

	public AccCerBodyApplicantInfoWrapper(
		AccCerBodyApplicantInfo accCerBodyApplicantInfo) {

		super(accCerBodyApplicantInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accCerBodyApplicantInfoId", getAccCerBodyApplicantInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantTelephone", getApplicantTelephone());
		attributes.put("applicantFaxNo", getApplicantFaxNo());
		attributes.put("applicantWebsite", getApplicantWebsite());
		attributes.put("certificationName", getCertificationName());
		attributes.put("certiAddress", getCertiAddress());
		attributes.put("personnelName", getPersonnelName());
		attributes.put("personnelEmail", getPersonnelEmail());
		attributes.put("personnelContactName", getPersonnelContactName());
		attributes.put("personnelContactEmail", getPersonnelContactEmail());
		attributes.put("personnelFMName", getPersonnelFMName());
		attributes.put("personnelFMEmail", getPersonnelFMEmail());
		attributes.put("accreditationRequest", getAccreditationRequest());
		attributes.put("managementSystem", getManagementSystem());
		attributes.put("specifyOther", getSpecifyOther());
		attributes.put("listOfStandard", getListOfStandard());
		attributes.put("authorizedPersonnelName", getAuthorizedPersonnelName());
		attributes.put("authorizedPersonnelPos", getAuthorizedPersonnelPos());
		attributes.put("authorizedPersonnelDate", getAuthorizedPersonnelDate());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accCerBodyApplicantInfoId = (Long)attributes.get(
			"accCerBodyApplicantInfoId");

		if (accCerBodyApplicantInfoId != null) {
			setAccCerBodyApplicantInfoId(accCerBodyApplicantInfoId);
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

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantTelephone = (String)attributes.get(
			"applicantTelephone");

		if (applicantTelephone != null) {
			setApplicantTelephone(applicantTelephone);
		}

		String applicantFaxNo = (String)attributes.get("applicantFaxNo");

		if (applicantFaxNo != null) {
			setApplicantFaxNo(applicantFaxNo);
		}

		String applicantWebsite = (String)attributes.get("applicantWebsite");

		if (applicantWebsite != null) {
			setApplicantWebsite(applicantWebsite);
		}

		String certificationName = (String)attributes.get("certificationName");

		if (certificationName != null) {
			setCertificationName(certificationName);
		}

		String certiAddress = (String)attributes.get("certiAddress");

		if (certiAddress != null) {
			setCertiAddress(certiAddress);
		}

		String personnelName = (String)attributes.get("personnelName");

		if (personnelName != null) {
			setPersonnelName(personnelName);
		}

		String personnelEmail = (String)attributes.get("personnelEmail");

		if (personnelEmail != null) {
			setPersonnelEmail(personnelEmail);
		}

		String personnelContactName = (String)attributes.get(
			"personnelContactName");

		if (personnelContactName != null) {
			setPersonnelContactName(personnelContactName);
		}

		String personnelContactEmail = (String)attributes.get(
			"personnelContactEmail");

		if (personnelContactEmail != null) {
			setPersonnelContactEmail(personnelContactEmail);
		}

		String personnelFMName = (String)attributes.get("personnelFMName");

		if (personnelFMName != null) {
			setPersonnelFMName(personnelFMName);
		}

		String personnelFMEmail = (String)attributes.get("personnelFMEmail");

		if (personnelFMEmail != null) {
			setPersonnelFMEmail(personnelFMEmail);
		}

		String accreditationRequest = (String)attributes.get(
			"accreditationRequest");

		if (accreditationRequest != null) {
			setAccreditationRequest(accreditationRequest);
		}

		String managementSystem = (String)attributes.get("managementSystem");

		if (managementSystem != null) {
			setManagementSystem(managementSystem);
		}

		String specifyOther = (String)attributes.get("specifyOther");

		if (specifyOther != null) {
			setSpecifyOther(specifyOther);
		}

		String listOfStandard = (String)attributes.get("listOfStandard");

		if (listOfStandard != null) {
			setListOfStandard(listOfStandard);
		}

		String authorizedPersonnelName = (String)attributes.get(
			"authorizedPersonnelName");

		if (authorizedPersonnelName != null) {
			setAuthorizedPersonnelName(authorizedPersonnelName);
		}

		String authorizedPersonnelPos = (String)attributes.get(
			"authorizedPersonnelPos");

		if (authorizedPersonnelPos != null) {
			setAuthorizedPersonnelPos(authorizedPersonnelPos);
		}

		Date authorizedPersonnelDate = (Date)attributes.get(
			"authorizedPersonnelDate");

		if (authorizedPersonnelDate != null) {
			setAuthorizedPersonnelDate(authorizedPersonnelDate);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccCerBodyApplicantInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc cer body applicant info ID of this acc cer body applicant info.
	 *
	 * @return the acc cer body applicant info ID of this acc cer body applicant info
	 */
	@Override
	public long getAccCerBodyApplicantInfoId() {
		return model.getAccCerBodyApplicantInfoId();
	}

	/**
	 * Returns the accreditation request of this acc cer body applicant info.
	 *
	 * @return the accreditation request of this acc cer body applicant info
	 */
	@Override
	public String getAccreditationRequest() {
		return model.getAccreditationRequest();
	}

	/**
	 * Returns the applicant address of this acc cer body applicant info.
	 *
	 * @return the applicant address of this acc cer body applicant info
	 */
	@Override
	public String getApplicantAddress() {
		return model.getApplicantAddress();
	}

	/**
	 * Returns the applicant fax no of this acc cer body applicant info.
	 *
	 * @return the applicant fax no of this acc cer body applicant info
	 */
	@Override
	public String getApplicantFaxNo() {
		return model.getApplicantFaxNo();
	}

	/**
	 * Returns the applicant name of this acc cer body applicant info.
	 *
	 * @return the applicant name of this acc cer body applicant info
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the applicant telephone of this acc cer body applicant info.
	 *
	 * @return the applicant telephone of this acc cer body applicant info
	 */
	@Override
	public String getApplicantTelephone() {
		return model.getApplicantTelephone();
	}

	/**
	 * Returns the applicant website of this acc cer body applicant info.
	 *
	 * @return the applicant website of this acc cer body applicant info
	 */
	@Override
	public String getApplicantWebsite() {
		return model.getApplicantWebsite();
	}

	/**
	 * Returns the authorized personnel date of this acc cer body applicant info.
	 *
	 * @return the authorized personnel date of this acc cer body applicant info
	 */
	@Override
	public Date getAuthorizedPersonnelDate() {
		return model.getAuthorizedPersonnelDate();
	}

	/**
	 * Returns the authorized personnel name of this acc cer body applicant info.
	 *
	 * @return the authorized personnel name of this acc cer body applicant info
	 */
	@Override
	public String getAuthorizedPersonnelName() {
		return model.getAuthorizedPersonnelName();
	}

	/**
	 * Returns the authorized personnel pos of this acc cer body applicant info.
	 *
	 * @return the authorized personnel pos of this acc cer body applicant info
	 */
	@Override
	public String getAuthorizedPersonnelPos() {
		return model.getAuthorizedPersonnelPos();
	}

	/**
	 * Returns the certi address of this acc cer body applicant info.
	 *
	 * @return the certi address of this acc cer body applicant info
	 */
	@Override
	public String getCertiAddress() {
		return model.getCertiAddress();
	}

	/**
	 * Returns the certification name of this acc cer body applicant info.
	 *
	 * @return the certification name of this acc cer body applicant info
	 */
	@Override
	public String getCertificationName() {
		return model.getCertificationName();
	}

	/**
	 * Returns the company ID of this acc cer body applicant info.
	 *
	 * @return the company ID of this acc cer body applicant info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc cer body applicant info.
	 *
	 * @return the create date of this acc cer body applicant info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acc cer body applicant info.
	 *
	 * @return the group ID of this acc cer body applicant info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc cer body applicant info.
	 *
	 * @return the janaac application ID of this acc cer body applicant info
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the list of standard of this acc cer body applicant info.
	 *
	 * @return the list of standard of this acc cer body applicant info
	 */
	@Override
	public String getListOfStandard() {
		return model.getListOfStandard();
	}

	/**
	 * Returns the management system of this acc cer body applicant info.
	 *
	 * @return the management system of this acc cer body applicant info
	 */
	@Override
	public String getManagementSystem() {
		return model.getManagementSystem();
	}

	/**
	 * Returns the modified date of this acc cer body applicant info.
	 *
	 * @return the modified date of this acc cer body applicant info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the personnel contact email of this acc cer body applicant info.
	 *
	 * @return the personnel contact email of this acc cer body applicant info
	 */
	@Override
	public String getPersonnelContactEmail() {
		return model.getPersonnelContactEmail();
	}

	/**
	 * Returns the personnel contact name of this acc cer body applicant info.
	 *
	 * @return the personnel contact name of this acc cer body applicant info
	 */
	@Override
	public String getPersonnelContactName() {
		return model.getPersonnelContactName();
	}

	/**
	 * Returns the personnel email of this acc cer body applicant info.
	 *
	 * @return the personnel email of this acc cer body applicant info
	 */
	@Override
	public String getPersonnelEmail() {
		return model.getPersonnelEmail();
	}

	/**
	 * Returns the personnel fm email of this acc cer body applicant info.
	 *
	 * @return the personnel fm email of this acc cer body applicant info
	 */
	@Override
	public String getPersonnelFMEmail() {
		return model.getPersonnelFMEmail();
	}

	/**
	 * Returns the personnel fm name of this acc cer body applicant info.
	 *
	 * @return the personnel fm name of this acc cer body applicant info
	 */
	@Override
	public String getPersonnelFMName() {
		return model.getPersonnelFMName();
	}

	/**
	 * Returns the personnel name of this acc cer body applicant info.
	 *
	 * @return the personnel name of this acc cer body applicant info
	 */
	@Override
	public String getPersonnelName() {
		return model.getPersonnelName();
	}

	/**
	 * Returns the primary key of this acc cer body applicant info.
	 *
	 * @return the primary key of this acc cer body applicant info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the specify other of this acc cer body applicant info.
	 *
	 * @return the specify other of this acc cer body applicant info
	 */
	@Override
	public String getSpecifyOther() {
		return model.getSpecifyOther();
	}

	/**
	 * Returns the user ID of this acc cer body applicant info.
	 *
	 * @return the user ID of this acc cer body applicant info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc cer body applicant info.
	 *
	 * @return the user name of this acc cer body applicant info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc cer body applicant info.
	 *
	 * @return the user uuid of this acc cer body applicant info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc cer body applicant info.
	 *
	 * @return the uuid of this acc cer body applicant info
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc cer body applicant info ID of this acc cer body applicant info.
	 *
	 * @param accCerBodyApplicantInfoId the acc cer body applicant info ID of this acc cer body applicant info
	 */
	@Override
	public void setAccCerBodyApplicantInfoId(long accCerBodyApplicantInfoId) {
		model.setAccCerBodyApplicantInfoId(accCerBodyApplicantInfoId);
	}

	/**
	 * Sets the accreditation request of this acc cer body applicant info.
	 *
	 * @param accreditationRequest the accreditation request of this acc cer body applicant info
	 */
	@Override
	public void setAccreditationRequest(String accreditationRequest) {
		model.setAccreditationRequest(accreditationRequest);
	}

	/**
	 * Sets the applicant address of this acc cer body applicant info.
	 *
	 * @param applicantAddress the applicant address of this acc cer body applicant info
	 */
	@Override
	public void setApplicantAddress(String applicantAddress) {
		model.setApplicantAddress(applicantAddress);
	}

	/**
	 * Sets the applicant fax no of this acc cer body applicant info.
	 *
	 * @param applicantFaxNo the applicant fax no of this acc cer body applicant info
	 */
	@Override
	public void setApplicantFaxNo(String applicantFaxNo) {
		model.setApplicantFaxNo(applicantFaxNo);
	}

	/**
	 * Sets the applicant name of this acc cer body applicant info.
	 *
	 * @param applicantName the applicant name of this acc cer body applicant info
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the applicant telephone of this acc cer body applicant info.
	 *
	 * @param applicantTelephone the applicant telephone of this acc cer body applicant info
	 */
	@Override
	public void setApplicantTelephone(String applicantTelephone) {
		model.setApplicantTelephone(applicantTelephone);
	}

	/**
	 * Sets the applicant website of this acc cer body applicant info.
	 *
	 * @param applicantWebsite the applicant website of this acc cer body applicant info
	 */
	@Override
	public void setApplicantWebsite(String applicantWebsite) {
		model.setApplicantWebsite(applicantWebsite);
	}

	/**
	 * Sets the authorized personnel date of this acc cer body applicant info.
	 *
	 * @param authorizedPersonnelDate the authorized personnel date of this acc cer body applicant info
	 */
	@Override
	public void setAuthorizedPersonnelDate(Date authorizedPersonnelDate) {
		model.setAuthorizedPersonnelDate(authorizedPersonnelDate);
	}

	/**
	 * Sets the authorized personnel name of this acc cer body applicant info.
	 *
	 * @param authorizedPersonnelName the authorized personnel name of this acc cer body applicant info
	 */
	@Override
	public void setAuthorizedPersonnelName(String authorizedPersonnelName) {
		model.setAuthorizedPersonnelName(authorizedPersonnelName);
	}

	/**
	 * Sets the authorized personnel pos of this acc cer body applicant info.
	 *
	 * @param authorizedPersonnelPos the authorized personnel pos of this acc cer body applicant info
	 */
	@Override
	public void setAuthorizedPersonnelPos(String authorizedPersonnelPos) {
		model.setAuthorizedPersonnelPos(authorizedPersonnelPos);
	}

	/**
	 * Sets the certi address of this acc cer body applicant info.
	 *
	 * @param certiAddress the certi address of this acc cer body applicant info
	 */
	@Override
	public void setCertiAddress(String certiAddress) {
		model.setCertiAddress(certiAddress);
	}

	/**
	 * Sets the certification name of this acc cer body applicant info.
	 *
	 * @param certificationName the certification name of this acc cer body applicant info
	 */
	@Override
	public void setCertificationName(String certificationName) {
		model.setCertificationName(certificationName);
	}

	/**
	 * Sets the company ID of this acc cer body applicant info.
	 *
	 * @param companyId the company ID of this acc cer body applicant info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc cer body applicant info.
	 *
	 * @param createDate the create date of this acc cer body applicant info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acc cer body applicant info.
	 *
	 * @param groupId the group ID of this acc cer body applicant info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc cer body applicant info.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc cer body applicant info
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the list of standard of this acc cer body applicant info.
	 *
	 * @param listOfStandard the list of standard of this acc cer body applicant info
	 */
	@Override
	public void setListOfStandard(String listOfStandard) {
		model.setListOfStandard(listOfStandard);
	}

	/**
	 * Sets the management system of this acc cer body applicant info.
	 *
	 * @param managementSystem the management system of this acc cer body applicant info
	 */
	@Override
	public void setManagementSystem(String managementSystem) {
		model.setManagementSystem(managementSystem);
	}

	/**
	 * Sets the modified date of this acc cer body applicant info.
	 *
	 * @param modifiedDate the modified date of this acc cer body applicant info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the personnel contact email of this acc cer body applicant info.
	 *
	 * @param personnelContactEmail the personnel contact email of this acc cer body applicant info
	 */
	@Override
	public void setPersonnelContactEmail(String personnelContactEmail) {
		model.setPersonnelContactEmail(personnelContactEmail);
	}

	/**
	 * Sets the personnel contact name of this acc cer body applicant info.
	 *
	 * @param personnelContactName the personnel contact name of this acc cer body applicant info
	 */
	@Override
	public void setPersonnelContactName(String personnelContactName) {
		model.setPersonnelContactName(personnelContactName);
	}

	/**
	 * Sets the personnel email of this acc cer body applicant info.
	 *
	 * @param personnelEmail the personnel email of this acc cer body applicant info
	 */
	@Override
	public void setPersonnelEmail(String personnelEmail) {
		model.setPersonnelEmail(personnelEmail);
	}

	/**
	 * Sets the personnel fm email of this acc cer body applicant info.
	 *
	 * @param personnelFMEmail the personnel fm email of this acc cer body applicant info
	 */
	@Override
	public void setPersonnelFMEmail(String personnelFMEmail) {
		model.setPersonnelFMEmail(personnelFMEmail);
	}

	/**
	 * Sets the personnel fm name of this acc cer body applicant info.
	 *
	 * @param personnelFMName the personnel fm name of this acc cer body applicant info
	 */
	@Override
	public void setPersonnelFMName(String personnelFMName) {
		model.setPersonnelFMName(personnelFMName);
	}

	/**
	 * Sets the personnel name of this acc cer body applicant info.
	 *
	 * @param personnelName the personnel name of this acc cer body applicant info
	 */
	@Override
	public void setPersonnelName(String personnelName) {
		model.setPersonnelName(personnelName);
	}

	/**
	 * Sets the primary key of this acc cer body applicant info.
	 *
	 * @param primaryKey the primary key of this acc cer body applicant info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the specify other of this acc cer body applicant info.
	 *
	 * @param specifyOther the specify other of this acc cer body applicant info
	 */
	@Override
	public void setSpecifyOther(String specifyOther) {
		model.setSpecifyOther(specifyOther);
	}

	/**
	 * Sets the user ID of this acc cer body applicant info.
	 *
	 * @param userId the user ID of this acc cer body applicant info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc cer body applicant info.
	 *
	 * @param userName the user name of this acc cer body applicant info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc cer body applicant info.
	 *
	 * @param userUuid the user uuid of this acc cer body applicant info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc cer body applicant info.
	 *
	 * @param uuid the uuid of this acc cer body applicant info
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccCerBodyApplicantInfoWrapper wrap(
		AccCerBodyApplicantInfo accCerBodyApplicantInfo) {

		return new AccCerBodyApplicantInfoWrapper(accCerBodyApplicantInfo);
	}

}