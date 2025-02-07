/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireLandEmployment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandEmployment
 * @generated
 */
public class AcquireLandEmploymentWrapper
	extends BaseModelWrapper<AcquireLandEmployment>
	implements AcquireLandEmployment, ModelWrapper<AcquireLandEmployment> {

	public AcquireLandEmploymentWrapper(
		AcquireLandEmployment acquireLandEmployment) {

		super(acquireLandEmployment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireLandEmploymentId", getAcquireLandEmploymentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("landEmploymentStatus", getLandEmploymentStatus());
		attributes.put(
			"landEmpJamaicaGovEmplyee", getLandEmpJamaicaGovEmplyee());
		attributes.put("landEmpCompanyName", getLandEmpCompanyName());
		attributes.put("landEmploymentJobTitle", getLandEmploymentJobTitle());
		attributes.put("landEmpCompanyAddr", getLandEmpCompanyAddr());
		attributes.put("landEmpTeleNum", getLandEmpTeleNum());
		attributes.put("landEmpGrossSalaryType", getLandEmpGrossSalaryType());
		attributes.put("landEmpGrossSalary", getLandEmpGrossSalary());
		attributes.put(
			"landEmpOtherIncomeSource", getLandEmpOtherIncomeSource());
		attributes.put("landEmpOtherSalaryType", getLandEmpOtherSalaryType());
		attributes.put(
			"landEmpOtherIncomeAmount", getLandEmpOtherIncomeAmount());
		attributes.put(
			"landEmpFinancialSupportPerson",
			getLandEmpFinancialSupportPerson());
		attributes.put("acquireApplicationId", getAcquireApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireLandEmploymentId = (Long)attributes.get(
			"acquireLandEmploymentId");

		if (acquireLandEmploymentId != null) {
			setAcquireLandEmploymentId(acquireLandEmploymentId);
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

		String landEmploymentStatus = (String)attributes.get(
			"landEmploymentStatus");

		if (landEmploymentStatus != null) {
			setLandEmploymentStatus(landEmploymentStatus);
		}

		String landEmpJamaicaGovEmplyee = (String)attributes.get(
			"landEmpJamaicaGovEmplyee");

		if (landEmpJamaicaGovEmplyee != null) {
			setLandEmpJamaicaGovEmplyee(landEmpJamaicaGovEmplyee);
		}

		String landEmpCompanyName = (String)attributes.get(
			"landEmpCompanyName");

		if (landEmpCompanyName != null) {
			setLandEmpCompanyName(landEmpCompanyName);
		}

		String landEmploymentJobTitle = (String)attributes.get(
			"landEmploymentJobTitle");

		if (landEmploymentJobTitle != null) {
			setLandEmploymentJobTitle(landEmploymentJobTitle);
		}

		String landEmpCompanyAddr = (String)attributes.get(
			"landEmpCompanyAddr");

		if (landEmpCompanyAddr != null) {
			setLandEmpCompanyAddr(landEmpCompanyAddr);
		}

		String landEmpTeleNum = (String)attributes.get("landEmpTeleNum");

		if (landEmpTeleNum != null) {
			setLandEmpTeleNum(landEmpTeleNum);
		}

		String landEmpGrossSalaryType = (String)attributes.get(
			"landEmpGrossSalaryType");

		if (landEmpGrossSalaryType != null) {
			setLandEmpGrossSalaryType(landEmpGrossSalaryType);
		}

		String landEmpGrossSalary = (String)attributes.get(
			"landEmpGrossSalary");

		if (landEmpGrossSalary != null) {
			setLandEmpGrossSalary(landEmpGrossSalary);
		}

		String landEmpOtherIncomeSource = (String)attributes.get(
			"landEmpOtherIncomeSource");

		if (landEmpOtherIncomeSource != null) {
			setLandEmpOtherIncomeSource(landEmpOtherIncomeSource);
		}

		String landEmpOtherSalaryType = (String)attributes.get(
			"landEmpOtherSalaryType");

		if (landEmpOtherSalaryType != null) {
			setLandEmpOtherSalaryType(landEmpOtherSalaryType);
		}

		String landEmpOtherIncomeAmount = (String)attributes.get(
			"landEmpOtherIncomeAmount");

		if (landEmpOtherIncomeAmount != null) {
			setLandEmpOtherIncomeAmount(landEmpOtherIncomeAmount);
		}

		String landEmpFinancialSupportPerson = (String)attributes.get(
			"landEmpFinancialSupportPerson");

		if (landEmpFinancialSupportPerson != null) {
			setLandEmpFinancialSupportPerson(landEmpFinancialSupportPerson);
		}

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
		}
	}

	@Override
	public AcquireLandEmployment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application ID of this acquire land employment.
	 *
	 * @return the acquire application ID of this acquire land employment
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the acquire land employment ID of this acquire land employment.
	 *
	 * @return the acquire land employment ID of this acquire land employment
	 */
	@Override
	public long getAcquireLandEmploymentId() {
		return model.getAcquireLandEmploymentId();
	}

	/**
	 * Returns the company ID of this acquire land employment.
	 *
	 * @return the company ID of this acquire land employment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire land employment.
	 *
	 * @return the create date of this acquire land employment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acquire land employment.
	 *
	 * @return the group ID of this acquire land employment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the land emp company addr of this acquire land employment.
	 *
	 * @return the land emp company addr of this acquire land employment
	 */
	@Override
	public String getLandEmpCompanyAddr() {
		return model.getLandEmpCompanyAddr();
	}

	/**
	 * Returns the land emp company name of this acquire land employment.
	 *
	 * @return the land emp company name of this acquire land employment
	 */
	@Override
	public String getLandEmpCompanyName() {
		return model.getLandEmpCompanyName();
	}

	/**
	 * Returns the land emp financial support person of this acquire land employment.
	 *
	 * @return the land emp financial support person of this acquire land employment
	 */
	@Override
	public String getLandEmpFinancialSupportPerson() {
		return model.getLandEmpFinancialSupportPerson();
	}

	/**
	 * Returns the land emp gross salary of this acquire land employment.
	 *
	 * @return the land emp gross salary of this acquire land employment
	 */
	@Override
	public String getLandEmpGrossSalary() {
		return model.getLandEmpGrossSalary();
	}

	/**
	 * Returns the land emp gross salary type of this acquire land employment.
	 *
	 * @return the land emp gross salary type of this acquire land employment
	 */
	@Override
	public String getLandEmpGrossSalaryType() {
		return model.getLandEmpGrossSalaryType();
	}

	/**
	 * Returns the land emp jamaica gov emplyee of this acquire land employment.
	 *
	 * @return the land emp jamaica gov emplyee of this acquire land employment
	 */
	@Override
	public String getLandEmpJamaicaGovEmplyee() {
		return model.getLandEmpJamaicaGovEmplyee();
	}

	/**
	 * Returns the land employment job title of this acquire land employment.
	 *
	 * @return the land employment job title of this acquire land employment
	 */
	@Override
	public String getLandEmploymentJobTitle() {
		return model.getLandEmploymentJobTitle();
	}

	/**
	 * Returns the land employment status of this acquire land employment.
	 *
	 * @return the land employment status of this acquire land employment
	 */
	@Override
	public String getLandEmploymentStatus() {
		return model.getLandEmploymentStatus();
	}

	/**
	 * Returns the land emp other income amount of this acquire land employment.
	 *
	 * @return the land emp other income amount of this acquire land employment
	 */
	@Override
	public String getLandEmpOtherIncomeAmount() {
		return model.getLandEmpOtherIncomeAmount();
	}

	/**
	 * Returns the land emp other income source of this acquire land employment.
	 *
	 * @return the land emp other income source of this acquire land employment
	 */
	@Override
	public String getLandEmpOtherIncomeSource() {
		return model.getLandEmpOtherIncomeSource();
	}

	/**
	 * Returns the land emp other salary type of this acquire land employment.
	 *
	 * @return the land emp other salary type of this acquire land employment
	 */
	@Override
	public String getLandEmpOtherSalaryType() {
		return model.getLandEmpOtherSalaryType();
	}

	/**
	 * Returns the land emp tele num of this acquire land employment.
	 *
	 * @return the land emp tele num of this acquire land employment
	 */
	@Override
	public String getLandEmpTeleNum() {
		return model.getLandEmpTeleNum();
	}

	/**
	 * Returns the modified date of this acquire land employment.
	 *
	 * @return the modified date of this acquire land employment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire land employment.
	 *
	 * @return the primary key of this acquire land employment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire land employment.
	 *
	 * @return the user ID of this acquire land employment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire land employment.
	 *
	 * @return the user name of this acquire land employment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire land employment.
	 *
	 * @return the user uuid of this acquire land employment
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
	 * Sets the acquire application ID of this acquire land employment.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire land employment
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the acquire land employment ID of this acquire land employment.
	 *
	 * @param acquireLandEmploymentId the acquire land employment ID of this acquire land employment
	 */
	@Override
	public void setAcquireLandEmploymentId(long acquireLandEmploymentId) {
		model.setAcquireLandEmploymentId(acquireLandEmploymentId);
	}

	/**
	 * Sets the company ID of this acquire land employment.
	 *
	 * @param companyId the company ID of this acquire land employment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire land employment.
	 *
	 * @param createDate the create date of this acquire land employment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acquire land employment.
	 *
	 * @param groupId the group ID of this acquire land employment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the land emp company addr of this acquire land employment.
	 *
	 * @param landEmpCompanyAddr the land emp company addr of this acquire land employment
	 */
	@Override
	public void setLandEmpCompanyAddr(String landEmpCompanyAddr) {
		model.setLandEmpCompanyAddr(landEmpCompanyAddr);
	}

	/**
	 * Sets the land emp company name of this acquire land employment.
	 *
	 * @param landEmpCompanyName the land emp company name of this acquire land employment
	 */
	@Override
	public void setLandEmpCompanyName(String landEmpCompanyName) {
		model.setLandEmpCompanyName(landEmpCompanyName);
	}

	/**
	 * Sets the land emp financial support person of this acquire land employment.
	 *
	 * @param landEmpFinancialSupportPerson the land emp financial support person of this acquire land employment
	 */
	@Override
	public void setLandEmpFinancialSupportPerson(
		String landEmpFinancialSupportPerson) {

		model.setLandEmpFinancialSupportPerson(landEmpFinancialSupportPerson);
	}

	/**
	 * Sets the land emp gross salary of this acquire land employment.
	 *
	 * @param landEmpGrossSalary the land emp gross salary of this acquire land employment
	 */
	@Override
	public void setLandEmpGrossSalary(String landEmpGrossSalary) {
		model.setLandEmpGrossSalary(landEmpGrossSalary);
	}

	/**
	 * Sets the land emp gross salary type of this acquire land employment.
	 *
	 * @param landEmpGrossSalaryType the land emp gross salary type of this acquire land employment
	 */
	@Override
	public void setLandEmpGrossSalaryType(String landEmpGrossSalaryType) {
		model.setLandEmpGrossSalaryType(landEmpGrossSalaryType);
	}

	/**
	 * Sets the land emp jamaica gov emplyee of this acquire land employment.
	 *
	 * @param landEmpJamaicaGovEmplyee the land emp jamaica gov emplyee of this acquire land employment
	 */
	@Override
	public void setLandEmpJamaicaGovEmplyee(String landEmpJamaicaGovEmplyee) {
		model.setLandEmpJamaicaGovEmplyee(landEmpJamaicaGovEmplyee);
	}

	/**
	 * Sets the land employment job title of this acquire land employment.
	 *
	 * @param landEmploymentJobTitle the land employment job title of this acquire land employment
	 */
	@Override
	public void setLandEmploymentJobTitle(String landEmploymentJobTitle) {
		model.setLandEmploymentJobTitle(landEmploymentJobTitle);
	}

	/**
	 * Sets the land employment status of this acquire land employment.
	 *
	 * @param landEmploymentStatus the land employment status of this acquire land employment
	 */
	@Override
	public void setLandEmploymentStatus(String landEmploymentStatus) {
		model.setLandEmploymentStatus(landEmploymentStatus);
	}

	/**
	 * Sets the land emp other income amount of this acquire land employment.
	 *
	 * @param landEmpOtherIncomeAmount the land emp other income amount of this acquire land employment
	 */
	@Override
	public void setLandEmpOtherIncomeAmount(String landEmpOtherIncomeAmount) {
		model.setLandEmpOtherIncomeAmount(landEmpOtherIncomeAmount);
	}

	/**
	 * Sets the land emp other income source of this acquire land employment.
	 *
	 * @param landEmpOtherIncomeSource the land emp other income source of this acquire land employment
	 */
	@Override
	public void setLandEmpOtherIncomeSource(String landEmpOtherIncomeSource) {
		model.setLandEmpOtherIncomeSource(landEmpOtherIncomeSource);
	}

	/**
	 * Sets the land emp other salary type of this acquire land employment.
	 *
	 * @param landEmpOtherSalaryType the land emp other salary type of this acquire land employment
	 */
	@Override
	public void setLandEmpOtherSalaryType(String landEmpOtherSalaryType) {
		model.setLandEmpOtherSalaryType(landEmpOtherSalaryType);
	}

	/**
	 * Sets the land emp tele num of this acquire land employment.
	 *
	 * @param landEmpTeleNum the land emp tele num of this acquire land employment
	 */
	@Override
	public void setLandEmpTeleNum(String landEmpTeleNum) {
		model.setLandEmpTeleNum(landEmpTeleNum);
	}

	/**
	 * Sets the modified date of this acquire land employment.
	 *
	 * @param modifiedDate the modified date of this acquire land employment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire land employment.
	 *
	 * @param primaryKey the primary key of this acquire land employment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire land employment.
	 *
	 * @param userId the user ID of this acquire land employment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire land employment.
	 *
	 * @param userName the user name of this acquire land employment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire land employment.
	 *
	 * @param userUuid the user uuid of this acquire land employment
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
	protected AcquireLandEmploymentWrapper wrap(
		AcquireLandEmployment acquireLandEmployment) {

		return new AcquireLandEmploymentWrapper(acquireLandEmployment);
	}

}