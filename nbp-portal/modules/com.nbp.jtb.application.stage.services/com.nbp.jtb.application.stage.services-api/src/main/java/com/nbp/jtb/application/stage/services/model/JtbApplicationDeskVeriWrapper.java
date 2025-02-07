/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JtbApplicationDeskVeri}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationDeskVeri
 * @generated
 */
public class JtbApplicationDeskVeriWrapper
	extends BaseModelWrapper<JtbApplicationDeskVeri>
	implements JtbApplicationDeskVeri, ModelWrapper<JtbApplicationDeskVeri> {

	public JtbApplicationDeskVeriWrapper(
		JtbApplicationDeskVeri jtbApplicationDeskVeri) {

		super(jtbApplicationDeskVeri);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"jtbApplicationDeskVeriId", getJtbApplicationDeskVeriId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());
		attributes.put("documentStatus", getDocumentStatus());
		attributes.put("documentName", getDocumentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jtbApplicationDeskVeriId = (Long)attributes.get(
			"jtbApplicationDeskVeriId");

		if (jtbApplicationDeskVeriId != null) {
			setJtbApplicationDeskVeriId(jtbApplicationDeskVeriId);
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

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
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
	public JtbApplicationDeskVeri cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jtb application desk veri.
	 *
	 * @return the company ID of this jtb application desk veri
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jtb application desk veri.
	 *
	 * @return the create date of this jtb application desk veri
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this jtb application desk veri.
	 *
	 * @return the document name of this jtb application desk veri
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document status of this jtb application desk veri.
	 *
	 * @return the document status of this jtb application desk veri
	 */
	@Override
	public String getDocumentStatus() {
		return model.getDocumentStatus();
	}

	/**
	 * Returns the group ID of this jtb application desk veri.
	 *
	 * @return the group ID of this jtb application desk veri
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application desk veri ID of this jtb application desk veri.
	 *
	 * @return the jtb application desk veri ID of this jtb application desk veri
	 */
	@Override
	public long getJtbApplicationDeskVeriId() {
		return model.getJtbApplicationDeskVeriId();
	}

	/**
	 * Returns the jtb application ID of this jtb application desk veri.
	 *
	 * @return the jtb application ID of this jtb application desk veri
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this jtb application desk veri.
	 *
	 * @return the modified date of this jtb application desk veri
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jtb application desk veri.
	 *
	 * @return the primary key of this jtb application desk veri
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jtb application desk veri.
	 *
	 * @return the user ID of this jtb application desk veri
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jtb application desk veri.
	 *
	 * @return the user name of this jtb application desk veri
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jtb application desk veri.
	 *
	 * @return the user uuid of this jtb application desk veri
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
	 * Sets the company ID of this jtb application desk veri.
	 *
	 * @param companyId the company ID of this jtb application desk veri
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jtb application desk veri.
	 *
	 * @param createDate the create date of this jtb application desk veri
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this jtb application desk veri.
	 *
	 * @param documentName the document name of this jtb application desk veri
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document status of this jtb application desk veri.
	 *
	 * @param documentStatus the document status of this jtb application desk veri
	 */
	@Override
	public void setDocumentStatus(String documentStatus) {
		model.setDocumentStatus(documentStatus);
	}

	/**
	 * Sets the group ID of this jtb application desk veri.
	 *
	 * @param groupId the group ID of this jtb application desk veri
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application desk veri ID of this jtb application desk veri.
	 *
	 * @param jtbApplicationDeskVeriId the jtb application desk veri ID of this jtb application desk veri
	 */
	@Override
	public void setJtbApplicationDeskVeriId(long jtbApplicationDeskVeriId) {
		model.setJtbApplicationDeskVeriId(jtbApplicationDeskVeriId);
	}

	/**
	 * Sets the jtb application ID of this jtb application desk veri.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb application desk veri
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this jtb application desk veri.
	 *
	 * @param modifiedDate the modified date of this jtb application desk veri
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jtb application desk veri.
	 *
	 * @param primaryKey the primary key of this jtb application desk veri
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jtb application desk veri.
	 *
	 * @param userId the user ID of this jtb application desk veri
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jtb application desk veri.
	 *
	 * @param userName the user name of this jtb application desk veri
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jtb application desk veri.
	 *
	 * @param userUuid the user uuid of this jtb application desk veri
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
	protected JtbApplicationDeskVeriWrapper wrap(
		JtbApplicationDeskVeri jtbApplicationDeskVeri) {

		return new JtbApplicationDeskVeriWrapper(jtbApplicationDeskVeri);
	}

}