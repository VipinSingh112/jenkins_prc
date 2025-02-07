/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ExplosiveCommisionDecision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveCommisionDecision
 * @generated
 */
public class ExplosiveCommisionDecisionWrapper
	extends BaseModelWrapper<ExplosiveCommisionDecision>
	implements ExplosiveCommisionDecision,
			   ModelWrapper<ExplosiveCommisionDecision> {

	public ExplosiveCommisionDecisionWrapper(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		super(explosiveCommisionDecision);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("commisiondecId", getCommisiondecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("commisionDecision", getCommisionDecision());
		attributes.put("decisionDate", getDecisionDate());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long commisiondecId = (Long)attributes.get("commisiondecId");

		if (commisiondecId != null) {
			setCommisiondecId(commisiondecId);
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

		String commisionDecision = (String)attributes.get("commisionDecision");

		if (commisionDecision != null) {
			setCommisionDecision(commisionDecision);
		}

		Date decisionDate = (Date)attributes.get("decisionDate");

		if (decisionDate != null) {
			setDecisionDate(decisionDate);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public ExplosiveCommisionDecision cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this explosive commision decision.
	 *
	 * @return the case ID of this explosive commision decision
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the commisiondec ID of this explosive commision decision.
	 *
	 * @return the commisiondec ID of this explosive commision decision
	 */
	@Override
	public long getCommisiondecId() {
		return model.getCommisiondecId();
	}

	/**
	 * Returns the commision decision of this explosive commision decision.
	 *
	 * @return the commision decision of this explosive commision decision
	 */
	@Override
	public String getCommisionDecision() {
		return model.getCommisionDecision();
	}

	/**
	 * Returns the company ID of this explosive commision decision.
	 *
	 * @return the company ID of this explosive commision decision
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this explosive commision decision.
	 *
	 * @return the create date of this explosive commision decision
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the decision date of this explosive commision decision.
	 *
	 * @return the decision date of this explosive commision decision
	 */
	@Override
	public Date getDecisionDate() {
		return model.getDecisionDate();
	}

	/**
	 * Returns the group ID of this explosive commision decision.
	 *
	 * @return the group ID of this explosive commision decision
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this explosive commision decision.
	 *
	 * @return the modified date of this explosive commision decision
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this explosive commision decision.
	 *
	 * @return the primary key of this explosive commision decision
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this explosive commision decision.
	 *
	 * @return the user ID of this explosive commision decision
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this explosive commision decision.
	 *
	 * @return the user name of this explosive commision decision
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this explosive commision decision.
	 *
	 * @return the user uuid of this explosive commision decision
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this explosive commision decision.
	 *
	 * @return the uuid of this explosive commision decision
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this explosive commision decision.
	 *
	 * @param caseId the case ID of this explosive commision decision
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the commisiondec ID of this explosive commision decision.
	 *
	 * @param commisiondecId the commisiondec ID of this explosive commision decision
	 */
	@Override
	public void setCommisiondecId(long commisiondecId) {
		model.setCommisiondecId(commisiondecId);
	}

	/**
	 * Sets the commision decision of this explosive commision decision.
	 *
	 * @param commisionDecision the commision decision of this explosive commision decision
	 */
	@Override
	public void setCommisionDecision(String commisionDecision) {
		model.setCommisionDecision(commisionDecision);
	}

	/**
	 * Sets the company ID of this explosive commision decision.
	 *
	 * @param companyId the company ID of this explosive commision decision
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this explosive commision decision.
	 *
	 * @param createDate the create date of this explosive commision decision
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the decision date of this explosive commision decision.
	 *
	 * @param decisionDate the decision date of this explosive commision decision
	 */
	@Override
	public void setDecisionDate(Date decisionDate) {
		model.setDecisionDate(decisionDate);
	}

	/**
	 * Sets the group ID of this explosive commision decision.
	 *
	 * @param groupId the group ID of this explosive commision decision
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this explosive commision decision.
	 *
	 * @param modifiedDate the modified date of this explosive commision decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this explosive commision decision.
	 *
	 * @param primaryKey the primary key of this explosive commision decision
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this explosive commision decision.
	 *
	 * @param userId the user ID of this explosive commision decision
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this explosive commision decision.
	 *
	 * @param userName the user name of this explosive commision decision
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this explosive commision decision.
	 *
	 * @param userUuid the user uuid of this explosive commision decision
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this explosive commision decision.
	 *
	 * @param uuid the uuid of this explosive commision decision
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
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
	protected ExplosiveCommisionDecisionWrapper wrap(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		return new ExplosiveCommisionDecisionWrapper(
			explosiveCommisionDecision);
	}

}