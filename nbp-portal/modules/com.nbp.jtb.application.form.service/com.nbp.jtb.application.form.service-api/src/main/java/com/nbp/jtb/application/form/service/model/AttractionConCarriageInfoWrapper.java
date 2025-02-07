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
 * This class is a wrapper for {@link AttractionConCarriageInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionConCarriageInfo
 * @generated
 */
public class AttractionConCarriageInfoWrapper
	extends BaseModelWrapper<AttractionConCarriageInfo>
	implements AttractionConCarriageInfo,
			   ModelWrapper<AttractionConCarriageInfo> {

	public AttractionConCarriageInfoWrapper(
		AttractionConCarriageInfo attractionConCarriageInfo) {

		super(attractionConCarriageInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionConCarriageInfoId", getAttractionConCarriageInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ownerName", getOwnerName());
		attributes.put("homeAddress", getHomeAddress());
		attributes.put("email", getEmail());
		attributes.put("telephone", getTelephone());
		attributes.put("parish", getParish());
		attributes.put("newContractDate", getNewContractDate());
		attributes.put("newContarctVehiclesNo", getNewContarctVehiclesNo());
		attributes.put("newContractTrn", getNewContractTrn());
		attributes.put("contractOrganization", getContractOrganization());
		attributes.put("ownerSignDate", getOwnerSignDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionConCarriageInfoId = (Long)attributes.get(
			"attractionConCarriageInfoId");

		if (attractionConCarriageInfoId != null) {
			setAttractionConCarriageInfoId(attractionConCarriageInfoId);
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

		String ownerName = (String)attributes.get("ownerName");

		if (ownerName != null) {
			setOwnerName(ownerName);
		}

		String homeAddress = (String)attributes.get("homeAddress");

		if (homeAddress != null) {
			setHomeAddress(homeAddress);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		Date newContractDate = (Date)attributes.get("newContractDate");

		if (newContractDate != null) {
			setNewContractDate(newContractDate);
		}

		String newContarctVehiclesNo = (String)attributes.get(
			"newContarctVehiclesNo");

		if (newContarctVehiclesNo != null) {
			setNewContarctVehiclesNo(newContarctVehiclesNo);
		}

		String newContractTrn = (String)attributes.get("newContractTrn");

		if (newContractTrn != null) {
			setNewContractTrn(newContractTrn);
		}

		String contractOrganization = (String)attributes.get(
			"contractOrganization");

		if (contractOrganization != null) {
			setContractOrganization(contractOrganization);
		}

		Date ownerSignDate = (Date)attributes.get("ownerSignDate");

		if (ownerSignDate != null) {
			setOwnerSignDate(ownerSignDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionConCarriageInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction con carriage info ID of this attraction con carriage info.
	 *
	 * @return the attraction con carriage info ID of this attraction con carriage info
	 */
	@Override
	public long getAttractionConCarriageInfoId() {
		return model.getAttractionConCarriageInfoId();
	}

	/**
	 * Returns the company ID of this attraction con carriage info.
	 *
	 * @return the company ID of this attraction con carriage info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contract organization of this attraction con carriage info.
	 *
	 * @return the contract organization of this attraction con carriage info
	 */
	@Override
	public String getContractOrganization() {
		return model.getContractOrganization();
	}

	/**
	 * Returns the create date of this attraction con carriage info.
	 *
	 * @return the create date of this attraction con carriage info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this attraction con carriage info.
	 *
	 * @return the email of this attraction con carriage info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this attraction con carriage info.
	 *
	 * @return the group ID of this attraction con carriage info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home address of this attraction con carriage info.
	 *
	 * @return the home address of this attraction con carriage info
	 */
	@Override
	public String getHomeAddress() {
		return model.getHomeAddress();
	}

	/**
	 * Returns the jtb application ID of this attraction con carriage info.
	 *
	 * @return the jtb application ID of this attraction con carriage info
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction con carriage info.
	 *
	 * @return the modified date of this attraction con carriage info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the new contarct vehicles no of this attraction con carriage info.
	 *
	 * @return the new contarct vehicles no of this attraction con carriage info
	 */
	@Override
	public String getNewContarctVehiclesNo() {
		return model.getNewContarctVehiclesNo();
	}

	/**
	 * Returns the new contract date of this attraction con carriage info.
	 *
	 * @return the new contract date of this attraction con carriage info
	 */
	@Override
	public Date getNewContractDate() {
		return model.getNewContractDate();
	}

	/**
	 * Returns the new contract trn of this attraction con carriage info.
	 *
	 * @return the new contract trn of this attraction con carriage info
	 */
	@Override
	public String getNewContractTrn() {
		return model.getNewContractTrn();
	}

	/**
	 * Returns the owner name of this attraction con carriage info.
	 *
	 * @return the owner name of this attraction con carriage info
	 */
	@Override
	public String getOwnerName() {
		return model.getOwnerName();
	}

	/**
	 * Returns the owner sign date of this attraction con carriage info.
	 *
	 * @return the owner sign date of this attraction con carriage info
	 */
	@Override
	public Date getOwnerSignDate() {
		return model.getOwnerSignDate();
	}

	/**
	 * Returns the parish of this attraction con carriage info.
	 *
	 * @return the parish of this attraction con carriage info
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this attraction con carriage info.
	 *
	 * @return the primary key of this attraction con carriage info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone of this attraction con carriage info.
	 *
	 * @return the telephone of this attraction con carriage info
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the user ID of this attraction con carriage info.
	 *
	 * @return the user ID of this attraction con carriage info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction con carriage info.
	 *
	 * @return the user name of this attraction con carriage info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction con carriage info.
	 *
	 * @return the user uuid of this attraction con carriage info
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
	 * Sets the attraction con carriage info ID of this attraction con carriage info.
	 *
	 * @param attractionConCarriageInfoId the attraction con carriage info ID of this attraction con carriage info
	 */
	@Override
	public void setAttractionConCarriageInfoId(
		long attractionConCarriageInfoId) {

		model.setAttractionConCarriageInfoId(attractionConCarriageInfoId);
	}

	/**
	 * Sets the company ID of this attraction con carriage info.
	 *
	 * @param companyId the company ID of this attraction con carriage info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contract organization of this attraction con carriage info.
	 *
	 * @param contractOrganization the contract organization of this attraction con carriage info
	 */
	@Override
	public void setContractOrganization(String contractOrganization) {
		model.setContractOrganization(contractOrganization);
	}

	/**
	 * Sets the create date of this attraction con carriage info.
	 *
	 * @param createDate the create date of this attraction con carriage info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this attraction con carriage info.
	 *
	 * @param email the email of this attraction con carriage info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this attraction con carriage info.
	 *
	 * @param groupId the group ID of this attraction con carriage info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home address of this attraction con carriage info.
	 *
	 * @param homeAddress the home address of this attraction con carriage info
	 */
	@Override
	public void setHomeAddress(String homeAddress) {
		model.setHomeAddress(homeAddress);
	}

	/**
	 * Sets the jtb application ID of this attraction con carriage info.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction con carriage info
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction con carriage info.
	 *
	 * @param modifiedDate the modified date of this attraction con carriage info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the new contarct vehicles no of this attraction con carriage info.
	 *
	 * @param newContarctVehiclesNo the new contarct vehicles no of this attraction con carriage info
	 */
	@Override
	public void setNewContarctVehiclesNo(String newContarctVehiclesNo) {
		model.setNewContarctVehiclesNo(newContarctVehiclesNo);
	}

	/**
	 * Sets the new contract date of this attraction con carriage info.
	 *
	 * @param newContractDate the new contract date of this attraction con carriage info
	 */
	@Override
	public void setNewContractDate(Date newContractDate) {
		model.setNewContractDate(newContractDate);
	}

	/**
	 * Sets the new contract trn of this attraction con carriage info.
	 *
	 * @param newContractTrn the new contract trn of this attraction con carriage info
	 */
	@Override
	public void setNewContractTrn(String newContractTrn) {
		model.setNewContractTrn(newContractTrn);
	}

	/**
	 * Sets the owner name of this attraction con carriage info.
	 *
	 * @param ownerName the owner name of this attraction con carriage info
	 */
	@Override
	public void setOwnerName(String ownerName) {
		model.setOwnerName(ownerName);
	}

	/**
	 * Sets the owner sign date of this attraction con carriage info.
	 *
	 * @param ownerSignDate the owner sign date of this attraction con carriage info
	 */
	@Override
	public void setOwnerSignDate(Date ownerSignDate) {
		model.setOwnerSignDate(ownerSignDate);
	}

	/**
	 * Sets the parish of this attraction con carriage info.
	 *
	 * @param parish the parish of this attraction con carriage info
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this attraction con carriage info.
	 *
	 * @param primaryKey the primary key of this attraction con carriage info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone of this attraction con carriage info.
	 *
	 * @param telephone the telephone of this attraction con carriage info
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the user ID of this attraction con carriage info.
	 *
	 * @param userId the user ID of this attraction con carriage info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction con carriage info.
	 *
	 * @param userName the user name of this attraction con carriage info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction con carriage info.
	 *
	 * @param userUuid the user uuid of this attraction con carriage info
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
	protected AttractionConCarriageInfoWrapper wrap(
		AttractionConCarriageInfo attractionConCarriageInfo) {

		return new AttractionConCarriageInfoWrapper(attractionConCarriageInfo);
	}

}