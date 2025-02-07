/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JadscApplicationInitiateInvestigation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationInitiateInvestigation
 * @generated
 */
public class JadscApplicationInitiateInvestigationWrapper
	extends BaseModelWrapper<JadscApplicationInitiateInvestigation>
	implements JadscApplicationInitiateInvestigation,
			   ModelWrapper<JadscApplicationInitiateInvestigation> {

	public JadscApplicationInitiateInvestigationWrapper(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		super(jadscApplicationInitiateInvestigation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jadscAppliInvestiId", getJadscAppliInvestiId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dateOfIniInvest", getDateOfIniInvest());
		attributes.put("outcome", getOutcome());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jadscAppliInvestiId = (Long)attributes.get("jadscAppliInvestiId");

		if (jadscAppliInvestiId != null) {
			setJadscAppliInvestiId(jadscAppliInvestiId);
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

		Date dateOfIniInvest = (Date)attributes.get("dateOfIniInvest");

		if (dateOfIniInvest != null) {
			setDateOfIniInvest(dateOfIniInvest);
		}

		String outcome = (String)attributes.get("outcome");

		if (outcome != null) {
			setOutcome(outcome);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public JadscApplicationInitiateInvestigation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this jadsc application initiate investigation.
	 *
	 * @return the case ID of this jadsc application initiate investigation
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this jadsc application initiate investigation.
	 *
	 * @return the company ID of this jadsc application initiate investigation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc application initiate investigation.
	 *
	 * @return the create date of this jadsc application initiate investigation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of ini invest of this jadsc application initiate investigation.
	 *
	 * @return the date of ini invest of this jadsc application initiate investigation
	 */
	@Override
	public Date getDateOfIniInvest() {
		return model.getDateOfIniInvest();
	}

	/**
	 * Returns the group ID of this jadsc application initiate investigation.
	 *
	 * @return the group ID of this jadsc application initiate investigation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc appli investi ID of this jadsc application initiate investigation.
	 *
	 * @return the jadsc appli investi ID of this jadsc application initiate investigation
	 */
	@Override
	public long getJadscAppliInvestiId() {
		return model.getJadscAppliInvestiId();
	}

	/**
	 * Returns the modified date of this jadsc application initiate investigation.
	 *
	 * @return the modified date of this jadsc application initiate investigation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the outcome of this jadsc application initiate investigation.
	 *
	 * @return the outcome of this jadsc application initiate investigation
	 */
	@Override
	public String getOutcome() {
		return model.getOutcome();
	}

	/**
	 * Returns the primary key of this jadsc application initiate investigation.
	 *
	 * @return the primary key of this jadsc application initiate investigation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jadsc application initiate investigation.
	 *
	 * @return the user ID of this jadsc application initiate investigation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc application initiate investigation.
	 *
	 * @return the user name of this jadsc application initiate investigation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc application initiate investigation.
	 *
	 * @return the user uuid of this jadsc application initiate investigation
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
	 * Sets the case ID of this jadsc application initiate investigation.
	 *
	 * @param caseId the case ID of this jadsc application initiate investigation
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this jadsc application initiate investigation.
	 *
	 * @param companyId the company ID of this jadsc application initiate investigation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc application initiate investigation.
	 *
	 * @param createDate the create date of this jadsc application initiate investigation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of ini invest of this jadsc application initiate investigation.
	 *
	 * @param dateOfIniInvest the date of ini invest of this jadsc application initiate investigation
	 */
	@Override
	public void setDateOfIniInvest(Date dateOfIniInvest) {
		model.setDateOfIniInvest(dateOfIniInvest);
	}

	/**
	 * Sets the group ID of this jadsc application initiate investigation.
	 *
	 * @param groupId the group ID of this jadsc application initiate investigation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc appli investi ID of this jadsc application initiate investigation.
	 *
	 * @param jadscAppliInvestiId the jadsc appli investi ID of this jadsc application initiate investigation
	 */
	@Override
	public void setJadscAppliInvestiId(long jadscAppliInvestiId) {
		model.setJadscAppliInvestiId(jadscAppliInvestiId);
	}

	/**
	 * Sets the modified date of this jadsc application initiate investigation.
	 *
	 * @param modifiedDate the modified date of this jadsc application initiate investigation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the outcome of this jadsc application initiate investigation.
	 *
	 * @param outcome the outcome of this jadsc application initiate investigation
	 */
	@Override
	public void setOutcome(String outcome) {
		model.setOutcome(outcome);
	}

	/**
	 * Sets the primary key of this jadsc application initiate investigation.
	 *
	 * @param primaryKey the primary key of this jadsc application initiate investigation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jadsc application initiate investigation.
	 *
	 * @param userId the user ID of this jadsc application initiate investigation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc application initiate investigation.
	 *
	 * @param userName the user name of this jadsc application initiate investigation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc application initiate investigation.
	 *
	 * @param userUuid the user uuid of this jadsc application initiate investigation
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
	protected JadscApplicationInitiateInvestigationWrapper wrap(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		return new JadscApplicationInitiateInvestigationWrapper(
			jadscApplicationInitiateInvestigation);
	}

}