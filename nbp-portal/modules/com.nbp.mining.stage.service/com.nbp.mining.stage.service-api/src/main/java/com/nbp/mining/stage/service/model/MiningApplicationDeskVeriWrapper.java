/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiningApplicationDeskVeri}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDeskVeri
 * @generated
 */
public class MiningApplicationDeskVeriWrapper
	extends BaseModelWrapper<MiningApplicationDeskVeri>
	implements MiningApplicationDeskVeri,
			   ModelWrapper<MiningApplicationDeskVeri> {

	public MiningApplicationDeskVeriWrapper(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		super(miningApplicationDeskVeri);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("miningDeskVeriId", getMiningDeskVeriId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("miningApplicationId", getMiningApplicationId());
		attributes.put("documentStatus", getDocumentStatus());
		attributes.put("documentName", getDocumentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miningDeskVeriId = (Long)attributes.get("miningDeskVeriId");

		if (miningDeskVeriId != null) {
			setMiningDeskVeriId(miningDeskVeriId);
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

		Long miningApplicationId = (Long)attributes.get("miningApplicationId");

		if (miningApplicationId != null) {
			setMiningApplicationId(miningApplicationId);
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
	public MiningApplicationDeskVeri cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this mining application desk veri.
	 *
	 * @return the company ID of this mining application desk veri
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this mining application desk veri.
	 *
	 * @return the create date of this mining application desk veri
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this mining application desk veri.
	 *
	 * @return the document name of this mining application desk veri
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the document status of this mining application desk veri.
	 *
	 * @return the document status of this mining application desk veri
	 */
	@Override
	public String getDocumentStatus() {
		return model.getDocumentStatus();
	}

	/**
	 * Returns the group ID of this mining application desk veri.
	 *
	 * @return the group ID of this mining application desk veri
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mining application ID of this mining application desk veri.
	 *
	 * @return the mining application ID of this mining application desk veri
	 */
	@Override
	public long getMiningApplicationId() {
		return model.getMiningApplicationId();
	}

	/**
	 * Returns the mining desk veri ID of this mining application desk veri.
	 *
	 * @return the mining desk veri ID of this mining application desk veri
	 */
	@Override
	public long getMiningDeskVeriId() {
		return model.getMiningDeskVeriId();
	}

	/**
	 * Returns the modified date of this mining application desk veri.
	 *
	 * @return the modified date of this mining application desk veri
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this mining application desk veri.
	 *
	 * @return the primary key of this mining application desk veri
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this mining application desk veri.
	 *
	 * @return the user ID of this mining application desk veri
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this mining application desk veri.
	 *
	 * @return the user name of this mining application desk veri
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this mining application desk veri.
	 *
	 * @return the user uuid of this mining application desk veri
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
	 * Sets the company ID of this mining application desk veri.
	 *
	 * @param companyId the company ID of this mining application desk veri
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this mining application desk veri.
	 *
	 * @param createDate the create date of this mining application desk veri
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this mining application desk veri.
	 *
	 * @param documentName the document name of this mining application desk veri
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the document status of this mining application desk veri.
	 *
	 * @param documentStatus the document status of this mining application desk veri
	 */
	@Override
	public void setDocumentStatus(String documentStatus) {
		model.setDocumentStatus(documentStatus);
	}

	/**
	 * Sets the group ID of this mining application desk veri.
	 *
	 * @param groupId the group ID of this mining application desk veri
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mining application ID of this mining application desk veri.
	 *
	 * @param miningApplicationId the mining application ID of this mining application desk veri
	 */
	@Override
	public void setMiningApplicationId(long miningApplicationId) {
		model.setMiningApplicationId(miningApplicationId);
	}

	/**
	 * Sets the mining desk veri ID of this mining application desk veri.
	 *
	 * @param miningDeskVeriId the mining desk veri ID of this mining application desk veri
	 */
	@Override
	public void setMiningDeskVeriId(long miningDeskVeriId) {
		model.setMiningDeskVeriId(miningDeskVeriId);
	}

	/**
	 * Sets the modified date of this mining application desk veri.
	 *
	 * @param modifiedDate the modified date of this mining application desk veri
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this mining application desk veri.
	 *
	 * @param primaryKey the primary key of this mining application desk veri
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this mining application desk veri.
	 *
	 * @param userId the user ID of this mining application desk veri
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this mining application desk veri.
	 *
	 * @param userName the user name of this mining application desk veri
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this mining application desk veri.
	 *
	 * @param userUuid the user uuid of this mining application desk veri
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
	protected MiningApplicationDeskVeriWrapper wrap(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		return new MiningApplicationDeskVeriWrapper(miningApplicationDeskVeri);
	}

}