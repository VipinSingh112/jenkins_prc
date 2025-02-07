/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_mining_due_dili&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDueDiligence
 * @generated
 */
public class MiningApplicationDueDiligenceTable
	extends BaseTable<MiningApplicationDueDiligenceTable> {

	public static final MiningApplicationDueDiligenceTable INSTANCE =
		new MiningApplicationDueDiligenceTable();

	public final Column<MiningApplicationDueDiligenceTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, Long>
		miningDueDiliId = createColumn(
			"miningDueDiliId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MiningApplicationDueDiligenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, String> agencyName =
		createColumn(
			"agencyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, String>
		feedbackReceived = createColumn(
			"feedbackReceived", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationDueDiligenceTable, String>
		isSubToAgency = createColumn(
			"isSubToAgency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MiningApplicationDueDiligenceTable() {
		super("nbp_mining_due_dili", MiningApplicationDueDiligenceTable::new);
	}

}