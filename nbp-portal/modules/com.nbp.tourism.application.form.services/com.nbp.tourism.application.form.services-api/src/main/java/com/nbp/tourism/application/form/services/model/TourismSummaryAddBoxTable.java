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
 * The table class for the &quot;nbp_tourism_summary_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismSummaryAddBox
 * @generated
 */
public class TourismSummaryAddBoxTable
	extends BaseTable<TourismSummaryAddBoxTable> {

	public static final TourismSummaryAddBoxTable INSTANCE =
		new TourismSummaryAddBoxTable();

	public final Column<TourismSummaryAddBoxTable, Long> tourismSummaryBoxId =
		createColumn(
			"tourismSummaryBoxId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismSummaryAddBoxTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, String> dealer =
		createColumn(
			"dealer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, String> numberOfvehicles =
		createColumn(
			"numberOfvehicles", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, String> year = createColumn(
		"year", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, String> type = createColumn(
		"type_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, String> ccRating =
		createColumn(
			"ccRating", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, String> counterSummary =
		createColumn(
			"counterSummary", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismSummaryAddBoxTable, Long> tourismApplicationId =
		createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismSummaryAddBoxTable() {
		super("nbp_tourism_summary_box", TourismSummaryAddBoxTable::new);
	}

}