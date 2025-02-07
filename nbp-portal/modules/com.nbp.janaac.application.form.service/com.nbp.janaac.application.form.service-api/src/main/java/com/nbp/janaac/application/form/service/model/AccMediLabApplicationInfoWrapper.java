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
 * This class is a wrapper for {@link AccMediLabApplicationInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabApplicationInfo
 * @generated
 */
public class AccMediLabApplicationInfoWrapper
	extends BaseModelWrapper<AccMediLabApplicationInfo>
	implements AccMediLabApplicationInfo,
			   ModelWrapper<AccMediLabApplicationInfo> {

	public AccMediLabApplicationInfoWrapper(
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		super(accMediLabApplicationInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"accMediLabApplicationInfoId", getAccMediLabApplicationInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("appliTelephoneNo", getAppliTelephoneNo());
		attributes.put("appliFaxNo", getAppliFaxNo());
		attributes.put("appliWebsite", getAppliWebsite());
		attributes.put("laboratoryName", getLaboratoryName());
		attributes.put("laboratoryAddress", getLaboratoryAddress());
		attributes.put("nameOfIncharge", getNameOfIncharge());
		attributes.put("emailOfIncharge", getEmailOfIncharge());
		attributes.put("personnelQMName", getPersonnelQMName());
		attributes.put("personnelQMEmail", getPersonnelQMEmail());
		attributes.put("deputyInchargeName", getDeputyInchargeName());
		attributes.put("deputyInchargeEmail", getDeputyInchargeEmail());
		attributes.put("personnelFMName", getPersonnelFMName());
		attributes.put("personnelFMEmail", getPersonnelFMEmail());
		attributes.put("accRequestType", getAccRequestType());
		attributes.put("authorizedPersonnelName", getAuthorizedPersonnelName());
		attributes.put("authorizedPosition", getAuthorizedPosition());
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

		Long accMediLabApplicationInfoId = (Long)attributes.get(
			"accMediLabApplicationInfoId");

		if (accMediLabApplicationInfoId != null) {
			setAccMediLabApplicationInfoId(accMediLabApplicationInfoId);
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

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String appliTelephoneNo = (String)attributes.get("appliTelephoneNo");

		if (appliTelephoneNo != null) {
			setAppliTelephoneNo(appliTelephoneNo);
		}

		String appliFaxNo = (String)attributes.get("appliFaxNo");

		if (appliFaxNo != null) {
			setAppliFaxNo(appliFaxNo);
		}

		String appliWebsite = (String)attributes.get("appliWebsite");

		if (appliWebsite != null) {
			setAppliWebsite(appliWebsite);
		}

		String laboratoryName = (String)attributes.get("laboratoryName");

		if (laboratoryName != null) {
			setLaboratoryName(laboratoryName);
		}

		String laboratoryAddress = (String)attributes.get("laboratoryAddress");

		if (laboratoryAddress != null) {
			setLaboratoryAddress(laboratoryAddress);
		}

		String nameOfIncharge = (String)attributes.get("nameOfIncharge");

		if (nameOfIncharge != null) {
			setNameOfIncharge(nameOfIncharge);
		}

		String emailOfIncharge = (String)attributes.get("emailOfIncharge");

		if (emailOfIncharge != null) {
			setEmailOfIncharge(emailOfIncharge);
		}

		String personnelQMName = (String)attributes.get("personnelQMName");

		if (personnelQMName != null) {
			setPersonnelQMName(personnelQMName);
		}

		String personnelQMEmail = (String)attributes.get("personnelQMEmail");

		if (personnelQMEmail != null) {
			setPersonnelQMEmail(personnelQMEmail);
		}

		String deputyInchargeName = (String)attributes.get(
			"deputyInchargeName");

		if (deputyInchargeName != null) {
			setDeputyInchargeName(deputyInchargeName);
		}

		String deputyInchargeEmail = (String)attributes.get(
			"deputyInchargeEmail");

		if (deputyInchargeEmail != null) {
			setDeputyInchargeEmail(deputyInchargeEmail);
		}

		String personnelFMName = (String)attributes.get("personnelFMName");

		if (personnelFMName != null) {
			setPersonnelFMName(personnelFMName);
		}

		String personnelFMEmail = (String)attributes.get("personnelFMEmail");

		if (personnelFMEmail != null) {
			setPersonnelFMEmail(personnelFMEmail);
		}

		String accRequestType = (String)attributes.get("accRequestType");

		if (accRequestType != null) {
			setAccRequestType(accRequestType);
		}

		String authorizedPersonnelName = (String)attributes.get(
			"authorizedPersonnelName");

		if (authorizedPersonnelName != null) {
			setAuthorizedPersonnelName(authorizedPersonnelName);
		}

		String authorizedPosition = (String)attributes.get(
			"authorizedPosition");

		if (authorizedPosition != null) {
			setAuthorizedPosition(authorizedPosition);
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
	public AccMediLabApplicationInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc medi lab application info ID of this acc medi lab application info.
	 *
	 * @return the acc medi lab application info ID of this acc medi lab application info
	 */
	@Override
	public long getAccMediLabApplicationInfoId() {
		return model.getAccMediLabApplicationInfoId();
	}

	/**
	 * Returns the acc request type of this acc medi lab application info.
	 *
	 * @return the acc request type of this acc medi lab application info
	 */
	@Override
	public String getAccRequestType() {
		return model.getAccRequestType();
	}

	/**
	 * Returns the applicant address of this acc medi lab application info.
	 *
	 * @return the applicant address of this acc medi lab application info
	 */
	@Override
	public String getApplicantAddress() {
		return model.getApplicantAddress();
	}

	/**
	 * Returns the appli fax no of this acc medi lab application info.
	 *
	 * @return the appli fax no of this acc medi lab application info
	 */
	@Override
	public String getAppliFaxNo() {
		return model.getAppliFaxNo();
	}

	/**
	 * Returns the appli telephone no of this acc medi lab application info.
	 *
	 * @return the appli telephone no of this acc medi lab application info
	 */
	@Override
	public String getAppliTelephoneNo() {
		return model.getAppliTelephoneNo();
	}

	/**
	 * Returns the appli website of this acc medi lab application info.
	 *
	 * @return the appli website of this acc medi lab application info
	 */
	@Override
	public String getAppliWebsite() {
		return model.getAppliWebsite();
	}

	/**
	 * Returns the authorized personnel date of this acc medi lab application info.
	 *
	 * @return the authorized personnel date of this acc medi lab application info
	 */
	@Override
	public Date getAuthorizedPersonnelDate() {
		return model.getAuthorizedPersonnelDate();
	}

	/**
	 * Returns the authorized personnel name of this acc medi lab application info.
	 *
	 * @return the authorized personnel name of this acc medi lab application info
	 */
	@Override
	public String getAuthorizedPersonnelName() {
		return model.getAuthorizedPersonnelName();
	}

	/**
	 * Returns the authorized position of this acc medi lab application info.
	 *
	 * @return the authorized position of this acc medi lab application info
	 */
	@Override
	public String getAuthorizedPosition() {
		return model.getAuthorizedPosition();
	}

	/**
	 * Returns the company ID of this acc medi lab application info.
	 *
	 * @return the company ID of this acc medi lab application info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc medi lab application info.
	 *
	 * @return the create date of this acc medi lab application info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the deputy incharge email of this acc medi lab application info.
	 *
	 * @return the deputy incharge email of this acc medi lab application info
	 */
	@Override
	public String getDeputyInchargeEmail() {
		return model.getDeputyInchargeEmail();
	}

	/**
	 * Returns the deputy incharge name of this acc medi lab application info.
	 *
	 * @return the deputy incharge name of this acc medi lab application info
	 */
	@Override
	public String getDeputyInchargeName() {
		return model.getDeputyInchargeName();
	}

	/**
	 * Returns the email of incharge of this acc medi lab application info.
	 *
	 * @return the email of incharge of this acc medi lab application info
	 */
	@Override
	public String getEmailOfIncharge() {
		return model.getEmailOfIncharge();
	}

	/**
	 * Returns the group ID of this acc medi lab application info.
	 *
	 * @return the group ID of this acc medi lab application info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc medi lab application info.
	 *
	 * @return the janaac application ID of this acc medi lab application info
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the laboratory address of this acc medi lab application info.
	 *
	 * @return the laboratory address of this acc medi lab application info
	 */
	@Override
	public String getLaboratoryAddress() {
		return model.getLaboratoryAddress();
	}

	/**
	 * Returns the laboratory name of this acc medi lab application info.
	 *
	 * @return the laboratory name of this acc medi lab application info
	 */
	@Override
	public String getLaboratoryName() {
		return model.getLaboratoryName();
	}

	/**
	 * Returns the modified date of this acc medi lab application info.
	 *
	 * @return the modified date of this acc medi lab application info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this acc medi lab application info.
	 *
	 * @return the name of applicant of this acc medi lab application info
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the name of incharge of this acc medi lab application info.
	 *
	 * @return the name of incharge of this acc medi lab application info
	 */
	@Override
	public String getNameOfIncharge() {
		return model.getNameOfIncharge();
	}

	/**
	 * Returns the personnel fm email of this acc medi lab application info.
	 *
	 * @return the personnel fm email of this acc medi lab application info
	 */
	@Override
	public String getPersonnelFMEmail() {
		return model.getPersonnelFMEmail();
	}

	/**
	 * Returns the personnel fm name of this acc medi lab application info.
	 *
	 * @return the personnel fm name of this acc medi lab application info
	 */
	@Override
	public String getPersonnelFMName() {
		return model.getPersonnelFMName();
	}

	/**
	 * Returns the personnel qm email of this acc medi lab application info.
	 *
	 * @return the personnel qm email of this acc medi lab application info
	 */
	@Override
	public String getPersonnelQMEmail() {
		return model.getPersonnelQMEmail();
	}

	/**
	 * Returns the personnel qm name of this acc medi lab application info.
	 *
	 * @return the personnel qm name of this acc medi lab application info
	 */
	@Override
	public String getPersonnelQMName() {
		return model.getPersonnelQMName();
	}

	/**
	 * Returns the primary key of this acc medi lab application info.
	 *
	 * @return the primary key of this acc medi lab application info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acc medi lab application info.
	 *
	 * @return the user ID of this acc medi lab application info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc medi lab application info.
	 *
	 * @return the user name of this acc medi lab application info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc medi lab application info.
	 *
	 * @return the user uuid of this acc medi lab application info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc medi lab application info.
	 *
	 * @return the uuid of this acc medi lab application info
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
	 * Sets the acc medi lab application info ID of this acc medi lab application info.
	 *
	 * @param accMediLabApplicationInfoId the acc medi lab application info ID of this acc medi lab application info
	 */
	@Override
	public void setAccMediLabApplicationInfoId(
		long accMediLabApplicationInfoId) {

		model.setAccMediLabApplicationInfoId(accMediLabApplicationInfoId);
	}

	/**
	 * Sets the acc request type of this acc medi lab application info.
	 *
	 * @param accRequestType the acc request type of this acc medi lab application info
	 */
	@Override
	public void setAccRequestType(String accRequestType) {
		model.setAccRequestType(accRequestType);
	}

	/**
	 * Sets the applicant address of this acc medi lab application info.
	 *
	 * @param applicantAddress the applicant address of this acc medi lab application info
	 */
	@Override
	public void setApplicantAddress(String applicantAddress) {
		model.setApplicantAddress(applicantAddress);
	}

	/**
	 * Sets the appli fax no of this acc medi lab application info.
	 *
	 * @param appliFaxNo the appli fax no of this acc medi lab application info
	 */
	@Override
	public void setAppliFaxNo(String appliFaxNo) {
		model.setAppliFaxNo(appliFaxNo);
	}

	/**
	 * Sets the appli telephone no of this acc medi lab application info.
	 *
	 * @param appliTelephoneNo the appli telephone no of this acc medi lab application info
	 */
	@Override
	public void setAppliTelephoneNo(String appliTelephoneNo) {
		model.setAppliTelephoneNo(appliTelephoneNo);
	}

	/**
	 * Sets the appli website of this acc medi lab application info.
	 *
	 * @param appliWebsite the appli website of this acc medi lab application info
	 */
	@Override
	public void setAppliWebsite(String appliWebsite) {
		model.setAppliWebsite(appliWebsite);
	}

	/**
	 * Sets the authorized personnel date of this acc medi lab application info.
	 *
	 * @param authorizedPersonnelDate the authorized personnel date of this acc medi lab application info
	 */
	@Override
	public void setAuthorizedPersonnelDate(Date authorizedPersonnelDate) {
		model.setAuthorizedPersonnelDate(authorizedPersonnelDate);
	}

	/**
	 * Sets the authorized personnel name of this acc medi lab application info.
	 *
	 * @param authorizedPersonnelName the authorized personnel name of this acc medi lab application info
	 */
	@Override
	public void setAuthorizedPersonnelName(String authorizedPersonnelName) {
		model.setAuthorizedPersonnelName(authorizedPersonnelName);
	}

	/**
	 * Sets the authorized position of this acc medi lab application info.
	 *
	 * @param authorizedPosition the authorized position of this acc medi lab application info
	 */
	@Override
	public void setAuthorizedPosition(String authorizedPosition) {
		model.setAuthorizedPosition(authorizedPosition);
	}

	/**
	 * Sets the company ID of this acc medi lab application info.
	 *
	 * @param companyId the company ID of this acc medi lab application info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc medi lab application info.
	 *
	 * @param createDate the create date of this acc medi lab application info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the deputy incharge email of this acc medi lab application info.
	 *
	 * @param deputyInchargeEmail the deputy incharge email of this acc medi lab application info
	 */
	@Override
	public void setDeputyInchargeEmail(String deputyInchargeEmail) {
		model.setDeputyInchargeEmail(deputyInchargeEmail);
	}

	/**
	 * Sets the deputy incharge name of this acc medi lab application info.
	 *
	 * @param deputyInchargeName the deputy incharge name of this acc medi lab application info
	 */
	@Override
	public void setDeputyInchargeName(String deputyInchargeName) {
		model.setDeputyInchargeName(deputyInchargeName);
	}

	/**
	 * Sets the email of incharge of this acc medi lab application info.
	 *
	 * @param emailOfIncharge the email of incharge of this acc medi lab application info
	 */
	@Override
	public void setEmailOfIncharge(String emailOfIncharge) {
		model.setEmailOfIncharge(emailOfIncharge);
	}

	/**
	 * Sets the group ID of this acc medi lab application info.
	 *
	 * @param groupId the group ID of this acc medi lab application info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc medi lab application info.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab application info
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the laboratory address of this acc medi lab application info.
	 *
	 * @param laboratoryAddress the laboratory address of this acc medi lab application info
	 */
	@Override
	public void setLaboratoryAddress(String laboratoryAddress) {
		model.setLaboratoryAddress(laboratoryAddress);
	}

	/**
	 * Sets the laboratory name of this acc medi lab application info.
	 *
	 * @param laboratoryName the laboratory name of this acc medi lab application info
	 */
	@Override
	public void setLaboratoryName(String laboratoryName) {
		model.setLaboratoryName(laboratoryName);
	}

	/**
	 * Sets the modified date of this acc medi lab application info.
	 *
	 * @param modifiedDate the modified date of this acc medi lab application info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this acc medi lab application info.
	 *
	 * @param nameOfApplicant the name of applicant of this acc medi lab application info
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the name of incharge of this acc medi lab application info.
	 *
	 * @param nameOfIncharge the name of incharge of this acc medi lab application info
	 */
	@Override
	public void setNameOfIncharge(String nameOfIncharge) {
		model.setNameOfIncharge(nameOfIncharge);
	}

	/**
	 * Sets the personnel fm email of this acc medi lab application info.
	 *
	 * @param personnelFMEmail the personnel fm email of this acc medi lab application info
	 */
	@Override
	public void setPersonnelFMEmail(String personnelFMEmail) {
		model.setPersonnelFMEmail(personnelFMEmail);
	}

	/**
	 * Sets the personnel fm name of this acc medi lab application info.
	 *
	 * @param personnelFMName the personnel fm name of this acc medi lab application info
	 */
	@Override
	public void setPersonnelFMName(String personnelFMName) {
		model.setPersonnelFMName(personnelFMName);
	}

	/**
	 * Sets the personnel qm email of this acc medi lab application info.
	 *
	 * @param personnelQMEmail the personnel qm email of this acc medi lab application info
	 */
	@Override
	public void setPersonnelQMEmail(String personnelQMEmail) {
		model.setPersonnelQMEmail(personnelQMEmail);
	}

	/**
	 * Sets the personnel qm name of this acc medi lab application info.
	 *
	 * @param personnelQMName the personnel qm name of this acc medi lab application info
	 */
	@Override
	public void setPersonnelQMName(String personnelQMName) {
		model.setPersonnelQMName(personnelQMName);
	}

	/**
	 * Sets the primary key of this acc medi lab application info.
	 *
	 * @param primaryKey the primary key of this acc medi lab application info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acc medi lab application info.
	 *
	 * @param userId the user ID of this acc medi lab application info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc medi lab application info.
	 *
	 * @param userName the user name of this acc medi lab application info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc medi lab application info.
	 *
	 * @param userUuid the user uuid of this acc medi lab application info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc medi lab application info.
	 *
	 * @param uuid the uuid of this acc medi lab application info
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
	protected AccMediLabApplicationInfoWrapper wrap(
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return new AccMediLabApplicationInfoWrapper(accMediLabApplicationInfo);
	}

}