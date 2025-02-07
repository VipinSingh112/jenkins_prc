/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionCarRentLicence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentLicence
 * @generated
 */
public class AttractionCarRentLicenceWrapper
	extends BaseModelWrapper<AttractionCarRentLicence>
	implements AttractionCarRentLicence,
			   ModelWrapper<AttractionCarRentLicence> {

	public AttractionCarRentLicenceWrapper(
		AttractionCarRentLicence attractionCarRentLicence) {

		super(attractionCarRentLicence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionCarRentLicenceId", getAttractionCarRentLicenceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("newCarRentApplicantName", getNewCarRentApplicantName());
		attributes.put("newCarRentAddress", getNewCarRentAddress());
		attributes.put("newCarRentCompanyName", getNewCarRentCompanyName());
		attributes.put("newCarRentCompanyAddr", getNewCarRentCompanyAddr());
		attributes.put("newCarRentTelephone", getNewCarRentTelephone());
		attributes.put("newCarRentEmail", getNewCarRentEmail());
		attributes.put("newCarRentManagerName", getNewCarRentManagerName());
		attributes.put("newCarRentDate", getNewCarRentDate());
		attributes.put("newCarRentVehiclesNo", getNewCarRentVehiclesNo());
		attributes.put("newCarRentEmployeesNo", getNewCarRentEmployeesNo());
		attributes.put("newCarRentOfficeLoc", getNewCarRentOfficeLoc());
		attributes.put("newCarRentPosition", getNewCarRentPosition());
		attributes.put("newCarRentOfficeLoc", getNewCarRentOfficeLoc());
		attributes.put("newCarRentDate", getNewCarRentDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionCarRentLicenceId = (Long)attributes.get(
			"attractionCarRentLicenceId");

		if (attractionCarRentLicenceId != null) {
			setAttractionCarRentLicenceId(attractionCarRentLicenceId);
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

		String newCarRentApplicantName = (String)attributes.get(
			"newCarRentApplicantName");

		if (newCarRentApplicantName != null) {
			setNewCarRentApplicantName(newCarRentApplicantName);
		}

		String newCarRentAddress = (String)attributes.get("newCarRentAddress");

		if (newCarRentAddress != null) {
			setNewCarRentAddress(newCarRentAddress);
		}

		String newCarRentCompanyName = (String)attributes.get(
			"newCarRentCompanyName");

		if (newCarRentCompanyName != null) {
			setNewCarRentCompanyName(newCarRentCompanyName);
		}

		String newCarRentCompanyAddr = (String)attributes.get(
			"newCarRentCompanyAddr");

		if (newCarRentCompanyAddr != null) {
			setNewCarRentCompanyAddr(newCarRentCompanyAddr);
		}

		String newCarRentTelephone = (String)attributes.get(
			"newCarRentTelephone");

		if (newCarRentTelephone != null) {
			setNewCarRentTelephone(newCarRentTelephone);
		}

		String newCarRentEmail = (String)attributes.get("newCarRentEmail");

		if (newCarRentEmail != null) {
			setNewCarRentEmail(newCarRentEmail);
		}

		String newCarRentManagerName = (String)attributes.get(
			"newCarRentManagerName");

		if (newCarRentManagerName != null) {
			setNewCarRentManagerName(newCarRentManagerName);
		}

		Date newCarRentDate = (Date)attributes.get("newCarRentDate");

		if (newCarRentDate != null) {
			setNewCarRentDate(newCarRentDate);
		}

		String newCarRentVehiclesNo = (String)attributes.get(
			"newCarRentVehiclesNo");

		if (newCarRentVehiclesNo != null) {
			setNewCarRentVehiclesNo(newCarRentVehiclesNo);
		}

		String newCarRentEmployeesNo = (String)attributes.get(
			"newCarRentEmployeesNo");

		if (newCarRentEmployeesNo != null) {
			setNewCarRentEmployeesNo(newCarRentEmployeesNo);
		}

		String newCarRentOfficeLoc = (String)attributes.get(
			"newCarRentOfficeLoc");

		if (newCarRentOfficeLoc != null) {
			setNewCarRentOfficeLoc(newCarRentOfficeLoc);
		}

		String newCarRentPosition = (String)attributes.get(
			"newCarRentPosition");

		if (newCarRentPosition != null) {
			setNewCarRentPosition(newCarRentPosition);
		}

		String newCarRentOfficeLoc1 = (String)attributes.get(
			"newCarRentOfficeLoc");

		if (newCarRentOfficeLoc1 != null) {
			setNewCarRentOfficeLoc(newCarRentOfficeLoc1);
		}

		Date newCarRentDate1 = (Date)attributes.get("newCarRentDate");

		if (newCarRentDate1 != null) {
			setNewCarRentDate(newCarRentDate1);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionCarRentLicence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction car rent licence ID of this attraction car rent licence.
	 *
	 * @return the attraction car rent licence ID of this attraction car rent licence
	 */
	@Override
	public long getAttractionCarRentLicenceId() {
		return model.getAttractionCarRentLicenceId();
	}

	/**
	 * Returns the company ID of this attraction car rent licence.
	 *
	 * @return the company ID of this attraction car rent licence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction car rent licence.
	 *
	 * @return the create date of this attraction car rent licence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this attraction car rent licence.
	 *
	 * @return the group ID of this attraction car rent licence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction car rent licence.
	 *
	 * @return the jtb application ID of this attraction car rent licence
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction car rent licence.
	 *
	 * @return the modified date of this attraction car rent licence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the new car rent address of this attraction car rent licence.
	 *
	 * @return the new car rent address of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentAddress() {
		return model.getNewCarRentAddress();
	}

	/**
	 * Returns the new car rent applicant name of this attraction car rent licence.
	 *
	 * @return the new car rent applicant name of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentApplicantName() {
		return model.getNewCarRentApplicantName();
	}

	/**
	 * Returns the new car rent company addr of this attraction car rent licence.
	 *
	 * @return the new car rent company addr of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentCompanyAddr() {
		return model.getNewCarRentCompanyAddr();
	}

	/**
	 * Returns the new car rent company name of this attraction car rent licence.
	 *
	 * @return the new car rent company name of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentCompanyName() {
		return model.getNewCarRentCompanyName();
	}

	/**
	 * Returns the new car rent date of this attraction car rent licence.
	 *
	 * @return the new car rent date of this attraction car rent licence
	 */
	@Override
	public Date getNewCarRentDate() {
		return model.getNewCarRentDate();
	}

	/**
	 * Returns the new car rent email of this attraction car rent licence.
	 *
	 * @return the new car rent email of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentEmail() {
		return model.getNewCarRentEmail();
	}

	/**
	 * Returns the new car rent employees no of this attraction car rent licence.
	 *
	 * @return the new car rent employees no of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentEmployeesNo() {
		return model.getNewCarRentEmployeesNo();
	}

	/**
	 * Returns the new car rent manager name of this attraction car rent licence.
	 *
	 * @return the new car rent manager name of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentManagerName() {
		return model.getNewCarRentManagerName();
	}

	/**
	 * Returns the new car rent office loc of this attraction car rent licence.
	 *
	 * @return the new car rent office loc of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentOfficeLoc() {
		return model.getNewCarRentOfficeLoc();
	}

	/**
	 * Returns the new car rent position of this attraction car rent licence.
	 *
	 * @return the new car rent position of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentPosition() {
		return model.getNewCarRentPosition();
	}

	/**
	 * Returns the new car rent telephone of this attraction car rent licence.
	 *
	 * @return the new car rent telephone of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentTelephone() {
		return model.getNewCarRentTelephone();
	}

	/**
	 * Returns the new car rent vehicles no of this attraction car rent licence.
	 *
	 * @return the new car rent vehicles no of this attraction car rent licence
	 */
	@Override
	public String getNewCarRentVehiclesNo() {
		return model.getNewCarRentVehiclesNo();
	}

	/**
	 * Returns the primary key of this attraction car rent licence.
	 *
	 * @return the primary key of this attraction car rent licence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this attraction car rent licence.
	 *
	 * @return the user ID of this attraction car rent licence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction car rent licence.
	 *
	 * @return the user name of this attraction car rent licence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction car rent licence.
	 *
	 * @return the user uuid of this attraction car rent licence
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
	 * Sets the attraction car rent licence ID of this attraction car rent licence.
	 *
	 * @param attractionCarRentLicenceId the attraction car rent licence ID of this attraction car rent licence
	 */
	@Override
	public void setAttractionCarRentLicenceId(long attractionCarRentLicenceId) {
		model.setAttractionCarRentLicenceId(attractionCarRentLicenceId);
	}

	/**
	 * Sets the company ID of this attraction car rent licence.
	 *
	 * @param companyId the company ID of this attraction car rent licence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction car rent licence.
	 *
	 * @param createDate the create date of this attraction car rent licence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this attraction car rent licence.
	 *
	 * @param groupId the group ID of this attraction car rent licence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction car rent licence.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction car rent licence
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction car rent licence.
	 *
	 * @param modifiedDate the modified date of this attraction car rent licence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the new car rent address of this attraction car rent licence.
	 *
	 * @param newCarRentAddress the new car rent address of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentAddress(String newCarRentAddress) {
		model.setNewCarRentAddress(newCarRentAddress);
	}

	/**
	 * Sets the new car rent applicant name of this attraction car rent licence.
	 *
	 * @param newCarRentApplicantName the new car rent applicant name of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentApplicantName(String newCarRentApplicantName) {
		model.setNewCarRentApplicantName(newCarRentApplicantName);
	}

	/**
	 * Sets the new car rent company addr of this attraction car rent licence.
	 *
	 * @param newCarRentCompanyAddr the new car rent company addr of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentCompanyAddr(String newCarRentCompanyAddr) {
		model.setNewCarRentCompanyAddr(newCarRentCompanyAddr);
	}

	/**
	 * Sets the new car rent company name of this attraction car rent licence.
	 *
	 * @param newCarRentCompanyName the new car rent company name of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentCompanyName(String newCarRentCompanyName) {
		model.setNewCarRentCompanyName(newCarRentCompanyName);
	}

	/**
	 * Sets the new car rent date of this attraction car rent licence.
	 *
	 * @param newCarRentDate the new car rent date of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentDate(Date newCarRentDate) {
		model.setNewCarRentDate(newCarRentDate);
	}

	/**
	 * Sets the new car rent email of this attraction car rent licence.
	 *
	 * @param newCarRentEmail the new car rent email of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentEmail(String newCarRentEmail) {
		model.setNewCarRentEmail(newCarRentEmail);
	}

	/**
	 * Sets the new car rent employees no of this attraction car rent licence.
	 *
	 * @param newCarRentEmployeesNo the new car rent employees no of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentEmployeesNo(String newCarRentEmployeesNo) {
		model.setNewCarRentEmployeesNo(newCarRentEmployeesNo);
	}

	/**
	 * Sets the new car rent manager name of this attraction car rent licence.
	 *
	 * @param newCarRentManagerName the new car rent manager name of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentManagerName(String newCarRentManagerName) {
		model.setNewCarRentManagerName(newCarRentManagerName);
	}

	/**
	 * Sets the new car rent office loc of this attraction car rent licence.
	 *
	 * @param newCarRentOfficeLoc the new car rent office loc of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentOfficeLoc(String newCarRentOfficeLoc) {
		model.setNewCarRentOfficeLoc(newCarRentOfficeLoc);
	}

	/**
	 * Sets the new car rent position of this attraction car rent licence.
	 *
	 * @param newCarRentPosition the new car rent position of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentPosition(String newCarRentPosition) {
		model.setNewCarRentPosition(newCarRentPosition);
	}

	/**
	 * Sets the new car rent telephone of this attraction car rent licence.
	 *
	 * @param newCarRentTelephone the new car rent telephone of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentTelephone(String newCarRentTelephone) {
		model.setNewCarRentTelephone(newCarRentTelephone);
	}

	/**
	 * Sets the new car rent vehicles no of this attraction car rent licence.
	 *
	 * @param newCarRentVehiclesNo the new car rent vehicles no of this attraction car rent licence
	 */
	@Override
	public void setNewCarRentVehiclesNo(String newCarRentVehiclesNo) {
		model.setNewCarRentVehiclesNo(newCarRentVehiclesNo);
	}

	/**
	 * Sets the primary key of this attraction car rent licence.
	 *
	 * @param primaryKey the primary key of this attraction car rent licence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this attraction car rent licence.
	 *
	 * @param userId the user ID of this attraction car rent licence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction car rent licence.
	 *
	 * @param userName the user name of this attraction car rent licence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction car rent licence.
	 *
	 * @param userUuid the user uuid of this attraction car rent licence
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected AttractionCarRentLicenceWrapper wrap(
		AttractionCarRentLicence attractionCarRentLicence) {

		return new AttractionCarRentLicenceWrapper(attractionCarRentLicence);
	}

	@Override
	public Date getNewCarRentDate1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNewCarRentDate1(Date newCarRentDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNewCarRentOfficeLoc1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNewCarRentOfficeLoc1(String newCarRentOfficeLoc) {
		// TODO Auto-generated method stub
		
	}

}