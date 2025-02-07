/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezStatusBoardDecision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecision
 * @generated
 */
public class SezStatusBoardDecisionWrapper
	extends BaseModelWrapper<SezStatusBoardDecision>
	implements ModelWrapper<SezStatusBoardDecision>, SezStatusBoardDecision {

	public SezStatusBoardDecisionWrapper(
		SezStatusBoardDecision sezStatusBoardDecision) {

		super(sezStatusBoardDecision);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sezStatusBoardId", getSezStatusBoardId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("boardDecision", getBoardDecision());
		attributes.put("boardDecisionDate", getBoardDecisionDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sezStatusBoardId = (Long)attributes.get("sezStatusBoardId");

		if (sezStatusBoardId != null) {
			setSezStatusBoardId(sezStatusBoardId);
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

		String boardDecision = (String)attributes.get("boardDecision");

		if (boardDecision != null) {
			setBoardDecision(boardDecision);
		}

		Date boardDecisionDate = (Date)attributes.get("boardDecisionDate");

		if (boardDecisionDate != null) {
			setBoardDecisionDate(boardDecisionDate);
		}
	}

	@Override
	public SezStatusBoardDecision cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the board decision of this sez status board decision.
	 *
	 * @return the board decision of this sez status board decision
	 */
	@Override
	public String getBoardDecision() {
		return model.getBoardDecision();
	}

	/**
	 * Returns the board decision date of this sez status board decision.
	 *
	 * @return the board decision date of this sez status board decision
	 */
	@Override
	public Date getBoardDecisionDate() {
		return model.getBoardDecisionDate();
	}

	/**
	 * Returns the case ID of this sez status board decision.
	 *
	 * @return the case ID of this sez status board decision
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this sez status board decision.
	 *
	 * @return the company ID of this sez status board decision
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez status board decision.
	 *
	 * @return the create date of this sez status board decision
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez status board decision.
	 *
	 * @return the group ID of this sez status board decision
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez status board decision.
	 *
	 * @return the modified date of this sez status board decision
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez status board decision.
	 *
	 * @return the primary key of this sez status board decision
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status board ID of this sez status board decision.
	 *
	 * @return the sez status board ID of this sez status board decision
	 */
	@Override
	public long getSezStatusBoardId() {
		return model.getSezStatusBoardId();
	}

	/**
	 * Returns the user ID of this sez status board decision.
	 *
	 * @return the user ID of this sez status board decision
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez status board decision.
	 *
	 * @return the user name of this sez status board decision
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez status board decision.
	 *
	 * @return the user uuid of this sez status board decision
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this sez status board decision.
	 *
	 * @return the uuid of this sez status board decision
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
	 * Sets the board decision of this sez status board decision.
	 *
	 * @param boardDecision the board decision of this sez status board decision
	 */
	@Override
	public void setBoardDecision(String boardDecision) {
		model.setBoardDecision(boardDecision);
	}

	/**
	 * Sets the board decision date of this sez status board decision.
	 *
	 * @param boardDecisionDate the board decision date of this sez status board decision
	 */
	@Override
	public void setBoardDecisionDate(Date boardDecisionDate) {
		model.setBoardDecisionDate(boardDecisionDate);
	}

	/**
	 * Sets the case ID of this sez status board decision.
	 *
	 * @param caseId the case ID of this sez status board decision
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this sez status board decision.
	 *
	 * @param companyId the company ID of this sez status board decision
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez status board decision.
	 *
	 * @param createDate the create date of this sez status board decision
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez status board decision.
	 *
	 * @param groupId the group ID of this sez status board decision
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez status board decision.
	 *
	 * @param modifiedDate the modified date of this sez status board decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez status board decision.
	 *
	 * @param primaryKey the primary key of this sez status board decision
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status board ID of this sez status board decision.
	 *
	 * @param sezStatusBoardId the sez status board ID of this sez status board decision
	 */
	@Override
	public void setSezStatusBoardId(long sezStatusBoardId) {
		model.setSezStatusBoardId(sezStatusBoardId);
	}

	/**
	 * Sets the user ID of this sez status board decision.
	 *
	 * @param userId the user ID of this sez status board decision
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez status board decision.
	 *
	 * @param userName the user name of this sez status board decision
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez status board decision.
	 *
	 * @param userUuid the user uuid of this sez status board decision
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this sez status board decision.
	 *
	 * @param uuid the uuid of this sez status board decision
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
	protected SezStatusBoardDecisionWrapper wrap(
		SezStatusBoardDecision sezStatusBoardDecision) {

		return new SezStatusBoardDecisionWrapper(sezStatusBoardDecision);
	}

}