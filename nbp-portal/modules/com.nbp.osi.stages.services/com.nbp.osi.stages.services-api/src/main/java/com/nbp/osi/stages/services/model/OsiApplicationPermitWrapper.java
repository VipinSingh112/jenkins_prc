/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiApplicationPermit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationPermit
 * @generated
 */
public class OsiApplicationPermitWrapper
	extends BaseModelWrapper<OsiApplicationPermit>
	implements ModelWrapper<OsiApplicationPermit>, OsiApplicationPermit {

	public OsiApplicationPermitWrapper(
		OsiApplicationPermit osiApplicationPermit) {

		super(osiApplicationPermit);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiApplicationPermitId", getOsiApplicationPermitId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("decision", getDecision());
		attributes.put("dateOfDecision", getDateOfDecision());
		attributes.put("dateOfIssue", getDateOfIssue());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("permitNumber", getPermitNumber());
		attributes.put("fileEntryId", getFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiApplicationPermitId = (Long)attributes.get(
			"osiApplicationPermitId");

		if (osiApplicationPermitId != null) {
			setOsiApplicationPermitId(osiApplicationPermitId);
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

		String decision = (String)attributes.get("decision");

		if (decision != null) {
			setDecision(decision);
		}

		Date dateOfDecision = (Date)attributes.get("dateOfDecision");

		if (dateOfDecision != null) {
			setDateOfDecision(dateOfDecision);
		}

		Date dateOfIssue = (Date)attributes.get("dateOfIssue");

		if (dateOfIssue != null) {
			setDateOfIssue(dateOfIssue);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		String permitNumber = (String)attributes.get("permitNumber");

		if (permitNumber != null) {
			setPermitNumber(permitNumber);
		}

		String fileEntryId = (String)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}
	}

	@Override
	public OsiApplicationPermit cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this osi application permit.
	 *
	 * @return the case ID of this osi application permit
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this osi application permit.
	 *
	 * @return the company ID of this osi application permit
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi application permit.
	 *
	 * @return the create date of this osi application permit
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of decision of this osi application permit.
	 *
	 * @return the date of decision of this osi application permit
	 */
	@Override
	public Date getDateOfDecision() {
		return model.getDateOfDecision();
	}

	/**
	 * Returns the date of expiration of this osi application permit.
	 *
	 * @return the date of expiration of this osi application permit
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the date of issue of this osi application permit.
	 *
	 * @return the date of issue of this osi application permit
	 */
	@Override
	public Date getDateOfIssue() {
		return model.getDateOfIssue();
	}

	/**
	 * Returns the decision of this osi application permit.
	 *
	 * @return the decision of this osi application permit
	 */
	@Override
	public String getDecision() {
		return model.getDecision();
	}

	/**
	 * Returns the file entry ID of this osi application permit.
	 *
	 * @return the file entry ID of this osi application permit
	 */
	@Override
	public String getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the group ID of this osi application permit.
	 *
	 * @return the group ID of this osi application permit
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi application permit.
	 *
	 * @return the modified date of this osi application permit
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi application permit ID of this osi application permit.
	 *
	 * @return the osi application permit ID of this osi application permit
	 */
	@Override
	public long getOsiApplicationPermitId() {
		return model.getOsiApplicationPermitId();
	}

	/**
	 * Returns the permit number of this osi application permit.
	 *
	 * @return the permit number of this osi application permit
	 */
	@Override
	public String getPermitNumber() {
		return model.getPermitNumber();
	}

	/**
	 * Returns the primary key of this osi application permit.
	 *
	 * @return the primary key of this osi application permit
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi application permit.
	 *
	 * @return the user ID of this osi application permit
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi application permit.
	 *
	 * @return the user name of this osi application permit
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi application permit.
	 *
	 * @return the user uuid of this osi application permit
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
	 * Sets the case ID of this osi application permit.
	 *
	 * @param caseId the case ID of this osi application permit
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this osi application permit.
	 *
	 * @param companyId the company ID of this osi application permit
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi application permit.
	 *
	 * @param createDate the create date of this osi application permit
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of decision of this osi application permit.
	 *
	 * @param dateOfDecision the date of decision of this osi application permit
	 */
	@Override
	public void setDateOfDecision(Date dateOfDecision) {
		model.setDateOfDecision(dateOfDecision);
	}

	/**
	 * Sets the date of expiration of this osi application permit.
	 *
	 * @param dateOfExpiration the date of expiration of this osi application permit
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the date of issue of this osi application permit.
	 *
	 * @param dateOfIssue the date of issue of this osi application permit
	 */
	@Override
	public void setDateOfIssue(Date dateOfIssue) {
		model.setDateOfIssue(dateOfIssue);
	}

	/**
	 * Sets the decision of this osi application permit.
	 *
	 * @param decision the decision of this osi application permit
	 */
	@Override
	public void setDecision(String decision) {
		model.setDecision(decision);
	}

	/**
	 * Sets the file entry ID of this osi application permit.
	 *
	 * @param fileEntryId the file entry ID of this osi application permit
	 */
	@Override
	public void setFileEntryId(String fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the group ID of this osi application permit.
	 *
	 * @param groupId the group ID of this osi application permit
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi application permit.
	 *
	 * @param modifiedDate the modified date of this osi application permit
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi application permit ID of this osi application permit.
	 *
	 * @param osiApplicationPermitId the osi application permit ID of this osi application permit
	 */
	@Override
	public void setOsiApplicationPermitId(long osiApplicationPermitId) {
		model.setOsiApplicationPermitId(osiApplicationPermitId);
	}

	/**
	 * Sets the permit number of this osi application permit.
	 *
	 * @param permitNumber the permit number of this osi application permit
	 */
	@Override
	public void setPermitNumber(String permitNumber) {
		model.setPermitNumber(permitNumber);
	}

	/**
	 * Sets the primary key of this osi application permit.
	 *
	 * @param primaryKey the primary key of this osi application permit
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi application permit.
	 *
	 * @param userId the user ID of this osi application permit
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi application permit.
	 *
	 * @param userName the user name of this osi application permit
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi application permit.
	 *
	 * @param userUuid the user uuid of this osi application permit
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
	protected OsiApplicationPermitWrapper wrap(
		OsiApplicationPermit osiApplicationPermit) {

		return new OsiApplicationPermitWrapper(osiApplicationPermit);
	}

}