/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_healthcare_duediligence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligence
 * @generated
 */
public class HealthCareDueDiligenceTable
	extends BaseTable<HealthCareDueDiligenceTable> {

	public static final HealthCareDueDiligenceTable INSTANCE =
		new HealthCareDueDiligenceTable();

	public final Column<HealthCareDueDiligenceTable, Long> healthDDId =
		createColumn(
			"healthDDId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HealthCareDueDiligenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, Date> dateSubmittedAgency =
		createColumn(
			"dateSubmittedAgency ", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, String> nameofAgency =
		createColumn(
			"nameofAgency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, String> agencyDecision =
		createColumn(
			"agencyDecision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, String>
		reasonForObejction = createColumn(
			"reasonForObejction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, String> durationOfPeriod =
		createColumn(
			"durationOfPeriod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, Date> date = createColumn(
		"date_", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, Date> feedbackReceived =
		createColumn(
			"feedbackReceived", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareDueDiligenceTable, String> Status =
		createColumn(
			"Status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private HealthCareDueDiligenceTable() {
		super("nbp_healthcare_duediligence", HealthCareDueDiligenceTable::new);
	}

}