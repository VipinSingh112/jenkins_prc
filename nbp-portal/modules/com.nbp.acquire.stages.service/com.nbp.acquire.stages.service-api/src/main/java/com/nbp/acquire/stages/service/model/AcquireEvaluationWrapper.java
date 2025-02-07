/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireEvaluation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireEvaluation
 * @generated
 */
public class AcquireEvaluationWrapper
	extends BaseModelWrapper<AcquireEvaluation>
	implements AcquireEvaluation, ModelWrapper<AcquireEvaluation> {

	public AcquireEvaluationWrapper(AcquireEvaluation acquireEvaluation) {
		super(acquireEvaluation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireEvaluationId", getAcquireEvaluationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("typeOfCommittee", getTypeOfCommittee());
		attributes.put("dateOfCommitteeDecision", getDateOfCommitteeDecision());
		attributes.put("committeeDecision", getCommitteeDecision());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireEvaluationId = (Long)attributes.get("acquireEvaluationId");

		if (acquireEvaluationId != null) {
			setAcquireEvaluationId(acquireEvaluationId);
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

		String typeOfCommittee = (String)attributes.get("typeOfCommittee");

		if (typeOfCommittee != null) {
			setTypeOfCommittee(typeOfCommittee);
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
	}

	@Override
	public AcquireEvaluation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire evaluation ID of this acquire evaluation.
	 *
	 * @return the acquire evaluation ID of this acquire evaluation
	 */
	@Override
	public long getAcquireEvaluationId() {
		return model.getAcquireEvaluationId();
	}

	/**
	 * Returns the case ID of this acquire evaluation.
	 *
	 * @return the case ID of this acquire evaluation
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the committee decision of this acquire evaluation.
	 *
	 * @return the committee decision of this acquire evaluation
	 */
	@Override
	public String getCommitteeDecision() {
		return model.getCommitteeDecision();
	}

	/**
	 * Returns the company ID of this acquire evaluation.
	 *
	 * @return the company ID of this acquire evaluation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire evaluation.
	 *
	 * @return the create date of this acquire evaluation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of committee decision of this acquire evaluation.
	 *
	 * @return the date of committee decision of this acquire evaluation
	 */
	@Override
	public Date getDateOfCommitteeDecision() {
		return model.getDateOfCommitteeDecision();
	}

	/**
	 * Returns the group ID of this acquire evaluation.
	 *
	 * @return the group ID of this acquire evaluation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire evaluation.
	 *
	 * @return the modified date of this acquire evaluation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire evaluation.
	 *
	 * @return the primary key of this acquire evaluation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of committee of this acquire evaluation.
	 *
	 * @return the type of committee of this acquire evaluation
	 */
	@Override
	public String getTypeOfCommittee() {
		return model.getTypeOfCommittee();
	}

	/**
	 * Returns the user ID of this acquire evaluation.
	 *
	 * @return the user ID of this acquire evaluation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire evaluation.
	 *
	 * @return the user name of this acquire evaluation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire evaluation.
	 *
	 * @return the user uuid of this acquire evaluation
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
	 * Sets the acquire evaluation ID of this acquire evaluation.
	 *
	 * @param acquireEvaluationId the acquire evaluation ID of this acquire evaluation
	 */
	@Override
	public void setAcquireEvaluationId(long acquireEvaluationId) {
		model.setAcquireEvaluationId(acquireEvaluationId);
	}

	/**
	 * Sets the case ID of this acquire evaluation.
	 *
	 * @param caseId the case ID of this acquire evaluation
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the committee decision of this acquire evaluation.
	 *
	 * @param committeeDecision the committee decision of this acquire evaluation
	 */
	@Override
	public void setCommitteeDecision(String committeeDecision) {
		model.setCommitteeDecision(committeeDecision);
	}

	/**
	 * Sets the company ID of this acquire evaluation.
	 *
	 * @param companyId the company ID of this acquire evaluation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire evaluation.
	 *
	 * @param createDate the create date of this acquire evaluation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of committee decision of this acquire evaluation.
	 *
	 * @param dateOfCommitteeDecision the date of committee decision of this acquire evaluation
	 */
	@Override
	public void setDateOfCommitteeDecision(Date dateOfCommitteeDecision) {
		model.setDateOfCommitteeDecision(dateOfCommitteeDecision);
	}

	/**
	 * Sets the group ID of this acquire evaluation.
	 *
	 * @param groupId the group ID of this acquire evaluation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire evaluation.
	 *
	 * @param modifiedDate the modified date of this acquire evaluation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire evaluation.
	 *
	 * @param primaryKey the primary key of this acquire evaluation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of committee of this acquire evaluation.
	 *
	 * @param typeOfCommittee the type of committee of this acquire evaluation
	 */
	@Override
	public void setTypeOfCommittee(String typeOfCommittee) {
		model.setTypeOfCommittee(typeOfCommittee);
	}

	/**
	 * Sets the user ID of this acquire evaluation.
	 *
	 * @param userId the user ID of this acquire evaluation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire evaluation.
	 *
	 * @param userName the user name of this acquire evaluation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire evaluation.
	 *
	 * @param userUuid the user uuid of this acquire evaluation
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
	protected AcquireEvaluationWrapper wrap(
		AcquireEvaluation acquireEvaluation) {

		return new AcquireEvaluationWrapper(acquireEvaluation);
	}

}