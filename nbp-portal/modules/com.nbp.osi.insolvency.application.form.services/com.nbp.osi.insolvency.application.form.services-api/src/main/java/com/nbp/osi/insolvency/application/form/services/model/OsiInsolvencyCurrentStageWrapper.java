/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiInsolvencyCurrentStage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyCurrentStage
 * @generated
 */
public class OsiInsolvencyCurrentStageWrapper
	extends BaseModelWrapper<OsiInsolvencyCurrentStage>
	implements ModelWrapper<OsiInsolvencyCurrentStage>,
			   OsiInsolvencyCurrentStage {

	public OsiInsolvencyCurrentStageWrapper(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		super(osiInsolvencyCurrentStage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"osiInsolvencyCurrentStageId", getOsiInsolvencyCurrentStageId());
		attributes.put("osiInsolvencyStageId", getOsiInsolvencyStageId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentStage", getCurrentStage());
		attributes.put("lastFormStage", getLastFormStage());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiInsolvencyCurrentStageId = (Long)attributes.get(
			"osiInsolvencyCurrentStageId");

		if (osiInsolvencyCurrentStageId != null) {
			setOsiInsolvencyCurrentStageId(osiInsolvencyCurrentStageId);
		}

		Long osiInsolvencyStageId = (Long)attributes.get(
			"osiInsolvencyStageId");

		if (osiInsolvencyStageId != null) {
			setOsiInsolvencyStageId(osiInsolvencyStageId);
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

		String currentStage = (String)attributes.get("currentStage");

		if (currentStage != null) {
			setCurrentStage(currentStage);
		}

		String lastFormStage = (String)attributes.get("lastFormStage");

		if (lastFormStage != null) {
			setLastFormStage(lastFormStage);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public OsiInsolvencyCurrentStage cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi insolvency current stage.
	 *
	 * @return the company ID of this osi insolvency current stage
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi insolvency current stage.
	 *
	 * @return the create date of this osi insolvency current stage
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current stage of this osi insolvency current stage.
	 *
	 * @return the current stage of this osi insolvency current stage
	 */
	@Override
	public String getCurrentStage() {
		return model.getCurrentStage();
	}

	/**
	 * Returns the last form stage of this osi insolvency current stage.
	 *
	 * @return the last form stage of this osi insolvency current stage
	 */
	@Override
	public String getLastFormStage() {
		return model.getLastFormStage();
	}

	/**
	 * Returns the modified date of this osi insolvency current stage.
	 *
	 * @return the modified date of this osi insolvency current stage
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency current stage ID of this osi insolvency current stage.
	 *
	 * @return the osi insolvency current stage ID of this osi insolvency current stage
	 */
	@Override
	public long getOsiInsolvencyCurrentStageId() {
		return model.getOsiInsolvencyCurrentStageId();
	}

	/**
	 * Returns the osi insolvency ID of this osi insolvency current stage.
	 *
	 * @return the osi insolvency ID of this osi insolvency current stage
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the osi insolvency stage ID of this osi insolvency current stage.
	 *
	 * @return the osi insolvency stage ID of this osi insolvency current stage
	 */
	@Override
	public long getOsiInsolvencyStageId() {
		return model.getOsiInsolvencyStageId();
	}

	/**
	 * Returns the primary key of this osi insolvency current stage.
	 *
	 * @return the primary key of this osi insolvency current stage
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi insolvency current stage.
	 *
	 * @return the user ID of this osi insolvency current stage
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi insolvency current stage.
	 *
	 * @return the user name of this osi insolvency current stage
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi insolvency current stage.
	 *
	 * @return the user uuid of this osi insolvency current stage
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
	 * Sets the company ID of this osi insolvency current stage.
	 *
	 * @param companyId the company ID of this osi insolvency current stage
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi insolvency current stage.
	 *
	 * @param createDate the create date of this osi insolvency current stage
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current stage of this osi insolvency current stage.
	 *
	 * @param currentStage the current stage of this osi insolvency current stage
	 */
	@Override
	public void setCurrentStage(String currentStage) {
		model.setCurrentStage(currentStage);
	}

	/**
	 * Sets the last form stage of this osi insolvency current stage.
	 *
	 * @param lastFormStage the last form stage of this osi insolvency current stage
	 */
	@Override
	public void setLastFormStage(String lastFormStage) {
		model.setLastFormStage(lastFormStage);
	}

	/**
	 * Sets the modified date of this osi insolvency current stage.
	 *
	 * @param modifiedDate the modified date of this osi insolvency current stage
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency current stage ID of this osi insolvency current stage.
	 *
	 * @param osiInsolvencyCurrentStageId the osi insolvency current stage ID of this osi insolvency current stage
	 */
	@Override
	public void setOsiInsolvencyCurrentStageId(
		long osiInsolvencyCurrentStageId) {

		model.setOsiInsolvencyCurrentStageId(osiInsolvencyCurrentStageId);
	}

	/**
	 * Sets the osi insolvency ID of this osi insolvency current stage.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi insolvency current stage
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the osi insolvency stage ID of this osi insolvency current stage.
	 *
	 * @param osiInsolvencyStageId the osi insolvency stage ID of this osi insolvency current stage
	 */
	@Override
	public void setOsiInsolvencyStageId(long osiInsolvencyStageId) {
		model.setOsiInsolvencyStageId(osiInsolvencyStageId);
	}

	/**
	 * Sets the primary key of this osi insolvency current stage.
	 *
	 * @param primaryKey the primary key of this osi insolvency current stage
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi insolvency current stage.
	 *
	 * @param userId the user ID of this osi insolvency current stage
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi insolvency current stage.
	 *
	 * @param userName the user name of this osi insolvency current stage
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi insolvency current stage.
	 *
	 * @param userUuid the user uuid of this osi insolvency current stage
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
	protected OsiInsolvencyCurrentStageWrapper wrap(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return new OsiInsolvencyCurrentStageWrapper(osiInsolvencyCurrentStage);
	}

}