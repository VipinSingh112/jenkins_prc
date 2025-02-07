/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryCurrentStage
 * @generated
 */
public class QuarryCurrentStageTable
	extends BaseTable<QuarryCurrentStageTable> {

	public static final QuarryCurrentStageTable INSTANCE =
		new QuarryCurrentStageTable();

	public final Column<QuarryCurrentStageTable, Long> auarryStageId =
		createColumn(
			"auarryStageId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QuarryCurrentStageTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryCurrentStageTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryCurrentStageTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryCurrentStageTable, String> lastFormDetailsStep =
		createColumn(
			"lastFormDetailsStep", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryCurrentStageTable, Long> quarryApplicationId =
		createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private QuarryCurrentStageTable() {
		super("nbp_quarry_stage", QuarryCurrentStageTable::new);
	}

}