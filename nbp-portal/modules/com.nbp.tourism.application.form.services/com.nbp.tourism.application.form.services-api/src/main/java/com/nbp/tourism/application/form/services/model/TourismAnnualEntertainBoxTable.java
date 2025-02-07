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
 * The table class for the &quot;nbp_tourism_enter_box_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismAnnualEntertainBox
 * @generated
 */
public class TourismAnnualEntertainBoxTable
	extends BaseTable<TourismAnnualEntertainBoxTable> {

	public static final TourismAnnualEntertainBoxTable INSTANCE =
		new TourismAnnualEntertainBoxTable();

	public final Column<TourismAnnualEntertainBoxTable, Long>
		tourismAnnualEntertainBoxId = createColumn(
			"tourismAnnualEntertainBoxId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismAnnualEntertainBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, String> service =
		createColumn(
			"service", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, String> local =
		createColumn("local", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, String> foreign =
		createColumn(
			"foreign_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, String> enterCounter =
		createColumn(
			"enterCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismAnnualEntertainBoxTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismAnnualEntertainBoxTable() {
		super("nbp_tourism_enter_box_add", TourismAnnualEntertainBoxTable::new);
	}

}