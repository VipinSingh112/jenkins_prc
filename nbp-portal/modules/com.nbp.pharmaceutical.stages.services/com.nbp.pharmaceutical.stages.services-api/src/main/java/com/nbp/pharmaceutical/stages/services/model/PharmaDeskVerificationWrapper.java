/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PharmaDeskVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDeskVerification
 * @generated
 */
public class PharmaDeskVerificationWrapper
	extends BaseModelWrapper<PharmaDeskVerification>
	implements ModelWrapper<PharmaDeskVerification>, PharmaDeskVerification {

	public PharmaDeskVerificationWrapper(
		PharmaDeskVerification pharmaDeskVerification) {

		super(pharmaDeskVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"pharmaDeskVerificationId", getPharmaDeskVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("pharmaApplicationId", getPharmaApplicationId());
		attributes.put("document", getDocument());
		attributes.put("documentName", getDocumentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaDeskVerificationId = (Long)attributes.get(
			"pharmaDeskVerificationId");

		if (pharmaDeskVerificationId != null) {
			setPharmaDeskVerificationId(pharmaDeskVerificationId);
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

		Long pharmaApplicationId = (Long)attributes.get("pharmaApplicationId");

		if (pharmaApplicationId != null) {
			setPharmaApplicationId(pharmaApplicationId);
		}

		String document = (String)attributes.get("document");

		if (document != null) {
			setDocument(document);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}
	}

	@Override
	public PharmaDeskVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this pharma desk verification.
	 *
	 * @return the company ID of this pharma desk verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this pharma desk verification.
	 *
	 * @return the create date of this pharma desk verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the document of this pharma desk verification.
	 *
	 * @return the document of this pharma desk verification
	 */
	@Override
	public String getDocument() {
		return model.getDocument();
	}

	/**
	 * Returns the document name of this pharma desk verification.
	 *
	 * @return the document name of this pharma desk verification
	 */
	@Override
	public String getDocumentName() {
		return model.getDocumentName();
	}

	/**
	 * Returns the group ID of this pharma desk verification.
	 *
	 * @return the group ID of this pharma desk verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this pharma desk verification.
	 *
	 * @return the modified date of this pharma desk verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pharma application ID of this pharma desk verification.
	 *
	 * @return the pharma application ID of this pharma desk verification
	 */
	@Override
	public long getPharmaApplicationId() {
		return model.getPharmaApplicationId();
	}

	/**
	 * Returns the pharma desk verification ID of this pharma desk verification.
	 *
	 * @return the pharma desk verification ID of this pharma desk verification
	 */
	@Override
	public long getPharmaDeskVerificationId() {
		return model.getPharmaDeskVerificationId();
	}

	/**
	 * Returns the primary key of this pharma desk verification.
	 *
	 * @return the primary key of this pharma desk verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this pharma desk verification.
	 *
	 * @return the user ID of this pharma desk verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pharma desk verification.
	 *
	 * @return the user name of this pharma desk verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pharma desk verification.
	 *
	 * @return the user uuid of this pharma desk verification
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
	 * Sets the company ID of this pharma desk verification.
	 *
	 * @param companyId the company ID of this pharma desk verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this pharma desk verification.
	 *
	 * @param createDate the create date of this pharma desk verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the document of this pharma desk verification.
	 *
	 * @param document the document of this pharma desk verification
	 */
	@Override
	public void setDocument(String document) {
		model.setDocument(document);
	}

	/**
	 * Sets the document name of this pharma desk verification.
	 *
	 * @param documentName the document name of this pharma desk verification
	 */
	@Override
	public void setDocumentName(String documentName) {
		model.setDocumentName(documentName);
	}

	/**
	 * Sets the group ID of this pharma desk verification.
	 *
	 * @param groupId the group ID of this pharma desk verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this pharma desk verification.
	 *
	 * @param modifiedDate the modified date of this pharma desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pharma application ID of this pharma desk verification.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma desk verification
	 */
	@Override
	public void setPharmaApplicationId(long pharmaApplicationId) {
		model.setPharmaApplicationId(pharmaApplicationId);
	}

	/**
	 * Sets the pharma desk verification ID of this pharma desk verification.
	 *
	 * @param pharmaDeskVerificationId the pharma desk verification ID of this pharma desk verification
	 */
	@Override
	public void setPharmaDeskVerificationId(long pharmaDeskVerificationId) {
		model.setPharmaDeskVerificationId(pharmaDeskVerificationId);
	}

	/**
	 * Sets the primary key of this pharma desk verification.
	 *
	 * @param primaryKey the primary key of this pharma desk verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this pharma desk verification.
	 *
	 * @param userId the user ID of this pharma desk verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pharma desk verification.
	 *
	 * @param userName the user name of this pharma desk verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pharma desk verification.
	 *
	 * @param userUuid the user uuid of this pharma desk verification
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
	protected PharmaDeskVerificationWrapper wrap(
		PharmaDeskVerification pharmaDeskVerification) {

		return new PharmaDeskVerificationWrapper(pharmaDeskVerification);
	}

}