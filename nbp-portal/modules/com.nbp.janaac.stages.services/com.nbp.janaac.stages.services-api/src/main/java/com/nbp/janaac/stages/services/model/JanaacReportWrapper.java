/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JanaacReport}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacReport
 * @generated
 */
public class JanaacReportWrapper
	extends BaseModelWrapper<JanaacReport>
	implements JanaacReport, ModelWrapper<JanaacReport> {

	public JanaacReportWrapper(JanaacReport janaacReport) {
		super(janaacReport);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("janaacReportId", getJanaacReportId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dateOfReport", getDateOfReport());
		attributes.put("report", getReport());
		attributes.put("caseId", getCaseId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long janaacReportId = (Long)attributes.get("janaacReportId");

		if (janaacReportId != null) {
			setJanaacReportId(janaacReportId);
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

		Date dateOfReport = (Date)attributes.get("dateOfReport");

		if (dateOfReport != null) {
			setDateOfReport(dateOfReport);
		}

		String report = (String)attributes.get("report");

		if (report != null) {
			setReport(report);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}
	}

	@Override
	public JanaacReport cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this janaac report.
	 *
	 * @return the case ID of this janaac report
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this janaac report.
	 *
	 * @return the company ID of this janaac report
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this janaac report.
	 *
	 * @return the create date of this janaac report
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of report of this janaac report.
	 *
	 * @return the date of report of this janaac report
	 */
	@Override
	public Date getDateOfReport() {
		return model.getDateOfReport();
	}

	/**
	 * Returns the group ID of this janaac report.
	 *
	 * @return the group ID of this janaac report
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac report ID of this janaac report.
	 *
	 * @return the janaac report ID of this janaac report
	 */
	@Override
	public long getJanaacReportId() {
		return model.getJanaacReportId();
	}

	/**
	 * Returns the modified date of this janaac report.
	 *
	 * @return the modified date of this janaac report
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this janaac report.
	 *
	 * @return the primary key of this janaac report
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the report of this janaac report.
	 *
	 * @return the report of this janaac report
	 */
	@Override
	public String getReport() {
		return model.getReport();
	}

	/**
	 * Returns the user ID of this janaac report.
	 *
	 * @return the user ID of this janaac report
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this janaac report.
	 *
	 * @return the user name of this janaac report
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this janaac report.
	 *
	 * @return the user uuid of this janaac report
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
	 * Sets the case ID of this janaac report.
	 *
	 * @param caseId the case ID of this janaac report
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this janaac report.
	 *
	 * @param companyId the company ID of this janaac report
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this janaac report.
	 *
	 * @param createDate the create date of this janaac report
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of report of this janaac report.
	 *
	 * @param dateOfReport the date of report of this janaac report
	 */
	@Override
	public void setDateOfReport(Date dateOfReport) {
		model.setDateOfReport(dateOfReport);
	}

	/**
	 * Sets the group ID of this janaac report.
	 *
	 * @param groupId the group ID of this janaac report
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac report ID of this janaac report.
	 *
	 * @param janaacReportId the janaac report ID of this janaac report
	 */
	@Override
	public void setJanaacReportId(long janaacReportId) {
		model.setJanaacReportId(janaacReportId);
	}

	/**
	 * Sets the modified date of this janaac report.
	 *
	 * @param modifiedDate the modified date of this janaac report
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this janaac report.
	 *
	 * @param primaryKey the primary key of this janaac report
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the report of this janaac report.
	 *
	 * @param report the report of this janaac report
	 */
	@Override
	public void setReport(String report) {
		model.setReport(report);
	}

	/**
	 * Sets the user ID of this janaac report.
	 *
	 * @param userId the user ID of this janaac report
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this janaac report.
	 *
	 * @param userName the user name of this janaac report
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this janaac report.
	 *
	 * @param userUuid the user uuid of this janaac report
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
	protected JanaacReportWrapper wrap(JanaacReport janaacReport) {
		return new JanaacReportWrapper(janaacReport);
	}

}