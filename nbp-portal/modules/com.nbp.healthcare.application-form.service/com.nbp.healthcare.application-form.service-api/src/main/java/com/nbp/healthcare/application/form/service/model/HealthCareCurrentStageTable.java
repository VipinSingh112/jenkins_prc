/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_healthcare_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareCurrentStage
 * @generated
 */
public class HealthCareCurrentStageTable
	extends BaseTable<HealthCareCurrentStageTable> {

	public static final HealthCareCurrentStageTable INSTANCE =
		new HealthCareCurrentStageTable();

	public final Column<HealthCareCurrentStageTable, Long>
		HealthCareCurrentStageId = createColumn(
			"HealthCareCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HealthCareCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareCurrentStageTable, String> lastFormStage =
		createColumn(
			"lastFormStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareCurrentStageTable, Long>
		healthCareApplicationId = createColumn(
			"healthCareApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private HealthCareCurrentStageTable() {
		super("nbp_healthcare_stage", HealthCareCurrentStageTable::new);
	}

}