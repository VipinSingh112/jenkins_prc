/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_app_duediligence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDueDiligence
 * @generated
 */
public class CannabisApplicationDueDiligenceTable
	extends BaseTable<CannabisApplicationDueDiligenceTable> {

	public static final CannabisApplicationDueDiligenceTable INSTANCE =
		new CannabisApplicationDueDiligenceTable();

	public final Column<CannabisApplicationDueDiligenceTable, Long>
		cannabisAppDDId = createColumn(
			"cannabisAppDDId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationDueDiligenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		transactionNumber = createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		entityName = createColumn(
			"entityName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Date>
		dateOfApplication = createColumn(
			"dateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		agencyContactName = createColumn(
			"agencyContactName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		agencyEmailAddress = createColumn(
			"agencyEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		licenseNumber = createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		agencyName = createColumn(
			"agencyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Date>
		submittedToAgencyDate = createColumn(
			"submittedToAgencyDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Date>
		feedbackReceivedDate = createColumn(
			"feedbackReceivedDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Date>
		deadlineDate = createColumn(
			"deadlineDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		updatedBySource = createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		statusOfAgencyLetter = createColumn(
			"statusOfAgencyLetter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String>
		agencyDecision = createColumn(
			"agencyDecision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationDueDiligenceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CannabisApplicationDueDiligenceTable() {
		super(
			"nbp_cannabis_app_duediligence",
			CannabisApplicationDueDiligenceTable::new);
	}

}