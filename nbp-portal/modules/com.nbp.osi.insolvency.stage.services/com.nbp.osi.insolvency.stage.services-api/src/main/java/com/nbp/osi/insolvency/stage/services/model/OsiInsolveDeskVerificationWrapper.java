/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiInsolveDeskVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolveDeskVerification
 * @generated
 */
public class OsiInsolveDeskVerificationWrapper
	extends BaseModelWrapper<OsiInsolveDeskVerification>
	implements ModelWrapper<OsiInsolveDeskVerification>,
			   OsiInsolveDeskVerification {

	public OsiInsolveDeskVerificationWrapper(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		super(osiInsolveDeskVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"OsiInsolveDeskVerificationId", getOsiInsolveDeskVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("documentName", getDocumentName());
		attributes.put("status", getStatus());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long OsiInsolveDeskVerificationId = (Long)attributes.get(
			"OsiInsolveDeskVerificationId");

		if (OsiInsolveDeskVerificationId != null) {
			setOsiInsolveDeskVerificationId(OsiInsolveDeskVerificationId);
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

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public OsiInsolveDeskVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi insolve desk verification.
	 *
	 * @return the company ID of this osi insolve desk verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi insolve desk verification.
	 *
	 * @return the create date of this osi insolve desk verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document name of this osi insolve desk verification.
	 *
	 * @return the document name of this osi insolve desk verification
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the group ID of this osi insolve desk verification.
	 *
	 * @return the group ID of this osi insolve desk verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi insolve desk verification.
	 *
	 * @return the modified date of this osi insolve desk verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolve desk verification ID of this osi insolve desk verification.
	 *
	 * @return the osi insolve desk verification ID of this osi insolve desk verification
	 */
	@Override
	public long getOsiInsolveDeskVerificationId() {
		return model.getOsiInsolveDeskVerificationId();
	}

	/**
	 * Returns the osi insolvency ID of this osi insolve desk verification.
	 *
	 * @return the osi insolvency ID of this osi insolve desk verification
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this osi insolve desk verification.
	 *
	 * @return the primary key of this osi insolve desk verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this osi insolve desk verification.
	 *
	 * @return the status of this osi insolve desk verification
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this osi insolve desk verification.
	 *
	 * @return the user ID of this osi insolve desk verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi insolve desk verification.
	 *
	 * @return the user name of this osi insolve desk verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi insolve desk verification.
	 *
	 * @return the user uuid of this osi insolve desk verification
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
	 * Sets the company ID of this osi insolve desk verification.
	 *
	 * @param companyId the company ID of this osi insolve desk verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi insolve desk verification.
	 *
	 * @param createDate the create date of this osi insolve desk verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this osi insolve desk verification.
	 *
	 * @param documentName the document name of this osi insolve desk verification
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the group ID of this osi insolve desk verification.
	 *
	 * @param groupId the group ID of this osi insolve desk verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi insolve desk verification.
	 *
	 * @param modifiedDate the modified date of this osi insolve desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolve desk verification ID of this osi insolve desk verification.
	 *
	 * @param OsiInsolveDeskVerificationId the osi insolve desk verification ID of this osi insolve desk verification
	 */
	@Override
	public void setOsiInsolveDeskVerificationId(
		long OsiInsolveDeskVerificationId) {

		model.setOsiInsolveDeskVerificationId(OsiInsolveDeskVerificationId);
	}

	/**
	 * Sets the osi insolvency ID of this osi insolve desk verification.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi insolve desk verification
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this osi insolve desk verification.
	 *
	 * @param primaryKey the primary key of this osi insolve desk verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this osi insolve desk verification.
	 *
	 * @param status the status of this osi insolve desk verification
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this osi insolve desk verification.
	 *
	 * @param userId the user ID of this osi insolve desk verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi insolve desk verification.
	 *
	 * @param userName the user name of this osi insolve desk verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi insolve desk verification.
	 *
	 * @param userUuid the user uuid of this osi insolve desk verification
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
	protected OsiInsolveDeskVerificationWrapper wrap(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return new OsiInsolveDeskVerificationWrapper(
			osiInsolveDeskVerification);
	}

}