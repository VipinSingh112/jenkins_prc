/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_current_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationCurrentStage
 * @generated
 */
public class CreativeApplicationCurrentStageTable
	extends BaseTable<CreativeApplicationCurrentStageTable> {

	public static final CreativeApplicationCurrentStageTable INSTANCE =
		new CreativeApplicationCurrentStageTable();

	public final Column<CreativeApplicationCurrentStageTable, Long>
		creativeAppliCurrentStageId = createColumn(
			"creativeAppliCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeApplicationCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationCurrentStageTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationCurrentStageTable, String>
		currentStage = createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationCurrentStageTable, String>
		lastFormStep = createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationCurrentStageTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeApplicationCurrentStageTable() {
		super(
			"nbp_creative_current_stage",
			CreativeApplicationCurrentStageTable::new);
	}

}