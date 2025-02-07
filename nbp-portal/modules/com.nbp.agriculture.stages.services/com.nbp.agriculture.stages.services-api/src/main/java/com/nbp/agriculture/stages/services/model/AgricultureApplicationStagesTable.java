/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_agriculture_app_stages&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationStages
 * @generated
 */
public class AgricultureApplicationStagesTable
	extends BaseTable<AgricultureApplicationStagesTable> {

	public static final AgricultureApplicationStagesTable INSTANCE =
		new AgricultureApplicationStagesTable();

	public final Column<AgricultureApplicationStagesTable, Long>
		agricultureApplicationstageId = createColumn(
			"agricultureApplicationstageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultureApplicationStagesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, String> stageName =
		createColumn(
			"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, String> duration =
		createColumn(
			"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, String> stageStatus =
		createColumn(
			"stageStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, Date>
		stageStartDate = createColumn(
			"stageStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, Date> stageEndDate =
		createColumn(
			"stageEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationStagesTable, String>
		updatedBySource = createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private AgricultureApplicationStagesTable() {
		super(
			"nbp_agriculture_app_stages",
			AgricultureApplicationStagesTable::new);
	}

}