/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_app_duediligence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationDueDiligence
 * @generated
 */
public class PharmaApplicationDueDiligenceTable
	extends BaseTable<PharmaApplicationDueDiligenceTable> {

	public static final PharmaApplicationDueDiligenceTable INSTANCE =
		new PharmaApplicationDueDiligenceTable();

	public final Column<PharmaApplicationDueDiligenceTable, Long>
		pharmaAppDDId = createColumn(
			"pharmaAppDDId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PharmaApplicationDueDiligenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String>
		transactionNumber = createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String> entityName =
		createColumn(
			"entityName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Date>
		dateOfApplication = createColumn(
			"dateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String>
		agencyContactName = createColumn(
			"agencyContactName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String>
		agencyEmailAddress = createColumn(
			"agencyEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String>
		licenseNumber = createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String> agencyName =
		createColumn(
			"agencyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Date>
		submittedToAgencyDate = createColumn(
			"submittedToAgencyDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Date>
		feedbackReceivedDate = createColumn(
			"feedbackReceivedDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Date> deadlineDate =
		createColumn(
			"deadlineDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, Long>
		pharmaApplicationId = createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String>
		updatedBySource = createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String>
		durationOfTimeSpent = createColumn(
			"durationOfTimeSpent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String>
		agencyDecision = createColumn(
			"agencyDecision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationDueDiligenceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private PharmaApplicationDueDiligenceTable() {
		super(
			"nbp_pharma_app_duediligence",
			PharmaApplicationDueDiligenceTable::new);
	}

}