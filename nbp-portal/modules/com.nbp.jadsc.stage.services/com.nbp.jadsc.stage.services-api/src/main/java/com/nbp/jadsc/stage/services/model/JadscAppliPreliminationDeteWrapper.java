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
 * This class is a wrapper for {@link JadscAppliPreliminationDete}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDete
 * @generated
 */
public class JadscAppliPreliminationDeteWrapper
	extends BaseModelWrapper<JadscAppliPreliminationDete>
	implements JadscAppliPreliminationDete,
			   ModelWrapper<JadscAppliPreliminationDete> {

	public JadscAppliPreliminationDeteWrapper(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		super(jadscAppliPreliminationDete);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"jadscAppliPreliminationDeteId",
			getJadscAppliPreliminationDeteId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dateOfPreDete", getDateOfPreDete());
		attributes.put("Outcome", getOutcome());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jadscAppliPreliminationDeteId = (Long)attributes.get(
			"jadscAppliPreliminationDeteId");

		if (jadscAppliPreliminationDeteId != null) {
			setJadscAppliPreliminationDeteId(jadscAppliPreliminationDeteId);
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

		Date dateOfPreDete = (Date)attributes.get("dateOfPreDete");

		if (dateOfPreDete != null) {
			setDateOfPreDete(dateOfPreDete);
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
	public JadscAppliPreliminationDete cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this jadsc appli prelimination dete.
	 *
	 * @return the case ID of this jadsc appli prelimination dete
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this jadsc appli prelimination dete.
	 *
	 * @return the company ID of this jadsc appli prelimination dete
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc appli prelimination dete.
	 *
	 * @return the create date of this jadsc appli prelimination dete
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of pre dete of this jadsc appli prelimination dete.
	 *
	 * @return the date of pre dete of this jadsc appli prelimination dete
	 */
	@Override
	public Date getDateOfPreDete() {
		return model.getDateOfPreDete();
	}

	/**
	 * Returns the group ID of this jadsc appli prelimination dete.
	 *
	 * @return the group ID of this jadsc appli prelimination dete
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc appli prelimination dete ID of this jadsc appli prelimination dete.
	 *
	 * @return the jadsc appli prelimination dete ID of this jadsc appli prelimination dete
	 */
	@Override
	public long getJadscAppliPreliminationDeteId() {
		return model.getJadscAppliPreliminationDeteId();
	}

	/**
	 * Returns the modified date of this jadsc appli prelimination dete.
	 *
	 * @return the modified date of this jadsc appli prelimination dete
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the outcome of this jadsc appli prelimination dete.
	 *
	 * @return the outcome of this jadsc appli prelimination dete
	 */
	@Override
	public String getOutcome() {
		return model.getOutcome();
	}

	/**
	 * Returns the primary key of this jadsc appli prelimination dete.
	 *
	 * @return the primary key of this jadsc appli prelimination dete
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jadsc appli prelimination dete.
	 *
	 * @return the user ID of this jadsc appli prelimination dete
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc appli prelimination dete.
	 *
	 * @return the user name of this jadsc appli prelimination dete
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc appli prelimination dete.
	 *
	 * @return the user uuid of this jadsc appli prelimination dete
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
	 * Sets the case ID of this jadsc appli prelimination dete.
	 *
	 * @param caseId the case ID of this jadsc appli prelimination dete
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this jadsc appli prelimination dete.
	 *
	 * @param companyId the company ID of this jadsc appli prelimination dete
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc appli prelimination dete.
	 *
	 * @param createDate the create date of this jadsc appli prelimination dete
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of pre dete of this jadsc appli prelimination dete.
	 *
	 * @param dateOfPreDete the date of pre dete of this jadsc appli prelimination dete
	 */
	@Override
	public void setDateOfPreDete(Date dateOfPreDete) {
		model.setDateOfPreDete(dateOfPreDete);
	}

	/**
	 * Sets the group ID of this jadsc appli prelimination dete.
	 *
	 * @param groupId the group ID of this jadsc appli prelimination dete
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc appli prelimination dete ID of this jadsc appli prelimination dete.
	 *
	 * @param jadscAppliPreliminationDeteId the jadsc appli prelimination dete ID of this jadsc appli prelimination dete
	 */
	@Override
	public void setJadscAppliPreliminationDeteId(
		long jadscAppliPreliminationDeteId) {

		model.setJadscAppliPreliminationDeteId(jadscAppliPreliminationDeteId);
	}

	/**
	 * Sets the modified date of this jadsc appli prelimination dete.
	 *
	 * @param modifiedDate the modified date of this jadsc appli prelimination dete
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the outcome of this jadsc appli prelimination dete.
	 *
	 * @param Outcome the outcome of this jadsc appli prelimination dete
	 */
	@Override
	public void setOutcome(String Outcome) {
		model.setOutcome(Outcome);
	}

	/**
	 * Sets the primary key of this jadsc appli prelimination dete.
	 *
	 * @param primaryKey the primary key of this jadsc appli prelimination dete
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jadsc appli prelimination dete.
	 *
	 * @param userId the user ID of this jadsc appli prelimination dete
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc appli prelimination dete.
	 *
	 * @param userName the user name of this jadsc appli prelimination dete
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc appli prelimination dete.
	 *
	 * @param userUuid the user uuid of this jadsc appli prelimination dete
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
	protected JadscAppliPreliminationDeteWrapper wrap(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		return new JadscAppliPreliminationDeteWrapper(
			jadscAppliPreliminationDete);
	}

}