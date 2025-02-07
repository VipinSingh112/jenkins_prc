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
 * This class is a wrapper for {@link JadscAppliReviewAndValid}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValid
 * @generated
 */
public class JadscAppliReviewAndValidWrapper
	extends BaseModelWrapper<JadscAppliReviewAndValid>
	implements JadscAppliReviewAndValid,
			   ModelWrapper<JadscAppliReviewAndValid> {

	public JadscAppliReviewAndValidWrapper(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		super(jadscAppliReviewAndValid);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"jadscAppliReviewAndValidId", getJadscAppliReviewAndValidId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("versionOfApplication", getVersionOfApplication());
		attributes.put("status", getStatus());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jadscAppliReviewAndValidId = (Long)attributes.get(
			"jadscAppliReviewAndValidId");

		if (jadscAppliReviewAndValidId != null) {
			setJadscAppliReviewAndValidId(jadscAppliReviewAndValidId);
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

		String versionOfApplication = (String)attributes.get(
			"versionOfApplication");

		if (versionOfApplication != null) {
			setVersionOfApplication(versionOfApplication);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public JadscAppliReviewAndValid cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this jadsc appli review and valid.
	 *
	 * @return the case ID of this jadsc appli review and valid
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this jadsc appli review and valid.
	 *
	 * @return the company ID of this jadsc appli review and valid
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc appli review and valid.
	 *
	 * @return the create date of this jadsc appli review and valid
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this jadsc appli review and valid.
	 *
	 * @return the group ID of this jadsc appli review and valid
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc appli review and valid ID of this jadsc appli review and valid.
	 *
	 * @return the jadsc appli review and valid ID of this jadsc appli review and valid
	 */
	@Override
	public long getJadscAppliReviewAndValidId() {
		return model.getJadscAppliReviewAndValidId();
	}

	/**
	 * Returns the modified date of this jadsc appli review and valid.
	 *
	 * @return the modified date of this jadsc appli review and valid
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jadsc appli review and valid.
	 *
	 * @return the primary key of this jadsc appli review and valid
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this jadsc appli review and valid.
	 *
	 * @return the status of this jadsc appli review and valid
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this jadsc appli review and valid.
	 *
	 * @return the user ID of this jadsc appli review and valid
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc appli review and valid.
	 *
	 * @return the user name of this jadsc appli review and valid
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc appli review and valid.
	 *
	 * @return the user uuid of this jadsc appli review and valid
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the version of application of this jadsc appli review and valid.
	 *
	 * @return the version of application of this jadsc appli review and valid
	 */
	@Override
	public String getVersionOfApplication() {
		return model.getVersionOfApplication();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this jadsc appli review and valid.
	 *
	 * @param caseId the case ID of this jadsc appli review and valid
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this jadsc appli review and valid.
	 *
	 * @param companyId the company ID of this jadsc appli review and valid
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc appli review and valid.
	 *
	 * @param createDate the create date of this jadsc appli review and valid
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this jadsc appli review and valid.
	 *
	 * @param groupId the group ID of this jadsc appli review and valid
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc appli review and valid ID of this jadsc appli review and valid.
	 *
	 * @param jadscAppliReviewAndValidId the jadsc appli review and valid ID of this jadsc appli review and valid
	 */
	@Override
	public void setJadscAppliReviewAndValidId(long jadscAppliReviewAndValidId) {
		model.setJadscAppliReviewAndValidId(jadscAppliReviewAndValidId);
	}

	/**
	 * Sets the modified date of this jadsc appli review and valid.
	 *
	 * @param modifiedDate the modified date of this jadsc appli review and valid
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jadsc appli review and valid.
	 *
	 * @param primaryKey the primary key of this jadsc appli review and valid
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this jadsc appli review and valid.
	 *
	 * @param status the status of this jadsc appli review and valid
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this jadsc appli review and valid.
	 *
	 * @param userId the user ID of this jadsc appli review and valid
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc appli review and valid.
	 *
	 * @param userName the user name of this jadsc appli review and valid
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc appli review and valid.
	 *
	 * @param userUuid the user uuid of this jadsc appli review and valid
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the version of application of this jadsc appli review and valid.
	 *
	 * @param versionOfApplication the version of application of this jadsc appli review and valid
	 */
	@Override
	public void setVersionOfApplication(String versionOfApplication) {
		model.setVersionOfApplication(versionOfApplication);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected JadscAppliReviewAndValidWrapper wrap(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		return new JadscAppliReviewAndValidWrapper(jadscAppliReviewAndValid);
	}

}