/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HsraApplicationDeskVeri}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationDeskVeri
 * @generated
 */
public class HsraApplicationDeskVeriWrapper
	extends BaseModelWrapper<HsraApplicationDeskVeri>
	implements HsraApplicationDeskVeri, ModelWrapper<HsraApplicationDeskVeri> {

	public HsraApplicationDeskVeriWrapper(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		super(hsraApplicationDeskVeri);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"hsraApplicationDeskVeriId", getHsraApplicationDeskVeriId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("hsraApplicationId", getHsraApplicationId());
		attributes.put("documentStatus", getDocumentStatus());
		attributes.put("documentName", getDocumentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long hsraApplicationDeskVeriId = (Long)attributes.get(
			"hsraApplicationDeskVeriId");

		if (hsraApplicationDeskVeriId != null) {
			setHsraApplicationDeskVeriId(hsraApplicationDeskVeriId);
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

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
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
	public HsraApplicationDeskVeri cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this hsra application desk veri.
	 *
	 * @return the company ID of this hsra application desk veri
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this hsra application desk veri.
	 *
	 * @return the create date of this hsra application desk veri
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this hsra application desk veri.
	 *
	 * @return the document name of this hsra application desk veri
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document status of this hsra application desk veri.
	 *
	 * @return the document status of this hsra application desk veri
	 */
	@Override
	public String getDocumentStatus() {
		return model.getDocumentStatus();
	}

	/**
	 * Returns the group ID of this hsra application desk veri.
	 *
	 * @return the group ID of this hsra application desk veri
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application desk veri ID of this hsra application desk veri.
	 *
	 * @return the hsra application desk veri ID of this hsra application desk veri
	 */
	@Override
	public long getHsraApplicationDeskVeriId() {
		return model.getHsraApplicationDeskVeriId();
	}

	/**
	 * Returns the hsra application ID of this hsra application desk veri.
	 *
	 * @return the hsra application ID of this hsra application desk veri
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this hsra application desk veri.
	 *
	 * @return the modified date of this hsra application desk veri
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this hsra application desk veri.
	 *
	 * @return the primary key of this hsra application desk veri
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this hsra application desk veri.
	 *
	 * @return the user ID of this hsra application desk veri
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this hsra application desk veri.
	 *
	 * @return the user name of this hsra application desk veri
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this hsra application desk veri.
	 *
	 * @return the user uuid of this hsra application desk veri
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
	 * Sets the company ID of this hsra application desk veri.
	 *
	 * @param companyId the company ID of this hsra application desk veri
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this hsra application desk veri.
	 *
	 * @param createDate the create date of this hsra application desk veri
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this hsra application desk veri.
	 *
	 * @param documentName the document name of this hsra application desk veri
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document status of this hsra application desk veri.
	 *
	 * @param documentStatus the document status of this hsra application desk veri
	 */
	@Override
	public void setDocumentStatus(String documentStatus) {
		model.setDocumentStatus(documentStatus);
	}

	/**
	 * Sets the group ID of this hsra application desk veri.
	 *
	 * @param groupId the group ID of this hsra application desk veri
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application desk veri ID of this hsra application desk veri.
	 *
	 * @param hsraApplicationDeskVeriId the hsra application desk veri ID of this hsra application desk veri
	 */
	@Override
	public void setHsraApplicationDeskVeriId(long hsraApplicationDeskVeriId) {
		model.setHsraApplicationDeskVeriId(hsraApplicationDeskVeriId);
	}

	/**
	 * Sets the hsra application ID of this hsra application desk veri.
	 *
	 * @param hsraApplicationId the hsra application ID of this hsra application desk veri
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this hsra application desk veri.
	 *
	 * @param modifiedDate the modified date of this hsra application desk veri
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this hsra application desk veri.
	 *
	 * @param primaryKey the primary key of this hsra application desk veri
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this hsra application desk veri.
	 *
	 * @param userId the user ID of this hsra application desk veri
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this hsra application desk veri.
	 *
	 * @param userName the user name of this hsra application desk veri
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this hsra application desk veri.
	 *
	 * @param userUuid the user uuid of this hsra application desk veri
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
	protected HsraApplicationDeskVeriWrapper wrap(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		return new HsraApplicationDeskVeriWrapper(hsraApplicationDeskVeri);
	}

}