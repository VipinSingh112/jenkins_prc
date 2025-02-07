/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_factories_current_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesRegstCurrentStage
 * @generated
 */
public class FactoriesRegstCurrentStageTable
	extends BaseTable<FactoriesRegstCurrentStageTable> {

	public static final FactoriesRegstCurrentStageTable INSTANCE =
		new FactoriesRegstCurrentStageTable();

	public final Column<FactoriesRegstCurrentStageTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, Long>
		factoriesCurrentStageId = createColumn(
			"factoriesCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FactoriesRegstCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, String> lastFormStep =
		createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesRegstCurrentStageTable, Long>
		factoriesApplicationId = createColumn(
			"factoriesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FactoriesRegstCurrentStageTable() {
		super(
			"nbp_factories_current_stage",
			FactoriesRegstCurrentStageTable::new);
	}

}