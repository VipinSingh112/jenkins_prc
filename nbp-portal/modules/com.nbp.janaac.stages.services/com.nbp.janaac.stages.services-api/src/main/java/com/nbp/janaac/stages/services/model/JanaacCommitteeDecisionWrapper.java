/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JanaacCommitteeDecision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacCommitteeDecision
 * @generated
 */
public class JanaacCommitteeDecisionWrapper
	extends BaseModelWrapper<JanaacCommitteeDecision>
	implements JanaacCommitteeDecision, ModelWrapper<JanaacCommitteeDecision> {

	public JanaacCommitteeDecisionWrapper(
		JanaacCommitteeDecision janaacCommitteeDecision) {

		super(janaacCommitteeDecision);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"janaacCommitteeDecisionId", getJanaacCommitteeDecisionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dateOfCommitteeDecision", getDateOfCommitteeDecision());
		attributes.put("committeeDecision", getCommitteeDecision());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long janaacCommitteeDecisionId = (Long)attributes.get(
			"janaacCommitteeDecisionId");

		if (janaacCommitteeDecisionId != null) {
			setJanaacCommitteeDecisionId(janaacCommitteeDecisionId);
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

		Date dateOfCommitteeDecision = (Date)attributes.get(
			"dateOfCommitteeDecision");

		if (dateOfCommitteeDecision != null) {
			setDateOfCommitteeDecision(dateOfCommitteeDecision);
		}

		String committeeDecision = (String)attributes.get("committeeDecision");

		if (committeeDecision != null) {
			setCommitteeDecision(committeeDecision);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public JanaacCommitteeDecision cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this janaac committee decision.
	 *
	 * @return the case ID of this janaac committee decision
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the committee decision of this janaac committee decision.
	 *
	 * @return the committee decision of this janaac committee decision
	 */
	@Override
	public String getCommitteeDecision() {
		return model.getCommitteeDecision();
	}

	/**
	 * Returns the company ID of this janaac committee decision.
	 *
	 * @return the company ID of this janaac committee decision
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this janaac committee decision.
	 *
	 * @return the create date of this janaac committee decision
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of committee decision of this janaac committee decision.
	 *
	 * @return the date of committee decision of this janaac committee decision
	 */
	@Override
	public Date getDateOfCommitteeDecision() {
		return model.getDateOfCommitteeDecision();
	}

	/**
	 * Returns the group ID of this janaac committee decision.
	 *
	 * @return the group ID of this janaac committee decision
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac committee decision ID of this janaac committee decision.
	 *
	 * @return the janaac committee decision ID of this janaac committee decision
	 */
	@Override
	public long getJanaacCommitteeDecisionId() {
		return model.getJanaacCommitteeDecisionId();
	}

	/**
	 * Returns the modified date of this janaac committee decision.
	 *
	 * @return the modified date of this janaac committee decision
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this janaac committee decision.
	 *
	 * @return the primary key of this janaac committee decision
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this janaac committee decision.
	 *
	 * @return the user ID of this janaac committee decision
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this janaac committee decision.
	 *
	 * @return the user name of this janaac committee decision
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this janaac committee decision.
	 *
	 * @return the user uuid of this janaac committee decision
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
	 * Sets the case ID of this janaac committee decision.
	 *
	 * @param caseId the case ID of this janaac committee decision
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the committee decision of this janaac committee decision.
	 *
	 * @param committeeDecision the committee decision of this janaac committee decision
	 */
	@Override
	public void setCommitteeDecision(String committeeDecision) {
		model.setCommitteeDecision(committeeDecision);
	}

	/**
	 * Sets the company ID of this janaac committee decision.
	 *
	 * @param companyId the company ID of this janaac committee decision
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this janaac committee decision.
	 *
	 * @param createDate the create date of this janaac committee decision
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of committee decision of this janaac committee decision.
	 *
	 * @param dateOfCommitteeDecision the date of committee decision of this janaac committee decision
	 */
	@Override
	public void setDateOfCommitteeDecision(Date dateOfCommitteeDecision) {
		model.setDateOfCommitteeDecision(dateOfCommitteeDecision);
	}

	/**
	 * Sets the group ID of this janaac committee decision.
	 *
	 * @param groupId the group ID of this janaac committee decision
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac committee decision ID of this janaac committee decision.
	 *
	 * @param janaacCommitteeDecisionId the janaac committee decision ID of this janaac committee decision
	 */
	@Override
	public void setJanaacCommitteeDecisionId(long janaacCommitteeDecisionId) {
		model.setJanaacCommitteeDecisionId(janaacCommitteeDecisionId);
	}

	/**
	 * Sets the modified date of this janaac committee decision.
	 *
	 * @param modifiedDate the modified date of this janaac committee decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this janaac committee decision.
	 *
	 * @param primaryKey the primary key of this janaac committee decision
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this janaac committee decision.
	 *
	 * @param userId the user ID of this janaac committee decision
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this janaac committee decision.
	 *
	 * @param userName the user name of this janaac committee decision
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this janaac committee decision.
	 *
	 * @param userUuid the user uuid of this janaac committee decision
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
	protected JanaacCommitteeDecisionWrapper wrap(
		JanaacCommitteeDecision janaacCommitteeDecision) {

		return new JanaacCommitteeDecisionWrapper(janaacCommitteeDecision);
	}

}