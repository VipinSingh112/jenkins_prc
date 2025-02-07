/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AlternateRsoOneAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoOneAdd
 * @generated
 */
public class AlternateRsoOneAddWrapper
	extends BaseModelWrapper<AlternateRsoOneAdd>
	implements AlternateRsoOneAdd, ModelWrapper<AlternateRsoOneAdd> {

	public AlternateRsoOneAddWrapper(AlternateRsoOneAdd alternateRsoOneAdd) {
		super(alternateRsoOneAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("alternateRsoOneAddId", getAlternateRsoOneAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("alternateRsoOneName", getAlternateRsoOneName());
		attributes.put("alternateRsoOneTitle", getAlternateRsoOneTitle());
		attributes.put(
			"alternateRsoOneTelephone", getAlternateRsoOneTelephone());
		attributes.put("alternateRsoOneExt", getAlternateRsoOneExt());
		attributes.put("alternateRsoOneFax", getAlternateRsoOneFax());
		attributes.put("alternateRsoOneEmailAdd", getAlternateRsoOneEmailAdd());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long alternateRsoOneAddId = (Long)attributes.get(
			"alternateRsoOneAddId");

		if (alternateRsoOneAddId != null) {
			setAlternateRsoOneAddId(alternateRsoOneAddId);
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

		String alternateRsoOneName = (String)attributes.get(
			"alternateRsoOneName");

		if (alternateRsoOneName != null) {
			setAlternateRsoOneName(alternateRsoOneName);
		}

		String alternateRsoOneTitle = (String)attributes.get(
			"alternateRsoOneTitle");

		if (alternateRsoOneTitle != null) {
			setAlternateRsoOneTitle(alternateRsoOneTitle);
		}

		String alternateRsoOneTelephone = (String)attributes.get(
			"alternateRsoOneTelephone");

		if (alternateRsoOneTelephone != null) {
			setAlternateRsoOneTelephone(alternateRsoOneTelephone);
		}

		String alternateRsoOneExt = (String)attributes.get(
			"alternateRsoOneExt");

		if (alternateRsoOneExt != null) {
			setAlternateRsoOneExt(alternateRsoOneExt);
		}

		String alternateRsoOneFax = (String)attributes.get(
			"alternateRsoOneFax");

		if (alternateRsoOneFax != null) {
			setAlternateRsoOneFax(alternateRsoOneFax);
		}

		String alternateRsoOneEmailAdd = (String)attributes.get(
			"alternateRsoOneEmailAdd");

		if (alternateRsoOneEmailAdd != null) {
			setAlternateRsoOneEmailAdd(alternateRsoOneEmailAdd);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public AlternateRsoOneAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the alternate rso one add ID of this alternate rso one add.
	 *
	 * @return the alternate rso one add ID of this alternate rso one add
	 */
	@Override
	public long getAlternateRsoOneAddId() {
		return model.getAlternateRsoOneAddId();
	}

	/**
	 * Returns the alternate rso one email add of this alternate rso one add.
	 *
	 * @return the alternate rso one email add of this alternate rso one add
	 */
	@Override
	public String getAlternateRsoOneEmailAdd() {
		return model.getAlternateRsoOneEmailAdd();
	}

	/**
	 * Returns the alternate rso one ext of this alternate rso one add.
	 *
	 * @return the alternate rso one ext of this alternate rso one add
	 */
	@Override
	public String getAlternateRsoOneExt() {
		return model.getAlternateRsoOneExt();
	}

	/**
	 * Returns the alternate rso one fax of this alternate rso one add.
	 *
	 * @return the alternate rso one fax of this alternate rso one add
	 */
	@Override
	public String getAlternateRsoOneFax() {
		return model.getAlternateRsoOneFax();
	}

	/**
	 * Returns the alternate rso one name of this alternate rso one add.
	 *
	 * @return the alternate rso one name of this alternate rso one add
	 */
	@Override
	public String getAlternateRsoOneName() {
		return model.getAlternateRsoOneName();
	}

	/**
	 * Returns the alternate rso one telephone of this alternate rso one add.
	 *
	 * @return the alternate rso one telephone of this alternate rso one add
	 */
	@Override
	public String getAlternateRsoOneTelephone() {
		return model.getAlternateRsoOneTelephone();
	}

	/**
	 * Returns the alternate rso one title of this alternate rso one add.
	 *
	 * @return the alternate rso one title of this alternate rso one add
	 */
	@Override
	public String getAlternateRsoOneTitle() {
		return model.getAlternateRsoOneTitle();
	}

	/**
	 * Returns the company ID of this alternate rso one add.
	 *
	 * @return the company ID of this alternate rso one add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this alternate rso one add.
	 *
	 * @return the counter of this alternate rso one add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this alternate rso one add.
	 *
	 * @return the create date of this alternate rso one add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this alternate rso one add.
	 *
	 * @return the group ID of this alternate rso one add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this alternate rso one add.
	 *
	 * @return the hsra application ID of this alternate rso one add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this alternate rso one add.
	 *
	 * @return the modified date of this alternate rso one add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this alternate rso one add.
	 *
	 * @return the primary key of this alternate rso one add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this alternate rso one add.
	 *
	 * @return the user ID of this alternate rso one add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this alternate rso one add.
	 *
	 * @return the user name of this alternate rso one add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this alternate rso one add.
	 *
	 * @return the user uuid of this alternate rso one add
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
	 * Sets the alternate rso one add ID of this alternate rso one add.
	 *
	 * @param alternateRsoOneAddId the alternate rso one add ID of this alternate rso one add
	 */
	@Override
	public void setAlternateRsoOneAddId(long alternateRsoOneAddId) {
		model.setAlternateRsoOneAddId(alternateRsoOneAddId);
	}

	/**
	 * Sets the alternate rso one email add of this alternate rso one add.
	 *
	 * @param alternateRsoOneEmailAdd the alternate rso one email add of this alternate rso one add
	 */
	@Override
	public void setAlternateRsoOneEmailAdd(String alternateRsoOneEmailAdd) {
		model.setAlternateRsoOneEmailAdd(alternateRsoOneEmailAdd);
	}

	/**
	 * Sets the alternate rso one ext of this alternate rso one add.
	 *
	 * @param alternateRsoOneExt the alternate rso one ext of this alternate rso one add
	 */
	@Override
	public void setAlternateRsoOneExt(String alternateRsoOneExt) {
		model.setAlternateRsoOneExt(alternateRsoOneExt);
	}

	/**
	 * Sets the alternate rso one fax of this alternate rso one add.
	 *
	 * @param alternateRsoOneFax the alternate rso one fax of this alternate rso one add
	 */
	@Override
	public void setAlternateRsoOneFax(String alternateRsoOneFax) {
		model.setAlternateRsoOneFax(alternateRsoOneFax);
	}

	/**
	 * Sets the alternate rso one name of this alternate rso one add.
	 *
	 * @param alternateRsoOneName the alternate rso one name of this alternate rso one add
	 */
	@Override
	public void setAlternateRsoOneName(String alternateRsoOneName) {
		model.setAlternateRsoOneName(alternateRsoOneName);
	}

	/**
	 * Sets the alternate rso one telephone of this alternate rso one add.
	 *
	 * @param alternateRsoOneTelephone the alternate rso one telephone of this alternate rso one add
	 */
	@Override
	public void setAlternateRsoOneTelephone(String alternateRsoOneTelephone) {
		model.setAlternateRsoOneTelephone(alternateRsoOneTelephone);
	}

	/**
	 * Sets the alternate rso one title of this alternate rso one add.
	 *
	 * @param alternateRsoOneTitle the alternate rso one title of this alternate rso one add
	 */
	@Override
	public void setAlternateRsoOneTitle(String alternateRsoOneTitle) {
		model.setAlternateRsoOneTitle(alternateRsoOneTitle);
	}

	/**
	 * Sets the company ID of this alternate rso one add.
	 *
	 * @param companyId the company ID of this alternate rso one add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this alternate rso one add.
	 *
	 * @param counter the counter of this alternate rso one add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this alternate rso one add.
	 *
	 * @param createDate the create date of this alternate rso one add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this alternate rso one add.
	 *
	 * @param groupId the group ID of this alternate rso one add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this alternate rso one add.
	 *
	 * @param hsraApplicationId the hsra application ID of this alternate rso one add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this alternate rso one add.
	 *
	 * @param modifiedDate the modified date of this alternate rso one add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this alternate rso one add.
	 *
	 * @param primaryKey the primary key of this alternate rso one add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this alternate rso one add.
	 *
	 * @param userId the user ID of this alternate rso one add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this alternate rso one add.
	 *
	 * @param userName the user name of this alternate rso one add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this alternate rso one add.
	 *
	 * @param userUuid the user uuid of this alternate rso one add
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
	protected AlternateRsoOneAddWrapper wrap(
		AlternateRsoOneAdd alternateRsoOneAdd) {

		return new AlternateRsoOneAddWrapper(alternateRsoOneAdd);
	}

}