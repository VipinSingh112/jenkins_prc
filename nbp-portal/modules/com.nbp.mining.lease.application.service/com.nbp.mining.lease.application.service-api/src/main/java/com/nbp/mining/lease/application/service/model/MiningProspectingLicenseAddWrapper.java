/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiningProspectingLicenseAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseAdd
 * @generated
 */
public class MiningProspectingLicenseAddWrapper
	extends BaseModelWrapper<MiningProspectingLicenseAdd>
	implements MiningProspectingLicenseAdd,
			   ModelWrapper<MiningProspectingLicenseAdd> {

	public MiningProspectingLicenseAddWrapper(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		super(miningProspectingLicenseAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"miningProspectingLicenseAddId",
			getMiningProspectingLicenseAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("nationality", getNationality());
		attributes.put("directorsOfCompany", getDirectorsOfCompany());
		attributes.put("counter", getCounter());
		attributes.put(
			"miningLeaseApplicationId", getMiningLeaseApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miningProspectingLicenseAddId = (Long)attributes.get(
			"miningProspectingLicenseAddId");

		if (miningProspectingLicenseAddId != null) {
			setMiningProspectingLicenseAddId(miningProspectingLicenseAddId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		String directorsOfCompany = (String)attributes.get(
			"directorsOfCompany");

		if (directorsOfCompany != null) {
			setDirectorsOfCompany(directorsOfCompany);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long miningLeaseApplicationId = (Long)attributes.get(
			"miningLeaseApplicationId");

		if (miningLeaseApplicationId != null) {
			setMiningLeaseApplicationId(miningLeaseApplicationId);
		}
	}

	@Override
	public MiningProspectingLicenseAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this mining prospecting license add.
	 *
	 * @return the company ID of this mining prospecting license add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this mining prospecting license add.
	 *
	 * @return the counter of this mining prospecting license add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this mining prospecting license add.
	 *
	 * @return the create date of this mining prospecting license add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the directors of company of this mining prospecting license add.
	 *
	 * @return the directors of company of this mining prospecting license add
	 */
	@Override
	public String getDirectorsOfCompany() {
		return model.getDirectorsOfCompany();
	}

	/**
	 * Returns the group ID of this mining prospecting license add.
	 *
	 * @return the group ID of this mining prospecting license add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mining lease application ID of this mining prospecting license add.
	 *
	 * @return the mining lease application ID of this mining prospecting license add
	 */
	@Override
	public long getMiningLeaseApplicationId() {
		return model.getMiningLeaseApplicationId();
	}

	/**
	 * Returns the mining prospecting license add ID of this mining prospecting license add.
	 *
	 * @return the mining prospecting license add ID of this mining prospecting license add
	 */
	@Override
	public long getMiningProspectingLicenseAddId() {
		return model.getMiningProspectingLicenseAddId();
	}

	/**
	 * Returns the modified date of this mining prospecting license add.
	 *
	 * @return the modified date of this mining prospecting license add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this mining prospecting license add.
	 *
	 * @return the name of this mining prospecting license add
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the nationality of this mining prospecting license add.
	 *
	 * @return the nationality of this mining prospecting license add
	 */
	@Override
	public String getNationality() {
		return model.getNationality();
	}

	/**
	 * Returns the primary key of this mining prospecting license add.
	 *
	 * @return the primary key of this mining prospecting license add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this mining prospecting license add.
	 *
	 * @return the user ID of this mining prospecting license add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining prospecting license add.
	 *
	 * @return the user name of this mining prospecting license add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining prospecting license add.
	 *
	 * @return the user uuid of this mining prospecting license add
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
	 * Sets the company ID of this mining prospecting license add.
	 *
	 * @param companyId the company ID of this mining prospecting license add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this mining prospecting license add.
	 *
	 * @param counter the counter of this mining prospecting license add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this mining prospecting license add.
	 *
	 * @param createDate the create date of this mining prospecting license add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the directors of company of this mining prospecting license add.
	 *
	 * @param directorsOfCompany the directors of company of this mining prospecting license add
	 */
	@Override
	public void setDirectorsOfCompany(String directorsOfCompany) {
		model.setDirectorsOfCompany(directorsOfCompany);
	}

	/**
	 * Sets the group ID of this mining prospecting license add.
	 *
	 * @param groupId the group ID of this mining prospecting license add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mining lease application ID of this mining prospecting license add.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID of this mining prospecting license add
	 */
	@Override
	public void setMiningLeaseApplicationId(long miningLeaseApplicationId) {
		model.setMiningLeaseApplicationId(miningLeaseApplicationId);
	}

	/**
	 * Sets the mining prospecting license add ID of this mining prospecting license add.
	 *
	 * @param miningProspectingLicenseAddId the mining prospecting license add ID of this mining prospecting license add
	 */
	@Override
	public void setMiningProspectingLicenseAddId(
		long miningProspectingLicenseAddId) {

		model.setMiningProspectingLicenseAddId(miningProspectingLicenseAddId);
	}

	/**
	 * Sets the modified date of this mining prospecting license add.
	 *
	 * @param modifiedDate the modified date of this mining prospecting license add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this mining prospecting license add.
	 *
	 * @param name the name of this mining prospecting license add
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the nationality of this mining prospecting license add.
	 *
	 * @param nationality the nationality of this mining prospecting license add
	 */
	@Override
	public void setNationality(String nationality) {
		model.setNationality(nationality);
	}

	/**
	 * Sets the primary key of this mining prospecting license add.
	 *
	 * @param primaryKey the primary key of this mining prospecting license add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this mining prospecting license add.
	 *
	 * @param userId the user ID of this mining prospecting license add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining prospecting license add.
	 *
	 * @param userName the user name of this mining prospecting license add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining prospecting license add.
	 *
	 * @param userUuid the user uuid of this mining prospecting license add
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
	protected MiningProspectingLicenseAddWrapper wrap(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return new MiningProspectingLicenseAddWrapper(
			miningProspectingLicenseAdd);
	}

}