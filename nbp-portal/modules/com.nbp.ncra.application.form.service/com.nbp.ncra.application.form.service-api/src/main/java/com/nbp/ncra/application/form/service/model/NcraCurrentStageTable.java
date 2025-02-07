/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncra_current_stages&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcraCurrentStage
 * @generated
 */
public class NcraCurrentStageTable extends BaseTable<NcraCurrentStageTable> {

	public static final NcraCurrentStageTable INSTANCE =
		new NcraCurrentStageTable();

	public final Column<NcraCurrentStageTable, Long> ncraCurrentStageId =
		createColumn(
			"ncraCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcraCurrentStageTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraCurrentStageTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraCurrentStageTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraCurrentStageTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraCurrentStageTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraCurrentStageTable, String> lastFormStepDetails =
		createColumn(
			"lastFormStepDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraCurrentStageTable, Long> ncraApplicationId =
		createColumn(
			"ncraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcraCurrentStageTable() {
		super("nbp_ncra_current_stages", NcraCurrentStageTable::new);
	}

}