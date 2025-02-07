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
 * The table class for the &quot;nbp_tourism_new_attrac_emp&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionEmployeeInfo
 * @generated
 */
public class TourismNewAttractionEmployeeInfoTable
	extends BaseTable<TourismNewAttractionEmployeeInfoTable> {

	public static final TourismNewAttractionEmployeeInfoTable INSTANCE =
		new TourismNewAttractionEmployeeInfoTable();

	public final Column<TourismNewAttractionEmployeeInfoTable, Long>
		tourismNewAttractionEmploId = createColumn(
			"tourismNewAttractionEmploId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAttractionEmployeeInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		actualPermanent = createColumn(
			"actualPermanent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		actualTemporary = createColumn(
			"actualTemporary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		actualForeign = createColumn(
			"actualForeign", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		actualLocal = createColumn(
			"actualLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		actualPayroll = createColumn(
			"actualPayroll", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		projectedPermanent = createColumn(
			"projectedPermanent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		projectedTemporary = createColumn(
			"projectedTemporary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		projectedForeign = createColumn(
			"projectedForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		projectedLocal = createColumn(
			"projectedLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, String>
		projectedPayroll = createColumn(
			"projectedPayroll", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionEmployeeInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAttractionEmployeeInfoTable() {
		super(
			"nbp_tourism_new_attrac_emp",
			TourismNewAttractionEmployeeInfoTable::new);
	}

}