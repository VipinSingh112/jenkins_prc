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
 * This class is a wrapper for {@link VerificationCompanyInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VerificationCompanyInfo
 * @generated
 */
public class VerificationCompanyInfoWrapper
	extends BaseModelWrapper<VerificationCompanyInfo>
	implements ModelWrapper<VerificationCompanyInfo>, VerificationCompanyInfo {

	public VerificationCompanyInfoWrapper(
		VerificationCompanyInfo verificationCompanyInfo) {

		super(verificationCompanyInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"verificationCompanyInfoId", getVerificationCompanyInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("verComName", getVerComName());
		attributes.put("verComTrn", getVerComTrn());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long verificationCompanyInfoId = (Long)attributes.get(
			"verificationCompanyInfoId");

		if (verificationCompanyInfoId != null) {
			setVerificationCompanyInfoId(verificationCompanyInfoId);
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

		String verComName = (String)attributes.get("verComName");

		if (verComName != null) {
			setVerComName(verComName);
		}

		String verComTrn = (String)attributes.get("verComTrn");

		if (verComTrn != null) {
			setVerComTrn(verComTrn);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public VerificationCompanyInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this verification company info.
	 *
	 * @return the company ID of this verification company info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this verification company info.
	 *
	 * @return the create date of this verification company info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this verification company info.
	 *
	 * @return the group ID of this verification company info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this verification company info.
	 *
	 * @return the modified date of this verification company info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this verification company info.
	 *
	 * @return the osi insolvency ID of this verification company info
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this verification company info.
	 *
	 * @return the primary key of this verification company info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this verification company info.
	 *
	 * @return the user ID of this verification company info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this verification company info.
	 *
	 * @return the user name of this verification company info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this verification company info.
	 *
	 * @return the user uuid of this verification company info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the ver com name of this verification company info.
	 *
	 * @return the ver com name of this verification company info
	 */
	@Override
	public String getVerComName() {
		return model.getVerComName();
	}

	/**
	 * Returns the ver com trn of this verification company info.
	 *
	 * @return the ver com trn of this verification company info
	 */
	@Override
	public String getVerComTrn() {
		return model.getVerComTrn();
	}

	/**
	 * Returns the verification company info ID of this verification company info.
	 *
	 * @return the verification company info ID of this verification company info
	 */
	@Override
	public long getVerificationCompanyInfoId() {
		return model.getVerificationCompanyInfoId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this verification company info.
	 *
	 * @param companyId the company ID of this verification company info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this verification company info.
	 *
	 * @param createDate the create date of this verification company info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this verification company info.
	 *
	 * @param groupId the group ID of this verification company info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this verification company info.
	 *
	 * @param modifiedDate the modified date of this verification company info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this verification company info.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this verification company info
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this verification company info.
	 *
	 * @param primaryKey the primary key of this verification company info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this verification company info.
	 *
	 * @param userId the user ID of this verification company info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this verification company info.
	 *
	 * @param userName the user name of this verification company info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this verification company info.
	 *
	 * @param userUuid the user uuid of this verification company info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the ver com name of this verification company info.
	 *
	 * @param verComName the ver com name of this verification company info
	 */
	@Override
	public void setVerComName(String verComName) {
		model.setVerComName(verComName);
	}

	/**
	 * Sets the ver com trn of this verification company info.
	 *
	 * @param verComTrn the ver com trn of this verification company info
	 */
	@Override
	public void setVerComTrn(String verComTrn) {
		model.setVerComTrn(verComTrn);
	}

	/**
	 * Sets the verification company info ID of this verification company info.
	 *
	 * @param verificationCompanyInfoId the verification company info ID of this verification company info
	 */
	@Override
	public void setVerificationCompanyInfoId(long verificationCompanyInfoId) {
		model.setVerificationCompanyInfoId(verificationCompanyInfoId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected VerificationCompanyInfoWrapper wrap(
		VerificationCompanyInfo verificationCompanyInfo) {

		return new VerificationCompanyInfoWrapper(verificationCompanyInfo);
	}

}