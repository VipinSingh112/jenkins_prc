/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OSIServicesCertiOfIssuance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesCertiOfIssuance
 * @generated
 */
public class OSIServicesCertiOfIssuanceWrapper
	extends BaseModelWrapper<OSIServicesCertiOfIssuance>
	implements ModelWrapper<OSIServicesCertiOfIssuance>,
			   OSIServicesCertiOfIssuance {

	public OSIServicesCertiOfIssuanceWrapper(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		super(osiServicesCertiOfIssuance);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"oSIServicesCertiOfIssuanceId", getOSIServicesCertiOfIssuanceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfInsolventPerson", getNameOfInsolventPerson());
		attributes.put("dateCertificateIssued", getDateCertificateIssued());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("certificateNum", getCertificateNum());
		attributes.put("nameOfLicensedTrustee", getNameOfLicensedTrustee());
		attributes.put("docFileEntry", getDocFileEntry());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oSIServicesCertiOfIssuanceId = (Long)attributes.get(
			"oSIServicesCertiOfIssuanceId");

		if (oSIServicesCertiOfIssuanceId != null) {
			setOSIServicesCertiOfIssuanceId(oSIServicesCertiOfIssuanceId);
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

		String nameOfInsolventPerson = (String)attributes.get(
			"nameOfInsolventPerson");

		if (nameOfInsolventPerson != null) {
			setNameOfInsolventPerson(nameOfInsolventPerson);
		}

		Date dateCertificateIssued = (Date)attributes.get(
			"dateCertificateIssued");

		if (dateCertificateIssued != null) {
			setDateCertificateIssued(dateCertificateIssued);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		String certificateNum = (String)attributes.get("certificateNum");

		if (certificateNum != null) {
			setCertificateNum(certificateNum);
		}

		String nameOfLicensedTrustee = (String)attributes.get(
			"nameOfLicensedTrustee");

		if (nameOfLicensedTrustee != null) {
			setNameOfLicensedTrustee(nameOfLicensedTrustee);
		}

		Long docFileEntry = (Long)attributes.get("docFileEntry");

		if (docFileEntry != null) {
			setDocFileEntry(docFileEntry);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public OSIServicesCertiOfIssuance cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this osi services certi of issuance.
	 *
	 * @return the case ID of this osi services certi of issuance
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the certificate num of this osi services certi of issuance.
	 *
	 * @return the certificate num of this osi services certi of issuance
	 */
	@Override
	public String getCertificateNum() {
		return model.getCertificateNum();
	}

	/**
	 * Returns the company ID of this osi services certi of issuance.
	 *
	 * @return the company ID of this osi services certi of issuance
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi services certi of issuance.
	 *
	 * @return the create date of this osi services certi of issuance
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date certificate issued of this osi services certi of issuance.
	 *
	 * @return the date certificate issued of this osi services certi of issuance
	 */
	@Override
	public Date getDateCertificateIssued() {
		return model.getDateCertificateIssued();
	}

	/**
	 * Returns the date of expiration of this osi services certi of issuance.
	 *
	 * @return the date of expiration of this osi services certi of issuance
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the doc file entry of this osi services certi of issuance.
	 *
	 * @return the doc file entry of this osi services certi of issuance
	 */
	@Override
	public long getDocFileEntry() {
		return model.getDocFileEntry();
	}

	/**
	 * Returns the group ID of this osi services certi of issuance.
	 *
	 * @return the group ID of this osi services certi of issuance
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi services certi of issuance.
	 *
	 * @return the modified date of this osi services certi of issuance
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of insolvent person of this osi services certi of issuance.
	 *
	 * @return the name of insolvent person of this osi services certi of issuance
	 */
	@Override
	public String getNameOfInsolventPerson() {
		return model.getNameOfInsolventPerson();
	}

	/**
	 * Returns the name of licensed trustee of this osi services certi of issuance.
	 *
	 * @return the name of licensed trustee of this osi services certi of issuance
	 */
	@Override
	public String getNameOfLicensedTrustee() {
		return model.getNameOfLicensedTrustee();
	}

	/**
	 * Returns the o si services certi of issuance ID of this osi services certi of issuance.
	 *
	 * @return the o si services certi of issuance ID of this osi services certi of issuance
	 */
	@Override
	public long getOSIServicesCertiOfIssuanceId() {
		return model.getOSIServicesCertiOfIssuanceId();
	}

	/**
	 * Returns the primary key of this osi services certi of issuance.
	 *
	 * @return the primary key of this osi services certi of issuance
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi services certi of issuance.
	 *
	 * @return the user ID of this osi services certi of issuance
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi services certi of issuance.
	 *
	 * @return the user name of this osi services certi of issuance
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi services certi of issuance.
	 *
	 * @return the user uuid of this osi services certi of issuance
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
	 * Sets the case ID of this osi services certi of issuance.
	 *
	 * @param caseId the case ID of this osi services certi of issuance
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the certificate num of this osi services certi of issuance.
	 *
	 * @param certificateNum the certificate num of this osi services certi of issuance
	 */
	@Override
	public void setCertificateNum(String certificateNum) {
		model.setCertificateNum(certificateNum);
	}

	/**
	 * Sets the company ID of this osi services certi of issuance.
	 *
	 * @param companyId the company ID of this osi services certi of issuance
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi services certi of issuance.
	 *
	 * @param createDate the create date of this osi services certi of issuance
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date certificate issued of this osi services certi of issuance.
	 *
	 * @param dateCertificateIssued the date certificate issued of this osi services certi of issuance
	 */
	@Override
	public void setDateCertificateIssued(Date dateCertificateIssued) {
		model.setDateCertificateIssued(dateCertificateIssued);
	}

	/**
	 * Sets the date of expiration of this osi services certi of issuance.
	 *
	 * @param dateOfExpiration the date of expiration of this osi services certi of issuance
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the doc file entry of this osi services certi of issuance.
	 *
	 * @param docFileEntry the doc file entry of this osi services certi of issuance
	 */
	@Override
	public void setDocFileEntry(long docFileEntry) {
		model.setDocFileEntry(docFileEntry);
	}

	/**
	 * Sets the group ID of this osi services certi of issuance.
	 *
	 * @param groupId the group ID of this osi services certi of issuance
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi services certi of issuance.
	 *
	 * @param modifiedDate the modified date of this osi services certi of issuance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of insolvent person of this osi services certi of issuance.
	 *
	 * @param nameOfInsolventPerson the name of insolvent person of this osi services certi of issuance
	 */
	@Override
	public void setNameOfInsolventPerson(String nameOfInsolventPerson) {
		model.setNameOfInsolventPerson(nameOfInsolventPerson);
	}

	/**
	 * Sets the name of licensed trustee of this osi services certi of issuance.
	 *
	 * @param nameOfLicensedTrustee the name of licensed trustee of this osi services certi of issuance
	 */
	@Override
	public void setNameOfLicensedTrustee(String nameOfLicensedTrustee) {
		model.setNameOfLicensedTrustee(nameOfLicensedTrustee);
	}

	/**
	 * Sets the o si services certi of issuance ID of this osi services certi of issuance.
	 *
	 * @param oSIServicesCertiOfIssuanceId the o si services certi of issuance ID of this osi services certi of issuance
	 */
	@Override
	public void setOSIServicesCertiOfIssuanceId(
		long oSIServicesCertiOfIssuanceId) {

		model.setOSIServicesCertiOfIssuanceId(oSIServicesCertiOfIssuanceId);
	}

	/**
	 * Sets the primary key of this osi services certi of issuance.
	 *
	 * @param primaryKey the primary key of this osi services certi of issuance
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi services certi of issuance.
	 *
	 * @param userId the user ID of this osi services certi of issuance
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi services certi of issuance.
	 *
	 * @param userName the user name of this osi services certi of issuance
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi services certi of issuance.
	 *
	 * @param userUuid the user uuid of this osi services certi of issuance
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
	protected OSIServicesCertiOfIssuanceWrapper wrap(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		return new OSIServicesCertiOfIssuanceWrapper(
			osiServicesCertiOfIssuance);
	}

}