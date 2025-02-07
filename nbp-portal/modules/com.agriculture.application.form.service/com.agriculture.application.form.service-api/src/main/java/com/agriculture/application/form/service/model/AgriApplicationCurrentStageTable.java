/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_agriculture_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgriApplicationCurrentStage
 * @generated
 */
public class AgriApplicationCurrentStageTable
	extends BaseTable<AgriApplicationCurrentStageTable> {

	public static final AgriApplicationCurrentStageTable INSTANCE =
		new AgriApplicationCurrentStageTable();

	public final Column<AgriApplicationCurrentStageTable, Long>
		agriApplicationCurrentStageId = createColumn(
			"agriApplicationCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgriApplicationCurrentStageTable, Long>
		agricultureStageId = createColumn(
			"agricultureStageId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AgriApplicationCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriApplicationCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriApplicationCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriApplicationCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriApplicationCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriApplicationCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriApplicationCurrentStageTable, String>
		lastFormStage = createColumn(
			"lastFormStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriApplicationCurrentStageTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgriApplicationCurrentStageTable() {
		super("nbp_agriculture_stage", AgriApplicationCurrentStageTable::new);
	}

}