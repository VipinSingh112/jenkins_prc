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
 * This class is a wrapper for {@link AttractionCarRentalLicence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentalLicence
 * @generated
 */
public class AttractionCarRentalLicenceWrapper
	extends BaseModelWrapper<AttractionCarRentalLicence>
	implements AttractionCarRentalLicence,
			   ModelWrapper<AttractionCarRentalLicence> {

	public AttractionCarRentalLicenceWrapper(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		super(attractionCarRentalLicence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionCarRentalLicId", getAttractionCarRentalLicId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ncrApplicantName", getNcrApplicantName());
		attributes.put("ncrAddress", getNcrAddress());
		attributes.put("ncrCompanyName", getNcrCompanyName());
		attributes.put("ncrCompanyAddr", getNcrCompanyAddr());
		attributes.put("ncrTelephone", getNcrTelephone());
		attributes.put("ncrEmail", getNcrEmail());
		attributes.put("ncrManagerName", getNcrManagerName());
		attributes.put("ncrDate", getNcrDate());
		attributes.put("ncrVehiclesNo", getNcrVehiclesNo());
		attributes.put("ncrEmployeesNo", getNcrEmployeesNo());
		attributes.put("ncrOfficeLoc", getNcrOfficeLoc());
		attributes.put("ncrPosition", getNcrPosition());
		attributes.put("ncrSignDate", getNcrSignDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionCarRentalLicId = (Long)attributes.get(
			"attractionCarRentalLicId");

		if (attractionCarRentalLicId != null) {
			setAttractionCarRentalLicId(attractionCarRentalLicId);
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

		String ncrApplicantName = (String)attributes.get("ncrApplicantName");

		if (ncrApplicantName != null) {
			setNcrApplicantName(ncrApplicantName);
		}

		String ncrAddress = (String)attributes.get("ncrAddress");

		if (ncrAddress != null) {
			setNcrAddress(ncrAddress);
		}

		String ncrCompanyName = (String)attributes.get("ncrCompanyName");

		if (ncrCompanyName != null) {
			setNcrCompanyName(ncrCompanyName);
		}

		String ncrCompanyAddr = (String)attributes.get("ncrCompanyAddr");

		if (ncrCompanyAddr != null) {
			setNcrCompanyAddr(ncrCompanyAddr);
		}

		String ncrTelephone = (String)attributes.get("ncrTelephone");

		if (ncrTelephone != null) {
			setNcrTelephone(ncrTelephone);
		}

		String ncrEmail = (String)attributes.get("ncrEmail");

		if (ncrEmail != null) {
			setNcrEmail(ncrEmail);
		}

		String ncrManagerName = (String)attributes.get("ncrManagerName");

		if (ncrManagerName != null) {
			setNcrManagerName(ncrManagerName);
		}

		Date ncrDate = (Date)attributes.get("ncrDate");

		if (ncrDate != null) {
			setNcrDate(ncrDate);
		}

		String ncrVehiclesNo = (String)attributes.get("ncrVehiclesNo");

		if (ncrVehiclesNo != null) {
			setNcrVehiclesNo(ncrVehiclesNo);
		}

		String ncrEmployeesNo = (String)attributes.get("ncrEmployeesNo");

		if (ncrEmployeesNo != null) {
			setNcrEmployeesNo(ncrEmployeesNo);
		}

		String ncrOfficeLoc = (String)attributes.get("ncrOfficeLoc");

		if (ncrOfficeLoc != null) {
			setNcrOfficeLoc(ncrOfficeLoc);
		}

		String ncrPosition = (String)attributes.get("ncrPosition");

		if (ncrPosition != null) {
			setNcrPosition(ncrPosition);
		}

		Date ncrSignDate = (Date)attributes.get("ncrSignDate");

		if (ncrSignDate != null) {
			setNcrSignDate(ncrSignDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionCarRentalLicence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction car rental lic ID of this attraction car rental licence.
	 *
	 * @return the attraction car rental lic ID of this attraction car rental licence
	 */
	@Override
	public long getAttractionCarRentalLicId() {
		return model.getAttractionCarRentalLicId();
	}

	/**
	 * Returns the company ID of this attraction car rental licence.
	 *
	 * @return the company ID of this attraction car rental licence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction car rental licence.
	 *
	 * @return the create date of this attraction car rental licence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this attraction car rental licence.
	 *
	 * @return the group ID of this attraction car rental licence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction car rental licence.
	 *
	 * @return the jtb application ID of this attraction car rental licence
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction car rental licence.
	 *
	 * @return the modified date of this attraction car rental licence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncr address of this attraction car rental licence.
	 *
	 * @return the ncr address of this attraction car rental licence
	 */
	@Override
	public String getNcrAddress() {
		return model.getNcrAddress();
	}

	/**
	 * Returns the ncr applicant name of this attraction car rental licence.
	 *
	 * @return the ncr applicant name of this attraction car rental licence
	 */
	@Override
	public String getNcrApplicantName() {
		return model.getNcrApplicantName();
	}

	/**
	 * Returns the ncr company addr of this attraction car rental licence.
	 *
	 * @return the ncr company addr of this attraction car rental licence
	 */
	@Override
	public String getNcrCompanyAddr() {
		return model.getNcrCompanyAddr();
	}

	/**
	 * Returns the ncr company name of this attraction car rental licence.
	 *
	 * @return the ncr company name of this attraction car rental licence
	 */
	@Override
	public String getNcrCompanyName() {
		return model.getNcrCompanyName();
	}

	/**
	 * Returns the ncr date of this attraction car rental licence.
	 *
	 * @return the ncr date of this attraction car rental licence
	 */
	@Override
	public Date getNcrDate() {
		return model.getNcrDate();
	}

	/**
	 * Returns the ncr email of this attraction car rental licence.
	 *
	 * @return the ncr email of this attraction car rental licence
	 */
	@Override
	public String getNcrEmail() {
		return model.getNcrEmail();
	}

	/**
	 * Returns the ncr employees no of this attraction car rental licence.
	 *
	 * @return the ncr employees no of this attraction car rental licence
	 */
	@Override
	public String getNcrEmployeesNo() {
		return model.getNcrEmployeesNo();
	}

	/**
	 * Returns the ncr manager name of this attraction car rental licence.
	 *
	 * @return the ncr manager name of this attraction car rental licence
	 */
	@Override
	public String getNcrManagerName() {
		return model.getNcrManagerName();
	}

	/**
	 * Returns the ncr office loc of this attraction car rental licence.
	 *
	 * @return the ncr office loc of this attraction car rental licence
	 */
	@Override
	public String getNcrOfficeLoc() {
		return model.getNcrOfficeLoc();
	}

	@Override
	public String getNcrOfficeLoc1() {
		return model.getNcrOfficeLoc1();
	}

	/**
	 * Returns the ncr position of this attraction car rental licence.
	 *
	 * @return the ncr position of this attraction car rental licence
	 */
	@Override
	public String getNcrPosition() {
		return model.getNcrPosition();
	}

	/**
	 * Returns the ncr sign date of this attraction car rental licence.
	 *
	 * @return the ncr sign date of this attraction car rental licence
	 */
	@Override
	public Date getNcrSignDate() {
		return model.getNcrSignDate();
	}

	/**
	 * Returns the ncr telephone of this attraction car rental licence.
	 *
	 * @return the ncr telephone of this attraction car rental licence
	 */
	@Override
	public String getNcrTelephone() {
		return model.getNcrTelephone();
	}

	/**
	 * Returns the ncr vehicles no of this attraction car rental licence.
	 *
	 * @return the ncr vehicles no of this attraction car rental licence
	 */
	@Override
	public String getNcrVehiclesNo() {
		return model.getNcrVehiclesNo();
	}

	/**
	 * Returns the primary key of this attraction car rental licence.
	 *
	 * @return the primary key of this attraction car rental licence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this attraction car rental licence.
	 *
	 * @return the user ID of this attraction car rental licence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction car rental licence.
	 *
	 * @return the user name of this attraction car rental licence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction car rental licence.
	 *
	 * @return the user uuid of this attraction car rental licence
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
	 * Sets the attraction car rental lic ID of this attraction car rental licence.
	 *
	 * @param attractionCarRentalLicId the attraction car rental lic ID of this attraction car rental licence
	 */
	@Override
	public void setAttractionCarRentalLicId(long attractionCarRentalLicId) {
		model.setAttractionCarRentalLicId(attractionCarRentalLicId);
	}

	/**
	 * Sets the company ID of this attraction car rental licence.
	 *
	 * @param companyId the company ID of this attraction car rental licence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction car rental licence.
	 *
	 * @param createDate the create date of this attraction car rental licence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this attraction car rental licence.
	 *
	 * @param groupId the group ID of this attraction car rental licence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction car rental licence.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction car rental licence
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction car rental licence.
	 *
	 * @param modifiedDate the modified date of this attraction car rental licence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncr address of this attraction car rental licence.
	 *
	 * @param ncrAddress the ncr address of this attraction car rental licence
	 */
	@Override
	public void setNcrAddress(String ncrAddress) {
		model.setNcrAddress(ncrAddress);
	}

	/**
	 * Sets the ncr applicant name of this attraction car rental licence.
	 *
	 * @param ncrApplicantName the ncr applicant name of this attraction car rental licence
	 */
	@Override
	public void setNcrApplicantName(String ncrApplicantName) {
		model.setNcrApplicantName(ncrApplicantName);
	}

	/**
	 * Sets the ncr company addr of this attraction car rental licence.
	 *
	 * @param ncrCompanyAddr the ncr company addr of this attraction car rental licence
	 */
	@Override
	public void setNcrCompanyAddr(String ncrCompanyAddr) {
		model.setNcrCompanyAddr(ncrCompanyAddr);
	}

	/**
	 * Sets the ncr company name of this attraction car rental licence.
	 *
	 * @param ncrCompanyName the ncr company name of this attraction car rental licence
	 */
	@Override
	public void setNcrCompanyName(String ncrCompanyName) {
		model.setNcrCompanyName(ncrCompanyName);
	}

	/**
	 * Sets the ncr date of this attraction car rental licence.
	 *
	 * @param ncrDate the ncr date of this attraction car rental licence
	 */
	@Override
	public void setNcrDate(Date ncrDate) {
		model.setNcrDate(ncrDate);
	}

	/**
	 * Sets the ncr email of this attraction car rental licence.
	 *
	 * @param ncrEmail the ncr email of this attraction car rental licence
	 */
	@Override
	public void setNcrEmail(String ncrEmail) {
		model.setNcrEmail(ncrEmail);
	}

	/**
	 * Sets the ncr employees no of this attraction car rental licence.
	 *
	 * @param ncrEmployeesNo the ncr employees no of this attraction car rental licence
	 */
	@Override
	public void setNcrEmployeesNo(String ncrEmployeesNo) {
		model.setNcrEmployeesNo(ncrEmployeesNo);
	}

	/**
	 * Sets the ncr manager name of this attraction car rental licence.
	 *
	 * @param ncrManagerName the ncr manager name of this attraction car rental licence
	 */
	@Override
	public void setNcrManagerName(String ncrManagerName) {
		model.setNcrManagerName(ncrManagerName);
	}

	/**
	 * Sets the ncr office loc of this attraction car rental licence.
	 *
	 * @param ncrOfficeLoc the ncr office loc of this attraction car rental licence
	 */
	@Override
	public void setNcrOfficeLoc(String ncrOfficeLoc) {
		model.setNcrOfficeLoc(ncrOfficeLoc);
	}

	@Override
	public void setNcrOfficeLoc1(String ncrOfficeLoc) {
		model.setNcrOfficeLoc1(ncrOfficeLoc);
	}

	/**
	 * Sets the ncr position of this attraction car rental licence.
	 *
	 * @param ncrPosition the ncr position of this attraction car rental licence
	 */
	@Override
	public void setNcrPosition(String ncrPosition) {
		model.setNcrPosition(ncrPosition);
	}

	/**
	 * Sets the ncr sign date of this attraction car rental licence.
	 *
	 * @param ncrSignDate the ncr sign date of this attraction car rental licence
	 */
	@Override
	public void setNcrSignDate(Date ncrSignDate) {
		model.setNcrSignDate(ncrSignDate);
	}

	/**
	 * Sets the ncr telephone of this attraction car rental licence.
	 *
	 * @param ncrTelephone the ncr telephone of this attraction car rental licence
	 */
	@Override
	public void setNcrTelephone(String ncrTelephone) {
		model.setNcrTelephone(ncrTelephone);
	}

	/**
	 * Sets the ncr vehicles no of this attraction car rental licence.
	 *
	 * @param ncrVehiclesNo the ncr vehicles no of this attraction car rental licence
	 */
	@Override
	public void setNcrVehiclesNo(String ncrVehiclesNo) {
		model.setNcrVehiclesNo(ncrVehiclesNo);
	}

	/**
	 * Sets the primary key of this attraction car rental licence.
	 *
	 * @param primaryKey the primary key of this attraction car rental licence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this attraction car rental licence.
	 *
	 * @param userId the user ID of this attraction car rental licence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction car rental licence.
	 *
	 * @param userName the user name of this attraction car rental licence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction car rental licence.
	 *
	 * @param userUuid the user uuid of this attraction car rental licence
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
	protected AttractionCarRentalLicenceWrapper wrap(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		return new AttractionCarRentalLicenceWrapper(
			attractionCarRentalLicence);
	}

}