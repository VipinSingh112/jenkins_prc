/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjAppBoardDecision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppBoardDecision
 * @generated
 */
public class NcbjAppBoardDecisionWrapper
	extends BaseModelWrapper<NcbjAppBoardDecision>
	implements ModelWrapper<NcbjAppBoardDecision>, NcbjAppBoardDecision {

	public NcbjAppBoardDecisionWrapper(
		NcbjAppBoardDecision ncbjAppBoardDecision) {

		super(ncbjAppBoardDecision);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjAppBoardDecisionId", getNcbjAppBoardDecisionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dateOfBoardDecision", getDateOfBoardDecision());
		attributes.put("committeeDecision", getCommitteeDecision());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjAppBoardDecisionId = (Long)attributes.get(
			"ncbjAppBoardDecisionId");

		if (ncbjAppBoardDecisionId != null) {
			setNcbjAppBoardDecisionId(ncbjAppBoardDecisionId);
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

		Date dateOfBoardDecision = (Date)attributes.get("dateOfBoardDecision");

		if (dateOfBoardDecision != null) {
			setDateOfBoardDecision(dateOfBoardDecision);
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
	public NcbjAppBoardDecision cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this ncbj app board decision.
	 *
	 * @return the case ID of this ncbj app board decision
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the committee decision of this ncbj app board decision.
	 *
	 * @return the committee decision of this ncbj app board decision
	 */
	@Override
	public String getCommitteeDecision() {
		return model.getCommitteeDecision();
	}

	/**
	 * Returns the company ID of this ncbj app board decision.
	 *
	 * @return the company ID of this ncbj app board decision
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj app board decision.
	 *
	 * @return the create date of this ncbj app board decision
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of board decision of this ncbj app board decision.
	 *
	 * @return the date of board decision of this ncbj app board decision
	 */
	@Override
	public Date getDateOfBoardDecision() {
		return model.getDateOfBoardDecision();
	}

	/**
	 * Returns the group ID of this ncbj app board decision.
	 *
	 * @return the group ID of this ncbj app board decision
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj app board decision.
	 *
	 * @return the modified date of this ncbj app board decision
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj app board decision ID of this ncbj app board decision.
	 *
	 * @return the ncbj app board decision ID of this ncbj app board decision
	 */
	@Override
	public long getNcbjAppBoardDecisionId() {
		return model.getNcbjAppBoardDecisionId();
	}

	/**
	 * Returns the primary key of this ncbj app board decision.
	 *
	 * @return the primary key of this ncbj app board decision
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncbj app board decision.
	 *
	 * @return the user ID of this ncbj app board decision
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj app board decision.
	 *
	 * @return the user name of this ncbj app board decision
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj app board decision.
	 *
	 * @return the user uuid of this ncbj app board decision
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
	 * Sets the case ID of this ncbj app board decision.
	 *
	 * @param caseId the case ID of this ncbj app board decision
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the committee decision of this ncbj app board decision.
	 *
	 * @param committeeDecision the committee decision of this ncbj app board decision
	 */
	@Override
	public void setCommitteeDecision(String committeeDecision) {
		model.setCommitteeDecision(committeeDecision);
	}

	/**
	 * Sets the company ID of this ncbj app board decision.
	 *
	 * @param companyId the company ID of this ncbj app board decision
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj app board decision.
	 *
	 * @param createDate the create date of this ncbj app board decision
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of board decision of this ncbj app board decision.
	 *
	 * @param dateOfBoardDecision the date of board decision of this ncbj app board decision
	 */
	@Override
	public void setDateOfBoardDecision(Date dateOfBoardDecision) {
		model.setDateOfBoardDecision(dateOfBoardDecision);
	}

	/**
	 * Sets the group ID of this ncbj app board decision.
	 *
	 * @param groupId the group ID of this ncbj app board decision
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj app board decision.
	 *
	 * @param modifiedDate the modified date of this ncbj app board decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj app board decision ID of this ncbj app board decision.
	 *
	 * @param ncbjAppBoardDecisionId the ncbj app board decision ID of this ncbj app board decision
	 */
	@Override
	public void setNcbjAppBoardDecisionId(long ncbjAppBoardDecisionId) {
		model.setNcbjAppBoardDecisionId(ncbjAppBoardDecisionId);
	}

	/**
	 * Sets the primary key of this ncbj app board decision.
	 *
	 * @param primaryKey the primary key of this ncbj app board decision
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncbj app board decision.
	 *
	 * @param userId the user ID of this ncbj app board decision
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj app board decision.
	 *
	 * @param userName the user name of this ncbj app board decision
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj app board decision.
	 *
	 * @param userUuid the user uuid of this ncbj app board decision
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
	protected NcbjAppBoardDecisionWrapper wrap(
		NcbjAppBoardDecision ncbjAppBoardDecision) {

		return new NcbjAppBoardDecisionWrapper(ncbjAppBoardDecision);
	}

}