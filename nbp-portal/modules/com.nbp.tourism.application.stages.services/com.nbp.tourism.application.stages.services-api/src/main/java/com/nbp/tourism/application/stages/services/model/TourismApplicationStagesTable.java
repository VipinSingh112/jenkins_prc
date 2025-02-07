/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_app_stages&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationStages
 * @generated
 */
public class TourismApplicationStagesTable
	extends BaseTable<TourismApplicationStagesTable> {

	public static final TourismApplicationStagesTable INSTANCE =
		new TourismApplicationStagesTable();

	public final Column<TourismApplicationStagesTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, Long>
		tourismApplicationStagesId = createColumn(
			"tourismApplicationStagesId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismApplicationStagesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, String> stageName =
		createColumn(
			"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, String> duration =
		createColumn(
			"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, String> stageStatus =
		createColumn(
			"stageStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, Date> stageStartDate =
		createColumn(
			"stageStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, Date> stageEndDate =
		createColumn(
			"stageEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationStagesTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private TourismApplicationStagesTable() {
		super("nbp_tourism_app_stages", TourismApplicationStagesTable::new);
	}

}