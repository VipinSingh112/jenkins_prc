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
 * This class is a wrapper for {@link AlternateRsoAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoAdd
 * @generated
 */
public class AlternateRsoAddWrapper
	extends BaseModelWrapper<AlternateRsoAdd>
	implements AlternateRsoAdd, ModelWrapper<AlternateRsoAdd> {

	public AlternateRsoAddWrapper(AlternateRsoAdd alternateRsoAdd) {
		super(alternateRsoAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("alternateRsoAddId", getAlternateRsoAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("alternateRsoName", getAlternateRsoName());
		attributes.put("alternateRsoTitle", getAlternateRsoTitle());
		attributes.put("alternateRsoTelephone", getAlternateRsoTelephone());
		attributes.put("alternateRsoExt", getAlternateRsoExt());
		attributes.put("alternateRsoFax", getAlternateRsoFax());
		attributes.put("alternateRsoEmailAdd", getAlternateRsoEmailAdd());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long alternateRsoAddId = (Long)attributes.get("alternateRsoAddId");

		if (alternateRsoAddId != null) {
			setAlternateRsoAddId(alternateRsoAddId);
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

		String alternateRsoName = (String)attributes.get("alternateRsoName");

		if (alternateRsoName != null) {
			setAlternateRsoName(alternateRsoName);
		}

		String alternateRsoTitle = (String)attributes.get("alternateRsoTitle");

		if (alternateRsoTitle != null) {
			setAlternateRsoTitle(alternateRsoTitle);
		}

		String alternateRsoTelephone = (String)attributes.get(
			"alternateRsoTelephone");

		if (alternateRsoTelephone != null) {
			setAlternateRsoTelephone(alternateRsoTelephone);
		}

		String alternateRsoExt = (String)attributes.get("alternateRsoExt");

		if (alternateRsoExt != null) {
			setAlternateRsoExt(alternateRsoExt);
		}

		String alternateRsoFax = (String)attributes.get("alternateRsoFax");

		if (alternateRsoFax != null) {
			setAlternateRsoFax(alternateRsoFax);
		}

		String alternateRsoEmailAdd = (String)attributes.get(
			"alternateRsoEmailAdd");

		if (alternateRsoEmailAdd != null) {
			setAlternateRsoEmailAdd(alternateRsoEmailAdd);
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
	public AlternateRsoAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the alternate rso add ID of this alternate rso add.
	 *
	 * @return the alternate rso add ID of this alternate rso add
	 */
	@Override
	public long getAlternateRsoAddId() {
		return model.getAlternateRsoAddId();
	}

	/**
	 * Returns the alternate rso email add of this alternate rso add.
	 *
	 * @return the alternate rso email add of this alternate rso add
	 */
	@Override
	public String getAlternateRsoEmailAdd() {
		return model.getAlternateRsoEmailAdd();
	}

	/**
	 * Returns the alternate rso ext of this alternate rso add.
	 *
	 * @return the alternate rso ext of this alternate rso add
	 */
	@Override
	public String getAlternateRsoExt() {
		return model.getAlternateRsoExt();
	}

	/**
	 * Returns the alternate rso fax of this alternate rso add.
	 *
	 * @return the alternate rso fax of this alternate rso add
	 */
	@Override
	public String getAlternateRsoFax() {
		return model.getAlternateRsoFax();
	}

	/**
	 * Returns the alternate rso name of this alternate rso add.
	 *
	 * @return the alternate rso name of this alternate rso add
	 */
	@Override
	public String getAlternateRsoName() {
		return model.getAlternateRsoName();
	}

	/**
	 * Returns the alternate rso telephone of this alternate rso add.
	 *
	 * @return the alternate rso telephone of this alternate rso add
	 */
	@Override
	public String getAlternateRsoTelephone() {
		return model.getAlternateRsoTelephone();
	}

	/**
	 * Returns the alternate rso title of this alternate rso add.
	 *
	 * @return the alternate rso title of this alternate rso add
	 */
	@Override
	public String getAlternateRsoTitle() {
		return model.getAlternateRsoTitle();
	}

	/**
	 * Returns the company ID of this alternate rso add.
	 *
	 * @return the company ID of this alternate rso add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this alternate rso add.
	 *
	 * @return the counter of this alternate rso add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this alternate rso add.
	 *
	 * @return the create date of this alternate rso add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this alternate rso add.
	 *
	 * @return the group ID of this alternate rso add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this alternate rso add.
	 *
	 * @return the hsra application ID of this alternate rso add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this alternate rso add.
	 *
	 * @return the modified date of this alternate rso add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this alternate rso add.
	 *
	 * @return the primary key of this alternate rso add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this alternate rso add.
	 *
	 * @return the user ID of this alternate rso add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this alternate rso add.
	 *
	 * @return the user name of this alternate rso add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this alternate rso add.
	 *
	 * @return the user uuid of this alternate rso add
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
	 * Sets the alternate rso add ID of this alternate rso add.
	 *
	 * @param alternateRsoAddId the alternate rso add ID of this alternate rso add
	 */
	@Override
	public void setAlternateRsoAddId(long alternateRsoAddId) {
		model.setAlternateRsoAddId(alternateRsoAddId);
	}

	/**
	 * Sets the alternate rso email add of this alternate rso add.
	 *
	 * @param alternateRsoEmailAdd the alternate rso email add of this alternate rso add
	 */
	@Override
	public void setAlternateRsoEmailAdd(String alternateRsoEmailAdd) {
		model.setAlternateRsoEmailAdd(alternateRsoEmailAdd);
	}

	/**
	 * Sets the alternate rso ext of this alternate rso add.
	 *
	 * @param alternateRsoExt the alternate rso ext of this alternate rso add
	 */
	@Override
	public void setAlternateRsoExt(String alternateRsoExt) {
		model.setAlternateRsoExt(alternateRsoExt);
	}

	/**
	 * Sets the alternate rso fax of this alternate rso add.
	 *
	 * @param alternateRsoFax the alternate rso fax of this alternate rso add
	 */
	@Override
	public void setAlternateRsoFax(String alternateRsoFax) {
		model.setAlternateRsoFax(alternateRsoFax);
	}

	/**
	 * Sets the alternate rso name of this alternate rso add.
	 *
	 * @param alternateRsoName the alternate rso name of this alternate rso add
	 */
	@Override
	public void setAlternateRsoName(String alternateRsoName) {
		model.setAlternateRsoName(alternateRsoName);
	}

	/**
	 * Sets the alternate rso telephone of this alternate rso add.
	 *
	 * @param alternateRsoTelephone the alternate rso telephone of this alternate rso add
	 */
	@Override
	public void setAlternateRsoTelephone(String alternateRsoTelephone) {
		model.setAlternateRsoTelephone(alternateRsoTelephone);
	}

	/**
	 * Sets the alternate rso title of this alternate rso add.
	 *
	 * @param alternateRsoTitle the alternate rso title of this alternate rso add
	 */
	@Override
	public void setAlternateRsoTitle(String alternateRsoTitle) {
		model.setAlternateRsoTitle(alternateRsoTitle);
	}

	/**
	 * Sets the company ID of this alternate rso add.
	 *
	 * @param companyId the company ID of this alternate rso add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this alternate rso add.
	 *
	 * @param counter the counter of this alternate rso add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this alternate rso add.
	 *
	 * @param createDate the create date of this alternate rso add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this alternate rso add.
	 *
	 * @param groupId the group ID of this alternate rso add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this alternate rso add.
	 *
	 * @param hsraApplicationId the hsra application ID of this alternate rso add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this alternate rso add.
	 *
	 * @param modifiedDate the modified date of this alternate rso add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this alternate rso add.
	 *
	 * @param primaryKey the primary key of this alternate rso add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this alternate rso add.
	 *
	 * @param userId the user ID of this alternate rso add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this alternate rso add.
	 *
	 * @param userName the user name of this alternate rso add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this alternate rso add.
	 *
	 * @param userUuid the user uuid of this alternate rso add
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
	protected AlternateRsoAddWrapper wrap(AlternateRsoAdd alternateRsoAdd) {
		return new AlternateRsoAddWrapper(alternateRsoAdd);
	}

}