/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_current_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiCurrentStage
 * @generated
 */
public class OsiCurrentStageTable extends BaseTable<OsiCurrentStageTable> {

	public static final OsiCurrentStageTable INSTANCE =
		new OsiCurrentStageTable();

	public final Column<OsiCurrentStageTable, Long> osiCurrentStageId =
		createColumn(
			"osiCurrentStageId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiCurrentStageTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiCurrentStageTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiCurrentStageTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiCurrentStageTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiCurrentStageTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiCurrentStageTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiCurrentStageTable, String> lastFormStep =
		createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiCurrentStageTable, Long> osiApplicationId =
		createColumn(
			"osiApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiCurrentStageTable() {
		super("nbp_osi_current_stage", OsiCurrentStageTable::new);
	}

}