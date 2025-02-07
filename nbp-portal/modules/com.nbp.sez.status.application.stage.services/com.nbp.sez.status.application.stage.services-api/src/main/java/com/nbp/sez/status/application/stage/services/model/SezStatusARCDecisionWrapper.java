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
 * This class is a wrapper for {@link SezStatusARCDecision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusARCDecision
 * @generated
 */
public class SezStatusARCDecisionWrapper
	extends BaseModelWrapper<SezStatusARCDecision>
	implements ModelWrapper<SezStatusARCDecision>, SezStatusARCDecision {

	public SezStatusARCDecisionWrapper(
		SezStatusARCDecision sezStatusARCDecision) {

		super(sezStatusARCDecision);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sezStatusCommitteeId", getSezStatusCommitteeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("committeeDecision", getCommitteeDecision());
		attributes.put("committeeDecisionDate", getCommitteeDecisionDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sezStatusCommitteeId = (Long)attributes.get(
			"sezStatusCommitteeId");

		if (sezStatusCommitteeId != null) {
			setSezStatusCommitteeId(sezStatusCommitteeId);
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

		String committeeDecision = (String)attributes.get("committeeDecision");

		if (committeeDecision != null) {
			setCommitteeDecision(committeeDecision);
		}

		Date committeeDecisionDate = (Date)attributes.get(
			"committeeDecisionDate");

		if (committeeDecisionDate != null) {
			setCommitteeDecisionDate(committeeDecisionDate);
		}
	}

	@Override
	public SezStatusARCDecision cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this sez status arc decision.
	 *
	 * @return the case ID of this sez status arc decision
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the committee decision of this sez status arc decision.
	 *
	 * @return the committee decision of this sez status arc decision
	 */
	@Override
	public String getCommitteeDecision() {
		return model.getCommitteeDecision();
	}

	/**
	 * Returns the committee decision date of this sez status arc decision.
	 *
	 * @return the committee decision date of this sez status arc decision
	 */
	@Override
	public Date getCommitteeDecisionDate() {
		return model.getCommitteeDecisionDate();
	}

	/**
	 * Returns the company ID of this sez status arc decision.
	 *
	 * @return the company ID of this sez status arc decision
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez status arc decision.
	 *
	 * @return the create date of this sez status arc decision
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez status arc decision.
	 *
	 * @return the group ID of this sez status arc decision
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez status arc decision.
	 *
	 * @return the modified date of this sez status arc decision
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez status arc decision.
	 *
	 * @return the primary key of this sez status arc decision
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status committee ID of this sez status arc decision.
	 *
	 * @return the sez status committee ID of this sez status arc decision
	 */
	@Override
	public long getSezStatusCommitteeId() {
		return model.getSezStatusCommitteeId();
	}

	/**
	 * Returns the user ID of this sez status arc decision.
	 *
	 * @return the user ID of this sez status arc decision
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez status arc decision.
	 *
	 * @return the user name of this sez status arc decision
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez status arc decision.
	 *
	 * @return the user uuid of this sez status arc decision
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this sez status arc decision.
	 *
	 * @return the uuid of this sez status arc decision
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
	 * Sets the case ID of this sez status arc decision.
	 *
	 * @param caseId the case ID of this sez status arc decision
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the committee decision of this sez status arc decision.
	 *
	 * @param committeeDecision the committee decision of this sez status arc decision
	 */
	@Override
	public void setCommitteeDecision(String committeeDecision) {
		model.setCommitteeDecision(committeeDecision);
	}

	/**
	 * Sets the committee decision date of this sez status arc decision.
	 *
	 * @param committeeDecisionDate the committee decision date of this sez status arc decision
	 */
	@Override
	public void setCommitteeDecisionDate(Date committeeDecisionDate) {
		model.setCommitteeDecisionDate(committeeDecisionDate);
	}

	/**
	 * Sets the company ID of this sez status arc decision.
	 *
	 * @param companyId the company ID of this sez status arc decision
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez status arc decision.
	 *
	 * @param createDate the create date of this sez status arc decision
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez status arc decision.
	 *
	 * @param groupId the group ID of this sez status arc decision
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez status arc decision.
	 *
	 * @param modifiedDate the modified date of this sez status arc decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez status arc decision.
	 *
	 * @param primaryKey the primary key of this sez status arc decision
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status committee ID of this sez status arc decision.
	 *
	 * @param sezStatusCommitteeId the sez status committee ID of this sez status arc decision
	 */
	@Override
	public void setSezStatusCommitteeId(long sezStatusCommitteeId) {
		model.setSezStatusCommitteeId(sezStatusCommitteeId);
	}

	/**
	 * Sets the user ID of this sez status arc decision.
	 *
	 * @param userId the user ID of this sez status arc decision
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez status arc decision.
	 *
	 * @param userName the user name of this sez status arc decision
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez status arc decision.
	 *
	 * @param userUuid the user uuid of this sez status arc decision
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this sez status arc decision.
	 *
	 * @param uuid the uuid of this sez status arc decision
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
	protected SezStatusARCDecisionWrapper wrap(
		SezStatusARCDecision sezStatusARCDecision) {

		return new SezStatusARCDecisionWrapper(sezStatusARCDecision);
	}

}