/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationCurrentStage
 * @generated
 */
public class TourismApplicationCurrentStageTable
	extends BaseTable<TourismApplicationCurrentStageTable> {

	public static final TourismApplicationCurrentStageTable INSTANCE =
		new TourismApplicationCurrentStageTable();

	public final Column<TourismApplicationCurrentStageTable, Long>
		tourismAppliCurrentStageId = createColumn(
			"tourismAppliCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismApplicationCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationCurrentStageTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationCurrentStageTable, String>
		currentStage = createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationCurrentStageTable, String>
		lastFormStep = createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationCurrentStageTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismApplicationCurrentStageTable() {
		super("nbp_tourism_stage", TourismApplicationCurrentStageTable::new);
	}

}