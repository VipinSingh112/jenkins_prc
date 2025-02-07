/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezStatusPreApprovalConditions}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPreApprovalConditions
 * @generated
 */
public class SezStatusPreApprovalConditionsWrapper
	extends BaseModelWrapper<SezStatusPreApprovalConditions>
	implements ModelWrapper<SezStatusPreApprovalConditions>,
			   SezStatusPreApprovalConditions {

	public SezStatusPreApprovalConditionsWrapper(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		super(sezStatusPreApprovalConditions);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("preApprovalId", getPreApprovalId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("preApprovalLetterId", getPreApprovalLetterId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long preApprovalId = (Long)attributes.get("preApprovalId");

		if (preApprovalId != null) {
			setPreApprovalId(preApprovalId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Long preApprovalLetterId = (Long)attributes.get("preApprovalLetterId");

		if (preApprovalLetterId != null) {
			setPreApprovalLetterId(preApprovalLetterId);
		}
	}

	@Override
	public SezStatusPreApprovalConditions cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this sez status pre approval conditions.
	 *
	 * @return the case ID of this sez status pre approval conditions
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this sez status pre approval conditions.
	 *
	 * @return the company ID of this sez status pre approval conditions
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez status pre approval conditions.
	 *
	 * @return the create date of this sez status pre approval conditions
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez status pre approval conditions.
	 *
	 * @return the group ID of this sez status pre approval conditions
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez status pre approval conditions.
	 *
	 * @return the modified date of this sez status pre approval conditions
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pre approval ID of this sez status pre approval conditions.
	 *
	 * @return the pre approval ID of this sez status pre approval conditions
	 */
	@Override
	public long getPreApprovalId() {
		return model.getPreApprovalId();
	}

	/**
	 * Returns the pre approval letter ID of this sez status pre approval conditions.
	 *
	 * @return the pre approval letter ID of this sez status pre approval conditions
	 */
	@Override
	public long getPreApprovalLetterId() {
		return model.getPreApprovalLetterId();
	}

	/**
	 * Returns the primary key of this sez status pre approval conditions.
	 *
	 * @return the primary key of this sez status pre approval conditions
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this sez status pre approval conditions.
	 *
	 * @return the user ID of this sez status pre approval conditions
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez status pre approval conditions.
	 *
	 * @return the user name of this sez status pre approval conditions
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez status pre approval conditions.
	 *
	 * @return the user uuid of this sez status pre approval conditions
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
	 * Sets the case ID of this sez status pre approval conditions.
	 *
	 * @param caseId the case ID of this sez status pre approval conditions
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this sez status pre approval conditions.
	 *
	 * @param companyId the company ID of this sez status pre approval conditions
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez status pre approval conditions.
	 *
	 * @param createDate the create date of this sez status pre approval conditions
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez status pre approval conditions.
	 *
	 * @param groupId the group ID of this sez status pre approval conditions
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez status pre approval conditions.
	 *
	 * @param modifiedDate the modified date of this sez status pre approval conditions
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pre approval ID of this sez status pre approval conditions.
	 *
	 * @param preApprovalId the pre approval ID of this sez status pre approval conditions
	 */
	@Override
	public void setPreApprovalId(long preApprovalId) {
		model.setPreApprovalId(preApprovalId);
	}

	/**
	 * Sets the pre approval letter ID of this sez status pre approval conditions.
	 *
	 * @param preApprovalLetterId the pre approval letter ID of this sez status pre approval conditions
	 */
	@Override
	public void setPreApprovalLetterId(long preApprovalLetterId) {
		model.setPreApprovalLetterId(preApprovalLetterId);
	}

	/**
	 * Sets the primary key of this sez status pre approval conditions.
	 *
	 * @param primaryKey the primary key of this sez status pre approval conditions
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this sez status pre approval conditions.
	 *
	 * @param userId the user ID of this sez status pre approval conditions
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez status pre approval conditions.
	 *
	 * @param userName the user name of this sez status pre approval conditions
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez status pre approval conditions.
	 *
	 * @param userUuid the user uuid of this sez status pre approval conditions
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
	protected SezStatusPreApprovalConditionsWrapper wrap(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		return new SezStatusPreApprovalConditionsWrapper(
			sezStatusPreApprovalConditions);
	}

}