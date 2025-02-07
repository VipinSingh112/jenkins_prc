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
 * The table class for the &quot;nbp_tourism_attr_empl&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionEmployeeInfo
 * @generated
 */
public class TourismBonaAttractionEmployeeInfoTable
	extends BaseTable<TourismBonaAttractionEmployeeInfoTable> {

	public static final TourismBonaAttractionEmployeeInfoTable INSTANCE =
		new TourismBonaAttractionEmployeeInfoTable();

	public final Column<TourismBonaAttractionEmployeeInfoTable, Long>
		tourismBonaAttrEmpId = createColumn(
			"tourismBonaAttrEmpId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAttractionEmployeeInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		actualPermanent = createColumn(
			"actualPermanent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		actualTemporary = createColumn(
			"actualTemporary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		actualForeign = createColumn(
			"actualForeign", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		actualLocal = createColumn(
			"actualLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		actualPayroll = createColumn(
			"actualPayroll", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		projectedPermanent = createColumn(
			"projectedPermanent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		projectedTemporary = createColumn(
			"projectedTemporary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		projectedForeign = createColumn(
			"projectedForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		projectedLocal = createColumn(
			"projectedLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, String>
		projectedPayroll = createColumn(
			"projectedPayroll", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionEmployeeInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAttractionEmployeeInfoTable() {
		super(
			"nbp_tourism_attr_empl",
			TourismBonaAttractionEmployeeInfoTable::new);
	}

}