/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_org_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrgDetailInfo
 * @generated
 */
public class NcbjOrgDetailInfoTable extends BaseTable<NcbjOrgDetailInfoTable> {

	public static final NcbjOrgDetailInfoTable INSTANCE =
		new NcbjOrgDetailInfoTable();

	public final Column<NcbjOrgDetailInfoTable, Long> ncbjOrgDetailInfoId =
		createColumn(
			"ncbjOrgDetailInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjOrgDetailInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> newCompanyName =
		createColumn(
			"newCompanyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyEmail =
		createColumn(
			"companyEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> mailingAddress =
		createColumn(
			"mailingAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> city = createColumn(
		"city", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> postalCode =
		createColumn(
			"postalCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> country = createColumn(
		"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> physicalAddress =
		createColumn(
			"physicalAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> physicalCity =
		createColumn(
			"physicalCity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> physicalPostalCode =
		createColumn(
			"physicalPostalCode", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> physicalCountry =
		createColumn(
			"physicalCountry", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyHead =
		createColumn(
			"companyHead", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyTitle =
		createColumn(
			"companyTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyContact =
		createColumn(
			"companyContact", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyContactTitle =
		createColumn(
			"companyContactTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyTelephone =
		createColumn(
			"companyTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyFax =
		createColumn(
			"companyFax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyWebsite =
		createColumn(
			"companyWebsite", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> certificationScope =
		createColumn(
			"certificationScope", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> manageAccessToAuditDet =
		createColumn(
			"manageAccessToAuditDet", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> keyActivity =
		createColumn(
			"keyActivity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> transferReason =
		createColumn(
			"transferReason", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> indicateStandard =
		createColumn(
			"indicateStandard", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> ceritificationBodyName =
		createColumn(
			"ceritificationBodyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> consultingFirm =
		createColumn(
			"consultingFirm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> consultant =
		createColumn(
			"consultant", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String>
		certificationScopeRadio = createColumn(
			"certificationScopeRadio", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> outsourceProcess =
		createColumn(
			"outsourceProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> relevantRequirement =
		createColumn(
			"relevantRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String>
		relevantRequirementList = createColumn(
			"relevantRequirementList", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String>
		managementAccessToAudit = createColumn(
			"managementAccessToAudit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> pleaseManageDetail =
		createColumn(
			"pleaseManageDetail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> desiredCertification =
		createColumn(
			"desiredCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> surveillanceSchedule =
		createColumn(
			"surveillanceSchedule", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> certifiedManagement =
		createColumn(
			"certifiedManagement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String>
		certifiedAccreditedCerti = createColumn(
			"certifiedAccreditedCerti", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, String> companyUsedConsulting =
		createColumn(
			"companyUsedConsulting", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrgDetailInfoTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjOrgDetailInfoTable() {
		super("nbp_ncbj_org_detail", NcbjOrgDetailInfoTable::new);
	}

}