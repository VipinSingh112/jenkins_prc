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
 * This class is a wrapper for {@link MiningApplicationDueDiligence}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDueDiligence
 * @generated
 */
public class MiningApplicationDueDiligenceWrapper
	extends BaseModelWrapper<MiningApplicationDueDiligence>
	implements MiningApplicationDueDiligence,
			   ModelWrapper<MiningApplicationDueDiligence> {

	public MiningApplicationDueDiligenceWrapper(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		super(miningApplicationDueDiligence);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("miningDueDiliId", getMiningDueDiliId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("agencyName", getAgencyName());
		attributes.put("feedbackReceived", getFeedbackReceived());
		attributes.put("status", getStatus());
		attributes.put("isSubToAgency", getIsSubToAgency());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long miningDueDiliId = (Long)attributes.get("miningDueDiliId");

		if (miningDueDiliId != null) {
			setMiningDueDiliId(miningDueDiliId);
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

		String agencyName = (String)attributes.get("agencyName");

		if (agencyName != null) {
			setAgencyName(agencyName);
		}

		String feedbackReceived = (String)attributes.get("feedbackReceived");

		if (feedbackReceived != null) {
			setFeedbackReceived(feedbackReceived);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String isSubToAgency = (String)attributes.get("isSubToAgency");

		if (isSubToAgency != null) {
			setIsSubToAgency(isSubToAgency);
		}
	}

	@Override
	public MiningApplicationDueDiligence cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the agency name of this mining application due diligence.
	 *
	 * @return the agency name of this mining application due diligence
	 */
	@Override
	public String getAgencyName() {
		return model.getAgencyName();
	}

	/**
	 * Returns the case ID of this mining application due diligence.
	 *
	 * @return the case ID of this mining application due diligence
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this mining application due diligence.
	 *
	 * @return the company ID of this mining application due diligence
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this mining application due diligence.
	 *
	 * @return the create date of this mining application due diligence
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the feedback received of this mining application due diligence.
	 *
	 * @return the feedback received of this mining application due diligence
	 */
	@Override
	public String getFeedbackReceived() {
		return model.getFeedbackReceived();
	}

	/**
	 * Returns the group ID of this mining application due diligence.
	 *
	 * @return the group ID of this mining application due diligence
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the is sub to agency of this mining application due diligence.
	 *
	 * @return the is sub to agency of this mining application due diligence
	 */
	@Override
	public String getIsSubToAgency() {
		return model.getIsSubToAgency();
	}

	/**
	 * Returns the mining due dili ID of this mining application due diligence.
	 *
	 * @return the mining due dili ID of this mining application due diligence
	 */
	@Override
	public long getMiningDueDiliId() {
		return model.getMiningDueDiliId();
	}

	/**
	 * Returns the modified date of this mining application due diligence.
	 *
	 * @return the modified date of this mining application due diligence
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this mining application due diligence.
	 *
	 * @return the primary key of this mining application due diligence
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this mining application due diligence.
	 *
	 * @return the status of this mining application due diligence
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this mining application due diligence.
	 *
	 * @return the user ID of this mining application due diligence
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining application due diligence.
	 *
	 * @return the user name of this mining application due diligence
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining application due diligence.
	 *
	 * @return the user uuid of this mining application due diligence
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this mining application due diligence.
	 *
	 * @return the uuid of this mining application due diligence
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
	 * Sets the agency name of this mining application due diligence.
	 *
	 * @param agencyName the agency name of this mining application due diligence
	 */
	@Override
	public void setAgencyName(String agencyName) {
		model.setAgencyName(agencyName);
	}

	/**
	 * Sets the case ID of this mining application due diligence.
	 *
	 * @param caseId the case ID of this mining application due diligence
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this mining application due diligence.
	 *
	 * @param companyId the company ID of this mining application due diligence
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this mining application due diligence.
	 *
	 * @param createDate the create date of this mining application due diligence
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the feedback received of this mining application due diligence.
	 *
	 * @param feedbackReceived the feedback received of this mining application due diligence
	 */
	@Override
	public void setFeedbackReceived(String feedbackReceived) {
		model.setFeedbackReceived(feedbackReceived);
	}

	/**
	 * Sets the group ID of this mining application due diligence.
	 *
	 * @param groupId the group ID of this mining application due diligence
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the is sub to agency of this mining application due diligence.
	 *
	 * @param isSubToAgency the is sub to agency of this mining application due diligence
	 */
	@Override
	public void setIsSubToAgency(String isSubToAgency) {
		model.setIsSubToAgency(isSubToAgency);
	}

	/**
	 * Sets the mining due dili ID of this mining application due diligence.
	 *
	 * @param miningDueDiliId the mining due dili ID of this mining application due diligence
	 */
	@Override
	public void setMiningDueDiliId(long miningDueDiliId) {
		model.setMiningDueDiliId(miningDueDiliId);
	}

	/**
	 * Sets the modified date of this mining application due diligence.
	 *
	 * @param modifiedDate the modified date of this mining application due diligence
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this mining application due diligence.
	 *
	 * @param primaryKey the primary key of this mining application due diligence
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this mining application due diligence.
	 *
	 * @param status the status of this mining application due diligence
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this mining application due diligence.
	 *
	 * @param userId the user ID of this mining application due diligence
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining application due diligence.
	 *
	 * @param userName the user name of this mining application due diligence
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining application due diligence.
	 *
	 * @param userUuid the user uuid of this mining application due diligence
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this mining application due diligence.
	 *
	 * @param uuid the uuid of this mining application due diligence
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
	protected MiningApplicationDueDiligenceWrapper wrap(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		return new MiningApplicationDueDiligenceWrapper(
			miningApplicationDueDiligence);
	}

}