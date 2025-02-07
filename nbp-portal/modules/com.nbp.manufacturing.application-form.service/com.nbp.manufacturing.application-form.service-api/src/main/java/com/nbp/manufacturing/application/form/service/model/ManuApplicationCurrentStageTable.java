/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacture_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuApplicationCurrentStage
 * @generated
 */
public class ManuApplicationCurrentStageTable
	extends BaseTable<ManuApplicationCurrentStageTable> {

	public static final ManuApplicationCurrentStageTable INSTANCE =
		new ManuApplicationCurrentStageTable();

	public final Column<ManuApplicationCurrentStageTable, Long>
		manuApplicationCuurentStageId = createColumn(
			"manuApplicationCuurentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManuApplicationCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuApplicationCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuApplicationCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuApplicationCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuApplicationCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuApplicationCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuApplicationCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuApplicationCurrentStageTable, String>
		lastFormDetailsStep = createColumn(
			"lastFormDetailsStep", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuApplicationCurrentStageTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ManuApplicationCurrentStageTable() {
		super("nbp_manufacture_stage", ManuApplicationCurrentStageTable::new);
	}

}