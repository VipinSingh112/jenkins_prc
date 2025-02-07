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
 * This class is a wrapper for {@link NcbjSectionDetailAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAdd
 * @generated
 */
public class NcbjSectionDetailAddWrapper
	extends BaseModelWrapper<NcbjSectionDetailAdd>
	implements ModelWrapper<NcbjSectionDetailAdd>, NcbjSectionDetailAdd {

	public NcbjSectionDetailAddWrapper(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		super(ncbjSectionDetailAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjSectionDetailAddId", getNcbjSectionDetailAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addDetails", getAddDetails());
		attributes.put("addNumHaccp", getAddNumHaccp());
		attributes.put("addTypeHaccp", getAddTypeHaccp());
		attributes.put("addHazard", getAddHazard());
		attributes.put("addConsentLic", getAddConsentLic());
		attributes.put("counter", getCounter());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjSectionDetailAddId = (Long)attributes.get(
			"ncbjSectionDetailAddId");

		if (ncbjSectionDetailAddId != null) {
			setNcbjSectionDetailAddId(ncbjSectionDetailAddId);
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

		String addDetails = (String)attributes.get("addDetails");

		if (addDetails != null) {
			setAddDetails(addDetails);
		}

		String addNumHaccp = (String)attributes.get("addNumHaccp");

		if (addNumHaccp != null) {
			setAddNumHaccp(addNumHaccp);
		}

		String addTypeHaccp = (String)attributes.get("addTypeHaccp");

		if (addTypeHaccp != null) {
			setAddTypeHaccp(addTypeHaccp);
		}

		String addHazard = (String)attributes.get("addHazard");

		if (addHazard != null) {
			setAddHazard(addHazard);
		}

		String addConsentLic = (String)attributes.get("addConsentLic");

		if (addConsentLic != null) {
			setAddConsentLic(addConsentLic);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjSectionDetailAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add consent lic of this ncbj section detail add.
	 *
	 * @return the add consent lic of this ncbj section detail add
	 */
	@Override
	public String getAddConsentLic() {
		return model.getAddConsentLic();
	}

	/**
	 * Returns the add details of this ncbj section detail add.
	 *
	 * @return the add details of this ncbj section detail add
	 */
	@Override
	public String getAddDetails() {
		return model.getAddDetails();
	}

	/**
	 * Returns the add hazard of this ncbj section detail add.
	 *
	 * @return the add hazard of this ncbj section detail add
	 */
	@Override
	public String getAddHazard() {
		return model.getAddHazard();
	}

	/**
	 * Returns the add num haccp of this ncbj section detail add.
	 *
	 * @return the add num haccp of this ncbj section detail add
	 */
	@Override
	public String getAddNumHaccp() {
		return model.getAddNumHaccp();
	}

	/**
	 * Returns the add type haccp of this ncbj section detail add.
	 *
	 * @return the add type haccp of this ncbj section detail add
	 */
	@Override
	public String getAddTypeHaccp() {
		return model.getAddTypeHaccp();
	}

	/**
	 * Returns the company ID of this ncbj section detail add.
	 *
	 * @return the company ID of this ncbj section detail add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this ncbj section detail add.
	 *
	 * @return the counter of this ncbj section detail add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this ncbj section detail add.
	 *
	 * @return the create date of this ncbj section detail add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj section detail add.
	 *
	 * @return the group ID of this ncbj section detail add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj section detail add.
	 *
	 * @return the modified date of this ncbj section detail add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj section detail add.
	 *
	 * @return the ncbj application ID of this ncbj section detail add
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj section detail add ID of this ncbj section detail add.
	 *
	 * @return the ncbj section detail add ID of this ncbj section detail add
	 */
	@Override
	public long getNcbjSectionDetailAddId() {
		return model.getNcbjSectionDetailAddId();
	}

	/**
	 * Returns the primary key of this ncbj section detail add.
	 *
	 * @return the primary key of this ncbj section detail add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncbj section detail add.
	 *
	 * @return the user ID of this ncbj section detail add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj section detail add.
	 *
	 * @return the user name of this ncbj section detail add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj section detail add.
	 *
	 * @return the user uuid of this ncbj section detail add
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
	 * Sets the add consent lic of this ncbj section detail add.
	 *
	 * @param addConsentLic the add consent lic of this ncbj section detail add
	 */
	@Override
	public void setAddConsentLic(String addConsentLic) {
		model.setAddConsentLic(addConsentLic);
	}

	/**
	 * Sets the add details of this ncbj section detail add.
	 *
	 * @param addDetails the add details of this ncbj section detail add
	 */
	@Override
	public void setAddDetails(String addDetails) {
		model.setAddDetails(addDetails);
	}

	/**
	 * Sets the add hazard of this ncbj section detail add.
	 *
	 * @param addHazard the add hazard of this ncbj section detail add
	 */
	@Override
	public void setAddHazard(String addHazard) {
		model.setAddHazard(addHazard);
	}

	/**
	 * Sets the add num haccp of this ncbj section detail add.
	 *
	 * @param addNumHaccp the add num haccp of this ncbj section detail add
	 */
	@Override
	public void setAddNumHaccp(String addNumHaccp) {
		model.setAddNumHaccp(addNumHaccp);
	}

	/**
	 * Sets the add type haccp of this ncbj section detail add.
	 *
	 * @param addTypeHaccp the add type haccp of this ncbj section detail add
	 */
	@Override
	public void setAddTypeHaccp(String addTypeHaccp) {
		model.setAddTypeHaccp(addTypeHaccp);
	}

	/**
	 * Sets the company ID of this ncbj section detail add.
	 *
	 * @param companyId the company ID of this ncbj section detail add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this ncbj section detail add.
	 *
	 * @param counter the counter of this ncbj section detail add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this ncbj section detail add.
	 *
	 * @param createDate the create date of this ncbj section detail add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj section detail add.
	 *
	 * @param groupId the group ID of this ncbj section detail add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj section detail add.
	 *
	 * @param modifiedDate the modified date of this ncbj section detail add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj section detail add.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj section detail add
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj section detail add ID of this ncbj section detail add.
	 *
	 * @param ncbjSectionDetailAddId the ncbj section detail add ID of this ncbj section detail add
	 */
	@Override
	public void setNcbjSectionDetailAddId(long ncbjSectionDetailAddId) {
		model.setNcbjSectionDetailAddId(ncbjSectionDetailAddId);
	}

	/**
	 * Sets the primary key of this ncbj section detail add.
	 *
	 * @param primaryKey the primary key of this ncbj section detail add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncbj section detail add.
	 *
	 * @param userId the user ID of this ncbj section detail add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj section detail add.
	 *
	 * @param userName the user name of this ncbj section detail add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj section detail add.
	 *
	 * @param userUuid the user uuid of this ncbj section detail add
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
	protected NcbjSectionDetailAddWrapper wrap(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		return new NcbjSectionDetailAddWrapper(ncbjSectionDetailAdd);
	}

}