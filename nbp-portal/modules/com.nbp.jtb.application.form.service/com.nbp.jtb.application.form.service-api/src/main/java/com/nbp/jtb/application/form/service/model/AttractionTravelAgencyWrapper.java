/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionTravelAgency}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgency
 * @generated
 */
public class AttractionTravelAgencyWrapper
	extends BaseModelWrapper<AttractionTravelAgency>
	implements AttractionTravelAgency, ModelWrapper<AttractionTravelAgency> {

	public AttractionTravelAgencyWrapper(
		AttractionTravelAgency attractionTravelAgency) {

		super(attractionTravelAgency);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionTravelAgencyId", getAttractionTravelAgencyId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("agencyAddress", getAgencyAddress());
		attributes.put("agencyTelephone", getAgencyTelephone());
		attributes.put("agencyName", getAgencyName());
		attributes.put("agencyAddressSec", getAgencyAddressSec());
		attributes.put("agencyTelephoneNum", getAgencyTelephoneNum());
		attributes.put("isRegistered", getIsRegistered());
		attributes.put("regstParticulars", getRegstParticulars());
		attributes.put("proprietorName", getProprietorName());
		attributes.put("managerName", getManagerName());
		attributes.put("managerAddress", getManagerAddress());
		attributes.put("secretaryName", getSecretaryName());
		attributes.put("secretaryAddress", getSecretaryAddress());
		attributes.put("bankerName", getBankerName());
		attributes.put("bondingCompanyName", getBondingCompanyName());
		attributes.put("bondingCompanyAddress", getBondingCompanyAddress());
		attributes.put("auditorsName", getAuditorsName());
		attributes.put("auditorsAddress", getAuditorsAddress());
		attributes.put("numberOfEmployees", getNumberOfEmployees());
		attributes.put("signDate", getSignDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionTravelAgencyId = (Long)attributes.get(
			"attractionTravelAgencyId");

		if (attractionTravelAgencyId != null) {
			setAttractionTravelAgencyId(attractionTravelAgencyId);
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

		String agencyAddress = (String)attributes.get("agencyAddress");

		if (agencyAddress != null) {
			setAgencyAddress(agencyAddress);
		}

		String agencyTelephone = (String)attributes.get("agencyTelephone");

		if (agencyTelephone != null) {
			setAgencyTelephone(agencyTelephone);
		}

		String agencyName = (String)attributes.get("agencyName");

		if (agencyName != null) {
			setAgencyName(agencyName);
		}

		String agencyAddressSec = (String)attributes.get("agencyAddressSec");

		if (agencyAddressSec != null) {
			setAgencyAddressSec(agencyAddressSec);
		}

		String agencyTelephoneNum = (String)attributes.get(
			"agencyTelephoneNum");

		if (agencyTelephoneNum != null) {
			setAgencyTelephoneNum(agencyTelephoneNum);
		}

		String isRegistered = (String)attributes.get("isRegistered");

		if (isRegistered != null) {
			setIsRegistered(isRegistered);
		}

		String regstParticulars = (String)attributes.get("regstParticulars");

		if (regstParticulars != null) {
			setRegstParticulars(regstParticulars);
		}

		String proprietorName = (String)attributes.get("proprietorName");

		if (proprietorName != null) {
			setProprietorName(proprietorName);
		}

		String managerName = (String)attributes.get("managerName");

		if (managerName != null) {
			setManagerName(managerName);
		}

		String managerAddress = (String)attributes.get("managerAddress");

		if (managerAddress != null) {
			setManagerAddress(managerAddress);
		}

		String secretaryName = (String)attributes.get("secretaryName");

		if (secretaryName != null) {
			setSecretaryName(secretaryName);
		}

		String secretaryAddress = (String)attributes.get("secretaryAddress");

		if (secretaryAddress != null) {
			setSecretaryAddress(secretaryAddress);
		}

		String bankerName = (String)attributes.get("bankerName");

		if (bankerName != null) {
			setBankerName(bankerName);
		}

		String bondingCompanyName = (String)attributes.get(
			"bondingCompanyName");

		if (bondingCompanyName != null) {
			setBondingCompanyName(bondingCompanyName);
		}

		String bondingCompanyAddress = (String)attributes.get(
			"bondingCompanyAddress");

		if (bondingCompanyAddress != null) {
			setBondingCompanyAddress(bondingCompanyAddress);
		}

		String auditorsName = (String)attributes.get("auditorsName");

		if (auditorsName != null) {
			setAuditorsName(auditorsName);
		}

		String auditorsAddress = (String)attributes.get("auditorsAddress");

		if (auditorsAddress != null) {
			setAuditorsAddress(auditorsAddress);
		}

		String numberOfEmployees = (String)attributes.get("numberOfEmployees");

		if (numberOfEmployees != null) {
			setNumberOfEmployees(numberOfEmployees);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionTravelAgency cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agency address of this attraction travel agency.
	 *
	 * @return the agency address of this attraction travel agency
	 */
	@Override
	public String getAgencyAddress() {
		return model.getAgencyAddress();
	}

	/**
	 * Returns the agency address sec of this attraction travel agency.
	 *
	 * @return the agency address sec of this attraction travel agency
	 */
	@Override
	public String getAgencyAddressSec() {
		return model.getAgencyAddressSec();
	}

	/**
	 * Returns the agency name of this attraction travel agency.
	 *
	 * @return the agency name of this attraction travel agency
	 */
	@Override
	public String getAgencyName() {
		return model.getAgencyName();
	}

	/**
	 * Returns the agency telephone of this attraction travel agency.
	 *
	 * @return the agency telephone of this attraction travel agency
	 */
	@Override
	public String getAgencyTelephone() {
		return model.getAgencyTelephone();
	}

	/**
	 * Returns the agency telephone num of this attraction travel agency.
	 *
	 * @return the agency telephone num of this attraction travel agency
	 */
	@Override
	public String getAgencyTelephoneNum() {
		return model.getAgencyTelephoneNum();
	}

	/**
	 * Returns the applicant name of this attraction travel agency.
	 *
	 * @return the applicant name of this attraction travel agency
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the attraction travel agency ID of this attraction travel agency.
	 *
	 * @return the attraction travel agency ID of this attraction travel agency
	 */
	@Override
	public long getAttractionTravelAgencyId() {
		return model.getAttractionTravelAgencyId();
	}

	/**
	 * Returns the auditors address of this attraction travel agency.
	 *
	 * @return the auditors address of this attraction travel agency
	 */
	@Override
	public String getAuditorsAddress() {
		return model.getAuditorsAddress();
	}

	/**
	 * Returns the auditors name of this attraction travel agency.
	 *
	 * @return the auditors name of this attraction travel agency
	 */
	@Override
	public String getAuditorsName() {
		return model.getAuditorsName();
	}

	/**
	 * Returns the banker name of this attraction travel agency.
	 *
	 * @return the banker name of this attraction travel agency
	 */
	@Override
	public String getBankerName() {
		return model.getBankerName();
	}

	/**
	 * Returns the bonding company address of this attraction travel agency.
	 *
	 * @return the bonding company address of this attraction travel agency
	 */
	@Override
	public String getBondingCompanyAddress() {
		return model.getBondingCompanyAddress();
	}

	/**
	 * Returns the bonding company name of this attraction travel agency.
	 *
	 * @return the bonding company name of this attraction travel agency
	 */
	@Override
	public String getBondingCompanyName() {
		return model.getBondingCompanyName();
	}

	/**
	 * Returns the company ID of this attraction travel agency.
	 *
	 * @return the company ID of this attraction travel agency
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction travel agency.
	 *
	 * @return the create date of this attraction travel agency
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this attraction travel agency.
	 *
	 * @return the group ID of this attraction travel agency
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the is registered of this attraction travel agency.
	 *
	 * @return the is registered of this attraction travel agency
	 */
	@Override
	public String getIsRegistered() {
		return model.getIsRegistered();
	}

	/**
	 * Returns the jtb application ID of this attraction travel agency.
	 *
	 * @return the jtb application ID of this attraction travel agency
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the manager address of this attraction travel agency.
	 *
	 * @return the manager address of this attraction travel agency
	 */
	@Override
	public String getManagerAddress() {
		return model.getManagerAddress();
	}

	/**
	 * Returns the manager name of this attraction travel agency.
	 *
	 * @return the manager name of this attraction travel agency
	 */
	@Override
	public String getManagerName() {
		return model.getManagerName();
	}

	/**
	 * Returns the modified date of this attraction travel agency.
	 *
	 * @return the modified date of this attraction travel agency
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of employees of this attraction travel agency.
	 *
	 * @return the number of employees of this attraction travel agency
	 */
	@Override
	public String getNumberOfEmployees() {
		return model.getNumberOfEmployees();
	}

	/**
	 * Returns the primary key of this attraction travel agency.
	 *
	 * @return the primary key of this attraction travel agency
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proprietor name of this attraction travel agency.
	 *
	 * @return the proprietor name of this attraction travel agency
	 */
	@Override
	public String getProprietorName() {
		return model.getProprietorName();
	}

	/**
	 * Returns the regst particulars of this attraction travel agency.
	 *
	 * @return the regst particulars of this attraction travel agency
	 */
	@Override
	public String getRegstParticulars() {
		return model.getRegstParticulars();
	}

	/**
	 * Returns the secretary address of this attraction travel agency.
	 *
	 * @return the secretary address of this attraction travel agency
	 */
	@Override
	public String getSecretaryAddress() {
		return model.getSecretaryAddress();
	}

	/**
	 * Returns the secretary name of this attraction travel agency.
	 *
	 * @return the secretary name of this attraction travel agency
	 */
	@Override
	public String getSecretaryName() {
		return model.getSecretaryName();
	}

	/**
	 * Returns the sign date of this attraction travel agency.
	 *
	 * @return the sign date of this attraction travel agency
	 */
	@Override
	public Date getSignDate() {
		return model.getSignDate();
	}

	/**
	 * Returns the user ID of this attraction travel agency.
	 *
	 * @return the user ID of this attraction travel agency
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction travel agency.
	 *
	 * @return the user name of this attraction travel agency
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction travel agency.
	 *
	 * @return the user uuid of this attraction travel agency
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
	 * Sets the agency address of this attraction travel agency.
	 *
	 * @param agencyAddress the agency address of this attraction travel agency
	 */
	@Override
	public void setAgencyAddress(String agencyAddress) {
		model.setAgencyAddress(agencyAddress);
	}

	/**
	 * Sets the agency address sec of this attraction travel agency.
	 *
	 * @param agencyAddressSec the agency address sec of this attraction travel agency
	 */
	@Override
	public void setAgencyAddressSec(String agencyAddressSec) {
		model.setAgencyAddressSec(agencyAddressSec);
	}

	/**
	 * Sets the agency name of this attraction travel agency.
	 *
	 * @param agencyName the agency name of this attraction travel agency
	 */
	@Override
	public void setAgencyName(String agencyName) {
		model.setAgencyName(agencyName);
	}

	/**
	 * Sets the agency telephone of this attraction travel agency.
	 *
	 * @param agencyTelephone the agency telephone of this attraction travel agency
	 */
	@Override
	public void setAgencyTelephone(String agencyTelephone) {
		model.setAgencyTelephone(agencyTelephone);
	}

	/**
	 * Sets the agency telephone num of this attraction travel agency.
	 *
	 * @param agencyTelephoneNum the agency telephone num of this attraction travel agency
	 */
	@Override
	public void setAgencyTelephoneNum(String agencyTelephoneNum) {
		model.setAgencyTelephoneNum(agencyTelephoneNum);
	}

	/**
	 * Sets the applicant name of this attraction travel agency.
	 *
	 * @param applicantName the applicant name of this attraction travel agency
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the attraction travel agency ID of this attraction travel agency.
	 *
	 * @param attractionTravelAgencyId the attraction travel agency ID of this attraction travel agency
	 */
	@Override
	public void setAttractionTravelAgencyId(long attractionTravelAgencyId) {
		model.setAttractionTravelAgencyId(attractionTravelAgencyId);
	}

	/**
	 * Sets the auditors address of this attraction travel agency.
	 *
	 * @param auditorsAddress the auditors address of this attraction travel agency
	 */
	@Override
	public void setAuditorsAddress(String auditorsAddress) {
		model.setAuditorsAddress(auditorsAddress);
	}

	/**
	 * Sets the auditors name of this attraction travel agency.
	 *
	 * @param auditorsName the auditors name of this attraction travel agency
	 */
	@Override
	public void setAuditorsName(String auditorsName) {
		model.setAuditorsName(auditorsName);
	}

	/**
	 * Sets the banker name of this attraction travel agency.
	 *
	 * @param bankerName the banker name of this attraction travel agency
	 */
	@Override
	public void setBankerName(String bankerName) {
		model.setBankerName(bankerName);
	}

	/**
	 * Sets the bonding company address of this attraction travel agency.
	 *
	 * @param bondingCompanyAddress the bonding company address of this attraction travel agency
	 */
	@Override
	public void setBondingCompanyAddress(String bondingCompanyAddress) {
		model.setBondingCompanyAddress(bondingCompanyAddress);
	}

	/**
	 * Sets the bonding company name of this attraction travel agency.
	 *
	 * @param bondingCompanyName the bonding company name of this attraction travel agency
	 */
	@Override
	public void setBondingCompanyName(String bondingCompanyName) {
		model.setBondingCompanyName(bondingCompanyName);
	}

	/**
	 * Sets the company ID of this attraction travel agency.
	 *
	 * @param companyId the company ID of this attraction travel agency
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction travel agency.
	 *
	 * @param createDate the create date of this attraction travel agency
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this attraction travel agency.
	 *
	 * @param groupId the group ID of this attraction travel agency
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the is registered of this attraction travel agency.
	 *
	 * @param isRegistered the is registered of this attraction travel agency
	 */
	@Override
	public void setIsRegistered(String isRegistered) {
		model.setIsRegistered(isRegistered);
	}

	/**
	 * Sets the jtb application ID of this attraction travel agency.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction travel agency
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the manager address of this attraction travel agency.
	 *
	 * @param managerAddress the manager address of this attraction travel agency
	 */
	@Override
	public void setManagerAddress(String managerAddress) {
		model.setManagerAddress(managerAddress);
	}

	/**
	 * Sets the manager name of this attraction travel agency.
	 *
	 * @param managerName the manager name of this attraction travel agency
	 */
	@Override
	public void setManagerName(String managerName) {
		model.setManagerName(managerName);
	}

	/**
	 * Sets the modified date of this attraction travel agency.
	 *
	 * @param modifiedDate the modified date of this attraction travel agency
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of employees of this attraction travel agency.
	 *
	 * @param numberOfEmployees the number of employees of this attraction travel agency
	 */
	@Override
	public void setNumberOfEmployees(String numberOfEmployees) {
		model.setNumberOfEmployees(numberOfEmployees);
	}

	/**
	 * Sets the primary key of this attraction travel agency.
	 *
	 * @param primaryKey the primary key of this attraction travel agency
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proprietor name of this attraction travel agency.
	 *
	 * @param proprietorName the proprietor name of this attraction travel agency
	 */
	@Override
	public void setProprietorName(String proprietorName) {
		model.setProprietorName(proprietorName);
	}

	/**
	 * Sets the regst particulars of this attraction travel agency.
	 *
	 * @param regstParticulars the regst particulars of this attraction travel agency
	 */
	@Override
	public void setRegstParticulars(String regstParticulars) {
		model.setRegstParticulars(regstParticulars);
	}

	/**
	 * Sets the secretary address of this attraction travel agency.
	 *
	 * @param secretaryAddress the secretary address of this attraction travel agency
	 */
	@Override
	public void setSecretaryAddress(String secretaryAddress) {
		model.setSecretaryAddress(secretaryAddress);
	}

	/**
	 * Sets the secretary name of this attraction travel agency.
	 *
	 * @param secretaryName the secretary name of this attraction travel agency
	 */
	@Override
	public void setSecretaryName(String secretaryName) {
		model.setSecretaryName(secretaryName);
	}

	/**
	 * Sets the sign date of this attraction travel agency.
	 *
	 * @param signDate the sign date of this attraction travel agency
	 */
	@Override
	public void setSignDate(Date signDate) {
		model.setSignDate(signDate);
	}

	/**
	 * Sets the user ID of this attraction travel agency.
	 *
	 * @param userId the user ID of this attraction travel agency
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction travel agency.
	 *
	 * @param userName the user name of this attraction travel agency
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction travel agency.
	 *
	 * @param userUuid the user uuid of this attraction travel agency
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
	protected AttractionTravelAgencyWrapper wrap(
		AttractionTravelAgency attractionTravelAgency) {

		return new AttractionTravelAgencyWrapper(attractionTravelAgency);
	}

}