/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FullLicenseCommitteeDecision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FullLicenseCommitteeDecision
 * @generated
 */
public class FullLicenseCommitteeDecisionWrapper
	extends BaseModelWrapper<FullLicenseCommitteeDecision>
	implements FullLicenseCommitteeDecision,
			   ModelWrapper<FullLicenseCommitteeDecision> {

	public FullLicenseCommitteeDecisionWrapper(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		super(fullLicenseCommitteeDecision);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fullLicenseCommitteeDecisionId",
			getFullLicenseCommitteeDecisionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("licenseFeeDue", getLicenseFeeDue());
		attributes.put("bondFeeDue", getBondFeeDue());
		attributes.put("committeeDecision", getCommitteeDecision());
		attributes.put("totalAmountDue", getTotalAmountDue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fullLicenseCommitteeDecisionId = (Long)attributes.get(
			"fullLicenseCommitteeDecisionId");

		if (fullLicenseCommitteeDecisionId != null) {
			setFullLicenseCommitteeDecisionId(fullLicenseCommitteeDecisionId);
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

		String licenseFeeDue = (String)attributes.get("licenseFeeDue");

		if (licenseFeeDue != null) {
			setLicenseFeeDue(licenseFeeDue);
		}

		String bondFeeDue = (String)attributes.get("bondFeeDue");

		if (bondFeeDue != null) {
			setBondFeeDue(bondFeeDue);
		}

		String committeeDecision = (String)attributes.get("committeeDecision");

		if (committeeDecision != null) {
			setCommitteeDecision(committeeDecision);
		}

		Long totalAmountDue = (Long)attributes.get("totalAmountDue");

		if (totalAmountDue != null) {
			setTotalAmountDue(totalAmountDue);
		}
	}

	@Override
	public FullLicenseCommitteeDecision cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bond fee due of this full license committee decision.
	 *
	 * @return the bond fee due of this full license committee decision
	 */
	@Override
	public String getBondFeeDue() {
		return model.getBondFeeDue();
	}

	/**
	 * Returns the case ID of this full license committee decision.
	 *
	 * @return the case ID of this full license committee decision
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the committee decision of this full license committee decision.
	 *
	 * @return the committee decision of this full license committee decision
	 */
	@Override
	public String getCommitteeDecision() {
		return model.getCommitteeDecision();
	}

	/**
	 * Returns the company ID of this full license committee decision.
	 *
	 * @return the company ID of this full license committee decision
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this full license committee decision.
	 *
	 * @return the create date of this full license committee decision
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the full license committee decision ID of this full license committee decision.
	 *
	 * @return the full license committee decision ID of this full license committee decision
	 */
	@Override
	public long getFullLicenseCommitteeDecisionId() {
		return model.getFullLicenseCommitteeDecisionId();
	}

	/**
	 * Returns the group ID of this full license committee decision.
	 *
	 * @return the group ID of this full license committee decision
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the license fee due of this full license committee decision.
	 *
	 * @return the license fee due of this full license committee decision
	 */
	@Override
	public String getLicenseFeeDue() {
		return model.getLicenseFeeDue();
	}

	/**
	 * Returns the modified date of this full license committee decision.
	 *
	 * @return the modified date of this full license committee decision
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this full license committee decision.
	 *
	 * @return the primary key of this full license committee decision
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the total amount due of this full license committee decision.
	 *
	 * @return the total amount due of this full license committee decision
	 */
	@Override
	public long getTotalAmountDue() {
		return model.getTotalAmountDue();
	}

	/**
	 * Returns the user ID of this full license committee decision.
	 *
	 * @return the user ID of this full license committee decision
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this full license committee decision.
	 *
	 * @return the user name of this full license committee decision
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this full license committee decision.
	 *
	 * @return the user uuid of this full license committee decision
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
	 * Sets the bond fee due of this full license committee decision.
	 *
	 * @param bondFeeDue the bond fee due of this full license committee decision
	 */
	@Override
	public void setBondFeeDue(String bondFeeDue) {
		model.setBondFeeDue(bondFeeDue);
	}

	/**
	 * Sets the case ID of this full license committee decision.
	 *
	 * @param caseId the case ID of this full license committee decision
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the committee decision of this full license committee decision.
	 *
	 * @param committeeDecision the committee decision of this full license committee decision
	 */
	@Override
	public void setCommitteeDecision(String committeeDecision) {
		model.setCommitteeDecision(committeeDecision);
	}

	/**
	 * Sets the company ID of this full license committee decision.
	 *
	 * @param companyId the company ID of this full license committee decision
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this full license committee decision.
	 *
	 * @param createDate the create date of this full license committee decision
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the full license committee decision ID of this full license committee decision.
	 *
	 * @param fullLicenseCommitteeDecisionId the full license committee decision ID of this full license committee decision
	 */
	@Override
	public void setFullLicenseCommitteeDecisionId(
		long fullLicenseCommitteeDecisionId) {

		model.setFullLicenseCommitteeDecisionId(fullLicenseCommitteeDecisionId);
	}

	/**
	 * Sets the group ID of this full license committee decision.
	 *
	 * @param groupId the group ID of this full license committee decision
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the license fee due of this full license committee decision.
	 *
	 * @param licenseFeeDue the license fee due of this full license committee decision
	 */
	@Override
	public void setLicenseFeeDue(String licenseFeeDue) {
		model.setLicenseFeeDue(licenseFeeDue);
	}

	/**
	 * Sets the modified date of this full license committee decision.
	 *
	 * @param modifiedDate the modified date of this full license committee decision
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this full license committee decision.
	 *
	 * @param primaryKey the primary key of this full license committee decision
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the total amount due of this full license committee decision.
	 *
	 * @param totalAmountDue the total amount due of this full license committee decision
	 */
	@Override
	public void setTotalAmountDue(long totalAmountDue) {
		model.setTotalAmountDue(totalAmountDue);
	}

	/**
	 * Sets the user ID of this full license committee decision.
	 *
	 * @param userId the user ID of this full license committee decision
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this full license committee decision.
	 *
	 * @param userName the user name of this full license committee decision
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this full license committee decision.
	 *
	 * @param userUuid the user uuid of this full license committee decision
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
	protected FullLicenseCommitteeDecisionWrapper wrap(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return new FullLicenseCommitteeDecisionWrapper(
			fullLicenseCommitteeDecision);
	}

}