/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_fire_app_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppliCurrentStage
 * @generated
 */
public class FireBrigadeAppliCurrentStageTable
	extends BaseTable<FireBrigadeAppliCurrentStageTable> {

	public static final FireBrigadeAppliCurrentStageTable INSTANCE =
		new FireBrigadeAppliCurrentStageTable();

	public final Column<FireBrigadeAppliCurrentStageTable, Long>
		fireBrigadeAppliCurrentStageId = createColumn(
			"fireBrigadeAppliCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadeAppliCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeAppliCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeAppliCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeAppliCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeAppliCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeAppliCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeAppliCurrentStageTable, String>
		currentStage = createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeAppliCurrentStageTable, String>
		lastFormStep = createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeAppliCurrentStageTable, Long>
		fireBrigadeApplicationId = createColumn(
			"fireBrigadeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FireBrigadeAppliCurrentStageTable() {
		super("nbp_fire_app_stage", FireBrigadeAppliCurrentStageTable::new);
	}

}