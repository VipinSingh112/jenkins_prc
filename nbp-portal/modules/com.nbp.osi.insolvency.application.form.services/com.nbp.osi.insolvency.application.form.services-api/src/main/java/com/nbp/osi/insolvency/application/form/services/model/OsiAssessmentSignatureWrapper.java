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
 * This class is a wrapper for {@link OsiAssessmentSignature}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssessmentSignature
 * @generated
 */
public class OsiAssessmentSignatureWrapper
	extends BaseModelWrapper<OsiAssessmentSignature>
	implements ModelWrapper<OsiAssessmentSignature>, OsiAssessmentSignature {

	public OsiAssessmentSignatureWrapper(
		OsiAssessmentSignature osiAssessmentSignature) {

		super(osiAssessmentSignature);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"osiAssessmentSignatureId", getOsiAssessmentSignatureId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assessSignName", getAssessSignName());
		attributes.put("assessSignDate", getAssessSignDate());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiAssessmentSignatureId = (Long)attributes.get(
			"osiAssessmentSignatureId");

		if (osiAssessmentSignatureId != null) {
			setOsiAssessmentSignatureId(osiAssessmentSignatureId);
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

		String assessSignName = (String)attributes.get("assessSignName");

		if (assessSignName != null) {
			setAssessSignName(assessSignName);
		}

		String assessSignDate = (String)attributes.get("assessSignDate");

		if (assessSignDate != null) {
			setAssessSignDate(assessSignDate);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public OsiAssessmentSignature cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the assess sign date of this osi assessment signature.
	 *
	 * @return the assess sign date of this osi assessment signature
	 */
	@Override
	public String getAssessSignDate() {
		return model.getAssessSignDate();
	}

	/**
	 * Returns the assess sign name of this osi assessment signature.
	 *
	 * @return the assess sign name of this osi assessment signature
	 */
	@Override
	public String getAssessSignName() {
		return model.getAssessSignName();
	}

	/**
	 * Returns the company ID of this osi assessment signature.
	 *
	 * @return the company ID of this osi assessment signature
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi assessment signature.
	 *
	 * @return the create date of this osi assessment signature
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi assessment signature.
	 *
	 * @return the group ID of this osi assessment signature
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi assessment signature.
	 *
	 * @return the modified date of this osi assessment signature
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi assessment signature ID of this osi assessment signature.
	 *
	 * @return the osi assessment signature ID of this osi assessment signature
	 */
	@Override
	public long getOsiAssessmentSignatureId() {
		return model.getOsiAssessmentSignatureId();
	}

	/**
	 * Returns the osi insolvency ID of this osi assessment signature.
	 *
	 * @return the osi insolvency ID of this osi assessment signature
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this osi assessment signature.
	 *
	 * @return the primary key of this osi assessment signature
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi assessment signature.
	 *
	 * @return the user ID of this osi assessment signature
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi assessment signature.
	 *
	 * @return the user name of this osi assessment signature
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi assessment signature.
	 *
	 * @return the user uuid of this osi assessment signature
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
	 * Sets the assess sign date of this osi assessment signature.
	 *
	 * @param assessSignDate the assess sign date of this osi assessment signature
	 */
	@Override
	public void setAssessSignDate(String assessSignDate) {
		model.setAssessSignDate(assessSignDate);
	}

	/**
	 * Sets the assess sign name of this osi assessment signature.
	 *
	 * @param assessSignName the assess sign name of this osi assessment signature
	 */
	@Override
	public void setAssessSignName(String assessSignName) {
		model.setAssessSignName(assessSignName);
	}

	/**
	 * Sets the company ID of this osi assessment signature.
	 *
	 * @param companyId the company ID of this osi assessment signature
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi assessment signature.
	 *
	 * @param createDate the create date of this osi assessment signature
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi assessment signature.
	 *
	 * @param groupId the group ID of this osi assessment signature
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi assessment signature.
	 *
	 * @param modifiedDate the modified date of this osi assessment signature
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi assessment signature ID of this osi assessment signature.
	 *
	 * @param osiAssessmentSignatureId the osi assessment signature ID of this osi assessment signature
	 */
	@Override
	public void setOsiAssessmentSignatureId(long osiAssessmentSignatureId) {
		model.setOsiAssessmentSignatureId(osiAssessmentSignatureId);
	}

	/**
	 * Sets the osi insolvency ID of this osi assessment signature.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi assessment signature
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this osi assessment signature.
	 *
	 * @param primaryKey the primary key of this osi assessment signature
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi assessment signature.
	 *
	 * @param userId the user ID of this osi assessment signature
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi assessment signature.
	 *
	 * @param userName the user name of this osi assessment signature
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi assessment signature.
	 *
	 * @param userUuid the user uuid of this osi assessment signature
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
	protected OsiAssessmentSignatureWrapper wrap(
		OsiAssessmentSignature osiAssessmentSignature) {

		return new OsiAssessmentSignatureWrapper(osiAssessmentSignature);
	}

}