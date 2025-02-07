/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WraApplicationDeskVeri}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationDeskVeri
 * @generated
 */
public class WraApplicationDeskVeriWrapper
	extends BaseModelWrapper<WraApplicationDeskVeri>
	implements ModelWrapper<WraApplicationDeskVeri>, WraApplicationDeskVeri {

	public WraApplicationDeskVeriWrapper(
		WraApplicationDeskVeri wraApplicationDeskVeri) {

		super(wraApplicationDeskVeri);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"wraApplicationDeskVeriId", getWraApplicationDeskVeriId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("wraApplicationId", getWraApplicationId());
		attributes.put("documentStatus", getDocumentStatus());
		attributes.put("documentName", getDocumentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wraApplicationDeskVeriId = (Long)attributes.get(
			"wraApplicationDeskVeriId");

		if (wraApplicationDeskVeriId != null) {
			setWraApplicationDeskVeriId(wraApplicationDeskVeriId);
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

		Long wraApplicationId = (Long)attributes.get("wraApplicationId");

		if (wraApplicationId != null) {
			setWraApplicationId(wraApplicationId);
		}

		String documentStatus = (String)attributes.get("documentStatus");

		if (documentStatus != null) {
			setDocumentStatus(documentStatus);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}
	}

	@Override
	public WraApplicationDeskVeri cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this wra application desk veri.
	 *
	 * @return the company ID of this wra application desk veri
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this wra application desk veri.
	 *
	 * @return the create date of this wra application desk veri
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this wra application desk veri.
	 *
	 * @return the document name of this wra application desk veri
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document status of this wra application desk veri.
	 *
	 * @return the document status of this wra application desk veri
	 */
	@Override
	public String getDocumentStatus() {
		return model.getDocumentStatus();
	}

	/**
	 * Returns the group ID of this wra application desk veri.
	 *
	 * @return the group ID of this wra application desk veri
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this wra application desk veri.
	 *
	 * @return the modified date of this wra application desk veri
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this wra application desk veri.
	 *
	 * @return the primary key of this wra application desk veri
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this wra application desk veri.
	 *
	 * @return the user ID of this wra application desk veri
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this wra application desk veri.
	 *
	 * @return the user name of this wra application desk veri
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this wra application desk veri.
	 *
	 * @return the user uuid of this wra application desk veri
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the wra application desk veri ID of this wra application desk veri.
	 *
	 * @return the wra application desk veri ID of this wra application desk veri
	 */
	@Override
	public long getWraApplicationDeskVeriId() {
		return model.getWraApplicationDeskVeriId();
	}

	/**
	 * Returns the wra application ID of this wra application desk veri.
	 *
	 * @return the wra application ID of this wra application desk veri
	 */
	@Override
	public long getWraApplicationId() {
		return model.getWraApplicationId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this wra application desk veri.
	 *
	 * @param companyId the company ID of this wra application desk veri
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this wra application desk veri.
	 *
	 * @param createDate the create date of this wra application desk veri
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this wra application desk veri.
	 *
	 * @param documentName the document name of this wra application desk veri
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document status of this wra application desk veri.
	 *
	 * @param documentStatus the document status of this wra application desk veri
	 */
	@Override
	public void setDocumentStatus(String documentStatus) {
		model.setDocumentStatus(documentStatus);
	}

	/**
	 * Sets the group ID of this wra application desk veri.
	 *
	 * @param groupId the group ID of this wra application desk veri
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this wra application desk veri.
	 *
	 * @param modifiedDate the modified date of this wra application desk veri
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this wra application desk veri.
	 *
	 * @param primaryKey the primary key of this wra application desk veri
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this wra application desk veri.
	 *
	 * @param userId the user ID of this wra application desk veri
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this wra application desk veri.
	 *
	 * @param userName the user name of this wra application desk veri
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this wra application desk veri.
	 *
	 * @param userUuid the user uuid of this wra application desk veri
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the wra application desk veri ID of this wra application desk veri.
	 *
	 * @param wraApplicationDeskVeriId the wra application desk veri ID of this wra application desk veri
	 */
	@Override
	public void setWraApplicationDeskVeriId(long wraApplicationDeskVeriId) {
		model.setWraApplicationDeskVeriId(wraApplicationDeskVeriId);
	}

	/**
	 * Sets the wra application ID of this wra application desk veri.
	 *
	 * @param wraApplicationId the wra application ID of this wra application desk veri
	 */
	@Override
	public void setWraApplicationId(long wraApplicationId) {
		model.setWraApplicationId(wraApplicationId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected WraApplicationDeskVeriWrapper wrap(
		WraApplicationDeskVeri wraApplicationDeskVeri) {

		return new WraApplicationDeskVeriWrapper(wraApplicationDeskVeri);
	}

}