/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_explosives_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesCurrentStage
 * @generated
 */
public class ExplosivesCurrentStageTable
	extends BaseTable<ExplosivesCurrentStageTable> {

	public static final ExplosivesCurrentStageTable INSTANCE =
		new ExplosivesCurrentStageTable();

	public final Column<ExplosivesCurrentStageTable, Long> explosiveStageId =
		createColumn(
			"explosiveStageId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ExplosivesCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosivesCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosivesCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosivesCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosivesCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosivesCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosivesCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosivesCurrentStageTable, String>
		lastFormDetailsStep = createColumn(
			"lastFormDetailsStep", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ExplosivesCurrentStageTable, Long>
		explosivesApplicationId = createColumn(
			"explosivesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ExplosivesCurrentStageTable() {
		super("nbp_explosives_stage", ExplosivesCurrentStageTable::new);
	}

}