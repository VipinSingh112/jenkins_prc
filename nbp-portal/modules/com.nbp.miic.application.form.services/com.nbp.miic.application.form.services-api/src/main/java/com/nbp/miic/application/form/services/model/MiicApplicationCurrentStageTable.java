/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_miic_app_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationCurrentStage
 * @generated
 */
public class MiicApplicationCurrentStageTable
	extends BaseTable<MiicApplicationCurrentStageTable> {

	public static final MiicApplicationCurrentStageTable INSTANCE =
		new MiicApplicationCurrentStageTable();

	public final Column<MiicApplicationCurrentStageTable, Long>
		miicApplicationCurrentStageId = createColumn(
			"miicApplicationCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiicApplicationCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicApplicationCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicApplicationCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicApplicationCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicationCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicApplicationCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicApplicationCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicationCurrentStageTable, String> lastFormStep =
		createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicationCurrentStageTable, Long>
		miicApplicationId = createColumn(
			"miicApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MiicApplicationCurrentStageTable() {
		super("nbp_miic_app_stage", MiicApplicationCurrentStageTable::new);
	}

}