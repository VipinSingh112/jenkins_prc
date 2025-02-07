/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_app_duediligence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationDueDiligence
 * @generated
 */
public class WRAApplicationDueDiligenceTable
	extends BaseTable<WRAApplicationDueDiligenceTable> {

	public static final WRAApplicationDueDiligenceTable INSTANCE =
		new WRAApplicationDueDiligenceTable();

	public final Column<WRAApplicationDueDiligenceTable, Long>
		wRAApplicationDueDiligenceId = createColumn(
			"wRAApplicationDueDiligenceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<WRAApplicationDueDiligenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String>
		transactionNumber = createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String> entityName =
		createColumn(
			"entityName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Date>
		dateOfApplication = createColumn(
			"dateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String>
		agencyContactName = createColumn(
			"agencyContactName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String>
		agencyEmailAddress = createColumn(
			"agencyEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String> licenseNumber =
		createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String> agencyName =
		createColumn(
			"agencyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Date>
		submittedToAgencyDate = createColumn(
			"submittedToAgencyDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Date>
		feedbackReceivedDate = createColumn(
			"feedbackReceivedDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String>
		feedbackReceived = createColumn(
			"feedbackReceived", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Date> deadlineDate =
		createColumn(
			"deadlineDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, Long>
		wraApplicationId = createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String>
		updatedBySource = createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String>
		durationOfTimeSpent = createColumn(
			"durationOfTimeSpent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String>
		agencyDecision = createColumn(
			"agencyDecision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationDueDiligenceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private WRAApplicationDueDiligenceTable() {
		super("nbp_wra_app_duediligence", WRAApplicationDueDiligenceTable::new);
	}

}