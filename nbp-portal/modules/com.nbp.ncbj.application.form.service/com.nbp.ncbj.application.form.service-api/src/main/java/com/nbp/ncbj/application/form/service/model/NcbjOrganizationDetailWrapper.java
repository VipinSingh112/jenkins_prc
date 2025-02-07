/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjOrganizationDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrganizationDetail
 * @generated
 */
public class NcbjOrganizationDetailWrapper
	extends BaseModelWrapper<NcbjOrganizationDetail>
	implements ModelWrapper<NcbjOrganizationDetail>, NcbjOrganizationDetail {

	public NcbjOrganizationDetailWrapper(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		super(ncbjOrganizationDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ncbjOrganizationDetailId", getNcbjOrganizationDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfOrganization", getNameOfOrganization());
		attributes.put("address", getAddress());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("faxNumber", getFaxNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("headOfOrganization ", getHeadOfOrganization());
		attributes.put("position", getPosition());
		attributes.put("contactPersonName", getContactPersonName());
		attributes.put(
			"contactPersonEmailAddress ", getContactPersonEmailAddress());
		attributes.put("contactPersonPosition ", getContactPersonPosition());
		attributes.put("managementSystem", getManagementSystem());
		attributes.put("determinedTheScope", getDeterminedTheScope());
		attributes.put("pleaseStageTheScope", getPleaseStageTheScope());
		attributes.put("positionSecondFo", getPositionSecondFo());
		attributes.put("managementSystemFo", getManagementSystemFo());
		attributes.put("productTypes", getProductTypes());
		attributes.put("productLine", getProductLine());
		attributes.put("haccpStudies", getHaccpStudies());
		attributes.put("criticalControlPoints", getCriticalControlPoints());
		attributes.put("operationalNumber", getOperationalNumber());
		attributes.put("productionSize", getProductionSize());
		attributes.put("warehouseSize", getWarehouseSize());
		attributes.put("warehouseDetailSize", getWarehouseDetailSize());
		attributes.put("seasonalProcess", getSeasonalProcess());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjOrganizationDetailId = (Long)attributes.get(
			"ncbjOrganizationDetailId");

		if (ncbjOrganizationDetailId != null) {
			setNcbjOrganizationDetailId(ncbjOrganizationDetailId);
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

		String nameOfOrganization = (String)attributes.get(
			"nameOfOrganization");

		if (nameOfOrganization != null) {
			setNameOfOrganization(nameOfOrganization);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String faxNumber = (String)attributes.get("faxNumber");

		if (faxNumber != null) {
			setFaxNumber(faxNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String headOfOrganization = (String)attributes.get(
			"headOfOrganization ");

		if (headOfOrganization != null) {
			setHeadOfOrganization(headOfOrganization);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String contactPersonName = (String)attributes.get("contactPersonName");

		if (contactPersonName != null) {
			setContactPersonName(contactPersonName);
		}

		String contactPersonEmailAddress = (String)attributes.get(
			"contactPersonEmailAddress ");

		if (contactPersonEmailAddress != null) {
			setContactPersonEmailAddress(contactPersonEmailAddress);
		}

		String contactPersonPosition = (String)attributes.get(
			"contactPersonPosition ");

		if (contactPersonPosition != null) {
			setContactPersonPosition(contactPersonPosition);
		}

		String managementSystem = (String)attributes.get("managementSystem");

		if (managementSystem != null) {
			setManagementSystem(managementSystem);
		}

		String determinedTheScope = (String)attributes.get(
			"determinedTheScope");

		if (determinedTheScope != null) {
			setDeterminedTheScope(determinedTheScope);
		}

		String pleaseStageTheScope = (String)attributes.get(
			"pleaseStageTheScope");

		if (pleaseStageTheScope != null) {
			setPleaseStageTheScope(pleaseStageTheScope);
		}

		String positionSecondFo = (String)attributes.get("positionSecondFo");

		if (positionSecondFo != null) {
			setPositionSecondFo(positionSecondFo);
		}

		String managementSystemFo = (String)attributes.get(
			"managementSystemFo");

		if (managementSystemFo != null) {
			setManagementSystemFo(managementSystemFo);
		}

		String productTypes = (String)attributes.get("productTypes");

		if (productTypes != null) {
			setProductTypes(productTypes);
		}

		String productLine = (String)attributes.get("productLine");

		if (productLine != null) {
			setProductLine(productLine);
		}

		String haccpStudies = (String)attributes.get("haccpStudies");

		if (haccpStudies != null) {
			setHaccpStudies(haccpStudies);
		}

		String criticalControlPoints = (String)attributes.get(
			"criticalControlPoints");

		if (criticalControlPoints != null) {
			setCriticalControlPoints(criticalControlPoints);
		}

		String operationalNumber = (String)attributes.get("operationalNumber");

		if (operationalNumber != null) {
			setOperationalNumber(operationalNumber);
		}

		String productionSize = (String)attributes.get("productionSize");

		if (productionSize != null) {
			setProductionSize(productionSize);
		}

		String warehouseSize = (String)attributes.get("warehouseSize");

		if (warehouseSize != null) {
			setWarehouseSize(warehouseSize);
		}

		String warehouseDetailSize = (String)attributes.get(
			"warehouseDetailSize");

		if (warehouseDetailSize != null) {
			setWarehouseDetailSize(warehouseDetailSize);
		}

		String seasonalProcess = (String)attributes.get("seasonalProcess");

		if (seasonalProcess != null) {
			setSeasonalProcess(seasonalProcess);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjOrganizationDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this ncbj organization detail.
	 *
	 * @return the address of this ncbj organization detail
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the company ID of this ncbj organization detail.
	 *
	 * @return the company ID of this ncbj organization detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact person email address of this ncbj organization detail.
	 *
	 * @return the contact person email address of this ncbj organization detail
	 */
	@Override
	public String getContactPersonEmailAddress() {
		return model.getContactPersonEmailAddress();
	}

	/**
	 * Returns the contact person name of this ncbj organization detail.
	 *
	 * @return the contact person name of this ncbj organization detail
	 */
	@Override
	public String getContactPersonName() {
		return model.getContactPersonName();
	}

	/**
	 * Returns the contact person position of this ncbj organization detail.
	 *
	 * @return the contact person position of this ncbj organization detail
	 */
	@Override
	public String getContactPersonPosition() {
		return model.getContactPersonPosition();
	}

	/**
	 * Returns the create date of this ncbj organization detail.
	 *
	 * @return the create date of this ncbj organization detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the critical control points of this ncbj organization detail.
	 *
	 * @return the critical control points of this ncbj organization detail
	 */
	@Override
	public String getCriticalControlPoints() {
		return model.getCriticalControlPoints();
	}

	/**
	 * Returns the determined the scope of this ncbj organization detail.
	 *
	 * @return the determined the scope of this ncbj organization detail
	 */
	@Override
	public String getDeterminedTheScope() {
		return model.getDeterminedTheScope();
	}

	/**
	 * Returns the email address of this ncbj organization detail.
	 *
	 * @return the email address of this ncbj organization detail
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the fax number of this ncbj organization detail.
	 *
	 * @return the fax number of this ncbj organization detail
	 */
	@Override
	public String getFaxNumber() {
		return model.getFaxNumber();
	}

	/**
	 * Returns the group ID of this ncbj organization detail.
	 *
	 * @return the group ID of this ncbj organization detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the haccp studies of this ncbj organization detail.
	 *
	 * @return the haccp studies of this ncbj organization detail
	 */
	@Override
	public String getHaccpStudies() {
		return model.getHaccpStudies();
	}

	/**
	 * Returns the head of organization of this ncbj organization detail.
	 *
	 * @return the head of organization of this ncbj organization detail
	 */
	@Override
	public String getHeadOfOrganization() {
		return model.getHeadOfOrganization();
	}

	/**
	 * Returns the management system of this ncbj organization detail.
	 *
	 * @return the management system of this ncbj organization detail
	 */
	@Override
	public String getManagementSystem() {
		return model.getManagementSystem();
	}

	/**
	 * Returns the management system fo of this ncbj organization detail.
	 *
	 * @return the management system fo of this ncbj organization detail
	 */
	@Override
	public String getManagementSystemFo() {
		return model.getManagementSystemFo();
	}

	/**
	 * Returns the modified date of this ncbj organization detail.
	 *
	 * @return the modified date of this ncbj organization detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of organization of this ncbj organization detail.
	 *
	 * @return the name of organization of this ncbj organization detail
	 */
	@Override
	public String getNameOfOrganization() {
		return model.getNameOfOrganization();
	}

	/**
	 * Returns the ncbj application ID of this ncbj organization detail.
	 *
	 * @return the ncbj application ID of this ncbj organization detail
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj organization detail ID of this ncbj organization detail.
	 *
	 * @return the ncbj organization detail ID of this ncbj organization detail
	 */
	@Override
	public long getNcbjOrganizationDetailId() {
		return model.getNcbjOrganizationDetailId();
	}

	/**
	 * Returns the operational number of this ncbj organization detail.
	 *
	 * @return the operational number of this ncbj organization detail
	 */
	@Override
	public String getOperationalNumber() {
		return model.getOperationalNumber();
	}

	/**
	 * Returns the please stage the scope of this ncbj organization detail.
	 *
	 * @return the please stage the scope of this ncbj organization detail
	 */
	@Override
	public String getPleaseStageTheScope() {
		return model.getPleaseStageTheScope();
	}

	/**
	 * Returns the position of this ncbj organization detail.
	 *
	 * @return the position of this ncbj organization detail
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the position second fo of this ncbj organization detail.
	 *
	 * @return the position second fo of this ncbj organization detail
	 */
	@Override
	public String getPositionSecondFo() {
		return model.getPositionSecondFo();
	}

	/**
	 * Returns the primary key of this ncbj organization detail.
	 *
	 * @return the primary key of this ncbj organization detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the production size of this ncbj organization detail.
	 *
	 * @return the production size of this ncbj organization detail
	 */
	@Override
	public String getProductionSize() {
		return model.getProductionSize();
	}

	/**
	 * Returns the product line of this ncbj organization detail.
	 *
	 * @return the product line of this ncbj organization detail
	 */
	@Override
	public String getProductLine() {
		return model.getProductLine();
	}

	/**
	 * Returns the product types of this ncbj organization detail.
	 *
	 * @return the product types of this ncbj organization detail
	 */
	@Override
	public String getProductTypes() {
		return model.getProductTypes();
	}

	/**
	 * Returns the seasonal process of this ncbj organization detail.
	 *
	 * @return the seasonal process of this ncbj organization detail
	 */
	@Override
	public String getSeasonalProcess() {
		return model.getSeasonalProcess();
	}

	/**
	 * Returns the telephone number of this ncbj organization detail.
	 *
	 * @return the telephone number of this ncbj organization detail
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this ncbj organization detail.
	 *
	 * @return the user ID of this ncbj organization detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj organization detail.
	 *
	 * @return the user name of this ncbj organization detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj organization detail.
	 *
	 * @return the user uuid of this ncbj organization detail
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the warehouse detail size of this ncbj organization detail.
	 *
	 * @return the warehouse detail size of this ncbj organization detail
	 */
	@Override
	public String getWarehouseDetailSize() {
		return model.getWarehouseDetailSize();
	}

	/**
	 * Returns the warehouse size of this ncbj organization detail.
	 *
	 * @return the warehouse size of this ncbj organization detail
	 */
	@Override
	public String getWarehouseSize() {
		return model.getWarehouseSize();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this ncbj organization detail.
	 *
	 * @param address the address of this ncbj organization detail
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the company ID of this ncbj organization detail.
	 *
	 * @param companyId the company ID of this ncbj organization detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact person email address of this ncbj organization detail.
	 *
	 * @param contactPersonEmailAddress  the contact person email address of this ncbj organization detail
	 */
	@Override
	public void setContactPersonEmailAddress(String contactPersonEmailAddress) {
		model.setContactPersonEmailAddress(contactPersonEmailAddress);
	}

	/**
	 * Sets the contact person name of this ncbj organization detail.
	 *
	 * @param contactPersonName the contact person name of this ncbj organization detail
	 */
	@Override
	public void setContactPersonName(String contactPersonName) {
		model.setContactPersonName(contactPersonName);
	}

	/**
	 * Sets the contact person position of this ncbj organization detail.
	 *
	 * @param contactPersonPosition  the contact person position of this ncbj organization detail
	 */
	@Override
	public void setContactPersonPosition(String contactPersonPosition) {
		model.setContactPersonPosition(contactPersonPosition);
	}

	/**
	 * Sets the create date of this ncbj organization detail.
	 *
	 * @param createDate the create date of this ncbj organization detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the critical control points of this ncbj organization detail.
	 *
	 * @param criticalControlPoints the critical control points of this ncbj organization detail
	 */
	@Override
	public void setCriticalControlPoints(String criticalControlPoints) {
		model.setCriticalControlPoints(criticalControlPoints);
	}

	/**
	 * Sets the determined the scope of this ncbj organization detail.
	 *
	 * @param determinedTheScope the determined the scope of this ncbj organization detail
	 */
	@Override
	public void setDeterminedTheScope(String determinedTheScope) {
		model.setDeterminedTheScope(determinedTheScope);
	}

	/**
	 * Sets the email address of this ncbj organization detail.
	 *
	 * @param emailAddress the email address of this ncbj organization detail
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the fax number of this ncbj organization detail.
	 *
	 * @param faxNumber the fax number of this ncbj organization detail
	 */
	@Override
	public void setFaxNumber(String faxNumber) {
		model.setFaxNumber(faxNumber);
	}

	/**
	 * Sets the group ID of this ncbj organization detail.
	 *
	 * @param groupId the group ID of this ncbj organization detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the haccp studies of this ncbj organization detail.
	 *
	 * @param haccpStudies the haccp studies of this ncbj organization detail
	 */
	@Override
	public void setHaccpStudies(String haccpStudies) {
		model.setHaccpStudies(haccpStudies);
	}

	/**
	 * Sets the head of organization of this ncbj organization detail.
	 *
	 * @param headOfOrganization  the head of organization of this ncbj organization detail
	 */
	@Override
	public void setHeadOfOrganization(String headOfOrganization) {
		model.setHeadOfOrganization(headOfOrganization);
	}

	/**
	 * Sets the management system of this ncbj organization detail.
	 *
	 * @param managementSystem the management system of this ncbj organization detail
	 */
	@Override
	public void setManagementSystem(String managementSystem) {
		model.setManagementSystem(managementSystem);
	}

	/**
	 * Sets the management system fo of this ncbj organization detail.
	 *
	 * @param managementSystemFo the management system fo of this ncbj organization detail
	 */
	@Override
	public void setManagementSystemFo(String managementSystemFo) {
		model.setManagementSystemFo(managementSystemFo);
	}

	/**
	 * Sets the modified date of this ncbj organization detail.
	 *
	 * @param modifiedDate the modified date of this ncbj organization detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of organization of this ncbj organization detail.
	 *
	 * @param nameOfOrganization the name of organization of this ncbj organization detail
	 */
	@Override
	public void setNameOfOrganization(String nameOfOrganization) {
		model.setNameOfOrganization(nameOfOrganization);
	}

	/**
	 * Sets the ncbj application ID of this ncbj organization detail.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj organization detail
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj organization detail ID of this ncbj organization detail.
	 *
	 * @param ncbjOrganizationDetailId the ncbj organization detail ID of this ncbj organization detail
	 */
	@Override
	public void setNcbjOrganizationDetailId(long ncbjOrganizationDetailId) {
		model.setNcbjOrganizationDetailId(ncbjOrganizationDetailId);
	}

	/**
	 * Sets the operational number of this ncbj organization detail.
	 *
	 * @param operationalNumber the operational number of this ncbj organization detail
	 */
	@Override
	public void setOperationalNumber(String operationalNumber) {
		model.setOperationalNumber(operationalNumber);
	}

	/**
	 * Sets the please stage the scope of this ncbj organization detail.
	 *
	 * @param pleaseStageTheScope the please stage the scope of this ncbj organization detail
	 */
	@Override
	public void setPleaseStageTheScope(String pleaseStageTheScope) {
		model.setPleaseStageTheScope(pleaseStageTheScope);
	}

	/**
	 * Sets the position of this ncbj organization detail.
	 *
	 * @param position the position of this ncbj organization detail
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the position second fo of this ncbj organization detail.
	 *
	 * @param positionSecondFo the position second fo of this ncbj organization detail
	 */
	@Override
	public void setPositionSecondFo(String positionSecondFo) {
		model.setPositionSecondFo(positionSecondFo);
	}

	/**
	 * Sets the primary key of this ncbj organization detail.
	 *
	 * @param primaryKey the primary key of this ncbj organization detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the production size of this ncbj organization detail.
	 *
	 * @param productionSize the production size of this ncbj organization detail
	 */
	@Override
	public void setProductionSize(String productionSize) {
		model.setProductionSize(productionSize);
	}

	/**
	 * Sets the product line of this ncbj organization detail.
	 *
	 * @param productLine the product line of this ncbj organization detail
	 */
	@Override
	public void setProductLine(String productLine) {
		model.setProductLine(productLine);
	}

	/**
	 * Sets the product types of this ncbj organization detail.
	 *
	 * @param productTypes the product types of this ncbj organization detail
	 */
	@Override
	public void setProductTypes(String productTypes) {
		model.setProductTypes(productTypes);
	}

	/**
	 * Sets the seasonal process of this ncbj organization detail.
	 *
	 * @param seasonalProcess the seasonal process of this ncbj organization detail
	 */
	@Override
	public void setSeasonalProcess(String seasonalProcess) {
		model.setSeasonalProcess(seasonalProcess);
	}

	/**
	 * Sets the telephone number of this ncbj organization detail.
	 *
	 * @param telephoneNumber the telephone number of this ncbj organization detail
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this ncbj organization detail.
	 *
	 * @param userId the user ID of this ncbj organization detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj organization detail.
	 *
	 * @param userName the user name of this ncbj organization detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj organization detail.
	 *
	 * @param userUuid the user uuid of this ncbj organization detail
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the warehouse detail size of this ncbj organization detail.
	 *
	 * @param warehouseDetailSize the warehouse detail size of this ncbj organization detail
	 */
	@Override
	public void setWarehouseDetailSize(String warehouseDetailSize) {
		model.setWarehouseDetailSize(warehouseDetailSize);
	}

	/**
	 * Sets the warehouse size of this ncbj organization detail.
	 *
	 * @param warehouseSize the warehouse size of this ncbj organization detail
	 */
	@Override
	public void setWarehouseSize(String warehouseSize) {
		model.setWarehouseSize(warehouseSize);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected NcbjOrganizationDetailWrapper wrap(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		return new NcbjOrganizationDetailWrapper(ncbjOrganizationDetail);
	}

}