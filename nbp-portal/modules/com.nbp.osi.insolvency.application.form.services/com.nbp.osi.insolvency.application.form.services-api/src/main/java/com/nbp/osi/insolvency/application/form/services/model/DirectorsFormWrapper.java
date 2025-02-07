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
 * This class is a wrapper for {@link DirectorsForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DirectorsForm
 * @generated
 */
public class DirectorsFormWrapper
	extends BaseModelWrapper<DirectorsForm>
	implements DirectorsForm, ModelWrapper<DirectorsForm> {

	public DirectorsFormWrapper(DirectorsForm directorsForm) {
		super(directorsForm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("directorsFormId", getDirectorsFormId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("directorsName", getDirectorsName());
		attributes.put("directorsDateAppointed", getDirectorsDateAppointed());
		attributes.put("directorsOccupation", getDirectorsOccupation());
		attributes.put("directorsContactNum", getDirectorsContactNum());
		attributes.put("directorsAddress", getDirectorsAddress());
		attributes.put("directorsCounter", getDirectorsCounter());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long directorsFormId = (Long)attributes.get("directorsFormId");

		if (directorsFormId != null) {
			setDirectorsFormId(directorsFormId);
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

		String directorsName = (String)attributes.get("directorsName");

		if (directorsName != null) {
			setDirectorsName(directorsName);
		}

		Date directorsDateAppointed = (Date)attributes.get(
			"directorsDateAppointed");

		if (directorsDateAppointed != null) {
			setDirectorsDateAppointed(directorsDateAppointed);
		}

		String directorsOccupation = (String)attributes.get(
			"directorsOccupation");

		if (directorsOccupation != null) {
			setDirectorsOccupation(directorsOccupation);
		}

		String directorsContactNum = (String)attributes.get(
			"directorsContactNum");

		if (directorsContactNum != null) {
			setDirectorsContactNum(directorsContactNum);
		}

		String directorsAddress = (String)attributes.get("directorsAddress");

		if (directorsAddress != null) {
			setDirectorsAddress(directorsAddress);
		}

		String directorsCounter = (String)attributes.get("directorsCounter");

		if (directorsCounter != null) {
			setDirectorsCounter(directorsCounter);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public DirectorsForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this directors form.
	 *
	 * @return the company ID of this directors form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this directors form.
	 *
	 * @return the create date of this directors form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the directors address of this directors form.
	 *
	 * @return the directors address of this directors form
	 */
	@Override
	public String getDirectorsAddress() {
		return model.getDirectorsAddress();
	}

	/**
	 * Returns the directors contact num of this directors form.
	 *
	 * @return the directors contact num of this directors form
	 */
	@Override
	public String getDirectorsContactNum() {
		return model.getDirectorsContactNum();
	}

	/**
	 * Returns the directors counter of this directors form.
	 *
	 * @return the directors counter of this directors form
	 */
	@Override
	public String getDirectorsCounter() {
		return model.getDirectorsCounter();
	}

	/**
	 * Returns the directors date appointed of this directors form.
	 *
	 * @return the directors date appointed of this directors form
	 */
	@Override
	public Date getDirectorsDateAppointed() {
		return model.getDirectorsDateAppointed();
	}

	/**
	 * Returns the directors form ID of this directors form.
	 *
	 * @return the directors form ID of this directors form
	 */
	@Override
	public long getDirectorsFormId() {
		return model.getDirectorsFormId();
	}

	/**
	 * Returns the directors name of this directors form.
	 *
	 * @return the directors name of this directors form
	 */
	@Override
	public String getDirectorsName() {
		return model.getDirectorsName();
	}

	/**
	 * Returns the directors occupation of this directors form.
	 *
	 * @return the directors occupation of this directors form
	 */
	@Override
	public String getDirectorsOccupation() {
		return model.getDirectorsOccupation();
	}

	/**
	 * Returns the group ID of this directors form.
	 *
	 * @return the group ID of this directors form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this directors form.
	 *
	 * @return the modified date of this directors form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this directors form.
	 *
	 * @return the osi insolvency ID of this directors form
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this directors form.
	 *
	 * @return the primary key of this directors form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this directors form.
	 *
	 * @return the user ID of this directors form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this directors form.
	 *
	 * @return the user name of this directors form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this directors form.
	 *
	 * @return the user uuid of this directors form
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
	 * Sets the company ID of this directors form.
	 *
	 * @param companyId the company ID of this directors form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this directors form.
	 *
	 * @param createDate the create date of this directors form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the directors address of this directors form.
	 *
	 * @param directorsAddress the directors address of this directors form
	 */
	@Override
	public void setDirectorsAddress(String directorsAddress) {
		model.setDirectorsAddress(directorsAddress);
	}

	/**
	 * Sets the directors contact num of this directors form.
	 *
	 * @param directorsContactNum the directors contact num of this directors form
	 */
	@Override
	public void setDirectorsContactNum(String directorsContactNum) {
		model.setDirectorsContactNum(directorsContactNum);
	}

	/**
	 * Sets the directors counter of this directors form.
	 *
	 * @param directorsCounter the directors counter of this directors form
	 */
	@Override
	public void setDirectorsCounter(String directorsCounter) {
		model.setDirectorsCounter(directorsCounter);
	}

	/**
	 * Sets the directors date appointed of this directors form.
	 *
	 * @param directorsDateAppointed the directors date appointed of this directors form
	 */
	@Override
	public void setDirectorsDateAppointed(Date directorsDateAppointed) {
		model.setDirectorsDateAppointed(directorsDateAppointed);
	}

	/**
	 * Sets the directors form ID of this directors form.
	 *
	 * @param directorsFormId the directors form ID of this directors form
	 */
	@Override
	public void setDirectorsFormId(long directorsFormId) {
		model.setDirectorsFormId(directorsFormId);
	}

	/**
	 * Sets the directors name of this directors form.
	 *
	 * @param directorsName the directors name of this directors form
	 */
	@Override
	public void setDirectorsName(String directorsName) {
		model.setDirectorsName(directorsName);
	}

	/**
	 * Sets the directors occupation of this directors form.
	 *
	 * @param directorsOccupation the directors occupation of this directors form
	 */
	@Override
	public void setDirectorsOccupation(String directorsOccupation) {
		model.setDirectorsOccupation(directorsOccupation);
	}

	/**
	 * Sets the group ID of this directors form.
	 *
	 * @param groupId the group ID of this directors form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this directors form.
	 *
	 * @param modifiedDate the modified date of this directors form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this directors form.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this directors form
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this directors form.
	 *
	 * @param primaryKey the primary key of this directors form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this directors form.
	 *
	 * @param userId the user ID of this directors form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this directors form.
	 *
	 * @param userName the user name of this directors form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this directors form.
	 *
	 * @param userUuid the user uuid of this directors form
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
	protected DirectorsFormWrapper wrap(DirectorsForm directorsForm) {
		return new DirectorsFormWrapper(directorsForm);
	}

}