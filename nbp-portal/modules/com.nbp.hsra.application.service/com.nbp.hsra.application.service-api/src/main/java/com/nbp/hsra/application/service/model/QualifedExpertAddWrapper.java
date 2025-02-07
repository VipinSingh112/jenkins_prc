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
 * This class is a wrapper for {@link QualifedExpertAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertAdd
 * @generated
 */
public class QualifedExpertAddWrapper
	extends BaseModelWrapper<QualifedExpertAdd>
	implements ModelWrapper<QualifedExpertAdd>, QualifedExpertAdd {

	public QualifedExpertAddWrapper(QualifedExpertAdd qualifedExpertAdd) {
		super(qualifedExpertAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("qualifedExpertAddId", getQualifedExpertAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("qualifedName", getQualifedName());
		attributes.put("qualifedTitle", getQualifedTitle());
		attributes.put("qualifedTelephone", getQualifedTelephone());
		attributes.put("qualifedExt", getQualifedExt());
		attributes.put("qualifedFax", getQualifedFax());
		attributes.put("qualifedEmailAdd", getQualifedEmailAdd());
		attributes.put("qualifedRegistrationNo", getQualifedRegistrationNo());
		attributes.put("qualifedExpirationDate", getQualifedExpirationDate());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long qualifedExpertAddId = (Long)attributes.get("qualifedExpertAddId");

		if (qualifedExpertAddId != null) {
			setQualifedExpertAddId(qualifedExpertAddId);
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

		String qualifedName = (String)attributes.get("qualifedName");

		if (qualifedName != null) {
			setQualifedName(qualifedName);
		}

		String qualifedTitle = (String)attributes.get("qualifedTitle");

		if (qualifedTitle != null) {
			setQualifedTitle(qualifedTitle);
		}

		String qualifedTelephone = (String)attributes.get("qualifedTelephone");

		if (qualifedTelephone != null) {
			setQualifedTelephone(qualifedTelephone);
		}

		String qualifedExt = (String)attributes.get("qualifedExt");

		if (qualifedExt != null) {
			setQualifedExt(qualifedExt);
		}

		String qualifedFax = (String)attributes.get("qualifedFax");

		if (qualifedFax != null) {
			setQualifedFax(qualifedFax);
		}

		String qualifedEmailAdd = (String)attributes.get("qualifedEmailAdd");

		if (qualifedEmailAdd != null) {
			setQualifedEmailAdd(qualifedEmailAdd);
		}

		String qualifedRegistrationNo = (String)attributes.get(
			"qualifedRegistrationNo");

		if (qualifedRegistrationNo != null) {
			setQualifedRegistrationNo(qualifedRegistrationNo);
		}

		Date qualifedExpirationDate = (Date)attributes.get(
			"qualifedExpirationDate");

		if (qualifedExpirationDate != null) {
			setQualifedExpirationDate(qualifedExpirationDate);
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
	public QualifedExpertAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this qualifed expert add.
	 *
	 * @return the company ID of this qualifed expert add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this qualifed expert add.
	 *
	 * @return the counter of this qualifed expert add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this qualifed expert add.
	 *
	 * @return the create date of this qualifed expert add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this qualifed expert add.
	 *
	 * @return the group ID of this qualifed expert add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this qualifed expert add.
	 *
	 * @return the hsra application ID of this qualifed expert add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this qualifed expert add.
	 *
	 * @return the modified date of this qualifed expert add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this qualifed expert add.
	 *
	 * @return the primary key of this qualifed expert add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualifed email add of this qualifed expert add.
	 *
	 * @return the qualifed email add of this qualifed expert add
	 */
	@Override
	public String getQualifedEmailAdd() {
		return model.getQualifedEmailAdd();
	}

	/**
	 * Returns the qualifed expert add ID of this qualifed expert add.
	 *
	 * @return the qualifed expert add ID of this qualifed expert add
	 */
	@Override
	public long getQualifedExpertAddId() {
		return model.getQualifedExpertAddId();
	}

	/**
	 * Returns the qualifed expiration date of this qualifed expert add.
	 *
	 * @return the qualifed expiration date of this qualifed expert add
	 */
	@Override
	public Date getQualifedExpirationDate() {
		return model.getQualifedExpirationDate();
	}

	/**
	 * Returns the qualifed ext of this qualifed expert add.
	 *
	 * @return the qualifed ext of this qualifed expert add
	 */
	@Override
	public String getQualifedExt() {
		return model.getQualifedExt();
	}

	/**
	 * Returns the qualifed fax of this qualifed expert add.
	 *
	 * @return the qualifed fax of this qualifed expert add
	 */
	@Override
	public String getQualifedFax() {
		return model.getQualifedFax();
	}

	/**
	 * Returns the qualifed name of this qualifed expert add.
	 *
	 * @return the qualifed name of this qualifed expert add
	 */
	@Override
	public String getQualifedName() {
		return model.getQualifedName();
	}

	/**
	 * Returns the qualifed registration no of this qualifed expert add.
	 *
	 * @return the qualifed registration no of this qualifed expert add
	 */
	@Override
	public String getQualifedRegistrationNo() {
		return model.getQualifedRegistrationNo();
	}

	/**
	 * Returns the qualifed telephone of this qualifed expert add.
	 *
	 * @return the qualifed telephone of this qualifed expert add
	 */
	@Override
	public String getQualifedTelephone() {
		return model.getQualifedTelephone();
	}

	/**
	 * Returns the qualifed title of this qualifed expert add.
	 *
	 * @return the qualifed title of this qualifed expert add
	 */
	@Override
	public String getQualifedTitle() {
		return model.getQualifedTitle();
	}

	/**
	 * Returns the user ID of this qualifed expert add.
	 *
	 * @return the user ID of this qualifed expert add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this qualifed expert add.
	 *
	 * @return the user name of this qualifed expert add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this qualifed expert add.
	 *
	 * @return the user uuid of this qualifed expert add
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
	 * Sets the company ID of this qualifed expert add.
	 *
	 * @param companyId the company ID of this qualifed expert add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this qualifed expert add.
	 *
	 * @param counter the counter of this qualifed expert add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this qualifed expert add.
	 *
	 * @param createDate the create date of this qualifed expert add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this qualifed expert add.
	 *
	 * @param groupId the group ID of this qualifed expert add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this qualifed expert add.
	 *
	 * @param hsraApplicationId the hsra application ID of this qualifed expert add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this qualifed expert add.
	 *
	 * @param modifiedDate the modified date of this qualifed expert add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this qualifed expert add.
	 *
	 * @param primaryKey the primary key of this qualifed expert add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualifed email add of this qualifed expert add.
	 *
	 * @param qualifedEmailAdd the qualifed email add of this qualifed expert add
	 */
	@Override
	public void setQualifedEmailAdd(String qualifedEmailAdd) {
		model.setQualifedEmailAdd(qualifedEmailAdd);
	}

	/**
	 * Sets the qualifed expert add ID of this qualifed expert add.
	 *
	 * @param qualifedExpertAddId the qualifed expert add ID of this qualifed expert add
	 */
	@Override
	public void setQualifedExpertAddId(long qualifedExpertAddId) {
		model.setQualifedExpertAddId(qualifedExpertAddId);
	}

	/**
	 * Sets the qualifed expiration date of this qualifed expert add.
	 *
	 * @param qualifedExpirationDate the qualifed expiration date of this qualifed expert add
	 */
	@Override
	public void setQualifedExpirationDate(Date qualifedExpirationDate) {
		model.setQualifedExpirationDate(qualifedExpirationDate);
	}

	/**
	 * Sets the qualifed ext of this qualifed expert add.
	 *
	 * @param qualifedExt the qualifed ext of this qualifed expert add
	 */
	@Override
	public void setQualifedExt(String qualifedExt) {
		model.setQualifedExt(qualifedExt);
	}

	/**
	 * Sets the qualifed fax of this qualifed expert add.
	 *
	 * @param qualifedFax the qualifed fax of this qualifed expert add
	 */
	@Override
	public void setQualifedFax(String qualifedFax) {
		model.setQualifedFax(qualifedFax);
	}

	/**
	 * Sets the qualifed name of this qualifed expert add.
	 *
	 * @param qualifedName the qualifed name of this qualifed expert add
	 */
	@Override
	public void setQualifedName(String qualifedName) {
		model.setQualifedName(qualifedName);
	}

	/**
	 * Sets the qualifed registration no of this qualifed expert add.
	 *
	 * @param qualifedRegistrationNo the qualifed registration no of this qualifed expert add
	 */
	@Override
	public void setQualifedRegistrationNo(String qualifedRegistrationNo) {
		model.setQualifedRegistrationNo(qualifedRegistrationNo);
	}

	/**
	 * Sets the qualifed telephone of this qualifed expert add.
	 *
	 * @param qualifedTelephone the qualifed telephone of this qualifed expert add
	 */
	@Override
	public void setQualifedTelephone(String qualifedTelephone) {
		model.setQualifedTelephone(qualifedTelephone);
	}

	/**
	 * Sets the qualifed title of this qualifed expert add.
	 *
	 * @param qualifedTitle the qualifed title of this qualifed expert add
	 */
	@Override
	public void setQualifedTitle(String qualifedTitle) {
		model.setQualifedTitle(qualifedTitle);
	}

	/**
	 * Sets the user ID of this qualifed expert add.
	 *
	 * @param userId the user ID of this qualifed expert add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this qualifed expert add.
	 *
	 * @param userName the user name of this qualifed expert add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this qualifed expert add.
	 *
	 * @param userUuid the user uuid of this qualifed expert add
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
	protected QualifedExpertAddWrapper wrap(
		QualifedExpertAdd qualifedExpertAdd) {

		return new QualifedExpertAddWrapper(qualifedExpertAdd);
	}

}