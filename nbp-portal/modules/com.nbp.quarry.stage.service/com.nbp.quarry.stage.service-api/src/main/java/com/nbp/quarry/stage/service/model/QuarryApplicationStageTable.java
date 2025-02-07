/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_app_stag&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationStage
 * @generated
 */
public class QuarryApplicationStageTable
	extends BaseTable<QuarryApplicationStageTable> {

	public static final QuarryApplicationStageTable INSTANCE =
		new QuarryApplicationStageTable();

	public final Column<QuarryApplicationStageTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, Long> quarryAppStagesId =
		createColumn(
			"quarryAppStagesId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QuarryApplicationStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, String> stageName =
		createColumn(
			"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, String> duration =
		createColumn(
			"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, String> stageStatus =
		createColumn(
			"stageStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, Date> stageStartDate =
		createColumn(
			"stageStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, Date> stageEndDate =
		createColumn(
			"stageEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, Long> quarryApplicationId =
		createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationStageTable, String> updateBySource =
		createColumn(
			"updateBySource", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private QuarryApplicationStageTable() {
		super("nbp_quarry_app_stag", QuarryApplicationStageTable::new);
	}

}