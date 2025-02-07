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
 * The table class for the &quot;nbp_tourism_bona_water_emp&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportEmployeeInfo
 * @generated
 */
public class TourismBonaWaterSportEmployeeInfoTable
	extends BaseTable<TourismBonaWaterSportEmployeeInfoTable> {

	public static final TourismBonaWaterSportEmployeeInfoTable INSTANCE =
		new TourismBonaWaterSportEmployeeInfoTable();

	public final Column<TourismBonaWaterSportEmployeeInfoTable, Long>
		tourismBonaWSEmplId = createColumn(
			"tourismBonaWSEmplId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		actualPermanent = createColumn(
			"actualPermanent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		actualTemporary = createColumn(
			"actualTemporary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		actualForeign = createColumn(
			"actualForeign", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		actualLocal = createColumn(
			"actualLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		actualPayroll = createColumn(
			"actualPayroll", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		projectedPermanent = createColumn(
			"projectedPermanent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		projectedTemporary = createColumn(
			"projectedTemporary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		projectedForeign = createColumn(
			"projectedForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		projectedLocal = createColumn(
			"projectedLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, String>
		projectedPayroll = createColumn(
			"projectedPayroll", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportEmployeeInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaWaterSportEmployeeInfoTable() {
		super(
			"nbp_tourism_bona_water_emp",
			TourismBonaWaterSportEmployeeInfoTable::new);
	}

}