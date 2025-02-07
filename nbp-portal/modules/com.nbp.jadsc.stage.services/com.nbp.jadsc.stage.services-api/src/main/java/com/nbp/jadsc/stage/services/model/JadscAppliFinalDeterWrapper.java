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
 * This class is a wrapper for {@link JadscAppliFinalDeter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliFinalDeter
 * @generated
 */
public class JadscAppliFinalDeterWrapper
	extends BaseModelWrapper<JadscAppliFinalDeter>
	implements JadscAppliFinalDeter, ModelWrapper<JadscAppliFinalDeter> {

	public JadscAppliFinalDeterWrapper(
		JadscAppliFinalDeter jadscAppliFinalDeter) {

		super(jadscAppliFinalDeter);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jadscAppliFinalDeterId", getJadscAppliFinalDeterId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dateOfFinalDeter", getDateOfFinalDeter());
		attributes.put("Outcome", getOutcome());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jadscAppliFinalDeterId = (Long)attributes.get(
			"jadscAppliFinalDeterId");

		if (jadscAppliFinalDeterId != null) {
			setJadscAppliFinalDeterId(jadscAppliFinalDeterId);
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

		Date dateOfFinalDeter = (Date)attributes.get("dateOfFinalDeter");

		if (dateOfFinalDeter != null) {
			setDateOfFinalDeter(dateOfFinalDeter);
		}

		String Outcome = (String)attributes.get("Outcome");

		if (Outcome != null) {
			setOutcome(Outcome);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public JadscAppliFinalDeter cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this jadsc appli final deter.
	 *
	 * @return the case ID of this jadsc appli final deter
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this jadsc appli final deter.
	 *
	 * @return the company ID of this jadsc appli final deter
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc appli final deter.
	 *
	 * @return the create date of this jadsc appli final deter
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of final deter of this jadsc appli final deter.
	 *
	 * @return the date of final deter of this jadsc appli final deter
	 */
	@Override
	public Date getDateOfFinalDeter() {
		return model.getDateOfFinalDeter();
	}

	/**
	 * Returns the group ID of this jadsc appli final deter.
	 *
	 * @return the group ID of this jadsc appli final deter
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc appli final deter ID of this jadsc appli final deter.
	 *
	 * @return the jadsc appli final deter ID of this jadsc appli final deter
	 */
	@Override
	public long getJadscAppliFinalDeterId() {
		return model.getJadscAppliFinalDeterId();
	}

	/**
	 * Returns the modified date of this jadsc appli final deter.
	 *
	 * @return the modified date of this jadsc appli final deter
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the outcome of this jadsc appli final deter.
	 *
	 * @return the outcome of this jadsc appli final deter
	 */
	@Override
	public String getOutcome() {
		return model.getOutcome();
	}

	/**
	 * Returns the primary key of this jadsc appli final deter.
	 *
	 * @return the primary key of this jadsc appli final deter
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jadsc appli final deter.
	 *
	 * @return the user ID of this jadsc appli final deter
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc appli final deter.
	 *
	 * @return the user name of this jadsc appli final deter
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc appli final deter.
	 *
	 * @return the user uuid of this jadsc appli final deter
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
	 * Sets the case ID of this jadsc appli final deter.
	 *
	 * @param caseId the case ID of this jadsc appli final deter
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this jadsc appli final deter.
	 *
	 * @param companyId the company ID of this jadsc appli final deter
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc appli final deter.
	 *
	 * @param createDate the create date of this jadsc appli final deter
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of final deter of this jadsc appli final deter.
	 *
	 * @param dateOfFinalDeter the date of final deter of this jadsc appli final deter
	 */
	@Override
	public void setDateOfFinalDeter(Date dateOfFinalDeter) {
		model.setDateOfFinalDeter(dateOfFinalDeter);
	}

	/**
	 * Sets the group ID of this jadsc appli final deter.
	 *
	 * @param groupId the group ID of this jadsc appli final deter
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc appli final deter ID of this jadsc appli final deter.
	 *
	 * @param jadscAppliFinalDeterId the jadsc appli final deter ID of this jadsc appli final deter
	 */
	@Override
	public void setJadscAppliFinalDeterId(long jadscAppliFinalDeterId) {
		model.setJadscAppliFinalDeterId(jadscAppliFinalDeterId);
	}

	/**
	 * Sets the modified date of this jadsc appli final deter.
	 *
	 * @param modifiedDate the modified date of this jadsc appli final deter
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the outcome of this jadsc appli final deter.
	 *
	 * @param Outcome the outcome of this jadsc appli final deter
	 */
	@Override
	public void setOutcome(String Outcome) {
		model.setOutcome(Outcome);
	}

	/**
	 * Sets the primary key of this jadsc appli final deter.
	 *
	 * @param primaryKey the primary key of this jadsc appli final deter
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jadsc appli final deter.
	 *
	 * @param userId the user ID of this jadsc appli final deter
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc appli final deter.
	 *
	 * @param userName the user name of this jadsc appli final deter
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc appli final deter.
	 *
	 * @param userUuid the user uuid of this jadsc appli final deter
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
	protected JadscAppliFinalDeterWrapper wrap(
		JadscAppliFinalDeter jadscAppliFinalDeter) {

		return new JadscAppliFinalDeterWrapper(jadscAppliFinalDeter);
	}

}