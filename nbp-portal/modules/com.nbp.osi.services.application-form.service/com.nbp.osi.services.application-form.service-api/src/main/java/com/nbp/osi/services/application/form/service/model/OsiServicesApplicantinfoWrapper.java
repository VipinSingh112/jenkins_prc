/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiServicesApplicantinfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicantinfo
 * @generated
 */
public class OsiServicesApplicantinfoWrapper
	extends BaseModelWrapper<OsiServicesApplicantinfo>
	implements ModelWrapper<OsiServicesApplicantinfo>,
			   OsiServicesApplicantinfo {

	public OsiServicesApplicantinfoWrapper(
		OsiServicesApplicantinfo osiServicesApplicantinfo) {

		super(osiServicesApplicantinfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osiServicesApplicanId", getOsiServicesApplicanId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantNature", getApplicantNature());
		attributes.put("indiFirstName", getIndiFirstName());
		attributes.put("indiLastName", getIndiLastName());
		attributes.put("companyName", getCompanyName());
		attributes.put("address", getAddress());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("telephone", getTelephone());
		attributes.put("applicationDate", getApplicationDate());
		attributes.put("trnNumber", getTrnNumber());
		attributes.put(
			"osiServicesApplicationId", getOsiServicesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long osiServicesApplicanId = (Long)attributes.get(
			"osiServicesApplicanId");

		if (osiServicesApplicanId != null) {
			setOsiServicesApplicanId(osiServicesApplicanId);
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

		String applicantNature = (String)attributes.get("applicantNature");

		if (applicantNature != null) {
			setApplicantNature(applicantNature);
		}

		String indiFirstName = (String)attributes.get("indiFirstName");

		if (indiFirstName != null) {
			setIndiFirstName(indiFirstName);
		}

		String indiLastName = (String)attributes.get("indiLastName");

		if (indiLastName != null) {
			setIndiLastName(indiLastName);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		Date applicationDate = (Date)attributes.get("applicationDate");

		if (applicationDate != null) {
			setApplicationDate(applicationDate);
		}

		String trnNumber = (String)attributes.get("trnNumber");

		if (trnNumber != null) {
			setTrnNumber(trnNumber);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesApplicantinfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this osi services applicantinfo.
	 *
	 * @return the address of this osi services applicantinfo
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the applicant nature of this osi services applicantinfo.
	 *
	 * @return the applicant nature of this osi services applicantinfo
	 */
	@Override
	public String getApplicantNature() {
		return model.getApplicantNature();
	}

	/**
	 * Returns the application date of this osi services applicantinfo.
	 *
	 * @return the application date of this osi services applicantinfo
	 */
	@Override
	public Date getApplicationDate() {
		return model.getApplicationDate();
	}

	/**
	 * Returns the company ID of this osi services applicantinfo.
	 *
	 * @return the company ID of this osi services applicantinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this osi services applicantinfo.
	 *
	 * @return the company name of this osi services applicantinfo
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the create date of this osi services applicantinfo.
	 *
	 * @return the create date of this osi services applicantinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this osi services applicantinfo.
	 *
	 * @return the email address of this osi services applicantinfo
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the group ID of this osi services applicantinfo.
	 *
	 * @return the group ID of this osi services applicantinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indi first name of this osi services applicantinfo.
	 *
	 * @return the indi first name of this osi services applicantinfo
	 */
	@Override
	public String getIndiFirstName() {
		return model.getIndiFirstName();
	}

	/**
	 * Returns the indi last name of this osi services applicantinfo.
	 *
	 * @return the indi last name of this osi services applicantinfo
	 */
	@Override
	public String getIndiLastName() {
		return model.getIndiLastName();
	}

	/**
	 * Returns the modified date of this osi services applicantinfo.
	 *
	 * @return the modified date of this osi services applicantinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi services applican ID of this osi services applicantinfo.
	 *
	 * @return the osi services applican ID of this osi services applicantinfo
	 */
	@Override
	public long getOsiServicesApplicanId() {
		return model.getOsiServicesApplicanId();
	}

	/**
	 * Returns the osi services application ID of this osi services applicantinfo.
	 *
	 * @return the osi services application ID of this osi services applicantinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the primary key of this osi services applicantinfo.
	 *
	 * @return the primary key of this osi services applicantinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone of this osi services applicantinfo.
	 *
	 * @return the telephone of this osi services applicantinfo
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the trn number of this osi services applicantinfo.
	 *
	 * @return the trn number of this osi services applicantinfo
	 */
	@Override
	public String getTrnNumber() {
		return model.getTrnNumber();
	}

	/**
	 * Returns the user ID of this osi services applicantinfo.
	 *
	 * @return the user ID of this osi services applicantinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services applicantinfo.
	 *
	 * @return the user name of this osi services applicantinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services applicantinfo.
	 *
	 * @return the user uuid of this osi services applicantinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services applicantinfo.
	 *
	 * @return the uuid of this osi services applicantinfo
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
	 * Sets the address of this osi services applicantinfo.
	 *
	 * @param address the address of this osi services applicantinfo
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the applicant nature of this osi services applicantinfo.
	 *
	 * @param applicantNature the applicant nature of this osi services applicantinfo
	 */
	@Override
	public void setApplicantNature(String applicantNature) {
		model.setApplicantNature(applicantNature);
	}

	/**
	 * Sets the application date of this osi services applicantinfo.
	 *
	 * @param applicationDate the application date of this osi services applicantinfo
	 */
	@Override
	public void setApplicationDate(Date applicationDate) {
		model.setApplicationDate(applicationDate);
	}

	/**
	 * Sets the company ID of this osi services applicantinfo.
	 *
	 * @param companyId the company ID of this osi services applicantinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this osi services applicantinfo.
	 *
	 * @param companyName the company name of this osi services applicantinfo
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the create date of this osi services applicantinfo.
	 *
	 * @param createDate the create date of this osi services applicantinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this osi services applicantinfo.
	 *
	 * @param emailAddress the email address of this osi services applicantinfo
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the group ID of this osi services applicantinfo.
	 *
	 * @param groupId the group ID of this osi services applicantinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indi first name of this osi services applicantinfo.
	 *
	 * @param indiFirstName the indi first name of this osi services applicantinfo
	 */
	@Override
	public void setIndiFirstName(String indiFirstName) {
		model.setIndiFirstName(indiFirstName);
	}

	/**
	 * Sets the indi last name of this osi services applicantinfo.
	 *
	 * @param indiLastName the indi last name of this osi services applicantinfo
	 */
	@Override
	public void setIndiLastName(String indiLastName) {
		model.setIndiLastName(indiLastName);
	}

	/**
	 * Sets the modified date of this osi services applicantinfo.
	 *
	 * @param modifiedDate the modified date of this osi services applicantinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi services applican ID of this osi services applicantinfo.
	 *
	 * @param osiServicesApplicanId the osi services applican ID of this osi services applicantinfo
	 */
	@Override
	public void setOsiServicesApplicanId(long osiServicesApplicanId) {
		model.setOsiServicesApplicanId(osiServicesApplicanId);
	}

	/**
	 * Sets the osi services application ID of this osi services applicantinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services applicantinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the primary key of this osi services applicantinfo.
	 *
	 * @param primaryKey the primary key of this osi services applicantinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone of this osi services applicantinfo.
	 *
	 * @param telephone the telephone of this osi services applicantinfo
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the trn number of this osi services applicantinfo.
	 *
	 * @param trnNumber the trn number of this osi services applicantinfo
	 */
	@Override
	public void setTrnNumber(String trnNumber) {
		model.setTrnNumber(trnNumber);
	}

	/**
	 * Sets the user ID of this osi services applicantinfo.
	 *
	 * @param userId the user ID of this osi services applicantinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services applicantinfo.
	 *
	 * @param userName the user name of this osi services applicantinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services applicantinfo.
	 *
	 * @param userUuid the user uuid of this osi services applicantinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services applicantinfo.
	 *
	 * @param uuid the uuid of this osi services applicantinfo
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
	protected OsiServicesApplicantinfoWrapper wrap(
		OsiServicesApplicantinfo osiServicesApplicantinfo) {

		return new OsiServicesApplicantinfoWrapper(osiServicesApplicantinfo);
	}

}