/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_app_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationCurrentStage
 * @generated
 */
public class SezStatusApplicationCurrentStageTable
	extends BaseTable<SezStatusApplicationCurrentStageTable> {

	public static final SezStatusApplicationCurrentStageTable INSTANCE =
		new SezStatusApplicationCurrentStageTable();

	public final Column<SezStatusApplicationCurrentStageTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, Long>
		sezStageId = createColumn(
			"sezStageId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezStatusApplicationCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, String>
		currentStage = createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, String>
		lastFormStep = createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusApplicationCurrentStageTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezStatusApplicationCurrentStageTable() {
		super("nbp_sez_app_stage", SezStatusApplicationCurrentStageTable::new);
	}

}