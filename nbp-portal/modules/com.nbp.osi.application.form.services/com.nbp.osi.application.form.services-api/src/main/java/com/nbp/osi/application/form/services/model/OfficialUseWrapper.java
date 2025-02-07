/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OfficialUse}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OfficialUse
 * @generated
 */
public class OfficialUseWrapper
	extends BaseModelWrapper<OfficialUse>
	implements ModelWrapper<OfficialUse>, OfficialUse {

	public OfficialUseWrapper(OfficialUse officialUse) {
		super(officialUse);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("officialUseId", getOfficialUseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("receivedBy", getReceivedBy());
		attributes.put("receivedByDate", getReceivedByDate());
		attributes.put("verifiedBy", getVerifiedBy());
		attributes.put("verifiedByDate", getVerifiedByDate());
		attributes.put("applicationAccepted", getApplicationAccepted());
		attributes.put("dateCertificateIssued", getDateCertificateIssued());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("remarksNotes", getRemarksNotes());
		attributes.put("osiApplicationId", getOsiApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long officialUseId = (Long)attributes.get("officialUseId");

		if (officialUseId != null) {
			setOfficialUseId(officialUseId);
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

		String receivedBy = (String)attributes.get("receivedBy");

		if (receivedBy != null) {
			setReceivedBy(receivedBy);
		}

		Date receivedByDate = (Date)attributes.get("receivedByDate");

		if (receivedByDate != null) {
			setReceivedByDate(receivedByDate);
		}

		String verifiedBy = (String)attributes.get("verifiedBy");

		if (verifiedBy != null) {
			setVerifiedBy(verifiedBy);
		}

		Date verifiedByDate = (Date)attributes.get("verifiedByDate");

		if (verifiedByDate != null) {
			setVerifiedByDate(verifiedByDate);
		}

		String applicationAccepted = (String)attributes.get(
			"applicationAccepted");

		if (applicationAccepted != null) {
			setApplicationAccepted(applicationAccepted);
		}

		Date dateCertificateIssued = (Date)attributes.get(
			"dateCertificateIssued");

		if (dateCertificateIssued != null) {
			setDateCertificateIssued(dateCertificateIssued);
		}

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		String remarksNotes = (String)attributes.get("remarksNotes");

		if (remarksNotes != null) {
			setRemarksNotes(remarksNotes);
		}

		Long osiApplicationId = (Long)attributes.get("osiApplicationId");

		if (osiApplicationId != null) {
			setOsiApplicationId(osiApplicationId);
		}
	}

	@Override
	public OfficialUse cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the application accepted of this official use.
	 *
	 * @return the application accepted of this official use
	 */
	@Override
	public String getApplicationAccepted() {
		return model.getApplicationAccepted();
	}

	/**
	 * Returns the certificate number of this official use.
	 *
	 * @return the certificate number of this official use
	 */
	@Override
	public String getCertificateNumber() {
		return model.getCertificateNumber();
	}

	/**
	 * Returns the company ID of this official use.
	 *
	 * @return the company ID of this official use
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this official use.
	 *
	 * @return the create date of this official use
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date certificate issued of this official use.
	 *
	 * @return the date certificate issued of this official use
	 */
	@Override
	public Date getDateCertificateIssued() {
		return model.getDateCertificateIssued();
	}

	/**
	 * Returns the group ID of this official use.
	 *
	 * @return the group ID of this official use
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this official use.
	 *
	 * @return the modified date of this official use
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the official use ID of this official use.
	 *
	 * @return the official use ID of this official use
	 */
	@Override
	public long getOfficialUseId() {
		return model.getOfficialUseId();
	}

	/**
	 * Returns the osi application ID of this official use.
	 *
	 * @return the osi application ID of this official use
	 */
	@Override
	public long getOsiApplicationId() {
		return model.getOsiApplicationId();
	}

	/**
	 * Returns the primary key of this official use.
	 *
	 * @return the primary key of this official use
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the received by of this official use.
	 *
	 * @return the received by of this official use
	 */
	@Override
	public String getReceivedBy() {
		return model.getReceivedBy();
	}

	/**
	 * Returns the received by date of this official use.
	 *
	 * @return the received by date of this official use
	 */
	@Override
	public Date getReceivedByDate() {
		return model.getReceivedByDate();
	}

	/**
	 * Returns the remarks notes of this official use.
	 *
	 * @return the remarks notes of this official use
	 */
	@Override
	public String getRemarksNotes() {
		return model.getRemarksNotes();
	}

	/**
	 * Returns the user ID of this official use.
	 *
	 * @return the user ID of this official use
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this official use.
	 *
	 * @return the user name of this official use
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this official use.
	 *
	 * @return the user uuid of this official use
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the verified by of this official use.
	 *
	 * @return the verified by of this official use
	 */
	@Override
	public String getVerifiedBy() {
		return model.getVerifiedBy();
	}

	/**
	 * Returns the verified by date of this official use.
	 *
	 * @return the verified by date of this official use
	 */
	@Override
	public Date getVerifiedByDate() {
		return model.getVerifiedByDate();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the application accepted of this official use.
	 *
	 * @param applicationAccepted the application accepted of this official use
	 */
	@Override
	public void setApplicationAccepted(String applicationAccepted) {
		model.setApplicationAccepted(applicationAccepted);
	}

	/**
	 * Sets the certificate number of this official use.
	 *
	 * @param certificateNumber the certificate number of this official use
	 */
	@Override
	public void setCertificateNumber(String certificateNumber) {
		model.setCertificateNumber(certificateNumber);
	}

	/**
	 * Sets the company ID of this official use.
	 *
	 * @param companyId the company ID of this official use
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this official use.
	 *
	 * @param createDate the create date of this official use
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date certificate issued of this official use.
	 *
	 * @param dateCertificateIssued the date certificate issued of this official use
	 */
	@Override
	public void setDateCertificateIssued(Date dateCertificateIssued) {
		model.setDateCertificateIssued(dateCertificateIssued);
	}

	/**
	 * Sets the group ID of this official use.
	 *
	 * @param groupId the group ID of this official use
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this official use.
	 *
	 * @param modifiedDate the modified date of this official use
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the official use ID of this official use.
	 *
	 * @param officialUseId the official use ID of this official use
	 */
	@Override
	public void setOfficialUseId(long officialUseId) {
		model.setOfficialUseId(officialUseId);
	}

	/**
	 * Sets the osi application ID of this official use.
	 *
	 * @param osiApplicationId the osi application ID of this official use
	 */
	@Override
	public void setOsiApplicationId(long osiApplicationId) {
		model.setOsiApplicationId(osiApplicationId);
	}

	/**
	 * Sets the primary key of this official use.
	 *
	 * @param primaryKey the primary key of this official use
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the received by of this official use.
	 *
	 * @param receivedBy the received by of this official use
	 */
	@Override
	public void setReceivedBy(String receivedBy) {
		model.setReceivedBy(receivedBy);
	}

	/**
	 * Sets the received by date of this official use.
	 *
	 * @param receivedByDate the received by date of this official use
	 */
	@Override
	public void setReceivedByDate(Date receivedByDate) {
		model.setReceivedByDate(receivedByDate);
	}

	/**
	 * Sets the remarks notes of this official use.
	 *
	 * @param remarksNotes the remarks notes of this official use
	 */
	@Override
	public void setRemarksNotes(String remarksNotes) {
		model.setRemarksNotes(remarksNotes);
	}

	/**
	 * Sets the user ID of this official use.
	 *
	 * @param userId the user ID of this official use
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this official use.
	 *
	 * @param userName the user name of this official use
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this official use.
	 *
	 * @param userUuid the user uuid of this official use
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the verified by of this official use.
	 *
	 * @param verifiedBy the verified by of this official use
	 */
	@Override
	public void setVerifiedBy(String verifiedBy) {
		model.setVerifiedBy(verifiedBy);
	}

	/**
	 * Sets the verified by date of this official use.
	 *
	 * @param verifiedByDate the verified by date of this official use
	 */
	@Override
	public void setVerifiedByDate(Date verifiedByDate) {
		model.setVerifiedByDate(verifiedByDate);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected OfficialUseWrapper wrap(OfficialUse officialUse) {
		return new OfficialUseWrapper(officialUse);
	}

}