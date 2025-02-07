/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_current_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCurrentStage
 * @generated
 */
public class PharmaCurrentStageTable
	extends BaseTable<PharmaCurrentStageTable> {

	public static final PharmaCurrentStageTable INSTANCE =
		new PharmaCurrentStageTable();

	public final Column<PharmaCurrentStageTable, Long> pharmaCurrentStageId =
		createColumn(
			"pharmaCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaCurrentStageTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaCurrentStageTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaCurrentStageTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaCurrentStageTable, String> lastFormStage =
		createColumn(
			"lastFormStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaCurrentStageTable, Long> pharmaApplicationId =
		createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PharmaCurrentStageTable() {
		super("nbp_pharma_current_stage", PharmaCurrentStageTable::new);
	}

}