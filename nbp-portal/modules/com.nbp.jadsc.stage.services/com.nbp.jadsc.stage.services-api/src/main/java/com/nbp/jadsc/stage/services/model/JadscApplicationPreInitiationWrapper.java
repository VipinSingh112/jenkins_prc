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
 * This class is a wrapper for {@link JadscApplicationPreInitiation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationPreInitiation
 * @generated
 */
public class JadscApplicationPreInitiationWrapper
	extends BaseModelWrapper<JadscApplicationPreInitiation>
	implements JadscApplicationPreInitiation,
			   ModelWrapper<JadscApplicationPreInitiation> {

	public JadscApplicationPreInitiationWrapper(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		super(jadscApplicationPreInitiation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"jadscAppliPreInitiationId", getJadscAppliPreInitiationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dateOfPreInitiation", getDateOfPreInitiation());
		attributes.put("outcome", getOutcome());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jadscAppliPreInitiationId = (Long)attributes.get(
			"jadscAppliPreInitiationId");

		if (jadscAppliPreInitiationId != null) {
			setJadscAppliPreInitiationId(jadscAppliPreInitiationId);
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

		Date dateOfPreInitiation = (Date)attributes.get("dateOfPreInitiation");

		if (dateOfPreInitiation != null) {
			setDateOfPreInitiation(dateOfPreInitiation);
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
	public JadscApplicationPreInitiation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this jadsc application pre initiation.
	 *
	 * @return the case ID of this jadsc application pre initiation
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this jadsc application pre initiation.
	 *
	 * @return the company ID of this jadsc application pre initiation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc application pre initiation.
	 *
	 * @return the create date of this jadsc application pre initiation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of pre initiation of this jadsc application pre initiation.
	 *
	 * @return the date of pre initiation of this jadsc application pre initiation
	 */
	@Override
	public Date getDateOfPreInitiation() {
		return model.getDateOfPreInitiation();
	}

	/**
	 * Returns the group ID of this jadsc application pre initiation.
	 *
	 * @return the group ID of this jadsc application pre initiation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc appli pre initiation ID of this jadsc application pre initiation.
	 *
	 * @return the jadsc appli pre initiation ID of this jadsc application pre initiation
	 */
	@Override
	public long getJadscAppliPreInitiationId() {
		return model.getJadscAppliPreInitiationId();
	}

	/**
	 * Returns the modified date of this jadsc application pre initiation.
	 *
	 * @return the modified date of this jadsc application pre initiation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the outcome of this jadsc application pre initiation.
	 *
	 * @return the outcome of this jadsc application pre initiation
	 */
	@Override
	public String getOutcome() {
		return model.getOutcome();
	}

	/**
	 * Returns the primary key of this jadsc application pre initiation.
	 *
	 * @return the primary key of this jadsc application pre initiation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jadsc application pre initiation.
	 *
	 * @return the user ID of this jadsc application pre initiation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc application pre initiation.
	 *
	 * @return the user name of this jadsc application pre initiation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc application pre initiation.
	 *
	 * @return the user uuid of this jadsc application pre initiation
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
	 * Sets the case ID of this jadsc application pre initiation.
	 *
	 * @param caseId the case ID of this jadsc application pre initiation
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this jadsc application pre initiation.
	 *
	 * @param companyId the company ID of this jadsc application pre initiation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc application pre initiation.
	 *
	 * @param createDate the create date of this jadsc application pre initiation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of pre initiation of this jadsc application pre initiation.
	 *
	 * @param dateOfPreInitiation the date of pre initiation of this jadsc application pre initiation
	 */
	@Override
	public void setDateOfPreInitiation(Date dateOfPreInitiation) {
		model.setDateOfPreInitiation(dateOfPreInitiation);
	}

	/**
	 * Sets the group ID of this jadsc application pre initiation.
	 *
	 * @param groupId the group ID of this jadsc application pre initiation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc appli pre initiation ID of this jadsc application pre initiation.
	 *
	 * @param jadscAppliPreInitiationId the jadsc appli pre initiation ID of this jadsc application pre initiation
	 */
	@Override
	public void setJadscAppliPreInitiationId(long jadscAppliPreInitiationId) {
		model.setJadscAppliPreInitiationId(jadscAppliPreInitiationId);
	}

	/**
	 * Sets the modified date of this jadsc application pre initiation.
	 *
	 * @param modifiedDate the modified date of this jadsc application pre initiation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the outcome of this jadsc application pre initiation.
	 *
	 * @param outcome the outcome of this jadsc application pre initiation
	 */
	@Override
	public void setOutcome(String outcome) {
		model.setOutcome(outcome);
	}

	/**
	 * Sets the primary key of this jadsc application pre initiation.
	 *
	 * @param primaryKey the primary key of this jadsc application pre initiation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jadsc application pre initiation.
	 *
	 * @param userId the user ID of this jadsc application pre initiation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc application pre initiation.
	 *
	 * @param userName the user name of this jadsc application pre initiation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc application pre initiation.
	 *
	 * @param userUuid the user uuid of this jadsc application pre initiation
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
	protected JadscApplicationPreInitiationWrapper wrap(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		return new JadscApplicationPreInitiationWrapper(
			jadscApplicationPreInitiation);
	}

}