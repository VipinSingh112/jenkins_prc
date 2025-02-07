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
 * This class is a wrapper for {@link OsiServiceIssuanceOfReport}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServiceIssuanceOfReport
 * @generated
 */
public class OsiServiceIssuanceOfReportWrapper
	extends BaseModelWrapper<OsiServiceIssuanceOfReport>
	implements ModelWrapper<OsiServiceIssuanceOfReport>,
			   OsiServiceIssuanceOfReport {

	public OsiServiceIssuanceOfReportWrapper(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		super(osiServiceIssuanceOfReport);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"osiServiceIssuanceOfReportId", getOsiServiceIssuanceOfReportId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("dateOfReport", getDateOfReport());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("typeOfApplicant", getTypeOfApplicant());
		attributes.put("decision", getDecision());
		attributes.put("docFileEntry", getDocFileEntry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiServiceIssuanceOfReportId = (Long)attributes.get(
			"osiServiceIssuanceOfReportId");

		if (osiServiceIssuanceOfReportId != null) {
			setOsiServiceIssuanceOfReportId(osiServiceIssuanceOfReportId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Date dateOfReport = (Date)attributes.get("dateOfReport");

		if (dateOfReport != null) {
			setDateOfReport(dateOfReport);
		}

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String typeOfApplicant = (String)attributes.get("typeOfApplicant");

		if (typeOfApplicant != null) {
			setTypeOfApplicant(typeOfApplicant);
		}

		String decision = (String)attributes.get("decision");

		if (decision != null) {
			setDecision(decision);
		}

		Long docFileEntry = (Long)attributes.get("docFileEntry");

		if (docFileEntry != null) {
			setDocFileEntry(docFileEntry);
		}
	}

	@Override
	public OsiServiceIssuanceOfReport cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this osi service issuance of report.
	 *
	 * @return the case ID of this osi service issuance of report
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this osi service issuance of report.
	 *
	 * @return the company ID of this osi service issuance of report
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi service issuance of report.
	 *
	 * @return the create date of this osi service issuance of report
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of report of this osi service issuance of report.
	 *
	 * @return the date of report of this osi service issuance of report
	 */
	@Override
	public Date getDateOfReport() {
		return model.getDateOfReport();
	}

	/**
	 * Returns the decision of this osi service issuance of report.
	 *
	 * @return the decision of this osi service issuance of report
	 */
	@Override
	public String getDecision() {
		return model.getDecision();
	}

	/**
	 * Returns the doc file entry of this osi service issuance of report.
	 *
	 * @return the doc file entry of this osi service issuance of report
	 */
	@Override
	public long getDocFileEntry() {
		return model.getDocFileEntry();
	}

	/**
	 * Returns the group ID of this osi service issuance of report.
	 *
	 * @return the group ID of this osi service issuance of report
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi service issuance of report.
	 *
	 * @return the modified date of this osi service issuance of report
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this osi service issuance of report.
	 *
	 * @return the name of applicant of this osi service issuance of report
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the osi service issuance of report ID of this osi service issuance of report.
	 *
	 * @return the osi service issuance of report ID of this osi service issuance of report
	 */
	@Override
	public long getOsiServiceIssuanceOfReportId() {
		return model.getOsiServiceIssuanceOfReportId();
	}

	/**
	 * Returns the primary key of this osi service issuance of report.
	 *
	 * @return the primary key of this osi service issuance of report
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of applicant of this osi service issuance of report.
	 *
	 * @return the type of applicant of this osi service issuance of report
	 */
	@Override
	public String getTypeOfApplicant() {
		return model.getTypeOfApplicant();
	}

	/**
	 * Returns the user ID of this osi service issuance of report.
	 *
	 * @return the user ID of this osi service issuance of report
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi service issuance of report.
	 *
	 * @return the user name of this osi service issuance of report
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi service issuance of report.
	 *
	 * @return the user uuid of this osi service issuance of report
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
	 * Sets the case ID of this osi service issuance of report.
	 *
	 * @param caseId the case ID of this osi service issuance of report
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this osi service issuance of report.
	 *
	 * @param companyId the company ID of this osi service issuance of report
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi service issuance of report.
	 *
	 * @param createDate the create date of this osi service issuance of report
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of report of this osi service issuance of report.
	 *
	 * @param dateOfReport the date of report of this osi service issuance of report
	 */
	@Override
	public void setDateOfReport(Date dateOfReport) {
		model.setDateOfReport(dateOfReport);
	}

	/**
	 * Sets the decision of this osi service issuance of report.
	 *
	 * @param decision the decision of this osi service issuance of report
	 */
	@Override
	public void setDecision(String decision) {
		model.setDecision(decision);
	}

	/**
	 * Sets the doc file entry of this osi service issuance of report.
	 *
	 * @param docFileEntry the doc file entry of this osi service issuance of report
	 */
	@Override
	public void setDocFileEntry(long docFileEntry) {
		model.setDocFileEntry(docFileEntry);
	}

	/**
	 * Sets the group ID of this osi service issuance of report.
	 *
	 * @param groupId the group ID of this osi service issuance of report
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi service issuance of report.
	 *
	 * @param modifiedDate the modified date of this osi service issuance of report
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this osi service issuance of report.
	 *
	 * @param nameOfApplicant the name of applicant of this osi service issuance of report
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the osi service issuance of report ID of this osi service issuance of report.
	 *
	 * @param osiServiceIssuanceOfReportId the osi service issuance of report ID of this osi service issuance of report
	 */
	@Override
	public void setOsiServiceIssuanceOfReportId(
		long osiServiceIssuanceOfReportId) {

		model.setOsiServiceIssuanceOfReportId(osiServiceIssuanceOfReportId);
	}

	/**
	 * Sets the primary key of this osi service issuance of report.
	 *
	 * @param primaryKey the primary key of this osi service issuance of report
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of applicant of this osi service issuance of report.
	 *
	 * @param typeOfApplicant the type of applicant of this osi service issuance of report
	 */
	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		model.setTypeOfApplicant(typeOfApplicant);
	}

	/**
	 * Sets the user ID of this osi service issuance of report.
	 *
	 * @param userId the user ID of this osi service issuance of report
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi service issuance of report.
	 *
	 * @param userName the user name of this osi service issuance of report
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi service issuance of report.
	 *
	 * @param userUuid the user uuid of this osi service issuance of report
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
	protected OsiServiceIssuanceOfReportWrapper wrap(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		return new OsiServiceIssuanceOfReportWrapper(
			osiServiceIssuanceOfReport);
	}

}