/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_app_duediligence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationDueDiligence
 * @generated
 */
public class HSRAApplicationDueDiligenceTable
	extends BaseTable<HSRAApplicationDueDiligenceTable> {

	public static final HSRAApplicationDueDiligenceTable INSTANCE =
		new HSRAApplicationDueDiligenceTable();

	public final Column<HSRAApplicationDueDiligenceTable, Long> hsraAppDDId =
		createColumn(
			"hsraAppDDId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HSRAApplicationDueDiligenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String>
		transactionNumber = createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String> entityName =
		createColumn(
			"entityName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Date>
		dateOfApplication = createColumn(
			"dateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String>
		agencyContactName = createColumn(
			"agencyContactName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String>
		agencyEmailAddress = createColumn(
			"agencyEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String>
		licenseNumber = createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String> agencyName =
		createColumn(
			"agencyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Date>
		submittedToAgencyDate = createColumn(
			"submittedToAgencyDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Date>
		feedbackReceivedDate = createColumn(
			"feedbackReceivedDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String>
		feedbackReceived = createColumn(
			"feedbackReceived", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Date> deadlineDate =
		createColumn(
			"deadlineDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, Long>
		hsraApplicationId = createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String>
		updatedBySource = createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String>
		durationOfTimeSpent = createColumn(
			"durationOfTimeSpent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String>
		agencyDecision = createColumn(
			"agencyDecision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationDueDiligenceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private HSRAApplicationDueDiligenceTable() {
		super(
			"nbp_hsra_app_duediligence", HSRAApplicationDueDiligenceTable::new);
	}

}