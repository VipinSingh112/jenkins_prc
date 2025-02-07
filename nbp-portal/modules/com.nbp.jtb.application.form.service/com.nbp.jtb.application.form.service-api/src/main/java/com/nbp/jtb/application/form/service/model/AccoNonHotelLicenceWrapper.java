/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccoNonHotelLicence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelLicence
 * @generated
 */
public class AccoNonHotelLicenceWrapper
	extends BaseModelWrapper<AccoNonHotelLicence>
	implements AccoNonHotelLicence, ModelWrapper<AccoNonHotelLicence> {

	public AccoNonHotelLicenceWrapper(AccoNonHotelLicence accoNonHotelLicence) {
		super(accoNonHotelLicence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accoNonHotelLicenceId", getAccoNonHotelLicenceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("accoName", getAccoName());
		attributes.put("accoAddress", getAccoAddress());
		attributes.put("accoTeleNo", getAccoTeleNo());
		attributes.put("accoFaxNo", getAccoFaxNo());
		attributes.put("accoEmail", getAccoEmail());
		attributes.put("accoNoOfEmp", getAccoNoOfEmp());
		attributes.put("accoOfferedType", getAccoOfferedType());
		attributes.put("noOfRooms", getNoOfRooms());
		attributes.put("ownerName", getOwnerName());
		attributes.put("ownerAddress", getOwnerAddress());
		attributes.put("ownerTeleNo", getOwnerTeleNo());
		attributes.put("ownerFaxNo", getOwnerFaxNo());
		attributes.put("operCompName", getOperCompName());
		attributes.put("operAddress", getOperAddress());
		attributes.put("managerName", getManagerName());
		attributes.put("managerAddress", getManagerAddress());
		attributes.put("managerTeleNo", getManagerTeleNo());
		attributes.put("managerFaxNo", getManagerFaxNo());
		attributes.put("managerEmail", getManagerEmail());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accoNonHotelLicenceId = (Long)attributes.get(
			"accoNonHotelLicenceId");

		if (accoNonHotelLicenceId != null) {
			setAccoNonHotelLicenceId(accoNonHotelLicenceId);
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

		String accoName = (String)attributes.get("accoName");

		if (accoName != null) {
			setAccoName(accoName);
		}

		String accoAddress = (String)attributes.get("accoAddress");

		if (accoAddress != null) {
			setAccoAddress(accoAddress);
		}

		String accoTeleNo = (String)attributes.get("accoTeleNo");

		if (accoTeleNo != null) {
			setAccoTeleNo(accoTeleNo);
		}

		String accoFaxNo = (String)attributes.get("accoFaxNo");

		if (accoFaxNo != null) {
			setAccoFaxNo(accoFaxNo);
		}

		String accoEmail = (String)attributes.get("accoEmail");

		if (accoEmail != null) {
			setAccoEmail(accoEmail);
		}

		String accoNoOfEmp = (String)attributes.get("accoNoOfEmp");

		if (accoNoOfEmp != null) {
			setAccoNoOfEmp(accoNoOfEmp);
		}

		String accoOfferedType = (String)attributes.get("accoOfferedType");

		if (accoOfferedType != null) {
			setAccoOfferedType(accoOfferedType);
		}

		String noOfRooms = (String)attributes.get("noOfRooms");

		if (noOfRooms != null) {
			setNoOfRooms(noOfRooms);
		}

		String ownerName = (String)attributes.get("ownerName");

		if (ownerName != null) {
			setOwnerName(ownerName);
		}

		String ownerAddress = (String)attributes.get("ownerAddress");

		if (ownerAddress != null) {
			setOwnerAddress(ownerAddress);
		}

		String ownerTeleNo = (String)attributes.get("ownerTeleNo");

		if (ownerTeleNo != null) {
			setOwnerTeleNo(ownerTeleNo);
		}

		String ownerFaxNo = (String)attributes.get("ownerFaxNo");

		if (ownerFaxNo != null) {
			setOwnerFaxNo(ownerFaxNo);
		}

		String operCompName = (String)attributes.get("operCompName");

		if (operCompName != null) {
			setOperCompName(operCompName);
		}

		String operAddress = (String)attributes.get("operAddress");

		if (operAddress != null) {
			setOperAddress(operAddress);
		}

		String managerName = (String)attributes.get("managerName");

		if (managerName != null) {
			setManagerName(managerName);
		}

		String managerAddress = (String)attributes.get("managerAddress");

		if (managerAddress != null) {
			setManagerAddress(managerAddress);
		}

		String managerTeleNo = (String)attributes.get("managerTeleNo");

		if (managerTeleNo != null) {
			setManagerTeleNo(managerTeleNo);
		}

		String managerFaxNo = (String)attributes.get("managerFaxNo");

		if (managerFaxNo != null) {
			setManagerFaxNo(managerFaxNo);
		}

		String managerEmail = (String)attributes.get("managerEmail");

		if (managerEmail != null) {
			setManagerEmail(managerEmail);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AccoNonHotelLicence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acco address of this acco non hotel licence.
	 *
	 * @return the acco address of this acco non hotel licence
	 */
	@Override
	public String getAccoAddress() {
		return model.getAccoAddress();
	}

	/**
	 * Returns the acco email of this acco non hotel licence.
	 *
	 * @return the acco email of this acco non hotel licence
	 */
	@Override
	public String getAccoEmail() {
		return model.getAccoEmail();
	}

	/**
	 * Returns the acco fax no of this acco non hotel licence.
	 *
	 * @return the acco fax no of this acco non hotel licence
	 */
	@Override
	public String getAccoFaxNo() {
		return model.getAccoFaxNo();
	}

	/**
	 * Returns the acco name of this acco non hotel licence.
	 *
	 * @return the acco name of this acco non hotel licence
	 */
	@Override
	public String getAccoName() {
		return model.getAccoName();
	}

	/**
	 * Returns the acco non hotel licence ID of this acco non hotel licence.
	 *
	 * @return the acco non hotel licence ID of this acco non hotel licence
	 */
	@Override
	public long getAccoNonHotelLicenceId() {
		return model.getAccoNonHotelLicenceId();
	}

	/**
	 * Returns the acco no of emp of this acco non hotel licence.
	 *
	 * @return the acco no of emp of this acco non hotel licence
	 */
	@Override
	public String getAccoNoOfEmp() {
		return model.getAccoNoOfEmp();
	}

	/**
	 * Returns the acco offered type of this acco non hotel licence.
	 *
	 * @return the acco offered type of this acco non hotel licence
	 */
	@Override
	public String getAccoOfferedType() {
		return model.getAccoOfferedType();
	}

	/**
	 * Returns the acco tele no of this acco non hotel licence.
	 *
	 * @return the acco tele no of this acco non hotel licence
	 */
	@Override
	public String getAccoTeleNo() {
		return model.getAccoTeleNo();
	}

	/**
	 * Returns the company ID of this acco non hotel licence.
	 *
	 * @return the company ID of this acco non hotel licence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acco non hotel licence.
	 *
	 * @return the create date of this acco non hotel licence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acco non hotel licence.
	 *
	 * @return the group ID of this acco non hotel licence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this acco non hotel licence.
	 *
	 * @return the jtb application ID of this acco non hotel licence
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the manager address of this acco non hotel licence.
	 *
	 * @return the manager address of this acco non hotel licence
	 */
	@Override
	public String getManagerAddress() {
		return model.getManagerAddress();
	}

	/**
	 * Returns the manager email of this acco non hotel licence.
	 *
	 * @return the manager email of this acco non hotel licence
	 */
	@Override
	public String getManagerEmail() {
		return model.getManagerEmail();
	}

	/**
	 * Returns the manager fax no of this acco non hotel licence.
	 *
	 * @return the manager fax no of this acco non hotel licence
	 */
	@Override
	public String getManagerFaxNo() {
		return model.getManagerFaxNo();
	}

	/**
	 * Returns the manager name of this acco non hotel licence.
	 *
	 * @return the manager name of this acco non hotel licence
	 */
	@Override
	public String getManagerName() {
		return model.getManagerName();
	}

	/**
	 * Returns the manager tele no of this acco non hotel licence.
	 *
	 * @return the manager tele no of this acco non hotel licence
	 */
	@Override
	public String getManagerTeleNo() {
		return model.getManagerTeleNo();
	}

	/**
	 * Returns the modified date of this acco non hotel licence.
	 *
	 * @return the modified date of this acco non hotel licence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the no of rooms of this acco non hotel licence.
	 *
	 * @return the no of rooms of this acco non hotel licence
	 */
	@Override
	public String getNoOfRooms() {
		return model.getNoOfRooms();
	}

	/**
	 * Returns the oper address of this acco non hotel licence.
	 *
	 * @return the oper address of this acco non hotel licence
	 */
	@Override
	public String getOperAddress() {
		return model.getOperAddress();
	}

	/**
	 * Returns the oper comp name of this acco non hotel licence.
	 *
	 * @return the oper comp name of this acco non hotel licence
	 */
	@Override
	public String getOperCompName() {
		return model.getOperCompName();
	}

	/**
	 * Returns the owner address of this acco non hotel licence.
	 *
	 * @return the owner address of this acco non hotel licence
	 */
	@Override
	public String getOwnerAddress() {
		return model.getOwnerAddress();
	}

	/**
	 * Returns the owner fax no of this acco non hotel licence.
	 *
	 * @return the owner fax no of this acco non hotel licence
	 */
	@Override
	public String getOwnerFaxNo() {
		return model.getOwnerFaxNo();
	}

	/**
	 * Returns the owner name of this acco non hotel licence.
	 *
	 * @return the owner name of this acco non hotel licence
	 */
	@Override
	public String getOwnerName() {
		return model.getOwnerName();
	}

	/**
	 * Returns the owner tele no of this acco non hotel licence.
	 *
	 * @return the owner tele no of this acco non hotel licence
	 */
	@Override
	public String getOwnerTeleNo() {
		return model.getOwnerTeleNo();
	}

	/**
	 * Returns the primary key of this acco non hotel licence.
	 *
	 * @return the primary key of this acco non hotel licence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acco non hotel licence.
	 *
	 * @return the user ID of this acco non hotel licence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acco non hotel licence.
	 *
	 * @return the user name of this acco non hotel licence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acco non hotel licence.
	 *
	 * @return the user uuid of this acco non hotel licence
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acco non hotel licence.
	 *
	 * @return the uuid of this acco non hotel licence
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
	 * Sets the acco address of this acco non hotel licence.
	 *
	 * @param accoAddress the acco address of this acco non hotel licence
	 */
	@Override
	public void setAccoAddress(String accoAddress) {
		model.setAccoAddress(accoAddress);
	}

	/**
	 * Sets the acco email of this acco non hotel licence.
	 *
	 * @param accoEmail the acco email of this acco non hotel licence
	 */
	@Override
	public void setAccoEmail(String accoEmail) {
		model.setAccoEmail(accoEmail);
	}

	/**
	 * Sets the acco fax no of this acco non hotel licence.
	 *
	 * @param accoFaxNo the acco fax no of this acco non hotel licence
	 */
	@Override
	public void setAccoFaxNo(String accoFaxNo) {
		model.setAccoFaxNo(accoFaxNo);
	}

	/**
	 * Sets the acco name of this acco non hotel licence.
	 *
	 * @param accoName the acco name of this acco non hotel licence
	 */
	@Override
	public void setAccoName(String accoName) {
		model.setAccoName(accoName);
	}

	/**
	 * Sets the acco non hotel licence ID of this acco non hotel licence.
	 *
	 * @param accoNonHotelLicenceId the acco non hotel licence ID of this acco non hotel licence
	 */
	@Override
	public void setAccoNonHotelLicenceId(long accoNonHotelLicenceId) {
		model.setAccoNonHotelLicenceId(accoNonHotelLicenceId);
	}

	/**
	 * Sets the acco no of emp of this acco non hotel licence.
	 *
	 * @param accoNoOfEmp the acco no of emp of this acco non hotel licence
	 */
	@Override
	public void setAccoNoOfEmp(String accoNoOfEmp) {
		model.setAccoNoOfEmp(accoNoOfEmp);
	}

	/**
	 * Sets the acco offered type of this acco non hotel licence.
	 *
	 * @param accoOfferedType the acco offered type of this acco non hotel licence
	 */
	@Override
	public void setAccoOfferedType(String accoOfferedType) {
		model.setAccoOfferedType(accoOfferedType);
	}

	/**
	 * Sets the acco tele no of this acco non hotel licence.
	 *
	 * @param accoTeleNo the acco tele no of this acco non hotel licence
	 */
	@Override
	public void setAccoTeleNo(String accoTeleNo) {
		model.setAccoTeleNo(accoTeleNo);
	}

	/**
	 * Sets the company ID of this acco non hotel licence.
	 *
	 * @param companyId the company ID of this acco non hotel licence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acco non hotel licence.
	 *
	 * @param createDate the create date of this acco non hotel licence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acco non hotel licence.
	 *
	 * @param groupId the group ID of this acco non hotel licence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this acco non hotel licence.
	 *
	 * @param jtbApplicationId the jtb application ID of this acco non hotel licence
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the manager address of this acco non hotel licence.
	 *
	 * @param managerAddress the manager address of this acco non hotel licence
	 */
	@Override
	public void setManagerAddress(String managerAddress) {
		model.setManagerAddress(managerAddress);
	}

	/**
	 * Sets the manager email of this acco non hotel licence.
	 *
	 * @param managerEmail the manager email of this acco non hotel licence
	 */
	@Override
	public void setManagerEmail(String managerEmail) {
		model.setManagerEmail(managerEmail);
	}

	/**
	 * Sets the manager fax no of this acco non hotel licence.
	 *
	 * @param managerFaxNo the manager fax no of this acco non hotel licence
	 */
	@Override
	public void setManagerFaxNo(String managerFaxNo) {
		model.setManagerFaxNo(managerFaxNo);
	}

	/**
	 * Sets the manager name of this acco non hotel licence.
	 *
	 * @param managerName the manager name of this acco non hotel licence
	 */
	@Override
	public void setManagerName(String managerName) {
		model.setManagerName(managerName);
	}

	/**
	 * Sets the manager tele no of this acco non hotel licence.
	 *
	 * @param managerTeleNo the manager tele no of this acco non hotel licence
	 */
	@Override
	public void setManagerTeleNo(String managerTeleNo) {
		model.setManagerTeleNo(managerTeleNo);
	}

	/**
	 * Sets the modified date of this acco non hotel licence.
	 *
	 * @param modifiedDate the modified date of this acco non hotel licence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the no of rooms of this acco non hotel licence.
	 *
	 * @param noOfRooms the no of rooms of this acco non hotel licence
	 */
	@Override
	public void setNoOfRooms(String noOfRooms) {
		model.setNoOfRooms(noOfRooms);
	}

	/**
	 * Sets the oper address of this acco non hotel licence.
	 *
	 * @param operAddress the oper address of this acco non hotel licence
	 */
	@Override
	public void setOperAddress(String operAddress) {
		model.setOperAddress(operAddress);
	}

	/**
	 * Sets the oper comp name of this acco non hotel licence.
	 *
	 * @param operCompName the oper comp name of this acco non hotel licence
	 */
	@Override
	public void setOperCompName(String operCompName) {
		model.setOperCompName(operCompName);
	}

	/**
	 * Sets the owner address of this acco non hotel licence.
	 *
	 * @param ownerAddress the owner address of this acco non hotel licence
	 */
	@Override
	public void setOwnerAddress(String ownerAddress) {
		model.setOwnerAddress(ownerAddress);
	}

	/**
	 * Sets the owner fax no of this acco non hotel licence.
	 *
	 * @param ownerFaxNo the owner fax no of this acco non hotel licence
	 */
	@Override
	public void setOwnerFaxNo(String ownerFaxNo) {
		model.setOwnerFaxNo(ownerFaxNo);
	}

	/**
	 * Sets the owner name of this acco non hotel licence.
	 *
	 * @param ownerName the owner name of this acco non hotel licence
	 */
	@Override
	public void setOwnerName(String ownerName) {
		model.setOwnerName(ownerName);
	}

	/**
	 * Sets the owner tele no of this acco non hotel licence.
	 *
	 * @param ownerTeleNo the owner tele no of this acco non hotel licence
	 */
	@Override
	public void setOwnerTeleNo(String ownerTeleNo) {
		model.setOwnerTeleNo(ownerTeleNo);
	}

	/**
	 * Sets the primary key of this acco non hotel licence.
	 *
	 * @param primaryKey the primary key of this acco non hotel licence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acco non hotel licence.
	 *
	 * @param userId the user ID of this acco non hotel licence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acco non hotel licence.
	 *
	 * @param userName the user name of this acco non hotel licence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acco non hotel licence.
	 *
	 * @param userUuid the user uuid of this acco non hotel licence
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acco non hotel licence.
	 *
	 * @param uuid the uuid of this acco non hotel licence
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
	protected AccoNonHotelLicenceWrapper wrap(
		AccoNonHotelLicence accoNonHotelLicence) {

		return new AccoNonHotelLicenceWrapper(accoNonHotelLicence);
	}

}