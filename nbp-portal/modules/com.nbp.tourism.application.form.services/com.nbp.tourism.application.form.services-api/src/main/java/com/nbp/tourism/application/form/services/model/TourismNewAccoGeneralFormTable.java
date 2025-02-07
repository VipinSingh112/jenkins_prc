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
 * The table class for the &quot;nbp_tourism_new_acco_gerneral&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoGeneralForm
 * @generated
 */
public class TourismNewAccoGeneralFormTable
	extends BaseTable<TourismNewAccoGeneralFormTable> {

	public static final TourismNewAccoGeneralFormTable INSTANCE =
		new TourismNewAccoGeneralFormTable();

	public final Column<TourismNewAccoGeneralFormTable, Long>
		tourismNewAccoGenFormId = createColumn(
			"tourismNewAccoGenFormId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAccoGeneralFormTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, String>
		establishmentName = createColumn(
			"establishmentName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, String>
		accomadationRoom = createColumn(
			"accomadationRoom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, String> facilityDetail =
		createColumn(
			"facilityDetail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, String> hotelOperator =
		createColumn(
			"hotelOperator", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, String>
		offeredAccomadation = createColumn(
			"offeredAccomadation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, Date> constructionDate =
		createColumn(
			"constructionDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, Date> commenceDate =
		createColumn(
			"commenceDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoGeneralFormTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAccoGeneralFormTable() {
		super(
			"nbp_tourism_new_acco_gerneral",
			TourismNewAccoGeneralFormTable::new);
	}

}