/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacturing_app_stages&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStages
 * @generated
 */
public class ManufacturingApplicationStagesTable
	extends BaseTable<ManufacturingApplicationStagesTable> {

	public static final ManufacturingApplicationStagesTable INSTANCE =
		new ManufacturingApplicationStagesTable();

	public final Column<ManufacturingApplicationStagesTable, Long>
		manufacturingAppStagesId = createColumn(
			"manufacturingAppStagesId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManufacturingApplicationStagesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, String> stageName =
		createColumn(
			"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, String> duration =
		createColumn(
			"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, String>
		stageStatus = createColumn(
			"stageStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, Date>
		stageStartDate = createColumn(
			"stageStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, Date>
		stageEndDate = createColumn(
			"stageEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationStagesTable, String>
		updateBySource = createColumn(
			"updateBySource", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ManufacturingApplicationStagesTable() {
		super(
			"nbp_manufacturing_app_stages",
			ManufacturingApplicationStagesTable::new);
	}

}