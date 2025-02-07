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
 * This class is a wrapper for {@link OsiServicesTrusteeBreadDownAddinfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeBreadDownAddinfo
 * @generated
 */
public class OsiServicesTrusteeBreadDownAddinfoWrapper
	extends BaseModelWrapper<OsiServicesTrusteeBreadDownAddinfo>
	implements ModelWrapper<OsiServicesTrusteeBreadDownAddinfo>,
			   OsiServicesTrusteeBreadDownAddinfo {

	public OsiServicesTrusteeBreadDownAddinfoWrapper(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		super(osiServicesTrusteeBreadDownAddinfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("osiTrusId", getOsiTrusId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("breakdownWorkingYear", getBreakdownWorkingYear());
		attributes.put("workingBankrupties", getWorkingBankrupties());
		attributes.put("workingProposal", getWorkingProposal());
		attributes.put("workingComBankrupts", getWorkingComBankrupts());
		attributes.put("workingComProposal", getWorkingComProposal());
		attributes.put("workingInterimReceive", getWorkingInterimReceive());
		attributes.put(
			"breakdownWorkingCreditors", getBreakdownWorkingCreditors());
		attributes.put("breakdownWorkingOther", getBreakdownWorkingOther());
		attributes.put("counter", getCounter());
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

		Long osiTrusId = (Long)attributes.get("osiTrusId");

		if (osiTrusId != null) {
			setOsiTrusId(osiTrusId);
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

		String breakdownWorkingYear = (String)attributes.get(
			"breakdownWorkingYear");

		if (breakdownWorkingYear != null) {
			setBreakdownWorkingYear(breakdownWorkingYear);
		}

		String workingBankrupties = (String)attributes.get(
			"workingBankrupties");

		if (workingBankrupties != null) {
			setWorkingBankrupties(workingBankrupties);
		}

		String workingProposal = (String)attributes.get("workingProposal");

		if (workingProposal != null) {
			setWorkingProposal(workingProposal);
		}

		String workingComBankrupts = (String)attributes.get(
			"workingComBankrupts");

		if (workingComBankrupts != null) {
			setWorkingComBankrupts(workingComBankrupts);
		}

		String workingComProposal = (String)attributes.get(
			"workingComProposal");

		if (workingComProposal != null) {
			setWorkingComProposal(workingComProposal);
		}

		String workingInterimReceive = (String)attributes.get(
			"workingInterimReceive");

		if (workingInterimReceive != null) {
			setWorkingInterimReceive(workingInterimReceive);
		}

		String breakdownWorkingCreditors = (String)attributes.get(
			"breakdownWorkingCreditors");

		if (breakdownWorkingCreditors != null) {
			setBreakdownWorkingCreditors(breakdownWorkingCreditors);
		}

		String breakdownWorkingOther = (String)attributes.get(
			"breakdownWorkingOther");

		if (breakdownWorkingOther != null) {
			setBreakdownWorkingOther(breakdownWorkingOther);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OsiServicesTrusteeBreadDownAddinfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the breakdown working creditors of this osi services trustee bread down addinfo.
	 *
	 * @return the breakdown working creditors of this osi services trustee bread down addinfo
	 */
	@Override
	public String getBreakdownWorkingCreditors() {
		return model.getBreakdownWorkingCreditors();
	}

	/**
	 * Returns the breakdown working other of this osi services trustee bread down addinfo.
	 *
	 * @return the breakdown working other of this osi services trustee bread down addinfo
	 */
	@Override
	public String getBreakdownWorkingOther() {
		return model.getBreakdownWorkingOther();
	}

	/**
	 * Returns the breakdown working year of this osi services trustee bread down addinfo.
	 *
	 * @return the breakdown working year of this osi services trustee bread down addinfo
	 */
	@Override
	public String getBreakdownWorkingYear() {
		return model.getBreakdownWorkingYear();
	}

	/**
	 * Returns the company ID of this osi services trustee bread down addinfo.
	 *
	 * @return the company ID of this osi services trustee bread down addinfo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this osi services trustee bread down addinfo.
	 *
	 * @return the counter of this osi services trustee bread down addinfo
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this osi services trustee bread down addinfo.
	 *
	 * @return the create date of this osi services trustee bread down addinfo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi services trustee bread down addinfo.
	 *
	 * @return the group ID of this osi services trustee bread down addinfo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi services trustee bread down addinfo.
	 *
	 * @return the modified date of this osi services trustee bread down addinfo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi services application ID of this osi services trustee bread down addinfo.
	 *
	 * @return the osi services application ID of this osi services trustee bread down addinfo
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the osi trus ID of this osi services trustee bread down addinfo.
	 *
	 * @return the osi trus ID of this osi services trustee bread down addinfo
	 */
	@Override
	public long getOsiTrusId() {
		return model.getOsiTrusId();
	}

	/**
	 * Returns the primary key of this osi services trustee bread down addinfo.
	 *
	 * @return the primary key of this osi services trustee bread down addinfo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services trustee bread down addinfo.
	 *
	 * @return the user ID of this osi services trustee bread down addinfo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services trustee bread down addinfo.
	 *
	 * @return the user name of this osi services trustee bread down addinfo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services trustee bread down addinfo.
	 *
	 * @return the user uuid of this osi services trustee bread down addinfo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this osi services trustee bread down addinfo.
	 *
	 * @return the uuid of this osi services trustee bread down addinfo
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the working bankrupties of this osi services trustee bread down addinfo.
	 *
	 * @return the working bankrupties of this osi services trustee bread down addinfo
	 */
	@Override
	public String getWorkingBankrupties() {
		return model.getWorkingBankrupties();
	}

	/**
	 * Returns the working com bankrupts of this osi services trustee bread down addinfo.
	 *
	 * @return the working com bankrupts of this osi services trustee bread down addinfo
	 */
	@Override
	public String getWorkingComBankrupts() {
		return model.getWorkingComBankrupts();
	}

	/**
	 * Returns the working com proposal of this osi services trustee bread down addinfo.
	 *
	 * @return the working com proposal of this osi services trustee bread down addinfo
	 */
	@Override
	public String getWorkingComProposal() {
		return model.getWorkingComProposal();
	}

	/**
	 * Returns the working interim receive of this osi services trustee bread down addinfo.
	 *
	 * @return the working interim receive of this osi services trustee bread down addinfo
	 */
	@Override
	public String getWorkingInterimReceive() {
		return model.getWorkingInterimReceive();
	}

	/**
	 * Returns the working proposal of this osi services trustee bread down addinfo.
	 *
	 * @return the working proposal of this osi services trustee bread down addinfo
	 */
	@Override
	public String getWorkingProposal() {
		return model.getWorkingProposal();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the breakdown working creditors of this osi services trustee bread down addinfo.
	 *
	 * @param breakdownWorkingCreditors the breakdown working creditors of this osi services trustee bread down addinfo
	 */
	@Override
	public void setBreakdownWorkingCreditors(String breakdownWorkingCreditors) {
		model.setBreakdownWorkingCreditors(breakdownWorkingCreditors);
	}

	/**
	 * Sets the breakdown working other of this osi services trustee bread down addinfo.
	 *
	 * @param breakdownWorkingOther the breakdown working other of this osi services trustee bread down addinfo
	 */
	@Override
	public void setBreakdownWorkingOther(String breakdownWorkingOther) {
		model.setBreakdownWorkingOther(breakdownWorkingOther);
	}

	/**
	 * Sets the breakdown working year of this osi services trustee bread down addinfo.
	 *
	 * @param breakdownWorkingYear the breakdown working year of this osi services trustee bread down addinfo
	 */
	@Override
	public void setBreakdownWorkingYear(String breakdownWorkingYear) {
		model.setBreakdownWorkingYear(breakdownWorkingYear);
	}

	/**
	 * Sets the company ID of this osi services trustee bread down addinfo.
	 *
	 * @param companyId the company ID of this osi services trustee bread down addinfo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this osi services trustee bread down addinfo.
	 *
	 * @param counter the counter of this osi services trustee bread down addinfo
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this osi services trustee bread down addinfo.
	 *
	 * @param createDate the create date of this osi services trustee bread down addinfo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi services trustee bread down addinfo.
	 *
	 * @param groupId the group ID of this osi services trustee bread down addinfo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi services trustee bread down addinfo.
	 *
	 * @param modifiedDate the modified date of this osi services trustee bread down addinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi services application ID of this osi services trustee bread down addinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services trustee bread down addinfo
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the osi trus ID of this osi services trustee bread down addinfo.
	 *
	 * @param osiTrusId the osi trus ID of this osi services trustee bread down addinfo
	 */
	@Override
	public void setOsiTrusId(long osiTrusId) {
		model.setOsiTrusId(osiTrusId);
	}

	/**
	 * Sets the primary key of this osi services trustee bread down addinfo.
	 *
	 * @param primaryKey the primary key of this osi services trustee bread down addinfo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services trustee bread down addinfo.
	 *
	 * @param userId the user ID of this osi services trustee bread down addinfo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services trustee bread down addinfo.
	 *
	 * @param userName the user name of this osi services trustee bread down addinfo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services trustee bread down addinfo.
	 *
	 * @param userUuid the user uuid of this osi services trustee bread down addinfo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this osi services trustee bread down addinfo.
	 *
	 * @param uuid the uuid of this osi services trustee bread down addinfo
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the working bankrupties of this osi services trustee bread down addinfo.
	 *
	 * @param workingBankrupties the working bankrupties of this osi services trustee bread down addinfo
	 */
	@Override
	public void setWorkingBankrupties(String workingBankrupties) {
		model.setWorkingBankrupties(workingBankrupties);
	}

	/**
	 * Sets the working com bankrupts of this osi services trustee bread down addinfo.
	 *
	 * @param workingComBankrupts the working com bankrupts of this osi services trustee bread down addinfo
	 */
	@Override
	public void setWorkingComBankrupts(String workingComBankrupts) {
		model.setWorkingComBankrupts(workingComBankrupts);
	}

	/**
	 * Sets the working com proposal of this osi services trustee bread down addinfo.
	 *
	 * @param workingComProposal the working com proposal of this osi services trustee bread down addinfo
	 */
	@Override
	public void setWorkingComProposal(String workingComProposal) {
		model.setWorkingComProposal(workingComProposal);
	}

	/**
	 * Sets the working interim receive of this osi services trustee bread down addinfo.
	 *
	 * @param workingInterimReceive the working interim receive of this osi services trustee bread down addinfo
	 */
	@Override
	public void setWorkingInterimReceive(String workingInterimReceive) {
		model.setWorkingInterimReceive(workingInterimReceive);
	}

	/**
	 * Sets the working proposal of this osi services trustee bread down addinfo.
	 *
	 * @param workingProposal the working proposal of this osi services trustee bread down addinfo
	 */
	@Override
	public void setWorkingProposal(String workingProposal) {
		model.setWorkingProposal(workingProposal);
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
	protected OsiServicesTrusteeBreadDownAddinfoWrapper wrap(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		return new OsiServicesTrusteeBreadDownAddinfoWrapper(
			osiServicesTrusteeBreadDownAddinfo);
	}

}