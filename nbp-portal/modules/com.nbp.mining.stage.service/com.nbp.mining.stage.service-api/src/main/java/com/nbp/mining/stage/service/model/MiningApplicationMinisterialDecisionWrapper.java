/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiningApplicationMinisterialDecision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationMinisterialDecision
 * @generated
 */
public class MiningApplicationMinisterialDecisionWrapper
	extends BaseModelWrapper<MiningApplicationMinisterialDecision>
	implements MiningApplicationMinisterialDecision,
			   ModelWrapper<MiningApplicationMinisterialDecision> {

	public MiningApplicationMinisterialDecisionWrapper(
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision) {

		super(miningApplicationMinisterialDecision);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("miningDecId", getMiningDecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("dateOfCommDec", getDateOfCommDec());
		attributes.put("commDecision", getCommDecision());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long miningDecId = (Long)attributes.get("miningDecId");

		if (miningDecId != null) {
			setMiningDecId(miningDecId);
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

		Date dateOfCommDec = (Date)attributes.get("dateOfCommDec");

		if (dateOfCommDec != null) {
			setDateOfCommDec(dateOfCommDec);
		}

		String commDecision = (String)attributes.get("commDecision");

		if (commDecision != null) {
			setCommDecision(commDecision);
		}
	}

	@Override
	public MiningApplicationMinisterialDecision cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this mining application ministerial decision.
	 *
	 * @return the case ID of this mining application ministerial decision
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the comm decision of this mining application ministerial decision.
	 *
	 * @return the comm decision of this mining application ministerial decision
	 */
	@Override
	public String getCommDecision() {
		return model.getCommDecision();
	}

	/**
	 * Returns the company ID of this mining application ministerial decision.
	 *
	 * @return the company ID of this mining application ministerial decision
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this mining application ministerial decision.
	 *
	 * @return the create date of this mining application ministerial decision
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of comm dec of this mining application ministerial decision.
	 *
	 * @return the date of comm dec of this mining application ministerial decision
	 */
	@Override
	public Date getDateOfCommDec() {
		return model.getDateOfCommDec();
	}

	/**
	 * Returns the group ID of this mining application ministerial decision.
	 *
	 * @return the group ID of this mining application ministerial decision
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mining dec ID of this mining application ministerial decision.
	 *
	 * @return the mining dec ID of this mining application ministerial decision
	 */
	@Override
	public long getMiningDecId() {
		return model.getMiningDecId();
	}

	/**
	 * Returns the modified date of this mining application ministerial decision.
	 *
	 * @return the modified date of this mining application ministerial decision
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this mining application ministerial decision.
	 *
	 * @return the primary key of this mining application ministerial decision
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this mining application ministerial decision.
	 *
	 * @return the user ID of this mining application ministerial decision
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining application ministerial decision.
	 *
	 * @return the user name of this mining application ministerial decision
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining application ministerial decision.
	 *
	 * @return the user uuid of this mining application ministerial decision
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this mining application ministerial decision.
	 *
	 * @return the uuid of this mining application ministerial decision
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
	 * Sets the case ID of this mining application ministerial decision.
	 *
	 * @param caseId the case ID of this mining application ministerial decision
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the comm decision of this mining application ministerial decision.
	 *
	 * @param commDecision the comm decision of this mining application ministerial decision
	 */
	@Override
	public void setCommDecision(String commDecision) {
		model.setCommDecision(commDecision);
	}

	/**
	 * Sets the company ID of this mining application ministerial decision.
	 *
	 * @param companyId the company ID of this mining application ministerial decision
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this mining application ministerial decision.
	 *
	 * @param createDate the create date of this mining application ministerial decision
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of comm dec of this mining application ministerial decision.
	 *
	 * @param dateOfCommDec the date of comm dec of this mining application ministerial decision
	 */
	@Override
	public void setDateOfCommDec(Date dateOfCommDec) {
		model.setDateOfCommDec(dateOfCommDec);
	}

	/**
	 * Sets the group ID of this mining application ministerial decision.
	 *
	 * @param groupId the group ID of this mining application ministerial decision
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mining dec ID of this mining application ministerial decision.
	 *
	 * @param miningDecId the mining dec ID of this mining application ministerial decision
	 */
	@Override
	public void setMiningDecId(long miningDecId) {
		model.setMiningDecId(miningDecId);
	}

	/**
	 * Sets the modified date of this mining application ministerial decision.
	 *
	 * @param modifiedDate the modified date of this mining application ministerial decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this mining application ministerial decision.
	 *
	 * @param primaryKey the primary key of this mining application ministerial decision
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this mining application ministerial decision.
	 *
	 * @param userId the user ID of this mining application ministerial decision
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining application ministerial decision.
	 *
	 * @param userName the user name of this mining application ministerial decision
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining application ministerial decision.
	 *
	 * @param userUuid the user uuid of this mining application ministerial decision
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this mining application ministerial decision.
	 *
	 * @param uuid the uuid of this mining application ministerial decision
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
	protected MiningApplicationMinisterialDecisionWrapper wrap(
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision) {

		return new MiningApplicationMinisterialDecisionWrapper(
			miningApplicationMinisterialDecision);
	}

}