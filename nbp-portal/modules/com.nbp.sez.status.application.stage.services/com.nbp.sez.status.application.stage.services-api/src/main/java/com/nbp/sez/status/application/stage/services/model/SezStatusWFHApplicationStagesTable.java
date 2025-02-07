/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_status_wfh_app_stages&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFHApplicationStages
 * @generated
 */
public class SezStatusWFHApplicationStagesTable
	extends BaseTable<SezStatusWFHApplicationStagesTable> {

	public static final SezStatusWFHApplicationStagesTable INSTANCE =
		new SezStatusWFHApplicationStagesTable();

	public final Column<SezStatusWFHApplicationStagesTable, Long>
		sezWFHAppStagesId = createColumn(
			"sezWFHAppStagesId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezStatusWFHApplicationStagesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, String> stageName =
		createColumn(
			"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, String> duration =
		createColumn(
			"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, String>
		stageStatus = createColumn(
			"stageStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, Date>
		stageStartDate = createColumn(
			"stageStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, Date> stageEndDate =
		createColumn(
			"stageEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusWFHApplicationStagesTable, String>
		updatedBySource = createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private SezStatusWFHApplicationStagesTable() {
		super(
			"nbp_sez_status_wfh_app_stages",
			SezStatusWFHApplicationStagesTable::new);
	}

}