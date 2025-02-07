/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_explosive_app_stages&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveApplicationStages
 * @generated
 */
public class ExplosiveApplicationStagesTable
	extends BaseTable<ExplosiveApplicationStagesTable> {

	public static final ExplosiveApplicationStagesTable INSTANCE =
		new ExplosiveApplicationStagesTable();

	public final Column<ExplosiveApplicationStagesTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, Long>
		expApplicationStagesId = createColumn(
			"expApplicationStagesId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ExplosiveApplicationStagesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, String> stageName =
		createColumn(
			"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, String> duration =
		createColumn(
			"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, String> stageStatus =
		createColumn(
			"stageStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, Date> stageStartDate =
		createColumn(
			"stageStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, Date> stageEndDate =
		createColumn(
			"stageEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, Long>
		explosiveApplicationId = createColumn(
			"explosiveApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveApplicationStagesTable, String>
		updatedBySource = createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private ExplosiveApplicationStagesTable() {
		super("nbp_explosive_app_stages", ExplosiveApplicationStagesTable::new);
	}

}