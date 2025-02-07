/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_current_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JTBCurrentStage
 * @generated
 */
public class JTBCurrentStageTable extends BaseTable<JTBCurrentStageTable> {

	public static final JTBCurrentStageTable INSTANCE =
		new JTBCurrentStageTable();

	public final Column<JTBCurrentStageTable, Long> jTBCurrentStageId =
		createColumn(
			"jTBCurrentStageId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<JTBCurrentStageTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBCurrentStageTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBCurrentStageTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBCurrentStageTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBCurrentStageTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBCurrentStageTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBCurrentStageTable, String> lastFormStep =
		createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBCurrentStageTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private JTBCurrentStageTable() {
		super("nbp_jtb_current_stage", JTBCurrentStageTable::new);
	}

}