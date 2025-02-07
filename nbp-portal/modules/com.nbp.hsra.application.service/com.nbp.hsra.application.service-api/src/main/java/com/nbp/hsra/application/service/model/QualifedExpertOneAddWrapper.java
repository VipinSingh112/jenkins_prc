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
 * This class is a wrapper for {@link QualifedExpertOneAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertOneAdd
 * @generated
 */
public class QualifedExpertOneAddWrapper
	extends BaseModelWrapper<QualifedExpertOneAdd>
	implements ModelWrapper<QualifedExpertOneAdd>, QualifedExpertOneAdd {

	public QualifedExpertOneAddWrapper(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		super(qualifedExpertOneAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("qualifedExpertOneAddId", getQualifedExpertOneAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("qualifedOneName", getQualifedOneName());
		attributes.put("qualifedOneTitle", getQualifedOneTitle());
		attributes.put("qualifedOneTelephone", getQualifedOneTelephone());
		attributes.put("qualifedOneExt", getQualifedOneExt());
		attributes.put("qualifedOneFax", getQualifedOneFax());
		attributes.put("qualifedOneEmailAdd", getQualifedOneEmailAdd());
		attributes.put(
			"qualifedOneRegistrationNo", getQualifedOneRegistrationNo());
		attributes.put(
			"qualifedOneExpirationDate", getQualifedOneExpirationDate());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long qualifedExpertOneAddId = (Long)attributes.get(
			"qualifedExpertOneAddId");

		if (qualifedExpertOneAddId != null) {
			setQualifedExpertOneAddId(qualifedExpertOneAddId);
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

		String qualifedOneName = (String)attributes.get("qualifedOneName");

		if (qualifedOneName != null) {
			setQualifedOneName(qualifedOneName);
		}

		String qualifedOneTitle = (String)attributes.get("qualifedOneTitle");

		if (qualifedOneTitle != null) {
			setQualifedOneTitle(qualifedOneTitle);
		}

		String qualifedOneTelephone = (String)attributes.get(
			"qualifedOneTelephone");

		if (qualifedOneTelephone != null) {
			setQualifedOneTelephone(qualifedOneTelephone);
		}

		String qualifedOneExt = (String)attributes.get("qualifedOneExt");

		if (qualifedOneExt != null) {
			setQualifedOneExt(qualifedOneExt);
		}

		String qualifedOneFax = (String)attributes.get("qualifedOneFax");

		if (qualifedOneFax != null) {
			setQualifedOneFax(qualifedOneFax);
		}

		String qualifedOneEmailAdd = (String)attributes.get(
			"qualifedOneEmailAdd");

		if (qualifedOneEmailAdd != null) {
			setQualifedOneEmailAdd(qualifedOneEmailAdd);
		}

		String qualifedOneRegistrationNo = (String)attributes.get(
			"qualifedOneRegistrationNo");

		if (qualifedOneRegistrationNo != null) {
			setQualifedOneRegistrationNo(qualifedOneRegistrationNo);
		}

		Date qualifedOneExpirationDate = (Date)attributes.get(
			"qualifedOneExpirationDate");

		if (qualifedOneExpirationDate != null) {
			setQualifedOneExpirationDate(qualifedOneExpirationDate);
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
	public QualifedExpertOneAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this qualifed expert one add.
	 *
	 * @return the company ID of this qualifed expert one add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this qualifed expert one add.
	 *
	 * @return the counter of this qualifed expert one add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this qualifed expert one add.
	 *
	 * @return the create date of this qualifed expert one add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this qualifed expert one add.
	 *
	 * @return the group ID of this qualifed expert one add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this qualifed expert one add.
	 *
	 * @return the hsra application ID of this qualifed expert one add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this qualifed expert one add.
	 *
	 * @return the modified date of this qualifed expert one add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this qualifed expert one add.
	 *
	 * @return the primary key of this qualifed expert one add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualifed expert one add ID of this qualifed expert one add.
	 *
	 * @return the qualifed expert one add ID of this qualifed expert one add
	 */
	@Override
	public long getQualifedExpertOneAddId() {
		return model.getQualifedExpertOneAddId();
	}

	/**
	 * Returns the qualifed one email add of this qualifed expert one add.
	 *
	 * @return the qualifed one email add of this qualifed expert one add
	 */
	@Override
	public String getQualifedOneEmailAdd() {
		return model.getQualifedOneEmailAdd();
	}

	/**
	 * Returns the qualifed one expiration date of this qualifed expert one add.
	 *
	 * @return the qualifed one expiration date of this qualifed expert one add
	 */
	@Override
	public Date getQualifedOneExpirationDate() {
		return model.getQualifedOneExpirationDate();
	}

	/**
	 * Returns the qualifed one ext of this qualifed expert one add.
	 *
	 * @return the qualifed one ext of this qualifed expert one add
	 */
	@Override
	public String getQualifedOneExt() {
		return model.getQualifedOneExt();
	}

	/**
	 * Returns the qualifed one fax of this qualifed expert one add.
	 *
	 * @return the qualifed one fax of this qualifed expert one add
	 */
	@Override
	public String getQualifedOneFax() {
		return model.getQualifedOneFax();
	}

	/**
	 * Returns the qualifed one name of this qualifed expert one add.
	 *
	 * @return the qualifed one name of this qualifed expert one add
	 */
	@Override
	public String getQualifedOneName() {
		return model.getQualifedOneName();
	}

	/**
	 * Returns the qualifed one registration no of this qualifed expert one add.
	 *
	 * @return the qualifed one registration no of this qualifed expert one add
	 */
	@Override
	public String getQualifedOneRegistrationNo() {
		return model.getQualifedOneRegistrationNo();
	}

	/**
	 * Returns the qualifed one telephone of this qualifed expert one add.
	 *
	 * @return the qualifed one telephone of this qualifed expert one add
	 */
	@Override
	public String getQualifedOneTelephone() {
		return model.getQualifedOneTelephone();
	}

	/**
	 * Returns the qualifed one title of this qualifed expert one add.
	 *
	 * @return the qualifed one title of this qualifed expert one add
	 */
	@Override
	public String getQualifedOneTitle() {
		return model.getQualifedOneTitle();
	}

	/**
	 * Returns the user ID of this qualifed expert one add.
	 *
	 * @return the user ID of this qualifed expert one add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this qualifed expert one add.
	 *
	 * @return the user name of this qualifed expert one add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this qualifed expert one add.
	 *
	 * @return the user uuid of this qualifed expert one add
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
	 * Sets the company ID of this qualifed expert one add.
	 *
	 * @param companyId the company ID of this qualifed expert one add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this qualifed expert one add.
	 *
	 * @param counter the counter of this qualifed expert one add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this qualifed expert one add.
	 *
	 * @param createDate the create date of this qualifed expert one add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this qualifed expert one add.
	 *
	 * @param groupId the group ID of this qualifed expert one add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this qualifed expert one add.
	 *
	 * @param hsraApplicationId the hsra application ID of this qualifed expert one add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this qualifed expert one add.
	 *
	 * @param modifiedDate the modified date of this qualifed expert one add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this qualifed expert one add.
	 *
	 * @param primaryKey the primary key of this qualifed expert one add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualifed expert one add ID of this qualifed expert one add.
	 *
	 * @param qualifedExpertOneAddId the qualifed expert one add ID of this qualifed expert one add
	 */
	@Override
	public void setQualifedExpertOneAddId(long qualifedExpertOneAddId) {
		model.setQualifedExpertOneAddId(qualifedExpertOneAddId);
	}

	/**
	 * Sets the qualifed one email add of this qualifed expert one add.
	 *
	 * @param qualifedOneEmailAdd the qualifed one email add of this qualifed expert one add
	 */
	@Override
	public void setQualifedOneEmailAdd(String qualifedOneEmailAdd) {
		model.setQualifedOneEmailAdd(qualifedOneEmailAdd);
	}

	/**
	 * Sets the qualifed one expiration date of this qualifed expert one add.
	 *
	 * @param qualifedOneExpirationDate the qualifed one expiration date of this qualifed expert one add
	 */
	@Override
	public void setQualifedOneExpirationDate(Date qualifedOneExpirationDate) {
		model.setQualifedOneExpirationDate(qualifedOneExpirationDate);
	}

	/**
	 * Sets the qualifed one ext of this qualifed expert one add.
	 *
	 * @param qualifedOneExt the qualifed one ext of this qualifed expert one add
	 */
	@Override
	public void setQualifedOneExt(String qualifedOneExt) {
		model.setQualifedOneExt(qualifedOneExt);
	}

	/**
	 * Sets the qualifed one fax of this qualifed expert one add.
	 *
	 * @param qualifedOneFax the qualifed one fax of this qualifed expert one add
	 */
	@Override
	public void setQualifedOneFax(String qualifedOneFax) {
		model.setQualifedOneFax(qualifedOneFax);
	}

	/**
	 * Sets the qualifed one name of this qualifed expert one add.
	 *
	 * @param qualifedOneName the qualifed one name of this qualifed expert one add
	 */
	@Override
	public void setQualifedOneName(String qualifedOneName) {
		model.setQualifedOneName(qualifedOneName);
	}

	/**
	 * Sets the qualifed one registration no of this qualifed expert one add.
	 *
	 * @param qualifedOneRegistrationNo the qualifed one registration no of this qualifed expert one add
	 */
	@Override
	public void setQualifedOneRegistrationNo(String qualifedOneRegistrationNo) {
		model.setQualifedOneRegistrationNo(qualifedOneRegistrationNo);
	}

	/**
	 * Sets the qualifed one telephone of this qualifed expert one add.
	 *
	 * @param qualifedOneTelephone the qualifed one telephone of this qualifed expert one add
	 */
	@Override
	public void setQualifedOneTelephone(String qualifedOneTelephone) {
		model.setQualifedOneTelephone(qualifedOneTelephone);
	}

	/**
	 * Sets the qualifed one title of this qualifed expert one add.
	 *
	 * @param qualifedOneTitle the qualifed one title of this qualifed expert one add
	 */
	@Override
	public void setQualifedOneTitle(String qualifedOneTitle) {
		model.setQualifedOneTitle(qualifedOneTitle);
	}

	/**
	 * Sets the user ID of this qualifed expert one add.
	 *
	 * @param userId the user ID of this qualifed expert one add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this qualifed expert one add.
	 *
	 * @param userName the user name of this qualifed expert one add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this qualifed expert one add.
	 *
	 * @param userUuid the user uuid of this qualifed expert one add
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
	protected QualifedExpertOneAddWrapper wrap(
		QualifedExpertOneAdd qualifedExpertOneAdd) {

		return new QualifedExpertOneAddWrapper(qualifedExpertOneAdd);
	}

}